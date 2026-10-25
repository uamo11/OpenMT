package l;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.motion.MotionUtils;

/* compiled from: N673 */
/* renamed from: l.ܺۙᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15714 implements InterfaceC14303 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C15714(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        switch (this.a) {
            case 0:
                Long a = c10071.a(EnumC18496.OFFSET_SECONDS);
                if (a != null) {
                    sb.append("GMT");
                    int y = AbstractC22791.y(a.longValue());
                    if (y != 0) {
                        int abs = Math.abs((y / 3600) % 100);
                        int abs2 = Math.abs((y / 60) % 60);
                        int abs3 = Math.abs(y % 60);
                        sb.append(y < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
                        if (((EnumC20655) this.b) == EnumC20655.FULL) {
                            a(sb, abs);
                            sb.append(':');
                            a(sb, abs2);
                            if (abs3 != 0) {
                                sb.append(':');
                                a(sb, abs3);
                                break;
                            }
                        } else {
                            if (abs >= 10) {
                                sb.append((char) ((abs / 10) + 48));
                            }
                            sb.append((char) ((abs % 10) + 48));
                            if (abs2 != 0 || abs3 != 0) {
                                sb.append(':');
                                a(sb, abs2);
                                if (abs3 != 0) {
                                    sb.append(':');
                                    a(sb, abs3);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sb.append((String) this.b);
                break;
        }
        return true;
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        int i2;
        int b;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (this.a) {
            case 0:
                int length = charSequence.length();
                if (c3015.g(charSequence, i, "GMT", 0, 3)) {
                    int i7 = i + 3;
                    if (i7 == length) {
                        return c3015.f(EnumC18496.OFFSET_SECONDS, 0L, i, i7);
                    }
                    char charAt = charSequence.charAt(i7);
                    if (charAt == '+') {
                        i2 = 1;
                    } else {
                        if (charAt != '-') {
                            return c3015.f(EnumC18496.OFFSET_SECONDS, 0L, i, i7);
                        }
                        i2 = -1;
                    }
                    int i8 = i + 4;
                    int i9 = 0;
                    if (((EnumC20655) this.b) == EnumC20655.FULL) {
                        int b2 = b(charSequence, i8);
                        int i10 = i + 6;
                        int b3 = b(charSequence, i + 5);
                        if (b2 >= 0 && b3 >= 0) {
                            int i11 = i + 7;
                            if (charSequence.charAt(i10) == ':') {
                                b = (b2 * 10) + b3;
                                int b4 = b(charSequence, i11);
                                i6 = i + 9;
                                int b5 = b(charSequence, i + 8);
                                if (b4 >= 0 && b5 >= 0) {
                                    i5 = (b4 * 10) + b5;
                                    int i12 = i + 11;
                                    if (i12 < length && charSequence.charAt(i6) == ':') {
                                        int b6 = b(charSequence, i + 10);
                                        int b7 = b(charSequence, i12);
                                        if (b6 >= 0 && b7 >= 0) {
                                            i9 = (b6 * 10) + b7;
                                            i6 = i + 12;
                                        }
                                    }
                                    i4 = i6;
                                }
                            }
                        }
                    } else {
                        int i13 = i + 5;
                        b = b(charSequence, i8);
                        if (b >= 0) {
                            if (i13 < length) {
                                int b8 = b(charSequence, i13);
                                if (b8 >= 0) {
                                    b = (b * 10) + b8;
                                    i13 = i + 6;
                                }
                                int i14 = i13 + 2;
                                if (i14 < length && charSequence.charAt(i13) == ':' && i14 < length && charSequence.charAt(i13) == ':') {
                                    int b9 = b(charSequence, i13 + 1);
                                    int b10 = b(charSequence, i14);
                                    if (b9 >= 0 && b10 >= 0) {
                                        i9 = (b9 * 10) + b10;
                                        i3 = i13 + 3;
                                        int i15 = i13 + 5;
                                        if (i15 < length && charSequence.charAt(i3) == ':') {
                                            int b11 = b(charSequence, i13 + 4);
                                            int b12 = b(charSequence, i15);
                                            if (b11 >= 0 && b12 >= 0) {
                                                i6 = i13 + 6;
                                                i5 = i9;
                                                i9 = b12 + (b11 * 10);
                                                i4 = i6;
                                            }
                                        }
                                        i4 = i3;
                                        i5 = i9;
                                        i9 = 0;
                                    }
                                }
                            }
                            i3 = i13;
                            i4 = i3;
                            i5 = i9;
                            i9 = 0;
                        }
                    }
                    return c3015.f(EnumC18496.OFFSET_SECONDS, ((i5 * 60) + (b * 3600) + i9) * i2, i, i4);
                }
                return ~i;
            default:
                String str = (String) this.b;
                if (i > charSequence.length() || i < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !c3015.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "LocalizedOffset(" + ((EnumC20655) this.b) + MotionUtils.EASING_TYPE_FORMAT_END;
            default:
                return "'" + ((String) this.b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }
}
