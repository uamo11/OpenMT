package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* compiled from: P1C9 */
/* renamed from: l.ܰܶ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13888 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f41395;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f41396;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f41397;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f41398;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f41399;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f41400;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC23061 f41401;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m33289(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC23061 m33292() {
        return this.f41401;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m33297() {
        int i = C11773.f35132[this.f41401.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float m33296() {
        switch (C11773.f35132[this.f41401.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f41400;
            case 4:
                return this.f41398;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f41395 ? 1.0f : 0.0f;
            case 7:
                return this.f41398;
            default:
                return Float.NaN;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33295(float[] fArr) {
        switch (C11773.f35132[this.f41401.ordinal()]) {
            case 1:
            case 2:
                int i = (this.f41396 >> 24) & 255;
                float pow = (float) Math.pow(((r0 >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((r0 >> 8) & 255) / 255.0f, 2.2d);
                float pow3 = (float) Math.pow((r0 & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = pow3;
                fArr[3] = i / 255.0f;
                return;
            case 3:
                fArr[0] = this.f41400;
                return;
            case 4:
                fArr[0] = this.f41398;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f41395 ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f41398;
                return;
            default:
                return;
        }
    }

    public C13888(C13888 c13888, Object obj) {
        this.f41399 = c13888.f41399;
        this.f41401 = c13888.f41401;
        m33294(obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33294(Object obj) {
        switch (C11773.f35132[this.f41401.ordinal()]) {
            case 1:
            case 2:
                this.f41396 = ((Integer) obj).intValue();
                break;
            case 3:
                this.f41400 = ((Integer) obj).intValue();
                break;
            case 4:
                this.f41398 = ((Float) obj).floatValue();
                break;
            case 5:
                this.f41397 = (String) obj;
                break;
            case 6:
                this.f41395 = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f41398 = ((Float) obj).floatValue();
                break;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33291(View view, HashMap hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            C13888 c13888 = (C13888) hashMap.get(str);
            String m46315 = C20094.m46315("set", str);
            try {
                try {
                    int i = C11773.f35132[c13888.f41401.ordinal()];
                    Class<?> cls2 = Integer.TYPE;
                    Class<?> cls3 = Float.TYPE;
                    switch (i) {
                        case 1:
                            cls.getMethod(m46315, cls2).invoke(view, Integer.valueOf(c13888.f41396));
                            break;
                        case 2:
                            Method method = cls.getMethod(m46315, Drawable.class);
                            ColorDrawable colorDrawable = new ColorDrawable();
                            colorDrawable.setColor(c13888.f41396);
                            method.invoke(view, colorDrawable);
                            break;
                        case 3:
                            cls.getMethod(m46315, cls2).invoke(view, Integer.valueOf(c13888.f41400));
                            break;
                        case 4:
                            cls.getMethod(m46315, cls3).invoke(view, Float.valueOf(c13888.f41398));
                            break;
                        case 5:
                            cls.getMethod(m46315, CharSequence.class).invoke(view, c13888.f41397);
                            break;
                        case 6:
                            cls.getMethod(m46315, Boolean.TYPE).invoke(view, Boolean.valueOf(c13888.f41395));
                            break;
                        case 7:
                            cls.getMethod(m46315, cls3).invoke(view, Float.valueOf(c13888.f41398));
                            break;
                    }
                } catch (NoSuchMethodException e) {
                    e.getMessage();
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33293(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder sb = new StringBuilder("set");
        String str = this.f41399;
        sb.append(str);
        String sb2 = sb.toString();
        try {
            int i = C11773.f35132[this.f41401.ordinal()];
            Class<?> cls2 = Integer.TYPE;
            Class<?> cls3 = Float.TYPE;
            switch (i) {
                case 1:
                    cls.getMethod(sb2, cls2).invoke(view, Integer.valueOf((m33289((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m33289((int) (fArr[3] * 255.0f)) << 24) | (m33289((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m33289((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(sb2, Drawable.class);
                    int m33289 = (m33289((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (m33289((int) (fArr[3] * 255.0f)) << 24) | (m33289((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | m33289((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(m33289);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(sb2, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(sb2, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + str);
                case 6:
                    cls.getMethod(sb2, Boolean.TYPE).invoke(view, Boolean.valueOf(fArr[0] > 0.5f));
                    return;
                case 7:
                    cls.getMethod(sb2, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException unused) {
            C0050.m933(view);
        } catch (NoSuchMethodException unused2) {
            C0050.m933(view);
        } catch (InvocationTargetException unused3) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33290(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        EnumC23061 enumC23061;
        Object string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69985);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        EnumC23061 enumC230612 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                enumC230612 = EnumC23061.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC23061 = EnumC23061.COLOR_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC23061 = EnumC23061.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    enumC23061 = EnumC23061.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    enumC23061 = EnumC23061.DIMENSION_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 5) {
                    enumC23061 = EnumC23061.FLOAT_TYPE;
                    string = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    enumC23061 = EnumC23061.INT_TYPE;
                    string = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                } else if (index == 8) {
                    enumC23061 = EnumC23061.STRING_TYPE;
                    string = obtainStyledAttributes.getString(index);
                }
                Object obj2 = string;
                enumC230612 = enumC23061;
                obj = obj2;
            }
        }
        if (str != null && obj != null) {
            C13888 c13888 = new C13888();
            c13888.f41399 = str;
            c13888.f41401 = enumC230612;
            c13888.m33294(obj);
            hashMap.put(str, c13888);
        }
        obtainStyledAttributes.recycle();
    }
}
