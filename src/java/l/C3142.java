package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: 9AFA */
/* renamed from: l.ۗۡ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3142 extends AbstractC2938 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC2938
    /* renamed from: ֫ */
    public final Object mo8958(Object obj) {
        C12519 c12519;
        C3347 c3347 = (C3347) obj;
        boolean z = true;
        if (c3347.f10607 == 1) {
            C10403 c10403 = new C10403(!c3347.f10602, c3347);
            c10403.m26240(c3347.f10599);
            c12519 = c10403;
        } else {
            c12519 = new C12519(c3347);
        }
        String str = c3347.f10598;
        if (!str.equalsIgnoreCase(a.D) && !str.equalsIgnoreCase("UTF8")) {
            z = false;
        }
        c12519.m32079(str);
        Charset.forName(str);
        try {
            c12519.m32071(c3347.f10608, c3347.f10604);
            if (c3347.f10605) {
                c12519.m32070();
                if (c12519 instanceof C10403) {
                    C10403 c104032 = (C10403) c12519;
                    c104032.m33320();
                    c104032.m33319();
                }
            }
            try {
                String str2 = c3347.f10601;
                String str3 = c3347.f10603;
                if (str2.equals("anonymous") && str3.isEmpty()) {
                    str3 = "anonymous@";
                }
                if (!c12519.m32083(str2, str3)) {
                    StringBuilder m19190 = C7166.m19190(C4925.m14327(R.string.MT_Protector_res_0x7f120afe), ": ");
                    m19190.append(c12519.m32076());
                    throw new C19401(m19190.toString());
                }
                if (z) {
                    c12519.mo26243("OPTS", "UTF8 ON");
                }
                c12519.mo26242();
                if (c12519.m32092()) {
                    return c12519;
                }
                c12519.mo26245();
                throw null;
            } catch (Exception e) {
                throw new IOException(C19370.m44629(e, C7166.m19190(C4925.m14327(R.string.MT_Protector_res_0x7f120afe), ": ")), e);
            }
        } catch (Exception e2) {
            throw new IOException(C19370.m44629(e2, C7166.m19190(C4925.m14327(R.string.MT_Protector_res_0x7f1201e7), ": ")), e2);
        }
    }

    @Override // l.AbstractC2938
    /* renamed from: ֫ */
    public final void mo8959(Object obj, InterfaceC9994 interfaceC9994) {
        try {
            InterfaceC13224 interfaceC13224 = (InterfaceC13224) interfaceC9994.mo25153();
            if (interfaceC13224.m32085()) {
                interfaceC13224.m32080();
            }
        } catch (Exception unused) {
        }
    }

    @Override // l.AbstractC2938
    /* renamed from: ۧ */
    public final InterfaceC9994 mo8960(Object obj) {
        return new C16383((InterfaceC13224) obj);
    }

    @Override // l.AbstractC2938
    /* renamed from: ۧ */
    public final boolean mo8961(Object obj, InterfaceC9994 interfaceC9994) {
        InterfaceC13224 interfaceC13224 = (InterfaceC13224) interfaceC9994.mo25153();
        if (!interfaceC13224.m32077()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - interfaceC9994.mo25155().toEpochMilli();
        if (currentTimeMillis >= 0 && currentTimeMillis <= 2000) {
            return true;
        }
        try {
            return interfaceC13224.m32081();
        } catch (IOException unused) {
            return false;
        }
    }
}
