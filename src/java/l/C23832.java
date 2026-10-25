package l;

import com.alipay.sdk.m.y.l;
import java.io.DataInputStream;
import java.util.ArrayList;

/* compiled from: S7FD */
/* renamed from: l.᩻ܿ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23832 extends AbstractC11817 {

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f77116;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52517(DataInputStream dataInputStream) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        this.f35255.m45778(C19370.m44628(readUnsignedShort, "components="), new Object[0]);
        this.f77116 = new ArrayList(readUnsignedShort);
        for (int i = 0; i < readUnsignedShort; i++) {
            ArrayList arrayList = this.f77116;
            C14659 c14659 = new C14659((C20826) this.f35257);
            c14659.f35252 = "RecordData";
            c14659.m34946(dataInputStream);
            arrayList.add(c14659);
        }
    }

    @Override // l.AbstractC9701, l.InterfaceC17482
    /* renamed from: ۧ */
    public final void mo3021() {
        int size = this.f77116.size();
        if (size > 0) {
            boolean m3426 = this.f29348.m3426();
            m24665(EnumC15204.f46485.m35967() + " {");
            for (int i = 0; i < size; i++) {
                C14659 c14659 = (C14659) this.f77116.get(i);
                c14659.f29349 = m24656() + this.f29349;
                c14659.m24664(1);
                if (!m3426 || !mo24649()) {
                    c14659.mo4064(i, size);
                } else {
                    c14659.mo4064(i, size);
                }
            }
            m24665(l.d);
        }
    }
}
