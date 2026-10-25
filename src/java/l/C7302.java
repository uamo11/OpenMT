package l;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: N155 */
/* renamed from: l.۟ۜۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7302 extends Filter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2072 f22412;

    public C7302(C2072 c2072) {
        this.f22412 = c2072;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Object obj2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object obj3;
        List list;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        arrayList = this.f22412.f6909;
        if (arrayList == null) {
            obj3 = this.f22412.f6913;
            synchronized (obj3) {
                C2072 c2072 = this.f22412;
                list = this.f22412.f6910;
                c2072.f6909 = new ArrayList(list);
            }
        }
        if (charSequence == null || charSequence.length() == 0) {
            obj = this.f22412.f6913;
            synchronized (obj) {
                arrayList3 = this.f22412.f6909;
                arrayList2 = new ArrayList(arrayList3);
            }
            filterResults.values = arrayList2;
            filterResults.count = arrayList2.size();
            return filterResults;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        obj2 = this.f22412.f6913;
        synchronized (obj2) {
            arrayList5 = this.f22412.f6909;
            arrayList4 = new ArrayList(arrayList5);
        }
        int size = arrayList4.size();
        ArrayList arrayList6 = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj4 = arrayList4.get(i);
            String lowerCase2 = obj4.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                arrayList6.add(obj4);
            } else {
                String[] split = lowerCase2.split(" ");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (split[i2].startsWith(lowerCase)) {
                        arrayList6.add(obj4);
                        break;
                    }
                    i2++;
                }
            }
        }
        filterResults.values = arrayList6;
        filterResults.count = arrayList6.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list = (List) filterResults.values;
        C2072 c2072 = this.f22412;
        c2072.f6910 = list;
        if (filterResults.count > 0) {
            c2072.notifyDataSetChanged();
        } else {
            c2072.notifyDataSetInvalidated();
        }
    }
}
