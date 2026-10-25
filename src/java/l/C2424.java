package l;

import bin.mt.json.JSON;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: 46X2 */
/* renamed from: l.ۖۡۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2424 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public List f7714;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f7715;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7716;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12619 f7717;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f7718;

    public /* synthetic */ C2424(AbstractC15440 abstractC15440, C12619 c12619, int i) {
        this(abstractC15440, c12619);
    }

    public C2424(AbstractC15440 abstractC15440) {
        this(abstractC15440, null);
    }

    public C2424(AbstractC15440 abstractC15440, C12619 c12619) {
        this.f7715 = abstractC15440;
        this.f7717 = c12619;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7855(C2424 c2424, List list, String str, String str2) {
        String m1696;
        C3059 m1681;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m1696 = C0306.m1696(c2424, (C12619) it.next(), str, str2);
            if (!hashSet.add(m1696)) {
                m1681 = C0306.m1681("FILE_STORAGE_ERROR", "The backend returned a duplicate directory child.", str, str2, "list_directory", "duplicate_child", "non_atomic", JSON.array(), m1696, "list_directory");
                throw m1681;
            }
        }
        c2424.f7714 = list;
        c2424.f7716 = 0;
        c2424.f7718 = true;
    }
}
