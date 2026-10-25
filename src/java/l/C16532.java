package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;

/* compiled from: 77VL */
/* renamed from: l.ܽۡۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16532 extends IOException {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f50807;

    public C16532(int i, String str) {
        super(m38908(i, str));
        this.f50807 = i;
    }

    public C16532(String str, Exception exc) {
        super(m38908(4, str), exc);
        this.f50807 = 4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m38908(int i, String str) {
        String[] m27194 = C10889.m27194(i);
        if (m27194 == null) {
            return C16014.m37867(str, " (UNKNOW SFTP ERROR CODE)");
        }
        StringBuilder m19190 = C7166.m19190(str, " (");
        m19190.append(m27194[0]);
        m19190.append(": ");
        return C9045.m23341(m19190, m27194[1], MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
