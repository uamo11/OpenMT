package l;

/* compiled from: 9AJ5 */
/* renamed from: l.ۙۤܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4586 implements InterfaceC21601 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f14628;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14629;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f14630;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14631;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f14632 = false;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (l.C4925.f15523.getBoolean("def_mov_recycle_bin", true) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4586(boolean r5) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.f14632 = r0
            boolean r1 = l.C21939.m49417()
            if (r1 == 0) goto L18
            android.content.SharedPreferences r1 = l.C4925.f15523
            java.lang.String r2 = "def_mov_recycle_bin"
            r3 = 1
            boolean r1 = r1.getBoolean(r2, r3)
            if (r1 == 0) goto L18
            goto L19
        L18:
            r3 = 0
        L19:
            r4.f14628 = r3
            r4.f14631 = r0
            r4.f14629 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4586.<init>(boolean):void");
    }

    @Override // l.InterfaceC21601
    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public void mo13495() {
        this.f14629 = true;
    }

    @Override // l.InterfaceC21601
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean mo13496() {
        return !this.f14632;
    }

    @Override // l.InterfaceC21601
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo13492(boolean z) {
        return z || mo13496();
    }

    @Override // l.InterfaceC21601
    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean mo13494() {
        return this.f14628;
    }

    @Override // l.InterfaceC21601
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo13491(String str, C22306 c22306, C22306 c223062, boolean z) {
        this.f14630 = !new C21520(this, str, c22306, c223062, z).m21850(new C16015());
    }

    @Override // l.InterfaceC21601
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo13490(String str, C22306 c22306, C22306 c223062, boolean z, boolean z2) {
        if (!z2) {
            return C4248.m12788(this, str, c22306, c223062, z, false);
        }
        int[] iArr = {1};
        boolean m21850 = new C20109(this, str, c22306, c223062, this.f14631, iArr).m21850(new C16015());
        this.f14630 = !m21850;
        if (m21850) {
            return iArr[0];
        }
        return 1;
    }

    @Override // l.InterfaceC17066
    /* renamed from: ᩻ */
    public boolean mo1526() {
        return this.f14630;
    }

    @Override // l.InterfaceC21601
    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int mo13493() {
        return this.f14631;
    }
}
