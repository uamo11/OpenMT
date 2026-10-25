package l;

/* compiled from: R8V9 */
/* renamed from: l.ܽۚۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16430 extends AbstractC9936 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f50521;

    @Override // l.AbstractC11347
    /* renamed from: ۧ */
    public final void mo7190(Appendable appendable, int i, C0056 c0056) {
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* renamed from: ܳ */
    public final AbstractC11347 mo10980() {
        return this;
    }

    @Override // l.AbstractC11347
    /* renamed from: ܺ */
    public final String mo2915() {
        return "#declaration";
    }

    @Override // l.AbstractC9936, l.AbstractC11347
    /* renamed from: ᩳ */
    public final /* bridge */ /* synthetic */ int mo10981() {
        return 0;
    }

    public C16430(String str, boolean z) {
        C16990.m39822((Object) str);
        this.f30009 = str;
        this.f50521 = z;
    }

    @Override // l.AbstractC11347
    /* renamed from: ֫ */
    public final void mo7189(Appendable appendable, int i, C0056 c0056) {
        int i2;
        int i3;
        Appendable append = appendable.append("<");
        boolean z = this.f50521;
        append.append(z ? "!" : "?").append(m25053());
        C15578 mo25045 = mo25045();
        mo25045.getClass();
        int i4 = 0;
        while (true) {
            i2 = mo25045.f47997;
            if (i4 >= i2 || !C15578.m36719(mo25045, mo25045.f47996[i4])) {
                i3 = mo25045.f47997;
                if (i4 >= i3) {
                    break;
                }
                C9230 c9230 = new C9230(mo25045.f47996[i4], (String) mo25045.f47995[i4], mo25045);
                int i5 = i4 + 1;
                String key = c9230.getKey();
                String value = c9230.getValue();
                if (!key.equals("#declaration")) {
                    appendable.append(' ');
                    appendable.append(key);
                    if (!value.isEmpty()) {
                        appendable.append("=\"");
                        C12757.m31059(appendable, value, c0056, true, false, false, false);
                        appendable.append('\"');
                    }
                }
                i4 = i5;
            } else {
                i4++;
            }
        }
        appendable.append(z ? "!" : "?").append(">");
    }

    @Override // l.AbstractC11347
    public final String toString() {
        return mo2910();
    }

    @Override // l.AbstractC11347
    /* renamed from: clone */
    public final Object mo2918clone() {
        return (C16430) super.mo2918clone();
    }

    @Override // l.AbstractC11347
    /* renamed from: clone */
    public final AbstractC11347 mo2918clone() {
        return (C16430) super.mo2918clone();
    }
}
