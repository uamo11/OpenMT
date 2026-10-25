package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.List;
import org.bouncycastle.asn1.util.ASN1Dump;

/* compiled from: J9YE */
/* renamed from: l.ۧ᩷᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11254 extends AbstractC18309 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2081 f33726;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f33727;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f33728;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final DatagramPacket f33729;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f33724 = C11321.m27962(C11254.class.getName());

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f33725 = true;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final char[] f33723 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11254(DatagramPacket datagramPacket) {
        super(0, 0, datagramPacket.getPort() == C13038.f39044);
        InterfaceC2148 interfaceC2148 = f33724;
        this.f33729 = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        C2081 c2081 = new C2081(datagramPacket.getData(), datagramPacket.getLength());
        this.f33726 = c2081;
        this.f33728 = System.currentTimeMillis();
        this.f33727 = 1460;
        try {
            try {
                m42655(c2081.m6853());
                m42649(c2081.m6853());
                if (m42659() > 0) {
                    throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
                }
                int m6853 = c2081.m6853();
                int m68532 = c2081.m6853();
                int m68533 = c2081.m6853();
                int m68534 = c2081.m6853();
                interfaceC2148.mo7092("DNSIncoming() questions:{} answers:{} authorities:{} additionals:{}", Integer.valueOf(m6853), Integer.valueOf(m68532), Integer.valueOf(m68533), Integer.valueOf(m68534));
                if (((m68532 + m68533 + m68534) * 11) + (m6853 * 5) > datagramPacket.getLength()) {
                    throw new IOException("questions:" + m6853 + " answers:" + m68532 + " authorities:" + m68533 + " additionals:" + m68534);
                }
                if (m6853 > 0) {
                    for (int i = 0; i < m6853; i++) {
                        this.f56922.add(m27843());
                    }
                }
                if (m68532 > 0) {
                    for (int i2 = 0; i2 < m68532; i2++) {
                        AbstractC22542 m27845 = m27845(address);
                        if (m27845 != null) {
                            this.f56917.add(m27845);
                        }
                    }
                }
                if (m68533 > 0) {
                    for (int i3 = 0; i3 < m68533; i3++) {
                        AbstractC22542 m278452 = m27845(address);
                        if (m278452 != null) {
                            this.f56919.add(m278452);
                        }
                    }
                }
                if (m68534 > 0) {
                    for (int i4 = 0; i4 < m68534; i4++) {
                        AbstractC22542 m278453 = m27845(address);
                        if (m278453 != null) {
                            this.f56916.add(m278453);
                        }
                    }
                }
                if (this.f33726.available() > 0) {
                    throw new IOException("Received a message with the wrong length.");
                }
            } finally {
                try {
                    this.f33726.close();
                } catch (Exception unused) {
                    interfaceC2148.mo7104("MessageInputStream close error");
                }
            }
        } catch (Exception e) {
            interfaceC2148.mo7083("DNSIncoming() dump " + m27849() + "\n exception ", (Throwable) e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    public C11254(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f33729 = datagramPacket;
        this.f33726 = new C2081(datagramPacket.getData(), datagramPacket.getLength());
        this.f33728 = j;
    }

    public final C11254 clone() {
        C11254 c11254 = new C11254(m42658(), m42660(), this.f56918, this.f33729, this.f33728);
        c11254.f33727 = this.f33727;
        c11254.f56922.addAll(this.f56922);
        c11254.f56917.addAll(this.f56917);
        c11254.f56919.addAll(this.f56919);
        c11254.f56916.addAll(this.f56916);
        return c11254;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C19015 m27843() {
        C2081 c2081 = this.f33726;
        String m6850 = c2081.m6850();
        EnumC11628 m28518 = EnumC11628.m28518(c2081.m6853());
        if (m28518 == EnumC11628.TYPE_IGNORE) {
            f33724.mo7103(m27849(), "Could not find record type: {}");
        }
        int m6853 = c2081.m6853();
        EnumC5983 m16798 = EnumC5983.m16798(m6853);
        return C19015.m43857(m6850, m28518, m16798, m16798.m16801(m6853));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [l.᩵᩷᩵] */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v12 */
    /* JADX WARN: Type inference failed for: r20v2, types: [l.᩵᩷᩵] */
    /* JADX WARN: Type inference failed for: r20v3, types: [l.۠᩷᩵] */
    /* JADX WARN: Type inference failed for: r20v4, types: [l.᩸᩷᩵] */
    /* JADX WARN: Type inference failed for: r20v5, types: [l.ܶ᩷᩵] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [l.֫᩻֨] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.AbstractC22542 m27845(java.net.InetAddress r26) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11254.m27845(java.net.InetAddress):l.᩹᩷᩵");
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m27849() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append(toString());
        sb2.append("\n");
        for (C19015 c19015 : this.f56922) {
            sb2.append("\tquestion:      ");
            sb2.append(c19015);
            sb2.append("\n");
        }
        for (AbstractC22542 abstractC22542 : this.f56917) {
            sb2.append("\tanswer:        ");
            sb2.append(abstractC22542);
            sb2.append("\n");
        }
        for (AbstractC22542 abstractC225422 : this.f56919) {
            sb2.append("\tauthoritative: ");
            sb2.append(abstractC225422);
            sb2.append("\n");
        }
        for (AbstractC22542 abstractC225423 : this.f56916) {
            sb2.append("\tadditional:    ");
            sb2.append(abstractC225423);
            sb2.append("\n");
        }
        sb.append(sb2.toString());
        DatagramPacket datagramPacket = this.f33729;
        int length = datagramPacket.getLength();
        byte[] bArr = new byte[length];
        System.arraycopy(datagramPacket.getData(), 0, bArr, 0, length);
        StringBuilder sb3 = new StringBuilder(OpenAuthTask.SYS_ERR);
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int min = Math.min(32, length - i);
            if (i < 16) {
                sb3.append(' ');
            }
            if (i < 256) {
                sb3.append(' ');
            }
            if (i < 4096) {
                sb3.append(' ');
            }
            sb3.append(Integer.toHexString(i));
            sb3.append(':');
            int i2 = 0;
            while (i2 < min) {
                if (i2 % 8 == 0) {
                    sb3.append(' ');
                }
                int i3 = i + i2;
                sb3.append(Integer.toHexString((bArr[i3] & 240) >> 4));
                sb3.append(Integer.toHexString(bArr[i3] & 15));
                i2++;
            }
            if (i2 < 32) {
                while (i2 < 32) {
                    if (i2 % 8 == 0) {
                        sb3.append(' ');
                    }
                    sb3.append(EnumC0121.f1143);
                    i2++;
                }
            }
            sb3.append(ASN1Dump.TAB);
            for (int i4 = 0; i4 < min; i4++) {
                if (i4 % 8 == 0) {
                    sb3.append(' ');
                }
                int i5 = bArr[i + i4] & 255;
                sb3.append((i5 <= 32 || i5 >= 127) ? '.' : (char) i5);
            }
            sb3.append("\n");
            i += 32;
            if (i >= 2048) {
                sb3.append("....\n");
                break;
            }
        }
        sb.append(sb3.toString());
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m42653() ? "dns[query," : "dns[response,");
        DatagramPacket datagramPacket = this.f33729;
        if (datagramPacket.getAddress() != null) {
            sb.append(datagramPacket.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(datagramPacket.getPort());
        sb.append(", length=");
        sb.append(datagramPacket.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(m42660()));
        if (m42658() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(m42658()));
            if ((m42658() & 32768) != 0) {
                sb.append(":r");
            }
            if ((m42658() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((m42658() & 512) != 0) {
                sb.append(":tc");
            }
        }
        List<C19015> list = this.f56922;
        if (list.size() > 0) {
            sb.append(", questions=");
            sb.append(list.size());
        }
        List<AbstractC22542> list2 = this.f56917;
        if (list2.size() > 0) {
            sb.append(", answers=");
            sb.append(list2.size());
        }
        List<AbstractC22542> list3 = this.f56919;
        if (list3.size() > 0) {
            sb.append(", authorities=");
            sb.append(list3.size());
        }
        List<AbstractC22542> list4 = this.f56916;
        if (list4.size() > 0) {
            sb.append(", additionals=");
            sb.append(list4.size());
        }
        if (list.size() > 0) {
            sb.append("\nquestions:");
            for (C19015 c19015 : list) {
                sb.append("\n\t");
                sb.append(c19015);
            }
        }
        if (list2.size() > 0) {
            sb.append("\nanswers:");
            for (AbstractC22542 abstractC22542 : list2) {
                sb.append("\n\t");
                sb.append(abstractC22542);
            }
        }
        if (list3.size() > 0) {
            sb.append("\nauthorities:");
            for (AbstractC22542 abstractC225422 : list3) {
                sb.append("\n\t");
                sb.append(abstractC225422);
            }
        }
        if (list4.size() > 0) {
            sb.append("\nadditionals:");
            for (AbstractC22542 abstractC225423 : list4) {
                sb.append("\n\t");
                sb.append(abstractC225423);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27846(C11254 c11254) {
        if (m42653() && m42657() && c11254.m42653()) {
            this.f56922.addAll(c11254.f56922);
            this.f56917.addAll(c11254.f56917);
            this.f56919.addAll(c11254.f56919);
            this.f56916.addAll(c11254.f56916);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m27847() {
        return (int) (System.currentTimeMillis() - this.f33728);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m27848() {
        return this.f33727;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27844(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            char[] cArr = f33723;
            sb.append(cArr[i / 16]);
            sb.append(cArr[i % 16]);
        }
        return sb.toString();
    }
}
