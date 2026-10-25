package l;

import android.os.Build;
import bin.mt.plus.R;

/* compiled from: 22BV */
/* renamed from: l.᩸ۧ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21549 extends AbstractC10128 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16773 f69246;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21549(C16773 c16773) {
        super(R.string.MT_Protector_res_0x7f12011b, R.drawable.MT_Protector_res_0x7f080239);
        this.f69246 = c16773;
    }

    @Override // l.AbstractC10128
    /* renamed from: ֫ */
    public final void mo5346(C16560 c16560) {
        this.f69246.m39496(c16560, m25407());
    }

    @Override // l.AbstractC10128
    /* renamed from: ܳ */
    public final boolean mo9841() {
        if (Build.VERSION.SDK_INT == 33 && C11083.m27510() && !C16999.m39883() && !C16999.m39886()) {
            AbstractC15440 m39866 = C16999.m39866(this.f69246.m39741(), new String[0]);
            if (m39866 instanceof C12993) {
                String m31565 = m39866.mo31566().m31565();
                return m31565.equalsIgnoreCase("Android/data") || m31565.equalsIgnoreCase("Android/obb");
            }
        }
        return false;
    }
}
