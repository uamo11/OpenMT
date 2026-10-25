package l;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: B8WE */
/* renamed from: l.֫ۖۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1534 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f5415 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList f5416 = new ArrayList();

    static {
        m5245();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m5245() {
        C12951 m31485;
        boolean z;
        try {
            byte[] mo18253 = ApplicationC20075.f65008.mo18253("mfr", (byte[]) null);
            if (mo18253 != null) {
                m31485 = new C12951(mo18253);
                z = false;
            } else {
                String string = ApplicationC20075.f65008.getString("mfr", null);
                if (string == null) {
                    return;
                }
                m31485 = C12951.m31485(Base64.decode(string, 0));
                z = true;
            }
            C22124.m49722((InterfaceC20008) m31485, 1419064394);
            int readInt = m31485.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(new C7569(m31485.m31487(), m31485.m31504()));
            }
            f5416 = arrayList;
            if (z) {
                m5246();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m5244() {
        return f5416;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m5246() {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList(f5416);
        C10130 m43030 = C18515.m43030(1419064394);
        m43030.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7569 c7569 = (C7569) it.next();
            str = c7569.f23375;
            m43030.m25432(str);
            str2 = c7569.f23376;
            m43030.m25423((CharSequence) str2);
        }
        ApplicationC20075.f65008.edit().mo25855("mfr", m43030.m25444()).apply();
    }
}
