package l;

import java.util.List;

/* compiled from: M1KQ */
/* renamed from: l.۟ܰ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7516 implements InterfaceC18302, InterfaceC20106, InterfaceC6722 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23127;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23128;

    public /* synthetic */ C7516(int i, Object obj) {
        this.f23127 = i;
        this.f23128 = obj;
    }

    @Override // l.InterfaceC20106
    /* renamed from: ֫ */
    public void mo13218(Object obj) {
        switch (this.f23127) {
            case 0:
                C19328.m44534((C19328) this.f23128);
                break;
            default:
                ((C0452) this.f23128).m2043(((Integer) obj).intValue());
                break;
        }
    }

    @Override // l.InterfaceC6722
    /* renamed from: ֫ */
    public void mo18292(List list, List list2, List list3, List list4) {
        C16475.m38789((C16475) this.f23128, list, list2, list3, list4);
    }

    @Override // l.InterfaceC18302
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long mo20158(long j) {
        return C3603.m11016((j * r0.f19537) / 1000000, 0L, ((C6307) this.f23128).f19533 - 1);
    }
}
