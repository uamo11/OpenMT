package l;

import com.alipay.sdk.m.y.l;
import java.util.Set;

/* compiled from: K608 */
/* renamed from: l.᩸ۗۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21307 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AbstractC8396 f68681;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Set f68682;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C21307 f68686;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f68688 = null;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Set f68687 = null;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Set f68680 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Set f68679 = null;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Set f68684 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Set f68683 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public EnumC3520 f68685 = EnumC3520.UNKNOWN;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f68689 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48339(C21307 c21307) {
        String m35430;
        C21307 m48337 = c21307.m48337();
        if (this == m48337) {
            return;
        }
        m48337.f68686 = this;
        m48335(this, m48337, EnumC7900.f24480);
        m48335(this, m48337, EnumC7900.f24479);
        m48335(this, m48337, EnumC7900.f24481);
        m48335(this, m48337, EnumC7900.f24484);
        m48335(this, m48337, EnumC7900.f24478);
        m48335(this, m48337, EnumC7900.f24482);
        String str = this.f68689;
        if (str == null) {
            this.f68689 = m48337.f68689;
        } else {
            String str2 = m48337.f68689;
            if (str2 != null) {
                m35430 = C14955.m35430(str, str2);
                this.f68689 = m35430;
            }
        }
        m48337.f68689 = null;
        Set set = m48337.f68682;
        if (set != null) {
            Set set2 = this.f68682;
            if (set2 == null) {
                this.f68682 = set;
            } else {
                set2.addAll(set);
            }
            m48337.f68682 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48335(C21307 c21307, C21307 c213072, EnumC7900 enumC7900) {
        Set mo1218 = enumC7900.mo1218(c213072);
        if (mo1218 != null) {
            Set mo12182 = enumC7900.mo1218(c21307);
            if (mo12182 == null) {
                enumC7900.mo1219(c21307, mo1218);
            } else {
                mo12182.addAll(mo1218);
                mo1218 = mo12182;
            }
            mo1218.remove(c21307);
            mo1218.remove(c213072);
            enumC7900.mo1219(c213072, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21307 m48337() {
        C21307 c21307 = this;
        while (true) {
            C21307 c213072 = c21307.f68686;
            if (c213072 == null) {
                break;
            }
            c21307 = c213072;
        }
        if (c21307 != this) {
            this.f68686 = c21307;
        }
        return c21307;
    }

    public C21307(AbstractC8396 abstractC8396) {
        this.f68681 = abstractC8396;
    }

    public final String toString() {
        C21307 m48337 = m48337();
        Set set = m48337.f68682;
        String obj = set == null ? "[]" : set.toString();
        return m48337.f68685 + "::" + this.f68681 + ": " + m48337.f68689 + " > {" + obj.substring(1, obj.length() - 1) + l.d;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m48341() {
        String[] strArr;
        C21307 m48337 = m48337();
        EnumC3520 enumC3520 = m48337.f68685;
        if (enumC3520 == EnumC3520.OBJECT) {
            return m48337.f68689.length() == 1 ? "Ljava/lang/Object;" : m48337.f68689;
        }
        if (enumC3520.f11198 && enumC3520 != EnumC3520.INT) {
            String str = m48337.f68689;
            if (str != null) {
                return str;
            }
            throw new RuntimeException();
        }
        if (enumC3520 == EnumC3520.JD) {
            return "J";
        }
        if (m48337.f68682 != null) {
            strArr = C22012.f70566;
            for (int i = 0; i < 4; i++) {
                String str2 = strArr[i];
                if (m48337.f68682.contains(str2)) {
                    return str2;
                }
            }
        }
        switch (C2256.f7332[enumC3520.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return "I";
            case 4:
            case 5:
            case 6:
                return "Z";
            default:
                throw new RuntimeException();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48340(EnumC3520 enumC3520) {
        EnumC3520 enumC35202 = this.f68685;
        EnumC3520 m10715 = EnumC3520.m10715(enumC35202, enumC3520);
        if (m10715 == enumC35202) {
            return false;
        }
        this.f68685 = m10715;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48338() {
        return m48337().f68689;
    }
}
