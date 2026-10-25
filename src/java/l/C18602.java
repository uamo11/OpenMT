package l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* compiled from: 57RA */
/* renamed from: l.ᩴۜ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18602 implements PluginDialog {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11546 f57698;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f57699;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C17190 f57700;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C17190 f57701;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17979 f57702;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C17190 f57703;

    public C18602(C17979 c17979) {
        this.f57702 = c17979;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43140(DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f57699 = dialogInterfaceC0206;
        C8960.m23097(dialogInterfaceC0206);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginUI getPluginUI() {
        return this.f57702;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void show() {
        this.f57699.m1449();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void dismiss() {
        this.f57699.dismiss();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void cancel() {
        this.f57699.cancel();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private PluginViewGroup m43138(Button button) {
        if (this.f57698 == null) {
            C11546 c11546 = new C11546(this.f57702, null);
            c11546.f22448 = (ViewGroup) button.getParent();
            this.f57698 = c11546;
        }
        return this.f57698;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getPositiveButton() {
        if (this.f57700 != null) {
            return this.f57700;
        }
        Button m1447 = this.f57699.m1447();
        if (m1447 == null) {
            return null;
        }
        synchronized (this.f57699) {
            if (this.f57700 != null) {
                return this.f57700;
            }
            C17190 c17190 = new C17190(this.f57702, m43138(m1447), PluginButton.Style.DEFAULT);
            c17190.f22448 = m1447;
            this.f57700 = c17190;
            return c17190;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getNegativeButton() {
        if (this.f57701 != null) {
            return this.f57701;
        }
        Button m1446 = this.f57699.m1446();
        if (m1446 == null) {
            return null;
        }
        synchronized (this.f57699) {
            if (this.f57701 != null) {
                return this.f57701;
            }
            C17190 c17190 = new C17190(this.f57702, m43138(m1446), PluginButton.Style.DEFAULT);
            c17190.f22448 = m1446;
            this.f57701 = c17190;
            return c17190;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final PluginButton getNeutralButton() {
        if (this.f57703 != null) {
            return this.f57703;
        }
        Button m1448 = this.f57699.m1448();
        if (m1448 == null) {
            return null;
        }
        synchronized (this.f57699) {
            if (this.f57703 != null) {
                return this.f57703;
            }
            C17190 c17190 = new C17190(this.f57702, m43138(m1448), PluginButton.Style.DEFAULT);
            c17190.f22448 = m1448;
            this.f57703 = c17190;
            return c17190;
        }
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setPositiveButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f57699.m1434(-1, m43139(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC5209(1, this, onClickListener));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setNegativeButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f57699.m1434(-2, m43139(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.᩷ۜ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C18602 c18602 = C18602.this;
                c18602.getClass();
                onClickListener.onClick(c18602, i);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f57699.m1434(-3, m43139(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC3785(0, this, onClickListener));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final boolean isShowing() {
        return this.f57699.m1442();
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setView(PluginView pluginView) {
        this.f57699.m1439((ViewGroup) m43137(pluginView));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ScrollView m43137(PluginView pluginView) {
        View view = ((C7312) pluginView).f22448;
        ScrollView scrollView = new ScrollView(view.getContext());
        scrollView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        scrollView.addView(view);
        return scrollView;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m43139(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C7416.m19937(1, str) == '}' && (stringNullable = this.f57702.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setTitle(CharSequence charSequence) {
        this.f57699.m1444(m43139(charSequence));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setMessage(CharSequence charSequence) {
        this.f57699.m1440(m43139(charSequence));
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setCancelable(boolean z) {
        this.f57699.m1441(z);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f57699.m1435(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.ۢۜ᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C18602 c18602 = C18602.this;
                c18602.getClass();
                onCancelListener.onCancel(c18602);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnDismissListener(final PluginDialog.OnDismissListener onDismissListener) {
        this.f57699.m1436(onDismissListener == null ? null : new DialogInterface.OnDismissListener() { // from class: l.ܺۜ᩷
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C18602 c18602 = C18602.this;
                c18602.getClass();
                onDismissListener.onDismiss(c18602);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f57699.m1438(onShowListener == null ? null : new DialogInterface.OnShowListener() { // from class: l.ۖۜ᩷
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                C18602 c18602 = C18602.this;
                c18602.getClass();
                onShowListener.onShow(c18602);
            }
        });
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog
    public final void setOnKeyListener(final PluginDialog.OnKeyListener onKeyListener) {
        this.f57699.m1437(onKeyListener == null ? null : new DialogInterface.OnKeyListener() { // from class: l.ۡۜ᩷
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                C18602 c18602 = C18602.this;
                c18602.getClass();
                return onKeyListener.onKey(c18602, i, keyEvent);
            }
        });
    }
}
