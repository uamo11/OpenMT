package l;

import java.util.Arrays;

/* compiled from: T8N8 */
/* renamed from: l.᩸ܽۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21704 implements InterfaceC23757 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18832 f69616;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3104 f69617;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f69618;

    @Override // l.InterfaceC23757
    /* renamed from: ۧ */
    public final void mo6511() {
    }

    public C21704(InterfaceC21449 interfaceC21449, C3104 c3104) {
        C10957.m27273();
        this.f69617 = c3104;
        this.f69616 = new C18832(interfaceC21449);
    }

    @Override // l.InterfaceC23757
    /* renamed from: ֫ */
    public final void mo6509() {
        C18832 c18832 = this.f69616;
        c18832.m43509();
        try {
            c18832.mo1620(this.f69617);
            int i = 0;
            while (i != -1) {
                int m43508 = (int) c18832.m43508();
                byte[] bArr = this.f69618;
                if (bArr == null) {
                    this.f69618 = new byte[1024];
                } else if (m43508 == bArr.length) {
                    this.f69618 = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.f69618;
                i = c18832.read(bArr2, m43508, bArr2.length - m43508);
            }
        } finally {
            C8751.m22643(c18832);
        }
    }
}
