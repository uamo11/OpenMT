package l;

import android.util.SparseArray;

/* compiled from: H8MM */
/* renamed from: l.ۢۚۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9381 implements InterfaceC17847 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16302 f28495 = new C16302(new byte[4], 4);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15729 f28496;

    @Override // l.InterfaceC17847
    /* renamed from: ֫ */
    public final void mo22462(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
    }

    public C9381(C15729 c15729) {
        this.f28496 = c15729;
    }

    @Override // l.InterfaceC17847
    /* renamed from: ֫ */
    public final void mo22463(C17714 c17714) {
        C15729 c15729;
        int i;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i2;
        if (c17714.m41456() == 0 && (c17714.m41456() & 128) != 0) {
            c17714.m41478(6);
            int m41457 = c17714.m41457() / 4;
            int i3 = 0;
            while (true) {
                c15729 = this.f28496;
                if (i3 >= m41457) {
                    break;
                }
                C16302 c16302 = this.f28495;
                c17714.m41461(0, 4, c16302.f50146);
                c16302.m38354(0);
                int m38343 = c16302.m38343(16);
                c16302.m38351(3);
                if (m38343 == 0) {
                    c16302.m38351(13);
                } else {
                    int m383432 = c16302.m38343(13);
                    sparseArray2 = c15729.f48514;
                    if (sparseArray2.get(m383432) == null) {
                        sparseArray3 = c15729.f48514;
                        sparseArray3.put(m383432, new C17141(new C8675(c15729, m383432)));
                        i2 = c15729.f48519;
                        c15729.f48519 = i2 + 1;
                    }
                }
                i3++;
            }
            i = c15729.f48526;
            if (i != 2) {
                sparseArray = c15729.f48514;
                sparseArray.remove(0);
            }
        }
    }
}
