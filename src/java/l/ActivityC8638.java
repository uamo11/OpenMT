package l;

import bin.mt.plus.R;

/* compiled from: CAHS */
/* renamed from: l.ۡۘᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC8638 extends AbstractActivityC1606 {
    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public String mo121() {
        return "FullEditorPreferences";
    }

    public ActivityC8638() {
        super(R.xml.MT_Protector_res_0x7f150001);
    }

    @Override // l.AbstractActivityC1606
    /* renamed from: ֫ */
    public final boolean mo5466(C7705 c7705, C2095 c2095, Object obj) {
        boolean booleanValue;
        String str;
        C7055 m49240 = c7705.m49240();
        String m6911 = c2095.m6911();
        m6911.getClass();
        switch (m6911) {
            case "symbol_input":
                booleanValue = ((Boolean) obj).booleanValue();
                str = "custom_symbols";
                break;
            case "edit_show_line_numbers":
                booleanValue = ((Boolean) obj).booleanValue();
                str = "edit_fixed_line_numbers";
                break;
            case "edit_show_blank_symbol":
                booleanValue = ((Boolean) obj).booleanValue();
                str = "hide_single_space";
                break;
            default:
                return false;
        }
        m49240.m10700((CharSequence) str).m6931(booleanValue);
        return true;
    }

    @Override // l.AbstractActivityC1606
    /* renamed from: ֫ */
    public void mo5465(C7705 c7705, C7055 c7055) {
        if (!((C1410) c7055.m10700("edit_show_line_numbers")).m49256()) {
            c7055.m10700("edit_fixed_line_numbers").m6931(false);
        }
        if (!((C1410) c7055.m10700("edit_show_blank_symbol")).m49256()) {
            c7055.m10700("hide_single_space").m6931(false);
        }
        if (((C1410) c7055.m10700("symbol_input")).m49256()) {
            return;
        }
        c7055.m10700("custom_symbols").m6931(false);
    }
}
