package l;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: A7MK */
/* renamed from: l.᩺ܽ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23111 extends AbstractC13938 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f74348 = new LinkedHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC13938 f74349;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1987 f74350;

    @Override // l.AbstractC13938
    /* renamed from: ֫ */
    public boolean mo26256(C16986 c16986, C9378 c9378) {
        return false;
    }

    public C23111(C1987 c1987) {
        this.f74350 = c1987;
        this.f74349 = c1987.f6656;
    }

    @Override // l.AbstractC13938
    /* renamed from: ֫ */
    public C12048 mo20342(C16986 c16986) {
        C3581 c3581;
        C12048 mo20342 = this.f74349.mo20342(c16986);
        if (mo20342 != null) {
            return mo20342;
        }
        long j = c16986.f17563;
        AbstractC10370 abstractC10370 = c16986.f17562;
        AbstractC4308 abstractC4308 = c16986.f17560;
        c3581 = this.f74350.f6657;
        C12048 c12048 = new C12048(j, abstractC10370, abstractC4308, c3581);
        c12048.m16074(c16986.mo16081());
        this.f74348.put(c16986, c12048);
        return c12048;
    }

    @Override // l.AbstractC13938
    /* renamed from: ۧ */
    public final C12048 mo30736(final C16986 c16986) {
        C12048 mo30736 = this.f74349.mo30736(c16986);
        return mo30736 != null ? mo30736 : (C12048) C5378.stream(this.f74348.entrySet()).filter(new Predicate() { // from class: l.ۨܽ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                C16986 c169862 = (C16986) ((Map.Entry) obj).getKey();
                c169862.getClass();
                C2609 of = C2609.of((Object) c169862);
                C16986 c169863 = C16986.this;
                c169863.getClass();
                return of.containsAll(C2609.of((Object) c169863));
            }
        }).findFirst().map(new C16571(2)).orElse(null);
    }

    @Override // l.AbstractC13938
    /* renamed from: ֫ */
    public final C2609 mo30732(int i) {
        C17013 c17013;
        LinkedHashMap linkedHashMap = this.f74348;
        if (linkedHashMap.isEmpty()) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C12048 c12048 = (C12048) entry.getValue();
            c17013 = this.f74350.f6650;
            c17013.f52172 = i;
            C9378 m39923 = c17013.m39923(c12048, (AbstractC12612) null);
            if ((((C16986) entry.getKey()).f17563 & 1152921504606846976L) != 0) {
                if (!this.f74349.mo26256((C16986) entry.getKey(), m39923)) {
                }
            }
            c18837.m43511(m39923);
        }
        return c18837.m43517();
    }

    @Override // l.AbstractC13938
    /* renamed from: ֫ */
    public final AbstractC11349 mo30733(AbstractC11349 abstractC11349) {
        C17013 c17013;
        C2609 mo30732 = mo30732(abstractC11349.f16085);
        if (!mo30732.m8249()) {
            return abstractC11349;
        }
        c17013 = this.f74350.f6650;
        c17013.f52172 = abstractC11349.f16085;
        return c17013.m39902(0L, mo30732.m8242(abstractC11349));
    }

    @Override // l.AbstractC13938
    /* renamed from: ֫ */
    public final AbstractC12612 mo30734(AbstractC12612 abstractC12612) {
        C17013 c17013;
        C17013 c170132;
        for (C12048 c12048 : this.f74348.values()) {
            C1987 c1987 = this.f74350;
            c17013 = c1987.f6650;
            int i = abstractC12612.f16085;
            c17013.f52172 = i;
            c170132 = c1987.f6650;
            c170132.f52172 = i;
            C3733 m39905 = c17013.m39905(c170132.m39923(c12048, (AbstractC12612) null), abstractC12612);
            m39905.f16086 = abstractC12612.f16086;
            abstractC12612 = m39905;
        }
        return abstractC12612;
    }

    @Override // l.AbstractC13938
    /* renamed from: ֫ */
    public final AbstractC13938 mo30735() {
        C1987 c1987 = this.f74350;
        AbstractC13938 abstractC13938 = this.f74349;
        c1987.f6656 = abstractC13938;
        return abstractC13938;
    }
}
