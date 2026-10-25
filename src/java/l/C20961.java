package l;

import android.content.DialogInterface;
import android.net.Uri;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: N4Y9 */
/* renamed from: l.᩷ܶܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20961 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4216 f67732;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47779(Main main, String str) {
        C4216 m45449;
        Uri m24601;
        if (!C9672.m24603() || (m45449 = C19739.m45449(str)) == null) {
            return;
        }
        m24601 = C9672.m24601(m45449);
        if (m24601 == null) {
            f67732 = m45449;
            m47782((InterfaceC13223) main, m45449.f13688);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47782(InterfaceC13223 interfaceC13223, String str) {
        C19258 buildDialog = interfaceC13223.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
        buildDialog.m44424(C4925.m14306(R.string.MT_Protector_res_0x7f1209e6, f67732.f13686));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC12415(2, str, interfaceC13223));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47781(InterfaceC13223 interfaceC13223, Uri uri) {
        HashSet hashSet;
        HashMap hashMap;
        hashSet = C9672.f29274;
        hashSet.clear();
        C4216 c4216 = f67732;
        if (c4216 == null) {
            return;
        }
        String str = c4216.f13688;
        String m34871 = C14609.m34871(uri);
        boolean z = false;
        if (str.equals(m34871) && uri.getPathSegments().size() == 2) {
            z = uri.getPathSegments().get(1).equals(m34871 + ":");
        }
        if (z) {
            try {
                C4925.m14336().takePersistableUriPermission(uri, 3);
                hashMap = C9672.f29275;
                hashMap.put(f67732.f13687.getPath(), C14609.m34869(uri));
                return;
            } catch (Throwable th) {
                interfaceC13223.mo10222(th);
                return;
            }
        }
        String path = uri.getPath();
        C11003.requireNonNull(path);
        int i = path.endsWith(":") ? R.string.MT_Protector_res_0x7f1209e4 : R.string.MT_Protector_res_0x7f1209e5;
        C19258 buildDialog = interfaceC13223.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120307);
        buildDialog.m44416(i);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120a99, new DialogInterfaceOnClickListenerC10299(interfaceC13223, 1));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
