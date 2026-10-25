package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import bin.mt.plus.R;
import java.util.Iterator;

/* compiled from: E94B */
/* renamed from: l.ۗ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3467 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f10981 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m10605() {
        return f10981;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10603(AbstractActivityC3346 abstractActivityC3346) {
        if (f10981) {
            f10981 = false;
            m10604(abstractActivityC3346, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10604(AbstractActivityC3346 abstractActivityC3346, boolean z) {
        int i = 0;
        if (ApplicationC20075.f65008.getBoolean("igiap", false)) {
            return;
        }
        Iterator<PackageInfo> it = abstractActivityC3346.getPackageManager().getInstalledPackages(0).iterator();
        while (it.hasNext()) {
            if ((it.next().applicationInfo.flags & 129) == 0) {
                i++;
            }
        }
        if (i <= 1 && C0881.m3229(abstractActivityC3346.getApplicationContext(), "com.android.permission.GET_INSTALLED_APPS") != 0) {
            if (!z) {
                C19039.m43890(abstractActivityC3346, new String[]{"com.android.permission.GET_INSTALLED_APPS"}, 23680);
                return;
            }
            C19258 buildDialog = abstractActivityC3346.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120a76);
            buildDialog.m44416(R.string.MT_Protector_res_0x7f120a77);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC21028(1, abstractActivityC3346));
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44440(R.string.MT_Protector_res_0x7f120465, new DialogInterfaceOnClickListenerC4878());
            buildDialog.m44438();
        }
    }
}
