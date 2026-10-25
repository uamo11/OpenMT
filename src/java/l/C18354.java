package l;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: 95QI */
/* renamed from: l.ᩳ᩺, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18354 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f57032 = new ArrayList();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f57033 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f57036 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SparseArray f57034 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f57035 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42777(View view, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = this.f57036;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f57032;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f57036 == null) {
                        this.f57036 = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f57032;
                        View view2 = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view2 == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f57036.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f57036.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m42774 = m42774(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m42774 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (this.f57034 == null) {
                    this.f57034 = new SparseArray();
                }
                this.f57034.put(keyCode, new WeakReference(m42774));
            }
        }
        return m42774 != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private View m42774(View view, KeyEvent keyEvent) {
        View m42774;
        WeakHashMap weakHashMap = this.f57036;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                    m42774 = m42774(viewGroup.getChildAt(childCount), keyEvent);
                }
            } while (m42774 == null);
            return m42774;
        }
        if (m42775(view, keyEvent)) {
            return view;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42776(KeyEvent keyEvent) {
        WeakReference weakReference;
        int indexOfKey;
        WeakReference weakReference2 = this.f57035;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        this.f57035 = new WeakReference(keyEvent);
        if (this.f57034 == null) {
            this.f57034 = new SparseArray();
        }
        SparseArray sparseArray = this.f57034;
        if (keyEvent.getAction() != 1 || (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view = (View) weakReference.get();
        if (view != null && view.isAttachedToWindow()) {
            m42775(view, keyEvent);
        }
        return true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m42775(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.MT_Protector_res_0x7f0a05b5);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((InterfaceC16942) arrayList.get(size)).m39776()) {
                return true;
            }
        }
        return false;
    }
}
