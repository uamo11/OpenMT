package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: O9NE */
/* renamed from: l.ۤܺ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10386 extends AbstractC16876 implements InterfaceC16233 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C10386 f31230 = new C10386(1);

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        View view = (View) obj;
        C11233.m27805(view, "viewParent");
        Object tag = view.getTag(R.id.MT_Protector_res_0x7f0a0689);
        if (tag instanceof InterfaceC23586) {
            return (InterfaceC23586) tag;
        }
        return null;
    }
}
