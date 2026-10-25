package l;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import java.io.IOException;

/* compiled from: R8QD */
/* renamed from: l.ۙ۟֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4495 implements InterfaceC13850 {
    @Override // l.InterfaceC13850
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10846 mo13243(C23023 c23023) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = m13242(c23023);
            Trace.beginSection("configureCodec");
            Surface surface = c23023.f74103;
            mediaCodec.configure(c23023.f74105, surface, c23023.f74102, (surface == null && c23023.f74101.f52728 && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodec.start();
            Trace.endSection();
            return new C3084(mediaCodec, c23023.f74106);
        } catch (IOException | RuntimeException e) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static MediaCodec m13242(C23023 c23023) {
        String str = c23023.f74101.f52721;
        Trace.beginSection("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return createByCodecName;
    }
}
