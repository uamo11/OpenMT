package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: J58K */
/* renamed from: l.۬᩶ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13334 extends AbstractC11924 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C1342 f39895;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f39896;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f39897;

    public C13334() {
        super(EnumC7690.LABEL);
        this.f39896 = -1;
    }

    @Override // l.AbstractC1591
    /* renamed from: ֫ */
    public final C13334 mo5437(C1403 c1403) {
        C13334 mo4896 = c1403.mo4896(this);
        if (this.f39897 != null && mo4896.f39897 == null) {
            mo4896.f39897 = new ArrayList(this.f39897.size());
            Iterator it = this.f39897.iterator();
            while (it.hasNext()) {
                mo4896.f39897.add((C21802) ((C21802) it.next()).mo5437(c1403));
            }
        }
        return mo4896;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m32315() {
        return String.format("L%08x", Integer.valueOf(hashCode()));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m32315());
        sb.append(":");
        ArrayList arrayList = this.f39897;
        if (arrayList != null && arrayList.size() > 0) {
            sb.append(" // ");
            sb.append(this.f39897);
        }
        if (this.f39896 >= 0) {
            sb.append(" // line ");
            sb.append(this.f39896);
        }
        return sb.toString();
    }
}
