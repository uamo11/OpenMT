package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/* compiled from: 77U5 */
/* renamed from: l.ۘۡۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3833 extends AbstractC9478 {
    @Override // l.AbstractC9478
    /* renamed from: ֫ */
    public final boolean mo7854(C7381 c7381) {
        super.mo7854(c7381);
        Vector mo1739 = c7381.f22696.m46775().mo1739();
        synchronized (mo1739) {
            if (mo1739.size() <= 0) {
                return false;
            }
            String m19856 = c7381.m19856("PubkeyAcceptedAlgorithms");
            c7381.f22696.m46777().getClass();
            String[] m19866 = c7381.m19866();
            List asList = (m19866 == null || m19866.length <= 0) ? Collections.EMPTY_LIST : Arrays.asList(m19866);
            if (!asList.isEmpty()) {
                c7381.f22696.m46777().getClass();
            }
            List<String> asList2 = Arrays.asList(C19356.m44594(m19856));
            if (asList2.isEmpty()) {
                return false;
            }
            String[] m19876 = c7381.m19876();
            if (m19876 == null || m19876.length <= 0) {
                c7381.f22696.m46777().getClass();
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (String str : asList2) {
                    int length = m19876.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            arrayList2.add(str);
                            break;
                        }
                        if (str.equals(m19876[i])) {
                            arrayList.add(str);
                            break;
                        }
                        i++;
                    }
                }
                if (!arrayList.isEmpty()) {
                    c7381.f22696.m46777().getClass();
                }
                if (!arrayList2.isEmpty()) {
                    c7381.f22696.m46777().getClass();
                }
                if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    if (m11588(c7381, mo1739, arrayList, asList)) {
                        return true;
                    }
                    return m11588(c7381, mo1739, arrayList2, asList);
                }
            }
            return m11588(c7381, mo1739, asList2, asList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x024c, code lost:
    
        if (r8 == '<') goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025f, code lost:
    
        if (r11.mo2692() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0262, code lost:
    
        if (r5 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0264, code lost:
    
        r5 = r11.mo2690();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0268, code lost:
    
        if (r5 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026b, code lost:
    
        if (r6 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x026d, code lost:
    
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0272, code lost:
    
        if (r6.isEmpty() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0278, code lost:
    
        r2 = r6.iterator();
        r10 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0282, code lost:
    
        if (r2.hasNext() == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0288, code lost:
    
        if (r25.f22699 >= r25.f22680) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x028a, code lost:
    
        r6 = (java.lang.String) r2.next();
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0297, code lost:
    
        if (r10.contains(r6) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a1, code lost:
    
        r24.f28798.m21457();
        r24.f28797.m38234((byte) 50);
        r24.f28797.m38256(r7);
        r8 = r24.f28797;
        r9 = java.nio.charset.StandardCharsets.UTF_8;
        r8.m38256("ssh-connection".getBytes(r9));
        r24.f28797.m38256("publickey".getBytes(r9));
        r24.f28797.m38234((byte) 1);
        r24.f28797.m38256(l.C19356.m44592(r6, r9));
        r8 = r24.f28797;
        r8.getClass();
        r8.m38252(0, r5.length, r5);
        r8 = r25.m19873();
        r9 = r8.length;
        r14 = new byte[(r24.f28797.f50017 + r10) - 5];
        r18 = r2;
        r14[0] = (byte) (r9 >>> 24);
        r14[1] = (byte) (r9 >>> 16);
        r14[2] = (byte) (r9 >>> 8);
        r19 = r5;
        r14[3] = (byte) r9;
        java.lang.System.arraycopy(r8, 0, r14, 4, r9);
        java.lang.System.arraycopy(r24.f28797.f50016, 5, r14, r9 + 4, r2.f50017 - 5);
        r2 = r11.mo2689(r6, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0321, code lost:
    
        if (r2 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0323, code lost:
    
        r3.m46777().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03c9, code lost:
    
        r10 = r28;
        r2 = r18;
        r5 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x032c, code lost:
    
        r5 = r24.f28797;
        r5.getClass();
        r5.m38252(0, r2.length, r2);
        r25.m19872(r24.f28798);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x033b, code lost:
    
        r2 = r24.f28797;
        r25.m19863(r2);
        r24.f28797 = r2;
        r5 = r2.f50016[5] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x034b, code lost:
    
        if (r5 != 52) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0358, code lost:
    
        if (r5 != 53) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x035a, code lost:
    
        r2.m38250();
        r24.f28797.m38233();
        r24.f28797.m38233();
        r2 = r24.f28797.m38257();
        r24.f28797.m38257();
        new java.lang.String(r2, 0, r2.length, java.nio.charset.StandardCharsets.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x037e, code lost:
    
        if (r5 != 51) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0380, code lost:
    
        r2.m38250();
        r24.f28797.m38233();
        r24.f28797.m38233();
        r2 = r24.f28797.m38257();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0399, code lost:
    
        if (r24.f28797.m38233() != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x039b, code lost:
    
        r25.f22699++;
        r3.m46777().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03ac, code lost:
    
        if (r25.f22699 < r25.f22680) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03b0, code lost:
    
        if (r4 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03ff, code lost:
    
        r10 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0401, code lost:
    
        r8 = r26;
        r9 = r27;
        r5 = r17;
        r6 = r20;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03c1, code lost:
    
        throw new l.C6301(new java.lang.String(r2, 0, r2.length, java.nio.charset.StandardCharsets.UTF_8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03c2, code lost:
    
        r3.m46777().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x034d, code lost:
    
        r3.m46777().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0355, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0299, code lost:
    
        r3.m46777().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03d1, code lost:
    
        r14 = 5;
        r8 = r26;
        r9 = r27;
        r10 = r28;
        r5 = r17;
        r6 = r20;
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0274, code lost:
    
        r10 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0173, code lost:
    
        r3.m46777().getClass();
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x023c, code lost:
    
        r21 = r2;
        r20 = r6;
        r26 = r8;
        r27 = r9;
        r23 = r10;
        r6 = null;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x024f, code lost:
    
        r21 = r2;
        r20 = r6;
        r26 = r8;
        r27 = r9;
        r23 = r10;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03e0, code lost:
    
        r21 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03e7, code lost:
    
        r20 = r6;
        r26 = r8;
        r27 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03e3, code lost:
    
        r21 = r2;
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03ee, code lost:
    
        r21 = r2;
        r17 = r5;
        r20 = r6;
        r26 = r8;
        r27 = r9;
        r3.m46777().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0123, code lost:
    
        if (r6.contains(r12) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0125, code lost:
    
        r13 = new java.util.ArrayList(1);
        r13.add(r12);
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x012f, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        l.C19356.m44596(r13);
        r12 = r11.mo2687();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0117, code lost:
    
        if (r12.equals(r9) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0119, code lost:
    
        r12 = new java.util.ArrayList(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0131, code lost:
    
        if (r12 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0137, code lost:
    
        if (r12.isEmpty() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
    
        r14 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0140, code lost:
    
        if (r12.isEmpty() != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0148, code lost:
    
        if (r25.f22699 >= r25.f22680) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        r5 = r11.mo2690();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        if (r5 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0152, code lost:
    
        if (r2 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0154, code lost:
    
        r18 = r12.iterator();
        r19 = '3';
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015e, code lost:
    
        if (r18.hasNext() == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0160, code lost:
    
        r21 = r2;
        r2 = (java.lang.String) r18.next();
        r18.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0171, code lost:
    
        if (r10.contains(r2) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017d, code lost:
    
        r20 = r6;
        r24.f28798.m21457();
        r26 = r8;
        r24.f28797.m38234((byte) 50);
        r24.f28797.m38256(r7);
        r6 = r24.f28797;
        r8 = java.nio.charset.StandardCharsets.UTF_8;
        r27 = r9;
        r6.m38256("ssh-connection".getBytes(r8));
        r24.f28797.m38256("publickey".getBytes(r8));
        r24.f28797.m38234((byte) 0);
        r24.f28797.m38256(l.C19356.m44592(r2, r8));
        r6 = r24.f28797;
        r6.getClass();
        r6.m38252(0, r5.length, r5);
        r25.m19872(r24.f28798);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c5, code lost:
    
        r6 = r24.f28797;
        r25.m19863(r6);
        r24.f28797 = r6;
        r8 = r6.f50016[r14] & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
    
        if (r8 != 60) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01eb, code lost:
    
        if (r8 != 51) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f9, code lost:
    
        if (r8 != 53) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01fb, code lost:
    
        r6.m38250();
        r24.f28797.m38233();
        r24.f28797.m38233();
        r6 = r24.f28797.m38257();
        r24.f28797.m38257();
        r22 = r2;
        new java.lang.String(r6, 0, r6.length, java.nio.charset.StandardCharsets.UTF_8);
        r2 = r22;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0225, code lost:
    
        r23 = r10;
        r3.m46777().getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x022e, code lost:
    
        r9 = r27;
        r19 = r8 == true ? 1 : 0;
        r6 = r20;
        r2 = r21;
        r10 = r23;
        r8 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ed, code lost:
    
        r3.m46777().getClass();
        r23 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d6, code lost:
    
        r3.m46777().getClass();
        r6 = new java.util.ArrayList(1);
        r6.add(r2);
        r23 = r10;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m11588(l.C7381 r25, java.util.Vector r26, java.util.List r27, java.util.List r28) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3833.m11588(l.۟ۢۘ, java.util.Vector, java.util.List, java.util.List):boolean");
    }
}
