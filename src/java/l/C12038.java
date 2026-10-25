package l;

import com.umeng.analytics.pro.d;
import java.util.List;

/* compiled from: P53T */
/* renamed from: l.ۨ᩻ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12038 extends AbstractC21044 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f36022;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final short f36023;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6602[] f36024;

    public C12038(C6393 c6393, int i, C5896 c5896) {
        super(c6393, i);
        int m16537 = c5896.m16537();
        short m16534 = c5896.m16534();
        this.f36023 = m16534;
        int m16535 = c5896.m16535();
        if (mo29408()) {
            this.f36024 = new C6602[]{new C6602(this, (byte) ((m16534 >> 8) & 255), m16535)};
        } else {
            if (mo29412()) {
                this.f67902 = c5896.m16535();
                int max = Math.max(c5896.m16535(), 0);
                this.f36024 = new C6602[max];
                for (int i2 = 0; i2 < max; i2++) {
                    this.f36024[i2] = new C6602(this, i2, c5896.m16535(), c5896);
                }
            } else {
                this.f36024 = new C6602[]{new C6602(this, 0, -1, c5896)};
            }
            m16537 = m16535;
        }
        this.f36022 = m16537;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r0 == (-1)) goto L48;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m29403(l.C5896 r8, l.C17891 r9) {
        /*
            int r0 = r8.m16525()
            r1 = 8
            r2 = 0
            if (r0 >= r1) goto Lb
            goto La2
        Lb:
            int r0 = r8.m16537()
            short r1 = r8.m16534()
            int r3 = r8.m16535()
            r4 = r1 & 8
            r5 = 1
            if (r4 == 0) goto L1e
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            r1 = r1 & r5
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r4 == 0) goto L39
            if (r0 < 0) goto La2
            java.util.List r8 = r9.m41858()
            l.ܽۜܽ r8 = (l.C16479) r8
            l.ۢۜܽ r8 = r8.f50667
            int r8 = r8.size()
            if (r0 >= r8) goto La2
            goto La1
        L39:
            if (r3 < 0) goto La2
            java.util.List r0 = r9.m41858()
            l.ܽۜܽ r0 = (l.C16479) r0
            l.ۢۜܽ r0 = r0.f50667
            int r0 = r0.size()
            if (r3 < r0) goto L4a
            goto La2
        L4a:
            if (r1 == 0) goto L57
            r8.m16528()
            int r0 = r8.m16535()
            r3 = -1
            if (r0 != r3) goto L58
            goto La2
        L57:
            r0 = 1
        L58:
            if (r1 == 0) goto L63
            int r3 = r8.m16525()
            int r4 = r0 * 12
            if (r3 >= r4) goto L6c
            goto La2
        L63:
            int r3 = r8.m16525()
            int r4 = r0 * 8
            if (r3 >= r4) goto L6c
            goto La2
        L6c:
            l.᩺᩻ܽ r9 = r9.mo12847()
            l.ۢۜܽ r9 = r9.mo14959()
            int r9 = r9.size()
            r3 = 0
        L79:
            if (r3 >= r0) goto La1
            if (r1 == 0) goto L80
            r8.m16528()
        L80:
            r4 = 2
            r8.m16536(r4)
            r8.m16532()
            byte r4 = r8.m16532()
            int r6 = r8.m16535()
            boolean r7 = l.C5688.m16005(r4)
            if (r7 != 0) goto L96
            goto La2
        L96:
            r7 = 3
            if (r4 != r7) goto L9e
            if (r6 < 0) goto La2
            if (r6 < r9) goto L9e
            goto La2
        L9e:
            int r3 = r3 + 1
            goto L79
        La1:
            return r5
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12038.m29403(l.ۛۜܽ, l.ᩳۜܽ):boolean");
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue() {
        return this.f36024[0];
    }

    @Override // l.InterfaceC21211
    public final InterfaceC1454 getValue(int i) {
        return this.f36024[i];
    }

    @Override // l.InterfaceC21211
    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int mo29409() {
        return this.f36024.length;
    }

    @Override // l.InterfaceC21211
    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean mo29412() {
        return (this.f36023 & 1) != 0;
    }

    @Override // l.InterfaceC21211
    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo29405() {
        return (this.f36023 & 2) != 0;
    }

    @Override // l.InterfaceC21211
    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo29411() {
        return (this.f36023 & 4) != 0;
    }

    @Override // l.InterfaceC21211
    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo29408() {
        return (this.f36023 & 8) != 0;
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 mo29404() {
        return (C23326) super.mo29404();
    }

    @Override // l.InterfaceC21211
    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final String mo29406() {
        try {
            List m41858 = ((C17891) super.mo29407()).m41858();
            return ((C16479) m41858).f50667.m47858(this.f36022);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4277 mo29407() {
        return (C17891) super.mo29407();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    public final InterfaceC0748 getType() {
        return (C23535) super.getType();
    }

    @Override // l.AbstractC21044, l.InterfaceC21211
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7099 mo29410() {
        return (C6393) super.mo29410();
    }
}
