package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* compiled from: P676 */
/* renamed from: l.۠᩹ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8469 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f25897;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f25898;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25899;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8469(ActivityC21107 activityC21107, ActivityC21107 activityC211072, String str, boolean z) {
        super(activityC211072, -1);
        this.f25898 = activityC21107;
        this.f25897 = str;
        this.f25899 = z;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        C18284 c182848;
        String trim = m31260().replace('.', '/').trim();
        if (trim.length() != 0) {
            String str = this.f25897;
            if (!trim.equals(str)) {
                ActivityC21107 activityC21107 = this.f25898;
                c18284 = activityC21107.f68093;
                Iterator it = c18284.f56843.f77604.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(trim)) {
                        m31251(String.format(activityC21107.getString(R.string.MT_Protector_res_0x7f12016e), trim));
                        return;
                    }
                }
                String replace = str.replace('.', '/');
                if (this.f25899) {
                    trim = trim.concat("/");
                    replace = C16014.m37867(replace, "/");
                }
                StringBuilder sb = new StringBuilder();
                c182842 = activityC21107.f68093;
                String m23341 = C9045.m23341(sb, c182842.f56843.f77599, replace);
                StringBuilder sb2 = new StringBuilder();
                c182843 = activityC21107.f68093;
                ActivityC21107.m48054(activityC21107, m23341, C9045.m23341(sb2, c182843.f56843.f77599, trim));
                ActivityC21107.f68088 = true;
                c182844 = activityC21107.f68093;
                c182844.f56832.clear();
                c182845 = activityC21107.f68093;
                Iterator it2 = c182845.f56840.f10940.m25236().iterator();
                while (it2.hasNext()) {
                    C11258 c11258 = (C11258) it2.next();
                    String m36561 = C15472.m36561(1, 1, c11258.m27862().m50835());
                    c182848 = activityC21107.f68093;
                    c182848.f56832.put(m36561, c11258);
                }
                c182846 = activityC21107.f68093;
                C14755 c14755 = c182846.f56847;
                c182847 = activityC21107.f68093;
                c14755.m35066(c182847.f56832.keySet());
                activityC21107.m48061();
                m31262();
                return;
            }
        }
        m31262();
    }
}
