package l;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: C9QS */
/* renamed from: l.ۗۚ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3039 extends AbstractC1661 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f9575;

    public C3039(boolean z) {
        super(z ? R.string.MT_Protector_res_0x7f1205d0 : R.string.MT_Protector_res_0x7f1205d6, z ? R.drawable.MT_Protector_res_0x7f080254 : R.drawable.MT_Protector_res_0x7f080250);
        this.f9575 = z;
        m5604();
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        return c2450.m7916("payload") && m7919.m39035("local") && !m7919.m39038();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907("payload");
        m7919.m38998("local");
        boolean z = this.f9575;
        int i = z ? R.string.MT_Protector_res_0x7f1205d0 : R.string.MT_Protector_res_0x7f1205d6;
        String m5600 = AbstractC1661.m5600(c2450, i);
        if (z) {
            List m7909 = c2450.m7909();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m5600);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "\n \n");
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(4, true), length, spannableStringBuilder.length(), 33);
            int length2 = spannableStringBuilder.length();
            Iterator it = m7909.iterator();
            long j = 0;
            while (it.hasNext()) {
                j += ((C19143) ((InterfaceC17889) it.next())).m44212();
            }
            spannableStringBuilder.append((CharSequence) C4925.m14306(R.string.MT_Protector_res_0x7f120851, C22927.m51028(j)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length2, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(C11266.m27880(15.0f)), length2, spannableStringBuilder.length(), 33);
            m5600 = spannableStringBuilder;
        }
        m5602(c2450, i, m5600);
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        m7919.m38998("local");
        AbstractC15440 m39866 = C16999.m39866(m7919.m39058(), new String[0]);
        if (!m39866.mo23120() || m39866.mo27924()) {
            List m7909 = c2450.m7909();
            int i = C15104.f46193;
            C0994 c0994 = new C0994(C4450.class);
            c0994.m3478(m7909);
            c0994.m3484(c2450);
            c0994.m3481(c2450.m7922());
            c0994.m3474("targetPath", m7919.m39058());
            c0994.m3469();
            return;
        }
        c2450.m7917().m10221(C4925.m14306(this.f9575 ? R.string.MT_Protector_res_0x7f120852 : R.string.MT_Protector_res_0x7f120b8e, m7919.m39058()), false);
    }
}
