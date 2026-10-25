package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: 6AY4 */
/* renamed from: l.ۡ֡᩷, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8537 implements InterfaceC16233 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC19121 f26096;

    @Override // l.InterfaceC16233
    public final Object invoke(Object obj) {
        HashSet hashSet;
        String substring;
        HashSet hashSet2;
        InterfaceC17889 interfaceC17889 = (InterfaceC17889) obj;
        boolean z = true;
        if (!interfaceC17889.mo36982() && !interfaceC17889.isDirectory()) {
            ViewOnClickListenerC19121 viewOnClickListenerC19121 = this.f26096;
            hashSet = viewOnClickListenerC19121.f60250;
            String name = interfaceC17889.getName();
            if (name == null) {
                int i = C2439.f7766;
                substring = null;
            } else {
                int m7877 = C2439.m7877(name);
                substring = m7877 == -1 ? "" : name.substring(m7877 + 1);
            }
            C11233.m27803(substring, "getExtension(...)");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            C11233.m27803(lowerCase, "toLowerCase(...)");
            if (!hashSet.contains(lowerCase)) {
                hashSet2 = viewOnClickListenerC19121.f60248;
                Iterator it = hashSet2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    String str = (String) it.next();
                    String name2 = interfaceC17889.getName();
                    C11233.m27803(name2, "getName(...)");
                    if (C3016.m9240(name2, str, true)) {
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
