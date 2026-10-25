package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: RAH2 */
/* renamed from: l.᩸᩷֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21820 extends AbstractC0652 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f69897;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69898;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f69899;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC23230 f69900;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f69901;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f69902;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f69903;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f69904;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f69905;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f69906;

    public C21820(OutputStream outputStream) {
        super(outputStream);
        this.f69899 = 0;
        this.f69898 = 0;
        ((FilterOutputStream) this).out = new C14432(new C7356(outputStream));
        int i = C8789.f26773;
        Charset.defaultCharset().name();
        this.f69900 = AbstractC14057.m33658((String) null);
        this.f69902 = new byte[512];
        this.f69906 = 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49181(HashMap hashMap, String str, C4529 c4529) {
        if (c4529 != null) {
            C4239 instant = c4529.toInstant();
            long epochSecond = instant.getEpochSecond();
            int nano = instant.getNano();
            if (nano == 0) {
                hashMap.put(str, String.valueOf(epochSecond));
            } else {
                m49179(hashMap, str, epochSecond, nano);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49179(HashMap hashMap, String str, long j, int i) {
        hashMap.put(str, BigDecimal.valueOf(j).add(BigDecimal.valueOf(i).movePointLeft(9).setScale(7, RoundingMode.DOWN)).toPlainString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49180(HashMap hashMap, String str, long j, long j2) {
        if (j < 0 || j > j2) {
            hashMap.put(str, String.valueOf(j));
        }
    }

    @Override // l.AbstractC0652, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            if (!m2665()) {
                finish();
            }
        } finally {
            if (!isClosed()) {
                super.close();
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49187() {
        m2664();
        if (!this.f69901) {
            throw new IOException("No current entry to close");
        }
        ((C14432) ((FilterOutputStream) this).out).m34459();
        long j = this.f69897;
        long j2 = this.f69903;
        if (j < j2) {
            StringBuilder sb = new StringBuilder("Entry '");
            sb.append(this.f69904);
            sb.append("' closed at '");
            sb.append(this.f69897);
            sb.append("' before the '");
            throw new IOException(C15942.m37718(sb, this.f69903, "' bytes specified in the header were written"));
        }
        long j3 = (j2 / 512) + this.f69905;
        this.f69905 = j3;
        if (0 != j2 % 512) {
            this.f69905 = j3 + 1;
        }
        this.f69901 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49178(String str, long j, long j2) {
        m49177(j, j2, str, "");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49177(long j, long j2, String str, String str2) {
        if (j < 0 || j > j2) {
            throw new IllegalArgumentException(str + " '" + j + "' is too big ( > " + j2 + " )." + str2);
        }
    }

    @Override // l.AbstractC0652
    public final void finish() {
        m2664();
        if (this.f69901) {
            throw new IOException("This archive contains unclosed entries.");
        }
        byte[] bArr = this.f69902;
        Arrays.fill(bArr, (byte) 0);
        m49184(bArr);
        Arrays.fill(bArr, (byte) 0);
        m49184(bArr);
        long j = this.f69905;
        int i = this.f69906;
        long j2 = j % i;
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        if (i2 != 0) {
            while (i2 < i) {
                Arrays.fill(bArr, (byte) 0);
                m49184(bArr);
                i2++;
            }
        }
        ((FilterOutputStream) this).out.flush();
        super.finish();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m49183(C1358 c1358, String str, HashMap hashMap, String str2, byte b, String str3) {
        byte[] mo29130 = this.f69900.mo29130(str);
        int length = mo29130.length;
        if (length >= 100) {
            int i = this.f69899;
            if (i == 3) {
                hashMap.put(str2, str);
                return true;
            }
            if (i == 2) {
                C1358 c13582 = new C1358(b, "././@LongLink");
                c13582.m4751(length + 1);
                m49182(c1358, c13582);
                m49185(c13582);
                write(mo29130, 0, length);
                write(0);
                m49187();
                return false;
            }
            if (i != 1) {
                throw new IllegalArgumentException(str3 + " '" + str + "' is too long ( > 100 bytes)");
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0228  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m49185(l.C1358 r23) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21820.m49185(l.֨᩷֡):void");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m49186() {
        this.f69898 = 1;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m49188() {
        this.f69899 = 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49182(C1358 c1358, C1358 c13582) {
        C4529 m4745 = c1358.m4745();
        int i = C6672.f20732;
        int i2 = C17961.f55991;
        long j = 0;
        long j2 = m4745 != null ? m4745.to(TimeUnit.SECONDS) : 0L;
        if (j2 >= 0 && j2 <= 8589934591L) {
            j = j2;
        }
        c13582.m4737(C4529.from(j, TimeUnit.SECONDS));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!this.f69901) {
            throw new IllegalStateException("No current tar entry");
        }
        long j = i2;
        if (this.f69897 + j <= this.f69903) {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            this.f69897 += j;
        } else {
            StringBuilder m32308 = C13325.m32308(i2, "Request to write '", "' bytes exceeds size in header of '");
            m32308.append(this.f69903);
            m32308.append("' bytes for entry '");
            throw new IOException(C9045.m23341(m32308, this.f69904, "'"));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m49184(byte[] bArr) {
        if (bArr.length != 512) {
            throw new IOException(C3200.m9831(bArr.length, "' which is not the record size of '512'", new StringBuilder("Record to write has length '")));
        }
        ((FilterOutputStream) this).out.write(bArr);
        this.f69905++;
    }
}
