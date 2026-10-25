package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.simpleframework.xml.strategy.Name;

/* compiled from: P1H0 */
/* renamed from: l.۬᩻֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class LayoutInflaterFactory2C13437 implements LayoutInflater.Factory2 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC5180 f40151;

    public LayoutInflaterFactory2C13437(AbstractC5180 abstractC5180) {
        this.f40151 = abstractC5180;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C5885 m14922;
        boolean equals = C21905.class.getName().equals(str);
        AbstractC5180 abstractC5180 = this.f40151;
        if (equals) {
            return new C21905(context, attributeSet, abstractC5180);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16693.f51230);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null && C20494.m46959(context.getClassLoader(), attributeValue)) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                ComponentCallbacksC9205 m14862 = resourceId != -1 ? abstractC5180.m14862(resourceId) : null;
                if (m14862 == null && string != null) {
                    m14862 = abstractC5180.m14899(string);
                }
                if (m14862 == null && id != -1) {
                    m14862 = abstractC5180.m14862(id);
                }
                if (m14862 == null) {
                    C20494 m14889 = abstractC5180.m14889();
                    context.getClassLoader();
                    m14862 = m14889.mo41848(attributeValue);
                    m14862.mFromLayout = true;
                    m14862.mFragmentId = resourceId != 0 ? resourceId : id;
                    m14862.mContainerId = id;
                    m14862.mTag = string;
                    m14862.mInLayout = true;
                    m14862.mFragmentManager = abstractC5180;
                    m14862.mHost = abstractC5180.m14893();
                    m14862.onInflate(abstractC5180.m14893().m14435(), attributeSet, m14862.mSavedFragmentState);
                    m14922 = abstractC5180.m14861(m14862);
                    if (AbstractC5180.m14853(2)) {
                        m14862.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (m14862.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    m14862.mInLayout = true;
                    m14862.mFragmentManager = abstractC5180;
                    m14862.mHost = abstractC5180.m14893();
                    m14862.onInflate(abstractC5180.m14893().m14435(), attributeSet, m14862.mSavedFragmentState);
                    m14922 = abstractC5180.m14922(m14862);
                    if (AbstractC5180.m14853(2)) {
                        m14862.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C23232.m51537(m14862, viewGroup);
                m14862.mContainer = viewGroup;
                m14922.m16481();
                m14922.m16479();
                View view2 = m14862.mView;
                if (view2 == null) {
                    throw new IllegalStateException(C4860.m14172("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m14862.mView.getTag() == null) {
                    m14862.mView.setTag(string);
                }
                m14862.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3560(this, m14922));
                return m14862.mView;
            }
        }
        return null;
    }
}
