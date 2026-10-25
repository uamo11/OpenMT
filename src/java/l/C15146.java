package l;

import java.util.Comparator;
import java.util.Map;

/* compiled from: EB82 */
/* renamed from: l.ܶۢۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C15146 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
