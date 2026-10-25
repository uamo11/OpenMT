package l;

/* compiled from: K14B */
/* renamed from: l.֫᩻ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2156 implements Runnable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7137;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7138;

    public /* synthetic */ RunnableC2156(int i, Object obj) {
        this.f7137 = i;
        this.f7138 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C17595 c17595;
        switch (this.f7137) {
            case 0:
                ((C16266) this.f7138).m34227(new C14855(0));
                break;
            default:
                ViewOnClickListenerC5892 viewOnClickListenerC5892 = (ViewOnClickListenerC5892) this.f7138;
                C14772 c14772 = viewOnClickListenerC5892.f18089;
                c17595 = c14772.f45115;
                c17595.notifyItemChanged(viewOnClickListenerC5892.getAdapterPosition());
                c14772.m35140();
                break;
        }
    }
}
