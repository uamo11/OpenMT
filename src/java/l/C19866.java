package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: U58Z */
/* renamed from: l.᩶֫ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19866 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f64151;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f64150 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f64149 = new HashMap();

    public C19866(String str) {
        this.f64151 = str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m45696() {
        return this.f64151;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45689() {
        this.f64149.clear();
        this.f64150.clear();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45692(String str) {
        return this.f64149.containsKey(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2932 m45688(String str) {
        return (C2932) this.f64149.get(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45690(String str, String str2) {
        if (str.equals(str2)) {
            return;
        }
        HashMap hashMap = this.f64149;
        C2932 c2932 = (C2932) hashMap.get(str);
        if (c2932 != null) {
            c2932.f9328 = str2;
            return;
        }
        C2932 c29322 = new C2932();
        c29322.f9329 = str;
        c29322.f9328 = str2;
        this.f64150.add(c29322);
        hashMap.put(str, c29322);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m45694() {
        return C20195.unmodifiableList(this.f64150);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m45691() {
        return C1789.m5957(this.f64151);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m45693() {
        AbstractC15440 m5957 = C1789.m5957(this.f64151);
        StringBuilder sb = new StringBuilder(1024);
        Iterator it = this.f64150.iterator();
        while (it.hasNext()) {
            C2932 c2932 = (C2932) it.next();
            String str = c2932.f9329;
            String str2 = c2932.f9328;
            if (str != null && str2 != null && !str.equals(str2)) {
                sb.append("{\r\n  \"");
                sb.append(C8845.m22847(str));
                sb.append("\"\r\n  \"");
                sb.append(C8845.m22847(str2));
                sb.append("\"\r\n}\r\n");
            }
        }
        m5957.m36497(new C9092(sb.toString()));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m45695() {
        m45689();
        C8845 c8845 = null;
        try {
            C8845 c88452 = new C8845(C1789.m5957(this.f64151).m36489());
            while (true) {
                try {
                    String m22852 = c88452.m22852();
                    if (m22852.length() == 0) {
                        return;
                    }
                    C8845.m22846(m22852);
                    c88452.m22851("\"");
                    String m22853 = c88452.m22853();
                    c88452.m22851("\"");
                    String m228532 = c88452.m22853();
                    c88452.m22851(l.d);
                    m45690(m22853, m228532);
                } catch (Throwable th) {
                    th = th;
                    c8845 = c88452;
                    if (c8845 != null) {
                        throw new C4343(th.getMessage(), c8845.m22850());
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45687(CharSequence charSequence) {
        if (charSequence instanceof InterfaceC20445) {
            C7744 mo26556 = ((InterfaceC20445) charSequence).mo26556();
            try {
                m45687(mo26556);
                mo26556.close();
                return;
            } catch (Throwable th) {
                try {
                    mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C8845 c8845 = new C8845(charSequence);
        while (true) {
            try {
                String m22852 = c8845.m22852();
                if (m22852.length() == 0) {
                    return;
                }
                C8845.m22846(m22852);
                c8845.m22851("\"");
                c8845.m22853();
                c8845.m22851("\"");
                c8845.m22853();
                c8845.m22851(l.d);
            } catch (Throwable th3) {
                throw new C4343(th3.getMessage(), c8845.m22850());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19866.class != obj.getClass()) {
            return false;
        }
        return this.f64151.equals(((C19866) obj).f64151);
    }

    public final int hashCode() {
        return C11003.hash(this.f64151);
    }
}
