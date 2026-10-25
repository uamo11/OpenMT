package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* compiled from: Z83J */
/* renamed from: l.ܽۖ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16361 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f50347;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f50348;

    public C16361(String str, String str2) {
        this.f50347 = str;
        this.f50348 = str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m38505(InputStream inputStream) {
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputStream).getElementsByTagName("Bucket");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element = (Element) elementsByTagName.item(i);
                arrayList.add(new C6169(element.getElementsByTagName("Name").item(0).getTextContent(), element.getElementsByTagName("Location").item(0).getTextContent(), element.getElementsByTagName("ExtranetEndpoint").item(0).getTextContent()));
            }
            return arrayList;
        } catch (Exception e) {
            throw new RuntimeException("Failed to parse ListBuckets response", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m38506() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(C3261.getTimeZone("GMT"));
        String format = simpleDateFormat.format(new Date());
        String str = this.f50348;
        String m14172 = C4860.m14172("GET\n\n\n", format, "\n/");
        try {
            Charset charset = StandardCharsets.UTF_8;
            SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(charset), "HmacSHA1");
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(secretKeySpec);
            String encodeToString = C19490.getEncoder().encodeToString(mac.doFinal(m14172.getBytes(charset)));
            C9449 c9449 = new C9449();
            c9449.m24282("https://oss-cn-hangzhou.aliyuncs.com");
            c9449.m24277("GET", (AbstractC2393) null);
            c9449.m24276("Date", format);
            c9449.m24276("Authorization", C23202.m51498(new StringBuilder("OSS "), this.f50347, ":", encodeToString));
            C18621 execute = C4925.m14323().m40469(c9449.m24274()).execute();
            try {
                if (execute.m43173()) {
                    AbstractC0275 m43170 = execute.m43170();
                    C11003.requireNonNull(m43170);
                    ArrayList m38505 = m38505(m43170.m1611());
                    execute.close();
                    return m38505;
                }
                if (execute.m43177() != 401 && execute.m43177() != 403) {
                    throw new IOException("Request failed: " + execute.m43177() + " " + execute.m43171());
                }
                throw new C19401(R.string.MT_Protector_res_0x7f120703);
            } catch (Throwable th) {
                try {
                    execute.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
