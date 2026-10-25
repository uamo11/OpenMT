package l;

import android.os.Handler;
import android.os.Trace;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import androidx.media3.decoder.ffmpeg.FfmpegLibrary;

/* compiled from: O8F6 */
/* renamed from: l.ۛ᩸֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6320 extends AbstractC13810 {
    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "FfmpegAudioRenderer";
    }

    @Override // l.AbstractC4930, l.InterfaceC18065
    /* renamed from: ᩵ */
    public final int mo14368() {
        return 8;
    }

    @Override // l.AbstractC13810
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1381 mo17568(C8353 c8353) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i = c8353.f25601;
        int i2 = c8353.f25624;
        int i3 = c8353.f25625;
        if (i == -1) {
            i = 5760;
        }
        boolean z = true;
        if (m33142(C3603.m11049(2, i3, i2))) {
            z = m33141(C3603.m11049(4, i3, i2)) != 2 ? false : true ^ "audio/ac3".equals(c8353.f25614);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i, c8353, z);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    @Override // l.AbstractC13810
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8353 mo17567(InterfaceC1381 interfaceC1381) {
        FfmpegAudioDecoder ffmpegAudioDecoder = (FfmpegAudioDecoder) interfaceC1381;
        ffmpegAudioDecoder.getClass();
        C1297 c1297 = new C1297();
        c1297.m4465("audio/raw");
        c1297.m4472(ffmpegAudioDecoder.m14());
        c1297.m4456(ffmpegAudioDecoder.m13());
        c1297.m4475(ffmpegAudioDecoder.m17());
        return c1297.m4440();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C6320() {
        /*
            r3 = this;
            r0 = 0
            l.֡֡֫[] r0 = new l.InterfaceC0053[r0]
            l.᩷ۤ֫ r1 = new l.᩷ۤ֫
            android.app.Application r2 = l.C4925.m14335()
            r1.<init>(r2)
            r1.m47623(r0)
            l.۠ۤ֫ r0 = r1.m47622()
            r1 = 0
            r3.<init>(r1, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6320.<init>():void");
    }

    public C6320(Handler handler, InterfaceC5345 interfaceC5345, InterfaceC4639 interfaceC4639) {
        super(handler, interfaceC5345, interfaceC4639);
    }

    @Override // l.AbstractC13810
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int mo17569(C8353 c8353) {
        String str = c8353.f25614;
        int i = c8353.f25624;
        int i2 = c8353.f25625;
        str.getClass();
        if (!FfmpegLibrary.m22() || !C9786.m24810(str)) {
            return 0;
        }
        if (!FfmpegLibrary.m21(c8353)) {
            return 1;
        }
        if (m33142(C3603.m11049(2, i2, i)) || m33142(C3603.m11049(4, i2, i))) {
            return c8353.f25632 != 0 ? 2 : 4;
        }
        return 1;
    }
}
