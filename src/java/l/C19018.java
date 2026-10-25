package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: 83VR */
/* renamed from: l.ᩴ᩸, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C19018 extends C16900 {

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public float f59915;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public float f59916;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public float f59917;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public float f59918;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public float f59919;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public float f59920;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public float f59921;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public float f59922;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public float f59923;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public float f59924;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public float f59925;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f59926;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public float f59927;

    public C19018() {
        super(-2);
        this.f59919 = 1.0f;
        this.f59926 = false;
        this.f59920 = 0.0f;
        this.f59917 = 0.0f;
        this.f59915 = 0.0f;
        this.f59918 = 0.0f;
        this.f59922 = 1.0f;
        this.f59924 = 1.0f;
        this.f59923 = 0.0f;
        this.f59921 = 0.0f;
        this.f59927 = 0.0f;
        this.f59916 = 0.0f;
        this.f59925 = 0.0f;
    }

    public C19018(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59919 = 1.0f;
        this.f59926 = false;
        this.f59920 = 0.0f;
        this.f59917 = 0.0f;
        this.f59915 = 0.0f;
        this.f59918 = 0.0f;
        this.f59922 = 1.0f;
        this.f59924 = 1.0f;
        this.f59923 = 0.0f;
        this.f59921 = 0.0f;
        this.f59927 = 0.0f;
        this.f59916 = 0.0f;
        this.f59925 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69986);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 15) {
                this.f59919 = obtainStyledAttributes.getFloat(index, this.f59919);
            } else if (index == 28) {
                this.f59920 = obtainStyledAttributes.getFloat(index, this.f59920);
                this.f59926 = true;
            } else if (index == 23) {
                this.f59915 = obtainStyledAttributes.getFloat(index, this.f59915);
            } else if (index == 24) {
                this.f59918 = obtainStyledAttributes.getFloat(index, this.f59918);
            } else if (index == 22) {
                this.f59917 = obtainStyledAttributes.getFloat(index, this.f59917);
            } else if (index == 20) {
                this.f59922 = obtainStyledAttributes.getFloat(index, this.f59922);
            } else if (index == 21) {
                this.f59924 = obtainStyledAttributes.getFloat(index, this.f59924);
            } else if (index == 16) {
                this.f59923 = obtainStyledAttributes.getFloat(index, this.f59923);
            } else if (index == 17) {
                this.f59921 = obtainStyledAttributes.getFloat(index, this.f59921);
            } else if (index == 18) {
                this.f59927 = obtainStyledAttributes.getFloat(index, this.f59927);
            } else if (index == 19) {
                this.f59916 = obtainStyledAttributes.getFloat(index, this.f59916);
            } else if (index == 27) {
                this.f59925 = obtainStyledAttributes.getFloat(index, this.f59925);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
