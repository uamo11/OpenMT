package l;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: Q1K7 */
/* renamed from: l.ᩴᩳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18923 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11005 f59610;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0577 f59611;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f59612;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public OutputStream f59613;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f59614 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2951 f59615;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2951 f59616;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C2951 f59617;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m43661() {
        OutputStream outputStream = this.f59613;
        if (outputStream != null) {
            C0349.m1793(outputStream);
            this.f59613 = null;
        }
        this.f59614 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m43662(String str, C12953 c12953) {
        ConcurrentMapC10942 concurrentMapC10942;
        C11005 c11005;
        C11005 c110052;
        C11005 c110053;
        try {
            AbstractC15440 m27340 = this.f59610.m27340();
            int i = this.f59614;
            if (i == -1) {
                i = m27340.mo23120() ? (int) m27340.mo23127() : 0;
            }
            int m31518 = c12953.m31518();
            if (this.f59617 == null) {
                c110053 = this.f59611.f2272;
                this.f59617 = new C2951(c110053.m27340().mo23555(true));
            }
            if (this.f59615 == null) {
                c110052 = this.f59611.f2274;
                this.f59615 = new C2951(c110052.m27340().mo23555(true));
            }
            if (this.f59613 == null) {
                this.f59613 = m27340.mo23555(true);
            }
            this.f59613.write(c12953.m31516(), 0, m31518);
            this.f59613.flush();
            C0577.m2362(this.f59611, this.f59612);
            concurrentMapC10942 = this.f59611.f2283;
            concurrentMapC10942.put(str, new C19629(this.f59612, i, m31518));
            this.f59614 = i + m31518;
            boolean z = str.length() <= 20000;
            C2951 c2951 = z ? this.f59617 : this.f59615;
            if (z) {
                C12248.m29749(c2951, C5773.m16233(str));
                C5773.m16236(c2951, str);
            } else {
                C12248.m29746(c2951, C5773.m16233(str));
                C5773.m16236(c2951, str);
            }
            C12248.m29749(c2951, this.f59612);
            C12248.m29746(c2951, i);
            C12248.m29746(c2951, m31518);
            c2951.flush();
            if (this.f59614 >= 524288) {
                this.f59612++;
                c11005 = this.f59611.f2281;
                this.f59610 = new C11005(c11005, String.valueOf(this.f59612));
                m43661();
            }
        } catch (IOException e) {
            m43663();
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m43663() {
        C2951 c2951 = this.f59617;
        if (c2951 != null) {
            C0349.m1793(c2951);
            this.f59617 = null;
        }
        C2951 c29512 = this.f59615;
        if (c29512 != null) {
            C0349.m1793(c29512);
            this.f59615 = null;
        }
        C2951 c29513 = this.f59616;
        if (c29513 != null) {
            C0349.m1793(c29513);
            this.f59616 = null;
        }
        m43661();
    }

    public C18923(C0577 c0577) {
        C11005 c11005;
        this.f59611 = c0577;
        AbstractC15440 m2351 = C0577.m2351(c0577, this.f59612);
        while (m2351.mo23120() && m2351.mo23127() >= 524288) {
            int i = this.f59612 + 1;
            this.f59612 = i;
            m2351 = C0577.m2351(c0577, i);
        }
        c11005 = c0577.f2281;
        this.f59610 = new C11005(c11005, String.valueOf(this.f59612));
    }
}
