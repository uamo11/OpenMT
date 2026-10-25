package l;

import bin.mt.plus.Features;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: H5AJ */
/* renamed from: l.۫᩷ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12660 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f38134;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f38135;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String[] f38136;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f38137;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final short f38138;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f38139;

    public C12660(C3488 c3488, int i) {
        C21833 c21833;
        int i2 = c3488.f11052;
        c3488.f11052 = i;
        int m10669 = c3488.m10669() - 2;
        this.f38138 = c3488.m10671();
        if (C4899.f15467 != null) {
            Object[] analyze = Features.analyze(c3488.m10670(m10669));
            int i3 = 0;
            byte[] bArr = (byte[]) analyze[0];
            byte[] bArr2 = (byte[]) analyze[1];
            byte[] bArr3 = (byte[]) analyze[2];
            byte[] bArr4 = (byte[]) analyze[3];
            int length = bArr3.length / 10;
            int[] iArr = new int[length];
            int[] iArr2 = new int[length];
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr4);
            int read = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
            String[] strArr = new String[read];
            int i4 = 0;
            while (i4 < read) {
                int read2 = (byteArrayInputStream.read() & 255) | ((byteArrayInputStream.read() & 255) << 8) | ((byteArrayInputStream.read() & 255) << 16) | ((byteArrayInputStream.read() & 255) << 24);
                byte[] bArr5 = new byte[read2];
                byteArrayInputStream.read(bArr5, i3, read2);
                strArr[i4] = new String(bArr5, StandardCharsets.UTF_8);
                i4++;
                i3 = 0;
            }
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArr3);
            for (int i5 = 0; i5 < length; i5++) {
                byteArrayInputStream2.skip(2L);
                iArr[i5] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
                iArr2[i5] = (byteArrayInputStream2.read() & 255) | ((byteArrayInputStream2.read() & 255) << 8) | ((byteArrayInputStream2.read() & 255) << 16) | ((byteArrayInputStream2.read() & 255) << 24);
            }
            c21833 = new C21833(bArr2, bArr, iArr, iArr2, strArr);
        } else {
            c21833 = new C21833(new C22538(c3488.m10670(m10669)));
        }
        this.f38135 = c21833.f69945;
        this.f38134 = c21833.f69944;
        this.f38137 = c21833.f69946;
        this.f38139 = c21833.f69948;
        this.f38136 = c21833.f69947;
        c3488.f11052 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30938(C20422 c20422, boolean z) {
        C13365 c13365 = new C13365(this, c20422, z);
        while (true) {
            int i = c13365.f39983;
            c13365.f39983 = i + 1;
            byte b = this.f38135[i];
            byte[] bArr = this.f38134;
            int[] iArr = this.f38139;
            int[] iArr2 = this.f38137;
            C12660 c12660 = c13365.f39982;
            C11955[] c11955Arr = c13365.f39985;
            C11955[] c11955Arr2 = c13365.f39981;
            C16040 c16040 = c13365.f39984;
            switch (b) {
                case 0:
                    short m32380 = c13365.m32380();
                    C11955 c11955 = (C11955) c16040.m37917();
                    c11955Arr[m32380] = c11955;
                    c11955.f35719 = false;
                    break;
                case 1:
                    C11955 c119552 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29201(c119552);
                    if (!c119552.f35719) {
                        break;
                    } else {
                        c119552.m29198();
                        c13365.f39986 = c119552;
                        break;
                    }
                case 2:
                    int m32378 = c13365.m32378();
                    if (!((C11955) c16040.m37917()).m29191()) {
                        c13365.f39980 = iArr2[m32378];
                        c13365.f39983 = iArr[m32378];
                        break;
                    } else if (c13365.f39986 == null) {
                        C11955 c119553 = (C11955) c16040.m37919();
                        if (!c119553.f35719) {
                            break;
                        } else {
                            c119553.m29198();
                            c13365.f39986 = c119553;
                            break;
                        }
                    } else {
                        c16040.m37919();
                        break;
                    }
                case 3:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c119554 = (C11955) c16040.m37917();
                        c119554.m29196(c119554);
                        break;
                    } else {
                        C11955 c119555 = (C11955) c16040.m37919();
                        C11955 c119556 = c13365.f39986;
                        if (c119556 == null) {
                            c119556 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c119555.m29196(c119556);
                        c16040.m37918(c119556);
                        break;
                    }
                case 4:
                    C11955 c119557 = c13365.f39986;
                    if (c119557 == null) {
                        c119557 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c119558 = (C11955) c16040.m37919();
                    C11955 c119559 = (C11955) c16040.m37919();
                    c119559.m29184(c119558, c119557);
                    c16040.m37918(c119557);
                    if (c119559.f35719) {
                        c119559.m29198();
                        c13365.f39986 = c119559;
                        break;
                    } else if (!c119558.f35719) {
                        break;
                    } else {
                        c119558.m29198();
                        c13365.f39986 = c119558;
                        break;
                    }
                case 5:
                    int m29168 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195510 = c13365.f39986;
                    if (c1195510 == null) {
                        c1195510 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195510.m29154(new long[m29168]);
                    c16040.m37918(c1195510);
                    break;
                case 6:
                    int i2 = c13365.f39980;
                    int i3 = i2 + 1;
                    c13365.f39980 = i3;
                    if (bArr[i2] == 0) {
                        int m46821 = c20422.m46821(new String(bArr, i3, 32));
                        int i4 = c13365.f39980;
                        bArr[i4 - 1] = 1;
                        bArr[i4] = (byte) (m46821 & 255);
                        bArr[i4 + 1] = (byte) ((m46821 >>> 8) & 255);
                        bArr[i4 + 2] = (byte) ((m46821 >>> 16) & 255);
                        bArr[i4 + 3] = (byte) ((m46821 >>> 24) & 255);
                    }
                    c20422.m46822(c13365.m32378());
                    c13365.f39980 += 28;
                    break;
                case 7:
                    int m291682 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195511 = c13365.f39986;
                    if (c1195511 == null) {
                        c1195511 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195511.m29154(new int[m291682]);
                    c16040.m37918(c1195511);
                    break;
                case 8:
                    C11955 c1195512 = c13365.f39986;
                    if (c1195512 == null) {
                        c1195512 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    byte[] bArr2 = c12660.f38134;
                    int i5 = c13365.f39980;
                    c13365.f39980 = i5 + 1;
                    c1195512.m29160(bArr2[i5] != 0);
                    c16040.m37918(c1195512);
                    break;
                case 9:
                    int m291683 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195513 = c13365.f39986;
                    if (c1195513 == null) {
                        c1195513 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195513.m29154(new String[m291683]);
                    c16040.m37918(c1195513);
                    break;
                case 10:
                    C11955 c1195514 = c13365.f39986;
                    if (c1195514 == null) {
                        c1195514 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    int i6 = (c12660.f38134[c13365.f39980 + 1] & 255) << 8;
                    byte[] bArr3 = c12660.f38134;
                    int i7 = c13365.f39980;
                    char c = (char) (i6 | (bArr3[i7] & 255));
                    c13365.f39980 = i7 + 2;
                    c1195514.m29149(c);
                    c16040.m37918(c1195514);
                    break;
                case 11:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c1195515 = (C11955) c16040.m37917();
                        c1195515.m29176(c1195515);
                        break;
                    } else {
                        C11955 c1195516 = (C11955) c16040.m37919();
                        C11955 c1195517 = c13365.f39986;
                        if (c1195517 == null) {
                            c1195517 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c1195516.m29176(c1195517);
                        c16040.m37918(c1195517);
                        break;
                    }
                case 12:
                    C11955 c1195518 = c13365.f39986;
                    if (c1195518 == null) {
                        c1195518 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195519 = (C11955) c16040.m37919();
                    C11955 c1195520 = (C11955) c16040.m37919();
                    c1195520.m29177(c1195519, c1195518);
                    c16040.m37918(c1195518);
                    if (c1195520.f35719) {
                        c1195520.m29198();
                        c13365.f39986 = c1195520;
                        break;
                    } else if (!c1195519.f35719) {
                        break;
                    } else {
                        c1195519.m29198();
                        c13365.f39986 = c1195519;
                        break;
                    }
                case 13:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c1195521 = (C11955) c16040.m37917();
                        c1195521.m29193(c1195521);
                        break;
                    } else {
                        C11955 c1195522 = (C11955) c16040.m37919();
                        C11955 c1195523 = c13365.f39986;
                        if (c1195523 == null) {
                            c1195523 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c1195522.m29193(c1195523);
                        c16040.m37918(c1195523);
                        break;
                    }
                case 14:
                    C11955 c1195524 = c13365.f39986;
                    if (c1195524 == null) {
                        c1195524 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195524.m29152(c13365.m32378());
                    c16040.m37918(c1195524);
                    break;
                case 15:
                    int m291684 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195525 = c13365.f39986;
                    if (c1195525 == null) {
                        c1195525 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195525.m29154(new boolean[m291684]);
                    c16040.m37918(c1195525);
                    break;
                case 16:
                    C11955 c1195526 = c13365.f39986;
                    if (c1195526 == null) {
                        c1195526 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195527 = (C11955) c16040.m37919();
                    c1195527.m29164(c1195526);
                    c16040.m37918(c1195526);
                    if (!c1195527.f35719) {
                        break;
                    } else {
                        c1195527.m29198();
                        c13365.f39986 = c1195527;
                        break;
                    }
                case 17:
                    c16040.m37918(c11955Arr2[c13365.m32380()]);
                    break;
                case 18:
                    int m323782 = c13365.m32378();
                    c13365.f39980 = iArr2[m323782];
                    c13365.f39983 = iArr[m323782];
                    break;
                case 19:
                    int m291685 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195528 = c13365.f39986;
                    if (c1195528 == null) {
                        c1195528 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195528.m29154(new float[m291685]);
                    c16040.m37918(c1195528);
                    break;
                case 20:
                    C11955 c1195529 = c13365.f39986;
                    if (c1195529 == null) {
                        c1195529 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195530 = (C11955) c16040.m37919();
                    C11955 c1195531 = (C11955) c16040.m37919();
                    c1195531.m29202(c1195530, c1195529);
                    c16040.m37918(c1195529);
                    if (c1195531.f35719) {
                        c1195531.m29198();
                        c13365.f39986 = c1195531;
                        break;
                    } else if (!c1195530.f35719) {
                        break;
                    } else {
                        c1195530.m29198();
                        c13365.f39986 = c1195530;
                        break;
                    }
                case 21:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c1195532 = (C11955) c16040.m37917();
                        c1195532.m29189(c1195532);
                        break;
                    } else {
                        C11955 c1195533 = (C11955) c16040.m37919();
                        C11955 c1195534 = c13365.f39986;
                        if (c1195534 == null) {
                            c1195534 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c1195533.m29189(c1195534);
                        c16040.m37918(c1195534);
                        break;
                    }
                case 22:
                    C11955 c1195535 = c13365.f39986;
                    if (c1195535 == null) {
                        c1195535 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c11955Arr[c13365.m32380()].m29157(c1195535, ((C11955) c16040.m37919()).m29168());
                    c16040.m37918(c1195535);
                    break;
                case 23:
                    C11955 c1195536 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29144(c1195536);
                    if (!c1195536.f35719) {
                        break;
                    } else {
                        c1195536.m29198();
                        c13365.f39986 = c1195536;
                        break;
                    }
                case 24:
                    int i8 = c13365.f39980;
                    int i9 = i8 + 1;
                    c13365.f39980 = i9;
                    if (bArr[i8] == 0) {
                        int m46823 = c20422.m46823(new String(bArr, i9, 32));
                        int i10 = c13365.f39980;
                        bArr[i10 - 1] = 1;
                        bArr[i10] = (byte) (m46823 & 255);
                        bArr[i10 + 1] = (byte) ((m46823 >>> 8) & 255);
                        bArr[i10 + 2] = (byte) ((m46823 >>> 16) & 255);
                        bArr[i10 + 3] = (byte) ((m46823 >>> 24) & 255);
                    }
                    c20422.m46824(c13365.m32378());
                    c13365.f39980 += 28;
                    break;
                case 25:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c1195537 = (C11955) c16040.m37917();
                        c1195537.m29183(c1195537);
                        break;
                    } else {
                        C11955 c1195538 = (C11955) c16040.m37919();
                        C11955 c1195539 = c13365.f39986;
                        if (c1195539 == null) {
                            c1195539 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c1195538.m29183(c1195539);
                        c16040.m37918(c1195539);
                        break;
                    }
                case 26:
                    c16040.m37919();
                    break;
                case 27:
                    int m291686 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195540 = c13365.f39986;
                    if (c1195540 == null) {
                        c1195540 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195540.m29154(new char[m291686]);
                    c16040.m37918(c1195540);
                    break;
                case 28:
                    C11955 c1195541 = c13365.f39986;
                    if (c1195541 == null) {
                        c1195541 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195542 = (C11955) c16040.m37919();
                    C11955 c1195543 = (C11955) c16040.m37919();
                    c1195543.m29197(c1195542, c1195541);
                    c16040.m37918(c1195541);
                    if (c1195543.f35719) {
                        c1195543.m29198();
                        c13365.f39986 = c1195543;
                        break;
                    } else if (!c1195542.f35719) {
                        break;
                    } else {
                        c1195542.m29198();
                        c13365.f39986 = c1195542;
                        break;
                    }
                case 29:
                    c11955Arr2[c13365.m32380()].m29161();
                    break;
                case 30:
                    C11955 c1195544 = c13365.f39986;
                    if (c1195544 == null) {
                        c1195544 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195545 = (C11955) c16040.m37919();
                    C11955 c1195546 = (C11955) c16040.m37919();
                    c1195546.m29174(c1195545, c1195544);
                    c16040.m37918(c1195544);
                    if (c1195546.f35719) {
                        c1195546.m29198();
                        c13365.f39986 = c1195546;
                        break;
                    } else if (!c1195545.f35719) {
                        break;
                    } else {
                        c1195545.m29198();
                        c13365.f39986 = c1195545;
                        break;
                    }
                case 31:
                    C11955 c1195547 = c13365.f39986;
                    if (c1195547 == null) {
                        c1195547 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195547.m29151(Float.intBitsToFloat(c13365.m32378()));
                    c16040.m37918(c1195547);
                    break;
                case 32:
                    int m323783 = c13365.m32378();
                    if (((C11955) c16040.m37917()).m29191()) {
                        c13365.f39980 = iArr2[m323783];
                        c13365.f39983 = iArr[m323783];
                        break;
                    } else if (c13365.f39986 == null) {
                        C11955 c1195548 = (C11955) c16040.m37919();
                        if (!c1195548.f35719) {
                            break;
                        } else {
                            c1195548.m29198();
                            c13365.f39986 = c1195548;
                            break;
                        }
                    } else {
                        c16040.m37919();
                        break;
                    }
                case 33:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c1195549 = (C11955) c16040.m37917();
                        c1195549.m29169(c1195549);
                        break;
                    } else {
                        C11955 c1195550 = (C11955) c16040.m37919();
                        C11955 c1195551 = c13365.f39986;
                        if (c1195551 == null) {
                            c1195551 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c1195550.m29169(c1195551);
                        c16040.m37918(c1195551);
                        break;
                    }
                case 34:
                    C11955 c1195552 = c13365.f39986;
                    if (c1195552 == null) {
                        c1195552 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195553 = (C11955) c16040.m37919();
                    c1195553.m29162(c1195552);
                    c16040.m37918(c1195552);
                    if (!c1195553.f35719) {
                        break;
                    } else {
                        c1195553.m29198();
                        c13365.f39986 = c1195553;
                        break;
                    }
                case 35:
                    int m291687 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195554 = c13365.f39986;
                    if (c1195554 == null) {
                        c1195554 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195554.m29154(new double[m291687]);
                    c16040.m37918(c1195554);
                    break;
                case 36:
                    C11955 c1195555 = c13365.f39986;
                    if (c1195555 == null) {
                        c1195555 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195555.m29152(c11955Arr[c13365.m32380()].m29178());
                    c16040.m37918(c1195555);
                    break;
                case 37:
                    c11955Arr2[c13365.m32380()].m29147();
                    break;
                case 38:
                    C11955 c1195556 = c13365.f39986;
                    if (c1195556 == null) {
                        c1195556 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195557 = (C11955) c16040.m37919();
                    C11955 c1195558 = (C11955) c16040.m37919();
                    c1195558.m29181(c1195557, c1195556);
                    c16040.m37918(c1195556);
                    if (c1195558.f35719) {
                        c1195558.m29198();
                        c13365.f39986 = c1195558;
                        break;
                    } else if (!c1195557.f35719) {
                        break;
                    } else {
                        c1195557.m29198();
                        c13365.f39986 = c1195557;
                        break;
                    }
                case 39:
                    C11955 c1195559 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29173(c1195559);
                    if (!c1195559.f35719) {
                        break;
                    } else {
                        c1195559.m29198();
                        c13365.f39986 = c1195559;
                        break;
                    }
                case 40:
                    c11955Arr[c13365.m32380()].m29161();
                    break;
                case 41:
                    C11955 c1195560 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29199(c1195560);
                    if (!c1195560.f35719) {
                        break;
                    } else {
                        c1195560.m29198();
                        c13365.f39986 = c1195560;
                        break;
                    }
                case 42:
                    C11955 c1195561 = c13365.f39986;
                    if (c1195561 == null) {
                        c1195561 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195562 = (C11955) c16040.m37919();
                    C11955 c1195563 = (C11955) c16040.m37919();
                    c1195563.m29158(c1195562, c1195561);
                    c16040.m37918(c1195561);
                    if (c1195563.f35719) {
                        c1195563.m29198();
                        c13365.f39986 = c1195563;
                        break;
                    } else if (!c1195562.f35719) {
                        break;
                    } else {
                        c1195562.m29198();
                        c13365.f39986 = c1195562;
                        break;
                    }
                case 43:
                    C11955 c1195564 = c13365.f39986;
                    if (c1195564 == null) {
                        c1195564 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195564.m29155(this.f38136[c13365.m32378()]);
                    c16040.m37918(c1195564);
                    break;
                case 44:
                    C11955 c1195565 = c13365.f39986;
                    if (c1195565 == null) {
                        c1195565 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195566 = (C11955) c16040.m37919();
                    C11955 c1195567 = (C11955) c16040.m37919();
                    c1195567.m29188(c1195566, c1195565);
                    c16040.m37918(c1195565);
                    if (c1195567.f35719) {
                        c1195567.m29198();
                        c13365.f39986 = c1195567;
                        break;
                    } else if (!c1195566.f35719) {
                        break;
                    } else {
                        c1195566.m29198();
                        c13365.f39986 = c1195566;
                        break;
                    }
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C11955 c1195568 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29167(c1195568);
                    if (!c1195568.f35719) {
                        break;
                    } else {
                        c1195568.m29198();
                        c13365.f39986 = c1195568;
                        break;
                    }
                case 46:
                    return;
                case 47:
                    short m323802 = c13365.m32380();
                    C11955 c1195569 = (C11955) c16040.m37917();
                    c11955Arr2[m323802] = c1195569;
                    c1195569.f35719 = false;
                    break;
                case 48:
                    C11955 c1195570 = c13365.f39986;
                    if (c1195570 == null) {
                        c1195570 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195571 = (C11955) c16040.m37919();
                    C11955 c1195572 = (C11955) c16040.m37919();
                    c1195572.m29194(c1195571, c1195570);
                    c16040.m37918(c1195570);
                    if (c1195572.f35719) {
                        c1195572.m29198();
                        c13365.f39986 = c1195572;
                        break;
                    } else if (!c1195571.f35719) {
                        break;
                    } else {
                        c1195571.m29198();
                        c13365.f39986 = c1195571;
                        break;
                    }
                case 49:
                    short m323803 = c13365.m32380();
                    C11955 c1195573 = (C11955) c16040.m37919();
                    c11955Arr2[m323803] = c1195573;
                    c1195573.f35719 = false;
                    break;
                case 50:
                    if (((C11955) c16040.m37919()).m29191()) {
                        int m323784 = c13365.m32378();
                        c13365.f39980 = iArr2[m323784];
                        c13365.f39983 = iArr[m323784];
                        break;
                    } else {
                        c13365.f39980 += 4;
                        break;
                    }
                case 51:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c1195574 = (C11955) c16040.m37917();
                        c1195574.m29207(c1195574);
                        break;
                    } else {
                        C11955 c1195575 = (C11955) c16040.m37919();
                        C11955 c1195576 = c13365.f39986;
                        if (c1195576 == null) {
                            c1195576 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c1195575.m29207(c1195576);
                        c16040.m37918(c1195576);
                        break;
                    }
                case 52:
                    if (!((C11955) c16040.m37919()).m29191()) {
                        int m323785 = c13365.m32378();
                        c13365.f39980 = iArr2[m323785];
                        c13365.f39983 = iArr[m323785];
                        break;
                    } else {
                        c13365.f39980 += 4;
                        break;
                    }
                case 53:
                    C11955 c1195577 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29187(c1195577);
                    if (!c1195577.f35719) {
                        break;
                    } else {
                        c1195577.m29198();
                        c13365.f39986 = c1195577;
                        break;
                    }
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    C11955 c1195578 = c13365.f39986;
                    if (c1195578 == null) {
                        c1195578 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195579 = (C11955) c16040.m37919();
                    C11955 c1195580 = (C11955) c16040.m37919();
                    c1195580.m29208(c1195579, c1195578);
                    c16040.m37918(c1195578);
                    if (c1195580.f35719) {
                        c1195580.m29198();
                        c13365.f39986 = c1195580;
                        break;
                    } else if (!c1195579.f35719) {
                        break;
                    } else {
                        c1195579.m29198();
                        c13365.f39986 = c1195579;
                        break;
                    }
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    C11955 c1195581 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29156(c1195581);
                    if (!c1195581.f35719) {
                        break;
                    } else {
                        c1195581.m29198();
                        c13365.f39986 = c1195581;
                        break;
                    }
                case 56:
                    C11955 c1195582 = c13365.f39986;
                    if (c1195582 == null) {
                        c1195582 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195583 = (C11955) c16040.m37919();
                    C11955 c1195584 = (C11955) c16040.m37919();
                    c1195584.m29200(c1195583, c1195582);
                    c16040.m37918(c1195582);
                    if (c1195584.f35719) {
                        c1195584.m29198();
                        c13365.f39986 = c1195584;
                        break;
                    } else if (!c1195583.f35719) {
                        break;
                    } else {
                        c1195583.m29198();
                        c13365.f39986 = c1195583;
                        break;
                    }
                case 57:
                    C11955 c1195585 = c13365.f39986;
                    if (c1195585 == null) {
                        c1195585 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c11955Arr2[c13365.m32380()].m29157(c1195585, ((C11955) c16040.m37919()).m29168());
                    c16040.m37918(c1195585);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    C11955 c1195586 = c13365.f39986;
                    if (c1195586 == null) {
                        c1195586 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195587 = (C11955) c16040.m37919();
                    C11955 c1195588 = (C11955) c16040.m37919();
                    c1195588.m29190(c1195587, c1195586);
                    c16040.m37918(c1195586);
                    if (c1195588.f35719) {
                        c1195588.m29198();
                        c13365.f39986 = c1195588;
                        break;
                    } else if (!c1195587.f35719) {
                        break;
                    } else {
                        c1195587.m29198();
                        c13365.f39986 = c1195587;
                        break;
                    }
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    C11955 c1195589 = c13365.f39986;
                    if (c1195589 == null) {
                        c1195589 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195589.m29150(Double.longBitsToDouble(c13365.m32379()));
                    c16040.m37918(c1195589);
                    break;
                case 60:
                    C11955 c1195590 = c13365.f39986;
                    if (c1195590 == null) {
                        c1195590 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195591 = (C11955) c16040.m37919();
                    C11955 c1195592 = (C11955) c16040.m37919();
                    c1195592.m29165(c1195591, c1195590);
                    c16040.m37918(c1195590);
                    if (c1195592.f35719) {
                        c1195592.m29198();
                        c13365.f39986 = c1195592;
                        break;
                    } else if (!c1195591.f35719) {
                        break;
                    } else {
                        c1195591.m29198();
                        c13365.f39986 = c1195591;
                        break;
                    }
                case 61:
                    C11955 c1195593 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29146(c1195593);
                    if (!c1195593.f35719) {
                        break;
                    } else {
                        c1195593.m29198();
                        c13365.f39986 = c1195593;
                        break;
                    }
                case 62:
                    C11955 c1195594 = c13365.f39986;
                    if (c1195594 == null) {
                        c1195594 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195594.m29153(c13365.m32379());
                    c16040.m37918(c1195594);
                    break;
                case 63:
                    C11955 c1195595 = c13365.f39986;
                    if (c1195595 == null) {
                        c1195595 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195595.m29159(c13365.m32380());
                    c16040.m37918(c1195595);
                    break;
                case 64:
                    c16040.m37918(c11955Arr[c13365.m32380()]);
                    break;
                case 65:
                    int m291688 = ((C11955) c16040.m37919()).m29168();
                    C11955 c1195596 = c13365.f39986;
                    if (c1195596 == null) {
                        c1195596 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c1195596.m29154(new Object[m291688]);
                    c16040.m37918(c1195596);
                    break;
                case 66:
                    C11955 c1195597 = c13365.f39986;
                    if (c1195597 == null) {
                        c1195597 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c1195598 = (C11955) c16040.m37919();
                    C11955 c1195599 = (C11955) c16040.m37919();
                    c1195599.m29205(c1195598, c1195597);
                    c16040.m37918(c1195597);
                    if (c1195599.f35719) {
                        c1195599.m29198();
                        c13365.f39986 = c1195599;
                        break;
                    } else if (!c1195598.f35719) {
                        break;
                    } else {
                        c1195598.m29198();
                        c13365.f39986 = c1195598;
                        break;
                    }
                case 67:
                    if (((C11955) c16040.m37917()).f35719) {
                        C11955 c11955100 = (C11955) c16040.m37917();
                        c11955100.m29204(c11955100);
                        break;
                    } else {
                        C11955 c11955101 = (C11955) c16040.m37919();
                        C11955 c11955102 = c13365.f39986;
                        if (c11955102 == null) {
                            c11955102 = new C11955();
                        } else {
                            c13365.f39986 = null;
                        }
                        c11955101.m29204(c11955102);
                        c16040.m37918(c11955102);
                        break;
                    }
                case 68:
                    C11955 c11955103 = c13365.f39986;
                    if (c11955103 == null) {
                        c11955103 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c11955104 = (C11955) c16040.m37919();
                    C11955 c11955105 = (C11955) c16040.m37919();
                    c11955105.m29170(c11955104, c11955103);
                    c16040.m37918(c11955103);
                    if (c11955105.f35719) {
                        c11955105.m29198();
                        c13365.f39986 = c11955105;
                        break;
                    } else if (!c11955104.f35719) {
                        break;
                    } else {
                        c11955104.m29198();
                        c13365.f39986 = c11955104;
                        break;
                    }
                case 69:
                    c11955Arr2[c13365.m32380()].m29180((C11955) c16040.m37919(), ((C11955) c16040.m37919()).m29168());
                    break;
                case 70:
                    c11955Arr[c13365.m32380()].m29147();
                    break;
                case 71:
                    int m291689 = ((C11955) c16040.m37919()).m29168();
                    C11955 c11955106 = c13365.f39986;
                    if (c11955106 == null) {
                        c11955106 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c11955106.m29154(new byte[m291689]);
                    c16040.m37918(c11955106);
                    break;
                case 72:
                    c11955Arr[c13365.m32380()].m29180((C11955) c16040.m37919(), ((C11955) c16040.m37919()).m29168());
                    break;
                case 73:
                    C11955 c11955107 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29185(c11955107);
                    if (!c11955107.f35719) {
                        break;
                    } else {
                        c11955107.m29198();
                        c13365.f39986 = c11955107;
                        break;
                    }
                case 74:
                    C11955 c11955108 = c13365.f39986;
                    if (c11955108 == null) {
                        c11955108 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c11955109 = (C11955) c16040.m37919();
                    C11955 c11955110 = (C11955) c16040.m37919();
                    c11955110.m29145(c11955109, c11955108);
                    c16040.m37918(c11955108);
                    if (c11955110.f35719) {
                        c11955110.m29198();
                        c13365.f39986 = c11955110;
                        break;
                    } else if (!c11955109.f35719) {
                        break;
                    } else {
                        c11955109.m29198();
                        c13365.f39986 = c11955109;
                        break;
                    }
                case 75:
                    C11955 c11955111 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29179(c11955111);
                    if (!c11955111.f35719) {
                        break;
                    } else {
                        c11955111.m29198();
                        c13365.f39986 = c11955111;
                        break;
                    }
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    C11955 c11955112 = c13365.f39986;
                    if (c11955112 == null) {
                        c11955112 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    byte[] bArr4 = c12660.f38134;
                    int i11 = c13365.f39980;
                    c13365.f39980 = i11 + 1;
                    c11955112.m29148(bArr4[i11]);
                    c16040.m37918(c11955112);
                    break;
                case 77:
                    C11955 c11955113 = (C11955) c16040.m37919();
                    ((C11955) c16040.m37919()).m29171(c11955113);
                    if (!c11955113.f35719) {
                        break;
                    } else {
                        c11955113.m29198();
                        c13365.f39986 = c11955113;
                        break;
                    }
                case 78:
                    short m323804 = c13365.m32380();
                    C11955 c11955114 = (C11955) c16040.m37919();
                    c11955Arr[m323804] = c11955114;
                    c11955114.f35719 = false;
                    break;
                case 79:
                    int m2916810 = ((C11955) c16040.m37919()).m29168();
                    C11955 c11955115 = c13365.f39986;
                    if (c11955115 == null) {
                        c11955115 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c11955115.m29154(new short[m2916810]);
                    c16040.m37918(c11955115);
                    break;
                case 80:
                    C11955 c11955116 = c13365.f39986;
                    if (c11955116 == null) {
                        c11955116 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    C11955 c11955117 = (C11955) c16040.m37919();
                    C11955 c11955118 = (C11955) c16040.m37919();
                    c11955118.m29163(c11955117, c11955116);
                    c16040.m37918(c11955116);
                    if (c11955118.f35719) {
                        c11955118.m29198();
                        c13365.f39986 = c11955118;
                        break;
                    } else if (!c11955117.f35719) {
                        break;
                    } else {
                        c11955117.m29198();
                        c13365.f39986 = c11955117;
                        break;
                    }
                case 81:
                    C11955 c11955119 = c13365.f39986;
                    if (c11955119 == null) {
                        c11955119 = new C11955();
                    } else {
                        c13365.f39986 = null;
                    }
                    c11955119.m29152(c11955Arr2[c13365.m32380()].m29178());
                    c16040.m37918(c11955119);
                    break;
                default:
                    throw new RuntimeException();
            }
        }
    }
}
