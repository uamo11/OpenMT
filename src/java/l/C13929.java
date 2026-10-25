package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: I81B */
/* renamed from: l.ܰܺ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13929 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f41603;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f41604;

    public C13929(String str, String str2) {
        this.f41603 = str;
        this.f41604 = str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m33364() {
        String string;
        ArrayList arrayList = new ArrayList();
        String m33363 = m33363("/buckets");
        C9449 c9449 = new C9449();
        c9449.m24282("https://uc.qiniuapi.com/buckets");
        c9449.m24276("Authorization", "Qiniu " + m33363);
        c9449.m24281();
        try {
            C18621 execute = C4925.m14323().m40469(c9449.m24274()).execute();
            try {
                if (!execute.m43173()) {
                    if (execute.m43177() != 401 && execute.m43177() != 403) {
                        throw new IOException("Request failed: " + execute.m43177() + " " + execute.m43171());
                    }
                    throw new C19401(R.string.MT_Protector_res_0x7f120703);
                }
                AbstractC0275 m43170 = execute.m43170();
                C11003.requireNonNull(m43170);
                String m1612 = m43170.m1612();
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray = new JSONArray(m1612);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList2.add(jSONArray.getString(i));
                }
                execute.close();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    String m46315 = C20094.m46315("/v2/bucketInfo?bucket=", str);
                    String m463152 = C20094.m46315("https://uc.qiniuapi.com", m46315);
                    String m333632 = m33363(m46315);
                    C9449 c94492 = new C9449();
                    c94492.m24282(m463152);
                    c94492.m24276("Authorization", "Qiniu " + m333632);
                    c94492.m24281();
                    try {
                        execute = C4925.m14323().m40469(c94492.m24274()).execute();
                        try {
                            if (!execute.m43173()) {
                                throw new IOException("Request failed: " + execute.m43177() + " " + execute.m43171());
                            }
                            AbstractC0275 m431702 = execute.m43170();
                            C11003.requireNonNull(m431702);
                            string = new JSONObject(m431702.m1612()).getString("region");
                            execute.close();
                            string.getClass();
                            switch (string) {
                                case "z0":
                                    string = "cn-east-1";
                                    break;
                                case "z1":
                                    string = "cn-north-1";
                                    break;
                                case "z2":
                                    string = "cn-south-1";
                                    break;
                                case "as0":
                                    string = "ap-southeast-1";
                                    break;
                                case "na0":
                                    string = "us-north-1";
                                    break;
                            }
                            arrayList.add(new C6169(str, string, C4860.m14172("s3.", string, ".qiniucs.com")));
                        } finally {
                        }
                    } catch (JSONException e) {
                        throw new IOException(e);
                    }
                }
                return arrayList;
            } finally {
                try {
                    execute.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } catch (JSONException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m33363(String str) {
        String m44858 = C19462.m44858("GET ", str, "\nHost: uc.qiniuapi.com", "\n\n");
        Charset charset = StandardCharsets.UTF_8;
        byte[] bytes = m44858.getBytes(charset);
        String str2 = this.f41604;
        try {
            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(new SecretKeySpec(str2.getBytes(charset), "HmacSHA1"));
            return C23202.m51498(new StringBuilder(), this.f41603, ":", C19490.getEncoder().encodeToString(mac.doFinal(bytes)).replace('+', '-').replace('/', '_'));
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate HMAC signature", e);
        }
    }
}
