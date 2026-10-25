package l;

import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: NB9V */
/* renamed from: l.᩶᩻ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20504 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20316 f66082;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8321 f66085 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f66084 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f66083 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TreeMap f66086 = null;

    public C20504(C20316 c20316) {
        this.f66082 = c20316;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46976() {
        if (this.f66085 == null) {
            this.f66085 = this.f66082.m46600();
        }
        return this.f66085.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46977(C1662 c1662) {
        if (this.f66085 == null) {
            this.f66085 = this.f66082.m46600();
        }
        C16892 m5632 = c1662.m5632();
        int size = this.f66085.size();
        this.f66086 = new TreeMap();
        for (int i = 0; i < size; i++) {
            this.f66086.put(this.f66085.m40992get(i).m4327(), null);
        }
        if (this.f66086.size() > 65535) {
            throw new UnsupportedOperationException("too many catch handlers");
        }
        C18241 c18241 = new C18241();
        this.f66083 = c18241.m42507(this.f66086.size());
        for (Map.Entry entry : this.f66086.entrySet()) {
            C5499 c5499 = (C5499) entry.getKey();
            int size2 = c5499.size();
            boolean m15632 = c5499.m15632();
            entry.setValue(Integer.valueOf(c18241.m42510()));
            if (m15632) {
                c18241.m42519(-(size2 - 1));
                size2--;
            } else {
                c18241.m42519(size2);
            }
            for (int i2 = 0; i2 < size2; i2++) {
                C0559 c0559 = c5499.get(i2);
                c18241.m42507(m5632.m39748(c0559.m2307()));
                c18241.m42507(c0559.m2305());
            }
            if (m15632) {
                c18241.m42507(c5499.get(size2).m2305());
            }
        }
        this.f66084 = c18241.m42520();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46978(C18241 c18241) {
        String m35008;
        String m350082;
        C8321 c8321 = this.f66085;
        C20316 c20316 = this.f66082;
        if (c8321 == null) {
            this.f66085 = c20316.m46600();
        }
        if (c18241.m42506()) {
            if (this.f66085 == null) {
                this.f66085 = c20316.m46600();
            }
            int size = this.f66085.size();
            c18241.m42501(0, "  tries:");
            for (int i = 0; i < size; i++) {
                C1265 m40992get = this.f66085.m40992get(i);
                C5499 m4327 = m40992get.m4327();
                StringBuilder sb = new StringBuilder("    try ");
                int m4328 = m40992get.m4328();
                if (m4328 == ((char) m4328)) {
                    m35008 = C14712.m35006(m4328);
                } else {
                    m35008 = C14712.m35008(m4328);
                }
                sb.append(m35008);
                sb.append("..");
                int m4325 = m40992get.m4325();
                if (m4325 == ((char) m4325)) {
                    m350082 = C14712.m35006(m4325);
                } else {
                    m350082 = C14712.m35008(m4325);
                }
                sb.append(m350082);
                String sb2 = sb.toString();
                String m15635 = m4327.m15635(ASN1Dump.TAB, "");
                c18241.m42501(6, sb2);
                c18241.m42501(2, m15635);
            }
            c18241.m42501(0, "  handlers:");
            c18241.m42501(this.f66083, "    size: ".concat(C14712.m35006(this.f66086.size())));
            C5499 c5499 = null;
            int i2 = 0;
            for (Map.Entry entry : this.f66086.entrySet()) {
                C5499 c54992 = (C5499) entry.getKey();
                int intValue = ((Integer) entry.getValue()).intValue();
                if (c5499 != null) {
                    c18241.m42501(intValue - i2, c5499.m15635(ASN1Dump.TAB, C14712.m35006(i2).concat(": ")));
                }
                i2 = intValue;
                c5499 = c54992;
            }
            c18241.m42501(this.f66084.length - i2, c5499.m15635(ASN1Dump.TAB, C14712.m35006(i2).concat(": ")));
        }
        int size2 = this.f66085.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C1265 m40992get2 = this.f66085.m40992get(i3);
            int m43282 = m40992get2.m4328();
            int m43252 = m40992get2.m4325();
            int i4 = m43252 - m43282;
            if (i4 >= 65536) {
                throw new UnsupportedOperationException("bogus exception range: " + C14712.m35008(m43282) + ".." + C14712.m35008(m43252));
            }
            c18241.m42514(m43282);
            c18241.m42511(i4);
            c18241.m42511(((Integer) this.f66086.get(m40992get2.m4327())).intValue());
        }
        c18241.m42505(this.f66084);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46979() {
        return (m46976() * 8) + this.f66084.length;
    }
}
