package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: 59PG */
/* renamed from: l.۠֡ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7816 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20898(AbstractC8709 abstractC8709, Map map, AbstractC14766 abstractC14766) {
        boolean m39380 = abstractC8709.getDescriptorForType().m41593().m39380();
        for (Map.Entry entry : map.entrySet()) {
            C0117 c0117 = (C0117) entry.getKey();
            Object value = entry.getValue();
            if (m39380 && c0117.m1126() && c0117.getType() == EnumC19169.f60400 && !c0117.mo1129()) {
                abstractC14766.mo35108(c0117.getNumber(), (InterfaceC23338) value);
            } else {
                C19210.m44297(c0117, value, abstractC14766);
            }
        }
        C9249 unknownFields = abstractC8709.getUnknownFields();
        if (m39380) {
            unknownFields.m23743(abstractC14766);
        } else {
            unknownFields.writeTo(abstractC14766);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20893(AbstractC8709 abstractC8709, Map map) {
        int serializedSize;
        boolean m39380 = abstractC8709.getDescriptorForType().m41593().m39380();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            C0117 c0117 = (C0117) entry.getKey();
            Object value = entry.getValue();
            if (m39380 && c0117.m1126() && c0117.getType() == EnumC19169.f60400 && !c0117.mo1129()) {
                int number = c0117.getNumber();
                i += AbstractC14766.m35082(3, (InterfaceC23338) value) + AbstractC14766.m35084(2, number) + (AbstractC14766.m35073(1) * 2);
            } else {
                i += C19210.m44305(c0117, value);
            }
        }
        C9249 unknownFields = abstractC8709.getUnknownFields();
        if (m39380) {
            serializedSize = unknownFields.m23745();
        } else {
            serializedSize = unknownFields.getSerializedSize();
        }
        return serializedSize + i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20895(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20894(String str, C0117 c0117, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (c0117.m1126()) {
            sb.append('(');
            sb.append(c0117.mo1141());
            sb.append(')');
        } else {
            sb.append(c0117.getName());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20897(InterfaceC3583 interfaceC3583, String str, ArrayList arrayList) {
        for (C0117 c0117 : interfaceC3583.getDescriptorForType().getFields()) {
            if (c0117.m1128() && !interfaceC3583.hasField(c0117)) {
                StringBuilder m15339 = C5368.m15339(str);
                m15339.append(c0117.getName());
                arrayList.add(m15339.toString());
            }
        }
        for (Map.Entry entry : interfaceC3583.getAllFields().entrySet()) {
            C0117 c01172 = (C0117) entry.getKey();
            Object value = entry.getValue();
            if (c01172.m1138() == EnumC18463.MESSAGE) {
                if (c01172.mo1129()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        m20897((InterfaceC3583) it.next(), m20894(str, c01172, i), arrayList);
                        i++;
                    }
                } else if (interfaceC3583.hasField(c01172)) {
                    m20897((InterfaceC3583) value, m20894(str, c01172, -1), arrayList);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m20896(InterfaceC3583 interfaceC3583) {
        ArrayList arrayList = new ArrayList();
        m20897(interfaceC3583, "", arrayList);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m20899(l.AbstractC7297 r9, l.C14186 r10, l.C17798 r11, l.C17757 r12, l.InterfaceC0760 r13, int r14) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7816.m20899(l.۟ۜۖ, l.ܳ֨ۖ, l.ᩳۘۖ, l.ᩳۖۖ, l.֨֡ۖ, int):boolean");
    }
}
