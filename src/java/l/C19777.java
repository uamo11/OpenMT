package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: L1Y0 */
/* renamed from: l.᩵᩺ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19777 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45461(Main main, InterfaceC17889 interfaceC17889, String str, InterfaceC19071 interfaceC19071) {
        int lastIndexOf;
        String name = interfaceC17889.mo24433().m36492(true).getName();
        if (interfaceC17889.isDirectory()) {
            lastIndexOf = name.length();
        } else {
            lastIndexOf = name.lastIndexOf(46);
            if (lastIndexOf == -1) {
                lastIndexOf = name.length();
            }
        }
        C4254 c4254 = new C4254(main, str, interfaceC19071);
        c4254.m31258(R.string.MT_Protector_res_0x7f1205c2);
        c4254.m31250((CharSequence) name);
        c4254.m31244();
        c4254.m31279(6);
        c4254.m31246(0, lastIndexOf);
        c4254.m31266(true);
    }
}
