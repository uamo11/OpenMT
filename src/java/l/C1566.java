package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: K22K */
/* renamed from: l.֫ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1566 {

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static C1566 f5524;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3432 f5526;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f5527 = new WeakHashMap(0);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public WeakHashMap f5528;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f5529;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C13309 f5530;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC13519 f5531;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public TypedValue f5532;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final PorterDuff.Mode f5525 = PorterDuff.Mode.SRC_IN;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C5759 f5523 = new C5759(6);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized Drawable m5348(Context context, long j) {
        C5549 c5549 = (C5549) this.f5527.get(context);
        if (c5549 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c5549.m15697(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c5549.m15698(j);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m5350(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C5549 c5549 = (C5549) this.f5527.get(context);
            if (c5549 == null) {
                c5549 = new C5549();
                this.f5527.put(context, c5549);
            }
            c5549.m15696(j, new WeakReference(constantState));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m5358(Context context) {
        C5549 c5549 = (C5549) this.f5527.get(context);
        if (c5549 != null) {
            c5549.m15694();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m5359(InterfaceC13519 interfaceC13519) {
        this.f5531 = interfaceC13519;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized ColorStateList m5360(Context context, int i) {
        ColorStateList colorStateList;
        C13309 c13309;
        WeakHashMap weakHashMap = this.f5528;
        ColorStateList colorStateList2 = null;
        colorStateList = (weakHashMap == null || (c13309 = (C13309) weakHashMap.get(context)) == null) ? null : (ColorStateList) c13309.m32284(i, (Integer) null);
        if (colorStateList == null) {
            InterfaceC13519 interfaceC13519 = this.f5531;
            if (interfaceC13519 != null) {
                colorStateList2 = ((C10199) interfaceC13519).m25599(context, i);
            }
            if (colorStateList2 != null) {
                if (this.f5528 == null) {
                    this.f5528 = new WeakHashMap();
                }
                C13309 c133092 = (C13309) this.f5528.get(context);
                if (c133092 == null) {
                    c133092 = new C13309();
                    this.f5528.put(context, c133092);
                }
                c133092.m32286(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized PorterDuffColorFilter m5347(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1566.class) {
            C5759 c5759 = f5523;
            c5759.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c5759.m4553(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized C1566 m5349() {
        C1566 c1566;
        synchronized (C1566.class) {
            if (f5524 == null) {
                C1566 c15662 = new C1566();
                f5524 = c15662;
                m5353(c15662);
            }
            c1566 = f5524;
        }
        return c1566;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5353(C1566 c1566) {
        if (Build.VERSION.SDK_INT < 24) {
            c1566.m5352("vector", new C7170());
            c1566.m5352("animated-vector", new C9993());
            c1566.m5352("animated-selector", new C12109());
            c1566.m5352("drawable", new C11404());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Drawable m5356(Context context, int i) {
        return m5357(context, i, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private Drawable m5354(Context context, int i) {
        if (this.f5532 == null) {
            this.f5532 = new TypedValue();
        }
        TypedValue typedValue = this.f5532;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable m5348 = m5348(context, j);
        if (m5348 != null) {
            return m5348;
        }
        InterfaceC13519 interfaceC13519 = this.f5531;
        LayerDrawable m25600 = interfaceC13519 == null ? null : ((C10199) interfaceC13519).m25600(this, context, i);
        if (m25600 != null) {
            m25600.setChangingConfigurations(typedValue.changingConfigurations);
            m5350(context, j, m25600);
        }
        return m25600;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r11.f5526.getOrDefault(r0, null) != null) goto L15;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.drawable.Drawable m5355(android.content.Context r12, int r13) {
        /*
            r11 = this;
            l.ۗ᩵ r0 = r11.f5526
            r1 = 0
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb2
            l.۬᩵ r0 = r11.f5530
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L29
            java.lang.Object r0 = r0.m32284(r13, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto Lb2
            if (r0 == 0) goto L30
            l.ۗ᩵ r3 = r11.f5526
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L30
            goto Lb2
        L29:
            l.۬᩵ r0 = new l.۬᩵
            r0.<init>()
            r11.f5530 = r0
        L30:
            android.util.TypedValue r0 = r11.f5532
            if (r0 != 0) goto L3b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r11.f5532 = r0
        L3b:
            android.util.TypedValue r0 = r11.f5532
            android.content.res.Resources r3 = r12.getResources()
            r4 = 1
            r3.getValue(r13, r0, r4)
            int r5 = r0.assetCookie
            long r5 = (long) r5
            r7 = 32
            long r5 = r5 << r7
            int r7 = r0.data
            long r7 = (long) r7
            long r5 = r5 | r7
            android.graphics.drawable.Drawable r7 = r11.m5348(r12, r5)
            if (r7 == 0) goto L56
            return r7
        L56:
            java.lang.CharSequence r8 = r0.string
            if (r8 == 0) goto Laa
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = ".xml"
            boolean r8 = r8.endsWith(r9)
            if (r8 == 0) goto Laa
            android.content.res.XmlResourceParser r3 = r3.getXml(r13)     // Catch: java.lang.Exception -> La0
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r3)     // Catch: java.lang.Exception -> La0
        L6e:
            int r9 = r3.next()     // Catch: java.lang.Exception -> La0
            r10 = 2
            if (r9 == r10) goto L78
            if (r9 == r4) goto L78
            goto L6e
        L78:
            if (r9 != r10) goto La2
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Exception -> La0
            l.۬᩵ r9 = r11.f5530     // Catch: java.lang.Exception -> La0
            r9.m32286(r13, r4)     // Catch: java.lang.Exception -> La0
            l.ۗ᩵ r9 = r11.f5526     // Catch: java.lang.Exception -> La0
            java.lang.Object r1 = r9.getOrDefault(r4, r1)     // Catch: java.lang.Exception -> La0
            l.᩺ۖ r1 = (l.InterfaceC22692) r1     // Catch: java.lang.Exception -> La0
            if (r1 == 0) goto L95
            android.content.res.Resources$Theme r4 = r12.getTheme()     // Catch: java.lang.Exception -> La0
            android.graphics.drawable.Drawable r7 = r1.mo19194(r12, r3, r8, r4)     // Catch: java.lang.Exception -> La0
        L95:
            if (r7 == 0) goto Laa
            int r0 = r0.changingConfigurations     // Catch: java.lang.Exception -> La0
            r7.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> La0
            r11.m5350(r12, r5, r7)     // Catch: java.lang.Exception -> La0
            goto Laa
        La0:
            goto Laa
        La2:
            org.xmlpull.v1.XmlPullParserException r12 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> La0
            java.lang.String r0 = "No start tag found"
            r12.<init>(r0)     // Catch: java.lang.Exception -> La0
            throw r12     // Catch: java.lang.Exception -> La0
        Laa:
            if (r7 != 0) goto Lb1
            l.۬᩵ r12 = r11.f5530
            r12.m32286(r13, r2)
        Lb1:
            return r7
        Lb2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1566.m5355(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5352(String str, InterfaceC22692 interfaceC22692) {
        if (this.f5526 == null) {
            this.f5526 = new C3432();
        }
        this.f5526.put(str, interfaceC22692);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5351(Drawable drawable, C5800 c5800, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c5800.f17836;
            if (z || c5800.f17837) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z ? c5800.f17838 : null;
                PorterDuff.Mode mode = c5800.f17837 ? c5800.f17839 : f5525;
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = m5347(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        l.C8184.m21679(r1, r4);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable m5357(android.content.Context r6, int r7, boolean r8) {
        /*
            r5 = this;
            r0 = r5
            monitor-enter(r0)
            boolean r1 = r5.f5529     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L9
            goto L28
        L9:
            r5.f5529 = r3     // Catch: java.lang.Throwable -> L8e
            r1 = 2131230838(0x7f080076, float:1.807774E38)
            android.graphics.drawable.Drawable r1 = r5.m5356(r6, r1)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L84
            boolean r3 = r1 instanceof l.C22597     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L28
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L84
        L28:
            android.graphics.drawable.Drawable r1 = r5.m5355(r6, r7)     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L32
            android.graphics.drawable.Drawable r1 = r5.m5354(r6, r7)     // Catch: java.lang.Throwable -> L8e
        L32:
            if (r1 != 0) goto L38
            android.graphics.drawable.Drawable r1 = l.C0881.m3234(r6, r7)     // Catch: java.lang.Throwable -> L8e
        L38:
            if (r1 == 0) goto L7d
            android.content.res.ColorStateList r3 = r5.m5360(r6, r7)     // Catch: java.lang.Throwable -> L8e
            r4 = 0
            if (r3 == 0) goto L5e
            android.graphics.drawable.Drawable r6 = r1.mutate()     // Catch: java.lang.Throwable -> L8e
            android.graphics.drawable.Drawable r1 = l.C8184.m21684(r6)     // Catch: java.lang.Throwable -> L8e
            l.C8184.m21676(r1, r3)     // Catch: java.lang.Throwable -> L8e
            l.ܰۖ r6 = r5.f5531     // Catch: java.lang.Throwable -> L8e
            if (r6 != 0) goto L51
            goto L58
        L51:
            r6 = 2131230825(0x7f080069, float:1.8077714E38)
            if (r7 != r6) goto L58
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Throwable -> L8e
        L58:
            if (r4 == 0) goto L7d
            l.C8184.m21679(r1, r4)     // Catch: java.lang.Throwable -> L8e
            goto L7d
        L5e:
            l.ܰۖ r3 = r5.f5531     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L6b
            l.ۤۢ r3 = (l.C10199) r3     // Catch: java.lang.Throwable -> L8e
            boolean r3 = r3.m25601(r6, r7, r1)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L6b
            goto L7d
        L6b:
            l.ܰۖ r3 = r5.f5531     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L78
            l.ۤۢ r3 = (l.C10199) r3     // Catch: java.lang.Throwable -> L8e
            boolean r6 = r3.m25602(r6, r7, r1)     // Catch: java.lang.Throwable -> L8e
            if (r6 == 0) goto L78
            r2 = 1
        L78:
            if (r2 != 0) goto L7d
            if (r8 == 0) goto L7d
            r1 = r4
        L7d:
            if (r1 == 0) goto L82
            l.C15320.m36347(r1)     // Catch: java.lang.Throwable -> L8e
        L82:
            monitor-exit(r0)
            return r1
        L84:
            r5.f5529 = r2     // Catch: java.lang.Throwable -> L8e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r6     // Catch: java.lang.Throwable -> L8e
        L8e:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1566.m5357(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
