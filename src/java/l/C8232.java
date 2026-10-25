package l;

import java.util.Collection;

/* compiled from: K7QT */
/* renamed from: l.۠ܳ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C8232 extends AbstractC13959 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f25347;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Collection f25348;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8232(C22343 c22343, InterfaceC2050 interfaceC2050, EnumC0121... enumC0121Arr) {
        super(interfaceC2050, enumC0121Arr);
        this.f25347 = c22343;
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public boolean mo20401(EnumC0121 enumC0121, String str) {
        Collection unmodifiableCollection;
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        this.f41660 = true;
        if (str == null) {
            unmodifiableCollection = null;
        } else {
            C1176 mo6224 = mo6224();
            mo6224.m3980(str);
            unmodifiableCollection = C20195.unmodifiableCollection(mo6224);
        }
        this.f25348 = unmodifiableCollection;
        return true;
    }

    @Override // l.AbstractC11055
    /* renamed from: ܽ */
    public Collection mo6225() {
        return this.f25348;
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public void mo20400(Iterable iterable) {
        boolean z;
        C1176 c1176;
        if (iterable == null) {
            c1176 = mo6226();
        } else {
            this.f41660 = true;
            C1176 mo6224 = mo6224();
            z = mo6224.f4224.f72410;
            mo6224.m3979(iterable, z);
            c1176 = mo6224;
        }
        this.f25348 = C20195.unmodifiableCollection(c1176);
    }

    /* renamed from: ᩻ */
    public C1176 mo6226() {
        C1176 mo6224 = mo6224();
        mo6224.m3980((String) null);
        return mo6224;
    }

    /* renamed from: ۜ */
    public C1176 mo6224() {
        return new C1176(this.f25347);
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public boolean mo20402(InterfaceC20758 interfaceC20758) {
        return C22343.m50079(this.f25347, this.f25348, interfaceC20758);
    }
}
