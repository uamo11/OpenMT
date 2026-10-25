package l;

import java.security.MessageDigest;

/* compiled from: LA1L */
/* renamed from: l.ܶ֡᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14885 extends AbstractC5008 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f45426;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f45427;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f45428;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f45429;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f45430;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f45431;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f45432;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x025f A[LOOP:4: B:127:0x0259->B:129:0x025f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x027d A[LOOP:5: B:132:0x0277->B:134:0x027d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14885(l.InterfaceC18663 r17, l.C7830 r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 1060
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14885.<init>(l.ᩴۡ᩵, l.۠֡᩵, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35318(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.f45428;
        if (bArr3 == null) {
            return;
        }
        MessageDigest m12981 = C4324.m12981(bArr3);
        m12981.update(bArr);
        m12981.update(bArr2);
        m12981.update(m35320());
        this.f45432 = m12981.digest();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m35319() {
        return this.f45428;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c3, code lost:
    
        if (r3 != null) goto L47;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] m35320() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14885.m35320():byte[]");
    }

    public final String toString() {
        String m9831;
        String m98312;
        StringBuilder m10501 = C3435.m10501("Type3Message[domain=", this.f45430, ",user=", this.f45427, ",workstation=null,lmResponse=");
        String str = "null";
        byte[] bArr = this.f45429;
        if (bArr == null) {
            m9831 = "null";
        } else {
            m9831 = C3200.m9831(bArr.length, " bytes>", new StringBuilder("<"));
        }
        m10501.append(m9831);
        m10501.append(",ntResponse=");
        byte[] bArr2 = this.f45426;
        if (bArr2 == null) {
            m98312 = "null";
        } else {
            m98312 = C3200.m9831(bArr2.length, " bytes>", new StringBuilder("<"));
        }
        m10501.append(m98312);
        m10501.append(",sessionKey=");
        byte[] bArr3 = this.f45431;
        if (bArr3 != null) {
            str = C3200.m9831(bArr3.length, " bytes>", new StringBuilder("<"));
        }
        m10501.append(str);
        m10501.append(",flags=0x");
        m10501.append(C12085.m29467(m14496(), 8));
        m10501.append("]");
        return m10501.toString();
    }
}
