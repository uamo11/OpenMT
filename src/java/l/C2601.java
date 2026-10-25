package l;

import java.util.ArrayList;

/* compiled from: L1C0 */
/* renamed from: l.ۖܶ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2601 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC8245 f8220;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f8221;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m8227(C17417 c17417, long j) {
        AbstractC8245 abstractC8245 = c17417.f53266;
        ArrayList arrayList = c17417.f53269;
        if (abstractC8245 instanceof C9657) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC11068 interfaceC11068 = (InterfaceC11068) arrayList.get(i);
            if (interfaceC11068 instanceof C17417) {
                C17417 c174172 = (C17417) interfaceC11068;
                if (c174172.f53266 != abstractC8245) {
                    j2 = Math.max(j2, m8227(c174172, c174172.f53272 + j));
                }
            }
        }
        C17417 c174173 = abstractC8245.f25382;
        C17417 c174174 = abstractC8245.f25379;
        if (c17417 != c174173) {
            return j2;
        }
        long mo6245 = abstractC8245.mo6245() + j;
        return Math.max(Math.max(j2, m8227(c174174, mo6245)), mo6245 - c174174.f53272);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m8226(C17417 c17417, long j) {
        AbstractC8245 abstractC8245 = c17417.f53266;
        ArrayList arrayList = c17417.f53269;
        if (abstractC8245 instanceof C9657) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC11068 interfaceC11068 = (InterfaceC11068) arrayList.get(i);
            if (interfaceC11068 instanceof C17417) {
                C17417 c174172 = (C17417) interfaceC11068;
                if (c174172.f53266 != abstractC8245) {
                    j2 = Math.min(j2, m8226(c174172, c174172.f53272 + j));
                }
            }
        }
        C17417 c174173 = abstractC8245.f25379;
        C17417 c174174 = abstractC8245.f25382;
        if (c17417 != c174173) {
            return j2;
        }
        long mo6245 = j - abstractC8245.mo6245();
        return Math.min(Math.min(j2, m8226(c174174, mo6245)), mo6245 - c174174.f53272);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8228(C21446 c21446, int i) {
        AbstractC8245 abstractC8245 = this.f8220;
        if (!(abstractC8245 instanceof C1895) ? i != 0 ? (abstractC8245 instanceof C18829) : (abstractC8245 instanceof C16005) : ((C1895) abstractC8245).f25378 == i) {
            return 0L;
        }
        C17417 c17417 = (i == 0 ? c21446.f46156 : c21446.f46140).f25382;
        C17417 c174172 = (i == 0 ? c21446.f46156 : c21446.f46140).f25379;
        C17417 c174173 = abstractC8245.f25382;
        C17417 c174174 = abstractC8245.f25382;
        C17417 c174175 = abstractC8245.f25379;
        boolean contains = c174173.f53275.contains(c17417);
        boolean contains2 = c174175.f53275.contains(c174172);
        long mo6245 = abstractC8245.mo6245();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(m8227(c174174, c174174.f53272), c174174.f53272 + mo6245);
            }
            if (contains2) {
                return Math.max(-m8226(c174175, c174175.f53272), (-c174175.f53272) + mo6245);
            }
            return (abstractC8245.mo6245() + c174174.f53272) - c174175.f53272;
        }
        long m8227 = m8227(c174174, 0L);
        long m8226 = m8226(c174175, 0L);
        long j = m8227 - mo6245;
        int i2 = c174175.f53272;
        if (j >= (-i2)) {
            j += i2;
        }
        long j2 = c174174.f53272;
        long j3 = ((-m8226) - mo6245) - j2;
        if (j3 >= j2) {
            j3 -= j2;
        }
        float m35708 = abstractC8245.f25376.m35708(i);
        float f = m35708 > 0.0f ? (long) ((j / (1.0f - m35708)) + (j3 / m35708)) : 0L;
        return (c174174.f53272 + ((((long) ((f * m35708) + 0.5f)) + mo6245) + ((long) C20382.m46695(1.0f, m35708, f, 0.5f)))) - c174175.f53272;
    }
}
