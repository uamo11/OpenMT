package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: I4IH */
/* renamed from: l.۠ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C7999 extends LinearLayout implements InterfaceC23935, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public ImageView f24689;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ImageView f24690;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24691;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5882 f24692;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Drawable f24693;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f24694;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f24695;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f24696;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ImageView f24697;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f24698;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public TextView f24699;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public Context f24700;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public TextView f24701;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinearLayout f24702;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Drawable f24703;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public CheckBox f24704;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public RadioButton f24705;

    @Override // l.InterfaceC23935
    public final boolean prefersCondensedTitle() {
        return false;
    }

    public C7999(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.MT_Protector_res_0x7f0402fd);
    }

    public C7999(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C22733 m50796 = C22733.m50796(getContext(), attributeSet, C3390.f10704, i, 0);
        this.f24703 = m50796.m50815(5);
        this.f24695 = m50796.m50806(1, -1);
        this.f24696 = m50796.m50801(7, false);
        this.f24700 = context;
        this.f24693 = m50796.m50815(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.MT_Protector_res_0x7f0401b1, 0);
        this.f24698 = obtainStyledAttributes.hasValue(0);
        m50796.m50813();
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f24703);
        TextView textView = (TextView) findViewById(R.id.MT_Protector_res_0x7f0a0631);
        this.f24701 = textView;
        int i = this.f24695;
        if (i != -1) {
            textView.setTextAppearance(this.f24700, i);
        }
        this.f24699 = (TextView) findViewById(R.id.MT_Protector_res_0x7f0a051f);
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector_res_0x7f0a0571);
        this.f24689 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f24693);
        }
        this.f24690 = (ImageView) findViewById(R.id.MT_Protector_res_0x7f0a023c);
        this.f24702 = (LinearLayout) findViewById(R.id.MT_Protector_res_0x7f0a010f);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    @Override // l.InterfaceC23935
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initialize(l.C5882 r6, int r7) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7999.initialize(l.ۛۜ, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21312() {
        this.f24691 = true;
        this.f24696 = true;
    }

    @Override // l.InterfaceC23935
    public final C5882 getItemData() {
        return this.f24692;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f24697 != null && this.f24696) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f24697.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21313(boolean z) {
        ImageView imageView = this.f24690;
        if (imageView != null) {
            imageView.setVisibility((this.f24698 || !z) ? 8 : 0);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f24690;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24690.getLayoutParams();
        rect.top = this.f24690.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }
}
