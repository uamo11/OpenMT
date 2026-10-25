package l;

import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: 38GN */
/* renamed from: l.ܰܽۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13940 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33379(C8839 c8839, C23655 c23655, List list) {
        String str;
        int i;
        String str2;
        ArrayList arrayList = new ArrayList();
        C13277 c13277 = new C13277(c23655.f76629);
        while (true) {
            String m32240 = c13277.m32240();
            if (m32240 == null) {
                break;
            }
            arrayList.add(m32240);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= arrayList.size()) {
                if (c23655.f76634.equals("<clinit>")) {
                    str = ".classInitializer";
                } else if (c23655.f76634.equals("<init>")) {
                    str = "[\"$init\"]";
                } else {
                    str = "[\"" + C10035.f30191.m28254(c23655.f76634) + "\"]";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(m33377(c8839));
                sb.append("\n");
                sb.append(m33381(c8839));
                sb.append(str);
                String str3 = c23655.f76634;
                Iterator it = list.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    if (((C23655) it.next()).f76634.equals(str3)) {
                        i3++;
                    }
                }
                if (i3 > 1) {
                    sb.append(".overload(");
                    Iterator it2 = arrayList.iterator();
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        String str4 = (String) it2.next();
                        if (z2) {
                            z2 = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(C9045.m23341(new StringBuilder("'"), m33376(str4), "'"));
                    }
                    sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                }
                sb.append(".implementation = function (");
                m33380(arrayList2, sb, (C23113) null);
                C20177.m46410(sb, "", ") {\n", "    console.log(`");
                sb.append(c8839.f26917);
                sb.append(".");
                sb.append(c23655.f76634);
                sb.append(" is called");
                if (!arrayList2.isEmpty()) {
                    sb.append(": ");
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        String str5 = (String) it3.next();
                        if (z) {
                            z = false;
                        } else {
                            sb.append(", ");
                        }
                        sb.append(str5 + "=${" + str5 + l.d);
                    }
                    sb.append("");
                }
                sb.append("`);\n");
                if (c23655.f76633.equals("V")) {
                    C20177.m46410(sb, "    this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m33380(arrayList2, sb, (C23113) null);
                    sb.append("");
                    sb.append(");\n");
                } else {
                    C20177.m46410(sb, "    let result = this", str, MotionUtils.EASING_TYPE_FORMAT_START);
                    m33380(arrayList2, sb, (C23113) null);
                    C20177.m46410(sb, "", ");\n", "    console.log(`");
                    sb.append(c8839.f26917);
                    sb.append(".");
                    C20177.m46410(sb, c23655.f76634, " result=${result}`);\n", "    return result;\n");
                }
                sb.append("};");
                return sb.toString();
            }
            String str6 = (String) arrayList.get(i2);
            boolean startsWith = str6.startsWith("[");
            if (startsWith) {
                str6 = str6.substring(str6.lastIndexOf(91) + 1);
            }
            int i4 = 2;
            if (str6.length() != 1) {
                i = i2 + 1;
                switch (str6) {
                    case "Ljava/util/Double;":
                        str2 = "d";
                        break;
                    case "Ljava/util/Iterator;":
                        str2 = "it";
                        break;
                    case "Ljava/lang/Exception;":
                        str2 = "ex";
                        break;
                    case "Ljava/util/Character;":
                        str2 = "ch";
                        break;
                    case "Ljava/util/Boolean;":
                        str2 = "bool";
                        break;
                    case "Ljava/util/Float;":
                        str2 = "f";
                        break;
                    case "Ljava/util/StringBuilder;":
                        str2 = "sb";
                        break;
                    case "Ljava/util/Short;":
                        str2 = "sh";
                        break;
                    case "Ljava/lang/Throwable;":
                        str2 = "th";
                        break;
                    case "Ljava/util/Byte;":
                        str2 = "b";
                        break;
                    case "Ljava/util/Long;":
                        str2 = "l";
                        break;
                    case "Ljava/lang/String;":
                        str2 = "str";
                        break;
                    case "Ljava/lang/Class;":
                        str2 = "cls";
                        break;
                    case "Ljava/lang/Object;":
                        str2 = "obj";
                        break;
                    case "Ljava/util/Integer;":
                        str2 = "num";
                        break;
                    default:
                        String m36561 = C15472.m36561(1, 1, str6);
                        String substring = m36561.substring(m36561.lastIndexOf(47) + 1);
                        String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                        if (!substring2.matches("[a-zA-Z]\\w*")) {
                            str2 = C19370.m44628(i, "arg");
                            break;
                        } else if (!substring2.toUpperCase().equals(substring2)) {
                            String str7 = Character.toLowerCase(substring2.charAt(0)) + substring2.substring(1);
                            if (str7.equals(substring2)) {
                                if (substring2.length() >= 3) {
                                    str7 = substring2.toLowerCase();
                                    if (substring2.equals(str7)) {
                                        str2 = C16014.m37867(str7, "Var");
                                        break;
                                    }
                                } else {
                                    str2 = substring2.concat("Var");
                                    break;
                                }
                            }
                            str2 = str7;
                            break;
                        } else {
                            str2 = substring2.toLowerCase();
                            break;
                        }
                }
            } else {
                str2 = str6.toLowerCase();
            }
            if (startsWith) {
                str2 = C16014.m37867(str2, "Arr");
            }
            if (arrayList2.contains(str2)) {
                while (true) {
                    if (arrayList2.contains(str2 + i4)) {
                        i4++;
                    } else {
                        arrayList2.add(str2 + i4);
                    }
                }
            } else {
                arrayList2.add(str2);
            }
            i2++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33377(C8839 c8839) {
        return C20087.m46306("let ", m33381(c8839), " = Java.use(\"", m33376(c8839.f26919), "\");");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33376(String str) {
        if (str.startsWith("L")) {
            return str.substring(1, str.length() - 1).replace('/', '.');
        }
        if (str.startsWith("[")) {
            return str.replace('/', '.');
        }
        char charAt = str.charAt(0);
        if (charAt == 'F') {
            return ClassTransform.FLOAT;
        }
        if (charAt == 'S') {
            return ClassTransform.SHORT;
        }
        if (charAt == 'V') {
            return ClassTransform.VOID;
        }
        if (charAt == 'Z') {
            return ClassTransform.BOOLEAN;
        }
        if (charAt == 'I') {
            return ClassTransform.INTEGER;
        }
        if (charAt == 'J') {
            return ClassTransform.LONG;
        }
        switch (charAt) {
            case 'B':
                return ClassTransform.BYTE;
            case 'C':
                return ClassTransform.CHARACTER;
            case 'D':
                return ClassTransform.DOUBLE;
            default:
                throw new C9796("Unknown type ".concat(str));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m33381(C8839 c8839) {
        String str = c8839.f26917;
        return str.matches("[a-zA-Z]\\w*") ? str : String.format("cls%X", Integer.valueOf(str.hashCode() & 65535));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33380(ArrayList arrayList, StringBuilder sb, C23113 c23113) {
        Iterator it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33378(C8839 c8839, C14482 c14482, List list) {
        String str = c14482.f44373;
        if (!str.matches("[a-zA-Z]\\w*")) {
            str = String.format("field%X", Integer.valueOf(str.hashCode() & 65535));
        }
        String str2 = c14482.f44373;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (((C23655) it.next()).f76634.equals(str2)) {
                str2 = C20094.m46315("_", str2);
                break;
            }
        }
        String m28254 = C10035.f30191.m28254(str2);
        return m33377(c8839) + "\n" + str + " = " + m33381(c8839) + "." + m28254 + ".value;";
    }
}
