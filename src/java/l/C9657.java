package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 31AT */
/* renamed from: l.ۢܶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9657 extends AbstractC8245 {
    @Override // l.AbstractC8245
    /* renamed from: ܳ */
    public final boolean mo6243() {
        return false;
    }

    @Override // l.AbstractC8245
    /* renamed from: ܽ */
    public final void mo6244() {
        this.f25375 = null;
        this.f25382.m40762();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24595(C17417 c17417) {
        C17417 c174172 = this.f25382;
        c174172.f53269.add(c17417);
        c17417.f53275.add(c174172);
    }

    @Override // l.AbstractC8245
    /* renamed from: ֫ */
    public final void mo6240() {
        C15094 c15094 = this.f25376;
        if (c15094 instanceof C2396) {
            C17417 c17417 = this.f25382;
            c17417.f53265 = true;
            ArrayList arrayList = c17417.f53275;
            C2396 c2396 = (C2396) c15094;
            int m7766 = c2396.m7766();
            boolean m7770 = c2396.m7770();
            int i = 0;
            if (m7766 == 0) {
                c17417.f53268 = EnumC18123.LEFT;
                while (i < c2396.f38881) {
                    C15094 c150942 = c2396.f38882[i];
                    if (m7770 || c150942.m35735() != 8) {
                        C17417 c174172 = c150942.f46156.f25382;
                        c174172.f53269.add(c17417);
                        arrayList.add(c174172);
                    }
                    i++;
                }
                m24595(this.f25376.f46156.f25382);
                m24595(this.f25376.f46156.f25379);
                return;
            }
            if (m7766 == 1) {
                c17417.f53268 = EnumC18123.RIGHT;
                while (i < c2396.f38881) {
                    C15094 c150943 = c2396.f38882[i];
                    if (m7770 || c150943.m35735() != 8) {
                        C17417 c174173 = c150943.f46156.f25379;
                        c174173.f53269.add(c17417);
                        arrayList.add(c174173);
                    }
                    i++;
                }
                m24595(this.f25376.f46156.f25382);
                m24595(this.f25376.f46156.f25379);
                return;
            }
            if (m7766 == 2) {
                c17417.f53268 = EnumC18123.TOP;
                while (i < c2396.f38881) {
                    C15094 c150944 = c2396.f38882[i];
                    if (m7770 || c150944.m35735() != 8) {
                        C17417 c174174 = c150944.f46140.f25382;
                        c174174.f53269.add(c17417);
                        arrayList.add(c174174);
                    }
                    i++;
                }
                m24595(this.f25376.f46140.f25382);
                m24595(this.f25376.f46140.f25379);
                return;
            }
            if (m7766 != 3) {
                return;
            }
            c17417.f53268 = EnumC18123.BOTTOM;
            while (i < c2396.f38881) {
                C15094 c150945 = c2396.f38882[i];
                if (m7770 || c150945.m35735() != 8) {
                    C17417 c174175 = c150945.f46140.f25379;
                    c174175.f53269.add(c17417);
                    arrayList.add(c174175);
                }
                i++;
            }
            m24595(this.f25376.f46140.f25382);
            m24595(this.f25376.f46140.f25379);
        }
    }

    @Override // l.AbstractC8245, l.InterfaceC11068
    /* renamed from: ֫ */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
        C2396 c2396 = (C2396) this.f25376;
        int m7766 = c2396.m7766();
        C17417 c17417 = this.f25382;
        Iterator it = c17417.f53275.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = ((C17417) it.next()).f53271;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (m7766 == 0 || m7766 == 2) {
            c17417.mo34849(c2396.m7765() + i2);
        } else {
            c17417.mo34849(c2396.m7765() + i);
        }
    }

    @Override // l.AbstractC8245
    /* renamed from: ۧ */
    public final void mo6242() {
        C15094 c15094 = this.f25376;
        if (c15094 instanceof C2396) {
            int m7766 = ((C2396) c15094).m7766();
            C17417 c17417 = this.f25382;
            if (m7766 == 0 || m7766 == 1) {
                this.f25376.m35706(c17417.f53271);
            } else {
                this.f25376.m35731(c17417.f53271);
            }
        }
    }
}
