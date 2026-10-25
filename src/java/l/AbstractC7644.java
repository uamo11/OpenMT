package l;

import java.util.Iterator;

/* compiled from: N5Q6 */
/* renamed from: l.۟ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC7644 extends AbstractC2021 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C23166 f23609;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23166 f23610;

    /* renamed from: ۧ */
    public abstract C23166 mo17159(C23166 c23166);

    /* renamed from: ܽ */
    public abstract C23166 mo17160(C23166 c23166);

    public AbstractC7644(C23166 c23166, C23166 c231662) {
        this.f23609 = c231662;
        this.f23610 = c23166;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23610 != null;
    }

    @Override // l.AbstractC2021
    /* renamed from: ֫ */
    public final void mo6575(C23166 c23166) {
        C23166 c231662 = null;
        if (this.f23609 == c23166 && c23166 == this.f23610) {
            this.f23610 = null;
            this.f23609 = null;
        }
        C23166 c231663 = this.f23609;
        if (c231663 == c23166) {
            this.f23609 = mo17159(c231663);
        }
        C23166 c231664 = this.f23610;
        if (c231664 == c23166) {
            C23166 c231665 = this.f23609;
            if (c231664 != c231665 && c231665 != null) {
                c231662 = mo17160(c231664);
            }
            this.f23610 = c231662;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23166 c23166 = this.f23610;
        C23166 c231662 = this.f23609;
        this.f23610 = (c23166 == c231662 || c231662 == null) ? null : mo17160(c23166);
        return c23166;
    }
}
