package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: 5ATX */
/* renamed from: l.֨ۜܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0958 extends C21794 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m3393() {
        ArrayList arrayList = new ArrayList(values());
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            return "";
        }
        if (arrayList.size() == 1) {
            return ((C5192) arrayList.get(0)).m14961();
        }
        StringBuilder sb = new StringBuilder("(?:");
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = true;
        while (it.hasNext()) {
            String m14961 = ((C5192) it.next()).m14961();
            if (m14961.isEmpty()) {
                z = true;
            } else {
                if (z2) {
                    z2 = false;
                } else {
                    sb.append('|');
                }
                sb.append(m14961);
            }
        }
        sb.append(z ? ")?" : MotionUtils.EASING_TYPE_FORMAT_END);
        return sb.toString();
    }
}
