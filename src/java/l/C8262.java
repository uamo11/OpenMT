package l;

import java.nio.file.attribute.PosixFileAttributeView;

/* compiled from: N673 */
/* renamed from: l.۠ܶᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8262 implements InterfaceC16728, InterfaceC19552 {
    public final /* synthetic */ PosixFileAttributeView a;

    public /* synthetic */ C8262(PosixFileAttributeView posixFileAttributeView) {
        this.a = posixFileAttributeView;
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ void a(C4529 c4529, C4529 c45292, C4529 c45293) {
        this.a.setTimes(AbstractC22791.o(c4529), AbstractC22791.o(c45292), AbstractC22791.o(c45293));
    }

    @Override // l.InterfaceC19552
    public final /* synthetic */ void b(InterfaceC11585 interfaceC11585) {
        this.a.setOwner(C10174.a(interfaceC11585));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.a;
        if (obj instanceof C8262) {
            obj = ((C8262) obj).a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // l.InterfaceC19552
    public final /* synthetic */ InterfaceC11585 getOwner() {
        return C20257.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC22873
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ InterfaceC15111 readAttributes() {
        return C18140.a(this.a.readAttributes());
    }
}
