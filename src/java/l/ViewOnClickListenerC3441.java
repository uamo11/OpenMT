package l;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.alipay.sdk.m.y.q;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.textfield.TextInputLayout;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;

/* compiled from: 51RP */
/* renamed from: l.ۗ᩵ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC3441 implements View.OnClickListener {

    /* renamed from: ۤܶۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f10875 = {82, 13325, 13327, 13336, 13317, 13338, 13317, 13336, 13333, 26318, -18363, 24532, -24399, 17899, -23467, 13322, 13317, 13314, 13320, 13370, 13317, 13321, 13339, 13358, 13333, 13349, 13320, 13380, 13378, 13378, 13378, 13381, -16713, 22909, 18832, -22729, 18690, 25116, -24033, 17845, 16894, -23633, -18125, -22877, -24050, -18643, 19922, 18854, 20555, 25282, -21328, 24941, -17116, -21072, 18211, 22983, 6334, -6627, 8340, 9781, 32019, 32030, 32002, 32026, 32019, 728, -15029, -15012, -15030, -15031, -15018, -15017, -15030, -15012, 20262, -27539, -20024, 21355, -27525, 18433, -20362, -25151, -22132, 23986, 19849, -16940, 6485, 11370, 11367, 11387, 11363, 11370, 6335, -3702, -3683, -3701, -3704, -3689, -3690, -3701, -3683, -30564, 28406, 26337, -29217, -21357, -22955, -31625, -20815, -28508, 26262, 31582, -20616, -24331, 30980, 28002, -16644, -21510, -16670, 9326, 31266, -5668, 5207, 402, 640, -928, -7238, 5566, -1456, 4986, -6402, 10947, 8308, 12171, -4649, 6184, 31252, 31264, 31270, 31285, 31290, 31271, 31288, 31285, 31264, 31293, 31291, 31290, 31244, 31271, 31281, 31264, 31248, 31265, 31270, 31285, 31264, 31293, 31291, 31290, 31356, 31354, 31354, 31354, 31357, 3566, 13719, 7161, 13652, 11469, 536, 10126, 7844, -1599, 702, 8144, -712, 2624, 2844, -2284, 5158, 8017, 3749};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f10876;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19111 f10877;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f10878;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final View f10879;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f10880;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final View f10881;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f10882;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f10883;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Button f10884;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f10885;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Button f10886;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final TextInputLayout f10887;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    public ViewOnClickListenerC3441(AbstractActivityC3346 abstractActivityC3346, C19111 c19111, byte[] bArr, String str) {
        boolean z;
        int i;
        Button button;
        short[] sArr;
        int i2;
        short[] sArr2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean z3;
        int i7;
        short[] sArr3;
        int i8;
        short[] sArr4;
        int i9;
        short[] sArr5;
        int i10;
        int i11;
        DialogInterfaceC0206 dialogInterfaceC0206;
        int m2566;
        int i12;
        int m25662;
        int i13;
        boolean z4;
        String str2;
        short[] sArr6;
        int i14;
        short[] sArr7;
        int i15;
        String str3;
        int i16;
        boolean z5;
        View view;
        int m25663;
        int i17;
        boolean z6;
        boolean z7;
        boolean z8;
        View view2;
        boolean z9;
        boolean z10;
        Button button2;
        boolean z11;
        int i18;
        int i19;
        boolean z12;
        int i20;
        int i21;
        int i22;
        boolean z13;
        int i23;
        boolean z14;
        View view3;
        int m25664;
        int i24;
        int i25;
        boolean z15;
        int m6981;
        int i26;
        Button button3;
        boolean z16;
        boolean z17;
        ViewOnClickListenerC3441 viewOnClickListenerC3441 = this;
        AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
        int i27 = 1249948635;
        int i28 = C3746.f11829;
        int i29 = C4263.f13799;
        short s = f10875[0];
        int i30 = (s * 596) - ((s * s) + 88804) <= 0 ? 13420 : 51140;
        C3683.m11210(abstractActivityC33462, C4159.m12578(f10875, 1, 8, i30));
        int m69812 = C2105.m6981("ۧ᩷") ^ i28;
        int i31 = ((m69812 ^ i29) * (-459)) ^ 1574575476;
        KeyEvent.Callback callback = null;
        TextInputLayout textInputLayout = null;
        Button button4 = null;
        DialogInterfaceC0206 dialogInterfaceC02062 = null;
        RunnableC20626 runnableC20626 = null;
        String str4 = null;
        short[] sArr8 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        boolean z18 = false;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        ViewOnClickListenerC0059 viewOnClickListenerC0059 = null;
        int i39 = 0;
        int i40 = 0;
        int i41 = 0;
        int i42 = 0;
        int i43 = 0;
        int i44 = 0;
        int i45 = m69812 ^ (-819215567);
        View view4 = null;
        View view5 = null;
        View view6 = null;
        View view7 = null;
        Object[] objArr = null;
        int i46 = 0;
        View view8 = null;
        String str5 = null;
        TextInputLayout textInputLayout2 = null;
        Button button5 = null;
        short[] sArr12 = null;
        int i47 = 0;
        while (true) {
            i27 = i45 ^ (i31 & (((i27 ^ i29) * 22765) >> 31));
            switch (i27) {
                case -2005111063:
                case -689282163:
                    C3245.m9925();
                    if (C0237.f1507 != 0) {
                        z3 = i46;
                        i = i33;
                        i7 = i47;
                        button = button4;
                        sArr3 = sArr9;
                        i8 = i40;
                        sArr4 = sArr10;
                        i9 = i42;
                        sArr5 = sArr11;
                        i10 = i43;
                        z2 = z18 ? 1 : 0;
                        m2566 = C0630.m2566("ܶܳ") ^ i28;
                        i5 = ((m2566 ^ i29) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        z7 = z3;
                        i6 = m2566 ^ i12;
                        i43 = i10;
                        i40 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i42 = i9;
                        sArr9 = sArr3;
                        i47 = i7;
                        z6 = z7;
                        i33 = i;
                        i46 = z6;
                        int i48 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i48;
                    } else {
                        button = button4;
                        z8 = z18 ? 1 : 0;
                        view2 = view6;
                        m6981 = C0630.m2566("۠ۡ") ^ i28;
                        i24 = ((m6981 ^ i29) * (-21653)) ^ (-1650400720);
                        i26 = 1008911869;
                        i45 = m6981 ^ i26;
                        view6 = view2;
                        z18 = z8;
                        i46 = i46;
                        button4 = button;
                        i31 = i24;
                    }
                case -1882113243:
                case 1378977975:
                    z2 = z18 ? 1 : 0;
                    View view9 = view7;
                    C2126.m7031(view9, str5);
                    Button button6 = (Button) view9;
                    viewOnClickListenerC3441.f10886 = button6;
                    i37 = C0630.m2566(C11340.m28025(f10875, 47, 3, i30));
                    i38 = 2129570324;
                    int m69813 = C2105.m6981("ᩴ᩸") ^ i28;
                    i31 = ((m69813 ^ i29) * (-30111)) ^ (-1839593566);
                    button3 = button6;
                    i45 = m69813 ^ 511877533;
                    i46 = i46;
                    z18 = z2;
                    button4 = button3;
                case -1808949263:
                case 2025962955:
                    boolean z19 = i46;
                    i = i33;
                    i7 = i47;
                    button = button4;
                    sArr3 = sArr9;
                    i8 = i40;
                    sArr4 = sArr10;
                    i9 = i42;
                    sArr5 = sArr11;
                    i10 = i43;
                    z2 = z18 ? 1 : 0;
                    dialogInterfaceC0206 = viewOnClickListenerC0059.f957;
                    C3663.m11167(dialogInterfaceC0206);
                    sArr8 = f10875;
                    i39 = 9;
                    z3 = z19;
                    if (C2520.f8000 < 0) {
                        m2566 = (C0630.m2566("ۢۡ") ^ i28) * (-59);
                        i5 = ((m2566 ^ i29) * 20761) ^ 1502453618;
                        i12 = 2006293114;
                        z7 = z19;
                        i6 = m2566 ^ i12;
                        i43 = i10;
                        i40 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i42 = i9;
                        sArr9 = sArr3;
                        i47 = i7;
                        z6 = z7;
                        i33 = i;
                        i46 = z6;
                        int i482 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i482;
                    }
                    m2566 = C0630.m2566("ܶܳ") ^ i28;
                    i5 = ((m2566 ^ i29) * (-20035)) ^ (-330500852);
                    i12 = -1729557652;
                    z7 = z3;
                    i6 = m2566 ^ i12;
                    i43 = i10;
                    i40 = i8;
                    sArr11 = sArr5;
                    sArr10 = sArr4;
                    i42 = i9;
                    sArr9 = sArr3;
                    i47 = i7;
                    z6 = z7;
                    i33 = i;
                    i46 = z6;
                    int i4822 = i5;
                    i45 = i6;
                    z18 = z2;
                    button4 = button;
                    i31 = i4822;
                case -1790662478:
                case -1447585664:
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    textInputLayout = (TextInputLayout) callback;
                    viewOnClickListenerC3441.f10880 = textInputLayout;
                    i35 = C2105.m6981(C4616.m13542(f10875, 41, 3, i30));
                    if (C2167.m7155()) {
                        z4 = i46;
                        str2 = str4;
                        sArr6 = sArr10;
                        i14 = i42;
                        sArr7 = sArr11;
                        i15 = i43;
                        str3 = str5;
                        i16 = i41;
                        i23 = C0630.m2566("֨֫") ^ i29;
                        i20 = ((i23 ^ i28) * 19379) ^ (-1233507474);
                        i22 = -491323482;
                        z13 = z4;
                        i21 = i23 ^ i22;
                        i43 = i15;
                        i41 = i16;
                        str5 = str3;
                        sArr11 = sArr7;
                        sArr10 = sArr6;
                        i42 = i14;
                        str4 = str2;
                        z18 = z2;
                        z12 = z13;
                        button4 = button;
                        i31 = i20;
                        i45 = i21;
                        z15 = z12;
                        i46 = z15;
                    } else {
                        m25662 = (i28 - C0630.m2566("֡֡")) * 5;
                        i5 = ((m25662 ^ i29) * (-25527)) ^ 2108685523;
                        i13 = -469050127;
                        i6 = m25662 ^ i13;
                        i46 = i46;
                        int i48222 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i48222;
                    }
                case -1715240595:
                case 1360889152:
                    C14096.m33705(button5);
                    textInputLayout.setHelperTextEnabled(i46);
                    textInputLayout.setHelperTextColor(ColorStateList.valueOf(C21943.f70291));
                    objArr = new Object[i46];
                    objArr[z18 ? 1 : 0] = str;
                    sArr12 = f10875;
                    i32 = 50;
                    m25663 = (C2105.m6981("֨֡") ^ i28) * (-25);
                    i31 = ((m25663 ^ i29) * 12845) ^ (-194758250);
                    i17 = -1867722128;
                    i45 = m25663 ^ i17;
                case -1514848888:
                case -30366412:
                    if (C0382.f1805) {
                        z5 = i46;
                        view = view5;
                        button = button4;
                        z2 = z18 ? 1 : 0;
                        view3 = view6;
                        z17 = z5;
                        m25664 = C0630.m2566("᩷ۙ") ^ i29;
                        i24 = ((m25664 ^ i28) * 18029) ^ (-1154361671);
                        i25 = -1632302476;
                        z16 = z17;
                        i45 = m25664 ^ i25;
                        view6 = view3;
                        view5 = view;
                        z18 = z2;
                        i46 = z16;
                        button4 = button;
                        i31 = i24;
                    } else {
                        z = i46;
                        i = i33;
                        button = button4;
                        sArr = sArr10;
                        i2 = i42;
                        sArr2 = sArr11;
                        i3 = i43;
                        z2 = z18 ? 1 : 0;
                        i4 = i47;
                        int m69814 = C2105.m6981("᩶ܽ") ^ i29;
                        int i49 = i4;
                        i11 = ((m69814 ^ i28) * 24747) ^ (-1825498690);
                        i45 = m69814 ^ 318675521;
                        i43 = i3;
                        i47 = i49;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i42 = i2;
                        i33 = i;
                        z14 = z;
                        z9 = z14;
                        button3 = button;
                        i31 = i11;
                        i46 = z9;
                        z18 = z2;
                        button4 = button3;
                    }
                case -1486584879:
                case 1634627450:
                    z12 = i46;
                    button = button4;
                    boolean z20 = z18 ? 1 : 0;
                    int i50 = i47;
                    view4 = C1005.m3507(view8, i50);
                    sArr10 = f10875;
                    i41 = 15;
                    i42 = 17;
                    int m69815 = (C2105.m6981("ۚ֫") ^ i29) * (-9);
                    i20 = ((m69815 ^ i28) * 11237) ^ (-1216903985);
                    i21 = m69815 ^ 995962930;
                    i47 = i50;
                    i43 = i43;
                    z18 = z20;
                    sArr11 = sArr11;
                    button4 = button;
                    i31 = i20;
                    i45 = i21;
                    z15 = z12;
                    i46 = z15;
                case -1443726428:
                case -22293263:
                    Button button7 = button4;
                    boolean z21 = z18 ? 1 : 0;
                    viewOnClickListenerC3441.f10885 = abstractActivityC33462;
                    viewOnClickListenerC3441.f10877 = c19111;
                    viewOnClickListenerC3441.f10876 = bArr;
                    viewOnClickListenerC3441.f10878 = true;
                    ViewOnClickListenerC0059 viewOnClickListenerC00592 = c19111.f60202;
                    int m25665 = (i29 - C0630.m2566("ۢۤ")) * 41;
                    abstractActivityC33462 = abstractActivityC3346;
                    viewOnClickListenerC0059 = viewOnClickListenerC00592;
                    i39 = i39;
                    i43 = i43;
                    i40 = i40;
                    z18 = z21;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i42 = i42;
                    sArr9 = sArr9;
                    i45 = m25665 ^ 442428701;
                    button4 = button7;
                    i47 = i47;
                    i31 = ((m25665 ^ i28) * (-3813)) ^ (-1156205989);
                    i33 = i33;
                    i46 = 1;
                    viewOnClickListenerC3441 = this;
                case -1439832169:
                case -3538599:
                    TextInputLayout textInputLayout3 = textInputLayout2;
                    button = button4;
                    viewOnClickListenerC3441.f10887 = textInputLayout3;
                    textInputLayout3.setEndIconVisible(false);
                    textInputLayout3.setEndIconMode(i46);
                    if (C4117.f13076 <= 0) {
                        textInputLayout2 = textInputLayout3;
                        view2 = view6;
                        z8 = false;
                        m6981 = C0630.m2566("۠ۡ") ^ i28;
                        i24 = ((m6981 ^ i29) * (-21653)) ^ (-1650400720);
                        i26 = 1008911869;
                        i45 = m6981 ^ i26;
                        view6 = view2;
                        z18 = z8;
                        i46 = i46;
                        button4 = button;
                        i31 = i24;
                    } else {
                        int m25666 = (C0630.m2566("ۤܽ") + i28) * (-95);
                        textInputLayout2 = textInputLayout3;
                        button4 = button;
                        z18 = false;
                        i31 = ((m25666 ^ i29) * 32411) ^ (-371647919);
                        i45 = m25666 ^ (-1199384147);
                    }
                case -1427498978:
                case -835951036:
                    C3245.m9925();
                    z = i46;
                    i = i33;
                    button = button4;
                    sArr = sArr10;
                    i2 = i42;
                    sArr2 = sArr11;
                    i3 = i43;
                    z2 = z18 ? 1 : 0;
                    i4 = i47;
                    int m698142 = C2105.m6981("᩶ܽ") ^ i29;
                    int i492 = i4;
                    i11 = ((m698142 ^ i28) * 24747) ^ (-1825498690);
                    i45 = m698142 ^ 318675521;
                    i43 = i3;
                    i47 = i492;
                    sArr11 = sArr2;
                    sArr10 = sArr;
                    i42 = i2;
                    i33 = i;
                    z14 = z;
                    z9 = z14;
                    button3 = button;
                    i31 = i11;
                    i46 = z9;
                    z18 = z2;
                    button4 = button3;
                case -1317011363:
                case 1834233075:
                    button = button4;
                    z8 = z18 ? 1 : 0;
                    view2 = view6;
                    C2126.m7031(view2, str5);
                    viewOnClickListenerC3441.f10883 = (TextView) view2;
                    if (C1294.m4372() > 0) {
                        m6981 = (C2105.m6981("ۘ᩹") ^ i28) * (-23);
                        i24 = ((m6981 ^ i29) * 27817) ^ 644760884;
                        i26 = 127031703;
                        i45 = m6981 ^ i26;
                        view6 = view2;
                        z18 = z8;
                        i46 = i46;
                        button4 = button;
                        i31 = i24;
                    }
                    m6981 = C0630.m2566("۠ۡ") ^ i28;
                    i24 = ((m6981 ^ i29) * (-21653)) ^ (-1650400720);
                    i26 = 1008911869;
                    i45 = m6981 ^ i26;
                    view6 = view2;
                    z18 = z8;
                    i46 = i46;
                    button4 = button;
                    i31 = i24;
                case -1130085859:
                case -160313400:
                    boolean z22 = i46;
                    view = view5;
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    view3 = view6;
                    viewOnClickListenerC3441.f10879 = view;
                    sArr11 = f10875;
                    i43 = 35;
                    i44 = 3;
                    z17 = z22;
                    if (ServiceConnectionC3453.m10564() > 0) {
                        m25664 = C0630.m2566("֫ۛ") ^ i29;
                        i24 = ((m25664 ^ i28) * (-17457)) ^ (-2125001389);
                        i25 = 940407104;
                        z16 = z22;
                        i45 = m25664 ^ i25;
                        view6 = view3;
                        view5 = view;
                        z18 = z2;
                        i46 = z16;
                        button4 = button;
                        i31 = i24;
                    }
                    m25664 = C0630.m2566("᩷ۙ") ^ i29;
                    i24 = ((m25664 ^ i28) * 18029) ^ (-1154361671);
                    i25 = -1632302476;
                    z16 = z17;
                    i45 = m25664 ^ i25;
                    view6 = view3;
                    view5 = view;
                    z18 = z2;
                    i46 = z16;
                    button4 = button;
                    i31 = i24;
                case -1041950398:
                case -433046744:
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    View m3507 = C1005.m3507(view8, i35 ^ 2101436801);
                    C4159.m12575(m3507, str5);
                    textInputLayout2 = (TextInputLayout) m3507;
                    m25662 = C0630.m2566("ۘۤ") ^ i29;
                    i5 = ((m25662 ^ i28) * 32317) ^ 774871859;
                    i13 = -1636756045;
                    i6 = m25662 ^ i13;
                    i46 = i46;
                    int i482222 = i5;
                    i45 = i6;
                    z18 = z2;
                    button4 = button;
                    i31 = i482222;
                case -975153549:
                case 526106603:
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    i34 = C0630.m2566(C4159.m12578(f10875, 38, 3, i30));
                    m25662 = C0630.m2566("ۙۡ") ^ i29;
                    i5 = ((m25662 ^ i28) * 461) ^ 458036570;
                    i13 = 1559263052;
                    i6 = m25662 ^ i13;
                    i46 = i46;
                    int i4822222 = i5;
                    i45 = i6;
                    z18 = z2;
                    button4 = button;
                    i31 = i4822222;
                case -913988227:
                case 386578484:
                    C0287.m1629(textInputLayout2);
                    C19258 m5912 = C1773.m5912(abstractActivityC3346);
                    C0798.m3013(m5912, view8);
                    C1773.m5904(m5912, z18);
                    dialogInterfaceC02062 = C3683.m11213(m5912);
                    viewOnClickListenerC3441.f10882 = dialogInterfaceC02062;
                    runnableC20626 = new RunnableC20626(i46, viewOnClickListenerC3441);
                    m25663 = C0630.m2566("ܶܽ") ^ i28;
                    i31 = ((m25663 ^ i29) * 17617) ^ 108019975;
                    i17 = -1422467842;
                    i45 = m25663 ^ i17;
                case -877749701:
                case 891953567:
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    view7 = C11340.m28028(view8, i36 ^ 2102322395);
                    if (C21923.f70183 != 0) {
                        z5 = i46;
                        view = view5;
                        view3 = view6;
                        z17 = z5;
                        m25664 = C0630.m2566("᩷ۙ") ^ i29;
                        i24 = ((m25664 ^ i28) * 18029) ^ (-1154361671);
                        i25 = -1632302476;
                        z16 = z17;
                        i45 = m25664 ^ i25;
                        view6 = view3;
                        view5 = view;
                        z18 = z2;
                        i46 = z16;
                        button4 = button;
                        i31 = i24;
                    } else {
                        m25662 = C2105.m6981("ۜ᩹") ^ i28;
                        i5 = ((m25662 ^ i29) * (-23873)) ^ 1523949218;
                        i13 = -385311523;
                        i6 = m25662 ^ i13;
                        i46 = i46;
                        int i48222222 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i48222222;
                    }
                case -857259720:
                case 587394204:
                    z14 = i46;
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    View m35072 = C1005.m3507(view8, C0630.m2566(str4) ^ 2099048917);
                    C4159.m12575(m35072, str5);
                    int m25667 = C0630.m2566("᩵֫") ^ i29;
                    view6 = view6;
                    i11 = ((m25667 ^ i28) * 15145) ^ 1728567430;
                    sArr11 = sArr11;
                    i43 = i43;
                    i45 = m25667 ^ (-1996795165);
                    view5 = m35072;
                    z9 = z14;
                    button3 = button;
                    i31 = i11;
                    i46 = z9;
                    z18 = z2;
                    button4 = button3;
                case -839945508:
                case 494851313:
                    C5088.m14638(dialogInterfaceC02062, C0630.m2566(C7106.m19110(f10875, 53, 3, i30)) ^ 2103308419, runnableC20626);
                    return;
                case -759551123:
                case 1526419737:
                    if (C3537.m10746() <= 0) {
                        z5 = i46;
                        view = view5;
                        button = button4;
                        z2 = z18 ? 1 : 0;
                        view3 = view6;
                        z17 = z5;
                        m25664 = C0630.m2566("᩷ۙ") ^ i29;
                        i24 = ((m25664 ^ i28) * 18029) ^ (-1154361671);
                        i25 = -1632302476;
                        z16 = z17;
                        i45 = m25664 ^ i25;
                        view6 = view3;
                        view5 = view;
                        z18 = z2;
                        i46 = z16;
                        button4 = button;
                        i31 = i24;
                    } else {
                        z3 = i46;
                        i = i33;
                        i7 = i47;
                        button = button4;
                        sArr3 = sArr9;
                        i8 = i40;
                        sArr4 = sArr10;
                        i9 = i42;
                        sArr5 = sArr11;
                        i10 = i43;
                        z2 = z18 ? 1 : 0;
                        m2566 = C0630.m2566("ܶܳ") ^ i28;
                        i5 = ((m2566 ^ i29) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        z7 = z3;
                        i6 = m2566 ^ i12;
                        i43 = i10;
                        i40 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i42 = i9;
                        sArr9 = sArr3;
                        i47 = i7;
                        z6 = z7;
                        i33 = i;
                        i46 = z6;
                        int i482222222 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i482222222;
                    }
                case -617750231:
                case -218300769:
                    z10 = i46;
                    button2 = button4;
                    z11 = z18 ? 1 : 0;
                    short[] sArr13 = sArr9;
                    int i51 = i40;
                    i47 = C0630.m2566(C1916.m6311(sArr13, i51, 3, i30)) ^ 2100765642;
                    int m25668 = (C0630.m2566("ۡۨ") + i28) * (-27);
                    i18 = ((m25668 ^ i29) * (-22691)) ^ (-1692030097);
                    i19 = m25668 ^ 1200650438;
                    i40 = i51;
                    i43 = i43;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i42 = i42;
                    sArr9 = sArr13;
                    i45 = i19;
                    z18 = z11;
                    button4 = button2;
                    i31 = i18;
                    z15 = z10;
                    i46 = z15;
                case -382722441:
                case 1756136780:
                    button = button4;
                    z8 = z18 ? 1 : 0;
                    KeyEvent.Callback m35073 = C1005.m3507(view8, i34 ^ 2101936476);
                    C4159.m12575(m35073, str5);
                    int m69816 = (i29 - C2105.m6981("֫ܺ")) * 115;
                    i24 = ((m69816 ^ i28) * (-13141)) ^ (-1197647592);
                    i45 = m69816 ^ 273737513;
                    callback = m35073;
                    z18 = z8;
                    i46 = i46;
                    button4 = button;
                    i31 = i24;
                case -361039316:
                case 330937938:
                    z = i46;
                    i = i33;
                    button = button4;
                    sArr = sArr10;
                    i2 = i42;
                    sArr2 = sArr11;
                    i3 = i43;
                    z2 = z18 ? 1 : 0;
                    i4 = i47;
                    view8 = C3019.m9259(abstractActivityC33462, i);
                    sArr9 = f10875;
                    i40 = 12;
                    if (C1005.f3721) {
                        int m69817 = (C2105.m6981("ܺۨ") ^ i29) * (-13);
                        i5 = ((m69817 ^ i28) * (-17293)) ^ (-578100253);
                        i6 = m69817 ^ (-1939565605);
                        i43 = i3;
                        i47 = i4;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i42 = i2;
                        z6 = z;
                        i33 = i;
                        i46 = z6;
                        int i4822222222 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i4822222222;
                    } else {
                        int m6981422 = C2105.m6981("᩶ܽ") ^ i29;
                        int i4922 = i4;
                        i11 = ((m6981422 ^ i28) * 24747) ^ (-1825498690);
                        i45 = m6981422 ^ 318675521;
                        i43 = i3;
                        i47 = i4922;
                        sArr11 = sArr2;
                        sArr10 = sArr;
                        i42 = i2;
                        i33 = i;
                        z14 = z;
                        z9 = z14;
                        button3 = button;
                        i31 = i11;
                        i46 = z9;
                        z18 = z2;
                        button4 = button3;
                    }
                case 206694136:
                case 707524760:
                    button2 = button4;
                    short[] sArr14 = sArr11;
                    int i52 = i43;
                    z11 = z18 ? 1 : 0;
                    int i53 = i44;
                    view6 = C1005.m3507(view8, C0630.m2566(C4263.m12817(sArr14, i52, i53, i30)) ^ 2100472172);
                    int m69818 = (C2105.m6981("᩹ܶ") ^ i28) * 101;
                    z10 = i46;
                    i18 = ((m69818 ^ i29) * (-21697)) ^ (-233598082);
                    i19 = m69818 ^ (-109356565);
                    sArr11 = sArr14;
                    i43 = i52;
                    i44 = i53;
                    i45 = i19;
                    z18 = z11;
                    button4 = button2;
                    i31 = i18;
                    z15 = z10;
                    i46 = z15;
                case 333857485:
                case 959549760:
                    boolean z23 = i46;
                    button = button4;
                    i16 = i41;
                    int i54 = i42;
                    sArr7 = sArr11;
                    i15 = i43;
                    z2 = z18 ? 1 : 0;
                    short[] sArr15 = sArr10;
                    String m8030 = C2520.m8030(sArr15, i16, i54, i30);
                    sArr6 = sArr15;
                    View view10 = view4;
                    C4159.m12575(view10, m8030);
                    viewOnClickListenerC3441.f10881 = view10;
                    i14 = i54;
                    str3 = m8030;
                    str2 = C3911.m11919(f10875, 32, 3, i30);
                    z4 = z23;
                    if (C0964.f3626 == 0) {
                        i23 = (i28 - C0630.m2566("ۚۖ")) * (-125);
                        i20 = ((i23 ^ i29) * (-16295)) ^ (-431219585);
                        i22 = -347039513;
                        z13 = z23;
                        i21 = i23 ^ i22;
                        i43 = i15;
                        i41 = i16;
                        str5 = str3;
                        sArr11 = sArr7;
                        sArr10 = sArr6;
                        i42 = i14;
                        str4 = str2;
                        z18 = z2;
                        z12 = z13;
                        button4 = button;
                        i31 = i20;
                        i45 = i21;
                        z15 = z12;
                        i46 = z15;
                    }
                    i23 = C0630.m2566("֨֫") ^ i29;
                    i20 = ((i23 ^ i28) * 19379) ^ (-1233507474);
                    i22 = -491323482;
                    z13 = z4;
                    i21 = i23 ^ i22;
                    i43 = i15;
                    i41 = i16;
                    str5 = str3;
                    sArr11 = sArr7;
                    sArr10 = sArr6;
                    i42 = i14;
                    str4 = str2;
                    z18 = z2;
                    z12 = z13;
                    button4 = button;
                    i31 = i20;
                    i45 = i21;
                    z15 = z12;
                    i46 = z15;
                case 648120558:
                case 873111102:
                    C2272.m7503();
                    throw new RuntimeException();
                case 679184528:
                case 1837705171:
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    i36 = C0630.m2566(C11340.m28025(f10875, 44, 3, i30));
                    m25662 = C2105.m6981("᩺ۡ") ^ i29;
                    i5 = ((m25662 ^ i28) * (-26835)) ^ (-1743990522);
                    i13 = 24458000;
                    i6 = m25662 ^ i13;
                    i46 = i46;
                    int i48222222222 = i5;
                    i45 = i6;
                    z18 = z2;
                    button4 = button;
                    i31 = i48222222222;
                case 992827486:
                case 1679471412:
                    textInputLayout.setHelperText(C4075.m12262(abstractActivityC33462, C0630.m2566(RunnableC0588.m2436(sArr12, i32, 3, i30)) ^ 2103094611, objArr));
                    C0287.m1629(textInputLayout);
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        z3 = i46;
                        i = i33;
                        i7 = i47;
                        button = button4;
                        sArr3 = sArr9;
                        i8 = i40;
                        sArr4 = sArr10;
                        i9 = i42;
                        sArr5 = sArr11;
                        i10 = i43;
                        z2 = z18 ? 1 : 0;
                        m2566 = C0630.m2566("ܶܳ") ^ i28;
                        i5 = ((m2566 ^ i29) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        z7 = z3;
                        i6 = m2566 ^ i12;
                        i43 = i10;
                        i40 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i42 = i9;
                        sArr9 = sArr3;
                        i47 = i7;
                        z6 = z7;
                        i33 = i;
                        i46 = z6;
                        int i482222222222 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i482222222222;
                    } else {
                        m25663 = C0630.m2566("ۛܶ") ^ i29;
                        i31 = ((m25663 ^ i28) * (-24995)) ^ 398232983;
                        i17 = -36087826;
                        i45 = m25663 ^ i17;
                    }
                case 1011821496:
                case 1866746896:
                    boolean z24 = i46;
                    button = button4;
                    z2 = z18 ? 1 : 0;
                    short[] sArr16 = sArr8;
                    int i55 = i39;
                    int m25669 = C0630.m2566(C3911.m11919(sArr16, i55, 3, i30)) ^ 2118817731;
                    int m256610 = (C0630.m2566("۠ۗ") + i28) * 53;
                    i11 = ((m256610 ^ i29) * 26331) ^ 608071730;
                    sArr8 = sArr16;
                    i39 = i55;
                    i43 = i43;
                    i40 = i40;
                    z9 = z24;
                    sArr11 = sArr11;
                    sArr10 = sArr10;
                    i42 = i42;
                    sArr9 = sArr9;
                    i45 = m256610 ^ (-1588372576);
                    i47 = i47;
                    i33 = m25669;
                    button3 = button;
                    i31 = i11;
                    i46 = z9;
                    z18 = z2;
                    button4 = button3;
                default:
                    View m35074 = C1005.m3507(view8, i37 ^ i38);
                    C2126.m7031(m35074, str5);
                    Button button8 = (Button) m35074;
                    viewOnClickListenerC3441.f10884 = button8;
                    button = button4;
                    C2126.m7039(button, viewOnClickListenerC3441);
                    C2126.m7039(button8, viewOnClickListenerC3441);
                    if (RunnableC1937.f6483 >= 0) {
                        z2 = z18 ? 1 : 0;
                        z3 = i46;
                        button5 = button8;
                        i = i33;
                        i7 = i47;
                        sArr3 = sArr9;
                        i8 = i40;
                        sArr4 = sArr10;
                        i9 = i42;
                        sArr5 = sArr11;
                        i10 = i43;
                        m2566 = C0630.m2566("ܶܳ") ^ i28;
                        i5 = ((m2566 ^ i29) * (-20035)) ^ (-330500852);
                        i12 = -1729557652;
                        z7 = z3;
                        i6 = m2566 ^ i12;
                        i43 = i10;
                        i40 = i8;
                        sArr11 = sArr5;
                        sArr10 = sArr4;
                        i42 = i9;
                        sArr9 = sArr3;
                        i47 = i7;
                        z6 = z7;
                        i33 = i;
                        i46 = z6;
                        int i4822222222222 = i5;
                        i45 = i6;
                        z18 = z2;
                        button4 = button;
                        i31 = i4822222222222;
                    } else {
                        int m69819 = (i29 - C2105.m6981("֡۫")) * 21;
                        z2 = z18 ? 1 : 0;
                        i11 = ((m69819 ^ i28) * (-5871)) ^ 936791182;
                        button5 = button8;
                        i45 = m69819 ^ 446561238;
                        z9 = i46;
                        button3 = button;
                        i31 = i11;
                        i46 = z9;
                        z18 = z2;
                        button4 = button3;
                    }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m10525(ViewOnClickListenerC3441 viewOnClickListenerC3441) {
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i = 1141106828;
        int i2 = C3746.f11829;
        int i3 = C7811.f24123;
        int m6981 = C2105.m6981("ۧ۟") ^ i2;
        int i4 = ((m6981 ^ i3) * (-2007)) ^ (-1282978571);
        int i5 = -1715417807;
        while (true) {
            i = ((((i ^ i3) * (-21593)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2134177283:
                case -978866987:
                    C2272.m7503();
                    if (C1504.f5354) {
                        m6981 = C0630.m2566("᩻ۚ") ^ i2;
                        i4 = ((m6981 ^ i3) * 5085) ^ 1681337771;
                        i5 = 505044593;
                    } else {
                        m6981 = (i3 - C2105.m6981("۠֨")) * (-39);
                        i4 = ((m6981 ^ i2) * (-21725)) ^ 1228643979;
                        i5 = 1374230722;
                    }
                case -2113318394:
                case -1907259953:
                    C3663.m11167(dialogInterfaceC0206);
                    if (C3019.f9544 >= 0) {
                        m6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        m6981 = (C0630.m2566("ۨܿ") ^ i3) * IShizukuService.Stub.TRANSACTION_updateFlagsForUid;
                        i4 = ((m6981 ^ i2) * 28187) ^ 833843265;
                        i5 = -343274830;
                    }
                case -2075650701:
                case -1971933701:
                    C1773.m5908();
                    C1005.m3501();
                    m6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                    i4 = ((m6981 ^ i2) * (-10411)) ^ (-1125829557);
                    i5 = -1613160390;
                case -1744938438:
                case -1417330093:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((m6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        m6981 = C2105.m6981("᩷ܿ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-8599)) ^ 1048495600;
                        i5 = -61493398;
                    }
                case -1708799512:
                case -1248174491:
                    if (C7106.m19120() > 0) {
                        m6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((m6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        m6981 = C0630.m2566("ۛ᩻") ^ i2;
                        i4 = ((m6981 ^ i3) * (-21249)) ^ (-1276989482);
                        i5 = -324072930;
                    }
                case -1703276611:
                case 1742389609:
                    if (C2105.m6982() != 0) {
                        m6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((m6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        m6981 = C0630.m2566("۠۫") ^ i3;
                        i4 = ((m6981 ^ i2) * (-5183)) ^ (-1309740771);
                        i5 = -2002812588;
                    }
                case -1561027780:
                case 1436685997:
                    C1711.m5736();
                    break;
                case -1522721848:
                case 208327301:
                    if (C0630.f2410 <= 0) {
                        m6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        m6981 = C0630.m2566("ܽ۟") ^ i3;
                        i4 = ((m6981 ^ i2) * 4021) ^ (-1879946002);
                        i5 = -1648083146;
                    }
                case -1261435902:
                case -59538252:
                    viewOnClickListenerC3441.f10877.m44041();
                    break;
                case -410008977:
                case 1302745477:
                    if (C4117.f13076 <= 0) {
                        m6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        m6981 = (C0630.m2566("֫ܶ") + i2) * 23;
                        i4 = ((m6981 ^ i3) * 12633) ^ 1039937772;
                        i5 = 1304738286;
                    }
                case -141271415:
                case 2025860395:
                    if (C5695.f17556 < 0) {
                        m6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((m6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        m6981 = (i3 - C2105.m6981("۠֨")) * (-39);
                        i4 = ((m6981 ^ i2) * (-21725)) ^ 1228643979;
                        i5 = 1374230722;
                    }
                case -15116020:
                case 1737238899:
                    dialogInterfaceC0206 = viewOnClickListenerC3441.f10882;
                    if (RunnableC1937.f6483 >= 0) {
                        m6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        m6981 = C2105.m6981("ۡ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10183)) ^ (-607752432);
                        i5 = -1008432694;
                    }
                case 741612851:
                case 776855997:
                    if (C1420.f5096 <= 0) {
                        m6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((m6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    } else {
                        m6981 = C2105.m6981("ܶۡ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-10395)) ^ 2104446244;
                        i5 = -849548067;
                    }
                case 963614744:
                case 1525865068:
                    if (C0714.m2805()) {
                        m6981 = (C2105.m6981("۠ܶ") ^ i2) * (-61);
                        i4 = ((m6981 ^ i3) * (-29899)) ^ (-1837472769);
                        i5 = -64044193;
                    } else {
                        m6981 = (C2105.m6981("ۖ᩸") + i3) * 63;
                        i4 = ((m6981 ^ i2) * (-10411)) ^ (-1125829557);
                        i5 = -1613160390;
                    }
                case 1884373598:
                case 2112706669:
                    if (C3019.f9544 >= 0) {
                        m6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        m6981 = C2105.m6981("ᩳ᩵") ^ i3;
                        i4 = ((m6981 ^ i2) * 21521) ^ (-1396387837);
                        i5 = -161726300;
                    }
                default:
                    if (C2520.f8000 >= 0) {
                        m6981 = C2105.m6981("᩸ܺ") ^ i2;
                        i4 = ((m6981 ^ i3) * 12177) ^ (-205502136);
                        i5 = -1552031758;
                    } else {
                        m6981 = C2105.m6981("ۚ᩶") ^ i2;
                        i4 = ((m6981 ^ i3) * 2583) ^ 255464070;
                        i5 = -56383100;
                    }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v70, types: [l.ܶ᩵ۡ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        short[] sArr;
        int i;
        String str;
        ObjectAnimator objectAnimator;
        AccelerateInterpolator accelerateInterpolator;
        int i2;
        int i3;
        float[] fArr;
        long j;
        short[] sArr2;
        int i4;
        C19258 c19258;
        int i5;
        byte[] bArr;
        int i6;
        ObjectAnimator objectAnimator2;
        String str2;
        TextInputLayout textInputLayout;
        int i7;
        String str3;
        char c;
        int m2566;
        int i8;
        int i9;
        int i10;
        short[] sArr3;
        int i11;
        char c2;
        String str4;
        String str5;
        int i12;
        int i13;
        int m25662;
        int i14;
        short[] sArr4;
        int i15;
        String str6;
        char c3;
        AccelerateInterpolator accelerateInterpolator2;
        int i16;
        int i17;
        float[] fArr2;
        long j2;
        C19258 c192582;
        ObjectAnimator objectAnimator3;
        String str7;
        int i18;
        String str8;
        byte[] bArr2;
        ObjectAnimator objectAnimator4;
        int m6981;
        int i19;
        int i20;
        int m25663;
        int i21;
        int i22;
        String str9;
        float[] fArr3;
        long j3;
        C19258 c192583;
        byte[] bArr3;
        char c4;
        String str10;
        int i23;
        String str11;
        int m11931;
        int m69812;
        int i24;
        int i25;
        int i26;
        String str12;
        long j4;
        C19258 c192584;
        byte[] bArr4;
        int i27;
        String str13;
        char c5;
        int i28;
        int m69813;
        int i29;
        int i30;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        int m25664;
        int i31;
        int i32;
        short[] sArr5;
        int i33;
        String str14;
        ObjectAnimator objectAnimator5;
        AccelerateInterpolator accelerateInterpolator3;
        int i34;
        int i35;
        float[] fArr4;
        long j5;
        String str15;
        C19258 c192585;
        int i36;
        byte[] bArr5;
        char c12;
        int i37;
        ObjectAnimator objectAnimator6;
        String str16;
        int i38;
        int m25665;
        int i39;
        int i40;
        int i41;
        int i42;
        ObjectAnimator objectAnimator7;
        AccelerateInterpolator accelerateInterpolator4;
        View view2;
        C19258 c192586;
        int i43;
        byte[] bArr6;
        int i44;
        String str17;
        int i45;
        String str18;
        ObjectAnimator m3008;
        float[] fArr5;
        int m69814;
        int i46;
        int i47;
        int m69815;
        int i48;
        int i49;
        int m25666;
        int i50;
        int i51;
        final ViewOnClickListenerC3441 viewOnClickListenerC3441 = this;
        int i52 = 0;
        int i53 = 0;
        String str19 = null;
        String str20 = null;
        float f = 0.0f;
        ObjectAnimator objectAnimator8 = null;
        int i54 = 0;
        String str21 = null;
        int i55 = 0;
        int i56 = 0;
        int i57 = -1326001330;
        int i58 = ViewOnClickListenerC1958.f6529;
        int i59 = C1294.f4556;
        int m69816 = C2105.m6981("ᩴۚ") ^ i59;
        int i60 = ((m69816 ^ i58) * (-26009)) ^ (-1265714295);
        int i61 = m69816 ^ (-1667683314);
        final byte[] bArr7 = null;
        TextInputLayout textInputLayout2 = null;
        TextInputLayout textInputLayout3 = null;
        View view3 = null;
        final String str22 = null;
        final String str23 = null;
        float[] fArr6 = null;
        String str24 = null;
        long j6 = 0;
        String str25 = null;
        ObjectAnimator objectAnimator9 = null;
        AccelerateInterpolator accelerateInterpolator5 = null;
        C19258 c192587 = null;
        short[] sArr6 = null;
        short[] sArr7 = null;
        int i62 = 0;
        int i63 = 0;
        int i64 = 0;
        boolean z = false;
        char c13 = 0;
        char c14 = 0;
        int i65 = 0;
        float f2 = 0.0f;
        int i66 = 0;
        int i67 = 0;
        short s = 0;
        int i68 = 0;
        while (true) {
            i57 = i61 ^ (i60 & (((i57 ^ i58) * 3787) >> 31));
            switch (i57) {
                case -2143901379:
                case 314793304:
                    sArr = sArr7;
                    i28 = i63;
                    c192587 = C1773.m5912(viewOnClickListenerC3441.f10885);
                    C3432.m10490(c192587, C0630.m2566(RunnableC3474.m10633(f10875, 171, 3, i62)) ^ 2122252420);
                    if (C3683.f11629 >= 0) {
                        str = str22;
                        objectAnimator = objectAnimator9;
                        accelerateInterpolator = accelerateInterpolator5;
                        i2 = i66;
                        i = i28;
                        i3 = i67;
                        fArr = fArr6;
                        j = j6;
                        c19258 = c192587;
                        i5 = i53;
                        bArr = bArr7;
                        c7 = c14;
                        i6 = i65;
                        objectAnimator2 = objectAnimator8;
                        str2 = str24;
                        textInputLayout = textInputLayout2;
                        i7 = i52;
                        str3 = str25;
                        int m25667 = C0630.m2566("۫ۨ") ^ i59;
                        i60 = ((m25667 ^ i58) * (-21781)) ^ 10352583;
                        i61 = m25667 ^ 67316660;
                        viewOnClickListenerC3441 = this;
                        str24 = str2;
                        str25 = str3;
                        c6 = c7;
                        textInputLayout2 = textInputLayout;
                        c192587 = c19258;
                        i52 = i7;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        c14 = c6;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        bArr7 = bArr;
                        i66 = i2;
                        i65 = i6;
                        i53 = i5;
                        sArr7 = sArr;
                        objectAnimator9 = objectAnimator;
                    } else {
                        m69813 = (i59 - C2105.m6981("᩺᩺")) * 67;
                        i29 = ((m69813 ^ i58) * 28313) ^ (-1862847921);
                        i30 = -1838806062;
                        i61 = m69813 ^ i30;
                        i60 = i29;
                        sArr7 = sArr;
                        i63 = i28;
                    }
                case -2102110521:
                case 338452350:
                    sArr = sArr7;
                    i26 = i63;
                    str12 = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    int i69 = i67;
                    j4 = j6;
                    c192584 = c192587;
                    i5 = i53;
                    bArr4 = bArr7;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    i27 = i52;
                    str13 = str25;
                    float f3 = i69;
                    float[] fArr7 = new float[i6];
                    f = 0.0f;
                    fArr7[c14] = 0.0f;
                    fArr7[c13] = f3;
                    i3 = i69;
                    str24 = C3432.m10488(f10875, 137, 12, i62);
                    if (C2167.f7158 >= 0) {
                        f2 = f3;
                        fArr6 = fArr7;
                        int m69817 = (i59 - C2105.m6981("۬֨")) * (-111);
                        i61 = m69817 ^ (-399871483);
                        i60 = ((m69817 ^ i58) * 22765) ^ (-1271637344);
                        str25 = str13;
                        c192587 = c192584;
                        i52 = i27;
                        bArr7 = bArr4;
                        j6 = j4;
                        i63 = i26;
                        str22 = str12;
                        i67 = i3;
                        i66 = i2;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        sArr7 = sArr;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator;
                    } else {
                        int m69818 = (i59 - C2105.m6981("ᩳ֫")) * (-89);
                        i61 = m69818 ^ (-548988745);
                        f2 = f3;
                        str25 = str13;
                        fArr6 = fArr7;
                        i60 = ((m69818 ^ i58) * (-23777)) ^ (-2040355320);
                        c192587 = c192584;
                        i52 = i27;
                        bArr7 = bArr4;
                        j6 = j4;
                        i63 = i26;
                        str22 = str12;
                        i67 = i3;
                        i66 = i2;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        sArr7 = sArr;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator;
                    }
                case -2060194576:
                case 623862647:
                    RunnableC3474.m10621(textInputLayout3, i63);
                    break;
                case -2057930900:
                case -2013190558:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    sArr2 = sArr6;
                    i4 = i68;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    c = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    i7 = i52;
                    str3 = str25;
                    int i70 = i55 + i56;
                    textInputLayout = textInputLayout2;
                    short s2 = s;
                    int i71 = s2 + 3865;
                    if ((i71 * i71) - (i70 + i70) <= 0) {
                        m2566 = C2105.m6981("᩷֨") ^ i59;
                        i8 = ((m2566 ^ i58) * 4393) ^ (-1759647938);
                        i9 = -2119202553;
                    } else {
                        m2566 = (i59 - C0630.m2566("᩶ܳ")) * (-47);
                        i8 = ((m2566 ^ i58) * (-28629)) ^ (-2117680759);
                        i9 = -67376419;
                    }
                    i61 = m2566 ^ i9;
                    viewOnClickListenerC3441 = this;
                    s = s2;
                    i60 = i8;
                    str24 = str2;
                    str25 = str3;
                    sArr6 = sArr2;
                    i68 = i4;
                    c6 = c;
                    textInputLayout2 = textInputLayout;
                    c192587 = c19258;
                    i52 = i7;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    c14 = c6;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    bArr7 = bArr;
                    i66 = i2;
                    i65 = i6;
                    i53 = i5;
                    sArr7 = sArr;
                    objectAnimator9 = objectAnimator;
                case -2020279627:
                case 33313160:
                    AbstractC2021.m6574();
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    c7 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    textInputLayout = textInputLayout2;
                    i7 = i52;
                    str3 = str25;
                    int m256672 = C0630.m2566("۫ۨ") ^ i59;
                    i60 = ((m256672 ^ i58) * (-21781)) ^ 10352583;
                    i61 = m256672 ^ 67316660;
                    viewOnClickListenerC3441 = this;
                    str24 = str2;
                    str25 = str3;
                    c6 = c7;
                    textInputLayout2 = textInputLayout;
                    c192587 = c19258;
                    i52 = i7;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    c14 = c6;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    bArr7 = bArr;
                    i66 = i2;
                    i65 = i6;
                    i53 = i5;
                    sArr7 = sArr;
                    objectAnimator9 = objectAnimator;
                case -2017682443:
                case 937410458:
                    sArr5 = sArr7;
                    if (C23343.m51759(str22)) {
                        m69815 = (C2105.m6981("ܶᩴ") ^ i58) * (-11);
                        i48 = ((m69815 ^ i59) * 19821) ^ 792120395;
                        i49 = 428675844;
                    } else {
                        m69815 = (C0630.m2566("ܽ᩶") ^ i59) * 71;
                        i48 = ((m69815 ^ i58) * (-18357)) ^ (-960580499);
                        i49 = -2026165924;
                    }
                    i61 = m69815 ^ i49;
                    i60 = i48;
                    sArr7 = sArr5;
                case -1949762596:
                case 865247427:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    sArr2 = sArr6;
                    i4 = i68;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    char c15 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    textInputLayout = textInputLayout2;
                    i7 = i52;
                    str3 = str25;
                    s = f10875[119];
                    i55 = s * s;
                    i56 = 14938225;
                    if (C1504.f5354) {
                        sArr6 = sArr2;
                        i68 = i4;
                        c7 = c15;
                        int m2566722 = C0630.m2566("۫ۨ") ^ i59;
                        i60 = ((m2566722 ^ i58) * (-21781)) ^ 10352583;
                        i61 = m2566722 ^ 67316660;
                        viewOnClickListenerC3441 = this;
                        str24 = str2;
                        str25 = str3;
                        c6 = c7;
                        textInputLayout2 = textInputLayout;
                        c192587 = c19258;
                        i52 = i7;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        c14 = c6;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        bArr7 = bArr;
                        i66 = i2;
                        i65 = i6;
                        i53 = i5;
                        sArr7 = sArr;
                        objectAnimator9 = objectAnimator;
                    } else {
                        int m25668 = (i58 - C0630.m2566("ۛ֨")) * 43;
                        i60 = ((m25668 ^ i59) * 23649) ^ 1805379179;
                        i61 = m25668 ^ (-1445541428);
                        viewOnClickListenerC3441 = this;
                        c = c15;
                        str24 = str2;
                        str25 = str3;
                        sArr6 = sArr2;
                        i68 = i4;
                        c6 = c;
                        textInputLayout2 = textInputLayout;
                        c192587 = c19258;
                        i52 = i7;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        c14 = c6;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        bArr7 = bArr;
                        i66 = i2;
                        i65 = i6;
                        i53 = i5;
                        sArr7 = sArr;
                        objectAnimator9 = objectAnimator;
                    }
                case -1948942548:
                case 209092162:
                    RunnableC3474.m10621(textInputLayout3, i53);
                    break;
                case -1934794417:
                case 1657175848:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    i7 = i52;
                    str3 = str25;
                    EditText m5905 = C1773.m5905(textInputLayout3);
                    C0714.m2808(m5905);
                    str19 = C0422.m1959(C4117.m12350(m5905));
                    EditText m59052 = C1773.m5905(textInputLayout2);
                    C0714.m2808(m59052);
                    str20 = C0422.m1959(C2958.m9028(m59052));
                    boolean z2 = c14;
                    if (C3016.m9237((CharSequence) str19, (CharSequence) C2958.m9031(f10875, 136, 1, i62), z2)) {
                        m25663 = (i59 - C2105.m6981("᩺ᩳ")) * (-31);
                        i12 = ((m25663 ^ i58) * 18397) ^ 567460849;
                        i21 = 2013987994;
                        c11 = z2;
                    } else {
                        m25663 = (C0630.m2566("ۡ۬") ^ i58) * 81;
                        i12 = ((m25663 ^ i59) * 16083) ^ 974330082;
                        i21 = -917933553;
                        c11 = z2;
                    }
                    i61 = m25663 ^ i21;
                    c10 = c11;
                    str24 = str2;
                    str25 = str3;
                    c14 = c10;
                    i60 = i12;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case -1887059668:
                case 2079845209:
                    sArr = sArr7;
                    i28 = i63;
                    if (C23343.m51755(str23)) {
                        m69813 = C0630.m2566("ۨܺ") ^ i58;
                        i29 = ((m69813 ^ i59) * (-20627)) ^ 553978643;
                        i30 = -1020892346;
                    } else {
                        m69813 = (C0630.m2566("ۖ۟") + i59) * (-63);
                        i29 = ((m69813 ^ i58) * 9537) ^ 1586678268;
                        i30 = 479808964;
                    }
                    i61 = m69813 ^ i30;
                    i60 = i29;
                    sArr7 = sArr;
                    i63 = i28;
                case -1871526786:
                case 1486009304:
                    m10524();
                    C11340.m28020(new Thread(new RunnableC2904(bArr7, str22, str23, viewOnClickListenerC3441.f10885, new C21786(viewOnClickListenerC3441))));
                    break;
                case -1850813788:
                case 48810883:
                    break;
                case -1774589362:
                case -795735177:
                    AbstractC2021.m6571(textInputLayout2, C2105.m6981(ServiceConnectionC3453.m10568(f10875, 168, 3, i62)) ^ 2116126918);
                    break;
                case -1761275357:
                case -1559261434:
                    sArr = sArr7;
                    i28 = i63;
                    if (C23343.m51758(str22)) {
                        m69813 = (i58 - C0630.m2566("᩶ۧ")) * (-121);
                        i29 = ((m69813 ^ i59) * (-907)) ^ 1297422864;
                        i30 = -1130826473;
                    } else {
                        m69813 = (C0630.m2566("ۧ᩵") + i59) * (-49);
                        i29 = ((m69813 ^ i58) * 23179) ^ (-863151578);
                        i30 = 666218351;
                    }
                    i61 = m69813 ^ i30;
                    i60 = i29;
                    sArr7 = sArr;
                    i63 = i28;
                case -1661783475:
                case -102710567:
                    sArr4 = sArr7;
                    i15 = i63;
                    str6 = str22;
                    c3 = c14;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator2 = accelerateInterpolator5;
                    i16 = i66;
                    i17 = i67;
                    fArr2 = fArr6;
                    j2 = j6;
                    c192582 = c192587;
                    i5 = i53;
                    i6 = i65;
                    objectAnimator3 = objectAnimator8;
                    str7 = str24;
                    i18 = i52;
                    str8 = str25;
                    boolean z3 = viewOnClickListenerC3441.f10878;
                    bArr2 = viewOnClickListenerC3441.f10876;
                    z = z3;
                    i54 = C2105.m6981(C4616.m13542(f10875, 127, 3, i62));
                    if (C1420.f5096 <= 0) {
                        objectAnimator4 = objectAnimator;
                        int m69819 = (C2105.m6981("ۨۧ") ^ i59) * 3;
                        i41 = ((m69819 ^ i58) * 22837) ^ (-1366320427);
                        i61 = m69819 ^ (-414700587);
                        viewOnClickListenerC3441 = this;
                        str24 = str7;
                        i66 = i16;
                        str25 = str8;
                        c14 = c3;
                        bArr7 = bArr2;
                        c192587 = c192582;
                        i52 = i18;
                        sArr7 = sArr4;
                        j6 = j2;
                        i63 = i15;
                        fArr6 = fArr2;
                        i67 = i17;
                        accelerateInterpolator5 = accelerateInterpolator2;
                        objectAnimator8 = objectAnimator3;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator4;
                        i60 = i41;
                        str22 = str6;
                    } else {
                        int m698110 = C2105.m6981("۠᩹") ^ i59;
                        i60 = ((m698110 ^ i58) * (-6229)) ^ (-111725503);
                        i61 = m698110 ^ (-1624796960);
                        viewOnClickListenerC3441 = this;
                        str24 = str7;
                        i66 = i16;
                        str25 = str8;
                        c14 = c3;
                        bArr7 = bArr2;
                        c192587 = c192582;
                        i52 = i18;
                        sArr7 = sArr4;
                        j6 = j2;
                        i63 = i15;
                        str22 = str6;
                        fArr6 = fArr2;
                        i67 = i17;
                        accelerateInterpolator5 = accelerateInterpolator2;
                        objectAnimator8 = objectAnimator3;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator;
                    }
                case -1466961312:
                case 1238844114:
                    sArr5 = sArr7;
                    if (!C23343.m51759(str19)) {
                        m69815 = C2105.m6981("ۖ۠") ^ i58;
                        i48 = ((m69815 ^ i59) * (-27323)) ^ 15530175;
                        i49 = 1982582473;
                        i61 = m69815 ^ i49;
                        i60 = i48;
                        sArr7 = sArr5;
                    }
                    m69815 = C2105.m6981("ܶܺ") ^ i58;
                    i48 = ((m69815 ^ i59) * 19871) ^ (-147660951);
                    i49 = -1623871293;
                    i61 = m69815 ^ i49;
                    i60 = i48;
                    sArr7 = sArr5;
                case -1425325886:
                case 1912724910:
                    C1047.m3599();
                    C4117.m12364();
                    break;
                case -1356139100:
                case 1450210003:
                    sArr5 = sArr7;
                    int i72 = i66;
                    if (C0798.m3007(str19) < i72) {
                        m69814 = (C2105.m6981("᩹ۗ") ^ i59) * (-17);
                        i46 = ((m69814 ^ i58) * 18843) ^ (-753524765);
                        i47 = 1159003692;
                    } else {
                        m69814 = C2105.m6981("֨۬") ^ i59;
                        i46 = ((m69814 ^ i58) * 25945) ^ 1801087530;
                        i47 = -421576003;
                    }
                    i61 = m69814 ^ i47;
                    i66 = i72;
                    i60 = i46;
                    sArr7 = sArr5;
                case -1329057079:
                case 637898963:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    i10 = i64;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    sArr3 = sArr6;
                    i11 = i68;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    c2 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str4 = str24;
                    i7 = i52;
                    str5 = str25;
                    i62 = o.a.F;
                    int m25669 = C0630.m2566("ᩴ᩻") ^ i58;
                    i64 = i10;
                    i60 = ((m25669 ^ i59) * 13193) ^ (-139321472);
                    i61 = m25669 ^ 1818274093;
                    viewOnClickListenerC3441 = this;
                    str24 = str4;
                    str25 = str5;
                    c14 = c2;
                    sArr6 = sArr3;
                    i68 = i11;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case -1320529489:
                case 1792193247:
                    C7811.m20844();
                    if (C3683.f11629 < 0) {
                        sArr4 = sArr7;
                        i15 = i63;
                        str6 = str22;
                        objectAnimator4 = objectAnimator9;
                        accelerateInterpolator2 = accelerateInterpolator5;
                        i16 = i66;
                        i17 = i67;
                        fArr2 = fArr6;
                        j2 = j6;
                        c192582 = c192587;
                        i5 = i53;
                        bArr2 = bArr7;
                        c3 = c14;
                        i6 = i65;
                        objectAnimator3 = objectAnimator8;
                        str7 = str24;
                        i18 = i52;
                        str8 = str25;
                        int m698192 = (C2105.m6981("ۨۧ") ^ i59) * 3;
                        i41 = ((m698192 ^ i58) * 22837) ^ (-1366320427);
                        i61 = m698192 ^ (-414700587);
                        viewOnClickListenerC3441 = this;
                        str24 = str7;
                        i66 = i16;
                        str25 = str8;
                        c14 = c3;
                        bArr7 = bArr2;
                        c192587 = c192582;
                        i52 = i18;
                        sArr7 = sArr4;
                        j6 = j2;
                        i63 = i15;
                        fArr6 = fArr2;
                        i67 = i17;
                        accelerateInterpolator5 = accelerateInterpolator2;
                        objectAnimator8 = objectAnimator3;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator4;
                        i60 = i41;
                        str22 = str6;
                    } else {
                        sArr5 = sArr7;
                        i45 = i63;
                        str18 = str22;
                        objectAnimator7 = objectAnimator9;
                        accelerateInterpolator4 = accelerateInterpolator5;
                        i34 = i66;
                        fArr5 = fArr6;
                        c192586 = c192587;
                        i43 = i53;
                        bArr6 = bArr7;
                        i44 = i65;
                        m3008 = objectAnimator8;
                        str17 = str24;
                        i42 = i52;
                        view2 = view3;
                        int m698111 = C2105.m6981("ۤۚ") ^ i58;
                        i61 = m698111 ^ (-1711599426);
                        str24 = str17;
                        view3 = view2;
                        i65 = i44;
                        i60 = ((m698111 ^ i59) * (-26239)) ^ (-316261905);
                        i53 = i43;
                        c192587 = c192586;
                        i52 = i42;
                        i63 = i45;
                        objectAnimator9 = objectAnimator7;
                        str22 = str18;
                        fArr6 = fArr5;
                        objectAnimator8 = m3008;
                        accelerateInterpolator5 = accelerateInterpolator4;
                        bArr7 = bArr6;
                        i66 = i34;
                        sArr7 = sArr5;
                    }
                case -1277646908:
                case 808438098:
                    sArr5 = sArr7;
                    i33 = i63;
                    str14 = str22;
                    objectAnimator5 = objectAnimator9;
                    accelerateInterpolator3 = accelerateInterpolator5;
                    i34 = i66;
                    i35 = i67;
                    fArr4 = fArr6;
                    j5 = j6;
                    str15 = str25;
                    c192585 = c192587;
                    i36 = i53;
                    bArr5 = bArr7;
                    c12 = c14;
                    i37 = i65;
                    objectAnimator6 = objectAnimator8;
                    str16 = str24;
                    i38 = i54 ^ 2124811775;
                    str21 = C0382.m1840(f10875, 130, 3, i62);
                    if (C1005.m3501()) {
                        m25665 = (C0630.m2566("۟᩺") + i58) * 63;
                        i39 = ((m25665 ^ i59) * 30431) ^ 1988322225;
                        i40 = -1244698725;
                        i61 = m25665 ^ i40;
                        str24 = str16;
                        str25 = str15;
                        i60 = i39;
                        i52 = i38;
                        objectAnimator8 = objectAnimator6;
                        c192587 = c192585;
                        j6 = j5;
                        i63 = i33;
                        str22 = str14;
                        fArr6 = fArr4;
                        i67 = i35;
                        i65 = i37;
                        c14 = c12;
                        accelerateInterpolator5 = accelerateInterpolator3;
                        i53 = i36;
                        bArr7 = bArr5;
                        objectAnimator9 = objectAnimator5;
                        i66 = i34;
                        sArr7 = sArr5;
                    }
                    m25665 = C0630.m2566("ᩳۨ") ^ i59;
                    i39 = ((m25665 ^ i58) * 15103) ^ 1731825139;
                    i40 = -1137876963;
                    i61 = m25665 ^ i40;
                    str24 = str16;
                    str25 = str15;
                    i60 = i39;
                    i52 = i38;
                    objectAnimator8 = objectAnimator6;
                    c192587 = c192585;
                    j6 = j5;
                    i63 = i33;
                    str22 = str14;
                    fArr6 = fArr4;
                    i67 = i35;
                    i65 = i37;
                    c14 = c12;
                    accelerateInterpolator5 = accelerateInterpolator3;
                    i53 = i36;
                    bArr7 = bArr5;
                    objectAnimator9 = objectAnimator5;
                    i66 = i34;
                    sArr7 = sArr5;
                case -1244051190:
                case 1813793948:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    char c16 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    String str26 = str24;
                    i7 = i52;
                    String str27 = str25;
                    boolean z4 = viewOnClickListenerC3441.f10878;
                    View view4 = viewOnClickListenerC3441.f10879;
                    if (z4) {
                        m6981 = (i58 - C2105.m6981("ᩴ᩷")) * (-9);
                        i19 = ((m6981 ^ i59) * 24299) ^ (-1490543928);
                        i20 = -326357644;
                    } else {
                        m6981 = C2105.m6981("ᩳ۠") ^ i58;
                        i19 = ((m6981 ^ i59) * 9139) ^ 1783751678;
                        i20 = 848092503;
                    }
                    i61 = m6981 ^ i20;
                    str24 = str26;
                    str25 = str27;
                    c14 = c16;
                    view3 = view4;
                    i60 = i19;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case -1236162565:
                case -363762775:
                    C2272.m7503();
                    if (!C1504.f5354) {
                        m25666 = (C0630.m2566("ۢ᩹") + i58) * 99;
                        i50 = ((m25666 ^ i59) * (-24345)) ^ 690239058;
                        i51 = -912027106;
                        i61 = m25666 ^ i51;
                        i60 = i50;
                    }
                    m25666 = C0630.m2566("ۜ᩹") ^ i58;
                    i50 = ((m25666 ^ i59) * 23281) ^ 1832070348;
                    i51 = -742936161;
                    i61 = m25666 ^ i51;
                    i60 = i50;
                case -1236038616:
                case 305077768:
                    sArr5 = sArr7;
                    if (!C23343.m51755(str19)) {
                        m69815 = (C2105.m6981("ۜ۬") + i59) * 73;
                        i48 = ((m69815 ^ i58) * (-21233)) ^ (-1332970047);
                        i49 = 296996462;
                        i61 = m69815 ^ i49;
                        i60 = i48;
                        sArr7 = sArr5;
                    }
                    m69815 = C2105.m6981("ܶܺ") ^ i58;
                    i48 = ((m69815 ^ i59) * 19871) ^ (-147660951);
                    i49 = -1623871293;
                    i61 = m69815 ^ i49;
                    i60 = i48;
                    sArr7 = sArr5;
                case -1148654300:
                case -858679612:
                    C2520.m8029(c192587, C0630.m2566(C2958.m9031(sArr7, 180, 3, i62)) ^ 2126072608, null);
                    C3683.m11213(c192587);
                    break;
                case -1124191250:
                case 943735709:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    char c17 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    i7 = i52;
                    str3 = str25;
                    RunnableC0588.m2430(view, C2105.m6988(f10875, UMErrorCode.E_UM_BE_NOT_MAINPROCESS, 1, i62));
                    i64 = C0798.m3006(view);
                    sArr6 = f10875;
                    i68 = UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
                    if (C21923.m49329()) {
                        textInputLayout = textInputLayout2;
                        c7 = c17;
                        int m25667222 = C0630.m2566("۫ۨ") ^ i59;
                        i60 = ((m25667222 ^ i58) * (-21781)) ^ 10352583;
                        i61 = m25667222 ^ 67316660;
                        viewOnClickListenerC3441 = this;
                        str24 = str2;
                        str25 = str3;
                        c6 = c7;
                        textInputLayout2 = textInputLayout;
                        c192587 = c19258;
                        i52 = i7;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        c14 = c6;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        bArr7 = bArr;
                        i66 = i2;
                        i65 = i6;
                        i53 = i5;
                        sArr7 = sArr;
                        objectAnimator9 = objectAnimator;
                    } else {
                        int m256610 = C0630.m2566("᩹ܳ") ^ i58;
                        i12 = ((m256610 ^ i59) * (-26997)) ^ (-1593186740);
                        i61 = m256610 ^ 728420294;
                        viewOnClickListenerC3441 = this;
                        c10 = c17;
                        str24 = str2;
                        str25 = str3;
                        c14 = c10;
                        i60 = i12;
                        c192587 = c19258;
                        i52 = i7;
                        bArr7 = bArr;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        i66 = i2;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        sArr7 = sArr;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator;
                    }
                case -1112933473:
                case 13582165:
                    sArr5 = sArr7;
                    byte[] bArr8 = bArr7;
                    str6 = str22;
                    char c18 = c14;
                    int i73 = i65;
                    ObjectAnimator objectAnimator10 = objectAnimator9;
                    AccelerateInterpolator accelerateInterpolator6 = accelerateInterpolator5;
                    ObjectAnimator objectAnimator11 = objectAnimator8;
                    int i74 = i67;
                    float[] fArr8 = fArr6;
                    long j7 = j6;
                    C19258 c192588 = c192587;
                    int i75 = i52;
                    String str28 = str24;
                    String str29 = str25;
                    int m256611 = C0630.m2566(str21) ^ 2101624237;
                    i63 = C2105.m6981(C4117.m12355(f10875, 133, 3, i62)) ^ 2118590023;
                    TextInputLayout textInputLayout4 = viewOnClickListenerC3441.f10887;
                    textInputLayout3 = viewOnClickListenerC3441.f10880;
                    if (z) {
                        int m256612 = C0630.m2566("ᩳ֡") ^ i59;
                        int i76 = ((m256612 ^ i58) * 11165) ^ 1936136791;
                        i61 = m256612 ^ 1303467045;
                        str24 = str28;
                        str25 = str29;
                        c14 = c18;
                        c192587 = c192588;
                        i52 = i75;
                        bArr7 = bArr8;
                        j6 = j7;
                        objectAnimator9 = objectAnimator10;
                        str22 = str6;
                        fArr6 = fArr8;
                        i67 = i74;
                        i66 = 4;
                        accelerateInterpolator5 = accelerateInterpolator6;
                        objectAnimator8 = objectAnimator11;
                        i65 = i73;
                        i53 = m256611;
                        i60 = i76;
                        textInputLayout2 = textInputLayout4;
                        sArr7 = sArr5;
                    } else {
                        int m256613 = C0630.m2566("ۧ᩹") ^ i58;
                        i41 = ((m256613 ^ i59) * (-8825)) ^ 1274103893;
                        i61 = m256613 ^ (-1583863491);
                        str24 = str28;
                        textInputLayout2 = textInputLayout4;
                        str25 = str29;
                        c14 = c18;
                        c192587 = c192588;
                        i52 = i75;
                        bArr7 = bArr8;
                        sArr7 = sArr5;
                        j6 = j7;
                        objectAnimator9 = objectAnimator10;
                        fArr6 = fArr8;
                        i67 = i74;
                        i66 = 4;
                        accelerateInterpolator5 = accelerateInterpolator6;
                        objectAnimator8 = objectAnimator11;
                        i65 = i73;
                        i53 = m256611;
                        i60 = i41;
                        str22 = str6;
                    }
                case -1060707094:
                case -992562246:
                    AbstractC2021.m6571(textInputLayout2, C2105.m6981(C1047.m3603(f10875, 165, 3, i62)) ^ 2128179346);
                    break;
                case -1000339089:
                case 649565128:
                    if (C1047.f3863 >= 0) {
                        sArr5 = sArr7;
                        i33 = i63;
                        str14 = str22;
                        objectAnimator5 = objectAnimator9;
                        accelerateInterpolator3 = accelerateInterpolator5;
                        i34 = i66;
                        i35 = i67;
                        fArr4 = fArr6;
                        j5 = j6;
                        c192585 = c192587;
                        i36 = i53;
                        bArr5 = bArr7;
                        c12 = c14;
                        i37 = i65;
                        objectAnimator6 = objectAnimator8;
                        str16 = str24;
                        i38 = i52;
                        str15 = str25;
                        m25665 = C0630.m2566("ᩳۨ") ^ i59;
                        i39 = ((m25665 ^ i58) * 15103) ^ 1731825139;
                        i40 = -1137876963;
                        i61 = m25665 ^ i40;
                        str24 = str16;
                        str25 = str15;
                        i60 = i39;
                        i52 = i38;
                        objectAnimator8 = objectAnimator6;
                        c192587 = c192585;
                        j6 = j5;
                        i63 = i33;
                        str22 = str14;
                        fArr6 = fArr4;
                        i67 = i35;
                        i65 = i37;
                        c14 = c12;
                        accelerateInterpolator5 = accelerateInterpolator3;
                        i53 = i36;
                        bArr7 = bArr5;
                        objectAnimator9 = objectAnimator5;
                        i66 = i34;
                        sArr7 = sArr5;
                    } else {
                        sArr4 = sArr7;
                        i15 = i63;
                        str6 = str22;
                        objectAnimator4 = objectAnimator9;
                        accelerateInterpolator2 = accelerateInterpolator5;
                        i16 = i66;
                        i17 = i67;
                        fArr2 = fArr6;
                        j2 = j6;
                        c192582 = c192587;
                        i5 = i53;
                        bArr2 = bArr7;
                        c3 = c14;
                        i6 = i65;
                        objectAnimator3 = objectAnimator8;
                        str7 = str24;
                        i18 = i52;
                        str8 = str25;
                        int m6981922 = (C2105.m6981("ۨۧ") ^ i59) * 3;
                        i41 = ((m6981922 ^ i58) * 22837) ^ (-1366320427);
                        i61 = m6981922 ^ (-414700587);
                        viewOnClickListenerC3441 = this;
                        str24 = str7;
                        i66 = i16;
                        str25 = str8;
                        c14 = c3;
                        bArr7 = bArr2;
                        c192587 = c192582;
                        i52 = i18;
                        sArr7 = sArr4;
                        j6 = j2;
                        i63 = i15;
                        fArr6 = fArr2;
                        i67 = i17;
                        accelerateInterpolator5 = accelerateInterpolator2;
                        objectAnimator8 = objectAnimator3;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator4;
                        i60 = i41;
                        str22 = str6;
                    }
                case -975632478:
                case 122995615:
                    AbstractC2021.m6571(textInputLayout3, i63);
                    break;
                case -947289384:
                case -871102433:
                    if (C0237.m1481() >= 0) {
                        sArr = sArr7;
                        i = i63;
                        str = str22;
                        objectAnimator = objectAnimator9;
                        accelerateInterpolator = accelerateInterpolator5;
                        i2 = i66;
                        i3 = i67;
                        fArr = fArr6;
                        j = j6;
                        c19258 = c192587;
                        i5 = i53;
                        bArr = bArr7;
                        c7 = c14;
                        i6 = i65;
                        objectAnimator2 = objectAnimator8;
                        str2 = str24;
                        textInputLayout = textInputLayout2;
                        i7 = i52;
                        str3 = str25;
                        int m256672222 = C0630.m2566("۫ۨ") ^ i59;
                        i60 = ((m256672222 ^ i58) * (-21781)) ^ 10352583;
                        i61 = m256672222 ^ 67316660;
                        viewOnClickListenerC3441 = this;
                        str24 = str2;
                        str25 = str3;
                        c6 = c7;
                        textInputLayout2 = textInputLayout;
                        c192587 = c19258;
                        i52 = i7;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        c14 = c6;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        bArr7 = bArr;
                        i66 = i2;
                        i65 = i6;
                        i53 = i5;
                        sArr7 = sArr;
                        objectAnimator9 = objectAnimator;
                    } else {
                        m25666 = C0630.m2566("ۜ᩹") ^ i58;
                        i50 = ((m25666 ^ i59) * 23281) ^ 1832070348;
                        i51 = -742936161;
                        i61 = m25666 ^ i51;
                        i60 = i50;
                    }
                case -899323089:
                case -172262024:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    char c19 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    i7 = i52;
                    str3 = str25;
                    TextInputLayout[] textInputLayoutArr = new TextInputLayout[i6];
                    textInputLayoutArr[c19 == true ? 1 : 0] = textInputLayout3;
                    textInputLayoutArr[c13] = textInputLayout2;
                    c5 = c19;
                    if (!C0287.m1632(textInputLayoutArr)) {
                        m25663 = C0630.m2566("ۡᩴ") ^ i59;
                        i12 = ((m25663 ^ i58) * 24587) ^ (-1536255774);
                        i21 = -842127696;
                        c11 = c19;
                        i61 = m25663 ^ i21;
                        c10 = c11;
                        str24 = str2;
                        str25 = str3;
                        c14 = c10;
                        i60 = i12;
                        c192587 = c19258;
                        i52 = i7;
                        bArr7 = bArr;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        i66 = i2;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        sArr7 = sArr;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator;
                    }
                    i13 = i64;
                    c9 = c5;
                    m25662 = C0630.m2566("֫ۖ") ^ i59;
                    i12 = ((m25662 ^ i58) * 24819) ^ 1533264498;
                    i14 = -1377776861;
                    c8 = c9;
                    i61 = m25662 ^ i14;
                    viewOnClickListenerC3441 = this;
                    i64 = i13;
                    c10 = c8;
                    str24 = str2;
                    str25 = str3;
                    c14 = c10;
                    i60 = i12;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case -887688656:
                case 81143665:
                    sArr = sArr7;
                    i28 = i63;
                    if (C0798.m3007(str20) < 7) {
                        m69813 = C2105.m6981("ۛܿ") ^ i59;
                        i29 = ((m69813 ^ i58) * (-9141)) ^ 1768002840;
                        i30 = 1809768021;
                    } else {
                        m69813 = C2105.m6981("ܺ᩺") ^ i58;
                        i29 = ((m69813 ^ i59) * 10589) ^ (-910475000);
                        i30 = 974071237;
                    }
                    i61 = m69813 ^ i30;
                    i60 = i29;
                    sArr7 = sArr;
                    i63 = i28;
                case -841455361:
                case -772273030:
                    if (C1294.f4556 < 0) {
                        sArr4 = sArr7;
                        i15 = i63;
                        str6 = str22;
                        objectAnimator4 = objectAnimator9;
                        accelerateInterpolator2 = accelerateInterpolator5;
                        i16 = i66;
                        i17 = i67;
                        fArr2 = fArr6;
                        j2 = j6;
                        c192582 = c192587;
                        i5 = i53;
                        bArr2 = bArr7;
                        c3 = c14;
                        i6 = i65;
                        objectAnimator3 = objectAnimator8;
                        str7 = str24;
                        i18 = i52;
                        str8 = str25;
                        int m69819222 = (C2105.m6981("ۨۧ") ^ i59) * 3;
                        i41 = ((m69819222 ^ i58) * 22837) ^ (-1366320427);
                        i61 = m69819222 ^ (-414700587);
                        viewOnClickListenerC3441 = this;
                        str24 = str7;
                        i66 = i16;
                        str25 = str8;
                        c14 = c3;
                        bArr7 = bArr2;
                        c192587 = c192582;
                        i52 = i18;
                        sArr7 = sArr4;
                        j6 = j2;
                        i63 = i15;
                        fArr6 = fArr2;
                        i67 = i17;
                        accelerateInterpolator5 = accelerateInterpolator2;
                        objectAnimator8 = objectAnimator3;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator4;
                        i60 = i41;
                        str22 = str6;
                    } else {
                        m25666 = C0630.m2566("ۗ֫") ^ i59;
                        i50 = ((m25666 ^ i58) * 16785) ^ (-2142005105);
                        i51 = -1983906729;
                        i61 = m25666 ^ i51;
                        i60 = i50;
                    }
                case -654609197:
                case 416529981:
                    c192582 = c192587;
                    sArr4 = sArr7;
                    ObjectAnimator objectAnimator12 = objectAnimator8;
                    i16 = i66;
                    i18 = i52;
                    int i77 = i65;
                    objectAnimator3 = objectAnimator12;
                    float[] fArr9 = new float[i77];
                    fArr9[c14] = -f2;
                    fArr9[c13] = f;
                    View view5 = view3;
                    str7 = str24;
                    ObjectAnimator m16025 = C5695.m16025(view5, str7, fArr9);
                    i5 = i53;
                    long j8 = j6;
                    objectAnimator4 = C1711.m5730(m16025, j8);
                    j2 = j8;
                    str8 = str25;
                    C4159.m12575(objectAnimator4, str8);
                    AccelerateInterpolator accelerateInterpolator7 = new AccelerateInterpolator();
                    if (RunnableC1108.f4040) {
                        int m698112 = (C2105.m6981("ܺ۠") ^ i59) * 85;
                        i60 = ((m698112 ^ i58) * 30829) ^ 399994218;
                        i61 = m698112 ^ 1743059109;
                        str24 = str7;
                        str25 = str8;
                        c192587 = c192582;
                        i52 = i18;
                        view3 = view5;
                        j6 = j2;
                        i66 = i16;
                        accelerateInterpolator5 = accelerateInterpolator7;
                        objectAnimator8 = objectAnimator3;
                        i53 = i5;
                        sArr7 = sArr4;
                        objectAnimator9 = objectAnimator4;
                        i65 = i77;
                    } else {
                        i15 = i63;
                        str6 = str22;
                        view3 = view5;
                        i17 = i67;
                        fArr2 = fArr6;
                        bArr2 = bArr7;
                        c3 = c14;
                        accelerateInterpolator2 = accelerateInterpolator7;
                        i6 = i77;
                        int m698192222 = (C2105.m6981("ۨۧ") ^ i59) * 3;
                        i41 = ((m698192222 ^ i58) * 22837) ^ (-1366320427);
                        i61 = m698192222 ^ (-414700587);
                        viewOnClickListenerC3441 = this;
                        str24 = str7;
                        i66 = i16;
                        str25 = str8;
                        c14 = c3;
                        bArr7 = bArr2;
                        c192587 = c192582;
                        i52 = i18;
                        sArr7 = sArr4;
                        j6 = j2;
                        i63 = i15;
                        fArr6 = fArr2;
                        i67 = i17;
                        accelerateInterpolator5 = accelerateInterpolator2;
                        objectAnimator8 = objectAnimator3;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator4;
                        i60 = i41;
                        str22 = str6;
                    }
                case -526170410:
                case 1848408946:
                    sArr = sArr7;
                    i28 = i63;
                    if (C23343.m51757(str20)) {
                        m69813 = C2105.m6981("᩻ᩳ") ^ i58;
                        i29 = ((m69813 ^ i59) * (-30125)) ^ (-1355045885);
                        i30 = 2089832097;
                    } else {
                        m69813 = (i59 - C2105.m6981("ۚ֫")) * (-35);
                        i29 = ((m69813 ^ i58) * 2887) ^ 40828698;
                        i30 = -2016083396;
                    }
                    i61 = m69813 ^ i30;
                    i60 = i29;
                    sArr7 = sArr;
                    i63 = i28;
                case -430911016:
                case 1816473853:
                    sArr = sArr7;
                    i22 = i63;
                    str9 = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    fArr3 = fArr6;
                    j3 = j6;
                    c192583 = c192587;
                    i5 = i53;
                    bArr3 = bArr7;
                    c4 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str10 = str24;
                    i23 = i52;
                    str11 = str25;
                    m11931 = -C0237.m1480(view3);
                    i67 = m11931;
                    int m256614 = C0630.m2566("᩵ۡ") ^ i59;
                    i61 = m256614 ^ (-1155018151);
                    str24 = str10;
                    str25 = str11;
                    c14 = c4;
                    i60 = ((m256614 ^ i58) * 24411) ^ (-1206157047);
                    c192587 = c192583;
                    i52 = i23;
                    bArr7 = bArr3;
                    j6 = j3;
                    i63 = i22;
                    str22 = str9;
                    fArr6 = fArr3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case -300440102:
                case 1544545363:
                    sArr = sArr7;
                    C7106.m19114(c192587, C2105.m6981(C3245.m9934(f10875, 174, 3, i62)) ^ 2126558200);
                    if (C11340.f33930 >= 0) {
                        i26 = i63;
                        str12 = str22;
                        objectAnimator = objectAnimator9;
                        accelerateInterpolator = accelerateInterpolator5;
                        i2 = i66;
                    } else {
                        i28 = i63;
                        C1294.m4380(c192587, C2105.m6981(C7811.m20837(f10875, 177, 3, i62)) ^ 2124480861, new DialogInterface.OnClickListener(viewOnClickListenerC3441) { // from class: l.۠᩵ۡ

                            /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                            public final /* synthetic */ ViewOnClickListenerC3441 f25703;

                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i78) {
                                String str30 = null;
                                int i79 = 1218622860;
                                int i80 = C3432.f10845;
                                int i81 = C5695.f17556;
                                int m256615 = C0630.m2566("ۤۙ") ^ i80;
                                int i82 = ((m256615 ^ i81) * 28623) ^ (-1742076681);
                                int i83 = 637432182;
                                while (true) {
                                    i79 = ((((i79 ^ i81) * 17103) >> 31) & i82) ^ (m256615 ^ i83);
                                    switch (i79) {
                                        case -2140040484:
                                        case -207368057:
                                            if (C3432.f10845 >= 0) {
                                                m256615 = (C0630.m2566("ۢ᩷") ^ i80) * 47;
                                                i82 = ((m256615 ^ i81) * (-9831)) ^ 180953208;
                                                i83 = 1801063774;
                                            } else {
                                                m256615 = (C2105.m6981("ᩴᩴ") ^ i81) * (-107);
                                                i82 = ((m256615 ^ i80) * (-21217)) ^ 1061693574;
                                                i83 = 88013500;
                                            }
                                        case -1863649749:
                                        case -1300130358:
                                            if (C1420.f5096 <= 0) {
                                                m256615 = (i81 - C0630.m2566("۫۫")) * (-65);
                                                i82 = ((m256615 ^ i80) * 26113) ^ (-1217060644);
                                                i83 = 504283158;
                                            } else {
                                                m256615 = C0630.m2566("᩶ۧ") ^ i81;
                                                i82 = ((m256615 ^ i80) * 715) ^ (-2088189382);
                                                i83 = 376889677;
                                            }
                                        case -1563893358:
                                        case -378026352:
                                            if (C1916.f6442) {
                                                m256615 = C0630.m2566("۬ܶ") ^ i80;
                                                i82 = ((m256615 ^ i81) * (-22859)) ^ 1031741201;
                                                i83 = 1121792557;
                                            } else {
                                                m256615 = (C0630.m2566("ۢ᩷") ^ i80) * 47;
                                                i82 = ((m256615 ^ i81) * (-9831)) ^ 180953208;
                                                i83 = 1801063774;
                                            }
                                        case -1451259035:
                                        case -111615729:
                                            str30 = str22;
                                            if (C1504.f5354) {
                                                m256615 = (i81 - C2105.m6981("ۜۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i82 = ((m256615 ^ i80) * (-16159)) ^ (-1552276791);
                                                i83 = -373497562;
                                            } else {
                                                m256615 = (i81 - C0630.m2566("ۚ᩻")) * (-105);
                                                i82 = ((m256615 ^ i80) * (-8147)) ^ (-1163473176);
                                                i83 = 2085919291;
                                            }
                                        case -951806660:
                                        case 1109974805:
                                            if (AbstractC2021.f6743 <= 0) {
                                                m256615 = (C0630.m2566("ۢ᩷") ^ i80) * 47;
                                                i82 = ((m256615 ^ i81) * (-9831)) ^ 180953208;
                                                i83 = 1801063774;
                                            } else {
                                                m256615 = C2105.m6981("ۡ᩻") ^ i80;
                                                i82 = ((m256615 ^ i81) * 16683) ^ (-2031654787);
                                                i83 = 476790775;
                                            }
                                        case -930009951:
                                        case 1711761923:
                                            ViewOnClickListenerC3441.m10519(this.f25703, str30, str23);
                                            break;
                                        case -920636207:
                                        case 1435973421:
                                            C21923.m49329();
                                            if (C1711.m5736() <= 0) {
                                                m256615 = (i81 - C0630.m2566("۫۫")) * (-65);
                                                i82 = ((m256615 ^ i80) * 26113) ^ (-1217060644);
                                                i83 = 504283158;
                                            } else {
                                                m256615 = (i80 - C2105.m6981("ۙ᩵")) * (-47);
                                                i82 = ((m256615 ^ i81) * 9725) ^ (-1119172998);
                                                i83 = 250486957;
                                            }
                                        case -813614975:
                                        case -510499212:
                                            C0483.m2121();
                                            C0422.m1963();
                                            m256615 = (i81 - C0630.m2566("۫۫")) * (-65);
                                            i82 = ((m256615 ^ i80) * 26113) ^ (-1217060644);
                                            i83 = 504283158;
                                        case -567585121:
                                        case 1313285964:
                                            C1128.m3851();
                                            if (C3432.f10845 >= 0) {
                                                m256615 = (i81 - C0630.m2566("۫۫")) * (-65);
                                                i82 = ((m256615 ^ i80) * 26113) ^ (-1217060644);
                                                i83 = 504283158;
                                            } else {
                                                m256615 = (C0630.m2566("ۢ᩷") ^ i80) * 47;
                                                i82 = ((m256615 ^ i81) * (-9831)) ^ 180953208;
                                                i83 = 1801063774;
                                            }
                                        case -328957172:
                                        case 1979958326:
                                            if (C3683.m11222()) {
                                                m256615 = (C0630.m2566("ۢ᩷") ^ i80) * 47;
                                                i82 = ((m256615 ^ i81) * (-9831)) ^ 180953208;
                                                i83 = 1801063774;
                                            } else {
                                                m256615 = C2105.m6981("᩺ܿ") ^ i81;
                                                i82 = ((m256615 ^ i80) * (-27695)) ^ (-1791354825);
                                                i83 = 31342655;
                                            }
                                        case -320185235:
                                        case 1245392064:
                                            if (RunnableC1937.f6483 >= 0) {
                                                m256615 = (i81 - C0630.m2566("۫۫")) * (-65);
                                                i82 = ((m256615 ^ i80) * 26113) ^ (-1217060644);
                                                i83 = 504283158;
                                            } else {
                                                m256615 = (C2105.m6981("֫֫") + i80) * 109;
                                                i82 = ((m256615 ^ i81) * 18251) ^ (-1473676836);
                                                i83 = 1540413181;
                                            }
                                        case -137775921:
                                        case 36671527:
                                            if (C4075.f12947 >= 0) {
                                                m256615 = (i81 - C2105.m6981("ۜۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i82 = ((m256615 ^ i80) * (-16159)) ^ (-1552276791);
                                                i83 = -373497562;
                                            } else {
                                                m256615 = (i81 - C0630.m2566("᩻ܽ")) * (-31);
                                                i82 = ((m256615 ^ i80) * 30599) ^ (-646107247);
                                                i83 = -1428955495;
                                            }
                                        case -79496661:
                                        case 1524212171:
                                            if (C1128.m3851() <= 0) {
                                                m256615 = (C2105.m6981("ᩴᩴ") ^ i81) * (-107);
                                                i82 = ((m256615 ^ i80) * (-21217)) ^ 1061693574;
                                                i83 = 88013500;
                                            } else {
                                                m256615 = (i80 - C0630.m2566("ۧ᩶")) * 41;
                                                i82 = ((m256615 ^ i81) * 23365) ^ 755919224;
                                                i83 = 1450553980;
                                            }
                                        case 854412267:
                                        case 1449764317:
                                            if (C0483.f2088 >= 0) {
                                                m256615 = (i81 - C2105.m6981("ۜۡ")) * BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION;
                                                i82 = ((m256615 ^ i80) * (-16159)) ^ (-1552276791);
                                                i83 = -373497562;
                                            } else {
                                                m256615 = C2105.m6981("ۜ֫") ^ i81;
                                                i82 = ((m256615 ^ i80) * 5035) ^ (-2106914278);
                                                i83 = -1472041465;
                                            }
                                        case 1138599189:
                                        case 1165333535:
                                            if (C0964.f3626 != 0) {
                                                m256615 = (i81 - C0630.m2566("۫۫")) * (-65);
                                                i82 = ((m256615 ^ i80) * 26113) ^ (-1217060644);
                                                i83 = 504283158;
                                            } else {
                                                m256615 = C0630.m2566("ܰ᩺") ^ i80;
                                                i82 = ((m256615 ^ i81) * 13277) ^ 1646842307;
                                                i83 = 400311280;
                                            }
                                        default:
                                            C4117.m12364();
                                            C4159.m12565();
                                            break;
                                    }
                                    return;
                                }
                            }

                            {
                                int i78 = -1582011331;
                                int i79 = RunnableC0588.f2309;
                                int i80 = C3683.f11629;
                                int m698113 = (C2105.m6981("ᩴ᩶") + i80) * (-101);
                                int i81 = ((m698113 ^ i79) * 5453) ^ 102767810;
                                int i82 = 351067630;
                                while (true) {
                                    i78 = ((((i78 ^ i79) * 32419) >> 31) & i81) ^ (m698113 ^ i82);
                                    switch (i78) {
                                        case -1848747557:
                                        case 325290571:
                                            this.f25703 = viewOnClickListenerC3441;
                                            if (RunnableC3474.f10992 <= 0) {
                                                m698113 = (C0630.m2566("֡ۛ") ^ i80) * 69;
                                                i81 = ((m698113 ^ i79) * (-17507)) ^ (-482134224);
                                                i82 = 1259210844;
                                            } else {
                                                m698113 = C0630.m2566("᩸ۡ") ^ i80;
                                                i81 = ((m698113 ^ i79) * (-8487)) ^ (-943452615);
                                                i82 = -1535247308;
                                            }
                                        case -1505225740:
                                        case 133295391:
                                            if (C3245.f10203 <= 0) {
                                                m698113 = (C0630.m2566("ۢ᩸") ^ i80) * 123;
                                                i81 = ((m698113 ^ i79) * 25473) ^ (-1512355681);
                                                i82 = -610075411;
                                            } else {
                                                m698113 = C2105.m6981("ۢۖ") ^ i79;
                                                i81 = ((m698113 ^ i80) * (-11163)) ^ (-1415085534);
                                                i82 = -789319348;
                                            }
                                        case -1487811916:
                                        case -854760227:
                                            if (C1128.m3851() > 0) {
                                                m698113 = (C0630.m2566("֡ۛ") ^ i80) * 69;
                                                i81 = ((m698113 ^ i79) * (-17507)) ^ (-482134224);
                                                i82 = 1259210844;
                                            } else {
                                                m698113 = C0630.m2566("᩷֨") ^ i79;
                                                i81 = ((m698113 ^ i80) * (-25725)) ^ 1892859938;
                                                i82 = -308179517;
                                            }
                                        case -1340528662:
                                        case -1002756840:
                                            if (C3245.f10203 <= 0) {
                                                m698113 = (C2105.m6981("᩶᩷") ^ i80) * (-103);
                                                i81 = ((m698113 ^ i79) * (-8611)) ^ 2075493276;
                                                i82 = -11446096;
                                            } else {
                                                m698113 = C0630.m2566("᩶ۤ") ^ i80;
                                                i81 = ((m698113 ^ i79) * (-14525)) ^ (-1045388881);
                                                i82 = -210429988;
                                            }
                                        case -1269640986:
                                        case 90022694:
                                            if (RunnableC1108.f4040) {
                                                m698113 = (C2105.m6981("᩹ᩳ") + i80) * 95;
                                                i81 = ((m698113 ^ i79) * (-20871)) ^ (-45912678);
                                                i82 = 1553672660;
                                            } else {
                                                m698113 = (C2105.m6981("᩶᩷") ^ i80) * (-103);
                                                i81 = ((m698113 ^ i79) * (-8611)) ^ 2075493276;
                                                i82 = -11446096;
                                            }
                                        case -933388265:
                                        case 1643855356:
                                            C1294.m4372();
                                            if (C3663.m11168() < 0) {
                                                m698113 = (C0630.m2566("֡ۛ") ^ i80) * 69;
                                                i81 = ((m698113 ^ i79) * (-17507)) ^ (-482134224);
                                                i82 = 1259210844;
                                            } else {
                                                m698113 = (C0630.m2566("ۢ᩸") ^ i80) * 123;
                                                i81 = ((m698113 ^ i79) * 25473) ^ (-1512355681);
                                                i82 = -610075411;
                                            }
                                        case -922684163:
                                        case -355284478:
                                            C3911.m11924();
                                            throw new RuntimeException();
                                        case -773746276:
                                        case 569643289:
                                            if (C3537.m10746() <= 0) {
                                                m698113 = (C2105.m6981("᩶᩷") ^ i80) * (-103);
                                                i81 = ((m698113 ^ i79) * (-8611)) ^ 2075493276;
                                                i82 = -11446096;
                                            } else {
                                                m698113 = (C2105.m6981("۫ܿ") + i79) * 19;
                                                i81 = ((m698113 ^ i80) * (-23393)) ^ 1653435512;
                                                i82 = -1623967161;
                                            }
                                        case -486508467:
                                        case 900079185:
                                            return;
                                        case -272498906:
                                        case 1952008317:
                                            C11340.m28031();
                                            if (C7811.f24123 >= 0) {
                                                m698113 = (i79 - C2105.m6981("ۜ۫")) * 43;
                                                i81 = ((m698113 ^ i80) * 23507) ^ 2073312712;
                                                i82 = 939383650;
                                            } else {
                                                m698113 = (C0630.m2566("֡ۛ") ^ i80) * 69;
                                                i81 = ((m698113 ^ i79) * (-17507)) ^ (-482134224);
                                                i82 = 1259210844;
                                            }
                                        case -219130850:
                                        case 1301825706:
                                            if (C1294.f4556 >= 0) {
                                                m698113 = (C2105.m6981("᩶᩷") ^ i80) * (-103);
                                                i81 = ((m698113 ^ i79) * (-8611)) ^ 2075493276;
                                                i82 = -11446096;
                                            } else {
                                                m698113 = C0630.m2566("᩷ܺ") ^ i79;
                                                i81 = ((m698113 ^ i80) * 20399) ^ (-1112932337);
                                                i82 = -1666881750;
                                            }
                                        case -133393809:
                                        case -91106614:
                                            if (C0630.f2410 <= 0) {
                                                m698113 = (C0630.m2566("ۢ᩸") ^ i80) * 123;
                                                i81 = ((m698113 ^ i79) * 25473) ^ (-1512355681);
                                                i82 = -610075411;
                                            } else {
                                                m698113 = C2105.m6981("᩻ۘ") ^ i80;
                                                i81 = ((m698113 ^ i79) * (-14103)) ^ (-1072055446);
                                                i82 = -579797062;
                                            }
                                        case 703858154:
                                        case 916525975:
                                            if (C3911.m11924() <= 0) {
                                                m698113 = C0630.m2566("᩷֨") ^ i79;
                                                i81 = ((m698113 ^ i80) * (-25725)) ^ 1892859938;
                                                i82 = -308179517;
                                            } else {
                                                m698113 = C0630.m2566("ۤ᩹") ^ i80;
                                                i81 = ((m698113 ^ i79) * 24789) ^ 372100838;
                                                i82 = -713875231;
                                            }
                                        case 1225315031:
                                        case 1509310587:
                                            if (C3911.f12484 >= 0) {
                                                m698113 = (C0630.m2566("ۢ᩸") ^ i80) * 123;
                                                i81 = ((m698113 ^ i79) * 25473) ^ (-1512355681);
                                                i82 = -610075411;
                                            } else {
                                                m698113 = (i79 - C2105.m6981("۠ۛ")) * 91;
                                                i81 = ((m698113 ^ i80) * 13995) ^ (-1624875778);
                                                i82 = 1188323894;
                                            }
                                        case 1358497456:
                                        case 1724294138:
                                            if (C2105.f7037 != 0) {
                                                m698113 = (C0630.m2566("֡ۛ") ^ i80) * 69;
                                                i81 = ((m698113 ^ i79) * (-17507)) ^ (-482134224);
                                                i82 = 1259210844;
                                            } else {
                                                m698113 = C0630.m2566("ᩳ᩻") ^ i79;
                                                i81 = ((m698113 ^ i80) * 11141) ^ 1060000032;
                                                i82 = 702649901;
                                            }
                                        default:
                                            C21923.m49329();
                                            m698113 = (i79 - C2105.m6981("ۜ۫")) * 43;
                                            i81 = ((m698113 ^ i80) * 23507) ^ 2073312712;
                                            i82 = 939383650;
                                    }
                                }
                            }
                        });
                        sArr7 = f10875;
                        if (C3245.f10203 <= 0) {
                            sArr = sArr7;
                            str12 = str22;
                            objectAnimator = objectAnimator9;
                            accelerateInterpolator = accelerateInterpolator5;
                            i2 = i66;
                            i26 = i28;
                        } else {
                            int m256615 = (C0630.m2566("ܿۧ") + i58) * (-33);
                            i61 = m256615 ^ (-342332763);
                            i60 = ((m256615 ^ i59) * 631) ^ (-1346934906);
                            i63 = i28;
                        }
                    }
                    i3 = i67;
                    j4 = j6;
                    c192584 = c192587;
                    i5 = i53;
                    bArr4 = bArr7;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    i27 = i52;
                    str13 = str25;
                    int m698172 = (i59 - C2105.m6981("۬֨")) * (-111);
                    i61 = m698172 ^ (-399871483);
                    i60 = ((m698172 ^ i58) * 22765) ^ (-1271637344);
                    str25 = str13;
                    c192587 = c192584;
                    i52 = i27;
                    bArr7 = bArr4;
                    j6 = j4;
                    i63 = i26;
                    str22 = str12;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case -264495568:
                case -222642097:
                    RunnableC3474.m10621(textInputLayout2, i52);
                    break;
                case -206376102:
                case 1654376626:
                    C0714.m2805();
                    if (RunnableC3474.m10630()) {
                        sArr4 = sArr7;
                        i15 = i63;
                        str6 = str22;
                        objectAnimator4 = objectAnimator9;
                        accelerateInterpolator2 = accelerateInterpolator5;
                        i16 = i66;
                        i17 = i67;
                        fArr2 = fArr6;
                        j2 = j6;
                        c192582 = c192587;
                        i5 = i53;
                        bArr2 = bArr7;
                        c3 = c14;
                        i6 = i65;
                        objectAnimator3 = objectAnimator8;
                        str7 = str24;
                        i18 = i52;
                        str8 = str25;
                        int m6981922222 = (C2105.m6981("ۨۧ") ^ i59) * 3;
                        i41 = ((m6981922222 ^ i58) * 22837) ^ (-1366320427);
                        i61 = m6981922222 ^ (-414700587);
                        viewOnClickListenerC3441 = this;
                        str24 = str7;
                        i66 = i16;
                        str25 = str8;
                        c14 = c3;
                        bArr7 = bArr2;
                        c192587 = c192582;
                        i52 = i18;
                        sArr7 = sArr4;
                        j6 = j2;
                        i63 = i15;
                        fArr6 = fArr2;
                        i67 = i17;
                        accelerateInterpolator5 = accelerateInterpolator2;
                        objectAnimator8 = objectAnimator3;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator4;
                        i60 = i41;
                        str22 = str6;
                    } else {
                        m25666 = C2105.m6981("᩺ۡ") ^ i58;
                        i50 = ((m25666 ^ i59) * 12489) ^ 1640181923;
                        i51 = 1056058703;
                        i61 = m25666 ^ i51;
                        i60 = i50;
                    }
                case -133611459:
                case 1002320416:
                    AbstractC2021.m6571(textInputLayout3, i52);
                    break;
                case -128931758:
                case 2039231796:
                    sArr5 = sArr7;
                    i42 = i52;
                    objectAnimator7 = objectAnimator9;
                    accelerateInterpolator4 = accelerateInterpolator5;
                    i34 = i66;
                    view2 = view3;
                    float[] fArr10 = fArr6;
                    c192586 = c192587;
                    i43 = i53;
                    bArr6 = bArr7;
                    i44 = i65;
                    str17 = str24;
                    i45 = i63;
                    str18 = str22;
                    m3008 = C0798.m3008(C5695.m16025(view2, str17, fArr10), 200L);
                    fArr5 = fArr10;
                    String m2575 = C0630.m2575(f10875, 149, 16, i62);
                    C2126.m7031(m3008, m2575);
                    if (RunnableC0588.m2441() >= 0) {
                        str25 = m2575;
                        j6 = 200;
                        int m6981112 = C2105.m6981("ۤۚ") ^ i58;
                        i61 = m6981112 ^ (-1711599426);
                        str24 = str17;
                        view3 = view2;
                        i65 = i44;
                        i60 = ((m6981112 ^ i59) * (-26239)) ^ (-316261905);
                        i53 = i43;
                        c192587 = c192586;
                        i52 = i42;
                        i63 = i45;
                        objectAnimator9 = objectAnimator7;
                        str22 = str18;
                        fArr6 = fArr5;
                        objectAnimator8 = m3008;
                        accelerateInterpolator5 = accelerateInterpolator4;
                        bArr7 = bArr6;
                        i66 = i34;
                        sArr7 = sArr5;
                    } else {
                        int m698113 = C2105.m6981("ۜ֫") ^ i58;
                        i61 = m698113 ^ 1290846277;
                        str25 = m2575;
                        str24 = str17;
                        view3 = view2;
                        i65 = i44;
                        i60 = ((m698113 ^ i59) * (-11647)) ^ 1933167933;
                        i53 = i43;
                        c192587 = c192586;
                        i52 = i42;
                        i63 = i45;
                        objectAnimator9 = objectAnimator7;
                        str22 = str18;
                        fArr6 = fArr5;
                        j6 = 200;
                        objectAnimator8 = m3008;
                        accelerateInterpolator5 = accelerateInterpolator4;
                        bArr7 = bArr6;
                        i66 = i34;
                        sArr7 = sArr5;
                    }
                case 46833800:
                case 1643605340:
                    sArr = sArr7;
                    int i78 = i63;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    long j9 = j6;
                    C19258 c192589 = c192587;
                    i5 = i53;
                    byte[] bArr9 = bArr7;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    String str30 = str24;
                    int i79 = i52;
                    String str31 = str25;
                    EditText m2132 = C0483.m2132(textInputLayout3);
                    C0714.m2808(m2132);
                    str22 = C0050.m947(C4117.m12350(m2132));
                    EditText m59053 = C1773.m5905(textInputLayout2);
                    C0714.m2808(m59053);
                    str23 = C0422.m1959(C2958.m9028(m59053));
                    if (C1711.m5741(str22) < i2) {
                        m69812 = (C0630.m2566("ۢ۬") + i58) * 127;
                        i24 = ((m69812 ^ i59) * (-15761)) ^ 139603665;
                        i25 = 2076358749;
                    } else {
                        m69812 = (i58 - C2105.m6981("ܶ᩻")) * q.h;
                        i24 = ((m69812 ^ i59) * 637) ^ 975092178;
                        i25 = -1823374945;
                    }
                    i61 = m69812 ^ i25;
                    str24 = str30;
                    str25 = str31;
                    i60 = i24;
                    c192587 = c192589;
                    i52 = i79;
                    bArr7 = bArr9;
                    j6 = j9;
                    i63 = i78;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case 321318115:
                case 841042727:
                    if (C1294.m4372() > 0) {
                        m25666 = (i58 - C0630.m2566("᩻ܳ")) * (-81);
                        i50 = ((m25666 ^ i59) * 26035) ^ 227178217;
                        i51 = -1381300690;
                        i61 = m25666 ^ i51;
                        i60 = i50;
                    }
                    m25666 = C0630.m2566("ۜ᩹") ^ i58;
                    i50 = ((m25666 ^ i59) * 23281) ^ 1832070348;
                    i51 = -742936161;
                    i61 = m25666 ^ i51;
                    i60 = i50;
                case 374652272:
                case 1722565549:
                    sArr = sArr7;
                    i22 = i63;
                    str9 = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    fArr3 = fArr6;
                    j3 = j6;
                    c192583 = c192587;
                    i5 = i53;
                    bArr3 = bArr7;
                    c4 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str10 = str24;
                    i23 = i52;
                    str11 = str25;
                    m11931 = C3911.m11931(view3);
                    i67 = m11931;
                    int m2566142 = C0630.m2566("᩵ۡ") ^ i59;
                    i61 = m2566142 ^ (-1155018151);
                    str24 = str10;
                    str25 = str11;
                    c14 = c4;
                    i60 = ((m2566142 ^ i58) * 24411) ^ (-1206157047);
                    c192587 = c192583;
                    i52 = i23;
                    bArr7 = bArr3;
                    j6 = j3;
                    i63 = i22;
                    str22 = str9;
                    fArr6 = fArr3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case 570994740:
                case 1195370277:
                    RunnableC3474.m10621(textInputLayout3, i53);
                    break;
                case 627269249:
                case 1132909428:
                    if (C3019.f9544 < 0) {
                        m25666 = C0630.m2566("ۜ᩹") ^ i58;
                        i50 = ((m25666 ^ i59) * 23281) ^ 1832070348;
                        i51 = -742936161;
                        i61 = m25666 ^ i51;
                        i60 = i50;
                    } else {
                        sArr5 = sArr7;
                        i33 = i63;
                        str14 = str22;
                        objectAnimator5 = objectAnimator9;
                        accelerateInterpolator3 = accelerateInterpolator5;
                        i34 = i66;
                        i35 = i67;
                        fArr4 = fArr6;
                        j5 = j6;
                        c192585 = c192587;
                        i36 = i53;
                        bArr5 = bArr7;
                        c12 = c14;
                        i37 = i65;
                        objectAnimator6 = objectAnimator8;
                        str16 = str24;
                        i38 = i52;
                        str15 = str25;
                        m25665 = C0630.m2566("ᩳۨ") ^ i59;
                        i39 = ((m25665 ^ i58) * 15103) ^ 1731825139;
                        i40 = -1137876963;
                        i61 = m25665 ^ i40;
                        str24 = str16;
                        str25 = str15;
                        i60 = i39;
                        i52 = i38;
                        objectAnimator8 = objectAnimator6;
                        c192587 = c192585;
                        j6 = j5;
                        i63 = i33;
                        str22 = str14;
                        fArr6 = fArr4;
                        i67 = i35;
                        i65 = i37;
                        c14 = c12;
                        accelerateInterpolator5 = accelerateInterpolator3;
                        i53 = i36;
                        bArr7 = bArr5;
                        objectAnimator9 = objectAnimator5;
                        i66 = i34;
                        sArr7 = sArr5;
                    }
                case 682665422:
                case 1418978497:
                    m10524();
                    final ?? r12 = new InterfaceC9461() { // from class: l.ܶ᩵ۡ
                        @Override // l.InterfaceC9461
                        /* renamed from: ֫ */
                        public final void mo1430(C23881 c23881) {
                            ViewOnClickListenerC3441.m10526(ViewOnClickListenerC3441.this, c23881);
                        }
                    };
                    final AbstractActivityC3346 abstractActivityC3346 = viewOnClickListenerC3441.f10885;
                    final String str32 = str20;
                    final String str33 = str19;
                    C1005.m3499(new Thread(new Runnable() { // from class: l.᩶֨ۡ
                        {
                            int i80 = 1401031401;
                            int i81 = C0630.f2410;
                            int i82 = C1294.f4556;
                            int m698114 = C2105.m6981("᩶ۙ") ^ i82;
                            int i83 = ((m698114 ^ i81) * (-12337)) ^ 370939650;
                            int i84 = -2000782938;
                            while (true) {
                                i80 = ((((i80 ^ i81) * 28803) >> 31) & i83) ^ (m698114 ^ i84);
                                switch (i80) {
                                    case -1834671786:
                                    case 158235223:
                                        C21923.m49329();
                                        if (C2958.m9034() <= 0) {
                                            m698114 = (i81 - C2105.m6981("ۡܶ")) * (-7);
                                            i83 = ((m698114 ^ i82) * 17871) ^ (-144833532);
                                            i84 = 1999580776;
                                        } else {
                                            m698114 = (C0630.m2566("ᩴۤ") + i82) * (-29);
                                            i83 = ((m698114 ^ i81) * (-18009)) ^ 923805427;
                                            i84 = -769735346;
                                        }
                                    case -1694856749:
                                    case 7982469:
                                        if (C2958.f9394 >= 0) {
                                            m698114 = (C0630.m2566("ᩴۤ") + i82) * (-29);
                                            i83 = ((m698114 ^ i81) * (-18009)) ^ 923805427;
                                            i84 = -769735346;
                                        } else {
                                            m698114 = (i81 - C0630.m2566("ᩳ֨")) * (-49);
                                            i83 = ((m698114 ^ i82) * (-13207)) ^ 1461188902;
                                            i84 = -818261095;
                                        }
                                    case -1598339065:
                                    case 381057355:
                                        if (C3019.f9544 >= 0) {
                                            m698114 = C2105.m6981("ۛ᩵") ^ i81;
                                            i83 = ((m698114 ^ i82) * (-12601)) ^ 1970299744;
                                            i84 = 1407089643;
                                        } else {
                                            m698114 = (C2105.m6981("ۜ᩸") + i82) * 59;
                                            i83 = ((m698114 ^ i81) * (-21167)) ^ 397802461;
                                            i84 = -842817906;
                                        }
                                    case -1156219042:
                                    case 1217006637:
                                        return;
                                    case -890808037:
                                    case -234859999:
                                        C1773.m5908();
                                        C4117.m12364();
                                        throw new RuntimeException();
                                    case -698586829:
                                    case -434930450:
                                        if (C21923.f70183 != 0) {
                                            m698114 = (C2105.m6981("ᩳܺ") ^ i81) * (-7);
                                            i83 = ((m698114 ^ i82) * (-10189)) ^ 929343971;
                                            i84 = 2137998929;
                                        } else {
                                            m698114 = C0630.m2566("᩻ܿ") ^ i81;
                                            i83 = ((m698114 ^ i82) * 1387) ^ (-1378700816);
                                            i84 = -509170628;
                                        }
                                    case -603210389:
                                    case -359955393:
                                        if (C1773.f6144 <= 0) {
                                            m698114 = (C2105.m6981("᩺ۨ") ^ i82) * (-103);
                                            i83 = ((m698114 ^ i81) * 31663) ^ (-1080111295);
                                            i84 = 1621021264;
                                        } else {
                                            m698114 = (C0630.m2566("᩺ۚ") ^ i82) * (-93);
                                            i83 = ((m698114 ^ i81) * 8879) ^ 1555576715;
                                            i84 = 1304570818;
                                        }
                                    case -451253058:
                                    case 666236078:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m698114 = C2105.m6981("ۛ᩵") ^ i81;
                                            i83 = ((m698114 ^ i82) * (-12601)) ^ 1970299744;
                                            i84 = 1407089643;
                                        } else {
                                            m698114 = C0630.m2566("ۗۖ") ^ i81;
                                            i83 = ((m698114 ^ i82) * (-16725)) ^ (-1496569166);
                                            i84 = -1338265178;
                                        }
                                    case -399437215:
                                    case 1774568837:
                                        if (C1773.f6144 <= 0) {
                                            m698114 = (C0630.m2566("ᩴۤ") + i82) * (-29);
                                            i83 = ((m698114 ^ i81) * (-18009)) ^ 923805427;
                                            i84 = -769735346;
                                        } else {
                                            m698114 = C2105.m6981("ܿۗ") ^ i82;
                                            i83 = ((m698114 ^ i81) * 31019) ^ (-1558681637);
                                            i84 = -42774199;
                                        }
                                    case -221979347:
                                    case 2131866425:
                                        C0237.m1481();
                                        C3019.m9255();
                                        m698114 = (i81 - C2105.m6981("ۡܶ")) * (-7);
                                        i83 = ((m698114 ^ i82) * 17871) ^ (-144833532);
                                        i84 = 1999580776;
                                    case -105157953:
                                    case 289487405:
                                        AbstractC2021.m6574();
                                        if (C3746.f11829 <= 0) {
                                            m698114 = (i81 - C2105.m6981("ۡܶ")) * (-7);
                                            i83 = ((m698114 ^ i82) * 17871) ^ (-144833532);
                                            i84 = 1999580776;
                                        } else {
                                            m698114 = (C2105.m6981("᩺ۨ") ^ i82) * (-103);
                                            i83 = ((m698114 ^ i81) * 31663) ^ (-1080111295);
                                            i84 = 1621021264;
                                        }
                                    case -92637432:
                                    case 195491165:
                                        if (C0237.m1481() >= 0) {
                                            m698114 = (i81 - C2105.m6981("ۡܶ")) * (-7);
                                            i83 = ((m698114 ^ i82) * 17871) ^ (-144833532);
                                            i84 = 1999580776;
                                        } else {
                                            m698114 = C2105.m6981("ۛ᩵") ^ i81;
                                            i83 = ((m698114 ^ i82) * (-12601)) ^ 1970299744;
                                            i84 = 1407089643;
                                        }
                                    case 556985379:
                                    case 901271564:
                                        if (RunnableC1937.f6483 >= 0) {
                                            m698114 = (C0630.m2566("ᩴۤ") + i82) * (-29);
                                            i83 = ((m698114 ^ i81) * (-18009)) ^ 923805427;
                                            i84 = -769735346;
                                        } else {
                                            m698114 = C0630.m2566("֡᩻") ^ i81;
                                            i83 = ((m698114 ^ i82) * 29795) ^ 508921897;
                                            i84 = 1275485943;
                                        }
                                    case 621788995:
                                    case 1469023169:
                                        if (C3019.f9544 >= 0) {
                                            m698114 = (C2105.m6981("ᩳܺ") ^ i81) * (-7);
                                            i83 = ((m698114 ^ i82) * (-10189)) ^ 929343971;
                                            i84 = 2137998929;
                                        } else {
                                            m698114 = C0630.m2566("ܺᩴ") ^ i81;
                                            i83 = ((m698114 ^ i82) * (-12535)) ^ (-843939029);
                                            i84 = -1300166819;
                                        }
                                    case 1383792666:
                                    case 1723645254:
                                        if (C4263.f13799 <= 0) {
                                            m698114 = C2105.m6981("ۛ᩵") ^ i81;
                                            i83 = ((m698114 ^ i82) * (-12601)) ^ 1970299744;
                                            i84 = 1407089643;
                                        } else {
                                            m698114 = C0630.m2566("֡ۛ") ^ i82;
                                            i83 = ((m698114 ^ i81) * (-20343)) ^ (-1565555392);
                                            i84 = -1908740270;
                                        }
                                    default:
                                        if (C3683.m11222()) {
                                            m698114 = C2105.m6981("ۛ᩵") ^ i81;
                                            i83 = ((m698114 ^ i82) * (-12601)) ^ 1970299744;
                                            i84 = 1407089643;
                                        } else {
                                            m698114 = (C2105.m6981("ܳܰ") ^ i82) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i83 = ((m698114 ^ i81) * (-13807)) ^ (-228385039);
                                            i84 = 851872281;
                                        }
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Activity activity = null;
                            C15434 c15434 = null;
                            String str34 = null;
                            int i80 = -757021290;
                            int i81 = C0422.f1886;
                            int i82 = C1294.f4556;
                            int m256616 = C0630.m2566("۠ۖ") ^ i82;
                            int i83 = ((m256616 ^ i81) * (-517)) ^ 1912857386;
                            int i84 = -837856018;
                            while (true) {
                                i80 = ((((i80 ^ i81) * (-13599)) >> 31) & i83) ^ (m256616 ^ i84);
                                switch (i80) {
                                    case -2058476151:
                                    case -332666722:
                                        str34 = str32;
                                        if (C3245.m9925() != 0) {
                                            m256616 = C2105.m6981("ۧۤ") ^ i82;
                                            i83 = ((m256616 ^ i81) * 2143) ^ 1819156939;
                                            i84 = -485661880;
                                        } else {
                                            m256616 = (i81 - C2105.m6981("ۜۚ")) * 53;
                                            i83 = ((m256616 ^ i82) * 529) ^ 679570109;
                                            i84 = 583243991;
                                        }
                                    case -1826123916:
                                    case 428921089:
                                        if (C1711.f5919) {
                                            m256616 = (i82 - C0630.m2566("ۙ᩺")) * (-69);
                                            i83 = ((m256616 ^ i81) * 7757) ^ (-53429880);
                                            i84 = 1766306439;
                                        } else {
                                            m256616 = (C0630.m2566("ۛᩳ") + i81) * 13;
                                            i83 = ((m256616 ^ i82) * 11083) ^ (-769754639);
                                            i84 = 608360295;
                                        }
                                    case -1558020630:
                                    case 960023393:
                                        C3537.m10746();
                                        m256616 = (i82 - C0630.m2566("ۙ᩺")) * (-69);
                                        i83 = ((m256616 ^ i81) * 7757) ^ (-53429880);
                                        i84 = 1766306439;
                                    case -1321826387:
                                    case 1627863347:
                                        activity = abstractActivityC3346;
                                        if (AbstractC2021.f6743 <= 0) {
                                            m256616 = (C0630.m2566("ۚܿ") ^ i81) * (-47);
                                            i83 = ((m256616 ^ i82) * (-27295)) ^ 1856114404;
                                            i84 = -811826162;
                                        } else {
                                            m256616 = (C2105.m6981("ۧܽ") + i82) * 127;
                                            i83 = ((m256616 ^ i81) * (-26335)) ^ (-1885541718);
                                            i84 = -1510539793;
                                        }
                                    case -1302396243:
                                    case -471402709:
                                        if (C7106.f21815 != 0) {
                                            m256616 = (C0630.m2566("ܽۤ") ^ i81) * 21;
                                            i83 = ((m256616 ^ i82) * 27005) ^ (-928752599);
                                            i84 = 697990348;
                                        } else {
                                            m256616 = (C2105.m6981("᩷۬") + i82) * 39;
                                            i83 = ((m256616 ^ i81) * (-14145)) ^ (-1590754998);
                                            i84 = 972441076;
                                        }
                                    case -1205919334:
                                    case 583927154:
                                        C0798.m2998();
                                        if (C1916.m6308() < 0) {
                                            m256616 = (i82 - C0630.m2566("ۙ᩺")) * (-69);
                                            i83 = ((m256616 ^ i81) * 7757) ^ (-53429880);
                                            i84 = 1766306439;
                                        } else {
                                            m256616 = (C0630.m2566("ۚܿ") ^ i81) * (-47);
                                            i83 = ((m256616 ^ i82) * (-27295)) ^ 1856114404;
                                            i84 = -811826162;
                                        }
                                    case -1147079959:
                                    case 1769226498:
                                        AbstractC2021.m6574();
                                        C1916.m6308();
                                        break;
                                    case -833231933:
                                    case 1469242733:
                                        if (C2126.f7087) {
                                            m256616 = (i82 - C0630.m2566("ۙ᩺")) * (-69);
                                            i83 = ((m256616 ^ i81) * 7757) ^ (-53429880);
                                            i84 = 1766306439;
                                        } else {
                                            m256616 = C2105.m6981("ܰ֨") ^ i81;
                                            i83 = ((m256616 ^ i82) * (-6001)) ^ 1066338632;
                                            i84 = -83013550;
                                        }
                                    case -523265321:
                                    case 775974682:
                                        C1128.m3851();
                                        if (C3746.f11829 > 0) {
                                            m256616 = (i82 - C0630.m2566("ۙ᩺")) * (-69);
                                            i83 = ((m256616 ^ i81) * 7757) ^ (-53429880);
                                            i84 = 1766306439;
                                        } else {
                                            m256616 = (C0630.m2566("ܽۤ") ^ i81) * 21;
                                            i83 = ((m256616 ^ i82) * 27005) ^ (-928752599);
                                            i84 = 697990348;
                                        }
                                    case -473105667:
                                    case 903018872:
                                        c15434 = r12;
                                        if (C0483.f2088 >= 0) {
                                            m256616 = (i82 - C0630.m2566("ۙ᩺")) * (-69);
                                            i83 = ((m256616 ^ i81) * 7757) ^ (-53429880);
                                            i84 = 1766306439;
                                        } else {
                                            m256616 = C0630.m2566("ۜۧ") ^ i82;
                                            i83 = ((m256616 ^ i81) * (-27619)) ^ (-1804234454);
                                            i84 = 1126401342;
                                        }
                                    case 1246596:
                                    case 1882644720:
                                        if (C2126.f7087) {
                                            m256616 = (i82 - C0630.m2566("ۙ᩺")) * (-69);
                                            i83 = ((m256616 ^ i81) * 7757) ^ (-53429880);
                                            i84 = 1766306439;
                                        } else {
                                            m256616 = (C2105.m6981("ۧۡ") + i81) * (-97);
                                            i83 = ((m256616 ^ i82) * 11829) ^ (-1396220255);
                                            i84 = -993474602;
                                        }
                                    case 1246702035:
                                    case 1376645876:
                                        if (C4616.f14690 <= 0) {
                                            m256616 = C2105.m6981("ۧۤ") ^ i82;
                                            i83 = ((m256616 ^ i81) * 2143) ^ 1819156939;
                                            i84 = -485661880;
                                        } else {
                                            m256616 = C0630.m2566("ܺᩴ") ^ i81;
                                            i83 = ((m256616 ^ i82) * (-9423)) ^ 1403419505;
                                            i84 = 1476289676;
                                        }
                                    case 1275398590:
                                    case 1995924188:
                                        C2958.m9034();
                                        if (C11340.m28031()) {
                                            m256616 = (C0630.m2566("ۜۡ") ^ i82) * 5;
                                            i83 = ((m256616 ^ i81) * 22979) ^ (-1479841864);
                                            i84 = 1164594044;
                                        } else {
                                            m256616 = (C0630.m2566("ܽۤ") ^ i81) * 21;
                                            i83 = ((m256616 ^ i82) * 27005) ^ (-928752599);
                                            i84 = 697990348;
                                        }
                                    case 1326833143:
                                    case 2106390742:
                                        if (C4075.f12947 >= 0) {
                                            m256616 = (C0630.m2566("ܽۤ") ^ i81) * 21;
                                            i83 = ((m256616 ^ i82) * 27005) ^ (-928752599);
                                            i84 = 697990348;
                                        } else {
                                            m256616 = C2105.m6981("ᩴۧ") ^ i82;
                                            i83 = ((m256616 ^ i81) * (-15533)) ^ (-1784966923);
                                            i84 = 1633578779;
                                        }
                                    case 1740398274:
                                    case 2104713129:
                                        if (C2272.f7362) {
                                            m256616 = C2105.m6981("ۧۤ") ^ i82;
                                            i83 = ((m256616 ^ i81) * 2143) ^ 1819156939;
                                            i84 = -485661880;
                                        } else {
                                            m256616 = (C0630.m2566("۫֡") ^ i82) * (-69);
                                            i83 = ((m256616 ^ i81) * (-2343)) ^ (-1968809509);
                                            i84 = 829925234;
                                        }
                                    default:
                                        C2405.m7800(str34, bArr7, str33, activity, c15434);
                                        break;
                                }
                                return;
                            }
                        }
                    }));
                    break;
                case 782501181:
                case 1571726614:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    i10 = i64;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    sArr3 = sArr6;
                    i11 = i68;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    c2 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str4 = str24;
                    i7 = i52;
                    str5 = str25;
                    i62 = 31316;
                    int m256692 = C0630.m2566("ᩴ᩻") ^ i58;
                    i64 = i10;
                    i60 = ((m256692 ^ i59) * 13193) ^ (-139321472);
                    i61 = m256692 ^ 1818274093;
                    viewOnClickListenerC3441 = this;
                    str24 = str4;
                    str25 = str5;
                    c14 = c2;
                    sArr6 = sArr3;
                    i68 = i11;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case 861095685:
                case 1461774874:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    char c20 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    i7 = i52;
                    str3 = str25;
                    i13 = i64;
                    c9 = c20;
                    if (i13 == (C0630.m2566(C4263.m12817(f10875, 124, 3, i62)) ^ 2128375467)) {
                        m25662 = (C0630.m2566("֫᩻") + i59) * (-37);
                        i12 = ((m25662 ^ i58) * 3651) ^ 344408540;
                        i14 = 108608467;
                        c8 = c20;
                        i61 = m25662 ^ i14;
                        viewOnClickListenerC3441 = this;
                        i64 = i13;
                        c10 = c8;
                        str24 = str2;
                        str25 = str3;
                        c14 = c10;
                        i60 = i12;
                        c192587 = c19258;
                        i52 = i7;
                        bArr7 = bArr;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        i66 = i2;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        sArr7 = sArr;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator;
                    }
                    m25662 = C0630.m2566("֫ۖ") ^ i59;
                    i12 = ((m25662 ^ i58) * 24819) ^ 1533264498;
                    i14 = -1377776861;
                    c8 = c9;
                    i61 = m25662 ^ i14;
                    viewOnClickListenerC3441 = this;
                    i64 = i13;
                    c10 = c8;
                    str24 = str2;
                    str25 = str3;
                    c14 = c10;
                    i60 = i12;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case 1283445232:
                case 2049322164:
                    sArr = sArr7;
                    accelerateInterpolator = accelerateInterpolator5;
                    ObjectAnimator objectAnimator13 = objectAnimator8;
                    i2 = i66;
                    objectAnimator13.setInterpolator(accelerateInterpolator);
                    c19258 = c192587;
                    i7 = i52;
                    ObjectAnimator objectAnimator14 = objectAnimator9;
                    objectAnimator14.setInterpolator(new DecelerateInterpolator());
                    objectAnimator13.addListener(new C4852(viewOnClickListenerC3441, objectAnimator14));
                    C22628.m50603(objectAnimator13);
                    objectAnimator = objectAnimator14;
                    i5 = i53;
                    bArr = bArr7;
                    i = i63;
                    str = str22;
                    c5 = c14;
                    i6 = i65;
                    i3 = i67;
                    fArr = fArr6;
                    str2 = str24;
                    j = j6;
                    str3 = str25;
                    objectAnimator2 = objectAnimator13;
                    i13 = i64;
                    c9 = c5;
                    m25662 = C0630.m2566("֫ۖ") ^ i59;
                    i12 = ((m25662 ^ i58) * 24819) ^ 1533264498;
                    i14 = -1377776861;
                    c8 = c9;
                    i61 = m25662 ^ i14;
                    viewOnClickListenerC3441 = this;
                    i64 = i13;
                    c10 = c8;
                    str24 = str2;
                    str25 = str3;
                    c14 = c10;
                    i60 = i12;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
                case 1673594085:
                case 2135576619:
                    short[] sArr8 = sArr7;
                    int i80 = i63;
                    String str34 = str22;
                    int i81 = i64;
                    ObjectAnimator objectAnimator15 = objectAnimator9;
                    AccelerateInterpolator accelerateInterpolator8 = accelerateInterpolator5;
                    ObjectAnimator objectAnimator16 = objectAnimator8;
                    int i82 = i66;
                    int i83 = i67;
                    float[] fArr11 = fArr6;
                    long j10 = j6;
                    C19258 c1925810 = c192587;
                    int i84 = i52;
                    int i85 = i53;
                    byte[] bArr10 = bArr7;
                    String str35 = str24;
                    String str36 = str25;
                    short[] sArr9 = sArr6;
                    int i86 = i68;
                    c13 = 1;
                    c14 = 0;
                    if (i81 == (C0630.m2566(C0714.m2816(sArr9, i86, 3, i62)) ^ 2101190415)) {
                        m25664 = C2105.m6981("᩵֡") ^ i58;
                        i31 = ((m25664 ^ i59) * (-10745)) ^ 603644452;
                        i32 = -1379901662;
                    } else {
                        m25664 = (C0630.m2566("֡ܽ") + i59) * 51;
                        i31 = ((m25664 ^ i58) * (-28111)) ^ 54449549;
                        i32 = -307021824;
                    }
                    i61 = m25664 ^ i32;
                    viewOnClickListenerC3441 = this;
                    i64 = i81;
                    str24 = str35;
                    str25 = str36;
                    i60 = i31;
                    sArr6 = sArr9;
                    i68 = i86;
                    i53 = i85;
                    c192587 = c1925810;
                    i52 = i84;
                    bArr7 = bArr10;
                    j6 = j10;
                    i63 = i80;
                    objectAnimator9 = objectAnimator15;
                    str22 = str34;
                    fArr6 = fArr11;
                    i67 = i83;
                    i66 = i82;
                    accelerateInterpolator5 = accelerateInterpolator8;
                    objectAnimator8 = objectAnimator16;
                    sArr7 = sArr8;
                    i65 = 2;
                default:
                    sArr = sArr7;
                    i = i63;
                    str = str22;
                    objectAnimator = objectAnimator9;
                    accelerateInterpolator = accelerateInterpolator5;
                    i2 = i66;
                    i3 = i67;
                    fArr = fArr6;
                    j = j6;
                    c19258 = c192587;
                    i5 = i53;
                    bArr = bArr7;
                    char c21 = c14;
                    i6 = i65;
                    objectAnimator2 = objectAnimator8;
                    str2 = str24;
                    i7 = i52;
                    str3 = str25;
                    TextInputLayout[] textInputLayoutArr2 = new TextInputLayout[i6];
                    textInputLayoutArr2[c21 == true ? 1 : 0] = textInputLayout3;
                    textInputLayoutArr2[c13] = textInputLayout2;
                    c5 = c21;
                    if (!C0287.m1632(textInputLayoutArr2)) {
                        m25663 = (C2105.m6981("᩸ۛ") + i58) * (-79);
                        i12 = ((m25663 ^ i59) * (-21089)) ^ 1834847131;
                        i21 = 181034994;
                        c11 = c21;
                        i61 = m25663 ^ i21;
                        c10 = c11;
                        str24 = str2;
                        str25 = str3;
                        c14 = c10;
                        i60 = i12;
                        c192587 = c19258;
                        i52 = i7;
                        bArr7 = bArr;
                        j6 = j;
                        i63 = i;
                        str22 = str;
                        fArr6 = fArr;
                        i67 = i3;
                        i66 = i2;
                        accelerateInterpolator5 = accelerateInterpolator;
                        objectAnimator8 = objectAnimator2;
                        sArr7 = sArr;
                        i65 = i6;
                        i53 = i5;
                        objectAnimator9 = objectAnimator;
                    }
                    i13 = i64;
                    c9 = c5;
                    m25662 = C0630.m2566("֫ۖ") ^ i59;
                    i12 = ((m25662 ^ i58) * 24819) ^ 1533264498;
                    i14 = -1377776861;
                    c8 = c9;
                    i61 = m25662 ^ i14;
                    viewOnClickListenerC3441 = this;
                    i64 = i13;
                    c10 = c8;
                    str24 = str2;
                    str25 = str3;
                    c14 = c10;
                    i60 = i12;
                    c192587 = c19258;
                    i52 = i7;
                    bArr7 = bArr;
                    j6 = j;
                    i63 = i;
                    str22 = str;
                    fArr6 = fArr;
                    i67 = i3;
                    i66 = i2;
                    accelerateInterpolator5 = accelerateInterpolator;
                    objectAnimator8 = objectAnimator2;
                    sArr7 = sArr;
                    i65 = i6;
                    i53 = i5;
                    objectAnimator9 = objectAnimator;
            }
            return;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m10528(ViewOnClickListenerC3441 viewOnClickListenerC3441) {
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i = -1973822769;
        int i2 = C0714.f2697;
        int i3 = AbstractC2021.f6743;
        int m2566 = C0630.m2566("ܺۖ") ^ i3;
        int i4 = ((m2566 ^ i2) * 25277) ^ (-332763002);
        int i5 = -1641022125;
        while (true) {
            i = ((((i ^ i2) * 24041) >> 31) & i4) ^ (m2566 ^ i5);
            switch (i) {
                case -2102481965:
                case -946448427:
                    C1504.m5172(dialogInterfaceC0206);
                    if (C0382.f1805) {
                        m2566 = C0630.m2566("᩸֡") ^ i2;
                        i4 = ((m2566 ^ i3) * 19085) ^ (-306243308);
                        i5 = 1572965824;
                    } else {
                        m2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((m2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    }
                case -1941258165:
                case 2091759115:
                    if (RunnableC0588.m2441() >= 0) {
                        m2566 = (C0630.m2566("ܽ۠") + i3) * 85;
                        i4 = ((m2566 ^ i2) * 18067) ^ 2008945439;
                        i5 = 1920076144;
                    } else {
                        m2566 = C0630.m2566("᩶ۘ") ^ i3;
                        i4 = ((m2566 ^ i2) * (-30541)) ^ (-1351042282);
                        i5 = 1061312113;
                    }
                case -1719088550:
                case -379488778:
                    if (C1916.f6442) {
                        m2566 = (C0630.m2566("᩺֫") ^ i3) * (-87);
                        i4 = ((m2566 ^ i2) * 21875) ^ (-1061695995);
                        i5 = 1014068902;
                    } else {
                        m2566 = (C0630.m2566("֡۬") ^ i2) * (-13);
                        i4 = ((m2566 ^ i3) * (-6737)) ^ 1361735491;
                        i5 = -2140298488;
                    }
                case -1411971512:
                case -807360621:
                    if (C1294.f4556 >= 0) {
                        m2566 = C2105.m6981("ܽ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9645)) ^ (-1415870682);
                        i5 = -399201600;
                    } else {
                        m2566 = (C2105.m6981("֡᩻") ^ i3) * 29;
                        i4 = ((m2566 ^ i2) * 8907) ^ (-1199493441);
                        i5 = -1166277260;
                    }
                case -1264818482:
                case 432237384:
                    C3432.m10477();
                    m2566 = C0630.m2566("ۖᩳ") ^ i2;
                    i4 = ((m2566 ^ i3) * (-25795)) ^ (-1264774059);
                    i5 = -335098466;
                case -1096884322:
                case 1457158145:
                    if (C0714.f2697 < 0) {
                        m2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    } else {
                        m2566 = (C0630.m2566("ܽ۠") + i3) * 85;
                        i4 = ((m2566 ^ i2) * 18067) ^ 2008945439;
                        i5 = 1920076144;
                    }
                case -930769908:
                case -752173264:
                    dialogInterfaceC0206 = viewOnClickListenerC3441.f10882;
                    if (C3432.f10845 >= 0) {
                        m2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((m2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    } else {
                        m2566 = C2105.m6981("ܰ᩶") ^ i2;
                        i4 = ((m2566 ^ i3) * 4963) ^ (-2080719277);
                        i5 = 1102005448;
                    }
                case -892441392:
                case 1642267613:
                    if (C4263.f13799 <= 0) {
                        m2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((m2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    } else {
                        m2566 = (C0630.m2566("ܳܶ") + i2) * (-31);
                        i4 = ((m2566 ^ i3) * 32283) ^ 610304294;
                        i5 = -1405483603;
                    }
                case -790341562:
                case 1798708673:
                    if (C3432.m10477() <= 0) {
                        m2566 = (C0630.m2566("᩷ܿ") ^ i3) * (-55);
                        i4 = ((m2566 ^ i2) * (-13921)) ^ 1870745610;
                        i5 = 1809831676;
                    } else {
                        m2566 = C2105.m6981("ۖ֨") ^ i2;
                        i4 = ((m2566 ^ i3) * 21823) ^ (-230421160);
                        i5 = 398920149;
                    }
                case -745689612:
                case 468392235:
                    viewOnClickListenerC3441.f10877.m44041();
                    break;
                case -685277594:
                case 1167701002:
                    if (RunnableC3474.m10630()) {
                        m2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    } else {
                        m2566 = C2105.m6981("ܽ᩺") ^ i3;
                        i4 = ((m2566 ^ i2) * (-9645)) ^ (-1415870682);
                        i5 = -399201600;
                    }
                case -486978601:
                case 173382719:
                    if (C3911.f12484 < 0) {
                        m2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    } else {
                        m2566 = (C0630.m2566("֡۬") ^ i2) * (-13);
                        i4 = ((m2566 ^ i3) * (-6737)) ^ 1361735491;
                        i5 = -2140298488;
                    }
                case -233921540:
                case 1648966110:
                    C0798.m2998();
                    break;
                case 1050848090:
                case 1752560941:
                    if (C21923.f70183 != 0) {
                        m2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    } else {
                        m2566 = C0630.m2566("ܿᩴ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-9899)) ^ (-525209241);
                        i5 = -220047613;
                    }
                case 1106728114:
                case 1777066704:
                    if (C3245.f10203 <= 0) {
                        m2566 = (C0630.m2566("ܽ۠") + i3) * 85;
                        i4 = ((m2566 ^ i2) * 18067) ^ 2008945439;
                        i5 = 1920076144;
                    } else {
                        m2566 = (C2105.m6981("ۨۢ") ^ i3) * (-99);
                        i4 = ((m2566 ^ i2) * 13151) ^ 1147459806;
                        i5 = -24177690;
                    }
                default:
                    if (AbstractC2021.m6574()) {
                        m2566 = C0630.m2566("ۖᩳ") ^ i2;
                        i4 = ((m2566 ^ i3) * (-25795)) ^ (-1264774059);
                        i5 = -335098466;
                    } else {
                        m2566 = (i3 - C2105.m6981("ۖ᩹")) * 51;
                        i4 = ((m2566 ^ i2) * 23259) ^ (-1845132574);
                        i5 = -1996130896;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10520(ViewOnClickListenerC3441 viewOnClickListenerC3441, C23881 c23881) {
        int m2566;
        int i;
        int i2;
        int i3;
        int m6981;
        int i4;
        int m25662;
        int i5;
        int m69812;
        int i6;
        int i7;
        ViewOnClickListenerC3441 viewOnClickListenerC34412 = viewOnClickListenerC3441;
        C23881 c238812 = c23881;
        int i8 = C3537.f11231;
        int i9 = C0050.f910;
        int m69813 = (C2105.m6981("᩸֡") + i9) * (-55);
        int i10 = ((m69813 ^ i8) * 24343) ^ 2122706189;
        C19111 c19111 = null;
        String str = null;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i11 = m69813 ^ (-1778471679);
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i18 = -14423795;
        int i19 = 0;
        String str2 = null;
        TextInputLayout textInputLayout = null;
        TextInputLayout textInputLayout2 = null;
        short[] sArr4 = null;
        String str3 = null;
        while (true) {
            i18 = i11 ^ (i10 & (((i18 ^ i8) * (-21845)) >> 31));
            switch (i18) {
                case -1958753693:
                case 824772850:
                    AbstractC2021.m6571(textInputLayout, C0630.m2566(str) ^ 2127665830);
                    break;
                case -1569640270:
                case -497917994:
                    str2 = C4075.m12252(sArr3, i12, 3, i17);
                    if (C3911.f12484 >= 0) {
                        i3 = i19;
                        m69812 = (C2105.m6981("ۖۢ") ^ i9) * (-85);
                        i6 = ((m69812 ^ i8) * 13655) ^ 1181342765;
                        i7 = -1254562826;
                        i11 = m69812 ^ i7;
                        i10 = i6;
                        i19 = i3;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    } else {
                        m2566 = (i9 - C2105.m6981("᩵᩵")) * 75;
                        i = ((m2566 ^ i8) * 757) ^ 2100352960;
                        i2 = 475102394;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    }
                case -1532057614:
                case -404582127:
                    C0798.m2998();
                    break;
                case -1471918000:
                case -868796395:
                    C19111 c191112 = c19111;
                    short[] sArr5 = sArr2;
                    i19 = 74;
                    if (C4616.m13552() != 0) {
                        sArr2 = sArr5;
                        c19111 = c191112;
                        i16 = 3;
                        int m25663 = (C0630.m2566("ۚܰ") + i9) * (-121);
                        i10 = (-910533046) ^ ((m25663 ^ i8) * (-21561));
                        i11 = m25663 ^ (-809890616);
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                    } else {
                        int m69814 = C2105.m6981("ۖ᩸") ^ i9;
                        int i20 = ((m69814 ^ i8) * (-8223)) ^ 1103066088;
                        i11 = m69814 ^ (-1252800133);
                        sArr2 = sArr5;
                        c19111 = c191112;
                        i10 = i20;
                        i16 = 3;
                    }
                case -1448249665:
                case -865859204:
                    i14 = C0630.m2566(C4263.m12817(f10875, 83, 3, i17));
                    if (C0630.f2410 <= 0) {
                        int m256632 = (C0630.m2566("ۚܰ") + i9) * (-121);
                        i10 = (-910533046) ^ ((m256632 ^ i8) * (-21561));
                        i11 = m256632 ^ (-809890616);
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                    } else {
                        m2566 = (C0630.m2566("۠۫") + i8) * (-47);
                        i = ((m2566 ^ i9) * 289) ^ 245347969;
                        i2 = 720197376;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    }
                case -1446239269:
                case 258225655:
                    C4616.m13552();
                    C0630.m2564();
                    m2566 = (C0630.m2566("ۗ۟") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                    i = ((m2566 ^ i8) * (-1957)) ^ 950335350;
                    i2 = 1092898196;
                    i11 = m2566 ^ i2;
                    i10 = i;
                case -1415772847:
                case 1936662831:
                    i3 = i19;
                    int i21 = s + s2;
                    if ((79120 * s) - (i21 * i21) > 0) {
                        m6981 = (i9 - C2105.m6981("᩸۫")) * 45;
                        i10 = (-192015353) ^ ((m6981 ^ i8) * (-20607));
                        i4 = 67214377;
                    } else {
                        m6981 = C2105.m6981("᩹ۨ") ^ i8;
                        i10 = 1516268910 ^ ((m6981 ^ i9) * (-2107));
                        i4 = -166529855;
                    }
                    i11 = m6981 ^ i4;
                    viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    c238812 = c23881;
                    i19 = i3;
                case -1195510374:
                case -211539734:
                    if (i13 != 1100) {
                        m2566 = C0630.m2566("ۤ᩹") ^ i9;
                        i = ((m2566 ^ i8) * (-5321)) ^ 930400399;
                        i2 = 1426627553;
                    } else {
                        m2566 = C2105.m6981("ۨ֫") ^ i9;
                        i = ((m2566 ^ i8) * (-15199)) ^ (-403439101);
                        i2 = -1646620793;
                    }
                    i11 = m2566 ^ i2;
                    i10 = i;
                case -1143483217:
                case 806862025:
                    i3 = i19;
                    str3 = AbstractC2021.m6573(f10875, 66, 8, i17);
                    if (!C0798.f2919) {
                        m6981 = (i9 - C2105.m6981("᩹ۤ")) * 67;
                        i10 = (-488607705) ^ ((m6981 ^ i8) * 25921);
                        i4 = 1123023231;
                        i11 = m6981 ^ i4;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                        i19 = i3;
                    }
                    m6981 = C0630.m2566("ܳ᩸") ^ i8;
                    i10 = (-1107777136) ^ ((m6981 ^ i9) * 30515);
                    i4 = 126811271;
                    i11 = m6981 ^ i4;
                    viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    c238812 = c23881;
                    i19 = i3;
                case -1070303122:
                case 281865027:
                    i3 = i19;
                    C3663.m11167(viewOnClickListenerC34412.f10882);
                    C19111 c191113 = viewOnClickListenerC34412.f10877;
                    sArr2 = f10875;
                    if (C0422.f1886 <= 0) {
                        c19111 = c191113;
                        m69812 = (C2105.m6981("ۖۢ") ^ i9) * (-85);
                        i6 = ((m69812 ^ i8) * 13655) ^ 1181342765;
                        i7 = -1254562826;
                        i11 = m69812 ^ i7;
                        i10 = i6;
                        i19 = i3;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    } else {
                        m25662 = C0630.m2566("᩹ᩳ") ^ i8;
                        c19111 = c191113;
                        i10 = ((m25662 ^ i9) * (-28581)) ^ 881445852;
                        i5 = 2046694144;
                        i11 = m25662 ^ i5;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        i19 = i3;
                    }
                case -864421861:
                case 167086634:
                    C2958.m9034();
                    if (C5695.f17556 < 0) {
                        m2566 = (C0630.m2566("ۗ۟") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((m2566 ^ i8) * (-1957)) ^ 950335350;
                        i2 = 1092898196;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    } else {
                        i3 = i19;
                        m6981 = C0630.m2566("ܳ᩸") ^ i8;
                        i10 = (-1107777136) ^ ((m6981 ^ i9) * 30515);
                        i4 = 126811271;
                        i11 = m6981 ^ i4;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                        i19 = i3;
                    }
                case -701036184:
                case 120140884:
                    if (C3683.f11629 < 0) {
                        m2566 = (C0630.m2566("ۗ۟") + i9) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((m2566 ^ i8) * (-1957)) ^ 950335350;
                        i2 = 1092898196;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    } else {
                        i3 = i19;
                        m69812 = (C2105.m6981("ۖۢ") ^ i9) * (-85);
                        i6 = ((m69812 ^ i8) * 13655) ^ 1181342765;
                        i7 = -1254562826;
                        i11 = m69812 ^ i7;
                        i10 = i6;
                        i19 = i3;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    }
                case -575377620:
                case 665371396:
                    i3 = i19;
                    i17 = 50489;
                    m6981 = (i8 - C0630.m2566("ܰ᩺")) * 79;
                    i10 = (-1535639337) ^ ((m6981 ^ i9) * (-19085));
                    i4 = -2015731255;
                    i11 = m6981 ^ i4;
                    viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    c238812 = c23881;
                    i19 = i3;
                case -547951018:
                case 579888219:
                    str = C7811.m20837(sArr4, i15, 3, i17);
                    if (C1128.f4106 <= 0) {
                        i3 = i19;
                        m6981 = C0630.m2566("ܳ᩸") ^ i8;
                        i10 = (-1107777136) ^ ((m6981 ^ i9) * 30515);
                        i4 = 126811271;
                        i11 = m6981 ^ i4;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                        i19 = i3;
                    } else {
                        m2566 = C0630.m2566("᩻ۨ") ^ i8;
                        i = ((m2566 ^ i9) * (-11501)) ^ 1692177333;
                        i2 = 1518730724;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    }
                case -505808199:
                case 1240873554:
                    c19111.m44038(C0630.m2566(C3911.m11919(sArr2, i19, i16, i17)) ^ 2097334103);
                    break;
                case -369667572:
                case 523694243:
                    RunnableC3474.m10621(textInputLayout2, C2105.m6981(str2) ^ 2100077876);
                    break;
                case 28151625:
                case 1526501535:
                    textInputLayout2 = viewOnClickListenerC34412.f10880;
                    sArr3 = f10875;
                    i12 = 77;
                    if (C3663.m11168() >= 0) {
                        int m2566322 = (C0630.m2566("ۚܰ") + i9) * (-121);
                        i10 = (-910533046) ^ ((m2566322 ^ i8) * (-21561));
                        i11 = m2566322 ^ (-809890616);
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                    } else {
                        m2566 = (C2105.m6981("᩸ۤ") ^ i9) * (-33);
                        i = ((m2566 ^ i8) * 1225) ^ (-1977524241);
                        i2 = -1933096145;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    }
                case 30168682:
                case 573283093:
                    i3 = i19;
                    sArr = f10875;
                    c = 'A';
                    if (C2105.f7037 != 0) {
                        i19 = i3;
                        int m25663222 = (C0630.m2566("ۚܰ") + i9) * (-121);
                        i10 = (-910533046) ^ ((m25663222 ^ i8) * (-21561));
                        i11 = m25663222 ^ (-809890616);
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                    } else {
                        m6981 = (C2105.m6981("᩻ܺ") ^ i9) * (-63);
                        i10 = (-1456580642) ^ ((m6981 ^ i8) * (-31801));
                        i4 = -1495384000;
                        i11 = m6981 ^ i4;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                        i19 = i3;
                    }
                case 394633482:
                case 1412632421:
                    RunnableC0588.m2440(AbstractC2021.m6563(c238812, 2103419680 ^ i14));
                    break;
                case 421349134:
                case 1635731727:
                    textInputLayout = viewOnClickListenerC34412.f10887;
                    sArr4 = f10875;
                    i15 = 80;
                    if (C1294.f4556 >= 0) {
                        i3 = i19;
                        m6981 = C0630.m2566("ܳ᩸") ^ i8;
                        i10 = (-1107777136) ^ ((m6981 ^ i9) * 30515);
                        i4 = 126811271;
                        i11 = m6981 ^ i4;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                        i19 = i3;
                    } else {
                        m2566 = C0630.m2566("ۢ᩸") ^ i8;
                        i = ((m2566 ^ i9) * (-18009)) ^ (-1627777204);
                        i2 = -215382073;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    }
                case 531496804:
                case 1819619025:
                    i3 = i19;
                    i17 = o.a.w;
                    m6981 = (i8 - C0630.m2566("ܰ᩺")) * 79;
                    i10 = (-1535639337) ^ ((m6981 ^ i9) * (-19085));
                    i4 = -2015731255;
                    i11 = m6981 ^ i4;
                    viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    c238812 = c23881;
                    i19 = i3;
                case 922415390:
                case 1513574767:
                    C1711.m5736();
                    if (C1916.f6442) {
                        i3 = i19;
                        m69812 = (C2105.m6981("ۖۢ") ^ i9) * (-85);
                        i6 = ((m69812 ^ i8) * 13655) ^ 1181342765;
                        i7 = -1254562826;
                        i11 = m69812 ^ i7;
                        i10 = i6;
                        i19 = i3;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    } else {
                        m2566 = C0630.m2566("ܶۧ") ^ i8;
                        i = ((m2566 ^ i9) * (-25075)) ^ (-164380031);
                        i2 = 499126816;
                        i11 = m2566 ^ i2;
                        i10 = i;
                    }
                case 1085237912:
                case 1975749652:
                    i3 = i19;
                    s = sArr[c];
                    s2 = 19780;
                    if (C4616.m13552() != 0) {
                        i19 = i3;
                        int m256632222 = (C0630.m2566("ۚܰ") + i9) * (-121);
                        i10 = (-910533046) ^ ((m256632222 ^ i8) * (-21561));
                        i11 = m256632222 ^ (-809890616);
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                    } else {
                        m6981 = (C0630.m2566("᩻ᩴ") ^ i8) * (-33);
                        i10 = (-267868680) ^ ((m6981 ^ i9) * (-14943));
                        i4 = -2053997662;
                        i11 = m6981 ^ i4;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        c238812 = c23881;
                        i19 = i3;
                    }
                case 1222627730:
                case 1555164223:
                    String str4 = str3;
                    i3 = i19;
                    C3683.m11210(c238812, str4);
                    viewOnClickListenerC3441.m10517();
                    if (C0483.m2131(c23881)) {
                        m69812 = (C2105.m6981("ۙۜ") ^ i8) * (-41);
                        str3 = str4;
                        i6 = ((m69812 ^ i9) * 5627) ^ (-1753344479);
                        i7 = 2045799276;
                        i11 = m69812 ^ i7;
                        i10 = i6;
                        i19 = i3;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    } else {
                        str3 = str4;
                        m25662 = (C0630.m2566("ۗܽ") + i9) * 65;
                        i10 = ((m25662 ^ i8) * 32039) ^ (-2005569756);
                        i5 = -278590137;
                        i11 = m25662 ^ i5;
                        viewOnClickListenerC34412 = viewOnClickListenerC3441;
                        i19 = i3;
                    }
                default:
                    short[] sArr6 = sArr2;
                    i3 = i19;
                    i13 = C22628.m50604(c23881);
                    if (i13 != 1000) {
                        m25662 = (C0630.m2566("᩺֫") + i8) * (-19);
                        sArr2 = sArr6;
                        i10 = ((m25662 ^ i9) * 3211) ^ (-1820278292);
                        i5 = -1671239435;
                    } else {
                        sArr2 = sArr6;
                        m25662 = C0630.m2566("ܰۜ") ^ i8;
                        i10 = ((m25662 ^ i9) * (-16093)) ^ 1374682993;
                        i5 = -803969361;
                    }
                    i11 = m25662 ^ i5;
                    viewOnClickListenerC34412 = viewOnClickListenerC3441;
                    i19 = i3;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (l.C0050.m940() <= 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        if (l.C2126.f7087 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0051, code lost:
    
        if (l.C7811.f24123 < 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        r1 = (l.C2105.m6981("᩶ۤ") ^ r16) * 101;
        r6 = ((r1 ^ r17) * 5027) ^ (-1071399984);
        r19 = 1009154454;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m10524() {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC3441.m10524():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (l.C1711.f5919 != false) goto L51;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10526(l.ViewOnClickListenerC3441 r26, l.C23881 r27) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC3441.m10526(l.ۗ᩵ۡ, l.᩻ᩴۡ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0071, code lost:
    
        if (l.C0382.f1805 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0077, code lost:
    
        if (l.C3019.f9544 >= 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006b, code lost:
    
        if (l.C3746.f11829 <= 0) goto L45;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m10517() {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnClickListenerC3441.m10517():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10518(ViewOnClickListenerC3441 viewOnClickListenerC3441) {
        C3746.m11360(viewOnClickListenerC3441.f10881, 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10519(ViewOnClickListenerC3441 viewOnClickListenerC3441, String str, String str2) {
        int i = -760012599;
        int i2 = C3537.f11231;
        int i3 = C4263.f13799;
        int m6981 = C2105.m6981("ܺܳ") ^ i2;
        int i4 = ((m6981 ^ i3) * 2797) ^ 631332336;
        int i5 = -1851279697;
        while (true) {
            i = ((((i ^ i3) * (-32525)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -2056856099:
                case -1278436638:
                    if (C1128.f4106 <= 0) {
                        m6981 = C2105.m6981("۠ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7131)) ^ (-11532456);
                        i5 = -765313636;
                    } else {
                        m6981 = (C0630.m2566("ܳۙ") + i3) * 43;
                        i4 = ((m6981 ^ i2) * (-15757)) ^ (-1042554332);
                        i5 = -1937577950;
                    }
                case -1841994846:
                case 2061356979:
                    C1711.m5736();
                    C4616.m13552();
                    break;
                case -1825674423:
                case 1903077863:
                    if (C0714.f2697 >= 0) {
                        m6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((m6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    } else {
                        m6981 = C2105.m6981("ۡ۬") ^ i2;
                        i4 = ((m6981 ^ i3) * 21909) ^ (-1137958005);
                        i5 = 503550096;
                    }
                case -1795464421:
                case 1352479692:
                    C21923.m49329();
                    ViewOnClickListenerC1958.m6429();
                    m6981 = C2105.m6981("ۢ۬") ^ i3;
                    i4 = ((m6981 ^ i2) * (-27833)) ^ 1062911497;
                    i5 = 1317092049;
                case -1426883565:
                case 1075731932:
                    if (C2167.m7155()) {
                        m6981 = C2105.m6981("ܰ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 1397) ^ 1474566531;
                        i5 = -2137429546;
                    } else {
                        m6981 = (i3 - C0630.m2566("ۖۢ")) * (-61);
                        i4 = ((m6981 ^ i2) * (-20187)) ^ (-1791558279);
                        i5 = -2035797096;
                    }
                case -1322727860:
                case 425611013:
                    ViewOnClickListenerC1958.m6429();
                    if (C3911.f12484 >= 0) {
                        m6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((m6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    } else {
                        m6981 = C2105.m6981("۠ۜ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7131)) ^ (-11532456);
                        i5 = -765313636;
                    }
                case -809877263:
                case 1493776135:
                    viewOnClickListenerC3441.m10524();
                    if (C1504.f5354) {
                        m6981 = C2105.m6981("ۙ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * 32091) ^ (-1385779641);
                        i5 = -924345689;
                    } else {
                        m6981 = (C2105.m6981("ܿ۬") + i3) * (-13);
                        i4 = ((m6981 ^ i2) * 13091) ^ 1903897754;
                        i5 = 113764180;
                    }
                case -691005714:
                case -181584073:
                    if (C2105.m6982() != 0) {
                        m6981 = C2105.m6981("ܰ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 1397) ^ 1474566531;
                        i5 = -2137429546;
                    } else {
                        m6981 = (i2 - C2105.m6981("ۢۘ")) * 123;
                        i4 = ((m6981 ^ i3) * (-21815)) ^ (-1976987578);
                        i5 = -2076689883;
                    }
                case -432091320:
                case 185224390:
                    if (AbstractC2021.f6743 <= 0) {
                        m6981 = C2105.m6981("ۢ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27833)) ^ 1062911497;
                        i5 = 1317092049;
                    } else {
                        m6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((m6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    }
                case -181766485:
                case 1195844537:
                    if (C1005.m3501()) {
                        m6981 = (C2105.m6981("ۖ۬") + i3) * 43;
                        i4 = ((m6981 ^ i2) * 32629) ^ (-1028514866);
                        i5 = -1158610355;
                    } else {
                        m6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((m6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    }
                case 9856908:
                case 2011847011:
                    if (C1047.f3863 >= 0) {
                        m6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((m6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    } else {
                        m6981 = C2105.m6981("ۚۨ") ^ i2;
                        i4 = ((m6981 ^ i3) * (-9123)) ^ 442852035;
                        i5 = 1423903449;
                    }
                case 1193501848:
                case 1329548652:
                    if (C4616.m13552() != 0) {
                        m6981 = C2105.m6981("ۙ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * 32091) ^ (-1385779641);
                        i5 = -924345689;
                    } else {
                        m6981 = (i2 - C0630.m2566("۠᩸")) * 45;
                        i4 = ((m6981 ^ i3) * 22389) ^ (-1010225901);
                        i5 = 193797540;
                    }
                case 1367458203:
                case 1788977710:
                    AbstractActivityC3346 abstractActivityC3346 = viewOnClickListenerC3441.f10885;
                    byte[] bArr = viewOnClickListenerC3441.f10876;
                    if (C0382.f1805) {
                        C21786 c21786 = new C21786(viewOnClickListenerC3441);
                        if (C11340.f33930 < 0) {
                            C1005.m3499(new Thread(new RunnableC2904(bArr, str, str2, abstractActivityC3346, c21786)));
                            break;
                        }
                        m6981 = (i2 - C2105.m6981("ܽܺ")) * 85;
                        i4 = ((m6981 ^ i3) * (-19653)) ^ 1346136916;
                        i5 = -222748995;
                    } else {
                        m6981 = C2105.m6981("ܰ֨") ^ i2;
                        i4 = ((m6981 ^ i3) * 1397) ^ 1474566531;
                        i5 = -2137429546;
                    }
                default:
                    if (C1294.f4556 < 0) {
                        m6981 = C2105.m6981("ۢ۬") ^ i3;
                        i4 = ((m6981 ^ i2) * (-27833)) ^ 1062911497;
                        i5 = 1317092049;
                    } else {
                        m6981 = C2105.m6981("ۙ֡") ^ i2;
                        i4 = ((m6981 ^ i3) * 32091) ^ (-1385779641);
                        i5 = -924345689;
                    }
            }
            return;
        }
    }
}
