package l;

import java.util.Collections;
import java.util.List;

/* compiled from: T9Q9 */
/* renamed from: l.ۧۡۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10888 extends AbstractC4121 implements InterfaceC3583 {
    public static final long serialVersionUID = 0;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC12050 f32722;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C10888 f32723;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f32724 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f32725;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public byte f32726;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f32727;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f32728;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public List f32729;

    static {
        C20663.m47279(EnumC6551.PUBLIC, C10888.class.getName());
        f32723 = new C10888();
        f32722 = new C11614();
    }

    public C10888(C22902 c22902, int i) {
        super(c22902);
        this.f32725 = 0;
        this.f32727 = 0;
        this.f32726 = (byte) -1;
    }

    public C10888() {
        this.f32725 = 0;
        this.f32727 = 0;
        this.f32726 = (byte) -1;
        this.f32729 = Collections.EMPTY_LIST;
        this.f32725 = 0;
        this.f32727 = 0;
    }

    @Override // l.AbstractC4121
    public final C9766 internalGetFieldAccessorTable() {
        C9766 c9766;
        c9766 = C10702.f32221;
        c9766.m24773(C10888.class, C22902.class);
        return c9766;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final List m27189() {
        return this.f32729;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m27192() {
        return (this.f32728 & 1) != 0;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m27191() {
        EnumC3478 m10650 = EnumC3478.m10650(this.f32725);
        return m10650 == null ? EnumC3478.EDITION_UNKNOWN : m10650;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m27190() {
        return (this.f32728 & 2) != 0;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC3478 m27193() {
        EnumC3478 m10650 = EnumC3478.m10650(this.f32727);
        return m10650 == null ? EnumC3478.EDITION_UNKNOWN : m10650;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC15576, l.InterfaceC8060
    public final boolean isInitialized() {
        byte b = this.f32726;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f32729.size(); i++) {
            if (!((C1715) this.f32729.get(i)).isInitialized()) {
                this.f32726 = (byte) 0;
                return false;
            }
        }
        this.f32726 = (byte) 1;
        return true;
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final void writeTo(AbstractC14766 abstractC14766) {
        for (int i = 0; i < this.f32729.size(); i++) {
            abstractC14766.mo35104(1, (InterfaceC8522) this.f32729.get(i));
        }
        if ((this.f32728 & 1) != 0) {
            abstractC14766.mo35101(4, this.f32725);
        }
        if ((this.f32728 & 2) != 0) {
            abstractC14766.mo35101(5, this.f32727);
        }
        getUnknownFields().writeTo(abstractC14766);
    }

    @Override // l.AbstractC4121, l.AbstractC8709, l.InterfaceC8522
    public final int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f32729.size(); i3++) {
            i2 += AbstractC14766.m35082(1, (InterfaceC8522) this.f32729.get(i3));
        }
        if ((this.f32728 & 1) != 0) {
            i2 += AbstractC14766.m35079(4, this.f32725);
        }
        if ((this.f32728 & 2) != 0) {
            i2 += AbstractC14766.m35079(5, this.f32727);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + i2;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC8709
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10888)) {
            return super.equals(obj);
        }
        C10888 c10888 = (C10888) obj;
        if (!this.f32729.equals(c10888.f32729) || m27192() != c10888.m27192()) {
            return false;
        }
        if ((!m27192() || this.f32725 == c10888.f32725) && m27190() == c10888.m27190()) {
            return (!m27190() || this.f32727 == c10888.f32727) && getUnknownFields().equals(c10888.getUnknownFields());
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
        c17757 = C10702.f32225;
        int hashCode = c17757.hashCode() + 779;
        if (this.f32729.size() > 0) {
            hashCode = C4153.m12551(hashCode, 37, 1, 53) + this.f32729.hashCode();
        }
        if (m27192()) {
            hashCode = C4153.m12551(hashCode, 37, 4, 53) + this.f32725;
        }
        if (m27190()) {
            hashCode = C4153.m12551(hashCode, 37, 5, 53) + this.f32727;
        }
        int hashCode2 = getUnknownFields().hashCode() + (hashCode * 29);
        this.memoizedHashCode = hashCode2;
        return hashCode2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10888 m27184(byte[] bArr, C1570 c1570) {
        return (C10888) ((C11614) f32722).parseFrom(bArr, (C17798) c1570);
    }

    public static C22902 newBuilder() {
        return f32723.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC9228 newBuilderForType() {
        return f32723.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final InterfaceC14165 newBuilderForType() {
        return f32723.toBuilder();
    }

    @Override // l.AbstractC8709, l.InterfaceC8522
    public final C22902 toBuilder() {
        int i = 0;
        if (this == f32723) {
            return new C22902(i);
        }
        C22902 c22902 = new C22902(i);
        c22902.m50992(this);
        return c22902;
    }

    @Override // l.AbstractC8709
    public final InterfaceC14165 newBuilderForType(InterfaceC9415 interfaceC9415) {
        return new C22902(interfaceC9415, 0);
    }

    public static C10888 getDefaultInstance() {
        return f32723;
    }

    @Override // l.AbstractC4121, l.InterfaceC8522
    public final InterfaceC12050 getParserForType() {
        return f32722;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC8522 getDefaultInstanceForType() {
        return f32723;
    }

    @Override // l.AbstractC8709, l.InterfaceC15576, l.InterfaceC3583, l.InterfaceC8060
    public final InterfaceC23338 getDefaultInstanceForType() {
        return f32723;
    }
}
