package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Z72Q */
/* renamed from: l.ۨ֨᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11382 implements InterfaceC0091 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f34046 = "payload.bin".getBytes(StandardCharsets.UTF_8);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11506 f34047;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f34048;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C18437 f34049;

    public C11382(C18437 c18437, int i, C11506 c11506) {
        this.f34049 = c18437;
        this.f34048 = i;
        this.f34047 = c11506;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11382 m28133(String str, String str2, int i, C11506 c11506, C22670 c22670) {
        long length;
        C18090 m42169;
        C17209 m14323 = C4925.m14323();
        if (i > 0 && i <= 16) {
            C22794 c22794 = new C22794(m14323, str, str2, c11506, c22670);
            C11506 m50883 = c22794.m50883();
            C23411 m1200 = C0127.m1200(c22794);
            try {
                length = m1200.length();
                m42169 = C18090.m42169(m1200, new C8083());
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    C3545 entry = m42169.getEntry("payload.bin");
                    if (entry == null) {
                        throw new C19401(R.string.MT_Protector_res_0x7f120858);
                    }
                    m28134(entry, length);
                    C23411 mo21176 = m42169.m42214().mo21176(entry.m10811(), entry.getSize());
                    try {
                        C18437 c18437 = new C18437(mo21176);
                        String m28132 = m28132(c18437);
                        if (c11506 != null) {
                            c11506.m28332(m28132);
                        }
                        try {
                            C11382 c11382 = new C11382(c18437, i, m50883.m28334(m28132));
                            m42169.close();
                            return c11382;
                        } catch (Throwable th2) {
                            th = th2;
                            mo21176 = null;
                            if (mo21176 != null) {
                                mo21176.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } finally {
                }
            } catch (Throwable th4) {
                th = th4;
                m1200 = null;
                if (m1200 != null) {
                    m1200.close();
                }
                throw th;
            }
        } else {
            throw new IOException("Download thread count must be between 1 and 16");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28132(C18437 c18437) {
        MessageDigest m34534 = C14460.m34534();
        C10130 c10130 = new C10130();
        ArrayList arrayList = (ArrayList) c18437.mo1052();
        c10130.writeInt(arrayList.size());
        c10130.m25433(m34534);
        c10130.m25440();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13621 c13621 = (C13621) it.next();
            byte[] byteArray = c13621.f40625.toByteArray();
            c10130.writeInt(byteArray.length);
            c10130.m25431(c13621.m32741());
            c10130.m25431(c13621.m32739());
            c10130.m25433(m34534);
            c10130.m25440();
            m34534.update(byteArray);
        }
        return C14460.m34531(m34534.digest());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28134(C3545 c3545, long j) {
        if (c3545.m10808()) {
            throw new IOException("payload.bin is encrypted");
        }
        if (c3545.m10767() != 0) {
            throw new IOException("payload.bin is compressed");
        }
        long size = c3545.getSize();
        long m10793 = c3545.m10793();
        long m10811 = c3545.m10811();
        if (size <= 0 || m10793 != size) {
            throw new IOException("payload.bin has inconsistent ZIP sizes");
        }
        if (m10811 < 0 || m10811 > j || size > j - m10811) {
            throw new IOException("payload.bin exceeds the remote ZIP bounds");
        }
    }

    @Override // l.InterfaceC0091
    /* renamed from: ᩶ۧ */
    public final List mo1052() {
        return C20195.unmodifiableList(this.f34049.mo1052());
    }

    @Override // l.InterfaceC0091
    public final C13621 getEntry(String str) {
        return this.f34049.getEntry(str);
    }

    @Override // l.InterfaceC0091
    /* renamed from: ᩷ */
    public final C13621 mo1053(String str) {
        return this.f34049.mo1053(str);
    }

    @Override // l.InterfaceC0091
    /* renamed from: ֫ */
    public final void mo1051(C13621 c13621, C23411 c23411, InterfaceC8559 interfaceC8559) {
        try {
            m28137(c13621, c23411, interfaceC8559, this.f34048);
        } catch (InterruptedIOException e) {
            if (!interfaceC8559.mo17797()) {
                throw e;
            }
        }
    }

    @Override // l.InterfaceC0091
    /* renamed from: ֫ */
    public final C18030 mo1050(C13621 c13621) {
        if (c13621 != null) {
            String m32740 = c13621.m32740();
            C18437 c18437 = this.f34049;
            if (c18437.getEntry(m32740) == c13621) {
                return c18437.mo1050(c13621);
            }
        }
        throw new IOException("Payload entry does not belong to this remote payload");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28137(C13621 c13621, C23411 c23411, InterfaceC8559 interfaceC8559, int i) {
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        String m32740 = c13621.m32740();
        C18437 c18437 = this.f34049;
        if (c18437.getEntry(m32740) != c13621) {
            throw new IOException("Payload entry does not belong to this remote payload");
        }
        C8971 c8971 = c13621.f40625;
        if (!c8971.hasNewPartitionInfo()) {
            throw new IOException("Missing new partition info: " + c13621.m32740());
        }
        C14614 newPartitionInfo = c8971.getNewPartitionInfo();
        if (!newPartitionInfo.hasSize() || !newPartitionInfo.hasHash()) {
            throw new IOException("Missing partition size or hash: " + c13621.m32740());
        }
        long size = newPartitionInfo.getSize();
        byte[] m16503 = newPartitionInfo.getHash().m16503();
        if (size != c13621.m32741() || m16503.length != 32) {
            throw new IOException("Invalid partition verification metadata: " + c13621.m32740());
        }
        c18437.m42916(c13621, c23411, interfaceC8559, i);
        if (interfaceC8559.mo17797()) {
            throw new InterruptedIOException("Payload extraction was canceled");
        }
        C19277 c19277 = new C19277(Math.max(size, 1L));
        c19277.m44459(new C23684(3, interfaceC8559));
        c19277.m44460(0);
        c23411.flush();
        long length = c23411.length();
        if (length != size) {
            StringBuilder m31106 = C12803.m31106("Extracted partition size mismatch: expected ", ", actual ", size);
            m31106.append(length);
            m31106.append(" (");
            m31106.append(c13621.m32740());
            m31106.append(')');
            throw new IOException(m31106.toString());
        }
        MessageDigest m34534 = C14460.m34534();
        int i2 = 524288;
        byte[] bArr = new byte[524288];
        long j = 0;
        c23411.seek(0L);
        long j2 = size;
        while (j2 > j) {
            if (interfaceC8559.mo17797()) {
                throw new InterruptedIOException("Payload extraction was canceled");
            }
            int min = (int) Math.min(j2, i2);
            c23411.m51858(bArr, 0, min);
            m34534.update(bArr, 0, min);
            j2 -= min;
            c19277.m44460(min);
            i2 = 524288;
            j = 0;
        }
        if (size == j) {
            c19277.m44460(1);
        }
        byte[] digest = m34534.digest();
        if (MessageDigest.isEqual(m16503, digest)) {
            return;
        }
        throw new IOException("Partition SHA-256 mismatch: expected " + C14460.m34531(m16503) + ", actual " + C14460.m34531(digest) + " (" + c13621.m32740() + ')');
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11506 m28136() {
        return this.f34047;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f34049.close();
    }
}
