package l;

import java.io.EOFException;

/* compiled from: B8HW */
/* renamed from: l.᩵᩷ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19714 implements InterfaceC19383 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f63713 = new byte[4096];

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final /* synthetic */ void mo8454(long j) {
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final void mo8455(long j, int i, int i2, int i3, C18677 c18677) {
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final void mo8456(C8353 c8353) {
    }

    @Override // l.InterfaceC19383
    /* renamed from: ۧ */
    public final int mo8458(InterfaceC9765 interfaceC9765, int i, boolean z) {
        byte[] bArr = this.f63713;
        int read = interfaceC9765.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final void mo8453(int i, C17714 c17714) {
        c17714.m41478(i);
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final void mo8457(C17714 c17714, int i, int i2) {
        c17714.m41478(i);
    }

    @Override // l.InterfaceC19383
    /* renamed from: ֫ */
    public final int mo8451(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return mo8458(interfaceC9765, i, z);
    }
}
