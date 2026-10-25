package l;

/* compiled from: O9YQ */
/* renamed from: l.᩵ۖ᩵, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19183 implements InterfaceC8079 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18477[] f60436;

    @Override // l.InterfaceC8079
    /* renamed from: ֫ */
    public final int mo2557(int i, int i2, byte[] bArr) {
        C1480.m5121(i + 2, bArr);
        int m5123 = C1480.m5123(i + 4, bArr);
        int m51232 = C1480.m5123(i + 8, bArr);
        C1480.m5123(i + 12, bArr);
        int m51233 = C1480.m5123(i + 16, bArr);
        if (m5123 > 0) {
            new C5154(bArr, m5123 + i);
        }
        if (m51232 > 0) {
            new C5154(bArr, m51232 + i);
        }
        int i3 = i + m51233;
        if (m51233 > 0) {
            C1480.m5121(i3 + 2, bArr);
            int m51234 = C1480.m5123(i3 + 4, bArr);
            i3 += 8;
            if (m51234 > 4096) {
                throw new C17771("Invalid SecurityDescriptor");
            }
            this.f60436 = new C18477[m51234];
            for (int i4 = 0; i4 < m51234; i4++) {
                C18477[] c18477Arr = this.f60436;
                C18477 c18477 = new C18477();
                c18477Arr[i4] = c18477;
                i3 += c18477.mo2557(i3, i2 - i3, bArr);
            }
        } else {
            this.f60436 = null;
        }
        return i3 - i;
    }

    public final String toString() {
        if (this.f60436 == null) {
            return "SecurityDescriptor:\nNULL";
        }
        String str = "SecurityDescriptor:\n";
        for (int i = 0; i < this.f60436.length; i++) {
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(this.f60436[i].toString());
            m15339.append("\n");
            str = m15339.toString();
        }
        return str;
    }
}
