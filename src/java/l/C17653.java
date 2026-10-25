package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: J8X0 */
/* renamed from: l.ܿ᩺ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17653 extends AbstractC12382 {
    @Override // l.AbstractC12382
    /* renamed from: ֫ */
    public final C1093 mo19978(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 200 || responseCode >= 300) {
                throw new IOException("Bad response code: " + responseCode + ", url: " + str);
            }
            String headerField = httpURLConnection.getHeaderField("Content-Type");
            if (headerField == null) {
                headerField = null;
            } else {
                int indexOf = headerField.indexOf(59);
                if (indexOf > -1) {
                    headerField = headerField.substring(0, indexOf);
                }
            }
            return AbstractC8149.m21620(new BufferedInputStream(httpURLConnection.getInputStream()), headerField);
        } catch (IOException e) {
            throw new IllegalStateException(C20094.m46315("Exception obtaining network resource: ", str), e);
        }
    }

    @Override // l.AbstractC12382
    /* renamed from: ֫ */
    public final Collection mo19977() {
        return Arrays.asList(a.s, b.a);
    }
}
