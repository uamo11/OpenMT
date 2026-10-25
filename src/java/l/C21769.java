package l;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import bin.mt.plus.R;

/* compiled from: X565 */
/* renamed from: l.᩸ᩴܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21769 {
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m49101(Context context) {
        Class cls;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        try {
            cls = Integer.TYPE;
        } catch (Exception e) {
            C3939.m11987(e);
        }
        return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49098(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            boolean m10402 = C3424.m10402();
            Class cls = Integer.TYPE;
            if (!m10402) {
                if (C3424.m10400()) {
                    return m49101(context);
                }
                if (!C3424.m10398()) {
                    if (!C3424.m10396()) {
                        if (C3424.m10401()) {
                            try {
                                return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                            } catch (Exception e) {
                                C3939.m11987(e);
                                return false;
                            }
                        }
                    } else {
                        try {
                        } catch (Exception e2) {
                            C3939.m11987(e2);
                        }
                        return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                    }
                } else {
                    try {
                    } catch (Exception e3) {
                        C3939.m11987(e3);
                    }
                    return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                }
            } else {
                try {
                    return ((Integer) AppOpsManager.class.getDeclaredMethod("checkOp", cls, cls, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0;
                } catch (Exception e4) {
                    C3939.m11987(e4);
                    return false;
                }
            }
        }
        if (C3424.m10400()) {
            return m49101(context);
        }
        Boolean bool = Boolean.TRUE;
        if (i >= 23) {
            bool = Boolean.valueOf(Settings.canDrawOverlays(context));
        }
        return bool.booleanValue();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m49100(Context context, InterfaceC15417 interfaceC15417) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            if (!C3424.m10402()) {
                if (!C3424.m10400()) {
                    if (!C3424.m10398()) {
                        if (!C3424.m10396()) {
                            if (!C3424.m10401()) {
                                if (interfaceC15417 != null) {
                                    interfaceC15417.mo5898();
                                }
                                m49102(context);
                                return;
                            }
                            m49097(context, interfaceC15417, new RunnableC20699(9, context));
                            return;
                        }
                        m49097(context, interfaceC15417, new RunnableC6438(4, context));
                        return;
                    }
                    m49097(context, interfaceC15417, new RunnableC7968(6, context));
                    return;
                }
                m49097(context, interfaceC15417, new RunnableC23520(2, context));
                return;
            }
            m49097(context, interfaceC15417, new RunnableC14532(3, context));
            return;
        }
        if (C3424.m10400()) {
            m49097(context, interfaceC15417, new RunnableC23520(2, context));
        } else if (i >= 23) {
            m49097(context, interfaceC15417, new RunnableC6772(4, context));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m49099(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49097(Context context, InterfaceC15417 interfaceC15417, Runnable runnable) {
        new C18892(context).setCancelable(true).setTitle(R.string.MT_Protector_res_0x7f120491).setMessage(R.string.MT_Protector_res_0x7f1206b4).setPositiveButton(R.string.MT_Protector_res_0x7f120027, new DialogInterfaceOnClickListenerC7845(interfaceC15417, runnable, context, 1)).setNegativeButton(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC4022(1, interfaceC15417, context)).setOnCancelListener(new DialogInterfaceOnCancelListenerC18839(1, interfaceC15417, context)).show();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49095(Context context, InterfaceC15417 interfaceC15417, Runnable runnable) {
        if (interfaceC15417 != null) {
            try {
                interfaceC15417.mo5899();
            } catch (Throwable unused) {
                if (interfaceC15417 != null) {
                    interfaceC15417.mo5898();
                }
                new C18892(context).setTitle(R.string.MT_Protector_res_0x7f120307).setMessage(R.string.MT_Protector_res_0x7f1202f5).setPositiveButton(android.R.string.ok, (DialogInterface.OnClickListener) null).setOnDismissListener(new DialogInterfaceOnDismissListenerC18742(context, 1)).show();
                return;
            }
        }
        runnable.run();
        m49102(context);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49094(Context context, InterfaceC15417 interfaceC15417) {
        if (interfaceC15417 != null) {
            interfaceC15417.mo5898();
        }
        m49102(context);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m49096(Context context, InterfaceC15417 interfaceC15417) {
        if (interfaceC15417 != null) {
            interfaceC15417.mo5898();
        }
        m49102(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m49102(Context context) {
        if (context instanceof InterfaceC8363) {
            ((InterfaceC8363) context).finish();
        }
    }
}
