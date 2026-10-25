package l;

import com.alipay.sdk.m.y.q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.IndicatorViewController;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.framework.UMModuleRegister;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.pqc.crypto.picnic.PicnicEngine;

/* compiled from: 97YD */
/* renamed from: l.ۚۘۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5099 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f15994;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f15995;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int[] f15996;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f15997;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f15998;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f15999;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int[] f15991 = {96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 0, 8, 48, 0, 9, 192, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, DHParameters.DEFAULT_MINIMUM_LENGTH, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, BERTags.FLAGS, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 144, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 0, 8, 56, 0, 9, 208, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_isHidden, 0, 8, 40, 0, 9, PicnicEngine.MAX_AUX_BYTES, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 240, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 200, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 168, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 232, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 152, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, 9, 216, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 184, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 248, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 196, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 164, 0, 8, 2, 0, 8, 130, 0, 8, 66, 0, 9, 228, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 148, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 212, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 0, 8, 42, 0, 9, 180, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 244, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 204, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_attachUserService, 0, 8, 38, 0, 9, 172, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 236, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 156, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 220, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_JSON_FAILED, 0, 8, 46, 0, 9, 188, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 252, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 0, 8, 49, 0, 9, 194, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 162, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 226, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 146, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 0, 8, 57, 0, 9, 210, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 0, 8, 41, 0, 9, 178, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 242, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 0, 8, 53, 0, 9, 202, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 170, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 234, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, EnumC17734.f54268, 84, 7, 83, 0, 8, q.h, 0, 8, 61, 0, 9, 218, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 186, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 250, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 198, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 166, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 230, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 150, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 214, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 0, 8, 43, 0, 9, 182, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 246, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 206, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 0, 8, 39, 0, 9, 174, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 238, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 158, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 222, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_CREATE_FAILED, 0, 8, 47, 0, 9, 190, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, Scalar25519.TARGET_LENGTH, 96, 7, 256, 0, 8, 80, 0, 8, 16, 84, 8, 115, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_DEFLATE_FAILED, 0, 8, 48, 0, 9, 193, 80, 7, 10, 0, 8, 96, 0, 8, 32, 0, 9, 161, 0, 8, 0, 0, 8, 128, 0, 8, 64, 0, 9, HideBottomViewOnScrollBehavior.DEFAULT_ENTER_ANIMATION_DURATION_MS, 80, 7, 6, 0, 8, 88, 0, 8, 24, 0, 9, 145, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 0, 8, 56, 0, 9, 209, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_isHidden, 0, 8, 40, 0, 9, 177, 0, 8, 8, 0, 8, 136, 0, 8, 72, 0, 9, 241, 80, 7, 4, 0, 8, 84, 0, 8, 20, 85, 8, 227, 83, 7, 43, 0, 8, 116, 0, 8, 52, 0, 9, 201, 81, 7, 13, 0, 8, 100, 0, 8, 36, 0, 9, 169, 0, 8, 4, 0, 8, 132, 0, 8, 68, 0, 9, 233, 80, 7, 8, 0, 8, 92, 0, 8, 28, 0, 9, 153, 84, 7, 83, 0, 8, 124, 0, 8, 60, 0, 9, IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION, 82, 7, 23, 0, 8, 108, 0, 8, 44, 0, 9, 185, 0, 8, 12, 0, 8, 140, 0, 8, 76, 0, 9, 249, 80, 7, 3, 0, 8, 82, 0, 8, 18, 85, 8, 163, 83, 7, 35, 0, 8, 114, 0, 8, 50, 0, 9, 197, 81, 7, 11, 0, 8, 98, 0, 8, 34, 0, 9, 165, 0, 8, 2, 0, 
    8, 130, 0, 8, 66, 0, 9, 229, 80, 7, 7, 0, 8, 90, 0, 8, 26, 0, 9, 149, 84, 7, 67, 0, 8, 122, 0, 8, 58, 0, 9, 213, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_getFlagsForUid, 0, 8, 42, 0, 9, 181, 0, 8, 10, 0, 8, 138, 0, 8, 74, 0, 9, 245, 80, 7, 5, 0, 8, 86, 0, 8, 22, 192, 8, 0, 83, 7, 51, 0, 8, 118, 0, 8, 54, 0, 9, 205, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_attachUserService, 0, 8, 38, 0, 9, 173, 0, 8, 6, 0, 8, 134, 0, 8, 70, 0, 9, 237, 80, 7, 9, 0, 8, 94, 0, 8, 30, 0, 9, 157, 84, 7, 99, 0, 8, 126, 0, 8, 62, 0, 9, 221, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_JSON_FAILED, 0, 8, 46, 0, 9, 189, 0, 8, 14, 0, 8, 142, 0, 8, 78, 0, 9, 253, 96, 7, 256, 0, 8, 81, 0, 8, 17, 85, 8, 131, 82, 7, 31, 0, 8, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 0, 8, 49, 0, 9, 195, 80, 7, 10, 0, 8, 97, 0, 8, 33, 0, 9, 163, 0, 8, 1, 0, 8, 129, 0, 8, 65, 0, 9, 227, 80, 7, 6, 0, 8, 89, 0, 8, 25, 0, 9, 147, 83, 7, 59, 0, 8, UMErrorCode.E_UM_BE_EMPTY_URL_PATH, 0, 8, 57, 0, 9, Primes.SMALL_FACTOR_LIMIT, 81, 7, 17, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 0, 8, 41, 0, 9, 179, 0, 8, 9, 0, 8, 137, 0, 8, 73, 0, 9, 243, 80, 7, 4, 0, 8, 85, 0, 8, 21, 80, 8, 258, 83, 7, 43, 0, 8, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 0, 8, 53, 0, 9, 203, 81, 7, 13, 0, 8, 101, 0, 8, 37, 0, 9, 171, 0, 8, 5, 0, 8, 133, 0, 8, 69, 0, 9, 235, 80, 7, 8, 0, 8, 93, 0, 8, 29, 0, 9, 155, 84, 7, 83, 0, 8, q.h, 0, 8, 61, 0, 9, 219, 82, 7, 23, 0, 8, 109, 0, 8, 45, 0, 9, 187, 0, 8, 13, 0, 8, 141, 0, 8, 77, 0, 9, 251, 80, 7, 3, 0, 8, 83, 0, 8, 19, 85, 8, 195, 83, 7, 35, 0, 8, 115, 0, 8, 51, 0, 9, 199, 81, 7, 11, 0, 8, 99, 0, 8, 35, 0, 9, 167, 0, 8, 3, 0, 8, 131, 0, 8, 67, 0, 9, 231, 80, 7, 7, 0, 8, 91, 0, 8, 27, 0, 9, 151, 84, 7, 67, 0, 8, 123, 0, 8, 59, 0, 9, 215, 82, 7, 19, 0, 8, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 0, 8, 43, 0, 9, 183, 0, 8, 11, 0, 8, 139, 0, 8, 75, 0, 9, 247, 80, 7, 5, 0, 8, 87, 0, 8, 23, 192, 8, 0, 83, 7, 51, 0, 8, 119, 0, 8, 55, 0, 9, 207, 81, 7, 15, 0, 8, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 0, 8, 39, 0, 9, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 0, 8, 7, 0, 8, 135, 0, 8, 71, 0, 9, 239, 80, 7, 9, 0, 8, 95, 0, 8, 31, 0, 9, 159, 84, 7, 99, 0, 8, 127, 0, 8, 63, 0, 9, 223, 82, 7, 27, 0, 8, UMErrorCode.E_UM_BE_CREATE_FAILED, 0, 8, 47, 0, 9, 191, 0, 8, 15, 0, 8, 143, 0, 8, 79, 0, 9, 255};

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f15989 = {80, 5, 1, 87, 5, 257, 83, 5, 17, 91, 5, o.a.a, 81, 5, 5, 89, 5, 1025, 85, 5, 65, 93, 5, 16385, 80, 5, 3, 88, 5, 513, 84, 5, 33, 92, 5, o.a.q, 82, 5, 9, 90, 5, i.a, 86, 5, 129, 192, 5, UMModuleRegister.SHARE_EVENT_VALUE_LOW, 80, 5, 2, 87, 5, 385, 83, 5, 25, 91, 5, 6145, 81, 5, 7, 89, 5, 1537, 85, 5, 97, 93, 5, UMModuleRegister.SHARE_EVENT_VALUE_LOW, 80, 5, 4, 88, 5, 769, 84, 5, 49, 92, 5, 12289, 82, 5, 13, 90, 5, 3073, 86, 5, 193, 192, 5, UMModuleRegister.SHARE_EVENT_VALUE_LOW};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f15992 = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int[] f15990 = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED, UMErrorCode.E_UM_BE_DEFLATE_FAILED};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int[] f15988 = {1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, i.a, 3073, o.a.a, 6145, o.a.q, 12289, 16385, UMModuleRegister.SHARE_EVENT_VALUE_LOW};

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f15993 = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13};

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b6, code lost:
    
        if ((((1 << r1) - 1) & r2) == r21.f15996[r6]) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b8, code lost:
    
        r6 = r6 - 1;
        r1 = r1 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0154, code lost:
    
        r8 = r32[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0156, code lost:
    
        if (r8 >= r2) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x015a, code lost:
    
        if (r8 >= 256) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x015c, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0160, code lost:
    
        r9[0] = (byte) r8;
        r8 = r10 + 1;
        r9[2] = r32[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x017f, code lost:
    
        r10 = r8;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x015e, code lost:
    
        r8 = 96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x016c, code lost:
    
        r9[0] = (byte) (r27[r8 - r2] + 80);
        r8 = r10 + 1;
        r9[2] = r26[r32[r10] - r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c7, code lost:
    
        r7 = r7 + 1;
        r2 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        r20 = r9;
        r19 = r13;
        r9 = r21.f15997;
        r13 = r7 - r1;
        r9[1] = (byte) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014b, code lost:
    
        if (r10 < r5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        r9[0] = 192;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0181, code lost:
    
        r9 = r8 << r13;
        r8 = r4 >>> r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0185, code lost:
    
        if (r8 >= r14) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0187, code lost:
    
        java.lang.System.arraycopy(r21.f15997, 0, r30, (r12 + r8) * 3, 3);
        r8 = r8 + r9;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019b, code lost:
    
        r2 = 1 << (r7 - 1);
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a6, code lost:
    
        if ((r8 & r2) == 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a8, code lost:
    
        r8 = r8 ^ r2;
        r2 = r2 >>> 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ac, code lost:
    
        r2 = r2 ^ r8;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m14646(int[] r22, int r23, int r24, int r25, int[] r26, int[] r27, int[] r28, int[] r29, int[] r30, int[] r31, int[] r32) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5099.m14646(int[], int, int, int, int[], int[], int[], int[], int[], int[], int[]):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14649(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, C14976 c14976) {
        m14647(19);
        int[] iArr5 = this.f15995;
        iArr5[0] = 0;
        int m14646 = m14646(iArr, 0, 19, 19, null, null, iArr3, iArr2, iArr4, iArr5, this.f15998);
        if (m14646 == -3) {
            c14976.f64357 = "oversubscribed dynamic bit lengths tree";
            return m14646;
        }
        if (m14646 != -5 && iArr2[0] != 0) {
            return m14646;
        }
        c14976.f64357 = "incomplete dynamic bit lengths tree";
        return -3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14648(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, C14976 c14976) {
        m14647(288);
        int[] iArr7 = this.f15995;
        iArr7[0] = 0;
        int m14646 = m14646(iArr, 0, i, 257, f15992, f15990, iArr4, iArr2, iArr6, iArr7, this.f15998);
        if (m14646 != 0 || iArr2[0] == 0) {
            if (m14646 == -3) {
                c14976.f64357 = "oversubscribed literal/length tree";
                return m14646;
            }
            if (m14646 == -4) {
                return m14646;
            }
            c14976.f64357 = "incomplete literal/length tree";
            return -3;
        }
        m14647(288);
        int m146462 = m14646(iArr, i, i2, 0, f15988, f15993, iArr5, iArr3, iArr6, this.f15995, this.f15998);
        if (m146462 == 0 && (iArr3[0] != 0 || i <= 257)) {
            return 0;
        }
        if (m146462 == -3) {
            c14976.f64357 = "oversubscribed distance tree";
            return m146462;
        }
        if (m146462 == -5) {
            c14976.f64357 = "incomplete distance tree";
            return -3;
        }
        if (m146462 == -4) {
            return m146462;
        }
        c14976.f64357 = "empty distance tree with lengths";
        return -3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m14647(int i) {
        if (this.f15995 == null) {
            this.f15995 = new int[1];
            this.f15998 = new int[i];
            this.f15994 = new int[16];
            this.f15997 = new int[3];
            this.f15999 = new int[15];
            this.f15996 = new int[16];
        }
        if (this.f15998.length < i) {
            this.f15998 = new int[i];
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.f15998[i2] = 0;
        }
        for (int i3 = 0; i3 < 16; i3++) {
            this.f15994[i3] = 0;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            this.f15997[i4] = 0;
        }
        System.arraycopy(this.f15994, 0, this.f15999, 0, 15);
        System.arraycopy(this.f15994, 0, this.f15996, 0, 16);
    }
}
