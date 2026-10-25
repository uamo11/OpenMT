package l;

import android.content.DialogInterface;
import android.widget.EditText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: J6WT */
/* renamed from: l.᩻۬᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC23725 implements DialogInterface.OnClickListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76829;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Serializable f76830;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f76831;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f76832;

    public /* synthetic */ DialogInterfaceOnClickListenerC23725(Object obj, Serializable serializable, Object obj2, int i) {
        this.f76831 = i;
        this.f76832 = obj;
        this.f76830 = serializable;
        this.f76829 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f76831) {
            case 0:
                r7.m9991(new InterfaceC15257() { // from class: l.ܳ۬᩻
                    @Override // l.InterfaceC15257
                    public final C3856 run() {
                        C3264.this.f10244.m15192(r2);
                        return null;
                    }
                }, new RunnableC20760(3, (DialogInterfaceC0206) this.f76829));
                break;
            case 1:
                Runnable runnable = (Runnable) this.f76832;
                ArrayList arrayList = (ArrayList) this.f76830;
                EditText editText = (EditText) this.f76829;
                if (runnable != null && i == arrayList.size()) {
                    runnable.run();
                    break;
                } else {
                    editText.setText(((AbstractC15440) arrayList.get(i)).mo23554());
                    editText.setSelection(editText.length());
                    break;
                }
                break;
            default:
                C0684 c0684 = (C0684) this.f76832;
                final AbstractC15440 abstractC15440 = (AbstractC15440) this.f76830;
                C19736 c19736 = (C19736) this.f76829;
                ArrayList arrayList2 = c0684.f37525;
                C3318 c3318 = c0684.f37526;
                try {
                    C1802.f6208.submit(new Callable() { // from class: l.ۖ᩸ܳ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(AbstractC15440.this.mo23552());
                        }
                    }).get(100L, TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
                int bindingAdapterPosition = c19736.getBindingAdapterPosition();
                arrayList2.remove((bindingAdapterPosition - c3318.m10143(c0684)) - 1);
                if (arrayList2.size() <= 0) {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition - 1, 2);
                    break;
                } else {
                    c3318.notifyItemRangeRemoved(bindingAdapterPosition, 1);
                    break;
                }
        }
    }
}
