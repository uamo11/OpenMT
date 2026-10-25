package l;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: U9SC */
/* renamed from: l.᩺᩷ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23239 extends BaseAdapter {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f74667;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1742 f74668;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f74669;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f74670;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f74671 = new ArrayList();

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C23239(C1742 c1742) {
        ArrayList arrayList;
        this.f74668 = c1742;
        arrayList = C1742.f6021;
        this.f74669 = arrayList;
        float[] fArr = new float[3];
        C7466.m20004(C21943.f70257, fArr);
        fArr[2] = fArr[2] * 1.2f;
        this.f74667 = Color.HSVToColor(fArr);
        C7466.m20004(C21943.f70284, fArr);
        fArr[2] = C21943.m49423(1.2f, 0.95f) * fArr[2];
        this.f74670 = Color.HSVToColor(fArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51563(String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (str == null || str.isEmpty()) {
            arrayList = C1742.f6021;
            this.f74669 = arrayList;
            notifyDataSetChanged();
            return;
        }
        ArrayList arrayList3 = this.f74671;
        arrayList3.clear();
        arrayList2 = C1742.f6021;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C7717 c7717 = (C7717) it.next();
            if (C9679.m24616(c7717.f23850, (CharSequence) str) || C9679.m24616(c7717.f23849, (CharSequence) str)) {
                arrayList3.add(new C7717(c7717.f23850, c7717.f23849, str, this.f74667, this.f74670));
            }
        }
        this.f74669 = arrayList3;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f74669.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C14066 c14066;
        ListView listView;
        if (view != null) {
            c14066 = (C14066) view.getTag();
        } else {
            view = C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d015d, viewGroup, false);
            c14066 = new C14066();
            c14066.f42493 = (TextView) view.findViewById(R.id.textView);
            c14066.f42492 = (TextView) view.findViewById(R.id.textView2);
            view.setTag(c14066);
        }
        C7717 c7717 = (C7717) this.f74669.get(i);
        c14066.f42493.setText(c7717.f23850);
        c14066.f42492.setText(c7717.f23849);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        listView = this.f74668.f6023;
        int width = listView.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
