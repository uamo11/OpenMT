package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: 3BHK */
/* renamed from: l.۟ܿܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7615 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23560;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23558 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4546 f23559 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f23557 = null;

    public C7615(int i) {
        this.f23560 = new ArrayList(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20405(int i, int i2) {
        int[] iArr = this.f23557;
        boolean z = iArr == null;
        if (i != 0 || z) {
            if (i < 0) {
                throw new RuntimeException("shouldn't happen");
            }
            if (z || i2 >= iArr.length) {
                int i3 = i2 + 1;
                C4546 c4546 = new C4546(i3);
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, -1);
                if (!z) {
                    c4546.m13357(this.f23559);
                    int[] iArr3 = this.f23557;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                }
                this.f23559 = c4546;
                this.f23557 = iArr2;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20409(int i, C4546 c4546) {
        int m13356 = c4546.m13356();
        m20405(i, m13356 - 1);
        for (int i2 = 0; i2 < m13356; i2++) {
            C21480 c21480 = this.f23559.get(i2);
            C21480 c214802 = c4546.get(i2);
            if (c214802 != null && c214802.getType() == C7573.f23417) {
                c214802 = c214802.m48641(C7573.f23412);
            }
            if (c21480 == null) {
                if (c214802 != null) {
                    m20410(i, c214802);
                }
            } else if (c214802 != null) {
                if (!c214802.m48647(c21480)) {
                    m20411(i, EnumC23137.END_SIMPLY, c21480);
                    m20410(i, c214802);
                }
            } else {
                m20411(i, EnumC23137.END_SIMPLY, c21480);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20410(int i, C21480 c21480) {
        C21480 c214802;
        C21480 c214803;
        int m48652 = c21480.m48652();
        if (c21480.getType() == C7573.f23417) {
            c21480 = c21480.m48641(C7573.f23412);
        }
        m20405(i, m48652);
        C21480 c214804 = this.f23559.get(m48652);
        if (c21480.m48647(c214804)) {
            return;
        }
        C21480 m13354 = this.f23559.m13354(c21480);
        if (m13354 != null) {
            m20407(i, EnumC23137.END_MOVED, m13354);
        }
        int i2 = this.f23557[m48652];
        if (c214804 != null) {
            m20406(i, EnumC23137.END_REPLACED, c214804);
        } else if (i2 >= 0) {
            ArrayList arrayList = this.f23560;
            C13964 c13964 = (C13964) arrayList.get(i2);
            if (c13964.m33415() == i) {
                if (c13964.m33418(c21480)) {
                    arrayList.set(i2, null);
                    this.f23558++;
                    this.f23559.m13358(c21480);
                    this.f23557[m48652] = -1;
                    return;
                }
                arrayList.set(i2, c13964.m33417(EnumC23137.END_REPLACED));
            }
        }
        if (m48652 > 0 && (c214803 = this.f23559.get(m48652 - 1)) != null && c214803.m48643()) {
            m20407(i, EnumC23137.END_CLOBBERED_BY_NEXT, c214803);
        }
        if (c21480.m48643() && (c214802 = this.f23559.get(m48652 + 1)) != null) {
            m20407(i, EnumC23137.END_CLOBBERED_BY_PREV, c214802);
        }
        m20406(i, EnumC23137.START, c21480);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20411(int i, EnumC23137 enumC23137, C21480 c21480) {
        int m48652 = c21480.m48652();
        if (c21480.getType() == C7573.f23417) {
            c21480 = c21480.m48641(C7573.f23412);
        }
        m20405(i, m48652);
        if (this.f23557[m48652] >= 0) {
            return;
        }
        ArrayList arrayList = this.f23560;
        boolean z = true;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C13964 c13964 = (C13964) arrayList.get(size);
            if (c13964 != null) {
                if (c13964.m33415() != i) {
                    m20406(i, enumC23137, c21480);
                    return;
                } else if (c13964.m33418(c21480)) {
                    break;
                }
            }
            size--;
        }
        this.f23559.m13359(c21480);
        C13964 c139642 = null;
        arrayList.set(size, null);
        this.f23558++;
        int m486522 = c21480.m48652();
        while (true) {
            size--;
            if (size < 0) {
                z = false;
                break;
            }
            c139642 = (C13964) arrayList.get(size);
            if (c139642 != null && c139642.m33423().m48652() == m486522) {
                break;
            }
        }
        if (z) {
            this.f23557[m486522] = size;
            if (c139642.m33415() == i) {
                arrayList.set(size, c139642.m33417(EnumC23137.END_SIMPLY));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20406(int i, EnumC23137 enumC23137, C21480 c21480) {
        int m48652 = c21480.m48652();
        C13964 c13964 = new C13964(i, enumC23137, c21480);
        this.f23560.add(c13964);
        if (enumC23137 == EnumC23137.START) {
            this.f23559.m13358(c21480);
            this.f23557[m48652] = -1;
        } else {
            this.f23559.m13359(c21480);
            this.f23557[m48652] = r3.size() - 1;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20407(int i, EnumC23137 enumC23137, C21480 c21480) {
        if (enumC23137 == EnumC23137.START) {
            throw new RuntimeException("shouldn't happen");
        }
        int i2 = this.f23557[c21480.m48652()];
        if (i2 >= 0) {
            ArrayList arrayList = this.f23560;
            C13964 c13964 = (C13964) arrayList.get(i2);
            if (c13964.m33415() == i && c13964.m33423().equals(c21480)) {
                arrayList.set(i2, c13964.m33417(enumC23137));
                this.f23559.m13359(c21480);
                return;
            }
        }
        m20411(i, enumC23137, c21480);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1887 m20408() {
        m20405(Integer.MAX_VALUE, 0);
        ArrayList arrayList = this.f23560;
        int size = arrayList.size();
        int i = size - this.f23558;
        if (i == 0) {
            return C1887.f6397;
        }
        C13964[] c13964Arr = new C13964[i];
        if (size == i) {
            arrayList.toArray(c13964Arr);
        } else {
            Iterator it = arrayList.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C13964 c13964 = (C13964) it.next();
                if (c13964 != null) {
                    c13964Arr[i2] = c13964;
                    i2++;
                }
            }
        }
        Arrays.sort(c13964Arr);
        C1887 c1887 = new C1887(i);
        for (int i3 = 0; i3 < i; i3++) {
            c1887.m40985(i3, c13964Arr[i3]);
        }
        c1887.mo20349();
        return c1887;
    }
}
