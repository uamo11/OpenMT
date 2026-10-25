package l;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: 97QO */
/* renamed from: l.᩶֫ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19854 extends AbstractC22143 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f64127;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C1323 f64128;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21970[] f64129;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f64130;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f64131;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20191 f64132;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x050e, code lost:
    
        r2.m16264(new l.C21970(r4.m6131(), r5, r8.m6131()));
        r4 = new l.C1846();
        r5 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0317  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.String, l.᩶ۘ۠] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19854(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19854.<init>(java.lang.String):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m45663() {
        return this.f64127;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45658(int i, String str) {
        Object next;
        Iterator m31536 = C12970.m31536(str);
        do {
            next = m31536.next();
        } while (m31536.hasNext());
        Integer num = (Integer) next;
        if (num.intValue() > 0) {
            return str.length() - num.intValue();
        }
        return str.length() + i;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m45664() {
        return this.f64130;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21438 m45665(int i) {
        return this.f64129[i];
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m45667() {
        return this.f64131;
    }

    @Override // l.AbstractC22143
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20191 mo45661() {
        return this.f64132;
    }

    @Override // l.AbstractC22143, l.AbstractC20027
    public final String toString() {
        C8964 m37871 = C16018.m37871(this);
        m37871.m23110(this.f64131, "tokens");
        m37871.m23110((Object) super.toString(), "super");
        return m37871.toString();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m45666(int i) {
        C1323 c1323 = this.f64128;
        Object[] objArr = new Object[0];
        if (c1323 == null) {
            throw new C17619(C10375.m26179("Expected compilation unit to be set.", objArr));
        }
        return c1323.f4741.mo20264(i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m45662(int i) {
        C1323 c1323 = this.f64128;
        Object[] objArr = new Object[0];
        if (c1323 == null) {
            throw new C17619(C10375.m26179("Expected compilation unit to be set.", objArr));
        }
        return c1323.f4741.mo6871(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45660(C1323 c1323) {
        this.f64128 = c1323;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22267 m45659(Collection collection) {
        C13758 m33067;
        C22267 m49988 = C22267.m49988();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C13758 m33071 = ((C13758) it.next()).m33071(AbstractC19198.m44271());
            int intValue = ((Integer) m33071.m33077()).intValue();
            String str = this.f64127;
            if (intValue > str.length()) {
                throw new C18442(String.format("error: invalid offset (%d) or length (%d); offset + length (%d) > file length (%d)", m33071.m33075(), Integer.valueOf(((Integer) m33071.m33077()).intValue() - ((Integer) m33071.m33075()).intValue()), m33071.m33077(), Integer.valueOf(str.length())));
            }
            if (m33071.m33072()) {
                m33071 = C13758.m33067((Integer) m33071.m33075(), Integer.valueOf(((Integer) m33071.m33075()).intValue() + 1));
            }
            AbstractC22725 values = this.f64132.mo36250(m33071).mo11961().values();
            if (values.isEmpty()) {
                m33067 = AbstractC20027.f64849;
            } else {
                m33067 = C13758.m33067(Integer.valueOf(((C21970) values.iterator().next()).mo48557().getIndex()), Integer.valueOf(((C21970) C8882.m22955(values)).mo48557().getIndex() + 1));
            }
            m49988.mo3773(m33067);
        }
        return m49988;
    }
}
