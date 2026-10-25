package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;

/* compiled from: 84GP */
/* renamed from: l.ۘ᩸ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4210 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m12701(String str) {
        C17209 m14323 = C4925.m14323();
        C9449 c9449 = new C9449();
        c9449.m24282(str);
        C18621 execute = m14323.m40469(c9449.m24274()).execute();
        if (execute.m43173()) {
            AbstractC0275 m43170 = execute.m43170();
            if (m43170 == null) {
                throw new IOException("Response body is null");
            }
            return m43170.m1614();
        }
        throw new IOException("Response code: " + execute.m43177() + "\nMessage: " + execute.m43171());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap m12702(String str) {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            String str2 = null;
            StringBuilder sb = null;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String trim = readLine.trim();
                    if (trim.startsWith("[") && trim.endsWith("]")) {
                        if (str2 != null) {
                            hashMap.put(str2, sb.toString());
                        }
                        str2 = trim.substring(1, trim.length() - 1);
                        sb = new StringBuilder();
                    } else if (str2 != null) {
                        if (sb.length() > 0) {
                            sb.append('\n');
                        }
                        sb.append(readLine);
                    }
                } finally {
                }
            }
            if (str2 != null) {
                hashMap.put(str2, sb.toString());
            }
            bufferedReader.close();
            return hashMap;
        } catch (IOException unused) {
            return hashMap;
        }
    }
}
