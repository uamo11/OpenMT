package l;

import android.content.pm.IPackageInstaller;
import android.content.pm.IPackageManager;

/* compiled from: 28BC */
/* renamed from: l.᩶֨ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19844 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final IPackageManager f64107 = IPackageManager.Stub.asInterface(new C14043(C14294.m34080("package")));

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static IPackageInstaller m45654() {
        return IPackageInstaller.Stub.asInterface(new C14043(f64107.getPackageInstaller().asBinder()));
    }
}
