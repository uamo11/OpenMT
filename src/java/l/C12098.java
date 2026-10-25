package l;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: KAQ1 */
/* renamed from: l.۫֫ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12098 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static WeakReference f36160;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12918 f36161;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f36162;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12098 m29512() {
        C12098 c12098;
        C12098 c120982;
        WeakReference weakReference = f36160;
        if (weakReference != null && (c120982 = (C12098) weakReference.get()) != null) {
            return c120982;
        }
        synchronized (C12098.class) {
            WeakReference weakReference2 = f36160;
            if (weakReference2 != null && (c12098 = (C12098) weakReference2.get()) != null) {
                return c12098;
            }
            C12098 c120983 = new C12098();
            f36160 = new WeakReference(c120983);
            return c120983;
        }
    }

    public C12098() {
        try {
            C12918 m31381 = C12918.m31381(C8172.m21646("/assets/android_dex"));
            int m31408 = m31381.m31408();
            this.f36161 = m31381;
            this.f36162 = new HashMap(m31408);
            for (int i = 0; i < m31408; i++) {
                int m31383 = m31381.m31383(i);
                int m31397 = m31381.m31397(i);
                this.f36162.put(m31381.m31411(m31383), new C9982(m31383, m31397));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22681 m29513(String str) {
        C9982 c9982 = (C9982) this.f36162.get(str);
        if (c9982 == null) {
            return null;
        }
        return new C22681(new C7980(this.f36161, c9982.f30098, c9982.f30097));
    }
}
