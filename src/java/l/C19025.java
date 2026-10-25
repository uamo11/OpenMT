package l;

import android.media.MediaCodec;
import android.media.MediaDataSource;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;

/* compiled from: H74N */
/* renamed from: l.ᩴ᩸ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19025 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f59936 = new C1315(500);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f59937 = Long.toHexString(System.currentTimeMillis()) + Long.toHexString(System.nanoTime());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43869(long j, String str) {
        return C12053.m29430(str) && j >= 48128 && j % 188 == 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m43871(String str) {
        return C12053.m29430(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21142 m43865(String str) {
        EnumC21142 enumC21142;
        C1315 c1315 = f59936;
        synchronized (c1315) {
            enumC21142 = (EnumC21142) c1315.m4553(str);
        }
        return enumC21142;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43868(String str, EnumC21142 enumC21142) {
        C1315 c1315 = f59936;
        synchronized (c1315) {
            c1315.m4554(str, enumC21142);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43859(String str, InterfaceC17889 interfaceC17889, long j) {
        if (j > 0) {
            return str;
        }
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(f59937);
        m15339.append(System.identityHashCode(interfaceC17889));
        return C14460.m34530(m15339.toString()).toLowerCase();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21142 m43864(InputStream inputStream) {
        m43872();
        byte[] bArr = new byte[940];
        C22194.m49857(inputStream, bArr, 940);
        m43872();
        return m43866(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21142 m43863(MediaDataSource mediaDataSource) {
        byte[] bArr = new byte[940];
        int i = 0;
        while (i < 940) {
            m43872();
            int readAt = mediaDataSource.readAt(i, bArr, i, 940 - i);
            if (readAt <= 0) {
                throw new EOFException("Unexpected end of MPEG-TS probe source");
            }
            i += readAt;
        }
        return m43866(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        r0 = r0 + 1;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.EnumC21142 m43866(byte[] r4) {
        /*
            r0 = 0
        L1:
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 >= r1) goto L1d
            r1 = 0
        L6:
            r2 = 5
            if (r1 >= r2) goto L1a
            int r2 = r1 * 188
            int r2 = r2 + r0
            r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 71
            if (r2 == r3) goto L17
            int r0 = r0 + 1
            goto L1
        L17:
            int r1 = r1 + 1
            goto L6
        L1a:
            l.᩷᩸ۜ r4 = l.EnumC21142.MPEG_TS
            return r4
        L1d:
            l.᩷᩸ۜ r4 = l.EnumC21142.NOT_MPEG_TS
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19025.m43866(byte[]):l.᩷᩸ۜ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m43862(AbstractC15440 abstractC15440, int i) {
        C9853 c9853;
        final C9147 c9147 = new C9147();
        final C12053 m29428 = C12053.m29428(abstractC15440, true);
        try {
            return new C9853(C23068.m51226(C12053.m29427("ts-thumbnail-local:" + Integer.toHexString(System.identityHashCode(abstractC15440)), new InterfaceC5703() { // from class: l.ܳ᩸ۜ
                @Override // l.InterfaceC5703
                /* renamed from: ֫ */
                public final InterfaceC7505 mo16113() {
                    C12053 c12053 = C12053.this;
                    C9147 c91472 = c9147;
                    try {
                        InterfaceC7505 m29433 = c12053.m29433();
                        if (m29433 != null) {
                            return new C2797(m29433, c91472);
                        }
                        throw new IOException("Missing MPEG-TS thumbnail read handle");
                    } catch (IOException e) {
                        C9147.m23523(c91472);
                        throw new C16201(e);
                    }
                }
            }, true), i, new C23963()));
        } catch (IOException | RuntimeException e) {
            if (C9147.m23522(c9147)) {
                c9853 = C9853.f29813;
                return c9853;
            }
            return m43861(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m43860(final MediaDataSource mediaDataSource, int i) {
        C9853 m43861;
        C9853 m438612;
        C9853 c9853;
        try {
            try {
                final long size = mediaDataSource.getSize();
                if (size < 0) {
                    c9853 = C9853.f29813;
                    return c9853;
                }
                final C9147 c9147 = new C9147();
                try {
                    m438612 = new C9853(C23068.m51226(C12053.m29427("ts-thumbnail:" + Integer.toHexString(System.identityHashCode(mediaDataSource)), new InterfaceC5703() { // from class: l.ۜ᩸ۜ
                        @Override // l.InterfaceC5703
                        /* renamed from: ֫ */
                        public final InterfaceC7505 mo16113() {
                            return new C4208(mediaDataSource, size, c9147);
                        }
                    }, true), i, new C23963()));
                } catch (IOException | RuntimeException e) {
                    if (C9147.m23522(c9147)) {
                        m438612 = C9853.f29813;
                    } else {
                        m438612 = m43861(e);
                    }
                }
                return m438612;
            } finally {
                C0349.m1793(mediaDataSource);
            }
        } catch (IOException unused) {
            m43861 = C9853.f29813;
            return m43861;
        } catch (RuntimeException e2) {
            m43861 = m43861(e2);
            return m43861;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m43861(Exception exc) {
        C9853 c9853;
        C9853 c98532;
        if (!Thread.currentThread().isInterrupted()) {
            for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
                if (!(exc2 instanceof InterruptedIOException) && !(exc2 instanceof C16201)) {
                    int i = C23068.f74198;
                    if (!(exc2 instanceof C3313)) {
                        if (exc2 instanceof MediaCodec.CodecException) {
                            MediaCodec.CodecException codecException = (MediaCodec.CodecException) exc2;
                            if (!codecException.isTransient() && !codecException.isRecoverable()) {
                            }
                        }
                    }
                }
            }
            c98532 = C9853.f29814;
            return c98532;
        }
        c9853 = C9853.f29813;
        return c9853;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m43872() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("MPEG-TS thumbnail decode was canceled");
        }
    }
}
