package l;

import java.util.List;

/* compiled from: T7N0 */
/* renamed from: l.ۤۨ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10264 implements InterfaceC8840 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f30908;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f30909;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public InterfaceC7773 f30910;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C9185 f30911;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18321 f30912;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21553 f30913;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10045 f30914;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C3749 f30915;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2503 f30916;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f30917;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30918;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC11058 f30919;

    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final InterfaceC8840 mo22837() {
        return this;
    }

    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ InterfaceC8840 mo22839(InterfaceC11058 interfaceC11058) {
        m25998(interfaceC11058);
        return this;
    }

    public C10264(InterfaceC15097 interfaceC15097) {
        this(new C15907(interfaceC15097));
    }

    public C10264(InterfaceC21553 interfaceC21553) {
        this.f30913 = interfaceC21553;
        this.f30915 = new C3749();
        this.f30911 = new C9185();
        this.f30910 = C19063.f60033;
        this.f30919 = new C23135();
        this.f30912 = new C18321();
        this.f30909 = 1;
        this.f30917 = -9223372036854775807L;
        this.f30908 = true;
        this.f30918 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25998(InterfaceC11058 interfaceC11058) {
        C22632.m50629(interfaceC11058, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f30919 = interfaceC11058;
    }

    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final InterfaceC8840 mo22838(C10045 c10045) {
        this.f30914 = c10045;
        return this;
    }

    @Override // l.InterfaceC8840
    @Deprecated
    /* renamed from: ֫ */
    public final InterfaceC8840 mo22840(boolean z) {
        this.f30918 = z;
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25997(InterfaceC7773 interfaceC7773) {
        this.f30910 = interfaceC7773;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.᩵᩺֫] */
    @Override // l.InterfaceC8840
    /* renamed from: ֫ */
    public final InterfaceC3901 mo22836(C11197 c11197) {
        c11197.f33612.getClass();
        if (this.f30916 == null) {
            this.f30916 = new C2503();
        }
        C10045 c10045 = this.f30914;
        if (c10045 != null) {
            this.f30916.m8001(c10045);
        }
        this.f30916.m8002(this.f30918);
        this.f30916.getClass();
        C2503 c2503 = this.f30916;
        List list = c11197.f33612.f35425;
        boolean isEmpty = list.isEmpty();
        C9185 c9185 = this.f30911;
        if (!isEmpty) {
            c9185 = new C19769(c9185, list);
        }
        InterfaceC4454 m11377 = this.f30915.m11377(c11197);
        InterfaceC11058 interfaceC11058 = this.f30919;
        return new C6030(c11197, this.f30913, c2503, this.f30912, m11377, interfaceC11058, this.f30910.mo20802(this.f30913, interfaceC11058, c9185), this.f30917, this.f30908, this.f30909);
    }
}
