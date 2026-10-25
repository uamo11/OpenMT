package l;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import org.bouncycastle.i18n.TextBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* compiled from: J72V */
/* renamed from: l.֨ᩳܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1285 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f4515;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4347(String str) {
        int i;
        int lastIndexOf = str.lastIndexOf(47);
        int lastIndexOf2 = str.lastIndexOf(46);
        if (lastIndexOf2 > lastIndexOf && (i = lastIndexOf2 + 1) < str.length()) {
            String str2 = (String) f4515.get(str.substring(i).toLowerCase(Locale.ROOT));
            if (str2 != null) {
                return str2;
            }
        }
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        return guessContentTypeFromName == null ? "application/octet-stream" : guessContentTypeFromName;
    }

    static {
        HashMap hashMap = new HashMap();
        m4348(hashMap, "text/html", "html", "htm", "shtml");
        m4348(hashMap, "application/xhtml+xml", "xhtml", "xht");
        m4348(hashMap, "multipart/related", "mhtml", "mht");
        m4348(hashMap, "text/css", "css");
        m4348(hashMap, "text/javascript", "js", "mjs", "cjs");
        m4348(hashMap, "application/json", "json", "map");
        m4348(hashMap, "application/manifest+json", "webmanifest");
        m4348(hashMap, "application/xml", DocumentReader.RESERVED, "xsl", "xslt");
        m4348(hashMap, "application/wasm", "wasm");
        m4348(hashMap, "image/svg+xml", "svg", "svgz");
        m4348(hashMap, "image/png", "png", "apng");
        m4348(hashMap, "image/jpeg", "jpg", "jpeg", "jpe");
        m4348(hashMap, "image/gif", "gif");
        m4348(hashMap, "image/webp", "webp");
        m4348(hashMap, "image/avif", "avif");
        m4348(hashMap, "image/bmp", "bmp", "dib");
        m4348(hashMap, "image/x-icon", "ico", "cur");
        m4348(hashMap, "image/tiff", "tif", "tiff");
        m4348(hashMap, "font/woff", "woff");
        m4348(hashMap, "font/woff2", "woff2");
        m4348(hashMap, "font/ttf", "ttf");
        m4348(hashMap, "font/otf", "otf");
        m4348(hashMap, "application/vnd.ms-fontobject", "eot");
        m4348(hashMap, "audio/mpeg", "mp3", "mp2", "mpga");
        m4348(hashMap, "audio/ogg", "oga", "ogg", "opus");
        m4348(hashMap, "audio/wav", "wav");
        m4348(hashMap, "audio/mp4", "m4a");
        m4348(hashMap, "audio/aac", "aac");
        m4348(hashMap, "audio/flac", "flac");
        m4348(hashMap, "video/mp4", "mp4", "m4v");
        m4348(hashMap, "video/webm", "webm");
        m4348(hashMap, "video/ogg", "ogv");
        m4348(hashMap, "video/mp2t", "ts", "m2ts");
        m4348(hashMap, "application/vnd.apple.mpegurl", "m3u8");
        m4348(hashMap, "text/vtt", "vtt");
        m4348(hashMap, "application/pdf", "pdf");
        m4348(hashMap, "text/plain", "txt", TextBundle.TEXT_ENTRY);
        m4348(hashMap, "text/csv", "csv");
        f4515 = hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4348(HashMap hashMap, String str, String... strArr) {
        for (String str2 : strArr) {
            hashMap.put(str2, str);
        }
    }
}
