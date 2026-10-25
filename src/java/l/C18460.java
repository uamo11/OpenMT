package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.text.ParseException;
import java.util.StringTokenizer;

/* compiled from: 55PX */
/* renamed from: l.ᩴۖ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C18460 extends AbstractC16342 {
    @Override // l.AbstractC16342
    /* renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }

    @Override // l.InterfaceC6150
    /* renamed from: ֫ */
    public final C10384 mo11134(String str) {
        String nextToken;
        String str2 = null;
        if (!m38493(str)) {
            return null;
        }
        C10384 c10384 = new C10384();
        c10384.m26198(str);
        String m38492 = m38492(1);
        String m384922 = m38492(2);
        String str3 = m38492(3) + " " + m38492(4);
        String m384923 = m38492(5);
        String[] strArr = {m38492(9), m38492(10), m38492(11)};
        try {
            c10384.m26185(m38494(str3));
        } catch (ParseException unused) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(m384923, ",");
        int countTokens = stringTokenizer.countTokens();
        if (countTokens == 1) {
            nextToken = stringTokenizer.nextToken();
        } else if (countTokens != 2) {
            nextToken = null;
        } else {
            str2 = stringTokenizer.nextToken();
            nextToken = stringTokenizer.nextToken();
        }
        if (m38492.lastIndexOf(".DIR") != -1) {
            c10384.m26181(1);
        } else {
            c10384.m26181(0);
        }
        c10384.m26194(m38492);
        c10384.m26183(Long.parseLong(m384922) * 512);
        c10384.m26184(str2);
        c10384.m26196(nextToken);
        for (int i = 0; i < 3; i++) {
            String str4 = strArr[i];
            c10384.m26182(i, 0, str4.indexOf(82) >= 0);
            c10384.m26182(i, 1, str4.indexOf(87) >= 0);
            c10384.m26182(i, 2, str4.indexOf(69) >= 0);
        }
        return c10384;
    }

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* renamed from: ֫ */
    public final String mo17064(BufferedReader bufferedReader) {
        String readLine = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();
        while (readLine != null) {
            if (readLine.startsWith("Directory") || readLine.startsWith("Total")) {
                readLine = bufferedReader.readLine();
            } else {
                sb.append(readLine);
                if (readLine.trim().endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    break;
                }
                readLine = bufferedReader.readLine();
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
