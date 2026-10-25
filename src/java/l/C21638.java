package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: K7QT */
/* renamed from: l.᩸ܳ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21638 extends AbstractC13959 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC20758 f69464;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC20758 f69465;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C3999 f69466;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f69467;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21638(C22343 c22343) {
        super(EnumC21101.SYSTEM_MODULES, EnumC0121.f1203);
        this.f69467 = c22343;
        this.f69464 = C22343.f72402;
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        this.f41660 = true;
        if (str == null) {
            this.f69464 = C22343.f72402;
        } else if (str.equals("none")) {
            this.f69464 = null;
        } else {
            m48902(this.f69467.m50086(str, new String[0]));
        }
        this.f69465 = null;
        return true;
    }

    @Override // l.AbstractC11055
    /* renamed from: ܽ */
    public final Collection mo6225() {
        InterfaceC20758 interfaceC20758 = this.f69464;
        if (interfaceC20758 == null) {
            return null;
        }
        return Collections.singleton(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        if (iterable == null) {
            this.f69464 = null;
        } else {
            this.f41660 = true;
            m48902(AbstractC13959.m33405(iterable));
        }
    }

    @Override // l.AbstractC13959, l.AbstractC11055
    /* renamed from: ֫ */
    public final void mo23049(Iterable iterable, String str) {
        C11003.requireNonNull(iterable);
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
            AbstractC13959.m33406(interfaceC20758);
            arrayList.add(interfaceC20758);
        }
        m48903();
        C16698 m12046 = this.f69466.m12046(str);
        if (m12046 == null) {
            this.f69466.m12048(new C16698(this.f69467, this, this.f41661.getName() + "[" + str + "]", str, arrayList, true));
        } else {
            m12046.f51263 = arrayList;
            this.f69466.m12052(m12046);
        }
        this.f41660 = true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m48902(InterfaceC20758 interfaceC20758) {
        try {
            if (!C17229.isSameFile(interfaceC20758, C22343.f72402) && !C17229.exists(interfaceC20758.resolve("lib").resolve("jrt-fs.jar"), new EnumC14406[0]) && !C17229.exists(this.f69464.resolve("modules"), new EnumC14406[0])) {
                throw new IllegalArgumentException(interfaceC20758.toString());
            }
            this.f69464 = interfaceC20758;
            this.f69465 = null;
        } catch (IOException e) {
            throw new IllegalArgumentException(interfaceC20758.toString(), e);
        }
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final InterfaceC2050 mo23048(String str) {
        m48903();
        return this.f69466.m12046(str);
    }

    @Override // l.AbstractC11055
    /* renamed from: ۧ */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) {
        m48903();
        return this.f69466.m12051(interfaceC20758);
    }

    @Override // l.AbstractC11055
    /* renamed from: ܳ */
    public final Iterable mo23052() {
        m48903();
        return Collections.singleton(this.f69466.m12054());
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        m48903();
        return this.f69466.m12049(interfaceC20758);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: all -> 0x00fd, LOOP:0: B:37:0x00b7->B:39:0x00bd, LOOP_END, TRY_LEAVE, TryCatch #5 {all -> 0x00fd, blocks: (B:36:0x00b3, B:37:0x00b7, B:39:0x00bd), top: B:35:0x00b3 }] */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m48903() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21638.m48903():void");
    }
}
