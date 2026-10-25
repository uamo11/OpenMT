package l;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: 17MS */
/* renamed from: l.᩶ۨ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20142 extends AbstractC11163 {

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f65213 = new AtomicInteger();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17449 f65214;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final InterfaceC21449 f65215;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C17714 f65216;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC4619 f65217;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f65218;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22258 f65219;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65220;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f65221;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f65222;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f65223;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C3104 f65224;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f65225;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C17651 f65226;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f65227;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri f65228;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f65229;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final List f65230;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f65231;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f65232;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19643 f65233;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C9248 f65234;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f65235;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f65236;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f65237;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f65238;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f65239;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f65240;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC4619 f65241;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20142 m46388(InterfaceC22258 interfaceC22258, InterfaceC21449 interfaceC21449, C8353 c8353, long j, C4951 c4951, C8147 c8147, Uri uri, List list, int i, Object obj, boolean z, C21180 c21180, C20142 c20142, byte[] bArr, byte[] bArr2, boolean z2, boolean z3, C13830 c13830) {
        byte[] bArr3;
        InterfaceC21449 interfaceC214492;
        C3104 c3104;
        InterfaceC21449 interfaceC214493;
        boolean z4;
        C17449 c17449;
        InterfaceC4619 interfaceC4619;
        C17714 c17714;
        byte[] bArr4;
        InterfaceC21449 interfaceC214494 = interfaceC21449;
        C22590 c22590 = c8147.f25138;
        C4515 c4515 = new C4515();
        String str = c4951.f31806;
        c4515.m13281(C8542.m22231(str, c22590.f73022));
        c4515.m13286(c22590.f73021);
        c4515.m13280(c22590.f73020);
        boolean z5 = c8147.f25135;
        c4515.m13279(z5 ? 8 : 0);
        C3104 m13278 = c4515.m13278();
        boolean z6 = bArr != null;
        if (z6) {
            String str2 = c22590.f73012;
            str2.getClass();
            bArr3 = m46391(str2);
        } else {
            bArr3 = null;
        }
        if (bArr != null) {
            bArr3.getClass();
            interfaceC214492 = new C9559(interfaceC214494, bArr, bArr3);
        } else {
            interfaceC214492 = interfaceC214494;
        }
        C21885 c21885 = c22590.f73015;
        if (c21885 != null) {
            boolean z7 = bArr2 != null;
            if (z7) {
                String str3 = c21885.f73012;
                str3.getClass();
                bArr4 = m46391(str3);
            } else {
                bArr4 = null;
            }
            Uri m22231 = C8542.m22231(str, c21885.f73022);
            C4515 c45152 = new C4515();
            c45152.m13281(m22231);
            boolean z8 = z7;
            c45152.m13286(c21885.f73021);
            c45152.m13280(c21885.f73020);
            c3104 = c45152.m13278();
            if (bArr2 != null) {
                bArr4.getClass();
                interfaceC214494 = new C9559(interfaceC214494, bArr2, bArr4);
            }
            z4 = z8;
            interfaceC214493 = interfaceC214494;
        } else {
            c3104 = null;
            interfaceC214493 = null;
            z4 = false;
        }
        long j2 = j + c22590.f73016;
        long j3 = j2 + c22590.f73013;
        int i2 = c4951.f15606 + c22590.f73014;
        if (c20142 != null) {
            C3104 c31042 = c20142.f65224;
            boolean z9 = c3104 == c31042 || (c3104 != null && c31042 != null && c3104.f9711.equals(c31042.f9711) && c3104.f9718 == c31042.f9718);
            boolean z10 = uri.equals(c20142.f65228) && c20142.f65220;
            C17449 c174492 = c20142.f65214;
            C17714 c177142 = c20142.f65216;
            interfaceC4619 = (z9 && z10 && !c20142.f65236 && c20142.f65225 == i2) ? c20142.f65217 : null;
            c17449 = c174492;
            c17714 = c177142;
        } else {
            c17449 = new C17449(null);
            interfaceC4619 = null;
            c17714 = new C17714(10);
        }
        return new C20142(interfaceC22258, interfaceC214492, m13278, c8353, z6, interfaceC214493, c3104, z4, uri, list, i, obj, j2, j3, c8147.f25136, c8147.f25137, !z5, i2, c22590.f73017, z, c21180.m48129(i2), c22590.f73019, interfaceC4619, c17449, c17714, z2, z3, c13830);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46390(C20142 c20142, long j, Uri uri, boolean z, C8147 c8147, long j2) {
        if (c20142 == null) {
            return false;
        }
        if (uri.equals(c20142.f65228) && c20142.f65220) {
            return false;
        }
        return !z || j2 + c8147.f25138.f73016 < j;
    }

    public C20142(InterfaceC22258 interfaceC22258, InterfaceC21449 interfaceC21449, C3104 c3104, C8353 c8353, boolean z, InterfaceC21449 interfaceC214492, C3104 c31042, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C9248 c9248, C19643 c19643, InterfaceC4619 interfaceC4619, C17449 c17449, C17714 c17714, boolean z6, boolean z7, C13830 c13830) {
        super(interfaceC21449, c3104, c8353, i, obj, j, j2, j3);
        this.f65218 = z;
        this.f65222 = i2;
        this.f65231 = z3 ? j2 - j : -9223372036854775807L;
        this.f65225 = i3;
        this.f65224 = c31042;
        this.f65215 = interfaceC214492;
        this.f65221 = c31042 != null;
        this.f65232 = z2;
        this.f65228 = uri;
        this.f65240 = z5;
        this.f65234 = c9248;
        this.f65237 = z4;
        this.f65219 = interfaceC22258;
        this.f65230 = list;
        this.f65233 = c19643;
        this.f65241 = interfaceC4619;
        this.f65214 = c17449;
        this.f65216 = c17714;
        this.f65227 = z6;
        this.f65239 = z7;
        this.f65223 = AbstractC14545.of();
        this.f65235 = f65213.getAndIncrement();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46394(C17651 c17651, AbstractC14545 abstractC14545) {
        this.f65226 = c17651;
        this.f65223 = abstractC14545;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46392(int i) {
        C22632.m50634(!this.f65227);
        if (i >= this.f65223.size()) {
            return 0;
        }
        return ((Integer) this.f65223.get(i)).intValue();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m46395() {
        this.f65236 = true;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m46396() {
        return this.f65227;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m46398() {
        this.f65227 = false;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m46399() {
        return this.f65220;
    }

    @Override // l.InterfaceC23757
    /* renamed from: ۧ */
    public final void mo6511() {
        this.f65238 = true;
    }

    @Override // l.InterfaceC23757
    /* renamed from: ֫ */
    public final void mo6509() {
        InterfaceC4619 interfaceC4619;
        this.f65226.getClass();
        if (this.f65217 == null && (interfaceC4619 = this.f65241) != null) {
            InterfaceC1368 mo4843 = ((C8853) interfaceC4619).f26952.mo4843();
            if ((mo4843 instanceof C15729) || (mo4843 instanceof C12825)) {
                this.f65217 = this.f65241;
                this.f65221 = false;
            }
        }
        C3104 c3104 = this.f65224;
        InterfaceC21449 interfaceC21449 = this.f65215;
        if (this.f65221) {
            interfaceC21449.getClass();
            c3104.getClass();
            m46389(interfaceC21449, c3104, this.f65232, false);
            this.f65229 = 0;
            this.f65221 = false;
        }
        if (this.f65238) {
            return;
        }
        if (!this.f65237) {
            m46389(this.f23465, this.f23467, this.f65218, true);
        }
        this.f65220 = !this.f65238;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m46397() {
        return this.f65231 != -9223372036854775807L;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long m46400() {
        long j = this.f65231;
        if (j != -9223372036854775807L) {
            return this.f23470 + j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46393(long j) {
        this.f65231 = j;
    }

    @RequiresNonNull({"output"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46389(InterfaceC21449 interfaceC21449, C3104 c3104, boolean z, boolean z2) {
        C3104 m9466;
        boolean z3;
        if (z) {
            z3 = this.f65229 != 0;
            m9466 = c3104;
        } else {
            long j = this.f65229;
            long j2 = c3104.f9713;
            m9466 = c3104.m9466(j, j2 != -1 ? j2 - j : -1L);
            z3 = false;
        }
        try {
            C16184 m46387 = m46387(interfaceC21449, m9466, z2);
            if (z3) {
                m46387.mo22062(this.f65229, false);
            }
            do {
                try {
                    try {
                        if (this.f65238) {
                            break;
                        }
                    } catch (EOFException e) {
                        if ((this.f23468.f25608 & 16384) != 0) {
                            ((C8853) this.f65217).f26952.mo4839(0L, 0L);
                        } else {
                            throw e;
                        }
                    }
                } catch (Throwable th) {
                    this.f65229 = (int) (m46387.getPosition() - c3104.f9718);
                    throw th;
                }
            } while (((C8853) this.f65217).m22871(m46387));
            this.f65229 = (int) (m46387.getPosition() - c3104.f9718);
        } finally {
            C8751.m22643(interfaceC21449);
        }
    }

    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16184 m46387(InterfaceC21449 interfaceC21449, C3104 c3104, boolean z) {
        C16184 c16184;
        long j;
        C8853 m8004;
        long mo1620 = interfaceC21449.mo1620(c3104);
        long j2 = this.f23470;
        C9248 c9248 = this.f65234;
        if (z) {
            try {
                c9248.m23732(j2, this.f65240);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        C16184 c161842 = new C16184(interfaceC21449, c3104.f9718, mo1620);
        if (this.f65217 == null) {
            C17714 c17714 = this.f65216;
            c161842.mo22066();
            try {
                c17714.m41481(10);
                c161842.mo22068(false, 0, 10, c17714.m41482());
                if (c17714.m41491() == 4801587) {
                    c17714.m41478(3);
                    int m41467 = c17714.m41467();
                    int i = m41467 + 10;
                    if (i > c17714.m41472()) {
                        byte[] m41482 = c17714.m41482();
                        c17714.m41481(i);
                        System.arraycopy(m41482, 0, c17714.m41482(), 0, 10);
                    }
                    c161842.mo22068(false, 10, m41467, c17714.m41482());
                    C23896 m40822 = this.f65214.m40822(m41467, c17714.m41482());
                    if (m40822 != null) {
                        int m52639 = m40822.m52639();
                        for (int i2 = 0; i2 < m52639; i2++) {
                            InterfaceC14723 m52640 = m40822.m52640(i2);
                            if (m52640 instanceof C9689) {
                                C9689 c9689 = (C9689) m52640;
                                if ("com.apple.streaming.transportStreamTimestamp".equals(c9689.f29300)) {
                                    System.arraycopy(c9689.f29301, 0, c17714.m41482(), 0, 8);
                                    c17714.m41484(0);
                                    c17714.m41486(8);
                                    j = c17714.m41487() & 8589934591L;
                                    break;
                                }
                            }
                        }
                    }
                }
            } catch (EOFException unused2) {
            }
            j = -9223372036854775807L;
            c161842.mo22066();
            InterfaceC4619 interfaceC4619 = this.f65241;
            if (interfaceC4619 != null) {
                m8004 = ((C8853) interfaceC4619).m22870();
                c16184 = c161842;
            } else {
                c16184 = c161842;
                m8004 = ((C2503) this.f65219).m8004(c3104.f9711, this.f23468, this.f65230, this.f65234, interfaceC21449.mo5936(), c16184);
            }
            this.f65217 = m8004;
            InterfaceC1368 mo4843 = m8004.f26952.mo4843();
            if ((mo4843 instanceof C23345) || (mo4843 instanceof C16289) || (mo4843 instanceof C16995) || (mo4843 instanceof C17058)) {
                C17651 c17651 = this.f65226;
                if (j != -9223372036854775807L) {
                    j2 = c9248.m23734(j);
                }
                c17651.m41375(j2);
            } else {
                this.f65226.m41375(0L);
            }
            this.f65226.m41367();
            ((C8853) this.f65217).f26952.mo4840(this.f65226);
        } else {
            c16184 = c161842;
        }
        this.f65226.m41362(this.f65233);
        return c16184;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m46391(String str) {
        if (C15107.m35799(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }
}
