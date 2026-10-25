package l;

import android.net.Uri;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.y.l;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: 775Q */
/* renamed from: l.ۤۙۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10062 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14293 f30242;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f30243;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10062)) {
            return false;
        }
        C10062 c10062 = (C10062) obj;
        return C11003.equals(this.f30243, c10062.f30243) && C11003.equals(this.f30242, c10062.f30242);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f30242) + (C11003.hashCode(this.f30243) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f30243, this.f30242};
        String[] split = "url;requestConfig".length() == 0 ? new String[0] : "url;requestConfig".split(l.b);
        StringBuilder sb = new StringBuilder("UrlMediaArguments[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m25254() {
        return this.f30243;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14293 m25256() {
        return this.f30242;
    }

    public C10062(String str, C14293 c14293) {
        String trim = str.trim();
        C11003.requireNonNull(c14293);
        if (m25250(trim) == EnumC12178.VALID) {
            this.f30243 = trim;
            this.f30242 = c14293;
            return;
        }
        throw new IllegalArgumentException("Invalid media URL");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static EnumC12178 m25250(String str) {
        if (str == null) {
            return EnumC12178.INVALID;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return EnumC12178.INVALID;
        }
        try {
            URI uri = new URI(trim);
            String scheme = uri.getScheme();
            if (scheme != null && ((scheme.equalsIgnoreCase(a.s) || scheme.equalsIgnoreCase(b.a)) && uri.getHost() != null && !uri.getHost().isEmpty() && uri.getRawUserInfo() == null)) {
                String path = uri.getPath();
                return path != null && path.toLowerCase(Locale.ROOT).endsWith(".mpd") ? EnumC12178.MPD_UNSUPPORTED : EnumC12178.VALID;
            }
            return EnumC12178.INVALID;
        } catch (URISyntaxException unused) {
            return EnumC12178.INVALID;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m25255() {
        MessageDigest m34534 = C14460.m34534();
        C14460.m34528(m34534, this.f30243);
        return "url:".concat(C14460.m34531(m34534.digest()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25252(String str) {
        Uri parse = Uri.parse(this.f30243);
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment != null && !lastPathSegment.isEmpty()) {
            return lastPathSegment;
        }
        String host = parse.getHost();
        return (host == null || host.isEmpty()) ? str : host;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m25253() {
        String path;
        Uri parse = Uri.parse(this.f30243);
        return (parse == null || (path = parse.getPath()) == null || !path.toLowerCase(Locale.ROOT).endsWith(".m3u8")) ? false : true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m25251(String str) {
        if (str != null) {
            C2956.m9016("VideoPlayerUrlArguments:".concat(str));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m25249(String str) {
        return str != null && str.toLowerCase(Locale.ROOT).endsWith(".m3u8");
    }
}
