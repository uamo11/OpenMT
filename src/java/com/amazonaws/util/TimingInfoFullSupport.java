package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class TimingInfoFullSupport extends TimingInfo {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f847;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f848;

    public TimingInfoFullSupport(long j) {
        super(j, null);
        this.f848 = new HashMap();
        this.f847 = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    /* renamed from: ֫ */
    public final void mo793(String str, TimingInfo timingInfo) {
        HashMap hashMap = this.f848;
        List list = (List) hashMap.get(str);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(str, list);
        }
        if (timingInfo.m796()) {
            list.add(timingInfo);
            return;
        }
        LogFactory.m302(getClass()).mo294("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* renamed from: ֫ */
    public final void mo792(String str) {
        mo791((((Number) this.f847.get(str)) != null ? r0.intValue() : 0) + 1, str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* renamed from: ֫ */
    public final void mo791(long j, String str) {
        this.f847.put(str, Long.valueOf(j));
    }
}
