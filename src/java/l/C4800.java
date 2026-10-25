package l;

import bin.mt.plus.R;

/* compiled from: 98AW */
/* renamed from: l.ۙܿ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4800 implements InterfaceC1025 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13266 f15201;

    public C4800(C13266 c13266) {
        this.f15201 = c13266;
    }

    @Override // l.InterfaceC1025
    public final void setTitle(int i) {
        this.f15201.m11536(R.string.MT_Protector_res_0x7f1202d0);
    }

    @Override // l.InterfaceC1025
    public final void setName(String str) {
        this.f15201.mo23259(str);
    }

    @Override // l.InterfaceC1025
    /* renamed from: ֫ */
    public final void mo3550(C20876 c20876) {
        this.f15201.mo23260(c20876);
    }

    @Override // l.InterfaceC1025
    /* renamed from: ۖ֫ */
    public final void mo3551() {
        this.f15201.m46501(true);
    }

    @Override // l.InterfaceC1025
    /* renamed from: ۧ */
    public final void mo3552(long j) {
        this.f15201.mo23258(j);
    }

    @Override // l.InterfaceC1025
    public final void setProgress(int i) {
        this.f15201.mo11538(i);
    }

    @Override // l.InterfaceC1025
    /* renamed from: ֫ */
    public final void mo3549() {
        this.f15201.cancel();
    }

    @Override // l.InterfaceC17066
    /* renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f15201.mo1526();
    }
}
