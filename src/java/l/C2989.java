package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: 78L3 */
/* renamed from: l.ۗۘۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2989 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m9124(long j, List list) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C19811) it.next()).m45557());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(am.aF, arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
