package l;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* compiled from: K7JY */
/* renamed from: l.ۤ֨ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9956 extends AbstractC4311 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f30061 = 0;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f30062;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArgbEvaluator f30063;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f30064;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f30065;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public LinearLayout f30066;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f30067;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9956(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C11233.m27805(context, d.R);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9956(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C11233.m27805(context, d.R);
        this.f30063 = new ArgbEvaluator();
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f30066 = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f30066;
        if (linearLayout2 == null) {
            C11233.m27804("linearLayout");
            throw null;
        }
        addView(linearLayout2, -2, -2);
        this.f30067 = 2.5f;
        if (attributeSet != null) {
            Context context2 = getContext();
            C11233.m27803(context2, "getContext(...)");
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C14857.f45326, 0, 0);
            this.f30062 = obtainStyledAttributes.getColor(8, -16711681);
            m12961();
            float f = obtainStyledAttributes.getFloat(6, 2.5f);
            this.f30067 = f;
            if (f < 1.0f) {
                this.f30067 = 1.0f;
            }
            this.f30064 = obtainStyledAttributes.getBoolean(7, false);
            this.f30065 = obtainStyledAttributes.getDimension(3, 0.0f);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            m12957(0, 5);
            m12968();
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m25110() {
        return this.f30062;
    }

    @Override // l.AbstractC4311
    /* renamed from: ֫ */
    public final void mo12956(final int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.MT_Protector_res_0x7f0d0116, (ViewGroup) this, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.MT_Protector_res_0x7f0a015e);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        C11233.m27800((Object) layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        inflate.setLayoutDirection(0);
        int m12966 = (int) m12966();
        layoutParams2.height = m12966;
        layoutParams2.width = m12966;
        layoutParams2.setMargins((int) m12964(), 0, (int) m12964(), 0);
        C2900 c2900 = new C2900();
        c2900.setCornerRadius(m12967());
        if (isInEditMode()) {
            c2900.setColor(i == 0 ? this.f30062 : m12965());
        } else {
            InterfaceC21950 m12969 = m12969();
            C11233.m27799(m12969);
            c2900.setColor(((C20746) m12969).m47382() == i ? this.f30062 : m12965());
        }
        imageView.setBackground(c2900);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: l.۬֨ۘ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = C9956.f30061;
                C9956 c9956 = C9956.this;
                if (c9956.m12963()) {
                    InterfaceC21950 m129692 = c9956.m12969();
                    int m47379 = m129692 != null ? ((C20746) m129692).m47379() : 0;
                    int i3 = i;
                    if (i3 < m47379) {
                        InterfaceC21950 m129693 = c9956.m12969();
                        C11233.m27799(m129693);
                        ((C20746) m129693).m47380(i3);
                    }
                }
            }
        });
        int i2 = (int) (this.f30065 * 0.8f);
        inflate.setPadding(i2, inflate.getPaddingTop(), i2, inflate.getPaddingBottom());
        int i3 = (int) (this.f30065 * 2);
        inflate.setPadding(inflate.getPaddingLeft(), i3, inflate.getPaddingRight(), i3);
        this.f13900.add(imageView);
        LinearLayout linearLayout = this.f30066;
        if (linearLayout != null) {
            linearLayout.addView(inflate);
        } else {
            C11233.m27804("linearLayout");
            throw null;
        }
    }

    @Override // l.AbstractC4311
    /* renamed from: ۡ */
    public final void mo12960() {
        LinearLayout linearLayout = this.f30066;
        if (linearLayout == null) {
            C11233.m27804("linearLayout");
            throw null;
        }
        if (linearLayout == null) {
            C11233.m27804("linearLayout");
            throw null;
        }
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        C18473.m42953(this.f13900, 1);
    }

    @Override // l.AbstractC4311
    /* renamed from: ֫ */
    public final AbstractC11367 mo12955() {
        return new C12072(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003b, code lost:
    
        if (r4 < ((l.C20746) r2).m47382()) goto L15;
     */
    @Override // l.AbstractC4311
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo12962(int r4) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f13900
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r1 = "get(...)"
            l.C11233.m27803(r0, r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            boolean r2 = r1 instanceof l.C2900
            if (r2 == 0) goto L18
            l.ۗ֨ۘ r1 = (l.C2900) r1
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L4b
            l.᩹֨ۘ r2 = r3.m12969()
            l.C11233.m27799(r2)
            l.᩷۠ۘ r2 = (l.C20746) r2
            int r2 = r2.m47382()
            if (r4 == r2) goto L46
            boolean r2 = r3.f30064
            if (r2 == 0) goto L3e
            l.᩹֨ۘ r2 = r3.m12969()
            l.C11233.m27799(r2)
            l.᩷۠ۘ r2 = (l.C20746) r2
            int r2 = r2.m47382()
            if (r4 >= r2) goto L3e
            goto L46
        L3e:
            int r4 = r3.m12965()
            r1.setColor(r4)
            goto L4b
        L46:
            int r4 = r3.f30062
            r1.setColor(r4)
        L4b:
            r0.setBackground(r1)
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9956.mo12962(int):void");
    }

    @Override // l.AbstractC4311
    /* renamed from: ۜ */
    public final EnumC19834 mo12959() {
        return EnumC19834.f64073;
    }
}
