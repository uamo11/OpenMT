package l;

import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 51Z1 */
/* renamed from: l.֨ۨܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1099 extends AbstractC1661 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static long f3999;

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(final C2450 c2450) {
        c2450.m7907("local");
        final ArrayList arrayList = new ArrayList();
        Iterator it = c2450.m7909().iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC17889) it.next()).getPath());
        }
        final C9340 m39016 = c2450.m7921().m39016();
        if (arrayList.size() <= 5) {
            C9068.m23418(arrayList, m39016.m24082());
            m3771(c2450.m7917());
            return;
        }
        C19258 buildDialog = c2450.m7917().buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f1205ae);
        buildDialog.m44424(C4925.m14306(R.string.MT_Protector_res_0x7f12002e, Integer.valueOf(arrayList.size())));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۚۨܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C9068.m23418(arrayList, m39016.m24082());
                C1099.m3771(c2450.m7917());
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [l.᩻ܶܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3771(Main main) {
        if (C20958.m47777() && System.currentTimeMillis() - f3999 > 60000) {
            View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d0020);
            PopupWindow popupWindow = new PopupWindow(m10216, -1, -1, true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(-2013265920));
            popupWindow.showAtLocation(main.findViewById(R.id.MT_Protector_res_0x7f0a0172), 0, 0, 0);
            final View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0443);
            final int m27878 = C11266.m27878(200.0f);
            final C11346 c11346 = new C11346();
            c11346.mo28073(0.0f, 1.0f);
            c11346.m28072((C23779) new InterfaceC21929() { // from class: l.᩻ܶܳ
                @Override // l.InterfaceC21929
                /* renamed from: ֫ */
                public final Object mo18064(float f, Float f2, Float f3) {
                    float f4 = f * 1.4f;
                    View view = findViewById;
                    if (f4 <= 0.2f) {
                        view.setAlpha(f4 * 5.0f);
                        view.setTranslationY(0.0f);
                    } else {
                        int i = m27878;
                        if (f4 <= 1.2f) {
                            view.setAlpha(1.0f);
                            view.setTranslationY((-i) * (f4 - 0.2f));
                        } else {
                            view.setAlpha(1.0f - ((f4 - 1.2f) * 5.0f));
                            view.setTranslationY(-i);
                        }
                    }
                    return 0;
                }
            });
            c11346.mo28076(1200L);
            c11346.m28080();
            c11346.m28077();
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.ۜܶܳ
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    C11346.this.m28068();
                }
            });
            m10216.findViewById(R.id.textView3).setOnClickListener(new ViewOnClickListenerC15566(3, popupWindow));
            f3999 = System.currentTimeMillis();
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120030);
    }
}
