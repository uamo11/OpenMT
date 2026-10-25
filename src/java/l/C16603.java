package l;

import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 7AMJ */
/* renamed from: l.ܽۧܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16603 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6726 m39100(Activity activity, FoldingFeature foldingFeature) {
        C23659 c23659;
        C17309 c17309;
        Rect rect;
        int i;
        int type = foldingFeature.getType();
        if (type != 1) {
            if (type == 2) {
                c23659 = C23659.f76651;
            }
            return null;
        }
        c23659 = C23659.f76650;
        int state = foldingFeature.getState();
        if (state != 1) {
            if (state == 2) {
                c17309 = C17309.f53018;
            }
            return null;
        }
        c17309 = C17309.f53017;
        Rect bounds = foldingFeature.getBounds();
        C11233.m27803(bounds, "oemFeature.bounds");
        C5046 c5046 = new C5046(bounds);
        C6890.f21285.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            rect = C5752.m16195(activity);
        } else if (i2 >= 29) {
            Configuration configuration = activity.getResources().getConfiguration();
            try {
                Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(configuration);
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                if (invoke == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect = new Rect((Rect) invoke);
            } catch (IllegalAccessException unused) {
                rect = C6890.m18660(activity);
            } catch (NoSuchFieldException unused2) {
                rect = C6890.m18660(activity);
            } catch (NoSuchMethodException unused3) {
                rect = C6890.m18660(activity);
            } catch (InvocationTargetException unused4) {
                rect = C6890.m18660(activity);
            }
        } else if (i2 >= 28) {
            rect = C6890.m18660(activity);
        } else if (i2 >= 24) {
            Rect rect2 = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect2);
            if (!C9986.m25149(activity)) {
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Resources resources = activity.getResources();
                int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
                int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
                int i3 = rect2.bottom + dimensionPixelSize;
                if (i3 == point.y) {
                    rect2.bottom = i3;
                } else {
                    int i4 = rect2.right + dimensionPixelSize;
                    if (i4 == point.x) {
                        rect2.right = i4;
                    }
                }
            }
            rect = rect2;
        } else {
            Display defaultDisplay2 = activity.getWindowManager().getDefaultDisplay();
            C11233.m27803(defaultDisplay2, "defaultDisplay");
            Point point2 = new Point();
            defaultDisplay2.getRealSize(point2);
            Rect rect3 = new Rect();
            int i5 = point2.x;
            if (i5 == 0 || (i = point2.y) == 0) {
                defaultDisplay2.getRectSize(rect3);
            } else {
                rect3.right = i5;
                rect3.bottom = i;
            }
            rect = rect3;
        }
        Rect m34940 = new C14650(rect).m34940();
        if ((c5046.m14566() != 0 || c5046.m14570() != 0) && ((c5046.m14570() == m34940.width() || c5046.m14566() == m34940.height()) && ((c5046.m14570() >= m34940.width() || c5046.m14566() >= m34940.height()) && (c5046.m14570() != m34940.width() || c5046.m14566() != m34940.height())))) {
            Rect bounds2 = foldingFeature.getBounds();
            C11233.m27803(bounds2, "oemFeature.bounds");
            return new C6726(new C5046(bounds2), c23659, c17309);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17473 m39101(Activity activity, WindowLayoutInfo windowLayoutInfo) {
        C6726 c6726;
        C11233.m27805(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        C11233.m27803(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                C11233.m27803(foldingFeature, "feature");
                c6726 = m39100(activity, foldingFeature);
            } else {
                c6726 = null;
            }
            if (c6726 != null) {
                arrayList.add(c6726);
            }
        }
        return new C17473(arrayList);
    }
}
