package l;

import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* compiled from: L8ZE */
/* renamed from: l.ۤ֡֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9931 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Map f30004;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m25038(String str) {
        int i;
        if (str.startsWith(a.p) && str.endsWith(l.b)) {
            String m36561 = C15472.m36561(1, 1, str);
            if (m36561.startsWith("#")) {
                String substring = m36561.substring(1);
                if (substring.startsWith("x") || substring.startsWith("X")) {
                    substring = substring.substring(1);
                    i = 16;
                } else {
                    i = 10;
                }
                try {
                    int parseInt = Integer.parseInt(substring, i);
                    return parseInt == 0 ? "�" : new String(Character.toChars(parseInt));
                } catch (IllegalArgumentException unused) {
                    return "�";
                }
            }
            String str2 = (String) f30004.get(m36561);
            if (str2 != null) {
                return str2;
            }
        }
        return str;
    }

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C9931.class.getResourceAsStream("/org/commonmark/internal/util/entities.txt"), StandardCharsets.UTF_8));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!readLine.isEmpty()) {
                            int indexOf = readLine.indexOf("=");
                            hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                        }
                    } else {
                        bufferedReader.close();
                        hashMap.put("NewLine", "\n");
                        f30004 = hashMap;
                        return;
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }
}
