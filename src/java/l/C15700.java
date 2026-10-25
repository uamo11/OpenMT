package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.alipay.sdk.m.t0.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: M8TF */
/* renamed from: l.ܺۙ֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C15700 extends AbstractC14702 implements InterfaceC4162 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C1263 f48388;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public SurfaceHolder f48389;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f48390;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C17008 f48391;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f48392;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14310 f48393;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1242 f48394;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8840 f48395;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C6404 f48396;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C4288 f48397;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f48398;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17546 f48399;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f48400;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C9352 f48401;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public boolean f48402;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f48403;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C10784 f48404;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C20888 f48405;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C12838 f48406;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C19936 f48407;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public TextureView f48408;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C14185 f48409;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final long f48410;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13257 f48411;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final long f48412;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f48413;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1318 f48414;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19477 f48415;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C15449 f48416;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f48417;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Surface f48418;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final C18771 f48419;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f48420;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final C2543 f48421;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18958 f48422;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8458 f48423;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f48424;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C22072 f48425;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f48426;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final SurfaceHolderCallbackC20641 f48427;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f48428;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f48429;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public boolean f48430;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18231 f48431;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1837[] f48432;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Looper f48433;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f48434;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f48435;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public C20005 f48436;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public AbstractC6079 f48437;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C17546 f48438;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final long f48439;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public Object f48440;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C18958 f48441;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1837[] f48442;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48443;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5497 f48444;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f48445;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final boolean f48446;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C22485 f48447;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArraySet f48448;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f48449;

    static {
        C16840.m39615("media3.exoplayer");
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۧ */
    public final void mo4587(InterfaceC0612 interfaceC0612) {
        interfaceC0612.getClass();
        this.f48425.m49656((Object) interfaceC0612);
    }

    public C15700(C16155 c16155) {
        C16155 c161552;
        C14185 c14185;
        Handler.Callback callback;
        final C15700 c15700 = this;
        ContextWrapper contextWrapper = c16155.f49766;
        c15700.f48393 = new C14310();
        try {
            C19956.m46035("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C3603.f11424 + "]");
            C14185 c141852 = c16155.f49770;
            c15700.f48429 = contextWrapper.getApplicationContext();
            c16155.f49757.getClass();
            c15700.f48415 = new C20182(c141852);
            c15700.f48434 = c16155.f49759;
            c15700.f48431 = c16155.f49765;
            c15700.f48400 = c16155.f49774;
            c15700.f48398 = false;
            c15700.f48435 = c16155.f49778;
            SurfaceHolderCallbackC20641 surfaceHolderCallbackC20641 = new SurfaceHolderCallbackC20641(c15700);
            c15700.f48427 = surfaceHolderCallbackC20641;
            c15700.f48401 = new C9352();
            Handler handler = new Handler(c16155.f49764);
            InterfaceC23709 interfaceC23709 = (InterfaceC23709) c16155.f49773.get();
            InterfaceC1837[] mo20781 = interfaceC23709.mo20781(handler, surfaceHolderCallbackC20641, surfaceHolderCallbackC20641, surfaceHolderCallbackC20641, surfaceHolderCallbackC20641);
            c15700.f48432 = mo20781;
            C22632.m50634(mo20781.length > 0);
            c15700.f48442 = new InterfaceC1837[mo20781.length];
            int i = 0;
            while (true) {
                InterfaceC1837[] interfaceC1837Arr = c15700.f48442;
                if (i >= interfaceC1837Arr.length) {
                    break;
                }
                interfaceC23709.mo20780(c15700.f48432[i]);
                interfaceC1837Arr[i] = null;
                i++;
            }
            AbstractC5497 abstractC5497 = (AbstractC5497) c16155.f49767.get();
            c15700.f48444 = abstractC5497;
            c15700.f48395 = (InterfaceC8840) c16155.f49768.get();
            C11847 m28940 = C11847.m28940((ContextWrapper) c16155.f49769.f56266);
            c15700.f48411 = m28940;
            c15700.f48446 = c16155.f49776;
            C9599 c9599 = c16155.f49762;
            c15700.f48412 = c16155.f49760;
            c15700.f48410 = c16155.f49756;
            c15700.f48439 = c16155.f49763;
            C20888 c20888 = c16155.f49755;
            c15700.f48405 = c20888;
            Looper looper = c16155.f49764;
            c15700.f48433 = looper;
            c15700.f48409 = c141852;
            c15700.f48414 = c15700;
            c15700.f48425 = new C22072(looper, c141852, new C7166());
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            c15700.f48448 = copyOnWriteArraySet;
            c15700.f48420 = new ArrayList();
            c15700.f48394 = new C5476();
            InterfaceC1837[] interfaceC1837Arr2 = c15700.f48432;
            C1263 c1263 = new C1263(new C17359[interfaceC1837Arr2.length], new InterfaceC9731[interfaceC1837Arr2.length], C14017.f42393, null);
            c15700.f48388 = c1263;
            c15700.f48447 = new C22485();
            C4141 c4141 = new C4141();
            c4141.m12427(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            c4141.m12425(29, abstractC5497 instanceof C6908);
            c4141.m12425(23, false);
            c4141.m12425(25, false);
            c4141.m12425(33, false);
            c4141.m12425(26, false);
            c4141.m12425(34, false);
            C18958 m12423 = c4141.m12423();
            c15700.f48422 = m12423;
            C4141 c41412 = new C4141();
            c41412.m12426(m12423);
            c41412.m12424(4);
            c41412.m12424(10);
            c15700.f48441 = c41412.m12423();
            c15700.f48392 = c141852.mo33832(looper, null);
            C15449 c15449 = new C15449(c15700);
            c15700.f48416 = c15449;
            c15700.f48406 = C12838.m31224(c1263);
            c15700.f48415.mo44880(c15700, looper);
            final C13830 c13830 = new C13830(c16155.f49758);
            Context context = c15700.f48429;
            InterfaceC1837[] interfaceC1837Arr3 = c15700.f48432;
            InterfaceC1837[] interfaceC1837Arr4 = c15700.f48442;
            c16155.f49775.getClass();
            try {
                C19936 c19936 = new C19936(context, interfaceC1837Arr3, interfaceC1837Arr4, abstractC5497, c1263, new C11986(), m28940, c15700.f48424, c15700.f48428, c15700.f48415, c9599, c16155.f49761, c16155.f49772, looper, c141852, c15449, c13830, c15700.f48401);
                c15700 = this;
                c15700.f48407 = c19936;
                Looper m46014 = c19936.m46014();
                c15700.f48424 = 0;
                C17546 c17546 = C17546.f53597;
                c15700.f48399 = c17546;
                c15700.f48438 = c17546;
                c15700.f48443 = -1;
                c15700.f48397 = C4288.f13838;
                c15700.f48426 = true;
                c15700.mo4587(c15700.f48415);
                m28940.mo28943(new Handler(looper), c15700.f48415);
                copyOnWriteArraySet.add(c15700.f48427);
                if (Build.VERSION.SDK_INT >= 31) {
                    final Context context2 = c15700.f48429;
                    c161552 = c16155;
                    final boolean z = c161552.f49777;
                    callback = null;
                    c14185 = c141852;
                    c14185.mo33832(c19936.m46014(), null).mo17760(new Runnable() { // from class: l.ܽۙ֫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C11715 m28595 = C11715.m28595(context2);
                            if (m28595 == null) {
                                C19956.m46037("MediaMetricsService unavailable.");
                                return;
                            }
                            if (z) {
                                c15700.m37035(m28595);
                            }
                            c13830.m33185(m28595.m28605());
                        }
                    });
                } else {
                    c161552 = c16155;
                    c14185 = c141852;
                    callback = null;
                }
                Handler.Callback callback2 = callback;
                C10784 c10784 = new C10784(0, m46014, looper, c14185, new InterfaceC1611() { // from class: l.᩹᩶֫
                    @Override // l.InterfaceC1611
                    /* renamed from: ֫ */
                    public final void mo5475(Object obj, Object obj2) {
                        ((Integer) obj).getClass();
                        C15700.m37002(C15700.this, ((Integer) obj2).intValue());
                    }
                });
                c15700.f48404 = c10784;
                c10784.m26985(new Runnable() { // from class: l.᩶᩶֫
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15700.m37001(C15700.this);
                    }
                });
                C14185 c141853 = c14185;
                C8458 c8458 = new C8458(contextWrapper, m46014, c161552.f49764, c15700.f48427, c14185);
                c15700.f48423 = c8458;
                c8458.m22140();
                C2543 c2543 = new C2543();
                contextWrapper.getApplicationContext();
                c141853.mo33832(m46014, callback2);
                c15700.f48421 = c2543;
                C18771 c18771 = new C18771();
                contextWrapper.getApplicationContext();
                c141853.mo33832(m46014, callback2);
                c15700.f48419 = c18771;
                C16113 c16113 = C16113.f49648;
                c15700.f48396 = C6404.f19812;
                c15700.f48391 = C17008.f52163;
                c19936.m46006(c20888);
                c19936.m46005(c15700.f48431);
                c15700.m36995(1, 3, c15700.f48431);
                c15700.m36995(2, 4, Integer.valueOf(c15700.f48400));
                c15700.m36995(2, 5, (Object) 0);
                c15700.m36995(1, 9, Boolean.valueOf(c15700.f48398));
                c15700.m36995(6, 8, c15700.f48401);
                c15700.m36995(-1, 16, Integer.valueOf(c15700.f48434));
                c15700.f48393.m34151();
            } catch (Throwable th) {
                th = th;
                c15700 = this;
                c15700.f48393.m34151();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m37021(final C15700 c15700, final C14995 c14995) {
        c15700.f48392.mo17760(new Runnable() { // from class: l.ۙ᩶֫
            @Override // java.lang.Runnable
            public final void run() {
                C15700.m37009(C15700.this, c14995);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37001(C15700 c15700) {
        C10784 c10784 = c15700.f48404;
        Context context = c15700.f48429;
        String str = C3603.f11424;
        c10784.m26984(Integer.valueOf(C2171.m7181(context).generateAudioSessionId()));
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֨ */
    public final Looper mo4561() {
        return this.f48433;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩹ */
    public final C18958 mo4609() {
        m37032();
        return this.f48441;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩳ */
    public final int mo4603() {
        m37032();
        return this.f48406.f38569;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֡ */
    public final int mo4560() {
        m37032();
        return this.f48406.f38568;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۖ */
    public final C18273 mo4572() {
        m37032();
        return this.f48406.f38566;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۧ */
    public final void mo4584() {
        m37032();
        C12838 c12838 = this.f48406;
        if (c12838.f38569 != 1) {
            return;
        }
        C12838 m31233 = c12838.m31233((C18273) null);
        C12838 m36992 = m36992(m31233, m31233.f38560.m14110() ? 4 : 2);
        this.f48417++;
        this.f48407.m46015();
        m37000(m36992, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4566(List list) {
        m37032();
        ArrayList m37019 = m37019(list);
        m37032();
        m36999(m37019, -1, -9223372036854775807L, true);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4563(long j, List list) {
        m37032();
        ArrayList m37019 = m37019(list);
        m37032();
        m36999(m37019, 0, j, false);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۗ */
    public final void mo4573() {
        C13543 c13543;
        int i;
        Pair m36989;
        Pair pair;
        boolean z;
        C12838 m36993;
        int i2;
        m37032();
        ArrayList arrayList = this.f48420;
        int size = arrayList.size();
        int min = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || min == 0) {
            return;
        }
        C12838 c12838 = this.f48406;
        int m37026 = m37026(c12838);
        long m36988 = m36988(c12838);
        AbstractC4846 abstractC4846 = c12838.f38560;
        int size2 = arrayList.size();
        this.f48417++;
        for (int i3 = min - 1; i3 >= 0; i3--) {
            arrayList.remove(i3);
        }
        this.f48394 = this.f48394.mo4078(min);
        C13543 c135432 = new C13543(arrayList, this.f48394);
        if (abstractC4846.m14110() || c135432.m14110()) {
            c13543 = c135432;
            i = size2;
            boolean z2 = !abstractC4846.m14110() && c13543.m14110();
            int i4 = z2 ? -1 : m37026;
            if (z2) {
                m36988 = -9223372036854775807L;
            }
            m36989 = m36989(c13543, i4, m36988);
        } else {
            pair = abstractC4846.m14100(this.f44904, this.f48447, m37026, C3603.m11014(m36988));
            Object obj = pair.first;
            if (c135432.mo14098(obj) != -1) {
                z = true;
                c13543 = c135432;
                i = size2;
                m36993 = m36993(c12838, c13543, pair);
                i2 = m36993.f38569;
                if (i2 != z && i2 != 4 && min > 0 && min == i && m37026 >= m36993.f38560.mo14107()) {
                    m36993 = m36992(m36993, 4);
                }
                C12838 c128382 = m36993;
                this.f48407.m46001(min, this.f48394);
                m37000(c128382, 0, z ^ c128382.f38574.f49112.equals(this.f48406.f38574.f49112), 4, m37018(c128382), -1, false);
            }
            c13543 = c135432;
            i = size2;
            int m45919 = C19936.m45919(this.f44904, this.f48447, this.f48424, this.f48428, obj, abstractC4846, c13543);
            if (m45919 != -1) {
                C20369 c20369 = this.f44904;
                c13543.mo14103(m45919, c20369, 0L);
                m36989 = m36989(c13543, m45919, C3603.m11037(c20369.f65749));
            } else {
                m36989 = m36989(c13543, -1, -9223372036854775807L);
            }
        }
        pair = m36989;
        z = true;
        m36993 = m36993(c12838, c13543, pair);
        i2 = m36993.f38569;
        if (i2 != z) {
            m36993 = m36992(m36993, 4);
        }
        C12838 c1283822 = m36993;
        this.f48407.m46001(min, this.f48394);
        m37000(c1283822, 0, z ^ c1283822.f38574.f49112.equals(this.f48406.f38574.f49112), 4, m37018(c1283822), -1, false);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4570(boolean z) {
        m37032();
        m36996(1, z);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩶ */
    public final boolean mo4607() {
        m37032();
        return this.f48406.f38571;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4562(final int i) {
        m37032();
        if (this.f48424 != i) {
            this.f48424 = i;
            this.f48407.m46010(i);
            InterfaceC7961 interfaceC7961 = new InterfaceC7961() { // from class: l.۠᩶֫
                @Override // l.InterfaceC7961
                public final void invoke(Object obj) {
                    ((InterfaceC0612) obj).mo2516(i);
                }
            };
            C22072 c22072 = this.f48425;
            c22072.m49655(8, interfaceC7961);
            m37014();
            c22072.m49654();
        }
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۜ */
    public final int mo4578() {
        m37032();
        return this.f48424;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۧ */
    public final void mo4588(final boolean z) {
        m37032();
        if (this.f48428 != z) {
            this.f48428 = z;
            this.f48407.m46012(z);
            InterfaceC7961 interfaceC7961 = new InterfaceC7961() { // from class: l.ۗ᩶֫
                @Override // l.InterfaceC7961
                public final void invoke(Object obj) {
                    ((InterfaceC0612) obj).mo2514(z);
                }
            };
            C22072 c22072 = this.f48425;
            c22072.m49655(9, interfaceC7961);
            m37014();
            c22072.m49654();
        }
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫֫ */
    public final boolean mo4571() {
        m37032();
        return this.f48428;
    }

    @Override // l.AbstractC14702
    /* renamed from: ֫ */
    public final void mo34995(long j, int i, boolean z) {
        m37032();
        if (i == -1) {
            return;
        }
        C22632.m50631(i >= 0);
        AbstractC4846 abstractC4846 = this.f48406.f38560;
        if (abstractC4846.m14110() || i < abstractC4846.mo14107()) {
            this.f48415.mo44891();
            this.f48417++;
            if (mo4608()) {
                C19956.m46037("seekTo ignored because an ad is playing");
                C14995 c14995 = new C14995(this.f48406);
                c14995.m35523(1);
                m37021(this.f48416.f47307, c14995);
                return;
            }
            C12838 c12838 = this.f48406;
            int i2 = c12838.f38569;
            if (i2 == 3 || (i2 == 4 && !abstractC4846.m14110())) {
                c12838 = this.f48406.m31227(2);
            }
            int mo4579 = mo4579();
            C12838 m36993 = m36993(c12838, abstractC4846, m36989(abstractC4846, i, j));
            this.f48407.m46003(abstractC4846, i, C3603.m11014(j));
            m37000(m36993, 0, true, 1, m37018(m36993), mo4579, z);
        }
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܳ֫ */
    public final long mo4596() {
        m37032();
        return this.f48412;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩺ */
    public final long mo4610() {
        m37032();
        return this.f48410;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۙ */
    public final long mo4575() {
        m37032();
        return this.f48439;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4568(C2730 c2730) {
        m37032();
        if (this.f48406.f38578.equals(c2730)) {
            return;
        }
        C12838 m31229 = this.f48406.m31229(c2730);
        this.f48417++;
        this.f48407.m46011(c2730);
        m37000(m31229, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܽ */
    public final C2730 mo4599() {
        m37032();
        return this.f48406.f38578;
    }

    @Override // l.InterfaceC1318
    public final void stop() {
        m37032();
        m37012((C18273) null);
        AbstractC14545 of = AbstractC14545.of();
        long j = this.f48406.f38563;
        this.f48397 = new C4288(of);
    }

    @Override // l.InterfaceC4162
    /* renamed from: ֫ */
    public final void mo12583() {
        C19956.m46035("Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + C3603.f11424 + "] [" + C16840.m39614() + "]");
        m37032();
        this.f48423.m22140();
        this.f48421.m8057(false);
        this.f48419.m43433(false);
        if (!this.f48407.m46013()) {
            this.f48425.m49659(10, new C20094(3));
        }
        this.f48425.m49658();
        this.f48392.mo17762();
        this.f48411.mo28944(this.f48415);
        C12838 c12838 = this.f48406;
        if (c12838.f38576) {
            this.f48406 = c12838.m31226();
        }
        C12838 m36992 = m36992(this.f48406, 1);
        this.f48406 = m36992;
        C12838 m31231 = m36992.m31231(m36992.f38574);
        this.f48406 = m31231;
        m31231.f38562 = m31231.f38563;
        this.f48406.f38565 = 0L;
        this.f48415.mo44869();
        m37013();
        Surface surface = this.f48418;
        if (surface != null) {
            surface.release();
            this.f48418 = null;
        }
        this.f48397 = C4288.f13838;
        this.f48430 = true;
    }

    @Override // l.InterfaceC4162
    /* renamed from: ᩻ */
    public final boolean mo12587() {
        m37032();
        return this.f48430;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۫ */
    public final int mo4592() {
        m37032();
        if (this.f48406.f38560.m14110()) {
            return 0;
        }
        C12838 c12838 = this.f48406;
        return c12838.f38560.mo14098(c12838.f38574.f49112);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۟ */
    public final int mo4579() {
        m37032();
        int m37026 = m37026(this.f48406);
        if (m37026 == -1) {
            return 0;
        }
        return m37026;
    }

    @Override // l.InterfaceC1318
    public final long getDuration() {
        m37032();
        if (mo4608()) {
            C12838 c12838 = this.f48406;
            C15894 c15894 = c12838.f38574;
            AbstractC4846 abstractC4846 = c12838.f38560;
            Object obj = c15894.f49112;
            C22485 c22485 = this.f48447;
            abstractC4846.mo14105(obj, c22485);
            return C3603.m11037(c22485.m50434(c15894.f49108, c15894.f49109));
        }
        return mo4593();
    }

    @Override // l.InterfaceC1318
    public final long getCurrentPosition() {
        m37032();
        return C3603.m11037(m37018(this.f48406));
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۢ */
    public final long mo4582() {
        m37032();
        return C3603.m11037(this.f48406.f38565);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩷ */
    public final boolean mo4608() {
        m37032();
        return this.f48406.f38574.m37669();
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩵ */
    public final int mo4606() {
        m37032();
        if (mo4608()) {
            return this.f48406.f38574.f49108;
        }
        return -1;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۛ */
    public final int mo4577() {
        m37032();
        if (mo4608()) {
            return this.f48406.f38574.f49109;
        }
        return -1;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܰ */
    public final long mo4594() {
        m37032();
        return m36988(this.f48406);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۧ֫ */
    public final long mo4590() {
        m37032();
        if (this.f48406.f38560.m14110()) {
            return this.f48445;
        }
        C12838 c12838 = this.f48406;
        long j = 0;
        if (c12838.f38575.f49111 != c12838.f38574.f49111) {
            return C3603.m11037(c12838.f38560.mo14103(mo4579(), this.f44904, 0L).f65755);
        }
        long j2 = c12838.f38562;
        if (this.f48406.f38575.m37669()) {
            C12838 c128382 = this.f48406;
            c128382.f38560.mo14105(c128382.f38575.f49112, this.f48447).m50433(this.f48406.f38575.f49108);
        } else {
            j = j2;
        }
        C12838 c128383 = this.f48406;
        AbstractC4846 abstractC4846 = c128383.f38560;
        Object obj = c128383.f38575.f49112;
        C22485 c22485 = this.f48447;
        abstractC4846.mo14105(obj, c22485);
        return C3603.m11037(j + c22485.f72804);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۘ */
    public final C14017 mo4574() {
        m37032();
        return this.f48406.f38567.f4477;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۠ */
    public final C11902 mo4580() {
        m37032();
        C11902 mo15626 = this.f48444.mo15626();
        return this.f48449 ? mo15626.mo29029().mo17263(this.f48437).mo17266() : mo15626;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4569(C11902 c11902) {
        C11902 c119022;
        m37032();
        AbstractC5497 abstractC5497 = this.f48444;
        abstractC5497.getClass();
        if (abstractC5497 instanceof C6908) {
            C11902 mo4580 = mo4580();
            if (this.f48449) {
                this.f48437 = c11902.f35559;
                AbstractC6079 abstractC6079 = this.f48405.f67587;
                C6257 mo29029 = c11902.mo29029();
                AbstractC20151 it = abstractC6079.iterator();
                while (it.hasNext()) {
                    mo29029.mo17262(((Integer) it.next()).intValue(), true);
                }
                c119022 = mo29029.mo17266();
            } else {
                c119022 = c11902;
            }
            if (!c119022.equals(abstractC5497.mo15626())) {
                abstractC5497.mo15624(c119022);
            }
            if (mo4580.equals(c11902)) {
                return;
            }
            this.f48425.m49659(19, new C9092(c11902));
        }
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܿ֫ */
    public final C17546 mo4602() {
        m37032();
        return this.f48399;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۚ */
    public final AbstractC4846 mo4576() {
        m37032();
        return this.f48406.f38560;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۤ */
    public final C6404 mo4583() {
        m37032();
        return this.f48396;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۨ */
    public final void mo4591() {
        m37032();
        m37013();
        m36998((Object) null);
        m36994(0, 0);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4564(SurfaceView surfaceView) {
        m37032();
        if (surfaceView instanceof InterfaceC21913) {
            m37013();
            m36998((Object) surfaceView);
            m36997(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof C20005;
        SurfaceHolderCallbackC20641 surfaceHolderCallbackC20641 = this.f48427;
        if (z) {
            m37013();
            this.f48436 = (C20005) surfaceView;
            C11428 m36991 = m36991(this.f48401);
            m36991.m28235(10000);
            m36991.m28236(this.f48436);
            m36991.m28240();
            this.f48436.m46141(surfaceHolderCallbackC20641);
            m36998(this.f48436.m46144());
            m36997(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m37032();
        if (holder == null) {
            mo4591();
            return;
        }
        m37013();
        this.f48402 = true;
        this.f48389 = holder;
        holder.addCallback(surfaceHolderCallbackC20641);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            m36998(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m36994(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m36998((Object) null);
            m36994(0, 0);
        }
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۧ */
    public final void mo4585(SurfaceView surfaceView) {
        m37032();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m37032();
        if (holder == null || holder != this.f48389) {
            return;
        }
        mo4591();
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4565(TextureView textureView) {
        m37032();
        if (textureView == null) {
            mo4591();
            return;
        }
        m37013();
        this.f48408 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            C19956.m46037("Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f48427);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m36998((Object) null);
            m36994(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m36998(surface);
            this.f48418 = surface;
            m36994(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۧ */
    public final void mo4586(TextureView textureView) {
        m37032();
        if (textureView == null || textureView != this.f48408) {
            return;
        }
        mo4591();
    }

    @Override // l.InterfaceC4162
    /* renamed from: ܽ */
    public final void mo12585(boolean z) {
        C11902 mo17266;
        m37032();
        if (z == this.f48449) {
            return;
        }
        this.f48449 = z;
        C20888 c20888 = this.f48405;
        if (!c20888.f67587.isEmpty()) {
            AbstractC5497 abstractC5497 = this.f48444;
            abstractC5497.getClass();
            if (abstractC5497 instanceof C6908) {
                C11902 mo15626 = abstractC5497.mo15626();
                if (z) {
                    this.f48437 = mo15626.f35559;
                    AbstractC6079 abstractC6079 = c20888.f67587;
                    C6257 mo29029 = mo15626.mo29029();
                    AbstractC20151 it = abstractC6079.iterator();
                    while (it.hasNext()) {
                        mo29029.mo17262(((Integer) it.next()).intValue(), true);
                    }
                    mo17266 = mo29029.mo17266();
                } else {
                    mo17266 = mo15626.mo29029().mo17263(this.f48437).mo17266();
                    this.f48437 = null;
                }
                if (!mo17266.equals(mo15626)) {
                    abstractC5497.mo15624(mo17266);
                }
            }
        }
        this.f48407.m46007(z);
        C12838 c12838 = this.f48406;
        m36996(c12838.f38579, c12838.f38571);
    }

    @Override // l.InterfaceC4162
    /* renamed from: ᩸ */
    public final boolean mo12586() {
        m37032();
        return this.f48449;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37035(C11715 c11715) {
        this.f48415.mo44883(c11715);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩴ */
    public final C4288 mo4605() {
        m37032();
        return this.f48397;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ֫ */
    public final void mo4567(InterfaceC0612 interfaceC0612) {
        m37032();
        interfaceC0612.getClass();
        this.f48425.m49657(interfaceC0612);
    }

    @Override // l.InterfaceC4162
    /* renamed from: ֫ */
    public final void mo12584(InterfaceC15967 interfaceC15967) {
        m37032();
        m36995(4, 15, interfaceC15967);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37012(C18273 c18273) {
        C12838 c12838 = this.f48406;
        C12838 m31231 = c12838.m31231(c12838.f38574);
        m31231.f38562 = m31231.f38563;
        m31231.f38565 = 0L;
        C12838 m36992 = m36992(m31231, 1);
        if (c18273 != null) {
            m36992 = m36992.m31233(c18273);
        }
        this.f48417++;
        this.f48407.m46009();
        m37000(m36992, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m37026(C12838 c12838) {
        if (c12838.f38560.m14110()) {
            return this.f48443;
        }
        return c12838.f38560.mo14105(c12838.f38574.f49112, this.f48447).f72806;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m36988(C12838 c12838) {
        C15894 c15894 = c12838.f38574;
        long j = c12838.f38564;
        AbstractC4846 abstractC4846 = c12838.f38560;
        if (c15894.m37669()) {
            Object obj = c12838.f38574.f49112;
            C22485 c22485 = this.f48447;
            abstractC4846.mo14105(obj, c22485);
            if (j == -9223372036854775807L) {
                return C3603.m11037(abstractC4846.mo14103(m37026(c12838), this.f44904, 0L).f65749);
            }
            return C3603.m11037(j) + C3603.m11037(c22485.f72804);
        }
        return C3603.m11037(m37018(c12838));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private long m37018(C12838 c12838) {
        long j;
        if (c12838.f38560.m14110()) {
            return C3603.m11014(this.f48445);
        }
        if (c12838.f38576) {
            j = c12838.m31235();
        } else {
            j = c12838.f38563;
        }
        if (c12838.f38574.m37669()) {
            return j;
        }
        AbstractC4846 abstractC4846 = c12838.f38560;
        Object obj = c12838.f38574.f49112;
        C22485 c22485 = this.f48447;
        abstractC4846.mo14105(obj, c22485);
        return j + c22485.f72804;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private ArrayList m37019(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.f48395.mo22836((C11197) list.get(i)));
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37009(C15700 c15700, C14995 c14995) {
        boolean z;
        int i = c15700.f48417 - c14995.f45746;
        c15700.f48417 = i;
        boolean z2 = true;
        if (c14995.f45747) {
            c15700.f48403 = c14995.f45744;
            c15700.f48413 = true;
        }
        if (i == 0) {
            AbstractC4846 abstractC4846 = c14995.f45748.f38560;
            if (!c15700.f48406.f38560.m14110() && abstractC4846.m14110()) {
                c15700.f48443 = -1;
                c15700.f48445 = 0L;
            }
            if (!abstractC4846.m14110()) {
                List m32592 = ((C13543) abstractC4846).m32592();
                C22632.m50634(m32592.size() == c15700.f48420.size());
                for (int i2 = 0; i2 < m32592.size(); i2++) {
                    ((C8646) c15700.f48420.get(i2)).m22412((AbstractC4846) m32592.get(i2));
                }
            }
            long j = -9223372036854775807L;
            if (c15700.f48413) {
                if (c14995.f45748.f38574.equals(c15700.f48406.f38574) && c14995.f45748.f38570 == c15700.f48406.f38563) {
                    z2 = false;
                }
                if (z2) {
                    if (abstractC4846.m14110() || c14995.f45748.f38574.m37669()) {
                        j = c14995.f45748.f38570;
                    } else {
                        C12838 c12838 = c14995.f45748;
                        C15894 c15894 = c12838.f38574;
                        long j2 = c12838.f38570;
                        Object obj = c15894.f49112;
                        C22485 c22485 = c15700.f48447;
                        abstractC4846.mo14105(obj, c22485);
                        j = j2 + c22485.f72804;
                    }
                }
                z = z2;
            } else {
                z = false;
            }
            c15700.f48413 = false;
            c15700.m37000(c14995.f45748, 1, z, c15700.f48403, j, -1, false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v18 java.util.List, still in use, count: 2, list:
          (r9v18 java.util.List) from 0x0110: INVOKE (wrap:java.util.List:0x010c: IGET (r3v0 l.ￛﾬￛﾗￖﾫ) A[WRAPPED] (LINE:2125) l.ￛﾬￛﾗￖﾫ.￡ﾩﾵ java.util.List), (r9v18 java.util.List) INTERFACE call: java.util.List.equals(java.lang.Object):boolean A[MD:(java.lang.Object):boolean (c), WRAPPED] (LINE:2126)
          (r9v18 java.util.List) from 0x0119: PHI (r9v11 java.util.List) = (r9v10 java.util.List), (r9v18 java.util.List) binds: [B:99:0x0117, B:15:0x0114] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fc A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ec  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m37000(final l.C12838 r33, final int r34, boolean r35, final int r36, long r37, int r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15700.m37000(l.۬ۗ֫, int, boolean, int, long, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C5552 m36990(int i, C12838 c12838, int i2) {
        int i3;
        Object obj;
        C11197 c11197;
        Object obj2;
        int i4;
        long j;
        long m37029;
        C22485 c22485 = new C22485();
        if (c12838.f38560.m14110()) {
            i3 = i2;
            obj = null;
            c11197 = null;
            obj2 = null;
            i4 = -1;
        } else {
            Object obj3 = c12838.f38574.f49112;
            c12838.f38560.mo14105(obj3, c22485);
            int i5 = c22485.f72806;
            int mo14098 = c12838.f38560.mo14098(obj3);
            Object obj4 = c12838.f38560.mo14103(i5, this.f44904, 0L).f65761;
            obj2 = obj3;
            i3 = i5;
            i4 = mo14098;
            c11197 = this.f44904.f65753;
            obj = obj4;
        }
        if (i == 0) {
            if (c12838.f38574.m37669()) {
                C15894 c15894 = c12838.f38574;
                j = c22485.m50434(c15894.f49108, c15894.f49109);
                m37029 = m37029(c12838);
            } else {
                if (c12838.f38574.f49110 != -1) {
                    j = m37029(this.f48406);
                } else {
                    j = c22485.f72804 + c22485.f72801;
                }
                m37029 = j;
            }
        } else if (c12838.f38574.m37669()) {
            j = c12838.f38563;
            m37029 = m37029(c12838);
        } else {
            j = c22485.f72804 + c12838.f38563;
            m37029 = j;
        }
        long m11037 = C3603.m11037(j);
        long m110372 = C3603.m11037(m37029);
        C15894 c158942 = c12838.f38574;
        return new C5552(obj, i3, c11197, obj2, i4, m11037, m110372, c158942.f49108, c158942.f49109);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m37029(C12838 c12838) {
        C20369 c20369 = new C20369();
        C22485 c22485 = new C22485();
        c12838.f38560.mo14105(c12838.f38574.f49112, c22485);
        long j = c12838.f38564;
        if (j == -9223372036854775807L) {
            return c12838.f38560.mo14103(c22485.f72806, c20369, 0L).f65749;
        }
        return c22485.f72804 + j;
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    private void m37014() {
        C18958 c18958 = this.f48441;
        String str = C3603.f11424;
        C15700 c15700 = (C15700) this.f48414;
        boolean mo4608 = c15700.mo4608();
        boolean m34998 = c15700.m34998();
        boolean m34997 = c15700.m34997();
        boolean m35001 = c15700.m35001();
        boolean m34999 = c15700.m34999();
        boolean m35000 = c15700.m35000();
        boolean m14110 = c15700.mo4576().m14110();
        C4141 c4141 = new C4141();
        c4141.m12426(this.f48422);
        boolean z = !mo4608;
        c4141.m12425(4, z);
        boolean z2 = false;
        c4141.m12425(5, m34998 && !mo4608);
        c4141.m12425(6, m34997 && !mo4608);
        c4141.m12425(7, !m14110 && (m34997 || !m34999 || m34998) && !mo4608);
        c4141.m12425(8, m35001 && !mo4608);
        c4141.m12425(9, !m14110 && (m35001 || (m34999 && m35000)) && !mo4608);
        c4141.m12425(10, z);
        c4141.m12425(11, m34998 && !mo4608);
        if (m34998 && !mo4608) {
            z2 = true;
        }
        c4141.m12425(12, z2);
        C18958 m12423 = c4141.m12423();
        this.f48441 = m12423;
        if (m12423.equals(c18958)) {
            return;
        }
        this.f48425.m49655(13, new InterfaceC7961() { // from class: l.۬᩶֫
            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                ((InterfaceC0612) obj).mo2505(C15700.this.f48441);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36999(ArrayList arrayList, int i, long j, boolean z) {
        long j2;
        int i2;
        int i3;
        int i4 = i;
        int m37026 = m37026(this.f48406);
        long currentPosition = getCurrentPosition();
        this.f48417++;
        ArrayList arrayList2 = this.f48420;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i5 = size - 1; i5 >= 0; i5--) {
                arrayList2.remove(i5);
            }
            this.f48394 = this.f48394.mo4078(size);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C19895 c19895 = new C19895((InterfaceC3901) arrayList.get(i6), this.f48446);
            arrayList3.add(c19895);
            arrayList2.add(i6, new C8646(c19895.f64295, c19895.f64296));
        }
        this.f48394 = this.f48394.mo4083(arrayList3.size());
        C13543 c13543 = new C13543(arrayList2, this.f48394);
        if (!c13543.m14110() && i4 >= c13543.mo14107()) {
            throw new C15407();
        }
        if (z) {
            i4 = c13543.mo14099(this.f48428);
            j2 = -9223372036854775807L;
        } else {
            if (i4 == -1) {
                i2 = m37026;
                C12838 m36993 = m36993(this.f48406, c13543, m36989(c13543, i2, currentPosition));
                i3 = m36993.f38569;
                if (i2 != -1 && i3 != 1) {
                    i3 = (!c13543.m14110() || i2 >= c13543.mo14107()) ? 4 : 2;
                }
                C12838 m36992 = m36992(m36993, i3);
                this.f48407.m46000(i2, C3603.m11014(currentPosition), this.f48394, arrayList3);
                m37000(m36992, 0, this.f48406.f38574.f49112.equals(m36992.f38574.f49112) && !this.f48406.f38560.m14110(), 4, m37018(m36992), -1, false);
            }
            j2 = j;
        }
        i2 = i4;
        currentPosition = j2;
        C12838 m369932 = m36993(this.f48406, c13543, m36989(c13543, i2, currentPosition));
        i3 = m369932.f38569;
        if (i2 != -1) {
            if (c13543.m14110()) {
            }
        }
        C12838 m369922 = m36992(m369932, i3);
        this.f48407.m46000(i2, C3603.m11014(currentPosition), this.f48394, arrayList3);
        m37000(m369922, 0, this.f48406.f38574.f49112.equals(m369922.f38574.f49112) && !this.f48406.f38560.m14110(), 4, m37018(m369922), -1, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12838 m36993(C12838 c12838, AbstractC4846 abstractC4846, Pair pair) {
        C15894 c15894;
        C1263 c1263;
        long j;
        C22632.m50631(abstractC4846.m14110() || pair != null);
        AbstractC4846 abstractC48462 = c12838.f38560;
        long m36988 = m36988(c12838);
        C12838 m31230 = c12838.m31230(abstractC4846);
        if (abstractC4846.m14110()) {
            C15894 m31225 = C12838.m31225();
            long m11014 = C3603.m11014(this.f48445);
            C12838 m31231 = m31230.m31232(m31225, m11014, m11014, m11014, 0L, C6181.f18976, this.f48388, AbstractC14545.of()).m31231(m31225);
            m31231.f38562 = m31231.f38563;
            return m31231;
        }
        Object obj = m31230.f38574.f49112;
        boolean equals = obj.equals(pair.first);
        C15894 c158942 = !equals ? new C15894(pair.first) : m31230.f38574;
        long longValue = ((Long) pair.second).longValue();
        long m110142 = C3603.m11014(m36988);
        if (!abstractC48462.m14110()) {
            m110142 -= abstractC48462.mo14105(obj, this.f48447).f72804;
        }
        if (!equals || longValue < m110142) {
            C22632.m50634(!c158942.m37669());
            C6181 c6181 = !equals ? C6181.f18976 : m31230.f38561;
            if (equals) {
                c15894 = c158942;
                c1263 = m31230.f38567;
            } else {
                c15894 = c158942;
                c1263 = this.f48388;
            }
            C12838 m312312 = m31230.m31232(c15894, longValue, longValue, longValue, 0L, c6181, c1263, !equals ? AbstractC14545.of() : m31230.f38577).m31231(c15894);
            m312312.f38562 = longValue;
            return m312312;
        }
        if (longValue == m110142) {
            int mo14098 = abstractC4846.mo14098(m31230.f38575.f49112);
            if (mo14098 != -1 && abstractC4846.mo14104(mo14098, this.f48447, false).f72806 == abstractC4846.mo14105(c158942.f49112, this.f48447).f72806) {
                return m31230;
            }
            abstractC4846.mo14105(c158942.f49112, this.f48447);
            if (c158942.m37669()) {
                j = this.f48447.m50434(c158942.f49108, c158942.f49109);
            } else {
                j = this.f48447.f72801;
            }
            C12838 m312313 = m31230.m31232(c158942, m31230.f38563, m31230.f38563, m31230.f38570, j - m31230.f38563, m31230.f38561, m31230.f38567, m31230.f38577).m31231(c158942);
            m312313.f38562 = j;
            return m312313;
        }
        C22632.m50634(!c158942.m37669());
        long max = Math.max(0L, m31230.f38565 - (longValue - m110142));
        long j2 = m31230.f38562;
        if (m31230.f38575.equals(m31230.f38574)) {
            j2 = longValue + max;
        }
        C12838 m31232 = m31230.m31232(c158942, longValue, longValue, longValue, max, m31230.f38561, m31230.f38567, m31230.f38577);
        m31232.f38562 = j2;
        return m31232;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12838 m36992(C12838 c12838, int i) {
        C12838 m31227 = c12838.m31227(i);
        return (i == 1 || i == 4) ? m31227.m31234(false) : m31227;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Pair m36989(AbstractC4846 abstractC4846, int i, long j) {
        if (abstractC4846.m14110()) {
            this.f48443 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f48445 = j;
            return null;
        }
        if (i == -1 || i >= abstractC4846.mo14107()) {
            i = abstractC4846.mo14099(this.f48428);
            j = C3603.m11037(abstractC4846.mo14103(i, this.f44904, 0L).f65749);
        }
        return abstractC4846.m14100(this.f44904, this.f48447, i, C3603.m11014(j));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11428 m36991(InterfaceC5783 interfaceC5783) {
        int m37026 = m37026(this.f48406);
        AbstractC4846 abstractC4846 = this.f48406.f38560;
        int i = m37026 == -1 ? 0 : m37026;
        C14185 c14185 = this.f48409;
        C19936 c19936 = this.f48407;
        return new C11428(c19936, interfaceC5783, abstractC4846, i, c14185, c19936.m46014());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C17546 m37025() {
        AbstractC4846 mo4576 = mo4576();
        if (mo4576.m14110()) {
            return this.f48438;
        }
        C11197 c11197 = mo4576.mo14103(mo4579(), this.f44904, 0L).f65753;
        C18252 m41027 = this.f48438.m41027();
        m41027.m42571(c11197.f33613);
        return m41027.m42567();
    }

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    private void m37013() {
        C20005 c20005 = this.f48436;
        SurfaceHolderCallbackC20641 surfaceHolderCallbackC20641 = this.f48427;
        if (c20005 != null) {
            C11428 m36991 = m36991((InterfaceC5783) this.f48401);
            m36991.m28235(10000);
            m36991.m28236((Object) null);
            m36991.m28240();
            this.f48436.m46143(surfaceHolderCallbackC20641);
            this.f48436 = null;
        }
        TextureView textureView = this.f48408;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC20641) {
                C19956.m46037("SurfaceTextureListener already unset or replaced.");
            } else {
                this.f48408.setSurfaceTextureListener(null);
            }
            this.f48408 = null;
        }
        SurfaceHolder surfaceHolder = this.f48389;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC20641);
            this.f48389 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37004(C15700 c15700, SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        c15700.m36998(surface);
        c15700.f48418 = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m36998(Object obj) {
        Object obj2 = this.f48440;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        boolean m46008 = this.f48407.m46008(z ? this.f48435 : -9223372036854775807L, obj);
        if (z) {
            Object obj3 = this.f48440;
            Surface surface = this.f48418;
            if (obj3 == surface) {
                surface.release();
                this.f48418 = null;
            }
        }
        this.f48440 = obj;
        if (m46008) {
            return;
        }
        m37012(C18273.m42604(new C4413("Detaching surface timed out."), b.d));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36997(SurfaceHolder surfaceHolder) {
        this.f48402 = false;
        this.f48389 = surfaceHolder;
        surfaceHolder.addCallback(this.f48427);
        Surface surface = this.f48389.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f48389.getSurfaceFrame();
            m36994(surfaceFrame.width(), surfaceFrame.height());
        } else {
            m36994(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m36994(final int i, final int i2) {
        if (i == this.f48391.m39892() && i2 == this.f48391.m39891()) {
            return;
        }
        this.f48391 = new C17008(i, i2);
        this.f48425.m49659(24, new InterfaceC7961() { // from class: l.֨᩶֫
            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                ((InterfaceC0612) obj).mo2492(i, i2);
            }
        });
        m36995(2, 14, new C17008(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m36996(int i, boolean z) {
        int i2;
        if (this.f48449) {
            i2 = 4;
        } else {
            i2 = (this.f48406.f38568 != 1 || z) ? 0 : 1;
        }
        C12838 c12838 = this.f48406;
        if (c12838.f38571 == z && c12838.f38568 == i2 && c12838.f38579 == i) {
            return;
        }
        this.f48417++;
        if (c12838.f38576) {
            c12838 = c12838.m31226();
        }
        C12838 m31228 = c12838.m31228(i, i2, z);
        this.f48407.m45999(i, i2, z);
        m37000(m31228, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public void m37031() {
        int mo4603 = mo4603();
        C18771 c18771 = this.f48419;
        C2543 c2543 = this.f48421;
        boolean z = false;
        if (mo4603 != 1) {
            if (mo4603 == 2 || mo4603 == 3) {
                m37032();
                boolean z2 = this.f48406.f38576;
                if (mo4607() && !z2) {
                    z = true;
                }
                c2543.m8057(z);
                c18771.m43433(mo4607());
                return;
            }
            if (mo4603 != 4) {
                throw new IllegalStateException();
            }
        }
        c2543.m8057(false);
        c18771.m43433(false);
    }

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    private void m37032() {
        this.f48393.m34149();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f48433;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = C3603.f11424;
            Locale locale = Locale.US;
            String m46306 = C20087.m46306("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f48426) {
                throw new IllegalStateException(m46306);
            }
            C19956.m46036(m46306, this.f48390 ? null : new IllegalStateException());
            this.f48390 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36995(int i, int i2, Object obj) {
        for (InterfaceC1837 interfaceC1837 : this.f48432) {
            if (i == -1 || interfaceC1837.mo6092() == i) {
                C11428 m36991 = m36991((InterfaceC5783) interfaceC1837);
                m36991.m28235(i2);
                m36991.m28236(obj);
                m36991.m28240();
            }
        }
        for (InterfaceC1837 interfaceC18372 : this.f48442) {
            if (interfaceC18372 != null && (i == -1 || interfaceC18372.mo6092() == i)) {
                C11428 m369912 = m36991((InterfaceC5783) interfaceC18372);
                m369912.m28235(i2);
                m369912.m28236(obj);
                m369912.m28240();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37002(C15700 c15700, final int i) {
        c15700.m37032();
        c15700.m36995(1, 10, Integer.valueOf(i));
        c15700.m36995(2, 10, Integer.valueOf(i));
        c15700.f48425.m49659(21, new InterfaceC7961() { // from class: l.۫᩶֫
            @Override // l.InterfaceC7961
            public final void invoke(Object obj) {
                ((InterfaceC0612) obj).mo2491(i);
            }
        });
    }
}
