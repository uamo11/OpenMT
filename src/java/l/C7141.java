package l;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: 0BK7 */
/* renamed from: l.۟֨ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7141 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9964 f21923;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11375 f21924;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashSet f21925;

    public C7141() {
        C1703 c1703 = new C1703();
        C9964 c9964 = new C9964();
        this.f21925 = new HashSet();
        this.f21924 = c1703;
        this.f21923 = c9964;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File m19156(Context context) {
        ((C1703) this.f21924).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("pl_droidsonroids_gif"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19155(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }
}
