package l;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.asn1.BERTags;

/* compiled from: 6A0Y */
/* renamed from: l.ܿ᩷᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17603 extends ByteArrayOutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53790;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14780 f53791;

    public C17603(int i, C14780 c14780, int i2) {
        super(i);
        this.f53791 = c14780;
        this.f53790 = i2;
    }

    public final void writeByte(int i) {
        write(i & 255);
    }

    @Override // java.io.ByteArrayOutputStream
    public final void writeBytes(byte[] bArr) {
        if (bArr != null) {
            m41142(bArr.length, bArr);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41142(int i, byte[] bArr) {
        for (int i2 = 0; i2 < i; i2++) {
            writeByte(bArr[i2]);
        }
    }

    public final void writeShort(int i) {
        writeByte(i >> 8);
        writeByte(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41145(int i, String str) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            char charAt = str.charAt(i3);
            i2 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i2 + 3 : i2 + 2 : i2 + 1;
        }
        writeByte(i2);
        for (int i4 = 0; i4 < i; i4++) {
            char charAt2 = str.charAt(i4);
            if (charAt2 >= 1 && charAt2 <= 127) {
                writeByte(charAt2);
            } else if (charAt2 > 2047) {
                writeByte(((charAt2 >> '\f') & 15) | BERTags.FLAGS);
                writeByte(((charAt2 >> 6) & 63) | 128);
                writeByte((charAt2 & '?') | 128);
            } else {
                writeByte(((charAt2 >> 6) & 31) | 192);
                writeByte((charAt2 & '?') | 128);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41143(String str) {
        int indexOf;
        while (true) {
            int i = 0;
            while (true) {
                indexOf = str.indexOf(46, i);
                if (indexOf >= 0) {
                    if (indexOf == 0 || str.charAt(indexOf - 1) != '\\') {
                        break;
                    } else {
                        i = indexOf + 1;
                    }
                } else {
                    indexOf = -1;
                    break;
                }
            }
            if (indexOf < 0) {
                indexOf = str.length();
            }
            if (indexOf <= 0) {
                writeByte(0);
                return;
            }
            String replace = str.substring(0, indexOf).replace("\\.", ".");
            C14780 c14780 = this.f53791;
            Integer num = (Integer) c14780.f45144.get(str);
            if (num != null) {
                int intValue = num.intValue();
                writeByte((intValue >> 8) | 192);
                writeByte(intValue & 255);
                return;
            } else {
                c14780.f45144.put(str, Integer.valueOf(size() + this.f53790));
                m41145(replace.length(), replace);
                str = str.substring(indexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41144(AbstractC22542 abstractC22542, long j) {
        int max;
        m41143(abstractC22542.m32828());
        writeShort(abstractC22542.m32832().m28522());
        int m16802 = abstractC22542.m32830().m16802();
        boolean m32833 = abstractC22542.m32833();
        C14780 c14780 = this.f53791;
        writeShort(m16802 | ((m32833 && c14780.f56918) ? 32768 : 0));
        if (j != 0) {
            max = (int) Math.max(0L, (abstractC22542.m50537(100) - j) / 1000);
        } else {
            max = abstractC22542.m50540();
        }
        writeShort(max >> 16);
        writeShort(max);
        C17603 c17603 = new C17603(512, c14780, size() + this.f53790 + 2);
        abstractC22542.mo2717(c17603);
        byte[] byteArray = c17603.toByteArray();
        writeShort(byteArray.length);
        write(byteArray, 0, byteArray.length);
    }
}
