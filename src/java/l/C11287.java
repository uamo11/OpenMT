package l;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;

/* compiled from: X5CP */
/* renamed from: l.ۧ᩹ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11287 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f33812 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27898() {
        f33812 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27899(final Main main, final InterfaceC2114 interfaceC2114) {
        if (C0881.m3229(main, UMUtils.SD_PERMISSION) == 0) {
            interfaceC2114.onSuccess();
            if (f33812) {
                return;
            }
            main.findViewById(R.id.MT_Protector_res_0x7f0a0435).setVisibility(8);
            return;
        }
        if (C15871.m37616()) {
            interfaceC2114.mo3493();
            return;
        }
        final String[] strArr = {UMUtils.SD_PERMISSION};
        View findViewById = main.findViewById(R.id.MT_Protector_res_0x7f0a0435);
        final int i = 0;
        if (f33812) {
            f33812 = false;
            C19039.m43890(main, strArr, 23678);
            findViewById.setVisibility(0);
            return;
        }
        if (C19039.m43891((Activity) main, UMUtils.SD_PERMISSION)) {
            findViewById.setVisibility(8);
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: l.᩺᩸ۡ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    switch (i) {
                        case 0:
                            Main main2 = (Main) main;
                            String[] strArr2 = (String[]) strArr;
                            InterfaceC2114 interfaceC21142 = (InterfaceC2114) interfaceC2114;
                            if (i2 != -1) {
                                interfaceC21142.mo3493();
                                break;
                            } else {
                                C19039.m43890(main2, strArr2, 23678);
                                break;
                            }
                        default:
                            C19568.m45004((C16560) main, (ArrayList) strArr, (InterfaceC17889) interfaceC2114, dialogInterface, i2);
                            break;
                    }
                }
            };
            int i2 = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(main);
            c19258.m44433(R.string.MT_Protector_res_0x7f120491);
            c19258.m44416(R.string.MT_Protector_res_0x7f12089e);
            c19258.m44428(false);
            c19258.m44442(R.string.MT_Protector_res_0x7f12070a, onClickListener);
            c19258.m44434(R.string.MT_Protector_res_0x7f12015e, onClickListener);
            c19258.m44438();
            return;
        }
        findViewById.setVisibility(8);
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c192582 = new C19258(main);
        c192582.m44433(R.string.MT_Protector_res_0x7f120307);
        c192582.m44416(R.string.MT_Protector_res_0x7f12089f);
        c192582.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c192582.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC14086(i, main, interfaceC2114));
        c192582.m44428(false);
        final DialogInterfaceC0206 m44438 = c192582.m44438();
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.۟᩸ۡ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Main main2 = Main.this;
                if (C0881.m3229(main2, UMUtils.SD_PERMISSION) == 0) {
                    m44438.dismiss();
                    interfaceC2114.onSuccess();
                } else {
                    main2.mo10220(main2.getPackageName());
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m27900(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27901(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
