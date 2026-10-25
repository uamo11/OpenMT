package l;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.alipay.sdk.app.H5PayActivity$$ExternalSyntheticLambda0;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: 68UW */
/* renamed from: l.۠ۤ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8106 implements InterfaceC4639 {

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static ScheduledExecutorService f24988;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static int f24989;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final Object f24990 = new Object();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24991;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public Handler f24992;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9518 f24993;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public long f24994;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f24995;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21573 f24996;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21512 f24997;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C13830 f24998;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f24999;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final C12339 f25000;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17525 f25001;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f25002;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f25003;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public long f25004;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C6050 f25005;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f25006;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f25007;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public float f25008;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4993 f25009;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public ByteBuffer f25010;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f25011;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Context f25012;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public long f25013;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C15160 f25014;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public Looper f25015;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AudioTrack f25016;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C9518 f25017;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18690 f25018;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f25019;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15866 f25020;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C15866 f25021;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f25022;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final C18690 f25023;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25024;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C10223 f25025;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f25026;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C21222 f25027;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f25028;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public long f25029;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14455 f25030;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C1050 f25031;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f25032;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f25033;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10284 f25034;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C2730 f25035;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18231 f25036;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f25037;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C20868 f25038;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f25039;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18045 f25040;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f25041;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ByteBuffer f25042;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final boolean f25043;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f25044;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C9579 f25045;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f25046;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public long f25047;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25048;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f25049;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Context f25050;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f25051;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f25052;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f25053;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25054;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public long f25055;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3582 f25056;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C3873 f25057;

    public C8106(C20807 c20807) {
        Context context;
        InterfaceC4993 interfaceC4993;
        C15160 c15160;
        InterfaceC14455 interfaceC14455;
        C21512 c21512;
        Context context2;
        context = c20807.f67373;
        Context applicationContext = context.getApplicationContext();
        this.f25012 = applicationContext;
        this.f25036 = C18231.f56651;
        this.f25040 = applicationContext != null ? null : c20807.f67367;
        interfaceC4993 = c20807.f67370;
        this.f25009 = interfaceC4993;
        this.f25052 = false;
        int i = Build.VERSION.SDK_INT;
        this.f25043 = false;
        this.f25039 = 0;
        c15160 = c20807.f67372;
        this.f25014 = c15160;
        interfaceC14455 = c20807.f67368;
        interfaceC14455.getClass();
        this.f25030 = interfaceC14455;
        this.f25034 = new C10284(new C19396(this));
        C6050 c6050 = new C6050();
        this.f25005 = c6050;
        C10223 c10223 = new C10223();
        this.f25025 = c10223;
        this.f25027 = new C21222();
        this.f25000 = new C12339();
        this.f25044 = AbstractC14545.of((Object) c10223, (Object) c6050);
        this.f25008 = 1.0f;
        this.f25048 = 0;
        this.f25001 = new C17525();
        C2730 c2730 = C2730.f8507;
        this.f25021 = new C15866(c2730, 0L, 0L);
        this.f25035 = c2730;
        this.f25006 = false;
        this.f25037 = new ArrayDeque();
        this.f25018 = new C18690();
        this.f25023 = new C18690();
        c21512 = c20807.f67371;
        this.f24997 = c21512;
        int i2 = -1;
        if (i >= 34) {
            context2 = c20807.f67373;
            int deviceId = context2.getDeviceId();
            if (deviceId != 0 && deviceId != -1) {
                i2 = deviceId;
            }
        }
        this.f25032 = i2;
        this.f25046 = true;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13591(InterfaceC21573 interfaceC21573) {
        this.f24996 = interfaceC21573;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13587(C13830 c13830) {
        this.f24998 = c13830;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13588(InterfaceC16427 interfaceC16427) {
        this.f25034.m26036(interfaceC16427);
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final boolean mo13595(C8353 c8353) {
        return mo13598(c8353) != 0;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ۧ */
    public final int mo13598(C8353 c8353) {
        m21538();
        String str = c8353.f25614;
        int i = c8353.f25605;
        if ("audio/raw".equals(str)) {
            if (!C3603.m11034(i)) {
                C8083.m21451(i, "Invalid PCM encoding: ");
                return 0;
            }
            if (i != 2 && (!this.f25052 || i != 4)) {
                return 1;
            }
        } else if (this.f25040.m42102(this.f25036, c8353) == null) {
            return 0;
        }
        return 2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15927 m21567(C8353 c8353) {
        if (this.f25041) {
            return C15927.f49192;
        }
        return this.f25030.mo27246(this.f25036, c8353);
    }

    @Override // l.InterfaceC4639
    /* renamed from: ᩻ */
    public final long mo13605() {
        ArrayDeque arrayDeque;
        long j;
        if (!m21561() || this.f25033) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.f25034.m26037(), C3603.m11013(this.f24993.f28903, m21548()));
        while (true) {
            arrayDeque = this.f25037;
            if (arrayDeque.isEmpty() || min < ((C15866) arrayDeque.getFirst()).f49038) {
                break;
            }
            this.f25021 = (C15866) arrayDeque.remove();
        }
        C15866 c15866 = this.f25021;
        long j2 = min - c15866.f49038;
        long m11015 = C3603.m11015(j2, c15866.f49041.f8510);
        boolean isEmpty = arrayDeque.isEmpty();
        InterfaceC4993 interfaceC4993 = this.f25009;
        if (isEmpty) {
            long m22770 = ((C8812) interfaceC4993).m22770(j2);
            C15866 c158662 = this.f25021;
            j = c158662.f49040 + m22770;
            c158662.f49039 = m22770 - m11015;
        } else {
            C15866 c158663 = this.f25021;
            j = c158663.f49040 + m11015 + c158663.f49039;
        }
        long m22774 = ((C8812) interfaceC4993).m22774();
        long m11013 = C3603.m11013(this.f24993.f28903, m22774) + j;
        long j3 = this.f24994;
        if (m22774 > j3) {
            long m110132 = C3603.m11013(this.f24993.f28903, m22774 - j3);
            this.f24994 = m22774;
            this.f24995 += m110132;
            if (this.f24992 == null) {
                this.f24992 = new Handler(Looper.myLooper());
            }
            this.f24992.removeCallbacksAndMessages(null);
            this.f24992.postDelayed(new RunnableC7994(1, this), 100L);
        }
        return m11013;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13586(C8353 c8353, int[] iArr) {
        C15927 c15927;
        int intValue;
        C3582 c3582;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        C3582 c35822;
        int i6;
        int i7;
        int m11000;
        int m50530;
        m21538();
        String str = c8353.f25614;
        int i8 = c8353.f25624;
        int i9 = c8353.f25625;
        int i10 = c8353.f25605;
        boolean equals = "audio/raw".equals(str);
        boolean z5 = this.f25043;
        C21512 c21512 = this.f24997;
        if (equals) {
            C22632.m50631(C3603.m11034(i10));
            int m11047 = C3603.m11047(i10) * i9;
            C1846 c1846 = new C1846();
            c1846.m16263((List) this.f25044);
            if (this.f25052 && (i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4)) {
                c1846.m16264(this.f25000);
            } else {
                c1846.m16264(this.f25027);
                c1846.m6132((Object[]) ((C8812) this.f25009).m22773());
            }
            c3582 = new C3582(c1846.m6131());
            if (c3582.equals(this.f25056)) {
                c3582 = this.f25056;
            }
            this.f25025.m25668(c8353.f25629, c8353.f25630);
            this.f25005.m16879(iArr);
            try {
                C18399 m10970 = c3582.m10970(new C18399(i8, i9, i10));
                int i11 = m10970.f57132;
                int i12 = m10970.f57133;
                int i13 = m10970.f57134;
                c21512.getClass();
                intValue = C3603.m11035(i11);
                int m110472 = C3603.m11047(i12) * i11;
                i2 = m11047;
                z = z5;
                i4 = m110472;
                z2 = false;
                i5 = i13;
                i = i12;
                i3 = 0;
            } catch (C19105 e) {
                throw new C8167(e, c8353);
            }
        } else {
            C3582 c35823 = new C3582(AbstractC14545.of());
            if (this.f25039 != 0) {
                c15927 = m21567(c8353);
            } else {
                c15927 = C15927.f49192;
            }
            if (this.f25039 != 0 && c15927.f49193) {
                str.getClass();
                int m24805 = C9786.m24805(str, c8353.f25619);
                c21512.getClass();
                intValue = C3603.m11035(i9);
                c3582 = c35823;
                z2 = c15927.f49194;
                i = m24805;
                i2 = -1;
                i3 = 1;
                i4 = -1;
                z = true;
            } else {
                Pair m42102 = this.f25040.m42102(this.f25036, c8353);
                if (m42102 == null) {
                    throw new C8167("Unable to configure passthrough for: " + c8353, c8353);
                }
                int intValue2 = ((Integer) m42102.first).intValue();
                intValue = ((Integer) m42102.second).intValue();
                c3582 = c35823;
                i = intValue2;
                z = z5;
                i2 = -1;
                i3 = 2;
                i4 = -1;
                z2 = false;
            }
            i5 = i8;
        }
        if (i == 0) {
            throw new C8167("Invalid output encoding (mode=" + i3 + ") for: " + c8353, c8353);
        }
        if (intValue == 0) {
            throw new C8167("Invalid output channel config (mode=" + i3 + ") for: " + c8353, c8353);
        }
        int i14 = c8353.f25627;
        if ("audio/vnd.dts.hd;profile=lbr".equals(str) && i14 == -1) {
            i14 = 768000;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, intValue, i);
        C22632.m50634(minBufferSize != -2);
        int i15 = i4 != -1 ? i4 : 1;
        double d = z ? 8.0d : 1.0d;
        this.f25014.getClass();
        if (i3 != 0) {
            if (i3 == 1) {
                z3 = z;
                z4 = z2;
                int m505302 = C22535.m50530(i);
                C22632.m50634(m505302 != -2147483647);
                m11000 = C13426.m32446((50000000 * m505302) / 1000000);
            } else {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                int i16 = i == 5 ? 500000 : i == 8 ? BasicLabelFormatter.MILLION : 250000;
                if (i14 != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    m50530 = C5666.m15978(i14, 8);
                } else {
                    m50530 = C22535.m50530(i);
                    C22632.m50634(m50530 != -2147483647);
                }
                z3 = z;
                z4 = z2;
                m11000 = C13426.m32446((i16 * m50530) / 1000000);
            }
            i6 = intValue;
            i7 = i;
            c35822 = c3582;
        } else {
            z3 = z;
            z4 = z2;
            int i17 = i;
            c35822 = c3582;
            long j = i5;
            i6 = intValue;
            i7 = i17;
            long j2 = i15;
            m11000 = C3603.m11000(minBufferSize * 4, C13426.m32446(((250000 * j) * j2) / 1000000), C13426.m32446(((750000 * j) * j2) / 1000000));
        }
        this.f25041 = false;
        C9518 c9518 = new C9518(c8353, i2, i3, i4, i5, i6, i7, i15 * (((Math.max(minBufferSize, (int) (m11000 * d)) + i15) - 1) / i15), c35822, z3, z4, this.f25019);
        if (m21561()) {
            this.f25017 = c9518;
        } else {
            this.f24993 = c9518;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[SYNTHETIC] */
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m21560() {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8106.m21560():boolean");
    }

    @Override // l.InterfaceC4639
    /* renamed from: ܿ */
    public final void mo13602() {
        this.f25002 = true;
        if (m21561()) {
            this.f25034.m26039();
            if (!this.f25053 || m21546(this.f25016)) {
                this.f25016.play();
            }
        }
    }

    @Override // l.InterfaceC4639
    /* renamed from: ᩷ */
    public final void mo13604() {
        this.f25051 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00ab, code lost:
    
        if (m21560() == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x02a7, code lost:
    
        if (r5 == 0) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x029c  */
    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo13594(int r18, long r19, java.nio.ByteBuffer r21) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8106.mo13594(int, long, java.nio.ByteBuffer):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AudioTrack m21541(C9518 c9518) {
        int i;
        Context context;
        Context context2;
        try {
            int i2 = this.f25048;
            int i3 = this.f25032;
            if (i3 == -1 || (context2 = this.f25012) == null || Build.VERSION.SDK_INT < 34) {
                i = i2;
                context = null;
            } else {
                if (this.f25050 == null) {
                    this.f25050 = context2.createDeviceContext(i3);
                }
                context = this.f25050;
                i = 0;
            }
            return m21540(c9518.m24389(), this.f25036, i, c9518.f28909, context);
        } catch (C15221 e) {
            InterfaceC21573 interfaceC21573 = this.f24996;
            if (interfaceC21573 != null) {
                interfaceC21573.mo46349(e);
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AudioTrack m21540(C1111 c1111, C18231 c18231, int i, C8353 c8353, Context context) {
        try {
            AudioTrack m48680 = this.f24997.m48680(c1111, c18231, i, context);
            int state = m48680.getState();
            if (state == 1) {
                return m48680;
            }
            try {
                m48680.release();
            } catch (Exception unused) {
            }
            throw new C15221(state, c1111.f4057, c1111.f4054, c1111.f4056, c1111.f4053, c8353, c1111.f4058, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new C15221(0, c1111.f4057, c1111.f4054, c1111.f4056, c1111.f4053, c8353, c1111.f4058, e);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21557(long j) {
        m21553(j);
        if (this.f25010 != null) {
            return;
        }
        if (!this.f25056.m10977()) {
            ByteBuffer byteBuffer = this.f25007;
            if (byteBuffer != null) {
                m21544(byteBuffer);
                m21553(j);
                return;
            }
            return;
        }
        while (!this.f25056.m10975()) {
            do {
                ByteBuffer m10973 = this.f25056.m10973();
                if (m10973.hasRemaining()) {
                    m21544(m10973);
                    m21553(j);
                } else {
                    ByteBuffer byteBuffer2 = this.f25007;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f25056.m10972(this.f25007);
                    }
                }
            } while (this.f25010 == null);
            return;
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m21547() {
        if (!this.f25056.m10977()) {
            m21553(Long.MIN_VALUE);
            return this.f25010 == null;
        }
        this.f25056.m10976();
        m21557(Long.MIN_VALUE);
        if (!this.f25056.m10975()) {
            return false;
        }
        ByteBuffer byteBuffer = this.f25010;
        return byteBuffer == null || !byteBuffer.hasRemaining();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m21544(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8106.m21544(java.nio.ByteBuffer):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21553(long j) {
        int write;
        InterfaceC21573 interfaceC21573;
        if (this.f25010 == null) {
            return;
        }
        C18690 c18690 = this.f25023;
        if (c18690.m43310()) {
            return;
        }
        int remaining = this.f25010.remaining();
        if (this.f25019) {
            C22632.m50634(j != -9223372036854775807L);
            if (j == Long.MIN_VALUE) {
                j = this.f25011;
            } else {
                this.f25011 = j;
            }
            AudioTrack audioTrack = this.f25016;
            ByteBuffer byteBuffer = this.f25010;
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining, 1, 1000 * j);
            } else {
                if (this.f25042 == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.f25042 = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.f25042.putInt(1431633921);
                }
                if (this.f24991 == 0) {
                    this.f25042.putInt(4, remaining);
                    this.f25042.putLong(8, j * 1000);
                    this.f25042.position(0);
                    this.f24991 = remaining;
                }
                int remaining2 = this.f25042.remaining();
                if (remaining2 > 0) {
                    int write2 = audioTrack.write(this.f25042, remaining2, 1);
                    if (write2 < 0) {
                        this.f24991 = 0;
                        write = write2;
                    } else if (write2 < remaining2) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining, 1);
                if (write < 0) {
                    this.f24991 = 0;
                } else {
                    this.f24991 -= write;
                }
            }
        } else {
            write = this.f25016.write(this.f25010, remaining, 1);
        }
        this.f25028 = SystemClock.elapsedRealtime();
        if (write >= 0) {
            c18690.m43308();
            if (m21546(this.f25016)) {
                if (this.f25055 > 0) {
                    this.f25054 = false;
                }
                if (this.f25002 && (interfaceC21573 = this.f24996) != null && write < remaining && !this.f25054) {
                    interfaceC21573.mo46352();
                }
            }
            int i = this.f24993.f28911;
            if (i == 0) {
                this.f25029 += write;
            }
            if (write == remaining) {
                if (i != 0) {
                    C22632.m50634(this.f25010 == this.f25007);
                    this.f25055 = (this.f24999 * this.f25022) + this.f25055;
                }
                this.f25010 = null;
                return;
            }
            return;
        }
        if ((Build.VERSION.SDK_INT >= 24 && write == -6) || write == -32) {
            if (m21548() <= 0) {
                if (m21546(this.f25016)) {
                    if (this.f24993.f28911 == 1) {
                        this.f25041 = true;
                    }
                }
            }
            r8 = true;
        }
        C20162 c20162 = new C20162(write, this.f24993.f28909, r8);
        InterfaceC21573 interfaceC215732 = this.f24996;
        if (interfaceC215732 != null) {
            interfaceC215732.mo46349(c20162);
        }
        if (c20162.f65280 && this.f25012 != null) {
            C18045 c18045 = C18045.f56239;
            this.f25040 = c18045;
            this.f25038.m47691(c18045);
            throw c20162;
        }
        c18690.m43309(c20162);
    }

    @Override // l.InterfaceC4639
    /* renamed from: ۜ */
    public final void mo13596() {
        if (!this.f25026 && m21561() && m21547()) {
            m21549();
            this.f25026 = true;
        }
    }

    @Override // l.InterfaceC4639
    /* renamed from: ۧ */
    public final boolean mo13599() {
        if (m21561()) {
            return this.f25026 && !mo13593();
        }
        return true;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final boolean mo13593() {
        if (m21561()) {
            return !(Build.VERSION.SDK_INT >= 29 && this.f25016.isOffloadedPlayback() && this.f25024) && this.f25034.m26038(m21548());
        }
        return false;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13585(C2730 c2730) {
        this.f25035 = new C2730(C3603.m10997(c2730.f8510, 0.1f, 8.0f), C3603.m10997(c2730.f8508, 0.1f, 8.0f));
        if (m21551()) {
            m21539();
            return;
        }
        C15866 c15866 = new C15866(c2730, -9223372036854775807L, -9223372036854775807L);
        if (m21561()) {
            this.f25020 = c15866;
        } else {
            this.f25021 = c15866;
        }
    }

    @Override // l.InterfaceC4639
    /* renamed from: ܽ */
    public final C2730 mo13601() {
        return this.f25035;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13592(boolean z) {
        this.f25006 = z;
        C15866 c15866 = new C15866(m21551() ? C2730.f8507 : this.f25035, -9223372036854775807L, -9223372036854775807L);
        if (m21561()) {
            this.f25020 = c15866;
        } else {
            this.f25021 = c15866;
        }
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13590(C18231 c18231) {
        if (this.f25036.equals(c18231)) {
            return;
        }
        this.f25036 = c18231;
        if (this.f25019) {
            return;
        }
        C20868 c20868 = this.f25038;
        if (c20868 != null) {
            c20868.m47692(c18231);
        }
        flush();
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13583(int i) {
        if (this.f25049) {
            if (this.f25048 != i) {
                return;
            } else {
                this.f25049 = false;
            }
        }
        if (this.f25048 != i) {
            this.f25048 = i;
            this.f25003 = i != 0;
            flush();
        }
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13589(C17525 c17525) {
        if (this.f25001.equals(c17525)) {
            return;
        }
        c17525.getClass();
        if (this.f25016 != null) {
            this.f25001.getClass();
        }
        this.f25001 = c17525;
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13584(AudioDeviceInfo audioDeviceInfo) {
        this.f25045 = audioDeviceInfo == null ? null : new C9579(audioDeviceInfo);
        C20868 c20868 = this.f25038;
        if (c20868 != null) {
            c20868.m47690(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f25016;
        if (audioTrack != null) {
            C17984.m42024(audioTrack, this.f25045);
        }
    }

    @Override // l.InterfaceC4639
    /* renamed from: ᩳ */
    public final long mo13603() {
        long j;
        if (!m21561()) {
            return -9223372036854775807L;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return C17984.m42023(this.f25016, this.f24993);
        }
        C9518 c9518 = this.f24993;
        if (c9518.f28911 == 0) {
            j = c9518.f28903 * c9518.f28904;
        } else {
            int m50530 = C22535.m50530(c9518.f28902);
            C22632.m50634(m50530 != -2147483647);
            j = m50530;
        }
        return C3603.m11017(this.f24993.f28905, 1000000L, j, RoundingMode.DOWN);
    }

    @Override // l.InterfaceC4639
    /* renamed from: ۢ */
    public final void mo13597() {
        C22632.m50634(this.f25003);
        if (this.f25019) {
            return;
        }
        this.f25019 = true;
        flush();
    }

    @Override // l.InterfaceC4639
    /* renamed from: ܳ */
    public final void mo13600() {
        if (this.f25019) {
            this.f25019 = false;
            flush();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21566(int i) {
        C22632.m50634(Build.VERSION.SDK_INT >= 29);
        this.f25039 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21563(int i, int i2) {
        C9518 c9518;
        AudioTrack audioTrack = this.f25016;
        if (audioTrack == null || !m21546(audioTrack) || (c9518 = this.f24993) == null || !c9518.f28910) {
            return;
        }
        this.f25016.setOffloadDelayPadding(i, i2);
    }

    @Override // l.InterfaceC4639
    /* renamed from: ֫ */
    public final void mo13582(float f) {
        if (this.f25008 != f) {
            this.f25008 = f;
            if (m21561()) {
                this.f25016.setVolume(this.f25008);
            }
        }
    }

    @Override // l.InterfaceC4639
    public final void pause() {
        this.f25002 = false;
        if (m21561()) {
            this.f25034.m26043();
            if (!this.f25053 || m21546(this.f25016)) {
                this.f25016.pause();
            }
        }
    }

    @Override // l.InterfaceC4639
    public final void flush() {
        C3873 c3873;
        if (m21561()) {
            this.f25004 = 0L;
            this.f25047 = 0L;
            this.f25029 = 0L;
            this.f25055 = 0L;
            this.f25054 = false;
            this.f24999 = 0;
            this.f25021 = new C15866(this.f25035, 0L, 0L);
            this.f25013 = 0L;
            this.f25020 = null;
            this.f25037.clear();
            this.f25007 = null;
            this.f25022 = 0;
            this.f25010 = null;
            this.f25053 = false;
            this.f25026 = false;
            this.f25024 = false;
            this.f25042 = null;
            this.f24991 = 0;
            this.f25025.m25669();
            C3582 c3582 = this.f24993.f28901;
            this.f25056 = c3582;
            c3582.m10971();
            if (this.f25034.m26040()) {
                this.f25016.pause();
            }
            if (m21546(this.f25016)) {
                C1050 c1050 = this.f25031;
                c1050.getClass();
                c1050.m3619(this.f25016);
            }
            final C1111 m24389 = this.f24993.m24389();
            C9518 c9518 = this.f25017;
            if (c9518 != null) {
                this.f24993 = c9518;
                this.f25017 = null;
            }
            this.f25034.m26042();
            if (Build.VERSION.SDK_INT >= 24 && (c3873 = this.f25057) != null) {
                c3873.m11696();
                this.f25057 = null;
            }
            final AudioTrack audioTrack = this.f25016;
            final InterfaceC21573 interfaceC21573 = this.f24996;
            final Handler handler = new Handler(Looper.myLooper());
            synchronized (f24990) {
                if (f24988 == null) {
                    String str = C3603.f11424;
                    f24988 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC2192());
                }
                f24989++;
                f24988.schedule(new Runnable() { // from class: l.ܽۤ֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8106.m21543(audioTrack, interfaceC21573, handler, m24389);
                    }
                }, 20L, TimeUnit.MILLISECONDS);
            }
            this.f25016 = null;
        }
        this.f25023.m43308();
        this.f25018.m43308();
        this.f24994 = 0L;
        this.f24995 = 0L;
        Handler handler2 = this.f24992;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    @Override // l.InterfaceC4639
    public final void reset() {
        flush();
        AbstractC4628 listIterator = this.f25044.listIterator(0);
        while (listIterator.hasNext()) {
            ((InterfaceC0053) listIterator.next()).reset();
        }
        this.f25027.reset();
        this.f25000.reset();
        C3582 c3582 = this.f25056;
        if (c3582 != null) {
            c3582.m10974();
        }
        this.f25002 = false;
        this.f25041 = false;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m21565() {
        C20868 c20868 = this.f25038;
        if (c20868 != null) {
            c20868.m47693();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21564(C18045 c18045) {
        Looper myLooper = Looper.myLooper();
        boolean z = this.f25015 == myLooper;
        StringBuilder sb = new StringBuilder("Current looper (");
        sb.append(myLooper == null ? "null" : myLooper.getThread().getName());
        sb.append(") is not the playback looper (");
        Looper looper = this.f25015;
        sb.append(looper != null ? looper.getThread().getName() : "null");
        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
        C22632.m50633(sb.toString(), z);
        C18045 c180452 = this.f25040;
        if (c180452 == null || c18045.equals(c180452)) {
            return;
        }
        this.f25040 = c18045;
        InterfaceC21573 interfaceC21573 = this.f24996;
        if (interfaceC21573 != null) {
            interfaceC21573.mo46354();
        }
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m21539() {
        if (m21561()) {
            try {
                this.f25016.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f25035.f8510).setPitch(this.f25035.f8508).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                C19956.m46036("Failed to set playback params", e);
            }
            C2730 c2730 = new C2730(this.f25016.getPlaybackParams().getSpeed(), this.f25016.getPlaybackParams().getPitch());
            this.f25035 = c2730;
            this.f25034.m26033(c2730.f8510);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r1 != 4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        if (r1 != 4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m21542(long r16) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = r15.m21551()
            r2 = 4
            r3 = 1610612736(0x60000000, float:3.689349E19)
            r4 = 22
            r5 = 1342177280(0x50000000, float:8.589935E9)
            r6 = 21
            boolean r7 = r0.f25052
            l.ۚ֡֫ r8 = r0.f25009
            if (r1 != 0) goto L3f
            boolean r1 = r0.f25019
            if (r1 != 0) goto L3a
            l.ۢۤ֫ r1 = r0.f24993
            int r9 = r1.f28911
            if (r9 != 0) goto L3a
            l.۠ᩴ֫ r1 = r1.f28909
            int r1 = r1.f25605
            if (r7 == 0) goto L31
            java.lang.String r9 = l.C3603.f11424
            if (r1 == r6) goto L3a
            if (r1 == r5) goto L3a
            if (r1 == r4) goto L3a
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L31
            goto L3a
        L31:
            l.ۖ᩵֫ r1 = r0.f25035
            r9 = r8
            l.ۡۤ֫ r9 = (l.C8812) r9
            r9.m22771(r1)
            goto L3c
        L3a:
            l.ۖ᩵֫ r1 = l.C2730.f8507
        L3c:
            r0.f25035 = r1
            goto L41
        L3f:
            l.ۖ᩵֫ r1 = l.C2730.f8507
        L41:
            r10 = r1
            boolean r1 = r0.f25019
            if (r1 != 0) goto L67
            l.ۢۤ֫ r1 = r0.f24993
            int r9 = r1.f28911
            if (r9 != 0) goto L67
            l.۠ᩴ֫ r1 = r1.f28909
            int r1 = r1.f25605
            if (r7 == 0) goto L5f
            java.lang.String r7 = l.C3603.f11424
            if (r1 == r6) goto L67
            if (r1 == r5) goto L67
            if (r1 == r4) goto L67
            if (r1 == r3) goto L67
            if (r1 != r2) goto L5f
            goto L67
        L5f:
            boolean r1 = r0.f25006
            l.ۡۤ֫ r8 = (l.C8812) r8
            r8.m22772(r1)
            goto L68
        L67:
            r1 = 0
        L68:
            r0.f25006 = r1
            l.ܺۤ֫ r1 = new l.ܺۤ֫
            r2 = 0
            r4 = r16
            long r11 = java.lang.Math.max(r2, r4)
            l.ۢۤ֫ r2 = r0.f24993
            long r3 = r15.m21548()
            int r2 = r2.f28903
            long r13 = l.C3603.m11013(r2, r3)
            r9 = r1
            r9.<init>(r10, r11, r13)
            java.util.ArrayDeque r2 = r0.f25037
            r2.add(r1)
            l.ۢۤ֫ r1 = r0.f24993
            l.ۘ֡֫ r1 = r1.f28901
            r0.f25056 = r1
            r1.m10971()
            l.᩸۫֫ r1 = r0.f24996
            if (r1 == 0) goto L9b
            boolean r2 = r0.f25006
            r1.mo46351(r2)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8106.m21542(long):void");
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private boolean m21551() {
        C9518 c9518 = this.f24993;
        return c9518 != null && c9518.f28908 && Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private boolean m21561() {
        return this.f25016 != null;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static long m21562(C8106 c8106) {
        if (c8106.f24993.f28911 == 0) {
            return c8106.f25004 / r0.f28906;
        }
        return c8106.f25047;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long m21548() {
        C9518 c9518 = this.f24993;
        if (c9518.f28911 == 0) {
            long j = this.f25029;
            long j2 = c9518.f28904;
            String str = C3603.f11424;
            return ((j + j2) - 1) / j2;
        }
        return this.f25055;
    }

    @EnsuresNonNull({"audioCapabilities"})
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m21538() {
        Context context;
        Looper myLooper = Looper.myLooper();
        boolean z = this.f25038 == null || this.f25015 == myLooper;
        StringBuilder sb = new StringBuilder("DefaultAudioSink accessed on multiple threads: ");
        Looper looper = this.f25015;
        sb.append(looper == null ? "null" : looper.getThread().getName());
        sb.append(" and ");
        sb.append(myLooper != null ? myLooper.getThread().getName() : "null");
        C22632.m50633(sb.toString(), z);
        if (this.f25038 == null && (context = this.f25012) != null) {
            this.f25015 = myLooper;
            C20868 c20868 = new C20868(context, new H5PayActivity$$ExternalSyntheticLambda0(this), this.f25036, this.f25045);
            this.f25038 = c20868;
            this.f25040 = c20868.m47689();
        }
        this.f25040.getClass();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21546(AudioTrack audioTrack) {
        return Build.VERSION.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m21549() {
        if (this.f25053) {
            return;
        }
        this.f25053 = true;
        this.f25034.m26034(m21548());
        if (m21546(this.f25016)) {
            this.f25024 = false;
        }
        this.f25016.stop();
        this.f24991 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21543(AudioTrack audioTrack, InterfaceC21573 interfaceC21573, Handler handler, C1111 c1111) {
        try {
            audioTrack.flush();
            audioTrack.release();
            if (interfaceC21573 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC14897(1, interfaceC21573, c1111));
            }
            synchronized (f24990) {
                int i = f24989 - 1;
                f24989 = i;
                if (i == 0) {
                    f24988.shutdown();
                    f24988 = null;
                }
            }
        } catch (Throwable th) {
            if (interfaceC21573 != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new RunnableC14897(1, interfaceC21573, c1111));
            }
            synchronized (f24990) {
                int i2 = f24989 - 1;
                f24989 = i2;
                if (i2 == 0) {
                    f24988.shutdown();
                    f24988 = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m21555() {
        boolean z;
        synchronized (f24990) {
            z = f24989 > 0;
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21545(C8106 c8106) {
        if (c8106.f24995 >= 300000) {
            c8106.f24996.mo46345();
            c8106.f24995 = 0L;
        }
    }
}
