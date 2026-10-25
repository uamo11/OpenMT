package l;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import moe.shizuku.server.IShizukuService;

/* compiled from: B5S9 */
/* renamed from: l.۬ۛ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C12918 implements InterfaceC15620 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f38768;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f38769;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17858 f38770;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f38771;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f38772;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f38773;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f38774;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f38775;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0225 f38776;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0225 f38777;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38778;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f38779;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Object f38780;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38781;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f38782;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f38783;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC3912 f38784;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C7897 f38785;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f38786;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0225 f38787;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f38788;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38789;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f38790;

    static {
        ApplicationC12518.m30701(IShizukuService.Stub.TRANSACTION_isHidden);
    }

    public native C12918(AbstractC3912 abstractC3912, C7897 c7897);

    public native C12918(C7897 c7897, AbstractC3912 abstractC3912, boolean z, boolean z2);

    public C12918(byte[] bArr, int i, boolean z) {
        this(null, new C22920(bArr, i), z, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12918 m31380(InputStream inputStream) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        C10619.m26650(inputStream);
        return new C12918(C18366.m42796(inputStream), 0, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12918 m31381(byte[] bArr) {
        return new C12918(bArr, 0, true);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m31398() {
        return this.f38774;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC3912 m31418() {
        return this.f38784;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C22920 m31416() {
        AbstractC3912 abstractC3912 = this.f38784;
        if (abstractC3912 instanceof C22920) {
            return (C22920) abstractC3912;
        }
        throw new RuntimeException();
    }

    @Override // l.InterfaceC15620
    /* renamed from: ֫ */
    public final C7897 mo27437() {
        return this.f38785;
    }

    @Override // l.InterfaceC15620
    /* renamed from: ۧ */
    public final Set mo27438() {
        return new C15034(this);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m31397(int i) {
        int i2 = this.f38774;
        if (i2 == 0) {
            return 0;
        }
        int mo11937 = this.f38784.mo11937((i * 4) + i2 + 4);
        if (mo11937 == 0) {
            return 0;
        }
        return this.f38774 + mo11937;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m31414() {
        this.f38783 = false;
        this.f38770.m41831();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m31402(int i) {
        if (i < 0 || i >= this.f38769) {
            throw new C4452(null, "String index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f38775;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m31394(int i) {
        if (i < 0 || i >= this.f38788) {
            throw new C4452(null, "Type index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 4) + this.f38789;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m31404(int i) {
        if (i < 0 || i >= this.f38779) {
            throw new C4452(null, "Field index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f38790;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m31415(int i) {
        if (i < 0 || i >= this.f38771) {
            throw new C4452(null, "Method index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 8) + this.f38772;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m31399(int i) {
        if (i < 0 || i >= this.f38786) {
            throw new C4452(null, "Proto index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 12) + this.f38768;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31383(int i) {
        if (i < 0 || i >= this.f38778) {
            throw new C4452(null, "Class index out of bounds: %d", Integer.valueOf(i));
        }
        return (i * 32) + this.f38782;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m31408() {
        return this.f38778;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m31410() {
        return this.f38769;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m31396() {
        return this.f38788;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m31400() {
        return this.f38786;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m31423() {
        return this.f38779;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m31421() {
        return this.f38771;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m31422(int i) {
        boolean z = this.f38783;
        String m41829 = z ? this.f38770.m41829(i) : null;
        if (m41829 != null) {
            return m41829;
        }
        int m31402 = m31402(i);
        AbstractC3912 abstractC3912 = this.f38784;
        C18729 m11939 = abstractC3912.m11939(abstractC3912.mo11935(m31402));
        String m43361 = m11939.m43361(m11939.m43368());
        m11939.m43359();
        if (z) {
            this.f38770.m41832(i, m43361);
        }
        return m43361;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m31406(int i, Writer writer, boolean z) {
        if (this.f38783 && !z) {
            writer.write(m31422(i));
        } else {
            m31385(i, writer, z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31385(int i, Writer writer, boolean z) {
        int m31402 = m31402(i);
        AbstractC3912 abstractC3912 = this.f38784;
        C18729 m11939 = abstractC3912.m11939(abstractC3912.mo11935(m31402));
        m11939.m43357(m11939.m43368(), writer, z);
        m11939.m43359();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31392(int i, int i2, int i3, String str) {
        if (i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length()) {
            String m41829 = this.f38783 ? this.f38770.m41829(i) : null;
            if (m41829 != null) {
                if (m41829.length() == i3 && str.regionMatches(i2, m41829, 0, i3)) {
                    return true;
                }
            } else {
                int m31402 = m31402(i);
                AbstractC3912 abstractC3912 = this.f38784;
                C18729 m11939 = abstractC3912.m11939(abstractC3912.mo11935(m31402));
                try {
                    return C7671.m20527(this.f38784, m11939.m43364(), m11939.m43368(), str, i2, i3);
                } finally {
                    m11939.m43359();
                }
            }
        }
        return false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m31424(int i) {
        if (i == -1) {
            return null;
        }
        return m31422(i);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m31401(int i) {
        boolean z = this.f38783;
        String m41833 = z ? this.f38770.m41833(i) : null;
        if (m41833 != null) {
            return m41833;
        }
        String m31422 = m31422(this.f38784.mo11935(m31394(i)));
        if (z) {
            this.f38770.m41835(i, m31422);
        }
        return m31422;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m31411(int i) {
        return m31401(this.f38784.mo11935(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31386(Writer writer, int i) {
        if (this.f38783) {
            writer.write(m31401(i));
        } else {
            m31406(this.f38784.mo11935(m31394(i)), writer, false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m31407(int i, int i2, int i3, String str) {
        String m41833 = this.f38783 ? this.f38770.m41833(i) : null;
        if (m41833 != null) {
            return i2 >= 0 && i3 >= 0 && i2 + i3 <= str.length() && m41833.length() == i3 && str.regionMatches(i2, m41833, 0, i3);
        }
        return m31392(this.f38784.mo11935(m31394(i)), i2, i3, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m31393(int i, String str) {
        String m41833 = this.f38783 ? this.f38770.m41833(i) : null;
        int i2 = 0;
        if (m41833 != null) {
            int i3 = 0;
            while (i3 < m41833.length() && m41833.charAt(i3) == '[') {
                i3++;
            }
            return m41833.length() - i3 == str.length() && m41833.regionMatches(i3, str, 0, str.length());
        }
        int m31394 = m31394(i);
        AbstractC3912 abstractC3912 = this.f38784;
        C18729 m11939 = abstractC3912.m11939(abstractC3912.mo11935(m31402(abstractC3912.mo11935(m31394))));
        try {
            int m43368 = m11939.m43368();
            int m43364 = m11939.m43364();
            while (i2 < m43368 && abstractC3912.m11942(m43364 + i2) == 91) {
                i2++;
            }
            return C7671.m20527(this.f38784, m43364 + i2, m43368 - i2, str, 0, str.length());
        } finally {
            m11939.m43359();
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m31419() {
        return new C21386(this);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final List m31403() {
        return new C22091(this);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C3266 m31409(int i) {
        if (this.f38783) {
            return this.f38770.m41834(this, i);
        }
        return new C3266(this, i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15259 m31413(int i) {
        if (this.f38783) {
            return this.f38770.m41830(this, i);
        }
        return new C15259(this, i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1855 m31412(int i, EnumC0841 enumC0841) {
        C1855 c1855 = (C1855) this.f38776.m1479();
        if (c1855 != null) {
            c1855.f29162 = enumC0841;
            c1855.f29164 = i;
            return c1855;
        }
        return new C1855(this, enumC0841, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31388(C1855 c1855) {
        this.f38776.m1477(c1855);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20472 m31405(int i, EnumC0841 enumC0841) {
        C20472 c20472 = (C20472) this.f38777.m1479();
        if (c20472 != null) {
            c20472.f29162 = enumC0841;
            c20472.f29164 = i;
            return c20472;
        }
        return new C20472(this, enumC0841, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31390(C20472 c20472) {
        this.f38777.m1477(c20472);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2833 m31384(int i, EnumC0841 enumC0841) {
        C2833 c2833 = (C2833) this.f38787.m1479();
        if (c2833 == null) {
            return new C2833(this, enumC0841, i);
        }
        c2833.f29162 = enumC0841;
        c2833.f29164 = i;
        return c2833;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31389(C2833 c2833) {
        this.f38787.m1477(c2833);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C1149 m31417(int i) {
        Iterator it = new C19975(this, this.f38784.mo11935(this.f38781)).iterator();
        while (it.hasNext()) {
            C1149 c1149 = (C1149) it.next();
            if (c1149.m3948() == i) {
                return c1149;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31387(Object obj) {
        this.f38780 = obj;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m31395() {
        return this.f38780;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31391(boolean z) {
        this.f38773 = z;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m31420() {
        return this.f38773;
    }
}
