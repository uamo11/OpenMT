package l;

import android.util.Base64;
import com.alipay.sdk.m.t.e;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;

/* compiled from: 41XE */
/* renamed from: l.᩵ܶۡ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19544 implements InterfaceC2799 {
    @Override // l.InterfaceC2799
    /* renamed from: ֫ */
    public final void mo8644(IOException iOException) {
    }

    @Override // l.InterfaceC2799
    /* renamed from: ֫ */
    public final void mo8645(byte[] bArr) {
        boolean m15524;
        HashMap m12702 = C4210.m12702(new String(bArr, Charset.defaultCharset()));
        if (m12702.containsKey("Data")) {
            int parseInt = Integer.parseInt((String) m12702.get(e.g));
            byte[] decode = Base64.decode((String) m12702.get("Data"), 0);
            m15524 = C5432.m15524(decode);
            if (m15524) {
                ApplicationC20075.f65008.edit().mo25854(System.currentTimeMillis(), "JIAGU_TIME").mo25853(parseInt, "JIAGU_VERSION").mo25855("JIAGU_DATA", decode).apply();
            }
        }
    }
}
