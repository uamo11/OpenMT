package l;

import com.alipay.sdk.m.y.l;
import java.util.concurrent.CancellationException;

/* compiled from: X7PO */
/* renamed from: l.ܰۘܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13574 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32628(C11459 c11459, String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            m32629((InterfaceC22747) null, i);
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i++;
                if (i == length) {
                    throw new C12869("The last '\\' need follow a character.", str, length - 1);
                }
            } else if (charAt != '$') {
                continue;
            } else {
                int i2 = i + 1;
                if (i2 == length) {
                    throw new C12869("The last '$' must be followed by a group index", str, length - 1);
                }
                char charAt2 = str.charAt(i2);
                if (charAt2 == '{') {
                    StringBuilder sb = new StringBuilder();
                    int i3 = i2;
                    while (true) {
                        i3++;
                        if (i3 == length) {
                            throw new C12869("Missing ending brace '}' from replacement string", str, length - 1);
                        }
                        m32629((InterfaceC22747) null, i3);
                        char charAt3 = str.charAt(i3);
                        if (charAt3 == '}') {
                            if (sb.length() == 0) {
                                throw new C12869("The '${' must be followed by a group name or index", str, i2);
                            }
                            if (sb.length() == 0) {
                                throw new C12869("The '${' must be followed by a group name or index", str, i2);
                            }
                            String sb2 = sb.toString();
                            if (C22165.m49802(sb2.charAt(0))) {
                                try {
                                    Integer.parseInt(sb2);
                                } catch (NumberFormatException e) {
                                    throw new C12869(e.toString(), str, i + 2);
                                }
                            } else if (c11459 != null && !c11459.m28266().containsKey(sb2)) {
                                throw new C12869(C4860.m14172("No group with name {", sb2, l.d), str, i2);
                            }
                            i = i3;
                        } else {
                            if (((charAt3 - 'a') | ('z' - charAt3)) < 0 && ((charAt3 - 'A') | ('Z' - charAt3)) < 0 && !C22165.m49802(charAt3)) {
                                throw new C12869("The '${' must be followed by a group name or index", str, i2);
                            }
                            sb.append(charAt3);
                        }
                    }
                } else {
                    if (charAt2 < '0' || charAt2 > '9') {
                        throw new C12869("The '$' must be followed by a group index", str, i);
                    }
                    i = i2;
                }
            }
            i++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32630(InterfaceC22747 interfaceC22747, StringBuilder sb, String str) {
        int i;
        int parseInt;
        interfaceC22747.mo21388();
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            m32629(interfaceC22747, i3);
            char charAt = str.charAt(i2);
            if (charAt == '\\') {
                i = i2 + 1;
                if (i == length) {
                    throw new C12869("The last '\\' need follow a character.", str, length - 1);
                }
                char charAt2 = str.charAt(i);
                if (charAt2 == 'L' || charAt2 == 'U' || charAt2 == 'l' || charAt2 == 'u') {
                    sb2.append('\\');
                    sb2.append(charAt2);
                } else {
                    if (sb2.length() != 0) {
                        throw new C12869("The '" + ((Object) sb2) + "' need follow a '$'.", str, i2 - sb2.length());
                    }
                    if (charAt2 == 'n') {
                        sb.append("\n");
                    } else if (charAt2 == 'r') {
                        sb.append("\r");
                    } else if (charAt2 != 't') {
                        sb.append(charAt2);
                    } else {
                        sb.append("\t");
                    }
                }
            } else if (charAt == '$') {
                i = i2 + 1;
                if (i == length) {
                    throw new C12869("The last '$' must be followed by a group index", str, length - 1);
                }
                char charAt3 = str.charAt(i);
                if (charAt3 == '{') {
                    StringBuilder sb3 = new StringBuilder();
                    int i5 = i;
                    while (true) {
                        i5++;
                        if (i5 == length) {
                            throw new C12869("Missing ending brace '}' from replacement string", str, length - 1);
                        }
                        int i6 = i4 + 1;
                        m32629(interfaceC22747, i4);
                        char charAt4 = str.charAt(i5);
                        if (charAt4 == '}') {
                            if (sb3.length() == 0) {
                                throw new C12869("The '${' must be followed by a group name or index", str, i);
                            }
                            if (sb3.length() == 0) {
                                throw new C12869("The '${' must be followed by a group name or index", str, i);
                            }
                            C11459 pattern = interfaceC22747.pattern();
                            String sb4 = sb3.toString();
                            if (C22165.m49802(sb4.charAt(0))) {
                                try {
                                    parseInt = Integer.parseInt(sb4);
                                } catch (NumberFormatException e) {
                                    throw new C12869(e.toString(), str, i2 + 2);
                                }
                            } else {
                                Integer num = (Integer) pattern.m28266().get(sb4);
                                if (num == null) {
                                    throw new C12869(C4860.m14172("No group with name {", sb4, l.d), str, i);
                                }
                                parseInt = num.intValue();
                            }
                            if (sb2.length() != 0) {
                                m32631(interfaceC22747, sb, sb2, parseInt);
                                sb2.setLength(0);
                            } else if (parseInt <= interfaceC22747.groupCount()) {
                                int start = interfaceC22747.start(parseInt);
                                int end = interfaceC22747.end(parseInt);
                                if (start != -1 && end != -1) {
                                    CharSequence text = interfaceC22747.getText();
                                    while (start < end) {
                                        m32629(interfaceC22747, 0);
                                        int min = Math.min(4096, end - start) + start;
                                        sb.append(text, start, min);
                                        start = min;
                                    }
                                }
                            }
                            i2 = i5;
                            i3 = i6;
                        } else {
                            if (((charAt4 - 'a') | ('z' - charAt4)) < 0 && ((charAt4 - 'A') | ('Z' - charAt4)) < 0 && !C22165.m49802(charAt4)) {
                                throw new C12869("The '${' must be followed by a group name or index", str, i);
                            }
                            sb3.append(charAt4);
                            i4 = i6;
                        }
                    }
                } else {
                    if (charAt3 < '0' || charAt3 > '9') {
                        throw new C12869("The '$' must be followed by a group index", str, i2);
                    }
                    if (sb2.length() == 0) {
                        int i7 = charAt3 - '0';
                        if (i7 <= interfaceC22747.groupCount()) {
                            int start2 = interfaceC22747.start(i7);
                            int end2 = interfaceC22747.end(i7);
                            if (start2 != -1 && end2 != -1) {
                                CharSequence text2 = interfaceC22747.getText();
                                while (start2 < end2) {
                                    m32629(interfaceC22747, 0);
                                    int min2 = Math.min(4096, end2 - start2) + start2;
                                    sb.append(text2, start2, min2);
                                    start2 = min2;
                                }
                            }
                        }
                    } else {
                        m32631(interfaceC22747, sb, sb2, charAt3 - '0');
                        sb2.setLength(0);
                    }
                }
            } else {
                if (sb2.length() != 0) {
                    throw new C12869("The '" + ((Object) sb2) + "' need follow a '$'.", str, i2 - sb2.length());
                }
                sb.append(charAt);
                i3 = i4;
                i2++;
            }
            i2 = i;
            i3 = i4;
            i2++;
        }
        if (sb2.length() == 0) {
            interfaceC22747.mo21388();
            return;
        }
        throw new C12869("The '" + ((Object) sb2) + "' need follow a '$'.", str, str.length() - sb2.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32631(InterfaceC22747 interfaceC22747, StringBuilder sb, StringBuilder sb2, int i) {
        String group;
        int i2;
        if (i <= interfaceC22747.groupCount() && (group = interfaceC22747.group(i)) != null) {
            int length = sb2.length() / 2;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                m32629(interfaceC22747, i4);
                char charAt = sb2.charAt((i4 * 2) + 1);
                if (charAt == 'L') {
                    while (i3 < group.length()) {
                        m32629(interfaceC22747, i3);
                        sb.append(Character.toLowerCase(group.charAt(i3)));
                        i3++;
                    }
                    return;
                }
                if (charAt == 'U') {
                    while (i3 < group.length()) {
                        m32629(interfaceC22747, i3);
                        sb.append(Character.toUpperCase(group.charAt(i3)));
                        i3++;
                    }
                    return;
                }
                if (charAt == 'l') {
                    if (i3 >= group.length()) {
                        return;
                    }
                    i2 = i3 + 1;
                    sb.append(Character.toLowerCase(group.charAt(i3)));
                } else if (charAt == 'u') {
                    if (i3 >= group.length()) {
                        return;
                    }
                    i2 = i3 + 1;
                    sb.append(Character.toUpperCase(group.charAt(i3)));
                } else {
                    throw new IllegalStateException();
                }
                i3 = i2;
            }
            if (i3 < group.length()) {
                int length2 = group.length();
                while (i3 < length2) {
                    m32629(interfaceC22747, 0);
                    int min = Math.min(4096, length2 - i3) + i3;
                    sb.append((CharSequence) group, i3, min);
                    i3 = min;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32629(InterfaceC22747 interfaceC22747, int i) {
        if ((i & 1023) != 0) {
            return;
        }
        if (interfaceC22747 != null) {
            interfaceC22747.mo21388();
        }
        if (Thread.currentThread().isInterrupted()) {
            throw new CancellationException("Regex replacement canceled");
        }
    }
}
