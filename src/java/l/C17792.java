package l;

import bin.mt.plus.R;
import java.io.Serializable;

/* compiled from: B6LU */
/* renamed from: l.ᩳۗ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17792 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23436 f54412;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17792(C23436 c23436, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f54412 = c23436;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C23436 c23436 = this.f54412;
        try {
            int m51895 = C23436.m51895(m31260());
            c23436.m6893((Serializable) Integer.valueOf(m51895));
            c23436.m11313().edit().putInt(c23436.m6911(), m51895).apply();
            c23436.m51894(m51895);
            m31262();
        } catch (ArithmeticException | IllegalArgumentException unused) {
            m31263(R.string.MT_Protector_res_0x7f120516);
        }
    }
}
