package l;

import java.io.ByteArrayOutputStream;
import java.util.Iterator;

/* compiled from: R9DK */
/* renamed from: l.ܽ۫ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16634 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) {
        byte[] bArr;
        byte[] bArr2;
        C18046 c18046 = (C18046) abstractC5366;
        bArr = c18046.f56243;
        if (bArr == null) {
            m39167(c18046);
        }
        bArr2 = c18046.f56243;
        return bArr2.length;
    }

    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) {
        byte[] bArr;
        byte[] bArr2;
        C18046 c18046 = (C18046) abstractC5366;
        bArr = c18046.f56243;
        if (bArr != null) {
            bArr2 = c18046.f56243;
            c15948.write(bArr2);
        } else {
            Iterator it = c18046.iterator();
            while (it.hasNext()) {
                c15948.m37722((AbstractC5366) it.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39167(C18046 c18046) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(this.f59283, byteArrayOutputStream);
        Iterator it = c18046.iterator();
        while (it.hasNext()) {
            c15948.m37722((AbstractC5366) it.next());
        }
        c18046.f56243 = byteArrayOutputStream.toByteArray();
    }
}
