package l;

import android.widget.TextView;

/* compiled from: L58U */
/* renamed from: l.ۤ֫ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC9988 implements Runnable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30104;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractDialogInterfaceOnClickListenerC22687 f30105;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2932 f30106;

    public RunnableC9988(AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687, C2932 c2932, String str) {
        this.f30105 = abstractDialogInterfaceOnClickListenerC22687;
        this.f30106 = c2932;
        this.f30104 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DialogInterfaceC0206 dialogInterfaceC0206;
        TextView textView;
        TextView textView2;
        DialogInterfaceC0206 dialogInterfaceC02062;
        AbstractDialogInterfaceOnClickListenerC22687 abstractDialogInterfaceOnClickListenerC22687 = this.f30105;
        dialogInterfaceC0206 = abstractDialogInterfaceOnClickListenerC22687.f73305;
        if (dialogInterfaceC0206 == null) {
            AbstractDialogInterfaceOnClickListenerC22687.m50701(abstractDialogInterfaceOnClickListenerC22687);
        }
        textView = abstractDialogInterfaceOnClickListenerC22687.f73306;
        C2932 c2932 = this.f30106;
        textView.setText(c2932.f9329);
        textView2 = abstractDialogInterfaceOnClickListenerC22687.f73307;
        String str = c2932.f9328;
        String concat = str.contains("\n") ? str.concat("\n->") : str.concat(" ->");
        String str2 = this.f30104;
        textView2.setText(C16014.m37867(concat, str2.contains("\n") ? "\n" : " ") + str2);
        dialogInterfaceC02062 = abstractDialogInterfaceOnClickListenerC22687.f73305;
        dialogInterfaceC02062.m1449();
    }
}
