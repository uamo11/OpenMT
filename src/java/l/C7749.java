package l;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.Intent;

/* compiled from: 268P */
/* renamed from: l.۟᩹, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7749 extends AbstractC2042 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final JobScheduler f23971;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final JobInfo f23972;

    public C7749(ContextWrapper contextWrapper, ComponentName componentName, int i) {
        super(componentName);
        m6711(i);
        this.f23972 = new JobInfo.Builder(i, componentName).setOverrideDeadline(0L).build();
        this.f23971 = (JobScheduler) contextWrapper.getApplicationContext().getSystemService("jobscheduler");
    }

    @Override // l.AbstractC2042
    /* renamed from: ֫ */
    public final void mo6712(Intent intent) {
        this.f23971.enqueue(this.f23972, new JobWorkItem(intent));
    }
}
