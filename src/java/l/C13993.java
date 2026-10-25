package l;

import java.util.Iterator;

/* compiled from: N5Q6 */
/* renamed from: l.ܰᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13993 extends AbstractC2021 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11194 f41717;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f41718 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23166 f41719;

    public C13993(C11194 c11194) {
        this.f41717 = c11194;
    }

    @Override // l.AbstractC2021
    /* renamed from: ֫ */
    public final void mo6575(C23166 c23166) {
        C23166 c231662 = this.f41719;
        if (c23166 == c231662) {
            C23166 c231663 = c231662.f74452;
            this.f41719 = c231663;
            this.f41718 = c231663 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f41718) {
            return this.f41717.f33600 != null;
        }
        C23166 c23166 = this.f41719;
        return (c23166 == null || c23166.f74454 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f41718) {
            this.f41718 = false;
            this.f41719 = this.f41717.f33600;
        } else {
            C23166 c23166 = this.f41719;
            this.f41719 = c23166 != null ? c23166.f74454 : null;
        }
        return this.f41719;
    }
}
