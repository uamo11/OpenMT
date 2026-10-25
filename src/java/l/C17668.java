package l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* compiled from: 45OX */
/* renamed from: l.ܿ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17668 extends AbstractC10446 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f54038;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C10530 f54039;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18374 f54040;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f54041;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21882 f54042;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f54043;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C10822 f54044;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f54045;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC4968 f54046;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C18374 f54047;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15467 f54048;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22524 f54049;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21882 f54050;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f54051;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f54052;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Context f54053;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View f54054;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f54055;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f54056;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC22587 f54057;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC0504 f54058;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f54059;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Context f54060;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f54061;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AccelerateInterpolator f54037 = new AccelerateInterpolator();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f54036 = new DecelerateInterpolator();

    public C17668(Activity activity, boolean z) {
        new ArrayList();
        this.f54038 = new ArrayList();
        this.f54061 = 0;
        this.f54052 = true;
        this.f54043 = true;
        this.f54042 = new C2146(this);
        this.f54050 = new C11319(this);
        this.f54057 = new C16962(this);
        View decorView = activity.getWindow().getDecorView();
        m41387(decorView);
        if (z) {
            return;
        }
        this.f54054 = decorView.findViewById(R.id.content);
    }

    public C17668(Dialog dialog) {
        new ArrayList();
        this.f54038 = new ArrayList();
        this.f54061 = 0;
        this.f54052 = true;
        this.f54043 = true;
        this.f54042 = new C2146(this);
        this.f54050 = new C11319(this);
        this.f54057 = new C16962(this);
        m41387(dialog.getWindow().getDecorView());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m41387(View view) {
        InterfaceC0504 wrapper;
        C10530 c10530 = (C10530) view.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a0139);
        this.f54039 = c10530;
        if (c10530 != null) {
            c10530.m26435(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a0042);
        if (findViewById instanceof InterfaceC0504) {
            wrapper = (InterfaceC0504) findViewById;
        } else if (findViewById instanceof C9762) {
            wrapper = ((C9762) findViewById).getWrapper();
        } else {
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
        }
        this.f54058 = wrapper;
        this.f54049 = (C22524) view.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a004a);
        C15467 c15467 = (C15467) view.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a0044);
        this.f54048 = c15467;
        InterfaceC0504 interfaceC0504 = this.f54058;
        if (interfaceC0504 == null || this.f54049 == null || c15467 == null) {
            throw new IllegalStateException("WindowDecorActionBar can only be used with a compatible window decor layout");
        }
        this.f54053 = interfaceC0504.getContext();
        if ((this.f54058.mo2184() & 4) != 0) {
            this.f54051 = true;
        }
        C20491 m46951 = C20491.m46951(this.f54053);
        m46951.m46952();
        this.f54058.getClass();
        m41389(m46951.m46954());
        TypedArray obtainStyledAttributes = this.f54053.obtainStyledAttributes(null, C3390.f10696, bin.mt.plus.R.attr.MT_Protector_res_0x7f040005, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            if (!this.f54039.m26446()) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f54055 = true;
            this.f54039.m26440(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            C17648.m41301(this.f54048, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // l.AbstractC10446
    /* renamed from: ܳ */
    public final void mo26298() {
        m41389(C20491.m46951(this.f54053).m46954());
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m41389(boolean z) {
        if (!z) {
            this.f54058.mo2191();
            this.f54048.getClass();
        } else {
            this.f54048.getClass();
            this.f54058.mo2191();
        }
        this.f54058.getClass();
        this.f54058.mo2181(false);
        this.f54039.m26436(false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41392(int i) {
        this.f54061 = i;
    }

    @Override // l.AbstractC10446
    /* renamed from: ᩳ */
    public final void mo26303(boolean z) {
        C10822 c10822;
        this.f54045 = z;
        if (z || (c10822 = this.f54044) == null) {
            return;
        }
        c10822.m27054();
    }

    @Override // l.AbstractC10446
    /* renamed from: ֫ */
    public final void mo26291(boolean z) {
        if (z == this.f54056) {
            return;
        }
        this.f54056 = z;
        ArrayList arrayList = this.f54038;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC12562) arrayList.get(i)).m30793();
        }
    }

    @Override // l.AbstractC10446
    /* renamed from: ֫ */
    public final void mo26290(CharSequence charSequence) {
        this.f54058.mo2180(charSequence);
    }

    @Override // l.AbstractC10446
    /* renamed from: ܽ */
    public final void mo26300(boolean z) {
        int i = z ? 4 : 0;
        int mo2184 = this.f54058.mo2184();
        this.f54051 = true;
        this.f54058.mo2176((i & 4) | (mo2184 & (-5)));
    }

    @Override // l.AbstractC10446
    /* renamed from: ܽ */
    public final int mo26299() {
        return this.f54058.mo2184();
    }

    @Override // l.AbstractC10446
    /* renamed from: ֫ */
    public final AbstractC3557 mo26287(InterfaceC4968 interfaceC4968) {
        C18374 c18374 = this.f54040;
        if (c18374 != null) {
            c18374.mo10824();
        }
        this.f54039.m26440(false);
        this.f54049.m50518();
        C18374 c183742 = new C18374(this, this.f54049.getContext(), interfaceC4968);
        if (!c183742.m42808()) {
            return null;
        }
        this.f54040 = c183742;
        c183742.mo10839();
        this.f54049.m50512(c183742);
        m41394(true);
        return c183742;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m41393(boolean z) {
        this.f54052 = z;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m41394(boolean z) {
        C15530 mo2175;
        C15530 m50508;
        if (z) {
            if (!this.f54059) {
                this.f54059 = true;
                m41388(false);
            }
        } else if (this.f54059) {
            this.f54059 = false;
            m41388(false);
        }
        if (!this.f54048.isLaidOut()) {
            if (z) {
                this.f54058.setVisibility(4);
                this.f54049.setVisibility(0);
                return;
            } else {
                this.f54058.setVisibility(0);
                this.f54049.setVisibility(8);
                return;
            }
        }
        if (z) {
            m50508 = this.f54058.mo2175(4, 100L);
            mo2175 = this.f54049.m50508(0, 200L);
        } else {
            mo2175 = this.f54058.mo2175(0, 200L);
            m50508 = this.f54049.m50508(8, 100L);
        }
        C10822 c10822 = new C10822();
        c10822.m27058(m50508, mo2175);
        c10822.m27061();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m41390() {
        if (this.f54041) {
            this.f54041 = false;
            m41388(true);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41395() {
        if (this.f54041) {
            return;
        }
        this.f54041 = true;
        m41388(true);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m41388(boolean z) {
        boolean z2 = this.f54041;
        boolean z3 = this.f54059;
        InterfaceC22587 interfaceC22587 = this.f54057;
        View view = this.f54054;
        if (z3 || !z2) {
            if (this.f54043) {
                return;
            }
            this.f54043 = true;
            C10822 c10822 = this.f54044;
            if (c10822 != null) {
                c10822.m27054();
            }
            this.f54048.setVisibility(0);
            int i = this.f54061;
            InterfaceC21882 interfaceC21882 = this.f54050;
            if (i == 0 && (this.f54045 || z)) {
                this.f54048.setTranslationY(0.0f);
                float f = -this.f54048.getHeight();
                if (z) {
                    this.f54048.getLocationInWindow(new int[]{0, 0});
                    f -= r9[1];
                }
                this.f54048.setTranslationY(f);
                C10822 c108222 = new C10822();
                C15530 m41298 = C17648.m41298(this.f54048);
                m41298.m36605(0.0f);
                m41298.m36603(interfaceC22587);
                c108222.m27057(m41298);
                if (this.f54052 && view != null) {
                    view.setTranslationY(f);
                    C15530 m412982 = C17648.m41298(view);
                    m412982.m36605(0.0f);
                    c108222.m27057(m412982);
                }
                c108222.m27055(f54036);
                c108222.m27060();
                c108222.m27056((C1080) interfaceC21882);
                this.f54044 = c108222;
                c108222.m27061();
            } else {
                this.f54048.setAlpha(1.0f);
                this.f54048.setTranslationY(0.0f);
                if (this.f54052 && view != null) {
                    view.setTranslationY(0.0f);
                }
                ((C11319) interfaceC21882).onAnimationEnd();
            }
            C10530 c10530 = this.f54039;
            if (c10530 != null) {
                C17648.m41339(c10530);
                return;
            }
            return;
        }
        if (this.f54043) {
            this.f54043 = false;
            C10822 c108223 = this.f54044;
            if (c108223 != null) {
                c108223.m27054();
            }
            int i2 = this.f54061;
            InterfaceC21882 interfaceC218822 = this.f54042;
            if (i2 == 0 && (this.f54045 || z)) {
                this.f54048.setAlpha(1.0f);
                this.f54048.m36549(true);
                C10822 c108224 = new C10822();
                float f2 = -this.f54048.getHeight();
                if (z) {
                    this.f54048.getLocationInWindow(new int[]{0, 0});
                    f2 -= r9[1];
                }
                C15530 m412983 = C17648.m41298(this.f54048);
                m412983.m36605(f2);
                m412983.m36603(interfaceC22587);
                c108224.m27057(m412983);
                if (this.f54052 && view != null) {
                    C15530 m412984 = C17648.m41298(view);
                    m412984.m36605(f2);
                    c108224.m27057(m412984);
                }
                c108224.m27055(f54037);
                c108224.m27060();
                c108224.m27056((C1080) interfaceC218822);
                this.f54044 = c108224;
                c108224.m27061();
                return;
            }
            ((C2146) interfaceC218822).onAnimationEnd();
        }
    }

    @Override // l.AbstractC10446
    /* renamed from: ᩳ */
    public final Context mo26302() {
        if (this.f54060 == null) {
            TypedValue typedValue = new TypedValue();
            this.f54053.getTheme().resolveAttribute(bin.mt.plus.R.attr.MT_Protector_res_0x7f04000a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f54060 = new ContextThemeWrapper(this.f54053, i);
            } else {
                this.f54060 = this.f54053;
            }
        }
        return this.f54060;
    }

    @Override // l.AbstractC10446
    /* renamed from: ֫ */
    public final void mo26289(Drawable drawable) {
        this.f54058.mo2177(drawable);
    }

    @Override // l.AbstractC10446
    /* renamed from: ֫ */
    public final void mo26288(int i) {
        this.f54058.mo2185(i);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m41391() {
        C10822 c10822 = this.f54044;
        if (c10822 != null) {
            c10822.m27054();
            this.f54044 = null;
        }
    }

    @Override // l.AbstractC10446
    /* renamed from: ۧ */
    public final boolean mo26297() {
        InterfaceC0504 interfaceC0504 = this.f54058;
        if (interfaceC0504 == null || !interfaceC0504.mo2192()) {
            return false;
        }
        this.f54058.collapseActionView();
        return true;
    }

    @Override // l.AbstractC10446
    /* renamed from: ۧ */
    public final void mo26296(boolean z) {
        if (this.f54051) {
            return;
        }
        mo26300(z);
    }

    @Override // l.AbstractC10446
    /* renamed from: ֫ */
    public final boolean mo26293(int i, KeyEvent keyEvent) {
        C3060 mo10836;
        C18374 c18374 = this.f54040;
        if (c18374 == null || (mo10836 = c18374.mo10836()) == null) {
            return false;
        }
        mo10836.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return mo10836.performShortcut(i, keyEvent, 0);
    }
}
