package l;

import java.nio.file.attribute.BasicFileAttributeView;

/* compiled from: N673 */
/* renamed from: l.۟۠ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7351 implements InterfaceC16728 {
    public final /* synthetic */ BasicFileAttributeView a;

    public /* synthetic */ C7351(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ void a(C4529 c4529, C4529 c45292, C4529 c45293) {
        this.a.setTimes(AbstractC22791.o(c4529), AbstractC22791.o(c45292), AbstractC22791.o(c45293));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C7351) {
            obj = ((C7351) obj).a;
        }
        return basicFileAttributeView.equals(obj);
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
