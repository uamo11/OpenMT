package l;

/* compiled from: 99YG */
/* renamed from: l.ۗ᩵᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3452 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f10916;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f10917;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f10918;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f10919;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f10920;

    public C3452(InterfaceC10196 interfaceC10196) {
        String name = interfaceC10196.getName();
        this.f10919 = name.endsWith("/") ? C15472.m36561(1, 0, name) : name;
        this.f10918 = interfaceC10196.mo25593();
        boolean isDirectory = interfaceC10196.isDirectory();
        this.f10917 = isDirectory;
        this.f10916 = interfaceC10196.mo25592();
        this.f10920 = isDirectory ? -1L : interfaceC10196.length();
    }

    public C3452(C12901 c12901) {
        String m31340 = c12901.m31340();
        this.f10919 = m31340;
        this.f10918 = -1L;
        this.f10920 = -1L;
        this.f10917 = true;
        this.f10916 = m31340.startsWith("$");
    }

    public C3452(C2463 c2463) {
        this.f10919 = c2463.m47624();
        this.f10920 = c2463.m7937();
        C22984 m7934 = c2463.m7934();
        m7934 = m7934 == null ? c2463.m7935() : m7934;
        this.f10918 = m7934 != null ? m7934.m51133() : -1L;
        long m7936 = c2463.m7936();
        this.f10917 = C15262.m36280(m7936, EnumC1757.FILE_ATTRIBUTE_DIRECTORY);
        this.f10916 = C15262.m36280(m7936, EnumC1757.FILE_ATTRIBUTE_HIDDEN);
    }
}
