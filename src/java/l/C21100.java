package l;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.snackbar.SnackbarManager;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: K5ZN */
/* renamed from: l.᩷᩶ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21100 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final C5242 f68044;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C5242 f68045;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68046;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68047;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68048;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68049;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static C6988 f68050;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68051;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68052;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f68053 = new AtomicLong();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68054;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C5242 f68055;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C5242 f68056;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C5242 f68057;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f68058;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f68059;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ImageView f68060;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public PopupWindow f68061;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f68062;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f68063;

    static {
        C5242 c5242 = new C5242("");
        f68048 = c5242;
        C5242 c52422 = new C5242("");
        f68057 = c52422;
        f68052 = new C5242("");
        f68046 = new C5242(null);
        C5242 c52423 = new C5242(null);
        f68049 = c52423;
        f68047 = new C5242(null);
        C5242 c52424 = new C5242(Boolean.FALSE);
        f68044 = c52424;
        C5242 c52425 = new C5242(0);
        f68054 = c52425;
        C5242 c52426 = new C5242(0);
        f68045 = c52426;
        f68051 = new C5242(0);
        C5242 c52427 = new C5242(0);
        f68055 = c52427;
        C5242 c52428 = new C5242(Integer.valueOf(C18340.m42758()));
        f68056 = c52428;
        c5242.m1665((InterfaceC1008) new C16222());
        c52422.m1665((InterfaceC1008) new C2818());
        c52423.m1665((InterfaceC1008) new C4229());
        c52424.m1665((InterfaceC1008) new C19046());
        c52425.m1665((InterfaceC1008) new C0700());
        c52426.m1665((InterfaceC1008) new C5640());
        c52427.m1665((InterfaceC1008) new C1406());
        c52428.m1665((InterfaceC1008) new C8462());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48020(AbstractActivityC3346 abstractActivityC3346) {
        if (abstractActivityC3346 instanceof ActivityC9811) {
            abstractActivityC3346.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [l.ۛ᩷ۡ, l.۬ۤ] */
    public C21100(final AbstractActivityC3346 abstractActivityC3346) {
        ImageView imageView;
        final ImageView imageView2;
        C17606 c17606;
        ImageView imageView3;
        ImageView imageView4;
        final ImageView imageView5;
        C14811 c14811;
        this.f68059 = abstractActivityC3346;
        final DialogInterfaceC0206 m44415 = abstractActivityC3346.buildDialog().m44415();
        final C17606 c176062 = (C17606) abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00db);
        final C4201 c4201 = new C4201();
        final C4201 c42012 = new C4201();
        c4201.m12685(c176062);
        c42012.m12685((C17606) LayoutInflater.from(abstractActivityC3346).inflate(R.layout.MT_Protector_res_0x7f0d00dc, (ViewGroup) null));
        if (abstractActivityC3346.getResources().getConfiguration().orientation == 2) {
            c42012.m12676(c176062);
        }
        final ?? r2 = new InterfaceC13041() { // from class: l.ۛ᩷ۡ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                int i = ((Configuration) obj).orientation;
                C17606 c176063 = c176062;
                if (i == 2) {
                    C4201.this.m12676(c176063);
                } else {
                    c4201.m12676(c176063);
                }
            }
        };
        InterfaceC17236 interfaceC17236 = new InterfaceC17236() { // from class: l.ۨ᩷ۡ
            @Override // l.InterfaceC17236
            /* renamed from: ֫ */
            public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
                EnumC22901 enumC229012 = EnumC22901.ON_START;
                AbstractActivityC3346 abstractActivityC33462 = AbstractActivityC3346.this;
                C6305 c6305 = r2;
                if (enumC22901 == enumC229012) {
                    abstractActivityC33462.mo9144(c6305);
                    abstractActivityC33462.mo9143(c6305);
                } else if (enumC22901 == EnumC22901.ON_STOP) {
                    abstractActivityC33462.mo9144(c6305);
                }
            }
        };
        AbstractC7379 lifecycle = m44415.getLifecycle();
        lifecycle.mo19833(interfaceC17236);
        if (lifecycle.mo19832().m33028(EnumC13728.STARTED)) {
            abstractActivityC3346.mo9143((InterfaceC13041) r2);
        }
        m44415.m1439((ViewGroup) c176062);
        TextView textView = (TextView) c176062.findViewById(R.id.textView1);
        TextView textView2 = (TextView) c176062.findViewById(R.id.textView2);
        final C21828 c21828 = (C21828) c176062.findViewById(R.id.MT_Protector_res_0x7f0a0287);
        final SeekBar seekBar = (SeekBar) c176062.findViewById(R.id.MT_Protector_res_0x7f0a04f3);
        TextView textView3 = (TextView) c176062.findViewById(R.id.textView3);
        final TextView textView4 = (TextView) c176062.findViewById(R.id.textView4);
        ImageView imageView6 = (ImageView) c176062.findViewById(R.id.MT_Protector_res_0x7f0a0686);
        ImageView imageView7 = (ImageView) c176062.findViewById(R.id.MT_Protector_res_0x7f0a0687);
        ImageView imageView8 = (ImageView) c176062.findViewById(R.id.MT_Protector_res_0x7f0a0684);
        ImageView imageView9 = (ImageView) c176062.findViewById(R.id.MT_Protector_res_0x7f0a0683);
        ImageView imageView10 = (ImageView) c176062.findViewById(R.id.MT_Protector_res_0x7f0a0682);
        ViewOnClickListenerC14813.m35215(textView);
        ViewOnClickListenerC14813.m35215(textView2);
        c21828.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ܿ᩹ۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                final C9340 m132;
                final Main m36593 = C15528.m36593();
                if (m36593 == null || (m132 = m36593.m132()) == null || !m36593.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
                    return false;
                }
                Drawable drawable = (Drawable) C21100.f68046.m1662();
                if (drawable instanceof C1385) {
                    final C1385 c1385 = (C1385) drawable;
                    C19258 buildDialog = AbstractActivityC3346.this.buildDialog();
                    buildDialog.m44436((CharSequence) C21100.f68048.m1662());
                    buildDialog.m44416(R.string.MT_Protector_res_0x7f12036b);
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ܶ᩹ۜ
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C21100.m48022(C9340.this, c1385, m36593);
                        }
                    });
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog.m44438();
                    return true;
                }
                if (drawable instanceof C5619) {
                    return false;
                }
                C21374.m48457(R.string.MT_Protector_res_0x7f1206ea);
                return true;
            }
        });
        ImageView imageView11 = (ImageView) c176062.findViewById(R.id.MT_Protector_res_0x7f0a02eb);
        this.f68060 = imageView11;
        imageView11.setOnClickListener(new View.OnClickListener() { // from class: l.ۛ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48014(view, abstractActivityC3346, m44415);
            }
        });
        final boolean m49431 = C21943.m49431();
        if ((abstractActivityC3346 instanceof Main) || (abstractActivityC3346 instanceof ActivityC9811)) {
            imageView = imageView10;
            imageView2 = imageView9;
            c17606 = c176062;
            imageView3 = imageView7;
            imageView4 = imageView8;
            imageView5 = imageView6;
            c14811 = new InterfaceC13041() { // from class: l.ܳ᩹ۜ
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    boolean m494312 = C21943.m49431();
                    final boolean z = m49431;
                    if (z == m494312) {
                        return;
                    }
                    final C21100 c21100 = C21100.this;
                    final DialogInterfaceC0206 dialogInterfaceC0206 = m44415;
                    final AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                    c176062.post(new Runnable() { // from class: l.᩸᩹ۜ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C21100.m48026(C21100.this, dialogInterfaceC0206, z, abstractActivityC33462);
                        }
                    });
                }
            };
        } else {
            imageView2 = imageView9;
            imageView4 = imageView8;
            imageView5 = imageView6;
            imageView = imageView10;
            c14811 = 0;
            c17606 = c176062;
            imageView3 = imageView7;
        }
        int i = 1;
        f68048.m1668(m44415, new C14531(i, textView));
        f68052.m1668(m44415, new C14531(i, textView2));
        f68046.m1668(m44415, new InterfaceC1008() { // from class: l.᩻᩹ۜ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                Drawable drawable = (Drawable) obj;
                C21828 c218282 = C21828.this;
                if (c218282.getDrawable() != drawable) {
                    c218282.setImageDrawable(drawable);
                }
                c218282.m49197();
            }
        });
        f68044.m1668(m44415, new InterfaceC1008() { // from class: l.ۜ᩹ۜ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                Boolean bool = (Boolean) obj;
                int i2 = bool.booleanValue() ? R.drawable.MT_Protector_res_0x7f08027e : R.drawable.MT_Protector_res_0x7f08027f;
                ImageView imageView12 = imageView5;
                imageView12.setImageResource(i2);
                imageView12.setContentDescription(C4925.m14327(bool.booleanValue() ? R.string.MT_Protector_res_0x7f120699 : R.string.MT_Protector_res_0x7f12069a));
                c21828.m49196(bool.booleanValue());
            }
        });
        f68045.m1668(m44415, new InterfaceC1008() { // from class: l.᩷᩹ۜ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                textView4.setText(C21100.m48031(((Integer) obj).intValue()));
            }
        });
        int i2 = 0;
        f68054.m1668(m44415, new C9874(i2, textView3));
        f68055.m1668(m44415, new InterfaceC1008() { // from class: l.ۡ᩹ۜ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                int intValue = ((Integer) obj).intValue();
                SeekBar seekBar2 = seekBar;
                seekBar2.setMax(intValue);
                Integer num = (Integer) C21100.f68051.m1662();
                C11003.requireNonNull(num);
                seekBar2.setProgress(num.intValue());
            }
        });
        C11003.requireNonNull(seekBar);
        f68051.m1668(m44415, new InterfaceC1008() { // from class: l.᩵᩹ۜ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                seekBar.setProgress(((Integer) obj).intValue());
            }
        });
        f68056.m1668(m44415, new InterfaceC1008() { // from class: l.᩶᩹ۜ
            @Override // l.InterfaceC1008
            /* renamed from: ֫ */
            public final void mo1617(Object obj) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                float[] fArr = C18340.f56996;
                int i3 = intValue != 1 ? intValue != 2 ? intValue != 3 ? R.drawable.MT_Protector_res_0x7f080284 : R.drawable.MT_Protector_res_0x7f080280 : R.drawable.MT_Protector_res_0x7f080286 : R.drawable.MT_Protector_res_0x7f080285;
                ImageView imageView12 = imageView2;
                imageView12.setImageResource(i3);
                imageView12.setContentDescription(C4925.m14327(C18340.m42763(num.intValue())));
            }
        });
        seekBar.setOnSeekBarChangeListener(new C23278(textView3));
        final C8817 m22788 = C8817.m22788();
        imageView5.setOnClickListener(new ViewOnClickListenerC23705(m44415, m22788, 3));
        imageView3.setOnClickListener(new ViewOnClickListenerC4934(i2, m44415, m22788));
        imageView4.setOnClickListener(new View.OnClickListener() { // from class: l.ۗ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48018(DialogInterfaceC0206.this, m22788);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: l.۬᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48017(DialogInterfaceC0206.this, abstractActivityC3346, imageView5);
            }
        });
        imageView2.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.۫᩹ۜ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int m42758 = C18340.m42758();
                C2937 c2937 = new C2937(AbstractActivityC3346.this);
                c2937.m8957(C18340.m42763(m42758), imageView5);
                C4925.m14316(new RunnableC22934(2, c2937), SnackbarManager.SHORT_DURATION_MS);
                return true;
            }
        });
        final C17606 c176063 = c17606;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: l.ۤ᩹ۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C21100.m48025(C21100.this, m44415, abstractActivityC3346, c176063);
            }
        });
        c176063.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2049(this, abstractActivityC3346, c14811, C2234.m7411(abstractActivityC3346), new C14105(m44415), new C7756(this)));
        c176063.setAlpha(0.0f);
        ObjectAnimator.ofFloat(c176063, "alpha", 0.0f, 1.0f).setDuration(400L).start();
        m44415.m1449();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48022(C9340 c9340, C1385 c1385, Main main) {
        C16560 m24070 = c9340.m24070();
        AbstractC15440 m38993 = m24070.m38993(f68050.f21576.mo16334().mo24433().m36517() + ".png", false);
        try {
            OutputStream mo23555 = m38993.mo23555(false);
            try {
                c1385.getBitmap().compress(Bitmap.CompressFormat.PNG, 90, mo23555);
                m24070.m39005(m38993);
                if (mo23555 != null) {
                    mo23555.close();
                }
            } catch (Throwable th) {
                if (mo23555 != null) {
                    try {
                        mo23555.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            main.m10223(e, (DialogInterface.OnDismissListener) null);
            m38993.mo23552();
        } finally {
            C15528.m36596();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48026(C21100 c21100, DialogInterfaceC0206 dialogInterfaceC0206, boolean z, AbstractActivityC3346 abstractActivityC3346) {
        if (!dialogInterfaceC0206.m1442() || z == C21943.m49431()) {
            return;
        }
        c21100.f68062 = true;
        boolean z2 = c21100.f68060.getVisibility() == 0;
        dialogInterfaceC0206.dismiss();
        C21100 c211002 = new C21100(abstractActivityC3346);
        c211002.f68063 = c21100.f68063;
        if (z2) {
            c211002.m48045();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48035(DialogInterfaceC0206 dialogInterfaceC0206, C8817 c8817) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
        } else if (c8817.m22791()) {
            f68050.m18916();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48039(DialogInterfaceC0206 dialogInterfaceC0206, C8817 c8817) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
        } else if (c8817.m22791()) {
            f68050.m18915();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48018(DialogInterfaceC0206 dialogInterfaceC0206, C8817 c8817) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
        } else if (c8817.m22791()) {
            f68050.m18917();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48017(DialogInterfaceC0206 dialogInterfaceC0206, AbstractActivityC3346 abstractActivityC3346, ImageView imageView) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
            return;
        }
        int m42757 = C18340.m42757();
        C2937 c2937 = new C2937(abstractActivityC3346);
        c2937.m8957(C18340.m42763(m42757), imageView);
        C4925.m14316(new RunnableC22934(2, c2937), SnackbarManager.SHORT_DURATION_MS);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48025(final C21100 c21100, DialogInterfaceC0206 dialogInterfaceC0206, AbstractActivityC3346 abstractActivityC3346, C17606 c17606) {
        C6988 c6988 = f68050;
        if (c6988 == null || c6988.f21578.mo15853()) {
            dialogInterfaceC0206.dismiss();
            return;
        }
        View m42764 = f68050.f21576.m42764(abstractActivityC3346);
        int width = c17606.getWidth();
        int height = c17606.getHeight();
        m42764.measure(View.MeasureSpec.makeMeasureSpec(width < height ? (width * 2) / 3 : width / 2, 1073741824), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
        Drawable m48345 = C21311.m48345(abstractActivityC3346, R.drawable.MT_Protector_res_0x7f080059);
        Rect rect = new Rect();
        m48345.getPadding(rect);
        final PopupWindow popupWindow = new PopupWindow(m42764, m42764.getMeasuredWidth() + rect.left + rect.right, m42764.getMeasuredHeight() + rect.top + rect.bottom, true);
        c21100.f68061 = popupWindow;
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.᩹᩹ۜ
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C21100.m48024(C21100.this, popupWindow);
            }
        });
        popupWindow.setAnimationStyle(R.style.MT_Protector_res_0x7f130183);
        popupWindow.setBackgroundDrawable(m48345);
        int[] iArr = new int[2];
        c17606.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - rect.right;
        iArr[1] = iArr[1] - rect.bottom;
        popupWindow.setInputMethodMode(2);
        popupWindow.showAtLocation(c17606, 85, iArr[0], iArr[1]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48024(C21100 c21100, PopupWindow popupWindow) {
        if (c21100.f68061 == popupWindow) {
            c21100.f68061 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48023(AbstractC13921 abstractC13921, List list, int i) {
        C21805.m49152();
        C6988 c6988 = f68050;
        if (c6988 != null) {
            c6988.m18912(false);
        }
        m48034(((InterfaceC17889) list.get(i)).getName());
        C6988 c69882 = new C6988(abstractC13921, list, i, C8399.m22008(abstractC13921, list, i));
        f68050 = c69882;
        c69882.m18918();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48019(C2608 c2608, int i) {
        C21805.m49152();
        C6988 c6988 = f68050;
        if (c6988 != null) {
            c6988.m18912(false);
        }
        String name = ((InterfaceC17889) c2608.m8233().get(c2608.m8232())).getName();
        int max = Math.max(i, 0);
        f68048.mo1669(C15495.m36571(name));
        f68057.mo1669("");
        f68052.mo1669("");
        f68046.mo1669(C5619.m15924());
        f68049.mo1669((Object) null);
        f68047.mo1669((Object) null);
        f68044.mo1669(Boolean.FALSE);
        int i2 = (int) (max / 1000);
        f68054.mo1669(Integer.valueOf((i2 % 60) | ((i2 / 60) << 16)));
        f68045.mo1669((Object) 0);
        f68055.mo1669((Object) 0);
        f68051.mo1669(Integer.valueOf(max / 50));
        C6988 c69882 = new C6988(c2608.m8234(), c2608.m8233(), c2608.m8232(), true);
        f68050 = c69882;
        int max2 = Math.max(i, 0);
        c69882.f21570 = max2;
        c69882.f21572 = max2 > 0;
        c69882.f21573 = false;
        final C6988 c69883 = f68050;
        final int i3 = c69883.f21567 + 1;
        c69883.f21567 = i3;
        final C11197 mo16333 = c69883.f21576.mo16333();
        final InterfaceC17889 m41812 = C17843.m41812(mo16333);
        C1802.f6208.execute(new Runnable() { // from class: l.ᩳ᩶ۜ
            @Override // java.lang.Runnable
            public final void run() {
                C8441 c8441;
                C11197 c11197 = mo16333;
                try {
                    c8441 = C15495.m36572(c11197, m41812);
                } catch (Exception unused) {
                    c8441 = new C8441(new C15495(c11197, null, null, null), 0L);
                }
                C4925.m14315(new RunnableC17571(C6988.this, i3, c11197, c8441, 0));
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48045() {
        this.f68060.setVisibility(0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48034(String str) {
        f68048.mo1669(C15495.m36571(str));
        f68057.mo1669(C4925.m14327(R.string.MT_Protector_res_0x7f120528));
        f68052.mo1669(C4925.m14327(R.string.MT_Protector_res_0x7f120528));
        f68046.mo1669(C5619.m15924());
        f68044.mo1669(Boolean.FALSE);
        f68054.mo1669((Object) 0);
        f68045.mo1669((Object) 0);
        f68055.mo1669((Object) 0);
        f68051.mo1669((Object) 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48011(long j) {
        int i = (int) (j / 1000);
        return ((i / 60) << 16) | (i % 60);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m48031(int i) {
        int i2 = i >>> 16;
        int i3 = i & 255;
        if (i3 < 10) {
            return i2 + ":0" + i3;
        }
        return i2 + ":" + i3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48014(View view, AbstractActivityC3346 abstractActivityC3346, DialogInterfaceC0206 dialogInterfaceC0206) {
        C6988 c6988 = f68050;
        if (c6988 != null) {
            InterfaceC17889 mo16334 = c6988.f21576.mo16334();
            if (mo16334 instanceof C9555) {
                dialogInterfaceC0206.dismiss();
                Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC12210.class);
                intent.setData(((C9555) mo16334).mo24433().m36522());
                abstractActivityC3346.startActivity(intent);
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48029(InterfaceC17889 interfaceC17889, AbstractC13921 abstractC13921) {
        C6988 c6988 = f68050;
        if (c6988 == null) {
            return false;
        }
        InterfaceC5577 interfaceC5577 = c6988.f21578;
        if (interfaceC5577.mo15853() || !interfaceC5577.isPlaying()) {
            return false;
        }
        C18340 c18340 = c6988.f21576;
        return C17843.m41812((C11197) c18340.get(c18340.mo16336())).equals(interfaceC17889) && c6988.f21568 == abstractC13921;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48036(AbstractActivityC3346 abstractActivityC3346) {
        C6988 c6988 = f68050;
        if (c6988 != null && !c6988.f21578.mo15853()) {
            new C21100(abstractActivityC3346);
            return;
        }
        if (ApplicationC20075.f65008.contains("mpl")) {
            new C11990(abstractActivityC3346).m20274();
            return;
        }
        C21374.m48463(R.string.MT_Protector_res_0x7f1206a2);
        if (abstractActivityC3346 instanceof ActivityC9811) {
            abstractActivityC3346.finish();
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C6988 m48041() {
        return f68050;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48021(C6988 c6988) {
        if (f68050 == c6988) {
            f68050 = null;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m48037() {
        return f68058;
    }
}
