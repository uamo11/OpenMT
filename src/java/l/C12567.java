package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: T1MK */
/* renamed from: l.۫ᩳۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12567 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m30804(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        c4701.m13775();
        int[] m30805 = m30805(charSequence);
        int[] m308052 = m30805(charSequence2);
        final InterfaceC6818 m52404 = C23751.m52404(m30805, m308052, c4701);
        C18107 c18107 = new C18107(charSequence.length(), charSequence2.length());
        Iterator it = new Iterable() { // from class: l.ۧܳۘ
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C16695(InterfaceC6818.this);
            }
        }.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C13167 c13167 = (C13167) it.next();
            C22340 c22340 = (C22340) c13167.f39374;
            boolean booleanValue = ((Boolean) c13167.f39375).booleanValue();
            int i3 = c22340.f72395;
            int i4 = 0;
            for (int i5 = c22340.f72397; i5 < i3; i5++) {
                i4 += Character.charCount(m30805[i5]);
            }
            int i6 = i4 + i;
            int i7 = c22340.f72396;
            int i8 = 0;
            for (int i9 = c22340.f72398; i9 < i7; i9++) {
                i8 += Character.charCount(m308052[i9]);
            }
            int i10 = i8 + i2;
            if (booleanValue) {
                c18107.m40752(i, i2, i6, i10);
            }
            i2 = i10;
            i = i6;
        }
        return C23751.m52403(c18107.m42227());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m30810(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        c4701.m13775();
        C13272 m30807 = m30807(charSequence);
        C13272 m308072 = m30807(charSequence2);
        return new C9725(m30807, m308072, charSequence, charSequence2, C23751.m52404(m30807.f39742, m308072.f39742, c4701), c4701).m37982();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1879 m30806(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        int i;
        int m32237;
        int i2;
        int m322372;
        c4701.m13775();
        C13272 m30807 = m30807(charSequence);
        C13272 m308072 = m30807(charSequence2);
        InterfaceC6818 m52404 = C23751.m52404(m30807.f39742, m308072.f39742, c4701);
        ArrayList arrayList = new ArrayList();
        Iterator mo6220 = m52404.mo6218().f41655.mo6220();
        while (mo6220.hasNext()) {
            C22340 c22340 = (C22340) mo6220.next();
            int i3 = c22340.f72397;
            int i4 = c22340.f72395;
            if (i3 == i4) {
                i = m30803(m30807, m308072, charSequence, charSequence2, c22340, true);
                m32237 = i;
            } else {
                i = m30807.f39743[i3];
                m32237 = m30807.m32237(i4 - 1);
            }
            int i5 = c22340.f72398;
            int i6 = c22340.f72396;
            if (i5 == i6) {
                i2 = m30803(m30807, m308072, charSequence, charSequence2, c22340, false);
                m322372 = i2;
            } else {
                i2 = m308072.f39743[i5];
                m322372 = m308072.m32237(i6 - 1);
            }
            arrayList.add(new C22340(i, m32237, i2, m322372));
        }
        return C23751.m52400(arrayList, charSequence.length(), charSequence2.length());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6818 m30808(CharSequence charSequence, CharSequence charSequence2, C4701 c4701) {
        c4701.m13775();
        C13272 m30809 = m30809(charSequence);
        C13272 m308092 = m30809(charSequence2);
        InterfaceC6818 m52404 = C23751.m52404(m30809.f39742, m308092.f39742, c4701);
        C18107 c18107 = new C18107(charSequence.length(), charSequence2.length());
        for (C22340 c22340 : m52404.mo6219()) {
            int i = c22340.f72395;
            int i2 = c22340.f72397;
            int i3 = i - i2;
            for (int i4 = 0; i4 < i3; i4++) {
                c18107.m40750(m30809.f39743[i2 + i4], m308092.f39743[c22340.f72398 + i4], 1);
            }
        }
        return C23751.m52403(c18107.m42227());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30803(C13272 c13272, C13272 c132722, CharSequence charSequence, CharSequence charSequence2, C22340 c22340, boolean z) {
        int i = c22340.f72397;
        int m32237 = i == 0 ? 0 : c13272.m32237(i - 1);
        int i2 = c22340.f72398;
        int m322372 = i2 == 0 ? 0 : c132722.m32237(i2 - 1);
        return (z ? m32237 : m322372) + C3374.m10306(charSequence, charSequence2, m32237, m322372, charSequence.length(), charSequence2.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m30805(CharSequence charSequence) {
        C15859 c15859 = new C15859(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            int charCount = Character.charCount(codePointAt);
            c15859.add(codePointAt);
            i += charCount;
        }
        return c15859.mo3586();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13272 m30807(CharSequence charSequence) {
        C15859 c15859 = new C15859(charSequence.length());
        C15859 c158592 = new C15859(charSequence.length());
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charSequence, i);
            int charCount = Character.charCount(codePointAt);
            if (codePointAt >= 128 || !C11250.m27828((char) codePointAt)) {
                c15859.add(codePointAt);
                c158592.add(i);
            }
            i += charCount;
        }
        return new C13272(c15859.mo3586(), c158592.mo3586());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C13272 m30809(CharSequence charSequence) {
        C15859 c15859 = new C15859(charSequence.length());
        C15859 c158592 = new C15859(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char charAt = charSequence.charAt(i);
            if (C3374.m10308(charAt)) {
                c15859.add(charAt);
                c158592.add(i);
            }
        }
        return new C13272(c15859.mo3586(), c158592.mo3586());
    }
}
