package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: B4HK */
/* renamed from: l.᩺᩶ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC23222 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f74630;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public CheckBox f74631;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5062 f74632;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5062 f74633;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public CheckBox f74634;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public CheckBox f74635;

    /* renamed from: ֫ */
    public abstract String mo12117();

    /* renamed from: ֫ */
    public abstract void mo12118(int i);

    /* renamed from: ֫ */
    public abstract void mo12119(String str);

    public AbstractC23222(AbstractActivityC3346 abstractActivityC3346) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00ee);
        this.f74633 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f74632 = (C5062) m10216.findViewById(R.id.editText2);
        CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        this.f74635 = checkBox;
        int i = 0;
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("filter_match_case", false));
        CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        this.f74634 = checkBox2;
        checkBox2.setOnCheckedChangeListener(new C10523(i, this));
        checkBox2.setChecked(ApplicationC20075.f65008.getBoolean("filter_regex", false));
        CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        this.f74631 = checkBox3;
        checkBox3.setChecked(ApplicationC20075.f65008.getBoolean("filter_exactly_match", false));
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 m44438 = c19258.m44438();
        this.f74630 = m44438;
        m44438.m1447().setOnClickListener(new ViewOnClickListenerC6289(i, this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51530(AbstractC23222 abstractC23222, boolean z) {
        abstractC23222.f74633.m14609(z);
        abstractC23222.f74632.m14612(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51529(AbstractC23222 abstractC23222) {
        C11459 m28259;
        String sb;
        String str;
        C5062 c5062 = abstractC23222.f74633;
        String obj = c5062.m14611().toString();
        C5062 c50622 = abstractC23222.f74632;
        String obj2 = c50622.m14611().toString();
        boolean isChecked = abstractC23222.f74635.isChecked();
        boolean isChecked2 = abstractC23222.f74634.isChecked();
        boolean isChecked3 = abstractC23222.f74631.isChecked();
        if (obj.length() == 0) {
            return;
        }
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
        abstractC23222.f74630.dismiss();
        c5062.m14610();
        c50622.m14610();
        ApplicationC20075.f65008.edit().putBoolean("filter_match_case", isChecked).putBoolean("filter_regex", isChecked2).putBoolean("filter_exactly_match", isChecked3).apply();
        if (!isChecked2) {
            obj = C3939.m11985(obj);
        }
        if (isChecked) {
            m28259 = C11459.m28260(obj);
        } else {
            m28259 = C11459.m28259(66, obj);
        }
        C11934 c11934 = new C11934();
        C12164 matcher = m28259.matcher((CharSequence) "");
        while (true) {
            String mo12117 = abstractC23222.mo12117();
            if (mo12117 == null) {
                abstractC23222.mo12118(c11934.m29118());
                return;
            }
            ArrayList arrayList = new ArrayList();
            matcher.m29615reset((CharSequence) mo12117);
            if (isChecked3) {
                if (matcher.matches()) {
                    arrayList.add(matcher.toSnapshot());
                }
            } else {
                while (matcher.find()) {
                    arrayList.add(matcher.toSnapshot());
                }
            }
            if (arrayList.isEmpty()) {
                sb = null;
            } else {
                c11934.m29119(arrayList.size());
                StringBuilder sb2 = new StringBuilder(mo12117.length());
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C10048 c10048 = (C10048) it.next();
                    int start = c10048.start();
                    int end = c10048.end();
                    if (isChecked2) {
                        try {
                            str = c10048.expandReplacement(obj2);
                        } catch (Exception unused) {
                            str = obj2;
                        }
                        if (start > i) {
                            sb2.append((CharSequence) mo12117, i, start);
                        }
                        sb2.append(str);
                    } else {
                        if (start > i) {
                            sb2.append((CharSequence) mo12117, i, start);
                        }
                        sb2.append(obj2);
                    }
                    i = end;
                }
                if (i < mo12117.length()) {
                    sb2.append((CharSequence) mo12117, i, mo12117.length());
                }
                sb = sb2.toString();
            }
            if (sb != null) {
                abstractC23222.mo12119(sb);
            }
        }
    }
}
