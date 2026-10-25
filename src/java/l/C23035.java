package l;

import java.util.ConcurrentModificationException;

/* compiled from: R6N8 */
/* renamed from: l.᩺ܰᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23035 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7513 f74132;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f74133;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f74134;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10858 f74135;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C7513 f74136;

    public C23035(C10858 c10858) {
        int i;
        this.f74135 = c10858;
        i = c10858.f32616;
        this.f74134 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51204(C11747 c11747) {
        C7513 m27141;
        if (this.f74133) {
            throw new IllegalStateException("Line builder is finished");
        }
        C7513 c7513 = this.f74136;
        if (c7513 != null && c7513.f23106 == 1024 && c7513 != null) {
            m27141 = C10858.m27141(this.f74132, c7513);
            this.f74132 = m27141;
            this.f74136 = null;
        }
        if (this.f74136 == null) {
            this.f74136 = new C7513(8);
        }
        this.f74136.m20148(c11747);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51205() {
        int i;
        C7513 m27141;
        C7513 c7513;
        C7513 m27138;
        int i2;
        C10858 c10858 = this.f74135;
        if (this.f74133) {
            return false;
        }
        this.f74133 = true;
        try {
            int i3 = this.f74134;
            i = c10858.f32616;
            if (i3 == i) {
                C7513 c75132 = this.f74136;
                if (c75132 != null) {
                    m27141 = C10858.m27141(this.f74132, c75132);
                    this.f74132 = m27141;
                    this.f74136 = null;
                }
                if (this.f74132 == null) {
                    return false;
                }
                c7513 = c10858.f32615;
                m27138 = C10858.m27138(c7513, this.f74132);
                c10858.f32615 = m27138;
                i2 = c10858.f32616;
                c10858.f32616 = i2 + 1;
                return true;
            }
            throw new ConcurrentModificationException("Line table changed while building");
        } finally {
            this.f74136 = null;
            this.f74132 = null;
        }
    }
}
