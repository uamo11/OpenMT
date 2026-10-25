package l;

import java.util.Set;

/* compiled from: X44P */
/* renamed from: l.᩹ܿ۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22427 extends C15817 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18837 f72663;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20311 f72664;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f72665;

    public C22427(C20311 c20311, Set set, C18837 c18837) {
        this.f72664 = c20311;
        this.f72665 = set;
        this.f72663 = c18837;
    }

    @Override // l.C15817, l.InterfaceC17935
    public final EnumC16523 preVisitDirectory(Object obj, InterfaceC15111 interfaceC15111) {
        if (C20311.m46553(this.f72664, ((InterfaceC20758) obj).getFileName())) {
            return EnumC16523.CONTINUE;
        }
        return EnumC16523.SKIP_SUBTREE;
    }

    @Override // l.C15817, l.InterfaceC17935
    public final EnumC16523 visitFile(Object obj, InterfaceC15111 interfaceC15111) {
        InterfaceC20758 interfaceC20758;
        InterfaceC20758 interfaceC207582 = (InterfaceC20758) obj;
        if (interfaceC15111.isRegularFile()) {
            if (this.f72665.contains(AbstractC21017.m47830(interfaceC207582.getFileName().toString()))) {
                C20311 c20311 = this.f72664;
                C11844 c11844 = c20311.f65582;
                interfaceC20758 = c20311.f65579;
                int i = AbstractC12465.f37474;
                this.f72663.m43511(new C3293(c11844, interfaceC207582, interfaceC20758, 0));
            }
        }
        return EnumC16523.CONTINUE;
    }
}
