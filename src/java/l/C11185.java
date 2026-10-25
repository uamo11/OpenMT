package l;

/* compiled from: OAYY */
/* renamed from: l.ۧᩴܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11185 extends AbstractC15252 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16828 f33574;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f33575;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11185(AbstractActivityC3346 abstractActivityC3346, C16828 c16828, Runnable runnable) {
        super(abstractActivityC3346);
        this.f33574 = c16828;
        this.f33575 = runnable;
    }

    @Override // l.AbstractC15252
    /* renamed from: ܽ */
    public final boolean mo4060() {
        boolean z = false;
        String obj = m36254(0).getText().toString();
        String obj2 = m36254(1).getText().toString();
        AbstractC3577 abstractC3577 = m36261() >= 3 ? (AbstractC3577) m36254(2).getTag() : null;
        if (obj2.length() > 1 && C3016.m9240(obj2, "/", false)) {
            obj2 = obj2.substring(0, obj2.length() - 1);
            C11233.m27803(obj2, "substring(...)");
        }
        int length = obj.length();
        C16828 c16828 = this.f33574;
        if (length > 0 && !obj.equals(c16828.m39592())) {
            c16828.m39591(obj);
            z = true;
        }
        if (obj2.length() > 0 && !obj2.equals(c16828.m39588())) {
            c16828.m39594(obj2);
            z = true;
        }
        if (abstractC3577 != null) {
            C17534 m39598 = c16828.m39598();
            C11233.m27799(m39598);
            c16828.m39583(m39598.m40973(abstractC3577));
            z = true;
        }
        if (z) {
            C9068.m23426();
            this.f33575.run();
        }
        return true;
    }
}
