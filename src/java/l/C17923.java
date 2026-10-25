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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* compiled from: 27KL */
/* renamed from: l.ᩳ۠ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17923 extends AbstractC4311 {

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f54739 = 0;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f54740;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f54741;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C21696 f54742;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f54743;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ViewGroup f54744;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21696 f54745;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final LinearLayout f54746;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ImageView f54747;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17923(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17923(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f54746 = linearLayout;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i2 = (int) (getContext().getResources().getDisplayMetrics().density * 24);
        setPadding(i2, 0, i2, 0);
        setClipToPadding(false);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        addView(linearLayout);
        float m12954 = m12954(2.0f);
        this.f54743 = m12954;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.MT_Protector_res_0x7f04011a, typedValue, true);
        int i3 = typedValue.data;
        this.f54741 = i3;
        this.f54740 = i3;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C14857.f45328);
            C11233.m27803(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int color = obtainStyledAttributes.getColor(1, i3);
            this.f54741 = color;
            this.f54740 = obtainStyledAttributes.getColor(5, color);
            this.f54743 = obtainStyledAttributes.getDimension(6, m12954);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m12957(0, 5);
            addView(m41930(false));
        }
        InterfaceC21950 m12969 = m12969();
        if (m12969 == null || !((C20746) m12969).m47383()) {
            View view = this.f54747;
            if (view != null && indexOfChild(view) != -1) {
                removeView(this.f54747);
            }
            ViewGroup m41930 = m41930(false);
            this.f54744 = m41930;
            this.f54747 = (ImageView) m41930.findViewById(R.id.MT_Protector_res_0x7f0a0697);
            addView(this.f54744);
            this.f54742 = new C21696(this.f54744, AbstractC1234.f4411);
            C22401 c22401 = new C22401(0.0f);
            c22401.m50264(1.0f);
            c22401.m50267(300.0f);
            C21696 c21696 = this.f54742;
            C11233.m27799(c21696);
            c21696.m48968(c22401);
            this.f54745 = new C21696(this.f54744, new C16511(this));
            C22401 c224012 = new C22401(0.0f);
            c224012.m50264(1.0f);
            c224012.m50267(300.0f);
            C21696 c216962 = this.f54745;
            C11233.m27799(c216962);
            c216962.m48968(c224012);
        }
    }

    @Override // l.AbstractC4311
    /* renamed from: ֫ */
    public final void mo12956(final int i) {
        ViewGroup m41930 = m41930(true);
        m41930.setOnClickListener(new View.OnClickListener() { // from class: l.֫۠ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C17923.f54739;
                C17923 c17923 = C17923.this;
                if (c17923.m12963()) {
                    InterfaceC21950 m12969 = c17923.m12969();
                    int m47379 = m12969 != null ? ((C20746) m12969).m47379() : 0;
                    int i3 = i;
                    if (i3 < m47379) {
                        InterfaceC21950 m129692 = c17923.m12969();
                        C11233.m27799(m129692);
                        ((C20746) m129692).m47380(i3);
                    }
                }
            }
        });
        View findViewById = m41930.findViewById(R.id.MT_Protector_res_0x7f0a0697);
        C11233.m27800((Object) findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        this.f13900.add((ImageView) findViewById);
        this.f54746.addView(m41930);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final ViewGroup m41930(boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector_res_0x7f0d01ed, (ViewGroup) this, false);
        C11233.m27800((Object) inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        viewGroup.setLayoutDirection(0);
        View findViewById = viewGroup.findViewById(R.id.MT_Protector_res_0x7f0a0697);
        findViewById.setBackgroundResource(z ? R.drawable.MT_Protector_res_0x7f0802ea : R.drawable.MT_Protector_res_0x7f0802e9);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int m12966 = (int) m12966();
        layoutParams2.height = m12966;
        layoutParams2.width = m12966;
        layoutParams2.addRule(15, -1);
        layoutParams2.setMargins((int) m12964(), 0, (int) m12964(), 0);
        m41932(findViewById, z);
        return viewGroup;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m41932(View view, boolean z) {
        Drawable background = view.getBackground();
        C11233.m27800((Object) background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (z) {
            gradientDrawable.setStroke((int) this.f54743, this.f54740);
        } else {
            gradientDrawable.setColor(this.f54741);
        }
        gradientDrawable.setCornerRadius(m12967());
    }

    @Override // l.AbstractC4311
    /* renamed from: ۧ */
    public final void mo12962(int i) {
        Object obj = this.f13900.get(i);
        C11233.m27803(obj, "get(...)");
        m41932((View) obj, true);
    }

    @Override // l.AbstractC4311
    /* renamed from: ۡ */
    public final void mo12960() {
        LinearLayout linearLayout = this.f54746;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C18473.m42953(this.f13900, 1);
    }

    @Override // l.AbstractC4311
    /* renamed from: ֫ */
    public final AbstractC11367 mo12955() {
        return new C10868(this);
    }

    @Override // l.AbstractC4311
    /* renamed from: ۜ */
    public final EnumC19834 mo12959() {
        return EnumC19834.f64070;
    }
}
