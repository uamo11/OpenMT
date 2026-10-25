package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AWSRequestMetrics;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Log f816 = LogFactory.m303("com.amazonaws.latency");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f817;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f818;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSRequestMetricsFullSupport() {
        super(new TimingInfoFullSupport(System.nanoTime()));
        System.currentTimeMillis();
        this.f818 = new HashMap();
        this.f817 = new HashMap();
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* renamed from: ܽ */
    public final void mo736(AWSRequestMetrics.Field field) {
        this.f817.put(field.name(), new TimingInfoFullSupport(System.nanoTime()));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* renamed from: ֫ */
    public final void mo732(AWSRequestMetrics.Field field) {
        String name = field.name();
        TimingInfo timingInfo = (TimingInfo) this.f817.get(name);
        if (timingInfo == null) {
            LogFactory.m302(getClass()).mo300("Trying to end an event which was never started: " + name);
            return;
        }
        timingInfo.mo790();
        this.f794.mo793(name, new TimingInfoUnmodifiable(timingInfo.m795(), Long.valueOf(timingInfo.m794())));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* renamed from: ۧ */
    public final void mo735(AWSRequestMetrics.Field field) {
        this.f794.mo792(field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* renamed from: ֫ */
    public final void mo733(AWSRequestMetrics.Field field, long j) {
        this.f794.mo791(j, field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* renamed from: ֫ */
    public final void mo734(AWSRequestMetrics.Field field, Serializable serializable) {
        String name = field.name();
        HashMap hashMap = this.f818;
        List list = (List) hashMap.get(name);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(name, list);
        }
        list.add(serializable);
    }
}
