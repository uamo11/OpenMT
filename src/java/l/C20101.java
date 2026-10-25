package l;

import android.os.Build;

/* compiled from: P8OZ */
/* renamed from: l.᩶ۤ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20101 implements InterfaceC21573 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4578 f65099;

    public C20101(C4578 c4578) {
        this.f65099 = c4578;
    }

    @Override // l.InterfaceC21573
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo46356() {
        this.f65099.m13459();
    }

    @Override // l.InterfaceC21573
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46345() {
        this.f65099.f14615 = true;
    }

    @Override // l.InterfaceC21573
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46347(long j) {
        C0405 c0405;
        c0405 = this.f65099.f14614;
        c0405.m1911(j);
    }

    @Override // l.InterfaceC21573
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46348(long j, int i, long j2) {
        C0405 c0405;
        c0405 = this.f65099.f14614;
        c0405.m1912(j, i, j2);
    }

    @Override // l.InterfaceC21573
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46351(boolean z) {
        C0405 c0405;
        c0405 = this.f65099.f14614;
        c0405.m1919(z);
    }

    @Override // l.InterfaceC21573
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo46355() {
        InterfaceC7194 m37228;
        m37228 = this.f65099.m37228();
        if (m37228 != null) {
            m37228.mo1317();
        }
    }

    @Override // l.InterfaceC21573
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo46352() {
        InterfaceC7194 m37228;
        m37228 = this.f65099.m37228();
        if (m37228 != null) {
            m37228.mo1316();
        }
    }

    @Override // l.InterfaceC21573
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46349(Exception exc) {
        C0405 c0405;
        C19956.m46034("Audio sink error", exc);
        c0405 = this.f65099.f14614;
        c0405.m1920(exc);
    }

    @Override // l.InterfaceC21573
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo46354() {
        this.f65099.m14364();
    }

    @Override // l.InterfaceC21573
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46350(C1111 c1111) {
        C0405 c0405;
        c0405 = this.f65099.f14614;
        c0405.m1916(c1111);
    }

    @Override // l.InterfaceC21573
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo46353(C1111 c1111) {
        C0405 c0405;
        c0405 = this.f65099.f14614;
        c0405.m1921(c1111);
    }

    @Override // l.InterfaceC21573
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo46346(int i) {
        C0405 c0405;
        C11735 c11735;
        C11735 c117352;
        int i2 = Build.VERSION.SDK_INT;
        C4578 c4578 = this.f65099;
        if (i2 >= 35) {
            c11735 = c4578.f14603;
            if (c11735 != null) {
                c117352 = c4578.f14603;
                c117352.m28636(i);
            }
        }
        c0405 = c4578.f14614;
        c0405.m1910(i);
    }
}
