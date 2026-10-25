package l;

import android.os.Bundle;

/* compiled from: PAOD */
/* renamed from: l.۫ۢ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12318 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C18147 m29874(C15228 c15228, AbstractC7379 abstractC7379, String str, Bundle bundle) {
        C11233.m27805(c15228, "registry");
        C11233.m27805(abstractC7379, "lifecycle");
        Bundle m36036 = c15228.m36036(str);
        int i = C11092.f33284;
        C18147 c18147 = new C18147(str, C1919.m6334(m36036, bundle));
        c18147.m42255(abstractC7379, c15228);
        m29876(abstractC7379, c15228);
        return c18147;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m29875(AbstractC5447 abstractC5447, C15228 c15228, AbstractC7379 abstractC7379) {
        C11233.m27805(c15228, "registry");
        C11233.m27805(abstractC7379, "lifecycle");
        C18147 c18147 = (C18147) abstractC5447.m15546();
        if (c18147 == null || c18147.m42256()) {
            return;
        }
        c18147.m42255(abstractC7379, c15228);
        m29876(abstractC7379, c15228);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29876(AbstractC7379 abstractC7379, C15228 c15228) {
        EnumC13728 mo19832 = abstractC7379.mo19832();
        if (mo19832 == EnumC13728.INITIALIZED || mo19832.m33028(EnumC13728.STARTED)) {
            c15228.m36041();
        } else {
            abstractC7379.mo19833(new C13023(abstractC7379, c15228));
        }
    }
}
