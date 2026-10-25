package l;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CA2B */
/* renamed from: l.ۙᩳۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4806 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f15210;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f15211;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo14016(C12441 c12441);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo14018(C23690 c23690);

    public AbstractC4806(int i, String str) {
        this.f15211 = i;
        this.f15210 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo14017(C12441 c12441, C1818 c1818) {
        AbstractC11716 abstractC11716 = AbstractC11716.f34968;
        C23690 c23690 = new C23690(AbstractC11716.m28608(EnumC23004.CONTEXT_SPECIFIC, this.f15211).m28610(EnumC0426.CONSTRUCTED), (AbstractC5366) c1818, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C22445.f72698);
        arrayList.add(c23690);
        C23690 c236902 = new C23690(AbstractC11716.m28608(EnumC23004.APPLICATION, 0), (AbstractC5366) new C1818(arrayList), false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C15948 c15948 = new C15948(new C8377(), byteArrayOutputStream);
        try {
            c15948.m37722(c236902);
            c15948.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            c12441.m26077(byteArray.length, byteArray);
        } catch (Throwable th) {
            try {
                c15948.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14015(AbstractC5366 abstractC5366) {
        boolean z = abstractC5366 instanceof C23690;
        int i = this.f15211;
        String str = this.f15210;
        if (z) {
            C23690 c23690 = (C23690) abstractC5366;
            if (c23690.m52234() == i) {
                AbstractC5366 m52235 = c23690.m52235();
                if (!(m52235 instanceof C1818)) {
                    throw new C20329("Expected a " + str + " (SEQUENCE), not: " + m52235);
                }
                Iterator it = ((C1818) m52235).iterator();
                while (it.hasNext()) {
                    AbstractC5366 abstractC53662 = (AbstractC5366) it.next();
                    if (!(abstractC53662 instanceof C23690)) {
                        throw new C20329("Expected an ASN.1 TaggedObject as " + str + " contents, not: " + abstractC53662);
                    }
                    mo14018((C23690) abstractC53662);
                }
                return;
            }
        }
        throw new C20329("Expected to find the " + str + " (CHOICE [" + i + "]) header, not: " + abstractC5366);
    }
}
