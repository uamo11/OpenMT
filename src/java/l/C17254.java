package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: P55W */
/* renamed from: l.ܿۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17254 extends AbstractC8705 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f52887;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C10905 f52888;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f52889;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f52890;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f52891;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f52892;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f52893;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f52894;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f52895;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f52896;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C7707 f52897;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public Drawable f52898;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C1732 f52899;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public RunnableC23229 f52900;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C6296 f52901;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C11941 f52902;

    public C17254(Context context) {
        super(context);
        this.f52893 = new SparseBooleanArray();
        this.f52888 = new C10905(this);
    }

    @Override // l.AbstractC8705, l.InterfaceC14762
    public final void initForMenu(Context context, C3060 c3060) {
        super.initForMenu(context, c3060);
        Resources resources = context.getResources();
        C20491 m46951 = C20491.m46951(context);
        if (!this.f52890) {
            this.f52891 = true;
        }
        this.f52896 = m46951.m46953();
        this.f52887 = m46951.m46955();
        int i = this.f52896;
        if (this.f52891) {
            if (this.f52897 == null) {
                C7707 c7707 = new C7707(this, this.f26500);
                this.f52897 = c7707;
                if (this.f52895) {
                    c7707.setImageDrawable(this.f52898);
                    this.f52898 = null;
                    this.f52895 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f52897.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f52897.getMeasuredWidth();
        } else {
            this.f52897 = null;
        }
        this.f52894 = i;
        float f = resources.getDisplayMetrics().density;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m40551() {
        this.f52887 = C20491.m46951(this.f26505).m46955();
        C3060 c3060 = this.f26497;
        if (c3060 != null) {
            c3060.onItemsChanged(true);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m40553() {
        this.f52891 = true;
        this.f52890 = true;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40549() {
        this.f52889 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40545(Drawable drawable) {
        C7707 c7707 = this.f52897;
        if (c7707 != null) {
            c7707.setImageDrawable(drawable);
        } else {
            this.f52895 = true;
            this.f52898 = drawable;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable m40548() {
        C7707 c7707 = this.f52897;
        if (c7707 != null) {
            return c7707.getDrawable();
        }
        if (this.f52895) {
            return this.f52898;
        }
        return null;
    }

    @Override // l.AbstractC8705
    /* renamed from: ֫ */
    public final InterfaceC7002 mo22488(ViewGroup viewGroup) {
        InterfaceC7002 interfaceC7002 = this.f26501;
        InterfaceC7002 mo22488 = super.mo22488(viewGroup);
        if (interfaceC7002 != mo22488) {
            ((C8788) mo22488).m22672(this);
        }
        return mo22488;
    }

    @Override // l.AbstractC8705
    /* renamed from: ֫ */
    public final View mo22487(C5882 c5882, View view, ViewGroup viewGroup) {
        View actionView = c5882.getActionView();
        if (actionView == null || c5882.m16467()) {
            actionView = super.mo22487(c5882, view, viewGroup);
        }
        actionView.setVisibility(c5882.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((C8788) viewGroup).getClass();
        if (!(layoutParams instanceof C6671)) {
            actionView.setLayoutParams(C8788.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // l.AbstractC8705
    /* renamed from: ֫ */
    public final void mo22491(C5882 c5882, InterfaceC23935 interfaceC23935) {
        interfaceC23935.initialize(c5882, 0);
        ViewOnClickListenerC9411 viewOnClickListenerC9411 = (ViewOnClickListenerC9411) interfaceC23935;
        viewOnClickListenerC9411.m24252((C8788) this.f26501);
        if (this.f52902 == null) {
            this.f52902 = new C11941(this);
        }
        viewOnClickListenerC9411.m24253(this.f52902);
    }

    @Override // l.AbstractC8705
    /* renamed from: ֫ */
    public final boolean mo22493(C5882 c5882) {
        return c5882.m16466();
    }

    @Override // l.AbstractC8705, l.InterfaceC14762
    public final void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f26501).requestLayout();
        C3060 c3060 = this.f26497;
        boolean z2 = false;
        if (c3060 != null) {
            ArrayList actionItems = c3060.getActionItems();
            int size = actionItems.size();
            for (int i = 0; i < size; i++) {
                ((C5882) actionItems.get(i)).getClass();
            }
        }
        C3060 c30602 = this.f26497;
        ArrayList nonActionItems = c30602 != null ? c30602.getNonActionItems() : null;
        if (this.f52891 && nonActionItems != null) {
            int size2 = nonActionItems.size();
            if (size2 == 1) {
                z2 = !((C5882) nonActionItems.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f52897 == null) {
                this.f52897 = new C7707(this, this.f26500);
            }
            ViewGroup viewGroup = (ViewGroup) this.f52897.getParent();
            if (viewGroup != this.f26501) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f52897);
                }
                C8788 c8788 = (C8788) this.f26501;
                C7707 c7707 = this.f52897;
                c8788.getClass();
                C6671 generateDefaultLayoutParams = C8788.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f20730 = true;
                c8788.addView(c7707, generateDefaultLayoutParams);
            }
        } else {
            C7707 c77072 = this.f52897;
            if (c77072 != null) {
                Object parent = c77072.getParent();
                Object obj = this.f26501;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f52897);
                }
            }
        }
        ((C8788) this.f26501).m22674(this.f52891);
    }

    @Override // l.AbstractC8705
    /* renamed from: ֫ */
    public final boolean mo22492(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f52897) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC8705, l.InterfaceC14762
    public final boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        boolean z = false;
        if (subMenuC19703.hasVisibleItems()) {
            SubMenuC19703 subMenuC197032 = subMenuC19703;
            while (subMenuC197032.getParentMenu() != this.f26497) {
                subMenuC197032 = (SubMenuC19703) subMenuC197032.getParentMenu();
            }
            MenuItem item = subMenuC197032.getItem();
            ViewGroup viewGroup = (ViewGroup) this.f26501;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof InterfaceC23935) && ((InterfaceC23935) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.f52892 = subMenuC19703.getItem().getItemId();
                int size = subMenuC19703.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    MenuItem item2 = subMenuC19703.getItem(i2);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                C6296 c6296 = new C6296(this, this.f26505, subMenuC19703, view);
                this.f52901 = c6296;
                c6296.m42634(z);
                if (!this.f52901.m42640()) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                super.onSubMenuSelected(subMenuC19703);
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m40547() {
        C3060 c3060;
        if (!this.f52891 || m40552() || (c3060 = this.f26497) == null || this.f26501 == null || this.f52900 != null || c3060.getNonActionItems().isEmpty()) {
            return false;
        }
        RunnableC23229 runnableC23229 = new RunnableC23229(this, new C1732(this, this.f26505, this.f26497, this.f52897));
        this.f52900 = runnableC23229;
        ((View) this.f26501).post(runnableC23229);
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m40550() {
        Object obj;
        RunnableC23229 runnableC23229 = this.f52900;
        if (runnableC23229 != null && (obj = this.f26501) != null) {
            ((View) obj).removeCallbacks(runnableC23229);
            this.f52900 = null;
            return true;
        }
        C1732 c1732 = this.f52899;
        if (c1732 == null) {
            return false;
        }
        c1732.m42629();
        return true;
    }

    @Override // l.AbstractC8705, l.InterfaceC14762
    public final void onCloseMenu(C3060 c3060, boolean z) {
        m40550();
        C6296 c6296 = this.f52901;
        if (c6296 != null) {
            c6296.m42629();
        }
        super.onCloseMenu(c3060, z);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m40552() {
        C1732 c1732 = this.f52899;
        return c1732 != null && c1732.m42639();
    }

    @Override // l.InterfaceC14762
    public final boolean flagActionItems() {
        int i;
        ArrayList arrayList;
        boolean z;
        C3060 c3060 = this.f26497;
        View view = null;
        if (c3060 != null) {
            arrayList = c3060.getVisibleItems();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i2 = this.f52887;
        int i3 = this.f52894;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f26501;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            C5882 c5882 = (C5882) arrayList.get(i4);
            if (c5882.mo16457()) {
                i5++;
            } else if (c5882.m16454()) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.f52889 && c5882.isActionViewExpanded()) {
                i2 = 0;
            }
            i4++;
        }
        if (this.f52891 && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.f52893;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            C5882 c58822 = (C5882) arrayList.get(i8);
            if (c58822.mo16457()) {
                View mo22487 = mo22487(c58822, view, viewGroup);
                mo22487.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = mo22487.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int groupId = c58822.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                c58822.m16465(z);
            } else if (c58822.m16454()) {
                int groupId2 = c58822.getGroupId();
                boolean z3 = sparseBooleanArray.get(groupId2);
                boolean z4 = (i7 > 0 || z3) && i3 > 0;
                if (z4) {
                    View mo224872 = mo22487(c58822, view, viewGroup);
                    mo224872.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = mo224872.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z4 &= i3 + i9 > 0;
                }
                if (z4 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z3) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i10 = 0; i10 < i8; i10++) {
                        C5882 c58823 = (C5882) arrayList.get(i10);
                        if (c58823.getGroupId() == groupId2) {
                            if (c58823.m16466()) {
                                i7++;
                            }
                            c58823.m16465(false);
                        }
                    }
                }
                if (z4) {
                    i7--;
                }
                c58822.m16465(z4);
            } else {
                c58822.m16465(false);
            }
            i8++;
            view = null;
            z = true;
        }
        return true;
    }

    @Override // l.InterfaceC14762
    public final Parcelable onSaveInstanceState() {
        C17960 c17960 = new C17960();
        c17960.f55990 = this.f52892;
        return c17960;
    }

    @Override // l.InterfaceC14762
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof C17960) && (i = ((C17960) parcelable).f55990) > 0 && (findItem = this.f26497.findItem(i)) != null) {
            onSubMenuSelected((SubMenuC19703) findItem.getSubMenu());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40546(C8788 c8788) {
        this.f26501 = c8788;
        c8788.initialize(this.f26497);
    }
}
