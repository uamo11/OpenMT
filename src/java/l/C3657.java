package l;

import java.util.concurrent.Executor;

/* compiled from: N70B */
/* renamed from: l.ۘۖܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3657 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f11526;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile boolean f11527;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C15650 f11528;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9302 f11529;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3158 f11530;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18474 f11531;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f11532;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23097 f11533;

    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۖۖܿ] */
    public C3657(C18474 c18474, C23097 c23097, C7744 c7744, long j, long j2, InterfaceC17066 interfaceC17066, C15650 c15650, C14986 c14986) {
        C17975 c17975;
        boolean z;
        C9302 c9302;
        C12165 c12165;
        C10545 c10545;
        C17975 c179752;
        C3158 c3158;
        C17975 c179753;
        this.f11531 = c18474;
        this.f11533 = c23097;
        this.f11532 = j2;
        this.f11526 = interfaceC17066;
        if (c15650 == null) {
            this.f11530 = c23097.m51267(c7744, new InterfaceC17066() { // from class: l.ۖۖܿ
                @Override // l.InterfaceC17066
                /* renamed from: ᩻ */
                public final boolean mo1526() {
                    boolean m11153;
                    m11153 = C3657.this.m11153();
                    return m11153;
                }
            });
            return;
        }
        if (c14986.m35509() != c7744.length()) {
            throw new IllegalArgumentException("New text and change set lengths differ");
        }
        c17975 = c15650.f48169;
        if (c17975 != null) {
            c179753 = c15650.f48169;
            if (c179753.m42007(c14986.m35507(), c23097.f74313)) {
                z = true;
                if (!c23097.m51270() && !z) {
                    c3158 = c23097.m51267(c7744, new InterfaceC17066() { // from class: l.ۖۖܿ
                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            boolean m11153;
                            m11153 = C3657.this.m11153();
                            return m11153;
                        }
                    });
                } else {
                    ?? r4 = new InterfaceC17066() { // from class: l.ۖۖܿ
                        @Override // l.InterfaceC17066
                        /* renamed from: ᩻ */
                        public final boolean mo1526() {
                            boolean m11153;
                            m11153 = C3657.this.m11153();
                            return m11153;
                        }
                    };
                    c9302 = c15650.f48170;
                    c12165 = c15650.f48171;
                    c10545 = c15650.f48168;
                    c179752 = c15650.f48169;
                    c3158 = new C3158(c23097, c7744, r4, c9302, c12165, c10545, c179752, c14986);
                }
                this.f11530 = c3158;
            }
        }
        z = false;
        if (!c23097.m51270()) {
        }
        ?? r42 = new InterfaceC17066() { // from class: l.ۖۖܿ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                boolean m11153;
                m11153 = C3657.this.m11153();
                return m11153;
            }
        };
        c9302 = c15650.f48170;
        c12165 = c15650.f48171;
        c10545 = c15650.f48168;
        c179752 = c15650.f48169;
        c3158 = new C3158(c23097, c7744, r42, c9302, c12165, c10545, c179752, c14986);
        this.f11530 = c3158;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11158() {
        this.f11530.m9660();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11157(C20798 c20798, Executor executor, C15130 c15130) {
        this.f11530.m9658(c20798, executor, c15130);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC4569 m11155(int i, long j, C23244 c23244) {
        C3158 c3158 = this.f11530;
        try {
            EnumC4569 m9655 = c3158.m9655(i, j, c23244);
            if (m9655 == EnumC4569.COMPLETED) {
                m11150();
            }
            return m9655;
        } catch (Error | RuntimeException e) {
            if (c3158.m9661() == EnumC4569.ABORTED) {
                this.f11529 = null;
                this.f11531.m42955(this);
            }
            throw e;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m11150() {
        try {
            try {
                if (m11153()) {
                    this.f11531.m42955(this);
                    return;
                }
                C9302 m9673 = this.f11530.m9673();
                C17975 m9668 = this.f11530.m9668();
                C12165 m9665 = this.f11530.m9665();
                C10545 m9667 = this.f11530.m9667();
                this.f11529.m23887(m9673);
                if (m11153()) {
                    this.f11531.m42955(this);
                } else {
                    this.f11528 = new C15650(this.f11533, this.f11532, m9673, m9668, m9665, m9667);
                }
            } finally {
                this.f11529 = null;
            }
        } catch (Error | RuntimeException e) {
            this.f11531.m42955(this);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15650 m11156() {
        return this.f11528;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m11153() {
        if (this.f11527) {
            return true;
        }
        if (this.f11526.mo1526()) {
            this.f11527 = true;
        }
        return this.f11527;
    }
}
