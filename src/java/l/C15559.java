package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import bin.mt.plus.R;
import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: A924 */
/* renamed from: l.ܶ᩻ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15559 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f47959;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC16687 f47960;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f47961;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f47962;

    public C15559(AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f47959 = abstractActivityC3346;
        this.f47961 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20269(this.f47959, R.string.MT_Protector_res_0x7f1202d0, 200, new Runnable() { // from class: l.֨᩻ۡ
            @Override // java.lang.Runnable
            public final void run() {
                r0.f23322.m31860(new Runnable() { // from class: l.۠᩻ۡ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC16687 interfaceC16687 = C15559.this.f47960;
                        if (interfaceC16687 != null) {
                            interfaceC16687.cancel();
                        }
                    }
                });
            }
        });
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C11044 c11044;
        C17209 c17209;
        String str;
        C9449 c9449 = new C9449();
        c11044 = C20500.f66073;
        c9449.m24279(c11044);
        String str2 = this.f47961;
        c9449.m24282(str2);
        C8743 m24274 = c9449.m24274();
        c17209 = C20500.f66074;
        InterfaceC16687 m40469 = c17209.m40469(m24274);
        this.f47960 = m40469;
        C18621 execute = m40469.execute();
        AbstractC0275 m43170 = execute.m43170();
        InputStream m1611 = m43170 != null ? m43170.m1611() : null;
        if (m1611 == null) {
            throw new IllegalStateException("Response does not contain body: ".concat(str2));
        }
        AbstractC15440 abstractC15440 = C16293.f50113;
        String m43169 = execute.m43169("Content-Disposition");
        if (m43169 != null) {
            Matcher matcher = Pattern.compile("filename=\"?([^\"]+)\"?").matcher(m43169);
            if (matcher.find()) {
                str = matcher.group(1);
                AbstractC15440 m36526 = abstractC15440.m36526(str);
                this.f47962 = m36526;
                m36526.m36493(m1611);
            }
        }
        str = (String) C7166.m19188(1, m24274.m22622().m28779());
        AbstractC15440 m365262 = abstractC15440.m36526(str);
        this.f47962 = m365262;
        m365262.m36493(m1611);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C12082 m7316;
        C2204 m7292 = C2204.m7292(this.f47962.getName(), true);
        boolean m7311 = m7292.m7311();
        AbstractActivityC3346 abstractActivityC3346 = this.f47959;
        if (m7311 && (m7316 = m7292.m7316()) != null) {
            C5732.m16161(abstractActivityC3346, this.f47962, m7292.m7315()).m16167(m7316);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri m36509 = this.f47962.m36509();
        intent.setDataAndType(m36509, m7292.m7315());
        intent.addFlags(268435456);
        C2837.m8731(intent, m36509);
        abstractActivityC3346.startActivity(intent);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f47959.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
