package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: RB93 */
/* renamed from: l.᩹ܳ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22338 extends AbstractC3477 {
    /* JADX WARN: Removed duplicated region for block: B:132:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0767 A[LOOP:7: B:161:0x0761->B:163:0x0767, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0651  */
    @Override // l.AbstractC3477
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10641(java.util.ArrayList r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22338.mo10641(java.util.ArrayList, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50071(C2727 c2727, Collection collection) {
        Iterator it = c2727.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C17648.m41322((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50069(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C9182.m23585(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m50069(childAt, arrayList);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50070(C2727 c2727, View view) {
        String m41322 = C17648.m41322(view);
        if (m41322 != null) {
            c2727.put(m41322, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m50070(c2727, childAt);
                }
            }
        }
    }
}
