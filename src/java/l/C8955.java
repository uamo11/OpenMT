package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.params.DHParameters;
import org.simpleframework.xml.core.AnnotationHandler;

/* compiled from: 54J3 */
/* renamed from: l.ۡܶۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8955 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15452 f27203;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5427 f27204;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5637 f27205;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23082(AbstractC19686 abstractC19686, C18127 c18127) {
        m23080(abstractC19686.f63597, c18127);
        int[] iArr = C9661.f29259;
        EnumC1340 enumC1340 = abstractC19686.f25745;
        int i = iArr[enumC1340.ordinal()];
        if (i == 2) {
            C14102 c14102 = (C14102) abstractC19686;
            c18127.mo26972(m23077(c14102.f42579), 178, c14102.f42580, c14102.f42578);
            return;
        }
        if (i == 3) {
            C14102 c141022 = (C14102) abstractC19686;
            c18127.mo26972(m23077(c141022.f42579), 180, c141022.f42580, c141022.f42578);
            return;
        }
        switch (i) {
            case 21:
                String str = ((C16156) abstractC19686).f49779;
                char charAt = str.charAt(0);
                if (charAt != 'F') {
                    if (charAt != 'L') {
                        if (charAt == 'S') {
                            c18127.mo28290(188, 9);
                            break;
                        } else if (charAt == 'I') {
                            c18127.mo28290(188, 10);
                            break;
                        } else if (charAt == 'J') {
                            c18127.mo28290(188, 11);
                            break;
                        } else if (charAt == 'Z') {
                            c18127.mo28290(188, 4);
                            break;
                        } else if (charAt != '[') {
                            switch (charAt) {
                                case 'B':
                                    c18127.mo28290(188, 8);
                                    break;
                                case 'C':
                                    c18127.mo28290(188, 5);
                                    break;
                                case 'D':
                                    c18127.mo28290(188, 7);
                                    break;
                            }
                        }
                    }
                    c18127.mo26978(189, C11926.m29091(str).m29103());
                    break;
                } else {
                    c18127.mo28290(188, 6);
                    break;
                }
            case 22:
            case 23:
                c18127.mo26978(enumC1340 == EnumC1340.CHECK_CAST ? 192 : 193, m23077(((C16156) abstractC19686).f49779));
                break;
            case 24:
                C6342 c6342 = (C6342) abstractC19686;
                String str2 = abstractC19686.f63597.f25746;
                String str3 = c6342.f19648;
                if (!str2.equals(str3)) {
                    char charAt2 = str2.charAt(0);
                    if (charAt2 != 'F') {
                        if (charAt2 != 'S' && charAt2 != 'Z' && charAt2 != 'I') {
                            if (charAt2 == 'J') {
                                char charAt3 = str3.charAt(0);
                                if (charAt3 == 'D') {
                                    c18127.mo28279(138);
                                    break;
                                } else if (charAt3 == 'F') {
                                    c18127.mo28279(137);
                                    break;
                                } else if (charAt3 == 'I') {
                                    c18127.mo28279(136);
                                    break;
                                }
                            } else {
                                switch (charAt2) {
                                    case 'D':
                                        char charAt4 = str3.charAt(0);
                                        if (charAt4 == 'F') {
                                            c18127.mo28279(144);
                                            break;
                                        } else if (charAt4 == 'I') {
                                            c18127.mo28279(142);
                                            break;
                                        } else if (charAt4 == 'J') {
                                            c18127.mo28279(143);
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        char charAt5 = str3.charAt(0);
                        if (charAt5 == 'F') {
                            c18127.mo28279(134);
                            break;
                        } else if (charAt5 == 'J') {
                            c18127.mo28279(133);
                            break;
                        } else if (charAt5 != 'S') {
                            switch (charAt5) {
                                case 'B':
                                    c18127.mo28279(145);
                                    break;
                                case 'C':
                                    c18127.mo28279(146);
                                    break;
                                case 'D':
                                    c18127.mo28279(135);
                                    break;
                            }
                        } else {
                            c18127.mo28279(147);
                            break;
                        }
                    } else {
                        char charAt6 = str3.charAt(0);
                        if (charAt6 == 'D') {
                            c18127.mo28279(141);
                            break;
                        } else if (charAt6 == 'I') {
                            c18127.mo28279(139);
                            break;
                        } else if (charAt6 == 'J') {
                            c18127.mo28279(140);
                            break;
                        }
                    }
                }
                break;
            case 25:
                c18127.mo28279(190);
                break;
            case 26:
                c18127.mo28279(m23076(116, abstractC19686.f25746));
                break;
            case 27:
                if (abstractC19686.f63597.f25746.equals("I")) {
                    c18127.mo26971((Object) (-1));
                    c18127.mo28279(m23076(130, abstractC19686.f25746));
                    break;
                } else if (abstractC19686.f63597.f25746.equals("J")) {
                    c18127.mo26971((Object) (-1L));
                    c18127.mo28279(m23076(130, abstractC19686.f25746));
                    break;
                }
                break;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23087(C5427 c5427) {
        this.f27204 = c5427;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23088(C5637 c5637) {
        this.f27205 = c5637;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23089(AbstractC15452 abstractC15452) {
        this.f27203 = abstractC15452;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23086() {
        int i;
        int intValue;
        String substring;
        int i2;
        boolean z;
        byte[] m23085;
        int i3;
        int i4;
        byte[] bArr;
        Iterator it = this.f27205.f17411.iterator();
        while (it.hasNext()) {
            AbstractC1591 abstractC1591 = (AbstractC1591) it.next();
            if (abstractC1591.f5638 == EnumC7690.LABEL) {
                ((C13334) abstractC1591).f39895 = new C1342();
            }
        }
        C5637 c5637 = this.f27205;
        C18127 c18127 = new C18127(this.f27203);
        int i5 = 0;
        Iterator it2 = c5637.f17415.iterator();
        int i6 = 0;
        while (it2.hasNext()) {
            i6 = Math.max(i6, ((C18274) it2.next()).f56817);
        }
        new HashMap();
        Iterator it3 = c5637.f17411.iterator();
        while (it3.hasNext()) {
            AbstractC1591 abstractC15912 = (AbstractC1591) it3.next();
            switch (C9661.f29260[abstractC15912.f5638.ordinal()]) {
                case 1:
                    C13334 c13334 = (C13334) abstractC15912;
                    C1342 c1342 = c13334.f39895;
                    c18127.mo28284(c1342);
                    int i7 = c13334.f39896;
                    if (i7 >= 0) {
                        c18127.mo28292(i7, c1342);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    AbstractC14039 abstractC14039 = (AbstractC14039) abstractC15912;
                    AbstractC8396 abstractC8396 = abstractC14039.f42444;
                    AbstractC8396 abstractC83962 = abstractC14039.f42445;
                    int i8 = C9661.f29259[abstractC8396.f25745.ordinal()];
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    break;
                                } else {
                                    C12692 c12692 = (C12692) abstractC8396;
                                    m23080(c12692.f2428, c18127);
                                    m23080(c12692.f2429, c18127);
                                    m23080(abstractC83962, c18127);
                                    String str = c12692.f2428.f25746;
                                    String str2 = c12692.f25746;
                                    if (str.charAt(0) == '[') {
                                        String substring2 = str.substring(1);
                                        m23079(abstractC83962.f25746, substring2, c18127);
                                        c18127.mo28279(m23076(79, substring2));
                                        break;
                                    } else {
                                        c18127.mo28279(m23076(79, str2));
                                        break;
                                    }
                                }
                            } else {
                                C14102 c14102 = (C14102) abstractC8396;
                                String str3 = c14102.f42578;
                                m23080(c14102.f63597, c18127);
                                m23080(abstractC83962, c18127);
                                m23079(abstractC83962.f25746, str3, c18127);
                                c18127.mo26972(m23077(c14102.f42579), 181, c14102.f42580, str3);
                                break;
                            }
                        } else {
                            C9808 c9808 = (C9808) abstractC8396;
                            String str4 = c9808.f29646;
                            m23080(abstractC83962, c18127);
                            m23079(abstractC83962.f25746, str4, c18127);
                            c18127.mo26972(m23077(c9808.f29647), 179, c9808.f29645, str4);
                            break;
                        }
                    } else {
                        int i9 = ((C18274) abstractC8396).f56817;
                        if (abstractC83962.f25745 != EnumC1340.LOCAL || i9 != ((C18274) abstractC83962).f56817) {
                            if (abstractC8396.f25746.charAt(0) == 'I') {
                                EnumC1340 enumC1340 = abstractC83962.f25745;
                                if (enumC1340 == EnumC1340.ADD) {
                                    if (!m23084(abstractC83962.mo2581(), i9) || abstractC83962.mo2583().f25745 != EnumC1340.CONSTANT) {
                                        if (m23084(abstractC83962.mo2583(), i9) && abstractC83962.mo2581().f25745 == EnumC1340.CONSTANT && (intValue = ((Integer) ((C11987) abstractC83962.mo2581()).f35889).intValue()) >= -32768 && intValue <= 32767) {
                                            c18127.mo28280(i9, intValue);
                                            break;
                                        }
                                    } else {
                                        int intValue2 = ((Integer) ((C11987) abstractC83962.mo2583()).f35889).intValue();
                                        if (intValue2 >= -32768 && intValue2 <= 32767) {
                                            c18127.mo28280(i9, intValue2);
                                            break;
                                        }
                                    }
                                } else if (enumC1340 == EnumC1340.SUB && m23084(abstractC83962.mo2581(), i9) && abstractC83962.mo2583().f25745 == EnumC1340.CONSTANT && (i = -((Integer) ((C11987) abstractC83962.mo2583()).f35889).intValue()) >= -32768 && i <= 32767) {
                                    c18127.mo28280(i9, i);
                                    break;
                                }
                            }
                            m23080(abstractC83962, c18127);
                            if (i9 >= 0) {
                                c18127.mo28295(m23076(54, abstractC8396.f25746), i9);
                                break;
                            } else if (abstractC8396.f25746.equals("V")) {
                                break;
                            } else {
                                char charAt = abstractC8396.f25746.charAt(0);
                                if (charAt != 'D' && charAt != 'J') {
                                    c18127.mo28279(87);
                                    break;
                                } else {
                                    c18127.mo28279(88);
                                    break;
                                }
                            }
                        } else {
                            break;
                        }
                    }
                case 3:
                    AbstractC14039 abstractC140392 = (AbstractC14039) abstractC15912;
                    if (abstractC140392.f42445.f25745 != EnumC1340.EXCEPTION_REF) {
                        break;
                    } else {
                        int i10 = ((C18274) abstractC140392.f42444).f56817;
                        if (i10 >= 0) {
                            c18127.mo28295(58, i10);
                            break;
                        } else {
                            c18127.mo28279(87);
                            break;
                        }
                    }
                case 4:
                    AbstractC14039 abstractC140393 = (AbstractC14039) abstractC15912;
                    AbstractC8396 abstractC83963 = abstractC140393.f42445;
                    if (abstractC83963.f25745 == EnumC1340.CONSTANT) {
                        Object obj = ((C11987) abstractC83963).f35889;
                        int length = Array.getLength(obj);
                        String str5 = abstractC140393.f42444.f25746;
                        substring = str5.charAt(i5) == '[' ? str5.substring(1) : "I";
                        try {
                            if (this.f27204 != null && "BSIJ".contains(substring)) {
                                if (obj instanceof byte[]) {
                                    bArr = (byte[]) obj;
                                } else if (obj instanceof short[]) {
                                    short[] sArr = (short[]) obj;
                                    ByteBuffer allocate = ByteBuffer.allocate(sArr.length * 2);
                                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                                    allocate.asShortBuffer().put(sArr);
                                    bArr = allocate.array();
                                } else if (obj instanceof int[]) {
                                    int[] iArr = (int[]) obj;
                                    ByteBuffer allocate2 = ByteBuffer.allocate(iArr.length * 4);
                                    allocate2.order(ByteOrder.LITTLE_ENDIAN);
                                    allocate2.asIntBuffer().put(iArr);
                                    bArr = allocate2.array();
                                } else if (obj instanceof long[]) {
                                    long[] jArr = (long[]) obj;
                                    ByteBuffer allocate3 = ByteBuffer.allocate(jArr.length * 8);
                                    allocate3.order(ByteOrder.LITTLE_ENDIAN);
                                    allocate3.asLongBuffer().put(jArr);
                                    bArr = allocate3.array();
                                } else {
                                    bArr = null;
                                }
                                if (bArr != null && bArr.length > 500) {
                                    m23080(abstractC140393.f42444, c18127);
                                    c18127.mo26971((Object) 0);
                                    m23081(c18127, bArr, substring);
                                    c18127.mo26971((Object) 0);
                                    c18127.mo26971(Integer.valueOf(length));
                                    i3 = length;
                                    try {
                                        c18127.mo12089(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                        break;
                                    } catch (Exception unused) {
                                        i4 = 79;
                                    }
                                }
                            }
                        } catch (Exception unused2) {
                        }
                        i3 = length;
                        i4 = 79;
                        int m23076 = m23076(i4, substring);
                        m23080(abstractC140393.f42444, c18127);
                        for (int i11 = 0; i11 < i3; i11++) {
                            c18127.mo28279(89);
                            c18127.mo26971(Integer.valueOf(i11));
                            c18127.mo26971(Array.get(obj, i11));
                            c18127.mo28279(m23076);
                        }
                        c18127.mo28279(87);
                        break;
                    } else {
                        C7753 c7753 = (C7753) abstractC83963;
                        int length2 = c7753.f17269.length;
                        String str6 = abstractC140393.f42444.f25746;
                        substring = str6.charAt(0) == '[' ? str6.substring(1) : "I";
                        try {
                            if (this.f27204 != null && "BSIJ".contains(substring)) {
                                AbstractC8396[] abstractC8396Arr = c7753.f17269;
                                int length3 = abstractC8396Arr.length;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length3) {
                                        z = true;
                                    } else if (abstractC8396Arr[i12].f25745 != EnumC1340.CONSTANT) {
                                        z = false;
                                    } else {
                                        i12++;
                                    }
                                }
                                if (z && (m23085 = m23085(c7753.f17269, substring)) != null && m23085.length > 500) {
                                    m23080(abstractC140393.f42444, c18127);
                                    c18127.mo26971((Object) 0);
                                    m23081(c18127, m23085, substring);
                                    c18127.mo26971((Object) 0);
                                    c18127.mo26971(Integer.valueOf(length2));
                                    i2 = length2;
                                    try {
                                        c18127.mo12089(184, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                }
                            }
                        } catch (Exception unused4) {
                        }
                        i2 = length2;
                        int m230762 = m23076(79, substring);
                        m23080(abstractC140393.f42444, c18127);
                        int i13 = i2;
                        for (int i14 = 0; i14 < i13; i14++) {
                            c18127.mo28279(89);
                            c18127.mo26971(Integer.valueOf(i14));
                            m23080(c7753.f17269[i14], c18127);
                            c18127.mo28279(m230762);
                        }
                        c18127.mo28279(87);
                        break;
                    }
                case 5:
                    c18127.mo28282(167, ((C20391) abstractC15912).f65790.f39895);
                    break;
                case 6:
                    C4868 c4868 = (C4868) abstractC15912;
                    C1342 c13422 = c4868.f15390.f39895;
                    AbstractC8396 abstractC83964 = c4868.f74596;
                    AbstractC8396 mo2581 = abstractC83964.mo2581();
                    EnumC1340 enumC13402 = abstractC83964.f25745;
                    AbstractC8396 mo2583 = abstractC83964.mo2583();
                    char charAt2 = mo2581.f25746.charAt(i5);
                    if (charAt2 != 'L' && charAt2 != '[') {
                        if (!m23083(mo2581) && !m23083(mo2583)) {
                            m23080(mo2581, c18127);
                            m23080(mo2583, c18127);
                            switch (C9661.f29259[enumC13402.ordinal()]) {
                                case 6:
                                    c18127.mo28282(DHParameters.DEFAULT_MINIMUM_LENGTH, c13422);
                                    break;
                                case 7:
                                    c18127.mo28282(159, c13422);
                                    break;
                                case 8:
                                    c18127.mo28282(162, c13422);
                                    break;
                                case 9:
                                    c18127.mo28282(163, c13422);
                                    break;
                                case 10:
                                    c18127.mo28282(164, c13422);
                                    break;
                                case 11:
                                    c18127.mo28282(161, c13422);
                                    break;
                            }
                        } else {
                            if (m23083(mo2583)) {
                                m23080(mo2581, c18127);
                            } else {
                                m23080(mo2583, c18127);
                            }
                            switch (C9661.f29259[enumC13402.ordinal()]) {
                                case 6:
                                    c18127.mo28282(EnumC17734.f54268, c13422);
                                    break;
                                case 7:
                                    c18127.mo28282(153, c13422);
                                    break;
                                case 8:
                                    c18127.mo28282(156, c13422);
                                    break;
                                case 9:
                                    c18127.mo28282(157, c13422);
                                    break;
                                case 10:
                                    c18127.mo28282(158, c13422);
                                    break;
                                case 11:
                                    c18127.mo28282(155, c13422);
                                    break;
                            }
                        }
                    } else if (!m23083(mo2581) && !m23083(mo2583)) {
                        m23080(mo2581, c18127);
                        m23080(mo2583, c18127);
                        c18127.mo28282(enumC13402 == EnumC1340.EQ ? 165 : 166, c13422);
                        break;
                    } else {
                        if (m23083(mo2583)) {
                            m23080(mo2581, c18127);
                        } else {
                            m23080(mo2583, c18127);
                        }
                        c18127.mo28282(enumC13402 == EnumC1340.EQ ? 198 : 199, c13422);
                        break;
                    }
                case 7:
                    m23080(((C23463) abstractC15912).f74596, c18127);
                    c18127.mo28279(194);
                    break;
                case 8:
                    m23080(((C23463) abstractC15912).f74596, c18127);
                    c18127.mo28279(195);
                    break;
                case 9:
                    break;
                case 10:
                    AbstractC8396 abstractC83965 = ((C23463) abstractC15912).f74596;
                    m23080(abstractC83965, c18127);
                    m23079(abstractC83965.f25746, c5637.f17419, c18127);
                    c18127.mo28279(m23076(172, abstractC83965.f25746));
                    break;
                case 11:
                    c18127.mo28279(177);
                    break;
                case 12:
                    C12629 c12629 = (C12629) abstractC15912;
                    m23080(c12629.f74596, c18127);
                    int length4 = c12629.f72830.length;
                    C1342[] c1342Arr = new C1342[length4];
                    for (int i15 = 0; i15 < length4; i15++) {
                        c1342Arr[i15] = c12629.f72830[i15].f39895;
                    }
                    c18127.mo28285(c12629.f72831.f39895, c12629.f38054, c1342Arr);
                    break;
                case 13:
                    C17113 c17113 = (C17113) abstractC15912;
                    m23080(c17113.f74596, c18127);
                    int length5 = c17113.f72830.length;
                    C1342[] c1342Arr2 = new C1342[length5];
                    for (int i16 = 0; i16 < length5; i16++) {
                        c1342Arr2[i16] = c17113.f72830[i16].f39895;
                    }
                    int i17 = c17113.f52445;
                    c18127.mo28281(i17, (length5 + i17) - 1, c17113.f72831.f39895, c1342Arr2);
                    break;
                case 14:
                    m23080(((C23463) abstractC15912).f74596, c18127);
                    c18127.mo28279(191);
                    break;
                case 15:
                    AbstractC8396 mo5442 = abstractC15912.mo5442();
                    m23080(mo5442, c18127);
                    String str7 = mo5442.f25746;
                    if (mo5442.f25745 == EnumC1340.INVOKE_NEW) {
                        c18127.mo28279(87);
                        break;
                    } else if ("V".equals(str7)) {
                        break;
                    } else {
                        char charAt3 = str7.charAt(i5);
                        if (charAt3 != 'D' && charAt3 != 'J') {
                            c18127.mo28279(87);
                            break;
                        } else {
                            c18127.mo28279(88);
                            break;
                        }
                    }
                default:
                    throw new RuntimeException("not support st: " + abstractC15912.f5638);
            }
            i5 = 0;
        }
        C5637 c56372 = this.f27205;
        AbstractC15452 abstractC15452 = this.f27203;
        Iterator it4 = c56372.f17418.iterator();
        while (it4.hasNext()) {
            C4931 c4931 = (C4931) it4.next();
            AbstractC1591 abstractC15913 = c4931.f15561;
            while (true) {
                abstractC15913 = abstractC15913.m5439();
                if (abstractC15913 != null && abstractC15913 != c4931.f15559) {
                    if (abstractC15913.f5638 != EnumC7690.LABEL) {
                        int i18 = 0;
                        while (true) {
                            C13334[] c13334Arr = c4931.f15560;
                            if (i18 < c13334Arr.length) {
                                String str8 = c4931.f15562[i18];
                                abstractC15452.mo26975(c4931.f15561.f39895, c4931.f15559.f39895, c13334Arr[i18].f39895, str8 == null ? null : C11926.m29091(str8).m29103());
                                i18++;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23077(String str) {
        return C11926.m29091(str).m29103();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23081(C18127 c18127, byte[] bArr, String str) {
        String m23078 = m23078(bArr);
        if (m23078.length() > 65535) {
            c18127.mo26978(187, "java/lang/StringBuilder");
            c18127.mo28279(89);
            c18127.mo12089(183, "java/lang/StringBuilder", "<init>", "()V", false);
            for (int i = 0; i < m23078.length(); i += 65500) {
                c18127.mo26971(m23078.substring(i, Math.min(65500, m23078.length() - i) + i));
                c18127.mo12089(182, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
            }
            c18127.mo12089(182, "java/lang/StringBuilder", AnnotationHandler.STRING, "()Ljava/lang/String;", false);
        } else {
            c18127.mo26971(m23078);
        }
        String m23077 = m23077(this.f27204.f16920);
        C5427 c5427 = this.f27204;
        if (c5427.f16921 == null) {
            byte[] bArr2 = new byte[4];
            new Random().nextBytes(bArr2);
            c5427.f16921 = "$d2j$hex$" + m23078(bArr2);
        }
        c18127.mo12089(184, m23077, C23202.m51498(new StringBuilder(), c5427.f16921, "$decode_", str), C20094.m46315("(Ljava/lang/String;)[", str), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23084(AbstractC8396 abstractC8396, int i) {
        return abstractC8396.f25745 == EnumC1340.LOCAL && ((C18274) abstractC8396).f56817 == i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23079(String str, String str2, C18127 c18127) {
        char charAt = str2.charAt(0);
        if (charAt == 'B') {
            char charAt2 = str.charAt(0);
            if (charAt2 == 'C' || charAt2 == 'I' || charAt2 == 'S') {
                c18127.mo28279(145);
                return;
            }
            return;
        }
        if (charAt == 'C') {
            if (str.charAt(0) != 'I') {
                return;
            }
            c18127.mo28279(146);
        } else {
            if (charAt != 'S') {
                return;
            }
            char charAt3 = str.charAt(0);
            if (charAt3 == 'C' || charAt3 == 'I') {
                c18127.mo28279(147);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23083(AbstractC8396 abstractC8396) {
        if (abstractC8396.f25745 != EnumC1340.CONSTANT) {
            return false;
        }
        Object obj = ((C11987) abstractC8396).f35889;
        Integer num = 0;
        return num.equals(obj) || C11987.f35888.equals(obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m23076(int i, String str) {
        char charAt = str.charAt(0);
        if (charAt != 'F') {
            if (charAt != 'L') {
                if (charAt == 'S') {
                    return C11926.f35649.m29098(i);
                }
                C11926 c11926 = C11926.f35647;
                if (charAt == 'I') {
                    return c11926.m29098(i);
                }
                if (charAt == 'J') {
                    return C11926.f35646.m29098(i);
                }
                if (charAt == 'Z') {
                    return C11926.f35650.m29098(i);
                }
                if (charAt != '[') {
                    switch (charAt) {
                        case 'B':
                            return C11926.f35648.m29098(i);
                        case 'C':
                            return C11926.f35652.m29098(i);
                        case 'D':
                            return C11926.f35645.m29098(i);
                        default:
                            return c11926.m29098(i);
                    }
                }
            }
            return C11926.m29091("La;").m29098(i);
        }
        return C11926.f35651.m29098(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23080(AbstractC8396 abstractC8396, C18127 c18127) {
        int i;
        int i2;
        byte[] m23085;
        int i3 = C9661.f29258[abstractC8396.f25747.ordinal()];
        char c = 1;
        if (i3 == 1) {
            int i4 = C9661.f29259[abstractC8396.f25745.ordinal()];
            if (i4 == 1) {
                c18127.mo28295(m23076(21, abstractC8396.f25746), ((C18274) abstractC8396).f56817);
                return;
            }
            if (i4 == 2) {
                C9808 c9808 = (C9808) abstractC8396;
                c18127.mo26972(m23077(c9808.f29647), 178, c9808.f29645, c9808.f29646);
                return;
            }
            if (i4 != 5) {
                if (i4 != 12) {
                    return;
                }
                c18127.mo26978(187, m23077(((C17568) abstractC8396).f53685));
                return;
            }
            C11987 c11987 = (C11987) abstractC8396;
            if (c11987.f35889.equals(C11987.f35888)) {
                c18127.mo28279(1);
                return;
            }
            Object obj = c11987.f35889;
            if ((obj instanceof C22860) || (obj instanceof C1899) || (obj instanceof C11072)) {
                c18127.mo26971(C1193.m4024(obj));
                return;
            } else {
                c18127.mo26971(obj);
                return;
            }
        }
        if (i3 == 2) {
            m23082((AbstractC19686) abstractC8396, c18127);
            return;
        }
        int i5 = 0;
        if (i3 == 3) {
            AbstractC0634 abstractC0634 = (AbstractC0634) abstractC8396;
            String str = abstractC0634.f2429.f25746;
            m23080(abstractC0634.f2428, c18127);
            EnumC1340 enumC1340 = abstractC0634.f25745;
            EnumC1340 enumC13402 = EnumC1340.ADD;
            if (enumC1340 == enumC13402 || enumC1340 == EnumC1340.SUB) {
                AbstractC8396 abstractC83962 = abstractC0634.f2429;
                if (abstractC83962.f25745 == EnumC1340.CONSTANT) {
                    C11987 c119872 = (C11987) abstractC83962;
                    char charAt = c119872.f25746.charAt(0);
                    if (charAt != 'B') {
                        if (charAt == 'D') {
                            double doubleValue = ((Double) c119872.f35889).doubleValue();
                            if (doubleValue < 0.0d) {
                                c18127.mo26971(Double.valueOf(-doubleValue));
                                c18127.mo28279(m23076(enumC1340 == enumC13402 ? 100 : 96, str));
                                return;
                            }
                        } else if (charAt == 'F') {
                            float floatValue = ((Float) c119872.f35889).floatValue();
                            if (floatValue < 0.0f) {
                                c18127.mo26971(Float.valueOf(-floatValue));
                                c18127.mo28279(m23076(enumC1340 == enumC13402 ? 100 : 96, str));
                                return;
                            }
                        } else if (charAt != 'S' && charAt != 'I') {
                            if (charAt == 'J') {
                                long longValue = ((Long) c119872.f35889).longValue();
                                if (longValue < 0) {
                                    c18127.mo26971(Long.valueOf(-longValue));
                                    c18127.mo28279(m23076(enumC1340 == enumC13402 ? 100 : 96, str));
                                    return;
                                }
                            }
                        }
                    }
                    int intValue = ((Integer) c119872.f35889).intValue();
                    if (intValue < 0) {
                        c18127.mo26971(Integer.valueOf(-intValue));
                        c18127.mo28279(m23076(enumC1340 == enumC13402 ? 100 : 96, str));
                        return;
                    }
                }
            }
            m23080(abstractC0634.f2429, c18127);
            String str2 = abstractC0634.f2428.f25746;
            int i6 = C9661.f29259[enumC1340.ordinal()];
            if (i6 == 4) {
                String str3 = abstractC0634.f25746;
                if (str2.charAt(0) == '[') {
                    c18127.mo28279(m23076(46, str2.substring(1)));
                    return;
                } else {
                    c18127.mo28279(m23076(46, str3));
                    return;
                }
            }
            switch (i6) {
                case 28:
                    c18127.mo28279(m23076(96, str));
                    return;
                case 29:
                    c18127.mo28279(m23076(100, str));
                    return;
                case 30:
                case 31:
                case 32:
                case 33:
                    c18127.mo28279(m23076(108, str));
                    return;
                case 34:
                    c18127.mo28279(m23076(IShizukuService.Stub.TRANSACTION_isHidden, str));
                    return;
                case 35:
                    c18127.mo28279(m23076(UMErrorCode.E_UM_BE_DEFLATE_FAILED, str));
                    return;
                case 36:
                    c18127.mo28279(m23076(126, str));
                    return;
                case 37:
                    c18127.mo28279(m23076(128, str));
                    return;
                case 38:
                    c18127.mo28279(m23076(130, str));
                    return;
                case 39:
                    c18127.mo28279(m23076(UMErrorCode.E_UM_BE_NOT_MAINPROCESS, str2));
                    return;
                case 40:
                    c18127.mo28279(m23076(122, str2));
                    return;
                case 41:
                    c18127.mo28279(m23076(124, str2));
                    return;
                case 42:
                    c18127.mo28279(148);
                    return;
                case 43:
                    c18127.mo28279(150);
                    return;
                case 44:
                    c18127.mo28279(152);
                    return;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c18127.mo28279(149);
                    return;
                case 46:
                    c18127.mo28279(151);
                    return;
                default:
                    return;
            }
        }
        if (i3 != 4) {
            return;
        }
        AbstractC5574 abstractC5574 = (AbstractC5574) abstractC8396;
        EnumC1340 enumC13403 = abstractC5574.f25745;
        Object[] objArr = null;
        String str4 = null;
        if (enumC13403 == EnumC1340.FILLED_ARRAY) {
            C7753 c7753 = (C7753) abstractC5574;
            String str5 = c7753.f25746;
            int i7 = 79;
            if (str5.charAt(0) == '[') {
                str4 = str5.substring(1);
                i7 = m23076(79, str4);
            }
            try {
                if (this.f27204 != null && str4 != null && "BSIJ".contains(str4)) {
                    AbstractC8396[] abstractC8396Arr = c7753.f17269;
                    int length = abstractC8396Arr.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= length) {
                            break;
                        }
                        if (abstractC8396Arr[i8].f25745 != EnumC1340.CONSTANT) {
                            c = 0;
                            break;
                        }
                        i8++;
                    }
                    if (c != 0 && (m23085 = m23085(c7753.f17269, str4)) != null && m23085.length > 500) {
                        m23081(c18127, m23085, str4);
                        return;
                    }
                }
            } catch (Exception unused) {
            }
            m23082((AbstractC19686) new C16156(EnumC1340.NEW_ARRAY, C23275.m51589(c7753.f17269.length), c7753.f23980), c18127);
            while (true) {
                AbstractC8396[] abstractC8396Arr2 = c7753.f17269;
                if (i5 >= abstractC8396Arr2.length) {
                    return;
                }
                if (abstractC8396Arr2[i5] != null) {
                    c18127.mo28279(89);
                    c18127.mo26971(Integer.valueOf(i5));
                    m23080(c7753.f17269[i5], c18127);
                    String str6 = c7753.f17269[i5].f25746;
                    if (str4 != null) {
                        m23079(str6, str4, c18127);
                    }
                    c18127.mo28279(i7);
                }
                i5++;
            }
        } else {
            switch (C9661.f29259[enumC13403.ordinal()]) {
                case 13:
                case 14:
                case 16:
                case 17:
                    break;
                case 15:
                    c18127.mo26978(187, m23077(((C11219) abstractC5574).f33657.m19702()));
                    c18127.mo28279(89);
                    break;
                case 18:
                    for (AbstractC8396 abstractC83963 : abstractC5574.f17269) {
                        m23080(abstractC83963, c18127);
                    }
                    C14745 c14745 = (C14745) abstractC5574;
                    StringBuilder sb = new StringBuilder();
                    while (i5 < c14745.f45025) {
                        sb.append('[');
                        i5++;
                    }
                    sb.append(c14745.f45026);
                    c18127.mo26970(abstractC5574.f17269.length, sb.toString());
                    return;
                case 19:
                    C2046 c2046 = (C2046) abstractC5574;
                    C10161 c10161 = c2046.f6843;
                    String[] m27468 = c10161.m25525().m27468();
                    AbstractC8396[] abstractC8396Arr3 = c2046.f17269;
                    if (m27468.length == abstractC8396Arr3.length) {
                        for (int i9 = 0; i9 < abstractC8396Arr3.length; i9++) {
                            AbstractC8396 abstractC83964 = abstractC8396Arr3[i9];
                            m23080(abstractC83964, c18127);
                            m23079(abstractC83964.f25746, m27468[i9], c18127);
                        }
                    } else if (m27468.length + 1 == abstractC8396Arr3.length) {
                        m23080(abstractC8396Arr3[0], c18127);
                        for (int i10 = 1; i10 < abstractC8396Arr3.length; i10++) {
                            AbstractC8396 abstractC83965 = abstractC8396Arr3[i10];
                            m23080(abstractC83965, c18127);
                            m23079(abstractC83965.f25746, m27468[i10 - 1], c18127);
                        }
                    } else {
                        throw new RuntimeException();
                    }
                    String m25524 = c10161.m25524();
                    String m27467 = c10161.m25525().m27467();
                    C0636 m4029 = C1193.m4029(c10161.m25522());
                    Object[] m25523 = c10161.m25523();
                    if (m25523 != null) {
                        objArr = Arrays.copyOf(m25523, m25523.length);
                        while (i5 < objArr.length) {
                            objArr[i5] = C1193.m4024(objArr[i5]);
                            i5++;
                        }
                    }
                    c18127.mo26974(m25524, m27467, m4029, objArr);
                    return;
                case 20:
                    C16862 c16862 = (C16862) abstractC5574;
                    C11072 c11072 = c16862.f51741;
                    C7338 c7338 = c16862.f51742;
                    String[] m274682 = c11072.m27468();
                    AbstractC8396[] abstractC8396Arr4 = c16862.f17269;
                    m23080(abstractC8396Arr4[0], c18127);
                    for (int i11 = 1; i11 < abstractC8396Arr4.length; i11++) {
                        AbstractC8396 abstractC83966 = abstractC8396Arr4[i11];
                        m23080(abstractC83966, c18127);
                        m23079(abstractC83966.f25746, m274682[i11 - 1], c18127);
                    }
                    c18127.mo12089(182, m23077(c7338.m19702()), c7338.m19700(), c11072.m27467(), false);
                    return;
                default:
                    return;
            }
            C11219 c11219 = (C11219) abstractC5574;
            C7338 c73382 = c11219.f33657;
            if (enumC13403 == EnumC1340.INVOKE_STATIC || enumC13403 == EnumC1340.INVOKE_NEW) {
                i = 0;
            } else {
                m23080(abstractC5574.f17269[0], c18127);
                i = 1;
            }
            int i12 = 0;
            while (true) {
                AbstractC8396[] abstractC8396Arr5 = abstractC5574.f17269;
                if (i >= abstractC8396Arr5.length) {
                    switch (C9661.f29259[enumC13403.ordinal()]) {
                        case 13:
                            i2 = 182;
                            break;
                        case 14:
                            i2 = 185;
                            break;
                        case 15:
                        case 16:
                            i2 = 183;
                            break;
                        case 17:
                            i2 = 184;
                            break;
                        default:
                            i2 = -1;
                            break;
                    }
                    C11072 m19703 = c73382.m19703();
                    if (c11219.f25745 == EnumC1340.INVOKE_NEW) {
                        m19703 = new C11072("V", m19703.m27468());
                    }
                    c18127.mo12089(i2, m23077(c73382.m19702()), c73382.m19700(), m19703.m27467(), i2 == 185);
                    return;
                }
                AbstractC8396 abstractC83967 = abstractC8396Arr5[i];
                m23080(abstractC83967, c18127);
                m23079(abstractC83967.f25746, c73382.m19704()[i12], c18127);
                i++;
                i12++;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m23078(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            sb.append(String.format("%02x", Integer.valueOf(b & 255)));
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m23085(AbstractC8396[] abstractC8396Arr, String str) {
        int i;
        str.getClass();
        i = 0;
        switch (str) {
            case "B":
                byte[] bArr = new byte[abstractC8396Arr.length];
                int length = abstractC8396Arr.length;
                while (i < length) {
                    bArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).byteValue();
                    i++;
                }
                return bArr;
            case "I":
                int length2 = abstractC8396Arr.length;
                int[] iArr = new int[length2];
                int length3 = abstractC8396Arr.length;
                while (i < length3) {
                    iArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).intValue();
                    i++;
                }
                ByteBuffer allocate = ByteBuffer.allocate(length2 * 4);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.asIntBuffer().put(iArr);
                return allocate.array();
            case "J":
                int length4 = abstractC8396Arr.length;
                long[] jArr = new long[length4];
                int length5 = abstractC8396Arr.length;
                while (i < length5) {
                    jArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).longValue();
                    i++;
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(length4 * 8);
                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                allocate2.asLongBuffer().put(jArr);
                return allocate2.array();
            case "S":
                int length6 = abstractC8396Arr.length;
                short[] sArr = new short[length6];
                int length7 = abstractC8396Arr.length;
                while (i < length7) {
                    sArr[i] = ((Number) ((C11987) abstractC8396Arr[i]).f35889).shortValue();
                    i++;
                }
                ByteBuffer allocate3 = ByteBuffer.allocate(length6 * 2);
                allocate3.order(ByteOrder.LITTLE_ENDIAN);
                allocate3.asShortBuffer().put(sArr);
                return allocate3.array();
            default:
                return null;
        }
    }
}
