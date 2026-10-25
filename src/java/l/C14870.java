package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: T8NO */
/* renamed from: l.ܶ֡֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14870 implements InterfaceC0053 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ShortBuffer f45353;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f45354;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f45355;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C18399 f45356;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f45357;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18399 f45358;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f45359;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18399 f45360;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f45361;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f45362;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7815 f45363;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18399 f45365;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ByteBuffer f45366;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float f45364 = 1.0f;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f45352 = 1.0f;

    public C14870() {
        C18399 c18399 = C18399.f57130;
        this.f45365 = c18399;
        this.f45356 = c18399;
        this.f45360 = c18399;
        this.f45358 = c18399;
        ByteBuffer byteBuffer = InterfaceC0053.f930;
        this.f45357 = byteBuffer;
        this.f45353 = byteBuffer.asShortBuffer();
        this.f45366 = byteBuffer;
        this.f45355 = -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35274(float f) {
        C22632.m50631(f > 0.0f);
        if (this.f45364 != f) {
            this.f45364 = f;
            this.f45359 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35273(float f) {
        C22632.m50631(f > 0.0f);
        if (this.f45352 != f) {
            this.f45352 = f;
            this.f45359 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m35272(long j) {
        if (this.f45354 >= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            long j2 = this.f45362;
            this.f45363.getClass();
            long m20891 = j2 - r3.m20891();
            int i = this.f45358.f57134;
            int i2 = this.f45360.f57134;
            return i == i2 ? C3603.m11017(j, m20891, this.f45354, RoundingMode.DOWN) : C3603.m11017(j, m20891 * i, this.f45354 * i2, RoundingMode.DOWN);
        }
        return (long) (this.f45364 * j);
    }

    @Override // l.InterfaceC0053
    /* renamed from: ֫ */
    public final C18399 mo961(C18399 c18399) {
        if (c18399.f57133 != 2) {
            throw new C19105(c18399);
        }
        int i = this.f45355;
        if (i == -1) {
            i = c18399.f57134;
        }
        this.f45365 = c18399;
        C18399 c183992 = new C18399(i, c18399.f57132, 2);
        this.f45356 = c183992;
        this.f45359 = true;
        return c183992;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ܽ */
    public final boolean mo964() {
        if (this.f45356.f57134 != -1) {
            return Math.abs(this.f45364 - 1.0f) >= 1.0E-4f || Math.abs(this.f45352 - 1.0f) >= 1.0E-4f || this.f45356.f57134 != this.f45365.f57134;
        }
        return false;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ֫ */
    public final void mo962(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C7815 c7815 = this.f45363;
            c7815.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f45362 += remaining;
            c7815.m20890(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // l.InterfaceC0053
    /* renamed from: ܿ */
    public final void mo965() {
        C7815 c7815 = this.f45363;
        if (c7815 != null) {
            c7815.m20892();
        }
        this.f45361 = true;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ᩳ */
    public final ByteBuffer mo966() {
        int m20889;
        C7815 c7815 = this.f45363;
        if (c7815 != null && (m20889 = c7815.m20889()) > 0) {
            if (this.f45357.capacity() < m20889) {
                ByteBuffer order = ByteBuffer.allocateDirect(m20889).order(ByteOrder.nativeOrder());
                this.f45357 = order;
                this.f45353 = order.asShortBuffer();
            } else {
                this.f45357.clear();
                this.f45353.clear();
            }
            c7815.m20888(this.f45353);
            this.f45354 += m20889;
            this.f45357.limit(m20889);
            this.f45366 = this.f45357;
        }
        ByteBuffer byteBuffer = this.f45366;
        this.f45366 = InterfaceC0053.f930;
        return byteBuffer;
    }

    @Override // l.InterfaceC0053
    /* renamed from: ۧ */
    public final boolean mo963() {
        if (!this.f45361) {
            return false;
        }
        C7815 c7815 = this.f45363;
        return c7815 == null || c7815.m20889() == 0;
    }

    @Override // l.InterfaceC0053
    public final void flush() {
        if (mo964()) {
            C18399 c18399 = this.f45365;
            this.f45360 = c18399;
            C18399 c183992 = this.f45356;
            this.f45358 = c183992;
            if (this.f45359) {
                this.f45363 = new C7815(this.f45364, c18399.f57134, this.f45352, c18399.f57132, c183992.f57134);
            } else {
                C7815 c7815 = this.f45363;
                if (c7815 != null) {
                    c7815.m20887();
                }
            }
        }
        this.f45366 = InterfaceC0053.f930;
        this.f45362 = 0L;
        this.f45354 = 0L;
        this.f45361 = false;
    }

    @Override // l.InterfaceC0053
    public final void reset() {
        this.f45364 = 1.0f;
        this.f45352 = 1.0f;
        C18399 c18399 = C18399.f57130;
        this.f45365 = c18399;
        this.f45356 = c18399;
        this.f45360 = c18399;
        this.f45358 = c18399;
        ByteBuffer byteBuffer = InterfaceC0053.f930;
        this.f45357 = byteBuffer;
        this.f45353 = byteBuffer.asShortBuffer();
        this.f45366 = byteBuffer;
        this.f45355 = -1;
        this.f45359 = false;
        this.f45363 = null;
        this.f45362 = 0L;
        this.f45354 = 0L;
        this.f45361 = false;
    }
}
