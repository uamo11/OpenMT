package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R69D */
/* renamed from: l.ۢܶ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9658 extends C11069 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f29252;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f29253;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f29254;

    @Override // l.C11069, l.AbstractC8246
    /* renamed from: ܿ */
    public final void mo12088() {
    }

    public C9658(C1190 c1190, int i, InterfaceC8999 interfaceC8999) {
        super(c1190, i, interfaceC8999);
        int i2;
        int m4012 = c1190.m4012(i);
        this.f29253 = new ArrayList();
        boolean z = true;
        if (m4012 >= 0) {
            i2 = 0;
            boolean z2 = true;
            for (InterfaceC18007 interfaceC18007 : interfaceC8999.mo8107()) {
                if (z2) {
                    i2 = interfaceC18007.getKey();
                    z2 = false;
                }
                C19536 m15515 = c1190.m4014().m15515(new C19536(c1190.f4289, interfaceC18007.mo12019() + m4012, "pswitch_"));
                if (m15515.m44936()) {
                    m15515.m44935(String.format("%s, 0x%x", m15515.m44940(), Integer.valueOf(interfaceC18007.getKey())));
                } else {
                    m15515.m44935(String.format("0x%x", Integer.valueOf(interfaceC18007.getKey())));
                }
                this.f29253.add(new C23768(m15515));
            }
        } else {
            this.f29252 = true;
            i2 = 0;
            for (InterfaceC18007 interfaceC180072 : interfaceC8999.mo8107()) {
                if (z) {
                    i2 = interfaceC180072.getKey();
                    z = false;
                }
                this.f29253.add(new C6835(interfaceC180072.mo12019()));
            }
        }
        this.f29254 = i2;
    }

    @Override // l.C11069, l.AbstractC8246
    /* renamed from: ֫ */
    public final boolean mo1618(C3438 c3438) {
        C19536 c19536;
        if (this.f29252) {
            c3438 = new C8041(c3438);
        }
        c3438.getClass();
        c3438.write(".packed-switch ", 0, 15);
        int i = this.f29254;
        C20241.m46486(c3438, i);
        c3438.m10512();
        c3438.write(10);
        boolean z = this.f33244.f4289.f72438;
        Iterator it = this.f29253.iterator();
        while (it.hasNext()) {
            AbstractC20947 abstractC20947 = (AbstractC20947) it.next();
            if (abstractC20947 instanceof C23768) {
                c19536 = ((C23768) abstractC20947).f76937;
                c19536.m44938(c3438);
            } else {
                abstractC20947.mo18519(c3438);
            }
            String format = String.format("  #%08x", Integer.valueOf(i));
            c3438.write(format, 0, format.length());
            if (z) {
                m27459(c3438, i);
            }
            c3438.write(10);
            i++;
        }
        c3438.m10508();
        c3438.write(".end packed-switch", 0, 18);
        return true;
    }
}
