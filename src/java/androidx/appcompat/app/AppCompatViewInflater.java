package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import l.C10034;
import l.C10884;
import l.C12729;
import l.C14615;
import l.C15821;
import l.C16026;
import l.C17233;
import l.C17648;
import l.C17939;
import l.C20077;
import l.C20762;
import l.C21488;
import l.C22898;
import l.C3122;
import l.C3143;
import l.C3390;
import l.C3432;
import l.C4554;
import l.C9473;
import l.ViewOnClickListenerC21630;
import org.simpleframework.xml.strategy.Name;

/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public static final String LOG_TAG = "AppCompatViewInflater";
    public final Object[] mConstructorArgs = new Object[2];
    public static final Class[] sConstructorSignature = {Context.class, AttributeSet.class};
    public static final int[] sOnClickAttrs = {R.attr.onClick};
    public static final int[] sAccessibilityHeading = {R.attr.accessibilityHeading};
    public static final int[] sAccessibilityPaneTitle = {R.attr.accessibilityPaneTitle};
    public static final int[] sScreenReaderFocusable = {R.attr.screenReaderFocusable};
    public static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    public static final C3432 sConstructorMap = new C3432();

    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View createRatingBar;
        context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = m0(context2, attributeSet, z2, z3);
        }
        if (z4) {
            C10034.m25207(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                createRatingBar = createRatingBar(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "CheckedTextView":
                createRatingBar = createCheckedTextView(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "TextView":
                createRatingBar = createTextView(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "ImageButton":
                createRatingBar = createImageButton(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "SeekBar":
                createRatingBar = createSeekBar(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "Spinner":
                createRatingBar = createSpinner(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "RadioButton":
                createRatingBar = createRadioButton(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "ToggleButton":
                createRatingBar = createToggleButton(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "ImageView":
                createRatingBar = createImageView(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "AutoCompleteTextView":
                createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "CheckBox":
                createRatingBar = createCheckBox(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "EditText":
                createRatingBar = createEditText(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            case "Button":
                createRatingBar = createButton(context2, attributeSet);
                m5(createRatingBar, str);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (createRatingBar == null && context != context2) {
            createRatingBar = m1(context2, str, attributeSet);
        }
        if (createRatingBar != null) {
            m4(createRatingBar, attributeSet);
            m3(context2, createRatingBar, attributeSet);
        }
        return createRatingBar;
    }

    public C14615 createTextView(Context context, AttributeSet attributeSet) {
        return new C14615(context, attributeSet);
    }

    public C17939 createImageView(Context context, AttributeSet attributeSet) {
        return new C17939(context, attributeSet);
    }

    public C20077 createButton(Context context, AttributeSet attributeSet) {
        return new C20077(context, attributeSet);
    }

    public C22898 createEditText(Context context, AttributeSet attributeSet) {
        return new C22898(context, attributeSet);
    }

    public C3122 createSpinner(Context context, AttributeSet attributeSet) {
        return new C3122(context, attributeSet);
    }

    public C10884 createImageButton(Context context, AttributeSet attributeSet) {
        return new C10884(context, attributeSet);
    }

    public C4554 createCheckBox(Context context, AttributeSet attributeSet) {
        return new C4554(context, attributeSet);
    }

    public C20762 createRadioButton(Context context, AttributeSet attributeSet) {
        return new C20762(context, attributeSet);
    }

    public C3143 createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new C3143(context, attributeSet);
    }

    public C21488 createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C21488(context, attributeSet);
    }

    public C17233 createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new C17233(context, attributeSet);
    }

    public C9473 createRatingBar(Context context, AttributeSet attributeSet) {
        return new C9473(context, attributeSet);
    }

    public C15821 createSeekBar(Context context, AttributeSet attributeSet) {
        return new C15821(context, attributeSet);
    }

    public C16026 createToggleButton(Context context, AttributeSet attributeSet) {
        return new C16026(context, attributeSet);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private View m1(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, Name.LABEL);
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return m2(context, str, (String) null);
            }
            int i = 0;
            while (true) {
                String[] strArr = sClassPrefixList;
                if (i >= strArr.length) {
                    return null;
                }
                View m2 = m2(context, str, strArr[i]);
                if (m2 != null) {
                    return m2;
                }
                i++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.mConstructorArgs;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new ViewOnClickListenerC21630(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private View m2(Context context, String str, String str2) {
        String str3;
        C3432 c3432 = sConstructorMap;
        Constructor constructor = (Constructor) c3432.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(sConstructorSignature);
            c3432.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Context m0(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10709, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(0, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(4, 0);
        }
        obtainStyledAttributes.recycle();
        return (resourceId == 0 || ((context instanceof C12729) && ((C12729) context).m31025() == resourceId)) ? context : new C12729(context, resourceId);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (obtainStyledAttributes.hasValue(0)) {
            C17648.m41312(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (obtainStyledAttributes2.hasValue(0)) {
            C17648.m41305(view, (CharSequence) obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (obtainStyledAttributes3.hasValue(0)) {
            C17648.m41328(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }
}
