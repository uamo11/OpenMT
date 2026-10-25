package l;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: I4HH */
/* renamed from: l.ۨۤܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class HandlerC11645 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C22933 c22933 = (C22933) ((WeakReference) message.obj).get();
        if (c22933 != null) {
            c22933.m51035();
        }
    }
}
