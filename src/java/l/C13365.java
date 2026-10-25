package l;

/* compiled from: H5AJ */
/* renamed from: l.۬᩷ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13365 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f39980;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11955[] f39981;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12660 f39982;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f39983;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16040 f39984;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11955[] f39985;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11955 f39986;

    public C13365(C12660 c12660, C20422 c20422, boolean z) {
        int i;
        this.f39982 = c12660;
        i = c12660.f38138;
        C11955[] c11955Arr = new C11955[i];
        this.f39985 = c11955Arr;
        if (z) {
            this.f39981 = c11955Arr;
            c20422.f65885 = c11955Arr;
        } else {
            this.f39981 = c20422.f65885;
        }
        this.f39984 = c20422.f65886;
        this.f39980 = 0;
        this.f39983 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m32378() {
        C12660 c12660 = this.f39982;
        int i = (c12660.f38134[this.f39980 + 3] << 24) | ((c12660.f38134[this.f39980 + 2] & 255) << 16) | ((c12660.f38134[this.f39980 + 1] & 255) << 8);
        byte[] bArr = c12660.f38134;
        int i2 = this.f39980;
        int i3 = (bArr[i2] & 255) | i;
        this.f39980 = i2 + 4;
        return i3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final short m32380() {
        C12660 c12660 = this.f39982;
        int i = (c12660.f38134[this.f39980 + 1] & 255) << 8;
        byte[] bArr = c12660.f38134;
        int i2 = this.f39980;
        short s = (short) ((bArr[i2] & 255) | i);
        this.f39980 = i2 + 2;
        return s;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m32379() {
        long j = (r0.f38134[this.f39980 + 7] << 56) | ((r0.f38134[this.f39980 + 6] & 255) << 48) | ((r0.f38134[this.f39980 + 5] & 255) << 40) | ((r0.f38134[this.f39980 + 4] & 255) << 32) | ((r0.f38134[this.f39980 + 3] & 255) << 24) | ((r0.f38134[this.f39980 + 2] & 255) << 16) | ((r0.f38134[this.f39980 + 1] & 255) << 8);
        byte[] bArr = this.f39982.f38134;
        long j2 = j | (bArr[r3] & 255);
        this.f39980 = this.f39980 + 8;
        return j2;
    }
}
