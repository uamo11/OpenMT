package l;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.system.Os;
import android.view.View;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONParseException;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Y9AZ */
/* renamed from: l.ۘ᩸ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4211 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2800 m12703() {
        String m44968 = C19554.m44967().m44968("term_ex_info_v3", null);
        if (m44968 != null) {
            try {
                C2800 c2800 = new C2800();
                JSONObject jSONObject = new JSONObject(m44968);
                c2800.f8741 = jSONObject.getInt(am.aE);
                c2800.f8740 = jSONObject.getString("n");
                c2800.f8739 = jSONObject.getJSONArray(c2800.f8737).getLong(0);
                c2800.f8738 = jSONObject.getJSONArray(c2800.f8737).getString(1);
                return c2800;
            } catch (JSONParseException unused) {
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12705(final AbstractActivityC3346 abstractActivityC3346, final Runnable runnable, final boolean z) {
        int i;
        final C2800 m12703 = m12703();
        if (m12703 == null) {
            runnable.run();
            return;
        }
        if (!z && C4925.f15523.getInt("term_ex_skip", -1) == m12703.f8741) {
            runnable.run();
            return;
        }
        C7549 m6880 = C2094.m6880();
        if (m6880 == null) {
            i = R.string.MT_Protector_res_0x7f120a37;
        } else {
            if (m6880.f23330 >= m12703.f8741) {
                runnable.run();
                return;
            }
            i = R.string.MT_Protector_res_0x7f120a38;
        }
        String m14306 = C4925.m14306(R.string.MT_Protector_res_0x7f120a39, m12703.f8740, C22927.m51020(m12703.f8739) + "B", m12703.f8737);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120a36);
        buildDialog.m44424(m14306 + "\n" + C4925.m14327(i));
        buildDialog.m44428(false);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۧ᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C4211.m12704(C2800.this, abstractActivityC3346, runnable);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.ܽ᩸ۢ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (!z) {
                    C21374.m48463(R.string.MT_Protector_res_0x7f120a3a);
                    C4925.f15523.edit().putInt("term_ex_skip", m12703.f8741).apply();
                }
                runnable.run();
            }
        });
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12704(C2800 c2800, AbstractActivityC3346 abstractActivityC3346, Runnable runnable) {
        PackageInfo packageInfo;
        AbstractC15440 m36526 = C16293.f50110.m36526("termex_v" + c2800.f8741 + "_" + c2800.f8737 + ".apk");
        if (!C2094.f6977) {
            try {
                packageInfo = C4925.m14304("bin.mt.termex");
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                AbstractC15440 m39866 = C16999.m39866(packageInfo.applicationInfo.sourceDir, new String[0]);
                try {
                    MessageDigest m34526 = C14460.m34526();
                    C14460.m34527(m34526, m39866.mo27926());
                    if (C14460.m34531(m34526.digest()).equals(c2800.f8738)) {
                        c2800.f8741 = packageInfo.versionCode;
                        c2800.f8740 = packageInfo.versionName;
                        m12711(abstractActivityC3346, m39866, c2800, runnable);
                        return;
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (m36526.mo23120()) {
            try {
                MessageDigest m345262 = C14460.m34526();
                C14460.m34527(m345262, m36526.mo27926());
                if (C14460.m34531(m345262.digest()).equals(c2800.f8738)) {
                    m12711(abstractActivityC3346, m36526, c2800, runnable);
                    return;
                }
            } catch (Exception unused3) {
            }
        }
        new C21145(abstractActivityC3346, m36526, c2800, runnable).m20274();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m12712(C18090 c18090) {
        Set set = (Set) C5378.stream(new C23734(c18090.m42210()).m4937("lib/")).filter(new C3152(1)).map(new C7033(0)).collect(C22976.toSet());
        for (String str : Build.SUPPORTED_ABIS) {
            if (set.contains(str)) {
                return C4860.m14172("lib/", str, "/");
            }
        }
        return C9045.m23341(new StringBuilder("lib/"), Build.SUPPORTED_ABIS[0], "/");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12711(final AbstractActivityC3346 abstractActivityC3346, final AbstractC15440 abstractC15440, C2800 c2800, final Runnable runnable) {
        if (!C2094.f6977) {
            new C9150(abstractActivityC3346, abstractC15440, c2800, runnable).m20274();
            return;
        }
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120a36);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f120a3d);
        buildDialog.m44428(false);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120151, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC18322(0, runnable));
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        final C9856 c9856 = new C9856();
        final C16204 c16204 = new C16204(m44438, abstractActivityC3346, c9856, runnable);
        abstractActivityC3346.getLifecycle().mo19833(c16204);
        m44438.m1436(new DialogInterface.OnDismissListener() { // from class: l.ܿ᩸ۢ
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                AbstractActivityC3346.this.getLifecycle().mo19834(c16204);
            }
        });
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܳ᩸ۢ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C9856 c98562 = C9856.this;
                if (c98562.m24925()) {
                    if (c98562.f29822) {
                        return;
                    }
                    c98562.f29822 = true;
                    m44438.dismiss();
                    ServiceC23281.m51598();
                    C2094.m6881();
                    runnable.run();
                    return;
                }
                C20549.m47080(abstractActivityC3346, abstractC15440, "bin.mt.termex");
            }
        });
        C20549.f66199.m1668(m44438, new InterfaceC1008() { // from class: l.᩻᩸ۢ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                C9856 c98562 = C9856.this;
                if (!c98562.m24925() || c98562.f29822) {
                    return;
                }
                c98562.f29822 = true;
                m44438.dismiss();
                ServiceC23281.m51598();
                C2094.m6881();
                runnable.run();
            }
        });
        C20549.m47080(abstractActivityC3346, abstractC15440, "bin.mt.termex");
    }

    @TargetApi(29)
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12707(C7549 c7549) {
        C18090 c18090;
        C18090 c180902 = null;
        try {
            String str = c7549.f23331;
            String str2 = c7549.f23326;
            if (str == null) {
                c18090 = new C18090(str2);
                try {
                    String m12713 = m12713(c18090);
                    c7549.f23331 = m12713;
                    str = m12713;
                    c180902 = c18090;
                } catch (Throwable th) {
                    th = th;
                    C0349.m1793(c18090);
                    throw th;
                }
            }
            AbstractC15440 m36526 = C16293.f50117.m36526("term/.exhash");
            if (m36526.mo23119()) {
                try {
                    if (m36526.m36489().equals(str)) {
                        C0349.m1793(c180902);
                        return;
                    }
                } catch (Exception unused) {
                }
            }
            if (c180902 == null) {
                c180902 = new C18090(str2);
            }
            m12709(c180902, str);
            C0349.m1793(c180902);
        } catch (Throwable th2) {
            th = th2;
            c18090 = c180902;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12709(C18090 c18090, String str) {
        String substring;
        AbstractC15440 m36526 = C16293.f50117.m36526("term");
        HashSet hashSet = new HashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String m23341 = C9045.m23341(new StringBuilder(), m12712(c18090), "lib/");
        Iterator it = c18090.m42194().iterator();
        while (it.hasNext()) {
            C3545 c3545 = (C3545) it.next();
            String name = c3545.getName();
            if (name.startsWith("assets/")) {
                substring = name.substring(7);
            } else if (name.startsWith(m23341)) {
                substring = name.substring(m23341.length() - 4);
            }
            linkedHashMap.put(substring, c3545);
            int indexOf = substring.indexOf(47);
            if (indexOf != -1) {
                substring = substring.substring(0, indexOf);
            }
            hashSet.add(substring);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            m36526.m36526(str2).mo23552();
            System.out.println(">> Delete: " + str2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str3 = (String) entry.getKey();
            C3545 c35452 = (C3545) entry.getValue();
            if (str3.endsWith(".rename")) {
                str3 = C15472.m36561(7, 0, str3);
            } else if (str3.endsWith(".link")) {
                String m36561 = C15472.m36561(5, 0, str3);
                String trim = new String(c18090.m42193(c35452, (C19277) null), StandardCharsets.UTF_8).trim();
                if (trim.startsWith("-n ")) {
                    trim = trim.substring(3);
                }
                Os.symlink(trim, m36526.m36526(m36561).mo23544());
                System.out.println(">> Symlink: " + m36561 + " > " + trim);
            }
            System.out.println(">> Extract: " + str3);
            AbstractC15440 m365262 = m36526.m36526(str3);
            if (c35452.isDirectory()) {
                m365262.m36508();
            } else {
                m365262.m36493(c18090.m42189(c35452));
            }
        }
        if (str != null) {
            m36526.m36526(".exhash").m36510(str);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m12713(C18090 c18090) {
        MessageDigest m34526 = C14460.m34526();
        String m23341 = C9045.m23341(new StringBuilder(), m12712(c18090), "lib/");
        byte[] bArr = new byte[4];
        Iterator it = c18090.m42194().iterator();
        while (it.hasNext()) {
            C3545 c3545 = (C3545) it.next();
            String name = c3545.getName();
            if (name.startsWith("assets/") || name.startsWith(m23341)) {
                C14460.m34528(m34526, name);
                if (c3545.isDirectory()) {
                    C15972.m37746(0, 123456, bArr);
                } else {
                    C15972.m37746(0, c3545.m10782(), bArr);
                }
                m34526.update(bArr);
            }
        }
        return C14460.m34531(m34526.digest());
    }
}
