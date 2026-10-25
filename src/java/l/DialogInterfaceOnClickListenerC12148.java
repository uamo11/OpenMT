package l;

import android.content.DialogInterface;
import java.util.List;

/* compiled from: V6YU */
/* renamed from: l.۫ۗ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC12148 implements DialogInterface.OnClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36251;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36252;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36253;

    public /* synthetic */ DialogInterfaceOnClickListenerC12148(int i, Object obj, Object obj2) {
        this.f36252 = i;
        this.f36253 = obj;
        this.f36251 = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f36252) {
            case 0:
                C10032.m25206((C10032) this.f36253, (boolean[]) this.f36251);
                break;
            default:
                C4779.m13951((C4779) this.f36253, (List) this.f36251);
                break;
        }
    }
}
