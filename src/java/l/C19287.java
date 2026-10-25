package l;

import android.graphics.Paint;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;

/* compiled from: Y4UF */
/* renamed from: l.᩵ۛ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19287 implements Serializable {
    public static final long serialVersionUID = 12335435;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f60675;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f60676;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f60677;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60678 = true;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f60679;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f60680;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f60681;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f60682;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f60683;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f60684;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f60685;

    static {
        Paint paint = new Paint(1);
        paint.setTextSize(C11266.m27880(12.0f));
        f60675 = Math.max(30, (int) (C11266.f33764.x / paint.measureText("我")));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19287 m44466(int i, int i2) {
        C19287 c19287 = new C19287(10);
        c19287.f60682 = "";
        c19287.f60676 = 0;
        c19287.f60677 = 0;
        c19287.f60684 = i;
        c19287.f60685 = i2;
        return c19287;
    }

    public C19287(int i) {
        this.f60680 = i;
    }

    public final String toString() {
        int i = this.f60680;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder("TYPE_EXACT: ");
                sb.append(m44464());
                sb.append(" (");
                sb.append(this.f60684);
                sb.append(", ");
                return C3200.m9831(this.f60685, MotionUtils.EASING_TYPE_FORMAT_END, sb);
            case 1:
                return "TYPE_SOURCE_FILE: " + m44464();
            case 2:
                return "TYPE_CLASS_ANNOTATION: " + m44464() + " " + this.f60684 + " -> " + this.f60685;
            case 3:
                return "TYPE_METHOD_NAME: " + m44464();
            case 4:
                return "TYPE_METHOD_ANNOTATION: " + m44464() + " " + this.f60681 + MotionUtils.EASING_TYPE_FORMAT_START + this.f60679 + MotionUtils.EASING_TYPE_FORMAT_END + this.f60683 + " -> " + this.f60684 + " -> " + this.f60685;
            case 5:
                return "TYPE_METHOD_INSTRUCTION: " + m44464() + " " + this.f60681 + MotionUtils.EASING_TYPE_FORMAT_START + this.f60679 + MotionUtils.EASING_TYPE_FORMAT_END + this.f60683 + " -> " + this.f60684;
            case 6:
                return "TYPE_METHOD_INSTRUCTION_IN: " + m44464() + " " + this.f60681 + MotionUtils.EASING_TYPE_FORMAT_START + this.f60679 + MotionUtils.EASING_TYPE_FORMAT_END + this.f60683 + " -> " + this.f60684 + " -> " + this.f60685;
            case 7:
                return "TYPE_FIELD_NAME: " + m44464();
            case 8:
                return "TYPE_FIELD_ANNOTATION: " + m44464() + " " + this.f60681 + ":" + this.f60683 + " -> " + this.f60684 + "->" + this.f60685;
            case 9:
                return "TYPE_FIELD_VALUE: " + m44464();
            case 10:
                StringBuilder sb2 = new StringBuilder("TYPE_LINE_COL: ");
                sb2.append(m44464());
                sb2.append(" (");
                sb2.append(this.f60684);
                sb2.append(", ");
                return C3200.m9831(this.f60685, MotionUtils.EASING_TYPE_FORMAT_END, sb2);
            default:
                return C19370.m44628(i, "UNKNOWN_TYPE: ");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m44464() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f60682);
        sb.insert(this.f60676, '[');
        sb.insert(this.f60677 + 1, ']');
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44469(int i, int i2, String str) {
        int i3 = f60675;
        if (i <= i3 - 5) {
            this.f60676 = i;
            this.f60677 = i2;
            this.f60682 = str;
            return;
        }
        int i4 = i2 - i;
        if (i4 >= i3) {
            str = str.substring(i);
            i = 0;
            i2 = i4;
        } else {
            int i5 = i - (i3 - i4);
            if (i5 > 0) {
                str = str.substring(i5);
                i -= i5;
                i2 -= i5;
            }
        }
        this.f60676 = i + 1;
        this.f60677 = i2 + 1;
        this.f60682 = C20094.m46315("…", str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44473(InterfaceC9272 interfaceC9272, C12164 c12164) {
        if (interfaceC9272.getValue().mo2302() != 23) {
            String str = interfaceC9272.getName() + " = {...";
            String group = c12164.group();
            m44469(str.length(), group.length() + str.length(), C22870.m50967(str, group, "...}"));
            return;
        }
        String value = ((InterfaceC17507) interfaceC9272.getValue()).getValue();
        String m33622 = C14020.m33622(value);
        String str2 = interfaceC9272.getName() + " = \"";
        int m9354 = C3058.m9354(c12164.start(), 0, 0, value);
        m44469(str2.length() + m9354, str2.length() + C3058.m9354(c12164.end(), c12164.start(), m9354, value), C22870.m50967(str2, m33622, "\""));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44472(InterfaceC9272 interfaceC9272, InterfaceC10410 interfaceC10410) {
        C11418 c11418 = new C11418();
        try {
            AbstractC11569.m28462(new C3438(new C22706(c11418)), interfaceC10410);
        } catch (IOException unused) {
        }
        String str = interfaceC9272.getName() + " = ";
        int mo2302 = interfaceC9272.getValue().mo2302();
        if (mo2302 == 0 || mo2302 == 6 || mo2302 == 2 || mo2302 == 3 || mo2302 == 4) {
            int length = str.length();
            m44469(length, c11418.length() + length, str.concat(c11418.toString()));
            return;
        }
        String m37867 = C16014.m37867(str, "{... ");
        int length2 = m37867.length();
        int length3 = c11418.length() + length2;
        StringBuilder m15339 = C5368.m15339(m37867);
        m15339.append(c11418.toString());
        m15339.append(" ...}");
        m44469(length2, length3, m15339.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44471(InterfaceC3627 interfaceC3627, C12164 c12164) {
        if (interfaceC3627.mo11109().mo2302() != 23) {
            String m23341 = C9045.m23341(new StringBuilder(), m44465(interfaceC3627), "{...");
            String group = c12164.group();
            m44469(m23341.length(), group.length() + m23341.length(), C22870.m50967(m23341, group, "...}"));
            return;
        }
        String value = ((InterfaceC17507) interfaceC3627.mo11109()).getValue();
        String m33622 = C14020.m33622(value);
        String str = m44465(interfaceC3627) + '\"';
        int m9354 = C3058.m9354(c12164.start(), 0, 0, value);
        m44469(str.length() + m9354, str.length() + C3058.m9354(c12164.end(), c12164.start(), m9354, value), C22870.m50967(str, m33622, "\""));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44470(InterfaceC3627 interfaceC3627, InterfaceC10410 interfaceC10410) {
        C11418 c11418 = new C11418();
        try {
            AbstractC11569.m28462(new C3438(new C22706(c11418)), interfaceC10410);
        } catch (IOException unused) {
        }
        String m44465 = m44465(interfaceC3627);
        int mo2302 = interfaceC3627.mo11109().mo2302();
        if (mo2302 == 0 || mo2302 == 6 || mo2302 == 2 || mo2302 == 3 || mo2302 == 4) {
            int length = m44465.length();
            m44469(length, c11418.length() + length, m44465.concat(c11418.toString()));
            return;
        }
        String m37867 = C16014.m37867(m44465, "{... ");
        int length2 = m37867.length();
        int length3 = c11418.length() + length2;
        StringBuilder m15339 = C5368.m15339(m37867);
        m15339.append(c11418.toString());
        m15339.append(" ...}");
        m44469(length2, length3, m15339.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44475(InterfaceC18444 interfaceC18444, int i, int i2) {
        StringBuilder m15339 = C5368.m15339(".method ");
        for (EnumC15657 enumC15657 : EnumC15657.m36858(interfaceC18444.mo3567())) {
            m15339.append(enumC15657.toString());
            m15339.append(' ');
        }
        int length = m15339.length() + i;
        int length2 = m15339.length() + i2;
        m15339.append(interfaceC18444.getName());
        m15339.append(MotionUtils.EASING_TYPE_FORMAT_START);
        AbstractC4628 listIterator = AbstractC14545.copyOf((Collection) interfaceC18444.getParameters()).listIterator(0);
        while (listIterator.hasNext()) {
            m15339.append(((InterfaceC0098) listIterator.next()).getType());
        }
        m15339.append(MotionUtils.EASING_TYPE_FORMAT_END);
        m15339.append(interfaceC18444.mo3568());
        m44469(length, length2, m15339.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44465(InterfaceC3627 interfaceC3627) {
        StringBuilder sb = new StringBuilder(".field ");
        for (EnumC15657 enumC15657 : EnumC15657.m36864(interfaceC3627.mo11110())) {
            sb.append(enumC15657.toString());
            sb.append(' ');
        }
        sb.append(interfaceC3627.getName());
        sb.append(':');
        sb.append(interfaceC3627.getType());
        sb.append(" = ");
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44468(int i, int i2, CharSequence charSequence) {
        int i3;
        for (int min = Math.min(i - 1, charSequence.length() - 1); min >= 0; min--) {
            char charAt = charSequence.charAt(min);
            if (charAt == '\n' || charAt == '\r') {
                i3 = min + 1;
                break;
            }
        }
        i3 = 0;
        int length = charSequence.length();
        for (int max = Math.max(i2, 0); max < length; max++) {
            char charAt2 = charSequence.charAt(max);
            if (charAt2 == '\n' || charAt2 == '\r') {
                length = max;
                break;
            }
        }
        while (i3 < i && charSequence.charAt(i3) == ' ') {
            i3++;
        }
        int i4 = f60675;
        if (i2 > length) {
            i2 = length;
        } else if (length - i2 > i4) {
            length = i2 + i4;
        }
        int i5 = i - i3;
        if (i5 > i4 - 5) {
            int i6 = i2 - i;
            int i7 = i6 >= i4 ? i : i - (i4 - i6);
            this.f60676 = (i + 1) - i7;
            this.f60677 = (i2 + 1) - i7;
            this.f60682 = "…" + ((Object) charSequence.subSequence(i7, length));
            return;
        }
        this.f60676 = i5;
        this.f60677 = i2 - i3;
        this.f60682 = charSequence.subSequence(i3, length).toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44474(C12392 c12392) {
        C7744 mo26556 = c12392.m30436().mo26556();
        try {
            m44467(c12392, mo26556);
            mo26556.close();
        } catch (Throwable th) {
            try {
                mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b0, code lost:
    
        if (r9 < r4) goto L82;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m44467(l.C12392 r19, l.C7744 r20) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19287.m44467(l.۫ۨᩳ, l.۟᩸ᩳ):void");
    }
}
