package l;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: E8BO */
/* renamed from: l.ܶ֨ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14893 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final TreeMap f45443 = new TreeMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized List m35337(C21245 c21245) {
        List list;
        if (!this.f45443.isEmpty()) {
            C21245 c212452 = (C21245) this.f45443.firstKey();
            list = c212452.compareTo(c21245) <= 0 ? (List) this.f45443.remove(c212452) : null;
        }
        return list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m35338(C21245 c21245, InterfaceC7838 interfaceC7838) {
        List list = (List) this.f45443.get(c21245);
        if (list == null) {
            list = new LinkedList();
            this.f45443.put(c21245, list);
        }
        list.add(interfaceC7838);
    }
}
