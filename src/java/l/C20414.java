package l;

import bin.mt.plus.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: H5GB */
/* renamed from: l.᩶᩷ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20414 extends C16885 implements InterfaceC4477 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f65874;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f65875;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC18842 f65873 = new C5597();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC16724 f65872 = new C1363();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final List m46779(Object obj) {
        List list = ((C1032) obj).f3772;
        if (C8882.m22952(list, f65873)) {
            return new C15473(list);
        }
        return null;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m46780(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return 0;
        }
        return interfaceC19150.mo3818();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46781(Comparable comparable) {
        return ((C0657) comparable).f2535;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map.Entry m46782(CharSequence charSequence) {
        C23589 c23589 = (C23589) charSequence;
        if (c23589 == null) {
            return null;
        }
        C0657 c0657 = (C0657) this.f65874.get(c23589.f76475.f22724);
        if (c0657 == null) {
            return null;
        }
        return new C8419(c0657);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46783(int i, Comparable comparable) {
        ((C0657) comparable).f2536 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46784(int i, Object obj) {
        ((C1032) obj).f3777 = i;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Iterable m46786(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return null;
        }
        return interfaceC19150.mo3817();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C23589 m46787(Comparable comparable) {
        return ((C0657) comparable).f2537;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m46788(Object obj) {
        return ((C1032) obj).f3776;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C23589 m46789(Comparable comparable) {
        return ((C0657) comparable).f2533;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Iterable m46790(Object obj) {
        return C8882.m22949(((C1032) obj).f3772, new C21825());
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m46791(Object obj) {
        return ((C1032) obj).f3771;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Collection m46792(Comparable comparable) {
        C0657 c0657 = (C0657) comparable;
        c0657.getClass();
        return new C19709(c0657);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final List m46793(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return AbstractC14545.of();
        }
        return interfaceC19150.mo3811();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7008 m46794(Object obj) {
        C15848 c15848 = (C15848) obj;
        if (c15848.f48963.isEmpty()) {
            return null;
        }
        return c15848.f48963;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C7382 m46795(Comparable comparable) {
        return ((C0657) comparable).f2529;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m46796(Object obj) {
        return ((C15848) obj).f48962;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 m46797(Comparable comparable) {
        return ((C0657) comparable).f2528;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m46798(Comparable comparable) {
        return ((C0657) comparable).f2536;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46799(int i, Object obj) {
        ((C1032) obj).f3771 = i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Collection m46800(Comparable comparable) {
        C0657 c0657 = (C0657) comparable;
        c0657.getClass();
        return new C19003(c0657);
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C1109 m46801(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 instanceof C1109) {
            return (C1109) interfaceC19150;
        }
        return new C1109(interfaceC19150);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Set m46802(Object obj) {
        return ((C15848) obj).f48960;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12652 m46803(Comparable comparable) {
        return ((C0657) comparable).f2530;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7008 m46804(Comparable comparable) {
        C0657 c0657 = (C0657) comparable;
        if (c0657.f2534.isEmpty()) {
            return null;
        }
        return c0657.f2534;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC23698 m46806(Comparable comparable) {
        return ((C0657) comparable).f2525;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1717 m46807(Comparable comparable) {
        return ((C0657) comparable).f2531;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7008 m46809(Object obj) {
        C1032 c1032 = (C1032) obj;
        if (c1032.f3775.isEmpty()) {
            return null;
        }
        return c1032.f3775;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set m46810(Object obj) {
        return ((C1032) obj).f3770;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m46811(Object obj) {
        InterfaceC19150 interfaceC19150 = ((C1032) obj).f3774;
        if (interfaceC19150 == null) {
            return null;
        }
        return interfaceC19150.mo3812();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final SortedSet m46812(Comparable comparable) {
        return ((C0657) comparable).f2527;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m46813(Object obj) {
        return ((C1032) obj).f3777;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final SortedSet m46814(Comparable comparable) {
        return ((C0657) comparable).f2532;
    }

    public C20414(C19357 c19357) {
        super(c19357);
        this.f65874 = new ConcurrentMapC10942();
        this.f65875 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46785(C0657 c0657) {
        if (((C0657) this.f65874.put(c0657.getType(), c0657)) != null) {
            throw new C15431(null, C4925.m14306(R.string.MT_Protector_res_0x7f12030a, c0657.getType()), new Object[0]);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m46808() {
        if (this.f65875 == null) {
            AbstractC10232 m25861 = AbstractC10232.m25861();
            Collection values = this.f65874.values();
            m25861.getClass();
            this.f65875 = AbstractC14545.m34731(m25861, values);
        }
        return this.f65875;
    }

    @Override // l.InterfaceC4477
    /* renamed from: ֫ */
    public final Collection mo8571() {
        return new C22530(this.f65874.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f65874.size();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 m46805() {
        return this.f65874;
    }
}
