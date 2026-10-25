package l;

import android.widget.EditText;
import bin.mt.plus.R;

/* compiled from: 4AWI */
/* renamed from: l.ۖܳܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2595 extends AbstractC15252 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4006 f8206;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2595(C4006 c4006, AbstractActivityC3346 abstractActivityC3346) {
        super(abstractActivityC3346);
        this.f8206 = c4006;
    }

    @Override // l.AbstractC15252
    /* renamed from: ܽ */
    public final boolean mo4060() {
        EditText m36254;
        int parseInt;
        try {
            parseInt = Integer.parseInt(m36254(0).getText().toString());
        } catch (NumberFormatException unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
            m36254 = m36254(0);
        }
        try {
            int parseInt2 = Integer.parseInt(m36254(1).getText().toString());
            int i = C8239.f25366;
            if (parseInt < 1) {
                parseInt = 1;
            }
            if (parseInt2 < parseInt) {
                parseInt2 = parseInt;
            }
            ApplicationC20075.f65008.edit().mo25853(parseInt, "text_function_min_line").mo25853(parseInt2, "text_function_max_line").apply();
            C8239.m21823();
            this.f8206.m12067();
            return true;
        } catch (NumberFormatException unused2) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
            m36254 = m36254(1);
            m36254.setSelection(0, m36254.length());
            m36254.requestFocus();
            return false;
        }
    }
}
