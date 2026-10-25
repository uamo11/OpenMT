package l;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: C8IJ */
/* renamed from: l.۬ۚ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12899 {
    /* JADX WARN: Removed duplicated region for block: B:70:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02dd A[LOOP:0: B:78:0x02ae->B:80:0x02dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0285  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C8353 m31336(android.media.MediaFormat r13) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12899.m31336(android.media.MediaFormat):l.۠ᩴ֫");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31338(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(C19370.m44628(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31337(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31339(MediaFormat mediaFormat, C21054 c21054) {
        if (c21054 != null) {
            m31337(mediaFormat, "color-transfer", c21054.f67919);
            m31337(mediaFormat, "color-standard", c21054.f67917);
            m31337(mediaFormat, "color-range", c21054.f67915);
            byte[] bArr = c21054.f67916;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }
}
