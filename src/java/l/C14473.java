package l;

import com.alipay.sdk.m.n.c;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: U4FJ */
/* renamed from: l.ܳۧ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14473 implements InterfaceC19145 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final List f44350 = C20032.m46176("connection", c.f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final List f44351 = C20032.m46176("connection", c.f, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7855 f44352;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22235 f44353;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC14386 f44354;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C15615 f44355;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10241 f44356;

    public C14473(C17209 c17209, C7855 c7855, C15615 c15615, C22235 c22235) {
        this.f44352 = c7855;
        this.f44355 = c15615;
        this.f44353 = c22235;
        List m40471 = c17209.m40471();
        EnumC14386 enumC14386 = EnumC14386.H2_PRIOR_KNOWLEDGE;
        this.f44354 = m40471.contains(enumC14386) ? enumC14386 : EnumC14386.HTTP_2;
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫ */
    public final InterfaceC5508 mo28141(C8743 c8743, long j) {
        return this.f44356.m25942();
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫ */
    public final void mo28144(C8743 c8743) {
        if (this.f44356 != null) {
            return;
        }
        boolean z = c8743.m22616() != null;
        C10338 m22619 = c8743.m22619();
        ArrayList arrayList = new ArrayList(m22619.m26139() + 4);
        arrayList.add(new C7150(C7150.f21946, c8743.m22620()));
        C11816 c11816 = C7150.f21941;
        C11749 m22622 = c8743.m22622();
        String m28772 = m22622.m28772();
        String m28777 = m22622.m28777();
        if (m28777 != null) {
            m28772 = m28772 + '?' + m28777;
        }
        arrayList.add(new C7150(c11816, m28772));
        String m22615 = c8743.m22615("Host");
        if (m22615 != null) {
            arrayList.add(new C7150(C7150.f21942, m22615));
        }
        arrayList.add(new C7150(C7150.f21945, c8743.m22622().m28767()));
        int m26139 = m22619.m26139();
        for (int i = 0; i < m26139; i++) {
            C11816 m28900 = C11816.m28900(m22619.m26136(i).toLowerCase(Locale.US));
            if (!f44350.contains(m28900.mo2335())) {
                arrayList.add(new C7150(m28900, m22619.m26140(i)));
            }
        }
        C10241 m49924 = this.f44353.m49924(arrayList, z);
        this.f44356 = m49924;
        C12357 c12357 = m49924.f30876;
        long m21040 = this.f44352.m21040();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c12357.mo20329(m21040);
        this.f44356.f30868.mo20329(r0.m21044());
    }

    @Override // l.InterfaceC19145
    /* renamed from: ۧ */
    public final void mo28146() {
        this.f44353.f72147.flush();
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫ */
    public final void mo28143() {
        ((C3185) this.f44356.m25942()).close();
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫ */
    public final C3804 mo28140(boolean z) {
        C10338 m25938 = this.f44356.m25938();
        C12454 c12454 = new C12454();
        int m26139 = m25938.m26139();
        C21967 c21967 = null;
        for (int i = 0; i < m26139; i++) {
            String m26136 = m25938.m26136(i);
            String m26140 = m25938.m26140(i);
            if (m26136.equals(":status")) {
                c21967 = C21967.m49454("HTTP/1.1 " + m26140);
            } else if (!f44351.contains(m26136)) {
                AbstractC8037.f24775.mo21353(c12454, m26136, m26140);
            }
        }
        if (c21967 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C3804 c3804 = new C3804();
        c3804.m11482(this.f44354);
        c3804.m11475(c21967.f70360);
        c3804.m11486(c21967.f70361);
        c3804.m11480(c12454.m30612());
        if (z && AbstractC8037.f24775.mo21346(c3804) == 100) {
            return null;
        }
        return c3804;
    }

    @Override // l.InterfaceC19145
    /* renamed from: ֫ */
    public final C14910 mo28142(C18621 c18621) {
        this.f44355.f48085.getClass();
        return new C14910(c18621.m43169("Content-Type"), C0799.m3017(c18621), C23852.m52567(new C17296(this, this.f44356.m25945())));
    }

    @Override // l.InterfaceC19145
    public final void cancel() {
        C10241 c10241 = this.f44356;
        if (c10241 != null) {
            c10241.m25940(EnumC13499.CANCEL);
        }
    }
}
