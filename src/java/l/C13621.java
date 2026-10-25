package l;

import java.util.Iterator;

/* compiled from: I9O8 */
/* renamed from: l.ܰۚ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13621 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f40623;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f40624;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8971 f40625;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f40626;

    public C13621(C8971 c8971, long j) {
        this.f40625 = c8971;
        this.f40624 = c8971.getPartitionName() + ".img";
        long j2 = 0;
        long j3 = 0L;
        for (C1915 c1915 : c8971.getOperationsList()) {
            j2 += c1915.getDataLength();
            Iterator it = c1915.getDstExtentsList().iterator();
            while (it.hasNext()) {
                j3 += ((C12293) it.next()).getNumBlocks() * j;
            }
        }
        this.f40623 = j2;
        this.f40626 = j3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m32740() {
        return this.f40624;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m32739() {
        return this.f40623;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m32741() {
        return this.f40626;
    }

    public final String toString() {
        return "PayloadEntry{name='" + this.f40624 + "', size=" + this.f40626 + ", cSize=" + this.f40623 + '}';
    }
}
