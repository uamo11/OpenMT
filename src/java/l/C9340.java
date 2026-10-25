package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.m.m.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: J26J */
/* renamed from: l.ۢۘܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9340 {

    /* renamed from: ۚ᩷֨, reason: not valid java name and contains not printable characters */
    private static final short[] f28322 = {61, -4870, -4892, -4894, -4893, -4887, -4890, -4893, -4894, -4934, -4954, -4934, -4930, -4954, -4935, -4936, -4922, -4889, -4868, -4895, -4882, -4879, -4924, -4889, -4885, -4887, -4892, -4914, -4895, -4892, -4883, -4917, -4896, -4887, -4890, -4881, -4883, -4884, -4952, -4868, -4889, -4889, -4952, -4882, -4887, -4869, -4868, -4956, -4952, -4895, -4881, -4890, -4889, -4870, -4883, -4884, -4951};

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static String f28323;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static long f28324;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static long f28325;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28326;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C9687 f28327;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C18682 f28329;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C9503 f28334;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28335;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C13064 f28336;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C23592 f28337;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C16560 f28338;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C22181 f28339;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28341;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5561 f28342;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9503 f28343;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f28345;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16560 f28346;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C22181 f28349;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14771 f28350;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f28351;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C19712 f28352;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public FloatingActionButton f28354;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ViewGroup f28355;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f28356;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Main f28357;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ViewGroup f28358;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C9687 f28359;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28331 = new ArrayList();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f28332 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11971 f28328 = new C11971();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final RunnableC7182 f28330 = new Runnable() { // from class: l.۟ۖܳ
        @Override // java.lang.Runnable
        public final void run() {
            C9340.this.m24068();
        }
    };

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC1578 f28340 = new View.OnClickListener() { // from class: l.֫ۘܳ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C9340.m24032(C9340.this, view);
        }
    };

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C8817 f28348 = C8817.m22786(200);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f28347 = false;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f28360 = false;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8817 f28333 = C8817.m22786(50);

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f28353 = true;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f28344 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24032(C9340 c9340, View view) {
        C16560 c16560 = c9340.f28346;
        C16560 c165602 = c9340.f28338;
        int id = view.getId();
        if (id == R.id.MT_Protector_res_0x7f0a020d) {
            c9340.m24077(true);
            c165602.m39024();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a020f) {
            c9340.m24077(false);
            c16560.m39024();
        } else if (id == R.id.MT_Protector_res_0x7f0a0206) {
            c9340.m24077(true);
            c165602.m39013();
        } else if (id == R.id.MT_Protector_res_0x7f0a0208) {
            c9340.m24077(false);
            c16560.m39013();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.۟ۖܳ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.֫ۘܳ] */
    public C9340(Main main, Bundle bundle) {
        this.f28357 = main;
        this.f28339 = (C22181) main.m10241(R.id.MT_Protector_res_0x7f0a021d);
        this.f28349 = (C22181) main.m10241(R.id.MT_Protector_res_0x7f0a021e);
        this.f28352 = (C19712) main.m10241(R.id.MT_Protector_res_0x7f0a0096);
        this.f28334 = (C9503) main.m10241(R.id.MT_Protector_res_0x7f0a02e2);
        this.f28343 = (C9503) main.m10241(R.id.MT_Protector_res_0x7f0a02e3);
        C13064 c13064 = (C13064) main.m10241(R.id.MT_Protector_res_0x7f0a0172);
        this.f28336 = c13064;
        this.f28343.m24356(c13064);
        this.f28350 = (C14771) main.m10241(R.id.MT_Protector_res_0x7f0a0091);
        this.f28358 = (ViewGroup) main.m10241(R.id.MT_Protector_res_0x7f0a02fd);
        this.f28355 = (ViewGroup) main.m10241(R.id.MT_Protector_res_0x7f0a02fe);
        this.f28358.setOnClickListener(new ViewOnClickListenerC6289(2, this));
        int i = 0;
        this.f28355.setOnClickListener(new ViewOnClickListenerC17806(i, this));
        this.f28352.m45414(this.f28336);
        this.f28352.m45415(this.f28350);
        this.f28350.m35117(new C17100());
        C9687 c9687 = (C9687) main.m10241(R.id.MT_Protector_res_0x7f0a02a8);
        this.f28327 = c9687;
        c9687.m24634(true);
        c9687.m24633(new C21847(this));
        C9687 c96872 = (C9687) main.m10241(R.id.MT_Protector_res_0x7f0a02a9);
        this.f28359 = c96872;
        c96872.m24634(false);
        c96872.m24633(new C2949(i, this));
        this.f28345 = (TextView) main.m10241(R.id.MT_Protector_res_0x7f0a042b);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: l.۬ۖܳ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                C9340.m24031(C9340.this, i2, i3, i4, i5, i6, i7, i8, i9);
            }
        };
        this.f28327.addOnLayoutChangeListener(onLayoutChangeListener);
        this.f28359.addOnLayoutChangeListener(onLayoutChangeListener);
        final int m27878 = C11266.m27878(25.0f);
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: l.۫ۖܳ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C9340.m24036(C9340.this, m27878, view, motionEvent);
            }
        };
        this.f28334.m24355(onTouchListener);
        this.f28343.m24355(onTouchListener);
        this.f28342 = new C5561(this, main);
        this.f28352.m45413();
        this.f28352.m45411(R.drawable.MT_Protector_res_0x7f0802be, R.drawable.MT_Protector_res_0x7f0802c0);
        this.f28352.m45411(R.drawable.MT_Protector_res_0x7f0802bf, R.drawable.MT_Protector_res_0x7f0802c2);
        this.f28352.m45422(R.drawable.MT_Protector_res_0x7f0802bc, 45);
        C18682 c18682 = new C18682(this.f28352);
        this.f28329 = c18682;
        this.f28352.m45412(c18682).m38121();
        this.f28352.m45411(R.drawable.MT_Protector_res_0x7f0802bd, R.drawable.MT_Protector_res_0x7f0802c1);
        this.f28352.setOnClickListener(new ViewOnClickListenerC11416(0, this));
        this.f28352.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.᩺ۖܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C9340.m24030(C9340.this);
                return true;
            }
        });
        this.f28357.m124(new Runnable() { // from class: l.ۛۖܳ
            @Override // java.lang.Runnable
            public final void run() {
                C9340.m24037(C9340.this);
            }
        });
        main.getLifecycle().mo19833(new C10005(0, this));
        boolean z = this.f28332;
        if (bundle == null || !bundle.containsKey("WindowManagerData")) {
            boolean equals = C11003.equals(ApplicationC20075.f65010.getString("load_path_left", "0"), "0");
            boolean equals2 = C11003.equals(ApplicationC20075.f65010.getString("load_path_right", "0"), "0");
            String mo23554 = C16293.f50120.mo23554();
            String string = ApplicationC20075.f65008.getString("home_path_left", mo23554);
            String string2 = ApplicationC20075.f65008.getString("home_path_right", mo23554);
            String string3 = ApplicationC20075.f65008.getString("last_path_left", string);
            String string4 = ApplicationC20075.f65008.getString("last_path_right", string2);
            string = equals ? string : string3;
            String str = equals2 ? string2 : string4;
            this.f28338 = new C16560(this, this.f28334, new C16773(string), true, null);
            this.f28346 = new C16560(this, this.f28343, new C16773(str), false, null);
        } else {
            C12951 m31485 = C12951.m31485(bundle.getByteArray("WindowManagerData"));
            boolean m31498 = m31485.m31498();
            C16773.m39495(m31485);
            this.f28338 = new C16560(this, this.f28334, C13654.m32811(m31485), true, m31485);
            this.f28346 = new C16560(this, this.f28343, C13654.m32811(m31485), false, m31485);
            int m31494 = m31485.m31494();
            for (int i2 = 0; i2 < m31494; i2++) {
                this.f28328.add(C13654.m32811(m31485));
            }
            C12327.m29911(1000);
            z = m31498;
        }
        this.f28338.m39006(this.f28346);
        this.f28346.m39006(this.f28338);
        this.f28338.m39011(true);
        this.f28346.m39011(false);
        m24092();
        m24077(z);
        this.f28357.getLifecycle().mo19833(new InterfaceC17236() { // from class: l.ܽۘܳ
            @Override // l.InterfaceC17236
            /* renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                C9340.m24039(C9340.this, enumC22901);
            }
        });
        C7261.f22281.m1668(main, new InterfaceC1008() { // from class: l.ۧۘܳ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C9340.m24033(C9340.this, (EnumC13610) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24033(C9340 c9340, EnumC13610 enumC13610) {
        if (enumC13610.m32729()) {
            return;
        }
        C16560 c16560 = c9340.f28346;
        C16560 c165602 = c9340.f28338;
        C11971 c11971 = c9340.f28328;
        c11971.m29245();
        try {
            int size = c11971.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AbstractC16891 abstractC16891 = (AbstractC16891) c11971.get(size);
                if ((abstractC16891 instanceof C5259) && !(((AbstractC3163) abstractC16891.mo6020()).m9690() instanceof C1936)) {
                    c11971.m29245();
                    c9340.m24050(size);
                    c11971.m29244();
                }
            }
            if (c165602.m39035(b.k) && !(((AbstractC3163) c165602.m39044().mo6020()).m9690() instanceof C1936)) {
                c9340.m24059(c165602);
            }
            if (c16560.m39035(b.k) && !(((AbstractC3163) c16560.m39044().mo6020()).m9690() instanceof C1936)) {
                c9340.m24059(c16560);
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            c11971.m29244();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24039(C9340 c9340, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_PAUSE) {
            if (f28323 != null) {
                if (SystemClock.uptimeMillis() < f28324) {
                    c9340.f28356 = f28323;
                    f28325 = SystemClock.uptimeMillis() + 200;
                }
                f28323 = null;
                return;
            }
            return;
        }
        if (enumC22901 != EnumC22901.ON_RESUME || c9340.f28356 == null) {
            return;
        }
        if (SystemClock.uptimeMillis() > f28325) {
            c9340.m24070().f50891.m29925(c9340.f28356);
        }
        c9340.f28356 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24035(InterfaceC17889 interfaceC17889, int i) {
        f28323 = interfaceC17889.getPath();
        f28324 = SystemClock.uptimeMillis() + i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24074() {
        this.f28328.m29245();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24083() {
        this.f28328.m29244();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24038(C9340 c9340, View view) {
        if (c9340.f28338.m39040()) {
            return;
        }
        view.setVisibility(8);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24044(C9340 c9340, View view) {
        if (c9340.f28346.m39040()) {
            return;
        }
        view.setVisibility(8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24031(C9340 c9340, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        c9340.m24047(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24036(C9340 c9340, int i, View view, MotionEvent motionEvent) {
        if (!c9340.f28336.m31666(8388611)) {
            if (motionEvent.getAction() == 0) {
                c9340.m24047(true);
                if (view != c9340.f28334) {
                    c9340.f28327.m2220();
                    c9340.m24077(false);
                } else if (motionEvent.getX() >= i) {
                    c9340.f28359.m2220();
                    c9340.m24077(true);
                }
            }
            if (view == c9340.f28334) {
                return c9340.f28338.f50891.f36909.onTouch(view, motionEvent);
            }
            return c9340.f28346.f50891.f36909.onTouch(view, motionEvent);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24034(C9340 c9340, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_PAUSE) {
            c9340.m24047(false);
            AbstractC16891 m39044 = c9340.f28338.m39044();
            AbstractC16891 m390442 = c9340.f28346.m39044();
            C11971 c11971 = c9340.f28328;
            c11971.m29245();
            try {
                if (!(m39044 instanceof C16773)) {
                    Iterator<E> it = c11971.iterator();
                    while (it.hasNext()) {
                        AbstractC16891 abstractC16891 = (AbstractC16891) it.next();
                        if (abstractC16891 instanceof C16773) {
                            m39044 = abstractC16891;
                        }
                    }
                }
                if (!(m390442 instanceof C16773)) {
                    Iterator<E> it2 = c11971.iterator();
                    while (it2.hasNext()) {
                        AbstractC16891 abstractC168912 = (AbstractC16891) it2.next();
                        if (abstractC168912 != m39044 && (abstractC168912 instanceof C16773)) {
                            m390442 = abstractC168912;
                        }
                    }
                }
                c11971.m29244();
                ApplicationC20075.f65008.edit().putString("last_path_left", m39044.m39742()).putString("last_path_right", m390442.m39742()).apply();
            } catch (Throwable th) {
                c11971.m29244();
                throw th;
            }
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m24082() {
        return this.f28342.m15804();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24037(C9340 c9340) {
        c9340.m24047(false);
        c9340.f28334.setSelector(C19890.m45739());
        c9340.f28343.setSelector(C19890.m45739());
        c9340.f28338.f50891.m29927();
        c9340.f28346.f50891.m29927();
        c9340.f28352.m45417();
        c9340.f28327.m24632(C21943.f70274);
        c9340.f28359.m24632(C21943.f70274);
        c9340.m24049(true);
        c9340.m24049(false);
        float intBitsToFloat = Float.intBitsToFloat(C21238.m48210(c9340.f28357.getTheme(), R.attr.MT_Protector_res_0x7f04043b));
        c9340.f28339.setAlpha(intBitsToFloat);
        c9340.f28349.setAlpha(intBitsToFloat);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C21943.f70257, PorterDuff.Mode.SRC_IN);
        ((ProgressBar) c9340.f28358.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        ((ProgressBar) c9340.f28355.getChildAt(0)).getIndeterminateDrawable().setColorFilter(porterDuffColorFilter);
        Button button = (Button) c9340.f28358.getChildAt(1);
        Button button2 = new Button(c9340.f28357);
        button.setTextColor(button2.getTextColors());
        button.setBackground(button2.getBackground());
        ((TextView) c9340.f28358.getChildAt(2)).setTextColor(C21943.f70260);
        Button button3 = (Button) c9340.f28355.getChildAt(1);
        Button button4 = new Button(c9340.f28357);
        button3.setTextColor(button4.getTextColors());
        button3.setBackground(button4.getBackground());
        ((TextView) c9340.f28355.getChildAt(2)).setTextColor(C21943.f70260);
        c9340.f28342.m15806();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24061(C16560 c16560, AbstractC16891 abstractC16891) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            AbstractC16891 m39044 = c16560.m39044();
            if (m39044.mo35229()) {
                c11971.add(m39044);
                m39044.mo15167();
            } else {
                if (m39044.m39732() == 0) {
                    throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
                }
                m39044.m39744();
            }
            c16560.m39034(abstractC16891);
            c11971.m29244();
            C5935.m16666();
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24059(C16560 c16560) {
        AbstractC16891 abstractC16891;
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            if (c11971.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC16891 m39044 = c16560.m39044();
            if (m39044.m39732() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            int m39732 = m39044.m39732();
            m39044.m39744();
            if (m39732 != 0) {
                Iterator<E> it = c11971.iterator();
                while (it.hasNext()) {
                    abstractC16891 = (AbstractC16891) it.next();
                    if (abstractC16891.m39746() == m39732) {
                        it.remove();
                        break;
                    }
                }
            }
            abstractC16891 = null;
            if (abstractC16891 == null) {
                Iterator<E> it2 = c11971.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC16891 abstractC168912 = (AbstractC16891) it2.next();
                    if (abstractC168912 instanceof C16773) {
                        it2.remove();
                        abstractC16891 = abstractC168912;
                        break;
                    }
                }
            }
            if (abstractC16891 == null) {
                abstractC16891 = (AbstractC16891) c11971.remove(c11971.size() - 1);
            }
            c16560.m39034(abstractC16891);
            abstractC16891.mo6018(c16560);
            c11971.m29244();
            C5935.m16666();
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24076(C16560 c16560) {
        AbstractC16891 abstractC16891;
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            if (c11971.isEmpty()) {
                throw new IllegalStateException("No background visitor.");
            }
            AbstractC16891 m39044 = c16560.m39044();
            int m39732 = m39044.m39732();
            if (m39732 != 0) {
                Iterator<E> it = c11971.iterator();
                while (it.hasNext()) {
                    abstractC16891 = (AbstractC16891) it.next();
                    if (abstractC16891.m39746() == m39732) {
                        it.remove();
                        break;
                    }
                }
            }
            abstractC16891 = null;
            if (abstractC16891 == null) {
                Iterator<E> it2 = c11971.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC16891 abstractC168912 = (AbstractC16891) it2.next();
                    if (abstractC168912 instanceof C16773) {
                        it2.remove();
                        abstractC16891 = abstractC168912;
                        break;
                    }
                }
            }
            if (abstractC16891 == null) {
                abstractC16891 = (AbstractC16891) c11971.remove(c11971.size() - 1);
            }
            c11971.add(m39044);
            c16560.m39034(abstractC16891);
            m39044.mo15167();
            abstractC16891.mo6018(c16560);
            c11971.m29244();
            C5935.m16666();
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24060(C16560 c16560, int i, boolean z) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            if (m24040(c16560, i, z)) {
                C5935.m16666();
            }
        } finally {
            c11971.m29244();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m24085(int i) {
        C16560 m24070 = m24070();
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            boolean m24040 = m24040(m24070, m24045(i), true);
            if (m24040) {
                C5935.m16666();
            }
            return m24040;
        } finally {
            c11971.m29244();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24066(int i) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            return m24050(m24045(i));
        } finally {
            c11971.m29244();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m24079(int i) {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            int m24045 = m24045(i);
            boolean z = false;
            if (m24045 >= 0 && m24045 < c11971.size()) {
                if (((AbstractC16891) c11971.get(m24045)).m39732() != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            c11971.m29244();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m24045(int i) {
        C11971 c11971 = this.f28328;
        int size = c11971.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((AbstractC16891) c11971.get(i2)).m39746() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m24040(C16560 c16560, int i, boolean z) {
        if (i < 0) {
            return false;
        }
        C11971 c11971 = this.f28328;
        if (i >= c11971.size()) {
            return false;
        }
        AbstractC16891 m39044 = c16560.m39044();
        AbstractC16891 abstractC16891 = (AbstractC16891) c11971.remove(i);
        if (m39044.mo35229()) {
            c11971.add(m39044);
            m39044.mo15167();
        } else {
            if (m39044.m39732() == 0) {
                throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
            }
            m39044.m39744();
        }
        if (z) {
            c16560.m39034(abstractC16891);
        } else {
            c16560.m39047(abstractC16891);
        }
        abstractC16891.mo6018(c16560);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m24050(int i) {
        if (i < 0) {
            return false;
        }
        C11971 c11971 = this.f28328;
        if (i >= c11971.size()) {
            return false;
        }
        AbstractC16891 abstractC16891 = (AbstractC16891) c11971.remove(i);
        if (abstractC16891.m39732() == 0) {
            throw new RuntimeException("Can not close the FileVisitor which has no parent id.");
        }
        abstractC16891.m39744();
        return true;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m24071() {
        C16560 c16560 = this.f28338;
        if (c16560.m39040()) {
            return;
        }
        C16560 c165602 = this.f28346;
        if (c165602.m39040()) {
            return;
        }
        m24047(false);
        C17972 m39019 = c16560.m39019();
        c16560.m39008(c165602.m39019());
        c165602.m39008(m39019);
        if (!c16560.m39039()) {
            m24064(true, false);
        } else {
            m24078(true, false);
        }
        if (!c165602.m39039()) {
            m24064(false, false);
        } else {
            m24078(false, false);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m24043(C9340 c9340) {
        if (c9340.f28348.m22793()) {
            return;
        }
        C16560 m24070 = c9340.m24070();
        if (c9340.f28352.m45423()) {
            int m45427 = c9340.f28352.m45427();
            if (m45427 == 0) {
                m24070.m39031();
                return;
            }
            if (m45427 == 1) {
                m24070.m39060();
                return;
            }
            if (m45427 == 2) {
                if (m24070.m39044().mo15163()) {
                    new ViewOnClickListenerC8551(m24070).m22273();
                    return;
                } else {
                    if (m24070.m39039()) {
                        return;
                    }
                    m24070.f50892.m37534();
                    return;
                }
            }
            if (m45427 != 3) {
                if (m45427 != 4) {
                    return;
                }
                c9340.f28357.getOnBackPressedDispatcher().m28892();
                return;
            } else {
                if (m24070.m39044().mo6015()) {
                    m24070.m39044().mo6006(m24070, m24070.m39026());
                    return;
                }
                return;
            }
        }
        if (c9340.f28352.m45429()) {
            int m454272 = c9340.f28352.m45427();
            if (m454272 == 0) {
                int i = ApplicationC20075.f65008.getInt("swipe_select_count", 0);
                if (i < 3) {
                    ApplicationC20075.f65008.edit().mo25853(i + 1, "swipe_select_count").apply();
                }
                m24070.m39066();
                return;
            }
            if (m454272 == 1) {
                m24070.m39061();
                return;
            }
            if (m454272 == 2) {
                m24070.m39041();
            } else if (m454272 == 3) {
                m24070.m39029();
            } else {
                if (m454272 != 4) {
                    return;
                }
                c9340.f28357.m10217(R.string.MT_Protector_res_0x7f120912, R.string.MT_Protector_res_0x7f120915, false);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m24030(C9340 c9340) {
        int m45427 = c9340.f28352.m45427();
        if (!c9340.f28352.m45423()) {
            if (c9340.f28352.m45429()) {
                if (m45427 == 3) {
                    c9340.m24070().m39023();
                    return;
                } else {
                    c9340.f28352.m45425(m45427, new int[]{R.string.MT_Protector_res_0x7f120911, R.string.MT_Protector_res_0x7f120918, R.string.MT_Protector_res_0x7f12015e, R.string.MT_Protector_res_0x7f120919, R.string.MT_Protector_res_0x7f120912}[m45427]);
                    return;
                }
            }
            return;
        }
        if (m45427 == 0) {
            c9340.f28352.m45425(0, R.string.MT_Protector_res_0x7f120119);
            return;
        }
        if (m45427 == 1) {
            c9340.f28352.m45425(1, R.string.MT_Protector_res_0x7f120404);
            return;
        }
        if (m45427 == 2) {
            c9340.f28352.m45425(2, c9340.m24070().m39044().mo15163() ? R.string.MT_Protector_res_0x7f120203 : R.string.MT_Protector_res_0x7f120925);
            return;
        }
        if (m45427 == 3) {
            c9340.f28352.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            c9340.m24084(false);
        } else {
            if (m45427 != 4) {
                return;
            }
            new C0083(c9340.m24070()).m1043();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24065() {
        if (!this.f28350.m35125()) {
            C5561 c5561 = this.f28342;
            if (c5561 != null && c5561.m15805()) {
                return true;
            }
            this.f28350.m35122();
            return true;
        }
        return m24070().m39012();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m24086() {
        this.f28350.m35122();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m24092() {
        C16560 m24070 = m24070();
        if (m24070.f50892.m37542()) {
            this.f28352.m45419();
            return;
        }
        AbstractC9128 m45410 = this.f28352.m45410(0);
        m45410.getClass();
        ((C16182) m45410).m38120(m24070.m39048());
        AbstractC9128 m454102 = this.f28352.m45410(1);
        m454102.getClass();
        ((C16182) m454102).m38120(m24070.m39054());
        AbstractC9128 m454103 = this.f28352.m45410(2);
        m454103.getClass();
        ((C4189) m454103).m12635(!m24070.m39039() || m24070.m39044().mo15163());
        AbstractC9128 m454104 = this.f28352.m45410(3);
        m454104.getClass();
        ((C16182) m454104).m38120(m24070.m39044().mo6015());
        this.f28352.m45428();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24077(boolean z) {
        if (this.f28332 == z) {
            return;
        }
        m24047(false);
        this.f28332 = z;
        this.f28339.m49825(1.0f);
        this.f28349.m49825(1.0f);
        this.f28334.setAlpha(1.0f);
        this.f28343.setAlpha(1.0f);
        this.f28339.setVisibility(z ? 0 : 8);
        this.f28349.setVisibility(z ? 8 : 0);
        this.f28329.m43296(z);
        this.f28338.m39011(z);
        this.f28346.m39011(!z);
        m24092();
        m24093();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24063(boolean z, float f) {
        if (this.f28332 == z) {
            return;
        }
        if (f == 0.0f) {
            this.f28339.setVisibility(!z ? 0 : 8);
            this.f28349.setVisibility(z ? 0 : 8);
            this.f28339.m49825(1.0f);
            this.f28349.m49825(1.0f);
            this.f28334.setAlpha(1.0f);
            this.f28343.setAlpha(1.0f);
            return;
        }
        (z ? this.f28343 : this.f28334).setAlpha(1.0f - (0.5f * f));
        if (z) {
            this.f28339.m49825(f);
            this.f28349.m49825(1.0f - f);
        } else {
            this.f28339.m49825(1.0f - f);
            this.f28349.m49825(f);
        }
        if (this.f28339.getVisibility() != 0) {
            this.f28339.setVisibility(0);
        }
        if (this.f28349.getVisibility() != 0) {
            this.f28349.setVisibility(0);
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m24089() {
        return this.f28332;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24062(C23592 c23592) {
        this.f28337 = c23592;
        c23592.m52055(new C23450(this));
        m24093();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m24088() {
        C23592 c23592 = this.f28337;
        if (c23592 != null) {
            c23592.m52062();
        }
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m24093() {
        if (this.f28337 == null) {
            return;
        }
        C9506 c9506 = m24070().f50893;
        if (c9506.m24367()) {
            this.f28337.m52058(false);
            this.f28337.m52054(c9506.m24366());
        } else {
            this.f28337.m52062();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24084(boolean z) {
        if (this.f28337 == null) {
            return;
        }
        if (z) {
            C5009.m14500();
        }
        this.f28337.m52058(true);
        C9506 c9506 = m24070().f50893;
        if (c9506.m24367()) {
            return;
        }
        this.f28337.m52054((String) null);
        c9506.m24365(true);
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m24090() {
        this.f28338.f50891.m29927();
        this.f28346.f50891.m29927();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16560 m24070() {
        return this.f28332 ? this.f28338 : this.f28346;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m24081() {
        m24077(!this.f28332);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C16560 m24091() {
        return this.f28338;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16560 m24072() {
        return this.f28346;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24075(String str) {
        this.f28357.setTitle(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24056(CharSequence charSequence) {
        this.f28357.m10240().setSubtitle(charSequence);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24067() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f28357.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f28357.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Main m24073() {
        return this.f28357;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ViewGroup m24054(boolean z) {
        return z ? this.f28358 : this.f28355;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24057(Runnable runnable) {
        this.f28331.add(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (l.C11340.f33930 >= 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0109, code lost:
    
        if (l.C3019.f9544 < 0) goto L39;
     */
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m24053() {
        /*
            Method dump skipped, instructions count: 2934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9340.m24053():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24058(String str) {
        C16560 c16560 = this.f28346;
        C16560 c165602 = this.f28338;
        if (this.f28360) {
            return;
        }
        C11971 c11971 = this.f28328;
        if (c11971.m29243()) {
            C4925.m14315(new RunnableC22286(2, str));
            return;
        }
        this.f28360 = true;
        c11971.m29245();
        try {
            Iterator<E> it = c11971.iterator();
            boolean z = false;
            while (it.hasNext()) {
                AbstractC16891 abstractC16891 = (AbstractC16891) it.next();
                if (!abstractC16891.mo6016()) {
                    abstractC16891.m39744();
                    it.remove();
                    z = true;
                }
            }
            if (!c165602.m39044().mo6016()) {
                m24059(c165602);
                z = false;
            }
            if (!c16560.m39044().mo6016()) {
                m24059(c16560);
                z = false;
            }
            if (this.f28332) {
                c165602.m39051(str);
                c16560.m39051(str);
            } else {
                c16560.m39051(str);
                c165602.m39051(str);
            }
            Iterator<E> it2 = c11971.iterator();
            while (it2.hasNext()) {
                final AbstractC16891 abstractC168912 = (AbstractC16891) it2.next();
                if (abstractC168912.mo15170(str)) {
                    C1802.f6208.execute(new Runnable() { // from class: l.ܰۖܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                AbstractC16891.this.mo14824(false);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
            }
            if (z) {
                C5935.m16666();
            }
            c11971.m29244();
            this.f28360 = false;
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m24069() {
        boolean z = this.f28332;
        C16560 c16560 = this.f28346;
        C16560 c165602 = this.f28338;
        if (z) {
            c165602.m39044().mo6018(c165602);
            c16560.m39044().mo6018(c16560);
        } else {
            c16560.m39044().mo6018(c16560);
            c165602.m39044().mo6018(c165602);
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m24052() {
        this.f28351 = true;
        m24047(false);
        this.f28338.m39050();
        this.f28346.m39050();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11971 m24094() {
        return this.f28328;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m24080() {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        for (int i = 0; i < c11971.size(); i++) {
            try {
                if (((AbstractC16891) c11971.get(i)) instanceof C16773) {
                    return i;
                }
            } finally {
                c11971.m29244();
            }
        }
        c11971.m29244();
        throw new RuntimeException();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m24049(boolean z) {
        FloatingActionButton floatingActionButton = z ? this.f28326 : this.f28335;
        FloatingActionButton floatingActionButton2 = z ? this.f28354 : this.f28341;
        if (floatingActionButton == null) {
            return;
        }
        floatingActionButton.setBackgroundTintList(ColorStateList.valueOf(C21943.f70257));
        floatingActionButton2.setBackgroundTintList(ColorStateList.valueOf(C21943.f70288));
        floatingActionButton.setImageTintList(ColorStateList.valueOf(C21943.f70292));
        floatingActionButton2.setImageTintList(ColorStateList.valueOf(C21943.f70292));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24029(FloatingActionButton floatingActionButton) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) floatingActionButton.getLayoutParams();
        return (floatingActionButton.getHeight() != 0 ? floatingActionButton.getHeight() : floatingActionButton.getMeasuredHeight()) + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24064(boolean z, boolean z2) {
        m24047(true);
        if (z) {
            if (this.f28353) {
                return;
            } else {
                this.f28353 = true;
            }
        } else if (this.f28344) {
            return;
        } else {
            this.f28344 = true;
        }
        FloatingActionButton floatingActionButton = z ? this.f28326 : this.f28335;
        FloatingActionButton floatingActionButton2 = z ? this.f28354 : this.f28341;
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        if (z2) {
            duration.playTogether(ObjectAnimator.ofFloat(floatingActionButton, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(floatingActionButton2, "alpha", 1.0f, 0.0f));
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton, "translationY", 0.0f, m24029(floatingActionButton));
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton2, "translationY", 0.0f, m24029(floatingActionButton2));
            duration.setInterpolator(new AccelerateInterpolator());
            duration.playTogether(ofFloat, ofFloat2);
        }
        duration.addListener(new C20629(floatingActionButton, floatingActionButton2));
        duration.start();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m24068() {
        m24047(true);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m24047(boolean z) {
        this.f28345.removeCallbacks(this.f28330);
        this.f28345.animate().setListener(null).cancel();
        if (!z || this.f28345.getVisibility() != 0 || this.f28345.getAlpha() == 0.0f) {
            this.f28345.setVisibility(8);
            this.f28345.setAlpha(1.0f);
        } else {
            this.f28345.animate().alpha(0.0f).setDuration(200L).setInterpolator(new AccelerateInterpolator()).setListener(new C6517(this)).start();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m24041(boolean z) {
        AccessibilityManager accessibilityManager;
        C16560 c16560 = z ? this.f28338 : this.f28346;
        if (!this.f28351 && this.f28332 == z && c16560.m39039() && this.f28357.getLifecycle().mo19832().m33028(EnumC13728.RESUMED)) {
            int m27878 = C11266.m27878(12.0f);
            ViewGroup viewGroup = (ViewGroup) this.f28345.getParent();
            int width = ((viewGroup.getWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight()) - (m27878 * 2);
            int m45424 = this.f28352.m45424();
            if (!this.f28352.isShown() || width <= 0 || m45424 <= 0) {
                return;
            }
            this.f28345.setBackgroundResource(C21238.m48211(this.f28357.getTheme(), R.attr.MT_Protector_res_0x7f04051a));
            this.f28345.setTextColor(C21238.m48207(this.f28357.getTheme(), R.attr.MT_Protector_res_0x7f040519));
            this.f28345.setMaxWidth(width);
            this.f28345.setTextSize(2, 14.0f);
            this.f28345.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (this.f28345.getLineCount() > 1) {
                this.f28345.setTextSize(2, 13.0f);
            }
            TextView textView = this.f28345;
            textView.setMinHeight(C11266.m27878(24.0f) + textView.getLineHeight());
            this.f28345.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            C16900 c16900 = (C16900) this.f28345.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c16900).bottomMargin = Math.max(0, (m45424 - this.f28345.getMeasuredHeight()) / 2) + (this.f28352.getHeight() - m45424);
            this.f28345.setLayoutParams(c16900);
            this.f28345.animate().setListener(null).cancel();
            this.f28345.setAlpha(0.0f);
            this.f28345.setVisibility(0);
            this.f28345.animate().alpha(1.0f).setDuration(200L).setInterpolator(new DecelerateInterpolator()).start();
            int i = Build.VERSION.SDK_INT;
            int i2 = OpenAuthTask.SYS_ERR;
            if (i >= 29 && (accessibilityManager = (AccessibilityManager) this.f28357.getSystemService("accessibility")) != null) {
                i2 = accessibilityManager.getRecommendedTimeoutMillis(OpenAuthTask.SYS_ERR, 2);
            }
            this.f28345.postDelayed(this.f28330, i2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24078(boolean z, boolean z2) {
        if (z2) {
            m24047(false);
        }
        if (!z ? this.f28344 : this.f28353) {
            if (z2) {
                m24041(z);
                return;
            }
            return;
        }
        if ((z ? this.f28326 : this.f28335) == null) {
            int i = z ? R.id.MT_Protector_res_0x7f0a020e : R.id.MT_Protector_res_0x7f0a0210;
            Main main = this.f28357;
            FloatingActionButton floatingActionButton = (FloatingActionButton) ((ViewStub) main.m10241(i)).inflate();
            ViewOnClickListenerC1578 viewOnClickListenerC1578 = this.f28340;
            floatingActionButton.setOnClickListener(viewOnClickListenerC1578);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton.measure(makeMeasureSpec, makeMeasureSpec);
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) ((ViewStub) main.m10241(z ? R.id.MT_Protector_res_0x7f0a0207 : R.id.MT_Protector_res_0x7f0a0209)).inflate();
            floatingActionButton2.setOnClickListener(viewOnClickListenerC1578);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            floatingActionButton2.measure(makeMeasureSpec2, makeMeasureSpec2);
            if (z) {
                this.f28354 = floatingActionButton;
                this.f28326 = floatingActionButton2;
            } else {
                this.f28341 = floatingActionButton;
                this.f28335 = floatingActionButton2;
            }
            m24049(z);
        }
        if (z) {
            this.f28353 = false;
        } else {
            this.f28344 = false;
        }
        FloatingActionButton floatingActionButton3 = z ? this.f28326 : this.f28335;
        FloatingActionButton floatingActionButton4 = z ? this.f28354 : this.f28341;
        floatingActionButton3.setVisibility(0);
        floatingActionButton4.setVisibility(0);
        float m24029 = m24029(floatingActionButton3);
        floatingActionButton3.setTranslationY(m24029);
        floatingActionButton3.setAlpha(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(floatingActionButton3, "translationY", m24029, 0.0f);
        float m240292 = m24029(floatingActionButton4);
        floatingActionButton4.setTranslationY(m240292);
        floatingActionButton4.setAlpha(1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(floatingActionButton4, "translationY", m240292, 0.0f);
        AnimatorSet duration = new AnimatorSet().setDuration(200L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.playTogether(ofFloat, ofFloat2);
        if (z2) {
            m24041(z);
        }
        duration.start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24055(Bundle bundle) {
        C16560 c16560 = this.f28346;
        C16560 c165602 = this.f28338;
        C10130 c10130 = new C10130();
        c10130.m25425(this.f28332);
        C16773.m39499(c10130);
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            AbstractC16891 m39044 = c165602.m39044();
            c10130.m25439(m39044.mo6007());
            m39044.mo6004(c10130);
            c165602.m39004(c10130);
            AbstractC16891 m390442 = c16560.m39044();
            c10130.m25439(m390442.mo6007());
            m390442.mo6004(c10130);
            c16560.m39004(c10130);
            c10130.mo13231(c11971.size());
            Iterator<E> it = c11971.iterator();
            while (it.hasNext()) {
                AbstractC16891 abstractC16891 = (AbstractC16891) it.next();
                c10130.m25439(abstractC16891.mo6007());
                abstractC16891.mo6004(c10130);
            }
            c11971.m29244();
            bundle.putByteArray("WindowManagerData", c10130.m25427());
        } catch (Throwable th) {
            c11971.m29244();
            throw th;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m24087() {
        C11971 c11971 = this.f28328;
        c11971.m29245();
        try {
            this.f28338.m39044().m39744();
            this.f28346.m39044().m39744();
            Iterator it = new ArrayList(c11971).iterator();
            while (it.hasNext()) {
                ((AbstractC16891) it.next()).m39744();
            }
        } finally {
            c11971.m29244();
        }
    }
}
