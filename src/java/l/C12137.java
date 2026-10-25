package l;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import java.io.Closeable;

/* compiled from: M799 */
/* renamed from: l.۫ۗۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12137 implements InterfaceC12842 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Closeable f36239;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final MediaMetadataRetriever f36240;

    @Override // l.InterfaceC12842
    /* renamed from: ۧ */
    public final /* synthetic */ boolean mo9070() {
        return false;
    }

    @Override // l.InterfaceC12842
    /* renamed from: ܽ */
    public final /* synthetic */ void mo9071() {
    }

    @Override // l.InterfaceC12842
    /* renamed from: ֫ */
    public final Bitmap mo9068(long j, int i, int i2, InterfaceC19899 interfaceC19899) {
        interfaceC19899.mo21195();
        return m29565(this.f36240, j, i, i2);
    }

    public C12137(MediaMetadataRetriever mediaMetadataRetriever, Closeable closeable) {
        this.f36240 = mediaMetadataRetriever;
        this.f36239 = closeable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.InterfaceC12842 m29563(android.content.Context r6, l.C12053 r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            l.ۗۗۜ r0 = l.C2965.m9066(r7)     // Catch: java.io.IOException -> Ld
            if (r0 == 0) goto Ld
            return r0
        Ld:
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r2 = 0
            boolean r3 = r7.m29439()     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = "Unsupported video preview data source"
            if (r3 == 0) goto L5b
            l.ܶ᩵ܿ r7 = r7.m29431()     // Catch: java.lang.Throwable -> Lb0
            if (r7 == 0) goto L53
            boolean r3 = r7.m36488()     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L2f
            java.lang.String r6 = r7.mo23544()     // Catch: java.lang.Throwable -> Lb0
            r0.setDataSource(r6)     // Catch: java.lang.Throwable -> Lb0
            goto L97
        L2f:
            boolean r3 = r7.mo31568()     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L3d
            android.net.Uri r7 = r7.mo31567()     // Catch: java.lang.Throwable -> Lb0
            r0.setDataSource(r6, r7)     // Catch: java.lang.Throwable -> Lb0
            goto L97
        L3d:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb0
            if (r6 < r1) goto L4d
            l.᩺ۢۡ r6 = new l.᩺ۢۡ     // Catch: java.lang.Throwable -> Lb0
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb0
            r0.setDataSource(r6)     // Catch: java.lang.Throwable -> L4b
            r2 = r6
            goto L97
        L4b:
            r7 = move-exception
            goto Lb3
        L4d:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb0
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lb0
            throw r6     // Catch: java.lang.Throwable -> Lb0
        L53:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = "Missing local preview file"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb0
            throw r6     // Catch: java.lang.Throwable -> Lb0
        L5b:
            boolean r6 = r7.m29436()     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto L7b
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb0
            if (r6 < r1) goto L7b
            l.᩺֡ۜ r6 = r7.m29434()     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto L73
            l.ܰ֡ۜ r2 = r6.m50640()     // Catch: java.lang.Throwable -> Lb0
            r2.m32483(r0)     // Catch: java.lang.Throwable -> Lb0
            goto L97
        L73:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = "Missing network preview descriptor"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb0
            throw r6     // Catch: java.lang.Throwable -> Lb0
        L7b:
            boolean r6 = r7.m29441()     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto Laa
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb0
            if (r6 < r1) goto Laa
            l.۟ܰۜ r6 = r7.m29433()     // Catch: java.lang.Throwable -> Lb0
            if (r6 == 0) goto La2
            l.ۛ᩶ۜ r7 = new l.ۛ᩶ۜ     // Catch: java.lang.Throwable -> Lb0
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lb0
            r0.setDataSource(r7)     // Catch: java.lang.Throwable -> L9d
            r7.m17327()     // Catch: java.lang.Throwable -> L9d
            r2 = r7
        L97:
            l.۫ۗۜ r6 = new l.۫ۗۜ     // Catch: java.lang.Throwable -> Lb0
            r6.<init>(r0, r2)     // Catch: java.lang.Throwable -> Lb0
            return r6
        L9d:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
            goto Lb3
        La2:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r7 = "Missing paged preview handle"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lb0
            throw r6     // Catch: java.lang.Throwable -> Lb0
        Laa:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb0
            r6.<init>(r4)     // Catch: java.lang.Throwable -> Lb0
            throw r6     // Catch: java.lang.Throwable -> Lb0
        Lb0:
            r6 = move-exception
            r7 = r6
            r6 = r2
        Lb3:
            r0.release()     // Catch: java.lang.Throwable -> Lb7
            goto Lb8
        Lb7:
        Lb8:
            l.C0349.m1793(r6)
            boolean r6 = r7 instanceof java.io.IOException
            if (r6 == 0) goto Lc2
            java.io.IOException r7 = (java.io.IOException) r7
            throw r7
        Lc2:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "Failed to open video preview data source"
            r6.<init>(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12137.m29563(android.content.Context, l.۫֡ۜ):l.۬ۗۜ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m29565(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            return mediaMetadataRetriever.getScaledFrameAtTime(j, 2, Math.max(1, i), Math.max(1, i2));
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(j, 2);
        if (frameAtTime == null) {
            return null;
        }
        int max = Math.max(1, i);
        int max2 = Math.max(1, i2);
        if (frameAtTime.getWidth() <= max && frameAtTime.getHeight() <= max2) {
            return frameAtTime;
        }
        float min = Math.min(max / frameAtTime.getWidth(), max2 / frameAtTime.getHeight());
        return Bitmap.createScaledBitmap(frameAtTime, Math.max(1, Math.round(frameAtTime.getWidth() * min)), Math.max(1, Math.round(frameAtTime.getHeight() * min)), true);
    }

    @Override // l.InterfaceC12842
    /* renamed from: ᩳ */
    public final C13547 mo9072() {
        return m29566(this.f36240);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13547 m29566(android.media.MediaMetadataRetriever r4) {
        /*
            r0 = 18
            java.lang.String r0 = r4.extractMetadata(r0)
            r1 = 0
            if (r0 == 0) goto L15
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L10
            goto L15
        L10:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L16
        L15:
            r0 = 0
        L16:
            int r0 = java.lang.Math.max(r1, r0)
            r2 = 19
            java.lang.String r2 = r4.extractMetadata(r2)
            if (r2 == 0) goto L2e
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L29
            goto L2e
        L29:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            int r2 = java.lang.Math.max(r1, r2)
            r3 = 24
            java.lang.String r4 = r4.extractMetadata(r3)
            if (r4 == 0) goto L46
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L42
            goto L46
        L42:
            int r1 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> L46
        L46:
            r4 = 1065353216(0x3f800000, float:1.0)
            l.ܰۗۜ r4 = l.C1841.m6125(r0, r2, r1, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12137.m29566(android.media.MediaMetadataRetriever):l.ܰۗۜ");
    }

    @Override // l.InterfaceC12842
    /* renamed from: ֫ */
    public final void mo9069() {
        try {
            this.f36240.release();
        } catch (Throwable unused) {
        }
        C0349.m1793(this.f36239);
    }
}
