package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 698T */
/* renamed from: l.۟֡ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7119 extends AbstractC1661 {
    public C7119() {
        super(R.string.MT_Protector_res_0x7f1205bb, R.drawable.MT_Protector_res_0x7f0801e2);
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        if (c2450.m7918() == 2) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = c2450.m7909().iterator();
            while (it.hasNext()) {
                arrayList.add(new C10211((InterfaceC17889) it.next()));
            }
            c2450.m7922().mo6005(c2450.m7921(), arrayList, new RunnableC14343(this, arrayList, c2450, 1));
            return;
        }
        final C16560 m7919 = c2450.m7919();
        c2450.m7922().m39738(c2450.m7921(), c2450.m7913(), new InterfaceC7305() { // from class: l.ۛ֡ܳ
            @Override // l.InterfaceC7305
            /* renamed from: ֫ */
            public final void mo10987(C10211 c10211) {
                c10211.m25619();
                C16560 c16560 = m7919;
                c16560.m39044().m39738(c16560, c16560.m39025(), new C22641(C7119.this, c10211, c2450, c16560));
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19134(C7119 c7119, ArrayList arrayList, C2450 c2450) {
        ((C10211) arrayList.get(0)).m25619();
        ((C10211) arrayList.get(1)).m25619();
        AbstractC15440 m25622 = ((C10211) arrayList.get(0)).m25622();
        AbstractC15440 m256222 = ((C10211) arrayList.get(1)).m25622();
        C7309 c7309 = new C7309(m25622, m256222, m25622.mo23554(), m256222.mo23554(), c2450.m7922(), c2450.m7922());
        C16560 m7921 = c2450.m7921();
        c7309.m19593();
        c7119.m19136(m7921, c7309);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19135(C7119 c7119, C10211 c10211, C2450 c2450, C16560 c16560, C10211 c102112) {
        String name;
        String name2;
        c102112.m25619();
        AbstractC15440 m25622 = c10211.m25622();
        AbstractC15440 m256222 = c102112.m25622();
        boolean m39064 = c2450.m7921().m39064();
        if (m25622.getName().equals(m256222.getName())) {
            int i = R.string.MT_Protector_res_0x7f1201c0;
            name = C4925.m14306(m39064 ? R.string.MT_Protector_res_0x7f1201bf : R.string.MT_Protector_res_0x7f1201c0, m25622.getName());
            if (!m39064) {
                i = R.string.MT_Protector_res_0x7f1201bf;
            }
            name2 = C4925.m14306(i, m256222.getName());
        } else {
            name = m25622.getName();
            name2 = m256222.getName();
        }
        C7309 c7309 = new C7309(c10211.m25622(), c102112.m25622(), name, name2, c2450.m7922(), c16560.m39044());
        if (!m39064) {
            c7309.m19594();
        }
        c7119.m19136(c2450.m7921(), c7309);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19136(final C16560 c16560, final C7309 c7309) {
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d00a9);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(m5610());
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
        Main m39056 = c16560.m39056();
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(m39056);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۨ֡ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C7309 c73092 = c7309;
                c73092.m19592();
                AbstractC15440 abstractC15440 = c73092.f22436;
                AbstractC15440 abstractC154402 = c73092.f22437;
                C7119 c7119 = C7119.this;
                AbstractC15440 m51761 = C23346.m51761(c16560, c7119.m5610(), "txt");
                int i3 = C15104.f46193;
                C0994 c0994 = new C0994(C13468.class);
                c0994.m3474("saveAsPath", m51761.mo23554());
                c0994.m3474("inputPath1", abstractC15440.mo23554());
                c0994.m3474("inputPath2", abstractC154402.mo23554());
                c0994.m3474("title", C4925.m14327(c7119.m5610()));
                c0994.m3469();
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector_res_0x7f12030f, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC11582(c7309, editText, editText2, 1));
    }
}
