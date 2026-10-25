package l;

import android.util.SparseArray;

/* compiled from: O8V0 */
/* renamed from: l.֨֡ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0767 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f2833;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f2835;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f2836;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f2837;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f2839;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19383 f2841;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17921 f2842;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f2843;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f2845;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f2846;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2847;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f2848;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f2849;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f2850;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f2851;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final SparseArray f2834 = new SparseArray();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final SparseArray f2840 = new SparseArray();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5001 f2844 = new C5001();

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C5001 f2838 = new C5001();

    public C0767(InterfaceC19383 interfaceC19383, boolean z, boolean z2) {
        this.f2841 = interfaceC19383;
        this.f2835 = z;
        this.f2846 = z2;
        byte[] bArr = new byte[128];
        this.f2845 = bArr;
        this.f2842 = new C17921(bArr, 0, 0);
        m2927();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2925() {
        return this.f2846;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2924(C10866 c10866) {
        this.f2834.append(c10866.f32645, c10866);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2923(C1693 c1693) {
        this.f2840.append(c1693.f5868, c1693);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2927() {
        this.f2843 = false;
        this.f2837 = false;
        this.f2838.m14487();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2922(int i, long j, long j2, boolean z) {
        this.f2850 = i;
        this.f2839 = j2;
        this.f2851 = j;
        this.f2836 = z;
        if (!this.f2835 || i != 1) {
            if (!this.f2846) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        C5001 c5001 = this.f2844;
        this.f2844 = this.f2838;
        this.f2838 = c5001;
        c5001.m14487();
        this.f2847 = 0;
        this.f2843 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2921(int r23, int r24, byte[] r25) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0767.m2921(int, int, byte[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m2926(long j, int i, boolean z) {
        boolean z2 = true;
        if (this.f2850 == 9 || (this.f2846 && C5001.m14486(this.f2838, this.f2844))) {
            if (z && this.f2837) {
                long j2 = this.f2851;
                int i2 = i + ((int) (j - j2));
                long j3 = this.f2833;
                if (j3 != -9223372036854775807L) {
                    long j4 = this.f2849;
                    if (j2 != j4) {
                        this.f2841.mo8455(j3, this.f2848 ? 1 : 0, (int) (j2 - j4), i2, null);
                    }
                }
            }
            this.f2849 = this.f2851;
            this.f2833 = this.f2839;
            this.f2848 = false;
            this.f2837 = true;
        }
        boolean m14490 = this.f2835 ? this.f2838.m14490() : this.f2836;
        boolean z3 = this.f2848;
        int i3 = this.f2850;
        if (i3 != 5 && (!m14490 || i3 != 1)) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        this.f2848 = z4;
        this.f2850 = 24;
        return z4;
    }
}
