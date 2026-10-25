package l;

import bin.mt.plus.R;
import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.l;
import com.amazonaws.auth.AWS4Signer;
import com.google.android.material.datepicker.UtcDates;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.parsers.DocumentBuilderFactory;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: J7U0 */
/* renamed from: l.֨ۖ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0839 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f3033;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f3034;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f3035;

    public C0839(String str, String str2, String str3) {
        this.f3034 = str.concat(".r2.cloudflarestorage.com");
        this.f3033 = str2;
        this.f3035 = str3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m3118() {
        StringBuilder sb = new StringBuilder("https://");
        String str = this.f3034;
        String m23341 = C9045.m23341(sb, str, "/");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AWS4Signer.TIME_PATTERN);
        simpleDateFormat.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        String format = simpleDateFormat.format(new Date());
        String substring = format.substring(0, 8);
        String m3115 = m3115("");
        TreeMap treeMap = new TreeMap();
        treeMap.put(c.f, str);
        treeMap.put("x-amz-content-sha256", m3115);
        treeMap.put("x-amz-date", format);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : treeMap.keySet()) {
            sb2.append(str2.toLowerCase());
            sb2.append(":");
            sb2.append(((String) treeMap.get(str2)).trim());
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        Set keySet = treeMap.keySet();
        StringBuilder sb4 = new StringBuilder();
        Iterator it = keySet.iterator();
        if (it.hasNext()) {
            while (true) {
                sb4.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb4.append((CharSequence) l.b);
            }
        }
        String sb5 = sb4.toString();
        StringBuilder m10501 = C3435.m10501("GET\n/\n\n", sb3, "\n", sb5, "\n");
        m10501.append(m3115);
        String sb6 = m10501.toString();
        String m37867 = C16014.m37867(substring, "/auto/s3/aws4_request");
        StringBuilder m105012 = C3435.m10501("AWS4-HMAC-SHA256\n", format, "\n", m37867, "\n");
        m105012.append(m3115(sb6));
        try {
            String m3116 = m3116(m3117(m105012.toString(), m3117(AWS4Signer.TERMINATOR, m3117("s3", m3117("auto", m3117(substring, ("AWS4" + this.f3035).getBytes(StandardCharsets.UTF_8)))))));
            StringBuilder sb7 = new StringBuilder("AWS4-HMAC-SHA256 Credential=");
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb7, this.f3033, "/", m37867, ", SignedHeaders=");
            String m51498 = C23202.m51498(sb7, sb5, ", Signature=", m3116);
            C9449 c9449 = new C9449();
            c9449.m24282(m23341);
            c9449.m24276("Host", str);
            c9449.m24276("X-Amz-Content-Sha256", m3115);
            c9449.m24276("X-Amz-Date", format);
            c9449.m24276("Authorization", m51498);
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
                            arrayList.add(new C6169(C23102.m51290("Name", (Element) item), null, str));
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
        } catch (Exception e2) {
            throw new RuntimeException("Failed to generate HMAC signature", e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m3117(String str, byte[] bArr) {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        return mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3115(String str) {
        try {
            return m3116(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(str.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3116(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
