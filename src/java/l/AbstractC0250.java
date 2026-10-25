package l;

import com.alipay.sdk.m.t.e;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: XBDS */
/* renamed from: l.֡ۜܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC0250 extends AbstractC17598 {
    @Override // l.AbstractC17598
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void mo1508() {
        int i = 0;
        if (mo6834().size() <= 65536) {
            Iterator it = mo6834().iterator();
            while (it.hasNext()) {
                ((AbstractC19302) it.next()).m37187(i);
                i++;
            }
            return;
        }
        TreeMap treeMap = new TreeMap();
        Iterator it2 = mo6834().iterator();
        while (it2.hasNext()) {
            String string = ((AbstractC19302) it2.next()).m22521().m30697().getString();
            int lastIndexOf = string.lastIndexOf(47);
            String replace = lastIndexOf == -1 ? "default" : string.substring(string.lastIndexOf(91) + 2, lastIndexOf).replace('/', '.');
            AtomicInteger atomicInteger = (AtomicInteger) treeMap.get(replace);
            if (atomicInteger == null) {
                atomicInteger = new AtomicInteger();
                treeMap.put(replace, atomicInteger);
            }
            atomicInteger.incrementAndGet();
        }
        Formatter formatter = new Formatter();
        try {
            formatter.format("Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:", this instanceof C21418 ? e.s : "field", Integer.valueOf(mo6834().size()), 65536);
            for (Map.Entry entry : treeMap.entrySet()) {
                formatter.format("%n%6d %s", Integer.valueOf(((AtomicInteger) entry.getValue()).get()), entry.getKey());
            }
            String formatter2 = formatter.toString();
            formatter.close();
            throw new C5314(formatter2, null);
        } catch (Throwable th) {
            formatter.close();
            throw th;
        }
    }
}
