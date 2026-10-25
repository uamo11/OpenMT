package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: R811 */
/* renamed from: l.᩺ܺ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23102 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f74336;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f74337;

    public C23102(String str, String str2) {
        this.f74336 = str;
        this.f74337 = str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m51291() {
        HashMap hashMap = new HashMap();
        hashMap.put("Host", "service.cos.myqcloud.com");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
        hashMap.put("Date", simpleDateFormat.format(new Date()));
        hashMap.put("Authorization", C11814.m28880(this.f74336, this.f74337, hashMap));
        C9449 c9449 = new C9449();
        c9449.m24282("https://service.cos.myqcloud.com");
        c9449.m24281();
        for (Map.Entry entry : hashMap.entrySet()) {
            c9449.m24276((String) entry.getKey(), (String) entry.getValue());
        }
        C18621 execute = C4925.m14323().m40469(c9449.m24274()).execute();
        try {
            if (!execute.m43173()) {
                if (execute.m43177() != 401 && execute.m43177() != 403) {
                    throw new IOException("Request failed: " + execute.m43177() + " " + execute.m43171());
                }
                throw new C19401(R.string.MT_Protector_res_0x7f120703);
            }
            try {
                ArrayList arrayList = new ArrayList();
                NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(execute.m43170().m1611()).getElementsByTagName("Bucket");
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    Node item = elementsByTagName.item(i);
                    if (item.getNodeType() == 1) {
                        Element element = (Element) item;
                        String m51290 = m51290("Name", element);
                        String m512902 = m51290("Location", element);
                        arrayList.add(new C6169(m51290, m512902, "cos." + m512902 + ".myqcloud.com"));
                    }
                }
                execute.close();
                return arrayList;
            } catch (Exception e) {
                throw new RuntimeException("Failed to parse ListBuckets response", e);
            }
        } catch (Throwable th) {
            try {
                execute.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51290(String str, Element element) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        return elementsByTagName.getLength() > 0 ? elementsByTagName.item(0).getTextContent() : "";
    }
}
