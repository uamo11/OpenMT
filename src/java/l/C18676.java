package l;

import java.util.Comparator;

/* compiled from: K1PX */
/* renamed from: l.ᩴۢۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C18676 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C15852 c15852 = (C15852) obj;
        C15852 c158522 = (C15852) obj2;
        boolean z = c15852.f48971;
        String str = c15852.f48969;
        boolean z2 = c158522.f48971;
        String str2 = c158522.f48969;
        if (z != z2) {
            return z ? -1 : 1;
        }
        if (str.equals("..")) {
            return -1;
        }
        if (str2.equals("..")) {
            return 1;
        }
        return str.compareToIgnoreCase(str2);
    }
}
