package l;

import android.text.TextUtils;
import java.io.IOException;

/* compiled from: R9JP */
/* renamed from: l.۫᩵᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12624 extends AbstractC2938 {
    @Override // l.AbstractC2938
    /* renamed from: ֫ */
    public final Object mo8958(Object obj) {
        C2921 m5143;
        C6274 c6274 = (C6274) obj;
        C12066 m17285 = c6274.m17285();
        C21971 c21971 = new C21971(C1482.m5130(false, c6274.m17286(), c6274.m17284()));
        try {
            String str = m17285.f36083;
            String str2 = m17285.f36084;
            C23650 m49459 = c21971.m49459(m17285.f36086, str);
            if ((c6274.m17286() == EnumC7685.SMB2_UNSIGNED) && m49459.m52167().m18283()) {
                throw new IOException("SMB server requires signing");
            }
            m5143 = C1482.m5143(m17285);
            String str3 = m17285.f36087;
            if ((!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) && str2.equals("guest")) {
                TextUtils.isEmpty(str3);
            }
            return new C10508(c6274, c21971, m49459, m49459.m52154(m5143));
        } catch (Exception e) {
            C0349.m1793(c21971);
            throw e;
        }
    }

    @Override // l.AbstractC2938
    /* renamed from: ֫ */
    public final void mo8959(Object obj, InterfaceC9994 interfaceC9994) {
        C0349.m1793(((C10508) interfaceC9994.mo25153()).f31518);
    }

    @Override // l.AbstractC2938
    /* renamed from: ۧ */
    public final InterfaceC9994 mo8960(Object obj) {
        return new C23207((C10508) obj);
    }

    @Override // l.AbstractC2938
    /* renamed from: ۧ */
    public final boolean mo8961(Object obj, InterfaceC9994 interfaceC9994) {
        if (!((C10508) interfaceC9994.mo25153()).f31519.m52166()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - interfaceC9994.mo25155().toEpochMilli();
        if (currentTimeMillis < 0 || currentTimeMillis > 2000) {
            try {
                C23207 c23207 = (C23207) interfaceC9994;
                if (c23207.m51500()) {
                    c23207.m51501();
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }
}
