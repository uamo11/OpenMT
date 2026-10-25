package l;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: P43R */
/* renamed from: l.ᩴۡ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18653 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m43256(C2609 c2609) {
        ArrayList arrayList = new ArrayList();
        String str = System.getenv("JDK_JAVAC_OPTIONS");
        if (str != null && !str.trim().isEmpty()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            char c = 0;
            loop0: while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (c == 0) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                        while (true) {
                            if (charAt == '\f' || charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == ' ') {
                                i++;
                                if (i >= length) {
                                    break loop0;
                                }
                                charAt = str.charAt(i);
                            }
                        }
                    }
                } else if (charAt == '\"' || charAt == '\'') {
                    if (c == 0) {
                        c = charAt;
                    } else if (c == charAt) {
                        c = 0;
                    } else {
                        sb.append(charAt);
                    }
                    i++;
                }
                sb.append(charAt);
                i++;
            }
            if (sb.length() != 0) {
                arrayList.add(sb.toString());
            }
            if (c != 0) {
                throw new C3836();
            }
        }
        arrayList.addAll(c2609);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() > 1 && str2.charAt(0) == '@') {
                String substring = str2.substring(1);
                if (substring.charAt(0) == '@') {
                    arrayList2.add(substring);
                } else {
                    BufferedReader newBufferedReader = C17229.newBufferedReader(C8763.get(substring, new String[0]), Charset.defaultCharset());
                    try {
                        C2425 c2425 = new C2425(newBufferedReader);
                        while (true) {
                            String m7856 = c2425.m7856();
                            if (m7856 == null) {
                                break;
                            }
                            arrayList2.add(m7856);
                        }
                        newBufferedReader.close();
                    } catch (Throwable th) {
                        if (newBufferedReader != null) {
                            try {
                                newBufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            } else {
                arrayList2.add(str2);
            }
        }
        return arrayList2;
    }
}
