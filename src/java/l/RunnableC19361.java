package l;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 31PG */
/* renamed from: l.᩵ۡۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class RunnableC19361 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public WeakReference f62679;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f62680;

    public RunnableC19361(ActivityC7365 activityC7365) {
        List list;
        this.f62679 = new WeakReference(activityC7365);
        list = activityC7365.f22617;
        this.f62680 = list;
        if (m44621().isEmpty()) {
            return;
        }
        C4925.m14316(this, 1000L);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m44621() {
        ArrayList arrayList = new ArrayList();
        for (C16742 c16742 : this.f62680) {
            int i = c16742.f51392;
            if (i == 0 || i == 1) {
                arrayList.add(c16742);
            }
        }
        return arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        boolean z;
        final ActivityC7365 activityC7365 = (ActivityC7365) this.f62679.get();
        if (activityC7365 == null || activityC7365.isFinishing()) {
            return;
        }
        List list2 = this.f62680;
        list = activityC7365.f22617;
        if (list2 != list) {
            return;
        }
        z = activityC7365.f22626;
        if (!z) {
            C4925.m14316(this, 5000L);
            return;
        }
        final ArrayList m44621 = m44621();
        if (m44621.isEmpty()) {
            return;
        }
        int size = m44621.size();
        final int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((C16742) m44621.get(i)).f51388;
        }
        C1802.f6208.execute(new Runnable() { // from class: l.ۘۡۢ
            @Override // java.lang.Runnable
            public final void run() {
                int i2;
                int[] iArr2 = iArr;
                ArrayList arrayList = m44621;
                final ActivityC7365 activityC73652 = activityC7365;
                try {
                    int[] m6340 = C1926.m6340(iArr2);
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i2 < m6340.length) {
                        if (m6340[i2] != -1) {
                            if (((C16742) arrayList.get(i2)).f51392 != m6340[i2]) {
                                ((C16742) arrayList.get(i2)).f51392 = m6340[i2];
                                z2 = true;
                            }
                            int i3 = m6340[i2];
                            i2 = (i3 == 0 || i3 == 1) ? 0 : i2 + 1;
                        }
                        z3 = true;
                    }
                    if (z2) {
                        activityC73652.runOnUiThread(new Runnable() { // from class: l.ᩴۡۢ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C15831 c15831;
                                c15831 = ActivityC7365.this.f22624;
                                c15831.notifyDataSetChanged();
                            }
                        });
                    }
                    if (!z3) {
                        return;
                    }
                } catch (C1637 unused) {
                }
                C4925.m14316(RunnableC19361.this, 5000L);
            }
        });
    }
}
