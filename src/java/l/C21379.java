package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import com.rosan.dhizuku.api.Dhizuku;

/* compiled from: LAQJ */
/* renamed from: l.᩸ۚܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21379 implements InterfaceC7267 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10671 f68870;

    @Override // l.InterfaceC7267
    /* renamed from: ֫ */
    public final PackageInstaller.Session mo19504(PackageInstaller.SessionParams sessionParams) {
        IPackageInstaller m48263 = C21255.m48263();
        this.f68870.m26773();
        return (PackageInstaller.Session) PackageInstaller.Session.class.getConstructor(IPackageInstallerSession.class).newInstance(IPackageInstallerSession.Stub.asInterface(Dhizuku.binderWrapper(m48263.openSession(C4321.m12975(m48263, Dhizuku.getOwnerPackageName(), null, 0).createSession(sessionParams)).asBinder())));
    }

    public C21379(C10671 c10671) {
        this.f68870 = c10671;
    }

    @Override // l.InterfaceC7267
    /* renamed from: ֫ */
    public final void mo19505() {
        this.f68870.m26778(EnumC5856.DHIZUKU);
    }
}
