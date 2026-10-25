package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: U6AJ */
/* renamed from: l.ۘܶ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4013 extends C11069 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f12742;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f12743;

    @Override // l.C11069, l.AbstractC8246
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo12088() {
    }

    public C4013(C1190 c1190, int i, InterfaceC16053 interfaceC16053) {
        super(c1190, i, interfaceC16053);
        int m4016 = c1190.m4016(i);
        this.f12743 = new ArrayList();
        if (m4016 >= 0) {
            for (InterfaceC18007 interfaceC18007 : interfaceC16053.mo8107()) {
                this.f12743.add(new C8952(interfaceC18007.getKey(), c1190.m4014().m15515(new C19536(c1190.f4289, interfaceC18007.mo12019() + m4016, "sswitch_"))));
            }
            return;
        }
        this.f12742 = true;
        for (InterfaceC18007 interfaceC180072 : interfaceC16053.mo8107()) {
            this.f12743.add(new C16006(interfaceC180072.getKey(), interfaceC180072.mo12019()));
        }
    }

    @Override // l.C11069, l.AbstractC8246
    /* renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) {
        if (this.f12742) {
            c3438 = new C8041(c3438);
        }
        boolean z = this.f33244.f4289.f72438;
        c3438.getClass();
        c3438.write(".sparse-switch\n", 0, 15);
        c3438.m10512();
        Iterator it = this.f12743.iterator();
        while (it.hasNext()) {
            AbstractC2602 abstractC2602 = (AbstractC2602) it.next();
            C20241.m46486(c3438, abstractC2602.m8229());
            c3438.write(" -> ", 0, 4);
            abstractC2602.mo8230(c3438);
            if (z) {
                m27459(c3438, abstractC2602.m8229());
            }
            c3438.write(10);
        }
        c3438.m10508();
        c3438.write(".end sparse-switch", 0, 18);
        return true;
    }
}
