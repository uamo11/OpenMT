package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import bin.mt.plus.R;

/* compiled from: 85PM */
/* renamed from: l.ۧܶۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC11079 extends C2095 {

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public String f33262;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f33263;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public CharSequence f33264;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public Drawable f33265;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public String f33266;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public String f33267;

    public AbstractC11079(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9878.f29908, i, i2);
        String string = obtainStyledAttributes.getString(9);
        string = string == null ? obtainStyledAttributes.getString(0) : string;
        this.f33264 = string;
        if (string == null) {
            this.f33264 = m6909();
        }
        String string2 = obtainStyledAttributes.getString(8);
        this.f33262 = string2 == null ? obtainStyledAttributes.getString(1) : string2;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f33265 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string3 = obtainStyledAttributes.getString(11);
        this.f33266 = string3 == null ? obtainStyledAttributes.getString(3) : string3;
        String string4 = obtainStyledAttributes.getString(10);
        this.f33267 = string4 == null ? obtainStyledAttributes.getString(4) : string4;
        this.f33263 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public AbstractC11079(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public AbstractC11079(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2958.m9017(context, R.attr.MT_Protector_res_0x7f040189, android.R.attr.dialogPreferenceStyle));
    }

    public AbstractC11079(Context context) {
        this(context, null);
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m27491() {
        return this.f33264;
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final String m27489() {
        return this.f33262;
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final Drawable m27488() {
        return this.f33265;
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final String m27487() {
        return this.f33266;
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final String m27486() {
        return this.f33267;
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int m27490() {
        return this.f33263;
    }

    @Override // l.C2095
    /* renamed from: ۛ */
    public void mo6908() {
        m6935().m41270(this);
    }
}
