package l;

import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: R537 */
/* renamed from: l.ᩳۜܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17891 extends AbstractC8343 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54626;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f54627;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public List f54628;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public List f54629;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C9425 f54630;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f54631;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f54632;

    public C17891(C23326 c23326, C5896 c5896) {
        super(c23326);
        ArrayList arrayList;
        this.f54626 = new ArrayList();
        this.f54631 = new ArrayList();
        this.f54627 = new ArrayList();
        this.f54632 = new ArrayList();
        int m16529 = c5896.m16529();
        C1993 m6523 = C1993.m6523(c5896);
        m6523.m6526(512);
        this.f25566 = c5896.m16535();
        this.f25565 = c5896.m16530(128);
        int m16535 = c5896.m16535();
        c5896.m16528();
        int m165352 = c5896.m16535();
        c5896.m16528();
        int m165353 = m6523.f6674 >= 288 ? c5896.m16535() : 0;
        c5896.m16533(m16535 + m16529);
        C9425 c9425 = new C9425(c5896);
        c5896.m16533(m165352 + m16529);
        C9425 c94252 = new C9425(c5896);
        this.f54630 = c94252;
        this.f54629 = new C10836(c9425);
        this.f54628 = new C16479(c94252);
        C1993 m65232 = C1993.m6523(c5896);
        int i = m16529 + m6523.f6673;
        SparseArray sparseArray = new SparseArray();
        while (true) {
            short s = m65232.f6676;
            if (s == 515) {
                int m165354 = c5896.m16535();
                ArrayList arrayList2 = this.f54626;
                arrayList2.ensureCapacity(m165354);
                for (int i2 = 0; i2 < m165354; i2++) {
                    arrayList2.add(new C14153(c5896));
                }
            } else if (s == 516) {
                C7804 c7804 = new C7804(c5896);
                this.f54631.add(c7804);
                int m165292 = c5896.m16529();
                C1993 m65233 = C1993.m6523(c5896);
                while (true) {
                    short s2 = m65233.f6676;
                    arrayList = c7804.f24112;
                    if (s2 != 517) {
                        break;
                    }
                    int m165355 = c5896.m16535();
                    int m165356 = c5896.m16535();
                    C15859 c15859 = new C15859(m165356);
                    for (int i3 = 0; i3 < m165356; i3++) {
                        c15859.add(c5896.m16535());
                    }
                    arrayList.add(new C1663(m165355, c15859));
                    m165292 = c5896.m16529();
                    m65233 = C1993.m6523(c5896);
                }
                arrayList.trimToSize();
                c5896.m16533(m165292);
            } else if (s == 518) {
                this.f54627.add(new C17185(c5896));
            } else if (s == 514) {
                C23535 c23535 = new C23535(this, c5896, m65232);
                this.f54632.add(c23535);
                sparseArray.put(c23535.mo2870(), c23535);
            } else if (s == 513) {
                int m16531 = c5896.m16531() - m165353;
                C23535 c235352 = (C23535) sparseArray.get(m16531);
                if (c235352 == null) {
                    throw new IOException(C19370.m44628(m16531, "Can not find ArscType with id of "));
                }
                c235352.m51996(new C6393(c235352, c5896, m65232));
            } else if (s == -1 || s == 512) {
                break;
            } else {
                System.err.printf("Skip arsc chunk: %04x\n", Short.valueOf(s));
            }
            int i4 = m65232.f6675 + m65232.f6673;
            if (i4 >= i) {
                break;
            }
            c5896.m16533(i4);
            m65232 = C1993.m6523(c5896);
        }
        c5896.m16533(i);
    }

    @Override // l.InterfaceC4277
    /* renamed from: ۗ */
    public final int mo12851() {
        return this.f54632.size();
    }

    @Override // l.InterfaceC4277
    public final InterfaceC0748 getType(int i) {
        return (C23535) this.f54632.get(i);
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    public final InterfaceC0748 getType(String str) {
        return (C23535) super.getType(str);
    }

    @Override // l.InterfaceC4277
    /* renamed from: ۠֫ */
    public final int mo12854() {
        return this.f54626.size();
    }

    @Override // l.InterfaceC4277
    /* renamed from: ۖ */
    public final InterfaceC9216 mo12849(int i) {
        return (C14153) this.f54626.get(i);
    }

    @Override // l.InterfaceC4277
    /* renamed from: ֡ */
    public final int mo12844() {
        return this.f54631.size();
    }

    @Override // l.InterfaceC4277
    /* renamed from: ᩴ */
    public final InterfaceC16270 mo12856(int i) {
        return (C7804) this.f54631.get(i);
    }

    @Override // l.InterfaceC4277
    /* renamed from: ֨֫ */
    public final int mo12846() {
        return this.f54627.size();
    }

    @Override // l.InterfaceC4277
    /* renamed from: ۜ */
    public final InterfaceC19094 mo12852(int i) {
        return (C17185) this.f54627.get(i);
    }

    @Override // l.InterfaceC4277
    /* renamed from: ۜۧ */
    public final List mo12853() {
        return this.f54629;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m41858() {
        return this.f54628;
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* renamed from: ֫ */
    public final InterfaceC9922 mo12847() {
        return (C23326) super.mo12847();
    }

    @Override // l.AbstractC8343, l.InterfaceC4277
    /* renamed from: ֫ */
    public final C23326 mo12847() {
        return (C23326) super.mo12847();
    }
}
