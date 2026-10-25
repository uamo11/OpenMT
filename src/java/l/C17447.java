package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.MediaDataSource;
import bin.mt.plus.R;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* compiled from: 53XL */
/* renamed from: l.ܿܺۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17447 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Paint f53302 = new Paint(1);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f53303 = C11266.m27878(32.0f);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static WeakReference f53304;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40782(InterfaceC11098 interfaceC11098) {
        InputStream inputStream;
        int i;
        int m20384;
        Bitmap m40788;
        if (interfaceC11098 != null) {
            final BitmapFactory.Options options = new BitmapFactory.Options();
            try {
                final C18153 c18153 = new C18153(interfaceC11098);
                int i2 = 1;
                try {
                    options.inJustDecodeBounds = true;
                    inputStream = c18153.f56451;
                    C10164 m16613 = C5930.m16613(inputStream, new InterfaceC12985() { // from class: l.ۨۡۡ
                        @Override // l.InterfaceC12985
                        public final BitmapFactory.Options read() {
                            InputStream m42261 = C18153.this.m42261(true);
                            BitmapFactory.Options options2 = options;
                            BitmapFactory.decodeStream(m42261, null, options2);
                            return options2;
                        }
                    });
                    EnumC12280 enumC12280 = m16613.f30567;
                    if (enumC12280 != EnumC12280.UNKNOWN) {
                        if (enumC12280 == EnumC12280.SVG) {
                            m40788 = m40781(c18153.m42261(false));
                        } else if (enumC12280 != EnumC12280.TGA) {
                            if (m16613.f30566 == null) {
                                BitmapFactory.decodeStream(c18153.m42261(true), null, options);
                            }
                            int i3 = options.outWidth;
                            int i4 = options.outHeight;
                            if (i3 > 0 && i4 > 0) {
                                try {
                                    m20384 = new C7605(c18153.m42261(true), 0).m20384();
                                } catch (Exception unused) {
                                }
                                if (m20384 == 3) {
                                    i = 180;
                                } else if (m20384 != 6) {
                                    if (m20384 == 8) {
                                        i = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                                    }
                                    i = 0;
                                } else {
                                    i = 90;
                                }
                                int i5 = f53303;
                                if (i3 <= i4 && i3 > i5) {
                                    i2 = Math.max(1, i3 / i5);
                                } else if (i3 >= i4 && i4 > i5) {
                                    i2 = Math.max(1, i4 / i5);
                                }
                                options.inJustDecodeBounds = false;
                                options.inSampleSize = i2;
                                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                                Bitmap decodeStream = BitmapFactory.decodeStream(c18153.m42261(false), null, options);
                                if (decodeStream != null) {
                                    Bitmap m40786 = m40786(decodeStream, i5, i3, i4);
                                    if (i != 0) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(i);
                                        m40786 = Bitmap.createBitmap(m40786, 0, 0, m40786.getWidth(), m40786.getHeight(), matrix, false);
                                    }
                                    m40791(m40786);
                                    c18153.close();
                                    return m40786;
                                }
                                c18153.close();
                            }
                        } else if (interfaceC11098.length() <= 268435456) {
                            m40788 = m40788(c18153.m42261(false));
                            m40791(m40788);
                        }
                        c18153.close();
                        return m40788;
                    }
                    c18153.close();
                    return null;
                } finally {
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(5:(1:3)(13:(2:29|(1:31))|32|5|(2:8|6)|9|10|11|12|13|14|15|16|17)|14|15|16|17)|4|5|(1:6)|9|10|11|12|13|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f A[LOOP:0: B:6:0x0052->B:8:0x005f, LOOP_END] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m40788(java.io.InputStream r12) {
        /*
            l.ۤۛۡ r0 = l.C22803.m50895(r12)
            int r1 = r0.f30421
            int r2 = r0.f30424
            int r3 = java.lang.Math.max(r1, r2)
            int r4 = java.lang.Math.min(r1, r2)
            r5 = 500(0x1f4, float:7.0E-43)
            int r6 = l.C17447.f53303
            if (r3 <= r5) goto L19
            float r3 = (float) r6
            float r4 = (float) r4
            goto L26
        L19:
            if (r3 <= r6) goto L28
            float r5 = (float) r3
            float r4 = (float) r4
            float r5 = r5 / r4
            r7 = 1077936128(0x40400000, float:3.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L28
            float r3 = (float) r6
            float r3 = r3 / r7
        L26:
            float r3 = r3 / r4
            goto L2c
        L28:
            float r4 = (float) r6
            float r3 = (float) r3
            float r3 = r4 / r3
        L2c:
            float r4 = (float) r6
            float r5 = r4 / r3
            double r7 = (double) r5
            double r9 = java.lang.Math.ceil(r7)
            int r5 = (int) r9
            int r5 = java.lang.Math.min(r1, r5)
            double r7 = java.lang.Math.ceil(r7)
            int r7 = (int) r7
            int r7 = java.lang.Math.min(r2, r7)
            int r1 = r1 - r5
            int r1 = r1 / 2
            int r2 = r2 - r7
            int r2 = r2 / 2
            android.graphics.Rect r8 = new android.graphics.Rect
            int r9 = r1 + r5
            int r10 = r2 + r7
            r8.<init>(r1, r2, r9, r10)
            r1 = 1
        L52:
            float r2 = (float) r1
            r9 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r9
            float r2 = r2 * r3
            r10 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 > 0) goto L62
            int r1 = r1 * 2
            goto L52
        L62:
            l.᩺ۡۡ r2 = new l.᩺ۡۡ
            r2.<init>()
            android.graphics.Bitmap r12 = l.C22803.m50894(r12, r0, r8, r1, r2)
            r0 = 0
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> La1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r6, r6, r1)     // Catch: java.lang.Throwable -> La1
            float r2 = (float) r5
            float r2 = r2 * r3
            float r5 = (float) r7
            float r5 = r5 * r3
            android.graphics.Paint r3 = new android.graphics.Paint     // Catch: java.lang.Throwable -> L9c
            r3.<init>()     // Catch: java.lang.Throwable -> L9c
            r6 = 0
            r3.setFilterBitmap(r6)     // Catch: java.lang.Throwable -> L9c
            android.graphics.Canvas r6 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L9c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L9c
            android.graphics.RectF r7 = new android.graphics.RectF     // Catch: java.lang.Throwable -> L9c
            float r8 = r4 - r2
            float r8 = r8 / r9
            float r10 = r4 - r5
            float r10 = r10 / r9
            float r2 = r2 + r4
            float r2 = r2 / r9
            float r4 = r4 + r5
            float r4 = r4 / r9
            r7.<init>(r8, r10, r2, r4)     // Catch: java.lang.Throwable -> L9c
            r6.drawBitmap(r12, r0, r7, r3)     // Catch: java.lang.Throwable -> L9c
            r12.recycle()
            return r1
        L9c:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto La2
        La1:
            r1 = move-exception
        La2:
            r12.recycle()
            if (r0 == 0) goto Laa
            r0.recycle()
        Laa:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17447.m40788(java.io.InputStream):android.graphics.Bitmap");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40789(InterfaceC11098 interfaceC11098) {
        C12534 c12534;
        XmlResourceParserC10269 m35994;
        C15518 c15518;
        if (interfaceC11098 != null) {
            try {
                if (interfaceC11098.length() <= 153600) {
                    InputStream mo10616 = interfaceC11098.mo10616();
                    try {
                        mo10616.mark(4);
                        if ((mo10616.read() & 255) == 3 && (mo10616.read() & 255) == 0) {
                            mo10616.reset();
                            if (interfaceC11098 instanceof InterfaceC13713) {
                                c12534 = ((InterfaceC13713) interfaceC11098).mo10617();
                                int i = C15518.f47426;
                                m35994 = C15206.m35970(mo10616).m35994();
                            } else {
                                c12534 = new C12534();
                                int i2 = C15518.f47426;
                                m35994 = C15206.m35970(mo10616).m35994();
                            }
                            try {
                                c15518 = C15518.m36587(m35994, c12534, false);
                            } catch (Exception unused) {
                                c15518 = null;
                            }
                            mo10616.close();
                            if (c15518 != null) {
                                int i3 = f53303;
                                Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                Rect copyBounds = c15518.copyBounds();
                                int intrinsicWidth = c15518.getIntrinsicWidth();
                                int intrinsicHeight = c15518.getIntrinsicHeight();
                                if (intrinsicWidth > intrinsicHeight) {
                                    int i4 = (int) ((i3 / intrinsicWidth) * intrinsicHeight);
                                    int i5 = (i3 - i4) / 2;
                                    c15518.setBounds(0, i5, i3, i4 + i5);
                                } else {
                                    int i6 = (int) ((i3 / intrinsicHeight) * intrinsicWidth);
                                    int i7 = (i3 - i6) / 2;
                                    c15518.setBounds(i7, 0, i6 + i7, i3);
                                }
                                c15518.draw(canvas);
                                c15518.setBounds(copyBounds);
                                m40791(createBitmap);
                                return createBitmap;
                            }
                        }
                        mo10616.close();
                        return null;
                    } finally {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40781(InputStream inputStream) {
        int i;
        try {
            C16312 m38394 = C16312.m38394(inputStream);
            RectF m38408 = m38394.m38408();
            int m38410 = (int) m38394.m38410();
            int m38405 = (int) m38394.m38405();
            if (m38410 == -1 && m38405 == -1) {
                m38410 = (int) (m38408.right - m38408.left);
                m38405 = (int) (m38408.bottom - m38408.top);
            } else if (m38408 == null) {
                m38394.m38400(m38410, m38405);
            }
            if (m38410 > 0 && m38405 > 0) {
                int i2 = f53303;
                Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                RectF rectF = new RectF();
                if (m38410 > m38405) {
                    float f = i2;
                    i = (int) ((f / m38410) * m38405);
                    rectF.set(0.0f, (i2 - i) / 2, f, r2 + i);
                } else {
                    float f2 = i2;
                    int i3 = (int) ((f2 / m38405) * m38410);
                    rectF.set((i2 - i3) / 2, 0.0f, r2 + i3, f2);
                    i = i2;
                    i2 = i3;
                }
                m38394.m38406(i2);
                m38394.m38399(i);
                m38394.m38402(canvas, rectF);
                m40791(createBitmap);
                return createBitmap;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:6|(2:7|8)|(1:10)(2:33|(1:35)(2:36|(1:38)(2:39|(9:41|42|43|12|13|27|28|(1:30)|(1:24)(2:22|23))(1:44))))|11|12|13|27|28|(0)|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m40793(l.AbstractC15440 r8) {
        /*
            java.lang.String r0 = r8.mo23554()
            boolean r0 = l.C19025.m43871(r0)
            int r1 = l.C17447.f53303
            if (r0 == 0) goto L15
            l.ۢ᩸ۜ r8 = l.C19025.m43862(r8, r1)
            android.graphics.Bitmap r8 = r8.m24923()
            return r8
        L15:
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r2 = 0
            boolean r3 = r8.m36488()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L29
            java.lang.String r8 = r8.mo23544()     // Catch: java.lang.Throwable -> L7f
            r0.setDataSource(r8)     // Catch: java.lang.Throwable -> L7f
            goto L6d
        L29:
            boolean r3 = r8.mo31568()     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L3b
            android.app.Application r3 = l.C4925.m14335()     // Catch: java.lang.Throwable -> L7f
            android.net.Uri r8 = r8.mo31567()     // Catch: java.lang.Throwable -> L7f
            r0.setDataSource(r3, r8)     // Catch: java.lang.Throwable -> L7f
            goto L6d
        L3b:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7f
            r4 = 23
            if (r3 < r4) goto L4a
            l.᩺ۢۡ r3 = new l.᩺ۢۡ     // Catch: java.lang.Throwable -> L7f
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L7f
            r0.setDataSource(r3)     // Catch: java.lang.Throwable -> L7f
            goto L6d
        L4a:
            long r3 = r8.mo23127()     // Catch: java.lang.Throwable -> L7f
            r5 = 524288(0x80000, double:2.590327E-318)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L66
            l.ܶ᩵ܿ r3 = l.C16293.f50111     // Catch: java.lang.Throwable -> L7f
            l.ܶ᩵ܿ r3 = r3.m36527()     // Catch: java.lang.Throwable -> L7f
            r8.m36500(r3, r2, r2)     // Catch: java.lang.Throwable -> L80
            java.lang.String r8 = r3.mo23554()     // Catch: java.lang.Throwable -> L80
            r0.setDataSource(r8)     // Catch: java.lang.Throwable -> L80
            goto L6e
        L66:
            java.lang.String r8 = r8.mo23554()     // Catch: java.lang.Throwable -> L7f
            r0.setDataSource(r8)     // Catch: java.lang.Throwable -> L7f
        L6d:
            r3 = r2
        L6e:
            r4 = -1
            android.graphics.Bitmap r8 = r0.getFrameAtTime(r4)     // Catch: java.lang.Throwable -> L80
            r0.release()     // Catch: java.lang.Exception -> L78
            goto L79
        L78:
        L79:
            if (r3 == 0) goto L8b
            r3.mo23552()
            goto L8b
        L7f:
            r3 = r2
        L80:
            r0.release()     // Catch: java.lang.Exception -> L84
            goto L85
        L84:
        L85:
            if (r3 == 0) goto L8a
            r3.mo23552()
        L8a:
            r8 = r2
        L8b:
            if (r8 != 0) goto L8e
            goto L9a
        L8e:
            int r0 = r8.getWidth()
            int r2 = r8.getHeight()
            android.graphics.Bitmap r2 = m40786(r8, r1, r0, r2)
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17447.m40793(l.ܶ᩵ܿ):android.graphics.Bitmap");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9853 m40792(AbstractC15440 abstractC15440) {
        return C19025.m43862(abstractC15440, f53303);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m40787(android.media.MediaDataSource r4) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r1 = 0
            r0.setDataSource(r4)     // Catch: java.lang.Throwable -> L15
            r2 = -1
            android.graphics.Bitmap r4 = r0.getFrameAtTime(r2)     // Catch: java.lang.Throwable -> L15
            r0.release()     // Catch: java.lang.Exception -> L13
            goto L19
        L13:
            goto L19
        L15:
            r0.release()     // Catch: java.lang.Exception -> L18
        L18:
            r4 = r1
        L19:
            if (r4 != 0) goto L1c
            goto L2a
        L1c:
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            int r2 = l.C17447.f53303
            android.graphics.Bitmap r1 = m40786(r4, r2, r0, r1)
        L2a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17447.m40787(android.media.MediaDataSource):android.graphics.Bitmap");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9853 m40784(MediaDataSource mediaDataSource) {
        return C19025.m43860(mediaDataSource, f53303);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40780(Bitmap bitmap, int i, int i2, int i3) {
        return m40786(bitmap, i, i2, i3);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Bitmap m40794(AbstractC15440 abstractC15440) {
        C18090 c18090;
        C18090 c180902 = null;
        try {
            c18090 = new C18090(abstractC15440);
            try {
                Bitmap m39283 = C16709.m39283(c18090);
                if (m39283 != null) {
                    m40785(m39283);
                    C0349.m1793(c18090);
                    return m39283;
                }
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
                c180902 = c18090;
                C0349.m1793(c180902);
                throw th;
            }
        } catch (IOException unused2) {
            c18090 = null;
        } catch (Throwable th2) {
            th = th2;
        }
        C0349.m1793(c18090);
        WeakReference weakReference = f53304;
        Bitmap bitmap = weakReference != null ? (Bitmap) weakReference.get() : null;
        if (bitmap != null) {
            return bitmap;
        }
        Drawable m14305 = C4925.m14305(R.drawable.MT_Protector_res_0x7f08029b);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f53303;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(createBitmap);
        Rect copyBounds = m14305.copyBounds();
        m14305.setBounds(0, 0, i, i);
        m14305.draw(canvas);
        m14305.setBounds(copyBounds);
        f53304 = new WeakReference(createBitmap);
        return createBitmap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m40783(AbstractC15440 abstractC15440) {
        C4021 m43525 = C18838.m43525(abstractC15440);
        if (m43525 == null) {
            return null;
        }
        Drawable m12090 = m43525.m12090();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = f53303;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        Canvas canvas = new Canvas(createBitmap);
        Rect copyBounds = m12090.copyBounds();
        int intrinsicWidth = m12090.getIntrinsicWidth();
        int intrinsicHeight = m12090.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            intrinsicWidth = i;
            intrinsicHeight = intrinsicWidth;
        }
        try {
            m12090.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            float f = i;
            canvas.scale(f / intrinsicWidth, f / intrinsicHeight);
            m12090.draw(canvas);
            m12090.setBounds(copyBounds);
            m40785(createBitmap);
            return createBitmap;
        } catch (Throwable th) {
            m12090.setBounds(copyBounds);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v11, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m40790(l.AbstractC15440 r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17447.m40790(l.ܶ᩵ܿ):android.graphics.Bitmap");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40791(Bitmap bitmap) {
        int m20003;
        if (C10289.m26045(bitmap) <= 0.9f && (m20003 = C7466.m20003(bitmap)) != 0) {
            if (C7466.m20006(m20003, -328966)) {
                C10289.m26046(bitmap, 2.5f, 1, 1, -1442840576);
            } else if (C7466.m20006(m20003, -13619152)) {
                C10289.m26046(bitmap, 3.5f, 1, 1, -1);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40785(Bitmap bitmap) {
        int m20003;
        if (C10289.m26045(bitmap) <= 0.9f && (m20003 = C7466.m20003(bitmap)) != 0) {
            if (C7466.m20006(m20003, -328966)) {
                C10289.m26046(bitmap, 1.0f, 0, 0, -1434419072);
            } else if (C7466.m20006(m20003, -13619152)) {
                C10289.m26046(bitmap, 2.0f, 0, 0, -1432313696);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap m40786(android.graphics.Bitmap r7, int r8, int r9, int r10) {
        /*
            int r3 = r7.getWidth()
            int r4 = r7.getHeight()
            if (r3 <= r4) goto Ld
            float r0 = (float) r3
            float r1 = (float) r4
            goto Lf
        Ld:
            float r0 = (float) r4
            float r1 = (float) r3
        Lf:
            int r9 = java.lang.Math.max(r9, r10)
            r10 = 500(0x1f4, float:7.0E-43)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r9 <= r10) goto L1b
            float r9 = (float) r8
            goto L30
        L1b:
            float r9 = (float) r8
            int r10 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r10 >= 0) goto L21
            goto L2d
        L21:
            int r10 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r10 <= 0) goto L32
            float r10 = r0 / r1
            r5 = 1077936128(0x40400000, float:3.0)
            int r10 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r10 > 0) goto L2f
        L2d:
            float r9 = r9 / r0
            goto L34
        L2f:
            float r9 = r9 / r5
        L30:
            float r9 = r9 / r1
            goto L34
        L32:
            r9 = 1065353216(0x3f800000, float:1.0)
        L34:
            int r10 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r10 == 0) goto L54
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r5.postScale(r9, r9)
            r2 = 0
            r6 = 1
            r1 = 0
            r0 = r7
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r0, r1, r2, r3, r4, r5, r6)
            r7.recycle()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            r7 = r9
        L54:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r8, r8, r9)
            android.graphics.Canvas r10 = new android.graphics.Canvas
            r10.<init>(r9)
            int r0 = r8 - r3
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r8 = r8 - r4
            float r8 = (float) r8
            float r8 = r8 / r1
            android.graphics.Paint r1 = l.C17447.f53302
            r10.drawBitmap(r7, r0, r8, r1)
            r7.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17447.m40786(android.graphics.Bitmap, int, int, int):android.graphics.Bitmap");
    }
}
