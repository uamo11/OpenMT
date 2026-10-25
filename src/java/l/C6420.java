package l;

import com.alipay.sdk.m.n.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: 6AY4 */
/* renamed from: l.ۜ֡᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6420 implements InterfaceC17242 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f19862;

    @Override // l.InterfaceC17242
    /* renamed from: ۧ */
    public final /* synthetic */ void mo4109(String str) {
    }

    @Override // l.InterfaceC17242
    /* renamed from: ֫ */
    public final void mo4107(String str) {
        String str2;
        List list;
        List list2;
        C17709 c17709;
        C11233.m27805(str, "filterText");
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f19862;
        str2 = viewOnClickListenerC19121.f60238;
        if (C11233.m27802((Object) str2, (Object) str)) {
            return;
        }
        viewOnClickListenerC19121.f60238 = str;
        if (str.length() == 0) {
            list2 = viewOnClickListenerC19121.f60262;
        } else {
            list = viewOnClickListenerC19121.f60262;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
                if (!interfaceC17889.mo36982()) {
                    String name = interfaceC17889.getName();
                    C11233.m27803(name, "getName(...)");
                    if (C3016.m9237((CharSequence) name, (CharSequence) str, true)) {
                        arrayList.add(obj);
                    }
                }
            }
            list2 = arrayList;
        }
        viewOnClickListenerC19121.f60259 = list2;
        c17709 = viewOnClickListenerC19121.f60264;
        c17709.m41442(false);
    }

    @Override // l.InterfaceC17242
    /* renamed from: ֫ */
    public final void mo4108(EnumC14419 enumC14419) {
        String str;
        List list;
        C17709 c17709;
        C11233.m27805(enumC14419, c.a);
        if (enumC14419.m34451()) {
            return;
        }
        ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f19862;
        str = viewOnClickListenerC19121.f60238;
        if (str.length() > 0) {
            viewOnClickListenerC19121.f60238 = "";
            list = viewOnClickListenerC19121.f60262;
            viewOnClickListenerC19121.f60259 = list;
            c17709 = viewOnClickListenerC19121.f60264;
            c17709.m41442(false);
        }
    }

    public C6420(ViewOnClickListenerC19121 viewOnClickListenerC19121) {
        this.f19862 = viewOnClickListenerC19121;
    }
}
