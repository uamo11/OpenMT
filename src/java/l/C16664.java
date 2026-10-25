package l;

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: S5I2 */
/* renamed from: l.ܽ۬ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16664 extends AbstractDialogInterfaceOnClickListenerC1828 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17370 f51161;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4554 f51162;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4554 f51163;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4554 f51164;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f51165;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16664(AbstractC17370 abstractC17370, AbstractActivityC3346 abstractActivityC3346, String str, int i, C4554 c4554, C4554 c45542, C4554 c45543, AbstractActivityC3346 abstractActivityC33462) {
        super(i, abstractActivityC3346, str);
        this.f51161 = abstractC17370;
        this.f51162 = c4554;
        this.f51164 = c45542;
        this.f51163 = c45543;
        this.f51165 = abstractActivityC33462;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828
    /* renamed from: ܿ */
    public final void mo6058() {
        String str;
        String str2;
        int i;
        String m6057 = m6057();
        AbstractC17370 abstractC17370 = this.f51161;
        if (abstractC17370.mo21345(m6057)) {
            m6056();
            m6051();
            return;
        }
        if (m6057.isEmpty()) {
            abstractC17370.mo5651();
            m6051();
            return;
        }
        boolean isChecked = this.f51162.isChecked();
        C4554 c4554 = this.f51164;
        if (isChecked) {
            if (c4554.isChecked()) {
                str = m6057;
            } else {
                str = m6057;
                while (str.startsWith(".*") && str.length() > 2) {
                    str = str.substring(2);
                }
            }
            str2 = str;
            i = 0;
        } else {
            i = 16;
            str2 = m6057;
        }
        if (!this.f51163.isChecked()) {
            i |= 66;
        }
        try {
            C11459 m28259 = C11459.m28259(i, str2);
            m6056();
            m6051();
            abstractC17370.mo5652(new C18076(m28259, c4554.isChecked()), m6057);
        } catch (Exception e) {
            this.f51165.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828
    /* renamed from: ᩳ */
    public final void mo6059() {
        this.f51161.mo5651();
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC1828, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        ArrayList arrayList;
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        arrayList = this.f51161.f53182;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4554 c4554 = (C4554) it.next();
            if (c4554.getTag() != null) {
                edit.putBoolean((String) c4554.getTag(), c4554.isChecked());
            }
        }
        edit.apply();
    }
}
