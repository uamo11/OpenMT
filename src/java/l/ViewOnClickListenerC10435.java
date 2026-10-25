package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* compiled from: I5G5 */
/* renamed from: l.ۤܿۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC10435 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5062 f31349;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f31350;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f31351;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f31352;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f31353;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f31354;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f31355;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5062 f31356;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f31357;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12366 f31358;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f31359;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC12551 f31360;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Spinner f31361;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC10435(ActivityC17169 activityC17169, C12366 c12366) {
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f31351 = interfaceC12344;
        this.f31359 = activityC17169;
        this.f31358 = c12366;
        View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d009a);
        this.f31352 = m10216;
        C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f31349 = c5062;
        C5062 c50622 = (C5062) m10216.findViewById(R.id.editText2);
        this.f31356 = c50622;
        c5062.m14602(C2353.m7663(), (String) null);
        c50622.m14602(C2353.m7662(), (String) null);
        this.f31357 = m10216.findViewById(R.id.linearLayout);
        this.f31361 = (Spinner) m10216.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f31353 = checkBox;
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f31354 = checkBox2;
        CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f31355 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new C22585(this, 1));
        checkBox.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", false));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26276(ViewOnClickListenerC10435 viewOnClickListenerC10435, boolean z) {
        viewOnClickListenerC10435.f31349.m14609(z);
        viewOnClickListenerC10435.f31356.m14612(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26278(C0941 c0941) {
        this.f31360 = new C21597(this, c0941.m3355());
        int i = this.f31351.getInt("dex_search_type", 0) == 4 ? 1 : 0;
        Spinner spinner = this.f31361;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26277() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f31359);
        c19258.m44421(this.f31352);
        DialogInterfaceC0206 m19253 = C7187.m19253(c19258, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f31350 = m19253;
        m19253.m1447().setOnClickListener(this);
        this.f31349.m14608(0);
        C4925.m14329(this.f31356.m14607());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5062 c5062 = this.f31349;
        String obj = c5062.m14611().toString();
        C5062 c50622 = this.f31356;
        String obj2 = c50622.m14611().toString();
        if (obj.isEmpty()) {
            this.f31350.dismiss();
            return;
        }
        boolean isChecked = this.f31353.isChecked();
        boolean isChecked2 = this.f31354.isChecked();
        boolean isChecked3 = this.f31355.isChecked();
        if (isChecked2) {
            try {
                try {
                    C13574.m32628(C11459.m28260(obj), obj2);
                } catch (Exception e) {
                    C21374.m48459((CharSequence) e.getMessage());
                    c50622.requestFocus();
                    return;
                }
            } catch (Exception e2) {
                C21374.m48459((CharSequence) e2.getMessage());
                c5062.requestFocus();
                return;
            }
        }
        c5062.m14610();
        c50622.m14610();
        this.f31351.edit().putBoolean("dex_search_match_case", isChecked).putBoolean("dex_search_regex", isChecked2).putBoolean("dex_search_exactly_match", isChecked3).apply();
        this.f31350.dismiss();
        this.f31360.mo13973(obj, obj2, isChecked, isChecked2, isChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f31355.setVisibility(i == 0 ? 8 : 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26275(ViewOnClickListenerC10435 viewOnClickListenerC10435, Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C22933 c22933 = new C22933(viewOnClickListenerC10435.f31359);
        c22933.m51049(R.string.MT_Protector_res_0x7f1207a7);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C13256 c13256 = new C13256(viewOnClickListenerC10435, c22933);
        final boolean z4 = viewOnClickListenerC10435.f31361.getSelectedItemPosition() == 1;
        final C12366 c12366 = viewOnClickListenerC10435.f31358;
        C11003.requireNonNull(set);
        final C3379 c3379 = new C3379(0, set);
        new Thread(new Runnable() { // from class: l.ۧܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final C22108 c22108 = new C22108();
                String str3 = str;
                final boolean z5 = z2;
                final C15051 m9357 = C3058.m9357(str3, z5, z);
                final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                C12366 c123662 = c12366;
                c123662.m30033(concurrentLinkedQueue, "", true, (Predicate) c3379);
                final InterfaceC21403 interfaceC21403 = c13256;
                interfaceC21403.mo22515(0);
                final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                c19277.m44459(new C21847(interfaceC21403));
                final boolean z6 = z4;
                final String str4 = str2;
                final boolean z7 = z3;
                Runnable runnable = new Runnable() { // from class: l.ܳܽۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC13508 interfaceC13508;
                        ConcurrentLinkedQueue concurrentLinkedQueue2;
                        InterfaceC21403 interfaceC214032;
                        C19277 c192772;
                        C15051 c15051;
                        boolean z8;
                        boolean z9;
                        InterfaceC13508 interfaceC135082;
                        String m9355;
                        ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                        InterfaceC21403 interfaceC214033 = interfaceC21403;
                        C19277 c192773 = c19277;
                        C15051 c150512 = m9357;
                        boolean z10 = z6;
                        String str5 = str4;
                        boolean z11 = z5;
                        boolean z12 = z7;
                        C22108 c221082 = c22108;
                        while (!concurrentLinkedQueue3.isEmpty() && (interfaceC13508 = (InterfaceC13508) concurrentLinkedQueue3.poll()) != null && !interfaceC214033.mo22513()) {
                            c192773.m44460(1);
                            String mo31675 = interfaceC13508.mo31675();
                            C12164 c12164 = c150512.get();
                            if (z10) {
                                C12572 c12572 = new C12572(mo31675);
                                C22706 c22706 = new C22706(mo31675.length());
                                C22108 c221083 = new C22108();
                                int i = 0;
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                int i2 = 0;
                                while (c12572.m30816()) {
                                    InterfaceC21403 interfaceC214034 = interfaceC214033;
                                    int i3 = i;
                                    C22108 c221084 = c221083;
                                    C19277 c192774 = c192773;
                                    C22706 c227062 = c22706;
                                    C15051 c150513 = c150512;
                                    C12572 c125722 = c12572;
                                    boolean z13 = z10;
                                    String str6 = mo31675;
                                    boolean z14 = z12;
                                    boolean z15 = z12;
                                    InterfaceC13508 interfaceC135083 = interfaceC13508;
                                    String m93552 = C3058.m9355(c12572.f37888, str5, c12164, z11, z14, c221084);
                                    if (m93552 != null) {
                                        c227062.append((CharSequence) str6, i2, c125722.f37890);
                                        try {
                                            C14020.m33624(c227062, m93552);
                                        } catch (IOException unused) {
                                        }
                                        i2 = c125722.f37886;
                                        i = c221084.f71773 + i3;
                                        synchronized (c221084) {
                                            c221084.f71773 = 0;
                                            c221084.f71772 = 0;
                                        }
                                    } else {
                                        i = i3;
                                    }
                                    c221083 = c221084;
                                    c22706 = c227062;
                                    c12572 = c125722;
                                    mo31675 = str6;
                                    interfaceC13508 = interfaceC135083;
                                    interfaceC214033 = interfaceC214034;
                                    c192773 = c192774;
                                    c150512 = c150513;
                                    z10 = z13;
                                    z12 = z15;
                                }
                                interfaceC214032 = interfaceC214033;
                                c192772 = c192773;
                                c15051 = c150512;
                                z8 = z10;
                                int i4 = i;
                                C22706 c227063 = c22706;
                                String str7 = mo31675;
                                z9 = z12;
                                interfaceC135082 = interfaceC13508;
                                if (i4 == 0) {
                                    m9355 = null;
                                } else {
                                    c221082.m49685(i4);
                                    if (i2 < str7.length()) {
                                        c227063.append((CharSequence) str7, i2, str7.length());
                                    }
                                    m9355 = c227063.toString();
                                }
                            } else {
                                concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                interfaceC214032 = interfaceC214033;
                                c192772 = c192773;
                                c15051 = c150512;
                                z8 = z10;
                                z9 = z12;
                                interfaceC135082 = interfaceC13508;
                                m9355 = C3058.m9355(mo31675, str5, c12164, z11, false, c221082);
                            }
                            if (m9355 != null) {
                                interfaceC135082.mo31670(m9355);
                            }
                            concurrentLinkedQueue3 = concurrentLinkedQueue2;
                            interfaceC214033 = interfaceC214032;
                            c192773 = c192772;
                            c150512 = c15051;
                            z10 = z8;
                            z12 = z9;
                        }
                    }
                };
                c123662.m30024();
                c123662.m30042(false);
                C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                c123662.m30042(true);
                c123662.m30061();
                C4925.m14315(new RunnableC18352(2, interfaceC21403, c22108));
            }
        }).start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26279(final C15063 c15063) {
        this.f31360 = new InterfaceC12551() { // from class: l.ۙܿۢ
            @Override // l.InterfaceC12551
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo13973(String str, String str2, boolean z, boolean z2, boolean z3) {
                C22108 c22108 = new C22108();
                C12164 matcher = C3058.m9359(str, z2, z).matcher((CharSequence) "");
                C15063 c150632 = C15063.this;
                for (C15769 c15769 : c150632.m35629()) {
                    String m9355 = C3058.m9355(c15769.m37186(), str2, matcher, z2, z3, c22108);
                    if (m9355 != null) {
                        c15769.m37185(m9355);
                    }
                }
                c150632.m35631();
                c150632.m35630();
                c150632.m35628().notifyDataSetChanged();
                C21374.m48459((CharSequence) c150632.getString(R.string.MT_Protector_res_0x7f120897, Integer.valueOf(c22108.f71773)));
            }
        };
        this.f31357.setVisibility(8);
    }
}
