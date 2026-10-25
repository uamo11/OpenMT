package l;

import android.text.Editable;

/* compiled from: P9S5 */
/* renamed from: l.ᩳۡۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17948 extends AbstractC3253 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23592 f55950;

    public C17948(C23592 c23592) {
        this.f55950 = c23592;
    }

    @Override // l.AbstractC3253, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        InterfaceC17242 interfaceC17242;
        InterfaceC17242 interfaceC172422;
        String obj = editable.toString();
        C23592 c23592 = this.f55950;
        c23592.m52045();
        z = c23592.f76484;
        if (z) {
            return;
        }
        interfaceC17242 = c23592.f76482;
        if (interfaceC17242 != null) {
            interfaceC172422 = c23592.f76482;
            interfaceC172422.mo4107(obj);
        }
    }
}
