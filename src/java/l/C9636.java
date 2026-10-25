package l;

import android.os.Build;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* compiled from: 422Y */
/* renamed from: l.ۢܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9636 extends WindowCallbackC14348 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f29196;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f29197;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C5402 f29198;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f29199;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC1874 f29200;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9636(LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402, Window.Callback callback) {
        super(callback);
        this.f29198 = layoutInflaterFactory2C5402;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24554(InterfaceC1874 interfaceC1874) {
        this.f29200 = interfaceC1874;
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f29199) {
            return m34245().dispatchKeyEvent(keyEvent);
        }
        return this.f29198.m15444(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return super.dispatchKeyShortcutEvent(keyEvent) || this.f29198.m15443(keyEvent.getKeyCode(), keyEvent);
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C3060)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        InterfaceC1874 interfaceC1874 = this.f29200;
        if (interfaceC1874 != null) {
            View view = i == 0 ? new View(((C6107) interfaceC1874).f18725.f35080.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f29197) {
            m34245().onContentChanged();
        }
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C3060 c3060 = menu instanceof C3060 ? (C3060) menu : null;
        if (i == 0 && c3060 == null) {
            return false;
        }
        if (c3060 != null) {
            c3060.setOverrideVisibleItems(true);
        }
        InterfaceC1874 interfaceC1874 = this.f29200;
        if (interfaceC1874 != null) {
            C11752 c11752 = ((C6107) interfaceC1874).f18725;
            if (i == 0 && !c11752.f35087) {
                c11752.f35080.mo2189();
                c11752.f35087 = true;
            }
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (c3060 != null) {
            c3060.setOverrideVisibleItems(false);
        }
        return onPreparePanel;
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        this.f29198.m15469(i);
        return true;
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.f29196) {
            m34245().onPanelClosed(i, menu);
        } else {
            super.onPanelClosed(i, menu);
            this.f29198.m15453(i);
        }
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f29198;
        if (!layoutInflaterFactory2C5402.m15470()) {
            return super.onWindowStartingActionMode(callback);
        }
        C6379 c6379 = new C6379(layoutInflaterFactory2C5402.f16822, callback);
        AbstractC3557 m15433 = layoutInflaterFactory2C5402.m15433(c6379);
        if (m15433 != null) {
            return c6379.m17698(m15433);
        }
        return null;
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f29198;
        if (layoutInflaterFactory2C5402.m15470() && i == 0) {
            C6379 c6379 = new C6379(layoutInflaterFactory2C5402.f16822, callback);
            AbstractC3557 m15433 = layoutInflaterFactory2C5402.m15433(c6379);
            if (m15433 != null) {
                return c6379.m17698(m15433);
            }
            return null;
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    @Override // l.WindowCallbackC14348, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        C3060 c3060 = this.f29198.m15448(0).f63066;
        if (c3060 != null) {
            super.onProvideKeyboardShortcuts(list, c3060, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24552(Window.Callback callback) {
        try {
            this.f29197 = true;
            callback.onContentChanged();
        } finally {
            this.f29197 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24555(Window.Callback callback, KeyEvent keyEvent) {
        try {
            this.f29199 = true;
            return callback.dispatchKeyEvent(keyEvent);
        } finally {
            this.f29199 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24553(Window.Callback callback, int i, Menu menu) {
        try {
            this.f29196 = true;
            callback.onPanelClosed(i, menu);
        } finally {
            this.f29196 = false;
        }
    }
}
