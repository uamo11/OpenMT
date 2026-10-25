package l;

import android.text.TextUtils;

/* compiled from: N9ZJ */
/* renamed from: l.֨֡᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0776 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19828 f2876;

    public /* synthetic */ C0776(C19828 c19828) {
        this.f2876 = c19828;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6421 m2958() {
        C19828 c19828 = this.f2876;
        int i = C12771.f38365;
        C12066 c12066 = c19828.f64061;
        int i2 = C1482.f5314;
        EnumC11919 enumC11919 = EnumC11919.SMB2_ONLY;
        EnumC15592 enumC15592 = EnumC15592.SMB2_ONLY;
        C6421 m5131 = C1482.m5131(c12066, enumC11919, true, enumC15592);
        EnumC15592 m17751 = m5131.m17751();
        EnumC15592 enumC155922 = EnumC15592.UNKNOWN;
        if (m17751 == enumC155922) {
            Throwable m17749 = m5131.m17749();
            if (C20533.m47017(m17749)) {
                m5131 = C1482.m5131(c12066, EnumC11919.SMB3_ONLY, false, EnumC15592.SMB3_ONLY);
                if (m5131.m17751() == enumC155922) {
                    Throwable m177492 = m5131.m17749();
                    if (m17749 != null && m177492 != null) {
                        C1482.m5135(m17749, m177492);
                    }
                    if (m17749 == null) {
                        m17749 = m177492;
                    }
                    m5131 = new C6421(enumC155922, m17749, false);
                }
            }
        } else if (m5131.m17751() == enumC15592 && TextUtils.isEmpty(c12066.f36084) && TextUtils.isEmpty(c12066.f36087)) {
            EnumC11919 enumC119192 = EnumC11919.SMB3_ONLY;
            EnumC15592 enumC155923 = EnumC15592.SMB3_ONLY;
            C6421 m51312 = C1482.m5131(c12066, enumC119192, false, enumC155923);
            if (m51312.m17751() == enumC155923) {
                m5131 = m51312;
            }
        }
        c19828.f64062 = m5131.m17750();
        return m5131;
    }
}
