package l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: H5BW */
/* renamed from: l.ۡۨܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8863 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f26982 = new ArrayList(5);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m22895() {
        m22898();
        return (List) C5378.stream(f26982).filter(new C4464(0)).collect(C22976.toUnmodifiableList());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22892(TextView textView, C21730 c21730) {
        if (c21730 == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(C4925.m14306(R.string.MT_Protector_res_0x7f12098d, c21730.m49058()));
            textView.setVisibility(0);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22893(DialogInterfaceC0206 dialogInterfaceC0206, View view, boolean z) {
        boolean z2 = !z;
        dialogInterfaceC0206.m1441(z2);
        m22891(dialogInterfaceC0206.m1447(), z2);
        m22891(dialogInterfaceC0206.m1446(), z2);
        m22891(dialogInterfaceC0206.m1448(), z2);
        m22891(view.findViewById(R.id.spinner1), z2);
        m22891(view.findViewById(R.id.spinner2), z2);
        m22891(view.findViewById(R.id.switch1), z2);
        m22891(view.findViewById(R.id.switch2), z2);
        m22891(view.findViewById(R.id.switch3), z2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22891(View view, boolean z) {
        if (view != null) {
            view.setEnabled(z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23679 m22890(AbstractActivityC3346 abstractActivityC3346, View view, C16955 c16955) {
        C2978 c2978 = (C2978) view.findViewById(R.id.switch2);
        if (c2978 != null) {
            c2978.setVisibility(8);
        }
        return new C11520(m22896(abstractActivityC3346, view, c16955));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC6746 m22886(AbstractActivityC3346 abstractActivityC3346, View view, String str) {
        C2978 c2978 = (C2978) view.findViewById(R.id.switch2);
        C16955 m42798 = C18367.m42798(str);
        if (str == null || str.isEmpty()) {
            c2978.setVisibility(8);
        } else {
            c2978.setText(C4925.m14306(R.string.MT_Protector_res_0x7f120125, str));
        }
        if (m42798 != null && m22889(m42798.m39780()) == null) {
            m42798 = null;
        }
        if (m42798 == null) {
            c2978.setChecked(false);
            m42798 = new C16955(ApplicationC20075.f65008.getString("auto_signature_key", ""), m22887(), ApplicationC20075.f65008.getString("v1_signature_filename", null), ApplicationC20075.f65008.getBoolean("kv1sd", false));
        } else {
            c2978.setChecked(true);
        }
        return new C22808(m22896(abstractActivityC3346, view, m42798), c2978.getVisibility() == 0, c2978, str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23679 m22896(final AbstractActivityC3346 abstractActivityC3346, View view, C16955 c16955) {
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner2);
        final C2978 c2978 = (C2978) view.findViewById(R.id.switch1);
        C2978 c29782 = (C2978) view.findViewById(R.id.switch3);
        C9569 c9569 = new C9569(spinner);
        m22898();
        int m27878 = C11266.m27878(36.0f);
        Context context = view.getContext();
        ArrayList arrayList = f26982;
        spinner.setAdapter((SpinnerAdapter) new C13635(context, arrayList, m27878));
        spinner.setOnItemSelectedListener(new C7286(c9569));
        String m39780 = c16955.m39780();
        int i = 0;
        if (!m39780.isEmpty()) {
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    break;
                }
                if (((AbstractC13262) arrayList.get(i2)).mo10324().equals(m39780)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        spinner.setSelection(i);
        spinner.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC10980(abstractActivityC3346, new C1807(m39780, spinner, c9569)));
        spinner2.setAdapter((SpinnerAdapter) new C16623(m27878, view.getContext(), (List) C22311.stream(EnumC8139.values()).map(new C3053(0)).collect(C22976.toList())));
        spinner2.setOnItemSelectedListener(new C18035(c2978, c29782));
        int ordinal = c16955.m39781().ordinal();
        spinner2.setSelection(ordinal);
        AdapterView.OnItemSelectedListener onItemSelectedListener = spinner2.getOnItemSelectedListener();
        C11003.requireNonNull(onItemSelectedListener);
        onItemSelectedListener.onItemSelected(null, null, ordinal, 0L);
        c2978.setTag(c16955.m39779());
        c2978.setChecked(!TextUtils.isEmpty(c16955.m39779()));
        c2978.setOnClickListener(new View.OnClickListener() { // from class: l.۬ۛܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractActivityC3346 abstractActivityC33462 = AbstractActivityC3346.this;
                C2978 c29783 = c2978;
                C17329 c17329 = new C17329(abstractActivityC33462, c29783);
                c17329.m31258(R.string.MT_Protector_res_0x7f1202dd);
                c17329.m31256(R.string.MT_Protector_res_0x7f120221);
                c17329.m31250((CharSequence) c29783.getTag());
                c17329.m31281();
                c17329.m31279(6);
                c17329.m31266(true);
            }
        });
        if (c29782 != null) {
            c29782.setChecked(c16955.m39778());
        }
        return new C12225(spinner, spinner2, c2978, c29782, c9569);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC8139 m22887() {
        int i = 0;
        int i2 = ApplicationC20075.f65008.getInt("auto_signature_scheme", 0);
        if (i2 < 0 || i2 >= EnumC8139.values().length) {
            ApplicationC20075.f65008.edit().mo25853(0, "auto_signature_scheme").apply();
        } else {
            i = i2;
        }
        return EnumC8139.values()[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11667 m22888(C16955 c16955) {
        AbstractC13262 m22889 = m22889(c16955.m39780());
        if (m22889 == null) {
            m22889 = (AbstractC13262) f26982.get(0);
        }
        return new C11667(m22889, c16955.m39781(), c16955.m39779(), c16955.m39778());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22894(InterfaceC20858 interfaceC20858, AbstractC13262 abstractC13262, AbstractActivityC3346 abstractActivityC3346) {
        if (abstractC13262 instanceof C22435) {
            new C10109(interfaceC20858, abstractC13262, abstractActivityC3346).m20274();
            return;
        }
        C5875 c5875 = new C5875(interfaceC20858, abstractC13262, abstractActivityC3346);
        c5875.m28624(abstractC13262.m32191());
        c5875.m28627();
        c5875.m28621(abstractC13262.mo10324());
        c5875.m28625();
        c5875.m28622();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC13262 m22889(String str) {
        m22898();
        if (str == null || str.isEmpty()) {
            return null;
        }
        Iterator it = f26982.iterator();
        while (it.hasNext()) {
            AbstractC13262 abstractC13262 = (AbstractC13262) it.next();
            if (abstractC13262.mo10324().equals(str)) {
                return abstractC13262;
            }
        }
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m22898() {
        ArrayList arrayList = f26982;
        arrayList.clear();
        arrayList.add(C15378.m36415());
        AbstractC15440 m22897 = m22897();
        if (m22897.mo23120()) {
            int i = 1;
            for (AbstractC15440 abstractC15440 : (List) C5378.stream(m22897.mo23549(true)).filter(new C15690(i)).sorted(new C3404(i)).collect(C22976.toList())) {
                String lowerCase = abstractC15440.getName().toLowerCase();
                if (lowerCase.endsWith(".pk8")) {
                    AbstractC15440 m36526 = m22897.m36526(abstractC15440.m36517() + ".x509.pem");
                    if (m36526.mo23120()) {
                        arrayList.add(new C12557(m36526, abstractC15440));
                    }
                } else if (lowerCase.endsWith("aes")) {
                    arrayList.add(new C20319(abstractC15440));
                } else if (lowerCase.endsWith("enc")) {
                    arrayList.add(new C22435(abstractC15440));
                } else {
                    arrayList.add(new C4796(abstractC15440));
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m22897() {
        return C16293.m38327().m36526("keys");
    }
}
