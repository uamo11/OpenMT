package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: D76O */
/* renamed from: l.᩶᩷ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20415 {

    /* renamed from: ܽܽ֡, reason: not valid java name and contains not printable characters */
    private static final short[] f65876 = {1001, 23634, 23635, 23630, 23639, 23630, 23643, 23642, 23620, 23635, 23621, 23641, 23619, 23620, 23637, 23635, 23657, 23618, 23639, 23636, 23642, 23635};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15799 f65877;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10247 f65878;

    public C20415(C15799 c15799, C10247 c10247) {
        this.f65877 = c15799;
        this.f65878 = c10247;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (l.C0630.f2410 > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        r29 = r6;
        r2 = r11;
        r11 = r4;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (l.C1773.f6144 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0104, code lost:
    
        if (l.C21923.f70183 == 0) goto L39;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C17592 m46820(l.C14852 r39, l.C17178 r40, l.C15923 r41) {
        /*
            Method dump skipped, instructions count: 2084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20415.m46820(l.ܳ᩻ۜ, l.ܿۜۜ, l.ܺۨ᩻):l.ܿ᩷ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21826 m46816(C14852 c14852, C17178 c17178, C15923 c15923, ArrayList arrayList, int i, C21826 c21826) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C22531 c22531;
        int i7;
        C14852 c148522 = c14852;
        C15923 c159232 = c15923;
        long parseLong = (int) Long.parseLong(c17178.f52650.substring(2), 16);
        String str = c17178.f52646;
        C15799 c15799 = this.f65877;
        ArrayList m37408 = c15799.m37408(c148522, str, c159232);
        C22531 c225312 = new C22531();
        int i8 = c21826.f69912;
        int i9 = c21826.f69916;
        int i10 = i8;
        while (i10 < m37408.size()) {
            C7980 m37426 = c15799.m37426(c148522, str, (C17667) m37408.get(i10), c159232);
            int i11 = i10 == i8 ? i9 : 0;
            int i12 = 0;
            for (C16611 c16611 : m37426.getMethods()) {
                int i13 = i12 + 1;
                if (i12 < i11) {
                    i4 = i11;
                    i5 = i10;
                    i6 = i9;
                    c22531 = c225312;
                    i7 = i8;
                } else {
                    if (i10 == i8 && i12 == i9) {
                        i2 = i12;
                        i3 = c21826.f69917;
                    } else {
                        i2 = i12;
                        i3 = 0;
                    }
                    int i14 = i2;
                    i4 = i11;
                    i5 = i10;
                    i6 = i9;
                    c22531 = c225312;
                    i7 = i8;
                    c225312.m50529(c17178, arrayList, c16611, parseLong);
                    int m39129 = c16611.m39129(i3, c22531);
                    C21826 c218262 = m39129 >= 0 ? new C21826(i, 0, i5, i14, m39129, 0) : null;
                    if (c218262 != null) {
                        return c218262;
                    }
                }
                c225312 = c22531;
                i12 = i13;
                i11 = i4;
                i10 = i5;
                i9 = i6;
                i8 = i7;
            }
            i10++;
            c148522 = c14852;
            c159232 = c15923;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C21826 m46815(C14852 c14852, C17178 c17178, ArrayList arrayList, int i, C21826 c21826) {
        C22274 c22274;
        C18090 c18090;
        Throwable th;
        ArrayList arrayList2;
        C22274 c222742;
        C11418 c11418;
        C12534 c12534;
        int i2;
        C21569 c21569;
        int m50003;
        C14852 c148522 = c14852;
        int i3 = c21826.f69913;
        String str = c17178.f52646;
        C15799 c15799 = this.f65877;
        ArrayList m37430 = c15799.m37430(c148522, str);
        HashMap m37433 = c15799.m37433(c148522, str);
        C22274 m35251 = c14852.m35251();
        C21569 m50006 = m35251.m50006();
        C11418 c114182 = new C11418();
        try {
            try {
                try {
                    C18090 c180902 = new C18090(c14852.m35253());
                    try {
                        C12534 m25976 = this.f65878.m25976(c148522, c15799, str);
                        int i4 = i3;
                        while (i4 < m37430.size()) {
                            C13874 c13874 = (C13874) m37430.get(i4);
                            Long l2 = c13874.f41356;
                            String str2 = c13874.f41355;
                            if (l2 != null) {
                                try {
                                    if (l2.longValue() <= 10 || c13874.f41356.longValue() > 2097152) {
                                        arrayList2 = m37430;
                                        i2 = i4;
                                        c12534 = m25976;
                                        c18090 = c180902;
                                        c11418 = c114182;
                                        c21569 = m50006;
                                        c222742 = m35251;
                                        i4 = i2 + 1;
                                        c148522 = c14852;
                                        m50006 = c21569;
                                        m25976 = c12534;
                                        m37430 = arrayList2;
                                        c180902 = c18090;
                                        c114182 = c11418;
                                        m35251 = c222742;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    c18090 = c180902;
                                    try {
                                        c18090.close();
                                        throw th;
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                        throw th;
                                    }
                                }
                            }
                            String str3 = (String) m37433.get(str2);
                            arrayList2 = m37430;
                            if (!"zip_entry".equals(str3)) {
                                boolean z = true;
                                if ("axml".equals(str3)) {
                                    c15799.m37422(c148522, str, str2, c114182);
                                } else {
                                    try {
                                        c114182.m28185(0);
                                        C3545 entry = c180902.getEntry(str2);
                                        if (entry != null && (m50003 = m35251.m50003(str2)) != 1) {
                                            if (m50003 == 2) {
                                                C12396.m30565(c180902, entry, m25976, c114182);
                                                z = true;
                                            } else {
                                                m50006.m48727(str2);
                                                z = C12396.m30562(c180902, entry, m25976, c114182, m50006);
                                            }
                                        }
                                    } catch (C3059 e) {
                                        c18090 = c180902;
                                        throw e;
                                    } catch (Exception unused) {
                                    }
                                    z = false;
                                }
                                if (z) {
                                    i2 = i4;
                                    c12534 = m25976;
                                    c18090 = c180902;
                                    c11418 = c114182;
                                    c21569 = m50006;
                                    c222742 = m35251;
                                    try {
                                        C21826 m46817 = m46817(c17178, arrayList, i, i2, c13874.f41355, c11418, i4 == i3 ? c21826.f69915 : 0);
                                        if (m46817 != null) {
                                            c18090.close();
                                            c222742.m50004();
                                            return m46817;
                                        }
                                        i4 = i2 + 1;
                                        c148522 = c14852;
                                        m50006 = c21569;
                                        m25976 = c12534;
                                        m37430 = arrayList2;
                                        c180902 = c18090;
                                        c114182 = c11418;
                                        m35251 = c222742;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        th = th;
                                        c18090.close();
                                        throw th;
                                    }
                                }
                            }
                            i2 = i4;
                            c12534 = m25976;
                            c18090 = c180902;
                            c11418 = c114182;
                            c21569 = m50006;
                            c222742 = m35251;
                            i4 = i2 + 1;
                            c148522 = c14852;
                            m50006 = c21569;
                            m25976 = c12534;
                            m37430 = arrayList2;
                            c180902 = c18090;
                            c114182 = c11418;
                            m35251 = c222742;
                        }
                        c22274 = m35251;
                        c180902.close();
                    } catch (Throwable th5) {
                        th = th5;
                        c18090 = c180902;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    m35251.m50004();
                    throw th;
                }
            } catch (C3059 e2) {
                throw e2;
            } catch (Exception unused2) {
            }
        } catch (C3059 e3) {
            throw e3;
        } catch (Exception unused3) {
            c22274 = m35251;
        } catch (Throwable th7) {
            th = th7;
            m35251.m50004();
            throw th;
        }
        c22274.m50004();
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21826 m46817(C17178 c17178, ArrayList arrayList, int i, int i2, String str, C11418 c11418, int i3) {
        int i4;
        C7184 c7184 = new C7184();
        try {
            C13000 c13000 = new C13000(c11418);
            try {
                c7184.m19219(c13000);
                while (c7184.m19220() != 1) {
                    if (c7184.m19231() == 2) {
                        int i5 = 0;
                        int i6 = 0;
                        while (i6 < c7184.m19216()) {
                            C16396 m19227 = c7184.m19227(i6);
                            if (m19227.m38632() >= i3 && !"xmlns".equals(c7184.m19234(i6)) && !"xmlns".equals(c7184.m19217(i6))) {
                                String m19232 = c7184.m19232(i6);
                                if (!m19232.isEmpty() && (m19232.charAt(i5) == '@' || m19232.charAt(i5) == '?')) {
                                    String str2 = c17178.f52650;
                                    if (m46818(m19232, i5, str2.length(), str2)) {
                                        i4 = str2.length();
                                    } else {
                                        int length = str2.length() - 2;
                                        i4 = (length <= 0 || !m46818(m19232, 2, length, str2)) ? -1 : length;
                                    }
                                    if (i4 != 0 && i4 + 1 == m19232.length()) {
                                        arrayList.add(new C18298("axml", "resource_id", "axml", str, C8163.m21635(Math.max(i5, m19227.m38632() - 80), c11418.length(), 300, c11418).replace('\n', ' '), null, null, null, null, null, null));
                                        if (arrayList.size() >= c17178.f52647) {
                                            C21826 c21826 = new C21826(i, i2, 0, 0, 0, m19227.m38630());
                                            c13000.close();
                                            return c21826;
                                        }
                                        i6++;
                                        i5 = 0;
                                    }
                                }
                            }
                            i6++;
                            i5 = 0;
                        }
                    }
                }
                c13000.close();
                return null;
            } finally {
            }
        } catch (IOException | C1580 unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46818(String str, int i, int i2, String str2) {
        if (i2 + 1 <= str.length() && i + i2 <= str2.length()) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = 1 + i3;
                char charAt = str.charAt(i4);
                if (charAt >= 'A' && charAt <= 'Z') {
                    charAt = (char) (charAt + ' ');
                }
                char charAt2 = str2.charAt(i3 + i);
                if (charAt2 >= 'A' && charAt2 <= 'Z') {
                    charAt2 = (char) (charAt2 + ' ');
                }
                if (charAt == charAt2) {
                    i3 = i4;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C21826 m46819(C14852 c14852, C17178 c17178, ArrayList arrayList, int i, C21826 c21826) {
        String str = c17178.f52646;
        C10247 c10247 = this.f65878;
        C15799 c15799 = this.f65877;
        C9042 m25979 = c10247.m25979(c14852, c15799, str);
        try {
            String str2 = c17178.f52650;
            int i2 = c21826.f69913;
            int i3 = c21826.f69915;
            int size = c17178.f52647 - arrayList.size();
            HashSet hashSet = new HashSet();
            Iterator it = c15799.m37430(c14852, str).iterator();
            while (it.hasNext()) {
                hashSet.add(((C13874) it.next()).f41355);
            }
            C6925 m23331 = m25979.m23331(str2, i2, i3, size, hashSet);
            Iterator it2 = m23331.f21381.iterator();
            while (it2.hasNext()) {
                C14685 c14685 = (C14685) it2.next();
                String str3 = c14685.f44860;
                C13232 c13232 = c14685.f44857;
                arrayList.add(new C18298("resource_table", str3, "resource", C9042.m23294(c13232.f39608), c14685.f44859, c13232.f39606, c13232.f39605, c14685.f44861, c14685.f44855, c14685.f44856, c14685.f44858));
            }
            if (m23331.f21378) {
                return new C21826(i, m23331.f21380, 0, 0, 0, m23331.f21379);
            }
            return null;
        } catch (C3059 e) {
            if (C15799.m37396(str)) {
                C10247.m25972(c14852, e);
            }
            throw e;
        }
    }
}
