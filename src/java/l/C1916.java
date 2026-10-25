package l;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.widget.TextView;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: S566 */
/* renamed from: l.֫ܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C1916 {

    /* renamed from: ֡ܳ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f6442;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6443;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView f6444;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C5800 f6445;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Typeface f6447;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8972 f6448;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5800 f6449;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5800 f6451;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5800 f6452;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5800 f6453;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C5800 f6454;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C5800 f6455;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f6450 = 0;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f6446 = -1;

    /* renamed from: ֡ۨܽ, reason: not valid java name and contains not printable characters */
    public static void m6295(Object obj, int i) {
        ((C19258) obj).m44416(i);
    }

    /* renamed from: ֨᩹۟, reason: not valid java name and contains not printable characters */
    public static long m6296(Object obj) {
        return ((C3545) obj).getSize();
    }

    /* renamed from: ۖۧܶ, reason: not valid java name and contains not printable characters */
    public static Window m6300(Object obj) {
        return ((Activity) obj).getWindow();
    }

    /* renamed from: ۙ᩵ۜ, reason: not valid java name and contains not printable characters */
    public static MenuItem m6301(Object obj, int i) {
        return ((Menu) obj).findItem(i);
    }

    /* renamed from: ۚ۬᩻, reason: not valid java name and contains not printable characters */
    public static void m6302(Object obj) {
        ((InterfaceC13049) obj).apply();
    }

    /* renamed from: ۟ۡܿ, reason: not valid java name and contains not printable characters */
    public static String m6303(Object obj) {
        return C14460.m34531((byte[]) obj);
    }

    /* renamed from: ܰ᩷᩷, reason: not valid java name and contains not printable characters */
    public static byte m6304(Object obj) {
        return ((C12951) obj).readByte();
    }

    /* renamed from: ܶۖ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m6305(Object obj) {
        return ((AbstractC15440) obj).mo23119();
    }

    /* renamed from: ܺᩳۤ, reason: not valid java name and contains not printable characters */
    public static void m6306(Object obj) {
        ((Closeable) obj).close();
    }

    /* renamed from: ܽۚ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m6307(Object obj, Object obj2) {
        return ((ArrayList) obj).add(obj2);
    }

    /* renamed from: ܽᩴ֨, reason: not valid java name and contains not printable characters */
    public static int m6308() {
        return -1026826572;
    }

    /* renamed from: ᩴܽᩴ, reason: not valid java name and contains not printable characters */
    public static String m6309(Object obj, Object obj2) {
        return ((BaseBundle) obj).getString((String) obj2);
    }

    /* renamed from: ᩵ۛۙ, reason: not valid java name and contains not printable characters */
    public static int m6310(Object obj) {
        return ((AtomicInteger) obj).incrementAndGet();
    }

    /* renamed from: ᩶֡ۤ, reason: not valid java name and contains not printable characters */
    public static String m6311(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ᩹֫ܳ, reason: not valid java name and contains not printable characters */
    public static void m6312(Object obj) {
        ((C7744) obj).close();
    }

    /* renamed from: ᩺ۜ۠, reason: not valid java name and contains not printable characters */
    public static boolean m6313(Object obj) {
        return ((String) obj).isEmpty();
    }

    public C1916(TextView textView) {
        this.f6444 = textView;
        this.f6448 = new C8972(textView);
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6321(android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1916.m6321(android.util.AttributeSet, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6298(Context context, C22733 c22733) {
        String m50807;
        this.f6450 = c22733.m50809(2, this.f6450);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int m50809 = c22733.m50809(11, -1);
            this.f6446 = m50809;
            if (m50809 != -1) {
                this.f6450 &= 2;
            }
        }
        if (c22733.m50802(10) || c22733.m50802(12)) {
            this.f6447 = null;
            int i2 = c22733.m50802(12) ? 12 : 10;
            int i3 = this.f6446;
            int i4 = this.f6450;
            if (!context.isRestricted()) {
                try {
                    Typeface m50800 = c22733.m50800(i2, this.f6450, new C10178(this, i3, i4, new WeakReference(this.f6444)));
                    if (m50800 != null) {
                        if (i >= 28 && this.f6446 != -1) {
                            this.f6447 = C7355.m19712(Typeface.create(m50800, 0), this.f6446, (this.f6450 & 2) != 0);
                        } else {
                            this.f6447 = m50800;
                        }
                    }
                    this.f6443 = this.f6447 == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f6447 != null || (m50807 = c22733.m50807(i2)) == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && this.f6446 != -1) {
                this.f6447 = C7355.m19712(Typeface.create(m50807, 0), this.f6446, (this.f6450 & 2) != 0);
                return;
            } else {
                this.f6447 = Typeface.create(m50807, this.f6450);
                return;
            }
        }
        if (c22733.m50802(1)) {
            this.f6443 = false;
            int m508092 = c22733.m50809(1, 1);
            if (m508092 == 1) {
                this.f6447 = Typeface.SANS_SERIF;
            } else if (m508092 == 2) {
                this.f6447 = Typeface.SERIF;
            } else {
                if (m508092 != 3) {
                    return;
                }
                this.f6447 = Typeface.MONOSPACE;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6322(WeakReference weakReference, Typeface typeface) {
        if (this.f6443) {
            this.f6447 = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC5944(textView, typeface, this.f6450));
                } else {
                    textView.setTypeface(typeface, this.f6450);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6318(Context context, int i) {
        String m50807;
        ColorStateList m50804;
        ColorStateList m508042;
        ColorStateList m508043;
        C22733 m50794 = C22733.m50794(context, i, C3390.f10698);
        if (m50794.m50802(14)) {
            m6323(m50794.m50801(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        TextView textView = this.f6444;
        if (i2 < 23) {
            if (m50794.m50802(3) && (m508043 = m50794.m50804(3)) != null) {
                textView.setTextColor(m508043);
            }
            if (m50794.m50802(5) && (m508042 = m50794.m50804(5)) != null) {
                textView.setLinkTextColor(m508042);
            }
            if (m50794.m50802(4) && (m50804 = m50794.m50804(4)) != null) {
                textView.setHintTextColor(m50804);
            }
        }
        if (m50794.m50802(0) && m50794.m50803(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m6298(context, m50794);
        if (i2 >= 26 && m50794.m50802(13) && (m50807 = m50794.m50807(13)) != null) {
            C13704.m32955(textView, m50807);
        }
        m50794.m50813();
        Typeface typeface = this.f6447;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f6450);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6323(boolean z) {
        this.f6444.setAllCaps(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6314() {
        C5800 c5800 = this.f6452;
        TextView textView = this.f6444;
        if (c5800 != null || this.f6454 != null || this.f6449 != null || this.f6451 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m6299(compoundDrawables[0], this.f6452);
            m6299(compoundDrawables[1], this.f6454);
            m6299(compoundDrawables[2], this.f6449);
            m6299(compoundDrawables[3], this.f6451);
        }
        if (this.f6455 == null && this.f6453 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m6299(compoundDrawablesRelative[0], this.f6455);
        m6299(compoundDrawablesRelative[2], this.f6453);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6299(Drawable drawable, C5800 c5800) {
        if (drawable == null || c5800 == null) {
            return;
        }
        int[] drawableState = this.f6444.getDrawableState();
        int i = C5965.f18296;
        C1566.m5351(drawable, c5800, drawableState);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5800 m6297(Context context, C5965 c5965, int i) {
        ColorStateList m16705 = c5965.m16705(context, i);
        if (m16705 == null) {
            return null;
        }
        C5800 c5800 = new C5800();
        c5800.f17836 = true;
        c5800.f17838 = m16705;
        return c5800;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6316(int i, float f) {
        if (C22461.f72739) {
            return;
        }
        C8972 c8972 = this.f6448;
        if (c8972.m23180()) {
            return;
        }
        c8972.m23170(f, i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6327() {
        this.f6448.m23169();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m6326() {
        return this.f6448.m23180();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6315(int i) {
        this.f6448.m23171(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6317(int i, int i2, int i3, int i4) {
        this.f6448.m23172(i, i2, i3, i4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6324(int[] iArr, int i) {
        this.f6448.m23174(iArr, i);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m6333() {
        return this.f6448.m23176();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m6330() {
        return this.f6448.m23179();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m6331() {
        return this.f6448.m23177();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m6329() {
        return this.f6448.m23175();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] m6328() {
        return this.f6448.m23178();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m6325() {
        C5800 c5800 = this.f6445;
        if (c5800 != null) {
            return c5800.f17838;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6319(ColorStateList colorStateList) {
        if (this.f6445 == null) {
            this.f6445 = new C5800();
        }
        C5800 c5800 = this.f6445;
        c5800.f17838 = colorStateList;
        c5800.f17836 = colorStateList != null;
        this.f6452 = c5800;
        this.f6454 = c5800;
        this.f6449 = c5800;
        this.f6451 = c5800;
        this.f6455 = c5800;
        this.f6453 = c5800;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m6332() {
        C5800 c5800 = this.f6445;
        if (c5800 != null) {
            return c5800.f17839;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6320(PorterDuff.Mode mode) {
        if (this.f6445 == null) {
            this.f6445 = new C5800();
        }
        C5800 c5800 = this.f6445;
        c5800.f17839 = mode;
        c5800.f17837 = mode != null;
        this.f6452 = c5800;
        this.f6454 = c5800;
        this.f6449 = c5800;
        this.f6451 = c5800;
        this.f6455 = c5800;
        this.f6453 = c5800;
    }
}
