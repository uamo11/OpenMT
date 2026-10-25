package l;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;

/* compiled from: A513 */
/* renamed from: l.᩹ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC21987 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f70393;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ListView f70394;

    public ViewTreeObserverOnPreDrawListenerC21987(ListView listView, View view) {
        this.f70394 = listView;
        this.f70393 = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean m45703;
        View view = this.f70393;
        ListView listView = this.f70394;
        m45703 = C19871.m45703(listView, view);
        if (!m45703) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = listView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
