package l;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;

/* compiled from: T8R3 */
/* renamed from: l.᩻֫ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class JobServiceC23387 extends JobService {
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        PersistableBundle extras = jobParameters.getExtras();
        int m47128 = new C20566(extras.getInt("requirements")).m47128(this);
        if (m47128 == 0) {
            String string = extras.getString("service_action");
            string.getClass();
            String string2 = extras.getString("service_package");
            string2.getClass();
            C3603.m11025(this, new Intent(string).setPackage(string2));
            return false;
        }
        C19956.m46037("Requirements not met: " + m47128);
        jobFinished(jobParameters, true);
        return false;
    }
}
