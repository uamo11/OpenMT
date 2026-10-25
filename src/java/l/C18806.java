package l;

import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: I1KV */
/* renamed from: l.ᩴܰ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18806 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f59348;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f59351;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f59352;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f59350 = new ArrayList();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f59349 = 0;

    public C18806(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f59352 = viewOnClickListenerC21628;
        this.f59348 = abstractActivityC3346;
        this.f59351 = str;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f59348);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C19452 c19452;
        C19452 c194522;
        C19452 c194523;
        C19452 c194524;
        C19452 c194525;
        ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f59352;
        C20608 c20608 = new C20608(this.f59348);
        c20608.m47157();
        try {
            C18090 c18090 = new C18090(this.f59351);
            try {
                c194522 = viewOnClickListenerC21628.f69432;
                c194522.m44830(false);
                ArrayList m42194 = c18090.m42194();
                Iterator it = m42194.iterator();
                while (it.hasNext()) {
                    C3545 c3545 = (C3545) it.next();
                    C16999.m39860(c3545.getName(), c3545.isDirectory());
                }
                Iterator it2 = m42194.iterator();
                while (it2.hasNext()) {
                    C3545 c35452 = (C3545) it2.next();
                    if (!c35452.isDirectory() && c35452.getName().toLowerCase().endsWith(".xml")) {
                        this.f59349++;
                        String substring = C16999.m39860(c35452.getName(), false).substring(0, r7.length() - 4);
                        this.f23322.m31861(viewOnClickListenerC21628.getString(R.string.MT_Protector_res_0x7f12048a, substring));
                        String m49848 = C22194.m49848(c18090.m42189(c35452), StandardCharsets.UTF_8);
                        try {
                            C20631.m47203(m49848);
                            c194523 = viewOnClickListenerC21628.f69432;
                            boolean m44838 = c194523.m44838(substring);
                            ArrayList arrayList = this.f59350;
                            if (m44838) {
                                if (c20608.mo13496()) {
                                    c20608.m47156(substring);
                                    if (c20608.mo1526()) {
                                        break;
                                    }
                                }
                                int mo13493 = c20608.mo13493();
                                if (mo13493 == 0) {
                                    c194524 = viewOnClickListenerC21628.f69432;
                                    c194524.m44851(substring, m49848);
                                    arrayList.add(substring);
                                } else if (mo13493 == 2) {
                                    throw new RuntimeException();
                                }
                            } else {
                                c194525 = viewOnClickListenerC21628.f69432;
                                c194525.m44819(substring, m49848);
                                arrayList.add(substring);
                            }
                        } catch (Exception e) {
                            throw new Exception("Parse xml failed: " + c35452.getName(), e);
                        }
                    }
                }
                c18090.close();
            } finally {
            }
        } finally {
            c19452 = viewOnClickListenerC21628.f69432;
            c19452.m44830(true);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f59349 == 0) {
            C21374.m48463(R.string.MT_Protector_res_0x7f120a83);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3764 c3764;
        c3764 = this.f59352.f69427;
        c3764.m11384((Throwable) exc);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C13876 c13876;
        ArrayList arrayList = this.f59350;
        if (!arrayList.isEmpty()) {
            ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f59352;
            viewOnClickListenerC21628.m48890();
            c13876 = viewOnClickListenerC21628.f69433;
            c13876.m33254((Collection) arrayList);
        }
        m20273();
    }
}
