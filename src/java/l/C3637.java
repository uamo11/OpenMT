package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: B9R5 */
/* renamed from: l.ۘ֫ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3637 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0814 f11489;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f11490;

    public C3637(ActivityC0814 activityC0814, boolean z) {
        this.f11489 = activityC0814;
        this.f11490 = z;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f11489, R.string.MT_Protector_res_0x7f1208d2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440;
        HashMap hashMap;
        C4554 c4554;
        AbstractC15440 abstractC154402;
        HashMap hashMap2;
        C20317 c20317;
        C10130 c10130 = new C10130();
        abstractC15440 = ActivityC0814.f2970;
        C9028 m23276 = C9028.m23276(new C23326(abstractC15440.m36526("arsc")), EnumC9734.ERROR);
        ActivityC0814 activityC0814 = this.f11489;
        hashMap = activityC0814.f2973;
        for (C7870 c7870 : hashMap.values()) {
            c7870.m21152();
            if (c7870.m21156()) {
                C13309 c13309 = new C13309();
                Iterator it = m23276.mo21936().iterator();
                while (it.hasNext()) {
                    for (C20317 c203172 : ((C8322) it.next()).mo12850()) {
                        String typeName = c203172.getTypeName();
                        if (typeName.equals("string") || typeName.equals("array") || typeName.equals("plurals")) {
                            for (C2678 c2678 : c203172.mo2872()) {
                                if (c2678.mo18743().m49025().equals(c7870.m21157())) {
                                    for (C18906 c18906 : c2678.mo18746()) {
                                        c13309.m32289(c18906.mo47884(), c18906);
                                    }
                                }
                            }
                        }
                    }
                }
                Iterator<E> it2 = c7870.iterator();
                while (it2.hasNext()) {
                    C14925 c14925 = (C14925) it2.next();
                    C18906 c189062 = (C18906) c13309.m32284(c14925.f45501, (Integer) null);
                    C11003.requireNonNull(c189062);
                    C4794 value = c189062.getValue(c14925.f45504);
                    String str = c14925.f45505;
                    if (str != null) {
                        C21982 m49462 = C21982.m49462(str);
                        value.m13996(m49462.m49464(), m49462.m49463());
                    } else if (!value.mo5008().getValue().equals(c14925.f45502)) {
                        C21982 m494622 = C21982.m49462(c14925.f45502);
                        value.m13996(m494622.m49464(), m494622.m49463());
                    }
                }
            }
        }
        c4554 = activityC0814.f2976;
        if (!c4554.isChecked()) {
            m23276.m23284();
        } else {
            hashMap2 = activityC0814.f2973;
            Collection<C7870> values = hashMap2.values();
            C8322 m23286 = m23276.m23286();
            if (m23286 == null) {
                for (int i = 23; i < 38; i++) {
                    try {
                        m23286 = m23276.m23281(i, "bin.mt.plus.TranslationData");
                    } catch (RuntimeException unused) {
                    }
                }
                throw new RuntimeException("This should not happen");
            }
            C20317 c203173 = null;
            C20317 c203174 = null;
            for (C20317 c203175 : m23286.mo12850()) {
                if (c203175.getTypeName().equals(am.av)) {
                    c203173 = c203175;
                } else if (c203175.getTypeName().equals("b")) {
                    c203174 = c203175;
                }
            }
            if (c203173 != null) {
                m23286.m21918(c203173.mo2870());
            }
            if (c203174 != null) {
                m23286.m21918(c203174.mo2870());
            }
            Iterator it3 = m23286.mo12850().iterator();
            while (true) {
                if (it3.hasNext()) {
                    c20317 = (C20317) it3.next();
                    if (c20317.getTypeName().equals(am.aF)) {
                        break;
                    }
                } else {
                    c20317 = null;
                    break;
                }
            }
            if (c20317 == null) {
                c20317 = m23286.m21929();
            }
            c20317.m46620();
            boolean z = false;
            boolean z2 = false;
            for (C7870 c78702 : values) {
                ArrayList arrayList = new ArrayList();
                Iterator<E> it4 = c78702.iterator();
                while (it4.hasNext()) {
                    C14925 c149252 = (C14925) it4.next();
                    if (c149252.f45505 != null) {
                        arrayList.add(c149252);
                    }
                }
                if (!arrayList.isEmpty()) {
                    c20317.m46624(arrayList.size());
                    try {
                        C2678 m46617 = c20317.m46617(c78702.m21157());
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            C14925 c149253 = (C14925) arrayList.get(i2);
                            c20317.m46611(i2, "_", z);
                            C18906 m8392 = m46617.m8392(i2);
                            m8392.m43647(true);
                            m8392.m43638(c149253.f45501);
                            C21982 m494623 = C21982.m49462(c149253.f45502);
                            C21982 m494624 = C21982.m49462(c149253.f45505);
                            m8392.m43640(m494623.m49464(), m494623.m49463(), -1).m13997(c149253.f45504);
                            m8392.m43640(m494624.m49464(), m494624.m49463(), -1).m13997(c149253.f45504);
                            i2++;
                            z = false;
                        }
                        z2 = true;
                    } catch (Exception e) {
                        throw new IOException(e);
                    }
                }
                z = false;
            }
            if (!z2) {
                m23276.m23284();
            }
        }
        m23276.m23285();
        m23276.m23283(c10130, (C19277) null);
        abstractC154402 = activityC0814.f2972;
        abstractC154402.getClass();
        abstractC154402.m36497(new C16146(0, c10130));
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        String m3064;
        boolean z = this.f11490;
        ActivityC0814 activityC0814 = this.f11489;
        if (z) {
            activityC0814.finish();
            return;
        }
        m3064 = activityC0814.m3064();
        activityC0814.f2979 = m3064;
        activityC0814.f2977 = false;
        C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f11489.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
