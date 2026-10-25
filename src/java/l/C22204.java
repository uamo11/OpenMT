package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/* compiled from: 88L3 */
/* renamed from: l.᩹ۢۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22204 implements InterfaceC1368 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final byte[] f72041;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final byte[] f72042;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int[] f72043 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f72044 = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C19714 f72045;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f72046;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f72047;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final byte[] f72048;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f72049;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f72050;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f72051;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f72052;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f72053;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f72054;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f72055;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f72056;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f72057;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f72058;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC9505 f72059;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f72060;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f72061;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f72062;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    static {
        String str = C3603.f11424;
        Charset charset = StandardCharsets.UTF_8;
        f72041 = "#!AMR\n".getBytes(charset);
        f72042 = "#!AMR-WB\n".getBytes(charset);
    }

    public C22204(int i) {
        this.f72050 = (i & 2) != 0 ? i | 1 : i;
        this.f72048 = new byte[1];
        this.f72062 = -1;
        C19714 c19714 = new C19714();
        this.f72045 = c19714;
        this.f72058 = c19714;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return m49884(interfaceC8424);
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f72057 = interfaceC21830;
        InterfaceC19383 mo3429 = interfaceC21830.mo3429(0, 1);
        this.f72047 = mo3429;
        this.f72058 = mo3429;
        interfaceC21830.mo3431();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f72056 = 0L;
        this.f72053 = 0;
        this.f72046 = 0;
        this.f72060 = j2;
        InterfaceC9505 interfaceC9505 = this.f72059;
        if (interfaceC9505 instanceof C17971) {
            long m41982 = ((C17971) interfaceC9505).m41982(j);
            this.f72049 = m41982;
            if (Math.abs(this.f72060 - m41982) < 20000) {
                return;
            }
            this.f72052 = true;
            this.f72058 = this.f72045;
            return;
        }
        if (j != 0 && (interfaceC9505 instanceof C9130)) {
            this.f72049 = ((C9130) interfaceC9505).m23502(j);
        } else {
            this.f72049 = 0L;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m49884(InterfaceC8424 interfaceC8424) {
        interfaceC8424.mo22066();
        byte[] bArr = f72041;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC8424.mo22061(0, bArr.length, bArr2);
        if (Arrays.equals(bArr2, bArr)) {
            this.f72051 = false;
            interfaceC8424.mo22070(bArr.length);
            return true;
        }
        interfaceC8424.mo22066();
        byte[] bArr3 = f72042;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC8424.mo22061(0, bArr3.length, bArr4);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f72051 = true;
        interfaceC8424.mo22070(bArr3.length);
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m49883(InterfaceC8424 interfaceC8424) {
        boolean z;
        interfaceC8424.mo22066();
        byte[] bArr = this.f72048;
        interfaceC8424.mo22061(0, 1, bArr);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw C9080.m23440("Invalid padding bits for frame header " + ((int) b), (Throwable) null);
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.f72051) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? f72044[i] : f72043[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f72051 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C9080.m23440(sb.toString(), (Throwable) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016c  */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r19, l.C23615 r20) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22204.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }
}
