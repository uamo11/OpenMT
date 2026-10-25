package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.function.Supplier;

/* compiled from: T7EH */
/* renamed from: l.ۨ֫֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC11385 extends AbstractC9701 {

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public int f34056;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f34057;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public AbstractC13546 f34058;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public C10242 f34059;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public C21968 f34060;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f34061;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public C19852 f34062;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public Supplier f34063;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC5740 f34064;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public String f34065;

    /* renamed from: ֨ */
    public abstract String mo23264();

    public AbstractC11385(C20826 c20826, EnumC0970 enumC0970) {
        super(c20826.f29325);
        this.f34057 = 0;
        this.f34065 = null;
        this.f34061 = 0;
        this.f34060 = new C21968(this);
        this.f34062 = new C19852(this);
        this.f34059 = c20826.f35264;
        this.f34058 = ((C20826) c20826.f35257).f35255.m45770();
        this.f29348 = enumC0970;
        int i = C9974.f30089[enumC0970.ordinal()];
        if (i == 1) {
            this.f34057 = 2;
            this.f34063 = new C21716(this, 1);
            this.f34064 = new InterfaceC5740() { // from class: l.ۙ֫֨
                @Override // l.InterfaceC5740
                /* renamed from: ۧ */
                public final void mo8913() {
                    AbstractC11385 abstractC11385 = AbstractC11385.this;
                    String str = abstractC11385.f34065;
                    if (str == null) {
                        str = "???";
                    }
                    abstractC11385.m24662("\"" + str + "\";");
                }
            };
        } else if (i == 2) {
            this.f34057 = 2;
            this.f34063 = new C22421(this, 1);
            this.f34064 = new InterfaceC5740() { // from class: l.ۗ֫֨
                @Override // l.InterfaceC5740
                /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
                public final void mo8913() {
                    AbstractC11385 abstractC11385 = AbstractC11385.this;
                    String str = abstractC11385.f34065;
                    if (str == null) {
                        str = "\"???\"";
                    }
                    abstractC11385.m24662(str.concat(l.b));
                }
            };
        } else {
            if (i != 3) {
                throw new RuntimeException(C4860.m14172("Implementation of \"", this.f29348.m3428(), "\" is not supported"));
            }
            this.f34057 = 4;
            this.f34063 = new Supplier() { // from class: l.۬֫֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    AbstractC11385 abstractC11385 = AbstractC11385.this;
                    return String.format("#%d:#%d;", Integer.valueOf(abstractC11385.f34056), Integer.valueOf(abstractC11385.f34061));
                }
            };
            this.f34064 = new InterfaceC5740() { // from class: l.۫֫֨
                @Override // l.InterfaceC5740
                /* renamed from: ۧ */
                public final void mo8913() {
                    AbstractC11385 abstractC11385 = AbstractC11385.this;
                    abstractC11385.m24662(abstractC11385.f34065 + l.b);
                }
            };
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28148(int i, DataInputStream dataInputStream) {
        if (i != this.f34057) {
            boolean z = this.f29352;
            AbstractC13546 abstractC13546 = this.f34058;
            if (z) {
                abstractC13546.mo32596("{0}: Invalid attribute length #{1}", this.f29348.m3424().m13647(), Integer.valueOf(i));
            } else {
                throw new C4375(abstractC13546, "{0}: Invalid attribute length #{1}", this.f29348.m3424().m13647(), Integer.valueOf(i));
            }
        }
        this.f34056 = dataInputStream.readUnsignedShort();
        if (this.f29348 == EnumC0970.ENCLOSING_METHOD) {
            this.f34061 = dataInputStream.readUnsignedShort();
        }
    }

    @Override // l.AbstractC9701
    /* renamed from: ᩴ */
    public final void mo18679() {
        mo23264();
        m24658(m24657(mo18675(), this.f29348.m3425().m35967()));
        if (this.f29326) {
            if (this.f29343) {
                this.f34060.mo8913();
                return;
            } else {
                this.f34062.mo8913();
                return;
            }
        }
        this.f34064.mo8913();
    }

    @Override // l.AbstractC9701
    /* renamed from: ۚ */
    public final void mo18674() {
        mo18679();
    }
}
