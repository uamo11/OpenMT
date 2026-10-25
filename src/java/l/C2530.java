package l;

import android.view.View;

/* compiled from: V5QL */
/* renamed from: l.ۖ۫ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2530 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8880 f8032;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15934 f8033;

    public C2530(InterfaceC15934 interfaceC15934) {
        this.f8033 = interfaceC15934;
        C8880 c8880 = new C8880();
        c8880.f27031 = 0;
        this.f8032 = c8880;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m8044(int i, int i2, int i3, int i4) {
        InterfaceC15934 interfaceC15934 = this.f8033;
        int mo6126 = interfaceC15934.mo6126();
        int mo6128 = interfaceC15934.mo6128();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = interfaceC15934.getChildAt(i);
            int mo6127 = interfaceC15934.mo6127(childAt);
            int mo6129 = interfaceC15934.mo6129(childAt);
            C8880 c8880 = this.f8032;
            c8880.f27034 = mo6126;
            c8880.f27035 = mo6128;
            c8880.f27033 = mo6127;
            c8880.f27032 = mo6129;
            if (i3 != 0) {
                c8880.f27031 = i3;
                if (c8880.m22946()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                c8880.f27031 = i4;
                if (c8880.m22946()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8045(View view) {
        InterfaceC15934 interfaceC15934 = this.f8033;
        int mo6126 = interfaceC15934.mo6126();
        int mo6128 = interfaceC15934.mo6128();
        int mo6127 = interfaceC15934.mo6127(view);
        int mo6129 = interfaceC15934.mo6129(view);
        C8880 c8880 = this.f8032;
        c8880.f27034 = mo6126;
        c8880.f27035 = mo6128;
        c8880.f27033 = mo6127;
        c8880.f27032 = mo6129;
        c8880.f27031 = 24579;
        return c8880.m22946();
    }
}
