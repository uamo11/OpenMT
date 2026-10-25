package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 08RN */
/* renamed from: l.ܿۛ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC17154 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2338 f52558;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC17154(C2338 c2338, Looper looper) {
        super(looper);
        this.f52558 = c2338;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ArrayList arrayList;
        byte[] bArr = (byte[]) message.obj;
        if (bArr == null) {
            return;
        }
        arrayList = this.f52558.f7520;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10805 c10805 = (C10805) it.next();
            if (c10805.m27020(bArr)) {
                c10805.m27018(message.what);
                return;
            }
        }
    }
}
