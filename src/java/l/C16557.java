package l;

import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: V7F9 */
/* renamed from: l.ܽۢۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16557 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC19902 f50868;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1556 f50869;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9762 f50870;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f50871;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f50872;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f50873;

    public C16557(C9762 c9762, int... iArr) {
        this.f50870 = c9762;
        this.f50871 = iArr;
        c9762.getMenu().findItem(R.id.MT_Protector_res_0x7f0a016c).setIcon(R.drawable.MT_Protector_res_0x7f0801c9);
        m38947(false, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38952(AbstractC19902 abstractC19902) {
        this.f50868 = abstractC19902;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38950(C1556 c1556) {
        this.f50869 = c1556;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38954() {
        return this.f50873;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m38955() {
        m38947(this.f50873, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38948() {
        if (this.f50873) {
            return;
        }
        this.f50873 = true;
        this.f50872 = SystemClock.uptimeMillis();
        AbstractC19902 abstractC19902 = this.f50868;
        if (abstractC19902 != null) {
            abstractC19902.notifyDataSetChanged();
        }
        m38947(true, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38953(boolean z) {
        if (this.f50873) {
            this.f50873 = false;
            this.f50872 = SystemClock.uptimeMillis();
            AbstractC19902 abstractC19902 = this.f50868;
            if (abstractC19902 != null) {
                abstractC19902.notifyDataSetChanged();
            }
            m38947(false, z);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38949(ImageView imageView, boolean z) {
        imageView.animate().cancel();
        if (!z) {
            imageView.setVisibility(8);
            imageView.setAlpha(1.0f);
            return;
        }
        if (SystemClock.uptimeMillis() - this.f50872 >= 100) {
            imageView.setVisibility(this.f50873 ? 0 : 8);
            imageView.setAlpha(1.0f);
        } else if (this.f50873) {
            imageView.setVisibility(0);
            imageView.setAlpha(0.0f);
            imageView.animate().alpha(1.0f).setDuration(200L);
        } else {
            imageView.setVisibility(0);
            imageView.animate().alpha(0.0f).setDuration(200L).withEndAction(new RunnableC6312(6, imageView));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38951(AbstractC3255 abstractC3255) {
        C1556 c1556;
        if (!this.f50873 || (c1556 = this.f50869) == null) {
            return;
        }
        c1556.m5326(abstractC3255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38947(boolean z, boolean z2) {
        C9762 c9762 = this.f50870;
        Menu menu = c9762.getMenu();
        MenuItem findItem = menu.findItem(R.id.MT_Protector_res_0x7f0a016c);
        if (findItem == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : this.f50871) {
            MenuItem findItem2 = menu.findItem(i);
            if (findItem2 != null) {
                arrayList.add(findItem2);
            }
        }
        if (z2) {
            final MenuItem[] menuItemArr = z ? (MenuItem[]) arrayList.toArray(new MenuItem[0]) : new MenuItem[]{findItem};
            final RunnableC10882 runnableC10882 = new RunnableC10882(3, this, z ? new MenuItem[]{findItem} : (MenuItem[]) arrayList.toArray(new MenuItem[0]));
            ArrayList arrayList2 = new ArrayList();
            for (MenuItem menuItem : menuItemArr) {
                if (menuItem.isVisible()) {
                    View findViewById = c9762.findViewById(menuItem.getItemId());
                    if (findViewById != null) {
                        arrayList2.add(findViewById);
                    } else {
                        menuItem.setVisible(false);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                for (MenuItem menuItem2 : menuItemArr) {
                    menuItem2.setVisible(false);
                }
                runnableC10882.run();
                return;
            }
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                View view = (View) arrayList2.get(i2);
                boolean z3 = i2 == arrayList2.size() - 1;
                view.animate().cancel();
                ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(100L);
                if (z3) {
                    duration.withEndAction(new Runnable() { // from class: l.ۧۢۡ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C16557.m38946(C16557.this, menuItemArr, runnableC10882);
                        }
                    });
                }
                i2++;
            }
            return;
        }
        View findViewById2 = c9762.findViewById(findItem.getItemId());
        if (findViewById2 != null) {
            findViewById2.animate().cancel();
            findViewById2.setAlpha(1.0f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MenuItem menuItem3 = (MenuItem) it.next();
            View findViewById3 = c9762.findViewById(menuItem3.getItemId());
            if (findViewById3 != null) {
                findViewById3.animate().cancel();
                findViewById3.setAlpha(1.0f);
            }
            menuItem3.setVisible(!z);
        }
        findItem.setVisible(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m38946(C16557 c16557, MenuItem[] menuItemArr, RunnableC10882 runnableC10882) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(false);
            View findViewById = c16557.f50870.findViewById(menuItem.getItemId());
            if (findViewById != null) {
                findViewById.setAlpha(1.0f);
            }
        }
        runnableC10882.run();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38945(C16557 c16557, MenuItem[] menuItemArr) {
        for (MenuItem menuItem : menuItemArr) {
            menuItem.setVisible(true);
            View findViewById = c16557.f50870.findViewById(menuItem.getItemId());
            if (findViewById != null) {
                findViewById.animate().cancel();
                findViewById.setAlpha(0.0f);
                findViewById.animate().alpha(1.0f).setDuration(100L);
            }
        }
    }
}
