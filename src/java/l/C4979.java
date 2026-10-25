package l;

import android.content.Context;
import android.view.Surface;

/* compiled from: D8ML */
/* renamed from: l.ۙ᩻ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4979 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f15673;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f15675;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f15678;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17679 f15680;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f15681;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6390 f15683;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f15684;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f15686;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f15682 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f15676 = -9223372036854775807L;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f15677 = -9223372036854775807L;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f15685 = -9223372036854775807L;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f15674 = 1.0f;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC16427 f15679 = InterfaceC16427.f50519;

    public C4979(Context context, C17679 c17679, long j) {
        this.f15680 = c17679;
        this.f15673 = j;
        this.f15683 = new C6390(context);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14449() {
        this.f15675 = true;
        this.f15681 = C3603.m11014(this.f15679.mo33834());
        this.f15683.m17717();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m14451() {
        this.f15675 = false;
        this.f15685 = -9223372036854775807L;
        this.f15683.m17720();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14442(Surface surface) {
        this.f15686 = surface != null;
        this.f15684 = false;
        this.f15683.m17716(surface);
        this.f15682 = Math.min(this.f15682, 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14440(float f) {
        this.f15683.m17714(f);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14448() {
        boolean z = this.f15682 != 3;
        this.f15682 = 3;
        this.f15681 = C3603.m11014(this.f15679.mo33834());
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14443(InterfaceC16427 interfaceC16427) {
        this.f15679 = interfaceC16427;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14439() {
        if (this.f15682 == 0) {
            this.f15682 = 1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14444(boolean z) {
        if (z && (this.f15682 == 3 || (!this.f15686 && this.f15684))) {
            this.f15685 = -9223372036854775807L;
            return true;
        }
        if (this.f15685 == -9223372036854775807L) {
            return false;
        }
        if (this.f15679.mo33834() < this.f15685) {
            return true;
        }
        this.f15685 = -9223372036854775807L;
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14447(boolean z) {
        this.f15678 = z;
        long j = this.f15673;
        this.f15685 = j > 0 ? this.f15679.mo33834() + j : -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ba, code lost:
    
        if (r13 > 100000) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c5, code lost:
    
        if (r22 >= r26) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m14438(long r20, long r22, long r24, long r26, boolean r28, boolean r29, l.C20502 r30) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4979.m14438(long, long, long, long, boolean, boolean, l.᩶᩻ۧ):int");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m14450() {
        this.f15683.m17713();
        this.f15677 = -9223372036854775807L;
        this.f15676 = -9223372036854775807L;
        this.f15682 = Math.min(this.f15682, 1);
        this.f15685 = -9223372036854775807L;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14446(int i) {
        this.f15683.m17715(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14445(float f) {
        C22632.m50631(f > 0.0f);
        if (f == this.f15674) {
            return;
        }
        this.f15674 = f;
        this.f15683.m17718(f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14441(int i) {
        if (i == 0) {
            this.f15682 = 1;
        } else if (i == 1) {
            this.f15682 = 0;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            this.f15682 = Math.min(this.f15682, 2);
        }
    }
}
