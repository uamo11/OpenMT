package l;

import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: 113M */
/* renamed from: l.ۛ֨ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5732 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f17657;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f17658;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f17659;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f17660;

    static {
        f17657 = Build.VERSION.SDK_INT < 24;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5732 m16161(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, String str) {
        C5732 c5732 = new C5732();
        c5732.f17658 = abstractActivityC3346;
        c5732.f17659 = abstractC15440;
        c5732.f17660 = str;
        return c5732;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m16163() {
        return this.f17660;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m16164(String str) {
        if (str == null || str.equals("default")) {
            str = this.f17660;
        }
        return m16160(this.f17658.getPackageManager(), this.f17659, str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m16167(InterfaceC5711 interfaceC5711) {
        m16166(interfaceC5711, this.f17659, false);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x016c -> B:60:0x016f). Please report as a decompilation issue!!! */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16166(InterfaceC5711 interfaceC5711, AbstractC15440 abstractC15440, boolean z) {
        int i;
        String str = this.f17660;
        AbstractActivityC3346 abstractActivityC3346 = this.f17658;
        if (!interfaceC5711.mo8894() && !interfaceC5711.mo8892()) {
            throw new RuntimeException();
        }
        if (z) {
            try {
                abstractActivityC3346.startActivity(m16159(interfaceC5711, C11914.m29046(abstractC15440), str));
                return;
            } catch (Exception e) {
                abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        try {
        } catch (Exception e2) {
            abstractActivityC3346.m10223(e2, (DialogInterface.OnDismissListener) null);
        }
        if (abstractC15440.mo27919() && interfaceC5711.mo8894()) {
            boolean z2 = false;
            try {
                i = abstractActivityC3346.getPackageManager().getApplicationInfo(interfaceC5711.mo8896().getPackageName(), 0).targetSdkVersion;
            } catch (PackageManager.NameNotFoundException unused) {
                i = -1;
            }
            if (i < 29) {
                Intent m16159 = m16159(interfaceC5711, abstractC15440.m36522(), str);
                if (f17657) {
                    try {
                        abstractActivityC3346.startActivity(m16159);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                InterfaceC10085 m23776 = C9255.m23776();
                if (m23776 != null && m23776.mo25346()) {
                    StringBuilder sb = new StringBuilder("am start");
                    String action = m16159.getAction();
                    if (action != null) {
                        sb.append(" -a ");
                        sb.append(action);
                    }
                    ComponentName component = m16159.getComponent();
                    if (component != null) {
                        sb.append(" -n ");
                        sb.append(C9255.m23755(component.flattenToString()));
                    }
                    Uri data = m16159.getData();
                    if (data != null) {
                        sb.append(" -d ");
                        sb.append(C9255.m23755(data.toString()));
                    }
                    String type = m16159.getType();
                    if (type != null) {
                        sb.append(" -t ");
                        sb.append(C9255.m23755(type));
                    }
                    Uri uri = (Uri) m16159.getParcelableExtra("android.intent.extra.STREAM");
                    if (uri != null) {
                        sb.append(" --eu android.intent.extra.STREAM ");
                        sb.append(C9255.m23755(uri.toString()));
                    }
                    int flags = m16159.getFlags();
                    if (flags != 0) {
                        sb.append(" -f ");
                        sb.append(String.format("0x%08x", Integer.valueOf(flags)));
                    }
                    String sb2 = sb.toString();
                    System.out.println("Cmd: " + sb2);
                    C12201 mo25343 = m23776.mo25343(sb2);
                    boolean m29683 = mo25343.m29683();
                    String str2 = mo25343.f36414;
                    if (!m29683 || str2.contains("Warning")) {
                        return;
                    } else {
                        System.out.println("Start activity with shell failed: ".concat(str2));
                    }
                }
                try {
                    C4925.m14304("bin.mt.filetransfer");
                    z2 = true;
                } catch (Exception unused3) {
                }
                if (z2) {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName("bin.mt.filetransfer", "bin.mt.filetransfer.Main"));
                    intent.putExtra("intent", m16159);
                    try {
                        abstractActivityC3346.startActivity(intent);
                        return;
                    } catch (Exception unused4) {
                    }
                }
                abstractActivityC3346.startActivity(m16159(interfaceC5711, abstractC15440.m36509(), str));
            }
        }
        abstractActivityC3346.startActivity(m16159(interfaceC5711, abstractC15440.m36509(), str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16165(InterfaceC5711 interfaceC5711) {
        this.f17658.mo10220(interfaceC5711.mo8896().getPackageName());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m16168() {
        if (f17657 || !this.f17659.mo27919() || C9255.m23768()) {
            return false;
        }
        try {
            C4925.m14304("bin.mt.filetransfer");
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m16160(PackageManager packageManager, AbstractC15440 abstractC15440, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        HashMap hashMap = new HashMap();
        if (abstractC15440.mo27919()) {
            intent.setDataAndType(abstractC15440.m36522(), str);
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 65536).iterator();
            while (it.hasNext()) {
                m16162(hashMap, it.next(), true);
            }
        }
        intent.setDataAndType(abstractC15440.m36509(), str);
        Iterator<ResolveInfo> it2 = packageManager.queryIntentActivities(intent, 65536).iterator();
        while (it2.hasNext()) {
            m16162(hashMap, it2.next(), false);
        }
        if (hashMap.isEmpty() && !str.equals("*/*")) {
            return m16160(packageManager, abstractC15440, "*/*");
        }
        return new ArrayList(hashMap.values());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16162(HashMap hashMap, ResolveInfo resolveInfo, boolean z) {
        String str = resolveInfo.activityInfo.packageName;
        if (str.equals("bin.mt.plus") || str.equals("bin.mt.plus.canary") || str.equals("bin.mt.plus")) {
            return;
        }
        StringBuilder m19190 = C7166.m19190(str, "/");
        m19190.append(resolveInfo.activityInfo.name);
        String sb = m19190.toString();
        C2910 c2910 = (C2910) hashMap.get(sb);
        if (c2910 == null) {
            c2910 = new C2910(resolveInfo);
            hashMap.put(sb, c2910);
        }
        if (z) {
            c2910.m8899();
        } else {
            c2910.m8895();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Intent m16159(InterfaceC5711 interfaceC5711, Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, str);
        intent.setComponent(interfaceC5711.mo8896());
        intent.addFlags(268435456);
        C2837.m8731(intent, uri);
        return intent;
    }
}
