package l;

import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;

/* compiled from: P418 */
/* renamed from: l.۫ۢ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12334 {

    /* renamed from: ۗܰᩳ, reason: not valid java name and contains not printable characters */
    private static final short[] f36935 = {8446, -180, -248, -253, -236, -253, 6746, 15901, 2406, 15862, 15797, 15796, 15788, 15802, 15785, 15797, 15862, 15806, 15797, 15800, 15796, 15807, 15794, 15797, 15804, 15790, 15791, 15805, 15862, 15843, 15862, 15784, 15796, 15790, 15785, 15800, 15806, 15850, 15861, 15843, 15862, 15791, 15802, 15785, 15804, 15806, 15791, 15862, 15801, 15796, 15796, 15791, 15800, 15799, 15802, 15784, 15784, 15787, 15802, 15791, 15795, 15793, 15802, 15789, 15802, 15800, 15860, 15801, 15796, 15796, 15791, 15860, 15800, 15799, 15802, 15784, 15784, 15806, 15784, 15861, 15793, 15802, 15785, 15862, 15806, 15779, 15791, 15807, 15794, 15785, 15784, 15793, 15802, 15789, 15802, 15800, 15860, 15806, 15779, 15791, 15862, 15807, 15862, 15800, 15787, 15861, 15793, 15802, 15785, 15758, 15759, 15773, 15862, 15843, 15860, 8262, -15843, -15850, -15871, -15850, -15852, -15784, -15871, -15854, -15867, -15868, -15842, -15848, -15847, -15843, -15850, -15871, -15850, -15852, -15784, -15851, -15848, -15848, -15869, -15843, -15850, -15871, -15850, -15852, -15784, -15854, -15857, -15869, -15852, -15845, -15850, -15868, -15868, -15854, -15868, -15783, -15843, -15850, -15867, -15852, -15845, -15850, -15868, -15868, -15854, -15868, -15783, -15853, -15854, -15857, -15784, -15850, -15868, -15868, -15854, -15869, -15868, -15784, -15850, -15847, -15853, -15867, -15848, -15842, -15853, -15832, -15853, -15854, -15857, -15784, -15850, -15868, -15868, -15854, -15869, -15868, -15784, -15852, -15848, -15846, -15865, -15842, -15845, -15854, -15832, -15853, -15854, -15857};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29941(C18911 c18911) {
        File file;
        int m6981;
        int i;
        int i2;
        File file2;
        String str;
        File file3;
        byte[] bArr;
        File file4;
        File file5;
        byte[] bArr2;
        int m69812;
        int i3;
        int m2566;
        int i4;
        int i5;
        int i6;
        File file6;
        int i7;
        File file7;
        int m69813;
        int i8;
        int i9;
        int m69814;
        int i10;
        File file8;
        int i11 = C1047.f3863;
        int i12 = C0714.f2697;
        int m25662 = C0630.m2566("ۤ᩸") ^ i11;
        int i13 = ((m25662 ^ i12) * (-15917)) ^ 524413714;
        String str2 = null;
        File file9 = null;
        FileInputStream fileInputStream = null;
        File file10 = null;
        byte[] bArr3 = null;
        short[] sArr = null;
        int i14 = m25662 ^ 1798506387;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z = false;
        boolean z2 = false;
        short s = 0;
        int i28 = 0;
        boolean z3 = false;
        int i29 = 0;
        int i30 = -944731281;
        File file11 = null;
        File file12 = null;
        File file13 = null;
        File file14 = null;
        File file15 = null;
        while (true) {
            i30 = i14 ^ (i13 & (((i30 ^ i12) * (-25691)) >> 31));
            switch (i30) {
                case -2131241803:
                case -813978449:
                    bArr = bArr3;
                    File file16 = file12;
                    File file17 = file13;
                    file2 = file10;
                    C15843.m37503(file11);
                    file11.mkdirs();
                    File file18 = file11;
                    File file19 = new File(file18, str2);
                    sArr = f36935;
                    if (C3911.f12484 >= 0) {
                        file3 = file19;
                        file11 = file18;
                        file5 = file14;
                        str = str2;
                        i18 = 170;
                        int m69815 = (C2105.m6981("۬ۛ") + i11) * 55;
                        i14 = m69815 ^ (-436135232);
                        i13 = ((m69815 ^ i12) * 9613) ^ 1436380294;
                        file10 = file2;
                        bArr3 = bArr;
                        file14 = file5;
                        str2 = str;
                        file12 = null;
                        file13 = null;
                        file9 = file3;
                    } else {
                        int m69816 = (i12 - C2105.m6981("֨ۚ")) * (-119);
                        file11 = file18;
                        file13 = file17;
                        file10 = file2;
                        bArr3 = bArr;
                        file9 = file19;
                        i13 = ((m69816 ^ i11) * 537) ^ (-1328968428);
                        file12 = file16;
                        i18 = 170;
                        i14 = m69816 ^ 415410516;
                    }
                case -2097568088:
                case 89218399:
                    if (!C1005.m3501()) {
                        file = file12;
                        m6981 = C0630.m2566("ۤۜ") ^ i12;
                        i = ((m6981 ^ i11) * 3651) ^ (-236878406);
                        i2 = 134764952;
                        int i31 = m6981 ^ i2;
                        file12 = file;
                        i14 = i31;
                        i13 = i;
                    }
                    m69812 = (i12 - C0630.m2566("ۚ֡")) * (-9);
                    i = ((m69812 ^ i11) * 26969) ^ (-155116078);
                    i3 = 1817016927;
                    i14 = m69812 ^ i3;
                    i13 = i;
                case -2050917839:
                case -154386492:
                    file = file12;
                    fileInputStream = new FileInputStream(file15);
                    i21 = fileInputStream.read() | (fileInputStream.read() << 8);
                    i22 = fileInputStream.read();
                    if (C3019.f9544 >= 0) {
                        file2 = file10;
                        file4 = file14;
                        str = str2;
                        file3 = file9;
                        bArr2 = bArr3;
                        m2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((m2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = m2566 ^ i5;
                        bArr3 = bArr2;
                        file14 = file4;
                        str2 = str;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    } else {
                        m6981 = C0630.m2566("᩻ۜ") ^ i12;
                        i = ((m6981 ^ i11) * 24893) ^ 1297094368;
                        i2 = -741282943;
                        int i312 = m6981 ^ i2;
                        file12 = file;
                        i14 = i312;
                        i13 = i;
                    }
                case -2042126339:
                case -1813729693:
                    C3245.m9925();
                    if (C4159.f13567) {
                        m69812 = C2105.m6981("ۚۜ") ^ i11;
                        i = ((m69812 ^ i12) * (-29945)) ^ (-934512494);
                        i3 = -442880340;
                        i14 = m69812 ^ i3;
                        i13 = i;
                    } else {
                        file4 = file14;
                        str = str2;
                        file = file12;
                        file3 = file9;
                        file2 = file10;
                        bArr2 = bArr3;
                        m2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((m2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = m2566 ^ i5;
                        bArr3 = bArr2;
                        file14 = file4;
                        str2 = str;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    }
                case -2000142572:
                case 830177392:
                    break;
                case -1932485393:
                case 754274540:
                    file4 = file14;
                    str = str2;
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr2 = bArr3;
                    if ((i28 * i28) - ((s * 2) + 1) >= 0) {
                        m2566 = (C2105.m6981("ܿۛ") + i12) * 91;
                        i4 = ((m2566 ^ i11) * 22695) ^ (-1037339894);
                        i5 = -1736060229;
                    } else {
                        m2566 = C0630.m2566("ܿۨ") ^ i12;
                        i4 = ((m2566 ^ i11) * 20411) ^ (-1832483433);
                        i5 = 1879657980;
                    }
                    i6 = m2566 ^ i5;
                    bArr3 = bArr2;
                    file14 = file4;
                    str2 = str;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case -1785100132:
                case 1570556509:
                    file = file12;
                    i23 = i21 | (i22 << 16);
                    i24 = fileInputStream.read() << 24;
                    if (C2272.f7362) {
                        file2 = file10;
                        file5 = file14;
                        file3 = file9;
                        bArr = bArr3;
                        int m25663 = (C0630.m2566("ۡ֫") ^ i11) * (-79);
                        i4 = ((m25663 ^ i12) * 29651) ^ 12352324;
                        i6 = m25663 ^ (-1620579383);
                        bArr3 = bArr;
                        file14 = file5;
                        file11 = null;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    } else {
                        m6981 = (C0630.m2566("᩷᩺") + i11) * (-117);
                        i = ((m6981 ^ i12) * (-24199)) ^ 485511513;
                        i2 = 1442544806;
                        int i3122 = m6981 ^ i2;
                        file12 = file;
                        i14 = i3122;
                        i13 = i;
                    }
                case -1426714029:
                case 1068607745:
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr = bArr3;
                    file6 = file13;
                    i20 = -1;
                    i29 = -1;
                    m69814 = C2105.m6981("ۙۛ") ^ i12;
                    i4 = ((m69814 ^ i11) * 18401) ^ 1119599649;
                    i10 = 1572033132;
                    i6 = m69814 ^ i10;
                    file13 = file6;
                    bArr3 = bArr;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case -1422497450:
                case -409727114:
                    C1294.m4372();
                    file = file12;
                    m6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                    i = ((m6981 ^ i12) * 441) ^ 404756723;
                    i2 = -1847363215;
                    int i31222 = m6981 ^ i2;
                    file12 = file;
                    i14 = i31222;
                    i13 = i;
                case -1187615581:
                case 234330228:
                    FileOutputStream fileOutputStream = new FileOutputStream(file15);
                    fileOutputStream.write(i16);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i19);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    fileOutputStream.write(i17);
                    C3019.m9251(fileOutputStream);
                    m69812 = C2105.m6981("ۚ᩸") ^ i12;
                    i = ((m69812 ^ i11) * (-10573)) ^ (-1412715846);
                    i3 = 109562839;
                    i14 = m69812 ^ i3;
                    i13 = i;
                case -1165655138:
                case -398957944:
                    int i32 = i29;
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr = bArr3;
                    file6 = file13;
                    if (C0798.m3003(file14)) {
                        int m25664 = C0630.m2566("ۨܿ") ^ i11;
                        i29 = i32;
                        i13 = ((m25664 ^ i12) * (-19747)) ^ 1052292627;
                        i7 = m25664 ^ (-1891220599);
                        file13 = file6;
                        bArr3 = bArr;
                        file9 = file3;
                        file7 = file;
                        i14 = i7;
                        file10 = file2;
                        file12 = file7;
                    } else {
                        i29 = i32;
                        file13 = file6;
                        str = str2;
                        int m25665 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                        i4 = ((m25665 ^ i11) * (-29343)) ^ (-617877859);
                        i6 = m25665 ^ (-1191569899);
                        bArr3 = bArr;
                        str2 = str;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    }
                case -1051908969:
                case 1253639449:
                    file = file12;
                    file3 = file9;
                    C15843.m37500(file3, C8172.m21646(C0422.m1955(sArr, i18, 19, i15)));
                    if (C0964.f3626 != 0) {
                        file2 = file10;
                        bArr = bArr3;
                        file5 = file14;
                        str = str2;
                        int m698152 = (C2105.m6981("۬ۛ") + i11) * 55;
                        i14 = m698152 ^ (-436135232);
                        i13 = ((m698152 ^ i12) * 9613) ^ 1436380294;
                        file10 = file2;
                        bArr3 = bArr;
                        file14 = file5;
                        str2 = str;
                        file12 = null;
                        file13 = null;
                        file9 = file3;
                    } else {
                        C3310 m10118 = C3310.m10118(new FileInputStream(file3));
                        file2 = file10;
                        bArr = bArr3;
                        m10118.m10121(new C4573(c18911));
                        m10118.m10123();
                        file6 = file13;
                        m10118.m10120(new FileOutputStream(file6));
                        file3.delete();
                        file8 = file11;
                        z = true;
                        m69814 = C2105.m6981("ᩳۚ") ^ i12;
                        file11 = file8;
                        i4 = ((m69814 ^ i11) * 17487) ^ 170153567;
                        i10 = 1563612932;
                        i6 = m69814 ^ i10;
                        file13 = file6;
                        bArr3 = bArr;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    }
                case -1040851674:
                case 807105877:
                    C15843.m37503(file12);
                    file12.mkdirs();
                    File file20 = file12;
                    file10 = new File(file20, str2);
                    file = file20;
                    bArr3 = C8172.m21646(C3432.m10488(f36935, 189, 19, i15));
                    if (RunnableC0588.m2441() < 0) {
                        m6981 = (C0630.m2566("ۡ֨") + i12) * (-75);
                        i = ((m6981 ^ i11) * (-9819)) ^ 1819027049;
                        i2 = 2028907429;
                        int i312222 = m6981 ^ i2;
                        file12 = file;
                        i14 = i312222;
                        i13 = i;
                    }
                    m6981 = C0630.m2566("ۤۜ") ^ i12;
                    i = ((m6981 ^ i11) * 3651) ^ (-236878406);
                    i2 = 134764952;
                    int i3122222 = m6981 ^ i2;
                    file12 = file;
                    i14 = i3122222;
                    i13 = i;
                case -925569702:
                case 603440404:
                    C4263.m12819();
                    if (AbstractC2021.f6743 <= 0) {
                        file = file12;
                        m6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                        i = ((m6981 ^ i12) * 441) ^ 404756723;
                        i2 = -1847363215;
                        int i31222222 = m6981 ^ i2;
                        file12 = file;
                        i14 = i31222222;
                        i13 = i;
                    } else {
                        file4 = file14;
                        str = str2;
                        file = file12;
                        file3 = file9;
                        file2 = file10;
                        bArr2 = bArr3;
                        m2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((m2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = m2566 ^ i5;
                        bArr3 = bArr2;
                        file14 = file4;
                        str2 = str;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    }
                case -746653730:
                case 239177660:
                    file = file12;
                    i19 = 18;
                    if (18 != i20) {
                        m6981 = (C2105.m6981("ۡ᩷") ^ i12) * IShizukuService.Stub.TRANSACTION_dispatchPackageChanged;
                        i = ((m6981 ^ i11) * (-16967)) ^ 312272119;
                        i2 = -2082600213;
                        int i312222222 = m6981 ^ i2;
                        file12 = file;
                        i14 = i312222222;
                        i13 = i;
                    } else {
                        z2 = z;
                        m6981 = C0630.m2566("ۙۚ") ^ i11;
                        i = ((m6981 ^ i12) * (-7947)) ^ 984496106;
                        i2 = -1322682569;
                        int i3122222222 = m6981 ^ i2;
                        file12 = file;
                        i14 = i3122222222;
                        i13 = i;
                    }
                case -738421933:
                case -634370332:
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    byte[] bArr4 = bArr3;
                    File file21 = file13;
                    str2 = C0050.m948(f36935, 159, 11, i15);
                    z3 = true;
                    i17 = 0;
                    int i33 = i29;
                    if (4 != i33) {
                        m69813 = C0630.m2566("ۜ֨") ^ i11;
                        i8 = ((m69813 ^ i12) * (-30275)) ^ 1022618178;
                        i9 = 1107522442;
                    } else {
                        m69813 = (C2105.m6981("ܳᩴ") + i12) * 119;
                        i8 = ((m69813 ^ i11) * 355) ^ 917558835;
                        i9 = 151751689;
                    }
                    i7 = m69813 ^ i9;
                    i29 = i33;
                    file13 = file21;
                    i13 = i8;
                    bArr3 = bArr4;
                    i16 = 4;
                    file9 = file3;
                    file7 = file;
                    i14 = i7;
                    file10 = file2;
                    file12 = file7;
                case -596607918:
                case 970066269:
                    file = file12;
                    if (file15.length() == 8) {
                        m6981 = (C2105.m6981("ۤۨ") ^ i11) * 119;
                        i = ((m6981 ^ i12) * 26917) ^ (-134838981);
                        i2 = 1189885722;
                        int i31222222222 = m6981 ^ i2;
                        file12 = file;
                        i14 = i31222222222;
                        i13 = i;
                    } else {
                        file2 = file10;
                        str = str2;
                        file3 = file9;
                        bArr = bArr3;
                        int m256652 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                        i4 = ((m256652 ^ i11) * (-29343)) ^ (-617877859);
                        i6 = m256652 ^ (-1191569899);
                        bArr3 = bArr;
                        str2 = str;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    }
                case -431230226:
                case 440120796:
                    file4 = file14;
                    str = str2;
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr2 = bArr3;
                    s = f36935[115];
                    i28 = s + 1;
                    if (C2958.f9394 < 0) {
                        m2566 = C0630.m2566("ܺۖ") ^ i11;
                        i4 = ((m2566 ^ i12) * (-30603)) ^ (-1683253813);
                        i5 = 27819866;
                        i6 = m2566 ^ i5;
                        bArr3 = bArr2;
                        file14 = file4;
                        str2 = str;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    }
                    m2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                    i4 = ((m2566 ^ i11) * (-17331)) ^ (-927642218);
                    i5 = 700871089;
                    i6 = m2566 ^ i5;
                    bArr3 = bArr2;
                    file14 = file4;
                    str2 = str;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case -380873538:
                case 1730603992:
                    file = file12;
                    i20 = i26 | (i27 << 16) | (fileInputStream.read() << 24);
                    file2 = file10;
                    i29 = i25;
                    file3 = file9;
                    bArr = bArr3;
                    file6 = file13;
                    m69814 = C2105.m6981("ۙۛ") ^ i12;
                    i4 = ((m69814 ^ i11) * 18401) ^ 1119599649;
                    i10 = 1572033132;
                    i6 = m69814 ^ i10;
                    file13 = file6;
                    bArr3 = bArr;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case -323655105:
                case 1874253298:
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr = bArr3;
                    file5 = file14;
                    file15 = new File(C4925.m14322(), C3019.m9250(f36935, 116, 13, i15));
                    if (ViewOnClickListenerC1958.f6529 <= 0) {
                        int m256632 = (C0630.m2566("ۡ֫") ^ i11) * (-79);
                        i4 = ((m256632 ^ i12) * 29651) ^ 12352324;
                        i6 = m256632 ^ (-1620579383);
                        bArr3 = bArr;
                        file14 = file5;
                        file11 = null;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    } else {
                        File file22 = new File(C4925.m14322(), C1711.m5726(f36935, 129, 10, i15));
                        if (RunnableC3474.m10630()) {
                            str = str2;
                            File file23 = new File(C4925.m14322(), C22628.m50602(f36935, 139, 9, i15));
                            short[] sArr2 = f36935;
                            if (C2958.f9394 < 0) {
                                String m28025 = C11340.m28025(sArr2, 148, 11, i15);
                                File file24 = new File(file22, m28025);
                                file14 = new File(file23, m28025);
                                if (C1711.m5732(file24)) {
                                    int m69817 = C2105.m6981("᩺ܺ") ^ i11;
                                    int i34 = ((m69817 ^ i12) * 1299) ^ 322045066;
                                    i14 = m69817 ^ 939440887;
                                    file13 = file24;
                                    file15 = file15;
                                    bArr3 = bArr;
                                    file11 = file22;
                                    i13 = i34;
                                    file9 = file3;
                                    str2 = str;
                                    file12 = file23;
                                    file10 = file2;
                                } else {
                                    file = file23;
                                    file13 = file24;
                                    file15 = file15;
                                    file11 = file22;
                                    int m2566522 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                                    i4 = ((m2566522 ^ i11) * (-29343)) ^ (-617877859);
                                    i6 = m2566522 ^ (-1191569899);
                                    bArr3 = bArr;
                                    str2 = str;
                                    file9 = file3;
                                    file7 = file;
                                    i14 = i6;
                                    i13 = i4;
                                    file10 = file2;
                                    file12 = file7;
                                }
                            }
                        } else {
                            str = str2;
                        }
                        file15 = file15;
                        file11 = file22;
                        int m6981522 = (C2105.m6981("۬ۛ") + i11) * 55;
                        i14 = m6981522 ^ (-436135232);
                        i13 = ((m6981522 ^ i12) * 9613) ^ 1436380294;
                        file10 = file2;
                        bArr3 = bArr;
                        file14 = file5;
                        str2 = str;
                        file12 = null;
                        file13 = null;
                        file9 = file3;
                    }
                case -214383056:
                case -28921752:
                    file4 = file14;
                    str = str2;
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr2 = bArr3;
                    i15 = 39267;
                    m2566 = C0630.m2566("᩸۠") ^ i11;
                    i4 = ((m2566 ^ i12) * (-26297)) ^ 1810694153;
                    i5 = 1640911934;
                    i6 = m2566 ^ i5;
                    bArr3 = bArr2;
                    file14 = file4;
                    str2 = str;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case -176307309:
                case 37657527:
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr = bArr3;
                    file6 = file13;
                    if (C0798.m3003(file15)) {
                        m69814 = C2105.m6981("۟ܿ") ^ i11;
                        i4 = ((m69814 ^ i12) * 17877) ^ 1352670027;
                        i10 = -1263873932;
                        i6 = m69814 ^ i10;
                        file13 = file6;
                        bArr3 = bArr;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    }
                    file13 = file6;
                    str = str2;
                    int m25665222 = (C0630.m2566("ۙ᩺") + i12) * (-115);
                    i4 = ((m25665222 ^ i11) * (-29343)) ^ (-617877859);
                    i6 = m25665222 ^ (-1191569899);
                    bArr3 = bArr;
                    str2 = str;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case 14204601:
                case 775070043:
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr = bArr3;
                    file8 = file11;
                    file6 = file13;
                    z = false;
                    m69814 = C2105.m6981("ᩳۚ") ^ i12;
                    file11 = file8;
                    i4 = ((m69814 ^ i11) * 17487) ^ 170153567;
                    i10 = 1563612932;
                    i6 = m69814 ^ i10;
                    file13 = file6;
                    bArr3 = bArr;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case 56165858:
                case 1878833834:
                    file = file12;
                    i25 = i23 | i24;
                    i26 = fileInputStream.read() | (fileInputStream.read() << 8);
                    i27 = fileInputStream.read();
                    if (C1294.f4556 < 0) {
                        m6981 = (i11 - C2105.m6981("ܶܳ")) * (-73);
                        i = ((m6981 ^ i12) * 6987) ^ (-2045474267);
                        i2 = -835802324;
                        int i312222222222 = m6981 ^ i2;
                        file12 = file;
                        i14 = i312222222222;
                        i13 = i;
                    }
                    m6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                    i = ((m6981 ^ i12) * 441) ^ 404756723;
                    i2 = -1847363215;
                    int i3122222222222 = m6981 ^ i2;
                    file12 = file;
                    i14 = i3122222222222;
                    i13 = i;
                case 250954712:
                case 1503801940:
                    file4 = file14;
                    str = str2;
                    file = file12;
                    file3 = file9;
                    file2 = file10;
                    bArr2 = bArr3;
                    i15 = 49783;
                    m2566 = C0630.m2566("᩸۠") ^ i11;
                    i4 = ((m2566 ^ i12) * (-26297)) ^ 1810694153;
                    i5 = 1640911934;
                    i6 = m2566 ^ i5;
                    bArr3 = bArr2;
                    file14 = file4;
                    str2 = str;
                    file9 = file3;
                    file7 = file;
                    i14 = i6;
                    i13 = i4;
                    file10 = file2;
                    file12 = file7;
                case 446621895:
                case 2054166787:
                    C1128.m3851();
                    break;
                case 489413580:
                case 1011984767:
                    if (z2) {
                        m69812 = C0630.m2566("ۖ᩹") ^ i11;
                        i = ((m69812 ^ i12) * (-28539)) ^ (-2041068508);
                        i3 = 877561769;
                        i14 = m69812 ^ i3;
                        i13 = i;
                    }
                    m69812 = C2105.m6981("ۚ᩸") ^ i12;
                    i = ((m69812 ^ i11) * (-10573)) ^ (-1412715846);
                    i3 = 109562839;
                    i14 = m69812 ^ i3;
                    i13 = i;
                case 734876361:
                case 914201713:
                    C15843.m37500(file10, bArr3);
                    C3310 m101182 = C3310.m10118(new FileInputStream(file10));
                    m101182.m10123();
                    m101182.m10120(new FileOutputStream(file14));
                    file10.delete();
                    z2 = z3;
                    file = file12;
                    m6981 = C0630.m2566("ۙۚ") ^ i11;
                    i = ((m6981 ^ i12) * (-7947)) ^ 984496106;
                    i2 = -1322682569;
                    int i31222222222222 = m6981 ^ i2;
                    file12 = file;
                    i14 = i31222222222222;
                    i13 = i;
                case 964110191:
                case 1759703175:
                    if (C4159.m12565() < 0) {
                        file4 = file14;
                        str = str2;
                        file = file12;
                        file3 = file9;
                        file2 = file10;
                        bArr2 = bArr3;
                        m2566 = (C0630.m2566("ܰ۠") + i12) * (-125);
                        i4 = ((m2566 ^ i11) * (-17331)) ^ (-927642218);
                        i5 = 700871089;
                        i6 = m2566 ^ i5;
                        bArr3 = bArr2;
                        file14 = file4;
                        str2 = str;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    } else {
                        m69812 = (i12 - C0630.m2566("ۚ֡")) * (-9);
                        i = ((m69812 ^ i11) * 26969) ^ (-155116078);
                        i3 = 1817016927;
                        i14 = m69812 ^ i3;
                        i13 = i;
                    }
                default:
                    if (C3683.m11222()) {
                        file5 = file14;
                        file = file12;
                        file3 = file9;
                        file2 = file10;
                        bArr = bArr3;
                        int m2566322 = (C0630.m2566("ۡ֫") ^ i11) * (-79);
                        i4 = ((m2566322 ^ i12) * 29651) ^ 12352324;
                        i6 = m2566322 ^ (-1620579383);
                        bArr3 = bArr;
                        file14 = file5;
                        file11 = null;
                        file9 = file3;
                        file7 = file;
                        i14 = i6;
                        i13 = i4;
                        file10 = file2;
                        file12 = file7;
                    } else {
                        file = file12;
                        m6981 = (i11 - C2105.m6981("֡ᩴ")) * 27;
                        i = ((m6981 ^ i12) * 441) ^ 404756723;
                        i2 = -1847363215;
                        int i312222222222222 = m6981 ^ i2;
                        file12 = file;
                        i14 = i312222222222222;
                        i13 = i;
                    }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29939(AbstractC15440 abstractC15440, C8918 c8918, String str) {
        StringBuilder sb;
        String str2;
        int m6981;
        int i;
        int i2;
        int m2566;
        int i3;
        int i4;
        String str3;
        C8918 c89182 = c8918;
        StringBuilder sb2 = null;
        String str4 = null;
        Iterator it = null;
        short[] sArr = null;
        short s = 0;
        int i5 = 0;
        int i6 = 0;
        short[] sArr2 = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 775894727;
        int i10 = RunnableC3474.f10992;
        int i11 = C0483.f2088;
        int m69812 = C2105.m6981("ۨ۬") ^ i10;
        int i12 = ((m69812 ^ i11) * UMErrorCode.E_UM_BE_CREATE_FAILED) ^ (-67357282);
        int i13 = m69812 ^ 1704897981;
        C3545 c3545 = null;
        while (true) {
            i9 = ((((i9 ^ i11) * 7715) >> 31) & i12) ^ i13;
            switch (i9) {
                case -2123278667:
                case -1025933019:
                    C0382.m1848();
                    break;
                case -1977695909:
                case -928759857:
                    String str5 = str4;
                    sb2 = C5368.m15339(str);
                    C3245.m9923(sb2, C11340.m28023(abstractC15440));
                    sArr2 = f36935;
                    if (AbstractC2021.f6743 <= 0) {
                        str4 = str5;
                        int m69813 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((m69813 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ m69813;
                        c3545 = null;
                        c89182 = c8918;
                    } else {
                        int m25662 = (C0630.m2566("ܳۨ") ^ i10) * 73;
                        sb = sb2;
                        i = ((m25662 ^ i11) * (-27431)) ^ (-21362208);
                        i13 = m25662 ^ 2046969349;
                        str4 = str5;
                        i12 = i;
                        sb2 = sb;
                    }
                case -1849413251:
                case 1130841566:
                    sb = sb2;
                    str2 = str4;
                    i7 = 7;
                    i8 = 1;
                    if (RunnableC0588.f2309 >= 0) {
                        m6981 = (C2105.m6981("ۤ᩵") ^ i11) * (-7);
                        i = ((m6981 ^ i10) * 19297) ^ 1618985102;
                        i2 = 1597296559;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    } else {
                        m2566 = (i10 - C0630.m2566("֡᩷")) * (-89);
                        i3 = ((m2566 ^ i11) * 6579) ^ (-912697396);
                        i4 = -632999089;
                        i13 = m2566 ^ i4;
                        sb2 = sb;
                        String str6 = str2;
                        i12 = i3;
                        str4 = str6;
                    }
                case -1744291155:
                case 355234473:
                    c89182.m23011(C1420.m4910(abstractC15440));
                    c8918.m23023();
                    break;
                case -1355210946:
                case 652523275:
                    sb = sb2;
                    str2 = str4;
                    int i14 = s + 13694;
                    i5 = i14 * i14;
                    if (!C1504.f5354) {
                        m6981 = (i11 - C2105.m6981("ܿ᩻")) * 27;
                        i = ((m6981 ^ i10) * 4911) ^ (-485152710);
                        i2 = -1663253100;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    }
                    m6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                    i = ((m6981 ^ i11) * (-25791)) ^ (-536667320);
                    i2 = 2030672382;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case -1224871765:
                case 79288851:
                    sb = sb2;
                    str2 = str4;
                    sArr = f36935;
                    if (C7106.f21815 == 0) {
                        m6981 = (i10 - C2105.m6981("ܰۧ")) * (-91);
                        i = ((m6981 ^ i11) * (-14649)) ^ (-69368047);
                        i2 = 711736301;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    }
                    m6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                    i = ((m6981 ^ i11) * (-25791)) ^ (-536667320);
                    i2 = 2030672382;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case -1187857875:
                case 65729644:
                    C0964.m3413();
                    if (C4117.f13076 <= 0) {
                        sb = sb2;
                        str2 = str4;
                        m6981 = C0630.m2566("ܿۛ") ^ i10;
                        i = ((m6981 ^ i11) * 17747) ^ 1214213644;
                        i2 = 2074929763;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    }
                    sb = sb2;
                    str2 = str4;
                    m6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                    i = ((m6981 ^ i11) * (-25791)) ^ (-536667320);
                    i2 = 2030672382;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case -1144523687:
                case 1464419867:
                    sb = sb2;
                    str2 = str4;
                    c3545.setTime(0L);
                    c89182.m23013(c3545);
                    if (C2105.f7037 == 0) {
                        m2566 = (i11 - C2105.m6981("ۜۖ")) * (-59);
                        i3 = ((m2566 ^ i10) * 29269) ^ 111145668;
                        i4 = -2044612412;
                        i13 = m2566 ^ i4;
                        sb2 = sb;
                        String str62 = str2;
                        i12 = i3;
                        str4 = str62;
                    }
                    m2566 = C2105.m6981("֫᩶") ^ i10;
                    i3 = ((m2566 ^ i11) * 22867) ^ (-873752506);
                    i4 = -1352134991;
                    i13 = m2566 ^ i4;
                    sb2 = sb;
                    String str622 = str2;
                    i12 = i3;
                    str4 = str622;
                case -1120231557:
                case 768109815:
                    if (C0422.f1886 > 0) {
                        sb = sb2;
                        str2 = str4;
                        m6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                        i = ((m6981 ^ i11) * (-25791)) ^ (-536667320);
                        i2 = 2030672382;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    } else {
                        sb = sb2;
                        str2 = str4;
                        m2566 = C2105.m6981("֫᩶") ^ i10;
                        i3 = ((m2566 ^ i11) * 22867) ^ (-873752506);
                        i4 = -1352134991;
                        i13 = m2566 ^ i4;
                        sb2 = sb;
                        String str6222 = str2;
                        i12 = i3;
                        str4 = str6222;
                    }
                case -997865965:
                case 985130455:
                    m29939((AbstractC15440) C2272.m7513(it), c89182, str4);
                    str3 = str4;
                    int m69814 = (i10 - C2105.m6981("۠֡")) * 81;
                    Iterator it2 = it;
                    int i15 = ((m69814 ^ i11) * (-17851)) ^ (-1984172762);
                    i13 = m69814 ^ (-1429765960);
                    str4 = str3;
                    i12 = i15;
                    it = it2;
                case -964529158:
                case 533256765:
                    sb = sb2;
                    str2 = str4;
                    StringBuilder m15339 = C5368.m15339(str);
                    C3245.m9923(m15339, C11340.m28023(abstractC15440));
                    if (C3663.m11168() >= 0) {
                        str4 = str2;
                        sb2 = sb;
                        int m698132 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((m698132 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ m698132;
                        c3545 = null;
                        c89182 = c8918;
                    } else {
                        c3545 = new C3545(C0050.m947(m15339));
                        if (C4075.f12947 < 0) {
                            m6981 = (C2105.m6981("ۘۙ") ^ i10) * (-13);
                            i = ((m6981 ^ i11) * 8839) ^ (-1778037197);
                            i2 = 1347788639;
                            i13 = m6981 ^ i2;
                            str4 = str2;
                            c89182 = c8918;
                            i12 = i;
                            sb2 = sb;
                        }
                        m6981 = C0630.m2566("ܿۛ") ^ i10;
                        i = ((m6981 ^ i11) * 17747) ^ 1214213644;
                        i2 = 2074929763;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    }
                case -933072407:
                case 464957539:
                    sb = sb2;
                    str2 = str4;
                    s = sArr[6];
                    if (C22628.f73083 > 0) {
                        m6981 = C0630.m2566("֨ᩴ") ^ i10;
                        i = ((m6981 ^ i11) * (-29555)) ^ 1380999119;
                        i2 = 1192145770;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    }
                    m6981 = (C2105.m6981("ۤ᩵") ^ i11) * (-7);
                    i = ((m6981 ^ i10) * 19297) ^ 1618985102;
                    i2 = 1597296559;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case -830338761:
                case -571131282:
                    C2520.m8026();
                    sb = sb2;
                    str2 = str4;
                    m6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                    i = ((m6981 ^ i11) * (-25791)) ^ (-536667320);
                    i2 = 2030672382;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case -716041611:
                case 1342968021:
                    sb = sb2;
                    str2 = str4;
                    if (C4075.m12248(abstractC15440)) {
                        m6981 = C0630.m2566("ܶۚ") ^ i11;
                        i = ((m6981 ^ i10) * (-14207)) ^ 1388235870;
                        i2 = 394760104;
                    } else {
                        m6981 = (i10 - C2105.m6981("᩵۬")) * (-119);
                        i = ((m6981 ^ i11) * 3823) ^ (-1941080660);
                        i2 = -1143427140;
                    }
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case -535167356:
                case 2076807648:
                    sb = sb2;
                    str2 = str4;
                    i6 = 44785;
                    m6981 = (i11 - C2105.m6981("ᩳ᩷")) * 5;
                    i = ((m6981 ^ i10) * 12265) ^ 1244196870;
                    i2 = -1896729490;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case -386744348:
                case 1154194297:
                    str3 = str4;
                    it = RunnableC1937.m6374(abstractC15440.mo23549(true));
                    int m698142 = (i10 - C2105.m6981("۠֡")) * 81;
                    Iterator it22 = it;
                    int i152 = ((m698142 ^ i11) * (-17851)) ^ (-1984172762);
                    i13 = m698142 ^ (-1429765960);
                    str4 = str3;
                    i12 = i152;
                    it = it22;
                case -334612967:
                case 1371692052:
                    if (C1773.m5910(it)) {
                        int m25663 = C0630.m2566("᩹ۚ") ^ i11;
                        str2 = str4;
                        i3 = ((m25663 ^ i10) * (-25475)) ^ (-59770569);
                        i13 = m25663 ^ 463842193;
                        String str62222 = str2;
                        i12 = i3;
                        str4 = str62222;
                    } else {
                        String str7 = str4;
                        int m69815 = C2105.m6981("ۢܶ") ^ i11;
                        int i16 = ((m69815 ^ i10) * 24863) ^ 1812286619;
                        i13 = m69815 ^ (-194812904);
                        str4 = str7;
                        i12 = i16;
                    }
                case 74759444:
                case 1187851068:
                    sb = sb2;
                    str2 = str4;
                    if (C7106.f21815 == 0) {
                        m6981 = C0630.m2566("֨۠") ^ i11;
                        i = ((m6981 ^ i10) * 7365) ^ 1669879510;
                        i2 = -610649560;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    }
                    m6981 = (C2105.m6981("ۤ᩵") ^ i11) * (-7);
                    i = ((m6981 ^ i10) * 19297) ^ 1618985102;
                    i2 = 1597296559;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case 169340004:
                case 803303214:
                    C3245.m9923(sb2, C3746.m11357(sArr2, i7, i8, i6));
                    str4 = C0422.m1959(sb2);
                    if (C1005.f3721) {
                        int m25664 = C0630.m2566("᩻ۡ") ^ i11;
                        sb = sb2;
                        i = ((m25664 ^ i10) * (-11089)) ^ 885580677;
                        i13 = m25664 ^ (-1679034692);
                        i12 = i;
                        sb2 = sb;
                    } else {
                        int m6981322 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((m6981322 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ m6981322;
                        c3545 = null;
                        c89182 = c8918;
                    }
                case 339956681:
                case 1695075043:
                    sb = sb2;
                    str2 = str4;
                    if (i5 - (54776 * s) >= 0) {
                        m6981 = (C0630.m2566("ܳ֫") + i10) * q.h;
                        i = ((m6981 ^ i11) * 27055) ^ 1884723752;
                        i2 = -1737464637;
                    } else {
                        m6981 = (i11 - C0630.m2566("ۙܺ")) * 95;
                        i = ((m6981 ^ i10) * 24971) ^ (-1514937163);
                        i2 = 768772282;
                    }
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
                case 421083154:
                case 725675663:
                    break;
                case 440844466:
                case 2078391464:
                    C4117.m12364();
                    if (C0237.f1507 != 0) {
                        sb = sb2;
                        str2 = str4;
                        m6981 = (i10 - C0630.m2566("ᩳۙ")) * (-19);
                        i = ((m6981 ^ i11) * (-25791)) ^ (-536667320);
                        i2 = 2030672382;
                        i13 = m6981 ^ i2;
                        str4 = str2;
                        c89182 = c8918;
                        i12 = i;
                        sb2 = sb;
                    } else {
                        int m69813222 = C2105.m6981("ۨܶ") ^ i11;
                        i12 = ((m69813222 ^ i10) * (-16461)) ^ (-615555796);
                        i13 = 1645810742 ^ m69813222;
                        c3545 = null;
                        c89182 = c8918;
                    }
                default:
                    sb = sb2;
                    str2 = str4;
                    i6 = 15922;
                    m6981 = (i11 - C2105.m6981("ᩳ᩷")) * 5;
                    i = ((m6981 ^ i10) * 12265) ^ 1244196870;
                    i2 = -1896729490;
                    i13 = m6981 ^ i2;
                    str4 = str2;
                    c89182 = c8918;
                    i12 = i;
                    sb2 = sb;
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29940(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, AbstractC15440 abstractC154403, AbstractC15440 abstractC154404) {
        int m6981;
        int i;
        int i2;
        ArrayList arrayList;
        boolean z;
        C8918 c8918;
        ByteArrayOutputStream byteArrayOutputStream;
        short[] sArr;
        short[] sArr2;
        int i3;
        int i4;
        short[] sArr3;
        short[] sArr4;
        int i5;
        PrintStream printStream;
        int m69812;
        int i6;
        int i7;
        int m69813;
        int i8;
        int i9;
        boolean z2;
        C8918 c89182;
        ByteArrayOutputStream byteArrayOutputStream2;
        short[] sArr5;
        short[] sArr6;
        int i10;
        int i11;
        short[] sArr7;
        short[] sArr8;
        int i12;
        PrintStream printStream2;
        int i13;
        int i14;
        short[] sArr9;
        short[] sArr10;
        int i15;
        int m69814;
        int i16;
        short[] sArr11;
        int i17;
        C8918 c89183;
        ByteArrayOutputStream byteArrayOutputStream3;
        C8918 c89184;
        int i18;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        int i19;
        int m69815;
        int i20;
        int i21;
        int m2566;
        int i22;
        int i23;
        int i24;
        int i25;
        C8918 c89185;
        int i26 = 327874048;
        int i27 = C4117.f13076;
        int i28 = C4075.f12947;
        int m69816 = (C2105.m6981("᩷᩷") ^ i27) * 31;
        int i29 = ((m69816 ^ i28) * 13915) ^ 2109183101;
        int i30 = m69816 ^ (-2122181049);
        String str = null;
        String[] strArr = null;
        Iterator it = null;
        C8918 c89186 = null;
        Iterator it2 = null;
        short[] sArr12 = null;
        short[] sArr13 = null;
        short[] sArr14 = null;
        short[] sArr15 = null;
        ArrayList arrayList2 = null;
        PrintStream printStream3 = null;
        int i31 = 0;
        short s = 0;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        File file = null;
        ByteArrayOutputStream byteArrayOutputStream6 = null;
        StringBuilder sb = null;
        StringBuilder sb2 = null;
        int i35 = 0;
        boolean z3 = false;
        String str2 = null;
        AbstractC15440 abstractC154405 = null;
        String str3 = null;
        int i36 = 0;
        while (true) {
            i26 = i30 ^ (i29 & (((i26 ^ i28) * (-25667)) >> 31));
            switch (i26) {
                case -2067185874:
                case -1989578152:
                    c89184 = c89186;
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    str3 = "";
                    if (new C12302(new PrintWriter(printStream3, z3)).m29850(strArr).f38941 == 0) {
                        m2566 = C2105.m6981("ۡۡ") ^ i28;
                        i22 = ((m2566 ^ i27) * 32113) ^ 1909533980;
                        i23 = -1120909599;
                    } else {
                        m2566 = C0630.m2566("᩸ܿ") ^ i28;
                        i22 = ((m2566 ^ i27) * 18031) ^ 987629377;
                        i23 = -1759855960;
                    }
                    i30 = m2566 ^ i23;
                    i29 = i22;
                    c89186 = c89184;
                    byteArrayOutputStream6 = byteArrayOutputStream5;
                case -2043920720:
                case -1185964671:
                    AbstractC2021.m6561(c89186);
                    return;
                case -2035254872:
                case 741401983:
                    c89184 = c89186;
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    int i37 = i31;
                    if (i36 < i37) {
                        m69815 = C0630.m2566("ۙܰ") ^ i27;
                        i20 = ((m69815 ^ i28) * (-17717)) ^ 2080830261;
                        i21 = -1641815461;
                    } else {
                        m69815 = C2105.m6981("ܺ᩻") ^ i28;
                        i20 = ((m69815 ^ i27) * (-6821)) ^ (-1582762436);
                        i21 = 210949239;
                    }
                    i30 = m69815 ^ i21;
                    i31 = i37;
                    i29 = i20;
                    c89186 = c89184;
                    byteArrayOutputStream6 = byteArrayOutputStream5;
                case -2034419987:
                case 1400110771:
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    sArr6 = sArr12;
                    i10 = i32;
                    i11 = i33;
                    sArr7 = sArr13;
                    sArr8 = sArr14;
                    i12 = i34;
                    printStream2 = printStream3;
                    i35 = 15835;
                    int m69817 = (C2105.m6981("᩸ᩳ") + i27) * 79;
                    i13 = ((m69817 ^ i28) * (-28385)) ^ (-1685706070);
                    i14 = m69817 ^ 519008092;
                    sArr13 = sArr7;
                    i32 = i10;
                    i33 = i11;
                    c89186 = c89182;
                    byteArrayOutputStream6 = byteArrayOutputStream2;
                    z3 = z2;
                    sArr14 = sArr8;
                    i34 = i12;
                    sArr12 = sArr6;
                    i30 = i14;
                    i29 = i13;
                    printStream3 = printStream2;
                    sArr15 = sArr5;
                case -2009533592:
                case -1363035947:
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    printStream2 = printStream3;
                    C1916.m6307(arrayList2, file.getPath());
                    z2 = z3;
                    C1916.m6307(arrayList2, C4117.m12355(f36935, 83, 8, i35));
                    if (C4117.m12364() != 0) {
                        int m69818 = (C2105.m6981("᩷ۡ") ^ i28) * 33;
                        i30 = m69818 ^ (-2068391064);
                        i29 = ((m69818 ^ i27) * 15585) ^ 186608101;
                        printStream3 = printStream2;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr15 = sArr5;
                    } else {
                        C7106.m19117(arrayList2, new File(C4925.m14322(), C2167.m7159(f36935, 91, 9, i35)).getPath());
                        sArr11 = f36935;
                        if (C1916.f6442) {
                            int m25662 = C0630.m2566("᩷ܿ") ^ i27;
                            int i38 = ((m25662 ^ i28) * 10535) ^ 309356125;
                            i30 = m25662 ^ 1600266530;
                            printStream3 = printStream2;
                            c89186 = c89182;
                            byteArrayOutputStream6 = byteArrayOutputStream2;
                            sArr15 = sArr11;
                            i29 = i38;
                            z3 = z2;
                        } else {
                            sArr9 = sArr13;
                            sArr10 = sArr14;
                            i15 = i34;
                            int m69819 = (C2105.m6981("֨֨") + i27) * (-103);
                            i25 = ((m69819 ^ i28) * (-4077)) ^ 2012993829;
                            sArr13 = sArr9;
                            byteArrayOutputStream6 = byteArrayOutputStream2;
                            z3 = z2;
                            sArr14 = sArr10;
                            i34 = i15;
                            i30 = m69819 ^ (-1944819187);
                            printStream3 = printStream2;
                            sArr15 = sArr11;
                            i29 = i25;
                            c89186 = c89182;
                        }
                    }
                case -2006451008:
                case -780435379:
                    c89184 = c89186;
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    i19 = i31;
                    C7106.m19117(arrayList2, C0483.m2128(f36935, IShizukuService.Stub.TRANSACTION_attachUserService, 3, i35));
                    sb = new StringBuilder();
                    it = C1047.m3596(abstractC154402.mo23549(z3));
                    int m25663 = (i28 - C0630.m2566("ܶۘ")) * (-43);
                    i24 = ((m25663 ^ i27) * 8961) ^ (-1623615439);
                    i30 = m25663 ^ 640057043;
                    i31 = i19;
                    i29 = i24;
                    c89186 = c89184;
                    byteArrayOutputStream6 = byteArrayOutputStream5;
                case -1967495503:
                case -550330645:
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    i10 = i32;
                    i11 = i33;
                    sArr8 = sArr14;
                    i12 = i34;
                    printStream2 = printStream3;
                    short[] sArr16 = sArr12;
                    C7106.m19117(arrayList2, C4075.m12252(sArr16, i10, i11, i35));
                    sArr6 = sArr16;
                    C1916.m6307(arrayList2, RunnableC1937.m6385(f36935, 25, 5, i35));
                    sArr13 = f36935;
                    if (C2520.f8000 >= 0) {
                        sArr14 = sArr8;
                        i34 = i12;
                        int m698110 = (i27 - C2105.m6981("ۛ᩵")) * (-109);
                        i30 = m698110 ^ 70912977;
                        i29 = ((m698110 ^ i28) * (-583)) ^ 335159040;
                        i32 = i10;
                        i33 = i11;
                        printStream3 = printStream2;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr12 = sArr6;
                        sArr15 = sArr5;
                    } else {
                        int m698111 = C2105.m6981("᩺ۧ") ^ i28;
                        i13 = ((m698111 ^ i27) * (-23579)) ^ (-1602801063);
                        i14 = m698111 ^ (-1829777950);
                        i32 = i10;
                        i33 = i11;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr8;
                        i34 = i12;
                        sArr12 = sArr6;
                        i30 = i14;
                        i29 = i13;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    }
                case -1931680640:
                case -1179850327:
                    C2520.m8026();
                    C4263.m12819();
                    return;
                case -1860880758:
                case 401319866:
                    C0382.m1848();
                    if (C1773.f6144 <= 0) {
                        arrayList = arrayList2;
                        z = z3;
                        c8918 = c89186;
                        byteArrayOutputStream = byteArrayOutputStream6;
                        sArr = sArr15;
                        sArr2 = sArr12;
                        i3 = i32;
                        i4 = i33;
                        sArr3 = sArr13;
                        sArr4 = sArr14;
                        i5 = i34;
                        printStream = printStream3;
                        m69812 = (i27 - C2105.m6981("ۙܳ")) * 77;
                        i6 = ((m69812 ^ i28) * 32041) ^ 824565712;
                        i7 = -1765972983;
                        int i39 = m69812 ^ i7;
                        sArr13 = sArr3;
                        i32 = i3;
                        i33 = i4;
                        printStream3 = printStream;
                        c89186 = c8918;
                        byteArrayOutputStream6 = byteArrayOutputStream;
                        z3 = z;
                        sArr14 = sArr4;
                        i34 = i5;
                        sArr12 = sArr2;
                        i30 = i39;
                        i29 = i6;
                        sArr15 = sArr;
                        arrayList2 = arrayList;
                    } else {
                        z2 = z3;
                        c89182 = c89186;
                        byteArrayOutputStream2 = byteArrayOutputStream6;
                        sArr5 = sArr15;
                        sArr9 = sArr13;
                        sArr10 = sArr14;
                        i15 = i34;
                        printStream2 = printStream3;
                        m69814 = (i28 - C0630.m2566("ۛ᩶")) * 21;
                        i13 = ((m69814 ^ i27) * 9345) ^ 1100840457;
                        i16 = -1877434233;
                        i14 = m69814 ^ i16;
                        sArr13 = sArr9;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = i14;
                        i29 = i13;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    }
                case -1848232940:
                case 448259991:
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    sArr10 = sArr14;
                    i15 = i34;
                    printStream2 = printStream3;
                    sArr9 = sArr13;
                    C1916.m6307(arrayList2, C0050.m948(sArr9, 30, 7, i35));
                    String m5177 = C1504.m5177(f36935, 37, 3, i35);
                    C1916.m6307(arrayList2, m5177);
                    if (C1420.f5096 <= 0) {
                        str = m5177;
                        m69814 = (i28 - C0630.m2566("ۛ᩶")) * 21;
                        i13 = ((m69814 ^ i27) * 9345) ^ 1100840457;
                        i16 = -1877434233;
                        i14 = m69814 ^ i16;
                        sArr13 = sArr9;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = i14;
                        i29 = i13;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    } else {
                        int m698112 = (C2105.m6981("ۙ᩻") ^ i28) * 115;
                        int i40 = ((m698112 ^ i27) * (-31217)) ^ (-2070727118);
                        i17 = m698112 ^ 778634863;
                        str = m5177;
                        sArr13 = sArr9;
                        i29 = i40;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = i17;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    }
                case -1735550526:
                case -1692199086:
                    C7106.m19120();
                    arrayList = arrayList2;
                    z = z3;
                    c8918 = c89186;
                    byteArrayOutputStream = byteArrayOutputStream6;
                    sArr = sArr15;
                    sArr2 = sArr12;
                    i3 = i32;
                    i4 = i33;
                    sArr3 = sArr13;
                    sArr4 = sArr14;
                    i5 = i34;
                    printStream = printStream3;
                    m69812 = (i27 - C2105.m6981("ۙܳ")) * 77;
                    i6 = ((m69812 ^ i28) * 32041) ^ 824565712;
                    i7 = -1765972983;
                    int i392 = m69812 ^ i7;
                    sArr13 = sArr3;
                    i32 = i3;
                    i33 = i4;
                    printStream3 = printStream;
                    c89186 = c8918;
                    byteArrayOutputStream6 = byteArrayOutputStream;
                    z3 = z;
                    sArr14 = sArr4;
                    i34 = i5;
                    sArr12 = sArr2;
                    i30 = i392;
                    i29 = i6;
                    sArr15 = sArr;
                    arrayList2 = arrayList;
                case -1717874141:
                case 1163252060:
                    c89184 = c89186;
                    abstractC154405 = (AbstractC15440) RunnableC1108.m3791(it);
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    if (C3746.m11370(RunnableC1937.m6378(C11340.m28023(abstractC154405)), C0714.m2816(f36935, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 4, i35))) {
                        m2566 = C2105.m6981("ۖᩴ") ^ i27;
                        i22 = ((m2566 ^ i28) * (-3019)) ^ 744266886;
                        i23 = 803488315;
                        i30 = m2566 ^ i23;
                        i29 = i22;
                        c89186 = c89184;
                        byteArrayOutputStream6 = byteArrayOutputStream5;
                    } else {
                        i19 = i31;
                        int m256632 = (i28 - C0630.m2566("ܶۘ")) * (-43);
                        i24 = ((m256632 ^ i27) * 8961) ^ (-1623615439);
                        i30 = m256632 ^ 640057043;
                        i31 = i19;
                        i29 = i24;
                        c89186 = c89184;
                        byteArrayOutputStream6 = byteArrayOutputStream5;
                    }
                case -1307693206:
                case -1242522452:
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    printStream2 = printStream3;
                    short[] sArr17 = sArr14;
                    int i41 = i34;
                    C1916.m6307(arrayList2, C1294.m4373(sArr17, i41, 14, i35));
                    sArr10 = sArr17;
                    i15 = i41;
                    File file2 = new File(C4925.m14322(), C0422.m1955(f36935, 61, 22, i35));
                    if (C0422.f1886 <= 0) {
                        file = file2;
                        sArr9 = sArr13;
                        m69814 = (i28 - C0630.m2566("ۛ᩶")) * 21;
                        i13 = ((m69814 ^ i27) * 9345) ^ 1100840457;
                        i16 = -1877434233;
                        i14 = m69814 ^ i16;
                        sArr13 = sArr9;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = i14;
                        i29 = i13;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    } else {
                        int m698113 = C2105.m6981("ۘᩳ") ^ i28;
                        int i42 = ((m698113 ^ i27) * 27523) ^ 863577105;
                        i17 = m698113 ^ 6491179;
                        file = file2;
                        i29 = i42;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = i17;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    }
                case -1105124206:
                case 1286465434:
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    sArr6 = sArr12;
                    i10 = i32;
                    i11 = i33;
                    sArr7 = sArr13;
                    sArr8 = sArr14;
                    i12 = i34;
                    printStream2 = printStream3;
                    i35 = 30178;
                    int m698172 = (C2105.m6981("᩸ᩳ") + i27) * 79;
                    i13 = ((m698172 ^ i28) * (-28385)) ^ (-1685706070);
                    i14 = m698172 ^ 519008092;
                    sArr13 = sArr7;
                    i32 = i10;
                    i33 = i11;
                    c89186 = c89182;
                    byteArrayOutputStream6 = byteArrayOutputStream2;
                    z3 = z2;
                    sArr14 = sArr8;
                    i34 = i12;
                    sArr12 = sArr6;
                    i30 = i14;
                    i29 = i13;
                    printStream3 = printStream2;
                    sArr15 = sArr5;
                case -1082360666:
                case 1356489513:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        arrayList = arrayList2;
                        z = z3;
                        c8918 = c89186;
                        byteArrayOutputStream = byteArrayOutputStream6;
                        sArr = sArr15;
                        sArr2 = sArr12;
                        i3 = i32;
                        i4 = i33;
                        sArr3 = sArr13;
                        sArr4 = sArr14;
                        i5 = i34;
                        printStream = printStream3;
                        m69812 = (i27 - C2105.m6981("ۙܳ")) * 77;
                        i6 = ((m69812 ^ i28) * 32041) ^ 824565712;
                        i7 = -1765972983;
                        int i3922 = m69812 ^ i7;
                        sArr13 = sArr3;
                        i32 = i3;
                        i33 = i4;
                        printStream3 = printStream;
                        c89186 = c8918;
                        byteArrayOutputStream6 = byteArrayOutputStream;
                        z3 = z;
                        sArr14 = sArr4;
                        i34 = i5;
                        sArr12 = sArr2;
                        i30 = i3922;
                        i29 = i6;
                        sArr15 = sArr;
                        arrayList2 = arrayList;
                    } else {
                        z2 = z3;
                        c89182 = c89186;
                        byteArrayOutputStream2 = byteArrayOutputStream6;
                        sArr11 = sArr15;
                        sArr9 = sArr13;
                        sArr10 = sArr14;
                        i15 = i34;
                        printStream2 = printStream3;
                        int m698192 = (C2105.m6981("֨֨") + i27) * (-103);
                        i25 = ((m698192 ^ i28) * (-4077)) ^ 2012993829;
                        sArr13 = sArr9;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = m698192 ^ (-1944819187);
                        printStream3 = printStream2;
                        sArr15 = sArr11;
                        i29 = i25;
                        c89186 = c89182;
                    }
                case -1045821619:
                case 865040345:
                    m29939((AbstractC15440) C2272.m7513(it2), c89186, str3);
                    c89185 = c89186;
                    int m25664 = (i28 - C0630.m2566("᩵᩷")) * 41;
                    C8918 c89187 = c89185;
                    i29 = ((m25664 ^ i27) * (-15087)) ^ 1135438981;
                    i30 = m25664 ^ (-1195352733);
                    c89186 = c89187;
                case -925952282:
                case -924146805:
                    c89184 = c89186;
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    C3019.m9257(strArr[i36]);
                    i36++;
                    int m698114 = C2105.m6981("ۧ۫") ^ i27;
                    i24 = ((m698114 ^ i28) * 15365) ^ 266639056;
                    i30 = m698114 ^ (-797360149);
                    i29 = i24;
                    c89186 = c89184;
                    byteArrayOutputStream6 = byteArrayOutputStream5;
                case -892845384:
                case 51225310:
                    arrayList = arrayList2;
                    z = z3;
                    c8918 = c89186;
                    byteArrayOutputStream = byteArrayOutputStream6;
                    sArr = sArr15;
                    sArr2 = sArr12;
                    i3 = i32;
                    i4 = i33;
                    sArr3 = sArr13;
                    sArr4 = sArr14;
                    i5 = i34;
                    printStream = printStream3;
                    s = f36935[8];
                    if (C1128.f4106 > 0) {
                        m69812 = (C2105.m6981("ܽۛ") + i28) * (-91);
                        i6 = ((m69812 ^ i27) * 2479) ^ 231757790;
                        i7 = -72684083;
                        int i39222 = m69812 ^ i7;
                        sArr13 = sArr3;
                        i32 = i3;
                        i33 = i4;
                        printStream3 = printStream;
                        c89186 = c8918;
                        byteArrayOutputStream6 = byteArrayOutputStream;
                        z3 = z;
                        sArr14 = sArr4;
                        i34 = i5;
                        sArr12 = sArr2;
                        i30 = i39222;
                        i29 = i6;
                        sArr15 = sArr;
                        arrayList2 = arrayList;
                    }
                    m69812 = (i27 - C2105.m6981("ۙܳ")) * 77;
                    i6 = ((m69812 ^ i28) * 32041) ^ 824565712;
                    i7 = -1765972983;
                    int i392222 = m69812 ^ i7;
                    sArr13 = sArr3;
                    i32 = i3;
                    i33 = i4;
                    printStream3 = printStream;
                    c89186 = c8918;
                    byteArrayOutputStream6 = byteArrayOutputStream;
                    z3 = z;
                    sArr14 = sArr4;
                    i34 = i5;
                    sArr12 = sArr2;
                    i30 = i392222;
                    i29 = i6;
                    sArr15 = sArr;
                    arrayList2 = arrayList;
                case -674007134:
                case 1926757522:
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    sArr9 = sArr13;
                    sArr10 = sArr14;
                    i15 = i34;
                    printStream2 = printStream3;
                    arrayList2 = new ArrayList();
                    C1916.m6307(arrayList2, C5695.m16034(f36935, 9, 7, i35));
                    sArr12 = f36935;
                    i32 = 16;
                    i33 = 9;
                    if (AbstractC2021.f6743 <= 0) {
                        sArr11 = sArr5;
                        int m6981922 = (C2105.m6981("֨֨") + i27) * (-103);
                        i25 = ((m6981922 ^ i28) * (-4077)) ^ 2012993829;
                        sArr13 = sArr9;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = m6981922 ^ (-1944819187);
                        printStream3 = printStream2;
                        sArr15 = sArr11;
                        i29 = i25;
                        c89186 = c89182;
                    } else {
                        m69814 = (C2105.m6981("ܽ᩸") ^ i27) * 37;
                        i13 = ((m69814 ^ i28) * (-19839)) ^ (-999630226);
                        i16 = 27301725;
                        i14 = m69814 ^ i16;
                        sArr13 = sArr9;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = i14;
                        i29 = i13;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    }
                case -641927875:
                case 2044696388:
                    c89184 = c89186;
                    i18 = i31;
                    m29938(abstractC15440, arrayList2);
                    RunnableC3474.m10626(abstractC154403);
                    abstractC154403.mo23546();
                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                    if (C2272.f7362) {
                        int m698115 = C2105.m6981("ܶ᩵") ^ i27;
                        i31 = i18;
                        i29 = ((m698115 ^ i28) * (-21079)) ^ 1714865637;
                        i30 = m698115 ^ 2147098347;
                        byteArrayOutputStream6 = byteArrayOutputStream4;
                        c89186 = c89184;
                        printStream3 = null;
                    } else {
                        PrintStream printStream4 = new PrintStream(byteArrayOutputStream4);
                        strArr = (String[]) arrayList2.toArray(new String[0]);
                        byteArrayOutputStream5 = byteArrayOutputStream4;
                        printStream3 = printStream4;
                        i31 = strArr.length;
                        i36 = 0;
                        int m6981142 = C2105.m6981("ۧ۫") ^ i27;
                        i24 = ((m6981142 ^ i28) * 15365) ^ 266639056;
                        i30 = m6981142 ^ (-797360149);
                        i29 = i24;
                        c89186 = c89184;
                        byteArrayOutputStream6 = byteArrayOutputStream5;
                    }
                case -583977629:
                case -34008149:
                    C1420.m4905(sb2, C1711.m5726(f36935, 114, 1, i35));
                    throw new IOException(RunnableC0588.m2443(str2, C0422.m1959(sb2), str3));
                case -496357491:
                case 862584279:
                    C1420.m4905(sb, C4117.m12359(abstractC154405));
                    c89184 = c89186;
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    i19 = i31;
                    int m2566322 = (i28 - C0630.m2566("ܶۘ")) * (-43);
                    i24 = ((m2566322 ^ i27) * 8961) ^ (-1623615439);
                    i30 = m2566322 ^ 640057043;
                    i31 = i19;
                    i29 = i24;
                    c89186 = c89184;
                    byteArrayOutputStream6 = byteArrayOutputStream5;
                case -436478588:
                case 1723643352:
                    c89183 = c89186;
                    byteArrayOutputStream3 = byteArrayOutputStream6;
                    C7106.m19117(arrayList2, C0050.m947(sb));
                    sArr5 = sArr15;
                    int m25665 = C0630.m2566("۫ۡ") ^ i28;
                    i30 = m25665 ^ (-242983990);
                    i29 = ((m25665 ^ i27) * (-6729)) ^ 199632438;
                    printStream3 = printStream3;
                    c89186 = c89183;
                    byteArrayOutputStream6 = byteArrayOutputStream3;
                    sArr15 = sArr5;
                case -134523414:
                case 896240409:
                    c89185 = new C8918(abstractC154404);
                    it2 = RunnableC1937.m6374(abstractC154403.mo23549(z3));
                    int m256642 = (i28 - C0630.m2566("᩵᩷")) * 41;
                    C8918 c891872 = c89185;
                    i29 = ((m256642 ^ i27) * (-15087)) ^ 1135438981;
                    i30 = m256642 ^ (-1195352733);
                    c89186 = c891872;
                case 146074758:
                case 1744139217:
                    C1294.m4372();
                    if (C1047.f3863 >= 0) {
                        z2 = z3;
                        c89182 = c89186;
                        byteArrayOutputStream2 = byteArrayOutputStream6;
                        sArr5 = sArr15;
                        printStream2 = printStream3;
                        int m698182 = (C2105.m6981("᩷ۡ") ^ i28) * 33;
                        i30 = m698182 ^ (-2068391064);
                        i29 = ((m698182 ^ i27) * 15585) ^ 186608101;
                        printStream3 = printStream2;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr15 = sArr5;
                    } else {
                        m6981 = (C2105.m6981("ۡܺ") + i28) * 67;
                        i = ((m6981 ^ i27) * (-16697)) ^ 828603219;
                        i2 = -34135700;
                        i30 = m6981 ^ i2;
                        i29 = i;
                    }
                case 162037805:
                case 643611057:
                    c89183 = c89186;
                    byteArrayOutputStream3 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    C1916.m6307(arrayList2, C2167.m7159(sArr5, 100, 2, i35));
                    C7106.m19117(arrayList2, C2958.m9025(abstractC154403));
                    if (C3245.m9926(abstractC154402)) {
                        int m25666 = C0630.m2566("ۛۚ") ^ i27;
                        i30 = m25666 ^ (-558973640);
                        i29 = ((m25666 ^ i28) * (-6959)) ^ (-306997587);
                        sArr15 = sArr5;
                        c89186 = c89183;
                        byteArrayOutputStream6 = byteArrayOutputStream3;
                        z3 = true;
                    } else {
                        z3 = true;
                        int m256652 = C0630.m2566("۫ۡ") ^ i28;
                        i30 = m256652 ^ (-242983990);
                        i29 = ((m256652 ^ i27) * (-6729)) ^ 199632438;
                        printStream3 = printStream3;
                        c89186 = c89183;
                        byteArrayOutputStream6 = byteArrayOutputStream3;
                        sArr15 = sArr5;
                    }
                case 379878516:
                case 1866112705:
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr5 = sArr15;
                    printStream2 = printStream3;
                    C1916.m6307(arrayList2, C1711.m5726(f36935, 40, 7, i35));
                    String str4 = str;
                    C7106.m19117(arrayList2, str4);
                    sArr14 = f36935;
                    i34 = 47;
                    if (C1711.m5736() <= 0) {
                        str = str4;
                        sArr6 = sArr12;
                        i10 = i32;
                        i11 = i33;
                        int m6981102 = (i27 - C2105.m6981("ۛ᩵")) * (-109);
                        i30 = m6981102 ^ 70912977;
                        i29 = ((m6981102 ^ i28) * (-583)) ^ 335159040;
                        i32 = i10;
                        i33 = i11;
                        printStream3 = printStream2;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr12 = sArr6;
                        sArr15 = sArr5;
                    } else {
                        int m25667 = (i27 - C0630.m2566("ۡۗ")) * 19;
                        i30 = m25667 ^ (-988366737);
                        str = str4;
                        i29 = ((m25667 ^ i28) * (-901)) ^ (-1981111233);
                        printStream3 = printStream2;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr15 = sArr5;
                    }
                case 524456119:
                case 1927379006:
                    str2 = byteArrayOutputStream6.toString(C5695.m16034(f36935, 109, 5, i35));
                    sb2 = new StringBuilder();
                    C3245.m9923(sb2, C2958.m9025(abstractC15440));
                    if (C4616.f14690 > 0) {
                        int m698116 = (C2105.m6981("ۘۢ") ^ i27) * (-7);
                        c89182 = c89186;
                        i25 = ((m698116 ^ i28) * (-10467)) ^ (-489014527);
                        i30 = m698116 ^ 1569073134;
                        i29 = i25;
                        c89186 = c89182;
                    }
                    z2 = z3;
                    c89182 = c89186;
                    byteArrayOutputStream2 = byteArrayOutputStream6;
                    sArr11 = sArr15;
                    sArr9 = sArr13;
                    sArr10 = sArr14;
                    i15 = i34;
                    printStream2 = printStream3;
                    int m69819222 = (C2105.m6981("֨֨") + i27) * (-103);
                    i25 = ((m69819222 ^ i28) * (-4077)) ^ 2012993829;
                    sArr13 = sArr9;
                    byteArrayOutputStream6 = byteArrayOutputStream2;
                    z3 = z2;
                    sArr14 = sArr10;
                    i34 = i15;
                    i30 = m69819222 ^ (-1944819187);
                    printStream3 = printStream2;
                    sArr15 = sArr11;
                    i29 = i25;
                    c89186 = c89182;
                case 691240371:
                case 1015787222:
                    C2105.m6982();
                    if (C5695.f17556 >= 0) {
                        arrayList = arrayList2;
                        z = z3;
                        c8918 = c89186;
                        byteArrayOutputStream = byteArrayOutputStream6;
                        sArr = sArr15;
                        sArr2 = sArr12;
                        i3 = i32;
                        i4 = i33;
                        sArr3 = sArr13;
                        sArr4 = sArr14;
                        i5 = i34;
                        printStream = printStream3;
                        m69812 = (i27 - C2105.m6981("ۙܳ")) * 77;
                        i6 = ((m69812 ^ i28) * 32041) ^ 824565712;
                        i7 = -1765972983;
                        int i3922222 = m69812 ^ i7;
                        sArr13 = sArr3;
                        i32 = i3;
                        i33 = i4;
                        printStream3 = printStream;
                        c89186 = c8918;
                        byteArrayOutputStream6 = byteArrayOutputStream;
                        z3 = z;
                        sArr14 = sArr4;
                        i34 = i5;
                        sArr12 = sArr2;
                        i30 = i3922222;
                        i29 = i6;
                        sArr15 = sArr;
                        arrayList2 = arrayList;
                    } else {
                        z2 = z3;
                        c89182 = c89186;
                        byteArrayOutputStream2 = byteArrayOutputStream6;
                        sArr5 = sArr15;
                        printStream2 = printStream3;
                        int m6981822 = (C2105.m6981("᩷ۡ") ^ i28) * 33;
                        i30 = m6981822 ^ (-2068391064);
                        i29 = ((m6981822 ^ i27) * 15585) ^ 186608101;
                        printStream3 = printStream2;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr15 = sArr5;
                    }
                case 1056755197:
                case 1292218693:
                    c89184 = c89186;
                    byteArrayOutputStream5 = byteArrayOutputStream6;
                    if (C1773.m5910(it)) {
                        m2566 = (C2105.m6981("֫ܶ") + i27) * (-107);
                        i22 = ((m2566 ^ i28) * 20799) ^ 19388193;
                        i23 = -63293786;
                    } else {
                        m2566 = (i28 - C0630.m2566("ۚ᩵")) * 25;
                        i22 = ((m2566 ^ i27) * 28335) ^ (-1077891054);
                        i23 = -1254705359;
                    }
                    i30 = m2566 ^ i23;
                    i29 = i22;
                    c89186 = c89184;
                    byteArrayOutputStream6 = byteArrayOutputStream5;
                case 1308130911:
                case 1493723904:
                    if (ServiceConnectionC3453.m10564() > 0) {
                        z2 = z3;
                        c89182 = c89186;
                        byteArrayOutputStream2 = byteArrayOutputStream6;
                        sArr5 = sArr15;
                        sArr9 = sArr13;
                        sArr10 = sArr14;
                        i15 = i34;
                        printStream2 = printStream3;
                        m69814 = (i28 - C0630.m2566("ۛ᩶")) * 21;
                        i13 = ((m69814 ^ i27) * 9345) ^ 1100840457;
                        i16 = -1877434233;
                        i14 = m69814 ^ i16;
                        sArr13 = sArr9;
                        c89186 = c89182;
                        byteArrayOutputStream6 = byteArrayOutputStream2;
                        z3 = z2;
                        sArr14 = sArr10;
                        i34 = i15;
                        i30 = i14;
                        i29 = i13;
                        printStream3 = printStream2;
                        sArr15 = sArr5;
                    } else {
                        c89184 = c89186;
                        byteArrayOutputStream4 = byteArrayOutputStream6;
                        i18 = i31;
                        int m6981152 = C2105.m6981("ܶ᩵") ^ i27;
                        i31 = i18;
                        i29 = ((m6981152 ^ i28) * (-21079)) ^ 1714865637;
                        i30 = m6981152 ^ 2147098347;
                        byteArrayOutputStream6 = byteArrayOutputStream4;
                        c89186 = c89184;
                        printStream3 = null;
                    }
                case 1394695249:
                case 1859002053:
                    if (C1773.m5910(it2)) {
                        m6981 = C2105.m6981("ܿ᩵") ^ i28;
                        i = ((m6981 ^ i27) * (-27855)) ^ (-1307590771);
                        i2 = 1240591747;
                    } else {
                        m6981 = C0630.m2566("ۡܳ") ^ i27;
                        i = ((m6981 ^ i28) * 14527) ^ 760899970;
                        i2 = -790267803;
                    }
                    i30 = m6981 ^ i2;
                    i29 = i;
                case 1658898833:
                case 2033006274:
                    if (C0237.m1493(sb) > 0) {
                        m6981 = (C2105.m6981("֫ۨ") + i28) * 61;
                        i = ((m6981 ^ i27) * (-22389)) ^ (-1787128002);
                        i2 = -1662699278;
                        i30 = m6981 ^ i2;
                        i29 = i;
                    }
                    m6981 = (C0630.m2566("֡۫") + i27) * (-61);
                    i = ((m6981 ^ i28) * (-30383)) ^ 719714497;
                    i2 = 1654855204;
                    i30 = m6981 ^ i2;
                    i29 = i;
                case 1919697050:
                case 2095356131:
                    boolean z4 = z3;
                    C8918 c89188 = c89186;
                    ByteArrayOutputStream byteArrayOutputStream7 = byteArrayOutputStream6;
                    sArr = sArr15;
                    short[] sArr18 = sArr12;
                    int i43 = i32;
                    int i44 = i33;
                    short[] sArr19 = sArr13;
                    short[] sArr20 = sArr14;
                    int i45 = i34;
                    PrintStream printStream5 = printStream3;
                    short s2 = s;
                    int i46 = s2 + 3815;
                    arrayList = arrayList2;
                    if ((s2 * 15260) - (i46 * i46) <= 0) {
                        m69813 = C0630.m2566("ۡۖ") ^ i27;
                        i8 = ((m69813 ^ i28) * 31659) ^ 772708752;
                        i9 = 96122881;
                    } else {
                        m69813 = C2105.m6981("۟ۧ") ^ i28;
                        i8 = ((m69813 ^ i27) * 17003) ^ 1298292245;
                        i9 = -990499414;
                    }
                    int i47 = m69813 ^ i9;
                    s = s2;
                    i29 = i8;
                    sArr13 = sArr19;
                    i32 = i43;
                    i33 = i44;
                    printStream3 = printStream5;
                    c89186 = c89188;
                    byteArrayOutputStream6 = byteArrayOutputStream7;
                    z3 = z4;
                    sArr14 = sArr20;
                    i34 = i45;
                    sArr12 = sArr18;
                    i30 = i47;
                    sArr15 = sArr;
                    arrayList2 = arrayList;
                default:
                    C2105.m6979(sb, ':');
                    m6981 = (C0630.m2566("֡۫") + i27) * (-61);
                    i = ((m6981 ^ i28) * (-30383)) ^ 719714497;
                    i2 = 1654855204;
                    i30 = m6981 ^ i2;
                    i29 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (l.C2126.m7040() == false) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C1323 m29937(java.lang.CharSequence r20) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12334.m29937(java.lang.CharSequence):l.֨᩵۠");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29938(AbstractC15440 abstractC15440, ArrayList arrayList) {
        int i;
        int m2566;
        int i2;
        int m25662;
        int i3;
        int i4;
        ArrayList arrayList2 = arrayList;
        AbstractC15440 abstractC154402 = null;
        String str = null;
        short[] sArr = null;
        char c = 0;
        short s = 0;
        short s2 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        short[] sArr2 = null;
        int i9 = 0;
        int i10 = -797620763;
        int i11 = C0050.f910;
        int i12 = C4616.f14690;
        int m25663 = C0630.m2566("ᩳۘ") ^ i11;
        int i13 = ((m25663 ^ i12) * (-31557)) ^ (-2117117273);
        int i14 = m25663 ^ 1847889072;
        Iterator it = null;
        while (true) {
            int i15 = i14 ^ (i13 & (((i10 ^ i12) * 24561) >> 31));
            switch (i15) {
                case -2062523128:
                case 1840079867:
                    i = i15;
                    i8 = 65378;
                    m2566 = (C0630.m2566("᩸ۡ") + i12) * 83;
                    i13 = ((m2566 ^ i11) * (-29687)) ^ (-1818037629);
                    i2 = -742351617;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case -2024615818:
                case -324810151:
                    C0964.m3413();
                    if (C3746.f11829 <= 0) {
                        i = i15;
                        m2566 = (i12 - C2105.m6981("ۨۨ")) * (-17);
                        i13 = ((m2566 ^ i11) * (-1107)) ^ 48020732;
                        i2 = -1095206903;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        m25662 = C0630.m2566("ܽۜ") ^ i12;
                        i = i15;
                        i3 = ((m25662 ^ i11) * 9823) ^ (-2120277620);
                        i4 = -1990135913;
                        int i16 = i;
                        i14 = m25662 ^ i4;
                        i13 = i3;
                        i10 = i16;
                    }
                case -1921831638:
                case -1482953159:
                    i = i15;
                    i8 = 56000;
                    m2566 = (C0630.m2566("᩸ۡ") + i12) * 83;
                    i13 = ((m2566 ^ i11) * (-29687)) ^ (-1818037629);
                    i2 = -742351617;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case -1836930242:
                case -596729245:
                    i = i15;
                    if (C0422.f1886 > 0) {
                        m2566 = C0630.m2566("ۢۗ") ^ i11;
                        i13 = ((m2566 ^ i12) * 4479) ^ (-1782881112);
                        i2 = -1946850109;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    m2566 = (i12 - C2105.m6981("ۨۨ")) * (-17);
                    i13 = ((m2566 ^ i11) * (-1107)) ^ 48020732;
                    i2 = -1095206903;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case -1744947993:
                case 119602513:
                    i = i15;
                    C1916.m6307(arrayList2, C2958.m9025(abstractC154402));
                    int m6981 = (i11 - C2105.m6981("ۛۜ")) * (-75);
                    i10 = i;
                    i14 = m6981 ^ 1220402509;
                    i13 = ((m6981 ^ i12) * 28739) ^ 1314083448;
                    arrayList2 = arrayList;
                case -1735238819:
                case 665808903:
                    i = i15;
                    s = sArr[c];
                    s2 = 30070;
                    if (C0714.f2697 < 0) {
                        m2566 = C0630.m2566("֫ۢ") ^ i12;
                        i13 = ((m2566 ^ i11) * 20099) ^ (-610938945);
                        i2 = 1317174403;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    m2566 = (i11 - C0630.m2566("ۗ۫")) * (-5);
                    i13 = ((m2566 ^ i12) * 27875) ^ 590594295;
                    i2 = -225457380;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case -1344547224:
                case 1155965224:
                    i = i15;
                    if (C3911.m11924() > 0) {
                        m2566 = (i12 - C2105.m6981("ۨۨ")) * (-17);
                        i13 = ((m2566 ^ i11) * (-1107)) ^ 48020732;
                        i2 = -1095206903;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        m25662 = (C0630.m2566("ܺۘ") + i11) * 93;
                        i3 = ((m25662 ^ i12) * (-13491)) ^ 1272234380;
                        i4 = -1943848853;
                        int i162 = i;
                        i14 = m25662 ^ i4;
                        i13 = i3;
                        i10 = i162;
                    }
                case -1301790761:
                case 2102545460:
                    i = i15;
                    str = RunnableC1937.m6378(C11340.m28023(abstractC154402));
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (i12 - C2105.m6981("ۨۨ")) * (-17);
                        i13 = ((m2566 ^ i11) * (-1107)) ^ 48020732;
                        i2 = -1095206903;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        m25662 = C2105.m6981("ۜۗ") ^ i11;
                        i3 = ((m25662 ^ i12) * 27547) ^ 913755867;
                        i4 = -647444977;
                        int i1622 = i;
                        i14 = m25662 ^ i4;
                        i13 = i3;
                        i10 = i1622;
                    }
                case -1285722817:
                case 307619793:
                    i = i15;
                    if (C1773.m5910(it)) {
                        m25662 = (i11 - C2105.m6981("ۜᩴ")) * 123;
                        i3 = ((m25662 ^ i12) * (-22163)) ^ 1098110712;
                        i4 = -1234415893;
                    } else {
                        m25662 = C0630.m2566("ۖ֨") ^ i12;
                        i3 = ((m25662 ^ i11) * (-14119)) ^ 78266259;
                        i4 = 908115979;
                    }
                    int i16222 = i;
                    i14 = m25662 ^ i4;
                    i13 = i3;
                    i10 = i16222;
                case -1222727756:
                case 634191935:
                    i = i15;
                    sArr2 = f36935;
                    if (C2126.f7087) {
                        m2566 = C2105.m6981("᩵֨") ^ i12;
                        i13 = ((m2566 ^ i11) * 20279) ^ 2000743111;
                        i2 = -1578485915;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    } else {
                        m25662 = C0630.m2566("ۡܰ") ^ i12;
                        i3 = ((m25662 ^ i11) * 1683) ^ (-342611965);
                        i4 = 1847569407;
                        int i162222 = i;
                        i14 = m25662 ^ i4;
                        i13 = i3;
                        i10 = i162222;
                    }
                case -1163958122:
                case 346211905:
                    i = i15;
                    if ((i6 + i7) - i5 < 0) {
                        m2566 = C0630.m2566("۟᩺") ^ i11;
                        i13 = ((m2566 ^ i12) * 17937) ^ (-1767745309);
                        i2 = 1909907226;
                    } else {
                        m2566 = (C0630.m2566("۫ۨ") ^ i12) * (-35);
                        i13 = ((m2566 ^ i11) * (-32413)) ^ (-884709387);
                        i2 = -641473934;
                    }
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case -1050908212:
                case -1038398350:
                    i = i15;
                    m29938(abstractC154402, arrayList2);
                    int m69812 = (i11 - C2105.m6981("ۛۜ")) * (-75);
                    i10 = i;
                    i14 = m69812 ^ 1220402509;
                    i13 = ((m69812 ^ i12) * 28739) ^ 1314083448;
                    arrayList2 = arrayList;
                case -754667786:
                case 1046326450:
                    i = i15;
                    if (C1128.m3850(str, C0630.m2575(sArr2, i9, 5, i8))) {
                        m25662 = (C0630.m2566("ܶܶ") ^ i11) * (-125);
                        i3 = ((m25662 ^ i12) * 22619) ^ 346014029;
                        i4 = 889854406;
                        int i1622222 = i;
                        i14 = m25662 ^ i4;
                        i13 = i3;
                        i10 = i1622222;
                    } else {
                        int m698122 = (i11 - C2105.m6981("ۛۜ")) * (-75);
                        i10 = i;
                        i14 = m698122 ^ 1220402509;
                        i13 = ((m698122 ^ i12) * 28739) ^ 1314083448;
                        arrayList2 = arrayList;
                    }
                case -752051639:
                case -180484646:
                    C2105.m6982();
                    break;
                case -728859542:
                case 520235583:
                    i = i15;
                    abstractC154402 = (AbstractC15440) C2272.m7513(it);
                    if (ServiceConnectionC3453.m10569(abstractC154402)) {
                        m25662 = C2105.m6981("ۗۘ") ^ i12;
                        i3 = ((m25662 ^ i11) * (-12019)) ^ (-1885605412);
                        i4 = -459257773;
                    } else {
                        m25662 = (C0630.m2566("֡᩶") ^ i12) * 91;
                        i3 = ((m25662 ^ i11) * 6027) ^ 691140695;
                        i4 = 1994971904;
                    }
                    int i16222222 = i;
                    i14 = m25662 ^ i4;
                    i13 = i3;
                    i10 = i16222222;
                case -672754601:
                case 2001776061:
                    i = i15;
                    if (!C3663.f11553) {
                        m2566 = C2105.m6981("۬ܶ") ^ i12;
                        i13 = ((m2566 ^ i11) * 13239) ^ 807821675;
                        i2 = -1013277650;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    m2566 = (i12 - C2105.m6981("ۨۨ")) * (-17);
                    i13 = ((m2566 ^ i11) * (-1107)) ^ 48020732;
                    i2 = -1095206903;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case -554547039:
                case -498761903:
                    if (C0798.f2919) {
                        i = i15;
                        m2566 = C2105.m6981("᩵֨") ^ i12;
                        i13 = ((m2566 ^ i11) * 20279) ^ 2000743111;
                        i2 = -1578485915;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    i = i15;
                    m2566 = (i12 - C2105.m6981("ۨۨ")) * (-17);
                    i13 = ((m2566 ^ i11) * (-1107)) ^ 48020732;
                    i2 = -1095206903;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case -450781404:
                case 1049193784:
                    i = i15;
                    sArr = f36935;
                    if (C4117.f13076 > 0) {
                        m2566 = C2105.m6981("֡ܶ") ^ i11;
                        i13 = ((m2566 ^ i12) * (-14095)) ^ (-1277772365);
                        i2 = -1563536610;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    m2566 = C2105.m6981("᩵֨") ^ i12;
                    i13 = ((m2566 ^ i11) * 20279) ^ 2000743111;
                    i2 = -1578485915;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case 1098024461:
                case 1584135136:
                    i = i15;
                    c = 0;
                    if (C4159.f13567) {
                        m2566 = (C0630.m2566("ۛ֡") ^ i12) * 3;
                        i13 = ((m2566 ^ i11) * 9249) ^ (-757547965);
                        i2 = -324839953;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    m2566 = C2105.m6981("᩵֨") ^ i12;
                    i13 = ((m2566 ^ i11) * 20279) ^ 2000743111;
                    i2 = -1578485915;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case 1147976334:
                case 1205105955:
                    i = i15;
                    C2126.m7040();
                    m2566 = (i12 - C2105.m6981("ۨۨ")) * (-17);
                    i13 = ((m2566 ^ i11) * (-1107)) ^ 48020732;
                    i2 = -1095206903;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case 1218750800:
                case 1463494335:
                    i = i15;
                    i9 = 1;
                    if (!C1504.f5354) {
                        m25662 = (i11 - C0630.m2566("۟ܳ")) * (-115);
                        i3 = ((m25662 ^ i12) * (-13389)) ^ 982627733;
                        i4 = 1362259037;
                        int i162222222 = i;
                        i14 = m25662 ^ i4;
                        i13 = i3;
                        i10 = i162222222;
                    }
                    m25662 = (C0630.m2566("ܺۘ") + i11) * 93;
                    i3 = ((m25662 ^ i12) * (-13491)) ^ 1272234380;
                    i4 = -1943848853;
                    int i1622222222 = i;
                    i14 = m25662 ^ i4;
                    i13 = i3;
                    i10 = i1622222222;
                case 1280387417:
                case 1498731950:
                    i = i15;
                    i7 = 226051225;
                    if (!C1504.f5354) {
                        m2566 = (C2105.m6981("֨ܳ") + i11) * (-97);
                        i13 = ((m2566 ^ i12) * 9833) ^ (-979692307);
                        i2 = -4861060;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    m2566 = (i11 - C0630.m2566("ۗ۫")) * (-5);
                    i13 = ((m2566 ^ i12) * 27875) ^ 590594295;
                    i2 = -225457380;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
                case 1342997303:
                case 1547036596:
                    i = i15;
                    it = C1047.m3596(abstractC15440.mo23549(true));
                    int m6981222 = (i11 - C2105.m6981("ۛۜ")) * (-75);
                    i10 = i;
                    i14 = m6981222 ^ 1220402509;
                    i13 = ((m6981222 ^ i12) * 28739) ^ 1314083448;
                    arrayList2 = arrayList;
                case 1458089535:
                case 1748571348:
                    i = i15;
                    i5 = s * s2;
                    i6 = s * s;
                    if (AbstractC2021.f6743 > 0) {
                        m2566 = C0630.m2566("۬ۘ") ^ i11;
                        i13 = ((m2566 ^ i12) * (-32275)) ^ (-376701396);
                        i2 = -1510926967;
                        i10 = i;
                        i14 = m2566 ^ i2;
                        arrayList2 = arrayList;
                    }
                    m2566 = (i11 - C0630.m2566("ۗ۫")) * (-5);
                    i13 = ((m2566 ^ i12) * 27875) ^ 590594295;
                    i2 = -225457380;
                    i10 = i;
                    i14 = m2566 ^ i2;
                    arrayList2 = arrayList;
            }
            return;
        }
    }
}
