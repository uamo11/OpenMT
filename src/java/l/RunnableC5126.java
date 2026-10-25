package l;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: R5DS */
/* renamed from: l.ۚۙۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class RunnableC5126 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f16049 = new ThreadLocal();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static Comparator f16050 = new C18532();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f16053;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f16054;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f16052 = new ArrayList();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f16051 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14677(C13132 c13132, int i, int i2) {
        if (c13132.isAttachedToWindow()) {
            if (C13132.sDebugAssertionsEnabled && !this.f16052.contains(c13132)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f16054 == 0) {
                this.f16054 = c13132.getNanoTime();
                c13132.post(this);
            }
        }
        C19238 c19238 = c13132.mPrefetchRegistry;
        c19238.f60553 = i;
        c19238.f60554 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14676(long j) {
        C0186 c0186;
        C13132 c13132;
        C13132 c131322;
        C0186 c01862;
        ArrayList arrayList = this.f16052;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C13132 c131323 = (C13132) arrayList.get(i2);
            if (c131323.getWindowVisibility() == 0) {
                c131323.mPrefetchRegistry.m44374(c131323, false);
                i += c131323.mPrefetchRegistry.f60551;
            }
        }
        ArrayList arrayList2 = this.f16051;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C13132 c131324 = (C13132) arrayList.get(i4);
            if (c131324.getWindowVisibility() == 0) {
                C19238 c19238 = c131324.mPrefetchRegistry;
                int abs = Math.abs(c19238.f60554) + Math.abs(c19238.f60553);
                for (int i5 = 0; i5 < c19238.f60551 * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c01862 = new C0186();
                        arrayList2.add(c01862);
                    } else {
                        c01862 = (C0186) arrayList2.get(i3);
                    }
                    int[] iArr = c19238.f60552;
                    int i6 = iArr[i5 + 1];
                    c01862.f1412 = i6 <= abs;
                    c01862.f1414 = abs;
                    c01862.f1411 = i6;
                    c01862.f1415 = c131324;
                    c01862.f1413 = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f16050);
        for (int i7 = 0; i7 < arrayList2.size() && (c13132 = (c0186 = (C0186) arrayList2.get(i7)).f1415) != null; i7++) {
            AbstractC3255 m14675 = m14675(c13132, c0186.f1413, c0186.f1412 ? C13132.FOREVER_NS : j);
            if (m14675 != null && m14675.mNestedRecyclerView != null && m14675.isBound() && !m14675.isInvalid() && (c131322 = (C13132) m14675.mNestedRecyclerView.get()) != null) {
                if (c131322.mDataSetHasChangedAfterLayout && c131322.mChildHelper.m50474() != 0) {
                    c131322.removeAndRecycleViews();
                }
                C19238 c192382 = c131322.mPrefetchRegistry;
                c192382.m44374(c131322, true);
                if (c192382.f60551 != 0) {
                    try {
                        int i8 = C5342.f16662;
                        Trace.beginSection(C13132.TRACE_NESTED_PREFETCH_TAG);
                        C21600 c21600 = c131322.mState;
                        AbstractC19902 abstractC19902 = c131322.mAdapter;
                        c21600.f69352 = 1;
                        c21600.f69362 = abstractC19902.getItemCount();
                        c21600.f69359 = false;
                        c21600.f69351 = false;
                        c21600.f69356 = false;
                        for (int i9 = 0; i9 < c192382.f60551 * 2; i9 += 2) {
                            m14675(c131322, c192382.f60552[i9], j);
                        }
                        Trace.endSection();
                        c0186.f1412 = false;
                        c0186.f1414 = 0;
                        c0186.f1411 = 0;
                        c0186.f1415 = null;
                        c0186.f1413 = 0;
                    } catch (Throwable th) {
                        int i10 = C5342.f16662;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0186.f1412 = false;
            c0186.f1414 = 0;
            c0186.f1411 = 0;
            c0186.f1415 = null;
            c0186.f1413 = 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3255 m14675(C13132 c13132, int i, long j) {
        int m50474 = c13132.mChildHelper.m50474();
        for (int i2 = 0; i2 < m50474; i2++) {
            AbstractC3255 m31833 = C13132.m31833(c13132.mChildHelper.m50477(i2));
            if (m31833.mPosition == i && !m31833.isInvalid()) {
                return null;
            }
        }
        C2550 c2550 = c13132.mRecycler;
        try {
            c13132.onEnterLayoutOrScroll();
            AbstractC3255 m8068 = c2550.m8068(i, j);
            if (m8068 != null) {
                if (m8068.isBound() && !m8068.isInvalid()) {
                    c2550.m8070(m8068.itemView);
                } else {
                    c2550.m8072(m8068, false);
                }
            }
            return m8068;
        } finally {
            c13132.onExitLayoutOrScroll(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f16052;
        try {
            int i = C5342.f16662;
            Trace.beginSection(C13132.TRACE_PREFETCH_TAG);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C13132 c13132 = (C13132) arrayList.get(i2);
                    if (c13132.getWindowVisibility() == 0) {
                        j = Math.max(c13132.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m14676(TimeUnit.MILLISECONDS.toNanos(j) + this.f16053);
                }
            }
            this.f16054 = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f16054 = 0L;
            int i3 = C5342.f16662;
            Trace.endSection();
            throw th;
        }
    }
}
