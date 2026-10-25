package l;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: K7MX */
/* renamed from: l.ܺ᩺֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16239 implements InterfaceC1857 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19063 f49989;

    public C16239(C19063 c19063) {
        this.f49989 = c19063;
    }

    @Override // l.InterfaceC1857
    /* renamed from: ᩳ */
    public final void mo6171() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        copyOnWriteArrayList = this.f49989.f60042;
        copyOnWriteArrayList.remove(this);
    }

    @Override // l.InterfaceC1857
    /* renamed from: ֫ */
    public final boolean mo6170(Uri uri, C1885 c1885, boolean z) {
        C4951 c4951;
        HashMap hashMap;
        HashMap hashMap2;
        long j;
        C19063 c19063 = this.f49989;
        c4951 = c19063.f60043;
        if (c4951 == null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C12712 c12712 = c19063.f60039;
            String str = C3603.f11424;
            List list = c12712.f38258;
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                hashMap2 = c19063.f60037;
                C4246 c4246 = (C4246) hashMap2.get(((C13417) list.get(i2)).f40105);
                if (c4246 != null) {
                    j = c4246.f13768;
                    if (elapsedRealtime < j) {
                        i++;
                    }
                }
            }
            C7613 mo27442 = c19063.f60041.mo27442(new C13962(c19063.f60039.f38258.size(), i), c1885);
            if (mo27442 != null && mo27442.f23556 == 2) {
                hashMap = c19063.f60037;
                C4246 c42462 = (C4246) hashMap.get(uri);
                if (c42462 != null) {
                    C4246.m12770(c42462, mo27442.f23555);
                }
            }
        }
        return false;
    }
}
