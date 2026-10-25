package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: X93U */
/* renamed from: l.ۘᩴۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC4121 extends AbstractC8709 implements Serializable {
    public static boolean alwaysUseFieldBuilders = false;
    public static final long serialVersionUID = 1;
    public C9249 unknownFields;

    public abstract C9766 internalGetFieldAccessorTable();

    public AbstractC4121() {
        this.unknownFields = C9249.m23740();
    }

    public AbstractC4121(AbstractC19916 abstractC19916) {
        this.unknownFields = abstractC19916.getUnknownFields();
    }

    @Override // l.InterfaceC8522
    public InterfaceC12050 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m12402() {
        m12393(true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12393(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    @Override // l.InterfaceC3583, l.InterfaceC8060
    public C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = internalGetFieldAccessorTable().f29543;
        return c17757;
    }

    @Deprecated
    public void mergeFromAndMakeImmutableInternal(AbstractC7297 abstractC7297, C17798 c17798) {
        C11345 m28053 = C11345.m28053();
        m28053.getClass();
        InterfaceC9374 m28054 = m28053.m28054(getClass());
        try {
            m28054.mo24201(this, C2067.m6756(abstractC7297), c17798);
            m28054.mo24198((Object) this);
        } catch (C2025 e) {
            e.m6587(this);
            throw e;
        } catch (IOException e2) {
            C2025 c2025 = new C2025(e2.getMessage(), e2);
            c2025.m6587(this);
            throw c2025;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map m12369(boolean z) {
        C17757 c17757;
        TreeMap treeMap = new TreeMap();
        c17757 = internalGetFieldAccessorTable().f29543;
        List fields = c17757.getFields();
        int i = 0;
        while (i < fields.size()) {
            C0117 c0117 = (C0117) fields.get(i);
            C14934 m1139 = c0117.m1139();
            if (m1139 != null) {
                i += m1139.m35390() - 1;
                if (hasOneof(m1139)) {
                    c0117 = getOneofFieldDescriptor(m1139);
                    if (!z && c0117.m1138() == EnumC18463.STRING) {
                        treeMap.put(c0117, getFieldRaw(c0117));
                    } else {
                        treeMap.put(c0117, getField(c0117));
                    }
                    i++;
                } else {
                    i++;
                }
            } else {
                if (c0117.mo1129()) {
                    List list = (List) getField(c0117);
                    if (!list.isEmpty()) {
                        treeMap.put(c0117, list);
                    }
                } else {
                    if (!hasField(c0117)) {
                    }
                    if (!z) {
                    }
                    treeMap.put(c0117, getField(c0117));
                }
                i++;
            }
        }
        return treeMap;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public boolean isInitialized() {
        for (C0117 c0117 : getDescriptorForType().getFields()) {
            if (c0117.m1128() && !hasField(c0117)) {
                return false;
            }
            if (c0117.m1138() == EnumC18463.MESSAGE) {
                if (c0117.mo1129()) {
                    Iterator it = ((List) getField(c0117)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC23338) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c0117) && !((InterfaceC23338) getField(c0117)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // l.InterfaceC3583
    public Map getAllFields() {
        return C20195.unmodifiableMap(m12369(false));
    }

    public Map getAllFieldsRaw() {
        return C20195.unmodifiableMap(m12369(true));
    }

    @Override // l.AbstractC8709
    public boolean hasOneof(C14934 c14934) {
        return C9766.m24772(internalGetFieldAccessorTable(), c14934).mo32611(this);
    }

    @Override // l.AbstractC8709
    public C0117 getOneofFieldDescriptor(C14934 c14934) {
        return C9766.m24772(internalGetFieldAccessorTable(), c14934).mo32608(this);
    }

    @Override // l.InterfaceC3583
    public boolean hasField(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16291(this);
    }

    @Override // l.InterfaceC3583
    public Object getField(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16282(this);
    }

    public Object getFieldRaw(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16292(this);
    }

    public int getRepeatedFieldCount(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16295(this);
    }

    public Object getRepeatedField(C0117 c0117, int i) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16281(i, this);
    }

    @Override // l.InterfaceC3583
    public C9249 getUnknownFields() {
        return this.unknownFields;
    }

    public void setUnknownFields(C9249 c9249) {
        this.unknownFields = c9249;
    }

    public boolean parseUnknownField(AbstractC7297 abstractC7297, C14186 c14186, C17798 c17798, int i) {
        abstractC7297.getClass();
        return c14186.m33843(i, abstractC7297);
    }

    public boolean parseUnknownFieldProto3(AbstractC7297 abstractC7297, C14186 c14186, C17798 c17798, int i) {
        return parseUnknownField(abstractC7297, c14186, c17798, i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m12390(InterfaceC12050 interfaceC12050, InputStream inputStream) {
        try {
            return (InterfaceC23338) interfaceC12050.parseFrom(inputStream);
        } catch (C2025 e) {
            throw e.m6586();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m12391(InterfaceC12050 interfaceC12050, InputStream inputStream, C17798 c17798) {
        try {
            return (InterfaceC23338) interfaceC12050.parseFrom(inputStream, c17798);
        } catch (C2025 e) {
            throw e.m6586();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m12378(InterfaceC12050 interfaceC12050, AbstractC7297 abstractC7297) {
        try {
            return (InterfaceC23338) interfaceC12050.parseFrom(abstractC7297);
        } catch (C2025 e) {
            throw e.m6586();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m12379(InterfaceC12050 interfaceC12050, AbstractC7297 abstractC7297, C17798 c17798) {
        try {
            return (InterfaceC23338) interfaceC12050.parseFrom(abstractC7297, c17798);
        } catch (C2025 e) {
            throw e.m6586();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m12376(InterfaceC12050 interfaceC12050, InputStream inputStream) {
        try {
            return (InterfaceC23338) interfaceC12050.parseDelimitedFrom(inputStream);
        } catch (C2025 e) {
            throw e.m6586();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m12377(InterfaceC12050 interfaceC12050, InputStream inputStream, C17798 c17798) {
        try {
            return (InterfaceC23338) interfaceC12050.parseDelimitedFrom(inputStream, c17798);
        } catch (C2025 e) {
            throw e.m6586();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m12385() {
        return C21244.m48250() && C21244.m48247();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6237 m12398() {
        return C22465.m50403();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC11882 m12394() {
        return C5553.m15707();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10471 m12399() {
        return C7920.m21205();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC4826 m12396() {
        return C19875.m45707();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC20349 m12389() {
        return C5181.m14934();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23170 m12374(InterfaceC23170 interfaceC23170) {
        return m12375(interfaceC23170, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23170 m12375(InterfaceC23170 interfaceC23170, int i) {
        int size = interfaceC23170.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return interfaceC23170.mo8473(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23170 m12373(Class cls) {
        return C22633.m50636();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public void writeTo(AbstractC14766 abstractC14766) {
        C7816.m20898(this, getAllFieldsRaw(), abstractC14766);
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int m20893 = C7816.m20893(this, getAllFieldsRaw());
        this.memoizedSize = m20893;
        return m20893;
    }

    public Object newInstance(C2710 c2710) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16114 m12372(InterfaceC23338 interfaceC23338, int i, Class cls, InterfaceC23338 interfaceC233382) {
        return new C16114(new C14975(interfaceC23338, i), cls, interfaceC233382, EnumC9997.IMMUTABLE);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16114 m12371(Class cls, InterfaceC23338 interfaceC23338) {
        return new C16114(null, cls, interfaceC23338, EnumC9997.IMMUTABLE);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method m12387(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m12386(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new IllegalStateException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public AbstractC1466 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C14018 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public Object writeReplace() {
        return new C15408(this);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC5763 m12388(AbstractC11408 abstractC11408) {
        if (abstractC11408.mo16211()) {
            throw new IllegalArgumentException("Expected non-lite extension.");
        }
        return (AbstractC5763) abstractC11408;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m12401(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        return ((AbstractC5886) obj).size() == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m12365(int i, Object obj) {
        if (obj instanceof String) {
            return AbstractC14766.m35070((String) obj) + AbstractC14766.m35073(i);
        }
        return AbstractC14766.m35076(i, (AbstractC5886) obj);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m12395(Object obj) {
        if (!(obj instanceof String)) {
            int i = AbstractC14766.f45086;
            int size = ((AbstractC5886) obj).size();
            return AbstractC14766.m35083(size) + size;
        }
        return AbstractC14766.m35070((String) obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12380(AbstractC14766 abstractC14766, int i, Object obj) {
        if (obj instanceof String) {
            abstractC14766.mo35089(i, (String) obj);
        } else {
            abstractC14766.mo35090(i, (AbstractC5886) obj);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12381(AbstractC14766 abstractC14766, Object obj) {
        if (obj instanceof String) {
            abstractC14766.mo35096((String) obj);
        } else {
            abstractC14766.mo35098((AbstractC5886) obj);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m12392(AbstractC14766 abstractC14766, C14018 c14018, C20370 c20370, int i) {
        Map m33617 = c14018.m33617();
        abstractC14766.getClass();
        m12382(abstractC14766, m33617, c20370, i);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m12397(AbstractC14766 abstractC14766, C14018 c14018, C20370 c20370, int i) {
        Map m33617 = c14018.m33617();
        abstractC14766.getClass();
        m12382(abstractC14766, m33617, c20370, i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m12400(AbstractC14766 abstractC14766, C14018 c14018, C20370 c20370, int i) {
        Map m33617 = c14018.m33617();
        abstractC14766.getClass();
        m12382(abstractC14766, m33617, c20370, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12384(AbstractC14766 abstractC14766, C14018 c14018, C20370 c20370, int i) {
        Map m33617 = c14018.m33617();
        abstractC14766.getClass();
        m12382(abstractC14766, m33617, c20370, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12383(AbstractC14766 abstractC14766, Map map, C20370 c20370, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            c20370.getClass();
            throw null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12382(AbstractC14766 abstractC14766, Map map, C20370 c20370, int i) {
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            c20370.getClass();
            throw null;
        }
    }
}
