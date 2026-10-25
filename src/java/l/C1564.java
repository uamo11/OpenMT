package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* compiled from: LAIU */
/* renamed from: l.֫ۗ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1564 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ComponentName f5517;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ComponentName f5518;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ComponentName f5519;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f5520;

    public C1564(Context context) {
        ComponentName componentName = new ComponentName(context, "bin.mt.plus.MainLightIcon");
        this.f5518 = componentName;
        ComponentName componentName2 = new ComponentName(context, "bin.mt.plus.MainDarkIcon");
        this.f5517 = componentName2;
        this.f5519 = new ComponentName(context, "bin.mt.plus.MainNoBgIcon");
        PackageManager m14320 = C4925.m14320();
        int componentEnabledSetting = m14320.getComponentEnabledSetting(componentName);
        if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
            this.f5520 = 0;
        } else if (m14320.getComponentEnabledSetting(componentName2) == 1) {
            this.f5520 = 1;
        } else {
            this.f5520 = 2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentName m5345() {
        int i = this.f5520;
        if (i == 0) {
            return this.f5518;
        }
        if (i == 1) {
            return this.f5517;
        }
        if (i == 2) {
            return this.f5519;
        }
        throw new RuntimeException();
    }
}
