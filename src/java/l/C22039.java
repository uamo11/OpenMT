package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: 18RZ */
/* renamed from: l.᩹ۘۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22039 extends AbstractC14982 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15147 f70646;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C1037 f70647;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C21334 f70648;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f70649;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f70650;

    @Override // l.AbstractC14982
    /* renamed from: ֫ */
    public final void mo7525(boolean z) {
        super.mo7525(z);
        if (z) {
            this.f70648 = null;
            this.f70646 = null;
            this.f70647 = null;
        }
        this.f70649 = 0;
        this.f70650 = false;
    }

    @Override // l.AbstractC14982
    /* renamed from: ܽ */
    public final void mo35477(long j) {
        super.mo35477(j);
        this.f70650 = j != 0;
        C15147 c15147 = this.f70646;
        this.f70649 = c15147 != null ? c15147.f46288 : 0;
    }

    @Override // l.AbstractC14982
    /* renamed from: ֫ */
    public final long mo7524(C17714 c17714) {
        int i;
        if ((c17714.m41482()[0] & 1) == 1) {
            return -1L;
        }
        byte b = c17714.m41482()[0];
        C21334 c21334 = this.f70648;
        C22632.m50632(c21334);
        int i2 = c21334.f68754;
        C15147 c15147 = c21334.f68755;
        if (!c21334.f68757[(b >> 1) & (255 >>> (8 - i2))].f24927) {
            i = c15147.f46288;
        } else {
            i = c15147.f46290;
        }
        long j = this.f70650 ? (this.f70649 + i) / 4 : 0;
        if (c17714.m41472() < c17714.m41483() + 4) {
            byte[] copyOf = Arrays.copyOf(c17714.m41482(), c17714.m41483() + 4);
            c17714.m41462(copyOf.length, copyOf);
        } else {
            c17714.m41486(c17714.m41483() + 4);
        }
        byte[] m41482 = c17714.m41482();
        m41482[c17714.m41483() - 4] = (byte) (j & 255);
        m41482[c17714.m41483() - 3] = (byte) ((j >>> 8) & 255);
        m41482[c17714.m41483() - 2] = (byte) ((j >>> 16) & 255);
        m41482[c17714.m41483() - 1] = (byte) ((j >>> 24) & 255);
        this.f70650 = true;
        this.f70649 = i;
        return j;
    }

    @Override // l.AbstractC14982
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: ֫ */
    public final boolean mo7526(C17714 c17714, long j, C0871 c0871) {
        C21334 c21334;
        int i;
        long j2;
        if (this.f70648 == null) {
            C15147 c15147 = this.f70646;
            int i2 = 4;
            if (c15147 != null) {
                C1037 c1037 = this.f70647;
                if (c1037 == null) {
                    this.f70647 = C21499.m48666(c17714, true, true);
                } else {
                    byte[] bArr = new byte[c17714.m41483()];
                    System.arraycopy(c17714.m41482(), 0, bArr, 0, c17714.m41483());
                    int i3 = c15147.f46289;
                    int i4 = 5;
                    C21499.m48668(5, c17714, false);
                    int m41456 = c17714.m41456() + 1;
                    C5271 c5271 = new C5271(c17714.m41482());
                    c5271.m15202(c17714.m41485() * 8);
                    int i5 = 0;
                    while (true) {
                        int i6 = 16;
                        if (i5 >= m41456) {
                            int i7 = 6;
                            int m15201 = c5271.m15201(6) + 1;
                            for (int i8 = 0; i8 < m15201; i8++) {
                                if (c5271.m15201(16) != 0) {
                                    throw C9080.m23440("placeholder of time domain transforms not zeroed out", (Throwable) null);
                                }
                            }
                            int i9 = 1;
                            int m152012 = c5271.m15201(6) + 1;
                            int i10 = 0;
                            while (true) {
                                int i11 = 3;
                                if (i10 >= m152012) {
                                    int m152013 = c5271.m15201(i7) + 1;
                                    int i12 = 0;
                                    while (i12 < m152013) {
                                        if (c5271.m15201(16) > 2) {
                                            throw C9080.m23440("residueType greater than 2 is not decodable", (Throwable) null);
                                        }
                                        c5271.m15202(24);
                                        c5271.m15202(24);
                                        c5271.m15202(24);
                                        int m152014 = c5271.m15201(i7) + 1;
                                        int i13 = 8;
                                        c5271.m15202(8);
                                        int[] iArr = new int[m152014];
                                        for (int i14 = 0; i14 < m152014; i14++) {
                                            iArr[i14] = ((c5271.m15203() ? c5271.m15201(5) : 0) * 8) + c5271.m15201(3);
                                        }
                                        int i15 = 0;
                                        while (i15 < m152014) {
                                            int i16 = 0;
                                            while (i16 < i13) {
                                                if ((iArr[i15] & (1 << i16)) != 0) {
                                                    c5271.m15202(i13);
                                                }
                                                i16++;
                                                i13 = 8;
                                            }
                                            i15++;
                                            i13 = 8;
                                        }
                                        i12++;
                                        i7 = 6;
                                    }
                                    int m152015 = c5271.m15201(i7) + 1;
                                    for (int i17 = 0; i17 < m152015; i17++) {
                                        int m152016 = c5271.m15201(16);
                                        if (m152016 != 0) {
                                            C19956.m46033("mapping type other than 0 not supported: " + m152016);
                                        } else {
                                            int m152017 = c5271.m15203() ? c5271.m15201(4) + 1 : 1;
                                            if (c5271.m15203()) {
                                                int m152018 = c5271.m15201(8) + 1;
                                                for (int i18 = 0; i18 < m152018; i18++) {
                                                    int i19 = i3 - 1;
                                                    int i20 = 0;
                                                    for (int i21 = i19; i21 > 0; i21 >>>= 1) {
                                                        i20++;
                                                    }
                                                    c5271.m15202(i20);
                                                    int i22 = 0;
                                                    while (i19 > 0) {
                                                        i22++;
                                                        i19 >>>= 1;
                                                    }
                                                    c5271.m15202(i22);
                                                }
                                            }
                                            if (c5271.m15201(2) != 0) {
                                                throw C9080.m23440("to reserved bits must be zero after mapping coupling steps", (Throwable) null);
                                            }
                                            if (m152017 > 1) {
                                                for (int i23 = 0; i23 < i3; i23++) {
                                                    c5271.m15202(4);
                                                }
                                            }
                                            for (int i24 = 0; i24 < m152017; i24++) {
                                                c5271.m15202(8);
                                                c5271.m15202(8);
                                                c5271.m15202(8);
                                            }
                                        }
                                    }
                                    int m152019 = c5271.m15201(6);
                                    int i25 = m152019 + 1;
                                    C8093[] c8093Arr = new C8093[i25];
                                    for (int i26 = 0; i26 < i25; i26++) {
                                        boolean m15203 = c5271.m15203();
                                        c5271.m15201(16);
                                        c5271.m15201(16);
                                        c5271.m15201(8);
                                        c8093Arr[i26] = new C8093(m15203);
                                    }
                                    if (c5271.m15203()) {
                                        int i27 = 0;
                                        while (m152019 > 0) {
                                            i27++;
                                            m152019 >>>= 1;
                                        }
                                        c21334 = new C21334(c15147, c1037, bArr, c8093Arr, i27);
                                    } else {
                                        throw C9080.m23440("framing bit after modes not set as expected", (Throwable) null);
                                    }
                                } else {
                                    int m1520110 = c5271.m15201(i6);
                                    if (m1520110 == 0) {
                                        i = m152012;
                                        int i28 = 8;
                                        c5271.m15202(8);
                                        c5271.m15202(16);
                                        c5271.m15202(16);
                                        c5271.m15202(6);
                                        c5271.m15202(8);
                                        int m1520111 = c5271.m15201(4) + 1;
                                        int i29 = 0;
                                        while (i29 < m1520111) {
                                            c5271.m15202(i28);
                                            i29++;
                                            i28 = 8;
                                        }
                                    } else {
                                        if (m1520110 != i9) {
                                            throw C9080.m23440("floor type greater than 1 not decodable: " + m1520110, (Throwable) null);
                                        }
                                        int m1520112 = c5271.m15201(5);
                                        int[] iArr2 = new int[m1520112];
                                        int i30 = -1;
                                        for (int i31 = 0; i31 < m1520112; i31++) {
                                            int m1520113 = c5271.m15201(4);
                                            iArr2[i31] = m1520113;
                                            if (m1520113 > i30) {
                                                i30 = m1520113;
                                            }
                                        }
                                        int i32 = i30 + 1;
                                        int[] iArr3 = new int[i32];
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            iArr3[i33] = c5271.m15201(i11) + 1;
                                            int m1520114 = c5271.m15201(2);
                                            if (m1520114 > 0) {
                                                c5271.m15202(8);
                                            }
                                            int i34 = m152012;
                                            int i35 = i32;
                                            int i36 = 8;
                                            int i37 = 0;
                                            while (i37 < (1 << m1520114)) {
                                                c5271.m15202(i36);
                                                i37++;
                                                i36 = 8;
                                            }
                                            i33++;
                                            i11 = 3;
                                            m152012 = i34;
                                            i32 = i35;
                                        }
                                        i = m152012;
                                        c5271.m15202(2);
                                        int m1520115 = c5271.m15201(4);
                                        int i38 = 0;
                                        int i39 = 0;
                                        for (int i40 = 0; i40 < m1520112; i40++) {
                                            i38 += iArr3[iArr2[i40]];
                                            while (i39 < i38) {
                                                c5271.m15202(m1520115);
                                                i39++;
                                            }
                                        }
                                    }
                                    i10++;
                                    i7 = 6;
                                    i9 = 1;
                                    i6 = 16;
                                    m152012 = i;
                                }
                            }
                        } else {
                            if (c5271.m15201(24) != 5653314) {
                                throw C9080.m23440("expected code book to start with [0x56, 0x43, 0x42] at " + c5271.m15200(), (Throwable) null);
                            }
                            int m1520116 = c5271.m15201(16);
                            int m1520117 = c5271.m15201(24);
                            if (!c5271.m15203()) {
                                boolean m152032 = c5271.m15203();
                                for (int i41 = 0; i41 < m1520117; i41++) {
                                    if (m152032) {
                                        if (c5271.m15203()) {
                                            c5271.m15202(i4);
                                        }
                                    } else {
                                        c5271.m15202(i4);
                                    }
                                }
                            } else {
                                c5271.m15202(i4);
                                int i42 = 0;
                                while (i42 < m1520117) {
                                    int i43 = 0;
                                    for (int i44 = m1520117 - i42; i44 > 0; i44 >>>= 1) {
                                        i43++;
                                    }
                                    i42 += c5271.m15201(i43);
                                }
                            }
                            int m1520118 = c5271.m15201(i2);
                            if (m1520118 > 2) {
                                throw C9080.m23440("lookup type greater than 2 not decodable: " + m1520118, (Throwable) null);
                            }
                            if (m1520118 == 1 || m1520118 == 2) {
                                c5271.m15202(32);
                                c5271.m15202(32);
                                int m1520119 = c5271.m15201(i2) + 1;
                                c5271.m15202(1);
                                if (m1520118 == 1) {
                                    j2 = m1520116 != 0 ? (long) Math.floor(Math.pow(m1520117, 1.0d / m1520116)) : 0L;
                                } else {
                                    j2 = m1520117 * m1520116;
                                }
                                c5271.m15202((int) (j2 * m1520119));
                            }
                            i5++;
                            i2 = 4;
                            i4 = 5;
                        }
                    }
                }
            } else {
                C21499.m48668(1, c17714, false);
                c17714.m41463();
                int m414562 = c17714.m41456();
                int m41463 = c17714.m41463();
                int m41490 = c17714.m41490();
                int i45 = m41490 <= 0 ? -1 : m41490;
                int m414902 = c17714.m41490();
                int i46 = m414902 <= 0 ? -1 : m414902;
                c17714.m41490();
                int m414563 = c17714.m41456();
                int pow = (int) Math.pow(2.0d, m414563 & 15);
                int pow2 = (int) Math.pow(2.0d, (m414563 & 240) >> 4);
                c17714.m41456();
                this.f70646 = new C15147(m414562, m41463, i45, i46, pow, pow2, Arrays.copyOf(c17714.m41482(), c17714.m41483()));
            }
            c21334 = null;
            this.f70648 = c21334;
            if (c21334 == null) {
                return true;
            }
            C15147 c151472 = c21334.f68755;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c151472.f46287);
            arrayList.add(c21334.f68756);
            C23896 m48667 = C21499.m48667(AbstractC14545.m34733(c21334.f68753.f3786));
            C1297 c1297 = new C1297();
            c1297.m4462("audio/ogg");
            c1297.m4465("audio/vorbis");
            c1297.m4468(c151472.f46286);
            c1297.m4438(c151472.f46285);
            c1297.m4472(c151472.f46289);
            c1297.m4456(c151472.f46291);
            c1297.m4446((List) arrayList);
            c1297.m4449(m48667);
            c0871.f3427 = c1297.m4440();
            return true;
        }
        c0871.f3427.getClass();
        return false;
    }
}
