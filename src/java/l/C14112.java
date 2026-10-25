package l;

import android.widget.EditText;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: P676 */
/* renamed from: l.ܰ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14112 extends AbstractC15252 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21107 f42591;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14112(ActivityC21107 activityC21107) {
        super(activityC21107);
        this.f42591 = activityC21107;
        m36260(R.string.MT_Protector_res_0x7f12016f);
        m36257(R.string.MT_Protector_res_0x7f12001e, R.string.MT_Protector_res_0x7f120a07, R.string.MT_Protector_res_0x7f1204bf, R.string.MT_Protector_res_0x7f1209bc);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m33722() {
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        String str;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        EditText m36254 = m36254(0);
        ActivityC21107 activityC21107 = this.f42591;
        c18284 = activityC21107.f68093;
        m36254.setText(EnumC7233.m19336(c18284.f56834.f33738));
        c182842 = activityC21107.f68093;
        m36254(1).setText(c182842.f56834.f33744.m50835());
        c182843 = activityC21107.f68093;
        String str2 = "";
        if (c182843.f56834.f33740 != null) {
            c182846 = activityC21107.f68093;
            str = c182846.f56834.f33740.m32665(" ");
        } else {
            str = "";
        }
        m36254(2).setText(str);
        c182844 = activityC21107.f68093;
        if (c182844.f56834.f33739 != null) {
            c182845 = activityC21107.f68093;
            str2 = c182845.f56834.f33739.m28273();
        }
        m36254(3).setText(str2);
        m36262();
    }

    @Override // l.AbstractC15252
    /* renamed from: ܽ */
    public final boolean mo4060() {
        int i;
        C18284 c18284;
        C18284 c182842;
        C18284 c182843;
        C13582 c13582;
        C18284 c182844;
        C18284 c182845;
        C18284 c182846;
        C18284 c182847;
        C18284 c182848;
        String[] split;
        C18284 c182849;
        String[] split2;
        ActivityC21107 activityC21107 = this.f42591;
        try {
            String obj = m36254(0).getText().toString();
            if (obj.equals("") || (split2 = ActivityC21107.f68087.split(obj)) == null) {
                i = 0;
            } else {
                i = 0;
                for (String str : split2) {
                    i |= EnumC7233.m19338(str).getValue();
                }
            }
            c18284 = activityC21107.f68093;
            c18284.f56834.f33738 = i;
            c182842 = activityC21107.f68093;
            C11258 c11258 = c182842.f56834;
            c182843 = activityC21107.f68093;
            c11258.f33744 = C22755.m50831(m36254(1).getText().toString(), c182843.f56840);
            ArrayList arrayList = new ArrayList();
            String obj2 = m36254(2).getText().toString();
            if (!obj2.equals("") && (split = ActivityC21107.f68087.split(obj2)) != null) {
                for (String str2 : split) {
                    if (!str2.equals("")) {
                        c182849 = activityC21107.f68093;
                        arrayList.add(C22755.m50831(str2, c182849.f56840));
                    }
                }
            }
            if (arrayList.size() > 0) {
                c182848 = activityC21107.f68093;
                c13582 = C13582.m32663(c182848.f56840, arrayList);
            } else {
                c13582 = null;
            }
            c182844 = activityC21107.f68093;
            c182844.f56834.f33740 = c13582;
            String trim = m36254(3).getText().toString().trim();
            if (!trim.equals("")) {
                c182846 = activityC21107.f68093;
                C11258 c112582 = c182846.f56834;
                c182847 = activityC21107.f68093;
                c112582.f33739 = C11467.m28270(trim, c182847.f56840);
            } else {
                c182845 = activityC21107.f68093;
                c182845.f56834.f33739 = null;
            }
            ActivityC21107.f68088 = true;
            C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
            return true;
        } catch (Exception unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1208cc);
            return false;
        }
    }
}
