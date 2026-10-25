package l;

/* compiled from: Z6QT */
/* renamed from: l.ۨ֨ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11376 implements InterfaceC10795 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long[] f34036;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f34037;

    @Override // l.InterfaceC10795
    /* renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C1622.m5503(this, interfaceC10795);
    }

    public C11376(long[] jArr, boolean z) {
        this.f34036 = jArr;
        this.f34037 = z;
    }

    @Override // l.InterfaceC10795
    /* renamed from: ֫ */
    public final boolean mo2465(int i) {
        if (i < 65536) {
            int m10356 = C3395.m10356(i);
            long[] jArr = this.f34036;
            if (m10356 < (jArr.length << 6)) {
                return (jArr[m10356 >>> 6] & (1 << m10356)) != 0;
            }
        }
        return this.f34037;
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }
}
