package l;

import java.io.ByteArrayOutputStream;

/* compiled from: M9GT */
/* renamed from: l.ܳ۫ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14517 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) {
        byte[] bArr;
        byte[] bArr2;
        C23690 c23690 = (C23690) abstractC5366;
        bArr = c23690.f76726;
        if (bArr == null) {
            m34667(c23690);
        }
        bArr2 = c23690.f76726;
        return bArr2.length;
    }

    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) {
        byte[] bArr;
        byte[] bArr2;
        C23690 c23690 = (C23690) abstractC5366;
        bArr = c23690.f76726;
        if (bArr == null) {
            m34667(c23690);
        }
        bArr2 = c23690.f76726;
        c15948.write(bArr2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34667(C23690 c23690) {
        AbstractC5366 abstractC5366;
        boolean z;
        abstractC5366 = c23690.f76723;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C8377 c8377 = this.f59283;
        C15948 c15948 = new C15948(c8377, byteArrayOutputStream);
        try {
            z = c23690.f76724;
            if (z) {
                c15948.m37722(abstractC5366);
            } else {
                abstractC5366.m15330().mo3870(c8377).mo13607(abstractC5366, c15948);
            }
            c23690.f76726 = byteArrayOutputStream.toByteArray();
            c15948.close();
        } catch (Throwable th) {
            try {
                c15948.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
