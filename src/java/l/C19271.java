package l;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Properties;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: M43N */
/* renamed from: l.᩵ۛ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19271 extends AbstractC0286 implements InterfaceC2404 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0219 f60646;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f60647;

    @Override // l.InterfaceC2404
    /* renamed from: ֫ */
    public final Properties mo5712(InterfaceC2404 interfaceC2404, InterfaceC8754 interfaceC8754) {
        C19271 c19271 = (C19271) interfaceC2404;
        Properties properties = new Properties();
        properties.put("style", ((EnumC9393) interfaceC8754).f28528);
        StringBuilder sb = new StringBuilder();
        Iterator it = ((C18837) this.f28700).iterator();
        String str = "";
        while (it.hasNext()) {
            Iterator it2 = ((C0779) this.f60646.f1476.f16125.m1868((AbstractC4308) it.next())).m2963(EnumC19125.values()).iterator();
            while (it2.hasNext()) {
                AbstractC4308 abstractC4308 = (AbstractC4308) it2.next();
                if (abstractC4308.m12928(C2609.m8235((Iterable) c19271.f28700))) {
                    sb.append(str);
                    sb.append(abstractC4308);
                    str = ",";
                }
            }
        }
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + sb.toString() + "\"");
        return properties;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19271(l.C0219 r1, l.AbstractC4308 r2) {
        /*
            r0 = this;
            r0.f60646 = r1
            l.ᩴܶ۠ r1 = new l.ᩴܶ۠
            r1.<init>()
            r1.m43511(r2)
            r0.<init>(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f60647 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19271.<init>(l.֡ۛ֨, l.ۙ֨֨):void");
    }

    @Override // l.AbstractC9460
    /* renamed from: ۧ */
    public final InterfaceC8754[] mo5713() {
        return new InterfaceC8754[]{EnumC9393.BOUND};
    }

    @Override // l.AbstractC0286
    /* renamed from: ܿ */
    public final Iterable mo1628() {
        return this.f60647;
    }

    @Override // l.AbstractC9460
    /* renamed from: ֫ */
    public final Collection mo5710(InterfaceC8754 interfaceC8754) {
        if (interfaceC8754 == EnumC9393.BOUND) {
            return this.f60647;
        }
        throw new IllegalStateException();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashSet m44455() {
        HashSet hashSet = new HashSet();
        m44454(hashSet);
        return hashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44454(HashSet hashSet) {
        if (hashSet.add(this)) {
            Iterator it = this.f60647.iterator();
            while (it.hasNext()) {
                ((C19271) it.next()).m44454(hashSet);
            }
        }
    }

    @Override // l.InterfaceC2404
    /* renamed from: ֫ */
    public final Properties mo5711() {
        Properties properties = new Properties();
        properties.put(AnnotatedPrivateKey.LABEL, "\"" + this.f28700.toString() + "\"");
        return properties;
    }
}
