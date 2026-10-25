package l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: 63RK */
/* renamed from: l.ܽۗ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16362 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile ArrayList f50349;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile AbstractC10719 f50350;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38509(Context context, String str) {
        context.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            C20087.m46303(context.getSystemService(C17665.m41385())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) m38517(context)).iterator();
        while (it.hasNext()) {
            AbstractC11466 abstractC11466 = (AbstractC11466) it.next();
            Collections.singletonList(str);
            abstractC11466.getClass();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38512(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList) {
        abstractActivityC3346.getClass();
        List m38508 = m38508(arrayList);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = (ArrayList) m38508;
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((C7232) it.next()).m19335());
            }
            if (!((ShortcutManager) abstractActivityC3346.getSystemService(ShortcutManager.class)).setDynamicShortcuts(arrayList3)) {
                return false;
            }
        }
        m38520(abstractActivityC3346).getClass();
        m38520(abstractActivityC3346).getClass();
        Iterator it2 = ((ArrayList) m38517(abstractActivityC3346)).iterator();
        while (it2.hasNext()) {
            ((AbstractC11466) it2.next()).getClass();
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m38513(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            return C20087.m46303(context.getSystemService(C17665.m41385())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m38514(Context context, C7232 c7232) {
        context.getClass();
        c7232.getClass();
        int i = Build.VERSION.SDK_INT;
        int m38513 = m38513(context);
        if (m38513 != 0) {
            if (i <= 29) {
                m38511(context, c7232);
            }
            String str = null;
            int i2 = -1;
            if (i >= 30) {
                C20087.m46303(context.getSystemService(C17665.m41385())).pushDynamicShortcut(c7232.m19335());
            } else if (i >= 25) {
                ShortcutManager m46303 = C20087.m46303(context.getSystemService(C17665.m41385()));
                if (!m46303.isRateLimitingActive()) {
                    List<ShortcutInfo> dynamicShortcuts = m46303.getDynamicShortcuts();
                    if (dynamicShortcuts.size() >= m38513) {
                        int i3 = -1;
                        String str2 = null;
                        for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                            if (shortcutInfo.getRank() > i3) {
                                str2 = shortcutInfo.getId();
                                i3 = shortcutInfo.getRank();
                            }
                        }
                        m46303.removeDynamicShortcuts(Arrays.asList(str2));
                    }
                    m46303.addDynamicShortcuts(Arrays.asList(c7232.m19335()));
                }
            }
            try {
                m38520(context).getClass();
                ArrayList arrayList = new ArrayList();
                if (arrayList.size() >= m38513) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C7232 c72322 = (C7232) it.next();
                        int i4 = c72322.f22141;
                        if (i4 > i2) {
                            str = c72322.f22152;
                            i2 = i4;
                        }
                    }
                    Arrays.asList(str);
                }
                Arrays.asList(c7232);
                Iterator it2 = ((ArrayList) m38517(context)).iterator();
                while (it2.hasNext()) {
                    AbstractC11466 abstractC11466 = (AbstractC11466) it2.next();
                    Collections.singletonList(c7232);
                    abstractC11466.getClass();
                }
                m38509(context, c7232.f22152);
                return true;
            } catch (Exception unused) {
                Iterator it3 = ((ArrayList) m38517(context)).iterator();
                while (it3.hasNext()) {
                    AbstractC11466 abstractC114662 = (AbstractC11466) it3.next();
                    Collections.singletonList(c7232);
                    abstractC114662.getClass();
                }
                m38509(context, c7232.f22152);
                return false;
            } catch (Throwable th) {
                Iterator it4 = ((ArrayList) m38517(context)).iterator();
                while (it4.hasNext()) {
                    AbstractC11466 abstractC114663 = (AbstractC11466) it4.next();
                    Collections.singletonList(c7232);
                    abstractC114663.getClass();
                }
                m38509(context, c7232.f22152);
                throw th;
            }
        }
        return false;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m38516(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C20087.m46303(context.getSystemService(C17665.m41385())).isRequestPinShortcutSupported();
        }
        if (C0881.m3229(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        Iterator<ResolveInfo> it = context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"), 0).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.permission;
            if (TextUtils.isEmpty(str) || "com.android.launcher.permission.INSTALL_SHORTCUT".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m38518(Context context, C7232 c7232) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 32) {
            c7232.getClass();
        }
        if (i >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(c7232.m19335(), null);
        }
        if (!m38516(context)) {
            return false;
        }
        Intent intent = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
        Intent[] intentArr = c7232.f22142;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", c7232.f22151.toString());
        C4656 c4656 = c7232.f22146;
        if (c4656 != null) {
            c4656.m13631(intent, (Drawable) null, c7232.f22148);
        }
        context.sendBroadcast(intent);
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static List m38519(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return C7232.m19331(context, ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getShortcuts(4));
        }
        if (i >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(shortcutManager.getPinnedShortcuts());
            return C7232.m19331(context, arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m38507(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(dynamicShortcuts.size());
            Iterator<ShortcutInfo> it = dynamicShortcuts.iterator();
            while (it.hasNext()) {
                arrayList.add(new C13581(context, it.next()).m32659());
            }
            return arrayList;
        }
        try {
            m38520(context).getClass();
            return new ArrayList();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m38515(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList) {
        List m38508 = m38508(arrayList);
        if (Build.VERSION.SDK_INT <= 29) {
            Iterator it = new ArrayList(m38508).iterator();
            while (it.hasNext()) {
                C7232 c7232 = (C7232) it.next();
                if (!m38511(abstractActivityC3346, c7232)) {
                    ((ArrayList) m38508).remove(c7232);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = ((ArrayList) m38508).iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C7232) it2.next()).m19335());
            }
            if (!((ShortcutManager) abstractActivityC3346.getSystemService(ShortcutManager.class)).updateShortcuts(arrayList2)) {
                return false;
            }
        }
        m38520(abstractActivityC3346).getClass();
        Iterator it3 = ((ArrayList) m38517(abstractActivityC3346)).iterator();
        while (it3.hasNext()) {
            ((AbstractC11466) it3.next()).getClass();
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m38511(Context context, C7232 c7232) {
        Bitmap decodeStream;
        C4656 m13628;
        C4656 c4656 = c7232.f22146;
        if (c4656 == null) {
            return false;
        }
        int i = c4656.f14771;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream m13630 = c4656.m13630(context);
        if (m13630 == null || (decodeStream = BitmapFactory.decodeStream(m13630)) == null) {
            return false;
        }
        if (i == 6) {
            m13628 = C4656.m13626(decodeStream);
        } else {
            m13628 = C4656.m13628(decodeStream);
        }
        c7232.f22146 = m13628;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38510(AbstractActivityC3346 abstractActivityC3346, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) abstractActivityC3346.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(list);
        }
        m38520(abstractActivityC3346).getClass();
        Iterator it = ((ArrayList) m38517(abstractActivityC3346)).iterator();
        while (it.hasNext()) {
            ((AbstractC11466) it.next()).getClass();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC10719 m38520(Context context) {
        if (f50350 == null) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    f50350 = (AbstractC10719) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, C16362.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
                } catch (Exception unused) {
                }
            }
            if (f50350 == null) {
                f50350 = new C1546();
            }
        }
        return f50350;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m38517(Context context) {
        Bundle bundle;
        String string;
        if (f50349 == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        arrayList.add((AbstractC11466) Class.forName(string, false, C16362.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context));
                    } catch (Exception unused) {
                    }
                }
            }
            if (f50349 == null) {
                f50349 = arrayList;
            }
        }
        return f50349;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m38508(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT > 32) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C7232) it.next()).getClass();
        }
        return arrayList2;
    }
}
