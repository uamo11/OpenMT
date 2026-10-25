package l;

import java.util.Comparator;
import java.util.Map;

/* compiled from: N673 */
/* renamed from: l.ۛۙᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5837 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}
