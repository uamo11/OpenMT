package l;

import java.util.ArrayList;

/* compiled from: C1TT */
/* renamed from: l.ۚۗۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5082 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String[] f15967 = {".*[^a-zA-Z0-9_$/].*", "[0oO]{3,}", "[Ii]{6,}"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f15968 = new ArrayList();

    public C5082(String str) {
        int i = 0;
        if (str.isEmpty()) {
            while (i < 3) {
                this.f15968.add(new C5814(C11459.m28260(f15967[i])));
                i++;
            }
            return;
        }
        String[] split = str.split("\n");
        int length = split.length;
        while (i < length) {
            this.f15968.add(new C5814(C11459.m28260(split[i])));
            i++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m14632(String str) {
        return m14630(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14631(String str) {
        if (!m14630(str)) {
            int lastIndexOf = str.lastIndexOf(47);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            int i = 0;
            while (true) {
                int indexOf = str.indexOf(36, i);
                if (indexOf != -1) {
                    if (m14630(str.substring(i, indexOf))) {
                        break;
                    }
                    i++;
                } else {
                    return m14630(str.substring(i));
                }
            }
        }
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m14635(String str) {
        if (m14633(str)) {
            return true;
        }
        int i = 0;
        while (true) {
            int indexOf = str.indexOf(47, i);
            if (indexOf != -1) {
                if (m14630(str.substring(i, indexOf))) {
                    return true;
                }
                i++;
            } else {
                return m14630(str.substring(i));
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m14633(String str) {
        if (str.length() >= 20 && (str.length() > 100 || C9679.m24605(str, '/') > 10)) {
            return true;
        }
        return m14630(str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m14634(String str) {
        return m14630(str);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private boolean m14630(String str) {
        ArrayList arrayList = this.f15968;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C12164 c12164 = ((C5814) arrayList.get(i)).get();
            c12164.m29615reset((CharSequence) str);
            if (c12164.matches()) {
                return true;
            }
        }
        return false;
    }
}
