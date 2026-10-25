package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: W1P7 */
/* renamed from: l.ܽܺۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16742 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f51387;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f51389;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f51390;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f51391;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f51393;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Bitmap f51394;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f51395;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f51397;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f51388 = -1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C11099 f51396 = new C11099();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f51392 = Integer.MIN_VALUE;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f51389 - ((C16742) obj).f51389;
        if (j == 0) {
            return 0;
        }
        return j > 0 ? -1 : 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16742 m39383(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ (i ^ length));
        }
        C12951 m31486 = C12951.m31486(bArr);
        C16742 c16742 = new C16742();
        c16742.f51390 = m31486.m31506();
        c16742.f51391 = m31486.m31506();
        c16742.f51395 = m31486.m31506();
        c16742.f51393 = m31486.m31506();
        c16742.f51397 = m31486.m31506();
        c16742.f51387 = m31486.m31506();
        byte[] m31496 = m31486.m31496();
        c16742.f51394 = BitmapFactory.decodeByteArray(m31496, 0, m31496.length);
        c16742.f51389 = m31486.readLong();
        c16742.f51396.m27533(m31486.m31506());
        return c16742;
    }
}
