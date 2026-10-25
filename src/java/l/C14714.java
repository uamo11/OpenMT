package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: B9A2 */
/* renamed from: l.ܳᩴܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14714 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList f44933;

    static {
        m35013();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m35011() {
        return !f44933.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35010(C12392 c12392) {
        String string = ApplicationC20075.f65008.getString("stid", null);
        if (!TextUtils.isEmpty(string)) {
            Iterator it = f44933.iterator();
            while (it.hasNext()) {
                InterfaceC16831 interfaceC16831 = (InterfaceC16831) it.next();
                if (interfaceC16831.mo39604().equals(string)) {
                    if (interfaceC16831.mo39606(c12392)) {
                        return;
                    }
                    f44933 = m35012();
                    return;
                }
            }
        }
        if (f44933.isEmpty() || ((InterfaceC16831) f44933.get(0)).mo39606(c12392)) {
            return;
        }
        f44933 = m35012();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m35009() {
        return f44933;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m35013() {
        f44933 = m35012();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m35012() {
        PackageManager packageManager;
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(new C18243(C4925.m14320()));
        } catch (Exception unused) {
        }
        if (Build.VERSION.SDK_INT >= 23) {
            PackageManager m14320 = C4925.m14320();
            Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
            intent.setType("text/plain");
            List<ResolveInfo> queryIntentActivities = m14320.queryIntentActivities(intent, 65536);
            int size = arrayList.size();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                CharSequence loadLabel = resolveInfo.loadLabel(m14320);
                if (loadLabel != null) {
                    String charSequence = loadLabel.toString();
                    String str = resolveInfo.activityInfo.name;
                    if (charSequence.equalsIgnoreCase("Translate") || charSequence.equalsIgnoreCase("翻译") || charSequence.equalsIgnoreCase("翻譯") || charSequence.equalsIgnoreCase("Перевести") || charSequence.equalsIgnoreCase("Перакласці") || charSequence.equalsIgnoreCase("Tərcümə etmək") || charSequence.equalsIgnoreCase("Traducir") || charSequence.equalsIgnoreCase("Menerjemahkan") || charSequence.equalsIgnoreCase("Çevir")) {
                        packageManager = m14320;
                        arrayList.add(size, new C17537(resolveInfo));
                        size++;
                    } else {
                        if (str.contains("Translate")) {
                            packageManager = m14320;
                        } else {
                            packageManager = m14320;
                            if (!str.contains("Translation") && !str.contains("Translator") && !str.contains(".translate.") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "Translate") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "翻译") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "翻譯") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "Перевести") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "Перакласці") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "Tərcümə etmək") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "Traducir") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "Menerjemahkan") && !C9679.m24616((CharSequence) charSequence, (CharSequence) "Çevir")) {
                            }
                        }
                        arrayList.add(new C17537(resolveInfo));
                    }
                } else {
                    packageManager = m14320;
                }
                m14320 = packageManager;
            }
        }
        return arrayList;
    }
}
