package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 98EM */
/* renamed from: l.ܳ۠ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14401 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f43381;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f43382;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17606 f43383;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f43385;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6128 f43386;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public View f43388;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C6128 f43389;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19720 f43387 = new C19720();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f43384 = R.string.MT_Protector_res_0x7f120000;

    public C14401(Main main) {
        this.f43381 = main;
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00e1);
        C17606 c17606 = (C17606) m10216.findViewById(R.id.MT_Protector_res_0x7f0a010c);
        this.f43383 = c17606;
        this.f43382 = (ProgressBar) c17606.findViewById(R.id.MT_Protector_res_0x7f0a0458);
        this.f43386 = (C6128) c17606.findViewById(R.id.MT_Protector_res_0x7f0a024a);
        this.f43389 = (C6128) c17606.findViewById(R.id.MT_Protector_res_0x7f0a0432);
        this.f43388 = c17606.findViewById(R.id.MT_Protector_res_0x7f0a0636);
        C19258 buildDialog = main.buildDialog();
        buildDialog.m44421(m10216);
        this.f43385 = buildDialog.m44415();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m34419() {
        this.f43382.setVisibility(0);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m34418() {
        this.f43382.setVisibility(8);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7140 m34410(int i) {
        Object obj = this.f43387.get(i);
        if (obj instanceof C7140) {
            return (C7140) obj;
        }
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34406(InterfaceC13041 interfaceC13041) {
        Object obj = this.f43387.get(R.string.MT_Protector_res_0x7f1207c0);
        if (obj instanceof C7140) {
            interfaceC13041.accept((C7140) obj);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m34416(InterfaceC13041 interfaceC13041) {
        Object obj = this.f43387.get(R.string.MT_Protector_res_0x7f1207bb);
        if (obj instanceof C17930) {
            interfaceC13041.accept((C17930) obj);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34412(InterfaceC13041 interfaceC13041) {
        Object obj = this.f43387.get(R.string.MT_Protector_res_0x7f1207b9);
        if (obj instanceof C10875) {
            interfaceC13041.accept((C10875) obj);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34395(int i, InterfaceC1702 interfaceC1702) {
        C19720 c19720 = this.f43387;
        if (c19720.mo2422(i)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f43381;
        TextView textView = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        TextView textView2 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        int i2 = this.f43384;
        this.f43384 = i2 + 1;
        textView.setId(i2);
        int i3 = this.f43384;
        this.f43384 = i3 + 1;
        textView2.setId(i3);
        textView.setText(i);
        C16900 c16900 = new C16900(-2);
        c16900.f51889 = textView2.getId();
        c16900.f51945 = 0;
        C17606 c17606 = this.f43383;
        c17606.addView(textView, c16900);
        C16900 c169002 = new C16900(0);
        c169002.setMarginStart(C11266.m27878(8.0f));
        ((ViewGroup.MarginLayoutParams) c169002).topMargin = C11266.m27878(this.f43388.getId() == R.id.MT_Protector_res_0x7f0a0636 ? 0 : 1);
        c169002.f51895 = 0;
        c169002.f51943 = R.id.MT_Protector_res_0x7f0a024a;
        c169002.f51939 = this.f43388.getId();
        c17606.addView(textView2, c169002);
        this.f43386.m20229(textView);
        C7140 c7140 = new C7140(textView, textView2);
        c19720.mo2318(i, c7140);
        this.f43388 = textView2;
        if (interfaceC1702 != null) {
            interfaceC1702.mo5714(textView2);
        }
        return c7140;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17930 m34399(InterfaceC17224 interfaceC17224) {
        C19720 c19720 = this.f43387;
        if (c19720.mo2422(R.string.MT_Protector_res_0x7f1207bb)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f43381;
        TextView textView = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        TextView textView2 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        Button button = (Button) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01df);
        int i = this.f43384;
        this.f43384 = i + 1;
        textView.setId(i);
        int i2 = this.f43384;
        this.f43384 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f43384;
        this.f43384 = i3 + 1;
        button.setId(i3);
        textView.setText(R.string.MT_Protector_res_0x7f1207bb);
        C16900 c16900 = new C16900(-2);
        c16900.f51889 = textView2.getId();
        c16900.f51945 = 0;
        C17606 c17606 = this.f43383;
        c17606.addView(textView, c16900);
        C16900 c169002 = new C16900(-2);
        c169002.setMarginStart(C11266.m27878(8.0f));
        c169002.f51943 = R.id.MT_Protector_res_0x7f0a024a;
        c169002.f51898 = button.getId();
        c169002.f51914 = button.getId();
        c17606.addView(textView2, c169002);
        C16900 c169003 = new C16900(-2);
        c169003.setMarginStart(C11266.m27878(4.0f));
        ((ViewGroup.MarginLayoutParams) c169003).topMargin = C11266.m27878(this.f43388.getId() == R.id.MT_Protector_res_0x7f0a0636 ? 0 : 1);
        c169003.f51943 = R.id.MT_Protector_res_0x7f0a0432;
        c169003.f51939 = this.f43388.getId();
        c17606.addView(button, c169003);
        this.f43386.m20229(textView);
        this.f43389.m20229(textView2);
        C17930 c17930 = new C17930(textView, textView2, button);
        c19720.mo2318(R.string.MT_Protector_res_0x7f1207bb, c17930);
        this.f43388 = button;
        interfaceC17224.mo7075(textView2, button);
        return c17930;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10875 m34398(InterfaceC16518 interfaceC16518) {
        C19720 c19720 = this.f43387;
        if (c19720.mo2422(R.string.MT_Protector_res_0x7f1207b9)) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = this.f43381;
        TextView textView = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        TextView textView2 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        TextView textView3 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        TextView textView4 = (TextView) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01e0);
        Button button = (Button) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d01df);
        int i = this.f43384;
        this.f43384 = i + 1;
        textView.setId(i);
        int i2 = this.f43384;
        this.f43384 = i2 + 1;
        textView2.setId(i2);
        int i3 = this.f43384;
        this.f43384 = i3 + 1;
        textView3.setId(i3);
        int i4 = this.f43384;
        this.f43384 = i4 + 1;
        textView4.setId(i4);
        int i5 = this.f43384;
        this.f43384 = i5 + 1;
        button.setId(i5);
        textView.setText(R.string.MT_Protector_res_0x7f1207b9);
        C16900 c16900 = new C16900(-2);
        c16900.f51889 = textView3.getId();
        c16900.f51945 = 0;
        C17606 c17606 = this.f43383;
        c17606.addView(textView, c16900);
        C16900 c169002 = new C16900(-2);
        c169002.setMarginStart(C11266.m27878(8.0f));
        ((ViewGroup.MarginLayoutParams) c169002).topMargin = C11266.m27878(this.f43388.getId() == R.id.MT_Protector_res_0x7f0a0636 ? 0 : 1);
        c169002.f51943 = R.id.MT_Protector_res_0x7f0a024a;
        c169002.f51939 = this.f43388.getId();
        c17606.addView(textView3, c169002);
        textView2.setText(R.string.MT_Protector_res_0x7f1207b3);
        C16900 c169003 = new C16900(-2);
        c169003.f51889 = textView4.getId();
        c169003.f51945 = 0;
        c17606.addView(textView2, c169003);
        C16900 c169004 = new C16900(-2);
        c169004.setMarginStart(C11266.m27878(8.0f));
        ((ViewGroup.MarginLayoutParams) c169004).topMargin = C11266.m27878(1.0f);
        c169004.f51943 = R.id.MT_Protector_res_0x7f0a024a;
        c169004.f51939 = textView3.getId();
        c17606.addView(textView4, c169004);
        C16900 c169005 = new C16900(-2);
        c169005.setMarginStart(C11266.m27878(4.0f));
        c169005.f51943 = R.id.MT_Protector_res_0x7f0a0432;
        c169005.f51898 = textView3.getId();
        c169005.f51914 = textView4.getId();
        c17606.addView(button, c169005);
        C6128 c6128 = this.f43386;
        c6128.m20229(textView);
        c6128.m20229(textView2);
        C6128 c61282 = this.f43389;
        c61282.m20229(textView3);
        c61282.m20229(textView4);
        C10875 c10875 = new C10875(textView, textView3, textView2, textView4, button);
        c19720.mo2318(R.string.MT_Protector_res_0x7f1207b9, c10875);
        this.f43388 = textView4;
        interfaceC16518.mo12661(textView3, textView4, button);
        return c10875;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m34420() {
        this.f43385.m1434(-1, this.f43381.getString(R.string.MT_Protector_res_0x7f120189), null);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m34417() {
        this.f43385.m1434(-2, this.f43381.getString(R.string.MT_Protector_res_0x7f12016c), null);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m34413() {
        this.f43385.m1434(-3, this.f43381.getString(R.string.MT_Protector_res_0x7f120634), null);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m34408() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f43385;
        dialogInterfaceC0206.m1449();
        C8960.m23097(dialogInterfaceC0206);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34400() {
        this.f43385.dismiss();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34402(DialogInterface.OnDismissListener onDismissListener) {
        this.f43385.m1436(onDismissListener);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Button m34409() {
        return this.f43385.m1446();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Button m34414() {
        return this.f43385.m1448();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34394(int i, String str) {
        return m34395(i, new C2144(str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34405(List list) {
        m34395(R.string.MT_Protector_res_0x7f1207b7, new C23674(list));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34404(String str, ViewOnLongClickListenerC9963 viewOnLongClickListenerC9963) {
        m34395(R.string.MT_Protector_res_0x7f1207b7, new C11374(str, viewOnLongClickListenerC9963));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34403(String str, View.OnLongClickListener onLongClickListener) {
        m34395(R.string.MT_Protector_res_0x7f1207ba, new C5030(str, onLongClickListener));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnLongClickListener, l.ۤ֨ܳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34407(final C15688 c15688) {
        ?? r0 = new View.OnLongClickListener() { // from class: l.ۤ֨ܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C4925.m14308(R.string.MT_Protector_res_0x7f120411, C15688.this.getPath());
                return true;
            }
        };
        m34404(C6554.m18061(500, c15688.getName()), (ViewOnLongClickListenerC9963) r0);
        m34403(C6554.m18061(500, c15688.getParent()), (View.OnLongClickListener) r0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34401(final int i) {
        m34395(R.string.MT_Protector_res_0x7f1207c1, new InterfaceC1702() { // from class: l.᩺֨ܳ
            @Override // l.InterfaceC1702
            /* renamed from: ֫ */
            public final void mo5714(TextView textView) {
                textView.setText(i);
            }
        });
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7140 m34415(long j) {
        return m34395(R.string.MT_Protector_res_0x7f1207be, new C5729(0, j));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34396(long j) {
        return m34395(R.string.MT_Protector_res_0x7f1207af, new C14192(j));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7140 m34411(long j) {
        return m34394(R.string.MT_Protector_res_0x7f1207c0, C17283.m40576(j));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7140 m34397(String str, View.OnClickListener onClickListener) {
        return m34395(R.string.MT_Protector_res_0x7f1207b4, new C8779(1, onClickListener, str));
    }
}
