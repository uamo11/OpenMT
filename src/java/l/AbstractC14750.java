package l;

import java.io.OutputStreamWriter;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/* compiled from: RBJL */
/* renamed from: l.ܳ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC14750 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Logger f45034 = Logger.getLogger("SvgNode");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Element f45035;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f45038;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9813 f45039;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f45037 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0639 f45036 = new C0639();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0639 f45040 = new C0639();

    /* renamed from: ֫ */
    public abstract AbstractC14750 mo6729();

    /* renamed from: ֫ */
    public abstract void mo6730(OutputStreamWriter outputStreamWriter, String str);

    /* renamed from: ֫ */
    public abstract void mo6731(String str);

    /* renamed from: ֫ */
    public abstract void mo6733(C0639 c0639);

    /* renamed from: ۧ */
    public abstract void mo6736(C0639 c0639);

    /* renamed from: ۧ */
    public abstract boolean mo6737();

    /* renamed from: ܽ */
    public void mo27793() {
    }

    public AbstractC14750(C9813 c9813, Element element, String str) {
        this.f45038 = str;
        this.f45039 = c9813;
        this.f45035 = element;
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            Node item = attributes.item(i);
            String nodeName = item.getNodeName();
            String nodeValue = item.getNodeValue();
            if (C6347.f19663.containsKey(nodeName)) {
                m35051(nodeName, nodeValue);
            }
            if ("transform".equals(nodeName)) {
                f45034.log(Level.FINE, nodeName + " " + nodeValue);
                m35056(nodeValue);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0128 A[SYNTHETIC] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m35056(java.lang.String r24) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC14750.m35056(java.lang.String):void");
    }

    /* renamed from: ֫ */
    public EnumC17573 mo27788(C2184 c2184) {
        return C11992.m29299((EnumMap) c2184.f7186, this);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m35051(String str, String str2) {
        if (str.equals("fill-rule") || str.equals("clip-rule")) {
            if (str2.equals("nonzero")) {
                str2 = "nonZero";
            } else if (str2.equals("evenodd")) {
                str2 = "evenOdd";
            }
        }
        f45034.log(Level.FINE, C19462.m44858(">>>> PROP ", str, " = ", str2));
        if (str2.startsWith("url(") && !str.equals("fill") && !str.equals("stroke")) {
            m35054("Unsupported URL value: ".concat(str2));
            return;
        }
        boolean equals = str.equals("stroke-width");
        HashMap hashMap = this.f45037;
        if (equals && str2.equals("0")) {
            hashMap.remove("stroke");
        }
        hashMap.put(str, str2);
    }

    /* renamed from: ۧ */
    public void mo27792(String str, String str2) {
        m35051(str, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35053(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            HashMap hashMap2 = this.f45037;
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, (String) entry.getValue());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m35052(String str, String str2) {
        try {
            return C23280.m51596(str);
        } catch (IllegalArgumentException unused) {
            m35054(C4860.m14172("Unsupported color format \"", str, "\""));
            return str2;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m35054(String str) {
        this.f45039.m24854(str, this.f45035);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m35055(String str) {
        C9813 c9813 = this.f45039;
        c9813.getClass();
        c9813.m24855(str, this.f45035, EnumC21102.WARNING);
    }
}
