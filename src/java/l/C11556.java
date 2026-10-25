package l;

import java.io.Closeable;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: CAV9 */
/* renamed from: l.ۨ۟ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11556 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public SimpleDateFormat f34486;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f34487;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C7322 f34488;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f34489;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f34490;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ArrayList f34491;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f34492;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9279 f34493;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C14216[] f34494;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23389 f34495;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14216 f34496;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public ArrayList f34497;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final DateFormat m28436() {
        if (this.f34486 == null) {
            String str = this.f34492;
            C7322 c7322 = this.f34488;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, c7322.f22492);
            this.f34486 = simpleDateFormat;
            simpleDateFormat.setTimeZone(c7322.f22485);
        }
        return this.f34486;
    }

    public C11556(String str, C23389 c23389, int i) {
        C7322 c7322 = new C7322(str, i);
        this.f34492 = AbstractC5206.f16310;
        this.f34487 = 0;
        this.f34490 = 0;
        this.f34489 = null;
        this.f34491 = null;
        this.f34488 = c7322;
        this.f34495 = c23389;
        this.f34493 = c23389.f75139;
        char c = c7322.f22497;
        String str2 = c7322.f22489;
        int i2 = c7322.f22493;
        if (c == '{') {
            int i3 = c7322.f22486 + 1;
            c7322.f22486 = i3;
            c7322.f22497 = i3 < i2 ? str2.charAt(i3) : (char) 26;
            c7322.f22491 = 12;
            return;
        }
        if (c == '[') {
            int i4 = c7322.f22486 + 1;
            c7322.f22486 = i4;
            c7322.f22497 = i4 < i2 ? str2.charAt(i4) : (char) 26;
            c7322.f22491 = 14;
            return;
        }
        c7322.m19638();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x028b, code lost:
    
        if (r3 != null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x028f, code lost:
    
        if (r13 != java.lang.Cloneable.class) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0291, code lost:
    
        r3 = new java.util.HashMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x029d, code lost:
    
        if ("java.util.Collections$EmptyMap".equals(r5) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x029f, code lost:
    
        r3 = java.util.Collections.EMPTY_MAP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02a2, code lost:
    
        r3 = r13.newInstance();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02a6, code lost:
    
        if (r11 != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02a8, code lost:
    
        r21.f34496 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02aa, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02b3, code lost:
    
        throw new l.C15082("create instance error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02b4, code lost:
    
        r21.f34490 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02b9, code lost:
    
        if (r21.f34496 == null) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x02bd, code lost:
    
        if ((r23 instanceof java.lang.Integer) != false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02bf, code lost:
    
        m28445();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02c6, code lost:
    
        if (r22.size() <= 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02c8, code lost:
    
        r0 = l.C19426.m44735(r22, r13, r15);
        m28447(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02cf, code lost:
    
        if (r11 != false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02d1, code lost:
    
        r21.f34496 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02d3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02d4, code lost:
    
        r0 = r15.m51838((java.lang.reflect.Type) r13);
        r2 = r0.mo5204(r21, r13, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02de, code lost:
    
        if ((r0 instanceof l.C17039) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02e0, code lost:
    
        r21.f34490 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02e3, code lost:
    
        if (r11 != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02e5, code lost:
    
        r21.f34496 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02e7, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x05e4, code lost:
    
        return r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0230, code lost:
    
        r3 = null;
        r13 = r15.m51836(r5, r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0243, code lost:
    
        r4.m19641(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x024c, code lost:
    
        if (r4.f22491 != 13) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x024e, code lost:
    
        r4.m19641(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0251, code lost:
    
        r2 = r15.m51838((java.lang.reflect.Type) r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0257, code lost:
    
        if ((r2 instanceof l.C1517) == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0259, code lost:
    
        r2 = (l.C1517) r2;
        r3 = r2.m5203((l.C11556) r21, r13);
        r0 = r22.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x026b, code lost:
    
        if (r0.hasNext() == false) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026d, code lost:
    
        r4 = (java.util.Map.Entry) r0.next();
        r6 = r4.getKey();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0279, code lost:
    
        if ((r6 instanceof java.lang.String) == false) goto L438;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027b, code lost:
    
        r6 = r2.m5205((java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0281, code lost:
    
        if (r6 == null) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0283, code lost:
    
        r6.mo17832(r3, r4.getValue());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03cb A[Catch: all -> 0x00c6, TryCatch #1 {all -> 0x00c6, blocks: (B:19:0x0066, B:22:0x0072, B:26:0x007b, B:30:0x0092, B:32:0x009e, B:36:0x00a7, B:37:0x00c5, B:41:0x01cd, B:44:0x01dc, B:354:0x01f6, B:58:0x01fe, B:61:0x0205, B:63:0x020d, B:64:0x0214, B:67:0x021c, B:71:0x022b, B:74:0x0230, B:76:0x023c, B:80:0x0243, B:82:0x024e, B:84:0x0251, B:86:0x0259, B:87:0x0267, B:89:0x026d, B:92:0x027b, B:95:0x0283, B:104:0x0291, B:105:0x0297, B:107:0x029f, B:108:0x02a2, B:113:0x02ac, B:114:0x02b3, B:115:0x02b4, B:117:0x02bb, B:119:0x02bf, B:120:0x02c2, B:122:0x02c8, B:126:0x02d4, B:128:0x02e0, B:139:0x02f2, B:142:0x02fa, B:144:0x0301, B:146:0x0312, B:148:0x031a, B:151:0x031f, B:153:0x0323, B:154:0x036d, B:156:0x0373, B:160:0x037d, B:161:0x0397, B:163:0x0328, B:165:0x0330, B:168:0x0335, B:169:0x0341, B:172:0x034a, B:176:0x0350, B:179:0x0356, B:180:0x0362, B:181:0x0398, B:182:0x03b4, B:186:0x03bb, B:192:0x03cb, B:194:0x03d1, B:196:0x03dd, B:197:0x03e3, B:199:0x03e8, B:201:0x054a, B:205:0x0554, B:208:0x055d, B:211:0x056c, B:214:0x0568, B:218:0x0574, B:221:0x0583, B:223:0x058c, B:226:0x059b, B:228:0x05db, B:232:0x0597, B:235:0x05a6, B:238:0x05b5, B:239:0x05b1, B:242:0x05c0, B:245:0x05cf, B:246:0x05cb, B:247:0x05d6, B:248:0x057f, B:249:0x05e5, B:250:0x05fd, B:251:0x03ee, B:256:0x0402, B:261:0x0411, B:264:0x0424, B:266:0x042d, B:269:0x0439, B:271:0x0443, B:272:0x044a, B:281:0x0450, B:278:0x0462, B:279:0x047a, B:285:0x0447, B:286:0x0436, B:287:0x0420, B:290:0x047f, B:293:0x048e, B:295:0x049d, B:298:0x04b1, B:299:0x04b7, B:302:0x04c1, B:303:0x04c3, B:305:0x04c8, B:307:0x04d1, B:309:0x04da, B:310:0x04dd, B:318:0x04e3, B:320:0x04ea, B:315:0x04f7, B:316:0x050f, B:324:0x04d5, B:326:0x04a8, B:327:0x048a, B:330:0x0516, B:332:0x0520, B:335:0x0533, B:337:0x053d, B:338:0x05fe, B:340:0x060d, B:341:0x0611, B:349:0x061a, B:346:0x0633, B:347:0x064b, B:361:0x01d8, B:362:0x01fc, B:424:0x00cf, B:427:0x00de, B:431:0x00da, B:367:0x00f1, B:369:0x00fb, B:370:0x00fe, B:374:0x0104, B:375:0x011a, B:384:0x012f, B:386:0x0135, B:388:0x013a, B:390:0x0146, B:392:0x014b, B:396:0x0152, B:397:0x016a, B:398:0x013f, B:400:0x016b, B:401:0x0183, B:409:0x018d, B:412:0x019c, B:414:0x01a2, B:415:0x01c0, B:416:0x01c1, B:418:0x064c, B:419:0x0666, B:421:0x0667, B:422:0x0681), top: B:18:0x0066, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x055d A[Catch: all -> 0x00c6, TryCatch #1 {all -> 0x00c6, blocks: (B:19:0x0066, B:22:0x0072, B:26:0x007b, B:30:0x0092, B:32:0x009e, B:36:0x00a7, B:37:0x00c5, B:41:0x01cd, B:44:0x01dc, B:354:0x01f6, B:58:0x01fe, B:61:0x0205, B:63:0x020d, B:64:0x0214, B:67:0x021c, B:71:0x022b, B:74:0x0230, B:76:0x023c, B:80:0x0243, B:82:0x024e, B:84:0x0251, B:86:0x0259, B:87:0x0267, B:89:0x026d, B:92:0x027b, B:95:0x0283, B:104:0x0291, B:105:0x0297, B:107:0x029f, B:108:0x02a2, B:113:0x02ac, B:114:0x02b3, B:115:0x02b4, B:117:0x02bb, B:119:0x02bf, B:120:0x02c2, B:122:0x02c8, B:126:0x02d4, B:128:0x02e0, B:139:0x02f2, B:142:0x02fa, B:144:0x0301, B:146:0x0312, B:148:0x031a, B:151:0x031f, B:153:0x0323, B:154:0x036d, B:156:0x0373, B:160:0x037d, B:161:0x0397, B:163:0x0328, B:165:0x0330, B:168:0x0335, B:169:0x0341, B:172:0x034a, B:176:0x0350, B:179:0x0356, B:180:0x0362, B:181:0x0398, B:182:0x03b4, B:186:0x03bb, B:192:0x03cb, B:194:0x03d1, B:196:0x03dd, B:197:0x03e3, B:199:0x03e8, B:201:0x054a, B:205:0x0554, B:208:0x055d, B:211:0x056c, B:214:0x0568, B:218:0x0574, B:221:0x0583, B:223:0x058c, B:226:0x059b, B:228:0x05db, B:232:0x0597, B:235:0x05a6, B:238:0x05b5, B:239:0x05b1, B:242:0x05c0, B:245:0x05cf, B:246:0x05cb, B:247:0x05d6, B:248:0x057f, B:249:0x05e5, B:250:0x05fd, B:251:0x03ee, B:256:0x0402, B:261:0x0411, B:264:0x0424, B:266:0x042d, B:269:0x0439, B:271:0x0443, B:272:0x044a, B:281:0x0450, B:278:0x0462, B:279:0x047a, B:285:0x0447, B:286:0x0436, B:287:0x0420, B:290:0x047f, B:293:0x048e, B:295:0x049d, B:298:0x04b1, B:299:0x04b7, B:302:0x04c1, B:303:0x04c3, B:305:0x04c8, B:307:0x04d1, B:309:0x04da, B:310:0x04dd, B:318:0x04e3, B:320:0x04ea, B:315:0x04f7, B:316:0x050f, B:324:0x04d5, B:326:0x04a8, B:327:0x048a, B:330:0x0516, B:332:0x0520, B:335:0x0533, B:337:0x053d, B:338:0x05fe, B:340:0x060d, B:341:0x0611, B:349:0x061a, B:346:0x0633, B:347:0x064b, B:361:0x01d8, B:362:0x01fc, B:424:0x00cf, B:427:0x00de, B:431:0x00da, B:367:0x00f1, B:369:0x00fb, B:370:0x00fe, B:374:0x0104, B:375:0x011a, B:384:0x012f, B:386:0x0135, B:388:0x013a, B:390:0x0146, B:392:0x014b, B:396:0x0152, B:397:0x016a, B:398:0x013f, B:400:0x016b, B:401:0x0183, B:409:0x018d, B:412:0x019c, B:414:0x01a2, B:415:0x01c0, B:416:0x01c1, B:418:0x064c, B:419:0x0666, B:421:0x0667, B:422:0x0681), top: B:18:0x0066, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01fc A[Catch: all -> 0x00c6, TryCatch #1 {all -> 0x00c6, blocks: (B:19:0x0066, B:22:0x0072, B:26:0x007b, B:30:0x0092, B:32:0x009e, B:36:0x00a7, B:37:0x00c5, B:41:0x01cd, B:44:0x01dc, B:354:0x01f6, B:58:0x01fe, B:61:0x0205, B:63:0x020d, B:64:0x0214, B:67:0x021c, B:71:0x022b, B:74:0x0230, B:76:0x023c, B:80:0x0243, B:82:0x024e, B:84:0x0251, B:86:0x0259, B:87:0x0267, B:89:0x026d, B:92:0x027b, B:95:0x0283, B:104:0x0291, B:105:0x0297, B:107:0x029f, B:108:0x02a2, B:113:0x02ac, B:114:0x02b3, B:115:0x02b4, B:117:0x02bb, B:119:0x02bf, B:120:0x02c2, B:122:0x02c8, B:126:0x02d4, B:128:0x02e0, B:139:0x02f2, B:142:0x02fa, B:144:0x0301, B:146:0x0312, B:148:0x031a, B:151:0x031f, B:153:0x0323, B:154:0x036d, B:156:0x0373, B:160:0x037d, B:161:0x0397, B:163:0x0328, B:165:0x0330, B:168:0x0335, B:169:0x0341, B:172:0x034a, B:176:0x0350, B:179:0x0356, B:180:0x0362, B:181:0x0398, B:182:0x03b4, B:186:0x03bb, B:192:0x03cb, B:194:0x03d1, B:196:0x03dd, B:197:0x03e3, B:199:0x03e8, B:201:0x054a, B:205:0x0554, B:208:0x055d, B:211:0x056c, B:214:0x0568, B:218:0x0574, B:221:0x0583, B:223:0x058c, B:226:0x059b, B:228:0x05db, B:232:0x0597, B:235:0x05a6, B:238:0x05b5, B:239:0x05b1, B:242:0x05c0, B:245:0x05cf, B:246:0x05cb, B:247:0x05d6, B:248:0x057f, B:249:0x05e5, B:250:0x05fd, B:251:0x03ee, B:256:0x0402, B:261:0x0411, B:264:0x0424, B:266:0x042d, B:269:0x0439, B:271:0x0443, B:272:0x044a, B:281:0x0450, B:278:0x0462, B:279:0x047a, B:285:0x0447, B:286:0x0436, B:287:0x0420, B:290:0x047f, B:293:0x048e, B:295:0x049d, B:298:0x04b1, B:299:0x04b7, B:302:0x04c1, B:303:0x04c3, B:305:0x04c8, B:307:0x04d1, B:309:0x04da, B:310:0x04dd, B:318:0x04e3, B:320:0x04ea, B:315:0x04f7, B:316:0x050f, B:324:0x04d5, B:326:0x04a8, B:327:0x048a, B:330:0x0516, B:332:0x0520, B:335:0x0533, B:337:0x053d, B:338:0x05fe, B:340:0x060d, B:341:0x0611, B:349:0x061a, B:346:0x0633, B:347:0x064b, B:361:0x01d8, B:362:0x01fc, B:424:0x00cf, B:427:0x00de, B:431:0x00da, B:367:0x00f1, B:369:0x00fb, B:370:0x00fe, B:374:0x0104, B:375:0x011a, B:384:0x012f, B:386:0x0135, B:388:0x013a, B:390:0x0146, B:392:0x014b, B:396:0x0152, B:397:0x016a, B:398:0x013f, B:400:0x016b, B:401:0x0183, B:409:0x018d, B:412:0x019c, B:414:0x01a2, B:415:0x01c0, B:416:0x01c1, B:418:0x064c, B:419:0x0666, B:421:0x0667, B:422:0x0681), top: B:18:0x0066, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd A[Catch: all -> 0x00c6, TryCatch #1 {all -> 0x00c6, blocks: (B:19:0x0066, B:22:0x0072, B:26:0x007b, B:30:0x0092, B:32:0x009e, B:36:0x00a7, B:37:0x00c5, B:41:0x01cd, B:44:0x01dc, B:354:0x01f6, B:58:0x01fe, B:61:0x0205, B:63:0x020d, B:64:0x0214, B:67:0x021c, B:71:0x022b, B:74:0x0230, B:76:0x023c, B:80:0x0243, B:82:0x024e, B:84:0x0251, B:86:0x0259, B:87:0x0267, B:89:0x026d, B:92:0x027b, B:95:0x0283, B:104:0x0291, B:105:0x0297, B:107:0x029f, B:108:0x02a2, B:113:0x02ac, B:114:0x02b3, B:115:0x02b4, B:117:0x02bb, B:119:0x02bf, B:120:0x02c2, B:122:0x02c8, B:126:0x02d4, B:128:0x02e0, B:139:0x02f2, B:142:0x02fa, B:144:0x0301, B:146:0x0312, B:148:0x031a, B:151:0x031f, B:153:0x0323, B:154:0x036d, B:156:0x0373, B:160:0x037d, B:161:0x0397, B:163:0x0328, B:165:0x0330, B:168:0x0335, B:169:0x0341, B:172:0x034a, B:176:0x0350, B:179:0x0356, B:180:0x0362, B:181:0x0398, B:182:0x03b4, B:186:0x03bb, B:192:0x03cb, B:194:0x03d1, B:196:0x03dd, B:197:0x03e3, B:199:0x03e8, B:201:0x054a, B:205:0x0554, B:208:0x055d, B:211:0x056c, B:214:0x0568, B:218:0x0574, B:221:0x0583, B:223:0x058c, B:226:0x059b, B:228:0x05db, B:232:0x0597, B:235:0x05a6, B:238:0x05b5, B:239:0x05b1, B:242:0x05c0, B:245:0x05cf, B:246:0x05cb, B:247:0x05d6, B:248:0x057f, B:249:0x05e5, B:250:0x05fd, B:251:0x03ee, B:256:0x0402, B:261:0x0411, B:264:0x0424, B:266:0x042d, B:269:0x0439, B:271:0x0443, B:272:0x044a, B:281:0x0450, B:278:0x0462, B:279:0x047a, B:285:0x0447, B:286:0x0436, B:287:0x0420, B:290:0x047f, B:293:0x048e, B:295:0x049d, B:298:0x04b1, B:299:0x04b7, B:302:0x04c1, B:303:0x04c3, B:305:0x04c8, B:307:0x04d1, B:309:0x04da, B:310:0x04dd, B:318:0x04e3, B:320:0x04ea, B:315:0x04f7, B:316:0x050f, B:324:0x04d5, B:326:0x04a8, B:327:0x048a, B:330:0x0516, B:332:0x0520, B:335:0x0533, B:337:0x053d, B:338:0x05fe, B:340:0x060d, B:341:0x0611, B:349:0x061a, B:346:0x0633, B:347:0x064b, B:361:0x01d8, B:362:0x01fc, B:424:0x00cf, B:427:0x00de, B:431:0x00da, B:367:0x00f1, B:369:0x00fb, B:370:0x00fe, B:374:0x0104, B:375:0x011a, B:384:0x012f, B:386:0x0135, B:388:0x013a, B:390:0x0146, B:392:0x014b, B:396:0x0152, B:397:0x016a, B:398:0x013f, B:400:0x016b, B:401:0x0183, B:409:0x018d, B:412:0x019c, B:414:0x01a2, B:415:0x01c0, B:416:0x01c1, B:418:0x064c, B:419:0x0666, B:421:0x0667, B:422:0x0681), top: B:18:0x0066, inners: #0, #2 }] */
    /* JADX WARN: Type inference failed for: r21v0, types: [l.ۨ۟ۡ] */
    /* JADX WARN: Type inference failed for: r5v62, types: [java.util.Date] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m28446(java.util.Map r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 1671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11556.m28446(java.util.Map, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m28435(String str, Type type) {
        C7322 c7322 = this.f34488;
        int i = c7322.f22491;
        if (i == 8) {
            c7322.m19638();
            return null;
        }
        if (i == 4) {
            if (type == byte[].class) {
                byte[] m19625 = c7322.m19625();
                c7322.m19638();
                return m19625;
            }
            if (type == char[].class) {
                String m19634 = c7322.m19634();
                c7322.m19638();
                return m19634.toCharArray();
            }
        }
        try {
            return this.f34495.m51838(type).mo5204(this, type, str);
        } catch (C15082 e) {
            throw e;
        } catch (Exception e2) {
            throw new C15082(e2.getMessage(), (Throwable) e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28439(Type type, Collection collection, Object obj) {
        InterfaceC19157 m51838;
        String str;
        C7322 c7322 = this.f34488;
        int i = c7322.f22491;
        if (i == 21 || i == 22) {
            c7322.m19638();
        }
        if (c7322.f22491 != 14) {
            throw new C15082("exepct '[', but " + C19993.m46101(c7322.f22491) + ", " + c7322.m19654());
        }
        C12101 c12101 = C12101.f36173;
        Class cls = Integer.TYPE;
        if (cls != type) {
            if (String.class == type) {
                c7322.m19641(4);
                m51838 = C9548.f28964;
            } else {
                m51838 = this.f34495.m51838(type);
                c7322.m19641(12);
            }
        } else {
            c7322.m19641(2);
            m51838 = c12101;
        }
        C14216 c14216 = this.f34496;
        if (!c7322.f22499) {
            m28437(c14216, collection, obj);
        }
        int i2 = 0;
        while (true) {
            try {
                int i3 = c7322.f22491;
                if (i3 == 16) {
                    c7322.m19638();
                } else if (i3 != 15) {
                    Object obj2 = null;
                    String obj3 = null;
                    if (cls != type) {
                        if (String.class == type) {
                            if (i3 == 4) {
                                str = c7322.m19634();
                                c7322.m19641(16);
                            } else {
                                Object m28434 = m28434((Object) null);
                                if (m28434 != null) {
                                    obj3 = m28434.toString();
                                }
                                str = obj3;
                            }
                            collection.add(str);
                        } else {
                            if (i3 == 8) {
                                c7322.m19638();
                            } else {
                                obj2 = m51838.mo5204(this, type, Integer.valueOf(i2));
                            }
                            collection.add(obj2);
                            if (this.f34490 == 1) {
                                m28440(collection);
                            }
                        }
                    } else {
                        collection.add(c12101.mo5204(this, null, null));
                    }
                    if (c7322.f22491 == 16) {
                        c7322.m19638();
                    }
                    i2++;
                } else {
                    this.f34496 = c14216;
                    c7322.m19641(16);
                    return;
                }
            } catch (Throwable th) {
                this.f34496 = c14216;
                throw th;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28447(Object obj) {
        Object mo5204;
        Class<?> cls = obj.getClass();
        C23389 c23389 = this.f34495;
        InterfaceC19157 m51838 = c23389.m51838((Type) cls);
        C1517 c1517 = m51838 instanceof C1517 ? (C1517) m51838 : null;
        C7322 c7322 = this.f34488;
        int i = c7322.f22491;
        if (i != 12 && i != 16) {
            throw new C15082("syntax error, expect {, actual ".concat(C19993.m46101(i)));
        }
        while (true) {
            String m19618 = c7322.m19618(this.f34493);
            if (m19618 == null) {
                int i2 = c7322.f22491;
                if (i2 == 13) {
                    c7322.m19641(16);
                    return;
                } else if (i2 == 16) {
                    continue;
                }
            }
            AbstractC18451 m5205 = c1517 != null ? c1517.m5205(m19618) : null;
            if (m5205 == null) {
                if ((c7322.f22495 & EnumC13671.IgnoreNotMatch.f40811) == 0) {
                    throw new C15082("setter not found, class " + cls.getName() + ", property " + m19618);
                }
                c7322.m19635();
                m28434((Object) null);
                if (c7322.f22491 == 13) {
                    c7322.m19638();
                    return;
                }
            } else {
                C15896 c15896 = m5205.f57230;
                Class cls2 = c15896.f49114;
                Type type = c15896.f49121;
                Class cls3 = Integer.TYPE;
                C12101 c12101 = C12101.f36173;
                if (cls2 == cls3) {
                    c7322.m19635();
                    mo5204 = c12101.mo5204(this, type, null);
                } else if (cls2 == String.class) {
                    c7322.m19635();
                    mo5204 = m28451();
                } else if (cls2 == Long.TYPE) {
                    c7322.m19635();
                    mo5204 = c12101.mo5204(this, type, null);
                } else {
                    InterfaceC19157 m51837 = c23389.m51837(cls2, type);
                    c7322.m19635();
                    mo5204 = m51837.mo5204(this, type, null);
                }
                m5205.mo17832(obj, mo5204);
                int i3 = c7322.f22491;
                if (i3 != 16 && i3 == 13) {
                    c7322.m19641(16);
                    return;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28440(Collection collection) {
        if (collection instanceof List) {
            C5911 m28449 = m28449();
            m28449.f18142 = new C6456(this, (List) collection, collection.size() - 1);
            m28449.f18143 = this.f34496;
            this.f34490 = 0;
            return;
        }
        C5911 m284492 = m28449();
        m284492.f18142 = new C6456(collection);
        m284492.f18143 = this.f34496;
        this.f34490 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28442(Map map, Object obj) {
        C6456 c6456 = new C6456(map, obj);
        C5911 m28449 = m28449();
        m28449.f18142 = c6456;
        m28449.f18143 = this.f34496;
        this.f34490 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019f A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:11:0x002a, B:14:0x003c, B:21:0x0049, B:24:0x0057, B:28:0x0070, B:30:0x0074, B:32:0x007e, B:35:0x008c, B:37:0x0095, B:42:0x009e, B:43:0x0088, B:47:0x00a5, B:50:0x00b3, B:52:0x00bc, B:53:0x00bf, B:58:0x00af, B:45:0x00c9, B:59:0x00cc, B:62:0x00d2, B:86:0x0100, B:88:0x01a8, B:90:0x01af, B:91:0x01b2, B:93:0x01b8, B:95:0x01bc, B:101:0x01cc, B:105:0x01d8, B:108:0x01eb, B:110:0x01e7, B:111:0x01ee, B:115:0x0107, B:120:0x0111, B:121:0x011e, B:123:0x0124, B:124:0x012b, B:125:0x012c, B:127:0x0133, B:128:0x0143, B:129:0x013e, B:130:0x014c, B:131:0x0151, B:132:0x0159, B:133:0x0161, B:135:0x0171, B:137:0x017c, B:138:0x0183, B:139:0x0187, B:141:0x018e, B:142:0x0198, B:143:0x0193, B:144:0x019f, B:145:0x0053, B:146:0x005c, B:147:0x0060, B:150:0x0069), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:11:0x002a, B:14:0x003c, B:21:0x0049, B:24:0x0057, B:28:0x0070, B:30:0x0074, B:32:0x007e, B:35:0x008c, B:37:0x0095, B:42:0x009e, B:43:0x0088, B:47:0x00a5, B:50:0x00b3, B:52:0x00bc, B:53:0x00bf, B:58:0x00af, B:45:0x00c9, B:59:0x00cc, B:62:0x00d2, B:86:0x0100, B:88:0x01a8, B:90:0x01af, B:91:0x01b2, B:93:0x01b8, B:95:0x01bc, B:101:0x01cc, B:105:0x01d8, B:108:0x01eb, B:110:0x01e7, B:111:0x01ee, B:115:0x0107, B:120:0x0111, B:121:0x011e, B:123:0x0124, B:124:0x012b, B:125:0x012c, B:127:0x0133, B:128:0x0143, B:129:0x013e, B:130:0x014c, B:131:0x0151, B:132:0x0159, B:133:0x0161, B:135:0x0171, B:137:0x017c, B:138:0x0183, B:139:0x0187, B:141:0x018e, B:142:0x0198, B:143:0x0193, B:144:0x019f, B:145:0x0053, B:146:0x005c, B:147:0x0060, B:150:0x0069), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d2 A[Catch: all -> 0x01fa, LOOP:1: B:60:0x00ce->B:62:0x00d2, LOOP_END, TryCatch #0 {all -> 0x01fa, blocks: (B:11:0x002a, B:14:0x003c, B:21:0x0049, B:24:0x0057, B:28:0x0070, B:30:0x0074, B:32:0x007e, B:35:0x008c, B:37:0x0095, B:42:0x009e, B:43:0x0088, B:47:0x00a5, B:50:0x00b3, B:52:0x00bc, B:53:0x00bf, B:58:0x00af, B:45:0x00c9, B:59:0x00cc, B:62:0x00d2, B:86:0x0100, B:88:0x01a8, B:90:0x01af, B:91:0x01b2, B:93:0x01b8, B:95:0x01bc, B:101:0x01cc, B:105:0x01d8, B:108:0x01eb, B:110:0x01e7, B:111:0x01ee, B:115:0x0107, B:120:0x0111, B:121:0x011e, B:123:0x0124, B:124:0x012b, B:125:0x012c, B:127:0x0133, B:128:0x0143, B:129:0x013e, B:130:0x014c, B:131:0x0151, B:132:0x0159, B:133:0x0161, B:135:0x0171, B:137:0x017c, B:138:0x0183, B:139:0x0187, B:141:0x018e, B:142:0x0198, B:143:0x0193, B:144:0x019f, B:145:0x0053, B:146:0x005c, B:147:0x0060, B:150:0x0069), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01af A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:11:0x002a, B:14:0x003c, B:21:0x0049, B:24:0x0057, B:28:0x0070, B:30:0x0074, B:32:0x007e, B:35:0x008c, B:37:0x0095, B:42:0x009e, B:43:0x0088, B:47:0x00a5, B:50:0x00b3, B:52:0x00bc, B:53:0x00bf, B:58:0x00af, B:45:0x00c9, B:59:0x00cc, B:62:0x00d2, B:86:0x0100, B:88:0x01a8, B:90:0x01af, B:91:0x01b2, B:93:0x01b8, B:95:0x01bc, B:101:0x01cc, B:105:0x01d8, B:108:0x01eb, B:110:0x01e7, B:111:0x01ee, B:115:0x0107, B:120:0x0111, B:121:0x011e, B:123:0x0124, B:124:0x012b, B:125:0x012c, B:127:0x0133, B:128:0x0143, B:129:0x013e, B:130:0x014c, B:131:0x0151, B:132:0x0159, B:133:0x0161, B:135:0x0171, B:137:0x017c, B:138:0x0183, B:139:0x0187, B:141:0x018e, B:142:0x0198, B:143:0x0193, B:144:0x019f, B:145:0x0053, B:146:0x005c, B:147:0x0060, B:150:0x0069), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b8 A[Catch: all -> 0x01fa, TryCatch #0 {all -> 0x01fa, blocks: (B:11:0x002a, B:14:0x003c, B:21:0x0049, B:24:0x0057, B:28:0x0070, B:30:0x0074, B:32:0x007e, B:35:0x008c, B:37:0x0095, B:42:0x009e, B:43:0x0088, B:47:0x00a5, B:50:0x00b3, B:52:0x00bc, B:53:0x00bf, B:58:0x00af, B:45:0x00c9, B:59:0x00cc, B:62:0x00d2, B:86:0x0100, B:88:0x01a8, B:90:0x01af, B:91:0x01b2, B:93:0x01b8, B:95:0x01bc, B:101:0x01cc, B:105:0x01d8, B:108:0x01eb, B:110:0x01e7, B:111:0x01ee, B:115:0x0107, B:120:0x0111, B:121:0x011e, B:123:0x0124, B:124:0x012b, B:125:0x012c, B:127:0x0133, B:128:0x0143, B:129:0x013e, B:130:0x014c, B:131:0x0151, B:132:0x0159, B:133:0x0161, B:135:0x0171, B:137:0x017c, B:138:0x0183, B:139:0x0187, B:141:0x018e, B:142:0x0198, B:143:0x0193, B:144:0x019f, B:145:0x0053, B:146:0x005c, B:147:0x0060, B:150:0x0069), top: B:10:0x002a }] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28441(java.util.Collection r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11556.m28441(java.util.Collection, java.lang.Object):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28443(C5911 c5911) {
        if (this.f34497 == null) {
            this.f34497 = new ArrayList(2);
        }
        this.f34497.add(c5911);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5911 m28449() {
        return (C5911) C18566.m43105(this.f34497, 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28444(C14216 c14216) {
        if (this.f34488.f22499) {
            return;
        }
        this.f34496 = c14216;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28445() {
        this.f34496 = this.f34496.f42886;
        C14216[] c14216Arr = this.f34494;
        int i = this.f34487;
        c14216Arr[i - 1] = null;
        this.f34487 = i - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14216 m28437(C14216 c14216, Object obj, Object obj2) {
        if (this.f34488.f22499) {
            return null;
        }
        this.f34496 = new C14216(c14216, obj, obj2);
        int i = this.f34487;
        this.f34487 = i + 1;
        C14216[] c14216Arr = this.f34494;
        if (c14216Arr == null) {
            this.f34494 = new C14216[8];
        } else if (i >= c14216Arr.length) {
            C14216[] c14216Arr2 = new C14216[(c14216Arr.length * 3) / 2];
            System.arraycopy(c14216Arr, 0, c14216Arr2, 0, c14216Arr.length);
            this.f34494 = c14216Arr2;
        }
        C14216[] c14216Arr3 = this.f34494;
        C14216 c142162 = this.f34496;
        c14216Arr3[i] = c142162;
        return c142162;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m28448() {
        return m28434((Object) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m28434(Object obj) {
        C7322 c7322 = this.f34488;
        int i = c7322.f22491;
        if (i == 2) {
            Number m19644 = c7322.m19644();
            c7322.m19638();
            return m19644;
        }
        if (i == 3) {
            Number m19617 = c7322.m19617((c7322.f22495 & EnumC13671.UseBigDecimal.f40811) != 0);
            c7322.m19638();
            return m19617;
        }
        if (i == 4) {
            String m19634 = c7322.m19634();
            c7322.m19641(16);
            if ((c7322.f22495 & EnumC13671.AllowISO8601DateFormat.f40811) == 0) {
                return m19634;
            }
            C7322 c73222 = new C7322(m19634);
            try {
                return c73222.m19643(true) ? c73222.f22494.getTime() : m19634;
            } finally {
                c73222.m19640();
            }
        }
        if (i == 12) {
            return m28446((c7322.f22495 & EnumC13671.OrderedField.f40811) != 0 ? new C21434(new LinkedHashMap()) : new C21434(), obj);
        }
        if (i == 14) {
            C0972 c0972 = new C0972();
            m28441(c0972, obj);
            return c0972;
        }
        switch (i) {
            case 6:
                c7322.m19641(16);
                return Boolean.TRUE;
            case 7:
                c7322.m19641(16);
                return Boolean.FALSE;
            case 8:
                break;
            case 9:
                c7322.m19641(18);
                if (c7322.f22491 != 18) {
                    throw new C15082("syntax error, " + c7322.m19654());
                }
                c7322.m19641(10);
                m28438(10);
                long longValue = c7322.m19644().longValue();
                m28438(2);
                m28438(11);
                return new Date(longValue);
            default:
                switch (i) {
                    case 20:
                        if (c7322.m19660()) {
                            return null;
                        }
                        throw new C15082("syntax error, " + c7322.m19654());
                    case 21:
                        c7322.m19638();
                        HashSet hashSet = new HashSet();
                        m28441(hashSet, obj);
                        return hashSet;
                    case 22:
                        c7322.m19638();
                        TreeSet treeSet = new TreeSet();
                        m28441(treeSet, obj);
                        return treeSet;
                    case 23:
                        break;
                    default:
                        throw new C15082("syntax error, " + c7322.m19654());
                }
        }
        c7322.m19638();
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28438(int i) {
        C7322 c7322 = this.f34488;
        if (c7322.f22491 == i) {
            c7322.m19638();
            return;
        }
        throw new C15082("syntax error, expect " + C19993.m46101(i) + ", actual " + C19993.m46101(c7322.f22491));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C7322 c7322 = this.f34488;
        try {
            if (c7322.f22491 == 20) {
            } else {
                throw new C15082("not close json text, token : ".concat(C19993.m46101(c7322.f22491)));
            }
        } finally {
            c7322.m19640();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m28450() {
        String str;
        C14216 c14216;
        ArrayList arrayList = this.f34497;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C5911 c5911 = (C5911) this.f34497.get(i);
            AbstractC18451 abstractC18451 = c5911.f18142;
            if (abstractC18451 != null) {
                C14216 c142162 = c5911.f18143;
                Object obj = null;
                Object obj2 = c142162 != null ? c142162.f42885 : null;
                str = c5911.f18144;
                if (str.startsWith("$")) {
                    for (int i2 = 0; i2 < this.f34487; i2++) {
                        if (str.equals(this.f34494[i2].toString())) {
                            obj = this.f34494[i2].f42885;
                        }
                    }
                } else {
                    c14216 = c5911.f18141;
                    obj = c14216.f42885;
                }
                abstractC18451.mo17832(obj2, obj);
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m28451() {
        C7322 c7322 = this.f34488;
        int i = c7322.f22491;
        if (i != 4) {
            if (i == 2) {
                String m19648 = c7322.m19648();
                c7322.m19641(16);
                return m19648;
            }
            Object m28448 = m28448();
            if (m28448 == null) {
                return null;
            }
            return m28448.toString();
        }
        String m19634 = c7322.m19634();
        char c = c7322.f22497;
        if (c == ',') {
            int i2 = c7322.f22486 + 1;
            c7322.f22486 = i2;
            c7322.f22497 = i2 < c7322.f22493 ? c7322.f22489.charAt(i2) : (char) 26;
            c7322.f22491 = 16;
            return m19634;
        }
        if (c == ']') {
            int i3 = c7322.f22486 + 1;
            c7322.f22486 = i3;
            c7322.f22497 = i3 < c7322.f22493 ? c7322.f22489.charAt(i3) : (char) 26;
            c7322.f22491 = 15;
            return m19634;
        }
        if (c == '}') {
            int i4 = c7322.f22486 + 1;
            c7322.f22486 = i4;
            c7322.f22497 = i4 < c7322.f22493 ? c7322.f22489.charAt(i4) : (char) 26;
            c7322.f22491 = 13;
            return m19634;
        }
        c7322.m19638();
        return m19634;
    }
}
