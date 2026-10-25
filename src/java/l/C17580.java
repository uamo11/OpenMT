package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: V6SW */
/* renamed from: l.ܿ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17580 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5377 f53731;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f53732;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f53733;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f53734;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f53735;

    public C17580(ArrayList arrayList, int i, int i2, C5377 c5377) {
        this.f53735 = arrayList;
        this.f53731 = c5377;
        C10130 c10130 = new C10130(20);
        c10130.writeInt(1295139155);
        c10130.writeInt(i2 < 0 ? 1 : 2);
        c10130.writeInt(i);
        if (i2 >= 0) {
            c10130.writeInt(i2);
        }
        c10130.writeInt(arrayList.size());
        byte[] m25444 = c10130.m25444();
        this.f53733 = m25444;
        long length = m25444.length;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9820 c9820 = ((C16874) it.next()).f51782;
            length += (c9820 == null ? r8.f51781.length : c9820.m24893()) + 12;
        }
        if (length > 2147483647L) {
            throw new IllegalArgumentException("Legacy app state exceeds size limit");
        }
        this.f53732 = length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17580 m41103(C9114 c9114, int i, int i2, byte[] bArr, C1143 c1143) {
        if (i2 < 0 || i + i2 > 2147483647L) {
            throw new IllegalArgumentException("Invalid legacy page length");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy page prefix");
        }
        C5377 m3921 = c1143.m3921((bArr == null ? 0 : bArr.length) + 16384);
        try {
            return m41104(c9114, i, i2, bArr, m3921);
        } catch (Error | RuntimeException e) {
            m3921.close();
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17580 m41104(C9114 c9114, int i, int i2, byte[] bArr, C5377 c5377) {
        C9820 m23483;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C16874(256, c9114.m23486()));
        for (int i3 = 1; i3 < 255; i3++) {
            if (i3 != 3 && (m23483 = c9114.m23483(i3)) != null) {
                arrayList.add(new C16874(i3, m23483));
            }
        }
        if (c9114.m23482() != null) {
            arrayList.add(new C16874(259, c9114.m23482()));
        }
        if (c9114.m23487() != null) {
            arrayList.add(new C16874(260, c9114.m23487()));
        }
        arrayList.add(new C16874(257, c9114.m23485()));
        arrayList.add(new C16874(258, c9114.m23484()));
        if (bArr != null) {
            arrayList.add(new C16874((byte[]) bArr.clone()));
        }
        return new C17580(arrayList, i, i2, c5377);
    }

    public final long length() {
        return this.f53732;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m41109() {
        if (this.f53734) {
            throw new IllegalStateException("Legacy app state source is closed");
        }
        return new C2058(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41105(InputStream inputStream, long j, C1143 c1143, InterfaceC18286 interfaceC18286) {
        try {
            C5377 m3921 = c1143.m3921(16384L);
            try {
                if (j >= 16) {
                    try {
                        if (j <= 2147483647L) {
                            try {
                                C11231 c11231 = new C11231(j, inputStream);
                                if (c11231.m27795() != 1295139155) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int m27795 = c11231.m27795();
                                int i = 1;
                                if (m27795 != 1 && m27795 != 2) {
                                    throw new IOException("Unsupported legacy app state");
                                }
                                int m277952 = c11231.m27795();
                                int m277953 = m27795 == 2 ? c11231.m27795() : -1;
                                int m277954 = c11231.m27795();
                                if (m277952 >= 0) {
                                    int i2 = 3;
                                    if (m277954 >= 3 && m277954 <= 259 && m277954 * 12 <= c11231.f33676) {
                                        if (m27795 == 2 && (m277953 < 0 || m277952 + m277953 > 2147483647L)) {
                                            throw new IOException("Invalid legacy app page range");
                                        }
                                        interfaceC18286.mo11284(m277952, m277953);
                                        boolean[] zArr = new boolean[262];
                                        byte[] bArr = new byte[8192];
                                        int i3 = 0;
                                        while (i3 < m277954) {
                                            int m277955 = c11231.m27795();
                                            int i4 = i3;
                                            long readLong = c11231.m27796(8).readLong();
                                            if (m277955 < i || m277955 > 261 || m277955 == i2 || m277955 == 255 || zArr[m277955] || readLong < 0 || readLong > c11231.f33676) {
                                                throw new IOException("Invalid legacy app state field");
                                            }
                                            zArr[m277955] = true;
                                            C11231 c112312 = new C11231(readLong, c11231);
                                            try {
                                                interfaceC18286.mo11285(m277955, readLong, c112312);
                                                c112312.f33677 = false;
                                                for (long j2 = c112312.f33676; j2 != 0; j2 -= c11231.read(bArr, 0, (int) Math.min(j2, 8192))) {
                                                }
                                                i3 = i4 + 1;
                                                i = 1;
                                                i2 = 3;
                                            } catch (Throwable th) {
                                                c112312.f33677 = false;
                                                throw th;
                                            }
                                        }
                                        if (!zArr[256] || !zArr[257] || !zArr[258] || c11231.f33676 != 0 || inputStream.read() != -1) {
                                            throw new IOException("Incomplete or trailing legacy app state fields");
                                        }
                                        m3921.close();
                                        inputStream.close();
                                        return;
                                    }
                                }
                                throw new IOException("Invalid legacy app state header");
                            } catch (Throwable th2) {
                                th = th2;
                                Throwable th3 = th;
                                try {
                                    m3921.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            inputStream.close();
                            throw th6;
                        } catch (Throwable th7) {
                            th6.addSuppressed(th7);
                            throw th6;
                        }
                    }
                }
                throw new IOException("Invalid legacy app state length");
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f53734) {
            return;
        }
        this.f53734 = true;
        this.f53731.close();
    }
}
