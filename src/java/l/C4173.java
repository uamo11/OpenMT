package l;

import android.content.DialogInterface;
import android.widget.ListView;
import bin.mt.plus.R;
import java.util.Collection;

/* compiled from: 34R9 */
/* renamed from: l.ۘ᩶ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4173 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f13605;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13606;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13607;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9170 f13608;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f13609;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC18990 f13610;

    public C4173(AbstractC18990 abstractC18990, ActivityC21107 activityC21107, String str, String str2, int i) {
        this.f13610 = abstractC18990;
        this.f13605 = activityC21107;
        this.f13609 = str;
        this.f13606 = str2;
        this.f13607 = i;
        this.f13608 = C9170.m23579(activityC21107);
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f13605, R.string.MT_Protector_res_0x7f12090c);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C18284 c18284;
        C18284 c182842;
        Collection<C11258> values;
        C0644 c0644;
        C0644 c06442;
        C18284 c182843;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        ListView listView;
        C23285 c23285 = (C23285) this.f13610;
        ActivityC21107 activityC21107 = c23285.f74764;
        c18284 = activityC21107.f68093;
        if (!c18284.f56846.isEmpty()) {
            c182847 = activityC21107.f68093;
            C0644 c06443 = (C0644) c182847.f56846.peek();
            listView = activityC21107.f68089;
            c06443.f2493 = listView.getFirstVisiblePosition();
        }
        if (c23285.f74765) {
            c182846 = activityC21107.f68093;
            values = ((C0644) c182846.f56846.peek()).f2492;
        } else {
            c182842 = activityC21107.f68093;
            values = c182842.f56832.values();
        }
        String str = this.f13609;
        String str2 = this.f13606;
        int i = this.f13607;
        if (i == 0) {
            c0644 = new C0644();
            c0644.f2494 = C16014.m37867(str, str2);
            for (C11258 c11258 : values) {
                C7540 m27863 = c11258.m27863();
                if (m27863 != null) {
                    for (C13889 c13889 : m27863.m20249()) {
                        if ((str.length() <= 0 || c13889.f41402.f70681.m28273().equals(str)) && (str2.length() <= 0 || c13889.f41402.f70680.m31312().equals(str2))) {
                            c0644.f2492.add(c11258);
                            break;
                        }
                    }
                    for (C13889 c138892 : m27863.m20254()) {
                        if ((str.length() <= 0 || c138892.f41402.f70681.m28273().equals(str)) && (str2.length() <= 0 || c138892.f41402.f70680.m31312().equals(str2))) {
                            c0644.f2492.add(c11258);
                            break;
                        }
                    }
                }
            }
        } else {
            if (i != 1) {
                c06442 = null;
                c182843 = activityC21107.f68093;
                c182843.f56846.push(c06442);
                c182844 = activityC21107.f68093;
                c182845 = activityC21107.f68093;
                c182844.f56833 = c182845.m42621();
            }
            c0644 = new C0644();
            c0644.f2494 = C16014.m37867(str, str2);
            for (C11258 c112582 : values) {
                C7540 m278632 = c112582.m27863();
                if (m278632 != null) {
                    for (C23062 c23062 : m278632.m20250()) {
                        if ((str.length() <= 0 || c23062.f74187.f57398.m28273().equals(str)) && (str2.length() <= 0 || c23062.f74187.f57397.m50835().equals(str2))) {
                            c0644.f2492.add(c112582);
                            break;
                        }
                    }
                    for (C23062 c230622 : m278632.m20251()) {
                        if ((str.length() <= 0 || c230622.f74187.f57398.m28273().equals(str)) && (str2.length() <= 0 || c230622.f74187.f57397.m50835().equals(str2))) {
                            c0644.f2492.add(c112582);
                            break;
                        }
                    }
                }
            }
        }
        c06442 = c0644;
        c182843 = activityC21107.f68093;
        c182843.f56846.push(c06442);
        c182844 = activityC21107.f68093;
        c182845 = activityC21107.f68093;
        c182844.f56833 = c182845.m42621();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C18284 c18284;
        if (this.f13608.m23581()) {
            ActivityC21107 activityC21107 = ((C23285) this.f13610).f74764;
            c18284 = activityC21107.f68093;
            activityC21107.setTitle(((C0644) c18284.f56846.peek()).f2494);
            activityC21107.m48049(EnumC6995.SEARCH_RESULT_CLASS);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f13608.m23581()) {
            this.f13605.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
