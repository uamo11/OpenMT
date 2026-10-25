package l;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

/* compiled from: 4BMC */
/* renamed from: l.ۜۨۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6741 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f20946 = 0;

    static {
        if (C15871.m37616()) {
            return;
        }
        UMConfigure.setEncryptEnabled(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18356() {
        if (C15871.m37616()) {
            return;
        }
        MobclickAgent.onProfileSignIn(C23196.m51459().toLowerCase());
    }
}
