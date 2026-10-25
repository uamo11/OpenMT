package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.AttributeSet;
import com.google.android.material.motion.MotionUtils;

/* compiled from: R8VJ */
/* renamed from: l.ۖۙ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C2312 extends AbstractC3723 {
    public C2312(Context context) {
        super(context);
        m6898((InterfaceC7550) new C7416());
    }

    public C2312(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6898((InterfaceC7550) new C7416());
    }

    public C2312(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6898((InterfaceC7550) new C7416());
    }

    public C2312(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m6898((InterfaceC7550) new C7416());
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ String m7570() {
        PackageManager m14320 = C4925.m14320();
        try {
            ComponentName m7568 = m7568(m14320);
            if (m7568 != null) {
                return m7569(m14320, m7568);
            }
        } catch (Exception unused) {
            ApplicationC20075.f65008.edit().remove("dsai").apply();
        }
        try {
            return m7569(m14320, m7571(m14320));
        } catch (Exception unused2) {
            return "UNKNOWN";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7569(PackageManager packageManager, ComponentName componentName) {
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 0);
        String charSequence = activityInfo.applicationInfo.loadLabel(packageManager).toString();
        String charSequence2 = activityInfo.loadLabel(packageManager).toString();
        if (charSequence.contains(charSequence2)) {
            StringBuilder m19190 = C7166.m19190(charSequence, " (");
            m19190.append(componentName.getPackageName());
            m19190.append(MotionUtils.EASING_TYPE_FORMAT_END);
            return m19190.toString();
        }
        return charSequence + " - " + charSequence2 + " (" + componentName.getPackageName() + MotionUtils.EASING_TYPE_FORMAT_END;
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        C3822.m11568(abstractActivityC3346, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ComponentName m7568(PackageManager packageManager) {
        String string = ApplicationC20075.f65008.getString("dsai", null);
        if (string != null && !string.isEmpty()) {
            String[] split = string.split("/", 2);
            if (split.length == 2) {
                try {
                    ComponentName componentName = new ComponentName(split[0], split[1]);
                    if (packageManager != null) {
                        packageManager.getActivityInfo(componentName, 0);
                    }
                    return componentName;
                } catch (Exception unused) {
                    ApplicationC20075.f65008.edit().remove("dsai").apply();
                }
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ComponentName m7571(PackageManager packageManager) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(C16293.f50117.m36526("a.apk").m36509(), "application/vnd.android.package-archive");
            ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 65536);
            if (resolveActivity == null || resolveActivity.activityInfo.packageName.equals("android")) {
                return null;
            }
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            return new ComponentName(activityInfo.packageName, activityInfo.name);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // l.C2095
    /* renamed from: ۬ */
    public final void mo6922() {
        super.mo6922();
    }
}
