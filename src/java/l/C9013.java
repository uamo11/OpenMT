package l;

import bin.mt.plus.Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: I7BK */
/* renamed from: l.ۡܽ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C9013 extends C9193 {

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f27371;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private synchronized void m23257(C17222 c17222) {
        try {
            if (this.f27371) {
                return;
            }
            this.f27371 = true;
            String m11556 = m11556("remoteTaskId");
            C8381 m21977 = C8381.m21977();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C18965.m43782(m11556("sourcePath")));
            linkedHashSet.add(C18965.m43782(m11556("targetPath")));
            ArrayList arrayList = new ArrayList(linkedHashSet);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it = m23256().iterator();
            while (it.hasNext()) {
                linkedHashSet2.add(C18965.m43782((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList(linkedHashSet2);
            List list = Collections.EMPTY_LIST;
            m21977.m21984(m11556, this, c17222, arrayList, arrayList2, list, c17222.m40526() ? m23256() : list);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l.C9193, l.AbstractC3817
    /* renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c165602, C17222 c17222) {
    }

    @Override // l.AbstractC3817
    /* renamed from: ܺ */
    public final AbstractActivityC3346 mo11549() {
        return null;
    }

    @Override // l.C9193, l.AbstractC3817
    /* renamed from: ᩷ */
    public final void mo2782() {
        String m11556 = m11556("remoteTaskId");
        C8381 m21977 = C8381.m21977();
        C18891 c18891 = new C18891(m11556, m21977, m11535("replacedName") != null);
        this.f27856 = c18891;
        m21977.m21985(m11556, this, c18891);
        super.mo2782();
        m21977.m21983(m11556, this);
    }

    @Override // l.C9193, l.AbstractC3817
    /* renamed from: ۢ */
    public final C17222 mo2780() {
        C17222 mo2780 = super.mo2780();
        m23257(mo2780);
        return mo2780;
    }

    @Override // l.AbstractC3817
    /* renamed from: ܶ */
    public final void mo11546(String str) {
        super.mo11546(str);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC20250
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo23259(CharSequence charSequence) {
        super.mo23259(charSequence);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC3817
    /* renamed from: ۢ */
    public final void mo11538(int i) {
        super.mo11538(i);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC20250
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo23260(C20876 c20876) {
        super.mo23260(c20876);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.AbstractC20250
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23258(long j) {
        super.mo23258(j);
        C8381.m21977().m21983(m11556("remoteTaskId"), this);
    }

    @Override // l.C9193, l.AbstractC3817
    /* renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        super.mo2781(c17222);
        m23257(c17222);
    }

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    private List m23256() {
        if (this.f27859 == null) {
            return Collections.EMPTY_LIST;
        }
        String m43782 = C18965.m43782(m11556("targetPath"));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m11558("ARG_PATHS")) {
            linkedHashSet.add(str);
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (AbstractC1139 abstractC1139 : this.f27859.m36248()) {
            if (linkedHashSet.contains(abstractC1139.m3910()) && abstractC1139.m3893() != null) {
                String m24393 = C9523.m24393(m43782, String.valueOf(abstractC1139.m3893()));
                if (abstractC1139.m3888()) {
                    m24393 = C16014.m37867(m24393, "/");
                }
                linkedHashSet2.add(m24393);
            }
        }
        return new ArrayList(linkedHashSet2);
    }

    @Override // l.AbstractC3817
    /* renamed from: ֫ */
    public final C17222 mo3144(Exception exc) {
        C17222 m40517 = C17222.m40517(exc);
        m23257(m40517);
        return m40517;
    }
}
