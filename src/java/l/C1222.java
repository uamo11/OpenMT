package l;

import android.widget.EditText;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* compiled from: 47JB */
/* renamed from: l.֨ܺܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1222 extends AbstractC15252 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12511 f4387;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4388;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3339 f4389;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222(ActivityC3339 activityC3339, ActivityC3339 activityC33392, int i, C12511 c12511) {
        super(activityC33392);
        this.f4389 = activityC3339;
        this.f4388 = i;
        this.f4387 = c12511;
    }

    @Override // l.AbstractC15252
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo4060() {
        List list;
        C15332 c15332;
        List list2;
        C15332 c153322;
        List list3;
        int m27878;
        List list4;
        TextInputLayout m36259 = m36259(0);
        TextInputLayout m362592 = m36259(1);
        EditText editText = m36259.getEditText();
        C11003.requireNonNull(editText);
        EditText editText2 = m362592.getEditText();
        C11003.requireNonNull(editText2);
        String obj = editText.getText().toString();
        String obj2 = editText2.getText().toString();
        if (obj.isEmpty() && obj2.isEmpty()) {
            return true;
        }
        boolean isEmpty = obj.isEmpty();
        ActivityC3339 activityC3339 = this.f4389;
        if (isEmpty) {
            m36259.setError(activityC3339.getString(R.string.MT_Protector_res_0x7f120305));
            m27878 = C11266.m27878(8.0f);
        } else {
            list = activityC3339.f10555;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                list4 = activityC3339.f10555;
                if (obj.equals(((C12511) list4.get(i)).f37581)) {
                    break;
                }
                i++;
            }
            int i2 = this.f4388;
            if (i != -1 && i != i2) {
                m36259.setError(activityC3339.getString(R.string.MT_Protector_res_0x7f1201a6));
                m27878 = C11266.m27878(8.0f);
            } else {
                if (i2 == -1) {
                    list2 = activityC3339.f10555;
                    list2.add(new C12511(obj, obj2));
                    c153322 = activityC3339.f10557;
                    list3 = activityC3339.f10555;
                    c153322.notifyItemInserted(list3.size() - 1);
                } else {
                    C12511 c12511 = this.f4387;
                    c12511.f37581 = obj;
                    c12511.f37580 = obj2;
                    c15332 = activityC3339.f10557;
                    c15332.notifyItemChanged(i2);
                }
                C10395.m26219();
                return true;
            }
        }
        C9876.m24967(m362592, -1, m27878, -1, -1);
        return false;
    }
}
