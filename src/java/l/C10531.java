package l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: Z8F1 */
/* renamed from: l.ۤ᩷֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C10531 implements Closeable {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f31597;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1358 f31599;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23411 f31600;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC23230 f31602;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final byte[] f31596 = new byte[256];

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f31593 = new LinkedHashMap();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f31598 = new ArrayList();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public HashMap f31592 = new HashMap();

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f31594 = 512;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f31595 = ByteBuffer.allocate(512);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f31601 = 10240;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10531 m26448(AbstractC15440 abstractC15440) {
        return new C13352(abstractC15440.m36513("r"), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0082, code lost:
    
        if (r0 == 8) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10531(l.C23411 r6, java.lang.String r7) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r5.f31596 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r5.f31593 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.f31598 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5.f31592 = r0
            r5.f31600 = r6
            l.᩺᩷֡ r7 = l.AbstractC14057.m33658(r7)
            r5.f31602 = r7
            r7 = 512(0x200, float:7.17E-43)
            r5.f31594 = r7
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            r5.f31595 = r7
            r7 = 10240(0x2800, float:1.4349E-41)
            r5.f31601 = r7
            r7 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r7)
            int r1 = r6.read(r0)
            if (r1 >= r7) goto L41
            goto L85
        L41:
            r0.flip()
            byte[] r7 = new byte[r7]
            r0.get(r7)
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            r0.<init>(r7, r1)
            java.lang.String r7 = "MIUI BACKUP\n"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L85
            r7 = 1
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            r0 = 0
            r1 = 0
        L5f:
            r2 = 8
            if (r0 >= r2) goto L82
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 >= r3) goto L82
            r7.clear()
            int r3 = r6.read(r7)
            r4 = -1
            if (r3 != r4) goto L72
            goto L82
        L72:
            int r1 = r1 + 1
            r7.flip()
            byte r2 = r7.get()
            r3 = 10
            if (r2 != r3) goto L5f
            int r0 = r0 + 1
            goto L5f
        L82:
            if (r0 != r2) goto L85
            goto L8a
        L85:
            r0 = 0
            r6.seek(r0)
        L8a:
            l.֨᩷֡ r6 = r5.mo26455()
            if (r6 == 0) goto Lac
            java.lang.String r7 = r6.m4741()
            boolean r0 = r6.m4768()
            if (r0 == 0) goto La6
            java.lang.String r0 = "/"
            boolean r1 = r7.endsWith(r0)
            if (r1 != 0) goto La6
            java.lang.String r7 = r7.concat(r0)
        La6:
            java.util.LinkedHashMap r0 = r5.f31593
            r0.put(r7, r6)
            goto L8a
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10531.<init>(l.᩻ۖܽ, java.lang.String):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m26450(C1358 c1358) {
        ArrayList arrayList = new ArrayList();
        List<C4886> m4764 = c1358.m4764();
        C20409 c20409 = new C20409();
        long j = 0;
        long j2 = 0;
        for (C4886 c4886 : m4764) {
            long m14237 = c4886.m14237() - j;
            if (m14237 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (m14237 > 0) {
                arrayList.add(new C10906(m14237, c20409));
                j2 += m14237;
            }
            if (c4886.m14236() > 0) {
                long m142372 = (c4886.m14237() + c1358.m4750()) - j2;
                if (c4886.m14236() + m142372 < m142372) {
                    throw new IOException("Unreadable TAR archive, sparse block offset or length too big");
                }
                arrayList.add(new C16549(m142372, c4886.m14236(), this.f31600));
            }
            j = c4886.m14237() + c4886.m14236();
        }
        long m4765 = c1358.m4765() - j;
        if (m4765 < 0) {
            throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
        }
        if (m4765 > 0) {
            arrayList.add(new C10906(m4765, c20409));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f31600.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m26454() {
        ArrayList arrayList = new ArrayList(this.f31593.values());
        Collections.sort(arrayList, new C3475());
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m26453(C1358 c1358) {
        try {
            return new C12647(this, c1358, this.f31600, c1358.m4753() ? m26450(c1358) : Collections.EMPTY_LIST);
        } catch (RuntimeException e) {
            throw new IOException("Corrupted TAR archive. Can't read entry", e);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private byte[] m26451() {
        byte[] bArr = this.f31596;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        InputStream m26453 = m26453(this.f31599);
        while (true) {
            try {
                int read = m26453.read(bArr);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    m26453.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m26453.close();
        mo26455();
        if (this.f31599 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C1358 mo26455() {
        C22525 c22525;
        InterfaceC23230 interfaceC23230 = this.f31602;
        if (!this.f31597) {
            C1358 c1358 = this.f31599;
            C23411 c23411 = this.f31600;
            int i = this.f31594;
            if (c1358 != null) {
                long m4729 = this.f31599.m4729() + c1358.m4750();
                if (m4729 < c23411.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c23411.seek(m4729);
                if (c23411.length() < c23411.getFilePointer()) {
                    throw new IOException("Truncated TAR archive");
                }
                C1358 c13582 = this.f31599;
                if ((c13582 == null || !c13582.m4768()) && this.f31599.m4729() > 0) {
                    long j = i;
                    if (this.f31599.m4729() % j != 0) {
                        long filePointer = c23411.getFilePointer() + ((((this.f31599.m4729() / j) + 1) * j) - this.f31599.m4729());
                        if (filePointer < c23411.getFilePointer()) {
                            throw new IOException("trying to move backwards inside of the archive");
                        }
                        c23411.seek(filePointer);
                        if (c23411.length() < c23411.getFilePointer()) {
                            throw new IOException("Truncated TAR archive");
                        }
                    }
                }
            }
            ByteBuffer m26452 = m26452();
            if (m26452 == null) {
                this.f31599 = null;
                return null;
            }
            try {
                long filePointer2 = c23411.getFilePointer();
                C1358 c13583 = new C1358(this.f31592, m26452.array(), interfaceC23230);
                c13583.m4733(filePointer2);
                this.f31599 = c13583;
                if (c13583.m4742()) {
                    byte[] m26451 = m26451();
                    if (m26451 != null) {
                        this.f31599.m4752(interfaceC23230.mo29129(0, m26451.length, m26451));
                    }
                }
                if (this.f31599.m4740()) {
                    byte[] m264512 = m26451();
                    if (m264512 != null) {
                        String mo29129 = interfaceC23230.mo29129(0, m264512.length, m264512);
                        this.f31599.m4760(mo29129);
                        if (this.f31599.m4768() && !mo29129.endsWith("/")) {
                            this.f31599.m4760(mo29129.concat("/"));
                        }
                    }
                }
                boolean m4755 = this.f31599.m4755();
                ArrayList arrayList = this.f31598;
                if (m4755) {
                    InputStream m26453 = m26453(this.f31599);
                    try {
                        this.f31592 = C6297.m17334(m26453, arrayList, this.f31592, this.f31599.m4729());
                        m26453.close();
                        mo26455();
                        if (this.f31599 == null) {
                            throw new IOException("Error detected parsing the pax header");
                        }
                    } catch (Throwable th) {
                        try {
                            m26453.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                try {
                    if (this.f31599.m4744()) {
                        m26449();
                    } else if (!this.f31592.isEmpty()) {
                        this.f31599.m4736(this.f31592);
                        this.f31599.m4735(arrayList);
                    }
                    if (this.f31599.m4754() && this.f31599.m4769()) {
                        do {
                            ByteBuffer m264522 = m26452();
                            if (m264522 == null) {
                                throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                            }
                            c22525 = new C22525(m264522.array());
                            this.f31599.m4743().addAll(c22525.m50520());
                            C1358 c13584 = this.f31599;
                            c13584.m4733(c13584.m4750() + i);
                        } while (c22525.m50521());
                    }
                    return this.f31599;
                } catch (NumberFormatException e) {
                    throw new IOException("Error detected parsing the pax header", e);
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m26449() {
        int i = this.f31594;
        ArrayList arrayList = new ArrayList();
        InputStream m26453 = m26453(this.f31599);
        try {
            HashMap m17334 = C6297.m17334(m26453, arrayList, this.f31592, this.f31599.m4729());
            m26453.close();
            if (m17334.containsKey("GNU.sparse.map")) {
                arrayList = new ArrayList(C6297.m17335((String) m17334.get("GNU.sparse.map")));
            }
            mo26455();
            C1358 c1358 = this.f31599;
            if (c1358 != null) {
                c1358.m4736(m17334);
                this.f31599.m4735(arrayList);
                if (this.f31599.m4749()) {
                    C23411 c23411 = this.f31600;
                    long filePointer = c23411.getFilePointer();
                    C16549 c16549 = new C16549(this.f31599.m4750(), this.f31599.m4729(), this.f31600);
                    try {
                        ArrayList m17333 = C6297.m17333(c16549, i);
                        c16549.close();
                        this.f31599.m4735(m17333);
                        long filePointer2 = c23411.getFilePointer() - filePointer;
                        if (filePointer2 < 0 || filePointer2 > this.f31599.m4729() || filePointer2 % i != 0) {
                            throw new IOException("Corrupted TAR archive. Invalid sparse headers size");
                        }
                        C1358 c13582 = this.f31599;
                        c13582.m4751(c13582.m4729() - filePointer2);
                        C1358 c13583 = this.f31599;
                        c13583.m4733(c13583.m4750() + filePointer2);
                        return;
                    } catch (Throwable th) {
                        try {
                            c16549.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return;
            }
            throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
        } catch (Throwable th3) {
            try {
                m26453.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private ByteBuffer m26452() {
        boolean z;
        ByteBuffer byteBuffer = this.f31595;
        byteBuffer.rewind();
        C23411 c23411 = this.f31600;
        int read = c23411.read(byteBuffer);
        int i = this.f31594;
        ByteBuffer byteBuffer2 = read != i ? null : byteBuffer;
        boolean z2 = true;
        if (byteBuffer2 != null) {
            byte[] array = byteBuffer2.array();
            for (int i2 = 0; i2 < i; i2++) {
                if (array[i2] != 0) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f31597 = z;
        if (!z || byteBuffer2 == null) {
            return byteBuffer2;
        }
        try {
            byteBuffer.rewind();
            if (c23411.read(byteBuffer) != i) {
                byteBuffer = null;
            }
            if (byteBuffer != null) {
                byte[] array2 = byteBuffer.array();
                int i3 = 0;
                while (true) {
                    if (i3 >= i) {
                        break;
                    }
                    if (array2[i3] != 0) {
                        z2 = false;
                        break;
                    }
                    i3++;
                }
            }
            if (!z2) {
            }
            long filePointer = c23411.getFilePointer();
            long j = this.f31601;
            long j2 = filePointer % j;
            if (j2 > 0) {
                long filePointer2 = c23411.getFilePointer() + (j - j2);
                if (filePointer2 < c23411.getFilePointer()) {
                    throw new IOException("trying to move backwards inside of the archive");
                }
                c23411.seek(filePointer2);
            }
            return null;
        } finally {
            c23411.seek(c23411.getFilePointer() - i);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m26456() {
        this.f31597 = true;
    }
}
