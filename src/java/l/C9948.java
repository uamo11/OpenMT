package l;

import java.util.Arrays;

/* compiled from: X9ZV */
/* renamed from: l.ۤ֡᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9948 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30033;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object[] f30034;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f30035;

    public C9948(C7373 c7373) {
        int m33002 = c7373.m33002();
        int m33009 = c7373.m33009();
        this.f30035 = 0;
        this.f30034 = new Object[m33002];
        this.f30033 = m33009;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m25072() {
        synchronized (this.f30034) {
            if (this.f30035 > 0) {
                int i = 0;
                while (true) {
                    Object[] objArr = this.f30034;
                    if (i >= objArr.length) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (obj != null) {
                        byte[] bArr = (byte[]) obj;
                        objArr[i] = null;
                        this.f30035--;
                        return bArr;
                    }
                    i++;
                }
            }
            return new byte[this.f30033];
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25071(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int i = 0;
        Arrays.fill(bArr, (byte) 0);
        synchronized (this.f30034) {
            if (this.f30035 < this.f30034.length) {
                while (true) {
                    Object[] objArr = this.f30034;
                    if (i >= objArr.length) {
                        break;
                    }
                    if (objArr[i] == null) {
                        objArr[i] = bArr;
                        this.f30035++;
                        return;
                    }
                    i++;
                }
            }
        }
    }
}
