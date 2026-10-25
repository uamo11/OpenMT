package l;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: D70T */
/* renamed from: l.ۛۧܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6018 implements InterfaceC18883, InterfaceC6930, InterfaceC23863 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final long f18466;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f18467;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18468;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final long f18469;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f18470;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f18471;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f18472;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f18473;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C13073 f18474;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f18475 = new AtomicInteger(1);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9047 f18476;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f18477;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18883[] f18478;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f18479;

    @Override // l.InterfaceC4066
    /* renamed from: ֫ */
    public final Object mo10083() {
        return this;
    }

    @Override // l.InterfaceC4066
    /* renamed from: ܽ */
    public final long mo10087() {
        return mo11897();
    }

    public C6018(C9047 c9047, int i, int i2, int i3, byte[] bArr, C13073 c13073) {
        if (i < 0 || i2 <= 0 || i3 <= 0 || c13073.m31683() <= 0 || !c13073.m31681(i3)) {
            throw new IllegalArgumentException("Invalid replacement recipe");
        }
        long j = i3;
        long m31682 = c13073.m31682(c13073.m31683() - 1) + j;
        long j2 = i;
        long length = ((bArr.length - j) * c13073.m31683()) + j2;
        if (m31682 > j2 || length != i2) {
            throw new IllegalArgumentException("Invalid replacement recipe mapping");
        }
        ArrayList arrayList = new ArrayList();
        C18177.m42357(c9047, arrayList);
        Iterator it = arrayList.iterator();
        int i4 = 1;
        while (it.hasNext()) {
            i4 = Math.max(i4, ((C6018) it.next()).f18468 + 1);
        }
        if (i4 > 256) {
            throw new IllegalStateException("Replacement recipe dependency is too deep");
        }
        this.f18476 = c9047;
        this.f18477 = i;
        this.f18471 = i2;
        this.f18479 = i3;
        this.f18470 = bArr;
        this.f18474 = c13073;
        this.f18467 = bArr.length - j;
        this.f18468 = i4;
        long m3495 = C1005.m3495(bArr.length, C1005.m3495(c13073.m31678(), 88L));
        this.f18472 = m3495;
        this.f18473 = C1005.m3495(m3495, C1005.m3495(C18177.m42351(c9047), C1005.m3495(C19631.m45118(c9047), C1005.m3495(C19631.m45128(c9047), C19631.m45142(c9047)))));
        long m34952 = C1005.m3495(m3495, C1005.m3495(C19631.m45128(c9047), C1005.m3495(C19631.m45118(c9047), C19631.m45142(c9047))));
        this.f18469 = m34952;
        this.f18466 = C1005.m3495(m34952, C19631.m45129(c9047).m12332());
        this.f18478 = C19631.m45121(c9047);
    }

    @Override // l.InterfaceC23863
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16839(ArrayDeque arrayDeque) {
        for (InterfaceC18883 interfaceC18883 : this.f18478) {
            arrayDeque.push(interfaceC18883);
        }
    }

    @Override // l.InterfaceC18883
    public final int length() {
        return this.f18471;
    }

    @Override // l.InterfaceC18883
    /* renamed from: ۫ */
    public final boolean mo10086() {
        if (this.f18475.get() <= 0) {
            return false;
        }
        for (InterfaceC18883 interfaceC18883 : this.f18478) {
            if (!interfaceC18883.mo10086()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.InterfaceC18883
    /* renamed from: ᩺ۧ */
    public final InterfaceC18883 mo10088() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f18475;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new IOException("Replacement recipe is closed");
            }
            long j = i + 1;
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f18475;
        int decrementAndGet = atomicInteger.decrementAndGet();
        if (decrementAndGet < 0) {
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Replacement recipe closed twice");
        }
        if (decrementAndGet == 0) {
            C16059.m37963(this.f18478);
        }
    }

    @Override // l.InterfaceC6930
    /* renamed from: ܿ */
    public final long mo11897() {
        return this.f18466;
    }

    @Override // l.InterfaceC6930
    /* renamed from: ᩳ */
    public final long mo11898() {
        return this.f18469;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    @Override // l.InterfaceC18883
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10084(int r26, byte[] r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6018.mo10084(int, byte[], int, int):void");
    }
}
