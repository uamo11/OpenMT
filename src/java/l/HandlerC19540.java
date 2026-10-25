package l;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.Toast;
import com.tencent.open.TDialog;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: 51RR */
/* renamed from: l.᩵ܶۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class HandlerC19540 extends Handler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f63118;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18834 f63119;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC19540(TDialog tDialog, C18834 c18834, Looper looper) {
        super(looper);
        this.f63118 = tDialog;
        this.f63119 = c18834;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        WeakReference weakReference5;
        WeakReference weakReference6;
        C9145.m23513("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
        int i = message.what;
        C18834 c18834 = this.f63119;
        if (i == 1) {
            String str = (String) message.obj;
            c18834.getClass();
            try {
                c18834.mo3455(C18338.m42748(str));
                return;
            } catch (JSONException unused) {
                c18834.mo3454(new C19750(-4, "服务器返回数据格式有误!", str));
                return;
            }
        }
        if (i == 2) {
            c18834.mo3453();
            return;
        }
        TDialog tDialog = this.f63118;
        if (i != 3) {
            if (i != 5) {
                return;
            }
            weakReference4 = tDialog.f904;
            if (weakReference4 != null) {
                weakReference5 = tDialog.f904;
                if (weakReference5.get() != null) {
                    weakReference6 = tDialog.f904;
                    TDialog.m921((Context) weakReference6.get(), (String) message.obj);
                    return;
                }
                return;
            }
            return;
        }
        weakReference = tDialog.f904;
        if (weakReference != null) {
            weakReference2 = tDialog.f904;
            if (weakReference2.get() != null) {
                weakReference3 = tDialog.f904;
                Context context = (Context) weakReference3.get();
                try {
                    JSONObject m42748 = C18338.m42748((String) message.obj);
                    int i2 = m42748.getInt("type");
                    String string = m42748.getString("msg");
                    if (i2 == 0) {
                        Toast toast = TDialog.f897;
                        if (toast == null) {
                            TDialog.f897 = Toast.makeText(context, string, 0);
                        } else {
                            toast.setView(toast.getView());
                            TDialog.f897.setText(string);
                            TDialog.f897.setDuration(0);
                        }
                        TDialog.f897.show();
                        return;
                    }
                    if (i2 == 1) {
                        Toast toast2 = TDialog.f897;
                        if (toast2 == null) {
                            TDialog.f897 = Toast.makeText(context, string, 1);
                        } else {
                            toast2.setView(toast2.getView());
                            TDialog.f897.setText(string);
                            TDialog.f897.setDuration(1);
                        }
                        TDialog.f897.show();
                    }
                } catch (JSONException unused2) {
                }
            }
        }
    }
}
