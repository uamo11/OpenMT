package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.Comparator;
import java.util.HashMap;

/* compiled from: M2AR */
/* renamed from: l.ܰ۬ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13838 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f41279;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f41280;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
        InterfaceC17889 interfaceC178892 = (InterfaceC17889) obj2;
        int i = 0;
        if (interfaceC17889 == interfaceC178892) {
            return 0;
        }
        if (interfaceC17889.mo36982()) {
            return -1000000000;
        }
        if (interfaceC178892.mo36982() || interfaceC17889.mo36972()) {
            return BasicLabelFormatter.BILLION;
        }
        if (interfaceC178892.mo36972()) {
            return -1000000000;
        }
        if (interfaceC17889.isDirectory()) {
            if (!interfaceC178892.isDirectory()) {
                return -1000000000;
            }
        } else if (interfaceC178892.isDirectory()) {
            return BasicLabelFormatter.BILLION;
        }
        if (!interfaceC17889.isDirectory()) {
            String name = interfaceC17889.getName();
            int i2 = C7489.f23073;
            int lastIndexOf = name.lastIndexOf(46);
            String str = "";
            String substring = (lastIndexOf == -1 || lastIndexOf == 0) ? "" : name.substring(lastIndexOf + 1);
            String name2 = interfaceC178892.getName();
            int lastIndexOf2 = name2.lastIndexOf(46);
            if (lastIndexOf2 != -1 && lastIndexOf2 != 0) {
                str = name2.substring(lastIndexOf2 + 1);
            }
            i = substring.compareToIgnoreCase(str);
        }
        if (i == 0) {
            String name3 = interfaceC17889.getName();
            HashMap hashMap = this.f41279;
            i = ((C10312) hashMap.get(name3)).compareTo((C10312) hashMap.get(interfaceC178892.getName()));
        }
        return this.f41280 ? -i : i;
    }

    public C13838(HashMap hashMap, boolean z) {
        this.f41279 = hashMap;
        this.f41280 = z;
    }
}
