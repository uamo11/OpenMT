package l;

import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.ۤۡۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10182 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final C10182 f30584;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f30585;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public volatile Object f30586;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f30587;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f30588;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C7359 f30589;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C10387 f30590;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile Object f30591;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC6237 f30592;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile Object f30593;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f30594;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public byte f30595;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f30596;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f30597;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30598;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C2731 f30599;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC6237 f30600;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C10182.class.getName());
        f30584 = new C10182();
        f30585 = new C13003();
    }

    public C10182(C12298 c12298, int i) {
        super(c12298);
        this.f30591 = "";
        this.f30593 = "";
        this.f30599 = C2731.m8466();
        this.f30600 = AbstractC4121.m12398();
        this.f30592 = AbstractC4121.m12398();
        this.f30586 = "";
        this.f30597 = 0;
        this.f30595 = (byte) -1;
    }

    public C10182() {
        this.f30591 = "";
        this.f30593 = "";
        this.f30599 = C2731.m8466();
        this.f30600 = AbstractC4121.m12398();
        this.f30592 = AbstractC4121.m12398();
        this.f30586 = "";
        this.f30597 = 0;
        this.f30595 = (byte) -1;
        this.f30591 = "";
        this.f30593 = "";
        this.f30599 = C2731.m8466();
        this.f30600 = AbstractC4121.m12398();
        this.f30592 = AbstractC4121.m12398();
        List list = Collections.EMPTY_LIST;
        this.f30594 = list;
        this.f30588 = list;
        this.f30596 = list;
        this.f30587 = list;
        this.f30586 = "";
        this.f30597 = 0;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32259;
        c9766.m24773(C10182.class, C12298.class);
        return c9766;
    }

    public final boolean hasName() {
        return (this.f30598 & 1) != 0;
    }

    public final String getName() {
        Object obj = this.f30591;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String m16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f30591 = m16501;
        }
        return m16501;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m25575() {
        return (this.f30598 & 2) != 0;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m25567() {
        Object obj = this.f30593;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String m16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f30593 = m16501;
        }
        return m16501;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m25569() {
        return this.f30599.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m25565(int i) {
        return this.f30599.get(i);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m25580() {
        return this.f30600.size();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m25578(int i) {
        return this.f30600.getInt(i);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m25576() {
        return this.f30594.size();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20412 m25579(int i) {
        return (C20412) this.f30594.get(i);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m25572() {
        return this.f30588.size();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23233 m25573(int i) {
        return (C23233) this.f30588.get(i);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int m25581() {
        return this.f30596.size();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8270 m25574(int i) {
        return (C8270) this.f30596.get(i);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m25571() {
        return this.f30587.size();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20766 m25577(int i) {
        return (C20766) this.f30587.get(i);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m25570() {
        return (this.f30598 & 4) != 0;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C7359 m25566() {
        C7359 c7359 = this.f30589;
        return c7359 == null ? C7359.getDefaultInstance() : c7359;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m25583() {
        return (this.f30598 & 8) != 0;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C10387 m25563() {
        C10387 c10387 = this.f30590;
        return c10387 == null ? C10387.getDefaultInstance() : c10387;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m25584() {
        return (this.f30598 & 16) != 0;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m25568() {
        Object obj = this.f30586;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC5886 abstractC5886 = (AbstractC5886) obj;
        String m16501 = abstractC5886.m16501();
        if (abstractC5886.mo16500()) {
            this.f30586 = m16501;
        }
        return m16501;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m25564() {
        return (this.f30598 & 32) != 0;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m25582() {
        EnumC3478 m10650 = EnumC3478.m10650(this.f30597);
        return m10650 == null ? EnumC3478.EDITION_UNKNOWN : m10650;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f30595;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f30594.size(); i++) {
            if (!m25579(i).isInitialized()) {
                this.f30595 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f30588.size(); i2++) {
            if (!m25573(i2).isInitialized()) {
                this.f30595 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f30596.size(); i3++) {
            if (!m25574(i3).isInitialized()) {
                this.f30595 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f30587.size(); i4++) {
            if (!m25577(i4).isInitialized()) {
                this.f30595 = (byte) 0;
                return false;
            }
        }
        if (m25570() && !m25566().isInitialized()) {
            this.f30595 = (byte) 0;
            return false;
        }
        this.f30595 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        if ((this.f30598 & 1) != 0) {
            AbstractC4121.m12380(abstractC14766, 1, this.f30591);
        }
        if ((this.f30598 & 2) != 0) {
            AbstractC4121.m12380(abstractC14766, 2, this.f30593);
        }
        for (int i = 0; i < this.f30599.size(); i++) {
            AbstractC4121.m12380(abstractC14766, 3, this.f30599.mo8472(i));
        }
        for (int i2 = 0; i2 < this.f30594.size(); i2++) {
            abstractC14766.mo35104(4, (InterfaceC8522) this.f30594.get(i2));
        }
        for (int i3 = 0; i3 < this.f30588.size(); i3++) {
            abstractC14766.mo35104(5, (InterfaceC8522) this.f30588.get(i3));
        }
        for (int i4 = 0; i4 < this.f30596.size(); i4++) {
            abstractC14766.mo35104(6, (InterfaceC8522) this.f30596.get(i4));
        }
        for (int i5 = 0; i5 < this.f30587.size(); i5++) {
            abstractC14766.mo35104(7, (InterfaceC8522) this.f30587.get(i5));
        }
        if ((this.f30598 & 4) != 0) {
            abstractC14766.mo35104(8, m25566());
        }
        if ((this.f30598 & 8) != 0) {
            abstractC14766.mo35104(9, m25563());
        }
        for (int i6 = 0; i6 < this.f30600.size(); i6++) {
            abstractC14766.mo35101(10, this.f30600.getInt(i6));
        }
        for (int i7 = 0; i7 < this.f30592.size(); i7++) {
            abstractC14766.mo35101(11, this.f30592.getInt(i7));
        }
        if ((this.f30598 & 16) != 0) {
            AbstractC4121.m12380(abstractC14766, 12, this.f30586);
        }
        if ((this.f30598 & 32) != 0) {
            abstractC14766.mo35101(14, this.f30597);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int m12365 = (this.f30598 & 1) != 0 ? AbstractC4121.m12365(1, this.f30591) : 0;
        if ((this.f30598 & 2) != 0) {
            m12365 += AbstractC4121.m12365(2, this.f30593);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f30599.size(); i3++) {
            i2 += AbstractC4121.m12395(this.f30599.mo8472(i3));
        }
        int size = this.f30599.size() + m12365 + i2;
        for (int i4 = 0; i4 < this.f30594.size(); i4++) {
            size += AbstractC14766.m35082(4, (InterfaceC8522) this.f30594.get(i4));
        }
        for (int i5 = 0; i5 < this.f30588.size(); i5++) {
            size += AbstractC14766.m35082(5, (InterfaceC8522) this.f30588.get(i5));
        }
        for (int i6 = 0; i6 < this.f30596.size(); i6++) {
            size += AbstractC14766.m35082(6, (InterfaceC8522) this.f30596.get(i6));
        }
        for (int i7 = 0; i7 < this.f30587.size(); i7++) {
            size += AbstractC14766.m35082(7, (InterfaceC8522) this.f30587.get(i7));
        }
        if ((this.f30598 & 4) != 0) {
            size += AbstractC14766.m35082(8, m25566());
        }
        if ((this.f30598 & 8) != 0) {
            size += AbstractC14766.m35082(9, m25563());
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f30600.size(); i9++) {
            i8 += AbstractC14766.m35077(this.f30600.getInt(i9));
        }
        int size2 = this.f30600.size() + size + i8;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f30592.size(); i11++) {
            i10 += AbstractC14766.m35077(this.f30592.getInt(i11));
        }
        int size3 = this.f30592.size() + size2 + i10;
        if ((this.f30598 & 16) != 0) {
            size3 += AbstractC4121.m12365(12, this.f30586);
        }
        if ((this.f30598 & 32) != 0) {
            size3 += AbstractC14766.m35079(14, this.f30597);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + size3;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10182)) {
            return super.equals(obj);
        }
        C10182 c10182 = (C10182) obj;
        if (hasName() != c10182.hasName()) {
            return false;
        }
        if ((hasName() && !getName().equals(c10182.getName())) || m25575() != c10182.m25575()) {
            return false;
        }
        if ((m25575() && !m25567().equals(c10182.m25567())) || !this.f30599.equals(c10182.f30599) || !this.f30600.equals(c10182.f30600) || !this.f30592.equals(c10182.f30592) || !this.f30594.equals(c10182.f30594) || !this.f30588.equals(c10182.f30588) || !this.f30596.equals(c10182.f30596) || !this.f30587.equals(c10182.f30587) || m25570() != c10182.m25570()) {
            return false;
        }
        if ((m25570() && !m25566().equals(c10182.m25566())) || m25583() != c10182.m25583()) {
            return false;
        }
        if ((m25583() && !m25563().equals(c10182.m25563())) || m25584() != c10182.m25584()) {
            return false;
        }
        if ((!m25584() || m25568().equals(c10182.m25568())) && m25564() == c10182.m25564()) {
            return (!m25564() || this.f30597 == c10182.f30597) && getUnknownFields().equals(c10182.getUnknownFields());
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
        c17757 = C10702.f32255;
        int hashCode = c17757.hashCode() + 779;
        if (hasName()) {
            hashCode = C4153.m12551(hashCode, 37, 1, 53) + getName().hashCode();
        }
        if (m25575()) {
            hashCode = C4153.m12551(hashCode, 37, 2, 53) + m25567().hashCode();
        }
        if (this.f30599.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 3, 53) + this.f30599.hashCode();
        }
        if (this.f30600.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 10, 53) + this.f30600.hashCode();
        }
        if (this.f30592.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 11, 53) + this.f30592.hashCode();
        }
        if (this.f30594.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 4, 53) + this.f30594.hashCode();
        }
        if (this.f30588.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 5, 53) + this.f30588.hashCode();
        }
        if (this.f30596.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 6, 53) + this.f30596.hashCode();
        }
        if (this.f30587.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 7, 53) + this.f30587.hashCode();
        }
        if (m25570()) {
            hashCode = C4153.m12551(hashCode, 37, 8, 53) + m25566().hashCode();
        }
        if (m25583()) {
            hashCode = C4153.m12551(hashCode, 37, 9, 53) + m25563().hashCode();
        }
        if (m25584()) {
            hashCode = C4153.m12551(hashCode, 37, 12, 53) + m25568().hashCode();
        }
        if (m25564()) {
            hashCode = C4153.m12551(hashCode, 37, 14, 53) + this.f30597;
        }
        int hashCode2 = getUnknownFields().hashCode() + (hashCode * 29);
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    public static C10182 parseFrom(byte[] bArr) {
        return (C10182) ((C13003) f30585).parseFrom(bArr);
    }

    public static C12298 newBuilder() {
        return f30584.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f30584.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f30584.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C12298 toBuilder() {
        int i = 0;
        if (this == f30584) {
            return new C12298(i);
        }
        C12298 c12298 = new C12298(i);
        c12298.m29839(this);
        return c12298;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C12298(interfaceC9415, 0);
    }

    public static C10182 getDefaultInstance() {
        return f30584;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f30585;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f30584;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f30584;
    }
}
