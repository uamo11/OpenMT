package l;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: O5NM */
/* renamed from: l.ܺۜ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15762 extends AbstractC21735 {
    @Override // l.AbstractC21735
    /* renamed from: ֫ */
    public final Intent mo2798(Context context, Object obj) {
        Bundle bundleExtra;
        C8329 c8329 = (C8329) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent m21931 = c8329.m21931();
        if (m21931 != null && (bundleExtra = m21931.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            m21931.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (m21931.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                C5507 c5507 = new C5507(c8329.m21934());
                c5507.m15642(null);
                c5507.m15641(c8329.m21933(), c8329.m21932());
                c8329 = c5507.m15640();
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c8329);
        if (AbstractC5180.m14853(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // l.AbstractC21735
    /* renamed from: ֫ */
    public final Object mo2799(Intent intent, int i) {
        return new C6918(intent, i);
    }
}
