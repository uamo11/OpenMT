package l;

import com.google.android.material.timepicker.ChipTextInputComboView;
import java.lang.reflect.Array;

/* compiled from: Y5AS */
/* renamed from: l.ۨ᩹ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11987 extends AbstractC18980 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Object f35888 = new Object();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Object f35889;

    public C11987(Object obj) {
        super(EnumC1340.CONSTANT);
        this.f35889 = obj;
    }

    @Override // l.AbstractC18980, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C11987(this.f35889);
    }

    @Override // l.AbstractC8396
    /* renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C11987(this.f35889);
    }

    @Override // l.AbstractC8396
    /* renamed from: ܳ */
    public final String mo6719() {
        Object obj = this.f35889;
        if (f35888 == obj) {
            return "null";
        }
        if (obj == null) {
            return "NULL";
        }
        if (obj instanceof Number) {
            if (obj instanceof Float) {
                return this.f35889.toString() + "F";
            }
            if (!(obj instanceof Long)) {
                return obj.toString();
            }
            return this.f35889.toString() + "L";
        }
        int i = 0;
        if (!(obj instanceof String)) {
            if (obj instanceof C22860) {
                return C0459.m2045(((C22860) this.f35889).f73758) + ".class";
            }
            if (!obj.getClass().isArray()) {
                return "" + this.f35889;
            }
            StringBuilder m15339 = C5368.m15339("[");
            int length = Array.getLength(this.f35889);
            while (i < length) {
                m15339.append(Array.get(this.f35889, i));
                m15339.append(",");
                i++;
            }
            if (length > 0) {
                m15339.setLength(m15339.length() - 1);
            }
            m15339.append("]");
            return m15339.toString();
        }
        StringBuffer stringBuffer = new StringBuffer("\"");
        String str = (String) this.f35889;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                stringBuffer.append("\\n");
            } else if (charAt == '\r') {
                stringBuffer.append("\\r");
            } else if (charAt == '\\') {
                stringBuffer.append("\\\\");
            } else if (charAt == '\"') {
                stringBuffer.append("\\\"");
            } else if (charAt < ' ' || charAt > 127) {
                stringBuffer.append("\\u");
                if (charAt < 16) {
                    stringBuffer.append("000");
                } else if (charAt < 256) {
                    stringBuffer.append(ChipTextInputComboView.TextFormatter.DEFAULT_TEXT);
                } else if (charAt < 4096) {
                    stringBuffer.append('0');
                }
                stringBuffer.append(Integer.toString(charAt, 16));
            } else {
                stringBuffer.append(charAt);
            }
            i++;
        }
        stringBuffer.append('\"');
        return stringBuffer.toString();
    }
}
