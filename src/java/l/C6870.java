package l;

import android.graphics.Canvas;
import java.util.Collections;
import java.util.List;
import java.util.function.IntUnaryOperator;

/* compiled from: U4S1 */
/* renamed from: l.ۜܺܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6870 implements InterfaceC21129 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7391 f21233;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20777 f21234;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23803 f21235;

    public C6870(C12392 c12392) {
        C20177 c20177 = new C20177();
        this.f21233 = new C7391();
        C20777 c20777 = new C20777(c12392, c20177);
        this.f21234 = c20777;
        this.f21235 = c20777.f67290;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m18576() {
        return this.f21234.m47553();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18597(InterfaceC20445 interfaceC20445) {
        this.f21234.m47568(interfaceC20445);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m18602(InterfaceC20445 interfaceC20445) {
        this.f21234.m47574(interfaceC20445);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18580(InterfaceC20445 interfaceC20445, int i, int i2) {
        this.f21234.m47555(interfaceC20445, i, i2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m18584(InterfaceC20445 interfaceC20445) {
        this.f21234.m47560(interfaceC20445);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18566(InterfaceC20445 interfaceC20445, int i, int i2) {
        this.f21234.m47542(interfaceC20445, i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18559() {
        this.f21234.m47537();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18571() {
        this.f21234.m47535();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18589(InterfaceC20445 interfaceC20445) {
        this.f21234.m47563(interfaceC20445);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m18572() {
        this.f21234.m47549();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18565(InterfaceC20445 interfaceC20445) {
        this.f21234.m47541(interfaceC20445);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m18593(InterfaceC20445 interfaceC20445) {
        this.f21234.m47566(interfaceC20445);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m18586() {
        m18571();
        this.f21234.m47570();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m18574() {
        return this.f21234.m47548();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m18575() {
        return this.f21234.m47547();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m18600() {
        return this.f21234.m47561();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m18594(int i, int i2) {
        return this.f21234.m47543(i, i2);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m18573() {
        return this.f21234.m47552();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m18577(int i, int i2) {
        C6686 m47559 = this.f21234.m47559();
        if (m47559 == null || !m47559.m18232(i, i2)) {
            return Collections.EMPTY_LIST;
        }
        C15068 m18235 = m47559.m18235(i, i2);
        return m18235 == null ? Collections.EMPTY_LIST : m18235.m35668();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18564(C10130 c10130) {
        this.f21234.m47540(c10130);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18570(C12951 c12951, int i) {
        return this.f21234.m47546(c12951, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18568(CharSequence charSequence) {
        return this.f21234.m47544(charSequence);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18578(CharSequence charSequence) {
        this.f21234.m47554(charSequence);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18579(InterfaceC20445 interfaceC20445) {
        if (this.f21234.m47558(interfaceC20445)) {
            m18578((CharSequence) interfaceC20445);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18561(int i, int i2, int i3, CharSequence charSequence) {
        this.f21234.m47538(i, i2, i3, charSequence);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m18595(int i, int i2) {
        return this.f21233.m19906(i, i2, this.f21234.m47551());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m18555(int i, int i2) {
        return this.f21233.m19895(i, i2, this.f21234.m47551());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14630 m18588(int i, int i2) {
        return this.f21233.m19905(i, i2, this.f21234.m47551());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] m18582(int i) {
        return this.f21233.m19904(i, this.f21234.m47551());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m18554(CharSequence charSequence, int i, int i2, float f, C9584 c9584) {
        return this.f21233.m19894(this.f21234.m47551(), charSequence, i, i2, f, c9584);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ᩳܺܿ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6761 m18556(CharSequence charSequence, int i, final int i2, C9584 c9584) {
        final C9302 m47551 = this.f21234.m47551();
        if (m47551 != null && m47551.m23880() != 0) {
            final C17768 c17768 = new C17768();
            c17768.m41620(m47551);
            return c9584.m24476(charSequence, i, i2, 0.0f, (C18159) new IntUnaryOperator() { // from class: l.ᩳܺܿ
                public /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
                    return C15755.$default$andThen(this, intUnaryOperator);
                }

                public /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
                    return C15755.$default$compose(this, intUnaryOperator);
                }

                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i3) {
                    if (i3 < C9302.this.m23880()) {
                        C17768 c177682 = c17768;
                        if (c177682.m41621(i3)) {
                            return c177682.m41619();
                        }
                    }
                    return i2;
                }
            });
        }
        return c9584.m24476(charSequence, i, i2, 0.0f, (C18159) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18563(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, C1539 c1539, C22686 c22686) {
        C20777 c20777 = this.f21234;
        C7391 c7391 = this.f21233;
        c20777.m47539(c7391, i, i2);
        int i5 = -1;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f21233.m19900(c20777.m47551(), canvas, charSequence, i, i2, f, i3, i4, c1539, c22686);
            if (c7391.m19902()) {
                c7391.m19898(1.0f, 0);
                c20777.m47571();
            }
            c7391.m19901((C13035) null, -1, -1, 0);
        } catch (Throwable th2) {
            th = th2;
            i5 = -1;
            c7391.m19901((C13035) null, i5, i5, 0);
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18562(Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, C1539 c1539, C22686 c22686, int[] iArr) {
        this.f21233.m19899(this.f21234.m47551(), canvas, charSequence, i, i2, f, f2, i3, c1539, c22686, iArr);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m18591(int i) {
        C9302 m47551 = this.f21234.m47551();
        return m47551 != null && m47551.m23885() == 1 && m47551.m23883(0).m49205() == i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18567(int i, int i2, int i3) {
        return this.f21233.m19903(this.f21234.m47551(), i, i2, i3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18560(float f, int i) {
        this.f21233.m19898(f, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18569(String str) {
        return this.f21234.m47545(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m18581(String str) {
        return this.f21234.m47557(str);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m18599() {
        this.f21234.m47536();
    }

    @Override // l.InterfaceC21129
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 mo18558(int i, int i2, CharSequence charSequence) {
        C20777 c20777 = this.f21234;
        C6686 m47572 = c20777.m47572();
        C7391 c7391 = this.f21233;
        if (m47572 != null) {
            return c7391.m19896(m47572, charSequence, i, i2);
        }
        return c7391.m19897(c20777.m47573(), charSequence, i, i2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6686 m18583() {
        return this.f21234.m47559();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final List m18587() {
        return this.f21234.m47562();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17186 m18596() {
        return this.f21234.m47567();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6603 m18592() {
        return this.f21234.m47565();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15068 m18601() {
        return this.f21234.m47550();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18598(InterfaceC20445 interfaceC20445, int i, int i2) {
        this.f21234.m47569(interfaceC20445, i, i2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m18585(int i, int i2) {
        return this.f21234.m47556(i, i2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18590(InterfaceC20445 interfaceC20445, int i, int i2) {
        this.f21234.m47564(interfaceC20445, i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18553(AbstractActivityC3346 abstractActivityC3346, final InterfaceC20445 interfaceC20445, final int i, final int i2, final int i3) {
        final String charSequence = interfaceC20445.subSequence(i, i2).toString();
        int m22531 = C8720.m22531(i3, charSequence);
        DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = new DialogInterfaceOnClickListenerC3677(abstractActivityC3346, (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 11) ? false : true);
        dialogInterfaceOnClickListenerC3677.m11203(new InterfaceC2266() { // from class: l.ܿܺܿ
            @Override // l.InterfaceC2266
            /* renamed from: ۧ */
            public final void mo7493(int i4) {
                String m22525 = C8720.m22525(i3, i4, charSequence);
                if (m22525 != null) {
                    InterfaceC20445 interfaceC204452 = interfaceC20445;
                    int i5 = i;
                    interfaceC204452.replace(i5, i2, m22525);
                    interfaceC204452.setSelection(m22525.length() + i5);
                }
            }
        });
        dialogInterfaceOnClickListenerC3677.m11202(m22531);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m18557(int i) {
        C15068 m18234;
        C6686 m47559 = this.f21234.m47559();
        if (m47559 == null || i < 0 || i >= m47559.m18230() || !m47559.m18232(i, i + 1) || (m18234 = m47559.m18234(m47559.m18226(i))) == null) {
            return null;
        }
        return m18234.m35651(C4900.f15473);
    }
}
