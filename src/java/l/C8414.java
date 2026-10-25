package l;

import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: V8EI */
/* renamed from: l.۠᩷֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8414 extends AbstractC19704 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public ArrayList f25767;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C1358 f25768;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f25769;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f25770;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final byte[] f25771;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f25772;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f25773;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public HashMap f25774;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f25775;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f25776;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f25777;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC23230 f25778;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f25779;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ArrayList f25780;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    public C8414(InputStream inputStream, int i, String str) {
        super(inputStream, str);
        this.f25771 = new byte[256];
        this.f25774 = new HashMap();
        this.f25780 = new ArrayList();
        this.f25778 = AbstractC14057.m33658(str);
        this.f25777 = new byte[512];
        this.f25769 = i;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m22021() {
        this.f25773 = true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (isDirectory()) {
            return 0;
        }
        long m4765 = this.f25768.m4765() - this.f25772;
        if (m4765 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) m4765;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22017() {
        this.f25776 = -1;
        this.f25767 = new ArrayList();
        List<C4886> m4764 = this.f25768.m4764();
        C20409 c20409 = new C20409();
        long j = 0;
        for (C4886 c4886 : m4764) {
            long m14237 = c4886.m14237() - j;
            if (m14237 < 0) {
                throw new IOException("Corrupted struct sparse detected");
            }
            if (m14237 > 0) {
                this.f25767.add(new C10906(c4886.m14237() - j, c20409));
            }
            if (c4886.m14236() > 0) {
                this.f25767.add(new C10906(c4886.m14236(), ((FilterInputStream) this).in));
            }
            j = c4886.m14237() + c4886.m14236();
        }
        if (this.f25767.isEmpty()) {
            return;
        }
        this.f25776 = 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.f25767;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InputStream) it.next()).close();
            }
        }
        ((FilterInputStream) this).in.close();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1358 m22023() {
        return this.f25768;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m22024() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            byte[] bArr = this.f25771;
            int read = read(bArr);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        m22022();
        if (this.f25768 == null) {
            return null;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        while (length > 0 && byteArray[length - 1] == 0) {
            length--;
        }
        return length != byteArray.length ? Arrays.copyOf(byteArray, length) : byteArray;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private byte[] m22018() {
        boolean z;
        byte[] m22025 = m22025();
        boolean z2 = false;
        if (m22025 != null) {
            int length = this.f25777.length;
            for (int i = 0; i < length; i++) {
                if (m22025[i] != 0) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        this.f25779 = z;
        if (!z || m22025 == null) {
            return m22025;
        }
        this.f25775 = true;
        boolean markSupported = ((FilterInputStream) this).in.markSupported();
        if (markSupported) {
            ((FilterInputStream) this).in.mark(this.f25777.length);
        }
        try {
            byte[] m220252 = m22025();
            if (m220252 != null) {
                int length2 = this.f25777.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    if (m220252[i2] != 0) {
                        break;
                    }
                }
            }
            z2 = true;
            if (!z2 && markSupported) {
            }
            long m45393 = m45393() % this.f25769;
            if (m45393 <= 0) {
                return null;
            }
            m45395(C22194.m49845(this.f25769 - m45393, ((FilterInputStream) this).in));
            return null;
        } finally {
            if (markSupported) {
                m45396(this.f25777.length);
                ((FilterInputStream) this).in.reset();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        if (i2 == 0) {
            return 0;
        }
        if (!this.f25779 && !isDirectory()) {
            C1358 c1358 = this.f25768;
            if (c1358 == null) {
                throw new IllegalStateException("No current tar entry");
            }
            if (this.f25772 < c1358.m4765()) {
                int min = Math.min(i2, available());
                if (this.f25768.m4753()) {
                    read = m22019(i, min, bArr);
                } else {
                    read = ((FilterInputStream) this).in.read(bArr, i, min);
                }
                if (read != -1) {
                    m45394(read);
                    this.f25772 += read;
                    return read;
                }
                if (min > 0) {
                    throw new IOException("Truncated TAR archive");
                }
                this.f25779 = true;
                return read;
            }
        }
        return -1;
    }

    @Deprecated
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1358 m22022() {
        C22525 c22525;
        if (!this.f25779) {
            if (this.f25768 != null) {
                C22194.m49845(C13132.FOREVER_NS, this);
                if (!isDirectory()) {
                    long j = this.f25770;
                    if (j > 0 && j % this.f25777.length != 0) {
                        long available = ((FilterInputStream) this).in.available();
                        long j2 = this.f25770;
                        byte[] bArr = this.f25777;
                        long length = (((j2 / bArr.length) + 1) * bArr.length) - j2;
                        long m49845 = C22194.m49845(length, ((FilterInputStream) this).in);
                        if (((FilterInputStream) this).in instanceof FileInputStream) {
                            m49845 = Math.min(m49845, available);
                        }
                        if (m49845 != length) {
                            throw new IOException("Truncated TAR archive");
                        }
                        m45395(m49845);
                    }
                }
            }
            byte[] m22018 = m22018();
            if (m22018 == null) {
                if (this.f25773 && !this.f25775) {
                    throw new IOException("Missing TAR end marker");
                }
                this.f25768 = null;
                return null;
            }
            try {
                C1358 c1358 = new C1358(this.f25774, m22018, this.f25778);
                this.f25768 = c1358;
                if (this.f25773 && !c1358.m4757()) {
                    throw new IOException("Invalid TAR header checksum (" + this.f25768.m4741() + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                this.f25772 = 0L;
                this.f25770 = this.f25768.m4729();
                if (this.f25768.m4742()) {
                    byte[] m22024 = m22024();
                    if (m22024 == null) {
                        if (this.f25773) {
                            throw new IOException("Missing TAR entry after GNU long link header");
                        }
                    } else {
                        this.f25768.m4752(this.f25778.mo29129(0, m22024.length, m22024));
                    }
                }
                if (this.f25768.m4740()) {
                    byte[] m220242 = m22024();
                    if (m220242 == null) {
                        if (this.f25773) {
                            throw new IOException("Missing TAR entry after GNU long name header");
                        }
                    } else {
                        String mo29129 = this.f25778.mo29129(0, m220242.length, m220242);
                        this.f25768.m4760(mo29129);
                        if (this.f25768.m4768() && !mo29129.endsWith("/")) {
                            this.f25768.m4760(mo29129.concat("/"));
                        }
                    }
                }
                if (this.f25768.m4755()) {
                    this.f25774 = C6297.m17334(this, this.f25780, this.f25774, this.f25770);
                    m22022();
                    if (this.f25768 == null) {
                        throw new IOException("Error detected parsing the pax header");
                    }
                }
                try {
                    if (this.f25768.m4744()) {
                        m22020();
                    } else if (!this.f25774.isEmpty()) {
                        HashMap hashMap = this.f25774;
                        ArrayList arrayList = this.f25780;
                        this.f25768.m4736(hashMap);
                        this.f25768.m4735(arrayList);
                    }
                    if (this.f25768.m4754()) {
                        if (this.f25768.m4769()) {
                            do {
                                byte[] m220182 = m22018();
                                if (m220182 == null) {
                                    throw new IOException("premature end of tar archive. Didn't find extended_header after header with extended flag.");
                                }
                                c22525 = new C22525(m220182);
                                this.f25768.m4743().addAll(c22525.m50520());
                            } while (c22525.m50521());
                        }
                        m22017();
                    }
                    this.f25770 = this.f25768.m4729();
                    return this.f25768;
                } catch (NumberFormatException e) {
                    throw new IOException("Error detected parsing the pax header", e);
                }
            } catch (IllegalArgumentException e2) {
                throw new IOException("Error detected parsing the header", e2);
            }
        }
        return null;
    }

    private boolean isDirectory() {
        C1358 c1358 = this.f25768;
        return c1358 != null && c1358.m4768();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m22020() {
        ArrayList arrayList = new ArrayList();
        HashMap m17334 = C6297.m17334(this, arrayList, this.f25774, this.f25770);
        if (m17334.containsKey("GNU.sparse.map")) {
            arrayList = new ArrayList(C6297.m17335((String) m17334.get("GNU.sparse.map")));
        }
        m22022();
        C1358 c1358 = this.f25768;
        if (c1358 != null) {
            c1358.m4736(m17334);
            this.f25768.m4735(arrayList);
            if (this.f25768.m4749()) {
                this.f25768.m4735(C6297.m17333(((FilterInputStream) this).in, this.f25777.length));
            }
            m22017();
            return;
        }
        throw new IOException("premature end of tar archive. Didn't find any entry after PAX header.");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] m22025() {
        InputStream inputStream = ((FilterInputStream) this).in;
        byte[] bArr = this.f25777;
        int length = bArr.length;
        if (length < 0 || length > bArr.length || length < 0) {
            throw new IndexOutOfBoundsException();
        }
        int m49844 = C22194.m49844(inputStream, bArr, length);
        m45394(m49844);
        byte[] bArr2 = this.f25777;
        if (m49844 == bArr2.length) {
            return bArr2;
        }
        if (!this.f25773) {
            return null;
        }
        if (m49844 > 0 || m45393() == 0) {
            throw new IOException("Truncated TAR archive");
        }
        return null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m22019(int i, int i2, byte[] bArr) {
        ArrayList arrayList = this.f25767;
        if (arrayList == null || arrayList.isEmpty()) {
            return ((FilterInputStream) this).in.read(bArr, i, i2);
        }
        if (this.f25776 >= this.f25767.size()) {
            return -1;
        }
        int read = ((InputStream) this.f25767.get(this.f25776)).read(bArr, i, i2);
        if (this.f25776 == this.f25767.size() - 1) {
            return read;
        }
        if (read == -1) {
            this.f25776++;
            return m22019(i, i2, bArr);
        }
        if (read >= i2) {
            return read;
        }
        this.f25776++;
        int m22019 = m22019(i + read, i2 - read, bArr);
        return m22019 == -1 ? read : read + m22019;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        if (j > 0 && !isDirectory()) {
            long available = ((FilterInputStream) this).in.available();
            long min = Math.min(j, this.f25768.m4765() - this.f25772);
            if (!this.f25768.m4753()) {
                j2 = C22194.m49845(min, ((FilterInputStream) this).in);
                if (((FilterInputStream) this).in instanceof FileInputStream) {
                    j2 = Math.min(j2, available);
                }
                if (j2 != min) {
                    throw new IOException("Truncated TAR archive");
                }
            } else {
                ArrayList arrayList = this.f25767;
                if (arrayList == null || arrayList.isEmpty()) {
                    j2 = ((FilterInputStream) this).in.skip(min);
                } else {
                    while (j2 < min && this.f25776 < this.f25767.size()) {
                        j2 += ((InputStream) this.f25767.get(this.f25776)).skip(min - j2);
                        if (j2 < min) {
                            this.f25776++;
                        }
                    }
                }
            }
            m45395(j2);
            this.f25772 += j2;
        }
        return j2;
    }
}
