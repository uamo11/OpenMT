package l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: P9QE */
/* renamed from: l.ۢ֨ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9249 implements InterfaceC8522 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C9249 f28022 = new C9249(new TreeMap());

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C20538 f28023 = new C20538();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28024 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TreeMap f28025;

    @Override // l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C9249(TreeMap treeMap, int i) {
        this(treeMap);
    }

    public C9249(TreeMap treeMap) {
        this.f28025 = treeMap;
    }

    @Override // l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return C14186.m33836();
    }

    @Override // l.InterfaceC8522
    public final InterfaceC9228 toBuilder() {
        C14186 m33836 = C14186.m33836();
        m33836.m33842(this);
        return m33836;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9249 m23740() {
        return f28022;
    }

    @Override // l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f28022;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9249) {
            return this.f28025.equals(((C9249) obj).f28025);
        }
        return false;
    }

    public final int hashCode() {
        TreeMap treeMap = this.f28025;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return treeMap.hashCode();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m23741() {
        return (Map) this.f28025.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m23744(int i) {
        return this.f28025.containsKey(Integer.valueOf(i));
    }

    @Override // l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        for (Map.Entry entry : this.f28025.entrySet()) {
            ((C6426) entry.getValue()).m17783(((Integer) entry.getKey()).intValue(), abstractC14766);
        }
    }

    public final String toString() {
        C10079 c10079;
        int i = C11490.f34303;
        c10079 = C10079.f30364;
        c10079.getClass();
        return C10079.m25325(this);
    }

    @Override // l.InterfaceC8522
    public final AbstractC5886 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC5886 abstractC5886 = AbstractC5886.f18080;
            C3064 c3064 = new C3064(serializedSize);
            writeTo(c3064.m9385());
            return c3064.m9384();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // l.InterfaceC8522
    public final byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC14766.f45086;
            C16883 c16883 = new C16883(bArr, serializedSize);
            writeTo(c16883);
            if (c16883.mo27812() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // l.InterfaceC8522
    public final int getSerializedSize() {
        TreeMap treeMap = this.f28025;
        int i = 0;
        if (!treeMap.isEmpty()) {
            for (Map.Entry entry : treeMap.entrySet()) {
                i += ((C6426) entry.getValue()).m17777(((Integer) entry.getKey()).intValue());
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23743(AbstractC14766 abstractC14766) {
        for (Map.Entry entry : this.f28025.entrySet()) {
            ((C6426) entry.getValue()).m17780(((Integer) entry.getKey()).intValue(), abstractC14766);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m23746(InterfaceC6633 interfaceC6633) {
        ((C23939) interfaceC6633).getClass();
        EnumC23566 enumC23566 = EnumC23566.ASCENDING;
        EnumC23566 enumC235662 = EnumC23566.DESCENDING;
        TreeMap treeMap = this.f28025;
        if (enumC23566 == enumC235662) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                ((C6426) entry.getValue()).m17779(((Integer) entry.getKey()).intValue(), interfaceC6633);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            ((C6426) entry2.getValue()).m17779(((Integer) entry2.getKey()).intValue(), interfaceC6633);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23742(InterfaceC6633 interfaceC6633) {
        ((C23939) interfaceC6633).getClass();
        EnumC23566 enumC23566 = EnumC23566.ASCENDING;
        EnumC23566 enumC235662 = EnumC23566.DESCENDING;
        TreeMap treeMap = this.f28025;
        if (enumC23566 == enumC235662) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                C6426.m17767((C6426) entry.getValue(), ((Integer) entry.getKey()).intValue(), interfaceC6633);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            C6426.m17767((C6426) entry2.getValue(), ((Integer) entry2.getKey()).intValue(), interfaceC6633);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m23745() {
        int i = 0;
        for (Map.Entry entry : this.f28025.entrySet()) {
            i += ((C6426) entry.getValue()).m17781(((Integer) entry.getKey()).intValue());
        }
        return i;
    }

    @Override // l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f28023;
    }
}
