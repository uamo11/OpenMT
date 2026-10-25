package l;

import java.io.IOException;

/* compiled from: 86JZ */
/* renamed from: l.ۨۛۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11515 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f34378;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f34379;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f34380;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22803 f34381;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f34382;

    public C11515(C22803 c22803, long j) {
        this.f34381 = c22803;
        this.f34379 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28342() {
        C10104 c10104;
        int m50890;
        C12220 c12220;
        C10104 c101042;
        int i;
        C10104 c101043;
        int i2;
        int m508902;
        int m508903;
        C22803 c22803 = this.f34381;
        c10104 = c22803.f73638;
        if (!C10104.m25379(c10104)) {
            this.f34379++;
            m508903 = c22803.m50890();
            return m508903;
        }
        if (this.f34380 == 0) {
            c12220 = c22803.f73636;
            int m29710 = c12220.m29710();
            int i3 = (m29710 & 127) + 1;
            this.f34380 = i3;
            long j = i3;
            c101042 = c22803.f73638;
            i = c101042.f30418;
            c101043 = c22803.f73638;
            i2 = c101043.f30425;
            if (j > (i * i2) - this.f34379) {
                throw new IOException("TGA packet exceeds frame bounds");
            }
            boolean z = (m29710 & 128) != 0;
            this.f34382 = z;
            if (z) {
                m508902 = c22803.m50890();
                this.f34378 = m508902;
            }
        }
        this.f34380--;
        this.f34379++;
        if (this.f34382) {
            return this.f34378;
        }
        m50890 = c22803.m50890();
        return m50890;
    }
}
