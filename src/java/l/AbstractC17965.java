package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;

/* compiled from: M7WW */
/* renamed from: l.ᩳۢۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC17965 {

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final byte[] f56023;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23526 f56024;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC2774 f56027;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C22529 f56031;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC2774 f56032;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC1737 f56034;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f56026 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f56025 = "no comment";

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f56030 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f56028 = null;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f56029 = null;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f56033 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41966(int i) {
        int i2 = 1;
        if (i <= 127) {
            return 1;
        }
        while (i > 0) {
            i >>>= 8;
            i2++;
        }
        return i2;
    }

    /* renamed from: ֫ */
    public void mo11611() {
    }

    /* renamed from: ֫ */
    public abstract byte[] mo7882(String str, byte[] bArr);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m41979(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = null;
        if (this.f56024 == null) {
            try {
                this.f56024 = (InterfaceC23526) Class.forName(C20413.m46768("3des-cbc")).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception | LinkageError unused) {
                this.f56031.getClass();
                C20413.f65866.getClass();
            }
            this.f56024 = this.f56024;
        }
        if (this.f56032 == null) {
            this.f56032 = m41977();
        }
        int blockSize = this.f56024.getBlockSize();
        bArr3 = new byte[blockSize];
        int blockSize2 = this.f56032.getBlockSize();
        int i = ((blockSize / blockSize2) * blockSize2) + (blockSize % blockSize2 == 0 ? 0 : blockSize2);
        byte[] bArr5 = new byte[i];
        try {
            int i2 = this.f56026;
            if (i2 == 0) {
                int i3 = 0;
                while (i3 + blockSize2 <= i) {
                    if (bArr4 != null) {
                        this.f56032.mo1151(bArr4.length, bArr4);
                    }
                    this.f56032.mo1151(bArr.length, bArr);
                    InterfaceC2774 interfaceC2774 = this.f56032;
                    int i4 = 8;
                    if (bArr2.length <= 8) {
                        i4 = bArr2.length;
                    }
                    interfaceC2774.mo1151(i4, bArr2);
                    bArr4 = this.f56032.mo1152();
                    System.arraycopy(bArr4, 0, bArr5, i3, bArr4.length);
                    i3 += bArr4.length;
                }
                System.arraycopy(bArr5, 0, bArr3, 0, blockSize);
            } else if (i2 == 4) {
                byte[] mo5812 = this.f56034.mo5812(bArr2.length + blockSize, bArr);
                System.arraycopy(mo5812, 0, bArr3, 0, blockSize);
                System.arraycopy(mo5812, blockSize, bArr2, 0, bArr2.length);
                C19356.m44596(mo5812);
            } else if (i2 == 1) {
                int i5 = 0;
                while (i5 + blockSize2 <= i) {
                    if (bArr4 != null) {
                        this.f56032.mo1151(bArr4.length, bArr4);
                    }
                    this.f56032.mo1151(bArr.length, bArr);
                    bArr4 = this.f56032.mo1152();
                    System.arraycopy(bArr4, 0, bArr5, i5, bArr4.length);
                    i5 += bArr4.length;
                }
                System.arraycopy(bArr5, 0, bArr3, 0, blockSize);
            } else if (i2 == 2) {
                byte[] bArr6 = new byte[4];
                this.f56027.mo1151(4, bArr6);
                this.f56027.mo1151(bArr.length, bArr);
                byte[] mo1152 = this.f56027.mo1152();
                System.arraycopy(mo1152, 0, bArr3, 0, mo1152.length);
                C19356.m44596(mo1152);
                bArr6[3] = 1;
                this.f56027.mo1151(4, bArr6);
                this.f56027.mo1151(bArr.length, bArr);
                byte[] mo11522 = this.f56027.mo1152();
                System.arraycopy(mo11522, 0, bArr3, mo11522.length, blockSize - mo11522.length);
                C19356.m44596(mo11522);
            } else if (i2 == 5) {
                byte[] mo58122 = this.f56034.mo5812(bArr2.length + blockSize + 32, bArr);
                System.arraycopy(mo58122, 0, bArr3, 0, blockSize);
                System.arraycopy(mo58122, blockSize, bArr2, 0, bArr2.length);
                C19356.m44596(mo58122);
            }
        } catch (Exception unused2) {
            this.f56031.getClass();
            C20413.f65866.getClass();
        }
        return bArr3;
    }

    /* renamed from: ۧ */
    public abstract byte[] mo7883();

    /* renamed from: ۧ */
    public abstract byte[] mo7884(byte[] bArr);

    /* renamed from: ܽ */
    public abstract int mo24336();

    /* renamed from: ܽ */
    public abstract boolean mo7885(byte[] bArr);

    /* renamed from: ᩳ */
    public abstract byte[] mo7887();

    static {
        byte[] bArr = C19356.f62660;
        Charset charset = StandardCharsets.UTF_8;
        f56023 = "openssh-key-v1\u0000".getBytes(charset);
        C19356.m44599("\n");
        C19356.m44599("-----BEGIN OPENSSH PRIVATE KEY-----");
        C19356.m44599("-----END OPENSSH PRIVATE KEY-----");
        C19356.m44599("none");
        "Proc-Type: 4,ENCRYPTED".getBytes(charset);
        "DEK-Info: DES-EDE3-CBC,".getBytes(charset);
        C19356.m44599(" ");
    }

    public AbstractC17965(C22529 c22529) {
        this.f56031 = c22529;
    }

    /* renamed from: ܿ */
    public byte[] mo7886() {
        return this.f56033;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m41974(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            byte[] m41979 = m41979(bArr2, bArr3);
            this.f56024.mo2204(1, m41979, bArr3);
            C19356.m44596(m41979);
            byte[] bArr4 = new byte[bArr.length - this.f56024.mo2207()];
            if (this.f56024.mo2209()) {
                this.f56024.mo2202(0);
                InterfaceC23526 interfaceC23526 = this.f56024;
                interfaceC23526.mo2208(-4, bArr, bArr.length - interfaceC23526.mo2207(), bArr4, 0);
                return bArr4;
            }
            if (this.f56024.mo2210()) {
                this.f56024.mo2208(0, bArr, bArr.length, bArr4, 0);
                return bArr4;
            }
            this.f56024.mo2203(0, bArr, bArr.length, bArr4, 0);
            return bArr4;
        } catch (Exception unused) {
            this.f56031.getClass();
            C20413.f65866.getClass();
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41967(int i, byte[] bArr, byte[] bArr2) {
        bArr[i] = 2;
        int m41975 = m41975(i + 1, bArr2.length, bArr);
        System.arraycopy(bArr2, 0, bArr, m41975, bArr2.length);
        return m41975 + bArr2.length;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m41975(int i, int i2, byte[] bArr) {
        int m41966 = m41966(i2) - 1;
        if (m41966 == 0) {
            int i3 = i + 1;
            bArr[i] = (byte) i2;
            return i3;
        }
        bArr[i] = (byte) (m41966 | 128);
        int i4 = i + 1 + m41966;
        while (m41966 > 0) {
            bArr[(r1 + m41966) - 1] = (byte) (i2 & 255);
            i2 >>>= 8;
            m41966--;
        }
        return i4;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private InterfaceC2774 m41977() {
        try {
            InterfaceC2774 interfaceC2774 = (InterfaceC2774) Class.forName(C20413.m46768("md5")).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
            this.f56032 = interfaceC2774;
            interfaceC2774.init();
        } catch (Exception | LinkageError unused) {
            this.f56031.getClass();
            C20413.f65866.getClass();
        }
        return this.f56032;
    }

    /* renamed from: ֫ */
    public boolean mo7881(byte[] bArr) {
        boolean z = this.f56030;
        if (!z) {
            return true;
        }
        if (bArr == null) {
            return !z;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        byte[] bArr3 = null;
        try {
            bArr3 = m41974(this.f56028, bArr2, this.f56029);
            if (mo7885(bArr3)) {
                this.f56030 = false;
                C19356.m44596(this.f56028);
            }
            C19356.m44596(bArr2);
            C19356.m44596(bArr3);
            return !this.f56030;
        } catch (Throwable th) {
            C19356.m44596(bArr2);
            C19356.m44596(bArr3);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0700 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:329:0x0484, B:354:0x049e, B:357:0x04ab, B:359:0x04ae, B:361:0x04b5, B:363:0x04bb, B:365:0x04c0, B:367:0x04c7, B:370:0x04e9, B:372:0x04f1, B:373:0x0505, B:374:0x051c, B:375:0x051d, B:415:0x054f, B:418:0x0555, B:420:0x055c, B:422:0x0560, B:424:0x0564, B:427:0x056a, B:429:0x056f, B:432:0x0575, B:437:0x057d, B:439:0x0583, B:440:0x0586, B:442:0x0589, B:452:0x05a9, B:458:0x05b2, B:484:0x05b8, B:463:0x05c9, B:469:0x05ce, B:387:0x0700, B:389:0x0736, B:391:0x0744, B:392:0x074c, B:394:0x0752, B:395:0x0756, B:396:0x075b, B:400:0x0709, B:403:0x0712, B:406:0x071b, B:409:0x0724, B:412:0x072d, B:475:0x05da, B:611:0x06ee, B:499:0x05ef, B:501:0x05f9, B:503:0x05fd, B:505:0x0603, B:508:0x060c, B:510:0x0610, B:517:0x0621, B:521:0x062b, B:526:0x0635, B:528:0x063a, B:531:0x063d, B:535:0x0644, B:537:0x0649, B:540:0x064c, B:546:0x0660, B:548:0x0667, B:552:0x066c, B:554:0x0674, B:556:0x0678, B:563:0x0683, B:565:0x0689, B:567:0x068f, B:570:0x0698, B:575:0x06a0, B:577:0x06a5, B:580:0x06a8, B:584:0x06af, B:586:0x06b4, B:589:0x06b7, B:595:0x06cb, B:597:0x06d2, B:601:0x06d7, B:603:0x06df, B:605:0x06e3), top: B:328:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0736 A[Catch: LinkageError -> 0x04a3, Exception -> 0x04a6, TryCatch #1 {LinkageError -> 0x04a3, blocks: (B:329:0x0484, B:354:0x049e, B:357:0x04ab, B:359:0x04ae, B:361:0x04b5, B:363:0x04bb, B:365:0x04c0, B:367:0x04c7, B:370:0x04e9, B:372:0x04f1, B:373:0x0505, B:374:0x051c, B:375:0x051d, B:415:0x054f, B:418:0x0555, B:420:0x055c, B:422:0x0560, B:424:0x0564, B:427:0x056a, B:429:0x056f, B:432:0x0575, B:437:0x057d, B:439:0x0583, B:440:0x0586, B:442:0x0589, B:452:0x05a9, B:458:0x05b2, B:484:0x05b8, B:463:0x05c9, B:469:0x05ce, B:387:0x0700, B:389:0x0736, B:391:0x0744, B:392:0x074c, B:394:0x0752, B:395:0x0756, B:396:0x075b, B:400:0x0709, B:403:0x0712, B:406:0x071b, B:409:0x0724, B:412:0x072d, B:475:0x05da, B:611:0x06ee, B:499:0x05ef, B:501:0x05f9, B:503:0x05fd, B:505:0x0603, B:508:0x060c, B:510:0x0610, B:517:0x0621, B:521:0x062b, B:526:0x0635, B:528:0x063a, B:531:0x063d, B:535:0x0644, B:537:0x0649, B:540:0x064c, B:546:0x0660, B:548:0x0667, B:552:0x066c, B:554:0x0674, B:556:0x0678, B:563:0x0683, B:565:0x0689, B:567:0x068f, B:570:0x0698, B:575:0x06a0, B:577:0x06a5, B:580:0x06a8, B:584:0x06af, B:586:0x06b4, B:589:0x06b7, B:595:0x06cb, B:597:0x06d2, B:601:0x06d7, B:603:0x06df, B:605:0x06e3), top: B:328:0x0484 }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0706  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v19 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC17965 m41970(l.C22529 r21, byte[] r22, byte[] r23) {
        /*
            Method dump skipped, instructions count: 1906
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC17965.m41970(l.᩹᩷ۘ, byte[], byte[]):l.ᩳۢۘ");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x010c A[Catch: Exception -> 0x0075, TryCatch #2 {Exception -> 0x0075, blocks: (B:10:0x005d, B:12:0x0069, B:15:0x006f, B:16:0x0074, B:27:0x00e9, B:29:0x00ed, B:30:0x00ef, B:31:0x00f0, B:32:0x0104, B:38:0x0108, B:40:0x010c, B:41:0x010e, B:42:0x010f, B:43:0x0123), top: B:8:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f A[Catch: Exception -> 0x0075, TryCatch #2 {Exception -> 0x0075, blocks: (B:10:0x005d, B:12:0x0069, B:15:0x006f, B:16:0x0074, B:27:0x00e9, B:29:0x00ed, B:30:0x00ef, B:31:0x00f0, B:32:0x0104, B:38:0x0108, B:40:0x010c, B:41:0x010e, B:42:0x010f, B:43:0x0123), top: B:8:0x005b }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC17965 m41969(l.C22529 r12, byte[] r13) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC17965.m41969(l.᩹᩷ۘ, byte[]):l.ᩳۢۘ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m41971(int i, int i2, byte[] bArr) {
        int i3 = i + 24;
        return i3 < i2 && "OPENSSH PRIVATE KEY-----".equals(C19356.m44588(Arrays.copyOfRange(bArr, i, i3)));
    }

    public final void finalize() {
        mo11611();
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0166: MOVE (r3 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]), block:B:80:0x0166 */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:19:0x0050, B:22:0x0056, B:25:0x005c, B:35:0x0089, B:52:0x00af, B:40:0x0106, B:37:0x00e1, B:39:0x00e9, B:43:0x010c, B:45:0x0110, B:46:0x0112, B:47:0x0113, B:48:0x012e, B:55:0x00d2, B:57:0x00d6, B:58:0x00d8, B:59:0x00d9, B:60:0x00e0, B:27:0x0141, B:29:0x0149, B:32:0x0150, B:33:0x0157, B:63:0x0132, B:65:0x0136, B:66:0x0138, B:67:0x0139, B:68:0x0140, B:73:0x0161, B:74:0x0164), top: B:12:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0113 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:19:0x0050, B:22:0x0056, B:25:0x005c, B:35:0x0089, B:52:0x00af, B:40:0x0106, B:37:0x00e1, B:39:0x00e9, B:43:0x010c, B:45:0x0110, B:46:0x0112, B:47:0x0113, B:48:0x012e, B:55:0x00d2, B:57:0x00d6, B:58:0x00d8, B:59:0x00d9, B:60:0x00e0, B:27:0x0141, B:29:0x0149, B:32:0x0150, B:33:0x0157, B:63:0x0132, B:65:0x0136, B:66:0x0138, B:67:0x0139, B:68:0x0140, B:73:0x0161, B:74:0x0164), top: B:12:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:19:0x0050, B:22:0x0056, B:25:0x005c, B:35:0x0089, B:52:0x00af, B:40:0x0106, B:37:0x00e1, B:39:0x00e9, B:43:0x010c, B:45:0x0110, B:46:0x0112, B:47:0x0113, B:48:0x012e, B:55:0x00d2, B:57:0x00d6, B:58:0x00d8, B:59:0x00d9, B:60:0x00e0, B:27:0x0141, B:29:0x0149, B:32:0x0150, B:33:0x0157, B:63:0x0132, B:65:0x0136, B:66:0x0138, B:67:0x0139, B:68:0x0140, B:73:0x0161, B:74:0x0164), top: B:12:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0139 A[Catch: Exception -> 0x0158, all -> 0x0165, TryCatch #4 {all -> 0x0165, blocks: (B:19:0x0050, B:22:0x0056, B:25:0x005c, B:35:0x0089, B:52:0x00af, B:40:0x0106, B:37:0x00e1, B:39:0x00e9, B:43:0x010c, B:45:0x0110, B:46:0x0112, B:47:0x0113, B:48:0x012e, B:55:0x00d2, B:57:0x00d6, B:58:0x00d8, B:59:0x00d9, B:60:0x00e0, B:27:0x0141, B:29:0x0149, B:32:0x0150, B:33:0x0157, B:63:0x0132, B:65:0x0136, B:66:0x0138, B:67:0x0139, B:68:0x0140, B:73:0x0161, B:74:0x0164), top: B:12:0x002a }] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC17965 m41976(l.C22529 r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC17965.m41976(l.᩹᩷ۘ, byte[]):l.ᩳۢۘ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m41968(C22529 c22529, String str, byte[] bArr) {
        C16261 c16261 = new C16261(bArr);
        c16261.m38251(bArr.length);
        byte[] m38257 = c16261.m38257();
        byte[] bArr2 = C19356.f62660;
        String str2 = new String(m38257, 0, m38257.length, StandardCharsets.UTF_8);
        if (str == null || str.equals("")) {
            str = str2;
        } else if (!str.equals(str2)) {
            throw new C12651(C20087.m46306("pubkeyblob type [", str2, "] does not match expected type [", str, "]"));
        }
        if (str.equals(OpenSSHPublicKeyUtil.RSA)) {
            int m38250 = c16261.m38250();
            byte[] bArr3 = new byte[m38250];
            c16261.m38236(0, m38250, bArr3);
            int m382502 = c16261.m38250();
            byte[] bArr4 = new byte[m382502];
            c16261.m38236(0, m382502, bArr4);
            return new C3854(c22529, bArr4, bArr3, null);
        }
        if (str.equals(OpenSSHPublicKeyUtil.DSS)) {
            int m382503 = c16261.m38250();
            byte[] bArr5 = new byte[m382503];
            c16261.m38236(0, m382503, bArr5);
            int m382504 = c16261.m38250();
            byte[] bArr6 = new byte[m382504];
            c16261.m38236(0, m382504, bArr6);
            int m382505 = c16261.m38250();
            byte[] bArr7 = new byte[m382505];
            c16261.m38236(0, m382505, bArr7);
            int m382506 = c16261.m38250();
            byte[] bArr8 = new byte[m382506];
            c16261.m38236(0, m382506, bArr8);
            return new C17259(c22529, bArr5, bArr6, bArr7, bArr8, null);
        }
        if (!str.equals("ecdsa-sha2-nistp256") && !str.equals("ecdsa-sha2-nistp384") && !str.equals("ecdsa-sha2-nistp521")) {
            if (!str.equals(OpenSSHPublicKeyUtil.ED_25519) && !str.equals("ssh-ed448")) {
                throw new C12651(C4860.m14172("key type ", str, " is not supported"));
            }
            int m382507 = c16261.m38250();
            byte[] bArr9 = new byte[m382507];
            c16261.m38236(0, m382507, bArr9);
            return str.equals(OpenSSHPublicKeyUtil.ED_25519) ? new C20788(c22529, bArr9, null) : new C9499(c22529, bArr9, null);
        }
        byte[] m382572 = c16261.m38257();
        int m382508 = c16261.m38250();
        c16261.m38233();
        int i = (m382508 - 1) / 2;
        byte[] bArr10 = new byte[i];
        byte[] bArr11 = new byte[i];
        c16261.m38236(0, i, bArr10);
        c16261.m38236(0, i, bArr11);
        return new C6676(c22529, m382572, bArr10, bArr11, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[ADDED_TO_REGION, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m41973(l.C16261 r9, int r10) {
        /*
            byte[] r0 = r9.f50016
            int r1 = r9.f50017
            r2 = 0
        L5:
            int r3 = r10 + (-1)
            if (r10 <= 0) goto L4a
            r10 = r1
        La:
            int r4 = r0.length
            r5 = 10
            if (r4 <= r10) goto L3e
            int r4 = r10 + 1
            r10 = r0[r10]
            r6 = 13
            if (r10 == r6) goto L1c
            if (r10 != r5) goto L1a
            goto L1c
        L1a:
            r10 = r4
            goto La
        L1c:
            int r10 = r4 - r1
            int r10 = r10 + (-1)
            r6 = 0
            if (r2 != 0) goto L29
            byte[] r2 = new byte[r10]
            java.lang.System.arraycopy(r0, r1, r2, r6, r10)
            goto L3d
        L29:
            if (r10 <= 0) goto L3d
            int r7 = r2.length
            int r7 = r7 + r10
            byte[] r7 = new byte[r7]
            int r8 = r2.length
            java.lang.System.arraycopy(r2, r6, r7, r6, r8)
            int r6 = r2.length
            java.lang.System.arraycopy(r0, r1, r7, r6, r10)
            l.C19356.m44596(r2)
            r10 = r4
            r2 = r7
            goto L3e
        L3d:
            r10 = r4
        L3e:
            int r1 = r0.length
            if (r10 >= r1) goto L47
            r1 = r0[r10]
            if (r1 != r5) goto L47
            int r10 = r10 + 1
        L47:
            r1 = r10
            r10 = r3
            goto L5
        L4a:
            if (r2 == 0) goto L4e
            r9.f50017 = r1
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC17965.m41973(l.ܺ᩻ۘ, int):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0032, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0034, code lost:
    
        if (r2 >= r0.length) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0036, code lost:
    
        r2 = r0[r2];
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066 A[ORIG_RETURN, RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m41972(l.C16261 r10, java.util.HashMap r11) {
        /*
            byte[] r0 = r10.f50016
            int r1 = r10.f50017
            r2 = r1
        L5:
            int r3 = r0.length
            r4 = 13
            r5 = 10
            r6 = 1
            r7 = 0
            if (r2 >= r3) goto L38
            r3 = r0[r2]
            if (r3 == r4) goto L32
            if (r3 != r5) goto L15
            goto L32
        L15:
            r8 = 58
            if (r3 != r8) goto L2f
            int r3 = r2 - r1
            java.lang.String r1 = l.C19356.m44585(r1, r3, r0)
            int r3 = r2 + 1
            int r8 = r0.length
            if (r3 >= r8) goto L2d
            r8 = r0[r3]
            r9 = 32
            if (r8 != r9) goto L2d
            int r2 = r2 + 2
            goto L3a
        L2d:
            r2 = r3
            goto L3a
        L2f:
            int r2 = r2 + 1
            goto L5
        L32:
            int r2 = r2 + r6
            int r3 = r0.length
            if (r2 >= r3) goto L38
            r2 = r0[r2]
        L38:
            r2 = r1
            r1 = r7
        L3a:
            if (r1 != 0) goto L3d
            goto L66
        L3d:
            r3 = r2
        L3e:
            int r8 = r0.length
            if (r3 >= r8) goto L5c
            r8 = r0[r3]
            if (r8 == r4) goto L4b
            if (r8 != r5) goto L48
            goto L4b
        L48:
            int r3 = r3 + 1
            goto L3e
        L4b:
            int r4 = r3 - r2
            java.lang.String r7 = l.C19356.m44585(r2, r4, r0)
            int r2 = r3 + 1
            int r4 = r0.length
            if (r2 >= r4) goto L5c
            r0 = r0[r2]
            if (r0 != r5) goto L5c
            int r2 = r3 + 2
        L5c:
            if (r7 == 0) goto L63
            r11.put(r1, r7)
            r10.f50017 = r2
        L63:
            if (r7 == 0) goto L66
            return r6
        L66:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC17965.m41972(l.ܺ᩻ۘ, java.util.HashMap):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41978(AbstractC17965 abstractC17965) {
        this.f56033 = abstractC17965.f56033;
        this.f56026 = abstractC17965.f56026;
        this.f56025 = abstractC17965.f56025;
        this.f56024 = abstractC17965.f56024;
    }
}
