package l;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: A9BS */
/* renamed from: l.᩷ۨ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20845 extends C15904 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View f67487;

    public C20845(View view) {
        this.f67487 = view;
    }

    /* renamed from: ۧ */
    public void mo22868() {
        View view;
        View view2 = this.f67487;
        if (view2 == null) {
            return;
        }
        if (view2.isInEditMode() || view2.onCheckIsTextEditor()) {
            view2.requestFocus();
            view = view2;
        } else {
            view = view2.getRootView().findFocus();
        }
        if (view == null) {
            view = view2.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new RunnableC19781(2, view));
    }

    /* renamed from: ֫ */
    public void mo22867() {
        View view = this.f67487;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
