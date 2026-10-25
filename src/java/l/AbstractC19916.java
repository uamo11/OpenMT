package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: X93U */
/* renamed from: l.᩶ۘۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC19916 extends AbstractC20704 {
    public InterfaceC9415 builderParent;
    public boolean isClean;
    public C22032 meAsParent;
    public Object unknownFieldsOrBuilder;

    public abstract C9766 internalGetFieldAccessorTable();

    public AbstractC19916() {
        this(null);
    }

    public AbstractC19916(InterfaceC9415 interfaceC9415) {
        this.unknownFieldsOrBuilder = C9249.m23740();
        this.builderParent = interfaceC9415;
    }

    @Override // l.AbstractC20704
    public void dispose() {
        this.builderParent = null;
    }

    public void onBuilt() {
        if (this.builderParent != null) {
            markClean();
        }
    }

    @Override // l.AbstractC20704
    public void markClean() {
        this.isClean = true;
    }

    public boolean isClean() {
        return this.isClean;
    }

    @Override // l.AbstractC20704, l.AbstractC2359
    /* renamed from: clone */
    public AbstractC19916 mo7670clone() {
        AbstractC19916 abstractC19916 = (AbstractC19916) getDefaultInstanceForType().newBuilderForType();
        abstractC19916.mergeFrom(buildPartial());
        return abstractC19916;
    }

    @Override // l.AbstractC20704
    /* renamed from: clear, reason: merged with bridge method [inline-methods] */
    public AbstractC19916 clear() {
        this.unknownFieldsOrBuilder = C9249.m23740();
        onChanged();
        return this;
    }

    public C17757 getDescriptorForType() {
        C17757 c17757;
        c17757 = internalGetFieldAccessorTable().f29543;
        return c17757;
    }

    public Map getAllFields() {
        return C20195.unmodifiableMap(m45833());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map m45833() {
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
                    treeMap.put(c0117, getField(c0117));
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
                    treeMap.put(c0117, getField(c0117));
                }
                i++;
            }
        }
        return treeMap;
    }

    public InterfaceC14165 newBuilderForField(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16283();
    }

    @Override // l.AbstractC20704, l.InterfaceC14165
    public InterfaceC14165 getFieldBuilder(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16296(this);
    }

    @Override // l.AbstractC20704
    public InterfaceC14165 getRepeatedFieldBuilder(C0117 c0117, int i) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16284(this, i);
    }

    @Override // l.AbstractC20704
    public boolean hasOneof(C14934 c14934) {
        return C9766.m24772(internalGetFieldAccessorTable(), c14934).mo32612(this);
    }

    @Override // l.AbstractC20704
    public C0117 getOneofFieldDescriptor(C14934 c14934) {
        return C9766.m24772(internalGetFieldAccessorTable(), c14934).mo32610(this);
    }

    public boolean hasField(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16293(this);
    }

    public Object getField(C0117 c0117) {
        Object mo16288 = C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16288(this);
        return c0117.mo1129() ? C20195.unmodifiableList((List) mo16288) : mo16288;
    }

    @Override // l.InterfaceC14165
    public AbstractC19916 setField(C0117 c0117, Object obj) {
        C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16287(this, obj);
        return this;
    }

    @Override // l.InterfaceC14165
    public AbstractC19916 clearField(C0117 c0117) {
        C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16285(this);
        return this;
    }

    @Override // l.AbstractC20704
    public AbstractC19916 clearOneof(C14934 c14934) {
        C9766.m24772(internalGetFieldAccessorTable(), c14934).mo32609(this);
        return this;
    }

    public int getRepeatedFieldCount(C0117 c0117) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16294(this);
    }

    public Object getRepeatedField(C0117 c0117, int i) {
        return C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16289(this, i);
    }

    @Override // 
    public AbstractC19916 setRepeatedField(C0117 c0117, int i, Object obj) {
        C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16286(this, i, obj);
        return this;
    }

    @Override // l.InterfaceC14165
    public AbstractC19916 addRepeatedField(C0117 c0117, Object obj) {
        C9766.m24770(internalGetFieldAccessorTable(), c0117).mo16290(this, obj);
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC19916 m45835(C9249 c9249) {
        this.unknownFieldsOrBuilder = c9249;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC14165
    public AbstractC19916 setUnknownFields(C9249 c9249) {
        return m45835(c9249);
    }

    public AbstractC19916 setUnknownFieldsProto3(C9249 c9249) {
        return m45835(c9249);
    }

    @Override // l.AbstractC20704
    public AbstractC19916 mergeUnknownFields(C9249 c9249) {
        if (C9249.m23740().equals(c9249)) {
            return this;
        }
        if (C9249.m23740().equals(this.unknownFieldsOrBuilder)) {
            this.unknownFieldsOrBuilder = c9249;
            onChanged();
            return this;
        }
        getUnknownFieldSetBuilder().m33842(c9249);
        onChanged();
        return this;
    }

    @Override // l.InterfaceC15576, l.InterfaceC8060
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
    public final C9249 getUnknownFields() {
        Object obj = this.unknownFieldsOrBuilder;
        if (!(obj instanceof C9249)) {
            return ((C14186) obj).build();
        }
        return (C9249) obj;
    }

    public boolean parseUnknownField(AbstractC7297 abstractC7297, C17798 c17798, int i) {
        abstractC7297.getClass();
        return getUnknownFieldSetBuilder().m33843(i, abstractC7297);
    }

    public final void mergeUnknownLengthDelimitedField(int i, AbstractC5886 abstractC5886) {
        getUnknownFieldSetBuilder().m33839(i, abstractC5886);
    }

    public final void mergeUnknownVarintField(int i, int i2) {
        getUnknownFieldSetBuilder().m33838(i, i2);
    }

    @Override // l.AbstractC20704
    public C14186 getUnknownFieldSetBuilder() {
        Object obj = this.unknownFieldsOrBuilder;
        if (obj instanceof C9249) {
            C14186 m33836 = C14186.m33836();
            m33836.m33842((C9249) obj);
            this.unknownFieldsOrBuilder = m33836;
        }
        onChanged();
        return (C14186) this.unknownFieldsOrBuilder;
    }

    @Override // l.AbstractC20704
    public void setUnknownFieldSetBuilder(C14186 c14186) {
        this.unknownFieldsOrBuilder = c14186;
        onChanged();
    }

    public InterfaceC9415 getParentForChildren() {
        if (this.meAsParent == null) {
            this.meAsParent = new C22032(this);
        }
        return this.meAsParent;
    }

    public final void onChanged() {
        InterfaceC9415 interfaceC9415;
        if (!this.isClean || (interfaceC9415 = this.builderParent) == null) {
            return;
        }
        interfaceC9415.mo24254();
        this.isClean = false;
    }

    public AbstractC1466 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Deprecated
    public C14018 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public AbstractC1466 internalGetMutableMapFieldReflection(int i) {
        return internalGetMutableMapField(i);
    }

    @Deprecated
    public C14018 internalGetMutableMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }
}
