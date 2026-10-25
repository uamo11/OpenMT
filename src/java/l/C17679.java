package l;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: Z8VY */
/* renamed from: l.ܿ᩻ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17679 extends AbstractC15783 {

    /* renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f54082;

    /* renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f54083 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f54084;

    /* renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f54085;

    /* renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public int f54086;

    /* renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public int f54087;

    /* renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public final Context f54088;

    /* renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public final C20502 f54089;

    /* renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public long f54090;

    /* renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public C6404 f54091;

    /* renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC6599 f54092;

    /* renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public boolean f54093;

    /* renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public long f54094;

    /* renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public C17008 f54095;

    /* renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public boolean f54096;

    /* renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public int f54097;

    /* renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public C24029 f54098;

    /* renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f54099;

    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public int f54100;

    /* renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public int f54101;

    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public boolean f54102;

    /* renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public List f54103;

    /* renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public int f54104;

    /* renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public C6404 f54105;

    /* renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public final boolean f54106;

    /* renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public final long f54107;

    /* renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public final int f54108;

    /* renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public long f54109;

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public int f54110;

    /* renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public long f54111;

    /* renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public final C10833 f54112;

    /* renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public int f54113;

    /* renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public final C4979 f54114;

    /* renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public int f54115;

    /* renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public long f54116;

    /* renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public C20888 f54117;

    /* renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public final boolean f54118;

    /* renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public Surface f54119;

    /* renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54120;

    /* renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public C16973 f54121;

    /* renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public C18385 f54122;

    /* renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC22618 f54123;

    /* renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54124;

    /* renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54125;

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public int f54126;

    /* renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f54127;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41413(InterfaceC10846 interfaceC10846, int i) {
        Trace.beginSection("skipVideoBuffer");
        interfaceC10846.mo9429(i);
        Trace.endSection();
        this.f48681.f11174++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41414(InterfaceC10846 interfaceC10846, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        interfaceC10846.mo9420(i, j);
        Trace.endSection();
        this.f48681.f11172++;
        this.f54100 = 0;
        if (this.f54092 == null) {
            C6404 c6404 = this.f54091;
            boolean equals = c6404.equals(C6404.f19812);
            C10833 c10833 = this.f54112;
            if (!equals && !c6404.equals(this.f54105)) {
                this.f54105 = c6404;
                c10833.m27090(c6404);
            }
            if (!this.f54114.m14448() || (surface = this.f54119) == null) {
                return;
            }
            c10833.m27086(surface);
            this.f54120 = true;
        }
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final boolean mo13458(long j, long j2, InterfaceC10846 interfaceC10846, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C8353 c8353) {
        long j4;
        long j5;
        interfaceC10846.getClass();
        long m37239 = j3 - m37239();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.f54085;
            Long l2 = (Long) priorityQueue.peek();
            if (l2 == null || l2.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        m41412(i4, 0);
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            if (z && !z2) {
                m41413(interfaceC10846, i);
                return true;
            }
            return interfaceC6599.mo8760(j3, new C7529(this, interfaceC10846, i, m37239));
        }
        int m14438 = this.f54114.m14438(j3, j, j2, m37223(), z, z2, this.f54089);
        C20502 c20502 = this.f54089;
        if (m14438 == 0) {
            long mo33835 = m14362().mo33835();
            InterfaceC22618 interfaceC22618 = this.f54123;
            if (interfaceC22618 != null) {
                j4 = mo33835;
                interfaceC22618.mo24148(m37239, mo33835, c8353, m37242());
            } else {
                j4 = mo33835;
            }
            m41414(interfaceC10846, i, j4);
            m41418(c20502.m46974());
            return true;
        }
        if (m14438 == 1) {
            long m46975 = c20502.m46975();
            long m46974 = c20502.m46974();
            if (m46975 == this.f54090) {
                m41413(interfaceC10846, i);
                j5 = m46975;
            } else {
                InterfaceC22618 interfaceC226182 = this.f54123;
                if (interfaceC226182 != null) {
                    j5 = m46975;
                    interfaceC226182.mo24148(m37239, m46975, c8353, m37242());
                } else {
                    j5 = m46975;
                }
                m41414(interfaceC10846, i, j5);
            }
            m41418(m46974);
            this.f54090 = j5;
            return true;
        }
        if (m14438 == 2) {
            Trace.beginSection("dropVideoBuffer");
            interfaceC10846.mo9429(i);
            Trace.endSection();
            m41412(0, 1);
            m41418(c20502.m46974());
            return true;
        }
        if (m14438 == 3) {
            m41413(interfaceC10846, i);
            m41418(c20502.m46974());
            return true;
        }
        if (m14438 == 4 || m14438 == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(m14438));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C17679(l.C11330 r8) {
        /*
            r7 = this;
            l.ܰܰ֫ r2 = l.C11330.m27990(r8)
            r4 = 0
            r5 = 1106247680(0x41f00000, float:30.0)
            r1 = 2
            l.ᩴۖܽ r3 = l.InterfaceC2379.f7585
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Context r0 = l.C11330.m27992(r8)
            android.content.Context r0 = r0.getApplicationContext()
            r7.f54088 = r0
            int r1 = l.C11330.m27991(r8)
            r7.f54108 = r1
            r1 = 0
            r7.f54092 = r1
            l.ۧۜۧ r2 = new l.ۧۜۧ
            android.os.Handler r3 = l.C11330.m27994(r8)
            l.ܽۜۧ r4 = l.C11330.m27993(r8)
            r2.<init>(r3, r4)
            r7.f54112 = r2
            l.ۜۜۧ r2 = r7.f54092
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            r7.f54106 = r2
            l.ۙ᩻ۧ r2 = new l.ۙ᩻ۧ
            long r5 = l.C11330.m27989(r8)
            r2.<init>(r0, r7, r5)
            r7.f54114 = r2
            l.᩶᩻ۧ r8 = new l.᩶᩻ۧ
            r8.<init>()
            r7.f54089 = r8
            java.lang.String r8 = "NVIDIA"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r8 = r8.equals(r0)
            r7.f54118 = r8
            l.ܿ֨֫ r8 = l.C17008.f52163
            r7.f54095 = r8
            r7.f54115 = r3
            r7.f54126 = r4
            l.ۜ֡֫ r8 = l.C6404.f19812
            r7.f54091 = r8
            r7.f54097 = r4
            r7.f54105 = r1
            r8 = -1000(0xfffffffffffffc18, float:NaN)
            r7.f54087 = r8
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f54116 = r2
            r7.f54109 = r2
            java.util.PriorityQueue r8 = new java.util.PriorityQueue
            r8.<init>()
            r7.f54085 = r8
            r7.f54107 = r2
            r7.f54099 = r4
            r7.f54117 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17679.<init>(l.ۧ᩻ۧ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m41415(long j, long j2, boolean z, boolean z2) {
        int m14363;
        if (this.f54092 != null && this.f54106) {
            j2 -= -this.f54116;
        }
        if (j >= -500000 || z || (m14363 = m14363(j2)) == 0) {
            return false;
        }
        PriorityQueue priorityQueue = this.f54085;
        if (z2) {
            C3519 c3519 = this.f48681;
            int i = c3519.f11181 + m14363;
            c3519.f11181 = i;
            c3519.f11174 += this.f54110;
            c3519.f11181 = priorityQueue.size() + i;
        } else {
            this.f48681.f11179++;
            m41412(priorityQueue.size() + m14363, this.f54110);
        }
        m37225();
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8766(false);
        }
        return true;
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final int mo13445(InterfaceC2379 interfaceC2379, C8353 c8353) {
        boolean z;
        int i = 0;
        if (!C9786.m24801(c8353.f25614)) {
            return C11010.m27348(0, 0, 0, 0);
        }
        boolean z2 = c8353.f25602 != null;
        Context context = this.f54088;
        List m41399 = m41399(context, interfaceC2379, c8353, z2, false);
        if (z2 && m41399.isEmpty()) {
            m41399 = m41399(context, interfaceC2379, c8353, false, false);
        }
        if (m41399.isEmpty()) {
            return C11010.m27348(1, 0, 0, 0);
        }
        int i2 = c8353.f25632;
        if (i2 != 0 && i2 != 2) {
            return C11010.m27348(2, 0, 0, 0);
        }
        C17195 c17195 = (C17195) m41399.get(0);
        boolean m40454 = c17195.m40454(c8353);
        if (!m40454) {
            for (int i3 = 1; i3 < m41399.size(); i3++) {
                C17195 c171952 = (C17195) m41399.get(i3);
                if (c171952.m40454(c8353)) {
                    z = false;
                    m40454 = true;
                    c17195 = c171952;
                    break;
                }
            }
        }
        z = true;
        int i4 = m40454 ? 4 : 3;
        int i5 = c17195.m40455(c8353) ? 16 : 8;
        int i6 = c17195.f52727 ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(c8353.f25614) && !C2157.m7115(context)) {
            i7 = 256;
        }
        if (m40454) {
            List m413992 = m41399(context, interfaceC2379, c8353, z2, true);
            if (!m413992.isEmpty()) {
                C17195 c171953 = (C17195) C22134.m49729(m413992, c8353).get(0);
                if (c171953.m40454(c8353) && c171953.m40455(c8353)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final ArrayList mo13446(InterfaceC2379 interfaceC2379, C8353 c8353, boolean z) {
        return C22134.m49729(m41399(this.f54088, interfaceC2379, c8353, z, this.f54127), c8353);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m41399(Context context, InterfaceC2379 interfaceC2379, C8353 c8353, boolean z, boolean z2) {
        List mo7690;
        String str = c8353.f25614;
        if (str == null) {
            return AbstractC14545.of();
        }
        if (Build.VERSION.SDK_INT >= 26 && "video/dolby-vision".equals(str) && !C2157.m7115(context)) {
            String m49728 = C22134.m49728(c8353);
            if (m49728 == null) {
                mo7690 = AbstractC14545.of();
            } else {
                mo7690 = interfaceC2379.mo7690(m49728, z, z2);
            }
            if (!mo7690.isEmpty()) {
                return mo7690;
            }
        }
        return C22134.m49732(interfaceC2379, c8353, z, z2);
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo13457(boolean z, boolean z2) {
        super.mo13457(z, z2);
        boolean z3 = m14367().f53168;
        C22632.m50634((z3 && this.f54097 == 0) ? false : true);
        if (this.f54127 != z3) {
            this.f54127 = z3;
            m37211();
        }
        this.f54112.m27093(this.f48681);
        boolean z4 = this.f54124;
        C4979 c4979 = this.f54114;
        if (!z4) {
            if (this.f54103 != null && this.f54092 == null) {
                C21208 c21208 = new C21208(this.f54088, c4979);
                c21208.m48154();
                c21208.m48153(m14362());
                C1451 m48152 = c21208.m48152();
                m48152.m4991();
                this.f54092 = m48152.m4987();
            }
            this.f54124 = true;
        }
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 == null) {
            c4979.m14443(m14362());
            c4979.m14441(!z2 ? 1 : 0);
            return;
        }
        interfaceC6599.mo8758(new C13878(this), C12449.m30605());
        InterfaceC22618 interfaceC22618 = this.f54123;
        if (interfaceC22618 != null) {
            this.f54092.mo8759(interfaceC22618);
        }
        if (this.f54119 != null && !this.f54095.equals(C17008.f52163)) {
            this.f54092.mo8754(this.f54119, this.f54095);
        }
        this.f54092.mo8751(this.f54126);
        this.f54092.mo8750(m37222());
        List list = this.f54103;
        if (list != null) {
            this.f54092.mo8755(list);
        }
        this.f54104 = !z2 ? 1 : 0;
        m37217();
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۜ */
    public final void mo6095() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            int i = this.f54104;
            if (i == 0 || i == 1) {
                this.f54104 = 0;
                return;
            } else {
                interfaceC6599.mo8763();
                return;
            }
        }
        this.f54114.m14439();
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        super.mo14359(c8353Arr, j, j2, c15894);
        AbstractC4846 m14366 = m14366();
        if (!m14366.m14110()) {
            c15894.getClass();
            this.f54109 = m14366.mo14105(c15894.f49112, new C22485()).f72801;
        } else {
            this.f54109 = -9223372036854775807L;
        }
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null && !z) {
            interfaceC6599.mo8766(true);
        }
        super.mo13451(j, z);
        InterfaceC6599 interfaceC65992 = this.f54092;
        C4979 c4979 = this.f54114;
        if (interfaceC65992 == null) {
            c4979.m14450();
        }
        if (z) {
            InterfaceC6599 interfaceC65993 = this.f54092;
            if (interfaceC65993 != null) {
                interfaceC65993.mo8770(false);
            } else {
                c4979.m14447(false);
            }
        }
        m41402();
        this.f54100 = 0;
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۧ */
    public final boolean mo6098() {
        if (!super.mo6098()) {
            return false;
        }
        InterfaceC6599 interfaceC6599 = this.f54092;
        return interfaceC6599 == null || interfaceC6599.mo8767();
    }

    @Override // l.AbstractC15783, l.InterfaceC1837
    /* renamed from: ܿ */
    public final boolean mo6101() {
        boolean mo6101 = super.mo6101();
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            return interfaceC6599.mo8762(mo6101);
        }
        if (mo6101 && (m37231() == null || this.f54127)) {
            return true;
        }
        return this.f54114.m14444(mo6101);
    }

    @Override // l.AbstractC4930
    /* renamed from: ܰ */
    public final void mo13466() {
        this.f54086 = 0;
        this.f54094 = m14362().mo33834();
        this.f54111 = 0L;
        this.f54101 = 0;
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8765();
        } else {
            this.f54114.m14449();
        }
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* renamed from: ۤ */
    public final void mo13464() {
        C10833 c10833 = this.f54112;
        this.f54105 = null;
        this.f54109 = -9223372036854775807L;
        m41402();
        this.f54120 = false;
        this.f54122 = null;
        this.f54093 = true;
        try {
            super.mo13464();
        } finally {
            c10833.m27089(this.f48681);
            c10833.m27090(C6404.f19812);
        }
    }

    @Override // l.AbstractC15783, l.AbstractC4930
    /* renamed from: ᩺ */
    public final void mo13473() {
        try {
            super.mo13473();
        } finally {
            this.f54124 = false;
            this.f54116 = -9223372036854775807L;
            C24029 c24029 = this.f54098;
            if (c24029 != null) {
                c24029.release();
                this.f54098 = null;
            }
        }
    }

    @Override // l.AbstractC4930
    /* renamed from: ۛ */
    public final void mo13461() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 == null || !this.f54106) {
            return;
        }
        interfaceC6599.mo8749();
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC5783
    /* renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        if (i == 1) {
            m41400(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            InterfaceC22618 interfaceC22618 = (InterfaceC22618) obj;
            this.f54123 = interfaceC22618;
            InterfaceC6599 interfaceC6599 = this.f54092;
            if (interfaceC6599 != null) {
                interfaceC6599.mo8759(interfaceC22618);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f54097 != intValue) {
                this.f54097 = intValue;
                if (this.f54127) {
                    m37211();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            this.f54115 = ((Integer) obj).intValue();
            InterfaceC10846 m37231 = m37231();
            if (m37231 != null) {
                m37231.mo9418(this.f54115);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f54126 = intValue2;
            InterfaceC6599 interfaceC65992 = this.f54092;
            if (interfaceC65992 != null) {
                interfaceC65992.mo8751(intValue2);
                return;
            } else {
                this.f54114.m14446(intValue2);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            if (list.equals(InterfaceC16987.f52116)) {
                InterfaceC6599 interfaceC65993 = this.f54092;
                if (interfaceC65993 == null || !interfaceC65993.isInitialized()) {
                    return;
                }
                this.f54092.mo8772();
                return;
            }
            this.f54103 = list;
            InterfaceC6599 interfaceC65994 = this.f54092;
            if (interfaceC65994 != null) {
                interfaceC65994.mo8755(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            C17008 c17008 = (C17008) obj;
            if (c17008.m39892() == 0 || c17008.m39891() == 0) {
                return;
            }
            this.f54095 = c17008;
            InterfaceC6599 interfaceC65995 = this.f54092;
            if (interfaceC65995 != null) {
                Surface surface = this.f54119;
                C22632.m50632(surface);
                interfaceC65995.mo8754(surface, c17008);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                obj.getClass();
                this.f54087 = ((Integer) obj).intValue();
                InterfaceC10846 m372312 = m37231();
                if (m372312 != null && Build.VERSION.SDK_INT >= 35) {
                    Bundle bundle = new Bundle();
                    bundle.putInt("importance", Math.max(0, -this.f54087));
                    m372312.mo9422(bundle);
                    break;
                }
                break;
            case 17:
                Surface surface2 = this.f54119;
                m41400((Object) null);
                obj.getClass();
                ((C17679) obj).mo13450(1, surface2);
                break;
            case 18:
                C20888 c20888 = this.f54117;
                boolean z = c20888 != null && c20888.f67590;
                C20888 c208882 = (C20888) obj;
                this.f54117 = c208882;
                if (z != (c208882 != null && c208882.f67590)) {
                    m37238();
                    break;
                }
                break;
            default:
                super.mo13450(i, obj);
                break;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41400(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.f54119;
        C10833 c10833 = this.f54112;
        if (surface2 == surface) {
            if (surface != null) {
                C6404 c6404 = this.f54105;
                if (c6404 != null) {
                    c10833.m27090(c6404);
                }
                Surface surface3 = this.f54119;
                if (surface3 == null || !this.f54120) {
                    return;
                }
                c10833.m27086(surface3);
                return;
            }
            return;
        }
        this.f54119 = surface;
        InterfaceC6599 interfaceC6599 = this.f54092;
        C4979 c4979 = this.f54114;
        if (interfaceC6599 == null) {
            c4979.m14442(surface);
        }
        this.f54120 = false;
        int state = getState();
        InterfaceC10846 m37231 = m37231();
        if (m37231 != null && this.f54092 == null) {
            C17195 m37236 = m37236();
            m37236.getClass();
            boolean m41411 = m41411(m37236);
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && m41411 && !this.f54102) {
                Surface m41406 = m41406(m37236);
                if (i >= 23 && m41406 != null) {
                    m37231.mo9423(m41406);
                } else {
                    if (i < 35) {
                        throw new IllegalStateException();
                    }
                    m37231.mo9428();
                }
            } else {
                m37211();
                m37237();
            }
        }
        if (surface == null) {
            this.f54105 = null;
            InterfaceC6599 interfaceC65992 = this.f54092;
            if (interfaceC65992 != null) {
                interfaceC65992.mo8764();
            }
        } else {
            C6404 c64042 = this.f54105;
            if (c64042 != null) {
                c10833.m27090(c64042);
            }
        }
        if (state == 2) {
            InterfaceC6599 interfaceC65993 = this.f54092;
            if (interfaceC65993 != null) {
                interfaceC65993.mo8770(true);
            } else {
                c4979.m14447(true);
            }
        }
        m41402();
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final boolean mo37216(C17195 c17195) {
        return m41411(c17195);
    }

    @Override // l.AbstractC15783
    /* renamed from: ܳ֫ */
    public final boolean mo37226() {
        return this.f54127 && Build.VERSION.SDK_INT < 23;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x012e, code lost:
    
        r11 = null;
     */
    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C23023 mo13449(l.C17195 r23, l.C8353 r24, android.media.MediaCrypto r25, float r26) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17679.mo13449(l.ܿ۟֫, l.۠ᩴ֫, android.media.MediaCrypto, float):l.᩺ܰ֫");
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final C13396 mo13448(C17195 c17195, C8353 c8353, C8353 c83532) {
        C13396 m40451 = c17195.m40451(c8353, c83532);
        int i = m40451.f40046;
        C16973 c16973 = this.f54121;
        c16973.getClass();
        if (c83532.f25633 > c16973.f52084 || c83532.f25609 > c16973.f52082) {
            i |= 256;
        }
        if (m41403(c17195, c83532) > c16973.f52083) {
            i |= 64;
        }
        int i2 = i;
        return new C13396(c17195.f52721, c8353, c83532, i2 != 0 ? 0 : m40451.f40048, i2);
    }

    @Override // l.AbstractC15783, l.InterfaceC1837
    /* renamed from: ֫ */
    public final void mo6088(long j, long j2) {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            try {
                interfaceC6599.mo8753(j, j2);
            } catch (C23532 e) {
                throw m14356(e, e.f75554, 7001);
            }
        }
        super.mo6088(j, j2);
    }

    @Override // l.AbstractC15783
    /* renamed from: ֨֫ */
    public final void mo37212() {
        super.mo37212();
        this.f54085.clear();
        this.f54110 = 0;
        this.f54113 = 0;
        this.f54093 = false;
    }

    @Override // l.AbstractC15783, l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ֫ */
    public final void mo6085(float f, float f2) {
        super.mo6085(f, f2);
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8750(f);
        } else {
            this.f54114.m14445(f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0081, code lost:
    
        if (r3.equals("video/av01") == false) goto L50;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m41397(l.C17195 r10, l.C8353 r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17679.m41397(l.ܿ۟֫, l.۠ᩴ֫):int");
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final float mo13444(float f, C8353 c8353, C8353[] c8353Arr) {
        C17195 m37236;
        float f2 = -1.0f;
        for (C8353 c83532 : c8353Arr) {
            float f3 = c83532.f25596;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        float f4 = f2 == -1.0f ? -1.0f : f * f2;
        if (this.f54117 == null || (m37236 = m37236()) == null) {
            return f4;
        }
        float m40450 = m37236.m40450(c8353.f25633, c8353.f25609);
        return f4 != -1.0f ? Math.max(f4, m40450) : m40450;
    }

    @Override // l.AbstractC15783
    /* renamed from: ܽ */
    public final boolean mo37230(C8353 c8353) {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 == null || interfaceC6599.isInitialized()) {
            return true;
        }
        try {
            return this.f54092.mo8761(c8353);
        } catch (C23532 e) {
            throw m14356(e, c8353, 7000);
        }
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final void mo13454(String str, long j, long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        this.f54112.m27088(str, j, j2);
        this.f54102 = m41405(str);
        C17195 m37236 = m37236();
        m37236.getClass();
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(m37236.f52722)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = m37236.f52723;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.f54096 = z;
        m41402();
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final void mo13453(String str) {
        this.f54112.m27087(str);
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final void mo13452(Exception exc) {
        C19956.m46034("Video codec error", exc);
        this.f54112.m27085(exc);
    }

    @Override // l.AbstractC15783
    /* renamed from: ᩹֫ */
    public final boolean mo37241() {
        C17195 m37236 = m37236();
        if (this.f54092 != null && m37236 != null) {
            String str = m37236.f52721;
            if (str.equals("c2.mtk.avc.decoder") || str.equals("c2.mtk.hevc.decoder")) {
                return true;
            }
        }
        return super.mo37241();
    }

    @Override // l.AbstractC15783
    /* renamed from: ᩸֫ */
    public final boolean mo37240() {
        C8353 m37233 = m37233();
        C20888 c20888 = this.f54117;
        if (c20888 == null || !c20888.f67586 || this.f54093 || this.f54127) {
            return true;
        }
        return (m37233 != null && m37233.f25617 > 0) || m37218() || m37220() != -9223372036854775807L;
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final C13396 mo13447(C3002 c3002) {
        C13396 mo13447 = super.mo13447(c3002);
        C8353 c8353 = c3002.f9455;
        c8353.getClass();
        this.f54112.m27091(c8353, mo13447);
        return mo13447;
    }

    @Override // l.AbstractC15783
    /* renamed from: ܽ */
    public final void mo37229(C21843 c21843) {
        this.f54113 = 0;
        int mo37213 = mo37213(c21843);
        int i = Build.VERSION.SDK_INT;
        if ((i < 34 || (mo37213 & 32) == 0) && !this.f54127) {
            this.f54110++;
        }
        if (i >= 23 || !this.f54127) {
            return;
        }
        m41417(c21843.f69997);
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final int mo37213(C21843 c21843) {
        C20888 c20888;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f54099 || (((c20888 = this.f54117) != null && c20888.f67589) || this.f54127)) && c21843.f69997 < m14371() && !m41409(c21843)) ? 32 : 0;
        }
        return 0;
    }

    @Override // l.AbstractC15783
    /* renamed from: ᩳ */
    public final boolean mo37235(C21843 c21843) {
        boolean z = false;
        if (!m41409(c21843)) {
            boolean z2 = c21843.f69997 < m14371();
            if (z2 && !c21843.m12694()) {
                if (c21843.m12692()) {
                    c21843.mo7();
                    z = true;
                }
                if (z) {
                    if (z2) {
                        this.f48681.f11181++;
                        return z;
                    }
                    this.f54085.add(Long.valueOf(c21843.f69997));
                    this.f54113++;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m41409(C21843 c21843) {
        if (mo6104() || c21843.m12689() || this.f54109 == -9223372036854775807L) {
            return true;
        }
        return this.f54109 - (c21843.f69997 - m37239()) <= 100000;
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final void mo13456(C8353 c8353, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        InterfaceC10846 m37231 = m37231();
        if (m37231 != null) {
            m37231.mo9418(this.f54115);
        }
        if (!this.f54127) {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i3 = integer;
            i = integer2;
            i2 = i3;
        } else {
            i2 = c8353.f25633;
            i = c8353.f25609;
        }
        float f = c8353.f25636;
        int i4 = c8353.f25599;
        if (i4 == 90 || i4 == 270) {
            f = 1.0f / f;
            int i5 = i;
            i = i2;
            i2 = i5;
        }
        this.f54091 = new C6404(i2, i, f);
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null && this.f54125) {
            C1297 m21948 = c8353.m21948();
            m21948.m4453(i2);
            m21948.m4457(i);
            m21948.m4460(f);
            C8353 m4440 = m21948.m4440();
            int i6 = this.f54104;
            List list = this.f54103;
            if (list == null) {
                list = AbstractC14545.of();
            }
            interfaceC6599.mo8757(m4440, m37223(), i6, list);
            this.f54104 = 2;
        } else {
            this.f54114.m14440(c8353.f25596);
        }
        this.f54125 = false;
    }

    @Override // l.AbstractC15783
    @TargetApi(29)
    /* renamed from: ۧ */
    public final void mo13465(C21843 c21843) {
        if (this.f54096) {
            ByteBuffer byteBuffer = c21843.f69998;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        InterfaceC10846 m37231 = m37231();
                        m37231.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        m37231.mo9422(bundle);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC15783
    /* renamed from: ۚ֫ */
    public final void mo13460() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8774();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41417(long j) {
        Surface surface;
        m37232(j);
        C6404 c6404 = this.f54091;
        boolean equals = c6404.equals(C6404.f19812);
        C10833 c10833 = this.f54112;
        if (!equals && !c6404.equals(this.f54105)) {
            this.f54105 = c6404;
            c10833.m27090(c6404);
        }
        this.f48681.f11172++;
        if (this.f54114.m14448() && (surface = this.f54119) != null) {
            c10833.m27086(surface);
            this.f54120 = true;
        }
        mo37234(j);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m41407(C17679 c17679) {
        c17679.m37227();
    }

    @Override // l.AbstractC15783
    /* renamed from: ᩳ */
    public final void mo37234(long j) {
        super.mo37234(j);
        if (this.f54127) {
            return;
        }
        this.f54110--;
    }

    @Override // l.AbstractC15783
    /* renamed from: ᩵֫ */
    public final void mo13472() {
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8774();
            if (this.f54116 == -9223372036854775807L) {
                this.f54116 = m37223();
            }
            this.f54092.mo8752(-this.f54116);
        } else {
            this.f54114.m14441(2);
        }
        this.f54125 = true;
        m41402();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41412(int i, int i2) {
        int i3;
        C3519 c3519 = this.f48681;
        c3519.f11180 += i;
        int i4 = i + i2;
        c3519.f11178 += i4;
        this.f54086 += i4;
        int i5 = this.f54100 + i4;
        this.f54100 = i5;
        c3519.f11176 = Math.max(i5, c3519.f11176);
        int i6 = this.f54108;
        if (i6 <= 0 || (i3 = this.f54086) < i6 || i3 <= 0) {
            return;
        }
        long mo33834 = m14362().mo33834();
        this.f54112.m27084(this.f54086, mo33834 - this.f54094);
        this.f54086 = 0;
        this.f54094 = mo33834;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m41418(long j) {
        C3519 c3519 = this.f48681;
        c3519.f11173 += j;
        c3519.f11177++;
        this.f54111 += j;
        this.f54101++;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m41411(C17195 c17195) {
        if (this.f54092 != null) {
            return true;
        }
        Surface surface = this.f54119;
        if (surface == null || !surface.isValid()) {
            return (Build.VERSION.SDK_INT >= 35 && c17195.f52728) || m41416(c17195);
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private Surface m41406(C17195 c17195) {
        boolean z = c17195.f52725;
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            return interfaceC6599.mo8771();
        }
        Surface surface = this.f54119;
        if (surface != null) {
            return surface;
        }
        if (Build.VERSION.SDK_INT >= 35 && c17195.f52728) {
            return null;
        }
        C22632.m50634(m41416(c17195));
        C24029 c24029 = this.f54098;
        if (c24029 != null && c24029.f77856 != z && c24029 != null) {
            c24029.release();
            this.f54098 = null;
        }
        if (this.f54098 == null) {
            this.f54098 = C24029.m52871(this.f54088, z);
        }
        return this.f54098;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m41416(C17195 c17195) {
        if (Build.VERSION.SDK_INT < 23 || this.f54127 || m41405(c17195.f52721)) {
            return false;
        }
        return !c17195.f52725 || C24029.m52872(this.f54088);
    }

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    private void m41402() {
        int i;
        InterfaceC10846 m37231;
        if (!this.f54127 || (i = Build.VERSION.SDK_INT) < 23 || (m37231 = m37231()) == null) {
            return;
        }
        this.f54122 = new C18385(this, m37231);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            m37231.mo9422(bundle);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41404(C17679 c17679) {
        c17679.f54112.m27086(c17679.f54119);
        c17679.f54120 = true;
    }

    @Override // l.AbstractC4930
    /* renamed from: ۟ */
    public final void mo13462() {
        int i = this.f54086;
        C10833 c10833 = this.f54112;
        if (i > 0) {
            long mo33834 = m14362().mo33834();
            c10833.m27084(this.f54086, mo33834 - this.f54094);
            this.f54086 = 0;
            this.f54094 = mo33834;
        }
        int i2 = this.f54101;
        if (i2 != 0) {
            c10833.m27092(i2, this.f54111);
            this.f54111 = 0L;
            this.f54101 = 0;
        }
        InterfaceC6599 interfaceC6599 = this.f54092;
        if (interfaceC6599 != null) {
            interfaceC6599.mo8773();
        } else {
            this.f54114.m14451();
        }
    }

    @Override // l.AbstractC15783
    /* renamed from: ֫ */
    public final C17901 mo37214(IllegalStateException illegalStateException, C17195 c17195) {
        Surface surface = this.f54119;
        C23051 c23051 = new C23051(illegalStateException, c17195);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c23051;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m41403(C17195 c17195, C8353 c8353) {
        int i = c8353.f25601;
        List list = c8353.f25634;
        if (i != -1) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += ((byte[]) list.get(i3)).length;
            }
            return c8353.f25601 + i2;
        }
        return m41397(c17195, c8353);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0735, code lost:
    
        if (r6.equals("ELUGA_Ray_X") == false) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x08b3, code lost:
    
        if (r4.equals("JSN-L21") == false) goto L667;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x08b6 A[FALL_THROUGH] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m41405(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 3202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17679.m41405(java.lang.String):boolean");
    }
}
