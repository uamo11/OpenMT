package l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.TransactionTooLargeException;
import bin.mt.plus.R;

/* compiled from: B9A2 */
/* renamed from: l.ܿᩴܿ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17537 implements InterfaceC16831 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ComponentName f53560;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ResolveInfo f53561;

    public C17537(ResolveInfo resolveInfo) {
        this.f53561 = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.f53560 = new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Override // l.InterfaceC16831
    /* renamed from: ֫ */
    public final String mo39605(PackageManager packageManager) {
        ResolveInfo resolveInfo = this.f53561;
        try {
            String valueOf = String.valueOf(resolveInfo.loadLabel(packageManager));
            String valueOf2 = String.valueOf(resolveInfo.activityInfo.applicationInfo.loadLabel(packageManager));
            if (valueOf.contains(valueOf2)) {
                return valueOf;
            }
            return valueOf2 + " - " + valueOf;
        } catch (Exception e) {
            return e.toString();
        }
    }

    @Override // l.InterfaceC16831
    /* renamed from: ֫ */
    public final String mo39604() {
        return this.f53560.flattenToShortString();
    }

    @Override // l.InterfaceC16831
    /* renamed from: ֫ */
    public final boolean mo39606(C12392 c12392) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.PROCESS_TEXT");
        intent.setComponent(this.f53560);
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", c12392.m30378());
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true);
        try {
            c12392.getContext().startActivity(intent);
            return true;
        } catch (Exception e) {
            if (!(e.getCause() instanceof TransactionTooLargeException)) {
                return false;
            }
            C21374.m48457(R.string.MT_Protector_res_0x7f120933);
            return true;
        }
    }
}
