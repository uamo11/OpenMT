package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: LAQJ */
/* renamed from: l.᩷֨ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20549 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C5242 f66199;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5242 f66200;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f66201;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C16314 f66202;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f66203 = new Object();

    static {
        C5242 c5242 = new C5242();
        f66200 = c5242;
        f66199 = c5242;
        f66201 = new AtomicInteger(21321);
        f66202 = new C16314();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47081(final AbstractActivityC3346 abstractActivityC3346, final AbstractC15440 abstractC15440, List list) {
        if (list != null) {
            new C10671(abstractActivityC3346, abstractC15440, true, null, list, ApplicationC20075.f65008.getString("ais", "")).m26777(EnumC5856.SHIZUKU);
            return;
        }
        if (!C10975.m27285()) {
            C4925.m14315(new RunnableC19473(3, abstractActivityC3346, abstractC15440));
            return;
        }
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                final ArrayList m36334 = C15308.m36334(c18090);
                c18090.close();
                CharSequence[] charSequenceArr = new CharSequence[m36334.size()];
                final boolean[] zArr = new boolean[m36334.size()];
                for (int i = 0; i < m36334.size(); i++) {
                    C8254 c8254 = (C8254) m36334.get(i);
                    charSequenceArr[i] = c8254.m21840();
                    zArr[i] = c8254.m21838();
                }
                C19258 buildDialog = abstractActivityC3346.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f1204b2);
                buildDialog.m44431(charSequenceArr, zArr, new DialogInterface.OnMultiChoiceClickListener() { // from class: l.᩺֡ܿ
                    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2, boolean z) {
                        C8254 c82542 = (C8254) m36334.get(i2);
                        boolean[] zArr2 = zArr;
                        if (!z && c82542.m21839()) {
                            zArr2[i2] = true;
                            C2664 m45035 = ((DialogInterfaceC19598) dialogInterface).m45035();
                            if (m45035 != null) {
                                m45035.post(new RunnableC1623(i2, 0, m45035));
                                return;
                            }
                            return;
                        }
                        zArr2[i2] = z;
                    }
                });
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                final DialogInterfaceC0206 m16343 = C5834.m16343(buildDialog, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f120918, (DialogInterface.OnClickListener) null);
                m16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܰ֡ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ArrayList m36328 = C15308.m36328(m36334, zArr);
                        if (m36328.isEmpty()) {
                            C21374.m48457(R.string.MT_Protector_res_0x7f120926);
                            return;
                        }
                        m16343.dismiss();
                        new C10671(abstractActivityC3346, abstractC15440, true, null, m36328, ApplicationC20075.f65008.getString("ais", "")).m26777(EnumC5856.SHIZUKU);
                    }
                });
                m16343.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.۟֡ܿ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2 = 0;
                        while (true) {
                            boolean[] zArr2 = zArr;
                            if (i2 >= zArr2.length) {
                                return;
                            }
                            boolean z = ((C8254) m36334.get(i2)).m21839() || !zArr2[i2];
                            zArr2[i2] = z;
                            m16343.m1443().setItemChecked(i2, z);
                            i2++;
                        }
                    }
                });
            } finally {
            }
        } catch (IOException e) {
            abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47080(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, String str) {
        new C10671(abstractActivityC3346, abstractC15440, false, str, null, ApplicationC20075.f65008.getString("ais", "")).m26777(EnumC5856.SHIZUKU);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47082(AbstractC15440 abstractC15440, List list) {
        C18090 c18090 = new C18090(abstractC15440);
        try {
            new C22789().m50867(c18090, list);
            c18090.close();
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m47086() {
        return C9255.m23780() && ApplicationC20075.f65010.getBoolean("apk_installation_root", true);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m47084() {
        return Build.VERSION.SDK_INT >= 23 && ApplicationC20075.f65010.getBoolean("apk_installation_shizuku", true);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m47087() {
        f66202.getClass();
        if (C23216.m51521()) {
            return 0;
        }
        try {
            return C23216.m51516() == 0 ? 2 : 1;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int m47088() {
        return f66201.getAndIncrement();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47079(AbstractActivityC3346 abstractActivityC3346, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            EnumC13728 mo19832 = abstractActivityC3346.getLifecycle().mo19832();
            if (mo19832 != EnumC13728.DESTROYED) {
                Intent launchIntentForPackage = C4925.m14320().getLaunchIntentForPackage(str2);
                C19258 buildDialog = abstractActivityC3346.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f1204ba);
                buildDialog.m44424(str);
                if (launchIntentForPackage != null) {
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f120510, new DialogInterfaceOnClickListenerC17851(0, abstractActivityC3346, launchIntentForPackage));
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f120189, (DialogInterface.OnClickListener) null);
                } else {
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                }
                buildDialog.m44440(R.string.MT_Protector_res_0x7f12008f, (DialogInterface.OnClickListener) null);
                buildDialog.m44438().m1448().setOnClickListener(new ViewOnClickListenerC21933(1, abstractActivityC3346, str2));
            }
            if (mo19832 != EnumC13728.RESUMED) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1204ba);
                return;
            }
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f1204ba);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47078(String str) {
        if (str.contains("Success") || str.contains("Completed with warning(s)")) {
            return;
        }
        if (str.contains("INSTALL_FAILED_VERSION_DOWNGRADE")) {
            C0086 c0086 = new C0086(R.string.MT_Protector_res_0x7f120053, str);
            c0086.m1049();
            throw c0086;
        }
        if (str.contains("INSTALL_FAILED_UPDATE_INCOMPATIBLE")) {
            throw new C0086(R.string.MT_Protector_res_0x7f120052, str);
        }
        if (str.contains("INSTALL_FAILED_OLDER_SDK")) {
            throw new C0086(R.string.MT_Protector_res_0x7f120051, str);
        }
        if (str.contains("INSTALL_FAILED_USER_RESTRICTED")) {
            throw new CancellationException();
        }
        C0086 c00862 = new C0086(R.string.MT_Protector_res_0x7f120050, str);
        c00862.m1048();
        throw c00862;
    }
}
