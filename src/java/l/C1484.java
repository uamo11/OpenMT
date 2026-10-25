package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: 64JA */
/* renamed from: l.֫֨֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1484 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f5316;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f5317;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5318;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5319;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashSet f5320;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC5842 f5321;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22775 f5322;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f5323;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f5324;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f5325;

    public C1484(C13602 c13602) {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        HashSet hashSet;
        EnumC5842 enumC5842;
        int i;
        int i2;
        arrayList = c13602.f40574;
        linkedHashSet = c13602.f40580;
        this.f5316 = C19662.m45199(arrayList, linkedHashSet);
        InterfaceC22775 m32701 = C13602.m32701(c13602);
        this.f5322 = m32701;
        arrayList2 = c13602.f40576;
        this.f5318 = arrayList2;
        arrayList3 = c13602.f40581;
        this.f5323 = arrayList3;
        arrayList4 = c13602.f40578;
        this.f5319 = arrayList4;
        arrayList5 = c13602.f40575;
        this.f5325 = arrayList5;
        hashSet = c13602.f40584;
        this.f5320 = hashSet;
        enumC5842 = c13602.f40582;
        this.f5321 = enumC5842;
        i = c13602.f40577;
        this.f5324 = i;
        i2 = c13602.f40583;
        this.f5317 = i2;
        m32701.mo32166(new C4844(arrayList3, arrayList4, arrayList5, hashSet, i2, new C9078(0)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC0197 m5145(String str) {
        C11003.requireNonNull(str, "input must not be null");
        AbstractC0197 m45210 = new C19662(this.f5316, this.f5322, this.f5323, this.f5319, this.f5325, this.f5320, this.f5321, this.f5324, this.f5317).m45210(str);
        Iterator it = this.f5318.iterator();
        while (it.hasNext()) {
            m45210 = ((InterfaceC10657) it.next()).mo26747(m45210);
        }
        return m45210;
    }
}
