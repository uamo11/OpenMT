package l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AppCompatViewInflater;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: 422Y */
/* renamed from: l.ۚܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class LayoutInflaterFactory2C5402 extends AbstractC13246 implements InterfaceC19994, LayoutInflater.Factory2 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public OnBackInvokedDispatcher f16818;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f16819;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public PopupWindow f16820;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C0462 f16821;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final Context f16822;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public Window f16823;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f16824;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f16825;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public boolean f16826;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final Object f16827;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public Configuration f16828;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f16829;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C8930 f16830;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public Rect f16831;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public AbstractC3557 f16832;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f16833;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C15530 f16834;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f16835;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public CharSequence f16836;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public OnBackInvokedCallback f16837;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public int f16838;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f16839;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C22524 f16840;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public C19514[] f16841;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public boolean f16842;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final Runnable f16843;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public boolean f16844;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C11047 f16845;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public boolean f16846;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public AppCompatViewInflater f16847;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ViewGroup f16848;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f16849;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f16850;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public TextView f16851;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f16852;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public C19514 f16853;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final Object f16854;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public View f16855;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public boolean f16856;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public Runnable f16857;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19556 f16858;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f16859;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f16860;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public C3991 f16861;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public Rect f16862;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f16863;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f16864;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public AbstractC10446 f16865;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public C7790 f16866;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C9636 f16867;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16868;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final C3432 f16817 = new C3432();

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f16815 = {R.attr.windowBackground};

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final boolean f16816 = !"robolectric".equals(Build.FINGERPRINT);

    public LayoutInflaterFactory2C5402(ActivityC1252 activityC1252, ActivityC1252 activityC12522) {
        this(activityC1252, null, activityC12522, activityC1252);
    }

    public LayoutInflaterFactory2C5402(DialogC8224 dialogC8224, DialogC8224 dialogC82242) {
        this(dialogC8224.getContext(), dialogC8224.getWindow(), dialogC82242, dialogC8224);
    }

    public LayoutInflaterFactory2C5402(Context context, Window window, InterfaceC8308 interfaceC8308, Object obj) {
        ActivityC1252 activityC1252;
        this.f16834 = null;
        this.f16864 = true;
        this.f16829 = -100;
        this.f16843 = new RunnableC12541(this);
        this.f16822 = context;
        this.f16854 = interfaceC8308;
        this.f16827 = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof ActivityC1252) {
                    activityC1252 = (ActivityC1252) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            activityC1252 = null;
            if (activityC1252 != null) {
                this.f16829 = activityC1252.m4113().mo15465();
            }
        }
        if (this.f16829 == -100) {
            String name = this.f16827.getClass().getName();
            C3432 c3432 = f16817;
            Integer num = (Integer) c3432.getOrDefault(name, null);
            if (num != null) {
                this.f16829 = num.intValue();
                c3432.remove(this.f16827.getClass().getName());
            }
        }
        if (window != null) {
            m15417(window);
        }
        C5965.m16701();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15447() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f16818 != null && (m15448(0).f63061 || this.f16832 != null)) {
                z = true;
            }
            if (z && this.f16837 == null) {
                this.f16837 = C20925.m47751((Object) this.f16818, this);
            } else {
                if (z || (onBackInvokedCallback = this.f16837) == null) {
                    return;
                }
                C20925.m47753(this.f16818, onBackInvokedCallback);
                this.f16837 = null;
            }
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context mo15431(Context context) {
        this.f16835 = true;
        int i = this.f16829;
        if (i == -100) {
            i = AbstractC13246.m32148();
        }
        int m15429 = m15429(context, i);
        if (AbstractC13246.m32145(context)) {
            AbstractC13246.m32146(context);
        }
        C3931 m15428 = m15428(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(m15416(context, m15429, m15428, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C12729) {
            try {
                ((C12729) context).m31026(m15416(context, m15429, m15428, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f16816) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                int i6 = Build.VERSION.SDK_INT;
                if (i6 < 24) {
                    if (!C11003.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                } else {
                    C14573.m34824(configuration3, configuration4, configuration);
                }
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout & 15;
                int i20 = configuration4.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = configuration3.screenLayout & 192;
                int i22 = configuration4.screenLayout & 192;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = configuration3.screenLayout & 48;
                int i24 = configuration4.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = configuration3.screenLayout & 768;
                int i26 = configuration4.screenLayout & 768;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                if (i6 >= 26) {
                    C23746.m52392(configuration3, configuration4, configuration);
                }
                int i27 = configuration3.uiMode & 15;
                int i28 = configuration4.uiMode & 15;
                if (i27 != i28) {
                    configuration.uiMode |= i28;
                }
                int i29 = configuration3.uiMode & 48;
                int i30 = configuration4.uiMode & 48;
                if (i29 != i30) {
                    configuration.uiMode |= i30;
                }
                int i31 = configuration3.screenWidthDp;
                int i32 = configuration4.screenWidthDp;
                if (i31 != i32) {
                    configuration.screenWidthDp = i32;
                }
                int i33 = configuration3.screenHeightDp;
                int i34 = configuration4.screenHeightDp;
                if (i33 != i34) {
                    configuration.screenHeightDp = i34;
                }
                int i35 = configuration3.smallestScreenWidthDp;
                int i36 = configuration4.smallestScreenWidthDp;
                if (i35 != i36) {
                    configuration.smallestScreenWidthDp = i36;
                }
                int i37 = configuration3.densityDpi;
                int i38 = configuration4.densityDpi;
                if (i37 != i38) {
                    configuration.densityDpi = i38;
                }
            }
        }
        Configuration m15416 = m15416(context, m15429, m15428, configuration, true);
        C12729 c12729 = new C12729(context, bin.mt.plus.R.style.MT_Protector_res_0x7f130291);
        c12729.m31026(m15416);
        try {
            if (context.getTheme() != null) {
                C19892.m45746(c12729.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return c12729;
    }

    @Override // l.AbstractC13246
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo15468() {
        String str;
        this.f16835 = true;
        m15420(false, true);
        m15427();
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = C18270.m42602(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC10446 abstractC10446 = this.f16865;
                if (abstractC10446 == null) {
                    this.f16819 = true;
                } else {
                    abstractC10446.mo26296(true);
                }
            }
            AbstractC13246.m32139(this);
        }
        this.f16828 = new Configuration(this.f16822.getResources().getConfiguration());
        this.f16825 = true;
    }

    @Override // l.AbstractC13246
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void mo15451() {
        m15421();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15443(int i, KeyEvent keyEvent) {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 == null || !abstractC10446.mo26293(i, keyEvent)) {
            C19514 c19514 = this.f16853;
            if (c19514 != null && m15419(c19514, keyEvent.getKeyCode(), keyEvent)) {
                C19514 c195142 = this.f16853;
                if (c195142 != null) {
                    c195142.f63073 = true;
                    return true;
                }
            } else {
                if (this.f16853 == null) {
                    C19514 m15448 = m15448(0);
                    m15425(m15448, keyEvent);
                    boolean m15419 = m15419(m15448, keyEvent.getKeyCode(), keyEvent);
                    m15448.f63072 = false;
                    if (m15419) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC13246
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void mo15446() {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 != null) {
            abstractC10446.mo26303(false);
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m15453(int i) {
        if (i == 108) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26291(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C19514 m15448 = m15448(i);
            if (m15448.f63061) {
                m15442(m15448, false);
            }
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final AbstractC10446 mo15458() {
        m15426();
        return this.f16865;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Context m15459() {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        Context mo26302 = abstractC10446 != null ? abstractC10446.mo26302() : null;
        return mo26302 == null ? this.f16822 : mo26302;
    }

    @Override // l.AbstractC13246
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void mo15460() {
        m15426();
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 != null) {
            abstractC10446.mo26303(true);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15469(int i) {
        if (i == 108) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26291(true);
            }
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo15449() {
        if (this.f16865 != null) {
            m15426();
            if (this.f16865.mo26301()) {
                return;
            }
            m15422(0);
        }
    }

    @Override // l.InterfaceC19994
    public final boolean onMenuItemSelected(C3060 c3060, MenuItem menuItem) {
        C19514 m15454;
        Window.Callback callback = this.f16823.getCallback();
        if (callback == null || this.f16859 || (m15454 = m15454(c3060.getRootMenu())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(m15454.f63069, menuItem);
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m15426() {
        m15421();
        if (this.f16860 && this.f16865 == null) {
            Object obj = this.f16827;
            if (obj instanceof Activity) {
                this.f16865 = new C17668((Activity) obj, this.f16846);
            } else if (obj instanceof Dialog) {
                this.f16865 = new C17668((Dialog) obj);
            }
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26296(this.f16819);
            }
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15441(C9762 c9762) {
        CharSequence charSequence;
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 instanceof C17668) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f16866 = null;
            if (abstractC10446 != null) {
                abstractC10446.mo26304();
            }
            this.f16865 = null;
            if (c9762 == null) {
                this.f16867.m24554((InterfaceC1874) null);
            } else {
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.f16836;
                }
                C11752 c11752 = new C11752(c9762, charSequence, this.f16867);
                this.f16865 = c11752;
                this.f16867.m24554(c11752.f35084);
                c9762.setBackInvokedCallbackEnabled(true);
            }
            mo15449();
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final MenuInflater mo15463() {
        if (this.f16866 == null) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            this.f16866 = new C7790(abstractC10446 != null ? abstractC10446.mo26302() : this.f16822);
        }
        return this.f16866;
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View mo15432(int i) {
        m15421();
        return this.f16823.findViewById(i);
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15436(Configuration configuration) {
        if (this.f16860 && this.f16868) {
            m15426();
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26298();
            }
        }
        C5965 m16700 = C5965.m16700();
        Context context = this.f16822;
        m16700.m16703(context);
        this.f16828 = new Configuration(context.getResources().getConfiguration());
        m15420(false, false);
    }

    @Override // l.AbstractC13246
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo15445() {
        m15420(true, false);
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15437(View view) {
        m15421();
        ViewGroup viewGroup = (ViewGroup) this.f16848.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo15462(int i) {
        m15421();
        ViewGroup viewGroup = (ViewGroup) this.f16848.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f16822).inflate(i, viewGroup);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo15455(View view, ViewGroup.LayoutParams layoutParams) {
        m15421();
        ViewGroup viewGroup = (ViewGroup) this.f16848.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15438(View view, ViewGroup.LayoutParams layoutParams) {
        m15421();
        ((ViewGroup) this.f16848.findViewById(R.id.content)).addView(view, layoutParams);
        this.f16867.m24552(this.f16823.getCallback());
    }

    @Override // l.AbstractC13246
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo15452() {
        Object obj = this.f16827;
        boolean z = obj instanceof Activity;
        if (z) {
            AbstractC13246.m32142(this);
        }
        if (this.f16844) {
            this.f16823.getDecorView().removeCallbacks(this.f16843);
        }
        this.f16859 = true;
        int i = this.f16829;
        C3432 c3432 = f16817;
        if (i != -100 && z && ((Activity) obj).isChangingConfigurations()) {
            c3432.put(obj.getClass().getName(), Integer.valueOf(this.f16829));
        } else {
            c3432.remove(obj.getClass().getName());
        }
        AbstractC10446 abstractC10446 = this.f16865;
        if (abstractC10446 != null) {
            abstractC10446.mo26304();
        }
        C3991 c3991 = this.f16861;
        if (c3991 != null) {
            c3991.m8178();
        }
        C8930 c8930 = this.f16830;
        if (c8930 != null) {
            c8930.m8178();
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo15464(int i) {
        this.f16838 = i;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m15427() {
        if (this.f16823 == null) {
            Object obj = this.f16827;
            if (obj instanceof Activity) {
                m15417(((Activity) obj).getWindow());
            }
        }
        if (this.f16823 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15417(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f16823 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof C9636) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        C9636 c9636 = new C9636(this, callback);
        this.f16867 = c9636;
        window.setCallback(c9636);
        C22733 m50795 = C22733.m50795(this.f16822, (AttributeSet) null, f16815);
        Drawable m50812 = m50795.m50812(0);
        if (m50812 != null) {
            window.setBackgroundDrawable(m50812);
        }
        m50795.m50813();
        this.f16823 = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f16818) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f16837) != null) {
            C20925.m47753(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f16837 = null;
        }
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f16818 = C20925.m47752(activity);
                m15447();
            }
        }
        this.f16818 = null;
        m15447();
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m15421() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        if (this.f16868) {
            return;
        }
        Context context = this.f16822;
        int[] iArr = C3390.f10705;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            mo15457(1);
        } else if (obtainStyledAttributes.getBoolean(BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, false)) {
            mo15457(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            mo15457(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            mo15457(10);
        }
        this.f16839 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        m15427();
        this.f16823.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (!this.f16826) {
            if (this.f16839) {
                viewGroup = (ViewGroup) from.inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d000c, (ViewGroup) null);
                this.f16846 = false;
                this.f16860 = false;
            } else if (this.f16860) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector_res_0x7f040009, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C12729(context, typedValue.resourceId) : context).inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d0017, (ViewGroup) null);
                InterfaceC19556 interfaceC19556 = (InterfaceC19556) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a0139);
                this.f16858 = interfaceC19556;
                interfaceC19556.mo26433(this.f16823.getCallback());
                if (this.f16846) {
                    this.f16858.mo26431(109);
                }
                if (this.f16863) {
                    this.f16858.mo26431(2);
                }
                if (this.f16849) {
                    this.f16858.mo26431(5);
                }
            } else {
                viewGroup = null;
            }
        } else {
            viewGroup = this.f16833 ? (ViewGroup) from.inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d0016, (ViewGroup) null) : (ViewGroup) from.inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d0015, (ViewGroup) null);
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f16860 + ", windowActionBarOverlay: " + this.f16846 + ", android:windowIsFloating: " + this.f16839 + ", windowActionModeOverlay: " + this.f16833 + ", windowNoTitle: " + this.f16826 + " }");
        }
        C17648.m41310(viewGroup, new C10425(this));
        if (this.f16858 == null) {
            this.f16851 = (TextView) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a0631);
        }
        int i = C22461.f72738;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        C18850 c18850 = (C18850) viewGroup.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a0043);
        ViewGroup viewGroup2 = (ViewGroup) this.f16823.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                c18850.addView(childAt);
            }
            viewGroup2.setId(-1);
            c18850.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f16823.setContentView(viewGroup);
        c18850.m43550(new C6191(this));
        this.f16848 = viewGroup;
        Object obj = this.f16827;
        if (obj instanceof Activity) {
            charSequence = ((Activity) obj).getTitle();
        } else {
            charSequence = this.f16836;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            InterfaceC19556 interfaceC195562 = this.f16858;
            if (interfaceC195562 == null) {
                AbstractC10446 abstractC10446 = this.f16865;
                if (abstractC10446 != null) {
                    abstractC10446.mo26290(charSequence);
                } else {
                    TextView textView = this.f16851;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
            } else {
                interfaceC195562.mo26434(charSequence);
            }
        }
        C18850 c188502 = (C18850) this.f16848.findViewById(R.id.content);
        View decorView = this.f16823.getDecorView();
        c188502.m43549(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, c188502.m43554());
        obtainStyledAttributes2.getValue(q.h, c188502.m43552());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, c188502.m43553());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, c188502.m43555());
        }
        if (obtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS)) {
            obtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, c188502.m43548());
        }
        if (obtainStyledAttributes2.hasValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH)) {
            obtainStyledAttributes2.getValue(UMErrorCode.E_UM_BE_EMPTY_URL_PATH, c188502.m43551());
        }
        obtainStyledAttributes2.recycle();
        c188502.requestLayout();
        this.f16868 = true;
        C19514 m15448 = m15448(0);
        if (this.f16859 || m15448.f63066 != null) {
            return;
        }
        m15422(108);
    }

    @Override // l.AbstractC13246
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo15457(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.f16826 && i == 108) {
            return false;
        }
        if (this.f16860 && i == 1) {
            this.f16860 = false;
        }
        if (i == 1) {
            m15423();
            this.f16826 = true;
            return true;
        }
        if (i == 2) {
            m15423();
            this.f16863 = true;
            return true;
        }
        if (i == 5) {
            m15423();
            this.f16849 = true;
            return true;
        }
        if (i == 10) {
            m15423();
            this.f16833 = true;
            return true;
        }
        if (i == 108) {
            m15423();
            this.f16860 = true;
            return true;
        }
        if (i == 109) {
            m15423();
            this.f16846 = true;
            return true;
        }
        return this.f16823.requestFeature(i);
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15439(CharSequence charSequence) {
        this.f16836 = charSequence;
        InterfaceC19556 interfaceC19556 = this.f16858;
        if (interfaceC19556 == null) {
            AbstractC10446 abstractC10446 = this.f16865;
            if (abstractC10446 != null) {
                abstractC10446.mo26290(charSequence);
                return;
            }
            TextView textView = this.f16851;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        interfaceC19556.mo26434(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.۠ܿ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC3557 m15433(l.C6379 r9) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.LayoutInflaterFactory2C5402.m15433(l.ۛ᩻):l.ۗ᩻");
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m15467() {
        ViewGroup viewGroup;
        return this.f16868 && (viewGroup = this.f16848) != null && viewGroup.isLaidOut();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m15470() {
        return this.f16864;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m15471() {
        boolean z = this.f16842;
        this.f16842 = false;
        C19514 m15448 = m15448(0);
        if (!m15448.f63061) {
            AbstractC3557 abstractC3557 = this.f16832;
            if (abstractC3557 == null) {
                m15426();
                AbstractC10446 abstractC10446 = this.f16865;
                if (abstractC10446 == null || !abstractC10446.mo26297()) {
                    return false;
                }
            } else {
                abstractC3557.mo10824();
                return true;
            }
        } else if (!z) {
            m15442(m15448, true);
            return true;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m15444(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        AudioManager audioManager;
        Object obj = this.f16827;
        if (((!(obj instanceof InterfaceC7979) && !(obj instanceof DialogC8224)) || (decorView = this.f16823.getDecorView()) == null || !C15033.m35557(decorView, keyEvent)) && (keyEvent.getKeyCode() != 82 || !this.f16867.m24555(this.f16823.getCallback(), keyEvent))) {
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f16842 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C19514 m15448 = m15448(0);
                        if (!m15448.f63061) {
                            m15425(m15448, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f16832 == null) {
                        C19514 m154482 = m15448(0);
                        InterfaceC19556 interfaceC19556 = this.f16858;
                        Context context = this.f16822;
                        if (interfaceC19556 != null && interfaceC19556.mo26437() && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            if (!this.f16858.mo26445()) {
                                if (!this.f16859 && m15425(m154482, keyEvent)) {
                                    z = this.f16858.mo26443();
                                }
                                z = false;
                            } else {
                                z = this.f16858.mo26441();
                            }
                            if (z) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        } else {
                            boolean z3 = m154482.f63061;
                            if (z3 || m154482.f63073) {
                                m15442(m154482, true);
                                z = z3;
                            } else {
                                if (m154482.f63072) {
                                    if (m154482.f63060) {
                                        m154482.f63072 = false;
                                        z2 = m15425(m154482, keyEvent);
                                    } else {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        m15418(m154482, keyEvent);
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z && (audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio")) != null) {
                                audioManager.playSoundEffect(0);
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            if (!m15471()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.f16847 == null) {
            int[] iArr = C3390.f10705;
            Context context2 = this.f16822;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f16847 = new AppCompatViewInflater();
            } else {
                try {
                    this.f16847 = (AppCompatViewInflater) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                    this.f16847 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f16847;
        int i = C8350.f25576;
        return appCompatViewInflater.createView(view, str, context, attributeSet, false, false, true, false);
    }

    @Override // l.AbstractC13246
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void mo15472() {
        LayoutInflater from = LayoutInflater.from(this.f16822);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            from.getFactory2();
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        if (r14 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m15418(l.C19514 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.LayoutInflaterFactory2C5402.m15418(l.᩵ܳ, android.view.KeyEvent):void");
    }

    @Override // l.InterfaceC19994
    public final void onMenuModeChange(C3060 c3060) {
        InterfaceC19556 interfaceC19556 = this.f16858;
        if (interfaceC19556 != null && interfaceC19556.mo26437() && (!ViewConfiguration.get(this.f16822).hasPermanentMenuKey() || this.f16858.mo26442())) {
            Window.Callback callback = this.f16823.getCallback();
            if (!this.f16858.mo26445()) {
                if (callback == null || this.f16859) {
                    return;
                }
                if (this.f16844 && (1 & this.f16824) != 0) {
                    View decorView = this.f16823.getDecorView();
                    Runnable runnable = this.f16843;
                    decorView.removeCallbacks(runnable);
                    ((RunnableC12541) runnable).run();
                }
                C19514 m15448 = m15448(0);
                C3060 c30602 = m15448.f63066;
                if (c30602 == null || m15448.f63060 || !callback.onPreparePanel(0, m15448.f63064, c30602)) {
                    return;
                }
                callback.onMenuOpened(108, m15448.f63066);
                this.f16858.mo26443();
                return;
            }
            this.f16858.mo26441();
            if (this.f16859) {
                return;
            }
            callback.onPanelClosed(108, m15448(0).f63066);
            return;
        }
        C19514 m154482 = m15448(0);
        m154482.f63059 = true;
        m15442(m154482, false);
        m15418(m154482, (KeyEvent) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cc, code lost:
    
        if (r13.f63066 == null) goto L81;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15425(l.C19514 r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.LayoutInflaterFactory2C5402.m15425(l.᩵ܳ, android.view.KeyEvent):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15440(C3060 c3060) {
        if (this.f16850) {
            return;
        }
        this.f16850 = true;
        this.f16858.mo26447();
        Window.Callback callback = this.f16823.getCallback();
        if (callback != null && !this.f16859) {
            callback.onPanelClosed(108, c3060);
        }
        this.f16850 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15442(C19514 c19514, boolean z) {
        ViewGroup viewGroup;
        InterfaceC19556 interfaceC19556;
        if (z && c19514.f63069 == 0 && (interfaceC19556 = this.f16858) != null && interfaceC19556.mo26445()) {
            m15440(c19514.f63066);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f16822.getSystemService("window");
        if (windowManager != null && c19514.f63061 && (viewGroup = c19514.f63067) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m15435(c19514.f63069, c19514, (C3060) null);
            }
        }
        c19514.f63072 = false;
        c19514.f63073 = false;
        c19514.f63061 = false;
        c19514.f63070 = null;
        c19514.f63059 = true;
        if (this.f16853 == c19514) {
            this.f16853 = null;
        }
        if (c19514.f63069 == 0) {
            m15447();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15435(int i, C19514 c19514, C3060 c3060) {
        if (c3060 == null) {
            if (c19514 == null && i >= 0) {
                C19514[] c19514Arr = this.f16841;
                if (i < c19514Arr.length) {
                    c19514 = c19514Arr[i];
                }
            }
            if (c19514 != null) {
                c3060 = c19514.f63066;
            }
        }
        if ((c19514 == null || c19514.f63061) && !this.f16859) {
            this.f16867.m24553(this.f16823.getCallback(), i, c3060);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19514 m15454(C3060 c3060) {
        C19514[] c19514Arr = this.f16841;
        int length = c19514Arr != null ? c19514Arr.length : 0;
        for (int i = 0; i < length; i++) {
            C19514 c19514 = c19514Arr[i];
            if (c19514 != null && c19514.f63066 == c3060) {
                return c19514;
            }
        }
        return null;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C19514 m15448(int i) {
        C19514[] c19514Arr = this.f16841;
        if (c19514Arr == null || c19514Arr.length <= i) {
            C19514[] c19514Arr2 = new C19514[i + 1];
            if (c19514Arr != null) {
                System.arraycopy(c19514Arr, 0, c19514Arr2, 0, c19514Arr.length);
            }
            this.f16841 = c19514Arr2;
            c19514Arr = c19514Arr2;
        }
        C19514 c19514 = c19514Arr[i];
        if (c19514 != null) {
            return c19514;
        }
        C19514 c195142 = new C19514();
        c195142.f63069 = i;
        c195142.f63059 = false;
        c19514Arr[i] = c195142;
        return c195142;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m15419(C19514 c19514, int i, KeyEvent keyEvent) {
        C3060 c3060;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c19514.f63072 || m15425(c19514, keyEvent)) && (c3060 = c19514.f63066) != null) {
            return c3060.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m15422(int i) {
        this.f16824 = (1 << i) | this.f16824;
        if (this.f16844) {
            return;
        }
        View decorView = this.f16823.getDecorView();
        int i2 = C17648.f53953;
        decorView.postOnAnimation(this.f16843);
        this.f16844 = true;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m15473(int i) {
        C19514 m15448 = m15448(i);
        if (m15448.f63066 != null) {
            Bundle bundle = new Bundle();
            m15448.f63066.saveActionViewStates(bundle);
            if (bundle.size() > 0) {
                m15448.f63068 = bundle;
            }
            m15448.f63066.stopDispatchingItemsChanged();
            m15448.f63066.clear();
        }
        m15448.f63060 = true;
        m15448.f63059 = true;
        if ((i == 108 || i == 0) && this.f16858 != null) {
            C19514 m154482 = m15448(0);
            m154482.f63072 = false;
            m15425(m154482, (KeyEvent) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15430(C21610 c21610) {
        boolean z;
        boolean z2;
        int m3228;
        int m48826 = c21610.m48826();
        C22524 c22524 = this.f16840;
        if (c22524 == null || !(c22524.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16840.getLayoutParams();
            if (this.f16840.isShown()) {
                if (this.f16831 == null) {
                    this.f16831 = new Rect();
                    this.f16862 = new Rect();
                }
                Rect rect = this.f16831;
                Rect rect2 = this.f16862;
                rect.set(c21610.m48824(), c21610.m48826(), c21610.m48834(), c21610.m48835());
                C22461.m50392(this.f16848, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                C21610 m41340 = C17648.m41340(this.f16848);
                int m48824 = m41340 == null ? 0 : m41340.m48824();
                int m48834 = m41340 == null ? 0 : m41340.m48834();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = this.f16822;
                if (i > 0 && this.f16855 == null) {
                    View view = new View(context);
                    this.f16855 = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m48824;
                    layoutParams.rightMargin = m48834;
                    this.f16848.addView(this.f16855, -1, layoutParams);
                } else {
                    View view2 = this.f16855;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != m48824 || marginLayoutParams2.rightMargin != m48834) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = m48824;
                            marginLayoutParams2.rightMargin = m48834;
                            this.f16855.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f16855;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    View view4 = this.f16855;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        m3228 = C0881.m3228(context, bin.mt.plus.R.color.MT_Protector_res_0x7f060006);
                    } else {
                        m3228 = C0881.m3228(context, bin.mt.plus.R.color.MT_Protector_res_0x7f060005);
                    }
                    view4.setBackgroundColor(m3228);
                }
                if (!this.f16833 && r5) {
                    m48826 = 0;
                }
                z = r5;
                r5 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r5 = false;
            }
            if (r5) {
                this.f16840.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f16855;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return m48826;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m15423() {
        if (this.f16868) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m15450() {
        InterfaceC19556 interfaceC19556 = this.f16858;
        if (interfaceC19556 != null) {
            interfaceC19556.mo26447();
        }
        if (this.f16820 != null) {
            this.f16823.getDecorView().removeCallbacks(this.f16857);
            if (this.f16820.isShowing()) {
                try {
                    this.f16820.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f16820 = null;
        }
        C15530 c15530 = this.f16834;
        if (c15530 != null) {
            c15530.m36598();
        }
        C3060 c3060 = m15448(0).f63066;
        if (c3060 != null) {
            c3060.close();
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context mo15461() {
        return this.f16822;
    }

    @Override // l.AbstractC13246
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15434() {
        final Context context = this.f16822;
        if (AbstractC13246.m32145(context) && AbstractC13246.m32140() != null && !AbstractC13246.m32140().equals(AbstractC13246.m32137())) {
            AbstractC13246.f39650.execute(new Runnable() { // from class: l.ܶܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC13246.m32146(context);
                }
            });
        }
        m15420(true, true);
    }

    @Override // l.AbstractC13246
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo15456() {
        return m15420(true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m15420(boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.LayoutInflaterFactory2C5402.m15420(boolean, boolean):boolean");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C3931 m15428(Context context) {
        C3931 m32140;
        C3931 m11974;
        Locale m11977;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (m32140 = AbstractC13246.m32140()) == null) {
            return null;
        }
        C3931 m15424 = m15424(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            if (m32140.m11978()) {
                m11974 = C3931.m11976();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < m15424.m11979() + m32140.m11979(); i2++) {
                    if (i2 < m32140.m11979()) {
                        m11977 = m32140.m11977(i2);
                    } else {
                        m11977 = m15424.m11977(i2 - m32140.m11979());
                    }
                    if (m11977 != null) {
                        linkedHashSet.add(m11977);
                    }
                }
                m11974 = C3931.m11975((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (m32140.m11978()) {
            m11974 = C3931.m11976();
        } else {
            m11974 = C3931.m11974(C17396.m40747(m32140.m11977(0)));
        }
        return m11974.m11978() ? m15424 : m11974;
    }

    @Override // l.AbstractC13246
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo15466(int i) {
        if (this.f16829 != i) {
            this.f16829 = i;
            if (this.f16835) {
                m15420(true, true);
            }
        }
    }

    @Override // l.AbstractC13246
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int mo15465() {
        return this.f16829;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3931 m15424(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C14573.m34823(configuration);
        }
        return C3931.m11974(C17396.m40747(configuration.locale));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Configuration m15416(Context context, int i, C3931 c3931, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c3931 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                C14573.m34825(configuration2, c3931);
                return configuration2;
            }
            configuration2.setLocale(c3931.m11977(0));
            configuration2.setLayoutDirection(c3931.m11977(0));
        }
        return configuration2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15429(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f16830 == null) {
                            this.f16830 = new C8930(this, context);
                        }
                        return this.f16830.m23036();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    if (this.f16861 == null) {
                        this.f16861 = new C3991(this, C7518.m20159(context));
                    }
                    return this.f16861.m12037();
                }
            }
            return i;
        }
        return -1;
    }
}
