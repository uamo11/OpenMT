package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import bin.mt.plus.R;

/* compiled from: H56R */
/* renamed from: l.ۖᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2706 implements InterfaceC0504 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17254 f8450;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f8451;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C9762 f8452;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public Drawable f8453;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public CharSequence f8454;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Drawable f8455;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public View f8456;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public CharSequence f8457;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public CharSequence f8458;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f8459;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8460;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Drawable f8461;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Window.Callback f8462;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f8463;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Drawable f8464;

    @Override // l.InterfaceC0504
    /* renamed from: ᩷ */
    public final void mo2191() {
    }

    public C2706(C9762 c9762, boolean z) {
        Drawable drawable;
        this.f8459 = 0;
        this.f8452 = c9762;
        this.f8458 = c9762.getTitle();
        this.f8454 = c9762.getSubtitle();
        this.f8451 = this.f8458 != null;
        this.f8455 = c9762.getNavigationIcon();
        C22733 m50796 = C22733.m50796(c9762.getContext(), null, C3390.f10696, R.attr.MT_Protector_res_0x7f040005, 0);
        int i = 15;
        this.f8461 = m50796.m50815(15);
        if (z) {
            CharSequence m50817 = m50796.m50817(27);
            if (!TextUtils.isEmpty(m50817)) {
                this.f8451 = true;
                this.f8458 = m50817;
                if ((this.f8460 & 8) != 0) {
                    c9762.setTitle(m50817);
                    if (this.f8451) {
                        C17648.m41305(c9762.getRootView(), m50817);
                    }
                }
            }
            CharSequence m508172 = m50796.m50817(25);
            if (!TextUtils.isEmpty(m508172)) {
                this.f8454 = m508172;
                if ((this.f8460 & 8) != 0) {
                    c9762.setSubtitle(m508172);
                }
            }
            Drawable m50815 = m50796.m50815(20);
            if (m50815 != null) {
                this.f8453 = m50815;
                m8434();
            }
            Drawable m508152 = m50796.m50815(17);
            if (m508152 != null) {
                this.f8464 = m508152;
                m8434();
            }
            if (this.f8455 == null && (drawable = this.f8461) != null) {
                mo2177(drawable);
            }
            mo2176(m50796.m50809(10, 0));
            int m50806 = m50796.m50806(9, 0);
            if (m50806 != 0) {
                View inflate = LayoutInflater.from(c9762.getContext()).inflate(m50806, (ViewGroup) c9762, false);
                View view = this.f8456;
                if (view != null && (this.f8460 & 16) != 0) {
                    c9762.removeView(view);
                }
                this.f8456 = inflate;
                if (inflate != null && (this.f8460 & 16) != 0) {
                    c9762.addView(inflate);
                }
                mo2176(this.f8460 | 16);
            }
            int m50811 = m50796.m50811(13, 0);
            if (m50811 > 0) {
                ViewGroup.LayoutParams layoutParams = c9762.getLayoutParams();
                layoutParams.height = m50811;
                c9762.setLayoutParams(layoutParams);
            }
            int m50799 = m50796.m50799(7, -1);
            int m507992 = m50796.m50799(3, -1);
            if (m50799 >= 0 || m507992 >= 0) {
                c9762.setContentInsetsRelative(Math.max(m50799, 0), Math.max(m507992, 0));
            }
            int m508062 = m50796.m50806(28, 0);
            if (m508062 != 0) {
                c9762.setTitleTextAppearance(c9762.getContext(), m508062);
            }
            int m508063 = m50796.m50806(26, 0);
            if (m508063 != 0) {
                c9762.setSubtitleTextAppearance(c9762.getContext(), m508063);
            }
            int m508064 = m50796.m50806(22, 0);
            if (m508064 != 0) {
                c9762.setPopupTheme(m508064);
            }
        } else {
            if (c9762.getNavigationIcon() != null) {
                this.f8461 = c9762.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f8460 = i;
        }
        m50796.m50813();
        if (R.string.MT_Protector_res_0x7f120002 != this.f8459) {
            this.f8459 = R.string.MT_Protector_res_0x7f120002;
            if (TextUtils.isEmpty(c9762.getNavigationContentDescription())) {
                mo2185(this.f8459);
            }
        }
        this.f8457 = c9762.getNavigationContentDescription();
        c9762.setNavigationOnClickListener(new ViewOnClickListenerC9056(this));
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C9762 m8437() {
        return this.f8452;
    }

    @Override // l.InterfaceC0504
    public final Context getContext() {
        return this.f8452.getContext();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ۧ */
    public final void mo2185(int i) {
        this.f8457 = i == 0 ? null : this.f8452.getContext().getString(i);
        m8433();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ᩻ */
    public final boolean mo2192() {
        return this.f8452.hasExpandedActionView();
    }

    @Override // l.InterfaceC0504
    public final void collapseActionView() {
        this.f8452.collapseActionView();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final void mo2179(Window.Callback callback) {
        this.f8462 = callback;
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final void mo2180(CharSequence charSequence) {
        if (this.f8451) {
            return;
        }
        this.f8458 = charSequence;
        if ((this.f8460 & 8) != 0) {
            C9762 c9762 = this.f8452;
            c9762.setTitle(charSequence);
            if (this.f8451) {
                C17648.m41305(c9762.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m8434() {
        Drawable drawable;
        int i = this.f8460;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f8453;
            if (drawable == null) {
                drawable = this.f8464;
            }
        } else {
            drawable = this.f8464;
        }
        this.f8452.setLogo(drawable);
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final boolean mo2182() {
        return this.f8452.canShowOverflowMenu();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ᩳ */
    public final boolean mo2190() {
        return this.f8452.isOverflowMenuShowing();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ܳ */
    public final boolean mo2187() {
        return this.f8452.isOverflowMenuShowPending();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ܽ */
    public final boolean mo2188() {
        return this.f8452.showOverflowMenu();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ۧ */
    public final boolean mo2186() {
        return this.f8452.hideOverflowMenu();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ܿ */
    public final void mo2189() {
        this.f8463 = true;
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final void mo2178(Menu menu, InterfaceC17585 interfaceC17585) {
        C17254 c17254 = this.f8450;
        C9762 c9762 = this.f8452;
        if (c17254 == null) {
            C17254 c172542 = new C17254(c9762.getContext());
            this.f8450 = c172542;
            c172542.m22490(R.id.MT_Protector_res_0x7f0a004e);
        }
        this.f8450.setCallback(interfaceC17585);
        c9762.setMenu((C3060) menu, this.f8450);
    }

    @Override // l.InterfaceC0504
    /* renamed from: ۜ */
    public final void mo2183() {
        this.f8452.dismissPopupMenus();
    }

    @Override // l.InterfaceC0504
    /* renamed from: ۢ */
    public final int mo2184() {
        return this.f8460;
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final void mo2176(int i) {
        View view;
        int i2 = this.f8460 ^ i;
        this.f8460 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            C9762 c9762 = this.f8452;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m8433();
                }
                if ((this.f8460 & 4) != 0) {
                    Drawable drawable = this.f8455;
                    if (drawable == null) {
                        drawable = this.f8461;
                    }
                    c9762.setNavigationIcon(drawable);
                } else {
                    c9762.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m8434();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    c9762.setTitle(this.f8458);
                    c9762.setSubtitle(this.f8454);
                } else {
                    c9762.setTitle((CharSequence) null);
                    c9762.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f8456) == null) {
                return;
            }
            if ((i & 16) != 0) {
                c9762.addView(view);
            } else {
                c9762.removeView(view);
            }
        }
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final void mo2181(boolean z) {
        this.f8452.setCollapsible(z);
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final C15530 mo2175(int i, long j) {
        C15530 m41298 = C17648.m41298(this.f8452);
        m41298.m36599(i == 0 ? 1.0f : 0.0f);
        m41298.m36600(j);
        m41298.m36602(new C16110(this, i));
        return m41298;
    }

    @Override // l.InterfaceC0504
    /* renamed from: ֫ */
    public final void mo2177(Drawable drawable) {
        this.f8455 = drawable;
        int i = this.f8460 & 4;
        C9762 c9762 = this.f8452;
        if (i == 0) {
            c9762.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.f8461;
        }
        c9762.setNavigationIcon(drawable);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m8433() {
        if ((this.f8460 & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f8457);
            C9762 c9762 = this.f8452;
            if (isEmpty) {
                c9762.setNavigationContentDescription(this.f8459);
            } else {
                c9762.setNavigationContentDescription(this.f8457);
            }
        }
    }

    @Override // l.InterfaceC0504
    public final void setVisibility(int i) {
        this.f8452.setVisibility(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8435(InterfaceC17585 interfaceC17585, InterfaceC19994 interfaceC19994) {
        this.f8452.setMenuCallbacks(interfaceC17585, interfaceC19994);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Menu m8436() {
        return this.f8452.getMenu();
    }
}
