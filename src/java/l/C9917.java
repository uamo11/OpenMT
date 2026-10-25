package l;

import android.view.View;
import android.view.ViewParent;
import android.widget.ScrollView;
import android.widget.TextView;

/* compiled from: 88W4 */
/* renamed from: l.ۢ᩻ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9917 extends C9809 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9211 f29990;

    public C9917(C9211 c9211) {
        this.f29990 = c9211;
    }

    @Override // l.C9809, l.InterfaceC21098
    /* renamed from: ֫ */
    public final void mo24842(View view, String str) {
        InterfaceC21206 interfaceC21206;
        C8367 c8367;
        InterfaceC21206 interfaceC212062;
        C9211 c9211 = this.f29990;
        interfaceC21206 = c9211.f27897;
        if (interfaceC21206 != null) {
            interfaceC212062 = c9211.f27897;
            if (interfaceC212062.mo9386(view, str)) {
                return;
            }
        }
        if (str.startsWith("#")) {
            if (view instanceof TextView) {
                TextView textView = (TextView) view;
                ViewParent parent = view.getParent();
                if (parent instanceof ScrollView) {
                    ScrollView scrollView = (ScrollView) parent;
                    String replaceAll = String.valueOf(str.substring(1)).toLowerCase().replaceAll("[^\\p{L}\\p{N}]+", "-");
                    c8367 = c9211.f27898;
                    int mo24837 = c8367.mo24837(-1, replaceAll);
                    if (mo24837 >= 0) {
                        scrollView.smoothScrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(mo24837)));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        super.mo24842(view, str);
    }
}
