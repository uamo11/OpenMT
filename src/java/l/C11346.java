package l;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: 21WX */
/* renamed from: l.ۨ֡ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11346 extends AbstractC23192 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f33951;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public HashMap f33963;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C21224[] f33964;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f33965;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static ThreadLocal f33947 = new ThreadLocal();

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33950 = new C19813();

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33948 = new C4290();

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33949 = new C2879();

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33946 = new C12756();

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f33943 = new C12051();

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final AccelerateDecelerateInterpolator f33944 = new AccelerateDecelerateInterpolator();

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static long f33945 = 10;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f33961 = -1;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f33959 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f33966 = 0;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f33957 = false;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f33956 = 0;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f33967 = false;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f33952 = false;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f33953 = 300;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f33955 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f33954 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f33958 = 1;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Interpolator f33960 = f33944;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f33962 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo28073(float... fArr) {
        if (fArr.length == 0) {
            return;
        }
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr == null || c21224Arr.length == 0) {
            int i = C21224.f68404;
            C14872 c14872 = new C14872("");
            c14872.mo35307(fArr);
            m28074(c14872);
        } else {
            c21224Arr[0].mo35307(fArr);
        }
        this.f33952 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28074(C21224... c21224Arr) {
        int length = c21224Arr.length;
        this.f33964 = c21224Arr;
        this.f33963 = new HashMap(length);
        for (C21224 c21224 : c21224Arr) {
            this.f33963.put(c21224.f68410, c21224);
        }
        this.f33952 = false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo28081() {
        if (this.f33952) {
            return;
        }
        int length = this.f33964.length;
        for (int i = 0; i < length; i++) {
            this.f33964[i].m48183();
        }
        this.f33952 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11346 mo28076(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "Animators cannot have negative duration: "));
        }
        this.f33953 = j;
        return this;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28079(long j) {
        this.f33955 = j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m28078() {
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr == null || c21224Arr.length <= 0) {
            return null;
        }
        return c21224Arr[0].mo35303();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m28080() {
        this.f33954 = -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28071(InterfaceC5701 interfaceC5701) {
        if (this.f33962 == null) {
            this.f33962 = new ArrayList();
        }
        this.f33962.add(interfaceC5701);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28070(Interpolator interpolator) {
        this.f33960 = interpolator;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28072(C23779 c23779) {
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr == null || c21224Arr.length <= 0) {
            return;
        }
        c21224Arr[0].m48181(c23779);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m28077() {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        int i = 0;
        this.f33959 = false;
        this.f33966 = 0;
        this.f33956 = 0;
        this.f33957 = false;
        ((ArrayList) f33948.get()).add(this);
        long j = 0;
        if (this.f33955 == 0) {
            if (this.f33952 && this.f33956 != 0) {
                j = AnimationUtils.currentAnimationTimeMillis() - this.f33951;
            }
            mo28081();
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.f33956 != 1) {
                this.f33961 = j;
                this.f33956 = 2;
            }
            this.f33951 = currentAnimationTimeMillis - j;
            m28075(currentAnimationTimeMillis);
            this.f33956 = 0;
            this.f33967 = true;
            ArrayList arrayList = this.f74556;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC11904) arrayList2.get(i2)).mo29030();
                }
            }
        }
        ThreadLocal threadLocal = f33947;
        HandlerC9935 handlerC9935 = (HandlerC9935) threadLocal.get();
        if (handlerC9935 == null) {
            handlerC9935 = new HandlerC9935(i);
            threadLocal.set(handlerC9935);
        }
        handlerC9935.sendEmptyMessage(0);
    }

    public final void cancel() {
        ArrayList arrayList;
        if (this.f33956 != 0 || ((ArrayList) f33948.get()).contains(this) || ((ArrayList) f33949.get()).contains(this)) {
            if (this.f33967 && (arrayList = this.f74556) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((InterfaceC11904) it.next()).getClass();
                }
            }
            m28058();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28068() {
        if (!((ArrayList) f33950.get()).contains(this) && !((ArrayList) f33948.get()).contains(this)) {
            this.f33957 = false;
            m28066();
        } else if (!this.f33952) {
            mo28081();
        }
        int i = this.f33954;
        if (i > 0 && (i & 1) == 1) {
            mo28069(0.0f);
        } else {
            mo28069(1.0f);
        }
        m28058();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public void m28058() {
        ArrayList arrayList;
        ((ArrayList) f33950.get()).remove(this);
        ((ArrayList) f33948.get()).remove(this);
        ((ArrayList) f33949.get()).remove(this);
        this.f33956 = 0;
        if (this.f33967 && (arrayList = this.f74556) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC11904) arrayList2.get(i)).onAnimationEnd();
            }
        }
        this.f33967 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public void m28066() {
        ArrayList arrayList;
        mo28081();
        ((ArrayList) f33950.get()).add(this);
        if (this.f33955 <= 0 || (arrayList = this.f74556) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC11904) arrayList2.get(i)).mo29030();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28056(C11346 c11346, long j) {
        if (!c11346.f33957) {
            c11346.f33957 = true;
            c11346.f33965 = j;
            return false;
        }
        long j2 = j - c11346.f33965;
        long j3 = c11346.f33955;
        if (j2 <= j3) {
            return false;
        }
        c11346.f33951 = j - (j2 - j3);
        c11346.f33956 = 1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m28075(long r9) {
        /*
            r8 = this;
            int r0 = r8.f33956
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r8.f33956 = r3
            long r4 = r8.f33961
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r8.f33951 = r9
            goto L1a
        L12:
            long r4 = r9 - r4
            r8.f33951 = r4
            r4 = -1
            r8.f33961 = r4
        L1a:
            int r0 = r8.f33956
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L23
            if (r0 == r4) goto L23
            return r5
        L23:
            long r5 = r8.f33953
            r0 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L32
            long r1 = r8.f33951
            long r9 = r9 - r1
            float r9 = (float) r9
            float r10 = (float) r5
            float r9 = r9 / r10
            goto L34
        L32:
            r9 = 1065353216(0x3f800000, float:1.0)
        L34:
            int r10 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r10 < 0) goto L77
            int r10 = r8.f33966
            int r1 = r8.f33954
            if (r10 < r1) goto L47
            r10 = -1
            if (r1 != r10) goto L42
            goto L47
        L42:
            float r9 = java.lang.Math.min(r9, r0)
            goto L78
        L47:
            java.util.ArrayList r10 = r8.f74556
            if (r10 == 0) goto L60
            int r10 = r10.size()
            r1 = 0
        L50:
            if (r1 >= r10) goto L60
            java.util.ArrayList r2 = r8.f74556
            java.lang.Object r2 = r2.get(r1)
            l.ۨ᩵ۘ r2 = (l.InterfaceC11904) r2
            r2.getClass()
            int r1 = r1 + 1
            goto L50
        L60:
            int r10 = r8.f33958
            if (r10 != r4) goto L69
            boolean r10 = r8.f33959
            r10 = r10 ^ r3
            r8.f33959 = r10
        L69:
            int r10 = r8.f33966
            int r1 = (int) r9
            int r10 = r10 + r1
            r8.f33966 = r10
            float r9 = r9 % r0
            long r1 = r8.f33951
            long r3 = r8.f33953
            long r1 = r1 + r3
            r8.f33951 = r1
        L77:
            r3 = 0
        L78:
            boolean r10 = r8.f33959
            if (r10 == 0) goto L7e
            float r9 = r0 - r9
        L7e:
            r8.mo28069(r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11346.m28075(long):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo28069(float f) {
        float interpolation = this.f33960.getInterpolation(f);
        int length = this.f33964.length;
        for (int i = 0; i < length; i++) {
            this.f33964[i].mo35304(interpolation);
        }
        ArrayList arrayList = this.f33962;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC5701) this.f33962.get(i2)).mo16110(this);
            }
        }
    }

    @Override // l.AbstractC23192
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public C11346 mo28082clone() {
        C11346 c11346 = (C11346) super.mo28082clone();
        ArrayList arrayList = this.f33962;
        if (arrayList != null) {
            c11346.f33962 = new ArrayList();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                c11346.f33962.add((InterfaceC5701) arrayList.get(i));
            }
        }
        c11346.f33961 = -1L;
        c11346.f33959 = false;
        c11346.f33966 = 0;
        c11346.f33952 = false;
        c11346.f33956 = 0;
        c11346.f33957 = false;
        C21224[] c21224Arr = this.f33964;
        if (c21224Arr != null) {
            int length = c21224Arr.length;
            c11346.f33964 = new C21224[length];
            c11346.f33963 = new HashMap(length);
            for (int i2 = 0; i2 < length; i2++) {
                C21224 clone = c21224Arr[i2].clone();
                c11346.f33964[i2] = clone;
                c11346.f33963.put(clone.f68410, clone);
            }
        }
        return c11346;
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f33964 != null) {
            for (int i = 0; i < this.f33964.length; i++) {
                StringBuilder m19190 = C7166.m19190(str, "\n    ");
                m19190.append(this.f33964[i].toString());
                str = m19190.toString();
            }
        }
        return str;
    }
}
