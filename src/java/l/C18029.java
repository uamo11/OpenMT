package l;

import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: B6MB */
/* renamed from: l.ᩳۨۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18029 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22802 m42083(final AbstractC22967 abstractC22967, final C9895 c9895) {
        m42086(c9895);
        C11679 mo6179 = abstractC22967.mo6179();
        final C20146 c20146 = C20146.f65246;
        C4623.m13568(mo6179, c20146);
        C8151 m13566 = C4623.m13566(abstractC22967, c20146);
        try {
            C10164 m16613 = C5930.m16613(m13566, new InterfaceC12985() { // from class: l.۫ۛۜ
                @Override // l.InterfaceC12985
                public final BitmapFactory.Options read() {
                    return C18029.m42079(C9895.this, abstractC22967, c20146);
                }
            });
            m13566.m21622();
            m13566.close();
            abstractC22967.m51108(mo6179);
            m42086(c9895);
            return new C22802(mo6179, m16613);
        } catch (Throwable th) {
            try {
                m13566.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ BitmapFactory.Options m42079(C9895 c9895, AbstractC22967 abstractC22967, C20146 c20146) {
        m42086(c9895);
        return C4623.m13570(abstractC22967, c20146);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0225, code lost:
    
        if (r6 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0227, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x022a, code lost:
    
        r7 = r11;
        r21.m51108(r7);
        r11 = new l.C10103(r5, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0235, code lost:
    
        m42086(r28);
        r1 = m42080(r21, r7, r11, r23, r16, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0247, code lost:
    
        r21.m51108(r7);
        m42086(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024d, code lost:
    
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0250, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0251, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0255, code lost:
    
        if (r1 != null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0258, code lost:
    
        r1.m32759(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x025c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x025b, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0253, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0254, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0114 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #1 {all -> 0x00e1, blocks: (B:24:0x0099, B:26:0x00a0, B:62:0x0114, B:63:0x0117, B:37:0x00eb, B:39:0x00f3, B:41:0x00f7, B:43:0x00fb, B:44:0x00fd, B:45:0x00fe, B:46:0x0105, B:47:0x0106, B:48:0x0108, B:49:0x0109, B:50:0x010b, B:52:0x00da, B:53:0x00dd), top: B:23:0x0099 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13629 m42081(l.AbstractC22967 r21, l.C22802 r22, final l.C19981 r23, long r24, final long r26, final l.C9189 r28) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18029.m42081(l.᩺ۨۜ, l.᩺ۛۜ, l.᩶ۛۜ, long, long, l.ۡ᩺ۜ):l.ܰۛۜ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42089(String str, int i, byte[] bArr) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42084(int i, int i2, byte[] bArr) {
        for (int i3 = 0; i3 < 3; i3++) {
            bArr[i + i3] = (byte) (i2 >>> (i3 * 8));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0325, code lost:
    
        if ("space".equals(r13) != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x024a, code lost:
    
        r5 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0250, code lost:
    
        if (r15.charAt(r5) == 'e') goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0258, code lost:
    
        if (r15.charAt(r5) == 'E') goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0339 A[Catch: XmlPullParserException -> 0x06fe, TRY_ENTER, TryCatch #9 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:12:0x0062, B:13:0x0069, B:19:0x0073, B:22:0x0085, B:24:0x008b, B:28:0x0092, B:29:0x0099, B:31:0x009a, B:33:0x00a0, B:35:0x00a6, B:37:0x00b0, B:39:0x00b6, B:45:0x00c4, B:49:0x00ce, B:51:0x047a, B:52:0x00e1, B:54:0x00e9, B:57:0x0106, B:59:0x010e, B:61:0x0116, B:63:0x011e, B:65:0x0124, B:67:0x012a, B:69:0x0132, B:71:0x0138, B:75:0x0142, B:78:0x0150, B:80:0x0158, B:84:0x0162, B:87:0x016a, B:90:0x0172, B:92:0x0178, B:94:0x017e, B:96:0x0186, B:97:0x01a5, B:99:0x01ab, B:101:0x01de, B:104:0x01e7, B:109:0x0279, B:111:0x027f, B:113:0x0285, B:114:0x028e, B:116:0x0294, B:118:0x029c, B:119:0x029f, B:121:0x02a5, B:123:0x02ab, B:126:0x02b4, B:128:0x02ba, B:130:0x02c0, B:132:0x02c6, B:134:0x02cc, B:136:0x02d2, B:138:0x02d8, B:142:0x02e7, B:147:0x02f7, B:149:0x02fd, B:151:0x0303, B:153:0x030b, B:155:0x0313, B:157:0x032d, B:160:0x0339, B:162:0x0343, B:164:0x034b, B:166:0x0353, B:168:0x0359, B:170:0x0361, B:174:0x037c, B:176:0x0382, B:179:0x0392, B:181:0x039c, B:185:0x03e2, B:186:0x03b8, B:187:0x03bf, B:189:0x03c5, B:191:0x03d1, B:193:0x03dc, B:194:0x03e1, B:197:0x03a7, B:198:0x03ac, B:205:0x0317, B:207:0x031f, B:212:0x03f2, B:213:0x03f9, B:216:0x01f7, B:218:0x01fd, B:229:0x025f, B:230:0x0217, B:244:0x0241, B:255:0x024a, B:257:0x0252, B:259:0x025a, B:261:0x0264, B:270:0x03ff, B:271:0x0406, B:272:0x0407, B:275:0x041c, B:276:0x0423, B:280:0x0431, B:282:0x0435, B:284:0x0438, B:293:0x0446, B:295:0x0460, B:300:0x0470, B:301:0x0477, B:305:0x0495, B:309:0x04da, B:454:0x06f6, B:455:0x06fd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b8 A[Catch: XmlPullParserException -> 0x06fe, TryCatch #9 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:12:0x0062, B:13:0x0069, B:19:0x0073, B:22:0x0085, B:24:0x008b, B:28:0x0092, B:29:0x0099, B:31:0x009a, B:33:0x00a0, B:35:0x00a6, B:37:0x00b0, B:39:0x00b6, B:45:0x00c4, B:49:0x00ce, B:51:0x047a, B:52:0x00e1, B:54:0x00e9, B:57:0x0106, B:59:0x010e, B:61:0x0116, B:63:0x011e, B:65:0x0124, B:67:0x012a, B:69:0x0132, B:71:0x0138, B:75:0x0142, B:78:0x0150, B:80:0x0158, B:84:0x0162, B:87:0x016a, B:90:0x0172, B:92:0x0178, B:94:0x017e, B:96:0x0186, B:97:0x01a5, B:99:0x01ab, B:101:0x01de, B:104:0x01e7, B:109:0x0279, B:111:0x027f, B:113:0x0285, B:114:0x028e, B:116:0x0294, B:118:0x029c, B:119:0x029f, B:121:0x02a5, B:123:0x02ab, B:126:0x02b4, B:128:0x02ba, B:130:0x02c0, B:132:0x02c6, B:134:0x02cc, B:136:0x02d2, B:138:0x02d8, B:142:0x02e7, B:147:0x02f7, B:149:0x02fd, B:151:0x0303, B:153:0x030b, B:155:0x0313, B:157:0x032d, B:160:0x0339, B:162:0x0343, B:164:0x034b, B:166:0x0353, B:168:0x0359, B:170:0x0361, B:174:0x037c, B:176:0x0382, B:179:0x0392, B:181:0x039c, B:185:0x03e2, B:186:0x03b8, B:187:0x03bf, B:189:0x03c5, B:191:0x03d1, B:193:0x03dc, B:194:0x03e1, B:197:0x03a7, B:198:0x03ac, B:205:0x0317, B:207:0x031f, B:212:0x03f2, B:213:0x03f9, B:216:0x01f7, B:218:0x01fd, B:229:0x025f, B:230:0x0217, B:244:0x0241, B:255:0x024a, B:257:0x0252, B:259:0x025a, B:261:0x0264, B:270:0x03ff, B:271:0x0406, B:272:0x0407, B:275:0x041c, B:276:0x0423, B:280:0x0431, B:282:0x0435, B:284:0x0438, B:293:0x0446, B:295:0x0460, B:300:0x0470, B:301:0x0477, B:305:0x0495, B:309:0x04da, B:454:0x06f6, B:455:0x06fd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ce A[Catch: XmlPullParserException -> 0x06fe, TryCatch #9 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:12:0x0062, B:13:0x0069, B:19:0x0073, B:22:0x0085, B:24:0x008b, B:28:0x0092, B:29:0x0099, B:31:0x009a, B:33:0x00a0, B:35:0x00a6, B:37:0x00b0, B:39:0x00b6, B:45:0x00c4, B:49:0x00ce, B:51:0x047a, B:52:0x00e1, B:54:0x00e9, B:57:0x0106, B:59:0x010e, B:61:0x0116, B:63:0x011e, B:65:0x0124, B:67:0x012a, B:69:0x0132, B:71:0x0138, B:75:0x0142, B:78:0x0150, B:80:0x0158, B:84:0x0162, B:87:0x016a, B:90:0x0172, B:92:0x0178, B:94:0x017e, B:96:0x0186, B:97:0x01a5, B:99:0x01ab, B:101:0x01de, B:104:0x01e7, B:109:0x0279, B:111:0x027f, B:113:0x0285, B:114:0x028e, B:116:0x0294, B:118:0x029c, B:119:0x029f, B:121:0x02a5, B:123:0x02ab, B:126:0x02b4, B:128:0x02ba, B:130:0x02c0, B:132:0x02c6, B:134:0x02cc, B:136:0x02d2, B:138:0x02d8, B:142:0x02e7, B:147:0x02f7, B:149:0x02fd, B:151:0x0303, B:153:0x030b, B:155:0x0313, B:157:0x032d, B:160:0x0339, B:162:0x0343, B:164:0x034b, B:166:0x0353, B:168:0x0359, B:170:0x0361, B:174:0x037c, B:176:0x0382, B:179:0x0392, B:181:0x039c, B:185:0x03e2, B:186:0x03b8, B:187:0x03bf, B:189:0x03c5, B:191:0x03d1, B:193:0x03dc, B:194:0x03e1, B:197:0x03a7, B:198:0x03ac, B:205:0x0317, B:207:0x031f, B:212:0x03f2, B:213:0x03f9, B:216:0x01f7, B:218:0x01fd, B:229:0x025f, B:230:0x0217, B:244:0x0241, B:255:0x024a, B:257:0x0252, B:259:0x025a, B:261:0x0264, B:270:0x03ff, B:271:0x0406, B:272:0x0407, B:275:0x041c, B:276:0x0423, B:280:0x0431, B:282:0x0435, B:284:0x0438, B:293:0x0446, B:295:0x0460, B:300:0x0470, B:301:0x0477, B:305:0x0495, B:309:0x04da, B:454:0x06f6, B:455:0x06fd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1 A[Catch: XmlPullParserException -> 0x06fe, TryCatch #9 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:12:0x0062, B:13:0x0069, B:19:0x0073, B:22:0x0085, B:24:0x008b, B:28:0x0092, B:29:0x0099, B:31:0x009a, B:33:0x00a0, B:35:0x00a6, B:37:0x00b0, B:39:0x00b6, B:45:0x00c4, B:49:0x00ce, B:51:0x047a, B:52:0x00e1, B:54:0x00e9, B:57:0x0106, B:59:0x010e, B:61:0x0116, B:63:0x011e, B:65:0x0124, B:67:0x012a, B:69:0x0132, B:71:0x0138, B:75:0x0142, B:78:0x0150, B:80:0x0158, B:84:0x0162, B:87:0x016a, B:90:0x0172, B:92:0x0178, B:94:0x017e, B:96:0x0186, B:97:0x01a5, B:99:0x01ab, B:101:0x01de, B:104:0x01e7, B:109:0x0279, B:111:0x027f, B:113:0x0285, B:114:0x028e, B:116:0x0294, B:118:0x029c, B:119:0x029f, B:121:0x02a5, B:123:0x02ab, B:126:0x02b4, B:128:0x02ba, B:130:0x02c0, B:132:0x02c6, B:134:0x02cc, B:136:0x02d2, B:138:0x02d8, B:142:0x02e7, B:147:0x02f7, B:149:0x02fd, B:151:0x0303, B:153:0x030b, B:155:0x0313, B:157:0x032d, B:160:0x0339, B:162:0x0343, B:164:0x034b, B:166:0x0353, B:168:0x0359, B:170:0x0361, B:174:0x037c, B:176:0x0382, B:179:0x0392, B:181:0x039c, B:185:0x03e2, B:186:0x03b8, B:187:0x03bf, B:189:0x03c5, B:191:0x03d1, B:193:0x03dc, B:194:0x03e1, B:197:0x03a7, B:198:0x03ac, B:205:0x0317, B:207:0x031f, B:212:0x03f2, B:213:0x03f9, B:216:0x01f7, B:218:0x01fd, B:229:0x025f, B:230:0x0217, B:244:0x0241, B:255:0x024a, B:257:0x0252, B:259:0x025a, B:261:0x0264, B:270:0x03ff, B:271:0x0406, B:272:0x0407, B:275:0x041c, B:276:0x0423, B:280:0x0431, B:282:0x0435, B:284:0x0438, B:293:0x0446, B:295:0x0460, B:300:0x0470, B:301:0x0477, B:305:0x0495, B:309:0x04da, B:454:0x06f6, B:455:0x06fd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0172 A[Catch: XmlPullParserException -> 0x06fe, TRY_ENTER, TryCatch #9 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:12:0x0062, B:13:0x0069, B:19:0x0073, B:22:0x0085, B:24:0x008b, B:28:0x0092, B:29:0x0099, B:31:0x009a, B:33:0x00a0, B:35:0x00a6, B:37:0x00b0, B:39:0x00b6, B:45:0x00c4, B:49:0x00ce, B:51:0x047a, B:52:0x00e1, B:54:0x00e9, B:57:0x0106, B:59:0x010e, B:61:0x0116, B:63:0x011e, B:65:0x0124, B:67:0x012a, B:69:0x0132, B:71:0x0138, B:75:0x0142, B:78:0x0150, B:80:0x0158, B:84:0x0162, B:87:0x016a, B:90:0x0172, B:92:0x0178, B:94:0x017e, B:96:0x0186, B:97:0x01a5, B:99:0x01ab, B:101:0x01de, B:104:0x01e7, B:109:0x0279, B:111:0x027f, B:113:0x0285, B:114:0x028e, B:116:0x0294, B:118:0x029c, B:119:0x029f, B:121:0x02a5, B:123:0x02ab, B:126:0x02b4, B:128:0x02ba, B:130:0x02c0, B:132:0x02c6, B:134:0x02cc, B:136:0x02d2, B:138:0x02d8, B:142:0x02e7, B:147:0x02f7, B:149:0x02fd, B:151:0x0303, B:153:0x030b, B:155:0x0313, B:157:0x032d, B:160:0x0339, B:162:0x0343, B:164:0x034b, B:166:0x0353, B:168:0x0359, B:170:0x0361, B:174:0x037c, B:176:0x0382, B:179:0x0392, B:181:0x039c, B:185:0x03e2, B:186:0x03b8, B:187:0x03bf, B:189:0x03c5, B:191:0x03d1, B:193:0x03dc, B:194:0x03e1, B:197:0x03a7, B:198:0x03ac, B:205:0x0317, B:207:0x031f, B:212:0x03f2, B:213:0x03f9, B:216:0x01f7, B:218:0x01fd, B:229:0x025f, B:230:0x0217, B:244:0x0241, B:255:0x024a, B:257:0x0252, B:259:0x025a, B:261:0x0264, B:270:0x03ff, B:271:0x0406, B:272:0x0407, B:275:0x041c, B:276:0x0423, B:280:0x0431, B:282:0x0435, B:284:0x0438, B:293:0x0446, B:295:0x0460, B:300:0x0470, B:301:0x0477, B:305:0x0495, B:309:0x04da, B:454:0x06f6, B:455:0x06fd), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ab A[Catch: XmlPullParserException -> 0x06fe, TryCatch #9 {XmlPullParserException -> 0x06fe, blocks: (B:3:0x0008, B:6:0x004e, B:8:0x0055, B:12:0x0062, B:13:0x0069, B:19:0x0073, B:22:0x0085, B:24:0x008b, B:28:0x0092, B:29:0x0099, B:31:0x009a, B:33:0x00a0, B:35:0x00a6, B:37:0x00b0, B:39:0x00b6, B:45:0x00c4, B:49:0x00ce, B:51:0x047a, B:52:0x00e1, B:54:0x00e9, B:57:0x0106, B:59:0x010e, B:61:0x0116, B:63:0x011e, B:65:0x0124, B:67:0x012a, B:69:0x0132, B:71:0x0138, B:75:0x0142, B:78:0x0150, B:80:0x0158, B:84:0x0162, B:87:0x016a, B:90:0x0172, B:92:0x0178, B:94:0x017e, B:96:0x0186, B:97:0x01a5, B:99:0x01ab, B:101:0x01de, B:104:0x01e7, B:109:0x0279, B:111:0x027f, B:113:0x0285, B:114:0x028e, B:116:0x0294, B:118:0x029c, B:119:0x029f, B:121:0x02a5, B:123:0x02ab, B:126:0x02b4, B:128:0x02ba, B:130:0x02c0, B:132:0x02c6, B:134:0x02cc, B:136:0x02d2, B:138:0x02d8, B:142:0x02e7, B:147:0x02f7, B:149:0x02fd, B:151:0x0303, B:153:0x030b, B:155:0x0313, B:157:0x032d, B:160:0x0339, B:162:0x0343, B:164:0x034b, B:166:0x0353, B:168:0x0359, B:170:0x0361, B:174:0x037c, B:176:0x0382, B:179:0x0392, B:181:0x039c, B:185:0x03e2, B:186:0x03b8, B:187:0x03bf, B:189:0x03c5, B:191:0x03d1, B:193:0x03dc, B:194:0x03e1, B:197:0x03a7, B:198:0x03ac, B:205:0x0317, B:207:0x031f, B:212:0x03f2, B:213:0x03f9, B:216:0x01f7, B:218:0x01fd, B:229:0x025f, B:230:0x0217, B:244:0x0241, B:255:0x024a, B:257:0x0252, B:259:0x025a, B:261:0x0264, B:270:0x03ff, B:271:0x0406, B:272:0x0407, B:275:0x041c, B:276:0x0423, B:280:0x0431, B:282:0x0435, B:284:0x0438, B:293:0x0446, B:295:0x0460, B:300:0x0470, B:301:0x0477, B:305:0x0495, B:309:0x04da, B:454:0x06f6, B:455:0x06fd), top: B:2:0x0008 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13629 m42080(l.AbstractC22967 r47, l.C11679 r48, l.C10103 r49, l.C19981 r50, long r51, l.C9189 r53) {
        /*
            Method dump skipped, instructions count: 1824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18029.m42080(l.᩺ۨۜ, l.ۨۨۜ, l.ۤۛۜ, l.᩶ۛۜ, long, l.ۡ᩺ۜ):l.ܰۛۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42085(C7280 c7280, HashMap hashMap, HashSet hashSet, long[] jArr, int i, int i2, boolean z, C9189 c9189) {
        m42086(c9189);
        long j = jArr[0] + 1;
        jArr[0] = j;
        if (j > X931RNG.BLOCK64_RESEED_MAX || i > 64 || !hashSet.add(c7280)) {
            throw new C11514("SVG references exceed safe render limits");
        }
        jArr[1] = Math.max(jArr[1], i);
        jArr[2] = jArr[2] + c7280.f22345;
        long j2 = jArr[4] + c7280.f22350;
        jArr[4] = j2;
        if (j2 > 1048576) {
            throw new C11514("SVG expanded geometry exceeds safe render limits");
        }
        int i3 = i2 + ((!z || i <= 0) ? c7280.f22349 : 3);
        jArr[3] = Math.max(jArr[3], i3);
        Iterator it = c7280.f22346.iterator();
        while (it.hasNext()) {
            C7280 c72802 = (C7280) it.next();
            if (!c72802.f22348 || z) {
                m42085(c72802, hashMap, hashSet, jArr, i + 1, i3, z, c9189);
            }
        }
        Iterator it2 = c7280.f22347.iterator();
        while (it2.hasNext()) {
            C7280 c72803 = (C7280) hashMap.get((String) it2.next());
            if (c72803 != null) {
                m42085(c72803, hashMap, hashSet, jArr, i + 1, i3, z, c9189);
            }
        }
        hashSet.remove(c7280);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42077(float f) {
        if (f <= 0.0f || Float.isInfinite(f) || f > 1000000.0f) {
            throw new IOException("Image has no finite dimensions");
        }
        return Math.max(1, (int) Math.ceil(f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22097 m42082(C19981 c19981, long j) {
        C22097 m46068 = c19981.m46068(j);
        if (m46068 != null) {
            return m46068;
        }
        throw new C1095("Special image reservation exceeds budget");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42086(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new InterruptedIOException("Image decode cancelled");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42087(String str, int i, byte[] bArr) {
        if (i >= 0 && str.length() + i <= bArr.length) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (bArr[i + i2] == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42078(int i, byte[] bArr) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m42088(int i, byte[] bArr) {
        return ((bArr[i + 2] & 255) << 16) | m42078(i, bArr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m42090(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (m42088(i, bArr) & 16777215);
    }
}
