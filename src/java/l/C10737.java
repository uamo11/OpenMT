package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.util.AttributeSet;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: LAIU */
/* renamed from: l.ۧۗ᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10737 extends AbstractC3723 {

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C1564 f32351;

    public C10737(Context context) {
        super(context);
        m26924();
    }

    public C10737(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26924();
    }

    public C10737(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26924();
    }

    public C10737(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m26924();
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    private void m26924() {
        this.f32351 = new C1564(m6886());
        m26923();
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    private void m26923() {
        int i;
        i = this.f32351.f5520;
        if (i == 0) {
            m6930(R.string.MT_Protector_res_0x7f12045f);
        } else if (i == 1) {
            m6930(R.string.MT_Protector_res_0x7f12045e);
        } else {
            if (i != 2) {
                return;
            }
            m6930(R.string.MT_Protector_res_0x7f120460);
        }
    }

    @Override // l.AbstractC3723
    /* renamed from: ֫ */
    public final void mo6161(AbstractActivityC3346 abstractActivityC3346) {
        int i;
        int i2;
        i = this.f32351.f5520;
        final int[] iArr = {i};
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120512);
        i2 = this.f32351.f5520;
        buildDialog.m44417(R.array.MT_Protector_res_0x7f03001e, i2, new DialogInterface.OnClickListener() { // from class: l.᩺ۙ᩷
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                iArr[0] = i3;
            }
        });
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC10998(this, abstractActivityC3346, iArr, 1));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26922(C10737 c10737, int[] iArr) {
        int i;
        ComponentName componentName;
        ComponentName componentName2;
        ComponentName componentName3;
        ComponentName componentName4;
        ComponentName componentName5;
        ComponentName componentName6;
        ComponentName componentName7;
        ComponentName componentName8;
        ComponentName componentName9;
        c10737.f32351.f5520 = iArr[0];
        PackageManager m14320 = C4925.m14320();
        ArrayList arrayList = new ArrayList(3);
        i = c10737.f32351.f5520;
        if (i == 0) {
            componentName = c10737.f32351.f5517;
            arrayList.add(new C7250(componentName, 2, 1));
            componentName2 = c10737.f32351.f5519;
            arrayList.add(new C7250(componentName2, 2, 1));
            componentName3 = c10737.f32351.f5518;
            arrayList.add(new C7250(componentName3, 1, 0));
        } else if (i == 1) {
            componentName4 = c10737.f32351.f5518;
            arrayList.add(new C7250(componentName4, 2, 1));
            componentName5 = c10737.f32351.f5519;
            arrayList.add(new C7250(componentName5, 2, 1));
            componentName6 = c10737.f32351.f5517;
            arrayList.add(new C7250(componentName6, 1, 0));
        } else if (i == 2) {
            componentName7 = c10737.f32351.f5518;
            arrayList.add(new C7250(componentName7, 2, 1));
            componentName8 = c10737.f32351.f5517;
            arrayList.add(new C7250(componentName8, 2, 1));
            componentName9 = c10737.f32351.f5519;
            arrayList.add(new C7250(componentName9, 1, 0));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7250 c7250 = (C7250) it.next();
            m14320.setComponentEnabledSetting(c7250.f22247, c7250.f22249, c7250.f22248);
        }
        c10737.m26923();
    }
}
