package l;

import java.util.HashMap;

/* compiled from: B749 */
/* renamed from: l.ۧ᩸ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11264 implements InterfaceC21830 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f33757;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18319 f33758;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f33759 = new HashMap();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f33760;

    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public final void mo3430(InterfaceC9505 interfaceC9505) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public final InterfaceC19383 mo3429(int i, int i2) {
        C19714 c19714;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f33759;
        InterfaceC19383 interfaceC19383 = (InterfaceC19383) hashMap.get(valueOf);
        if (interfaceC19383 != null) {
            return interfaceC19383;
        }
        if (i2 == 2) {
            C18319 c18319 = new C18319();
            this.f33757++;
            this.f33758 = c18319;
            c19714 = c18319;
        } else {
            c19714 = new C19714();
        }
        hashMap.put(Integer.valueOf(i), c19714);
        return c19714;
    }

    @Override // l.InterfaceC21830
    /* renamed from: ܳ */
    public final void mo3431() {
        this.f33760 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27875() {
        C18319 c18319;
        boolean z;
        long j;
        boolean z2;
        if (!this.f33760 || this.f33757 != 1 || (c18319 = this.f33758) == null) {
            return false;
        }
        z = c18319.f56960;
        if (!z) {
            return false;
        }
        j = this.f33758.f56961;
        if (j == -9223372036854775807L) {
            return false;
        }
        z2 = this.f33758.f56959;
        return z2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m27876() {
        long j;
        C18319 c18319 = this.f33758;
        if (c18319 == null) {
            return -9223372036854775807L;
        }
        j = c18319.f56961;
        return j;
    }
}
