package l;

import android.os.Build;
import com.alipay.sdk.m.y.l;
import java.io.File;
import java.io.Serializable;

/* compiled from: 097P */
/* renamed from: l.᩸֡ܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21234 extends AbstractC13301 implements Serializable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f68442;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f68443;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f68444;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f68445;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f68446;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f68447;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f68448;

    public C21234(String str, long j, long j2, long j3, boolean z, String str2, String str3) {
        this.f68445 = str;
        this.f68443 = j;
        this.f68446 = j2;
        this.f68444 = j3;
        this.f68448 = z;
        this.f68442 = str2;
        this.f68447 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21234)) {
            return false;
        }
        C21234 c21234 = (C21234) obj;
        return this.f68448 == c21234.f68448 && this.f68443 == c21234.f68443 && this.f68446 == c21234.f68446 && this.f68444 == c21234.f68444 && C11003.equals(this.f68445, c21234.f68445) && C11003.equals(this.f68442, c21234.f68442) && C11003.equals(this.f68447, c21234.f68447);
    }

    public final int hashCode() {
        int i = this.f68448 ? 1231 : 1237;
        long j = this.f68443;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f68446;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f68444;
        return C11003.hashCode(this.f68447) + C20361.m46680(C20361.m46680((i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31, this.f68445), 31, this.f68442);
    }

    public final long size() {
        return this.f68444;
    }

    public final String toString() {
        Object[] objArr = {this.f68445, Long.valueOf(this.f68443), Long.valueOf(this.f68446), Long.valueOf(this.f68444), Boolean.valueOf(this.f68448), this.f68442, this.f68447};
        String[] split = "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".length() == 0 ? new String[0] : "recycleName;moveTime;lastModified;size;isDir;originalPath;fileName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C21234.class, sb, "[");
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

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48194() {
        return this.f68447;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m48197() {
        return this.f68446;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m48198() {
        return this.f68445;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m48200() {
        return this.f68443;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m48202() {
        return this.f68448;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m48203() {
        return this.f68442;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21234 m48199(long j) {
        return new C21234(this.f68445, this.f68443, this.f68446, j, this.f68448, this.f68442, this.f68447);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m48201() {
        return C21939.m49419().m36526(this.f68445 + "/" + this.f68447);
    }

    public final boolean delete() {
        StringBuilder sb = new StringBuilder("$RECYCLE.BIN$/");
        String str = this.f68445;
        sb.append(str);
        AbstractC15440 m39866 = C16999.m39866(sb.toString(), new String[0]);
        C21939.f70252.getClass();
        m39866.mo23552();
        if (m48201().mo23120()) {
            return false;
        }
        C21939.m49419().m36526(".i/" + str).mo23552();
        ((ConcurrentMapC10942) C21939.f70249).remove(str);
        C21939.f70252.getClass();
        m39866.mo23552();
        return true;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m48196() {
        String str = this.f68445;
        String m49420 = C21939.m49420();
        String str2 = this.f68442;
        if (C16999.m39872(str2, m49420)) {
            return false;
        }
        C10130 m43030 = C18515.m43030(541279570);
        m43030.m25431(this.f68443);
        m43030.m25431(this.f68446);
        m43030.m25431(this.f68444);
        m43030.m25439(str2);
        try {
            C21939.m49419().m36526(".i/" + str).m36496(m43030);
            ((ConcurrentMapC10942) C21939.f70249).put(str, this);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m48195() {
        C11293 c11293;
        AbstractC15440 m48201 = m48201();
        AbstractC15440 abstractC15440 = C16293.f50120;
        AbstractC15440 m36526 = abstractC15440.m36526(this.f68442);
        if (Build.VERSION.SDK_INT >= 30 && (m36526 instanceof C12993) && C22518.m50492().mo2657() && m48201.mo23554().startsWith(abstractC15440.mo23554())) {
            C11293 m31569 = m36526.mo31566().m31569();
            C11003.requireNonNull(m31569);
            c11293 = m31569;
            m48201 = new C11293(new File("/data/media/" + abstractC15440.getName() + m48201.mo23554().substring(abstractC15440.mo23554().length())), false);
        } else {
            c11293 = m36526;
        }
        AbstractC15440 m36492 = c11293.m36492(true);
        if (!m36526.getName().equals(m36492.getName())) {
            m36526 = m36526.m36524(m36492.getName());
        }
        m36492.mo35195();
        m48201.m36498(m36492, (Runnable) null);
        delete();
        m36492.mo18537(this.f68446);
        return m36526;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21234 m48191(AbstractC15440 abstractC15440) {
        String name = abstractC15440.getName();
        C21234 c21234 = (C21234) ((ConcurrentMapC10942) C21939.f70249).get(name);
        if (c21234 != null) {
            if (c21234.m48201().mo23120()) {
                return c21234;
            }
            abstractC15440.mo23552();
            ((ConcurrentMapC10942) C21939.f70249).remove(name);
            return null;
        }
        try {
            C12951 m36528 = abstractC15440.m36528();
            C22124.m49722((InterfaceC20008) m36528, 541279570);
            long readLong = m36528.readLong();
            long readLong2 = m36528.readLong();
            long readLong3 = m36528.readLong();
            String m31506 = m36528.m31506();
            String m48189 = m48189(m31506);
            AbstractC15440 m36526 = C21939.m49419().m36526(name + "/" + m48189);
            if (!m36526.mo23120()) {
                abstractC15440.mo23552();
                return null;
            }
            C21234 c212342 = new C21234(name, readLong, readLong2, readLong3, m36526.mo23113(), m31506, m48189);
            ((ConcurrentMapC10942) C21939.f70249).put(name, c212342);
            return c212342;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a A[LOOP:0: B:7:0x0023->B:13:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C21234 m48192(l.C15587 r21, l.InterfaceC17066 r22) {
        /*
            r0 = r21
            java.io.File r1 = r0.f48020
            java.lang.String r2 = r21.mo23554()
            java.lang.String r12 = l.C16999.m39859(r2)
            if (r12 != 0) goto Lf
            goto L21
        Lf:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r1.lastModified()
            long r9 = r21.m36490(r22)
            boolean r0 = r22.mo1526()
            if (r0 == 0) goto L23
        L21:
            r0 = 0
            return r0
        L23:
            java.security.SecureRandom r0 = l.C21939.m49416()
            long r2 = r0.nextLong()
            r13 = 0
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 != 0) goto L34
            java.lang.String r0 = "0"
            goto L3c
        L34:
            r4 = 36
            if (r0 <= 0) goto L3f
            java.lang.String r0 = java.lang.Long.toString(r2, r4)
        L3c:
            r19 = r9
            goto L79
        L3f:
            r0 = 64
            char[] r0 = new char[r0]
            r11 = 1
            long r15 = r2 >>> r11
            r11 = 18
            long r13 = (long) r11
            long r15 = r15 / r13
            long r13 = (long) r4
            long r17 = r15 * r13
            long r2 = r2 - r17
            int r3 = (int) r2
            char r2 = java.lang.Character.forDigit(r3, r4)
            r3 = 63
            r0[r3] = r2
            r17 = 0
        L5a:
            int r2 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r2 <= 0) goto L6f
            int r3 = r3 + (-1)
            r19 = r9
            long r9 = r15 % r13
            int r2 = (int) r9
            char r2 = java.lang.Character.forDigit(r2, r4)
            r0[r3] = r2
            long r15 = r15 / r13
            r9 = r19
            goto L5a
        L6f:
            r19 = r9
            java.lang.String r2 = new java.lang.String
            int r4 = 64 - r3
            r2.<init>(r0, r3, r4)
            r0 = r2
        L79:
            java.lang.String r4 = r0.toUpperCase()
            java.util.Map r0 = l.C21939.m49411()
            l.ۧۤᩴ r0 = (l.ConcurrentMapC10942) r0
            boolean r0 = r0.containsKey(r4)
            if (r0 != 0) goto L9a
            l.᩸֡ܿ r0 = new l.᩸֡ܿ
            boolean r11 = r1.isDirectory()
            java.lang.String r13 = m48189(r12)
            r3 = r0
            r9 = r19
            r3.<init>(r4, r5, r7, r9, r11, r12, r13)
            return r0
        L9a:
            r9 = r19
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21234.m48192(l.ܺ֡ܿ, l.ܿۖ᩷):l.᩸֡ܿ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48189(String str) {
        if (str.length() > 1 && str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (str.isEmpty() || str.equals("/")) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }
}
