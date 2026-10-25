package l;

import android.content.DialogInterface;
import android.text.Spanned;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: OAHZ */
/* renamed from: l.֡ܳ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0482 extends AbstractViewOnClickListenerC5230 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f2083;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1188 f2084;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f2085;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f2086;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0482(C1188 c1188, Main main, ArrayList arrayList, C2450 c2450, ArrayList arrayList2, Main main2) {
        super(main, arrayList, false, false);
        this.f2084 = c1188;
        this.f2083 = c2450;
        this.f2086 = arrayList2;
        this.f2085 = main2;
    }

    @Override // l.AbstractViewOnClickListenerC5230
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo2119() {
        String m15030 = m15030();
        String m15032 = m15032();
        String m15033 = m15033();
        final C2450 c2450 = this.f2083;
        boolean mo13919 = c2450.m7922().mo6020().mo13919();
        ArrayList arrayList = this.f2086;
        C0352 c0352 = new C0352(arrayList.size(), mo13919);
        Iterator it = c2450.m7915().iterator();
        while (it.hasNext()) {
            c0352.m1796(((InterfaceC17889) it.next()).getName());
        }
        ArrayList m47633 = C20815.m47633(arrayList, m15030, m15032, m15033, m15035(), Collections.EMPTY_MAP);
        final ArrayList m47632 = C20815.m47632(m47633);
        C20815.m47634(c0352, m47632);
        final ArrayList arrayList2 = new ArrayList(m47633.size());
        Iterator it2 = m47633.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            C6703 c6703 = (C6703) it2.next();
            if (!c6703.m18264()) {
                z = true;
            }
            arrayList2.add(c6703.m18259());
        }
        Main main = this.f2085;
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00cc);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f12079c);
        ListView listView = (ListView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        C4915.m14284(listView);
        listView.setAdapter((ListAdapter) new C2072(R.layout.MT_Protector_res_0x7f0d01c5, main, arrayList2));
        C19258 buildDialog = main.buildDialog();
        buildDialog.m44421(m10216);
        if (m15030.equals("{P}{S}") && m15032().length() == 0) {
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        } else if (z) {
            m15028();
            ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f12079d);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        } else {
            m15028();
            buildDialog.m44442(R.string.MT_Protector_res_0x7f1205f9, new DialogInterface.OnClickListener() { // from class: l.ᩴܳ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0482.m2118(C0482.this, c2450, m47632);
                }
            });
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        }
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1205c2, (DialogInterface.OnClickListener) null);
        buildDialog.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩵ܳ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    sb.append(((Spanned) it3.next()).toString());
                    sb.append("\n");
                }
                C4925.m14314((CharSequence) sb.toString());
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2118(C0482 c0482, C2450 c2450, ArrayList arrayList) {
        c0482.m15026();
        c0482.m15034();
        C1188.m4008(c0482.f2084, c2450, arrayList);
    }
}
