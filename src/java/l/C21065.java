package l;

import com.google.android.material.motion.MotionUtils;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Consumer;
import org.bouncycastle.pqc.crypto.newhope.Params;

/* compiled from: W6QR */
/* renamed from: l.᩷ᩴܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21065 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f67940;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C5855 f67941;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f67942;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C5855 f67943;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile HashMap f67944;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC10795 f67945;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f67946;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C7225 f67947;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f67948;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f67949;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f67950 = 1;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f67951;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int[] f67952;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public BitSet f67953;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f67954;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5150[] f67955;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f67956;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f67957;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String f67958;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f67959;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f67960;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f67961;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m47948(int i, int i2) {
        return (i2 & 1) != 0 ? i == 10 : i == 10 || i == 13 || (i | 1) == 8233 || i == 133;
    }

    public C21065(String str, int i) {
        this.f67958 = str;
        this.f67956 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:0x03e7, code lost:
    
        r1.m47950();
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0402, code lost:
    
        throw r1.m47947("Dangling meta character '" + ((char) r5) + "'");
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x07f9, code lost:
    
        if (r0 != 5) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
    
        r1 = r5.charAt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ec, code lost:
    
        if ("dDsSwWhHVpP".indexOf(r1) >= 0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
    
        if (r1 != 'v') goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        r1 = r12 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f4, code lost:
    
        if (r1 >= r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fa, code lost:
    
        if (r5.charAt(r1) != r2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x05f2, code lost:
    
        throw r1.m47947("Unknown group type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0100, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x09ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v38, types: [l.ܰۚܽ] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v62, types: [l.ۤۚܽ] */
    /* JADX WARN: Type inference failed for: r0v63, types: [l.ۧ֨ܽ] */
    /* JADX WARN: Type inference failed for: r5v45, types: [l.֨֡ܽ] */
    /* JADX WARN: Type inference failed for: r5v46, types: [l.֨֡ܽ] */
    /* JADX WARN: Type inference failed for: r5v48, types: [l.֨֡ܽ] */
    /* JADX WARN: Type inference failed for: r5v49, types: [l.֨֡ܽ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C1476 m47923(int r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 2536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21065.m47923(int, java.lang.String):l.֫֡ܽ");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m47945(int i) {
        while (true) {
            if (!C22165.m49801(i, 2048) && i != 35) {
                return i;
            }
            while (C22165.m49801(i, 2048)) {
                int[] iArr = this.f67952;
                int i2 = this.f67954;
                this.f67954 = i2 + 1;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f67952;
                int i3 = this.f67954;
                this.f67954 = i3 + 1;
                i = iArr2[i3];
                while (i != 0 && !m47948(i, this.f67956)) {
                    int[] iArr3 = this.f67952;
                    int i4 = this.f67954;
                    this.f67954 = i4 + 1;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f67954;
                    int i6 = this.f67940;
                    if (i5 > i6) {
                        int[] iArr4 = this.f67952;
                        this.f67954 = i6 + 1;
                        i = iArr4[i6];
                    }
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m47951(int i) {
        while (true) {
            if (!C22165.m49801(i, 2048) && i != 35) {
                return i;
            }
            while (C22165.m49801(i, 2048)) {
                int[] iArr = this.f67952;
                int i2 = this.f67954 + 1;
                this.f67954 = i2;
                i = iArr[i2];
            }
            if (i == 35) {
                int[] iArr2 = this.f67952;
                int i3 = this.f67954 + 1;
                this.f67954 = i3;
                i = iArr2[i3];
                while (i != 0 && !m47948(i, this.f67956)) {
                    int[] iArr3 = this.f67952;
                    int i4 = this.f67954 + 1;
                    this.f67954 = i4;
                    i = iArr3[i4];
                }
                if (i == 0) {
                    int i5 = this.f67954;
                    int i6 = this.f67940;
                    if (i5 > i6) {
                        this.f67954 = i6;
                        i = this.f67952[i6];
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47930(int i, int i2, String str, StringBuilder sb) {
        m47931(str, i, i2, sb, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47931(String str, int i, int i2, final StringBuilder sb, final boolean z) {
        int i3 = i;
        while (i3 < i2 && C22165.m49800(str.charAt(i3))) {
            i3++;
        }
        if (i3 == i2) {
            if (z) {
                sb.append(C11459.m28261(str.substring(i, i2)));
                return;
            } else {
                sb.append((CharSequence) str, i, i2);
                return;
            }
        }
        int i4 = -1;
        int i5 = i3 - 1;
        if (i5 >= i) {
            if (z) {
                sb.append(C11459.m28261(str.substring(i, i5)));
            } else {
                sb.append((CharSequence) str, i, i5);
            }
            i = i5;
        }
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (z || ".$|()[]{}^?*+\\".indexOf(codePointAt) == i4) {
                int m9496 = C3115.m9496(str, i, i2, null);
                String substring = str.substring(i, m9496);
                String normalize = Normalizer.normalize(substring, Normalizer.Form.NFD);
                if (normalize.codePointCount(0, normalize.length()) <= 1 || C2164.m7146(normalize.codePointAt(Character.charCount(normalize.codePointAt(0)))) != 6) {
                    String normalize2 = Normalizer.normalize(substring, Normalizer.Form.NFC);
                    if (z) {
                        substring = C11459.m28261(substring);
                        normalize = C11459.m28261(normalize);
                        normalize2 = C11459.m28261(normalize2);
                    }
                    if (!substring.equals(normalize2) && !normalize.equals(normalize2)) {
                        StringBuilder m10501 = C3435.m10501("(?:", substring, "|", normalize, "|");
                        m10501.append(normalize2);
                        m10501.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        sb.append(m10501.toString());
                    } else if (substring.equals(normalize)) {
                        sb.append(substring);
                    } else {
                        sb.append(C20087.m46306("(?:", substring, "|", normalize, MotionUtils.EASING_TYPE_FORMAT_END));
                    }
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    linkedHashSet.add(substring);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C11187(normalize));
                    while (!arrayList.isEmpty()) {
                        C11187 c11187 = (C11187) C18566.m43105(arrayList, 1);
                        String[] strArr = c11187.f33580;
                        String str2 = c11187.f33578;
                        if (strArr == null) {
                            linkedHashSet.add(str2);
                            arrayList.remove(arrayList.size() - 1);
                        } else if (c11187.f33579 == strArr.length) {
                            C18473.m42953(arrayList, 1);
                        } else {
                            StringBuilder m15339 = C5368.m15339(str2);
                            String[] strArr2 = c11187.f33580;
                            int i6 = c11187.f33579;
                            c11187.f33579 = i6 + 1;
                            m15339.append(strArr2[i6]);
                            String sb2 = m15339.toString();
                            linkedHashSet.add(sb2);
                            int m47937 = m47937(2, sb2);
                            String substring2 = sb2.substring(0, m47937);
                            String normalize3 = Normalizer.normalize(substring2, Normalizer.Form.NFC);
                            String m37867 = normalize3.equals(substring2) ? null : C16014.m37867(normalize3, sb2.substring(m47937));
                            if (m37867 != null) {
                                arrayList.add(new C11187(m37867));
                            }
                        }
                    }
                    sb.append("(?:");
                    C19846.forEach(linkedHashSet, new Consumer() { // from class: l.֫ᩴܽ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void n(Object obj) {
                            String str3 = (String) obj;
                            if (z) {
                                str3 = C11459.m28261(str3);
                            }
                            StringBuilder sb3 = sb;
                            sb3.append(str3);
                            sb3.append('|');
                        }
                    });
                    sb.delete(sb.length() - 1, sb.length());
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                i4 = -1;
                i = m9496;
            } else {
                sb.append((char) codePointAt);
                i++;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String[] m47943(String str) {
        int i;
        if (str.length() == m47937(1, str)) {
            return new String[]{str};
        }
        if (str.length() == m47937(2, str)) {
            int codePointAt = Character.codePointAt(str, 0);
            int codePointAt2 = Character.codePointAt(str, Character.charCount(codePointAt));
            if (C20049.m46236(codePointAt2) == C20049.m46236(codePointAt)) {
                return new String[]{str};
            }
            StringBuilder sb = new StringBuilder(2);
            sb.appendCodePoint(codePointAt2);
            sb.appendCodePoint(codePointAt);
            return new String[]{str, sb.toString()};
        }
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            i3++;
            int i4 = i2 + 1;
            i2 = (Character.isHighSurrogate(str.charAt(i2)) && i4 < length && Character.isLowSurrogate(str.charAt(i4))) ? i2 + 2 : i4;
        }
        if (i3 > 12) {
            throw new OutOfMemoryError("Pattern too complex");
        }
        int i5 = 1;
        for (int i6 = 2; i6 <= i3; i6++) {
            i5 *= i6;
        }
        String[] strArr = new String[i5];
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int codePointAt3 = Character.codePointAt(str, i7);
            iArr[i8] = codePointAt3;
            iArr2[i8] = C20049.m46236(codePointAt3);
            i7 += Character.charCount(codePointAt3);
        }
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        boolean[] zArr = new boolean[i3];
        int i9 = 0;
        int i10 = 0;
        while (i9 >= 0) {
            int i11 = iArr4[i9];
            iArr4[i9] = i11 + 1;
            if (i11 == i3) {
                iArr4[i9] = 0;
                i9--;
                if (i9 >= 0) {
                    zArr[iArr3[i9]] = false;
                }
            } else if (!zArr[i11]) {
                while (true) {
                    if (i < i11) {
                        i = (zArr[i] || iArr2[i] != iArr2[i11]) ? i + 1 : 0;
                    } else {
                        iArr3[i9] = i11;
                        if (i9 == i3 - 1) {
                            StringBuilder sb2 = new StringBuilder(str.length());
                            for (int i12 = 0; i12 < i3; i12++) {
                                sb2.appendCodePoint(iArr[iArr3[i12]]);
                            }
                            strArr[i10] = sb2.toString();
                            i10++;
                        } else {
                            zArr[i11] = true;
                            i9++;
                        }
                    }
                }
            }
        }
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int[] m47933(int[] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f67940;
        int i6 = 0;
        while (true) {
            i = i5 - 1;
            if (i6 >= i) {
                break;
            }
            int[] iArr2 = this.f67952;
            if (iArr2[i6] == 92) {
                if (iArr2[i6 + 1] == 81) {
                    break;
                }
                i6 += 2;
            } else {
                i6++;
            }
        }
        if (i6 >= i) {
            return iArr;
        }
        int i7 = i6 + 2;
        long j = 3 * (i5 - i7);
        long j2 = (int) j;
        try {
            if (j != j2) {
                throw new ArithmeticException();
            }
            long j3 = i7 + j2;
            int i8 = (int) j3;
            if (j3 != i8) {
                throw new ArithmeticException();
            }
            int[] iArr3 = new int[i8];
            System.arraycopy(this.f67952, 0, iArr3, 0, i6);
            int[] iArr4 = iArr == null ? null : new int[i8];
            if (iArr4 != null) {
                System.arraycopy(iArr, 0, iArr4, 0, i6);
            }
            loop1: while (true) {
                boolean z = true;
                boolean z2 = true;
                while (i7 < i5) {
                    int i9 = i7 + 1;
                    int i10 = this.f67952[i7];
                    int i11 = -1;
                    if (!C22165.m49800(i10) || C22165.m49801(i10, 768)) {
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                    } else if (C22165.m49802(i10)) {
                        if (z) {
                            iArr3[i6] = 92;
                            iArr3[i6 + 1] = 120;
                            i4 = i6 + 3;
                            iArr3[i6 + 2] = 51;
                        } else {
                            i4 = i6;
                        }
                        i2 = i4 + 1;
                        iArr3[i4] = i10;
                    } else if (i10 != 92) {
                        if (z2) {
                            i3 = i6 + 1;
                            iArr3[i6] = 92;
                        } else {
                            i3 = i6;
                        }
                        i2 = i3 + 1;
                        iArr3[i3] = i10;
                    } else if (!z2) {
                        int[] iArr5 = this.f67952;
                        if (iArr5[i9] == 81) {
                            break;
                        }
                        i2 = i6 + 1;
                        iArr3[i6] = i10;
                        if (i9 != i5) {
                            iArr3[i2] = iArr5[i9];
                            i2 = i6 + 2;
                            i11 = i9;
                            i9 = i7 + 2;
                        }
                    } else if (this.f67952[i9] == 69) {
                        z2 = false;
                        i9 = i7 + 2;
                        i2 = i6;
                    } else {
                        iArr3[i6] = 92;
                        i2 = i6 + 2;
                        iArr3[i6 + 1] = 92;
                    }
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, i6, i2, iArr[i7]);
                        if (i11 >= 0) {
                            iArr4[i2 - 1] = iArr[i11];
                        }
                    }
                    z = false;
                    i7 = i9;
                    i6 = i2;
                }
                i7 += 2;
            }
            this.f67940 = i6;
            int i12 = i6 + 2;
            this.f67952 = Arrays.copyOf(iArr3, i12);
            if (iArr4 == null) {
                return null;
            }
            int[] copyOf = Arrays.copyOf(iArr4, i12);
            copyOf[i6] = iArr[i5];
            copyOf[i6 + 1] = iArr[i5 + 1];
            return copyOf;
        } catch (ArithmeticException unused) {
            throw new OutOfMemoryError("Required pattern length too large");
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m47944() {
        int length = this.f67957.length();
        this.f67952 = new int[length + 2];
        int i = 0;
        this.f67959 = false;
        int i2 = 0;
        while (i < length) {
            int codePointAt = this.f67957.codePointAt(i);
            if (C14403.m34428(codePointAt)) {
                this.f67959 = true;
            }
            this.f67952[i2] = codePointAt;
            i += Character.charCount(codePointAt);
            i2++;
        }
        this.f67940 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0085 m47922(C5855 c5855, boolean z) {
        C0085 c5025;
        if (!z) {
            C0791 m2995 = C0791.m2995(c5855);
            if (m2995 != null) {
                return m2995;
            }
            C14902 m35356 = C14902.m35356(c5855);
            if (m35356 != null) {
                return m35356;
            }
            if (c5855 instanceof C9259) {
                c5025 = new C19843((C9259) c5855);
            } else {
                c5025 = c5855 instanceof C19822 ? new C5025((C19822) c5855) : null;
            }
            C7847 m21031 = C7847.m21031(c5855);
            if (m21031 != null) {
                return m21031;
            }
            C21254 m48260 = C21254.m48260(c5855, c5025);
            if (m48260 != null) {
                return m48260;
            }
            if (c5025 != null) {
                return c5025;
            }
        }
        if (z) {
            return new C21959(c5855);
        }
        return new C0085(c5855);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m47954() {
        HashMap hashMap = this.f67944;
        if (hashMap != null) {
            return hashMap;
        }
        HashMap hashMap2 = new HashMap(2);
        this.f67944 = hashMap2;
        return hashMap2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m47942(int i) {
        return (i & this.f67956) != 0;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m47949() {
        int i = this.f67952[this.f67954];
        return m47942(4) ? m47951(i) : i;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m47934() {
        int[] iArr = this.f67952;
        int i = this.f67954;
        this.f67954 = i + 1;
        int i2 = iArr[i];
        return m47942(4) ? m47945(i2) : i2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m47950() {
        int[] iArr = this.f67952;
        int i = this.f67954 + 1;
        this.f67954 = i;
        int i2 = iArr[i];
        return m47942(4) ? m47951(i2) : i2;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m47952() {
        int i = this.f67954;
        int i2 = this.f67952[i + 1];
        this.f67954 = i + 2;
        return i2;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m47936() {
        this.f67954--;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C12869 m47947(String str) {
        return new C12869(str, this.f67957, this.f67954 - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a4, code lost:
    
        if (r3 <= 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00a6, code lost:
    
        r8.f67954 = r2;
        r3 = r3 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0121  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C5855 m47938() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21065.m47938():l.ۛۚܽ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47940(int i, int i2) {
        int length = this.f67942.length;
        if (i2 - length >= 0) {
            int i3 = (i2 + 1) - length;
            int max = Math.max(i3, length) + length;
            if (max <= 0 || max > 2147483639) {
                max = length + i3;
                if (max < 0) {
                    throw new OutOfMemoryError(C19373.m44634("Required array length ", length, " + ", " is too large", i3));
                }
                if (max <= 2147483639) {
                    max = 2147483639;
                }
            }
            this.f67942 = Arrays.copyOf(this.f67942, max);
        }
        this.f67942[i2] = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03aa  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m47920(boolean r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21065.m47920(boolean, boolean, boolean):int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC10795 m47946() {
        InterfaceC10795 m34189;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m47939(true));
        while (true) {
            C17536 c17536 = (C17536) C18566.m43105(arrayList, 1);
            int i = c17536.f53553;
            if (!c17536.f53556) {
                if (i != 0) {
                    if (i != 38) {
                        if (i == 91) {
                            arrayList.add(m47939(true));
                        } else if (i == 93 && (!c17536.f53551.m34195() || c17536.f53557)) {
                            if (c17536.f53555) {
                                m47950();
                            }
                            if (c17536.f53557) {
                                m34189 = c17536.f53551.m34195() ? c17536.f53552 : c17536.f53552.mo2464(c17536.f53551.m34189());
                                if (c17536.f53559) {
                                    m34189 = m34189.negate();
                                }
                            } else {
                                c17536.f53551.m34193(c17536.f53559);
                                m34189 = c17536.f53551.m34189();
                            }
                            arrayList.remove(arrayList.size() - 1);
                            if (arrayList.isEmpty()) {
                                return m34189;
                            }
                            C17536 c175362 = (C17536) C18566.m43105(arrayList, 1);
                            if (c175362.f53556) {
                                InterfaceC10795 interfaceC10795 = c175362.f53558;
                                if (interfaceC10795 != null) {
                                    m34189 = interfaceC10795.mo2466(m34189);
                                }
                                c175362.f53558 = m34189;
                            } else {
                                c175362.f53551.m34192(m34189);
                            }
                            c175362.f53553 = m47949();
                        }
                    } else if (m47950() == 38) {
                        c17536.f53553 = m47950();
                        c17536.f53554 = c17536.f53557 ? c17536.f53551.m34195() ? c17536.f53552 : c17536.f53552.mo2464(c17536.f53551.m34189()) : c17536.f53551.m34189();
                        c17536.f53558 = null;
                        c17536.f53556 = true;
                    } else {
                        m47936();
                    }
                } else if (this.f67954 >= this.f67940) {
                    throw m47947("Unclosed character class");
                }
                C14321 c14321 = c17536.f53551;
                int m47949 = m47949();
                if (m47949 == 92) {
                    int[] iArr = this.f67952;
                    int i2 = this.f67954;
                    int i3 = i2 + 1;
                    this.f67954 = i3;
                    int i4 = iArr[i3];
                    if (i4 == 112 || i4 == 80) {
                        boolean z = i4 == 80;
                        if (m47950() != 123) {
                            m47936();
                            r5 = true;
                        }
                        c14321.m34192(m47928(r5, z));
                    } else {
                        boolean z2 = iArr[i2 + 2] == 45;
                        m47936();
                        m47949 = m47920(true, true, z2);
                        if (m47949 == -1) {
                            c14321.m34192(this.f67945);
                        }
                    }
                    c17536.f53553 = m47949();
                } else {
                    m47950();
                }
                if (m47949 < 0) {
                    throw m47947("Unexpected character '" + ((char) m47949) + "'");
                }
                if (m47949() == 45) {
                    int i5 = this.f67952[this.f67954 + 1];
                    if (i5 == 91) {
                        c14321.m34190(m47949);
                    } else if (i5 != 93) {
                        m47950();
                        int m479492 = m47949();
                        if (m479492 == 92) {
                            m479492 = m47920(true, false, true);
                        } else {
                            m47950();
                        }
                        if (m479492 < m47949) {
                            throw m47947("Illegal character range");
                        }
                        c14321.m34194(m47949, m479492);
                    }
                    c17536.f53553 = m47949();
                }
                c14321.m34190(m47949);
                c17536.f53553 = m47949();
            } else if (i == 93 || i == 38) {
                InterfaceC10795 interfaceC107952 = c17536.f53558;
                if (interfaceC107952 == null) {
                    throw m47947("Bad intersection syntax");
                }
                c17536.f53552 = c17536.f53554.mo2464(interfaceC107952);
                c17536.f53557 = true;
                c17536.f53556 = false;
                c17536.f53551 = new C14321(this.f67956);
            } else {
                if (i != 91) {
                    m47936();
                }
                arrayList.add(m47939(i == 91));
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C17536 m47939(boolean z) {
        C17536 c17536 = new C17536(this.f67956, z);
        int m47950 = m47950();
        c17536.f53553 = m47950;
        if (m47950 == 94 && this.f67952[this.f67954 - 1] == 91) {
            c17536.f53553 = m47950();
            c17536.f53559 = true;
        }
        return c17536;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b0, code lost:
    
        if (r7.equals("script") == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x014e  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.InterfaceC10795 m47928(boolean r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21065.m47928(boolean, boolean):l.ۧۚܽ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23494 m47929(InterfaceC10795 interfaceC10795) {
        if (interfaceC10795 == null) {
            return null;
        }
        if (interfaceC10795 instanceof InterfaceC21938) {
            return new C19822((InterfaceC21938) interfaceC10795);
        }
        this.f67959 = true;
        return new C23494(interfaceC10795);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m47921(int i) {
        StringBuilder sb = new StringBuilder();
        if (C22165.m49801(i, 768)) {
            do {
                sb.append((char) i);
                i = m47934();
            } while (C22165.m49801(i, Params.POLY_BYTES));
            if (i != 62) {
                throw m47947("named capturing group is missing trailing '>'");
            }
            return sb.toString();
        }
        throw m47947("capturing group name does not start with a Latin letter");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5150 m47925(boolean z) {
        int i;
        int i2 = this.f67949;
        this.f67949 = i2 + 1;
        if (z) {
            i = 0;
        } else {
            i = this.f67950;
            this.f67950 = i + 1;
        }
        C5150 c5150 = new C5150(i2);
        C0916 c0916 = new C0916(i2, i);
        this.f67941 = c0916;
        c5150.f16094 = c0916;
        if (!z && i < 10) {
            this.f67955[i] = c5150;
        }
        return c5150;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private EnumC1497 m47953() {
        int m47950 = m47950();
        if (m47950 == 63) {
            m47950();
            return EnumC1497.LAZY;
        }
        if (m47950 == 43) {
            m47950();
            return EnumC1497.POSSESSIVE;
        }
        return EnumC1497.GREEDY;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5855 m47927(C5855 c5855, int i) {
        EnumC1497 m47953 = m47953();
        if (m47953 == EnumC1497.GREEDY) {
            if (c5855 instanceof C19822) {
                return new C4299((C19822) c5855, i);
            }
            if (c5855 instanceof C2182) {
                return new C3593(i);
            }
            if (c5855 instanceof C10877) {
                return new C16520(i);
            }
            if (c5855 instanceof C8678) {
                return new C15732(i);
            }
            if (c5855 instanceof C23494) {
                return new C6561((C23494) c5855, i);
            }
        }
        return new C20673(c5855, i, Integer.MAX_VALUE, m47953);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5855 m47926(C5855 c5855) {
        int m47949 = m47949();
        int i = 0;
        if (m47949 == 42) {
            return m47927(c5855, 0);
        }
        if (m47949 == 43) {
            return m47927(c5855, 1);
        }
        if (m47949 == 63) {
            return new C10670(c5855, m47953());
        }
        if (m47949 != 123) {
            return c5855;
        }
        int m47952 = m47952();
        if (!C22165.m49802(m47952)) {
            throw m47947("Illegal repetition");
        }
        int i2 = 0;
        while (true) {
            long j = 10;
            long j2 = i2 * j;
            long j3 = (int) j2;
            if (j2 != j3) {
                throw new ArithmeticException();
            }
            long j4 = j3 + (m47952 - 48);
            int i3 = (int) j4;
            if (j4 != i3) {
                throw new ArithmeticException();
            }
            try {
                int m47934 = m47934();
                if (!C22165.m49802(m47934)) {
                    if (m47934 == 44) {
                        m47934 = m47934();
                        if (m47934 == 125) {
                            m47936();
                            return m47927(c5855, i3);
                        }
                        while (C22165.m49802(m47934)) {
                            long j5 = i * j;
                            long j6 = (int) j5;
                            if (j5 != j6) {
                                throw new ArithmeticException();
                            }
                            long j7 = j6 + (m47934 - 48);
                            i = (int) j7;
                            if (j7 != i) {
                                throw new ArithmeticException();
                            }
                            m47934 = m47934();
                        }
                    } else {
                        i = i3;
                    }
                    if (m47934 != 125) {
                        throw m47947("Unclosed counted closure");
                    }
                    if (i < i3) {
                        throw m47947("Illegal repetition range");
                    }
                    m47936();
                    return (i3 == 0 && i == 1) ? new C10670(c5855, m47953()) : new C20673(c5855, i3, i, m47953());
                }
                i2 = i3;
                m47952 = m47934;
            } catch (ArithmeticException unused) {
                throw m47947("Illegal repetition range");
            }
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private int m47935() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int m47934 = m47934();
            if (!C22165.m49801(m47934, 32768)) {
                throw m47947("Illegal Unicode escape sequence");
            }
            i = (i * 16) + C22165.m49803(m47934);
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m47937(int i, String str) {
        int i2 = 0;
        if (i == 1 && str.length() > 0 && !Character.isHighSurrogate(str.charAt(0))) {
            return 1;
        }
        int length = str.length();
        if (i >= 0) {
            for (int i3 = 0; i2 < length && i3 < i; i3++) {
                int i4 = i2 + 1;
                i2 = (Character.isHighSurrogate(str.charAt(i2)) && i4 < length && Character.isLowSurrogate(str.charAt(i4))) ? i2 + 2 : i4;
            }
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2203 m47924(int i, boolean z, int[] iArr) {
        int[] iArr2 = new int[i];
        int i2 = 0;
        if (!m47942(2)) {
            while (i2 < i) {
                iArr2[i2] = iArr[i2];
                i2++;
            }
            return z ? new C3614(iArr2) : new C9259(iArr2);
        }
        if (m47942(64)) {
            while (i2 < i) {
                iArr2[i2] = C3395.m10356(iArr[i2]);
                i2++;
            }
            return z ? new C19137(iArr2) : new C18431(iArr2);
        }
        while (i2 < i) {
            iArr2[i2] = C22165.m49804(iArr[i2]);
            i2++;
        }
        return z ? new C15607(iArr2) : new C8553(iArr2);
    }
}
