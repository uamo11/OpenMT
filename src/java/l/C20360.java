package l;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: 014Z */
/* renamed from: l.᩶ᩴܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20360 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f65729;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3426 f65730;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20065 f65731;

    public C20360(C3426 c3426, C20065 c20065, View view) {
        this.f65730 = c3426;
        this.f65731 = c20065;
        this.f65729 = view;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC8365 interfaceC8365;
        long currentTimeMillis;
        long j2;
        InterfaceC13303 m10425;
        InterfaceC8365 interfaceC83652;
        InterfaceC8365 interfaceC83653;
        InterfaceC8365 interfaceC83654;
        String str;
        C3426 c3426 = this.f65730;
        interfaceC8365 = c3426.f10808;
        boolean z = false;
        if (interfaceC8365 != null) {
            interfaceC83652 = c3426.f10808;
            if (!interfaceC83652.mo6558().isEmpty()) {
                interfaceC83653 = c3426.f10808;
                boolean z2 = interfaceC83653 instanceof C13575;
                C11188 m10406 = C3426.m10406(z2);
                m10406.m27758((String) this.f65731.getItem(i));
                if (!z2) {
                    str = c3426.f10805;
                    if (!str.equals(m10406.m27757())) {
                        z = true;
                    }
                }
                c3426.f10811 = z;
                interfaceC83654 = c3426.f10808;
                if (interfaceC83654.mo6555()) {
                    c3426.m10407(i, m10406);
                }
                currentTimeMillis = System.currentTimeMillis();
                j2 = c3426.f10812;
                if (currentTimeMillis - j2 > 300 && (m10425 = c3426.m10425()) != null) {
                    c3426.mo10423(m10425);
                }
                C3426.m10409(c3426, this.f65729);
            }
        }
        c3426.f10811 = false;
        currentTimeMillis = System.currentTimeMillis();
        j2 = c3426.f10812;
        if (currentTimeMillis - j2 > 300) {
            c3426.mo10423(m10425);
        }
        C3426.m10409(c3426, this.f65729);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        C3426 c3426 = this.f65730;
        c3426.f10811 = false;
        C3426.m10409(c3426, this.f65729);
    }
}
