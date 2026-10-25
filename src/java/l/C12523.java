package l;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import java.util.List;

/* compiled from: UB1K */
/* renamed from: l.۫ܽ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C12523 extends C13228 {
    @Override // l.C13228
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List mo30724(PackageManager packageManager, Intent intent) {
        return packageManager.queryIntentContentProviders(intent, 0);
    }

    @Override // l.C13228
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ProviderInfo mo30723(ResolveInfo resolveInfo) {
        return resolveInfo.providerInfo;
    }
}
