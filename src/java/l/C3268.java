package l;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: X8N9 */
/* renamed from: l.ۗܰ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3268 extends MediaCodec.Callback {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f10288;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public MediaFormat f10289;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public IllegalStateException f10290;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public MediaCodec.CodecException f10291;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public MediaCodec.CryptoException f10292;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC7501 f10295;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public MediaFormat f10297;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HandlerThread f10298;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f10299;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Handler f10301;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f10300 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19661 f10287 = new C19661();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19661 f10293 = new C19661();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f10296 = new ArrayDeque();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f10294 = new ArrayDeque();

    public C3268(HandlerThread handlerThread) {
        this.f10298 = handlerThread;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10071(MediaCodec mediaCodec) {
        C22632.m50634(this.f10301 == null);
        HandlerThread handlerThread = this.f10298;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f10301 = handler;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10075() {
        synchronized (this.f10300) {
            this.f10299 = true;
            this.f10298.quit();
            m10068();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[Catch: all -> 0x003f, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0025, B:24:0x0034, B:26:0x002e, B:28:0x0036, B:29:0x0038, B:30:0x0039, B:31:0x003b, B:32:0x003c, B:33:0x003e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0025 A[Catch: all -> 0x003f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0025, B:24:0x0034, B:26:0x002e, B:28:0x0036, B:29:0x0038, B:30:0x0039, B:31:0x003b, B:32:0x003c, B:33:0x003e), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m10069() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f10300
            monitor-enter(r0)
            java.lang.IllegalStateException r1 = r6.f10290     // Catch: java.lang.Throwable -> L3f
            r2 = 0
            if (r1 != 0) goto L3c
            android.media.MediaCodec$CodecException r1 = r6.f10291     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L39
            android.media.MediaCodec$CryptoException r1 = r6.f10292     // Catch: java.lang.Throwable -> L3f
            if (r1 != 0) goto L36
            long r1 = r6.f10288     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L1f
            boolean r1 = r6.f10299     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            goto L20
        L1f:
            r1 = 1
        L20:
            r2 = -1
            if (r1 == 0) goto L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r2
        L25:
            l.᩵᩵ r1 = r6.f10287     // Catch: java.lang.Throwable -> L3f
            boolean r1 = r1.m45197()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L2e
            goto L34
        L2e:
            l.᩵᩵ r1 = r6.f10287     // Catch: java.lang.Throwable -> L3f
            int r2 = r1.m45198()     // Catch: java.lang.Throwable -> L3f
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return r2
        L36:
            r6.f10292 = r2     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3f
        L39:
            r6.f10291 = r2     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3f
        L3c:
            r6.f10290 = r2     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L3f
        L3f:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3268.m10069():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0023 A[Catch: all -> 0x0069, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0025, B:23:0x002d, B:25:0x002f, B:27:0x0037, B:28:0x005e, B:32:0x0054, B:34:0x0060, B:35:0x0062, B:36:0x0063, B:37:0x0065, B:38:0x0066, B:39:0x0068), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0025 A[Catch: all -> 0x0069, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0018, B:18:0x0023, B:21:0x0025, B:23:0x002d, B:25:0x002f, B:27:0x0037, B:28:0x005e, B:32:0x0054, B:34:0x0060, B:35:0x0062, B:36:0x0063, B:37:0x0065, B:38:0x0066, B:39:0x0068), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m10070(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f10300
            monitor-enter(r0)
            java.lang.IllegalStateException r1 = r9.f10290     // Catch: java.lang.Throwable -> L69
            r2 = 0
            if (r1 != 0) goto L66
            android.media.MediaCodec$CodecException r1 = r9.f10291     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L63
            android.media.MediaCodec$CryptoException r1 = r9.f10292     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L60
            long r1 = r9.f10288     // Catch: java.lang.Throwable -> L69
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L1f
            boolean r1 = r9.f10299     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L1d
            goto L1f
        L1d:
            r1 = 0
            goto L20
        L1f:
            r1 = 1
        L20:
            r2 = -1
            if (r1 == 0) goto L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            return r2
        L25:
            l.᩵᩵ r1 = r9.f10293     // Catch: java.lang.Throwable -> L69
            boolean r1 = r1.m45197()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            return r2
        L2f:
            l.᩵᩵ r1 = r9.f10293     // Catch: java.lang.Throwable -> L69
            int r1 = r1.m45198()     // Catch: java.lang.Throwable -> L69
            if (r1 < 0) goto L51
            android.media.MediaFormat r2 = r9.f10297     // Catch: java.lang.Throwable -> L69
            l.C22632.m50632(r2)     // Catch: java.lang.Throwable -> L69
            java.util.ArrayDeque r2 = r9.f10296     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = r2.remove()     // Catch: java.lang.Throwable -> L69
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch: java.lang.Throwable -> L69
            int r4 = r2.offset     // Catch: java.lang.Throwable -> L69
            int r5 = r2.size     // Catch: java.lang.Throwable -> L69
            long r6 = r2.presentationTimeUs     // Catch: java.lang.Throwable -> L69
            int r8 = r2.flags     // Catch: java.lang.Throwable -> L69
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L69
            goto L5e
        L51:
            r10 = -2
            if (r1 != r10) goto L5e
            java.util.ArrayDeque r10 = r9.f10294     // Catch: java.lang.Throwable -> L69
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L69
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L69
            r9.f10297 = r10     // Catch: java.lang.Throwable -> L69
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            return r1
        L60:
            r9.f10292 = r2     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L69
        L63:
            r9.f10291 = r2     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L69
        L66:
            r9.f10290 = r2     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L69
        L69:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3268.m10070(android.media.MediaCodec$BufferInfo):int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaFormat m10074() {
        MediaFormat mediaFormat;
        synchronized (this.f10300) {
            mediaFormat = this.f10297;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10073() {
        synchronized (this.f10300) {
            this.f10288++;
            Handler handler = this.f10301;
            String str = C3603.f11424;
            handler.post(new Runnable() { // from class: l.ۙܰ֫
                @Override // java.lang.Runnable
                public final void run() {
                    C3268.m10067(C3268.this);
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        InterfaceC7194 interfaceC7194;
        InterfaceC7194 interfaceC71942;
        synchronized (this.f10300) {
            this.f10287.m45196(i);
            InterfaceC7501 interfaceC7501 = this.f10295;
            if (interfaceC7501 != null) {
                AbstractC15783 abstractC15783 = ((C9435) interfaceC7501).f28616;
                interfaceC7194 = abstractC15783.f48685;
                if (interfaceC7194 != null) {
                    interfaceC71942 = abstractC15783.f48685;
                    interfaceC71942.mo1317();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        InterfaceC7194 interfaceC7194;
        InterfaceC7194 interfaceC71942;
        synchronized (this.f10300) {
            MediaFormat mediaFormat = this.f10289;
            if (mediaFormat != null) {
                this.f10293.m45196(-2);
                this.f10294.add(mediaFormat);
                this.f10289 = null;
            }
            this.f10293.m45196(i);
            this.f10296.add(bufferInfo);
            InterfaceC7501 interfaceC7501 = this.f10295;
            if (interfaceC7501 != null) {
                AbstractC15783 abstractC15783 = ((C9435) interfaceC7501).f28616;
                interfaceC7194 = abstractC15783.f48685;
                if (interfaceC7194 != null) {
                    interfaceC71942 = abstractC15783.f48685;
                    interfaceC71942.mo1317();
                }
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f10300) {
            this.f10291 = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f10300) {
            this.f10292 = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f10300) {
            this.f10293.m45196(-2);
            this.f10294.add(mediaFormat);
            this.f10289 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10072(InterfaceC7501 interfaceC7501) {
        synchronized (this.f10300) {
            this.f10295 = interfaceC7501;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10067(C3268 c3268) {
        synchronized (c3268.f10300) {
            if (c3268.f10299) {
                return;
            }
            long j = c3268.f10288 - 1;
            c3268.f10288 = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                c3268.m10066(new IllegalStateException());
            } else {
                c3268.m10068();
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m10068() {
        ArrayDeque arrayDeque = this.f10294;
        if (!arrayDeque.isEmpty()) {
            this.f10289 = (MediaFormat) arrayDeque.getLast();
        }
        this.f10287.m45195();
        this.f10293.m45195();
        this.f10296.clear();
        arrayDeque.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10066(IllegalStateException illegalStateException) {
        synchronized (this.f10300) {
            this.f10290 = illegalStateException;
        }
    }
}
