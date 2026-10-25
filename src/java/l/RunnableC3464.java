package l;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: E5OI */
/* renamed from: l.ۗ᩶ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC3464 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7697 f10973;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f10974;

    public RunnableC3464(C7697 c7697, ArrayList arrayList) {
        this.f10973 = c7697;
        this.f10974 = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f10974;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C7697 c7697 = this.f10973;
            if (hasNext) {
                AbstractC3255 abstractC3255 = (AbstractC3255) it.next();
                c7697.getClass();
                View view = abstractC3255.itemView;
                ViewPropertyAnimator animate = view.animate();
                c7697.f23772.add(abstractC3255);
                animate.alpha(1.0f).setDuration(c7697.m50788()).setListener(new C12636(view, animate, c7697, abstractC3255)).start();
            } else {
                arrayList.clear();
                c7697.f23778.remove(arrayList);
                return;
            }
        }
    }
}
