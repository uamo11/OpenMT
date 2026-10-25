package com.amazonaws.util.json;

import java.io.EOFException;
import java.io.StringReader;
import l.C17175;
import l.EnumC14352;

/* loaded from: classes.dex */
public final class GsonFactory implements AwsJsonFactory {

    public final class GsonReader {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final C17175 f866;

        public GsonReader(StringReader stringReader) {
            this.f866 = new C17175(stringReader);
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final void m802() {
            this.f866.m40402();
        }

        /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final void m806() {
            this.f866.m40410();
        }

        /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
        public final boolean m807() {
            EnumC14352 m40398 = this.f866.m40398();
            return EnumC14352.BEGIN_ARRAY.equals(m40398) || EnumC14352.BEGIN_OBJECT.equals(m40398);
        }

        /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final boolean m808() {
            return this.f866.m40404();
        }

        /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
        public final String m805() {
            return this.f866.m40396();
        }

        /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
        public final String m810() {
            C17175 c17175 = this.f866;
            EnumC14352 m40398 = c17175.m40398();
            if (EnumC14352.NULL.equals(m40398)) {
                c17175.m40394();
                return null;
            }
            if (EnumC14352.BOOLEAN.equals(m40398)) {
                return c17175.m40401() ? "true" : "false";
            }
            return c17175.m40399();
        }

        /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
        public final void m809() {
            this.f866.m40409();
        }

        /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
        public final AwsJsonToken m803() {
            try {
                EnumC14352 m40398 = this.f866.m40398();
                if (m40398 == null) {
                    return null;
                }
                switch (AnonymousClass1.f865[m40398.ordinal()]) {
                    case 1:
                        return AwsJsonToken.BEGIN_ARRAY;
                    case 2:
                        return AwsJsonToken.END_ARRAY;
                    case 3:
                        return AwsJsonToken.BEGIN_OBJECT;
                    case 4:
                        return AwsJsonToken.END_OBJECT;
                    case 5:
                        return AwsJsonToken.FIELD_NAME;
                    case 6:
                        return AwsJsonToken.VALUE_BOOLEAN;
                    case 7:
                        return AwsJsonToken.VALUE_NUMBER;
                    case 8:
                        return AwsJsonToken.VALUE_NULL;
                    case 9:
                        return AwsJsonToken.VALUE_STRING;
                    case 10:
                        return null;
                    default:
                        return AwsJsonToken.UNKNOWN;
                }
            } catch (EOFException unused) {
                return null;
            }
        }

        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final void m804() {
            this.f866.close();
        }
    }

    /* renamed from: com.amazonaws.util.json.GsonFactory$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static final /* synthetic */ int[] f865;

        static {
            int[] iArr = new int[EnumC14352.values().length];
            f865 = iArr;
            try {
                iArr[EnumC14352.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f865[EnumC14352.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f865[EnumC14352.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f865[EnumC14352.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f865[EnumC14352.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f865[EnumC14352.BOOLEAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f865[EnumC14352.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f865[EnumC14352.NULL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f865[EnumC14352.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f865[EnumC14352.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }
}
