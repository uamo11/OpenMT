package l;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: 9AHU */
/* renamed from: l.᩵ۙ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19247 extends AbstractC13921 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f60572;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Charset f60573;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C23734 f60576;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f60577;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f60578;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Map f60579;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60580;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12534 f60581;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f60582;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public byte[] f60575 = C5659.f17466;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f60574 = true;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C0225 f60583 = new C0225(1);

    @Override // l.AbstractC13921
    /* renamed from: ܽ */
    public final String mo7654() {
        return "zip";
    }

    public C19247(String str) {
        this.f60580 = C16999.m39866(str, new String[0]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19247 m44378(C12951 c12951) {
        List list;
        Map map;
        C23734 c23734;
        long j;
        C19247 c19247 = new C19247(c12951.m31506());
        c19247.f60575 = c12951.m31496();
        c19247.f60582 = c12951.m31498();
        c19247.f60577 = c12951.m31503();
        String m31506 = c12951.m31506();
        if (!m31506.isEmpty()) {
            c19247.m44389(m31506);
        }
        String m315062 = c12951.m31506();
        if (!m315062.isEmpty()) {
            c19247.f60573 = Charset.forName(m315062);
        }
        C18541 c18541 = (C18541) C3175.m9733(c12951.m31506());
        if (c18541 != null) {
            list = c18541.f57453;
            c19247.f60572 = list;
            map = c18541.f57454;
            c19247.f60579 = map;
            c23734 = c18541.f57456;
            c19247.f60576 = c23734;
            j = c18541.f57455;
            c19247.f60578 = j;
        }
        return c19247;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        C18090 c18090 = new C18090(this.f60580, this.f60573);
        try {
            m44379(c18090);
            c18090.close();
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List m44383() {
        C18090 m42166 = C18090.m42166(this.f60580, this.f60573);
        try {
            m44379(m42166);
            List unmodifiableList = C20195.unmodifiableList(new ArrayList(m42166.m42205()));
            m42166.close();
            return unmodifiableList;
        } catch (Throwable th) {
            try {
                m42166.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44379(C18090 c18090) {
        byte[] m42188 = c18090.m42188();
        if (m42188 == null) {
            m42188 = C5659.f17466;
        }
        this.f60575 = m42188;
        this.f60572 = C20195.unmodifiableList(c18090.m42194());
        this.f60579 = c18090.m42195();
        this.f60576 = new C23734(this.f60572);
        boolean m42212 = c18090.m42212();
        this.f60582 = m42212;
        this.f60577 = m42212 ? C22263.m49979(c18090) : null;
        this.f60578 = this.f60580.mo23117();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m33352()) {
            return;
        }
        C0225 c0225 = this.f60583;
        c0225.close();
        while (true) {
            C18090 c18090 = (C18090) c0225.m1479();
            if (c18090 == null) {
                return;
            } else {
                C0349.m1793(c18090);
            }
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        return m44381(abstractActivityC3346, interfaceC17889, new C11461());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:53|(1:103)(3:(1:59)|60|(6:62|63|64|(1:66)(1:87)|67|(2:(2:73|75)(1:77)|76)(4:78|79|(3:81|82|83)(1:85)|84))(2:99|(1:102)))|101|63|64|(0)(0)|67|(2:69|71)(1:86)|(0)(0)|76|51) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013f, code lost:
    
        if (r12.m10808() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0141, code lost:
    
        m44389(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0144, code lost:
    
        if (r4 != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0146, code lost:
    
        l.C22523.m50500();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x014b, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e A[Catch: ۘܰۡ -> 0x013a, TRY_LEAVE, TryCatch #3 {ۘܰۡ -> 0x013a, blocks: (B:64:0x00fc, B:67:0x010d, B:69:0x011a, B:79:0x0120, B:82:0x0128, B:73:0x012e), top: B:63:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.FilterInputStream m44381(l.AbstractActivityC3346 r11, l.InterfaceC17889 r12, final l.InterfaceC17066 r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19247.m44381(l.ۗܺ᩷, l.ᩳۜܳ, l.ܿۖ᩷):java.io.FilterInputStream");
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        if (this.f60579 == null) {
            mo7646(false);
        }
        C3545 entry = getEntry(str.substring(1));
        if (entry == null) {
            return null;
        }
        return new C12645(entry);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("zip".getBytes());
        C14460.m34528(messageDigest, this.f60580.mo23554());
        messageDigest.update(String.valueOf(this.f60578).getBytes());
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12534 m44386() {
        C12534 c12534 = this.f60581;
        if (c12534 != null) {
            return c12534;
        }
        if (!this.f60574) {
            return null;
        }
        this.f60574 = false;
        try {
            if (this.f60572 == null) {
                mo7646(false);
            }
            C3545 c3545 = (C3545) this.f60579.get("resources.arsc");
            if (c3545 != null && c3545.getSize() < 15728640) {
                C18090 m42168 = C18090.m42168(this.f60580, this.f60575);
                try {
                    this.f60581 = new C12534(0, new C23326(m42168.m42189(c3545)));
                    m42168.close();
                } finally {
                }
            }
            return this.f60581;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f60572 == null) {
            mo7646(false);
        }
        if (C2568.f8121) {
            str = C16014.m37867(str, "/zip/");
        }
        List m4937 = this.f60576.m4937(str.substring(1));
        ArrayList arrayList = new ArrayList(m4937.size() + 1);
        Iterator it = m4937.iterator();
        while (it.hasNext()) {
            arrayList.add(new C12645((C3545) it.next()));
        }
        return arrayList;
    }

    public final C3545 getEntry(String str) {
        Map map = this.f60579;
        if (map == null) {
            return null;
        }
        C3545 c3545 = (C3545) map.get(str);
        return (c3545 == null && str.endsWith("/")) ? (C3545) this.f60576.m4933(str) : c3545;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final byte[] m44388() {
        return this.f60575;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m44395() {
        return this.f60575.length > 0;
    }

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final List m44393() {
        return this.f60572;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        c10130.m25439(this.f60580.mo23554());
        c10130.m25434(this.f60575);
        c10130.m25425(this.f60582);
        c10130.m25424(this.f60577);
        c10130.m25439(m44390());
        c10130.m25439(m44382());
        c10130.m25439(C3175.m9731(new C18541(this.f60572, this.f60579, this.f60576, this.f60578)));
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m44391() {
        return this.f60580.mo23554();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m44380() {
        return this.f60580;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44394() {
        return this.f60582;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m44384() {
        return this.f60577;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44385() {
        return this.f60578 != this.f60580.mo23117();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m44392() {
        return this.f60580.mo23120();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44389(String str) {
        C10395.m26217(this.f60580.mo23554(), str);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m44390() {
        return C10395.m26212(this.f60580.mo23554());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44387(Charset charset) {
        this.f60573 = charset;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m44382() {
        Charset charset = this.f60573;
        return charset == null ? "" : charset.name();
    }
}
