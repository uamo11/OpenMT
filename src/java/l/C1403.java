package l;

import java.util.HashMap;

/* compiled from: 64HS */
/* renamed from: l.֨᩹ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1403 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f5053 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f5054 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13334 mo4896(C13334 c13334) {
        HashMap hashMap = this.f5053;
        C13334 c133342 = (C13334) hashMap.get(c13334);
        if (c133342 != null) {
            return c133342;
        }
        C13334 c133343 = new C13334();
        hashMap.put(c13334, c133343);
        return c133343;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18274 m4897(C18274 c18274) {
        HashMap hashMap = this.f5054;
        C18274 c182742 = (C18274) hashMap.get(c18274);
        if (c182742 != null) {
            return c182742;
        }
        C18274 c182743 = (C18274) c18274.clone();
        hashMap.put(c18274, c182743);
        return c182743;
    }
}
