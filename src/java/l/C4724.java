package l;

import android.graphics.Bitmap;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: A75O */
/* renamed from: l.ۙܶۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4724 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f14974;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13190 f14976;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f14977;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f14978;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f14979;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f14981;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f14982;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f14983;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f14984;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public MediaFormat f14985;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f14986;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaCodec f14988;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f14989;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f14990;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f14991;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f14992;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f14993;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8353 f14994;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17777 f14995;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final MediaCodec.BufferInfo f14975 = new MediaCodec.BufferInfo();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f14980 = -9223372036854775807L;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f14987 = -9223372036854775807L;

    public C4724(C13190 c13190, C17777 c17777, MediaCodec mediaCodec, String str, MediaFormat mediaFormat, C8353 c8353, int i, int i2, boolean z, boolean z2) {
        this.f14976 = c13190;
        this.f14995 = c17777;
        this.f14988 = mediaCodec;
        this.f14990 = str;
        this.f14985 = mediaFormat;
        this.f14994 = c8353;
        this.f14981 = i;
        this.f14979 = i2;
        this.f14984 = z;
        this.f14978 = z2 ? 1000 : 250;
        this.f14989 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4724 m13824(C12053 c12053, C13190 c13190, int i, int i2, boolean z, boolean z2, String str, InterfaceC19899 interfaceC19899) {
        String name;
        int i3;
        interfaceC19899.mo21195();
        C17777 c17777 = new C17777(new C16895(), new C6135(c12053, interfaceC19899));
        MediaCodec mediaCodec = null;
        boolean z3 = false;
        try {
            c17777.m41649(C23068.f74197);
            interfaceC19899.mo21195();
            int i4 = 0;
            while (true) {
                if (i4 >= c17777.m41654()) {
                    i4 = -1;
                    break;
                }
                String string = c17777.m41647(i4).getString("mime");
                if (string != null && C9786.m24801(string)) {
                    break;
                }
                i4++;
            }
            if (i4 < 0) {
                throw new IOException("Missing MPEG-TS video track");
            }
            MediaFormat m41647 = c17777.m41647(i4);
            C8353 m31336 = C12899.m31336(m41647);
            String str2 = m31336.f25614;
            if (str2 == null || !C9786.m24801(str2)) {
                throw new IOException("Unsupported MPEG-TS video format");
            }
            m13827(m41647);
            c17777.m41651(i4);
            m41647.setInteger("color-format", 2135033992);
            int i5 = m31336.f25633;
            m41647.setInteger("max-input-size", (int) Math.min(X931RNG.BLOCK128_RESEED_MAX, Math.max(2097152L, (i5 <= 0 || (i3 = m31336.f25609) <= 0) ? 0L : (i5 * i3) / 2)));
            MediaCodec m13822 = m13822(m31336, m41647, z2, str, interfaceC19899);
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    name = m13822.getCanonicalName();
                } else {
                    name = m13822.getName();
                }
                return new C4724(c13190, c17777, m13822, name, m41647, m31336, i, i2, z, m13830(m13822, str2));
            } catch (IOException | RuntimeException e) {
                e = e;
                z3 = true;
                mediaCodec = m13822;
                C23068.m51228(mediaCodec, z3);
                c17777.m41653();
                if (e instanceof IOException) {
                    throw ((IOException) e);
                }
                throw new IOException("Failed to initialize MPEG-TS preview decoder", e);
            }
        } catch (IOException e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13830(MediaCodec mediaCodec, String str) {
        String name;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return mediaCodec.getCodecInfo().isSoftwareOnly();
        }
        if (i >= 29) {
            name = mediaCodec.getCanonicalName();
        } else {
            name = mediaCodec.getName();
        }
        try {
            for (C17195 c17195 : C22134.m49731(str, false, false)) {
                if (c17195.f52721.equals(name)) {
                    return c17195.f52719;
                }
            }
        } catch (C5201 unused) {
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MediaCodec m13822(C8353 c8353, MediaFormat mediaFormat, boolean z, String str, InterfaceC19899 interfaceC19899) {
        Throwable e;
        MediaCodec mediaCodec;
        MediaCodec createDecoderByType;
        String str2 = c8353.f25614;
        if (str2 == null) {
            throw new IOException("Missing MPEG-TS video MIME type");
        }
        MediaCodec mediaCodec2 = null;
        if (!z) {
            interfaceC19899.mo21195();
            try {
                createDecoderByType = MediaCodec.createDecoderByType(str2);
            } catch (IOException e2) {
                e = e2;
            } catch (RuntimeException e3) {
                e = e3;
            }
            try {
                m13832(createDecoderByType, str2);
                createDecoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                createDecoderByType.start();
                return createDecoderByType;
            } catch (IOException | RuntimeException e4) {
                e = e4;
                mediaCodec2 = createDecoderByType;
                C23068.m51228(mediaCodec2, false);
                throw new C22363("Failed to initialize MPEG-TS preview decoder", e);
            }
        }
        try {
            Throwable th = null;
            for (C17195 c17195 : C22134.m49731(str2, false, false)) {
                boolean z2 = c17195.f52719;
                String str3 = c17195.f52721;
                if (z2 && !str3.equals(str)) {
                    try {
                        interfaceC19899.mo21195();
                        if (c17195.m40454(c8353)) {
                            mediaCodec = MediaCodec.createByCodecName(str3);
                            try {
                                m13832(mediaCodec, str2);
                                mediaCodec.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 0);
                                mediaCodec.start();
                                return mediaCodec;
                            } catch (InterruptedIOException e5) {
                                e = e5;
                                mediaCodec2 = mediaCodec;
                                C23068.m51228(mediaCodec2, false);
                                throw e;
                            } catch (IOException e6) {
                                e = e6;
                                C23068.m51228(mediaCodec, false);
                                th = e;
                            } catch (RuntimeException e7) {
                                e = e7;
                                C23068.m51228(mediaCodec, false);
                                th = e;
                            } catch (C5201 e8) {
                                e = e8;
                                C23068.m51228(mediaCodec, false);
                                th = e;
                            }
                        }
                    } catch (InterruptedIOException e9) {
                        e = e9;
                    } catch (IOException e10) {
                        e = e10;
                        e = e;
                        mediaCodec = null;
                        C23068.m51228(mediaCodec, false);
                        th = e;
                    } catch (RuntimeException e11) {
                        e = e11;
                        e = e;
                        mediaCodec = null;
                        C23068.m51228(mediaCodec, false);
                        th = e;
                    } catch (C5201 e12) {
                        e = e12;
                        e = e;
                        mediaCodec = null;
                        C23068.m51228(mediaCodec, false);
                        th = e;
                    }
                }
            }
            if (th != null) {
                throw new C22363("Failed to initialize software MPEG-TS preview decoder", th);
            }
            throw new IOException("Missing software MPEG-TS preview decoder");
        } catch (C5201 e13) {
            throw new IOException("Failed to query software video decoders", e13);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13832(MediaCodec mediaCodec, String str) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        for (int i : mediaCodec.getCodecInfo().getCapabilitiesForType(str).colorFormats) {
            if (i == 2135033992) {
                return;
            }
        }
        throw new IOException("Decoder does not expose flexible YUV output");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13827(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT < 24 || !mediaFormat.containsKey("color-transfer")) {
            return;
        }
        int integer = mediaFormat.getInteger("color-transfer");
        if (integer == 6 || integer == 7) {
            throw new IOException("HDR MPEG-TS preview is unsupported");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13831(C4724 c4724, int i, int i2) {
        return c4724.f14981 == i && c4724.f14979 == i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13828(C4724 c4724, long j, InterfaceC19899 interfaceC19899) {
        boolean z;
        C12485 c12485 = new C12485(c4724.f14981, c4724.f14979, j);
        while (c4724.f14976.m32015(c12485) == null && !c4724.f14992) {
            interfaceC19899.mo21195();
            boolean m13829 = c4724.m13829(j, 0L, interfaceC19899);
            if (!c4724.f14983) {
                C17777 c17777 = c4724.f14995;
                MediaCodec mediaCodec = c4724.f14988;
                int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(2000L);
                if (dequeueInputBuffer < 0) {
                    z = false;
                } else {
                    interfaceC19899.mo21195();
                    long m41652 = c17777.m41652();
                    if (m41652 < 0) {
                        c4724.m13825(dequeueInputBuffer, false);
                    } else if (c4724.f14982 >= 1200) {
                        c4724.m13825(dequeueInputBuffer, true);
                    } else {
                        if (c4724.f14980 == -9223372036854775807L) {
                            c4724.f14980 = m41652;
                        }
                        long max = Math.max(0L, m41652 - c4724.f14980);
                        if (max > 10000000) {
                            c4724.m13825(dequeueInputBuffer, true);
                        } else {
                            ByteBuffer inputBuffer = mediaCodec.getInputBuffer(dequeueInputBuffer);
                            if (inputBuffer == null) {
                                throw new IOException("Missing MPEG-TS decoder input buffer");
                            }
                            inputBuffer.clear();
                            try {
                                int m41646 = c17777.m41646(inputBuffer);
                                if (m41646 < 0) {
                                    c4724.m13825(dequeueInputBuffer, false);
                                } else {
                                    c4724.f14988.queueInputBuffer(dequeueInputBuffer, 0, m41646, max, (c17777.m41650() & 1) != 0 ? 1 : 0);
                                    c4724.f14977 = max;
                                    c4724.f14982++;
                                    c17777.m41648();
                                }
                            } catch (RuntimeException e) {
                                throw new IOException("MPEG-TS access unit exceeds codec input buffer", e);
                            }
                        }
                    }
                    z = true;
                }
                m13829 |= z;
            }
            if (c4724.m13829(j, 2000L, interfaceC19899) | m13829) {
                c4724.f14986 = 0;
            } else {
                int i = c4724.f14986 + 1;
                c4724.f14986 = i;
                if (i >= c4724.f14978) {
                    throw new C3313("MPEG-TS preview decoder timed out: input=" + c4724.f14982 + ", inputEnded=" + c4724.f14983 + ", output=" + c4724.f14974 + ", lastOutputUs=" + c4724.f14987 + ", nextBucket=" + c4724.f14991);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13825(int i, boolean z) {
        this.f14988.queueInputBuffer(i, 0, 0, this.f14977, 4);
        this.f14993 = z;
        this.f14983 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m13829(long j, long j2, InterfaceC19899 interfaceC19899) {
        MediaCodec mediaCodec = this.f14988;
        MediaCodec.BufferInfo bufferInfo = this.f14975;
        int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j2);
        if (dequeueOutputBuffer == -1) {
            return false;
        }
        if (dequeueOutputBuffer == -2) {
            try {
                this.f14985 = mediaCodec.getOutputFormat();
                return true;
            } catch (RuntimeException e) {
                throw new C20247("Failed to read MPEG-TS decoder output format", e);
            }
        }
        if (dequeueOutputBuffer < 0) {
            return true;
        }
        try {
            interfaceC19899.mo21195();
            if ((bufferInfo.flags & 2) == 0 && bufferInfo.size > 0) {
                long min = Math.min(j, Math.max(0L, bufferInfo.presentationTimeUs) / 1000000);
                if (this.f14991 <= min) {
                    try {
                        Image outputImage = mediaCodec.getOutputImage(dequeueOutputBuffer);
                        if (outputImage == null) {
                            throw new C20247("Decoder did not expose an output image");
                        }
                        m13826(outputImage, min);
                    } catch (RuntimeException e2) {
                        throw new C20247("Failed to obtain MPEG-TS decoder output image", e2);
                    }
                }
                this.f14974++;
                this.f14987 = bufferInfo.presentationTimeUs;
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.f14992 = true;
            }
            return true;
        } finally {
            mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13826(Image image, long j) {
        try {
            Bitmap m51225 = C23068.m51225(image, this.f14981, this.f14979, this.f14994, this.f14984, this.f14985);
            while (true) {
                long j2 = this.f14991;
                if (j2 > j) {
                    return;
                }
                C12485 c12485 = new C12485(this.f14981, this.f14979, j2);
                C13190 c13190 = this.f14976;
                if (c13190.m32015(c12485) == null) {
                    c13190.m32017(c12485, m51225);
                }
                this.f14991++;
            }
        } catch (IOException | RuntimeException e) {
            throw new C20247("Unsupported MPEG-TS decoder output image", e);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m13834(C4724 c4724) {
        C23068.m51228(c4724.f14988, c4724.f14989);
        c4724.f14989 = false;
        c4724.f14995.m41653();
    }
}
