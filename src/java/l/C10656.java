package l;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* compiled from: H1CY */
/* renamed from: l.ۧ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10656 extends AbstractC19123 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public SparseArray f32056;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float[] f32057;

    public C10656() {
        throw null;
    }

    @Override // l.AbstractC19123
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26746(int i) {
        SparseArray sparseArray = this.f32056;
        int size = sparseArray.size();
        int m33297 = ((C13888) sparseArray.valueAt(0)).m33297();
        double[] dArr = new double[size];
        this.f32057 = new float[m33297];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, m33297);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            C13888 c13888 = (C13888) sparseArray.valueAt(i2);
            dArr[i2] = keyAt * 0.01d;
            c13888.m33295(this.f32057);
            int i3 = 0;
            while (true) {
                if (i3 < this.f32057.length) {
                    dArr2[i2][i3] = r6[i3];
                    i3++;
                }
            }
        }
        this.f60268 = AbstractC20513.m46987(i, dArr, dArr2);
    }

    @Override // l.AbstractC19123
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26745(float f, int i) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // l.AbstractC19123
    /* renamed from: ֫ */
    public final void mo5144(float f, View view) {
        this.f60268.mo7170(f, this.f32057);
        ((C13888) this.f32056.valueAt(0)).m33293(view, this.f32057);
    }
}
