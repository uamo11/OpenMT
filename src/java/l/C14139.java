package l;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: Y55F */
/* renamed from: l.ܰ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14139 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f42653;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f42655;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42656;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public CharSequence f42657;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f42658;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f42659;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42660;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Menu f42661;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f42662;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f42664;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f42665;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f42666;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f42667;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7790 f42668;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public CharSequence f42669;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public CharSequence f42670;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f42671;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f42672;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public char f42673;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f42674;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42675;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f42676;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f42677;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public CharSequence f42678;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public char f42679;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f42680;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f42681;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42682;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC17151 f42683;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ColorStateList f42654 = null;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public PorterDuff.Mode f42663 = null;

    public C14139(C7790 c7790, Menu menu) {
        this.f42668 = c7790;
        this.f42661 = menu;
        m33756();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m33756() {
        this.f42676 = 0;
        this.f42655 = 0;
        this.f42675 = 0;
        this.f42667 = 0;
        this.f42671 = true;
        this.f42674 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33752(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = this.f42668.f24083.obtainStyledAttributes(attributeSet, C3390.f10701);
        this.f42676 = obtainStyledAttributes.getResourceId(1, 0);
        this.f42655 = obtainStyledAttributes.getInt(3, 0);
        this.f42675 = obtainStyledAttributes.getInt(4, 0);
        this.f42667 = obtainStyledAttributes.getInt(5, 0);
        this.f42671 = obtainStyledAttributes.getBoolean(2, true);
        this.f42674 = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m33754(AttributeSet attributeSet) {
        C7790 c7790 = this.f42668;
        C22733 m50795 = C22733.m50795(c7790.f24083, attributeSet, C3390.f10695);
        this.f42672 = m50795.m50806(2, 0);
        this.f42656 = (m50795.m50809(5, this.f42655) & (-65536)) | (m50795.m50809(6, this.f42675) & 65535);
        this.f42657 = m50795.m50817(7);
        this.f42670 = m50795.m50817(8);
        this.f42660 = m50795.m50806(0, 0);
        String m50807 = m50795.m50807(9);
        this.f42673 = m50807 == null ? (char) 0 : m50807.charAt(0);
        this.f42664 = m50795.m50809(16, 4096);
        String m508072 = m50795.m50807(10);
        this.f42679 = m508072 == null ? (char) 0 : m508072.charAt(0);
        this.f42682 = m50795.m50809(20, 4096);
        if (m50795.m50802(11)) {
            this.f42658 = m50795.m50801(11, false) ? 1 : 0;
        } else {
            this.f42658 = this.f42667;
        }
        this.f42677 = m50795.m50801(3, false);
        this.f42666 = m50795.m50801(4, this.f42671);
        this.f42653 = m50795.m50801(1, this.f42674);
        this.f42659 = m50795.m50809(21, -1);
        this.f42681 = m50795.m50807(12);
        this.f42680 = m50795.m50806(13, 0);
        this.f42662 = m50795.m50807(15);
        String m508073 = m50795.m50807(14);
        if (m508073 != null && this.f42680 == 0 && this.f42662 == null) {
            this.f42683 = (AbstractC17151) m33749(m508073, C7790.f24080, c7790.f24081);
        } else {
            this.f42683 = null;
        }
        this.f42678 = m50795.m50817(17);
        this.f42669 = m50795.m50817(22);
        if (m50795.m50802(19)) {
            this.f42663 = C15320.m36346(m50795.m50809(19, -1), this.f42663);
        } else {
            this.f42663 = null;
        }
        if (m50795.m50802(18)) {
            this.f42654 = m50795.m50804(18);
        } else {
            this.f42654 = null;
        }
        m50795.m50813();
        this.f42665 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m33750(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f42677).setVisible(this.f42666).setEnabled(this.f42653).setCheckable(this.f42658 >= 1).setTitleCondensed(this.f42670).setIcon(this.f42660);
        int i = this.f42659;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        String str = this.f42681;
        C7790 c7790 = this.f42668;
        if (str != null) {
            if (c7790.f24083.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            menuItem.setOnMenuItemClickListener(new MenuItemOnMenuItemClickListenerC23312(c7790.m20820(), this.f42681));
        }
        if (this.f42658 >= 2) {
            if (menuItem instanceof C5882) {
                ((C5882) menuItem).m16460(true);
            } else if (menuItem instanceof MenuItemC2063) {
                ((MenuItemC2063) menuItem).m6747();
            }
        }
        String str2 = this.f42662;
        if (str2 != null) {
            menuItem.setActionView((View) m33749(str2, C7790.f24079, c7790.f24082));
            z = true;
        }
        int i2 = this.f42680;
        if (i2 > 0 && !z) {
            menuItem.setActionView(i2);
        }
        AbstractC17151 abstractC17151 = this.f42683;
        if (abstractC17151 != null && (menuItem instanceof InterfaceMenuItemC13827)) {
            ((InterfaceMenuItemC13827) menuItem).mo16448(abstractC17151);
        }
        C5862.m16422(menuItem, this.f42678);
        C5862.m16424(menuItem, this.f42669);
        C5862.m16419(menuItem, this.f42673, this.f42664);
        C5862.m16423(menuItem, this.f42679, this.f42682);
        PorterDuff.Mode mode = this.f42663;
        if (mode != null) {
            C5862.m16421(menuItem, mode);
        }
        ColorStateList colorStateList = this.f42654;
        if (colorStateList != null) {
            C5862.m16420(menuItem, colorStateList);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33751() {
        this.f42665 = true;
        m33750(this.f42661.add(this.f42676, this.f42672, this.f42656, this.f42657));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final SubMenu m33753() {
        this.f42665 = true;
        SubMenu addSubMenu = this.f42661.addSubMenu(this.f42676, this.f42672, this.f42656, this.f42657);
        m33750(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m33755() {
        return this.f42665;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m33749(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f42668.f24083.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception unused) {
            return null;
        }
    }
}
