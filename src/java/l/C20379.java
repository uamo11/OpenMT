package l;

import java.util.Iterator;

/* compiled from: UB7S */
/* renamed from: l.᩶᩵ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20379 implements InterfaceC5562 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f65778;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f65779;

    public C20379(boolean z, String str) {
        this.f65778 = z;
        this.f65779 = str;
    }

    @Override // l.InterfaceC5562
    /* renamed from: ֫ */
    public final boolean mo4662(AbstractC19261 abstractC19261) {
        int i;
        boolean z = this.f65778;
        String str = this.f65779;
        if (z && str == null) {
            str = abstractC19261.mo1457();
        }
        InterfaceC3738 interfaceC3738 = abstractC19261.f16091;
        if (interfaceC3738 != null) {
            Iterator it = interfaceC3738.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC19261 abstractC192612 = (AbstractC19261) ((C5149) it.next());
                if (str == null || abstractC192612.mo1457().equals(str)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.f65778 ? C4860.m14172("only-of-type <", this.f65779, ">") : "only-child";
    }
}
