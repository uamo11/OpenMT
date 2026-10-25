package l;

import android.text.TextUtils;

/* compiled from: 55EZ */
/* renamed from: l.ۡۧᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8845 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f26931;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f26933;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26932 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26930 = 0;

    public C8845(CharSequence charSequence) {
        this.f26933 = charSequence;
        this.f26931 = charSequence.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m22850() {
        int i = -1;
        int i2 = 1;
        while (true) {
            i = TextUtils.indexOf(this.f26933, '\n', i + 1);
            if (i == -1 || i >= this.f26930) {
                break;
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m22853() {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        while (z) {
            char m22848 = m22848();
            int i = this.f26932;
            this.f26930 = i;
            if (m22848 == '\n') {
                this.f26930 = i - 1;
                throw new Exception("Can not find the right \"");
            }
            if (m22848 == '\"') {
                z = false;
            } else if (m22848 == '\\') {
                char m228482 = m22848();
                this.f26930 = this.f26932;
                if (m228482 == '\"' || m228482 == '\'' || m228482 == '\\') {
                    sb.append(m228482);
                } else if (m228482 == 'b') {
                    sb.append('\b');
                } else if (m228482 == 'f') {
                    sb.append('\f');
                } else if (m228482 == 'n') {
                    sb.append('\n');
                } else if (m228482 == 'r') {
                    sb.append('\r');
                } else if (m228482 == 't') {
                    sb.append('\t');
                } else {
                    throw new Exception("Invalid escape sequence: \\" + m228482);
                }
            } else {
                sb.append(m22848);
            }
        }
        return sb.toString();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m22847(String str) {
        return str.replace("\\", "\\\\").replace("\f", "\\f").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t").replace("\b", "\\b").replace("\"", "\\\"");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private char m22848() {
        int i = this.f26932;
        if (i >= this.f26931) {
            throw new Exception("EOF");
        }
        this.f26932 = i + 1;
        return this.f26933.charAt(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0197, code lost:
    
        if ('A' > r2) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0199, code lost:
    
        if (r2 <= 'Z') goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019b, code lost:
    
        if (r2 == '_') goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019d, code lost:
    
        if (r2 == '$') goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019f, code lost:
    
        if (19968 > r2) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a1, code lost:
    
        if (r2 > 40869) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01b7, code lost:
    
        throw new java.lang.Exception("Unknown Token Start: " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b8, code lost:
    
        r5 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:
    
        if (r4 == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01bf, code lost:
    
        r5.append('-');
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c2, code lost:
    
        r5.append(r2);
        r2 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c9, code lost:
    
        if ('a' > r2) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r2 <= 'z') goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ee, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cd, code lost:
    
        if ('A' > r2) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01cf, code lost:
    
        if (r2 <= 'Z') goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d1, code lost:
    
        if (r2 == '_') goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d3, code lost:
    
        if (r2 == '$') goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d5, code lost:
    
        if (19968 > r2) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d7, code lost:
    
        if (r2 > 40869) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01da, code lost:
    
        if ('0' > r2) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01dc, code lost:
    
        if (r2 > '9') goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01df, code lost:
    
        if (r1 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01e3, code lost:
    
        if (r2 != '.') goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e6, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01ed, code lost:
    
        return r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0175, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x015b, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0145, code lost:
    
        r1 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x014b, code lost:
    
        if (r1 != '|') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x014d, code lost:
    
        return "||";
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0150, code lost:
    
        if (r1 != '=') goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0152, code lost:
    
        return "|=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0155, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x015a, code lost:
    
        return "|";
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00e1, code lost:
    
        r1 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00e5, code lost:
    
        if (r1 != '=') goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x00e7, code lost:
    
        return ">=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x00ec, code lost:
    
        if (r1 != '>') goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00ee, code lost:
    
        r1 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x00f2, code lost:
    
        if (r1 != '>') goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x00f8, code lost:
    
        if (m22848() != '=') goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x00fa, code lost:
    
        return ">>>=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x00fd, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0102, code lost:
    
        return ">>>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0103, code lost:
    
        if (r1 != '=') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0105, code lost:
    
        return ">>=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0108, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x010d, code lost:
    
        return ">>";
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x010e, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0113, code lost:
    
        return ">";
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0118, code lost:
    
        if (m22848() != '=') goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x011a, code lost:
    
        return "==";
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x011d, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0122, code lost:
    
        return "=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0123, code lost:
    
        r1 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0127, code lost:
    
        if (r1 != '=') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0129, code lost:
    
        return "<=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x012e, code lost:
    
        if (r1 != '<') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0134, code lost:
    
        if (m22848() != '=') goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0136, code lost:
    
        return "<<=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0139, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x013e, code lost:
    
        return "<<";
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x013f, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0144, code lost:
    
        return "<";
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0097, code lost:
    
        r1 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x009d, code lost:
    
        if (r1 != '+') goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x009f, code lost:
    
        return "++";
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x00a2, code lost:
    
        if (r1 != '=') goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x00a4, code lost:
    
        return "+=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00a7, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x00ac, code lost:
    
        return com.google.android.material.badge.BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00b1, code lost:
    
        if (m22848() != '=') goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00b3, code lost:
    
        return "*=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00b6, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00bb, code lost:
    
        return "*";
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00bc, code lost:
    
        r1 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00c2, code lost:
    
        if (r1 != '&') goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00c4, code lost:
    
        return "&&";
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00c7, code lost:
    
        if (r1 != '=') goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00c9, code lost:
    
        return "&=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00cc, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00d1, code lost:
    
        return com.alipay.sdk.m.w.a.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x00d6, code lost:
    
        if (m22848() != '=') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x00d8, code lost:
    
        return "%=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x00db, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x00e0, code lost:
    
        return "%";
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01f4, code lost:
    
        if (m22848() != '=') goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x01f6, code lost:
    
        return "^=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x01f9, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x01fe, code lost:
    
        return "^";
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0203, code lost:
    
        if (m22848() != '=') goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0205, code lost:
    
        return "/=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0208, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x020d, code lost:
    
        return "/";
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0212, code lost:
    
        return java.lang.String.valueOf(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0217, code lost:
    
        if (m22848() != '=') goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0219, code lost:
    
        return "!=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x021c, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0221, code lost:
    
        return "!";
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0222, code lost:
    
        return "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0061, code lost:
    
        r2 = r16.f26932;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0063, code lost:
    
        if (r2 >= r3) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0065, code lost:
    
        r16.f26930 = r2;
        r2 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x006f, code lost:
    
        if (r2 == '!') goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0073, code lost:
    
        if (r2 == '\"') goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0077, code lost:
    
        if (r2 == '.') goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0079, code lost:
    
        if (r2 == '/') goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007d, code lost:
    
        if (r2 == '[') goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0081, code lost:
    
        if (r2 == ']') goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0085, code lost:
    
        if (r2 == '^') goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0087, code lost:
    
        switch(r2) {
            case 37: goto L84;
            case 38: goto L75;
            case 39: goto L206;
            case 40: goto L206;
            case 41: goto L206;
            case 42: goto L69;
            case 43: goto L60;
            case 44: goto L206;
            default: goto L55;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x008a, code lost:
    
        switch(r2) {
            case 58: goto L206;
            case 59: goto L206;
            case 60: goto L117;
            case 61: goto L111;
            case 62: goto L90;
            case 63: goto L206;
            default: goto L56;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x008d, code lost:
    
        switch(r2) {
            case 123: goto L206;
            case 124: goto L131;
            case 125: goto L206;
            case 126: goto L206;
            default: goto L57;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0092, code lost:
    
        if (r2 != '-') goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0094, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:
    
        if (r4 == false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015e, code lost:
    
        r2 = m22848();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0162, code lost:
    
        if (r2 != '-') goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0164, code lost:
    
        return "--";
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
    
        if (r2 != '=') goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0169, code lost:
    
        return "-=";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0170, code lost:
    
        if ('0' > r2) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0172, code lost:
    
        if (r2 > '9') goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0176, code lost:
    
        if (r1 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0178, code lost:
    
        if (r4 == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017a, code lost:
    
        m22849();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017f, code lost:
    
        return "-";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0191, code lost:
    
        if (r1 != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0193, code lost:
    
        if ('a' > r2) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0195, code lost:
    
        if (r2 <= 'z') goto L171;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m22852() {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8845.m22852():java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22851(String str) {
        String m22852 = m22852();
        if (!m22852.equals(str)) {
            throw new Exception(C19462.m44858("Invalid token: expected=", str, ", got=", m22852));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m22846(String str) {
        if (!str.equals("{")) {
            throw new Exception("Invalid token: expected={, got=".concat(str));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m22849() {
        this.f26932--;
    }
}
