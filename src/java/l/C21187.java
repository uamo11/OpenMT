package l;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: 560O */
/* renamed from: l.᩷᩺ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21187 extends AbstractC4253 implements Animatable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Drawable.Callback f68284;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Animator.AnimatorListener f68285;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Context f68286;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f68287;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C24008 f68288;

    public C21187(Context context, int i) {
        this.f68285 = null;
        this.f68287 = null;
        this.f68284 = new C17658(this);
        this.f68286 = context;
        this.f68288 = new C24008();
    }

    public C21187() {
        this(null, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21187 m48133(Context context, int i) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            C21187 c21187 = new C21187(context, 0);
            Drawable m13097 = C4369.m13097(context.getResources(), i, context.getTheme());
            c21187.f13777 = m13097;
            m13097.setCallback(c21187.f68284);
            new C7075(c21187.f13777.getConstantState());
            return c21187;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return m48134(context, context.getResources(), xml, asAttributeSet, context.getTheme());
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21187 m48134(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        C21187 c21187 = new C21187(context, 0);
        c21187.inflate(resources, xmlResourceParser, attributeSet, theme);
        return c21187;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f13777 == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C7075(this.f13777.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f68288.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C24008 c24008 = this.f68288;
        c24008.f77810.draw(canvas);
        if (c24008.f77807.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f68288.f77810.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f68288.f77810.setState(iArr);
    }

    @Override // l.AbstractC4253, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f68288.f77810.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f68288.f77810.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f68288.f77810.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f68288.f77810.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return C8184.m21685(drawable);
        }
        return this.f68288.f77810.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21683(drawable, i);
        } else {
            this.f68288.f77810.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21676(drawable, colorStateList);
        } else {
            this.f68288.f77810.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21679(drawable, mode);
        } else {
            this.f68288.f77810.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f68288.f77810.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f68288.f77810.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f68288.f77810.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f68288.f77810.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f68288.f77810.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f68288.f77810.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f68288.f77810.setAutoMirrored(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b1, code lost:
    
        if (r3.f77807 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b3, code lost:
    
        r3.f77807 = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ba, code lost:
    
        r3.f77807.playTogether(r3.f77808);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c1, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f13777
            if (r0 == 0) goto L8
            l.C8184.m21678(r0, r8, r9, r10, r11)
            return
        L8:
            int r0 = r9.getEventType()
            int r1 = r9.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            l.᩻᩺ۧ r3 = r7.f68288
            if (r0 == r2) goto Laf
            int r4 = r9.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Laf
        L1f:
            r4 = 2
            if (r0 != r4) goto La9
            java.lang.String r0 = r9.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L55
            int[] r0 = l.C11309.f33846
            android.content.res.TypedArray r0 = l.C2958.m9019(r8, r11, r10, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L51
            l.᩹᩺ۧ r4 = l.C22597.m50571(r8, r4, r11)
            r4.m50575()
            android.graphics.drawable.Drawable$Callback r5 = r7.f68284
            r4.setCallback(r5)
            l.᩹᩺ۧ r5 = r3.f77810
            if (r5 == 0) goto L4f
            r6 = 0
            r5.setCallback(r6)
        L4f:
            r3.f77810 = r4
        L51:
            r0.recycle()
            goto La9
        L55:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto La9
            int[] r0 = l.C11309.f33850
            android.content.res.TypedArray r0 = r8.obtainAttributes(r10, r0)
            java.lang.String r4 = r0.getString(r5)
            int r5 = r0.getResourceId(r2, r5)
            if (r5 == 0) goto La6
            android.content.Context r6 = r7.f68286
            if (r6 == 0) goto L9b
            android.animation.Animator r5 = l.C9192.m23621(r6, r5)
            l.᩹᩺ۧ r6 = r3.f77810
            java.lang.Object r6 = r6.m50574(r4)
            r5.setTarget(r6)
            java.util.ArrayList r6 = r3.f77808
            if (r6 != 0) goto L90
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r3.f77808 = r6
            l.ۖ᩵ r6 = new l.ۖ᩵
            r6.<init>()
            r3.f77809 = r6
        L90:
            java.util.ArrayList r6 = r3.f77808
            r6.add(r5)
            l.ۖ᩵ r3 = r3.f77809
            r3.put(r5, r4)
            goto La6
        L9b:
            r0.recycle()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Context can't be null when inflating animators"
            r8.<init>(r9)
            throw r8
        La6:
            r0.recycle()
        La9:
            int r0 = r9.next()
            goto L12
        Laf:
            android.animation.AnimatorSet r8 = r3.f77807
            if (r8 != 0) goto Lba
            android.animation.AnimatorSet r8 = new android.animation.AnimatorSet
            r8.<init>()
            r3.f77807 = r8
        Lba:
            android.animation.AnimatorSet r8 = r3.f77807
            java.util.ArrayList r9 = r3.f77808
            r8.playTogether(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21187.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // l.AbstractC4253, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            C8184.m21677(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return C8184.m21680(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f68288.f77807.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C24008 c24008 = this.f68288;
        if (c24008.f77807.isStarted()) {
            return;
        }
        c24008.f77807.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f68288.f77807.end();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48135(AbstractC18364 abstractC18364) {
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(abstractC18364.getPlatformCallback());
            return;
        }
        if (abstractC18364 == null) {
            return;
        }
        if (this.f68287 == null) {
            this.f68287 = new ArrayList();
        }
        if (this.f68287.contains(abstractC18364)) {
            return;
        }
        this.f68287.add(abstractC18364);
        if (this.f68285 == null) {
            this.f68285 = new C14835(this);
        }
        this.f68288.f77807.addListener(this.f68285);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48136(AbstractC18364 abstractC18364) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f13777;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(abstractC18364.getPlatformCallback());
        }
        ArrayList arrayList = this.f68287;
        if (arrayList == null || abstractC18364 == null) {
            return;
        }
        arrayList.remove(abstractC18364);
        if (this.f68287.size() != 0 || (animatorListener = this.f68285) == null) {
            return;
        }
        this.f68288.f77807.removeListener(animatorListener);
        this.f68285 = null;
    }
}
