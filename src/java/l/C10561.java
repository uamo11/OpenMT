package l;

import android.view.inputmethod.InputMethodManager;

/* compiled from: N1TT */
/* renamed from: l.ۤ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10561 extends C5580 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InputMethodManager f31694;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC7738 f31695;

    public C10561(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        this.f31695 = viewOnLayoutChangeListenerC7738;
        this.f31694 = (InputMethodManager) viewOnLayoutChangeListenerC7738.getSystemService("input_method");
    }

    @Override // l.InterfaceC1346
    /* renamed from: ֫ */
    public final void mo4692() {
        C0640 c0640;
        InputMethodManager inputMethodManager = this.f31694;
        if (inputMethodManager != null) {
            c0640 = this.f31695.f23940;
            inputMethodManager.showSoftInput(c0640, 0);
        }
    }

    @Override // l.InterfaceC1346
    /* renamed from: ֫ */
    public final boolean mo4693(int i, C17574 c17574) {
        BinderC11993 binderC11993;
        BinderC11993 binderC119932;
        C0640 c0640;
        if (i != 66) {
            return false;
        }
        ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = this.f31695;
        binderC11993 = viewOnLayoutChangeListenerC7738.f23945;
        if (binderC11993.m29315()) {
            return false;
        }
        binderC119932 = viewOnLayoutChangeListenerC7738.f23945;
        c0640 = viewOnLayoutChangeListenerC7738.f23940;
        if (!binderC119932.m29314(c0640)) {
            return true;
        }
        viewOnLayoutChangeListenerC7738.finish();
        return true;
    }

    @Override // l.InterfaceC1346
    /* renamed from: ۧ */
    public final boolean mo4695(int i, C17574 c17574) {
        BinderC11993 binderC11993;
        BinderC11993 binderC119932;
        C0640 c0640;
        if (i != 109) {
            return false;
        }
        ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = this.f31695;
        binderC11993 = viewOnLayoutChangeListenerC7738.f23945;
        if (binderC11993.m29315()) {
            return false;
        }
        binderC119932 = viewOnLayoutChangeListenerC7738.f23945;
        c0640 = viewOnLayoutChangeListenerC7738.f23940;
        if (!binderC119932.m29314(c0640)) {
            return true;
        }
        viewOnLayoutChangeListenerC7738.finish();
        return true;
    }

    @Override // l.InterfaceC1346
    /* renamed from: ܽ */
    public final boolean mo4696() {
        ViewOnClickListenerC16225 viewOnClickListenerC16225;
        viewOnClickListenerC16225 = this.f31695.f23943;
        return viewOnClickListenerC16225.m38185();
    }

    @Override // l.InterfaceC1346
    /* renamed from: ۧ */
    public final boolean mo4694() {
        ViewOnClickListenerC16225 viewOnClickListenerC16225;
        viewOnClickListenerC16225 = this.f31695.f23943;
        return viewOnClickListenerC16225.m38184();
    }
}
