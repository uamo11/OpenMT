package l;

import java.math.RoundingMode;
import moe.shizuku.server.IShizukuService;

/* compiled from: P8OA */
/* renamed from: l.۠ۚۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7969 implements InterfaceC15023 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int[] f24613 = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final int[] f24614 = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, EnumC5983.f18409};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f24615;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f24616;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f24617;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f24618;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21830 f24619;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f24620;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19964 f24621;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8353 f24622;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f24623;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f24624;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f24625;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f24626;

    public C7969(InterfaceC21830 interfaceC21830, InterfaceC19383 interfaceC19383, C19964 c19964) {
        this.f24619 = interfaceC21830;
        this.f24617 = interfaceC19383;
        this.f24621 = c19964;
        int i = c19964.f64654;
        int max = Math.max(1, i / 10);
        this.f24618 = max;
        C17714 c17714 = new C17714(c19964.f64653);
        c17714.m41465();
        int m41465 = c17714.m41465();
        this.f24624 = m41465;
        int i2 = c19964.f64652;
        int i3 = c19964.f64651;
        int m48904 = (C21639.m48904(i2, 4, i3, 8) / (c19964.f64650 * i2)) + 1;
        if (m41465 != m48904) {
            throw C9080.m23440("Expected frames per block: " + m48904 + "; got: " + m41465, (Throwable) null);
        }
        int m10999 = C3603.m10999(max, m41465);
        this.f24623 = new byte[m10999 * i3];
        this.f24615 = new C17714(m41465 * 2 * i2 * m10999);
        int i4 = ((i3 * i) * 8) / m41465;
        C1297 c1297 = new C1297();
        c1297.m4465("audio/raw");
        c1297.m4468(i4);
        c1297.m4438(i4);
        c1297.m4451(max * 2 * i2);
        c1297.m4472(i2);
        c1297.m4456(i);
        c1297.m4475(2);
        this.f24622 = c1297.m4440();
    }

    @Override // l.InterfaceC15023
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21274(long j) {
        this.f24626 = 0;
        this.f24625 = j;
        this.f24616 = 0;
        this.f24620 = 0L;
    }

    @Override // l.InterfaceC15023
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21273(int i, long j) {
        C12907 c12907 = new C12907(this.f24621, this.f24624, i, j);
        this.f24619.mo3430(c12907);
        C8353 c8353 = this.f24622;
        InterfaceC19383 interfaceC19383 = this.f24617;
        interfaceC19383.mo8456(c8353);
        interfaceC19383.mo8454(c12907.mo6827());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0051 -> B:4:0x0053). Please report as a decompilation issue!!! */
    @Override // l.InterfaceC15023
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo21275(l.InterfaceC8424 r23, long r24) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7969.mo21275(l.۠᩷ۧ, long):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21272(int i) {
        long j = this.f24625;
        long j2 = this.f24620;
        C19964 c19964 = this.f24621;
        long j3 = c19964.f64654;
        String str = C3603.f11424;
        long m11017 = j + C3603.m11017(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * c19964.f64652;
        this.f24617.mo8455(m11017, 1, i2, this.f24616 - i2, null);
        this.f24620 += i;
        this.f24616 -= i2;
    }
}
