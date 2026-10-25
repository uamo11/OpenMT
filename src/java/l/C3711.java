package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: M74S */
/* renamed from: l.ۘۙۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3711 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11295(final AbstractActivityC3346 abstractActivityC3346, RunnableC19989 runnableC19989) {
        final C18528 c18528 = new C18528(ApplicationC20075.f65008);
        final C15704 c15704 = new C15704(abstractActivityC3346, c18528, abstractActivityC3346, runnableC19989);
        c15704.m6052(R.string.MT_Protector_res_0x7f1209f9);
        final C5062 m6055 = c15704.m6055();
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00fc);
        final RunnableC23466 runnableC23466 = new RunnableC23466(c18528, m6055, (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0276), abstractActivityC3346);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0275).setOnClickListener(new View.OnClickListener() { // from class: l.ۜۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5062 c5062 = C5062.this;
                String trim = c5062.m14611().toString().trim();
                C18528 c185282 = c18528;
                new C4417(abstractActivityC3346, trim, c185282.m43049(trim), c185282.m43048(trim), new C8650(c5062, trim, c185282, runnableC23466)).m31266(true);
            }
        });
        m6055.m14606();
        m6055.m14616();
        m6055.m14603(new RunnableC20645(c18528, runnableC23466));
        m6055.m14600(new C2300(runnableC23466));
        m6055.m14599(17);
        C10235 m14607 = m6055.m14607();
        m14607.m25924(6);
        m14607.m30477(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1209fe));
        m14607.setOnKeyListener(new View.OnKeyListener() { // from class: l.ۢۙۜ
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (i != 66 && i != 160) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    AbstractDialogInterfaceOnClickListenerC1828.this.onClick(view);
                }
                return true;
            }
        });
        m14607.m30512(2);
        c15704.m6053(m10216);
        c15704.m6060();
    }
}
