package l;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: B8H5 */
/* renamed from: l.֨᩵ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1326 implements InterfaceC13571 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C16142 f4776;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f4777;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f4778;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long[] f4779;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Map f4780;

    public C1326(C16142 c16142, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f4776 = c16142;
        this.f4777 = hashMap2;
        this.f4778 = hashMap3;
        this.f4780 = C20195.unmodifiableMap(hashMap);
        this.f4779 = c16142.m38066();
    }

    @Override // l.InterfaceC13571
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo4659(long j) {
        long[] jArr = this.f4779;
        int m11012 = C3603.m11012(jArr, j, false);
        if (m11012 < jArr.length) {
            return m11012;
        }
        return -1;
    }

    @Override // l.InterfaceC13571
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo4658() {
        return this.f4779.length;
    }

    @Override // l.InterfaceC13571
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo4660(int i) {
        return this.f4779[i];
    }

    @Override // l.InterfaceC13571
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List mo4661(long j) {
        return this.f4776.m38062(j, this.f4780, this.f4777, this.f4778);
    }
}
