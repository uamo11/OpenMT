package l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* compiled from: T7B2 */
/* renamed from: l.ۘ֡ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3589 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f11383;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f11384;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f11385;

    public C3589(InetAddress inetAddress, int i) {
        int m44052;
        int max = Math.max(0, Math.min(32, i));
        this.f11385 = max;
        int i2 = max != 0 ? (int) (4294967295 << (32 - max)) : 0;
        this.f11383 = i2;
        m44052 = C19112.m44052(inetAddress);
        this.f11384 = m44052 & i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10985(InetAddress inetAddress) {
        int m44052;
        if (!(inetAddress instanceof Inet4Address)) {
            return false;
        }
        m44052 = C19112.m44052(inetAddress);
        return (m44052 & this.f11383) == this.f11384;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InetAddress m10984() {
        int i = this.f11385;
        if (i == 0 || i >= 31) {
            return null;
        }
        int i2 = (~this.f11383) | this.f11384;
        int i3 = C19112.f60206;
        try {
            return InetAddress.getByAddress(new byte[]{(byte) ((i2 >> 24) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 8) & 255), (byte) (i2 & 255)});
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
