package l;

import java.util.ArrayList;

/* compiled from: SBDM */
/* renamed from: l.ܺۖܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15648 implements InterfaceC10752 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f48166 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2244 f48167;

    public C15648(C2244 c2244) {
        this.f48167 = c2244;
    }

    @Override // l.InterfaceC10752
    /* renamed from: ֫ */
    public final void mo24095(C16395 c16395, C16395 c163952) {
        ArrayList arrayList;
        C8594[] c8594Arr;
        C8594 c8594 = new C8594();
        c8594.f26241 = new ArrayList();
        int i = this.f48166 + 1;
        this.f48166 = i;
        c8594.f26243 = i;
        c8594.f26244 = c16395;
        c8594.f26242 = c163952;
        C2244 c2244 = this.f48167;
        arrayList = c2244.f7316;
        arrayList.add(c16395);
        c8594Arr = c2244.f7315;
        c8594Arr[c16395.m38609()] = c8594;
    }
}
