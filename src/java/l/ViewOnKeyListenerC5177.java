package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: E50U */
/* renamed from: l.ۚۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class ViewOnKeyListenerC5177 extends AbstractC11236 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean f16183;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f16184;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Context f16186;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f16187;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public PopupWindow.OnDismissListener f16189;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public ViewTreeObserver f16190;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final Handler f16191;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f16192;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16194;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f16197;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f16198;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f16199;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final int f16200;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC17585 f16202;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public View f16204;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public View f16205;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f16207;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f16193 = new ArrayList();

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f16188 = new ArrayList();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewTreeObserver.OnGlobalLayoutListener f16195 = new ViewTreeObserverOnGlobalLayoutListenerC2355(this);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View.OnAttachStateChangeListener f16203 = new ViewOnAttachStateChangeListenerC3766(this);

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC2231 f16206 = new C19289(this);

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f16201 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f16185 = 0;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f16196 = false;

    @Override // l.InterfaceC14762
    public final boolean flagActionItems() {
        return false;
    }

    @Override // l.InterfaceC14762
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // l.InterfaceC14762
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    public ViewOnKeyListenerC5177(Context context, View view, int i, boolean z) {
        this.f16186 = context;
        this.f16205 = view;
        this.f16200 = i;
        this.f16183 = z;
        this.f16194 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f16197 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.MT_Protector_res_0x7f070017));
        this.f16191 = new Handler();
    }

    @Override // l.AbstractC11236
    /* renamed from: ֫ */
    public final void mo8536(boolean z) {
        this.f16196 = z;
    }

    @Override // l.InterfaceC9825
    public final void show() {
        if (isShowing()) {
            return;
        }
        ArrayList arrayList = this.f16193;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m14831((C3060) it.next());
        }
        arrayList.clear();
        View view = this.f16205;
        this.f16204 = view;
        if (view != null) {
            boolean z = this.f16190 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f16190 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f16195);
            }
            this.f16204.addOnAttachStateChangeListener(this.f16203);
        }
    }

    @Override // l.InterfaceC9825
    public final void dismiss() {
        ArrayList arrayList = this.f16188;
        int size = arrayList.size();
        if (size <= 0) {
            return;
        }
        C0237[] c0237Arr = (C0237[]) arrayList.toArray(new C0237[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C0237 c0237 = c0237Arr[size];
            if (c0237.f1510.isShowing()) {
                c0237.f1510.dismiss();
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.AbstractC11236
    /* renamed from: ֫ */
    public final void mo8535(C3060 c3060) {
        c3060.addMenuPresenter(this, this.f16186);
        if (isShowing()) {
            m14831(c3060);
        } else {
            this.f16193.add(c3060);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0132, code lost:
    
        if (((r9.getWidth() + r12[r7]) + r5) > r13.right) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x013a, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0138, code lost:
    
        if ((r12[r7] - r5) < 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a3  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m14831(l.C3060 r17) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnKeyListenerC5177.m14831(l.ۗۜ):void");
    }

    @Override // l.InterfaceC9825
    public final boolean isShowing() {
        ArrayList arrayList = this.f16188;
        return arrayList.size() > 0 && ((C0237) arrayList.get(0)).f1510.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C0237 c0237;
        ArrayList arrayList = this.f16188;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0237 = null;
                break;
            }
            c0237 = (C0237) arrayList.get(i);
            if (!c0237.f1510.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c0237 != null) {
            c0237.f1508.close(false);
        }
    }

    @Override // l.InterfaceC14762
    public final void updateMenuView(boolean z) {
        Iterator it = this.f16188.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0237) it.next()).f1510.mo8540().getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C22110) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.InterfaceC14762
    public final void setCallback(InterfaceC17585 interfaceC17585) {
        this.f16202 = interfaceC17585;
    }

    @Override // l.InterfaceC14762
    public final boolean onSubMenuSelected(SubMenuC19703 subMenuC19703) {
        Iterator it = this.f16188.iterator();
        while (it.hasNext()) {
            C0237 c0237 = (C0237) it.next();
            if (subMenuC19703 == c0237.f1508) {
                c0237.f1510.mo8540().requestFocus();
                return true;
            }
        }
        if (!subMenuC19703.hasVisibleItems()) {
            return false;
        }
        mo8535(subMenuC19703);
        InterfaceC17585 interfaceC17585 = this.f16202;
        if (interfaceC17585 != null) {
            interfaceC17585.mo2048(subMenuC19703);
        }
        return true;
    }

    @Override // l.InterfaceC14762
    public final void onCloseMenu(C3060 c3060, boolean z) {
        ArrayList arrayList = this.f16188;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (c3060 == ((C0237) arrayList.get(i)).f1508) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C0237) arrayList.get(i2)).f1508.close(false);
        }
        C0237 c0237 = (C0237) arrayList.remove(i);
        C3060 c30602 = c0237.f1508;
        C0113 c0113 = c0237.f1510;
        c30602.removeMenuPresenter(this);
        if (this.f16198) {
            c0113.m1117();
            c0113.m23838();
        }
        c0113.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f16194 = ((C0237) arrayList.get(size2 - 1)).f1509;
        } else {
            this.f16194 = this.f16205.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C0237) arrayList.get(0)).f1508.close(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC17585 interfaceC17585 = this.f16202;
        if (interfaceC17585 != null) {
            interfaceC17585.onCloseMenu(c3060, true);
        }
        ViewTreeObserver viewTreeObserver = this.f16190;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f16190.removeGlobalOnLayoutListener(this.f16195);
            }
            this.f16190 = null;
        }
        this.f16204.removeOnAttachStateChangeListener(this.f16203);
        this.f16189.onDismiss();
    }

    @Override // l.AbstractC11236
    /* renamed from: ֫ */
    public final void mo8532(int i) {
        if (this.f16201 != i) {
            this.f16201 = i;
            this.f16185 = Gravity.getAbsoluteGravity(i, this.f16205.getLayoutDirection());
        }
    }

    @Override // l.AbstractC11236
    /* renamed from: ֫ */
    public final void mo8533(View view) {
        if (this.f16205 != view) {
            this.f16205 = view;
            this.f16185 = Gravity.getAbsoluteGravity(this.f16201, view.getLayoutDirection());
        }
    }

    @Override // l.AbstractC11236
    /* renamed from: ֫ */
    public final void mo8534(PopupWindow.OnDismissListener onDismissListener) {
        this.f16189 = onDismissListener;
    }

    @Override // l.InterfaceC9825
    /* renamed from: ᩳ */
    public final ListView mo8540() {
        ArrayList arrayList = this.f16188;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C0237) C18566.m43105(arrayList, 1)).f1510.mo8540();
    }

    @Override // l.AbstractC11236
    /* renamed from: ۧ */
    public final void mo8537(int i) {
        this.f16192 = true;
        this.f16199 = i;
    }

    @Override // l.AbstractC11236
    /* renamed from: ܽ */
    public final void mo8539(int i) {
        this.f16187 = true;
        this.f16184 = i;
    }

    @Override // l.AbstractC11236
    /* renamed from: ۧ */
    public final void mo8538(boolean z) {
        this.f16207 = z;
    }
}
