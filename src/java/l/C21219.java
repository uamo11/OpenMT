package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* compiled from: H1BK */
/* renamed from: l.᩸֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21219 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f68377;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f68377 = sparseIntArray;
        sparseIntArray.append(13, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(14, 3);
        sparseIntArray.append(10, 4);
        sparseIntArray.append(18, 5);
        sparseIntArray.append(17, 6);
        sparseIntArray.append(16, 7);
        sparseIntArray.append(19, 8);
        sparseIntArray.append(0, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(5, 11);
        sparseIntArray.append(6, 12);
        sparseIntArray.append(7, 13);
        sparseIntArray.append(15, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(1, 17);
        sparseIntArray.append(2, 18);
        sparseIntArray.append(8, 19);
        sparseIntArray.append(12, 20);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48170(C21924 c21924, TypedArray typedArray) {
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        int i3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int indexCount = typedArray.getIndexCount();
        for (int i4 = 0; i4 < indexCount; i4++) {
            int index = typedArray.getIndex(i4);
            SparseIntArray sparseIntArray = f68377;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c21924.f15713);
                        c21924.f15713 = resourceId;
                        if (resourceId == -1) {
                            c21924.f15714 = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c21924.f15714 = typedArray.getString(index);
                        break;
                    } else {
                        c21924.f15713 = typedArray.getResourceId(index, c21924.f15713);
                        break;
                    }
                case 2:
                    c21924.f15712 = typedArray.getInt(index, c21924.f15712);
                    break;
                case 3:
                    typedArray.getString(index);
                    break;
                case 4:
                    i = c21924.f70195;
                    c21924.f70195 = typedArray.getInteger(index, i);
                    break;
                case 5:
                    i2 = c21924.f70192;
                    c21924.f70192 = typedArray.getInt(index, i2);
                    break;
                case 6:
                    f = c21924.f70187;
                    c21924.f70187 = typedArray.getFloat(index, f);
                    break;
                case 7:
                    if (typedArray.peekValue(index).type == 5) {
                        f3 = c21924.f70190;
                        c21924.f70190 = typedArray.getDimension(index, f3);
                        break;
                    } else {
                        f2 = c21924.f70190;
                        c21924.f70190 = typedArray.getFloat(index, f2);
                        break;
                    }
                case 8:
                    i3 = c21924.f70196;
                    c21924.f70196 = typedArray.getInt(index, i3);
                    break;
                case 9:
                    f4 = c21924.f70198;
                    c21924.f70198 = typedArray.getFloat(index, f4);
                    break;
                case 10:
                    f5 = c21924.f70202;
                    c21924.f70202 = typedArray.getDimension(index, f5);
                    break;
                case 11:
                    f6 = c21924.f70201;
                    c21924.f70201 = typedArray.getFloat(index, f6);
                    break;
                case 12:
                    f7 = c21924.f70194;
                    c21924.f70194 = typedArray.getFloat(index, f7);
                    break;
                case 13:
                    f8 = c21924.f70193;
                    c21924.f70193 = typedArray.getFloat(index, f8);
                    break;
                case 14:
                    f9 = c21924.f70189;
                    c21924.f70189 = typedArray.getFloat(index, f9);
                    break;
                case 15:
                    f10 = c21924.f70197;
                    c21924.f70197 = typedArray.getFloat(index, f10);
                    break;
                case 16:
                    f11 = c21924.f70188;
                    c21924.f70188 = typedArray.getFloat(index, f11);
                    break;
                case 17:
                    f12 = c21924.f70199;
                    c21924.f70199 = typedArray.getDimension(index, f12);
                    break;
                case 18:
                    f13 = c21924.f70200;
                    c21924.f70200 = typedArray.getDimension(index, f13);
                    break;
                case 19:
                    f14 = c21924.f70186;
                    c21924.f70186 = typedArray.getDimension(index, f14);
                    break;
                case 20:
                    f15 = c21924.f70191;
                    c21924.f70191 = typedArray.getFloat(index, f15);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
