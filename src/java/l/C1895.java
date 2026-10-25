package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: H1AQ */
/* renamed from: l.֫ܶ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C1895 extends AbstractC8245 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f6406;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f6407;

    public C1895(C15094 c15094, int i) {
        super(c15094);
        ArrayList arrayList = new ArrayList();
        this.f6407 = arrayList;
        this.f25378 = i;
        C15094 c150942 = this.f25376;
        C15094 m35764 = c150942.m35764(i);
        while (m35764 != null) {
            c150942 = m35764;
            m35764 = m35764.m35764(this.f25378);
        }
        this.f25376 = c150942;
        int i2 = this.f25378;
        arrayList.add(i2 == 0 ? c150942.f46156 : i2 == 1 ? c150942.f46140 : null);
        C15094 m35757 = c150942.m35757(this.f25378);
        while (m35757 != null) {
            int i3 = this.f25378;
            arrayList.add(i3 == 0 ? m35757.f46156 : i3 == 1 ? m35757.f46140 : null);
            m35757 = m35757.m35757(this.f25378);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC8245 abstractC8245 = (AbstractC8245) it.next();
            int i4 = this.f25378;
            if (i4 == 0) {
                abstractC8245.f25376.f46137 = this;
            } else if (i4 == 1) {
                abstractC8245.f25376.f46136 = this;
            }
        }
        if (this.f25378 == 0 && ((C21446) this.f25376.f46132).m48578() && arrayList.size() > 1) {
            this.f25376 = ((AbstractC8245) C18566.m43105(arrayList, 1)).f25376;
        }
        this.f6406 = this.f25378 == 0 ? this.f25376.m35738() : this.f25376.m35707();
    }

    public final String toString() {
        String concat = "ChainRun ".concat(this.f25378 == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f6407.iterator();
        while (it.hasNext()) {
            AbstractC8245 abstractC8245 = (AbstractC8245) it.next();
            concat = C16014.m37867(C16014.m37867(concat, "<") + abstractC8245, "> ");
        }
        return concat;
    }

    @Override // l.AbstractC8245
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo6243() {
        ArrayList arrayList = this.f6407;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC8245) arrayList.get(i)).mo6243()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8245
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo6245() {
        ArrayList arrayList = this.f6407;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.f25379.f53272 + ((AbstractC8245) arrayList.get(i)).mo6245() + j + r5.f25382.f53272;
        }
        return j;
    }

    @Override // l.AbstractC8245
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6244() {
        this.f25375 = null;
        Iterator it = this.f6407.iterator();
        while (it.hasNext()) {
            ((AbstractC8245) it.next()).mo6244();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01e1, code lost:
    
        r1.mo34849(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01de, code lost:
    
        r3 = r2;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01dc, code lost:
    
        if (r2 != r3) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    @Override // l.AbstractC8245, l.InterfaceC11068
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6241(l.InterfaceC11068 r24) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1895.mo6241(l.ۧܶ):void");
    }

    @Override // l.AbstractC8245
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6242() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6407;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC8245) arrayList.get(i)).mo6242();
            i++;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C15094 m6239() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6407;
            if (i >= arrayList.size()) {
                return null;
            }
            AbstractC8245 abstractC8245 = (AbstractC8245) arrayList.get(i);
            if (abstractC8245.f25376.m35735() != 8) {
                return abstractC8245.f25376;
            }
            i++;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C15094 m6238() {
        AbstractC8245 abstractC8245;
        ArrayList arrayList = this.f6407;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            abstractC8245 = (AbstractC8245) arrayList.get(size);
        } while (abstractC8245.f25376.m35735() == 8);
        return abstractC8245.f25376;
    }

    @Override // l.AbstractC8245
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6240() {
        ArrayList arrayList = this.f6407;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC8245) it.next()).mo6240();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C15094 c15094 = ((AbstractC8245) arrayList.get(0)).f25376;
        C15094 c150942 = ((AbstractC8245) arrayList.get(size - 1)).f25376;
        int i = this.f25378;
        C17417 c17417 = this.f25379;
        C17417 c174172 = this.f25382;
        if (i == 0) {
            C5218 c5218 = c15094.f46141;
            C5218 c52182 = c150942.f46159;
            C17417 m21827 = AbstractC8245.m21827(c5218, 0);
            int m15007 = c5218.m15007();
            C15094 m6239 = m6239();
            if (m6239 != null) {
                m15007 = m6239.f46141.m15007();
            }
            if (m21827 != null) {
                AbstractC8245.m21828(c174172, m21827, m15007);
            }
            C17417 m218272 = AbstractC8245.m21827(c52182, 0);
            int m150072 = c52182.m15007();
            C15094 m6238 = m6238();
            if (m6238 != null) {
                m150072 = m6238.f46159.m15007();
            }
            if (m218272 != null) {
                AbstractC8245.m21828(c17417, m218272, -m150072);
            }
        } else {
            C5218 c52183 = c15094.f46161;
            C5218 c52184 = c150942.f46133;
            C17417 m218273 = AbstractC8245.m21827(c52183, 1);
            int m150073 = c52183.m15007();
            C15094 m62392 = m6239();
            if (m62392 != null) {
                m150073 = m62392.f46161.m15007();
            }
            if (m218273 != null) {
                AbstractC8245.m21828(c174172, m218273, m150073);
            }
            C17417 m218274 = AbstractC8245.m21827(c52184, 1);
            int m150074 = c52184.m15007();
            C15094 m62382 = m6238();
            if (m62382 != null) {
                m150074 = m62382.f46133.m15007();
            }
            if (m218274 != null) {
                AbstractC8245.m21828(c17417, m218274, -m150074);
            }
        }
        c174172.f53267 = this;
        c17417.f53267 = this;
    }
}
