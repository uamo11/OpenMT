package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: W1F3 */
/* renamed from: l.ۛ᩺᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC6377 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5062 f19728;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f19729;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12344 f19730;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f19731;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f19732;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final CheckBox f19733;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f19734;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5062 f19735;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f19736;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC10611 f19737;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ActivityC17169 f19738;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C19452 f19739;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Spinner f19740;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public ViewOnClickListenerC6377(ActivityC17169 activityC17169, C19452 c19452) {
        InterfaceC12344 interfaceC12344 = ApplicationC20075.f65008;
        this.f19730 = interfaceC12344;
        this.f19738 = activityC17169;
        this.f19739 = c19452;
        View m10216 = activityC17169.m10216(R.layout.MT_Protector_res_0x7f0d0085);
        this.f19731 = m10216;
        C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f19728 = c5062;
        C5062 c50622 = (C5062) m10216.findViewById(R.id.editText2);
        this.f19735 = c50622;
        c5062.m14602(C2353.m7663(), (String) null);
        c50622.m14602(C2353.m7662(), (String) null);
        this.f19736 = m10216.findViewById(R.id.linearLayout);
        this.f19740 = (Spinner) m10216.findViewById(R.id.spinner);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f19732 = checkBox;
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f19733 = checkBox2;
        CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f19734 = checkBox3;
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۗ᩺᩷
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ViewOnClickListenerC6377.m17694(ViewOnClickListenerC6377.this, z);
            }
        });
        checkBox.setChecked(interfaceC12344.getBoolean("dex_search_match_case", false));
        checkBox2.setChecked(interfaceC12344.getBoolean("dex_search_regex", false));
        checkBox3.setChecked(interfaceC12344.getBoolean("dex_search_exactly_match", false));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17694(ViewOnClickListenerC6377 viewOnClickListenerC6377, boolean z) {
        viewOnClickListenerC6377.f19728.m14609(z);
        viewOnClickListenerC6377.f19735.m14612(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17696(C0941 c0941) {
        this.f19737 = new C6123(this, c0941.m3355());
        int i = this.f19730.getInt("arsc_search_type", 0) == 2 ? 1 : 0;
        Spinner spinner = this.f19740;
        spinner.setSelection(i);
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17695() {
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(this.f19738);
        c19258.m44421(this.f19731);
        DialogInterfaceC0206 m19253 = C7187.m19253(c19258, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        this.f19729 = m19253;
        m19253.m1447().setOnClickListener(this);
        this.f19728.m14608(0);
        C4925.m14329(this.f19735.m14607());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5062 c5062 = this.f19728;
        String obj = c5062.m14611().toString();
        C5062 c50622 = this.f19735;
        String obj2 = c50622.m14611().toString();
        if (obj.isEmpty()) {
            this.f19729.dismiss();
            return;
        }
        boolean isChecked = this.f19732.isChecked();
        boolean isChecked2 = this.f19733.isChecked();
        boolean isChecked3 = this.f19734.isChecked();
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
        this.f19730.edit().putBoolean("dex_search_match_case", isChecked).putBoolean("dex_search_regex", isChecked2).putBoolean("dex_search_exactly_match", isChecked3).apply();
        this.f19729.dismiss();
        this.f19737.mo17037(obj, obj2, isChecked, isChecked2, isChecked3);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.f19734.setVisibility(i == 0 ? 8 : 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17693(ViewOnClickListenerC6377 viewOnClickListenerC6377, final Set set, final String str, final String str2, final boolean z, final boolean z2, final boolean z3) {
        C22933 c22933 = new C22933(viewOnClickListenerC6377.f19738);
        c22933.m51049(R.string.MT_Protector_res_0x7f1207a7);
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        final C12727 c12727 = new C12727(viewOnClickListenerC6377, c22933);
        final boolean z4 = viewOnClickListenerC6377.f19740.getSelectedItemPosition() == 1;
        final C19452 c19452 = viewOnClickListenerC6377.f19739;
        new Thread(new Runnable() { // from class: l.᩺ۨ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C19452 c194522 = C19452.this;
                final boolean z5 = z4;
                final C9200 c9200 = new C9200(c194522, z5);
                final InterfaceC21403 interfaceC21403 = c12727;
                try {
                    c9200.f27877 = z5 ? c194522.m44833() : Collections.EMPTY_MAP;
                    final C22108 c22108 = new C22108();
                    String str3 = str;
                    final boolean z6 = z2;
                    final C15051 m9357 = C3058.m9357(str3, z6, z);
                    final ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                    c194522.m44822(concurrentLinkedQueue, "", true, set);
                    interfaceC21403.mo22515(0);
                    final C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                    c19277.m44459(new C21847(interfaceC21403));
                    final String str4 = str2;
                    final boolean z7 = z3;
                    Runnable runnable = new Runnable() { // from class: l.ᩳ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC1438 interfaceC1438;
                            ConcurrentLinkedQueue concurrentLinkedQueue2;
                            InterfaceC21403 interfaceC214032;
                            C19277 c192772;
                            C15051 c15051;
                            boolean z8;
                            C9200 c92002;
                            InterfaceC1438 interfaceC14382;
                            boolean z9;
                            C22108 c221082;
                            String m9355;
                            C22108 c221083;
                            C15051 c150512;
                            StringBuilder sb;
                            boolean z10;
                            String str5;
                            C9200 c92003;
                            InterfaceC1438 interfaceC14383;
                            boolean z11;
                            C22108 c221084;
                            ConcurrentLinkedQueue concurrentLinkedQueue3 = concurrentLinkedQueue;
                            InterfaceC21403 interfaceC214033 = interfaceC21403;
                            C19277 c192773 = c19277;
                            C15051 c150513 = m9357;
                            boolean z12 = z5;
                            C9200 c92004 = c9200;
                            String str6 = str4;
                            boolean z13 = z6;
                            boolean z14 = z7;
                            C22108 c221085 = c22108;
                            while (!concurrentLinkedQueue3.isEmpty() && (interfaceC1438 = (InterfaceC1438) concurrentLinkedQueue3.poll()) != null && !interfaceC214033.mo22513()) {
                                c192773.m44460(1);
                                String mo4946 = interfaceC1438.mo4946();
                                C12164 c12164 = c150513.get();
                                if (z12) {
                                    List<C24032> m23633 = c92004.m23633(interfaceC1438.getPath());
                                    m9355 = null;
                                    if (m23633 == null) {
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        interfaceC214032 = interfaceC214033;
                                        c192772 = c192773;
                                        c15051 = c150513;
                                        z8 = z12;
                                        c92002 = c92004;
                                        interfaceC14382 = interfaceC1438;
                                        z9 = z14;
                                        c221082 = c221085;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder(mo4946.length());
                                        C22108 c221086 = new C22108();
                                        int i = 0;
                                        concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                        int i2 = 0;
                                        for (C24032 c24032 : m23633) {
                                            InterfaceC21403 interfaceC214034 = interfaceC214033;
                                            C19277 c192774 = c192773;
                                            if (c24032.f77861 != 1) {
                                                c150512 = c150513;
                                                z10 = z12;
                                                c92003 = c92004;
                                                c221083 = c221086;
                                                sb = sb2;
                                                str5 = mo4946;
                                                interfaceC14383 = interfaceC1438;
                                                z11 = z14;
                                                c221084 = c221085;
                                            } else {
                                                int i3 = i;
                                                c221083 = c221086;
                                                c150512 = c150513;
                                                sb = sb2;
                                                z10 = z12;
                                                str5 = mo4946;
                                                c92003 = c92004;
                                                interfaceC14383 = interfaceC1438;
                                                boolean z15 = z14;
                                                z11 = z14;
                                                c221084 = c221085;
                                                String m93552 = C3058.m9355(c24032.f77864, str6, c12164, z13, z15, c221083);
                                                if (m93552 != null) {
                                                    sb.append((CharSequence) str5, i2, c24032.f77862);
                                                    sb.append(C10753.m26948(m93552));
                                                    i2 = c24032.f77859;
                                                    i = i3 + c221083.f71773;
                                                    synchronized (c221083) {
                                                        c221083.f71773 = 0;
                                                        c221083.f71772 = 0;
                                                    }
                                                } else {
                                                    i = i3;
                                                }
                                            }
                                            c221086 = c221083;
                                            sb2 = sb;
                                            mo4946 = str5;
                                            interfaceC1438 = interfaceC14383;
                                            c221085 = c221084;
                                            interfaceC214033 = interfaceC214034;
                                            c192773 = c192774;
                                            c150513 = c150512;
                                            z12 = z10;
                                            c92004 = c92003;
                                            z14 = z11;
                                        }
                                        interfaceC214032 = interfaceC214033;
                                        c192772 = c192773;
                                        c15051 = c150513;
                                        z8 = z12;
                                        c92002 = c92004;
                                        int i4 = i;
                                        StringBuilder sb3 = sb2;
                                        String str7 = mo4946;
                                        interfaceC14382 = interfaceC1438;
                                        z9 = z14;
                                        c221082 = c221085;
                                        if (i4 != 0) {
                                            c221082.m49685(i4);
                                            if (i2 < str7.length()) {
                                                sb3.append((CharSequence) str7, i2, str7.length());
                                            }
                                            m9355 = sb3.toString();
                                        }
                                    }
                                } else {
                                    concurrentLinkedQueue2 = concurrentLinkedQueue3;
                                    interfaceC214032 = interfaceC214033;
                                    c192772 = c192773;
                                    c15051 = c150513;
                                    z8 = z12;
                                    c92002 = c92004;
                                    interfaceC14382 = interfaceC1438;
                                    z9 = z14;
                                    c221082 = c221085;
                                    m9355 = C3058.m9355(mo4946, str6, c12164, z13, false, c221085);
                                }
                                String str8 = m9355;
                                if (str8 != null) {
                                    interfaceC14382.mo4947(str8);
                                }
                                c221085 = c221082;
                                concurrentLinkedQueue3 = concurrentLinkedQueue2;
                                interfaceC214033 = interfaceC214032;
                                c192773 = c192772;
                                c150513 = c15051;
                                z12 = z8;
                                c92004 = c92002;
                                z14 = z9;
                            }
                        }
                    };
                    c194522.m44830(false);
                    C3058.m9358((int) (C17615.f53826 * 0.66f), runnable);
                    c194522.m44830(true);
                    C4925.m14315(new RunnableC20553(4, interfaceC21403, c22108));
                } catch (Exception e) {
                    C4925.m14315(new Runnable() { // from class: l.ܽ᩺᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e;
                            InterfaceC21403 interfaceC214032 = interfaceC21403;
                            C9200.this.m23634(interfaceC214032.mo22516(), exc);
                            interfaceC214032.mo22514();
                        }
                    });
                }
            }
        }).start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17697(final C19328 c19328) {
        this.f19737 = new InterfaceC10611() { // from class: l.۬᩺᩷
            @Override // l.InterfaceC10611
            /* renamed from: ֫ */
            public final void mo17037(String str, String str2, boolean z, boolean z2, boolean z3) {
                C22108 c22108 = new C22108();
                C12164 matcher = C3058.m9359(str, z2, z).matcher((CharSequence) "");
                C19328 c193282 = C19328.this;
                for (C23560 c23560 : c193282.m44546()) {
                    String m9355 = C3058.m9355(c23560.m52025(), str2, matcher, z2, z3, c22108);
                    if (m9355 != null) {
                        c23560.m52024(m9355);
                    }
                }
                c193282.m44548();
                c193282.m44547();
                c193282.m44545().notifyDataSetChanged();
                C21374.m48459((CharSequence) c193282.getString(R.string.MT_Protector_res_0x7f120897, Integer.valueOf(c22108.f71773)));
            }
        };
        this.f19736.setVisibility(8);
    }
}
