package l;

/* compiled from: 0JF */
/* renamed from: l.᩻ۜᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23538 extends C8722 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9428 f75589;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23538(C9428 c9428) {
        super(c9428.f28604);
        this.f75589 = c9428;
        this.f26554 = c9428.firstEntry();
    }

    @Override // l.C8722
    /* renamed from: ᩳ */
    public final void mo22543() {
        C14156 m33770 = this.f26553.m33770();
        this.f26553 = m33770;
        C9428 c9428 = this.f75589;
        if (c9428.f28610 || m33770 == null || Integer.compare(m33770.f17057, c9428.f28609) >= 0) {
            return;
        }
        this.f26553 = null;
    }

    @Override // l.C8722
    /* renamed from: ܽ */
    public final void mo22542() {
        C14156 m33775 = this.f26554.m33775();
        this.f26554 = m33775;
        C9428 c9428 = this.f75589;
        if (c9428.f28607 || m33775 == null || Integer.compare(m33775.f17057, c9428.f28608) < 0) {
            return;
        }
        this.f26554 = null;
    }
}
