package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: X992 */
/* renamed from: l.ܳܽ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14656 extends BaseAdapter {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9719 f44788;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f44789;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f44790;

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    public C14656(C9719 c9719) {
        List list;
        this.f44788 = c9719;
        ArrayList arrayList = new ArrayList();
        this.f44790 = arrayList;
        list = c9719.f29425;
        arrayList.addAll(list);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34944(String str) {
        List list;
        List list2;
        String lowerCase = str.toLowerCase();
        this.f44789 = lowerCase;
        C9719 c9719 = this.f44788;
        ArrayList arrayList = this.f44790;
        if (lowerCase == null || lowerCase.isEmpty()) {
            arrayList.clear();
            list = c9719.f29425;
            arrayList.addAll(list);
            notifyDataSetChanged();
            return;
        }
        arrayList.clear();
        String str2 = this.f44789;
        list2 = c9719.f29425;
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            C21008 c21008 = (C21008) it.next();
            if (c21008.f67820.toLowerCase().contains(str2) || c21008.f67822.packageName.toLowerCase().contains(str2)) {
                arrayList.add(c21008);
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f44790.size();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        C23829 c23829;
        C9503 c9503;
        LinkedList linkedList;
        LinkedList linkedList2;
        if (view != null) {
            c23829 = (C23829) view.getTag();
        } else {
            view = C13540.m32583(viewGroup, R.layout.MT_Protector_res_0x7f0d0165, viewGroup, false);
            c23829 = new C23829();
            c23829.f77105 = (TextView) view.findViewById(R.id.textView);
            c23829.f77103 = (TextView) view.findViewById(R.id.textView2);
            c23829.f77104 = (ImageView) view.findViewById(R.id.icon);
            c23829.f77102 = (CheckBox) view.findViewById(R.id.MT_Protector_res_0x7f0a00d9);
            view.setTag(c23829);
        }
        C21008 c21008 = (C21008) this.f44790.get(i);
        c23829.f77105.setText(c21008.f67820);
        c23829.f77103.setText(c21008.f67822.packageName);
        c23829.f77102.setChecked(c21008.f67823);
        ImageView imageView = c23829.f77104;
        c21008.f67821 = true;
        imageView.setImageDrawable(c21008.f67825);
        if (c21008.f67824) {
            linkedList = c21008.f67826.f29428;
            synchronized (linkedList) {
                linkedList2 = c21008.f67826.f29428;
                linkedList2.addLast(c21008);
            }
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        c9503 = this.f44788.f29427;
        int width = c9503.getWidth();
        if (width == 0) {
            width = -1;
        }
        layoutParams.width = width;
        view.setLayoutParams(layoutParams);
        return view;
    }
}
