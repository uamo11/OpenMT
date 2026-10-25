package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: D6L6 */
/* renamed from: l.ܰ᩻ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14151 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f42704;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f42705;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f42706 = -1;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f42707 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42703 = 1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33761(long j, int i, int i2, boolean z, boolean z2) {
        if (i != 0) {
            this.f42703 = i > 0 ? 1 : -1;
        }
        if (!z && !z2) {
            this.f42707 = 0;
            this.f42706 = j;
            this.f42704 = 0.0f;
        } else if (z2) {
            this.f42707 = 2;
            this.f42706 = j;
            this.f42705 = j;
            this.f42704 = 0.0f;
        } else {
            if (this.f42707 == 0) {
                this.f42707 = 1;
            }
            if (this.f42706 < 0) {
                this.f42706 = j;
            }
            float abs = this.f42704 + Math.abs(i);
            this.f42704 = abs;
            long j2 = j - this.f42706;
            if (j2 >= 40 && i2 > 0) {
                float f = (abs * 1000.0f) / (i2 * j2);
                if (f >= 2.0f) {
                    this.f42707 = 2;
                    this.f42705 = j;
                } else if (f <= 1.0f && j - this.f42705 >= 120) {
                    this.f42707 = 1;
                }
                this.f42704 = 0.0f;
                this.f42706 = j;
            }
        }
        return this.f42707;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33760() {
        return this.f42703;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33762() {
        this.f42706 = -1L;
        this.f42704 = 0.0f;
        this.f42707 = 0;
        this.f42703 = 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m33758(List list, int i, int i2, int i3, int i4) {
        ArrayList arrayList = new ArrayList();
        if (i >= 0 && i2 >= i && i < list.size()) {
            int min = Math.min(i2, list.size() - 1);
            for (int i5 = i; i5 <= min; i5++) {
                arrayList.add((InterfaceC17889) list.get(i5));
            }
            if (i3 != 2) {
                int i6 = min - i;
                int i7 = i6 + 1;
                int i8 = i3 == 0 ? i7 : (i6 + 2) / 2;
                int min2 = i3 == 0 ? (i6 + 2) / 2 : Math.min(2, i7 / 4);
                m33759(arrayList, list, i4 > 0 ? min + 1 : i - 1, i4, i8);
                m33759(arrayList, list, i4 > 0 ? i - 1 : min + 1, -i4, min2);
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33759(ArrayList arrayList, List list, int i, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3 && i >= 0 && i < list.size()) {
            arrayList.add((InterfaceC17889) list.get(i));
            i4++;
            i += i2;
        }
    }
}
