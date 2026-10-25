package l;

import android.content.DialogInterface;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: I1KV */
/* renamed from: l.ۨܳۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11762 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35104;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f35105;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f35106;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f35107;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f35108 = new ArrayList();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35109;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35110;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f35111;

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
    }

    public C11762(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, Spinner spinner, String str, ArrayList arrayList, String str2, boolean z) {
        this.f35111 = viewOnClickListenerC7528;
        this.f35105 = abstractActivityC3346;
        this.f35107 = spinner;
        this.f35104 = str;
        this.f35106 = arrayList;
        this.f35109 = str2;
        this.f35110 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f35105, R.string.MT_Protector_res_0x7f1207a7);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C12366 c12366;
        C12366 c123662;
        C12366 c123663;
        C12366 c123664;
        String sb;
        C12366 c123665;
        C12366 c123666;
        C12366 c123667;
        C12366 c123668;
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f35111;
        C20608 c20608 = new C20608((AbstractActivityC3346) viewOnClickListenerC7528.requireActivity());
        c12366 = viewOnClickListenerC7528.f23168;
        String str = (String) c12366.m30067().get(Math.max(0, this.f35107.getSelectedItemPosition()));
        try {
            C18090 m42168 = C18090.m42168(C16999.m39866(this.f35104, new String[0]), (byte[]) null);
            try {
                c123663 = viewOnClickListenerC7528.f23168;
                c123663.m30042(false);
                Iterator it = this.f35106.iterator();
                while (it.hasNext()) {
                    C3545 c3545 = (C3545) it.next();
                    String substring = C16999.m39860(c3545.getName(), false).substring(0, r8.length() - 6);
                    this.f23322.m31861(viewOnClickListenerC7528.getString(R.string.MT_Protector_res_0x7f12048a, substring));
                    String str2 = this.f35109 + substring;
                    String m49848 = C22194.m49848(m42168.m42189(c3545), StandardCharsets.UTF_8);
                    c123664 = viewOnClickListenerC7528.f23168;
                    boolean m30058 = c123664.m30058(str2);
                    ArrayList arrayList = this.f35108;
                    if (m30058) {
                        if (c20608.mo13496()) {
                            c20608.m47156(str2);
                            if (c20608.mo1526()) {
                                break;
                            }
                        }
                        int mo13493 = c20608.mo13493();
                        if (mo13493 == 0) {
                            c123667 = viewOnClickListenerC7528.f23168;
                            c123667.m30027(str2, m49848);
                            arrayList.add(str2);
                        } else if (mo13493 == 2) {
                            int i = 1;
                            do {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str2);
                                i++;
                                sb2.append(i);
                                sb = sb2.toString();
                                c123665 = viewOnClickListenerC7528.f23168;
                            } while (c123665.m30058(sb));
                            c123666 = viewOnClickListenerC7528.f23168;
                            c123666.m30028(str, sb, m49848);
                            arrayList.add(sb);
                        }
                    } else {
                        c123668 = viewOnClickListenerC7528.f23168;
                        c123668.m30028(str, str2, m49848);
                        arrayList.add(str2);
                    }
                }
                m42168.close();
            } finally {
            }
        } finally {
            c123662 = viewOnClickListenerC7528.f23168;
            c123662.m30042(true);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f35105.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C13876 c13876;
        ArrayList arrayList = this.f35108;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f35111;
            viewOnClickListenerC7528.m20215();
            c13876 = viewOnClickListenerC7528.f23169;
            c13876.m33254((Collection) arrayList);
        }
        this.f23322.m31857();
        if (this.f35110) {
            C16999.m39866(this.f35104, new String[0]).mo23552();
        }
    }
}
