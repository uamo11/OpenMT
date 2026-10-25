package l;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* compiled from: ZAYS */
/* renamed from: l.᩻ۜۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C23525 implements Closeable, Flushable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f75520 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f75521 = new String[128];

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f75522;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f75523;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21697 f75524;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f75525;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int[] f75526;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public EnumC16093 f75527;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75528;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Writer f75529;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f75530;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f75531;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f75532;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f75533;

    static {
        for (int i = 0; i <= 31; i++) {
            f75521[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f75521;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f75522 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C23525(Writer writer) {
        int[] iArr = new int[32];
        this.f75526 = iArr;
        this.f75525 = 0;
        if (iArr.length == 0) {
            this.f75526 = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f75526;
        int i = this.f75525;
        this.f75525 = i + 1;
        iArr2[i] = 6;
        this.f75527 = EnumC16093.LEGACY_STRICT;
        this.f75528 = true;
        C11003.requireNonNull(writer, "out == null");
        this.f75529 = writer;
        m51978(C21697.f69584);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51978(C21697 c21697) {
        C11003.requireNonNull(c21697);
        this.f75524 = c21697;
        this.f75530 = ",";
        if (c21697.m48974()) {
            this.f75532 = ": ";
            if (this.f75524.m48973().isEmpty()) {
                this.f75530 = ", ";
            }
        } else {
            this.f75532 = ":";
        }
        this.f75533 = this.f75524.m48973().isEmpty() && this.f75524.m48971().isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51977(EnumC16093 enumC16093) {
        C11003.requireNonNull(enumC16093);
        this.f75527 = enumC16093;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final EnumC16093 m51982() {
        return this.f75527;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51979(boolean z) {
        this.f75523 = z;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m51980() {
        return this.f75523;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51985(boolean z) {
        this.f75528 = z;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51990() {
        return this.f75528;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51972() {
        m51968();
        m51970();
        int i = this.f75525;
        int[] iArr = this.f75526;
        if (i == iArr.length) {
            this.f75526 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f75526;
        int i2 = this.f75525;
        this.f75525 = i2 + 1;
        iArr2[i2] = 1;
        this.f75529.write(91);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m51989() {
        m51967(']', 1, 2);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m51987() {
        m51968();
        m51970();
        int i = this.f75525;
        int[] iArr = this.f75526;
        if (i == iArr.length) {
            this.f75526 = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.f75526;
        int i2 = this.f75525;
        this.f75525 = i2 + 1;
        iArr2[i2] = 3;
        this.f75529.write(123);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m51986() {
        m51967('}', 3, 5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51967(char c, int i, int i2) {
        int m51966 = m51966();
        if (m51966 != i2 && m51966 != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f75531 != null) {
            throw new IllegalStateException("Dangling name: " + this.f75531);
        }
        this.f75525--;
        if (m51966 == i2) {
            m51971();
        }
        this.f75529.write(c);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private int m51966() {
        int i = this.f75525;
        if (i == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        return this.f75526[i - 1];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51976(String str) {
        C11003.requireNonNull(str, "name == null");
        if (this.f75531 != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int m51966 = m51966();
        if (m51966 != 3 && m51966 != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f75531 = str;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m51968() {
        if (this.f75531 != null) {
            int m51966 = m51966();
            if (m51966 == 5) {
                this.f75529.write(this.f75530);
            } else if (m51966 != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m51971();
            this.f75526[this.f75525 - 1] = 4;
            m51969(this.f75531);
            this.f75531 = null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51984(String str) {
        if (str == null) {
            m51981();
            return;
        }
        m51968();
        m51970();
        m51969(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m51988(boolean z) {
        m51968();
        m51970();
        this.f75529.write(z ? "true" : "false");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51974(Boolean bool) {
        if (bool == null) {
            m51981();
            return;
        }
        m51968();
        m51970();
        this.f75529.write(bool.booleanValue() ? "true" : "false");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51973(double d) {
        m51968();
        if (this.f75527 != EnumC16093.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        m51970();
        this.f75529.append((CharSequence) Double.toString(d));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51983(long j) {
        m51968();
        m51970();
        this.f75529.write(Long.toString(j));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51975(Number number) {
        if (number == null) {
            m51981();
            return;
        }
        m51968();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                if (this.f75527 != EnumC16093.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
                }
            } else if (cls != Float.class && cls != Double.class && !f75520.matcher(obj).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
            }
        }
        m51970();
        this.f75529.append((CharSequence) obj);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C23525 m51981() {
        if (this.f75531 != null) {
            if (this.f75528) {
                m51968();
            } else {
                this.f75531 = null;
                return this;
            }
        }
        m51970();
        this.f75529.write("null");
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f75525 == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f75529.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f75529.close();
        int i = this.f75525;
        if (i > 1 || (i == 1 && this.f75526[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f75525 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51969(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f75523
            if (r0 == 0) goto L7
            java.lang.String[] r0 = l.C23525.f75522
            goto L9
        L7:
            java.lang.String[] r0 = l.C23525.f75521
        L9:
            java.io.Writer r1 = r8.f75529
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = 0
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23525.m51969(java.lang.String):void");
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m51971() {
        if (this.f75533) {
            return;
        }
        String m48973 = this.f75524.m48973();
        Writer writer = this.f75529;
        writer.write(m48973);
        int i = this.f75525;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f75524.m48971());
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m51970() {
        int m51966 = m51966();
        if (m51966 == 1) {
            this.f75526[this.f75525 - 1] = 2;
            m51971();
            return;
        }
        Writer writer = this.f75529;
        if (m51966 == 2) {
            writer.append((CharSequence) this.f75530);
            m51971();
        } else {
            if (m51966 != 4) {
                if (m51966 != 6) {
                    if (m51966 == 7) {
                        if (this.f75527 != EnumC16093.LENIENT) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                this.f75526[this.f75525 - 1] = 7;
                return;
            }
            writer.append((CharSequence) this.f75532);
            this.f75526[this.f75525 - 1] = 5;
        }
    }
}
