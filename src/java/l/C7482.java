package l;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;

/* compiled from: P9KH */
/* renamed from: l.۟۬ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7482 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) {
        byte[] bArr;
        byte[] bArr2;
        C1818 c1818 = (C1818) abstractC5366;
        bArr = c1818.f6245;
        if (bArr == null) {
            m20104(c1818);
        }
        bArr2 = c1818.f6245;
        return bArr2.length;
    }

    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) {
        byte[] bArr;
        byte[] bArr2;
        C1818 c1818 = (C1818) abstractC5366;
        bArr = c1818.f6245;
        if (bArr != null) {
            bArr2 = c1818.f6245;
            c15948.write(bArr2);
        } else {
            Iterator it = c1818.iterator();
            while (it.hasNext()) {
                c15948.m37722((AbstractC5366) it.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20104(C1818 c1818) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(this.f59283, byteArrayOutputStream);
        Iterator it = c1818.iterator();
        while (it.hasNext()) {
            c15948.m37722((AbstractC5366) it.next());
        }
        c1818.f6245 = byteArrayOutputStream.toByteArray();
    }
}
