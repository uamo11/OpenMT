package l;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Pair;
import bin.mt.plus.Features3;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* compiled from: D18B */
/* renamed from: l.ܿ֡ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16999 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f52136 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Boolean f52137;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final String f52138;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static InterfaceC8449 f52139;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C18955 f52140;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f52141;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Boolean f52142;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f52143;

    static {
        String path = Environment.getExternalStorageDirectory().getPath();
        f52138 = path;
        f52143 = (int) (System.currentTimeMillis() & 16777215);
        C18955 c18955 = new C18955();
        f52140 = c18955;
        f52141 = true;
        f52139 = new C23202(0);
        c18955.add(path);
        c18955.add("/sdcard");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39858() {
        return f52138;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C18955 m39876() {
        C19697 c19697;
        boolean z = f52141;
        C18955 c18955 = f52140;
        if (z && C22518.m50491() && !C3468.m10612()) {
            f52141 = false;
            LinkedList linkedList = new LinkedList(c18955);
            try {
                c19697 = C3468.m10607(false);
                while (!linkedList.isEmpty()) {
                    try {
                        C17642 m45366 = c19697.m45366(new File((String) linkedList.removeFirst()).getPath());
                        if (m45366.m41285() != null) {
                            String m41285 = m45366.m41285();
                            if (c18955.add(m41285)) {
                                linkedList.addLast(m41285);
                            }
                        }
                    } catch (Throwable unused) {
                        if (c19697 != null) {
                            c19697.m45389();
                        }
                        return c18955;
                    }
                }
                c19697.m45389();
                return c18955;
            } catch (Throwable unused2) {
                c19697 = null;
            }
        }
        return c18955;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39873(AbstractActivityC3346 abstractActivityC3346) {
        if (abstractActivityC3346.getIntent().getData() != null) {
            return false;
        }
        abstractActivityC3346.finish();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39862(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m39863(data);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39867(ActivityC2124 activityC2124) {
        Intent intent = activityC2124.getIntent();
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        }
        if (data == null) {
            throw new NullPointerException("Intent data is null: " + intent);
        }
        return m39863(data);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0172, code lost:
    
        if (r1.isDone() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0186, code lost:
    
        r1.cancel(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0184, code lost:
    
        if (r1.isDone() != false) goto L93;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.AbstractC15440 m39863(android.net.Uri r7) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16999.m39863(android.net.Uri):l.ܶ᩵ܿ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440[] m39875(String[] strArr) {
        AbstractC15440[] abstractC15440Arr = new AbstractC15440[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            abstractC15440Arr[i] = m39866(strArr[i], new String[0]);
        }
        return abstractC15440Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39860(String str, boolean z) {
        if (str.indexOf(0) >= 0 || str.startsWith("/") || str.startsWith("\\")) {
            throw new IOException("Unsafe archive entry path: ".concat(str));
        }
        if (str.length() >= 2 && Character.isLetter(str.charAt(0)) && str.charAt(1) == ':') {
            throw new IOException("Unsafe archive entry path: ".concat(str));
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 <= str.length(); i2++) {
            if (i2 == str.length() || str.charAt(i2) == '/' || str.charAt(i2) == '\\') {
                String substring = str.substring(i, i2);
                int i3 = i2 + 1;
                if (!substring.isEmpty() && !".".equals(substring)) {
                    if ("..".equals(substring)) {
                        if (arrayList.isEmpty()) {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        C18473.m42953(arrayList, 1);
                    } else {
                        if (substring.length() >= 2 && Character.isLetter(substring.charAt(0)) && substring.charAt(1) == ':') {
                            throw new IOException("Unsafe archive entry path: ".concat(str));
                        }
                        arrayList.add(m39880(substring));
                    }
                }
                i = i3;
            }
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((CharSequence) "/");
            }
        }
        String sb2 = sb.toString();
        if (z || !sb2.isEmpty()) {
            return sb2;
        }
        throw new IOException("Unsafe archive entry path: ".concat(str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m39881(String str, String str2) {
        if (!str2.isEmpty()) {
            int i = 0;
            if (str2.indexOf(0) < 0 && !str2.startsWith("/") && !str2.startsWith("\\")) {
                if (str2.length() >= 2 && Character.isLetter(str2.charAt(0)) && str2.charAt(1) == ':') {
                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                }
                String m39860 = m39860(str, false);
                ArrayList arrayList = new ArrayList();
                int lastIndexOf = m39860.lastIndexOf(47);
                if (lastIndexOf != -1) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < lastIndexOf; i3++) {
                        if (m39860.charAt(i3) == '/') {
                            arrayList.add(m39860.substring(i2, i3));
                            i2 = i3 + 1;
                        }
                    }
                    arrayList.add(m39860.substring(i2, lastIndexOf));
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                int i4 = 0;
                for (int i5 = 0; i5 <= str2.length(); i5++) {
                    if (i5 == str2.length() || str2.charAt(i5) == '/' || str2.charAt(i5) == '\\') {
                        String substring = str2.substring(i4, i5);
                        int i6 = i5 + 1;
                        if (!substring.isEmpty() && !".".equals(substring)) {
                            if ("..".equals(substring)) {
                                if (arrayList2.isEmpty()) {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                C18473.m42953(arrayList2, 1);
                            } else {
                                if (substring.length() >= 2 && Character.isLetter(substring.charAt(0)) && substring.charAt(1) == ':') {
                                    throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
                                }
                                arrayList2.add(m39880(substring));
                            }
                        }
                        i4 = i6;
                    }
                }
                while (i < arrayList.size() && i < arrayList2.size() && ((String) arrayList.get(i)).equals(arrayList2.get(i))) {
                    i++;
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i7 = i; i7 < arrayList.size(); i7++) {
                    arrayList3.add("..");
                }
                while (i < arrayList2.size()) {
                    arrayList3.add((String) arrayList2.get(i));
                    i++;
                }
                if (arrayList3.isEmpty()) {
                    return ".";
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb.append((CharSequence) "/");
                    }
                }
                return sb.toString();
            }
        }
        throw new IOException("Unsafe archive symbolic link target: ".concat(str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[SYNTHETIC] */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m39880(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r3 >= r0) goto L46
            char r4 = r7.charAt(r3)
            r5 = 62
            if (r4 == r5) goto L30
            r5 = 63
            if (r4 == r5) goto L30
            r5 = 8232(0x2028, float:1.1535E-41)
            r6 = 32
            if (r4 == r5) goto L32
            r5 = 8233(0x2029, float:1.1537E-41)
            if (r4 == r5) goto L32
            switch(r4) {
                case 9: goto L32;
                case 10: goto L32;
                case 11: goto L32;
                case 12: goto L32;
                case 13: goto L32;
                default: goto L22;
            }
        L22:
            switch(r4) {
                case 32: goto L32;
                case 34: goto L30;
                case 42: goto L30;
                case 58: goto L30;
                case 60: goto L30;
                case 92: goto L30;
                case 124: goto L30;
                case 133: goto L32;
                case 160: goto L32;
                case 5760: goto L32;
                case 8239: goto L32;
                case 8287: goto L32;
                case 12288: goto L32;
                default: goto L25;
            }
        L25:
            r5 = 8192(0x2000, float:1.148E-41)
            if (r4 < r5) goto L2e
            r5 = 8202(0x200a, float:1.1493E-41)
            if (r4 > r5) goto L2e
            goto L32
        L2e:
            r6 = r4
            goto L32
        L30:
            r6 = 95
        L32:
            if (r6 == r4) goto L3e
            if (r1 != 0) goto L3e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r7, r2, r3)
        L3e:
            if (r1 == 0) goto L43
            r1.append(r6)
        L43:
            int r3 = r3 + 1
            goto L7
        L46:
            if (r1 != 0) goto L49
            return r7
        L49:
            java.lang.String r7 = r1.toString()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16999.m39880(java.lang.String):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39866(String str, String... strArr) {
        String m39859;
        if (str.startsWith("content://") || str.startsWith("android.resource://")) {
            if (strArr.length != 0) {
                throw new IllegalArgumentException("Children must be empty when path is context uri");
            }
            return new C14798(Uri.parse(str));
        }
        if (str.startsWith("$RECYCLE.BIN$/")) {
            str = C21939.m49419().mo23554() + str.substring(13);
            if (C22518.m50492().mo2657() && (m39859 = m39859(str)) != null) {
                str = "/data/media/" + C16293.f50120.getName() + "/" + m39859;
            }
        }
        File file = new File(str);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            File file2 = new File(file, strArr[i]);
            i++;
            file = file2;
        }
        return m39864(file);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39864(File file) {
        Pair create;
        String path = file.getPath();
        if (Build.VERSION.SDK_INT >= 30) {
            Iterator it = m39876().iterator();
            while (true) {
                if (!it.hasNext()) {
                    create = Pair.create(0, null);
                    break;
                }
                String str = (String) it.next();
                if (m39872(path, str)) {
                    int length = str.length();
                    int i = length + 1;
                    if (m39871(path, i, "android", path.length(), 7)) {
                        int i2 = length + 9;
                        if (m39871(path, i2, e.m, path.length(), 4)) {
                            String m14337 = C4925.m14337();
                            if (m39871(path, length + 14, m14337, path.length(), m14337.length())) {
                                create = Pair.create(4, null);
                            } else {
                                create = Pair.create(2, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                            }
                        } else if (m39871(path, i2, "obb", path.length(), 3)) {
                            String m143372 = C4925.m14337();
                            if (m39871(path, length + 13, m143372, path.length(), m143372.length())) {
                                create = Pair.create(4, null);
                            } else {
                                create = Pair.create(3, path.substring(i, path.endsWith("/") ? path.length() - 1 : path.length()));
                            }
                        }
                    }
                    String m58 = path.length() == str.length() ? Features3.m58(path) : null;
                    if (m58 == null) {
                        m58 = "";
                    }
                    create = Pair.create(1, m58);
                }
            }
            int intValue = ((Integer) create.first).intValue();
            if (intValue == 1) {
                C15587 c15587 = new C15587(file, false);
                c15587.f48021 = (String) create.second;
                return c15587;
            }
            if (intValue == 2 || intValue == 3) {
                return m39865(file, (String) create.second, null);
            }
            if (intValue == 4) {
                C15587 c155872 = new C15587(file, true);
                c155872.f48021 = "";
                return c155872;
            }
        } else if (m39887(path)) {
            return new C15587(file, false);
        }
        if (m39884(path)) {
            return new C11293(file, true);
        }
        AbstractC15440 m24600 = C9672.m24600(file);
        if (m24600 != null) {
            return m24600;
        }
        C8966 m43532 = C18844.m43532(file);
        return m43532 != null ? m43532 : new C11293(file, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39865(File file, String str, C4527 c4527) {
        String str2;
        int i;
        if (str.regionMatches(true, 0, "Android/data", 0, 12)) {
            str2 = "Android/data";
            i = 14;
        } else {
            if (!str.regionMatches(true, 0, "Android/obb", 0, 11)) {
                throw new IllegalArgumentException("Path must be in Android/data or Android/obb: ".concat(str));
            }
            str2 = "Android/obb";
            i = 13;
        }
        if (!C22518.m50492().mo2656() && (m39883() || (m39886() && str.equalsIgnoreCase(str2)))) {
            return new C11893(new File(f52138, C20087.m46305(7, str, new StringBuilder("\u200bAndroid"))), false);
        }
        if (m39886()) {
            return new C12993(file, C20087.m46305(7, str, new StringBuilder("\u200bAndroid")), "\u200bAndroid", c4527);
        }
        if (Build.VERSION.SDK_INT < 33 || !str.regionMatches(true, 0, str2.concat("/"), 0, str2.length() + 1)) {
            return new C12993(file, str, str2, c4527);
        }
        int indexOf = str.indexOf(47, i);
        return indexOf == -1 ? new C12993(file, str, str, c4527) : new C12993(file, str, str.substring(0, indexOf), c4527);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m39877(String str) {
        return C19739.m45449(str) != null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m39887(String str) {
        Iterator it = m39876().iterator();
        while (it.hasNext()) {
            if (m39872(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m39878(String str, String str2) {
        if (!str.equals(str2)) {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            int lastIndexOf2 = str2.lastIndexOf(47) + 1;
            int length = str.length() - lastIndexOf;
            if (length != str2.length() - lastIndexOf2 || !str.regionMatches(true, lastIndexOf, str2, lastIndexOf2, length)) {
                return false;
            }
            Iterator it = m39876().iterator();
            int i = -1;
            int i2 = -1;
            while (it.hasNext()) {
                String str3 = (String) it.next();
                int length2 = str3.endsWith("/") ? str3.length() : str3.length() + 1;
                int i3 = (i >= 0 || str.length() <= length2 || !m39872(str, str3)) ? i : length2;
                int i4 = (i2 >= 0 || str2.length() <= length2 || !m39872(str2, str3)) ? i2 : length2;
                if (i3 < 0 || i4 < 0) {
                    i = i3;
                    i2 = i4;
                } else {
                    int length3 = str.length() - i3;
                    if (length3 != str2.length() - i4 || !str.regionMatches(true, i3, str2, i4, length3 - length)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39859(String str) {
        Iterator it = m39876().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (m39872(str, str2)) {
                int length = str2.endsWith("/") ? str2.length() : str2.length() + 1;
                if (str.length() > length) {
                    return str.substring(length);
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m39885(String str) {
        String m39859 = m39859(str);
        String str2 = f52138;
        if (m39859 != null) {
            return new File(str2, m39859).getPath();
        }
        return m39887(str) ? str2 : str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39872(String str, String str2) {
        return m39871(str, 0, str2, str.length(), str2.length());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39871(String str, int i, String str2, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > str.length() || i3 < 0 || i3 > str2.length()) {
            return false;
        }
        int i4 = i2 - i;
        if (i4 > 1 && str.charAt(i2 - 1) == '/') {
            i4--;
        }
        if (i3 > 1 && str2.charAt(i3 - 1) == '/') {
            i3--;
        }
        if (i3 <= i4 && str.regionMatches(true, i, str2, 0, i3)) {
            return i4 == i3 || (i3 == 1 && str2.charAt(0) == '/') || str.charAt(i + i3) == '/';
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m39884(String str) {
        String lowerCase = (str.endsWith("/") ? str : str.concat("/")).toLowerCase();
        if (lowerCase.startsWith(C4925.m14340().getAbsolutePath().toLowerCase() + "/")) {
            return true;
        }
        if (!str.startsWith("/data/")) {
            return false;
        }
        String lowerCase2 = C4925.m14337().toLowerCase();
        if (lowerCase.startsWith("/data/data/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user/0/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user_de/0/" + lowerCase2 + "/")) {
            return true;
        }
        if (lowerCase.startsWith("/data/user/999/" + lowerCase2 + "/")) {
            return true;
        }
        StringBuilder sb = new StringBuilder("/data/user_de/999/");
        sb.append(lowerCase2);
        sb.append("/");
        return lowerCase.startsWith(sb.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39868(AbstractC15440 abstractC15440, String str) {
        AbstractC15440 m36526;
        abstractC15440.mo23546();
        do {
            StringBuilder sb = new StringBuilder();
            int i = f52143;
            f52143 = i + 1;
            sb.append(i);
            sb.append(str);
            m36526 = abstractC15440.m36526(sb.toString());
        } while (m36526.mo23120());
        return m36526;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39869(InterfaceC8449 interfaceC8449) {
        f52139 = interfaceC8449;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m39879(AbstractC15440 abstractC15440) {
        InterfaceC15503 interfaceC15503;
        return ((abstractC15440.mo27917() && abstractC15440.mo27925().m27916()) || (interfaceC15503 = f52139.get()) == null || !interfaceC15503.mo36574(abstractC15440.mo23554())) ? false : true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m39882(AbstractC15440 abstractC15440) {
        InterfaceC15503 interfaceC15503 = f52139.get();
        if (interfaceC15503 != null) {
            interfaceC15503.mo36575(abstractC15440.mo23554());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39870(AbstractC15440 abstractC15440) {
        if (abstractC15440.mo27917() && abstractC15440.mo27925().m27916()) {
            return;
        }
        InterfaceC15503 interfaceC15503 = f52139.get();
        String mo23554 = abstractC15440.mo23554();
        if (interfaceC15503 == null || !interfaceC15503.mo36574(mo23554)) {
            return;
        }
        interfaceC15503.mo36575(mo23554);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m39883() {
        File[] listFiles;
        Boolean bool = f52142;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = f52138;
        if (Arrays.equals(new File(str, "Android").list(), new File(str, "\u200bAndroid").list()) && (listFiles = new File(str, "\u200bAndroid/data").listFiles()) != null) {
            int i = 0;
            for (File file : listFiles) {
                if (file.isDirectory()) {
                    try {
                        Os.access(file.getPath(), OsConstants.X_OK);
                        i++;
                        if (i == 20) {
                            break;
                        }
                    } catch (ErrnoException unused) {
                        f52142 = Boolean.FALSE;
                        f52137 = Boolean.TRUE;
                        return false;
                    }
                }
            }
            Boolean bool2 = Boolean.TRUE;
            f52142 = bool2;
            f52137 = bool2;
            return true;
        }
        Boolean bool3 = Boolean.FALSE;
        f52142 = bool3;
        f52137 = bool3;
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m39886() {
        if (f52137 == null) {
            m39883();
        }
        return f52137.booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m39861(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402) {
        String name = abstractC15440.getName();
        String name2 = abstractC154402.getName();
        if (name2.equals(name)) {
            return null;
        }
        if (name2.contains("\\") || name2.contains("/")) {
            return C4925.m14327(R.string.MT_Protector_res_0x7f1203ae);
        }
        if (name2.equalsIgnoreCase(name)) {
            if (abstractC154402.mo23120()) {
                List mo27931 = abstractC154402.m36514().mo27931();
                if (mo27931.contains(name) && mo27931.contains(name2)) {
                    if (abstractC154402.mo23113()) {
                        return C4925.m14327(R.string.MT_Protector_res_0x7f1208c2);
                    }
                    return C4925.m14327(R.string.MT_Protector_res_0x7f1208c1);
                }
            }
            AbstractC15440 m36520 = abstractC15440.m36520(".tmp");
            if (abstractC15440.mo23551(m36520) && m36520.mo23551(abstractC154402)) {
                return null;
            }
            if (name2.contains(":") || name2.contains("?") || name2.contains("*") || name2.contains("\"") || name2.contains("<") || name2.contains(">") || name2.contains("|")) {
                return C4925.m14327(R.string.MT_Protector_res_0x7f1203ae);
            }
            return C4925.m14327(R.string.MT_Protector_res_0x7f120881);
        }
        if (abstractC154402.mo23120()) {
            if (abstractC154402.mo23113()) {
                return C4925.m14327(R.string.MT_Protector_res_0x7f1208c2);
            }
            return C4925.m14327(R.string.MT_Protector_res_0x7f1208c1);
        }
        if (abstractC15440.mo23551(abstractC154402)) {
            return null;
        }
        return C4925.m14327(R.string.MT_Protector_res_0x7f120881);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39874(AbstractC15440 abstractC15440, List list) {
        String str;
        Set<String> set = (Set) C5378.stream(list).map(new C7680(0)).collect(C22976.toUnmodifiableSet());
        if (abstractC15440.mo36530() && abstractC15440.mo18540()) {
            return false;
        }
        for (String str2 : set) {
            int length = str2.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = null;
                    break;
                }
                char charAt = str2.charAt(0);
                if (charAt >= 'a' && charAt <= 'z') {
                    str = str2.toUpperCase();
                    break;
                }
                if (charAt >= 'A' && charAt <= 'Z') {
                    str = str2.toLowerCase();
                    break;
                }
                i++;
            }
            if (str != null && !set.contains(str)) {
                return !abstractC15440.m36526(str).mo23120();
            }
        }
        return true;
    }
}
