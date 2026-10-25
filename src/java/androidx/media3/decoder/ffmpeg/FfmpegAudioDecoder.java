package androidx.media3.decoder.ffmpeg;

import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.decoder.ffmpeg.FfmpegAudioDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import l.AbstractC20432;
import l.AbstractC3498;
import l.C11965;
import l.C17714;
import l.C21843;
import l.C22632;
import l.C3603;
import l.C7731;
import l.C8353;
import l.C8437;
import l.InterfaceC22548;

/* loaded from: classes.dex */
public final class FfmpegAudioDecoder extends AbstractC3498 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f2;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f3;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] f4;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C7731 f5;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f6;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile int f7;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f8;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f10;

    private native int ffmpegDecode(long j, ByteBuffer byteBuffer, int i, SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, ByteBuffer byteBuffer2, int i2);

    private native int ffmpegGetChannelCount(long j);

    private native int ffmpegGetSampleRate(long j);

    private native long ffmpegInitialize(String str, byte[] bArr, boolean z, int i, int i2);

    private native void ffmpegRelease(long j);

    private native long ffmpegReset(long j, byte[] bArr);

    @Override // l.AbstractC3498
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8437 mo11(C21843 c21843, AbstractC20432 abstractC20432, boolean z) {
        SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) abstractC20432;
        if (z) {
            long ffmpegReset = ffmpegReset(this.f6, this.f4);
            this.f6 = ffmpegReset;
            if (ffmpegReset == 0) {
                return new C11965("Error resetting (see logcat).");
            }
            C7731 c7731 = this.f5;
            if (c7731 != null) {
                c7731.m20708();
            }
        }
        ByteBuffer byteBuffer = c21843.f69995;
        String str = C3603.f11424;
        long j = c21843.f69997;
        C7731 c77312 = this.f5;
        if (c77312 != null) {
            byteBuffer = c77312.m20707(j, byteBuffer);
            j = this.f5.m20706(c21843.f69997);
        }
        ByteBuffer byteBuffer2 = byteBuffer;
        int limit = byteBuffer2.limit();
        ByteBuffer m6 = simpleDecoderOutputBuffer.m6(this.f9, j);
        if (this.f5 != null && limit == 0) {
            simpleDecoderOutputBuffer.f65928 = true;
            return null;
        }
        int ffmpegDecode = ffmpegDecode(this.f6, byteBuffer2, limit, simpleDecoderOutputBuffer, m6, this.f9);
        if (ffmpegDecode == -2) {
            return new C11965("Error decoding (see logcat).");
        }
        if (ffmpegDecode == -1) {
            simpleDecoderOutputBuffer.f65928 = true;
            return null;
        }
        if (ffmpegDecode == 0) {
            simpleDecoderOutputBuffer.f65928 = true;
            return null;
        }
        if (!this.f3) {
            this.f7 = ffmpegGetChannelCount(this.f6);
            this.f10 = ffmpegGetSampleRate(this.f6);
            if (this.f10 == 0 && "alac".equals(this.f8)) {
                this.f4.getClass();
                C17714 c17714 = new C17714(this.f4);
                c17714.m41484(this.f4.length - 4);
                this.f10 = c17714.m41492();
            }
            this.f3 = true;
        }
        ByteBuffer byteBuffer3 = simpleDecoderOutputBuffer.f0;
        byteBuffer3.getClass();
        byteBuffer3.position(0);
        byteBuffer3.limit(ffmpegDecode);
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public FfmpegAudioDecoder(int i, C8353 c8353, boolean z) {
        super(new C21843[16], new SimpleDecoderOutputBuffer[16]);
        byte[] bArr;
        byte[] bArr2;
        if (!FfmpegLibrary.m22()) {
            throw new C11965("Failed to load decoder native libraries.");
        }
        String str = c8353.f25614;
        str.getClass();
        String m19 = FfmpegLibrary.m19(c8353);
        m19.getClass();
        this.f8 = m19;
        List list = c8353.f25634;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1003765268:
                if (str.equals("audio/vorbis")) {
                    c = 0;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 1;
                    break;
                }
                break;
            case 1504470054:
                if (str.equals("audio/alac")) {
                    c = 2;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 3;
                    break;
                }
                break;
        }
        C7731 c7731 = null;
        switch (c) {
            case 0:
                byte[] bArr3 = (byte[]) list.get(0);
                byte[] bArr4 = (byte[]) list.get(1);
                bArr = new byte[bArr3.length + bArr4.length + 6];
                bArr[0] = (byte) (bArr3.length >> 8);
                bArr[1] = (byte) (bArr3.length & 255);
                System.arraycopy(bArr3, 0, bArr, 2, bArr3.length);
                bArr[bArr3.length + 2] = 0;
                bArr[bArr3.length + 3] = 0;
                bArr[bArr3.length + 4] = (byte) (bArr4.length >> 8);
                bArr[bArr3.length + 5] = (byte) (bArr4.length & 255);
                System.arraycopy(bArr4, 0, bArr, bArr3.length + 6, bArr4.length);
                break;
            case 1:
            case 3:
                bArr2 = (byte[]) list.get(0);
                bArr = bArr2;
                break;
            case 2:
                byte[] bArr5 = (byte[]) list.get(0);
                int length = bArr5.length + 12;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.putInt(length);
                allocate.putInt(1634492771);
                allocate.putInt(0);
                allocate.put(bArr5, 0, bArr5.length);
                bArr2 = allocate.array();
                bArr = bArr2;
                break;
            default:
                bArr = null;
                break;
        }
        this.f4 = bArr;
        String str2 = c8353.f25606;
        if ("audio/mpeg".equals(str) && ("video/mp4".equals(str2) || "audio/mp4".equals(str2) || "application/mp4".equals(str2))) {
            c7731 = new C7731(FfmpegLibrary.m18());
        }
        this.f5 = c7731;
        this.f2 = z ? 4 : 2;
        this.f9 = z ? 131070 : 65535;
        long ffmpegInitialize = ffmpegInitialize(m19, bArr, z, c8353.f25624, c8353.f25625);
        this.f6 = ffmpegInitialize;
        if (ffmpegInitialize == 0) {
            throw new C11965("Initialization failed.");
        }
        m10680(i);
    }

    @Override // l.InterfaceC1381
    public final String getName() {
        return "ffmpeg" + FfmpegLibrary.m20() + "-" + this.f8;
    }

    @Override // l.AbstractC3498
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21843 mo16() {
        return new C21843(2, FfmpegLibrary.m18());
    }

    @Override // l.AbstractC3498
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC20432 mo15() {
        return new SimpleDecoderOutputBuffer(new InterfaceC22548() { // from class: l.ۤ᩸֫
            @Override // l.InterfaceC22548
            /* renamed from: ֫ */
            public final void mo6995(AbstractC20432 abstractC20432) {
                FfmpegAudioDecoder.this.m10681((AbstractC20432) ((SimpleDecoderOutputBuffer) abstractC20432));
            }
        });
    }

    @Override // l.AbstractC3498
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8437 mo10(Throwable th) {
        return new C11965("Unexpected decode error", th);
    }

    private ByteBuffer growOutputBuffer(SimpleDecoderOutputBuffer simpleDecoderOutputBuffer, int i) {
        this.f9 = i;
        ByteBuffer byteBuffer = simpleDecoderOutputBuffer.f0;
        byteBuffer.getClass();
        C22632.m50631(i >= byteBuffer.limit());
        ByteBuffer order = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        byteBuffer.position(0);
        order.put(byteBuffer);
        order.position(position);
        order.limit(i);
        simpleDecoderOutputBuffer.f0 = order;
        return order;
    }

    @Override // l.AbstractC3498, l.InterfaceC1381
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12() {
        super.mo12();
        ffmpegRelease(this.f6);
        this.f6 = 0L;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m14() {
        return this.f7;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m13() {
        return this.f10;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m17() {
        return this.f2;
    }
}
