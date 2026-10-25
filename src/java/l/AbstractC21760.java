package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: D9PY */
/* renamed from: l.᩸ᩴۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC21760 extends AbstractC3770 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC10942 f69726 = new ConcurrentMapC10942();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69727 = -1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C8543 f69728 = C8543.m22235();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object m49080();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49081() {
        return (this.f69727 & Integer.MIN_VALUE) != 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49082() {
        this.f69727 &= Integer.MAX_VALUE;
    }

    @Override // l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
        return (InterfaceC12050) m49080();
    }

    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public InterfaceC8522 getDefaultInstanceForType() {
        EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC21760) m49080();
    }

    @Override // l.InterfaceC8522
    public InterfaceC9228 newBuilderForType() {
        EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
        return (AbstractC19644) m49080();
    }

    public final String toString() {
        return C2172.m7185(this, super.toString());
    }

    public final int hashCode() {
        if (m49081()) {
            C11345 m28053 = C11345.m28053();
            m28053.getClass();
            return m28053.m28054(getClass()).mo24196(this);
        }
        if (this.memoizedHashCode == 0) {
            C11345 m280532 = C11345.m28053();
            m280532.getClass();
            this.memoizedHashCode = m280532.m28054(getClass()).mo24196(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11345 m28053 = C11345.m28053();
        m28053.getClass();
        return m28053.m28054(getClass()).mo24202(this, (AbstractC21760) obj);
    }

    @Override // l.InterfaceC8522
    public final AbstractC19644 toBuilder() {
        EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
        ((AbstractC19644) m49080()).getClass();
        throw null;
    }

    @Override // l.AbstractC3770
    public final int getMemoizedSerializedSize() {
        return this.f69727 & Integer.MAX_VALUE;
    }

    @Override // l.AbstractC3770
    public final void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            throw new IllegalStateException(C19370.m44628(i, "serialized size must be non-negative, was "));
        }
        this.f69727 = (i & Integer.MAX_VALUE) | (this.f69727 & Integer.MIN_VALUE);
    }

    @Override // l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C11345 m28053 = C11345.m28053();
        m28053.getClass();
        m28053.m28054(getClass()).mo24200((Object) this, (InterfaceC6633) C23939.m52727(abstractC14766));
    }

    @Override // l.AbstractC3770
    public final int getSerializedSize(InterfaceC9374 interfaceC9374) {
        int mo24195;
        int mo241952;
        if (m49081()) {
            if (interfaceC9374 == null) {
                C11345 m28053 = C11345.m28053();
                m28053.getClass();
                mo241952 = m28053.m28054(getClass()).mo24195((AbstractC3770) this);
            } else {
                mo241952 = interfaceC9374.mo24195((AbstractC3770) this);
            }
            if (mo241952 >= 0) {
                return mo241952;
            }
            throw new IllegalStateException(C19370.m44628(mo241952, "serialized size must be non-negative, was "));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (interfaceC9374 == null) {
            C11345 m280532 = C11345.m28053();
            m280532.getClass();
            mo24195 = m280532.m28054(getClass()).mo24195((AbstractC3770) this);
        } else {
            mo24195 = interfaceC9374.mo24195((AbstractC3770) this);
        }
        setMemoizedSerializedSize(mo24195);
        return mo24195;
    }

    @Override // l.InterfaceC8522
    public final int getSerializedSize() {
        return getSerializedSize(null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC21760 m49079(Class cls) {
        ConcurrentMapC10942 concurrentMapC10942 = f69726;
        AbstractC21760 abstractC21760 = (AbstractC21760) concurrentMapC10942.get(cls);
        if (abstractC21760 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC21760 = (AbstractC21760) concurrentMapC10942.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC21760 != null) {
            return abstractC21760;
        }
        AbstractC21760 abstractC217602 = (AbstractC21760) C21244.m48220(cls);
        abstractC217602.getClass();
        EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
        AbstractC21760 abstractC217603 = (AbstractC21760) abstractC217602.m49080();
        if (abstractC217603 == null) {
            throw new IllegalStateException();
        }
        concurrentMapC10942.put(cls, abstractC217603);
        return abstractC217603;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m49078(Method method, AbstractC21760 abstractC21760, Object... objArr) {
        try {
            return method.invoke(abstractC21760, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    @Override // l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        EnumC8354 enumC8354 = EnumC8354.GET_MEMOIZED_IS_INITIALIZED;
        byte byteValue = ((Byte) m49080()).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C11345 m28053 = C11345.m28053();
        m28053.getClass();
        boolean mo24203 = m28053.m28054(getClass()).mo24203(this);
        m49080();
        return mo24203;
    }
}
