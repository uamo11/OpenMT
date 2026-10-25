package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedList;

/* compiled from: ZB99 */
/* renamed from: l.ۜ᩵ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6973 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final BufferedReader f21499;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f21503;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21501 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f21500 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f21502 = new HashMap();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        BufferedReader bufferedReader = this.f21499;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }

    public C6973(BufferedReader bufferedReader) {
        this.f21499 = bufferedReader;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m18861() {
        if (this.f21500 < this.f21503.length()) {
            return this.f21503.codePointAt(this.f21500);
        }
        return 10;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private char m18849(int i) {
        if (this.f21500 + i < this.f21503.length()) {
            return this.f21503.charAt(this.f21500 + i);
        }
        return '\n';
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m18853() {
        while (this.f21500 < this.f21503.length() && C3395.m10355(m18861())) {
            m18860();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m18856(char c) {
        if (this.f21500 >= this.f21503.length()) {
            throw new C23906(this, "Expected '" + c + "'", true);
        }
        if (m18859() == c) {
            return;
        }
        throw new C23906(this, "Expected '" + c + "'", false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m18860() {
        try {
            this.f21500 += Character.charCount(this.f21503.codePointAt(this.f21500));
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C23906(this, "Unexpected end of line", false);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private char m18859() {
        try {
            String str = this.f21503;
            int i = this.f21500;
            this.f21500 = i + 1;
            return str.charAt(i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new C23906(this, "Unexpected end of line", false);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m18854() {
        char charAt;
        this.f21500 = 0;
        loop0: while (true) {
            this.f21501++;
            String readLine = this.f21499.readLine();
            this.f21503 = readLine;
            if (readLine == null) {
                break;
            }
            if (readLine != null) {
                for (int i = 0; i < readLine.length() && (charAt = readLine.charAt(i)) != '#'; i++) {
                    if (!C3395.m10355(charAt)) {
                        break loop0;
                    }
                }
            }
        }
        return this.f21503 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18862(C12596 c12596) {
        C21085 c21085;
        AbstractC17556 c11207;
        Object obj;
        String[] strArr;
        char charAt;
        loop0: while (true) {
            String readLine = this.f21499.readLine();
            this.f21503 = readLine;
            this.f21501++;
            if (readLine == null) {
                break;
            }
            if (readLine != null) {
                for (int i = 0; i < readLine.length() && (charAt = readLine.charAt(i)) != '#'; i++) {
                    if (!C3395.m10355(charAt)) {
                        break loop0;
                    }
                }
            }
        }
        while (this.f21503 != null) {
            m18853();
            String m18852 = m18852(false);
            m18853();
            if (m18852.endsWith("package-info")) {
                m18854();
            } else {
                if (m18852.endsWith("-") && m18849(0) == ">".charAt(0)) {
                    m18859();
                    m18852 = C15472.m36561(1, 0, m18852);
                } else {
                    m18853();
                    if (m18849(0) == '-' && m18849(1) == '>') {
                        m18859();
                        m18859();
                    }
                }
                m18853();
                String m188522 = m18852(false);
                m18853();
                char c = ':';
                m18856(':');
                C23179 m30861 = c12596.m30861(m188522, m18852);
                m18853();
                if (this.f21503.length() != this.f21500) {
                    throw new C23906(this, "Expected end of line", false);
                }
                if (m18854()) {
                    C14733 c14733 = null;
                    C14733 c147332 = null;
                    C21085 c210852 = null;
                    while (true) {
                        if (!C3395.m10355(m18861())) {
                            break;
                        }
                        m18853();
                        Object m18851 = m18851();
                        if (m18851 == null) {
                            c21085 = null;
                        } else {
                            if (!(m18851 instanceof C21085)) {
                                throw new C23906(this, String.format("Invalid obfuscated line number range (%s).", m18851), false);
                            }
                            m18853();
                            m18856(c);
                            c21085 = (C21085) m18851;
                        }
                        m18853();
                        String m188523 = m18852(true);
                        boolean z = false;
                        while (this.f21500 < this.f21503.length() && C3395.m10355(m18861())) {
                            z = z || m18861() != 65279;
                            m18860();
                        }
                        if (!z) {
                            throw new C23906(this, "Expected whitespace", true);
                        }
                        int i2 = this.f21500;
                        m18857(true);
                        while (m18849(0) == '.') {
                            m18859();
                            m18857(true);
                        }
                        String substring = this.f21503.substring(i2, this.f21500);
                        HashMap hashMap = this.f21502;
                        if (hashMap.containsKey(substring)) {
                            substring = (String) hashMap.get(substring);
                        } else {
                            hashMap.put(substring, substring);
                        }
                        m18853();
                        if (m18849(0) == '(') {
                            m18859();
                            m18853();
                            if (m18849(0) == ')') {
                                strArr = new String[0];
                            } else {
                                LinkedList linkedList = new LinkedList();
                                linkedList.add(m18852(true));
                                m18853();
                                while (m18849(0) != ')') {
                                    m18853();
                                    m18856(',');
                                    m18853();
                                    linkedList.add(m18852(true));
                                }
                                strArr = (String[]) linkedList.toArray(new String[0]);
                            }
                            m18856(')');
                            c11207 = new C16850(substring, m188523, strArr);
                        } else {
                            c11207 = new C11207(substring, m188523);
                        }
                        m18853();
                        if (m18849(0) == ':') {
                            m18859();
                            m18853();
                            obj = m18851();
                            if (obj == null) {
                                throw new C23906(this, "No number follows the colon after the method signature.", false);
                            }
                        } else {
                            obj = null;
                        }
                        if (c21085 == null && obj != null) {
                            throw new C23906(this, "No mapping for original range " + obj + ".", false);
                        }
                        m18853();
                        m18856('-');
                        m18856('>');
                        m18853();
                        int i3 = this.f21500;
                        m18857(true);
                        while (m18849(0) == '.') {
                            m18859();
                            m18857(true);
                        }
                        String substring2 = this.f21503.substring(i3, this.f21500);
                        if (hashMap.containsKey(substring2)) {
                            substring2 = (String) hashMap.get(substring2);
                        } else {
                            hashMap.put(substring2, substring2);
                        }
                        if (c11207 instanceof C16850) {
                            m30861.m51422(c21085, (C16850) c11207, obj, substring2);
                        }
                        if (c147332 != null) {
                            boolean equals = c147332.f44997.f53664.equals(substring2);
                            boolean equals2 = C11003.equals(c210852, c21085);
                            if ((!equals || c210852 == null || !equals2) && (c14733 == null || !c14733.f44998.equals(c147332.f44998))) {
                                m30861.m51421(c147332);
                                c14733 = c147332;
                            }
                        }
                        c147332 = new C14733(c11207, substring2);
                        if (this.f21503.length() != this.f21500) {
                            throw new C23906(this, "Expected end of line", false);
                        }
                        if (!m18854()) {
                            c210852 = c21085;
                            break;
                        } else {
                            c210852 = c21085;
                            c = ':';
                        }
                    }
                    if (c147332 != null) {
                        boolean z2 = c14733 == null || !c14733.f44998.equals(c147332.f44998);
                        if (c210852 == null || z2) {
                            m30861.m51421(c147332);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m18857(boolean z) {
        boolean z2;
        if (z && m18849(0) == '<') {
            m18859();
            z2 = true;
        } else {
            z2 = false;
        }
        if (!C19993.m46100(m18861()) && m18861() != 63) {
            throw new C23906(this, "Identifier expected", false);
        }
        m18860();
        while (true) {
            if (!C19993.m46100(m18861()) && m18861() != 63) {
                break;
            } else {
                m18860();
            }
        }
        if (z2) {
            m18856('>');
        }
        if (C19993.m46100(m18861())) {
            throw new C23906(this, "End of identifier expected (was 0x" + Integer.toHexString(m18861()) + MotionUtils.EASING_TYPE_FORMAT_END, false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m18852(boolean z) {
        int i = this.f21500;
        m18857(false);
        while (m18849(0) == '.') {
            m18859();
            m18857(false);
        }
        if (z) {
            while (m18849(0) == '[') {
                m18859();
                m18856(']');
            }
        }
        String substring = this.f21503.substring(i, this.f21500);
        HashMap hashMap = this.f21502;
        if (hashMap.containsKey(substring)) {
            return (String) hashMap.get(substring);
        }
        hashMap.put(substring, substring);
        return substring;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m18851() {
        char m18849 = m18849(0);
        if ('0' > m18849 || m18849 > '9') {
            return null;
        }
        int m18858 = m18858();
        m18853();
        if (m18849(0) != ':') {
            return Integer.valueOf(m18858);
        }
        m18856(':');
        m18853();
        return new C21085(m18858, m18858());
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m18858() {
        char m18849;
        char m188492 = m18849(0);
        if ('0' > m188492 || m188492 > '9') {
            throw new C23906(this, "Number expected", false);
        }
        int i = 0;
        do {
            i = (i * 10) + Character.getNumericValue(m18859());
            m18849 = m18849(0);
            if ('0' > m18849) {
                break;
            }
        } while (m18849 <= '9');
        return i;
    }
}
