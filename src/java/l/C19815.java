package l;

import android.os.SystemClock;

/* compiled from: Q8FL */
/* renamed from: l.᩶֡ۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19815 implements InterfaceC1393 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f64011;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f64012;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f64013;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16431 f64014;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f64015;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f64016 = false;

    @Override // l.InterfaceC5627
    /* renamed from: ᩷֫ */
    public final /* synthetic */ void mo1648() {
        throw null;
    }

    public C19815(C16431 c16431, long j, int i, boolean[] zArr) {
        this.f64014 = c16431;
        this.f64013 = j;
        this.f64011 = i;
        this.f64012 = zArr;
    }

    @Override // l.InterfaceC1393
    /* renamed from: ֫ */
    public final void mo1647(long j, long j2, long j3) {
        InterfaceC5982 interfaceC5982;
        if (mo1526()) {
            return;
        }
        C16431 c16431 = this.f64014;
        interfaceC5982 = c16431.f50527;
        if (interfaceC5982 == null) {
            return;
        }
        int m44456 = C19277.m44456(j2, j3);
        boolean z = this.f64016;
        int i = this.f64011;
        if (!z) {
            if (((int) (SystemClock.uptimeMillis() - this.f64013)) <= 500 || m44456 >= 50) {
                return;
            }
            this.f64016 = true;
            C16431.m38719(c16431, i);
        }
        if (m44456 != this.f64015) {
            this.f64015 = m44456;
            C16431.m38709(c16431, i, m44456);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // l.InterfaceC17066
    /* renamed from: ᩻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo1526() {
        /*
            r4 = this;
            l.ܽۚۜ r0 = r4.f64014
            boolean r1 = l.C16431.m38722(r0)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L15
            int r1 = r4.f64011
            boolean r0 = l.C16431.m38714(r0, r1)
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            if (r0 == 0) goto L1c
            boolean[] r1 = r4.f64012
            r1[r3] = r2
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19815.mo1526():boolean");
    }
}
