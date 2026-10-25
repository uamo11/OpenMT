package l;

import java.io.Writer;
import java.util.List;

/* compiled from: C4OQ */
/* renamed from: l.ۗܰ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3266 extends AbstractC18769 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f10248 = null;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f10249;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f10250;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f10251;

    public C3266(C12918 c12918, int i) {
        this.f10250 = c12918;
        this.f10251 = i;
    }

    @Override // l.InterfaceC5471
    /* renamed from: ܳ */
    public final String mo3566() {
        C12918 c12918 = this.f10250;
        return c12918.m31401(c12918.m31418().m11936(c12918.m31415(this.f10251)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10015(Writer writer) {
        C12918 c12918 = this.f10250;
        c12918.m31386(writer, c12918.m31418().m11936(c12918.m31415(this.f10251)));
    }

    @Override // l.InterfaceC5471
    public final String getName() {
        C12918 c12918 = this.f10250;
        return c12918.m31422(c12918.m31418().mo11935(c12918.m31415(this.f10251) + 4));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10016(Writer writer) {
        C12918 c12918 = this.f10250;
        c12918.m31406(c12918.m31418().mo11935(c12918.m31415(this.f10251) + 4), writer, false);
    }

    @Override // l.InterfaceC5471
    /* renamed from: ۘ */
    public final List mo3565() {
        int m10014 = m10014();
        C12918 c12918 = this.f10250;
        int mo11935 = c12918.m31418().mo11935(m10014 + 8);
        if (mo11935 > 0) {
            return new C4677(this, mo11935 + 4, c12918.m31418().mo11935(mo11935));
        }
        return AbstractC14545.of();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10017(Writer writer) {
        int m10014 = m10014();
        C12918 c12918 = this.f10250;
        int mo11935 = c12918.m31418().mo11935(m10014 + 8);
        if (mo11935 > 0) {
            int mo119352 = c12918.m31418().mo11935(mo11935);
            int i = mo11935 + 4;
            for (int i2 = 0; i2 < mo119352; i2++) {
                c12918.m31386(writer, c12918.m31418().m11936((i2 * 2) + i));
            }
        }
    }

    @Override // l.InterfaceC5471
    /* renamed from: ᩳ */
    public final String mo3568() {
        int m10014 = m10014();
        C12918 c12918 = this.f10250;
        return c12918.m31401(c12918.m31418().mo11935(m10014 + 4));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10019(Writer writer) {
        int m10014 = m10014();
        C12918 c12918 = this.f10250;
        c12918.m31386(writer, c12918.m31418().mo11935(m10014 + 4));
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private int m10014() {
        if (this.f10249 == 0) {
            C12918 c12918 = this.f10250;
            this.f10249 = c12918.m31399(c12918.m31418().m11936(c12918.m31415(this.f10251) + 2));
        }
        return this.f10249;
    }

    @Override // l.AbstractC18769
    public final String toString() {
        if (this.f10248 == null) {
            this.f10248 = C14354.m34249((InterfaceC5471) this, false);
        }
        return this.f10248;
    }

    @Override // l.AbstractC19475, l.InterfaceC8293
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo10018() {
        int i = this.f10251;
        if (i < 0 || i >= this.f10250.m31421()) {
            throw new C1237("method@" + i);
        }
    }
}
