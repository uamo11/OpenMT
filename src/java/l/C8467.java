package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: 164Z */
/* renamed from: l.۠᩹ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8467 implements InterfaceC2054 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19554 f25893;

    @Override // l.InterfaceC2054
    /* renamed from: ֫ */
    public final /* synthetic */ String mo6739() {
        return null;
    }

    @Override // l.InterfaceC2054
    /* renamed from: ܽ */
    public final /* synthetic */ boolean mo6742() {
        return false;
    }

    @Override // l.InterfaceC2054
    /* renamed from: ֫ */
    public final void mo6740(final Main main) {
        C19554 c19554 = this.f25893;
        final String m44968 = c19554.m44968("ad_title", null);
        String m449682 = c19554.m44968("ad_msg", null);
        String m449683 = c19554.m44968("ad_button", null);
        String m449684 = c19554.m44968("ad_copy_text", null);
        String m449685 = c19554.m44968("ad_open_url", null);
        C19258 buildDialog = main.buildDialog();
        buildDialog.m44436(m44968);
        buildDialog.m44424(m449682);
        buildDialog.m44441(m449683, (DialogInterface.OnClickListener) null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f120189, (DialogInterface.OnClickListener) null);
        buildDialog.m44437("不再显示", (DialogInterface.OnClickListener) null);
        buildDialog.m44428(false);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        C5088.m14637(m44438);
        m44438.m1447().setOnClickListener(new ViewOnClickListenerC0705(m449685, main, m449684));
        m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩹ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19258 buildDialog2 = main.buildDialog();
                buildDialog2.m44433(R.string.MT_Protector_res_0x7f120b7b);
                buildDialog2.m44424("是否从工具中隐藏「" + m44968 + "」？");
                final C8467 c8467 = C8467.this;
                final DialogInterfaceC0206 dialogInterfaceC0206 = m44438;
                buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.֨᩹ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        ApplicationC20075.f65008.edit().putString("show_ad_in_tools", C8467.this.f25893.m44968("ad_hide_obj", "")).apply();
                        dialogInterfaceC0206.dismiss();
                        C16870.m39669();
                    }
                });
                buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                buildDialog2.m44438();
            }
        });
        m44438.m1448().setTextColor(C21943.f70273);
        m44438.m1448().setAlpha(0.7f);
        Window m1445 = m44438.m1445();
        if (m1445 != null) {
            View findViewById = m1445.findViewById(android.R.id.message);
            if (findViewById instanceof TextView) {
                TextView textView = (TextView) findViewById;
                textView.setTextIsSelectable(true);
                textView.setLineSpacing(0.0f, 1.2f);
            }
        }
    }

    public C8467(C19554 c19554) {
        this.f25893 = c19554;
    }

    @Override // l.InterfaceC2054
    public final String getName() {
        return this.f25893.m44968("ad_title", "");
    }

    @Override // l.InterfaceC2054
    /* renamed from: ۧ */
    public final C11813 mo6741() {
        return C19883.f64225.f64248;
    }
}
