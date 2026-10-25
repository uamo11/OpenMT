package com.amazonaws.util;

import com.amazonaws.internal.config.HostRegexToRegionMapping;
import com.amazonaws.internal.config.InternalConfig;
import java.net.URI;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C15472;
import l.C4860;

/* loaded from: classes.dex */
public class AwsHostNameUtils {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f822 = Pattern.compile("^(?:.+\\.)?s3[.-]([a-z0-9-]+)$");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m738(String str) {
        Matcher matcher = f822.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "us-east-1";
        }
        String substring = str.substring(lastIndexOf + 1);
        if (substring.equals("vpce")) {
            String[] split = str.split("\\.");
            if (split.length < 2) {
                return "us-east-1";
            }
            substring = split[split.length - 2];
        }
        return "us-gov".equals(substring) ? "us-gov-west-1" : substring;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m739(String str, String str2) {
        String str3;
        if (str == null) {
            throw new IllegalArgumentException("hostname cannot be null");
        }
        Iterator it = InternalConfig.Factory.m289().m288().iterator();
        while (true) {
            if (!it.hasNext()) {
                str3 = null;
                break;
            }
            HostRegexToRegionMapping hostRegexToRegionMapping = (HostRegexToRegionMapping) it.next();
            if (str.matches(hostRegexToRegionMapping.m283())) {
                str3 = hostRegexToRegionMapping.m284();
                break;
            }
        }
        if (str3 != null) {
            return str3;
        }
        if (str.endsWith(".amazonaws.com")) {
            return m738(C15472.m36561(14, 0, str));
        }
        if (str.endsWith(".amazonaws.com.cn")) {
            return m738(C15472.m36561(17, 0, str));
        }
        if (str2 == null) {
            return "us-east-1";
        }
        Matcher matcher = Pattern.compile("^(?:.+\\.)?" + Pattern.quote(str2) + "[.-]([a-z0-9-]+)\\.").matcher(str);
        return matcher.find() ? matcher.group(1) : "us-east-1";
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m740(URI uri) {
        String host = uri.getHost();
        if (!host.endsWith(".amazonaws.com")) {
            throw new IllegalArgumentException(C4860.m14172("Cannot parse a service name from an unrecognized endpoint (", host, ")."));
        }
        String substring = host.substring(0, host.indexOf(".amazonaws.com"));
        return (substring.endsWith(".s3") || f822.matcher(substring).matches()) ? "s3" : substring.indexOf(46) == -1 ? substring : substring.substring(0, substring.indexOf(46));
    }
}
