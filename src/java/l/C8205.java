package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: J4NZ */
/* renamed from: l.۠ܰ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8205 extends AbstractC8891 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12918 f25214;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25215 = -1;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f25216;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f25217;

    public C8205(C12918 c12918, int i) {
        this.f25214 = c12918;
        this.f25217 = i;
        C1149 m31417 = c12918.m31417(7);
        if (m31417 != null && i < m31417.m3946()) {
            this.f25216 = (i * 4) + m31417.m3947();
            return;
        }
        throw new C4452(null, "Call site index out of bounds: %d", Integer.valueOf(i));
    }

    @Override // l.InterfaceC4060
    public final String getName() {
        return String.format("call_site_%d", Integer.valueOf(this.f25217));
    }

    @Override // l.InterfaceC4060
    public final int getIndex() {
        return this.f25217;
    }

    @Override // l.InterfaceC4060
    /* renamed from: ᩷ */
    public final InterfaceC19583 mo12184() {
        if (m21702().mo22557() < 3) {
            throw new C15431(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        InterfaceC10410 mo22558 = m21702().mo22558();
        if (mo22558.mo2302() != 22) {
            throw new C15431(null, "Invalid encoded value type (%d) for the first item in call site %d", Integer.valueOf(mo22558.mo2302()), Integer.valueOf(this.f25217));
        }
        return ((InterfaceC11158) mo22558).getValue();
    }

    @Override // l.InterfaceC4060
    /* renamed from: ۢ */
    public final List mo12181() {
        ArrayList arrayList = new ArrayList();
        AbstractC15781 m21702 = m21702();
        if (m21702.mo22557() < 3) {
            throw new C15431(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        if (m21702.mo22557() != 3) {
            m21702.mo22560();
            m21702.mo22560();
            m21702.mo22560();
            for (InterfaceC10410 mo22558 = m21702.mo22558(); mo22558 != null; mo22558 = m21702.mo22558()) {
                arrayList.add(mo22558);
            }
        }
        return arrayList;
    }

    @Override // l.InterfaceC4060
    /* renamed from: ܺ */
    public final String mo12183() {
        AbstractC15781 m21702 = m21702();
        if (m21702.mo22557() < 3) {
            throw new C15431(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        m21702.mo22560();
        InterfaceC10410 mo22558 = m21702.mo22558();
        if (mo22558.mo2302() != 23) {
            throw new C15431(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(mo22558.mo2302()), Integer.valueOf(this.f25217));
        }
        return ((InterfaceC17507) mo22558).getValue();
    }

    @Override // l.InterfaceC4060
    /* renamed from: ۧ */
    public final InterfaceC0531 mo12182() {
        AbstractC15781 m21702 = m21702();
        if (m21702.mo22557() < 3) {
            throw new C15431(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        m21702.mo22560();
        m21702.mo22560();
        InterfaceC10410 mo22558 = m21702.mo22558();
        if (mo22558.mo2302() != 21) {
            throw new C15431(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(mo22558.mo2302()), Integer.valueOf(this.f25217));
        }
        return ((InterfaceC16801) mo22558).getValue();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private AbstractC15781 m21702() {
        int i = this.f25215;
        C12918 c12918 = this.f25214;
        if (i < 0) {
            this.f25215 = c12918.m31418().mo11935(this.f25216);
        }
        return AbstractC15781.m37191(c12918, this.f25215);
    }

    @Override // l.AbstractC19475, l.InterfaceC8293
    /* renamed from: ܿ */
    public final void mo10018() {
        int i = this.f25217;
        if (i >= 0) {
            C1149 m31417 = this.f25214.m31417(7);
            if (i < (m31417 == null ? 0 : m31417.m3946())) {
                return;
            }
        }
        throw new C1237("callsite@" + i);
    }
}
