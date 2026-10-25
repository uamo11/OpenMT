package l;

import java.util.Map;

/* compiled from: O2OZ */
/* renamed from: l.֫ۗܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1558 extends AbstractC17828 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16374 f5503;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f5504;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f5505;

    public C1558(C16374 c16374, int i) {
        this.f5503 = c16374;
        this.f5504 = C16374.m38543(c16374, i);
        this.f5505 = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5504;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5331() {
        int m38541;
        int i = this.f5505;
        Object obj = this.f5504;
        C16374 c16374 = this.f5503;
        if (i == -1 || i >= c16374.size() || !C11003.equals(obj, C16374.m38543(c16374, this.f5505))) {
            m38541 = c16374.m38541(obj);
            this.f5505 = m38541;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C16374 c16374 = this.f5503;
        Map m38562 = c16374.m38562();
        if (m38562 != null) {
            return m38562.get(this.f5504);
        }
        m5331();
        int i = this.f5505;
        if (i == -1) {
            return null;
        }
        return C16374.m38551(c16374, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C16374 c16374 = this.f5503;
        Map m38562 = c16374.m38562();
        Object obj2 = this.f5504;
        if (m38562 != null) {
            return m38562.put(obj2, obj);
        }
        m5331();
        int i = this.f5505;
        if (i == -1) {
            c16374.put(obj2, obj);
            return null;
        }
        Object m38551 = C16374.m38551(c16374, i);
        C16374.m38545(c16374, this.f5505, obj);
        return m38551;
    }
}
