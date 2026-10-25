package l;

import java.math.BigInteger;

/* compiled from: E8PN */
/* renamed from: l.ۢۘۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9339 implements InterfaceC9505 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8633 f28321;

    @Override // l.InterfaceC9505
    /* renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C9339(C8633 c8633) {
        this.f28321 = c8633;
    }

    @Override // l.InterfaceC9505
    /* renamed from: ֫ */
    public final C6682 mo1721(long j) {
        AbstractC14982 abstractC14982;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        C8633 c8633 = this.f28321;
        abstractC14982 = c8633.f26359;
        long m35476 = abstractC14982.m35476(j);
        j2 = c8633.f26364;
        BigInteger valueOf = BigInteger.valueOf(m35476);
        j3 = c8633.f26365;
        j4 = c8633.f26364;
        BigInteger multiply = valueOf.multiply(BigInteger.valueOf(j3 - j4));
        j5 = c8633.f26362;
        long longValue = (multiply.divide(BigInteger.valueOf(j5)).longValue() + j2) - 30000;
        j6 = c8633.f26364;
        j7 = c8633.f26365;
        C8799 c8799 = new C8799(j, C3603.m11016(longValue, j6, j7 - 1));
        return new C6682(c8799, c8799);
    }

    @Override // l.InterfaceC9505
    /* renamed from: ۜ */
    public final long mo6827() {
        AbstractC14982 abstractC14982;
        long j;
        C8633 c8633 = this.f28321;
        abstractC14982 = c8633.f26359;
        j = c8633.f26362;
        return abstractC14982.m35473(j);
    }
}
