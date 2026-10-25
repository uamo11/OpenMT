package l;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: 34MM */
/* renamed from: l.᩸ܺۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC21681 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public LayoutInflater f69543;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f69544;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C4348 f69545;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f69547;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f69550;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f69551;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f69542 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int f69541 = View.MeasureSpec.makeMeasureSpec(0, 0);

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f69546 = new ArrayList(10);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC15329 f69549 = null;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4192 f69548 = null;

    public ViewOnClickListenerC21681(Main main, View view) {
        this.f69550 = main;
        this.f69551 = view;
        this.f69543 = LayoutInflater.from(main);
        this.f69547 = main.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48951(View view, C8275 c8275) {
        if (c8275 != null) {
            String str = c8275.f25446;
            boolean z = c8275.f25447;
            view.setTag(c8275);
            TextView textView = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a0631);
            ImageView imageView = (ImageView) view.findViewById(R.id.icon);
            imageView.setImageTintList(C21943.f70268);
            textView.setText(str);
            if (z) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) "￼");
                float textSize = textView.getTextSize();
                spannableStringBuilder.setSpan(new C1219(Math.max(C11266.m27878(4.0f), Math.round(0.28f * textSize)), Math.max(C11266.m27878(4.0f), Math.round(0.14f * textSize)), Math.max(1, Math.round(textSize * 0.02f))), length, length + 1, 33);
                str = spannableStringBuilder;
            }
            textView.setText(str);
            textView.setEllipsize(z ? TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END);
            int i = c8275.f25444;
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageResource(i);
            }
            if (c8275.f25443) {
                view.setOnClickListener(this);
            } else if (z) {
                imageView.setDuplicateParentStateEnabled(false);
                textView.setDuplicateParentStateEnabled(false);
                imageView.setEnabled(false);
                textView.setEnabled(false);
            } else {
                view.setEnabled(false);
            }
            if (z) {
                view.setOnLongClickListener(this);
                return;
            }
            return;
        }
        view.setVisibility(4);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m48953() {
        if (!ApplicationC20075.f65008.getBoolean("sdrmlct", true)) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((C8275) arrayList.get(i)).f25447) {
                return true;
            }
            i++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48950(View view) {
        int i = 0;
        view.findViewById(R.id.MT_Protector_res_0x7f0a0160).setVisibility(0);
        TextView textView = (TextView) view.findViewById(R.id.double_row_menu_tip_text);
        ImageView imageView = (ImageView) view.findViewById(R.id.double_row_menu_tip_close);
        textView.setTextColor(C21943.f70269);
        String string = this.f69550.getString(R.string.MT_Protector_res_0x7f1202ca, "￼");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int indexOf = string.indexOf("￼");
        if (indexOf >= 0) {
            float textSize = textView.getTextSize();
            int max = Math.max(C11266.m27878(4.0f), Math.round(0.28f * textSize));
            int max2 = Math.max(C11266.m27878(2.0f), Math.round(textSize * 0.06f));
            spannableStringBuilder.setSpan(new C1219(max, max2, max2), indexOf, indexOf + 1, 33);
        }
        textView.setText(spannableStringBuilder);
        imageView.setColorFilter(C21943.f70269);
        imageView.setOnClickListener(new ViewOnClickListenerC5453(this, view, i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48952(ViewOnClickListenerC21681 viewOnClickListenerC21681, View view) {
        C4348 c4348;
        ApplicationC20075.f65008.edit().putBoolean("sdrmlct", false).apply();
        view.findViewById(R.id.MT_Protector_res_0x7f0a0160).setVisibility(8);
        if (Build.VERSION.SDK_INT > 22 || (c4348 = viewOnClickListenerC21681.f69545) == null || !c4348.isShowing()) {
            return;
        }
        View findViewById = viewOnClickListenerC21681.f69545.getContentView().findViewById(R.id.double_row_menu_tip_text);
        viewOnClickListenerC21681.f69545.setHeight((r0.getHeight() - findViewById.getHeight()) - 1);
        C4348 c43482 = viewOnClickListenerC21681.f69545;
        c43482.update(c43482.getWidth(), viewOnClickListenerC21681.f69545.getHeight());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48954() {
        int i;
        int i2;
        int i3;
        int i4;
        C8275 c8275;
        int i5;
        AbstractActivityC3346 abstractActivityC3346 = this.f69550;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01b2);
        LinearLayout linearLayout = (LinearLayout) m10216.findViewById(R.id.linearLayout);
        C4348 c4348 = new C4348(abstractActivityC3346, null, R.attr.MT_Protector_res_0x7f0403bd);
        this.f69545 = c4348;
        Drawable background = c4348.getBackground();
        if (background != null) {
            Rect rect = new Rect();
            background.getPadding(rect);
            i = rect.left + rect.right;
            i2 = rect.top + rect.bottom;
        } else {
            i = 0;
            i2 = 0;
        }
        int i6 = this.f69547 - i;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            int size = arrayList.size();
            i3 = f69541;
            i4 = f69542;
            if (i7 >= size) {
                break;
            }
            int i11 = i7 + 1;
            C8275 c82752 = (C8275) arrayList.get(i7);
            int i12 = i2;
            if (i11 != arrayList.size()) {
                i5 = i7 + 2;
                c8275 = (C8275) arrayList.get(i11);
            } else {
                c8275 = null;
                i5 = i11;
            }
            int i13 = i5;
            View inflate = this.f69543.inflate(R.layout.MT_Protector_res_0x7f0d01b3, (ViewGroup) linearLayout, false);
            if (i8 == 0) {
                inflate.measure(i4, i3);
                i8 = inflate.getMeasuredHeight();
            }
            View findViewById = inflate.findViewById(R.id.MT_Protector_res_0x7f0a0358);
            View findViewById2 = inflate.findViewById(R.id.MT_Protector_res_0x7f0a0359);
            m48951(findViewById, c82752);
            m48951(findViewById2, c8275);
            linearLayout.addView(inflate);
            i10 += i8;
            if (i9 != i6) {
                int max = Math.max(findViewById.getMeasuredWidth(), findViewById2.getMeasuredWidth()) << 1;
                if (max > i9) {
                    i9 = max;
                }
                if (i9 > i6) {
                    i9 = i6;
                }
            }
            i2 = i12;
            i7 = i13;
        }
        int i14 = i2;
        boolean m48953 = m48953();
        if (m48953) {
            m48950(m10216);
        }
        this.f69545.setContentView(m10216);
        if (Build.VERSION.SDK_INT <= 22) {
            if (m48953) {
                if (i9 > 0) {
                    i4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                }
                m10216.measure(i4, i3);
                i10 = m10216.getMeasuredHeight();
            }
            this.f69545.setWidth(i9 + i);
            int identifier = abstractActivityC3346.getResources().getIdentifier("status_bar_height", "dimen", "android");
            this.f69545.setHeight(Math.min(i10 + i14, (abstractActivityC3346.getWindow().getDecorView().getHeight() - (identifier > 0 ? abstractActivityC3346.getResources().getDimensionPixelSize(identifier) : 0)) - i14));
        }
        this.f69545.setOutsideTouchable(true);
        this.f69545.setFocusable(true);
        this.f69545.setInputMethodMode(2);
        ((FrameLayout) abstractActivityC3346.m10241(android.R.id.content)).getChildAt(0).getWindowVisibleDisplayFrame(new Rect());
        View view = this.f69551;
        view.getLocationInWindow(new int[2]);
        this.f69545.showAtLocation(view, 17, 0, 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48959() {
        C8275 c8275;
        AbstractActivityC3346 abstractActivityC3346 = this.f69550;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01b2);
        LinearLayout linearLayout = (LinearLayout) m10216.findViewById(R.id.linearLayout);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C8275 c82752 = (C8275) arrayList.get(i);
            if (i2 != arrayList.size()) {
                i += 2;
                c8275 = (C8275) arrayList.get(i2);
            } else {
                c8275 = null;
                i = i2;
            }
            View inflate = this.f69543.inflate(R.layout.MT_Protector_res_0x7f0d01b3, (ViewGroup) linearLayout, false);
            View findViewById = inflate.findViewById(R.id.MT_Protector_res_0x7f0a0358);
            View findViewById2 = inflate.findViewById(R.id.MT_Protector_res_0x7f0a0359);
            m48951(findViewById, c82752);
            m48951(findViewById2, c8275);
            linearLayout.addView(inflate);
        }
        if (m48953()) {
            m48950(m10216);
        }
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        this.f69544 = c19258.m44438();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48960() {
        AbstractActivityC3346 abstractActivityC3346 = this.f69550;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01b2);
        ViewGroup.LayoutParams layoutParams = m10216.getLayoutParams();
        layoutParams.width = -1;
        m10216.setLayoutParams(layoutParams);
        View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a04cc);
        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
        layoutParams2.width = 0;
        findViewById.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) m10216.findViewById(R.id.linearLayout);
        ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
        layoutParams3.width = -1;
        linearLayout.setLayoutParams(layoutParams3);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f69546;
            if (i >= arrayList.size()) {
                break;
            }
            int i2 = i + 1;
            C8275 c8275 = (C8275) arrayList.get(i);
            View inflate = this.f69543.inflate(R.layout.MT_Protector_res_0x7f0d01b4, (ViewGroup) linearLayout, false);
            m48951(inflate, c8275);
            linearLayout.addView(inflate);
            i = i2;
        }
        if (m48953()) {
            m48950(m10216);
        }
        int i3 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        this.f69544 = c19258.m44438();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        C11003.requireNonNull(tag);
        C8275 c8275 = (C8275) tag;
        if (c8275.f25443) {
            InterfaceC15329 interfaceC15329 = this.f69549;
            if (interfaceC15329 != null) {
                interfaceC15329.mo8585(c8275.f25445);
            }
            C4348 c4348 = this.f69545;
            if (c4348 != null) {
                c4348.dismiss();
                this.f69545 = null;
            }
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f69544;
            if (dialogInterfaceC0206 != null) {
                dialogInterfaceC0206.dismiss();
                this.f69544 = null;
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        C4192 c4192;
        Object tag = view.getTag();
        C11003.requireNonNull(tag);
        C8275 c8275 = (C8275) tag;
        if (!c8275.f25447 || (c4192 = this.f69548) == null) {
            return false;
        }
        if (!C16560.m38981(c4192.f13647, c4192.f13648, c4192.f13649, c4192.f13650, c8275.f25445)) {
            return false;
        }
        C4348 c4348 = this.f69545;
        if (c4348 != null) {
            c4348.dismiss();
            this.f69545 = null;
        }
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f69544;
        if (dialogInterfaceC0206 == null) {
            return true;
        }
        dialogInterfaceC0206.dismiss();
        this.f69544 = null;
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48955(int i, int i2) {
        this.f69546.add(new C8275(this.f69550.getString(i), i2, 0, true, false));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48956(String str, int i, int i2, boolean z, boolean z2) {
        this.f69546.add(new C8275(str, i, i2, z, z2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48958(InterfaceC15329 interfaceC15329) {
        this.f69549 = interfaceC15329;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48957(C4192 c4192) {
        this.f69548 = c4192;
    }
}
