package l;

import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: J9YE */
/* renamed from: l.֫᩷᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2081 extends ByteArrayInputStream implements InterfaceC14905, InterfaceC0088 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f6943 = C11321.m27962(C2081.class.getName());

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f6944;

    @Override // java.io.ByteArrayInputStream, java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C2081(byte[] bArr, int i) {
        super(bArr, 0, i);
        this.f6944 = new HashMap();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6852() {
        return read() & 255;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m6853() {
        return (m6852() << 8) | m6852();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m6851(int i) {
        int i2;
        int m6852;
        StringBuilder sb = new StringBuilder(i);
        int i3 = 0;
        while (i3 < i) {
            int m68522 = m6852();
            switch (m68522 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    i2 = (m68522 & 63) << 4;
                    m6852 = m6852() & 15;
                    break;
                case 12:
                case 13:
                    i2 = (m68522 & 31) << 6;
                    m6852 = m6852() & 63;
                    break;
                case 14:
                    m68522 = ((m68522 & 15) << 12) | ((m6852() & 63) << 6) | (m6852() & 63);
                    i3 += 2;
                    continue;
            }
            m68522 = i2 | m6852;
            i3++;
            sb.append((char) m68522);
            i3++;
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m6850() {
        HashMap hashMap;
        int m6852;
        HashMap hashMap2 = new HashMap();
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            hashMap = this.f6944;
            if (z || (m6852 = m6852()) == 0) {
                break;
            }
            int i = C7311.f22442[EnumC12333.m29932(m6852).ordinal()];
            if (i != 1) {
                InterfaceC2148 interfaceC2148 = f6943;
                if (i == 2) {
                    int m29933 = (EnumC12333.m29933(m6852) << 8) | m6852();
                    String str = (String) hashMap.get(Integer.valueOf(m29933));
                    if (str == null) {
                        interfaceC2148.mo7098("Bad domain name: possible circular name detected. Bad offset: 0x{} at 0x{}", Integer.toHexString(m29933), Integer.toHexString(((ByteArrayInputStream) this).pos - 2));
                        str = "";
                    }
                    sb.append(str);
                    Iterator it = hashMap2.values().iterator();
                    while (it.hasNext()) {
                        ((StringBuilder) it.next()).append(str);
                    }
                    z = true;
                } else if (i == 3) {
                    interfaceC2148.mo7088("Extended label are not currently supported.");
                } else {
                    interfaceC2148.mo7103(Integer.toHexString(m6852 & 192), "Unsupported DNS label type: '{}'");
                }
            } else {
                int i2 = ((ByteArrayInputStream) this).pos - 1;
                String str2 = m6851(m6852) + ".";
                sb.append(str2);
                Iterator it2 = hashMap2.values().iterator();
                while (it2.hasNext()) {
                    ((StringBuilder) it2.next()).append(str2);
                }
                hashMap2.put(Integer.valueOf(i2), new StringBuilder(str2));
            }
        }
        for (Map.Entry entry : hashMap2.entrySet()) {
            hashMap.put((Integer) entry.getKey(), ((StringBuilder) entry.getValue()).toString());
        }
        return sb.toString();
    }
}
