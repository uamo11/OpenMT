package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: S6MQ */
/* renamed from: l.۠ܰۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8211 extends AbstractC12924 {

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f25231 = 0;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final Matrix f25232;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public float f25233;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C19501 f25234;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public float f25235;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C5389 f25236;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C0449 f25237;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public float f25238;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final Paint f25239;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25240;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public float f25241;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final OverScroller f25242;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Paint f25243;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public float f25244;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final float f25245;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C19501 f25246;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public float f25247;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public float f25248;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public float f25249;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final float f25250;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f25251;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public float f25252;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f25253;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final RectF f25254;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f25255;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f25256;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Matrix f25257;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public float f25258;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f25259;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public float f25260;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f25261;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public float f25262;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC22375 f25263;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public float f25264;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f25265;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f25266;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public final RectF f25267;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC3047 f25268;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C14500 f25269;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C13794 f25270;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Matrix f25271;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC18795 f25272;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public float f25273;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public long f25274;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C20478 f25275;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public float f25276;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f25277;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public float f25278;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f25279;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public float f25280;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Paint f25281;

    public C8211(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25270 = new C13794(getResources().getDisplayMetrics().density);
        this.f25265 = new ArrayList(3);
        this.f25243 = new Paint(3);
        Paint paint = new Paint(1);
        this.f25239 = paint;
        Paint paint2 = new Paint(1);
        this.f25281 = paint2;
        this.f25263 = new RunnableC22375(3, this);
        this.f25271 = new Matrix();
        this.f25232 = new Matrix();
        this.f25257 = new Matrix();
        this.f25267 = new RectF();
        this.f25254 = new RectF();
        this.f25246 = new C19501();
        this.f25234 = new C19501();
        this.f25255 = -1;
        this.f25251 = -16777216;
        this.f25272 = EnumC18795.NONE;
        this.f25250 = getResources().getDisplayMetrics().density * 16.0f;
        this.f25242 = new OverScroller(context);
        this.f25269 = new C14500(this);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        float f = getResources().getDisplayMetrics().density;
        this.f25245 = 14.5f * f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.MT_Protector_res_0x7f0400f3});
        try {
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            paint2.setColor(color);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f * 3.0f);
            paint2.setStrokeCap(Paint.Cap.ROUND);
            setFocusable(true);
            setClickable(true);
            setImportantForAccessibility(1);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // l.AbstractC12924
    /* renamed from: ֫ */
    public final void mo14781(C20478 c20478, int i) {
        if (c20478.m46921() < 0 || (c20478.m46921() > 0 && (i < 0 || i >= c20478.m46921()))) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo14790();
        this.f25279 = false;
        this.f25249 = 0.0f;
        m21714(0.0f);
        this.f25275 = c20478;
        if (c20478.m46921() == 0) {
            i = -1;
        }
        this.f25255 = i;
        if (i >= 0) {
            c20478.m46934(i);
        }
        m21709();
        m21708();
        invalidate();
    }

    @Override // l.AbstractC12924
    /* renamed from: ֫ */
    public final void mo14780(InterfaceC3047 interfaceC3047) {
        this.f25268 = interfaceC3047;
    }

    @Override // l.AbstractC12924
    /* renamed from: ۧ */
    public final int mo14785() {
        return this.f25255;
    }

    @Override // l.AbstractC12924
    /* renamed from: ܳ */
    public final Bundle mo14787() {
        C0449 m21712 = m21712(this.f25255);
        if (m21712 == null) {
            return null;
        }
        C11739 c11739 = m21712.f1944;
        if (!m21707(m21712, m21712.f1940)) {
            return null;
        }
        C5389 c5389 = this.f25236;
        if (c5389 != null && c5389.f16742 == m21712 && c5389.f16743 == m21712.f1940) {
            C1155 c1155 = c5389.f16744;
            Bundle bundle = new Bundle();
            bundle.putInt("version", 1);
            bundle.putInt("width", c1155.f4175);
            bundle.putInt("height", c1155.f4173);
            bundle.putInt("orientation", c1155.f4174);
            C6094 c6094 = c1155.f4172;
            bundle.putDouble("relativeScale", c6094.f18676);
            bundle.putDouble("centerX", c6094.f18672);
            bundle.putDouble("centerY", c6094.f18673);
            bundle.putFloat("rotation", c6094.f18674);
            return bundle;
        }
        if (m21712.f1941 == null || !c11739.m28720()) {
            return null;
        }
        int i = m21712.f1948;
        int i2 = m21712.f1939;
        int i3 = ((C15537) m21712.f1941).f47871.f46663;
        C6094 m28736 = c11739.m28736();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 1);
        bundle2.putInt("width", i);
        bundle2.putInt("height", i2);
        bundle2.putInt("orientation", i3);
        bundle2.putDouble("relativeScale", m28736.f18676);
        bundle2.putDouble("centerX", m28736.f18672);
        bundle2.putDouble("centerY", m28736.f18673);
        bundle2.putFloat("rotation", m28736.f18674);
        return bundle2;
    }

    @Override // l.AbstractC12924
    /* renamed from: ֫ */
    public final boolean mo14784(Bundle bundle) {
        C1155 c1155 = null;
        this.f25236 = null;
        C0449 m21712 = m21712(this.f25255);
        if (bundle != null) {
            if (bundle.getInt("version") == 1) {
                int i = bundle.getInt("width");
                int i2 = bundle.getInt("height");
                int i3 = bundle.getInt("orientation");
                if (i > 0 && i2 > 0 && i3 >= 1 && i3 <= 8) {
                    C6094 c6094 = new C6094(C19893.m45756(i, i2, i3), C19893.m45754(i, i2, i3), bundle.getDouble("relativeScale", Double.NaN), bundle.getDouble("centerX", Double.NaN), bundle.getDouble("centerY", Double.NaN), bundle.getFloat("rotation", Float.NaN));
                    if (c6094.m17004()) {
                        c1155 = new C1155(i, i2, i3, c6094);
                    }
                }
                c1155 = null;
            }
        }
        if (m21712 == null || !m21707(m21712, m21712.f1940) || c1155 == null) {
            return false;
        }
        if (m21712.f1941 != null && !c1155.m3950(m21712)) {
            return false;
        }
        this.f25236 = new C5389(m21712, c1155);
        m21713();
        return true;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m21713() {
        C5389 c5389 = this.f25236;
        if (c5389 == null) {
            return;
        }
        C1155 c1155 = c5389.f16744;
        C0449 m21712 = m21712(this.f25255);
        if (m21712 != null) {
            C11739 c11739 = m21712.f1944;
            if (c5389.f16742 == m21712) {
                long j = c5389.f16743;
                if (j == m21712.f1940 && m21707(m21712, j)) {
                    if (m21712.f1941 == null) {
                        return;
                    }
                    if (!c1155.m3950(m21712)) {
                        this.f25236 = null;
                        return;
                    } else {
                        if (c11739.m28720()) {
                            this.f25236 = null;
                            mo14778();
                            c11739.m28714(c1155.f4172);
                            invalidate();
                            return;
                        }
                        return;
                    }
                }
            }
        }
        this.f25236 = null;
    }

    @Override // l.AbstractC12924
    /* renamed from: ܽ */
    public final void mo14788(int i) {
        this.f25251 = i;
        invalidate();
    }

    @Override // l.AbstractC12924
    /* renamed from: ֫ */
    public final boolean mo14783(int i, long j, InterfaceC3212 interfaceC3212) {
        if (interfaceC3212 == null) {
            throw new IllegalArgumentException("Missing gallery renderer");
        }
        C15537 c15537 = (C15537) interfaceC3212;
        C15205 c15205 = c15537.f47871;
        int i2 = c15205.f46658;
        int i3 = c15205.f46659;
        int i4 = c15205.f46663;
        if (i2 <= 0 || i3 <= 0 || i4 < 1 || i4 > 8) {
            c15537.m36629();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C0449 m21712 = m21712(i);
        if (!m21707(m21712, j)) {
            c15537.m36629();
            return false;
        }
        int m45756 = C19893.m45756(i2, i3, i4);
        int m45754 = C19893.m45754(i2, i3, i4);
        C11739 c11739 = m21712.f1944;
        float[] fArr = m21712.f1946;
        if (c11739.m28719() != m45756 || c11739.m28737() != m45754) {
            if (i == this.f25255 && c11739.m28720()) {
                mo14778();
            } else if (i == this.f25255) {
                this.f25269.m34616();
            }
            c11739.m28713(m45756, m45754);
        }
        InterfaceC3212 interfaceC32122 = m21712.f1941;
        m21712.f1941 = interfaceC3212;
        m21712.f1938 = false;
        removeCallbacks(this.f25263);
        m21712.f1948 = i2;
        m21712.f1939 = i3;
        C19893.m45751(i2, i3, i4, fArr);
        m21712.f1943.setValues(fArr);
        if (interfaceC32122 != null && interfaceC32122 != interfaceC3212) {
            ((C15537) interfaceC32122).m36629();
        }
        m21713();
        invalidate();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m21707(C0449 c0449, long j) {
        C20478 c20478;
        if (c0449 == null) {
            return false;
        }
        int i = c0449.f1949;
        if (c0449.f1940 != j || (c20478 = this.f25275) == null || i >= c20478.m46921()) {
            return false;
        }
        this.f25275.getClass();
        return ((long) i) + 1 == c0449.f1945;
    }

    @Override // l.AbstractC12924
    /* renamed from: ۧ */
    public final boolean mo14786(int i) {
        C0449 m21712 = m21712(i);
        if (m21712 == null || !m21707(m21712, m21712.f1940)) {
            return false;
        }
        C5389 c5389 = this.f25236;
        if (c5389 != null && c5389.f16742 == m21712) {
            this.f25236 = null;
        }
        long j = m21712.f1940;
        InterfaceC3212 interfaceC3212 = m21712.f1941;
        long j2 = this.f25274 + 1;
        this.f25274 = j2;
        m21712.f1940 = j2;
        m21712.f1941 = null;
        m21712.f1938 = false;
        m21712.f1947 = SystemClock.uptimeMillis();
        this.f25275.m46923(i, j);
        if (interfaceC3212 != null) {
            ((C15537) interfaceC3212).m36629();
        }
        this.f25275.m46927(i, m21712.f1940);
        invalidate();
        return true;
    }

    @Override // l.AbstractC12924
    /* renamed from: ֫ */
    public final void mo14779(int i, int i2, long j) {
        C0449 m21712 = m21712(i);
        if (m21712 == null || m21712.f1940 != j) {
            return;
        }
        m21712.f1938 = true;
        m21712.f1942 = i2;
        removeCallbacks(this.f25263);
        invalidate();
    }

    @Override // l.AbstractC12924
    /* renamed from: ֫ */
    public final void mo14778() {
        m21723();
        this.f25269.m34611();
        if (!this.f25279) {
            this.f25249 = 0.0f;
            m21714(0.0f);
            C11739 m21733 = m21733();
            if (m21733 != null) {
                m21733.m28708();
            }
        }
        invalidate();
    }

    @Override // l.AbstractC12924
    /* renamed from: ܿ */
    public final void mo14790() {
        removeCallbacks(this.f25263);
        this.f25236 = null;
        mo14778();
        C20478 c20478 = this.f25275;
        this.f25275 = null;
        this.f25255 = -1;
        ArrayList arrayList = this.f25265;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0449 c0449 = (C0449) it.next();
            InterfaceC3212 interfaceC3212 = c0449.f1941;
            c0449.f1941 = null;
            if (c20478 != null) {
                c20478.m46923(c0449.f1949, c0449.f1940);
            }
            if (interfaceC3212 != null) {
                ((C15537) interfaceC3212).m36629();
            }
        }
        invalidate();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m21709() {
        if (this.f25275 == null || this.f25255 < 0) {
            return;
        }
        ArrayList arrayList = this.f25265;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0449 c0449 = (C0449) arrayList.get(size);
            if (Math.abs(c0449.f1949 - this.f25255) > 1) {
                arrayList.remove(size);
                C20478 c20478 = this.f25275;
                InterfaceC3212 interfaceC3212 = c0449.f1941;
                c0449.f1941 = null;
                if (c20478 != null) {
                    c20478.m46923(c0449.f1949, c0449.f1940);
                }
                if (interfaceC3212 != null) {
                    ((C15537) interfaceC3212).m36629();
                }
            }
        }
        m21710(this.f25255);
        m21710(this.f25255 - 1);
        m21710(this.f25255 + 1);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m21710(int i) {
        C20478 c20478 = this.f25275;
        if (c20478 == null || i < 0 || i >= c20478.m46921() || m21712(i) != null) {
            return;
        }
        this.f25275.getClass();
        long j = this.f25274 + 1;
        this.f25274 = j;
        C0449 c0449 = new C0449(i + 1, i, j);
        c0449.f1944.m28725(getWidth(), getHeight());
        this.f25265.add(c0449);
        this.f25275.m46927(i, c0449.f1940);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C0449 m21712(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f25265;
            if (i2 >= arrayList.size()) {
                return null;
            }
            if (((C0449) arrayList.get(i2)).f1949 == i) {
                return (C0449) arrayList.get(i2);
            }
            i2++;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C11739 m21733() {
        C0449 m21712 = m21712(this.f25255);
        if (m21712 == null) {
            return null;
        }
        return m21712.f1944;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m21732() {
        return this.f25249;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float m21722() {
        return this.f25261;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m21728(float f) {
        return 1.0f - (m21715(f) * 0.25f);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private float m21715(float f) {
        return Math.min(1.0f, f / Math.max(1.0f, getHeight() * 0.65f));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m21731(int i) {
        int i2;
        C20478 c20478 = this.f25275;
        return c20478 != null && (i2 = this.f25255 + i) >= 0 && i2 < c20478.m46921();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21725(float f) {
        float f2 = this.f25249 + f;
        int i = f2 < 0.0f ? 1 : -1;
        float width = getWidth() + this.f25250;
        while (Math.abs(f2) >= width && m21731(i)) {
            f2 += i * width;
            m21716(this.f25255 + i);
            InterfaceC3047 interfaceC3047 = this.f25268;
            if (interfaceC3047 != null) {
                interfaceC3047.mo9337(this.f25255);
            }
        }
        if (!m21731(i) && Math.signum(f) == Math.signum(f2)) {
            float f3 = this.f25249;
            f2 = ((f2 - f3) * C23673.m52222(Math.abs(f3), getWidth())) + f3;
        }
        this.f25249 = Math.max(-width, Math.min(width, f2));
        invalidate();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m21716(int i) {
        C20478 c20478;
        boolean z = this.f25255 != i;
        if (z) {
            this.f25236 = null;
            C11739 m21733 = m21733();
            if (m21733 != null) {
                m21733.m28735();
            }
        }
        this.f25255 = i;
        this.f25249 = 0.0f;
        if (z && (c20478 = this.f25275) != null) {
            c20478.m46934(i);
        }
        m21709();
        m21708();
        return z;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m21724() {
        this.f25249 = 0.0f;
        invalidate();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m21714(float f) {
        this.f25261 = f;
        InterfaceC3047 interfaceC3047 = this.f25268;
        if (interfaceC3047 != null) {
            interfaceC3047.mo9336(m21715(f));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21719(float f) {
        m21714(Math.max(0.0f, Math.min(getHeight(), this.f25261 + f)));
        invalidate();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21726(float f, float f2) {
        super.performClick();
        if (m21717(this.f25255)) {
            if (this.f25270.m33110(f, f2, getWidth() / 2.0f, getHeight() / 2.0f)) {
                InterfaceC3047 interfaceC3047 = this.f25268;
                if (interfaceC3047 != null) {
                    interfaceC3047.mo9338(this.f25255);
                    return;
                }
                return;
            }
        }
        InterfaceC3047 interfaceC30472 = this.f25268;
        if (interfaceC30472 != null) {
            interfaceC30472.mo9335();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m21717(int i) {
        C20478 c20478 = this.f25275;
        return c20478 != null && i >= 0 && c20478.m46932(i);
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f25279) {
            return false;
        }
        super.performClick();
        if (this.f25268 == null) {
            return true;
        }
        if (m21717(this.f25255)) {
            this.f25268.mo9338(this.f25255);
            return true;
        }
        this.f25268.mo9335();
        return true;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m21708() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(getResources().getString(R.string.MT_Protector_res_0x7f12074d));
        if (this.f25275 == null) {
            str = "";
        } else {
            str = " " + (this.f25255 + 1) + "/" + this.f25275.m46921();
        }
        sb.append(str);
        setContentDescription(sb.toString());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        mo14778();
        Iterator it = this.f25265.iterator();
        while (it.hasNext()) {
            ((C0449) it.next()).f1944.m28725(i, i2);
        }
        m21713();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        mo14778();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f25263);
        mo14778();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f25255 < 0 || this.f25279) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f25236 = null;
        }
        C14500 c14500 = this.f25269;
        boolean m34614 = c14500.m34614();
        c14500.m34612(motionEvent);
        if (m34614 != c14500.m34614()) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ArrayList arrayList;
        float f;
        int i;
        boolean z;
        float f2;
        int i2;
        long j;
        float f3;
        RunnableC22375 runnableC22375 = this.f25263;
        removeCallbacks(runnableC22375);
        if (this.f25279) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float m21715 = 1.0f - m21715(this.f25261);
        int round = Math.round(Color.alpha(this.f25251) * m21715);
        int save = canvas.save();
        canvas.clipRect(0, 0, getWidth(), getHeight());
        canvas.drawColor((round << 24) | (this.f25251 & 16777215));
        float f4 = this.f25261;
        boolean z2 = f4 > 0.0f;
        float m21728 = z2 ? m21728(f4) : 1.0f;
        long j2 = Long.MAX_VALUE;
        int i3 = 0;
        while (true) {
            arrayList = this.f25265;
            int size = arrayList.size();
            f = this.f25250;
            if (i3 >= size) {
                break;
            }
            C0449 c0449 = (C0449) arrayList.get(i3);
            int i4 = c0449.f1949;
            C11739 c11739 = c0449.f1944;
            if (i4 == this.f25255) {
                i = i3;
                z = true;
            } else {
                i = i3;
                z = false;
            }
            float width = ((getWidth() + f) * (i4 - r6)) + this.f25249;
            boolean z3 = (!z2 || z) && width < ((float) getWidth()) && ((float) getWidth()) + width > 0.0f;
            float width2 = getWidth();
            RunnableC22375 runnableC223752 = runnableC22375;
            float height = getHeight();
            int i5 = save;
            RectF rectF = this.f25267;
            float f5 = m21715;
            rectF.set(0.0f, 0.0f, width2, height);
            if (z3 && !z2) {
                z3 = rectF.intersect(width, 0.0f, getWidth() + width, getHeight());
            }
            if (c0449.f1941 != null && c11739.m28720()) {
                Matrix matrix = this.f25271;
                matrix.reset();
                if (z2) {
                    matrix.setTranslate(0.0f, this.f25261);
                    matrix.preScale(m21728, m21728, getWidth() * 0.5f, getHeight() * 0.5f);
                }
                matrix.preTranslate(c11739.m28733() + width, c11739.m28706());
                matrix.preRotate(c11739.m28717());
                matrix.preScale(c11739.m28732(), c11739.m28732());
                matrix.preConcat(c0449.f1943);
                RectF rectF2 = this.f25254;
                rectF2.setEmpty();
                if (z3) {
                    Matrix matrix2 = this.f25232;
                    if (matrix.invert(matrix2)) {
                        matrix2.mapRect(rectF2, rectF);
                    }
                }
                ((C15537) c0449.f1941).m36628(rectF2, c11739.m28732() * m21728, z);
                if (z3) {
                    int save2 = canvas.save();
                    if (!z2) {
                        canvas.clipRect(width, 0.0f, getWidth() + width, getHeight());
                    }
                    canvas.concat(matrix);
                    ((C15537) c0449.f1941).m36627(canvas, this.f25243);
                    canvas.restoreToCount(save2);
                }
            } else if (z3 && !m21717(c0449.f1949)) {
                int save3 = canvas.save();
                if (z2) {
                    f2 = 0.0f;
                    canvas.translate(0.0f, this.f25261);
                    canvas.scale(m21728, m21728, getWidth() * 0.5f, getHeight() * 0.5f);
                } else {
                    f2 = 0.0f;
                }
                canvas.translate(width, f2);
                if (!z2) {
                    canvas.clipRect(0, 0, getWidth(), getHeight());
                }
                Paint paint = this.f25239;
                paint.setColor(-3355444);
                if (c0449.f1938) {
                    canvas.drawText(getResources().getString(c0449.f1942), getWidth() / 2.0f, getHeight() / 2.0f, paint);
                } else {
                    long j3 = (uptimeMillis - c0449.f1947) - 200;
                    if (j3 < 0) {
                        j2 = Math.min(j2, -j3);
                    } else {
                        float width3 = getWidth() / 2.0f;
                        float height2 = getHeight() / 2.0f;
                        int round2 = Math.round(Math.min(1.0f, j3 / 120.0f) * 255.0f * f5);
                        Paint paint2 = this.f25281;
                        paint2.setAlpha(round2);
                        float f6 = this.f25245;
                        i2 = i;
                        j = uptimeMillis;
                        f3 = m21728;
                        canvas.drawArc(width3 - f6, height2 - f6, width3 + f6, height2 + f6, (((j3 % 900) * 360.0f) / 900.0f) - 90.0f, 240.0f, false, paint2);
                        j2 = 0;
                        canvas.restoreToCount(save3);
                        i3 = i2 + 1;
                        m21728 = f3;
                        runnableC22375 = runnableC223752;
                        save = i5;
                        m21715 = f5;
                        uptimeMillis = j;
                    }
                }
                j = uptimeMillis;
                i2 = i;
                f3 = m21728;
                canvas.restoreToCount(save3);
                i3 = i2 + 1;
                m21728 = f3;
                runnableC22375 = runnableC223752;
                save = i5;
                m21715 = f5;
                uptimeMillis = j;
            }
            j = uptimeMillis;
            i2 = i;
            f3 = m21728;
            i3 = i2 + 1;
            m21728 = f3;
            runnableC22375 = runnableC223752;
            save = i5;
            m21715 = f5;
            uptimeMillis = j;
        }
        float f7 = m21728;
        RunnableC22375 runnableC223753 = runnableC22375;
        int i6 = save;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0449 c04492 = (C0449) it.next();
            if (!this.f25269.m34614()) {
                int i7 = c04492.f1949;
                if (m21717(i7) && (!z2 || i7 == this.f25255)) {
                    float width4 = ((getWidth() + f) * (i7 - this.f25255)) + this.f25249;
                    if (width4 < getWidth() && getWidth() + width4 > 0.0f) {
                        int save4 = canvas.save();
                        if (z2) {
                            canvas.translate(0.0f, this.f25261);
                            canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
                        }
                        canvas.clipRect(width4, 0.0f, getWidth() + width4, getHeight());
                        this.f25270.m33109(canvas, (getWidth() / 2.0f) + width4, getHeight() / 2.0f);
                        canvas.restoreToCount(save4);
                    }
                }
            }
        }
        canvas.restoreToCount(i6);
        if (j2 != C13132.FOREVER_NS && isAttachedToWindow() && getWindowVisibility() == 0 && isShown()) {
            if (j2 == 0) {
                postOnAnimation(runnableC223753);
            } else {
                postDelayed(runnableC223753, j2);
            }
        }
    }

    @Override // l.AbstractC12924
    /* renamed from: ܽ */
    public final boolean mo14789() {
        return this.f25272 != EnumC18795.NONE;
    }

    @Override // l.AbstractC12924
    /* renamed from: ᩳ */
    public final boolean mo14791() {
        return this.f25269.m34615();
    }

    @Override // l.AbstractC12924
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float mo21718(RectF rectF) {
        float m28717;
        float max;
        float f;
        float f2;
        C0449 c0449 = this.f25237;
        if (c0449 == null) {
            return 0.0f;
        }
        EnumC18795 enumC18795 = this.f25272;
        if (enumC18795 == EnumC18795.ZOOM && this.f25277) {
            f = this.f25262;
            f2 = this.f25247;
            max = this.f25235;
            m28717 = this.f25280;
        } else {
            if (enumC18795 != EnumC18795.FLING) {
                return 0.0f;
            }
            C11739 c11739 = c0449.f1944;
            float m28732 = c11739.m28732();
            m28717 = c11739.m28717();
            float m28728 = c11739.m28728();
            float m28734 = c11739.m28734();
            OverScroller overScroller = this.f25242;
            float max2 = Math.max(m28728, Math.min(m28734, overScroller.getFinalX()));
            max = Math.max(c11739.m28716(), Math.min(c11739.m28722(), overScroller.getFinalY()));
            f = m28732;
            f2 = max2;
        }
        Matrix matrix = this.f25257;
        matrix.setTranslate(f2, max);
        matrix.preRotate(m28717);
        matrix.preScale(f, f);
        matrix.preConcat(this.f25237.f1943);
        Matrix matrix2 = this.f25232;
        if (!matrix.invert(matrix2)) {
            return 0.0f;
        }
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        matrix2.mapRect(rectF);
        return f;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m21723() {
        this.f25272 = EnumC18795.NONE;
        this.f25237 = null;
        this.f25242.forceFinished(true);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m21730(int i) {
        if (!m21731(i)) {
            i = 0;
        }
        if (i != 0) {
            this.f25236 = null;
        }
        this.f25256 = this.f25255 + i;
        m21706(EnumC18795.PAGE, (getWidth() + this.f25250) * (-i), 0.0f, 280);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21727(boolean z) {
        m21706(z ? EnumC18795.DISMISS : EnumC18795.RESTORE, 0.0f, z ? getHeight() : 0.0f, 220);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21721(boolean z) {
        m21706(z ? EnumC18795.TO_SCALE : EnumC18795.RESTORE, 0.0f, 0.0f, z ? UMErrorCode.E_UM_BE_NOT_MAINPROCESS : 220);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21729(float f, float f2) {
        C11739 m21733 = m21733();
        if (m21733 == null || !m21733.m28720()) {
            return;
        }
        float m28732 = m21733.m28732();
        float m28733 = m21733.m28733();
        float m28706 = m21733.m28706();
        float m28726 = m21733.m28726();
        if (m28726 != m21733.m28730()) {
            m21733.m28709(m28726, f, f2, f, f2);
        } else {
            m21733.m28727();
        }
        float m287322 = m21733.m28732();
        float m287332 = m21733.m28733();
        float m287062 = m21733.m28706();
        m21733.m28712(m28732, m28733, m28706, false);
        m21706(EnumC18795.ZOOM, 0.0f, 0.0f, 300);
        this.f25262 = m287322;
        this.f25247 = m287332;
        this.f25235 = m287062;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21720(float f, float f2) {
        C11739 m21733 = m21733();
        if (m21733 == null || !m21733.m28720()) {
            m21721(false);
            return;
        }
        if (m21733.m28717() != m21733.m28731()) {
            m21721(false);
            return;
        }
        float m28732 = m21733.m28732();
        float m28733 = m21733.m28733();
        float m28706 = m21733.m28706();
        m21733.m28724();
        boolean z = Math.abs(m28732 - m21733.m28732()) > 1.0E-4f;
        float m287332 = m21733.m28733();
        float m287062 = m21733.m28706();
        m21733.m28712(m28732, m28733, m28706, false);
        if (z) {
            m21721(false);
            return;
        }
        m21723();
        float f3 = m28733 - m287332;
        this.f25253 = f3;
        this.f25266 = m28706 - m287062;
        float f4 = 0.0f;
        float f5 = (Math.abs(f3) > 0.1f || m21733.m28728() == m21733.m28734()) ? 0.0f : f;
        if (Math.abs(this.f25266) <= 0.1f && m21733.m28716() != m21733.m28722()) {
            f4 = f2;
        }
        this.f25272 = EnumC18795.FLING;
        this.f25259 = SystemClock.uptimeMillis();
        this.f25246.m44915(Math.round(m287332), f5, this.f25259);
        this.f25234.m44915(Math.round(m287062), f4, this.f25259);
        this.f25237 = m21712(this.f25255);
        this.f25269.m34617();
        this.f25242.fling(Math.round(m287332), Math.round(m287062), Math.round(f5), Math.round(f4), Math.round(m21733.m28728()), Math.round(m21733.m28734()), Math.round(m21733.m28716()), Math.round(m21733.m28722()), m21705(f5, getWidth()), m21705(f4, getHeight()));
        postInvalidateOnAnimation();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m21705(float f, int i) {
        if (f == 0.0f) {
            return 0;
        }
        return Math.round(Math.min(getResources().getDisplayMetrics().density * 24.0f, i * 0.04f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21706(EnumC18795 enumC18795, float f, float f2, int i) {
        m21723();
        this.f25272 = enumC18795;
        C0449 m21712 = m21712(this.f25255);
        this.f25237 = m21712;
        this.f25277 = m21712 != null && m21712.f1944.m28720();
        this.f25259 = SystemClock.uptimeMillis();
        this.f25240 = i;
        this.f25276 = this.f25249;
        this.f25244 = f;
        this.f25264 = this.f25261;
        this.f25252 = f2;
        if (this.f25277) {
            C11739 c11739 = this.f25237.f1944;
            this.f25273 = c11739.m28732();
            this.f25241 = c11739.m28733();
            this.f25238 = c11739.m28706();
            float m28717 = c11739.m28717();
            this.f25278 = m28717;
            float m28731 = (enumC18795 == EnumC18795.TO_SCALE || enumC18795 == EnumC18795.ZOOM) ? m28717 : c11739.m28731();
            this.f25280 = m28731;
            c11739.m28710(this.f25273, m28731, getWidth() * 0.5f, getHeight() * 0.5f, getWidth() * 0.5f, getHeight() * 0.5f, true);
            this.f25262 = c11739.m28732();
            this.f25247 = c11739.m28733();
            this.f25235 = c11739.m28706();
            float f3 = this.f25278;
            if (f3 != this.f25280) {
                double radians = Math.toRadians(f3);
                double radians2 = Math.toRadians(this.f25280);
                this.f25233 = this.f25241 + m21704(c11739, this.f25273, radians);
                this.f25248 = this.f25238 + m21711(c11739, this.f25273, radians);
                this.f25260 = this.f25247 + m21704(c11739, this.f25262, radians2);
                this.f25258 = this.f25235 + m21711(c11739, this.f25262, radians2);
            }
            c11739.m28711(this.f25273, this.f25278, this.f25241, this.f25238, false);
        }
        this.f25269.m34617();
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public final void computeScroll() {
        float f;
        float f2;
        InterfaceC3047 interfaceC3047;
        C0449 c0449;
        EnumC18795 enumC18795 = this.f25272;
        EnumC18795 enumC187952 = EnumC18795.NONE;
        if (enumC18795 == enumC187952) {
            return;
        }
        if (this.f25237 != m21712(this.f25255)) {
            mo14778();
            return;
        }
        EnumC18795 enumC187953 = this.f25272;
        EnumC18795 enumC187954 = EnumC18795.FLING;
        C14500 c14500 = this.f25269;
        if (enumC187953 == enumC187954) {
            OverScroller overScroller = this.f25242;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            float max = (this.f25253 == 0.0f && this.f25266 == 0.0f) ? 0.0f : Math.max(0.0f, 1.0f - ((SystemClock.uptimeMillis() - this.f25259) / 220.0f));
            C0449 c04492 = this.f25237;
            if (c04492 != null) {
                C11739 c11739 = c04492.f1944;
                long uptimeMillis = SystemClock.uptimeMillis();
                float f3 = getResources().getDisplayMetrics().density;
                float f4 = max * max * max;
                c11739.m28712(c11739.m28732(), (this.f25253 * f4) + this.f25246.m44914(overScroller.getCurrX(), overScroller.getFinalX(), c11739.m28728(), c11739.m28734(), f3, uptimeMillis), (this.f25266 * f4) + this.f25234.m44914(overScroller.getCurrY(), overScroller.getFinalY(), c11739.m28716(), c11739.m28722(), f3, uptimeMillis), !computeScrollOffset && max == 0.0f);
            }
            if (computeScrollOffset || max > 0.0f) {
                postInvalidateOnAnimation();
                return;
            }
            this.f25272 = enumC187952;
            this.f25237 = null;
            c14500.m34613(false);
            return;
        }
        float min = Math.min(1.0f, (SystemClock.uptimeMillis() - this.f25259) / this.f25240);
        float f5 = 1.0f - min;
        EnumC18795 enumC187955 = this.f25272;
        if (enumC187955 == EnumC18795.ZOOM) {
            f = (3.0f - (2.0f * min)) * min * min;
        } else {
            f = enumC187955 == EnumC18795.PAGE ? 1.0f - (f5 * f5) : 1.0f - ((f5 * f5) * f5);
        }
        this.f25249 = m21703(this.f25276, this.f25244, f);
        m21714(m21703(this.f25264, this.f25252, f));
        if (this.f25277 && (c0449 = this.f25237) != null && c0449.f1944.m28720()) {
            C11739 c117392 = this.f25237.f1944;
            float m21703 = m21703(this.f25273, this.f25262, f);
            float f6 = this.f25278;
            float f7 = this.f25280;
            if (f6 != f7) {
                float m217032 = m21703(f6, f7, f);
                double radians = Math.toRadians(m217032);
                f2 = 1.0f;
                c117392.m28711(m21703, m217032, m21703(this.f25233, this.f25260, f) - m21704(c117392, m21703, radians), m21703(this.f25248, this.f25258, f) - m21711(c117392, m21703, radians), false);
            } else {
                f2 = 1.0f;
                c117392.m28712(m21703, m21703(this.f25241, this.f25247, f), m21703(this.f25238, this.f25235, f), false);
            }
        } else {
            f2 = 1.0f;
        }
        invalidate();
        if (min < f2) {
            postInvalidateOnAnimation();
            return;
        }
        EnumC18795 enumC187956 = this.f25272;
        this.f25272 = enumC187952;
        this.f25237 = null;
        if (enumC187956 == EnumC18795.PAGE) {
            boolean m21716 = m21716(this.f25256);
            c14500.m34613(false);
            if (!m21716 || (interfaceC3047 = this.f25268) == null) {
                return;
            }
            interfaceC3047.mo9337(this.f25255);
            return;
        }
        c14500.m34613(enumC187956 == EnumC18795.TO_SCALE);
        if (enumC187956 == EnumC18795.DISMISS) {
            this.f25279 = true;
            InterfaceC3047 interfaceC30472 = this.f25268;
            if (interfaceC30472 != null) {
                interfaceC30472.onDismiss();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m21703(float f, float f2, float f3) {
        return C20382.m46695(f2, f, f3, f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m21704(C11739 c11739, float f, double d) {
        return (float) (((Math.cos(d) * c11739.m28719()) - (Math.sin(d) * c11739.m28737())) * f * 0.5d);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static float m21711(C11739 c11739, float f, double d) {
        return (float) (((Math.cos(d) * c11739.m28737()) + (Math.sin(d) * c11739.m28719())) * f * 0.5d);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(m21731(1) || m21731(-1));
        if (m21717(this.f25255)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector_res_0x7f12069a)));
        }
        if (m21731(1)) {
            accessibilityNodeInfo.addAction(4096);
        }
        if (m21731(-1)) {
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int i2 = 0;
        if (this.f25279) {
            return false;
        }
        if (i == 4096) {
            i2 = 1;
        } else if (i == 8192) {
            i2 = -1;
        }
        if (i2 != 0 && m21731(i2)) {
            mo14778();
            m21730(i2);
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2 = i == 22 ? 1 : i == 21 ? -1 : 0;
        if (i2 != 0 && m21731(i2)) {
            mo14778();
            m21730(i2);
            return true;
        }
        if (i == 81 || i == 70 || i == 69) {
            mo14778();
            m21729(getWidth() / 2.0f, getHeight() / 2.0f);
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
