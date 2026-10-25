package l;

import java.util.StringTokenizer;

/* compiled from: 49VB */
/* renamed from: l.ۚۚ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5154 extends C11812 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f16099 = C11321.m27961(C5154.class);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f16100 = null;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f16101 = null;

    static {
        try {
            new C5154("S-1-1-0");
            new C5154("S-1-3-0");
            new C5154("S-1-5-18");
        } catch (C3037 e) {
            f16099.mo7091("Failed to create builtin SIDs", (Throwable) e);
        }
    }

    public C5154(byte[] bArr, int i) {
        this.f35232 = bArr[i];
        this.f35234 = bArr[i + 1];
        byte[] bArr2 = new byte[6];
        this.f35231 = bArr2;
        System.arraycopy(bArr, i + 2, bArr2, 0, 6);
        int i2 = i + 8;
        int i3 = this.f35234;
        if (i3 > 100) {
            throw new C13017("Invalid SID sub_authority_count");
        }
        this.f35233 = new int[i3];
        for (int i4 = 0; i4 < this.f35234; i4++) {
            this.f35233[i4] = C1480.m5123(i2, bArr);
            i2 += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5154(String str) {
        long parseLong;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        if (stringTokenizer.countTokens() < 3 || !stringTokenizer.nextToken().equals("S")) {
            throw new C3037("Bad textual SID format: ".concat(str));
        }
        this.f35232 = Byte.parseByte(stringTokenizer.nextToken());
        String nextToken = stringTokenizer.nextToken();
        if (nextToken.startsWith("0x")) {
            parseLong = Long.parseLong(nextToken.substring(2), 16);
        } else {
            parseLong = Long.parseLong(nextToken);
        }
        this.f35231 = new byte[6];
        int i = 5;
        while (parseLong > 0) {
            this.f35231[i] = (byte) (parseLong % 256);
            parseLong >>= 8;
            i--;
        }
        int countTokens = (byte) stringTokenizer.countTokens();
        this.f35234 = countTokens;
        if (countTokens > 0) {
            this.f35233 = new int[countTokens];
            for (int i2 = 0; i2 < this.f35234; i2++) {
                this.f35233[i2] = (int) (Long.parseLong(stringTokenizer.nextToken()) & 4294967295L);
            }
        }
    }

    public final int hashCode() {
        int i = this.f35231[5];
        for (int i2 = 0; i2 < this.f35234; i2++) {
            i += this.f35233[i2] * 65599;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5154) {
            C5154 c5154 = (C5154) obj;
            if (c5154 == this) {
                return true;
            }
            int i = c5154.f35234;
            int i2 = this.f35234;
            if (i == i2) {
                while (true) {
                    int i3 = i2 - 1;
                    if (i2 > 0) {
                        if (c5154.f35233[i3] != this.f35233[i3]) {
                            return false;
                        }
                        i2 = i3;
                    } else {
                        for (int i4 = 0; i4 < 6; i4++) {
                            if (c5154.f35231[i4] != this.f35231[i4]) {
                                return false;
                            }
                        }
                        if (c5154.f35232 == this.f35232) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String sb;
        String m9831 = C3200.m9831(this.f35232 & 255, "-", new StringBuilder("S-"));
        byte[] bArr = this.f35231;
        if (bArr[0] == 0 && bArr[1] == 0) {
            long j = 0;
            long j2 = 0;
            for (int i = 5; i > 1; i--) {
                j += (this.f35231[i] & 255) << ((int) j2);
                j2 += 8;
            }
            sb = m9831 + j;
        } else {
            StringBuilder m15339 = C5368.m15339(C16014.m37867(m9831, "0x"));
            m15339.append(C12085.m29468(this.f35231, 0, 6));
            sb = m15339.toString();
        }
        for (int i2 = 0; i2 < this.f35234; i2++) {
            StringBuilder m19190 = C7166.m19190(sb, "-");
            m19190.append(this.f35233[i2] & 4294967295L);
            sb = m19190.toString();
        }
        return sb;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m14712() {
        String str = this.f16100;
        if (str != null) {
            if (str.equals("BUILTIN")) {
                return this.f16101;
            }
            return this.f16100 + "\\" + this.f16101;
        }
        return toString();
    }
}
