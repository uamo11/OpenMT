package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import bin.mt.plugin.api.ui.PluginView;
import bin.mt.plugin.api.ui.dialog.PluginDialog;

/* compiled from: U7QN */
/* renamed from: l.᩸᩷᩷, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21838 implements PluginDialog.Builder {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19258 f69963;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18602 f69964;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17979 f69965;

    public C21838(C17979 c17979, Context context) {
        this.f69965 = c17979;
        this.f69964 = new C18602(c17979);
        int i = DialogInterfaceC0206.f1451;
        this.f69963 = new C19258(context);
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setTitle(CharSequence charSequence) {
        this.f69963.m44436(m49225(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMessage(CharSequence charSequence) {
        this.f69963.m44424(m49225(charSequence));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setPositiveButton(CharSequence charSequence, final PluginDialog.OnClickListener onClickListener) {
        this.f69963.m44441(m49225(charSequence), onClickListener == null ? null : new DialogInterface.OnClickListener() { // from class: l.ۚ᩷᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                onClickListener.onClick(C21838.this.f69964, i);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNegativeButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f69963.m44425(m49225(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC17886(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setNeutralButton(CharSequence charSequence, PluginDialog.OnClickListener onClickListener) {
        this.f69963.m44437(m49225(charSequence), onClickListener == null ? null : new DialogInterfaceOnClickListenerC16474(2, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setCancelable(boolean z) {
        this.f69963.m44428(z);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnCancelListener(final PluginDialog.OnCancelListener onCancelListener) {
        this.f69963.m44419(onCancelListener == null ? null : new DialogInterface.OnCancelListener() { // from class: l.ܶ᩷᩷
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                onCancelListener.onCancel(C21838.this.f69964);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnDismissListener(final PluginDialog.OnDismissListener onDismissListener) {
        this.f69963.m44420(onDismissListener == null ? null : new DialogInterface.OnDismissListener() { // from class: l.᩵᩷᩷
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                onDismissListener.onDismiss(C21838.this.f69964);
            }
        });
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnShowListener(final PluginDialog.OnShowListener onShowListener) {
        this.f69963.m44426(onShowListener == null ? 0 : new DialogInterface.OnShowListener() { // from class: l.֡᩷᩷
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                onShowListener.onShow(C21838.this.f69964);
            }
        });
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setOnKeyListener(final PluginDialog.OnKeyListener onKeyListener) {
        this.f69963.m44427(onKeyListener == null ? 0 : new DialogInterface.OnKeyListener() { // from class: l.֨᩷᩷
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                boolean onKey;
                onKey = onKeyListener.onKey(C21838.this.f69964, i, keyEvent);
                return onKey;
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setItems(CharSequence[] charSequenceArr, PluginDialog.OnClickListener onClickListener) {
        this.f69963.m44430(charSequenceArr, onClickListener == null ? null : new DialogInterfaceOnClickListenerC11543(2, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, final PluginDialog.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        this.f69963.m44431(charSequenceArr, zArr, onMultiChoiceClickListener == null ? null : new DialogInterface.OnMultiChoiceClickListener() { // from class: l.۠᩷᩷
            @Override // android.content.DialogInterface.OnMultiChoiceClickListener
            public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
                onMultiChoiceClickListener.onClick(C21838.this.f69964, i, z);
            }
        });
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, PluginDialog.OnClickListener onClickListener) {
        this.f69963.m44429(charSequenceArr, i, onClickListener == null ? null : new DialogInterfaceOnClickListenerC17851(1, this, onClickListener));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog.Builder setView(PluginView pluginView) {
        this.f69963.m44421(C18602.m43137(pluginView));
        return this;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog create() {
        DialogInterfaceC0206 m44415 = this.f69963.m44415();
        C18602 c18602 = this.f69964;
        c18602.m43140(m44415);
        return c18602;
    }

    @Override // bin.mt.plugin.api.ui.dialog.PluginDialog.Builder
    public final PluginDialog show() {
        DialogInterfaceC0206 m44438 = this.f69963.m44438();
        C18602 c18602 = this.f69964;
        c18602.m43140(m44438);
        return c18602;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m49225(CharSequence charSequence) {
        String stringNullable;
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            if (str.length() >= 3 && str.charAt(0) == '{' && C7416.m19937(1, str) == '}' && (stringNullable = this.f69965.getContext().getStringNullable(str)) != null) {
                return stringNullable;
            }
        }
        return charSequence;
    }
}
