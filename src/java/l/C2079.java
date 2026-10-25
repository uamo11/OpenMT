package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: N1MQ */
/* renamed from: l.֫᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2079 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C15859 f6929 = C15859.m37593(new int[]{R.string.MT_Protector_res_0x7f120a56, R.string.MT_Protector_res_0x7f1201be, R.string.MT_Protector_res_0x7f120277, R.string.MT_Protector_res_0x7f12026d, R.string.MT_Protector_res_0x7f1200e3, R.string.MT_Protector_res_0x7f12010d});

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13658 f6930;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f6931;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13658 f6932;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f6933;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f6934;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f6935;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6936;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f6937;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f6938;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2079 m6839() {
        C2079 c2079 = new C2079();
        c2079.f6930 = new C13658();
        c2079.f6932 = new C13658();
        c2079.f6936 = 7;
        return c2079;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6842(int i, String str) {
        String m14327 = C4925.m14327(i);
        this.f6938 = str;
        C13658 c13658 = this.f6930;
        c13658.f40732 = null;
        c13658.f40730 = m14327;
        c13658.f40728 = m14327;
        if (c13658.f40729 == null) {
            c13658.f40729 = m14327;
        }
        c13658.f40731 = Boolean.TRUE;
        c13658.f40733 = false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6846(int i, String str) {
        String m14327 = C4925.m14327(i);
        this.f6931 = str;
        C13658 c13658 = this.f6932;
        c13658.f40732 = null;
        c13658.f40730 = m14327;
        c13658.f40728 = m14327;
        if (c13658.f40729 == null) {
            c13658.f40729 = m14327;
        }
        c13658.f40731 = Boolean.TRUE;
        c13658.f40733 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6843(String str) {
        this.f6930.f40727 = str;
        this.f6932.f40727 = str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m6849(String str) {
        this.f6930.f40729 = str;
        this.f6932.f40729 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6841(int i) {
        int indexOf = f6929.indexOf(i);
        this.f6937 = indexOf;
        if (indexOf == -1) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m6848(String str) {
        this.f6933 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6844(ArrayList arrayList) {
        this.f6934 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6840() {
        this.f6936 = 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6847(String str) {
        this.f6935 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6845(AbstractActivityC3346 abstractActivityC3346) {
        C13658 c13658 = this.f6932;
        C13658 c136582 = this.f6930;
        if (this.f6938 != null) {
            AbstractC15440 m36526 = C16293.f50110.m36526("diffText1");
            try {
                m36526.m36510(this.f6938);
            } catch (IOException e) {
                abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
            }
            c136582.f40732 = m36526;
        }
        if (this.f6931 != null) {
            AbstractC15440 m365262 = C16293.f50110.m36526("diffText2");
            try {
                m365262.m36510(this.f6931);
            } catch (IOException e2) {
                abstractActivityC3346.m10223(e2, (DialogInterface.OnDismissListener) null);
            }
            c13658.f40732 = m365262;
        }
        if (c136582.f40732 == null || c136582.f40730 == null || c136582.f40728 == null || c136582.f40729 == null || c136582.f40731 == null || c13658.f40732 == null || c13658.f40730 == null || c13658.f40728 == null || c13658.f40729 == null || c13658.f40731 == null) {
            throw new IllegalArgumentException();
        }
        Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC1748.class);
        intent.putExtra("arg1", c136582.m32819().toString());
        intent.putExtra("arg2", c13658.m32819().toString());
        intent.putExtra("moreInfoFlags", this.f6936);
        intent.putExtra("titleIndex", this.f6937);
        String str = this.f6935;
        if (str != null) {
            intent.putExtra("moreInfoReplacedPath", str);
        }
        String str2 = this.f6933;
        if (str2 != null) {
            intent.putExtra("subtitle", str2);
        }
        ArrayList<String> arrayList = this.f6934;
        if (arrayList != null) {
            intent.putStringArrayListExtra("customIgnoreRegexes", arrayList);
        }
        abstractActivityC3346.startActivity(intent);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m6838(int i) {
        C15859 c15859 = f6929;
        if (i < 0 || i >= c15859.size()) {
            i = 0;
        }
        return c15859.getInt(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6835(Main main, final C7309 c7309) {
        View m10216 = main.m10216(R.layout.MT_Protector_res_0x7f0d00a9);
        final EditText editText = (EditText) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        final EditText editText2 = (EditText) m10216.findViewById(R.id.editText2);
        editText.setKeyListener(null);
        editText2.setKeyListener(null);
        m6836(c7309.f22440, c7309.f22438, editText, editText2);
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(main);
        c19258.m44421(m10216);
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC11543(0, c7309, main));
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44440(R.string.MT_Protector_res_0x7f12030f, (DialogInterface.OnClickListener) null);
        c19258.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩺ۜᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7309 c73092 = C7309.this;
                c73092.m19594();
                C2079.m6836(c73092.f22440, c73092.f22438, editText, editText2);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6837(C7309 c7309, AbstractActivityC3346 abstractActivityC3346) {
        c7309.m19592();
        C2079 m6839 = m6839();
        AbstractC15440 abstractC15440 = c7309.f22436;
        m6839.f6938 = null;
        C13658 c13658 = m6839.f6930;
        c13658.f40732 = abstractC15440;
        if (c13658.f40730 == null) {
            c13658.f40730 = abstractC15440.mo23554();
        }
        if (c13658.f40728 == null) {
            c13658.f40728 = abstractC15440.getName();
        }
        if (c13658.f40729 == null) {
            c13658.f40729 = abstractC15440.getName();
        }
        if (c13658.f40731 == null) {
            c13658.f40731 = Boolean.FALSE;
        }
        c13658.f40733 = false;
        AbstractC15440 abstractC154402 = c7309.f22437;
        m6839.f6931 = null;
        C13658 c136582 = m6839.f6932;
        c136582.f40732 = abstractC154402;
        if (c136582.f40730 == null) {
            c136582.f40730 = abstractC154402.mo23554();
        }
        if (c136582.f40728 == null) {
            c136582.f40728 = abstractC154402.getName();
        }
        if (c136582.f40729 == null) {
            c136582.f40729 = abstractC154402.getName();
        }
        if (c136582.f40731 == null) {
            c136582.f40731 = Boolean.FALSE;
        }
        c136582.f40733 = false;
        m6839.m6845(abstractActivityC3346);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6836(String str, String str2, EditText editText, EditText editText2) {
        File file = new File(str);
        File file2 = new File(str2);
        String name = file.getName();
        String name2 = file2.getName();
        while (name.equals(name2)) {
            file = file.getParentFile();
            file2 = file2.getParentFile();
            if (file == null || file2 == null) {
                break;
            }
            name = file.getName() + "/" + name;
            name2 = file2.getName() + "/" + name2;
        }
        editText.setText(name);
        editText2.setText(name2);
    }
}
