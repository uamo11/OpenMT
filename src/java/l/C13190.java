package l;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: A75O */
/* renamed from: l.۬ܶۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13190 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f39449 = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f39450 = Math.max(1L, X931RNG.BLOCK128_RESEED_MAX);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f39451;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m32015(C12485 c12485) {
        return (Bitmap) this.f39449.get(c12485);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32017(C12485 c12485, Bitmap bitmap) {
        LinkedHashMap linkedHashMap = this.f39449;
        if (((Bitmap) linkedHashMap.put(c12485, bitmap)) != null) {
            this.f39451 -= Math.max(1, r7.getAllocationByteCount());
        }
        this.f39451 += Math.max(1, bitmap.getAllocationByteCount());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (this.f39451 > this.f39450 && it.hasNext()) {
            this.f39451 -= Math.max(1, ((Bitmap) ((Map.Entry) it.next()).getValue()).getAllocationByteCount());
            it.remove();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap m32014(int i, int i2, long j) {
        int i3;
        int i4;
        long j2;
        long j3;
        long j4;
        LinkedHashMap linkedHashMap = this.f39449;
        long j5 = C13132.FOREVER_NS;
        C12485 c12485 = null;
        for (C12485 c124852 : linkedHashMap.keySet()) {
            i3 = c124852.f37516;
            if (i3 == i) {
                i4 = c124852.f37515;
                if (i4 == i2) {
                    j2 = c124852.f37514;
                    long abs = Math.abs(j2 - j);
                    if (abs >= j5) {
                        if (abs == j5 && c12485 != null) {
                            j3 = c124852.f37514;
                            j4 = c12485.f37514;
                            if (j3 < j4) {
                            }
                        }
                    }
                    c12485 = c124852;
                    j5 = abs;
                }
            }
        }
        if (c12485 == null) {
            return null;
        }
        return (Bitmap) linkedHashMap.get(c12485);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32016() {
        this.f39449.clear();
        this.f39451 = 0L;
    }
}
