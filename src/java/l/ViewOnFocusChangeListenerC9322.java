package l;

import android.view.View;
import android.widget.EditText;

/* compiled from: 192I */
/* renamed from: l.ۢۗܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC9322 implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z && (view instanceof EditText)) {
            C4925.m14315(new RunnableC7994(2, (EditText) view));
        }
    }
}
