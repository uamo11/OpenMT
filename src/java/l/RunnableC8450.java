package l;

import android.os.Bundle;
import android.os.Parcel;
import java.io.IOException;

/* compiled from: LB2O */
/* renamed from: l.۠᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC8450 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f25848;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f25849;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle f25850;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C10130 f25851;

    public RunnableC8450(AbstractC15440 abstractC15440, Bundle bundle, Object obj) {
        this.f25849 = abstractC15440;
        this.f25850 = bundle;
        this.f25851 = null;
        this.f25848 = obj;
    }

    public RunnableC8450(AbstractC15440 abstractC15440, C10130 c10130, Object obj) {
        this.f25849 = abstractC15440;
        this.f25850 = null;
        this.f25851 = c10130;
        this.f25848 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            m22126();
        } catch (IOException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22126() {
        synchronized (this.f25848) {
            if (this.f25850 == null && this.f25851 == null) {
                this.f25849.mo23552();
            } else {
                this.f25849.mo35195();
                Bundle bundle = this.f25850;
                if (bundle != null) {
                    if (bundle.isEmpty()) {
                        this.f25849.mo23552();
                    } else {
                        Parcel obtain = Parcel.obtain();
                        try {
                            this.f25850.writeToParcel(obtain, 0);
                            this.f25849.m36502(obtain.marshall());
                            obtain.recycle();
                        } catch (Throwable th) {
                            obtain.recycle();
                            throw th;
                        }
                    }
                } else {
                    this.f25849.m36496(this.f25851);
                }
            }
        }
    }
}
