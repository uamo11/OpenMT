package l;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: 096Y */
/* renamed from: l.ܿۚ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17133 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f52484;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f52487 = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f52486 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f52485 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap hashMap = new HashMap();
        f52484 = hashMap;
        C12354.m29971(-984833, hashMap, "aliceblue", -332841, "antiquewhite");
        C15942.m37720(hashMap, "aqua", -16711681, -8388652, "aquamarine");
        C12354.m29971(-983041, hashMap, "azure", -657956, "beige");
        C12354.m29971(-6972, hashMap, "bisque", -16777216, "black");
        C12354.m29971(-5171, hashMap, "blanchedalmond", -16776961, "blue");
        C12354.m29971(-7722014, hashMap, "blueviolet", -5952982, "brown");
        C12354.m29971(-2180985, hashMap, "burlywood", -10510688, "cadetblue");
        C12354.m29971(-8388864, hashMap, "chartreuse", -2987746, "chocolate");
        C12354.m29971(-32944, hashMap, "coral", -10185235, "cornflowerblue");
        C12354.m29971(-1828, hashMap, "cornsilk", -2354116, "crimson");
        C15942.m37720(hashMap, "cyan", -16711681, -16777077, "darkblue");
        C12354.m29971(-16741493, hashMap, "darkcyan", -4684277, "darkgoldenrod");
        C15942.m37720(hashMap, "darkgray", -5658199, -16751616, "darkgreen");
        C15942.m37720(hashMap, "darkgrey", -5658199, -4343957, "darkkhaki");
        C12354.m29971(-7667573, hashMap, "darkmagenta", -11179217, "darkolivegreen");
        C12354.m29971(-29696, hashMap, "darkorange", -6737204, "darkorchid");
        C12354.m29971(-7667712, hashMap, "darkred", -1468806, "darksalmon");
        C12354.m29971(-7357297, hashMap, "darkseagreen", -12042869, "darkslateblue");
        hashMap.put("darkslategray", -13676721);
        hashMap.put("darkslategrey", -13676721);
        C15942.m37720(hashMap, "darkturquoise", -16724271, -7077677, "darkviolet");
        C12354.m29971(-60269, hashMap, "deeppink", -16728065, "deepskyblue");
        hashMap.put("dimgray", -9868951);
        hashMap.put("dimgrey", -9868951);
        C15942.m37720(hashMap, "dodgerblue", -14774017, -5103070, "firebrick");
        C12354.m29971(-1296, hashMap, "floralwhite", -14513374, "forestgreen");
        C15942.m37720(hashMap, "fuchsia", -65281, -2302756, "gainsboro");
        C12354.m29971(-460545, hashMap, "ghostwhite", -10496, "gold");
        hashMap.put("goldenrod", -2448096);
        hashMap.put("gray", -8355712);
        C12354.m29971(-16744448, hashMap, "green", -5374161, "greenyellow");
        C15942.m37720(hashMap, "grey", -8355712, -983056, "honeydew");
        C12354.m29971(-38476, hashMap, "hotpink", -3318692, "indianred");
        C12354.m29971(-11861886, hashMap, "indigo", -16, "ivory");
        C12354.m29971(-989556, hashMap, "khaki", -1644806, "lavender");
        C12354.m29971(-3851, hashMap, "lavenderblush", -8586240, "lawngreen");
        C12354.m29971(-1331, hashMap, "lemonchiffon", -5383962, "lightblue");
        C12354.m29971(-1015680, hashMap, "lightcoral", -2031617, "lightcyan");
        hashMap.put("lightgoldenrodyellow", -329006);
        hashMap.put("lightgray", -2894893);
        hashMap.put("lightgreen", -7278960);
        hashMap.put("lightgrey", -2894893);
        C12354.m29971(-18751, hashMap, "lightpink", -24454, "lightsalmon");
        C12354.m29971(-14634326, hashMap, "lightseagreen", -7876870, "lightskyblue");
        hashMap.put("lightslategray", -8943463);
        hashMap.put("lightslategrey", -8943463);
        C15942.m37720(hashMap, "lightsteelblue", -5192482, -32, "lightyellow");
        C12354.m29971(-16711936, hashMap, "lime", -13447886, "limegreen");
        hashMap.put("linen", -331546);
        hashMap.put("magenta", -65281);
        C12354.m29971(-8388608, hashMap, "maroon", -10039894, "mediumaquamarine");
        C12354.m29971(-16777011, hashMap, "mediumblue", -4565549, "mediumorchid");
        C12354.m29971(-7114533, hashMap, "mediumpurple", -12799119, "mediumseagreen");
        C12354.m29971(-8689426, hashMap, "mediumslateblue", -16713062, "mediumspringgreen");
        C12354.m29971(-12004916, hashMap, "mediumturquoise", -3730043, "mediumvioletred");
        C12354.m29971(-15132304, hashMap, "midnightblue", -655366, "mintcream");
        C12354.m29971(-6943, hashMap, "mistyrose", -6987, "moccasin");
        C12354.m29971(-8531, hashMap, "navajowhite", -16777088, "navy");
        C12354.m29971(-133658, hashMap, "oldlace", -8355840, "olive");
        C12354.m29971(-9728477, hashMap, "olivedrab", -23296, "orange");
        C12354.m29971(-47872, hashMap, "orangered", -2461482, "orchid");
        C12354.m29971(-1120086, hashMap, "palegoldenrod", -6751336, "palegreen");
        C12354.m29971(-5247250, hashMap, "paleturquoise", -2396013, "palevioletred");
        C12354.m29971(-4139, hashMap, "papayawhip", -9543, "peachpuff");
        C12354.m29971(-3308225, hashMap, "peru", -16181, "pink");
        C12354.m29971(-2252579, hashMap, "plum", -5185306, "powderblue");
        C12354.m29971(-8388480, hashMap, "purple", -10079335, "rebeccapurple");
        C12354.m29971(-65536, hashMap, "red", -4419697, "rosybrown");
        C12354.m29971(-12490271, hashMap, "royalblue", -7650029, "saddlebrown");
        C12354.m29971(-360334, hashMap, "salmon", -744352, "sandybrown");
        C12354.m29971(-13726889, hashMap, "seagreen", -2578, "seashell");
        C12354.m29971(-6270419, hashMap, "sienna", -4144960, "silver");
        C12354.m29971(-7876885, hashMap, "skyblue", -9807155, "slateblue");
        hashMap.put("slategray", -9404272);
        hashMap.put("slategrey", -9404272);
        C15942.m37720(hashMap, "snow", -1286, -16711809, "springgreen");
        C12354.m29971(-12156236, hashMap, "steelblue", -2968436, "tan");
        C12354.m29971(-16744320, hashMap, "teal", -2572328, "thistle");
        C12354.m29971(-40121, hashMap, "tomato", 0, "transparent");
        C12354.m29971(-12525360, hashMap, "turquoise", -1146130, "violet");
        C12354.m29971(-663885, hashMap, "wheat", -1, "white");
        C12354.m29971(-657931, hashMap, "whitesmoke", -256, "yellow");
        hashMap.put("yellowgreen", -6632142);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m40157(String str) {
        return m40156(str, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40155(String str) {
        return m40156(str, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m40156(String str, boolean z) {
        int parseInt;
        C22632.m50631(!TextUtils.isEmpty(str));
        String replace = str.replace(" ", "");
        if (replace.charAt(0) == '#') {
            int parseLong = (int) Long.parseLong(replace.substring(1), 16);
            if (replace.length() == 7) {
                return (-16777216) | parseLong;
            }
            if (replace.length() == 9) {
                return ((parseLong & 255) << 24) | (parseLong >>> 8);
            }
            throw new IllegalArgumentException();
        }
        if (replace.startsWith("rgba")) {
            Matcher matcher = (z ? f52485 : f52486).matcher(replace);
            if (matcher.matches()) {
                if (z) {
                    String group = matcher.group(4);
                    group.getClass();
                    parseInt = (int) (Float.parseFloat(group) * 255.0f);
                } else {
                    String group2 = matcher.group(4);
                    group2.getClass();
                    parseInt = Integer.parseInt(group2, 10);
                }
                String group3 = matcher.group(1);
                group3.getClass();
                int parseInt2 = Integer.parseInt(group3, 10);
                String group4 = matcher.group(2);
                group4.getClass();
                int parseInt3 = Integer.parseInt(group4, 10);
                String group5 = matcher.group(3);
                group5.getClass();
                return Color.argb(parseInt, parseInt2, parseInt3, Integer.parseInt(group5, 10));
            }
        } else if (replace.startsWith("rgb")) {
            Matcher matcher2 = f52487.matcher(replace);
            if (matcher2.matches()) {
                String group6 = matcher2.group(1);
                group6.getClass();
                int parseInt4 = Integer.parseInt(group6, 10);
                String group7 = matcher2.group(2);
                group7.getClass();
                int parseInt5 = Integer.parseInt(group7, 10);
                String group8 = matcher2.group(3);
                group8.getClass();
                return Color.rgb(parseInt4, parseInt5, Integer.parseInt(group8, 10));
            }
        } else {
            Integer num = (Integer) f52484.get(C15107.m35799(replace));
            if (num != null) {
                return num.intValue();
            }
        }
        throw new IllegalArgumentException();
    }
}
