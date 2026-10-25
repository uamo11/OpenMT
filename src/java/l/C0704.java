package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import bin.mt.plus.R;

/* compiled from: K5ZR */
/* renamed from: l.֡᩹ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C0704 extends AbstractC21872 {

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public String f2674;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public String f2675;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final C19756 f2676;

    public C0704(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.f2676 = new C19756(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29900, i, 0);
        String string = obtainStyledAttributes.getString(7);
        m49259(string == null ? obtainStyledAttributes.getString(0) : string);
        String string2 = obtainStyledAttributes.getString(6);
        m49258(string2 == null ? obtainStyledAttributes.getString(1) : string2);
        String string3 = obtainStyledAttributes.getString(9);
        this.f2674 = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        mo6922();
        String string4 = obtainStyledAttributes.getString(8);
        this.f2675 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        mo6922();
        m49255(obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false)));
        obtainStyledAttributes.recycle();
    }

    public C0704(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector_res_0x7f040488, android.R.attr.switchPreferenceStyle));
    }

    @Override // l.C2095
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2792(C21167 c21167) {
        super.mo2792(c21167);
        m2790(c21167.m48107(android.R.id.switch_widget));
        m49257(c21167.m48107(android.R.id.summary));
    }

    @Override // l.C2095
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2791(View view) {
        super.mo2791(view);
        if (((AccessibilityManager) m6886().getSystemService("accessibility")).isEnabled()) {
            m2790(view.findViewById(android.R.id.switch_widget));
            m49257(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m2790(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f70046);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f2674);
            r4.setTextOff(this.f2675);
            r4.setOnCheckedChangeListener(this.f2676);
        }
    }
}
