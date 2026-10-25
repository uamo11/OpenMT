package l;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: 192I */
/* renamed from: l.᩷ۗܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC20611 implements View.OnFocusChangeListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66329;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66330;

    public /* synthetic */ ViewOnFocusChangeListenerC20611(int i, Object obj) {
        this.f66329 = i;
        this.f66330 = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f66329) {
            case 0:
                InputMethodManager inputMethodManager = (InputMethodManager) this.f66330;
                if (z) {
                    inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                    break;
                }
                break;
            default:
                C5156.m14733((EditText) this.f66330, z);
                break;
        }
    }
}
