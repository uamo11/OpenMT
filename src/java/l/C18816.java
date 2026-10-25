package l;

import java.nio.file.DirectoryStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: K7QT */
/* renamed from: l.ᩴܳ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18816 extends AbstractC13959 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20758 f59370;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C3999 f59371;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f59372;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f59373;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18816(C22343 c22343, InterfaceC2050 interfaceC2050, EnumC0121... enumC0121Arr) {
        super(interfaceC2050, enumC0121Arr);
        this.f59373 = c22343;
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        this.f41660 = true;
        this.f59370 = str == null ? null : this.f59373.m50086(str, new String[0]);
        return true;
    }

    @Override // l.AbstractC11055
    /* renamed from: ܽ */
    public final Collection mo6225() {
        InterfaceC20758 interfaceC20758 = this.f59370;
        if (interfaceC20758 == null) {
            return null;
        }
        return Collections.singleton(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        if (iterable == null) {
            this.f59370 = null;
        } else {
            this.f41660 = true;
            this.f59370 = AbstractC13959.m33405(iterable);
        }
        this.f59371 = null;
        this.f59372 = false;
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final InterfaceC2050 mo23048(String str) {
        if (this.f59371 == null) {
            this.f59371 = new C3999(this.f59373);
        }
        C16698 m12046 = this.f59371.m12046(str);
        if (m12046 != null) {
            return m12046;
        }
        C16698 c16698 = new C16698(this.f59373, this, this.f41661.getName() + "[" + str + "]", str, Collections.singletonList(this.f59370.resolve(str)), true);
        this.f59371.m12048(c16698);
        return c16698;
    }

    @Override // l.AbstractC13959, l.AbstractC11055
    /* renamed from: ֫ */
    public final void mo23049(Iterable iterable, String str) {
        InterfaceC20758 m33405 = AbstractC13959.m33405(iterable);
        if (this.f59371 == null) {
            this.f59371 = new C3999(this.f59373);
        }
        C16698 m12046 = this.f59371.m12046(str);
        if (m12046 == null) {
            this.f59371.m12048(new C16698(this.f59373, this, this.f41661.getName() + "[" + str + "]", str, Collections.singletonList(m33405), true));
        } else {
            m12046.f51263 = Collections.singletonList(m33405);
            this.f59371.m12052(m12046);
        }
        this.f41660 = true;
    }

    @Override // l.AbstractC11055
    /* renamed from: ۧ */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) {
        C3999 c3999 = this.f59371;
        if (c3999 == null) {
            return null;
        }
        return c3999.m12051(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* renamed from: ܳ */
    public final Iterable mo23052() {
        InterfaceC20758 interfaceC20758;
        if (!this.f59372 && (interfaceC20758 = this.f59370) != null) {
            DirectoryStream newDirectoryStream = C17229.newDirectoryStream(interfaceC20758);
            try {
                Iterator it = newDirectoryStream.iterator();
                while (it.hasNext()) {
                    mo23048(((InterfaceC20758) it.next()).getFileName().toString());
                }
                newDirectoryStream.close();
                this.f59372 = true;
            } catch (Throwable th) {
                if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        C3999 c3999 = this.f59371;
        if (c3999 == null || c3999.m12053()) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(this.f59371.m12054());
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        C3999 c3999 = this.f59371;
        if (c3999 != null) {
            return c3999.m12049(interfaceC20758);
        }
        return this.f59370 != null && C22343.m50077(interfaceC20758).startsWith(C22343.m50077(this.f59370));
    }
}
