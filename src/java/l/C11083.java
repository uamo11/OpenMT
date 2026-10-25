package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import bin.mt.plus.R;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TA2U */
/* renamed from: l.ۧܶܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11083 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C13698 f33272;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C0069 f33273;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f33274;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static List f33275;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f33276;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f33277;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Runnable f33278;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m27510() {
        boolean z;
        if (Build.VERSION.SDK_INT < 30) {
            return false;
        }
        z = C7349.f22567;
        if (z) {
            return false;
        }
        return (C22518.m50491() && C22518.m50492().mo2656()) ? false : true;
    }

    public C11083(AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        C5242 c5242;
        this.f33276 = abstractActivityC3346;
        this.f33278 = runnable;
        if (Build.VERSION.SDK_INT >= 30) {
            C14873 c14873 = new C14873(2, this);
            c5242 = C12993.f38908;
            c5242.m1668(abstractActivityC3346, new C3116(new C22166(abstractActivityC3346, c14873)));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27512(String str) {
        if (m27510()) {
            boolean m39886 = C16999.m39886();
            int i = 1;
            AbstractActivityC3346 abstractActivityC3346 = this.f33276;
            if (m39886) {
                String replace = C4925.m14327(R.string.MT_Protector_res_0x7f120049).replace("xxx", "Android/data");
                C19258 buildDialog = abstractActivityC3346.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
                buildDialog.m44424(replace);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC7018(i, this, str));
                buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                final DialogInterfaceC0206 m44438 = buildDialog.m44438();
                this.f33277 = m44438;
                m44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.۫۠ܿ
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C11083.m27504(C11083.this, m44438);
                    }
                });
                return;
            }
            C13698 m27502 = m27502();
            boolean z = str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb");
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 33) {
                    if (m27502.m32947() || m27502.m32949()) {
                        String concat = "forbid_tip_".concat(str);
                        if (C4925.f15523.getBoolean(concat, true)) {
                            C4925.f15523.edit().putBoolean(concat, false).apply();
                            StringBuilder sb = new StringBuilder(C4925.m14338().getText(R.string.MT_Protector_res_0x7f12011d));
                            int indexOf = TextUtils.indexOf(sb, "xxx");
                            if (indexOf != -1) {
                                sb.replace(indexOf, indexOf + 3, str);
                            }
                            abstractActivityC3346.m10218(R.string.MT_Protector_res_0x7f120a76, sb.toString(), false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (i2 >= 34) {
                    return;
                }
            }
            C20050 c20050 = C12993.f38911;
            if (C20050.m46238(str)) {
                return;
            }
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f33277;
            if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
                this.f33277.dismiss();
            }
            if (!m27502.m32948(z)) {
                if (m27502.m32949()) {
                    m27513(str, z, m27502, new RunnableC23495(i, this, str));
                    return;
                } else {
                    m27515(str);
                    return;
                }
            }
            String replace2 = C4925.m14327(R.string.MT_Protector_res_0x7f120049).replace("xxx", str);
            if (Build.VERSION.SDK_INT == 33) {
                replace2 = replace2.replace("Android 11", "Android 13");
            }
            C19258 buildDialog2 = abstractActivityC3346.buildDialog();
            buildDialog2.m44433(R.string.MT_Protector_res_0x7f120491);
            buildDialog2.m44424(replace2);
            buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC9152(i, this, str));
            buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            final DialogInterfaceC0206 m444382 = buildDialog2.m44438();
            this.f33277 = m444382;
            m444382.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۤ۠ܿ
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C11083.m27507(C11083.this, m444382);
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27499(C11083 c11083, String str) {
        f33274 = false;
        f33275 = Collections.singletonList(str);
        c11083.m27506(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27504(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27503(C11083 c11083, String str) {
        f33274 = false;
        f33275 = Collections.singletonList(str);
        c11083.m27506(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27507(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27513(String str, final boolean z, C13698 c13698, final Runnable runnable) {
        String replace = C4925.m14327(R.string.MT_Protector_res_0x7f12004b).replace("xxx", str);
        C19258 buildDialog = this.f33276.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120491);
        buildDialog.m44424(replace);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        m44438.m1447().setOnClickListener(new ViewOnClickListenerC17928(1, this, c13698));
        this.f33277 = m44438;
        m44438.m1436(new DialogInterfaceOnDismissListenerC21105(1, this, m44438));
        C1802.f6208.submit(new Runnable() { // from class: l.ۨ۠ܿ
            @Override // java.lang.Runnable
            public final void run() {
                while (true) {
                    DialogInterfaceC0206 dialogInterfaceC0206 = DialogInterfaceC0206.this;
                    if (!dialogInterfaceC0206.m1442()) {
                        return;
                    }
                    if (C11083.m27502().m32948(z)) {
                        C4925.m14315(new RunnableC6583(3, dialogInterfaceC0206, runnable));
                    }
                    SystemClock.sleep(600L);
                }
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27501(C11083 c11083, C13698 c13698) {
        String str;
        str = c13698.f40889;
        c11083.f33276.startActivity(new Intent("android.intent.action.DELETE", Uri.fromParts("package", str, null)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27500(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27515(String str) {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f33277;
        if (dialogInterfaceC0206 != null && dialogInterfaceC0206.m1442()) {
            this.f33277.dismiss();
        }
        String replace = C4925.m14327(R.string.MT_Protector_res_0x7f12004a).replace("xxx", str);
        C19258 buildDialog = this.f33276.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120a76);
        buildDialog.m44424(replace);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        this.f33277 = m44438;
        m44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ۛ۠ܿ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C11083.m27509(C11083.this, m44438);
            }
        });
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m27509(C11083 c11083, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c11083.f33277 == dialogInterfaceC0206) {
            c11083.f33277 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27514(LinkedHashSet linkedHashSet) {
        LinkedList linkedList = new LinkedList(linkedHashSet);
        f33275 = linkedList;
        f33274 = true;
        m27506((String) linkedList.get(0));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m27506(String str) {
        AbstractActivityC3346 abstractActivityC3346 = this.f33276;
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        intent.setFlags(195);
        String m27505 = m27505();
        intent.setPackage(m27505);
        intent.putExtra("android.provider.extra.INITIAL_URI", C14609.m34868("primary:" + str, true));
        try {
            abstractActivityC3346.mo123(intent);
        } catch (Exception e) {
            if (m27505 != null) {
                abstractActivityC3346.mo10220(m27505);
            } else {
                abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27511(Uri uri) {
        List list = f33275;
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        String uri2 = C14609.m34868("primary:" + str, false).toString();
        String name = new File(str).getName();
        boolean z = f33274;
        Runnable runnable = this.f33278;
        if (z) {
            if (!uri.toString().equals(uri2)) {
                C21374.m48464(C4925.m14306(R.string.MT_Protector_res_0x7f120426, name));
            } else {
                C12993.f38909.put(str, uri);
                C4925.m14336().takePersistableUriPermission(uri, 3);
                C21374.m48459((CharSequence) C4925.m14306(R.string.MT_Protector_res_0x7f120427, name));
            }
            list.remove(0);
            if (list.isEmpty()) {
                runnable.run();
                return;
            } else {
                m27506((String) list.get(0));
                return;
            }
        }
        if (list.size() == 1) {
            if (!uri.toString().equals(uri2)) {
                m27512(str);
                C21374.m48464(C4925.m14306(R.string.MT_Protector_res_0x7f120426, name));
            } else {
                C12993.f38909.put(str, uri);
                C4925.m14336().takePersistableUriPermission(uri, 3);
                runnable.run();
                C21374.m48459((CharSequence) C4925.m14306(R.string.MT_Protector_res_0x7f120427, name));
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m27505() {
        try {
            try {
                return C4925.m14304("com.google.android.documentsui").packageName;
            } catch (Exception unused) {
                return C4925.m14304("com.android.documentsui").packageName;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13698 m27502() {
        C13698 c13698 = f33272;
        try {
            try {
                PackageInfo m14304 = C4925.m14304("com.google.android.documentsui");
                if (c13698 != null && C13698.m32946(c13698, m14304)) {
                    return c13698;
                }
                C13698 m32945 = C13698.m32945(m14304);
                f33272 = m32945;
                return m32945;
            } catch (Exception unused) {
                return new C13698("com.android.documentsui", false, true, true, 0L);
            }
        } catch (Exception unused2) {
            PackageInfo m143042 = C4925.m14304("com.android.documentsui");
            if (c13698 != null && C13698.m32946(c13698, m143042)) {
                return c13698;
            }
            C13698 m329452 = C13698.m32945(m143042);
            f33272 = m329452;
            return m329452;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27498(C0069 c0069) {
        f33273 = c0069;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m27508() {
        C0069 c0069 = f33273;
        C11003.requireNonNull(c0069);
        return c0069.mo1018();
    }
}
