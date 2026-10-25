package l;

import java.io.InputStream;

/* compiled from: Y20N */
/* renamed from: l.ۗ᩶᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3473 implements InterfaceC13713 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12534 f10990;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7364 f10991;

    @Override // l.InterfaceC11098
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream mo10616() {
        return C1925.m6337(this);
    }

    public C3473(C12534 c12534, C7364 c7364) {
        this.f10990 = c12534;
        this.f10991 = c7364;
    }

    @Override // l.InterfaceC13713
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12534 mo10617() {
        return this.f10990;
    }

    @Override // l.InterfaceC11098
    public final InputStream getInputStream() {
        return this.f10991.getInputStream();
    }

    @Override // l.InterfaceC11098
    public final long length() {
        return this.f10991.length();
    }
}
