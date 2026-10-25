package l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: 152K */
/* renamed from: l.᩹᩶ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22514 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7906 f72857;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f72859;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f72860 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21809 f72856 = new C21809();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f72858 = new ArrayList();

    public C22514(C7906 c7906) {
        this.f72857 = c7906;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m50466(View view) {
        this.f72858.add(view);
        AbstractC3255 m31833 = C13132.m31833(view);
        if (m31833 != null) {
            m31833.onEnteredHiddenState(this.f72857.f24490);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m50468(View view) {
        AbstractC3255 m31833;
        if (!this.f72858.remove(view) || (m31833 = C13132.m31833(view)) == null) {
            return;
        }
        m31833.onLeftHiddenState(this.f72857.f24490);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50473(View view, int i, boolean z) {
        int m50467;
        C13132 c13132 = this.f72857.f24490;
        if (i >= 0) {
            m50467 = m50467(i);
        } else {
            m50467 = c13132.getChildCount();
        }
        this.f72856.m49161(m50467, z);
        if (z) {
            m50466(view);
        }
        c13132.addView(view, m50467);
        c13132.dispatchChildAttached(view);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m50467(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f72857.f24490.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C21809 c21809 = this.f72856;
            int m49162 = i - (i2 - c21809.m49162(i2));
            if (m49162 == 0) {
                while (c21809.m49163(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m49162;
        }
        return -1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m50478(View view) {
        C7906 c7906 = this.f72857;
        int i = this.f72860;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            this.f72860 = 1;
            this.f72859 = view;
            int indexOfChild = c7906.f24490.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (this.f72856.m49165(indexOfChild)) {
                    m50468(view);
                }
                c7906.m21196(indexOfChild);
            }
        } finally {
            this.f72860 = 0;
            this.f72859 = null;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m50480(int i) {
        C7906 c7906 = this.f72857;
        int i2 = this.f72860;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int m50467 = m50467(i);
            View childAt = c7906.f24490.getChildAt(m50467);
            if (childAt != null) {
                this.f72860 = 1;
                this.f72859 = childAt;
                if (this.f72856.m49165(m50467)) {
                    m50468(childAt);
                }
                c7906.m21196(m50467);
            }
        } finally {
            this.f72860 = 0;
            this.f72859 = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View m50476(int i) {
        return this.f72857.f24490.getChildAt(m50467(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50472(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m50467;
        C13132 c13132 = this.f72857.f24490;
        if (i >= 0) {
            m50467 = m50467(i);
        } else {
            m50467 = c13132.getChildCount();
        }
        this.f72856.m49161(m50467, z);
        if (z) {
            m50466(view);
        }
        AbstractC3255 m31833 = C13132.m31833(view);
        if (m31833 != null) {
            if (!m31833.isTmpDetached() && !m31833.shouldIgnore()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + m31833 + c13132.exceptionLabel());
            }
            if (C13132.sVerboseLoggingEnabled) {
                m31833.toString();
            }
            m31833.clearTmpDetachFlag();
        } else if (C13132.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No ViewHolder found for child: " + view + ", index: " + m50467 + c13132.exceptionLabel());
        }
        c13132.attachViewToParent(view, m50467, layoutParams);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50469() {
        return this.f72857.f24490.getChildCount() - this.f72858.size();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50474() {
        return this.f72857.f24490.getChildCount();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final View m50477(int i) {
        return this.f72857.f24490.getChildAt(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50470(int i) {
        int m50467 = m50467(i);
        this.f72856.m49165(m50467);
        C13132 c13132 = this.f72857.f24490;
        View childAt = c13132.getChildAt(m50467);
        if (childAt != null) {
            AbstractC3255 m31833 = C13132.m31833(childAt);
            if (m31833 != null) {
                if (m31833.isTmpDetached() && !m31833.shouldIgnore()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + m31833 + c13132.exceptionLabel());
                }
                if (C13132.sVerboseLoggingEnabled) {
                    m31833.toString();
                }
                m31833.addFlags(256);
            }
        } else if (C13132.sDebugAssertionsEnabled) {
            throw new IllegalArgumentException("No view at offset " + m50467 + c13132.exceptionLabel());
        }
        c13132.detachViewFromParent(m50467);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50475(View view) {
        int indexOfChild = this.f72857.f24490.indexOfChild(view);
        if (indexOfChild != -1) {
            C21809 c21809 = this.f72856;
            if (!c21809.m49163(indexOfChild)) {
                return indexOfChild - c21809.m49162(indexOfChild);
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50471(View view) {
        int indexOfChild = this.f72857.f24490.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        this.f72856.m49164(indexOfChild);
        m50466(view);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m50479(View view) {
        int indexOfChild = this.f72857.f24490.indexOfChild(view);
        if (indexOfChild < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        C21809 c21809 = this.f72856;
        if (!c21809.m49163(indexOfChild)) {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        c21809.m49160(indexOfChild);
        m50468(view);
    }

    public final String toString() {
        return this.f72856.toString() + ", hidden list:" + this.f72858.size();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m50481(View view) {
        C21809 c21809 = this.f72856;
        C7906 c7906 = this.f72857;
        int i = this.f72860;
        if (i == 1) {
            if (this.f72859 == view) {
                return false;
            }
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeView(At) for a different view");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeViewIfHidden within removeViewIfHidden");
        }
        try {
            this.f72860 = 2;
            int indexOfChild = c7906.f24490.indexOfChild(view);
            if (indexOfChild == -1) {
                m50468(view);
                return true;
            }
            if (!c21809.m49163(indexOfChild)) {
                return false;
            }
            c21809.m49165(indexOfChild);
            m50468(view);
            c7906.m21196(indexOfChild);
            return true;
        } finally {
            this.f72860 = 0;
        }
    }
}
