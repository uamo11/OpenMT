package l;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.cb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: W8Q2 */
/* renamed from: l.ܺ۟֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC15783 extends AbstractC4930 {

    /* renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public static final byte[] f48634 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, UTF8.S_CS3, 0, 0, 1, 101, -120, -124, cb.k, -50, KeyFactorySpi.Ed448_type, 24, -96, 0, 47, -65, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 49, -61, 39, 93, 120};

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f48635;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public MediaCrypto f48636;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f48637;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final C21843 f48638;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48639;

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f48640;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f48641;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public long f48642;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public boolean f48643;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public C8729 f48644;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC10846 f48645;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public long f48646;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public boolean f48647;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public boolean f48648;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f48649;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public boolean f48650;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public MediaFormat f48651;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public C20724 f48652;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f48653;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f48654;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public int f48655;

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public long f48656;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public boolean f48657;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final C3167 f48658;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f48659;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public long f48660;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f48661;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public boolean f48662;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public float f48663;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public C18273 f48664;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public float f48665;

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public float f48666;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f48667;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public long f48668;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public boolean f48669;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f48670;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f48671;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48672;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f48673;

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public boolean f48674;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final float f48675;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C8353 f48676;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public long f48677;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f48678;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f48679;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public long f48680;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C3519 f48681;

    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public boolean f48682;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f48683;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final boolean f48684;

    /* renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7194 f48685;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f48686;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public long f48687;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13850 f48688;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2379 f48689;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f48690;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public int f48691;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C13145 f48692;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48693;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C17195 f48694;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f48695;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C8353 f48696;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C8353 f48697;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f48698;

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48699;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public ArrayDeque f48700;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public int f48701;

    /* renamed from: ֫ */
    public abstract float mo13444(float f, C8353 c8353, C8353[] c8353Arr);

    /* renamed from: ֫ */
    public abstract int mo13445(InterfaceC2379 interfaceC2379, C8353 c8353);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo37213(C21843 c21843) {
        return 0;
    }

    /* renamed from: ֫ */
    public abstract ArrayList mo13446(InterfaceC2379 interfaceC2379, C8353 c8353, boolean z);

    /* renamed from: ֫ */
    public abstract C13396 mo13448(C17195 c17195, C8353 c8353, C8353 c83532);

    /* renamed from: ֫ */
    public abstract C23023 mo13449(C17195 c17195, C8353 c8353, MediaCrypto mediaCrypto, float f);

    /* renamed from: ֫ */
    public abstract void mo13452(Exception exc);

    /* renamed from: ֫ */
    public abstract void mo13453(String str);

    /* renamed from: ֫ */
    public abstract void mo13454(String str, long j, long j2);

    /* renamed from: ֫ */
    public abstract void mo13456(C8353 c8353, MediaFormat mediaFormat);

    /* renamed from: ֫ */
    public abstract boolean mo13458(long j, long j2, InterfaceC10846 interfaceC10846, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8353 c8353);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo37216(C17195 c17195) {
        return true;
    }

    /* renamed from: ۚ֫ */
    public abstract void mo13460();

    /* renamed from: ۧ */
    public abstract void mo13465(C21843 c21843);

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean mo37226() {
        return false;
    }

    /* renamed from: ܽ */
    public void mo13469(long j) {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo37229(C21843 c21843) {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo37230(C8353 c8353) {
        return true;
    }

    /* renamed from: ᩳ */
    public boolean mo13470(C8353 c8353) {
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean mo37235(C21843 c21843) {
        return false;
    }

    @Override // l.AbstractC4930, l.InterfaceC18065
    /* renamed from: ᩵ */
    public final int mo14368() {
        return 8;
    }

    /* renamed from: ᩵֫ */
    public abstract void mo13472();

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean mo37240() {
        return true;
    }

    public AbstractC15783(int i, InterfaceC13850 interfaceC13850, InterfaceC2379 interfaceC2379, boolean z, float f) {
        super(i);
        this.f48688 = interfaceC13850;
        interfaceC2379.getClass();
        this.f48689 = interfaceC2379;
        this.f48684 = z;
        this.f48675 = f;
        this.f48638 = new C21843(0, 0);
        this.f48653 = new C21843(0, 0);
        this.f48679 = new C21843(2, 0);
        C13145 c13145 = new C13145();
        this.f48692 = c13145;
        this.f48695 = new MediaCodec.BufferInfo();
        this.f48665 = 1.0f;
        this.f48666 = 1.0f;
        this.f48668 = -9223372036854775807L;
        this.f48670 = new ArrayDeque();
        this.f48644 = C8729.f26571;
        c13145.m49228(0);
        c13145.f69995.order(ByteOrder.nativeOrder());
        this.f48658 = new C3167();
        this.f48663 = -1.0f;
        this.f48686 = 0;
        this.f48655 = 0;
        this.f48701 = -1;
        this.f48691 = -1;
        this.f48677 = -9223372036854775807L;
        this.f48680 = -9223372036854775807L;
        this.f48642 = -9223372036854775807L;
        this.f48687 = -9223372036854775807L;
        this.f48646 = -9223372036854775807L;
        this.f48649 = 0;
        this.f48635 = 0;
        this.f48681 = new C3519();
        this.f48656 = -9223372036854775807L;
        this.f48660 = -9223372036854775807L;
    }

    @Override // l.InterfaceC18065
    /* renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        try {
            return mo13445(this.f48689, c8353);
        } catch (C5201 e) {
            throw m14356(e, c8353, 4002);
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۧ */
    public final long mo6097(long j, long j2) {
        return mo13467(j, j2);
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m37217() {
        this.f48683 = true;
    }

    /* renamed from: ܽ */
    public long mo13467(long j, long j2) {
        return super.mo6097(j, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r7 != 4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
    
        if (r2.getError() != null) goto L69;
     */
    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m37237() {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15783.m37237():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37224(C8353 c8353) {
        return this.f48640 == null && mo13470(c8353);
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37219() {
        return this.f48659;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37215(C18273 c18273) {
        this.f48664 = c18273;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m37232(long j) {
        C8353 c8353 = (C8353) this.f48644.f26572.m47028(j);
        if (c8353 == null && this.f48650 && this.f48651 != null) {
            c8353 = (C8353) this.f48644.f26572.m47027();
        }
        if (c8353 != null) {
            this.f48697 = c8353;
        } else if (!this.f48667 || this.f48697 == null) {
            return;
        }
        C8353 c83532 = this.f48697;
        c83532.getClass();
        mo13456(c83532, this.f48651);
        this.f48667 = false;
        this.f48650 = false;
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10846 m37231() {
        return this.f48645;
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C8353 m37233() {
        return this.f48696;
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final MediaFormat m37242() {
        return this.f48651;
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C17195 m37236() {
        return this.f48694;
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public void mo13457(boolean z, boolean z2) {
        this.f48681 = new C3519();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r7 >= r5) goto L16;
     */
    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo14359(l.C8353[] r14, long r15, long r17, l.C15894 r19) {
        /*
            r13 = this;
            r0 = r13
            l.ۡ۟֫ r1 = r0.f48644
            long r1 = r1.f26575
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L27
            l.ۡ۟֫ r1 = new l.ۡ۟֫
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r1
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r13.m37198(r1)
            boolean r1 = r0.f48683
            if (r1 == 0) goto L5b
            r13.mo13472()
            return
        L27:
            java.util.ArrayDeque r1 = r0.f48670
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5c
            long r5 = r0.f48680
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L3f
            long r7 = r0.f48687
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L5c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L5c
        L3f:
            l.ۡ۟֫ r1 = new l.ۡ۟֫
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r15
            r10 = r17
            r5.<init>(r6, r8, r10)
            r13.m37198(r1)
            l.ۡ۟֫ r1 = r0.f48644
            long r1 = r1.f26575
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L5b
            r13.mo13472()
        L5b:
            return
        L5c:
            l.ۡ۟֫ r2 = new l.ۡ۟֫
            long r7 = r0.f48680
            r6 = r2
            r9 = r15
            r11 = r17
            r6.<init>(r7, r9, r11)
            r1.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15783.mo14359(l.۠ᩴ֫[], long, long, l.ܺۧۧ):void");
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public void mo13451(long j, boolean z) {
        this.f48654 = false;
        this.f48648 = false;
        this.f48672 = false;
        if (!this.f48659) {
            m37225();
        } else {
            this.f48680 = -9223372036854775807L;
            this.f48642 = -9223372036854775807L;
            this.f48687 = -9223372036854775807L;
            this.f48661 = false;
            this.f48692.mo7();
            this.f48679.mo7();
            this.f48641 = false;
            this.f48658.m9720();
        }
        if (this.f48644.f26572.m47029() > 0) {
            this.f48682 = true;
        }
        this.f48644.f26572.m47025();
        this.f48670.clear();
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ֫ */
    public void mo6085(float f, float f2) {
        this.f48665 = f;
        this.f48666 = f2;
        m37209(this.f48696);
    }

    @Override // l.AbstractC4930
    /* renamed from: ۤ */
    public void mo13464() {
        this.f48676 = null;
        m37198(C8729.f26571);
        this.f48670.clear();
        if (!this.f48659) {
            m37205();
            return;
        }
        this.f48659 = false;
        this.f48680 = -9223372036854775807L;
        this.f48642 = -9223372036854775807L;
        this.f48687 = -9223372036854775807L;
        this.f48661 = false;
        this.f48692.mo7();
        this.f48679.mo7();
        this.f48641 = false;
        this.f48658.m9720();
    }

    @Override // l.AbstractC4930
    /* renamed from: ᩺ */
    public void mo13473() {
        try {
            this.f48659 = false;
            this.f48680 = -9223372036854775807L;
            this.f48642 = -9223372036854775807L;
            this.f48687 = -9223372036854775807L;
            this.f48661 = false;
            this.f48692.mo7();
            this.f48679.mo7();
            this.f48641 = false;
            this.f48658.m9720();
            m37211();
        } finally {
            C18566.m43106(this.f48640, (InterfaceC0220) null);
            this.f48640 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final void m37211() {
        try {
            InterfaceC10846 interfaceC10846 = this.f48645;
            if (interfaceC10846 != null) {
                interfaceC10846.mo9417();
                this.f48681.f11175++;
                C17195 c17195 = this.f48694;
                c17195.getClass();
                mo13453(c17195.f52721);
            }
            this.f48645 = null;
            try {
                MediaCrypto mediaCrypto = this.f48636;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f48645 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f48636;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* renamed from: ֫ */
    public void mo13450(int i, Object obj) {
        if (i == 11) {
            InterfaceC7194 interfaceC7194 = (InterfaceC7194) obj;
            interfaceC7194.getClass();
            this.f48685 = interfaceC7194;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2 A[Catch: IllegalStateException -> 0x00a4, CryptoException -> 0x00ec, DONT_GENERATE, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x00ec, IllegalStateException -> 0x00a4, blocks: (B:8:0x000f, B:10:0x0013, B:13:0x0017, B:15:0x001b, B:18:0x0023, B:20:0x002a, B:21:0x002f, B:25:0x0036, B:26:0x009e, B:27:0x00a1, B:28:0x00a2, B:30:0x003a, B:32:0x003e, B:33:0x004b, B:35:0x0056, B:37:0x005c, B:45:0x0070, B:47:0x0076, B:49:0x007c, B:60:0x0090), top: B:7:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f A[LOOP:1: B:33:0x004b->B:42:0x006f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070 A[EDGE_INSN: B:43:0x0070->B:44:? BREAK  A[LOOP:1: B:33:0x004b->B:42:0x006f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008f A[LOOP:2: B:45:0x0070->B:54:0x008f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0036 A[EDGE_INSN: B:55:0x0036->B:25:0x0036 BREAK  A[LOOP:2: B:45:0x0070->B:54:0x008f], SYNTHETIC] */
    @Override // l.InterfaceC1837
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo6088(long r11, long r13) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15783.mo6088(long, long):void");
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m37225() {
        if (m37205()) {
            m37237();
        }
    }

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    private boolean m37205() {
        if (this.f48645 != null) {
            if (mo37241()) {
                m37211();
                return true;
            }
            if (mo37240()) {
                m37206();
                return false;
            }
            if (this.f48660 != -9223372036854775807L) {
                long m14371 = m14371();
                long j = this.f48660;
                if (m14371 <= j && this.f48687 < j) {
                    this.f48674 = true;
                    this.f48660 = -9223372036854775807L;
                }
            }
        }
        return false;
    }

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean mo37241() {
        int i = this.f48635;
        if (i == 3 || ((this.f48669 && !this.f48657) || (this.f48647 && this.f48673))) {
            return true;
        }
        if (i == 2) {
            int i2 = Build.VERSION.SDK_INT;
            C22632.m50634(i2 >= 23);
            if (i2 >= 23) {
                try {
                    m37203();
                    return false;
                } catch (C18273 e) {
                    C19956.m46036("Failed to update the DRM session, releasing the codec instead.", e);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37218() {
        return this.f48674;
    }

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    private void m37206() {
        try {
            InterfaceC10846 interfaceC10846 = this.f48645;
            C22632.m50632(interfaceC10846);
            interfaceC10846.flush();
        } finally {
            mo37212();
        }
    }

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final void m37221() {
        mo37212();
        this.f48664 = null;
        this.f48700 = null;
        this.f48694 = null;
        this.f48696 = null;
        this.f48651 = null;
        this.f48667 = false;
        this.f48657 = false;
        this.f48663 = -1.0f;
        this.f48686 = 0;
        this.f48669 = false;
        this.f48647 = false;
        this.f48643 = false;
        this.f48671 = false;
        this.f48639 = false;
        this.f48655 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17901 mo37214(IllegalStateException illegalStateException, C17195 c17195) {
        return new C17901(illegalStateException, c17195);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37200(int i) {
        C3002 m14370 = m14370();
        C21843 c21843 = this.f48638;
        c21843.mo7();
        int m14355 = m14355(m14370, c21843, i | 4);
        if (m14355 == -5) {
            mo13447(m14370);
            return true;
        }
        if (m14355 != -4 || !c21843.m12697()) {
            return false;
        }
        this.f48654 = true;
        m37204();
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37196(MediaCrypto mediaCrypto, boolean z) {
        C8353 c8353 = this.f48676;
        c8353.getClass();
        if (this.f48700 == null) {
            try {
                List m37194 = m37194(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.f48700 = arrayDeque;
                if (this.f48684) {
                    arrayDeque.addAll(m37194);
                } else {
                    ArrayList arrayList = (ArrayList) m37194;
                    if (!arrayList.isEmpty()) {
                        this.f48700.add((C17195) arrayList.get(0));
                    }
                }
                this.f48652 = null;
            } catch (C5201 e) {
                throw new C20724(c8353, e, z, -49998);
            }
        }
        if (this.f48700.isEmpty()) {
            throw new C20724(c8353, (C5201) null, z, -49999);
        }
        ArrayDeque arrayDeque2 = this.f48700;
        arrayDeque2.getClass();
        while (this.f48645 == null) {
            C17195 c17195 = (C17195) arrayDeque2.peekFirst();
            c17195.getClass();
            if (!mo37230(c8353) || !mo37216(c17195)) {
                return;
            }
            try {
                m37199(c17195, mediaCrypto);
            } catch (Exception e2) {
                C19956.m46036("Failed to initialize decoder: " + c17195, e2);
                arrayDeque2.removeFirst();
                C20724 c20724 = new C20724(c8353, e2, z, c17195);
                mo13452(c20724);
                if (this.f48652 == null) {
                    this.f48652 = c20724;
                } else {
                    this.f48652 = C20724.m47330(this.f48652);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.f48652;
                }
            }
        }
        this.f48700 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m37194(boolean z) {
        C8353 c8353 = this.f48676;
        c8353.getClass();
        InterfaceC2379 interfaceC2379 = this.f48689;
        ArrayList mo13446 = mo13446(interfaceC2379, c8353, z);
        if (!mo13446.isEmpty() || !z) {
            return mo13446;
        }
        ArrayList mo134462 = mo13446(interfaceC2379, c8353, false);
        if (!mo134462.isEmpty()) {
            C19956.m46037("Drm session requires secure decoder for " + c8353.f25614 + ", but no secure decoder available. Trying to proceed with " + mo134462 + ".");
        }
        return mo134462;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a0  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m37199(l.C17195 r12, android.media.MediaCrypto r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15783.m37199(l.ܿ۟֫, android.media.MediaCrypto):void");
    }

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public void mo37212() {
        this.f48701 = -1;
        this.f48653.f69995 = null;
        this.f48691 = -1;
        this.f48678 = null;
        this.f48680 = -9223372036854775807L;
        this.f48642 = -9223372036854775807L;
        this.f48687 = -9223372036854775807L;
        this.f48677 = -9223372036854775807L;
        this.f48673 = false;
        this.f48646 = -9223372036854775807L;
        this.f48698 = false;
        this.f48690 = false;
        this.f48699 = false;
        this.f48693 = false;
        this.f48662 = false;
        this.f48649 = 0;
        this.f48635 = 0;
        this.f48655 = this.f48639 ? 1 : 0;
        this.f48674 = false;
        this.f48656 = -9223372036854775807L;
        this.f48660 = -9223372036854775807L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37197(InterfaceC0220 interfaceC0220) {
        C18566.m43106(this.f48637, interfaceC0220);
        this.f48637 = interfaceC0220;
    }

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    private boolean m37201() {
        InterfaceC10846 interfaceC10846 = this.f48645;
        if (interfaceC10846 == null || this.f48649 == 2 || this.f48654) {
            return false;
        }
        int i = this.f48701;
        C21843 c21843 = this.f48653;
        if (i < 0) {
            int mo9430 = interfaceC10846.mo9430();
            this.f48701 = mo9430;
            if (mo9430 < 0) {
                return false;
            }
            c21843.f69995 = interfaceC10846.mo9427(mo9430);
            c21843.mo7();
        }
        if (this.f48649 == 1) {
            if (!this.f48671) {
                this.f48673 = true;
                interfaceC10846.mo9419(this.f48701, 0, 4, 0L);
                this.f48701 = -1;
                c21843.f69995 = null;
            }
            this.f48649 = 2;
            return false;
        }
        if (this.f48690) {
            this.f48690 = false;
            ByteBuffer byteBuffer = c21843.f69995;
            byteBuffer.getClass();
            byteBuffer.put(f48634);
            interfaceC10846.mo9419(this.f48701, 38, 0, 0L);
            this.f48701 = -1;
            c21843.f69995 = null;
            this.f48698 = true;
            return true;
        }
        if (this.f48655 == 1) {
            int i2 = 0;
            while (true) {
                C8353 c8353 = this.f48696;
                c8353.getClass();
                if (i2 >= c8353.f25634.size()) {
                    break;
                }
                byte[] bArr = (byte[]) this.f48696.f25634.get(i2);
                ByteBuffer byteBuffer2 = c21843.f69995;
                byteBuffer2.getClass();
                byteBuffer2.put(bArr);
                i2++;
            }
            this.f48655 = 2;
        }
        ByteBuffer byteBuffer3 = c21843.f69995;
        byteBuffer3.getClass();
        int position = byteBuffer3.position();
        C3002 m14370 = m14370();
        try {
            int m14355 = m14355(m14370, c21843, 0);
            if (m14355 == -3) {
                if (!mo6104()) {
                    return false;
                }
                this.f48642 = this.f48680;
                return false;
            }
            if (m14355 == -5) {
                if (this.f48655 == 2) {
                    c21843.mo7();
                    this.f48655 = 1;
                }
                mo13447(m14370);
                return true;
            }
            if (c21843.m12697()) {
                this.f48642 = this.f48680;
                if (this.f48655 == 2) {
                    c21843.mo7();
                    this.f48655 = 1;
                }
                this.f48654 = true;
                if (!this.f48698) {
                    m37204();
                    return false;
                }
                if (this.f48671) {
                    return false;
                }
                this.f48673 = true;
                interfaceC10846.mo9419(this.f48701, 0, 4, 0L);
                this.f48701 = -1;
                c21843.f69995 = null;
                return false;
            }
            if (!this.f48698 && !c21843.m12690()) {
                c21843.mo7();
                if (this.f48655 == 2) {
                    this.f48655 = 1;
                    return true;
                }
            } else if (!mo37235(c21843)) {
                boolean m49227 = c21843.m49227();
                if (m49227) {
                    c21843.f70000.m15919(position);
                }
                long j = c21843.f69997;
                if (this.f48682) {
                    ArrayDeque arrayDeque = this.f48670;
                    if (arrayDeque.isEmpty()) {
                        C20537 c20537 = this.f48644.f26572;
                        C8353 c83532 = this.f48676;
                        c83532.getClass();
                        c20537.m47026(j, c83532);
                    } else {
                        C20537 c205372 = ((C8729) arrayDeque.peekLast()).f26572;
                        C8353 c83533 = this.f48676;
                        c83533.getClass();
                        c205372.m47026(j, c83533);
                    }
                    this.f48682 = false;
                }
                this.f48680 = Math.max(this.f48680, j);
                if (mo6104() || c21843.m12689()) {
                    this.f48642 = this.f48680;
                }
                c21843.m49229();
                if (c21843.m12694()) {
                    mo13465(c21843);
                }
                mo37229(c21843);
                int mo37213 = mo37213(c21843);
                if ((Build.VERSION.SDK_INT < 34 || (mo37213 & 32) == 0) && !m14367().f53168) {
                    this.f48660 = Math.max(this.f48660, c21843.f69997);
                }
                if (m49227) {
                    interfaceC10846.mo9421(this.f48701, c21843.f70000, j, mo37213);
                } else {
                    int i3 = this.f48701;
                    ByteBuffer byteBuffer4 = c21843.f69995;
                    byteBuffer4.getClass();
                    interfaceC10846.mo9419(i3, byteBuffer4.limit(), mo37213, j);
                }
                this.f48701 = -1;
                c21843.f69995 = null;
                this.f48698 = true;
                this.f48655 = 0;
                this.f48681.f11182++;
                return true;
            }
            return true;
        } catch (C15491 e) {
            mo13452(e);
            m37200(0);
            m37206();
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0159, code lost:
    
        if (m37202() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        if (r3.mo1471(r2) != false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0113, code lost:
    
        if (m37202() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0145, code lost:
    
        if (m37202() == false) goto L114;
     */
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C13396 mo13447(l.C3002 r13) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15783.mo13447(l.ۗۙ֫):l.۬᩹֫");
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final long m37220() {
        return this.f48642;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo37234(long j) {
        this.f48687 = j;
        while (true) {
            ArrayDeque arrayDeque = this.f48670;
            if (arrayDeque.isEmpty() || j < ((C8729) arrayDeque.peek()).f26573) {
                return;
            }
            C8729 c8729 = (C8729) arrayDeque.poll();
            c8729.getClass();
            m37198(c8729);
            mo13472();
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۧ */
    public boolean mo6098() {
        return this.f48648;
    }

    @Override // l.InterfaceC1837
    /* renamed from: ܿ */
    public boolean mo6101() {
        if (this.f48676 == null) {
            return false;
        }
        if (m14365() || this.f48691 >= 0) {
            return true;
        }
        return this.f48677 != -9223372036854775807L && m14362().mo33834() < this.f48677;
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final float m37222() {
        return this.f48665;
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC7194 m37228() {
        return this.f48685;
    }

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final void m37238() {
        m37209(this.f48696);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m37209(C8353 c8353) {
        if (Build.VERSION.SDK_INT >= 23 && this.f48645 != null && this.f48635 != 3 && getState() != 0) {
            float f = this.f48666;
            c8353.getClass();
            float mo13444 = mo13444(f, c8353, m14361());
            float f2 = this.f48663;
            if (f2 != mo13444) {
                if (mo13444 == -1.0f) {
                    if (this.f48698) {
                        this.f48649 = 1;
                        this.f48635 = 3;
                        return false;
                    }
                    m37211();
                    m37237();
                    return false;
                }
                if (f2 != -1.0f || mo13444 > this.f48675) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", mo13444);
                    InterfaceC10846 interfaceC10846 = this.f48645;
                    interfaceC10846.getClass();
                    interfaceC10846.mo9422(bundle);
                    this.f48663 = mo13444;
                }
            }
        }
        return true;
    }

    @TargetApi(23)
    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    private boolean m37202() {
        if (this.f48698) {
            this.f48649 = 1;
            if (this.f48647) {
                this.f48635 = 3;
                return false;
            }
            this.f48635 = 2;
            return true;
        }
        m37203();
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m37208(long j, long j2) {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean mo13458;
        boolean z3;
        int mo9416;
        InterfaceC10846 interfaceC10846 = this.f48645;
        interfaceC10846.getClass();
        int i = this.f48691;
        MediaCodec.BufferInfo bufferInfo2 = this.f48695;
        if (i < 0) {
            if (this.f48643 && this.f48673) {
                try {
                    mo9416 = interfaceC10846.mo9416(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m37204();
                    if (this.f48648) {
                        m37211();
                    }
                }
            } else {
                mo9416 = interfaceC10846.mo9416(bufferInfo2);
            }
            if (mo9416 < 0) {
                if (mo9416 != -2) {
                    if (this.f48671 && (this.f48654 || this.f48649 == 2)) {
                        m37204();
                    }
                    long j3 = this.f48646;
                    if (j3 != -9223372036854775807L && j3 + 100 < m14362().mo33831()) {
                        m37204();
                        return false;
                    }
                    z3 = false;
                    return z3;
                }
                this.f48657 = true;
                InterfaceC10846 interfaceC108462 = this.f48645;
                interfaceC108462.getClass();
                MediaFormat mo9426 = interfaceC108462.mo9426();
                if (this.f48686 != 0 && mo9426.getInteger("width") == 32 && mo9426.getInteger("height") == 32) {
                    this.f48699 = true;
                    return true;
                }
                this.f48651 = mo9426;
                this.f48667 = true;
                return true;
            }
            if (this.f48699) {
                this.f48699 = false;
                interfaceC10846.mo9429(mo9416);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m37204();
                return false;
            }
            this.f48691 = mo9416;
            ByteBuffer mo9431 = interfaceC10846.mo9431(mo9416);
            this.f48678 = mo9431;
            if (mo9431 != null) {
                mo9431.position(bufferInfo2.offset);
                this.f48678.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            m37232(bufferInfo2.presentationTimeUs);
        }
        this.f48693 = bufferInfo2.presentationTimeUs < m14371();
        long j4 = this.f48642;
        this.f48662 = j4 != -9223372036854775807L && j4 <= bufferInfo2.presentationTimeUs;
        if (this.f48674) {
            long j5 = this.f48656;
            if (j5 == -9223372036854775807L || bufferInfo2.presentationTimeUs > j5) {
                this.f48656 = bufferInfo2.presentationTimeUs;
                this.f48693 = true;
                this.f48662 = false;
            } else {
                this.f48674 = false;
                this.f48656 = -9223372036854775807L;
            }
        }
        if (this.f48643 && this.f48673) {
            try {
                ByteBuffer byteBuffer = this.f48678;
                int i2 = this.f48691;
                int i3 = bufferInfo2.flags;
                long j6 = bufferInfo2.presentationTimeUs;
                boolean z4 = this.f48693;
                boolean z5 = this.f48662;
                C8353 c8353 = this.f48697;
                c8353.getClass();
                z2 = true;
                mo13458 = mo13458(j, j2, interfaceC10846, byteBuffer, i2, i3, 1, j6, z4, z5, c8353);
                bufferInfo = bufferInfo2;
                z = false;
            } catch (IllegalStateException unused2) {
                z3 = false;
                m37204();
                if (this.f48648) {
                    m37211();
                }
            }
        } else {
            z = false;
            z2 = true;
            ByteBuffer byteBuffer2 = this.f48678;
            int i4 = this.f48691;
            int i5 = bufferInfo2.flags;
            long j7 = bufferInfo2.presentationTimeUs;
            boolean z6 = this.f48693;
            boolean z7 = this.f48662;
            C8353 c83532 = this.f48697;
            c83532.getClass();
            bufferInfo = bufferInfo2;
            mo13458 = mo13458(j, j2, interfaceC10846, byteBuffer2, i4, i5, 1, j7, z6, z7, c83532);
        }
        if (mo13458) {
            mo37234(bufferInfo.presentationTimeUs);
            boolean z8 = (bufferInfo.flags & 4) != 0;
            if (!z8 && this.f48673 && this.f48662) {
                this.f48646 = m14362().mo33831();
            }
            this.f48691 = -1;
            this.f48678 = null;
            if (!z8) {
                return z2;
            }
            m37204();
        }
        return z;
    }

    @TargetApi(23)
    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    private void m37204() {
        int i = this.f48635;
        if (i == 1) {
            m37206();
            return;
        }
        if (i == 2) {
            m37206();
            m37203();
        } else if (i != 3) {
            this.f48648 = true;
            mo13460();
        } else {
            m37211();
            m37237();
        }
    }

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final void m37227() {
        this.f48672 = true;
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final long m37239() {
        return this.f48644.f26575;
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final long m37223() {
        return this.f48644.f26574;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37198(C8729 c8729) {
        this.f48644 = c8729;
        long j = c8729.f26575;
        if (j != -9223372036854775807L) {
            this.f48650 = true;
            mo13469(j);
        }
    }

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    private void m37203() {
        InterfaceC0220 interfaceC0220 = this.f48640;
        interfaceC0220.getClass();
        InterfaceC19021 mo1474 = interfaceC0220.mo1474();
        if (mo1474 instanceof C1797) {
            try {
                MediaCrypto mediaCrypto = this.f48636;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C1797) mo1474).f6196);
            } catch (MediaCryptoException e) {
                throw m14356(e, this.f48676, 6006);
            }
        }
        m37197(this.f48640);
        this.f48649 = 0;
        this.f48635 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        if (r19.f48659 == false) goto L7;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m37210(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC15783.m37210(long, long):boolean");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m37207(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        C8353 c8353 = this.f48697;
        return (c8353 != null && C11003.equals(c8353.f25614, "audio/opus") && C3939.m11990(j, j2)) ? false : true;
    }
}
