package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: U6T0 */
/* renamed from: l.ۛۘᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5816 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f17864;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f17865;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Map f17866;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f17867;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17868;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f17869;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f17870;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f17871;

    public C5816(boolean z, boolean z2, boolean z3, int i, int i2, int i3, String str, HashMap hashMap) {
        this.f17867 = z;
        this.f17870 = z2;
        this.f17869 = z3;
        this.f17865 = i;
        this.f17868 = i2;
        this.f17871 = i3;
        this.f17864 = str;
        this.f17866 = hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5816 m16316(int i, long j, InputStream inputStream) {
        C23930 m52696 = C23930.m52696(j, inputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy parameters exceed app state limit");
            }
            if (!m52696.m52703()) {
                m52696.m52709();
                C5816 c5816 = new C5816(false, false, false, 0, 0, 0, null, null);
                m52696.close();
                return c5816;
            }
            int readByte = m52696.readByte();
            int m52704 = m52696.m52704();
            boolean m52703 = m52696.m52703();
            m52696.readByte();
            int readInt = m52696.readInt();
            String m52705 = m52696.m52703() ? m52696.m52705(i) : null;
            boolean m527032 = m52696.m52703();
            int readInt2 = m52696.readInt();
            if (readInt2 < 0 || readInt2 > m52696.m52707() / 20) {
                throw new IOException("Invalid legacy attribute count");
            }
            HashMap hashMap = new HashMap();
            int i2 = 0;
            while (i2 < readInt2) {
                String m52708 = m52696.m52708(i);
                int readInt3 = m52696.readInt();
                int readInt4 = m52696.readInt();
                String m527082 = m52696.m52708(i);
                int readInt5 = m52696.readInt();
                if (readInt5 >= 0) {
                    boolean z = m527032;
                    if (readInt5 <= m52696.m52707() / 12) {
                        C14692[] c14692Arr = new C14692[readInt5];
                        int i3 = 0;
                        while (i3 < readInt5) {
                            c14692Arr[i3] = new C14692(m52696.readInt(), m52696.readInt(), m52696.m52708(i));
                            i3++;
                            readInt2 = readInt2;
                            readInt5 = readInt5;
                        }
                        hashMap.put(m52708, new C16809(readInt3, m527082, c14692Arr, readInt4));
                        i2++;
                        m527032 = z;
                        readInt2 = readInt2;
                    }
                }
                throw new IOException("Invalid legacy attribute count");
            }
            m52696.m52709();
            C5816 c58162 = new C5816(true, m527032, m52703, readByte, m52704, readInt, m52705, hashMap);
            m52696.close();
            return c58162;
        } catch (Throwable th) {
            try {
                m52696.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23077 m16317() {
        C12534 c12534 = null;
        if (!this.f17867) {
            return null;
        }
        String str = this.f17864;
        AbstractC15440 m39866 = str == null ? null : C16999.m39866(str, new String[0]);
        if (this.f17870) {
            if (m39866 != null && m39866.mo23120()) {
                try {
                    C12534 c125342 = new C12534(m39866);
                    c125342.m30773();
                    c12534 = c125342;
                } catch (Throwable unused) {
                }
            }
            if (c12534 == null) {
                c12534 = new C12534();
            }
        }
        return new C23077(this.f17865, this.f17868, this.f17869, this.f17871, m39866, c12534, this.f17866);
    }
}
