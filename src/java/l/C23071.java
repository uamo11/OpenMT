package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.badge.BadgeDrawable;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.HashMap;
import org.bouncycastle.crypto.params.DHParameters;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: Q1TZ */
/* renamed from: l.᩺ܶۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23071 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f74213;

    static {
        HashMap hashMap = new HashMap();
        f74213 = hashMap;
        C12354.m29971(536870934, hashMap, "%i", 536871034, "#2");
        C12354.m29971(536870933, hashMap, "#4", 536871035, "*7");
        C12354.m29971(131, hashMap, "k1", 132, "k2");
        C12354.m29971(133, hashMap, "k3", 134, "k4");
        C12354.m29971(135, hashMap, "k5", 136, "k6");
        C12354.m29971(137, hashMap, "k7", 138, "k8");
        C12354.m29971(139, hashMap, "k9", 140, "k;");
        C12354.m29971(141, hashMap, "F1", 142, "F2");
        C12354.m29971(536871043, hashMap, "F3", 536871044, "F4");
        C12354.m29971(536871045, hashMap, "F5", 536871046, "F6");
        C12354.m29971(536871047, hashMap, "F7", 536871048, "F8");
        C12354.m29971(536871049, hashMap, "F9", 536871050, "FA");
        C12354.m29971(536871051, hashMap, "FB", 536871052, "FC");
        C12354.m29971(536871053, hashMap, "FD", 536871054, "FE");
        C12354.m29971(67, hashMap, "kb", 20, "kd");
        C15942.m37720(hashMap, "kh", 122, 21, "kl");
        hashMap.put("kr", 22);
        hashMap.put("K1", 122);
        hashMap.put("K3", 92);
        hashMap.put("K4", 123);
        C15942.m37720(hashMap, "K5", 93, 19, "ku");
        C12354.m29971(536870973, hashMap, "kB", UMErrorCode.E_UM_BE_DEFLATE_FAILED, "kD");
        hashMap.put("kDN", 536870932);
        hashMap.put("kF", 536870932);
        hashMap.put("kI", 124);
        hashMap.put("kN", 92);
        hashMap.put("kP", 93);
        hashMap.put("kR", 536870931);
        hashMap.put("kUP", 536870931);
        C15942.m37720(hashMap, "@7", 123, DHParameters.DEFAULT_MINIMUM_LENGTH, "@8");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51235(String str, boolean z, boolean z2) {
        Integer num = (Integer) f74213.get(str);
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        int i = 536870912;
        if ((intValue & 536870912) != 0) {
            intValue &= -536870913;
        } else {
            i = 0;
        }
        if ((intValue & 1073741824) != 0) {
            i |= 1073741824;
            intValue &= -1073741825;
        }
        if ((intValue & Integer.MIN_VALUE) != 0) {
            i |= Integer.MIN_VALUE;
            intValue &= Integer.MAX_VALUE;
        }
        return m51233(intValue, i, z, z2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51233(int i, int i2, boolean z, boolean z2) {
        if (i != 4) {
            if (i == 61) {
                return (536870912 & i2) == 0 ? "\t" : "\u001b[Z";
            }
            if (i == 62) {
                if ((i2 & 1073741824) == 0) {
                    return null;
                }
                return WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
            }
            if (i == 66) {
                return (i2 & Integer.MIN_VALUE) == 0 ? "\r" : "\u001b\r";
            }
            if (i == 67) {
                return ((i2 & Integer.MIN_VALUE) == 0 ? "" : "\u001b").concat((i2 & 1073741824) == 0 ? "\u007f" : "\b");
            }
            if (i == 92) {
                return "\u001b[5~";
            }
            if (i == 93) {
                return "\u001b[6~";
            }
            if (i != 111) {
                if (i != 112) {
                    switch (i) {
                        case 19:
                            if (i2 == 0) {
                                return z ? "\u001bOA" : "\u001b[A";
                            }
                            return m51234("\u001b[1", i2, 'A');
                        case 20:
                            if (i2 == 0) {
                                return z ? "\u001bOB" : "\u001b[B";
                            }
                            return m51234("\u001b[1", i2, 'B');
                        case 21:
                            if (i2 == 0) {
                                return z ? "\u001bOD" : "\u001b[D";
                            }
                            return m51234("\u001b[1", i2, 'D');
                        case 22:
                            if (i2 == 0) {
                                return z ? "\u001bOC" : "\u001b[C";
                            }
                            return m51234("\u001b[1", i2, 'C');
                        case 23:
                            return "\r";
                        default:
                            switch (i) {
                                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                    return "\u001b[32~";
                                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                    return "\u001b[34~";
                                case 122:
                                    if (i2 == 0) {
                                        return z ? "\u001bOH" : "\u001b[H";
                                    }
                                    return m51234("\u001b[1", i2, 'H');
                                case 123:
                                    if (i2 == 0) {
                                        return z ? "\u001bOF" : "\u001b[F";
                                    }
                                    return m51234("\u001b[1", i2, 'F');
                                case 124:
                                    return m51234("\u001b[2", i2, '~');
                                default:
                                    switch (i) {
                                        case 131:
                                            return i2 == 0 ? "\u001bOP" : m51234("\u001b[1", i2, 'P');
                                        case 132:
                                            return i2 == 0 ? "\u001bOQ" : m51234("\u001b[1", i2, 'Q');
                                        case 133:
                                            return i2 == 0 ? "\u001bOR" : m51234("\u001b[1", i2, 'R');
                                        case 134:
                                            return i2 == 0 ? "\u001bOS" : m51234("\u001b[1", i2, 'S');
                                        case 135:
                                            return m51234("\u001b[15", i2, '~');
                                        case 136:
                                            return m51234("\u001b[17", i2, '~');
                                        case 137:
                                            return m51234("\u001b[18", i2, '~');
                                        case 138:
                                            return m51234("\u001b[19", i2, '~');
                                        case 139:
                                            return m51234("\u001b[20", i2, '~');
                                        case 140:
                                            return m51234("\u001b[21", i2, '~');
                                        case 141:
                                            return m51234("\u001b[23", i2, '~');
                                        case 142:
                                            return m51234("\u001b[24", i2, '~');
                                        case 143:
                                            return "\u001bOP";
                                        case 144:
                                            return z2 ? m51234("\u001bO", i2, 'p') : "0";
                                        case 145:
                                            return z2 ? m51234("\u001bO", i2, 'q') : "1";
                                        case 146:
                                            return z2 ? m51234("\u001bO", i2, 'r') : "2";
                                        case 147:
                                            return z2 ? m51234("\u001bO", i2, 's') : "3";
                                        case 148:
                                            return z2 ? m51234("\u001bO", i2, 't') : "4";
                                        case 149:
                                            return z2 ? m51234("\u001bO", i2, 'u') : "5";
                                        case 150:
                                            return z2 ? m51234("\u001bO", i2, 'v') : "6";
                                        case 151:
                                            return z2 ? m51234("\u001bO", i2, 'w') : "7";
                                        case 152:
                                            return z2 ? m51234("\u001bO", i2, 'x') : "8";
                                        case 153:
                                            return z2 ? m51234("\u001bO", i2, 'y') : "9";
                                        case EnumC17734.f54268 /* 154 */:
                                            return z2 ? m51234("\u001bO", i2, 'o') : "/";
                                        case 155:
                                            return z2 ? m51234("\u001bO", i2, 'j') : "*";
                                        case 156:
                                            return z2 ? m51234("\u001bO", i2, 'm') : "-";
                                        case 157:
                                            return z2 ? m51234("\u001bO", i2, 'k') : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX;
                                        case 158:
                                            return z2 ? "\u001bOn" : ".";
                                        case 159:
                                            return ",";
                                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                                            return z2 ? m51234("\u001bO", i2, 'M') : "\n";
                                        case 161:
                                            return z2 ? m51234("\u001bO", i2, 'X') : "=";
                                        default:
                                            return null;
                                    }
                            }
                    }
                }
                return m51234("\u001b[3", i2, '~');
            }
        }
        return "\u001b";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51234(String str, int i, char c) {
        int i2;
        if (i == Integer.MIN_VALUE) {
            i2 = 3;
        } else if (i == -1610612736) {
            i2 = 4;
        } else if (i == -1073741824) {
            i2 = 7;
        } else if (i == -536870912) {
            i2 = 8;
        } else if (i == 536870912) {
            i2 = 2;
        } else if (i == 1073741824) {
            i2 = 5;
        } else {
            if (i != 1610612736) {
                return str + c;
            }
            i2 = 6;
        }
        return str + l.b + i2 + c;
    }
}
