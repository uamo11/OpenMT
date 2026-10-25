package l;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: TB7B */
/* renamed from: l.ᩴ֨ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18430 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static HashSet f57188;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8552 f57191;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Stack f57192;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f57194;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Stack f57195;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Canvas f57197;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Stack f57199;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16312 f57200;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Matrix f57196 = new Matrix();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Matrix f57193 = new Matrix();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float[] f57198 = new float[8];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16997 f57189 = new C16997(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f57190 = 96.0f;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42848(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        if (i > 255) {
            return 255;
        }
        return i;
    }

    public C18430(Canvas canvas, boolean z) {
        this.f57197 = canvas;
        this.f57194 = z;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m42903() {
        return this.f57190;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m42899() {
        return this.f57191.f26148.getTextSize();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m42901() {
        return this.f57191.f26148.getTextSize() / 2.0f;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16997 m42902() {
        C8552 c8552 = this.f57191;
        C16997 c16997 = c8552.f26155;
        return c16997 != null ? c16997 : c8552.f26149;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42900(C16312 c16312, C17703 c17703) {
        this.f57200 = c16312;
        C9383 m38409 = c16312.m38409();
        if (m38409 == null) {
            return;
        }
        C16997 c16997 = m38409.f68869;
        C16291 c16291 = m38409.f24627;
        this.f57191 = new C8552();
        this.f57195 = new Stack();
        m42869(this.f57191, C20672.m47291());
        C8552 c8552 = this.f57191;
        c8552.f26149 = null;
        c8552.f26154 = false;
        this.f57195.push(new C8552(c8552));
        this.f57199 = new Stack();
        this.f57192 = new Stack();
        Boolean bool = m38409.f60631;
        if (bool != null) {
            this.f57191.f26154 = bool.booleanValue();
        }
        m42887();
        C16997 c169972 = new C16997(c17703.f54176);
        C0769 c0769 = m38409.f28498;
        if (c0769 != null) {
            c169972.f52134 = c0769.m2930(this, c169972.f52134);
        }
        C0769 c07692 = m38409.f28501;
        if (c07692 != null) {
            c169972.f52131 = c07692.m2930(this, c169972.f52131);
        }
        m42871(m38409, c169972, c16997, c16291);
        m42897();
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x03de, code lost:
    
        if (r5 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0697, code lost:
    
        m42878(r14.f57590);
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x05d8, code lost:
    
        if (r2 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x063d, code lost:
    
        if (r1 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0695, code lost:
    
        if (r1 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x06ff, code lost:
    
        if (r1 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0794, code lost:
    
        if (r0 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x07f7, code lost:
    
        if (r1 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x086e, code lost:
    
        if (r1 != false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x093e, code lost:
    
        if (r1 != false) goto L376;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ᩴ֨ܺ] */
    /* JADX WARN: Type inference failed for: r14v1, types: [l.ۤۚܺ, l.ۨۚܺ, l.۬ۚܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v11, types: [l.ۚ֡ܺ, l.۠ۚܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v2, types: [l.ۤ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v3, types: [l.ۛ֡ܺ, l.ۤ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v4, types: [l.۠֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v5, types: [l.ܺ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v6, types: [l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ, l.᩻֡ܺ] */
    /* JADX WARN: Type inference failed for: r14v7, types: [l.ۨ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v8, types: [l.ۙ֡ܺ, l.ᩴ֡ܺ, l.ᩴۚܺ, l.᩵ۚܺ] */
    /* JADX WARN: Type inference failed for: r14v9, types: [l.ᩴۚܺ] */
    /* JADX WARN: Type inference failed for: r4v25, types: [l.ۚۚܺ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m42866(l.C5149 r14) {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18430.m42866(l.ۚۚܺ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42877(AbstractC15731 abstractC15731, boolean z) {
        if (z) {
            m42865((InterfaceC3738) abstractC15731);
        }
        Iterator it = abstractC15731.f48531.iterator();
        while (it.hasNext()) {
            m42866((C5149) it.next());
        }
        if (z) {
            this.f57192.pop();
            this.f57199.pop();
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m42887() {
        this.f57197.save();
        this.f57195.push(this.f57191);
        this.f57191 = new C8552(this.f57191);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m42897() {
        this.f57197.restore();
        this.f57191 = (C8552) this.f57195.pop();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42865(InterfaceC3738 interfaceC3738) {
        this.f57192.push(interfaceC3738);
        Canvas canvas = this.f57197;
        Matrix matrix = this.f57193;
        canvas.getMatrix(matrix);
        Matrix matrix2 = new Matrix();
        Stack stack = this.f57199;
        if (!matrix.invert(matrix2)) {
            matrix2 = null;
        }
        stack.push(matrix2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42868(C8552 c8552, AbstractC19261 abstractC19261) {
        boolean z = abstractC19261.f16091 == null;
        C20672 c20672 = c8552.f26151;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        c20672.f66596 = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        c20672.f66614 = bool;
        c20672.f66609 = null;
        c20672.f66611 = null;
        c20672.f66598 = valueOf;
        c20672.f66590 = C20526.f66138;
        c20672.f66600 = valueOf;
        c20672.f66602 = null;
        c20672.f66587 = null;
        c20672.f66608 = valueOf;
        c20672.f66607 = null;
        c20672.f66584 = valueOf;
        c20672.f66612 = EnumC6560.None;
        C20672 c206722 = abstractC19261.f60632;
        if (c206722 != null) {
            m42869(c8552, c206722);
        }
        if (this.f57200.m38407()) {
            Iterator it = ((ArrayList) this.f57200.m38397()).iterator();
            while (it.hasNext()) {
                C13322 c13322 = (C13322) it.next();
                if (C23200.m51492(c13322.f39872, abstractC19261)) {
                    m42869(c8552, c13322.f39874);
                }
            }
        }
        C20672 c206723 = abstractC19261.f60635;
        if (c206723 != null) {
            m42869(c8552, c206723);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020b A[LOOP:3: B:71:0x0205->B:73:0x020b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0229  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m42881(l.AbstractC18555 r21, android.graphics.Path r22) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18430.m42881(l.ᩴۚܺ, android.graphics.Path):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42890(Path path) {
        C8552 c8552 = this.f57191;
        EnumC6560 enumC6560 = c8552.f26151.f66612;
        EnumC6560 enumC65602 = EnumC6560.NonScalingStroke;
        Canvas canvas = this.f57197;
        if (enumC6560 == enumC65602) {
            Matrix matrix = canvas.getMatrix();
            Path path2 = new Path();
            path.transform(matrix, path2);
            canvas.setMatrix(new Matrix());
            Shader shader = this.f57191.f26153.getShader();
            Matrix matrix2 = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(matrix2);
                Matrix matrix3 = new Matrix(matrix2);
                matrix3.postConcat(matrix);
                shader.setLocalMatrix(matrix3);
            }
            canvas.drawPath(path2, this.f57191.f26153);
            canvas.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(matrix2);
                return;
            }
            return;
        }
        canvas.drawPath(path, c8552.f26153);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42871(C9383 c9383, C16997 c16997, C16997 c169972, C16291 c16291) {
        if (c16997.f52134 == 0.0f || c16997.f52131 == 0.0f) {
            return;
        }
        if (c16291 == null && (c16291 = c9383.f24627) == null) {
            c16291 = C16291.f50083;
        }
        m42868(this.f57191, c9383);
        if (m42896()) {
            C8552 c8552 = this.f57191;
            c8552.f26149 = c16997;
            if (!c8552.f26151.f66614.booleanValue()) {
                C16997 c169973 = this.f57191.f26149;
                m42862(c169973.f52132, c169973.f52133, c169973.f52134, c169973.f52131);
            }
            m42891(c9383, this.f57191.f26149);
            Canvas canvas = this.f57197;
            if (c169972 != null) {
                canvas.concat(m42851(this.f57191.f26149, c169972, c16291));
                this.f57191.f26155 = c9383.f68869;
            } else {
                C16997 c169974 = this.f57191.f26149;
                canvas.translate(c169974.f52132, c169974.f52133);
            }
            boolean m42885 = m42885();
            m42886();
            m42877((AbstractC15731) c9383, true);
            if (m42885) {
                m42878(c9383.f57590);
            }
            m42894(c9383);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C16997 m42861(C0769 c0769, C0769 c07692, C0769 c07693, C0769 c07694) {
        float m2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
        float m2933 = c07692 != null ? c07692.m2933(this) : 0.0f;
        C16997 m42902 = m42902();
        return new C16997(m2932, m2933, c07693 != null ? c07693.m2932(this) : m42902.f52134, c07694 != null ? c07694.m2933(this) : m42902.f52131);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m42894(AbstractC18555 abstractC18555) {
        Matrix matrix;
        if (abstractC18555.f16091 == null || abstractC18555.f57590 == null || (matrix = (Matrix) this.f57199.peek()) == null) {
            return;
        }
        Matrix matrix2 = this.f57196;
        matrix2.set(matrix);
        Canvas canvas = this.f57197;
        Matrix matrix3 = this.f57193;
        canvas.getMatrix(matrix3);
        matrix2.preConcat(matrix3);
        C16997 c16997 = abstractC18555.f57590;
        float f = c16997.f52132;
        float[] fArr = this.f57198;
        fArr[6] = f;
        fArr[0] = f;
        float f2 = c16997.f52133;
        fArr[3] = f2;
        fArr[1] = f2;
        float m39856 = c16997.m39856();
        fArr[4] = m39856;
        fArr[2] = m39856;
        float m39857 = abstractC18555.f57590.m39857();
        fArr[7] = m39857;
        fArr[5] = m39857;
        matrix2.mapPoints(fArr);
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = f4;
        float f6 = f3;
        for (int i = 2; i <= 6; i += 2) {
            float f7 = fArr[i];
            if (f7 < f3) {
                f3 = f7;
            }
            if (f7 > f6) {
                f6 = f7;
            }
            float f8 = fArr[i + 1];
            if (f8 < f4) {
                f4 = f8;
            }
            if (f8 > f5) {
                f5 = f8;
            }
        }
        AbstractC18555 abstractC185552 = (AbstractC18555) this.f57192.peek();
        C16997 c169972 = abstractC185552.f57590;
        if (c169972 == null) {
            abstractC185552.f57590 = new C16997(f3, f4, f6 - f3, f5 - f4);
            return;
        }
        C16997 c169973 = this.f57189;
        c169973.f52132 = f3;
        c169973.f52133 = f4;
        c169973.f52134 = f6 - f3;
        c169973.f52131 = f5 - f4;
        c169972.getClass();
        float f9 = c169973.f52132;
        if (f9 < c169972.f52132) {
            c169972.f52132 = f9;
        }
        float f10 = c169973.f52133;
        if (f10 < c169972.f52133) {
            c169972.f52133 = f10;
        }
        if (c169973.m39856() > c169972.m39856()) {
            c169972.f52134 = c169973.m39856() - c169972.f52132;
        }
        if (c169973.m39857() > c169972.m39857()) {
            c169972.f52131 = c169973.m39857() - c169972.f52133;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42878(C16997 c16997) {
        if (this.f57191.f26151.f66602 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f57197;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C21232 c21232 = (C21232) this.f57200.m38398(this.f57191.f26151.f66602);
            m42882(c21232, c16997);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            m42882(c21232, c16997);
            canvas.restore();
            canvas.restore();
        }
        m42897();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m42885() {
        AbstractC19261 m38398;
        if (this.f57191.f26151.f66598.floatValue() >= 1.0f && this.f57191.f26151.f66602 == null) {
            return false;
        }
        this.f57197.saveLayerAlpha(null, m42848(this.f57191.f26151.f66598.floatValue()), 31);
        this.f57195.push(this.f57191);
        C8552 c8552 = new C8552(this.f57191);
        this.f57191 = c8552;
        String str = c8552.f26151.f66602;
        if (str != null && ((m38398 = this.f57200.m38398(str)) == null || !(m38398 instanceof C21232))) {
            C20672 c20672 = this.f57191.f26151;
            String str2 = c20672.f66602;
            c20672.f66602 = null;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16997 m42860(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C16997(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private EnumC17143 m42892() {
        EnumC17143 enumC17143;
        C20672 c20672 = this.f57191.f26151;
        if (c20672.f66580 == EnumC23493.LTR || (enumC17143 = c20672.f66599) == EnumC17143.Middle) {
            return c20672.f66599;
        }
        EnumC17143 enumC171432 = EnumC17143.Start;
        return enumC17143 == enumC171432 ? EnumC17143.End : enumC171432;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42873(AbstractC10088 abstractC10088, AbstractC2202 abstractC2202) {
        float f;
        float f2;
        float f3;
        EnumC17143 m42892;
        AbstractC19261 m38398;
        if (m42896()) {
            Iterator it = abstractC10088.f48531.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C5149 c5149 = (C5149) it.next();
                if (c5149 instanceof C13614) {
                    abstractC2202.mo7287(m42858(((C13614) c5149).f40613, z, !it.hasNext()));
                } else if (abstractC2202.mo7288((AbstractC10088) c5149)) {
                    if (c5149 instanceof C5854) {
                        m42887();
                        C5854 c5854 = (C5854) c5149;
                        m42868(this.f57191, c5854);
                        if (m42896() && m42893() && (m38398 = c5854.f16090.m38398(c5854.f17955)) != null) {
                            C4298 c4298 = (C4298) m38398;
                            Path path = new C23368(c4298.f13865).f75064;
                            Matrix matrix = c4298.f57156;
                            if (matrix != null) {
                                path.transform(matrix);
                            }
                            PathMeasure pathMeasure = new PathMeasure(path, false);
                            C0769 c0769 = c5854.f17956;
                            r4 = c0769 != null ? c0769.m2930(this, pathMeasure.getLength()) : 0.0f;
                            EnumC17143 m428922 = m42892();
                            if (m428922 != EnumC17143.Start) {
                                float m42847 = m42847((AbstractC10088) c5854);
                                if (m428922 == EnumC17143.Middle) {
                                    m42847 /= 2.0f;
                                }
                                r4 -= m42847;
                            }
                            m42880((AbstractC18555) c5854.mo9283());
                            boolean m42885 = m42885();
                            m42873(c5854, new C6435(this, path, r4));
                            if (m42885) {
                                m42878(c5854.f57590);
                            }
                        }
                        m42897();
                    } else if (c5149 instanceof C3032) {
                        m42887();
                        C3032 c3032 = (C3032) c5149;
                        m42868(this.f57191, c3032);
                        if (m42896()) {
                            ArrayList arrayList = c3032.f34358;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = abstractC2202 instanceof C20547;
                            if (z3) {
                                float m2932 = !z2 ? ((C20547) abstractC2202).f66196 : ((C0769) c3032.f34358.get(0)).m2932(this);
                                ArrayList arrayList2 = c3032.f34355;
                                f2 = (arrayList2 == null || arrayList2.size() == 0) ? ((C20547) abstractC2202).f66197 : ((C0769) c3032.f34355.get(0)).m2933(this);
                                ArrayList arrayList3 = c3032.f34356;
                                f3 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C0769) c3032.f34356.get(0)).m2932(this);
                                ArrayList arrayList4 = c3032.f34357;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    r4 = ((C0769) c3032.f34357.get(0)).m2933(this);
                                }
                                f = r4;
                                r4 = m2932;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            if (z2 && (m42892 = m42892()) != EnumC17143.Start) {
                                float m428472 = m42847((AbstractC10088) c3032);
                                if (m42892 == EnumC17143.Middle) {
                                    m428472 /= 2.0f;
                                }
                                r4 -= m428472;
                            }
                            m42880((AbstractC18555) c3032.mo9283());
                            if (z3) {
                                C20547 c20547 = (C20547) abstractC2202;
                                c20547.f66196 = r4 + f3;
                                c20547.f66197 = f2 + f;
                            }
                            boolean m428852 = m42885();
                            m42873(c3032, abstractC2202);
                            if (m428852) {
                                m42878(c3032.f57590);
                            }
                        }
                        m42897();
                    } else if (c5149 instanceof C4443) {
                        m42887();
                        C4443 c4443 = (C4443) c5149;
                        m42868(this.f57191, c4443);
                        if (m42896()) {
                            m42880((AbstractC18555) c4443.mo9283());
                            AbstractC19261 m383982 = c5149.f16090.m38398(c4443.f14194);
                            if (m383982 != null && (m383982 instanceof AbstractC10088)) {
                                StringBuilder sb = new StringBuilder();
                                m42872((AbstractC10088) m383982, sb);
                                if (sb.length() > 0) {
                                    abstractC2202.mo7287(sb.toString());
                                }
                            }
                        }
                        m42897();
                    }
                }
                z = false;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m42847(AbstractC10088 abstractC10088) {
        C3613 c3613 = new C3613(this);
        m42873(abstractC10088, c3613);
        return c3613.f11456;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42872(AbstractC10088 abstractC10088, StringBuilder sb) {
        Iterator it = abstractC10088.f48531.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C5149 c5149 = (C5149) it.next();
            if (c5149 instanceof AbstractC10088) {
                m42872((AbstractC10088) c5149, sb);
            } else if (c5149 instanceof C13614) {
                sb.append(m42858(((C13614) c5149).f40613, z, !it.hasNext()));
            }
            z = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m42858(String str, boolean z, boolean z2) {
        if (this.f57191.f26154) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m42896() {
        Boolean bool = this.f57191.f26151.f66596;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean m42893() {
        Boolean bool = this.f57191.f26151.f66581;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0082, code lost:
    
        if (r11 != 8) goto L37;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Matrix m42851(l.C16997 r9, l.C16997 r10, l.C16291 r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L9b
            l.֫֡ܺ r1 = r11.m38310()
            if (r1 != 0) goto Lf
            goto L9b
        Lf:
            float r1 = r9.f52134
            float r2 = r10.f52134
            float r1 = r1 / r2
            float r2 = r9.f52131
            float r3 = r10.f52131
            float r2 = r2 / r3
            float r3 = r10.f52132
            float r3 = -r3
            float r4 = r10.f52133
            float r4 = -r4
            l.ܽ֡ܺ r5 = l.C16291.f50084
            boolean r5 = r11.equals(r5)
            if (r5 == 0) goto L35
            float r10 = r9.f52132
            float r9 = r9.f52133
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        L35:
            l.ۧ֡ܺ r5 = r11.m38311()
            l.ۧ֡ܺ r6 = l.EnumC10648.slice
            if (r5 != r6) goto L42
            float r1 = java.lang.Math.max(r1, r2)
            goto L46
        L42:
            float r1 = java.lang.Math.min(r1, r2)
        L46:
            float r2 = r9.f52134
            float r2 = r2 / r1
            float r5 = r9.f52131
            float r5 = r5 / r1
            int[] r6 = l.C17724.f54216
            l.֫֡ܺ r7 = r11.m38310()
            int r7 = r7.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L62;
                case 2: goto L62;
                case 3: goto L62;
                case 4: goto L5e;
                case 5: goto L5e;
                case 6: goto L5e;
                default: goto L5d;
            }
        L5d:
            goto L67
        L5e:
            float r7 = r10.f52134
            float r7 = r7 - r2
            goto L66
        L62:
            float r7 = r10.f52134
            float r7 = r7 - r2
            float r7 = r7 / r8
        L66:
            float r3 = r3 - r7
        L67:
            l.֫֡ܺ r11 = r11.m38310()
            int r11 = r11.ordinal()
            r11 = r6[r11]
            r2 = 2
            if (r11 == r2) goto L89
            r2 = 3
            if (r11 == r2) goto L85
            r2 = 5
            if (r11 == r2) goto L89
            r2 = 6
            if (r11 == r2) goto L85
            r2 = 7
            if (r11 == r2) goto L89
            r2 = 8
            if (r11 == r2) goto L85
            goto L8e
        L85:
            float r10 = r10.f52131
            float r10 = r10 - r5
            goto L8d
        L89:
            float r10 = r10.f52131
            float r10 = r10 - r5
            float r10 = r10 / r8
        L8d:
            float r4 = r4 - r10
        L8e:
            float r10 = r9.f52132
            float r9 = r9.f52133
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18430.m42851(l.ܿ֡ܺ, l.ܿ֡ܺ, l.ܽ֡ܺ):android.graphics.Matrix");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m42884(C20672 c20672, long j) {
        return (j & c20672.f66591) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42869(C8552 c8552, C20672 c20672) {
        if (m42884(c20672, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF)) {
            c8552.f26151.f66583 = c20672.f66583;
        }
        if (m42884(c20672, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX)) {
            c8552.f26151.f66598 = c20672.f66598;
        }
        boolean m42884 = m42884(c20672, 1L);
        C20526 c20526 = C20526.f66137;
        if (m42884) {
            c8552.f26151.f66595 = c20672.f66595;
            AbstractC0915 abstractC0915 = c20672.f66595;
            c8552.f26150 = (abstractC0915 == null || abstractC0915 == c20526) ? false : true;
        }
        if (m42884(c20672, 4L)) {
            c8552.f26151.f66592 = c20672.f66592;
        }
        if (m42884(c20672, 6149L)) {
            m42870(c8552, true, c8552.f26151.f66595);
        }
        if (m42884(c20672, 2L)) {
            c8552.f26151.f66586 = c20672.f66586;
        }
        if (m42884(c20672, 8L)) {
            c8552.f26151.f66579 = c20672.f66579;
            AbstractC0915 abstractC09152 = c20672.f66579;
            c8552.f26152 = (abstractC09152 == null || abstractC09152 == c20526) ? false : true;
        }
        if (m42884(c20672, 16L)) {
            c8552.f26151.f66577 = c20672.f66577;
        }
        if (m42884(c20672, 6168L)) {
            m42870(c8552, false, c8552.f26151.f66579);
        }
        if (m42884(c20672, 34359738368L)) {
            c8552.f26151.f66612 = c20672.f66612;
        }
        if (m42884(c20672, 32L)) {
            C20672 c206722 = c8552.f26151;
            C0769 c0769 = c20672.f66589;
            c206722.f66589 = c0769;
            c8552.f26153.setStrokeWidth(c0769.m2929(this));
        }
        if (m42884(c20672, 64L)) {
            C20672 c206723 = c8552.f26151;
            Paint paint = c8552.f26153;
            c206723.f66605 = c20672.f66605;
            int i = C17724.f54217[c20672.f66605.ordinal()];
            if (i == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (m42884(c20672, 128L)) {
            C20672 c206724 = c8552.f26151;
            Paint paint2 = c8552.f26153;
            c206724.f66576 = c20672.f66576;
            int i2 = C17724.f54218[c20672.f66576.ordinal()];
            if (i2 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (m42884(c20672, 256L)) {
            c8552.f26151.f66585 = c20672.f66585;
            c8552.f26153.setStrokeMiter(c20672.f66585.floatValue());
        }
        if (m42884(c20672, 512L)) {
            c8552.f26151.f66582 = c20672.f66582;
        }
        if (m42884(c20672, ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS)) {
            c8552.f26151.f66604 = c20672.f66604;
        }
        Typeface typeface = null;
        if (m42884(c20672, 1536L)) {
            C20672 c206725 = c8552.f26151;
            Paint paint3 = c8552.f26153;
            C0769[] c0769Arr = c206725.f66582;
            if (c0769Arr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c0769Arr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float m2929 = c206725.f66582[i4 % length].m2929(this);
                    fArr[i4] = m2929;
                    f += m2929;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float m29292 = c206725.f66604.m2929(this);
                    if (m29292 < 0.0f) {
                        m29292 = (m29292 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, m29292));
                }
            }
        }
        if (m42884(c20672, 16384L)) {
            float m42899 = m42899();
            c8552.f26151.f66613 = c20672.f66613;
            c8552.f26148.setTextSize(c20672.f66613.m2930(this, m42899));
            c8552.f26153.setTextSize(c20672.f66613.m2930(this, m42899));
        }
        if (m42884(c20672, 8192L)) {
            c8552.f26151.f66594 = c20672.f66594;
        }
        if (m42884(c20672, X931RNG.BLOCK64_RESEED_MAX)) {
            if (c20672.f66588.intValue() == -1 && c8552.f26151.f66588.intValue() > 100) {
                C20672 c206726 = c8552.f26151;
                c206726.f66588 = Integer.valueOf(c206726.f66588.intValue() - 100);
            } else if (c20672.f66588.intValue() == 1 && c8552.f26151.f66588.intValue() < 900) {
                C20672 c206727 = c8552.f26151;
                c206727.f66588 = Integer.valueOf(c206727.f66588.intValue() + 100);
            } else {
                c8552.f26151.f66588 = c20672.f66588;
            }
        }
        if (m42884(c20672, 65536L)) {
            c8552.f26151.f66597 = c20672.f66597;
        }
        if (m42884(c20672, 106496L)) {
            C20672 c206728 = c8552.f26151;
            ArrayList arrayList = c206728.f66594;
            if (arrayList != null && this.f57200 != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typeface = m42857((String) it.next(), c206728.f66588, c206728.f66597)) == null) {
                }
            }
            if (typeface == null) {
                typeface = m42857("serif", c206728.f66588, c206728.f66597);
            }
            c8552.f26148.setTypeface(typeface);
            c8552.f26153.setTypeface(typeface);
        }
        if (m42884(c20672, 131072L)) {
            C20672 c206729 = c8552.f26151;
            Paint paint4 = c8552.f26153;
            Paint paint5 = c8552.f26148;
            c206729.f66610 = c20672.f66610;
            EnumC14320 enumC14320 = c20672.f66610;
            EnumC14320 enumC143202 = EnumC14320.LineThrough;
            paint5.setStrikeThruText(enumC14320 == enumC143202);
            EnumC14320 enumC143203 = c20672.f66610;
            EnumC14320 enumC143204 = EnumC14320.Underline;
            paint5.setUnderlineText(enumC143203 == enumC143204);
            paint4.setStrikeThruText(c20672.f66610 == enumC143202);
            paint4.setUnderlineText(c20672.f66610 == enumC143204);
        }
        if (m42884(c20672, 68719476736L)) {
            c8552.f26151.f66580 = c20672.f66580;
        }
        if (m42884(c20672, 262144L)) {
            c8552.f26151.f66599 = c20672.f66599;
        }
        if (m42884(c20672, 524288L)) {
            c8552.f26151.f66614 = c20672.f66614;
        }
        if (m42884(c20672, 2097152L)) {
            c8552.f26151.f66603 = c20672.f66603;
        }
        if (m42884(c20672, 4194304L)) {
            c8552.f26151.f66601 = c20672.f66601;
        }
        if (m42884(c20672, X931RNG.BLOCK128_RESEED_MAX)) {
            c8552.f26151.f66593 = c20672.f66593;
        }
        if (m42884(c20672, 16777216L)) {
            c8552.f26151.f66596 = c20672.f66596;
        }
        if (m42884(c20672, 33554432L)) {
            c8552.f26151.f66581 = c20672.f66581;
        }
        if (m42884(c20672, 1048576L)) {
            c8552.f26151.f66609 = c20672.f66609;
        }
        if (m42884(c20672, 268435456L)) {
            c8552.f26151.f66611 = c20672.f66611;
        }
        if (m42884(c20672, 536870912L)) {
            c8552.f26151.f66606 = c20672.f66606;
        }
        if (m42884(c20672, 1073741824L)) {
            c8552.f26151.f66602 = c20672.f66602;
        }
        if (m42884(c20672, 67108864L)) {
            c8552.f26151.f66590 = c20672.f66590;
        }
        if (m42884(c20672, 134217728L)) {
            c8552.f26151.f66600 = c20672.f66600;
        }
        if (m42884(c20672, 8589934592L)) {
            c8552.f26151.f66607 = c20672.f66607;
        }
        if (m42884(c20672, 17179869184L)) {
            c8552.f26151.f66584 = c20672.f66584;
        }
        if (m42884(c20672, 137438953472L)) {
            c8552.f26151.f66578 = c20672.f66578;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42870(C8552 c8552, boolean z, AbstractC0915 abstractC0915) {
        int i;
        C20672 c20672 = c8552.f26151;
        float floatValue = (z ? c20672.f66592 : c20672.f66577).floatValue();
        if (abstractC0915 instanceof C20526) {
            i = ((C20526) abstractC0915).f66139;
        } else if (!(abstractC0915 instanceof C9237)) {
            return;
        } else {
            i = c8552.f26151.f66583.f66139;
        }
        int m42849 = m42849(floatValue, i);
        if (z) {
            c8552.f26148.setColor(m42849);
        } else {
            c8552.f26153.setColor(m42849);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        if (r2.equals("sans-serif") == false) goto L35;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m42857(java.lang.String r2, java.lang.Integer r3, l.EnumC1621 r4) {
        /*
            l.֫ۚܺ r0 = l.EnumC1621.Italic
            r1 = 0
            if (r4 != r0) goto L7
            r4 = 1
            goto L8
        L7:
            r4 = 0
        L8:
            int r3 = r3.intValue()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r3 <= r0) goto L16
            if (r4 == 0) goto L14
            r3 = 3
            goto L1b
        L14:
            r3 = 1
            goto L1b
        L16:
            if (r4 == 0) goto L1a
            r3 = 2
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r2.getClass()
            int r4 = r2.hashCode()
            switch(r4) {
                case -1536685117: goto L52;
                case -1431958525: goto L47;
                case -1081737434: goto L3c;
                case 109326717: goto L31;
                case 1126973893: goto L26;
                default: goto L25;
            }
        L25:
            goto L5a
        L26:
            java.lang.String r4 = "cursive"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L2f
            goto L5a
        L2f:
            r1 = 4
            goto L5b
        L31:
            java.lang.String r4 = "serif"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L3a
            goto L5a
        L3a:
            r1 = 3
            goto L5b
        L3c:
            java.lang.String r4 = "fantasy"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L45
            goto L5a
        L45:
            r1 = 2
            goto L5b
        L47:
            java.lang.String r4 = "monospace"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L50
            goto L5a
        L50:
            r1 = 1
            goto L5b
        L52:
            java.lang.String r4 = "sans-serif"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L5b
        L5a:
            r1 = -1
        L5b:
            switch(r1) {
                case 0: goto L7c;
                case 1: goto L75;
                case 2: goto L6e;
                case 3: goto L67;
                case 4: goto L60;
                default: goto L5e;
            }
        L5e:
            r2 = 0
            return r2
        L60:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
            return r2
        L67:
            android.graphics.Typeface r2 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
            return r2
        L6e:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
            return r2
        L75:
            android.graphics.Typeface r2 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
            return r2
        L7c:
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18430.m42857(java.lang.String, java.lang.Integer, l.֫ۚܺ):android.graphics.Typeface");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m42849(float f, int i) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i2 << 24) | (i & 16777215);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42862(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        C14174 c14174 = this.f57191.f26151.f66609;
        if (c14174 != null) {
            f += c14174.f42805.m2932(this);
            f2 += this.f57191.f26151.f66609.f42807.m2933(this);
            f5 -= this.f57191.f26151.f66609.f42806.m2932(this);
            f6 -= this.f57191.f26151.f66609.f42804.m2933(this);
        }
        this.f57197.clipRect(f, f2, f5, f6);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m42886() {
        int i;
        C20672 c20672 = this.f57191.f26151;
        AbstractC0915 abstractC0915 = c20672.f66607;
        if (abstractC0915 instanceof C20526) {
            i = ((C20526) abstractC0915).f66139;
        } else if (!(abstractC0915 instanceof C9237)) {
            return;
        } else {
            i = c20672.f66583.f66139;
        }
        Float f = c20672.f66584;
        if (f != null) {
            i = m42849(f.floatValue(), i);
        }
        this.f57197.drawColor(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42863(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, InterfaceC12764 interfaceC12764) {
        double acos;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            interfaceC12764.mo8828(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (sin * d2) + (cos * d);
        double d4 = (d2 * cos) + ((-sin) * d);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double sqrt = Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d14) * d10;
        double d15 = abs;
        double d16 = abs2;
        double d17 = ((d15 * d4) / d16) * sqrt2;
        float f8 = abs;
        float f9 = abs2;
        double d18 = sqrt2 * (-((d16 * d3) / d15));
        double d19 = ((cos * d17) - (sin * d18)) + ((f + f6) / 2.0d);
        double d20 = (cos * d18) + (sin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double acos2 = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double d26 = (d22 * d24) + (d21 * d23);
        double d27 = (d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d;
        double d28 = d26 / sqrt3;
        if (d28 < -1.0d) {
            acos = 3.141592653589793d;
        } else {
            acos = d28 > 1.0d ? 0.0d : Math.acos(d28);
        }
        double d29 = d27 * acos;
        if (!z2 && d29 > 0.0d) {
            d29 -= 6.283185307179586d;
        } else if (z2 && d29 < 0.0d) {
            d29 += 6.283185307179586d;
        }
        double d30 = d29 % 6.283185307179586d;
        double d31 = acos2 % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d30) * 2.0d) / 3.141592653589793d);
        double d32 = d30 / ceil;
        double d33 = d32 / 2.0d;
        double sin2 = (Math.sin(d33) * 1.3333333333333333d) / (Math.cos(d33) + 1.0d);
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            int i4 = ceil;
            double d34 = (i2 * d32) + d31;
            double cos2 = Math.cos(d34);
            double sin3 = Math.sin(d34);
            fArr[i3] = (float) (cos2 - (sin2 * sin3));
            double d35 = d20;
            fArr[i3 + 1] = (float) ((cos2 * sin2) + sin3);
            double d36 = d34 + d32;
            double cos3 = Math.cos(d36);
            double sin4 = Math.sin(d36);
            fArr[i3 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i3 + 3] = (float) (sin4 - (sin2 * cos3));
            int i5 = i3 + 5;
            fArr[i3 + 4] = (float) cos3;
            i3 += 6;
            fArr[i5] = (float) sin4;
            i2++;
            i = i;
            d31 = d31;
            d32 = d32;
            ceil = i4;
            sin2 = sin2;
            d20 = d35;
        }
        int i6 = i;
        Matrix matrix = new Matrix();
        matrix.postScale(f8, f9);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i6 - 2] = f6;
        fArr[i6 - 1] = f7;
        for (int i7 = 0; i7 < i6; i7 += 6) {
            interfaceC12764.mo8825(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0074  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m42879(l.AbstractC18409 r19) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18430.m42879(l.ᩴ֡ܺ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0104, code lost:
    
        if (r8 != 8) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m42875(l.C14880 r13, l.C14195 r14) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18430.m42875(l.ܶ֡ܺ, l.ܳ֨ܺ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C8552 m42859(AbstractC19261 abstractC19261) {
        C8552 c8552 = new C8552();
        m42869(c8552, C20672.m47291());
        m42867(abstractC19261, c8552);
        return c8552;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42867(C5149 c5149, C8552 c8552) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (c5149 instanceof AbstractC19261) {
                arrayList.add(0, (AbstractC19261) c5149);
            }
            Object obj = c5149.f16091;
            if (obj == null) {
                break;
            } else {
                c5149 = (C5149) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m42868(c8552, (AbstractC19261) it.next());
        }
        C8552 c85522 = this.f57191;
        c8552.f26155 = c85522.f26155;
        c8552.f26149 = c85522.f26149;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42880(AbstractC18555 abstractC18555) {
        AbstractC0915 abstractC0915 = this.f57191.f26151.f66595;
        if (abstractC0915 instanceof C19821) {
            m42883(true, abstractC18555.f57590, (C19821) abstractC0915);
        }
        AbstractC0915 abstractC09152 = this.f57191.f26151.f66579;
        if (abstractC09152 instanceof C19821) {
            m42883(false, abstractC18555.f57590, (C19821) abstractC09152);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42883(boolean z, C16997 c16997, C19821 c19821) {
        float m2930;
        float m29302;
        float m29303;
        float m29304;
        float f;
        float f2;
        float f3;
        AbstractC19261 m38398 = this.f57200.m38398(c19821.f64053);
        int i = 0;
        int i2 = 0;
        if (m38398 == null) {
            AbstractC0915 abstractC0915 = c19821.f64052;
            if (abstractC0915 != null) {
                m42870(this.f57191, z, abstractC0915);
                return;
            } else if (z) {
                this.f57191.f26150 = false;
                return;
            } else {
                this.f57191.f26152 = false;
                return;
            }
        }
        boolean z2 = m38398 instanceof C0209;
        C20526 c20526 = C20526.f66138;
        float f4 = -1.0f;
        if (z2) {
            C0209 c0209 = (C0209) m38398;
            String str = c0209.f7180;
            if (str != null) {
                m42864(c0209, str);
            }
            Boolean bool = c0209.f7181;
            boolean z3 = bool != null && bool.booleanValue();
            C8552 c8552 = this.f57191;
            Paint paint = z ? c8552.f26148 : c8552.f26153;
            if (z3) {
                C16997 m42902 = m42902();
                C0769 c0769 = c0209.f1454;
                float m2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
                C0769 c07692 = c0209.f1456;
                float m2933 = c07692 != null ? c07692.m2933(this) : 0.0f;
                C0769 c07693 = c0209.f1455;
                float m29322 = c07693 != null ? c07693.m2932(this) : m42902.f52134;
                C0769 c07694 = c0209.f1457;
                f3 = m29322;
                f = m2932;
                f2 = m2933;
                m29304 = c07694 != null ? c07694.m2933(this) : 0.0f;
            } else {
                C0769 c07695 = c0209.f1454;
                float m29305 = c07695 != null ? c07695.m2930(this, 1.0f) : 0.0f;
                C0769 c07696 = c0209.f1456;
                float m29306 = c07696 != null ? c07696.m2930(this, 1.0f) : 0.0f;
                C0769 c07697 = c0209.f1455;
                float m29307 = c07697 != null ? c07697.m2930(this, 1.0f) : 1.0f;
                C0769 c07698 = c0209.f1457;
                m29304 = c07698 != null ? c07698.m2930(this, 1.0f) : 0.0f;
                f = m29305;
                f2 = m29306;
                f3 = m29307;
            }
            m42887();
            this.f57191 = m42859((AbstractC19261) c0209);
            Matrix matrix = new Matrix();
            if (!z3) {
                matrix.preTranslate(c16997.f52132, c16997.f52133);
                matrix.preScale(c16997.f52134, c16997.f52131);
            }
            Matrix matrix2 = c0209.f7183;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c0209.f7179.size();
            if (size == 0) {
                m42897();
                if (z) {
                    this.f57191.f26150 = false;
                    return;
                } else {
                    this.f57191.f26152 = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c0209.f7179.iterator();
            while (it.hasNext()) {
                C13469 c13469 = (C13469) ((C5149) it.next());
                Float f5 = c13469.f40209;
                float floatValue = f5 != null ? f5.floatValue() : 0.0f;
                if (i == 0 || floatValue >= f4) {
                    fArr[i] = floatValue;
                    f4 = floatValue;
                } else {
                    fArr[i] = f4;
                }
                m42887();
                m42868(this.f57191, c13469);
                C20672 c20672 = this.f57191.f26151;
                C20526 c205262 = (C20526) c20672.f66590;
                if (c205262 == null) {
                    c205262 = c20526;
                }
                iArr[i] = m42849(c20672.f66600.floatValue(), c205262.f66139);
                i++;
                m42897();
            }
            if ((f == f3 && f2 == m29304) || size == 1) {
                m42897();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            EnumC3592 enumC3592 = c0209.f7182;
            if (enumC3592 != null) {
                if (enumC3592 == EnumC3592.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC3592 == EnumC3592.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            m42897();
            LinearGradient linearGradient = new LinearGradient(f, f2, f3, m29304, iArr, fArr, tileMode);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            paint.setAlpha(m42848(this.f57191.f26151.f66592.floatValue()));
            return;
        }
        if (m38398 instanceof C15025) {
            C15025 c15025 = (C15025) m38398;
            String str2 = c15025.f7180;
            if (str2 != null) {
                m42864(c15025, str2);
            }
            Boolean bool2 = c15025.f7181;
            boolean z4 = bool2 != null && bool2.booleanValue();
            C8552 c85522 = this.f57191;
            Paint paint2 = z ? c85522.f26148 : c85522.f26153;
            if (z4) {
                C0769 c07699 = new C0769(50.0f, EnumC7265.percent);
                C0769 c076910 = c15025.f45799;
                m2930 = c076910 != null ? c076910.m2932(this) : c07699.m2932(this);
                C0769 c076911 = c15025.f45800;
                m29302 = c076911 != null ? c076911.m2933(this) : c07699.m2933(this);
                C0769 c076912 = c15025.f45798;
                m29303 = c076912 != null ? c076912.m2929(this) : c07699.m2929(this);
            } else {
                C0769 c076913 = c15025.f45799;
                m2930 = c076913 != null ? c076913.m2930(this, 1.0f) : 0.5f;
                C0769 c076914 = c15025.f45800;
                m29302 = c076914 != null ? c076914.m2930(this, 1.0f) : 0.5f;
                C0769 c076915 = c15025.f45798;
                m29303 = c076915 != null ? c076915.m2930(this, 1.0f) : 0.5f;
            }
            float f6 = m29303;
            float f7 = m2930;
            float f8 = m29302;
            m42887();
            this.f57191 = m42859((AbstractC19261) c15025);
            Matrix matrix3 = new Matrix();
            if (!z4) {
                matrix3.preTranslate(c16997.f52132, c16997.f52133);
                matrix3.preScale(c16997.f52134, c16997.f52131);
            }
            Matrix matrix4 = c15025.f7183;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = c15025.f7179.size();
            if (size2 == 0) {
                m42897();
                if (z) {
                    this.f57191.f26150 = false;
                    return;
                } else {
                    this.f57191.f26152 = false;
                    return;
                }
            }
            int[] iArr2 = new int[size2];
            float[] fArr2 = new float[size2];
            Iterator it2 = c15025.f7179.iterator();
            while (it2.hasNext()) {
                C13469 c134692 = (C13469) ((C5149) it2.next());
                Float f9 = c134692.f40209;
                float floatValue2 = f9 != null ? f9.floatValue() : 0.0f;
                if (i2 == 0 || floatValue2 >= f4) {
                    fArr2[i2] = floatValue2;
                    f4 = floatValue2;
                } else {
                    fArr2[i2] = f4;
                }
                m42887();
                m42868(this.f57191, c134692);
                C20672 c206722 = this.f57191.f26151;
                C20526 c205263 = (C20526) c206722.f66590;
                if (c205263 == null) {
                    c205263 = c20526;
                }
                iArr2[i2] = m42849(c206722.f66600.floatValue(), c205263.f66139);
                i2++;
                m42897();
            }
            if (f6 == 0.0f || size2 == 1) {
                m42897();
                paint2.setColor(iArr2[size2 - 1]);
                return;
            }
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            EnumC3592 enumC35922 = c15025.f7182;
            if (enumC35922 != null) {
                if (enumC35922 == EnumC3592.reflect) {
                    tileMode2 = Shader.TileMode.MIRROR;
                } else if (enumC35922 == EnumC3592.repeat) {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
            }
            m42897();
            RadialGradient radialGradient = new RadialGradient(f7, f8, f6, iArr2, fArr2, tileMode2);
            radialGradient.setLocalMatrix(matrix3);
            paint2.setShader(radialGradient);
            paint2.setAlpha(m42848(this.f57191.f26151.f66592.floatValue()));
            return;
        }
        if (m38398 instanceof C22642) {
            C22642 c22642 = (C22642) m38398;
            if (z) {
                if (m42884(c22642.f60632, 2147483648L)) {
                    C8552 c85523 = this.f57191;
                    C20672 c206723 = c85523.f26151;
                    AbstractC0915 abstractC09152 = c22642.f60632.f66587;
                    c206723.f66595 = abstractC09152;
                    c85523.f26150 = abstractC09152 != null;
                }
                if (m42884(c22642.f60632, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                    this.f57191.f26151.f66592 = c22642.f60632.f66608;
                }
                if (m42884(c22642.f60632, 6442450944L)) {
                    C8552 c85524 = this.f57191;
                    m42870(c85524, z, c85524.f26151.f66595);
                    return;
                }
                return;
            }
            if (m42884(c22642.f60632, 2147483648L)) {
                C8552 c85525 = this.f57191;
                C20672 c206724 = c85525.f26151;
                AbstractC0915 abstractC09153 = c22642.f60632.f66587;
                c206724.f66579 = abstractC09153;
                c85525.f26152 = abstractC09153 != null;
            }
            if (m42884(c22642.f60632, Blake2xsDigest.MAX_NUMBER_BLOCKS)) {
                this.f57191.f26151.f66577 = c22642.f60632.f66608;
            }
            if (m42884(c22642.f60632, 6442450944L)) {
                C8552 c85526 = this.f57191;
                m42870(c85526, z, c85526.f26151.f66579);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42864(AbstractC2181 abstractC2181, String str) {
        AbstractC19261 m38398 = abstractC2181.f16090.m38398(str);
        if (m38398 == null || !(m38398 instanceof AbstractC2181) || m38398 == abstractC2181) {
            return;
        }
        AbstractC2181 abstractC21812 = (AbstractC2181) m38398;
        if (abstractC2181.f7181 == null) {
            abstractC2181.f7181 = abstractC21812.f7181;
        }
        if (abstractC2181.f7183 == null) {
            abstractC2181.f7183 = abstractC21812.f7183;
        }
        if (abstractC2181.f7182 == null) {
            abstractC2181.f7182 = abstractC21812.f7182;
        }
        if (abstractC2181.f7179.isEmpty()) {
            abstractC2181.f7179 = abstractC21812.f7179;
        }
        try {
            if (abstractC2181 instanceof C0209) {
                C0209 c0209 = (C0209) abstractC2181;
                C0209 c02092 = (C0209) m38398;
                if (c0209.f1454 == null) {
                    c0209.f1454 = c02092.f1454;
                }
                if (c0209.f1456 == null) {
                    c0209.f1456 = c02092.f1456;
                }
                if (c0209.f1455 == null) {
                    c0209.f1455 = c02092.f1455;
                }
                if (c0209.f1457 == null) {
                    c0209.f1457 = c02092.f1457;
                }
            } else {
                m42876((C15025) abstractC2181, (C15025) m38398);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC21812.f7180;
        if (str2 != null) {
            m42864(abstractC2181, str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42876(C15025 c15025, C15025 c150252) {
        if (c15025.f45799 == null) {
            c15025.f45799 = c150252.f45799;
        }
        if (c15025.f45800 == null) {
            c15025.f45800 = c150252.f45800;
        }
        if (c15025.f45798 == null) {
            c15025.f45798 = c150252.f45798;
        }
        if (c15025.f45801 == null) {
            c15025.f45801 = c150252.f45801;
        }
        if (c15025.f45802 == null) {
            c15025.f45802 = c150252.f45802;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m42891(AbstractC18555 abstractC18555, C16997 c16997) {
        Path m42855;
        if (this.f57191.f26151.f66611 == null || (m42855 = m42855(abstractC18555, c16997)) == null) {
            return;
        }
        this.f57197.clipPath(m42855);
    }

    @TargetApi(19)
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42855(AbstractC18555 abstractC18555, C16997 c16997) {
        Path m42888;
        AbstractC19261 m38398 = abstractC18555.f16090.m38398(this.f57191.f26151.f66611);
        if (m38398 == null) {
            String str = this.f57191.f26151.f66611;
            return null;
        }
        C6414 c6414 = (C6414) m38398;
        this.f57195.push(this.f57191);
        this.f57191 = m42859((AbstractC19261) c6414);
        Boolean bool = c6414.f19849;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(c16997.f52132, c16997.f52133);
            matrix.preScale(c16997.f52134, c16997.f52131);
        }
        Matrix matrix2 = c6414.f60225;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (C5149 c5149 : c6414.f48531) {
            if ((c5149 instanceof AbstractC18555) && (m42888 = m42888((AbstractC18555) c5149)) != null) {
                path.op(m42888, Path.Op.UNION);
            }
        }
        if (this.f57191.f26151.f66611 != null) {
            if (c6414.f57590 == null) {
                c6414.f57590 = m42860(path);
            }
            Path m42855 = m42855(c6414, c6414.f57590);
            if (m42855 != null) {
                path.op(m42855, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f57191 = (C8552) this.f57195.pop();
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01aa  */
    @android.annotation.TargetApi(19)
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.Path m42888(l.AbstractC18555 r11) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18430.m42888(l.ᩴۚܺ):android.graphics.Path");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private Path.FillType m42898() {
        EnumC7120 enumC7120 = this.f57191.f26151.f66606;
        if (enumC7120 != null && enumC7120 == EnumC7120.EvenOdd) {
            return Path.FillType.EVEN_ODD;
        }
        return Path.FillType.WINDING;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42853(C11354 c11354) {
        float m2932;
        float m2933;
        Path path;
        C0769 c0769 = c11354.f33987;
        if (c0769 == null && c11354.f33982 == null) {
            m2932 = 0.0f;
            m2933 = 0.0f;
        } else {
            if (c0769 == null) {
                m2932 = c11354.f33982.m2933(this);
            } else if (c11354.f33982 == null) {
                m2932 = c0769.m2932(this);
            } else {
                m2932 = c0769.m2932(this);
                m2933 = c11354.f33982.m2933(this);
            }
            m2933 = m2932;
        }
        float min = Math.min(m2932, c11354.f33984.m2932(this) / 2.0f);
        float min2 = Math.min(m2933, c11354.f33986.m2933(this) / 2.0f);
        C0769 c07692 = c11354.f33983;
        float m29322 = c07692 != null ? c07692.m2932(this) : 0.0f;
        C0769 c07693 = c11354.f33985;
        float m29332 = c07693 != null ? c07693.m2933(this) : 0.0f;
        float m29323 = c11354.f33984.m2932(this);
        float m29333 = c11354.f33986.m2933(this);
        if (c11354.f57590 == null) {
            c11354.f57590 = new C16997(m29322, m29332, m29323, m29333);
        }
        float f = m29323 + m29322;
        float f2 = m29332 + m29333;
        Path path2 = new Path();
        if (min == 0.0f || min2 == 0.0f) {
            path = path2;
            path.moveTo(m29322, m29332);
            path.lineTo(f, m29332);
            path.lineTo(f, f2);
            path.lineTo(m29322, f2);
            path.lineTo(m29322, m29332);
        } else {
            float f3 = min * 0.5522848f;
            float f4 = 0.5522848f * min2;
            float f5 = m29332 + min2;
            path2.moveTo(m29322, f5);
            float f6 = f5 - f4;
            float f7 = m29322 + min;
            float f8 = f7 - f3;
            path2.cubicTo(m29322, f6, f8, m29332, f7, m29332);
            float f9 = f - min;
            path2.lineTo(f9, m29332);
            float f10 = f9 + f3;
            path2.cubicTo(f10, m29332, f, f6, f, f5);
            float f11 = f2 - min2;
            path2.lineTo(f, f11);
            float f12 = f11 + f4;
            path = path2;
            path2.cubicTo(f, f12, f10, f2, f9, f2);
            path.lineTo(f7, f2);
            path.cubicTo(f8, f2, m29322, f12, m29322, f11);
            path.lineTo(m29322, f5);
        }
        path.close();
        return path;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42856(C23347 c23347) {
        C0769 c0769 = c23347.f75015;
        float m2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
        C0769 c07692 = c23347.f75016;
        float m2933 = c07692 != null ? c07692.m2933(this) : 0.0f;
        float m2929 = c23347.f75014.m2929(this);
        float f = m2932 - m2929;
        float f2 = m2933 - m2929;
        float f3 = m2932 + m2929;
        float f4 = m2933 + m2929;
        if (c23347.f57590 == null) {
            float f5 = 2.0f * m2929;
            c23347.f57590 = new C16997(f, f2, f5, f5);
        }
        float f6 = 0.5522848f * m2929;
        Path path = new Path();
        path.moveTo(m2932, f2);
        float f7 = m2932 + f6;
        float f8 = m2933 - f6;
        path.cubicTo(f7, f2, f3, f8, f3, m2933);
        float f9 = m2933 + f6;
        path.cubicTo(f3, f9, f7, f4, m2932, f4);
        float f10 = m2932 - f6;
        path.cubicTo(f10, f4, f, f9, f, m2933);
        path.cubicTo(f, f8, f10, f2, m2932, f2);
        path.close();
        return path;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Path m42854(C15585 c15585) {
        C0769 c0769 = c15585.f48016;
        float m2932 = c0769 != null ? c0769.m2932(this) : 0.0f;
        C0769 c07692 = c15585.f48017;
        float m2933 = c07692 != null ? c07692.m2933(this) : 0.0f;
        float m29322 = c15585.f48014.m2932(this);
        float m29332 = c15585.f48015.m2933(this);
        float f = m2932 - m29322;
        float f2 = m2933 - m29332;
        float f3 = m2932 + m29322;
        float f4 = m2933 + m29332;
        if (c15585.f57590 == null) {
            c15585.f57590 = new C16997(f, f2, m29322 * 2.0f, 2.0f * m29332);
        }
        float f5 = m29322 * 0.5522848f;
        float f6 = 0.5522848f * m29332;
        Path path = new Path();
        path.moveTo(m2932, f2);
        float f7 = m2932 + f5;
        float f8 = m2933 - f6;
        float f9 = m2933;
        path.cubicTo(f7, f2, f3, f8, f3, f9);
        float f10 = f6 + m2933;
        path.cubicTo(f3, f10, f7, f4, m2932, f4);
        float f11 = m2932 - f5;
        path.cubicTo(f11, f4, f, f10, f, f9);
        path.cubicTo(f, f8, f11, f2, m2932, f2);
        path.close();
        return path;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Path m42852(C9943 c9943) {
        Path path = new Path();
        float[] fArr = c9943.f30025;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = c9943.f30025;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (c9943 instanceof C5709) {
            path.close();
        }
        if (c9943.f57590 == null) {
            c9943.f57590 = m42860(path);
        }
        return path;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42874(C12059 c12059, String str) {
        AbstractC19261 m38398 = c12059.f16090.m38398(str);
        if (m38398 == null || !(m38398 instanceof C12059) || m38398 == c12059) {
            return;
        }
        C12059 c120592 = (C12059) m38398;
        if (c12059.f36072 == null) {
            c12059.f36072 = c120592.f36072;
        }
        if (c12059.f36071 == null) {
            c12059.f36071 = c120592.f36071;
        }
        if (c12059.f36070 == null) {
            c12059.f36070 = c120592.f36070;
        }
        if (c12059.f36075 == null) {
            c12059.f36075 = c120592.f36075;
        }
        if (c12059.f36076 == null) {
            c12059.f36076 = c120592.f36076;
        }
        if (c12059.f36073 == null) {
            c12059.f36073 = c120592.f36073;
        }
        if (c12059.f36074 == null) {
            c12059.f36074 = c120592.f36074;
        }
        if (c12059.f48531.isEmpty()) {
            c12059.f48531 = c120592.f48531;
        }
        if (c12059.f68869 == null) {
            c12059.f68869 = c120592.f68869;
        }
        if (c12059.f24627 == null) {
            c12059.f24627 = c120592.f24627;
        }
        String str2 = c120592.f36069;
        if (str2 != null) {
            m42874(c12059, str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42882(C21232 c21232, C16997 c16997) {
        float f;
        float f2;
        Boolean bool = c21232.f68441;
        if (bool != null && bool.booleanValue()) {
            C0769 c0769 = c21232.f68438;
            f = c0769 != null ? c0769.m2932(this) : c16997.f52134;
            C0769 c07692 = c21232.f68439;
            f2 = c07692 != null ? c07692.m2933(this) : c16997.f52131;
        } else {
            C0769 c07693 = c21232.f68438;
            float m2930 = c07693 != null ? c07693.m2930(this, 1.0f) : 1.2f;
            C0769 c07694 = c21232.f68439;
            float m29302 = c07694 != null ? c07694.m2930(this, 1.0f) : 1.2f;
            f = m2930 * c16997.f52134;
            f2 = m29302 * c16997.f52131;
        }
        if (f == 0.0f || f2 == 0.0f) {
            return;
        }
        m42887();
        C8552 m42859 = m42859((AbstractC19261) c21232);
        this.f57191 = m42859;
        m42859.f26151.f66598 = Float.valueOf(1.0f);
        boolean m42885 = m42885();
        Canvas canvas = this.f57197;
        canvas.save();
        Boolean bool2 = c21232.f68440;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c16997.f52132, c16997.f52133);
            canvas.scale(c16997.f52134, c16997.f52131);
        }
        m42877((AbstractC15731) c21232, false);
        canvas.restore();
        if (m42885) {
            m42878(c16997);
        }
        m42897();
    }
}
