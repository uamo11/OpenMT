package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: R1K2 */
/* renamed from: l.ܺ᩸, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16194 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f49869;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f49870;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f49871;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49872;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49873;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38126(Context context, AttributeSet attributeSet) {
        int[] iArr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69982);
        this.f49870 = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f49869 = obtainStyledAttributes.getFloat(index, this.f49869);
            } else if (index == 0) {
                this.f49872 = obtainStyledAttributes.getInt(index, this.f49872);
                iArr = C4201.f13667;
                this.f49872 = iArr[this.f49872];
            } else if (index == 4) {
                this.f49873 = obtainStyledAttributes.getInt(index, this.f49873);
            } else if (index == 3) {
                this.f49871 = obtainStyledAttributes.getFloat(index, this.f49871);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
