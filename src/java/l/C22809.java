package l;

import android.widget.BaseAdapter;
import bin.mt.function.ar.ActivityRecordService;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* compiled from: C4QU */
/* renamed from: l.᩺ۛܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22809 implements InterfaceC17236 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final WeakReference f73646;

    public C22809(C14507 c14507) {
        this.f73646 = new WeakReference(c14507);
    }

    @Override // l.InterfaceC17236
    /* renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        DialogInterfaceC0206 dialogInterfaceC0206;
        List list;
        List list2;
        BaseAdapter baseAdapter;
        if (enumC22901 == EnumC22901.ON_DESTROY) {
            C14507 c14507 = (C14507) this.f73646.get();
            if (c14507 != null) {
                C14507.m34664(c14507);
            }
            interfaceC23586.getLifecycle().mo19834(this);
            return;
        }
        if (enumC22901 == EnumC22901.ON_RESUME) {
            C14507 c145072 = (C14507) this.f73646.get();
            if (c145072 == null) {
                interfaceC23586.getLifecycle().mo19834(this);
                return;
            }
            dialogInterfaceC0206 = c145072.f44487;
            if (!dialogInterfaceC0206.m1442()) {
                interfaceC23586.getLifecycle().mo19834(this);
                return;
            }
            dialogInterfaceC0206.m1447().setText((ActivityRecordService.m47() && ActivityRecordService.m46()) ? R.string.MT_Protector_res_0x7f1209e1 : R.string.MT_Protector_res_0x7f1209d2);
            list = c145072.f44484;
            ((ArrayList) list).clear();
            LinkedList linkedList = ActivityRecordService.f16;
            synchronized (linkedList) {
                list2 = c145072.f44484;
                ((ArrayList) list2).addAll(linkedList);
            }
            baseAdapter = c145072.f44485;
            baseAdapter.notifyDataSetChanged();
        }
    }
}
