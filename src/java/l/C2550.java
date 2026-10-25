package l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Y6A7 */
/* renamed from: l.ۖ۬ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2550 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f8075;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13132 f8076;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f8077;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f8078;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f8079;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f8080;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15954 f8081;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f8082;

    public C2550(C13132 c13132) {
        this.f8076 = c13132;
        ArrayList arrayList = new ArrayList();
        this.f8075 = arrayList;
        this.f8079 = null;
        this.f8077 = new ArrayList();
        this.f8078 = C20195.unmodifiableList(arrayList);
        this.f8080 = 2;
        this.f8082 = 2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8074(AbstractC19902 abstractC19902, AbstractC19902 abstractC199022, boolean z) {
        this.f8075.clear();
        m8082();
        m8065(abstractC19902, true);
        C15954 m8069 = m8069();
        if (abstractC19902 != null) {
            m8069.f49246--;
        }
        if (!z && m8069.f49246 == 0) {
            SparseArray sparseArray = m8069.f49248;
            for (int i = 0; i < sparseArray.size(); i++) {
                C8900 c8900 = (C8900) sparseArray.valueAt(i);
                Iterator it = c8900.f27068.iterator();
                while (it.hasNext()) {
                    C9975.m25138(((AbstractC3255) it.next()).itemView);
                }
                c8900.f27068.clear();
            }
        }
        if (abstractC199022 != null) {
            m8069.f49246++;
        } else {
            m8069.getClass();
        }
        m8066();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8084(int i) {
        this.f8080 = i;
        m8079();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m8079() {
        AbstractC17366 abstractC17366 = this.f8076.mLayout;
        this.f8082 = this.f8080 + (abstractC17366 != null ? abstractC17366.mPrefetchMaxCountObserved : 0);
        ArrayList arrayList = this.f8077;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.f8082) {
                return;
            } else {
                m8081(size);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m8076() {
        return this.f8078;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8067(int i) {
        C13132 c13132 = this.f8076;
        if (i >= 0 && i < c13132.mState.m48777()) {
            return !c13132.mState.f69359 ? i : c13132.mAdapterHelper.m4701(i, 0);
        }
        StringBuilder m32308 = C13325.m32308(i, "invalid position ", ". State item count is ");
        m32308.append(c13132.mState.m48777());
        m32308.append(c13132.exceptionLabel());
        throw new IndexOutOfBoundsException(m32308.toString());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m8075(int i) {
        return m8068(i, C13132.FOREVER_NS).itemView;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0375  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.AbstractC3255 m8068(int r22, long r23) {
        /*
            Method dump skipped, instructions count: 1239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2550.m8068(int, long):l.ۗ۬ۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8064(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                m8064((ViewGroup) childAt, true);
            }
        }
        if (z) {
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            } else {
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8070(View view) {
        AbstractC3255 m31833 = C13132.m31833(view);
        boolean isTmpDetached = m31833.isTmpDetached();
        C13132 c13132 = this.f8076;
        if (isTmpDetached) {
            c13132.removeDetachedView(view, false);
        }
        if (m31833.isScrap()) {
            m31833.unScrap();
        } else if (m31833.wasReturnedFromScrap()) {
            m31833.clearReturnedFromScrapFlag();
        }
        m8071(m31833);
        if (c13132.mItemAnimator == null || m31833.isRecyclable()) {
            return;
        }
        c13132.mItemAnimator.mo20596(m31833);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m8082() {
        ArrayList arrayList = this.f8077;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                m8081(size);
            }
        }
        arrayList.clear();
        if (C13132.ALLOW_THREAD_GAP_WORK) {
            C19238 c19238 = this.f8076.mPrefetchRegistry;
            int[] iArr = c19238.f60552;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c19238.f60551 = 0;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8081(int i) {
        int i2 = C13132.HORIZONTAL;
        ArrayList arrayList = this.f8077;
        AbstractC3255 abstractC3255 = (AbstractC3255) arrayList.get(i);
        if (C13132.sVerboseLoggingEnabled) {
            C11003.toString(abstractC3255);
        }
        m8072(abstractC3255, true);
        arrayList.remove(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8071(AbstractC3255 abstractC3255) {
        boolean isScrap = abstractC3255.isScrap();
        boolean z = true;
        C13132 c13132 = this.f8076;
        if (isScrap || abstractC3255.itemView.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC3255.isScrap());
            sb.append(" isAttached:");
            sb.append(abstractC3255.itemView.getParent() != null);
            sb.append(c13132.exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC3255.isTmpDetached()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + abstractC3255 + c13132.exceptionLabel());
        }
        if (abstractC3255.shouldIgnore()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + c13132.exceptionLabel());
        }
        boolean doesTransientStatePreventRecycling = abstractC3255.doesTransientStatePreventRecycling();
        AbstractC19902 abstractC19902 = c13132.mAdapter;
        boolean z2 = abstractC19902 != null && doesTransientStatePreventRecycling && abstractC19902.onFailedToRecycleView(abstractC3255);
        boolean z3 = C13132.sDebugAssertionsEnabled;
        ArrayList arrayList = this.f8077;
        if (z3 && arrayList.contains(abstractC3255)) {
            throw new IllegalArgumentException("cached view received recycle internal? " + abstractC3255 + c13132.exceptionLabel());
        }
        if (z2 || abstractC3255.isRecyclable()) {
            if (this.f8082 <= 0 || abstractC3255.hasAnyOfTheFlags(526)) {
                r1 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f8082 && size > 0) {
                    m8081(0);
                    size--;
                }
                if (C13132.ALLOW_THREAD_GAP_WORK && size > 0) {
                    C19238 c19238 = c13132.mPrefetchRegistry;
                    int i = abstractC3255.mPosition;
                    if (c19238.f60552 != null) {
                        int i2 = c19238.f60551 * 2;
                        for (int i3 = 0; i3 < i2; i3 += 2) {
                            if (c19238.f60552[i3] == i) {
                                break;
                            }
                        }
                    }
                    loop1: while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        int i4 = ((AbstractC3255) arrayList.get(size)).mPosition;
                        C19238 c192382 = c13132.mPrefetchRegistry;
                        if (c192382.f60552 == null) {
                            break;
                        }
                        int i5 = c192382.f60551 * 2;
                        for (int i6 = 0; i6 < i5; i6 += 2) {
                            if (c192382.f60552[i6] == i4) {
                                break;
                            }
                        }
                        break loop1;
                    }
                    size++;
                }
                arrayList.add(size, abstractC3255);
                r1 = true;
            }
            if (!r1) {
                m8072(abstractC3255, true);
                c13132.mViewInfoStore.m44867(abstractC3255);
                if (r1 && !z && doesTransientStatePreventRecycling) {
                    C9975.m25138(abstractC3255.itemView);
                    abstractC3255.mBindingAdapter = null;
                    abstractC3255.mOwnerRecyclerView = null;
                    return;
                }
                return;
            }
        } else if (C13132.sVerboseLoggingEnabled) {
            c13132.exceptionLabel();
        }
        z = false;
        c13132.mViewInfoStore.m44867(abstractC3255);
        if (r1) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8072(AbstractC3255 abstractC3255, boolean z) {
        C13132.m31835(abstractC3255);
        View view = abstractC3255.itemView;
        C13132 c13132 = this.f8076;
        C10311 c10311 = c13132.mAccessibilityDelegate;
        if (c10311 != null) {
            C16445 itemDelegate = c10311.getItemDelegate();
            C17648.m41309(view, itemDelegate instanceof C12427 ? ((C12427) itemDelegate).m30593(view) : null);
        }
        if (z) {
            InterfaceC3961 interfaceC3961 = c13132.mRecyclerListener;
            if (interfaceC3961 != null) {
                interfaceC3961.m12001();
            }
            int size = c13132.mRecyclerListeners.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC3961) c13132.mRecyclerListeners.get(i)).m12001();
            }
            AbstractC19902 abstractC19902 = c13132.mAdapter;
            if (abstractC19902 != null) {
                abstractC19902.onViewRecycled(abstractC3255);
            }
            if (c13132.mState != null) {
                c13132.mViewInfoStore.m44867(abstractC3255);
            }
            if (C13132.sVerboseLoggingEnabled) {
                C11003.toString(abstractC3255);
            }
        }
        abstractC3255.mBindingAdapter = null;
        abstractC3255.mOwnerRecyclerView = null;
        m8069().m37726(abstractC3255);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8077(View view) {
        AbstractC3255 m31833 = C13132.m31833(view);
        boolean hasAnyOfTheFlags = m31833.hasAnyOfTheFlags(12);
        C13132 c13132 = this.f8076;
        if (hasAnyOfTheFlags || !m31833.isUpdated() || c13132.canReuseUpdatedViewHolder(m31833)) {
            if (m31833.isInvalid() && !m31833.isRemoved() && !c13132.mAdapter.hasStableIds()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + c13132.exceptionLabel());
            }
            m31833.setScrapContainer(this, false);
            this.f8075.add(m31833);
            return;
        }
        if (this.f8079 == null) {
            this.f8079 = new ArrayList();
        }
        m31833.setScrapContainer(this, true);
        this.f8079.add(m31833);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m8078(AbstractC3255 abstractC3255) {
        if (abstractC3255.mInChangeScrap) {
            this.f8079.remove(abstractC3255);
        } else {
            this.f8075.remove(abstractC3255);
        }
        abstractC3255.mScrapContainer = null;
        abstractC3255.mInChangeScrap = false;
        abstractC3255.clearReturnedFromScrapFlag();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8073(C15954 c15954) {
        C13132 c13132 = this.f8076;
        m8065(c13132.mAdapter, false);
        if (this.f8081 != null) {
            r1.f49246--;
        }
        this.f8081 = c15954;
        if (c15954 != null && c13132.getAdapter() != null) {
            this.f8081.f49246++;
        }
        m8066();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m8066() {
        if (this.f8081 != null) {
            C13132 c13132 = this.f8076;
            if (c13132.mAdapter == null || !c13132.isAttachedToWindow()) {
                return;
            }
            C15954 c15954 = this.f8081;
            c15954.f49247.add(c13132.mAdapter);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m8065(AbstractC19902 abstractC19902, boolean z) {
        C15954 c15954 = this.f8081;
        if (c15954 != null) {
            SparseArray sparseArray = c15954.f49248;
            Set set = c15954.f49247;
            set.remove(abstractC19902);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C8900) sparseArray.get(sparseArray.keyAt(i))).f27068;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    C9975.m25138(((AbstractC3255) arrayList.get(i2)).itemView);
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m8080() {
        m8066();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m8083() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f8077;
            if (i >= arrayList.size()) {
                m8065(this.f8076.mAdapter, false);
                return;
            } else {
                C9975.m25138(((AbstractC3255) arrayList.get(i)).itemView);
                i++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15954 m8069() {
        if (this.f8081 == null) {
            C15954 c15954 = new C15954();
            c15954.f49248 = new SparseArray();
            c15954.f49246 = 0;
            c15954.f49247 = Collections.newSetFromMap(new IdentityHashMap());
            this.f8081 = c15954;
            m8066();
        }
        return this.f8081;
    }
}
