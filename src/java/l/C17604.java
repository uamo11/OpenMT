package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: P7RC */
/* renamed from: l.ܿ᩷᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17604 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f53792 = false;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f53793 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41148(View... viewArr) {
        ArrayList arrayList;
        View m42664;
        C17604 c17604 = new C17604();
        if (viewArr.length == 0) {
            return;
        }
        int length = viewArr.length;
        int i = 0;
        while (true) {
            arrayList = c17604.f53793;
            if (i >= length) {
                break;
            }
            View view = viewArr[i];
            if (view != null) {
                arrayList.add(new C18310(view, new RunnableC2539(2, c17604)));
            }
            i++;
        }
        if (arrayList.isEmpty() || (m42664 = ((C18310) arrayList.get(0)).m42664()) == null) {
            return;
        }
        m42664.post(new RunnableC2539(2, c17604));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41147(C17604 c17604) {
        ViewGroup.LayoutParams layoutParams;
        ArrayList arrayList = c17604.f53793;
        if (c17604.f53792) {
            return;
        }
        c17604.f53792 = true;
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C18310 c18310 = (C18310) it.next();
                if (!c18310.m42665()) {
                    c18310.m42663();
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            int m41146 = c17604.m41146();
            if (m41146 > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    View m42664 = ((C18310) it2.next()).m42664();
                    if (m42664 != null && (layoutParams = m42664.getLayoutParams()) != null && layoutParams.width != m41146) {
                        layoutParams.width = m41146;
                        m42664.setLayoutParams(layoutParams);
                    }
                }
            }
        } finally {
            c17604.f53792 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m41146() {
        ArrayList arrayList = this.f53793;
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View m42664 = ((C18310) it.next()).m42664();
                if (m42664 != null) {
                    arrayList2.add(new C11255(m42664));
                    ViewGroup.LayoutParams layoutParams = m42664.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = -2;
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                View m426642 = ((C18310) it2.next()).m42664();
                if (m426642 != null) {
                    m426642.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    i = Math.max(i, m426642.getMeasuredWidth());
                }
            }
            return i;
        } finally {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((C11255) it3.next()).m27851();
            }
        }
    }
}
