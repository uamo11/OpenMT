package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import l.C19343;
import l.C22733;

/* loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C22733 m50795 = C22733.m50795(context, attributeSet, C19343.f61770);
        this.text = m50795.m50817(C19343.f61717);
        this.icon = m50795.m50815(C19343.f61610);
        this.customLayout = m50795.m50806(C19343.f61292, 0);
        m50795.m50813();
    }
}
