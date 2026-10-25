package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* compiled from: Y7LE */
/* renamed from: l.۟֨ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7133 extends AbstractC4311 {

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21908 = 0;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f21909;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f21910;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public ViewGroup f21911;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f21912;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f21913;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21696 f21914;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f21915;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final LinearLayout f21916;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float f21917;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7133(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7133(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f21916 = linearLayout;
        float m12954 = m12954(24.0f);
        setClipToPadding(false);
        int i2 = (int) m12954;
        setPadding(i2, 0, i2, 0);
        linearLayout.setOrientation(0);
        addView(linearLayout, -2, -2);
        float m129542 = m12954(2.0f);
        this.f21912 = m129542;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector_res_0x7f04011a, typedValue, true);
        int i3 = typedValue.data;
        this.f21913 = i3;
        this.f21909 = i3;
        this.f21915 = 300.0f;
        this.f21910 = 0.5f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14857.f45327);
            C11233.m27803(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = obtainStyledAttributes.getColor(2, i3);
            this.f21913 = color;
            this.f21909 = obtainStyledAttributes.getColor(6, color);
            this.f21915 = obtainStyledAttributes.getFloat(8, 300.0f);
            this.f21910 = obtainStyledAttributes.getFloat(0, 0.5f);
            this.f21912 = obtainStyledAttributes.getDimension(7, m129542);
            obtainStyledAttributes.recycle();
        }
        this.f21917 = m12966();
        if (isInEditMode()) {
            m12957(0, 5);
            addView(m19148(false));
        }
        InterfaceC21950 m12969 = m12969();
        if (m12969 == null || !((C20746) m12969).m47383()) {
            View view = this.f21911;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f21911);
            }
            ViewGroup m19148 = m19148(false);
            this.f21911 = m19148;
            addView(m19148);
            this.f21914 = new C21696(this.f21911, AbstractC1234.f4411);
            C22401 c22401 = new C22401(0.0f);
            c22401.m50264(this.f21910);
            c22401.m50267(this.f21915);
            C21696 c21696 = this.f21914;
            C11233.m27799(c21696);
            c21696.m48968(c22401);
        }
    }

    @Override // l.AbstractC4311
    /* renamed from: ֫ */
    public final void mo12956(final int i) {
        ViewGroup m19148 = m19148(true);
        m19148.setOnClickListener(new View.OnClickListener() { // from class: l.᩺֨ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C7133.f21908;
                C7133 c7133 = C7133.this;
                if (c7133.m12963()) {
                    InterfaceC21950 m12969 = c7133.m12969();
                    int m47379 = m12969 != null ? ((C20746) m12969).m47379() : 0;
                    int i3 = i;
                    if (i3 < m47379) {
                        InterfaceC21950 m129692 = c7133.m12969();
                        C11233.m27799(m129692);
                        ((C20746) m129692).m47380(i3);
                    }
                }
            }
        });
        View findViewById = m19148.findViewById(R.id.MT_Protector_res_0x7f0a055e);
        C11233.m27800((Object) findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f13900.add((ImageView) findViewById);
        this.f21916.addView(m19148);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final ViewGroup m19148(boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector_res_0x7f0d01ca, (ViewGroup) this, false);
        C11233.m27800((Object) inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        viewGroup.setLayoutDirection(0);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.MT_Protector_res_0x7f0a055e);
        imageView.setBackgroundResource(z ? R.drawable.MT_Protector_res_0x7f0802b1 : R.drawable.MT_Protector_res_0x7f0802b0);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int m12966 = (int) (z ? m12966() : this.f21917);
        layoutParams2.height = m12966;
        layoutParams2.width = m12966;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m12964(), 0, (int) m12964(), 0);
        m19150(imageView, z);
        return viewGroup;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m19150(View view, boolean z) {
        Drawable background = view.findViewById(R.id.MT_Protector_res_0x7f0a055e).getBackground();
        C11233.m27800((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f21912, this.f21909);
        } else {
            gradientDrawable.setColor(this.f21913);
        }
        gradientDrawable.setCornerRadius(m12967());
    }

    @Override // l.AbstractC4311
    /* renamed from: ۡ */
    public final void mo12960() {
        LinearLayout linearLayout = this.f21916;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C18473.m42953(this.f13900, 1);
    }

    @Override // l.AbstractC4311
    /* renamed from: ۧ */
    public final void mo12962(int i) {
        Object obj = this.f13900.get(i);
        C11233.m27803(obj, "get(...)");
        m19150((View) obj, true);
    }

    @Override // l.AbstractC4311
    /* renamed from: ֫ */
    public final AbstractC11367 mo12955() {
        return new C13482(this);
    }

    @Override // l.AbstractC4311
    /* renamed from: ۜ */
    public final EnumC19834 mo12959() {
        return EnumC19834.f64072;
    }
}
