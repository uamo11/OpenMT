package l;

import android.view.View;
import java.util.ArrayList;

/* compiled from: 715M */
/* renamed from: l.᩹ᩴܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22473 extends AbstractC12014 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5561 f72777;

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return view == obj;
    }

    public C22473(C5561 c5561) {
        this.f72777 = c5561;
    }

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final CharSequence mo11912(int i) {
        ArrayList arrayList;
        try {
            arrayList = this.f72777.f17223;
            return ((C23178) arrayList.get(i)).m51414();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        ArrayList arrayList;
        arrayList = this.f72777.f17223;
        C13132 c13132 = ((C23178) arrayList.get(i)).f74506;
        c0452.addView(c13132);
        return c13132;
    }

    @Override // l.AbstractC12014
    /* renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        c0452.removeView((View) obj);
    }

    @Override // l.AbstractC12014
    /* renamed from: ۧ */
    public final int mo11916() {
        ArrayList arrayList;
        arrayList = this.f72777.f17223;
        return arrayList.size();
    }
}
