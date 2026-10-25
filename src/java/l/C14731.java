package l;

import android.text.TextUtils;

/* compiled from: C8PP */
/* renamed from: l.ܳ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14731 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f44983;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f44984;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f44985;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f44986;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f44987;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f44988;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f44989;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f44990;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f44991;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f44992;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f44993;

    public C14731(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.f44993 = i;
        this.f44983 = i2;
        this.f44992 = i3;
        this.f44984 = i4;
        this.f44991 = i5;
        this.f44987 = i6;
        this.f44990 = i7;
        this.f44985 = i8;
        this.f44986 = i9;
        this.f44989 = i10;
        this.f44988 = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14731 m35039(String str) {
        char c;
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < split.length; i11++) {
            String m35799 = C15107.m35799(split[i11].trim());
            m35799.getClass();
            switch (m35799.hashCode()) {
                case -1178781136:
                    if (m35799.equals("italic")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026963764:
                    if (m35799.equals("underline")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -192095652:
                    if (m35799.equals("strikeout")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -70925746:
                    if (m35799.equals("primarycolour")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029637:
                    if (m35799.equals("bold")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3373707:
                    if (m35799.equals("name")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 366554320:
                    if (m35799.equals("fontsize")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 767321349:
                    if (m35799.equals("borderstyle")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1767875043:
                    if (m35799.equals("alignment")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1988365454:
                    if (m35799.equals("outlinecolour")) {
                        c = '\t';
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
                    i7 = i11;
                    break;
                case 1:
                    i8 = i11;
                    break;
                case 2:
                    i9 = i11;
                    break;
                case 3:
                    i3 = i11;
                    break;
                case 4:
                    i6 = i11;
                    break;
                case 5:
                    i = i11;
                    break;
                case 6:
                    i5 = i11;
                    break;
                case 7:
                    i10 = i11;
                    break;
                case '\b':
                    i2 = i11;
                    break;
                case '\t':
                    i4 = i11;
                    break;
            }
        }
        if (i != -1) {
            return new C14731(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, split.length);
        }
        return null;
    }
}
