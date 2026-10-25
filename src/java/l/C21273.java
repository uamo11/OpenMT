package l;

import android.content.Context;
import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: 1599 */
/* renamed from: l.᩸֫ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21273 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f68619 = true;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f68620 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48293(final C6807 c6807) {
        Context context = c6807.getContext();
        View inflate = View.inflate(context, R.layout.MT_Protector_res_0x7f0d00bb, null);
        final EditText editText = (EditText) inflate.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final EditText editText2 = (EditText) inflate.findViewById(R.id.editText2);
        final TextView textView = (TextView) inflate.findViewById(R.id.textView);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.MT_Protector_res_0x7f0a00da);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.checkBox2);
        checkBox.setChecked(f68620);
        checkBox2.setChecked(f68619);
        C11041 c11041 = c6807.f21109;
        int m27418 = c11041.m27418();
        m48288(editText, m27418);
        int i = 1;
        if (c11041.m27406()) {
            int m27404 = c11041.m27404();
            if (f68620) {
                m48288(editText2, (m27404 - m27418) + 1);
            } else {
                textView.setText(R.string.MT_Protector_res_0x7f12043b);
                m48288(editText2, m27404);
            }
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֡֫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C21273.m48292(textView, editText, editText2, c6807, z);
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۚ֫ܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C21273.m48291(editText, editText2, c6807, z);
            }
        });
        editText.addTextChangedListener(new C14921(editText, editText2, c6807));
        m48295(editText, editText2, c11041.m27415());
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(context);
        c19258.m44421(inflate);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        final DialogInterfaceC0206 m16343 = C5834.m16343(c19258, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f120600, (DialogInterface.OnClickListener) null);
        m16343.m1448().setOnClickListener(new ViewOnClickListenerC22294(c6807, editText, editText2, i));
        m16343.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨֫ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21273.m48290(editText, editText2, c6807, m16343);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48292(TextView textView, EditText editText, EditText editText2, C6807 c6807, boolean z) {
        f68620 = z;
        int i = 16;
        try {
            if (z) {
                textView.setText(R.string.MT_Protector_res_0x7f12043c);
                int parseInt = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
                String obj = editText2.getText().toString();
                if (!f68619) {
                    i = 10;
                }
                int parseInt2 = Integer.parseInt(obj, i);
                if (parseInt2 < parseInt) {
                    m48288(editText, parseInt2);
                    m48288(editText2, (parseInt - parseInt2) + 1);
                } else {
                    m48288(editText2, (parseInt2 - parseInt) + 1);
                }
            } else {
                textView.setText(R.string.MT_Protector_res_0x7f12043b);
                int parseInt3 = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
                String obj2 = editText2.getText().toString();
                if (!f68619) {
                    i = 10;
                }
                long parseInt4 = (parseInt3 + Integer.parseInt(obj2, i)) - 1;
                if (parseInt4 < -2147483648L || parseInt4 > 2147483647L) {
                    throw new NumberFormatException();
                }
                m48288(editText2, (int) parseInt4);
            }
        } catch (NumberFormatException unused) {
        }
        m48295(editText, editText2, c6807.f21109.m27415());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48291(EditText editText, EditText editText2, C6807 c6807, boolean z) {
        f68619 = z;
        try {
            m48288(editText, Integer.parseInt(editText.getText().toString(), f68619 ? 10 : 16));
        } catch (NumberFormatException unused) {
        }
        try {
            m48288(editText2, Integer.parseInt(editText2.getText().toString(), f68619 ? 10 : 16));
        } catch (NumberFormatException unused2) {
        }
        m48295(editText, editText2, c6807.f21109.m27415());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48294(C6807 c6807, EditText editText, EditText editText2, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        C11041 c11041 = c6807.f21109;
        int m27415 = c11041.m27415();
        if (itemId == 17039373) {
            if (f68620) {
                m48288(editText, 0);
                m48288(editText2, m27415);
                return;
            } else {
                m48288(editText, 0);
                m48288(editText2, Math.max(m27415 - 1, 0));
                return;
            }
        }
        if (itemId == R.string.MT_Protector_res_0x7f120602) {
            if (f68620) {
                m48288(editText, 0);
                m48288(editText2, m27415 != 0 ? c11041.m27404() + 1 : 0);
                return;
            } else {
                m48288(editText, 0);
                return;
            }
        }
        if (itemId == R.string.MT_Protector_res_0x7f120603) {
            if (f68620) {
                m48288(editText2, m27415 - c11041.m27418());
            } else {
                m48288(editText2, Math.max(m27415 - 1, 0));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48290(EditText editText, EditText editText2, C6807 c6807, DialogInterfaceC0206 dialogInterfaceC0206) {
        int i;
        C11041 c11041 = c6807.f21109;
        try {
            int parseInt = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
            try {
                int parseInt2 = Integer.parseInt(editText2.getText().toString(), f68619 ? 16 : 10);
                int m27415 = c11041.m27415();
                if (f68620) {
                    try {
                        if (m27415 < 0 || parseInt < 0 || parseInt > m27415 || parseInt2 < 0) {
                            throw new IllegalArgumentException("Selection range is out of bounds");
                        }
                        if (parseInt2 == 0) {
                            i = parseInt;
                        } else {
                            long j = (parseInt + parseInt2) - 1;
                            if (parseInt == m27415 || j >= m27415) {
                                throw new IllegalArgumentException("Selection range is out of bounds");
                            }
                            i = (int) j;
                        }
                        if (parseInt2 == 0) {
                            c11041.m27392(parseInt, true);
                            c6807.invalidate();
                            c6807.m18483(c11041.m27418());
                            dialogInterfaceC0206.dismiss();
                            return;
                        }
                        parseInt2 = i;
                    } catch (IllegalArgumentException unused) {
                        C21374.m48462(R.string.MT_Protector_res_0x7f12030d, 0).m48468();
                        return;
                    }
                } else {
                    if (m27415 == 0 && parseInt == 0 && parseInt2 == 0) {
                        c11041.m27392(0, true);
                        c6807.invalidate();
                        c6807.m18483(c11041.m27418());
                        dialogInterfaceC0206.dismiss();
                        return;
                    }
                    if (parseInt > parseInt2) {
                        parseInt2 = parseInt;
                        parseInt = parseInt2;
                    }
                }
                if (parseInt < 0 || parseInt2 >= m27415) {
                    C21374.m48462(R.string.MT_Protector_res_0x7f12030d, 0).m48468();
                } else {
                    c6807.m18476(parseInt, parseInt2);
                    dialogInterfaceC0206.dismiss();
                }
            } catch (NumberFormatException unused2) {
                editText2.requestFocus();
                C21374.m48462(R.string.MT_Protector_res_0x7f120b48, 0).m48468();
            }
        } catch (NumberFormatException unused3) {
            editText.requestFocus();
            C21374.m48462(R.string.MT_Protector_res_0x7f120b48, 0).m48468();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48295(EditText editText, EditText editText2, int i) {
        try {
            int parseInt = Integer.parseInt(editText.getText().toString(), f68619 ? 16 : 10);
            if (parseInt >= i) {
                throw new NumberFormatException();
            }
            if (f68620) {
                int i2 = i - parseInt;
                if (f68619) {
                    editText2.setHint("1…" + Integer.toHexString(i2).toUpperCase());
                    return;
                } else {
                    editText2.setHint("1…" + i2);
                    return;
                }
            }
            int i3 = i - 1;
            if (f68619) {
                editText2.setHint(Integer.toHexString(parseInt).toUpperCase() + "…" + Integer.toHexString(i3).toUpperCase());
                return;
            }
            editText2.setHint(parseInt + "…" + i3);
        } catch (NumberFormatException unused) {
            editText2.setHint((CharSequence) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48288(EditText editText, int i) {
        editText.setText(Integer.toString(i, f68619 ? 16 : 10).toUpperCase());
        editText.setSelection(editText.length());
    }
}
