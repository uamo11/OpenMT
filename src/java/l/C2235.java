package l;

import java.util.Comparator;

/* compiled from: 99PI */
/* renamed from: l.ۖۖۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2235 extends AbstractC0823 implements InterfaceC3415 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Comparator f7298 = new C8585();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C17964 f7299;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7300;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C9291 f7301;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f7302;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m7418() {
        return this.f7300;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۢ */
    public final InterfaceC23338 mo1132() {
        return this.f7299;
    }

    @Override // l.AbstractC0823
    public final String getName() {
        return this.f7299.getName();
    }

    @Override // l.InterfaceC3415
    public final int getNumber() {
        return this.f7299.m41962();
    }

    public final String toString() {
        return this.f7299.getName();
    }

    @Override // l.AbstractC0823
    /* renamed from: ܿ */
    public final String mo1141() {
        return this.f7302;
    }

    @Override // l.AbstractC0823
    /* renamed from: ۧ */
    public final C5057 mo1134() {
        C5057 c5057;
        c5057 = this.f7301.f28162;
        return c5057;
    }

    public final C9291 getType() {
        return this.f7301;
    }

    public C2235(C17964 c17964, C5057 c5057, C9291 c9291, int i) {
        super(0);
        this.f2993 = c9291;
        this.f7300 = i;
        this.f7299 = c17964;
        this.f7301 = c9291;
        this.f7302 = c9291.mo1141() + '.' + c17964.getName();
        c5057.f15895.m51849(this);
    }

    public C2235(C9291 c9291, Integer num) {
        super(0);
        String str = "UNKNOWN_ENUM_VALUE_" + c9291.getName() + "_" + num;
        C16552 newBuilder = C17964.newBuilder();
        newBuilder.m38935(str);
        newBuilder.m38934(num.intValue());
        C17964 buildPartial = newBuilder.buildPartial();
        if (buildPartial.isInitialized()) {
            this.f2993 = c9291;
            this.f7300 = -1;
            this.f7299 = buildPartial;
            this.f7301 = c9291;
            this.f7302 = c9291.mo1141() + '.' + buildPartial.getName();
            return;
        }
        throw AbstractC20704.m47318((InterfaceC23338) buildPartial);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7417(C2235 c2235) {
        c2235.m3070(c2235.f7299.m41965().m52096());
    }
}
