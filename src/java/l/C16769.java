package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: U19E */
/* renamed from: l.ܽܽᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16769 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f51488;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f51489;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f51490;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f51491;

    public C16769(byte[] bArr) {
        int length = bArr.length;
        this.f51490 = bArr;
        this.f51491 = 0;
        this.f51489 = length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11126 m39451() {
        int i;
        String m39449;
        do {
            i = this.f51491;
            m39449 = m39449();
            if (m39449 == null) {
                return null;
            }
        } while (m39449.length() == 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m39448(m39449));
        while (true) {
            String m394492 = m39449();
            if (m394492 == null || m394492.length() == 0) {
                break;
            }
            arrayList.add(m39448(m394492));
        }
        return new C11126(arrayList, i, this.f51491 - i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1953 m39448(String str) {
        int indexOf = str.indexOf(": ");
        if (indexOf == -1) {
            return new C1953(str, "");
        }
        return new C1953(str.substring(0, indexOf), str.substring(indexOf + 2));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private String m39449() {
        C16769 c16769;
        byte[] bArr = this.f51488;
        byte[] bArr2 = C5659.f17466;
        if (bArr != null && bArr.length == 0) {
            this.f51488 = null;
        } else {
            byte[] m39450 = m39450();
            if (m39450 == null) {
                bArr2 = this.f51488;
                if (bArr2 != null) {
                    this.f51488 = null;
                } else {
                    bArr2 = null;
                }
            } else if (m39450.length == 0) {
                m39450 = this.f51488;
                if (m39450 != null) {
                    this.f51488 = bArr2;
                    bArr2 = m39450;
                }
            } else {
                byte[] bArr3 = this.f51488;
                if (bArr3 == null) {
                    c16769 = this;
                } else if (m39450[0] != 32) {
                    this.f51488 = m39450;
                    bArr2 = bArr3;
                } else {
                    this.f51488 = null;
                    int length = m39450.length - 1;
                    byte[] bArr4 = new byte[bArr3.length + length];
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                    System.arraycopy(m39450, 1, bArr4, bArr3.length, length);
                    c16769 = this;
                    m39450 = bArr4;
                }
                while (true) {
                    byte[] m394502 = c16769.m39450();
                    if (m394502 == null) {
                        break;
                    }
                    if (m394502.length == 0) {
                        c16769.f51488 = bArr2;
                        break;
                    }
                    if (m394502[0] == 32) {
                        int length2 = m394502.length - 1;
                        byte[] bArr5 = new byte[m39450.length + length2];
                        System.arraycopy(m39450, 0, bArr5, 0, m39450.length);
                        System.arraycopy(m394502, 1, bArr5, m39450.length, length2);
                        m39450 = bArr5;
                    } else {
                        c16769.f51488 = m394502;
                        break;
                    }
                }
                bArr2 = m39450;
            }
        }
        if (bArr2 == null) {
            return null;
        }
        return bArr2.length == 0 ? "" : new String(bArr2, StandardCharsets.UTF_8);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private byte[] m39450() {
        byte[] bArr;
        int i;
        int i2 = this.f51491;
        int i3 = this.f51489;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2;
        while (true) {
            bArr = this.f51490;
            if (i4 >= i3) {
                i4 = -1;
                i = -1;
                break;
            }
            byte b = bArr[i4];
            if (b == 13) {
                i = i4 + 1;
                if (i < i3 && bArr[i] == 10) {
                    i = i4 + 2;
                }
            } else {
                if (b == 10) {
                    i = i4 + 1;
                    break;
                }
                i4++;
            }
        }
        if (i4 == -1) {
            i4 = i3;
        } else {
            i3 = i;
        }
        this.f51491 = i3;
        if (i4 == i2) {
            return C5659.f17466;
        }
        return Arrays.copyOfRange(bArr, i2, i4);
    }
}
