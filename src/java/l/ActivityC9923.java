package l;

import android.os.Bundle;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 89CO */
/* renamed from: l.ۢ᩻ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC9923 extends AbstractActivityC3346 {

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f29996 = 0;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f29997 = new ArrayList();

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C1556 f29998;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "FloatingMenuEditActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d004d);
        m10241(R.string.MT_Protector_res_0x7f1203f0);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC10893(1, this));
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector_res_0x7f0a0486);
        final C10356 c10356 = new C10356(this);
        c13132.setAdapter(c10356);
        C13265.m32222().m1668(this, new InterfaceC1008() { // from class: l.ۗܳܿ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                ActivityC9923.m25032(ActivityC9923.this, c10356);
            }
        });
        C1556 c1556 = new C1556(new C12472(this));
        this.f29998 = c1556;
        c1556.m5322(c13132);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25032(ActivityC9923 activityC9923, C10356 c10356) {
        C14714.m35013();
        boolean m35011 = C14714.m35011();
        ArrayList arrayList = activityC9923.f29997;
        arrayList.clear();
        arrayList.add(new C17683(0));
        arrayList.add(new C6122(0, R.string.MT_Protector_res_0x7f1203f3));
        for (AbstractC2867 abstractC2867 : C4711.m13808()) {
            if (abstractC2867 == C19095.f60135) {
                arrayList.add(new C6122(1, R.string.MT_Protector_res_0x7f1203f5));
            } else if (abstractC2867 == C9217.f27906) {
                arrayList.add(new C6122(2, R.string.MT_Protector_res_0x7f1203f4));
            } else if (m35011 || !abstractC2867.mo8778().equals("builtin:systemTranslate")) {
                if (!(abstractC2867 instanceof C4278) || ((C4278) abstractC2867).m12864()) {
                    arrayList.add(new C7533(activityC9923, abstractC2867));
                }
            }
        }
        c10356.notifyDataSetChanged();
    }
}
