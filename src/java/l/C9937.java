package l;

import android.net.Uri;
import java.io.IOException;

/* compiled from: Q8FL */
/* renamed from: l.ۤ֡ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9937 extends AbstractC2399 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f30010;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Uri f30011;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16431 f30012;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C14159 f30013;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f30014;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C23411 f30015;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f30016;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9937(l.C16431 r1) {
        /*
            r0 = this;
            r0.f30012 = r1
            l.ܰܺܳ r1 = l.C16431.m38729(r1)
            boolean r1 = r1 instanceof l.AbstractC3163
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9937.<init>(l.ܽۚۜ):void");
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        boolean z;
        AbstractC15440 abstractC15440;
        String m38724;
        boolean m38716;
        C14159 m38705;
        AbstractC13921 abstractC13921;
        Uri uri = c3104.f9711;
        long j = c3104.f9713;
        this.f30011 = uri;
        long j2 = c3104.f9718;
        this.f30010 = j2;
        m7774(c3104);
        Uri uri2 = this.f30011;
        C16431 c16431 = this.f30012;
        InterfaceC17889 m38737 = c16431.m38737(uri2);
        if (C17781.m41659(m38737.getName()) != null) {
            z = C16431.m38727(c16431, m38737);
        } else {
            c16431.m38741(m38737);
            z = false;
        }
        abstractC15440 = c16431.f50530;
        if (abstractC15440 == null) {
            return m25055(c3104, m38737.mo24433());
        }
        m38724 = C16431.m38724(m38737);
        AbstractC15440 m38706 = C16431.m38706(c16431, m38724);
        m38716 = c16431.m38716(m38737, m38706);
        if (m38716) {
            c16431.m38726(m38737, m38724);
            return m25055(c3104, m38706);
        }
        if (!z) {
            if (!C16431.m38723(c16431, m38737)) {
                return m25055(c3104, m38706);
            }
            m38705 = c16431.m38705(m38737, m38724, true);
            this.f30013 = m38705;
            if (j == -1) {
                j = m38705.m33792() - j2;
            }
            this.f30014 = j;
            if (j < 0) {
                throw new C22154(null, null, 2008);
            }
            this.f30016 = true;
            m7776(c3104);
            return this.f30014;
        }
        abstractC13921 = c16431.f50535;
        if (!(abstractC13921 instanceof AbstractC3163)) {
            throw new IOException("Network range cache is not available");
        }
        C14159 c14159 = new C14159(new C17054((AbstractC3163) abstractC13921, m38737), m38737.getName(), m38737.getSize());
        this.f30013 = c14159;
        if (j == -1) {
            j = c14159.m33792() - j2;
        }
        this.f30014 = j;
        if (j < 0) {
            throw new C22154(null, null, 2008);
        }
        this.f30016 = true;
        m7776(c3104);
        return this.f30014;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m25055(C3104 c3104, AbstractC15440 abstractC15440) {
        C23411 m36513 = abstractC15440.m36513("r");
        this.f30015 = m36513;
        m36513.seek(c3104.f9718);
        long j = c3104.f9713;
        if (j == -1) {
            j = this.f30015.length() - c3104.f9718;
        }
        this.f30014 = j;
        if (j < 0) {
            throw new C22154(null, null, 2008);
        }
        this.f30016 = true;
        m7776(c3104);
        return this.f30014;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        int m33790;
        if (i2 == 0) {
            return 0;
        }
        long j = this.f30014;
        if (j == 0) {
            return -1;
        }
        try {
            C23411 c23411 = this.f30015;
            if (c23411 != null) {
                m33790 = c23411.read(bArr, i, (int) Math.min(j, i2));
            } else {
                m33790 = this.f30013.m33790(this.f30010, bArr, i, (int) Math.min(j, i2));
            }
            if (m33790 > 0) {
                long j2 = m33790;
                this.f30010 += j2;
                this.f30014 -= j2;
                m7777(m33790);
            }
            return m33790;
        } catch (IOException e) {
            throw new C22154(2000, e);
        }
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        return this.f30011;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC21449
    public final void close() {
        this.f30011 = null;
        try {
            try {
                C23411 c23411 = this.f30015;
                if (c23411 != null) {
                    c23411.close();
                }
                C14159 c14159 = this.f30013;
                if (c14159 != null) {
                    c14159.close();
                }
            } catch (IOException e) {
                throw new C22154(2000, e);
            }
        } finally {
            this.f30015 = null;
            this.f30013 = null;
            if (this.f30016) {
                this.f30016 = false;
                m7775();
            }
        }
    }
}
