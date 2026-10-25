package l;

import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: X8NN */
/* renamed from: l.ۢ֡ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9235 implements InterfaceC15583 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f27955;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f27957;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f27958;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f27959;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f27960;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f27962;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f27963;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f27965;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C8353 f27966;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f27969;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17714 f27970;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f27956 = 0;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f27967 = -9223372036854775807L;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f27968 = new AtomicInteger();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27964 = -1;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f27954 = -1;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f27961 = "video/mp2t";

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1004(boolean z) {
    }

    public C9235(String str, int i, int i2) {
        this.f27970 = new C17714(new byte[i2]);
        this.f27958 = str;
        this.f27960 = i;
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1000() {
        this.f27956 = 0;
        this.f27955 = 0;
        this.f27957 = 0;
        this.f27967 = -9223372036854775807L;
        this.f27968.set(0);
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1003(InterfaceC21830 interfaceC21830, C19259 c19259) {
        c19259.m44443();
        this.f27965 = c19259.m44444();
        this.f27969 = interfaceC21830.mo3429(c19259.m44445(), 1);
    }

    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    public final void mo1001(int i, long j) {
        this.f27967 = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cf  */
    @Override // l.InterfaceC15583
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1002(l.C17714 r19) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9235.mo1002(l.ᩳ֨֫):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m23678(C17714 c17714, byte[] bArr, int i) {
        int min = Math.min(c17714.m41457(), i - this.f27955);
        c17714.m41461(this.f27955, min, bArr);
        int i2 = this.f27955 + min;
        this.f27955 = i2;
        return i2 == i;
    }

    @RequiresNonNull({"output"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23677(C0662 c0662) {
        int i = c0662.f2563;
        String str = c0662.f2564;
        int i2 = c0662.f2560;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        C8353 c8353 = this.f27966;
        if (c8353 != null && i2 == c8353.f25625 && i == c8353.f25624 && str.equals(c8353.f25614)) {
            return;
        }
        C8353 c83532 = this.f27966;
        C1297 c1297 = c83532 == null ? new C1297() : c83532.m21948();
        c1297.m4469(this.f27965);
        c1297.m4462(this.f27961);
        c1297.m4465(str);
        c1297.m4472(i2);
        c1297.m4456(i);
        c1297.m4471(this.f27958);
        c1297.m4454(this.f27960);
        C8353 m4440 = c1297.m4440();
        this.f27966 = m4440;
        this.f27969.mo8456(m4440);
    }
}
