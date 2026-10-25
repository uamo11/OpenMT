package l;

import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/* compiled from: OBBK */
/* renamed from: l.ۘ֫ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3625 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C13758 f11473 = C13758.m33067((Integer) (-1), (Integer) (-1));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC7858 f11474;

    public C3625(AbstractC7858 abstractC7858) {
        this.f11474 = abstractC7858;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11104(C19854 c19854, C18711 c18711, AbstractC7858 abstractC7858) {
        C2903 c2903 = new C2903();
        C23279 c23279 = new C23279();
        c2903.m8839(InterfaceC14106.class, c23279);
        C11781.m28823(c2903).m28828("allowStringFolding", "false");
        C11781.m28823(c2903).m28828("--enable-preview", "true");
        try {
            new C11844(c2903, true, StandardCharsets.UTF_8).m28936(EnumC21101.PLATFORM_CLASS_PATH, AbstractC14545.of());
            C2214 c2214 = new C2214(URI.create("source"), EnumC16866.SOURCE, c19854);
            C22364.m50099(c2903).m7284(c2214);
            C1323 m33988 = C15684.m36959(c2903).m36960(c19854.m45663(), true, true, true, false).m33988();
            m33988.f4745 = c2214;
            c19854.m45660(m33988);
            Iterable m22954 = C8882.m22954(c23279.m51594(), new C15618());
            if (!C8882.m22957(m22954)) {
                throw new C18442(C8882.m22949(m22954, new C15942(10)));
            }
            C13675 c13675 = new C13675(c19854, c18711);
            new C3894(c13675, abstractC7858.mo21059().m3026()).m11845(m33988);
            c13675.m32913(c19854.m45663().length());
            c13675.m32900();
            C18616 c18616 = new C18616();
            AbstractC4628 listIterator = c13675.m32911().listIterator(0);
            while (listIterator.hasNext()) {
                ((InterfaceC12265) listIterator.next()).mo7732(c18616);
            }
            AbstractC3799 m43157 = c18616.m43157();
            m43157.mo7731(c18711.m43331(), new C9444());
            m43157.mo7733(c18711);
            c18711.m43330();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11105(AbstractC21189 abstractC21189, AbstractC17660 abstractC17660) {
        String mo48138 = abstractC21189.mo48138();
        AbstractC14545 of = AbstractC14545.of((Object) C13758.m33067((Integer) 0, Integer.valueOf(mo48138.length())));
        C19854 c19854 = new C19854(mo48138);
        AbstractC7858 abstractC7858 = this.f11474;
        if (abstractC7858.mo21058()) {
            c19854 = C20122.m46376(c19854, of);
        }
        String m31534 = C12970.m31534(mo48138);
        C18711 c18711 = new C18711(m31534, c19854, new C0096(m31534, abstractC7858));
        try {
            m11104(c19854, c18711, abstractC7858);
            String m43323 = C18711.m43323(mo48138, c18711.m43326(c19854.m45659((Collection) of)));
            m43323.getClass();
            abstractC17660.mo24410().append((CharSequence) m43323);
        } catch (C0270 e) {
            throw new C18442(e.m1583());
        }
    }
}
