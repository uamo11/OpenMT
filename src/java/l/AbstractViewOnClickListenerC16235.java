package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: 35GV */
/* renamed from: l.ܺ᩹᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractViewOnClickListenerC16235 implements AdapterView.OnItemSelectedListener, View.OnClickListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final List f49977;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f49978;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CheckBox f49979;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CheckBox f49980;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Spinner f49981;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final CheckBox f49982;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CheckBox f49983;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CheckBox f49984;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5062 f49985;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f49986;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16560 f49987;

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public AbstractViewOnClickListenerC16235(C16560 c16560, AbstractC15440 abstractC15440, List list, final Runnable runnable) {
        this.f49987 = c16560;
        this.f49978 = abstractC15440;
        this.f49977 = list;
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d008a);
        if (list != null) {
            ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f12090f);
        }
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a04b1).setVisibility(8);
        m10216.findViewById(R.id.editText2).setVisibility(8);
        this.f49985 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        this.f49981 = spinner;
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f49980 = checkBox;
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f49979 = checkBox2;
        CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f49983 = checkBox3;
        CheckBox checkBox4 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e0);
        this.f49982 = checkBox4;
        CheckBox checkBox5 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e1);
        this.f49984 = checkBox5;
        spinner.setSelection(ApplicationC20075.f65008.getInt("axml_search_type", 0));
        onItemSelected(null, null, spinner.getSelectedItemPosition(), 0L);
        spinner.setOnItemSelectedListener(this);
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_match_case", false));
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_regex", false));
        checkBox3.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_hex", true));
        checkBox4.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_id2name", true));
        checkBox5.setChecked(ApplicationC20075.f65008.getBoolean("axml_search_exactly_match", true));
        checkBox2.setOnCheckedChangeListener(new C1601(1, this));
        m38199();
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterface.OnClickListener() { // from class: l.᩻᩹᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        buildDialog.m44440(R.string.MT_Protector_res_0x7f1205fa, (DialogInterface.OnClickListener) null);
        buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۜ᩹᩻
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        this.f49986 = buildDialog.m44415();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m38199() {
        CheckBox checkBox = this.f49979;
        this.f49985.m14609(checkBox.isChecked() && checkBox.getVisibility() == 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38204() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f49986;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        dialogInterfaceC0206.m1448().setOnClickListener(new ViewOnClickListenerC16718(3, this));
        C5062 c5062 = this.f49985;
        c5062.requestFocus();
        C4925.m14329(c5062.m14607());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38200(AbstractViewOnClickListenerC16235 abstractViewOnClickListenerC16235) {
        abstractViewOnClickListenerC16235.f49987.m39056().m10217(R.string.MT_Protector_res_0x7f120491, R.string.MT_Protector_res_0x7f120111, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r5 != 4) goto L46;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r14) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnClickListenerC16235.onClick(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r7 != 4) goto L22;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView r5, android.view.View r6, int r7, long r8) {
        /*
            r4 = this;
            r5 = 1
            r6 = 0
            if (r7 == 0) goto L9
            if (r7 != r5) goto L7
            goto L9
        L7:
            r8 = 0
            goto La
        L9:
            r8 = 1
        La:
            l.ۚۖۡ r9 = r4.f49985
            r9.m14604(r8)
            android.widget.CheckBox r8 = r4.f49984
            android.widget.CheckBox r9 = r4.f49982
            android.widget.CheckBox r0 = r4.f49983
            android.widget.CheckBox r1 = r4.f49979
            android.widget.CheckBox r2 = r4.f49980
            r3 = 8
            if (r7 == 0) goto L59
            if (r7 == r5) goto L49
            r5 = 2
            if (r7 == r5) goto L39
            r5 = 3
            if (r7 == r5) goto L29
            r5 = 4
            if (r7 == r5) goto L39
            goto L68
        L29:
            r2.setVisibility(r3)
            r1.setVisibility(r3)
            r0.setVisibility(r3)
            r9.setVisibility(r3)
            r8.setVisibility(r3)
            goto L68
        L39:
            r2.setVisibility(r3)
            r1.setVisibility(r3)
            r0.setVisibility(r6)
            r9.setVisibility(r3)
            r8.setVisibility(r3)
            goto L68
        L49:
            r2.setVisibility(r6)
            r1.setVisibility(r6)
            r0.setVisibility(r3)
            r9.setVisibility(r3)
            r8.setVisibility(r6)
            goto L68
        L59:
            r2.setVisibility(r6)
            r1.setVisibility(r6)
            r9.setVisibility(r6)
            r0.setVisibility(r3)
            r8.setVisibility(r3)
        L68:
            r4.m38199()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnClickListenerC16235.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
