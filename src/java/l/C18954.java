package l;

import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/* compiled from: AAGU */
/* renamed from: l.ᩴᩴ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18954 extends AbstractC3163 {

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59772 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C20097 f59773;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C19660 f59774;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Boolean f59775;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C3786 f59776;

    @Override // l.AbstractC3163
    /* renamed from: ۗ */
    public final boolean mo9687() {
        return true;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩶ */
    public final boolean mo9706() {
        return true;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩹ */
    public final boolean mo9708() {
        return true;
    }

    public C18954(int i, AbstractC3577 abstractC3577) {
        super(i, abstractC3577);
        this.f59776 = new C3786(new C16130(this), mo13919());
        this.f59774 = C19660.m45194(i, abstractC3577);
    }

    public C18954(int i, AbstractC3577 abstractC3577, C12951 c12951) {
        this(i, abstractC3577);
        Boolean m31502 = c12951.m31502();
        this.f59775 = m31502;
        if (m31502 != null) {
            this.f59776.m11443(m31502.booleanValue());
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9685(AbstractC3577 abstractC3577) {
        super.mo9685(abstractC3577);
        C19660 m45194 = C19660.m45194(this.f9954, abstractC3577);
        if (this.f59774.equals(m45194)) {
            return;
        }
        C2998.m9140(this.f59774);
        this.f59774 = m45194;
        this.f59776.m11441();
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final void mo9695(C10130 c10130) {
        c10130.m25422(this.f59775);
    }

    @Override // l.AbstractC3163
    /* renamed from: ۘ */
    public final String mo9688() {
        return this.f59774.f63483;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۖ */
    public final String mo9686() {
        return this.f59774.f63483;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩵ */
    public final C20097 mo9705() {
        Comparator c9076;
        C20097 c20097 = this.f59773;
        if (c20097 != null) {
            return c20097;
        }
        try {
            C0608 m15690 = new C5548(C2998.m9139(this.f59774)).m15690();
            HashMap hashMap = m15690.f2361;
            HashMap hashMap2 = m15690.f2363;
            ArrayList arrayList = new ArrayList(hashMap2.size());
            for (Map.Entry entry : hashMap2.entrySet()) {
                arrayList.add(new C4574((String) entry.getKey(), ((Integer) entry.getValue()).intValue()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap.size());
            for (Map.Entry entry2 : hashMap.entrySet()) {
                arrayList2.add(new C4574((String) entry2.getKey(), ((Integer) entry2.getValue()).intValue()));
            }
            if (m15690.f2362) {
                c9076 = new C21890(1);
            } else {
                c9076 = new C9076();
            }
            Collections.sort(arrayList, c9076);
            Collections.sort(arrayList2, c9076);
            C20097 c200972 = new C20097(C20195.unmodifiableList(arrayList), C20195.unmodifiableList(arrayList2));
            this.f59773 = c200972;
            return c200972;
        } finally {
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩸ */
    public final void mo9707() {
        C1802.f6209.execute(new RunnableC19781(5, this));
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        this.f59776.m11441();
        if (z) {
            C2998.m9140(this.f59774);
            this.f59773 = null;
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۜ */
    public final boolean mo9691(String str) {
        return this.f59776.m11445(str);
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩳ */
    public final boolean mo9703(String str) {
        C3786 c3786 = this.f59776;
        c3786.getClass();
        return c3786.m11440(C9523.m24406(str), C9523.m24404(str)) != null;
    }

    @Override // l.AbstractC3163
    /* renamed from: ᩻ */
    public final String mo9709(String str) {
        return this.f59776.m11444(str);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        String m24406 = C9523.m24406(str);
        C12029 c12029 = (C12029) this.f59776.m11440(m24406, C9523.m24404(str));
        if (c12029 != null) {
            return new C12875(c12029, m24406);
        }
        return null;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        String m39731 = AbstractC16891.m39731(str);
        Collection<C12029> values = this.f59776.m11446(m39731).values();
        ArrayList arrayList = new ArrayList(values.size() + 1);
        for (C12029 c12029 : values) {
            if (z || !c12029.m29391().startsWith(".")) {
                arrayList.add(new C12875(c12029, m39731));
            }
        }
        return arrayList;
    }

    @Override // l.AbstractC3163
    /* renamed from: ۢ */
    public final void mo9692(String str) {
        this.f59776.m11442(str);
    }

    @Override // l.AbstractC13921
    /* renamed from: ᩳ */
    public final boolean mo13919() {
        return this.f59775 == Boolean.TRUE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43744(C18954 c18954, C1654 c1654, Vector vector, String str) {
        String lowerCase;
        HashSet hashSet = new HashSet();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            hashSet.add(((C12029) it.next()).m29391());
        }
        Iterator it2 = vector.iterator();
        while (it2.hasNext()) {
            C12029 c12029 = (C12029) it2.next();
            if (c12029.m29386().m5767()) {
                String m29391 = c12029.m29391();
                boolean z = false;
                char charAt = m29391.charAt(0);
                if ('a' <= charAt && charAt <= 'z') {
                    lowerCase = m29391.toUpperCase();
                } else if ('A' <= charAt && charAt <= 'Z') {
                    lowerCase = m29391.toLowerCase();
                }
                if (!hashSet.contains(lowerCase)) {
                    try {
                        c1654.m5594(C9523.m24393(str, lowerCase));
                        z = true;
                    } catch (C16532 e) {
                        int i = e.f50807;
                        if (i != 2 && i != 10) {
                            throw e;
                        }
                    }
                    c18954.f59775 = Boolean.valueOf(z);
                    c18954.f59776.m11443(z);
                    return;
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C1654 m43746(C18954 c18954) {
        return C2998.m9139(c18954.f59774);
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final InputStream mo9681(long j, String str) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            InputStream m5585 = m9139.m5585(j, str);
            return new C2726(this, m5585, m5585, m9139);
        } catch (IOException | Error | RuntimeException e) {
            C2998.m9138(m9139);
            throw e;
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9683(int i, int i2, String str) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            C1716 c1716 = new C1716();
            c1716.m5763(i, i2);
            m9139.m5593(str, c1716);
        } finally {
            C2998.m9138(m9139);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ֫ */
    public final void mo9684(String str, String str2) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            m9139.m5587(str, str2);
        } finally {
            C2998.m9138(m9139);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final OutputStream mo9693(long j, String str) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            return new C4137(this, m9139.m5592(str), m9139);
        } catch (IOException | Error | RuntimeException e) {
            C2998.m9138(m9139);
            throw e;
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final void mo9694(int i, String str) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            C1716 c1716 = new C1716();
            c1716.m5760(i);
            m9139.m5593(str, c1716);
        } finally {
            C2998.m9138(m9139);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ۧ */
    public final boolean mo9696(String str, String str2) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            m9139.m5587(str, str2);
            C2998.m9138(m9139);
            return true;
        } catch (C16532 unused) {
            C2998.m9138(m9139);
            return false;
        } catch (Throwable th) {
            C2998.m9138(m9139);
            throw th;
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ܶ */
    public final String mo9699() {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            String str = this.f9955.f11354;
            if (!TextUtils.isEmpty(str)) {
                return AbstractC16891.m39731(str);
            }
            return AbstractC16891.m39731(m9139.m5584());
        } finally {
            C2998.m9138(m9139);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ܽ */
    public final void mo9700(long j, String str) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            C1716 c1716 = new C1716();
            int i = (int) (j / 1000);
            c1716.m5761(i, i);
            m9139.m5593(str, c1716);
        } finally {
            C2998.m9138(m9139);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ܽ */
    public final void mo9701(String str, boolean z) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            if (z) {
                m9139.m5596(str);
            } else {
                m9139.m5597(str);
            }
        } finally {
            C2998.m9138(m9139);
        }
    }

    @Override // l.AbstractC3163
    /* renamed from: ܿ */
    public final void mo9702(String str) {
        C1654 m9139 = C2998.m9139(this.f59774);
        try {
            C1716 c1716 = new C1716();
            c1716.m5760(448);
            m9139.m5588(str, c1716);
        } catch (C16532 e) {
            if (e.f50807 == 4) {
                try {
                    if (m9139.m5594(str).m5764()) {
                        return;
                    }
                } catch (C16532 unused) {
                }
            }
            throw e;
        } finally {
            C2998.m9138(m9139);
        }
    }
}
