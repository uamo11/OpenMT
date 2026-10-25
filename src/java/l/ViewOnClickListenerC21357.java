package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 28VT */
/* renamed from: l.᩸ۙܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC21357 extends AbstractC3255 implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f68801;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ImageView f68802;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22062 f68803;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC21357(ActivityC22062 activityC22062, View view) {
        super(view);
        this.f68803 = activityC22062;
        this.f68802 = (ImageView) view.findViewById(R.id.icon);
        this.f68801 = (TextView) view.findViewById(R.id.textView);
        C19890.m45744(view);
        int i = C18342.f56999;
        view.setOnTouchListener(new ViewOnTouchListenerC16930());
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m48396() {
        List list;
        List list2;
        List list3;
        int size;
        List list4;
        List list5;
        List list6;
        int bindingAdapterPosition = getBindingAdapterPosition();
        int i = bindingAdapterPosition - 1;
        ActivityC22062 activityC22062 = this.f68803;
        list = activityC22062.f70702;
        if (list.isEmpty()) {
            size = bindingAdapterPosition - 3;
        } else {
            list2 = activityC22062.f70702;
            if (i < list2.size()) {
                list4 = activityC22062.f70702;
                return list4.get(i);
            }
            list3 = activityC22062.f70702;
            size = i - (list3.size() + 1);
        }
        list5 = activityC22062.f70699;
        if (size < list5.size()) {
            list6 = activityC22062.f70699;
            return list6.get(size);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ۢۙܽ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object m48396 = m48396();
        boolean z = m48396 instanceof AbstractC13262;
        ActivityC22062 activityC22062 = this.f68803;
        if (!z) {
            if (m48396 instanceof AbstractC15440) {
                C3178 c3178 = new C3178(activityC22062, (AbstractC15440) m48396);
                c3178.m9743((C9363) new InterfaceC13041() { // from class: l.ۢۙܽ
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        ActivityC22062 activityC220622 = ViewOnClickListenerC21357.this.f68803;
                        activityC220622.f70704 = ((AbstractC15440) obj).getName();
                        ActivityC22062.m49637(activityC220622);
                        C21374.m48457(R.string.MT_Protector_res_0x7f120487);
                    }
                });
                c3178.m9742();
                return;
            }
            return;
        }
        AbstractC13262 abstractC13262 = (AbstractC13262) m48396;
        RunnableC16203 runnableC16203 = new RunnableC16203(1, activityC22062, abstractC13262);
        if (abstractC13262.mo32195()) {
            C22435.f72683 = true;
            C8863.m22894(new C14300(runnableC16203), abstractC13262, activityC22062);
        } else {
            runnableC16203.run();
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Object m48396 = m48396();
        if (m48396 instanceof AbstractC13262) {
            final AbstractC13262 abstractC13262 = (AbstractC13262) m48396;
            C21282 c21282 = new C21282(view.getContext(), view, 0);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205f9, 0, R.string.MT_Protector_res_0x7f1205f9).setIcon(R.drawable.MT_Protector_res_0x7f080231);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e6);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120a0e, 0, R.string.MT_Protector_res_0x7f120a0e).setIcon(R.drawable.MT_Protector_res_0x7f080247);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120351, 0, R.string.MT_Protector_res_0x7f120351).setIcon(R.drawable.MT_Protector_res_0x7f080214);
            c21282.m48304().add(0, R.string.MT_Protector_res_0x7f120352, 0, R.string.MT_Protector_res_0x7f120352).setIcon(R.drawable.MT_Protector_res_0x7f0801f6);
            c21282.m48306();
            c21282.m48302(new InterfaceC14930() { // from class: l.ۡۙܽ
                @Override // l.InterfaceC14930
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    final ViewOnClickListenerC21357 viewOnClickListenerC21357 = ViewOnClickListenerC21357.this;
                    ActivityC22062 activityC22062 = viewOnClickListenerC21357.f68803;
                    int itemId = menuItem.getItemId();
                    final AbstractC13262 abstractC132622 = abstractC13262;
                    if (itemId == R.string.MT_Protector_res_0x7f1205f9) {
                        C7951 c7951 = new C7951(viewOnClickListenerC21357, activityC22062, abstractC132622);
                        c7951.m31258(R.string.MT_Protector_res_0x7f1205f9);
                        c7951.m31250((CharSequence) abstractC132622.mo14006());
                        c7951.m31244();
                        c7951.m31281();
                        c7951.m31266(true);
                        return true;
                    }
                    if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
                        C19258 buildDialog = activityC22062.buildDialog();
                        buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                        buildDialog.m44424(activityC22062.getString(R.string.MT_Protector_res_0x7f120870, abstractC132622.mo10324()));
                        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۘۙܽ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                ViewOnClickListenerC21357 viewOnClickListenerC213572 = ViewOnClickListenerC21357.this;
                                viewOnClickListenerC213572.getClass();
                                abstractC132622.mo14005();
                                ActivityC22062.m49637(viewOnClickListenerC213572.f68803);
                            }
                        });
                        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                        buildDialog.m44438();
                        return true;
                    }
                    if (itemId == R.string.MT_Protector_res_0x7f120a0e) {
                        if (!C23196.m51460()) {
                            C21374.m48457(R.string.MT_Protector_res_0x7f120757);
                            new ViewOnClickListenerC0059(activityC22062);
                            return true;
                        }
                        if (!C23196.m51454()) {
                            C21374.m48457(R.string.MT_Protector_res_0x7f120415);
                            return true;
                        }
                        ActivityC22062.m49628(activityC22062, abstractC132622, new Runnable() { // from class: l.ᩴۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i;
                                ViewOnClickListenerC21357 viewOnClickListenerC213572 = ViewOnClickListenerC21357.this;
                                final ActivityC22062 activityC220622 = viewOnClickListenerC213572.f68803;
                                final C0895 c0895 = new C0895(viewOnClickListenerC213572);
                                View m10216 = activityC220622.m10216(R.layout.MT_Protector_res_0x7f0d00be);
                                ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120a0e);
                                final RadioButton[] radioButtonArr = {(RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a), (RadioButton) m10216.findViewById(R.id.radioButton3)};
                                radioButtonArr[0].setTag(C4925.m14327(R.string.MT_Protector_res_0x7f12047f));
                                radioButtonArr[1].setTag(C4925.m14327(R.string.MT_Protector_res_0x7f120481));
                                radioButtonArr[2].setTag(C4925.m14327(R.string.MT_Protector_res_0x7f120483));
                                final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017c);
                                final TextView textView = (TextView) m10216.findViewById(R.id.textView2);
                                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۚۤܿ
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        RadioButton[] radioButtonArr2 = radioButtonArr;
                                        int length = radioButtonArr2.length;
                                        int i2 = 0;
                                        while (true) {
                                            boolean z = true;
                                            if (i2 >= length) {
                                                break;
                                            }
                                            RadioButton radioButton = radioButtonArr2[i2];
                                            if (view2 != radioButton) {
                                                z = false;
                                            }
                                            radioButton.setChecked(z);
                                            i2++;
                                        }
                                        editText.setVisibility(view2 != radioButtonArr2[1] ? 8 : 0);
                                        textView.setText((String) view2.getTag());
                                    }
                                };
                                for (int i2 = 0; i2 < 3; i2++) {
                                    radioButtonArr[i2].setOnClickListener(onClickListener);
                                }
                                C19258 buildDialog2 = activityC220622.buildDialog();
                                buildDialog2.m44421(m10216);
                                buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                                buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                                final DialogInterfaceC0206 m44438 = buildDialog2.m44438();
                                final AbstractC13262 abstractC132623 = abstractC132622;
                                if (abstractC132623 instanceof C22435) {
                                    i = 0;
                                } else if (abstractC132623 instanceof C20319) {
                                    editText.setHint(R.string.MT_Protector_res_0x7f120af3);
                                    i = 1;
                                } else {
                                    if (!(abstractC132623 instanceof C4796) && !(abstractC132623 instanceof C12557)) {
                                        throw new AssertionError();
                                    }
                                    i = 2;
                                }
                                onClickListener.onClick(radioButtonArr[i]);
                                m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨ۤܿ
                                    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                    @Override // android.view.View.OnClickListener
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void onClick(android.view.View r14) {
                                        /*
                                            r13 = this;
                                            android.widget.RadioButton[] r14 = r1
                                            r0 = 0
                                            r1 = r14[r0]
                                            boolean r1 = r1.isChecked()
                                            int r2 = r2
                                            l.֡ۚۢ r3 = r3
                                            l.ۗܺ᩷ r4 = r4
                                            l.۬ܿᩳ r5 = r5
                                            l.֨ۙܽ r6 = r6
                                            if (r1 == 0) goto L24
                                            if (r2 != 0) goto L1b
                                            r3.dismiss()
                                            return
                                        L1b:
                                            l.ۙۤܿ r14 = new l.ۙۤܿ
                                            r14.<init>(r4, r5, r3, r6)
                                            r14.m20274()
                                            return
                                        L24:
                                            r1 = 1
                                            r14 = r14[r1]
                                            boolean r14 = r14.isChecked()
                                            r7 = 0
                                            if (r14 == 0) goto L9d
                                            android.widget.EditText r14 = r7
                                            int r8 = r14.length()
                                            if (r8 != 0) goto L46
                                            if (r2 != r1) goto L3c
                                            r3.dismiss()
                                            return
                                        L3c:
                                            r0 = 2131886853(0x7f120305, float:1.9408297E38)
                                            l.C21374.m48457(r0)
                                            r14.requestFocus()
                                            return
                                        L46:
                                            if (r2 != r1) goto L57
                                            l.ܶ᩵ܿ r8 = l.C20319.m46627(r5)     // Catch: java.lang.Exception -> L54
                                            byte[] r8 = r8.m36506()     // Catch: java.lang.Exception -> L54
                                            r5.mo14005()     // Catch: java.lang.Exception -> L8e
                                            goto L58
                                        L54:
                                            r14 = move-exception
                                            r8 = r7
                                            goto L8f
                                        L57:
                                            r8 = r7
                                        L58:
                                            l.ܶ᩵ܿ r9 = l.C8863.m22897()     // Catch: java.lang.Exception -> L8e
                                            java.lang.String r10 = r5.mo14006()     // Catch: java.lang.Exception -> L8e
                                            java.security.cert.X509Certificate r11 = r5.m32197()     // Catch: java.lang.Exception -> L8e
                                            byte[] r11 = r11.getEncoded()     // Catch: java.lang.Exception -> L8e
                                            java.security.PrivateKey r12 = r5.m32193()     // Catch: java.lang.Exception -> L8e
                                            byte[] r12 = r12.getEncoded()     // Catch: java.lang.Exception -> L8e
                                            android.text.Editable r14 = r14.getText()     // Catch: java.lang.Exception -> L8e
                                            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> L8e
                                            l.ܶ᩵ܿ r14 = l.C20319.m46628(r9, r10, r11, r12, r14)     // Catch: java.lang.Exception -> L8e
                                            r5.mo14000()     // Catch: java.lang.Exception -> L8e
                                            if (r2 == r1) goto L84
                                            r5.mo14005()     // Catch: java.lang.Exception -> L8e
                                        L84:
                                            l.C15528.m36596()     // Catch: java.lang.Exception -> L8e
                                            r3.dismiss()     // Catch: java.lang.Exception -> L8e
                                            r6.accept(r14)     // Catch: java.lang.Exception -> L8e
                                            goto Ld4
                                        L8e:
                                            r14 = move-exception
                                        L8f:
                                            if (r8 == 0) goto Ld1
                                            l.ܶ᩵ܿ r1 = l.C20319.m46627(r5)     // Catch: java.io.IOException -> Ld1
                                            r1.getClass()     // Catch: java.io.IOException -> Ld1
                                            int r2 = r8.length     // Catch: java.io.IOException -> Ld1
                                            r1.m36503(r8, r0, r2)     // Catch: java.io.IOException -> Ld1
                                            goto Ld1
                                        L9d:
                                            r14 = 2
                                            if (r2 != r14) goto La4
                                            r3.dismiss()
                                            return
                                        La4:
                                            l.ܶ᩵ܿ r14 = l.C8863.m22897()     // Catch: java.lang.Exception -> Ld0
                                            java.lang.String r0 = r5.mo14006()     // Catch: java.lang.Exception -> Ld0
                                            java.security.cert.X509Certificate r1 = r5.m32197()     // Catch: java.lang.Exception -> Ld0
                                            byte[] r1 = r1.getEncoded()     // Catch: java.lang.Exception -> Ld0
                                            java.security.PrivateKey r2 = r5.m32193()     // Catch: java.lang.Exception -> Ld0
                                            byte[] r2 = r2.getEncoded()     // Catch: java.lang.Exception -> Ld0
                                            l.ܶ᩵ܿ r14 = l.C4796.m13999(r14, r0, r1, r2)     // Catch: java.lang.Exception -> Ld0
                                            r5.mo14000()     // Catch: java.lang.Exception -> Ld0
                                            r5.mo14005()     // Catch: java.lang.Exception -> Ld0
                                            l.C15528.m36596()     // Catch: java.lang.Exception -> Ld0
                                            r3.dismiss()     // Catch: java.lang.Exception -> Ld0
                                            r6.accept(r14)     // Catch: java.lang.Exception -> Ld0
                                            return
                                        Ld0:
                                            r14 = move-exception
                                        Ld1:
                                            r4.m10223(r14, r7)
                                        Ld4:
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC1061.onClick(android.view.View):void");
                                    }
                                });
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector_res_0x7f120351) {
                        if (!C23196.m51460()) {
                            C21374.m48457(R.string.MT_Protector_res_0x7f120757);
                            new ViewOnClickListenerC0059(activityC22062);
                            return true;
                        }
                        if (!C23196.m51454()) {
                            C21374.m48457(R.string.MT_Protector_res_0x7f120415);
                            return true;
                        }
                        ActivityC22062.m49628(activityC22062, abstractC132622, new Runnable() { // from class: l.᩵ۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                final ViewOnClickListenerC21357 viewOnClickListenerC213572 = ViewOnClickListenerC21357.this;
                                C14341 c14341 = new C14341(viewOnClickListenerC213572.f68803, new InterfaceC13041() { // from class: l.ۚۙܽ
                                    @Override // l.InterfaceC13041
                                    public final void accept(Object obj) {
                                        ActivityC22062 activityC220622 = ViewOnClickListenerC21357.this.f68803;
                                        activityC220622.f70695 = ((AbstractC15440) obj).getName();
                                        ActivityC22062.m49637(activityC220622);
                                    }
                                });
                                c14341.m34224(abstractC132622);
                                c14341.m34223();
                            }
                        });
                        return true;
                    }
                    if (itemId == R.string.MT_Protector_res_0x7f120352) {
                        if (!C23196.m51460()) {
                            C21374.m48457(R.string.MT_Protector_res_0x7f120757);
                            new ViewOnClickListenerC0059(activityC22062);
                            return true;
                        }
                        if (!C23196.m51454()) {
                            C21374.m48457(R.string.MT_Protector_res_0x7f120415);
                            return true;
                        }
                        ActivityC22062.m49628(activityC22062, abstractC132622, new Runnable() { // from class: l.֡ۙܽ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C6273 c6273;
                                ActivityC22062 activityC220622 = ViewOnClickListenerC21357.this.f68803;
                                AbstractC13262 abstractC132623 = abstractC132622;
                                activityC220622.f70697 = abstractC132623;
                                c6273 = activityC220622.f70693;
                                c6273.getClass();
                                C6273.m17282(c6273, R.string.MT_Protector_res_0x7f1205fc, (String) null, abstractC132623.mo14006() + "_key.zip", new String[]{"zip"}, 16);
                            }
                        });
                    }
                    return true;
                }
            });
            C18342.m42767(view, c21282);
            return true;
        }
        if (!(m48396 instanceof AbstractC15440)) {
            return false;
        }
        final AbstractC15440 abstractC15440 = (AbstractC15440) m48396;
        C21282 c212822 = new C21282(view.getContext(), view, 0);
        c212822.m48304().add(0, R.string.MT_Protector_res_0x7f1205f9, 0, R.string.MT_Protector_res_0x7f1205f9).setIcon(R.drawable.MT_Protector_res_0x7f080231);
        c212822.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca).setIcon(R.drawable.MT_Protector_res_0x7f0801e6);
        c212822.m48306();
        c212822.m48302(new InterfaceC14930() { // from class: l.ܺۙܽ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                final ViewOnClickListenerC21357 viewOnClickListenerC21357 = ViewOnClickListenerC21357.this;
                ActivityC22062 activityC22062 = viewOnClickListenerC21357.f68803;
                int itemId = menuItem.getItemId();
                final AbstractC15440 abstractC154402 = abstractC15440;
                if (itemId == R.string.MT_Protector_res_0x7f1205f9) {
                    C15005 c15005 = new C15005(viewOnClickListenerC21357, activityC22062, abstractC154402);
                    c15005.m31258(R.string.MT_Protector_res_0x7f1205f9);
                    c15005.m31250((CharSequence) abstractC154402.m36517());
                    c15005.m31244();
                    c15005.m31281();
                    c15005.m31266(true);
                    return true;
                }
                if (itemId == R.string.MT_Protector_res_0x7f1205ca) {
                    C19258 buildDialog = activityC22062.buildDialog();
                    buildDialog.m44433(R.string.MT_Protector_res_0x7f120b7b);
                    buildDialog.m44424(activityC22062.getString(R.string.MT_Protector_res_0x7f120870, abstractC154402.getName()));
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۖۙܽ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            ViewOnClickListenerC21357 viewOnClickListenerC213572 = ViewOnClickListenerC21357.this;
                            viewOnClickListenerC213572.getClass();
                            abstractC154402.mo27929();
                            ActivityC22062.m49637(viewOnClickListenerC213572.f68803);
                        }
                    });
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog.m44438();
                }
                return true;
            }
        });
        C18342.m42767(view, c212822);
        return true;
    }
}
