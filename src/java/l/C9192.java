package l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: 84NK */
/* renamed from: l.ۡ᩺ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9192 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23625(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Animator m23621(Context context, int i) {
        XmlResourceParser animation;
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                animation = resources.getAnimation(i);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        } catch (XmlPullParserException e2) {
            e = e2;
        }
        try {
            Animator m23622 = m23622(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0);
            animation.close();
            return m23622;
        } catch (IOException e3) {
            e = e3;
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (XmlPullParserException e4) {
            e = e4;
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i));
            notFoundException2.initCause(e);
            throw notFoundException2;
        } catch (Throwable th2) {
            th = th2;
            xmlResourceParser = animation;
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static PropertyValuesHolder m23623(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofFloat;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m23625(i4)) || (z2 && m23625(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            C17356[] m34679 = C14533.m34679(string);
            C17356[] m346792 = C14533.m34679(string2);
            if (m34679 != null || m346792 != null) {
                if (m34679 != null) {
                    C9898 c9898 = new C9898();
                    if (m346792 == null) {
                        return PropertyValuesHolder.ofObject(str, c9898, m34679);
                    }
                    if (C14533.m34677(m34679, m346792)) {
                        return PropertyValuesHolder.ofObject(str, c9898, m34679, m346792);
                    }
                    throw new InflateException(C19462.m44858(" Can't morph from ", string, " to ", string2));
                }
                if (m346792 != null) {
                    return PropertyValuesHolder.ofObject(str, new C9898(), m346792);
                }
            }
            return null;
        }
        C16246 m38211 = i == 3 ? C16246.m38211() : null;
        if (z3) {
            if (z) {
                float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                if (z2) {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                ofFloat = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m23625(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
            if (z2) {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m23625(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, dimension2);
            }
        } else if (z2) {
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m23625(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
        }
        if (propertyValuesHolder != null && m38211 != null) {
            propertyValuesHolder.setEvaluator(m38211);
        }
        return propertyValuesHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x038e, code lost:
    
        r1 = new android.animation.Animator[r20.size()];
        r2 = r20.iterator();
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x039d, code lost:
    
        if (r2.hasNext() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x039f, code lost:
    
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x03ab, code lost:
    
        if (r28 != 0) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x03ad, code lost:
    
        r27.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x03b0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x03b1, code lost:
    
        r27.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x03b4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0388, code lost:
    
        r20 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x038a, code lost:
    
        if (r27 == null) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x038c, code lost:
    
        if (r20 == null) goto L210;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0354 A[ADDED_TO_REGION] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator m23622(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) {
        /*
            Method dump skipped, instructions count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9192.m23622(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f9  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.ValueAnimator m23624(android.content.Context r19, android.content.res.Resources r20, android.content.res.Resources.Theme r21, android.util.AttributeSet r22, android.animation.ObjectAnimator r23, org.xmlpull.v1.XmlPullParser r24) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9192.m23624(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ObjectAnimator, org.xmlpull.v1.XmlPullParser):android.animation.ValueAnimator");
    }
}
