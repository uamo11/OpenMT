package l;

import java.util.ArrayDeque;
import java.util.List;

/* compiled from: N6PY */
/* renamed from: l.ۚܰۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5391 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15361(int i) {
        return i == 102 || i == 2 || i == 3 || i == -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15360(CharSequence charSequence, boolean z, int i, C19012 c19012) {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
        if (charSequence.length() > 1048576) {
            throw m15357(EnumC0451.LIMIT, "Source length limit exceeded");
        }
        C2569 c2569 = new C2569();
        try {
            try {
                m15359(charSequence, z, i, c2569, c19012);
            } catch (StackOverflowError unused) {
                throw m15357(EnumC0451.LIMIT, "Parser stack limit exceeded");
            }
        } catch (C18797 e) {
            try {
                if (e.f59329 != EnumC0451.SYNTAX) {
                    throw e;
                }
                C15371.m36409(charSequence, z, i, c2569, c19012);
            } catch (C18797 e2) {
                if (!Thread.currentThread().isInterrupted()) {
                    throw e2;
                }
                throw new InterruptedException();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15359(CharSequence charSequence, boolean z, int i, C2569 c2569, C19012 c19012) {
        List list;
        C8931 c8931;
        C8931 c89312;
        C8931 c89313;
        C19503 m15358 = m15358(charSequence, c2569);
        list = m15358.f63034;
        c8931 = m15358.f63033;
        new C13255(charSequence, list, c8931, c2569).m32165(z, Math.max(1, Math.min(16, i)), c19012);
        if (c19012.length() > 1048576) {
            throw m15357(EnumC0451.LIMIT, "Formatted source length limit exceeded");
        }
        c2569.m8120();
        boolean z2 = c19012.length() == charSequence.length();
        for (int i2 = 0; z2 && i2 < charSequence.length(); i2++) {
            if ((i2 & 1023) == 0) {
                c2569.m8120();
            }
            z2 = c19012.charAt(i2) == charSequence.charAt(i2);
        }
        if (z2) {
            return;
        }
        try {
            C19503 m153582 = m15358(c19012, c2569);
            ArrayDeque arrayDeque = new ArrayDeque();
            ArrayDeque arrayDeque2 = new ArrayDeque();
            c89312 = m15358.f63033;
            arrayDeque.push(c89312);
            c89313 = m153582.f63033;
            arrayDeque2.push(c89313);
            while (!arrayDeque.isEmpty() && !arrayDeque2.isEmpty()) {
                c2569.m8120();
                InterfaceC16174 interfaceC16174 = (InterfaceC16174) arrayDeque.pop();
                InterfaceC16174 interfaceC161742 = (InterfaceC16174) arrayDeque2.pop();
                if (interfaceC16174 instanceof C8931) {
                    C8931 c89314 = (C8931) interfaceC16174;
                    if (interfaceC161742 instanceof C8931) {
                        C8931 c89315 = (C8931) interfaceC161742;
                        if (c89314.mo1085() != c89315.mo1085() || c89314.getChildCount() != c89315.getChildCount()) {
                            throw m15357(EnumC0451.CHANGED, "Syntax structure changed during formatting");
                        }
                        for (int childCount = c89314.getChildCount() - 1; childCount >= 0; childCount--) {
                            arrayDeque.push(c89314.mo23040(childCount));
                            arrayDeque2.push(c89315.mo23040(childCount));
                        }
                    }
                }
                if (interfaceC16174 instanceof InterfaceC4181) {
                    InterfaceC4181 interfaceC4181 = (InterfaceC4181) interfaceC16174;
                    if (interfaceC161742 instanceof InterfaceC4181) {
                        InterfaceC0463 mo12628 = interfaceC4181.mo12628();
                        InterfaceC0463 mo126282 = ((InterfaceC4181) interfaceC161742).mo12628();
                        if (mo12628.getType() != mo126282.getType() || (!m15361(mo12628.getType()) && !mo12628.getText().equals(mo126282.getText()))) {
                            throw m15357(EnumC0451.CHANGED, "Token content changed during formatting");
                        }
                    }
                }
                throw m15357(EnumC0451.CHANGED, "Syntax node changed during formatting");
            }
            if (arrayDeque.isEmpty() && arrayDeque2.isEmpty()) {
                c2569.m8120();
                return;
            }
            throw m15357(EnumC0451.CHANGED, "Syntax length changed");
        } catch (C18797 e) {
            if (e.f59329 != EnumC0451.SYNTAX) {
                throw e;
            }
            throw m15357(EnumC0451.CHANGED, "Formatted output could not be parsed: " + e.getMessage());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19503 m15358(CharSequence charSequence, C2569 c2569) {
        C20914 c20914 = new C20914();
        C9625 c9625 = new C9625(new C3980(new C11837(charSequence, new RunnableC6802(c2569)), c2569), c2569);
        c9625.m43458();
        c9625.m43456(c20914);
        C8919 c8919 = new C8919(c9625, c2569);
        c8919.m6206();
        C15973 c15973 = new C15973(c8919, c2569);
        c15973.m43458();
        c15973.m43456(c20914);
        return new C19503(c8919.m6210(), c15973.m4139());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18797 m15357(EnumC0451 enumC0451, String str) {
        return new C18797(enumC0451, 1, 0, str);
    }
}
