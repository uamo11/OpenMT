package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import l.C13325;

/* loaded from: classes.dex */
public class VersionInfoUtils {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f849 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Log f850 = LogFactory.m302(VersionInfoUtils.class);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile String f851;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m798() {
        if (f851 == null) {
            synchronized (VersionInfoUtils.class) {
                if (f851 == null) {
                    m799();
                }
            }
        }
        return f851;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m799() {
        StringBuilder m32307 = C13325.m32307(128, "aws-sdk-");
        m32307.append(StringUtils.m789("android"));
        m32307.append("/2.81.1 ");
        String property = System.getProperty("os.name");
        if (property != null) {
            property = property.replace(' ', '_');
        }
        m32307.append(property);
        m32307.append("/");
        String property2 = System.getProperty("os.version");
        if (property2 != null) {
            property2 = property2.replace(' ', '_');
        }
        m32307.append(property2);
        m32307.append(" ");
        String property3 = System.getProperty("java.vm.name");
        if (property3 != null) {
            property3 = property3.replace(' ', '_');
        }
        m32307.append(property3);
        m32307.append("/");
        String property4 = System.getProperty("java.vm.version");
        if (property4 != null) {
            property4 = property4.replace(' ', '_');
        }
        m32307.append(property4);
        m32307.append("/");
        String property5 = System.getProperty("java.version");
        if (property5 != null) {
            property5 = property5.replace(' ', '_');
        }
        m32307.append(property5);
        String property6 = System.getProperty("user.language");
        String property7 = System.getProperty("user.region");
        if (property6 != null && property7 != null) {
            m32307.append(" ");
            m32307.append(property6.replace(' ', '_'));
            m32307.append("_");
            m32307.append(property7.replace(' ', '_'));
        }
        f851 = m32307.toString();
    }
}
