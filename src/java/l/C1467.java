package l;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: O1W7 */
/* renamed from: l.֫֡ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1467 extends C17695 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f5220;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f5221;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f5222;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f5223;

    public C1467(C10640... c10640Arr) {
        int length = c10640Arr.length;
        this.f54157 = length;
        ArrayList arrayList = new ArrayList();
        this.f54156 = arrayList;
        arrayList.addAll(Arrays.asList(c10640Arr));
        this.f54155 = ((AbstractC16283) arrayList.get(length - 1)).m38306();
        this.f5221 = true;
    }

    public final C1467 clone() {
        ArrayList arrayList = this.f54156;
        int size = arrayList.size();
        C10640[] c10640Arr = new C10640[size];
        for (int i = 0; i < size; i++) {
            c10640Arr[i] = (C10640) ((AbstractC16283) arrayList.get(i)).clone();
        }
        return new C1467(c10640Arr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m5019(float f) {
        ArrayList arrayList = this.f54156;
        int i = this.f54157;
        if (i == 2) {
            if (this.f5221) {
                this.f5221 = false;
                this.f5223 = ((C10640) arrayList.get(0)).f32018;
                float f2 = ((C10640) arrayList.get(1)).f32018;
                this.f5220 = f2;
                this.f5222 = f2 - this.f5223;
            }
            Interpolator interpolator = this.f54155;
            if (interpolator != null) {
                f = interpolator.getInterpolation(f);
            }
            InterfaceC21929 interfaceC21929 = this.f54154;
            if (interfaceC21929 == null) {
                return (f * this.f5222) + this.f5223;
            }
            return ((Number) interfaceC21929.mo18064(f, Float.valueOf(this.f5223), Float.valueOf(this.f5220))).floatValue();
        }
        if (f <= 0.0f) {
            C10640 c10640 = (C10640) arrayList.get(0);
            C10640 c106402 = (C10640) arrayList.get(1);
            float f3 = c10640.f32018;
            float f4 = c106402.f32018;
            float f5 = c10640.f50073;
            float f6 = c106402.f50073;
            Interpolator m38306 = c106402.m38306();
            if (m38306 != null) {
                f = m38306.getInterpolation(f);
            }
            float f7 = (f - f5) / (f6 - f5);
            InterfaceC21929 interfaceC219292 = this.f54154;
            return interfaceC219292 == null ? C20382.m46695(f4, f3, f7, f3) : ((Number) interfaceC219292.mo18064(f7, Float.valueOf(f3), Float.valueOf(f4))).floatValue();
        }
        if (f >= 1.0f) {
            C10640 c106403 = (C10640) arrayList.get(i - 2);
            C10640 c106404 = (C10640) arrayList.get(i - 1);
            float f8 = c106403.f32018;
            float f9 = c106404.f32018;
            float f10 = c106403.f50073;
            float f11 = c106404.f50073;
            Interpolator m383062 = c106404.m38306();
            if (m383062 != null) {
                f = m383062.getInterpolation(f);
            }
            float f12 = (f - f10) / (f11 - f10);
            InterfaceC21929 interfaceC219293 = this.f54154;
            return interfaceC219293 == null ? C20382.m46695(f9, f8, f12, f8) : ((Number) interfaceC219293.mo18064(f12, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
        }
        C10640 c106405 = (C10640) arrayList.get(0);
        int i2 = 1;
        while (i2 < i) {
            C10640 c106406 = (C10640) arrayList.get(i2);
            if (f < c106406.f50073) {
                Interpolator m383063 = c106406.m38306();
                if (m383063 != null) {
                    f = m383063.getInterpolation(f);
                }
                float f13 = c106405.f50073;
                float f14 = (f - f13) / (c106406.f50073 - f13);
                float f15 = c106405.f32018;
                float f16 = c106406.f32018;
                InterfaceC21929 interfaceC219294 = this.f54154;
                return interfaceC219294 == null ? C20382.m46695(f16, f15, f14, f15) : ((Number) interfaceC219294.mo18064(f14, Float.valueOf(f15), Float.valueOf(f16))).floatValue();
            }
            i2++;
            c106405 = c106406;
        }
        return ((AbstractC16283) arrayList.get(i - 1)).mo26698().floatValue();
    }
}
