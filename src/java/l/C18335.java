package l;

import java.util.Iterator;

/* compiled from: T57T */
/* renamed from: l.ᩳ᩹֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18335 extends AbstractC9163 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4224 f56986;

    @Override // l.AbstractC9163
    /* renamed from: ֫ */
    public final void mo19027(AbstractC5144 abstractC5144, AbstractC5144 abstractC51442, boolean z) {
        C2609 mo12938;
        C2609 mo129382;
        C19110 c19110 = (C19110) abstractC5144;
        C19110 c191102 = (C19110) abstractC51442;
        if (z) {
            return;
        }
        if (c19110.f60195 != null) {
            if (c191102.f60195.f17183.m8249()) {
                mo12938 = ((AbstractC12612) c191102.f60195.f17183.get(0)).f16086.mo12938();
            } else {
                mo12938 = c191102.f60195.f17184.f16086.mo12938();
            }
            if (c19110.f60195.f17183.m8249()) {
                mo129382 = ((AbstractC12612) c19110.f60195.f17183.get(0)).f16086.mo12938();
            } else {
                mo129382 = c19110.f60195.f17184.f16086.mo12938();
            }
        } else {
            mo12938 = c191102.f16086.mo12938();
            mo129382 = c19110.f16086.mo12938();
        }
        Iterator it = mo12938.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            C4224 c4224 = this.f56986;
            if (hasNext) {
                if (!c4224.f13706.m17550((AbstractC4308) it.next(), (AbstractC4308) mo129382.f8240)) {
                    return;
                } else {
                    mo129382 = mo129382.f8241;
                }
            } else {
                c4224.f13703.m7285(c19110.f60196, C14001.f42346);
                return;
            }
        }
    }

    @Override // l.AbstractC9163
    /* renamed from: ֫ */
    public final boolean mo19028(AbstractC5144 abstractC5144) {
        boolean z;
        C19110 c19110 = (C19110) abstractC5144;
        if (!c19110.f60196.m14709(EnumC18550.f57521) || C7260.m19449(c19110)) {
            return false;
        }
        if (c19110.f60195 == null) {
            return true;
        }
        z = this.f56986.f13700;
        return z;
    }

    @Override // l.AbstractC9163
    /* renamed from: ۧ */
    public final C2609 mo19029(AbstractC5144 abstractC5144) {
        C19110 c19110 = (C19110) abstractC5144;
        if (c19110.f60196.m14709(EnumC18550.f57521)) {
            C19110 c191102 = (C19110) this.f56986.f13705.mo8690((AbstractC5144) c19110, (Object) null);
            ((C16432) c191102.f60196).f50541 = C2609.m8239();
            return C2609.of((Object) c191102);
        }
        return C2609.of((Object) c19110);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18335(C4224 c4224) {
        super(c4224, EnumC11280.DIAMOND, EnumC18550.f57548);
        this.f56986 = c4224;
    }
}
