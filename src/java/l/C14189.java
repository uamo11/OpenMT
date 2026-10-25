package l;

import android.net.Uri;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.LongSupplier;

/* compiled from: I749 */
/* renamed from: l.ܳ֨ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14189 implements InterfaceC21449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13891 f42828;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f42830;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C5018 f42831;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16197 f42832;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f42834;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23362 f42835;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC21449 f42836;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f42837;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C10082 f42838;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Uri f42840;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f42829 = new ArrayList();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Map f42839 = Collections.EMPTY_MAP;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f42833 = Collections.EMPTY_LIST;

    public C14189(C23362 c23362) {
        this.f42835 = c23362;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final void mo5937(InterfaceC0486 interfaceC0486) {
        ArrayList arrayList = this.f42829;
        if (arrayList.contains(interfaceC0486)) {
            return;
        }
        arrayList.add(interfaceC0486);
        InterfaceC21449 interfaceC21449 = this.f42836;
        if (interfaceC21449 != null) {
            interfaceC21449.mo5937(interfaceC0486);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff A[Catch: RuntimeException -> 0x0160, IOException -> 0x0162, TryCatch #6 {IOException -> 0x0162, RuntimeException -> 0x0160, blocks: (B:52:0x00ef, B:54:0x00ff, B:56:0x0104, B:57:0x0110, B:59:0x0114, B:61:0x011e, B:63:0x0121, B:64:0x012c, B:77:0x0135, B:81:0x014d, B:83:0x0150, B:85:0x0156, B:86:0x0158, B:87:0x0165, B:89:0x016f, B:90:0x0172, B:67:0x0177, B:71:0x017f, B:74:0x0190, B:75:0x0197, B:94:0x0198, B:95:0x019f), top: B:51:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104 A[Catch: RuntimeException -> 0x0160, IOException -> 0x0162, TryCatch #6 {IOException -> 0x0162, RuntimeException -> 0x0160, blocks: (B:52:0x00ef, B:54:0x00ff, B:56:0x0104, B:57:0x0110, B:59:0x0114, B:61:0x011e, B:63:0x0121, B:64:0x012c, B:77:0x0135, B:81:0x014d, B:83:0x0150, B:85:0x0156, B:86:0x0158, B:87:0x0165, B:89:0x016f, B:90:0x0172, B:67:0x0177, B:71:0x017f, B:74:0x0190, B:75:0x0197, B:94:0x0198, B:95:0x019f), top: B:51:0x00ef }] */
    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo1620(l.C3104 r15) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14189.mo1620(l.ۗ۠֫):long");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private long m33858(C3104 c3104) {
        InterfaceC15097 interfaceC15097;
        interfaceC15097 = this.f42835.f75046;
        InterfaceC21449 mo6247 = interfaceC15097.mo6247();
        this.f42836 = mo6247;
        m33855(mo6247);
        try {
            long mo1620 = mo6247.mo1620(c3104);
            m33856(mo6247, c3104.f9711);
            return mo1620;
        } catch (IOException | RuntimeException e) {
            m33856(mo6247, c3104.f9711);
            InterfaceC21449 interfaceC21449 = this.f42836;
            this.f42836 = null;
            C8751.m22643(interfaceC21449);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m33850(C3104 c3104, C16197 c16197, String str, boolean z, C10082 c10082) {
        InterfaceC15097 interfaceC15097;
        C14895 c14895;
        InterfaceC23425 interfaceC23425;
        C23362 c23362 = this.f42835;
        interfaceC15097 = c23362.f75046;
        InterfaceC21449 mo6247 = interfaceC15097.mo6247();
        this.f42836 = mo6247;
        m33855(mo6247);
        c14895 = c23362.f75047;
        InterfaceC21449 interfaceC21449 = null;
        C5018 c5018 = c14895 == null ? null : new C5018();
        try {
            c10082.m25339();
            long mo1620 = mo6247.mo1620(c3104);
            Uri uri = c3104.f9711;
            m33856(mo6247, uri);
            if (mo1620 <= 2097152) {
                int i = 2097153;
                byte[] bArr = new byte[Math.min(8192, 2097153)];
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    c10082.m25339();
                    if (i2 == bArr.length) {
                        bArr = Arrays.copyOf(bArr, Math.min(i, bArr.length * 2));
                    }
                    int read = mo6247.read(bArr, i2, bArr.length - i2);
                    if (read == -1) {
                        byte[] copyOf = Arrays.copyOf(bArr, i2);
                        m33856(mo6247, uri);
                        this.f42836 = interfaceC21449;
                        C8751.m22643(mo6247);
                        this.f42837 = copyOf;
                        this.f42834 = 0;
                        boolean z3 = z && copyOf.length > 0;
                        if (c14895 != null) {
                            interfaceC23425 = c23362.f75048;
                            String mo10986 = interfaceC23425.mo10986(c3104);
                            Uri uri2 = this.f42840;
                            C0078 c0078 = new C0078(mo10986, str, copyOf, uri2 == null ? uri : uri2, c3104);
                            List<C0078> m35341 = c14895.m35341(c5018.m14511(), c0078);
                            ArrayList arrayList = new ArrayList();
                            for (C0078 c00782 : m35341) {
                                if (c00782 == c0078) {
                                    z2 = z;
                                } else {
                                    arrayList.add(c00782);
                                }
                            }
                            this.f42833 = arrayList;
                            z3 = z2;
                        }
                        if (z3) {
                            Uri uri3 = this.f42840;
                            m33853(c16197, str, copyOf, uri3 == null ? uri : uri3, c10082);
                        }
                        return copyOf.length;
                    }
                    if (read == 0) {
                        throw new IOException("HLS playlist upstream returned no data");
                    }
                    if (c5018 != null) {
                        c5018.m14512(i2, read, bArr);
                    }
                    i2 += read;
                    if (i2 > 2097152) {
                        this.f42837 = Arrays.copyOf(bArr, i2);
                        this.f42834 = 0;
                        if (c5018 != null) {
                            this.f42831 = c5018;
                            this.f42832 = c16197;
                        }
                    } else {
                        i = 2097153;
                        interfaceC21449 = null;
                    }
                }
            } else if (c5018 != null) {
                this.f42831 = c5018;
                this.f42832 = c16197;
                return mo1620;
            }
            return mo1620;
        } catch (IOException | RuntimeException e) {
            m33856(mo6247, c3104.f9711);
            InterfaceC21449 interfaceC214492 = this.f42836;
            this.f42836 = null;
            C8751.m22643(interfaceC214492);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C7259 m33851(C16197 c16197, String str, C3104 c3104, boolean z) {
        long j;
        long j2;
        long j3;
        String str2;
        Uri uri;
        try {
            C13608 m33852 = m33852(c16197.mo38139(str));
            if (m33852 != null) {
                j = m33852.f40600;
                if (c16197.m38148(str, 0L, j)) {
                    C3309 c3309 = new C3309();
                    c3309.m10114(c16197);
                    c3309.m10113((InterfaceC15097) null);
                    c3309.m10115((C20243) null);
                    c3309.m10112(new C17718(str));
                    int i = 0;
                    c3309.m10111(0);
                    c3309.m10116();
                    C13186 mo6247 = c3309.mo6247();
                    if (z) {
                        m33855(mo6247);
                    }
                    j2 = m33852.f40600;
                    int i2 = (int) j2;
                    byte[] bArr = new byte[i2];
                    try {
                        C4515 m9467 = c3104.m9467();
                        m9467.m13282(str);
                        j3 = m33852.f40600;
                        m9467.m13280(j3);
                        mo6247.mo1620(m9467.m13278());
                        while (i < i2) {
                            int read = mo6247.read(bArr, i, i2 - i);
                            if (read == -1 || read == 0) {
                                return null;
                            }
                            i += read;
                        }
                        C8751.m22643(mo6247);
                        str2 = m33852.f40602;
                        if (str2.equals(C14460.m34531(C14460.m34534().digest(bArr)))) {
                            uri = m33852.f40601;
                            return new C7259(uri, bArr);
                        }
                    } finally {
                        C8751.m22643(mo6247);
                    }
                }
            }
        } catch (IOException | RuntimeException unused) {
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C13608 m33852(C7026 c7026) {
        EnumC16306 enumC16306;
        EnumC16306 enumC163062;
        EnumC16306 enumC163063;
        LongSupplier longSupplier;
        long m18993 = c7026.m18993(Long.MIN_VALUE, "mt.hls.schema");
        C23362 c23362 = this.f42835;
        enumC16306 = c23362.f75045;
        if (m18993 != enumC16306.mo5158() || c7026.m18993(Long.MIN_VALUE, "mt.hls.complete") != 1) {
            return null;
        }
        long m189932 = c7026.m18993(Long.MIN_VALUE, "mt.hls.body_length");
        String m18997 = c7026.m18997("mt.hls.sha256");
        String m189972 = c7026.m18997("mt.hls.final_uri");
        if (m189932 <= 0 || m189932 > 2097152 || m18997 == null || m189972 == null) {
            return null;
        }
        Uri parse = Uri.parse(m189972);
        enumC163062 = c23362.f75045;
        if (!enumC163062.mo5159(parse)) {
            return null;
        }
        boolean m18996 = c7026.m18996("mt.hls.created_at_ms");
        boolean m189962 = c7026.m18996("mt.hls.expires_at_ms");
        String m189973 = c7026.m18997("mt.hls.stream_type");
        enumC163063 = c23362.f75045;
        if (enumC163063 == EnumC16306.f50168) {
            if (!m18996 || !m189962 || !"vod".equals(m189973)) {
                return null;
            }
            long m189933 = c7026.m18993(Long.MIN_VALUE, "mt.hls.created_at_ms");
            long m189934 = c7026.m18993(Long.MIN_VALUE, "mt.hls.expires_at_ms");
            longSupplier = c23362.f75049;
            long asLong = longSupplier.getAsLong();
            if (m189933 < 0 || m189934 <= m189933 || asLong < m189933 || asLong >= m189934) {
                return null;
            }
        } else if (m18996 || m189962 || m189973 != null) {
            return null;
        }
        return new C13608(m189932, parse, m18997);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33857(C16197 c16197, String str) {
        try {
            c16197.mo38142(str, m33859());
            if (c16197.mo38139(str).m18996("mt.hls.complete")) {
                return false;
            }
            c16197.m38150(str);
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33853(C16197 c16197, String str, final byte[] bArr, Uri uri, C10082 c10082) {
        C16197 c161972;
        String str2;
        EnumC16306 enumC16306;
        long j;
        long j2;
        C14895 c14895;
        long m35345;
        Uri uri2;
        C14895 c148952;
        EnumC16306 enumC163062;
        EnumC16306 enumC163063;
        C14895 c148953;
        long j3;
        C14895 c148954;
        LongSupplier longSupplier;
        try {
            enumC16306 = this.f42835.f75045;
            EnumC16306 enumC163064 = EnumC16306.f50168;
            c161972 = null;
            str2 = 0;
            if (enumC16306 == enumC163064) {
                longSupplier = this.f42835.f75049;
                long asLong = longSupplier.getAsLong();
                j2 = asLong + 300000;
                boolean z = true;
                boolean z2 = (300000 ^ asLong) < 0;
                if ((asLong ^ j2) < 0) {
                    z = false;
                }
                if (!z && !z2) {
                    throw new ArithmeticException();
                }
                j = asLong;
            } else {
                j = 0;
                j2 = 0;
            }
            c14895 = this.f42835.f75047;
            try {
                if (c14895 == null) {
                    m35345 = -1;
                } else {
                    m35345 = c14895.m35345();
                    if (m35345 < 0) {
                        throw new IOException("HLS playlist cache was disabled for this stream");
                    }
                }
                c10082.m25339();
                C20243 c20243 = new C20243();
                c20243.m46488(c16197);
                C3309 c3309 = new C3309();
                c3309.m10114(c16197);
                c3309.m10113(new InterfaceC15097() { // from class: l.ܿ֨ۜ
                    @Override // l.InterfaceC15097
                    /* renamed from: ֫ */
                    public final InterfaceC21449 mo6247() {
                        return new C18627(bArr);
                    }
                });
                c3309.m10115(c20243);
                c3309.m10112(new C17718(str));
                c3309.m10111(0);
                c3309.m10116();
                C13186 mo6247 = c3309.mo6247();
                C4515 c4515 = new C4515();
                uri2 = C23362.f75043;
                c4515.m13281(uri2);
                c4515.m13282(str);
                c4515.m13280(bArr.length);
                C13891 c13891 = new C13891(mo6247, c4515.m13278());
                this.f42828 = c13891;
                try {
                    c13891.m33301();
                    this.f42828 = null;
                    c10082.m25339();
                    long j4 = m35345;
                    try {
                        if (!c16197.m38148(str, 0L, bArr.length)) {
                            throw new IOException("HLS playlist cache write was incomplete");
                        }
                        c148952 = this.f42835.f75047;
                        if (c148952 != null && !c148952.m35344(j4)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        C23959 c23959 = new C23959();
                        enumC163062 = this.f42835.f75045;
                        c23959.m52788(enumC163062.mo5158(), "mt.hls.schema");
                        c23959.m52788(1L, "mt.hls.complete");
                        c23959.m52788(bArr.length, "mt.hls.body_length");
                        c23959.m52790("mt.hls.sha256", C14460.m34531(C14460.m34534().digest(bArr)));
                        c23959.m52790("mt.hls.final_uri", uri.toString());
                        enumC163063 = this.f42835.f75045;
                        if (enumC163063 == enumC163064) {
                            c23959.m52788(j, "mt.hls.created_at_ms");
                            c23959.m52788(j2, "mt.hls.expires_at_ms");
                            c23959.m52790("mt.hls.stream_type", "vod");
                        } else {
                            c23959.m52789("mt.hls.created_at_ms");
                            c23959.m52789("mt.hls.expires_at_ms");
                            c23959.m52789("mt.hls.stream_type");
                        }
                        c148953 = this.f42835.f75047;
                        if (c148953 == null) {
                            j3 = j4;
                            c16197.mo38142(str, c23959);
                        } else {
                            j3 = j4;
                            synchronized (c148953) {
                                if (!c148953.m35344(j3)) {
                                    throw new IOException("HLS playlist cache state changed before publishing");
                                }
                                c16197.mo38142(str, c23959);
                            }
                        }
                        c148954 = this.f42835.f75047;
                        if (c148954 != null && !c148954.m35344(j3)) {
                            throw new IOException("HLS playlist cache state changed while publishing");
                        }
                        if (m33852(c16197.mo38139(str)) == null) {
                            throw new IOException("HLS playlist cache metadata was not published");
                        }
                    } catch (IOException | RuntimeException unused) {
                        c161972 = c16197;
                        str2 = str;
                        try {
                            c161972.mo38142(str2, m33859());
                        } catch (IOException | RuntimeException unused2) {
                        }
                        try {
                            c16197.m38150(str);
                        } catch (RuntimeException unused3) {
                        }
                    }
                } catch (Throwable th) {
                    this.f42828 = null;
                    throw th;
                }
            } catch (IOException | RuntimeException unused4) {
            }
        } catch (IOException | RuntimeException unused5) {
            c161972 = c16197;
            str2 = str;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33854(C16197 c16197, List list) {
        C14895 c14895;
        C10082 c10082;
        C11493 c11493;
        c14895 = this.f42835.f75047;
        if (c14895 == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0078 c0078 = (C0078) it.next();
            if (this.f42830 || c14895.m35347() != EnumC7840.VOD) {
                return;
            }
            try {
                c11493 = this.f42835.f75050;
                c10082 = c11493.m28321(c0078.m1036());
                try {
                    this.f42838 = c10082;
                    c10082.m25335();
                    while (true) {
                        C7259 m33851 = m33851(c16197, c0078.m1037(), c0078.m1034(), false);
                        if (m33851 != null && Arrays.equals(m33851.m19427(), c0078.m1033()) && m33851.m19428().equals(c0078.m1035())) {
                            c10082.m25337();
                            break;
                        } else if (c10082.m25336()) {
                            if (m33857(c16197, c0078.m1037()) && c14895.m35347() == EnumC7840.VOD) {
                                m33853(c16197, c0078.m1037(), c0078.m1033(), c0078.m1035(), c10082);
                            }
                        }
                    }
                    c10082.m25338();
                    c10082.close();
                } catch (IOException | RuntimeException unused) {
                    if (c10082 != null) {
                        c10082.m25338();
                        c10082.close();
                    }
                    if (this.f42838 == c10082) {
                        this.f42838 = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c10082 != null) {
                        c10082.m25338();
                        c10082.close();
                    }
                    if (this.f42838 == c10082) {
                        this.f42838 = null;
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused2) {
                c10082 = null;
            } catch (Throwable th2) {
                th = th2;
                c10082 = null;
            }
            if (this.f42838 == c10082) {
                this.f42838 = null;
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C23959 m33859() {
        C23959 c23959 = new C23959();
        c23959.m52789("mt.hls.schema");
        c23959.m52789("mt.hls.complete");
        c23959.m52789("mt.hls.body_length");
        c23959.m52789("mt.hls.sha256");
        c23959.m52789("mt.hls.final_uri");
        c23959.m52789("mt.hls.created_at_ms");
        c23959.m52789("mt.hls.expires_at_ms");
        c23959.m52789("mt.hls.stream_type");
        C23959.m52785(c23959, -1L);
        C23959.m52786(c23959, (Uri) null);
        return c23959;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33855(InterfaceC21449 interfaceC21449) {
        Iterator it = this.f42829.iterator();
        while (it.hasNext()) {
            interfaceC21449.mo5937((InterfaceC0486) it.next());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33856(InterfaceC21449 interfaceC21449, Uri uri) {
        Map unmodifiableMap;
        Uri mo1621 = interfaceC21449.mo1621();
        if (mo1621 != null) {
            uri = mo1621;
        }
        this.f42840 = uri;
        Map mo5936 = interfaceC21449.mo5936();
        if (mo5936.isEmpty()) {
            unmodifiableMap = Collections.EMPTY_MAP;
        } else {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : mo5936.entrySet()) {
                hashMap.put((String) entry.getKey(), C20195.unmodifiableList(new ArrayList((Collection) entry.getValue())));
            }
            unmodifiableMap = C20195.unmodifiableMap(hashMap);
        }
        this.f42839 = unmodifiableMap;
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        C14895 c14895;
        int i3;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f42837;
        if (bArr2 != null && (i3 = this.f42834) < bArr2.length) {
            int min = Math.min(i2, bArr2.length - i3);
            System.arraycopy(bArr2, this.f42834, bArr, i, min);
            this.f42834 += min;
            return min;
        }
        InterfaceC21449 interfaceC21449 = this.f42836;
        if (interfaceC21449 == null) {
            return -1;
        }
        int read = interfaceC21449.read(bArr, i, i2);
        C5018 c5018 = this.f42831;
        if (c5018 != null) {
            if (read == -1) {
                this.f42831 = null;
                C16197 c16197 = this.f42832;
                this.f42832 = null;
                c14895 = this.f42835.f75047;
                if (c14895 != null) {
                    List m35341 = c14895.m35341(c5018.m14511(), null);
                    if (c16197 != null) {
                        m33854(c16197, m35341);
                        return read;
                    }
                }
            } else if (read > 0) {
                c5018.m14512(i, read, bArr);
            }
        }
        return read;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        InterfaceC21449 interfaceC21449 = this.f42836;
        Uri mo1621 = interfaceC21449 == null ? null : interfaceC21449.mo1621();
        return mo1621 == null ? this.f42840 : mo1621;
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final Map mo5936() {
        InterfaceC21449 interfaceC21449 = this.f42836;
        return interfaceC21449 == null ? this.f42839 : interfaceC21449.mo5936();
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f42830 = true;
        C13891 c13891 = this.f42828;
        if (c13891 != null) {
            c13891.m33302();
        }
        C10082 c10082 = this.f42838;
        this.f42838 = null;
        if (c10082 != null) {
            c10082.close();
        }
        InterfaceC21449 interfaceC21449 = this.f42836;
        this.f42836 = null;
        this.f42837 = null;
        this.f42834 = 0;
        this.f42831 = null;
        this.f42832 = null;
        this.f42833 = Collections.EMPTY_LIST;
        this.f42840 = null;
        this.f42839 = Collections.EMPTY_MAP;
        if (interfaceC21449 != null) {
            interfaceC21449.close();
        }
    }
}
