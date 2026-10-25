package l;

import java.util.ArrayList;

/* compiled from: 4BFE */
/* renamed from: l.ۗܿܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3382 extends C17535 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f10680;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3382 m10314(ArrayList arrayList, int i) {
        int size = arrayList.size();
        C3382 c3382 = new C3382(size, i);
        for (int i2 = 0; i2 < size; i2++) {
            c3382.m40981(i2, (AbstractC4793) arrayList.get(i2));
        }
        c3382.mo20349();
        return c3382;
    }

    public C3382(int i, int i2) {
        super(i);
        this.f10680 = i2;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m10315() {
        int size = size();
        if (size == 0) {
            return 0;
        }
        AbstractC4793 abstractC4793 = (AbstractC4793) m40978(size - 1);
        return abstractC4793.mo2084() + abstractC4793.m13990();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10316(C18241 c18241) {
        int m42510 = c18241.m42510();
        int size = size();
        if (c18241.m42506()) {
            for (int i = 0; i < size; i++) {
                AbstractC4793 abstractC4793 = (AbstractC4793) m40978(i);
                int mo2084 = abstractC4793.mo2084() * 2;
                String str = null;
                if (mo2084 != 0) {
                    int m42516 = c18241.m42516();
                    String mo2085 = abstractC4793.mo2085();
                    if (mo2085 != null) {
                        String str2 = EnumC0121.f1143 + abstractC4793.m13984() + ": ";
                        int length = str2.length();
                        str = C5541.m15683(str2, length, m42516 == 0 ? mo2085.length() : m42516 - length, mo2085);
                    }
                }
                if (str != null) {
                    c18241.m42501(mo2084, str);
                } else if (mo2084 != 0) {
                    c18241.m42501(mo2084, "");
                }
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC4793 abstractC47932 = (AbstractC4793) m40978(i2);
            try {
                abstractC47932.mo2082(c18241);
            } catch (RuntimeException e) {
                throw C8136.m21601("...while writing " + abstractC47932, e);
            }
        }
        int m425102 = (c18241.m42510() - m42510) / 2;
        if (m425102 == m10315()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m10315() + " but actually wrote " + m425102);
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m10318() {
        return this.f10680;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int m10317() {
        int m33357;
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC4793 abstractC4793 = (AbstractC4793) m40978(i2);
            if (abstractC4793 instanceof C21727) {
                AbstractC13717 m49053 = ((C21727) abstractC4793).m49053();
                if (m49053 instanceof AbstractC16745) {
                    m33357 = ((AbstractC16745) m49053).m39385(abstractC4793.m13994().m32167() == 113).m51259().m33357();
                } else {
                    m33357 = m49053 instanceof C23801 ? ((C23801) m49053).m52480().m51259().m33357() : 0;
                }
            } else if (!(abstractC4793 instanceof C18115)) {
                continue;
            } else {
                if (abstractC4793.m13994().m32167() != 250) {
                    throw new RuntimeException("Expecting invoke-polymorphic");
                }
                m33357 = ((C4751) ((C18115) abstractC4793).m42239(1)).m13898().m51259().m33357() + 1;
            }
            if (m33357 > i) {
                i = m33357;
            }
        }
        return i;
    }
}
