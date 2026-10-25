package org.bouncycastle.asn1.x500.style;

import com.alipay.sdk.m.p.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import l.C16014;
import l.C4860;
import l.EnumC0121;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.x500.AttributeTypeAndValue;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500NameBuilder;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes.dex */
public class IETFUtils {
    public static void addMultiValuedRDN(X500NameStyle x500NameStyle, X500NameBuilder x500NameBuilder, X500NameTokenizer x500NameTokenizer) {
        String nextToken = x500NameTokenizer.nextToken();
        if (nextToken == null) {
            throw new IllegalArgumentException("badly formatted directory string");
        }
        if (!x500NameTokenizer.hasMoreTokens()) {
            addRDN(x500NameStyle, x500NameBuilder, nextToken);
            return;
        }
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        do {
            collectAttributeTypeAndValue(x500NameStyle, vector, vector2, nextToken);
            nextToken = x500NameTokenizer.nextToken();
        } while (nextToken != null);
        x500NameBuilder.addMultiValuedRDN(toOIDArray(vector), toValueArray(vector2));
    }

    public static void addRDN(X500NameStyle x500NameStyle, X500NameBuilder x500NameBuilder, String str) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str, a.h);
        x500NameBuilder.addRDN(x500NameStyle.attrNameToOID(nextToken(x500NameTokenizer, true).trim()), unescape(nextToken(x500NameTokenizer, false)));
    }

    public static void addRDNs(X500NameStyle x500NameStyle, X500NameBuilder x500NameBuilder, X500NameTokenizer x500NameTokenizer) {
        while (true) {
            String nextToken = x500NameTokenizer.nextToken();
            if (nextToken == null) {
                return;
            }
            if (nextToken.indexOf(43) >= 0) {
                addMultiValuedRDN(x500NameStyle, x500NameBuilder, new X500NameTokenizer(nextToken, '+'));
            } else {
                addRDN(x500NameStyle, x500NameBuilder, nextToken);
            }
        }
    }

    public static void appendRDN(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(stringBuffer, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z = true;
        for (int i = 0; i != typesAndValues.length; i++) {
            if (z) {
                z = false;
            } else {
                stringBuffer.append('+');
            }
            appendTypeAndValue(stringBuffer, typesAndValues[i], hashtable);
        }
    }

    public static void appendRDN(StringBuilder sb, RDN rdn, Hashtable hashtable) {
        if (!rdn.isMultiValued()) {
            if (rdn.getFirst() != null) {
                appendTypeAndValue(sb, rdn.getFirst(), hashtable);
                return;
            }
            return;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        boolean z = true;
        for (int i = 0; i != typesAndValues.length; i++) {
            if (z) {
                z = false;
            } else {
                sb.append('+');
            }
            appendTypeAndValue(sb, typesAndValues[i], hashtable);
        }
    }

    public static void appendTypeAndValue(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String str = (String) hashtable.get(attributeTypeAndValue.getType());
        if (str == null) {
            str = attributeTypeAndValue.getType().getId();
        }
        stringBuffer.append(str);
        stringBuffer.append(a.h);
        stringBuffer.append(valueToString(attributeTypeAndValue.getValue()));
    }

    public static void appendTypeAndValue(StringBuilder sb, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String str = (String) hashtable.get(attributeTypeAndValue.getType());
        if (str == null) {
            str = attributeTypeAndValue.getType().getId();
        }
        sb.append(str);
        sb.append(a.h);
        sb.append(valueToString(attributeTypeAndValue.getValue()));
    }

    public static boolean atvAreEqual(AttributeTypeAndValue attributeTypeAndValue, AttributeTypeAndValue attributeTypeAndValue2) {
        if (attributeTypeAndValue == attributeTypeAndValue2) {
            return true;
        }
        return attributeTypeAndValue != null && attributeTypeAndValue2 != null && attributeTypeAndValue.getType().equals((ASN1Primitive) attributeTypeAndValue2.getType()) && canonicalString(attributeTypeAndValue.getValue()).equals(canonicalString(attributeTypeAndValue2.getValue()));
    }

    public static String canonicalString(ASN1Encodable aSN1Encodable) {
        return canonicalize(valueToString(aSN1Encodable));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r5 >= r0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String canonicalize(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            if (r0 <= 0) goto L1d
            char r0 = r7.charAt(r1)
            r2 = 35
            if (r0 != r2) goto L1d
            org.bouncycastle.asn1.ASN1Primitive r0 = decodeObject(r7)
            boolean r2 = r0 instanceof org.bouncycastle.asn1.ASN1String
            if (r2 == 0) goto L1d
            org.bouncycastle.asn1.ASN1String r0 = (org.bouncycastle.asn1.ASN1String) r0
            java.lang.String r7 = r0.getString()
        L1d:
            java.lang.String r7 = org.bouncycastle.util.Strings.toLowerCase(r7)
            int r0 = r7.length()
            r2 = 2
            if (r0 >= r2) goto L29
            return r7
        L29:
            int r0 = r0 + (-1)
        L2b:
            r2 = 32
            r3 = 92
            if (r1 >= r0) goto L42
            char r4 = r7.charAt(r1)
            if (r4 != r3) goto L42
            int r4 = r1 + 1
            char r4 = r7.charAt(r4)
            if (r4 != r2) goto L42
            int r1 = r1 + 2
            goto L2b
        L42:
            int r4 = r1 + 1
            r5 = r0
        L45:
            if (r5 <= r4) goto L58
            int r6 = r5 + (-1)
            char r6 = r7.charAt(r6)
            if (r6 != r3) goto L58
            char r6 = r7.charAt(r5)
            if (r6 != r2) goto L58
            int r5 = r5 + (-2)
            goto L45
        L58:
            if (r1 > 0) goto L5c
            if (r5 >= r0) goto L62
        L5c:
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r1, r5)
        L62:
            java.lang.String r7 = stripInternalSpaces(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x500.style.IETFUtils.canonicalize(java.lang.String):java.lang.String");
    }

    public static void collectAttributeTypeAndValue(X500NameStyle x500NameStyle, Vector vector, Vector vector2, String str) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str, a.h);
        String nextToken = nextToken(x500NameTokenizer, true);
        String nextToken2 = nextToken(x500NameTokenizer, false);
        ASN1ObjectIdentifier attrNameToOID = x500NameStyle.attrNameToOID(nextToken.trim());
        String unescape = unescape(nextToken2);
        vector.addElement(attrNameToOID);
        vector2.addElement(unescape);
    }

    public static int convertHex(char c) {
        return ('0' > c || c > '9') ? ('a' > c || c > 'f') ? c - '7' : c - 'W' : c - '0';
    }

    public static String[] findAttrNamesForOID(ASN1ObjectIdentifier aSN1ObjectIdentifier, Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        int i = 0;
        int i2 = 0;
        while (elements.hasMoreElements()) {
            if (aSN1ObjectIdentifier.equals(elements.nextElement())) {
                i2++;
            }
        }
        String[] strArr = new String[i2];
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (aSN1ObjectIdentifier.equals(hashtable.get(str))) {
                strArr[i] = str;
                i++;
            }
        }
        return strArr;
    }

    public static boolean isHexDigit(char c) {
        if ('0' <= c && c <= '9') {
            return true;
        }
        if ('a' > c || c > 'f') {
            return 'A' <= c && c <= 'F';
        }
        return true;
    }

    public static String nextToken(X500NameTokenizer x500NameTokenizer, boolean z) {
        String nextToken = x500NameTokenizer.nextToken();
        if (nextToken == null || x500NameTokenizer.hasMoreTokens() != z) {
            throw new IllegalArgumentException("badly formatted directory string");
        }
        return nextToken;
    }

    public static boolean rDNAreEqual(RDN rdn, RDN rdn2) {
        if (rdn.size() != rdn2.size()) {
            return false;
        }
        AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
        AttributeTypeAndValue[] typesAndValues2 = rdn2.getTypesAndValues();
        if (typesAndValues.length != typesAndValues2.length) {
            return false;
        }
        for (int i = 0; i != typesAndValues.length; i++) {
            if (!atvAreEqual(typesAndValues[i], typesAndValues2[i])) {
                return false;
            }
        }
        return true;
    }

    public static RDN[] rDNsFromString(String str, X500NameStyle x500NameStyle) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str);
        X500NameBuilder x500NameBuilder = new X500NameBuilder(x500NameStyle);
        addRDNs(x500NameStyle, x500NameBuilder, x500NameTokenizer);
        return x500NameBuilder.build().getRDNs();
    }

    public static String stripInternalSpaces(String str) {
        if (str.indexOf(EnumC0121.f1143) < 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = str.charAt(0);
        sb.append(charAt);
        for (int i = 1; i < str.length(); i++) {
            char charAt2 = str.charAt(i);
            if (charAt != ' ' || charAt2 != ' ') {
                sb.append(charAt2);
                charAt = charAt2;
            }
        }
        return sb.toString();
    }

    public static ASN1ObjectIdentifier[] toOIDArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i = 0; i != size; i++) {
            aSN1ObjectIdentifierArr[i] = (ASN1ObjectIdentifier) vector.elementAt(i);
        }
        return aSN1ObjectIdentifierArr;
    }

    public static String[] toValueArray(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static String unescape(String str) {
        int i;
        if (str.length() == 0) {
            return str;
        }
        if (str.indexOf(92) < 0 && str.indexOf(34) < 0) {
            return str.trim();
        }
        StringBuilder sb = new StringBuilder(str.length());
        if (str.charAt(0) == '\\' && str.charAt(1) == '#') {
            sb.append("\\#");
            i = 2;
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ') {
                z3 = true;
            }
            if (charAt == '\"') {
                if (!z) {
                    z2 = !z2;
                }
                sb.append(charAt);
                z = false;
            } else if (charAt == '\\' && !z && !z2) {
                i2 = sb.length();
                z = true;
            } else if (charAt != ' ' || z || z3) {
                if (z && isHexDigit(charAt)) {
                    if (c != 0) {
                        sb.append((char) ((convertHex(c) * 16) + convertHex(charAt)));
                        z = false;
                        c = 0;
                    } else {
                        c = charAt;
                    }
                }
                sb.append(charAt);
                z = false;
            }
            i++;
        }
        if (sb.length() > 0) {
            while (sb.charAt(sb.length() - 1) == ' ' && i2 != sb.length() - 1) {
                sb.setLength(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    public static ASN1Encodable valueFromHexString(String str, int i) {
        int length = (str.length() - i) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            int i3 = (i2 * 2) + i;
            char charAt = str.charAt(i3);
            char charAt2 = str.charAt(i3 + 1);
            bArr[i2] = (byte) (convertHex(charAt2) | (convertHex(charAt) << 4));
        }
        return ASN1Primitive.fromByteArray(bArr);
    }

    public static String valueToString(ASN1Encodable aSN1Encodable) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (!(aSN1Encodable instanceof ASN1String) || (aSN1Encodable instanceof ASN1UniversalString)) {
            try {
                sb.append('#');
                sb.append(Hex.toHexString(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((ASN1String) aSN1Encodable).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                sb.append('\\');
            }
            sb.append(string);
        }
        int length = sb.length();
        int i2 = (sb.length() >= 2 && sb.charAt(0) == '\\' && sb.charAt(1) == '#') ? 2 : 0;
        while (i2 != length) {
            char charAt = sb.charAt(i2);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        continue;
                }
            }
            sb.insert(i2, "\\");
            i2 += 2;
            length++;
        }
        if (sb.length() > 0) {
            while (sb.length() > i && sb.charAt(i) == ' ') {
                sb.insert(i, "\\");
                i += 2;
            }
        }
        for (int length2 = sb.length() - 1; length2 >= i && sb.charAt(length2) == ' '; length2--) {
            sb.insert(length2, '\\');
        }
        return sb.toString();
    }

    public static ASN1Primitive decodeObject(String str) {
        try {
            return ASN1Primitive.fromByteArray(Hex.decodeStrict(str, 1, str.length() - 1));
        } catch (IOException e) {
            throw new IllegalStateException(C16014.m37866("unknown encoding in name: ", e));
        }
    }

    public static ASN1ObjectIdentifier decodeAttrName(String str, Hashtable hashtable) {
        if (str.regionMatches(true, 0, "OID.", 0, 4)) {
            return new ASN1ObjectIdentifier(str.substring(4));
        }
        ASN1ObjectIdentifier tryFromID = ASN1ObjectIdentifier.tryFromID(str);
        if (tryFromID != null) {
            return tryFromID;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(C4860.m14172("Unknown object id - ", str, " - passed to distinguished name"));
    }
}
