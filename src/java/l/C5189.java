package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import java.util.Calendar;

/* compiled from: C76R */
/* renamed from: l.ۚۜܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5189 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f16267;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18595 f16268;

    public C5189(AbstractActivityC3346 abstractActivityC3346, InterfaceC18595 interfaceC18595) {
        this.f16267 = abstractActivityC3346;
        this.f16268 = interfaceC18595;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14952() {
        C19258 buildDialog = this.f16267.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120634);
        buildDialog.m44418(R.array.MT_Protector_res_0x7f030022, new DialogInterfaceOnClickListenerC6848(1, this));
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14946(final C5189 c5189, int i) {
        if (i >= 0 && i <= 3) {
            c5189.f16268.mo32374(i);
            return;
        }
        if (i == 4) {
            String m14941 = m14941(ApplicationC20075.f65008.getString("smint", null));
            String m149412 = m14941(ApplicationC20075.f65008.getString("smaxt", null));
            if (m14941 == null) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                m14941 = C17283.m40572(calendar.getTimeInMillis());
            }
            m14945(c5189.f16267, R.string.MT_Protector_res_0x7f120920, m14941, m149412, true, new C8073(c5189));
            return;
        }
        if (i == 5) {
            m14944(c5189.f16267, R.string.MT_Protector_res_0x7f12091f, ApplicationC20075.f65008.getString("smins", null), ApplicationC20075.f65008.getString("smaxs", null), ApplicationC20075.f65008.getInt("ssun", 1), true, new C14127(c5189));
            return;
        }
        if (i != 6) {
            throw new IllegalArgumentException();
        }
        AbstractActivityC3346 abstractActivityC3346 = c5189.f16267;
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f3);
        final C5062 c5062 = (C5062) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        RadioButton[] radioButtonArr = {(RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0478), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a), (RadioButton) m10216.findViewById(R.id.radioButton3)};
        checkBox.setChecked(ApplicationC20075.f65008.getBoolean("skc", false));
        final int i2 = ApplicationC20075.f65008.getInt("skt", 0);
        final int[] iArr = {i2};
        if (i2 < 0 || i2 >= 4) {
            iArr[0] = 0;
        }
        ViewOnClickListenerC9110 viewOnClickListenerC9110 = new ViewOnClickListenerC9110(1, radioButtonArr, iArr);
        radioButtonArr[iArr[0]].setChecked(true);
        for (int i3 = 0; i3 < 4; i3++) {
            radioButtonArr[i3].setOnClickListener(viewOnClickListenerC9110);
        }
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۜۜܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                C5189.m14948(C5189.this, c5062, iArr, i2, checkBox);
            }
        });
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
        C4925.m14329(c5062.m14607());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long[] m14949(int i, long j) {
        long timeInMillis;
        long timeInMillis2;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (i == 0) {
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else if (i == 1) {
            calendar.set(7, calendar.getFirstDayOfWeek());
            long timeInMillis3 = calendar.getTimeInMillis();
            calendar.add(5, 7);
            timeInMillis2 = calendar.getTimeInMillis();
            timeInMillis = timeInMillis3;
        } else if (i == 2) {
            calendar.set(5, 1);
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(2, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else if (i == 3) {
            calendar.set(6, 1);
            timeInMillis = calendar.getTimeInMillis();
            calendar.add(1, 1);
            timeInMillis2 = calendar.getTimeInMillis();
        } else {
            throw new IllegalArgumentException();
        }
        return new long[]{timeInMillis, timeInMillis2};
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14951(C5189 c5189, long j, long j2) {
        InterfaceC18595 interfaceC18595 = c5189.f16268;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C13132.FOREVER_NS;
        }
        interfaceC18595.mo32377(j, j2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14945(AbstractActivityC3346 abstractActivityC3346, int i, String str, String str2, final boolean z, final InterfaceC0249 interfaceC0249) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f5);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(i);
        final TextInputLayout textInputLayout = (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d0);
        final TextInputLayout textInputLayout2 = (TextInputLayout) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05d2);
        final EditText editText = textInputLayout.getEditText();
        C11003.requireNonNull(editText);
        final EditText editText2 = textInputLayout2.getEditText();
        C11003.requireNonNull(editText2);
        editText.setText(str);
        editText2.setText(str2);
        editText.addTextChangedListener(new C1524(false));
        editText2.addTextChangedListener(new C1524(false));
        editText.addTextChangedListener(new C3778(textInputLayout));
        editText2.addTextChangedListener(new C3778(textInputLayout2));
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        final DialogInterfaceC0206 m16343 = C5834.m16343(buildDialog, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12020f, (DialogInterface.OnClickListener) null);
        m16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩷ۜܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditText editText3 = editText;
                String trim = editText3.getText().toString().trim();
                EditText editText4 = editText2;
                String trim2 = editText4.getText().toString().trim();
                boolean isEmpty = trim.isEmpty();
                TextInputLayout textInputLayout3 = textInputLayout;
                if (isEmpty && trim2.isEmpty()) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector_res_0x7f120302));
                    return;
                }
                long m14950 = trim.isEmpty() ? -1L : C5189.m14950(trim);
                if (!trim.isEmpty() && m14950 < 0) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector_res_0x7f12022a));
                    return;
                }
                long m149502 = trim2.isEmpty() ? -1L : C5189.m14950(trim2);
                if (!trim2.isEmpty() && m149502 < 0) {
                    editText4.requestFocus();
                    textInputLayout2.setError(C4925.m14327(R.string.MT_Protector_res_0x7f12022a));
                } else if (m14950 != -1 && m149502 != -1 && m14950 >= m149502) {
                    editText3.requestFocus();
                    textInputLayout3.setError(C4925.m14327(R.string.MT_Protector_res_0x7f12062c));
                } else {
                    if (z) {
                        ApplicationC20075.f65008.edit().putString("smint", trim).putString("smaxt", trim2).apply();
                    }
                    interfaceC0249.mo1507(m14950, m149502);
                    m16343.dismiss();
                }
            }
        });
        m16343.m1448().setOnClickListener(new ViewOnClickListenerC16391(editText2, editText));
        C4925.m14329(editText);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m14941(String str) {
        if (str == null || str.isEmpty() || m14950(str) >= 0) {
            return str;
        }
        long m40575 = C17283.m40575(str);
        if (m40575 < 0 || !C17283.m40576(m40575).equals(str)) {
            return null;
        }
        return C17283.m40572(m40575);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m14950(String str) {
        long m40570 = C17283.m40570(str);
        if (m40570 < 0 || !C17283.m40572(m40570).equals(str)) {
            return -1L;
        }
        return m40570;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14942(Main main, long j, long j2, C11505 c11505) {
        m14945(main, R.string.MT_Protector_res_0x7f1203e0, j == -1 ? "" : C17283.m40572(j), j2 != -1 ? C17283.m40572(j2) : "", false, c11505);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14947(C5189 c5189, long j, long j2) {
        InterfaceC18595 interfaceC18595 = c5189.f16268;
        if (j == -1) {
            j = 0;
        }
        if (j2 == -1) {
            j2 = C13132.FOREVER_NS;
        }
        interfaceC18595.mo32375(j, j2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14944(AbstractActivityC3346 abstractActivityC3346, int i, String str, String str2, int i2, final boolean z, final InterfaceC19301 interfaceC19301) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00f4);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(i);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        final Spinner spinner = (Spinner) m10216.findViewById(R.id.spinner);
        spinner.setAdapter((SpinnerAdapter) new C2367(abstractActivityC3346, Arrays.asList("B", "KB", "MB", "GB")));
        editText.setText(str);
        editText2.setText(str2);
        spinner.setSelection(i2);
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        final DialogInterfaceC0206 m19253 = C7187.m19253(buildDialog, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        m19253.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.᩻ۜܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                long j;
                long j2;
                long j3;
                long j4;
                EditText editText3 = editText;
                String trim = editText3.getText().toString().trim();
                EditText editText4 = editText2;
                String trim2 = editText4.getText().toString().trim();
                int selectedItemPosition = spinner.getSelectedItemPosition();
                long j5 = 1 << (selectedItemPosition * 10);
                if (trim.isEmpty() && trim2.isEmpty()) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f120302);
                    return;
                }
                if (trim.isEmpty()) {
                    j2 = -1;
                } else {
                    try {
                        j = Long.parseLong(trim);
                    } catch (NumberFormatException unused) {
                        j = -1;
                    }
                    j2 = j * j5;
                }
                if (!trim.isEmpty() && j2 < 0) {
                    editText3.requestFocus();
                    C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
                if (trim2.isEmpty()) {
                    j4 = -1;
                } else {
                    try {
                        j3 = Long.parseLong(trim2);
                    } catch (NumberFormatException unused2) {
                        j3 = -1;
                    }
                    j4 = j3 * j5;
                }
                if (!trim2.isEmpty() && j4 < 0) {
                    editText4.requestFocus();
                    C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
                    return;
                }
                if ((j2 != -1 ? j2 : 0L) >= (j4 == -1 ? C13132.FOREVER_NS : j4)) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f1204c1);
                    return;
                }
                if (z) {
                    ApplicationC20075.f65008.edit().putString("smins", trim).putString("smaxs", trim2).mo25853(selectedItemPosition, "ssun").apply();
                }
                interfaceC19301.mo33424(j2, j4);
                m19253.dismiss();
            }
        });
        C4925.m14329(editText);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14943(Main main, long j, long j2, C13970 c13970) {
        int i;
        if (j == -1 && j2 == -1) {
            i = 1;
        } else {
            for (int i2 = 3; i2 > 0; i2--) {
                long j3 = 1 << (i2 * 10);
                if ((j == -1 || j % j3 == 0) && (j2 == -1 || j2 % j3 == 0)) {
                    i = i2;
                    break;
                }
            }
            i = 0;
        }
        long j4 = 1 << (i * 10);
        m14944(main, R.string.MT_Protector_res_0x7f1203df, j == -1 ? "" : Long.toString(j / j4), j2 == -1 ? "" : Long.toString(j2 / j4), i, false, c13970);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14948(C5189 c5189, C5062 c5062, int[] iArr, int i, CheckBox checkBox) {
        InterfaceC7397 interfaceC7397;
        c5062.m14610();
        if (iArr[0] != i) {
            ApplicationC20075.f65008.edit().mo25853(iArr[0], "skt").apply();
        }
        ApplicationC20075.f65008.edit().putBoolean("skc", checkBox.isChecked()).apply();
        final String obj = c5062.m14611().toString();
        if (obj.isEmpty()) {
            return;
        }
        final boolean isChecked = checkBox.isChecked();
        int i2 = iArr[0];
        if (i2 == 0) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ۢۜܳ
                @Override // l.InterfaceC7397
                /* renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = isChecked;
                    String str2 = obj;
                    return z ? str.contains(str2) : C9679.m24616((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 1) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ۡۜܳ
                @Override // l.InterfaceC7397
                /* renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = isChecked;
                    String str2 = obj;
                    return z ? !str.contains(str2) : !C9679.m24616((CharSequence) str, (CharSequence) str2);
                }
            };
        } else if (i2 == 2) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ܺۜܳ
                @Override // l.InterfaceC7397
                /* renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = isChecked;
                    String str2 = obj;
                    return z ? str.startsWith(str2) : C9679.m24619(str2, str);
                }
            };
        } else if (i2 == 3) {
            interfaceC7397 = new InterfaceC7397() { // from class: l.ܳۜܳ
                @Override // l.InterfaceC7397
                /* renamed from: ֫ */
                public final boolean mo12795(String str) {
                    boolean z = isChecked;
                    String str2 = obj;
                    return z ? str.endsWith(str2) : C9679.m24617((CharSequence) str2, str);
                }
            };
        } else {
            throw new IllegalArgumentException();
        }
        c5189.f16268.mo32376(interfaceC7397);
    }
}
