package l;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: T7LF */
/* renamed from: l.᩶ܰ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20201 extends AbstractC0204 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3267 f65363;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C0052 f65364;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet f65362 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f65360 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f65361 = new HashMap();

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1399(C12759 c12759) {
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1422(C20667 c20667) {
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1375(C3587 c3587) {
        C6136 c6136;
        C20661 c20661;
        C6136 c61362;
        C6136 c61363;
        C0052 c0052 = c3587.f11377;
        C12171.m29637(c0052);
        this.f65364 = c0052;
        if (c3587.mo10982() == EnumC6857.OPEN) {
            this.f65364.f916.add(EnumC18398.OPEN);
        }
        C0052 c00522 = this.f65364;
        c00522.f17563 |= c3587.f11379.f7169 & 131072;
        c00522.f929 = C2609.m8239();
        this.f65364.f921 = C2609.m8239();
        this.f65364.f919 = C2609.m8239();
        C19846.forEach(c3587.f11376, new C22257(1, this));
        C0052 c00523 = this.f65364;
        c00523.f929 = c00523.f929.m8250();
        C0052 c00524 = this.f65364;
        c00524.f921 = c00524.f921.m8250();
        C0052 c00525 = this.f65364;
        c00525.f919 = c00525.f919.m8250();
        AbstractC10370 abstractC10370 = this.f65364.f17562;
        C3267 c3267 = this.f65363;
        c6136 = c3267.f10257;
        if (abstractC10370 == c6136.f18810) {
            return;
        }
        Iterator it = this.f65364.f929.iterator();
        while (it.hasNext()) {
            AbstractC10370 abstractC103702 = ((C9764) it.next()).f29541.f17562;
            c61363 = c3267.f10257;
            if (abstractC103702 == c61363.f18810) {
                return;
            }
        }
        c20661 = c3267.f10261;
        c61362 = c3267.f10257;
        C9764 c9764 = new C9764(c20661.m47258(c61362.f18810), EnumSet.of(EnumC9058.MANDATED));
        C0052 c00526 = this.f65364;
        c00526.f929 = c00526.f929.m8246(c9764);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1398(C12054 c12054) {
        C6235 c6235;
        C20661 c20661;
        EnumC16280 enumC16280;
        C22364 c22364;
        C20661 c206612;
        EnumC16280 enumC162802;
        C22364 c223642;
        C6136 c6136;
        C22364 c223643;
        C22364 c223644;
        Set set;
        AbstractC12612 abstractC12612 = c12054.f36052;
        AbstractC10370 m19452 = C7260.m19452(abstractC12612);
        C3267 c3267 = this.f65363;
        c6235 = c3267.f10281;
        C0052 m17169 = c6235.m17169(m19452);
        C7260.m19459(m17169, abstractC12612);
        if (m17169.f17559 != EnumC1296.f4568) {
            c223644 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12281 = C6241.f19132;
            c223644.m7273(abstractC12612, new C12281("compiler", "module.not.found", m17169));
            set = c3267.f10263;
            ((HashSet) set).add(m17169);
            return;
        }
        HashSet hashSet = this.f65362;
        if (hashSet.contains(m17169)) {
            c223643 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c122812 = C6241.f19132;
            c223643.m7273(abstractC12612, new C12281("compiler", "duplicate.requires", m17169));
            return;
        }
        hashSet.add(m17169);
        EnumSet noneOf = EnumSet.noneOf(EnumC9058.class);
        if (c12054.f36053) {
            c206612 = c3267.f10261;
            if (m17169 == c206612.f66509) {
                enumC162802 = c3267.f10267;
                if (enumC162802.compareTo(EnumC16280.JDK10) >= 0) {
                    c223642 = c3267.f10283;
                    c6136 = c3267.f10257;
                    AbstractC10370 abstractC10370 = c6136.f18811;
                    C12281 c122813 = C6241.f19132;
                    c223642.m7273(c12054, new C12281("compiler", "modifier.not.allowed.here", abstractC10370));
                }
            }
            noneOf.add(EnumC9058.TRANSITIVE);
        }
        if (c12054.f36054) {
            c20661 = c3267.f10261;
            if (m17169 == c20661.f66509) {
                enumC16280 = c3267.f10267;
                if (enumC16280.compareTo(EnumC16280.JDK10) >= 0) {
                    c22364 = c3267.f10283;
                    EnumSet of = EnumSet.of(EnumC18936.f59679);
                    C12281 c122814 = C6241.f19132;
                    c22364.m7273(c12054, new C12281("compiler", "mod.not.allowed.here", of));
                }
            }
            noneOf.add(EnumC9058.STATIC_PHASE);
        }
        C9764 c9764 = new C9764(m17169, noneOf);
        c12054.f36051 = c9764;
        C0052 c0052 = this.f65364;
        c0052.f929 = c0052.f929.m8246(c9764);
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1400(C13317 c13317) {
        C20661 c20661;
        C9310 c9310;
        C2609 c2609;
        C6235 c6235;
        C15240 c15240;
        C22364 c22364;
        Iterator it;
        Iterator it2;
        C22364 c223642;
        C22364 c223643;
        AbstractC12612 abstractC12612 = c13317.f39865;
        C2609 c26092 = c13317.f39866;
        AbstractC10370 m19452 = C7260.m19452(abstractC12612);
        C3267 c3267 = this.f65363;
        c20661 = c3267.f10261;
        C7814 m47266 = c20661.m47266(this.f65364, m19452);
        c9310 = c3267.f10282;
        c9310.getClass();
        new C5117(m47266).mo10758(abstractC12612);
        C22317 c22317 = new C22317();
        HashMap hashMap = this.f65360;
        C2609 c26093 = (C2609) C13843.computeIfAbsent(hashMap, m47266, c22317);
        Iterator it3 = c26093.iterator();
        while (it3.hasNext()) {
            c223643 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12281 = C6241.f19132;
            c223643.m7273(abstractC12612, new C12281("compiler", "conflicting.exports", m47266));
        }
        if (c26092 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it4 = c26092.iterator();
            while (it4.hasNext()) {
                AbstractC12612 abstractC126122 = (AbstractC12612) it4.next();
                AbstractC10370 m194522 = C7260.m19452(abstractC126122);
                c6235 = c3267.f10281;
                C0052 m17169 = c6235.m17169(m194522);
                C7260.m19459(m17169, abstractC126122);
                c15240 = c3267.f10266;
                abstractC126122.getClass();
                c15240.m36153(abstractC126122, m17169);
                Iterator it5 = c26093.iterator();
                while (it5.hasNext()) {
                    C2609 c26094 = ((C17524) it5.next()).f53522;
                    if (c26094 != null) {
                        Iterator it6 = c26094.iterator();
                        while (it6.hasNext()) {
                            if (m17169 == ((C0052) it6.next())) {
                                c223642 = c3267.f10283;
                                C12281 c122812 = C6241.f19132;
                                it = it4;
                                it2 = it5;
                                c223642.m7273(abstractC126122, new C12281("compiler", "conflicting.exports.to.module", m17169));
                            } else {
                                it = it4;
                                it2 = it5;
                            }
                            it5 = it2;
                            it4 = it;
                        }
                    }
                    it5 = it5;
                    it4 = it4;
                }
                Iterator it7 = it4;
                if (!linkedHashSet.add(m17169)) {
                    c22364 = c3267.f10283;
                    C12281 c122813 = C6241.f19132;
                    c22364.m7273(abstractC126122, new C12281("compiler", "conflicting.exports.to.module", m17169));
                }
                it4 = it7;
            }
            c2609 = C2609.m8235((Iterable) linkedHashSet);
        } else {
            c2609 = null;
        }
        if (c2609 == null || !c2609.isEmpty()) {
            C17524 c17524 = new C17524(m47266, c2609, EnumSet.noneOf(EnumC14701.class));
            C0052 c0052 = this.f65364;
            c0052.f921 = c0052.f921.m8246(c17524);
            c13317.f39864 = c17524;
            hashMap.put(m47266, c26093.m8246(c17524));
        }
    }

    @Override // l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1365(C0058 c0058) {
        C20661 c20661;
        C9310 c9310;
        C2609 c2609;
        C6235 c6235;
        C15240 c15240;
        C22364 c22364;
        Iterator it;
        Iterator it2;
        C22364 c223642;
        C22364 c223643;
        C22364 c223644;
        AbstractC12612 abstractC12612 = c0058.f946;
        C2609 c26092 = c0058.f947;
        AbstractC10370 m19452 = C7260.m19452(abstractC12612);
        C3267 c3267 = this.f65363;
        c20661 = c3267.f10261;
        C7814 m47266 = c20661.m47266(this.f65364, m19452);
        c9310 = c3267.f10282;
        c9310.getClass();
        new C5117(m47266).mo10758(abstractC12612);
        if (this.f65364.f916.contains(EnumC18398.OPEN)) {
            c223644 = c3267.f10283;
            c223644.m7273(c0058, C6241.f19189);
        }
        C18554 c18554 = new C18554(8);
        HashMap hashMap = this.f65361;
        C2609 c26093 = (C2609) C13843.computeIfAbsent(hashMap, m47266, c18554);
        Iterator it3 = c26093.iterator();
        while (it3.hasNext()) {
            c223643 = c3267.f10283;
            abstractC12612.getClass();
            C12281 c12281 = C6241.f19132;
            c223643.m7273(abstractC12612, new C12281("compiler", "conflicting.opens", m47266));
        }
        if (c26092 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it4 = c26092.iterator();
            while (it4.hasNext()) {
                AbstractC12612 abstractC126122 = (AbstractC12612) it4.next();
                AbstractC10370 m194522 = C7260.m19452(abstractC126122);
                c6235 = c3267.f10281;
                C0052 m17169 = c6235.m17169(m194522);
                C7260.m19459(m17169, abstractC126122);
                c15240 = c3267.f10266;
                abstractC126122.getClass();
                c15240.m36153(abstractC126122, m17169);
                Iterator it5 = c26093.iterator();
                while (it5.hasNext()) {
                    C2609 c26094 = ((C23874) it5.next()).f77198;
                    if (c26094 != null) {
                        Iterator it6 = c26094.iterator();
                        while (it6.hasNext()) {
                            if (m17169 == ((C0052) it6.next())) {
                                c223642 = c3267.f10283;
                                C12281 c122812 = C6241.f19132;
                                it = it4;
                                it2 = it5;
                                c223642.m7273(abstractC126122, new C12281("compiler", "conflicting.opens.to.module", m17169));
                            } else {
                                it = it4;
                                it2 = it5;
                            }
                            it5 = it2;
                            it4 = it;
                        }
                    }
                    it5 = it5;
                    it4 = it4;
                }
                Iterator it7 = it4;
                if (!linkedHashSet.add(m17169)) {
                    c22364 = c3267.f10283;
                    C12281 c122813 = C6241.f19132;
                    c22364.m7273(abstractC126122, new C12281("compiler", "conflicting.opens.to.module", m17169));
                }
                it4 = it7;
            }
            c2609 = C2609.m8235((Iterable) linkedHashSet);
        } else {
            c2609 = null;
        }
        if (c2609 == null || !c2609.isEmpty()) {
            C23874 c23874 = new C23874(m47266, c2609, EnumSet.noneOf(EnumC6941.class));
            C0052 c0052 = this.f65364;
            c0052.f919 = c0052.f919.m8246(c23874);
            c0058.f945 = c23874;
            hashMap.put(m47266, c26093.m8246(c23874));
        }
    }

    public C20201(C3267 c3267) {
        this.f65363 = c3267;
    }
}
