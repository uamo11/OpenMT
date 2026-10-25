package l;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: T7LF */
/* renamed from: l.᩸ܰ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21612 implements InterfaceC6403 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3267 f69391;

    public final String toString() {
        return "unnamedModule Completer";
    }

    @Override // l.InterfaceC6403
    /* renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    public C21612(C3267 c3267) {
        this.f69391 = c3267;
    }

    @Override // l.InterfaceC6403
    /* renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C20661 c20661;
        C3267 c3267 = this.f69391;
        if (c3267.f10253) {
            abstractC5698.f17564 = this;
            return;
        }
        C0052 c0052 = (C0052) abstractC5698;
        HashSet hashSet = new HashSet(c3267.m10064());
        c20661 = c3267.f10261;
        hashSet.remove(c20661.f66447);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C0052) it.next()).mo16101();
        }
        c3267.m10024(c0052, hashSet);
    }
}
