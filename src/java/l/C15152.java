package l;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: P1XF */
/* renamed from: l.ܶۢᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15152 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1109 f46301;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f46302;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List f46303;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set f46304;

    public C15152(C0657 c0657, C1032 c1032, C1109 c1109) {
        this.f46301 = c1109;
        this.f46302 = c1109.mo3817();
        List<C16631> mo3811 = c1109.mo3811();
        this.f46303 = mo3811;
        HashSet hashSet = new HashSet();
        for (C16631 c16631 : mo3811) {
            hashSet.add(c16631.f51074);
            hashSet.add(c16631.f51072);
        }
        this.f46304 = C20195.unmodifiableSet(hashSet);
    }
}
