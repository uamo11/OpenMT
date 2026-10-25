package l;

import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: Q7L3 */
/* renamed from: l.ۧ᩻᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11337 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28002(String str) {
        int i;
        char charAt;
        if (str == null || str.isEmpty()) {
            return str;
        }
        ArrayList m28001 = m28001(str);
        if (m28001.size() <= 1) {
            return str.replaceAll("^[ \t]+", "");
        }
        Iterator it = m28001.iterator();
        int i2 = Integer.MAX_VALUE;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (!str2.trim().isEmpty()) {
                int i3 = 0;
                while (i < str2.length() && ((charAt = str2.charAt(i)) == ' ' || charAt == '\t')) {
                    i3++;
                    i++;
                }
                i2 = Math.min(i2, i3);
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        while (i < m28001.size()) {
            String str3 = (String) m28001.get(i);
            if (str3.trim().isEmpty()) {
                sb.append("");
            } else if (str3.length() >= i2) {
                sb.append(str3.substring(i2));
            } else {
                sb.append(str3);
            }
            if (i < m28001.size() - 1) {
                sb.append("\n");
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m28001(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt == '\r') {
                arrayList.add(sb.toString());
                sb = new StringBuilder();
                int i2 = i + 1;
                if (i2 < str.length() && str.charAt(i2) == '\n') {
                    i = i2;
                }
            } else if (charAt == '\n') {
                arrayList.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(charAt);
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m28003(String str) {
        if (str.isEmpty()) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char c = charArray[i];
            if (c == '\\') {
                if (i3 < length) {
                    i += 2;
                    c = charArray[i3];
                } else {
                    i = i3;
                    c = 0;
                }
                if (c == '\n') {
                    continue;
                } else if (c != '\r') {
                    if (c != '\"' && c != '\'' && c != '\\') {
                        if (c == 'b') {
                            c = '\b';
                        } else if (c == 'f') {
                            c = '\f';
                        } else if (c != 'n') {
                            switch (c) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    int min = Math.min((c > '3' ? 1 : 2) + i, length);
                                    int i4 = c - '0';
                                    while (i < min) {
                                        char c2 = charArray[i];
                                        if (c2 >= '0' && '7' >= c2) {
                                            i++;
                                            i4 = (i4 << 3) | (c2 - '0');
                                        }
                                        c = (char) i4;
                                        break;
                                    }
                                    c = (char) i4;
                                    break;
                                default:
                                    switch (c) {
                                        case 'r':
                                            c = '\r';
                                            break;
                                        case 's':
                                            c = ' ';
                                            break;
                                        case 't':
                                            c = '\t';
                                            break;
                                        default:
                                            throw new IllegalArgumentException(String.format("Invalid escape sequence: \\%c \\\\u%04X", Character.valueOf(c), Integer.valueOf(c)));
                                    }
                            }
                        } else {
                            c = '\n';
                        }
                    }
                } else if (i < length && charArray[i] == '\n') {
                    i++;
                }
            } else {
                i = i3;
            }
            charArray[i2] = c;
            i2++;
        }
        return new String(charArray, 0, i2);
    }
}
