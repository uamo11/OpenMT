package bin.mt.plugin.api.util;

import bin.mt.plugin.api.PluginContext;
import java.util.concurrent.Executor;
import l.RunnableC19781;
import l.RunnableC22286;
import l.RunnableC23572;

/* loaded from: classes.dex */
public abstract class AsyncTask {
    public final PluginContext context;
    public Executor executor = android.os.AsyncTask.THREAD_POOL_EXECUTOR;

    public abstract void afterThread();

    public abstract void beforeThread();

    public abstract void onException(Exception exc);

    public abstract void onFinally();

    public abstract void onThread();

    public AsyncTask(PluginContext pluginContext) {
        this.context = pluginContext;
    }

    public void start() {
        try {
            beforeThread();
            this.executor.execute(new RunnableC19781(6, this));
        } catch (Exception e) {
            try {
                onException(e);
            } finally {
                onFinally();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$1() {
        try {
            onThread();
            ThreadUtil.post(new RunnableC22286(3, this));
        } catch (Exception e) {
            handleError(e);
        } catch (OutOfMemoryError e2) {
            handleError(new Exception(this.context.getString("{out_of_memory_error}"), e2));
        } catch (Throwable th) {
            handleError(new Exception(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$start$0() {
        try {
            try {
                try {
                    afterThread();
                    onFinally();
                } catch (OutOfMemoryError e) {
                    onException(new Exception(this.context.getString("{out_of_memory_error}"), e));
                    onFinally();
                }
            } catch (Exception e2) {
                onException(e2);
                onFinally();
            } catch (Throwable th) {
                onException(new Exception(th));
                onFinally();
            }
        } catch (Throwable th2) {
            onFinally();
            throw th2;
        }
    }

    private void handleError(Exception exc) {
        ThreadUtil.post(new RunnableC23572(2, this, exc));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$handleError$2(Exception exc) {
        try {
            onException(exc);
        } finally {
            onFinally();
        }
    }
}
