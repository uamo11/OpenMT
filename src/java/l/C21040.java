package l;

import android.text.TextUtils;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* compiled from: 4BN4 */
/* renamed from: l.᩷ᩳۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21040 extends AbstractC2926 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public List f67884;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public Object f67885;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AbstractC14346 f67886;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public List f67887;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public List f67888;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f67889;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f67890;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public List f67891;

    public C21040() {
        List list = Collections.EMPTY_LIST;
        this.f67891 = list;
        this.f67888 = list;
        this.f67884 = list;
        this.f67887 = list;
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final void mo7983(C12366 c12366, CharSequence charSequence) {
        m8929(charSequence, new C3840(this, c12366));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static RunnableC7477 m47866(C21040 c21040, C12366 c12366, CharSequence charSequence, InterfaceC17066 interfaceC17066) {
        final String str;
        Iterator it;
        HashMap hashMap;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        C1323 m29937 = C12334.m29937(charSequence);
        final ArrayList arrayList5 = new ArrayList(1);
        final HashMap hashMap2 = new HashMap();
        hashMap2.put("AbstractMethodError", "java.lang.AbstractMethodError");
        hashMap2.put("Appendable", "java.lang.Appendable");
        hashMap2.put("ArithmeticException", "java.lang.ArithmeticException");
        hashMap2.put("ArrayIndexOutOfBoundsException", "java.lang.ArrayIndexOutOfBoundsException");
        hashMap2.put("ArrayStoreException", "java.lang.ArrayStoreException");
        hashMap2.put("AssertionError", "java.lang.AssertionError");
        hashMap2.put("AutoCloseable", "java.lang.AutoCloseable");
        hashMap2.put("Boolean", "java.lang.Boolean");
        hashMap2.put("BootstrapMethodError", "java.lang.BootstrapMethodError");
        hashMap2.put("Byte", "java.lang.Byte");
        hashMap2.put("Character", "java.lang.Character");
        hashMap2.put("CharSequence", "java.lang.CharSequence");
        hashMap2.put("Class", "java.lang.Class");
        hashMap2.put("ClassCastException", "java.lang.ClassCastException");
        hashMap2.put("ClassCircularityError", "java.lang.ClassCircularityError");
        hashMap2.put("ClassFormatError", "java.lang.ClassFormatError");
        hashMap2.put("ClassLoader", "java.lang.ClassLoader");
        hashMap2.put("ClassNotFoundException", "java.lang.ClassNotFoundException");
        hashMap2.put("Cloneable", "java.lang.Cloneable");
        hashMap2.put("CloneNotSupportedException", "java.lang.CloneNotSupportedException");
        hashMap2.put("Comparable", "java.lang.Comparable");
        hashMap2.put("Compiler", "java.lang.Compiler");
        hashMap2.put("Deprecated", "java.lang.Deprecated");
        hashMap2.put("Double", "java.lang.Double");
        hashMap2.put("Enum", "java.lang.Enum");
        hashMap2.put("EnumConstantNotPresentException", "java.lang.EnumConstantNotPresentException");
        hashMap2.put("Error", "java.lang.Error");
        hashMap2.put("Exception", "java.lang.Exception");
        hashMap2.put("ExceptionInInitializerError", "java.lang.ExceptionInInitializerError");
        hashMap2.put("Float", "java.lang.Float");
        hashMap2.put("FunctionalInterface", "java.lang.FunctionalInterface");
        hashMap2.put("IllegalAccessError", "java.lang.IllegalAccessError");
        hashMap2.put("IllegalAccessException", "java.lang.IllegalAccessException");
        hashMap2.put("IllegalArgumentException", "java.lang.IllegalArgumentException");
        hashMap2.put("IllegalMonitorStateException", "java.lang.IllegalMonitorStateException");
        hashMap2.put("IllegalStateException", "java.lang.IllegalStateException");
        hashMap2.put("IllegalThreadStateException", "java.lang.IllegalThreadStateException");
        hashMap2.put("IncompatibleClassChangeError", "java.lang.IncompatibleClassChangeError");
        hashMap2.put("IndexOutOfBoundsException", "java.lang.IndexOutOfBoundsException");
        hashMap2.put("InheritableThreadLocal", "java.lang.InheritableThreadLocal");
        hashMap2.put("InstantiationError", "java.lang.InstantiationError");
        hashMap2.put("InstantiationException", "java.lang.InstantiationException");
        hashMap2.put("Integer", "java.lang.Integer");
        hashMap2.put("InternalError", "java.lang.InternalError");
        hashMap2.put("InterruptedException", "java.lang.InterruptedException");
        hashMap2.put("Iterable", "java.lang.Iterable");
        hashMap2.put("LinkageError", "java.lang.LinkageError");
        hashMap2.put("Long", "java.lang.Long");
        hashMap2.put("Math", "java.lang.Math");
        hashMap2.put("NegativeArraySizeException", "java.lang.NegativeArraySizeException");
        hashMap2.put("NoClassDefFoundError", "java.lang.NoClassDefFoundError");
        hashMap2.put("NoSuchFieldError", "java.lang.NoSuchFieldError");
        hashMap2.put("NoSuchFieldException", "java.lang.NoSuchFieldException");
        hashMap2.put("NoSuchMethodError", "java.lang.NoSuchMethodError");
        hashMap2.put("NoSuchMethodException", "java.lang.NoSuchMethodException");
        hashMap2.put("NullPointerException", "java.lang.NullPointerException");
        hashMap2.put("Number", "java.lang.Number");
        hashMap2.put("NumberFormatException", "java.lang.NumberFormatException");
        hashMap2.put("Object", "java.lang.Object");
        hashMap2.put("OutOfMemoryError", "java.lang.OutOfMemoryError");
        hashMap2.put("Override", "java.lang.Override");
        hashMap2.put("Package", "java.lang.Package");
        hashMap2.put("Process", "java.lang.Process");
        hashMap2.put("ProcessBuilder", "java.lang.ProcessBuilder");
        hashMap2.put("Readable", "java.lang.Readable");
        hashMap2.put("ReflectiveOperationException", "java.lang.ReflectiveOperationException");
        hashMap2.put("Runnable", "java.lang.Runnable");
        hashMap2.put("Runtime", "java.lang.Runtime");
        hashMap2.put("RuntimeException", "java.lang.RuntimeException");
        hashMap2.put("RuntimePermission", "java.lang.RuntimePermission");
        hashMap2.put("SafeVarargs", "java.lang.SafeVarargs");
        hashMap2.put("SecurityException", "java.lang.SecurityException");
        hashMap2.put("SecurityManager", "java.lang.SecurityManager");
        hashMap2.put("Short", "java.lang.Short");
        hashMap2.put("StackOverflowError", "java.lang.StackOverflowError");
        hashMap2.put("StackTraceElement", "java.lang.StackTraceElement");
        hashMap2.put("StrictMath", "java.lang.StrictMath");
        hashMap2.put("String", "java.lang.String");
        hashMap2.put("StringBuffer", "java.lang.StringBuffer");
        hashMap2.put("StringBuilder", "java.lang.StringBuilder");
        hashMap2.put("StringIndexOutOfBoundsException", "java.lang.StringIndexOutOfBoundsException");
        hashMap2.put("SuppressWarnings", "java.lang.SuppressWarnings");
        hashMap2.put("System", "java.lang.System");
        hashMap2.put("Thread", "java.lang.Thread");
        hashMap2.put("ThreadDeath", "java.lang.ThreadDeath");
        hashMap2.put("ThreadGroup", "java.lang.ThreadGroup");
        hashMap2.put("ThreadLocal", "java.lang.ThreadLocal");
        hashMap2.put("Throwable", "java.lang.Throwable");
        hashMap2.put("TypeNotPresentException", "java.lang.TypeNotPresentException");
        hashMap2.put("UnknownError", "java.lang.UnknownError");
        hashMap2.put("UnsatisfiedLinkError", "java.lang.UnsatisfiedLinkError");
        hashMap2.put("UnsupportedClassVersionError", "java.lang.UnsupportedClassVersionError");
        hashMap2.put("UnsupportedOperationException", "java.lang.UnsupportedOperationException");
        hashMap2.put("VerifyError", "java.lang.VerifyError");
        hashMap2.put("VirtualMachineError", "java.lang.VirtualMachineError");
        hashMap2.put("Void", "java.lang.Void");
        Iterator it2 = m29937.f4738.iterator();
        while (it2.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it2.next();
            if (abstractC5144 instanceof C10643) {
                C6262 c6262 = (C6262) ((C10643) abstractC5144).f32021;
                hashMap2.put(c6262.f19395.toString(), c6262.toString());
            } else if (abstractC5144 instanceof C5557) {
                arrayList5.add(((C5557) abstractC5144).f17180.toString());
            }
        }
        if (m29937.m4615() == null) {
            str = "";
        } else {
            str = m29937.m4615().toString() + ".";
        }
        char c = '/';
        RunnableC7477 runnableC7477 = null;
        c12366.m30034(new InterfaceC7159() { // from class: l.ۧᩳۢ
            @Override // l.InterfaceC7159
            /* renamed from: ֫ */
            public final void mo19184(InterfaceC13508 interfaceC13508) {
                String mo31672 = ((C13071) interfaceC13508).mo31672();
                String str2 = str;
                String substring = mo31672.substring(str2.length());
                int indexOf = substring.indexOf(36);
                HashMap hashMap3 = hashMap2;
                if (indexOf == -1) {
                    hashMap3.put(substring, str2.concat(substring));
                    return;
                }
                String substring2 = substring.substring(0, indexOf);
                String substring3 = substring.substring(indexOf + 1);
                if (arrayList5.contains(substring2) && substring3.indexOf(36) == -1) {
                    hashMap3.put(substring3, str2 + substring2 + '$' + substring3);
                }
            }
        }, str.replace('.', '/'), false, (Predicate) null);
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            hashMap2.put(str2, str + str2);
        }
        Iterator it4 = m29937.f4738.iterator();
        while (it4.hasNext()) {
            AbstractC5144 abstractC51442 = (AbstractC5144) it4.next();
            if (interfaceC17066.mo1526()) {
                return runnableC7477;
            }
            if (abstractC51442 instanceof C5557) {
                C5557 c5557 = (C5557) abstractC51442;
                C8839 c8839 = new C8839();
                c8839.f26917 = c5557.f17180.toString();
                StringBuilder sb = new StringBuilder("L");
                sb.append(str.replace('.', c));
                c8839.f26919 = C9045.m23341(sb, c8839.f26917, l.b);
                int m19455 = C7260.m19455(c5557);
                c8839.f26918 = m19455;
                int indexOf = TextUtils.indexOf(charSequence, '\n', m19455 + 1);
                c8839.f26916 = indexOf;
                if (indexOf == -1) {
                    c8839.f26916 = charSequence.length();
                }
                arrayList.add(c8839);
                Iterator it5 = c5557.f17179.iterator();
                while (it5.hasNext()) {
                    AbstractC5144 abstractC51443 = (AbstractC5144) it5.next();
                    if (abstractC51443 instanceof C9378) {
                        C9378 c9378 = (C9378) abstractC51443;
                        C14482 c14482 = new C14482();
                        c14482.f44373 = c9378.f28484.toString();
                        c14482.f44370 = m47865(hashMap2, c9378.f28488);
                        c14482.f44369 = c8839.f26919;
                        AbstractC12612 abstractC12612 = c9378.f28487;
                        if (abstractC12612 instanceof C23342) {
                            c14482.f44374 = abstractC12612.toString();
                        }
                        c14482.f44371 = (c9378.f28486.f7169 & 8) != 0;
                        c14482.f44372 = C7260.m19455(c9378);
                        c14482.f44368 = C7260.m19431(c9378, m29937.f4743);
                        arrayList3.add(c14482);
                        it = it4;
                        hashMap = hashMap2;
                    } else if (abstractC51443 instanceof C8526) {
                        C8526 c8526 = (C8526) abstractC51443;
                        C23655 c23655 = new C23655();
                        c23655.f76634 = c8526.f26044.toString();
                        c23655.f76633 = m47865(hashMap2, c8526.f26051);
                        c23655.f76632 = c8839.f26919;
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it6 = c8526.f26048.iterator();
                        while (it6.hasNext()) {
                            sb2.append(m47865(hashMap2, ((C9378) it6.next()).f28488));
                            it4 = it4;
                        }
                        it = it4;
                        hashMap = hashMap2;
                        Set m45151 = C19642.m45151(c8526.f26046.f7169);
                        c23655.f76635 = (m45151.contains(EnumC2113.f7055) || m45151.contains(EnumC2113.f7061) || c23655.f76634.equals("<init>")) ? false : true;
                        c23655.f76629 = sb2.toString();
                        c23655.f76631 = C7260.m19455(c8526);
                        c23655.f76630 = C7260.m19431(c8526, m29937.f4743);
                        arrayList2.add(c23655);
                    } else {
                        it = it4;
                        hashMap = hashMap2;
                        if (abstractC51443 instanceof C2735) {
                            C2735 c2735 = (C2735) abstractC51443;
                            C23655 c236552 = new C23655();
                            c236552.f76634 = "<clinit>";
                            c236552.f76633 = "V";
                            c236552.f76629 = "";
                            c236552.f76632 = c8839.f26919;
                            c236552.f76635 = false;
                            c236552.f76631 = C7260.m19455(c2735);
                            c236552.f76630 = C7260.m19431(c2735, m29937.f4743);
                            arrayList2.add(c236552);
                        }
                    }
                    c = '/';
                    it4 = it;
                    hashMap2 = hashMap;
                }
                runnableC7477 = null;
            }
        }
        new C18217(m29937, charSequence, arrayList4).mo1367(m29937);
        return new RunnableC7477(c21040, arrayList, arrayList2, arrayList3, arrayList4, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47867(C21040 c21040, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        c21040.f67891 = C20195.unmodifiableList(arrayList);
        c21040.f67888 = C20195.unmodifiableList(arrayList2);
        c21040.f67884 = C20195.unmodifiableList(arrayList3);
        c21040.f67887 = C20195.unmodifiableList(arrayList4);
        ?? r1 = c21040.f67886;
        if (r1 != 0) {
            c21040.m47869(c21040.f67890, c21040.f67889, r1);
        }
        InterfaceC6722 interfaceC6722 = c21040.f7936;
        if (interfaceC6722 != null) {
            interfaceC6722.mo18292(c21040.f67891, c21040.f67888, c21040.f67884, c21040.f67887);
        }
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final Object mo7979() {
        if (m8931()) {
            return this.f67885;
        }
        return null;
    }

    @Override // l.AbstractC2489
    /* renamed from: ֫ */
    public final void mo7980(final int i, final int i2, final InterfaceC20834 interfaceC20834) {
        m8930(new Runnable(interfaceC20834, i, i2) { // from class: l.֫ᩳۢ

            /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f6662;

            /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ int f6663;

            /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
            public final /* synthetic */ AbstractC14346 f6665;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f6665 = (AbstractC14346) interfaceC20834;
                this.f6663 = i;
                this.f6662 = i2;
            }

            /* JADX WARN: Type inference failed for: r3v0, types: [l.ܳۛ᩷, l.᩷ۧۢ] */
            @Override // java.lang.Runnable
            public final void run() {
                C21040.m47868(C21040.this, (InterfaceC20834) this.f6665, this.f6663, this.f6662);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m47868(C21040 c21040, InterfaceC20834 interfaceC20834, int i, int i2) {
        c21040.f67886 = (AbstractC14346) interfaceC20834;
        c21040.f67890 = i;
        c21040.f67889 = i2;
        if (c21040.m8931()) {
            c21040.m47869(i, i2, interfaceC20834);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47869(int i, int i2, InterfaceC20834 interfaceC20834) {
        int i3;
        int i4;
        int i5;
        this.f67885 = null;
        for (C8839 c8839 : this.f67891) {
            int i6 = c8839.f26918;
            if (i >= i6 && i <= (i5 = c8839.f26916)) {
                if (i2 < i6 || i2 > i5) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f67885 = c8839;
                    interfaceC20834.mo17422(-1, -1, c8839.f26917);
                    return;
                }
            }
        }
        for (C14482 c14482 : this.f67884) {
            int i7 = c14482.f44372;
            if (i >= i7 && i <= (i4 = c14482.f44368)) {
                if (i2 < i7 || i2 > i4) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f67885 = c14482;
                    interfaceC20834.mo17422(-1, -1, c14482.f44373);
                    return;
                }
            }
        }
        for (C23655 c23655 : this.f67888) {
            int i8 = c23655.f76631;
            if (i >= i8 && i <= (i3 = c23655.f76630)) {
                if (i2 < i8 || i2 > i3) {
                    interfaceC20834.mo17422(0, 0, null);
                    return;
                } else {
                    this.f67885 = c23655;
                    interfaceC20834.mo17422(c23655.f76631, c23655.f76630, C9045.m23341(new StringBuilder(), c23655.f76634, "()"));
                    return;
                }
            }
        }
        interfaceC20834.mo17422(0, 0, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m47865(HashMap hashMap, AbstractC12612 abstractC12612) {
        if (abstractC12612 == null) {
            return "V";
        }
        if (abstractC12612 instanceof C2882) {
            C2882 c2882 = (C2882) abstractC12612;
            switch (C16805.f51592[c2882.f9190.ordinal()]) {
                case 1:
                    return "Z";
                case 2:
                    return "B";
                case 3:
                    return "S";
                case 4:
                    return "I";
                case 5:
                    return "J";
                case 6:
                    return "C";
                case 7:
                    return "F";
                case 8:
                    return "D";
                case 9:
                    return "V";
                default:
                    throw new RuntimeException("unknown primitive type " + c2882);
            }
        }
        if (!(abstractC12612 instanceof C7673) && !(abstractC12612 instanceof C6262)) {
            if (abstractC12612 instanceof C23901) {
                return "[" + m47865(hashMap, ((C23901) abstractC12612).f77274);
            }
            if (abstractC12612 instanceof C16432) {
                return m47865(hashMap, ((C16432) abstractC12612).f50542);
            }
            if (abstractC12612 instanceof C3440) {
                return "<error>";
            }
            throw new RuntimeException("unknown type " + abstractC12612.getClass().getSimpleName() + " " + abstractC12612);
        }
        String abstractC5144 = abstractC12612.toString();
        int indexOf = abstractC5144.indexOf(46);
        if (indexOf == -1) {
            String str = (String) C13843.getOrDefault(hashMap, abstractC5144, abstractC5144);
            C11003.requireNonNull(str);
            return "L" + str.replace('.', '/') + l.b;
        }
        String substring = abstractC5144.substring(0, indexOf);
        if (((String) hashMap.get(substring)) == null) {
            return "L" + abstractC5144.replace('.', '/') + l.b;
        }
        StringBuilder m15339 = C5368.m15339(substring);
        m15339.append(abstractC5144.substring(indexOf).replace('.', '$'));
        return "L" + m15339.toString().replace('.', '/') + l.b;
    }
}
