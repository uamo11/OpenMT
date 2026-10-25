package l;

/* compiled from: O27D */
/* renamed from: l.ۚ۠ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC5222 {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f16363;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f16364;

    EnumC5222(int[] iArr, int i) {
        this.f16364 = iArr;
        this.f16363 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC5222 m15012(int i) {
        if (i == 0) {
            return TERMINATOR;
        }
        if (i == 1) {
            return NUMERIC;
        }
        if (i == 2) {
            return ALPHANUMERIC;
        }
        if (i == 3) {
            return STRUCTURED_APPEND;
        }
        if (i == 4) {
            return BYTE;
        }
        if (i == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i == 7) {
            return ECI;
        }
        if (i == 8) {
            return KANJI;
        }
        if (i == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m15015(C15098 c15098) {
        int m35782 = c15098.m35782();
        return this.f16364[m35782 <= 9 ? (char) 0 : m35782 <= 26 ? (char) 1 : (char) 2];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m15014() {
        return this.f16363;
    }
}
