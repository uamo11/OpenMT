package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Q9XD */
/* renamed from: l.ܶᩳۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C15388 extends AbstractC4806 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f47119;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f47120;

    public C15388() {
        super(0, "NegTokenInit");
        this.f47120 = new ArrayList();
    }

    @Override // l.AbstractC4806
    /* renamed from: ֫ */
    public final void mo14016(C12441 c12441) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f47120;
            if (arrayList2.size() > 0) {
                ArrayList arrayList3 = new ArrayList(arrayList2);
                AbstractC11716 abstractC11716 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 0).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C1818(arrayList3), true));
            }
            byte[] bArr = this.f47119;
            if (bArr != null && bArr.length > 0) {
                AbstractC11716 abstractC117162 = AbstractC11716.f34968;
                arrayList.add(new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, 2).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) new C10285(this.f47119), true));
            }
            mo14017(c12441, new C1818(arrayList));
        } catch (IOException e) {
            throw new C20329("Unable to write NegTokenInit", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36428(byte[] bArr) {
        try {
            C8894 c8894 = new C8894(new C19478(), new C12441(bArr).m26085());
            try {
                C23690 c23690 = (C23690) c8894.readObject();
                if (c23690.m15330().m28611() != EnumC23004.APPLICATION) {
                    throw new C20329("Incorrect GSS-API ASN.1 token received, expected to find an [APPLICATION 0], not: " + c23690);
                }
                C1818 c1818 = (C1818) c23690.m52233(AbstractC11716.f34964);
                AbstractC5366 abstractC5366 = c1818.get(0);
                if (!(abstractC5366 instanceof C21574)) {
                    throw new C20329("Expected to find the SPNEGO OID (" + C22445.f72698 + "), not: " + abstractC5366);
                }
                m14015(c1818.get(1));
                c8894.close();
            } finally {
            }
        } catch (IOException e) {
            throw new C20329("Could not read NegTokenInit from buffer", e);
        }
    }

    @Override // l.AbstractC4806
    /* renamed from: ֫ */
    public void mo14018(C23690 c23690) {
        if (c23690.m52235().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int m52234 = c23690.m52234();
        if (m52234 == 0) {
            m36431(c23690.m52235());
            return;
        }
        if (m52234 != 1) {
            if (m52234 == 2) {
                m36429(c23690.m52235());
            } else {
                if (m52234 == 3) {
                    return;
                }
                throw new C20329("Unknown Object Tag " + c23690.m52234() + " encountered.");
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36429(AbstractC5366 abstractC5366) {
        if (!(abstractC5366 instanceof C10285)) {
            throw new C20329("Expected the MechToken (OCTET_STRING) contents, not: " + abstractC5366);
        }
        this.f47119 = ((C10285) abstractC5366).getValue();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36431(AbstractC5366 abstractC5366) {
        if (!(abstractC5366 instanceof C1818)) {
            throw new C20329("Expected the MechTypeList (SEQUENCE) contents, not: " + abstractC5366);
        }
        Iterator it = ((C1818) abstractC5366).iterator();
        while (it.hasNext()) {
            AbstractC5366 abstractC53662 = (AbstractC5366) it.next();
            if (!(abstractC53662 instanceof C21574)) {
                throw new C20329("Expected a MechType (OBJECT IDENTIFIER) as contents of the MechTypeList, not: " + abstractC53662);
            }
            this.f47120.add((C21574) abstractC53662);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36427(C21574 c21574) {
        this.f47120.add(c21574);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36430(byte[] bArr) {
        this.f47119 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m36426() {
        return this.f47120;
    }
}
