package l;

import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.UTFDataFormatException;
import java.lang.Character;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: 74MB */
/* renamed from: l.ᩴۗۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18486 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f57310 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42976(String str, String... strArr) {
        String str2 = strArr.length > 0 ? strArr[0] : "";
        String str3 = strArr.length > 1 ? strArr[1] : str2;
        StringBuilder sb = new StringBuilder(str2);
        for (int i = 0; i < str.length(); i++) {
            sb.append(m42975(str.charAt(i)));
        }
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42975(char c) {
        if (c == '\f') {
            return "\\".concat("f");
        }
        if (c == '\r') {
            return "\\".concat("r");
        }
        if (c == '\"') {
            return "\\".concat("\"");
        }
        if (c == '\'') {
            return "\\".concat("'");
        }
        if (c != '\\') {
            switch (c) {
                case '\b':
                    return "\\".concat("b");
                case '\t':
                    return "\\".concat(am.aI);
                case '\n':
                    return "\\".concat("n");
                default:
                    return Character.isISOControl(c) ? String.format("\\u%04x", Integer.valueOf(c)) : Character.toString(c);
            }
        }
        return "\\".concat("\\");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m42978(int i, int i2, DataInputStream dataInputStream) {
        int i3;
        int i4 = i2 / 6;
        int i5 = i4 + 1;
        final ArrayList arrayList = new ArrayList();
        C3669 c3669 = new C3669();
        c3669.add(new StringBuilder());
        int i6 = 0;
        StringBuilder sb = (StringBuilder) c3669.get(0);
        String str = null;
        try {
            try {
                byte[] bArr = new byte[i + 2];
                bArr[0] = (byte) (i >> 8);
                bArr[1] = (byte) i;
                i3 = 0;
                for (int i7 = 0; i7 < i; i7++) {
                    try {
                        byte readByte = dataInputStream.readByte();
                        bArr[i7 + 2] = readByte;
                        i3++;
                        sb.append("0x");
                        char[] cArr = f57310;
                        sb.append(cArr[(readByte >> 4) & 15]);
                        sb.append(cArr[readByte & 15]);
                        if (i7 % i5 == i4) {
                            sb = new StringBuilder();
                            c3669.add(sb);
                        } else if (i7 + 1 != i) {
                            sb.append(" ");
                        }
                    } catch (NegativeArraySizeException e) {
                        e = e;
                        i6 = i3;
                        throw new IOException("Requested array size exceeds VM limit", e);
                    } catch (Throwable th) {
                        th = th;
                        if (i3 > 0) {
                            ArrayList m42979 = m42979(i2, (String) null);
                            if (m42979 != null) {
                                C5378.stream(m42979).forEach(new Consumer() { // from class: l.ۡۗۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C23517.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        String str2 = (String) obj;
                                        if (!str2.startsWith("// ==")) {
                                            str2 = C4860.m14172("\"", str2, "\";");
                                        }
                                        arrayList.add(str2);
                                    }
                                });
                            } else {
                                C5378.stream(c3669).map(new C23147(8)).forEach(new Consumer() { // from class: l.ܺۗۚ
                                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return C23517.$default$andThen(this, consumer);
                                    }

                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        String str2 = (String) obj;
                                        if (!str2.startsWith("// ==")) {
                                            str2 = str2.concat(l.b);
                                        }
                                        arrayList.add(str2);
                                    }
                                });
                            }
                        }
                        throw th;
                    }
                }
                if (i3 > 0) {
                    try {
                        DataInputStream dataInputStream2 = new DataInputStream(new ByteArrayInputStream(bArr));
                        try {
                            str = DataInputStream.readUTF(dataInputStream2);
                            dataInputStream2.close();
                        } catch (Throwable th2) {
                            try {
                                dataInputStream2.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } catch (UTFDataFormatException unused) {
                        c3669.add(0, new StringBuilder("// == The bytes do not represent a valid modified UTF-8 encoding of a Unicode string. =="));
                    } catch (IOException unused2) {
                    }
                }
                if (i3 > 0) {
                    ArrayList m429792 = m42979(i2, str);
                    if (m429792 != null) {
                        C5378.stream(m429792).forEach(new Consumer() { // from class: l.ۡۗۚ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C23517.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                String str2 = (String) obj;
                                if (!str2.startsWith("// ==")) {
                                    str2 = C4860.m14172("\"", str2, "\";");
                                }
                                arrayList.add(str2);
                            }
                        });
                    } else {
                        C5378.stream(c3669).map(new C23147(8)).forEach(new Consumer() { // from class: l.ܺۗۚ
                            public /* synthetic */ Consumer andThen(Consumer consumer) {
                                return C23517.$default$andThen(this, consumer);
                            }

                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                String str2 = (String) obj;
                                if (!str2.startsWith("// ==")) {
                                    str2 = str2.concat(l.b);
                                }
                                arrayList.add(str2);
                            }
                        });
                    }
                }
                return arrayList;
            } catch (NegativeArraySizeException e2) {
                e = e2;
            }
        } catch (Throwable th4) {
            th = th4;
            i3 = i6;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m42979(int i, String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= ' ' && c <= '~') {
                sb.append(c);
            }
        }
        String sb2 = sb.toString();
        if (sb2 == null || sb2.isEmpty()) {
            return null;
        }
        for (int i2 = 0; i2 < sb2.length(); i2++) {
            if (!m42980(sb2.charAt(i2))) {
                return null;
            }
        }
        ArrayList arrayList = new ArrayList();
        String str2 = "";
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (str2.length() >= i) {
                arrayList.add(str2);
                str2 = "";
            }
            StringBuilder m15339 = C5368.m15339(str2);
            m15339.append(m42975(str.charAt(i3)));
            str2 = m15339.toString();
        }
        if (!str2.isEmpty()) {
            arrayList.add(str2);
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m42977(int[] iArr) {
        return String.format("{%s}", C22311.stream(iArr).mapToObj(new C2258()).collect(C22976.joining(", ")));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m42980(char c) {
        Character.UnicodeBlock of = Character.UnicodeBlock.of(c);
        return (Character.isISOControl(c) || c == 65535 || of == null || of == Character.UnicodeBlock.SPECIALS) ? false : true;
    }
}
