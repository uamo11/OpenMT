package l;

import java.util.Iterator;

/* compiled from: 31MV */
/* renamed from: l.ܺܿۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC16073 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18107 f49543;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6818 f49544;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4701 f49545;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f49546;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f49547;

    /* renamed from: ֫ */
    public abstract C21635 mo23269(int i);

    /* renamed from: ֫ */
    public abstract void mo23270(int i, int i2, int i3, int i4);

    /* renamed from: ۧ */
    public abstract C21635 mo23271(int i);

    public AbstractC16073(int i, int i2, InterfaceC6818 interfaceC6818, C4701 c4701) {
        this.f49547 = i;
        this.f49546 = i2;
        this.f49544 = interfaceC6818;
        this.f49545 = c4701;
        this.f49543 = new C18107(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6818 m37982() {
        Iterator it = this.f49544.mo6219().iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            C18107 c18107 = this.f49543;
            if (hasNext) {
                C22340 c22340 = (C22340) it.next();
                int i3 = c22340.f72395;
                int i4 = c22340.f72397;
                int i5 = i3 - i4;
                int i6 = 0;
                while (i6 < i5) {
                    C21635 mo23269 = mo23269(i4 + i6);
                    C21635 mo23271 = mo23271(c22340.f72398 + i6);
                    int i7 = mo23269.f69460;
                    int i8 = mo23271.f69460;
                    int i9 = mo23269.f69461;
                    int i10 = mo23271.f69461;
                    mo23270(i, i7, i2, i8);
                    c18107.m40752(i7, i8, i9, i10);
                    i6++;
                    i = i9;
                    i2 = i10;
                }
            } else {
                mo23270(i, this.f49547, i2, this.f49546);
                return C23751.m52403(c18107.m42227());
            }
        }
    }
}
