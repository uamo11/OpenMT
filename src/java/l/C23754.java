package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* compiled from: K7QT */
/* renamed from: l.᩻ܳ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23754 extends C8232 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3999 f76899;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f76900;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23754(C22343 c22343, EnumC21101 enumC21101, EnumC0121... enumC0121Arr) {
        super(c22343, enumC21101, enumC0121Arr);
        this.f76900 = c22343;
    }

    @Override // l.C8232, l.AbstractC11055
    /* renamed from: ֫ */
    public final boolean mo20401(EnumC0121 enumC0121, String str) {
        if (!this.f41662.contains(enumC0121)) {
            return false;
        }
        mo20400(str == null ? null : C22343.m50075(this.f76900, str));
        return true;
    }

    @Override // l.AbstractC11055
    /* renamed from: ֫ */
    public final InterfaceC2050 mo23048(String str) {
        m52405();
        return this.f76899.m12046(str);
    }

    @Override // l.AbstractC11055
    /* renamed from: ۧ */
    public final InterfaceC2050 mo23051(InterfaceC20758 interfaceC20758) {
        m52405();
        return this.f76899.m12051(interfaceC20758);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [l.ᩳܳ۠] */
    @Override // l.AbstractC11055
    /* renamed from: ܳ */
    public final Iterable mo23052() {
        final List list;
        C3999 c3999 = this.f76899;
        Set m12050 = c3999 != null ? c3999.m12050() : Collections.EMPTY_SET;
        if (!m12050.isEmpty()) {
            list = Collections.singletonList(m12050);
        } else {
            list = Collections.EMPTY_LIST;
        }
        if (this.f25348 == null) {
            return list;
        }
        final ?? r1 = new Iterable() { // from class: l.ᩳܳ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new C14581(C23754.this);
            }
        };
        return new Iterable() { // from class: l.ܿܳ۠
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return C22159.m49777(Arrays.asList(list, r1), new C8011(9));
            }
        };
    }

    @Override // l.C8232, l.AbstractC11055
    /* renamed from: ֫ */
    public final boolean mo20402(InterfaceC20758 interfaceC20758) {
        if (this.f76899 == null) {
            m52405();
        }
        return this.f76899.m12049(interfaceC20758);
    }

    @Override // l.C8232, l.AbstractC11055
    /* renamed from: ֫ */
    public final void mo20400(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                InterfaceC20758 interfaceC20758 = (InterfaceC20758) it.next();
                if (C17229.exists(interfaceC20758, new EnumC14406[0]) && !C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
                    String interfaceC207582 = interfaceC20758.getFileName().toString();
                    int lastIndexOf = interfaceC207582.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        String substring = interfaceC207582.substring(lastIndexOf);
                        substring.getClass();
                        if (!substring.equals(".jar") && !substring.equals(".jmod")) {
                        }
                    }
                    throw new IllegalArgumentException(interfaceC20758.toString());
                }
            }
        }
        super.mo20400(iterable);
        this.f76899 = null;
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
        m52405();
        C16698 m12046 = this.f76899.m12046(str);
        if (m12046 == null) {
            m12046 = new C16698(this.f76900, this, this.f41661.getName() + "[" + str + "]", str, arrayList, true);
            this.f76899.m12048(m12046);
        } else {
            m12046.f51263 = arrayList;
            this.f76899.m12052(m12046);
        }
        m12046.f51265 = true;
        this.f41660 = true;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m52405() {
        LinkedHashMap linkedHashMap;
        String str;
        if (this.f76899 != null) {
            return;
        }
        this.f76899 = new C3999(this.f76900);
        Iterator it = mo23052().iterator();
        while (it.hasNext()) {
            for (InterfaceC2050 interfaceC2050 : (Set) it.next()) {
                if (interfaceC2050 instanceof C16698) {
                    C16698 c16698 = (C16698) interfaceC2050;
                    linkedHashMap = this.f76899.f12673;
                    str = c16698.f51266;
                    if (!linkedHashMap.containsKey(str)) {
                        this.f76899.m12048(c16698);
                    }
                }
            }
        }
    }
}
