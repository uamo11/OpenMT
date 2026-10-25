package l;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.os.IBinder;

/* compiled from: 268P */
/* renamed from: l.ܰ᩹, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class JobServiceEngineC14098 extends JobServiceEngine {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f42565;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JobParameters f42566;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractServiceC11215 f42567;

    public JobServiceEngineC14098(AbstractServiceC11215 abstractServiceC11215) {
        super(abstractServiceC11215);
        this.f42565 = new Object();
        this.f42567 = abstractServiceC11215;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IBinder m33707() {
        return getBinder();
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStartJob(JobParameters jobParameters) {
        this.f42566 = jobParameters;
        this.f42567.m27785(false);
        return true;
    }

    @Override // android.app.job.JobServiceEngine
    public final boolean onStopJob(JobParameters jobParameters) {
        AsyncTaskC12688 asyncTaskC12688 = this.f42567.f33652;
        if (asyncTaskC12688 != null) {
            asyncTaskC12688.cancel(false);
        }
        synchronized (this.f42565) {
            this.f42566 = null;
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23271 m33708() {
        synchronized (this.f42565) {
            JobParameters jobParameters = this.f42566;
            if (jobParameters == null) {
                return null;
            }
            JobWorkItem dequeueWork = jobParameters.dequeueWork();
            if (dequeueWork == null) {
                return null;
            }
            dequeueWork.getIntent().setExtrasClassLoader(this.f42567.getClassLoader());
            return new C23271(this, dequeueWork);
        }
    }
}
