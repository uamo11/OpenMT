package l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: 5AG9 */
/* renamed from: l.ۙ᩻᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4988 extends AbstractC3577 {
    @Override // l.AbstractC3577
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final String mo6365() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ᩳ */
    public final String mo6372() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    public final String getName() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ܽ */
    public final String mo6370() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final AbstractC3163 mo6366(int i) {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    public final C19883 getIcon() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ܿ */
    public final String mo6371() {
        throw new RuntimeException();
    }

    @Override // l.AbstractC3577
    /* renamed from: ֫ */
    public final void mo6367(AbstractActivityC3346 abstractActivityC3346) {
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4988 m14473(final AbstractActivityC3346 abstractActivityC3346, TextView textView, AbstractC3577 abstractC3577) {
        final C4988 c4988 = new C4988(-1);
        c4988.m10945(abstractC3577);
        textView.setText(abstractActivityC3346.getString(R.string.MT_Protector_res_0x7f120a6e) + " >>");
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.ۚ᩻᩻
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                View m10216 = abstractActivityC33462.m10216(R.layout.MT_Protector_res_0x7f0d00dd);
                final C0754 c0754 = new C0754(m10216.findViewById(R.id.MT_Protector_res_0x7f0a0409));
                final C0754 c07542 = new C0754(m10216.findViewById(R.id.MT_Protector_res_0x7f0a040a));
                final C0754 c07543 = new C0754(m10216.findViewById(R.id.MT_Protector_res_0x7f0a040b));
                final C0754 c07544 = new C0754(m10216.findViewById(R.id.MT_Protector_res_0x7f0a040c));
                final C0754 c07545 = new C0754(m10216.findViewById(R.id.MT_Protector_res_0x7f0a040d));
                final C4988 c49882 = C4988.this;
                boolean z = c49882.f11357;
                C2978 c2978 = c0754.f2811;
                c2978.setChecked(z);
                c07542.f2811.setChecked(c49882.f11353);
                c07543.f2811.setChecked(c49882.f11352);
                c07544.f2809.setText(abstractActivityC33462.getString(R.string.MT_Protector_res_0x7f120470, c49882.f11348));
                c07545.f2809.setText(abstractActivityC33462.getString(R.string.MT_Protector_res_0x7f12052a, Integer.valueOf(c49882.f11351)));
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: l.֨᩻᩻
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                        boolean z3 = !z2;
                        C0754.this.m2892(z3);
                        c07543.m2892(z3);
                        c07544.m2892(z3);
                        c07545.m2892(z3);
                    }
                };
                c2978.setOnCheckedChangeListener(onCheckedChangeListener);
                onCheckedChangeListener.onCheckedChanged(c2978, c2978.isChecked());
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.۠᩻᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C0754 c07546 = c07544;
                        CharSequence text = c07546.f2810.getText();
                        Object obj = c07546.f2807;
                        String str = obj == null ? C4988.this.f11348 : (String) obj;
                        final AbstractActivityC3346 abstractActivityC33463 = abstractActivityC33462;
                        C21362.m48400(abstractActivityC33463, text, str, new InterfaceC13041() { // from class: l.᩹᩻᩻
                            @Override // l.InterfaceC13041
                            public final void accept(Object obj2) {
                                String str2 = (String) obj2;
                                C0754 c07547 = C0754.this;
                                c07547.f2807 = str2;
                                c07547.f2809.setText(abstractActivityC33463.getString(R.string.MT_Protector_res_0x7f120470, str2));
                            }
                        });
                    }
                };
                ViewGroup viewGroup = c07544.f2808;
                viewGroup.setOnClickListener(onClickListener);
                if (!c07544.f2810.isEnabled()) {
                    viewGroup.setClickable(false);
                }
                View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.ܶ᩻᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        final C0754 c07546 = c07545;
                        CharSequence text = c07546.f2810.getText();
                        Object obj = c07546.f2807;
                        int intValue = obj == null ? C4988.this.f11351 : ((Integer) obj).intValue();
                        final AbstractActivityC3346 abstractActivityC33463 = abstractActivityC33462;
                        C6791.m18436(abstractActivityC33463, text, intValue, new InterfaceC5982() { // from class: l.᩶᩻᩻
                            @Override // java.util.function.Consumer
                            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                                mo16796((Integer) obj2);
                            }

                            @Override // l.InterfaceC5982
                            /* renamed from: ܽ */
                            public final /* synthetic */ void mo16796(Integer num) {
                                C10216.m25642((InterfaceC5982) this, num);
                            }

                            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                                return C10216.m25641((InterfaceC5982) this, intConsumer);
                            }

                            public final Consumer andThen(Consumer consumer) {
                                return C23517.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.IntConsumer
                            public final void accept(int i) {
                                Integer valueOf = Integer.valueOf(i);
                                C0754 c07547 = C0754.this;
                                c07547.f2807 = valueOf;
                                c07547.f2809.setText(abstractActivityC33463.getString(R.string.MT_Protector_res_0x7f12052a, Integer.valueOf(i)));
                            }
                        });
                    }
                };
                ViewGroup viewGroup2 = c07545.f2808;
                viewGroup2.setOnClickListener(onClickListener2);
                if (!c07545.f2810.isEnabled()) {
                    viewGroup2.setClickable(false);
                }
                C19258 buildDialog = abstractActivityC33462.buildDialog();
                buildDialog.m44421(m10216);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩸᩻᩻
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C4988 c49883 = C4988.this;
                        c49883.getClass();
                        c49883.f11357 = c0754.f2811.isChecked();
                        c49883.f11353 = c07542.f2811.isChecked();
                        c49883.f11352 = c07543.f2811.isChecked();
                        Object obj = c07544.f2807;
                        if (obj != null) {
                            String str = (String) obj;
                            c49883.f11348 = str;
                            c49883.f11347 = AbstractC3577.m10932(str);
                        }
                        Object obj2 = c07545.f2807;
                        if (obj2 != null) {
                            c49883.f11351 = ((Integer) obj2).intValue();
                        }
                    }
                });
                buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                buildDialog.m44438();
            }
        });
        return c4988;
    }
}
