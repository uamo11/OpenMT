package l;

import android.view.View;
import com.tencent.connect.auth.a;

/* compiled from: 51RR */
/* renamed from: l.᩹۠ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC22156 implements View.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f71905;

    public ViewOnClickListenerC22156(a aVar) {
        this.f71905 = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        C10162 c10162;
        C10162 c101622;
        a aVar = this.f71905;
        aVar.dismiss();
        z = aVar.f872;
        if (z) {
            return;
        }
        c10162 = aVar.f885;
        if (c10162 != null) {
            c101622 = aVar.f885;
            c101622.mo3453();
        }
    }
}
