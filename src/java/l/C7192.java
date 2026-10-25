package l;

import java.util.HashSet;

/* compiled from: 014Q */
/* renamed from: l.۟ۗ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7192 implements InterfaceC2959 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11008 f22030;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashSet f22031;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean[] f22032;

    public C7192(C11008 c11008, boolean[] zArr, HashSet hashSet) {
        this.f22030 = c11008;
        this.f22032 = zArr;
        this.f22031 = hashSet;
    }

    @Override // l.InterfaceC2959
    /* renamed from: ܽ */
    public final void mo9041(int i) {
        int i2;
        i2 = this.f22030.f33115;
        if (i < i2) {
            this.f22032[i] = false;
        }
    }

    @Override // l.InterfaceC2959
    /* renamed from: ֫ */
    public final void mo9039(int i) {
        int i2;
        if (this.f22031.contains(Integer.valueOf(i))) {
            return;
        }
        i2 = this.f22030.f33115;
        if (i < i2) {
            this.f22032[i] = true;
        }
    }

    @Override // l.InterfaceC2959
    /* renamed from: ۧ */
    public final void mo9040(int i) {
        mo9041(i);
    }

    @Override // l.InterfaceC2959
    /* renamed from: ᩳ */
    public final void mo9042(int i) {
        mo9039(i);
    }
}
