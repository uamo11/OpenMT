package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* compiled from: OAHZ */
/* renamed from: l.֨ܳ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1188 extends AbstractC1661 {
    public C1188() {
        super(R.string.MT_Protector_res_0x7f1205f9, R.drawable.MT_Protector_res_0x7f080231);
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916(b.k) && !c2450.m7923();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[LOOP:0: B:16:0x007e->B:18:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1455(final l.C2450 r17) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1188.mo1455(l.ۖۢܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4008(C1188 c1188, C2450 c2450, ArrayList arrayList) {
        int i = 1;
        String[] strArr = (String[]) C5378.stream(arrayList).map(new C18554(i)).toArray(new C0288(1));
        String[] strArr2 = (String[]) C5378.stream(arrayList).map(new C12247(i)).toArray(new C14911(1));
        int i2 = C15104.f46193;
        C0994 c0994 = new C0994(C5422.class);
        c0994.m3486(c2450);
        c0994.m3481(c2450.m7922());
        c0994.m3477("oldNames", strArr);
        c0994.m3477("newNames", strArr2);
        c0994.m3474(MotionUtils.EASING_TYPE_PATH, c2450.m7926());
        c0994.m3469();
    }
}
