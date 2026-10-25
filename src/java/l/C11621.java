package l;

import java.nio.ByteOrder;
import java.util.List;

/* compiled from: C8GX */
/* renamed from: l.ۨۢۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11621 implements InterfaceC20088 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f34633;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34634;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11621 m28513(int i, C17714 c17714) {
        InterfaceC20088 interfaceC20088;
        String str;
        C1846 c1846 = new C1846();
        int m41483 = c17714.m41483();
        int i2 = -2;
        while (c17714.m41457() > 8) {
            int m41490 = c17714.m41490();
            int m41485 = c17714.m41485() + c17714.m41490();
            c17714.m41486(m41485);
            if (m41490 != 1414744396) {
                C22909 c22909 = null;
                switch (m41490) {
                    case 1718776947:
                        if (i2 == 2) {
                            c17714.m41478(4);
                            int m414902 = c17714.m41490();
                            int m414903 = c17714.m41490();
                            c17714.m41478(4);
                            int m414904 = c17714.m41490();
                            switch (m414904) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str == null) {
                                C8083.m21451(m414904, "Ignoring track with unsupported compression ");
                            } else {
                                C1297 c1297 = new C1297();
                                c1297.m4453(m414902);
                                c1297.m4457(m414903);
                                c1297.m4465(str);
                                c22909 = new C22909(c1297.m4440());
                            }
                        } else if (i2 == 1) {
                            int m41465 = c17714.m41465();
                            String str2 = m41465 != 1 ? m41465 != 85 ? m41465 != 255 ? m41465 != 8192 ? m41465 != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str2 != null) {
                                int m414652 = c17714.m41465();
                                int m414905 = c17714.m41490();
                                c17714.m41478(6);
                                int m414653 = c17714.m41465();
                                String str3 = C3603.f11424;
                                int m11003 = C3603.m11003(m414653, ByteOrder.LITTLE_ENDIAN);
                                int m414654 = c17714.m41457() > 0 ? c17714.m41465() : 0;
                                C1297 c12972 = new C1297();
                                c12972.m4465(str2);
                                c12972.m4472(m414652);
                                c12972.m4456(m414905);
                                if (str2.equals("audio/raw") && m11003 != 0) {
                                    c12972.m4475(m11003);
                                }
                                if (str2.equals("audio/mp4a-latm") && m414654 > 0) {
                                    byte[] bArr = new byte[m414654];
                                    c17714.m41461(0, m414654, bArr);
                                    c12972.m4446((List) AbstractC14545.of((Object) bArr));
                                }
                                interfaceC20088 = new C22909(c12972.m4440());
                                break;
                            } else {
                                C8083.m21451(m41465, "Ignoring track with unsupported format tag ");
                            }
                        } else {
                            C19956.m46037("Ignoring strf box for unsupported track type: " + C3603.m11045(i2));
                        }
                        interfaceC20088 = c22909;
                        break;
                    case 1751742049:
                        interfaceC20088 = C12326.m29896(c17714);
                        break;
                    case 1752331379:
                        interfaceC20088 = C10210.m25617(c17714);
                        break;
                    case 1852994675:
                        interfaceC20088 = C13736.m33036(c17714);
                        break;
                    default:
                        interfaceC20088 = c22909;
                        break;
                }
            } else {
                interfaceC20088 = m28513(c17714.m41490(), c17714);
            }
            if (interfaceC20088 != null) {
                if (interfaceC20088.getType() == 1752331379) {
                    i2 = ((C10210) interfaceC20088).m25618();
                }
                c1846.m16264(interfaceC20088);
            }
            c17714.m41484(m41485);
            c17714.m41486(m41483);
        }
        return new C11621(i, c1846.m6131());
    }

    public C11621(int i, AbstractC14545 abstractC14545) {
        this.f34634 = i;
        this.f34633 = abstractC14545;
    }

    @Override // l.InterfaceC20088
    public final int getType() {
        return this.f34634;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20088 m28514(Class cls) {
        AbstractC4628 listIterator = this.f34633.listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC20088 interfaceC20088 = (InterfaceC20088) listIterator.next();
            if (interfaceC20088.getClass() == cls) {
                return interfaceC20088;
            }
        }
        return null;
    }
}
