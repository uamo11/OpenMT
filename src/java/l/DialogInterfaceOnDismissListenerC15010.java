package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import bin.mt.plus.R;

/* compiled from: 657B */
/* renamed from: l.ܶۙ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class DialogInterfaceOnDismissListenerC15010 extends AbstractC3723 implements DialogInterface.OnDismissListener {

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static int[] f45772 = m35545();

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static int[] m35543() {
        return f45772;
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static void m35542() {
        f45772 = m35545();
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static int[] m35545() {
        int[] mo18254 = ApplicationC20075.f65008.mo18254("file_menu_sort");
        if (mo18254 != null && mo18254.length == 10) {
            boolean[] zArr = new boolean[10];
            for (int i : mo18254) {
                if (i >= 0 && i < 10 && !zArr[i]) {
                    zArr[i] = true;
                }
            }
            return mo18254;
        }
        return AbstractC16891.f51861;
    }

    public DialogInterfaceOnDismissListenerC15010(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC15010(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC15010(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC15010(Context context) {
        super(context);
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00ab);
        C13132 c13132 = (C13132) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        c13132.setAdapter(new C0900());
        c13132.setLayoutManager(new C21354((Context) abstractActivityC3346, 2));
        new C1556(new C5134()).m5322(c13132);
        c13132.getItemAnimator().m50782(200L);
        c13132.getItemAnimator().m50792(200L);
        c13132.getItemAnimator().m50789(200L);
        c13132.getItemAnimator().m50786(200L);
        Context m6886 = m6886();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(m6886);
        c19258.m44421(m10216);
        c19258.m44420(this);
        c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
        c19258.m44438();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ApplicationC20075.f65008.edit().mo25856("file_menu_sort", f45772).apply();
    }
}
