package l;

import java.io.IOException;

/* compiled from: F43P */
/* renamed from: l.ᩳܿ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18194 extends Thread {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11844 f56576;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18194(C11844 c11844, String str) {
        super(str);
        this.f56576 = c11844;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        try {
            synchronized (this.f56576) {
                long currentTimeMillis = System.currentTimeMillis();
                while (true) {
                    j = this.f56576.f67845;
                    C11844 c11844 = this.f56576;
                    if (currentTimeMillis < j + c11844.f67848) {
                        j2 = c11844.f67845;
                        c11844.wait((j2 + this.f56576.f67848) - currentTimeMillis);
                        currentTimeMillis = System.currentTimeMillis();
                    } else {
                        c11844.f67848 = 0L;
                        c11844.close();
                    }
                }
            }
        } catch (IOException | InterruptedException unused) {
        }
    }
}
