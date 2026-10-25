package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: P97N */
/* renamed from: l.ۗ᩸᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3515 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14401 f11165;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TextView[] f11166;

    public C3515(C16560 c16560) {
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        this.f11165 = c14401;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10707() {
        this.f11165.m34418();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10711(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.isDirectory() || !(interfaceC17889 instanceof C12687)) {
            throw new IllegalArgumentException();
        }
        C12687 c12687 = (C12687) interfaceC17889;
        String name = c12687.getName();
        C14401 c14401 = this.f11165;
        c14401.m34404(name, (ViewOnLongClickListenerC9963) null);
        c14401.m34403(m10706(c12687.getParent()), (View.OnLongClickListener) null);
        c14401.m34401(R.string.MT_Protector_res_0x7f120393);
        c14401.m34415(c12687.getSize());
        C21234 m30958 = c12687.m30958();
        if (m30958 != null) {
            c14401.m34411(m30958.m48197());
            c14401.m34394(R.string.MT_Protector_res_0x7f1207b0, C17283.m40576(m30958.m48200()));
            c14401.m34394(R.string.MT_Protector_res_0x7f1207b8, C9523.m24393(C16293.f50120.mo23554(), m30958.m48203()));
        } else {
            c14401.m34411(c12687.getTime());
        }
        c14401.m34408();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10712(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969() || !(interfaceC17889 instanceof C12687)) {
            throw new IllegalArgumentException();
        }
        C12687 c12687 = (C12687) interfaceC17889;
        String name = c12687.getName();
        C14401 c14401 = this.f11165;
        c14401.m34404(name, (ViewOnLongClickListenerC9963) null);
        c14401.m34403(m10706(c12687.getParent()), (View.OnLongClickListener) null);
        c14401.m34401(R.string.MT_Protector_res_0x7f1203fb);
        c14401.m34415(0L);
        C21234 m30958 = c12687.m30958();
        if (m30958 != null) {
            c14401.m34411(m30958.m48197());
            c14401.m34394(R.string.MT_Protector_res_0x7f1207b0, C17283.m40576(m30958.m48200()));
            c14401.m34394(R.string.MT_Protector_res_0x7f1207b8, C9523.m24393(C16293.f50120.mo23554(), m30958.m48203()));
        } else {
            c14401.m34411(c12687.getTime());
        }
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b1, new C5368()).m19153(8);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b2, new C11010(5));
        c14401.m34419();
        c14401.m34408();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10710(String str, List list) {
        C14401 c14401 = this.f11165;
        c14401.m34405(list);
        c14401.m34403(m10706(str), (View.OnLongClickListener) null);
        c14401.m34415(0L);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b1, new C12662(4)).m19153(8);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b2, new C3200(9));
        c14401.m34419();
        c14401.m34408();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10706(String str) {
        String m39731 = AbstractC16891.m39731(str);
        if (m39731.length() > 1 && m39731.indexOf(47, 1) == m39731.length() - 1) {
            m39731 = "/";
        }
        C6337 m29289 = C11982.m29289(m39731);
        String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1207df);
        if (m29289 == null) {
            return m14327.concat("/");
        }
        StringBuilder m15339 = C5368.m15339(m14327);
        m15339.append(m29289.m17614());
        return m15339.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10709(DialogInterface.OnDismissListener onDismissListener) {
        this.f11165.m34402(onDismissListener);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10708(int i, int i2, long j) {
        if (this.f11166 == null) {
            C14401 c14401 = this.f11165;
            this.f11166 = new TextView[]{c14401.m34410(R.string.MT_Protector_res_0x7f1207be).m19154(), c14401.m34410(R.string.MT_Protector_res_0x7f1207b1).m19154(), c14401.m34410(R.string.MT_Protector_res_0x7f1207b2).m19154()};
        }
        C15935.m37714(this.f11166[0], j);
        this.f11166[1].setText(String.valueOf(i));
        this.f11166[2].setText(String.valueOf(i2));
    }
}
