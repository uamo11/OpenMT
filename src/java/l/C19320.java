package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: J71Y */
/* renamed from: l.᩵۟ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19320 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f60743 = "appassets.androidplatform.net";

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60744 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44517(InterfaceC0268 interfaceC0268) {
        this.f60744.add(new C10220("/", interfaceC0268));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44516(String str) {
        this.f60743 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0974 m44515() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f60744.iterator();
        while (it.hasNext()) {
            C10220 c10220 = (C10220) it.next();
            arrayList.add(new C5208(this.f60743, (String) c10220.f30697, (InterfaceC0268) c10220.f30698));
        }
        return new C0974(arrayList);
    }
}
