package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: D6X3 */
/* renamed from: l.۬ۖۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12821 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final SecureRandom f38466;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f38467;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23868 f38468;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f38469;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17760 f38470;

    static {
        SecureRandom secureRandom = new SecureRandom();
        f38466 = secureRandom;
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        f38467 = C14460.m34531(bArr);
    }

    public C12821(C17760 c17760) {
        C23868 c23868 = new C23868();
        this.f38469 = new LinkedHashMap(16, 0.75f, true);
        this.f38470 = c17760;
        this.f38468 = c23868;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15642 m31191(String str, String str2, boolean z) {
        C17760 c17760 = this.f38470;
        C7383 m41607 = c17760.m41607();
        String m41599 = C17760.m41599(str, m41607, "sourcePath");
        String m41605 = C17760.m41605(str2, m41607, "destinationPath");
        if (m41599.equals(m41605)) {
            throw m31147("FILE_INVALID_PATH", "Source and destination must have different normalized absolute paths.", m41599, m41605, m41607.f22729, "prepare", "same_path", false, null, true, JSON.array());
        }
        C10000 m41609 = c17760.m41609(Arrays.asList(m41599, m41605));
        try {
            C15642 m31157 = m31157(m41607, m41599, m41605, z);
            m41609.close();
            return m31157;
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4355 m31188(String str, boolean z, final C21495 c21495) {
        C17760 c17760 = this.f38470;
        C7383 m41607 = c17760.m41607();
        String m41605 = C17760.m41605(str, m41607, "localPath");
        C10000 m41611 = c17760.m41611(m41605);
        try {
            try {
                C4355 m31150 = m31150(m41605, z, new InterfaceC2944() { // from class: l.ܳۖۜ
                    @Override // l.InterfaceC2944
                    /* renamed from: ֫ */
                    public final C5060 mo8967(AbstractC15440 abstractC15440) {
                        return C12821.m31151(C21495.this, abstractC15440);
                    }

                    @Override // l.InterfaceC2944
                    /* renamed from: ֫ */
                    public final /* synthetic */ void mo8968(C7383 c7383) {
                    }
                }, m41607);
                m41611.close();
                return m31150;
            } catch (C3059 e) {
                throw m31149(e, m41605, m41607.f22729);
            }
        } catch (Throwable th) {
            try {
                m41611.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0120 m31187(String str, boolean z, C7383 c7383, InterfaceC19172 interfaceC19172) {
        this.f38470.getClass();
        String m41605 = C17760.m41605(str, c7383, MotionUtils.EASING_TYPE_PATH);
        if (!m41605.equals(str)) {
            throw C3059.m9364("The claimed file path must be normalized and absolute.", (String) null, (JSONValue) null, (JSONArray) null, (JSONObject) null);
        }
        try {
            return new C0120(m31150(m41605, z, new C23404(this, interfaceC19172, m41605, c7383), c7383));
        } catch (C3059 e) {
            throw m31149(e, m41605, c7383.f22729);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9126 m31190(String str, C22200 c22200) {
        C17760 c17760 = this.f38470;
        C7383 m41607 = c17760.m41607();
        String m41599 = C17760.m41599(str, m41607, "localPath");
        C10000 m41608 = c17760.m41608(m41599);
        try {
            try {
                AbstractC15440 m41612 = c17760.m41612(m41599);
                C12619 m31154 = m31154(m41612.mo23558());
                m31183(m31154, m41599);
                if (m31154.m30884() > 9007199254740991L) {
                    throw m31148("FILE_STORAGE_ERROR", "The local source size exceeds the supported JSON integer range.", m41599, m41607.f22729, "source_stat", "size_out_of_range", false, null, true, JSON.array(), null, null);
                }
                C21289 c21289 = new C21289(this, m41599, m41612, m31154);
                c21289.f68644 = true;
                try {
                    C9126 m29881 = C12322.m29881(c22200.f72009, c22200.f72010, c22200.f72011, c21289);
                    C21289.m48314(c21289);
                    m41608.close();
                    return m29881;
                } finally {
                    c21289.f68644 = false;
                }
            } catch (C3059 e) {
                throw m31149(e, m41599, m41607.f22729);
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x026c, code lost:
    
        r0 = m31147("FILE_STORAGE_ERROR", "The storage backend failed while preparing the copied file.", r32, r33, r4, r5, r0.getClass().getSimpleName(), false, r24, true, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bd, code lost:
    
        r5 = r17;
        r4 = r23;
        r14 = true;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c8, code lost:
    
        r1 = true;
        r2 = true;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e0, code lost:
    
        r9 = r23;
        r1 = r24;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ce, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01d6, code lost:
    
        r9 = r23;
        r1 = r24;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01d2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ea, code lost:
    
        r1 = true;
        r5 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01de, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01df, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d5, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e9, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00af, code lost:
    
        r23 = r9;
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00bf, code lost:
    
        throw m31147("FILE_ALREADY_EXISTS", "The destination appeared before publication and overwrite is false.", r32, r33, r7.f22729, "pre_publish_destination", "already_exists", false, r22, true, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x00c2, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x00cb, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x00c0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x00d6, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x00d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x00e1, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02d5, code lost:
    
        r5 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x00ca, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00c4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x00c5, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        if (r1 == l.EnumC16852.SUCCESS) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0148, code lost:
    
        if (r9 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014a, code lost:
    
        r0 = "Existing destination mode, owner, or group metadata could not be fully captured.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x014f, code lost:
    
        m31161(r10, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0152, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014d, code lost:
    
        r0 = "Source mode, owner, or group metadata could not be fully captured.";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015b, code lost:
    
        r17 = "publish";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015f, code lost:
    
        r21 = r9;
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0176, code lost:
    
        m31168(r33, r26, r2, r5, r4, r3, r19, r7.f22729);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0179, code lost:
    
        r17 = "restore_metadata";
        r1 = r14.m41612(r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017f, code lost:
    
        if (r0 == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0181, code lost:
    
        r0 = r0.m41051(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0186, code lost:
    
        r0 = l.EnumC16852.FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b2, code lost:
    
        r5 = r17;
        r4 = r23;
        r14 = true;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0258, code lost:
    
        r8 = null;
        r7 = r24;
        r18 = r0;
        r0 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0261, code lost:
    
        if (r14 != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0263, code lost:
    
        r6 = r0.getClass().getSimpleName();
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0261  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C15642 m31157(l.C7383 r31, java.lang.String r32, java.lang.String r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12821.m31157(l.۟ۢۜ, java.lang.String, java.lang.String, boolean):l.ܺۖۜ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x048e, code lost:
    
        r0 = m31148("FILE_STORAGE_ERROR", "Failed to prepare local file content for publication.", r31, r7, r16, r0.getClass().getSimpleName(), false, r6, true, r11, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fb, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01fc, code lost:
    
        r1 = true;
        r2 = true;
        r8 = r15;
        r5 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c8, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c9, code lost:
    
        r2 = true;
        r3 = true;
        r16 = "restore_metadata";
        r8 = r15;
        r5 = r18;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01b8, code lost:
    
        r16 = "restore_metadata";
        r5 = r18;
        r6 = r19;
        r7 = r25;
        r1 = true;
        r2 = true;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x020b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x020c, code lost:
    
        r9 = "publish";
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x024a, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0207, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0208, code lost:
    
        r9 = "publish";
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x023e, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0203, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0204, code lost:
    
        r9 = "publish";
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0232, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x020f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0254, code lost:
    
        r1 = true;
        r8 = r15;
        r5 = r18;
        r7 = r25;
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0221, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0222, code lost:
    
        r18 = r34;
        r11 = r8;
        r19 = r15;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x024d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x024e, code lost:
    
        r18 = r34;
        r11 = r8;
        r19 = r15;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0219, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x021a, code lost:
    
        r18 = r34;
        r11 = r8;
        r19 = r15;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0211, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0212, code lost:
    
        r18 = r34;
        r11 = r8;
        r19 = r15;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0080, code lost:
    
        r27 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0095, code lost:
    
        throw m31148("FILE_ALREADY_EXISTS", "The local destination appeared before publication and overwrite is false.", r31, r2.f22729, "pre_publish_destination", "already_exists", false, r6, true, r8, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x009a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0098, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0096, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0170, code lost:
    
        r18 = r34;
        r11 = r8;
        r19 = r15;
        r15 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0183, code lost:
    
        m31168(r31, r3, r5, r13, r4, r7, r27, r2.f22729);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0188, code lost:
    
        r0 = r12.m41612(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018c, code lost:
    
        if (r9 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018e, code lost:
    
        r2 = r9.m41051(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0193, code lost:
    
        r2 = l.EnumC16852.FAILED;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d4, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d5, code lost:
    
        r2 = true;
        r3 = true;
        r16 = "restore_metadata";
        r8 = r15;
        r5 = r18;
        r6 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0481, code lost:
    
        r0 = m31181(r11, r8, r7, r6, r0.getClass().getSimpleName());
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x025e A[LOOP:0: B:11:0x003b->B:43:0x025e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016c A[EDGE_INSN: B:44:0x016c->B:45:0x016c BREAK  A[LOOP:0: B:11:0x003b->B:43:0x025e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0481  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C4355 m31150(java.lang.String r31, boolean r32, l.InterfaceC2944 r33, l.C7383 r34) {
        /*
            Method dump skipped, instructions count: 1401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12821.m31150(java.lang.String, boolean, l.ۗۖۜ, l.۟ۢۜ):l.ۙۖۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8588 m31153(String str, String str2, boolean z, C7383 c7383, JSONArray jSONArray) {
        C17760 c17760 = this.f38470;
        AbstractC15440 m41612 = c17760.m41612(str);
        AbstractC10503 mo23558 = m41612.mo23558();
        C12619 m31154 = m31154(mo23558);
        m31169(m31154, str);
        String str3 = str2 == null ? "The local destination" : "The destination";
        if (!z && m31154.m30885() != EnumC3447.MISSING) {
            String str4 = c7383.f22729;
            String concat = str3.concat(" already exists and overwrite is false.");
            if (str2 == null) {
                throw m31148("FILE_ALREADY_EXISTS", concat, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array(), null, null);
            }
            throw m31147("FILE_ALREADY_EXISTS", concat, str2, str, str4, "destination_stat", "already_exists", false, null, true, JSON.array());
        }
        String parent = m41612.getParent();
        if (parent == null) {
            String str5 = c7383.f22729;
            String concat2 = str3.concat(" has no writable parent directory.");
            if (str2 == null) {
                throw m31148("FILE_PARENT_NOT_FOUND", concat2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array(), null, null);
            }
            throw m31147("FILE_PARENT_NOT_FOUND", concat2, str2, str, str5, "prepare", "parent_missing", false, null, true, JSON.array());
        }
        c7383.m19884(parent);
        String str6 = c7383.f22729;
        AbstractC15440 m416122 = c17760.m41612(parent);
        m31173(m41612, str, str6);
        m31165(str, m416122.mo23558(), str6);
        m31174(m416122, c7383, jSONArray);
        return new C8588(this, str, parent, m41612, mo23558, m31156(jSONArray, str, parent, str6), m31154.m30885() == EnumC3447.REGULAR);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31164(String str, String str2, boolean z, JSONArray jSONArray, RuntimeException runtimeException) {
        if (!m31177(str)) {
            m31161(jSONArray, "A temporary MCP file could not be removed.");
            if (runtimeException != null) {
                runtimeException.addSuppressed(new IOException("A temporary MCP file could not be removed"));
            }
        }
        if (z) {
            try {
                this.f38468.m52583(str2);
            } catch (RuntimeException e) {
                m31161(jSONArray, "File change notification could not be completed.");
                if (runtimeException == null || e == runtimeException) {
                    return;
                }
                runtimeException.addSuppressed(e);
            }
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private l.C7882 m31152(java.lang.String r28, java.lang.String r29, l.InterfaceC9294 r30, l.C7383 r31) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12821.m31152(java.lang.String, java.lang.String, l.ۢۖۜ, l.۟ۢۜ):l.۠ۖۜ");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m31185(C12619 c12619, String str) {
        int i = C6471.f19989[c12619.m30885().ordinal()];
        C17760 c17760 = this.f38470;
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directories cannot be modified as file content.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links cannot be modified by generic file content tools.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The requested node type cannot be modified as file content.", str);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m31183(C12619 c12619, String str) {
        int i = C6471.f19989[c12619.m30885().ordinal()];
        C17760 c17760 = this.f38470;
        if (i == 1) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "Directories cannot be copied by mt_file_copy.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links cannot be copied by generic file tools.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The source node type cannot be copied by generic file tools.", str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31169(C12619 c12619, String str) {
        int i = C6471.f19989[c12619.m30885().ordinal()];
        C17760 c17760 = this.f38470;
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_REGULAR", "A directory cannot be used as the file copy destination.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "A symbolic link cannot be used as the file copy destination.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "The destination node type cannot be replaced by generic file tools.", str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31163(String str, String str2, C12619 c12619, String str3, JSONArray jSONArray) {
        if (c12619.m30885() == EnumC3447.REGULAR) {
            return;
        }
        throw m31147("FILE_STORAGE_ERROR", "The copied temporary file is no longer available for publication.", str, str2, str3, "pre_publish_temp", "temp_" + c12619.m30885().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m31182(String str, C12619 c12619, String str2, JSONArray jSONArray) {
        if (c12619.m30885() == EnumC3447.REGULAR) {
            return;
        }
        throw m31148("FILE_STORAGE_ERROR", "The streamed temporary file is no longer available for publication.", str, str2, "pre_publish_temp", "temp_" + c12619.m30885().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m31165(String str, AbstractC10503 abstractC10503, String str2) {
        C12619 m31154 = m31154(abstractC10503);
        if (m31154.m30885() == EnumC3447.MISSING) {
            throw m31148("FILE_PARENT_NOT_FOUND", "The target parent directory does not exist.", str, str2, "parent_stat", "parent_missing", false, null, true, JSON.array(), null, null);
        }
        if (m31154.m30885() != EnumC3447.DIRECTORY) {
            throw m31148("FILE_NOT_DIRECTORY", "The target parent is not a directory.", str, str2, "parent_stat", m31154.m30885().name().toLowerCase(Locale.ROOT), false, null, true, JSON.array(), null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m31173(AbstractC15440 abstractC15440, String str, String str2) {
        this.f38470.m41610(abstractC15440, new C17054(str, str2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31146(String str, String str2, String str3, String str4, String str5) {
        return m31148(str3, str4, str, str2, "check_parent_links", str5, false, null, true, JSON.array(), null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC15440 m31156(JSONArray jSONArray, String str, String str2, String str3) {
        boolean z = false;
        for (int i = 0; i < 16; i++) {
            StringBuilder sb = new StringBuilder(".mt-mcp-");
            sb.append(f38467);
            sb.append("-");
            byte[] bArr = new byte[18];
            f38466.nextBytes(bArr);
            sb.append(C14460.m34531(bArr));
            sb.append(".tmp");
            String sb2 = sb.toString();
            AbstractC15440 m41612 = this.f38470.m41612("/".equals(str2) ? C20094.m46315("/", sb2) : C22870.m50967(str2, "/", sb2));
            AbstractC10503 mo23558 = m41612.mo23558();
            if (mo23558.mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
                throw m31148("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot safely create an MCP temporary file.", str, str3, "create_temp", "exclusive_create_unsupported", false, null, true, jSONArray, null, null);
            }
            try {
                mo23558.mo8675();
                return m41612;
            } catch (C22497 e) {
                if (e.m50458() != EnumC21792.ALREADY_EXISTS) {
                    try {
                        z = mo23558.mo8671();
                    } catch (IOException | RuntimeException unused) {
                    }
                    if (!z) {
                        m31161(jSONArray, "A temporary MCP file could not be removed after creation failed.");
                    }
                    throw m31148("FILE_STORAGE_ERROR", "Failed to create an MCP temporary file.", str, str3, "create_temp", e.m50458().name().toLowerCase(Locale.ROOT), false, null, true, jSONArray, null, null);
                }
            }
        }
        throw m31148("FILE_STORAGE_ERROR", "Unable to allocate a unique MCP temporary file name.", str, str3, "create_temp", "name_collision", false, null, true, jSONArray, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31174(AbstractC15440 abstractC15440, C7383 c7383, JSONArray jSONArray) {
        AbstractC10503 mo23558;
        synchronized (this.f38469) {
            if (c7383.f22729.equals(this.f38469.get(abstractC15440.mo23554()))) {
                return;
            }
            this.f38469.put(abstractC15440.mo23554(), c7383.f22729);
            if (this.f38469.size() > 64) {
                LinkedHashMap linkedHashMap = this.f38469;
                linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
            }
            AbstractC10503 mo235582 = abstractC15440.mo23558();
            if (mo235582.mo8669(EnumC13324.LIST) == EnumC4858.UNSUPPORTED) {
                return;
            }
            try {
                boolean z = false;
                for (C12619 c12619 : mo235582.mo8674()) {
                    AbstractC15440 m30882 = c12619.m30882();
                    EnumC3447 m30885 = c12619.m30885();
                    EnumC3447 enumC3447 = EnumC3447.REGULAR;
                    if (m30885 == enumC3447 && m31184(m30882.getName())) {
                        try {
                            c7383.m19884(m30882.mo23554());
                            mo23558 = m30882.mo23558();
                        } catch (RuntimeException | C3059 | C22497 unused) {
                        }
                        if (mo23558.mo8669(EnumC13324.DELETE_FILE_OR_LINK) == EnumC4858.UNSUPPORTED) {
                            z = true;
                        } else {
                            C12619 mo8672 = mo23558.mo8672();
                            if (mo8672.m30885() == enumC3447 && m31184(mo8672.m30882().getName())) {
                                mo23558.mo8676();
                            }
                        }
                    }
                }
                if (z) {
                    m31161(jSONArray, "One or more stale MCP temporary files could not be removed.");
                }
            } catch (RuntimeException | C22497 unused2) {
                m31161(jSONArray, "Stale MCP temporary files could not be checked on this storage backend.");
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31184(String str) {
        if (str.length() != 73 || !str.startsWith(".mt-mcp-") || str.charAt(32) != '-' || !str.endsWith(".tmp") || !m31175(8, 32, str) || !m31175(33, 69, str)) {
            return false;
        }
        String str2 = f38467;
        return !str.regionMatches(8, str2, 0, str2.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31175(int i, int i2, String str) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'f')) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31161(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20583 m31160(String str, AbstractC15440 abstractC15440, C14937 c14937, InterfaceC9294 interfaceC9294, String str2) {
        long j;
        long j2;
        MessageDigest m34532 = C14460.m34532();
        C2238 c2238 = new C2238(abstractC15440.mo23555(false), m34532);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c2238, 65536);
        try {
            interfaceC9294.mo7077(c14937, bufferedOutputStream);
            bufferedOutputStream.close();
            j = c2238.f7304;
            if (j > 9007199254740991L) {
                throw m31148("FILE_STORAGE_ERROR", "The output size exceeds the supported JSON integer range.", str, str2, "write_temp", "size_out_of_range", false, null, true, JSON.array(), null, null);
            }
            j2 = c2238.f7304;
            return C20583.m47135(j2, C14460.m34531(m34532.digest()).substring(0, 16));
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m31142(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(abstractC15440.mo27926(), 65536);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(abstractC154402.mo23555(false), 65536);
            try {
                long m31141 = m31141(bufferedInputStream, bufferedOutputStream);
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return m31141;
            } finally {
            }
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5060 m31151(C21495 c21495, AbstractC15440 abstractC15440) {
        long j;
        try {
            C3649 c3649 = new C3649(new C21994(abstractC15440.mo23555(false)));
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c3649, 65536);
            try {
                C9126 m29880 = C12322.m29880(c21495.f69144, c21495.f69145, c21495.f69146, bufferedOutputStream);
                bufferedOutputStream.close();
                j = c3649.f11505;
                return new C5060(j, m29880);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (RuntimeException e) {
            if ((e instanceof C19878) || !m31186(e)) {
                throw e;
            }
            throw new C19878(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static RuntimeException m31179(RuntimeException runtimeException) {
        return ((runtimeException instanceof C19878) || !m31186(runtimeException)) ? runtimeException : new C19878(runtimeException);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0826 m31144(AbstractC15440 abstractC15440, boolean z) {
        EnumC13324 enumC13324;
        if (z) {
            enumC13324 = EnumC13324.REPLACE;
        } else {
            enumC13324 = EnumC13324.RENAME_NO_REPLACE;
        }
        EnumC4858 mo8669 = abstractC15440.mo23558().mo8669(enumC13324);
        if (mo8669 == EnumC4858.ATOMIC) {
            return new C0826(enumC13324, "atomic", true, true);
        }
        if (mo8669 == EnumC4858.BEST_EFFORT || mo8669 == EnumC4858.SUPPORTED) {
            return new C0826(enumC13324, "best_effort", false, true);
        }
        return new C0826(enumC13324, "best_effort", false, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C0826 m31180(AbstractC10503 abstractC10503, boolean z) {
        EnumC13324 enumC13324;
        if (z) {
            enumC13324 = EnumC13324.REPLACE;
        } else {
            enumC13324 = EnumC13324.RENAME_NO_REPLACE;
        }
        EnumC4858 mo8669 = abstractC10503.mo8669(enumC13324);
        if (mo8669 == EnumC4858.ATOMIC) {
            return new C0826(enumC13324, "atomic", true, true);
        }
        if (mo8669 == EnumC4858.BEST_EFFORT || mo8669 == EnumC4858.SUPPORTED) {
            return new C0826(enumC13324, "best_effort", false, true);
        }
        return new C0826(enumC13324, "best_effort", false, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31162(String str, String str2, AbstractC10503 abstractC10503, C0826 c0826, String str3, JSONArray jSONArray) {
        if (c0826.f2999 == EnumC13324.RENAME_NO_REPLACE && !c0826.f2998 && abstractC10503.mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
            throw m31147("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, str3, "publish_capability", "no_replace_unsupported", false, c0826.f3000, true, jSONArray);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31166(String str, AbstractC10503 abstractC10503, C0826 c0826, String str2, JSONArray jSONArray) {
        if (c0826.f2999 == EnumC13324.RENAME_NO_REPLACE && !c0826.f2998 && abstractC10503.mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
            throw m31148("FILE_BACKEND_UNSUPPORTED", "The storage backend cannot publish without replacing an existing destination.", str, str2, "publish_capability", "no_replace_unsupported", false, c0826.f3000, true, jSONArray, null, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0080, code lost:
    
        if (r2 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0082, code lost:
    
        r2 = "FILE_STORAGE_ERROR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0087, code lost:
    
        r3 = r3.name();
        r4 = java.util.Locale.ROOT;
        r5 = r3.toLowerCase(r4);
        r6 = r0.m50458().name().toLowerCase(r4);
        r9 = r22.f2997;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b3, code lost:
    
        throw m31148(r2, "Failed to publish local file content.", r17, r25, r5, r6, !r9, r8, r9, bin.mt.json.JSON.array(), null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0085, code lost:
    
        r2 = "FILE_OPERATION_STATE_UNKNOWN";
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m31168(java.lang.String r17, l.AbstractC15440 r18, l.AbstractC10503 r19, l.AbstractC15440 r20, l.AbstractC10503 r21, l.C0826 r22, long r23, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12821.m31168(java.lang.String, l.ܶ᩵ܿ, l.ۤ᩵ܿ, l.ܶ᩵ܿ, l.ۤ᩵ܿ, l.֨ۖۜ, long, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C20583 m31159(String str, C12619 c12619, String str2, String str3) {
        if (c12619.m30885() == EnumC3447.MISSING) {
            return C20583.m47134();
        }
        try {
            C16534 m41948 = C17946.m41948(c12619.m30882(), 0L, 1);
            long j = m41948.f50811;
            C12619 m31154 = m31154(c12619.m30882().mo23558());
            if (m31154.m30885() != EnumC3447.REGULAR || ((c12619.m30884() >= 0 && c12619.m30884() != j) || (m31154.m30884() >= 0 && m31154.m30884() != j))) {
                throw m31148("FILE_CHANGED_DURING_READ", "The file changed while its targetVersion was being calculated.", str, str2, str3, "metadata_changed", false, null, true, JSON.array(), null, null);
            }
            return C20583.m47135(j, m41948.f50812);
        } catch (IOException e) {
            throw m31148("FILE_STORAGE_ERROR", "Failed to read current local file content.", str, str2, str3, e.getClass().getSimpleName(), false, null, true, JSON.array(), null, null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m31177(String str) {
        try {
            AbstractC10503 mo23558 = this.f38470.m41612(str).mo23558();
            C12619 mo8672 = mo23558.mo8672();
            if (mo8672.m30885() == EnumC3447.MISSING) {
                return true;
            }
            if (mo8672.m30885() == EnumC3447.REGULAR && mo23558.mo8669(EnumC13324.DELETE_FILE_OR_LINK) != EnumC4858.UNSUPPORTED) {
                mo23558.mo8676();
                return true;
            }
            return false;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31172(AbstractC15440 abstractC15440, long j, JSONArray jSONArray) {
        if (C4925.m14321()) {
            if (j < 0) {
                m31161(jSONArray, "Source modified time was unavailable and could not be preserved.");
                return;
            }
            try {
                if (abstractC15440.mo27912() && abstractC15440.mo18537(j)) {
                    return;
                }
                m31161(jSONArray, "Source modified time could not be applied to the destination.");
            } catch (RuntimeException unused) {
                m31161(jSONArray, "Source modified time could not be applied to the destination.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12619 m31154(AbstractC10503 abstractC10503) {
        try {
            return abstractC10503.mo8672();
        } catch (C22497 e) {
            this.f38470.getClass();
            throw C17760.m41604(e);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31186(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31149(C3059 c3059, String str, String str2) {
        boolean z = c3059.f9605;
        JSONArray jSONArray = c3059.f9604;
        String str3 = c3059.f9611;
        String str4 = c3059.f9610;
        if (z) {
            return c3059;
        }
        JSONObject object = JSON.object();
        Iterator it = c3059.f9609.iterator();
        while (it.hasNext()) {
            JSONObject.Member member = (JSONObject.Member) it.next();
            object.put(member.getName(), member.getValue());
        }
        object.put("localPath", str);
        JSONValue jSONValue = object.get("policyRevision");
        if (jSONValue == null || !jSONValue.isString()) {
            object.put("policyRevision", str2);
        }
        if (c3059.f9607) {
            return C3059.m9365(str4, c3059.getMessage(), str3, jSONArray, object);
        }
        return C3059.m9369(str4, c3059.getMessage(), str3, jSONArray, object);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31147(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2, JSONArray jSONArray) {
        JSONObject add = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "targetPath", str4).add("policyRevision", str5).add("operation", str6).add("backendReason", str7).add("changed", z).add("operationMode", str8 == null ? JSON.NULL : JSON.value(str8)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        return ("FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C3059.m9365(str, str2, "warning", (JSONArray) null, add) : C3059.m9369(str, str2, "fatal", null, add);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31145(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m31148("FILE_STORAGE_ERROR", str, str2, str3, str4, "size_out_of_range", false, null, true, jSONArray, null, null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m31181(JSONArray jSONArray, String str, String str2, String str3, String str4) {
        return m31148("FILE_OPERATION_STATE_UNKNOWN", "The file operation may have changed the target, but its final state is unknown.", str, str2, "publish", str4, true, str3, false, jSONArray, null, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m31148(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, JSONArray jSONArray, String str8, String str9) {
        JSONObject add = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", z).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", z2).add("warnings", new JSONArray(jSONArray));
        if (str8 != null) {
            add.add("expectedTargetVersion", str8).add("actualTargetVersion", str9);
        }
        return (("parent_stat".equals(str5) && (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str6)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str6)))) || "FILE_ALREADY_EXISTS".equals(str) || "FILE_STORAGE_ERROR".equals(str) || "FILE_CHANGED_DURING_READ".equals(str) || "FILE_TARGET_VERSION_MISMATCH".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C3059.m9365(str, str2, "warning", (JSONArray) null, add) : C3059.m9369(str, str2, "fatal", null, add);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7882 m31189(String str, String str2, InterfaceC9294 interfaceC9294) {
        boolean equals = "missing".equals(str2);
        if (!equals && str2 != null && str2.length() == 16) {
            equals = false;
            int i = 0;
            while (true) {
                if (i >= str2.length()) {
                    equals = true;
                    break;
                }
                char charAt = str2.charAt(i);
                if ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'f')) {
                    break;
                }
                i++;
            }
        }
        if (equals) {
            C17760 c17760 = this.f38470;
            C7383 m41607 = c17760.m41607();
            String m41605 = C17760.m41605(str, m41607, MotionUtils.EASING_TYPE_PATH);
            C10000 m41611 = c17760.m41611(m41605);
            try {
                C7882 m31152 = m31152(m41605, str2, interfaceC9294, m41607);
                m41611.close();
                return m31152;
            } catch (Throwable th) {
                try {
                    m41611.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw C3059.m9364("Invalid targetVersion", "targetVersion", str2 == null ? null : JSON.value(str2), JSON.array().add("missing").add("<16 lowercase hex digits copied from the latest read>"), JSON.object().add("targetVersion", "missing"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m31141(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) {
        long j;
        byte[] bArr = new byte[65536];
        long j2 = 0;
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read < 0) {
                break;
            }
            if (read == 0) {
                int read2 = bufferedInputStream.read();
                if (read2 < 0) {
                    break;
                }
                bufferedOutputStream.write(read2);
                j = 1;
                if (j2 > 9007199254740991L - j) {
                    throw new IOException("Copied size exceeds the supported JSON integer range");
                }
            } else {
                bufferedOutputStream.write(bArr, 0, read);
                j = read;
                if (j2 > 9007199254740991L - j) {
                    throw new IOException("Copied size exceeds the supported JSON integer range");
                }
            }
            j2 += j;
        }
        return j2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31178(C20583 c20583, C20583 c205832) {
        return c20583.f66266 == c205832.f66266 && c20583.f66267 == c205832.f66267 && c20583.f66268.equals(c205832.f66268);
    }
}
