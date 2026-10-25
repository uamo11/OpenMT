package l;

import java.util.Iterator;

/* compiled from: 37LB */
/* renamed from: l.֫ܰ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1856 extends C14190 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C7772 f6336 = new C7772(C2609.m8239(), C2609.m8239(), false);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C4314 f6337 = new C4314();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22364 f6338;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7772 m6166(C8379 c8379, C7772 c7772, C7772 c77722, C7772 c77723) {
        C7772 c77724 = f6336;
        if (c7772 == c77724 && c77722 == c77724 && c77723 == c77724) {
            return c77724;
        }
        C2609 c2609 = c7772.f24023;
        C2609 c26092 = c7772.f24022;
        C2609 c26093 = c77723.f24023;
        C2609 c26094 = c77723.f24022;
        C2609 m6164 = m6164(c8379, c2609, c26093);
        C2609 c26095 = c77722.f24023;
        C2609 c26096 = c77722.f24022;
        C2609 m61642 = m6164(c8379, c26092, c26095);
        C2609 m61643 = m6164(c8379, c77722.f24023, c77723.f24023);
        C2609 m61644 = m6164(c8379, c7772.f24023, c26094);
        C2609 m61645 = m6164(c8379, c26092, c26096);
        return new C7772(m6165(c8379, m61643, m6164, m61642), m6165(c8379, m6164(c8379, c26096, c26094), m61644, m61645), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7772 m6167(C9085 c9085, C7772 c7772, C7772 c77722) {
        int i = C14121.f42604[c9085.mo989().ordinal()];
        if (i == 1) {
            return m6168((AbstractC19669) c9085, c7772, c77722);
        }
        if (i != 2) {
            return f6336;
        }
        return new C7772(m6164(c9085, c7772.f24023, c77722.f24023), m6165(c9085, c7772.f24022, c77722.f24022), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7772 m6168(AbstractC19669 abstractC19669, C7772 c7772, C7772 c77722) {
        return new C7772(m6165(abstractC19669, c7772.f24023, c77722.f24023), m6164(abstractC19669, c7772.f24022, c77722.f24022), false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7772 m6169(AbstractC19669 abstractC19669, C7772 c7772, C7772 c77722) {
        return (c7772 == null || c7772.f24024) ? c77722 : c77722.f24024 ? c7772 : new C7772(m6164(abstractC19669, c7772.f24023, c77722.f24023), m6164(abstractC19669, c7772.f24022, c77722.f24022), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2609 m6164(AbstractC19669 abstractC19669, C2609 c2609, C2609 c26092) {
        C2609 m8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16986 c16986 = (C16986) it.next();
            Iterator it2 = c26092.iterator();
            while (it2.hasNext()) {
                C16986 c169862 = (C16986) it2.next();
                if (c16986.f17562 == c169862.f17562 && (c16986.f17563 & 4398046511104L) == 0 && (c169862.f17563 & 4398046511104L) == 0) {
                    this.f6338.m7273(abstractC19669, C6241.f19226);
                    c169862.f17563 |= 4398046511104L;
                    m8239 = m8239.m8242(c169862);
                }
            }
        }
        return m8239;
    }

    @SafeVarargs
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final C2609 m6165(AbstractC19669 abstractC19669, C2609 c2609, C2609... c2609Arr) {
        for (C2609 c26092 : c2609Arr) {
            Iterator it = c26092.iterator();
            while (it.hasNext()) {
                C16986 c16986 = (C16986) it.next();
                Iterator it2 = c2609.iterator();
                while (it2.hasNext()) {
                    C16986 c169862 = (C16986) it2.next();
                    if (c169862.f17562 == c16986.f17562 && (c169862.f17563 & 4398046511104L) == 0 && (c16986.f17563 & 4398046511104L) == 0) {
                        this.f6338.m7273(abstractC19669, C6241.f19226);
                        c16986.f17563 |= 4398046511104L;
                    }
                }
                c2609 = c2609.m8242(c16986);
            }
        }
        return c2609;
    }

    public C1856(C2903 c2903) {
        this.f6338 = C22364.m50099(c2903);
    }
}
