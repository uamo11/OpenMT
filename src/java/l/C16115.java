package l;

/* compiled from: A8CT */
/* renamed from: l.ܺᩴۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C16115 extends C21761 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C6944[] f49658;

    public C16115(int i, String str, double d) {
        super(str);
        mo21955(i, d);
    }

    /* renamed from: ֫ */
    public void mo21955(int i, double d) {
        this.f49658 = new C6944[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f49658[i2] = new C6944(this, d);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final double[] m38021() {
        return this.f49658[0].mo18767();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double[] m38020(int i) {
        return this.f49658[i].mo18767();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m38022() {
        this.f49658[0].m18761();
    }
}
