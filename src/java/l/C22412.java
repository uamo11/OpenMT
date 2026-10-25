package l;

/* compiled from: X1G7 */
/* renamed from: l.᩹ܽܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22412 implements InterfaceC0345, InterfaceC21830 {
    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public void mo3430(InterfaceC9505 interfaceC9505) {
    }

    @Override // l.InterfaceC21830
    /* renamed from: ܳ */
    public void mo3431() {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50341(String str) {
        System.out.println(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x010a, code lost:
    
        if (l.C6075.m16981(r5) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0111, code lost:
    
        if (l.C6075.m16981(r5) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a7, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0118, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012e, code lost:
    
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ed  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m50337(int r17, java.lang.CharSequence r18) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22412.m50337(int, java.lang.CharSequence):int");
    }

    @Override // l.InterfaceC21830
    /* renamed from: ֫ */
    public InterfaceC19383 mo3429(int i, int i2) {
        return new C19714();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50342(InterfaceC9167 interfaceC9167, AbstractC11347 abstractC11347) {
        int i = 0;
        AbstractC11347 abstractC113472 = abstractC11347;
        while (abstractC113472 != null) {
            AbstractC11347 m28085 = abstractC113472.m28085();
            int mo10981 = m28085 != null ? m28085.mo10981() : 0;
            AbstractC11347 m28093 = abstractC113472.m28093();
            interfaceC9167.mo16112(abstractC113472, i);
            if (m28085 != null && !abstractC113472.m28094()) {
                if (mo10981 == m28085.mo10981()) {
                    abstractC113472 = m28085.m28087(abstractC113472.m28092());
                } else if (m28093 == null) {
                    i--;
                    abstractC113472 = m28085;
                } else {
                    abstractC113472 = m28093;
                }
            }
            if (abstractC113472.mo10981() > 0) {
                abstractC113472 = abstractC113472.m28087(0);
                i++;
            } else {
                while (abstractC113472.m28093() == null && i > 0) {
                    interfaceC9167.mo16111(abstractC113472, i);
                    abstractC113472 = abstractC113472.m28085();
                    i--;
                }
                interfaceC9167.mo16111(abstractC113472, i);
                if (abstractC113472 == abstractC11347) {
                    return;
                } else {
                    abstractC113472 = abstractC113472.m28093();
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static IndexOutOfBoundsException m50343(int i, int i2) {
        return new IndexOutOfBoundsException(C18307.m42646("index=", i, i2, ", length="));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC2808 m50338(InterfaceC16233 interfaceC16233, InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC16233, "<this>");
        C11233.m27805(interfaceC11791, "completion");
        if (interfaceC16233 instanceof AbstractC2808) {
            throw new UnsupportedOperationException("create(Continuation) has not been overridden");
        }
        InterfaceC14801 context = interfaceC11791.getContext();
        return context == C23974.f77731 ? new C21153(interfaceC16233, interfaceC11791) : new C9864(interfaceC11791, context, interfaceC16233);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0102, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m50336(int r12, int r13, java.lang.CharSequence r14) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22412.m50336(int, int, java.lang.CharSequence):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC11791 m50340(InterfaceC19763 interfaceC19763, Object obj, InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC19763, "<this>");
        C11233.m27805(interfaceC11791, "completion");
        if (interfaceC19763 instanceof AbstractC2808) {
            return ((AbstractC2808) interfaceC19763).mo8682(obj, interfaceC11791);
        }
        InterfaceC14801 context = interfaceC11791.getContext();
        return context == C23974.f77731 ? new C9158(interfaceC19763, obj, interfaceC11791) : new C16212(interfaceC11791, context, interfaceC19763, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC11791 m50339(InterfaceC11791 interfaceC11791) {
        C11233.m27805(interfaceC11791, "<this>");
        AbstractC19036 abstractC19036 = interfaceC11791 instanceof AbstractC19036 ? (AbstractC19036) interfaceC11791 : null;
        return abstractC19036 != null ? abstractC19036.m43887() : interfaceC11791;
    }
}
