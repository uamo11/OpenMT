package l;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;

/* compiled from: M1TZ */
/* renamed from: l.ܰ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class HandlerC14108 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f42586;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17574 f42587;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14108(C17574 c17574, Looper looper) {
        super(looper);
        this.f42587 = c17574;
        this.f42586 = new byte[4096];
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        InterfaceC16868 interfaceC16868;
        C17637 c17637;
        C11783 c11783;
        C17637 c176372;
        int i = message.what;
        C17574 c17574 = this.f42587;
        if (i == 1 && c17574.m41098()) {
            c11783 = c17574.f53719;
            byte[] bArr = this.f42586;
            int m28838 = c11783.m28838(bArr, false);
            if (m28838 > 0) {
                c176372 = c17574.f53712;
                c176372.m41252(m28838, bArr);
                C17574.m41087(c17574);
                return;
            }
            return;
        }
        if (message.what == 4) {
            int intValue = ((Integer) message.obj).intValue();
            C17574.m41081(c17574);
            interfaceC16868 = c17574.f53716;
            interfaceC16868.getClass();
            byte[] bytes = "\r\n".concat(C4925.m14306(R.string.MT_Protector_res_0x7f120a47, intValue > 0 ? C18307.m42645(intValue, "(error ", ") ") : intValue < 0 ? C3200.m9831(-intValue, ") ", new StringBuilder("(signal ")) : "")).getBytes(StandardCharsets.UTF_8);
            c17637 = c17574.f53712;
            c17637.m41252(bytes.length, bytes);
            C17574.m41087(c17574);
        }
    }
}
