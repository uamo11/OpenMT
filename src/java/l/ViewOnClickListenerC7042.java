package l;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextPaint;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* compiled from: 12B7 */
/* renamed from: l.ۜ᩸᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC7042 extends AbstractActivityC3346 implements View.OnClickListener {

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f21691;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f21692 = 0;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f21693;

    /* renamed from: ᩶ᩳ֨, reason: not valid java name and contains not printable characters */
    private static final short[] f21694 = {4519, -15672, -6920, -15671, -6920, 32121, 32012, -16887, 611, -6674, -1004, 4479, 8632, -30950, -32752, -31510, -1121, 9313, 14244, 12263, 9853, -8334, -11682, 12011, 4855, -30332, -28688, -28488, 27132, -31806, 26872, 5187, 5213, 5755, 26889, 25605, 28075, 28400, 18388, 29326, -31767, -30393, 27804, 20377, 17028, 25368, 25417, -25157, -32088, -32144, 27414, -26712, 16885, 29738, -32433, 32662, -32682, 22014, 20242, 24582, 16982, -31086, 31305, -32027, 27993, 17554, 19252, 32584, 26352, 30395, -31278, 26911, -27223, 26746, 30932, -25199, 7558, -20953, -16612, 18119, -24450, -16690, -17812, -14244, -14245, -14267, -14272, -14271, -14230, -14248, -14256, -14271, -14243, -14246, -14255, 7518, 9763, -4591, 15731, 15128, -14636, -12433, 13464, 9743, -6176, -16141, -8177, 13550, 16338, 12484, 14026, -12345, 14397, -12665, 15560, -2515, -15414, -10012, -5364, 11132, 10082, 16381, 11550, 9512, -14737, -15249, 9868, -4780, 14578, 13306, 8819, -8000, -18224, -18223, -18218, -18217, -18220, -18219, -18214, -18213, -18269, -18272, -18271, -18266, -18265, -18268, -18267, -18262, -18264, -18263, -18258, -18257, -18260, -18254, -18253, -18256, -18255, -18250, -18249, -18252, -18251, -18246, -18245, -18248, -18301, -18304, -18303, -18298, -18297, -18300, -18299, -18294, -18296, -18295, -18290, -18289, -18292, -18286, -18285, -18288, -18287, -18282, -18281, -18284, -18283, -18278, -18277, -18280, -15182, -11698, -5080, -18200, 14299, -14211, 8927, -18288, -18297, -18300, -18297, -18288, -18288, -18301, -18290, -18271, -18291, -18298, -18297, 4435, -21719, -21698, -21699, -21698, -21719, -21719, -21702, -21705, -21736, -21708, -21697, -21698, 9542, 25874, 25901, 25912, 25907, 25867, 25908, 25901, 25884, 25918, 25897, 25908, 25899, 25908, 25897, 25892, 4615, 20464, 23609, -18529, -8228, -8267, -8268, -8269, -8270, -8271, -8272, -8257, -8258, -8250, -8278, -8241, -8243, -8278, -8247, -8233, -8278, -8227, -8230, -8196, -8266, -8267, -8198, 16898, -30272, -23316, -8307, -22696, 18488, -21905, -17240, -20385, 16854, 20246, -23642, -17487, -32767, -24312, 21480, 18393, -16579, -30565, -8254, -8203, -8203, -8216, -8203, -8282, -24241, -21780, 21475, 5591, -10034, 6419, 2484, 3707, -7316, 3772, -6583, 1550, -4520, -7331, -2274, -14550};

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C17625 f21695;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f21696;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f21697;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public boolean f21698;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C8817 f21699;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public TextView f21700;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f21701;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        short[] sArr = null;
        char c = 0;
        short s = 0;
        int i = 0;
        int i2 = 0;
        short s2 = 0;
        int i3 = 0;
        int i4 = 0;
        short[] sArr2 = null;
        int i5 = 0;
        int i6 = -362181309;
        int i7 = C3019.f9544;
        int i8 = C3537.f11231;
        int m2566 = C0630.m2566("ۘۧ") ^ i7;
        int i9 = ((m2566 ^ i8) * (-15415)) ^ 263291248;
        int i10 = 1178603357;
        while (true) {
            i6 = ((((i6 ^ i8) * 21657) >> 31) & i9) ^ (m2566 ^ i10);
            switch (i6) {
                case -2065318559:
                case 525914068:
                    if (C1005.f3721) {
                        m2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    } else {
                        m2566 = (C0630.m2566("ۡܰ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((m2566 ^ i7) * 3925) ^ 1126924958;
                        i10 = -1454884471;
                    }
                case -2016011081:
                case 136891914:
                    i3 = s * s2;
                    if (C11340.f33930 >= 0) {
                        m2566 = (C0630.m2566("ۡܰ") + i8) * IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                        i9 = ((m2566 ^ i7) * 3925) ^ 1126924958;
                        i10 = -1454884471;
                    } else {
                        m2566 = C2105.m6981("᩸᩹") ^ i7;
                        i9 = ((m2566 ^ i8) * 11243) ^ 512031134;
                        i10 = -2006641646;
                    }
                case -1634553788:
                case -977304019:
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        m2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    } else {
                        m2566 = C2105.m6981("᩹ܶ") ^ i7;
                        i9 = ((m2566 ^ i8) * 31515) ^ (-799796335);
                        i10 = -395845549;
                    }
                case -1546409516:
                case 1707594467:
                    if ((i3 + 1) - i2 <= 0) {
                        m2566 = (C0630.m2566("۫ܿ") ^ i8) * 101;
                        i9 = ((m2566 ^ i7) * (-11291)) ^ (-278340439);
                        i10 = -1010147097;
                    } else {
                        m2566 = C0630.m2566("᩻ᩳ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-24439)) ^ (-2043631583);
                        i10 = -1405387337;
                    }
                case -1505447693:
                case -614388536:
                    return C3683.m11225(sArr2, i5, 15, i4);
                case -1408742808:
                case 2139934291:
                    if (C1773.f6144 <= 0) {
                        m2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    } else {
                        m2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((m2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    }
                case -1317754481:
                case 2097280850:
                    C1128.m3851();
                    return null;
                case -1305288780:
                case 1761176057:
                    C4159.m12565();
                    if (C1916.f6442) {
                        m2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((m2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    } else {
                        m2566 = (C0630.m2566("۟ܽ") + i7) * 127;
                        i9 = ((m2566 ^ i8) * 14365) ^ 1413934989;
                        i10 = 1735724467;
                    }
                case -1276985599:
                case -392352543:
                    if (C2520.f8000 >= 0) {
                        m2566 = C0630.m2566("ܿۢ") ^ i8;
                        i9 = ((m2566 ^ i7) * (-14777)) ^ (-386462446);
                        i10 = 1624064582;
                    } else {
                        m2566 = C2105.m6981("۠᩹") ^ i8;
                        i9 = ((m2566 ^ i7) * 14655) ^ 1653530612;
                        i10 = 335963646;
                    }
                case -1122625946:
                case 2105915857:
                    i4 = 25949;
                    m2566 = C2105.m6981("֫ۨ") ^ i7;
                    i9 = ((m2566 ^ i8) * 17329) ^ 908620091;
                    i10 = 442734239;
                case -997326351:
                case 507314970:
                    i2 = i * i;
                    s2 = 2;
                    if (C11340.m28031()) {
                        m2566 = C0630.m2566("֡֡") ^ i7;
                        i9 = ((m2566 ^ i8) * 41) ^ 270607127;
                        i10 = 1786192231;
                    } else {
                        m2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((m2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    }
                case -758362621:
                case 46819995:
                    s = sArr[c];
                    if (C2958.f9394 >= 0) {
                        m2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((m2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        m2566 = (C0630.m2566("ۧ۠") + i7) * (-97);
                        i9 = ((m2566 ^ i8) * 32235) ^ 1898027941;
                        i10 = -1381143368;
                    }
                case -138237454:
                case 603212350:
                    sArr2 = f21694;
                    i5 = 221;
                    if (C7106.m19120() <= 0) {
                        m2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((m2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        m2566 = (i7 - C0630.m2566("᩶ۤ")) * (-9);
                        i9 = ((m2566 ^ i8) * 15703) ^ (-1025885497);
                        i10 = 2114852838;
                    }
                case -55505722:
                case 373714518:
                    if (C0050.f910 >= 0) {
                        m2566 = (C0630.m2566("۟ܽ") + i7) * 127;
                        i9 = ((m2566 ^ i8) * 14365) ^ 1413934989;
                        i10 = 1735724467;
                    } else {
                        m2566 = (i7 - C2105.m6981("ۘ᩻")) * (-29);
                        i9 = ((m2566 ^ i8) * 9363) ^ 1994380439;
                        i10 = -1490233530;
                    }
                case 96817790:
                case 2130300978:
                    c = 220;
                    if (RunnableC1937.m6387() != 0) {
                        m2566 = C0630.m2566("᩻ܽ") ^ i7;
                        i9 = ((m2566 ^ i8) * 5885) ^ (-607141088);
                        i10 = -1657434411;
                    } else {
                        m2566 = (C0630.m2566("ۘۢ") + i8) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i9 = ((m2566 ^ i7) * 4147) ^ 910585500;
                        i10 = 2055208479;
                    }
                case 1165706358:
                case 2105622181:
                    i4 = 17399;
                    m2566 = C2105.m6981("֫ۨ") ^ i7;
                    i9 = ((m2566 ^ i8) * 17329) ^ 908620091;
                    i10 = 442734239;
                case 1490706799:
                case 1981734613:
                    i = s + 1;
                    if (C11340.f33930 >= 0) {
                        m2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((m2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        m2566 = C2105.m6981("᩻ۘ") ^ i8;
                        i9 = ((m2566 ^ i7) * 18665) ^ 1476587188;
                        i10 = -813222675;
                    }
                case 1644266271:
                case 1888959239:
                    C3663.m11168();
                    m2566 = C0630.m2566("ܿۢ") ^ i8;
                    i9 = ((m2566 ^ i7) * (-14777)) ^ (-386462446);
                    i10 = 1624064582;
                default:
                    sArr = f21694;
                    if (C2126.m7040()) {
                        m2566 = (i8 - C0630.m2566("ۗۛ")) * (-7);
                        i9 = ((m2566 ^ i7) * (-6563)) ^ (-1608939357);
                        i10 = 722456527;
                    } else {
                        m2566 = C0630.m2566("ۗᩴ") ^ i8;
                        i9 = ((m2566 ^ i7) * 30925) ^ 2028270795;
                        i10 = 755560177;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (l.C0630.f2410 <= 0) goto L19;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19011(l.AbstractActivityC3346 r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.m19011(l.ۗܺ᩷, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0075, code lost:
    
        if (l.RunnableC3474.f10992 <= 0) goto L15;
     */
    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.onSaveInstanceState(android.os.Bundle):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public void m19021() {
        int m6981;
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources;
        int i5;
        short[] sArr;
        int i6;
        short[] sArr2;
        int i7;
        View view;
        TextView textView;
        String str;
        int m69812;
        int i8;
        int m2566;
        int i9;
        int i10;
        int i11;
        short[] sArr3;
        int i12;
        View view2;
        int i13;
        int m69813;
        int i14;
        int i15;
        String m10562;
        View view3;
        int i16;
        Resources m14338;
        int m69814;
        int i17;
        int i18;
        int m25662;
        int i19;
        boolean z;
        ViewOnClickListenerC7042 viewOnClickListenerC7042 = this;
        TextView textView2 = null;
        String str2 = null;
        View view4 = null;
        int i20 = 0;
        C17625 c17625 = null;
        String str3 = null;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        short s = 0;
        short s2 = 0;
        int i24 = -57951308;
        int i25 = C3911.f12484;
        int i26 = C1047.f3863;
        int m25663 = C0630.m2566("۟۫") ^ i25;
        int i27 = ((m25663 ^ i26) * 27439) ^ 313620870;
        int i28 = m25663 ^ 2013093083;
        TextView textView3 = null;
        Resources resources2 = null;
        Long l2 = null;
        Button button = null;
        short[] sArr4 = null;
        short[] sArr5 = null;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        boolean z2 = false;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        Object[] objArr = null;
        View view5 = null;
        View view6 = null;
        String str4 = null;
        View view7 = null;
        View view8 = null;
        long j = 0;
        int i38 = 0;
        while (true) {
            i24 = i28 ^ (i27 & (((i24 ^ i26) * (-21781)) >> 31));
            switch (i24) {
                case -2146905951:
                case -737948908:
                    i3 = i29;
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr = sArr4;
                    i6 = i35;
                    sArr2 = sArr5;
                    i7 = i36;
                    view = view6;
                    String str5 = str4;
                    textView = textView3;
                    str = str5;
                    if (((s * s) + 18593344) - (s * s2) < 0) {
                        m69812 = (C2105.m6981("ۗۙ") + i25) * (-99);
                        i27 = ((m69812 ^ i26) * (-16037)) ^ (-1785544415);
                        i8 = 1011123234;
                    } else {
                        m69812 = C0630.m2566("۫᩷") ^ i25;
                        i27 = ((m69812 ^ i26) * 17265) ^ 1859438698;
                        i8 = -1414328852;
                    }
                    i28 = m69812 ^ i8;
                    viewOnClickListenerC7042 = this;
                    i35 = i6;
                    view6 = view;
                    i36 = i7;
                    sArr5 = sArr2;
                    i29 = i3;
                    sArr4 = sArr;
                    resources2 = resources;
                    i33 = i5;
                    i30 = i4;
                    TextView textView4 = textView;
                    str4 = str;
                    textView3 = textView4;
                case -2099943830:
                case -1985134281:
                    i4 = i30;
                    i29 = 0;
                    m25662 = (i25 - C2105.m6981("᩺ۙ")) * (-69);
                    i17 = ((m25662 ^ i26) * (-26641)) ^ 1571829757;
                    i19 = -856971478;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -2032791558:
                case 1059378662:
                    i4 = i30;
                    resources = resources2;
                    i13 = i33;
                    view = view6;
                    m10562 = ServiceConnectionC3453.m10562(C2105.m6981(C4117.m12355(f21694, 46, 3, i32)) ^ 2127017537);
                    str2 = m10562;
                    m69813 = C0630.m2566("ۙ᩷") ^ i26;
                    i14 = ((m69813 ^ i25) * 16111) ^ (-1189111328);
                    i15 = 445090378;
                    i28 = m69813 ^ i15;
                    i27 = i14;
                    i33 = i13;
                    view6 = view;
                    resources2 = resources;
                    i30 = i4;
                case -1986583463:
                case -77473250:
                    i3 = i29;
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr = sArr4;
                    i6 = i35;
                    sArr2 = sArr5;
                    i7 = i36;
                    view = view6;
                    String str6 = str4;
                    textView = textView3;
                    str = str6;
                    i32 = 28792;
                    m69812 = C2105.m6981("᩸۫") ^ i26;
                    i27 = ((m69812 ^ i25) * 1285) ^ (-422148924);
                    i8 = -426411462;
                    i28 = m69812 ^ i8;
                    viewOnClickListenerC7042 = this;
                    i35 = i6;
                    view6 = view;
                    i36 = i7;
                    sArr5 = sArr2;
                    i29 = i3;
                    sArr4 = sArr;
                    resources2 = resources;
                    i33 = i5;
                    i30 = i4;
                    TextView textView42 = textView;
                    str4 = str;
                    textView3 = textView42;
                case -1883656265:
                case 745845853:
                    if (z2) {
                        m6981 = (i26 - C0630.m2566("ۛᩳ")) * (-77);
                        i = ((m6981 ^ i25) * (-22837)) ^ 573176502;
                        i2 = -1644944983;
                    } else {
                        m6981 = (C0630.m2566("ۨۗ") + i25) * 77;
                        i = ((m6981 ^ i26) * 16377) ^ 1475881617;
                        i2 = -618407029;
                    }
                    i28 = m6981 ^ i2;
                    i27 = i;
                case -1869230373:
                case -1792607122:
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr2 = sArr5;
                    i7 = i36;
                    view = view6;
                    String str7 = str4;
                    textView = textView3;
                    str = str7;
                    i3 = i29;
                    short[] sArr6 = sArr4;
                    i6 = i35;
                    i21 = C2105.m6981(C22628.m50602(sArr6, i6, 3, i32));
                    if (RunnableC0588.f2309 >= 0) {
                        sArr = sArr6;
                        m69812 = C0630.m2566("ܶۧ") ^ i26;
                        i27 = ((m69812 ^ i25) * 29657) ^ (-1935966285);
                        i8 = -1976982222;
                        i28 = m69812 ^ i8;
                        viewOnClickListenerC7042 = this;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView422 = textView;
                        str4 = str;
                        textView3 = textView422;
                    } else {
                        m2566 = C0630.m2566("ܰ᩻") ^ i26;
                        sArr = sArr6;
                        i9 = ((m2566 ^ i25) * 8733) ^ 1790687560;
                        i10 = 302480218;
                        i28 = m2566 ^ i10;
                        i27 = i9;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView4222 = textView;
                        str4 = str;
                        textView3 = textView4222;
                    }
                case -1860263646:
                case 1898515156:
                    i3 = i29;
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr = sArr4;
                    i6 = i35;
                    sArr2 = sArr5;
                    i7 = i36;
                    view = view6;
                    String str8 = str4;
                    textView = textView3;
                    str = str8;
                    s = f21694[33];
                    s2 = 8624;
                    if (C0382.f1805) {
                        m69812 = (i26 - C2105.m6981("᩺ܽ")) * 81;
                        i27 = ((m69812 ^ i25) * 5441) ^ 474044582;
                        i8 = 1106995687;
                        i28 = m69812 ^ i8;
                        viewOnClickListenerC7042 = this;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView42222 = textView;
                        str4 = str;
                        textView3 = textView42222;
                    } else {
                        i36 = i7;
                        sArr5 = sArr2;
                        int m69815 = C2105.m6981("᩸֫") ^ i25;
                        i27 = ((m69815 ^ i26) * 1047) ^ 793078888;
                        i28 = m69815 ^ 1704353179;
                        viewOnClickListenerC7042 = this;
                        i35 = i6;
                        i33 = i5;
                        view6 = view;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i30 = i4;
                        TextView textView422222 = textView;
                        str4 = str;
                        textView3 = textView422222;
                    }
                case -1845587723:
                case -760414565:
                    i4 = i30;
                    i29 = 8;
                    m25662 = (i25 - C2105.m6981("᩺ۙ")) * (-69);
                    i17 = ((m25662 ^ i26) * (-26641)) ^ 1571829757;
                    i19 = -856971478;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1814410224:
                case -449822252:
                    i4 = i30;
                    z = c17625.f53846;
                    if (z) {
                        i31 = i34;
                        m25662 = (i25 - C2105.m6981("ܺ᩺")) * (-57);
                        i17 = ((m25662 ^ i26) * 19901) ^ (-788488632);
                        i19 = 1877122727;
                        i28 = m25662 ^ i19;
                        i27 = i17;
                        i30 = i4;
                    }
                    m25662 = C2105.m6981("ۛۘ") ^ i26;
                    i17 = ((m25662 ^ i25) * 5959) ^ 211977356;
                    i19 = -453918907;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1762927683:
                case 1089376276:
                    if (C4159.f13567) {
                        i3 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr = sArr4;
                        i6 = i35;
                        sArr2 = sArr5;
                        i7 = i36;
                        view = view6;
                        String str9 = str4;
                        textView = textView3;
                        str = str9;
                        m2566 = C0630.m2566("ۖܶ") ^ i25;
                        i9 = ((m2566 ^ i26) * (-12741)) ^ (-1560399347);
                        i10 = -961673558;
                        i28 = m2566 ^ i10;
                        i27 = i9;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView4222222 = textView;
                        str4 = str;
                        textView3 = textView4222222;
                    } else {
                        m6981 = C2105.m6981("ۗ᩸") ^ i25;
                        i = ((m6981 ^ i26) * 889) ^ 1253543393;
                        i2 = 1247157115;
                        i28 = m6981 ^ i2;
                        i27 = i;
                    }
                case -1744871011:
                case 480963683:
                    i4 = i30;
                    C1047.m3601(textView2, str2);
                    view4 = C0964.m3409(viewOnClickListenerC7042, C0630.m2566(C7811.m20837(f21694, 52, 3, i32)) ^ 2120897410);
                    if (z2) {
                        m25662 = (i26 - C2105.m6981("ۙܽ")) * (-13);
                        i17 = ((m25662 ^ i25) * (-12181)) ^ (-2045599158);
                        i19 = -146408991;
                    } else {
                        m25662 = C0630.m2566("ۤᩳ") ^ i25;
                        i17 = ((m25662 ^ i26) * 6369) ^ (-914145816);
                        i19 = -1009665136;
                    }
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1708201611:
                case 880051335:
                    if (C1711.f5919) {
                        i11 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr3 = sArr5;
                        i12 = i36;
                        view2 = view6;
                        int m69816 = (i26 - C2105.m6981("ۘᩳ")) * (-27);
                        i28 = m69816 ^ (-2103753733);
                        i27 = ((m69816 ^ i25) * (-12835)) ^ 749047566;
                        view6 = view2;
                        i36 = i12;
                        sArr5 = sArr3;
                        i29 = i11;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    } else {
                        m6981 = (C2105.m6981("ᩴ᩶") + i26) * (-37);
                        i = ((m6981 ^ i25) * (-23249)) ^ 1838827050;
                        i2 = -1703119617;
                        i28 = m6981 ^ i2;
                        i27 = i;
                    }
                case -1705313389:
                case 354031940:
                    i4 = i30;
                    C2105.m6978(button, C2105.m6981(C3019.m9250(f21694, 73, 3, i32)) ^ 2125233322);
                    m25662 = C2105.m6981("᩻᩶") ^ i25;
                    i17 = ((m25662 ^ i26) * 14275) ^ 396089695;
                    i19 = -896213741;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1688152806:
                case 666314430:
                    i4 = i30;
                    i20 = 8;
                    m25662 = C2105.m6981("᩺᩶") ^ i25;
                    i17 = ((m25662 ^ i26) * 13623) ^ 340209856;
                    i19 = -1424265159;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1622670417:
                case 1810777120:
                    i3 = i29;
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr = sArr4;
                    i6 = i35;
                    sArr2 = sArr5;
                    i7 = i36;
                    view = view6;
                    String str10 = str4;
                    textView = textView3;
                    str = str10;
                    z2 = C23196.m51456();
                    str3 = C0483.m2128(f21694, 34, 3, i32);
                    if (C0964.f3626 == 0) {
                        m69812 = C2105.m6981("ۚܽ") ^ i25;
                        i27 = ((m69812 ^ i26) * (-12011)) ^ 977146775;
                        i8 = 1411505670;
                        i28 = m69812 ^ i8;
                        viewOnClickListenerC7042 = this;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView42222222 = textView;
                        str4 = str;
                        textView3 = textView42222222;
                    }
                    m69812 = C0630.m2566("ܶۧ") ^ i26;
                    i27 = ((m69812 ^ i25) * 29657) ^ (-1935966285);
                    i8 = -1976982222;
                    i28 = m69812 ^ i8;
                    viewOnClickListenerC7042 = this;
                    i35 = i6;
                    view6 = view;
                    i36 = i7;
                    sArr5 = sArr2;
                    i29 = i3;
                    sArr4 = sArr;
                    resources2 = resources;
                    i33 = i5;
                    i30 = i4;
                    TextView textView422222222 = textView;
                    str4 = str;
                    textView3 = textView422222222;
                case -1619032200:
                case 375863307:
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr3 = sArr5;
                    i12 = i36;
                    view2 = view6;
                    textView3 = (TextView) C4263.m12813(viewOnClickListenerC7042, i21 ^ 2127116202);
                    str4 = C23196.m51461();
                    if (RunnableC0588.f2309 >= 0) {
                        i11 = i29;
                        int m698162 = (i26 - C2105.m6981("ۘᩳ")) * (-27);
                        i28 = m698162 ^ (-2103753733);
                        i27 = ((m698162 ^ i25) * (-12835)) ^ 749047566;
                        view6 = view2;
                        i36 = i12;
                        sArr5 = sArr3;
                        i29 = i11;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    } else {
                        int m69817 = (C2105.m6981("֨ۗ") ^ i25) * (-13);
                        i28 = m69817 ^ 1159087155;
                        i27 = ((m69817 ^ i26) * 16393) ^ (-374726771);
                        view6 = view2;
                        i36 = i12;
                        sArr5 = sArr3;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    }
                case -1538240667:
                case -1524965514:
                    i4 = i30;
                    if (C1711.m5729()) {
                        m25662 = (C2105.m6981("ܶܶ") + i26) * 53;
                        i17 = ((m25662 ^ i25) * 23027) ^ (-1793109393);
                        i19 = -799924242;
                    } else {
                        m25662 = (C2105.m6981("᩶۟") ^ i25) * 21;
                        i17 = ((m25662 ^ i26) * 12075) ^ (-525920971);
                        i19 = -2043484867;
                    }
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1526092793:
                case -1522862605:
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    short[] sArr7 = sArr5;
                    int i39 = i37;
                    View view9 = view6;
                    int i40 = i36;
                    TextView textView5 = (TextView) C0964.m3409(viewOnClickListenerC7042, C2105.m6981(C2167.m7159(sArr7, i40, i39, i32)) ^ 2101797075);
                    i34 = 0;
                    if (C23196.m51456()) {
                        int m25664 = (i25 - C0630.m2566("ܺۜ")) * (-93);
                        i27 = ((m25664 ^ i26) * 28925) ^ (-600591559);
                        i28 = m25664 ^ 90568597;
                        i36 = i40;
                        i37 = i39;
                        i33 = i5;
                        view6 = view9;
                        sArr5 = sArr7;
                        textView2 = textView5;
                        resources2 = resources;
                        i30 = i4;
                    } else {
                        int m69818 = (C2105.m6981("ᩳۛ") ^ i26) * 69;
                        i28 = m69818 ^ 1281956499;
                        i27 = ((m69818 ^ i25) * (-4603)) ^ 1258389468;
                        i37 = i39;
                        view6 = view9;
                        i36 = i40;
                        sArr5 = sArr7;
                        textView2 = textView5;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    }
                case -1486150152:
                case 391162870:
                    C4075.m12263();
                    if (C0630.f2410 <= 0) {
                        i3 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr = sArr4;
                        i6 = i35;
                        sArr2 = sArr5;
                        i7 = i36;
                        view = view6;
                        String str92 = str4;
                        textView = textView3;
                        str = str92;
                        m2566 = C0630.m2566("ۖܶ") ^ i25;
                        i9 = ((m2566 ^ i26) * (-12741)) ^ (-1560399347);
                        i10 = -961673558;
                        i28 = m2566 ^ i10;
                        i27 = i9;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView4222222222 = textView;
                        str4 = str;
                        textView3 = textView4222222222;
                    } else {
                        i4 = i30;
                        m14338 = resources2;
                        i16 = i33;
                        view3 = view6;
                        m69814 = C0630.m2566("᩻ۢ") ^ i26;
                        i17 = ((m69814 ^ i25) * (-8581)) ^ 1605163475;
                        i18 = -1638419861;
                        i28 = m69814 ^ i18;
                        i33 = i16;
                        view6 = view3;
                        resources2 = m14338;
                        i27 = i17;
                        i30 = i4;
                    }
                case -1447611457:
                case -980165797:
                    i30 = -14540254;
                    m6981 = (C2105.m6981("ۢۜ") ^ i26) * 85;
                    i = ((m6981 ^ i25) * 933) ^ 151276587;
                    i2 = 411938488;
                    i28 = m6981 ^ i2;
                    i27 = i;
                case -1397369873:
                case 1443630491:
                    C1504.m5179();
                    break;
                case -1295899728:
                case -1176090260:
                    i3 = i29;
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr = sArr4;
                    i6 = i35;
                    sArr2 = sArr5;
                    i7 = i36;
                    view = view6;
                    String str11 = str4;
                    textView = textView3;
                    str = str11;
                    view5 = C0964.m3409(viewOnClickListenerC7042, C0630.m2566(str3) ^ 2125806386);
                    if (C7106.f21815 == 0) {
                        m2566 = C0630.m2566("֡ۚ") ^ i26;
                        i9 = ((m2566 ^ i25) * 9305) ^ (-1868996244);
                        i10 = -2090202338;
                        i28 = m2566 ^ i10;
                        i27 = i9;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView42222222222 = textView;
                        str4 = str;
                        textView3 = textView42222222222;
                    }
                    m2566 = C0630.m2566("ۖܶ") ^ i25;
                    i9 = ((m2566 ^ i26) * (-12741)) ^ (-1560399347);
                    i10 = -961673558;
                    i28 = m2566 ^ i10;
                    i27 = i9;
                    i35 = i6;
                    view6 = view;
                    i36 = i7;
                    sArr5 = sArr2;
                    i29 = i3;
                    sArr4 = sArr;
                    resources2 = resources;
                    i33 = i5;
                    i30 = i4;
                    TextView textView422222222222 = textView;
                    str4 = str;
                    textView3 = textView422222222222;
                case -1284274946:
                case -1124957204:
                    i4 = i30;
                    C17625 c176252 = viewOnClickListenerC7042.f21695;
                    if (c176252 != null) {
                        int m69819 = (C2105.m6981("᩺֫") ^ i25) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                        i28 = m69819 ^ 1633466464;
                        c17625 = c176252;
                        i27 = ((m69819 ^ i26) * 443) ^ (-1044668501);
                        i30 = i4;
                    } else {
                        c17625 = c176252;
                        m25662 = C2105.m6981("ۛۘ") ^ i26;
                        i17 = ((m25662 ^ i25) * 5959) ^ 211977356;
                        i19 = -453918907;
                        i28 = m25662 ^ i19;
                        i27 = i17;
                        i30 = i4;
                    }
                case -1175171941:
                case 529318804:
                    i4 = i30;
                    C1128.m3853(view7, i38);
                    view8 = C0964.m3409(viewOnClickListenerC7042, C0630.m2566(C0630.m2575(f21694, 61, 3, i32)) ^ 2102501683);
                    if (!z2) {
                        m25662 = C0630.m2566("ۖ֫") ^ i25;
                        i17 = ((m25662 ^ i26) * 3375) ^ (-1562254635);
                        i19 = 1511095404;
                        i28 = m25662 ^ i19;
                        i27 = i17;
                        i30 = i4;
                    }
                    m25662 = C2105.m6981("ۛۘ") ^ i26;
                    i17 = ((m25662 ^ i25) * 5959) ^ 211977356;
                    i19 = -453918907;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1153112420:
                case 122766890:
                    C21923.m49329();
                    if (RunnableC1937.f6483 < 0) {
                        i4 = i30;
                        resources = resources2;
                        view = view6;
                        int m25665 = C0630.m2566("۬֫") ^ i25;
                        i28 = m25665 ^ (-1674251185);
                        i27 = ((m25665 ^ i26) * (-10159)) ^ (-1114687640);
                        view6 = view;
                        resources2 = resources;
                        i30 = i4;
                    } else {
                        m6981 = C2105.m6981("۬᩹") ^ i25;
                        i = ((m6981 ^ i26) * 14299) ^ 651763801;
                        i2 = -761834593;
                        i28 = m6981 ^ i2;
                        i27 = i;
                    }
                case -1096340006:
                case 1770611057:
                    i4 = i30;
                    i31 = 8;
                    m25662 = (i25 - C2105.m6981("ܺ᩺")) * (-57);
                    i17 = ((m25662 ^ i26) * 19901) ^ (-788488632);
                    i19 = 1877122727;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -1015615375:
                case 624061834:
                    i4 = i30;
                    i20 = 0;
                    m25662 = C2105.m6981("᩺᩶") ^ i25;
                    i17 = ((m25662 ^ i26) * 13623) ^ 340209856;
                    i19 = -1424265159;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -983218971:
                case -344779809:
                    i4 = i30;
                    i38 = 8;
                    m25662 = C0630.m2566("۬۟") ^ i25;
                    i17 = ((m25662 ^ i26) * (-13677)) ^ 1149450130;
                    i19 = 1595389949;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -888799129:
                case 101914897:
                    AbstractC2021.m6574();
                    if (C0422.m1963()) {
                        i3 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr = sArr4;
                        i6 = i35;
                        sArr2 = sArr5;
                        i7 = i36;
                        view = view6;
                        String str922 = str4;
                        textView = textView3;
                        str = str922;
                        m2566 = C0630.m2566("ۖܶ") ^ i25;
                        i9 = ((m2566 ^ i26) * (-12741)) ^ (-1560399347);
                        i10 = -961673558;
                        i28 = m2566 ^ i10;
                        i27 = i9;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView4222222222222 = textView;
                        str4 = str;
                        textView3 = textView4222222222222;
                    } else {
                        i4 = i30;
                        resources = resources2;
                        view = view6;
                        int m256652 = C0630.m2566("۬֫") ^ i25;
                        i28 = m256652 ^ (-1674251185);
                        i27 = ((m256652 ^ i26) * (-10159)) ^ (-1114687640);
                        view6 = view;
                        resources2 = resources;
                        i30 = i4;
                    }
                case -753292283:
                case 447413740:
                    i4 = i30;
                    resources = resources2;
                    i13 = i33;
                    view = view6;
                    m10562 = ServiceConnectionC3453.m10562(C2105.m6981(C7106.m19110(f21694, 43, 3, i32)) ^ 2119851831);
                    str2 = m10562;
                    m69813 = C0630.m2566("ۙ᩷") ^ i26;
                    i14 = ((m69813 ^ i25) * 16111) ^ (-1189111328);
                    i15 = 445090378;
                    i28 = m69813 ^ i15;
                    i27 = i14;
                    i33 = i13;
                    view6 = view;
                    resources2 = resources;
                    i30 = i4;
                case -725631841:
                case 236108590:
                    i11 = i29;
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr3 = sArr5;
                    i12 = i36;
                    view2 = view6;
                    String str12 = str4;
                    textView = textView3;
                    str = str12;
                    C1047.m3601((TextView) view5, AbstractC2021.m6567());
                    sArr4 = f21694;
                    i35 = 37;
                    if (C11340.f33930 >= 0) {
                        str4 = str;
                        textView3 = textView;
                        int m6981622 = (i26 - C2105.m6981("ۘᩳ")) * (-27);
                        i28 = m6981622 ^ (-2103753733);
                        i27 = ((m6981622 ^ i25) * (-12835)) ^ 749047566;
                        view6 = view2;
                        i36 = i12;
                        sArr5 = sArr3;
                        i29 = i11;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    } else {
                        int m25666 = C0630.m2566("֨ۘ") ^ i25;
                        i28 = m25666 ^ 1942318155;
                        i27 = ((m25666 ^ i26) * 5575) ^ 1820555425;
                        view6 = view2;
                        i36 = i12;
                        sArr5 = sArr3;
                        i29 = i11;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView42222222222222 = textView;
                        str4 = str;
                        textView3 = textView42222222222222;
                    }
                case -725381978:
                case 541981599:
                    C3683.m11222();
                    C3019.m9255();
                    m6981 = C2105.m6981("ۗ᩸") ^ i25;
                    i = ((m6981 ^ i26) * 889) ^ 1253543393;
                    i2 = 1247157115;
                    i28 = m6981 ^ i2;
                    i27 = i;
                case -680844354:
                case 1515656831:
                    i4 = i30;
                    button = (Button) C4263.m12813(viewOnClickListenerC7042, i22 ^ i23);
                    C22628.m50613(button, !z2);
                    if (z2) {
                        m25662 = C0630.m2566("ܳۗ") ^ i26;
                        i17 = ((m25662 ^ i25) * (-27547)) ^ 1237390669;
                        i19 = 1844362211;
                    } else {
                        m25662 = C2105.m6981("ۡۛ") ^ i26;
                        i17 = ((m25662 ^ i25) * (-11561)) ^ 1498790585;
                        i19 = 690525718;
                    }
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -527017842:
                case 342951323:
                    i4 = i30;
                    C0630.m2570(button, C0630.m2566(C3019.m9250(f21694, 67, 3, i32)) ^ 2124113917);
                    m25662 = C2105.m6981("᩻᩶") ^ i25;
                    i17 = ((m25662 ^ i26) * 14275) ^ 396089695;
                    i19 = -896213741;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -508721609:
                case 692976990:
                    C3245.m9918(button, i30);
                    break;
                case -494770018:
                case 844304388:
                    i4 = i30;
                    objArr[i34] = l2;
                    resources = resources2;
                    i13 = i33;
                    m10562 = resources.getQuantityString(C2105.m6981(C7811.m20837(f21694, 49, 3, i32)) ^ 2103435539, i13, objArr);
                    view = view6;
                    str2 = m10562;
                    m69813 = C0630.m2566("ۙ᩷") ^ i26;
                    i14 = ((m69813 ^ i25) * 16111) ^ (-1189111328);
                    i15 = 445090378;
                    i28 = m69813 ^ i15;
                    i27 = i14;
                    i33 = i13;
                    view6 = view;
                    resources2 = resources;
                    i30 = i4;
                case -287678038:
                case 1594862702:
                    i30 = -12303292;
                    m6981 = (C2105.m6981("ۢۜ") ^ i26) * 85;
                    i = ((m6981 ^ i25) * 933) ^ 151276587;
                    i2 = 411938488;
                    i28 = m6981 ^ i2;
                    i27 = i;
                case -174807024:
                case 1308301584:
                    i4 = i30;
                    C3746.m11360(view4, i20);
                    view6 = C4263.m12813(viewOnClickListenerC7042, C0630.m2566(C1773.m5917(f21694, 55, 3, i32)) ^ 2122734366);
                    if (z2) {
                        m25662 = C0630.m2566("ۤۡ") ^ i26;
                        i17 = ((m25662 ^ i25) * (-20621)) ^ (-1204399587);
                        i19 = 1607739279;
                    } else {
                        m25662 = C2105.m6981("ᩴᩳ") ^ i25;
                        i17 = ((m25662 ^ i26) * 14723) ^ (-197307180);
                        i19 = 1867327837;
                    }
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case -129575564:
                case 823286382:
                    i4 = i30;
                    C1128.m3853(view8, i31);
                    i22 = C2105.m6981(C3911.m11919(f21694, 64, 3, i32));
                    i23 = 2126739713;
                    if (C1711.f5919) {
                        i3 = i29;
                        resources = resources2;
                        i5 = i33;
                        sArr = sArr4;
                        i6 = i35;
                        sArr2 = sArr5;
                        i7 = i36;
                        view = view6;
                        String str9222 = str4;
                        textView = textView3;
                        str = str9222;
                        m2566 = C0630.m2566("ۖܶ") ^ i25;
                        i9 = ((m2566 ^ i26) * (-12741)) ^ (-1560399347);
                        i10 = -961673558;
                        i28 = m2566 ^ i10;
                        i27 = i9;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView422222222222222 = textView;
                        str4 = str;
                        textView3 = textView422222222222222;
                    } else {
                        m25662 = C0630.m2566("ۚۗ") ^ i26;
                        i17 = ((m25662 ^ i25) * (-169)) ^ 2067081430;
                        i19 = 1511259626;
                        i28 = m25662 ^ i19;
                        i27 = i17;
                        i30 = i4;
                    }
                case 57141565:
                case 1740463407:
                    i4 = i30;
                    TextView textView6 = textView3;
                    resources = resources2;
                    i5 = i33;
                    view = view6;
                    String str13 = str4;
                    C1047.m3601(textView6, str13);
                    sArr5 = f21694;
                    i36 = 40;
                    i37 = 3;
                    if (C4117.m12364() != 0) {
                        textView = textView6;
                        str = str13;
                        i3 = i29;
                        sArr = sArr4;
                        i6 = i35;
                        int m698152 = C2105.m6981("᩸֫") ^ i25;
                        i27 = ((m698152 ^ i26) * 1047) ^ 793078888;
                        i28 = m698152 ^ 1704353179;
                        viewOnClickListenerC7042 = this;
                        i35 = i6;
                        i33 = i5;
                        view6 = view;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i30 = i4;
                        TextView textView4222222222222222 = textView;
                        str4 = str;
                        textView3 = textView4222222222222222;
                    } else {
                        int m698110 = (C2105.m6981("۠ۜ") + i26) * (-11);
                        i27 = ((m698110 ^ i25) * 22743) ^ (-1312027120);
                        i28 = m698110 ^ 1321729198;
                        i33 = i5;
                        textView3 = textView6;
                        str4 = str13;
                        view6 = view;
                        resources2 = resources;
                        i30 = i4;
                    }
                case 156133656:
                case 1515640848:
                    i4 = i30;
                    C3746.m11360(view6, i29);
                    view7 = C4263.m12813(viewOnClickListenerC7042, C0630.m2566(C11340.m28025(f21694, 58, 3, i32)) ^ 2118413478);
                    if (z2) {
                        m25662 = C2105.m6981("᩷ۢ") ^ i26;
                        i17 = ((m25662 ^ i25) * (-4245)) ^ (-253747001);
                        i19 = 1209957063;
                    } else {
                        m25662 = (C0630.m2566("۟ۤ") ^ i26) * 119;
                        i17 = ((m25662 ^ i25) * (-2765)) ^ (-242032272);
                        i19 = -750557392;
                    }
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case 275518500:
                case 569577831:
                    i4 = i30;
                    i38 = 0;
                    m25662 = C0630.m2566("۬۟") ^ i25;
                    i17 = ((m25662 ^ i26) * (-13677)) ^ 1149450130;
                    i19 = 1595389949;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case 286571778:
                case 1071448793:
                    view3 = view6;
                    i4 = i30;
                    i16 = i33;
                    j = (C23196.m51466() - ViewOnClickListenerC1958.m6432()) / 86400000;
                    m14338 = C4925.m14338();
                    if (C1128.f4106 > 0) {
                        m69814 = C2105.m6981("ۤܺ") ^ i25;
                        i17 = ((m69814 ^ i26) * 10589) ^ 1632804776;
                        i18 = -678761948;
                        i28 = m69814 ^ i18;
                        i33 = i16;
                        view6 = view3;
                        resources2 = m14338;
                        i27 = i17;
                        i30 = i4;
                    }
                    m69814 = C0630.m2566("᩻ۢ") ^ i26;
                    i17 = ((m69814 ^ i25) * (-8581)) ^ 1605163475;
                    i18 = -1638419861;
                    i28 = m69814 ^ i18;
                    i33 = i16;
                    view6 = view3;
                    resources2 = m14338;
                    i27 = i17;
                    i30 = i4;
                case 321686725:
                case 843800271:
                    if (C2958.f9394 >= 0) {
                        i11 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr3 = sArr5;
                        i12 = i36;
                        view2 = view6;
                        int m69816222 = (i26 - C2105.m6981("ۘᩳ")) * (-27);
                        i28 = m69816222 ^ (-2103753733);
                        i27 = ((m69816222 ^ i25) * (-12835)) ^ 749047566;
                        view6 = view2;
                        i36 = i12;
                        sArr5 = sArr3;
                        i29 = i11;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    } else {
                        i3 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr = sArr4;
                        i6 = i35;
                        view = view6;
                        String str14 = str4;
                        textView = textView3;
                        str = str14;
                        int m6981522 = C2105.m6981("᩸֫") ^ i25;
                        i27 = ((m6981522 ^ i26) * 1047) ^ 793078888;
                        i28 = m6981522 ^ 1704353179;
                        viewOnClickListenerC7042 = this;
                        i35 = i6;
                        i33 = i5;
                        view6 = view;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i30 = i4;
                        TextView textView42222222222222222 = textView;
                        str4 = str;
                        textView3 = textView42222222222222222;
                    }
                case 828969191:
                case 1134925197:
                    i4 = i30;
                    resources = resources2;
                    view = view6;
                    long j2 = j;
                    i5 = (int) j2;
                    l2 = C4117.m12360(j2);
                    Object[] objArr2 = new Object[1];
                    if (C11340.f33930 >= 0) {
                        objArr = objArr2;
                        i33 = i5;
                        int m2566522 = C0630.m2566("۬֫") ^ i25;
                        i28 = m2566522 ^ (-1674251185);
                        i27 = ((m2566522 ^ i26) * (-10159)) ^ (-1114687640);
                        view6 = view;
                        resources2 = resources;
                        i30 = i4;
                    } else {
                        int m698111 = (C2105.m6981("ܺ۬") + i26) * (-7);
                        i27 = ((m698111 ^ i25) * (-22649)) ^ (-1923216768);
                        i28 = m698111 ^ 333617543;
                        view6 = view;
                        objArr = objArr2;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    }
                case 1297144597:
                case 1805844975:
                    i3 = i29;
                    i4 = i30;
                    resources = resources2;
                    i5 = i33;
                    sArr = sArr4;
                    i6 = i35;
                    sArr2 = sArr5;
                    i7 = i36;
                    view = view6;
                    String str15 = str4;
                    textView = textView3;
                    str = str15;
                    i32 = 7149;
                    m69812 = C2105.m6981("᩸۫") ^ i26;
                    i27 = ((m69812 ^ i25) * 1285) ^ (-422148924);
                    i8 = -426411462;
                    i28 = m69812 ^ i8;
                    viewOnClickListenerC7042 = this;
                    i35 = i6;
                    view6 = view;
                    i36 = i7;
                    sArr5 = sArr2;
                    i29 = i3;
                    sArr4 = sArr;
                    resources2 = resources;
                    i33 = i5;
                    i30 = i4;
                    TextView textView422222222222222222 = textView;
                    str4 = str;
                    textView3 = textView422222222222222222;
                case 1305556147:
                case 1984987345:
                    i4 = i30;
                    C0630.m2570(button, C2105.m6981(C3911.m11919(f21694, 70, 3, i32)) ^ 2104656853);
                    m25662 = C2105.m6981("᩻᩶") ^ i25;
                    i17 = ((m25662 ^ i26) * 14275) ^ 396089695;
                    i19 = -896213741;
                    i28 = m25662 ^ i19;
                    i27 = i17;
                    i30 = i4;
                case 1466917146:
                case 1850817782:
                    i4 = i30;
                    resources = resources2;
                    i13 = i33;
                    view = view6;
                    if (C1711.m5729()) {
                        m69813 = (i25 - C0630.m2566("ۨ᩵")) * (-85);
                        i14 = ((m69813 ^ i26) * (-3417)) ^ (-1722788180);
                        i15 = 1206944986;
                    } else {
                        m69813 = (i26 - C2105.m6981("ܿ᩸")) * (-75);
                        i14 = ((m69813 ^ i25) * (-19909)) ^ (-1629186373);
                        i15 = 147453290;
                    }
                    i28 = m69813 ^ i15;
                    i27 = i14;
                    i33 = i13;
                    view6 = view;
                    resources2 = resources;
                    i30 = i4;
                case 1797354814:
                case 2060914277:
                    if (AbstractC2021.m6574()) {
                        i3 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr = sArr4;
                        i6 = i35;
                        sArr2 = sArr5;
                        i7 = i36;
                        view = view6;
                        String str92222 = str4;
                        textView = textView3;
                        str = str92222;
                        m2566 = C0630.m2566("ۖܶ") ^ i25;
                        i9 = ((m2566 ^ i26) * (-12741)) ^ (-1560399347);
                        i10 = -961673558;
                        i28 = m2566 ^ i10;
                        i27 = i9;
                        i35 = i6;
                        view6 = view;
                        i36 = i7;
                        sArr5 = sArr2;
                        i29 = i3;
                        sArr4 = sArr;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                        TextView textView4222222222222222222 = textView;
                        str4 = str;
                        textView3 = textView4222222222222222222;
                    } else {
                        i11 = i29;
                        i4 = i30;
                        resources = resources2;
                        i5 = i33;
                        sArr3 = sArr5;
                        i12 = i36;
                        view2 = view6;
                        int m698162222 = (i26 - C2105.m6981("ۘᩳ")) * (-27);
                        i28 = m698162222 ^ (-2103753733);
                        i27 = ((m698162222 ^ i25) * (-12835)) ^ 749047566;
                        view6 = view2;
                        i36 = i12;
                        sArr5 = sArr3;
                        i29 = i11;
                        resources2 = resources;
                        i33 = i5;
                        i30 = i4;
                    }
                default:
                    if (C0422.f1886 <= 0) {
                        m6981 = C0630.m2566("ۙܰ") ^ i26;
                        i = ((m6981 ^ i25) * (-26905)) ^ 1209883291;
                        i2 = 1182719609;
                        i28 = m6981 ^ i2;
                        i27 = i;
                    }
                    m6981 = C2105.m6981("ۗ᩸") ^ i25;
                    i = ((m6981 ^ i26) * 889) ^ 1253543393;
                    i2 = 1247157115;
                    i28 = m6981 ^ i2;
                    i27 = i;
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19020(ViewOnClickListenerC7042 viewOnClickListenerC7042) {
        TextView textView = null;
        boolean z = false;
        CharSequence charSequence = null;
        boolean z2 = false;
        int i = -1068169039;
        int i2 = C3746.f11829;
        int i3 = C3019.f9544;
        int m6981 = (i2 - C2105.m6981("ܺۨ")) * 115;
        int i4 = ((m6981 ^ i3) * 12113) ^ 1147317652;
        int i5 = 157100116;
        while (true) {
            i = ((((i ^ i3) * (-32331)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2144594599:
                case -1470925540:
                    if (C2520.f8000 >= 0) {
                        m6981 = C0630.m2566("ᩳۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31351) ^ 1623629848;
                        i5 = -1194238097;
                    } else {
                        m6981 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-20271)) ^ (-1694381389);
                        i5 = -1152476378;
                    }
                case -2010558728:
                case 1786168422:
                    if (C7106.f21815 != 0) {
                        m6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        m6981 = (i3 - C0630.m2566("᩷ۧ")) * (-5);
                        i4 = ((m6981 ^ i2) * 2707) ^ 667791002;
                        i5 = -607886407;
                    }
                case -1980500353:
                case -852877697:
                    if (C0483.f2088 >= 0) {
                        m6981 = (i3 - C0630.m2566("᩷ۧ")) * (-5);
                        i4 = ((m6981 ^ i2) * 2707) ^ 667791002;
                        i5 = -607886407;
                    } else {
                        m6981 = C2105.m6981("ܳ۫") ^ i2;
                        i4 = ((m6981 ^ i3) * 23799) ^ (-647334486);
                        i5 = 1391387595;
                    }
                case -1928504983:
                case -1885913632:
                    if (C3245.f10203 <= 0) {
                        m6981 = (i3 - C0630.m2566("᩷ۧ")) * (-5);
                        i4 = ((m6981 ^ i2) * 2707) ^ 667791002;
                        i5 = -607886407;
                    } else {
                        m6981 = C2105.m6981("᩷ᩳ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-15097)) ^ 730125405;
                        i5 = -1882805317;
                    }
                case -1801067872:
                case -383996542:
                    if (C1128.m3851() <= 0) {
                        m6981 = (i3 - C0630.m2566("ܿۖ")) * (-51);
                        i4 = ((m6981 ^ i2) * 28585) ^ 350837662;
                        i5 = -1031182973;
                    } else {
                        m6981 = (C0630.m2566("᩶᩹") + i3) * 3;
                        i4 = ((m6981 ^ i2) * 8905) ^ 964215538;
                        i5 = -1753395828;
                    }
                case -1798745351:
                case 1045561876:
                    ServiceConnectionC3453.m10564();
                    break;
                case -1622970208:
                case 979970465:
                    textView = viewOnClickListenerC7042.f21700;
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        m6981 = C0630.m2566("᩻ܶ") ^ i2;
                        i4 = ((m6981 ^ i3) * 21905) ^ 450475800;
                        i5 = 2097912653;
                    }
                case -1474486729:
                case 1249707904:
                    charSequence = m19010(z);
                    if (C3537.f11231 >= 0) {
                        m6981 = (i3 - C0630.m2566("ܿۖ")) * (-51);
                        i4 = ((m6981 ^ i2) * 28585) ^ 350837662;
                        i5 = -1031182973;
                    } else {
                        m6981 = (C2105.m6981("ۗ᩹") ^ i3) * 123;
                        i4 = ((m6981 ^ i2) * (-1821)) ^ (-922559275);
                        i5 = -192208306;
                    }
                case -718537768:
                case 109888884:
                    break;
                case -670592632:
                case 727831892:
                    RunnableC1937.m6377(textView, charSequence);
                    z2 = false;
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m6981 = (i3 - C0630.m2566("ܿۖ")) * (-51);
                        i4 = ((m6981 ^ i2) * 28585) ^ 350837662;
                        i5 = -1031182973;
                    } else {
                        m6981 = C2105.m6981("ۜ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * (-27011)) ^ (-204482072);
                        i5 = -1119130463;
                    }
                case -611123711:
                case 1980436985:
                    viewOnClickListenerC7042.f21698 = z2;
                    if (viewOnClickListenerC7042.f21697) {
                        m6981 = (i3 - C0630.m2566("ۡᩴ")) * 75;
                        i4 = ((m6981 ^ i2) * 32419) ^ (-490900378);
                        i5 = 1934821996;
                    } else {
                        m6981 = (C2105.m6981("֫۠") + i2) * (-87);
                        i4 = ((m6981 ^ i3) * 12797) ^ (-1063528386);
                        i5 = -557722030;
                    }
                case -577304509:
                case 304734549:
                    C0422.m1963();
                    if (C2958.f9394 >= 0) {
                        m6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        m6981 = C0630.m2566("ᩳۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * 31351) ^ 1623629848;
                        i5 = -1194238097;
                    }
                case -312597069:
                case -168881093:
                    viewOnClickListenerC7042.f21697 = z2;
                    viewOnClickListenerC7042.m19025();
                    m6981 = (C2105.m6981("֫۠") + i2) * (-87);
                    i4 = ((m6981 ^ i3) * 12797) ^ (-1063528386);
                    i5 = -557722030;
                case 466743219:
                case 758620741:
                    if (C3432.f10845 >= 0) {
                        m6981 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-20271)) ^ (-1694381389);
                        i5 = -1152476378;
                    } else {
                        m6981 = C2105.m6981("ۖ֫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-31373)) ^ (-1163117108);
                        i5 = -617548627;
                    }
                case 876039478:
                case 1403740439:
                    z = true;
                    if (C1294.f4556 >= 0) {
                        m6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        m6981 = C2105.m6981("ܶ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * 27973) ^ 575135000;
                        i5 = 1169977777;
                    }
                case 915514568:
                case 2131761284:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("ᩴ֨") ^ i3;
                        i4 = ((m6981 ^ i2) * (-11239)) ^ (-87766188);
                        i5 = -739200432;
                    } else {
                        m6981 = (i3 - C0630.m2566("ܺۖ")) * (-115);
                        i4 = ((m6981 ^ i2) * 28515) ^ (-1499304822);
                        i5 = -841226387;
                    }
                case 1464240827:
                case 1603520405:
                    if (C1128.m3851() <= 0) {
                        m6981 = C0630.m2566("ۜۜ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-20271)) ^ (-1694381389);
                        i5 = -1152476378;
                    } else {
                        m6981 = C0630.m2566("ᩴۛ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-5317)) ^ (-1120805178);
                        i5 = -1410306947;
                    }
                default:
                    C2167.m7155();
                    m6981 = C0630.m2566("ᩴ֨") ^ i3;
                    i4 = ((m6981 ^ i2) * (-11239)) ^ (-87766188);
                    i5 = -739200432;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (l.C1047.f3863 < 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        r16 = r1;
        r17 = r2;
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0142, code lost:
    
        r0 = (l.C2105.m6981("ۖۙ") + r13) * (-63);
        r1 = ((r0 ^ r14) * (-6463)) ^ 720791986;
        r2 = 1935746374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r16 = r1;
        r17 = r2;
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x023d, code lost:
    
        r0 = (r14 - l.C0630.m2566("ܺۤ")) * 83;
        r1 = ((r0 ^ r13) * (-5679)) ^ 1238944836;
        r2 = -470156146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r18 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016f, code lost:
    
        r0 = l.C0630.m2566("᩺ܽ") ^ r13;
        r15 = r0 ^ 730774763;
        r0 = ((r0 ^ r14) * 27021) ^ (-1138113906);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.CharSequence m19010(boolean r21) {
        /*
            Method dump skipped, instructions count: 880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.m19010(boolean):java.lang.CharSequence");
    }

    public ViewOnClickListenerC7042() {
        ArrayList arrayList = null;
        int i = -1383198745;
        int i2 = AbstractC2021.f6743;
        int i3 = C0050.f910;
        int m2566 = (C0630.m2566("᩶᩵") + i2) * 93;
        int i4 = ((m2566 ^ i3) * 17519) ^ (-2147449830);
        int i5 = 1381429849;
        while (true) {
            i = ((((i ^ i3) * 10077) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2125069737:
                case 1427222859:
                    if (C1773.m5908() <= 0) {
                        m2566 = (C2105.m6981("ۖۘ") ^ i2) * (-125);
                        i4 = ((m2566 ^ i3) * (-22575)) ^ 921140454;
                        i5 = -1157559588;
                    } else {
                        m2566 = C2105.m6981("ᩳܽ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-16587)) ^ 492739530;
                        i5 = 918480734;
                    }
                case -2005962696:
                case -1691978024:
                    if (C0714.f2697 >= 0) {
                        m2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    } else {
                        m2566 = C2105.m6981("۠᩹") ^ i3;
                        i4 = ((m2566 ^ i2) * (-25077)) ^ 1482142093;
                        i5 = 1479993899;
                    }
                case -1701504785:
                case 80617277:
                    if (C11340.f33930 >= 0) {
                        m2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    } else {
                        m2566 = C2105.m6981("ᩴۘ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-14755)) ^ (-424316808);
                        i5 = 1463597351;
                    }
                case -1670002417:
                case -1533863687:
                    if (RunnableC1108.f4040) {
                        m2566 = (C0630.m2566("ܽ֨") + i3) * 7;
                        i4 = ((m2566 ^ i2) * 2121) ^ 174876236;
                        i5 = 194518467;
                    } else {
                        m2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    }
                case -1324941897:
                case 1764080795:
                    C1916.m6308();
                    m2566 = C2105.m6981("۫ܶ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-2045)) ^ 1113806701;
                    i5 = -1565553726;
                case -1320026201:
                case 516180234:
                    if (C1504.f5354) {
                        m2566 = C2105.m6981("᩻ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-31433)) ^ (-1418893415);
                        i5 = 1302387527;
                    } else {
                        m2566 = C2105.m6981("᩶۬") ^ i2;
                        i4 = ((m2566 ^ i3) * (-6931)) ^ (-546952390);
                        i5 = 62391806;
                    }
                case -1113565245:
                case -1113118613:
                    C3911.m11924();
                    if (C2520.f8000 >= 0) {
                        m2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    } else {
                        m2566 = C2105.m6981("᩻ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-31433)) ^ (-1418893415);
                        i5 = 1302387527;
                    }
                case -878204442:
                case 956322522:
                    this.f21699 = C8817.m22788();
                    return;
                case -844101135:
                case 366302623:
                    ViewOnClickListenerC1958.m6429();
                    if (C0798.f2919) {
                        m2566 = (C2105.m6981("᩹ۙ") + i3) * (-93);
                        i4 = ((m2566 ^ i2) * (-22647)) ^ 481579386;
                        i5 = -1955075710;
                    } else {
                        m2566 = C2105.m6981("᩻ۖ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-31433)) ^ (-1418893415);
                        i5 = 1302387527;
                    }
                case -714329804:
                case -485356903:
                    this.f21696 = arrayList;
                    if (C0483.f2088 >= 0) {
                        m2566 = C2105.m6981("᩸ۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21273) ^ (-1545440427);
                        i5 = 1613518787;
                    } else {
                        m2566 = C2105.m6981("۟ܿ") ^ i2;
                        i4 = ((m2566 ^ i3) * 6321) ^ (-246024396);
                        i5 = -1660028379;
                    }
                case -200943126:
                case 903108782:
                    C1047.m3599();
                    throw new RuntimeException();
                case 26545216:
                case 257909700:
                    if (C1916.f6442) {
                        m2566 = (C2105.m6981("ۙ᩶") ^ i3) * (-67);
                        i4 = ((m2566 ^ i2) * (-18543)) ^ 2101124390;
                        i5 = -425272112;
                    } else {
                        m2566 = C2105.m6981("᩸ۨ") ^ i2;
                        i4 = ((m2566 ^ i3) * 21273) ^ (-1545440427);
                        i5 = 1613518787;
                    }
                case 104331854:
                case 1335550725:
                    if (C7106.m19120() <= 0) {
                        m2566 = (C2105.m6981("᩹ۙ") + i3) * (-93);
                        i4 = ((m2566 ^ i2) * (-22647)) ^ 481579386;
                        i5 = -1955075710;
                    } else {
                        m2566 = C2105.m6981("ܺ֡") ^ i2;
                        i4 = ((m2566 ^ i3) * (-11613)) ^ (-1825956019);
                        i5 = -557508068;
                    }
                case 589605533:
                case 914744112:
                    if (C2272.f7362) {
                        m2566 = (C2105.m6981("᩹ۙ") + i3) * (-93);
                        i4 = ((m2566 ^ i2) * (-22647)) ^ 481579386;
                        i5 = -1955075710;
                    } else {
                        m2566 = (C2105.m6981("ۖۘ") ^ i2) * (-125);
                        i4 = ((m2566 ^ i3) * (-22575)) ^ 921140454;
                        i5 = -1157559588;
                    }
                case 701987590:
                case 796872611:
                    arrayList = new ArrayList();
                    if (C21923.f70183 != 0) {
                        m2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    } else {
                        m2566 = (C0630.m2566("ܺۧ") ^ i3) * 39;
                        i4 = ((m2566 ^ i2) * (-21901)) ^ (-2086340122);
                        i5 = -870798867;
                    }
                default:
                    if (C11340.m28031()) {
                        m2566 = C2105.m6981("۬᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * (-21507)) ^ 1800219496;
                        i5 = -868260250;
                    } else {
                        m2566 = C2105.m6981("۫ܶ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-2045)) ^ 1113806701;
                        i5 = -1565553726;
                    }
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Iterator it = null;
        C11077 c11077 = null;
        boolean z = false;
        int i = 1199114931;
        int i2 = C2520.f8000;
        int i3 = C4075.f12947;
        int m6981 = (i3 - C2105.m6981("۬۠")) * 119;
        int i4 = ((m6981 ^ i2) * 27479) ^ 1634742885;
        int i5 = -1117414774;
        while (true) {
            i = ((((i ^ i2) * 4489) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2051820055:
                case -874247308:
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        m6981 = C0630.m2566("ܽۛ") ^ i3;
                        i4 = ((m6981 ^ i2) * 17113) ^ (-1258838975);
                        i5 = 2035208562;
                    }
                case -1938722299:
                case -1332788651:
                    c11077 = (C11077) RunnableC1108.m3791(it);
                    if (c11077 == view) {
                        m6981 = C2105.m6981("᩵۟") ^ i2;
                        i4 = ((m6981 ^ i3) * 20711) ^ 151156197;
                        i5 = -688168499;
                    } else {
                        m6981 = C0630.m2566("ۢ᩵") ^ i2;
                        i4 = ((m6981 ^ i3) * 23213) ^ (-1552740939);
                        i5 = -326509720;
                    }
                case -1790923746:
                case 1512112412:
                    break;
                case -1770739935:
                case -1589686715:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۡۛ")) * 83;
                        i4 = ((m6981 ^ i3) * (-10005)) ^ (-2023936081);
                        i5 = -1916691014;
                    }
                case -1599784367:
                case 846292284:
                    if (C1711.m5736() <= 0) {
                        m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        m6981 = (i2 - C0630.m2566("ܿۨ")) * 43;
                        i4 = ((m6981 ^ i3) * (-22349)) ^ 1315406609;
                        i5 = -605872916;
                    }
                case -1523091277:
                case -156847760:
                    if (C0483.m2123(it)) {
                        m6981 = (i3 - C0630.m2566("֡ۜ")) * (-77);
                        i4 = ((m6981 ^ i2) * (-8705)) ^ (-2130156643);
                        i5 = 1281190962;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۗ᩶")) * 65;
                        i4 = ((m6981 ^ i2) * (-6547)) ^ 582340427;
                        i5 = 195188103;
                    }
                case -1463036567:
                case 1731067119:
                    z = false;
                    m6981 = (C0630.m2566("֡᩻") ^ i3) * 31;
                    i4 = ((m6981 ^ i2) * (-291)) ^ 2028808887;
                    i5 = -666207969;
                case -1352278283:
                case 1867704855:
                    if (C4263.m12819() >= 0) {
                        m6981 = (C2105.m6981("᩵۠") ^ i3) * 47;
                        i4 = ((m6981 ^ i2) * 4337) ^ 1653120214;
                        i5 = 320664189;
                    } else {
                        m6981 = (C0630.m2566("᩵ܶ") ^ i3) * 119;
                        i4 = ((m6981 ^ i2) * 3617) ^ (-1122039185);
                        i5 = -1044081222;
                    }
                case -1326836160:
                case -672998615:
                    if (C4263.f13799 <= 0) {
                        m6981 = C0630.m2566("ܿ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 5877) ^ (-1218514797);
                        i5 = -2120692291;
                    } else {
                        m6981 = C0630.m2566("ᩳۢ") ^ i2;
                        i4 = ((m6981 ^ i3) * 27077) ^ 902282935;
                        i5 = 1542783168;
                    }
                case -1185172437:
                case -450925254:
                    if (C1773.f6144 <= 0) {
                        m6981 = C0630.m2566("ܿ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 5877) ^ (-1218514797);
                        i5 = -2120692291;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩹ۜ")) * (-83);
                        i4 = ((m6981 ^ i2) * (-3809)) ^ (-1076914128);
                        i5 = -1546511110;
                    }
                case -1042334729:
                case -845890458:
                    C11340.m28031();
                    if (C4075.f12947 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        m6981 = (C2105.m6981("᩷᩹") + i2) * 3;
                        i4 = ((m6981 ^ i3) * 12821) ^ 93851171;
                        i5 = -1820052864;
                    }
                case -878403172:
                case 1566347923:
                    z = true;
                    m6981 = (C0630.m2566("֡᩻") ^ i3) * 31;
                    i4 = ((m6981 ^ i2) * (-291)) ^ 2028808887;
                    i5 = -666207969;
                case -799870373:
                case 792990051:
                    if (C2520.f8000 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        m6981 = C2105.m6981("۠ᩴ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-10081)) ^ 499519775;
                        i5 = 1965387195;
                    }
                case -594820874:
                case 2006290699:
                    if (C3663.f11553) {
                        m6981 = (C2105.m6981("᩷᩹") + i2) * 3;
                        i4 = ((m6981 ^ i3) * 12821) ^ 93851171;
                        i5 = -1820052864;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩵ۖ")) * 23;
                        i4 = ((m6981 ^ i2) * 24359) ^ (-169524818);
                        i5 = -1623099648;
                    }
                case -250271852:
                case 1952746295:
                    if (C1047.f3863 >= 0) {
                        m6981 = (C2105.m6981("᩷᩹") + i2) * 3;
                        i4 = ((m6981 ^ i3) * 12821) ^ 93851171;
                        i5 = -1820052864;
                    } else {
                        m6981 = (i2 - C2105.m6981("۬ۢ")) * (-101);
                        i4 = ((m6981 ^ i3) * 131) ^ 1087995263;
                        i5 = 1488863274;
                    }
                case -42036233:
                case 2075548160:
                    if (C4616.f14690 <= 0) {
                        m6981 = (C2105.m6981("᩵۠") ^ i3) * 47;
                        i4 = ((m6981 ^ i2) * 4337) ^ 1653120214;
                        i5 = 320664189;
                    } else {
                        m6981 = (C0630.m2566("ۢۤ") + i2) * (-37);
                        i4 = ((m6981 ^ i3) * 22993) ^ 1933023419;
                        i5 = 1750368889;
                    }
                case -24736433:
                case 456339136:
                    if (C2520.f8000 >= 0) {
                        m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        m6981 = C0630.m2566("᩹᩺") ^ i2;
                        i4 = ((m6981 ^ i3) * (-2367)) ^ 801198588;
                        i5 = 1177762579;
                    }
                case 121096640:
                case 1750572683:
                    it = C2958.m9029(this.f21696);
                    m6981 = C2105.m6981("۟ۤ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-1601)) ^ 1369449620;
                    i5 = 781413122;
                case 163789797:
                case 2080809482:
                    RunnableC0588.m2441();
                    if (C4263.f13799 <= 0) {
                        m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                        i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                        i5 = 182877998;
                    } else {
                        m6981 = (C2105.m6981("᩵۠") ^ i3) * 47;
                        i4 = ((m6981 ^ i2) * 4337) ^ 1653120214;
                        i5 = 320664189;
                    }
                case 828496468:
                case 1532310017:
                    c11077.m27475(z);
                    m6981 = C2105.m6981("۟ۤ") ^ i2;
                    i4 = ((m6981 ^ i3) * (-1601)) ^ 1369449620;
                    i5 = 781413122;
                case 830240546:
                case 1359067907:
                    C1294.m4372();
                    C3245.m9925();
                    m6981 = (i3 - C2105.m6981("ۙۗ")) * 41;
                    i4 = ((m6981 ^ i2) * 16419) ^ 523126380;
                    i5 = 182877998;
                default:
                    C2958.m9034();
                    break;
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public void m19017() {
        String str;
        short[] sArr;
        int m2566;
        int i;
        int m25662;
        int i2;
        int i3;
        List list;
        String str2;
        int m6981;
        int i4;
        String str3;
        boolean z;
        int m69812;
        int i5;
        int i6;
        int i7;
        ViewOnClickListenerC7042 viewOnClickListenerC7042 = this;
        int i8 = RunnableC0588.f2309;
        int i9 = RunnableC3474.f10992;
        int m69813 = C2105.m6981("ۜܽ") ^ i9;
        int i10 = ((m69813 ^ i8) * 18987) ^ (-530381670);
        ArrayList arrayList = null;
        Iterator it = null;
        C14802 c14802 = null;
        StringBuilder sb = null;
        String str4 = null;
        String str5 = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = m69813 ^ (-723220209);
        LinearLayout linearLayout = null;
        int i12 = 0;
        boolean z2 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        short s = 0;
        int i16 = 0;
        boolean z3 = false;
        int i17 = 0;
        boolean z4 = false;
        int i18 = -785129455;
        C11077 c11077 = null;
        int i19 = 0;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i8) * 23701) >> 31));
            switch (i18) {
                case -2111776090:
                case 767757638:
                    str = str4;
                    sArr = sArr2;
                    str5 = C0237.m1483(sArr, 28, 3, i15);
                    if (C2105.f7037 != 0) {
                        m2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((m2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = m2566 ^ i;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    } else {
                        m25662 = (i8 - C0630.m2566("ܶ֨")) * 63;
                        i2 = ((m25662 ^ i9) * 13775) ^ 2027752637;
                        i3 = -1566043160;
                        i6 = m25662 ^ i3;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                case -1998708263:
                case -1708421474:
                    str = str4;
                    sArr = sArr2;
                    i13 = 0;
                    if (C0483.m2123(it)) {
                        m25662 = (i9 - C0630.m2566("ۧ֫")) * 93;
                        i2 = ((m25662 ^ i8) * (-19979)) ^ (-1726066021);
                        i3 = -1029546393;
                    } else {
                        m25662 = C0630.m2566("᩹ۖ") ^ i8;
                        i2 = ((m25662 ^ i9) * (-23579)) ^ 1158759348;
                        i3 = -571564412;
                    }
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -1931547875:
                case -1608412278:
                    str = str4;
                    z3 = false;
                    m6981 = (C0630.m2566("۫֡") ^ i8) * (-67);
                    i2 = ((m6981 ^ i9) * 22379) ^ (-1775737659);
                    i4 = 1099236369;
                    i6 = m6981 ^ i4;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -1913619208:
                case -1257332925:
                    str = str4;
                    sArr = sArr2;
                    short s2 = f21694[24];
                    int i20 = s2 + 7568;
                    if (C0714.m2805()) {
                        int m69814 = (C2105.m6981("ᩴۤ") ^ i9) * (-21);
                        s = s2;
                        i16 = i20;
                        sArr2 = sArr;
                        str4 = str;
                        i10 = ((m69814 ^ i8) * 4441) ^ (-1507552326);
                        i11 = m69814 ^ 2030362243;
                        viewOnClickListenerC7042 = this;
                    } else {
                        s = s2;
                        i16 = i20;
                        m2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((m2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = m2566 ^ i;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                case -1899336740:
                case -227670762:
                    str = str4;
                    sArr = sArr2;
                    int i21 = (s * s) + 57274624;
                    if ((i21 + i21) - (i16 * i16) >= 0) {
                        m2566 = C0630.m2566("᩵ۗ") ^ i8;
                        i10 = ((m2566 ^ i9) * (-5645)) ^ (-397207674);
                        i = 735338383;
                    } else {
                        m2566 = C0630.m2566("ۤۨ") ^ i9;
                        i10 = ((m2566 ^ i8) * (-3195)) ^ (-1471185966);
                        i = -60086638;
                    }
                    i7 = m2566 ^ i;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
                case -1856525257:
                case 728716644:
                    if (C0630.f2410 > 0) {
                        str = str4;
                        int m69815 = (C2105.m6981("֫᩵") + i8) * 93;
                        i10 = ((m69815 ^ i9) * 11945) ^ 307889310;
                        i7 = m69815 ^ (-968825459);
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    } else {
                        str = str4;
                        sArr = sArr2;
                        m25662 = C2105.m6981("ᩴܿ") ^ i9;
                        i2 = ((m25662 ^ i8) * 23853) ^ 1357120381;
                        i3 = 237572947;
                        i6 = m25662 ^ i3;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                case -1844562011:
                case 1250794766:
                    str = str4;
                    sArr = sArr2;
                    arrayList = viewOnClickListenerC7042.f21696;
                    RunnableC1937.m6383(arrayList);
                    linearLayout.removeAllViews();
                    i12 = C1294.m4384(16.0f);
                    if (C0630.f2410 > 0) {
                        m25662 = C0630.m2566("۫ۜ") ^ i9;
                        i2 = ((m25662 ^ i8) * 26003) ^ (-592512624);
                        i3 = -974192510;
                        i6 = m25662 ^ i3;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    m25662 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((m25662 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -1678767267:
                case 1979534625:
                    c11077.m27482(str4);
                    str3 = c14802.f45196;
                    c11077.m27478(str3);
                    z = c14802.f45193;
                    c11077.m27479(z);
                    C0964.m3404(c11077, c14802);
                    if (C3911.f12484 < 0) {
                        str = str4;
                        C3663.m11165(linearLayout, c11077, new LinearLayout.LayoutParams(i13, -2, 1.0f));
                        C1916.m6307(arrayList, c11077);
                        C2126.m7039(c11077, viewOnClickListenerC7042);
                        z4 = z3;
                        sArr = sArr2;
                        m25662 = C2105.m6981("ᩳ᩶") ^ i8;
                        i2 = ((m25662 ^ i9) * 10129) ^ 1100912310;
                        i3 = 64175954;
                        i6 = m25662 ^ i3;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    str = str4;
                    sArr = sArr2;
                    m25662 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((m25662 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -1652475973:
                case -839233033:
                    str = str4;
                    sArr = sArr2;
                    i15 = 47820;
                    m2566 = (C2105.m6981("֫᩹") + i8) * 67;
                    i10 = ((m2566 ^ i9) * (-23959)) ^ (-1662136484);
                    i = -245304166;
                    i7 = m2566 ^ i;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
                case -1543171970:
                case -49036729:
                    str = str4;
                    sArr = sArr2;
                    list = viewOnClickListenerC7042.f21695.f53844;
                    it = RunnableC1937.m6374(list);
                    z2 = true;
                    z4 = true;
                    m25662 = C2105.m6981("ᩳ᩶") ^ i8;
                    i2 = ((m25662 ^ i9) * 10129) ^ 1100912310;
                    i3 = 64175954;
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -1264533916:
                case 1180931883:
                    TextView textView = (TextView) C4263.m12813(viewOnClickListenerC7042, C0630.m2566(str5) ^ 2128623737);
                    str2 = viewOnClickListenerC7042.f21695.f53843;
                    RunnableC1937.m6377(textView, str2);
                    break;
                case -1246887349:
                case 1398715170:
                    str = str4;
                    c14802 = (C14802) C2272.m7513(it);
                    if (z4) {
                        m6981 = C0630.m2566("ܶۗ") ^ i9;
                        i2 = ((m6981 ^ i8) * 1793) ^ 1478488564;
                        i4 = -315309871;
                    } else {
                        m6981 = C2105.m6981("ܰ᩺") ^ i8;
                        i2 = ((m6981 ^ i9) * (-11279)) ^ 1197218893;
                        i4 = 1992851211;
                    }
                    i6 = m6981 ^ i4;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -1136123827:
                case 920930331:
                    str = str4;
                    sArr = sArr2;
                    m19021();
                    i17 = C2105.m6981(RunnableC0588.m2436(f21694, 25, 3, i15));
                    if (C3911.f12484 >= 0) {
                        sArr2 = sArr;
                        int m698152 = (C2105.m6981("֫᩵") + i8) * 93;
                        i10 = ((m698152 ^ i9) * 11945) ^ 307889310;
                        i7 = m698152 ^ (-968825459);
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    } else {
                        m2566 = C0630.m2566("۠۫") ^ i8;
                        i10 = ((m2566 ^ i9) * 20077) ^ 99003041;
                        i = 1163023139;
                        i7 = m2566 ^ i;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    }
                case -1066675349:
                case -281839122:
                    str = str4;
                    linearLayout.addView(new Space(viewOnClickListenerC7042), i12, z2 ? 1 : 0);
                    z3 = z4;
                    m6981 = (C0630.m2566("۫֡") ^ i8) * (-67);
                    i2 = ((m6981 ^ i9) * 22379) ^ (-1775737659);
                    i4 = 1099236369;
                    i6 = m6981 ^ i4;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -1008180187:
                case 1770145089:
                    C3245.m9923(sb, C0422.m1955(sArr3, i19, 2, i15));
                    c11077.m27474(C0422.m1959(sb));
                    str4 = c14802.f45195;
                    if (RunnableC0588.f2309 >= 0) {
                        str = str4;
                        sArr = sArr2;
                        m2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((m2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = m2566 ^ i;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    } else {
                        m69812 = C0630.m2566("ۗۧ") ^ i8;
                        i2 = ((m69812 ^ i9) * 1763) ^ (-1923449622);
                        i5 = -335124354;
                        i11 = m69812 ^ i5;
                        i10 = i2;
                    }
                case -936829399:
                case -222256508:
                    str = str4;
                    c11077 = new C11077(viewOnClickListenerC7042);
                    sb = new StringBuilder();
                    i14 = c14802.f45194;
                    if (!C1711.f5919) {
                        m6981 = C0630.m2566("۫ܺ") ^ i9;
                        i2 = ((m6981 ^ i8) * (-29991)) ^ 1191151191;
                        i4 = 711410268;
                        i6 = m6981 ^ i4;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    sArr = sArr2;
                    m25662 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((m25662 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case -815346189:
                case -592875385:
                    str = str4;
                    sArr = sArr2;
                    linearLayout = (LinearLayout) C0964.m3409(viewOnClickListenerC7042, i17 ^ 2104369360);
                    if (C5695.f17556 < 0) {
                        m25662 = (i9 - C0630.m2566("ܺۚ")) * (-11);
                        i2 = ((m25662 ^ i8) * (-2331)) ^ 894179837;
                        i3 = 1492984468;
                        i6 = m25662 ^ i3;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    m25662 = C2105.m6981("ۤ֫") ^ i9;
                    i2 = ((m25662 ^ i8) * (-12285)) ^ (-740457748);
                    i3 = 846543295;
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case 205153910:
                case 1402941269:
                    if (C0964.m3413()) {
                        m69812 = (C2105.m6981("ۚۘ") ^ i8) * 19;
                        i2 = ((m69812 ^ i9) * 13329) ^ 130773789;
                        i5 = -51111180;
                        i11 = m69812 ^ i5;
                        i10 = i2;
                    }
                    str = str4;
                    sArr = sArr2;
                    m25662 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((m25662 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                case 264814508:
                case 1267552862:
                    str = str4;
                    C0422.m1944(sb, i14);
                    sArr3 = f21694;
                    i19 = 31;
                    if (RunnableC1937.f6483 >= 0) {
                        sArr = sArr2;
                        m2566 = C0630.m2566("֡ۤ") ^ i9;
                        i10 = ((m2566 ^ i8) * (-9147)) ^ 1677448329;
                        i = 478847048;
                        i7 = m2566 ^ i;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    } else {
                        m6981 = C2105.m6981("ۚ᩻") ^ i9;
                        i2 = ((m6981 ^ i8) * (-19755)) ^ 1608892347;
                        i4 = -1576908951;
                        i6 = m6981 ^ i4;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                case 397393949:
                case 1874912693:
                    C22628.m50615();
                    str = str4;
                    int m6981522 = (C2105.m6981("֫᩵") + i8) * 93;
                    i10 = ((m6981522 ^ i9) * 11945) ^ 307889310;
                    i7 = m6981522 ^ (-968825459);
                    str4 = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
                case 915781208:
                case 1974902782:
                    C2958.m9034();
                    C3432.m10477();
                    break;
                case 1142315606:
                case 1537753721:
                    str = str4;
                    ((C11077) C3537.m10755(arrayList, i13)).m27475(z2);
                    m19014();
                    sArr2 = f21694;
                    if (C1047.f3863 >= 0) {
                        int m69815222 = (C2105.m6981("֫᩵") + i8) * 93;
                        i10 = ((m69815222 ^ i9) * 11945) ^ 307889310;
                        i7 = m69815222 ^ (-968825459);
                        str4 = str;
                        i11 = i7;
                        viewOnClickListenerC7042 = this;
                    } else {
                        m6981 = C2105.m6981("ܶᩳ") ^ i9;
                        i2 = ((m6981 ^ i8) * 25349) ^ 366956315;
                        i4 = -473239818;
                        i6 = m6981 ^ i4;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                case 2067060010:
                case 2103498886:
                    C3911.m11924();
                    if (C0630.f2410 > 0) {
                        str = str4;
                        sArr = sArr2;
                        m25662 = C2105.m6981("ۤ֫") ^ i9;
                        i2 = ((m25662 ^ i8) * (-12285)) ^ (-740457748);
                        i3 = 846543295;
                        i6 = m25662 ^ i3;
                        sArr2 = sArr;
                        str4 = str;
                        i11 = i6;
                        i10 = i2;
                    }
                    str = str4;
                    sArr = sArr2;
                    m25662 = C2105.m6981("ᩴܿ") ^ i9;
                    i2 = ((m25662 ^ i8) * 23853) ^ 1357120381;
                    i3 = 237572947;
                    i6 = m25662 ^ i3;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i6;
                    i10 = i2;
                default:
                    str = str4;
                    sArr = sArr2;
                    i15 = 5229;
                    m2566 = (C2105.m6981("֫᩹") + i8) * 67;
                    i10 = ((m2566 ^ i9) * (-23959)) ^ (-1662136484);
                    i = -245304166;
                    i7 = m2566 ^ i;
                    sArr2 = sArr;
                    str4 = str;
                    i11 = i7;
                    viewOnClickListenerC7042 = this;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        C17625 c17625;
        int i2;
        int i3;
        CharSequence charSequence;
        View view;
        C13132 c13132;
        int i4;
        short[] sArr;
        int i5;
        short[] sArr2;
        int i6;
        View view2;
        int i7;
        TextView textView;
        int i8;
        View view3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        short[] sArr3;
        int i14;
        short[] sArr4;
        int i15;
        int i16;
        short[] sArr5;
        int i17;
        int i18;
        TextView textView2;
        int i19;
        C17625 c176252;
        CharSequence charSequence2;
        View view4;
        short[] sArr6;
        int m6981;
        int i20;
        int i21;
        int i22;
        int i23;
        short[] sArr7;
        int i24;
        int i25;
        short[] sArr8;
        int i26;
        View view5;
        short[] sArr9;
        int m2566;
        int i27;
        short[] sArr10;
        View view6;
        int i28;
        short[] sArr11;
        int i29;
        View view7;
        int i30;
        int m25662;
        int m25663;
        int i31;
        int i32;
        int i33;
        int m69812;
        int i34;
        int i35;
        String str;
        C13132 c131322;
        int i36;
        C17625 c176253;
        int i37;
        int m25664;
        int i38;
        int i39;
        int i40;
        int m25665;
        int i41;
        int i42;
        List list;
        Bundle bundle2 = bundle;
        int i43 = -1923526399;
        int i44 = C2167.f7158;
        int i45 = C3683.f11629;
        int m25666 = C0630.m2566("۟ۖ") ^ i45;
        int i46 = ((m25666 ^ i44) * 16879) ^ 134286764;
        int i47 = m25666 ^ (-1406440867);
        C13132 c131323 = null;
        View view8 = null;
        C17625 c176254 = null;
        EditText editText = null;
        String str2 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        short[] sArr16 = null;
        short[] sArr17 = null;
        int i48 = 0;
        int i49 = 0;
        View view9 = null;
        int i50 = 0;
        int i51 = 0;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        int i56 = 0;
        int i57 = 0;
        View.OnClickListener onClickListener = null;
        View view10 = null;
        CharSequence charSequence3 = null;
        View view11 = null;
        View view12 = null;
        TextView textView3 = null;
        StringBuilder sb = null;
        int i58 = 0;
        int i59 = 0;
        int i60 = 0;
        TextView textView4 = null;
        InputFilter.AllCaps allCaps = null;
        int i61 = 0;
        DigitsKeyListener digitsKeyListener = null;
        int i62 = 0;
        while (true) {
            i43 = i47 ^ (i46 & (((i43 ^ i44) * (-19241)) >> 31));
            switch (i43) {
                case -2073227705:
                case 1997919931:
                    int i63 = i61;
                    c176254.f53845 = bundle2.getString(C1128.m3841(f21694, 195, 12, i49), "");
                    c13132 = c131323;
                    i2 = i63;
                    i = i58;
                    i6 = i50;
                    view2 = view12;
                    i33 = i52;
                    i7 = i59;
                    m69812 = C2105.m6981("ۘܰ") ^ i45;
                    i34 = ((m69812 ^ i44) * (-23109)) ^ 1036365965;
                    i35 = -458914508;
                    i47 = m69812 ^ i35;
                    i52 = i33;
                    i46 = i34;
                    i59 = i7;
                    i58 = i;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -2035024639:
                case -307404022:
                    int i64 = i58;
                    int i65 = i62;
                    C13132 c131324 = c131323;
                    boolean z = i53;
                    int i66 = i50;
                    View view13 = view12;
                    int i67 = i59;
                    TextView textView5 = (TextView) C4263.m12813(this, i65);
                    this.f21700 = textView5;
                    C2126.m7039(textView5, new ViewOnClickListenerC18869(this, 3));
                    TextView textView6 = this.f21700;
                    CharSequence m19010 = m19010(z);
                    int m69813 = (i45 - C2105.m6981("۠֫")) * (-3);
                    i47 = m69813 ^ 2017579063;
                    i62 = i65;
                    i46 = ((m69813 ^ i44) * (-1223)) ^ (-906587551);
                    sArr15 = sArr15;
                    c176254 = c176254;
                    sArr14 = sArr14;
                    i57 = i57;
                    i53 = z ? 1 : 0;
                    i52 = i52;
                    view11 = view11;
                    bundle2 = bundle;
                    textView4 = textView6;
                    charSequence3 = m19010;
                    i59 = i67;
                    i58 = i64;
                    view12 = view13;
                    i50 = i66;
                    c131323 = c131324;
                    i61 = 3;
                case -1988666338:
                case -1115697324:
                    C4159.m12565();
                    break;
                case -1945851244:
                case -862718609:
                    i = i58;
                    i2 = i61;
                    c13132 = c131323;
                    int i68 = i52;
                    i6 = i50;
                    view2 = view12;
                    i7 = i59;
                    view8 = C4263.m12813(this, C2105.m6981(C2958.m9031(f21694, 123, 3, i49)) ^ 2104108733);
                    if (C11340.f33930 >= 0) {
                        i8 = i68;
                        c17625 = c176254;
                        view3 = view10;
                        i3 = i62;
                        textView = textView4;
                        charSequence = charSequence3;
                        view = view11;
                        i4 = i53;
                        sArr = sArr14;
                        i5 = i57;
                        sArr2 = sArr15;
                        int m69814 = (i44 - C2105.m6981("ۘ᩺")) * (-57);
                        int i69 = i8;
                        i46 = ((m69814 ^ i45) * (-20487)) ^ 2108797258;
                        i47 = m69814 ^ 605942988;
                        bundle2 = bundle;
                        textView4 = textView;
                        sArr15 = sArr2;
                        i59 = i7;
                        sArr14 = sArr;
                        i57 = i5;
                        i53 = i4;
                        view11 = view;
                        view12 = view2;
                        i50 = i6;
                        i62 = i3;
                        charSequence3 = charSequence;
                        c131323 = c13132;
                        c176254 = c17625;
                        i61 = i2;
                        i52 = i69;
                        view10 = view3;
                        i58 = i;
                    } else {
                        int m69815 = (C2105.m6981("۫ܺ") + i45) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i46 = ((m69815 ^ i44) * (-17455)) ^ (-624154261);
                        i47 = m69815 ^ (-1540548932);
                        bundle2 = bundle;
                        i52 = i68;
                        i59 = i7;
                        i58 = i;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    }
                case -1910495343:
                case -1065232582:
                    i28 = i58;
                    i2 = i61;
                    c13132 = c131323;
                    int i70 = i53;
                    sArr11 = sArr14;
                    i29 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view7 = view11;
                    short[] sArr18 = sArr15;
                    m19021();
                    i30 = i70;
                    m25662 = C0630.m2566(C0237.m1483(f21694, 108, 3, i49)) ^ 2097578876;
                    if (C3746.m11369() >= 0) {
                        sArr15 = sArr18;
                        int m69816 = C2105.m6981("ۗ۟") ^ i45;
                        i47 = m69816 ^ 1536467466;
                        i46 = ((m69816 ^ i44) * (-629)) ^ 112068334;
                        view11 = view7;
                        sArr14 = sArr11;
                        i58 = i28;
                        i57 = i29;
                        charSequence3 = charSequence2;
                        i53 = i30;
                        c176254 = c176252;
                        i62 = m25662;
                        i52 = i19;
                        bundle2 = bundle;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    } else {
                        int m25667 = (C0630.m2566("᩷ᩴ") + i44) * (-9);
                        i47 = m25667 ^ (-1233506321);
                        i46 = ((m25667 ^ i45) * 16861) ^ (-1488561693);
                        sArr15 = sArr18;
                        sArr14 = sArr11;
                        i58 = i28;
                        i57 = i29;
                        i53 = i30;
                        view11 = view7;
                        i62 = m25662;
                        charSequence3 = charSequence2;
                        c176254 = c176252;
                        bundle2 = bundle;
                        i52 = i19;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    }
                case -1889927702:
                case -558849697:
                    int i71 = i58;
                    i2 = i61;
                    c13132 = c131323;
                    short[] sArr19 = sArr13;
                    int i72 = i55;
                    int i73 = i56;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view6 = view11;
                    C4159.m12564(C4263.m12813(this, C2105.m6981(C1773.m5917(sArr19, i72, i73, i49)) ^ 2126776409), new ViewOnClickListenerC20259(0, this));
                    int m25668 = C0630.m2566("֨ܽ") ^ i45;
                    i46 = ((m25668 ^ i44) * (-32059)) ^ (-1501570051);
                    i47 = m25668 ^ 872849474;
                    bundle2 = bundle;
                    sArr15 = sArr15;
                    sArr14 = sArr14;
                    i58 = i71;
                    i57 = i57;
                    i62 = i62;
                    i56 = i73;
                    sArr13 = sArr19;
                    i55 = i72;
                    i53 = 0;
                    view11 = view6;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -1548855354:
                case 1298352771:
                    i = i58;
                    c17625 = c176254;
                    i2 = i61;
                    i3 = i62;
                    charSequence = charSequence3;
                    view = view11;
                    c13132 = c131323;
                    i4 = i53;
                    sArr = sArr14;
                    i5 = i57;
                    sArr2 = sArr15;
                    i6 = i50;
                    view2 = view12;
                    i7 = i59;
                    textView = textView4;
                    i8 = 1;
                    view3 = view10;
                    C4159.m12564(view3, new ViewOnClickListenerC2641(this, i8));
                    sArr13 = f21694;
                    i55 = IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult;
                    i56 = 3;
                    if (C0483.f2088 >= 0) {
                        int m698142 = (i44 - C2105.m6981("ۘ᩺")) * (-57);
                        int i692 = i8;
                        i46 = ((m698142 ^ i45) * (-20487)) ^ 2108797258;
                        i47 = m698142 ^ 605942988;
                        bundle2 = bundle;
                        textView4 = textView;
                        sArr15 = sArr2;
                        i59 = i7;
                        sArr14 = sArr;
                        i57 = i5;
                        i53 = i4;
                        view11 = view;
                        view12 = view2;
                        i50 = i6;
                        i62 = i3;
                        charSequence3 = charSequence;
                        c131323 = c13132;
                        c176254 = c17625;
                        i61 = i2;
                        i52 = i692;
                        view10 = view3;
                        i58 = i;
                    } else {
                        int m25669 = (C0630.m2566("ۘ۬") ^ i44) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                        i46 = ((m25669 ^ i45) * 14567) ^ 1565864384;
                        i47 = m25669 ^ (-488673295);
                        bundle2 = bundle;
                        view10 = view3;
                        textView4 = textView;
                        sArr15 = sArr2;
                        i59 = i7;
                        sArr14 = sArr;
                        i58 = i;
                        i57 = i5;
                        i53 = i4;
                        view11 = view;
                        view12 = view2;
                        i50 = i6;
                        i62 = i3;
                        charSequence3 = charSequence;
                        c131323 = c13132;
                        c176254 = c17625;
                        i52 = 1;
                        i61 = i2;
                    }
                case -1543450381:
                case -1074652848:
                    C1711.m5736();
                    C4263.m12819();
                    i11 = i58;
                    i2 = i61;
                    i12 = i62;
                    c13132 = c131323;
                    i13 = i53;
                    sArr10 = sArr12;
                    i14 = i54;
                    sArr4 = sArr13;
                    i15 = i55;
                    i16 = i56;
                    sArr5 = sArr14;
                    i17 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view4 = view11;
                    sArr6 = sArr15;
                    m6981 = C0630.m2566("ۤ᩻") ^ i45;
                    sArr3 = sArr10;
                    i46 = ((m6981 ^ i44) * (-31285)) ^ (-1156560322);
                    i20 = 1241054894;
                    i54 = i14;
                    sArr15 = sArr6;
                    sArr14 = sArr5;
                    i58 = i11;
                    i57 = i17;
                    i56 = i16;
                    sArr13 = sArr4;
                    i55 = i15;
                    sArr12 = sArr3;
                    i47 = m6981 ^ i20;
                    i53 = i13;
                    view11 = view4;
                    i62 = i12;
                    bundle2 = bundle;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -1438817944:
                case -232501790:
                    if (C4263.f13799 <= 0) {
                        i11 = i58;
                        i2 = i61;
                        i12 = i62;
                        c13132 = c131323;
                        i13 = i53;
                        sArr10 = sArr12;
                        i14 = i54;
                        sArr4 = sArr13;
                        i15 = i55;
                        i16 = i56;
                        sArr5 = sArr14;
                        i17 = i57;
                        i6 = i50;
                        view2 = view12;
                        i18 = i59;
                        textView2 = textView4;
                        i19 = i52;
                        c176252 = c176254;
                        charSequence2 = charSequence3;
                        view4 = view11;
                        sArr6 = sArr15;
                        m6981 = C0630.m2566("ۤ᩻") ^ i45;
                        sArr3 = sArr10;
                        i46 = ((m6981 ^ i44) * (-31285)) ^ (-1156560322);
                        i20 = 1241054894;
                        i54 = i14;
                        sArr15 = sArr6;
                        sArr14 = sArr5;
                        i58 = i11;
                        i57 = i17;
                        i56 = i16;
                        sArr13 = sArr4;
                        i55 = i15;
                        sArr12 = sArr3;
                        i47 = m6981 ^ i20;
                        i53 = i13;
                        view11 = view4;
                        i62 = i12;
                        bundle2 = bundle;
                        charSequence3 = charSequence2;
                        c176254 = c176252;
                        i52 = i19;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    } else {
                        i = i58;
                        i10 = i61;
                        m25664 = C0630.m2566("ۙۛ") ^ i44;
                        i38 = ((m25664 ^ i45) * 21067) ^ (-334406765);
                        i39 = 1968285376;
                        i47 = m25664 ^ i39;
                        i46 = i38;
                        i61 = i10;
                        i58 = i;
                    }
                case -1408765500:
                case -827624940:
                    if (C0630.f2410 <= 0) {
                        i28 = i58;
                        i2 = i61;
                        m25662 = i62;
                        c13132 = c131323;
                        i30 = i53;
                        sArr11 = sArr14;
                        i29 = i57;
                        i6 = i50;
                        view2 = view12;
                        i18 = i59;
                        textView2 = textView4;
                        i19 = i52;
                        c176252 = c176254;
                        charSequence2 = charSequence3;
                        view7 = view11;
                        int m698162 = C2105.m6981("ۗ۟") ^ i45;
                        i47 = m698162 ^ 1536467466;
                        i46 = ((m698162 ^ i44) * (-629)) ^ 112068334;
                        view11 = view7;
                        sArr14 = sArr11;
                        i58 = i28;
                        i57 = i29;
                        charSequence3 = charSequence2;
                        i53 = i30;
                        c176254 = c176252;
                        i62 = m25662;
                        i52 = i19;
                        bundle2 = bundle;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    }
                    i11 = i58;
                    i2 = i61;
                    i12 = i62;
                    c13132 = c131323;
                    i13 = i53;
                    sArr10 = sArr12;
                    i14 = i54;
                    sArr4 = sArr13;
                    i15 = i55;
                    i16 = i56;
                    sArr5 = sArr14;
                    i17 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view4 = view11;
                    sArr6 = sArr15;
                    m6981 = C0630.m2566("ۤ᩻") ^ i45;
                    sArr3 = sArr10;
                    i46 = ((m6981 ^ i44) * (-31285)) ^ (-1156560322);
                    i20 = 1241054894;
                    i54 = i14;
                    sArr15 = sArr6;
                    sArr14 = sArr5;
                    i58 = i11;
                    i57 = i17;
                    i56 = i16;
                    sArr13 = sArr4;
                    i55 = i15;
                    sArr12 = sArr3;
                    i47 = m6981 ^ i20;
                    i53 = i13;
                    view11 = view4;
                    i62 = i12;
                    bundle2 = bundle;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -1385873937:
                case 1487695975:
                    i11 = i58;
                    i2 = i61;
                    i12 = i62;
                    c13132 = c131323;
                    i13 = i53;
                    sArr3 = sArr12;
                    i14 = i54;
                    sArr4 = sArr13;
                    i15 = i55;
                    i16 = i56;
                    sArr5 = sArr14;
                    i17 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view4 = view11;
                    sArr6 = sArr15;
                    short s = f21694[95];
                    int i74 = 69708 * s;
                    int i75 = s + 17427;
                    if ((i75 * i75) - i74 < 0) {
                        m6981 = C0630.m2566("᩻ܰ") ^ i44;
                        i46 = ((m6981 ^ i45) * (-30047)) ^ 418761542;
                        i20 = 1663445360;
                    } else {
                        m6981 = C2105.m6981("֡ۨ") ^ i45;
                        i46 = ((m6981 ^ i44) * 13097) ^ 973149304;
                        i20 = 320232554;
                    }
                    i54 = i14;
                    sArr15 = sArr6;
                    sArr14 = sArr5;
                    i58 = i11;
                    i57 = i17;
                    i56 = i16;
                    sArr13 = sArr4;
                    i55 = i15;
                    sArr12 = sArr3;
                    i47 = m6981 ^ i20;
                    i53 = i13;
                    view11 = view4;
                    i62 = i12;
                    bundle2 = bundle;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -1357661937:
                case -977659680:
                    C3683.m11222();
                    if (C1128.m3851() > 0) {
                        i11 = i58;
                        i2 = i61;
                        i12 = i62;
                        c13132 = c131323;
                        i13 = i53;
                        sArr10 = sArr12;
                        i14 = i54;
                        sArr4 = sArr13;
                        i15 = i55;
                        i16 = i56;
                        sArr5 = sArr14;
                        i17 = i57;
                        i6 = i50;
                        view2 = view12;
                        i18 = i59;
                        textView2 = textView4;
                        i19 = i52;
                        c176252 = c176254;
                        charSequence2 = charSequence3;
                        view4 = view11;
                        sArr6 = sArr15;
                        m6981 = C0630.m2566("ۤ᩻") ^ i45;
                        sArr3 = sArr10;
                        i46 = ((m6981 ^ i44) * (-31285)) ^ (-1156560322);
                        i20 = 1241054894;
                        i54 = i14;
                        sArr15 = sArr6;
                        sArr14 = sArr5;
                        i58 = i11;
                        i57 = i17;
                        i56 = i16;
                        sArr13 = sArr4;
                        i55 = i15;
                        sArr12 = sArr3;
                        i47 = m6981 ^ i20;
                        i53 = i13;
                        view11 = view4;
                        i62 = i12;
                        bundle2 = bundle;
                        charSequence3 = charSequence2;
                        c176254 = c176252;
                        i52 = i19;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    } else {
                        i = i58;
                        i2 = i61;
                        view3 = view10;
                        i3 = i62;
                        c13132 = c131323;
                        i8 = i52;
                        i4 = i53;
                        sArr = sArr14;
                        i5 = i57;
                        c17625 = c176254;
                        charSequence = charSequence3;
                        view = view11;
                        i6 = i50;
                        view2 = view12;
                        sArr2 = sArr15;
                        i7 = i59;
                        textView = textView4;
                        int m6981422 = (i44 - C2105.m6981("ۘ᩺")) * (-57);
                        int i6922 = i8;
                        i46 = ((m6981422 ^ i45) * (-20487)) ^ 2108797258;
                        i47 = m6981422 ^ 605942988;
                        bundle2 = bundle;
                        textView4 = textView;
                        sArr15 = sArr2;
                        i59 = i7;
                        sArr14 = sArr;
                        i57 = i5;
                        i53 = i4;
                        view11 = view;
                        view12 = view2;
                        i50 = i6;
                        i62 = i3;
                        charSequence3 = charSequence;
                        c131323 = c13132;
                        c176254 = c17625;
                        i61 = i2;
                        i52 = i6922;
                        view10 = view3;
                        i58 = i;
                    }
                case -1317067721:
                case 1674086794:
                    C4263.m12821(new C13907(this, (C20765) C2958.m9023(this)));
                    break;
                case -1166829245:
                case 1918573211:
                    i11 = i58;
                    i2 = i61;
                    i12 = i62;
                    c13132 = c131323;
                    i13 = i53;
                    sArr3 = sArr12;
                    i14 = i54;
                    sArr4 = sArr13;
                    i15 = i55;
                    i16 = i56;
                    sArr5 = sArr14;
                    i17 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view4 = view11;
                    sArr6 = sArr15;
                    i49 = 41501;
                    m6981 = C2105.m6981("ܽۤ") ^ i45;
                    i46 = ((m6981 ^ i44) * (-6527)) ^ 2123178172;
                    i20 = 1059340574;
                    i54 = i14;
                    sArr15 = sArr6;
                    sArr14 = sArr5;
                    i58 = i11;
                    i57 = i17;
                    i56 = i16;
                    sArr13 = sArr4;
                    i55 = i15;
                    sArr12 = sArr3;
                    i47 = m6981 ^ i20;
                    i53 = i13;
                    view11 = view4;
                    i62 = i12;
                    bundle2 = bundle;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -1135726123:
                case 1910833299:
                    i10 = i61;
                    i = i58;
                    digitsKeyListener = DigitsKeyListener.getInstance(C1005.m3502(f21694, 132, 56, i49));
                    allCaps = new InputFilter.AllCaps();
                    if (C0237.m1481() < 0) {
                        m25664 = C0630.m2566("ۚ֡") ^ i45;
                        i38 = ((m25664 ^ i44) * (-27101)) ^ (-649089744);
                        i39 = -1368230211;
                        i47 = m25664 ^ i39;
                        i46 = i38;
                        i61 = i10;
                        i58 = i;
                    }
                    m25664 = C0630.m2566("ۙۛ") ^ i44;
                    i38 = ((m25664 ^ i45) * 21067) ^ (-334406765);
                    i39 = 1968285376;
                    i47 = m25664 ^ i39;
                    i46 = i38;
                    i61 = i10;
                    i58 = i;
                case -1114330397:
                case 1159690833:
                    i40 = i61;
                    textView3 = (TextView) C4263.m12813(this, C0630.m2566(C2126.m7036(sArr16, i58, i59, i49)) ^ 2127946595);
                    sb = new StringBuilder(C0714.m2816(f21694, 191, 1, i49));
                    sArr17 = f21694;
                    i60 = 192;
                    i48 = 3;
                    if (C1773.f6144 <= 0) {
                        i10 = i40;
                        i = i58;
                        m25664 = C0630.m2566("ۙۛ") ^ i44;
                        i38 = ((m25664 ^ i45) * 21067) ^ (-334406765);
                        i39 = 1968285376;
                        i47 = m25664 ^ i39;
                        i46 = i38;
                        i61 = i10;
                        i58 = i;
                    } else {
                        m25665 = (C0630.m2566("ۜۢ") + i45) * (-41);
                        i41 = ((m25665 ^ i44) * 32565) ^ (-289309424);
                        i42 = -807025901;
                        i47 = m25665 ^ i42;
                        i46 = i41;
                        i61 = i40;
                    }
                case -924251697:
                case 1315477254:
                    i = i58;
                    int i76 = i59;
                    i10 = i61;
                    c131322 = c131323;
                    i36 = i52;
                    int i77 = i53;
                    C17648.m41314(c131322, i77, i51);
                    c176253 = c176254;
                    View m12813 = C4263.m12813(this, C2105.m6981(C3432.m10488(f21694, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 3, i49)) ^ 2104342097);
                    int m256610 = (i44 - C0630.m2566("ۗ᩺")) * (-69);
                    i37 = ((m256610 ^ i45) * (-19339)) ^ 1152750295;
                    i47 = m256610 ^ (-1484818818);
                    i53 = i77;
                    i59 = i76;
                    i50 = i50;
                    bundle2 = bundle;
                    view12 = m12813;
                    i46 = i37;
                    c131323 = c131322;
                    c176254 = c176253;
                    i52 = i36;
                    i61 = i10;
                    i58 = i;
                case -878483532:
                case 2121990020:
                    i11 = i58;
                    i2 = i61;
                    i12 = i62;
                    c13132 = c131323;
                    i13 = i53;
                    sArr3 = sArr12;
                    i14 = i54;
                    sArr4 = sArr13;
                    i15 = i55;
                    i16 = i56;
                    sArr5 = sArr14;
                    i17 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view4 = view11;
                    sArr6 = sArr15;
                    super.onCreate(bundle);
                    if (RunnableC1937.m6373()) {
                        m6981 = C0630.m2566("ܳ۟") ^ i44;
                        i46 = ((m6981 ^ i45) * (-13701)) ^ (-640305654);
                        i20 = -1010278287;
                    } else {
                        m6981 = (i44 - C0630.m2566("᩹ۤ")) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i46 = ((m6981 ^ i45) * 15485) ^ 1941856155;
                        i20 = 176772894;
                    }
                    i54 = i14;
                    sArr15 = sArr6;
                    sArr14 = sArr5;
                    i58 = i11;
                    i57 = i17;
                    i56 = i16;
                    sArr13 = sArr4;
                    i55 = i15;
                    sArr12 = sArr3;
                    i47 = m6981 ^ i20;
                    i53 = i13;
                    view11 = view4;
                    i62 = i12;
                    bundle2 = bundle;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -629828755:
                case 270704513:
                    i = i58;
                    i10 = i61;
                    editText = (EditText) C4263.m12813(this, C0630.m2566(C1773.m5917(f21694, 129, 3, i49)) ^ 2098671687);
                    m25664 = C0630.m2566("ۨۘ") ^ i44;
                    i38 = ((m25664 ^ i45) * (-25117)) ^ 1476577047;
                    i39 = 1696096515;
                    i47 = m25664 ^ i39;
                    i46 = i38;
                    i61 = i10;
                    i58 = i;
                case -547625001:
                case -505866536:
                    C3663.m11161(C0630.m2566(AbstractC2021.m6573(f21694, 126, 3, i49)) ^ 2102369119);
                    C2272.m7505(this);
                    break;
                case -409917216:
                case -155505900:
                    i11 = i58;
                    i2 = i61;
                    i12 = i62;
                    c13132 = c131323;
                    i13 = i53;
                    sArr3 = sArr12;
                    i14 = i54;
                    sArr4 = sArr13;
                    i15 = i55;
                    i16 = i56;
                    sArr5 = sArr14;
                    i17 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view4 = view11;
                    sArr6 = sArr15;
                    i49 = 47330;
                    m6981 = C2105.m6981("ܽۤ") ^ i45;
                    i46 = ((m6981 ^ i44) * (-6527)) ^ 2123178172;
                    i20 = 1059340574;
                    i54 = i14;
                    sArr15 = sArr6;
                    sArr14 = sArr5;
                    i58 = i11;
                    i57 = i17;
                    i56 = i16;
                    sArr13 = sArr4;
                    i55 = i15;
                    sArr12 = sArr3;
                    i47 = m6981 ^ i20;
                    i53 = i13;
                    view11 = view4;
                    i62 = i12;
                    bundle2 = bundle;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case -280118443:
                case 2131766387:
                    i = i58;
                    i10 = i61;
                    c131322 = c131323;
                    i36 = i52;
                    c176253 = c176254;
                    int i78 = i50;
                    View view14 = view12;
                    int i79 = i59;
                    short[] sArr20 = sArr14;
                    int i80 = i57;
                    View m128132 = C4263.m12813(this, C0630.m2566(C0714.m2816(sArr20, i80, 3, i49)) ^ 2126861256);
                    String m6435 = ViewOnClickListenerC1958.m6435(f21694, 114, 3, i49);
                    int m256611 = (i45 - C0630.m2566("ᩳ۠")) * 55;
                    i37 = ((m256611 ^ i44) * (-28691)) ^ 987139990;
                    i47 = m256611 ^ (-1164450477);
                    sArr15 = sArr15;
                    i59 = i79;
                    sArr14 = sArr20;
                    i57 = i80;
                    i53 = i53;
                    view11 = m128132;
                    view12 = view14;
                    i50 = i78;
                    bundle2 = bundle;
                    str2 = m6435;
                    i46 = i37;
                    c131323 = c131322;
                    c176254 = c176253;
                    i52 = i36;
                    i61 = i10;
                    i58 = i;
                case -214863719:
                case 435882886:
                    i40 = i61;
                    C3245.m9923(sb, C0050.m946(this, C0630.m2566(C0382.m1840(sArr17, i60, i48, i49)) ^ 2100684167));
                    RunnableC1937.m6377(textView3, C0050.m947(sb));
                    C3245.m9918(textView3, C21943.f70293);
                    editText.addTextChangedListener(new C11792(this));
                    list = this.f21695.f53844;
                    if (list == null) {
                        m25665 = (i45 - C0630.m2566("֨ۤ")) * (-51);
                        i41 = ((m25665 ^ i44) * (-17229)) ^ (-157865764);
                        i42 = 718283319;
                    } else {
                        m25665 = C0630.m2566("ܶܳ") ^ i44;
                        i41 = ((m25665 ^ i45) * (-26043)) ^ (-569366896);
                        i42 = -710775329;
                    }
                    i47 = m25665 ^ i42;
                    i46 = i41;
                    i61 = i40;
                case -109606781:
                case 1526033751:
                    InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(12);
                    i2 = i61;
                    InputFilter[] inputFilterArr = new InputFilter[i2];
                    inputFilterArr[i53] = digitsKeyListener;
                    inputFilterArr[i52] = allCaps;
                    inputFilterArr[i51] = lengthFilter;
                    editText.setFilters(inputFilterArr);
                    str = this.f21695.f53845;
                    C1047.m3601(editText, str);
                    sArr16 = f21694;
                    i58 = 188;
                    i59 = 3;
                    if (C3537.m10746() <= 0) {
                        i12 = i62;
                        textView2 = textView4;
                        c13132 = c131323;
                        i19 = i52;
                        i13 = i53;
                        sArr10 = sArr12;
                        i14 = i54;
                        sArr4 = sArr13;
                        i15 = i55;
                        i16 = i56;
                        sArr5 = sArr14;
                        i17 = i57;
                        i11 = 188;
                        c176252 = c176254;
                        charSequence2 = charSequence3;
                        view4 = view11;
                        i6 = i50;
                        view2 = view12;
                        sArr6 = sArr15;
                        i18 = 3;
                        m6981 = C0630.m2566("ۤ᩻") ^ i45;
                        sArr3 = sArr10;
                        i46 = ((m6981 ^ i44) * (-31285)) ^ (-1156560322);
                        i20 = 1241054894;
                        i54 = i14;
                        sArr15 = sArr6;
                        sArr14 = sArr5;
                        i58 = i11;
                        i57 = i17;
                        i56 = i16;
                        sArr13 = sArr4;
                        i55 = i15;
                        sArr12 = sArr3;
                        i47 = m6981 ^ i20;
                        i53 = i13;
                        view11 = view4;
                        i62 = i12;
                        bundle2 = bundle;
                        charSequence3 = charSequence2;
                        c176254 = c176252;
                        i52 = i19;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    } else {
                        int m256612 = C0630.m2566("ۤܶ") ^ i44;
                        i9 = ((m256612 ^ i45) * 28455) ^ 542974333;
                        i47 = m256612 ^ (-1672926555);
                        i46 = i9;
                        i61 = i2;
                    }
                case 46907362:
                case 756629961:
                    i = i58;
                    i2 = i61;
                    i6 = i50;
                    view2 = view12;
                    int i81 = i52;
                    int i82 = i53;
                    i7 = i59;
                    c17625 = c176254;
                    short[] sArr21 = sArr15;
                    C13132 c131325 = (C13132) C0964.m3409(this, C0630.m2566(C0422.m1955(sArr21, BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION, 3, i49)) ^ 2121873264);
                    c131325.setLayoutManager(new C21354((Context) this, i2));
                    ViewOnClickListenerC1958.m6442(c131325, new C18331(this, this));
                    C4915.m14286(c131325);
                    i51 = 2;
                    if (C0237.f1507 != 0) {
                        c13132 = c131325;
                        i8 = i81;
                        view3 = view10;
                        i3 = i62;
                        textView = textView4;
                        sArr = sArr14;
                        i5 = i57;
                        i4 = i82;
                        View view15 = view11;
                        sArr2 = sArr21;
                        charSequence = charSequence3;
                        view = view15;
                        int m69814222 = (i44 - C2105.m6981("ۘ᩺")) * (-57);
                        int i69222 = i8;
                        i46 = ((m69814222 ^ i45) * (-20487)) ^ 2108797258;
                        i47 = m69814222 ^ 605942988;
                        bundle2 = bundle;
                        textView4 = textView;
                        sArr15 = sArr2;
                        i59 = i7;
                        sArr14 = sArr;
                        i57 = i5;
                        i53 = i4;
                        view11 = view;
                        view12 = view2;
                        i50 = i6;
                        i62 = i3;
                        charSequence3 = charSequence;
                        c131323 = c13132;
                        c176254 = c17625;
                        i61 = i2;
                        i52 = i69222;
                        view10 = view3;
                        i58 = i;
                    } else {
                        int m256613 = C0630.m2566("᩸ܿ") ^ i45;
                        i9 = ((m256613 ^ i44) * (-1717)) ^ 770694989;
                        i47 = m256613 ^ (-1158910676);
                        i53 = i82;
                        sArr15 = sArr21;
                        i59 = i7;
                        c176254 = c17625;
                        bundle2 = bundle;
                        i52 = i81;
                        view12 = view2;
                        i50 = i6;
                        i58 = i;
                        c131323 = c131325;
                        i46 = i9;
                        i61 = i2;
                    }
                case 181023436:
                case 446564955:
                    i21 = i58;
                    i2 = i61;
                    i22 = i62;
                    c13132 = c131323;
                    i23 = i53;
                    sArr7 = sArr13;
                    i24 = i55;
                    i25 = i56;
                    sArr8 = sArr14;
                    i26 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view5 = view11;
                    sArr9 = sArr15;
                    C4263.m12813(this, C0630.m2566(C1047.m3603(f21694, 96, 3, i49)) ^ 2102656835);
                    sArr12 = f21694;
                    i54 = 99;
                    m2566 = (C0630.m2566("ܶۗ") + i44) * (-107);
                    i46 = ((m2566 ^ i45) * (-17331)) ^ 677879875;
                    i27 = 1398878478;
                    i47 = m2566 ^ i27;
                    bundle2 = bundle;
                    sArr15 = sArr9;
                    sArr14 = sArr8;
                    i58 = i21;
                    i57 = i26;
                    i56 = i25;
                    sArr13 = sArr7;
                    i55 = i24;
                    i53 = i23;
                    view11 = view5;
                    i62 = i22;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case 217319236:
                case 500568858:
                    m19017();
                    break;
                case 610954603:
                case 854516403:
                    i28 = i58;
                    i2 = i61;
                    view2 = view12;
                    c13132 = c131323;
                    int i83 = i52;
                    int i84 = i53;
                    i18 = i59;
                    c176252 = c176254;
                    int m69817 = C2105.m6981(str2) ^ 2129667345;
                    View findViewById = findViewById(m69817);
                    i6 = m69817;
                    View view16 = view11;
                    C17648.m41310(findViewById, new C4736(i84, view16));
                    sArr15 = f21694;
                    if (C1773.f6144 <= 0) {
                        textView2 = textView4;
                        charSequence2 = charSequence3;
                        sArr11 = sArr14;
                        i29 = i57;
                        view7 = view16;
                        i19 = i83;
                        int i85 = i62;
                        i30 = i84;
                        m25662 = i85;
                        int m6981622 = C2105.m6981("ۗ۟") ^ i45;
                        i47 = m6981622 ^ 1536467466;
                        i46 = ((m6981622 ^ i44) * (-629)) ^ 112068334;
                        view11 = view7;
                        sArr14 = sArr11;
                        i58 = i28;
                        i57 = i29;
                        charSequence3 = charSequence2;
                        i53 = i30;
                        c176254 = c176252;
                        i62 = m25662;
                        i52 = i19;
                        bundle2 = bundle;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    } else {
                        int m69818 = C2105.m6981("ۢܿ") ^ i44;
                        i47 = m69818 ^ (-610406567);
                        i53 = i84;
                        view11 = view16;
                        i46 = ((m69818 ^ i45) * (-29033)) ^ (-1674144879);
                        i59 = i18;
                        c176254 = c176252;
                        bundle2 = bundle;
                        i52 = i83;
                        view12 = view2;
                        i50 = i6;
                        i58 = i28;
                        c131323 = c13132;
                        i61 = i2;
                    }
                case 671324944:
                case 1512741549:
                    int i86 = i58;
                    i2 = i61;
                    View view17 = view11;
                    c13132 = c131323;
                    int i87 = i52;
                    int i88 = i53;
                    short[] sArr22 = sArr15;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    RunnableC1937.m6377(textView2, charSequence2);
                    view6 = view17;
                    this.f21698 = (C23196.m51456() ? 1 : 0) ^ i87;
                    C20988.m47796(this);
                    sArr14 = f21694;
                    i57 = UMErrorCode.E_UM_BE_CREATE_FAILED;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        m25663 = C0630.m2566("᩶۟") ^ i44;
                        i19 = i87;
                        i31 = ((m25663 ^ i45) * (-25877)) ^ 1825323516;
                        i32 = 1936250471;
                    } else {
                        i19 = i87;
                        m25663 = (C0630.m2566("᩵ۗ") ^ i44) * 89;
                        i31 = ((m25663 ^ i45) * 20143) ^ 61091041;
                        i32 = -237205513;
                    }
                    i47 = m25663 ^ i32;
                    i53 = i88;
                    i46 = i31;
                    sArr15 = sArr22;
                    i58 = i86;
                    bundle2 = bundle;
                    view11 = view6;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                case 963886392:
                case 2064781469:
                    i11 = i58;
                    i2 = i61;
                    i12 = i62;
                    c13132 = c131323;
                    i13 = i53;
                    sArr4 = sArr13;
                    i15 = i55;
                    i16 = i56;
                    sArr5 = sArr14;
                    i17 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view4 = view11;
                    sArr6 = sArr15;
                    sArr10 = sArr12;
                    i14 = i54;
                    view9 = C4263.m12813(this, C2105.m6981(C4159.m12578(sArr10, i14, 3, i49)) ^ 2129996947);
                    View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.֡ܶ᩷
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view18) {
                            int i89 = -1915491923;
                            int i90 = C1420.f5096;
                            int i91 = C0483.f2088;
                            int m256614 = (C0630.m2566("᩵۫") ^ i91) * 29;
                            int i92 = ((m256614 ^ i90) * (-14383)) ^ 305965544;
                            int i93 = 1889497455;
                            while (true) {
                                i89 = ((((i89 ^ i90) * 2683) >> 31) & i92) ^ (m256614 ^ i93);
                                switch (i89) {
                                    case -2081046643:
                                    case 1856242778:
                                        if (C0483.f2088 >= 0) {
                                            m256614 = (C2105.m6981("۟ۡ") + i90) * 95;
                                            i92 = ((m256614 ^ i91) * (-7447)) ^ (-340516983);
                                            i93 = 783210458;
                                        } else {
                                            m256614 = (C2105.m6981("ۙܳ") + i91) * 43;
                                            i92 = ((m256614 ^ i90) * 9433) ^ (-695771074);
                                            i93 = -1494666910;
                                        }
                                    case -1963932656:
                                    case -570589539:
                                        if (ViewOnClickListenerC1958.f6529 <= 0) {
                                            m256614 = C0630.m2566("ۛۧ") ^ i91;
                                            i92 = ((m256614 ^ i90) * 32117) ^ 116681269;
                                            i93 = -867719764;
                                        } else {
                                            m256614 = C2105.m6981("۬֫") ^ i90;
                                            i92 = ((m256614 ^ i91) * (-3235)) ^ 759577777;
                                            i93 = -717521859;
                                        }
                                    case -1762559082:
                                    case -1674943185:
                                        if (C2958.f9394 >= 0) {
                                            m256614 = (C2105.m6981("۟ۡ") + i90) * 95;
                                            i92 = ((m256614 ^ i91) * (-7447)) ^ (-340516983);
                                            i93 = 783210458;
                                        } else {
                                            m256614 = (i91 - C0630.m2566("᩺᩵")) * (-51);
                                            i92 = ((m256614 ^ i90) * 18981) ^ 1863343278;
                                            i93 = -354621153;
                                        }
                                    case -1309198109:
                                    case 909322766:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m256614 = (C2105.m6981("۟ۡ") + i90) * 95;
                                            i92 = ((m256614 ^ i91) * (-7447)) ^ (-340516983);
                                            i93 = 783210458;
                                        } else {
                                            m256614 = (i90 - C2105.m6981("ᩴ᩹")) * (-47);
                                            i92 = ((m256614 ^ i91) * (-167)) ^ 587582585;
                                            i93 = -913846548;
                                        }
                                    case -1304208266:
                                    case 1205523667:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m256614 = (C0630.m2566("ܿ᩶") + i90) * (-83);
                                            i92 = ((m256614 ^ i91) * (-9749)) ^ 1836831024;
                                            i93 = 1191392727;
                                        } else {
                                            m256614 = C2105.m6981("ۗܿ") ^ i91;
                                            i92 = ((m256614 ^ i90) * 24349) ^ 2137607939;
                                            i93 = 363213432;
                                        }
                                    case -1282601663:
                                    case 325331139:
                                        if (C2126.f7087) {
                                            m256614 = (C2105.m6981("۟ۡ") + i90) * 95;
                                            i92 = ((m256614 ^ i91) * (-7447)) ^ (-340516983);
                                            i93 = 783210458;
                                        } else {
                                            m256614 = (i91 - C0630.m2566("֫᩵")) * (-123);
                                            i92 = ((m256614 ^ i90) * 2991) ^ (-2086098707);
                                            i93 = 233458444;
                                        }
                                    case -978380965:
                                    case -947092047:
                                        RunnableC1108.m3790();
                                        C2520.m8026();
                                        m256614 = (C2105.m6981("۟ۡ") + i90) * 95;
                                        i92 = ((m256614 ^ i91) * (-7447)) ^ (-340516983);
                                        i93 = 783210458;
                                    case -897204429:
                                    case -397973389:
                                        if (C0422.f1886 <= 0) {
                                            m256614 = C0630.m2566("ۛۧ") ^ i91;
                                            i92 = ((m256614 ^ i90) * 32117) ^ 116681269;
                                            i93 = -867719764;
                                        } else {
                                            m256614 = C0630.m2566("᩷۠") ^ i90;
                                            i92 = ((m256614 ^ i91) * 27243) ^ 679731485;
                                            i93 = -1069785264;
                                        }
                                    case -755010444:
                                    case 32141166:
                                        if (C0714.f2697 >= 0) {
                                            m256614 = (C0630.m2566("ܿ᩶") + i90) * (-83);
                                            i92 = ((m256614 ^ i91) * (-9749)) ^ 1836831024;
                                            i93 = 1191392727;
                                        } else {
                                            m256614 = (i90 - C0630.m2566("ۧ۠")) * (-115);
                                            i92 = ((m256614 ^ i91) * (-8999)) ^ 595089562;
                                            i93 = -1750998787;
                                        }
                                    case -715637500:
                                    case 467890434:
                                        int i94 = ViewOnClickListenerC7042.f21692;
                                        if (C3019.f9544 >= 0) {
                                            m256614 = (C0630.m2566("ᩳᩴ") ^ i90) * 81;
                                            i92 = ((m256614 ^ i91) * 29969) ^ (-1657464808);
                                            i93 = -2041461578;
                                        } else {
                                            m256614 = (C0630.m2566("֨֡") ^ i91) * (-7);
                                            i92 = ((m256614 ^ i90) * 11033) ^ 914426669;
                                            i93 = 118586461;
                                        }
                                    case -609960212:
                                    case 1139430232:
                                        if (AbstractC2021.m6574()) {
                                            m256614 = (C2105.m6981("۟ۡ") + i90) * 95;
                                            i92 = ((m256614 ^ i91) * (-7447)) ^ (-340516983);
                                            i93 = 783210458;
                                        } else {
                                            m256614 = C0630.m2566("ۛۧ") ^ i91;
                                            i92 = ((m256614 ^ i90) * 32117) ^ 116681269;
                                            i93 = -867719764;
                                        }
                                    case -518670473:
                                    case 444281044:
                                        C2272.m7505(ViewOnClickListenerC7042.this);
                                        break;
                                    case -191252941:
                                    case 1843528909:
                                        if (C1005.f3721) {
                                            m256614 = (C0630.m2566("ܿ᩶") + i90) * (-83);
                                            i92 = ((m256614 ^ i91) * (-9749)) ^ 1836831024;
                                            i93 = 1191392727;
                                        } else {
                                            m256614 = (i91 - C0630.m2566("֫᩵")) * (-123);
                                            i92 = ((m256614 ^ i90) * 2991) ^ (-2086098707);
                                            i93 = 233458444;
                                        }
                                    case 104317712:
                                    case 1227941480:
                                        C0798.m2998();
                                        break;
                                    case 1715621687:
                                    case 1792841653:
                                        if (C7811.m20844() != 0) {
                                            m256614 = (C0630.m2566("ܿ᩶") + i90) * (-83);
                                            i92 = ((m256614 ^ i91) * (-9749)) ^ 1836831024;
                                            i93 = 1191392727;
                                        } else {
                                            m256614 = (C2105.m6981("ܿۛ") ^ i90) * 31;
                                            i92 = ((m256614 ^ i91) * (-11307)) ^ 1947832193;
                                            i93 = 1336878441;
                                        }
                                    default:
                                        if (RunnableC1937.f6483 >= 0) {
                                            m256614 = C0630.m2566("ۛۧ") ^ i91;
                                            i92 = ((m256614 ^ i90) * 32117) ^ 116681269;
                                            i93 = -867719764;
                                        } else {
                                            m256614 = C0630.m2566("᩶֡") ^ i91;
                                            i92 = ((m256614 ^ i90) * (-745)) ^ (-1947346882);
                                            i93 = 232725404;
                                        }
                                }
                                return;
                            }
                        }
                    };
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        onClickListener = onClickListener2;
                        m6981 = C0630.m2566("ۤ᩻") ^ i45;
                        sArr3 = sArr10;
                        i46 = ((m6981 ^ i44) * (-31285)) ^ (-1156560322);
                        i20 = 1241054894;
                        i54 = i14;
                        sArr15 = sArr6;
                        sArr14 = sArr5;
                        i58 = i11;
                        i57 = i17;
                        i56 = i16;
                        sArr13 = sArr4;
                        i55 = i15;
                        sArr12 = sArr3;
                        i47 = m6981 ^ i20;
                        i53 = i13;
                        view11 = view4;
                        i62 = i12;
                        bundle2 = bundle;
                        charSequence3 = charSequence2;
                        c176254 = c176252;
                        i52 = i19;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    } else {
                        int m256614 = (C0630.m2566("ۚ᩵") ^ i45) * (-23);
                        onClickListener = onClickListener2;
                        i54 = i14;
                        sArr15 = sArr6;
                        sArr14 = sArr5;
                        i58 = i11;
                        i57 = i17;
                        i56 = i16;
                        sArr13 = sArr4;
                        i55 = i15;
                        sArr12 = sArr10;
                        i47 = m256614 ^ (-922055293);
                        i53 = i13;
                        view11 = view4;
                        i62 = i12;
                        i46 = ((m256614 ^ i44) * (-24651)) ^ (-1720527460);
                        charSequence3 = charSequence2;
                        c176254 = c176252;
                        bundle2 = bundle;
                        i52 = i19;
                        textView4 = textView2;
                        i59 = i18;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    }
                case 1415800160:
                case 1590023441:
                    i = i58;
                    i2 = i61;
                    View view18 = view12;
                    c13132 = c131323;
                    i33 = i52;
                    i7 = i59;
                    final RunnableC3737 runnableC3737 = new RunnableC3737(c13132, view18, view8, i33);
                    int i89 = i50;
                    i6 = i89;
                    view2 = view18;
                    C0964.m3409(this, i89).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.ۗܶ᩷
                        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                        public final void onGlobalLayout() {
                            RunnableC3737.this.run();
                        }
                    });
                    c13132.addOnScrollListener(new C6147(runnableC3737));
                    c176254 = (C17625) new C4741(this).m13885(C17625.class);
                    this.f21695 = c176254;
                    if (bundle2 != null) {
                        m69812 = (C2105.m6981("᩹ۧ") + i44) * 127;
                        i34 = ((m69812 ^ i45) * (-14387)) ^ (-1031059951);
                        i35 = 1474763787;
                        i47 = m69812 ^ i35;
                        i52 = i33;
                        i46 = i34;
                        i59 = i7;
                        i58 = i;
                        view12 = view2;
                        i50 = i6;
                        c131323 = c13132;
                        i61 = i2;
                    }
                    m69812 = C2105.m6981("ۘܰ") ^ i45;
                    i34 = ((m69812 ^ i44) * (-23109)) ^ 1036365965;
                    i35 = -458914508;
                    i47 = m69812 ^ i35;
                    i52 = i33;
                    i46 = i34;
                    i59 = i7;
                    i58 = i;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
                default:
                    i21 = i58;
                    i2 = i61;
                    i22 = i62;
                    c13132 = c131323;
                    i23 = i53;
                    sArr7 = sArr13;
                    i24 = i55;
                    i25 = i56;
                    sArr8 = sArr14;
                    i26 = i57;
                    i6 = i50;
                    view2 = view12;
                    i18 = i59;
                    textView2 = textView4;
                    i19 = i52;
                    c176252 = c176254;
                    charSequence2 = charSequence3;
                    view5 = view11;
                    sArr9 = sArr15;
                    C4159.m12564(view9, onClickListener);
                    view10 = C0964.m3409(this, C0630.m2566(C3537.m10748(f21694, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i49)) ^ 2099834944);
                    m2566 = C2105.m6981("᩺᩺") ^ i45;
                    i46 = ((m2566 ^ i44) * 8177) ^ 2144216222;
                    i27 = -1175993298;
                    i47 = m2566 ^ i27;
                    bundle2 = bundle;
                    sArr15 = sArr9;
                    sArr14 = sArr8;
                    i58 = i21;
                    i57 = i26;
                    i56 = i25;
                    sArr13 = sArr7;
                    i55 = i24;
                    i53 = i23;
                    view11 = view5;
                    i62 = i22;
                    charSequence3 = charSequence2;
                    c176254 = c176252;
                    i52 = i19;
                    textView4 = textView2;
                    i59 = i18;
                    view12 = view2;
                    i50 = i6;
                    c131323 = c13132;
                    i61 = i2;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (l.ServiceConnectionC3453.f10921 < 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        r1 = l.C0630.m2566("᩶֡") ^ r20;
        r9 = ((r1 ^ r21) * 17257) ^ 1766943545;
        r23 = 719324167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (l.C2167.m7155() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        if (l.RunnableC0588.f2309 < 0) goto L7;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19016(l.ViewOnClickListenerC7042 r25) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.m19016(l.ۜ᩸᩷):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x009a, code lost:
    
        if (l.C3663.f11553 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x008c, code lost:
    
        if (l.C7106.f21815 == 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0095, code lost:
    
        if (l.C2126.f7087 == false) goto L21;
     */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r26) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0113, code lost:
    
        if (l.C1420.m4913() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e4, code lost:
    
        if (l.C0237.f1507 != 0) goto L33;
     */
    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19025() {
        /*
            Method dump skipped, instructions count: 2338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.m19025():void");
    }

    static {
        int i = 0;
        int[] iArr = null;
        int i2 = -693102926;
        int i3 = C4616.f14690;
        int i4 = C11340.f33930;
        int m2566 = C0630.m2566("ܶ᩶") ^ i3;
        int i5 = ((m2566 ^ i4) * (-15411)) ^ 838407631;
        int i6 = -1544986423;
        while (true) {
            i2 = ((((i2 ^ i4) * 13525) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -1954149709:
                case -1171226194:
                    if (C4263.f13799 <= 0) {
                        m2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((m2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        m2566 = C0630.m2566("ᩴ֨") ^ i4;
                        i5 = ((m2566 ^ i3) * 14005) ^ 126788045;
                        i6 = -1977874438;
                    }
                case -1862775359:
                case -1419544011:
                    if (C0050.m940() > 0) {
                        m2566 = (C0630.m2566("ۢۘ") ^ i4) * (-109);
                        i5 = ((m2566 ^ i3) * 11005) ^ (-939986402);
                        i6 = -1244578088;
                    } else {
                        m2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((m2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    }
                case -1544208975:
                case -208448103:
                    if (C1916.f6442) {
                        m2566 = (C0630.m2566("᩸᩸") + i3) * (-31);
                        i5 = ((m2566 ^ i4) * 21635) ^ 269004265;
                        i6 = -983597197;
                    } else {
                        m2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((m2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    }
                case -1527114410:
                case 1482874629:
                    if (AbstractC2021.m6574()) {
                        m2566 = C0630.m2566("۬ۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-23741)) ^ (-2043894785);
                        i6 = 160882884;
                    } else {
                        m2566 = (C0630.m2566("ۨۢ") + i4) * (-113);
                        i5 = ((m2566 ^ i3) * 24431) ^ 1446496606;
                        i6 = -84534885;
                    }
                case -1387632611:
                case -75921191:
                    if (C21923.f70183 != 0) {
                        m2566 = (i3 - C2105.m6981("᩻᩶")) * (-119);
                        i5 = ((m2566 ^ i4) * (-12331)) ^ 579670335;
                        i6 = 1390135031;
                    } else {
                        m2566 = C0630.m2566("ۚܿ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-18637)) ^ 210156776;
                        i6 = -1941429348;
                    }
                case -1347405398:
                case 1125971810:
                    int[] iArr2 = new int[i];
                    // fill-array-data instruction
                    iArr2[0] = 2131888995;
                    iArr2[1] = 2131889001;
                    iArr2[2] = 2131889002;
                    iArr2[3] = 2131889003;
                    iArr2[4] = 2131889004;
                    iArr2[5] = 2131889005;
                    iArr2[6] = 2131889006;
                    iArr2[7] = 2131889007;
                    iArr2[8] = 2131889008;
                    iArr2[9] = 2131888996;
                    iArr2[10] = 2131888997;
                    iArr2[11] = 2131888998;
                    iArr2[12] = 2131888999;
                    iArr2[13] = 2131889000;
                    iArr2[14] = 2131889009;
                    f21691 = iArr2;
                    return;
                case -962547532:
                case -611820916:
                    f21693 = iArr;
                    if (C7811.f24123 >= 0) {
                        m2566 = (i3 - C2105.m6981("᩻᩶")) * (-119);
                        i5 = ((m2566 ^ i4) * (-12331)) ^ 579670335;
                        i6 = 1390135031;
                    } else {
                        m2566 = C2105.m6981("᩸ܰ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-19395)) ^ (-673131268);
                        i6 = 1705251354;
                    }
                case -610022961:
                case 63218837:
                    C4616.m13552();
                    throw new RuntimeException();
                case -357807919:
                case -221669906:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((m2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        m2566 = C2105.m6981("ܶۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 28161) ^ (-1773993278);
                        i6 = -672242227;
                    }
                case 113245440:
                case 1391369978:
                    RunnableC1108.m3790();
                    if (C4159.f13567) {
                        m2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((m2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    } else {
                        m2566 = C2105.m6981("ܶۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 28161) ^ (-1773993278);
                        i6 = -672242227;
                    }
                case 228338172:
                case 683959675:
                    if (C7106.m19120() <= 0) {
                        m2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((m2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        m2566 = (C2105.m6981("ۗܿ") ^ i3) * 9;
                        i5 = ((m2566 ^ i4) * (-4951)) ^ (-134340384);
                        i6 = -865371127;
                    }
                case 269103870:
                case 476193382:
                    // fill-array-data instruction
                    iArr[0] = 2131231440;
                    iArr[1] = 2131231446;
                    iArr[2] = 2131231447;
                    iArr[3] = 2131231448;
                    iArr[4] = 2131231449;
                    iArr[5] = 2131231450;
                    iArr[6] = 2131231451;
                    iArr[7] = 2131231452;
                    iArr[8] = 2131231453;
                    iArr[9] = 2131231441;
                    iArr[10] = 2131231442;
                    iArr[11] = 2131231443;
                    iArr[12] = 2131231444;
                    iArr[13] = 2131231445;
                    iArr[14] = 2131231454;
                    if (C2958.f9394 >= 0) {
                        m2566 = (i3 - C0630.m2566("֨ᩴ")) * 33;
                        i5 = ((m2566 ^ i4) * (-31735)) ^ (-2008773705);
                        i6 = 215230106;
                    } else {
                        m2566 = C0630.m2566("۠ۛ") ^ i4;
                        i5 = ((m2566 ^ i3) * 7219) ^ 797598045;
                        i6 = 311053427;
                    }
                case 348251737:
                case 528718877:
                    if (C22628.f73083 <= 0) {
                        m2566 = C2105.m6981("ܶۚ") ^ i4;
                        i5 = ((m2566 ^ i3) * 28161) ^ (-1773993278);
                        i6 = -672242227;
                    } else {
                        m2566 = C0630.m2566("۬ۡ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-23741)) ^ (-2043894785);
                        i6 = 160882884;
                    }
                case 791536497:
                case 1756858965:
                    C1005.m3501();
                    m2566 = C2105.m6981("ܶۚ") ^ i4;
                    i5 = ((m2566 ^ i3) * 28161) ^ (-1773993278);
                    i6 = -672242227;
                case 803904087:
                case 1580538226:
                    if (C2520.m8026()) {
                        m2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((m2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        m2566 = C0630.m2566("᩻֨") ^ i3;
                        i5 = ((m2566 ^ i4) * (-25073)) ^ 579894552;
                        i6 = 723832241;
                    }
                default:
                    i = 15;
                    iArr = new int[15];
                    if (C11340.f33930 >= 0) {
                        m2566 = (C0630.m2566("᩻ܺ") ^ i4) * (-31);
                        i5 = ((m2566 ^ i3) * 18885) ^ (-1603494133);
                        i6 = 1539592346;
                    } else {
                        m2566 = C2105.m6981("ۘۜ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-13563)) ^ (-424954340);
                        i6 = -1947111975;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x006c, code lost:
    
        if (l.C1504.m5179() == false) goto L13;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19013(l.ViewOnClickListenerC7042 r19, final android.widget.PopupWindow r20, int r21, java.lang.String r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC7042.m19013(l.ۜ᩸᩷, android.widget.PopupWindow, int, java.lang.String, android.view.View):void");
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m19026() {
        int m6981;
        int i;
        int i2;
        int m69812;
        int i3;
        int m2566;
        int i4;
        final ViewOnClickListenerC7042 viewOnClickListenerC7042 = this;
        int i5 = ViewOnClickListenerC1958.f6529;
        int i6 = C2520.f8000;
        int m69813 = C2105.m6981("ᩳ֫") ^ i6;
        int i7 = ((m69813 ^ i5) * (-13063)) ^ 1626658493;
        TextView textView = null;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i8 = m69813 ^ (-32205908);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        DialogInterface.OnClickListener onClickListener = null;
        int i12 = 0;
        int i13 = -1395575252;
        short s = 0;
        int i14 = 0;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        short[] sArr3 = null;
        C19258 c19258 = null;
        int i15 = 0;
        while (true) {
            i13 = i8 ^ (i7 & (((i13 ^ i5) * 27269) >> 31));
            switch (i13) {
                case -2072343491:
                case -946038485:
                    C4117.m12364();
                    C1773.m5908();
                    m69812 = C2105.m6981("ۨ֫") ^ i6;
                    i7 = ((m69812 ^ i5) * (-28761)) ^ (-966518387);
                    i3 = -409520538;
                    i8 = m69812 ^ i3;
                    viewOnClickListenerC7042 = this;
                case -1928606488:
                case 824040451:
                    str = C1420.m4902(sArr3, 295, 3, i12);
                    if (C1005.m3501()) {
                        m6981 = (i5 - C0630.m2566("ۜᩳ")) * (-95);
                        i = ((m6981 ^ i6) * (-29941)) ^ (-2121520362);
                        i2 = 421059926;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = (i5 - C0630.m2566("۟ܰ")) * 5;
                    i = ((m6981 ^ i6) * (-17615)) ^ (-1623159295);
                    i2 = 1644829929;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -1925387543:
                case -591713494:
                    i12 = 35043;
                    m6981 = (C2105.m6981("۠᩸") + i5) * (-29);
                    i = ((m6981 ^ i6) * (-15995)) ^ 195802446;
                    i2 = -1328978426;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -1828253186:
                case 1974690400:
                    s = f21694[291];
                    i14 = s * s;
                    if (RunnableC3474.m10630()) {
                        m69812 = (i5 - C2105.m6981("ۢ᩻")) * 5;
                        i7 = ((m69812 ^ i6) * 29359) ^ 1237595013;
                        i3 = -989028905;
                        i8 = m69812 ^ i3;
                        viewOnClickListenerC7042 = this;
                    }
                    m69812 = C2105.m6981("ۨ֫") ^ i6;
                    i7 = ((m69812 ^ i5) * (-28761)) ^ (-966518387);
                    i3 = -409520538;
                    i8 = m69812 ^ i3;
                    viewOnClickListenerC7042 = this;
                case -1810876228:
                case 1803088896:
                    C0382.m1849(c19258, 2116889894 ^ i10);
                    sArr3 = f21694;
                    if (C1047.f3863 < 0) {
                        m6981 = C0630.m2566("ۡ۟") ^ i6;
                        i = ((m6981 ^ i5) * (-29871)) ^ 173254246;
                        i2 = 112187554;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = (i5 - C0630.m2566("۟ܰ")) * 5;
                    i = ((m6981 ^ i6) * (-17615)) ^ (-1623159295);
                    i2 = 1644829929;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -1757541472:
                case -74362206:
                    InterfaceC9103 m38086 = AbstractC16157.m38086(dialogInterfaceC0206.m1432());
                    if (C4616.f14690 > 0) {
                        m38086.mo8505(new C16919(true).m46968());
                        m38086.build().mo38090(textView, C0422.m1959(RunnableC0588.m2442(textView)));
                        break;
                    }
                    int m69814 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                    i8 = m69814 ^ (-532531602);
                    i7 = ((m69814 ^ i5) * (-20847)) ^ (-1796769879);
                    onClickListener = null;
                case -1399604537:
                case 2146208111:
                    C1294.m4380(c19258, C0630.m2566(C21923.m49334(sArr2, i9, 3, i12)) ^ 2124621458, onClickListener);
                    if (viewOnClickListenerC7042.f21698) {
                        m6981 = (C0630.m2566("ۙۖ") + i6) * (-107);
                        i = ((m6981 ^ i5) * 1873) ^ 1808149861;
                        i2 = -1947525730;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C2105.m6981("᩸ܽ") ^ i6;
                    i = ((m6981 ^ i5) * (-3643)) ^ 1179516903;
                    i2 = -876464040;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -962071305:
                case -756267300:
                    if (C2520.f8000 < 0) {
                        m6981 = C0630.m2566("ۢܶ") ^ i5;
                        i = ((m6981 ^ i6) * 17957) ^ 719718565;
                        i2 = -799411042;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    } else {
                        int m698142 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                        i8 = m698142 ^ (-532531602);
                        i7 = ((m698142 ^ i5) * (-20847)) ^ (-1796769879);
                        onClickListener = null;
                    }
                case -955111541:
                case 133145720:
                    int i16 = DialogInterfaceC0206.f1451;
                    c19258 = new C19258(viewOnClickListenerC7042);
                    sArr = f21694;
                    i15 = 292;
                    if (C1773.f6144 > 0) {
                        m6981 = C0630.m2566("֫ܰ") ^ i6;
                        i = ((m6981 ^ i5) * (-23519)) ^ 230059225;
                        i2 = 1895188818;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = (i5 - C0630.m2566("۟ܰ")) * 5;
                    i = ((m6981 ^ i6) * (-17615)) ^ (-1623159295);
                    i2 = 1644829929;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -747152192:
                case 901707222:
                    i12 = 29937;
                    m6981 = (C2105.m6981("۠᩸") + i5) * (-29);
                    i = ((m6981 ^ i6) * (-15995)) ^ 195802446;
                    i2 = -1328978426;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -570026890:
                case 383661212:
                    C1916.m6295(c19258, C2105.m6981(str) ^ 2098513467);
                    if (C7811.m20844() != 0) {
                        int m6981422 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                        i8 = m6981422 ^ (-532531602);
                        i7 = ((m6981422 ^ i5) * (-20847)) ^ (-1796769879);
                        onClickListener = null;
                    } else {
                        onClickListener = new DialogInterface.OnClickListener() { // from class: l.۫ܶ᩷
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i17) {
                                int i18 = -1664506326;
                                int i19 = C2167.f7158;
                                int i20 = RunnableC0588.f2309;
                                int m69815 = (i20 - C2105.m6981("᩹ۜ")) * 109;
                                int i21 = ((m69815 ^ i19) * 5305) ^ (-1673425014);
                                int i22 = -639711278;
                                while (true) {
                                    i18 = ((((i18 ^ i19) * 15529) >> 31) & i21) ^ (m69815 ^ i22);
                                    switch (i18) {
                                        case -2015393597:
                                        case 972935087:
                                            C1504.m5179();
                                            C4263.m12819();
                                            break;
                                        case -1870851083:
                                        case 1142717554:
                                            if (C3683.f11629 >= 0) {
                                                m69815 = C2105.m6981("֡ܶ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-1131)) ^ (-26774656);
                                                i22 = -525601220;
                                            } else {
                                                m69815 = (i19 - C0630.m2566("᩶ܰ")) * 45;
                                                i21 = ((m69815 ^ i20) * 1639) ^ (-439536306);
                                                i22 = 1567040346;
                                            }
                                        case -1818639721:
                                        case 1998756030:
                                            if (C4616.m13552() != 0) {
                                                m69815 = C2105.m6981("֡ܶ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-1131)) ^ (-26774656);
                                                i22 = -525601220;
                                            } else {
                                                m69815 = C2105.m6981("ۢۨ") ^ i20;
                                                i21 = ((m69815 ^ i19) * (-17721)) ^ (-1230827681);
                                                i22 = 2087585526;
                                            }
                                        case -1681447511:
                                        case -443210465:
                                            if (C11340.f33930 < 0) {
                                                m69815 = C2105.m6981("֡ܶ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-1131)) ^ (-26774656);
                                                i22 = -525601220;
                                            } else {
                                                m69815 = (C0630.m2566("᩵ۚ") ^ i20) * 27;
                                                i21 = ((m69815 ^ i19) * (-5337)) ^ 1705749701;
                                                i22 = 1428938237;
                                            }
                                        case -1532117609:
                                        case 1907986893:
                                            ViewOnClickListenerC1958.m6429();
                                            if (C2958.m9034() > 0) {
                                                m69815 = C2105.m6981("֡ܶ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-1131)) ^ (-26774656);
                                                i22 = -525601220;
                                            } else {
                                                m69815 = C0630.m2566("᩺ۨ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-10593)) ^ 1892888592;
                                                i22 = -1367920842;
                                            }
                                        case -1280490869:
                                        case 548723563:
                                            if (C3683.f11629 >= 0) {
                                                m69815 = C0630.m2566("֫ۖ") ^ i19;
                                                i21 = ((m69815 ^ i20) * 6719) ^ 1171358500;
                                                i22 = -1460688032;
                                            } else {
                                                m69815 = C0630.m2566("۟۟") ^ i20;
                                                i21 = ((m69815 ^ i19) * (-23605)) ^ (-404289084);
                                                i22 = -572041155;
                                            }
                                        case -727137244:
                                        case -91577894:
                                            if (C1711.f5919) {
                                                m69815 = C0630.m2566("֫ۖ") ^ i19;
                                                i21 = ((m69815 ^ i20) * 6719) ^ 1171358500;
                                                i22 = -1460688032;
                                            } else {
                                                m69815 = C0630.m2566("ܽ᩻") ^ i19;
                                                i21 = ((m69815 ^ i20) * 18041) ^ 1713506515;
                                                i22 = -1325155321;
                                            }
                                        case -652465032:
                                        case 178980545:
                                            if (C21923.m49329()) {
                                                m69815 = C0630.m2566("֫ۖ") ^ i19;
                                                i21 = ((m69815 ^ i20) * 6719) ^ 1171358500;
                                                i22 = -1460688032;
                                            } else {
                                                m69815 = (C0630.m2566("ۢܳ") + i20) * (-77);
                                                i21 = ((m69815 ^ i19) * (-24885)) ^ (-73869572);
                                                i22 = 1900677528;
                                            }
                                        case -541341352:
                                        case -233115194:
                                            ViewOnClickListenerC7042.m19020(ViewOnClickListenerC7042.this);
                                            break;
                                        case -419135570:
                                        case 1463107950:
                                            if (C11340.f33930 >= 0) {
                                                m69815 = C2105.m6981("֡ܶ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-1131)) ^ (-26774656);
                                                i22 = -525601220;
                                            } else {
                                                m69815 = (C0630.m2566("ۡۜ") ^ i20) * 13;
                                                i21 = ((m69815 ^ i19) * (-6841)) ^ 621851473;
                                                i22 = -2123644409;
                                            }
                                        case -263917572:
                                        case 1353388579:
                                            if (C2272.f7362) {
                                                m69815 = C0630.m2566("᩺ۨ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-10593)) ^ 1892888592;
                                                i22 = -1367920842;
                                            } else {
                                                m69815 = C0630.m2566("ۙۖ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-2691)) ^ 852633759;
                                                i22 = -1051168168;
                                            }
                                        case -225116575:
                                        case 1972195112:
                                            if (RunnableC3474.f10992 <= 0) {
                                                m69815 = C0630.m2566("᩺ۨ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-10593)) ^ 1892888592;
                                                i22 = -1367920842;
                                            } else {
                                                m69815 = (C2105.m6981("ᩳۚ") + i19) * 109;
                                                i21 = ((m69815 ^ i20) * 7945) ^ (-477684785);
                                                i22 = -2121092056;
                                            }
                                        case 199521843:
                                        case 1750452991:
                                            if (C0483.f2088 >= 0) {
                                                m69815 = C0630.m2566("֫ۖ") ^ i19;
                                                i21 = ((m69815 ^ i20) * 6719) ^ 1171358500;
                                                i22 = -1460688032;
                                            } else {
                                                m69815 = (C0630.m2566("ᩴ᩹") ^ i20) * (-5);
                                                i21 = ((m69815 ^ i19) * (-21521)) ^ 1886079025;
                                                i22 = 212890703;
                                            }
                                        case 463790510:
                                        case 1746362387:
                                            C3911.m11924();
                                            m69815 = C2105.m6981("֡ܶ") ^ i19;
                                            i21 = ((m69815 ^ i20) * (-1131)) ^ (-26774656);
                                            i22 = -525601220;
                                        case 1308687373:
                                        case 1858211174:
                                            if (C3245.m9925() != 0) {
                                                m69815 = C2105.m6981("֡ܶ") ^ i19;
                                                i21 = ((m69815 ^ i20) * (-1131)) ^ (-26774656);
                                                i22 = -525601220;
                                            } else {
                                                m69815 = C0630.m2566("ۨ᩵") ^ i20;
                                                i21 = ((m69815 ^ i19) * 9165) ^ (-1376185398);
                                                i22 = 1297337094;
                                            }
                                        default:
                                            if (C0964.m3413()) {
                                                m69815 = C0630.m2566("ᩳᩴ") ^ i19;
                                                i21 = ((m69815 ^ i20) * 29843) ^ (-1962723880);
                                                i22 = -102688468;
                                            } else {
                                                m69815 = C0630.m2566("֫ۖ") ^ i19;
                                                i21 = ((m69815 ^ i20) * 6719) ^ 1171358500;
                                                i22 = -1460688032;
                                            }
                                    }
                                    return;
                                }
                            }
                        };
                        sArr2 = f21694;
                        i9 = 298;
                        if (C4159.f13567) {
                            m6981 = C0630.m2566("ᩳ۬") ^ i5;
                            i = ((m6981 ^ i6) * (-2581)) ^ (-1380012778);
                            i2 = 734795649;
                            i8 = m6981 ^ i2;
                            i7 = i;
                        }
                        m6981 = C0630.m2566("ۢܶ") ^ i5;
                        i = ((m6981 ^ i6) * 17957) ^ 719718565;
                        i2 = -799411042;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case -175299273:
                case 1287949892:
                    C2520.m8029(c19258, 2125873908 ^ i11, null);
                    m6981 = C2105.m6981("᩸ܽ") ^ i6;
                    i = ((m6981 ^ i5) * (-3643)) ^ 1179516903;
                    i2 = -876464040;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case -124386635:
                case 666634416:
                    C7106.m19120();
                    if (C3683.m11222()) {
                        m6981 = C2105.m6981("֡ۢ") ^ i6;
                        i = ((m6981 ^ i5) * 10563) ^ (-1639549198);
                        i2 = 246203023;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    } else {
                        m69812 = C2105.m6981("ۨ֫") ^ i6;
                        i7 = ((m69812 ^ i5) * (-28761)) ^ (-966518387);
                        i3 = -409520538;
                        i8 = m69812 ^ i3;
                        viewOnClickListenerC7042 = this;
                    }
                case -78497821:
                case 186603644:
                    i10 = C2105.m6981(C22628.m50602(sArr, i15, 3, i12));
                    if (C1773.f6144 <= 0) {
                        int m69814222 = (C2105.m6981("᩹ܺ") ^ i6) * 79;
                        i8 = m69814222 ^ (-532531602);
                        i7 = ((m69814222 ^ i5) * (-20847)) ^ (-1796769879);
                        onClickListener = null;
                    } else {
                        m6981 = (C2105.m6981("ۡ᩶") + i5) * 47;
                        i = ((m6981 ^ i6) * 22427) ^ 1866493116;
                        i2 = -425258776;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                case 707768923:
                case 1585969836:
                    i11 = C2105.m6981(RunnableC1108.m3789(f21694, 301, 3, i12));
                    if (C11340.f33930 < 0) {
                        m6981 = (C0630.m2566("᩶ۚ") + i5) * (-97);
                        i = ((m6981 ^ i6) * 31657) ^ 1194021258;
                        i2 = 1367462081;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C0630.m2566("ۢܶ") ^ i5;
                    i = ((m6981 ^ i6) * 17957) ^ 719718565;
                    i2 = -799411042;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case 966560912:
                case 1080413129:
                    dialogInterfaceC0206 = RunnableC0588.m2438(c19258);
                    C8960.m23095(dialogInterfaceC0206);
                    textView = (TextView) dialogInterfaceC0206.m1433(R.id.message);
                    if (RunnableC0588.f2309 < 0) {
                        m6981 = (C2105.m6981("ܽۘ") + i5) * (-45);
                        i = ((m6981 ^ i6) * 28337) ^ 412014848;
                        i2 = -838717868;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
                    m6981 = C2105.m6981("֡ۢ") ^ i6;
                    i = ((m6981 ^ i5) * 10563) ^ (-1639549198);
                    i2 = 246203023;
                    i8 = m6981 ^ i2;
                    i7 = i;
                case 1126962460:
                case 1815291377:
                    C22628.m50615();
                    C0714.m2805();
                    break;
                case 1637947393:
                case 1673196634:
                    short s2 = s;
                    if ((i14 + 19562929) - (s2 * 8846) < 0) {
                        m2566 = (C0630.m2566("ۖᩳ") + i6) * (-13);
                        i7 = ((m2566 ^ i5) * 11327) ^ 1528805082;
                        i4 = -584364843;
                    } else {
                        m2566 = C0630.m2566("۠ۧ") ^ i6;
                        i7 = ((m2566 ^ i5) * 13561) ^ (-1421270905);
                        i4 = 1461665657;
                    }
                    i8 = m2566 ^ i4;
                    viewOnClickListenerC7042 = this;
                    s = s2;
                default:
                    if (C2520.f8000 >= 0) {
                        m69812 = C2105.m6981("ۨ֫") ^ i6;
                        i7 = ((m69812 ^ i5) * (-28761)) ^ (-966518387);
                        i3 = -409520538;
                        i8 = m69812 ^ i3;
                        viewOnClickListenerC7042 = this;
                    } else {
                        m6981 = C0630.m2566("ۢܶ") ^ i5;
                        i = ((m6981 ^ i6) * 17957) ^ 719718565;
                        i2 = -799411042;
                        i8 = m6981 ^ i2;
                        i7 = i;
                    }
            }
            return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public void m19014() {
        int i;
        Paint paint;
        Paint paint2;
        float f;
        TextView textView;
        Paint paint3;
        Paint paint4;
        String str;
        String str2;
        int m6981;
        int i2;
        int i3;
        TextView textView2;
        float f2;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        int m2566;
        int i4;
        int i5;
        int i6;
        Paint paint9;
        float f3;
        Paint paint10;
        String str3;
        InterfaceC17664 interfaceC17664;
        int i7;
        int m69812;
        int i8;
        int i9;
        int m69813;
        int i10;
        int i11;
        int i12;
        Paint paint11;
        InterfaceC17664 map;
        int m25662;
        int i13;
        int i14;
        Paint paint12;
        TextView textView3;
        Paint paint13;
        Paint paint14;
        String str4;
        InterfaceC17664 interfaceC176642;
        int i15;
        int m25663;
        int i16;
        int i17;
        int i18;
        int m25664;
        int i19;
        int i20;
        int i21 = C1420.f5096;
        int i22 = C2958.f9394;
        int m25665 = (i21 - C0630.m2566("ܽۙ")) * 127;
        int i23 = ((m25665 ^ i22) * 10273) ^ 1708235894;
        C16646 c16646 = null;
        InterfaceC17664 interfaceC176643 = null;
        C15318 c15318 = null;
        String str5 = null;
        Paint paint15 = null;
        TextView textView4 = null;
        int i24 = m25665 ^ 73009619;
        ArrayList arrayList = null;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        float f4 = 0.0f;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i33 = 297903508;
        Paint paint16 = null;
        Paint paint17 = null;
        Paint paint18 = null;
        String str6 = null;
        InterfaceC17664 interfaceC176644 = null;
        C11077 c11077 = null;
        String str7 = null;
        String str8 = null;
        Iterator it = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            i33 = i24 ^ (i23 & (((i33 ^ i22) * 25297) >> 31));
            switch (i33) {
                case -2137810642:
                case 376839041:
                    if (f7 <= f9) {
                        m2566 = C0630.m2566("᩵ۗ") ^ i22;
                        i4 = ((m2566 ^ i21) * (-24431)) ^ (-1282453762);
                        i5 = -1802925494;
                        i24 = m2566 ^ i5;
                        i23 = i4;
                    } else {
                        i = i29;
                        paint = paint15;
                        paint2 = paint16;
                        f = f10;
                        textView = textView4;
                        paint3 = paint17;
                        paint4 = paint18;
                        str = str7;
                        m25664 = C2105.m6981("ᩳۛ") ^ i21;
                        i2 = ((m25664 ^ i22) * 28149) ^ 960861227;
                        i19 = -1128146306;
                        i20 = m25664 ^ i19;
                        paint18 = paint4;
                        f10 = f;
                        paint15 = paint;
                        i18 = i;
                        i24 = i20;
                        i23 = i2;
                        str7 = str;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                case -2132784080:
                case -797090109:
                    i12 = i25;
                    i = i29;
                    paint = paint15;
                    paint2 = paint16;
                    f = f10;
                    textView = textView4;
                    paint3 = paint17;
                    str6 = (String) c16646.orElse(str7);
                    paint11 = paint18;
                    map = C2167.m7152(arrayList).map(new C21670(0));
                    c15318 = new C15318();
                    if (C2167.f7158 < 0) {
                        m25662 = (C0630.m2566("ܰܽ") ^ i22) * 93;
                        i10 = ((m25662 ^ i21) * (-28767)) ^ (-1051053979);
                        i13 = 1270866722;
                        int i34 = m25662 ^ i13;
                        paint18 = paint11;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i;
                        i24 = i34;
                        i25 = i12;
                        interfaceC176643 = map;
                        i23 = i10;
                        f10 = f;
                        paint15 = paint;
                    }
                    m25662 = (C2105.m6981("۟ܶ") + i21) * (-3);
                    i10 = ((m25662 ^ i22) * 25033) ^ (-1988232204);
                    i13 = 3170510;
                    int i342 = m25662 ^ i13;
                    paint18 = paint11;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i;
                    i24 = i342;
                    i25 = i12;
                    interfaceC176643 = map;
                    i23 = i10;
                    f10 = f;
                    paint15 = paint;
                case -1927024263:
                case -1544436755:
                    C1711.m5736();
                    break;
                case -1925816399:
                case 669613785:
                    it = C4117.m12354(arrayList);
                    m2566 = C2105.m6981("᩷ۧ") ^ i21;
                    i4 = ((m2566 ^ i22) * (-9775)) ^ 2099166580;
                    i5 = -1828820206;
                    i24 = m2566 ^ i5;
                    i23 = i4;
                case -1905737069:
                case 1188028624:
                    i14 = i29;
                    paint = paint15;
                    paint12 = paint16;
                    f = f10;
                    textView3 = textView4;
                    paint13 = paint17;
                    paint14 = paint18;
                    str4 = str6;
                    interfaceC176642 = interfaceC176643;
                    str8 = (String) interfaceC176642.max(C8200.comparingInt(c15318)).orElse(str7);
                    i15 = i25;
                    interfaceC176644 = C0714.m2810(arrayList).map(new C22536(2));
                    if (C1504.m5179()) {
                        m25663 = C0630.m2566("ۗ᩸") ^ i21;
                        i16 = ((m25663 ^ i22) * 10237) ^ 629385228;
                        i17 = 925029157;
                        int i35 = m25663 ^ i17;
                        paint17 = paint13;
                        textView4 = textView3;
                        paint16 = paint12;
                        i29 = i14;
                        i24 = i35;
                        i23 = i16;
                        i25 = i15;
                        interfaceC176643 = interfaceC176642;
                        str6 = str4;
                        paint18 = paint14;
                        f10 = f;
                        paint15 = paint;
                    }
                    m25663 = C2105.m6981("ۖۖ") ^ i21;
                    i16 = ((m25663 ^ i22) * (-6427)) ^ 1955174178;
                    i17 = 2120544828;
                    int i352 = m25663 ^ i17;
                    paint17 = paint13;
                    textView4 = textView3;
                    paint16 = paint12;
                    i29 = i14;
                    i24 = i352;
                    i23 = i16;
                    i25 = i15;
                    interfaceC176643 = interfaceC176642;
                    str6 = str4;
                    paint18 = paint14;
                    f10 = f;
                    paint15 = paint;
                case -1730092764:
                case 1463095451:
                    i6 = i29;
                    paint9 = paint15;
                    paint2 = paint16;
                    f3 = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint10 = paint18;
                    str3 = str6;
                    interfaceC17664 = interfaceC176643;
                    i7 = i25;
                    i26 = 64314;
                    m69812 = C0630.m2566("۬֫") ^ i21;
                    i8 = ((m69812 ^ i22) * 31575) ^ (-1465369688);
                    i9 = 918053946;
                    int i36 = m69812 ^ i9;
                    f10 = f3;
                    paint15 = paint9;
                    i18 = i6;
                    i24 = i36;
                    i23 = i8;
                    i25 = i7;
                    interfaceC176643 = interfaceC17664;
                    str6 = str3;
                    paint18 = paint10;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i18;
                case -1621427635:
                case 1456183079:
                    paint = paint15;
                    paint.setTextSize(C2520.m8021(paint15) * f11);
                    f = f10;
                    paint4 = paint18;
                    paint4.setTextSize(C2520.m8021(paint18) * f11);
                    str2 = str6;
                    i = i29;
                    paint2 = paint16;
                    textView = textView4;
                    paint3 = paint17;
                    str = str7;
                    m6981 = (i21 - C2105.m6981("ۢ᩶")) * (-95);
                    i2 = ((m6981 ^ i22) * 16599) ^ (-465253862);
                    i3 = -1744067708;
                    i20 = m6981 ^ i3;
                    str6 = str2;
                    paint18 = paint4;
                    f10 = f;
                    paint15 = paint;
                    i18 = i;
                    i24 = i20;
                    i23 = i2;
                    str7 = str;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i18;
                case -1591352339:
                case 883734609:
                    C3019.m9255();
                    paint5 = paint16;
                    paint7 = paint18;
                    str2 = str6;
                    textView2 = textView4;
                    paint6 = paint15;
                    f2 = f10;
                    paint8 = paint6;
                    int m69814 = (C2105.m6981("ۘۖ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    int i37 = ((m69814 ^ i22) * 22635) ^ 2144543699;
                    i24 = m69814 ^ (-1464301329);
                    str6 = str2;
                    paint17 = null;
                    paint18 = paint7;
                    TextView textView5 = textView2;
                    paint16 = paint5;
                    i23 = i37;
                    textView4 = textView5;
                    float f12 = f2;
                    paint15 = paint8;
                    f10 = f12;
                case -1519763845:
                case 188337938:
                    i6 = i29;
                    paint9 = paint15;
                    paint2 = paint16;
                    f3 = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint10 = paint18;
                    str3 = str6;
                    interfaceC17664 = interfaceC176643;
                    i7 = i25;
                    short s = f21694[12];
                    if (((s * s) + 25411681) - (s * 10082) < 0) {
                        m69812 = C0630.m2566("۫ۨ") ^ i22;
                        i8 = ((m69812 ^ i21) * 16017) ^ (-989028578);
                        i9 = -733033752;
                    } else {
                        m69812 = C2105.m6981("ۖܺ") ^ i21;
                        i8 = ((m69812 ^ i22) * (-17921)) ^ 1386580582;
                        i9 = 352260139;
                    }
                    int i362 = m69812 ^ i9;
                    f10 = f3;
                    paint15 = paint9;
                    i18 = i6;
                    i24 = i362;
                    i23 = i8;
                    i25 = i7;
                    interfaceC176643 = interfaceC17664;
                    str6 = str3;
                    paint18 = paint10;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i18;
                case -1496174106:
                case 1441124100:
                    i6 = i29;
                    paint9 = paint15;
                    paint2 = paint16;
                    f3 = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint10 = paint18;
                    str3 = str6;
                    interfaceC17664 = interfaceC176643;
                    i7 = i25;
                    c16646 = C2167.m7152(arrayList).map(new C8264(0)).max(C8200.comparingInt(new C15318()));
                    str7 = "";
                    if (C1711.m5736() > 0) {
                        m69812 = C2105.m6981("֡ۚ") ^ i22;
                        i8 = ((m69812 ^ i21) * 29599) ^ 1930519317;
                        i9 = 626995469;
                        int i3622 = m69812 ^ i9;
                        f10 = f3;
                        paint15 = paint9;
                        i18 = i6;
                        i24 = i3622;
                        i23 = i8;
                        i25 = i7;
                        interfaceC176643 = interfaceC17664;
                        str6 = str3;
                        paint18 = paint10;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                    m69812 = C2105.m6981("֡֨") ^ i22;
                    i8 = ((m69812 ^ i21) * 26451) ^ 1364863518;
                    i9 = -1917826782;
                    int i36222 = m69812 ^ i9;
                    f10 = f3;
                    paint15 = paint9;
                    i18 = i6;
                    i24 = i36222;
                    i23 = i8;
                    i25 = i7;
                    interfaceC176643 = interfaceC17664;
                    str6 = str3;
                    paint18 = paint10;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i18;
                case -1218682960:
                case 1638427615:
                    if (f8 > f9) {
                        i = i29;
                        paint = paint15;
                        paint2 = paint16;
                        f = f10;
                        textView = textView4;
                        paint3 = paint17;
                        paint4 = paint18;
                        str = str7;
                        m25664 = C2105.m6981("ᩳۛ") ^ i21;
                        i2 = ((m25664 ^ i22) * 28149) ^ 960861227;
                        i19 = -1128146306;
                        i20 = m25664 ^ i19;
                        paint18 = paint4;
                        f10 = f;
                        paint15 = paint;
                        i18 = i;
                        i24 = i20;
                        i23 = i2;
                        str7 = str;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    } else {
                        m2566 = (C2105.m6981("ᩳ֡") + i21) * 61;
                        i4 = ((m2566 ^ i22) * 2033) ^ 1927685077;
                        i5 = -1523755349;
                        i24 = m2566 ^ i5;
                        i23 = i4;
                    }
                case -1216059139:
                case 1987954968:
                    if (C2958.f9394 >= 0) {
                        paint5 = paint16;
                        paint7 = paint18;
                        str2 = str6;
                        textView2 = textView4;
                        paint6 = paint15;
                        f2 = f10;
                        paint8 = paint6;
                        int m698142 = (C2105.m6981("ۘۖ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i372 = ((m698142 ^ i22) * 22635) ^ 2144543699;
                        i24 = m698142 ^ (-1464301329);
                        str6 = str2;
                        paint17 = null;
                        paint18 = paint7;
                        TextView textView52 = textView2;
                        paint16 = paint5;
                        i23 = i372;
                        textView4 = textView52;
                        float f122 = f2;
                        paint15 = paint8;
                        f10 = f122;
                    } else {
                        i6 = i29;
                        paint9 = paint15;
                        paint2 = paint16;
                        f3 = f10;
                        textView = textView4;
                        paint3 = paint17;
                        paint10 = paint18;
                        str3 = str6;
                        interfaceC17664 = interfaceC176643;
                        i7 = i25;
                        m69812 = C2105.m6981("֡֨") ^ i22;
                        i8 = ((m69812 ^ i21) * 26451) ^ 1364863518;
                        i9 = -1917826782;
                        int i362222 = m69812 ^ i9;
                        f10 = f3;
                        paint15 = paint9;
                        i18 = i6;
                        i24 = i362222;
                        i23 = i8;
                        i25 = i7;
                        interfaceC176643 = interfaceC17664;
                        str6 = str3;
                        paint18 = paint10;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                case -1214638711:
                case -572888095:
                    i = i29;
                    paint = paint15;
                    paint2 = paint16;
                    f = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint4 = paint18;
                    str = str7;
                    str2 = str6;
                    i27 = ((i25 - ((i31 + i32) * i30)) / C0382.m1847(arrayList)) - ViewOnClickListenerC1958.m6431(f4);
                    i28 = C1294.m4384(3.0f);
                    m6981 = (i21 - C2105.m6981("ۢ᩶")) * (-95);
                    i2 = ((m6981 ^ i22) * 16599) ^ (-465253862);
                    i3 = -1744067708;
                    i20 = m6981 ^ i3;
                    str6 = str2;
                    paint18 = paint4;
                    f10 = f;
                    paint15 = paint;
                    i18 = i;
                    i24 = i20;
                    i23 = i2;
                    str7 = str;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i18;
                case -1092771035:
                case 1034875752:
                    ViewOnClickListenerC1958.m6429();
                    if (C1420.m4913()) {
                        m2566 = C2105.m6981("֫۫") ^ i22;
                        i4 = ((m2566 ^ i21) * (-5729)) ^ 1945356504;
                        i5 = 1118176458;
                        i24 = m2566 ^ i5;
                        i23 = i4;
                    } else {
                        i6 = i29;
                        paint9 = paint15;
                        paint2 = paint16;
                        f3 = f10;
                        textView = textView4;
                        paint3 = paint17;
                        paint10 = paint18;
                        str3 = str6;
                        interfaceC17664 = interfaceC176643;
                        i7 = i25;
                        m69812 = C2105.m6981("֡֨") ^ i22;
                        i8 = ((m69812 ^ i21) * 26451) ^ 1364863518;
                        i9 = -1917826782;
                        int i3622222 = m69812 ^ i9;
                        f10 = f3;
                        paint15 = paint9;
                        i18 = i6;
                        i24 = i3622222;
                        i23 = i8;
                        i25 = i7;
                        interfaceC176643 = interfaceC17664;
                        str6 = str3;
                        paint18 = paint10;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                case -946062560:
                case 2022844306:
                    if (C2167.f7158 < 0) {
                        paint5 = paint16;
                        paint7 = paint18;
                        str2 = str6;
                        textView2 = textView4;
                        paint6 = paint15;
                        f2 = f10;
                        paint8 = paint6;
                        int m6981422 = (C2105.m6981("ۘۖ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                        int i3722 = ((m6981422 ^ i22) * 22635) ^ 2144543699;
                        i24 = m6981422 ^ (-1464301329);
                        str6 = str2;
                        paint17 = null;
                        paint18 = paint7;
                        TextView textView522 = textView2;
                        paint16 = paint5;
                        i23 = i3722;
                        textView4 = textView522;
                        float f1222 = f2;
                        paint15 = paint8;
                        f10 = f1222;
                    } else {
                        i = i29;
                        paint = paint15;
                        map = interfaceC176643;
                        paint2 = paint16;
                        i12 = i25;
                        f = f10;
                        textView = textView4;
                        paint3 = paint17;
                        paint11 = paint18;
                        m25662 = (C2105.m6981("۟ܶ") + i21) * (-3);
                        i10 = ((m25662 ^ i22) * 25033) ^ (-1988232204);
                        i13 = 3170510;
                        int i3422 = m25662 ^ i13;
                        paint18 = paint11;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i;
                        i24 = i3422;
                        i25 = i12;
                        interfaceC176643 = map;
                        i23 = i10;
                        f10 = f;
                        paint15 = paint;
                    }
                case -784888874:
                case 739167841:
                    if (C0483.m2123(it)) {
                        m2566 = C2105.m6981("ᩳۙ") ^ i22;
                        i4 = ((m2566 ^ i21) * 2103) ^ 468303081;
                        i5 = 484083297;
                        i24 = m2566 ^ i5;
                        i23 = i4;
                    } else {
                        i6 = i29;
                        paint9 = paint15;
                        paint2 = paint16;
                        f3 = f10;
                        textView = textView4;
                        paint3 = paint17;
                        paint10 = paint18;
                        str3 = str6;
                        interfaceC17664 = interfaceC176643;
                        i7 = i25;
                        m69812 = (C2105.m6981("ۗ֫") + i22) * (-11);
                        i8 = ((m69812 ^ i21) * 23993) ^ 1856917428;
                        i9 = -2079506006;
                        int i36222222 = m69812 ^ i9;
                        f10 = f3;
                        paint15 = paint9;
                        i18 = i6;
                        i24 = i36222222;
                        i23 = i8;
                        i25 = i7;
                        interfaceC176643 = interfaceC17664;
                        str6 = str3;
                        paint18 = paint10;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                case -692757667:
                case 1970430865:
                    i6 = i29;
                    paint9 = paint15;
                    paint2 = paint16;
                    f3 = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint10 = paint18;
                    str3 = str6;
                    interfaceC17664 = interfaceC176643;
                    i7 = i25;
                    arrayList = this.f21696;
                    if (!C3537.m10754(arrayList)) {
                        m69812 = C2105.m6981("ۗۛ") ^ i22;
                        i8 = ((m69812 ^ i21) * 16555) ^ 365842646;
                        i9 = -332008639;
                        int i362222222 = m69812 ^ i9;
                        f10 = f3;
                        paint15 = paint9;
                        i18 = i6;
                        i24 = i362222222;
                        i23 = i8;
                        i25 = i7;
                        interfaceC176643 = interfaceC17664;
                        str6 = str3;
                        paint18 = paint10;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                    m69812 = (C2105.m6981("ۗ֫") + i22) * (-11);
                    i8 = ((m69812 ^ i21) * 23993) ^ 1856917428;
                    i9 = -2079506006;
                    int i3622222222 = m69812 ^ i9;
                    f10 = f3;
                    paint15 = paint9;
                    i18 = i6;
                    i24 = i3622222222;
                    i23 = i8;
                    i25 = i7;
                    interfaceC176643 = interfaceC17664;
                    str6 = str3;
                    paint18 = paint10;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i18;
                case -369400272:
                case 1416963466:
                    c11077 = (C11077) RunnableC1108.m3791(it);
                    c11077.m27484().setTextSize(i29, C5695.m16015(paint16));
                    textView4 = c11077.m27481();
                    f10 = C2520.m8021(paint17);
                    if (C4117.f13076 <= 0) {
                        str2 = str6;
                        int m69815 = (C2105.m6981("ᩴۜ") ^ i22) * (-87);
                        i24 = m69815 ^ (-1785475094);
                        i23 = ((m69815 ^ i21) * 11745) ^ 1002892331;
                        str6 = str2;
                        paint16 = null;
                        paint18 = null;
                    } else {
                        m2566 = C0630.m2566("᩻֡") ^ i22;
                        i4 = ((m2566 ^ i21) * 32415) ^ (-213388951);
                        i5 = -1683071650;
                        i24 = m2566 ^ i5;
                        i23 = i4;
                    }
                case -237500594:
                case -16237790:
                    paint = paint15;
                    f = f10;
                    paint4 = paint18;
                    f11 = 0.9f;
                    i = i29;
                    paint2 = paint16;
                    paint2.setTextSize(C5695.m16015(paint16) * 0.9f);
                    textView = textView4;
                    paint3 = paint17;
                    paint3.setTextSize(C2520.m8021(paint17) * 0.9f);
                    if (C0422.f1886 <= 0) {
                        paint11 = paint4;
                        map = interfaceC176643;
                        i12 = i25;
                        m25662 = (C2105.m6981("۟ܶ") + i21) * (-3);
                        i10 = ((m25662 ^ i22) * 25033) ^ (-1988232204);
                        i13 = 3170510;
                        int i34222 = m25662 ^ i13;
                        paint18 = paint11;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i;
                        i24 = i34222;
                        i25 = i12;
                        interfaceC176643 = map;
                        i23 = i10;
                        f10 = f;
                        paint15 = paint;
                    } else {
                        m25664 = C0630.m2566("ۗܽ") ^ i22;
                        str = str7;
                        i2 = ((m25664 ^ i21) * 25919) ^ 687571601;
                        i19 = -1544972554;
                        i20 = m25664 ^ i19;
                        paint18 = paint4;
                        f10 = f;
                        paint15 = paint;
                        i18 = i;
                        i24 = i20;
                        i23 = i2;
                        str7 = str;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                case -210108051:
                case 1671834402:
                    break;
                case -198633719:
                case -152764553:
                    C1294.m4383(new RunnableC7852(this, 2), 100L);
                    break;
                case -22208067:
                case 1854913871:
                    textView4.setTextSize(i29, f10);
                    c11077.m27480().setTextSize(i29, C5695.m16015(paint15));
                    c11077.m27485().setTextSize(i29, C5695.m16015(paint18));
                    m2566 = C2105.m6981("᩷ۧ") ^ i21;
                    i4 = ((m2566 ^ i22) * (-9775)) ^ 2099166580;
                    i5 = -1828820206;
                    i24 = m2566 ^ i5;
                    i23 = i4;
                case 217013423:
                case 1887865564:
                    i = i29;
                    paint = paint15;
                    paint2 = paint16;
                    f = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint4 = paint18;
                    str = str7;
                    f7 = paint2.measureText(str6) + (2.0f * f6);
                    f8 = paint3.measureText(str8);
                    float f13 = i27;
                    if (f5 <= f13) {
                        int m25666 = (i21 - C0630.m2566("ᩳ᩸")) * 101;
                        f9 = f13;
                        i23 = ((m25666 ^ i22) * (-31319)) ^ 620326355;
                        paint18 = paint4;
                        f10 = f;
                        paint15 = paint;
                        i18 = i;
                        i24 = m25666 ^ 1026108069;
                        str7 = str;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    } else {
                        f9 = f13;
                        m25664 = C2105.m6981("ᩳۛ") ^ i21;
                        i2 = ((m25664 ^ i22) * 28149) ^ 960861227;
                        i19 = -1128146306;
                        i20 = m25664 ^ i19;
                        paint18 = paint4;
                        f10 = f;
                        paint15 = paint;
                        i18 = i;
                        i24 = i20;
                        i23 = i2;
                        str7 = str;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
                case 299552582:
                case 1961420336:
                    textView2 = textView4;
                    Paint paint19 = paint15;
                    Paint paint20 = paint17;
                    f2 = f10;
                    Paint paint21 = paint18;
                    str2 = str6;
                    str5 = (String) interfaceC176644.max(C8200.comparingInt(new C15318())).orElse(str7);
                    i29 = 0;
                    if (ViewOnClickListenerC1958.m6429() >= 0) {
                        paint17 = paint20;
                        f10 = f2;
                        textView4 = textView2;
                        paint15 = paint19;
                    } else {
                        paint5 = new Paint(((C11077) C3537.m10755(arrayList, 0)).m27484().getPaint());
                        TextPaint paint22 = ((C11077) C3537.m10755(arrayList, 0)).m27481().getPaint();
                        if (C2520.f8000 >= 0) {
                            paint6 = paint19;
                            paint7 = paint21;
                            paint8 = paint6;
                            int m69814222 = (C2105.m6981("ۘۖ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                            int i37222 = ((m69814222 ^ i22) * 22635) ^ 2144543699;
                            i24 = m69814222 ^ (-1464301329);
                            str6 = str2;
                            paint17 = null;
                            paint18 = paint7;
                            TextView textView5222 = textView2;
                            paint16 = paint5;
                            i23 = i37222;
                            textView4 = textView5222;
                            float f12222 = f2;
                            paint15 = paint8;
                            f10 = f12222;
                        } else {
                            Paint paint23 = new Paint(paint22);
                            paint8 = new Paint(((C11077) C3019.m9263(arrayList, 0)).m27480().getPaint());
                            if (C0422.f1886 <= 0) {
                                paint17 = paint23;
                                textView4 = textView2;
                                paint15 = paint8;
                                f10 = f2;
                            } else {
                                paint7 = new Paint(((C11077) C3019.m9263(arrayList, 0)).m27485().getPaint());
                                f4 = 16.0f;
                                i30 = ViewOnClickListenerC1958.m6431(16.0f);
                                i31 = C0382.m1847(arrayList);
                                i32 = 1;
                                if (C1128.f4106 <= 0) {
                                    int m698142222 = (C2105.m6981("ۘۖ") + i21) * UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                                    int i372222 = ((m698142222 ^ i22) * 22635) ^ 2144543699;
                                    i24 = m698142222 ^ (-1464301329);
                                    str6 = str2;
                                    paint17 = null;
                                    paint18 = paint7;
                                    TextView textView52222 = textView2;
                                    paint16 = paint5;
                                    i23 = i372222;
                                    textView4 = textView52222;
                                    float f122222 = f2;
                                    paint15 = paint8;
                                    f10 = f122222;
                                } else {
                                    int m69816 = (i22 - C2105.m6981("ܿ֡")) * 15;
                                    int i38 = ((m69816 ^ i21) * (-1563)) ^ 228577059;
                                    paint17 = paint23;
                                    i24 = m69816 ^ (-345553550);
                                    textView4 = textView2;
                                    str6 = str2;
                                    paint16 = paint5;
                                    paint18 = paint7;
                                    i23 = i38;
                                    i29 = 0;
                                    paint15 = paint8;
                                    f10 = f2;
                                }
                            }
                        }
                    }
                    int m698152 = (C2105.m6981("ᩴۜ") ^ i22) * (-87);
                    i24 = m698152 ^ (-1785475094);
                    i23 = ((m698152 ^ i21) * 11745) ^ 1002892331;
                    str6 = str2;
                    paint16 = null;
                    paint18 = null;
                case 420999986:
                case 1750925481:
                    int i39 = i29;
                    paint = paint15;
                    Paint paint24 = paint16;
                    f = f10;
                    TextView textView6 = textView4;
                    Paint paint25 = paint17;
                    Paint paint26 = paint18;
                    String str9 = str6;
                    InterfaceC17664 interfaceC176645 = interfaceC176643;
                    i25 = C0237.m1480(C4263.m12813(this, C2105.m6981(C4117.m12355(f21694, 13, 3, i26)) ^ 2129353303));
                    if (i25 <= 0) {
                        m69813 = C2105.m6981("ܽ᩺") ^ i21;
                        i10 = ((m69813 ^ i22) * (-24667)) ^ (-1636380568);
                        i11 = -1209846208;
                    } else {
                        m69813 = (i21 - C2105.m6981("֡ᩴ")) * 45;
                        i10 = ((m69813 ^ i22) * 21397) ^ 928974336;
                        i11 = 1280800683;
                    }
                    int i40 = m69813 ^ i11;
                    interfaceC176643 = interfaceC176645;
                    str6 = str9;
                    paint18 = paint26;
                    paint17 = paint25;
                    textView4 = textView6;
                    paint16 = paint24;
                    i29 = i39;
                    i24 = i40;
                    i23 = i10;
                    f10 = f;
                    paint15 = paint;
                case 455329538:
                case 560778530:
                    i6 = i29;
                    paint9 = paint15;
                    paint2 = paint16;
                    f3 = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint10 = paint18;
                    str3 = str6;
                    interfaceC17664 = interfaceC176643;
                    i7 = i25;
                    i26 = 48256;
                    m69812 = C0630.m2566("۬֫") ^ i21;
                    i8 = ((m69812 ^ i22) * 31575) ^ (-1465369688);
                    i9 = 918053946;
                    int i36222222222 = m69812 ^ i9;
                    f10 = f3;
                    paint15 = paint9;
                    i18 = i6;
                    i24 = i36222222222;
                    i23 = i8;
                    i25 = i7;
                    interfaceC176643 = interfaceC17664;
                    str6 = str3;
                    paint18 = paint10;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i18;
                case 619674429:
                case 2093942773:
                    if (!C2126.f7087) {
                        i14 = i29;
                        paint = paint15;
                        paint12 = paint16;
                        f = f10;
                        textView3 = textView4;
                        paint13 = paint17;
                        paint14 = paint18;
                        str4 = str6;
                        interfaceC176642 = interfaceC176643;
                        i15 = i25;
                        m25663 = C2105.m6981("ۖۖ") ^ i21;
                        i16 = ((m25663 ^ i22) * (-6427)) ^ 1955174178;
                        i17 = 2120544828;
                        int i3522 = m25663 ^ i17;
                        paint17 = paint13;
                        textView4 = textView3;
                        paint16 = paint12;
                        i29 = i14;
                        i24 = i3522;
                        i23 = i16;
                        i25 = i15;
                        interfaceC176643 = interfaceC176642;
                        str6 = str4;
                        paint18 = paint14;
                        f10 = f;
                        paint15 = paint;
                    }
                    i = i29;
                    paint = paint15;
                    map = interfaceC176643;
                    paint2 = paint16;
                    i12 = i25;
                    f = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint11 = paint18;
                    m25662 = (C2105.m6981("۟ܶ") + i21) * (-3);
                    i10 = ((m25662 ^ i22) * 25033) ^ (-1988232204);
                    i13 = 3170510;
                    int i342222 = m25662 ^ i13;
                    paint18 = paint11;
                    paint17 = paint3;
                    textView4 = textView;
                    paint16 = paint2;
                    i29 = i;
                    i24 = i342222;
                    i25 = i12;
                    interfaceC176643 = map;
                    i23 = i10;
                    f10 = f;
                    paint15 = paint;
                default:
                    i = i29;
                    paint = paint15;
                    paint2 = paint16;
                    f = f10;
                    textView = textView4;
                    paint3 = paint17;
                    paint4 = paint18;
                    str = str7;
                    f5 = paint.measureText(str5);
                    str2 = str6;
                    f6 = paint4.measureText(C1047.m3603(f21694, 16, 1, i26)) + i28;
                    if (C2520.f8000 >= 0) {
                        f10 = f;
                        i29 = i;
                        str7 = str;
                        paint15 = paint;
                        paint17 = paint3;
                        textView4 = textView;
                        int m6981522 = (C2105.m6981("ᩴۜ") ^ i22) * (-87);
                        i24 = m6981522 ^ (-1785475094);
                        i23 = ((m6981522 ^ i21) * 11745) ^ 1002892331;
                        str6 = str2;
                        paint16 = null;
                        paint18 = null;
                    } else {
                        m6981 = C2105.m6981("ۛ᩸") ^ i22;
                        i2 = ((m6981 ^ i21) * 26657) ^ 1240451533;
                        i3 = -103978811;
                        i20 = m6981 ^ i3;
                        str6 = str2;
                        paint18 = paint4;
                        f10 = f;
                        paint15 = paint;
                        i18 = i;
                        i24 = i20;
                        i23 = i2;
                        str7 = str;
                        paint17 = paint3;
                        textView4 = textView;
                        paint16 = paint2;
                        i29 = i18;
                    }
            }
            return;
        }
    }
}
