package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* compiled from: J1B7 */
/* renamed from: l.ۡۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8664 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f26432;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26432 = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(9, 2);
        sparseIntArray.append(5, 4);
        sparseIntArray.append(6, 5);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(3, 7);
        sparseIntArray.append(15, 8);
        sparseIntArray.append(14, 9);
        sparseIntArray.append(13, 10);
        sparseIntArray.append(11, 12);
        sparseIntArray.append(10, 13);
        sparseIntArray.append(4, 14);
        sparseIntArray.append(1, 15);
        sparseIntArray.append(2, 16);
        sparseIntArray.append(8, 17);
        sparseIntArray.append(12, 18);
        sparseIntArray.append(18, 20);
        sparseIntArray.append(17, 21);
        sparseIntArray.append(19, 19);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22421(C15718 c15718, TypedArray typedArray) {
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
        int i2;
        float f13;
        float f14;
        float f15;
        int indexCount = typedArray.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            SparseIntArray sparseIntArray = f26432;
            switch (sparseIntArray.get(index)) {
                case 1:
                    f = c15718.f48482;
                    c15718.f48482 = typedArray.getFloat(index, f);
                    break;
                case 2:
                    f2 = c15718.f48486;
                    c15718.f48486 = typedArray.getDimension(index, f2);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    f3 = c15718.f48485;
                    c15718.f48485 = typedArray.getFloat(index, f3);
                    break;
                case 5:
                    f4 = c15718.f48479;
                    c15718.f48479 = typedArray.getFloat(index, f4);
                    break;
                case 6:
                    f5 = c15718.f48478;
                    c15718.f48478 = typedArray.getFloat(index, f5);
                    break;
                case 7:
                    f6 = c15718.f48481;
                    c15718.f48481 = typedArray.getFloat(index, f6);
                    break;
                case 8:
                    f7 = c15718.f48474;
                    c15718.f48474 = typedArray.getFloat(index, f7);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c15718.f15713);
                        c15718.f15713 = resourceId;
                        if (resourceId == -1) {
                            c15718.f15714 = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c15718.f15714 = typedArray.getString(index);
                        break;
                    } else {
                        c15718.f15713 = typedArray.getResourceId(index, c15718.f15713);
                        break;
                    }
                case 12:
                    c15718.f15712 = typedArray.getInt(index, c15718.f15712);
                    break;
                case 13:
                    i = c15718.f48480;
                    c15718.f48480 = typedArray.getInteger(index, i);
                    break;
                case 14:
                    f8 = c15718.f48473;
                    c15718.f48473 = typedArray.getFloat(index, f8);
                    break;
                case 15:
                    f9 = c15718.f48483;
                    c15718.f48483 = typedArray.getDimension(index, f9);
                    break;
                case 16:
                    f10 = c15718.f48484;
                    c15718.f48484 = typedArray.getDimension(index, f10);
                    break;
                case 17:
                    f11 = c15718.f48471;
                    c15718.f48471 = typedArray.getDimension(index, f11);
                    break;
                case 18:
                    f12 = c15718.f48476;
                    c15718.f48476 = typedArray.getFloat(index, f12);
                    break;
                case 19:
                    i2 = c15718.f48477;
                    c15718.f48477 = typedArray.getInt(index, i2);
                    break;
                case 20:
                    f13 = c15718.f48472;
                    c15718.f48472 = typedArray.getFloat(index, f13);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type == 5) {
                        f15 = c15718.f48475;
                        c15718.f48475 = typedArray.getDimension(index, f15);
                        break;
                    } else {
                        f14 = c15718.f48475;
                        c15718.f48475 = typedArray.getFloat(index, f14);
                        break;
                    }
            }
        }
    }
}
