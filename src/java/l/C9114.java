package l;

import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: A6SP */
/* renamed from: l.ۡ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9114 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final FileChannel f27613;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f27614;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C9820 f27615;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9820 f27616;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C9820 f27617;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C9820 f27618;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f27620;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C9820 f27621;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f27622;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27623;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9820 f27624;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f27625;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C5377 f27626;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9820[] f27619 = new C9820[255];

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C5089 f27612 = new C5089(-1, -1);

    public C9114(InterfaceC20758 interfaceC20758, FileChannel fileChannel, C5377 c5377) {
        this.f27622 = interfaceC20758;
        this.f27613 = fileChannel;
        this.f27626 = c5377;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C9114 m23478(java.io.InputStream r6, l.InterfaceC20758 r7, l.C1143 r8, long r9) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9114.m23478(java.io.InputStream, l.᩷۠ᩴ, l.֨۬ᩳ, long):l.ۡ᩶ᩳ");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9820 m23486() {
        return this.f27617;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C9820 m23491() {
        return this.f27618;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9820 m23482() {
        return this.f27624;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9820 m23487() {
        return this.f27621;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C9820 m23485() {
        return this.f27616;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C9820 m23484() {
        return this.f27615;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C5089 m23490() {
        return this.f27612;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m23489() {
        return this.f27614;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m23492() {
        return this.f27620;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m23488() {
        return this.f27623;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9820 m23483(int i) {
        if (i >= 0) {
            C9820[] c9820Arr = this.f27619;
            if (i < c9820Arr.length) {
                return c9820Arr[i];
            }
        }
        throw new IllegalArgumentException("Invalid legacy state record type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        throw new java.io.IOException("Invalid legacy selection");
     */
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m23476() {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9114.m23476():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9820 m23479(long j, long j2) {
        return new C9820(this, j, j2 - j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m23481(C9114 c9114) {
        if (c9114.f27625) {
            throw new IOException("Legacy state index is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C5377 c5377 = this.f27626;
        InterfaceC20758 interfaceC20758 = this.f27622;
        if (this.f27625) {
            return;
        }
        this.f27625 = true;
        try {
            try {
                this.f27613.close();
            } finally {
                C17229.delete(interfaceC20758);
            }
        } finally {
            c5377.close();
        }
    }
}
