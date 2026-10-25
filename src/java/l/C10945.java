package l;

import android.content.DialogInterface;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: Y6Y9 */
/* renamed from: l.ۧۤ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10945 implements InterfaceC12846 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC14532 f32964;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f32965;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14506 f32966;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16955 f32967;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f32968;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f32969;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f32970;

    @Override // l.InterfaceC12846
    public final void onCanceled() {
    }

    public C10945(boolean z, C14506 c14506, DialogInterfaceC0206 dialogInterfaceC0206, C16955 c16955, RunnableC14532 runnableC14532, TextView textView, AbstractActivityC3346 abstractActivityC3346) {
        this.f32970 = z;
        this.f32966 = c14506;
        this.f32968 = dialogInterfaceC0206;
        this.f32967 = c16955;
        this.f32964 = runnableC14532;
        this.f32965 = textView;
        this.f32969 = abstractActivityC3346;
    }

    @Override // l.InterfaceC12846
    /* renamed from: ֫ */
    public final void mo3776(C11667 c11667, boolean z) {
        boolean z2 = this.f32970;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f32968;
        if (!z2 || (this.f32966.m34618(dialogInterfaceC0206) && dialogInterfaceC0206.m1442())) {
            C19911.m45807(this.f32967);
            this.f32964.run();
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
            dialogInterfaceC0206.dismiss();
        }
    }

    @Override // l.InterfaceC12846
    /* renamed from: ֫ */
    public final boolean mo3777(Exception exc) {
        boolean z = this.f32970;
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f32968;
        if (z && (!this.f32966.m34618(dialogInterfaceC0206) || !dialogInterfaceC0206.m1442())) {
            return true;
        }
        if (exc instanceof C21730) {
            C8863.m22892(this.f32965, (C21730) exc);
            dialogInterfaceC0206.m1447().setEnabled(false);
            return true;
        }
        if (!(exc instanceof C12141)) {
            this.f32969.m10223(exc, (DialogInterface.OnDismissListener) null);
            return true;
        }
        C21374.m48464(C4925.m14306(R.string.MT_Protector_res_0x7f12007e, ((C12141) exc).m29567()));
        return true;
    }
}
