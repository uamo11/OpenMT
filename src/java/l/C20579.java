package l;

import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: K5GD */
/* renamed from: l.᩷ۖ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20579 extends AbstractC17050 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f66262;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C6467 f66263;

    public C20579(InterfaceC23586 interfaceC23586, C3330 c3330) {
        this.f66262 = interfaceC23586;
        this.f66263 = C6467.m17862(c3330);
    }

    @Override // l.AbstractC17050
    /* renamed from: ֫ */
    public final void mo40020() {
        this.f66263.m17864();
    }

    public final String toString() {
        int lastIndexOf;
        StringBuilder m32307 = C13325.m32307(128, "LoaderManager{");
        m32307.append(Integer.toHexString(System.identityHashCode(this)));
        m32307.append(" in ");
        Object obj = this.f66262;
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        m32307.append(simpleName);
        m32307.append('{');
        m32307.append(Integer.toHexString(System.identityHashCode(obj)));
        m32307.append("}}");
        return m32307.toString();
    }

    @Override // l.AbstractC17050
    @Deprecated
    /* renamed from: ֫ */
    public final void mo40021(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f66263.m17863(str, fileDescriptor, printWriter, strArr);
    }
}
