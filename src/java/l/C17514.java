package l;

import java.util.Collection;
import java.util.HashMap;

/* compiled from: 5BHG */
/* renamed from: l.ܿᩳܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17514 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f53490 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9048 f53491;

    public C17514(C9048 c9048) {
        this.f53491 = c9048;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14691 m40928(C7573 c7573) {
        C23864 c23864;
        HashMap hashMap = this.f53490;
        C14691 c14691 = (C14691) hashMap.get(c7573);
        if (c14691 != null) {
            return c14691;
        }
        c23864 = this.f53491.f27441;
        C14691 c146912 = new C14691(c23864.mo18741(), c7573);
        hashMap.put(c7573, c146912);
        return c146912;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection m40927() {
        return this.f53490.values();
    }
}
