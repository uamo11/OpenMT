package l;

/* compiled from: 77W6 */
/* renamed from: l.᩶ۘۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C19917 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20622 f64352 = new C23443();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f64353;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f64354;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f64355;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f64356;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f64357;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f64358;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f64359;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C7921 f64360;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15681 f64361;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f64362;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f64363;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45836() {
        C15681 c15681 = this.f64361;
        int i = c15681.f48300;
        int i2 = this.f64359;
        if (i > i2) {
            i = i2;
        }
        if (i == 0) {
            return;
        }
        byte[] bArr = c15681.f48298;
        int length = bArr.length;
        int i3 = c15681.f48283;
        if (length > i3) {
            byte[] bArr2 = this.f64362;
            if (bArr2.length > this.f64355 && bArr.length >= i3 + i) {
                int length2 = bArr2.length;
            }
        }
        System.arraycopy(bArr, i3, this.f64362, this.f64355, i);
        this.f64355 += i;
        C15681 c156812 = this.f64361;
        c156812.f48283 += i;
        this.f64358 += i;
        this.f64359 -= i;
        int i4 = c156812.f48300 - i;
        c156812.f48300 = i4;
        if (i4 == 0) {
            c156812.f48283 = 0;
        }
    }
}
