package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: 014Z */
/* renamed from: l.ۙᩴܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4837 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f15279;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3426 f15280;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f15281;

    public C4837(C3426 c3426, C20065 c20065, View view) {
        this.f15280 = c3426;
        this.f15279 = c20065;
        this.f15281 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC8365 interfaceC8365;
        long currentTimeMillis;
        long j2;
        InterfaceC13303 m10425;
        InterfaceC8365 interfaceC83652;
        InterfaceC8365 interfaceC83653;
        C3426 c3426 = this.f15280;
        interfaceC8365 = c3426.f10808;
        if (interfaceC8365 != null) {
            interfaceC83652 = c3426.f10808;
            if (!interfaceC83652.mo6556().isEmpty()) {
                interfaceC83653 = c3426.f10808;
                C3426.m10406(interfaceC83653 instanceof C13575).m27760((String) this.f15279.getItem(i));
                c3426.f10806 = true;
                currentTimeMillis = System.currentTimeMillis();
                j2 = c3426.f10812;
                if (currentTimeMillis - j2 > 300 && (m10425 = c3426.m10425()) != null) {
                    c3426.mo10423(m10425);
                }
                C3426.m10409(c3426, this.f15281);
            }
        }
        c3426.f10806 = false;
        currentTimeMillis = System.currentTimeMillis();
        j2 = c3426.f10812;
        if (currentTimeMillis - j2 > 300) {
            c3426.mo10423(m10425);
        }
        C3426.m10409(c3426, this.f15281);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C3426 c3426 = this.f15280;
        c3426.f10806 = false;
        C3426.m10409(c3426, this.f15281);
    }
}
