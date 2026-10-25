package l;

import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: BAG5 */
/* renamed from: l.᩻᩸ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23968 extends AbstractC17429 {
    @Override // l.AbstractViewOnClickListenerC12490, android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (this.f37526.m10155()) {
            return false;
        }
        C21282 c21282 = new C21282(this.f34527, view, 8388693);
        C7716.m20669(view);
        c21282.m48306();
        C3060 m48304 = c21282.m48304();
        SubMenu addSubMenu = m48304.addSubMenu(0, R.string.MT_Protector_res_0x7f1202d3, 0, R.string.MT_Protector_res_0x7f1202d3);
        addSubMenu.getItem().setIcon(R.drawable.MT_Protector_res_0x7f0801ce);
        m52794(addSubMenu);
        m48304.add(0, R.string.MT_Protector_res_0x7f1202d2, 0, R.string.MT_Protector_res_0x7f1202d2).setIcon(R.drawable.MT_Protector_res_0x7f0801fb);
        c21282.m48302(new InterfaceC14930() { // from class: l.ܳ᩸ܳ
            @Override // l.InterfaceC14930
            public final boolean onMenuItemClick(MenuItem menuItem) {
                Main main = C23968.this.f34527;
                if (menuItem.getItemId() != R.string.MT_Protector_res_0x7f1202d2) {
                    return C23968.m52795(main, menuItem.getItemId());
                }
                AbstractC17429.m40769(main);
                return true;
            }
        });
        c21282.m48305();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52794(SubMenu subMenu) {
        subMenu.add(0, R.id.MT_Protector_res_0x7f0a0059, 0, "FTP");
        if (C23196.m51454()) {
            subMenu.add(0, R.id.MT_Protector_res_0x7f0a005a, 0, "FTPS");
            subMenu.add(0, R.id.MT_Protector_res_0x7f0a005c, 0, "SFTP");
            subMenu.add(0, R.id.MT_Protector_res_0x7f0a005d, 0, "SMB");
            subMenu.add(0, R.id.MT_Protector_res_0x7f0a005e, 0, "WebDav");
            subMenu.add(0, R.id.MT_Protector_res_0x7f0a005b, 0, C4925.m14327(R.string.MT_Protector_res_0x7f120702));
            return;
        }
        subMenu.add(0, R.id.MT_Protector_res_0x7f0a005a, 0, "FTPS (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector_res_0x7f0a005c, 0, "SFTP (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector_res_0x7f0a005d, 0, "SMB (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector_res_0x7f0a005e, 0, "WebDav (VIP)").setEnabled(false);
        subMenu.add(0, R.id.MT_Protector_res_0x7f0a005b, 0, C4925.m14327(R.string.MT_Protector_res_0x7f120702).concat(" (VIP)")).setEnabled(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52795(AbstractActivityC3346 abstractActivityC3346, int i) {
        if (i == R.id.MT_Protector_res_0x7f0a0059) {
            C1936.m6364(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector_res_0x7f0a005a) {
            C6875.m18613(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector_res_0x7f0a005c) {
            C14719.m35017(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector_res_0x7f0a005e) {
            C5156.m14738(abstractActivityC3346);
            return true;
        }
        if (i == R.id.MT_Protector_res_0x7f0a005d) {
            C23354.m51766(abstractActivityC3346);
            return true;
        }
        if (i != R.id.MT_Protector_res_0x7f0a005b) {
            return false;
        }
        C12834.m31212(abstractActivityC3346);
        return true;
    }
}
