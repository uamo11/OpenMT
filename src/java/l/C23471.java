package l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: N7SN */
/* renamed from: l.᩻ۙܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23471 extends AbstractC13301 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f75307;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f75308;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f75309;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f75310;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f75311;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f75312;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC9361 f75313;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC8655 f75314;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f75315;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f75316;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f75317;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f75318;

    public C23471(String str, EnumC8655 enumC8655, boolean z, boolean z2, long j, long j2, long j3, long j4, EnumC9361 enumC9361, String str2, boolean z3, boolean z4) {
        this.f75317 = str;
        this.f75314 = enumC8655;
        this.f75309 = z;
        this.f75307 = z2;
        this.f75318 = j;
        this.f75315 = j2;
        this.f75308 = j3;
        this.f75312 = j4;
        this.f75313 = enumC9361;
        this.f75311 = str2;
        this.f75316 = z3;
        this.f75310 = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23471)) {
            return false;
        }
        C23471 c23471 = (C23471) obj;
        return this.f75309 == c23471.f75309 && this.f75307 == c23471.f75307 && this.f75316 == c23471.f75316 && this.f75310 == c23471.f75310 && this.f75318 == c23471.f75318 && this.f75315 == c23471.f75315 && this.f75308 == c23471.f75308 && this.f75312 == c23471.f75312 && C11003.equals(this.f75317, c23471.f75317) && C11003.equals(this.f75314, c23471.f75314) && C11003.equals(this.f75313, c23471.f75313) && C11003.equals(this.f75311, c23471.f75311);
    }

    public final int hashCode() {
        int i = (((((this.f75309 ? 1231 : 1237) * 31) + (this.f75307 ? 1231 : 1237)) * 31) + (this.f75316 ? 1231 : 1237)) * 31;
        int i2 = this.f75310 ? 1231 : 1237;
        long j = this.f75318;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f75315;
        int i4 = (i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f75308;
        int i5 = (i4 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f75312;
        return C11003.hashCode(this.f75311) + ((C11003.hashCode(this.f75313) + ((C11003.hashCode(this.f75314) + C20361.m46680((i5 + ((int) (j4 ^ (j4 >>> 32)))) * 31, 31, this.f75317)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f75317, this.f75314, Boolean.valueOf(this.f75309), Boolean.valueOf(this.f75307), Long.valueOf(this.f75318), Long.valueOf(this.f75315), Long.valueOf(this.f75308), Long.valueOf(this.f75312), this.f75313, this.f75311, Boolean.valueOf(this.f75316), Boolean.valueOf(this.f75310)};
        String[] split = "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".length() == 0 ? new String[0] : "pattern;filenameMode;searchSub;advance;minSize;maxSize;minTime;maxTime;timePreset;content;matchCase;regex".split(l.b);
        StringBuilder sb = new StringBuilder("FileSearchInputRecord[");
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != split.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m51913() {
        return this.f75310;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51914() {
        return this.f75307;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m51916() {
        return this.f75312;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m51917() {
        return this.f75318;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m51918() {
        return this.f75315;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC8655 m51919() {
        return this.f75314;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m51920() {
        return this.f75309;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m51922() {
        return this.f75311;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long m51923() {
        return this.f75308;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m51924() {
        return this.f75317;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC9361 m51925() {
        return this.f75313;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51926() {
        return this.f75316;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m51911(byte[] bArr) {
        int i;
        if (bArr == null || bArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        C12951 c12951 = new C12951(bArr);
        try {
            int readByte = c12951.readByte() & 255;
            if (readByte > 100) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList(readByte);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= readByte) {
                    break;
                }
                String m31506 = c12951.m31506();
                String m315062 = c12951.m31506();
                byte readByte2 = c12951.readByte();
                int i4 = readByte2 & 255;
                boolean z = (readByte2 & 1) != 0;
                boolean z2 = (readByte2 & 2) != 0;
                boolean z3 = (readByte2 & 4) != 0;
                boolean z4 = (readByte2 & 8) != 0;
                boolean z5 = (readByte2 & 16) != 0;
                EnumC8655 m22414 = EnumC8655.m22414((i4 >> 5) & 7);
                long readLong = z ? c12951.readLong() : -1L;
                long readLong2 = z ? c12951.readLong() : -1L;
                if (readLong >= 0 && readLong == readLong2 && readLong2 != C13132.FOREVER_NS) {
                    readLong2++;
                }
                arrayList.add(new C23471(m31506, m22414, z2, z3, readLong, readLong2, -1L, -1L, null, m315062, z4, z5));
                i3++;
            }
            if (c12951.available() != 0) {
                try {
                    if (c12951.available() >= 6 && c12951.readInt() == 1179866194) {
                        int readByte3 = c12951.readByte() & 255;
                        int readByte4 = c12951.readByte() & 255;
                        if ((readByte3 == 1 || readByte3 == 2) && readByte4 == arrayList.size()) {
                            if (c12951.available() == readByte4 * (readByte3 == 1 ? 16L : 17L)) {
                                long[] jArr = new long[readByte4];
                                long[] jArr2 = new long[readByte4];
                                EnumC9361[] enumC9361Arr = new EnumC9361[readByte4];
                                while (i < readByte4) {
                                    jArr[i] = c12951.readLong();
                                    jArr2[i] = c12951.readLong();
                                    if (readByte3 >= 2) {
                                        enumC9361Arr[i] = EnumC9361.m24181(c12951.readByte() & 255);
                                    }
                                    long j = jArr[i];
                                    long j2 = jArr2[i];
                                    i = (j >= -1 && j2 >= -1 && (j == -1 || j2 == -1 || j < j2)) ? i + 1 : 0;
                                }
                                ArrayList arrayList2 = new ArrayList(readByte4);
                                while (i2 < readByte4) {
                                    C23471 c23471 = (C23471) arrayList.get(i2);
                                    long[] jArr3 = jArr2;
                                    EnumC9361[] enumC9361Arr2 = enumC9361Arr;
                                    int i5 = readByte4;
                                    arrayList2.add(new C23471(c23471.f75317, c23471.f75314, c23471.f75309, c23471.f75307, c23471.f75318, c23471.f75315, jArr[i2], jArr2[i2], enumC9361Arr[i2], c23471.f75311, c23471.f75316, c23471.f75310));
                                    i2++;
                                    jArr2 = jArr3;
                                    enumC9361Arr = enumC9361Arr2;
                                    readByte4 = i5;
                                }
                                return arrayList2;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
            return arrayList;
        } catch (RuntimeException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m51910(List list) {
        if (list.size() > 100) {
            throw new IllegalArgumentException("Too many file search records");
        }
        C10130 c10130 = new C10130();
        c10130.writeByte(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23471 c23471 = (C23471) it.next();
            long j = c23471.f75315;
            c10130.m25439(c23471.f75317);
            c10130.m25439(c23471.f75311);
            int m22418 = c23471.f75314.m22418() << 5;
            long j2 = c23471.f75318;
            if (j2 != -1 || j != -1) {
                m22418 |= 1;
            }
            if (c23471.f75309) {
                m22418 |= 2;
            }
            if (c23471.f75307) {
                m22418 |= 4;
            }
            if (c23471.f75316) {
                m22418 |= 8;
            }
            if (c23471.f75310) {
                m22418 |= 16;
            }
            c10130.writeByte(m22418);
            if (j2 != -1 || j != -1) {
                c10130.m25431(j2);
                c10130.m25431(j);
            }
        }
        c10130.writeInt(1179866194);
        c10130.writeByte(2);
        c10130.writeByte(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C23471 c234712 = (C23471) it2.next();
            c10130.m25431(c234712.f75308);
            c10130.m25431(c234712.f75312);
            EnumC9361 enumC9361 = c234712.f75313;
            c10130.writeByte(enumC9361 == null ? 0 : enumC9361.m24185());
        }
        return c10130.m25444();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51915(C23471 c23471) {
        boolean m51912;
        String str = c23471.f75317;
        String str2 = this.f75317;
        if (!str2.equals(str)) {
            return false;
        }
        if ((!str2.isEmpty() && this.f75314 != c23471.f75314) || this.f75309 != c23471.f75309 || (m51912 = m51912()) != c23471.m51912()) {
            return false;
        }
        if (!m51912) {
            return true;
        }
        if (this.f75318 != c23471.f75318 || this.f75315 != c23471.f75315) {
            return false;
        }
        EnumC9361 enumC9361 = c23471.f75313;
        EnumC9361 enumC93612 = this.f75313;
        if (enumC93612 != enumC9361) {
            return false;
        }
        if (enumC93612 == null && (this.f75308 != c23471.f75308 || this.f75312 != c23471.f75312)) {
            return false;
        }
        String str3 = c23471.f75311;
        String str4 = this.f75311;
        if (!str4.equals(str3)) {
            return false;
        }
        if (str4.isEmpty()) {
            return true;
        }
        return this.f75316 == c23471.f75316 && this.f75310 == c23471.f75310;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private boolean m51912() {
        if (this.f75307) {
            return (this.f75318 == -1 && this.f75315 == -1 && this.f75313 == null && this.f75308 == -1 && this.f75312 == -1 && this.f75311.isEmpty()) ? false : true;
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m51921() {
        String str = this.f75317;
        String replace = str.replace('\n', ' ');
        if (replace.isEmpty()) {
            replace = C4925.m14327(R.string.MT_Protector_res_0x7f1205b1);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        int length = spannableStringBuilder.length();
        if (!str.isEmpty()) {
            spannableStringBuilder.append((CharSequence) " [").append((CharSequence) C4925.m14327(this.f75314.m22416())).append((CharSequence) "]");
        }
        if (this.f75307) {
            long j = this.f75315;
            long j2 = this.f75318;
            if (j2 != -1 || j != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C4925.m14327(R.string.MT_Protector_res_0x7f1207be)).append((CharSequence) ": ").append((CharSequence) EnumC20650.m47232(j2, j));
            }
            long j3 = this.f75312;
            long j4 = this.f75308;
            EnumC9361 enumC9361 = this.f75313;
            if (enumC9361 != null || j4 != -1 || j3 != -1) {
                spannableStringBuilder.append('\n').append((CharSequence) C4925.m14327(R.string.MT_Protector_res_0x7f1203be)).append((CharSequence) ": ").append((CharSequence) (enumC9361 == null ? EnumC9361.m24180(j4, j3) : enumC9361.m24183()));
            }
            String str2 = this.f75311;
            if (!str2.isEmpty()) {
                spannableStringBuilder.append('\n').append((CharSequence) C4925.m14327(R.string.MT_Protector_res_0x7f1203bd)).append((CharSequence) ": ").append((CharSequence) C6554.m18061(50, str2).replace('\n', ' '));
            }
        }
        if (length < spannableStringBuilder.length()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70269), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }
}
