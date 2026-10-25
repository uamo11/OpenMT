package l;

import com.google.android.material.motion.MotionUtils;
import java.util.HashMap;

/* compiled from: 87BW */
/* renamed from: l.᩷᩵ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21082 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m47981(InterfaceC17889 interfaceC17889) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("name", interfaceC17889.getName());
        hashMap.put("isFile", Boolean.valueOf(interfaceC17889.mo36969()));
        hashMap.put("isLink", Boolean.valueOf(interfaceC17889.mo36978()));
        hashMap.put("recyclable", Boolean.valueOf(C18965.m43781(interfaceC17889.mo24433())));
        if (interfaceC17889.mo36978()) {
            hashMap.put("linkPath", interfaceC17889.mo36977());
        }
        if (interfaceC17889.mo36969()) {
            hashMap.put("size", Long.valueOf(interfaceC17889.getSize()));
        } else {
            hashMap.put("size", -1);
        }
        int i = C6970.f21484;
        hashMap.put(MotionUtils.EASING_TYPE_PATH, interfaceC17889.isDirectory() ? interfaceC17889.mo36980() : interfaceC17889.getPath());
        hashMap.put("mime", interfaceC17889.mo36971());
        hashMap.put("time", C17283.m40576(interfaceC17889.getTime()));
        if (interfaceC17889.isDirectory()) {
            str = C19883.f64181.f64251;
        } else {
            str = interfaceC17889.mo36973().m7317().f64251;
        }
        hashMap.put("typeIcon", str);
        C14730 m18838 = C6970.m18838(interfaceC17889);
        if (m18838 != null) {
            hashMap.put("dynamicIconHint", m18838);
        }
        return hashMap;
    }
}
