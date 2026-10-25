package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: X8SG */
/* renamed from: l.֨֨֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0780 extends AbstractC14891 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2884;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f2885;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2886;

    public C0780(int i, long j) {
        super(i);
        this.f2885 = j;
        this.f2886 = new ArrayList();
        this.f2884 = new ArrayList();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7836 m2975(int i) {
        ArrayList arrayList = this.f2886;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C7836 c7836 = (C7836) arrayList.get(i2);
            if (c7836.f45441 == i) {
                return c7836;
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0780 m2974(int i) {
        ArrayList arrayList = this.f2884;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0780 c0780 = (C0780) arrayList.get(i2);
            if (c0780.f45441 == i) {
                return c0780;
            }
        }
        return null;
    }

    @Override // l.AbstractC14891
    public final String toString() {
        return AbstractC14891.m35327(this.f45441) + " leaves: " + Arrays.toString(this.f2886.toArray()) + " containers: " + Arrays.toString(this.f2884.toArray());
    }
}
