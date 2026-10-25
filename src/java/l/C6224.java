package l;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import bin.mt.plus.R;

/* compiled from: R6KO */
/* renamed from: l.ۛᩳܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6224 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17145(final C16560 c16560, final InterfaceC17889 interfaceC17889) {
        C18904 c18904;
        String m43636;
        C9732 c9732;
        final AbstractC16891 m39044 = c16560.m39044();
        final boolean equals = "multipart/related".equals(C1285.m4347(interfaceC17889.getName()));
        try {
            c18904 = C18904.m43631(c16560, interfaceC17889);
        } catch (IllegalArgumentException unused) {
            c18904 = null;
        }
        C19258 buildDialog = c16560.m39056().buildDialog();
        Context m44432 = buildDialog.m44432();
        LinearLayout linearLayout = new LinearLayout(m44432);
        linearLayout.setOrientation(1);
        int m17143 = m17143(m44432, 24);
        linearLayout.setPadding(m17143, m17143(m44432, 12), m17143, 0);
        final C1264 c1264 = new C1264(C4925.f15527);
        if (c18904 == null) {
            m43636 = null;
        } else {
            m43636 = equals ? c18904.m43636() : c1264.m4323(c18904);
        }
        final boolean[] zArr = {false};
        if (equals || c18904 == null) {
            c9732 = null;
        } else {
            m17144(linearLayout, m44432.getString(R.string.MT_Protector_res_0x7f12045a), 14, false, 0);
            C14615 c14615 = new C14615(m44432);
            c14615.setTextSize(14.0f);
            c14615.setTextColor(C21943.f70284);
            c14615.setText("/" + c18904.m43637(m43636));
            C9732 c97322 = new C9732(m44432, c18904, m43636, new C3402(zArr, c14615, c18904));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = m17143(m44432, 10);
            linearLayout.addView(c97322, layoutParams);
            m17144(linearLayout, m44432.getString(R.string.MT_Protector_res_0x7f120459), 12, true, 14);
            linearLayout.addView(c14615);
            buildDialog.m44435(linearLayout);
            c9732 = c97322;
        }
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120145);
        final C9732 c97323 = c9732;
        final C18904 c189042 = c18904;
        buildDialog.m44434(R.string.MT_Protector_res_0x7f1202dd, new DialogInterface.OnClickListener() { // from class: l.۬ᩳܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C16560 c165602 = C16560.this;
                if (c165602.m39044() == m39044) {
                    C9732 c97324 = c97323;
                    if (c97324 != null) {
                        c1264.m4324(c189042, c97324.m24723(), zArr[0]);
                    }
                    C19568.m45007(c165602, interfaceC17889, ActivityC16315.class);
                }
            }
        });
        final C18904 c189043 = c18904;
        final C9732 c97324 = c9732;
        final String str = m43636;
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12079c, new DialogInterface.OnClickListener() { // from class: l.۫ᩳܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C16560 c165602 = C16560.this;
                if (c165602.m39044() != m39044) {
                    return;
                }
                C18904 c189044 = c189043;
                if (c189044 == null) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f120711);
                    return;
                }
                C9732 c97325 = c97324;
                String m24723 = c97325 == null ? str : c97325.m24723();
                ActivityC0921.m3294(c165602, interfaceC17889, c189044, m24723, new RunnableC10458(equals, c1264, c189044, m24723, zArr));
            }
        });
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17144(LinearLayout linearLayout, String str, int i, boolean z, int i2) {
        Context context = linearLayout.getContext();
        C14615 c14615 = new C14615(context);
        c14615.setText(str);
        c14615.setTextSize(i);
        c14615.setTextColor(z ? C21943.f70269 : C21943.f70284);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = m17143(context, i2);
        linearLayout.addView(c14615, layoutParams);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17143(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }
}
