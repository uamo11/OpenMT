package l;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: M8RW */
/* renamed from: l.۠۟֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8023 implements InterfaceC0967 {
    @Override // l.InterfaceC0967
    /* renamed from: ֫ */
    public final boolean mo3417(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // l.InterfaceC0967
    /* renamed from: ۧ */
    public final boolean mo3419() {
        return false;
    }

    @Override // l.InterfaceC0967
    /* renamed from: ֫ */
    public final int mo3415() {
        return MediaCodecList.getCodecCount();
    }

    @Override // l.InterfaceC0967
    /* renamed from: ֫ */
    public final MediaCodecInfo mo3416(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // l.InterfaceC0967
    /* renamed from: ֫ */
    public final boolean mo3418(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
