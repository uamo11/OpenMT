package l;

/* compiled from: Q7TC */
/* renamed from: l.۬ۤܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13052 extends AbstractC1428 {
    @Override // l.AbstractC1428
    /* renamed from: ֫ */
    public final long mo4932(Object obj) {
        return ((C4007) obj).m12072();
    }

    @Override // l.AbstractC1428
    /* renamed from: ֫ */
    public final void mo4935(long j, Object obj) {
        ((C4007) obj).m12073(j);
    }

    @Override // l.AbstractC1428
    /* renamed from: ۧ */
    public final String mo4936(Object obj) {
        C4007 c4007 = (C4007) obj;
        String m12082 = c4007.m12082();
        return (m12082.endsWith("/") || !c4007.m12076()) ? m12082 : m12082.concat("/");
    }

    @Override // l.AbstractC1428
    /* renamed from: ۧ */
    public final void mo4938(long j, Object obj) {
        ((C4007) obj).m12078(j);
    }

    @Override // l.AbstractC1428
    /* renamed from: ܽ */
    public final long mo4939(Object obj) {
        return ((C4007) obj).m12074();
    }

    @Override // l.AbstractC1428
    /* renamed from: ܽ */
    public final void mo4941(long j, Object obj) {
        ((C4007) obj).m12081(j);
    }

    @Override // l.AbstractC1428
    /* renamed from: ᩳ */
    public final long mo4942(Object obj) {
        return ((C4007) obj).m12084();
    }

    @Override // l.AbstractC1428
    /* renamed from: ܽ */
    public final Object mo4940(String str) {
        if (!C3016.m9240(str, "/", false)) {
            throw new RuntimeException();
        }
        C3545 c3545 = new C3545(str);
        String m10810 = c3545.m10810();
        int i = C12645.f38088;
        String parent = c3545.getParent();
        String concat = parent != null ? "/".concat(parent) : "/";
        C11233.m27799((Object) m10810);
        C11233.m27799((Object) concat);
        return new C4007(-1, str, m10810, concat, true, false, -1L, -1L, 0L, 0, null);
    }
}
