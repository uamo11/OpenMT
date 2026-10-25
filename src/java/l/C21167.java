package l;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* compiled from: J63W */
/* renamed from: l.᩷᩹ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21167 extends AbstractC3255 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f68223;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SparseArray f68224;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f68225;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ColorStateList f68226;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f68227;

    public C21167(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f68224 = sparseArray;
        TextView textView = (TextView) view.findViewById(R.id.title);
        sparseArray.put(R.id.title, textView);
        sparseArray.put(R.id.summary, view.findViewById(R.id.summary));
        sparseArray.put(R.id.icon, view.findViewById(R.id.icon));
        sparseArray.put(bin.mt.plus.R.id.MT_Protector_res_0x7f0a027f, view.findViewById(bin.mt.plus.R.id.MT_Protector_res_0x7f0a027f));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        this.f68223 = view.getBackground();
        if (textView != null) {
            this.f68226 = textView.getTextColors();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m48107(int i) {
        SparseArray sparseArray = this.f68224;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.itemView.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48106() {
        return this.f68225;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48105(boolean z) {
        this.f68225 = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48109() {
        return this.f68227;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48108(boolean z) {
        this.f68227 = z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48110() {
        ColorStateList colorStateList;
        Drawable background = this.itemView.getBackground();
        Drawable drawable = this.f68223;
        if (background != drawable) {
            View view = this.itemView;
            int i = C17648.f53953;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) m48107(R.id.title);
        if (textView == null || (colorStateList = this.f68226) == null || textView.getTextColors().equals(colorStateList)) {
            return;
        }
        textView.setTextColor(colorStateList);
    }
}
