package l;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Properties;

/* compiled from: G3L1 */
/* renamed from: l.᩺֨۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C22658 extends AbstractC1698 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC11370 f73170;

    public C22658(C14163 c14163) {
        super(c14163);
        EnumC11370 enumC11370;
        this.f5886 = new EnumMap(EnumC12075.class);
        for (EnumC12075 enumC12075 : EnumC12075.values()) {
            this.f5886.put((EnumMap) enumC12075, (EnumC12075) new ArrayList());
        }
        InterfaceC18278 interfaceC18278 = c14163.f42766;
        if ((interfaceC18278 == null && c14163.f42770 == null) || (interfaceC18278 != null && interfaceC18278.mo21321() == EnumC16866.CLASS)) {
            enumC11370 = EnumC11370.CLASS;
        } else {
            enumC11370 = EnumC11370.SOURCE;
        }
        this.f73170 = enumC11370;
    }

    @Override // l.AbstractC1698, l.InterfaceC2404
    /* renamed from: ֫ */
    public final Properties mo5711() {
        Properties mo5711 = super.mo5711();
        mo5711.put("style", this.f73170.f34027);
        mo5711.put("shape", "ellipse");
        return mo5711;
    }
}
