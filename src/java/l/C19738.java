package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: G1PO */
/* renamed from: l.᩵᩸ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19738 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f63764 = true;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f63765 = true;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f63766 = true;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f63767 = false;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f63768 = true;

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0183, code lost:
    
        if (l.C8882.m22959(r5.mo3817()) != 2) goto L106;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m45447(l.InterfaceC8566 r12) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19738.m45447(l.ۡ֫ۚ):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45446(final C16560 c16560, final C7309 c7309) {
        Main m39056 = c16560.m39056();
        View m10216 = m39056.m10216(R.layout.MT_Protector_res_0x7f0d00a9);
        EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        final CheckBox checkBox2 = (CheckBox) m10216.findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00df);
        final CheckBox checkBox4 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e0);
        final CheckBox checkBox5 = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a00e1);
        checkBox.setVisibility(0);
        checkBox2.setVisibility(0);
        checkBox3.setVisibility(0);
        checkBox4.setVisibility(0);
        checkBox5.setVisibility(0);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f1205b9);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        C2079.m6836(c7309.f22440, c7309.f22438, editText, editText2);
        checkBox.setChecked(f63764);
        checkBox2.setChecked(f63766);
        checkBox3.setChecked(f63768);
        checkBox4.setChecked(f63765);
        checkBox5.setChecked(f63767);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(m39056);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.۟ܶܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C19738.m45445(C7309.this, checkBox, checkBox2, checkBox3, checkBox4, checkBox5, c16560);
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector_res_0x7f12030f, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new ViewOnClickListenerC2098(c7309, editText, editText2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45445(C7309 c7309, CheckBox checkBox, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4, CheckBox checkBox5, C16560 c16560) {
        c7309.m19592();
        f63764 = checkBox.isChecked();
        f63766 = checkBox2.isChecked();
        f63768 = checkBox3.isChecked();
        f63765 = checkBox4.isChecked();
        boolean isChecked = checkBox5.isChecked();
        f63767 = isChecked;
        AbstractC15440 abstractC15440 = c7309.f22436;
        AbstractC15440 abstractC154402 = c7309.f22437;
        boolean z = f63764;
        boolean z2 = f63766;
        boolean z3 = f63768;
        boolean z4 = f63765;
        AbstractC15440 m51761 = C23346.m51761(c16560, R.string.MT_Protector_res_0x7f1205b9, "mtcr");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C19032.class);
        c0994.m3474("saveAsPath", m51761.mo23554());
        c0994.m3474("inputPath1", abstractC15440.mo23554());
        c0994.m3474("inputPath2", abstractC154402.mo23554());
        c0994.m3475("ignoreDebugInfo", z);
        c0994.m3475("ignoreOptimize", z2);
        c0994.m3475("ignoreRegister", z3);
        c0994.m3475("ignoreNopInstruction", z4);
        c0994.m3475("ignoreResIdChanges", isChecked);
        c0994.m3469();
    }
}
