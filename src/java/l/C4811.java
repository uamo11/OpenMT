package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: C5A5 */
/* renamed from: l.ۙᩳۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4811 extends AbstractC2926 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public List f15220;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f15221;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f15222;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public List f15223;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public List f15224;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f15225;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f15226;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public List f15227;

    public C4811() {
        List list = Collections.EMPTY_LIST;
        this.f15227 = list;
        this.f15224 = list;
        this.f15220 = list;
        this.f15223 = list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14022(String str) {
        C12164 matcher = C5517.f17079.matcher((CharSequence) str);
        return C5517.m15649(matcher, 0) ? matcher.m29597("modifiers") : "";
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m14025(CharSequence charSequence) {
        C12164 matcher = C5517.f17074.matcher(charSequence);
        try {
            return C5517.m15649(matcher, 0) ? matcher.m29597("modifiers") : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14021(CharSequence charSequence, C23655 c23655) {
        C12164 matcher = C5517.f17079.matcher(charSequence);
        try {
            String str = c23655.f76634;
            String str2 = c23655.f76629;
            String str3 = c23655.f76633;
            for (int i = 0; C5517.m15649(matcher, i); i = matcher.end()) {
                if (str.equals(matcher.m29597("name")) && str2.equals(matcher.m29597("parameters")) && str3.equals(matcher.m29597("type"))) {
                    return matcher.m29597("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14020(CharSequence charSequence, C14482 c14482) {
        C12164 matcher = C5517.f17076.matcher(charSequence);
        try {
            String str = c14482.f44373;
            String str2 = c14482.f44370;
            for (int i = 0; C5517.m15649(matcher, i); i = matcher.end()) {
                if (str.equals(matcher.m29597("name")) && str2.equals(matcher.m29597("type"))) {
                    return matcher.m29597("modifiers");
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final void mo7983(C12366 c12366, CharSequence charSequence) {
        m8929(charSequence, new InterfaceC19860() { // from class: l.۠ᩳۢ
            @Override // l.InterfaceC19860
            /* renamed from: ֫ */
            public final Runnable mo11589(CharSequence charSequence2, InterfaceC17066 interfaceC17066) {
                int i;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                try {
                    C12164 matcher = C5517.f17074.matcher(charSequence2);
                    if (C5517.m15649(matcher, 0)) {
                        C8839 c8839 = new C8839();
                        String m29597 = matcher.m29597("type");
                        int lastIndexOf = m29597.lastIndexOf(47);
                        int i2 = lastIndexOf + 1;
                        if (i2 == 0) {
                            i2 = lastIndexOf + 2;
                        }
                        c8839.f26919 = m29597;
                        c8839.f26917 = m29597.substring(i2, m29597.length() - 1);
                        c8839.f26918 = matcher.m29606("directive");
                        c8839.f26916 = matcher.end();
                        arrayList.add(c8839);
                    }
                } catch (Throwable unused) {
                }
                C12164 matcher2 = C5517.f17079.matcher(charSequence2);
                C12164 matcher3 = C5517.f17077.matcher(charSequence2);
                int i3 = -1;
                for (int i4 = 0; C5517.m15649(matcher2, i4); i4 = matcher2.end()) {
                    try {
                        if (interfaceC17066.mo1526()) {
                            break;
                        }
                        if (i3 < matcher2.end() && !C5517.m15649(matcher3, matcher2.end())) {
                            break;
                        }
                        i3 = matcher3.start();
                        C23655 c23655 = new C23655();
                        c23655.f76631 = matcher2.m29606("directive");
                        c23655.f76630 = matcher3.end();
                        String m295972 = matcher2.m29597("modifiers");
                        c23655.f76635 = (m295972.contains("private") || m295972.contains("static") || m295972.contains("constructor")) ? false : true;
                        c23655.f76634 = matcher2.m29597("name");
                        c23655.f76629 = matcher2.m29597("parameters");
                        c23655.f76633 = matcher2.m29597("type");
                        if (!arrayList.isEmpty()) {
                            c23655.f76632 = ((C8839) arrayList.get(0)).f26919;
                        }
                        arrayList2.add(c23655);
                    } catch (Exception unused2) {
                    }
                }
                C12164 matcher4 = C5517.f17076.matcher(charSequence2);
                C12164 matcher5 = C5517.f17078.matcher(charSequence2);
                for (int i5 = 0; C5517.m15649(matcher4, i5); i5 = matcher4.end()) {
                    try {
                        if (interfaceC17066.mo1526()) {
                            break;
                        }
                        C14482 c14482 = new C14482();
                        c14482.f44372 = matcher4.m29606("directive");
                        c14482.f44368 = matcher4.end();
                        c14482.f44373 = matcher4.m29597("name");
                        c14482.f44370 = matcher4.m29597("type");
                        c14482.f44374 = matcher4.m29597(b.d);
                        if (!arrayList.isEmpty()) {
                            c14482.f44369 = ((C8839) arrayList.get(0)).f26919;
                        }
                        c14482.f44371 = matcher4.m29597("modifiers").contains("static");
                        arrayList3.add(c14482);
                    } catch (Exception unused3) {
                    }
                }
                if (!arrayList3.isEmpty()) {
                    C14482 c144822 = (C14482) C18566.m43105(arrayList3, 1);
                    C15859 c15859 = new C15859();
                    for (int i6 = 0; C5517.m15649(matcher5, i6); i6 = matcher5.end()) {
                        try {
                            c15859.add(matcher5.end());
                            if (matcher5.end() > c144822.f44368) {
                                break;
                            }
                        } catch (Exception unused4) {
                        }
                    }
                    int size = arrayList3.size();
                    while (true) {
                        size--;
                        if (c15859.isEmpty() || size < 0) {
                            break;
                        }
                        C14482 c144823 = (C14482) arrayList3.get(size);
                        int i7 = c144823.f44368;
                        while (!c15859.isEmpty()) {
                            if (c15859.isEmpty()) {
                                throw new NoSuchElementException();
                            }
                            if (i7 < c15859.getInt(c15859.size() - 1)) {
                                c144823.f44368 = c15859.m26284();
                            }
                        }
                    }
                }
                C12164 matcher6 = C5517.f17075.matcher(charSequence2);
                int i8 = 0;
                while (C5517.m15649(matcher6, i8)) {
                    try {
                        if (interfaceC17066.mo1526()) {
                            return null;
                        }
                        i8 = matcher6.end();
                        int length = charSequence2.length();
                        int i9 = i8;
                        while (i9 < length) {
                            char charAt = charSequence2.charAt(i9);
                            if (charAt == '\r' || charAt == '\n') {
                                break;
                            }
                            if (charAt == '\"') {
                                i = -1;
                                break;
                            }
                            if (charAt == '\\') {
                                i9++;
                            }
                            i9++;
                        }
                        i = -1;
                        i9 = -1;
                        if (i9 != i) {
                            int i10 = i9 + 1;
                            C9545 c9545 = new C9545();
                            c9545.f28948 = i8;
                            c9545.f28946 = i9;
                            String charSequence3 = charSequence2.subSequence(i8, i9).toString();
                            c9545.f28947 = charSequence3;
                            try {
                                c9545.f28949 = C10035.f30194.m28254(charSequence3);
                            } catch (RuntimeException unused5) {
                                c9545.f28949 = c9545.f28947;
                            }
                            arrayList4.add(c9545);
                            i8 = i10;
                        }
                    } catch (Exception unused6) {
                    }
                }
                final C4811 c4811 = C4811.this;
                return new Runnable() { // from class: l.ܶᩳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4811.m14023(C4811.this, arrayList, arrayList2, arrayList3, arrayList4);
                    }
                };
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14023(C4811 c4811, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c4811.f15227 = C20195.unmodifiableList(arrayList);
        c4811.f15224 = C20195.unmodifiableList(arrayList2);
        c4811.f15220 = C20195.unmodifiableList(arrayList3);
        c4811.f15223 = C20195.unmodifiableList(arrayList4);
        ?? r1 = c4811.f15222;
        if (r1 != 0) {
            c4811.m14026(c4811.f15226, c4811.f15225, r1);
        }
        InterfaceC6722 interfaceC6722 = c4811.f7936;
        if (interfaceC6722 != null) {
            interfaceC6722.mo18292(c4811.f15227, c4811.f15224, c4811.f15220, c4811.f15223);
        }
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final Object mo7979() {
        if (m8931()) {
            return this.f15221;
        }
        return null;
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final void mo7980(final int i, final int i2, final InterfaceC20834 interfaceC20834) {
        m8930(new Runnable(interfaceC20834, i, i2) { // from class: l.֨ᩳۢ

            /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f4510;

            /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f4511;

            /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC14346 f4513;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f4513 = (AbstractC14346) interfaceC20834;
                this.f4511 = i;
                this.f4510 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C4811.m14024(C4811.this, this.f4513, this.f4511, this.f4510);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14024(C4811 c4811, InterfaceC20834 interfaceC20834, int i, int i2) {
        c4811.f15222 = (AbstractC14346) interfaceC20834;
        c4811.f15226 = i;
        c4811.f15225 = i2;
        if (c4811.m8931()) {
            c4811.m14026(i, i2, interfaceC20834);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m14026(int i, int i2, InterfaceC20834 interfaceC20834) {
        int i3;
        int i4;
        int i5;
        this.f15221 = null;
        for (C8839 c8839 : this.f15227) {
            int i6 = c8839.f26918;
            if (i >= i6 && i <= (i5 = c8839.f26916)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f15221 = c8839;
                    interfaceC20834.mo17422(-1, -1, c8839.f26917);
                    return;
                }
            }
        }
        for (C14482 c14482 : this.f15220) {
            int i7 = c14482.f44372;
            if (i >= i7 && i <= (i4 = c14482.f44368)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f15221 = c14482;
                    interfaceC20834.mo17422(-1, -1, c14482.f44373);
                    return;
                }
            }
        }
        for (C23655 c23655 : this.f15224) {
            int i8 = c23655.f76631;
            if (i >= i8 && i <= (i3 = c23655.f76630)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f15221 = c23655;
                    interfaceC20834.mo17422(c23655.f76631, c23655.f76630, C9045.m23341(new StringBuilder(), c23655.f76634, "()"));
                    return;
                }
            }
        }
        interfaceC20834.mo17422(0, 0, null);
    }
}
