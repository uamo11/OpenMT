package l;

import com.alipay.sdk.m.w.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* compiled from: S6V7 */
/* renamed from: l.֡ۘۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0161 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final CharsetDecoder f1359;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f1360;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f1361;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f1362;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f1363;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InputStream f1364;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharacterCodingException f1365;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f1366;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f1367;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f1368;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f1369;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CharBuffer f1370;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f1371;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1368) {
            return;
        }
        this.f1368 = true;
        this.f1364.close();
    }

    public C0161(AbstractC15440 abstractC15440, C17095 c17095, long j, C0867 c0867) {
        InputStream mo27926;
        C5101 m3188;
        InputStream c3690;
        Charset charset = c17095.f52402;
        this.f1369 = ByteBuffer.allocate(8192);
        this.f1370 = CharBuffer.allocate(2);
        this.f1371 = -1;
        m1279();
        try {
            if (j > 0) {
                C5101 c5101 = null;
                try {
                    C23411 m36513 = abstractC15440.m36513("r");
                    c5101 = c0867.m3188(m36513);
                    m36513.seek(j);
                    c3690 = new C2279(m36513, c5101);
                } catch (IOException | UnsupportedOperationException unused) {
                    if (c5101 != null) {
                        try {
                            c5101.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (c0867.m3191()) {
                        throw new InterruptedIOException("Text search canceled.");
                    }
                    m1279();
                }
                this.f1364 = c3690;
                this.f1360 = j;
                CharsetDecoder newDecoder = charset.newDecoder();
                CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                this.f1359 = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
                this.f1362 = charset.name().equalsIgnoreCase(a.D);
                this.f1369.limit(0);
                return;
            }
            byte[] bArr = new byte[8192];
            long j2 = j;
            while (j2 > 0) {
                m1279();
                int read = mo27926.read(bArr, 0, (int) Math.min(j2, 8192));
                if (read < 0) {
                    throw new IOException("File ended before the search checkpoint.");
                }
                if (read == 0) {
                    if (mo27926.read() < 0) {
                        throw new IOException("File ended before the search checkpoint.");
                    }
                    read = 1;
                }
                j2 -= read;
            }
            c3690 = new C3690(mo27926, m3188);
            this.f1364 = c3690;
            this.f1360 = j;
            CharsetDecoder newDecoder2 = charset.newDecoder();
            CodingErrorAction codingErrorAction2 = CodingErrorAction.REPORT;
            this.f1359 = newDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2);
            this.f1362 = charset.name().equalsIgnoreCase(a.D);
            this.f1369.limit(0);
            return;
        } catch (Throwable th) {
            try {
                m3188.close();
            } catch (IOException unused3) {
            }
            throw th;
        }
        mo27926 = abstractC15440.mo27926();
        m3188 = c0867.m3188(mo27926);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1279() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Text search canceled.");
        }
    }

    public final long position() {
        return this.f1371 >= 0 ? this.f1367 : this.f1360;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0123, code lost:
    
        return -1;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m1280() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0161.m1280():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r6 = r0.length();
        r0.append((char) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r1 != 13) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        r1 = r13.f1360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r7 = m1280();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        if (r7 != 10) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        r0.append('\n');
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r7 < 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r13.f1371 = r7;
        r13.f1367 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        r13.f1365 = r3;
        r13.f1360 = r1;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C18507 m1281(long r14) {
        /*
            r13 = this;
            m1279()
            boolean r0 = r13.f1368
            if (r0 != 0) goto L99
            long r4 = r13.position()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L10:
            int r1 = r13.m1280()
            if (r1 >= 0) goto L24
            int r1 = r0.length()
            if (r1 != 0) goto L1e
            r14 = 0
            return r14
        L1e:
            int r1 = r0.length()
            r9 = r1
            goto L72
        L24:
            r2 = 13
            r3 = 10
            if (r1 == r2) goto L4f
            if (r1 != r3) goto L2d
            goto L4f
        L2d:
            int r2 = r0.length()
            int r3 = java.lang.Character.charCount(r1)
            int r3 = r3 + r2
            r2 = 1048576(0x100000, float:1.469368E-39)
            if (r3 > r2) goto L49
            r0.appendCodePoint(r1)
            int r1 = r0.length()
            r1 = r1 & 4095(0xfff, float:5.738E-42)
            if (r1 != 0) goto L10
            m1279()
            goto L10
        L49:
            l.᩵ۘۜ r14 = new l.᩵ۘۜ
            r14.<init>()
            throw r14
        L4f:
            int r6 = r0.length()
            char r7 = (char) r1
            r0.append(r7)
            if (r1 != r2) goto L71
            long r1 = r13.f1360
            int r7 = r13.m1280()     // Catch: java.nio.charset.CharacterCodingException -> L6c
            if (r7 != r3) goto L65
            r0.append(r3)     // Catch: java.nio.charset.CharacterCodingException -> L6c
            goto L71
        L65:
            if (r7 < 0) goto L71
            r13.f1371 = r7     // Catch: java.nio.charset.CharacterCodingException -> L6c
            r13.f1367 = r1     // Catch: java.nio.charset.CharacterCodingException -> L6c
            goto L71
        L6c:
            r3 = move-exception
            r13.f1365 = r3
            r13.f1360 = r1
        L71:
            r9 = r6
        L72:
            long r1 = r13.position()
            r6 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 > 0) goto L91
            l.ᩴۘۜ r12 = new l.ᩴۘۜ
            long r6 = r13.position()
            java.lang.String r8 = r0.toString()
            r10 = 0
            r1 = r12
            r2 = r14
            r1.<init>(r2, r4, r6, r8, r9, r10)
            return r12
        L91:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "Text search offset exceeds the supported JSON integer range."
            r14.<init>(r15)
            throw r14
        L99:
            java.io.IOException r14 = new java.io.IOException
            java.lang.String r15 = "Text search reader is closed."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0161.m1281(long):l.ᩴۘۜ");
    }
}
