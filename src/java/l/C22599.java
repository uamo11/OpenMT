package l;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Locale;

/* compiled from: O2H0 */
/* renamed from: l.᩹᩺ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22599 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC11581 f73046 = AbstractC11581.m28472('.');

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11581 f73047 = AbstractC11581.m28472(':');

    static {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InetAddress m50577(String str) {
        String str2;
        C21894 c21894 = new C21894();
        byte[] m50578 = m50578(c21894, str);
        if (m50578 == null) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(C4860.m14172("'", str, "' is not an IP string literal."));
        }
        str2 = c21894.f70090;
        try {
            InetAddress byAddress = InetAddress.getByAddress(m50578);
            if (str2 == null) {
                return byAddress;
            }
            C4025.m12109("Unexpected state, scope should only appear for ipv6", byAddress instanceof Inet6Address);
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int length = str2.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (i <= 214748364) {
                    int i3 = i * 10;
                    int digit = Character.digit(str2.charAt(i2), 10);
                    if (digit >= 0) {
                        i = i3 + digit;
                    }
                }
                i = -1;
            }
            if (i != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str2);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                Locale locale2 = Locale.ROOT;
                throw new IllegalArgumentException("No such interface: '" + str2 + "'");
            } catch (SocketException | UnknownHostException e) {
                throw new IllegalArgumentException("No such interface: " + str2, e);
            }
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m50579(String str) {
        return m50578(null, str) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x014d, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0152, code lost:
    
        return r13.array();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0109, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0153, code lost:
    
        if (r2 == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0155, code lost:
    
        if (r1 == (-1)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x015c, code lost:
    
        return m50580(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
    
        if (r3 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r2 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r2 = r14.lastIndexOf(58) + 1;
        r10 = r14.substring(0, r2);
        r14 = m50580(r14.substring(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
    
        if (r14 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004e, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r14 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        r14 = r10 + java.lang.Integer.toHexString(((r14[0] & 255) << 8) | (r14[1] & 255)) + ":" + java.lang.Integer.toHexString((r14[3] & 255) | ((r14[2] & 255) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r1 == (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r13 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
    
        r13.f70090 = r14.substring(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        r14 = r14.substring(0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
    
        r13 = l.C22599.f73047.mo25529(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        if (r13 < 2) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r13 <= 8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
    
        r13 = r13 + 1;
        r1 = 8 - r13;
        r2 = 0;
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
    
        if (r2 >= (r14.length() - 1)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b5, code lost:
    
        if (r14.charAt(r2) != ':') goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bd, code lost:
    
        if (r14.charAt(r2 + 1) != ':') goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c3, code lost:
    
        r10 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
    
        if (r2 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        r10 = r1 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ce, code lost:
    
        if (r2 != (r14.length() - 2)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        r1 = r10;
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d5, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dc, code lost:
    
        if (r14.charAt(0) != ':') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r14.charAt(1) == ':') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ea, code lost:
    
        if (l.C7416.m19937(1, r14) != ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        if (l.C7416.m19937(2, r14) == ':') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
    
        if (r10 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f6, code lost:
    
        if (r1 > 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f9, code lost:
    
        if (r10 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fb, code lost:
    
        if (r13 == 8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fe, code lost:
    
        r13 = java.nio.ByteBuffer.allocate(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0106, code lost:
    
        if (r14.charAt(0) != ':') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010e, code lost:
    
        if (r7 >= r14.length()) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0110, code lost:
    
        r2 = r14.indexOf(58, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0114, code lost:
    
        if (r2 != (-1)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0116, code lost:
    
        r2 = r14.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x011e, code lost:
    
        if (r14.charAt(r7) != ':') goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0120, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0121, code lost:
    
        if (r3 >= r1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0123, code lost:
    
        r13.putShort(0);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0145, code lost:
    
        r7 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0129, code lost:
    
        r3 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x012b, code lost:
    
        if (r3 <= 0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x012e, code lost:
    
        if (r3 > 4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0130, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0131, code lost:
    
        if (r7 >= r2) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0133, code lost:
    
        r3 = (r3 << 4) | java.lang.Character.digit(r14.charAt(r7), 16);
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0141, code lost:
    
        r13.putShort((short) r3);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] m50578(l.C21894 r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22599.m50578(l.᩸᩺ܺ, java.lang.String):byte[]");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m50580(String str) {
        if (f73046.mo25529(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            try {
                bArr[i2] = m50576(i, indexOf, str);
                i = indexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m50576(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 3) {
            throw new NumberFormatException();
        }
        if (i3 > 1 && str.charAt(i) == '0') {
            throw new NumberFormatException();
        }
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 * 10;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException();
            }
            i4 = i5 + digit;
            i++;
        }
        if (i4 <= 255) {
            return (byte) i4;
        }
        throw new NumberFormatException();
    }
}
