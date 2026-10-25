package l;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: Y6Y9 */
/* renamed from: l.ۡ۫᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8889 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27044;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27045;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f27046;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f27047;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f27048;

    public /* synthetic */ RunnableC8889(View view, Object obj, Object obj2, Object obj3, int i) {
        this.f27047 = i;
        this.f27048 = view;
        this.f27046 = obj;
        this.f27045 = obj2;
        this.f27044 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27047) {
            case 0:
                C17294.m40594((TextInputLayout) this.f27048, (EditText) this.f27046, (AbstractActivityC3346) this.f27045, (DialogInterfaceC0206) this.f27044);
                break;
            default:
                C12392.m30141((C12392) this.f27048, (InterfaceC7785) this.f27046, (C4342) this.f27045, (RuntimeException) this.f27044);
                break;
        }
    }
}
