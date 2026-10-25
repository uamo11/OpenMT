package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: P5AI */
/* renamed from: l.ܰۛ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13622 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f40627;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ViewParent f40628;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ViewParent f40629;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f40630;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f40631;

    public C13622(ViewGroup viewGroup) {
        this.f40630 = viewGroup;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32745(boolean z) {
        if (this.f40627) {
            int i = C17648.f53953;
            C13082.m31708(this.f40630);
        }
        this.f40627 = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m32742(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m32743;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f40627 && (m32743 = m32743(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f40630;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f40631 == null) {
                        this.f40631 = new int[2];
                    }
                    int[] iArr4 = this.f40631;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (m32743 instanceof InterfaceC1794) {
                    ((InterfaceC1794) m32743).onNestedScroll(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (m32743 instanceof InterfaceC7273) {
                        ((InterfaceC7273) m32743).onNestedScroll(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            C5654.m15944(m32743, viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError unused) {
                            C11003.toString(m32743);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32746() {
        return this.f40627;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32747(float f, float f2) {
        ViewParent m32743;
        if (this.f40627 && (m32743 = m32743(0)) != null) {
            try {
                return C5654.m15947(m32743, this.f40630, f, f2);
            } catch (AbstractMethodError unused) {
                C11003.toString(m32743);
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32748(float f, float f2, boolean z) {
        ViewParent m32743;
        if (this.f40627 && (m32743 = m32743(0)) != null) {
            try {
                return C5654.m15948(m32743, this.f40630, f, f2, z);
            } catch (AbstractMethodError unused) {
                C11003.toString(m32743);
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32753(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m32743;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f40627 || (m32743 = m32743(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f40630;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f40631 == null) {
                this.f40631 = new int[2];
            }
            iArr3 = this.f40631;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (m32743 instanceof InterfaceC7273) {
            ((InterfaceC7273) m32743).onNestedPreScroll(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                C5654.m15945(m32743, viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                C11003.toString(m32743);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32749(int i) {
        return m32743(i) != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32750(int i, int i2) {
        boolean m15949;
        if (!m32749(i2)) {
            if (this.f40627) {
                ViewGroup viewGroup = this.f40630;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC7273;
                    if (z) {
                        m15949 = ((InterfaceC7273) parent).onStartNestedScroll(view, viewGroup, i, i2);
                    } else {
                        if (i2 == 0) {
                            try {
                                m15949 = C5654.m15949(parent, view, viewGroup, i);
                            } catch (AbstractMethodError unused) {
                                C11003.toString(parent);
                            }
                        }
                        m15949 = false;
                    }
                    if (m15949) {
                        if (i2 == 0) {
                            this.f40629 = parent;
                        } else if (i2 == 1) {
                            this.f40628 = parent;
                        }
                        if (z) {
                            ((InterfaceC7273) parent).onNestedScrollAccepted(view, viewGroup, i, i2);
                        } else if (i2 == 0) {
                            try {
                                C5654.m15946(parent, view, viewGroup, i);
                            } catch (AbstractMethodError unused2) {
                                C11003.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32754(int i) {
        ViewParent m32743 = m32743(i);
        if (m32743 != null) {
            boolean z = m32743 instanceof InterfaceC7273;
            ViewGroup viewGroup = this.f40630;
            if (z) {
                ((InterfaceC7273) m32743).onStopNestedScroll(viewGroup, i);
            } else if (i == 0) {
                try {
                    C5654.m15943(m32743, viewGroup);
                } catch (AbstractMethodError unused) {
                    C11003.toString(m32743);
                }
            }
            if (i == 0) {
                this.f40629 = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f40628 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32751(int i, int i2, int i3, int i4, int[] iArr) {
        return m32742(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m32752(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m32742(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32744(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m32742(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private ViewParent m32743(int i) {
        if (i == 0) {
            return this.f40629;
        }
        if (i != 1) {
            return null;
        }
        return this.f40628;
    }
}
