package l;

import java.util.Iterator;

/* compiled from: B7KX */
/* renamed from: l.۟ᩳ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7631 extends C15391 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f23578;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f23579;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f23580;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7631(C11139 c11139, C14163 c14163, C2609 c2609) {
        super(c11139, c14163);
        this.f23580 = c11139;
        this.f23578 = c2609;
        this.f23579 = C5378.stream(c14163.m33811()).anyMatch(new C17553(1));
    }

    @Override // l.C15391, l.InterfaceC21743
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 mo20424() {
        C11139 c11139;
        if (this.f47127 == null) {
            C18837 c18837 = new C18837();
            C2609 c2609 = this.f23578;
            C9378 c9378 = (C9378) c2609.last();
            Iterator it = c2609.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                c11139 = this.f23580;
                if (!hasNext) {
                    break;
                }
                C9378 c93782 = (C9378) it.next();
                c18837.m43511((c93782 == c9378 && this.f23579) ? c11139.f33442.m17515(c93782.f28489.f17560) : c93782.f28489.f17560);
            }
            this.f47127 = new C10658(c18837.m43517(), c11139.f33440.f66501, C2609.m8239(), c11139.f33440.f66481);
        }
        return this.f47127;
    }

    @Override // l.C15391, l.InterfaceC21743
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3581 mo20426() {
        C3581 mo20426 = super.mo20426();
        mo20426.f17563 |= 2251868533161984L;
        C18837 c18837 = new C18837();
        C2609 c2609 = this.f23578;
        C9378 c9378 = (C9378) c2609.last();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C9378 c93782 = (C9378) it.next();
            c18837.m43511(new C12048(((c93782 == c9378 && this.f23579) ? 17179869184L : 0L) | 2305843017820405760L, c93782.f28484, c93782.f28489.f17560, mo20426));
        }
        mo20426.f11367 = c18837.m43517();
        mo20426.f17563 |= 2305843009213693952L;
        return mo20426;
    }

    @Override // l.C15391, l.InterfaceC21743
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8526 mo20425(C8526 c8526) {
        C2609 m46040;
        Iterator it = c8526.f26048.iterator();
        C2609 c2609 = this.f23578;
        while (it.hasNext()) {
            C9378 c9378 = (C9378) it.next();
            C21221 m33803 = ((C14163) this.f47128).m33803(c9378.f28489);
            C17013 c17013 = this.f23580.f33425;
            c17013.f52172 = c9378.f16085;
            C19961 c19961 = new C19961(c17013);
            C2176 c2176 = c9378.f28486;
            if (!m33803.m48176().isEmpty()) {
                m46040 = c19961.m46040((Object) null, m33803.m48176());
            } else {
                m46040 = C2609.m8239();
            }
            c2176.f7168 = m46040;
            c9378.f28488 = (AbstractC12612) c19961.mo8690(((C9378) c2609.f8240).f28488, (Object) null);
            c2609 = c2609.f8241;
        }
        return c8526;
    }
}
