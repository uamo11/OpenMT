package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Process;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: Z6W9 */
/* renamed from: l.ۛ᩸ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6326 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f19614;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17597() {
        return Build.VERSION.SDK_INT == 37 && "Xiaomi".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17598(Context context, boolean z) {
        int i;
        if ((z || !f19614) && m17597()) {
            try {
                int checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_LOCAL_NETWORK");
                if (checkSelfPermission != -1) {
                    String permissionToOp = AppOpsManager.permissionToOp("android.permission.ACCESS_LOCAL_NETWORK");
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    if (permissionToOp != null && appOpsManager != null) {
                        i = appOpsManager.checkOpNoThrow(permissionToOp, Process.myUid(), context.getPackageName());
                        if (i != 1 && i != 2) {
                            if (checkSelfPermission == 0 && i == 0) {
                                f19614 = true;
                                return false;
                            }
                        }
                    }
                    i = 3;
                    if (i != 1) {
                        if (checkSelfPermission == 0) {
                            f19614 = true;
                            return false;
                        }
                    }
                }
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f2, code lost:
    
        if ((r0[0] & org.bouncycastle.util.encoders.UTF8.S_ERR) != 252) goto L73;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m17600(l.AbstractActivityC3346 r5, l.AbstractC3577 r6) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6326.m17600(l.ۗܺ᩷, l.ۗ᩻᩻):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17599(AbstractActivityC3346 abstractActivityC3346) {
        if (!m17598((Context) abstractActivityC3346, false)) {
            return true;
        }
        m17601(abstractActivityC3346);
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m17602(AbstractActivityC3346 abstractActivityC3346) {
        if (f19614 || !m17597() || C12865.m31302() == null || !m17598((Context) abstractActivityC3346, false)) {
            return;
        }
        m17601(abstractActivityC3346);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.۬᩸ۡ, l.ܳۡ֫] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static RunnableC10560 m17596(View view, final AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        final C3504 c3504 = new C3504(new boolean[]{false}, view, abstractActivityC3346);
        view.setOnClickListener(new ViewOnClickListenerC1833(4, abstractActivityC3346));
        final ?? r4 = new InterfaceC17236() { // from class: l.۬᩸ۡ
            @Override // l.InterfaceC17236
            /* renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                if (enumC22901 == EnumC22901.ON_RESUME) {
                    C3504.this.n(Boolean.TRUE);
                }
            }
        };
        abstractActivityC3346.getLifecycle().mo19833(r4);
        if (!abstractActivityC3346.getLifecycle().mo19832().m33028(EnumC13728.RESUMED)) {
            c3504.n(Boolean.TRUE);
        }
        dialogInterfaceC0206.getLifecycle().mo19833(new InterfaceC17236() { // from class: l.۫᩸ۡ
            @Override // l.InterfaceC17236
            /* renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                if (enumC22901 == EnumC22901.ON_DESTROY) {
                    AbstractActivityC3346.this.getLifecycle().mo19834(r4);
                }
            }
        });
        return new RunnableC10560(0, c3504);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17601(AbstractActivityC3346 abstractActivityC3346) {
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f12052d);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12081a, new DialogInterfaceOnClickListenerC10944(3, abstractActivityC3346));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}
