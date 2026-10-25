package l;

import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 052E */
/* renamed from: l.ۚ۠ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractViewOnClickListenerC5230 implements View.OnClickListener {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f16375 = new ArrayList();

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C5062 f16376;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5062 f16377;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C2978 f16378;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f16379;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5062 f16380;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f16381;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f16382;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2978 f16383;

    /* renamed from: ۜ */
    public abstract void mo2119();

    static {
        byte[] mo18253 = ApplicationC20075.f65008.mo18253("mrir", (byte[]) null);
        if (mo18253 != null) {
            C12951 c12951 = new C12951(mo18253);
            int readByte = c12951.readByte() & 255;
            for (int i = 0; i < readByte; i++) {
                f16375.add(C0290.m1640(c12951));
            }
        }
    }

    public AbstractViewOnClickListenerC5230(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList, boolean z, boolean z2) {
        this.f16382 = abstractActivityC3346;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00b0);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0640).setOnClickListener(new ViewOnClickListenerC1306(1, abstractActivityC3346, arrayList));
        C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f16377 = c5062;
        C5062 c50622 = (C5062) m10216.findViewById(R.id.editText2);
        this.f16376 = c50622;
        C5062 c50623 = (C5062) m10216.findViewById(R.id.editText3);
        this.f16380 = c50623;
        C2978 c2978 = (C2978) m10216.findViewById(R.id.switch1);
        this.f16378 = c2978;
        this.f16383 = (C2978) m10216.findViewById(R.id.switch2);
        View findViewById = m10216.findViewById(R.id.MT_Protector_res_0x7f0a0265);
        this.f16379 = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC9841(3, this));
        findViewById.setEnabled(!f16375.isEmpty());
        c5062.m14601("{P}{S}");
        c5062.m14607().m25927();
        c50622.m14601("");
        c50623.m14601("");
        c2978.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩻۠ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230 = AbstractViewOnClickListenerC5230.this;
                abstractViewOnClickListenerC5230.f16376.m14609(z3);
                abstractViewOnClickListenerC5230.f16380.m14612(z3);
            }
        });
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("rename_multi_regex", false));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String string = abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12088b);
        int lastIndexOf = string.lastIndexOf("\n\n");
        int indexOf = string.indexOf("\n{N}");
        if (lastIndexOf == -1 || indexOf == -1 || lastIndexOf < indexOf) {
            throw new IllegalStateException(string);
        }
        spannableStringBuilder.append((CharSequence) string, 0, indexOf).append((CharSequence) "\n");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12088e));
        RunnableC6641 runnableC6641 = new RunnableC6641(this, abstractActivityC3346);
        C12164 matcher = C11459.m28260("%.+?%").matcher((CharSequence) spannableStringBuilder);
        if (matcher.find(length)) {
            spannableStringBuilder.delete(matcher.end() - 1, matcher.end());
            spannableStringBuilder.delete(matcher.start(), matcher.start() + 1);
            spannableStringBuilder.setSpan(new C2408(runnableC6641), matcher.start(), matcher.end() - 2, 17);
            if (z2) {
                spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12088d));
            }
            spannableStringBuilder.append((CharSequence) "\n\n");
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
            spannableStringBuilder.append((CharSequence) string, indexOf + 1, lastIndexOf);
            if (z) {
                spannableStringBuilder.append((CharSequence) "\n\n");
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.25f), spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                spannableStringBuilder.append((CharSequence) abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12088c));
            }
            C12164 matcher2 = C11459.m28259(8, "^\\{\\w+\\}").matcher((CharSequence) spannableStringBuilder);
            while (matcher2.find()) {
                spannableStringBuilder.setSpan(new StyleSpan(1), matcher2.start(), matcher2.end(), 17);
            }
            spannableStringBuilder.append((CharSequence) string, lastIndexOf, string.length());
            TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C19258 buildDialog = abstractActivityC3346.buildDialog();
            buildDialog.m44421(m10216);
            buildDialog.m44428(false);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12079c, null);
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44437("{  }", (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 m44415 = buildDialog.m44415();
            this.f16381 = m44415;
            C5088.m14637(m44415);
            return;
        }
        throw new IllegalStateException(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f12088e));
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m15025() {
        C10130 c10130 = new C10130();
        ArrayList arrayList = f16375;
        c10130.writeByte(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C0290) it.next()).m1645(c10130);
        }
        ApplicationC20075.f65008.edit().mo25855("mrir", c10130.m25444()).apply();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m15034() {
        C0290 c0290 = new C0290(0, m15030(), m15032(), m15033(), this.f16378.isChecked());
        ArrayList arrayList = f16375;
        arrayList.remove(c0290);
        arrayList.add(0, c0290);
        while (arrayList.size() > 100) {
            C18473.m42953(arrayList, 1);
        }
        m15025();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m15021(final View view) {
        final CharSequence[] charSequenceArr = (CharSequence[]) C5378.stream(f16375).map(new C20753()).toArray(new C9464());
        C19258 buildDialog = this.f16382.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120456);
        buildDialog.m44430(charSequenceArr, new DialogInterfaceOnClickListenerC19423(1, this));
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        m44438.m1443().setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() { // from class: l.ۡ۠ܳ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view2, final int i, long j) {
                final AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230 = AbstractViewOnClickListenerC5230.this;
                C19258 buildDialog2 = abstractViewOnClickListenerC5230.f16382.buildDialog();
                buildDialog2.m44433(R.string.MT_Protector_res_0x7f1205ca);
                buildDialog2.m44424(charSequenceArr[i]);
                final DialogInterfaceC0206 dialogInterfaceC0206 = m44438;
                final View view3 = view;
                buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܺ۠ܳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        AbstractViewOnClickListenerC5230.m15023(AbstractViewOnClickListenerC5230.this, i, dialogInterfaceC0206, view3);
                    }
                });
                buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                buildDialog2.m44438();
                return true;
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15022(AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230, int i) {
        String str;
        String str2;
        String str3;
        boolean z;
        C0290 c0290 = (C0290) f16375.get(i);
        C5062 c5062 = abstractViewOnClickListenerC5230.f16377;
        str = c0290.f1644;
        c5062.m14601(str);
        C5062 c50622 = abstractViewOnClickListenerC5230.f16376;
        str2 = c0290.f1647;
        c50622.m14601(str2);
        C5062 c50623 = abstractViewOnClickListenerC5230.f16380;
        str3 = c0290.f1646;
        c50623.m14601(str3);
        C2978 c2978 = abstractViewOnClickListenerC5230.f16378;
        z = c0290.f1645;
        c2978.setChecked(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m15023(AbstractViewOnClickListenerC5230 abstractViewOnClickListenerC5230, int i, DialogInterfaceC0206 dialogInterfaceC0206, View view) {
        ArrayList arrayList = f16375;
        arrayList.remove(i);
        m15025();
        dialogInterfaceC0206.dismiss();
        if (arrayList.isEmpty()) {
            abstractViewOnClickListenerC5230.f16379.setEnabled(false);
        } else {
            abstractViewOnClickListenerC5230.m15021(view);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15026() {
        this.f16381.dismiss();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m15030() {
        return this.f16377.m14611().toString();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m15032() {
        return this.f16376.m14611().toString();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m15033() {
        return this.f16380.m14611().toString();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m15035() {
        return this.f16378.isChecked();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m15027() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f16381;
        dialogInterfaceC0206.m1449();
        dialogInterfaceC0206.m1447().setOnClickListener(this);
        dialogInterfaceC0206.m1448().setOnClickListener(this);
        C4925.m14329(this.f16377);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2978 m15029() {
        C2978 c2978 = this.f16383;
        c2978.setVisibility(0);
        return c2978;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m15031() {
        return this.f16381;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m15028() {
        C5062 c5062 = this.f16377;
        if (c5062.m14614() > 0 && !m15030().equals("{P}{S}")) {
            c5062.m14610();
        }
        C5062 c50622 = this.f16376;
        if (c50622.m14614() > 0) {
            c50622.m14610();
        }
        C5062 c50623 = this.f16380;
        if (c50623.m14614() > 0) {
            c50623.m14610();
        }
        ApplicationC20075.f65008.edit().putBoolean("rename_multi_regex", this.f16378.isChecked()).apply();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == 16908313) {
            if (this.f16378.isChecked()) {
                try {
                    C11459.m28260(m15032());
                } catch (Exception e) {
                    this.f16382.m10223(e, (DialogInterface.OnDismissListener) null);
                    C5062 c5062 = this.f16376;
                    c5062.m14615();
                    c5062.requestFocus();
                    return;
                }
            }
            mo2119();
            return;
        }
        C5062 c50622 = this.f16377;
        int m30444 = c50622.m14607().m30444();
        int m30448 = c50622.m14607().m30448();
        c50622.requestFocus();
        c50622.m14611().replace(m30444, m30448, "{}");
        c50622.m14608(m30444 + 1);
    }
}
