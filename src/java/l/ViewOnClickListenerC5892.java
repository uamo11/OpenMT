package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Stack;

/* compiled from: O1JS */
/* renamed from: l.ۛۜۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC5892 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14772 f18089;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f18090;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19287 f18091;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C5175 f18092;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18093;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC5892(C14772 c14772, View view) {
        super(view);
        this.f18089 = c14772;
        this.f18090 = (TextView) view.findViewById(R.id.textView);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C12366 c12366;
        C12366 c123662;
        Stack stack;
        C12366 c123663;
        C14772 c14772 = this.f18089;
        c12366 = c14772.f45110;
        if (c12366 != null) {
            c123663 = c14772.f45110;
            if (!c123663.m30058(this.f18092.f16180)) {
                return;
            }
        }
        if (C13876.f41361.m22793()) {
            return;
        }
        ((ActivityC17169) c14772.requireActivity()).m40343(this.f18092.f16180, this.f18091);
        c123662 = c14772.f45110;
        c123662.m30026(this.f18092.f16180);
        stack = c14772.f45112;
        if (((C0941) stack.peek()).f3565.add(this.f18092.f16180 + " " + this.f18093)) {
            C4925.m14316(new RunnableC2156(1, this), 200L);
        }
    }
}
