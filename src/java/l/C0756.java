package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* compiled from: B1BC */
/* renamed from: l.֨֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0756 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f2812;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2812 = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(7, 4);
        sparseIntArray.append(8, 5);
        sparseIntArray.append(9, 6);
        sparseIntArray.append(1, 19);
        sparseIntArray.append(2, 20);
        sparseIntArray.append(5, 7);
        sparseIntArray.append(17, 8);
        sparseIntArray.append(16, 9);
        sparseIntArray.append(15, 10);
        sparseIntArray.append(13, 12);
        sparseIntArray.append(12, 13);
        sparseIntArray.append(6, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(10, 17);
        sparseIntArray.append(14, 18);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2896(C7812 c7812, TypedArray typedArray) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            SparseIntArray sparseIntArray = f2812;
            switch (sparseIntArray.get(index)) {
                case 1:
                    f = c7812.f24134;
                    c7812.f24134 = typedArray.getFloat(index, f);
                    break;
                case 2:
                    f2 = c7812.f24138;
                    c7812.f24138 = typedArray.getDimension(index, f2);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    f3 = c7812.f24130;
                    c7812.f24130 = typedArray.getFloat(index, f3);
                    break;
                case 5:
                    f4 = c7812.f24133;
                    c7812.f24133 = typedArray.getFloat(index, f4);
                    break;
                case 6:
                    f5 = c7812.f24126;
                    c7812.f24126 = typedArray.getFloat(index, f5);
                    break;
                case 7:
                    f6 = c7812.f24127;
                    c7812.f24127 = typedArray.getFloat(index, f6);
                    break;
                case 8:
                    f7 = c7812.f24136;
                    c7812.f24136 = typedArray.getFloat(index, f7);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c7812.f15713);
                        c7812.f15713 = resourceId;
                        if (resourceId == -1) {
                            c7812.f15714 = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c7812.f15714 = typedArray.getString(index);
                        break;
                    } else {
                        c7812.f15713 = typedArray.getResourceId(index, c7812.f15713);
                        break;
                    }
                case 12:
                    c7812.f15712 = typedArray.getInt(index, c7812.f15712);
                    break;
                case 13:
                    i = c7812.f24132;
                    c7812.f24132 = typedArray.getInteger(index, i);
                    break;
                case 14:
                    f8 = c7812.f24135;
                    c7812.f24135 = typedArray.getFloat(index, f8);
                    break;
                case 15:
                    f9 = c7812.f24124;
                    c7812.f24124 = typedArray.getDimension(index, f9);
                    break;
                case 16:
                    f10 = c7812.f24128;
                    c7812.f24128 = typedArray.getDimension(index, f10);
                    break;
                case 17:
                    f11 = c7812.f24125;
                    c7812.f24125 = typedArray.getDimension(index, f11);
                    break;
                case 18:
                    f12 = c7812.f24131;
                    c7812.f24131 = typedArray.getFloat(index, f12);
                    break;
                case 19:
                    f13 = c7812.f24129;
                    c7812.f24129 = typedArray.getDimension(index, f13);
                    break;
                case 20:
                    f14 = c7812.f24137;
                    c7812.f24137 = typedArray.getDimension(index, f14);
                    break;
            }
        }
    }
}
