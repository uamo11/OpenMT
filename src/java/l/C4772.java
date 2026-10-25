package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: 9BGI */
/* renamed from: l.ۙܽܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4772 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C21706 f15142 = new C21706();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11186 f15143;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10396 f15144;

    public C4772(C11186 c11186, C10396 c10396) {
        if (c10396 == null) {
            throw new NullPointerException("pool == null");
        }
        this.f15143 = c11186;
        this.f15144 = c10396;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m13941() {
        return this.f15143.m27748();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13939() {
        return this.f15143.m27748() + 4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m13940(int i, InterfaceC20295 interfaceC20295) {
        C11186 c11186 = this.f15143;
        if (interfaceC20295 == null) {
            interfaceC20295 = f15142;
        }
        InterfaceC20295 interfaceC202952 = interfaceC20295;
        try {
            int m27755 = c11186.m27755(i);
            C15354.m36390(m27755);
            C10396 c10396 = this.f15144;
            switch (m27755) {
                case 0:
                    interfaceC202952.mo8331(m27755, i, C7573.f23406);
                    return 1;
                case 1:
                    interfaceC202952.mo8330(18, i, 1, C19569.f63254, 0);
                    return 1;
                case 2:
                    interfaceC202952.mo8330(18, i, 1, C2635.f8319, -1);
                    return 1;
                case 3:
                    interfaceC202952.mo8330(18, i, 1, C2635.f8323, 0);
                    return 1;
                case 4:
                    interfaceC202952.mo8330(18, i, 1, C2635.f8322, 1);
                    return 1;
                case 5:
                    interfaceC202952.mo8330(18, i, 1, C2635.f8317, 2);
                    return 1;
                case 6:
                    interfaceC202952.mo8330(18, i, 1, C2635.f8316, 3);
                    return 1;
                case 7:
                    interfaceC202952.mo8330(18, i, 1, C2635.f8321, 4);
                    return 1;
                case 8:
                    interfaceC202952.mo8330(18, i, 1, C2635.f8320, 5);
                    return 1;
                case 9:
                    interfaceC202952.mo8330(18, i, 1, C8279.f25451, 0);
                    return 1;
                case 10:
                    interfaceC202952.mo8330(18, i, 1, C8279.f25450, 0);
                    return 1;
                case 11:
                    interfaceC202952.mo8330(18, i, 1, C16039.f49461, 0);
                    return 1;
                case 12:
                    interfaceC202952.mo8330(18, i, 1, C16039.f49460, 0);
                    return 1;
                case 13:
                    interfaceC202952.mo8330(18, i, 1, C16039.f49459, 0);
                    return 1;
                case 14:
                    interfaceC202952.mo8330(18, i, 1, C20980.f67768, 0);
                    return 1;
                case 15:
                    interfaceC202952.mo8330(18, i, 1, C20980.f67767, 0);
                    return 1;
                case 16:
                    int m27749 = c11186.m27749(i + 1);
                    interfaceC202952.mo8330(18, i, 2, C2635.m8291(m27749), m27749);
                    return 2;
                case 17:
                    int m27756 = c11186.m27756(i + 1);
                    interfaceC202952.mo8330(18, i, 3, C2635.m8291(m27756), m27756);
                    return 3;
                case 18:
                    AbstractC13717 abstractC13717 = c10396.get(c11186.m27755(i + 1));
                    interfaceC202952.mo8330(18, i, 2, abstractC13717, abstractC13717 instanceof C2635 ? ((C2635) abstractC13717).mo2231() : 0);
                    return 2;
                case 19:
                    AbstractC13717 abstractC137172 = c10396.get(c11186.m27753(i + 1));
                    interfaceC202952.mo8330(18, i, 3, abstractC137172, abstractC137172 instanceof C2635 ? ((C2635) abstractC137172).mo2231() : 0);
                    return 3;
                case 20:
                    interfaceC202952.mo8330(20, i, 3, c10396.get(c11186.m27753(i + 1)), 0);
                    return 3;
                case 21:
                    interfaceC202952.mo8329(21, i, 2, c11186.m27755(i + 1), C7573.f23413, 0);
                    return 2;
                case 22:
                    interfaceC202952.mo8329(21, i, 2, c11186.m27755(i + 1), C7573.f23418, 0);
                    return 2;
                case 23:
                    interfaceC202952.mo8329(21, i, 2, c11186.m27755(i + 1), C7573.f23420, 0);
                    return 2;
                case 24:
                    interfaceC202952.mo8329(21, i, 2, c11186.m27755(i + 1), C7573.f23411, 0);
                    return 2;
                case 25:
                    interfaceC202952.mo8329(21, i, 2, c11186.m27755(i + 1), C7573.f23412, 0);
                    return 2;
                case 26:
                case 27:
                case 28:
                case 29:
                    interfaceC202952.mo8329(21, i, 1, m27755 - 26, C7573.f23413, 0);
                    return 1;
                case 30:
                case 31:
                case 32:
                case 33:
                    interfaceC202952.mo8329(21, i, 1, m27755 - 30, C7573.f23418, 0);
                    return 1;
                case 34:
                case 35:
                case 36:
                case 37:
                    interfaceC202952.mo8329(21, i, 1, m27755 - 34, C7573.f23420, 0);
                    return 1;
                case 38:
                case 39:
                case 40:
                case 41:
                    interfaceC202952.mo8329(21, i, 1, m27755 - 38, C7573.f23411, 0);
                    return 1;
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    interfaceC202952.mo8329(21, i, 1, m27755 - 42, C7573.f23412, 0);
                    return 1;
                case 46:
                    interfaceC202952.mo8331(46, i, C7573.f23413);
                    return 1;
                case 47:
                    interfaceC202952.mo8331(46, i, C7573.f23418);
                    return 1;
                case 48:
                    interfaceC202952.mo8331(46, i, C7573.f23420);
                    return 1;
                case 49:
                    interfaceC202952.mo8331(46, i, C7573.f23411);
                    return 1;
                case 50:
                    interfaceC202952.mo8331(46, i, C7573.f23412);
                    return 1;
                case 51:
                    interfaceC202952.mo8331(46, i, C7573.f23423);
                    return 1;
                case 52:
                    interfaceC202952.mo8331(46, i, C7573.f23389);
                    return 1;
                case 53:
                    interfaceC202952.mo8331(46, i, C7573.f23393);
                    return 1;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    interfaceC202952.mo8329(54, i, 2, c11186.m27755(i + 1), C7573.f23413, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    interfaceC202952.mo8329(54, i, 2, c11186.m27755(i + 1), C7573.f23418, 0);
                    return 2;
                case 56:
                    interfaceC202952.mo8329(54, i, 2, c11186.m27755(i + 1), C7573.f23420, 0);
                    return 2;
                case 57:
                    interfaceC202952.mo8329(54, i, 2, c11186.m27755(i + 1), C7573.f23411, 0);
                    return 2;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    interfaceC202952.mo8329(54, i, 2, c11186.m27755(i + 1), C7573.f23412, 0);
                    return 2;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                case 61:
                case 62:
                    interfaceC202952.mo8329(54, i, 1, m27755 - 59, C7573.f23413, 0);
                    return 1;
                case 63:
                case 64:
                case 65:
                case 66:
                    interfaceC202952.mo8329(54, i, 1, m27755 - 63, C7573.f23418, 0);
                    return 1;
                case 67:
                case 68:
                case 69:
                case 70:
                    interfaceC202952.mo8329(54, i, 1, m27755 - 67, C7573.f23420, 0);
                    return 1;
                case 71:
                case 72:
                case 73:
                case 74:
                    interfaceC202952.mo8329(54, i, 1, m27755 - 71, C7573.f23411, 0);
                    return 1;
                case 75:
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                case 77:
                case 78:
                    interfaceC202952.mo8329(54, i, 1, m27755 - 75, C7573.f23412, 0);
                    return 1;
                case 79:
                    interfaceC202952.mo8331(79, i, C7573.f23413);
                    return 1;
                case 80:
                    interfaceC202952.mo8331(79, i, C7573.f23418);
                    return 1;
                case 81:
                    interfaceC202952.mo8331(79, i, C7573.f23420);
                    return 1;
                case 82:
                    interfaceC202952.mo8331(79, i, C7573.f23411);
                    return 1;
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                    interfaceC202952.mo8331(79, i, C7573.f23412);
                    return 1;
                case 84:
                    interfaceC202952.mo8331(79, i, C7573.f23423);
                    return 1;
                case 85:
                    interfaceC202952.mo8331(79, i, C7573.f23389);
                    return 1;
                case HRSS1373Polynomial.K /* 86 */:
                    interfaceC202952.mo8331(79, i, C7573.f23393);
                    return 1;
                case TextInputLayout.DEFAULT_PLACEHOLDER_FADE_DURATION /* 87 */:
                case 88:
                case 89:
                case 90:
                case 91:
                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                case 93:
                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                case 95:
                    interfaceC202952.mo8331(m27755, i, C7573.f23406);
                    return 1;
                case 96:
                case 100:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 108:
                case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                case 116:
                case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                case 122:
                case 124:
                case 126:
                case 128:
                case 130:
                    interfaceC202952.mo8331(m27755, i, C7573.f23413);
                    return 1;
                case 97:
                case 101:
                case IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult /* 105 */:
                case 109:
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                case 123:
                case q.h /* 125 */:
                case 127:
                case 129:
                case 131:
                    interfaceC202952.mo8331(m27755 - 1, i, C7573.f23418);
                    return 1;
                case 98:
                case IShizukuService.Stub.TRANSACTION_attachUserService /* 102 */:
                case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                case UMErrorCode.E_UM_BE_JSON_FAILED /* 110 */:
                case 114:
                case 118:
                    interfaceC202952.mo8331(m27755 - 2, i, C7573.f23420);
                    return 1;
                case q.f /* 99 */:
                case IShizukuService.Stub.TRANSACTION_dispatchPackageChanged /* 103 */:
                case IShizukuService.Stub.TRANSACTION_updateFlagsForUid /* 107 */:
                case UMErrorCode.E_UM_BE_CREATE_FAILED /* 111 */:
                case 115:
                case 119:
                    interfaceC202952.mo8331(m27755 - 3, i, C7573.f23411);
                    return 1;
                case 132:
                    interfaceC202952.mo8329(m27755, i, 3, c11186.m27755(i + 1), C7573.f23413, c11186.m27749(i + 2));
                    return 3;
                case 133:
                case 140:
                case 143:
                    interfaceC202952.mo8331(m27755, i, C7573.f23418);
                    return 1;
                case 134:
                case 137:
                case 144:
                    interfaceC202952.mo8331(m27755, i, C7573.f23420);
                    return 1;
                case 135:
                case 138:
                case 141:
                    interfaceC202952.mo8331(m27755, i, C7573.f23411);
                    return 1;
                case 136:
                case 139:
                case 142:
                case 145:
                case 146:
                case 147:
                case 148:
                case 149:
                case 150:
                case 151:
                case 152:
                case 190:
                    interfaceC202952.mo8331(m27755, i, C7573.f23413);
                    return 1;
                case 153:
                case EnumC17734.f54268 /* 154 */:
                case 155:
                case 156:
                case 157:
                case 158:
                case 159:
                case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                case 161:
                case 162:
                case 163:
                case 164:
                case 165:
                case 166:
                case 167:
                case 168:
                case 198:
                case 199:
                    interfaceC202952.mo8328(m27755, i, 3, c11186.m27756(i + 1) + i);
                    return 3;
                case 169:
                    interfaceC202952.mo8329(m27755, i, 2, c11186.m27755(i + 1), C7573.f23422, 0);
                    return 2;
                case 170:
                    return m13938(i, interfaceC202952);
                case 171:
                    return m13935(i, interfaceC202952);
                case 172:
                    interfaceC202952.mo8331(172, i, C7573.f23413);
                    return 1;
                case 173:
                    interfaceC202952.mo8331(172, i, C7573.f23418);
                    return 1;
                case 174:
                    interfaceC202952.mo8331(172, i, C7573.f23420);
                    return 1;
                case HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS /* 175 */:
                    interfaceC202952.mo8331(172, i, C7573.f23411);
                    return 1;
                case PicnicEngine.MAX_AUX_BYTES /* 176 */:
                    interfaceC202952.mo8331(172, i, C7573.f23412);
                    return 1;
                case 177:
                case 191:
                case 194:
                case 195:
                    interfaceC202952.mo8331(m27755, i, C7573.f23406);
                    return 1;
                case 178:
                case 179:
                case 180:
                case 181:
                case 182:
                case 183:
                case 184:
                case 187:
                case 189:
                case 192:
                case 193:
                    interfaceC202952.mo8330(m27755, i, 3, c10396.get(c11186.m27753(i + 1)), 0);
                    return 3;
                case 185:
                    interfaceC202952.mo8330(m27755, i, 5, c10396.get(c11186.m27753(i + 1)), (c11186.m27755(i + 4) << 8) | c11186.m27755(i + 3));
                    return 5;
                case 186:
                    interfaceC202952.mo8330(m27755, i, 5, (C18863) c10396.get(c11186.m27753(i + 1)), 0);
                    return 5;
                case 188:
                    return m13936(i, interfaceC202952);
                case 196:
                    return m13937(i, interfaceC202952);
                case 197:
                    interfaceC202952.mo8330(m27755, i, 4, c10396.get(c11186.m27753(i + 1)), c11186.m27755(i + 3));
                    return 4;
                case 200:
                case 201:
                    interfaceC202952.mo8328(m27755 == 200 ? 167 : 168, i, 5, c11186.m27752(i + 1) + i);
                    return 5;
                default:
                    interfaceC202952.mo8327(m27755, i);
                    return 1;
            }
        } catch (C2698 e) {
            e.m21602("...at bytecode offset ".concat(C14712.m35008(i)));
            throw e;
        } catch (RuntimeException e2) {
            C2698 c2698 = new C2698(null, e2);
            c2698.m21602("...at bytecode offset ".concat(C14712.m35008(i)));
            throw c2698;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private int m13938(int i, InterfaceC20295 interfaceC20295) {
        C11186 c11186;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int i4 = 0;
        while (true) {
            c11186 = this.f15143;
            if (i3 >= i2) {
                break;
            }
            i4 = (i4 << 8) | c11186.m27755(i3);
            i3++;
        }
        int m27752 = c11186.m27752(i2) + i;
        int m277522 = c11186.m27752(i2 + 4);
        int m277523 = c11186.m27752(i2 + 8);
        int i5 = (m277523 - m277522) + 1;
        int i6 = i2 + 12;
        if (m277522 > m277523) {
            throw new C2698("low / high inversion", null);
        }
        C19632 c19632 = new C19632(i5);
        for (int i7 = 0; i7 < i5; i7++) {
            int m277524 = c11186.m27752(i6) + i;
            i6 += 4;
            c19632.add(m277522 + i7, m277524);
        }
        c19632.m45147(m27752);
        c19632.m45148();
        c19632.mo20349();
        int i8 = i6 - i;
        interfaceC20295.mo8333(i, i8, c19632, i4);
        return i8;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m13935(int i, InterfaceC20295 interfaceC20295) {
        C11186 c11186;
        int i2 = (i + 4) & (-4);
        int i3 = i + 1;
        int i4 = 0;
        while (true) {
            c11186 = this.f15143;
            if (i3 >= i2) {
                break;
            }
            i4 = (i4 << 8) | c11186.m27755(i3);
            i3++;
        }
        int m27752 = c11186.m27752(i2) + i;
        int m277522 = c11186.m27752(i2 + 4);
        int i5 = i2 + 8;
        C19632 c19632 = new C19632(m277522);
        for (int i6 = 0; i6 < m277522; i6++) {
            int m277523 = c11186.m27752(i5);
            int m277524 = c11186.m27752(i5 + 4) + i;
            i5 += 8;
            c19632.add(m277523, m277524);
        }
        c19632.m45147(m27752);
        c19632.m45148();
        c19632.mo20349();
        int i7 = i5 - i;
        interfaceC20295.mo8333(i, i7, c19632, i4);
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[LOOP:0: B:16:0x005a->B:34:0x00b7, LOOP_START, PHI: r6 r7
  0x005a: PHI (r6v2 int) = (r6v0 int), (r6v3 int) binds: [B:15:0x0058, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x005a: PHI (r7v3 int) = (r7v0 int), (r7v4 int) binds: [B:15:0x0058, B:34:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m13936(int r14, l.InterfaceC20295 r15) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4772.m13936(int, l.᩶ܽܺ):int");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m13937(int i, InterfaceC20295 interfaceC20295) {
        C11186 c11186 = this.f15143;
        int m27755 = c11186.m27755(i + 1);
        int m27753 = c11186.m27753(i + 2);
        if (m27755 == 132) {
            interfaceC20295.mo8329(m27755, i, 6, m27753, C7573.f23413, c11186.m27756(i + 4));
            return 6;
        }
        if (m27755 != 169) {
            switch (m27755) {
                case 21:
                    interfaceC20295.mo8329(21, i, 4, m27753, C7573.f23413, 0);
                    return 4;
                case 22:
                    interfaceC20295.mo8329(21, i, 4, m27753, C7573.f23418, 0);
                    return 4;
                case 23:
                    interfaceC20295.mo8329(21, i, 4, m27753, C7573.f23420, 0);
                    return 4;
                case 24:
                    interfaceC20295.mo8329(21, i, 4, m27753, C7573.f23411, 0);
                    return 4;
                case 25:
                    interfaceC20295.mo8329(21, i, 4, m27753, C7573.f23412, 0);
                    return 4;
                default:
                    switch (m27755) {
                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            interfaceC20295.mo8329(54, i, 4, m27753, C7573.f23413, 0);
                            return 4;
                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            interfaceC20295.mo8329(54, i, 4, m27753, C7573.f23418, 0);
                            return 4;
                        case 56:
                            interfaceC20295.mo8329(54, i, 4, m27753, C7573.f23420, 0);
                            return 4;
                        case 57:
                            interfaceC20295.mo8329(54, i, 4, m27753, C7573.f23411, 0);
                            return 4;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            interfaceC20295.mo8329(54, i, 4, m27753, C7573.f23412, 0);
                            return 4;
                        default:
                            interfaceC20295.mo8327(196, i);
                            return 1;
                    }
            }
        }
        interfaceC20295.mo8329(m27755, i, 4, m27753, C7573.f23422, 0);
        return 4;
    }
}
