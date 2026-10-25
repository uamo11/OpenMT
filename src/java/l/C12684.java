package l;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* compiled from: N673 */
/* renamed from: l.۫᩸ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12684 implements PrivilegedAction {
    public final /* synthetic */ int a;

    @Override // java.security.PrivilegedAction
    public final Object run() {
        switch (this.a) {
            case 0:
                Object obj = AbstractC13389.a;
                ArrayList arrayList = new ArrayList();
                Iterator it = ServiceLoader.load(AbstractC13389.class, ClassLoader.getSystemClassLoader()).iterator();
                while (it.hasNext()) {
                    AbstractC13389 abstractC13389 = (AbstractC13389) it.next();
                    String scheme = abstractC13389.getScheme();
                    if (!scheme.equalsIgnoreCase("file")) {
                        int size = arrayList.size();
                        int i = 0;
                        while (true) {
                            if (i < size) {
                                Object obj2 = arrayList.get(i);
                                i++;
                                if (((AbstractC13389) obj2).getScheme().equalsIgnoreCase(scheme)) {
                                    break;
                                }
                            } else {
                                arrayList.add(abstractC13389);
                            }
                        }
                    }
                }
                return arrayList;
            case 1:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
            case 2:
                return Boolean.valueOf(Boolean.getBoolean("java.util.secureRandomSeed"));
            default:
                return Boolean.valueOf(Boolean.getBoolean("org.openjdk.java.util.stream.tripwire"));
        }
    }
}
