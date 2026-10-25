package l;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: O5NZ */
/* renamed from: l.᩷᩸ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21144 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f68178;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f68179 = new ArrayList();

    static {
        m48096("png", "89 50 4E 47");
        m48096("jpg", "FF D8 FF");
        m48096("gif", "47 49 46 38");
        m48096("webp", "52 49 46 46 ?? ?? ?? ?? 57 45 42 50 56 50 38");
        m48096("bmp", "42 4D");
        m48096("bmp", "42 41");
        m48096("bmp", "43 49");
        m48096("bmp", "43 50");
        m48096("bmp", "49 43");
        m48096("bmp", "50 54");
        m48096("mp4", "00 00 00 ?? 66 74 79 70 69 73 6F 36");
        m48096("mp4", "00 00 00 ?? 66 74 79 70 6D 70 34 32");
        m48096("m4a", "00 00 00 ?? 66 74 79 70 4D 34 41 20");
        m48096("mp3", "49 44 33");
        m48096("ogg", "4F 67 67 53");
        m48096("wav", "52 49 46 46 ?? ?? ?? ?? 57 41 56 45");
        m48096("ttf", "00 01 00 00");
        m48096("ttc", "74 74 63 66");
        m48096("otf", "4F 54 54 4F");
        f68178 = Pattern.compile("\\s*<!doctype *(\\w+)[ >]", 2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48094(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0128, code lost:
    
        if ((r0 instanceof org.json.JSONArray) != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0161 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m48095(byte[] r12) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21144.m48095(byte[]):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48096(String str, String str2) {
        f68179.add(new C23965(str, str2));
    }
}
