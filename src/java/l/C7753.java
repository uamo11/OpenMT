package l;

/* compiled from: F5E7 */
/* renamed from: l.۟᩹ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7753 extends AbstractC5574 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f23980;

    public C7753(AbstractC8396[] abstractC8396Arr, String str) {
        super(EnumC1340.FILLED_ARRAY, abstractC8396Arr);
        this.f23980 = str;
    }

    @Override // l.AbstractC5574, l.AbstractC8396
    public final AbstractC8396 clone() {
        return new C7753(m15836(), this.f23980);
    }

    @Override // l.AbstractC8396
    /* renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C7753(m15837(c1403), this.f23980);
    }

    @Override // l.AbstractC8396
    /* renamed from: ܳ */
    public final String mo6719() {
        AbstractC8396[] abstractC8396Arr;
        StringBuilder m15339 = C5368.m15339("new ");
        m15339.append(C0459.m2045(this.f23980));
        m15339.append("[]{");
        int i = 0;
        while (true) {
            abstractC8396Arr = this.f17269;
            if (i >= abstractC8396Arr.length) {
                break;
            }
            m15339.append(abstractC8396Arr[i]);
            m15339.append(", ");
            i++;
        }
        if (abstractC8396Arr.length > 0) {
            m15339.setLength(m15339.length() - 2);
        }
        m15339.append('}');
        return m15339.toString();
    }
}
