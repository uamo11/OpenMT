package l;

import java.io.InputStream;

/* compiled from: 53XL */
/* renamed from: l.ܽܺۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16741 implements InterfaceC11098 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f51386;

    @Override // l.InterfaceC11098
    /* renamed from: ֫ */
    public final /* synthetic */ InputStream mo10616() {
        return C1925.m6337(this);
    }

    public C16741(AbstractC15440 abstractC15440) {
        this.f51386 = abstractC15440;
    }

    @Override // l.InterfaceC11098
    public final InputStream getInputStream() {
        return this.f51386.mo27926();
    }

    @Override // l.InterfaceC11098
    public final long length() {
        return this.f51386.mo23127();
    }
}
