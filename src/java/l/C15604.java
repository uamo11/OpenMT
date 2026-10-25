package l;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 28G3 */
/* renamed from: l.ܺ֨ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15604 extends AbstractC19902 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable[] f48063;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String[] f48064;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String[] f48065;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7844 f48066;

    @Override // l.AbstractC19902
    public final long getItemId(int i) {
        return i;
    }

    @Override // l.AbstractC19902
    public final void onBindViewHolder(AbstractC3255 abstractC3255, int i) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        ImageView imageView2;
        TextView textView3;
        C8550 c8550 = (C8550) abstractC3255;
        if (m36788(i)) {
            c8550.itemView.setLayoutParams(new C14543(-1, -2));
        } else {
            c8550.itemView.setLayoutParams(new C14543(0, 0));
        }
        textView = c8550.f26141;
        textView.setText(this.f48064[i]);
        String[] strArr = this.f48065;
        if (strArr[i] == null) {
            textView3 = c8550.f26142;
            textView3.setVisibility(8);
        } else {
            textView2 = c8550.f26142;
            textView2.setText(strArr[i]);
        }
        Drawable[] drawableArr = this.f48063;
        if (drawableArr[i] == null) {
            imageView2 = c8550.f26140;
            imageView2.setVisibility(8);
        } else {
            imageView = c8550.f26140;
            imageView.setImageDrawable(drawableArr[i]);
        }
    }

    public C15604(C7844 c7844, String[] strArr, Drawable[] drawableArr) {
        this.f48066 = c7844;
        this.f48064 = strArr;
        this.f48065 = new String[strArr.length];
        this.f48063 = drawableArr;
    }

    @Override // l.AbstractC19902
    public final AbstractC3255 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7844 c7844 = this.f48066;
        return new C8550(c7844, LayoutInflater.from(c7844.getContext()).inflate(R.layout.MT_Protector_res_0x7f0d0125, viewGroup, false));
    }

    @Override // l.AbstractC19902
    public final int getItemCount() {
        return this.f48064.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36789(int i, String str) {
        this.f48065[i] = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36790() {
        return m36788(1) || m36788(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m36788(int i) {
        InterfaceC1318 interfaceC1318;
        InterfaceC1318 interfaceC13182;
        InterfaceC1318 interfaceC13183;
        InterfaceC1318 interfaceC13184;
        C7844 c7844 = this.f48066;
        interfaceC1318 = c7844.f24265;
        if (interfaceC1318 == null) {
            return false;
        }
        if (i == 0) {
            interfaceC13182 = c7844.f24265;
            return interfaceC13182.mo4589(13);
        }
        if (i != 1) {
            return true;
        }
        interfaceC13183 = c7844.f24265;
        if (interfaceC13183.mo4589(30)) {
            interfaceC13184 = c7844.f24265;
            if (interfaceC13184.mo4589(29)) {
                return true;
            }
        }
        return false;
    }
}
