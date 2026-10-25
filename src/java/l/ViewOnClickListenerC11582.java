package l;

import android.view.View;
import android.widget.EditText;

/* compiled from: 097X */
/* renamed from: l.ۨ۠ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC11582 implements View.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f34528;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EditText f34529;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34530;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7309 f34531;

    public /* synthetic */ ViewOnClickListenerC11582(C7309 c7309, EditText editText, EditText editText2, int i) {
        this.f34530 = i;
        this.f34531 = c7309;
        this.f34529 = editText;
        this.f34528 = editText2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f34530) {
            case 0:
                C7309 c7309 = this.f34531;
                c7309.m19594();
                C2079.m6836(c7309.f22440, c7309.f22438, this.f34529, this.f34528);
                break;
            default:
                C7309 c73092 = this.f34531;
                c73092.m19594();
                C2079.m6836(c73092.f22440, c73092.f22438, this.f34529, this.f34528);
                break;
        }
    }
}
