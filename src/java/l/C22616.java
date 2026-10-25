package l;

import android.graphics.Color;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: A924 */
/* renamed from: l.᩹᩻ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22616 extends AbstractC22800 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f73063;

    static {
        HashMap hashMap = new HashMap();
        f73063 = hashMap;
        hashMap.put("darkgray", -5658199);
        hashMap.put("gray", -8355712);
        hashMap.put("lightgray", -2894893);
        hashMap.put("darkgrey", -5658199);
        hashMap.put("grey", -8355712);
        C15942.m37720(hashMap, "lightgrey", -2894893, -16744448, "green");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50598(String str) {
        char c;
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case -1423461174:
                if (lowerCase.equals("accent")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -314765822:
                if (lowerCase.equals("primary")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3556653:
                if (lowerCase.equals(TextBundle.TEXT_ENTRY)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (lowerCase.equals(d.O)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1124446108:
                if (lowerCase.equals("warning")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1674318617:
                if (lowerCase.equals("divider")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1748283111:
                if (lowerCase.equals("textsecondary")) {
                    c = 6;
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
                return C21943.f70257;
            case 1:
                return C21943.f70274;
            case 2:
                return C21943.f70284;
            case 3:
                return C21943.f70293;
            case 4:
                return C21943.f70263;
            case 5:
                return C21943.f70283;
            case 6:
                return C21943.f70269;
            default:
                Integer num = (Integer) f73063.get(lowerCase);
                if (num != null) {
                    return num.intValue();
                }
                if (lowerCase.startsWith("#")) {
                    String substring = lowerCase.substring(1);
                    if (C9896.m24997(substring)) {
                        return C9896.m25001(substring);
                    }
                }
                if (Character.isLetter(lowerCase.charAt(0))) {
                    try {
                        return Color.parseColor(lowerCase);
                    } catch (IllegalArgumentException unused) {
                        return -1;
                    }
                }
                try {
                    return C15246.m36205(-1, lowerCase);
                } catch (NumberFormatException unused2) {
                    return -1;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0177  */
    @Override // l.AbstractC22800
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo5985(l.C18981 r8, l.InterfaceC14040 r9, l.InterfaceC15243 r10) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22616.mo5985(l.ᩴ᩶ۘ, l.ܰ᩶ۘ, l.ܶ۬ۘ):java.lang.Object");
    }

    @Override // l.AbstractC7483
    /* renamed from: ֫ */
    public final Collection mo5986() {
        return Arrays.asList("font", ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR, "align");
    }
}
