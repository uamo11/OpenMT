package l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.am;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.server.IShizukuService;

/* compiled from: E8SE */
/* renamed from: l.᩺᩵ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23198 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74573 = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74574 = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map f74575;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Map f74576;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f74576 = C20195.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f74575 = C20195.unmodifiableMap(hashMap2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3443 m51479(C17714 c17714, ArrayList arrayList) {
        c17714.getClass();
        Charset charset = StandardCharsets.UTF_8;
        String m41474 = c17714.m41474(charset);
        if (m41474 != null) {
            Pattern pattern = f74573;
            Matcher matcher = pattern.matcher(m41474);
            if (matcher.matches()) {
                return m51478(null, matcher, c17714, arrayList);
            }
            String m414742 = c17714.m41474(charset);
            if (m414742 != null) {
                Matcher matcher2 = pattern.matcher(m414742);
                if (matcher2.matches()) {
                    return m51478(m41474.trim(), matcher2, c17714, arrayList);
                }
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21927 m51480(String str) {
        C11910 c11910 = new C11910();
        m51482(str, c11910);
        return c11910.m29043();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SpannedString m51476(String str, String str2, List list) {
        char c;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    substring.getClass();
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            C19956.m46037("ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt == '<') {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        C22632.m50631(!trim.isEmpty());
                        String str3 = C3603.f11424;
                        String str4 = trim.split("[ \\.]", 2)[0];
                        str4.getClass();
                        switch (str4.hashCode()) {
                            case 98:
                                if (str4.equals("b")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case q.f /* 99 */:
                                if (str4.equals(am.aF)) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                                if (str4.equals(am.aC)) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                if (str4.equals(am.aH)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 118:
                                if (str4.equals(am.aE)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3314158:
                                if (str4.equals("lang")) {
                                    c = 6;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
                                    c = 7;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                if (!z) {
                                    if (!z2) {
                                        arrayDeque.push(C10499.m26400(spannableStringBuilder.length(), substring2));
                                        break;
                                    }
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        C10499 c10499 = (C10499) arrayDeque.pop();
                                        m51481(str, c10499, arrayList, spannableStringBuilder, list);
                                        if (!arrayDeque.isEmpty()) {
                                            arrayList.add(new C12615(c10499, spannableStringBuilder.length()));
                                        } else {
                                            arrayList.clear();
                                        }
                                        if (c10499.f31494.equals(str4)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = i2;
            } else {
                spannableStringBuilder.append(charAt);
                i++;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m51481(str, (C10499) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m51481(str, C10499.m26399(), Collections.EMPTY_LIST, spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3443 m51478(String str, Matcher matcher, C17714 c17714, ArrayList arrayList) {
        C11910 c11910 = new C11910();
        try {
            String group = matcher.group(1);
            group.getClass();
            c11910.f35597 = C7676.m20559(group);
            String group2 = matcher.group(2);
            group2.getClass();
            c11910.f35596 = C7676.m20559(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            m51482(group3, c11910);
            StringBuilder sb = new StringBuilder();
            c17714.getClass();
            while (true) {
                String m41474 = c17714.m41474(StandardCharsets.UTF_8);
                if (!TextUtils.isEmpty(m41474)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(m41474.trim());
                } else {
                    c11910.f35605 = m51476(str, sb.toString(), arrayList);
                    return new C3443(c11910.m29043().m49383(), c11910.f35597, c11910.f35596);
                }
            }
        } catch (IllegalArgumentException unused) {
            C19956.m46037("Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (r3.equals("start") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0078, code lost:
    
        if (r2.equals("center") == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m51482(java.lang.String r11, l.C11910 r12) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23198.m51482(java.lang.String, l.ۨ᩵ۧ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m51484(String str, C11910 c11910) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    C19956.m46037("Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c11910.f35602 = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c11910.f35600 = C7676.m20557(str);
            c11910.f35604 = 0;
        } else {
            c11910.f35600 = Integer.parseInt(str);
            c11910.f35604 = 1;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51481(String str, C10499 c10499, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c;
        C13320 c13320;
        C10499 c104992;
        C10499 c104993;
        C10499 c104994;
        int i;
        int i2 = c10499.f31495;
        int length = spannableStringBuilder.length();
        String str2 = c10499.f31494;
        str2.getClass();
        int i3 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case q.f /* 99 */:
                if (str2.equals(am.aF)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                if (str2.equals(am.aC)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                if (str2.equals(am.aH)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 118:
                if (str2.equals(am.aE)) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                for (String str3 : c10499.f31493) {
                    Map map = f74576;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i2, length, 33);
                    } else {
                        Map map2 = f74575;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new C11344(c10499.f31496), i2, length, 33);
                break;
            case 7:
                int m51483 = m51483(list2, str, c10499);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                c13320 = C12615.f38020;
                Collections.sort(arrayList, c13320);
                int i4 = c10499.f31495;
                int i5 = 0;
                int i6 = 0;
                while (i5 < arrayList.size()) {
                    c104992 = ((C12615) arrayList.get(i5)).f38022;
                    if ("rt".equals(c104992.f31494)) {
                        C12615 c12615 = (C12615) arrayList.get(i5);
                        c104993 = c12615.f38022;
                        int m514832 = m51483(list2, str, c104993);
                        if (m514832 == i3) {
                            m514832 = m51483 != i3 ? m51483 : 1;
                        }
                        c104994 = c12615.f38022;
                        int i7 = c104994.f31495 - i6;
                        i = c12615.f38021;
                        int i8 = i - i6;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i7, i8);
                        spannableStringBuilder.delete(i7, i8);
                        spannableStringBuilder.setSpan(new C9933(subSequence.toString(), m514832), i4, i7, 33);
                        i6 = subSequence.length() + i6;
                        i4 = i7;
                    }
                    i5++;
                    i3 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList m51477 = m51477(list2, str, c10499);
        for (int i9 = 0; i9 < m51477.size(); i9++) {
            C4854 c4854 = ((C6265) m51477.get(i9)).f19402;
            if (c4854.m14134() != -1) {
                C6322.m17573(spannableStringBuilder, new StyleSpan(c4854.m14134()), i2, length);
            }
            if (c4854.m14135()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, length, 33);
            }
            if (c4854.m14141()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
            }
            if (c4854.m14136()) {
                C6322.m17573(spannableStringBuilder, new ForegroundColorSpan(c4854.m14142()), i2, length);
            }
            if (c4854.m14150()) {
                C6322.m17573(spannableStringBuilder, new BackgroundColorSpan(c4854.m14125()), i2, length);
            }
            if (c4854.m14146() != null) {
                C6322.m17573(spannableStringBuilder, new TypefaceSpan(c4854.m14146()), i2, length);
            }
            int m14140 = c4854.m14140();
            if (m14140 == 1) {
                C6322.m17573(spannableStringBuilder, new AbsoluteSizeSpan((int) c4854.m14145(), true), i2, length);
            } else if (m14140 == 2) {
                C6322.m17573(spannableStringBuilder, new RelativeSizeSpan(c4854.m14145()), i2, length);
            } else if (m14140 == 3) {
                C6322.m17573(spannableStringBuilder, new RelativeSizeSpan(c4854.m14145() / 100.0f), i2, length);
            }
            if (c4854.m14139()) {
                spannableStringBuilder.setSpan(new C12754(), i2, length, 33);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m51483(List list, String str, C10499 c10499) {
        ArrayList m51477 = m51477(list, str, c10499);
        for (int i = 0; i < m51477.size(); i++) {
            C4854 c4854 = ((C6265) m51477.get(i)).f19402;
            if (c4854.m14151() != -1) {
                return c4854.m14151();
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m51477(List list, String str, C10499 c10499) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C4854 c4854 = (C4854) list.get(i);
            int m14126 = c4854.m14126(str, c10499.f31494, c10499.f31493, c10499.f31496);
            if (m14126 > 0) {
                arrayList.add(new C6265(m14126, c4854));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
