package l;

import java.util.ArrayList;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: M37V */
/* renamed from: l.ۧܳ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11049 extends C1876 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f33222;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC8932 f33223;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f33224;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC8932 m27434(C10242 c10242) {
        String m25965;
        ArrayList arrayList;
        AbstractC8932 c18104;
        AbstractC8932 abstractC8932;
        ArrayList arrayList2;
        if (this.f33223 == null) {
            if (c10242 == null) {
                m25965 = this.f6385;
            } else {
                m25965 = c10242.m25965(this.f6386, new C23853(2, this));
            }
            this.f33222 = m25965;
            this.f33224 = 0;
            ArrayList arrayList3 = null;
            if (m25965.charAt(0) == '<') {
                this.f33224++;
                arrayList = new ArrayList();
                while (this.f33222.charAt(this.f33224) != '>') {
                    int indexOf = this.f33222.indexOf(":", this.f33224);
                    String substring = this.f33222.substring(this.f33224, indexOf);
                    int i = indexOf + 1;
                    this.f33224 = i;
                    if (this.f33222.charAt(i) != ':') {
                        abstractC8932 = m27433();
                        arrayList2 = null;
                    } else {
                        abstractC8932 = null;
                        arrayList2 = null;
                    }
                    while (this.f33222.charAt(this.f33224) == ':') {
                        this.f33224++;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(m27433());
                    }
                    arrayList.add(new C6815(substring, abstractC8932, arrayList2));
                }
                this.f33224++;
            } else {
                arrayList = null;
            }
            if (m25965.charAt(this.f33224) == '(') {
                ArrayList m27432 = m27432(')');
                AbstractC8932 m27433 = m27433();
                while (this.f33224 < m25965.length() && m25965.charAt(this.f33224) == '^') {
                    this.f33224++;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(m27433());
                }
                c18104 = new C14575(arrayList, m27432, m27433, arrayList3);
            } else {
                AbstractC8932 m274332 = m27433();
                if (arrayList == null && this.f33224 == m25965.length()) {
                    c18104 = m274332;
                } else {
                    while (this.f33224 < m25965.length()) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(m27433());
                    }
                    c18104 = new C18104(arrayList, m274332, arrayList3);
                }
            }
            this.f33223 = c18104;
        }
        return this.f33223;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC8932 m27433() {
        char charAt;
        char charAt2 = this.f33222.charAt(this.f33224);
        if (charAt2 == '*') {
            this.f33224++;
            return new C9638(EnumC20927.UNBOUNDED, null);
        }
        if (charAt2 == '+') {
            this.f33224++;
            return new C9638(EnumC20927.EXTENDS, m27433());
        }
        if (charAt2 == '-') {
            this.f33224++;
            return new C9638(EnumC20927.SUPER, m27433());
        }
        if (charAt2 == 'F') {
            this.f33224++;
            return new C23748(ClassTransform.FLOAT);
        }
        if (charAt2 == 'L') {
            this.f33224++;
            StringBuilder sb = new StringBuilder();
            C17398 c17398 = null;
            ArrayList arrayList = null;
            do {
                charAt = this.f33222.charAt(this.f33224);
                if (charAt == '.' || charAt == ';') {
                    this.f33224++;
                    C17398 c173982 = new C17398(c17398, sb.toString(), arrayList);
                    sb.setLength(0);
                    arrayList = null;
                    c17398 = c173982;
                } else if (charAt == '<') {
                    arrayList = m27432('>');
                } else {
                    this.f33224++;
                    sb.append(charAt);
                }
            } while (charAt != ';');
            return c17398;
        }
        if (charAt2 == 'V') {
            this.f33224++;
            return new C23748(ClassTransform.VOID);
        }
        if (charAt2 == 'I') {
            this.f33224++;
            return new C23748(ClassTransform.INTEGER);
        }
        if (charAt2 == 'J') {
            this.f33224++;
            return new C23748(ClassTransform.LONG);
        }
        if (charAt2 == 'S') {
            this.f33224++;
            return new C23748(ClassTransform.SHORT);
        }
        if (charAt2 == 'T') {
            int i = this.f33224 + 1;
            this.f33224 = i;
            int indexOf = this.f33222.indexOf(59, i);
            C23748 c23748 = new C23748(this.f33222.substring(this.f33224, indexOf));
            this.f33224 = indexOf + 1;
            return c23748;
        }
        if (charAt2 == 'Z') {
            this.f33224++;
            return new C23748(ClassTransform.BOOLEAN);
        }
        if (charAt2 != '[') {
            switch (charAt2) {
                case 'B':
                    this.f33224++;
                    return new C23748(ClassTransform.BYTE);
                case 'C':
                    this.f33224++;
                    return new C23748(ClassTransform.CHARACTER);
                case 'D':
                    this.f33224++;
                    return new C23748(ClassTransform.DOUBLE);
                default:
                    throw new IllegalStateException(this.f33222.substring(0, this.f33224) + "!" + this.f33222.charAt(this.f33224) + "!" + this.f33222.substring(this.f33224 + 1));
            }
        }
        this.f33224++;
        return new C16692(m27433());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ArrayList m27432(char c) {
        this.f33224++;
        ArrayList arrayList = new ArrayList();
        while (this.f33222.charAt(this.f33224) != c) {
            arrayList.add(m27433());
        }
        this.f33224++;
        return arrayList;
    }
}
