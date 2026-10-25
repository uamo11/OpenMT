package l;

import android.content.DialogInterface;
import org.json.JSONObject;

/* compiled from: 51RR */
/* renamed from: l.᩵۠ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class DialogInterfaceOnCancelListenerC19335 implements DialogInterface.OnCancelListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4227 f60784;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ JSONObject f60785;

    public DialogInterfaceOnCancelListenerC19335(InterfaceC4227 interfaceC4227, JSONObject jSONObject) {
        this.f60784 = interfaceC4227;
        this.f60785 = jSONObject;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        InterfaceC4227 interfaceC4227 = this.f60784;
        if (interfaceC4227 != null) {
            interfaceC4227.mo3455(this.f60785);
        }
    }
}
