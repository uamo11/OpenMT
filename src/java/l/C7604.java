package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: 57DZ */
/* renamed from: l.۟ܿ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7604 extends C6445 {

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public AbstractC13669 f23493;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final C13953 f23494;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public final C1506 f23495;

    public C7604(AbstractC11817 abstractC11817, boolean z) {
        super(abstractC11817, z);
        this.f23494 = new C13953(this);
        this.f23493 = null;
        this.f23495 = new C1506();
        this.f19929 = "@T+";
        this.f19931 = "@T-";
    }

    @Override // l.C6445
    /* renamed from: ۧ */
    public final void mo17803(DataInputStream dataInputStream) {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        EnumC17734 m41542 = EnumC17734.m41542(readUnsignedByte);
        if (m41542 == null) {
            throw new IOException(C18307.m42645(readUnsignedByte, "Bad target type: ", " in TypeAnnotationData"));
        }
        C13953 c13953 = this.f23494;
        c13953.m33398(dataInputStream);
        c13953.m33400(m41542);
        this.f23493 = c13953.m33399();
        int readUnsignedByte2 = dataInputStream.readUnsignedByte();
        this.f35255.m45778(C18307.m42645(readUnsignedByte2, "[TypeAnnotationData.read]: Reading Location (length = ", ")."), new Object[0]);
        this.f35255.m45775("[TypeAnnotationData.read]: [ ", new Object[0]);
        for (int i = 0; i < readUnsignedByte2; i++) {
            int readUnsignedByte3 = dataInputStream.readUnsignedByte();
            String m26808 = EnumC10679.values()[readUnsignedByte3].m26808();
            char readUnsignedByte4 = (char) dataInputStream.readUnsignedByte();
            this.f23495.m5187(new C17028(readUnsignedByte3, readUnsignedByte4));
            this.f35255.m45775(" " + m26808 + MotionUtils.EASING_TYPE_FORMAT_START + readUnsignedByte3 + "," + readUnsignedByte4 + "), ", new Object[0]);
        }
        this.f35255.m45778("] ", new Object[0]);
        super.mo17803(dataInputStream);
    }

    @Override // l.C6445
    /* renamed from: ᩹ */
    public final void mo17804() {
        if (isEmpty()) {
            m24654(" { { }");
        } else {
            m24662(" {");
            mo22276(EnumC6172.INLINED_ELEMENT);
            super.mo17804();
        }
        m24654(this.f23493.m32836());
        String c1506 = this.f23495.toString();
        int length = c1506.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int codePointAt = c1506.codePointAt(i);
            if (!Character.isWhitespace(codePointAt)) {
                m24654(c1506.concat(" "));
                break;
            }
            i += Character.charCount(codePointAt);
        }
        m24654(l.d);
    }
}
