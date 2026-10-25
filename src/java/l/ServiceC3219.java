package l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.VirtualDisplay;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;

/* compiled from: PAKQ */
/* renamed from: l.ۗۨܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class ServiceC3219 extends Service implements ImageReader.OnImageAvailableListener {

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static boolean f10120;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10121 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C8091 f10124;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8091 f10125;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C8864 f10127;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f10128;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Intent f10129;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10130;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public MediaProjection f10132;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C6747 f10133;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public VirtualDisplay f10135;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ImageReader f10137;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f10139;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f10140;

    /* renamed from: ۙ۬᩹, reason: not valid java name and contains not printable characters */
    private static final short[] f10119 = {1992, -24829, -24826, -24813, -24826};

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final Handler f10122 = new Handler(Looper.getMainLooper());

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public Point f10134 = new Point();

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Point f10136 = new Point();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Rect f10131 = new Rect();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BroadcastReceiver f10138 = new C15212(this);

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int[] f10126 = new int[2];

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public Rect f10123 = new Rect();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9877(AbstractActivityC3346 abstractActivityC3346) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f2);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0583);
        C2978 c29782 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0582);
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) m10216.findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0556);
        spinner.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, abstractActivityC3346.getResources().getStringArray(R.array.MT_Protector_res_0x7f03001d)));
        spinner2.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, abstractActivityC3346.getResources().getStringArray(R.array.MT_Protector_res_0x7f03001d)));
        spinner3.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, abstractActivityC3346.getResources().getStringArray(R.array.MT_Protector_res_0x7f030011)));
        c2978.setChecked(C13096.m31741());
        c29782.setChecked(C13096.m31754());
        spinner.setSelection(C13096.m31751());
        spinner2.setSelection(C13096.m31744());
        spinner3.setSelection(C13096.m31748());
        c2978.setOnCheckedChangeListener(new C22552(1));
        c29782.setOnCheckedChangeListener(new C5336());
        spinner.setOnItemSelectedListener(new C21564(new C15918()));
        spinner2.setOnItemSelectedListener(new C21564(new C2514()));
        spinner3.setOnItemSelectedListener(new C21564(new C3925()));
        DialogInterfaceC0206[] dialogInterfaceC0206Arr = new DialogInterfaceC0206[1];
        m10216.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8158(new C1102(dialogInterfaceC0206Arr)));
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1208ea);
        buildDialog.m44421(m10216);
        DialogInterfaceC0206 m19253 = C7187.m19253(buildDialog, f10120 ? R.string.MT_Protector_res_0x7f1209e1 : R.string.MT_Protector_res_0x7f1209d2, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f120189, (DialogInterface.OnClickListener) null);
        dialogInterfaceC0206Arr[0] = m19253;
        if (abstractActivityC3346 instanceof ActivityC1355) {
            m19253.m1436(new DialogInterfaceOnDismissListenerC18742(abstractActivityC3346, 0));
        }
        m19253.m1447().setOnClickListener(new ViewOnClickListenerC8558(2, abstractActivityC3346));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9868(AbstractActivityC3346 abstractActivityC3346) {
        if (f10120) {
            C4925.m14335().stopService(new Intent(C4925.m14335(), (Class<?>) ServiceC3219.class));
            return;
        }
        if (!C9255.m23764(abstractActivityC3346)) {
            try {
                C21769.m49100(abstractActivityC3346, null);
                return;
            } catch (Throwable th) {
                abstractActivityC3346.m10223(th, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        if (abstractActivityC3346 instanceof Main) {
            ((Main) abstractActivityC3346).m136();
        } else {
            if (abstractActivityC3346 instanceof ActivityC1355) {
                ((ActivityC1355) abstractActivityC3346).m4717();
                return;
            }
            throw new RuntimeException();
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f10128 = getResources().getConfiguration().orientation;
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_COLOR_PICKER", getString(R.string.MT_Protector_res_0x7f1201a3), 3));
        }
        Intent intent = new Intent(this, (Class<?>) Main.class);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 67108864);
        C21093 c21093 = new C21093(this, "MT_COLOR_PICKER");
        c21093.m48000();
        c21093.m47996(C4925.m14327(R.string.MT_Protector_res_0x7f1208ea));
        c21093.m47993(activity);
        c21093.m48001();
        c21093.m47998(false);
        startForeground(1001, c21093.m47991());
        this.f10125 = (C8091) LayoutInflater.from(this).inflate(R.layout.MT_Protector_res_0x7f0d01d1, (ViewGroup) null);
        this.f10124 = (C8091) LayoutInflater.from(this).inflate(R.layout.MT_Protector_res_0x7f0d01d2, (ViewGroup) null);
        this.f10133 = (C6747) this.f10125.getChildAt(0);
        C8864 c8864 = (C8864) this.f10124.getChildAt(0);
        this.f10127 = c8864;
        c8864.m22903((TextView) this.f10124.findViewById(R.id.MT_Protector_res_0x7f0a0397));
        this.f10125.m21474();
        int[] iArr = new int[2];
        this.f10125.m21470(new C20153(this, iArr));
        this.f10125.m21468(new C11374(this, iArr));
        int m31747 = C13096.m31747();
        for (int i = 0; i < 2; i++) {
            View childAt = this.f10124.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.height = m31747;
            layoutParams.width = m31747;
            childAt.setLayoutParams(layoutParams);
        }
        this.f10124.setOnClickListener(new ViewOnClickListenerC19142(2, this));
        this.f10124.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩵ۨܿ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean m22904;
                m22904 = r1.f10127.m22904(r1.f10124.m21472(), ServiceC3219.this.f10124.m21473());
                return m22904;
            }
        });
        this.f10124.m21474();
        Point point = new Point();
        this.f10124.m21470(new C4630(this, point));
        this.f10124.m21468(new C5030(this, point));
        f10120 = true;
        C4925.m14312(new Intent("ScreenColorPicker.ACTION_START"));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ScreenColorPickerConfig.ACTION_CONFIG_CHANGED");
        C4925.m14311(this.f10138, intentFilter);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Parcelable parcelable = null;
        short s = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        short[] sArr = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1167306312;
        int i9 = C1420.f5096;
        int i10 = C0630.f2410;
        int m6981 = C2105.m6981("ܽ۠") ^ i9;
        int i11 = ((m6981 ^ i10) * 2909) ^ (-582266195);
        int i12 = 1962009068;
        while (true) {
            i8 = ((((i8 ^ i10) * (-29801)) >> 31) & i11) ^ (m6981 ^ i12);
            switch (i8) {
                case -2129442152:
                case 366995009:
                    i3 = s * 5358;
                    i4 = s * s;
                    if (C3245.m9925() != 0) {
                        m6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((m6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        m6981 = C2105.m6981("ۛ᩸") ^ i10;
                        i11 = ((m6981 ^ i9) * (-27201)) ^ 375190728;
                        i12 = 1795822757;
                    }
                case -1903049273:
                case 834278686:
                    if ((7177041 + i4) - i3 >= 0) {
                        m6981 = C2105.m6981("᩵ۙ") ^ i9;
                        i11 = ((m6981 ^ i10) * 26227) ^ (-682934625);
                        i12 = 841069024;
                    } else {
                        m6981 = C2105.m6981("ܳۖ") ^ i10;
                        i11 = ((m6981 ^ i9) * 4689) ^ 753848335;
                        i12 = 552908613;
                    }
                case -1899341550:
                case 1539054372:
                    s = f10119[0];
                    if (C4616.f14690 <= 0) {
                        m6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((m6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        m6981 = C2105.m6981("ۧܽ") ^ i9;
                        i11 = ((m6981 ^ i10) * (-5691)) ^ 73280685;
                        i12 = 1444274403;
                    }
                case -1837631425:
                case 476038145:
                    C2126.m7040();
                    m6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                    i11 = ((m6981 ^ i9) * 17467) ^ (-492427089);
                    i12 = -2031915303;
                case -1819617437:
                case 1838450855:
                    if (C2272.f7362) {
                        m6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((m6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        m6981 = C2105.m6981("ۡ᩵") ^ i10;
                        i11 = ((m6981 ^ i9) * 12339) ^ (-1844814338);
                        i12 = -825667487;
                    }
                case -1803988845:
                case 451926079:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((m6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        m6981 = (i9 - C2105.m6981("᩸ۖ")) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i11 = ((m6981 ^ i10) * 8525) ^ 486044006;
                        i12 = -1331581710;
                    }
                case -1776360948:
                case 1471151393:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((m6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        m6981 = C2105.m6981("ᩳᩴ") ^ i10;
                        i11 = ((m6981 ^ i9) * (-26173)) ^ 2033462941;
                        i12 = -918981052;
                    }
                case -1614235919:
                case -441029969:
                    sArr = f10119;
                    i6 = 1;
                    i7 = 4;
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C0630.m2566("۫᩵") ^ i10;
                        i11 = ((m6981 ^ i9) * (-32597)) ^ (-2075090245);
                        i12 = 823560516;
                    } else {
                        m6981 = C0630.m2566("ۘ۠") ^ i9;
                        i11 = ((m6981 ^ i10) * (-9709)) ^ (-85224372);
                        i12 = -2126807073;
                    }
                case -1329841224:
                case -631967708:
                    C5695.m16023();
                    C1294.m4372();
                    return 0;
                case -801216137:
                case -521920402:
                    C0964.m3413();
                    if (C3683.f11629 >= 0) {
                        m6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((m6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    } else {
                        m6981 = C0630.m2566("۫᩵") ^ i10;
                        i11 = ((m6981 ^ i9) * (-32597)) ^ (-2075090245);
                        i12 = 823560516;
                    }
                case -469432274:
                case 2051325440:
                    i5 = 29677;
                    m6981 = (C2105.m6981("֡֫") + i10) * (-29);
                    i11 = ((m6981 ^ i9) * 13279) ^ 283833314;
                    i12 = 640207521;
                case -446017231:
                case 561848199:
                    this.f10129 = (Intent) parcelable;
                    m9883();
                    return 2;
                case 185732813:
                case 1911050608:
                    i5 = 40807;
                    m6981 = (C2105.m6981("֡֫") + i10) * (-29);
                    i11 = ((m6981 ^ i9) * 13279) ^ 283833314;
                    i12 = 640207521;
                case 212838297:
                case 889707460:
                    AbstractC2021.m6574();
                    if (C2167.f7158 < 0) {
                        m6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((m6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    } else {
                        m6981 = C0630.m2566("ۜᩳ") ^ i9;
                        i11 = ((m6981 ^ i10) * (-6185)) ^ (-393189043);
                        i12 = 1603661954;
                    }
                case 346795337:
                case 481481445:
                    if (C7106.f21815 != 0) {
                        m6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((m6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        m6981 = (i10 - C0630.m2566("ۚۙ")) * 91;
                        i11 = ((m6981 ^ i9) * (-23699)) ^ 2036008198;
                        i12 = 582586712;
                    }
                case 506367781:
                case 1299322134:
                    if (RunnableC3474.m10630()) {
                        m6981 = C0630.m2566("۬᩸") ^ i9;
                        i11 = ((m6981 ^ i10) * 29403) ^ (-1181401145);
                        i12 = -707475308;
                    } else {
                        m6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((m6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    }
                case 926670139:
                case 1657182523:
                    if (C4117.m12364() != 0) {
                        m6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((m6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    } else {
                        m6981 = (C0630.m2566("ۙܺ") ^ i9) * 47;
                        i11 = ((m6981 ^ i10) * (-22687)) ^ 1457810897;
                        i12 = 1856295230;
                    }
                case 1293100347:
                case 1806079720:
                    C1916.m6308();
                    if (C1916.f6442) {
                        m6981 = (C0630.m2566("ܺ᩶") ^ i10) * (-111);
                        i11 = ((m6981 ^ i9) * (-14191)) ^ 1577865331;
                        i12 = -1734275042;
                    } else {
                        m6981 = (i10 - C2105.m6981("ۖܿ")) * 97;
                        i11 = ((m6981 ^ i9) * 17467) ^ (-492427089);
                        i12 = -2031915303;
                    }
                default:
                    parcelable = intent.getParcelableExtra(C1005.m3502(sArr, i6, i7, i5));
                    if (C2272.f7362) {
                        m6981 = C0630.m2566("۫᩺") ^ i9;
                        i11 = ((m6981 ^ i10) * 16085) ^ (-562674216);
                        i12 = -1557263595;
                    } else {
                        m6981 = C0630.m2566("᩺ۙ") ^ i9;
                        i11 = ((m6981 ^ i10) * 19541) ^ (-1582580185);
                        i12 = -1499221702;
                    }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m9883() {
        Runnable[] runnableArr = {null};
        runnableArr[0] = new RunnableC21604(2, this);
        if (this.f10125.isAttachedToWindow()) {
            m9878();
            C4925.m14316(runnableArr[0], 15L);
        } else {
            runnableArr[0].run();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m9890(ServiceC3219 serviceC3219) {
        int dimension;
        Display defaultDisplay = ((WindowManager) serviceC3219.getApplicationContext().getSystemService("window")).getDefaultDisplay();
        defaultDisplay.getSize(serviceC3219.f10136);
        Point point = serviceC3219.f10134;
        defaultDisplay.getRealSize(point);
        C6747 c6747 = serviceC3219.f10133;
        if (c6747 == null || (dimension = c6747.getWidth()) <= 0) {
            dimension = (int) serviceC3219.getResources().getDimension(R.dimen.MT_Protector_res_0x7f07035c);
        }
        int i = dimension / 2;
        serviceC3219.f10125.m21467((point.x / 2) - i, (point.y / 2) - i);
        serviceC3219.f10125.m21469(new C0396(serviceC3219));
        serviceC3219.f10125.m21466();
        serviceC3219.m9881();
        C4925.m14309(500L, new RunnableC22511(1, serviceC3219));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9866(ServiceC3219 serviceC3219, Point point, float f, float f2) {
        float m31752 = C13096.m31752();
        serviceC3219.m9863(point.x + ((int) (f / m31752)), point.y + ((int) (f2 / m31752)));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m9881() {
        int i = getResources().getDisplayMetrics().densityDpi;
        this.f10132 = ((MediaProjectionManager) getApplicationContext().getSystemService("media_projection")).getMediaProjection(-1, this.f10129);
        Point point = this.f10134;
        ImageReader newInstance = ImageReader.newInstance(point.x, point.y, 1, 1);
        this.f10137 = newInstance;
        this.f10135 = this.f10132.createVirtualDisplay("MT_COLOR_PICKER", point.x, point.y, i, 16, newInstance.getSurface(), null, null);
        this.f10139 = false;
        this.f10137.setOnImageAvailableListener(this, f10122);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9875() {
        VirtualDisplay virtualDisplay = this.f10135;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.f10135 = null;
        }
        ImageReader imageReader = this.f10137;
        if (imageReader != null) {
            imageReader.close();
            this.f10137 = null;
        }
        MediaProjection mediaProjection = this.f10132;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.f10132 = null;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m9878() {
        m9875();
        C8091 c8091 = this.f10125;
        if (c8091 != null) {
            c8091.m21475();
        }
        C8091 c80912 = this.f10124;
        if (c80912 != null) {
            c80912.m21475();
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.f10128;
        int i2 = configuration.orientation;
        if (i != i2) {
            this.f10128 = i2;
            m9878();
            C4925.m14316(new RunnableC6438(2, this), 50L);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        m9878();
        f10120 = false;
        C4925.m14312(new Intent("ScreenColorPicker.ACTION_STOP"));
        int i = C13096.f39208;
        C4925.m14310(this.f10138);
        stopForeground(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m9863(int i, int i2) {
        int dimension;
        int m31747;
        int i3;
        Point point = this.f10134;
        int i4 = 0;
        if (i < 0) {
            i = 0;
        } else {
            int i5 = point.x;
            if (i >= i5) {
                i = i5 - 1;
            }
        }
        if (i2 < 0) {
            i2 = 0;
        } else {
            int i6 = point.y;
            if (i2 >= i6) {
                i2 = i6 - 1;
            }
        }
        Rect rect = this.f10131;
        int i7 = -rect.left;
        int i8 = -rect.top;
        C6747 c6747 = this.f10133;
        if (c6747 == null || (dimension = c6747.getWidth()) <= 0) {
            dimension = (int) getResources().getDimension(R.dimen.MT_Protector_res_0x7f07035c);
        }
        C8864 c8864 = this.f10127;
        if (c8864 == null || (m31747 = c8864.getWidth()) <= 0) {
            m31747 = C13096.m31747();
        }
        this.f10130 = i;
        this.f10140 = i2;
        int i9 = dimension / 2;
        int i10 = i - i9;
        int i11 = i2 - i9;
        int i12 = rect.left;
        if (i10 <= i12) {
            i3 = i10 - i12;
        } else {
            int i13 = i10 + dimension;
            int i14 = rect.right;
            i3 = i13 >= i14 ? i13 - i14 : 0;
        }
        int i15 = rect.top;
        if (i11 <= i15) {
            i4 = i11 - i15;
        } else {
            int i16 = dimension + i11;
            int i17 = rect.bottom;
            if (i16 >= i17) {
                i4 = i16 - i17;
            }
        }
        this.f10133.m18366(i3, i4);
        this.f10125.m21467(i10 + i7, i11 + i8);
        if (point.x < point.y) {
            int i18 = (i - (m31747 / 2)) + i7;
            float f = i2;
            float f2 = m31747;
            int i19 = ((int) (f - (1.5f * f2))) + i8;
            if (i19 <= 0) {
                i19 = ((int) ((f2 * 0.5f) + f)) + i8;
            }
            this.f10124.m21467(i18, i19);
            return;
        }
        int i20 = (i2 - (m31747 / 2)) + i8;
        float f3 = i;
        float f4 = m31747;
        int i21 = ((int) (f3 - (1.5f * f4))) + i7;
        if (i21 <= 0) {
            i21 = ((int) ((f4 * 0.5f) + f3)) + i7;
        }
        this.f10124.m21467(i21, i20);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m9888(ServiceC3219 serviceC3219) {
        Rect rect = serviceC3219.f10131;
        int i = -rect.left;
        int i2 = -rect.top;
        int m31747 = C13096.m31747();
        Point point = serviceC3219.f10134;
        if (point.x < point.y) {
            int i3 = (serviceC3219.f10130 - (m31747 / 2)) + i;
            float f = serviceC3219.f10140;
            float f2 = m31747;
            int i4 = ((int) (f - (1.5f * f2))) + i2;
            if (i4 <= 0) {
                i4 = ((int) ((f2 * 0.5f) + f)) + i2;
            }
            serviceC3219.f10124.m21467(i3, i4);
            return;
        }
        int i5 = (serviceC3219.f10140 - (m31747 / 2)) + i2;
        float f3 = serviceC3219.f10130;
        float f4 = m31747;
        int i6 = ((int) (f3 - (1.5f * f4))) + i;
        if (i6 <= 0) {
            i6 = ((int) ((f4 * 0.5f) + f3)) + i;
        }
        serviceC3219.f10124.m21467(i6, i5);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        Rect rect;
        int i;
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage == null) {
            return;
        }
        if (!this.f10139) {
            this.f10139 = true;
        }
        this.f10125.getLocationOnScreen(this.f10126);
        int i2 = this.f10130;
        int i3 = this.f10140;
        int i4 = 0;
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= acquireNextImage.getWidth()) {
            i2 = acquireNextImage.getWidth() - 1;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 >= acquireNextImage.getHeight()) {
            i3 = acquireNextImage.getHeight() - 1;
        }
        int m18364 = this.f10133.m18364();
        Rect rect2 = this.f10123;
        rect2.set(i2 - m18364, i3 - m18364, i2 + m18364 + 1, m18364 + i3 + 1);
        C8864 c8864 = this.f10127;
        int width = acquireNextImage.getWidth();
        int height = acquireNextImage.getHeight();
        int width2 = rect2.width();
        int height2 = rect2.height();
        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
        Image.Plane plane = acquireNextImage.getPlanes()[0];
        ByteBuffer buffer = plane.getBuffer();
        int rowStride = plane.getRowStride();
        int pixelStride = plane.getPixelStride();
        int i5 = 0;
        while (i5 < height2) {
            while (i4 < width2) {
                int i6 = rect2.left + i4;
                int i7 = width2;
                int i8 = rect2.top + i5;
                if (i6 < 0 || i6 >= width || i8 < 0 || i8 >= height) {
                    rect = rect2;
                    i = width;
                    createBitmap.setPixel(i4, i5, 0);
                } else {
                    buffer.position((i6 * pixelStride) + (i8 * rowStride));
                    rect = rect2;
                    i = width;
                    createBitmap.setPixel(i4, i5, Color.argb(255, buffer.get() & 255, buffer.get() & 255, buffer.get() & 255));
                }
                i4++;
                width2 = i7;
                rect2 = rect;
                width = i;
            }
            i5++;
            i4 = 0;
        }
        c8864.m22902(createBitmap, i2, i3);
        acquireNextImage.close();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9876(ServiceC3219 serviceC3219) {
        if (!f10120 || serviceC3219.f10139) {
            return;
        }
        serviceC3219.m9875();
        serviceC3219.m9881();
        C4925.m14309(500L, new RunnableC16185(2, serviceC3219));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m9879(ServiceC3219 serviceC3219) {
        if (!f10120 || serviceC3219.f10139) {
            return;
        }
        C21374.m48464("Getting screen image timed out");
        serviceC3219.stopSelf();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m9884(ServiceC3219 serviceC3219) {
        if (!f10120 || serviceC3219.f10139) {
            return;
        }
        serviceC3219.m9875();
        serviceC3219.m9881();
        C4925.m14309(500L, new RunnableC19472(2, serviceC3219));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m9885() {
        return f10120;
    }
}
