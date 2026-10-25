package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: I1KV */
/* renamed from: l.ۛܳۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6117 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f18738;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f18739;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f18740;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f18741;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f18742;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f18743;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC7528 f18744;

    public C6117(ViewOnClickListenerC7528 viewOnClickListenerC7528, AbstractActivityC3346 abstractActivityC3346, String str, ArrayList arrayList, boolean z) {
        this.f18744 = viewOnClickListenerC7528;
        this.f18743 = abstractActivityC3346;
        this.f18742 = str;
        this.f18739 = arrayList;
        this.f18740 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f18743, R.string.MT_Protector_res_0x7f120528);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        ArrayList arrayList;
        C18090 c18090 = new C18090(this.f18742);
        try {
            ArrayList m42194 = c18090.m42194();
            Iterator it = m42194.iterator();
            while (it.hasNext()) {
                C3545 c3545 = (C3545) it.next();
                C16999.m39860(c3545.getName(), c3545.isDirectory());
            }
            Iterator it2 = m42194.iterator();
            while (true) {
                boolean hasNext = it2.hasNext();
                arrayList = this.f18739;
                if (!hasNext) {
                    break;
                }
                C3545 c35452 = (C3545) it2.next();
                if (!c35452.isDirectory() && c35452.getName().toLowerCase().endsWith(".smali")) {
                    arrayList.add(c35452);
                }
            }
            if (arrayList.size() == 1) {
                String m49848 = C22194.m49848(c18090.m42189((C3545) arrayList.get(0)), StandardCharsets.UTF_8);
                this.f18741 = m49848;
                String m7978 = AbstractC2489.m7978(m49848);
                if (m7978 == null) {
                    throw new C1637(this.f18744.getString(R.string.MT_Protector_res_0x7f1209ae));
                }
                this.f18738 = m7978.substring(1, m7978.length() - 1);
            }
            c18090.close();
        } catch (Throwable th) {
            try {
                c18090.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        ArrayList arrayList = this.f18739;
        boolean isEmpty = arrayList.isEmpty();
        String str = this.f18742;
        boolean z = this.f18740;
        if (isEmpty) {
            C21374.m48463(R.string.MT_Protector_res_0x7f120a82);
            if (z) {
                C16999.m39866(str, new String[0]).mo23552();
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewOnClickListenerC7528 viewOnClickListenerC7528 = this.f18744;
        if (size == 1) {
            viewOnClickListenerC7528.m20190(R.string.MT_Protector_res_0x7f1205e1, C14336.m34214(this.f18738), C14336.m34210(this.f18738), true, new InterfaceC19763() { // from class: l.ۤܳۢ
                @Override // l.InterfaceC19763
                /* renamed from: ֫ */
                public final Object mo6973(Object obj, Object obj2) {
                    return C6117.this.f18741;
                }
            });
            if (z) {
                C16999.m39866(str, new String[0]).mo23552();
                return;
            }
            return;
        }
        ViewOnClickListenerC7528.m20199(viewOnClickListenerC7528, str, arrayList, z);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f18743.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
