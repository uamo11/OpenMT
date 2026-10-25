package l;

import javax.crypto.Mac;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: BAEU */
/* renamed from: l.ۛܺۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC6154 implements InterfaceC1031 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f18926;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18927;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f18928;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f18929 = new byte[4];

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Mac f18930;

    @Override // l.InterfaceC1031
    public void init(byte[] bArr) {
        int length = bArr.length;
        int i = this.f18927;
        if (length > i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            bArr = bArr2;
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, this.f18926);
        Mac mac = Mac.getInstance(this.f18926);
        this.f18930 = mac;
        mac.init(secretKeySpec);
    }

    @Override // l.InterfaceC1031
    /* renamed from: ֫ */
    public void mo3560(int i) {
        byte[] bArr = this.f18929;
        bArr[0] = (byte) (i >>> 24);
        bArr[1] = (byte) (i >>> 16);
        bArr[2] = (byte) (i >>> 8);
        bArr[3] = (byte) i;
        mo3561(4, bArr);
    }

    @Override // l.InterfaceC1031
    /* renamed from: ֫ */
    public void mo3561(int i, byte[] bArr) {
        this.f18930.update(bArr, 0, i);
    }

    @Override // l.InterfaceC1031
    /* renamed from: ۧ */
    public void mo3563(int i, byte[] bArr) {
        try {
            this.f18930.doFinal(bArr, i);
        } catch (ShortBufferException unused) {
            C20413.m46769().getClass();
        }
    }
}
