package l;

import java.util.List;

/* compiled from: J9PI */
/* renamed from: l.᩵᩵ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19665 extends AbstractC0613 {
    @Override // l.AbstractC0613
    /* renamed from: ֫ */
    public final void mo2520(long j, Object obj) {
        ((InterfaceC23170) C21244.m48234(j, obj)).mo44493();
    }

    @Override // l.AbstractC0613
    /* renamed from: ֫ */
    public final void mo2521(long j, Object obj, Object obj2) {
        InterfaceC23170 interfaceC23170 = (InterfaceC23170) C21244.m48234(j, obj);
        InterfaceC23170 interfaceC231702 = (InterfaceC23170) C21244.m48234(j, obj2);
        int size = interfaceC23170.size();
        int size2 = interfaceC231702.size();
        if (size > 0 && size2 > 0) {
            if (!interfaceC23170.mo44491()) {
                interfaceC23170 = interfaceC23170.mo8473(size2 + size);
            }
            interfaceC23170.addAll(interfaceC231702);
        }
        if (size > 0) {
            interfaceC231702 = interfaceC23170;
        }
        C21244.m48224(j, obj, interfaceC231702);
    }

    @Override // l.AbstractC0613
    /* renamed from: ۧ */
    public final List mo2522(long j, Object obj) {
        InterfaceC23170 interfaceC23170 = (InterfaceC23170) C21244.m48234(j, obj);
        if (interfaceC23170.mo44491()) {
            return interfaceC23170;
        }
        int size = interfaceC23170.size();
        InterfaceC23170 mo8473 = interfaceC23170.mo8473(size == 0 ? 10 : size * 2);
        C21244.m48224(j, obj, mo8473);
        return mo8473;
    }
}
