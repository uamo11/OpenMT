package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

/* compiled from: W7A7 */
/* renamed from: l.᩻᩺᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24017 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f77831;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77832 = -1;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2951 f77833;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public OutputStream f77834;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2951 f77835;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C2951 f77836;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19079 f77837;

    public C24017(C19079 c19079) {
        this.f77837 = c19079;
        AbstractC15440 m43940 = C19079.m43940(c19079, this.f77831);
        while (m43940.mo23120() && m43940.mo23127() >= 524288) {
            int i = this.f77831 + 1;
            this.f77831 = i;
            m43940 = C19079.m43940(c19079, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2851 m52858(String str, C12953 c12953) {
        Object obj;
        HashMap hashMap;
        C2951 c2951;
        AbstractC15440 abstractC15440;
        AbstractC15440 abstractC154402;
        int m31518 = c12953.m31518();
        AbstractC15440 m43940 = C19079.m43940(this.f77837, this.f77831);
        int i = this.f77832;
        if (i == -1) {
            i = m43940.mo23120() ? (int) m43940.mo23127() : 0;
        }
        if (i > 0 && i + m31518 > 524288) {
            C0349.m1793(this.f77834);
            this.f77834 = null;
            this.f77832 = -1;
            int i2 = this.f77831 + 1;
            this.f77831 = i2;
            m43940 = C19079.m43940(this.f77837, i2);
            i = m43940.mo23120() ? (int) m43940.mo23127() : 0;
        }
        if (this.f77831 > 65535) {
            throw new IOException("Too many smali cache data files");
        }
        if (this.f77834 == null) {
            this.f77834 = m43940.mo23555(true);
        }
        this.f77834.write(c12953.m31516(), 0, m31518);
        this.f77834.flush();
        obj = this.f77837.f60073;
        synchronized (obj) {
            hashMap = this.f77837.f60086;
            hashMap.remove(Integer.valueOf(this.f77831));
        }
        C19079 c19079 = this.f77837;
        if (str.length() <= 20000) {
            if (this.f77833 == null) {
                abstractC154402 = c19079.f60072;
                this.f77833 = new C2951(abstractC154402.mo23555(true));
            }
            c2951 = this.f77833;
        } else {
            if (this.f77835 == null) {
                abstractC15440 = c19079.f60085;
                this.f77835 = new C2951(abstractC15440.mo23555(true));
            }
            c2951 = this.f77835;
        }
        if (str.length() <= 20000) {
            C12248.m29749(c2951, C5773.m16233(str));
            C5773.m16236(c2951, str);
        } else {
            C12248.m29746(c2951, C5773.m16233(str));
            C5773.m16236(c2951, str);
        }
        C12248.m29749(c2951, this.f77831);
        C12248.m29746(c2951, i);
        C12248.m29746(c2951, m31518);
        c2951.flush();
        int i3 = i + m31518;
        this.f77832 = i3;
        int i4 = this.f77831;
        C2851 c2851 = new C2851(i4, i, m31518);
        if (i3 >= 524288) {
            this.f77831 = i4 + 1;
            C0349.m1793(this.f77834);
            this.f77834 = null;
            this.f77832 = -1;
        }
        return c2851;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52860(String str) {
        AbstractC15440 abstractC15440;
        if (this.f77836 == null) {
            abstractC15440 = this.f77837.f60080;
            this.f77836 = new C2951(abstractC15440.mo23555(true));
        }
        C2951 c2951 = this.f77836;
        C12248.m29746(c2951, C5773.m16233(str));
        C5773.m16236(c2951, str);
        this.f77836.flush();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52859() {
        C0349.m1793(this.f77834);
        C0349.m1793(this.f77833);
        C0349.m1793(this.f77835);
        C0349.m1793(this.f77836);
        this.f77834 = null;
        this.f77833 = null;
        this.f77835 = null;
        this.f77836 = null;
        this.f77832 = -1;
    }
}
