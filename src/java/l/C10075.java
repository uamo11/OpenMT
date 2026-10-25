package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: L1CU */
/* renamed from: l.ۤۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C10075 extends C17606 implements InterfaceC1794 {

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean f30305;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public C22069 f30306;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public ArrayList f30307;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f30308;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public float f30309;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public int f30310;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f30311;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public float f30312;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f30313;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f30314;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public float f30315;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f30316;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f30317;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public C3019 f30318;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public float f30319;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f30320;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f30321;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public float f30322;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public ArrayList f30323;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f30324;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f30325;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f30326;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public int f30327;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f30328;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f30329;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f30330;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public C18396 f30331;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C21364 f30332;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public int f30333;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15012 f30334;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public long f30335;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f30336;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f30337;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C14867 f30338;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public float f30339;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public float f30340;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public float f30341;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f30342;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public float f30343;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public boolean f30344;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f30345;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public Interpolator f30346;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public long f30347;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f30348;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f30349;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public RectF f30350;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public float f30351;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f30352;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public int f30353;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f30354;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public View f30355;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30356;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C7252 f30357;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public HashMap f30358;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f30359;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public long f30360;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public EnumC12191 f30361;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // l.InterfaceC7273
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // l.InterfaceC7273
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
    }

    public C10075(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30341 = 0.0f;
        this.f30356 = -1;
        this.f30314 = -1;
        this.f30326 = -1;
        this.f30310 = 0;
        this.f30352 = 0;
        this.f30342 = true;
        this.f30358 = new HashMap();
        this.f30354 = 0L;
        this.f30322 = 1.0f;
        this.f30339 = 0.0f;
        this.f30343 = 0.0f;
        this.f30309 = 0.0f;
        this.f30328 = false;
        this.f30311 = 0;
        this.f30359 = false;
        this.f30331 = new C18396();
        this.f30334 = new C15012(this);
        this.f30320 = false;
        this.f30344 = false;
        this.f30323 = null;
        this.f30307 = null;
        this.f30345 = null;
        this.f30336 = 0;
        this.f30360 = -1L;
        this.f30319 = 0.0f;
        this.f30348 = 0;
        this.f30313 = 0.0f;
        this.f30349 = false;
        this.f30338 = new C14867();
        this.f30308 = false;
        this.f30361 = EnumC12191.UNDEFINED;
        this.f30306 = new C22069(this);
        this.f30316 = false;
        this.f30350 = new RectF();
        this.f30355 = null;
        this.f30337 = new ArrayList();
        m25287(attributeSet);
    }

    public C10075(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30341 = 0.0f;
        this.f30356 = -1;
        this.f30314 = -1;
        this.f30326 = -1;
        this.f30310 = 0;
        this.f30352 = 0;
        this.f30342 = true;
        this.f30358 = new HashMap();
        this.f30354 = 0L;
        this.f30322 = 1.0f;
        this.f30339 = 0.0f;
        this.f30343 = 0.0f;
        this.f30309 = 0.0f;
        this.f30328 = false;
        this.f30311 = 0;
        this.f30359 = false;
        this.f30331 = new C18396();
        this.f30334 = new C15012(this);
        this.f30320 = false;
        this.f30344 = false;
        this.f30323 = null;
        this.f30307 = null;
        this.f30345 = null;
        this.f30336 = 0;
        this.f30360 = -1L;
        this.f30319 = 0.0f;
        this.f30348 = 0;
        this.f30313 = 0.0f;
        this.f30349 = false;
        this.f30338 = new C14867();
        this.f30308 = false;
        this.f30361 = EnumC12191.UNDEFINED;
        this.f30306 = new C22069(this);
        this.f30316 = false;
        this.f30350 = new RectF();
        this.f30355 = null;
        this.f30337 = new ArrayList();
        m25287(attributeSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25317(EnumC12191 enumC12191) {
        EnumC12191 enumC121912 = EnumC12191.FINISHED;
        if (enumC12191 == enumC121912 && this.f30314 == -1) {
            return;
        }
        EnumC12191 enumC121913 = this.f30361;
        this.f30361 = enumC12191;
        EnumC12191 enumC121914 = EnumC12191.MOVING;
        if (enumC121913 == enumC121914 && enumC12191 == enumC121914) {
            m25297();
        }
        int i = C7958.f24599[enumC121913.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3 && enumC12191 == enumC121912) {
                m25309();
                return;
            }
            return;
        }
        if (enumC12191 == enumC121914) {
            m25297();
        }
        if (enumC12191 == enumC121912) {
            m25309();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25318(C13601 c13601) {
        this.f30357.m19414(c13601);
        m25317(EnumC12191.SETUP);
        int i = this.f30314;
        C13601 c136012 = this.f30357.f22265;
        if (i == (c136012 == null ? -1 : c136012.f40564)) {
            this.f30343 = 1.0f;
            this.f30339 = 1.0f;
            this.f30309 = 1.0f;
        } else {
            this.f30343 = 0.0f;
            this.f30339 = 0.0f;
            this.f30309 = 0.0f;
        }
        this.f30347 = c13601.m32698() ? -1L : System.nanoTime();
        int m19421 = this.f30357.m19421();
        C13601 c136013 = this.f30357.f22265;
        int i2 = c136013 != null ? c136013.f40564 : -1;
        if (m19421 == this.f30356 && i2 == this.f30326) {
            return;
        }
        this.f30356 = m19421;
        this.f30326 = i2;
        this.f30357.m19410(m19421, i2);
        C4201 m19409 = this.f30357.m19409(this.f30356);
        C4201 m194092 = this.f30357.m19409(this.f30326);
        C22069 c22069 = this.f30306;
        c22069.m49649(m19409, m194092);
        int i3 = this.f30356;
        int i4 = this.f30326;
        c22069.f70717 = i3;
        c22069.f70716 = i4;
        c22069.m49650();
        c22069.m49650();
        invalidate();
    }

    @Override // l.C17606
    public final void loadLayoutDescription(int i) {
        C22069 c22069 = this.f30306;
        if (i != 0) {
            try {
                this.f30357 = new C7252(getContext(), this, i);
                if (super.isAttachedToWindow()) {
                    this.f30357.m19412(this);
                    c22069.m49649(this.f30357.m19409(this.f30356), this.f30357.m19409(this.f30326));
                    c22069.m49650();
                    invalidate();
                    this.f30357.m19416(isRtl());
                    return;
                }
                return;
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        }
        this.f30357 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25313(int i) {
        C4906 c4906;
        float f;
        int m14278;
        if (!super.isAttachedToWindow()) {
            if (this.f30318 == null) {
                this.f30318 = new C3019(this);
            }
            this.f30318.f9545 = i;
            return;
        }
        C7252 c7252 = this.f30357;
        if (c7252 != null && (c4906 = c7252.f22267) != null && (m14278 = c4906.m14278(-1, f, this.f30314, i)) != -1) {
            i = m14278;
        }
        int i2 = this.f30314;
        if (i2 == i) {
            return;
        }
        if (this.f30356 == i) {
            m25310(0.0f);
            return;
        }
        if (this.f30326 == i) {
            m25310(1.0f);
            return;
        }
        this.f30326 = i;
        if (i2 != -1) {
            m25315(i2, i);
            m25310(1.0f);
            this.f30343 = 0.0f;
            m25310(1.0f);
            return;
        }
        this.f30359 = false;
        this.f30309 = 1.0f;
        this.f30339 = 0.0f;
        this.f30343 = 0.0f;
        this.f30347 = System.nanoTime();
        this.f30354 = System.nanoTime();
        this.f30329 = false;
        this.f30346 = null;
        this.f30322 = this.f30357.m19417() / 1000.0f;
        this.f30356 = -1;
        this.f30357.m19410(-1, this.f30326);
        this.f30357.m19421();
        int childCount = getChildCount();
        HashMap hashMap = this.f30358;
        hashMap.clear();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            hashMap.put(childAt, new C19248(childAt));
        }
        this.f30328 = true;
        C4201 m19409 = this.f30357.m19409(i);
        C22069 c22069 = this.f30306;
        c22069.m49649((C4201) null, m19409);
        c22069.m49650();
        invalidate();
        c22069.m49648();
        int childCount2 = getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = getChildAt(i4);
            C19248 c19248 = (C19248) hashMap.get(childAt2);
            if (c19248 != null) {
                c19248.m44406(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i5 = 0; i5 < childCount; i5++) {
            C19248 c192482 = (C19248) hashMap.get(getChildAt(i5));
            this.f30357.m19415(c192482);
            c192482.m44404(width, height, System.nanoTime());
        }
        C13601 c13601 = this.f30357.f22265;
        float f2 = c13601 != null ? c13601.f40571 : 0.0f;
        if (f2 != 0.0f) {
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            for (int i6 = 0; i6 < childCount; i6++) {
                C19248 c192483 = (C19248) hashMap.get(getChildAt(i6));
                float m44414 = c192483.m44414() + c192483.m44411();
                f3 = Math.min(f3, m44414);
                f4 = Math.max(f4, m44414);
            }
            for (int i7 = 0; i7 < childCount; i7++) {
                C19248 c192484 = (C19248) hashMap.get(getChildAt(i7));
                float m44411 = c192484.m44411();
                float m444142 = c192484.m44414();
                c192484.f60593 = 1.0f / (1.0f - f2);
                c192484.f60585 = f2 - ((((m44411 + m444142) - f3) * f2) / (f4 - f3));
            }
        }
        this.f30339 = 0.0f;
        this.f30343 = 0.0f;
        this.f30328 = true;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25315(int i, int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.f30318 == null) {
                this.f30318 = new C3019(this);
            }
            C3019 c3019 = this.f30318;
            c3019.f9547 = i;
            c3019.f9545 = i2;
            return;
        }
        C7252 c7252 = this.f30357;
        if (c7252 != null) {
            this.f30356 = i;
            this.f30326 = i2;
            c7252.m19410(i, i2);
            C4201 m19409 = this.f30357.m19409(i);
            C4201 m194092 = this.f30357.m19409(i2);
            C22069 c22069 = this.f30306;
            c22069.m49649(m19409, m194092);
            c22069.m49650();
            invalidate();
            this.f30343 = 0.0f;
            m25310(0.0f);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m25321(float f) {
        if (!super.isAttachedToWindow()) {
            if (this.f30318 == null) {
                this.f30318 = new C3019(this);
            }
            this.f30318.f9546 = f;
            return;
        }
        if (f <= 0.0f) {
            this.f30314 = this.f30356;
            if (this.f30343 == 0.0f) {
                m25317(EnumC12191.FINISHED);
            }
        } else if (f >= 1.0f) {
            this.f30314 = this.f30326;
            if (this.f30343 == 1.0f) {
                m25317(EnumC12191.FINISHED);
            }
        } else {
            this.f30314 = -1;
            m25317(EnumC12191.MOVING);
        }
        if (this.f30357 == null) {
            return;
        }
        this.f30329 = true;
        this.f30309 = f;
        this.f30339 = f;
        this.f30347 = -1L;
        this.f30354 = -1L;
        this.f30346 = null;
        this.f30328 = true;
        invalidate();
    }

    @Override // l.C17606
    public final void setState(int i, int i2, int i3) {
        m25317(EnumC12191.SETUP);
        this.f30314 = i;
        this.f30356 = -1;
        this.f30326 = -1;
        C7023 c7023 = this.mConstraintLayoutSpec;
        if (c7023 != null) {
            c7023.m18990(i2, i3, i);
            return;
        }
        C7252 c7252 = this.f30357;
        if (c7252 != null) {
            c7252.m19409(i).m12676((C17606) this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        if ((((r14 * r6) - (((r0 * r6) * r6) / 2.0f)) + r15) > 1.0f) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r6 = r12.f30343;
        r9 = r12.f30322;
        r10 = r12.f30357.m19422();
        r15 = r12.f30357;
        r0 = r15.f22265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        if (r0.f40556 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        r11 = r15.f22265.f40556.m32508();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009f, code lost:
    
        r12.f30331.m42828(r6, r13, r14, r9, r10, r11);
        r12.f30341 = 0.0f;
        r14 = r12.f30314;
        r12.f30309 = r13;
        r12.f30314 = r14;
        r12.f30346 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r11 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        r13 = r12.f30343;
        r15 = r12.f30357.m19422();
        r3.f45785 = r14;
        r3.f45784 = r13;
        r3.f45786 = r15;
        r12.f30346 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        if ((((((r0 * r2) * r2) / 2.0f) + (r14 * r2)) + r15) < 0.0f) goto L24;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m25311(float r13, float r14, int r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10075.m25311(float, float, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25310(float f) {
        if (this.f30357 == null) {
            return;
        }
        float f2 = this.f30343;
        float f3 = this.f30339;
        if (f2 != f3 && this.f30329) {
            this.f30343 = f3;
        }
        float f4 = this.f30343;
        if (f4 == f) {
            return;
        }
        this.f30359 = false;
        this.f30309 = f;
        this.f30322 = r0.m19417() / 1000.0f;
        m25321(this.f30309);
        this.f30346 = this.f30357.m19420();
        this.f30329 = false;
        this.f30354 = System.nanoTime();
        this.f30328 = true;
        this.f30339 = f4;
        this.f30343 = f4;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25316(C10362 c10362, float f, float f2, float[] fArr, int i) {
        float f3;
        float f4 = this.f30341;
        float f5 = this.f30343;
        if (this.f30346 != null) {
            float signum = Math.signum(this.f30309 - f5);
            float interpolation = this.f30346.getInterpolation(this.f30343 + 1.0E-5f);
            f3 = this.f30346.getInterpolation(this.f30343);
            f4 = (((interpolation - f3) / 1.0E-5f) * signum) / this.f30322;
        } else {
            f3 = f5;
        }
        Interpolator interpolator = this.f30346;
        if (interpolator instanceof AbstractInterpolatorC5136) {
            f4 = ((AbstractInterpolatorC5136) interpolator).mo14697();
        }
        C19248 c19248 = (C19248) this.f30358.get(c10362);
        if ((i & 1) == 0) {
            c19248.m44401(f3, c10362.getWidth(), c10362.getHeight(), f, f2, fArr);
        } else {
            c19248.m44400(f3, f, f2, fArr);
        }
        if (i < 2) {
            fArr[0] = fArr[0] * f4;
            fArr[1] = fArr[1] * f4;
        }
    }

    @Override // l.C17606, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        C7252 c7252;
        C13601 c13601;
        if (this.f30349 || this.f30314 != -1 || (c7252 = this.f30357) == null || (c13601 = c7252.f22265) == null || c13601.m32695() != 0) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return C0050.m931(context, this.f30356) + "->" + C0050.m931(context, this.f30326) + " (pos:" + this.f30343 + " Dpos/Dt:" + this.f30341;
    }

    @Override // l.C17606, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (this.f30357 == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f30310 == i && this.f30352 == i2) ? false : true;
        if (this.f30316) {
            this.f30316 = false;
            m25323();
            m25306();
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f30310 = i;
        this.f30352 = i2;
        int m19421 = this.f30357.m19421();
        C13601 c13601 = this.f30357.f22265;
        int i3 = c13601 == null ? -1 : c13601.f40564;
        C22069 c22069 = this.f30306;
        if ((!z3 && m19421 == c22069.f70717 && i3 == c22069.f70716) || this.f30356 == -1) {
            z = true;
        } else {
            super.onMeasure(i, i2);
            c22069.m49649(this.f30357.m19409(m19421), this.f30357.m19409(i3));
            c22069.m49650();
            c22069.f70717 = m19421;
            c22069.f70716 = i3;
            z = false;
        }
        if (this.f30349 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int m35753 = this.mLayoutWidget.m35753() + getPaddingRight() + getPaddingLeft();
            int m35732 = this.mLayoutWidget.m35732() + paddingBottom;
            int i4 = this.f30353;
            if (i4 == Integer.MIN_VALUE || i4 == 0) {
                m35753 = (int) ((this.f30340 * (this.f30330 - r1)) + this.f30327);
                requestLayout();
            }
            int i5 = this.f30321;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                m35732 = (int) ((this.f30340 * (this.f30317 - r2)) + this.f30333);
                requestLayout();
            }
            setMeasuredDimension(m35753, m35732);
        }
        float signum = Math.signum(this.f30309 - this.f30343);
        long nanoTime = System.nanoTime();
        Interpolator interpolator = this.f30346;
        float f = this.f30343 + (!(interpolator instanceof C18396) ? (((nanoTime - this.f30347) * signum) * 1.0E-9f) / this.f30322 : 0.0f);
        if (this.f30329) {
            f = this.f30309;
        }
        if ((signum <= 0.0f || f < this.f30309) && (signum > 0.0f || f > this.f30309)) {
            z2 = false;
        } else {
            f = this.f30309;
        }
        if (interpolator != null && !z2) {
            if (this.f30359) {
                f = interpolator.getInterpolation((nanoTime - this.f30354) * 1.0E-9f);
            } else {
                f = interpolator.getInterpolation(f);
            }
        }
        if ((signum > 0.0f && f >= this.f30309) || (signum <= 0.0f && f <= this.f30309)) {
            f = this.f30309;
        }
        this.f30340 = f;
        int childCount = getChildCount();
        long nanoTime2 = System.nanoTime();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C19248 c19248 = (C19248) this.f30358.get(childAt);
            if (c19248 != null) {
                c19248.m44410(f, nanoTime2, childAt, this.f30338);
            }
        }
        if (this.f30349) {
            requestLayout();
        }
    }

    @Override // l.InterfaceC7273
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        C13601 c13601;
        C7252 c7252 = this.f30357;
        return (c7252 == null || (c13601 = c7252.f22265) == null || c13601.m32696() == null || (this.f30357.f22265.m32696().m32499() & 2) != 0) ? false : true;
    }

    @Override // l.InterfaceC7273
    public final void onStopNestedScroll(View view, int i) {
        C7252 c7252 = this.f30357;
        if (c7252 == null) {
            return;
        }
        float f = this.f30315;
        float f2 = this.f30351;
        float f3 = f / f2;
        float f4 = this.f30312 / f2;
        C13601 c13601 = c7252.f22265;
        if (c13601 == null || c13601.f40556 == null) {
            return;
        }
        c7252.f22265.f40556.m32512(f3, f4);
    }

    @Override // l.InterfaceC1794
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.f30320 || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.f30320 = false;
    }

    @Override // l.InterfaceC7273
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        C13601 c13601;
        C13477 m32696;
        int m32510;
        C7252 c7252 = this.f30357;
        if (c7252 == null || (c13601 = c7252.f22265) == null || !c13601.m32694()) {
            return;
        }
        C13601 c136012 = this.f30357.f22265;
        if (c136012 == null || !c136012.m32694() || (m32696 = c136012.m32696()) == null || (m32510 = m32696.m32510()) == -1 || view.getId() == m32510) {
            C7252 c72522 = this.f30357;
            if (c72522 != null) {
                C13601 c136013 = c72522.f22265;
                if ((c136013 == null || c136013.f40556 == null) ? false : c72522.f22265.f40556.m32513()) {
                    float f = this.f30339;
                    if ((f == 1.0f || f == 0.0f) && view.canScrollVertically(-1)) {
                        return;
                    }
                }
            }
            if (c136012.m32696() != null && (this.f30357.f22265.m32696().m32499() & 1) != 0) {
                C7252 c72523 = this.f30357;
                float f2 = i;
                float f3 = i2;
                C13601 c136014 = c72523.f22265;
                float m32504 = (c136014 == null || c136014.f40556 == null) ? 0.0f : c72523.f22265.f40556.m32504(f2, f3);
                float f4 = this.f30343;
                if ((f4 <= 0.0f && m32504 < 0.0f) || (f4 >= 1.0f && m32504 > 0.0f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new RunnableC0902((ViewGroup) view));
                    return;
                }
            }
            float f5 = this.f30339;
            long nanoTime = System.nanoTime();
            float f6 = i;
            this.f30315 = f6;
            float f7 = i2;
            this.f30312 = f7;
            this.f30351 = (float) ((nanoTime - this.f30335) * 1.0E-9d);
            this.f30335 = nanoTime;
            C7252 c72524 = this.f30357;
            C13601 c136015 = c72524.f22265;
            if (c136015 != null && c136015.f40556 != null) {
                c72524.f22265.f40556.m32509(f6, f7);
            }
            if (f5 != this.f30339) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            m25319(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f30320 = true;
        }
    }

    @Override // l.C17606, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        m25319(false);
        super.dispatchDraw(canvas);
        if (this.f30357 == null) {
            return;
        }
        if ((this.f30311 & 1) == 1 && !isInEditMode()) {
            this.f30336++;
            long nanoTime = System.nanoTime();
            long j = this.f30360;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.f30319 = ((int) ((this.f30336 / (r5 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.f30336 = 0;
                    this.f30360 = nanoTime;
                }
            } else {
                this.f30360 = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float f = ((int) (this.f30343 * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f30319);
            sb.append(" fps ");
            int i = this.f30356;
            StringBuilder m15339 = C5368.m15339(C9045.m23341(sb, i == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i), " -> "));
            int i2 = this.f30326;
            m15339.append(i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2));
            m15339.append(" (progress: ");
            m15339.append(f);
            m15339.append(" ) state=");
            int i3 = this.f30314;
            if (i3 == -1) {
                resourceEntryName = "undefined";
            } else {
                resourceEntryName = i3 != -1 ? getContext().getResources().getResourceEntryName(i3) : "UNDEFINED";
            }
            m15339.append(resourceEntryName);
            String sb2 = m15339.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.f30311 > 1) {
            if (this.f30332 == null) {
                this.f30332 = new C21364(this);
            }
            this.f30332.m48412(canvas, this.f30358, this.f30357.m19417(), this.f30311);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25319(boolean z) {
        float f;
        boolean z2;
        int i;
        float interpolation;
        boolean z3;
        if (this.f30347 == -1) {
            this.f30347 = System.nanoTime();
        }
        float f2 = this.f30343;
        if (f2 > 0.0f && f2 < 1.0f) {
            this.f30314 = -1;
        }
        boolean z4 = false;
        if (this.f30344 || (this.f30328 && (z || this.f30309 != f2))) {
            float signum = Math.signum(this.f30309 - f2);
            long nanoTime = System.nanoTime();
            Interpolator interpolator = this.f30346;
            if (interpolator instanceof AbstractInterpolatorC5136) {
                f = 0.0f;
            } else {
                f = (((nanoTime - this.f30347) * signum) * 1.0E-9f) / this.f30322;
                this.f30341 = f;
            }
            float f3 = this.f30343 + f;
            if (this.f30329) {
                f3 = this.f30309;
            }
            if ((signum <= 0.0f || f3 < this.f30309) && (signum > 0.0f || f3 > this.f30309)) {
                z2 = false;
            } else {
                f3 = this.f30309;
                this.f30328 = false;
                z2 = true;
            }
            this.f30343 = f3;
            this.f30339 = f3;
            this.f30347 = nanoTime;
            if (interpolator != null && !z2) {
                if (this.f30359) {
                    interpolation = interpolator.getInterpolation((nanoTime - this.f30354) * 1.0E-9f);
                    this.f30343 = interpolation;
                    this.f30347 = nanoTime;
                    Interpolator interpolator2 = this.f30346;
                    if (interpolator2 instanceof AbstractInterpolatorC5136) {
                        float mo14697 = ((AbstractInterpolatorC5136) interpolator2).mo14697();
                        this.f30341 = mo14697;
                        if (Math.abs(mo14697) * this.f30322 <= 1.0E-5f) {
                            this.f30328 = false;
                        }
                        if (mo14697 > 0.0f && interpolation >= 1.0f) {
                            this.f30343 = 1.0f;
                            this.f30328 = false;
                            interpolation = 1.0f;
                        }
                        if (mo14697 < 0.0f && interpolation <= 0.0f) {
                            this.f30343 = 0.0f;
                            this.f30328 = false;
                            f3 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f3);
                    Interpolator interpolator3 = this.f30346;
                    if (interpolator3 instanceof AbstractInterpolatorC5136) {
                        this.f30341 = ((AbstractInterpolatorC5136) interpolator3).mo14697();
                    } else {
                        this.f30341 = ((interpolator3.getInterpolation(f3 + f) - interpolation) * signum) / f;
                    }
                }
                f3 = interpolation;
            }
            if (Math.abs(this.f30341) > 1.0E-5f) {
                m25317(EnumC12191.MOVING);
            }
            if ((signum > 0.0f && f3 >= this.f30309) || (signum <= 0.0f && f3 <= this.f30309)) {
                f3 = this.f30309;
                this.f30328 = false;
            }
            if (f3 >= 1.0f || f3 <= 0.0f) {
                this.f30328 = false;
                m25317(EnumC12191.FINISHED);
            }
            int childCount = getChildCount();
            this.f30344 = false;
            long nanoTime2 = System.nanoTime();
            this.f30340 = f3;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C19248 c19248 = (C19248) this.f30358.get(childAt);
                if (c19248 != null) {
                    this.f30344 = c19248.m44410(f3, nanoTime2, childAt, this.f30338) | this.f30344;
                }
            }
            boolean z5 = (signum > 0.0f && f3 >= this.f30309) || (signum <= 0.0f && f3 <= this.f30309);
            if (!this.f30344 && !this.f30328 && z5) {
                m25317(EnumC12191.FINISHED);
            }
            if (this.f30349) {
                requestLayout();
            }
            this.f30344 = (!z5) | this.f30344;
            if (f3 > 0.0f || (i = this.f30356) == -1 || this.f30314 == i) {
                z4 = false;
            } else {
                this.f30314 = i;
                this.f30357.m19409(i).m12675(this);
                m25317(EnumC12191.FINISHED);
                z4 = true;
            }
            if (f3 >= 1.0d) {
                int i3 = this.f30314;
                int i4 = this.f30326;
                if (i3 != i4) {
                    this.f30314 = i4;
                    this.f30357.m19409(i4).m12675(this);
                    m25317(EnumC12191.FINISHED);
                    z4 = true;
                }
            }
            if (this.f30344 || this.f30328) {
                invalidate();
            } else if ((signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                m25317(EnumC12191.FINISHED);
            }
            if ((!this.f30344 && this.f30328 && signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                m25323();
            }
        }
        float f4 = this.f30343;
        if (f4 >= 1.0f) {
            int i5 = this.f30314;
            int i6 = this.f30326;
            z3 = i5 == i6 ? z4 : true;
            this.f30314 = i6;
        } else {
            if (f4 <= 0.0f) {
                int i7 = this.f30314;
                int i8 = this.f30356;
                z3 = i7 == i8 ? z4 : true;
                this.f30314 = i8;
            }
            this.f30316 |= z4;
            if (z4 && !this.f30308) {
                requestLayout();
            }
            this.f30339 = this.f30343;
        }
        z4 = z3;
        this.f30316 |= z4;
        if (z4) {
            requestLayout();
        }
        this.f30339 = this.f30343;
    }

    @Override // l.C17606, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f30308 = true;
        try {
            if (this.f30357 == null) {
                super.onLayout(z, i, i2, i3, i4);
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.f30324 != i5 || this.f30325 != i6) {
                this.f30306.m49650();
                invalidate();
                m25319(true);
            }
            this.f30324 = i5;
            this.f30325 = i6;
        } finally {
            this.f30308 = false;
        }
    }

    @Override // l.C17606
    public final void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25287(AttributeSet attributeSet) {
        C7252 c7252;
        C7252 c72522;
        f30305 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69988);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 2) {
                    this.f30357 = new C7252(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.f30314 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.f30309 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.f30328 = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.f30311 == 0) {
                        this.f30311 = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.f30311 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z) {
                this.f30357 = null;
            }
        }
        if (this.f30311 != 0 && (c72522 = this.f30357) != null) {
            int m19421 = c72522.m19421();
            C7252 c72523 = this.f30357;
            C4201 m19409 = c72523.m19409(c72523.m19421());
            C0050.m931(getContext(), m19421);
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (m19409.m12668(childAt.getId()) == null) {
                    C0050.m933(childAt);
                }
            }
            int[] m12678 = m19409.m12678();
            for (int i3 = 0; i3 < m12678.length; i3++) {
                int i4 = m12678[i3];
                C0050.m931(getContext(), i4);
                findViewById(m12678[i3]);
                m19409.m12679(i4);
                m19409.m12683(i4);
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator it = this.f30357.m19408().iterator();
            while (it.hasNext()) {
                C13601 c13601 = (C13601) it.next();
                C13601 c136012 = this.f30357.f22265;
                c13601.m32691(getContext());
                int m32697 = c13601.m32697();
                int m32693 = c13601.m32693();
                C0050.m931(getContext(), m32697);
                C0050.m931(getContext(), m32693);
                sparseIntArray.get(m32697);
                sparseIntArray2.get(m32693);
                sparseIntArray.put(m32697, m32693);
                sparseIntArray2.put(m32693, m32697);
                this.f30357.m19409(m32697);
                this.f30357.m19409(m32693);
            }
        }
        if (this.f30314 != -1 || (c7252 = this.f30357) == null) {
            return;
        }
        this.f30314 = c7252.m19421();
        this.f30356 = this.f30357.m19421();
        C13601 c136013 = this.f30357.f22265;
        this.f30326 = c136013 != null ? c136013.f40564 : -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m25291(float f, float f2, View view, MotionEvent motionEvent) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m25291(view.getLeft() + f, view.getTop() + f2, viewGroup.getChildAt(i), motionEvent)) {
                    return true;
                }
            }
        }
        RectF rectF = this.f30350;
        rectF.set(view.getLeft() + f, view.getTop() + f2, f + view.getRight(), f2 + view.getBottom());
        if (motionEvent.getAction() == 0) {
            if (rectF.contains(motionEvent.getX(), motionEvent.getY()) && view.onTouchEvent(motionEvent)) {
                return true;
            }
        } else if (view.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C13601 c13601;
        C13477 m32696;
        int m32510;
        RectF m32505;
        C7252 c7252 = this.f30357;
        if (c7252 == null || !this.f30342 || (c13601 = c7252.f22265) == null || !c13601.m32694() || (m32696 = c13601.m32696()) == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && (m32505 = m32696.m32505(this, new RectF())) != null && !m32505.contains(motionEvent.getX(), motionEvent.getY())) || (m32510 = m32696.m32510()) == -1) {
            return false;
        }
        View view = this.f30355;
        if (view == null || view.getId() != m32510) {
            this.f30355 = findViewById(m32510);
        }
        View view2 = this.f30355;
        if (view2 == null) {
            return false;
        }
        float left = view2.getLeft();
        float top = this.f30355.getTop();
        float right = this.f30355.getRight();
        float bottom = this.f30355.getBottom();
        RectF rectF = this.f30350;
        rectF.set(left, top, right, bottom);
        if (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || m25291(0.0f, 0.0f, this.f30355, motionEvent)) {
            return false;
        }
        return onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7252 c7252 = this.f30357;
        if (c7252 != null && this.f30342 && c7252.m19419()) {
            C13601 c13601 = this.f30357.f22265;
            if (c13601 != null && !c13601.m32694()) {
                return super.onTouchEvent(motionEvent);
            }
            this.f30357.m19411(motionEvent, this.f30314, this);
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C13601 c13601;
        int i;
        super.onAttachedToWindow();
        C7252 c7252 = this.f30357;
        if (c7252 != null && (i = this.f30314) != -1) {
            C4201 m19409 = c7252.m19409(i);
            this.f30357.m19412(this);
            if (m19409 != null) {
                m19409.m12676((C17606) this);
            }
            this.f30356 = this.f30314;
        }
        m25323();
        C3019 c3019 = this.f30318;
        if (c3019 != null) {
            C10075 c10075 = c3019.f9548;
            int i2 = c3019.f9547;
            if (i2 != -1 || c3019.f9545 != -1) {
                if (i2 == -1) {
                    c10075.m25313(c3019.f9545);
                } else {
                    int i3 = c3019.f9545;
                    if (i3 == -1) {
                        c10075.setState(i2, -1, -1);
                    } else {
                        c10075.m25315(i2, i3);
                    }
                }
                c10075.m25317(EnumC12191.SETUP);
            }
            if (Float.isNaN(Float.NaN)) {
                if (Float.isNaN(c3019.f9546)) {
                    return;
                }
                c10075.m25321(c3019.f9546);
                return;
            }
            float f = c3019.f9546;
            if (!super.isAttachedToWindow()) {
                if (c10075.f30318 == null) {
                    c10075.f30318 = new C3019(c10075);
                }
                c10075.f30318.f9546 = f;
            } else {
                c10075.m25321(f);
                c10075.m25317(EnumC12191.MOVING);
                c10075.f30341 = Float.NaN;
                c10075.m25310(1.0f);
            }
            c3019.f9546 = Float.NaN;
            c3019.f9547 = -1;
            c3019.f9545 = -1;
            return;
        }
        C7252 c72522 = this.f30357;
        if (c72522 == null || (c13601 = c72522.f22265) == null || c13601.m32690() != 4) {
            return;
        }
        m25310(1.0f);
        m25317(EnumC12191.SETUP);
        m25317(EnumC12191.MOVING);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        C7252 c7252 = this.f30357;
        if (c7252 != null) {
            c7252.m19416(isRtl());
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m25323() {
        C7252 c7252;
        C13601 c13601;
        C7252 c72522 = this.f30357;
        if (c72522 == null) {
            return;
        }
        if (c72522.m19418(this, this.f30314)) {
            requestLayout();
            return;
        }
        int i = this.f30314;
        if (i != -1) {
            this.f30357.m19413(this, i);
        }
        if (!this.f30357.m19419() || (c13601 = (c7252 = this.f30357).f22265) == null || c13601.f40556 == null) {
            return;
        }
        c7252.f22265.f40556.m32506();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25314(int i, float f, float f2, float f3, float[] fArr) {
        View viewById = getViewById(i);
        C19248 c19248 = (C19248) this.f30358.get(viewById);
        if (c19248 != null) {
            c19248.m44400(f, f2, f3, fArr);
            viewById.getY();
        } else {
            if (viewById == null) {
                return;
            }
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25312(float f, boolean z, int i) {
        ArrayList arrayList = this.f30345;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC12896) it.next()).getClass();
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m25297() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.f30345;
        if (arrayList2 == null || arrayList2.isEmpty() || this.f30313 == this.f30339) {
            return;
        }
        if (this.f30348 != -1 && (arrayList = this.f30345) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC12896) it.next()).getClass();
            }
        }
        this.f30348 = -1;
        this.f30313 = this.f30339;
        ArrayList arrayList3 = this.f30345;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((InterfaceC12896) it2.next()).getClass();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25309() {
        ArrayList arrayList = this.f30345;
        if (arrayList != null && !arrayList.isEmpty() && this.f30348 == -1) {
            this.f30348 = this.f30314;
            ArrayList arrayList2 = this.f30337;
            int intValue = !arrayList2.isEmpty() ? ((Integer) C18566.m43105(arrayList2, 1)).intValue() : -1;
            int i = this.f30314;
            if (intValue != i && i != -1) {
                arrayList2.add(Integer.valueOf(i));
            }
        }
        m25306();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m25306() {
        ArrayList arrayList = this.f30345;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = this.f30337;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList3 = this.f30345;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    InterfaceC12896 interfaceC12896 = (InterfaceC12896) it2.next();
                    num.getClass();
                    interfaceC12896.getClass();
                }
            }
        }
        arrayList2.clear();
    }

    @Override // l.C17606, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C0196) {
            C0196 c0196 = (C0196) view;
            if (this.f30345 == null) {
                this.f30345 = new ArrayList();
            }
            this.f30345.add(c0196);
            if (c0196.m1339()) {
                if (this.f30323 == null) {
                    this.f30323 = new ArrayList();
                }
                this.f30323.add(c0196);
            }
            if (c0196.m1340()) {
                if (this.f30307 == null) {
                    this.f30307 = new ArrayList();
                }
                this.f30307.add(c0196);
            }
        }
    }

    @Override // l.C17606, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.f30323;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.f30307;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m25322() {
        return this.f30356;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m25320() {
        return this.f30326;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m25324() {
        return this.f30342;
    }
}
