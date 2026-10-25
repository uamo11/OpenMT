package l;

import java.util.concurrent.TimeUnit;

/* compiled from: H4E0 */
/* renamed from: l.ۧܰ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11044 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f33206;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f33207;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f33208;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f33209;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f33210;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f33211;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f33212;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f33213;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f33214;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f33215;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f33216;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f33217;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f33218;

    static {
        C1871 c1871 = new C1871();
        c1871.f6380 = true;
        c1871.m6197();
        C1871 c18712 = new C1871();
        c18712.f6379 = true;
        long seconds = TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        c18712.f6377 = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        c18712.m6197();
    }

    public C11044(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.f33217 = z;
        this.f33210 = z2;
        this.f33215 = i;
        this.f33207 = i2;
        this.f33214 = z3;
        this.f33216 = z4;
        this.f33208 = z5;
        this.f33212 = i3;
        this.f33218 = i4;
        this.f33213 = z6;
        this.f33209 = z7;
        this.f33211 = z8;
        this.f33206 = str;
    }

    public C11044(C1871 c1871) {
        this.f33217 = c1871.f6380;
        this.f33210 = false;
        this.f33215 = c1871.f6376;
        this.f33207 = -1;
        this.f33214 = false;
        this.f33216 = false;
        this.f33208 = false;
        this.f33212 = c1871.f6377;
        this.f33218 = c1871.f6378;
        this.f33213 = c1871.f6379;
        this.f33209 = false;
        this.f33211 = false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m27431() {
        return this.f33217;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m27424() {
        return this.f33210;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m27427() {
        return this.f33215;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27423() {
        return this.f33214;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27425() {
        return this.f33216;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m27426() {
        return this.f33208;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27429() {
        return this.f33212;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m27428() {
        return this.f33218;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m27430() {
        return this.f33213;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C11044 m27422(l.C10338 r21) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11044.m27422(l.ۤܰ᩵):l.ۧܰ᩵");
    }

    public final String toString() {
        String sb;
        String str = this.f33206;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f33217) {
            sb2.append("no-cache, ");
        }
        if (this.f33210) {
            sb2.append("no-store, ");
        }
        int i = this.f33215;
        if (i != -1) {
            sb2.append("max-age=");
            sb2.append(i);
            sb2.append(", ");
        }
        int i2 = this.f33207;
        if (i2 != -1) {
            sb2.append("s-maxage=");
            sb2.append(i2);
            sb2.append(", ");
        }
        if (this.f33214) {
            sb2.append("private, ");
        }
        if (this.f33216) {
            sb2.append("public, ");
        }
        if (this.f33208) {
            sb2.append("must-revalidate, ");
        }
        int i3 = this.f33212;
        if (i3 != -1) {
            sb2.append("max-stale=");
            sb2.append(i3);
            sb2.append(", ");
        }
        int i4 = this.f33218;
        if (i4 != -1) {
            sb2.append("min-fresh=");
            sb2.append(i4);
            sb2.append(", ");
        }
        if (this.f33213) {
            sb2.append("only-if-cached, ");
        }
        if (this.f33209) {
            sb2.append("no-transform, ");
        }
        if (this.f33211) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            sb = "";
        } else {
            sb2.delete(sb2.length() - 2, sb2.length());
            sb = sb2.toString();
        }
        this.f33206 = sb;
        return sb;
    }
}
