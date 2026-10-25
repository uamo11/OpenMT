package l;

/* compiled from: JAG5 */
/* renamed from: l.᩵֫ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19149 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m44214(AbstractC0803 abstractC0803) {
        C0097 mo3027 = abstractC0803.mo3027();
        int m26083 = mo3027.m26083();
        mo3027.m26097(abstractC0803.mo3028().mo14552());
        int mo14554 = abstractC0803.mo3028().mo14554() - abstractC0803.mo3028().mo14552();
        byte[] bArr = new byte[mo14554];
        try {
            mo3027.m26087(mo14554, bArr);
            mo3027.m26097(m26083);
            return bArr;
        } catch (C13146 e) {
            throw new C10951("Cannot read packet bytes from buffer", e);
        }
    }
}
