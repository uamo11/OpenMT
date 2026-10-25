package l;

import android.view.Menu;
import android.view.MenuItem;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;

/* compiled from: 71FU */
/* renamed from: l.᩺ᩳۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23155 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f74418;

    public C23155(C21282 c21282, String str, boolean z) {
        Menu menu;
        this.f74418 = str;
        String m18061 = C6554.m18061(30, C9523.m24404(str));
        String m180612 = C6554.m18061(30, str.replace('/', '.'));
        CharSequence m180613 = C6554.m18061(30, str);
        CharSequence m180614 = C6554.m18061(30, "L" + str + l.b);
        if (z) {
            menu = c21282.m48304().addSubMenu(0, R.string.MT_Protector_res_0x7f1205c2, 0, R.string.MT_Protector_res_0x7f1205c2);
        } else {
            menu = c21282.m48304();
        }
        menu.add(R.string.MT_Protector_res_0x7f1205c2, 0, 0, m18061);
        if (!m18061.equals(m180612)) {
            menu.add(R.string.MT_Protector_res_0x7f1205c2, 1, 0, m180612);
        }
        if (!m180612.equals(m180613)) {
            menu.add(R.string.MT_Protector_res_0x7f1205c2, 2, 0, m180613);
        }
        menu.add(R.string.MT_Protector_res_0x7f1205c2, 3, 0, m180614);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51333(MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1205c2) {
            return true;
        }
        if (menuItem.getGroupId() != R.string.MT_Protector_res_0x7f1205c2) {
            return false;
        }
        int itemId = menuItem.getItemId();
        String str = this.f74418;
        if (itemId == 0) {
            C4925.m14314((CharSequence) C9523.m24404(str));
        } else if (itemId == 1) {
            C4925.m14314((CharSequence) str.replace('/', '.'));
        } else if (itemId == 2) {
            C4925.m14314((CharSequence) str);
        } else if (itemId == 3) {
            C4925.m14314((CharSequence) ("L" + str + l.b));
        }
        return true;
    }
}
