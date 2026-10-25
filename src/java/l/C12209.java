package l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Y9WI */
/* renamed from: l.۫ۚ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12209 implements AutoCloseable {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f36428 = C11321.m27961(C12209.class);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f36429;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f36430;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C3618 f36431;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f36432;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f36433;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f36434;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f36435;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AtomicLong f36436;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC1023 f36437;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f36438;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f36439;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f36440;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final synchronized void m29688() {
        long decrementAndGet = this.f36436.decrementAndGet();
        if (decrementAndGet == 0) {
            m29691();
        } else {
            InterfaceC2148 interfaceC2148 = f36428;
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101(String.format("Release %s (%d)", this, Long.valueOf(decrementAndGet)));
            }
        }
    }

    public C12209(InterfaceC1023 interfaceC1023, byte[] bArr, C3618 c3618, String str, int i, int i2, long j) {
        this.f36434 = true;
        this.f36436 = new AtomicLong(1L);
        this.f36437 = interfaceC1023;
        this.f36429 = bArr;
        this.f36430 = 0;
        this.f36440 = str;
        this.f36435 = i;
        this.f36438 = i2;
        this.f36439 = 0;
        this.f36432 = 0;
        c3618.m11088();
        this.f36431 = c3618;
        this.f36433 = c3618.m11099();
        interfaceC1023.getClass();
    }

    public C12209(InterfaceC1023 interfaceC1023, int i, C3618 c3618, String str, int i2, int i3, int i4, int i5, long j) {
        this.f36434 = true;
        this.f36436 = new AtomicLong(1L);
        this.f36437 = interfaceC1023;
        this.f36430 = i;
        this.f36429 = null;
        this.f36440 = str;
        this.f36435 = i2;
        this.f36438 = i3;
        this.f36439 = i4;
        this.f36432 = i5;
        c3618.m11088();
        this.f36431 = c3618;
        this.f36433 = c3618.m11099();
        interfaceC1023.getClass();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m29692() {
        if (!m29689()) {
            throw new C3037("Descriptor is no longer valid");
        }
        return this.f36430;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m29690() {
        if (!m29689()) {
            throw new C3037("Descriptor is no longer valid");
        }
        return this.f36429;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3618 m29693() {
        C3618 c3618 = this.f36431;
        c3618.m11088();
        return c3618;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m29689() {
        if (this.f36434) {
            return this.f36433 == this.f36431.m11099() && this.f36431.m11095();
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m29691() {
        C3618 c3618 = this.f36431;
        if (c3618 != null) {
            try {
                if (m29689()) {
                    InterfaceC2148 interfaceC2148 = f36428;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Closing file handle " + this);
                    }
                    boolean m11100 = c3618.m11100();
                    InterfaceC1023 interfaceC1023 = this.f36437;
                    if (m11100) {
                        c3618.m11087(new C14011(interfaceC1023, this.f36429), null, EnumC0214.NO_RETRY);
                    } else {
                        c3618.m11087(new C1584(interfaceC1023, this.f36430), new C7188(interfaceC1023), EnumC0214.NO_RETRY);
                    }
                }
            } catch (Throwable th) {
                this.f36434 = false;
                c3618.m11101();
                this.f36431 = null;
                throw th;
            }
        }
        this.f36434 = false;
        if (c3618 != null) {
            c3618.m11101();
        }
        this.f36431 = null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m29688();
    }

    public final void finalize() {
        if (this.f36436.get() == 0 || !this.f36434) {
            return;
        }
        f36428.mo7104("File handle was not properly closed: " + this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29686() {
        long incrementAndGet = this.f36436.incrementAndGet();
        InterfaceC2148 interfaceC2148 = f36428;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101(String.format("Acquire %s (%d)", this, Long.valueOf(incrementAndGet)));
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m29687() {
        this.f36434 = false;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.f36429;
        if (bArr != null) {
            valueOf = C12085.m29468(bArr, 0, bArr.length);
        } else {
            valueOf = Integer.valueOf(this.f36430);
        }
        return String.format("FileHandle %s [fid=%s,tree=%d,flags=%x,access=%x,attrs=%x,options=%x]", this.f36440, valueOf, Long.valueOf(this.f36433), Integer.valueOf(this.f36435), Integer.valueOf(this.f36438), Integer.valueOf(this.f36439), Integer.valueOf(this.f36432));
    }

    public final int hashCode() {
        int i;
        long j = this.f36433;
        byte[] bArr = this.f36429;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = this.f36430;
        }
        return (int) ((j * 3) + i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12209)) {
            return false;
        }
        C12209 c12209 = (C12209) obj;
        long j = c12209.f36433;
        long j2 = this.f36433;
        byte[] bArr = this.f36429;
        return bArr != null ? Arrays.equals(bArr, c12209.f36429) && j2 == j : this.f36430 == c12209.f36430 && j2 == j;
    }
}
