package org.json.alipay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import l.C5368;

/* compiled from: N673 */
/* loaded from: classes2.dex */
public class c {
    public int a;
    public Reader b;
    public char c;
    public boolean d;

    public c(Reader reader) {
        this.b = reader.markSupported() ? reader : new BufferedReader(reader);
        this.d = false;
        this.a = 0;
    }

    public c(String str) {
        this(new StringReader(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0068, code lost:
    
        throw a("Unterminated string");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(char r6) {
        /*
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
        L5:
            char r1 = r5.b()
            if (r1 == 0) goto L62
            r2 = 10
            if (r1 == r2) goto L62
            r3 = 13
            if (r1 == r3) goto L62
            r4 = 92
            if (r1 == r4) goto L1e
            if (r1 != r6) goto L5e
            java.lang.String r6 = r0.toString()
            return r6
        L1e:
            char r1 = r5.b()
            r4 = 98
            if (r1 == r4) goto L5c
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L59
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L55
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L51
            r2 = 120(0x78, float:1.68E-43)
            r3 = 16
            if (r1 == r2) goto L46
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L43
            r2 = 117(0x75, float:1.64E-43)
            if (r1 == r2) goto L41
            goto L5e
        L41:
            r1 = 4
            goto L47
        L43:
            r1 = 9
            goto L5e
        L46:
            r1 = 2
        L47:
            java.lang.String r1 = r5.a(r1)
            int r1 = java.lang.Integer.parseInt(r1, r3)
            char r1 = (char) r1
            goto L5e
        L51:
            r0.append(r3)
            goto L5
        L55:
            r0.append(r2)
            goto L5
        L59:
            r1 = 12
            goto L5e
        L5c:
            r1 = 8
        L5e:
            r0.append(r1)
            goto L5
        L62:
            java.lang.String r6 = "Unterminated string"
            org.json.alipay.JSONException r6 = r5.a(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.a(char):java.lang.String");
    }

    public String a(int i) {
        if (i == 0) {
            return "";
        }
        char[] cArr = new char[i];
        int i2 = 0;
        if (this.d) {
            this.d = false;
            cArr[0] = this.c;
            i2 = 1;
        }
        while (i2 < i) {
            try {
                int read = this.b.read(cArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            } catch (IOException e) {
                throw new JSONException(e);
            }
        }
        this.a += i2;
        if (i2 < i) {
            throw a("Substring bounds error");
        }
        this.c = cArr[i - 1];
        return new String(cArr);
    }

    public JSONException a(String str) {
        StringBuilder m15339 = C5368.m15339(str);
        m15339.append(toString());
        return new JSONException(m15339.toString());
    }

    public void a() {
        int i;
        if (this.d || (i = this.a) <= 0) {
            throw new JSONException("Stepping back two steps is not supported");
        }
        this.a = i - 1;
        this.d = true;
    }

    public char b() {
        if (this.d) {
            this.d = false;
            char c = this.c;
            if (c != 0) {
                this.a++;
            }
            return c;
        }
        try {
            int read = this.b.read();
            if (read <= 0) {
                this.c = (char) 0;
                return (char) 0;
            }
            this.a++;
            char c2 = (char) read;
            this.c = c2;
            return c2;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char c() {
        /*
            r5 = this;
        L0:
            char r0 = r5.b()
            r1 = 13
            r2 = 10
            r3 = 47
            if (r0 != r3) goto L3f
            char r0 = r5.b()
            r4 = 42
            if (r0 == r4) goto L25
            if (r0 == r3) goto L1a
            r5.a()
            return r3
        L1a:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L1a
            goto L0
        L25:
            char r0 = r5.b()
            if (r0 == 0) goto L38
            if (r0 != r4) goto L25
            char r0 = r5.b()
            if (r0 != r3) goto L34
            goto L0
        L34:
            r5.a()
            goto L25
        L38:
            java.lang.String r0 = "Unclosed comment"
            org.json.alipay.JSONException r0 = r5.a(r0)
            throw r0
        L3f:
            r3 = 35
            if (r0 != r3) goto L4e
        L43:
            char r0 = r5.b()
            if (r0 == r2) goto L0
            if (r0 == r1) goto L0
            if (r0 != 0) goto L43
            goto L0
        L4e:
            if (r0 == 0) goto L54
            r1 = 32
            if (r0 <= r1) goto L0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.json.alipay.c.c():char");
    }

    public Object d() {
        char c = c();
        if (c != '\"') {
            if (c != '[') {
                if (c == '{') {
                    a();
                    return new b(this);
                }
                if (c != '\'') {
                    if (c != '(') {
                        StringBuffer stringBuffer = new StringBuffer();
                        char c2 = c;
                        while (c2 >= ' ' && ",:]}/\\\"[{;=#".indexOf(c2) < 0) {
                            stringBuffer.append(c2);
                            c2 = b();
                        }
                        a();
                        String trim = stringBuffer.toString().trim();
                        if (trim.equals("")) {
                            throw a("Missing value");
                        }
                        if (trim.equalsIgnoreCase("true")) {
                            return Boolean.TRUE;
                        }
                        if (trim.equalsIgnoreCase("false")) {
                            return Boolean.FALSE;
                        }
                        if (trim.equalsIgnoreCase("null")) {
                            return b.a;
                        }
                        if ((c >= '0' && c <= '9') || c == '.' || c == '-' || c == '+') {
                            if (c == '0') {
                                try {
                                    return (trim.length() <= 2 || !(trim.charAt(1) == 'x' || trim.charAt(1) == 'X')) ? new Integer(Integer.parseInt(trim, 8)) : new Integer(Integer.parseInt(trim.substring(2), 16));
                                } catch (Exception unused) {
                                }
                            }
                            try {
                                try {
                                    try {
                                        return new Integer(trim);
                                    } catch (Exception unused2) {
                                        return new Double(trim);
                                    }
                                } catch (Exception unused3) {
                                    return new Long(trim);
                                }
                            } catch (Exception unused4) {
                            }
                        }
                        return trim;
                    }
                }
            }
            a();
            return new a(this);
        }
        return a(c);
    }

    public String toString() {
        return " at character " + this.a;
    }
}
