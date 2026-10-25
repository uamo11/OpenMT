package l;

import android.text.Html;
import android.webkit.WebResourceResponse;
import bin.mt.plus.R;
import com.alipay.sdk.m.w.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: G72T */
/* renamed from: l.ۖܿܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2676 implements InterfaceC0268, AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f8383;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f8384;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f8386;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f8387;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object f8388;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f8389;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f8390;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8392;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC0921 f8393;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f8394;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f8395;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f8391 = new Object();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final HashSet f8385 = new HashSet();

    public C2676(ActivityC0921 activityC0921, AbstractC13921 abstractC13921, String str, boolean z, AbstractC15440 abstractC15440, String str2, boolean z2) {
        this.f8393 = activityC0921;
        this.f8386 = abstractC13921;
        this.f8388 = abstractC13921 instanceof C2346 ? new Object() : abstractC13921;
        this.f8395 = str;
        this.f8389 = z;
        this.f8387 = abstractC13921 instanceof AbstractC3163;
        this.f8383 = abstractC15440;
        this.f8390 = str2;
        this.f8394 = z2;
    }

    @Override // l.InterfaceC0268
    /* renamed from: ֫ */
    public final WebResourceResponse mo1582(String str) {
        return m8378(str, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WebResourceResponse m8387(String str) {
        if (this.f8387) {
            m8381(false);
        }
        return m8378(str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc A[Catch: all -> 0x0100, TryCatch #0 {, blocks: (B:39:0x0079, B:40:0x007b, B:46:0x0089, B:63:0x00b8, B:65:0x00bc, B:66:0x00e9, B:69:0x00cc, B:71:0x00d6, B:72:0x00dc, B:74:0x00de, B:77:0x00fb, B:82:0x00ff, B:42:0x007c, B:44:0x0082, B:45:0x0088, B:48:0x008b, B:51:0x0091, B:52:0x0097, B:54:0x009b, B:57:0x00a0, B:59:0x00ad, B:62:0x00b7, B:75:0x00f4, B:76:0x00fa, B:79:0x00a7), top: B:38:0x0079, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc A[Catch: all -> 0x0100, TryCatch #0 {, blocks: (B:39:0x0079, B:40:0x007b, B:46:0x0089, B:63:0x00b8, B:65:0x00bc, B:66:0x00e9, B:69:0x00cc, B:71:0x00d6, B:72:0x00dc, B:74:0x00de, B:77:0x00fb, B:82:0x00ff, B:42:0x007c, B:44:0x0082, B:45:0x0088, B:48:0x008b, B:51:0x0091, B:52:0x0097, B:54:0x009b, B:57:0x00a0, B:59:0x00ad, B:62:0x00b7, B:75:0x00f4, B:76:0x00fa, B:79:0x00a7), top: B:38:0x0079, inners: #3 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.webkit.WebResourceResponse m8378(java.lang.String r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2676.m8378(java.lang.String, boolean):android.webkit.WebResourceResponse");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private InterfaceC17889 m8385(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(this.f8395);
        int i = 0;
        while (i < str.length()) {
            int indexOf = str.indexOf(47, i);
            boolean z = indexOf == -1;
            if (z) {
                indexOf = str.length();
            }
            sb.append((CharSequence) str, i, indexOf);
            if (z) {
                str2 = sb.toString();
            } else {
                str2 = ((Object) sb) + "/";
            }
            arrayList.add(str2);
            if (!z) {
                sb.append('/');
            }
            i = indexOf + 1;
        }
        Iterator it = arrayList.iterator();
        InterfaceC17889 interfaceC17889 = null;
        while (it.hasNext()) {
            interfaceC17889 = this.f8386.mo7638((String) it.next());
            if (interfaceC17889 == null || ((C15688) interfaceC17889).mo36978()) {
                return null;
            }
        }
        return interfaceC17889;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ InputStream m8379(C2676 c2676, int i, InterfaceC17889 interfaceC17889) {
        InputStream mo7636;
        synchronized (c2676.f8386) {
            if (!c2676.m8382(i)) {
                throw new IOException("HTML preview request was cancelled");
            }
            mo7636 = c2676.f8386.mo7636(c2676.f8393, interfaceC17889);
        }
        return mo7636;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m8377(String str, String str2, C23157 c23157, int i) {
        synchronized (this.f8391) {
            if (!this.f8392 && i == this.f8384) {
                this.f8385.add(c23157);
                return new WebResourceResponse(str, str2, 200, "OK", m8384(), c23157);
            }
            c23157.close();
            return m8383(404, "Not Found");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private WebResourceResponse m8376(int i, String str, boolean z) {
        if (!this.f8387 || !z) {
            return m8383(i, str);
        }
        return new WebResourceResponse("text/html", a.D, i, str, m8384(), new ByteArrayInputStream(("<!doctype html><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width\"><p>" + Html.escapeHtml(C4925.m14327(R.string.MT_Protector_res_0x7f120711)) + "</p><p><a href=\"\">" + Html.escapeHtml(C4925.m14327(R.string.MT_Protector_res_0x7f1205f5)) + "</a></p>").getBytes(StandardCharsets.UTF_8)));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m8383(int i, String str) {
        return new WebResourceResponse("text/plain", a.D, i, str, m8384(), new ByteArrayInputStream(new byte[0]));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static HashMap m8384() {
        HashMap hashMap = new HashMap();
        hashMap.put("Cache-Control", "no-store");
        hashMap.put("Referrer-Policy", "same-origin");
        hashMap.put("Cross-Origin-Resource-Policy", "same-origin");
        return hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8386() {
        m8381(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m8381(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8381(boolean z) {
        int i;
        C23157[] c23157Arr;
        synchronized (this.f8391) {
            this.f8392 = z | this.f8392;
            this.f8384++;
            c23157Arr = (C23157[]) this.f8385.toArray(new C23157[0]);
            this.f8385.clear();
        }
        for (C23157 c23157 : c23157Arr) {
            c23157.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m8382(int i) {
        boolean z;
        synchronized (this.f8391) {
            z = !this.f8392 && this.f8384 == i;
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8380(C2676 c2676, C23157 c23157) {
        synchronized (c2676.f8391) {
            c2676.f8385.remove(c23157);
        }
    }
}
