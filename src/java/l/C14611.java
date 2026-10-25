package l;

import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* compiled from: N673 */
/* renamed from: l.ܳܶᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C14611 implements InterfaceC21463 {
    public final /* synthetic */ DosFileAttributeView a;

    public /* synthetic */ C14611(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ void a(C4529 c4529, C4529 c45292, C4529 c45293) {
        this.a.setTimes(AbstractC22791.o(c4529), AbstractC22791.o(c45292), AbstractC22791.o(c45293));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C14611) {
            obj = ((C14611) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC22873
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC21463, l.InterfaceC16728
    public final /* synthetic */ C6851 readAttributes() {
        DosFileAttributes readAttributes = this.a.readAttributes();
        if (readAttributes == null) {
            return null;
        }
        return new C6851(readAttributes);
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ InterfaceC15111 readAttributes() {
        return C18140.a(this.a.readAttributes());
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setArchive(boolean z) {
        this.a.setArchive(z);
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setHidden(boolean z) {
        this.a.setHidden(z);
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setReadOnly(boolean z) {
        this.a.setReadOnly(z);
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setSystem(boolean z) {
        this.a.setSystem(z);
    }
}
