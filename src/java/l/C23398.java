package l;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Q4LG */
/* renamed from: l.᩻ۖ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23398 extends AbstractC16342 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3643 f75157;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f75158;

    public C23398() {
        super("");
        this.f75158 = -1;
        mo4051((C3328) null);
    }

    @Override // l.AbstractC16342
    /* renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("MVS", "yyyy/MM/dd HH:mm", null);
    }

    @Override // l.InterfaceC6150
    /* renamed from: ֫ */
    public final C10384 mo11134(String str) {
        int i = this.f75158;
        if (i == 0) {
            if (m38493(str)) {
                C10384 c10384 = new C10384();
                c10384.m26198(str);
                String m38492 = m38492(2);
                String m384922 = m38492(1);
                c10384.m26194(m38492);
                if ("PS".equals(m384922)) {
                    c10384.m26181(0);
                    return c10384;
                }
                if (!"PO".equals(m384922) && !"PO-E".equals(m384922)) {
                    return null;
                }
                c10384.m26181(1);
                return c10384;
            }
            boolean startsWith = str.startsWith("Migrated");
            if (!startsWith && !str.startsWith("ARCIVE")) {
                return null;
            }
            C10384 c103842 = new C10384();
            c103842.m26198(str);
            c103842.m26181(3);
            c103842.m26194(str.split("\\s+")[startsWith ? (char) 1 : (char) 5]);
            return c103842;
        }
        if (i != 1) {
            if (i == 2) {
                return this.f75157.mo11134(str);
            }
            if (i == 3) {
                return m51845(3, str);
            }
            if (i != 4) {
                return null;
            }
            return m51845(4, str);
        }
        C10384 c103843 = new C10384();
        if (m38493(str)) {
            c103843.m26198(str);
            String m384923 = m38492(1);
            String str2 = m38492(2) + " " + m38492(3);
            c103843.m26194(m384923);
            c103843.m26181(0);
            try {
                c103843.m26185(m38494(str2));
            } catch (ParseException unused) {
            }
            return c103843;
        }
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        c103843.m26198(str);
        c103843.m26194(str.split(" ")[0]);
        c103843.m26181(0);
        return c103843;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10384 m51845(int i, String str) {
        if (!m38493(str)) {
            return null;
        }
        C10384 c10384 = new C10384();
        if (!m38492(i).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        c10384.m26198(str);
        c10384.m26194(m38492(2));
        c10384.m26181(0);
        return c10384;
    }

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* renamed from: ֫ */
    public final List mo11132(LinkedList linkedList) {
        if (linkedList != null && !linkedList.isEmpty()) {
            String str = (String) linkedList.get(0);
            if (str.contains("Volume") && str.contains("Dsname")) {
                this.f75158 = 0;
                m38495("\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?\\S+\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*");
            } else if (str.contains("Name") && str.contains("Id")) {
                this.f75158 = 1;
                m38495("(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*");
            } else if (str.startsWith("total")) {
                this.f75158 = 2;
                this.f75157 = new C3643(null, false);
            } else if (str.indexOf("Spool Files") >= 30) {
                this.f75158 = 3;
                m38495("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*");
            } else if (!str.startsWith("JOBNAME") || str.indexOf("JOBID") <= 8) {
                this.f75158 = -1;
            } else {
                this.f75158 = 4;
                m38495("(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*");
            }
            if (this.f75158 != 3) {
                linkedList.remove(0);
            }
        }
        return linkedList;
    }
}
