package l;

import com.alipay.sdk.m.u0.b;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collection;
import org.simpleframework.xml.strategy.Name;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: I1EW */
/* renamed from: l.۟ܿܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7616 extends C16704 {
    @Override // l.C16704, l.InterfaceC23760
    /* renamed from: ֫ */
    public final void mo15499(InterfaceC13965 interfaceC13965, InterfaceC21211 interfaceC21211, C14587 c14587, C18116 c18116) {
        String str;
        String m24390;
        if (!interfaceC21211.mo29412()) {
            throw new RuntimeException();
        }
        if (interfaceC21211.mo29409() == 0 || interfaceC21211.getValue().mo5006() != 16777216 || !interfaceC21211.getValue().mo5007()) {
            super.mo15499(interfaceC13965, interfaceC21211, c14587, c18116);
            return;
        }
        interfaceC13965.mo1294("attr");
        interfaceC13965.mo1291("name", interfaceC21211.mo29406());
        int value = interfaceC21211.getValue().getValue();
        InterfaceC7099 interfaceC7099 = null;
        if (value != 65535) {
            ArrayList arrayList = new ArrayList();
            if ((value & 1) != 0) {
                arrayList.add(Name.REFER);
            }
            if ((value & 2) != 0) {
                arrayList.add("string");
            }
            if ((value & 4) != 0) {
                arrayList.add("integer");
            }
            if ((value & 8) != 0) {
                arrayList.add(ClassTransform.BOOLEAN);
            }
            if ((value & 16) != 0) {
                arrayList.add(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR);
            }
            if ((value & 32) != 0) {
                arrayList.add(ClassTransform.FLOAT);
            }
            if ((value & 64) != 0) {
                arrayList.add("dimension");
            }
            if ((value & 128) != 0) {
                arrayList.add("fraction");
            }
            if ((65536 & value) != 0) {
                str = "enum";
                arrayList.add("enum");
            } else {
                str = null;
            }
            if ((value & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                arrayList.add("flags");
                str = "flag";
            }
            interfaceC13965.mo1291("format", C9679.m24612((Collection) arrayList, '|'));
        } else {
            str = null;
        }
        C9650.m24592(interfaceC13965, interfaceC21211, c18116);
        int mo29409 = interfaceC21211.mo29409() - 1;
        InterfaceC0748 type = interfaceC21211.mo29407().getType("id");
        int i = 0;
        if (type != null && type.mo2871() != 0) {
            interfaceC7099 = type.mo2877(0);
        }
        int mo12858 = interfaceC21211.mo29407().mo12858() << 24;
        if (type != null) {
            mo12858 |= type.mo2870() << 16;
        }
        while (i < mo29409) {
            i++;
            InterfaceC1454 value2 = interfaceC21211.getValue(i);
            if (str == null || (value2.mo5004() != 16 && value2.mo5004() != 17)) {
                C16704.m39270(interfaceC13965, value2, c14587);
            } else {
                if (interfaceC7099 == null || (value2.mo5006() & (-65536)) != mo12858) {
                    m24390 = C9523.m24390(value2.mo5006());
                } else {
                    InterfaceC21211 mo2346 = interfaceC7099.mo2346(value2.mo5006() & 65535);
                    if (mo2346 == null) {
                        m24390 = C9523.m24390(value2.mo5006());
                    } else {
                        m24390 = mo2346.mo29406();
                    }
                }
                interfaceC13965.mo1294(str);
                interfaceC13965.mo1291("name", m24390);
                interfaceC13965.mo1291(b.d, C9650.m24585(c14587, value2).toString());
                interfaceC13965.mo1290(str);
            }
        }
        interfaceC13965.mo1290("attr");
    }
}
