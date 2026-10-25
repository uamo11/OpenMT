package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: E29Y */
/* renamed from: l.᩹ۨܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22266 extends AbstractC20546 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f72238;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f72239;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f72240;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22266(Main main, boolean z, C16560 c16560, C2450 c2450) {
        super(main);
        this.f72239 = z;
        this.f72240 = c16560;
        this.f72238 = c2450;
    }

    @Override // l.AbstractC20546
    /* renamed from: ۘ */
    public final void mo47064() {
        AbstractC15440 abstractC15440;
        EnumC6434 m47071 = m47071();
        long m47065 = m47065();
        if (m47065 == -2) {
            m47075().requestFocus();
            C21374.m48457(R.string.MT_Protector_res_0x7f1200d9);
            return;
        }
        if (m47065 != -1 && m47065 < 65536 && (m47071 == EnumC6434.ZIP || m47071 == EnumC6434.SEVEN_ZIP)) {
            m47075().requestFocus();
            C21374.m48457(R.string.MT_Protector_res_0x7f1200d7);
            return;
        }
        boolean z = this.f72239 && m47066();
        C2450 c2450 = this.f72238;
        String m39020 = z ? this.f72240.m39020() : c2450.m7926();
        if (m47067()) {
            m47060();
            if (m47071 == EnumC6434.ZIP) {
                int i = C15104.f46193;
                C0994 c0994 = new C0994(C16953.class);
                c0994.m3478(c2450.m7909());
                c0994.m3474("outputDir", m39020);
                c0994.m3474("password", m47072());
                c0994.m3470(m47074(), "level");
                c0994.m3475("deleteSources", m47063());
                c0994.m3471(m47065, "splitSize");
                C24009.m52847(c0994, c2450, z);
                return;
            }
            if (m47071 == EnumC6434.SEVEN_ZIP) {
                int i2 = C15104.f46193;
                C0994 c09942 = new C0994(C13093.class);
                c09942.m3478(c2450.m7909());
                c09942.m3474("outputDir", m39020);
                c09942.m3474("password", m47072());
                c09942.m3470(m47069(), "level");
                c09942.m3475("headerEncryption", m47070());
                c09942.m3475("deleteSources", m47063());
                c09942.m3471(m47065, "splitSize");
                C24009.m52847(c09942, c2450, z);
                return;
            }
            int i3 = C15104.f46193;
            C0994 c09943 = new C0994(C22971.class);
            c09943.m3478(c2450.m7909());
            c09943.m3474("outputDir", m39020);
            c09943.m3470(m47071.ordinal(), "format");
            c09943.m3470(m47073(), "level");
            c09943.m3475("deleteSources", m47063());
            C24009.m52847(c09943, c2450, z);
            return;
        }
        String m47068 = m47068();
        boolean z2 = z && !m47068.startsWith("/");
        AbstractC15440 m39866 = m47068.startsWith("/") ? C16999.m39866(m47068, new String[0]) : C16999.m39866(m39020, m47068);
        if (m47065 == -1 || m47071 != EnumC6434.SEVEN_ZIP) {
            abstractC15440 = m39866;
        } else {
            abstractC15440 = C16999.m39866(m39866.mo23554() + ".001", new String[0]);
        }
        boolean mo23120 = abstractC15440.mo23120();
        RunnableC21561 runnableC21561 = new RunnableC21561(this, m47071, c2450, m39866, m47065, mo23120, z2);
        if (!mo23120) {
            runnableC21561.run();
            return;
        }
        if (!abstractC15440.mo23119()) {
            C21374.m48457(abstractC15440.mo23113() ? R.string.MT_Protector_res_0x7f1208c2 : R.string.MT_Protector_res_0x7f1208c1);
            return;
        }
        C19258 buildDialog = c2450.m7917().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
        buildDialog.m44424(c2450.m7917().getString(R.string.MT_Protector_res_0x7f1203b5, abstractC15440.getName()));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC18040(1, runnableC21561));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
