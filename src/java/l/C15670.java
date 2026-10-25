package l;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: 192I */
/* renamed from: l.ܺۗܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15670 implements TextWatcher {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnClickListenerC3677 f48236;

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C15670(DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677) {
        this.f48236 = dialogInterfaceOnClickListenerC3677;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        C10539 c10539;
        boolean z2;
        DialogInterfaceC0206 dialogInterfaceC0206;
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = this.f48236;
        z = dialogInterfaceOnClickListenerC3677.f11612;
        if (z) {
            return;
        }
        String obj = editable.toString();
        if (C9896.m24997(obj)) {
            int m25001 = C9896.m25001(obj);
            c10539 = dialogInterfaceOnClickListenerC3677.f11619;
            c10539.m26466(m25001);
            dialogInterfaceOnClickListenerC3677.m11190(m25001, false);
            z2 = dialogInterfaceOnClickListenerC3677.f11621;
            if (z2) {
                dialogInterfaceC0206 = dialogInterfaceOnClickListenerC3677.f11613;
                dialogInterfaceOnClickListenerC3677.f11621 = false;
                dialogInterfaceC0206.m1441(false);
            }
        }
    }
}
