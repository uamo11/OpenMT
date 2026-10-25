package l;

import java.nio.charset.Charset;
import java.util.ArrayList;

/* compiled from: G4GB */
/* renamed from: l.ۢܰۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9624 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9190 f29171;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f29172 = true;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8918 f29173;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18090 f29174;

    public C9624(C18090 c18090, C8918 c8918) {
        C9190 c9190;
        this.f29173 = c8918;
        c9190 = c8918.f27113;
        C11003.requireNonNull(c9190);
        this.f29171 = c9190;
        this.f29174 = c18090;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24551(InterfaceC1393 interfaceC1393) {
        C8918 c8918 = this.f29173;
        C23411 mo21174 = this.f29174.m42214().mo21174();
        try {
            long length = mo21174.length();
            C14176.m33825(new C12445(mo21174, 0L, length, false), c8918.m23007(), length, interfaceC1393);
            c8918.m23023();
            mo21174.close();
            this.f29172 = false;
        } catch (Throwable th) {
            try {
                mo21174.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m24549() {
        return this.f29171.f27830;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m24550(String str) {
        long j;
        Charset charset;
        ArrayList arrayList;
        C8918 c8918 = this.f29173;
        j = c8918.f27115;
        if (j != -1) {
            throw new UnsupportedOperationException("Virtual entry is not supported in split mode");
        }
        boolean z = this.f29172;
        C18090 c18090 = this.f29174;
        if (z) {
            C23411 mo21174 = c18090.m42214().mo21174();
            try {
                c8918.m23011(new C12445(mo21174, 0L, mo21174.length(), false));
                c8918.m23023();
                mo21174.close();
                this.f29172 = false;
            } catch (Throwable th) {
                try {
                    mo21174.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C3545 m42211 = c18090.m42211(str);
        charset = c8918.f27112;
        C9190 c9190 = new C9190(m42211, charset);
        C8918.m23000(c9190);
        c9190.f27838 = m42211.m10796();
        long m10777 = m42211.m10777();
        C9190 c91902 = this.f29171;
        long j2 = m10777 + c91902.f27835;
        c9190.f27830 = j2;
        c9190.f27837 = j2;
        c9190.f27835 = m42211.m10811() + c91902.f27835;
        arrayList = c8918.f27107;
        arrayList.add(c9190);
        return c9190.f27830 - c91902.f27830;
    }
}
