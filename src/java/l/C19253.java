package l;

import java.util.EnumSet;

/* compiled from: X88W */
/* renamed from: l.᩵ۚۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19253 extends C17135 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f60611;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f60612;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC14312 f60613;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC14312 f60614;

    public C19253(EnumC14312 enumC14312, EnumC14312 enumC143122) {
        m40161(EnumC6552.BIND);
        m40160(EnumSet.of(EnumC20664.FIRST_FRAGMENT, EnumC20664.LAST_FRAGMENT));
        m40162((short) 72);
        this.f60611 = 16384;
        this.f60612 = 16384;
        this.f60614 = enumC14312;
        this.f60613 = enumC143122;
    }

    @Override // l.C17135
    /* renamed from: ֫ */
    public final void mo3260(C2319 c2319) {
        super.mo3260(c2319);
        c2319.m7582(this.f60611);
        c2319.m7582(this.f60612);
        c2319.m7581(0);
        c2319.m7577(1);
        c2319.m7577(0);
        c2319.m7582(0);
        c2319.m7582(0);
        c2319.m7577(1);
        c2319.m7577(0);
        EnumC14312 enumC14312 = this.f60614;
        c2319.m7580(enumC14312.m34180());
        c2319.m7582(enumC14312.m34177());
        c2319.m7582(enumC14312.m34178());
        EnumC14312 enumC143122 = this.f60613;
        c2319.m7580(enumC143122.m34180());
        c2319.m7582(enumC143122.m34177());
        c2319.m7582(enumC143122.m34178());
    }
}
