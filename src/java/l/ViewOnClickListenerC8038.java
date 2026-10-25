package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Stack;

/* compiled from: O1JS */
/* renamed from: l.۠۟᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC8038 extends AbstractC3255 implements View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5921 f24776;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f24777;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C19287 f24778;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f24779;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C5175 f24780;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC8038(C5921 c5921, View view) {
        super(view);
        this.f24776 = c5921;
        this.f24777 = (TextView) view.findViewById(R.id.textView);
        C19890.m45744(view);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C19452 c19452;
        C19452 c194522;
        Stack stack;
        C19452 c194523;
        C5921 c5921 = this.f24776;
        c19452 = c5921.f18162;
        if (c19452 != null) {
            c194523 = c5921.f18162;
            if (!c194523.m44838(this.f24780.f16180)) {
                return;
            }
        }
        if (C13876.f41361.m22793()) {
            return;
        }
        ((ActivityC17169) c5921.requireActivity()).m40354(this.f24780.f16180, this.f24778);
        c194522 = c5921.f18162;
        c194522.m44818(this.f24780.f16180);
        stack = c5921.f18158;
        if (((C0941) stack.peek()).f3565.add(this.f24780.f16180 + " " + this.f24779)) {
            C4925.m14316(new Runnable() { // from class: l.֨۟᩷
                @Override // java.lang.Runnable
                public final void run() {
                    C10155 c10155;
                    ViewOnClickListenerC8038 viewOnClickListenerC8038 = ViewOnClickListenerC8038.this;
                    C5921 c59212 = viewOnClickListenerC8038.f24776;
                    c10155 = c59212.f18161;
                    c10155.notifyItemChanged(viewOnClickListenerC8038.getAdapterPosition());
                    c59212.m16600();
                }
            }, 200L);
        }
    }
}
