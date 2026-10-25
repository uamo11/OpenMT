package l;

import android.os.Bundle;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: X6AW */
/* renamed from: l.ۢۘ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC9331 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ IBinder f28299;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f28300;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28301;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f28302;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f28303;

    public RunnableC9331(C0157 c0157, C0863 c0863, String str, IBinder iBinder, Bundle bundle) {
        this.f28302 = c0157;
        this.f28303 = c0863;
        this.f28301 = str;
        this.f28299 = iBinder;
        this.f28300 = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IBinder binder = this.f28303.f3353.getBinder();
        C0157 c0157 = this.f28302;
        C9996 c9996 = (C9996) c0157.f1338.f45642.getOrDefault(binder, null);
        if (c9996 == null) {
            return;
        }
        HashMap hashMap = c9996.f30118;
        AbstractServiceC14974 abstractServiceC14974 = c0157.f1338;
        String str = this.f28301;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            IBinder iBinder = this.f28299;
            Bundle bundle = this.f28300;
            if (!hasNext) {
                list.add(new C10220(iBinder, bundle));
                hashMap.put(str, list);
                C21990 c21990 = new C21990(abstractServiceC14974, str, c9996, str, bundle);
                if (bundle == null) {
                    abstractServiceC14974.m35458();
                } else {
                    c21990.m33913(1);
                    abstractServiceC14974.m35458();
                }
                if (!c21990.m33914()) {
                    throw new IllegalStateException(C23202.m51498(new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package="), c9996.f30116, " id=", str));
                }
                return;
            }
            C10220 c10220 = (C10220) it.next();
            if (iBinder == c10220.f30697 && C11807.m28868(bundle, (Bundle) c10220.f30698)) {
                return;
            }
        }
    }
}
