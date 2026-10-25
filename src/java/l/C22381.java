package l;

import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.᩹ܺۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C22381 extends AbstractC12154 {
    public static final long serialVersionUID = 0;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f72528;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C22381 f72529;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public byte f72530;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C5969 f72531;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public List f72532;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f72533;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f72534;

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        C12859 c12859 = new C12859(this);
        if ((this.f72534 & 2) != 0) {
            abstractC14766.mo35093(33, this.f72533);
        }
        if ((this.f72534 & 1) != 0) {
            abstractC14766.mo35104(34, m50253());
        }
        for (int i = 0; i < this.f72532.size(); i++) {
            abstractC14766.mo35104(EnumC3478.f11008, (InterfaceC8522) this.f72532.get(i));
        }
        c12859.m31295(536870912, abstractC14766);
        getUnknownFields().writeTo(abstractC14766);
    }

    static {
        C20663.m47279(EnumC6551.PUBLIC, C22381.class.getName());
        f72529 = new C22381();
        f72528 = new C15324();
    }

    public C22381(C21676 c21676) {
        super(c21676);
        this.f72533 = false;
        this.f72530 = (byte) -1;
    }

    public C22381() {
        this.f72533 = false;
        this.f72530 = (byte) -1;
        this.f72532 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32234;
        c9766.m24773(C22381.class, C21676.class);
        return c9766;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m50251() {
        return (this.f72534 & 1) != 0;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5969 m50253() {
        C5969 c5969 = this.f72531;
        return c5969 == null ? C5969.getDefaultInstance() : c5969;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m50250() {
        return (this.f72534 & 2) != 0;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m50252() {
        return this.f72533;
    }

    @Override // l.AbstractC12154, l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f72530;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!m50251() || m50253().isInitialized()) {
            for (int i = 0; i < this.f72532.size(); i++) {
                if (!((C1529) this.f72532.get(i)).isInitialized()) {
                    this.f72530 = (byte) 0;
                    return false;
                }
            }
            if (!m29574()) {
                this.f72530 = (byte) 0;
                return false;
            }
            this.f72530 = (byte) 1;
            return true;
        }
        this.f72530 = (byte) 0;
        return false;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int m35080 = (this.f72534 & 2) != 0 ? AbstractC14766.m35080(33) : 0;
        if ((this.f72534 & 1) != 0) {
            m35080 += AbstractC14766.m35082(34, m50253());
        }
        for (int i2 = 0; i2 < this.f72532.size(); i2++) {
            m35080 += AbstractC14766.m35082(EnumC3478.f11008, (InterfaceC8522) this.f72532.get(i2));
        }
        int serializedSize = getUnknownFields().getSerializedSize() + m35080 + m29577();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C22381)) {
            return super.equals(obj);
        }
        C22381 c22381 = (C22381) obj;
        if (m50251() != c22381.m50251()) {
            return false;
        }
        if ((!m50251() || m50253().equals(c22381.m50253())) && m50250() == c22381.m50250()) {
            return (!m50250() || this.f72533 == c22381.f72533) && this.f72532.equals(c22381.f72532) && getUnknownFields().equals(c22381.getUnknownFields()) && m29575().equals(c22381.m29575());
        }
        return false;
    }

    @Override // l.AbstractC8709
    public final int hashCode() {
        C17757 c17757;
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        c17757 = C10702.f32216;
        int hashCode = c17757.hashCode() + 779;
        if (m50251()) {
            hashCode = C4153.m12551(hashCode, 37, 34, 53) + m50253().hashCode();
        }
        if (m50250()) {
            hashCode = C4153.m12551(hashCode, 37, 33, 53) + C13997.m33481(this.f72533);
        }
        if (this.f72532.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, EnumC3478.f11008, 53) + this.f72532.hashCode();
        }
        int hashCode2 = getUnknownFields().hashCode() + (AbstractC8709.m22494(hashCode, m29575()) * 29);
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static C21676 newBuilder() {
        return f72529.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f72529.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f72529.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C21676 toBuilder() {
        int i = 0;
        if (this == f72529) {
            return new C21676(i);
        }
        C21676 c21676 = new C21676(i);
        c21676.m48944(this);
        return c21676;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C21676(interfaceC9415, 0);
    }

    public static C22381 getDefaultInstance() {
        return f72529;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f72528;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f72529;
    }

    @Override // l.AbstractC12154, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f72529;
    }
}
