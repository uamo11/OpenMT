package l;

import android.view.View;
import java.util.Comparator;

/* compiled from: S6AR */
/* renamed from: l.ܽ᩹, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16921 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float m41318 = C17648.m41318((View) obj);
        float m413182 = C17648.m41318((View) obj2);
        if (m41318 > m413182) {
            return -1;
        }
        return m41318 < m413182 ? 1 : 0;
    }
}
