package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: D97E */
/* renamed from: l.֡ᩳ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0570 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m2338() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }
}
