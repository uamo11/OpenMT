package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class m extends FutureTask {
    public final /* synthetic */ q a;
    public final /* synthetic */ l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, Callable callable, q qVar) {
        super(callable);
        this.b = lVar;
        this.a = qVar;
    }

    @Override // java.util.concurrent.FutureTask
    public void done() {
        String str;
        int i;
        o e = this.a.e();
        ae f = e.f();
        if (f == null) {
            super.done();
            return;
        }
        try {
            v vVar = (v) get();
            if (!isCancelled() && !e.h()) {
                if (vVar != null) {
                    f.a(e, vVar);
                    return;
                }
                return;
            }
            e.g();
            if (!isCancelled() || !isDone()) {
                cancel(false);
            }
            f.a(e);
        } catch (InterruptedException e2) {
            f.a(e, 7, e2 + "");
        } catch (CancellationException unused) {
            e.g();
            f.a(e);
        } catch (ExecutionException e3) {
            if (e3.getCause() == null || !(e3.getCause() instanceof HttpException)) {
                str = e3 + "";
                i = 6;
            } else {
                HttpException httpException = (HttpException) e3.getCause();
                i = httpException.getCode();
                str = httpException.getMsg();
            }
            f.a(e, i, str);
        } catch (Throwable th) {
            throw new RuntimeException("An error occured while executing http request", th);
        }
    }
}
