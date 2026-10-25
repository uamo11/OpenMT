package l;

import java.util.BitSet;

/* compiled from: ZBH4 */
/* renamed from: l.᩹ۡܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22185 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f71974 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final BitSet f71975;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f71976;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20069 f71977;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20069 f71978;

    public C22185(C20069 c20069, BitSet bitSet, boolean z) {
        this.f71978 = c20069;
        this.f71975 = bitSet;
        this.f71977 = new C20069(c20069.size());
        this.f71976 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49827(C22185 c22185, int i) {
        Object m40978;
        m40978 = c22185.f71978.m40978(i);
        C21480 c21480 = (C21480) m40978;
        BitSet bitSet = c22185.f71975;
        if (bitSet == null || !bitSet.get(i)) {
            c21480 = c21480.m48646(c22185.f71974);
            if (!c22185.f71976) {
                c22185.f71974 = c21480.m48645() + c22185.f71974;
            }
        }
        c22185.f71976 = false;
        c22185.f71977.m40981(i, (Object) c21480);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20069 m49826(C22185 c22185) {
        C20069 c20069 = c22185.f71977;
        if (c22185.f71978.m43735()) {
            c20069.mo20349();
        }
        return c20069;
    }
}
