package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: D80C */
/* renamed from: l.ۧۖ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10718 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f32301;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f32302;

    public C10718(String str, String str2) {
        this.f32301 = str;
        this.f32302 = str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m26897() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        String m14172 = C4860.m14172("GET\n\n\n", format, "\n/");
        Mac mac = Mac.getInstance("HmacSHA1");
        Charset charset = StandardCharsets.UTF_8;
        mac.init(new SecretKeySpec(this.f32302.getBytes(charset), "HmacSHA1"));
        String m51498 = C23202.m51498(new StringBuilder("OBS "), this.f32301, ":", C19490.getEncoder().encodeToString(mac.doFinal(m14172.getBytes(charset))));
        C9449 c9449 = new C9449();
        c9449.m24282("https://obs.cn-north-4.myhuaweicloud.com/");
        c9449.m24281();
        c9449.m24283("Date", format);
        c9449.m24283("Authorization", m51498);
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
                        String m51290 = C23102.m51290("Name", element);
                        String m512902 = C23102.m51290("Location", element);
                        arrayList.add(new C6169(m51290, m512902, "obs." + m512902 + ".myhuaweicloud.com"));
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
}
