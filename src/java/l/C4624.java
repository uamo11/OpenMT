package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SATX */
/* renamed from: l.ۙۨۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4624 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f14696;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f14697;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f14698 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m13573() {
        if (this.f14698.isEmpty()) {
            return;
        }
        C10130 c10130 = new C10130();
        c10130.mo13231(this.f14698.size());
        Iterator it = this.f14698.iterator();
        while (it.hasNext()) {
            c10130.m25434(((C20147) it.next()).f65248);
        }
        byte[] m25428 = c10130.m25428();
        C18237 m42480 = C18237.m42480(4183);
        m42480.m42487(m25428);
        C23881 m42495 = m42480.m42495();
        if (!m42495.m52607()) {
            throw new C19401(C1575.m5392(m42495, R.string.MT_Protector_res_0x7f120520));
        }
        byte[] bArr = new byte[m42495.m52599()];
        m42495.m52600(bArr);
        C12951 m31486 = C12951.m31486(bArr);
        Iterator it2 = this.f14698.iterator();
        while (it2.hasNext()) {
            C20147 c20147 = (C20147) it2.next();
            if (m31486.m31498()) {
                byte[] m31496 = m31486.m31496();
                byte[] m11707 = C3878.m11707(m31496, m31496.length);
                C21558.m48711(c20147.f65247, m11707);
                this.f14696.m36526(c20147.f65247).m36502(m11707);
            }
            it2.remove();
            this.f14697 -= c20147.f65248.length;
        }
        this.f14698.clear();
        this.f14697 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m13574(byte[] bArr) {
        String m34531 = C14460.m34531(C14460.m34532().digest(bArr));
        byte[] m48712 = C21558.m48712(m34531);
        if (m48712 != null) {
            this.f14696.m36526(m34531).m36503(m48712, 0, m48712.length);
            return;
        }
        if (this.f14697 >= 262144) {
            m13573();
        }
        this.f14698.add(new C20147(bArr, m34531));
        int length = this.f14697 + bArr.length;
        this.f14697 = length;
        if (length >= 262144) {
            m13573();
        }
    }

    public C4624(AbstractC15440 abstractC15440) {
        if (!C23196.m51460()) {
            throw new C19401(C1575.m5392(new C23881(4), R.string.MT_Protector_res_0x7f120520));
        }
        if (!C23196.m51454()) {
            throw new C19401(C1575.m5392(new C23881(5), R.string.MT_Protector_res_0x7f120520));
        }
        abstractC15440.m36508();
        this.f14696 = abstractC15440;
    }
}
