package l;

import java.util.Map;

/* compiled from: I7LP */
/* renamed from: l.ܽ᩶֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC16860 extends C1110 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public AbstractC12612 f51738;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public Map f51739;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5572 f51740;

    /* renamed from: ֫ */
    public abstract AbstractC16860 mo8502(C1755 c1755, AbstractC12612 abstractC12612);

    /* renamed from: ۧ */
    public abstract AbstractC4308 mo18876(C23420 c23420);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC16860(l.C5572 r1, l.AbstractC12612 r2, l.C1755 r3, l.AbstractC12612 r4, java.util.Map r5) {
        /*
            r0 = this;
            r0.f51740 = r1
            l.۫۫֨ r1 = l.C5572.m15827(r1)
            l.C11003.requireNonNull(r1)
            r0.<init>(r1, r2, r3)
            r0.f51738 = r4
            r0.f51739 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC16860.<init>(l.ۚ᩶֨, l.۫᩵۠, l.֫ۤ֨, l.۫᩵۠, java.util.Map):void");
    }

    @Override // l.C1110
    /* renamed from: ֫ */
    public final AbstractC4308 mo3823(C23420 c23420, C6755 c6755) {
        AbstractC4308 mo18876;
        if (c6755.f20970 == EnumC13829.SPECULATIVE) {
            if (c23420.f75219 == AbstractC4308.f13884) {
                mo18876 = super.mo3823(c23420, c6755);
            } else {
                mo18876 = mo18876(c23420);
            }
            this.f51739.put(c23420, mo18876);
            return mo18876;
        }
        if (!((C8604) this.f4049.f6073).f26283.f23066) {
            C5572 c5572 = this.f51740;
            c5572.f17260.remove(new C0632(c5572, this.f4048));
        }
        return super.mo3823(c23420, c6755);
    }

    @Override // l.C1110
    /* renamed from: ֫ */
    public final AbstractC4308 mo3821(AbstractC5698 abstractC5698, EnumC16761 enumC16761) {
        if (this.f4050.contains(abstractC5698)) {
            return super.mo3821(abstractC5698, enumC16761);
        }
        for (Map.Entry entry : this.f51739.entrySet()) {
            C6755 mo3860 = ((C23420) entry.getKey()).f75215.mo3860();
            if (mo3860.f20969 == enumC16761 && mo3860.f20972 == abstractC5698) {
                return (AbstractC4308) entry.getValue();
            }
        }
        return AbstractC4308.f13885;
    }

    @Override // l.C1110
    /* renamed from: ֫ */
    public final AbstractC5144 mo3824(C6755 c6755) {
        if (this.f4050.contains(c6755.f20972)) {
            return super.mo3824(c6755);
        }
        return this.f51738;
    }
}
