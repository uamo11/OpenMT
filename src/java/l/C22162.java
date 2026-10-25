package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: I8G2 */
/* renamed from: l.᩹۠ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22162 extends LinearLayout {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f71924;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f71925;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f71926;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final CheckedTextView f71927;

    public C22162(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C22162(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        ViewOnClickListenerC15105 viewOnClickListenerC15105 = new ViewOnClickListenerC15105(this);
        new C21507(getResources());
        new ArrayList();
        this.f71924 = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f71927 = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(bin.mt.plus.R.string.MT_Protector_res_0x7f120346);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC15105);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d011f, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f71926 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(bin.mt.plus.R.string.MT_Protector_res_0x7f120345);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC15105);
        addView(checkedTextView2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49799(C22162 c22162, View view) {
        CheckedTextView checkedTextView = c22162.f71926;
        HashMap hashMap = c22162.f71924;
        CheckedTextView checkedTextView2 = c22162.f71927;
        if (view == checkedTextView2) {
            c22162.f71925 = true;
            hashMap.clear();
        } else if (view == checkedTextView) {
            c22162.f71925 = false;
            hashMap.clear();
        } else {
            c22162.f71925 = false;
            Object tag = view.getTag();
            tag.getClass();
            throw null;
        }
        checkedTextView2.setChecked(c22162.f71925);
        checkedTextView.setChecked(!c22162.f71925 && hashMap.isEmpty());
        throw null;
    }
}
