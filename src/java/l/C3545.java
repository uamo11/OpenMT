package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;

/* compiled from: 466O */
/* renamed from: l.ۗ᩺ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3545 implements Cloneable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte[] f11258;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f11259;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C3545 f11262;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public byte[] f11264;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f11266;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public String f11269;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public int f11270;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public byte[] f11271;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public String f11272;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f11273;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f11274;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8484 f11275;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f11276;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f11277;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f11278 = 0;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f11267 = -1;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f11261 = -1;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f11257 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f11265 = 0;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f11268 = -1;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f11263 = -1;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f11260 = -1;

    public C3545() {
    }

    public C3545(String str) {
        m10788(str);
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m10795() {
        return this.f11278;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m10812(int i) {
        this.f11278 = i;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m10786() {
        return (this.f11277 & 2048) != 0;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m10796() {
        return this.f11277;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m10802(int i) {
        this.f11277 = i;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m10767() {
        return this.f11270;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m10814(int i) {
        this.f11270 = i;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m10808() {
        return (this.f11277 & 1) != 0;
    }

    public final long getTime() {
        return this.f11274;
    }

    public final void setTime(long j) {
        this.f11274 = j;
        m10765();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m10782() {
        return this.f11266;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m10791() {
        return this.f11266 & 4294967295L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10769(int i) {
        this.f11266 = i;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m10793() {
        return this.f11267;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10770(long j) {
        this.f11267 = j;
    }

    public final long getSize() {
        return this.f11261;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10805(long j) {
        this.f11261 = j;
    }

    public final String getName() {
        return this.f11272;
    }

    public final boolean isDirectory() {
        return this.f11272.endsWith("/");
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m10813() {
        String str = this.f11269;
        return str == null ? this.f11272 : str;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m10783() {
        return this.f11272.replaceAll("[:\\\\*?<>\"|]", "_").replaceAll("\\s", " ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10788(String str) {
        if (str == null) {
            str = "";
        }
        this.f11272 = str;
        this.f11269 = null;
        m10765();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m10801() {
        return this.f11259;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10771(String str) {
        this.f11259 = str;
        m10765();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final byte[] m10766() {
        return this.f11264;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10775(C15538 c15538) {
        this.f11264 = C8484.m22153(19796, this.f11264, c15538.m36636());
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C15538 m10780() {
        C8484 m22152 = C8484.m22152(19796, this.f11264);
        if (m22152 == null) {
            return null;
        }
        C15538 c15538 = new C15538();
        c15538.m36635(m22152.m22157());
        return c15538;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m10807() {
        return this.f11276;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10800(byte[] bArr) {
        this.f11264 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10776(byte[] bArr) {
        this.f11276 = bArr;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m10809() {
        return this.f11257;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10794(int i) {
        this.f11257 = i;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m10784() {
        return this.f11265;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10804(int i) {
        this.f11265 = i;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int m10778() {
        if (this.f11278 != 3) {
            return 0;
        }
        return (this.f11265 >> 16) & 65535;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m10785() {
        return this.f11260;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m10792() {
        return this.f11260 == 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10798(int i) {
        this.f11260 = i;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m10777() {
        return this.f11268;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10799(long j) {
        this.f11268 = j;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m10811() {
        return this.f11263;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10787(long j) {
        this.f11263 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10768() {
        C8484 c8484 = this.f11275;
        C11003.requireNonNull(c8484);
        return c8484.m22157()[4] & 255;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m10797() {
        C8484 c8484 = this.f11275;
        if (c8484 == null || c8484.m22157().length < 2) {
            throw new IOException(C9045.m23341(new StringBuilder("Missing or invalid AES extra data ("), this.f11272, MotionUtils.EASING_TYPE_FORMAT_END));
        }
        byte[] m22157 = this.f11275.m22157();
        return ((m22157[1] & 255) << 8) | (m22157[0] & 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10774(C8484 c8484) {
        this.f11275 = c8484;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m10803(byte[] bArr) {
        C8484 m22152 = C8484.m22152(1, bArr);
        int i = 0;
        if (m22152 != null) {
            if (this.f11261 == 4294967295L) {
                this.f11261 = m22152.m22156(0);
                i = 8;
            }
            if (this.f11267 == 4294967295L) {
                this.f11267 = m22152.m22156(i);
                i += 8;
            }
            if (this.f11268 == 4294967295L) {
                this.f11268 = m22152.m22156(i);
            }
            return true;
        }
        if (this.f11267 != 4294967295L && this.f11261 != 4294967295L && this.f11268 != 4294967295L) {
            return false;
        }
        throw new IOException("File contains no zip64 extended information: name=" + new String(this.f11271) + ", compressedSize=" + this.f11267 + ", size=" + this.f11261 + ", headerOffset=" + this.f11268 + ", extra=" + C14460.m34531(bArr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10772(Charset charset, boolean z, boolean z2) {
        byte[] bArr = this.f11264;
        if (bArr == null || bArr.length == 0) {
            z = false;
        }
        String m10764 = z ? m10764(C8484.m22152(28789, bArr), this.f11271) : null;
        if (m10764 == null) {
            m10764 = new String(this.f11271, charset);
        }
        if (!z2 && m10764.indexOf(92) != -1 && m10764.indexOf(47) == -1) {
            this.f11272 = m10764.replace('\\', '/');
            this.f11269 = m10764;
        } else {
            this.f11272 = m10764;
            this.f11269 = null;
        }
        this.f11271 = null;
        if (this.f11258 == null) {
            return;
        }
        String m107642 = z ? m10764(C8484.m22152(25461, this.f11264), this.f11258) : null;
        if (m107642 == null) {
            m107642 = new String(this.f11258, charset);
        }
        m10771(m107642);
        this.f11258 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10764(C8484 c8484, byte[] bArr) {
        byte[] m22157;
        int length;
        if (c8484 == null || bArr == null || (length = (m22157 = c8484.m22157()).length) < 5 || c8484.m22159() != 1) {
            return null;
        }
        int m22158 = c8484.m22158();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        if (m22158 != ((int) crc32.getValue())) {
            return null;
        }
        return new String(m22157, 5, length - 5, StandardCharsets.UTF_8);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10806(byte[] bArr) {
        this.f11271 = bArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10789(byte[] bArr) {
        this.f11258 = bArr;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String m10810() {
        if (this.f11272.isEmpty()) {
            return "";
        }
        int length = this.f11272.length();
        int i = length - 1;
        if (this.f11272.charAt(i) == '/') {
            i = length - 2;
        }
        return this.f11272.substring(this.f11272.lastIndexOf(47, i) + 1, i + 1);
    }

    public final String getParent() {
        if (this.f11272.isEmpty()) {
            return null;
        }
        int length = this.f11272.length();
        int i = length - 1;
        if (this.f11272.charAt(i) == '/') {
            i = length - 2;
        }
        int lastIndexOf = this.f11272.lastIndexOf(47, i) + 1;
        return lastIndexOf == 0 ? "" : this.f11272.substring(0, lastIndexOf);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10773(C3545 c3545) {
        this.f11262 = c3545;
        if (c3545.f11273 == null) {
            c3545.f11273 = new ArrayList();
        }
        c3545.f11273.add(this);
        ArrayList arrayList = this.f11273;
        if (arrayList != null) {
            this.f11273 = null;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C3545 c35452 = (C3545) it.next();
                c35452.f11262 = null;
                c35452.m10773(c3545);
            }
        }
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m10781() {
        return this.f11273 != null;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m10790() {
        return this.f11262 != null;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C3545 m10779() {
        return this.f11262;
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m10765() {
        C3545 c3545 = this.f11262;
        if (c3545 != null) {
            c3545.f11273.remove(this);
            if (c3545.f11273.isEmpty()) {
                c3545.f11273 = null;
            }
            this.f11262 = null;
        }
    }

    public final C3545 clone() {
        try {
            C3545 c3545 = (C3545) super.clone();
            C8484 c8484 = this.f11275;
            if (c8484 != null) {
                c3545.f11275 = c8484.m22160clone();
            }
            return c3545;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
