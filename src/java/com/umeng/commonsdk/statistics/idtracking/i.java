package com.umeng.commonsdk.statistics.idtracking;

import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* compiled from: S60Z */
/* loaded from: classes.dex */
public class i extends a {
    public static final String a = "serial";

    public i() {
        super(a);
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        return DeviceConfig.getSerial();
    }
}
