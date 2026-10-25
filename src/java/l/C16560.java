package l;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.AdapterView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.c;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* compiled from: 123V */
/* renamed from: l.ܽۢܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C16560 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f50877;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static Object f50878;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static C8817 f50879;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final Bitmap f50880;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static boolean f50881;

    /* renamed from: ᩺ۛ۫, reason: not valid java name and contains not printable characters */
    private static final short[] f50882;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final HashSet f50883;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public List f50884;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f50885;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f50886;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f50887;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public List f50888;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f50889;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C12327 f50891;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final C15854 f50892;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9506 f50893;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f50894;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f50896;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C8817 f50897;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f50898;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f50899;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f50900;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f50901;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public List f50902;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public AbstractC1661 f50903;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f50904;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final C9340 f50905;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C8817 f50906;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f50907;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f50908;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16560 f50909;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public String f50911;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C7719 f50890 = new C7719(this);

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final HashSet f50910 = new HashSet();

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f50895 = new AtomicInteger();

    @Override // android.widget.AdapterView.OnItemClickListener
    public native void onItemClick(AdapterView adapterView, View view, int i, long j);

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public native void m39018();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38968(C16560 c16560, C2075 c2075, String str) {
        c16560.getClass();
        c16560.m38959(Integer.valueOf(c2075.f6927), str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38979(C16560 c16560, C2075 c2075, String str) {
        c16560.getClass();
        c16560.m38959(Integer.valueOf(c2075.f6927), str);
    }

    public C16560(C9340 c9340, C9503 c9503, AbstractC16891 abstractC16891, boolean z, C12951 c12951) {
        List list = Collections.EMPTY_LIST;
        this.f50902 = list;
        this.f50888 = list;
        this.f50896 = "";
        this.f50886 = new WeakReference(null);
        this.f50884 = list;
        this.f50904 = new ArrayList();
        this.f50906 = C8817.m22789();
        this.f50897 = C8817.m22787();
        this.f50883 = new HashSet();
        this.f50905 = c9340;
        this.f50898 = z;
        this.f50900 = abstractC16891;
        this.f50891 = new C12327(this, c9503);
        C15854 c15854 = new C15854(this);
        this.f50892 = c15854;
        this.f50893 = new C9506(this);
        c15854.m37528(new C6410(this, c9340));
        c9503.setOnItemClickListener(this);
        c9503.setOnItemLongClickListener(this);
        c9503.m24355(new View.OnTouchListener() { // from class: l.᩷᩷ܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C16560.m38965(C16560.this, motionEvent);
                return false;
            }
        });
        if (c12951 != null) {
            final int readInt = c12951.readInt();
            final HashSet hashSet = new HashSet();
            final HashSet hashSet2 = new HashSet();
            int readInt2 = c12951.readInt();
            for (int i = 0; i < readInt2; i++) {
                hashSet.add(c12951.m31506());
            }
            int readInt3 = c12951.readInt();
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashSet2.add(c12951.m31506());
            }
            if (c12951.m31498()) {
                this.f50893.m24365(true);
                this.f50893.m24362(c12951.m31506());
                if (c9340.m24089() == z) {
                    this.f50905.m24093();
                }
            }
            final boolean mo39505 = this.f50900.mo39505();
            m38971(false, new Runnable() { // from class: l.ۢ᩷ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C16560.m38964(C16560.this, readInt, hashSet, hashSet2, mo39505);
                }
            }, false);
            return;
        }
        m38971(false, (Runnable) null, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38969(C16560 c16560, C9340 c9340) {
        if (c16560.f50908) {
            c9340.m24092();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38964(C16560 c16560, int i, HashSet hashSet, HashSet hashSet2, boolean z) {
        C12327 c12327 = c16560.f50891;
        c12327.m29924(i);
        boolean z2 = false;
        boolean z3 = false;
        for (InterfaceC17889 interfaceC17889 : c16560.f50888) {
            if (hashSet.contains(interfaceC17889.getName())) {
                interfaceC17889.setChecked(true);
                z2 = true;
                z3 = true;
            }
            if (hashSet2.contains(z ? interfaceC17889.getPath() : interfaceC17889.getName())) {
                interfaceC17889.mo36976(true);
                z3 = true;
            }
        }
        if (z2) {
            c16560.f50892.m37533();
        }
        if (z3) {
            c12327.m29923();
        }
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final void m39055() {
        if (m39040()) {
            return;
        }
        m38971(true, (Runnable) null, false);
        if (m39035("local")) {
            C20961.m47779(this.f50905.m24073(), this.f50900.m39742());
        }
    }

    static {
        ApplicationC12518.m30701(q.h);
        f50882 = new short[]{4417, 3053, 3046, 3041, 2977, 3042, 3067, 2977, 3071, 3043, 3066, 3068, 9832, 3628, 3631, 3619, 3617, 3628, 524, 18178, 18249, 18252, 18265, 18252};
        f50877 = Executors.newFixedThreadPool(2);
        f50879 = C8817.m22786(500);
        f50880 = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_4444);
        f50881 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38971(boolean z, Runnable runnable, boolean z2) {
        if (this.f50899 && this.f50908) {
            this.f50905.m24068();
        }
        C4897 c4897 = new C4897(this, this.f50900, z, z2, runnable);
        c4897.m20265(f50877);
        c4897.m20274();
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final void m39057() {
        int i = 0;
        int i2 = 0;
        for (InterfaceC17889 interfaceC17889 : m39014()) {
            if (!interfaceC17889.mo36981()) {
                if (interfaceC17889.mo36969()) {
                    i2++;
                } else {
                    i++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        Resources m14338 = C4925.m14338();
        sb.append(m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110006, i, Integer.valueOf(i)));
        sb.append(EnumC0121.f1143);
        sb.append(m14338.getQuantityString(R.plurals.MT_Protector_res_0x7f110005, i2, Integer.valueOf(i2)));
        C15854 c15854 = this.f50892;
        if (c15854.m37542()) {
            sb.append(EnumC0121.f1143);
            sb.append(m14338.getString(R.string.MT_Protector_res_0x7f120931, Integer.valueOf(c15854.m37539())));
        }
        this.f50896 = sb.toString();
        m38976();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m38961(java.util.List r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16560.m38961(java.util.List, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.֨᩷ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38962(final C16560 c16560, final int i, int i2, boolean z) {
        if (i != c16560.f50895.get()) {
            return;
        }
        c16560.f50891.m29920(i2, (C1369) new BooleanSupplier() { // from class: l.֨᩷ܳ
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return C16560.m38973(C16560.this, i);
            }
        });
        if (!z || c16560.f50892.m37542()) {
            return;
        }
        new RunnableC3486(c16560, i, i2).run();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m38973(C16560 c16560, int i) {
        return i == c16560.f50895.get();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39002(List list) {
        this.f50895.incrementAndGet();
        this.f50888 = list;
        m39057();
        this.f50892.m37535();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List m39014() {
        if (!m38957()) {
            return C17853.f54530;
        }
        return C20195.unmodifiableList(this.f50888);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m38994(int i) {
        return (InterfaceC17889) this.f50888.get(i);
    }

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static boolean m38957() {
        File file = null;
        String str = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        short[] sArr2 = null;
        int i4 = 0;
        int i5 = 818721515;
        int i6 = C3683.f11629;
        int i7 = C0714.f2697;
        int m6981 = (C2105.m6981("ۙۛ") + i7) * 43;
        int i8 = ((m6981 ^ i6) * 23581) ^ (-584967174);
        int i9 = -1413495714;
        while (true) {
            i5 = ((((i5 ^ i6) * 18057) >> 31) & i8) ^ (m6981 ^ i9);
            switch (i5) {
                case -2138980975:
                case 774816252:
                    if ((s * s2) - i2 > 0) {
                        m6981 = C0630.m2566("ۙۗ") ^ i6;
                        i8 = ((m6981 ^ i7) * 26443) ^ (-1402087231);
                        i9 = -2122740290;
                    } else {
                        m6981 = C2105.m6981("ۛ᩸") ^ i7;
                        i8 = ((m6981 ^ i6) * 12919) ^ (-431070706);
                        i9 = 149399882;
                    }
                case -2053929690:
                case -1743233955:
                    if (C3683.f11629 >= 0) {
                        m6981 = (C0630.m2566("۠᩵") + i6) * 57;
                        i8 = ((m6981 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    } else {
                        m6981 = (C0630.m2566("᩺ܳ") + i7) * 3;
                        i8 = ((m6981 ^ i6) * (-17611)) ^ 898351359;
                        i9 = 1217679234;
                    }
                case -2035786326:
                case 1300958383:
                    i3 = 2959;
                    m6981 = (C2105.m6981("ܿܳ") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((m6981 ^ i7) * 5315) ^ 1040558890;
                    i9 = -1954643752;
                case -2033471971:
                case -1179791074:
                    C4263.m12819();
                    C3245.m9925();
                    m6981 = (C2105.m6981("ۚۨ") ^ i6) * (-67);
                    i8 = ((m6981 ^ i7) * (-15547)) ^ (-131477328);
                    i9 = -318690128;
                case -1942021513:
                case 975396555:
                    file = C4925.m14322().getParentFile();
                    if (file != null) {
                        m6981 = C0630.m2566("۫ܳ") ^ i6;
                        i8 = ((m6981 ^ i7) * (-24103)) ^ 1072322134;
                        i9 = 750882296;
                    } else {
                        m6981 = (C2105.m6981("ۤᩳ") + i7) * (-37);
                        i8 = ((m6981 ^ i6) * (-241)) ^ (-112057334);
                        i9 = -663068256;
                    }
                case -1549573168:
                case 970079239:
                    i2 = i * i;
                    s2 = 51656;
                    if (C4117.f13076 <= 0) {
                        m6981 = (C0630.m2566("۠᩵") + i6) * 57;
                        i8 = ((m6981 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    } else {
                        m6981 = (C2105.m6981("ܶ᩶") ^ i6) * (-55);
                        i8 = ((m6981 ^ i7) * (-6979)) ^ 1609927557;
                        i9 = -160195196;
                    }
                case -1489637072:
                case -1469381261:
                    C4263.m12819();
                    if (C3663.m11168() < 0) {
                        m6981 = (C2105.m6981("۟ᩳ") + i7) * (-115);
                        i8 = ((m6981 ^ i6) * 6599) ^ (-785052589);
                        i9 = -1415159101;
                    } else {
                        m6981 = (C2105.m6981("᩺ۛ") + i7) * 69;
                        i8 = ((m6981 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    }
                case -1452586954:
                case 1979619149:
                    i3 = 12404;
                    m6981 = (C2105.m6981("ܿܳ") + i6) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                    i8 = ((m6981 ^ i7) * 5315) ^ 1040558890;
                    i9 = -1954643752;
                case -1159950232:
                case 906727427:
                    break;
                case -1157237687:
                case 1034884478:
                    if (C0237.f1507 != 0) {
                        m6981 = (C0630.m2566("۠᩵") + i6) * 57;
                        i8 = ((m6981 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    } else {
                        m6981 = C0630.m2566("ۚ֫") ^ i7;
                        i8 = ((m6981 ^ i6) * 7243) ^ (-985206384);
                        i9 = 198985002;
                    }
                case -1038568535:
                case 1288828363:
                    sArr = f50882;
                    c = 0;
                    if (C3911.f12484 >= 0) {
                        m6981 = (C2105.m6981("᩺ۛ") + i7) * 69;
                        i8 = ((m6981 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    } else {
                        m6981 = (C0630.m2566("ۢ۬") ^ i7) * (-103);
                        i8 = ((m6981 ^ i6) * (-20817)) ^ (-1126349901);
                        i9 = 1474096096;
                    }
                case -769542256:
                case -523169793:
                    i = s + 12914;
                    if (C2958.f9394 >= 0) {
                        m6981 = (i7 - C0630.m2566("ᩳ۫")) * (-99);
                        i8 = ((m6981 ^ i6) * (-19983)) ^ (-207077991);
                        i9 = -874856819;
                    } else {
                        m6981 = (C2105.m6981("᩹ۛ") ^ i7) * (-13);
                        i8 = ((m6981 ^ i6) * (-17793)) ^ 1181526743;
                        i9 = 1702963517;
                    }
                case -666463811:
                case 1050574707:
                    str = file.getName();
                    sArr2 = f50882;
                    if (C2167.f7158 >= 0) {
                        m6981 = (C2105.m6981("ۚۨ") ^ i6) * (-67);
                        i8 = ((m6981 ^ i7) * (-15547)) ^ (-131477328);
                        i9 = -318690128;
                    } else {
                        m6981 = C2105.m6981("ۚۘ") ^ i7;
                        i8 = ((m6981 ^ i6) * (-11279)) ^ 17480779;
                        i9 = -1148580990;
                    }
                case -496808512:
                case -9251580:
                    s = sArr[c];
                    if (C0630.f2410 <= 0) {
                        m6981 = (C2105.m6981("۟ᩳ") + i7) * (-115);
                        i8 = ((m6981 ^ i6) * 6599) ^ (-785052589);
                        i9 = -1415159101;
                    } else {
                        m6981 = C0630.m2566("֨۬") ^ i6;
                        i8 = ((m6981 ^ i7) * (-31145)) ^ 119879747;
                        i9 = 341211222;
                    }
                case -365176545:
                case 1301086178:
                    if (C0382.f1805) {
                        m6981 = C2105.m6981("۠۬") ^ i6;
                        i8 = ((m6981 ^ i7) * 8217) ^ 1350073355;
                        i9 = -1467620839;
                    } else {
                        m6981 = (C0630.m2566("۠᩵") + i6) * 57;
                        i8 = ((m6981 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    }
                case -307942425:
                case 1793636773:
                    C0382.m1848();
                    break;
                case -218971025:
                case 1543700472:
                    if (C4117.f13076 <= 0) {
                        m6981 = (C2105.m6981("᩺ۛ") + i7) * 69;
                        i8 = ((m6981 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    } else {
                        m6981 = (i6 - C2105.m6981("᩶ۡ")) * (-25);
                        i8 = ((m6981 ^ i7) * (-9275)) ^ (-1034554968);
                        i9 = -1542773945;
                    }
                case 335376709:
                case 954656561:
                    if (C1294.m4369(str, C1005.m3502(sArr2, i4, 11, i3))) {
                        m6981 = C0630.m2566("ۖ᩷") ^ i6;
                        i8 = ((m6981 ^ i7) * 16067) ^ (-1884361960);
                        i9 = -1030963313;
                    } else {
                        m6981 = (C2105.m6981("ۤᩳ") + i7) * (-37);
                        i8 = ((m6981 ^ i6) * (-241)) ^ (-112057334);
                        i9 = -663068256;
                    }
                case 400273081:
                case 863114972:
                    if (C1005.f3721) {
                        m6981 = (C2105.m6981("᩺ۛ") + i7) * 69;
                        i8 = ((m6981 ^ i6) * 28219) ^ 1620139151;
                        i9 = 1627332239;
                    } else {
                        m6981 = (C0630.m2566("۠᩵") + i6) * 57;
                        i8 = ((m6981 ^ i7) * (-18635)) ^ (-361037512);
                        i9 = -637239167;
                    }
                case 690382159:
                case 1020134073:
                    if (C0422.f1886 > 0) {
                        m6981 = (C2105.m6981("ۚۨ") ^ i6) * (-67);
                        i8 = ((m6981 ^ i7) * (-15547)) ^ (-131477328);
                        i9 = -318690128;
                    } else {
                        m6981 = (C2105.m6981("۟ᩳ") + i7) * (-115);
                        i8 = ((m6981 ^ i6) * 6599) ^ (-785052589);
                        i9 = -1415159101;
                    }
                case 902154913:
                case 1525415172:
                    i4 = 1;
                    if (C4263.m12819() >= 0) {
                        m6981 = (C2105.m6981("ۚۨ") ^ i6) * (-67);
                        i8 = ((m6981 ^ i7) * (-15547)) ^ (-131477328);
                        i9 = -318690128;
                    } else {
                        m6981 = (i7 - C2105.m6981("֫ܺ")) * 41;
                        i8 = ((m6981 ^ i6) * (-8671)) ^ (-1920253337);
                        i9 = -646933733;
                    }
            }
            return false;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List m39028() {
        return C20195.unmodifiableList(this.f50902);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39006(C16560 c16560) {
        this.f50909 = c16560;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC16891 m39044() {
        return this.f50900;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m39048() {
        AbstractC16891 abstractC16891 = this.f50900;
        return abstractC16891.f51868.m27821() || abstractC16891.m39732() != 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m39054() {
        return this.f50900.f51868.m27823();
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m39063() {
        return this.f50900.mo6020();
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m39038() {
        return this.f50900.mo39505();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39047(AbstractC16891 abstractC16891) {
        AbstractC16891 abstractC168912 = this.f50900;
        abstractC168912.f51868.f33716.put(abstractC168912.m39741(), Integer.valueOf(this.f50891.m29916()));
        this.f50900 = abstractC16891;
        m38958();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39003(C5259 c5259) {
        this.f50886 = new WeakReference(c5259);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39034(AbstractC16891 abstractC16891) {
        m39047(abstractC16891);
        if (abstractC16891 != this.f50886.get()) {
            m38971(false, (Runnable) new RunnableC16185(0, this), true);
        } else {
            this.f50886.clear();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38978(C16560 c16560) {
        AbstractC16891 abstractC16891 = c16560.f50900;
        Integer num = (Integer) abstractC16891.f51868.f33716.getOrDefault(abstractC16891.m39741(), null);
        c16560.f50891.m29924(num == null ? 0 : num.intValue());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39010(InterfaceC18303 interfaceC18303, Runnable runnable) {
        C9340 c9340 = this.f50905;
        c9340.getClass();
        C14277 c14277 = new C14277(c9340, this, interfaceC18303, runnable);
        c14277.m20265(f50877);
        c14277.m20274();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39009(InterfaceC18303 interfaceC18303) {
        C9340 c9340 = this.f50905;
        c9340.getClass();
        C14277 c14277 = new C14277(c9340, this, interfaceC18303, null);
        c14277.m20265(f50877);
        c14277.m20274();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39005(AbstractC15440 abstractC15440) {
        this.f50909 = this.f50909;
        m39041();
        this.f50909.m39041();
        AbstractC15440 m36514 = abstractC15440.m36514();
        if (m39035("local") && C16999.m39866(this.f50900.m39741(), new String[0]).equals(m36514)) {
            m39053(abstractC15440.getName());
            return;
        }
        this.f50909.m39053(abstractC15440.getName());
        if (this.f50909.m39035("local") && C16999.m39866(this.f50909.f50900.m39741(), new String[0]).equals(m36514)) {
            return;
        }
        this.f50909.m39033(m36514.mo23554(), true);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16560 m39026() {
        return this.f50909;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39046(String str) {
        C16560 c16560 = this.f50909;
        String m39731 = AbstractC16891.m39731(str);
        AbstractC16891 abstractC16891 = this.f50900;
        if (!(abstractC16891 instanceof C16773 ? abstractC16891.m39741().equals(m39731) : false)) {
            c16560.getClass();
            String m397312 = AbstractC16891.m39731(str);
            AbstractC16891 abstractC168912 = c16560.f50900;
            if (abstractC168912 instanceof C16773 ? abstractC168912.m39741().equals(m397312) : false) {
                c16560.m39042();
                HashSet hashSet = this.f50910;
                if (!hashSet.isEmpty()) {
                    c16560.m38977(hashSet, this.f50894);
                    if (this.f50885) {
                        c16560.f50885 = true;
                        this.f50885 = false;
                    }
                    hashSet.clear();
                    this.f50894 = false;
                }
                c16560.m39033(str, true);
                return;
            }
        }
        m39033(str, true);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m39058() {
        return this.f50900.m39741();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m39020() {
        return this.f50900.m39742();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m38990() {
        if (this.f50900.mo39505()) {
            return C4925.m14327(R.string.MT_Protector_res_0x7f120900);
        }
        String m39741 = this.f50900.m39741();
        if (m39741.length() == 1) {
            return m39741;
        }
        int lastIndexOf = m39741.lastIndexOf(47, m39741.length() - 2);
        return lastIndexOf != -1 ? C15472.m36561(1, lastIndexOf + 1, m39741) : C15472.m36561(1, 0, m39741);
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m38991() {
        return this.f50900.mo39507();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39011(boolean z) {
        this.f50908 = z;
        m38976();
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m39021() {
        return this.f50908;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m39040() {
        boolean z;
        synchronized (this.f50883) {
            z = !this.f50883.isEmpty();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public void m38976() {
        if (this.f50908) {
            String mo6009 = this.f50900.mo6009();
            C9340 c9340 = this.f50905;
            c9340.m24075(mo6009);
            if (!this.f50899 || TextUtils.isEmpty(this.f50911)) {
                String mo35228 = this.f50900.mo35228(this);
                if (mo35228 != null) {
                    c9340.m24056((CharSequence) C23202.m51498(new StringBuilder(), this.f50896, EnumC0121.f1143, mo35228));
                } else {
                    c9340.m24056((CharSequence) this.f50896);
                }
            } else {
                c9340.m24056((CharSequence) this.f50911);
            }
            c9340.m24092();
        }
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m39059() {
        return this.f50900.mo6009();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38997(SubMenu subMenu) {
        if (m39040()) {
            return;
        }
        if (this.f50899) {
            this.f50884 = Collections.singletonList(AbstractC16891.f51864);
        } else {
            this.f50884 = this.f50900.mo6010();
        }
        ArrayList arrayList = this.f50904;
        arrayList.clear();
        int size = this.f50884.size();
        for (int i = 0; i < size; i++) {
            AbstractC10128 abstractC10128 = (AbstractC10128) this.f50884.get(i);
            if (abstractC10128.mo9841()) {
                List<AbstractC10128> m25406 = abstractC10128.m25406();
                if (m25406.isEmpty()) {
                    MenuItem icon = subMenu.add(0, i | 2113929216, 0, abstractC10128.m25407()).setIcon(abstractC10128.m25404());
                    if (abstractC10128.mo25409()) {
                        icon.setCheckable(true).setChecked(abstractC10128.mo25408());
                    }
                    if (!abstractC10128.mo19969(this)) {
                        icon.setEnabled(false);
                    }
                } else {
                    SubMenu icon2 = subMenu.addSubMenu(0, i | 2113929216, 0, abstractC10128.m25407()).setIcon(abstractC10128.m25404());
                    if (!abstractC10128.mo19969(this)) {
                        icon2.getItem().setEnabled(false);
                    }
                    for (AbstractC10128 abstractC101282 : m25406) {
                        int size2 = arrayList.size();
                        arrayList.add(abstractC101282);
                        MenuItem icon3 = icon2.add(0, size2 | 2097152000, 0, abstractC101282.m25407()).setIcon(abstractC101282.m25404());
                        if (abstractC101282.mo25409()) {
                            icon3.setCheckable(true).setChecked(abstractC101282.mo25408());
                        }
                        if (!abstractC101282.mo19969(this)) {
                            icon3.setEnabled(false);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39032(int i) {
        int i2 = i >>> 24;
        int i3 = i & 16777215;
        if (i2 == 126) {
            if (i3 < this.f50884.size()) {
                ((AbstractC10128) this.f50884.get(i3)).mo5346(this);
            }
        } else if (i2 == 125) {
            ArrayList arrayList = this.f50904;
            if (i3 < arrayList.size()) {
                ((AbstractC10128) arrayList.get(i3)).mo5346(this);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39033(String str, boolean z) {
        AbstractC16891 abstractC16891;
        if (m39040()) {
            RunnableC0663 runnableC0663 = new RunnableC0663(this, this.f50901, this.f50885, this.f50894, new ArrayList(this.f50910), str, z);
            if (m39040()) {
                C4925.m14316(new RunnableC8425(0, this, runnableC0663), 100L);
                return;
            } else {
                runnableC0663.run();
                return;
            }
        }
        if (z) {
            AbstractC16891 abstractC168912 = this.f50900;
            if (abstractC168912 instanceof C16773) {
                m38982(str);
                return;
            }
            int m39732 = abstractC168912.m39732();
            C11971 m24094 = this.f50905.m24094();
            m24094.m29245();
            AbstractC16891 abstractC168913 = null;
            if (m39732 != 0) {
                try {
                    Iterator it = m24094.iterator();
                    abstractC16891 = null;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC16891 abstractC168914 = (AbstractC16891) it.next();
                        if (abstractC168914.m39746() == m39732 && (abstractC168914 instanceof C16773)) {
                            abstractC168913 = abstractC168914;
                            break;
                        } else if (abstractC16891 == null && (abstractC168914 instanceof C16773)) {
                            abstractC16891 = abstractC168914;
                        }
                    }
                } catch (Throwable th) {
                    m24094.m29244();
                    throw th;
                }
            } else {
                abstractC16891 = null;
            }
            if (abstractC168913 == null) {
                if (abstractC16891 == null) {
                    throw new RuntimeException();
                }
                abstractC168913 = abstractC16891;
            }
            m24094.remove(abstractC168913);
            if (abstractC168912.mo35229()) {
                m24094.add(abstractC168912);
                abstractC168912.f51868.f33716.put(abstractC168912.m39741(), Integer.valueOf(this.f50891.m29916()));
            } else {
                if (abstractC168912.m39732() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                abstractC168912.m39744();
            }
            m24094.m29244();
            this.f50900 = abstractC168913;
            abstractC168913.mo6018(this);
            m38958();
            m38982(str);
            C5935.m16666();
            return;
        }
        m38982(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38970(C16560 c16560, boolean z, boolean z2, boolean z3, ArrayList arrayList, String str, boolean z4) {
        c16560.f50901 = z;
        c16560.f50885 = z2;
        c16560.f50894 = z3;
        HashSet hashSet = c16560.f50910;
        hashSet.clear();
        hashSet.addAll(arrayList);
        c16560.m39033(str, z4);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m38982(String str) {
        String m39731 = AbstractC16891.m39731(str);
        if (!this.f50900.m39741().equals(m39731)) {
            AbstractC16891 abstractC16891 = this.f50900;
            abstractC16891.f51868.f33716.put(abstractC16891.m39741(), Integer.valueOf(this.f50891.m29916()));
            this.f50900.f51868.m27825(m38974());
            this.f50900.mo35230(m39731);
        }
        C9506 c9506 = this.f50893;
        boolean m24367 = c9506.m24367();
        C9340 c9340 = this.f50905;
        if (m24367) {
            c9506.m24361();
            c9340.m24067();
        }
        m38971(false, this.f50901 ? null : new Runnable() { // from class: l.ܳ᩷ܳ
            @Override // java.lang.Runnable
            public final void run() {
                C16560.this.f50891.m29924(0);
            }
        }, true);
        if (m39035("local")) {
            C20961.m47779(c9340.m24073(), this.f50900.m39742());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38965(C16560 c16560, MotionEvent motionEvent) {
        if (!f50881 && motionEvent.getActionMasked() == 0 && c16560.f50905.m24073().m10245()) {
            f50881 = true;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        int m7918;
        InterfaceC17889 interfaceC17889;
        InterfaceC17889 interfaceC178892;
        if (!m39040() && !this.f50899 && i <= this.f50888.size()) {
            this.f50907 = i;
            if (!((InterfaceC17889) this.f50888.get(i)).mo36981()) {
                final int i2 = this.f50895.get();
                final C2450 c2450 = new C2450(this);
                AbstractC16891 abstractC16891 = this.f50900;
                abstractC16891.getClass();
                C14173 c14173 = null;
                if (!c2450.m7916("trash") && c2450.m7924() && (m7918 = c2450.m7918()) <= 2) {
                    if (m7918 == 2) {
                        List m7909 = c2450.m7909();
                        interfaceC17889 = (InterfaceC17889) m7909.get(0);
                        interfaceC178892 = (InterfaceC17889) m7909.get(1);
                    } else {
                        C16560 m7919 = c2450.m7919();
                        if (!m7919.m39035("trash") && m7919.f50892.m37542() && m7919.m39043() == 1) {
                            InterfaceC17889 m7913 = c2450.m7913();
                            InterfaceC17889 m39025 = m7919.m39025();
                            interfaceC17889 = m7913;
                            interfaceC178892 = m39025;
                        }
                    }
                    if (interfaceC17889.isDirectory() && interfaceC178892.isDirectory()) {
                        c14173 = new C14173(-1L, -1L, "folder", "folder");
                    } else if (interfaceC17889.mo36969() && interfaceC178892.mo36969()) {
                        String lowerCase = interfaceC17889.getName().toLowerCase();
                        String lowerCase2 = interfaceC178892.getName().toLowerCase();
                        if (lowerCase.endsWith(".bak")) {
                            lowerCase = C15472.m36561(4, 0, lowerCase);
                        }
                        if (lowerCase2.endsWith(".bak")) {
                            lowerCase2 = C15472.m36561(4, 0, lowerCase2);
                        }
                        String m36487 = AbstractC15440.m36487(lowerCase);
                        String m364872 = AbstractC15440.m36487(lowerCase2);
                        if (!m36487.isEmpty()) {
                            m36487 = m36487.substring(1);
                        }
                        String str = m36487;
                        if (!m364872.isEmpty()) {
                            m364872 = m364872.substring(1);
                        }
                        c14173 = new C14173(interfaceC17889.getSize(), interfaceC178892.getSize(), str, m364872);
                    }
                }
                abstractC16891.f51866 = c14173;
                final ArrayList arrayList = new ArrayList(10);
                for (int i3 : DialogInterfaceOnDismissListenerC15010.m35543()) {
                    switch (i3) {
                        case 0:
                            arrayList.add(abstractC16891.mo39503(c2450));
                            break;
                        case 1:
                            arrayList.add(abstractC16891.mo15165(c2450));
                            break;
                        case 2:
                            arrayList.add(abstractC16891.mo15159());
                            break;
                        case 3:
                            arrayList.add(abstractC16891.mo15172());
                            break;
                        case 4:
                            arrayList.add(abstractC16891.mo15169());
                            break;
                        case 5:
                            arrayList.add(abstractC16891.mo39504());
                            break;
                        case 6:
                            arrayList.add(abstractC16891.mo6008());
                            break;
                        case 7:
                            arrayList.add(abstractC16891.mo35231());
                            break;
                        case 8:
                            arrayList.add(abstractC16891.mo35227());
                            break;
                        case 9:
                            arrayList.add(abstractC16891.mo15164());
                            break;
                    }
                }
                abstractC16891.mo26935(c2450, arrayList);
                if (!arrayList.isEmpty()) {
                    Main m24073 = this.f50905.m24073();
                    if (f50881 || !m24073.m10245()) {
                        ViewOnClickListenerC21681 viewOnClickListenerC21681 = new ViewOnClickListenerC21681(m24073, m24073.m126());
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            AbstractC1661 abstractC1661 = (AbstractC1661) arrayList.get(i4);
                            String m14327 = C4925.m14327(abstractC1661.m5610());
                            if (abstractC1661.m5609()) {
                                m14327 = this.f50898 ? m14327.concat(" ->") : "<- ".concat(m14327);
                            }
                            viewOnClickListenerC21681.m48956(m14327, i4, abstractC1661.m5607(), abstractC1661.m5605(c2450), abstractC1661.m5608(c2450));
                        }
                        viewOnClickListenerC21681.m48958(new InterfaceC15329() { // from class: l.ۖ᩷ܳ
                            @Override // l.InterfaceC15329
                            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                            public final void mo8585(int i5) {
                                C16560.m38963(C16560.this, i2, arrayList, c2450, i5);
                            }
                        });
                        viewOnClickListenerC21681.m48957(new C4192(this, i2, arrayList, c2450));
                        viewOnClickListenerC21681.m48954();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38963(C16560 c16560, int i, ArrayList arrayList, C2450 c2450, int i2) {
        if (i == c16560.f50895.get()) {
            ((AbstractC1661) arrayList.get(i2)).m5606(c2450, false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m38981(C16560 c16560, int i, ArrayList arrayList, C2450 c2450, int i2) {
        if (i == c16560.f50895.get()) {
            return ((AbstractC1661) arrayList.get(i2)).m5606(c2450, true);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m39012() {
        final String m39741;
        final String m24406;
        if (!m39040()) {
            if (this.f50892.m37542()) {
                m39041();
                return true;
            }
            C9506 c9506 = this.f50893;
            boolean m24367 = c9506.m24367();
            C9340 c9340 = this.f50905;
            if (m24367) {
                c9506.m24365(false);
                c9340.m24067();
                return true;
            }
            if (this.f50900.mo39505()) {
                m24406 = this.f50900.mo39508();
                m39741 = null;
            } else {
                m39741 = this.f50900.m39741();
                m24406 = C9523.m24406(m39741);
            }
            if (m24406 == null) {
                if (this.f50900.m39732() == 0) {
                    return false;
                }
                AbstractC16891 abstractC16891 = this.f50900;
                abstractC16891.getClass();
                if (abstractC16891 instanceof C5259) {
                    if (this.f50897.m22791()) {
                        C21374.m48457(this.f50900.mo15166());
                        return true;
                    }
                    C21374.m48465();
                }
                this.f50891.m29921(this.f50900.m39740());
                c9340.m24059(this);
                return true;
            }
            if (!this.f50906.m22793()) {
                this.f50900.f51868.m27825(m38974());
                this.f50900.mo35230(m24406);
                c9506.m24361();
                m38971(false, new Runnable() { // from class: l.ۚ᩷ܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C16560.m38966(C16560.this, m24406, m39741);
                    }
                }, true);
                if (m39035("local")) {
                    C20961.m47779(c9340.m24073(), this.f50900.m39742());
                }
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38966(C16560 c16560, String str, String str2) {
        c16560.m38959((Integer) c16560.f50900.f51868.f33716.getOrDefault(str, null), str2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39031() {
        if (m39040() || !m39048()) {
            return;
        }
        if (!this.f50900.f51868.m27821()) {
            AbstractC16891 abstractC16891 = this.f50900;
            abstractC16891.getClass();
            if (abstractC16891 instanceof C5259) {
                if (this.f50897.m22791()) {
                    C21374.m48457(this.f50900.mo15166());
                    return;
                }
                C21374.m48465();
            }
            this.f50891.m29921(this.f50900.m39740());
            this.f50905.m24059(this);
            return;
        }
        C2075 m27818 = this.f50900.f51868.m27818(m38974());
        String m39741 = this.f50900.m39741();
        this.f50900.mo35230(m27818.f6926);
        String m397412 = this.f50900.m39741();
        if (!m397412.startsWith("//SEARCH//") && (m39741.startsWith("//SEARCH//") || m39741.length() <= m397412.length() || !m397412.equals(C9523.m24406(m39741)))) {
            m39741 = null;
        }
        this.f50893.m24364(m27818);
        m38971(false, (Runnable) new RunnableC7014(this, m27818, m39741), true);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39060() {
        if (!m39040() && m39054() && this.f50900.f51868.m27823()) {
            final C2075 m27822 = this.f50900.f51868.m27822(m38974());
            final String m39741 = this.f50900.m39741();
            this.f50900.mo35230(m27822.f6926);
            String m397412 = this.f50900.m39741();
            if (m39741.startsWith("//SEARCH//") || m397412.startsWith("//SEARCH//") || m39741.length() <= m397412.length() || !m397412.equals(C9523.m24406(m39741))) {
                m39741 = null;
            }
            this.f50893.m24364(m27822);
            m38971(false, new Runnable() { // from class: l.ۡ᩷ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C16560.m38979(C16560.this, m27822, m39741);
                }
            }, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.᩻᩷ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38959(Integer num, String str) {
        int intValue = num == null ? 0 : num.intValue();
        C12327 c12327 = this.f50891;
        if (str != null) {
            if (str.endsWith("/")) {
                str = C15472.m36561(1, 0, str);
            }
            for (int i = 0; i < this.f50888.size(); i++) {
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) this.f50888.get(i);
                if (interfaceC17889.isDirectory() && interfaceC17889.getPath().equals(str)) {
                    final int i2 = this.f50895.get();
                    c12327.m29917(intValue, i, str, (C23947) new BooleanSupplier() { // from class: l.᩻᩷ܳ
                        @Override // java.util.function.BooleanSupplier
                        public final boolean getAsBoolean() {
                            return C16560.m38980(C16560.this, i2);
                        }
                    });
                    return;
                }
            }
        }
        c12327.m29924(intValue);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m38980(C16560 c16560, int i) {
        return i == c16560.f50895.get();
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final void m39066() {
        if (m39040() || this.f50899) {
            return;
        }
        this.f50892.m37544();
        this.f50891.m29927();
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final void m39061() {
        if (m39040() || this.f50899) {
            return;
        }
        C15854 c15854 = this.f50892;
        if (c15854.m37542()) {
            c15854.m37532();
            this.f50891.m29927();
        }
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final void m39029() {
        if (m39040() || this.f50899) {
            return;
        }
        C15854 c15854 = this.f50892;
        if (c15854.m37542()) {
            c15854.m37543();
            this.f50891.m29927();
        }
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final void m39023() {
        if (!m39040() && this.f50892.m37542()) {
            new C5189(this.f50905.m24073(), new C13363(this)).m14952();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39041() {
        if (m39040()) {
            return;
        }
        C15854 c15854 = this.f50892;
        if (c15854.m37542()) {
            c15854.m37525();
            this.f50891.m29927();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39007(AbstractC16891 abstractC16891) {
        this.f50905.m24061(this, abstractC16891);
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C9340 m39016() {
        return this.f50905;
    }

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    private C2075 m38974() {
        String m39741 = this.f50900.m39741();
        int m29916 = this.f50891.m29916();
        C9506 c9506 = this.f50893;
        return new C2075(m39741, m29916, c9506.m24366(), c9506.m24367());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m39035(String str) {
        return str.equals(this.f50900.mo6007());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38998(String str) {
        if (C11003.equals(str, this.f50900.mo6007())) {
            return;
        }
        StringBuilder m9834 = C3200.m9834("Expected type: ", str, ", got: ");
        m9834.append(this.f50900.mo6007());
        throw new RuntimeException(m9834.toString());
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Main m39056() {
        return this.f50905.m24073();
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m39030() {
        return this.f50892.m37542();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m39043() {
        C15854 c15854 = this.f50892;
        if (!c15854.m37542()) {
            return 1;
        }
        if (this.f50893.m24367()) {
            Iterator it = this.f50888.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((InterfaceC17889) it.next()).isChecked()) {
                    i++;
                }
            }
            return i;
        }
        return Math.max(1, c15854.m37539());
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m39025() {
        if (m39043() != 1) {
            throw new IllegalStateException("Selected item size != 1");
        }
        return (InterfaceC17889) m39062().get(0);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List m39062() {
        C15854 c15854 = this.f50892;
        if (c15854.m37542() && c15854.m37539() > 0) {
            ArrayList arrayList = new ArrayList(c15854.m37539());
            for (InterfaceC17889 interfaceC17889 : this.f50888) {
                if (interfaceC17889.isChecked()) {
                    arrayList.add(interfaceC17889);
                }
            }
            return C20195.unmodifiableList(arrayList);
        }
        return Collections.singletonList((InterfaceC17889) this.f50888.get(this.f50907));
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m39017() {
        return (InterfaceC17889) this.f50888.get(this.f50907);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38995(int i, String str, String str2, ArrayList arrayList) {
        this.f50891.m29919(i, str, str2, arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39001(Collection collection, boolean z) {
        C15854 c15854;
        List m39014 = m39014();
        int i = 0;
        int i2 = -1;
        while (true) {
            int size = m39014.size();
            c15854 = this.f50892;
            if (i >= size) {
                break;
            }
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) m39014.get(i);
            if (!interfaceC17889.mo36981()) {
                if (!c15854.m37542()) {
                    c15854.m37534();
                }
                boolean contains = collection.contains(interfaceC17889.getPath());
                c15854.m37530(interfaceC17889, contains);
                if (contains && z && i2 == -1) {
                    i2 = i;
                }
            }
            i++;
        }
        if (c15854.m37542() && !c15854.m37541()) {
            c15854.m37525();
        }
        C12327 c12327 = this.f50891;
        c12327.m29927();
        if (i2 != -1) {
            c12327.m29924(i2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39000(Collection collection) {
        m38977(collection, false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39053(String str) {
        m38977((Collection) Collections.singleton(str), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38999(ArrayList arrayList) {
        m38977((Collection) arrayList, true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m38977(Collection collection, boolean z) {
        HashSet hashSet = this.f50910;
        hashSet.clear();
        hashSet.addAll(collection);
        this.f50894 = z;
        this.f50901 = !hashSet.isEmpty();
        this.f50885 = false;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m39037() {
        return this.f50885;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m39065() {
        this.f50885 = true;
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m39036() {
        if (m39040()) {
            return;
        }
        AbstractC16891 abstractC16891 = this.f50900;
        String m39741 = abstractC16891.m39741();
        int m27826 = abstractC16891.f51868.m27826();
        if (abstractC16891.mo6011()) {
            C12658 c12658 = new C12658(this, abstractC16891, m39741, m27826);
            c12658.m20265(f50877);
            c12658.m20274();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39051(String str) {
        if (m39040()) {
            return;
        }
        AbstractC16891 abstractC16891 = this.f50900;
        if (abstractC16891.mo15170(str)) {
            C10542 c10542 = new C10542(this, abstractC16891);
            c10542.m20265(f50877);
            c10542.m20274();
        }
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final void m39049() {
        if (m39040()) {
            return;
        }
        m38971(false, (Runnable) null, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38972(List list, List list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((InterfaceC17889) list.get(i)).equals(list2.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m39064() {
        return this.f50898;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17972 m39019() {
        C17972 c17972 = new C17972();
        c17972.f56052 = this.f50900;
        c17972.f56055 = this.f50902;
        c17972.f56058 = this.f50888;
        C9506 c9506 = this.f50893;
        c17972.f56056 = c9506.m24367();
        c17972.f56054 = c9506.m24366();
        c17972.f56053 = this.f50891.m29916();
        c17972.f56057 = this.f50903;
        c17972.f56060 = this.f50899;
        c17972.f56051 = this.f50911;
        c17972.f56059 = this.f50889;
        c17972.f56050 = this.f50887;
        return c17972;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39008(C17972 c17972) {
        if (m39040()) {
            return;
        }
        this.f50895.incrementAndGet();
        this.f50900 = c17972.f56052;
        this.f50902 = c17972.f56055;
        this.f50888 = c17972.f56058;
        this.f50903 = c17972.f56057;
        this.f50899 = c17972.f56060;
        this.f50911 = c17972.f56051;
        this.f50889 = c17972.f56059;
        this.f50887 = c17972.f56050;
        C15854 c15854 = this.f50892;
        c15854.m37533();
        if (this.f50899 && c15854.m37542()) {
            c15854.m37525();
        }
        boolean z = c17972.f56056;
        this.f50893.m24363(c17972.f56054, z);
        this.f50901 = false;
        this.f50910.clear();
        this.f50894 = false;
        C12327 c12327 = this.f50891;
        c12327.m29923();
        c12327.m29924(c17972.f56053);
        m39057();
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C10917 m39027() {
        return m38992(false, (Runnable) null);
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C10917 m39045() {
        return m38992(true, (Runnable) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10917 m38992(boolean z, Runnable runnable) {
        boolean z2;
        C10917 c10917;
        synchronized (this.f50883) {
            if (m39040()) {
                z2 = false;
            } else {
                if (!this.f50883.isEmpty()) {
                    throw new IllegalStateException();
                }
                z2 = true;
            }
            c10917 = new C10917(this, runnable);
            this.f50883.add(c10917);
        }
        if (z2) {
            final C7719 c7719 = this.f50890;
            C16560 c16560 = c7719.f23860;
            C16989 c16989 = c7719.f23859;
            if (c16989 != null) {
                c16989.cancel();
                c7719.f23859 = null;
            }
            ViewGroup m24054 = c16560.f50905.m24054(c16560.f50898);
            c7719.f23858 = m24054;
            m24054.setAlpha(0.0f);
            c7719.f23858.setVisibility(0);
            c7719.f23858.getChildAt(0).setVisibility(4);
            TextView textView = (TextView) c7719.f23858.getChildAt(2);
            c7719.f23856 = textView;
            textView.setVisibility(4);
            c7719.f23856.setTag(-1);
            final View childAt = c7719.f23858.getChildAt(1);
            childAt.setVisibility(4);
            childAt.setAlpha(0.0f);
            C16989 m39820 = C16989.m39820(c7719.f23858, 0.0f, 0.1f);
            m39820.m39821(200L);
            c7719.f23854 = m39820;
            m39820.m28077();
            C16989 m398202 = C16989.m39820(c7719.f23858, 0.1f, 1.0f);
            m398202.m39821(2500L);
            c7719.f23855 = m398202;
            m398202.m51444(new C11953(c7719));
            c7719.f23855.m28079(500L);
            c7719.f23855.m28070(new AccelerateInterpolator());
            c7719.f23855.m28077();
            if (z) {
                C16989 m398203 = C16989.m39820(c7719.f23858.getChildAt(1), 0.0f, 1.0f);
                c7719.f23857 = m398203;
                m398203.m51444(new C23241(c7719, childAt));
                c7719.f23857.m28079(c.a);
                c7719.f23857.m28077();
                final C8817 m22788 = C8817.m22788();
                childAt.setOnClickListener(new View.OnClickListener() { // from class: l.ۛ᩷ܳ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7719 c77192 = C7719.this;
                        c77192.getClass();
                        if (m22788.m22793()) {
                            return;
                        }
                        childAt.setOnClickListener(null);
                        c77192.f23860.m39050();
                    }
                });
            }
        }
        return c10917;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39050() {
        ArrayList arrayList;
        synchronized (this.f50883) {
            arrayList = new ArrayList(this.f50883);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10917.m27222((C10917) it.next());
        }
    }

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    private void m38958() {
        C9506 c9506 = this.f50893;
        boolean m24367 = c9506.m24367();
        C9340 c9340 = this.f50905;
        if (m24367) {
            c9506.m24361();
            c9340.m24067();
        }
        if (this.f50899) {
            this.f50899 = false;
            this.f50903 = null;
            this.f50889 = null;
            this.f50887 = null;
            c9340.m24064(this.f50898, false);
            if (this.f50908) {
                c9340.m24092();
            }
        }
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m39039() {
        return this.f50899;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38996(int i, Function function) {
        if (!this.f50899) {
            C15854 c15854 = this.f50892;
            if (c15854.m37542()) {
                this.f50889 = this.f50900.m39741();
                this.f50887 = new HashSet();
                for (InterfaceC17889 interfaceC17889 : m39014()) {
                    if (!interfaceC17889.mo36981() && interfaceC17889.isChecked()) {
                        this.f50887.add(interfaceC17889.getPath());
                    }
                }
            } else {
                this.f50889 = null;
                this.f50887 = null;
            }
            this.f50903 = (AbstractC1661) function;
            this.f50899 = true;
            if (i == -1) {
                this.f50911 = null;
            } else {
                this.f50911 = "➤ ".concat(C4925.m14327(i));
            }
            C12327.m29911(200);
            if (c15854.m37542()) {
                c15854.m37525();
            }
            this.f50891.m29923();
            this.f50905.m24078(this.f50898, true);
            m38976();
            return;
        }
        throw new IllegalStateException("Already in paste mode.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.function.Function, l.֫ۜܳ] */
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final void m39013() {
        C9340 c9340 = this.f50905;
        c9340.m24068();
        ?? r1 = this.f50903;
        if (r1 == 0 || ((Boolean) r1.apply(this)).booleanValue()) {
            this.f50899 = false;
            this.f50903 = null;
            this.f50889 = null;
            this.f50887 = null;
            C12327.m29911(200);
            this.f50891.m29923();
            c9340.m24064(this.f50898, true);
            m38976();
        }
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m39024() {
        this.f50899 = false;
        this.f50903 = null;
        C12327.m29911(200);
        HashSet hashSet = this.f50887;
        C12327 c12327 = this.f50891;
        if (hashSet != null && C11003.equals(this.f50889, this.f50900.m39741())) {
            m39001((Collection) hashSet, false);
            if (hashSet.isEmpty()) {
                C15854 c15854 = this.f50892;
                if (!c15854.m37542()) {
                    c15854.m37534();
                    c12327.m29927();
                }
            }
        }
        this.f50889 = null;
        this.f50887 = null;
        c12327.m29923();
        this.f50905.m24064(this.f50898, false);
        m38976();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39004(C10130 c10130) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean m37542 = this.f50892.m37542();
        boolean mo39505 = this.f50900.mo39505();
        for (InterfaceC17889 interfaceC17889 : C20195.unmodifiableList(this.f50902)) {
            if (m37542 && interfaceC17889.isChecked()) {
                arrayList.add(interfaceC17889.getName());
            }
            if (interfaceC17889.mo36983()) {
                arrayList2.add(mo39505 ? interfaceC17889.getPath() : interfaceC17889.getName());
            }
        }
        c10130.writeInt(this.f50891.m29916());
        c10130.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c10130.m25439((String) it.next());
        }
        c10130.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c10130.m25439((String) it2.next());
        }
        C9506 c9506 = this.f50893;
        c10130.m25425(c9506.m24367());
        if (c9506.m24367()) {
            c10130.m25439(c9506.m24366());
        }
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final void m39015() {
        AbstractC16891 abstractC16891 = this.f50900;
        if (abstractC16891 != null) {
            abstractC16891.f51877 = true;
            if (m39035("local") && this.f50909.m39035("local") && this.f50900.mo39507().equals(this.f50909.f50900.mo39507())) {
                this.f50909.f50900.f51877 = true;
            }
        }
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final void m39052() {
        this.f50891.m29928();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (l.C16999.m39887(r1) == false) goto L6;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC15440 m38993(java.lang.String r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "[:\\\\/*?<>\"|]"
            java.lang.String r1 = "_"
            java.lang.String r5 = r5.replaceAll(r0, r1)
            java.lang.String r0 = "\\s"
            java.lang.String r1 = " "
            java.lang.String r5 = r5.replaceAll(r0, r1)
            java.lang.String r0 = "local"
            boolean r1 = r4.m39035(r0)
            r2 = 0
            if (r1 == 0) goto L25
            l.ܽ᩷ܳ r1 = r4.f50900
            java.lang.String r1 = r1.m39741()
            boolean r3 = l.C16999.m39887(r1)
            if (r3 != 0) goto L26
        L25:
            r1 = r2
        L26:
            if (r6 != 0) goto L41
            if (r1 != 0) goto L41
            l.ܽۢܳ r6 = r4.f50909
            boolean r6 = r6.m39035(r0)
            if (r6 == 0) goto L41
            l.ܽۢܳ r6 = r4.f50909
            l.ܽ᩷ܳ r6 = r6.f50900
            java.lang.String r1 = r6.m39741()
            boolean r6 = l.C16999.m39887(r1)
            if (r6 != 0) goto L41
            r1 = r2
        L41:
            r6 = 0
            if (r1 != 0) goto L65
            java.lang.String r0 = "zip"
            boolean r0 = r4.m39035(r0)
            if (r0 == 0) goto L65
            l.ܽ᩷ܳ r0 = r4.f50900
            l.ۧۗ᩻ r0 = (l.C10738) r0
            java.lang.String r0 = r0.m26937()
            java.lang.String[] r1 = new java.lang.String[r6]
            l.ܶ᩵ܿ r0 = l.C16999.m39866(r0, r1)
            java.lang.String r1 = r0.m36511()
            boolean r0 = l.C16999.m39887(r1)
            if (r0 != 0) goto L65
            r1 = r2
        L65:
            if (r1 != 0) goto L8a
            java.lang.String r0 = "archive"
            boolean r0 = r4.m39035(r0)
            if (r0 == 0) goto L8a
            l.ܽ᩷ܳ r0 = r4.f50900
            l.ۚۛܳ r0 = (l.C5168) r0
            java.lang.String r0 = r0.m14826()
            java.lang.String[] r1 = new java.lang.String[r6]
            l.ܶ᩵ܿ r0 = l.C16999.m39866(r0, r1)
            java.lang.String r0 = r0.m36511()
            boolean r1 = l.C16999.m39887(r0)
            if (r1 != 0) goto L88
            goto L8b
        L88:
            r2 = r0
            goto L8b
        L8a:
            r2 = r1
        L8b:
            if (r2 != 0) goto L92
            l.ܶ᩵ܿ r6 = l.C16293.m38327()
            goto L98
        L92:
            java.lang.String[] r6 = new java.lang.String[r6]
            l.ܶ᩵ܿ r6 = l.C16999.m39866(r2, r6)
        L98:
            l.ܶ᩵ܿ r5 = r6.m36526(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16560.m38993(java.lang.String, boolean):l.ܶ᩵ܿ");
    }

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final void m39042() {
        C9340 c9340 = this.f50905;
        if (c9340.m24089() != this.f50898) {
            c9340.m24081();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m39022() {
        MessageDigest m34532 = C14460.m34532();
        AbstractC16891 abstractC16891 = this.f50900;
        List<InterfaceC17889> m39014 = m39014();
        boolean m37542 = this.f50892.m37542();
        C14460.m34528(m34532, abstractC16891.mo6007() + "|" + abstractC16891.m39741() + "|" + m37542 + "|" + m39014.size());
        m34532.update((byte) -1);
        for (InterfaceC17889 interfaceC17889 : m39014) {
            C14460.m34528(m34532, interfaceC17889.getName());
            m34532.update((byte) -1);
            C14460.m34528(m34532, String.valueOf(interfaceC17889.isDirectory()));
            m34532.update((byte) -1);
            C14460.m34528(m34532, String.valueOf(interfaceC17889.mo36978()));
            m34532.update((byte) -1);
            C14460.m34528(m34532, String.valueOf(interfaceC17889.mo25860()));
            m34532.update((byte) -1);
            C14460.m34528(m34532, String.valueOf(m37542 && interfaceC17889.isChecked()));
            m34532.update((byte) -1);
        }
        return C14460.m34531(m34532.digest());
    }
}
