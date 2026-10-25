package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: Y4G0 */
/* renamed from: l.۬ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC13246 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39656 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static ExecutorC4780 f39650 = new ExecutorC4780(new ExecutorC3369());

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static int f39648 = -100;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C3931 f39651 = null;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3931 f39652 = null;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Boolean f39654 = null;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean f39653 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C18955 f39657 = new C18955();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Object f39655 = new Object();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object f39649 = new Object();

    /* renamed from: ֫ */
    public Context mo15431(Context context) {
        return context;
    }

    /* renamed from: ֫ */
    public abstract View mo15432(int i);

    /* renamed from: ֫ */
    public void mo15434() {
    }

    /* renamed from: ֫ */
    public abstract void mo15436(Configuration configuration);

    /* renamed from: ֫ */
    public abstract void mo15437(View view);

    /* renamed from: ֫ */
    public abstract void mo15438(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ֫ */
    public abstract void mo15439(CharSequence charSequence);

    /* renamed from: ֫ */
    public abstract void mo15441(C9762 c9762);

    /* renamed from: ۖ */
    public abstract void mo15445();

    /* renamed from: ۘ */
    public abstract void mo15446();

    /* renamed from: ۜ */
    public abstract void mo15449();

    /* renamed from: ۡ */
    public abstract void mo15451();

    /* renamed from: ۢ */
    public abstract void mo15452();

    /* renamed from: ۧ */
    public abstract void mo15455(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: ۧ */
    public abstract boolean mo15456();

    /* renamed from: ۧ */
    public abstract boolean mo15457(int i);

    /* renamed from: ܳ */
    public abstract AbstractC10446 mo15458();

    /* renamed from: ܺ */
    public abstract void mo15460();

    /* renamed from: ܽ */
    public Context mo15461() {
        return null;
    }

    /* renamed from: ܽ */
    public abstract void mo15462(int i);

    /* renamed from: ܿ */
    public abstract MenuInflater mo15463();

    /* renamed from: ܿ */
    public void mo15464(int i) {
    }

    /* renamed from: ᩳ */
    public int mo15465() {
        return -100;
    }

    /* renamed from: ᩳ */
    public abstract void mo15466(int i);

    /* renamed from: ᩷ */
    public abstract void mo15468();

    /* renamed from: ᩻ */
    public abstract void mo15472();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m32143(int i) {
        if ((i == -1 || i == 0 || i == 1 || i == 2 || i == 3) && f39648 != i) {
            f39648 = i;
            synchronized (f39655) {
                Iterator it = f39657.iterator();
                while (it.hasNext()) {
                    AbstractC13246 abstractC13246 = (AbstractC13246) ((WeakReference) it.next()).get();
                    if (abstractC13246 != null) {
                        abstractC13246.mo15456();
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32138(C3931 c3931) {
        if (Build.VERSION.SDK_INT >= 33) {
            Object m32136 = m32136();
            if (m32136 != null) {
                C22419.m50346(m32136, C21714.m49044(c3931.m11980()));
                return;
            }
            return;
        }
        if (c3931.equals(f39651)) {
            return;
        }
        synchronized (f39655) {
            f39651 = c3931;
            Iterator it = f39657.iterator();
            while (it.hasNext()) {
                AbstractC13246 abstractC13246 = (AbstractC13246) ((WeakReference) it.next()).get();
                if (abstractC13246 != null) {
                    abstractC13246.mo15434();
                }
            }
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C3931 m32147() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object m32136 = m32136();
            if (m32136 != null) {
                return C3931.m11973(C22419.m50345(m32136));
            }
        } else {
            C3931 c3931 = f39651;
            if (c3931 != null) {
                return c3931;
            }
        }
        return C3931.m11976();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static int m32148() {
        return f39648;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C3931 m32140() {
        return f39651;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C3931 m32137() {
        return f39652;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Object m32136() {
        Context mo15461;
        Iterator it = f39657.iterator();
        while (it.hasNext()) {
            AbstractC13246 abstractC13246 = (AbstractC13246) ((WeakReference) it.next()).get();
            if (abstractC13246 != null && (mo15461 = abstractC13246.mo15461()) != null) {
                return mo15461.getSystemService("locale");
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m32145(Context context) {
        if (f39654 == null) {
            try {
                int i = ServiceC20219.f65410;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC20219.class), Build.VERSION.SDK_INT >= 24 ? C22335.m50068() | 128 : 640).metaData;
                if (bundle != null) {
                    f39654 = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f39654 = Boolean.FALSE;
            }
        }
        return f39654.booleanValue();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m32146(Context context) {
        if (m32145(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f39653) {
                    return;
                }
                f39650.execute(new RunnableC19781(1, context));
                return;
            }
            synchronized (f39649) {
                C3931 c3931 = f39651;
                if (c3931 == null) {
                    if (f39652 == null) {
                        f39652 = C3931.m11974(C15509.m36578(context));
                    }
                    if (f39652.m11978()) {
                    } else {
                        f39651 = f39652;
                    }
                } else if (!c3931.equals(f39652)) {
                    C3931 c39312 = f39651;
                    f39652 = c39312;
                    C15509.m36579(context, c39312.m11980());
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32139(AbstractC13246 abstractC13246) {
        synchronized (f39655) {
            m32144(abstractC13246);
            f39657.add(new WeakReference(abstractC13246));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32142(AbstractC13246 abstractC13246) {
        synchronized (f39655) {
            m32144(abstractC13246);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32141(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m32147().m11978()) {
                    String m36578 = C15509.m36578(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        C22419.m50346(systemService, C21714.m49044(m36578));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
        f39653 = true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m32144(AbstractC13246 abstractC13246) {
        synchronized (f39655) {
            Iterator it = f39657.iterator();
            while (it.hasNext()) {
                AbstractC13246 abstractC132462 = (AbstractC13246) ((WeakReference) it.next()).get();
                if (abstractC132462 == abstractC13246 || abstractC132462 == null) {
                    it.remove();
                }
            }
        }
    }
}
