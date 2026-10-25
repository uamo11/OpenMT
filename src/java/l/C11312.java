package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* compiled from: 71K9 */
/* renamed from: l.ۧ᩺ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11312 implements AdapterView.OnItemSelectedListener {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f33861;

    /* renamed from: ۧ۟۫, reason: not valid java name and contains not printable characters */
    private static final short[] f33862 = {9864, -23538, 27874, -21010, -27079, -25795, -30700, -31898, 27764, -23561, 25369, 30096, 25930, 27771, -32032, -27148, -18887, -30599, 32651, -30693, -23838, -27521, -18912, 30282, -22523, 9243, -5298, -5311, -5308, -5299, -5307, -5305, -5300, -5299, -5305, -5288, -5284, -5309, -5299, -5299, -5288, -5271, -5288, -5309, -5253, -5311, -5297, -5270, -5308, -5305, -5301, -5309, 3017, -2665, -1047, 374, 3089, 2464, -708, -4376, 7819, -4229, -10061, 6447, -6326, 556, 10268, -3505, 14662, -1832, -13754, -13839, -22629, -22629, -22575, -22576, -22579, 9362, -4349, 6799, 1547, 30513, 30521, 30520, 7642, -2953, -7701, 5849, -2743, 6344, 11816, 4247, -7807, 4848, 6962, -4306, 2108, -7708, -2051, 3851, 11338, 11341, 11343, 11339, 11339, 11339, 3426, 22579, -18869, -25836, -24072, 22398, 23687, -17643, 23977, 20017, 20343, 18122, -16436};

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static String f33863;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EditText f33864;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public TextView f33865;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16560 f33866;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public TextView f33867;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f33868;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f33869;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (l.RunnableC0588.f2309 >= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x022d, code lost:
    
        r0 = (r16 - l.C2105.m6981("ۨ᩵")) * 67;
        r7 = ((r0 ^ r15) * (-5053)) ^ (-1362314736);
        r20 = -174059077;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        if (l.C1128.f4106 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x022b, code lost:
    
        if (l.C3746.f11829 > 0) goto L60;
     */
    static {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11312.<clinit>():void");
    }

    public C11312(AbstractC15440 abstractC15440, final C16560 c16560, final String str) {
        int i;
        short[] sArr;
        short[] sArr2;
        int i2;
        int i3;
        int i4;
        int i5;
        short[] sArr3;
        EditText editText;
        short[] sArr4;
        View view;
        short[] sArr5;
        int i6;
        int i7;
        int i8;
        int i9;
        short[] sArr6;
        View view2;
        short[] sArr7;
        int i10;
        short[] sArr8;
        View view3;
        int i11;
        View view4;
        int m6981;
        int i12;
        int i13;
        EditText editText2;
        View view5;
        int m69812;
        int i14;
        int i15;
        int m69813;
        int i16;
        int m2566;
        int i17;
        int i18;
        DialogInterfaceC0206 dialogInterfaceC0206 = null;
        int i19 = -1496847620;
        int i20 = C3911.f12484;
        int i21 = C0483.f2088;
        short s = f33862[0];
        int i22 = ((s * s) + 23716) - (s * 308) < 0 ? 64469 : 63850;
        int m69814 = (i20 - C2105.m6981("֫᩹")) * 27;
        EditText editText3 = null;
        C19258 c19258 = null;
        short[] sArr9 = null;
        short[] sArr10 = null;
        short[] sArr11 = null;
        short[] sArr12 = null;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        Main main = null;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        View view6 = null;
        int i31 = 0;
        Spinner spinner = null;
        View view7 = null;
        String str2 = null;
        int i32 = 0;
        int i33 = ((m69814 ^ i21) * (-4073)) ^ (-2081617154);
        DialogInterface.OnClickListener onClickListener = null;
        short[] sArr13 = null;
        int i34 = 0;
        int i35 = m69814 ^ 974363826;
        short[] sArr14 = null;
        int i36 = 0;
        while (true) {
            i19 = i35 ^ (i33 & (((i19 ^ i21) * 3975) >> 31));
            switch (i19) {
                case -2094422850:
                case -2063583909:
                    i26 = C2105.m6981(str2) ^ 2124896992;
                    sArr13 = f33862;
                    i23 = 22;
                    if (C4263.f13799 <= 0) {
                        i9 = i32;
                        editText2 = editText3;
                        view5 = view6;
                        sArr7 = sArr14;
                        m69813 = (C0630.m2566("֡ۨ") ^ i20) * 41;
                        i33 = ((m69813 ^ i21) * (-7351)) ^ (-921442944);
                        i16 = -1506538537;
                        i15 = m69813 ^ i16;
                        editText3 = editText2;
                        i32 = i9;
                        View view8 = view5;
                        i35 = i15;
                        sArr14 = sArr7;
                        view6 = view8;
                    } else {
                        m2566 = (C0630.m2566("ۡ᩷") + i21) * (-3);
                        i17 = ((m2566 ^ i20) * 22177) ^ (-1186889029);
                        i18 = 168870521;
                        i35 = m2566 ^ i18;
                        i33 = i17;
                    }
                case -1888785038:
                case 1560009024:
                    sArr8 = sArr14;
                    int i37 = i32;
                    short[] sArr15 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    i4 = i29;
                    i5 = i36;
                    sArr3 = sArr11;
                    editText = editText3;
                    sArr4 = sArr15;
                    View m10739 = C3537.m10739(main, i28);
                    int m25662 = C0630.m2566(RunnableC1937.m6385(f33862, 4, 3, i22));
                    int m69815 = (C2105.m6981("᩸֫") + i20) * (-89);
                    int i38 = ((m69815 ^ i21) * (-4003)) ^ (-599998473);
                    i35 = m69815 ^ 913162391;
                    sArr10 = sArr10;
                    i33 = i38;
                    i32 = i37;
                    view3 = m10739;
                    i27 = m25662;
                    sArr14 = sArr8;
                    view6 = view3;
                    int i39 = i4;
                    i34 = i3;
                    i23 = i2;
                    sArr12 = sArr4;
                    editText3 = editText;
                    sArr11 = sArr3;
                    i36 = i5;
                    i29 = i39;
                case -1887091089:
                case -918371657:
                    i11 = i32;
                    view4 = view6;
                    sArr8 = sArr14;
                    short[] sArr16 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    i4 = i29;
                    i5 = i36;
                    sArr3 = sArr11;
                    editText = editText3;
                    sArr4 = sArr16;
                    spinner = (Spinner) C1005.m3507(view4, i27 ^ 2124694985);
                    sArr10 = f33862;
                    if (C7811.f24123 < 0) {
                        m6981 = C2105.m6981("ۗᩴ") ^ i21;
                        i33 = (-665096781) ^ ((m6981 ^ i20) * 14203);
                        i12 = 513155912;
                        i13 = m6981 ^ i12;
                        i32 = i11;
                        view3 = view4;
                        i35 = i13;
                        sArr14 = sArr8;
                        view6 = view3;
                        int i392 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i392;
                    }
                    m6981 = C0630.m2566("ᩳ᩹") ^ i21;
                    i33 = (-602013464) ^ ((m6981 ^ i20) * (-10861));
                    i12 = -494399169;
                    i13 = m6981 ^ i12;
                    i32 = i11;
                    view3 = view4;
                    i35 = i13;
                    sArr14 = sArr8;
                    view6 = view3;
                    int i3922 = i4;
                    i34 = i3;
                    i23 = i2;
                    sArr12 = sArr4;
                    editText3 = editText;
                    sArr11 = sArr3;
                    i36 = i5;
                    i29 = i3922;
                case -1358501687:
                case 378689423:
                    AbstractC2021.m6574();
                    ViewOnClickListenerC1958.m6429();
                    i8 = i22;
                    i9 = i32;
                    sArr6 = sArr10;
                    view2 = view6;
                    sArr7 = sArr14;
                    i10 = i36;
                    sArr3 = sArr11;
                    editText = editText3;
                    sArr4 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    int m25663 = C0630.m2566("᩷۬") ^ i20;
                    int i40 = ((m25663 ^ i21) * 20559) ^ (-531544991);
                    i35 = m25663 ^ 738241993;
                    i34 = i3;
                    i23 = i2;
                    sArr12 = sArr4;
                    i22 = i8;
                    editText3 = editText;
                    sArr11 = sArr3;
                    i36 = i10;
                    sArr14 = sArr7;
                    view6 = view2;
                    sArr10 = sArr6;
                    i33 = i40;
                    i32 = i9;
                case -1331791759:
                case 1667777087:
                    i9 = i32;
                    int i41 = i30;
                    editText2 = editText3;
                    view5 = view6;
                    sArr7 = sArr14;
                    short[] sArr17 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    sArr4 = sArr17;
                    this.f33867 = (TextView) C1005.m3507(view5, C2105.m6981(C1005.m3502(sArr17, i41, i3, i22)) ^ 2100621979);
                    if (C1711.f5919) {
                        i8 = i22;
                        i30 = i41;
                        sArr6 = sArr10;
                        i10 = i36;
                        view2 = view5;
                        sArr3 = sArr11;
                        editText = editText2;
                        int m256632 = C0630.m2566("᩷۬") ^ i20;
                        int i402 = ((m256632 ^ i21) * 20559) ^ (-531544991);
                        i35 = m256632 ^ 738241993;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        i22 = i8;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i10;
                        sArr14 = sArr7;
                        view6 = view2;
                        sArr10 = sArr6;
                        i33 = i402;
                        i32 = i9;
                    } else {
                        m69812 = C2105.m6981("ۗ۬") ^ i21;
                        i30 = i41;
                        i33 = ((m69812 ^ i20) * 31389) ^ 1700508261;
                        i14 = -1970252200;
                        i15 = m69812 ^ i14;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText2;
                        i32 = i9;
                        View view82 = view5;
                        i35 = i15;
                        sArr14 = sArr7;
                        view6 = view82;
                    }
                case -1302081949:
                case 1674325487:
                    i8 = i22;
                    i9 = i32;
                    sArr6 = sArr10;
                    view2 = view6;
                    sArr7 = sArr14;
                    short[] sArr18 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    i4 = i29;
                    i5 = i36;
                    sArr3 = sArr11;
                    editText = editText3;
                    sArr4 = sArr18;
                    this.f33868 = 0;
                    this.f33866 = c16560;
                    this.f33869 = abstractC15440;
                    main = C21923.m49336(c16560);
                    sArr9 = f33862;
                    i31 = 1;
                    if (C3746.f11829 <= 0) {
                        i10 = i5;
                        i29 = i4;
                        int m2566322 = C0630.m2566("᩷۬") ^ i20;
                        int i4022 = ((m2566322 ^ i21) * 20559) ^ (-531544991);
                        i35 = m2566322 ^ 738241993;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        i22 = i8;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i10;
                        sArr14 = sArr7;
                        view6 = view2;
                        sArr10 = sArr6;
                        i33 = i4022;
                        i32 = i9;
                    } else {
                        int m25664 = (C0630.m2566("۫֨") + i20) * 43;
                        int i42 = ((m25664 ^ i21) * (-15513)) ^ (-1922369405);
                        i32 = i9;
                        i22 = i8;
                        i35 = m25664 ^ (-1648119174);
                        sArr14 = sArr7;
                        view6 = view2;
                        sArr10 = sArr6;
                        i33 = i42;
                        int i39222 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i39222;
                    }
                case -1105853470:
                case 1034422618:
                    C0798.m2998();
                    if (C22628.f73083 <= 0) {
                        i8 = i22;
                        i9 = i32;
                        sArr6 = sArr10;
                        view2 = view6;
                        sArr7 = sArr14;
                        i10 = i36;
                        sArr3 = sArr11;
                        editText = editText3;
                        sArr4 = sArr12;
                        i2 = i23;
                        i3 = i34;
                        int m25663222 = C0630.m2566("᩷۬") ^ i20;
                        int i40222 = ((m25663222 ^ i21) * 20559) ^ (-531544991);
                        i35 = m25663222 ^ 738241993;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        i22 = i8;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i10;
                        sArr14 = sArr7;
                        view6 = view2;
                        sArr10 = sArr6;
                        i33 = i40222;
                        i32 = i9;
                    } else {
                        int m69816 = C2105.m6981("۬֡") ^ i20;
                        i33 = ((m69816 ^ i21) * 7289) ^ 1612395422;
                        i35 = m69816 ^ 564565797;
                    }
                case -1045062858:
                case 947645676:
                    i11 = i32;
                    int i43 = i29;
                    i5 = i36;
                    EditText editText4 = editText3;
                    view4 = view6;
                    sArr8 = sArr14;
                    sArr3 = sArr11;
                    sArr4 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    editText = editText4;
                    i4 = i43;
                    short[] sArr19 = sArr10;
                    view7 = C11340.m28028(view4, C0630.m2566(C3683.m11225(sArr19, 7, 3, i22)) ^ 2127991790);
                    if (C22628.m50615() != 0) {
                        sArr10 = sArr19;
                        m6981 = C0630.m2566("ᩳ᩹") ^ i21;
                        i33 = (-602013464) ^ ((m6981 ^ i20) * (-10861));
                        i12 = -494399169;
                        i13 = m6981 ^ i12;
                        i32 = i11;
                        view3 = view4;
                        i35 = i13;
                        sArr14 = sArr8;
                        view6 = view3;
                        int i392222 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i392222;
                    } else {
                        int m25665 = C0630.m2566("᩸᩹") ^ i21;
                        int i44 = ((m25665 ^ i20) * (-22473)) ^ 1949735007;
                        i13 = m25665 ^ (-1789907975);
                        sArr10 = sArr19;
                        i33 = i44;
                        i32 = i11;
                        view3 = view4;
                        i35 = i13;
                        sArr14 = sArr8;
                        view6 = view3;
                        int i3922222 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i3922222;
                    }
                case -951751419:
                case -105157104:
                    ServiceConnectionC3453.m10564();
                    if (RunnableC0588.f2309 >= 0) {
                        i8 = i22;
                        i9 = i32;
                        sArr6 = sArr10;
                        view2 = view6;
                        sArr7 = sArr14;
                        i10 = i36;
                        sArr3 = sArr11;
                        editText = editText3;
                        sArr4 = sArr12;
                        i2 = i23;
                        i3 = i34;
                        int m256632222 = C0630.m2566("᩷۬") ^ i20;
                        int i402222 = ((m256632222 ^ i21) * 20559) ^ (-531544991);
                        i35 = m256632222 ^ 738241993;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        i22 = i8;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i10;
                        sArr14 = sArr7;
                        view6 = view2;
                        sArr10 = sArr6;
                        i33 = i402222;
                        i32 = i9;
                    } else {
                        i = i32;
                        sArr = sArr10;
                        view = view6;
                        sArr5 = sArr9;
                        i6 = i31;
                        sArr2 = sArr14;
                        short[] sArr20 = sArr12;
                        i2 = i23;
                        i3 = i34;
                        i4 = i29;
                        i5 = i36;
                        sArr3 = sArr11;
                        editText = editText3;
                        sArr4 = sArr20;
                        int m25666 = (C0630.m2566("۟۠") ^ i21) * (-67);
                        int i45 = i22;
                        int i46 = ((m25666 ^ i20) * (-1373)) ^ (-1501837941);
                        i31 = i6;
                        sArr9 = sArr5;
                        i32 = i;
                        i35 = m25666 ^ 917976339;
                        sArr14 = sArr2;
                        view6 = view;
                        sArr10 = sArr;
                        i33 = i46;
                        i22 = i45;
                        i7 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i7;
                    }
                case -891244407:
                case -260514491:
                    C2105.m6982();
                    throw new RuntimeException();
                case -713656685:
                case 1495689848:
                    int i47 = i32;
                    int i48 = i29;
                    int i49 = i36;
                    View view9 = view6;
                    short[] sArr21 = sArr14;
                    short[] sArr22 = sArr11;
                    EditText editText5 = (EditText) C11340.m28028(view9, C2105.m6981(C0798.m3005(sArr22, i48, i49, i22)) ^ 2103408996);
                    int m25667 = C0630.m2566("֫᩸") ^ i21;
                    i34 = i34;
                    i23 = i23;
                    sArr12 = sArr12;
                    editText3 = editText5;
                    sArr11 = sArr22;
                    i36 = i49;
                    i32 = i47;
                    i7 = i48;
                    i33 = ((m25667 ^ i20) * (-21433)) ^ (-77960099);
                    sArr14 = sArr21;
                    view6 = view9;
                    i35 = m25667 ^ (-989593391);
                    i29 = i7;
                case -71170379:
                case 1906858832:
                    i25 = C2105.m6981(RunnableC0588.m2436(sArr14, i32, i24, i22)) ^ 2116417995;
                    if (C0483.m2121()) {
                        m2566 = (C0630.m2566("᩵ۙ") ^ i21) * (-97);
                        i17 = ((m2566 ^ i20) * 28655) ^ (-1437607192);
                        i18 = 301800133;
                        i35 = m2566 ^ i18;
                        i33 = i17;
                    } else {
                        i11 = i32;
                        view4 = view6;
                        sArr8 = sArr14;
                        short[] sArr23 = sArr12;
                        i2 = i23;
                        i3 = i34;
                        i4 = i29;
                        i5 = i36;
                        sArr3 = sArr11;
                        editText = editText3;
                        sArr4 = sArr23;
                        m6981 = C0630.m2566("ᩳ᩹") ^ i21;
                        i33 = (-602013464) ^ ((m6981 ^ i20) * (-10861));
                        i12 = -494399169;
                        i13 = m6981 ^ i12;
                        i32 = i11;
                        view3 = view4;
                        i35 = i13;
                        sArr14 = sArr8;
                        view6 = view3;
                        int i39222222 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i39222222;
                    }
                case 208704508:
                case 1437850286:
                    view5 = view6;
                    spinner.setOnItemSelectedListener(this);
                    sArr7 = sArr14;
                    i9 = i32;
                    editText2 = editText3;
                    C1047.m3601(editText2, f33863);
                    editText2.setSelection(RunnableC1937.m6384(editText2));
                    if (AbstractC2021.f6743 > 0) {
                        m69813 = (C2105.m6981("۫۠") + i20) * 75;
                        i33 = ((m69813 ^ i21) * (-6483)) ^ (-1581396786);
                        i16 = -459881238;
                        i15 = m69813 ^ i16;
                        editText3 = editText2;
                        i32 = i9;
                        View view822 = view5;
                        i35 = i15;
                        sArr14 = sArr7;
                        view6 = view822;
                    }
                    m69813 = (C0630.m2566("֡ۨ") ^ i20) * 41;
                    i33 = ((m69813 ^ i21) * (-7351)) ^ (-921442944);
                    i16 = -1506538537;
                    i15 = m69813 ^ i16;
                    editText3 = editText2;
                    i32 = i9;
                    View view8222 = view5;
                    i35 = i15;
                    sArr14 = sArr7;
                    view6 = view8222;
                case 438803711:
                case 640006911:
                    i9 = i32;
                    int i50 = i23;
                    editText2 = editText3;
                    view5 = view6;
                    sArr7 = sArr14;
                    this.f33864 = editText2;
                    short[] sArr24 = f33862;
                    i30 = 13;
                    i34 = 3;
                    if (C4159.m12565() >= 0) {
                        i23 = i50;
                        sArr12 = sArr24;
                        m69813 = (C0630.m2566("֡ۨ") ^ i20) * 41;
                        i33 = ((m69813 ^ i21) * (-7351)) ^ (-921442944);
                        i16 = -1506538537;
                        i15 = m69813 ^ i16;
                        editText3 = editText2;
                        i32 = i9;
                        View view82222 = view5;
                        i35 = i15;
                        sArr14 = sArr7;
                        view6 = view82222;
                    } else {
                        int m69817 = (C2105.m6981("᩻֫") ^ i20) * 83;
                        editText3 = editText2;
                        i32 = i9;
                        sArr12 = sArr24;
                        sArr14 = sArr7;
                        view6 = view5;
                        i35 = m69817 ^ (-1178501856);
                        i33 = ((m69817 ^ i21) * 17971) ^ 547791578;
                        i23 = i50;
                    }
                case 541678396:
                case 1435495452:
                    i = i32;
                    sArr = sArr10;
                    View view10 = view6;
                    sArr2 = sArr14;
                    short[] sArr25 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    i4 = i29;
                    i5 = i36;
                    sArr3 = sArr11;
                    editText = editText3;
                    sArr4 = sArr25;
                    view = view10;
                    sArr5 = sArr9;
                    i6 = i31;
                    i28 = C0630.m2566(C0964.m3396(sArr5, i6, 3, i22)) ^ 2122056733;
                    if (RunnableC1108.f4040) {
                        int i51 = i22;
                        int m25668 = C0630.m2566("ܶ᩷") ^ i21;
                        int i52 = ((m25668 ^ i20) * 11767) ^ 1117516547;
                        i31 = i6;
                        sArr9 = sArr5;
                        i32 = i;
                        i35 = m25668 ^ 1346945392;
                        i22 = i51;
                        i33 = i52;
                        sArr14 = sArr2;
                        view6 = view;
                        sArr10 = sArr;
                        int i392222222 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i392222222;
                    } else {
                        int m256662 = (C0630.m2566("۟۠") ^ i21) * (-67);
                        int i452 = i22;
                        int i462 = ((m256662 ^ i20) * (-1373)) ^ (-1501837941);
                        i31 = i6;
                        sArr9 = sArr5;
                        i32 = i;
                        i35 = m256662 ^ 917976339;
                        sArr14 = sArr2;
                        view6 = view;
                        sArr10 = sArr;
                        i33 = i462;
                        i22 = i452;
                        i7 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i7;
                    }
                case 818140803:
                case 2091899763:
                    C10025.m25199(c16560, dialogInterfaceC0206, str);
                    final Spinner spinner2 = spinner;
                    final DialogInterfaceC0206 dialogInterfaceC02062 = dialogInterfaceC0206;
                    C4159.m12564(C21923.m49343(dialogInterfaceC0206), new View.OnClickListener(this) { // from class: l.᩶ۨܽ

                        /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
                        public final /* synthetic */ C11312 f65258;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view11) {
                            C16560 c165602 = null;
                            String str3 = null;
                            C11312 c11312 = null;
                            Spinner spinner3 = null;
                            int i53 = 851280034;
                            int i54 = AbstractC2021.f6743;
                            int i55 = C1294.f4556;
                            int m69818 = C2105.m6981("ܳܽ") ^ i54;
                            int i56 = ((m69818 ^ i55) * 18029) ^ (-876731044);
                            int i57 = 946134294;
                            while (true) {
                                i53 = ((((i53 ^ i55) * (-20057)) >> 31) & i56) ^ (m69818 ^ i57);
                                switch (i53) {
                                    case -2112435227:
                                    case -1539390723:
                                        if (C1128.f4106 <= 0) {
                                            m69818 = (C2105.m6981("֨۟") ^ i54) * (-73);
                                            i56 = ((m69818 ^ i55) * 501) ^ 1909944805;
                                            i57 = -340954022;
                                        } else {
                                            m69818 = C2105.m6981("ۨ۠") ^ i54;
                                            i56 = ((m69818 ^ i55) * (-31531)) ^ 12755921;
                                            i57 = 488219046;
                                        }
                                    case -2046338404:
                                    case 1270084317:
                                        c165602 = c16560;
                                        if (C3663.f11553) {
                                            m69818 = C2105.m6981("ܿ֡") ^ i55;
                                            i56 = ((m69818 ^ i54) * 14627) ^ (-1653079156);
                                            i57 = 687448885;
                                        } else {
                                            m69818 = C2105.m6981("ۤۜ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 22089) ^ (-1031773551);
                                            i57 = 1884524861;
                                        }
                                    case -2014186660:
                                    case 2140554798:
                                        AbstractC2021.m6574();
                                        if (C1294.f4556 < 0) {
                                            m69818 = (C2105.m6981("֨۟") ^ i54) * (-73);
                                            i56 = ((m69818 ^ i55) * 501) ^ 1909944805;
                                            i57 = -340954022;
                                        } else {
                                            m69818 = (i54 - C2105.m6981("ۙܺ")) * (-79);
                                            i56 = ((m69818 ^ i55) * (-10687)) ^ 1938794522;
                                            i57 = 771606959;
                                        }
                                    case -1927573466:
                                    case -363581365:
                                        c11312 = this.f65258;
                                        spinner3 = spinner2;
                                        if (RunnableC1108.f4040) {
                                            m69818 = C2105.m6981("ܶܰ") ^ i54;
                                            i56 = ((m69818 ^ i55) * 11309) ^ (-1315576306);
                                            i57 = -135887262;
                                        } else {
                                            m69818 = C0630.m2566("ۗᩳ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 6069) ^ 1306298541;
                                            i57 = -73876338;
                                        }
                                    case -1588793509:
                                    case -819902593:
                                        C11312.m27957(c11312, spinner3, dialogInterfaceC02062, c165602, str3);
                                        break;
                                    case -1586622626:
                                    case 1818016461:
                                        RunnableC0588.m2441();
                                        if (C0050.f910 < 0) {
                                            m69818 = C0630.m2566("ۗᩳ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 6069) ^ 1306298541;
                                            i57 = -73876338;
                                        } else {
                                            m69818 = (i55 - C0630.m2566("ۙܿ")) * 31;
                                            i56 = ((m69818 ^ i54) * 25509) ^ 1009115181;
                                            i57 = -705975307;
                                        }
                                    case -1562837002:
                                    case -1072240864:
                                        C3911.m11924();
                                        break;
                                    case -1291207407:
                                    case -720381637:
                                        if (C0422.f1886 <= 0) {
                                            m69818 = C0630.m2566("ۗᩳ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 6069) ^ 1306298541;
                                            i57 = -73876338;
                                        } else {
                                            m69818 = C2105.m6981("۟ۛ") ^ i54;
                                            i56 = ((m69818 ^ i55) * 27833) ^ 1017342699;
                                            i57 = 158671548;
                                        }
                                    case -767901069:
                                    case -287786886:
                                        if (C2167.f7158 >= 0) {
                                            m69818 = C2105.m6981("ܿ֡") ^ i55;
                                            i56 = ((m69818 ^ i54) * 14627) ^ (-1653079156);
                                            i57 = 687448885;
                                        } else {
                                            m69818 = C2105.m6981("ܿ᩻") ^ i54;
                                            i56 = ((m69818 ^ i55) * 10205) ^ 1795393660;
                                            i57 = -225135006;
                                        }
                                    case -547619986:
                                    case -176361041:
                                        str3 = str;
                                        if (C1294.m4372() <= 0) {
                                            m69818 = C2105.m6981("ܿ֡") ^ i55;
                                            i56 = ((m69818 ^ i54) * 14627) ^ (-1653079156);
                                            i57 = 687448885;
                                        } else {
                                            m69818 = (C0630.m2566("᩹᩻") ^ i55) * (-37);
                                            i56 = ((m69818 ^ i54) * 28145) ^ 289467229;
                                            i57 = 1046385045;
                                        }
                                    case 952813712:
                                    case 1418781913:
                                        C4117.m12364();
                                        m69818 = (C2105.m6981("֨۟") ^ i54) * (-73);
                                        i56 = ((m69818 ^ i55) * 501) ^ 1909944805;
                                        i57 = -340954022;
                                    case 1392600203:
                                    case 1437354639:
                                        if (C4075.m12263() <= 0) {
                                            m69818 = (C2105.m6981("֨۟") ^ i54) * (-73);
                                            i56 = ((m69818 ^ i55) * 501) ^ 1909944805;
                                            i57 = -340954022;
                                        } else {
                                            m69818 = C2105.m6981("᩻֡") ^ i54;
                                            i56 = ((m69818 ^ i55) * 15175) ^ 828710888;
                                            i57 = -2086245314;
                                        }
                                    case 1567322010:
                                    case 1955426104:
                                        if (C0964.f3626 != 0) {
                                            m69818 = C0630.m2566("ۗᩳ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 6069) ^ 1306298541;
                                            i57 = -73876338;
                                        } else {
                                            m69818 = C0630.m2566("ۚܶ") ^ i55;
                                            i56 = ((m69818 ^ i54) * (-25969)) ^ (-1220945659);
                                            i57 = 2100473796;
                                        }
                                    case 1608480483:
                                    case 2101512668:
                                        if (ServiceConnectionC3453.f10921 >= 0) {
                                            m69818 = (i55 - C0630.m2566("ۙܿ")) * 31;
                                            i56 = ((m69818 ^ i54) * 25509) ^ 1009115181;
                                            i57 = -705975307;
                                        } else {
                                            m69818 = (C2105.m6981("ۤۚ") ^ i55) * 33;
                                            i56 = ((m69818 ^ i54) * 21261) ^ 1045091012;
                                            i57 = -459744571;
                                        }
                                    case 1859040511:
                                    case 1996013625:
                                        if (C2958.f9394 >= 0) {
                                            m69818 = (i54 - C2105.m6981("ۙܺ")) * (-79);
                                            i56 = ((m69818 ^ i55) * (-10687)) ^ 1938794522;
                                            i57 = 771606959;
                                        } else {
                                            m69818 = (C2105.m6981("᩺֨") + i55) * (-127);
                                            i56 = ((m69818 ^ i54) * 30829) ^ 686485142;
                                            i57 = 2092953238;
                                        }
                                    default:
                                        if (ViewOnClickListenerC1958.f6529 > 0) {
                                            m69818 = (C2105.m6981("֨۟") ^ i54) * (-73);
                                            i56 = ((m69818 ^ i55) * 501) ^ 1909944805;
                                            i57 = -340954022;
                                        } else {
                                            m69818 = C0630.m2566("ۗᩳ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 6069) ^ 1306298541;
                                            i57 = -73876338;
                                        }
                                }
                                return;
                            }
                        }

                        {
                            int i53 = 1619383248;
                            int i54 = C2167.f7158;
                            int i55 = ServiceConnectionC3453.f10921;
                            int m69818 = C2105.m6981("ۙۙ") ^ i54;
                            int i56 = ((m69818 ^ i55) * (-16421)) ^ 1441730123;
                            int i57 = -1554038497;
                            while (true) {
                                i53 = ((((i53 ^ i55) * 3081) >> 31) & i56) ^ (m69818 ^ i57);
                                switch (i53) {
                                    case -2140208615:
                                    case 1273927896:
                                        C0422.m1963();
                                        if (C2958.f9394 < 0) {
                                            m69818 = C2105.m6981("᩵᩶") ^ i55;
                                            i56 = ((m69818 ^ i54) * 9395) ^ (-384634026);
                                            i57 = 690485445;
                                        } else {
                                            m69818 = (C0630.m2566("᩷۬") + i55) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i56 = ((m69818 ^ i54) * 13741) ^ 1316137150;
                                            i57 = -1056018144;
                                        }
                                    case -1876174523:
                                    case 1820023624:
                                        if (C4263.m12819() >= 0) {
                                            m69818 = C0630.m2566("֡۬") ^ i54;
                                            i56 = ((m69818 ^ i55) * 15157) ^ 142328022;
                                            i57 = -1445088621;
                                        } else {
                                            m69818 = (i54 - C2105.m6981("᩷ۢ")) * UMErrorCode.E_UM_BE_CREATE_FAILED;
                                            i56 = ((m69818 ^ i55) * 7265) ^ 1504766761;
                                            i57 = 423585647;
                                        }
                                    case -1742803357:
                                    case -416071012:
                                        if (C7106.f21815 != 0) {
                                            m69818 = C0630.m2566("֡۬") ^ i54;
                                            i56 = ((m69818 ^ i55) * 15157) ^ 142328022;
                                            i57 = -1445088621;
                                        } else {
                                            m69818 = C2105.m6981("᩵᩶") ^ i55;
                                            i56 = ((m69818 ^ i54) * 9395) ^ (-384634026);
                                            i57 = 690485445;
                                        }
                                    case -1552272475:
                                    case 1327932673:
                                        if (C0798.f2919) {
                                            m69818 = (C0630.m2566("᩷۬") + i55) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                                            i56 = ((m69818 ^ i54) * 13741) ^ 1316137150;
                                            i57 = -1056018144;
                                        } else {
                                            m69818 = (C0630.m2566("ܺۜ") + i54) * (-77);
                                            i56 = ((m69818 ^ i55) * (-21883)) ^ (-2100982855);
                                            i57 = 1211253289;
                                        }
                                    case -1430869769:
                                    case -764531610:
                                        if (C1005.f3721) {
                                            m69818 = C0630.m2566("ܰ۟") ^ i54;
                                            i56 = ((m69818 ^ i55) * (-4263)) ^ 1342680149;
                                            i57 = 466151575;
                                        } else {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i55) * 27;
                                            i56 = ((m69818 ^ i54) * 9117) ^ 1620727777;
                                            i57 = -1899457741;
                                        }
                                    case -1029799650:
                                    case 2069505242:
                                        if (RunnableC3474.f10992 <= 0) {
                                            m69818 = C2105.m6981("᩵᩶") ^ i55;
                                            i56 = ((m69818 ^ i54) * 9395) ^ (-384634026);
                                            i57 = 690485445;
                                        } else {
                                            m69818 = C2105.m6981("ᩳܿ") ^ i54;
                                            i56 = ((m69818 ^ i55) * 22417) ^ 1766532052;
                                            i57 = 1050637816;
                                        }
                                    case -406142222:
                                    case 201260092:
                                        if (C1128.m3851() <= 0) {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i55) * 27;
                                            i56 = ((m69818 ^ i54) * 9117) ^ 1620727777;
                                            i57 = -1899457741;
                                        } else {
                                            m69818 = C2105.m6981("ۢᩴ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 807) ^ 953179597;
                                            i57 = -1992471163;
                                        }
                                    case -394255183:
                                    case 707807360:
                                        if (C3019.f9544 >= 0) {
                                            m69818 = C2105.m6981("᩵᩶") ^ i55;
                                            i56 = ((m69818 ^ i54) * 9395) ^ (-384634026);
                                            i57 = 690485445;
                                        } else {
                                            m69818 = C2105.m6981("᩸ۙ") ^ i55;
                                            i56 = ((m69818 ^ i54) * 2515) ^ (-1849162044);
                                            i57 = 1178756838;
                                        }
                                    case -119530336:
                                    case 2047415833:
                                        this.f65258 = this;
                                        if (C4075.f12947 >= 0) {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i55) * 27;
                                            i56 = ((m69818 ^ i54) * 9117) ^ 1620727777;
                                            i57 = -1899457741;
                                        } else {
                                            m69818 = C0630.m2566("ۚۨ") ^ i54;
                                            i56 = ((m69818 ^ i55) * (-17715)) ^ (-892006076);
                                            i57 = -1526644510;
                                        }
                                    case 141114185:
                                    case 1552070848:
                                        if (C0964.m3413()) {
                                            m69818 = (C2105.m6981("ܿ᩸") + i55) * (-41);
                                            i56 = ((m69818 ^ i54) * (-32323)) ^ (-366811320);
                                            i57 = 1616519495;
                                        } else {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i55) * 27;
                                            i56 = ((m69818 ^ i54) * 9117) ^ 1620727777;
                                            i57 = -1899457741;
                                        }
                                    case 334978006:
                                    case 572483994:
                                        if (C0964.f3626 != 0) {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i55) * 27;
                                            i56 = ((m69818 ^ i54) * 9117) ^ 1620727777;
                                            i57 = -1899457741;
                                        } else {
                                            m69818 = (C0630.m2566("ܳۚ") + i55) * 91;
                                            i56 = ((m69818 ^ i54) * (-16771)) ^ (-1750014053);
                                            i57 = -1626591000;
                                        }
                                    case 476126377:
                                    case 1888193502:
                                        C2126.m7040();
                                        throw new RuntimeException();
                                    case 1299935478:
                                    case 1707759399:
                                        return;
                                    case 1676891016:
                                    case 1893373828:
                                        if (C0382.f1805) {
                                            m69818 = C2105.m6981("᩵᩶") ^ i55;
                                            i56 = ((m69818 ^ i54) * 9395) ^ (-384634026);
                                            i57 = 690485445;
                                        } else {
                                            m69818 = (C2105.m6981("᩶ۜ") ^ i54) * 83;
                                            i56 = ((m69818 ^ i55) * (-17965)) ^ (-1026705775);
                                            i57 = 1025822168;
                                        }
                                    case 1990081526:
                                    case 2086082442:
                                        if (C4263.f13799 <= 0) {
                                            m69818 = (C2105.m6981("ۗۜ") ^ i55) * 27;
                                            i56 = ((m69818 ^ i54) * 9117) ^ 1620727777;
                                            i57 = -1899457741;
                                        } else {
                                            m69818 = (C0630.m2566("ۤܶ") + i55) * (-77);
                                            i56 = ((m69818 ^ i54) * 30513) ^ 2055564681;
                                            i57 = -441812250;
                                        }
                                    default:
                                        C4117.m12364();
                                        C21923.m49329();
                                        m69818 = C0630.m2566("֡۬") ^ i54;
                                        i56 = ((m69818 ^ i55) * 15157) ^ 142328022;
                                        i57 = -1445088621;
                                }
                            }
                        }
                    });
                    return;
                case 1017409239:
                case 1753476268:
                    dialogInterfaceC0206 = C5834.m16343(c19258, i26, onClickListener, C2105.m6981(C4616.m13542(sArr13, i23, 3, i22)) ^ 2116636572, onClickListener);
                    m2566 = (C0630.m2566("֨᩻") ^ i21) * 79;
                    i17 = ((m2566 ^ i20) * (-24707)) ^ (-514710047);
                    i18 = -1487828413;
                    i35 = m2566 ^ i18;
                    i33 = i17;
                case 1079756004:
                case 1790237923:
                    c19258 = C0483.m2130(C22628.m50612(c16560));
                    View view11 = view6;
                    C1711.m5727(c19258, view11);
                    sArr14 = f33862;
                    i24 = 3;
                    int m25669 = (C0630.m2566("ܳۤ") + i20) * (-39);
                    view6 = view11;
                    i33 = ((m25669 ^ i21) * (-11137)) ^ (-278408274);
                    i35 = m25669 ^ 679485571;
                    i32 = 16;
                case 1248867067:
                case 1963200341:
                    i9 = i32;
                    editText2 = editText3;
                    view5 = view6;
                    sArr7 = sArr14;
                    sArr4 = sArr12;
                    i2 = i23;
                    i3 = i34;
                    this.f33865 = (TextView) view7;
                    sArr11 = f33862;
                    i29 = 10;
                    i36 = 3;
                    if (C4075.f12947 >= 0) {
                        i8 = i22;
                        sArr6 = sArr10;
                        sArr3 = sArr11;
                        i10 = 3;
                        view2 = view5;
                        editText = editText2;
                        int m2566322222 = C0630.m2566("᩷۬") ^ i20;
                        int i4022222 = ((m2566322222 ^ i21) * 20559) ^ (-531544991);
                        i35 = m2566322222 ^ 738241993;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        i22 = i8;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i10;
                        sArr14 = sArr7;
                        view6 = view2;
                        sArr10 = sArr6;
                        i33 = i4022222;
                        i32 = i9;
                    } else {
                        m69812 = C2105.m6981("ۧ۠") ^ i20;
                        i33 = ((m69812 ^ i21) * 12627) ^ 383498998;
                        i14 = -1077571404;
                        i15 = m69812 ^ i14;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText2;
                        i32 = i9;
                        View view822222 = view5;
                        i35 = i15;
                        sArr14 = sArr7;
                        view6 = view822222;
                    }
                case 1699457692:
                case 1964389504:
                    C1294.m4380(c19258, i25, null);
                    String m12252 = C4075.m12252(f33862, 19, 3, i22);
                    int m256610 = (i20 - C0630.m2566("ۡۖ")) * 89;
                    str2 = m12252;
                    i35 = m256610 ^ (-1045721253);
                    i33 = ((m256610 ^ i21) * (-8753)) ^ 224132232;
                    onClickListener = null;
                default:
                    C0964.m3413();
                    if (C21923.f70183 == 0) {
                        i = i32;
                        sArr = sArr10;
                        view = view6;
                        sArr5 = sArr9;
                        i6 = i31;
                        sArr2 = sArr14;
                        short[] sArr202 = sArr12;
                        i2 = i23;
                        i3 = i34;
                        i4 = i29;
                        i5 = i36;
                        sArr3 = sArr11;
                        editText = editText3;
                        sArr4 = sArr202;
                        int m2566622 = (C0630.m2566("۟۠") ^ i21) * (-67);
                        int i4522 = i22;
                        int i4622 = ((m2566622 ^ i20) * (-1373)) ^ (-1501837941);
                        i31 = i6;
                        sArr9 = sArr5;
                        i32 = i;
                        i35 = m2566622 ^ 917976339;
                        sArr14 = sArr2;
                        view6 = view;
                        sArr10 = sArr;
                        i33 = i4622;
                        i22 = i4522;
                        i7 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i7;
                    } else {
                        i11 = i32;
                        view4 = view6;
                        sArr8 = sArr14;
                        short[] sArr232 = sArr12;
                        i2 = i23;
                        i3 = i34;
                        i4 = i29;
                        i5 = i36;
                        sArr3 = sArr11;
                        editText = editText3;
                        sArr4 = sArr232;
                        m6981 = C0630.m2566("ᩳ᩹") ^ i21;
                        i33 = (-602013464) ^ ((m6981 ^ i20) * (-10861));
                        i12 = -494399169;
                        i13 = m6981 ^ i12;
                        i32 = i11;
                        view3 = view4;
                        i35 = i13;
                        sArr14 = sArr8;
                        view6 = view3;
                        int i3922222222 = i4;
                        i34 = i3;
                        i23 = i2;
                        sArr12 = sArr4;
                        editText3 = editText;
                        sArr11 = sArr3;
                        i36 = i5;
                        i29 = i3922222222;
                    }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        r13 = l.C0630.m2566("ۖۜ") ^ r11;
        r14 = ((r13 ^ r12) * (-21337)) ^ (-2118654891);
        r15 = 795732388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (l.C0422.f1886 <= 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014e, code lost:
    
        if (r2 > 2000) goto L64;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m27957(final l.C11312 r18, final android.widget.Spinner r19, l.DialogInterfaceC0206 r20, l.C16560 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11312.m27957(l.ۧ᩺ܽ, android.widget.Spinner, l.֡ۚۢ, l.ܽۢܳ, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27956(C11312 c11312, Spinner spinner, int i, C11667 c11667, boolean z) {
        int i2;
        int m6981;
        int i3;
        int i4;
        int m2566;
        int i5;
        C11312 c113122 = c11312;
        int i6 = C0714.f2697;
        int i7 = ServiceConnectionC3453.f10921;
        int m25662 = (i6 - C0630.m2566("᩹۟")) * (-75);
        int i8 = ((m25662 ^ i7) * (-8223)) ^ 612164303;
        short[] sArr = null;
        short[] sArr2 = null;
        short[] sArr3 = null;
        int i9 = m25662 ^ 1970596239;
        int i10 = 0;
        short s = 0;
        int i11 = 0;
        char c = 0;
        int i12 = -113050739;
        int i13 = 0;
        C16560 c16560 = null;
        short[] sArr4 = null;
        int i14 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        C0994 c0994 = null;
        int i15 = 0;
        while (true) {
            i12 = i9 ^ (i8 & (((i12 ^ i7) * (-5113)) >> 31));
            switch (i12) {
                case -1914525972:
                case -863505099:
                    i2 = i15;
                    sArr = f33862;
                    c = 25;
                    if (!C0798.f2919) {
                        m2566 = (C2105.m6981("۟ۖ") ^ i6) * 53;
                        i8 = ((m2566 ^ i7) * 17163) ^ 495872440;
                        i5 = 1263135046;
                        int i16 = m2566 ^ i5;
                        i15 = i2;
                        i9 = i16;
                        c113122 = c11312;
                    }
                    i15 = i2;
                    int m25663 = C0630.m2566("ܺۡ") ^ i6;
                    i8 = ((m25663 ^ i7) * 5049) ^ (-227687872);
                    i9 = m25663 ^ (-1647350085);
                    c113122 = c11312;
                case -1889459953:
                case 2140732274:
                    if (C1128.m3851() > 0) {
                        int m69812 = C2105.m6981("֡ۚ") ^ i6;
                        i9 = m69812 ^ (-1824818231);
                        i8 = ((m69812 ^ i7) * (-23561)) ^ 1872399067;
                    } else {
                        i2 = i15;
                        m6981 = C0630.m2566("ۚ۟") ^ i7;
                        i3 = ((m6981 ^ i6) * 31695) ^ 1293287960;
                        i4 = 1433921616;
                        int i17 = i2;
                        i9 = m6981 ^ i4;
                        i8 = i3;
                        i15 = i17;
                    }
                case -1818443720:
                case 1970573588:
                    i2 = i15;
                    i11 = 60200;
                    m2566 = (C0630.m2566("᩹֡") + i6) * 17;
                    i8 = ((m2566 ^ i7) * (-13105)) ^ 136029372;
                    i5 = 1671719362;
                    int i162 = m2566 ^ i5;
                    i15 = i2;
                    i9 = i162;
                    c113122 = c11312;
                case -1600675803:
                case -1182742939:
                    C0483.m2121();
                    if (C3432.f10845 < 0) {
                        int m698122 = C2105.m6981("֡ۚ") ^ i6;
                        i9 = m698122 ^ (-1824818231);
                        i8 = ((m698122 ^ i7) * (-23561)) ^ 1872399067;
                    } else {
                        i2 = i15;
                        m2566 = C2105.m6981("ۡܳ") ^ i6;
                        i8 = ((m2566 ^ i7) * 5389) ^ 1415120266;
                        i5 = -1261856572;
                        int i1622 = m2566 ^ i5;
                        i15 = i2;
                        i9 = i1622;
                        c113122 = c11312;
                    }
                case -1510169714:
                case 300606629:
                    c0994.m3470(i, str);
                    C16560 c165602 = c113122.f33866;
                    c0994.m3480(c165602);
                    if (C3746.f11829 <= 0) {
                        c16560 = c165602;
                        int m256632 = C0630.m2566("ܺۡ") ^ i6;
                        i8 = ((m256632 ^ i7) * 5049) ^ (-227687872);
                        i9 = m256632 ^ (-1647350085);
                        c113122 = c11312;
                    } else {
                        int m25664 = (C0630.m2566("ۧܰ") + i7) * (-69);
                        i8 = ((m25664 ^ i6) * 14687) ^ 479162620;
                        i9 = m25664 ^ 398821969;
                        c16560 = c165602;
                    }
                case -1377957169:
                case 308813180:
                    i2 = i15;
                    RunnableC1937.m6379(c0994, C1047.m3603(sArr2, i14, 4, i11), str3);
                    sArr4 = f33862;
                    if (C2167.f7158 < 0) {
                        m6981 = C2105.m6981("ۜۘ") ^ i6;
                        i3 = ((m6981 ^ i7) * (-23663)) ^ (-833595964);
                        i4 = -174859583;
                        int i172 = i2;
                        i9 = m6981 ^ i4;
                        i8 = i3;
                        i15 = i172;
                    }
                    m6981 = C0630.m2566("ۚ۟") ^ i7;
                    i3 = ((m6981 ^ i6) * 31695) ^ 1293287960;
                    i4 = 1433921616;
                    int i1722 = i2;
                    i9 = m6981 ^ i4;
                    i8 = i3;
                    i15 = i1722;
                case -740652777:
                case 1878975276:
                    i2 = i15;
                    if (i13 - (s * 6862) >= 0) {
                        m2566 = (C0630.m2566("᩻ۗ") ^ i7) * (-119);
                        i8 = ((m2566 ^ i6) * 21423) ^ (-741212589);
                        i5 = -1354281416;
                    } else {
                        m2566 = (i7 - C2105.m6981("᩺ᩳ")) * (-55);
                        i8 = ((m2566 ^ i6) * (-753)) ^ 236273438;
                        i5 = 1991423156;
                    }
                    int i16222 = m2566 ^ i5;
                    i15 = i2;
                    i9 = i16222;
                    c113122 = c11312;
                case -459430635:
                case 1272411475:
                    i2 = i15;
                    str3 = C2958.m9025(c113122.f33869);
                    sArr2 = f33862;
                    i14 = 26;
                    if (C3663.f11553) {
                        i15 = i2;
                        int m2566322 = C0630.m2566("ܺۡ") ^ i6;
                        i8 = ((m2566322 ^ i7) * 5049) ^ (-227687872);
                        i9 = m2566322 ^ (-1647350085);
                        c113122 = c11312;
                    } else {
                        m6981 = (i7 - C2105.m6981("֡ᩴ")) * 53;
                        i3 = ((m6981 ^ i6) * (-11621)) ^ 1004065319;
                        i4 = -1561182418;
                        int i17222 = i2;
                        i9 = m6981 ^ i4;
                        i8 = i3;
                        i15 = i17222;
                    }
                case -342260528:
                case 984686668:
                    i2 = i15;
                    if (!C1420.m4913()) {
                        m2566 = C0630.m2566("᩵֫") ^ i7;
                        i8 = ((m2566 ^ i6) * 24573) ^ 154650646;
                        i5 = 1628858954;
                        int i162222 = m2566 ^ i5;
                        i15 = i2;
                        i9 = i162222;
                        c113122 = c11312;
                    }
                    m2566 = C2105.m6981("ۡܳ") ^ i6;
                    i8 = ((m2566 ^ i7) * 5389) ^ 1415120266;
                    i5 = -1261856572;
                    int i1622222 = m2566 ^ i5;
                    i15 = i2;
                    i9 = i1622222;
                    c113122 = c11312;
                case -85062784:
                case 282325879:
                    i15 = spinner.getSelectedItemPosition();
                    int i18 = C15104.f46193;
                    c0994 = new C0994(C2139.class);
                    if (C4263.f13799 > 0) {
                        int m69813 = C2105.m6981("ܺۙ") ^ i6;
                        i9 = m69813 ^ 1792170455;
                        i8 = ((m69813 ^ i7) * 24371) ^ 1493707824;
                        c113122 = c11312;
                    }
                    int m25663222 = C0630.m2566("ܺۡ") ^ i6;
                    i8 = ((m25663222 ^ i7) * 5049) ^ (-227687872);
                    i9 = m25663222 ^ (-1647350085);
                    c113122 = c11312;
                case 327193153:
                case 509178555:
                    C1005.m3501();
                    if (AbstractC2021.f6743 <= 0) {
                        i2 = i15;
                        m6981 = C0630.m2566("ۚ۟") ^ i7;
                        i3 = ((m6981 ^ i6) * 31695) ^ 1293287960;
                        i4 = 1433921616;
                        int i172222 = i2;
                        i9 = m6981 ^ i4;
                        i8 = i3;
                        i15 = i172222;
                    } else {
                        i2 = i15;
                        m2566 = C2105.m6981("ۘۘ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-3205)) ^ (-483492574);
                        i5 = 1670778751;
                        int i16222222 = m2566 ^ i5;
                        i15 = i2;
                        i9 = i16222222;
                        c113122 = c11312;
                    }
                case 485825498:
                case 1036711828:
                    i2 = i15;
                    s = sArr[c];
                    i13 = (s * s) + 11771761;
                    if (RunnableC3474.f10992 > 0) {
                        m2566 = C2105.m6981("ۧ֨") ^ i6;
                        i8 = ((m2566 ^ i7) * (-2721)) ^ 70433167;
                        i5 = 1570064555;
                        int i162222222 = m2566 ^ i5;
                        i15 = i2;
                        i9 = i162222222;
                        c113122 = c11312;
                    }
                    m2566 = C2105.m6981("ۘۘ") ^ i7;
                    i8 = ((m2566 ^ i6) * (-3205)) ^ (-483492574);
                    i5 = 1670778751;
                    int i1622222222 = m2566 ^ i5;
                    i15 = i2;
                    i9 = i1622222222;
                    c113122 = c11312;
                case 494195853:
                case 905214586:
                    C4616.m13552();
                    C1047.m3599();
                    break;
                case 925546130:
                case 1571822604:
                    c0994.m3472(C22628.m50612(c16560), c11667);
                    sArr3 = f33862;
                    if (C0050.f910 >= 0) {
                        i2 = i15;
                        i10 = 37;
                        m2566 = C2105.m6981("ۘۘ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-3205)) ^ (-483492574);
                        i5 = 1670778751;
                        int i16222222222 = m2566 ^ i5;
                        i15 = i2;
                        i9 = i16222222222;
                        c113122 = c11312;
                    } else {
                        int m69814 = C2105.m6981("֫ۡ") ^ i7;
                        int i19 = ((m69814 ^ i6) * 5017) ^ (-274348648);
                        i9 = m69814 ^ 1118869061;
                        i8 = i19;
                        i10 = 37;
                    }
                case 981884587:
                case 1901295794:
                    C11340.m28031();
                    int m6981222 = C2105.m6981("֡ۚ") ^ i6;
                    i9 = m6981222 ^ (-1824818231);
                    i8 = ((m6981222 ^ i7) * (-23561)) ^ 1872399067;
                case 1214246123:
                case 1391999347:
                    c0994.m3470(i15, str2);
                    i2 = i15;
                    str = C0050.m948(f33862, 34, 3, i11);
                    if (C1128.f4106 <= 0) {
                        m2566 = C2105.m6981("ۘۘ") ^ i7;
                        i8 = ((m2566 ^ i6) * (-3205)) ^ (-483492574);
                        i5 = 1670778751;
                        int i162222222222 = m2566 ^ i5;
                        i15 = i2;
                        i9 = i162222222222;
                        c113122 = c11312;
                    } else {
                        m6981 = (C0630.m2566("ۖᩴ") + i6) * 79;
                        i3 = ((m6981 ^ i7) * 31345) ^ 1818543006;
                        i4 = 1330527867;
                        int i1722222 = i2;
                        i9 = m6981 ^ i4;
                        i8 = i3;
                        i15 = i1722222;
                    }
                case 1256660677:
                case 2078022560:
                    i2 = i15;
                    str2 = RunnableC0588.m2436(sArr4, 30, 4, i11);
                    if (C1916.f6442) {
                        m6981 = C2105.m6981("֨᩵") ^ i7;
                        i3 = ((m6981 ^ i6) * (-18851)) ^ (-1155785288);
                        i4 = -1106311730;
                        int i17222222 = i2;
                        i9 = m6981 ^ i4;
                        i8 = i3;
                        i15 = i17222222;
                    } else {
                        i15 = i2;
                        int m256632222 = C0630.m2566("ܺۡ") ^ i6;
                        i8 = ((m256632222 ^ i7) * 5049) ^ (-227687872);
                        i9 = m256632222 ^ (-1647350085);
                        c113122 = c11312;
                    }
                case 1393745259:
                case 1640169115:
                    i2 = i15;
                    i11 = 41922;
                    m2566 = (C0630.m2566("᩹֡") + i6) * 17;
                    i8 = ((m2566 ^ i7) * (-13105)) ^ 136029372;
                    i5 = 1671719362;
                    int i1622222222222 = m2566 ^ i5;
                    i15 = i2;
                    i9 = i1622222222222;
                    c113122 = c11312;
                default:
                    C0237.m1486(c0994, C0964.m3396(sArr3, i10, 15, i11), z);
                    c0994.m3469();
                    break;
            }
            return;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27959(C18090 c18090, C8918 c8918, int i, C2139 c2139) {
        int i2;
        Exception exc;
        int i3;
        C2139 c21392;
        C18090 c180902;
        List list;
        int i4;
        int m6981;
        int i5;
        int i6;
        int i7;
        Exception exc2;
        C2139 c21393;
        int i8;
        C18090 c180903;
        int m2566;
        int i9;
        int i10;
        int i11;
        int i12;
        Exception exc3;
        int i13;
        int i14;
        List list2;
        C2139 c21394;
        int i15;
        int i16;
        Exception exc4;
        int i17;
        int i18;
        List list3;
        int m25662;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int m25663;
        int i25;
        int i26;
        int m25664;
        int i27;
        int i28;
        List list4;
        Exception exc5;
        C18090 c180904 = c18090;
        C8918 c89182 = c8918;
        C2139 c21395 = c2139;
        int i29 = C3683.f11629;
        int i30 = RunnableC0588.f2309;
        int m69812 = C2105.m6981("ܿ֨") ^ i29;
        int i31 = ((m69812 ^ i30) * (-9215)) ^ (-327436823);
        C17738[] c17738Arr = null;
        C13800[] c13800Arr = null;
        ArrayList arrayList = null;
        List list5 = null;
        InterfaceC2271[] interfaceC2271Arr = null;
        Iterator it = null;
        C3545 c3545 = null;
        Exception exc6 = null;
        int i32 = m69812 ^ 358091475;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        char c = 0;
        char c2 = 0;
        int i37 = 0;
        boolean z = false;
        int i38 = 0;
        boolean z2 = false;
        C7897[] c7897Arr = null;
        boolean z3 = false;
        int i39 = 0;
        HashSet hashSet = null;
        C17032 c17032 = null;
        int[] iArr = null;
        Iterator it2 = null;
        int i40 = 0;
        int i41 = -2021816213;
        int i42 = 0;
        int i43 = 0;
        while (true) {
            int i44 = i32 ^ (i31 & (((i41 ^ i30) * 9381) >> 31));
            switch (i44) {
                case -2088247309:
                case -1450965979:
                    if (z) {
                        i15 = i42;
                        i16 = i33;
                        exc4 = exc6;
                        i17 = i34;
                        i18 = i36;
                        list3 = list5;
                        m25662 = C0630.m2566("֨֨") ^ i30;
                        i19 = ((m25662 ^ i29) * 13121) ^ (-2011758469);
                        i20 = -1836790105;
                        i32 = i20 ^ m25662;
                        c89182 = c8918;
                        c21395 = c2139;
                        i31 = i19;
                        list5 = list3;
                        i41 = i44;
                        i33 = i16;
                        exc6 = exc4;
                        i34 = i17;
                        i42 = i15;
                        i36 = i18;
                        c180904 = c18090;
                    } else {
                        m25664 = C0630.m2566("ܽܽ") ^ i30;
                        i9 = ((m25664 ^ i29) * (-25709)) ^ (-377095232);
                        i27 = 687714618;
                        i32 = i27 ^ m25664;
                        i31 = i9;
                        i41 = i44;
                    }
                case -2005332966:
                case 931524154:
                    i35++;
                    i8 = i42;
                    i7 = i33;
                    exc2 = exc6;
                    c21393 = c21395;
                    c180903 = c180904;
                    i37 = i38;
                    i34 = 1;
                    int m69813 = (C2105.m6981("ۖ᩺") ^ i30) * (-3);
                    i9 = ((m69813 ^ i29) * (-27637)) ^ (-788981951);
                    i11 = m69813 ^ (-362481840);
                    c89182 = c8918;
                    c21395 = c21393;
                    c180904 = c180903;
                    i33 = i7;
                    exc6 = exc2;
                    i42 = i8;
                    i32 = i11;
                    i31 = i9;
                    i41 = i44;
                case -1632403264:
                case -458509248:
                    C1128.m3849(c21395, C0630.m2566(C0422.m1955(f33862, 96, 3, i42)) ^ 2128753160);
                    RunnableC1937.m6383(arrayList);
                    iArr[i40] = i40;
                    i38 = i39;
                    m25664 = (i29 - C2105.m6981("᩺᩷")) * (-77);
                    i9 = ((m25664 ^ i30) * (-13751)) ^ (-709543849);
                    i27 = -61829878;
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case -1472874600:
                case 20750211:
                    z3 = C1773.m5910(it2);
                    m25664 = C2105.m6981("ۡۢ") ^ i30;
                    i9 = ((m25664 ^ i29) * 9399) ^ (-1812063207);
                    i27 = 907796288;
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case -1460702211:
                case -69286605:
                    if (!z2) {
                        m25664 = C2105.m6981("ܽ۫") ^ i30;
                        i9 = ((m25664 ^ i29) * 2089) ^ (-1905514619);
                        i27 = 1340449954;
                        i32 = i27 ^ m25664;
                        i31 = i9;
                        i41 = i44;
                    }
                    i38 = i37;
                    m25664 = (i29 - C2105.m6981("᩺᩷")) * (-77);
                    i9 = ((m25664 ^ i30) * (-13751)) ^ (-709543849);
                    i27 = -61829878;
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case -1344209714:
                case -402317294:
                    if (z3) {
                        m25664 = C0630.m2566("ۚᩴ") ^ i29;
                        i9 = ((m25664 ^ i30) * 30479) ^ (-1695790396);
                        i27 = -896894367;
                    } else {
                        m25664 = (i29 - C2105.m6981("ۖۧ")) * (-103);
                        i9 = ((m25664 ^ i30) * (-1749)) ^ (-1740380495);
                        i27 = 51020668;
                    }
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case -1338884250:
                case 777335657:
                    i7 = i33;
                    exc2 = exc6;
                    c21393 = c21395;
                    HashSet hashSet2 = new HashSet();
                    C17032 c170322 = new C17032();
                    C17738[] c17738Arr2 = {new C17738()};
                    ArrayList arrayList2 = new ArrayList();
                    i8 = i42;
                    c180903 = c18090;
                    List m42190 = c180903.m42190(false);
                    c7897Arr = new C7897[]{null};
                    arrayList = arrayList2;
                    hashSet = hashSet2;
                    c17032 = c170322;
                    c13800Arr = new C13800[]{null};
                    c17738Arr = c17738Arr2;
                    iArr = new int[]{0};
                    interfaceC2271Arr = C2405.m7812(c180903, m42190);
                    i36 = C4159.m12563(m42190);
                    i34 = 1;
                    i35 = 0;
                    i37 = 0;
                    list5 = m42190;
                    int m698132 = (C2105.m6981("ۖ᩺") ^ i30) * (-3);
                    i9 = ((m698132 ^ i29) * (-27637)) ^ (-788981951);
                    i11 = m698132 ^ (-362481840);
                    c89182 = c8918;
                    c21395 = c21393;
                    c180904 = c180903;
                    i33 = i7;
                    exc6 = exc2;
                    i42 = i8;
                    i32 = i11;
                    i31 = i9;
                    i41 = i44;
                case -1324963531:
                case -1002856397:
                    i33 = iArr[i40];
                    m25664 = C0630.m2566("᩺ۙ") ^ i30;
                    i9 = ((m25664 ^ i29) * 11377) ^ 1886194156;
                    i27 = 2068070051;
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case -1319850747:
                case 936405909:
                    i12 = i33;
                    exc3 = exc6;
                    i13 = i34;
                    i14 = i36;
                    list2 = list5;
                    c21394 = c2139;
                    C1128.m3849(c21394, C2105.m6981(C3746.m11357(f33862, 78, 3, i42)) ^ 2103088848);
                    it = C2958.m9029(arrayList);
                    i43 = i37;
                    c2 = 0;
                    int m69814 = C2105.m6981("ۛ᩷") ^ i29;
                    i9 = ((m69814 ^ i30) * 18805) ^ (-408592274);
                    i11 = m69814 ^ (-663472836);
                    c89182 = c8918;
                    c21395 = c21394;
                    list5 = list2;
                    i33 = i12;
                    exc6 = exc3;
                    i34 = i13;
                    i36 = i14;
                    c180904 = c18090;
                    i32 = i11;
                    i31 = i9;
                    i41 = i44;
                case -1305763928:
                case 115357891:
                    z2 = C3537.m10754(arrayList);
                    m25664 = C0630.m2566("۫۟") ^ i30;
                    i9 = ((m25664 ^ i29) * 18429) ^ (-2074726288);
                    i27 = 823415046;
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case -1292169089:
                case 192823964:
                    C13800 c13800 = (C13800) C2272.m7513(it);
                    i43++;
                    String m38762 = C16458.m38762(i43);
                    C2105.m6983(c21395, m38762);
                    m27955(c89182, c13800.m33113(c21395), m38762);
                    i12 = i33;
                    exc3 = exc6;
                    i13 = i34;
                    i14 = i36;
                    list2 = list5;
                    c21394 = c21395;
                    int m698142 = C2105.m6981("ۛ᩷") ^ i29;
                    i9 = ((m698142 ^ i30) * 18805) ^ (-408592274);
                    i11 = m698142 ^ (-663472836);
                    c89182 = c8918;
                    c21395 = c21394;
                    list5 = list2;
                    i33 = i12;
                    exc6 = exc3;
                    i34 = i13;
                    i36 = i14;
                    c180904 = c18090;
                    i32 = i11;
                    i31 = i9;
                    i41 = i44;
                case -1195220494:
                case -490931565:
                    if (i33 > 20971520) {
                        m25664 = C0630.m2566("ۘܰ") ^ i29;
                        i9 = ((m25664 ^ i30) * (-3009)) ^ (-1573614067);
                        i27 = 1185711389;
                        i32 = i27 ^ m25664;
                        i31 = i9;
                        i41 = i44;
                    }
                    i38 = i37;
                    m25664 = (i29 - C2105.m6981("᩺᩷")) * (-77);
                    i9 = ((m25664 ^ i30) * (-13751)) ^ (-709543849);
                    i27 = -61829878;
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case -1188931989:
                case 1834738044:
                    StringBuilder sb = new StringBuilder();
                    C3245.m9923(sb, C4616.m13559(exc6));
                    C3245.m9923(sb, ViewOnClickListenerC1958.m6435(f33862, 81, 2, i42));
                    C3245.m9923(sb, C3746.m11363(c3545));
                    C1420.m4905(sb, RunnableC1108.m3789(f33862, 83, 1, i42));
                    throw new Exception(C0050.m947(sb), exc6);
                case -1080275096:
                case -664126001:
                    int i45 = i33;
                    Exception exc7 = exc6;
                    int i46 = i34;
                    List list6 = list5;
                    C2139 c21396 = c21395;
                    c = 0;
                    if (i35 < i36) {
                        m2566 = C2105.m6981("᩶ۘ") ^ i30;
                        i9 = ((m2566 ^ i29) * (-16475)) ^ 500913717;
                        i10 = -1890378807;
                    } else {
                        m2566 = (C0630.m2566("ۗۚ") ^ i29) * (-93);
                        i9 = ((m2566 ^ i30) * (-12629)) ^ (-733178233);
                        i10 = 490422399;
                    }
                    i11 = m2566 ^ i10;
                    c89182 = c8918;
                    c21395 = c21396;
                    list5 = list6;
                    i33 = i45;
                    exc6 = exc7;
                    i34 = i46;
                    c180904 = c18090;
                    i32 = i11;
                    i31 = i9;
                    i41 = i44;
                case -1032873710:
                case 1471484650:
                    i2 = i33;
                    exc = exc6;
                    i3 = i34;
                    c21392 = c21395;
                    c180902 = c180904;
                    list = list5;
                    i4 = 51139;
                    int m69815 = C2105.m6981("֫ۛ") ^ i29;
                    int i47 = ((m69815 ^ i30) * (-23645)) ^ (-420356167);
                    c89182 = c8918;
                    c21395 = c21392;
                    list5 = list;
                    i33 = i2;
                    exc6 = exc;
                    i34 = i3;
                    i32 = m69815 ^ (-623754220);
                    c180904 = c180902;
                    i41 = i44;
                    i42 = i4;
                    i31 = i47;
                case -878182534:
                case 1041061206:
                    try {
                        C13800 c138002 = (C13800) C2272.m7513(it2);
                        int i48 = i39 + 1;
                        String m387622 = C16458.m38762(i48);
                        C0630.m2572(c21395, m387622);
                        m27955(c89182, c138002.m33113(c21395), m387622);
                        i39 = i48;
                        m25664 = C0630.m2566("۟ܳ") ^ i29;
                        i9 = ((m25664 ^ i30) * 24235) ^ 1419489481;
                        i27 = -172260774;
                        i32 = i27 ^ m25664;
                        i31 = i9;
                        i41 = i44;
                    } catch (Exception e) {
                        exc6 = e;
                        i21 = i42;
                        i28 = i33;
                        i22 = i34;
                        i23 = i35;
                        i24 = i36;
                        list4 = list5;
                        int m25665 = C0630.m2566("֡۟") ^ i29;
                        i32 = (-1713596977) ^ m25665;
                        c89182 = c8918;
                        c21395 = c2139;
                        i31 = ((m25665 ^ i30) * (-25083)) ^ (-1571534693);
                        list5 = list4;
                        i41 = i44;
                        i33 = i28;
                        i34 = i22;
                        i42 = i21;
                        i36 = i24;
                        i35 = i23;
                        c180904 = c18090;
                    }
                case -759180139:
                case -505467529:
                    int i49 = i42;
                    int i50 = i33;
                    Exception exc8 = exc6;
                    int i51 = i34;
                    C2139 c21397 = c21395;
                    C18090 c180905 = c180904;
                    List list7 = list5;
                    short s = f33862[77];
                    int i52 = (s * s) + 47610000;
                    int i53 = s + 6900;
                    if ((i53 * i53) - (i52 + i52) <= 0) {
                        m6981 = (i30 - C0630.m2566("ۨ۟")) * (-103);
                        i5 = ((m6981 ^ i29) * 12105) ^ 1266785123;
                        i6 = -895973484;
                    } else {
                        m6981 = C2105.m6981("۠֨") ^ i29;
                        i5 = ((m6981 ^ i30) * (-25155)) ^ 487182362;
                        i6 = 921207351;
                    }
                    c89182 = c8918;
                    c21395 = c21397;
                    list5 = list7;
                    i33 = i50;
                    exc6 = exc8;
                    i34 = i51;
                    i32 = m6981 ^ i6;
                    i31 = i5;
                    c180904 = c180905;
                    i41 = i44;
                    i42 = i49;
                case -702628797:
                case 934656298:
                    C3746.m11361(c21395, C0630.m2566(C2167.m7159(f33862, 93, 3, i42)) ^ 2124293635);
                    it2 = C2958.m9029(arrayList);
                    i39 = i37;
                    m25664 = C0630.m2566("۟ܳ") ^ i29;
                    i9 = ((m25664 ^ i30) * 24235) ^ 1419489481;
                    i27 = -172260774;
                    i32 = i27 ^ m25664;
                    i31 = i9;
                    i41 = i44;
                case 192906248:
                case 523568561:
                    return;
                case 380362564:
                case 1509007249:
                    i15 = i42;
                    i16 = i33;
                    exc4 = exc6;
                    i17 = i34;
                    i18 = i36;
                    list3 = list5;
                    c3545 = (C3545) C21923.m49339(list3, i35);
                    if (!C2167.m7150(c2139)) {
                        m25662 = C0630.m2566("֫ۢ") ^ i30;
                        i19 = ((m25662 ^ i29) * 26825) ^ (-748074799);
                        i20 = -1076585808;
                        i32 = i20 ^ m25662;
                        c89182 = c8918;
                        c21395 = c2139;
                        i31 = i19;
                        list5 = list3;
                        i41 = i44;
                        i33 = i16;
                        exc6 = exc4;
                        i34 = i17;
                        i42 = i15;
                        i36 = i18;
                        c180904 = c18090;
                    }
                    m25662 = C0630.m2566("֨֨") ^ i30;
                    i19 = ((m25662 ^ i29) * 13121) ^ (-2011758469);
                    i20 = -1836790105;
                    i32 = i20 ^ m25662;
                    c89182 = c8918;
                    c21395 = c2139;
                    i31 = i19;
                    list5 = list3;
                    i41 = i44;
                    i33 = i16;
                    exc6 = exc4;
                    i34 = i17;
                    i42 = i15;
                    i36 = i18;
                    c180904 = c18090;
                case 640668552:
                case 2065394788:
                    try {
                        Object[] objArr = new Object[i34];
                        objArr[c] = C3746.m11363(c3545);
                        C2105.m6983(c21395, C1420.m4906(C0630.m2566(C5695.m16034(f33862, 84, 3, i42)) ^ 2125685751, objArr));
                        c21395.mo11538(0);
                        C2105.m6981(C2167.m7159(f33862, 87, 3, i42));
                        try {
                            C2105.m6981(C3663.m11162(f33862, 90, 3, i42));
                            i28 = i33;
                            exc5 = exc6;
                            i22 = i34;
                            i21 = i42;
                            i24 = i36;
                            i23 = i35;
                            list4 = list5;
                        } catch (Exception e2) {
                            e = e2;
                            i21 = i42;
                            i28 = i33;
                            i22 = i34;
                            i23 = i35;
                            i24 = i36;
                            list4 = list5;
                        }
                        try {
                        } catch (Exception e3) {
                            e = e3;
                            i40 = 0;
                            exc6 = e;
                            int m256652 = C0630.m2566("֡۟") ^ i29;
                            i32 = (-1713596977) ^ m256652;
                            c89182 = c8918;
                            c21395 = c2139;
                            i31 = ((m256652 ^ i30) * (-25083)) ^ (-1571534693);
                            list5 = list4;
                            i41 = i44;
                            i33 = i28;
                            i34 = i22;
                            i42 = i21;
                            i36 = i24;
                            i35 = i23;
                            c180904 = c18090;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i21 = i42;
                        i28 = i33;
                        i22 = i34;
                        i23 = i35;
                        i24 = i36;
                        list4 = list5;
                    }
                    try {
                        new C13095(c18090, c3545, interfaceC2271Arr, i35, iArr, c13800Arr, c7897Arr, c2139, hashSet, c17032, c17738Arr, i, arrayList).m31736();
                        z = C2167.m7150(c2139);
                        int m69816 = (i29 - C2105.m6981("ܽ᩸")) * 67;
                        i32 = m69816 ^ 1455562131;
                        c89182 = c8918;
                        c21395 = c2139;
                        i31 = ((m69816 ^ i30) * (-26547)) ^ (-341322157);
                        list5 = list4;
                        i41 = i44;
                        i33 = i28;
                        exc6 = exc5;
                        i34 = i22;
                        i42 = i21;
                        i36 = i24;
                        i35 = i23;
                        i40 = 0;
                    } catch (Exception e5) {
                        exc6 = e5;
                        i40 = 0;
                        int m2566522 = C0630.m2566("֡۟") ^ i29;
                        i32 = (-1713596977) ^ m2566522;
                        c89182 = c8918;
                        c21395 = c2139;
                        i31 = ((m2566522 ^ i30) * (-25083)) ^ (-1571534693);
                        list5 = list4;
                        i41 = i44;
                        i33 = i28;
                        i34 = i22;
                        i42 = i21;
                        i36 = i24;
                        i35 = i23;
                        c180904 = c18090;
                    }
                    c180904 = c18090;
                case 754129453:
                case 1791487637:
                    i21 = i42;
                    int i54 = i33;
                    Exception exc9 = exc6;
                    i22 = i34;
                    i23 = i35;
                    i24 = i36;
                    List list8 = list5;
                    if (C0483.m2123(it)) {
                        m25663 = (C0630.m2566("᩻᩸") ^ i29) * 11;
                        i25 = ((m25663 ^ i30) * 32367) ^ 1525616050;
                        i26 = -1966316788;
                    } else {
                        m25663 = C0630.m2566("ܶᩴ") ^ i30;
                        i25 = ((m25663 ^ i29) * (-28791)) ^ (-2087702781);
                        i26 = -107521947;
                    }
                    i32 = i26 ^ m25663;
                    c89182 = c8918;
                    c21395 = c2139;
                    i31 = i25;
                    list5 = list8;
                    i41 = i44;
                    i33 = i54;
                    exc6 = exc9;
                    i34 = i22;
                    i42 = i21;
                    i36 = i24;
                    i35 = i23;
                    c180904 = c18090;
                case 1616942763:
                case 1617714740:
                    C1047.m3597(arrayList);
                    C3537.m10749(c13800Arr[c2]);
                    String m387623 = C16458.m38762(i43 + 1);
                    C0630.m2572(c21395, m387623);
                    m27955(c89182, c13800Arr[c2].m33113(c21395), m387623);
                    return;
                default:
                    i2 = i33;
                    exc = exc6;
                    i3 = i34;
                    c21392 = c21395;
                    c180902 = c180904;
                    list = list5;
                    i4 = 30481;
                    int m698152 = C2105.m6981("֫ۛ") ^ i29;
                    int i472 = ((m698152 ^ i30) * (-23645)) ^ (-420356167);
                    c89182 = c8918;
                    c21395 = c21392;
                    list5 = list;
                    i33 = i2;
                    exc6 = exc;
                    i34 = i3;
                    i32 = m698152 ^ (-623754220);
                    c180904 = c180902;
                    i41 = i44;
                    i42 = i4;
                    i31 = i472;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27955(C8918 c8918, C19357 c19357, String str) {
        AbstractC15440 abstractC15440 = null;
        Throwable th = null;
        int i = 1325570784;
        int i2 = C0050.f910;
        int i3 = RunnableC0588.f2309;
        int m6981 = (C2105.m6981("۬᩵") + i2) * 115;
        int i4 = ((m6981 ^ i3) * (-12097)) ^ 56048500;
        int i5 = -1062198697;
        while (true) {
            i = ((((i ^ i3) * (-25705)) >> 31) & i4) ^ (m6981 ^ i5);
            switch (i) {
                case -1978955853:
                case 1766209861:
                    RunnableC3474.m10626(abstractC15440);
                    return;
                case -1803050158:
                case -1286445436:
                    if (C0714.f2697 >= 0) {
                        m6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((m6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        m6981 = (C2105.m6981("ۛ᩷") ^ i3) * 99;
                        i4 = ((m6981 ^ i2) * (-13879)) ^ 1186706655;
                        i5 = 1211057445;
                    }
                case -1719808363:
                case 1589157736:
                    if (C0422.f1886 <= 0) {
                        m6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((m6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        m6981 = (i2 - C2105.m6981("ܿ᩺")) * (-59);
                        i4 = ((m6981 ^ i3) * (-8407)) ^ (-592990934);
                        i5 = -1132588661;
                    }
                case -1705770367:
                case -1002899908:
                    if (C2105.f7037 != 0) {
                        m6981 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        m6981 = (C2105.m6981("ۛ᩸") + i2) * 73;
                        i4 = ((m6981 ^ i3) * 1627) ^ 1269337927;
                        i5 = -369616892;
                    }
                case -1620144238:
                case 1119693790:
                    if (C4263.f13799 > 0) {
                        m6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((m6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        m6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((m6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    }
                case -1432620630:
                case 2062531838:
                    C11340.m28031();
                    return;
                case -1206594035:
                case 281893720:
                    RunnableC3474.m10626(abstractC15440);
                    throw th;
                case -1104654869:
                case 1161533618:
                    if (C2167.f7158 >= 0) {
                        m6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((m6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        m6981 = C0630.m2566("ۚۗ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-13671)) ^ (-1364514699);
                        i5 = -565714541;
                    }
                case -900660388:
                case 504099822:
                    abstractC15440 = C2105.m6987(C16293.f50111);
                    m6981 = (i2 - C2105.m6981("ۚ۬")) * 23;
                    i4 = ((m6981 ^ i3) * (-23045)) ^ (-884935367);
                    i5 = -780769106;
                case -693695586:
                case 1204002351:
                    C1916.m6308();
                    if (RunnableC3474.f10992 > 0) {
                        m6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((m6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        m6981 = C0630.m2566("᩶֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 24031) ^ (-1199266685);
                        i5 = -1105522848;
                    }
                case -114766354:
                case 1363148063:
                    if (RunnableC1108.m3790()) {
                        m6981 = (C0630.m2566("۟۟") ^ i2) * (-53);
                        i4 = ((m6981 ^ i3) * (-2595)) ^ 585258053;
                        i5 = -1444370804;
                    } else {
                        m6981 = (C0630.m2566("ܿ᩷") ^ i2) * 21;
                        i4 = ((m6981 ^ i3) * (-26403)) ^ 538832925;
                        i5 = 551955034;
                    }
                case 184119041:
                case 1055184995:
                    if (C3663.f11553) {
                        m6981 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        m6981 = C2105.m6981("ۜ۫") ^ i3;
                        i4 = ((m6981 ^ i2) * 18197) ^ (-1493331339);
                        i5 = -2014259250;
                    }
                case 365048216:
                case 1672971761:
                    try {
                        c19357.m48535(abstractC15440);
                        C0422.m1961(c8918, str);
                        abstractC15440.m36495(c8918.m23007(), (InterfaceC1393) null);
                        m6981 = C2105.m6981("ۙۧ") ^ i2;
                        i4 = ((m6981 ^ i3) * 29225) ^ (-761361492);
                        i5 = 1991131606;
                    } catch (Throwable th2) {
                        th = th2;
                        m6981 = (i3 - C2105.m6981("ۧۘ")) * 15;
                        i4 = ((m6981 ^ i2) * 9949) ^ 456498768;
                        i5 = -1113334513;
                    }
                case 407205909:
                case 608859598:
                    if (C1504.f5354) {
                        m6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((m6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        m6981 = (i3 - C2105.m6981("᩷۬")) * 43;
                        i4 = ((m6981 ^ i2) * (-2835)) ^ 243666405;
                        i5 = 1985153716;
                    }
                case 441496099:
                case 1645390562:
                    C0964.m3413();
                    C3019.m9255();
                    m6981 = (i3 - C2105.m6981("᩷۬")) * 43;
                    i4 = ((m6981 ^ i2) * (-2835)) ^ 243666405;
                    i5 = 1985153716;
                case 515813245:
                case 1048739678:
                    if (RunnableC3474.f10992 <= 0) {
                        m6981 = C0630.m2566("᩶֫") ^ i2;
                        i4 = ((m6981 ^ i3) * 24031) ^ (-1199266685);
                        i5 = -1105522848;
                    } else {
                        m6981 = (i2 - C2105.m6981("ܰ᩵")) * (-79);
                        i4 = ((m6981 ^ i3) * 26753) ^ 304889195;
                        i5 = 60919079;
                    }
                case 594574182:
                case 2052198267:
                    if (C1420.m4913()) {
                        m6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((m6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        m6981 = (i3 - C0630.m2566("۫ܽ")) * (-7);
                        i4 = ((m6981 ^ i2) * (-24583)) ^ (-55081907);
                        i5 = -190812853;
                    }
                case 1203553537:
                case 1544233413:
                    if (C7106.f21815 != 0) {
                        m6981 = C0630.m2566("᩻ۙ") ^ i3;
                        i4 = ((m6981 ^ i2) * (-7849)) ^ (-2064227801);
                        i5 = -566535618;
                    } else {
                        m6981 = (C0630.m2566("᩷ᩳ") + i2) * (-35);
                        i4 = ((m6981 ^ i3) * 19401) ^ (-809384462);
                        i5 = -945074129;
                    }
                default:
                    if (C0798.f2919) {
                        m6981 = (C2105.m6981("ۢۛ") ^ i3) * 27;
                        i4 = ((m6981 ^ i2) * (-829)) ^ 960462666;
                        i5 = 1601071664;
                    } else {
                        m6981 = C0630.m2566("۟᩷") ^ i3;
                        i4 = ((m6981 ^ i2) * 32561) ^ (-1479029203);
                        i5 = 1624497465;
                    }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27958(C18090 c18090, C8918 c8918, int i, C2139 c2139) {
        int i2;
        String str;
        int i3;
        C13800 c13800;
        int i4;
        int i5;
        List list;
        int i6;
        int i7;
        int i8;
        AbstractC15440 abstractC15440;
        int i9;
        int i10;
        int i11;
        String str2;
        int i12;
        int i13;
        List list2;
        List list3;
        boolean z;
        int m2566;
        int i14;
        int i15;
        boolean z2;
        C3545 c3545;
        InterfaceC2271[] interfaceC2271Arr;
        int i16;
        C12390 c12390;
        HashSet hashSet;
        C17032 c17032;
        int m25662;
        int i17;
        int m6981;
        int i18;
        int i19;
        String str3;
        int i20;
        String str4;
        AbstractC15440 abstractC154402;
        boolean z3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str5;
        AbstractC15440 abstractC154403;
        int i29;
        int i30;
        int i31;
        String str6;
        int i32;
        int i33;
        int m69812;
        int i34;
        int i35;
        int i36;
        int i37;
        String str7;
        AbstractC15440 abstractC154404;
        int i38;
        int i39;
        int i40;
        String str8;
        int i41;
        int i42;
        int i43;
        int m25663;
        int i44;
        int i45;
        int i46;
        StringBuilder sb;
        boolean z4 = false;
        Iterator it = null;
        boolean z5 = false;
        C13800[] c13800Arr = null;
        List[] listArr = null;
        boolean z6 = false;
        int i47 = 259032749;
        int i48 = AbstractC2021.f6743;
        int i49 = C0714.f2697;
        int m69813 = (C2105.m6981("᩵ܺ") + i49) * (-75);
        int i50 = ((m69813 ^ i48) * (-17727)) ^ 1588464939;
        int i51 = m69813 ^ 6660217;
        C17032 c170322 = null;
        C12390 c123902 = null;
        Boolean bool = null;
        List list4 = null;
        Throwable th = null;
        Boolean[] boolArr = null;
        C3545 c35452 = null;
        String str9 = null;
        C13800 c138002 = null;
        String str10 = null;
        int i52 = 0;
        int i53 = 0;
        int i54 = 0;
        int i55 = 0;
        boolean z7 = false;
        int i56 = 0;
        int i57 = 0;
        int i58 = 0;
        boolean z8 = false;
        int i59 = 0;
        int i60 = 0;
        int i61 = 0;
        int i62 = 0;
        HashSet hashSet2 = null;
        InterfaceC2271[] interfaceC2271Arr2 = null;
        AbstractC15440 abstractC154405 = null;
        int i63 = 0;
        while (true) {
            i47 = i51 ^ (i50 & (((i47 ^ i48) * 27411) >> 31));
            switch (i47) {
                case -2131622870:
                case -1298643069:
                    i2 = i53;
                    str = str10;
                    i55 = c123902.f37160;
                    m25663 = C0630.m2566("᩸ܰ") ^ i48;
                    i44 = ((m25663 ^ i49) * (-27355)) ^ 358523038;
                    i45 = 1435378446;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i64 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i64;
                case -1899402072:
                case -751280266:
                    i3 = i52;
                    i8 = i53;
                    str = str10;
                    abstractC15440 = abstractC154405;
                    z = z7 ? 1 : 0;
                    i9 = i56;
                    i10 = i60;
                    i11 = i62;
                    str2 = str9;
                    i12 = i63;
                    i13 = i55;
                    int i65 = i61;
                    c13800 = c138002;
                    i4 = i65;
                    List list5 = list4;
                    i5 = i57;
                    list = list5;
                    try {
                        C1128.m3849(c2139, C0630.m2566(C4616.m13542(f33862, 66, 3, i12)) ^ 2100581820);
                        Arrays.fill(c123902.f37165, (Object) null);
                        Runtime.getRuntime().gc();
                        m2566 = C0630.m2566("ۚۘ") ^ i49;
                        i14 = ((m2566 ^ i48) * 30603) ^ (-967741994);
                        i15 = 1819189395;
                        i43 = m2566 ^ i15;
                        i63 = i12;
                        i55 = i13;
                        str10 = str;
                        i52 = i3;
                        i53 = i8;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        z7 = z;
                        i51 = i43;
                        i50 = i14;
                        str9 = str2;
                        i62 = i11;
                        C13800 c138003 = c13800;
                        i61 = i4;
                        c138002 = c138003;
                        int i66 = i5;
                        list4 = list;
                        i57 = i66;
                    } catch (Throwable th2) {
                        th = th2;
                        str9 = str2;
                        th = th;
                        str2 = str9;
                        z7 = z;
                        int m69814 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m69814 ^ i49) * 11671) ^ 1647827904;
                        i7 = m69814 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i67 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i67;
                        C13800 c138004 = c13800;
                        i61 = i4;
                        c138002 = c138004;
                        int i68 = i5;
                        list4 = list;
                        i57 = i68;
                    }
                case -1778287136:
                case 865043694:
                    RunnableC3474.m10626(abstractC154405);
                    return;
                case -1704720070:
                case -1210642509:
                    i2 = i53;
                    str = str10;
                    z5 = C0483.m2123(it);
                    m25663 = (i48 - C2105.m6981("֡᩸")) * q.h;
                    i44 = ((m25663 ^ i49) * 9213) ^ (-770023744);
                    i45 = -1570774819;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i642 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i642;
                case -1648323969:
                case 90117364:
                    i3 = i52;
                    i8 = i53;
                    i16 = i54;
                    str = str10;
                    abstractC15440 = abstractC154405;
                    z = z7 ? 1 : 0;
                    i9 = i56;
                    i10 = i60;
                    i11 = i62;
                    str2 = str9;
                    i12 = i63;
                    i13 = i55;
                    int i69 = i61;
                    c13800 = c138002;
                    i4 = i69;
                    List list6 = list4;
                    i5 = i57;
                    list = list6;
                    if (z8) {
                        m25662 = (C0630.m2566("ۧܶ") ^ i48) * 33;
                        i14 = ((m25662 ^ i49) * (-4449)) ^ 171248964;
                        i17 = -1702089705;
                    } else {
                        m25662 = C2105.m6981("᩶᩺") ^ i48;
                        i14 = ((m25662 ^ i49) * 31711) ^ 1515662658;
                        i17 = -1998993592;
                    }
                    i43 = m25662 ^ i17;
                    i63 = i12;
                    i55 = i13;
                    str10 = str;
                    i52 = i3;
                    i53 = i8;
                    i54 = i16;
                    i56 = i9;
                    abstractC154405 = abstractC15440;
                    i60 = i10;
                    z7 = z;
                    i51 = i43;
                    i50 = i14;
                    str9 = str2;
                    i62 = i11;
                    C13800 c1380032 = c13800;
                    i61 = i4;
                    c138002 = c1380032;
                    int i662 = i5;
                    list4 = list;
                    i57 = i662;
                case -1634976166:
                case -197579139:
                    i2 = i53;
                    str = str10;
                    if (z4) {
                        m25663 = C0630.m2566("ܰ᩻") ^ i48;
                        i44 = ((m25663 ^ i49) * 31329) ^ 558188475;
                        i45 = -1062532312;
                    } else {
                        m25663 = (C0630.m2566("᩶ۖ") ^ i49) * 19;
                        i44 = ((m25663 ^ i48) * (-19117)) ^ (-2012028640);
                        i45 = 1509433725;
                    }
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i6422 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i6422;
                case -1629386727:
                case -844516520:
                    i2 = i53;
                    str = str10;
                    try {
                        m27955(c8918, c138002.m33113(c2139), str9);
                        Runtime.getRuntime().gc();
                        i52 = i59;
                        i53 = i2;
                        m6981 = (C2105.m6981("ۢܰ") + i49) * 115;
                        i18 = ((m6981 ^ i48) * (-12033)) ^ (-1369120021);
                        i19 = -139547806;
                        i51 = m6981 ^ i19;
                        i50 = i18;
                        str10 = str;
                    } catch (Throwable th3) {
                        th = th3;
                        abstractC15440 = abstractC154405;
                        z = z7 ? 1 : 0;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        i8 = i2;
                        i3 = i52;
                        i12 = i63;
                        i13 = i55;
                        int i70 = i61;
                        c13800 = c138002;
                        i4 = i70;
                        List list7 = list4;
                        i5 = i57;
                        list = list7;
                        th = th;
                        str2 = str9;
                        z7 = z;
                        int m698142 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m698142 ^ i49) * 11671) ^ 1647827904;
                        i7 = m698142 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i672 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i672;
                        C13800 c1380042 = c13800;
                        i61 = i4;
                        c138002 = c1380042;
                        int i682 = i5;
                        list4 = list;
                        i57 = i682;
                    }
                case -1397518720:
                case -584152372:
                    i2 = i53;
                    str = str10;
                    try {
                        c123902.f37163 = z7 ? 1 : 0;
                        Runtime.getRuntime().gc();
                        m25663 = (i49 - C2105.m6981("ۡ۫")) * 119;
                        i44 = ((m25663 ^ i48) * 10895) ^ (-786365613);
                        i45 = 212273409;
                        i46 = m25663 ^ i45;
                        str10 = str;
                        int i64222 = i2;
                        i51 = i46;
                        i50 = i44;
                        i53 = i64222;
                    } catch (Throwable th4) {
                        th = th4;
                        abstractC15440 = abstractC154405;
                        z = z7 ? 1 : 0;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        i8 = i2;
                        i3 = i52;
                        i12 = i63;
                        i13 = i55;
                        int i702 = i61;
                        c13800 = c138002;
                        i4 = i702;
                        List list72 = list4;
                        i5 = i57;
                        list = list72;
                        th = th;
                        str2 = str9;
                        z7 = z;
                        int m6981422 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m6981422 ^ i49) * 11671) ^ 1647827904;
                        i7 = m6981422 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i6722 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i6722;
                        C13800 c13800422 = c13800;
                        i61 = i4;
                        c138002 = c13800422;
                        int i6822 = i5;
                        list4 = list;
                        i57 = i6822;
                    }
                case -1332212385:
                case 1171985773:
                    i27 = i52;
                    i28 = i53;
                    str5 = str10;
                    abstractC154403 = abstractC154405;
                    i29 = i56;
                    i30 = i60;
                    i31 = i62;
                    str6 = str9;
                    i33 = i55;
                    int i71 = i61;
                    c13800 = c138002;
                    i4 = i71;
                    List list8 = list4;
                    i5 = i57;
                    list = list8;
                    i63 = 40982;
                    int m25664 = C0630.m2566("᩹֫") ^ i49;
                    i34 = ((m25664 ^ i48) * 29613) ^ 650646923;
                    i36 = m25664 ^ (-993052229);
                    i55 = i33;
                    str9 = str6;
                    str10 = str5;
                    i52 = i27;
                    i62 = i31;
                    i56 = i29;
                    abstractC154405 = abstractC154403;
                    i51 = i36;
                    i60 = i30;
                    i50 = i34;
                    i53 = i28;
                    C13800 c13800322 = c13800;
                    i61 = i4;
                    c138002 = c13800322;
                    int i6622 = i5;
                    list4 = list;
                    i57 = i6622;
                case -1317501893:
                case 104968976:
                    RunnableC3474.m10626(abstractC154405);
                    return;
                case -1139597805:
                case 1887435183:
                    i2 = i53;
                    str = str10;
                    i59 = i52 + 1;
                    str9 = C16458.m38762(i59);
                    C0630.m2572(c2139, str9);
                    c2139.mo11538(z7 ? 1 : 0);
                    C13800[] c13800Arr2 = c123902.f37161;
                    c138002 = c13800Arr2[i52];
                    c13800Arr2[i52] = null;
                    it = C1047.m3596(c123902.f37164[i52]);
                    m25663 = C0630.m2566("ۤ᩸") ^ i48;
                    i44 = ((m25663 ^ i49) * (-3893)) ^ (-1975655705);
                    i45 = -858884435;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i642222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i642222;
                case -942270608:
                case 475862295:
                    i37 = i52;
                    i28 = i53;
                    str7 = str10;
                    abstractC154404 = abstractC154405;
                    i39 = i56;
                    int i72 = i60;
                    i40 = i62;
                    str8 = str9;
                    i41 = i63;
                    i38 = i55;
                    int i73 = i61;
                    c13800 = c138002;
                    i4 = i73;
                    List list9 = list4;
                    i5 = i57;
                    list = list9;
                    c123902.f37165[i72] = new C17738();
                    c123902.f37164[i72] = new ArrayList();
                    i42 = i72 + 1;
                    int m69815 = C2105.m6981("᩷ۧ") ^ i48;
                    i34 = ((m69815 ^ i49) * (-1731)) ^ 2004839340;
                    i63 = i41;
                    i55 = i38;
                    str9 = str8;
                    str10 = str7;
                    i52 = i37;
                    i62 = i40;
                    i56 = i39;
                    abstractC154405 = abstractC154404;
                    i60 = i42;
                    i51 = m69815 ^ (-1117552260);
                    i50 = i34;
                    i53 = i28;
                    C13800 c138003222 = c13800;
                    i61 = i4;
                    c138002 = c138003222;
                    int i66222 = i5;
                    list4 = list;
                    i57 = i66222;
                case -859338090:
                case -698460422:
                    i2 = i53;
                    str = str10;
                    i56 = c123902.f37163;
                    m25663 = (C2105.m6981("ۙܽ") + i49) * 87;
                    i44 = ((m25663 ^ i48) * (-31999)) ^ (-1477115129);
                    i45 = -1184352581;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i6422222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i6422222;
                case -839409392:
                case -11334917:
                    i3 = i52;
                    int i74 = i61;
                    c13800 = c138002;
                    i4 = i74;
                    List list10 = list4;
                    i5 = i57;
                    list = list10;
                    abstractC154405 = C2105.m6987(C16293.f50111);
                    int m69816 = C2105.m6981("ܿܽ") ^ i49;
                    i6 = ((m69816 ^ i48) * 1331) ^ (-2042002196);
                    i7 = m69816 ^ (-2123630167);
                    i63 = i63;
                    i55 = i55;
                    str9 = str9;
                    str10 = str10;
                    i62 = i62;
                    i56 = i56;
                    i60 = i60;
                    i53 = i53;
                    int i67222 = i3;
                    i51 = i7;
                    i50 = i6;
                    i52 = i67222;
                    C13800 c138004222 = c13800;
                    i61 = i4;
                    c138002 = c138004222;
                    int i68222 = i5;
                    list4 = list;
                    i57 = i68222;
                case -797616051:
                case 721011444:
                    str3 = str10;
                    i54++;
                    i20 = 1;
                    str4 = str9;
                    abstractC154402 = abstractC154405;
                    z3 = z7 ? 1 : 0;
                    i21 = i56;
                    i22 = i60;
                    i23 = i53;
                    i24 = i52;
                    i25 = i63;
                    i26 = i55;
                    int i75 = i61;
                    c13800 = c138002;
                    i4 = i75;
                    List list11 = list4;
                    i5 = i57;
                    list = list11;
                    int m25665 = C0630.m2566("᩹ۡ") ^ i49;
                    i63 = i25;
                    i55 = i26;
                    str10 = str3;
                    i53 = i23;
                    i56 = i21;
                    abstractC154405 = abstractC154402;
                    i60 = i22;
                    z7 = z3;
                    String str11 = str4;
                    i62 = i20;
                    i50 = ((m25665 ^ i48) * (-30281)) ^ (-145605822);
                    i52 = i24;
                    i51 = m25665 ^ (-944805179);
                    str9 = str11;
                    C13800 c1380042222 = c13800;
                    i61 = i4;
                    c138002 = c1380042222;
                    int i682222 = i5;
                    list4 = list;
                    i57 = i682222;
                case -641780465:
                case 610274875:
                    i2 = i53;
                    str = str10;
                    i57 = 0;
                    m25663 = (C0630.m2566("᩺۫") + i49) * 57;
                    i44 = ((m25663 ^ i48) * 29919) ^ 976946090;
                    i45 = 47013213;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i64222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i64222222;
                case -563083761:
                case 1482324523:
                    str = str10;
                    try {
                        int i76 = i62;
                        str2 = str9;
                        try {
                            Object[] objArr = new Object[i76];
                            objArr[z7 ? 1 : 0] = C3746.m11363(c35452);
                            try {
                                i3 = i52;
                                i8 = i53;
                                try {
                                    try {
                                        C0630.m2572(c2139, C3245.m9924(C2105.m6981(C5695.m16034(f33862, 69, 3, i63)) ^ 2120348022, objArr));
                                        c3545 = c35452;
                                        i11 = i76;
                                        interfaceC2271Arr = interfaceC2271Arr2;
                                        i16 = i54;
                                        i9 = i56;
                                        i12 = i63;
                                        int i77 = i61;
                                        c13800 = c138002;
                                        i4 = i77;
                                        c12390 = c123902;
                                        List list12 = list4;
                                        i5 = i57;
                                        list = list12;
                                        abstractC15440 = abstractC154405;
                                        hashSet = hashSet2;
                                        i10 = i60;
                                        i13 = i55;
                                        c17032 = c170322;
                                        z = z7 ? 1 : 0;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i11 = i76;
                                        abstractC15440 = abstractC154405;
                                        i9 = i56;
                                        i10 = i60;
                                        i12 = i63;
                                        i13 = i55;
                                        int i78 = i61;
                                        c13800 = c138002;
                                        i4 = i78;
                                        List list13 = list4;
                                        i5 = i57;
                                        list2 = list13;
                                        list3 = list2;
                                        th = th;
                                        list = list3;
                                        int m69814222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                                        i6 = ((m69814222 ^ i49) * 11671) ^ 1647827904;
                                        i7 = m69814222 ^ 1881445579;
                                        i63 = i12;
                                        i55 = i13;
                                        str9 = str2;
                                        str10 = str;
                                        i53 = i8;
                                        i62 = i11;
                                        i56 = i9;
                                        abstractC154405 = abstractC15440;
                                        i60 = i10;
                                        int i672222 = i3;
                                        i51 = i7;
                                        i50 = i6;
                                        i52 = i672222;
                                        C13800 c13800422222 = c13800;
                                        i61 = i4;
                                        c138002 = c13800422222;
                                        int i6822222 = i5;
                                        list4 = list;
                                        i57 = i6822222;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    i11 = i76;
                                    int i79 = i54;
                                    abstractC15440 = abstractC154405;
                                    z2 = z7 ? 1 : 0;
                                    i9 = i56;
                                    i10 = i60;
                                    i12 = i63;
                                    i13 = i55;
                                    int i80 = i61;
                                    c13800 = c138002;
                                    i4 = i80;
                                    List list14 = list4;
                                    i5 = i57;
                                    list3 = list14;
                                    i54 = i79;
                                    z7 = z2;
                                    th = th;
                                    list = list3;
                                    int m698142222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                                    i6 = ((m698142222 ^ i49) * 11671) ^ 1647827904;
                                    i7 = m698142222 ^ 1881445579;
                                    i63 = i12;
                                    i55 = i13;
                                    str9 = str2;
                                    str10 = str;
                                    i53 = i8;
                                    i62 = i11;
                                    i56 = i9;
                                    abstractC154405 = abstractC15440;
                                    i60 = i10;
                                    int i6722222 = i3;
                                    i51 = i7;
                                    i50 = i6;
                                    i52 = i6722222;
                                    C13800 c138004222222 = c13800;
                                    i61 = i4;
                                    c138002 = c138004222222;
                                    int i68222222 = i5;
                                    list4 = list;
                                    i57 = i68222222;
                                }
                                try {
                                    C6040.m16877(new C6040(c18090, c3545, interfaceC2271Arr, i54, c12390, c2139, hashSet, c17032, boolArr));
                                    z4 = C2167.m7150(c2139);
                                    m25662 = (i48 - C0630.m2566("᩺᩺")) * 49;
                                    i14 = ((m25662 ^ i49) * 6389) ^ 59208449;
                                    i17 = 143618697;
                                    i43 = m25662 ^ i17;
                                    i63 = i12;
                                    i55 = i13;
                                    str10 = str;
                                    i52 = i3;
                                    i53 = i8;
                                    i54 = i16;
                                    i56 = i9;
                                    abstractC154405 = abstractC15440;
                                    i60 = i10;
                                    z7 = z;
                                    i51 = i43;
                                    i50 = i14;
                                    str9 = str2;
                                    i62 = i11;
                                    C13800 c1380032222 = c13800;
                                    i61 = i4;
                                    c138002 = c1380032222;
                                    int i662222 = i5;
                                    list4 = list;
                                    i57 = i662222;
                                } catch (Throwable th7) {
                                    th = th7;
                                    th = th;
                                    i54 = i16;
                                    z7 = z;
                                    int m6981422222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                                    i6 = ((m6981422222 ^ i49) * 11671) ^ 1647827904;
                                    i7 = m6981422222 ^ 1881445579;
                                    i63 = i12;
                                    i55 = i13;
                                    str9 = str2;
                                    str10 = str;
                                    i53 = i8;
                                    i62 = i11;
                                    i56 = i9;
                                    abstractC154405 = abstractC15440;
                                    i60 = i10;
                                    int i67222222 = i3;
                                    i51 = i7;
                                    i50 = i6;
                                    i52 = i67222222;
                                    C13800 c1380042222222 = c13800;
                                    i61 = i4;
                                    c138002 = c1380042222222;
                                    int i682222222 = i5;
                                    list4 = list;
                                    i57 = i682222222;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                i3 = i52;
                                i8 = i53;
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            i3 = i52;
                            i8 = i53;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        i3 = i52;
                        i8 = i53;
                        abstractC15440 = abstractC154405;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        str2 = str9;
                    }
                case -501128784:
                case 2021530758:
                    str = str10;
                    i52 = 0;
                    m6981 = (C2105.m6981("ۢܰ") + i49) * 115;
                    i18 = ((m6981 ^ i48) * (-12033)) ^ (-1369120021);
                    i19 = -139547806;
                    i51 = m6981 ^ i19;
                    i50 = i18;
                    str10 = str;
                case -465285364:
                case 1727979071:
                    i2 = i53;
                    str = str10;
                    if (i56 > 5242880) {
                        m25663 = (C0630.m2566("۠ۢ") + i49) * 35;
                        i44 = ((m25663 ^ i48) * 17191) ^ 82355589;
                        i45 = -2110567972;
                        i46 = m25663 ^ i45;
                        str10 = str;
                        int i642222222 = i2;
                        i51 = i46;
                        i50 = i44;
                        i53 = i642222222;
                    }
                    m25663 = (i49 - C2105.m6981("ۡ۫")) * 119;
                    i44 = ((m25663 ^ i48) * 10895) ^ (-786365613);
                    i45 = 212273409;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i6422222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i6422222222;
                case -356585159:
                case 568686878:
                    i2 = i53;
                    str = str10;
                    if (!z6) {
                        m25663 = (i48 - C2105.m6981("۫ܿ")) * (-83);
                        i44 = ((m25663 ^ i49) * (-17917)) ^ 1242231346;
                        i45 = 297040987;
                        i46 = m25663 ^ i45;
                        str10 = str;
                        int i64222222222 = i2;
                        i51 = i46;
                        i50 = i44;
                        i53 = i64222222222;
                    }
                    m25663 = C0630.m2566("᩻ۖ") ^ i49;
                    i44 = ((m25663 ^ i48) * (-4245)) ^ 389426906;
                    i45 = -1704275584;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i642222222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i642222222222;
                case -339069521:
                case -58369259:
                    i27 = i52;
                    i28 = i53;
                    str5 = str10;
                    abstractC154403 = abstractC154405;
                    i29 = i56;
                    i30 = i60;
                    i31 = i62;
                    str6 = str9;
                    i32 = i63;
                    i33 = i55;
                    int i81 = i61;
                    c13800 = c138002;
                    i4 = i81;
                    List list15 = list4;
                    i5 = i57;
                    list = list15;
                    if (i30 < i) {
                        m69812 = (C0630.m2566("ۢۨ") ^ i48) * 45;
                        i34 = ((m69812 ^ i49) * (-7197)) ^ (-1461001773);
                        i35 = 665693366;
                    } else {
                        m69812 = (C2105.m6981("ᩳۧ") + i49) * 15;
                        i34 = ((m69812 ^ i48) * 23589) ^ 1762239591;
                        i35 = -1451101980;
                    }
                    i36 = m69812 ^ i35;
                    i63 = i32;
                    i55 = i33;
                    str9 = str6;
                    str10 = str5;
                    i52 = i27;
                    i62 = i31;
                    i56 = i29;
                    abstractC154405 = abstractC154403;
                    i51 = i36;
                    i60 = i30;
                    i50 = i34;
                    i53 = i28;
                    C13800 c13800322222 = c13800;
                    i61 = i4;
                    c138002 = c13800322222;
                    int i6622222 = i5;
                    list4 = list;
                    i57 = i6622222;
                case -222686591:
                case 1275602812:
                    i2 = i53;
                    str = str10;
                    if (z5) {
                        m25663 = C2105.m6981("۟֨") ^ i49;
                        i44 = ((m25663 ^ i48) * 9573) ^ (-609051709);
                        i45 = -1667571660;
                    } else {
                        m25663 = (i48 - C2105.m6981("ۙ۟")) * 75;
                        i44 = ((m25663 ^ i49) * 25045) ^ 385135627;
                        i45 = -44671194;
                    }
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i6422222222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i6422222222222;
                case -153227295:
                case -42311786:
                    i2 = i53;
                    str = str10;
                    C13800[] c13800Arr3 = c123902.f37161;
                    try {
                        List[] listArr2 = c123902.f37164;
                        int m69817 = C2105.m6981("ۧۧ") ^ i48;
                        i50 = ((m69817 ^ i49) * (-14649)) ^ 1514844102;
                        listArr = listArr2;
                        str10 = str;
                        c13800Arr = c13800Arr3;
                        i53 = i2;
                        i51 = m69817 ^ 1925864792;
                    } catch (Throwable th11) {
                        th = th11;
                        c13800Arr = c13800Arr3;
                        i16 = i54;
                        abstractC15440 = abstractC154405;
                        z = z7 ? 1 : 0;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        i8 = i2;
                        str2 = str9;
                        i3 = i52;
                        i12 = i63;
                        i13 = i55;
                        int i82 = i61;
                        c13800 = c138002;
                        i4 = i82;
                        List list16 = list4;
                        i5 = i57;
                        list = list16;
                        th = th;
                        i54 = i16;
                        z7 = z;
                        int m69814222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m69814222222 ^ i49) * 11671) ^ 1647827904;
                        i7 = m69814222222 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i672222222 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i672222222;
                        C13800 c13800422222222 = c13800;
                        i61 = i4;
                        c138002 = c13800422222222;
                        int i6822222222 = i5;
                        list4 = list;
                        i57 = i6822222222;
                    }
                case -145807944:
                case 1388347504:
                    try {
                        sb = new StringBuilder();
                        try {
                            str = str10;
                            i2 = i53;
                        } catch (Throwable th12) {
                            th = th12;
                            i2 = i53;
                            str = str10;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        i3 = i52;
                        i8 = i53;
                        i16 = i54;
                        str = str10;
                        abstractC15440 = abstractC154405;
                        z = z7 ? 1 : 0;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        str2 = str9;
                        i12 = i63;
                        i13 = i55;
                        int i822 = i61;
                        c13800 = c138002;
                        i4 = i822;
                        List list162 = list4;
                        i5 = i57;
                        list = list162;
                        th = th;
                        i54 = i16;
                        z7 = z;
                        int m698142222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m698142222222 ^ i49) * 11671) ^ 1647827904;
                        i7 = m698142222222 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i6722222222 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i6722222222;
                        C13800 c138004222222222 = c13800;
                        i61 = i4;
                        c138002 = c138004222222222;
                        int i68222222222 = i5;
                        list4 = list;
                        i57 = i68222222222;
                    }
                    try {
                        C1420.m4905(sb, C3663.m11162(f33862, 72, 1, i63));
                        C0050.m945(sb, i57);
                        C3245.m9923(sb, C4075.m12252(f33862, 73, 4, i63));
                        str10 = C0050.m947(sb);
                        int m25666 = C0630.m2566("۟۫") ^ i48;
                        i44 = ((m25666 ^ i49) * 4395) ^ (-307676640);
                        i46 = m25666 ^ 260328774;
                        int i64222222222222 = i2;
                        i51 = i46;
                        i50 = i44;
                        i53 = i64222222222222;
                    } catch (Throwable th14) {
                        th = th14;
                        i16 = i54;
                        abstractC15440 = abstractC154405;
                        z = z7 ? 1 : 0;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        i8 = i2;
                        str2 = str9;
                        i3 = i52;
                        i12 = i63;
                        i13 = i55;
                        int i8222 = i61;
                        c13800 = c138002;
                        i4 = i8222;
                        List list1622 = list4;
                        i5 = i57;
                        list = list1622;
                        th = th;
                        i54 = i16;
                        z7 = z;
                        int m6981422222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m6981422222222 ^ i49) * 11671) ^ 1647827904;
                        i7 = m6981422222222 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i67222222222 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i67222222222;
                        C13800 c1380042222222222 = c13800;
                        i61 = i4;
                        c138002 = c1380042222222222;
                        int i682222222222 = i5;
                        list4 = list;
                        i57 = i682222222222;
                    }
                case -118194475:
                case 52926261:
                    i2 = i53;
                    str = str10;
                    if (i57 < i55) {
                        m25663 = C2105.m6981("֨ᩴ") ^ i49;
                        i44 = ((m25663 ^ i48) * 25731) ^ (-1055654813);
                        i45 = -1094011076;
                    } else {
                        m25663 = C0630.m2566("ۚ᩹") ^ i49;
                        i44 = ((m25663 ^ i48) * (-16837)) ^ (-1568562761);
                        i45 = 1398898190;
                    }
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i642222222222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i642222222222222;
                case -88658495:
                case 1795040228:
                    RunnableC3474.m10626(abstractC154405);
                    return;
                case -35571722:
                case 440755635:
                    str = str10;
                    try {
                        i53 = c123902.f37160;
                        m6981 = C2105.m6981("ܳۗ") ^ i48;
                        i18 = ((m6981 ^ i49) * (-9203)) ^ (-1623814137);
                        i19 = 1302770789;
                        i51 = m6981 ^ i19;
                        i50 = i18;
                        str10 = str;
                    } catch (Throwable th15) {
                        th = th15;
                        i3 = i52;
                        i8 = i53;
                        abstractC15440 = abstractC154405;
                        z = z7 ? 1 : 0;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        i12 = i63;
                        i13 = i55;
                        int i7022 = i61;
                        c13800 = c138002;
                        i4 = i7022;
                        List list722 = list4;
                        i5 = i57;
                        list = list722;
                        th = th;
                        str2 = str9;
                        z7 = z;
                        int m69814222222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m69814222222222 ^ i49) * 11671) ^ 1647827904;
                        i7 = m69814222222222 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i672222222222 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i672222222222;
                        C13800 c13800422222222222 = c13800;
                        i61 = i4;
                        c138002 = c13800422222222222;
                        int i6822222222222 = i5;
                        list4 = list;
                        i57 = i6822222222222;
                    }
                case 21451322:
                case 87769806:
                    AbstractC2021.m6569(abstractC154405);
                    throw th;
                case 240577981:
                case 857156939:
                    i3 = i52;
                    i8 = i53;
                    str = str10;
                    abstractC15440 = abstractC154405;
                    z2 = z7 ? 1 : 0;
                    i9 = i56;
                    i10 = i60;
                    i11 = i62;
                    str2 = str9;
                    i12 = i63;
                    i13 = i55;
                    int i83 = i61;
                    c13800 = c138002;
                    i4 = i83;
                    List list17 = list4;
                    i5 = i57;
                    list = list17;
                    try {
                        C3545 c35453 = (C3545) C22628.m50605(list, i54);
                        try {
                            z8 = C0714.m2807(c2139);
                            int m69818 = C2105.m6981("ܶۜ") ^ i49;
                            i6 = ((m69818 ^ i48) * (-20055)) ^ (-131104717);
                            i7 = m69818 ^ (-1961826161);
                            c35452 = c35453;
                            i63 = i12;
                            i55 = i13;
                            str9 = str2;
                            str10 = str;
                            i53 = i8;
                            i62 = i11;
                            i56 = i9;
                            abstractC154405 = abstractC15440;
                            i60 = i10;
                            z7 = z2;
                        } catch (Throwable th16) {
                            th = th16;
                            c35452 = c35453;
                            list3 = list;
                            z7 = z2;
                            th = th;
                            list = list3;
                            int m698142222222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                            i6 = ((m698142222222222 ^ i49) * 11671) ^ 1647827904;
                            i7 = m698142222222222 ^ 1881445579;
                            i63 = i12;
                            i55 = i13;
                            str9 = str2;
                            str10 = str;
                            i53 = i8;
                            i62 = i11;
                            i56 = i9;
                            abstractC154405 = abstractC15440;
                            i60 = i10;
                            int i6722222222222 = i3;
                            i51 = i7;
                            i50 = i6;
                            i52 = i6722222222222;
                            C13800 c138004222222222222 = c13800;
                            i61 = i4;
                            c138002 = c138004222222222222;
                            int i68222222222222 = i5;
                            list4 = list;
                            i57 = i68222222222222;
                        }
                    } catch (Throwable th17) {
                        th = th17;
                        list3 = list;
                        z7 = z2;
                        th = th;
                        list = list3;
                        int m6981422222222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m6981422222222222 ^ i49) * 11671) ^ 1647827904;
                        i7 = m6981422222222222 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i67222222222222 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i67222222222222;
                        C13800 c1380042222222222222 = c13800;
                        i61 = i4;
                        c138002 = c1380042222222222222;
                        int i682222222222222 = i5;
                        list4 = list;
                        i57 = i682222222222222;
                    }
                    int i672222222222222 = i3;
                    i51 = i7;
                    i50 = i6;
                    i52 = i672222222222222;
                    C13800 c13800422222222222222 = c13800;
                    i61 = i4;
                    c138002 = c13800422222222222222;
                    int i6822222222222222 = i5;
                    list4 = list;
                    i57 = i6822222222222222;
                case 254018666:
                case 966558278:
                    i3 = i52;
                    i8 = i53;
                    str = str10;
                    abstractC15440 = abstractC154405;
                    boolean z9 = z7 ? 1 : 0;
                    i9 = i56;
                    i10 = i60;
                    i11 = i62;
                    str2 = str9;
                    i12 = i63;
                    i13 = i55;
                    int i84 = i61;
                    c13800 = c138002;
                    i4 = i84;
                    List list18 = list4;
                    i5 = i57;
                    list2 = list18;
                    try {
                        C1711.m5735(abstractC15440);
                        try {
                            List m42190 = c18090.m42190(z7);
                            try {
                                interfaceC2271Arr2 = C2405.m7812(c18090, m42190);
                                try {
                                    Boolean[] boolArr2 = new Boolean[1];
                                    try {
                                        boolArr2[z7 ? 1 : 0] = bool;
                                        int m7032 = C2126.m7032(m42190);
                                        int m25667 = (i48 - C0630.m2566("ܽۨ")) * (-37);
                                        boolArr = boolArr2;
                                        i55 = i13;
                                        i57 = i5;
                                        c138002 = c13800;
                                        str9 = str2;
                                        i53 = i8;
                                        i62 = i11;
                                        abstractC154405 = abstractC15440;
                                        i60 = i10;
                                        i58 = 1;
                                        i61 = m7032;
                                        list4 = m42190;
                                        i50 = ((m25667 ^ i49) * (-22859)) ^ (-649183343);
                                        str10 = str;
                                        i52 = i3;
                                        i51 = m25667 ^ (-1327960614);
                                        i63 = i12;
                                        i56 = i9;
                                    } catch (Throwable th18) {
                                        th = th18;
                                        list3 = m42190;
                                        boolArr = boolArr2;
                                        i58 = 1;
                                        th = th;
                                        list = list3;
                                        int m69814222222222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                                        i6 = ((m69814222222222222 ^ i49) * 11671) ^ 1647827904;
                                        i7 = m69814222222222222 ^ 1881445579;
                                        i63 = i12;
                                        i55 = i13;
                                        str9 = str2;
                                        str10 = str;
                                        i53 = i8;
                                        i62 = i11;
                                        i56 = i9;
                                        abstractC154405 = abstractC15440;
                                        i60 = i10;
                                        int i6722222222222222 = i3;
                                        i51 = i7;
                                        i50 = i6;
                                        i52 = i6722222222222222;
                                        C13800 c138004222222222222222 = c13800;
                                        i61 = i4;
                                        c138002 = c138004222222222222222;
                                        int i68222222222222222 = i5;
                                        list4 = list;
                                        i57 = i68222222222222222;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    list3 = m42190;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                                list3 = m42190;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            list3 = list2;
                            th = th;
                            list = list3;
                            int m698142222222222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                            i6 = ((m698142222222222222 ^ i49) * 11671) ^ 1647827904;
                            i7 = m698142222222222222 ^ 1881445579;
                            i63 = i12;
                            i55 = i13;
                            str9 = str2;
                            str10 = str;
                            i53 = i8;
                            i62 = i11;
                            i56 = i9;
                            abstractC154405 = abstractC15440;
                            i60 = i10;
                            int i67222222222222222 = i3;
                            i51 = i7;
                            i50 = i6;
                            i52 = i67222222222222222;
                            C13800 c1380042222222222222222 = c13800;
                            i61 = i4;
                            c138002 = c1380042222222222222222;
                            int i682222222222222222 = i5;
                            list4 = list;
                            i57 = i682222222222222222;
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        z7 = z9;
                    }
                case 315957376:
                case 2139916528:
                    i2 = i53;
                    str = str10;
                    c138002.f41126.addAll(C3432.m10491(C0237.m1494(ViewOnClickListenerC1958.m6430((AbstractC15440) C2272.m7513(it)))));
                    m25663 = C0630.m2566("ۤ᩸") ^ i48;
                    i44 = ((m25663 ^ i49) * (-3893)) ^ (-1975655705);
                    i45 = -858884435;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i6422222222222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i6422222222222222;
                case 338096166:
                case 1439337099:
                    i57++;
                    i2 = i53;
                    str = str10;
                    m25663 = (C0630.m2566("᩺۫") + i49) * 57;
                    i44 = ((m25663 ^ i48) * 29919) ^ 976946090;
                    i45 = 47013213;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i64222222222222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i64222222222222222;
                case 453828066:
                case 996113207:
                    str = str10;
                    if (i52 < i53) {
                        m6981 = (i48 - C2105.m6981("᩶ܿ")) * 51;
                        i18 = ((m6981 ^ i49) * 24243) ^ (-54064587);
                        i19 = -12147491;
                    } else {
                        m6981 = (i49 - C0630.m2566("۠ۙ")) * (-113);
                        i18 = ((m6981 ^ i48) * (-4185)) ^ 1893125532;
                        i19 = 1166586360;
                    }
                    i51 = m6981 ^ i19;
                    i50 = i18;
                    str10 = str;
                case 473865263:
                case 1496193321:
                    try {
                        AbstractC15440 m36535 = abstractC154405.m36535(str10);
                        c13800Arr[i57].m33112().m48535(m36535);
                        C2167.m7153(listArr[i57], m36535);
                        c13800Arr[i57] = new C13800(c123902.f37162);
                        i2 = i53;
                        str = str10;
                        m25663 = C0630.m2566("᩻ۖ") ^ i49;
                        i44 = ((m25663 ^ i48) * (-4245)) ^ 389426906;
                        i45 = -1704275584;
                        i46 = m25663 ^ i45;
                        str10 = str;
                        int i642222222222222222 = i2;
                        i51 = i46;
                        i50 = i44;
                        i53 = i642222222222222222;
                    } catch (Throwable th23) {
                        th = th23;
                        i3 = i52;
                        i8 = i53;
                        str = str10;
                        abstractC15440 = abstractC154405;
                        z = z7 ? 1 : 0;
                        i9 = i56;
                        i10 = i60;
                        i11 = i62;
                        i12 = i63;
                        i13 = i55;
                        int i70222 = i61;
                        c13800 = c138002;
                        i4 = i70222;
                        List list7222 = list4;
                        i5 = i57;
                        list = list7222;
                        th = th;
                        str2 = str9;
                        z7 = z;
                        int m6981422222222222222 = (C2105.m6981("ۙۧ") ^ i48) * (-43);
                        i6 = ((m6981422222222222222 ^ i49) * 11671) ^ 1647827904;
                        i7 = m6981422222222222222 ^ 1881445579;
                        i63 = i12;
                        i55 = i13;
                        str9 = str2;
                        str10 = str;
                        i53 = i8;
                        i62 = i11;
                        i56 = i9;
                        abstractC154405 = abstractC15440;
                        i60 = i10;
                        int i672222222222222222 = i3;
                        i51 = i7;
                        i50 = i6;
                        i52 = i672222222222222222;
                        C13800 c13800422222222222222222 = c13800;
                        i61 = i4;
                        c138002 = c13800422222222222222222;
                        int i6822222222222222222 = i5;
                        list4 = list;
                        i57 = i6822222222222222222;
                    }
                case 670468497:
                case 1300583059:
                    i27 = i52;
                    i28 = i53;
                    str5 = str10;
                    abstractC154403 = abstractC154405;
                    i29 = i56;
                    i30 = i60;
                    i31 = i62;
                    str6 = str9;
                    i32 = i63;
                    i33 = i55;
                    int i85 = i61;
                    c13800 = c138002;
                    i4 = i85;
                    List list19 = list4;
                    i5 = i57;
                    list = list19;
                    short s = f33862[65];
                    int i86 = (s * s) + 62884900;
                    int i87 = s + 7930;
                    if ((i86 + i86) - (i87 * i87) < 0) {
                        m69812 = C2105.m6981("ۙۖ") ^ i48;
                        i34 = ((m69812 ^ i49) * (-13963)) ^ 699245805;
                        i35 = -432907839;
                    } else {
                        m69812 = (i49 - C2105.m6981("ܿܰ")) * 93;
                        i34 = ((m69812 ^ i48) * (-25049)) ^ 1791832882;
                        i35 = -235211174;
                    }
                    i36 = m69812 ^ i35;
                    i63 = i32;
                    i55 = i33;
                    str9 = str6;
                    str10 = str5;
                    i52 = i27;
                    i62 = i31;
                    i56 = i29;
                    abstractC154405 = abstractC154403;
                    i51 = i36;
                    i60 = i30;
                    i50 = i34;
                    i53 = i28;
                    C13800 c138003222222 = c13800;
                    i61 = i4;
                    c138002 = c138003222222;
                    int i66222222 = i5;
                    list4 = list;
                    i57 = i66222222;
                case 814048493:
                case 1694031224:
                    i2 = i53;
                    str = str10;
                    z6 = C3537.m10754(c13800Arr[i57].f41126);
                    m25663 = C2105.m6981("֨֫") ^ i48;
                    i44 = ((m25663 ^ i49) * (-8859)) ^ (-173281578);
                    i45 = 2001683358;
                    i46 = m25663 ^ i45;
                    str10 = str;
                    int i6422222222222222222 = i2;
                    i51 = i46;
                    i50 = i44;
                    i53 = i6422222222222222222;
                case 1133687750:
                case 1628662861:
                    i27 = i52;
                    i28 = i53;
                    str5 = str10;
                    abstractC154403 = abstractC154405;
                    i29 = i56;
                    i30 = i60;
                    i31 = i62;
                    str6 = str9;
                    i33 = i55;
                    int i88 = i61;
                    c13800 = c138002;
                    i4 = i88;
                    List list20 = list4;
                    i5 = i57;
                    list = list20;
                    i63 = 42933;
                    int m256642 = C0630.m2566("᩹֫") ^ i49;
                    i34 = ((m256642 ^ i48) * 29613) ^ 650646923;
                    i36 = m256642 ^ (-993052229);
                    i55 = i33;
                    str9 = str6;
                    str10 = str5;
                    i52 = i27;
                    i62 = i31;
                    i56 = i29;
                    abstractC154405 = abstractC154403;
                    i51 = i36;
                    i60 = i30;
                    i50 = i34;
                    i53 = i28;
                    C13800 c1380032222222 = c13800;
                    i61 = i4;
                    c138002 = c1380032222222;
                    int i662222222 = i5;
                    list4 = list;
                    i57 = i662222222;
                case 1239632720:
                case 1867204520:
                    i3 = i52;
                    i8 = i53;
                    str = str10;
                    abstractC15440 = abstractC154405;
                    z = z7 ? 1 : 0;
                    i9 = i56;
                    i10 = i60;
                    i11 = i62;
                    str2 = str9;
                    i12 = i63;
                    i13 = i55;
                    int i89 = i61;
                    c13800 = c138002;
                    i4 = i89;
                    List list21 = list4;
                    i5 = i57;
                    list = list21;
                    if (i54 < i4) {
                        m2566 = (C2105.m6981("ᩳ۫") ^ i49) * (-49);
                        i14 = ((m2566 ^ i48) * (-8697)) ^ (-1643370354);
                        i15 = -851748874;
                    } else {
                        m2566 = (C2105.m6981("ۜۡ") + i48) * (-41);
                        i14 = ((m2566 ^ i49) * (-13323)) ^ (-1916331465);
                        i15 = -1874675952;
                    }
                    i43 = m2566 ^ i15;
                    i63 = i12;
                    i55 = i13;
                    str10 = str;
                    i52 = i3;
                    i53 = i8;
                    i56 = i9;
                    abstractC154405 = abstractC15440;
                    i60 = i10;
                    z7 = z;
                    i51 = i43;
                    i50 = i14;
                    str9 = str2;
                    i62 = i11;
                    C13800 c13800322222222 = c13800;
                    i61 = i4;
                    c138002 = c13800322222222;
                    int i6622222222 = i5;
                    list4 = list;
                    i57 = i6622222222;
                case 1250105844:
                case 1486257315:
                    i37 = i52;
                    i28 = i53;
                    str7 = str10;
                    abstractC154404 = abstractC154405;
                    i38 = i55;
                    i39 = i56;
                    i40 = i62;
                    str8 = str9;
                    i41 = i63;
                    int i90 = i61;
                    c13800 = c138002;
                    i4 = i90;
                    List list22 = list4;
                    i5 = i57;
                    list = list22;
                    HashSet hashSet3 = new HashSet();
                    C17032 c170323 = new C17032();
                    C12390 c123903 = new C12390();
                    c123903.f37162 = null;
                    c123903.f37163 = 0;
                    c123903.f37160 = i;
                    c123903.f37161 = new C13800[i];
                    c123903.f37164 = new List[i];
                    c123903.f37165 = new C17738[i];
                    hashSet2 = hashSet3;
                    c170322 = c170323;
                    c123902 = c123903;
                    bool = null;
                    i42 = 0;
                    z7 = false;
                    int m698152 = C2105.m6981("᩷ۧ") ^ i48;
                    i34 = ((m698152 ^ i49) * (-1731)) ^ 2004839340;
                    i63 = i41;
                    i55 = i38;
                    str9 = str8;
                    str10 = str7;
                    i52 = i37;
                    i62 = i40;
                    i56 = i39;
                    abstractC154405 = abstractC154404;
                    i60 = i42;
                    i51 = m698152 ^ (-1117552260);
                    i50 = i34;
                    i53 = i28;
                    C13800 c138003222222222 = c13800;
                    i61 = i4;
                    c138002 = c138003222222222;
                    int i66222222222 = i5;
                    list4 = list;
                    i57 = i66222222222;
                default:
                    str4 = str9;
                    i24 = i52;
                    i23 = i53;
                    str3 = str10;
                    abstractC154402 = abstractC154405;
                    z3 = z7 ? 1 : 0;
                    i21 = i56;
                    i22 = i60;
                    i25 = i63;
                    i26 = i55;
                    int i91 = i61;
                    c13800 = c138002;
                    i4 = i91;
                    List list23 = list4;
                    i5 = i57;
                    list = list23;
                    i20 = i58;
                    i54 = 0;
                    int m256652 = C0630.m2566("᩹ۡ") ^ i49;
                    i63 = i25;
                    i55 = i26;
                    str10 = str3;
                    i53 = i23;
                    i56 = i21;
                    abstractC154405 = abstractC154402;
                    i60 = i22;
                    z7 = z3;
                    String str112 = str4;
                    i62 = i20;
                    i50 = ((m256652 ^ i48) * (-30281)) ^ (-145605822);
                    i52 = i24;
                    i51 = m256652 ^ (-944805179);
                    str9 = str112;
                    C13800 c138004222222222222222222 = c13800;
                    i61 = i4;
                    c138002 = c138004222222222222222222;
                    int i68222222222222222222 = i5;
                    list4 = list;
                    i57 = i68222222222222222222;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (l.C3746.f11829 > 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0057, code lost:
    
        if (l.C1005.f3721 != false) goto L85;
     */
    @Override // android.widget.AdapterView.OnItemSelectedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemSelected(android.widget.AdapterView r22, android.view.View r23, int r24, long r25) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11312.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        adapterView.setSelection(0);
    }
}
