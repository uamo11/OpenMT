package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.alipay.sdk.m.p.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: F8V3 */
/* renamed from: l.֫᩵ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2032 implements InterfaceC9773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f6775;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Canvas f6776;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Paint f6777;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13299 f6778;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f6779;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12594 f6780;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7655 f6781;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f6772 = {0, 7, 8, 15};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f6774 = {0, 119, -120, -1};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f6773 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6610(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    public C2032(List list) {
        C17714 c17714 = new C17714((byte[]) list.get(0));
        int m41464 = c17714.m41464();
        int m414642 = c17714.m41464();
        Paint paint = new Paint();
        this.f6779 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f6777 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f6776 = new Canvas();
        this.f6780 = new C12594(719, 575, 0, 719, 0, 575);
        this.f6778 = new C13299(0, new int[]{0, -1, -16777216, -8421505}, m6615(), m6616());
        this.f6781 = new C7655(m41464, m414642);
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        C7655 c7655;
        C12866 c12866;
        int i3;
        ArrayList arrayList;
        C7655 c76552;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr;
        C23177 c23177;
        int i11;
        int i12;
        int i13;
        int i14;
        C16302 c16302 = new C16302(bArr, i + i2);
        c16302.m38354(i);
        while (true) {
            int m38339 = c16302.m38339();
            c7655 = this.f6781;
            if (m38339 >= 48 && c16302.m38343(8) == 15) {
                int m38343 = c16302.m38343(8);
                int i15 = 16;
                int m383432 = c16302.m38343(16);
                int m383433 = c16302.m38343(16);
                int m38348 = c16302.m38348() + m383433;
                if (m383433 * 8 > c16302.m38339()) {
                    C19956.m46037("Data field length exceeds limit");
                    c16302.m38351(c16302.m38339());
                } else {
                    switch (m38343) {
                        case 16:
                            if (m383432 == c7655.f23640) {
                                C6244 c6244 = c7655.f23641;
                                c16302.m38343(8);
                                int m383434 = c16302.m38343(4);
                                int m383435 = c16302.m38343(2);
                                c16302.m38351(2);
                                int i16 = m383433 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i16 > 0) {
                                    int m383436 = c16302.m38343(8);
                                    c16302.m38351(8);
                                    i16 -= 6;
                                    sparseArray.put(m383436, new C11889(c16302.m38343(16), c16302.m38343(16)));
                                }
                                C6244 c62442 = new C6244(m383434, m383435, sparseArray);
                                if (m383435 != 0) {
                                    c7655.f23641 = c62442;
                                    c7655.f23634.clear();
                                    c7655.f23639.clear();
                                    c7655.f23636.clear();
                                    break;
                                } else if (c6244 != null && c6244.f19325 != m383434) {
                                    c7655.f23641 = c62442;
                                    break;
                                }
                            }
                            break;
                        case 17:
                            C6244 c62443 = c7655.f23641;
                            SparseArray sparseArray2 = c7655.f23634;
                            if (m383432 == c7655.f23640 && c62443 != null) {
                                int m383437 = c16302.m38343(8);
                                c16302.m38351(4);
                                boolean m38352 = c16302.m38352();
                                c16302.m38351(3);
                                int m383438 = c16302.m38343(16);
                                int m383439 = c16302.m38343(16);
                                c16302.m38343(3);
                                int m3834310 = c16302.m38343(3);
                                c16302.m38351(2);
                                int m3834311 = c16302.m38343(8);
                                int m3834312 = c16302.m38343(8);
                                int m3834313 = c16302.m38343(4);
                                int m3834314 = c16302.m38343(2);
                                c16302.m38351(2);
                                int i17 = m383433 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i17 > 0) {
                                    int m3834315 = c16302.m38343(i15);
                                    int m3834316 = c16302.m38343(2);
                                    c16302.m38343(2);
                                    int m3834317 = c16302.m38343(12);
                                    c16302.m38351(4);
                                    int m3834318 = c16302.m38343(12);
                                    int i18 = i17 - 6;
                                    if (m3834316 == 1 || m3834316 == 2) {
                                        c16302.m38343(8);
                                        c16302.m38343(8);
                                        i17 -= 8;
                                    } else {
                                        i17 = i18;
                                    }
                                    sparseArray3.put(m3834315, new C14004(m3834317, m3834318));
                                    i15 = 16;
                                }
                                C23177 c231772 = new C23177(m383437, m38352, m383438, m383439, m3834310, m3834311, m3834312, m3834313, m3834314, sparseArray3);
                                if (c62443.f19324 == 0 && (c23177 = (C23177) sparseArray2.get(m383437)) != null) {
                                    SparseArray sparseArray4 = c23177.f74502;
                                    for (int i19 = 0; i19 < sparseArray4.size(); i19++) {
                                        c231772.f74502.put(sparseArray4.keyAt(i19), (C14004) sparseArray4.valueAt(i19));
                                    }
                                }
                                sparseArray2.put(c231772.f74500, c231772);
                                break;
                            }
                            break;
                        case 18:
                            if (m383432 == c7655.f23640) {
                                C13299 m6612 = m6612(c16302, m383433);
                                c7655.f23639.put(m6612.f39814, m6612);
                                break;
                            } else if (m383432 == c7655.f23637) {
                                C13299 m66122 = m6612(c16302, m383433);
                                c7655.f23633.put(m66122.f39814, m66122);
                                break;
                            }
                            break;
                        case 19:
                            if (m383432 == c7655.f23640) {
                                C10478 m6611 = m6611(c16302);
                                c7655.f23636.put(m6611.f31442, m6611);
                                break;
                            } else if (m383432 == c7655.f23637) {
                                C10478 m66112 = m6611(c16302);
                                c7655.f23635.put(m66112.f31442, m66112);
                                break;
                            }
                            break;
                        case 20:
                            if (m383432 == c7655.f23640) {
                                c16302.m38351(4);
                                boolean m383522 = c16302.m38352();
                                c16302.m38351(3);
                                int m3834319 = c16302.m38343(16);
                                int m3834320 = c16302.m38343(16);
                                if (m383522) {
                                    i13 = c16302.m38343(16);
                                    i11 = c16302.m38343(16);
                                    i14 = c16302.m38343(16);
                                    i12 = c16302.m38343(16);
                                } else {
                                    i11 = m3834319;
                                    i12 = m3834320;
                                    i13 = 0;
                                    i14 = 0;
                                }
                                c7655.f23638 = new C12594(m3834319, m3834320, i13, i11, i14, i12);
                                break;
                            }
                            break;
                    }
                    c16302.m38347(m38348 - c16302.m38348());
                }
            }
        }
        C6244 c62444 = c7655.f23641;
        if (c62444 == null) {
            c12866 = new C12866(-9223372036854775807L, -9223372036854775807L, AbstractC14545.of());
        } else {
            C12594 c12594 = c7655.f23638;
            if (c12594 == null) {
                c12594 = this.f6780;
            }
            Bitmap bitmap = this.f6775;
            Canvas canvas = this.f6776;
            if (bitmap == null || c12594.f37987 + 1 != bitmap.getWidth() || c12594.f37985 + 1 != this.f6775.getHeight()) {
                Bitmap createBitmap = Bitmap.createBitmap(c12594.f37987 + 1, c12594.f37985 + 1, Bitmap.Config.ARGB_8888);
                this.f6775 = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = c62444.f19323;
            int i20 = 0;
            while (i20 < sparseArray5.size()) {
                canvas.save();
                C11889 c11889 = (C11889) sparseArray5.valueAt(i20);
                C23177 c231773 = (C23177) c7655.f23634.get(sparseArray5.keyAt(i20));
                int i21 = c11889.f35518;
                int i22 = c12594.f37988;
                int i23 = c12594.f37985;
                int i24 = c12594.f37987;
                int i25 = i21 + i22;
                int i26 = c11889.f35519 + c12594.f37989;
                int i27 = c231773.f74496;
                int i28 = c231773.f74494;
                int i29 = c231773.f74501;
                int i30 = i25 + i27;
                SparseArray sparseArray6 = sparseArray5;
                int i31 = i20;
                int i32 = i26 + i29;
                int i33 = i30;
                canvas.clipRect(i25, i26, Math.min(i30, c12594.f37986), Math.min(i32, c12594.f37990));
                C13299 c13299 = (C13299) c7655.f23639.get(i28);
                if (c13299 == null && (c13299 = (C13299) c7655.f23633.get(i28)) == null) {
                    c13299 = this.f6778;
                }
                SparseArray sparseArray7 = c231773.f74502;
                int i34 = 0;
                C12594 c125942 = c12594;
                while (i34 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i34);
                    int i35 = i34;
                    C14004 c14004 = (C14004) sparseArray7.valueAt(i34);
                    SparseArray sparseArray8 = sparseArray7;
                    C10478 c10478 = (C10478) c7655.f23636.get(keyAt);
                    if (c10478 == null) {
                        c10478 = (C10478) c7655.f23635.get(keyAt);
                    }
                    C10478 c104782 = c10478;
                    if (c104782 != null) {
                        Paint paint = c104782.f31443 ? null : this.f6779;
                        int i36 = c231773.f74497;
                        c76552 = c7655;
                        int i37 = c14004.f42363 + i25;
                        int i38 = i26 + c14004.f42364;
                        if (i36 == 3) {
                            iArr = c13299.f39813;
                        } else if (i36 == 2) {
                            iArr = c13299.f39812;
                        } else {
                            iArr = c13299.f39811;
                        }
                        int[] iArr2 = iArr;
                        arrayList = arrayList2;
                        i8 = i33;
                        i4 = i29;
                        i5 = i27;
                        i9 = i32;
                        i10 = i25;
                        i6 = i24;
                        i7 = i23;
                        m6613(c104782.f31444, iArr2, i36, i37, i38, paint, canvas);
                        m6613(c104782.f31441, iArr2, i36, i37, i38 + 1, paint, canvas);
                    } else {
                        arrayList = arrayList2;
                        c76552 = c7655;
                        i4 = i29;
                        i5 = i27;
                        i6 = i24;
                        i7 = i23;
                        i8 = i33;
                        i9 = i32;
                        i10 = i25;
                    }
                    i34 = i35 + 1;
                    i25 = i10;
                    sparseArray7 = sparseArray8;
                    c7655 = c76552;
                    i29 = i4;
                    i27 = i5;
                    i24 = i6;
                    i23 = i7;
                    i32 = i9;
                    i33 = i8;
                    arrayList2 = arrayList;
                }
                ArrayList arrayList3 = arrayList2;
                C7655 c76553 = c7655;
                int i39 = i29;
                int i40 = i27;
                int i41 = i24;
                int i42 = i23;
                int i43 = i33;
                int i44 = i32;
                int i45 = i25;
                if (c231773.f74499) {
                    int i46 = c231773.f74497;
                    if (i46 == 3) {
                        i3 = c13299.f39813[c231773.f74495];
                    } else if (i46 == 2) {
                        i3 = c13299.f39812[c231773.f74503];
                    } else {
                        i3 = c13299.f39811[c231773.f74498];
                    }
                    Paint paint2 = this.f6777;
                    paint2.setColor(i3);
                    canvas.drawRect(i45, i26, i43, i44, paint2);
                }
                C21927 c21927 = new C21927();
                c21927.m49387(Bitmap.createBitmap(this.f6775, i45, i26, i40, i39));
                float f = i45;
                float f2 = i41;
                c21927.m49391(f / f2);
                c21927.m49393(0);
                float f3 = i42;
                c21927.m49385(i26 / f3, 0);
                c21927.m49386(0);
                c21927.m49401(i40 / f2);
                c21927.m49384(i39 / f3);
                arrayList2 = arrayList3;
                arrayList2.add(c21927.m49383());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i20 = i31 + 1;
                sparseArray5 = sparseArray6;
                c12594 = c125942;
                c7655 = c76553;
            }
            c12866 = new C12866(-9223372036854775807L, -9223372036854775807L, arrayList2);
        }
        interfaceC23483.accept(c12866);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13299 m6612(C16302 c16302, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int m38343 = c16302.m38343(8);
        c16302.m38351(8);
        int i8 = 2;
        int i9 = i - 2;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] m6615 = m6615();
        int[] m6616 = m6616();
        while (i9 > 0) {
            int m383432 = c16302.m38343(i7);
            int m383433 = c16302.m38343(i7);
            int[] iArr2 = (m383433 & 128) != 0 ? iArr : (m383433 & 64) != 0 ? m6615 : m6616;
            if ((m383433 & 1) != 0) {
                i3 = c16302.m38343(i7);
                i6 = c16302.m38343(i7);
                i5 = c16302.m38343(i7);
                i4 = c16302.m38343(i7);
                i2 = i9 - 6;
            } else {
                int m383434 = c16302.m38343(6) << i8;
                int m383435 = c16302.m38343(4) << 4;
                int m383436 = c16302.m38343(4) << 4;
                int m383437 = c16302.m38343(i8) << 6;
                i2 = i9 - 4;
                i3 = m383434;
                i4 = m383437;
                i5 = m383436;
                i6 = m383435;
            }
            if (i3 == 0) {
                i6 = 0;
                i5 = 0;
                i4 = 255;
            }
            double d = i3;
            double d2 = i6 + a.g;
            int i10 = i2;
            double d3 = i5 + a.g;
            iArr2[m383432] = m6610((byte) (255 - (i4 & 255)), C3603.m11000((int) ((1.402d * d2) + d), 0, 255), C3603.m11000((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C3603.m11000((int) ((d3 * 1.772d) + d), 0, 255));
            i7 = 8;
            i8 = 2;
            i9 = i10;
            iArr = iArr;
        }
        return new C13299(m38343, iArr, m6615, m6616);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10478 m6611(C16302 c16302) {
        byte[] bArr;
        int m38343 = c16302.m38343(16);
        c16302.m38351(4);
        int m383432 = c16302.m38343(2);
        boolean m38352 = c16302.m38352();
        c16302.m38351(1);
        byte[] bArr2 = C3603.f11423;
        if (m383432 == 1) {
            c16302.m38351(c16302.m38343(8) * 16);
        } else if (m383432 == 0) {
            int m383433 = c16302.m38343(16);
            int m383434 = c16302.m38343(16);
            if (m383433 > 0) {
                bArr2 = new byte[m383433];
                c16302.m38345(m383433, bArr2);
            }
            if (m383434 > 0) {
                bArr = new byte[m383434];
                c16302.m38345(m383434, bArr);
                return new C10478(bArr2, bArr, m38343, m38352);
            }
        }
        bArr = bArr2;
        return new C10478(bArr2, bArr, m38343, m38352);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m6615() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m6610(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m6610(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m6616() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m6610(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m6610(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m6610(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m6610(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m6610(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c3 A[LOOP:3: B:84:0x0135->B:97:0x01c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01bd A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m6613(byte[] r20, int[] r21, int r22, int r23, int r24, android.graphics.Paint r25, android.graphics.Canvas r26) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2032.m6613(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m6614(int i, int i2, C16302 c16302) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c16302.m38343(i2);
        }
        return bArr;
    }

    @Override // l.InterfaceC9773
    public final void reset() {
        C7655 c7655 = this.f6781;
        c7655.f23634.clear();
        c7655.f23639.clear();
        c7655.f23636.clear();
        c7655.f23633.clear();
        c7655.f23635.clear();
        c7655.f23638 = null;
        c7655.f23641 = null;
    }
}
