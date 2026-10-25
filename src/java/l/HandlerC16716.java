package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.connect.common.AssistActivity;

/* compiled from: 51RR */
/* renamed from: l.ܽܶۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC16716 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AssistActivity f51341;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC16716(AssistActivity assistActivity, Looper looper) {
        super(looper);
        this.f51341 = assistActivity;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        if (message.what == 0) {
            AssistActivity assistActivity = this.f51341;
            if (assistActivity.isFinishing()) {
                return;
            }
            str = assistActivity.f892;
            C9145.m23519(str, "-->finish by timeout");
            assistActivity.finish();
        }
    }
}
