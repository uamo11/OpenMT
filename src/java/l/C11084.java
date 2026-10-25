package l;

import android.os.Bundle;
import bin.mt.plugin.api.util.ResultCallback;
import com.alipay.sdk.m.c0.d;

/* compiled from: 3B3L */
/* renamed from: l.ۧܶᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11084 implements InterfaceC11918 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f33279;

    public C11084(C22372 c22372) {
        this.f33279 = c22372;
    }

    @Override // l.InterfaceC11918
    public final void onGetPath(Bundle bundle, String str) {
        this.f33279.m50219(str, bundle.getBoolean(d.A, false));
    }

    @Override // l.InterfaceC11918
    public final void onCanceled() {
        ResultCallback resultCallback;
        ResultCallback resultCallback2;
        C22372 c22372 = this.f33279;
        resultCallback = c22372.f72514;
        if (resultCallback != null) {
            resultCallback2 = c22372.f72514;
            resultCallback2.onFailure(ResultCallback.ERROR_OPERATION_CANCELED);
            c22372.f72514 = null;
        }
    }
}
