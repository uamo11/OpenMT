package l;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: C8PP */
/* renamed from: l.᩻᩵ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23904 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77286;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77287;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77288;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f77289 = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f77290;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final PointF f77291;

    static {
        String str = C3603.f11424;
        Locale locale = Locale.US;
        f77286 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f77288 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f77287 = Pattern.compile("\\\\an(\\d+)");
    }

    public C23904(int i, PointF pointF) {
        this.f77290 = i;
        this.f77291 = pointF;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23904 m52657(String str) {
        int i;
        Matcher matcher = f77289.matcher(str);
        PointF pointF = null;
        int i2 = -1;
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            try {
                PointF m52658 = m52658(group);
                if (m52658 != null) {
                    pointF = m52658;
                }
            } catch (RuntimeException unused) {
            }
            try {
                Matcher matcher2 = f77287.matcher(group);
                if (matcher2.find()) {
                    String group2 = matcher2.group(1);
                    group2.getClass();
                    i = C6971.m18846(group2);
                } else {
                    i = -1;
                }
                if (i != -1) {
                    i2 = i;
                }
            } catch (RuntimeException unused2) {
            }
        }
        return new C23904(i2, pointF);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m52659(String str) {
        return f77289.matcher(str).replaceAll("");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static PointF m52658(String str) {
        String group;
        String group2;
        Matcher matcher = f77286.matcher(str);
        Matcher matcher2 = f77288.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                C19956.m46035("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
