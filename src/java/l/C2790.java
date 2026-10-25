package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: R1K2 */
/* renamed from: l.ۖ᩸, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2790 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f8691;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f8692;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f8693;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f8694;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f8695;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f8696;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f8697;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f8698;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f8699;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f8700;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f8701;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f8702;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f8703;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f8704;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8620(C2790 c2790) {
        this.f8700 = c2790.f8700;
        this.f8702 = c2790.f8702;
        this.f8701 = c2790.f8701;
        this.f8698 = c2790.f8698;
        this.f8704 = c2790.f8704;
        this.f8694 = c2790.f8694;
        this.f8703 = c2790.f8703;
        this.f8696 = c2790.f8696;
        this.f8695 = c2790.f8695;
        this.f8699 = c2790.f8699;
        this.f8693 = c2790.f8693;
        this.f8692 = c2790.f8692;
        this.f8697 = c2790.f8697;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8691 = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8619(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69989);
        this.f8700 = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f8691.get(index)) {
                case 1:
                    this.f8702 = obtainStyledAttributes.getFloat(index, this.f8702);
                    break;
                case 2:
                    this.f8701 = obtainStyledAttributes.getFloat(index, this.f8701);
                    break;
                case 3:
                    this.f8698 = obtainStyledAttributes.getFloat(index, this.f8698);
                    break;
                case 4:
                    this.f8704 = obtainStyledAttributes.getFloat(index, this.f8704);
                    break;
                case 5:
                    this.f8694 = obtainStyledAttributes.getFloat(index, this.f8694);
                    break;
                case 6:
                    this.f8703 = obtainStyledAttributes.getDimension(index, this.f8703);
                    break;
                case 7:
                    this.f8696 = obtainStyledAttributes.getDimension(index, this.f8696);
                    break;
                case 8:
                    this.f8695 = obtainStyledAttributes.getDimension(index, this.f8695);
                    break;
                case 9:
                    this.f8699 = obtainStyledAttributes.getDimension(index, this.f8699);
                    break;
                case 10:
                    this.f8693 = obtainStyledAttributes.getDimension(index, this.f8693);
                    break;
                case 11:
                    this.f8692 = true;
                    this.f8697 = obtainStyledAttributes.getDimension(index, this.f8697);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
