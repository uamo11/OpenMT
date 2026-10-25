package l;

import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: FBFP */
/* renamed from: l.ۛ۫ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6053 implements InterfaceC0408 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f18553 = false;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public DataOutputStream f18552 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized void m16880(String str) {
        if (this.f18553 && this.f18552.size() >= 0) {
            throw new IOException(str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16885(DataOutputStream dataOutputStream) {
        this.f18552 = dataOutputStream;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16881() {
        this.f18552.write(0);
        m16880("Writing byte: 0");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16883(int i, byte[] bArr) {
        this.f18552.write(bArr, 0, i);
        m16880("Writing byte-array: " + bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16882(int i) {
        this.f18552.writeByte(i);
        m16880("Writing writeByte: " + i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m16889(int i) {
        this.f18552.writeShort(i);
        m16880("Writing writeShort: " + i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16887(int i) {
        this.f18552.writeInt(i);
        m16880("Writing writeInt: " + i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16884(long j) {
        this.f18552.writeLong(j);
        m16880("Writing writeLong: " + j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16886(String str) {
        this.f18552.writeBytes(str);
        m16880("Writing writeBytes: " + str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16888(String str) {
        this.f18552.writeUTF(str);
        m16880("Writing writeUTF: " + str);
    }
}
