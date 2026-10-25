package l;

import android.content.Context;
import android.os.Bundle;
import bin.mt.plus.R;

/* compiled from: 11SZ */
/* renamed from: l.ۘ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC4232 extends AbstractActivityC1606 implements InterfaceC20657 {

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f13723;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C2095 f13724;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C2095 f13725;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f13726;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "TerminalPreferences";
    }

    public ActivityC4232() {
        super(R.xml.MT_Protector_res_0x7f150003);
    }

    @Override // l.AbstractActivityC1606, l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f13723 = C2956.m9012() != ViewOnLayoutChangeListenerC7738.class;
    }

    @Override // l.AbstractActivityC1606
    /* renamed from: ֫ */
    public final void mo5465(C7705 c7705, C7055 c7055) {
        C2095 m10700 = c7055.m10700("term_start_path");
        C11003.requireNonNull(m10700);
        C2095 m107002 = c7055.m10700("term_create_session_as_root");
        C11003.requireNonNull(m107002);
        C2095 m107003 = c7055.m10700("term_double_confirm_to_exit");
        C11003.requireNonNull(m107003);
        C2095 m107004 = c7055.m10700("terminal_su2_help");
        C11003.requireNonNull(m107004);
        this.f13724 = m107004;
        C2095 m107005 = c7055.m10700("term_ex");
        C11003.requireNonNull(m107005);
        this.f13725 = m107005;
        if (this.f13723) {
            m10700.m6924(false);
            m107002.m6924(false);
        } else {
            m10700.mo6894((CharSequence) ApplicationC20075.f65010.getString("term_start_path", "/sdcard"));
            m107003.m6924(false);
        }
        m12731();
    }

    @Override // l.AbstractActivityC1606
    /* renamed from: ֫ */
    public final boolean mo5466(C7705 c7705, C2095 c2095, Object obj) {
        if (!(c2095 instanceof C6845)) {
            return false;
        }
        c2095.mo6894((CharSequence) obj.toString());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m12731() {
        C7549 m6880 = C2094.m6880();
        C2800 m12703 = C4211.m12703();
        this.f13726 = true;
        if (m6880 != null) {
            String str = m6880.f23328;
            this.f13724.m6924(true);
            if (m12703 == null) {
                this.f13725.mo6894((CharSequence) getString(R.string.MT_Protector_res_0x7f120a3b, str, "unknown"));
                this.f13726 = false;
                return;
            } else if (m12703.f8741 > m6880.f23330) {
                this.f13725.mo6894((CharSequence) getString(R.string.MT_Protector_res_0x7f120a3c, str, m12703.f8740));
                return;
            } else {
                this.f13725.mo6894((CharSequence) getString(R.string.MT_Protector_res_0x7f120a3b, str, m12703.f8740));
                return;
            }
        }
        this.f13724.m6924(false);
        this.f13725.m6930(R.string.MT_Protector_res_0x7f120a3e);
    }

    @Override // l.InterfaceC20657
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo12732() {
        if (this.f13726) {
            C7549 m6880 = C2094.m6880();
            C2800 m12703 = C4211.m12703();
            if (m12703 == null) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12051f);
            } else if (m6880 != null && m6880.f23330 >= m12703.f8741) {
                ActivityC10717.m26893((Context) this, C23986.m52813(), true);
            } else {
                C4211.m12705((AbstractActivityC3346) this, (Runnable) new RunnableC1126(5, this), true);
            }
        }
    }
}
