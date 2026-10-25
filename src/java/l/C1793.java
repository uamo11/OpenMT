package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 65FC */
/* renamed from: l.֫ۧ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1793 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f6190;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14401 f6191;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9555 f6192;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextView[] f6193;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16560 f6194;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6189 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6188 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5967(C1793 c1793, MenuItem menuItem) {
        List list = c1793.f6190;
        C16560 c16560 = c1793.f6194;
        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1205eb) {
            new C23396(c16560, list).m51844(new RunnableC1000(1, c1793));
        } else if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1205ea) {
            new C14929(c16560, list).m35378(new RunnableC1000(1, c1793));
        } else {
            new C8580(c16560, list).m22294(new RunnableC1000(1, c1793));
        }
    }

    public C1793(C16560 c16560, List list) {
        this.f6194 = c16560;
        this.f6190 = list;
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        c14401.m34413();
        this.f6191 = c14401;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5975() {
        this.f6191.m34418();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5979(InterfaceC17889 interfaceC17889) {
        boolean z;
        String path;
        if (interfaceC17889.isDirectory() || !(interfaceC17889 instanceof C9555)) {
            throw new IllegalArgumentException();
        }
        C9555 c9555 = (C9555) interfaceC17889;
        this.f6192 = c9555;
        AbstractC15440 mo24433 = c9555.mo24433();
        C14401 c14401 = this.f6191;
        c14401.m34407(c9555);
        c14401.m34401(c9555.mo36978() ? R.string.MT_Protector_res_0x7f12051a : R.string.MT_Protector_res_0x7f120393);
        long size = c9555.getSize();
        final long mo36979 = c9555.mo36979();
        if (mo36979 != -1 && size != mo36979) {
            c14401.m34395(R.string.MT_Protector_res_0x7f1207b5, new C5729(1, size)).m19153(8);
            c14401.m34395(R.string.MT_Protector_res_0x7f1207ad, new InterfaceC1702() { // from class: l.۬֫᩻
                @Override // l.InterfaceC1702
                /* renamed from: ֫ */
                public final void mo5714(TextView textView) {
                    C15935.m37713(textView, mo36979);
                }
            });
            c14401.m34411(c9555.getTime()).m19153(8);
        } else {
            c14401.m34415(size);
            c14401.m34411(c9555.getTime());
        }
        final ArrayList arrayList = new ArrayList(2);
        if (C9555.m24427(c9555.mo24428())) {
            if (mo24433.mo35196()) {
                this.f6188 = false;
            } else {
                try {
                    if (mo24433 instanceof C11893) {
                        path = ((C11893) mo24433).m29018();
                    } else {
                        path = c9555.getPath();
                    }
                    c9555.m24429(new C16477(C20402.m46724(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f6188 = false;
                }
                this.f6189 = mo24433.mo27912();
            }
            z = false;
            this.f6189 = mo24433.mo27912();
        } else {
            z = true;
        }
        if (z) {
            final C16477 mo24428 = c9555.mo24428();
            c14401.m34399(new InterfaceC17224() { // from class: l.ۨ֫᩻
                @Override // l.InterfaceC17224
                /* renamed from: ֫ */
                public final void mo7075(TextView textView, Button button) {
                    textView.setText(C16477.this.m38841());
                    arrayList.add(button);
                }
            }).m41938(6);
            c14401.m34398(new InterfaceC16518() { // from class: l.᩺֫᩻
                @Override // l.InterfaceC16518
                /* renamed from: ֫ */
                public final void mo12661(TextView textView, TextView textView2, Button button) {
                    C16477 c16477 = C16477.this;
                    textView.setText(c16477.m38837());
                    textView2.setText(c16477.m38833());
                    arrayList.add(button);
                }
            }).m27175();
        }
        if (c9555.mo36978()) {
            c14401.m34397(c9555.mo36977(), new ViewOnClickListenerC3868(2, this)).m19153(6);
            this.f6189 = false;
            this.f6188 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        if (c9555.m24430()) {
            c14401.m34417();
            c14401.m34408();
            C6058.m16907(c14401.m34409(), this.f6194, c9555);
        } else {
            c14401.m34408();
        }
        if (this.f6188 && mo24433.mo36530()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m5970(true);
            return;
        }
        m5970(false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5980(InterfaceC17889 interfaceC17889) {
        boolean z;
        String path;
        if (interfaceC17889.mo36969() || !(interfaceC17889 instanceof C9555)) {
            throw new IllegalArgumentException();
        }
        C9555 c9555 = (C9555) interfaceC17889;
        this.f6192 = c9555;
        AbstractC15440 mo24433 = c9555.mo24433();
        C14401 c14401 = this.f6191;
        c14401.m34407(c9555);
        c14401.m34401(c9555.mo36978() ? R.string.MT_Protector_res_0x7f12051a : R.string.MT_Protector_res_0x7f1203fb);
        c14401.m34415(0L);
        c14401.m34411(c9555.getTime());
        final ArrayList arrayList = new ArrayList(2);
        if (c9555.m24435()) {
            this.f6188 = false;
            this.f6189 = false;
            z = false;
        } else if (C9555.m24427(c9555.mo24428())) {
            if (mo24433.mo35196()) {
                this.f6188 = false;
            } else {
                try {
                    if (mo24433 instanceof C11893) {
                        path = ((C11893) mo24433).m29018();
                    } else {
                        path = c9555.getPath();
                    }
                    c9555.m24429(new C16477(C20402.m46724(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f6188 = false;
                }
                this.f6189 = mo24433.mo27912();
            }
            z = false;
            this.f6189 = mo24433.mo27912();
        } else {
            z = true;
        }
        if (z) {
            final C16477 mo24428 = c9555.mo24428();
            c14401.m34399(new InterfaceC17224() { // from class: l.ܰ֫᩻
                @Override // l.InterfaceC17224
                /* renamed from: ֫ */
                public final void mo7075(TextView textView, Button button) {
                    textView.setText(C16477.this.m38841());
                    arrayList.add(button);
                }
            }).m41938(6);
            c14401.m34398(new InterfaceC16518() { // from class: l.۟֫᩻
                @Override // l.InterfaceC16518
                /* renamed from: ֫ */
                public final void mo12661(TextView textView, TextView textView2, Button button) {
                    C16477 c16477 = C16477.this;
                    textView.setText(c16477.m38837());
                    textView2.setText(c16477.m38833());
                    arrayList.add(button);
                }
            }).m27175();
        }
        if (c9555.mo36978()) {
            c14401.m34397(c9555.mo36977(), new ViewOnClickListenerC3868(2, this)).m19153(6);
            this.f6189 = false;
            this.f6188 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b1, new C11010(4)).m19153(8);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b2, new C12662(3));
        c14401.m34419();
        c14401.m34408();
        if (this.f6188 && mo24433.mo36530()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m5970(true);
            return;
        }
        m5970(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5978(String str) {
        List list = this.f6190;
        C14401 c14401 = this.f6191;
        c14401.m34405(list);
        c14401.m34403(str, (View.OnLongClickListener) null);
        c14401.m34415(0L);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b1, new C3200(8)).m19153(8);
        c14401.m34395(R.string.MT_Protector_res_0x7f1207b2, new C18307());
        c14401.m34419();
        c14401.m34408();
        AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
        if (m39866.mo23126() && !(m39866 instanceof C13198)) {
            this.f6188 = false;
            this.f6189 = false;
        }
        m5970(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5970(final boolean z) {
        boolean z2 = this.f6189;
        C14401 c14401 = this.f6191;
        if (z2) {
            c14401.m34406(new InterfaceC13041() { // from class: l.᩸֫᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C7140 c7140 = (C7140) obj;
                    ViewOnClickListenerC14813.m35217(c7140.m19154());
                    c7140.m19154().setOnClickListener(new ViewOnClickListenerC9135(2, C1793.this));
                }
            });
        }
        if (this.f6188) {
            c14401.m34416(new InterfaceC13041() { // from class: l.᩹֫᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C17930 c17930 = (C17930) obj;
                    C19890.m45741(c17930.m41940());
                    ViewOnClickListenerC2825 viewOnClickListenerC2825 = new ViewOnClickListenerC2825(1, C1793.this);
                    c17930.m41940().setOnClickListener(viewOnClickListenerC2825);
                    c17930.m41939().setOnClickListener(viewOnClickListenerC2825);
                }
            });
            c14401.m34412(new InterfaceC13041() { // from class: l.᩶֫᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C10875 c10875 = (C10875) obj;
                    final C1793 c1793 = C1793.this;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۗ֫᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1793.m5972(C1793.this);
                        }
                    };
                    C19890.m45741(c10875.m27172());
                    C19890.m45741(c10875.m27174());
                    c10875.m27172().setOnClickListener(onClickListener);
                    c10875.m27174().setOnClickListener(onClickListener);
                    c10875.m27173().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f6189 || (z && this.f6188)) {
            c14401.m34414().setOnClickListener(new View.OnClickListener() { // from class: l.ۙ֫᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1793.m5969(C1793.this, z, view);
                }
            });
        } else {
            c14401.m34414().setVisibility(8);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5969(C1793 c1793, boolean z, View view) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        C3060 m48304 = c21282.m48304();
        if (c1793.f6189) {
            m48304.add(0, R.string.MT_Protector_res_0x7f1205eb, 0, R.string.MT_Protector_res_0x7f1205eb);
        }
        if (z && c1793.f6188) {
            m48304.add(0, R.string.MT_Protector_res_0x7f1205ea, 0, R.string.MT_Protector_res_0x7f1205ea);
            m48304.add(0, R.string.MT_Protector_res_0x7f1205e9, 0, R.string.MT_Protector_res_0x7f1205e9);
        }
        c21282.m48302((InterfaceC14930) new C21847(c1793));
        c21282.m48305();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5966(C1793 c1793) {
        new C23396(c1793.f6194, c1793.f6190).m51844(new RunnableC1000(1, c1793));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m5974(C1793 c1793) {
        new C14929(c1793.f6194, c1793.f6190).m35378(new RunnableC1000(1, c1793));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m5972(C1793 c1793) {
        new C8580(c1793.f6194, c1793.f6190).m22294(new RunnableC1000(1, c1793));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5971(final C1793 c1793) {
        C14401 c14401 = c1793.f6191;
        if (c1793.f6192 != null) {
            if (c1793.f6189) {
                c14401.m34406(new InterfaceC13041() { // from class: l.۫֫᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        ((C7140) obj).m19154().setText(C17283.m40576(C1793.this.f6192.getTime()));
                    }
                });
            }
            if (c1793.f6188) {
                final C16477 mo24428 = c1793.f6192.mo24428();
                c14401.m34416(new InterfaceC13041() { // from class: l.ۤ֫᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        ((C17930) obj).m41940().setText(C16477.this.m38841());
                    }
                });
                c14401.m34412(new InterfaceC13041() { // from class: l.ۛ֫᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        C10875 c10875 = (C10875) obj;
                        TextView m27172 = c10875.m27172();
                        C16477 c16477 = C16477.this;
                        m27172.setText(c16477.m38837());
                        c10875.m27174().setText(c16477.m38833());
                    }
                });
            }
        }
        C12327.m29911(1000);
        C15528.m36596();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5977(DialogInterface.OnDismissListener onDismissListener) {
        this.f6191.m34402(onDismissListener);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5976(int i, int i2, long j) {
        if (this.f6193 == null) {
            C14401 c14401 = this.f6191;
            this.f6193 = new TextView[]{c14401.m34410(R.string.MT_Protector_res_0x7f1207be).m19154(), c14401.m34410(R.string.MT_Protector_res_0x7f1207b1).m19154(), c14401.m34410(R.string.MT_Protector_res_0x7f1207b2).m19154()};
        }
        C15935.m37714(this.f6193[0], j);
        this.f6193[1].setText(String.valueOf(i));
        this.f6193[2].setText(String.valueOf(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0065, code lost:
    
        r2 = r4.mo23554();
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m5973(l.C1793 r6) {
        /*
            l.ܽۢܳ r0 = r6.f6194
            l.ۢۧ᩻ r1 = r6.f6192
            l.ܶ᩵ܿ r1 = r1.mo24433()
            java.lang.String r2 = r1.mo27935()
            r3 = 0
            if (r2 != 0) goto L11
            r2 = r3
            goto L6e
        L11:
            java.lang.String r4 = "/"
            boolean r4 = r2.startsWith(r4)
            if (r4 == 0) goto L1a
            goto L6e
        L1a:
            l.ܶ᩵ܿ r4 = r1.m36514()
        L1e:
            if (r4 == 0) goto L6a
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L65
            java.lang.String r5 = "."
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L2f
            goto L65
        L2f:
            java.lang.String r5 = ".."
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L3c
            java.lang.String r2 = r4.getParent()
            goto L6e
        L3c:
            java.lang.String r5 = "./"
            boolean r5 = r2.startsWith(r5)
            if (r5 == 0) goto L4a
            r5 = 2
            java.lang.String r2 = r2.substring(r5)
            goto L1e
        L4a:
            java.lang.String r5 = "../"
            boolean r5 = r2.startsWith(r5)
            if (r5 == 0) goto L5c
            r5 = 3
            java.lang.String r2 = r2.substring(r5)
            l.ܶ᩵ܿ r4 = r4.m36536()
            goto L1e
        L5c:
            l.ܶ᩵ܿ r1 = r4.m36526(r2)
            java.lang.String r2 = r1.mo23554()
            goto L6e
        L65:
            java.lang.String r2 = r4.mo23554()
            goto L6e
        L6a:
            java.lang.String r2 = r1.mo23554()
        L6e:
            if (r2 != 0) goto L71
            goto L78
        L71:
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            l.ܶ᩵ܿ r3 = l.C16999.m39866(r2, r1)
        L78:
            if (r3 != 0) goto L7b
            return
        L7b:
            l.ܳ۠ܳ r6 = r6.f6191
            r6.m34400()
            boolean r6 = r3.mo23113()
            r1 = 1
            if (r6 == 0) goto L8f
            java.lang.String r6 = r3.mo23554()
            r0.m39033(r6, r1)
            return
        L8f:
            java.lang.String r6 = r3.getParent()
            if (r6 == 0) goto La0
            java.lang.String r2 = r3.getName()
            r0.m39053(r2)
            r0.m39033(r6, r1)
            return
        La0:
            java.lang.String r6 = r3.mo23554()
            r0.m39033(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1793.m5973(l.֫ۧ᩻):void");
    }
}
