package l;

import android.text.TextUtils;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: B8J7 */
/* renamed from: l.ᩳ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18260 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56783;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56784;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f56785;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f56786;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f56787;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f56788;

    public C18260(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f56784 = i;
        this.f56788 = i2;
        this.f56783 = i3;
        this.f56787 = i4;
        this.f56785 = i5;
        this.f56786 = i6;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18260 m42596(String str) {
        char c;
        C22632.m50631(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String m35799 = C15107.m35799(split[i6].trim());
            m35799.getClass();
            switch (m35799.hashCode()) {
                case 100571:
                    if (m35799.equals("end")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3556653:
                    if (m35799.equals(TextBundle.TEXT_ENTRY)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 102749521:
                    if (m35799.equals("layer")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (m35799.equals("start")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (m35799.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case 3:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new C18260(i, i2, i3, i4, i5, split.length);
    }
}
