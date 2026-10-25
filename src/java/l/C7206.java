package l;

import java.util.UUID;

/* compiled from: I6U1 */
/* renamed from: l.۟ۗᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7206 implements AutoCloseable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23721 f22055;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final UUID f22056;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15007 f22057;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f22058;

    public C7206(C23721 c23721, C15007 c15007, UUID uuid, long j) {
        this.f22055 = c23721;
        this.f22057 = c15007;
        this.f22056 = uuid;
        this.f22058 = j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m19288() {
        long j;
        synchronized (this.f22055) {
            j = m19284().f45764;
        }
        return j;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final UUID m19289() {
        UUID uuid;
        synchronized (this.f22055) {
            m19284();
            uuid = this.f22056;
        }
        return uuid;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m19285() {
        byte[] bArr;
        synchronized (this.f22055) {
            bArr = (byte[]) m19284().f45763.f7359.clone();
        }
        return bArr;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C12704 m19287() {
        C12704 c12704;
        synchronized (this.f22055) {
            C12704 c127042 = m19284().f45762;
            c12704 = new C12704(c127042.m32420(), c127042.m30979());
        }
        return c12704;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m19286(byte[] bArr) {
        long j;
        C21605 c21605;
        C21605 c216052;
        C1143 c1143;
        C10070 c10070;
        long j2;
        long j3;
        C2267 c2267;
        synchronized (this.f22055) {
            this.f22055.m52325();
            this.f22055.m52318();
            C15007 m19284 = m19284();
            long j4 = m19284.f45764;
            j = this.f22055.f76802;
            if (j4 <= j) {
                throw new IllegalStateException("Checkpoint has been superseded");
            }
            c21605 = this.f22055.f76801;
            if (c21605 == null) {
                c1143 = null;
            } else {
                c216052 = this.f22055.f76801;
                c1143 = c216052.f69370;
            }
            C2267 m7494 = C2267.m7494(c1143, bArr);
            try {
                C12704 c12704 = new C12704(m19284.f45762.m32420(), m19284.f45762.m30979());
                try {
                    C15007 c15007 = new C15007(c12704, m7494, m19284.f45765, m19284.f45766, m19284.f45764);
                    c10070 = this.f22055.f76806;
                    c10070.m25280(c15007, Math.max(1L, Math.max(this.f22058, bArr.length)));
                    this.f22055.f76802 = m19284.f45764;
                    j2 = this.f22055.f76799;
                    if (j2 == m19284.f45764) {
                        c2267 = this.f22055.f76820;
                        C23721 c23721 = this.f22055;
                        m7494.m7497();
                        c23721.f76820 = m7494;
                        c2267.close();
                        this.f22055.f76819 = 0L;
                    }
                    j3 = m19284.f45764;
                    close();
                } catch (Error | RuntimeException e) {
                    c12704.close();
                    throw e;
                }
            } finally {
                m7494.close();
            }
        }
        return j3;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C15007 m19284() {
        C15007 c15007 = this.f22057;
        if (c15007 != null) {
            return c15007;
        }
        throw new IllegalStateException("Checkpoint is closed or already published");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22055) {
            C15007 c15007 = this.f22057;
            this.f22057 = null;
            if (c15007 != null) {
                c15007.close();
            }
        }
    }
}
