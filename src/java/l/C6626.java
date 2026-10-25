package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: G4FN */
/* renamed from: l.ۜ۟᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6626 extends AbstractRunnableC15091 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20738 f20396;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18099 f20397;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6626(C20738 c20738, InterfaceC18099 interfaceC18099) {
        super("OkHttp %s", c20738.f66762.f26640.m28774());
        this.f20396 = c20738;
        this.f20397 = interfaceC18099;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18157(ExecutorService executorService) {
        AbstractC20216 abstractC20216;
        C20738 c20738 = this.f20396;
        C17209 c17209 = c20738.f66765;
        try {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                abstractC20216 = c20738.f66766;
                abstractC20216.getClass();
                this.f20397.mo42221(interruptedIOException);
                c17209.f52772.m15412(this);
            }
        } catch (Throwable th) {
            c17209.f52772.m15412(this);
            throw th;
        }
    }

    @Override // l.AbstractRunnableC15091
    /* renamed from: ֫ */
    public final void mo3633() {
        AbstractC20216 abstractC20216;
        InterfaceC18099 interfaceC18099 = this.f20397;
        C20738 c20738 = this.f20396;
        C17209 c17209 = c20738.f66765;
        c20738.f66763.m13925();
        boolean z = false;
        try {
            try {
            } finally {
                c17209.f52772.m15412(this);
            }
        } catch (IOException e) {
            e = e;
        } catch (Throwable th) {
            th = th;
        }
        try {
            interfaceC18099.mo42222(c20738.m47373());
        } catch (IOException e2) {
            e = e2;
            z = true;
            IOException m47372 = c20738.m47372(e);
            if (z) {
                C18872 m43580 = C18872.m43580();
                StringBuilder sb = new StringBuilder("Callback failure for ");
                StringBuilder sb2 = new StringBuilder();
                C20177.m46410(sb2, c20738.f66761.m48270() ? "canceled " : "", "call", " to ");
                sb2.append(c20738.f66762.f26640.m28774());
                sb.append(sb2.toString());
                m43580.mo43582(4, sb.toString(), m47372);
            } else {
                abstractC20216 = c20738.f66766;
                abstractC20216.getClass();
                interfaceC18099.mo42221(m47372);
            }
        } catch (Throwable th2) {
            th = th2;
            z = true;
            c20738.cancel();
            if (!z) {
                interfaceC18099.mo42221(new IOException("canceled due to " + th));
            }
            throw th;
        }
    }
}
