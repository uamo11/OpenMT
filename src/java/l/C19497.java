package l;

import android.graphics.Bitmap;
import android.os.Trace;
import java.util.ArrayDeque;

/* compiled from: 08T5 */
/* renamed from: l.᩵ܰ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19497 extends AbstractC4930 {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public long f62997;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C18791 f62998;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC15967 f62999;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public C21843 f63000;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public C18791 f63001;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public long f63002;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C6796 f63003;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public Bitmap f63004;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f63005;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f63006;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f63007;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f63008;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C21843 f63009;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C8353 f63010;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f63011;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f63012;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C23729 f63013;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C3974 f63014;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f63015;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public int f63016;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "ImageRenderer";
    }

    public C19497(C23729 c23729) {
        super(4);
        this.f63013 = c23729;
        this.f62999 = InterfaceC15967.f49276;
        this.f63009 = new C21843(0, 0);
        this.f63014 = C3974.f12610;
        this.f63015 = new ArrayDeque();
        this.f62997 = -9223372036854775807L;
        this.f63002 = -9223372036854775807L;
        this.f63006 = 0;
        this.f63005 = 1;
    }

    @Override // l.InterfaceC18065
    /* renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        return this.f63013.m52377(c8353);
    }

    @Override // l.InterfaceC1837
    /* renamed from: ֫ */
    public final void mo6088(long j, long j2) {
        if (this.f63008) {
            return;
        }
        if (this.f63010 == null) {
            C3002 m14370 = m14370();
            C21843 c21843 = this.f63009;
            c21843.mo7();
            int m14355 = m14355(m14370, c21843, 2);
            if (m14355 != -5) {
                if (m14355 == -4) {
                    C22632.m50634(c21843.m12697());
                    this.f63011 = true;
                    this.f63008 = true;
                    return;
                }
                return;
            }
            C8353 c8353 = m14370.f9455;
            C22632.m50632(c8353);
            this.f63010 = c8353;
            this.f63007 = true;
        }
        if (this.f63003 == null) {
            m44904();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (m44906(j)) {
            }
            while (m44907(j)) {
            }
            Trace.endSection();
        } catch (C9619 e) {
            throw m14356(e, (C8353) null, 4003);
        }
    }

    @Override // l.InterfaceC1837
    /* renamed from: ܿ */
    public final boolean mo6101() {
        int i = this.f63005;
        if (i != 3) {
            return i == 0 && this.f63012;
        }
        return true;
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* renamed from: ۧ */
    public final boolean mo6098() {
        return this.f63008;
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo13457(boolean z, boolean z2) {
        this.f63005 = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo14359(l.C8353[] r5, long r6, long r8, l.C15894 r10) {
        /*
            r4 = this;
            l.ۘܰ֫ r5 = r4.f63014
            long r5 = r5.f12612
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L31
            java.util.ArrayDeque r5 = r4.f63015
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.f62997
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.f63002
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 < 0) goto L26
            goto L31
        L26:
            l.ۘܰ֫ r6 = new l.ۘܰ֫
            long r0 = r4.f62997
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            l.ۘܰ֫ r5 = new l.ۘܰ֫
            r5.<init>(r0, r8)
            r4.f63014 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19497.mo14359(l.۠ᩴ֫[], long, long, l.ܺۧۧ):void");
    }

    @Override // l.AbstractC4930
    /* renamed from: ۤ */
    public final void mo13464() {
        this.f63010 = null;
        this.f63014 = C3974.f12610;
        this.f63015.clear();
        m44905();
        this.f62999.mo22980();
    }

    @Override // l.AbstractC4930
    /* renamed from: ᩺ */
    public final void mo13473() {
        m44905();
        this.f63005 = Math.min(this.f63005, 1);
    }

    @Override // l.AbstractC4930
    /* renamed from: ۛ */
    public final void mo13461() {
        m44905();
    }

    @Override // l.AbstractC4930, l.InterfaceC5783
    /* renamed from: ֫ */
    public final void mo13450(int i, Object obj) {
        if (i != 15) {
            return;
        }
        InterfaceC15967 interfaceC15967 = obj instanceof InterfaceC15967 ? (InterfaceC15967) obj : null;
        if (interfaceC15967 == null) {
            interfaceC15967 = InterfaceC15967.f49276;
        }
        this.f62999 = interfaceC15967;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x015c, code lost:
    
        if (r14 == ((r0 * r1.f25638) - 1)) goto L83;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m44906(long r13) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19497.m44906(long):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0122, code lost:
    
        if (r4 == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m44907(long r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19497.m44907(long):boolean");
    }

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m44904() {
        if (this.f63007) {
            C8353 c8353 = this.f63010;
            c8353.getClass();
            C23729 c23729 = this.f63013;
            int m52377 = c23729.m52377(c8353);
            if (m52377 == C11010.m27348(4, 0, 0, 0) || m52377 == C11010.m27348(3, 0, 0, 0)) {
                C6796 c6796 = this.f63003;
                if (c6796 != null) {
                    c6796.mo12();
                }
                this.f63003 = c23729.m52378();
                this.f63007 = false;
                return;
            }
            throw m14356(new C9619("Provided decoder factory can't create decoder for format."), this.f63010, 4005);
        }
    }

    @Override // l.AbstractC4930
    /* renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        this.f63005 = Math.min(this.f63005, 1);
        this.f63008 = false;
        this.f63011 = false;
        this.f63004 = null;
        this.f63001 = null;
        this.f62998 = null;
        this.f63012 = false;
        this.f63000 = null;
        C6796 c6796 = this.f63003;
        if (c6796 != null) {
            c6796.flush();
        }
        this.f63015.clear();
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m44905() {
        this.f63000 = null;
        this.f63006 = 0;
        this.f62997 = -9223372036854775807L;
        C6796 c6796 = this.f63003;
        if (c6796 != null) {
            c6796.mo12();
            this.f63003 = null;
        }
    }
}
