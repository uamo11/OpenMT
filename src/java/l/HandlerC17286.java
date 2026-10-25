package l;

import android.media.MediaScannerConnection;
import android.os.Handler;
import android.os.Message;

/* compiled from: 3AN5 */
/* renamed from: l.ܿۤܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC17286 extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7124 c7124;
        String[] strArr;
        C7124 c71242;
        synchronized (C14463.class) {
            c7124 = C14463.f44332;
            strArr = (String[]) c7124.toArray(new String[0]);
            c71242 = C14463.f44332;
            c71242.clear();
        }
        if (strArr.length > 0) {
            MediaScannerConnection.scanFile(C4925.m14335(), strArr, null, null);
        }
    }
}
