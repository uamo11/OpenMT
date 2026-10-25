package l;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: 81UA */
/* renamed from: l.ܳۙۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14295 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10130 f43084;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f43085;

    public C14295() {
        super(2);
        C10130 c10130 = new C10130();
        this.f43084 = c10130;
        this.f43085 = new LinkedHashMap();
        c10130.writeInt(67263238);
    }

    @Override // l.AbstractC2821, l.InterfaceC8898
    /* renamed from: ֫ */
    public final void mo1225(C2966 c2966) {
        String m45794 = c2966.m45794();
        String m20585 = C7695.m20585(c2966);
        if (m20585 == null) {
            m20585 = m45794;
        }
        if (m45794.equals(m20585)) {
            Iterator it = c2966.m45795().iterator();
            while (true) {
                if (it.hasNext()) {
                    C12843 c12843 = (C12843) it.next();
                    String m24169 = C9358.m24169(c12843);
                    if (m24169 != null && !m24169.equals(c12843.m13109())) {
                        break;
                    }
                } else {
                    Iterator it2 = c2966.m45797().iterator();
                    while (it2.hasNext()) {
                        C10022 c10022 = (C10022) it2.next();
                        String m241692 = C9358.m24169(c10022);
                        if (m241692 == null || m241692.equals(c10022.m13109())) {
                        }
                    }
                    return;
                }
            }
        }
        C10130 c10130 = this.f43084;
        c10130.writeByte(1);
        c10130.writeInt(m34081(m45794));
        c10130.writeInt(m34081(m20585));
        c2966.m45783((InterfaceC2548) this);
        c2966.m45792(this);
    }

    @Override // l.AbstractC2821, l.InterfaceC2548
    /* renamed from: ֫ */
    public final void mo3143(C2966 c2966, C12843 c12843) {
        String m24169 = C9358.m24169(c12843);
        String m13109 = c12843.m13109();
        if (m24169 == null) {
            m24169 = c12843.m13109();
        }
        if (m24169.equals(m13109)) {
            return;
        }
        C10130 c10130 = this.f43084;
        c10130.writeByte(2);
        c10130.writeInt(m34081(c12843.m13108().mo5456()));
        c10130.writeInt(m34081(m13109));
        c10130.writeInt(m34081(m24169));
    }

    @Override // l.AbstractC2821, l.InterfaceC2548
    /* renamed from: ֫ */
    public final void mo3142(C2966 c2966, C10022 c10022) {
        String m24169 = C9358.m24169(c10022);
        String m13109 = c10022.m13109();
        if (m24169 == null) {
            m24169 = m13109;
        }
        if (m24169.equals(m13109)) {
            return;
        }
        C10130 c10130 = this.f43084;
        c10130.writeByte(3);
        c10130.writeInt(m34081(c10022.m13108().mo5456()));
        c10130.writeInt(m34081(m13109));
        c10130.writeInt(m34081(m24169));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34083() {
        C10130 c10130 = this.f43084;
        int i = 0;
        c10130.writeByte(0);
        int size = c10130.size();
        LinkedHashMap linkedHashMap = this.f43085;
        c10130.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int i2 = i + 1;
            if (i != ((Integer) entry.getValue()).intValue()) {
                throw new RuntimeException();
            }
            c10130.m25423((CharSequence) entry.getKey());
            i = i2;
        }
        c10130.writeInt(size);
        c10130.writeInt(67263238);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34082(OutputStream outputStream) {
        this.f43084.m25421(outputStream);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m34081(String str) {
        LinkedHashMap linkedHashMap = this.f43085;
        Integer num = (Integer) linkedHashMap.get(str);
        if (num == null) {
            num = Integer.valueOf(linkedHashMap.size());
            linkedHashMap.put(str, num);
        }
        return num.intValue();
    }
}
