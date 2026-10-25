package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 5BGM */
/* renamed from: l.ܳ᩷ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C14775 extends AbstractC3073 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final EnumC3779 f45118;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f45119;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14775(l.EnumC3779 r4, java.util.ArrayList r5) {
        /*
            r3 = this;
            int r0 = m35146(r5)
            r1 = 0
            java.lang.Object r1 = r5.get(r1)
            l.ۗۜܺ r1 = (l.AbstractC3073) r1
            int r2 = r5.size()
            int r1 = r1.mo3385()
            int r1 = r1 * r2
            int r2 = m35146(r5)
            int r1 = r1 + r2
            r3.<init>(r0, r1)
            if (r4 == 0) goto L24
            r3.f45119 = r5
            r3.f45118 = r4
            return
        L24:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "itemType == null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14775.<init>(l.ۘۜܺ, java.util.ArrayList):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m35146(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC3073) arrayList.get(0)).m9392());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return this.f45118;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C14775.class.getName());
        sb.append(this.f45119);
        return sb.toString();
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        Iterator it = this.f45119.iterator();
        while (it.hasNext()) {
            ((AbstractC3073) it.next()).mo2863(c1662);
        }
    }

    @Override // l.AbstractC3073
    /* renamed from: ۢ */
    public final String mo2864() {
        StringBuilder m32307 = C13325.m32307(100, "{");
        Iterator it = this.f45119.iterator();
        boolean z = true;
        while (it.hasNext()) {
            AbstractC3073 abstractC3073 = (AbstractC3073) it.next();
            if (z) {
                z = false;
            } else {
                m32307.append(", ");
            }
            m32307.append(abstractC3073.mo2864());
        }
        m32307.append(l.d);
        return m32307.toString();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final List m35147() {
        return this.f45119;
    }

    @Override // l.AbstractC3073
    /* renamed from: ۧ */
    public final void mo2865(C1662 c1662, C18241 c18241) {
        ArrayList arrayList = this.f45119;
        int size = arrayList.size();
        if (c18241.m42506()) {
            c18241.m42501(0, m9391() + " " + mo2862().mo2463());
            c18241.m42501(4, "  size: ".concat(C14712.m35008(size)));
        }
        c18241.m42514(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3073) it.next()).mo3384(c1662, c18241);
        }
    }

    @Override // l.AbstractC3073
    /* renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        int m9392 = m9392() + i;
        Iterator it = this.f45119.iterator();
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        while (it.hasNext()) {
            AbstractC3073 abstractC3073 = (AbstractC3073) it.next();
            int mo3385 = abstractC3073.mo3385();
            if (z) {
                i3 = abstractC3073.m9392();
                i2 = mo3385;
                z = false;
            } else {
                if (mo3385 != i2) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC3073.m9392() != i3) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            m9392 = abstractC3073.m9388(c4484, m9392) + mo3385;
        }
    }
}
