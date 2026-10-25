package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 57R8 */
/* renamed from: l.ۜ۟ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6621 extends AbstractC3799 {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC8032 f20381;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f20384 = new ArrayList();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f20382 = false;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f20383 = new ArrayList();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f20385 = new ArrayList();

    public C6621(AbstractC8032 abstractC8032) {
        this.f20381 = abstractC8032;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6621 m18151(AbstractC8032 abstractC8032) {
        return new C6621(abstractC8032);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18153(AbstractC3799 abstractC3799) {
        this.f20384.add(abstractC3799);
    }

    @Override // l.AbstractC3799
    /* renamed from: ֫ */
    public final String mo7730() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f20384.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC3799) it.next()).m11470());
        }
        return sb.toString();
    }

    @Override // l.AbstractC3799
    /* renamed from: ۧ */
    public final C13758 mo7736() {
        C13758 c13758;
        AbstractC19198 abstractC19198;
        c13758 = AbstractC3799.f11983;
        Iterator it = this.f20384.iterator();
        while (it.hasNext()) {
            C13758 m11468 = ((AbstractC3799) it.next()).m11468();
            if (c13758.m33072()) {
                c13758 = m11468;
            } else if (!m11468.m33072()) {
                C13758 m33079 = c13758.m33079(m11468);
                abstractC19198 = AbstractC3799.f11982;
                c13758 = m33079.m33071(abstractC19198);
            }
        }
        return c13758;
    }

    @Override // l.AbstractC3799
    /* renamed from: ֫ */
    public final C9444 mo7731(InterfaceC10855 interfaceC10855, C9444 c9444) {
        int m11469 = c9444.f28632 + m11469();
        if (m11469 <= 100) {
            this.f20382 = true;
            return c9444.m24272(m11469);
        }
        int mo3442 = c9444.f28633 + this.f20381.mo3442();
        int i = 0;
        C9444 c94442 = new C9444(mo3442, mo3442, c9444.f28632, false);
        ArrayList arrayList = this.f20383;
        arrayList.clear();
        ArrayList arrayList2 = this.f20385;
        arrayList2.clear();
        arrayList.add(new ArrayList());
        Iterator it = this.f20384.iterator();
        while (it.hasNext()) {
            AbstractC3799 abstractC3799 = (AbstractC3799) it.next();
            if (abstractC3799 instanceof C14381) {
                arrayList2.add((C14381) abstractC3799);
                arrayList.add(new ArrayList());
            } else {
                ((List) C8882.m22955(arrayList)).add(abstractC3799);
            }
        }
        C9444 m18152 = m18152(interfaceC10855, c94442, C16646.empty(), (List) arrayList.get(0));
        while (i < arrayList2.size()) {
            C16646 of = C16646.of((C14381) arrayList2.get(i));
            i++;
            m18152 = m18152(interfaceC10855, m18152, of, (List) arrayList.get(i));
        }
        return c9444.m24272(m18152.f28632);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r2 != l.EnumC23554.UNIFIED) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081 A[LOOP:1: B:23:0x007b->B:25:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C9444 m18152(l.InterfaceC10855 r7, l.C9444 r8, l.C16646 r9, java.util.List r10) {
        /*
            boolean r0 = r9.isPresent()
            r1 = 0
            if (r0 == 0) goto L12
            java.lang.Object r0 = r9.get()
            l.ܳ۟ܺ r0 = (l.C14381) r0
            int r0 = r0.m11469()
            goto L13
        L12:
            r0 = 0
        L13:
            java.util.Iterator r2 = r10.iterator()
            r3 = 0
        L18:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()
            l.ۘ۟ܺ r4 = (l.AbstractC3799) r4
            int r4 = r4.m11469()
            int r3 = r3 + r4
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r4) goto L18
            r3 = 1000(0x3e8, float:1.401E-42)
        L2f:
            boolean r2 = r9.isPresent()
            r4 = 100
            r5 = 1
            if (r2 == 0) goto L46
            java.lang.Object r2 = r9.get()
            l.ܳ۟ܺ r2 = (l.C14381) r2
            l.᩻۟ܺ r2 = l.C14381.m34347(r2)
            l.᩻۟ܺ r6 = l.EnumC23554.UNIFIED
            if (r2 == r6) goto L53
        L46:
            boolean r2 = r8.f28635
            if (r2 != 0) goto L53
            int r2 = r8.f28632
            int r2 = r2 + r0
            int r2 = r2 + r3
            if (r2 <= r4) goto L51
            goto L53
        L51:
            r0 = 0
            goto L54
        L53:
            r0 = 1
        L54:
            boolean r2 = r9.isPresent()
            if (r2 == 0) goto L66
            java.lang.Object r9 = r9.get()
            l.ܳ۟ܺ r9 = (l.C14381) r9
            int r2 = r8.f28634
            l.ۢ۟ܺ r8 = r9.m34348(r8, r2, r0)
        L66:
            int r9 = r8.f28632
            int r3 = r3 + r9
            if (r3 > r4) goto L6d
            r0 = 1
            goto L6e
        L6d:
            r0 = 0
        L6e:
            l.ۢ۟ܺ r2 = new l.ۢ۟ܺ
            int r3 = r8.f28634
            int r8 = r8.f28633
            r2.<init>(r3, r8, r9, r1)
            java.util.Iterator r8 = r10.iterator()
        L7b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L8c
            java.lang.Object r9 = r8.next()
            l.ۘ۟ܺ r9 = (l.AbstractC3799) r9
            l.ۢ۟ܺ r2 = r9.mo7731(r7, r2)
            goto L7b
        L8c:
            if (r0 != 0) goto L9a
            l.ۢ۟ܺ r7 = new l.ۢ۟ܺ
            int r8 = r2.f28634
            int r9 = r2.f28633
            int r10 = r2.f28632
            r7.<init>(r8, r9, r10, r5)
            return r7
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6621.m18152(l.ۧ۟ܺ, l.ۢ۟ܺ, l.ܽ۫ᩴ, java.util.List):l.ۢ۟ܺ");
    }

    @Override // l.AbstractC3799
    /* renamed from: ֫ */
    public final void mo7733(C18711 c18711) {
        if (this.f20382) {
            c18711.m43328(m11468(), m11470());
            return;
        }
        ArrayList arrayList = this.f20383;
        int i = 0;
        Iterator it = ((List) arrayList.get(0)).iterator();
        while (it.hasNext()) {
            ((AbstractC3799) it.next()).mo7733(c18711);
        }
        while (true) {
            ArrayList arrayList2 = this.f20385;
            if (i >= arrayList2.size()) {
                return;
            }
            ((C14381) arrayList2.get(i)).mo7733(c18711);
            i++;
            Iterator it2 = ((List) arrayList.get(i)).iterator();
            while (it2.hasNext()) {
                ((AbstractC3799) it2.next()).mo7733(c18711);
            }
        }
    }

    @Override // l.AbstractC3799
    /* renamed from: ܽ */
    public final int mo7738() {
        Iterator it = this.f20384.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((AbstractC3799) it.next()).m11469();
            if (i >= 1000) {
                return 1000;
            }
        }
        return i;
    }

    public final String toString() {
        C8964 m37871 = C16018.m37871(this);
        m37871.m23110(this.f20381, "plusIndent");
        m37871.m23110(this.f20384, "docs");
        return m37871.toString();
    }
}
