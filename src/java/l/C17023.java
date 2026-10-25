package l;

import java.security.PrivilegedExceptionAction;

/* compiled from: E9ZA */
/* renamed from: l.ܿ֨᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17023 implements PrivilegedExceptionAction {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15030 f52194;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f52195;

    public C17023(InterfaceC15030 interfaceC15030, byte[] bArr) {
        this.f52194 = interfaceC15030;
        this.f52195 = bArr;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final Object run() {
        byte[] bArr = this.f52195;
        return this.f52194.mo14525(bArr == null ? 0 : bArr.length, bArr);
    }
}
