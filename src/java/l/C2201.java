package l;

import android.widget.CheckBox;
import bin.mt.plus.R;

/* compiled from: Z17V */
/* renamed from: l.ۖ֨ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2201 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3612 f7230;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2201(C3612 c3612, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346, -1);
        this.f7230 = c3612;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        boolean[] zArr;
        CheckBox[] checkBoxArr;
        try {
            boolean[] m27181 = C10881.m27181(Integer.parseInt(m31260(), 8));
            int i = 0;
            while (true) {
                C3612 c3612 = this.f7230;
                if (i < 12) {
                    zArr = c3612.f11451;
                    zArr[i] = m27181[i];
                    checkBoxArr = c3612.f11452;
                    checkBoxArr[i].setChecked(m27181[i]);
                    i++;
                } else {
                    c3612.m11078();
                    m31262();
                    return;
                }
            }
        } catch (NumberFormatException unused) {
            m31263(R.string.MT_Protector_res_0x7f120b48);
        }
    }
}
