package l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;

/* compiled from: X6AW */
/* renamed from: l.ۖۘ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC2275 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7364;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f7365;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7366;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0157 f7367;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0863 f7368;

    public RunnableC2275(int i, int i2, Bundle bundle, C0157 c0157, C0863 c0863, String str) {
        this.f7367 = c0157;
        this.f7368 = c0863;
        this.f7364 = i;
        this.f7365 = str;
        this.f7366 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9996 c9996;
        C0863 c0863 = this.f7368;
        IBinder binder = c0863.f3353.getBinder();
        C0157 c0157 = this.f7367;
        c0157.f1338.f45642.remove(binder);
        AbstractServiceC14974 abstractServiceC14974 = c0157.f1338;
        Iterator it = abstractServiceC14974.f45640.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C9996 c99962 = (C9996) it.next();
            if (c99962.f30115 == this.f7364) {
                c9996 = (TextUtils.isEmpty(this.f7365) || this.f7366 <= 0) ? new C9996(abstractServiceC14974, c99962.f30116, c99962.f30114, c99962.f30115, c0863) : null;
                it.remove();
            }
        }
        if (c9996 == null) {
            c9996 = new C9996(abstractServiceC14974, this.f7365, this.f7366, this.f7364, c0863);
        }
        abstractServiceC14974.f45642.put(binder, c9996);
        try {
            binder.linkToDeath(c9996, 0);
        } catch (RemoteException unused) {
        }
    }
}
