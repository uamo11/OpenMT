package l;

import java.util.ArrayList;

/* compiled from: 44FR */
/* renamed from: l.۫ܰ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12454 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f37457 = new ArrayList(20);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30613(String str) {
        int indexOf = str.indexOf(":", 1);
        if (indexOf != -1) {
            m30616(str.substring(0, indexOf), str.substring(indexOf + 1));
        } else if (str.startsWith(":")) {
            m30616("", str.substring(1));
        } else {
            m30616("", str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30614(String str, String str2) {
        C10338.m26135(str);
        C10338.m26133(str2, str);
        m30616(str, str2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30616(String str, String str2) {
        ArrayList arrayList = this.f37457;
        arrayList.add(str);
        arrayList.add(str2.trim());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30617(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f37457;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m30615(String str) {
        ArrayList arrayList = this.f37457;
        int size = arrayList.size();
        do {
            size -= 2;
            if (size < 0) {
                return null;
            }
        } while (!str.equalsIgnoreCase((String) arrayList.get(size)));
        return (String) arrayList.get(size + 1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10338 m30612() {
        return new C10338(this);
    }
}
