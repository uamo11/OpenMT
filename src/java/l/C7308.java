package l;

import java.util.HashMap;

/* compiled from: B4S2 */
/* renamed from: l.۟ۜܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7308 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f22430;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f22431;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f22432;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C21834 f22434;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f22435;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4900 f22433 = new C4900();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f22429 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19589(C7308 c7308, String str) {
        c7308.f22435 = C7017.m18950(str);
        c7308.f22431 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19586(C7308 c7308, String str) {
        c7308.f22430 = C7017.m18950(str);
        c7308.f22432 = true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m19591(C7308 c7308) {
        if (!c7308.f22431 || !c7308.f22432) {
            throw new IllegalStateException("Syntax dependencies are not fully loaded");
        }
        return ((c7308.f22435 + 127224) * 31) + c7308.f22430;
    }
}
