package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: BAH0 */
/* renamed from: l.֡᩷᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0671 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f2585;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f2586;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f2587;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC17191 f2588 = null;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f2589;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public TextView[] f2590;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14401 f2591;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C16560 f2592;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List f2593;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2723(C0671 c0671, MenuItem menuItem) {
        List list = c0671.f2593;
        C16560 c16560 = c0671.f2592;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f1205eb) {
            new C8019(c16560, list).m21340(new RunnableC21134(c0671));
        } else if (itemId == R.string.MT_Protector_res_0x7f1205ea) {
            new C11256(c16560, list).m27858(new RunnableC21134(c0671));
        } else {
            if (itemId != R.string.MT_Protector_res_0x7f1205e9) {
                throw new RuntimeException();
            }
            new C3080(c16560, list).m9413(new RunnableC21134(c0671));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2724(C0671 c0671, String str, String str2, TextView textView, TextView textView2, Button button) {
        c0671.getClass();
        ViewOnClickListenerC14813.m35216(textView, str);
        ViewOnClickListenerC14813.m35216(textView2, str2);
        if (c0671.f2585) {
            return;
        }
        button.setVisibility(4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2726(C0671 c0671, C16477 c16477, TextView textView, Button button) {
        c0671.getClass();
        textView.setText(c16477.m38841());
        if (c0671.f2587) {
            return;
        }
        button.setVisibility(4);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2729(C0671 c0671, String str, String str2, TextView textView, TextView textView2, Button button) {
        c0671.getClass();
        ViewOnClickListenerC14813.m35216(textView, str);
        ViewOnClickListenerC14813.m35216(textView2, str2);
        if (c0671.f2585) {
            return;
        }
        button.setVisibility(4);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2730(C0671 c0671, C16477 c16477, TextView textView, Button button) {
        c0671.getClass();
        textView.setText(c16477.m38841());
        if (c0671.f2587) {
            return;
        }
        button.setVisibility(4);
    }

    public C0671(C16560 c16560, List list) {
        this.f2592 = c16560;
        this.f2593 = list;
        AbstractC3163 abstractC3163 = (AbstractC3163) c16560.m39044().mo6020();
        this.f2586 = abstractC3163;
        this.f2587 = abstractC3163.mo9708();
        this.f2585 = abstractC3163.mo9706();
        this.f2589 = abstractC3163.mo9687();
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        c14401.m34413();
        this.f2591 = c14401;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2733() {
        this.f2591.m34418();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2737(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.isDirectory() || !(interfaceC17889 instanceof AbstractC17191)) {
            throw new IllegalArgumentException();
        }
        AbstractC17191 abstractC17191 = (AbstractC17191) interfaceC17889;
        this.f2588 = abstractC17191;
        C14401 c14401 = this.f2591;
        c14401.m34407(abstractC17191);
        c14401.m34401(abstractC17191.mo36978() ? R.string.MT_Protector_res_0x7f12051a : R.string.MT_Protector_res_0x7f120393);
        c14401.m34415(abstractC17191.getSize());
        if (abstractC17191.getTime() != -1) {
            c14401.m34411(abstractC17191.getTime());
        }
        if (abstractC17191.mo36978()) {
            this.f2587 = false;
            this.f2585 = false;
            this.f2589 = false;
        }
        final C16477 mo24428 = abstractC17191.mo24428();
        if (mo24428 != null) {
            c14401.m34399(new InterfaceC17224() { // from class: l.ۡ᩷᩻
                @Override // l.InterfaceC17224
                /* renamed from: ֫ */
                public final void mo7075(TextView textView, Button button) {
                    C0671.m2730(C0671.this, mo24428, textView, button);
                }
            }).m41938(8);
            final String m38837 = mo24428.m38837();
            final String m38833 = mo24428.m38833();
            if (!TextUtils.isEmpty(m38837) || !TextUtils.isEmpty(m38833)) {
                c14401.m34398(new InterfaceC16518() { // from class: l.ܺ᩷᩻
                    @Override // l.InterfaceC16518
                    /* renamed from: ֫ */
                    public final void mo12661(TextView textView, TextView textView2, Button button) {
                        C0671.m2724(C0671.this, m38837, m38833, textView, textView2, button);
                    }
                }).m27175();
            }
        } else {
            this.f2587 = false;
            this.f2585 = false;
        }
        if (abstractC17191.mo36978()) {
            c14401.m34397(abstractC17191.mo36977(), (View.OnClickListener) null).m19153(6);
        }
        c14401.m34417();
        c14401.m34408();
        C6058.m16907(c14401.m34409(), this.f2592, this.f2588);
        m2738(false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2739(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969() || !(interfaceC17889 instanceof AbstractC17191)) {
            throw new IllegalArgumentException();
        }
        AbstractC17191 abstractC17191 = (AbstractC17191) interfaceC17889;
        this.f2588 = abstractC17191;
        C14401 c14401 = this.f2591;
        c14401.m34407(abstractC17191);
        c14401.m34401(abstractC17191.mo36978() ? R.string.MT_Protector_res_0x7f12051a : R.string.MT_Protector_res_0x7f1203fb);
        c14401.m34415(0L);
        if (abstractC17191.getTime() != -1) {
            c14401.m34411(abstractC17191.getTime());
        }
        if (abstractC17191.mo36978()) {
            this.f2587 = false;
            this.f2585 = false;
            this.f2589 = false;
        }
        final C16477 mo24428 = abstractC17191.mo24428();
        if (mo24428 != null) {
            c14401.m34399(new InterfaceC17224() { // from class: l.ۖ᩷᩻
                @Override // l.InterfaceC17224
                /* renamed from: ֫ */
                public final void mo7075(TextView textView, Button button) {
                    C0671.m2726(C0671.this, mo24428, textView, button);
                }
            }).m41938(8);
            final String m38837 = mo24428.m38837();
            final String m38833 = mo24428.m38833();
            if (!TextUtils.isEmpty(m38837) || !TextUtils.isEmpty(m38833)) {
                c14401.m34398(new InterfaceC16518() { // from class: l.ۘ᩷᩻
                    @Override // l.InterfaceC16518
                    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                    public final void mo12661(TextView textView, TextView textView2, Button button) {
                        C0671.m2729(C0671.this, m38837, m38833, textView, textView2, button);
                    }
                }).m27175();
            }
        } else {
            this.f2587 = false;
            this.f2585 = false;
        }
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b1, new C19033(4)).m19153(8);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b2, new C13540());
        if (abstractC17191.mo36978()) {
            c14401.m34397(abstractC17191.mo36977(), (View.OnClickListener) null).m19153(6);
        }
        c14401.m34419();
        c14401.m34408();
        m2738(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2736(String str) {
        List list = this.f2593;
        C14401 c14401 = this.f2591;
        c14401.m34405(list);
        c14401.m34403(str, (View.OnLongClickListener) null);
        c14401.m34415(0L);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b1, new C18566(7)).m19153(8);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b2, new C19370());
        c14401.m34419();
        c14401.m34408();
        m2738(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2738(final boolean z) {
        boolean z2 = this.f2589;
        C14401 c14401 = this.f2591;
        if (z2) {
            c14401.m34406(new InterfaceC13041() { // from class: l.ᩴ᩷᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C7140 c7140 = (C7140) obj;
                    ViewOnClickListenerC14813.m35217(c7140.m19154());
                    TextView m19154 = c7140.m19154();
                    final C0671 c0671 = C0671.this;
                    m19154.setOnClickListener(new View.OnClickListener() { // from class: l.ܿ᩷᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C0671.m2722(C0671.this);
                        }
                    });
                }
            });
        }
        if (this.f2587) {
            c14401.m34416(new InterfaceC13041() { // from class: l.᩵᩷᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C17930 c17930 = (C17930) obj;
                    C19890.m45741(c17930.m41940());
                    final C0671 c0671 = C0671.this;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܳ᩷᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C0671.m2732(C0671.this);
                        }
                    };
                    c17930.m41940().setOnClickListener(onClickListener);
                    c17930.m41939().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f2585) {
            c14401.m34412(new InterfaceC13041() { // from class: l.ܽ᩷᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C10875 c10875 = (C10875) obj;
                    C19890.m45741(c10875.m27172());
                    C19890.m45741(c10875.m27174());
                    final C0671 c0671 = C0671.this;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۜ᩷᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C0671.m2731(C0671.this);
                        }
                    };
                    c10875.m27172().setOnClickListener(onClickListener);
                    c10875.m27174().setOnClickListener(onClickListener);
                    c10875.m27173().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f2589 || (z && (this.f2587 || this.f2585))) {
            c14401.m34414().setOnClickListener(new View.OnClickListener() { // from class: l.ᩳ᩷᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0671.m2727(C0671.this, z, view);
                }
            });
        } else {
            c14401.m34414().setVisibility(8);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2727(final C0671 c0671, boolean z, View view) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        C3060 m48304 = c21282.m48304();
        if (c0671.f2589) {
            m48304.add(0, R.string.MT_Protector_res_0x7f1205eb, 0, R.string.MT_Protector_res_0x7f1205eb);
        }
        if (z && c0671.f2587) {
            m48304.add(0, R.string.MT_Protector_res_0x7f1205ea, 0, R.string.MT_Protector_res_0x7f1205ea);
        }
        if (z && c0671.f2585) {
            m48304.add(0, R.string.MT_Protector_res_0x7f1205e9, 0, R.string.MT_Protector_res_0x7f1205e9);
        }
        c21282.m48302(new InterfaceC14930() { // from class: l.᩻᩷᩻
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                C0671.m2723(C0671.this, menuItem);
                return true;
            }
        });
        c21282.m48305();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2722(C0671 c0671) {
        new C8019(c0671.f2592, c0671.f2593).m21340(new RunnableC21134(c0671));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m2732(C0671 c0671) {
        new C11256(c0671.f2592, c0671.f2593).m27858(new RunnableC21134(c0671));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m2731(C0671 c0671) {
        new C3080(c0671.f2592, c0671.f2593).m9413(new RunnableC21134(c0671));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m2728(final C0671 c0671) {
        C16477 mo24428;
        C16477 mo244282;
        C14401 c14401 = c0671.f2591;
        if (c0671.f2588 != null) {
            if (c0671.f2589) {
                c14401.m34406(new InterfaceC13041() { // from class: l.ۢ᩷᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        ((C7140) obj).m19154().setText(C17283.m40576(C0671.this.f2588.getTime()));
                    }
                });
            }
            if (c0671.f2587 && (mo244282 = c0671.f2588.mo24428()) != null) {
                c14401.m34416(new C6382(1, mo244282));
            }
            if (c0671.f2585 && (mo24428 = c0671.f2588.mo24428()) != null) {
                c14401.m34412(new C12027(1, mo24428));
            }
        }
        C12327.m29911(1000);
        C15528.m36595(c0671.f2586.mo9688());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2735(DialogInterface.OnDismissListener onDismissListener) {
        this.f2591.m34402(onDismissListener);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2734(int i, int i2, long j) {
        if (this.f2590 == null) {
            C14401 c14401 = this.f2591;
            this.f2590 = new TextView[]{c14401.m34410(R.string.MT_Protector_res_0x7f1207be).m19154(), c14401.m34410(R.string.MT_Protector_res_0x7f1207b1).m19154(), c14401.m34410(R.string.MT_Protector_res_0x7f1207b2).m19154()};
        }
        C15935.m37714(this.f2590[0], j);
        this.f2590[1].setText(String.valueOf(i));
        this.f2590[2].setText(String.valueOf(i2));
    }
}
