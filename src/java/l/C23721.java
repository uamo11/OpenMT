package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

/* compiled from: I6U1 */
/* renamed from: l.᩻۬ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23721 implements AutoCloseable {

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicBoolean f76797 = new AtomicBoolean();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C2309 f76798;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public volatile long f76799;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f76800;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C21605 f76801;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f76802;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2827 f76803;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final UUID f76804;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f76805;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C10070 f76806;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f76807;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7247 f76808;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C14302 f76809;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f76810;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile boolean f76811;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile boolean f76812;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f76813;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C5131 f76814;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f76815;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f76816;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C15713 f76817;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public long f76818;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f76819;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public C2267 f76820;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0149 f76821;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f76822;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C16419 f76823;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C18077 f76824;

    public /* synthetic */ C23721(C21605 c21605, C2827 c2827, C2267 c2267, C2309 c2309, C8617 c8617, C20194 c20194, C12891 c12891, int i) {
        this(c21605, c2827, c2267, c2309, c8617, c20194, c12891);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final synchronized long m52329() {
        m52328();
        return this.f76798.f7440;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52334(int i, int i2) {
        m52319();
        C5089 c5089 = new C5089(i, i2);
        if (i > this.f76803.length() || i2 > this.f76803.length()) {
            throw new IndexOutOfBoundsException("Selection exceeds text length");
        }
        if (c5089.equals(this.f76798.f7443)) {
            return;
        }
        C2309 c2309 = this.f76798;
        this.f76798 = new C2309(c2309.f7441, c5089, c2309.f7440, c2309.f7444, c2309.f7442);
        m52326(1L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52336(C0149 c0149) {
        if (this.f76821 == c0149) {
            m52319();
            m52318();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52337(C0149 c0149, EnumC0191 enumC0191, EnumC19243 enumC19243) {
        m52318();
        if (this.f76821 != c0149) {
            return;
        }
        m52319();
        C5131 m14683 = this.f76814.m14683(enumC0191, enumC19243);
        this.f76814 = m14683;
        c0149.f1295 = m14683;
        this.f76821 = null;
        m52326(1L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52338(C0149 c0149, C5131 c5131) {
        m52319();
        m52318();
        if (this.f76821 != null) {
            throw new IllegalStateException("Text loader is already active");
        }
        if (c5131 != null) {
            if (this.f76803.length() != 0 || this.f76814.m14685() != null || this.f76798.f7441.m24543() || !this.f76798.f7441.f29155.isEmpty()) {
                throw new IllegalStateException("Initial text loading requires an empty session");
            }
            this.f76814 = c5131;
        } else {
            if (this.f76814.m14691() || this.f76814.m14685() == null) {
                throw new IllegalStateException("No incomplete text source to resume");
            }
            this.f76814 = this.f76814.m14683(EnumC0191.LOADING, EnumC19243.NONE);
        }
        this.f76821 = c0149;
        c0149.f1295 = this.f76814;
        m52326(1L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52340(C10776 c10776, C4922 c4922) {
        C16419 c16419 = this.f76823;
        if (c16419 == null || c16419.f50504 != c10776 || c10776.f32427) {
            throw new IllegalStateException("History replay step is not active");
        }
        c10776.f32427 = true;
        m52301(EnumC14051.USER, c4922, c10776);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52341(C14548 c14548) {
        m52319();
        m52318();
        if (this.f76821 != null || this.f76813) {
            throw new IllegalStateException("Cannot replace active loading or checkpoint session");
        }
        synchronized (c14548) {
            C15007 m34739 = C14548.m34739(c14548);
            C21605 c21605 = m34739.f45762.m32420().f35930;
            C21605 c216052 = this.f76801;
            C20612.f66331.getClass();
            C1561 c1561 = new C1561(c21605, c216052, 0);
            try {
                C15007 m5338 = c1561.m5338(m34739);
                try {
                    C2827 c2827 = new C2827(m5338.f45762.m32420(), m5338.f45762.m30979());
                    C14302 c14302 = new C14302();
                    try {
                        C2309 c2309 = m5338.f45765;
                        C2309 c23092 = new C2309(c2309.f7441.m24540(c14302, c2309.f7442, m52368()), c2309.f7443, c2309.f7440, c2309.f7444, c2309.f7442);
                        C21605 c216053 = this.f76801;
                        C2267 m7494 = C2267.m7494(c216053 == null ? null : c216053.f69370, m5338.f45763.f7359);
                        C2827 c28272 = this.f76803;
                        C2267 c2267 = this.f76820;
                        C14302 c143022 = this.f76809;
                        synchronized (this.f76810) {
                            this.f76803 = c2827;
                        }
                        this.f76820 = m7494;
                        this.f76798 = c23092;
                        this.f76814 = m5338.f45766;
                        this.f76809 = c14302;
                        try {
                            m52326(Math.max(1, c2827.length()));
                            m5338.close();
                            c1561.close();
                        } finally {
                            c28272.close();
                            c2267.close();
                            c143022.m34130();
                        }
                    } catch (Error e) {
                        e = e;
                        c2827.close();
                        c14302.m34130();
                        throw e;
                    } catch (RuntimeException e2) {
                        e = e2;
                        c2827.close();
                        c14302.m34130();
                        throw e;
                    }
                } finally {
                }
            } finally {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52342(C18077 c18077) {
        if (this.f76824 != c18077 || c18077.f56305) {
            throw new IllegalStateException("Text load publication is not active");
        }
        if (!m52312(c18077.f56308, c18077.f56304, c18077.f56309, c18077.f56306, c18077.f56307, c18077)) {
            throw new IllegalStateException("Text load publication was invalidated");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52344(C0149 c0149, char[] cArr, int i, C5131 c5131, int i2) {
        m52318();
        return m52312(c0149, cArr, i, c5131, i2, (C18077) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52345(InterfaceC0897 interfaceC0897, C0149 c0149, char[] cArr, int i, C5131 c5131, int i2) {
        if (this.f76821 == c0149 && !c0149.m1246()) {
            m52319();
            m52318();
            if (this.f76803.length() + i > i2) {
                return false;
            }
            C18077 c18077 = new C18077(c0149, cArr, i, c5131, i2);
            this.f76824 = c18077;
            try {
                if (i == 0) {
                    m52342(c18077);
                } else {
                    interfaceC0897.mo3243(c18077);
                }
                return c18077.f56305;
            } finally {
                this.f76824 = null;
            }
        }
        return false;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52347() {
        m52319();
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m52348() {
        m52328();
        return (byte[]) this.f76820.f7359.clone();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52349() {
        m52319();
        m52318();
        if (this.f76798.f7441.m24543() || !this.f76798.f7441.f29155.isEmpty()) {
            C9611 c9611 = this.f76798.f7441;
            c9611.getClass();
            C9611 c96112 = new C9611(new C15713(), new C15713(), c9611.f29154, c9611.f29153);
            C2309 c2309 = this.f76798;
            this.f76798 = new C2309(c96112, c2309.f7443, c2309.f7440, c2309.f7444, c2309.f7442);
            this.f76809.m34130();
            m52326(1L);
        }
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C5131 m52350() {
        m52328();
        return this.f76814;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final synchronized C15007 m52351() {
        m52328();
        if (this.f76807 || this.f76823 != null || this.f76805 || this.f76824 != null) {
            throw new IllegalStateException("Cannot capture session during edit");
        }
        if (this.f76813 && this.f76802 != this.f76799) {
            throw new IllegalStateException("Current session state requires an explicit checkpoint");
        }
        return new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799);
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m52352() {
        C21605 c21605;
        m52328();
        c21605 = this.f76801;
        return c21605 == null ? this.f76804 : c21605.f69374;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final synchronized C21605 m52353() {
        m52319();
        m52318();
        if (this.f76806 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        this.f76801.m48811();
        return this.f76801;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC3575 m52354(long j) {
        C10070 c10070;
        m52328();
        m52318();
        if (this.f76806 == null && j > this.f76799) {
            throw new IllegalArgumentException("Revision exceeds current session");
        }
        c10070 = this.f76806;
        return c10070 == null ? FutureC3575.m10905(Long.valueOf(this.f76799)) : c10070.m25275(j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52355(byte[] bArr) {
        m52319();
        if (Arrays.equals(this.f76820.f7359, bArr)) {
            return;
        }
        C21605 c21605 = this.f76801;
        C2267 m7494 = C2267.m7494(c21605 == null ? null : c21605.f69370, bArr);
        C2267 c2267 = this.f76820;
        this.f76820 = m7494;
        try {
            m52326(Math.max(1, bArr.length));
        } finally {
            c2267.close();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52356(boolean z) {
        boolean z2;
        m52328();
        C6542 m18043 = C6542.m18043(this.f76798, z);
        if (m18043 != null && !m18043.m18045()) {
            z2 = m18043.m18044();
        }
        return z2;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final synchronized void m52358() {
        m52328();
        C10070 c10070 = this.f76806;
        if (c10070 != null) {
            c10070.m25283();
        }
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C5089 m52359() {
        m52328();
        return this.f76798.f7443;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized C7206 m52360() {
        C7206 c7206;
        m52319();
        m52318();
        if (!this.f76813) {
            throw new IllegalStateException("Explicit checkpoints are not enabled");
        }
        c7206 = new C7206(this, new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799 + 1), this.f76801.f69374, this.f76819);
        this.f76799++;
        return c7206;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52362() {
        m52328();
        return !this.f76798.f7441.f29155.isEmpty();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m52363(long j) {
        m52319();
        m52318();
        if (j < 0) {
            throw new IllegalArgumentException("Invalid history budget");
        }
        C2309 c2309 = this.f76798;
        if (j == c2309.f7442) {
            return;
        }
        C9611 m24540 = c2309.f7441.m24540(this.f76809, j, m52368());
        C2309 c23092 = this.f76798;
        this.f76798 = new C2309(m24540, c23092.f7443, c23092.f7440, c23092.f7444, j);
        m52326(1L);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m52364() {
        m52328();
        return this.f76798.f7441.m24543();
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52365() {
        if (this.f76806 == null) {
            throw new IllegalStateException("Operation requires persistent storage");
        }
        m52319();
        m52318();
        if (this.f76813) {
            return;
        }
        this.f76813 = true;
        this.f76802 = this.f76799;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final synchronized C12704 m52367() {
        m52328();
        if (!this.f76814.m14691()) {
            throw new IllegalStateException("Text loading is incomplete");
        }
        return this.f76803.m8724();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m52369() {
        m52319();
        m52318();
        if (this.f76821 != null) {
            throw new IllegalStateException("Text loading is still active");
        }
        this.f76814 = C5131.f16061;
        m52349();
        m52326(1L);
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final synchronized long m52370() {
        m52328();
        return this.f76798.f7442;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C14548 m52372() {
        m52328();
        m52318();
        if (this.f76807 || this.f76821 != null || !this.f76814.m14691()) {
            throw new IllegalStateException("Cannot transfer incomplete or editing session");
        }
        return new C14548(new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52305(C23721 c23721, BooleanSupplier booleanSupplier, C15007 c15007, C22728 c22728, long j, long j2) {
        c23721.getClass();
        if (booleanSupplier.getAsBoolean() || c23721.f76812 || c23721.f76811 || c23721.f76799 != c15007.f45764) {
            throw new CancellationException("Automatic compaction yielded");
        }
        C11440 c11440 = c22728.f73431;
        if (System.nanoTime() - j >= j2) {
            throw new C1849();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52335(Runnable runnable) {
        long j;
        m52319();
        m52318();
        this.f76817 = new C15713();
        this.f76818 = this.f76798.f7441.f29154;
        this.f76816 = 0L;
        try {
            runnable.run();
            try {
                C2309 c2309 = this.f76798;
                C9611 m24540 = c2309.f7441.m24540(this.f76809, c2309.f7442, m52368());
                C2309 c23092 = this.f76798;
                C2309 c23093 = new C2309(m24540, c23092.f7443, c23092.f7440, c23092.f7444, c23092.f7442);
                this.f76798 = c23093;
                j = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    C14302 c14302 = this.f76809;
                    C9611 c9611 = c23093.f7441;
                    c14302.m34129(c9611.f29156, c9611.f29155);
                } finally {
                    if (j != 0) {
                        m52324(j);
                    }
                }
            } catch (Throwable th) {
                j = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    C14302 c143022 = this.f76809;
                    C9611 c96112 = this.f76798.f7441;
                    c143022.m34129(c96112.f29156, c96112.f29155);
                    if (j != 0) {
                        m52324(j);
                    }
                    throw th;
                } finally {
                    if (j != 0) {
                        m52324(j);
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                this.f76798 = new C2309(this.f76798.f7441.m24540(this.f76809, this.f76798.f7442, m52368()), this.f76798.f7443, this.f76798.f7440, this.f76798.f7444, this.f76798.f7442);
                long j2 = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    this.f76809.m34129(this.f76798.f7441.f29156, this.f76798.f7441.f29155);
                    if (j2 == 0) {
                        throw th2;
                    }
                    m52324(j2);
                    throw th2;
                } finally {
                    if (j2 != 0) {
                        m52324(j2);
                    }
                }
            } catch (Throwable th3) {
                long j3 = this.f76816;
                this.f76816 = 0L;
                this.f76818 = 0L;
                this.f76817 = null;
                try {
                    C14302 c143023 = this.f76809;
                    C9611 c96113 = this.f76798.f7441;
                    c143023.m34129(c96113.f29156, c96113.f29155);
                    if (j3 != 0) {
                        m52324(j3);
                    }
                    throw th3;
                } finally {
                    if (j3 != 0) {
                        m52324(j3);
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m52343(boolean z) {
        C9611 c9611;
        m52319();
        if (this.f76823 != null || this.f76805 || this.f76824 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        C12704 m8724 = this.f76803.m8724();
        try {
            C11999 m32420 = m8724.m32420();
            C11999 m29333 = C11999.m29333(m32420.f35927, m32420.f35928, m32420.f35930);
            int max = Math.max(0, this.f76798.f7443.m14642());
            C2309 c2309 = this.f76798;
            long j = c2309.f7440;
            C23224 c23224 = new C23224(max, j, j, c2309.f7443, m29333, m29333);
            if (this.f76818 != 0) {
                C8905 m24544 = this.f76798.f7441.m24544();
                if (m24544 != null && m24544.f27082 == this.f76818) {
                    C9611 m52296 = m52296(this.f76798.f7441, new C15713().m37044(c23224));
                    C2309 c23092 = this.f76798;
                    this.f76798 = new C2309(m52296, c23092.f7443, c23092.f7440, c23092.f7444, c23092.f7442);
                    this.f76809.m34129(m52296.f29156, m52296.f29155);
                    m52326(1L);
                    m8724.close();
                    return;
                }
                this.f76817 = this.f76817.m37044(c23224);
                m8724.close();
                return;
            }
            if (z) {
                C9611 c96112 = this.f76798.f7441;
                c9611 = new C9611(c96112.f29156, c96112.f29155, c96112.f29154, true);
            } else {
                c9611 = this.f76798.f7441;
            }
            C9611 m24540 = c9611.m24542(c23224, System.currentTimeMillis()).m24540(this.f76809, this.f76798.f7442, m52368());
            C2309 c23093 = this.f76798;
            this.f76798 = new C2309(m24540, c23093.f7443, c23093.f7440, c23093.f7444, c23093.f7442);
            m52326(1L);
            m8724.close();
        } finally {
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01ab: MOVE (r14 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:163:0x01ab */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m52295(final C23721 c23721, final BooleanSupplier booleanSupplier, final C22728 c22728, C20177 c20177) {
        Runnable runnable;
        Runnable runnable2;
        long j;
        RunnableC11022 runnableC11022;
        boolean z;
        int i;
        RunnableC11022 runnableC110222;
        RunnableC11022 runnableC110223;
        C15007 c15007;
        Object obj;
        Throwable th;
        Throwable th2;
        Throwable th3;
        RunnableC11022 runnableC110224;
        C23721 c237212 = c23721;
        c23721.getClass();
        if (booleanSupplier.getAsBoolean()) {
            return -1L;
        }
        AtomicBoolean atomicBoolean = f76797;
        boolean z2 = false;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return -1L;
        }
        RunnableC11022 runnableC110225 = new RunnableC11022();
        try {
            try {
                synchronized (c23721) {
                    try {
                        if (c23721.m52322() && c23721.m52361() >= c237212.f76799) {
                            C7247 c7247 = c237212.f76808;
                            long m34128 = (c237212.f76809.m34128() * 2) + (c237212.f76803.length() * 3) + 65536;
                            final C15007 m52351 = c23721.m52351();
                            try {
                                try {
                                    final long m48808 = m52351.f45762.m32420().f35930.m48808();
                                    c22728.getClass();
                                    if (m48808 < 67108864 || m48808 - m34128 < 33554432 || m48808 / 2 < m34128) {
                                        runnableC110222 = runnableC110225;
                                        runnable2 = null;
                                        j = -1;
                                        m52351.close();
                                    } else {
                                        final long nanoTime = System.nanoTime();
                                        int i2 = c237212.f76822;
                                        j = -1;
                                        try {
                                            long j2 = c22728.f73432;
                                            long j3 = C13132.FOREVER_NS;
                                            if (j2 <= (C13132.FOREVER_NS >> i2)) {
                                                j3 = j2 << i2;
                                            }
                                            c15007 = m52351;
                                            final long j4 = j3;
                                            try {
                                                runnableC110225.f33142 = new Runnable() { // from class: l.֨ۗᩳ
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        C23721.m52305(C23721.this, booleanSupplier, m52351, c22728, nanoTime, j4);
                                                    }
                                                };
                                                runnableC110225.run();
                                                try {
                                                    if (c7247.m19390() < m34128 + 16777216) {
                                                        throw new IOException("Insufficient space for automatic compaction");
                                                    }
                                                    final C22769 m19385 = c7247.m19385(c15007.f45762.m32420().f35930);
                                                    try {
                                                        C1561 c1561 = new C1561(c15007.f45762.m32420().f35930, m19385.f73520);
                                                        try {
                                                            final Runnable runnable3 = runnableC110225.f33142;
                                                            runnableC110225.f33142 = new Runnable() { // from class: l.۠ۗᩳ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    runnable3.run();
                                                                    if (m19385.f73520.m48808() > m48808) {
                                                                        throw new CancellationException("Automatic compaction exceeded source size");
                                                                    }
                                                                }
                                                            };
                                                            c1561.m5339(runnableC110225);
                                                            try {
                                                                if (c23721.m52313(c15007, c1561, m19385, c7247, new C8617(m19385.f73520, runnableC110225), c20177, runnableC110225, m48808)) {
                                                                    c237212.f76822 = 0;
                                                                    long j5 = c15007.f45764;
                                                                    try {
                                                                        c1561.close();
                                                                        try {
                                                                            m19385.close();
                                                                            try {
                                                                                c15007.close();
                                                                                runnableC110225.f33142 = null;
                                                                                atomicBoolean.set(false);
                                                                                return j5;
                                                                            } catch (C1849 unused) {
                                                                                runnableC110224 = runnableC110225;
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                i = 1;
                                                                                runnableC11022 = runnableC110224;
                                                                                c237212.f76822 = Math.min(63, c237212.f76822 + i);
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return -3L;
                                                                            } catch (CancellationException unused2) {
                                                                                runnableC110224 = runnableC110225;
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                runnableC11022 = runnableC110224;
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return j;
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                runnableC110224 = runnableC110225;
                                                                                z2 = false;
                                                                                runnableC110225 = runnableC110224;
                                                                                runnable = null;
                                                                                runnableC110225.f33142 = runnable;
                                                                                f76797.set(z2);
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            th = th;
                                                                            try {
                                                                                c15007.close();
                                                                                throw th;
                                                                            } catch (Throwable th6) {
                                                                                th.addSuppressed(th6);
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        th2 = th;
                                                                        try {
                                                                            m19385.close();
                                                                            throw th2;
                                                                        } catch (Throwable th8) {
                                                                            th2.addSuppressed(th8);
                                                                            throw th2;
                                                                        }
                                                                    }
                                                                }
                                                                runnableC110224 = runnableC110225;
                                                                try {
                                                                    runnableC110224.run();
                                                                    try {
                                                                        c1561.close();
                                                                        try {
                                                                            m19385.close();
                                                                            try {
                                                                                c15007.close();
                                                                                runnableC110224.f33142 = null;
                                                                                atomicBoolean.set(false);
                                                                                return -2L;
                                                                            } catch (C1849 unused3) {
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                i = 1;
                                                                                runnableC11022 = runnableC110224;
                                                                                c237212.f76822 = Math.min(63, c237212.f76822 + i);
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return -3L;
                                                                            } catch (CancellationException unused4) {
                                                                                runnable2 = null;
                                                                                z = false;
                                                                                runnableC11022 = runnableC110224;
                                                                                runnableC11022.f33142 = runnable2;
                                                                                f76797.set(z);
                                                                                return j;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                                z2 = false;
                                                                                runnableC110225 = runnableC110224;
                                                                                runnable = null;
                                                                                runnableC110225.f33142 = runnable;
                                                                                f76797.set(z2);
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th10) {
                                                                            th = th10;
                                                                            th = th;
                                                                            c15007.close();
                                                                            throw th;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        th2 = th;
                                                                        m19385.close();
                                                                        throw th2;
                                                                    }
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    th3 = th;
                                                                    try {
                                                                        try {
                                                                            c1561.close();
                                                                            throw th3;
                                                                        } catch (Throwable th13) {
                                                                            th3.addSuppressed(th13);
                                                                            throw th3;
                                                                        }
                                                                    } catch (Throwable th14) {
                                                                        th = th14;
                                                                        th2 = th;
                                                                        m19385.close();
                                                                        throw th2;
                                                                    }
                                                                }
                                                            } catch (Throwable th15) {
                                                                th = th15;
                                                            }
                                                        } catch (Throwable th16) {
                                                            th3 = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                    }
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    th = th;
                                                    c15007.close();
                                                    throw th;
                                                }
                                            } catch (Throwable th19) {
                                                th = th19;
                                                obj = null;
                                                th = th;
                                                c15007.close();
                                                throw th;
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                            c15007 = m52351;
                                        }
                                    }
                                } catch (Throwable th21) {
                                    th = th21;
                                    c15007 = m52351;
                                    obj = null;
                                }
                            } catch (C1849 unused5) {
                                runnableC11022 = runnableC110225;
                                z = false;
                                i = 1;
                                c237212.f76822 = Math.min(63, c237212.f76822 + i);
                                runnableC11022.f33142 = runnable2;
                                f76797.set(z);
                                return -3L;
                            } catch (CancellationException unused6) {
                                runnableC11022 = runnableC110225;
                                z = false;
                                runnableC11022.f33142 = runnable2;
                                f76797.set(z);
                                return j;
                            } catch (Throwable th22) {
                                th = th22;
                                runnableC110225 = runnableC110223;
                                z2 = false;
                            }
                        }
                        runnableC110222 = runnableC110225;
                        runnable2 = null;
                        j = -1;
                        try {
                        } catch (Throwable th23) {
                            th = th23;
                            runnableC11022 = runnableC110222;
                            z = false;
                            i = 1;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (C1849 unused7) {
                                        c237212 = c237212;
                                        c237212.f76822 = Math.min(63, c237212.f76822 + i);
                                        runnableC11022.f33142 = runnable2;
                                        f76797.set(z);
                                        return -3L;
                                    } catch (CancellationException unused8) {
                                        runnableC11022.f33142 = runnable2;
                                        f76797.set(z);
                                        return j;
                                    }
                                } catch (Throwable th24) {
                                    th = th24;
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th25) {
                        th = th25;
                        runnable2 = null;
                        runnableC11022 = runnableC110225;
                        j = -1;
                    }
                }
                runnableC110222.f33142 = runnable2;
                atomicBoolean.set(false);
                return j;
            } catch (Throwable th26) {
                th = th26;
            }
        } catch (C1849 unused9) {
            runnable2 = null;
        } catch (CancellationException unused10) {
            runnable2 = null;
            j = -1;
        } catch (Throwable th27) {
            th = th27;
            runnable = null;
            runnableC110225 = runnableC110225;
            z2 = false;
            runnableC110225.f33142 = runnable;
            f76797.set(z2);
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00bf A[Catch: all -> 0x01f5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x01f5, blocks: (B:28:0x009b, B:142:0x00bf, B:25:0x0072, B:145:0x0080), top: B:24:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x006e, blocks: (B:150:0x0045, B:30:0x00b4, B:153:0x0052), top: B:149:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[Catch: all -> 0x01f3, TryCatch #3 {all -> 0x01f3, blocks: (B:34:0x00ce, B:36:0x00d7, B:38:0x00e7, B:39:0x00ec, B:41:0x0102, B:43:0x010b, B:44:0x0110, B:46:0x0114, B:47:0x0119, B:55:0x012e, B:71:0x013f, B:72:0x0141, B:73:0x0117, B:74:0x010e, B:77:0x00ea, B:80:0x014d, B:133:0x0159, B:50:0x011e, B:53:0x012a, B:67:0x013c, B:66:0x0139), top: B:33:0x00ce, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021a A[Catch: all -> 0x026d, DONT_GENERATE, TryCatch #8 {, blocks: (B:4:0x0007, B:6:0x0015, B:10:0x0019, B:12:0x0021, B:15:0x002a, B:20:0x0031, B:21:0x0033, B:22:0x0034, B:114:0x0190, B:116:0x0199, B:118:0x019d, B:124:0x01c0, B:126:0x01c9, B:128:0x01cd, B:129:0x01ec, B:92:0x0211, B:94:0x021a, B:96:0x021e, B:97:0x023d, B:100:0x023f, B:102:0x0249, B:104:0x024d, B:105:0x026c, B:14:0x0023, B:107:0x01fb, B:90:0x0203, B:112:0x0182), top: B:3:0x0007, inners: #1, #9, #10 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized l.EnumC16665 m52333(boolean r18, l.InterfaceC7702 r19) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23721.m52333(boolean, l.۟᩶ᩳ):l.ܽ۬ᩳ");
    }

    public C23721(C21605 c21605, C2827 c2827, C2267 c2267, C2309 c2309, C8617 c8617, C20194 c20194, C12891 c12891) {
        this.f76810 = new Object();
        this.f76814 = C5131.f16061;
        this.f76809 = new C14302();
        this.f76815 = new FutureC3575();
        this.f76804 = UUID.randomUUID();
        this.f76801 = c21605;
        this.f76803 = c2827;
        this.f76820 = c2267;
        this.f76798 = c2309;
        C14302 c14302 = this.f76809;
        C9611 c9611 = c2309.f7441;
        c14302.m34129(c9611.f29156, c9611.f29155);
        this.f76799 = c8617.m22370();
        this.f76806 = new C10070(c8617, c21605, c20194, c12891);
    }

    public C23721(CharSequence charSequence) {
        this.f76810 = new Object();
        this.f76814 = C5131.f16061;
        this.f76809 = new C14302();
        this.f76815 = new FutureC3575();
        this.f76804 = UUID.randomUUID();
        this.f76803 = new C2827(charSequence);
        this.f76798 = new C2309();
        this.f76820 = C2267.m7494(null, new byte[0]);
        this.f76806 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23721 m52298(CharSequence charSequence) {
        return new C23721(charSequence);
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m52368() {
        return this.f76806 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52302(InterfaceC20758 interfaceC20758) {
        C7247.m19372(interfaceC20758);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23721 m52300(InterfaceC20758 interfaceC20758, C1143 c1143, C4671 c4671) {
        C7247[] c7247Arr = new C7247[1];
        C22769[] c22769Arr = new C22769[1];
        C23721 c23721 = null;
        try {
            c23721 = m52299(c1143, c4671, C12891.f38696, new C4384(c7247Arr, interfaceC20758, c22769Arr, c1143));
            c7247Arr[0].m19387(c22769Arr[0], c23721.f76799);
            c22769Arr[0].m50847();
            c23721.f76808 = c7247Arr[0];
            return c23721;
        } catch (Throwable th) {
            if (c23721 != null) {
                try {
                    c23721.m52331().m10930();
                } catch (Throwable th2) {
                    try {
                        C22769 c22769 = c22769Arr[0];
                        if (c22769 != null) {
                            c22769.close();
                        }
                        C7247 c7247 = c7247Arr[0];
                        if (c7247 != null) {
                            c7247.close();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        C7247 c72472 = c7247Arr[0];
                        if (c72472 != null) {
                            c72472.close();
                        }
                        throw th3;
                    }
                }
            }
            try {
                C22769 c227692 = c22769Arr[0];
                if (c227692 != null) {
                    c227692.close();
                }
                C7247 c72473 = c7247Arr[0];
                if (c72473 != null) {
                    c72473.close();
                }
                throw th;
            } catch (Throwable th4) {
                C7247 c72474 = c7247Arr[0];
                if (c72474 != null) {
                    c72474.close();
                }
                throw th4;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23721 m52299(C1143 c1143, C4671 c4671, C12891 c12891, C4384 c4384) {
        C21605 c21605;
        C2267 c2267;
        C20194 m13735 = c4671.m13735();
        C2827 c2827 = null;
        try {
            C7247[] c7247Arr = c4384.f14066;
            InterfaceC20758 interfaceC20758 = c4384.f14067;
            C22769[] c22769Arr = c4384.f14068;
            C1143 c11432 = c4384.f14069;
            C7247 m19363 = C7247.m19363(interfaceC20758);
            c7247Arr[0] = m19363;
            C22769 m19383 = m19363.m19383(c11432);
            c22769Arr[0] = m19383;
            c21605 = m19383.f73520;
            try {
                c2267 = C2267.m7494(c1143, new byte[0]);
                try {
                    C2827 c28272 = new C2827(C11999.m29333(c21605.f69369, c21605.f69373, c21605), 0L);
                    try {
                        C8617 c8617 = new C8617(c21605);
                        C2309 c2309 = new C2309();
                        C12704 m8724 = c28272.m8724();
                        try {
                            byte[] bArr = c2267.f7359;
                            synchronized (c8617) {
                                c8617.m22374(m8724, bArr, c2309, null, 0L);
                            }
                            m8724.close();
                            return new C23721(c21605, c28272, c2267, c2309, c8617, m13735, c12891);
                        } finally {
                        }
                    } catch (Throwable th) {
                        th = th;
                        c2827 = c28272;
                        if (c2827 != null) {
                            try {
                                c2827.close();
                            } catch (Throwable th2) {
                                if (c21605 != null) {
                                    try {
                                        c21605.close();
                                    } finally {
                                    }
                                }
                                throw th2;
                            }
                        }
                        if (c2267 != null) {
                            c2267.close();
                        }
                        if (c21605 != null) {
                            try {
                                c21605.close();
                            } finally {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                c2267 = null;
            }
        } catch (Throwable th5) {
            th = th5;
            c21605 = null;
            c2267 = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C17371 m52316(InterfaceC20758 interfaceC20758, C1143 c1143, C4671 c4671) {
        C7247 c7247;
        C21605 c21605;
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        C20194 m13735 = c4671.m13735();
        C9323 c9323 = null;
        try {
            c7247 = C7247.m19379(interfaceC20758);
            try {
                C13596 m19381 = c7247.m19381();
                c21605 = C21605.m48793(interfaceC23015.mo28628(c7247.m19382(m19381), false), c1143);
                try {
                    C8617 c8617 = new C8617(c21605);
                    c9323 = c8617.m22371(C20612.f66331);
                    C7247.m19368(m19381, c21605, c9323.f28277);
                    C17371 c17371 = new C17371(c21605, c8617, c9323, m13735);
                    c17371.f53187 = c7247;
                    return c17371;
                } catch (Throwable th) {
                    th = th;
                    if (c9323 != null) {
                        try {
                            c9323.close();
                        } catch (Throwable th2) {
                            if (c21605 != null) {
                                try {
                                    c21605.close();
                                } catch (Throwable th3) {
                                    if (c7247 != null) {
                                        try {
                                            c7247.close();
                                        } finally {
                                        }
                                    }
                                    throw th3;
                                }
                            }
                            if (c7247 != null) {
                                try {
                                    c7247.close();
                                } finally {
                                }
                            }
                            throw th2;
                        }
                    }
                    if (c21605 != null) {
                        try {
                            c21605.close();
                        } catch (Throwable th4) {
                            if (c7247 != null) {
                                try {
                                    c7247.close();
                                } finally {
                                }
                            }
                            throw th4;
                        }
                    }
                    if (c7247 != null) {
                        try {
                            c7247.close();
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c21605 = null;
            }
        } catch (Throwable th6) {
            th = th6;
            c7247 = null;
            c21605 = null;
        }
    }

    public final int length() {
        int length;
        synchronized (this.f76810) {
            length = this.f76803.length();
        }
        return length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m52330(int i) {
        C11999 m8723;
        synchronized (this.f76810) {
            m8723 = this.f76803.m8723(i);
        }
        C21605 c21605 = m8723.f35930;
        try {
            return m8723.m29340(i);
        } finally {
            if (c21605 != null) {
                c21605.m48812();
            }
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long m52371() {
        return this.f76799;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m52361() {
        C10070 c10070 = this.f76806;
        return c10070 == null ? this.f76799 : c10070.m25282();
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C12704 m52357() {
        C12704 m8724;
        synchronized (this.f76810) {
            m8724 = this.f76803.m8724();
        }
        return m8724;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52346(C12704 c12704) {
        boolean m8726;
        synchronized (this.f76810) {
            m8726 = this.f76803.m8726(c12704);
        }
        return m8726;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52312(final C0149 c0149, final char[] cArr, final int i, final C5131 c5131, int i2, C18077 c18077) {
        if (this.f76821 == c0149 && !c0149.m1246()) {
            m52319();
            long j = i;
            if (this.f76803.length() + j <= i2) {
                this.f76807 = true;
                try {
                    if (i != 0) {
                        this.f76803.m8725(new Consumer() { // from class: l.ۤۗᩳ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C23517.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                C0149 c01492 = C0149.this;
                                char[] cArr2 = cArr;
                                int i3 = i;
                                C5131 c51312 = c5131;
                                C16231 c16231 = (C16231) obj;
                                try {
                                    c01492.m1243();
                                    c16231.m38195(c16231.m38196(), c16231.m38196(), CharBuffer.wrap(cArr2, 0, i3));
                                    c01492.m1244(c51312.m14691());
                                } catch (IOException e) {
                                    throw new UncheckedIOException(e);
                                }
                            }
                        }, null);
                    } else {
                        try {
                            c0149.m1244(c5131.m14691());
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                    this.f76814 = c5131;
                    c0149.f1295 = c5131;
                    if (c18077 != null) {
                        c18077.f56305 = true;
                    }
                    if (c5131.m14691()) {
                        this.f76821 = null;
                    }
                    m52326(Math.max(1L, j * 2));
                    return true;
                } finally {
                    this.f76807 = false;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C9611 m52296(C9611 c9611, C15713 c15713) {
        if (c15713.isEmpty()) {
            return c9611;
        }
        C8905 m24544 = c9611.m24544();
        long currentTimeMillis = System.currentTimeMillis();
        if (m24544 != null) {
            long j = m24544.f27082;
            if (j == this.f76818) {
                return new C9611(c9611.f29156.m37047(new C8905(j, currentTimeMillis, EnumC14051.BATCH, m24544.f27081.m37045(c15713))), c9611.f29155, c9611.f29154, c9611.f29153);
            }
        }
        return c9611.m24541(this.f76817.m37045(c15713), currentTimeMillis);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52339(C3511 c3511) {
        EnumC14051 enumC14051 = EnumC14051.USER;
        synchronized (this) {
            m52301(enumC14051, c3511, (C10776) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.۫ۗᩳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52301(final EnumC14051 enumC14051, final Consumer consumer, C10776 c10776) {
        boolean z;
        m52319();
        EnumC14051 enumC140512 = EnumC14051.LOADER;
        if (enumC14051 == enumC140512) {
            m52318();
        }
        if (enumC14051 != EnumC14051.USER && enumC14051 != EnumC14051.BATCH && enumC14051 != enumC140512) {
            throw new IllegalArgumentException("Unsupported session edit origin");
        }
        int i = 1;
        this.f76807 = true;
        long m8727 = this.f76803.m8727();
        final long[] jArr = new long[1];
        final C2309 c2309 = this.f76798;
        final C2309[] c2309Arr = new C2309[1];
        final C5089[] c5089Arr = {c2309.f7443};
        C23475 c23475 = (enumC14051 == enumC140512 || c10776 != null) ? null : new C23475(enumC14051, c2309.f7440, c2309.f7444, new C17170(i, c5089Arr), true);
        int i2 = 0;
        C16419 c16419 = this.f76823;
        final C23475 c234752 = c16419 != null ? new C23475(EnumC14051.BATCH, c16419.f50503, c16419.f50508, new C2973(i2, c5089Arr), false) : null;
        try {
            final C23475 c234753 = c23475;
            final C23475 c234754 = c23475;
            z = false;
            try {
                this.f76803.m8725(new Consumer() { // from class: l.۬ۗᩳ
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        C23721.m52306(C23721.this, consumer, jArr, c234753, c2309, c2309Arr, c5089Arr, c234752, (C16231) obj);
                    }

                    public /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return C23517.$default$andThen(this, consumer2);
                    }
                }, new InterfaceC9177() { // from class: l.۫ۗᩳ
                    @Override // l.InterfaceC9177
                    /* renamed from: ֫ */
                    public final void mo23583(int i3, int i4, C11999 c11999, C11999 c119992, int i5) {
                        if (EnumC14051.this == EnumC14051.LOADER) {
                            if (i3 != c11999.m29347() || i4 != i3) {
                                throw new IllegalArgumentException("Loader may only append text");
                            }
                            return;
                        }
                        C23475 c234755 = c234754;
                        if (c234755 != null) {
                            c234755.mo23583(i3, i4, c11999, c119992, i5);
                        }
                        C23475 c234756 = c234752;
                        if (c234756 != null) {
                            c234756.mo23583(i3, i4, c11999, c119992, i5);
                        }
                        C5089[] c5089Arr2 = c5089Arr;
                        c5089Arr2[0] = c5089Arr2[0].m14641(i3, i4, i5);
                    }
                });
                if (this.f76803.m8727() != m8727) {
                    if (c234752 != null) {
                        this.f76823.m38693();
                    }
                    this.f76798 = c2309Arr[0];
                    m52326(jArr[0]);
                }
                try {
                    C14302 c14302 = this.f76809;
                    C9611 c9611 = this.f76798.f7441;
                    c14302.m34129(c9611.f29156, c9611.f29155);
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                try {
                    C14302 c143022 = this.f76809;
                    C9611 c96112 = this.f76798.f7441;
                    c143022.m34129(c96112.f29156, c96112.f29155);
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52306(C23721 c23721, Consumer consumer, long[] jArr, C23475 c23475, C2309 c2309, C2309[] c2309Arr, C5089[] c5089Arr, C23475 c234752, C16231 c16231) {
        C9611 m52296;
        consumer.accept(c16231);
        jArr[0] = c16231.m38193();
        if (c23475 == null) {
            m52296 = c2309.f7441;
        } else {
            m52296 = c23721.f76818 != 0 ? c23721.m52296(c2309.f7441, c23475.m51929()) : c23475.m51928(c2309.f7441, System.currentTimeMillis());
        }
        if (c23721.f76818 == 0) {
            m52296 = m52296.m24540(c23721.f76809, c2309.f7442, c23721.m52368());
        }
        C2309 c23092 = new C2309(m52296, c5089Arr[0], c23475 == null ? c2309.f7440 : c23475.m51930(), c23475 == null ? c2309.f7444 : c23475.m51931(), c2309.f7442);
        c2309Arr[0] = c23092;
        if (c234752 != null) {
            c23721.f76823.m38692(c234752, c23092);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public void m52318() {
        if (this.f76823 != null || this.f76805 || this.f76824 != null) {
            throw new IllegalStateException("Operation is unavailable during editable history replay");
        }
        if (this.f76818 != 0) {
            throw new IllegalStateException("Operation is unavailable during history grouping");
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m52326(long j) {
        this.f76799++;
        if (this.f76818 != 0) {
            long max = Math.max(1L, j);
            long j2 = this.f76816;
            long j3 = C13132.FOREVER_NS;
            if (max <= C13132.FOREVER_NS - j2) {
                j3 = j2 + max;
            }
            this.f76816 = j3;
            return;
        }
        m52324(j);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52324(long j) {
        C10070 c10070;
        boolean z = this.f76813;
        long j2 = C13132.FOREVER_NS;
        if (z) {
            long j3 = this.f76819;
            this.f76819 = j > C13132.FOREVER_NS - j3 ? Long.MAX_VALUE : j3 + j;
        }
        C16419 c16419 = this.f76823;
        if (c16419 != null) {
            long j4 = c16419.f50502;
            if (j <= C13132.FOREVER_NS - j4) {
                j2 = j4 + j;
            }
            c16419.f50502 = j2;
            return;
        }
        if (z || (c10070 = this.f76806) == null) {
            return;
        }
        c10070.m25280(new C15007(this.f76803.m8724(), this.f76820, this.f76798, this.f76814, this.f76799), j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14548 m52297(C12951 c12951) {
        return new C14548(C3678.m11205(c12951));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [l.ۛۗᩳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52332(final BooleanSupplier booleanSupplier) {
        final C22728 c22728 = C22728.f73430;
        final C20177 c20177 = new C20177();
        synchronized (this) {
            C11003.requireNonNull(booleanSupplier);
            if (m52322()) {
                return this.f76806.m25276((C5795) new InterfaceC3014() { // from class: l.ۛۗᩳ
                    @Override // l.InterfaceC3014
                    public final long run() {
                        return C23721.m52295(C23721.this, booleanSupplier, c22728, c20177);
                    }
                }, true).m10921((InterfaceC21423) new C18566(6));
            }
            return FutureC3575.m10905(EnumC13555.SKIPPED);
        }
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    private boolean m52322() {
        if (this.f76808 == null || this.f76812 || this.f76811 || this.f76807 || this.f76823 != null || this.f76805 || this.f76824 != null || this.f76821 != null || !this.f76814.m14691()) {
            return false;
        }
        return !this.f76813 || this.f76802 == this.f76799;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13, types: [l.ۖ᩹ᩳ] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52313(C15007 c15007, C1561 c1561, C22769 c22769, C7247 c7247, C8617 c8617, C20177 c20177, Runnable runnable, long j) {
        RunnableC11022 runnableC11022;
        boolean z;
        C14302 c14302;
        AutoCloseable autoCloseable;
        C4425 c4425;
        C4425 c44252;
        ?? r8;
        C21605 c21605;
        AutoCloseable autoCloseable2;
        C4425 c44253;
        C15007 m5338 = c1561.m5338(c15007);
        try {
            runnableC11022 = (RunnableC11022) runnable;
            runnableC11022.run();
            c8617.m22374(m5338.f45762, m5338.f45763.f7359, m5338.f45765, m5338.f45766, m5338.f45764);
            runnableC11022.run();
        } finally {
        }
        if (j > 0 && j - c22769.f73520.m48808() < 33554432) {
            m5338.close();
            return false;
        }
        c7247.m19386(m5338.f45764, c22769, runnable);
        runnableC11022.run();
        C2827 c2827 = new C2827(m5338.f45762.m32420(), m5338.f45762.m30979());
        C14302 c143022 = new C14302();
        C21605 c216052 = null;
        r7 = null;
        r7 = null;
        C14302 c143023 = null;
        try {
            C9611 c9611 = m5338.f45765.f7441;
            c143022.m34129(c9611.f29156, c9611.f29155);
            synchronized (this) {
                try {
                    m52328();
                    if (this.f76811) {
                        throw new CancellationException("Session is closing during compaction");
                    }
                    if (this.f76799 != m5338.f45764) {
                        try {
                            c2827.close();
                            c143022.m34130();
                            m5338.close();
                            return false;
                        } finally {
                        }
                    }
                    runnableC11022.run();
                    c44252 = this.f76806.m25277(c8617, c22769.f73520);
                    try {
                        try {
                            c7247.m19389(c22769, m5338.f45764);
                            r8 = this.f76803;
                            try {
                                c21605 = this.f76801;
                            } catch (Throwable th) {
                                th = th;
                                c21605 = null;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r8 = null;
                            c21605 = r8;
                            z = false;
                            autoCloseable2 = r8;
                            C14302 c143024 = c143023;
                            c44253 = c44252;
                            c14302 = c143024;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            throw th;
                        }
                        try {
                            c143023 = this.f76809;
                            this.f76801 = c22769.m50847();
                            synchronized (this.f76810) {
                                this.f76803 = c2827;
                            }
                            this.f76798 = m5338.f45765;
                            this.f76809 = c143022;
                            c44252.m13147();
                            try {
                                try {
                                    c21605.m48804().m10910((InterfaceC8017) new C14966(this, c7247, c21605.f69370));
                                    try {
                                        r8.close();
                                        try {
                                            c21605.close();
                                            m5338.close();
                                            return true;
                                        } finally {
                                        }
                                    } catch (Throwable th4) {
                                        try {
                                            c21605.close();
                                            throw th4;
                                        } finally {
                                        }
                                    }
                                } finally {
                                    c44252.close();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                z = true;
                                autoCloseable2 = r8;
                                C14302 c1430242 = c143023;
                                c44253 = c44252;
                                c14302 = c1430242;
                                while (true) {
                                    break;
                                    break;
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            z = false;
                            autoCloseable2 = r8;
                            C14302 c14302422 = c143023;
                            c44253 = c44252;
                            c14302 = c14302422;
                            while (true) {
                                break;
                                break;
                            }
                            throw th;
                        }
                    } catch (IOException | Error | RuntimeException e) {
                        if (c7247.m19393()) {
                            this.f76806.m25279(e);
                        }
                        throw e;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    c44252 = null;
                    r8 = null;
                }
            }
            try {
                break;
                throw th;
            } catch (Throwable th8) {
                th = th8;
                C21605 c216053 = c21605;
                c4425 = c44253;
                c216052 = c216053;
                autoCloseable = autoCloseable2;
                try {
                    if (z) {
                        c216052.m48804().m10910((InterfaceC8017) new C14966(this, c7247, c216052.f69370));
                        try {
                            autoCloseable.close();
                            try {
                                c216052.close();
                                c14302.m34130();
                            } finally {
                            }
                        } catch (Throwable th9) {
                            try {
                                c216052.close();
                                throw th9;
                            } finally {
                            }
                        }
                    } else {
                        try {
                            c2827.close();
                            c143022.m34130();
                        } finally {
                        }
                    }
                    throw th;
                } finally {
                    if (c4425 != null) {
                        c4425.close();
                    }
                }
            }
        } catch (Throwable th10) {
            th = th10;
            z = false;
            c14302 = null;
            autoCloseable = null;
            c4425 = null;
        }
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    private void m52328() {
        if (this.f76812) {
            throw new C2121("Text session is closed");
        }
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    private void m52319() {
        m52325();
        if (this.f76799 == C13132.FOREVER_NS) {
            throw new IllegalStateException("Session revision exhausted");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public void m52325() {
        m52328();
        C7247 c7247 = this.f76808;
        if (c7247 != null && c7247.m19393()) {
            throw new IllegalStateException("Recovery generation requires reopening");
        }
        if (this.f76811 || this.f76807) {
            throw new IllegalStateException("Text session is closing or already editing");
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52366() {
        synchronized (this) {
            if (this.f76812) {
                return this.f76815;
            }
            if (this.f76806 == null) {
                return m52331();
            }
            FutureC3575 futureC3575 = this.f76800;
            if (futureC3575 != null) {
                return futureC3575;
            }
            if (!this.f76807 && this.f76823 == null && !this.f76805 && this.f76824 == null && this.f76818 == 0) {
                if (this.f76813 && this.f76802 != this.f76799) {
                    throw new IllegalStateException("Current session state requires an explicit checkpoint");
                }
                if (this.f76813 && this.f76821 != null) {
                    throw new IllegalStateException("Stop loading before the final explicit checkpoint");
                }
                C7247 c7247 = this.f76808;
                if (c7247 == null || !c7247.m19393()) {
                    C0149 c0149 = this.f76821;
                    if (c0149 != null) {
                        C5131 m14683 = this.f76814.m14683(EnumC0191.CANCELED, EnumC19243.NONE);
                        this.f76814 = m14683;
                        c0149.f1295 = m14683;
                        this.f76821 = null;
                        m52326(1L);
                    }
                    this.f76811 = true;
                    FutureC3575 futureC35752 = new FutureC3575();
                    this.f76800 = futureC35752;
                    long j = this.f76799;
                    if (c0149 != null) {
                        c0149.m1247();
                    }
                    this.f76806.m25275(j).m10910((InterfaceC8017) new C20068(this, futureC35752));
                    return futureC35752;
                }
                FutureC3575 futureC35753 = new FutureC3575();
                futureC35753.m10914((Throwable) new IOException("Recovery generation requires reopening; abandon before recovery"));
                return futureC35753;
            }
            throw new IllegalStateException("Cannot close during session edit");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m52308(C23721 c23721, FutureC3575 futureC3575, Throwable th) {
        if (th != null) {
            synchronized (c23721) {
                c23721.f76811 = false;
                c23721.f76800 = null;
            }
            futureC3575.m10914(th);
            return;
        }
        c23721.m52331().m10910((InterfaceC8017) new C19907(futureC3575));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m52331() {
        synchronized (this) {
            if (this.f76812) {
                return this.f76815;
            }
            if (this.f76807 || this.f76823 != null || this.f76805 || this.f76824 != null || this.f76818 != 0) {
                throw new IllegalStateException("Cannot abandon during session edit");
            }
            C0149 c0149 = this.f76821;
            if (c0149 != null) {
                c0149.f1295 = this.f76814.m14683(EnumC0191.CANCELED, EnumC19243.NONE);
            }
            this.f76821 = null;
            this.f76812 = true;
            C2267 c2267 = this.f76820;
            this.f76820 = null;
            this.f76798 = null;
            final C7247 c7247 = this.f76808;
            this.f76808 = null;
            this.f76809.m34130();
            if (c0149 != null) {
                c0149.m1247();
            }
            try {
                this.f76803.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                c2267.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else if (th != th2) {
                    th.addSuppressed(th2);
                }
            }
            try {
                C21605 c21605 = this.f76801;
                if (c21605 != null) {
                    c21605.close();
                }
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else if (th != th3) {
                    th.addSuppressed(th3);
                }
            }
            C10070 c10070 = this.f76806;
            if (c10070 == null) {
                if (th == null) {
                    this.f76815.m10912((Object) null);
                } else {
                    this.f76815.m10914(th);
                }
                return this.f76815;
            }
            c10070.m25284().m10910(new InterfaceC8017() { // from class: l.᩹ۗᩳ
                @Override // l.InterfaceC8017
                /* renamed from: ۧ */
                public final void mo4663(Object obj, Throwable th4) {
                    C23721.m52304(C23721.this, th, c7247, th4);
                }
            });
            this.f76806.m25278();
            return this.f76815;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52304(C23721 c23721, Throwable th, C7247 c7247, Throwable th2) {
        FutureC3575 futureC3575 = c23721.f76815;
        if (th2 != null) {
            if (th == null) {
                th = th2;
            } else if (th != th2) {
                th.addSuppressed(th2);
            }
        }
        if (c7247 != null) {
            try {
                c7247.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                } else if (th != th3) {
                    th.addSuppressed(th3);
                }
            }
        }
        if (th == null) {
            futureC3575.m10912((Object) null);
        } else {
            futureC3575.m10914(th);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        FutureC3575 m52366 = m52366();
        if (C4671.m13734() && !m52366.isDone()) {
            throw new IllegalStateException("Use closeAsync from persistence callbacks");
        }
        try {
            m52366.m10930();
        } catch (C13452 e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException("Failed to close text session", cause);
            }
            throw ((RuntimeException) cause);
        }
    }
}
