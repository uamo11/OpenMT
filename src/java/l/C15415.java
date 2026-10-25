package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.q;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: M8UR */
/* renamed from: l.ܶᩴۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15415 extends AbstractC4833 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f47213;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C8361 f47214;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f47215;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public List f47217;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C1305[] f47218;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1305 f47219;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public List f47220;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17714 f47222 = new C17714();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C16302 f47216 = new C16302();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f47221 = -1;

    @Override // l.InterfaceC1381
    public final String getName() {
        return "Cea708Decoder";
    }

    @Override // l.InterfaceC1381
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo12() {
    }

    public C15415(int i, List list) {
        this.f47213 = i == -1 ? 1 : i;
        if (list != null) {
            int i2 = C17839.f54488;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.f47218 = new C1305[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f47218[i3] = new C1305();
        }
        this.f47219 = this.f47218[0];
    }

    @Override // l.AbstractC4833, l.InterfaceC1381
    public final void flush() {
        super.flush();
        this.f47217 = null;
        this.f47220 = null;
        this.f47215 = 0;
        this.f47219 = this.f47218[0];
        m36464();
        this.f47214 = null;
    }

    @Override // l.AbstractC4833
    /* renamed from: ᩻ */
    public final boolean mo14078() {
        return this.f47217 != this.f47220;
    }

    @Override // l.AbstractC4833
    /* renamed from: ᩳ */
    public final InterfaceC13571 mo14077() {
        List list = this.f47217;
        this.f47220 = list;
        list.getClass();
        return new C3422(list);
    }

    @Override // l.AbstractC4833
    /* renamed from: ֫ */
    public final void mo14074(C18239 c18239) {
        ByteBuffer byteBuffer = c18239.f69995;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C17714 c17714 = this.f47222;
        c17714.m41462(limit, array);
        while (c17714.m41457() >= 3) {
            int m41456 = c17714.m41456();
            int i = m41456 & 3;
            boolean z = (m41456 & 4) == 4;
            byte m414562 = (byte) c17714.m41456();
            byte m414563 = (byte) c17714.m41456();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m36463();
                        int i2 = (m414562 & 192) >> 6;
                        int i3 = this.f47221;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m36464();
                            C19956.m46037("Sequence number discontinuity. previous=" + this.f47221 + " current=" + i2);
                        }
                        this.f47221 = i2;
                        int i4 = m414562 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C8361 c8361 = new C8361(i2, i4);
                        this.f47214 = c8361;
                        c8361.f25667 = 1;
                        c8361.f25668[0] = m414563;
                    } else {
                        C22632.m50631(i == 2);
                        C8361 c83612 = this.f47214;
                        if (c83612 == null) {
                            C19956.m46033("Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c83612.f25668;
                            int i5 = c83612.f25667;
                            int i6 = i5 + 1;
                            c83612.f25667 = i6;
                            bArr[i5] = m414562;
                            c83612.f25667 = i5 + 2;
                            bArr[i6] = m414563;
                        }
                    }
                    C8361 c83613 = this.f47214;
                    if (c83613.f25667 == (c83613.f25669 * 2) - 1) {
                        m36463();
                    }
                }
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m36463() {
        String str;
        String str2;
        C8361 c8361 = this.f47214;
        if (c8361 == null) {
            return;
        }
        if (c8361.f25667 != (c8361.f25669 * 2) - 1) {
            StringBuilder sb = new StringBuilder("DtvCcPacket ended prematurely; size is ");
            sb.append((this.f47214.f25669 * 2) - 1);
            sb.append(", but current index is ");
            sb.append(this.f47214.f25667);
            sb.append(" (sequence number ");
            sb.append(this.f47214.f25670);
            sb.append(");");
            C19956.m46031(sb.toString());
        }
        C8361 c83612 = this.f47214;
        byte[] bArr = c83612.f25668;
        int i = c83612.f25667;
        C16302 c16302 = this.f47216;
        c16302.m38350(i, bArr);
        boolean z = false;
        while (true) {
            if (c16302.m38339() > 0) {
                int m38343 = c16302.m38343(3);
                int m383432 = c16302.m38343(5);
                if (m38343 == 7) {
                    c16302.m38351(2);
                    m38343 = c16302.m38343(6);
                    if (m38343 < 7) {
                        C8083.m21451(m38343, "Invalid extended service number: ");
                    }
                }
                if (m383432 == 0) {
                    if (m38343 != 0) {
                        C19956.m46037("serviceNumber is non-zero (" + m38343 + ") when blockSize is 0");
                    }
                } else if (m38343 != this.f47213) {
                    c16302.m38347(m383432);
                } else {
                    int m38353 = (m383432 * 8) + c16302.m38353();
                    while (c16302.m38353() < m38353) {
                        int m383433 = c16302.m38343(8);
                        if (m383433 != 16) {
                            if (m383433 > 31) {
                                if (m383433 <= 127) {
                                    if (m383433 == 127) {
                                        this.f47219.m4532((char) 9835);
                                    } else {
                                        this.f47219.m4532((char) (m383433 & 255));
                                    }
                                } else if (m383433 <= 159) {
                                    C1305[] c1305Arr = this.f47218;
                                    switch (m383433) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            int i2 = m383433 + a.g;
                                            if (this.f47215 != i2) {
                                                this.f47215 = i2;
                                                this.f47219 = c1305Arr[i2];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            for (int i3 = 1; i3 <= 8; i3++) {
                                                if (c16302.m38352()) {
                                                    c1305Arr[8 - i3].m4544();
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i4 = 1; i4 <= 8; i4++) {
                                                if (c16302.m38352()) {
                                                    c1305Arr[8 - i4].m4535(true);
                                                }
                                            }
                                            break;
                                        case 138:
                                            for (int i5 = 1; i5 <= 8; i5++) {
                                                if (c16302.m38352()) {
                                                    c1305Arr[8 - i5].m4535(false);
                                                }
                                            }
                                            break;
                                        case 139:
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (c16302.m38352()) {
                                                    c1305Arr[8 - i6].m4535(!r9.m4545());
                                                }
                                            }
                                            break;
                                        case 140:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (c16302.m38352()) {
                                                    c1305Arr[8 - i7].m4538();
                                                }
                                            }
                                            break;
                                        case 141:
                                            c16302.m38351(8);
                                            break;
                                        case 142:
                                            break;
                                        case 143:
                                            m36464();
                                            break;
                                        case 144:
                                            if (this.f47219.m4543()) {
                                                c16302.m38343(4);
                                                c16302.m38343(2);
                                                c16302.m38343(2);
                                                boolean m38352 = c16302.m38352();
                                                boolean m383522 = c16302.m38352();
                                                c16302.m38343(3);
                                                c16302.m38343(3);
                                                this.f47219.m4537(m38352, m383522);
                                                break;
                                            } else {
                                                c16302.m38351(16);
                                                break;
                                            }
                                        case 145:
                                            if (this.f47219.m4543()) {
                                                int m4530 = C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), c16302.m38343(2));
                                                int m45302 = C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), c16302.m38343(2));
                                                c16302.m38351(2);
                                                C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), 0);
                                                this.f47219.m4534(m4530, m45302);
                                                break;
                                            } else {
                                                c16302.m38351(24);
                                                break;
                                            }
                                        case 146:
                                            if (this.f47219.m4543()) {
                                                c16302.m38351(4);
                                                int m383434 = c16302.m38343(4);
                                                c16302.m38351(2);
                                                c16302.m38343(6);
                                                this.f47219.m4533(m383434);
                                                break;
                                            } else {
                                                c16302.m38351(16);
                                                break;
                                            }
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            str2 = "Invalid C1 command: ";
                                            C8083.m21451(m383433, str2);
                                            break;
                                        case 151:
                                            if (this.f47219.m4543()) {
                                                int m45303 = C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), c16302.m38343(2));
                                                c16302.m38343(2);
                                                C1305.m4530(c16302.m38343(2), c16302.m38343(2), c16302.m38343(2), 0);
                                                c16302.m38352();
                                                c16302.m38352();
                                                c16302.m38343(2);
                                                c16302.m38343(2);
                                                int m383435 = c16302.m38343(2);
                                                c16302.m38351(8);
                                                this.f47219.m4540(m45303, m383435);
                                                break;
                                            } else {
                                                c16302.m38351(32);
                                                break;
                                            }
                                        case 152:
                                        case 153:
                                        case EnumC17734.f54268 /* 154 */:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i8 = m383433 - 152;
                                            C1305 c1305 = c1305Arr[i8];
                                            c16302.m38351(2);
                                            boolean m383523 = c16302.m38352();
                                            c16302.m38351(2);
                                            int m383436 = c16302.m38343(3);
                                            boolean m383524 = c16302.m38352();
                                            int m383437 = c16302.m38343(7);
                                            int m383438 = c16302.m38343(8);
                                            int m383439 = c16302.m38343(4);
                                            int m3834310 = c16302.m38343(4);
                                            c16302.m38351(2);
                                            c16302.m38351(6);
                                            c16302.m38351(2);
                                            c1305.m4536(m383523, m383436, m383524, m383437, m383438, m3834310, m383439, c16302.m38343(3), c16302.m38343(3));
                                            if (this.f47215 != i8) {
                                                this.f47215 = i8;
                                                this.f47219 = c1305Arr[i8];
                                                break;
                                            }
                                            break;
                                    }
                                } else if (m383433 <= 255) {
                                    this.f47219.m4532((char) (m383433 & 255));
                                } else {
                                    str = "Invalid base command: ";
                                }
                                z = true;
                            } else if (m383433 != 0) {
                                if (m383433 == 3) {
                                    this.f47217 = m36465();
                                } else if (m383433 != 8) {
                                    switch (m383433) {
                                        case 12:
                                            m36464();
                                            break;
                                        case 13:
                                            this.f47219.m4532('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (m383433 < 17 || m383433 > 23) {
                                                if (m383433 < 24 || m383433 > 31) {
                                                    str = "Invalid C0 command: ";
                                                    break;
                                                } else {
                                                    C19956.m46037("Currently unsupported COMMAND_P16 Command: " + m383433);
                                                    c16302.m38351(16);
                                                    break;
                                                }
                                            } else {
                                                C19956.m46037("Currently unsupported COMMAND_EXT1 Command: " + m383433);
                                                c16302.m38351(8);
                                                break;
                                            }
                                    }
                                } else {
                                    this.f47219.m4531();
                                }
                            }
                            C8083.m21451(m383433, str);
                        } else {
                            m383433 = c16302.m38343(8);
                            if (m383433 > 31) {
                                if (m383433 <= 127) {
                                    if (m383433 == 32) {
                                        this.f47219.m4532(' ');
                                    } else if (m383433 == 33) {
                                        this.f47219.m4532((char) 160);
                                    } else if (m383433 == 37) {
                                        this.f47219.m4532((char) 8230);
                                    } else if (m383433 == 42) {
                                        this.f47219.m4532((char) 352);
                                    } else if (m383433 == 44) {
                                        this.f47219.m4532((char) 338);
                                    } else if (m383433 == 63) {
                                        this.f47219.m4532((char) 376);
                                    } else if (m383433 == 57) {
                                        this.f47219.m4532((char) 8482);
                                    } else if (m383433 == 58) {
                                        this.f47219.m4532((char) 353);
                                    } else if (m383433 == 60) {
                                        this.f47219.m4532((char) 339);
                                    } else if (m383433 != 61) {
                                        switch (m383433) {
                                            case 48:
                                                this.f47219.m4532((char) 9608);
                                                break;
                                            case 49:
                                                this.f47219.m4532((char) 8216);
                                                break;
                                            case 50:
                                                this.f47219.m4532((char) 8217);
                                                break;
                                            case 51:
                                                this.f47219.m4532((char) 8220);
                                                break;
                                            case 52:
                                                this.f47219.m4532((char) 8221);
                                                break;
                                            case 53:
                                                this.f47219.m4532((char) 8226);
                                                break;
                                            default:
                                                switch (m383433) {
                                                    case 118:
                                                        this.f47219.m4532((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.f47219.m4532((char) 8540);
                                                        break;
                                                    case UMErrorCode.E_UM_BE_NOT_MAINPROCESS /* 120 */:
                                                        this.f47219.m4532((char) 8541);
                                                        break;
                                                    case UMErrorCode.E_UM_BE_EMPTY_URL_PATH /* 121 */:
                                                        this.f47219.m4532((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.f47219.m4532(UMLog.HORIZONTAL_LINE);
                                                        break;
                                                    case 123:
                                                        this.f47219.m4532((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.f47219.m4532(UMLog.BOTTOM_LEFT_CORNER);
                                                        break;
                                                    case q.h /* 125 */:
                                                        this.f47219.m4532((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.f47219.m4532((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.f47219.m4532(UMLog.TOP_LEFT_CORNER);
                                                        break;
                                                    default:
                                                        str2 = "Invalid G2 character: ";
                                                        C8083.m21451(m383433, str2);
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f47219.m4532((char) 8480);
                                    }
                                } else if (m383433 <= 159) {
                                    if (m383433 <= 135) {
                                        c16302.m38351(32);
                                    } else if (m383433 <= 143) {
                                        c16302.m38351(40);
                                    } else if (m383433 <= 159) {
                                        c16302.m38351(2);
                                        c16302.m38351(c16302.m38343(6) * 8);
                                    }
                                } else if (m383433 > 255) {
                                    str = "Invalid extended command: ";
                                    C8083.m21451(m383433, str);
                                } else if (m383433 == 160) {
                                    this.f47219.m4532((char) 13252);
                                } else {
                                    C8083.m21451(m383433, "Invalid G3 character: ");
                                    this.f47219.m4532('_');
                                }
                                z = true;
                            } else if (m383433 > 7) {
                                if (m383433 <= 15) {
                                    c16302.m38351(8);
                                } else if (m383433 <= 23) {
                                    c16302.m38351(16);
                                } else if (m383433 <= 31) {
                                    c16302.m38351(24);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            this.f47217 = m36465();
        }
        this.f47214 = null;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private List m36465() {
        C0599 c0599;
        C5539 m4539;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C1305[] c1305Arr = this.f47218;
            if (!c1305Arr[i].m4541() && c1305Arr[i].m4545() && (m4539 = c1305Arr[i].m4539()) != null) {
                arrayList.add(m4539);
            }
        }
        c0599 = C5539.f17138;
        Collections.sort(arrayList, c0599);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C5539) arrayList.get(i2)).f17139);
        }
        return C20195.unmodifiableList(arrayList2);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m36464() {
        for (int i = 0; i < 8; i++) {
            this.f47218[i].m4538();
        }
    }
}
