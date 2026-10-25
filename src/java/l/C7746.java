package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.am;
import java.io.Closeable;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: ZAX9 */
/* renamed from: l.۟᩸᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7746 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m20777(C9246 c9246) {
        while (c9246.m23720()) {
            switch (c9246.m23725()) {
                case '[':
                    return false;
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                    c9246.m23723();
                    char m23725 = c9246.m23725();
                    switch (m23725) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                        case '.':
                        case '/':
                            c9246.m23723();
                            break;
                        default:
                            switch (m23725) {
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    c9246.m23723();
                                    break;
                                default:
                                    switch (m23725) {
                                        case '[':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                        case ']':
                                        case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                        case '_':
                                        case '`':
                                            c9246.m23723();
                                            break;
                                        default:
                                            switch (m23725) {
                                                case '{':
                                                case '|':
                                                case q.h /* 125 */:
                                                case '~':
                                                    c9246.m23723();
                                                    break;
                                            }
                                    }
                            }
                    }
                case ']':
                    return true;
                default:
                    c9246.m23723();
                    break;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0097 A[FALL_THROUGH] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m20775(l.C9246 r8) {
        /*
            boolean r0 = r8.m23720()
            r1 = 0
            if (r0 != 0) goto L9
            goto L7e
        L9:
            r0 = 60
            boolean r2 = r8.m23726(r0)
            r3 = 1
            r4 = 92
            if (r2 == 0) goto L4a
        L14:
            boolean r2 = r8.m23720()
            if (r2 == 0) goto L7e
            char r2 = r8.m23725()
            r5 = 10
            if (r2 == r5) goto L7e
            if (r2 == r0) goto L7e
            r5 = 62
            if (r2 == r5) goto L46
            if (r2 == r4) goto L2e
            r8.m23723()
            goto L14
        L2e:
            r8.m23723()
            char r2 = r8.m23725()
            switch(r2) {
                case 33: goto L42;
                case 34: goto L42;
                case 35: goto L42;
                case 36: goto L42;
                case 37: goto L42;
                case 38: goto L42;
                case 39: goto L42;
                case 40: goto L42;
                case 41: goto L42;
                case 42: goto L42;
                case 43: goto L42;
                case 44: goto L42;
                case 45: goto L42;
                case 46: goto L42;
                case 47: goto L42;
                default: goto L38;
            }
        L38:
            switch(r2) {
                case 58: goto L42;
                case 59: goto L42;
                case 60: goto L42;
                case 61: goto L42;
                case 62: goto L42;
                case 63: goto L42;
                case 64: goto L42;
                default: goto L3b;
            }
        L3b:
            switch(r2) {
                case 91: goto L42;
                case 92: goto L42;
                case 93: goto L42;
                case 94: goto L42;
                case 95: goto L42;
                case 96: goto L42;
                default: goto L3e;
            }
        L3e:
            switch(r2) {
                case 123: goto L42;
                case 124: goto L42;
                case 125: goto L42;
                case 126: goto L42;
                default: goto L41;
            }
        L41:
            goto L14
        L42:
            r8.m23723()
            goto L14
        L46:
            r8.m23723()
            return r3
        L4a:
            r0 = 1
            r2 = 0
        L4c:
            boolean r5 = r8.m23720()
            if (r5 == 0) goto L9c
            char r5 = r8.m23725()
            r6 = 32
            if (r5 == r6) goto L6a
            if (r5 == r4) goto L83
            r7 = 40
            if (r5 == r7) goto L7a
            r6 = 41
            if (r5 == r6) goto L71
            boolean r5 = java.lang.Character.isISOControl(r5)
            if (r5 == 0) goto L6d
        L6a:
            r8 = r0 ^ 1
            return r8
        L6d:
            r8.m23723()
            goto L9a
        L71:
            if (r2 != 0) goto L74
            goto L9c
        L74:
            int r2 = r2 + (-1)
            r8.m23723()
            goto L9a
        L7a:
            int r2 = r2 + 1
            if (r2 <= r6) goto L7f
        L7e:
            return r1
        L7f:
            r8.m23723()
            goto L9a
        L83:
            r8.m23723()
            char r0 = r8.m23725()
            switch(r0) {
                case 33: goto L97;
                case 34: goto L97;
                case 35: goto L97;
                case 36: goto L97;
                case 37: goto L97;
                case 38: goto L97;
                case 39: goto L97;
                case 40: goto L97;
                case 41: goto L97;
                case 42: goto L97;
                case 43: goto L97;
                case 44: goto L97;
                case 45: goto L97;
                case 46: goto L97;
                case 47: goto L97;
                default: goto L8d;
            }
        L8d:
            switch(r0) {
                case 58: goto L97;
                case 59: goto L97;
                case 60: goto L97;
                case 61: goto L97;
                case 62: goto L97;
                case 63: goto L97;
                case 64: goto L97;
                default: goto L90;
            }
        L90:
            switch(r0) {
                case 91: goto L97;
                case 92: goto L97;
                case 93: goto L97;
                case 94: goto L97;
                case 95: goto L97;
                case 96: goto L97;
                default: goto L93;
            }
        L93:
            switch(r0) {
                case 123: goto L97;
                case 124: goto L97;
                case 125: goto L97;
                case 126: goto L97;
                default: goto L96;
            }
        L96:
            goto L9a
        L97:
            r8.m23723()
        L9a:
            r0 = 0
            goto L4c
        L9c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7746.m20775(l.ۢ֨֡):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m20774(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                C10881.m27179(th, th2);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20772(InterfaceC9978 interfaceC9978) {
        StringBuilder sb = new StringBuilder("{");
        int mo3615 = interfaceC9978.mo3615();
        if (mo3615 == 1) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
        } else if (mo3615 == 2) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
        } else if (mo3615 == 3) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
            sb.append(", v");
            sb.append(interfaceC9978.mo3611());
        } else if (mo3615 == 4) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
            sb.append(", v");
            sb.append(interfaceC9978.mo3611());
            sb.append(", v");
            sb.append(interfaceC9978.mo3613());
        } else if (mo3615 == 5) {
            sb.append(am.aE);
            sb.append(interfaceC9978.mo3614());
            sb.append(", v");
            sb.append(interfaceC9978.mo3612());
            sb.append(", v");
            sb.append(interfaceC9978.mo3611());
            sb.append(", v");
            sb.append(interfaceC9978.mo3613());
            sb.append(", v");
            sb.append(interfaceC9978.mo3610());
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m20778(C9246 c9246) {
        if (!c9246.m23720()) {
            return false;
        }
        char m23725 = c9246.m23725();
        char c = '\"';
        if (m23725 != '\"') {
            c = '\'';
            if (m23725 != '\'') {
                if (m23725 != '(') {
                    return false;
                }
                c = ')';
            }
        }
        c9246.m23723();
        if (!m20776(c9246, c) || !c9246.m23720()) {
            return false;
        }
        c9246.m23723();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20773(InterfaceC16595 interfaceC16595) {
        if (interfaceC16595.mo3615() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{v");
        sb.append(interfaceC16595.mo9712());
        sb.append(" .. v");
        sb.append((r3 + r0) - 1);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m20776(C9246 c9246, char c) {
        while (c9246.m23720()) {
            char m23725 = c9246.m23725();
            if (m23725 == '\\') {
                c9246.m23723();
                char m237252 = c9246.m23725();
                switch (m237252) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case '.':
                    case '/':
                        c9246.m23723();
                        break;
                    default:
                        switch (m237252) {
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                c9246.m23723();
                                break;
                            default:
                                switch (m237252) {
                                    case '[':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                    case ']':
                                    case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                    case '_':
                                    case '`':
                                        c9246.m23723();
                                        break;
                                    default:
                                        switch (m237252) {
                                            case '{':
                                            case '|':
                                            case q.h /* 125 */:
                                            case '~':
                                                c9246.m23723();
                                                break;
                                        }
                                }
                        }
                }
            } else {
                if (m23725 == c) {
                    return true;
                }
                if (c == ')' && m23725 == '(') {
                    return false;
                }
                c9246.m23723();
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m20771(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }
}
