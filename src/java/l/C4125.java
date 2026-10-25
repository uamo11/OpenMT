package l;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: 640U */
/* renamed from: l.ۘᩴ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4125 implements Iterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ClassLoader f13080;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC21848 f13081;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22364 f13082;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Iterator f13083;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f13083;
        if (this.f13081 != null) {
            return true;
        }
        if (it.hasNext()) {
            String str = (String) it.next();
            C22364 c22364 = this.f13082;
            InterfaceC21848 interfaceC21848 = null;
            try {
                try {
                    try {
                        try {
                            Class<?> loadClass = this.f13080.loadClass(str);
                            m12403(loadClass);
                            interfaceC21848 = (InterfaceC21848) loadClass.getConstructor(null).newInstance(null);
                        } catch (ClassCastException unused) {
                            C12281 c12281 = C6241.f19132;
                            c22364.m7276(new C12281("compiler", "proc.processor.wrong.type", str));
                        }
                    } catch (ClassNotFoundException unused2) {
                        C12281 c122812 = C6241.f19132;
                        c22364.m7276(new C12281("compiler", "proc.processor.not.found", str));
                    }
                } catch (Exception unused3) {
                    C12281 c122813 = C6241.f19132;
                    c22364.m7276(new C12281("compiler", "proc.processor.cant.instantiate", str));
                }
                if (interfaceC21848 != null) {
                    this.f13081 = interfaceC21848;
                    return true;
                }
            } catch (Throwable th) {
                throw new C11181(th);
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            InterfaceC21848 interfaceC21848 = this.f13081;
            this.f13081 = null;
            return interfaceC21848;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12403(Class cls) {
        try {
            Method method = Class.class.getMethod("getModule", null);
            Object invoke = method.invoke(C4125.class, null);
            Object invoke2 = method.invoke(cls, null);
            Class<?> returnType = method.getReturnType();
            returnType.getMethod("addReads", returnType).invoke(invoke, invoke2);
        } catch (NoSuchMethodException unused) {
        } catch (Exception e) {
            throw new C7877(e);
        }
    }
}
