package l;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: A4XC */
/* renamed from: l.ܿ۬ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17360 implements InterfaceC19231 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ HashMap f53169;

    public C17360(HashMap hashMap) {
        this.f53169 = hashMap;
    }

    @Override // l.InterfaceC19231
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo40689(AbstractC1591 abstractC1591) {
        C23710 c23710;
        int intValue;
        EnumC7690 enumC7690 = abstractC1591.f5638;
        EnumC7690 enumC76902 = EnumC7690.ASSIGN;
        HashMap hashMap = this.f53169;
        if (enumC7690 == enumC76902) {
            if (abstractC1591.mo5444().f25745 == EnumC1340.NEW_ARRAY && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL) {
                C16156 c16156 = (C16156) abstractC1591.mo5444();
                AbstractC8396 abstractC8396 = c16156.f63597;
                if (abstractC8396.f25745 != EnumC1340.CONSTANT || (intValue = ((Number) ((C11987) abstractC8396).f35889).intValue()) < 0) {
                    return;
                }
                C18274 c18274 = (C18274) abstractC1591.mo5445();
                String str = c16156.f49779;
                C23710 c237102 = new C23710();
                c237102.f76775 = new ArrayList();
                c237102.f76777 = new ArrayList();
                c237102.f76776 = intValue;
                c237102.f76778 = str;
                c237102.f76774 = (C21802) abstractC1591;
                hashMap.put(c18274, c237102);
                return;
            }
            if (abstractC1591.mo5445().f25745 == EnumC1340.ARRAY) {
                C12692 c12692 = (C12692) abstractC1591.mo5445();
                AbstractC8396 abstractC83962 = c12692.f2428;
                if (abstractC83962.f25745 == EnumC1340.LOCAL) {
                    C18274 c182742 = (C18274) abstractC83962;
                    C23710 c237103 = (C23710) hashMap.get(c182742);
                    if (c237103 != null) {
                        if (c12692.f2429.f25745 == EnumC1340.CONSTANT) {
                            c237103.f76775.add(abstractC1591);
                            return;
                        } else {
                            hashMap.remove(c182742);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (enumC7690 == EnumC7690.FILL_ARRAY_DATA && abstractC1591.mo5445().f25745 == EnumC1340.LOCAL && (c23710 = (C23710) hashMap.get((C18274) abstractC1591.mo5445())) != null) {
            c23710.f76775.add(abstractC1591);
        }
    }
}
