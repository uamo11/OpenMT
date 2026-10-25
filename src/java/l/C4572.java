package l;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 39WK */
/* renamed from: l.ۙۢ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4572 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f14588 = Pattern.compile("^((.*)\\._)?_?(.*)\\._sub\\._([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f14587 = Pattern.compile("^((.*)?\\._)?([^.]*)\\._([^.]*)\\.(.*)\\.?$");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m13431(String str) {
        String m46321;
        String substring;
        String str2;
        String str3;
        String str4;
        String m13430;
        String m134302;
        String m134303;
        String lowerCase = str.toLowerCase();
        String str5 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int indexOf = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            m46321 = C20095.m46321(str.substring(0, indexOf));
            substring = str.substring(indexOf);
        } else if (!lowerCase.contains("_") && lowerCase.contains(".")) {
            int indexOf2 = lowerCase.indexOf(46);
            m46321 = C20095.m46321(str.substring(0, indexOf2));
            substring = C20095.m46321(str.substring(indexOf2));
        } else {
            Matcher matcher = f14588.matcher(lowerCase);
            if (matcher.matches()) {
                m13430 = m13430(str, matcher, 2);
                str5 = m13430(str, matcher, 3);
                m134302 = m13430(str, matcher, 4);
                str3 = m13430(str, matcher, 5);
                m134303 = m13430(str, matcher, 6);
            } else {
                Matcher matcher2 = f14587.matcher(lowerCase);
                if (matcher2.matches()) {
                    m13430 = m13430(str, matcher2, 2);
                    m134302 = m13430(str, matcher2, 3);
                    str3 = m13430(str, matcher2, 4);
                    m134303 = m13430(str, matcher2, 5);
                } else {
                    str2 = "";
                    str4 = str2;
                    str3 = str4;
                    String m463212 = C20095.m46321(lowerCase);
                    String m463213 = C20095.m46321(str5);
                    HashMap hashMap = new HashMap(5);
                    hashMap.put(EnumC12250.Instance, str2);
                    hashMap.put(EnumC12250.Application, m463212);
                    hashMap.put(EnumC12250.Protocol, str3);
                    hashMap.put(EnumC12250.Domain, m463213);
                    hashMap.put(EnumC12250.Subtype, str4);
                    return hashMap;
                }
            }
            String str6 = m134303;
            str2 = m13430;
            lowerCase = m134302;
            String str7 = str5;
            str5 = str6;
            str4 = str7;
            String m4632122 = C20095.m46321(lowerCase);
            String m4632132 = C20095.m46321(str5);
            HashMap hashMap2 = new HashMap(5);
            hashMap2.put(EnumC12250.Instance, str2);
            hashMap2.put(EnumC12250.Application, m4632122);
            hashMap2.put(EnumC12250.Protocol, str3);
            hashMap2.put(EnumC12250.Domain, m4632132);
            hashMap2.put(EnumC12250.Subtype, str4);
            return hashMap2;
        }
        lowerCase = "";
        str3 = lowerCase;
        str5 = substring;
        str2 = m46321;
        str4 = str3;
        String m46321222 = C20095.m46321(lowerCase);
        String m46321322 = C20095.m46321(str5);
        HashMap hashMap22 = new HashMap(5);
        hashMap22.put(EnumC12250.Instance, str2);
        hashMap22.put(EnumC12250.Application, m46321222);
        hashMap22.put(EnumC12250.Protocol, str3);
        hashMap22.put(EnumC12250.Domain, m46321322);
        hashMap22.put(EnumC12250.Subtype, str4);
        return hashMap22;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13430(String str, Matcher matcher, int i) {
        return matcher.start(i) != -1 ? str.substring(matcher.start(i), matcher.end(i)) : "";
    }
}
