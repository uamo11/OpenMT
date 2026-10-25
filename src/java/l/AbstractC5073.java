package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: H88G */
/* renamed from: l.ۚۖ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC5073 {
    /* renamed from: ֫ */
    public abstract String mo1204();

    /* renamed from: ֫ */
    public abstract List mo1205(String str, String str2);

    /* renamed from: ۧ */
    public abstract String mo1206();

    /* renamed from: ܳ */
    public abstract boolean mo1207();

    /* renamed from: ܽ */
    public abstract String mo1208();

    /* renamed from: ܿ */
    public abstract String mo1209();

    /* renamed from: ᩳ */
    public abstract int mo1210();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC5073 m14618(int i) {
        C0133 c0133;
        C2251 c2251;
        C6484 c6484;
        C15655 c15655;
        C20596 c20596;
        C19185 c19185;
        C0133 c01332;
        if (i == 0) {
            c0133 = C0133.f1248;
            return c0133;
        }
        if (i == 1) {
            c2251 = C2251.f7325;
            return c2251;
        }
        if (i == 2) {
            c6484 = C6484.f20016;
            return c6484;
        }
        if (i == 3) {
            c15655 = C15655.f48179;
            return c15655;
        }
        if (i == 4) {
            c20596 = C20596.f66300;
            return c20596;
        }
        if (i == 5) {
            c19185 = C19185.f60439;
            return c19185;
        }
        c01332 = C0133.f1248;
        return c01332;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo14619(AbstractActivityC3346 abstractActivityC3346, EditText editText, EditText editText2, EditText editText3, EditText editText4, EditText editText5) {
        if (AbstractC3577.m10939(editText, R.string.MT_Protector_res_0x7f120304) && AbstractC3577.m10939(editText2, R.string.MT_Protector_res_0x7f120304)) {
            new C23417(abstractActivityC3346, new C17773(this, editText, editText2), editText5, editText3, editText4).m20274();
        }
    }

    public final String toString() {
        return mo1208();
    }
}
