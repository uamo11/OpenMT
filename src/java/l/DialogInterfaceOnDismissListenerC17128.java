package l;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: T12U */
/* renamed from: l.ܿۙ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class DialogInterfaceOnDismissListenerC17128 extends AbstractC3723 implements DialogInterface.OnDismissListener {

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static int[] f52477 = m40154();

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static int[] m40152() {
        return f52477;
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static void m40151() {
        f52477 = m40154();
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static int[] m40154() {
        List list = C9260.f28058;
        int[] mo18254 = ApplicationC20075.f65008.mo18254("built_in_method_sort");
        int i = 0;
        if (mo18254 == null || mo18254.length > list.size()) {
            int[] iArr = new int[list.size()];
            while (i < list.size()) {
                iArr[i] = ((C9260) list.get(i)).f28061;
                i++;
            }
            return iArr;
        }
        if (mo18254.length < list.size()) {
            C15859 c15859 = new C15859(list.size());
            C15859 c158592 = new C15859(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c158592.add(((C9260) it.next()).f28061);
            }
            int length = mo18254.length;
            while (i < length) {
                int i2 = mo18254[i];
                if (c158592.mo3585(i2)) {
                    c15859.add(i2);
                }
                i++;
            }
            c15859.mo26283((InterfaceC1022) c158592);
            return c15859.mo3586();
        }
        C18683 c18683 = new C18683(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c18683.add(((C9260) it2.next()).f28061);
        }
        boolean z = true;
        for (int i3 : mo18254) {
            if (!c18683.remove(i3)) {
                z = false;
            }
        }
        if (z) {
            z = c18683.isEmpty();
        }
        if (!z) {
            while (i < list.size()) {
                mo18254[i] = ((C9260) list.get(i)).f28061;
                i++;
            }
        }
        return mo18254;
    }

    public DialogInterfaceOnDismissListenerC17128(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DialogInterfaceOnDismissListenerC17128(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DialogInterfaceOnDismissListenerC17128(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DialogInterfaceOnDismissListenerC17128(Context context) {
        super(context);
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00ab);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120150);
        C13132 c13132 = (C13132) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0486);
        c13132.setAdapter(new C16422());
        c13132.setLayoutManager(new C21354((Context) abstractActivityC3346, 3));
        new C1556(new C10779()).m5322(c13132);
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
        ApplicationC20075.f65008.edit().mo25856("built_in_method_sort", f52477).apply();
    }
}
