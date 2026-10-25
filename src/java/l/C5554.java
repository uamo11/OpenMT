package l;

import java.util.Random;

/* compiled from: 48BN */
/* renamed from: l.ۚ᩵ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5554 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f17178 = new Random().nextInt();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m15709() {
        this.f17178 = (this.f17178 * 6364136223846793005L) + 1442695040888963407L;
        return ((int) (r0 >> 32)) * 4.656612873077393E-10d;
    }
}
