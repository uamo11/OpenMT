package l;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: J7HX */
/* renamed from: l.ۡ᩻᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9222 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f27912;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4300 f27913;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f27914;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile long f27915;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f27916;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f27917;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f27918;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f27919;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f27920;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f27921;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C9222 m23662(C2872 c2872, int i, C22213 c22213) {
        long j = this.f27915 - this.f27912.get();
        if (j < 2097152) {
            return null;
        }
        if (System.currentTimeMillis() - this.f27914 >= c22213.m49888()) {
            long m12876 = this.f27913.m12876();
            if (m12876 <= 0) {
                return null;
            }
            if (j / m12876 < c22213.m49887()) {
                return null;
            }
        } else if (j <= 52428800) {
            return null;
        }
        long j2 = j / (i + 1);
        if (j2 < 1048576) {
            j2 = 1048576;
        }
        long j3 = this.f27915 - j2;
        long j4 = this.f27915;
        this.f27915 = j3;
        return new C9222(this.f27917, this.f27919, c2872.f9143.incrementAndGet(), this.f27921, this.f27918, j3, j4, this.f27916);
    }

    public C9222(int i, String str, int i2, String str2, long j, long j2, long j3, InterfaceC7889 interfaceC7889) {
        this.f27917 = i;
        this.f27919 = str;
        this.f27921 = str2;
        this.f27918 = j;
        this.f27920 = j2;
        this.f27912 = new AtomicLong(j2);
        this.f27915 = j3;
        this.f27916 = interfaceC7889;
        C4300 c4300 = new C4300();
        c4300.m12878();
        this.f27913 = c4300;
        this.f27914 = System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0108, code lost:
    
        if (r2 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010a, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0112, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        m23661(r2, l.EnumC11772.EARLY_COMPLETE);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.ۢ᩻᩻] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m23663(l.AbstractC3163 r20, l.C2872 r21, l.C2036 r22) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9222.m23663(l.ۗۢ᩻, l.ۖ᩻᩻, l.֫᩵ܿ):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23661(InputStream inputStream, EnumC11772 enumC11772) {
        if (inputStream instanceof InterfaceC23060) {
            ((InterfaceC23060) inputStream).mo4670(enumC11772);
        }
    }
}
