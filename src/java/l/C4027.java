package l;

import android.net.Uri;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: I9S8 */
/* renamed from: l.ۘܶܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4027 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f12776 = C16293.f50117.m36526("localStorageMap");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f12778;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Uri f12779;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f12781;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f12782;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f12783;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Map f12780 = C20195.synchronizedMap(new HashMap());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f12777 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12122() {
        this.f12777 = true;
        f12776.m36526(this.f12783).mo27929();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12123() {
        if (this.f12777) {
            return;
        }
        AbstractC15440 abstractC15440 = this.f12782;
        try {
            abstractC15440.mo35195();
            C10130 c10130 = new C10130();
            synchronized (this.f12780) {
                c10130.writeInt(this.f12780.size());
                for (Map.Entry entry : this.f12780.entrySet()) {
                    c10130.m25423((CharSequence) entry.getKey());
                    c10130.m25423((CharSequence) entry.getValue());
                }
            }
            try {
                abstractC15440.m36496(c10130);
            } catch (IOException unused) {
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public C4027(Uri uri, String str, String str2) {
        this.f12779 = uri;
        this.f12783 = str;
        this.f12781 = str2;
        String str3 = uri.getPathSegments().get(1);
        if (!str3.endsWith("/") && !str3.endsWith(":")) {
            str3 = str3.concat("/");
        }
        this.f12778 = str3;
        AbstractC15440 m36526 = f12776.m36526(str);
        this.f12782 = m36526;
        if (m36526.mo23120()) {
            try {
                C12951 m36528 = m36526.m36528();
                int readInt = m36528.readInt();
                for (int i = 0; i < readInt; i++) {
                    this.f12780.put(m36528.m31504(), m36528.m31504());
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12121(String str, boolean z) {
        int lastIndexOf;
        String str2;
        if (str.isEmpty()) {
            return this.f12779.getPathSegments().get(1);
        }
        String m23341 = C9045.m23341(new StringBuilder(), this.f12778, str);
        Map map = this.f12780;
        String str3 = (String) map.get(m23341);
        return str3 != null ? str3 : (!z || (lastIndexOf = m23341.lastIndexOf(47)) == -1 || (str2 = (String) map.get(m23341.substring(0, lastIndexOf))) == null) ? m23341 : C20087.m46305(lastIndexOf, m23341, C5368.m15339(str2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12120() {
        return "/storage/" + this.f12783;
    }
}
