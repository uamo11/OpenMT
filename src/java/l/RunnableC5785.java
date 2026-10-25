package l;

import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: G90S */
/* renamed from: l.ۛۗۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC5785 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17805;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f17806;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1839 f17807;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13545 f17808;

    public RunnableC5785(C1839 c1839, int i, int i2, C13545 c13545) {
        this.f17807 = c1839;
        this.f17806 = i;
        this.f17805 = i2;
        this.f17808 = c13545;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC7196 interfaceC7196;
        ArrayList arrayList;
        C1839 c1839 = this.f17807;
        interfaceC7196 = c1839.f6285;
        if (interfaceC7196 != null) {
            arrayList = c1839.f6284;
            int i = this.f17806;
            arrayList.remove(i);
            c1839.m6112(i, this.f17805, this.f17808);
            C18067 c18067 = (C18067) interfaceC7196;
            TextView textView = c18067.f56284;
            Runnable runnable = c18067.f56283;
            textView.removeCallbacks(runnable);
            textView.post(runnable);
        }
    }
}
