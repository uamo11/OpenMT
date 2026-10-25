package l;

import android.text.TextUtils;
import bin.mt.plus.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* compiled from: V7BB */
/* renamed from: l.ۧ᩵ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11204 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5414 f33623 = new C7654(206, "Partial Content");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5414 f33624 = new C7654(416, "Requested Range Not Satisfiable");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m27772(C15996 c15996) {
        C2031 m6607;
        String str;
        long j;
        InputStream c14003;
        EnumC4003 m37807 = c15996.m37807();
        if (!EnumC4003.GET.equals(m37807) && !EnumC4003.HEAD.equals(m37807)) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        String m40234 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
        if (TextUtils.isEmpty(m40234)) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12073e, new Object[0]));
        }
        String m402342 = C17140.m40234(c15996, "disposition");
        if (!"inline".equals(m402342) && !"attachment".equals(m402342)) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120826, "disposition"));
        }
        C9555 m18837 = C6970.m18837(m40234);
        if (m18837 == null || !m18837.mo24433().mo23120()) {
            return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f120822, new Object[0]));
        }
        if (m18837.isDirectory()) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f120828, new Object[0]));
        }
        long max = Math.max(m18837.getSize(), 0L);
        String m40231 = C17140.m40231(c15996, "range");
        if (TextUtils.isEmpty(m40231)) {
            m6607 = C2031.m6608(max);
        } else {
            String trim = m40231.trim();
            if (trim.startsWith("bytes=")) {
                String trim2 = trim.substring(6).trim();
                if (TextUtils.isEmpty(trim2) || trim2.contains(",")) {
                    m6607 = C2031.m6607();
                } else {
                    int indexOf = trim2.indexOf(45);
                    if (indexOf < 0) {
                        m6607 = C2031.m6607();
                    } else {
                        String trim3 = trim2.substring(0, indexOf).trim();
                        String trim4 = trim2.substring(indexOf + 1).trim();
                        if (!TextUtils.isEmpty(trim3)) {
                            try {
                                long parseLong = Long.parseLong(trim3);
                                if (parseLong < 0 || parseLong >= max) {
                                    m6607 = C2031.m6607();
                                } else {
                                    long j2 = max - 1;
                                    if (!TextUtils.isEmpty(trim4)) {
                                        try {
                                            long parseLong2 = Long.parseLong(trim4);
                                            if (parseLong2 < parseLong) {
                                                m6607 = C2031.m6607();
                                            } else if (parseLong2 < max) {
                                                j2 = parseLong2;
                                            }
                                        } catch (NumberFormatException unused) {
                                            m6607 = C2031.m6607();
                                        }
                                    }
                                    m6607 = C2031.m6609(parseLong, j2);
                                }
                            } catch (NumberFormatException unused2) {
                                m6607 = C2031.m6607();
                            }
                        } else if (TextUtils.isEmpty(trim4)) {
                            m6607 = C2031.m6607();
                        } else {
                            try {
                                long parseLong3 = Long.parseLong(trim4);
                                if (parseLong3 > 0 && max > 0) {
                                    m6607 = C2031.m6609(Math.max(max - parseLong3, 0L), max - 1);
                                }
                                m6607 = C2031.m6607();
                            } catch (NumberFormatException unused3) {
                                m6607 = C2031.m6607();
                            }
                        }
                    }
                }
            } else {
                m6607 = C2031.m6607();
            }
        }
        boolean z = m6607.f6769;
        long j3 = m6607.f6768;
        long j4 = m6607.f6770;
        if (!m6607.f6771) {
            C8236 m13784 = AbstractC4708.m13784(f33624, "text/plain", "");
            m13784.m21805("Accept-Ranges", "bytes");
            m13784.m21805("Content-Range", "bytes */" + max);
            m13784.m21806(m37807);
            return m13784;
        }
        long j5 = (j3 - j4) + 1;
        try {
            EnumC4003 enumC4003 = EnumC4003.HEAD;
            if (enumC4003.equals(m37807)) {
                str = "Content-Range";
                j = max;
                c14003 = new ByteArrayInputStream(new byte[0]);
            } else {
                str = "Content-Range";
                j = max;
                c14003 = new C14003(j5, m27770(m18837, j4));
            }
            String mo36971 = TextUtils.isEmpty(m18837.mo36971()) ? "application/octet-stream" : m18837.mo36971();
            C8236 m13783 = AbstractC4708.m13783(z ? f33623 : EnumC1180.OK, mo36971, c14003, j5);
            m13783.m21806(m37807);
            m13783.m21805("Accept-Ranges", "bytes");
            m13783.m21805("Referrer-Policy", "no-referrer");
            m13783.m21805("Content-Disposition", m27771(m18837.getName(), m402342));
            if (enumC4003.equals(m37807) && mo36971.startsWith("image/")) {
                long time = m18837.getTime();
                try {
                    InputStream mo7636 = C2499.f7958.mo7636((AbstractActivityC3346) null, m18837);
                    if (mo7636 != null) {
                        try {
                            Long m40645 = C17324.m40645(new C7605(mo7636, 0));
                            if (m40645 != null) {
                                time = m40645.longValue();
                            }
                        } finally {
                        }
                    }
                    if (mo7636 != null) {
                        mo7636.close();
                    }
                } catch (IOException | RuntimeException unused4) {
                }
                m13783.m21805("X-MT-Preview-Time", C17283.m40576(time));
            }
            if (z) {
                StringBuilder m31106 = C12803.m31106("bytes ", "-", j4);
                m31106.append(j3);
                m31106.append("/");
                m31106.append(j);
                m13783.m21805(str, m31106.toString());
            }
            return m13783;
        } catch (IOException unused5) {
            return C2884.m8818(EnumC1180.NOT_FOUND, C4925.m14306(R.string.MT_Protector_res_0x7f120822, new Object[0]));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m27770(C9555 c9555, long j) {
        InputStream mo7636 = C2499.f7958.mo7636((AbstractActivityC3346) null, c9555);
        if (mo7636 == null) {
            throw new IOException("file stream is not available");
        }
        try {
            byte[] bArr = new byte[8192];
            while (j > 0) {
                long skip = mo7636.skip(j);
                if (skip > 0) {
                    j -= skip;
                } else {
                    int read = mo7636.read(bArr, 0, (int) Math.min(8192, j));
                    if (read == -1) {
                        throw new IOException("unexpected eof");
                    }
                    j -= read;
                }
            }
            return mo7636;
        } catch (IOException e) {
            try {
                mo7636.close();
            } catch (IOException unused) {
            }
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27771(String str, String str2) {
        String sb;
        if (TextUtils.isEmpty(str)) {
            str = "download";
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || charAt == '\"' || charAt == '\\') {
                sb2.append('_');
            } else {
                sb2.append(charAt);
            }
        }
        try {
            sb = C12789.encode(str, StandardCharsets.UTF_8.name()).replace(BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX, "%20");
        } catch (Exception unused) {
            sb = sb2.toString();
        }
        return str2 + "; filename=\"" + ((Object) sb2) + "\"; filename*=UTF-8''" + sb;
    }
}
