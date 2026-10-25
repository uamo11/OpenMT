package l;

import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Locale;

/* compiled from: I6X2 */
/* renamed from: l.۬ۤ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13060 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f39082 = {R.id.MT_Protector_res_0x7f0a0121, R.id.MT_Protector_res_0x7f0a0127, R.id.MT_Protector_res_0x7f0a0128, R.id.MT_Protector_res_0x7f0a0129, R.id.MT_Protector_res_0x7f0a012a, R.id.MT_Protector_res_0x7f0a012b, R.id.MT_Protector_res_0x7f0a012c, R.id.MT_Protector_res_0x7f0a012d, R.id.MT_Protector_res_0x7f0a012e, R.id.MT_Protector_res_0x7f0a0122, R.id.MT_Protector_res_0x7f0a0123, R.id.MT_Protector_res_0x7f0a0124, R.id.MT_Protector_res_0x7f0a0125, R.id.MT_Protector_res_0x7f0a0126};

    /* JADX WARN: Type inference failed for: r2v8, types: [l.᩶ۤ᩻] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31629(final AbstractActivityC3346 abstractActivityC3346, int i, C0421 c0421) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f7);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120596);
        final ImageView imageView = (ImageView) m10216.findViewById(R.id.icon);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
        int m27878 = C11266.m27878(48.0f);
        marginLayoutParams.height = m27878;
        marginLayoutParams.width = m27878;
        marginLayoutParams.topMargin = C11266.m27878(4.0f);
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setTranslationY(-marginLayoutParams.topMargin);
        final int[] iArr = {C21404.m48482(i)};
        final GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08013c);
        int round = Math.round((Math.min(imageView.getLayoutParams().width, imageView.getLayoutParams().height) * 0.39999998f) / 2.0f);
        imageView.setPadding(round, round, round, round);
        imageView.setClickable(false);
        imageView.setFocusable(false);
        imageView.setContentDescription(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120596));
        int m48483 = C21404.m48483(abstractActivityC3346, iArr[0]);
        gradientDrawable.setColor(m48483);
        imageView.setImageTintList(ColorStateList.valueOf(C7466.m20002(m48483) > 220 ? -12895429 : -1));
        ?? r2 = new View.OnClickListener() { // from class: l.᩶ۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int intValue = ((Integer) view.getTag()).intValue();
                iArr[0] = intValue;
                int m484832 = C21404.m48483(abstractActivityC3346, intValue);
                gradientDrawable.setColor(m484832);
                imageView.setImageTintList(ColorStateList.valueOf(C7466.m20002(m484832) > 220 ? -12895429 : -1));
            }
        };
        m31630(abstractActivityC3346, (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0108), 16777216, C21404.m48483(abstractActivityC3346, 16777216), r2);
        m31630(abstractActivityC3346, (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0104), 0, C21404.m48483(abstractActivityC3346, 0), r2);
        C16900 c16900 = (C16900) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0108).getLayoutParams();
        C16900 c169002 = (C16900) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0104).getLayoutParams();
        C16900 c169003 = (C16900) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0106).getLayoutParams();
        C16900 c169004 = (C16900) m10216.findViewById(R.id.divider).getLayoutParams();
        c16900.f51945 = R.id.MT_Protector_res_0x7f0a0121;
        c16900.f51895 = R.id.MT_Protector_res_0x7f0a0121;
        c169002.f51945 = R.id.MT_Protector_res_0x7f0a0127;
        c169002.f51895 = R.id.MT_Protector_res_0x7f0a0127;
        c169003.f51945 = R.id.MT_Protector_res_0x7f0a0128;
        c169003.f51895 = R.id.MT_Protector_res_0x7f0a0128;
        c169004.f51945 = R.id.MT_Protector_res_0x7f0a0108;
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0105).setVisibility(8);
        for (int i2 = 0; i2 < 14; i2++) {
            ImageView imageView2 = (ImageView) m10216.findViewById(f39082[i2]);
            ColorStateList imageTintList = imageView2.getImageTintList();
            C11003.requireNonNull(imageTintList);
            int defaultColor = imageTintList.getDefaultColor();
            m31630(abstractActivityC3346, imageView2, defaultColor, defaultColor, r2);
        }
        ImageView imageView3 = (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0106);
        imageView3.setContentDescription(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f1201a3));
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: l.ۙۤ᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                DialogInterfaceOnClickListenerC3677 dialogInterfaceOnClickListenerC3677 = new DialogInterfaceOnClickListenerC3677(abstractActivityC33462, false);
                final GradientDrawable gradientDrawable2 = gradientDrawable;
                final ImageView imageView4 = imageView;
                final int[] iArr2 = iArr;
                dialogInterfaceOnClickListenerC3677.m11203(new InterfaceC2266() { // from class: l.ۗۤ᩻
                    @Override // l.InterfaceC2266
                    /* renamed from: ۧ */
                    public final void mo7493(int i3) {
                        int m48482 = C21404.m48482(i3);
                        iArr2[0] = m48482;
                        int m484832 = C21404.m48483(abstractActivityC33462, m48482);
                        gradientDrawable2.setColor(m484832);
                        imageView4.setImageTintList(ColorStateList.valueOf(C7466.m20002(m484832) > 220 ? -12895429 : -1));
                    }
                });
                dialogInterfaceOnClickListenerC3677.m11202(C21404.m48483(abstractActivityC33462, iArr2[0]));
            }
        });
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC3134(2, c0421, iArr));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        C5088.m14637(buildDialog.m44438());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31630(AbstractActivityC3346 abstractActivityC3346, ImageView imageView, int i, int i2, ViewOnClickListenerC20117 viewOnClickListenerC20117) {
        String string;
        imageView.setImageTintList(ColorStateList.valueOf(i2));
        imageView.setTag(Integer.valueOf(i));
        int i3 = C21404.f68902;
        if (i == 0 || i == 16777216) {
            string = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120a6a);
        } else {
            string = String.format(Locale.ROOT, "#%06X", Integer.valueOf(16777215 & i2));
        }
        imageView.setContentDescription(string);
        imageView.setOnClickListener(viewOnClickListenerC20117);
    }
}
