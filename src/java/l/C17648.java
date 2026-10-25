package l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import bin.mt.plus.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: 95QI */
/* renamed from: l.ܿ᩺, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17648 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f53953 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static WeakHashMap f53954;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Field f53958;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f53959;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f53960;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f53955 = {R.id.MT_Protector_res_0x7f0a0013, R.id.MT_Protector_res_0x7f0a0014, R.id.MT_Protector_res_0x7f0a001f, R.id.MT_Protector_res_0x7f0a002a, R.id.MT_Protector_res_0x7f0a002d, R.id.MT_Protector_res_0x7f0a002e, R.id.MT_Protector_res_0x7f0a002f, R.id.MT_Protector_res_0x7f0a0030, R.id.MT_Protector_res_0x7f0a0031, R.id.MT_Protector_res_0x7f0a0032, R.id.MT_Protector_res_0x7f0a0015, R.id.MT_Protector_res_0x7f0a0016, R.id.MT_Protector_res_0x7f0a0017, R.id.MT_Protector_res_0x7f0a0018, R.id.MT_Protector_res_0x7f0a0019, R.id.MT_Protector_res_0x7f0a001a, R.id.MT_Protector_res_0x7f0a001b, R.id.MT_Protector_res_0x7f0a001c, R.id.MT_Protector_res_0x7f0a001d, R.id.MT_Protector_res_0x7f0a001e, R.id.MT_Protector_res_0x7f0a0020, R.id.MT_Protector_res_0x7f0a0021, R.id.MT_Protector_res_0x7f0a0022, R.id.MT_Protector_res_0x7f0a0023, R.id.MT_Protector_res_0x7f0a0024, R.id.MT_Protector_res_0x7f0a0025, R.id.MT_Protector_res_0x7f0a0026, R.id.MT_Protector_res_0x7f0a0027, R.id.MT_Protector_res_0x7f0a0028, R.id.MT_Protector_res_0x7f0a0029, R.id.MT_Protector_res_0x7f0a002b, R.id.MT_Protector_res_0x7f0a002c};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C5322 f53957 = new C5322();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final ViewTreeObserverOnGlobalLayoutListenerC22255 f53956 = new ViewTreeObserverOnGlobalLayoutListenerC22255();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41307(View view, AbstractC13414 abstractC13414) {
        if (Build.VERSION.SDK_INT >= 30) {
            C16670.m39187(view, abstractC13414);
            return;
        }
        int i = C23292.f74787;
        Object tag = view.getTag(R.id.MT_Protector_res_0x7f0a05ae);
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC12004 = new ViewOnApplyWindowInsetsListenerC12004(view, abstractC13414);
        view.setTag(R.id.MT_Protector_res_0x7f0a05b6, viewOnApplyWindowInsetsListenerC12004);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC12004);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rect m41296() {
        if (f53960 == null) {
            f53960 = new ThreadLocal();
        }
        Rect rect = (Rect) f53960.get();
        if (rect == null) {
            rect = new Rect();
            f53960.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41302(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C13787.m33095(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41309(View view, C16445 c16445) {
        if (c16445 == null && (m41331(view) instanceof C10802)) {
            c16445 = new C16445();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c16445 == null ? null : c16445.getBridge());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41295(C13132 c13132) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C6027.m16858(c13132);
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41313(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C6027.m16852(viewGroup, i);
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m41319(View view) {
        return m41331(view) != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C16445 m41323(View view) {
        View.AccessibilityDelegate m41331 = m41331(view);
        if (m41331 == null) {
            return null;
        }
        if (m41331 instanceof C10802) {
            return ((C10802) m41331).f32488;
        }
        return new C16445(m41331);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static View.AccessibilityDelegate m41331(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C13787.m33094(view);
        }
        if (f53959) {
            return null;
        }
        if (f53958 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f53958 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f53959 = true;
                return null;
            }
        }
        try {
            Object obj = f53958.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f53959 = true;
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41294(View view, String str, InterfaceC5198 interfaceC5198) {
        int i;
        ArrayList m41334 = m41334(view);
        int i2 = 0;
        while (true) {
            if (i2 >= m41334.size()) {
                int i3 = -1;
                for (int i4 = 0; i4 < 32 && i3 == -1; i4++) {
                    int i5 = f53955[i4];
                    boolean z = true;
                    for (int i6 = 0; i6 < m41334.size(); i6++) {
                        z &= ((C13847) m41334.get(i6)).m33204() != i5;
                    }
                    if (z) {
                        i3 = i5;
                    }
                }
                i = i3;
            } else {
                if (TextUtils.equals(str, ((C13847) m41334.get(i2)).m33207())) {
                    i = ((C13847) m41334.get(i2)).m33204();
                    break;
                }
                i2++;
            }
        }
        if (i != -1) {
            C13847 c13847 = new C13847(i, str, interfaceC5198);
            C16445 m41323 = m41323(view);
            if (m41323 == null) {
                m41323 = new C16445();
            }
            m41309(view, m41323);
            m41335(c13847.m33204(), view);
            m41334(view).add(c13847);
            m41300(0, view);
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41308(View view, C13847 c13847, String str, InterfaceC5198 interfaceC5198) {
        if (interfaceC5198 == null && str == null) {
            m41337(c13847.m33204(), view);
            return;
        }
        C13847 m33205 = c13847.m33205(str, interfaceC5198);
        C16445 m41323 = m41323(view);
        if (m41323 == null) {
            m41323 = new C16445();
        }
        m41309(view, m41323);
        m41335(m33205.m33204(), view);
        m41334(view).add(m33205);
        m41300(0, view);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m41337(int i, View view) {
        m41335(i, view);
        m41300(0, view);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m41335(int i, View view) {
        ArrayList m41334 = m41334(view);
        for (int i2 = 0; i2 < m41334.size(); i2++) {
            if (((C13847) m41334.get(i2)).m33204() == i) {
                m41334.remove(i2);
                return;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41334(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Protector_res_0x7f0a05aa);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.MT_Protector_res_0x7f0a05aa, arrayList2);
        return arrayList2;
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15530 m41298(View view) {
        if (f53954 == null) {
            f53954 = new WeakHashMap();
        }
        C15530 c15530 = (C15530) f53954.get(view);
        if (c15530 != null) {
            return c15530;
        }
        C15530 c155302 = new C15530(view);
        f53954.put(view, c155302);
        return c155302;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41301(View view, float f) {
        C13082.m31695(view, f);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static float m41320(View view) {
        return C13082.m31713(view);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41326(View view, float f) {
        C13082.m31711(view, f);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static float m41321(View view) {
        return C13082.m31712(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41306(View view, String str) {
        C13082.m31698(view, str);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static String m41322(View view) {
        return C13082.m31715(view);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m41339(View view) {
        C4616.m13544(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41310(View view, InterfaceC16610 interfaceC16610) {
        C13082.m31699(view, interfaceC16610);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21610 m41324(View view, C21610 c21610) {
        WindowInsets m48823 = c21610.m48823();
        if (m48823 != null) {
            WindowInsets m13550 = C4616.m13550(view, m48823);
            if (!m13550.equals(m48823)) {
                return C21610.m48814(view, m13550);
            }
        }
        return c21610;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21610 m41299(View view, C21610 c21610) {
        WindowInsets m48823 = c21610.m48823();
        if (m48823 != null) {
            WindowInsets m13543 = C4616.m13543(view, m48823);
            if (!m13543.equals(m48823)) {
                return C21610.m48814(view, m13543);
            }
        }
        return c21610;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21610 m41340(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C12377.m30085(view);
        }
        return C13082.m31716(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41311(View view, C21610 c21610, Rect rect) {
        C13082.m31694(view, c21610, rect);
    }

    @Deprecated
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static C12437 m41330(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C7438.m19974(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new C12437(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m41317(C22898 c22898) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C2126.m7030(c22898);
        }
        return (String[]) c22898.getTag(R.id.MT_Protector_res_0x7f0a05b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3746 m41297(View view, C3746 c3746) {
        if (Log.isLoggable("ViewCompat", 3)) {
            C11003.toString(c3746);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C2126.m7028(view, c3746);
        }
        InterfaceC18022 interfaceC18022 = (InterfaceC18022) view.getTag(R.id.MT_Protector_res_0x7f0a05af);
        InterfaceC17316 interfaceC17316 = f53957;
        if (interfaceC18022 != null) {
            C3746 mo8914 = interfaceC18022.mo8914(view, c3746);
            if (mo8914 == null) {
                return null;
            }
            if (view instanceof InterfaceC17316) {
                interfaceC17316 = (InterfaceC17316) view;
            }
            return interfaceC17316.onReceiveContent(mo8914);
        }
        if (view instanceof InterfaceC17316) {
            interfaceC17316 = (InterfaceC17316) view;
        }
        return interfaceC17316.onReceiveContent(c3746);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ColorStateList m41329(View view) {
        return C13082.m31693(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41303(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        C13082.m31696(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C13082.m31693(view) == null && C13082.m31710(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static PorterDuff.Mode m41341(View view) {
        return C13082.m31710(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41304(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        C13082.m31697(view, mode);
        if (i == 21) {
            Drawable background = view.getBackground();
            boolean z = (C13082.m31693(view) == null && C13082.m31710(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m41338(View view) {
        return C13082.m31709(view);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static float m41318(View view) {
        return C13082.m31718(view);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m41333(View view, float f) {
        C13082.m31714(view, f);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m41332(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect m41296 = m41296();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m41296.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m41296.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m41293(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m41293((View) parent2);
            }
        }
        if (z && m41296.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m41296);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41325(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect m41296 = m41296();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m41296.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !m41296.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m41293(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                m41293((View) parent2);
            }
        }
        if (z && m41296.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m41296);
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static void m41293(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41314(ViewGroup viewGroup, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            C12377.m30087(viewGroup, i, i2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41315(ViewGroup viewGroup, C6733 c6733) {
        if (Build.VERSION.SDK_INT >= 24) {
            C10261.m25992(viewGroup, (PointerIcon) (c6733 != null ? c6733.m18330() : null));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41327(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C6027.m16853(view, charSequence);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m41328(View view, boolean z) {
        new C1088(R.id.MT_Protector_res_0x7f0a05b1, 0, 28, Boolean.class).m46386(view, Boolean.valueOf(z));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41305(View view, CharSequence charSequence) {
        new C8144(R.id.MT_Protector_res_0x7f0a05ad, 8, 28, CharSequence.class).m46386(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC22255 viewTreeObserverOnGlobalLayoutListenerC22255 = f53956;
        if (charSequence != null) {
            viewTreeObserverOnGlobalLayoutListenerC22255.m49969(view);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC22255.m49970(view);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static CharSequence m41336(View view) {
        return (CharSequence) new C8144(R.id.MT_Protector_res_0x7f0a05ad, 8, 28, CharSequence.class).m46385(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41316(C2978 c2978, CharSequence charSequence) {
        new C15198(R.id.MT_Protector_res_0x7f0a05b2, 64, 30, CharSequence.class).m46386(c2978, charSequence);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41312(View view, boolean z) {
        new C21550(R.id.MT_Protector_res_0x7f0a05ac, 0, 28, Boolean.class).m46386(view, Boolean.valueOf(z));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41300(int i, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m41336(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m41336(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m41336(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                }
            }
        }
    }
}
