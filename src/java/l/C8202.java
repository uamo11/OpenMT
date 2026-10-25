package l;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Z1JW */
/* renamed from: l.۠۬᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8202 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f25209 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21700(AbstractActivityC3346 abstractActivityC3346, int i) {
        C1146 c1146;
        ArrayList arrayList = this.f25209;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1146 = null;
                break;
            } else {
                c1146 = (C1146) it.next();
                if (c1146.f4158 == i) {
                    break;
                }
            }
        }
        if (c1146 == null) {
            c1146 = new C1146(i);
            arrayList.add(c1146);
        }
        if (c1146.f4159 == null) {
            c1146.f4159 = abstractActivityC3346.m10216(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m21699(int i) {
        Iterator it = this.f25209.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1146 c1146 = (C1146) it.next();
            if (c1146.f4158 == i) {
                View view = c1146.f4159;
                if (view != null) {
                    c1146.f4159 = null;
                    return view;
                }
            }
        }
        return null;
    }
}
