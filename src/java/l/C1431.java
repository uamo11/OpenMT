package l;

import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/* compiled from: K7BU */
/* renamed from: l.֨᩺ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1431 extends AbstractC1661 implements Function {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public List f5128;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f5129;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f5130;

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo22274andThen(Function function) {
        return C20696.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C20696.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        final C16560 c16560 = (C16560) obj;
        if (!c16560.m39035("local") || c16560.m39038()) {
            return Boolean.FALSE;
        }
        if (c16560.m38991().equals(this.f5129)) {
            if (this.f5128.size() != 1) {
                C21374.m48457(R.string.MT_Protector_res_0x7f120aa9);
                return Boolean.FALSE;
            }
            final InterfaceC17889 interfaceC17889 = (InterfaceC17889) this.f5128.get(0);
            C19777.m45461(c16560.m39056(), interfaceC17889, c16560.m39058(), new InterfaceC19071() { // from class: l.֡᩺ܳ
                @Override // l.InterfaceC19071
                /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final void mo2836(String str) {
                    InterfaceC17889 interfaceC178892 = interfaceC17889;
                    List singletonList = Collections.singletonList(interfaceC178892);
                    String name = interfaceC178892.getName();
                    String str2 = interfaceC178892.isDirectory() ? str : null;
                    C16560 c165602 = c16560;
                    C1431.m4943(singletonList, c165602, name, str2, c165602.m39058(), str).m3469();
                }
            });
            return Boolean.TRUE;
        }
        m4943(this.f5128, c16560, this.f5130, c16560.m38990(), c16560.m39058(), null).m3469();
        return Boolean.TRUE;
    }

    public C1431() {
        super(R.string.MT_Protector_res_0x7f1205c2, R.drawable.MT_Protector_res_0x7f0801e3);
        this.f5128 = Collections.EMPTY_LIST;
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return c2450.m7916("local") && !c2450.m7923();
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        c2450.m7907("local");
        if (c2450.m7923()) {
            throw new IllegalStateException("Search results do not support single-window copy.");
        }
        this.f5128 = c2450.m7909();
        this.f5129 = c2450.m7914();
        this.f5130 = c2450.m7912();
        c2450.m7921().m38996(R.string.MT_Protector_res_0x7f120928, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0994 m4943(List list, C16560 c16560, String str, String str2, String str3, String str4) {
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C5665.class);
        c0994.m3483(list);
        c0994.m3480(c16560);
        c0994.m3474("ARG_MSG_FROM", str);
        c0994.m3474("targetPath", str3);
        if (str2 != null) {
            c0994.m3474("ARG_MSG_TO", str2);
        }
        if (str4 != null) {
            c0994.m3474("replacedName", str4);
        }
        return c0994;
    }
}
