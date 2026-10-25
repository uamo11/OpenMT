package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 56B1 */
/* renamed from: l.ۚۧᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class DialogInterfaceOnDismissListenerC5317 implements DialogInterface.OnDismissListener {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16590;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C10856 f16591;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f16592;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Spinner f16594;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC12266 f16596;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f16597;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f16593 = new ArrayList();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f16589 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f16595 = true;

    public DialogInterfaceOnDismissListenerC5317(AbstractActivityC12266 abstractActivityC12266) {
        this.f16596 = abstractActivityC12266;
        View m10216 = abstractActivityC12266.m10216(R.layout.MT_Protector_res_0x7f0d0089);
        this.f16594 = (Spinner) m10216.findViewById(R.id.spinner1);
        this.f16592 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
        this.f16591 = (C10856) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05a2);
        new C2495(this, abstractActivityC12266, m10216).m20274();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m15253() {
        String string = ApplicationC20075.f65008.getString("auto_translation_record", null);
        Spinner spinner = this.f16594;
        if (string != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f16593;
                if (i >= arrayList.size()) {
                    break;
                }
                if (string.equals(m15247((AbstractC1083) arrayList.get(i)))) {
                    spinner.setSelection(i);
                    return;
                }
                i++;
            }
        }
        spinner.setSelection(0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m15247(AbstractC1083 abstractC1083) {
        if (abstractC1083 instanceof C6728) {
            C6728 c6728 = (C6728) abstractC1083;
            return C19462.m44858("@|", c6728.m18325(), "|", c6728.m18324().getClass().getName());
        }
        if (abstractC1083 instanceof C10962) {
            return C20094.m46315("#|", ((C10962) abstractC1083).m27274().m45696());
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15259() {
        if (this.f16590) {
            new C3906(this).m20274();
        } else {
            m15252();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m15252() {
        if (!C23196.m51460()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120757);
            return;
        }
        ArrayList arrayList = this.f16593;
        boolean isEmpty = arrayList.isEmpty();
        AbstractActivityC12266 abstractActivityC12266 = this.f16596;
        if (isEmpty) {
            C21374.m48457(R.string.MT_Protector_res_0x7f120a94);
            abstractActivityC12266.startActivity(new Intent(abstractActivityC12266, (Class<?>) ActivityC23143.class));
            return;
        }
        this.f16597.m1449();
        if (this.f16595) {
            this.f16595 = false;
            this.f16597.m1447().setOnClickListener(new ViewOnClickListenerC6289(1, this));
            this.f16597.m1448().setOnClickListener(new ViewOnClickListenerC17806(2, this));
            return;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (arrayList.get(size) instanceof C10962) {
                arrayList.remove(size);
            }
        }
        Iterator it = C1789.m5956().iterator();
        while (it.hasNext()) {
            arrayList.add(new C10962(abstractActivityC12266, (C19866) it.next()));
        }
        ((BaseAdapter) this.f16594.getAdapter()).notifyDataSetChanged();
        m15253();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m15248(DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317) {
        AbstractC1083 abstractC1083 = (AbstractC1083) dialogInterfaceOnDismissListenerC5317.f16593.get(dialogInterfaceOnDismissListenerC5317.f16594.getSelectedItemPosition());
        if (abstractC1083.mo3741()) {
            dialogInterfaceOnDismissListenerC5317.f16597.dismiss();
            new C18723(dialogInterfaceOnDismissListenerC5317, abstractC1083, dialogInterfaceOnDismissListenerC5317.f16596.m29793()).m20274();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15241(DialogInterfaceOnDismissListenerC5317 dialogInterfaceOnDismissListenerC5317) {
        AbstractActivityC12266 abstractActivityC12266 = dialogInterfaceOnDismissListenerC5317.f16596;
        abstractActivityC12266.startActivity(new Intent(abstractActivityC12266, (Class<?>) ActivityC23143.class));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15257() {
        Iterator it = this.f16593.iterator();
        while (it.hasNext()) {
            ((AbstractC1083) it.next()).mo3745();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15258() {
        int i = this.f16589;
        if (i == -1 || i == C13265.m32218()) {
            return;
        }
        new C19429(this).m20274();
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C6728.m18321();
    }
}
