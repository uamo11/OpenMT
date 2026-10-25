package l;

import java.util.Arrays;

/* compiled from: KAZI */
/* renamed from: l.ۖᩳᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2701 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f8442;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15357 f8443;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC15357 f8444;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16000 f8445;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f8446;

    public C2701(C16000 c16000, AbstractC15357 abstractC15357, AbstractC15357 abstractC153572, byte[] bArr, int i) {
        this.f8445 = c16000;
        this.f8443 = abstractC15357;
        this.f8444 = abstractC153572;
        this.f8446 = bArr;
        this.f8442 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2701)) {
            return false;
        }
        C2701 c2701 = (C2701) obj;
        return this.f8445.equals(c2701.f8445) && this.f8443 == c2701.f8443 && this.f8444 == c2701.f8444 && Arrays.equals(this.f8446, c2701.f8446) && this.f8442 == c2701.f8442;
    }
}
