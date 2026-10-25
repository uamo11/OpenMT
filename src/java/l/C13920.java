package l;

import android.util.SparseArray;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.util.encoders.UTF8;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: P8R9 */
/* renamed from: l.ܰܺۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13920 implements InterfaceC1368 {

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41496 = {49, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41497;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final UUID f41498;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41499;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final Map f41500;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f41501;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C23093 f41502;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f41503;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f41504;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41505;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f41506;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f41507;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f41508;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f41509;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17714 f41510;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C4433 f41511;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public long f41512;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f41513;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f41514;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41515;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f41516;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f41517;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41518;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f41519;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17714 f41520;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f41521;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f41522;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean f41523;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f41524;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f41525;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C10394 f41526;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f41527;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f41528;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f41529;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f41530;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C17714 f41531;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f41532;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f41533;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41534;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C17714 f41535;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f41536;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f41537;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public long f41538;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41539;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public byte f41540;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f41541;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41542;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f41543;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f41544;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C4433 f41545;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public long f41546;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f41547;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f41548;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f41549;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f41550;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f41551;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ByteBuffer f41552;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final C1536 f41553;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f41554;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final C17714 f41555;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f41556;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f41557;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f41558;

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
        f41501 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        f41497 = new byte[]{68, 105, 97, 108, KeyFactorySpi.x448_type, 103, 117, 101, 58, UTF8.S_CS3, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 44};
        f41499 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_CS3, 45, 45, 62, UTF8.S_CS3, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 58, UTF8.S_P3A, UTF8.S_P3A, 46, UTF8.S_P3A, UTF8.S_P3A, UTF8.S_P3A, 10};
        f41498 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        C12354.m29971(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        C12354.m29971(180, hashMap, "htc_video_rotA-180", BottomAppBarTopEdgeTreatment.ANGLE_UP, "htc_video_rotA-270");
        f41500 = C20195.unmodifiableMap(hashMap);
    }

    public C13920(InterfaceC6950 interfaceC6950, int i) {
        C10394 c10394 = new C10394();
        this.f41512 = -1L;
        this.f41521 = -9223372036854775807L;
        this.f41514 = -9223372036854775807L;
        this.f41504 = -9223372036854775807L;
        this.f41547 = -1L;
        this.f41538 = -1L;
        this.f41508 = -9223372036854775807L;
        this.f41526 = c10394;
        c10394.m26210(new C11805(this));
        this.f41503 = interfaceC6950;
        this.f41523 = (i & 1) == 0;
        this.f41530 = (i & 2) == 0;
        this.f41553 = new C1536();
        this.f41536 = new SparseArray();
        this.f41534 = new C17714(4);
        this.f41555 = new C17714(ByteBuffer.allocate(4).putInt(-1).array());
        this.f41518 = new C17714(4);
        this.f41531 = new C17714(C16509.f50737);
        this.f41510 = new C17714(4);
        this.f41542 = new C17714();
        this.f41515 = new C17714();
        this.f41520 = new C17714(8);
        this.f41535 = new C17714();
        this.f41505 = new C17714();
        this.f41517 = new int[1];
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return new C7571().m20296((C16184) interfaceC8424);
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if (this.f41530) {
            interfaceC21830 = new C9067(interfaceC21830, this.f41503);
        }
        this.f41554 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f41508 = -9223372036854775807L;
        int i = 0;
        this.f41550 = 0;
        this.f41526.m26209();
        this.f41553.m5252();
        m33343();
        while (true) {
            SparseArray sparseArray = this.f41536;
            if (i >= sparseArray.size()) {
                return;
            }
            C0331 c0331 = ((C23093) sparseArray.valueAt(i)).f74289;
            if (c0331 != null) {
                c0331.m1750();
            }
            i++;
        }
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        int i = 0;
        this.f41549 = false;
        boolean z = true;
        while (z && !this.f41549) {
            z = this.f41526.m26211(interfaceC8424);
            if (z) {
                long position = interfaceC8424.getPosition();
                if (this.f41525) {
                    this.f41538 = position;
                    c23615.f76532 = this.f41547;
                    this.f41525 = false;
                    return 1;
                }
                if (this.f41548) {
                    long j = this.f41538;
                    if (j != -1) {
                        c23615.f76532 = j;
                        this.f41538 = -1L;
                        return 1;
                    }
                } else {
                    continue;
                }
            }
        }
        if (z) {
            return 0;
        }
        while (true) {
            SparseArray sparseArray = this.f41536;
            if (i >= sparseArray.size()) {
                return -1;
            }
            C23093 c23093 = (C23093) sparseArray.valueAt(i);
            c23093.f74276.getClass();
            C0331 c0331 = c23093.f74289;
            if (c0331 != null) {
                c0331.m1753(c23093.f74276, c23093.f74266);
            }
            i++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33347(int i, long j) {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw C9080.m23440("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw C9080.m23440("ContentEncodingScope " + j + " not supported", (Throwable) null);
        }
        switch (i) {
            case 131:
                m33340(i);
                this.f41502.f74291 = (int) j;
                return;
            case 136:
                m33340(i);
                this.f41502.f74259 = j == 1;
                return;
            case 155:
                this.f41527 = m33333(j);
                return;
            case 159:
                m33340(i);
                this.f41502.f74286 = (int) j;
                return;
            case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                m33340(i);
                this.f41502.f74250 = (int) j;
                return;
            case 179:
                m33338(i);
                this.f41545.m13156(m33333(j));
                return;
            case 186:
                m33340(i);
                this.f41502.f74295 = (int) j;
                return;
            case 215:
                m33340(i);
                this.f41502.f74297 = (int) j;
                return;
            case 231:
                this.f41508 = m33333(j);
                return;
            case 238:
                this.f41506 = (int) j;
                return;
            case 241:
                if (this.f41509) {
                    return;
                }
                m33338(i);
                this.f41511.m13156(j);
                this.f41509 = true;
                return;
            case 251:
                this.f41541 = true;
                return;
            case 16871:
                m33340(i);
                this.f41502.f74282 = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw C9080.m23440("ContentCompAlgo " + j + " not supported", (Throwable) null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw C9080.m23440("DocTypeReadVersion " + j + " not supported", (Throwable) null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw C9080.m23440("EBMLReadVersion " + j + " not supported", (Throwable) null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw C9080.m23440("ContentEncAlgo " + j + " not supported", (Throwable) null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw C9080.m23440("AESSettingsCipherMode " + j + " not supported", (Throwable) null);
            case 21420:
                this.f41551 = j + this.f41512;
                return;
            case 21432:
                int i2 = (int) j;
                m33340(i);
                if (i2 == 0) {
                    this.f41502.f74257 = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f41502.f74257 = 2;
                    return;
                } else if (i2 == 3) {
                    this.f41502.f74257 = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f41502.f74257 = 3;
                    return;
                }
            case 21680:
                m33340(i);
                this.f41502.f74288 = (int) j;
                return;
            case 21682:
                m33340(i);
                this.f41502.f74256 = (int) j;
                return;
            case 21690:
                m33340(i);
                this.f41502.f74253 = (int) j;
                return;
            case 21930:
                m33340(i);
                this.f41502.f74249 = j == 1;
                return;
            case 21938:
                m33340(i);
                C23093 c23093 = this.f41502;
                c23093.f74265 = true;
                c23093.f74271 = (int) j;
                return;
            case 21998:
                m33340(i);
                this.f41502.f74258 = (int) j;
                return;
            case 22186:
                m33340(i);
                this.f41502.f74284 = j;
                return;
            case 22203:
                m33340(i);
                this.f41502.f74254 = j;
                return;
            case 25188:
                m33340(i);
                this.f41502.f74251 = (int) j;
                return;
            case 30114:
                this.f41543 = j;
                return;
            case 30321:
                m33340(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f41502.f74269 = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f41502.f74269 = 1;
                    return;
                } else if (i3 == 2) {
                    this.f41502.f74269 = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f41502.f74269 = 3;
                    return;
                }
            case 2352003:
                m33340(i);
                this.f41502.f74280 = (int) j;
                return;
            case 2807729:
                this.f41521 = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        m33340(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f41502.f74262 = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f41502.f74262 = 1;
                            return;
                        }
                    case 21946:
                        m33340(i);
                        int m47897 = C21054.m47897((int) j);
                        if (m47897 != -1) {
                            this.f41502.f74268 = m47897;
                            return;
                        }
                        return;
                    case 21947:
                        m33340(i);
                        this.f41502.f74265 = true;
                        int m47898 = C21054.m47898((int) j);
                        if (m47898 != -1) {
                            this.f41502.f74293 = m47898;
                            return;
                        }
                        return;
                    case 21948:
                        m33340(i);
                        this.f41502.f74255 = (int) j;
                        return;
                    case 21949:
                        m33340(i);
                        this.f41502.f74275 = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x026b, code lost:
    
        throw l.C9080.m23440("EBML lacing sample size out of range.", (java.lang.Throwable) null);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33346(int r21, int r22, l.InterfaceC8424 r23) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13920.m33346(int, int, l.۠᩷ۧ):void");
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m33340(int i) {
        if (this.f41502 != null) {
            return;
        }
        throw C9080.m23440("Element " + i + " must be in a TrackEntry", (Throwable) null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m33338(int i) {
        if (this.f41545 == null || this.f41511 == null) {
            throw C9080.m23440("Element " + i + " must be in a Cues", (Throwable) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33345(int i, double d) {
        if (i == 181) {
            m33340(i);
            this.f41502.f74267 = (int) d;
            return;
        }
        if (i == 17545) {
            this.f41514 = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m33340(i);
                this.f41502.f74287 = (float) d;
                break;
            case 21970:
                m33340(i);
                this.f41502.f74285 = (float) d;
                break;
            case 21971:
                m33340(i);
                this.f41502.f74272 = (float) d;
                break;
            case 21972:
                m33340(i);
                this.f41502.f74283 = (float) d;
                break;
            case 21973:
                m33340(i);
                this.f41502.f74264 = (float) d;
                break;
            case 21974:
                m33340(i);
                this.f41502.f74252 = (float) d;
                break;
            case 21975:
                m33340(i);
                this.f41502.f74248 = (float) d;
                break;
            case 21976:
                m33340(i);
                this.f41502.f74260 = (float) d;
                break;
            case 21977:
                m33340(i);
                this.f41502.f74274 = (float) d;
                break;
            case 21978:
                m33340(i);
                this.f41502.f74270 = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m33340(i);
                        this.f41502.f74294 = (float) d;
                        break;
                    case 30324:
                        m33340(i);
                        this.f41502.f74299 = (float) d;
                        break;
                    case 30325:
                        m33340(i);
                        this.f41502.f74263 = (float) d;
                        break;
                }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33348(int i, String str) {
        if (i == 134) {
            m33340(i);
            this.f41502.f74277 = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw C9080.m23440("DocType " + str + " not supported", (Throwable) null);
            }
            this.f41513 = str.equals("webm");
            return;
        }
        if (i == 21358) {
            m33340(i);
            this.f41502.f74273 = str;
        } else {
            if (i != 2274716) {
                return;
            }
            m33340(i);
            this.f41502.f74292 = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"#1.output"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m33336(l.C23093 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13920.m33336(l.᩺ܺۧ, long, int, int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33334(InterfaceC8424 interfaceC8424, int i) {
        C17714 c17714 = this.f41534;
        if (c17714.m41483() >= i) {
            return;
        }
        if (c17714.m41472() < i) {
            c17714.m41460(Math.max(c17714.m41472() * 2, i));
        }
        interfaceC8424.readFully(c17714.m41482(), c17714.m41483(), i - c17714.m41483());
        c17714.m41486(i);
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m33332(InterfaceC8424 interfaceC8424, C23093 c23093, int i, boolean z) {
        int mo8451;
        int mo84512;
        boolean z2;
        int i2;
        if ("S_TEXT/UTF8".equals(c23093.f74277)) {
            m33335(interfaceC8424, f41496, i);
        } else if ("S_TEXT/ASS".equals(c23093.f74277) || "S_TEXT/SSA".equals(c23093.f74277)) {
            m33335(interfaceC8424, f41497, i);
        } else if ("S_TEXT/WEBVTT".equals(c23093.f74277)) {
            m33335(interfaceC8424, f41499, i);
        } else {
            InterfaceC19383 interfaceC19383 = c23093.f74276;
            boolean z3 = this.f41532;
            C17714 c17714 = this.f41542;
            if (!z3) {
                boolean z4 = c23093.f74279;
                C17714 c177142 = this.f41534;
                if (z4) {
                    this.f41539 &= -1073741825;
                    if (!this.f41544) {
                        interfaceC8424.readFully(c177142.m41482(), 0, 1);
                        this.f41516++;
                        if ((c177142.m41482()[0] & GCMSIVBlockCipher.MASK) == 128) {
                            throw C9080.m23440("Extension bit is set in signal byte", (Throwable) null);
                        }
                        this.f41540 = c177142.m41482()[0];
                        this.f41544 = true;
                    }
                    byte b = this.f41540;
                    if ((b & 1) == 1) {
                        boolean z5 = (b & 2) == 2;
                        this.f41539 |= 1073741824;
                        if (!this.f41519) {
                            C17714 c177143 = this.f41520;
                            interfaceC8424.readFully(c177143.m41482(), 0, 8);
                            this.f41516 += 8;
                            this.f41519 = true;
                            c177142.m41482()[0] = (byte) ((z5 ? 128 : 0) | 8);
                            c177142.m41484(0);
                            interfaceC19383.mo8457(c177142, 1, 1);
                            this.f41529++;
                            c177143.m41484(0);
                            interfaceC19383.mo8457(c177143, 8, 1);
                            this.f41529 += 8;
                        }
                        if (z5) {
                            if (!this.f41528) {
                                interfaceC8424.readFully(c177142.m41482(), 0, 1);
                                this.f41516++;
                                c177142.m41484(0);
                                this.f41507 = c177142.m41456();
                                this.f41528 = true;
                            }
                            int i3 = this.f41507 * 4;
                            c177142.m41481(i3);
                            interfaceC8424.readFully(c177142.m41482(), 0, i3);
                            this.f41516 += i3;
                            short s = (short) ((this.f41507 / 2) + 1);
                            int i4 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.f41552;
                            if (byteBuffer == null || byteBuffer.capacity() < i4) {
                                this.f41552 = ByteBuffer.allocate(i4);
                            }
                            this.f41552.position(0);
                            this.f41552.putShort(s);
                            int i5 = 0;
                            int i6 = 0;
                            while (true) {
                                i2 = this.f41507;
                                if (i5 >= i2) {
                                    break;
                                }
                                int m41492 = c177142.m41492();
                                if (i5 % 2 == 0) {
                                    this.f41552.putShort((short) (m41492 - i6));
                                } else {
                                    this.f41552.putInt(m41492 - i6);
                                }
                                i5++;
                                i6 = m41492;
                            }
                            int i7 = (i - this.f41516) - i6;
                            if (i2 % 2 == 1) {
                                this.f41552.putInt(i7);
                            } else {
                                this.f41552.putShort((short) i7);
                                this.f41552.putInt(0);
                            }
                            byte[] array = this.f41552.array();
                            C17714 c177144 = this.f41535;
                            c177144.m41462(i4, array);
                            interfaceC19383.mo8457(c177144, i4, 1);
                            this.f41529 += i4;
                        }
                    }
                } else {
                    byte[] bArr = c23093.f74281;
                    if (bArr != null) {
                        c17714.m41462(bArr.length, bArr);
                    }
                }
                if ("A_OPUS".equals(c23093.f74277)) {
                    z2 = z;
                } else {
                    z2 = c23093.f74258 > 0;
                }
                if (z2) {
                    this.f41539 |= 268435456;
                    this.f41505.m41481(0);
                    int m41483 = (c17714.m41483() + i) - this.f41516;
                    c177142.m41481(4);
                    c177142.m41482()[0] = (byte) ((m41483 >> 24) & 255);
                    c177142.m41482()[1] = (byte) ((m41483 >> 16) & 255);
                    c177142.m41482()[2] = (byte) ((m41483 >> 8) & 255);
                    c177142.m41482()[3] = (byte) (m41483 & 255);
                    interfaceC19383.mo8457(c177142, 4, 2);
                    this.f41529 += 4;
                }
                this.f41532 = true;
            }
            int m414832 = c17714.m41483() + i;
            if ("V_MPEG4/ISO/AVC".equals(c23093.f74277) || "V_MPEGH/ISO/HEVC".equals(c23093.f74277)) {
                C17714 c177145 = this.f41510;
                byte[] m41482 = c177145.m41482();
                m41482[0] = 0;
                m41482[1] = 0;
                m41482[2] = 0;
                int i8 = c23093.f74261;
                int i9 = 4 - i8;
                while (this.f41516 < m414832) {
                    int i10 = this.f41556;
                    if (i10 == 0) {
                        int min = Math.min(i8, c17714.m41457());
                        interfaceC8424.readFully(m41482, i9 + min, i8 - min);
                        if (min > 0) {
                            c17714.m41461(i9, min, m41482);
                        }
                        this.f41516 += i8;
                        c177145.m41484(0);
                        this.f41556 = c177145.m41492();
                        C17714 c177146 = this.f41531;
                        c177146.m41484(0);
                        interfaceC19383.mo8453(4, c177146);
                        this.f41529 += 4;
                    } else {
                        int m41457 = c17714.m41457();
                        if (m41457 > 0) {
                            mo8451 = Math.min(i10, m41457);
                            interfaceC19383.mo8453(mo8451, c17714);
                        } else {
                            mo8451 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, i10, false);
                        }
                        this.f41516 += mo8451;
                        this.f41529 += mo8451;
                        this.f41556 -= mo8451;
                    }
                }
            } else {
                if (c23093.f74289 != null) {
                    C22632.m50634(c17714.m41483() == 0);
                    c23093.f74289.m1751(interfaceC8424);
                }
                while (true) {
                    int i11 = this.f41516;
                    if (i11 >= m414832) {
                        break;
                    }
                    int i12 = m414832 - i11;
                    int m414572 = c17714.m41457();
                    if (m414572 > 0) {
                        mo84512 = Math.min(i12, m414572);
                        interfaceC19383.mo8453(mo84512, c17714);
                    } else {
                        mo84512 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, i12, false);
                    }
                    this.f41516 += mo84512;
                    this.f41529 += mo84512;
                }
            }
            if ("A_VORBIS".equals(c23093.f74277)) {
                C17714 c177147 = this.f41555;
                c177147.m41484(0);
                interfaceC19383.mo8453(4, c177147);
                this.f41529 += 4;
            }
        }
        int i13 = this.f41529;
        m33343();
        return i13;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m33343() {
        this.f41516 = 0;
        this.f41529 = 0;
        this.f41556 = 0;
        this.f41532 = false;
        this.f41544 = false;
        this.f41528 = false;
        this.f41507 = 0;
        this.f41540 = (byte) 0;
        this.f41519 = false;
        this.f41542.m41481(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33335(InterfaceC8424 interfaceC8424, byte[] bArr, int i) {
        int length = bArr.length + i;
        C17714 c17714 = this.f41515;
        if (c17714.m41472() < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            c17714.getClass();
            c17714.m41462(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, c17714.m41482(), 0, bArr.length);
        }
        interfaceC8424.readFully(c17714.m41482(), bArr.length, i);
        c17714.m41484(0);
        c17714.m41486(length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m33337(String str, long j, long j2) {
        C22632.m50631(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = C3603.f11424;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33333(long j) {
        long j2 = this.f41521;
        if (j2 == -9223372036854775807L) {
            throw C9080.m23440("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
        }
        String str = C3603.f11424;
        return C3603.m11017(j, j2, 1000L, RoundingMode.DOWN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e9, code lost:
    
        if (r1.equals("S_DVBSUB") == false) goto L227;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m33344(int r18) {
        /*
            Method dump skipped, instructions count: 1200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13920.m33344(int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33349(long j, int i, long j2) {
        C22632.m50632(this.f41554);
        if (i == 160) {
            this.f41541 = false;
            this.f41543 = 0L;
            return;
        }
        if (i == 174) {
            C23093 c23093 = new C23093();
            this.f41502 = c23093;
            c23093.f74296 = this.f41513;
            return;
        }
        if (i == 187) {
            this.f41509 = false;
            return;
        }
        if (i == 19899) {
            this.f41558 = -1;
            this.f41551 = -1L;
            return;
        }
        if (i == 20533) {
            m33340(i);
            this.f41502.f74279 = true;
            return;
        }
        if (i == 21968) {
            m33340(i);
            this.f41502.f74265 = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f41512;
            if (j3 != -1 && j3 != j) {
                throw C9080.m23440("Multiple Segment elements not supported", (Throwable) null);
            }
            this.f41512 = j;
            this.f41546 = j2;
            return;
        }
        if (i == 475249515) {
            this.f41545 = new C4433();
            this.f41511 = new C4433();
        } else if (i == 524531317 && !this.f41548) {
            if (this.f41523 && this.f41547 != -1) {
                this.f41525 = true;
            } else {
                this.f41554.mo3430(new C20794(this.f41504));
                this.f41548 = true;
            }
        }
    }
}
