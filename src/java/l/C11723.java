package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: M2AR */
/* renamed from: l.ۨ۬ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11723 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f34980;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f34981;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
        InterfaceC17889 interfaceC178892 = (InterfaceC17889) obj2;
        if (interfaceC17889 == interfaceC178892) {
            return 0;
        }
        int mo24431 = interfaceC17889.mo24431();
        int mo244312 = interfaceC178892.mo24431();
        if (mo24431 != mo244312) {
            if (mo24431 < mo244312) {
                return -1000000000;
            }
            return BasicLabelFormatter.BILLION;
        }
        String name = interfaceC17889.getName();
        HashMap hashMap = this.f34980;
        int compareTo = ((C10312) hashMap.get(name)).compareTo((C10312) hashMap.get(interfaceC178892.getName()));
        return this.f34981 ? -compareTo : compareTo;
    }

    public C11723(HashMap hashMap, boolean z) {
        this.f34980 = hashMap;
        this.f34981 = z;
    }
}
