package l;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MetaKeyKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.OverScroller;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: X68P */
/* renamed from: l.۫ۨᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C12392 extends View implements InterfaceC16685 {

    /* renamed from: ܳܿ, reason: not valid java name and contains not printable characters */
    public static final float f37168;

    /* renamed from: ᩻ܿ, reason: not valid java name and contains not printable characters */
    public static final TextKeyListener f37169;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public volatile int f37170;

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37171;

    /* renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37172;

    /* renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    public C6458 f37173;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f37174;

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public int f37175;

    /* renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37176;

    /* renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    public C15213 f37177;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public ClipboardManager f37178;

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public C6322 f37179;

    /* renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f37180;

    /* renamed from: ֫ܿ, reason: not valid java name and contains not printable characters */
    public C22810 f37181;

    /* renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f37182;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C2141 f37183;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public float f37184;

    /* renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public boolean f37185;

    /* renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37186;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37187;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C1869 f37188;

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37189;

    /* renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public C2141 f37190;

    /* renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC22602 f37191;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public boolean f37192;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public long f37193;

    /* renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37194;

    /* renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f37195;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f37196;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public boolean f37197;

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public C22146 f37198;

    /* renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public boolean f37199;

    /* renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public int f37200;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public float f37201;

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37202;

    /* renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public boolean f37203;

    /* renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37204;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f37205;

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public int f37206;

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public HandlerC13637 f37207;

    /* renamed from: ۛܽ, reason: not valid java name and contains not printable characters */
    public int f37208;

    /* renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC5337 f37209;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f37210;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public boolean f37211;

    /* renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final int[] f37212;

    /* renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    public float f37213;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f37214;

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC17331 f37215;

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37216;

    /* renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public final Object f37217;

    /* renamed from: ۟ᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f37218;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public float f37219;

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37220;

    /* renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public float f37221;

    /* renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public C21565 f37222;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f37223;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public long f37224;

    /* renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public C8741 f37225;

    /* renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public int f37226;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f37227;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C3926 f37228;

    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public final Matrix f37229;

    /* renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37230;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f37231;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7765 f37232;

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public final CursorAnchorInfo.Builder f37233;

    /* renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public long f37234;

    /* renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    public C6870 f37235;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public AbstractC21708 f37236;

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public boolean f37237;

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f37238;

    /* renamed from: ۧܿ, reason: not valid java name and contains not printable characters */
    public final C8817 f37239;

    /* renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public volatile long f37240;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f37241;

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int f37242;

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public C22146 f37243;

    /* renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public volatile C22270 f37244;

    /* renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public C22686 f37245;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC14528 f37246;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public volatile C4342 f37247;

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public C6768 f37248;

    /* renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public int[] f37249;

    /* renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    public volatile C3220 f37250;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f37251;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public RuntimeException f37252;

    /* renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public final BreakIterator f37253;

    /* renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC0979 f37254;

    /* renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public C14630 f37255;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37256;

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public C0923 f37257;

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f37258;

    /* renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public ViewTreeObserverOnGlobalLayoutListenerC1103 f37259;

    /* renamed from: ܰᩳ, reason: not valid java name and contains not printable characters */
    public final Object f37260;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f37261;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f37262;

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public long f37263;

    /* renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public final RectF f37264;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final Rect f37265;

    /* renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public int f37266;

    /* renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public boolean f37267;

    /* renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public volatile C20154 f37268;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int f37269;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public float f37270;

    /* renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public int f37271;

    /* renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f37272;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C22229 f37273;

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public InputMethodManager f37274;

    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37275;

    /* renamed from: ܽܿ, reason: not valid java name and contains not printable characters */
    public boolean f37276;

    /* renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public volatile transient boolean f37277;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f37278;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37279;

    /* renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public long f37280;

    /* renamed from: ܿܿ, reason: not valid java name and contains not printable characters */
    public C12392 f37281;

    /* renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public final RectF f37282;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f37283;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37284;

    /* renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public OverScroller f37285;

    /* renamed from: ᩳܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f37286;

    /* renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37287;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public boolean f37288;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public float f37289;

    /* renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public boolean f37290;

    /* renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37291;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public ArrayList f37292;

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public float f37293;

    /* renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37294;

    /* renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37295;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C13097 f37296;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public C13802 f37297;

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public int f37298;

    /* renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC0397 f37299;

    /* renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37300;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public InterfaceC19449 f37301;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public volatile C3926 f37302;

    /* renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public EdgeEffect f37303;

    /* renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f37304;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Runnable f37305;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final Rect f37306;

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37307;

    /* renamed from: ᩸ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37308;

    /* renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public long f37309;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Runnable f37310;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C7701 f37311;

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public int f37312;

    /* renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public int f37313;

    /* renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    public long f37314;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C23701 f37315;

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public boolean f37316;

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public C14508 f37317;

    /* renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public C13097 f37318;

    /* renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public C13681 f37319;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f37320;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f37321;

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f37322;

    /* renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public final Rect f37323;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30121(int i, int i2, int i3) {
        return (i3 >= i2 && i >= i2) ? i > i3 ? i3 : i : i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized boolean m30152(C0273 c0273, C0273 c02732, int i, long j) {
        boolean z = this.f37277;
        this.f37277 = true;
        try {
            if (!this.f37194 && this.f37322 == c0273) {
                int m30444 = m30444();
                int m30448 = m30448();
                if (!c0273.m1595(i, j, new RunnableC14343(this, c02732, c0273, 0))) {
                    c02732.close();
                    return false;
                }
                try {
                    this.f37173.m17860(c02732);
                    this.f37235.m18572();
                    this.f37315.m52265();
                    this.f37258.mo8166(c02732);
                    m30171();
                    c02732.setSelection(m30444, m30448);
                    C22686 c22686 = this.f37245;
                    if (c22686.f73267) {
                        m30317(c22686.f73297, true);
                    }
                    this.f37173.m17859(c02732);
                    this.f37235.m18597(c02732);
                    m30405();
                    return true;
                } finally {
                    c0273.setReadOnly(false);
                }
            }
            c02732.close();
            return false;
        } finally {
            this.f37277 = z;
        }
    }

    /* renamed from: ᩶ᩳ, reason: not valid java name and contains not printable characters */
    private native void m30275();

    /* renamed from: ᩹ᩳ, reason: not valid java name and contains not printable characters */
    private native void m30286();

    /* renamed from: ֡֫ */
    public int mo25893() {
        return 917505;
    }

    /* renamed from: ֫ */
    public native void mo25896(C12951 c12951);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m30343(AbstractC21708 abstractC21708);

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public native void m30360();

    /* renamed from: ֫ܽ */
    public boolean mo25898() {
        return false;
    }

    /* renamed from: ۖ֫ */
    public int mo25899() {
        return 0;
    }

    /* renamed from: ۘܽ */
    public boolean mo25902() {
        return true;
    }

    /* renamed from: ۚܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30386() {
        if (!this.f37290) {
            InterfaceC7785 interfaceC7785 = this.f37322;
            if (interfaceC7785 instanceof C0273) {
                C0273 c0273 = (C0273) interfaceC7785;
                this.f37194 = true;
                if (c0273 instanceof C5753) {
                    ((C5753) c0273).m16205();
                }
                if (this.f37231 != 0) {
                    m30462();
                    return;
                }
                if (isAttachedToWindow()) {
                    return;
                }
                this.f37290 = true;
                m30438();
                this.f37283.clear();
                m30462();
                this.f37235.m18586();
                this.f37301 = null;
                m30259((CharSequence) new C0273(""));
                this.f37235.m18586();
                this.f37207.m32775();
                AbstractC3179 abstractC3179 = this.f37258;
                if (abstractC3179 != null) {
                    abstractC3179.f10019 = true;
                }
                c0273.close();
            }
        }
    }

    /* renamed from: ۛܽ */
    public boolean mo25904() {
        return false;
    }

    /* renamed from: ۡܽ */
    public void mo25906() {
    }

    /* renamed from: ۢ */
    public void mo25908(int i) {
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public native void m30428(String str);

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30439() {
        int i = this.f37231;
        if (i <= 0) {
            throw new IllegalStateException("No background text task");
        }
        this.f37231 = i - 1;
        if (this.f37194) {
            m30386();
        }
    }

    /* renamed from: ܶۧ */
    public boolean mo25916() {
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized void m30485() {
        if (this.f37194) {
            throw new IllegalStateException("Text view is released");
        }
        this.f37231++;
    }

    /* renamed from: ᩵֫ */
    public int mo25920() {
        return 33554433;
    }

    /* renamed from: ᩸ܽ */
    public boolean mo25925() {
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30144(C12392 c12392, C20030 c20030, Runnable runnable) {
        c12392.getClass();
        try {
            c12392.m30339(c20030);
            try {
                runnable.run();
            } finally {
            }
        } catch (Throwable th) {
            try {
                runnable.run();
                throw th;
            } finally {
            }
        }
    }

    public C12392(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C12392(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37314 = 0L;
        this.f37309 = 0L;
        this.f37208 = 0;
        this.f37280 = SystemClock.uptimeMillis();
        this.f37263 = 0L;
        this.f37271 = 0;
        this.f37227 = 0;
        this.f37226 = 0;
        this.f37186 = new AtomicInteger();
        this.f37221 = -1.0f;
        this.f37196 = true;
        this.f37237 = false;
        this.f37300 = false;
        this.f37200 = 0;
        this.f37288 = false;
        this.f37282 = new RectF();
        this.f37206 = -1;
        this.f37242 = -1;
        this.f37298 = -1;
        this.f37312 = -1;
        this.f37264 = new RectF();
        this.f37323 = new Rect();
        this.f37197 = true;
        C2141 c2141 = new C2141(this);
        this.f37183 = c2141;
        this.f37299 = c2141;
        this.f37249 = new int[2];
        this.f37230 = new ArrayList();
        this.f37277 = false;
        this.f37187 = false;
        this.f37240 = -1L;
        this.f37287 = false;
        this.f37283 = new ArrayList();
        this.f37284 = new AtomicInteger();
        this.f37273 = new C22229();
        this.f37265 = new Rect();
        this.f37306 = new Rect();
        this.f37210 = -1L;
        this.f37278 = 255;
        this.f37272 = new CopyOnWriteArrayList();
        this.f37202 = new AtomicInteger();
        this.f37304 = false;
        this.f37253 = BreakIterator.getWordInstance();
        this.f37182 = new ArrayDeque();
        this.f37217 = new Object();
        this.f37260 = new Object();
        this.f37322 = new C0273("");
        this.f37248 = new C6768(this);
        this.f37207 = new HandlerC13637(this);
        this.f37292 = new ArrayList();
        this.f37179 = new C6322();
        this.f37198 = new C22146();
        this.f37243 = new C22146();
        this.f37180 = new ArrayList();
        this.f37238 = new ArrayList();
        this.f37239 = C8817.m22786(300);
        this.f37233 = new CursorAnchorInfo.Builder();
        this.f37229 = new Matrix();
        this.f37212 = new int[2];
        this.f37286 = new AtomicInteger();
        this.f37211 = false;
        this.f37297 = C13802.f41129;
        setSaveEnabled(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            setDefaultFocusHighlightEnabled(false);
        }
        if (!isInEditMode()) {
            this.f37274 = (InputMethodManager) context.getSystemService("input_method");
            this.f37178 = (ClipboardManager) context.getSystemService("clipboard");
        } else {
            C13835.m33194();
        }
        C22686 c22686 = new C22686(this);
        if (!isInEditMode()) {
            c22686.m50683();
        }
        if (i2 >= 24) {
            setPointerIcon(PointerIcon.getSystemIcon(context, 1008));
        }
        this.f37245 = c22686;
        this.f37188 = new C1869();
        this.f37235 = new C6870(this);
        this.f37173 = new C6458(this);
        this.f37315 = new C23701(this);
        if (!mo25916()) {
            this.f37322.mo1601().m52363(0L);
        }
        this.f37322.setSelection(0);
        this.f37303 = new EdgeEffect(context);
        this.f37189 = new EdgeEffect(context);
        m30126(AbstractC3179.m9745(this, this.f37322, c22686, this.f37200), true);
        setLongClickable(true);
        this.f37285 = new OverScroller(context);
        ViewOnTouchListenerC17331 viewOnTouchListenerC17331 = new ViewOnTouchListenerC17331(this, context);
        this.f37215 = viewOnTouchListenerC17331;
        this.f37257 = new C0923(context, viewOnTouchListenerC17331);
        setOnTouchListener(viewOnTouchListenerC17331);
        Activity m15313 = C5350.m15313(context);
        if (m15313 instanceof AbstractActivityC3346) {
            this.f37205 = (AbstractActivityC3346) m15313;
        }
        m30221();
    }

    /* renamed from: ܽ */
    public void mo25918() {
        if (isInEditMode()) {
            return;
        }
        C7701 c7701 = this.f37311;
        if (c7701 != null) {
            c7701.m20608();
        }
        this.f37311 = null;
        this.f37245.m50683();
        C22810 c22810 = this.f37181;
        if (c22810 != null) {
            ViewTreeObserverOnPreDrawListenerC8575[] viewTreeObserverOnPreDrawListenerC8575Arr = c22810.f73647;
            viewTreeObserverOnPreDrawListenerC8575Arr[0].m22284();
            viewTreeObserverOnPreDrawListenerC8575Arr[1].m22284();
            viewTreeObserverOnPreDrawListenerC8575Arr[2].m22284();
        }
    }

    /* renamed from: ᩹ܽ, reason: not valid java name and contains not printable characters */
    public final void m30533() {
        try {
            this.f37288 = true;
            AbstractC3179 abstractC3179 = this.f37258;
            abstractC3179.m9785();
            if (abstractC3179 instanceof C2575) {
                this.f37258 = new C2575(this, this.f37322, this.f37245);
            } else {
                if (!(abstractC3179 instanceof C17474)) {
                    throw new RuntimeException(String.valueOf(abstractC3179));
                }
                C17474 c17474 = new C17474(this, this.f37322, this.f37245, ((C17474) abstractC3179).m40872());
                this.f37258 = c17474;
                if (c17474.mo8163() == 0.0f) {
                    this.f37258.mo9783((int) abstractC3179.mo8163());
                }
            }
            while (this.f37258.mo9770()) {
                SystemClock.sleep(100L);
            }
            this.f37258.mo8158(abstractC3179.f10006);
            this.f37288 = false;
            m30123(m30390(getScrollX()), m30521(this.f37170), true);
            this.f37221 = -1.0f;
        } catch (Throwable th) {
            this.f37288 = false;
            m30123(m30390(getScrollX()), m30521(this.f37170), true);
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30321(InterfaceC0979 interfaceC0979) {
        this.f37254 = interfaceC0979;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, this.f37170);
    }

    @Override // android.view.View
    public final void setScrollX(int i) {
        m30123(i, this.f37170, true);
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final int m30408() {
        return this.f37170;
    }

    @Override // android.view.View
    public final void setScrollY(int i) {
        m30123(getScrollX(), i, true);
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        m30123(getScrollX() + i, this.f37170 + i2, true);
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.f37276) {
            return;
        }
        super.onScrollChanged(i, i2, i3, i4);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m30242(int i, int i2) {
        AbstractC3179 abstractC3179;
        int scrollX = getScrollX();
        int i3 = this.f37170;
        boolean z = this.f37220;
        InterfaceC7785 interfaceC7785 = this.f37195;
        InterfaceC7785 interfaceC77852 = this.f37322;
        if (interfaceC7785 != interfaceC77852) {
            this.f37195 = interfaceC77852;
            this.f37220 = false;
        }
        if (Math.abs(i2) + getHeight() > 65536 || ((abstractC3179 = this.f37258) != null && abstractC3179.f10015 == this.f37322 && abstractC3179.m9789() > 65536.0d)) {
            this.f37220 = true;
        }
        this.f37170 = i2;
        this.f37276 = true;
        try {
            super.scrollTo(i, this.f37220 ? 0 : i2);
            if (i != scrollX || i2 != i3) {
                super.onScrollChanged(i, i2, scrollX, i3);
            }
            if (z == this.f37220 && i == scrollX && i2 == i3) {
                return;
            }
            invalidate();
        } finally {
            this.f37276 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30130(C12392 c12392, int i, int i2) {
        c12392.m30123(i, i2, true);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        m30123(i, i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m30123(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (z) {
            m30181();
            m30191();
            this.f37202.incrementAndGet();
        }
        if (this.f37288) {
            return;
        }
        InterfaceC0979 interfaceC0979 = this.f37254;
        if (interfaceC0979 != null) {
            i3 = getScrollX();
            i4 = this.f37170;
        } else {
            i3 = 0;
            i4 = 0;
        }
        try {
            m30242(i, i2);
            if (interfaceC0979 != null) {
                interfaceC0979.mo3444(i3, i4, i, i2);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m30392(int i, int i2) {
        m30181();
        m30191();
        this.f37202.incrementAndGet();
        this.f37207.removeMessages(1);
        if (!this.f37285.isFinished()) {
            this.f37285.forceFinished(true);
        }
        int scrollX = getScrollX();
        int i3 = this.f37170;
        if (scrollX == i && i3 == i2) {
            return;
        }
        if (scrollX != i) {
            i = m30390(i);
        }
        if (i3 != i2) {
            i2 = m30521(i2);
        }
        try {
            m30242(i, i2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m30411(int i, int i2) {
        m30181();
        this.f37202.incrementAndGet();
        int scrollX = getScrollX();
        int i3 = this.f37170;
        if (i == -1) {
            i = this.f37285.isFinished() ? scrollX : this.f37285.getFinalX();
        }
        if (i2 == -1) {
            i2 = this.f37285.isFinished() ? i3 : this.f37285.getFinalY();
        }
        m30191();
        m30404();
        this.f37285.startScroll(scrollX, i3, i - scrollX, i2 - i3);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m30126(AbstractC3179 abstractC3179, boolean z) {
        int i;
        int i2;
        int i3;
        m30244();
        AbstractC3179 abstractC31792 = this.f37258;
        if (abstractC31792 != abstractC3179) {
            if (abstractC31792 != null) {
                abstractC31792.m9785();
            }
            m30252("Session layout changed");
        }
        if (abstractC31792 != null) {
            abstractC3179.mo8158(abstractC31792.f10006);
        }
        int i4 = 0;
        if (z && abstractC31792 != null && (abstractC3179 instanceof C2575)) {
            int m9759 = abstractC31792.m9759(this.f37170 + 1);
            C11747 c11747 = abstractC31792.f9998.get(m9759);
            i3 = c11747.f35062;
            i2 = c11747.f35064;
            i = (int) (this.f37170 - (this.f37245.m24484() * m9759));
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (abstractC31792 != abstractC3179 && (abstractC31792 instanceof C17474)) {
            ((C17474) abstractC31792).m40871();
        }
        this.f37258 = abstractC3179;
        if (abstractC3179.mo8160()) {
            this.f37216 = new EdgeEffect(getContext());
            this.f37275 = new EdgeEffect(getContext());
            if (this.f37316) {
                C16909.m39764(this.f37216);
                C16909.m39764(this.f37275);
            }
        } else {
            this.f37216 = null;
            this.f37275 = null;
        }
        if (z && abstractC31792 != null && (abstractC3179 instanceof C2575)) {
            while (i2 < abstractC3179.f9998.size()) {
                C11747 c117472 = abstractC3179.f9998.get(i2);
                if (c117472.f35062 == i3 || c117472.f35063 > i3) {
                    i4 = m30521(((int) (this.f37245.m24484() * i2)) + i);
                    break;
                }
                i2++;
            }
            if (this.f37318 == null) {
                m30123(getScrollX(), i4, true);
            }
        }
        this.f37221 = -1.0f;
        m30171();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m30381(int i) {
        C22686 c22686 = this.f37245;
        c22686.m50684(c22686.f29058.getTextSize(), i);
        m30289();
        this.f37258.mo8173();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static void m30288(C12392 c12392) {
        boolean z;
        EdgeEffect edgeEffect = c12392.f37216;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = c12392.f37216.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = c12392.f37303;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= c12392.f37303.isFinished();
        }
        EdgeEffect edgeEffect3 = c12392.f37275;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= c12392.f37275.isFinished();
        }
        EdgeEffect edgeEffect4 = c12392.f37189;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= c12392.f37189.isFinished();
        }
        if (z) {
            int i = C17648.f53953;
            c12392.postInvalidateOnAnimation();
        }
    }

    /* renamed from: ᩺ܽ, reason: not valid java name and contains not printable characters */
    public final void m30537() {
        this.f37263 = SystemClock.uptimeMillis();
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30330(InterfaceC8035 interfaceC8035) {
        this.f37238.add(interfaceC8035);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30332(C10651 c10651) {
        this.f37238.remove(c10651);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30311(int i, int i2) {
        if (m30519()) {
            return;
        }
        ArrayList arrayList = this.f37238;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((InterfaceC8035) arrayList.get(i3)).mo1646(i, i2);
        }
    }

    /* renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30370() {
        if (m30519()) {
            return true;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        return abstractC3179 != null && abstractC3179.mo9770();
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m30368() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session diagnostics require the main thread");
        }
        StringBuilder sb = new StringBuilder("viewSize=");
        sb.append(getWidth());
        sb.append("x");
        sb.append(getHeight());
        sb.append("\nattached=");
        sb.append(isAttachedToWindow());
        sb.append("\npreparing=");
        sb.append(this.f37277);
        sb.append("\npreparingManual=");
        sb.append(this.f37287);
        sb.append("\nawaitingPrepareFinish=");
        sb.append(this.f37187);
        sb.append("\nrestoringInstanceState=");
        sb.append(this.f37304);
        sb.append("\ncancelPrepare=");
        sb.append(this.f37256);
        sb.append("\ncontentLoading=");
        sb.append(this.f37261);
        sb.append("\nlargeChange=");
        sb.append(m30519());
        sb.append("\npendingScroll=");
        boolean z = false;
        sb.append(this.f37244 != null);
        sb.append("\nlayout=");
        AbstractC3179 abstractC3179 = this.f37258;
        sb.append(abstractC3179 == null ? "null" : abstractC3179.getClass().getName());
        sb.append("\nlayoutLoading=");
        AbstractC3179 abstractC31792 = this.f37258;
        sb.append(abstractC31792 != null && abstractC31792.mo9770());
        sb.append("\ntextPrepared=");
        C15213 c15213 = this.f37177;
        if (c15213 != null && c15213.f46686) {
            z = true;
        }
        sb.append(z);
        sb.append("\nsoftWrap=");
        return C3200.m9831(this.f37200, "\n", sb);
    }

    /* renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30505() {
        if (m30519() || this.f37277 || this.f37187 || this.f37287 || this.f37304) {
            return false;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        return abstractC3179.f10015 == this.f37322 && abstractC3179.m9757() && !this.f37258.f9998.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۚᩳ, reason: not valid java name and contains not printable characters */
    public boolean m30174() {
        return m30505() && !m30370() && !this.f37261 && this.f37244 == null && this.f37177 == null;
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21708 m30491() {
        return this.f37236;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30497(int i, int i2) {
        AbstractC21708 abstractC21708 = this.f37236;
        if (abstractC21708 == null || !abstractC21708.m49034()) {
            AtomicInteger atomicInteger = this.f37286;
            atomicInteger.incrementAndGet();
            try {
                if (this.f37196) {
                    C6322 c6322 = this.f37179;
                    InterfaceC7785 interfaceC7785 = this.f37322;
                    c6322.getClass();
                    int i3 = i <= 0 ? 0 : i - 1;
                    int indexOf = TextUtils.indexOf((CharSequence) interfaceC7785, '\n', i3);
                    if (indexOf == -1) {
                        indexOf = interfaceC7785.length();
                    }
                    StringBuilder sb = new StringBuilder(C22686.f73225);
                    for (int lastIndexOf = TextUtils.lastIndexOf(interfaceC7785, '\n', i3) + 1; lastIndexOf < indexOf; lastIndexOf++) {
                        char charAt = interfaceC7785.charAt(lastIndexOf);
                        if (charAt != ' ' && charAt != '\t') {
                            break;
                        }
                        sb.append(charAt);
                    }
                    interfaceC7785.replace(i, i2, sb.toString());
                    if (i != i2) {
                        interfaceC7785.setSelection(sb.length() + i);
                    }
                } else {
                    this.f37322.replace(i, i2, C22686.f73225);
                    if (i != i2) {
                        mo25919(i + 1);
                    }
                }
                invalidate();
            } finally {
                atomicInteger.decrementAndGet();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30313(TextWatcher textWatcher) {
        this.f37180.add(textWatcher);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30319(C0065 c0065) {
        C6055.m16891(this.f37180, c0065);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m30420(int i) {
        int m9790 = this.f37258.m9790(i);
        if (this.f37258.mo8160()) {
            return m9790;
        }
        try {
            return this.f37258.f9998.get(m9790).f35064;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30350(int i, int[] iArr) {
        if (i >= 0 && i <= this.f37322.length()) {
            if (iArr.length < 2) {
                throw new IllegalArgumentException("lineColumn.length < 2");
            }
            try {
                if (m30519()) {
                    C7744 mo26556 = this.f37322.mo26556();
                    try {
                        int m20765 = mo26556.m20765(i);
                        iArr[0] = m20765;
                        iArr[1] = i - mo26556.m20768(m20765);
                        mo26556.close();
                        return true;
                    } finally {
                    }
                }
                int m47366 = this.f37258.f9998.m47366(this.f37258.m9790(i));
                iArr[0] = this.f37258.f9998.m47357(m47366);
                iArr[1] = i - this.f37258.f9998.m47355(m47366);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m30471(int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            try {
                if (m30519()) {
                    C7744 mo26556 = this.f37322.mo26556();
                    try {
                        if (i < mo26556.m20769()) {
                            long m20768 = mo26556.m20768(i) + i2;
                            int i3 = m20768 > ((long) mo26556.length()) ? -1 : (int) m20768;
                            mo26556.close();
                            return i3;
                        }
                        mo26556.close();
                        return -1;
                    } finally {
                    }
                }
                C20736 c20736 = this.f37258.f9998;
                int m47348 = c20736.m47348(i);
                if ((m47348 == -1 ? -1 : c20736.m47366(m47348)) != -1) {
                    long j = this.f37258.f9998.get(r8).f35062 + i2;
                    if (j <= this.f37322.length()) {
                        return (int) j;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Point m30472(int i) {
        ?? r3;
        int m47355;
        int i2 = -1;
        if (m30519()) {
            int[] iArr = new int[2];
            return m30350(i, iArr) ? new Point(iArr[0] + 1, iArr[1] + 1) : new Point(-1, -1);
        }
        int m9790 = this.f37258.m9790(i);
        try {
            r3 = this.f37258.mo8160();
            try {
                if (r3 != 0) {
                    int i3 = m9790 + 1;
                    m47355 = this.f37258.f9998.m47355(m9790);
                    r3 = i3;
                } else {
                    int m47366 = this.f37258.f9998.m47366(m9790);
                    int m47357 = this.f37258.f9998.m47357(m47366) + 1;
                    m47355 = this.f37258.f9998.m47355(m47366);
                    r3 = m47357;
                }
                i2 = (i - m47355) + 1;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            r3 = -1;
        }
        return new Point(r3, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30335(InterfaceC14528 interfaceC14528) {
        InterfaceC14528 interfaceC145282 = this.f37246;
        if (interfaceC145282 == interfaceC14528) {
            return;
        }
        if (this.f37251 != 0 && interfaceC145282 != null) {
            interfaceC145282.mo7198(false);
        }
        this.f37246 = interfaceC14528;
        if (this.f37251 == 0 || interfaceC14528 == null) {
            return;
        }
        interfaceC14528.mo7198(true);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30247(C12392 c12392) {
        InterfaceC14528 interfaceC14528;
        int i = c12392.f37251 + 1;
        c12392.f37251 = i;
        if (i != 1 || (interfaceC14528 = c12392.f37246) == null) {
            return;
        }
        interfaceC14528.mo7198(true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30204(C12392 c12392) {
        InterfaceC14528 interfaceC14528;
        int i = c12392.f37251 - 1;
        c12392.f37251 = i;
        if (i != 0 || (interfaceC14528 = c12392.f37246) == null) {
            return;
        }
        interfaceC14528.mo7198(false);
    }

    /* renamed from: ᩵ܽ, reason: not valid java name and contains not printable characters */
    public final void m30516() {
        C21441 m30280;
        if (m30370() || (m30280 = m30280(m30444())) == null) {
            return;
        }
        C22146 c22146 = this.f37198;
        C21441 m49756 = c22146.m49756();
        if (m49756 != null && Math.abs(m49756.f69027 - m30280.f69027) <= 3) {
            c22146.m49757();
        }
        this.f37243.m49752();
        c22146.m49755(m30280);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30455(int i, int i2) {
        if (m30370()) {
            return;
        }
        C21441 m30280 = m30280(i);
        C21441 m302802 = m30280(i2);
        if (m30280 != null) {
            int i3 = m30280.f69027;
            if (m302802 == null || i3 == m302802.f69027) {
                return;
            }
            C22146 c22146 = this.f37198;
            C21441 m49756 = c22146.m49756();
            if (m49756 != null && Math.abs(m49756.f69027 - i3) <= 3) {
                c22146.m49757();
            }
            this.f37243.m49752();
            c22146.m49755(m30280);
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m30374() {
        return this.f37198.m49758();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean m30514() {
        return this.f37243.m49758();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30495() {
        C21441 m30280;
        if (m30370()) {
            return;
        }
        C22146 c22146 = this.f37198;
        if (c22146.m49758() && (m30280 = m30280(m30444())) != null) {
            this.f37243.m49755(m30280);
            m30148(c22146.m49757());
        }
    }

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final void m30481() {
        C21441 m30280;
        if (m30370()) {
            return;
        }
        C22146 c22146 = this.f37243;
        if (c22146.m49758() && (m30280 = m30280(m30444())) != null) {
            this.f37198.m49755(m30280);
            m30148(c22146.m49757());
        }
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private C21441 m30280(int i) {
        int[] iArr = new int[2];
        if (m30350(i, iArr)) {
            return new C21441(iArr[0], iArr[1]);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30148(C21441 c21441) {
        int i = c21441.f69027;
        int i2 = c21441.f69026;
        if (i < 0 || i2 < 0 || this.f37258.f9998.isEmpty()) {
            return;
        }
        int i3 = this.f37258.f9998.m47368().f35064;
        if (i > i3) {
            i = i3;
        }
        int m30471 = m30471(i, i2);
        if (m30471 == -1) {
            m30471 = this.f37322.length();
        }
        this.f37322.setSelection(m30471);
        this.f37221 = -1.0f;
        m30227();
        m30349(m30471, false);
        m30537();
        requestFocus();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m30383() {
        return !m30441() && this.f37322.mo1601().m52364();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m30296() {
        return !m30441() && this.f37322.mo1601().m52362();
    }

    /* renamed from: ܽᩳ, reason: not valid java name and contains not printable characters */
    public final void m30484() {
        m30127(this.f37322, false);
    }

    /* renamed from: ֡ܽ, reason: not valid java name and contains not printable characters */
    public final void m30298() {
        m30127(this.f37322, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30127(InterfaceC7785 interfaceC7785, boolean z) {
        InterfaceC7785 interfaceC77852 = this.f37322;
        try {
            boolean z2 = true;
            boolean z3 = (!this.f37211 || this.f37302 == null || this.f37302.f12532) ? false : true;
            if (m30441()) {
                return;
            }
            if (!m30370() || z3) {
                this.f37221 = -1.0f;
                if (this.f37211 || !interfaceC7785.mo1601().m52356(z)) {
                    z2 = false;
                }
                if (z2) {
                    m30362();
                }
                try {
                    if (z) {
                        interfaceC7785.mo1597();
                    } else {
                        interfaceC7785.mo1599();
                    }
                    if (z2) {
                        m30397();
                    }
                    if (this.f37322 != interfaceC7785) {
                        return;
                    }
                    this.f37280 = SystemClock.uptimeMillis();
                    m30227();
                    InterfaceC19449 interfaceC19449 = this.f37301;
                    if (interfaceC19449 != null) {
                        interfaceC19449.mo2703(this.f37322.isChanged());
                        this.f37301.mo2704(m30383(), m30296());
                    }
                    m30345(false);
                    invalidate();
                } catch (Throwable th) {
                    if (z2) {
                        m30397();
                    }
                    throw th;
                }
            }
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC77852, e)) {
                throw e;
            }
        }
    }

    /* renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public final void m30511() {
        m30501(false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30501(boolean z) {
        this.f37322.mo1601().m52343(z);
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2704(m30383(), m30296());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30338(InterfaceC19449 interfaceC19449) {
        this.f37301 = interfaceC19449;
    }

    /* renamed from: ֨ܽ, reason: not valid java name and contains not printable characters */
    public final void m30303() {
        this.f37322.mo1601().m52349();
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2704(m30383(), m30296());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30316(String str) {
        String charSequence = C22686.m50681(str).toString();
        int m30444 = m30444();
        int m30448 = m30448();
        if (m30444 > m30448) {
            m30448 = m30444;
            m30444 = m30448;
        }
        this.f37322.replace(m30444, m30448, charSequence);
        mo25919(charSequence.length() + m30444);
        m30345(false);
    }

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public final int m30504() {
        return this.f37245.m24492();
    }

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public final int m30482() {
        return this.f37245.f73275;
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final int m30413() {
        return this.f37258.m9775() ? this.f37258.f10020.size() : this.f37258.f9998.size();
    }

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final int m30301() {
        if (!m30519()) {
            if (this.f37258.f9998.size() == 0) {
                return 1;
            }
            AbstractC3179 abstractC3179 = this.f37258;
            return abstractC3179.f9998.get(abstractC3179.f9998.size() - 1).f35064 + 1;
        }
        C7744 mo26556 = this.f37322.mo26556();
        try {
            int m20769 = (int) mo26556.m20769();
            mo26556.close();
            return m20769;
        } catch (Throwable th) {
            try {
                mo26556.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m30457(int i) {
        if (m30519()) {
            int m30471 = m30471(i, 0);
            if (m30471 >= 0) {
                mo25919(m30471);
                return true;
            }
        } else if (i < m30301()) {
            C11747 c11747 = this.f37258.f9998.get(i);
            int i2 = i;
            while (c11747.f35064 < i) {
                i2++;
                c11747 = this.f37258.f9998.get(i2);
            }
            int i3 = c11747.f35062;
            m30455(m30444(), i3);
            mo25919(i3);
            m30349(i3, false);
            return true;
        }
        return false;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m30487(boolean z) {
        this.f37196 = z;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30523(boolean z) {
        this.f37237 = z;
    }

    /* renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30529() {
        return this.f37237;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m30382(boolean z) {
        m30376();
        this.f37300 = z;
    }

    /* renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30437() {
        return this.f37300;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30372(int i) {
        if (!m30519()) {
            if (i >= this.f37258.f9998.size()) {
                return;
            }
            C11747 c11747 = this.f37258.f9998.get(i);
            int i2 = i;
            while (c11747.f35064 < i && (i2 = i2 + 1) < this.f37258.f9998.size()) {
                c11747 = this.f37258.f9998.get(i2);
            }
            int i3 = c11747.f35062;
            int i4 = c11747.f35063;
            while (true) {
                i2++;
                if (i2 < this.f37258.f9998.size()) {
                    C11747 c117472 = this.f37258.f9998.get(i2);
                    if (c117472.f35064 != i) {
                        break;
                    } else {
                        i4 = c117472.f35063;
                    }
                } else {
                    break;
                }
            }
            mo25922(i3, i4);
            m30349(i3, false);
            return;
        }
        C7744 mo26556 = this.f37322.mo26556();
        if (i >= 0) {
            try {
                if (i < mo26556.m20769()) {
                    mo25922(mo26556.m20768(i), ((long) (i + 1)) < mo26556.m20769() ? mo26556.m20768(r8) - 1 : mo26556.length());
                    mo26556.close();
                    return;
                }
            } catch (Throwable th) {
                try {
                    mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        mo26556.close();
    }

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final C1869 m30375() {
        return this.f37188;
    }

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public final void m30510() {
        int i = this.f37271 + 1;
        this.f37271 = i;
        this.f37227 = i;
        C20154 c20154 = this.f37268;
        if (c20154 == null || c20154.f65266.mo26548() == c20154.f65265) {
            return;
        }
        m30252("Session text changed before view was ready");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30456(boolean z) {
        if (z) {
            this.f37186.incrementAndGet();
        }
        this.f37322.mo1600(z);
        this.f37226 = z ? -1 : this.f37227;
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2703(z);
        }
    }

    /* renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public final void m30470() {
        this.f37322.mo1600(false);
        this.f37226 = this.f37227;
        if (this.f37301 != null) {
            post(new Runnable() { // from class: l.ۖۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392.this.f37301.mo2703(false);
                }
            });
        }
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8159 m30530() {
        return new C8159(this);
    }

    /* renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30536() {
        return (this.f37277 || this.f37187 || this.f37287 || this.f37304 || this.f37322.mo1605()) ? false : true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30434(C8159 c8159) {
        InterfaceC7785 interfaceC7785;
        int i;
        int i2;
        int i3;
        String str;
        InterfaceC7785 interfaceC77852 = this.f37322;
        interfaceC7785 = c8159.f25156;
        if (interfaceC77852 != interfaceC7785) {
            return false;
        }
        int mo26548 = this.f37322.mo26548();
        i = c8159.f25157;
        if (mo26548 != i) {
            return false;
        }
        int i4 = this.f37227;
        i2 = c8159.f25155;
        if (i4 != i2) {
            return false;
        }
        int i5 = this.f37186.get();
        i3 = c8159.f25153;
        if (i5 != i3) {
            return false;
        }
        String str2 = this.f37245.f73293;
        str = c8159.f25154;
        return str2.equals(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30358(C8159 c8159) {
        InterfaceC7785 interfaceC7785;
        int i;
        int i2;
        if (m30434(c8159)) {
            m30456(false);
            InterfaceC7785 interfaceC77852 = this.f37322;
            interfaceC7785 = c8159.f25156;
            if (interfaceC77852 == interfaceC7785) {
                int mo26548 = this.f37322.mo26548();
                i = c8159.f25157;
                if (mo26548 == i) {
                    int i3 = this.f37227;
                    i2 = c8159.f25155;
                    if (i3 == i2 && !this.f37322.isChanged()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30297() {
        return this.f37322.isChanged();
    }

    /* renamed from: ᩴᩳ, reason: not valid java name and contains not printable characters */
    private void m30269() {
        C22686 c22686 = this.f37245;
        if (c22686.f73263 && c22686.f73264) {
            boolean z = c22686.f73291;
            RectF rectF = this.f37282;
            if (z) {
                rectF.left -= this.f37258.f10000;
            } else {
                rectF.right += this.f37258.f10000;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30312(RectF rectF, int i) {
        this.f37258.m9779(rectF, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30345(boolean z) {
        if (m30519()) {
            return;
        }
        HandlerC13637 handlerC13637 = this.f37207;
        if (z) {
            handlerC13637.removeMessages(1);
            m30291(Selection.getSelectionEnd(this.f37322), true);
        } else {
            if (handlerC13637.hasMessages(1)) {
                return;
            }
            handlerC13637.sendEmptyMessage(1);
        }
    }

    /* renamed from: ۠ܽ, reason: not valid java name and contains not printable characters */
    public final void m30404() {
        this.f37207.removeMessages(1);
    }

    /* renamed from: ֨ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m30119() {
        if (!m30505() || this.f37258.mo9770() || m30394() <= 0 || m30542() <= 0) {
            return false;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        return !(abstractC3179 instanceof C17474) || ((C17474) abstractC3179).m40874(m30394());
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m30188(int i, int i2) {
        m30191();
        boolean m30519 = m30519();
        OverScroller overScroller = this.f37285;
        AtomicInteger atomicInteger = this.f37202;
        if (m30519) {
            atomicInteger.incrementAndGet();
            overScroller.forceFinished(true);
            this.f37318 = new C13097(this, i, i2);
            return false;
        }
        if (!m30505()) {
            return false;
        }
        atomicInteger.incrementAndGet();
        overScroller.forceFinished(true);
        if (m30119()) {
            return true;
        }
        this.f37318 = new C13097(this, i, i2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۡᩳ, reason: not valid java name and contains not printable characters */
    public void m30191() {
        this.f37318 = null;
        if (this.f37296 != null) {
            this.f37296 = null;
            this.f37285.forceFinished(true);
        }
    }

    /* renamed from: ܺᩳ, reason: not valid java name and contains not printable characters */
    private void m30244() {
        if (this.f37296 == null) {
            return;
        }
        OverScroller overScroller = this.f37285;
        if (!overScroller.isFinished() && this.f37296.m31756(this)) {
            this.f37318 = this.f37296;
        }
        this.f37296 = null;
        overScroller.forceFinished(true);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30201(int i, int i2, int i3, int i4) {
        this.f37296 = new C13097(this, i, i2);
        this.f37321 = false;
        this.f37285.startScroll(getScrollX(), this.f37170, i3 - getScrollX(), i4 - this.f37170);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m30293() {
        C13097 c13097 = this.f37318;
        if (c13097 != null) {
            if (!c13097.m31756(this)) {
                m30191();
                return false;
            }
            if (m30119()) {
                C13097 c130972 = this.f37318;
                int i = c130972.f39215;
                int max = Math.max(0, Math.min(c130972.f39219, this.f37322.length()));
                m30191();
                if (i == 1) {
                    m30349(max, true);
                    return true;
                }
                if (i == 2) {
                    m30430(true);
                    return true;
                }
                if (i == 3) {
                    m30427(max, true);
                    return true;
                }
                if (i != 4) {
                    return true;
                }
                m30478(true);
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30364(int i) {
        if (this.f37318 == null && this.f37296 == null) {
            m30123(0, i, false);
        }
    }

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final int m30459() {
        return Math.min(this.f37245.f73259, Math.max(0, m30542() / 2));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30349(int i, boolean z) {
        this.f37207.removeMessages(1);
        return m30291(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ca, code lost:
    
        if (r1 != r4) goto L42;
     */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m30291(int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30291(int, boolean):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m30238(int r6) {
        /*
            r5 = this;
            boolean r0 = r5.m30519()
            if (r0 == 0) goto L8
            goto L84
        L8:
            l.ۗۤᩳ r0 = r5.f37258
            boolean r0 = r0.mo8160()
            if (r0 != 0) goto L12
            goto L84
        L12:
            r5.m30191()
            l.ܰۛᩳ r0 = r5.f37207
            r1 = 1
            r0.removeMessages(r1)
            android.widget.OverScroller r0 = r5.f37285
            r0.forceFinished(r1)
            l.ۗۤᩳ r0 = r5.f37258     // Catch: java.lang.IndexOutOfBoundsException -> L84
            android.graphics.RectF r2 = r5.f37282     // Catch: java.lang.IndexOutOfBoundsException -> L84
            r0.mo8157(r2, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L84
            r5.m30269()     // Catch: java.lang.IndexOutOfBoundsException -> L84
            int r6 = r5.getScrollX()
            l.᩺֫ܿ r0 = r5.f37245
            float r0 = r0.m24484()
            l.᩺֫ܿ r2 = r5.f37245
            android.graphics.drawable.Drawable r2 = r2.f73231
            int r2 = r2.getIntrinsicWidth()
            float r2 = (float) r2
            float r0 = java.lang.Math.max(r0, r2)
            android.graphics.RectF r2 = r5.f37282
            float r2 = r2.left
            float r3 = (float) r6
            float r4 = r3 + r0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L53
            float r2 = r2 - r0
            int r6 = (int) r2
            int r6 = r5.m30390(r6)
            goto L75
        L53:
            int r2 = r5.m30394()
            float r2 = (float) r2
            float r2 = r2 - r0
            r0 = 0
            float r0 = java.lang.Math.max(r2, r0)
            android.graphics.RectF r2 = r5.f37282
            float r2 = r2.right
            float r3 = r3 + r0
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 <= 0) goto L6e
            float r2 = r2 - r0
            int r6 = (int) r2
            int r6 = r5.m30390(r6)
            goto L75
        L6e:
            int r0 = r5.m30390(r6)
            if (r0 == r6) goto L77
            r6 = r0
        L75:
            r0 = 1
            goto L7a
        L77:
            r6 = 0
            r6 = r0
            r0 = 0
        L7a:
            if (r0 == 0) goto L84
            int r0 = r5.f37170
            r5.m30123(r6, r0, r1)
            r5.invalidate()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30238(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m30427(int r11, boolean r12) {
        /*
            r10 = this;
            l.ܰۛᩳ r0 = r10.f37207
            r1 = 1
            r0.removeMessages(r1)
            r0 = 3
            boolean r2 = r10.m30188(r0, r11)
            if (r2 != 0) goto Lf
            goto Lbf
        Lf:
            if (r12 != 0) goto L1e
            boolean r2 = r10.isAttachedToWindow()
            if (r2 == 0) goto L1d
            int r2 = r10.getVisibility()
            if (r2 == 0) goto L1e
        L1d:
            r12 = 1
        L1e:
            l.ۗۤᩳ r2 = r10.f37258     // Catch: java.lang.IndexOutOfBoundsException -> Lbf
            android.graphics.RectF r3 = r10.f37282     // Catch: java.lang.IndexOutOfBoundsException -> Lbf
            r2.mo8157(r3, r11)     // Catch: java.lang.IndexOutOfBoundsException -> Lbf
            r10.m30269()     // Catch: java.lang.IndexOutOfBoundsException -> Lbf
            int r2 = r10.getScrollX()
            int r3 = r10.f37170
            l.ۗۤᩳ r4 = r10.f37258
            boolean r4 = r4.mo8160()
            r5 = 0
            if (r4 == 0) goto L70
            l.ۗۤᩳ r4 = r10.f37258
            int r4 = r4.mo8162()
            int r6 = r10.m30394()
            int r6 = r6 / r0
            int r4 = java.lang.Math.max(r4, r6)
            float r4 = (float) r4
            android.graphics.RectF r6 = r10.f37282
            float r6 = r6.left
            float r7 = (float) r2
            float r8 = r7 + r4
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 >= 0) goto L58
            float r6 = r6 - r4
            int r4 = (int) r6
            if (r4 >= 0) goto L6e
            r4 = 0
            goto L6e
        L58:
            int r6 = r10.m30394()
            float r6 = (float) r6
            float r6 = r6 - r4
            r4 = 0
            float r4 = java.lang.Math.max(r6, r4)
            android.graphics.RectF r6 = r10.f37282
            float r6 = r6.right
            float r7 = r7 + r4
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L70
            float r6 = r6 - r4
            int r4 = (int) r6
        L6e:
            r6 = 1
            goto L72
        L70:
            r6 = 0
            r4 = r2
        L72:
            android.graphics.RectF r7 = r10.f37282
            float r8 = r7.top
            float r7 = r7.bottom
            float r8 = r8 + r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r7
            int r9 = r10.m30542()
            float r9 = (float) r9
            float r9 = r9 / r7
            float r8 = r8 - r9
            int r7 = (int) r8
            android.graphics.RectF r8 = r10.f37282
            float r8 = r8.bottom
            int r9 = r10.m30459()
            float r9 = (float) r9
            float r8 = r8 + r9
            int r9 = r10.m30542()
            float r9 = (float) r9
            float r8 = r8 - r9
            int r8 = (int) r8
            int r7 = java.lang.Math.max(r7, r8)
            int r7 = r10.m30521(r7)
            if (r7 == r3) goto La1
            r6 = 1
            goto La2
        La1:
            r7 = r3
        La2:
            int r4 = r10.m30390(r4)
            int r7 = r10.m30521(r7)
            if (r4 != r2) goto Lae
            if (r7 == r3) goto Laf
        Lae:
            r5 = 1
        Laf:
            r2 = r6 | r5
            if (r2 == 0) goto Lbc
            if (r12 == 0) goto Lb9
            r10.m30123(r4, r7, r1)
            goto Lbc
        Lb9:
            r10.m30201(r0, r11, r4, r7)
        Lbc:
            r10.postInvalidate()
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30427(int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008d  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m30430(boolean r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30430(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m30478(boolean r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30478(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۬ᩳ, reason: not valid java name and contains not printable characters */
    public void m30227() {
        this.f37312 = -1;
        this.f37298 = -1;
    }

    /* renamed from: ᩴ */
    public void mo25919(int i) {
        BaseInputConnection.removeComposingSpans(this.f37322);
        this.f37322.setSelection(i);
        m30227();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* renamed from: ᩷ */
    public void mo25922(int i, int i2) {
        BaseInputConnection.removeComposingSpans(this.f37322);
        this.f37322.setSelection(i, i2);
        m30227();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m30512(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException();
        }
        int i2 = this.f37200;
        if (i2 != i) {
            if (i2 != 0 && i != 0) {
                AbstractC3179 abstractC3179 = this.f37258;
                if (abstractC3179 instanceof C17474) {
                    ((C17474) abstractC3179).m40869(i == 1);
                    this.f37200 = i;
                    m30364(this.f37170);
                    invalidate();
                }
            }
            m30126(AbstractC3179.m9745(this, this.f37322, this.f37245, i), true);
            this.f37200 = i;
            m30364(this.f37170);
            invalidate();
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m30513(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73261 != z) {
            c22686.f73261 = z;
            AbstractC3179 abstractC3179 = this.f37258;
            if (abstractC3179 instanceof C17474) {
                C17474 c17474 = (C17474) abstractC3179;
                c17474.m40869(c17474.m40872());
                m30364(this.f37170);
                invalidate();
            }
        }
    }

    /* renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public final int m30388() {
        return this.f37200;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30475(float f) {
        m30424(f * this.f37245.f29053);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30309(float f) {
        if (f < 0.8f || f > 2.0f) {
            throw new IllegalArgumentException("Line spacing must be between 0.8 and 2.0");
        }
        if (this.f37245.m24500() == f) {
            return;
        }
        this.f37285.forceFinished(true);
        float m24484 = this.f37245.m24484();
        double d = m24484 > 0.0f ? this.f37170 / m24484 : 0.0d;
        this.f37202.incrementAndGet();
        this.f37245.mo24477(f);
        AbstractC3179 abstractC3179 = this.f37258;
        if (abstractC3179 instanceof C2575) {
            ((C2575) abstractC3179).m8168();
        }
        m30289();
        m30392(getScrollX(), m30521((int) Math.min(2147483647L, Math.round(d * this.f37245.m24484()))));
        this.f37221 = -1.0f;
        requestLayout();
        invalidate();
    }

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public final float m30395() {
        C22686 c22686 = this.f37245;
        return c22686.f29058.getTextSize() / c22686.f29053;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30424(float f) {
        this.f37245.m50689(f);
        m30289();
        this.f37258.mo8173();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30310(float f, int i) {
        C22686 c22686 = this.f37245;
        c22686.m50684(f * c22686.f29053, i);
        m30289();
        this.f37258.mo8173();
        this.f37221 = -1.0f;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30317(String str, boolean z) {
        if (!this.f37287 && !this.f37304) {
            this.f37250 = null;
        }
        this.f37235.m18599();
        if (str == null) {
            str = "Text";
        }
        if (this.f37235.m18581(str)) {
            this.f37235.m18578((CharSequence) this.f37322);
            C22686 c22686 = this.f37245;
            c22686.f73297 = str;
            c22686.f73267 = true;
        } else if (str.startsWith(".") && this.f37235.m18569(str)) {
            this.f37235.m18578((CharSequence) this.f37322);
            C22686 c226862 = this.f37245;
            c226862.f73297 = str;
            c226862.f73267 = true;
        } else {
            this.f37245.f73267 = false;
        }
        if (this.f37245.f73267 && this.f37235.m18574()) {
            this.f37315.m52257(this.f37235.m18587());
        } else {
            this.f37315.m52257(C23701.f76752);
        }
        this.f37258.mo9784();
        m30405();
        if (z) {
            postInvalidate();
        }
    }

    /* renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30483() {
        if ((!m30519() || m30379()) && !this.f37277) {
            return ((this.f37187 && this.f37240 != this.f37218) || this.f37287 || this.f37304) ? false : true;
        }
        return false;
    }

    /* renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30389() {
        return (((!this.f37277 || !this.f37187) && (!m30519() || m30379())) || this.f37287 || this.f37304) ? false : true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m30489(int i, int i2) {
        if (m30519() || !this.f37258.mo9791(i, i2)) {
            return false;
        }
        if (this.f37241) {
            return true;
        }
        m30405();
        invalidate();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30359(int[] iArr) {
        return m30157(iArr, false, 0, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30348(int i, int i2, int[] iArr) {
        return m30157(iArr, true, i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30157(int[] iArr, boolean z, int i, int i2) {
        if (iArr == null || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid syntax dirty ranges");
        }
        boolean z2 = this.f37241;
        this.f37241 = true;
        try {
            return m30216(iArr, z, i, i2);
        } finally {
            this.f37241 = z2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (m30489(r6, r7) != false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m30156(boolean r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            r2 = this;
            boolean r0 = r2.f37241
            r1 = 1
            r2.f37241 = r1
            boolean r4 = r2.m30489(r4, r5)     // Catch: java.lang.Throwable -> L37
            r5 = 0
            if (r4 == 0) goto L16
            if (r6 < 0) goto L14
            boolean r4 = r2.m30489(r6, r7)     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L16
        L14:
            r4 = 1
            goto L17
        L16:
            r4 = 0
        L17:
            r2.f37241 = r0
            if (r4 != 0) goto L1c
            return r5
        L1c:
            if (r0 != 0) goto L36
            if (r3 == 0) goto L30
            l.᩻۫ᩳ r3 = r2.f37315
            if (r3 == 0) goto L30
            int r4 = r2.m30444()
            int r5 = r2.m30448()
            r3.m52254(r4, r5, r8, r9)
            goto L33
        L30:
            r2.m30405()
        L33:
            r2.invalidate()
        L36:
            return r1
        L37:
            r3 = move-exception
            r2.f37241 = r0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30156(boolean, int, int, int, int, int, int):boolean");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m30216(int[] iArr, boolean z, int i, int i2) {
        boolean m30156;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 3;
            if (i4 >= iArr.length) {
                if (i3 >= iArr.length) {
                    return true;
                }
                if (z) {
                    return m30156(true, iArr[i3], iArr[i3 + 1], -1, -1, i, i2);
                }
                return m30489(iArr[i3], iArr[i3 + 1]);
            }
            if (!z) {
                m30156 = m30156(false, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], 0, 0);
            } else {
                m30156 = m30156(true, iArr[i3], iArr[i3 + 1], iArr[i3 + 2], iArr[i4], i, i2);
            }
            if (!m30156) {
                return false;
            }
            i3 += 4;
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30365(boolean z) {
        this.f37245.m24494(z);
        this.f37221 = -1.0f;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m30295(boolean z) {
        this.f37245.m24497(z);
        this.f37221 = -1.0f;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30507(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73263 != z) {
            c22686.f73263 = z;
        }
        this.f37221 = -1.0f;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m30541(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73264 != z) {
            c22686.f73264 = z;
        }
        this.f37221 = -1.0f;
    }

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final int m30402() {
        return this.f37175;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۨᩳ, reason: not valid java name and contains not printable characters */
    public void m30221() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            post(new RunnableC15048(0, this));
        } else {
            setPadding(getPaddingLeft(), getPaddingTop() - this.f37175, getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int max = Math.max(0, (this.f37245 == null ? 0 : (int) Math.ceil(Math.max(0.0f, r1.m24496() - r1.m24501()))) - i2);
        this.f37175 = max;
        super.setPadding(i, i2 + max, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩺ᩳ, reason: not valid java name and contains not printable characters */
    public void m30289() {
        m30221();
        C8741 c8741 = this.f37225;
        if (c8741 != null) {
            c8741.m22613(this.f37245.m24484());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۖᩳ, reason: not valid java name and contains not printable characters */
    public void m30162() {
        C8741 c8741 = this.f37225;
        if (c8741 != null) {
            c8741.m22612();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m30200(int i, int i2, int i3) {
        if (isInEditMode()) {
            return;
        }
        if (this.f37225 == null) {
            this.f37225 = new C8741(this);
            m30289();
        }
        this.f37225.m22614(i, i2, i3);
    }

    /* renamed from: ۫ܽ, reason: not valid java name and contains not printable characters */
    public final void m30446() {
        this.f37197 = false;
    }

    /* renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30403() {
        return this.f37197;
    }

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 m30503() {
        return this.f37205;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۧۛᩳ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30318(ArrayList arrayList) {
        arrayList.addAll(C4711.m13810());
        arrayList.add(new C3055(this, new InterfaceC13041() { // from class: l.ۧۛᩳ
            @Override // l.InterfaceC13041
            public final void accept(Object obj) {
                TextKeyListener textKeyListener = C12392.f37169;
                C12392.this.m30406(R.string.MT_Protector_res_0x7f1201a3);
            }
        }));
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30406(int i) {
        int i2;
        AbstractActivityC3346 abstractActivityC3346 = this.f37205;
        if (i == R.string.MT_Protector_res_0x7f120a91) {
            abstractActivityC3346.m10233().m2479(this);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f120a19) {
            C14714.m35010(this);
            return;
        }
        if (i == R.string.MT_Protector_res_0x7f120930) {
            i2 = android.R.id.startSelectingText;
        } else if (i == 17039373) {
            i2 = android.R.id.selectAll;
        } else if (i == 17039363) {
            i2 = android.R.id.cut;
        } else {
            if (i == 17039361) {
                int m30444 = m30444();
                int m30448 = m30448();
                int min = Math.min(m30444, m30448);
                int max = Math.max(m30444, m30448);
                if (min == max || !m30352(this.f37322.subSequence(min, max))) {
                    return;
                }
                mo25919(m30448);
                m30345(false);
                m30400();
                return;
            }
            if (i == 17039371) {
                i2 = android.R.id.paste;
            } else {
                if (i == R.string.MT_Protector_res_0x7f1205ff) {
                    InterfaceC22602 interfaceC22602 = this.f37191;
                    if (interfaceC22602 != null) {
                        interfaceC22602.mo11728();
                    }
                } else if (i == R.string.MT_Protector_res_0x7f1205f3) {
                    if (this.f37191 != null) {
                        int m304442 = m30444();
                        int m304482 = m30448();
                        int min2 = Math.min(m304442, m304482);
                        int max2 = Math.max(m304442, m304482);
                        C22686 c22686 = this.f37245;
                        c22686.f73250 = min2;
                        c22686.f73229 = max2;
                        mo25919(min2);
                        this.f37191.mo11735(true, true);
                        m30465();
                        return;
                    }
                } else {
                    if (i == R.string.MT_Protector_res_0x7f12021d) {
                        getContext().startActivity(new Intent(getContext(), (Class<?>) ActivityC9923.class));
                        return;
                    }
                    if (i == R.string.MT_Protector_res_0x7f120612) {
                        C22975.m51118(this);
                        return;
                    }
                    if (i == R.string.MT_Protector_res_0x7f1205ca) {
                        int m304443 = m30444();
                        int m304483 = m30448();
                        this.f37322.delete(Math.min(m304443, m304483), Math.max(m304443, m304483));
                        invalidate();
                    } else {
                        if (i == R.string.MT_Protector_res_0x7f120606) {
                            try {
                                String m30378 = m30378();
                                if (m30378 != null) {
                                    Intent intent = new Intent();
                                    intent.setAction("android.intent.action.SEND");
                                    intent.putExtra("android.intent.extra.TEXT", m30378);
                                    intent.setType("text/plain");
                                    getContext().startActivity(Intent.createChooser(intent, null));
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                Throwable th = e;
                                while (!TransactionTooLargeException.class.isInstance(th)) {
                                    th = th.getCause();
                                    if (th == null) {
                                        if (abstractActivityC3346 != null) {
                                            abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
                                            return;
                                        } else {
                                            C21374.m48459((CharSequence) e.toString());
                                            return;
                                        }
                                    }
                                }
                                C21374.m48457(R.string.MT_Protector_res_0x7f120933);
                                return;
                            }
                        }
                        if (i == R.string.MT_Protector_res_0x7f1201a3) {
                            try {
                                C6870.m18553(abstractActivityC3346, this.f37322, this.f37255.m34926(), this.f37255.m34925(), Integer.parseInt(this.f37255.m34927().m49200().split("\\|")[1]));
                            } catch (Exception e2) {
                                abstractActivityC3346.m10223(e2, (DialogInterface.OnDismissListener) null);
                            }
                        } else if (i == R.string.MT_Protector_res_0x7f1205ef) {
                            String m303782 = m30378();
                            if (m303782 != null) {
                                String m19032 = C7053.m19032(m303782);
                                if (abstractActivityC3346 == null) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(m19032));
                                    intent2.addFlags(268435456);
                                    try {
                                        C4925.m14335().startActivity(intent2);
                                        return;
                                    } catch (Throwable th2) {
                                        C21374.m48459((CharSequence) th2.toString());
                                        return;
                                    }
                                }
                                abstractActivityC3346.m10237(m19032);
                                return;
                            }
                            return;
                        }
                    }
                }
                i2 = -1;
            }
        }
        if (i2 > 0) {
            m30466(i2);
        }
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C2141 m30524() {
        return this.f37183;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30320(InterfaceC0397 interfaceC0397) {
        this.f37299 = interfaceC0397;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m30214(MotionEvent motionEvent) {
        return (motionEvent.getSource() & o.a.r) == 8194;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m30215(int[] iArr) {
        int i;
        int i2;
        if (!isInEditMode()) {
            if (this.f37311 == null) {
                C7701 c7701 = new C7701(this);
                c7701.m20615(4500);
                c7701.m20613(new InterfaceC14050() { // from class: l.ܰۤᩳ
                    @Override // l.InterfaceC14050
                    public final void onMenuItemClick(MenuItem menuItem) {
                        TextKeyListener textKeyListener = C12392.f37169;
                        C12392 c12392 = C12392.this;
                        c12392.getClass();
                        CharSequence title = menuItem.getTitle();
                        if (title instanceof C16271) {
                            ((C16271) title).m38282().mo8779(c12392);
                        }
                    }
                });
                this.f37311 = c7701;
            }
            this.f37311.m20617();
            this.f37311.m20612((C6001) null);
            ArrayList arrayList = new ArrayList();
            InterfaceC0397 interfaceC0397 = this.f37299;
            if (interfaceC0397 != null) {
                interfaceC0397.mo1091(arrayList);
            }
            boolean z = (m30370() || this.f37245.f73272) ? false : true;
            boolean z2 = this.f37322.length() == 0;
            int m30444 = m30444();
            int m30448 = m30448();
            if (m30444 > m30448) {
                i2 = m30444;
                i = m30448;
            } else {
                i = m30444;
                i2 = m30448;
            }
            if (iArr != null) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            ArrayList arrayList2 = new ArrayList();
            Map m13812 = C4711.m13812();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC2867 abstractC2867 = (AbstractC2867) it.next();
                Integer num = (Integer) m13812.get(abstractC2867.mo8778());
                if (num != null && abstractC2867.mo8780(this, z, z2, i, i2)) {
                    C12640 m20607 = this.f37311.m20607(abstractC2867.mo8781(), num.intValue());
                    m20607.m30912(abstractC2867.mo8777(getContext()));
                    if (num.intValue() >= 300) {
                        m20607.m30911();
                    }
                    if (abstractC2867.mo8782()) {
                        arrayList2.add(abstractC2867);
                    }
                }
            }
            if (!this.f37311.m20616()) {
                if (!arrayList2.isEmpty()) {
                    this.f37311.m20612(new C6001(0, arrayList2));
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        if (((r5.top - r13.f37170) - r13.f37311.m20614()) < r7) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015f  */
    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m30299(int r14) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30299(int):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30498(int i, boolean z) {
        int[] m30480 = m30480(i, z);
        m30455(m30444(), m30480[0]);
        mo25922(m30480[0], m30480[1]);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] m30480(int i, boolean z) {
        int[] m18582;
        C6870 c6870 = this.f37235;
        if (c6870.m18575() && (m18582 = c6870.m18582(i)) != null) {
            return m18582;
        }
        int[] m30179 = m30179(i, z);
        int i2 = m30179[0];
        int i3 = m30179[1];
        if (i2 == i3) {
            return m30179;
        }
        String substring = TextUtils.substring(this.f37322, i2, i3);
        BreakIterator breakIterator = this.f37253;
        breakIterator.setText(substring);
        int i4 = i - i2;
        try {
            int preceding = breakIterator.preceding(i4);
            if (preceding < 0) {
                preceding = 0;
            }
            int next = breakIterator.next();
            m30179[0] = preceding + i2;
            m30179[1] = i2 + next;
            return m30179;
        } catch (Exception unused) {
            int i5 = i4 + i2;
            m30179[0] = i5;
            m30179[1] = i5;
            return m30179;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int[] m30179(int i, boolean z) {
        int i2;
        int i3;
        int m9790 = this.f37258.m9790(i);
        if (m9790 == 0) {
            i2 = 0;
        } else {
            C11747 c11747 = this.f37258.f9998.get(m9790);
            int i4 = c11747.f35062;
            int i5 = c11747.f35064;
            int i6 = m9790 - 1;
            while (true) {
                if (i6 < 0) {
                    break;
                }
                C11747 c117472 = this.f37258.f9998.get(i6);
                if (c117472.f35064 == i5) {
                    i4 = c117472.f35062;
                    if (Math.abs(i - i4) > 10000) {
                        break;
                    }
                    i6--;
                } else if (z) {
                    i2 = c117472.f35063;
                }
            }
            i2 = i4;
        }
        if (m9790 == this.f37258.f9998.size() - 1) {
            i3 = this.f37322.length();
        } else {
            C11747 c117473 = this.f37258.f9998.get(m9790);
            int i7 = c117473.f35063;
            int i8 = c117473.f35064;
            while (true) {
                m9790++;
                if (m9790 >= this.f37258.f9998.size()) {
                    break;
                }
                C11747 c117474 = this.f37258.f9998.get(m9790);
                if (c117474.f35064 == i8) {
                    i7 = c117474.f35063;
                    if (Math.abs(i7 - i) > 10000) {
                        break;
                    }
                } else if (z) {
                    i3 = c117474.f35062;
                }
            }
            i3 = i7;
        }
        return new int[]{i2, i3};
    }

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 m30436() {
        return this.f37322;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m30253(InterfaceC7785 interfaceC7785) {
        boolean z;
        if (!mo25916()) {
            interfaceC7785.mo1601().m52363(0L);
        }
        synchronized (this.f37260) {
            z = this.f37322 != interfaceC7785;
            if (z) {
                this.f37244 = null;
                m30191();
                this.f37202.incrementAndGet();
            }
            if (z) {
                this.f37247 = null;
                this.f37252 = null;
                this.f37234 = 0L;
                this.f37302 = null;
            }
            this.f37322 = interfaceC7785;
        }
        if (z) {
            AbstractC3179 abstractC3179 = this.f37258;
            if (abstractC3179 != null) {
                abstractC3179.m9785();
            }
            m30252("Session view owner changed");
            if (this.f37272.isEmpty()) {
                return;
            }
            C4925.m14315(new RunnableC7994(0, this));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m30260(InterfaceC7785 interfaceC7785) {
        synchronized (this.f37230) {
            Iterator it = this.f37230.iterator();
            while (it.hasNext()) {
                if (((InterfaceC7785) it.next()) == interfaceC7785) {
                    return;
                }
            }
            this.f37230.add(interfaceC7785);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۙᩳ, reason: not valid java name and contains not printable characters */
    public void m30171() {
        AbstractC3179 abstractC3179;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new RunnableC21400(0, this));
            return;
        }
        synchronized (this.f37230) {
            int size = this.f37230.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                InterfaceC7785 interfaceC7785 = (InterfaceC7785) this.f37230.get(size);
                if (interfaceC7785 != this.f37322 && ((abstractC3179 = this.f37258) == null || interfaceC7785 != abstractC3179.f10015)) {
                    this.f37230.remove(size);
                    interfaceC7785.mo13046(false);
                }
            }
        }
        if (this.f37171 && !this.f37277 && this.f37258.f10015 == this.f37322) {
            requestLayout();
        }
    }

    /* renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30493() {
        return this.f37194;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30336(AbstractC15440 abstractC15440) {
        if (this.f37322.mo1607()) {
            return;
        }
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (interfaceC7785 instanceof C4342) {
            throw new IllegalStateException("Session already owns storage");
        }
        C0273 c0273 = (C0273) interfaceC7785;
        while (this.f37322 == c0273 && !this.f37194) {
            int mo26548 = c0273.mo26548();
            long mo1606 = c0273.mo1606();
            C5753 m16202 = C5753.m16202(abstractC15440);
            try {
                C14548 m52372 = c0273.mo1601().m52372();
                try {
                    m16202.mo1601().m52341(m52372);
                    m16202.mo1603(c0273.mo1606());
                    m16202.m16203();
                    m52372.close();
                    if (m30152(c0273, m16202, mo26548, mo1606)) {
                        return;
                    } else {
                        m16202.mo1608();
                    }
                } catch (Throwable th) {
                    try {
                        m52372.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | Error | RuntimeException e) {
                m16202.close();
                throw e;
            }
        }
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30447() {
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (!(interfaceC7785 instanceof C5753)) {
            return FutureC3575.m10905(null);
        }
        C5753 c5753 = (C5753) interfaceC7785;
        return c5753.m1604().m10920(new RunnableC8700(0, this, c5753), C1802.f6209);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30139(C12392 c12392, C5753 c5753) {
        while (c12392.f37322 == c5753 && !c12392.f37194) {
            try {
                if (!c12392.m30152(c5753, C0273.m1590(c5753), c5753.mo26548(), c5753.mo1606())) {
                }
            } catch (IOException e) {
                throw new C13452(e);
            }
        }
        try {
            c5753.mo1608();
        } catch (IOException e2) {
            throw new C13452(e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30136(C12392 c12392, C0273 c0273, C0273 c02732) {
        C6768 c6768 = c12392.f37248;
        c0273.mo1593(c12392.f37232);
        c0273.mo1592(c02732.mo1591());
        for (Object obj : c02732.getSpans(0, c02732.length(), Object.class)) {
            if (obj != c6768 && obj != Selection.SELECTION_START && obj != Selection.SELECTION_END) {
                c0273.setSpan(obj, c02732.getSpanStart(obj), c02732.getSpanEnd(obj), c02732.getSpanFlags(obj));
            }
        }
        c0273.setFilters(c02732.getFilters());
        c0273.setSpan(c6768, 0, c0273.length(), 8388626);
        c12392.m30253(c0273);
    }

    /* renamed from: ܿᩳ, reason: not valid java name and contains not printable characters */
    public final void m30494() {
        if (this.f37185) {
            return;
        }
        if (this.f37322.length() != 0 || (this.f37322 instanceof C4342)) {
            throw new IllegalStateException("Memory text mode must be selected before loading text");
        }
        this.f37185 = true;
        m30259((CharSequence) new C0273(""));
        ComponentCallbacks2 m15313 = C5350.m15313(getContext());
        if (m15313 instanceof InterfaceC23586) {
            ((InterfaceC23586) m15313).getLifecycle().mo19833(new C12932(new WeakReference(this)));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC7785 m30245(CharSequence charSequence) {
        if (!this.f37185 || (charSequence instanceof C0273) || (charSequence instanceof C4342)) {
            return charSequence instanceof InterfaceC7785 ? (InterfaceC7785) charSequence : new C0273(charSequence);
        }
        return new C0273(charSequence);
    }

    /* renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public final int m30526() {
        return this.f37322.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30339(C20030 c20030) {
        synchronized (this.f37217) {
            m30212(c20030);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30340(final C20030 c20030, final Runnable runnable) {
        synchronized (this.f37182) {
            this.f37182.addLast(new Runnable() { // from class: l.᩷ۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C12392.m30144(C12392.this, c20030, runnable);
                }
            });
            if (this.f37305 == null) {
                m30224();
            }
        }
    }

    /* renamed from: ۫ᩳ, reason: not valid java name and contains not printable characters */
    private void m30224() {
        boolean z;
        synchronized (this.f37182) {
            this.f37305 = null;
            if (this.f37302 == null) {
                C21565 c21565 = this.f37222;
                if (c21565 != null) {
                    z = c21565.f69292;
                    if (z) {
                    }
                }
                Runnable runnable = (Runnable) this.f37182.pollFirst();
                this.f37305 = runnable;
                if (runnable != null) {
                    try {
                        C1802.f6208.submit(runnable);
                    } catch (RuntimeException e) {
                        this.f37182.addFirst(this.f37305);
                        this.f37305 = null;
                        throw e;
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30153(final InterfaceC7785 interfaceC7785, final AbstractC3179 abstractC3179, final AbstractC3179 abstractC31792, final int i) {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: l.֡ۛᩳ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C12392.m30122(C12392.this, interfaceC7785, abstractC3179, abstractC31792, i);
            }
        });
        if (Looper.myLooper() == Looper.getMainLooper()) {
            futureTask.run();
        } else {
            C4925.m14315(futureTask);
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    if (cause instanceof Error) {
                        throw ((Error) cause);
                    }
                    throw new RuntimeException(cause);
                }
            } finally {
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return ((Boolean) futureTask.get()).booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Boolean m30122(C12392 c12392, InterfaceC7785 interfaceC7785, AbstractC3179 abstractC3179, AbstractC3179 abstractC31792, int i) {
        synchronized (c12392.f37260) {
            if (c12392.f37322 == interfaceC7785 && c12392.f37258 == abstractC3179 && abstractC31792.m9757()) {
                c12392.f37200 = i;
                c12392.m30126(abstractC31792, true);
                c12392.f37235.m18584(interfaceC7785);
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30212(final C20030 c20030) {
        AbstractC3179 abstractC3179;
        if (c20030.f64875 != this.f37245.m24500()) {
            FutureTask futureTask = new FutureTask(new Callable() { // from class: l.ۘۛᩳ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    C12392 c12392 = C12392.this;
                    c12392.getClass();
                    c12392.m30309(c20030.f64875);
                    return null;
                }
            });
            if (Looper.myLooper() == Looper.getMainLooper()) {
                futureTask.run();
            } else {
                C4925.m14315(futureTask);
            }
            boolean z = false;
            while (true) {
                try {
                    try {
                        futureTask.get();
                        break;
                    } finally {
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e) {
                    throw new IllegalStateException("Cannot apply line spacing", e.getCause());
                }
            }
        }
        this.f37207.removeMessages(1);
        this.f37285.forceFinished(true);
        this.f37221 = -1.0f;
        this.f37235.m18571();
        m30282();
        this.f37277 = true;
        boolean z2 = c20030.f64862;
        AbstractC3179 abstractC31792 = null;
        if (z2 != c20030.f64870) {
            if (z2) {
                m30317(c20030.f64860, false);
            } else {
                m30317((String) null, false);
            }
        }
        int i = c20030.f64867;
        boolean z3 = (i == c20030.f64872 && c20030.f64880 == c20030.f64881 && (i != 1 || C11003.equals(c20030.f64876, c20030.f64874))) ? false : true;
        boolean z4 = c20030.f64879;
        C22686 c22686 = this.f37245;
        boolean z5 = z4 != c22686.f73263;
        boolean z6 = c20030.f64882 != c22686.m24499();
        boolean z7 = c20030.f64863 != this.f37245.m24470();
        boolean z8 = c20030.f64868;
        C22686 c226862 = this.f37245;
        boolean z9 = z8 != c226862.f73261;
        int i2 = c20030.f64877;
        int i3 = this.f37200;
        boolean z10 = i2 != i3 || (i3 != 0 && z9);
        boolean z11 = c20030.f64865 != c226862.m24485();
        if (!z3 && !z5 && !z6 && !z7 && !z10 && !z11) {
            this.f37277 = false;
            this.f37235.m18597(this.f37322);
            m30165();
            m30231(this.f37170, false);
            return;
        }
        if (z3) {
            C22686 c226863 = this.f37245;
            c226863.m50684(c20030.f64880 * c226863.f29053, c20030.f64867);
            m30289();
        }
        if (z5) {
            this.f37245.f73263 = c20030.f64879;
        }
        if (z6) {
            this.f37245.m24494(c20030.f64882);
        }
        if (z7) {
            this.f37245.m24497(c20030.f64863);
        }
        if (z9) {
            this.f37245.f73261 = c20030.f64868;
        }
        if (z11) {
            this.f37245.m24478(c20030.f64865);
        }
        if (z3 || z6 || z7 || z10 || z11 || (z5 && c20030.f64877 != 0)) {
            int i4 = c20030.f64877;
            int i5 = 0;
            while (true) {
                if (i5 >= 2) {
                    break;
                }
                InterfaceC7785 interfaceC7785 = this.f37322;
                interfaceC7785.setReadOnly(true);
                try {
                    AbstractC3179 abstractC31793 = this.f37258;
                    abstractC31793.mo8165();
                    AbstractC3179 m9745 = AbstractC3179.m9745(this, interfaceC7785, this.f37245, i4);
                    if (!m30153(interfaceC7785, abstractC31793, m9745, i4)) {
                        m9745.mo8165();
                        interfaceC7785.setReadOnly(false);
                        i5++;
                    } else {
                        interfaceC7785.setReadOnly(false);
                        abstractC31792 = m9745;
                        break;
                    }
                } catch (Throwable th) {
                    interfaceC7785.setReadOnly(false);
                    throw th;
                }
            }
            abstractC3179 = abstractC31792;
        } else {
            abstractC3179 = this.f37258;
        }
        if (abstractC3179 == null && m30519()) {
            this.f37200 = c20030.f64877;
        }
        if (abstractC3179 instanceof C17474) {
            final C17474 c17474 = (C17474) abstractC3179;
            post(new Runnable() { // from class: l.ᩴۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    C12392 c12392 = C12392.this;
                    int m30394 = c12392.m30394();
                    AbstractC3179 abstractC31794 = c12392.f37258;
                    C17474 c174742 = c17474;
                    if (abstractC31794 != c174742 || m30394 <= 0 || c174742.mo8163() == m30394) {
                        return;
                    }
                    c174742.mo9783(m30394);
                }
            });
        }
        this.f37277 = false;
        this.f37235.m18597(this.f37322);
        m30165();
        m30231(this.f37170, false);
    }

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30519() {
        C3926 c3926 = this.f37302;
        return c3926 != null && c3926.f12523 == this.f37322;
    }

    /* renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30379() {
        C3926 c3926 = this.f37302;
        return c3926 != null && c3926.f12522 != null && c3926.f12522.f14707 && this.f37258 == c3926.f12522.f14706 && c3926.m11971(this.f37258) && this.f37258.mo8153(new C4590(getScrollX(), this.f37170, m30394(), m30542())) > 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30432(AbstractC3179 abstractC3179) {
        C3926 c3926 = this.f37302;
        if (m30479(abstractC3179)) {
            return true;
        }
        return c3926 != null && c3926.m11971(abstractC3179);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m30490(AbstractC3179 abstractC3179) {
        C3926 c3926 = this.f37302;
        C15213 c15213 = this.f37177;
        if (c15213 == null || c15213.f46683 == null || c15213.f46683.f14706 != abstractC3179) {
            return (c3926 == null || c3926.f12522 == null || c3926.f12522.f14706 != abstractC3179) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r0 == false) goto L67;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m30347(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30347(int, int, int, int):boolean");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30261(C12392 c12392) {
        c12392.f37214 = false;
        if (c12392.f37211) {
            return;
        }
        c12392.f37234 = 0L;
    }

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static void m30159(C12392 c12392) {
        synchronized (c12392.f37182) {
            if (c12392.f37305 == null) {
                c12392.m30224();
            }
        }
    }

    /* renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public final C18743 m30544() {
        return m30538(this.f37200);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18743 m30538(int i) {
        C18743 c18743;
        synchronized (this.f37245) {
            Typeface typeface = this.f37245.f29058.getTypeface();
            float textSize = this.f37245.f29058.getTextSize();
            float textScaleX = this.f37245.f29058.getTextScaleX();
            float textSkewX = this.f37245.f29058.getTextSkewX();
            int m24485 = this.f37245.m24485();
            boolean m24499 = this.f37245.m24499();
            boolean m24470 = this.f37245.m24470();
            boolean z = i != 0 && this.f37245.f73263;
            C22686 c22686 = this.f37245;
            c18743 = new C18743(typeface, textSize, textScaleX, textSkewX, m24485, m24499, m24470, z, c22686.f73291, c22686.f73264, c22686.f73261, i, this.f37235.m18601());
        }
        return c18743;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩸ᩳ, reason: not valid java name and contains not printable characters */
    public void m30282() {
        C3220 c3220 = new C3220();
        c3220.f10148 = -1;
        c3220.f10144 = -1L;
        this.f37250 = c3220;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m30412(boolean z) {
        if (z) {
            m30282();
        }
        this.f37287 = z;
        if (z) {
            this.f37235.m18571();
        } else {
            this.f37250 = null;
            this.f37235.m18589(this.f37322);
        }
        postInvalidate();
        if (z) {
            return;
        }
        m30165();
    }

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final void m30435() {
        this.f37287 = false;
        this.f37235.m18597(this.f37322);
        m30231(this.f37170, false);
        postInvalidate();
        m30165();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m30305(CharSequence charSequence, InterfaceC17066 interfaceC17066) {
        try {
            return m30199((AbstractC15440) null, interfaceC17066, charSequence);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30337(AbstractC15440 abstractC15440, CharSequence charSequence) {
        m30306(abstractC15440, new C9406(), charSequence);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m30306(AbstractC15440 abstractC15440, InterfaceC17066 interfaceC17066, CharSequence charSequence) {
        if (this.f37194 || interfaceC17066.mo1526()) {
            return charSequence;
        }
        if (!this.f37194 && abstractC15440 != null) {
            InterfaceC7785 interfaceC7785 = this.f37322;
            if ((interfaceC7785 instanceof C5753) && ((C5753) interfaceC7785).m16204(abstractC15440)) {
                m30447().m10930();
            }
        }
        return m30199(abstractC15440, interfaceC17066, charSequence);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private CharSequence m30199(AbstractC15440 abstractC15440, InterfaceC17066 interfaceC17066, CharSequence charSequence) {
        InterfaceC7785 interfaceC7785;
        if (this.f37194 || interfaceC17066.mo1526()) {
            return charSequence;
        }
        synchronized (this.f37260) {
            this.f37256 = false;
            m30282();
            this.f37277 = true;
            this.f37218++;
            this.f37187 = true;
        }
        postInvalidate();
        this.f37235.m18571();
        try {
            if (!this.f37258.mo8160()) {
                while (getWidth() <= 0) {
                    if (this.f37256 || this.f37194 || interfaceC17066.mo1526()) {
                        break;
                    }
                    SystemClock.sleep(10L);
                }
            }
            if (!this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                if (charSequence == null) {
                    charSequence = "";
                }
                C15213 c15213 = this.f37177;
                if (c15213 != null && (charSequence != c15213.f46688 || this.f37258 != c15213.f46682)) {
                    throw new IllegalStateException("Session layout preparation was superseded");
                }
                if (charSequence instanceof C4342) {
                    C4342 c4342 = (C4342) charSequence;
                    if (c15213 == null || c15213.f46687.f9323 == null) {
                        this.f37245.f73293 = c4342.mo1601().m52350().m14686();
                    }
                } else {
                    this.f37245.f73293 = C22686.m50682(charSequence);
                    charSequence = C22686.m50681(charSequence);
                }
                int mo1591 = this.f37322.mo1591();
                if (abstractC15440 != null) {
                    C5753 m16202 = C5753.m16202(abstractC15440);
                    try {
                        m16202.replace(0, m16202.length(), charSequence);
                        m16202.mo1601().m52349();
                        m16202.mo1600(false);
                        m16202.m16203();
                        interfaceC7785 = m16202;
                    } catch (Error | RuntimeException e) {
                        m16202.close();
                        throw e;
                    }
                } else {
                    interfaceC7785 = m30245(charSequence);
                }
                if (abstractC15440 != null && (this.f37256 || this.f37194 || interfaceC17066.mo1526())) {
                    ((C5753) interfaceC7785).close();
                } else {
                    InterfaceC7785 interfaceC77852 = this.f37322;
                    m30253(interfaceC7785);
                    if (interfaceC77852 != interfaceC7785) {
                        m30260(interfaceC77852);
                    }
                    this.f37173.m17860(this.f37322);
                    this.f37235.m18572();
                    this.f37315.m52265();
                    this.f37322.mo1593(this.f37232);
                    this.f37322.mo1592(mo1591);
                    InterfaceC7785 interfaceC77853 = this.f37322;
                    interfaceC77853.setSpan(this.f37248, 0, interfaceC77853.length(), 8388626);
                    InterfaceC7785 interfaceC77854 = this.f37322;
                    if (!(interfaceC77854 instanceof C4342)) {
                        interfaceC77854.setSelection(0);
                    }
                    this.f37221 = -1.0f;
                    m30227();
                    if (!this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                        if (this.f37235.m18574()) {
                            this.f37235.m18578((CharSequence) this.f37322);
                            this.f37235.m18602(this.f37322);
                        }
                        if (this.f37245.f73267 && this.f37235.m18575()) {
                            this.f37315.m52257(this.f37235.m18587());
                        } else {
                            this.f37315.m52257(C23701.f76752);
                        }
                        if (!this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                            if (c15213 != null) {
                                c15213.f46690 = this.f37322.mo26548();
                            }
                            this.f37258.mo8166(this.f37322);
                            m30510();
                            InterfaceC7785 interfaceC77855 = this.f37322;
                            if (!(interfaceC77855 instanceof C4342)) {
                                interfaceC77855.mo1600(true);
                            }
                            this.f37226 = -1;
                            if (c15213 == null || !c15213.f46687.m8950()) {
                                int length = this.f37322.length();
                                int i = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
                                if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                                    this.f37300 = true;
                                }
                            }
                            if (c15213 == null) {
                                m30231(Math.max(0, 0), true);
                            }
                            if (c15213 != null && !this.f37256 && !this.f37194 && !interfaceC17066.mo1526()) {
                                c15213.f46686 = true;
                            }
                            this.f37277 = false;
                            m30171();
                            m30165();
                            if (!this.f37256) {
                                postInvalidate();
                            }
                            return charSequence;
                        }
                    }
                }
            }
            return charSequence;
        } finally {
            this.f37250 = null;
            this.f37187 = false;
            this.f37235.m18559();
            this.f37277 = false;
            m30171();
            m30165();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m30231(int i, boolean z) {
        if (Looper.myLooper() != Looper.getMainLooper() && this.f37245.f73267 && this.f37235.m18575()) {
            if (z || !(this.f37277 || this.f37287 || this.f37304)) {
                InterfaceC7785 interfaceC7785 = this.f37322;
                AbstractC3179 abstractC3179 = this.f37258;
                long j = this.f37218;
                while (abstractC3179.mo9770()) {
                    try {
                        if (interfaceC7785 != this.f37322 || j != this.f37218) {
                            return;
                        }
                        if (z && this.f37256) {
                            return;
                        } else {
                            Thread.sleep(10L);
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
                synchronized (this.f37260) {
                    if (interfaceC7785 == this.f37322 && abstractC3179 == this.f37258 && abstractC3179.f10015 == interfaceC7785 && j == this.f37218 && !abstractC3179.mo9770() && ((!z || !this.f37256) && (z || (!this.f37277 && !this.f37287 && !this.f37304)))) {
                        int m30542 = m30542();
                        long mo9778 = (!z || interfaceC7785.length() <= 1000000 || m30542 <= 0) ? 0L : abstractC3179.mo9778(i, m30542);
                        this.f37235.m18566(interfaceC7785, (int) (mo9778 >>> 32), (int) mo9778);
                    }
                }
            }
        }
    }

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final String m30531() {
        return this.f37245.f73293;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30499(String str) {
        this.f37245.f73293 = str;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m30462() {
        m30252("Session text preparation was canceled");
        this.f37250 = null;
        this.f37256 = true;
        this.f37187 = false;
        this.f37235.m18559();
        this.f37258.f10026 = true;
        this.f37258.f10019 = true;
        C3926 c3926 = this.f37302;
        if (c3926 != null) {
            c3926.f12528 = true;
            RunnableC9631 runnableC9631 = new RunnableC9631(1, c3926);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC9631.run();
            } else {
                C4925.m14315(runnableC9631);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30474(InterfaceC7785 interfaceC7785) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Initial highlight readiness requires the foreground thread");
        }
        AbstractC3179 abstractC3179 = this.f37258;
        int mo26548 = interfaceC7785.mo26548();
        long uptimeMillis = SystemClock.uptimeMillis() + 500;
        FutureC3575 futureC3575 = new FutureC3575();
        new RunnableC12227(this, futureC3575, interfaceC7785, abstractC3179, mo26548, uptimeMillis).run();
        return futureC3575;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30421(C4342 c4342, C21565 c21565) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session readiness requires the foreground thread");
        }
        FutureC3575 futureC3575 = new FutureC3575();
        C4925.m14315(new RunnableC10111(this, futureC3575, c21565, c4342));
        return futureC3575;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C21565 m30117(boolean z) {
        C21565 c21565;
        synchronized (this.f37182) {
            if (this.f37222 != null) {
                throw new IllegalStateException("Session task is already active");
            }
            c21565 = new C21565(z);
            this.f37222 = c21565;
        }
        return c21565;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21565 m30539() {
        C21565 m30117;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f37182) {
            if (this.f37222 != null || this.f37305 != null || !this.f37182.isEmpty() || !m30505() || m30370() || this.f37244 != null || this.f37322.mo1605()) {
                throw new IllegalStateException("View is busy before session preparation");
            }
            m30117 = m30117(true);
            m30412(true);
        }
        return m30117;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21565 m30307(C4342 c4342) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37322 != c4342) {
            throw new IllegalStateException("Session close requires its foreground owner");
        }
        return m30117(false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30356(C4342 c4342, C21565 c21565) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37322 != c4342 || c21565 == null || c21565 != this.f37222) {
            throw new IllegalStateException("Session close requires its foreground task");
        }
        if (!c4342.m13047()) {
            return false;
        }
        synchronized (this.f37182) {
            if (this.f37305 == null && this.f37182.isEmpty() && !this.f37277 && !this.f37187 && !this.f37304 && this.f37244 == null && !m30370() && !this.f37322.mo1605()) {
                c21565.f69292 = true;
                return true;
            }
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30342(C21565 c21565) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session preparation requires the main thread");
        }
        synchronized (this.f37182) {
            if (c21565 != null) {
                if (c21565 == this.f37222) {
                    m30213(c21565);
                    this.f37222 = null;
                    m30224();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30329(InterfaceC7785 interfaceC7785) {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37277 || m30370()) {
            throw new IllegalStateException("Session preparation is still reading the view");
        }
        if (this.f37322 != interfaceC7785) {
            return;
        }
        InterfaceC19449 interfaceC19449 = this.f37301;
        this.f37301 = null;
        try {
            mo25910("");
        } finally {
            this.f37301 = interfaceC19449;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x02b8, code lost:
    
        if (r4 != null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02fb, code lost:
    
        if (r22.f37245.f73284 == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fd, code lost:
    
        r0 = getWidth();
        r1 = getHeight();
        r2 = r22.f37245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0309, code lost:
    
        if (r2.f73263 == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030d, code lost:
    
        if (r2.f73264 == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030f, code lost:
    
        r0 = r0 - r22.f37258.f10000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0314, code lost:
    
        r2 = r22.f37216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0317, code lost:
    
        if (r2 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x031d, code lost:
    
        if (r2.isFinished() != false) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x031f, code lost:
    
        r2 = r23.save();
        r6.translate(getScrollX(), getHeight() + getScrollY());
        r4 = r22.f37245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0339, code lost:
    
        if (r4.f73263 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033d, code lost:
    
        if (r4.f73264 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0341, code lost:
    
        if (r4.f73291 == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0343, code lost:
    
        r6.translate(r22.f37258.f10000, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x034b, code lost:
    
        r6.rotate(270.0f);
        r22.f37216.setSize(r1, r0);
        r4 = r22.f37216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0357, code lost:
    
        if (r4 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x035d, code lost:
    
        if (r4.draw(r6) == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x035f, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0362, code lost:
    
        r6.restoreToCount(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0367, code lost:
    
        r2 = r22.f37303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0369, code lost:
    
        if (r2 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x036f, code lost:
    
        if (r2.isFinished() != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0371, code lost:
    
        r2 = r23.save();
        r6.translate(getScrollX(), getScrollY());
        r5 = r22.f37245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0386, code lost:
    
        if (r5.f73263 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x038a, code lost:
    
        if (r5.f73264 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x038e, code lost:
    
        if (r5.f73291 == false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0390, code lost:
    
        r6.translate(r22.f37258.f10000, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0398, code lost:
    
        r22.f37303.setSize(r0, r1);
        r5 = r22.f37303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x039f, code lost:
    
        if (r5 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a5, code lost:
    
        if (r5.draw(r6) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a7, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03aa, code lost:
    
        r4 = r4 | r5;
        r6.restoreToCount(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a9, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ae, code lost:
    
        r2 = r22.f37275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b0, code lost:
    
        if (r2 == null) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03b6, code lost:
    
        if (r2.isFinished() != false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03b8, code lost:
    
        r2 = r23.save();
        r6.translate(getWidth() + getScrollX(), getScrollY());
        r5 = r22.f37245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03d2, code lost:
    
        if (r5.f73263 == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03d6, code lost:
    
        if (r5.f73264 == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03da, code lost:
    
        if (r5.f73291 != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03dc, code lost:
    
        r6.translate(-r22.f37258.f10000, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03e5, code lost:
    
        r6.rotate(90.0f);
        r22.f37275.setSize(r1, r0);
        r5 = r22.f37275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03f1, code lost:
    
        if (r5 == null) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03f7, code lost:
    
        if (r5.draw(r6) == false) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03f9, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03fc, code lost:
    
        r4 = r4 | r5;
        r6.restoreToCount(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03fb, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0400, code lost:
    
        r2 = r22.f37189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0402, code lost:
    
        if (r2 == null) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0408, code lost:
    
        if (r2.isFinished() != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x040a, code lost:
    
        r2 = r23.save();
        r6.translate(getWidth() + getScrollX(), getHeight() + getScrollY());
        r5 = r22.f37245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0429, code lost:
    
        if (r5.f73263 == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x042d, code lost:
    
        if (r5.f73264 == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0431, code lost:
    
        if (r5.f73291 != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0433, code lost:
    
        r6.translate(-r22.f37258.f10000, 0.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x043c, code lost:
    
        r6.rotate(180.0f);
        r22.f37189.setSize(r0, r1);
        r0 = r22.f37189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0448, code lost:
    
        if (r0 == null) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x044e, code lost:
    
        if (r0.draw(r6) == false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0453, code lost:
    
        r4 = r4 | r20;
        r6.restoreToCount(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0451, code lost:
    
        r20 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0458, code lost:
    
        if (r4 == false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x045a, code lost:
    
        r0 = l.C17648.f53953;
        postInvalidateOnAnimation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0361, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0366, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0461, code lost:
    
        if (r22.f37269 == 0) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0469, code lost:
    
        if (r22.f37239.m22791() == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x046b, code lost:
    
        m30506();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x02f4, code lost:
    
        r4.mo21670(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02f2, code lost:
    
        if (r4 == null) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0187, code lost:
    
        if ((android.os.SystemClock.uptimeMillis() - r22.f37263) < 4500) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x020c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x04f6  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m30124(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30124(android.graphics.Canvas):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30308() {
        this.f37250 = null;
        if (this.f37187) {
            this.f37187 = false;
            RunnableC6583 runnableC6583 = new RunnableC6583(0, this, this.f37322);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC6583.run();
            } else {
                post(runnableC6583);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30140(C12392 c12392, InterfaceC7785 interfaceC7785) {
        if (c12392.f37322 == interfaceC7785 && c12392.m30483()) {
            c12392.requestLayout();
            c12392.invalidate();
            c12392.f37173.m17859(interfaceC7785);
            c12392.f37235.m18597(interfaceC7785);
            c12392.m30165();
        }
    }

    /* renamed from: ۧ */
    public void mo25910(CharSequence charSequence) {
        m30259(charSequence);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m30259(CharSequence charSequence) {
        this.f37250 = null;
        this.f37187 = false;
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence instanceof C4342) {
            this.f37245.f73293 = ((C4342) charSequence).mo1601().m52350().m14686();
        } else {
            this.f37245.f73293 = C22686.m50682(charSequence);
            charSequence = C22686.m50681(charSequence);
        }
        int mo1591 = this.f37322.mo1591();
        InterfaceC7785 m30245 = m30245(charSequence);
        InterfaceC7785 interfaceC7785 = this.f37322;
        m30253(m30245);
        this.f37173.m17860(this.f37322);
        this.f37235.m18572();
        this.f37315.m52265();
        if (interfaceC7785 != m30245) {
            interfaceC7785.mo13046(false);
        }
        this.f37322.mo1593(this.f37232);
        this.f37322.mo1592(mo1591);
        InterfaceC7785 interfaceC77852 = this.f37322;
        interfaceC77852.setSpan(this.f37248, 0, interfaceC77852.length(), 8388626);
        InterfaceC7785 interfaceC77853 = this.f37322;
        if (!(interfaceC77853 instanceof C4342)) {
            interfaceC77853.mo1601().m52349();
        }
        if (this.f37235.m18574()) {
            this.f37235.m18578((CharSequence) this.f37322);
        }
        if (this.f37245.f73267 && this.f37235.m18575()) {
            this.f37315.m52257(this.f37235.m18587());
        } else {
            this.f37315.m52257(C23701.f76752);
        }
        this.f37258.mo8166(this.f37322);
        m30171();
        this.f37173.m17859(this.f37322);
        m30405();
        m30510();
        InterfaceC7785 interfaceC77854 = this.f37322;
        if (!(interfaceC77854 instanceof C4342)) {
            m30456(false);
            this.f37322.setSelection(0);
        } else {
            InterfaceC19449 interfaceC19449 = this.f37301;
            if (interfaceC19449 != null) {
                interfaceC19449.mo2703(((C4342) interfaceC77854).isChanged());
            }
        }
        this.f37221 = -1.0f;
        m30227();
        if (!isInEditMode()) {
            int length = this.f37322.length();
            int i = SharedPreferencesOnSharedPreferenceChangeListenerC21897.f70101;
            if (length > C4925.f15523.getInt("smooth_mode_threshold", 200000)) {
                this.f37300 = true;
            }
        }
        requestLayout();
        invalidate();
    }

    /* renamed from: ۧᩳ, reason: not valid java name and contains not printable characters */
    public final void m30438() {
        this.f37279 = true;
        this.f37284.incrementAndGet();
        C14508 c14508 = this.f37317;
        if (c14508 != null) {
            c14508.f44488 = 0;
            c14508.f44492 = false;
            c14508.f44491 = false;
            c14508.f44490 = -1;
            c14508.f44489 = -1;
        }
        this.f37269 = 0;
        this.f37223 = 0;
    }

    /* renamed from: ۗܽ, reason: not valid java name and contains not printable characters */
    public final void m30371() {
        this.f37279 = false;
        if (!isFocused() || m30441()) {
            return;
        }
        if (C10975.m27285()) {
            m30380();
        } else {
            C4925.m14315(new RunnableC23516(0, this));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m30502(int i) {
        return i == this.f37284.get() && !this.f37279;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m30488(int i) {
        return m30502(i) && !m30441() && m30174();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30363() {
        this.f37258.mo8166(this.f37322);
        m30171();
        this.f37221 = -1.0f;
        m30227();
        requestLayout();
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (this.f37245.f73272 || this.f37279) {
            return null;
        }
        if (this.f37317 == null) {
            C14508 c14508 = new C14508();
            new ExtractedText();
            this.f37317 = c14508;
        }
        editorInfo.imeOptions = mo25920();
        editorInfo.inputType = mo25893();
        C22330 c22330 = new C22330(this, this.f37284.get());
        this.f37283.add(c22330);
        return new InputConnectionC20214(c22330);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30407(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.f73272 != z) {
            c22686.f73272 = z;
            if (z) {
                m30376();
            } else {
                m30380();
            }
            InterfaceC19449 interfaceC19449 = this.f37301;
            if (interfaceC19449 != null) {
                interfaceC19449.mo2704(m30383(), m30296());
            }
        }
    }

    /* renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30441() {
        return this.f37245.f73272 || this.f37247 == this.f37322;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30327(C6270 c6270) {
        this.f37209 = c6270;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30357(final InterfaceC7785 interfaceC7785, final RuntimeException runtimeException) {
        if (!(interfaceC7785 instanceof C4342)) {
            return false;
        }
        C4342 c4342 = (C4342) interfaceC7785;
        if (!(runtimeException instanceof UncheckedIOException) && !(runtimeException instanceof C3966)) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C4925.m14315(new Runnable() { // from class: l.ۙۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    C12392.this.m30357(interfaceC7785, runtimeException);
                }
            });
            return true;
        }
        if (this.f37322 == interfaceC7785 && this.f37247 != interfaceC7785) {
            this.f37247 = c4342;
            this.f37252 = runtimeException;
            m30438();
            this.f37173.m17851();
            this.f37235.m18571();
            invalidate();
            C4925.m14315(new RunnableC8889(this, interfaceC7785, c4342, runtimeException, 1));
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30141(C12392 c12392, InterfaceC7785 interfaceC7785, C4342 c4342, RuntimeException runtimeException) {
        InterfaceC5337 interfaceC5337;
        if (c12392.f37322 == interfaceC7785 && c12392.f37247 == interfaceC7785 && (interfaceC5337 = c12392.f37209) != null) {
            C22372.m50157((C22372) ((C6270) interfaceC5337).f19413, c4342, runtimeException);
        }
    }

    /* renamed from: ۬ܽ, reason: not valid java name and contains not printable characters */
    public final void m30449() {
        C22686 c22686 = this.f37245;
        if (!c22686.f73296) {
            c22686.f73296 = true;
            if (m30441()) {
                invalidate();
            }
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m30294(int i) {
        this.f37245.m24478(i);
        this.f37221 = -1.0f;
    }

    /* renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public final int m30361() {
        return this.f37245.m24485();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30373(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.m24482() != z) {
            c22686.m24479(z);
            postInvalidate();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m30393(boolean z) {
        C22686 c22686 = this.f37245;
        if (c22686.m24498() != z) {
            c22686.m24490(z);
            postInvalidate();
        }
    }

    /* renamed from: ۬ۧ */
    public boolean mo25914() {
        return this.f37245.f73228;
    }

    /* renamed from: ᩶ܽ, reason: not valid java name and contains not printable characters */
    public final void m30520() {
        this.f37221 = -1.0f;
    }

    /* renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static void m30251(C12392 c12392) {
        c12392.f37203 = true;
        c12392.f37176 = false;
        if (!c12392.isFocused()) {
            c12392.requestFocus();
            c12392.invalidate();
        }
        c12392.m30443();
    }

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static void m30285(C12392 c12392) {
        c12392.f37203 = false;
        c12392.f37176 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean m30257(float f, float f2) {
        return f >= ((float) getPaddingLeft()) && f <= ((float) (getWidth() - getPaddingRight())) && f2 >= ((float) getPaddingTop()) && f2 <= ((float) (getHeight() - getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m30246(MotionEvent motionEvent) {
        if (m30370()) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (m30257(x, y)) {
            int m9760 = this.f37258.m9760((getScrollX() + x) - getPaddingLeft(), (this.f37170 + y) - getPaddingTop());
            int m30444 = m30444();
            int m30448 = m30448();
            int min = Math.min(m30444, m30448);
            int max = Math.max(m30444, m30448);
            if (min == max || min > m9760 || m9760 > max) {
                mo25919(m9760);
            }
            this.f37263 = SystemClock.uptimeMillis();
            m30400();
            if (m30215((int[]) null)) {
                this.f37311.m20611((int) x, (int) y);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0107  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r0 <= r7) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r0 <= (r7 + r4)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
    
        if (r6 <= r7) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent r6, int r7) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.onResolvePointerIcon(android.view.MotionEvent, int):android.view.PointerIcon");
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (m30214(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 10) {
                m30278();
            } else if (actionMasked == 9 || actionMasked == 7) {
                this.f37270 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f37184 = y;
                int m30230 = m30230(this.f37270, y);
                int i = m30230 & 1;
                boolean z = i != 0 && m30115() > 0.0f;
                int i2 = m30230 & 2;
                boolean z2 = i2 != 0 && m30272() > 0.0f;
                if (z && z2) {
                    if (this.f37309 >= this.f37314) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                this.f37172 = z;
                this.f37294 = z2;
                if (z) {
                    m30240();
                }
                if (this.f37294) {
                    m30187();
                }
                if (m30230 == 0) {
                    m30194();
                }
                int i3 = i2 != 0 ? 2 : i != 0 ? 1 : 0;
                if (i3 == 0 || (i3 != 1 ? !(i3 != 2 || m30272() <= 0.0f) : m30115() > 0.0f)) {
                    m30194();
                } else if (this.f37208 != i3) {
                    this.f37208 = i3;
                    HandlerC13637 handlerC13637 = this.f37207;
                    handlerC13637.removeMessages(8);
                    handlerC13637.sendEmptyMessageDelayed(8, 300L);
                }
            }
        }
        return m30214(motionEvent) || super.onHoverEvent(motionEvent);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m30230(float f, float f2) {
        int i = 0;
        if (!m30519() && !this.f37287 && !this.f37277 && !this.f37258.f9998.isEmpty()) {
            int m30394 = m30394();
            int m30542 = m30542();
            int scrollX = getScrollX();
            int i2 = this.f37170;
            if (m30150(this.f37306, scrollX, i2, m30394, m30542)) {
                float paddingLeft = (f + scrollX) - getPaddingLeft();
                float paddingTop = f2 - getPaddingTop();
                AbstractC3179 abstractC3179 = this.f37258;
                Rect rect = this.f37306;
                int i3 = rect.left;
                int i4 = rect.top - i2;
                int width = rect.width();
                int height = this.f37306.height();
                C22686 c22686 = abstractC3179.f10037;
                int mo25899 = abstractC3179.f10021.mo25899();
                int i5 = m30542 + mo25899;
                if (m30394 > 0 && m30542 > 0 && i5 > 0 && width > 0 && height > 0) {
                    int i6 = width + i3;
                    int i7 = height + i4 + mo25899;
                    double m9789 = abstractC3179.m9789();
                    if (m9789 > 0.0d) {
                        double d = i5;
                        if (m9789 - d > 0.0d && c22686.f73249 && m9789 / d > 3.0d && (!c22686.f73291 ? !(paddingLeft < i3 || paddingLeft > c22686.f73238 + i3 || paddingTop < i4 || paddingTop > i7) : !(paddingLeft < i6 - c22686.f73238 || paddingLeft > i6 || paddingTop < i4 || paddingTop > i7))) {
                            i = 1;
                        }
                    }
                    float mo8163 = abstractC3179.mo8163();
                    if (abstractC3179.mo8160() && mo8163 > 0.0f) {
                        float f3 = m30394;
                        if (mo8163 - f3 > 0.0f && c22686.f73226 && mo8163 / f3 > 3.0f) {
                            if (c22686.f73263 && c22686.f73264) {
                                if (c22686.f73291) {
                                    i3 += abstractC3179.f10000;
                                } else {
                                    i6 -= abstractC3179.f10000;
                                }
                            }
                            if (i6 >= i3 && paddingLeft >= i3 && paddingLeft <= i6 && paddingTop >= i7 - c22686.f73238 && paddingTop <= i7) {
                                return i | 2;
                            }
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static void m30218(C12392 c12392) {
        int i = c12392.f37208;
        c12392.f37208 = 0;
        if (i == 0) {
            return;
        }
        int m30230 = c12392.m30230(c12392.f37270, c12392.f37184);
        if (((m30230 & 2) != 0 ? 2 : (m30230 & 1) != 0 ? 1 : 0) != i) {
            c12392.f37172 = false;
            c12392.f37294 = false;
        } else if (i == 1) {
            c12392.m30453();
            c12392.f37172 = true;
            c12392.f37294 = false;
        } else if (i == 2) {
            c12392.m30442();
            c12392.f37172 = false;
            c12392.f37294 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30132(C12392 c12392, int i, MotionEvent motionEvent) {
        c12392.f37270 = motionEvent.getX();
        float y = motionEvent.getY();
        c12392.f37184 = y;
        if ((c12392.m30230(c12392.f37270, y) & i) != 0) {
            c12392.f37172 = i == 1;
            c12392.f37294 = i == 2;
        } else {
            c12392.f37172 = false;
            c12392.f37294 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۢᩳ, reason: not valid java name and contains not printable characters */
    public void m30194() {
        this.f37208 = 0;
        this.f37207.removeMessages(8);
    }

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static void m30239(C12392 c12392) {
        c12392.f37172 = false;
        c12392.f37294 = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩷ᩳ, reason: not valid java name and contains not printable characters */
    public void m30278() {
        m30194();
        this.f37172 = false;
        this.f37294 = false;
    }

    /* renamed from: ֡ᩳ, reason: not valid java name and contains not printable characters */
    private float m30115() {
        if (this.f37295) {
            return 1.0f;
        }
        return m30120(this.f37314);
    }

    /* renamed from: ᩵ᩳ, reason: not valid java name and contains not printable characters */
    private float m30272() {
        if (this.f37291) {
            return 1.0f;
        }
        return m30120(this.f37309);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m30120(long j) {
        int uptimeMillis = (int) (SystemClock.uptimeMillis() - j);
        if (uptimeMillis < 0) {
            return 0.0f;
        }
        if (uptimeMillis <= 1500) {
            return 1.0f;
        }
        int i = uptimeMillis - 1500;
        if (i < 300) {
            return 1.0f - (i / 300.0f);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m30264(float f) {
        C22686 c22686 = this.f37245;
        if (c22686.f73263) {
            return c22686.f73264 ? c22686.f73291 ? f - ((float) getScrollX()) <= ((float) this.f37258.f10000) : f - ((float) getScrollX()) >= ((float) (m30394() - this.f37258.f10000)) : c22686.f73291 ? f <= ((float) this.f37258.f10000) : f >= this.f37258.mo8163() - ((float) this.f37258.f10000);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!m30174()) {
            return false;
        }
        C4342 c4342 = this.f37247;
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (c4342 == interfaceC7785) {
            return false;
        }
        try {
            return m30149(i, keyEvent);
        } catch (UncheckedIOException | C3966 e) {
            if (m30357(interfaceC7785, e)) {
                return false;
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0181  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m30149(int r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30149(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 63) {
            if (i == 66) {
                if (mo25898()) {
                    View focusSearch = focusSearch(130);
                    if (focusSearch != null) {
                        focusSearch.requestFocus();
                        return true;
                    }
                    m30376();
                }
                return true;
            }
            switch (i) {
                case 57:
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                case 60:
                    break;
                default:
                    return super.onKeyUp(i, keyEvent);
            }
        }
        f37169.onKeyUp(this, this.f37322, i, keyEvent);
        return true;
    }

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public final int m30444() {
        int selectionStart = Selection.getSelectionStart(this.f37322);
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart > this.f37322.length() ? this.f37322.length() : selectionStart;
    }

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int m30448() {
        int selectionEnd = Selection.getSelectionEnd(this.f37322);
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd > this.f37322.length() ? this.f37322.length() : selectionEnd;
    }

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public final int[] m30369() {
        int m30444 = m30444();
        int m30448 = m30448();
        if (m30444 > m30448) {
            m30448 = m30444;
            m30444 = m30448;
        }
        return new int[]{m30444, m30448};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30314(View view, boolean z, boolean z2) {
        view.setVisibility(z ? 0 : 8);
        m30346(z, z2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30346(boolean z, boolean z2) {
        if (z) {
            this.f37261 = true;
            this.f37320 = false;
            this.f37210 = -1L;
        } else if (this.f37261) {
            this.f37261 = false;
            this.f37320 = z2;
            this.f37210 = -1L;
        } else if (!z2) {
            this.f37320 = false;
            this.f37210 = -1L;
        }
        invalidate();
    }

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final int m30458() {
        return this.f37278;
    }

    /* renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30385() {
        return this.f37261;
    }

    /* renamed from: ۛᩳ, reason: not valid java name and contains not printable characters */
    private int m30177() {
        if (!this.f37320) {
            return 255;
        }
        if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
            this.f37320 = false;
            return 255;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f37210 < 0) {
            this.f37210 = uptimeMillis;
        }
        float min = Math.min(1.0f, (uptimeMillis - this.f37210) / 100.0f);
        if (min >= 1.0f) {
            this.f37320 = false;
        } else {
            postInvalidateOnAnimation();
        }
        return Math.round(((min * 0.5f) + 0.5f) * 255.0f);
    }

    /* renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public final void m30415() {
        this.f37250 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d9, code lost:
    
        r0.f10145 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00db, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m30325(l.AbstractC3179 r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30325(l.ۗۤᩳ, int, int):void");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        InterfaceC7785 interfaceC7785 = this.f37322;
        int saveCount = canvas.getSaveCount();
        try {
            try {
                m30124(canvas);
            } finally {
                canvas.restoreToCount(saveCount);
            }
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC7785, e)) {
                throw e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: ۤᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m30197() {
        /*
            r8 = this;
            int r0 = r8.getScrollX()
            int r1 = r8.f37170
            l.ܿۨᩳ r2 = r8.f37215
            r3 = 1
            if (r2 == 0) goto L11
            boolean r2 = r2.f53091
            if (r2 == 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            boolean r4 = r8.f37204
            if (r4 != 0) goto L20
            boolean r4 = r8.f37267
            if (r4 != 0) goto L20
            boolean r4 = r8.f37307
            if (r4 != 0) goto L20
            if (r2 == 0) goto L84
        L20:
            int r4 = r8.f37174
            if (r4 == 0) goto L84
            long r4 = android.os.SystemClock.uptimeMillis()
            long r6 = r8.f37224
            long r4 = r4 - r6
            int r5 = (int) r4
            float r4 = (float) r5
            r5 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 / r5
            int r5 = r8.f37174
            float r5 = (float) r5
            float r4 = r4 * r5
            int r4 = (int) r4
            int r4 = r4 + r1
            int r5 = r8.m30521(r4)
            if (r5 == r1) goto L7f
            android.widget.OverScroller r1 = r8.f37285
            r1.forceFinished(r3)
            l.ܰۛᩳ r1 = r8.f37207
            r1.removeMessages(r3)
            r8.m30123(r0, r5, r3)
            long r0 = android.os.SystemClock.uptimeMillis()
            r8.f37224 = r0
            r8.postInvalidateOnAnimation()
            boolean r0 = r8.f37307
            if (r0 == 0) goto L5f
            float r0 = r8.f37289
            float r1 = r8.f37293
            r8.m30425(r0, r1)
            goto L85
        L5f:
            if (r2 == 0) goto L6b
            l.ܿۨᩳ r0 = r8.f37215
            float r1 = r8.f37289
            float r2 = r8.f37293
            l.ViewOnTouchListenerC17331.m40658(r0, r1, r2)
            goto L85
        L6b:
            boolean r0 = r8.f37204
            if (r0 == 0) goto L77
            float r0 = r8.f37289
            float r1 = r8.f37293
            r8.m30496(r0, r1)
            goto L85
        L77:
            float r0 = r8.f37289
            float r1 = r8.f37293
            r8.m30476(r0, r1)
            goto L85
        L7f:
            if (r4 != r5) goto L84
            r8.postInvalidateOnAnimation()
        L84:
            r3 = 0
        L85:
            boolean r0 = r8.f37262
            if (r0 == r3) goto L8b
            r8.f37262 = r3
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30197():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m30150(Rect rect, int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            if (!mo25904()) {
                rect.set(i, i2, i3 + i, i4 + i2);
                return true;
            }
            Rect rect2 = this.f37265;
            if (!getLocalVisibleRect(rect2)) {
                return false;
            }
            rect2.offset(0, i2 - getScrollY());
            int max = Math.max(0, i);
            int max2 = Math.max(0, i2);
            int max3 = Math.max(max, i + i3);
            int max4 = Math.max(max2, i2 + i4);
            int m30121 = m30121(rect2.left - getPaddingLeft(), max, max3);
            int m301212 = m30121(rect2.top - getPaddingTop(), max2, max4);
            int m301213 = m30121(rect2.right - getPaddingLeft(), max, max3);
            int m301214 = m30121(rect2.bottom - getPaddingTop(), max2, max4);
            int max5 = Math.max(m301213 - m30121, 0);
            int max6 = Math.max(m301214 - m301212, 0);
            if (max5 != 0 && max6 != 0) {
                rect.set(m30121, m301212, max5 + m30121, max6 + m301212);
                return true;
            }
        }
        return false;
    }

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final int m30463() {
        int m30394 = m30394();
        if (m30394 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f37258.mo8163() - m30394), 0);
    }

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final int m30528() {
        int m30542 = m30542();
        if (m30542 <= 0) {
            return 0;
        }
        return Math.max((int) (this.f37258.m9789() - m30542), 0);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m30390(int i) {
        if (i < 0) {
            return 0;
        }
        int m30463 = m30463();
        return i > m30463 ? m30463 : i;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m30521(int i) {
        if (i < 0) {
            return 0;
        }
        int m30528 = m30528();
        return i > m30528 ? m30528 : i;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m30300() {
        OverScroller overScroller = this.f37285;
        if (!overScroller.isFinished()) {
            float currVelocity = overScroller.getCurrVelocity();
            if (currVelocity == 0.0f || currVelocity >= 5000.0f) {
                return false;
            }
        }
        InterfaceC18702 interfaceC18702 = this.f37245.f73253;
        if (m30401()) {
            return interfaceC18702 == null || interfaceC18702.mo21671();
        }
        return false;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean m30401() {
        return !this.f37295 || SystemClock.uptimeMillis() - this.f37193 >= 100;
    }

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static void m30226(C12392 c12392) {
        if (c12392.f37295) {
            c12392.f37295 = false;
            c12392.f37207.removeMessages(6);
            c12392.invalidate();
            InterfaceC18702 interfaceC18702 = c12392.f37245.f73253;
            if (interfaceC18702 != null) {
                interfaceC18702.mo21666();
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f37192) {
            return;
        }
        InterfaceC7785 interfaceC7785 = this.f37322;
        try {
            m30242(getScrollX(), this.f37170);
            m30293();
            m30197();
            C13097 c13097 = this.f37296;
            if (c13097 != null && !c13097.m31756(this)) {
                m30191();
            }
            if (this.f37285.computeScrollOffset()) {
                int scrollX = getScrollX();
                int i = this.f37170;
                int currX = this.f37285.getCurrX();
                int currY = this.f37285.getCurrY();
                if (currY != i) {
                    m30453();
                    if (this.f37321 && this.f37245.f73284) {
                        if (i > 0 && currY <= 0) {
                            this.f37303.onAbsorb((int) this.f37285.getCurrVelocity());
                        } else {
                            int m30528 = m30528();
                            if (i < m30528 && currY >= m30528) {
                                this.f37189.onAbsorb((int) this.f37285.getCurrVelocity());
                            }
                        }
                    }
                }
                if (currX != scrollX) {
                    m30442();
                    if (this.f37321 && (edgeEffect = this.f37216) != null && this.f37275 != null && this.f37245.f73284) {
                        if (scrollX > 0 && currX <= 0) {
                            edgeEffect.onAbsorb((int) this.f37285.getCurrVelocity());
                        } else {
                            int m30463 = m30463();
                            if (scrollX < m30463 && currX >= m30463) {
                                this.f37275.onAbsorb((int) this.f37285.getCurrVelocity());
                            }
                        }
                    }
                }
                m30181();
                this.f37202.incrementAndGet();
                m30123(currX, currY, false);
                invalidate();
            }
            if (this.f37285.isFinished()) {
                this.f37296 = null;
            }
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC7785, e)) {
                throw e;
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m30443();
        this.f37215.f53090 = 0L;
        if (z || this.f37171) {
            m30168();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۘᩳ, reason: not valid java name and contains not printable characters */
    public void m30168() {
        m30244();
        if (m30519() || this.f37277 || this.f37258.f10015 != this.f37322) {
            this.f37171 = true;
            return;
        }
        if (this.f37304) {
            if (isAttachedToWindow()) {
                C4925.m14316(new Runnable() { // from class: l.ܿۛᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12392.this.m30168();
                    }
                }, 100L);
                return;
            }
            return;
        }
        this.f37171 = false;
        boolean m9795 = this.f37258.m9795();
        boolean m9772 = this.f37258.m9772();
        int scrollX = getScrollX();
        if (this.f37258.mo8160()) {
            scrollX = m30390(scrollX);
        } else {
            this.f37258.mo9783(m30394());
        }
        if (this.f37277) {
            return;
        }
        this.f37285.forceFinished(true);
        m30123(scrollX, m30521(this.f37170), false);
        if (!m30293() && this.f37318 == null && this.f37244 == null) {
            if (m9795 || m9772) {
                int m30444 = m30444();
                int m30448 = m30448();
                if (m30444 > m30448) {
                    m30448 = m30444;
                    m30444 = m30448;
                }
                if (!m9795) {
                    m30444 = m30448;
                }
                m30349(m30444, false);
                m30443();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30352(CharSequence charSequence) {
        try {
            this.f37178.setPrimaryClip(ClipData.newPlainText(null, charSequence));
            return true;
        } catch (Throwable unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1201ff);
            return false;
        }
    }

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30409() {
        try {
            return this.f37178.hasPrimaryClip();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m30466(int i) {
        C4342 c4342 = this.f37247;
        InterfaceC7785 interfaceC7785 = this.f37322;
        if (c4342 == interfaceC7785) {
            return;
        }
        try {
            m30284(i);
        } catch (UncheckedIOException | C3966 e) {
            if (!m30357(interfaceC7785, e)) {
                throw e;
            }
        }
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m30284(int i) {
        String th;
        int m30444 = m30444();
        int m30448 = m30448();
        if (m30444 > m30448) {
            m30448 = m30444;
            m30444 = m30448;
        }
        boolean z = this.f37245.f73272;
        if (z && i == 16908320) {
            i = android.R.id.copy;
        }
        HandlerC13637 handlerC13637 = this.f37207;
        if (i != 16908328) {
            switch (i) {
                case android.R.id.selectAll:
                    if (this.f37322.length() > 0) {
                        mo25922(0, this.f37322.length());
                        handlerC13637.sendEmptyMessageDelayed(2, m30349(this.f37322.length(), false) ? 250L : 50L);
                        break;
                    }
                    break;
                case android.R.id.cut:
                    if (m30444 != m30448 && m30352(this.f37322.subSequence(m30444, m30448))) {
                        this.f37322.delete(m30444, m30448);
                        invalidate();
                        m30416();
                        break;
                    }
                    break;
                case android.R.id.copy:
                    if (m30444 != m30448 && m30352(this.f37322.subSequence(m30444, m30448))) {
                        m30416();
                        break;
                    }
                    break;
                case android.R.id.paste:
                    if (!z && m30409()) {
                        try {
                            CharSequence text = this.f37178.getText();
                            th = text == null ? "" : text.toString();
                        } catch (Throwable th2) {
                            th = th2.toString();
                        }
                        String charSequence = C22686.m50681(th).toString();
                        this.f37322.replace(m30444, m30448, charSequence);
                        mo25919(charSequence.length() + m30444);
                        m30345(false);
                        m30416();
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case android.R.id.undo:
                            m30484();
                            break;
                        case android.R.id.redo:
                            m30298();
                            break;
                        default:
                            System.out.println("onTextContextMenuItem: " + i);
                            break;
                    }
            }
            return;
        }
        m30498(m30444(), true);
        handlerC13637.sendEmptyMessageDelayed(2, 100L);
    }

    /* renamed from: ۟ܽ, reason: not valid java name and contains not printable characters */
    public final void m30400() {
        this.f37280 = SystemClock.uptimeMillis();
        HandlerC13637 handlerC13637 = this.f37207;
        handlerC13637.removeMessages(4);
        handlerC13637.sendEmptyMessageAtTime(4, SystemClock.uptimeMillis() + 500);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        m30286();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m30275();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        AbstractC3179 abstractC3179;
        super.onWindowVisibilityChanged(i);
        if (i == 0 || (abstractC3179 = this.f37258) == null) {
            return;
        }
        abstractC3179.m9785();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        AbstractC3179 abstractC3179;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (abstractC3179 = this.f37258) == null) {
            return;
        }
        abstractC3179.m9785();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        HandlerC13637 handlerC13637 = this.f37207;
        if (z) {
            handlerC13637.m32776();
            m30400();
            return;
        }
        m30278();
        handlerC13637.m32775();
        this.f37280 = 0L;
        this.f37263 = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            m30278();
            m30387();
            m30443();
        } else {
            this.f37280 = SystemClock.uptimeMillis();
        }
        invalidate();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30431(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC7785 interfaceC7785;
        int i;
        int i2;
        if (extractedTextRequest == null || (interfaceC7785 = this.f37322) == null) {
            return false;
        }
        extractedText.startOffset = 0;
        int length = interfaceC7785.length();
        if (this.f37300) {
            int[] m30369 = m30369();
            i = m30369[0];
            int i3 = m30369[1];
            if (i3 - i > 10000) {
                length = i + 10000;
            } else {
                if (i >= 1000) {
                    C7744 mo26556 = interfaceC7785.mo26556();
                    try {
                        i = mo26556.m20768(mo26556.m20765(i - 999));
                        mo26556.close();
                    } catch (Throwable th) {
                        try {
                            mo26556.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    i = 0;
                }
                if (i3 - i <= 10000) {
                    i2 = i + 10000;
                } else {
                    int i4 = m30369[1];
                    int i5 = m30369[0];
                    int i6 = (10000 - (i4 - i5)) / 2;
                    int i7 = i4 + i6;
                    i = i5 - i6;
                    i2 = i7;
                }
                if (i < 0) {
                    i = 0;
                }
                if (i2 <= length) {
                    length = i2;
                }
            }
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            extractedText.startOffset = i;
        } else {
            extractedText.partialEndOffset = -1;
            extractedText.partialStartOffset = -1;
            i = 0;
        }
        extractedText.text = interfaceC7785.mo26557(i, length);
        extractedText.flags = 0;
        if (MetaKeyKeyListener.getMetaState(this.f37322, 2048) != 0) {
            extractedText.flags |= 2;
        }
        if (mo25898()) {
            extractedText.flags |= 1;
        }
        extractedText.selectionStart = m30444() - extractedText.startOffset;
        extractedText.selectionEnd = m30448() - extractedText.startOffset;
        if (Build.VERSION.SDK_INT >= 28) {
            extractedText.hint = this.f37258.f10006;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30351(ExtractedTextRequest extractedTextRequest, ExtractedText extractedText) {
        InterfaceC7785 interfaceC7785 = this.f37322;
        try {
            return m30431(extractedTextRequest, extractedText);
        } catch (UncheckedIOException | C3966 e) {
            if (m30357(interfaceC7785, e)) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30454() {
        C14508 c14508 = this.f37317;
        if (c14508 != null) {
            int i = c14508.f44488 + 1;
            c14508.f44488 = i;
            if (i == 1) {
                if (c14508.f44492) {
                    c14508.f44490 = 0;
                    c14508.f44489 = this.f37322.length();
                } else {
                    c14508.f44490 = -1;
                    c14508.f44489 = -1;
                }
            }
        }
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m30534() {
        int i;
        boolean z;
        C14508 c14508 = this.f37317;
        if (c14508 != null && (i = c14508.f44488) > 0) {
            int i2 = i - 1;
            c14508.f44488 = i2;
            if (i2 == 0 && (((z = c14508.f44492) || c14508.f44491) && c14508 != null && (z || c14508.f44491))) {
                c14508.f44492 = false;
                c14508.f44491 = false;
            }
        }
        invalidate();
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C2931 m30527() {
        if (Looper.myLooper() != Looper.getMainLooper() || this.f37322.length() != 0 || this.f37277 || this.f37187 || this.f37304 || this.f37244 != null || this.f37258.mo9770() || this.f37322.mo1605()) {
            throw new IllegalStateException("Initial session state requires an idle empty foreground view");
        }
        return C2931.m8935(0, 0, this.f37200, this.f37300, this.f37196, this.f37237, this.f37245, this.f37198, this.f37243);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30324(C2931 c2931, C20030 c20030, C4342 c4342, C21565 c21565) {
        boolean z;
        if (Looper.myLooper() == Looper.getMainLooper() && c21565 != null && c21565 == this.f37222) {
            z = c21565.f69292;
            if (z && !this.f37277 && !this.f37187 && !m30370() && this.f37177 == null) {
                if (c2931.f9326 > c4342.length() || c2931.f9317 > c4342.length()) {
                    throw new IllegalArgumentException("Session search range exceeds text length");
                }
                C2931 m8935 = C2931.m8935(getScrollX(), this.f37170, this.f37200, this.f37300, this.f37196, this.f37237, this.f37245, this.f37198, this.f37243);
                C15213 c15213 = new C15213(c21565, c2931, c20030, c4342, this.f37322, this.f37258, m8935);
                this.f37177 = c15213;
                try {
                    m30203(c2931, c20030);
                    AbstractC3179 m9745 = AbstractC3179.m9745(this, c15213.f46691, this.f37245, this.f37200);
                    c15213.f46682 = m9745;
                    m30126(m9745, true);
                    return;
                } catch (Error | RuntimeException e) {
                    m30203(m8935, (C20030) null);
                    if (this.f37258 == c15213.f46682) {
                        m30126(c15213.f46692, true);
                    }
                    this.f37177 = null;
                    c15213.f46691.close();
                    throw e;
                }
            }
        }
        throw new IllegalStateException("Session layout configuration requires its idle reserved view");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30353(C2931 c2931) {
        C15213 c15213 = this.f37177;
        if (c15213 == null) {
            return false;
        }
        if (c15213.f46687 == c2931) {
            C4342 c4342 = c15213.f46688;
            InterfaceC7785 interfaceC7785 = this.f37322;
            if (c4342 == interfaceC7785 && c15213.f46682 == this.f37258 && c15213.f46686 && c15213.f46690 == interfaceC7785.mo26548() && !c15213.f46694 && c15213.f46685 == this.f37222) {
                c15213.f46694 = true;
                m30125(c2931, c15213.f46693, c15213);
                return true;
            }
        }
        throw new IllegalStateException("Prepared session layout does not belong to this restoration");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30213(C21565 c21565) {
        AbstractC3179 abstractC3179;
        C15213 c15213 = this.f37177;
        if (c15213 != null) {
            C2931 c2931 = c15213.f46689;
            C0273 c0273 = c15213.f46691;
            if (c15213.f46685 != c21565) {
                return;
            }
            this.f37177 = null;
            try {
                if (this.f37322 == c15213.f46695 && (abstractC3179 = this.f37258) == c15213.f46682 && abstractC3179.f10015 == c0273) {
                    m30203(c2931, (C20030) null);
                    m30126(c15213.f46692, true);
                    m30123(c2931.f9319, c2931.f9318, true);
                }
            } finally {
                c0273.close();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4590 m30422(InterfaceC7785 interfaceC7785) {
        int i;
        C15213 c15213 = this.f37177;
        if (c15213 == null) {
            return null;
        }
        C2931 c2931 = c15213.f46687;
        if (c15213.f46688 != interfaceC7785) {
            return null;
        }
        int m30198 = m30198(c2931);
        if (c15213.f46693 == null && this.f37258.mo8160()) {
            i = c2931.m8950() ? c2931.f9319 : getScrollX();
        } else {
            i = 0;
        }
        return new C4590(Math.max(0, i), Math.max(0, m30198), m30394(), m30542());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30355(C4342 c4342, C3280 c3280) {
        C21565 c21565;
        boolean z;
        C15213 c15213 = this.f37177;
        if (Looper.myLooper() != Looper.getMainLooper() || c15213 == null || c15213.f46688 != c4342 || c4342 != this.f37322 || c15213.f46682 != this.f37258 || !c15213.f46686 || c15213.f46694 || this.f37277 || this.f37256 || c15213.f46690 != c4342.mo26548() || (c21565 = c15213.f46685) != this.f37222) {
            return false;
        }
        z = c21565.f69292;
        if (!z) {
            return false;
        }
        if ((c3280 != null && c3280.f10322) || c15213.f46687.f9326 >= 0 || !this.f37258.mo9770()) {
            return false;
        }
        C4590 m30422 = m30422((InterfaceC7785) c4342);
        if (m30422.m13500() <= 0 || m30422.m13499() <= 0 || !this.f37258.mo8167(m30422) || !this.f37258.mo9780(Math.max(m30444(), m30448()))) {
            return false;
        }
        AbstractC3179 abstractC3179 = this.f37258;
        c15213.f46683 = new C4631(abstractC3179, abstractC3179.mo8164(), m30422);
        c15213.f46684 = true;
        return true;
    }

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30450() {
        C15213 c15213 = this.f37177;
        if (c15213 != null) {
            c15213.f46684 = false;
        }
    }

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m30417() {
        return this.f37247 == this.f37322 ? this.f37252 : this.f37258.mo8171();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30479(AbstractC3179 abstractC3179) {
        C15213 c15213 = this.f37177;
        C4631 c4631 = c15213 == null ? null : c15213.f46683;
        if (c4631 == null) {
            return false;
        }
        C4342 c4342 = c15213.f46688;
        InterfaceC7785 interfaceC7785 = this.f37322;
        return c4342 == interfaceC7785 && c15213.f46690 == interfaceC7785.mo26548() && abstractC3179 == this.f37258 && c4631.f14706 == abstractC3179 && !this.f37256 && c4631.f14705 == c4631.f14706.mo8164() && c4631.f14708.m13500() == m30394() && c4631.f14708.m13499() == m30542() && c4631.f14706.mo8167(c4631.f14708);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30433(C4342 c4342) {
        C15213 c15213 = this.f37177;
        if (Looper.myLooper() != Looper.getMainLooper() || c15213 == null || c15213.f46688 != c4342 || !c15213.f46694 || !m30479(this.f37258) || getScrollX() != c15213.f46683.f14708.m13501() || this.f37170 != c15213.f46683.f14708.m13502()) {
            return false;
        }
        c15213.f46683.f14707 = true;
        postInvalidate();
        return true;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30377() {
        C15213 c15213 = this.f37177;
        if ((Looper.myLooper() != Looper.getMainLooper() || c15213 == null || !c15213.f46684 || !m30479(this.f37258) || this.f37277 || this.f37187 || this.f37322.mo1605() || c15213.f46685 != this.f37222) && !m30399()) {
            throw new IllegalStateException("Session view restoration requires an idle foreground owner");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m30198(C2931 c2931) {
        if (!c2931.m8950()) {
            return this.f37170;
        }
        float f = this.f37213;
        if (f > 0.0f) {
            return (int) Math.min(2147483647L, Math.round((c2931.f9318 / f) * this.f37245.m24484()));
        }
        return c2931.f9318;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m30203(C2931 c2931, C20030 c20030) {
        C13157 c13157 = c2931.f9323;
        C22686 c22686 = this.f37245;
        if (c13157 != null) {
            c13157.m31885(c22686);
        }
        C13157 c131572 = c2931.f9323;
        float f = 0.0f;
        if (c131572 != null) {
            float f2 = c131572.f39329;
            f = f2 > 0.0f ? f2 : c22686.m24484();
        }
        this.f37213 = f;
        if (c2931.m8950()) {
            this.f37200 = c2931.f9316;
            this.f37300 = c2931.f9322;
            this.f37196 = c2931.f9315;
            this.f37237 = c2931.f9321;
        }
        if (c20030 != null) {
            c22686.mo24477(c20030.f64875);
            int i = c20030.f64867;
            if (i != c20030.f64872 || c20030.f64880 != c20030.f64881 || (i == 1 && !C11003.equals(c20030.f64876, c20030.f64874))) {
                c22686.m50684(c20030.f64880 * c22686.f29053, c20030.f64867);
            }
            boolean z = c20030.f64862;
            if (z != c20030.f64870) {
                c22686.f73267 = z;
                if (z) {
                    c22686.f73297 = c20030.f64860;
                }
            }
            c22686.f73263 = c20030.f64879;
            c22686.m24494(c20030.f64882);
            c22686.m24497(c20030.f64863);
            c22686.f73261 = c20030.f64868;
            c22686.m24478(c20030.f64865);
            this.f37200 = c20030.f64877;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30323(C2931 c2931, C20030 c20030) {
        m30125(c2931, c20030, (C15213) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30125(C2931 c2931, C20030 c20030, C15213 c15213) {
        int i;
        m30377();
        if (c2931.f9326 > this.f37322.length() || c2931.f9317 > this.f37322.length()) {
            throw new IllegalArgumentException("Session search range exceeds text length");
        }
        m30438();
        this.f37304 = true;
        this.f37235.m18571();
        if (c15213 == null) {
            try {
                m30203(c2931, c20030);
            } catch (Throwable th) {
                this.f37304 = false;
                m30371();
                this.f37173.m17859(this.f37322);
                this.f37235.m18597(this.f37322);
                m30165();
                throw th;
            }
        }
        m30289();
        if (c2931.m8951()) {
            C22686 c22686 = this.f37245;
            c22686.f73250 = c2931.f9326;
            c22686.f73229 = c2931.f9317;
        }
        c2931.m8948(this.f37198, this.f37243);
        this.f37285.forceFinished(true);
        this.f37207.removeMessages(1);
        this.f37235.m18572();
        this.f37315.m52265();
        if (c15213 == null) {
            m30126(AbstractC3179.m9745(this, this.f37322, this.f37245, this.f37200), true);
        }
        this.f37221 = -1.0f;
        m30227();
        this.f37202.incrementAndGet();
        if (c20030 == null) {
            i = c2931.m8950() ? c2931.f9319 : getScrollX();
        } else {
            i = 0;
        }
        int m30198 = m30198(c2931);
        AbstractC3179 abstractC3179 = this.f37258;
        InterfaceC7785 interfaceC7785 = this.f37322;
        this.f37244 = new C22270(abstractC3179, interfaceC7785, interfaceC7785.mo26548(), i, m30198);
        m30123(m30390(i), m30521(m30198), true);
        m30232(this.f37258);
        C22686 c226862 = this.f37245;
        if (c226862.f73267) {
            m30317(c226862.f73297, true);
        } else if (c20030 != null && c20030.f64862 != c20030.f64870) {
            m30317((String) null, false);
        }
        m30465();
        this.f37304 = false;
        m30371();
        this.f37173.m17859(this.f37322);
        this.f37235.m18597(this.f37322);
        m30165();
        if (this.f37245.f73267 && this.f37235.m18574()) {
            this.f37315.m52257(this.f37235.m18587());
        } else {
            this.f37315.m52257(C23701.f76752);
        }
        m30405();
        requestLayout();
        invalidate();
    }

    /* renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30399() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f37322 instanceof C4342) || m30519() || this.f37277 || this.f37187 || this.f37304 || this.f37244 != null) {
            return false;
        }
        C15213 c15213 = this.f37177;
        return ((c15213 != null && !c15213.f46686) || this.f37258.mo9770() || this.f37322.mo1605()) ? false : true;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m30508() {
        if (Looper.myLooper() != Looper.getMainLooper() || !(this.f37322 instanceof C4342) || this.f37277 || this.f37187 || this.f37304) {
            return false;
        }
        C15213 c15213 = this.f37177;
        return (c15213 == null || c15213.f46686) && !this.f37322.mo1605();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2931 m30517() {
        if (m30508()) {
            return C2931.m8935(getScrollX(), this.f37170, this.f37200, this.f37300, this.f37196, this.f37237, this.f37245, this.f37198, this.f37243);
        }
        throw new IllegalStateException("Session view state requires a stable foreground owner");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30326(RunnableC5152 runnableC5152) {
        this.f37272.add(runnableC5152);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30429(RunnableC5152 runnableC5152) {
        this.f37272.remove(runnableC5152);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۗᩳ, reason: not valid java name and contains not printable characters */
    public void m30165() {
        if (!this.f37272.isEmpty()) {
            C4925.m14315(new RunnableC7994(0, this));
        }
        synchronized (this.f37260) {
            final C20154 c20154 = this.f37268;
            if (c20154 != null && !c20154.f65262) {
                c20154.f65262 = true;
                C4925.m14315(new Runnable() { // from class: l.᩹ۛᩳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C12392.m30145(C12392.this, c20154);
                    }
                });
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m30128(C12392 c12392) {
        Iterator it = c12392.f37272.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m30473(C4342 c4342) {
        C20154 c20154;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Session view readiness requires the foreground thread");
        }
        synchronized (this.f37260) {
            if (this.f37322 != c4342) {
                throw new IllegalStateException("Session readiness owner is not installed in the view");
            }
            if (c4342.mo1605()) {
                throw new IllegalStateException("Cannot await view readiness during text replacement");
            }
            c20154 = this.f37268;
            if (c20154 == null) {
                c20154 = new C20154(c4342, this.f37258, c4342.mo26548());
                this.f37268 = c20154;
            }
        }
        m30165();
        return c20154.f65263.m10921((InterfaceC21423) new C5172());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30145(C12392 c12392, C20154 c20154) {
        synchronized (c12392.f37260) {
            if (c12392.f37268 != c20154) {
                return;
            }
            c20154.f65262 = false;
            InterfaceC7785 interfaceC7785 = c12392.f37322;
            boolean z = (interfaceC7785 == c20154.f65266 && c12392.f37258 == c20154.f65264 && interfaceC7785.mo26548() == c20154.f65265) ? false : true;
            if (z || !(c12392.m30519() || c12392.f37277 || c12392.f37187 || c12392.f37304 || c12392.f37287 || c12392.f37244 != null || c12392.f37258.mo9770() || c12392.f37322.mo1605())) {
                c12392.f37268 = null;
                Throwable m30417 = c12392.m30417();
                if (!z && m30417 != null) {
                    c20154.f65263.m10914(m30417);
                } else if (z) {
                    c20154.f65263.m10914((Throwable) new CancellationException("Session view preparation was superseded"));
                } else {
                    c20154.f65263.m10912((Object) null);
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m30252(final String str) {
        final C20154 c20154;
        synchronized (this.f37260) {
            c20154 = this.f37268;
            this.f37268 = null;
        }
        if (c20154 != null) {
            C4925.m14315(new Runnable() { // from class: l.֨ۛᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    TextKeyListener textKeyListener = C12392.f37169;
                    C20154.this.f65263.m10914((Throwable) new CancellationException(str));
                }
            });
        }
    }

    /* renamed from: ۜᩳ, reason: not valid java name and contains not printable characters */
    private void m30181() {
        if (this.f37244 == null || this.f37304) {
            return;
        }
        this.f37244 = null;
        this.f37202.incrementAndGet();
        m30165();
    }

    /* renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public final int m30396() {
        return this.f37202.get();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30354(AbstractC3179 abstractC3179) {
        AbstractC3179 abstractC31792;
        C22270 c22270 = this.f37244;
        if (c22270 == null) {
            return false;
        }
        abstractC31792 = c22270.f72248;
        return abstractC31792 == abstractC3179;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30500(AbstractC3179 abstractC3179) {
        if (this.f37244 != null) {
            C4925.m14315(new RunnableC16460(0, this, abstractC3179));
        }
        m30165();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m30232(AbstractC3179 abstractC3179) {
        AbstractC3179 abstractC31792;
        InterfaceC7785 interfaceC7785;
        int i;
        int i2;
        int i3;
        int i4;
        C22270 c22270 = this.f37244;
        if (c22270 != null) {
            abstractC31792 = c22270.f72248;
            if (abstractC31792 != abstractC3179) {
                return;
            }
            if (this.f37258 == abstractC3179) {
                InterfaceC7785 interfaceC77852 = this.f37322;
                interfaceC7785 = c22270.f72249;
                if (interfaceC77852 == interfaceC7785) {
                    int mo26548 = this.f37322.mo26548();
                    i = c22270.f72250;
                    if (mo26548 == i) {
                        if (abstractC3179.mo9770()) {
                            return;
                        }
                        this.f37244 = null;
                        this.f37202.incrementAndGet();
                        if (abstractC3179 instanceof C2575) {
                            i4 = c22270.f72252;
                            ((C2575) abstractC3179).m8175(i4, m30394());
                        }
                        i2 = c22270.f72252;
                        int m30390 = m30390(i2);
                        i3 = c22270.f72251;
                        m30123(m30390, m30521(i3), true);
                        m30165();
                        return;
                    }
                }
            }
            this.f37244 = null;
            m30165();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30331(C10130 c10130, boolean z) {
        if (this.f37322 instanceof C4342) {
            throw new IllegalStateException("Session text requires the session recovery protocol");
        }
        c10130.writeInt(-249340294);
        c10130.m25436();
        c10130.writeByte(0);
        c10130.m25436();
        this.f37322.mo1594(c10130);
        c10130.writeInt(this.f37322.mo13049());
        c10130.m25418();
        c10130.writeByte(1);
        c10130.m25436();
        c10130.writeInt(this.f37271);
        c10130.writeInt(this.f37226);
        c10130.writeInt(this.f37227);
        c10130.m25418();
        c10130.writeByte(2);
        c10130.m25436();
        c10130.writeInt(m30444());
        c10130.writeInt(m30448());
        c10130.writeInt(getScrollX());
        c10130.writeInt(this.f37170);
        c10130.writeByte((byte) this.f37200);
        c10130.m25425(this.f37300);
        c10130.m25425(this.f37196);
        c10130.m25425(this.f37237);
        c10130.m25418();
        c10130.writeByte(10);
        c10130.m25436();
        c10130.m25431(this.f37322.mo1606());
        c10130.m25431(this.f37322.mo1601().m52329());
        c10130.m25418();
        c10130.writeByte(11);
        c10130.m25436();
        this.f37198.m49753(c10130);
        this.f37243.m49753(c10130);
        c10130.m25418();
        c10130.writeByte(4);
        c10130.m25436();
        this.f37245.m50686(c10130);
        c10130.m25418();
        c10130.writeByte(7);
        c10130.m25436();
        c10130.writeInt(this.f37245.f73250);
        c10130.writeInt(this.f37245.f73229);
        c10130.m25418();
        c10130.writeByte(5);
        c10130.m25436();
        this.f37258.mo8159(c10130);
        c10130.m25418();
        if (z) {
            c10130.writeByte(9);
            c10130.m25436();
            this.f37235.m18564(c10130);
            c10130.m25418();
        }
        c10130.writeByte(-1);
        c10130.m25418();
        c10130.writeInt(-249340294);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0015 A[SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m30210(l.C12951 r14) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12392.m30210(l.۬ۜܽ):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30211(C12951 c12951, int i) {
        int readInt = c12951.readInt();
        if (readInt < 0 || readInt > (i - c12951.m31488()) / 12) {
            throw new IllegalArgumentException("Invalid legacy undo count");
        }
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = c12951.readInt();
            if (readInt2 < 0 || readInt2 > (i - c12951.m31488()) / 28) {
                throw new IllegalArgumentException("Invalid legacy undo changes");
            }
            for (int i3 = 0; i3 < readInt2; i3++) {
                if (i - c12951.m31488() < 28) {
                    throw new IllegalArgumentException("Truncated legacy undo change");
                }
                c12951.skipBytes(20);
                for (int i4 = 0; i4 < 2; i4++) {
                    if (i - c12951.m31488() < 4) {
                        throw new IllegalArgumentException("Truncated legacy undo text");
                    }
                    int readInt3 = c12951.readInt();
                    if (readInt3 < 0 || readInt3 > i - c12951.m31488()) {
                        throw new IllegalArgumentException("Invalid legacy undo text length");
                    }
                    c12951.skipBytes(readInt3);
                }
            }
            if (i - c12951.m31488() < 8) {
                throw new IllegalArgumentException("Truncated legacy undo time");
            }
            c12951.skipBytes(8);
        }
    }

    static {
        ApplicationC12518.m30701(98);
        f37169 = new TextKeyListener(TextKeyListener.Capitalize.NONE, false);
        f37168 = C11266.m27878(120.0f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30341(InterfaceC21524 interfaceC21524) {
        this.f37292.add(interfaceC21524);
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m30443() {
        AbstractC21708 abstractC21708 = this.f37236;
        if (abstractC21708 != null) {
            abstractC21708.m49035();
        }
        ArrayList arrayList = this.f37292;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC21524) arrayList.get(i)).mo1090();
        }
        m30416();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static int m30184(int i) {
        float f = i;
        float f2 = f / f37168;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return (int) (f * f2 * 0.5f);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30426(int i, int i2) {
        m30191();
        m30181();
        this.f37207.removeMessages(1);
        this.f37285.forceFinished(true);
        m30242(i, i2);
    }

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public final int m30525() {
        return this.f37258.f9998.get(this.f37258.m9759(this.f37170 + 1)).f35062;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܶᩳ, reason: not valid java name and contains not printable characters */
    public void m30240() {
        this.f37314 = SystemClock.uptimeMillis();
        HandlerC13637 handlerC13637 = this.f37207;
        handlerC13637.removeMessages(3);
        handlerC13637.sendEmptyMessageDelayed(3, 1500L);
        postInvalidate();
    }

    /* renamed from: ۨܽ, reason: not valid java name and contains not printable characters */
    public final void m30442() {
        if (this.f37258.mo8160()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = (int) (uptimeMillis - this.f37314);
            this.f37172 = false;
            if (i >= 0 && i <= 1500) {
                this.f37207.removeMessages(3);
                this.f37314 = uptimeMillis - 1500;
                postInvalidate();
            }
            m30187();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۠ᩳ, reason: not valid java name and contains not printable characters */
    public void m30187() {
        if (this.f37258.mo8160()) {
            this.f37309 = SystemClock.uptimeMillis();
            HandlerC13637 handlerC13637 = this.f37207;
            handlerC13637.removeMessages(5);
            handlerC13637.sendEmptyMessageDelayed(5, 1500L);
            postInvalidate();
        }
    }

    /* renamed from: ܰܽ, reason: not valid java name and contains not printable characters */
    public final void m30453() {
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = (int) (uptimeMillis - this.f37309);
        this.f37294 = false;
        if (i >= 0 && i <= 1500) {
            this.f37207.removeMessages(5);
            this.f37309 = uptimeMillis - 1500;
            postInvalidate();
        }
        m30240();
    }

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public final void m30366() {
        this.f37309 = 0L;
        this.f37314 = 0L;
        m30278();
        postInvalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m30304(int i) {
        C22686 c22686 = this.f37245;
        if (c22686.f73267) {
            C6870 c6870 = this.f37235;
            if (c6870.m18575()) {
                return c6870.m18595(i, c22686.m24492());
            }
        }
        return c22686.m24492();
    }

    /* renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public final String m30440() {
        return this.f37235.m18573();
    }

    /* renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public final List m30398() {
        int[] m30369 = m30369();
        int m51120 = C22975.m51120(m30369[0], this.f37322);
        int m51112 = C22975.m51112(m30369[1], this.f37322);
        if (m51112 < this.f37322.length()) {
            m51112++;
        }
        return this.f37235.m18577(m51120, m51112);
    }

    /* renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17186 m30535() {
        return this.f37235.m18596();
    }

    /* renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6603 m30451() {
        return this.f37235.m18592();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m30410() {
        m30311(m30444(), m30448());
        InterfaceC19449 interfaceC19449 = this.f37301;
        if (interfaceC19449 != null) {
            interfaceC19449.mo2704(m30383(), m30296());
            this.f37301.mo2703(this.f37322.isChanged());
        }
        m30405();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m30405() {
        if (this.f37247 == this.f37322 || this.f37315 == null) {
            return;
        }
        int m30444 = m30444();
        int m30448 = m30448();
        long m18576 = this.f37235.m18576();
        if (m18576 == Long.MIN_VALUE) {
            this.f37315.m52259(m30444, m30448);
        } else if (m18576 == -1) {
            this.f37315.m52253(m30444, m30448);
        } else {
            this.f37315.m52254(m30444, m30448, (int) (m18576 >>> 32), (int) m18576);
        }
    }

    /* renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public final void m30367() {
        C23701 c23701 = this.f37315;
        if (c23701 != null) {
            c23701.m52253(m30444(), m30448());
        }
    }

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public final void m30515() {
        C23701 c23701 = this.f37315;
        if (c23701 != null) {
            c23701.m52265();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30333(C13681 c13681) {
        this.f37319 = c13681;
    }

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final String m30492() {
        C13681 c13681 = this.f37319;
        if (c13681 == null) {
            return m30378();
        }
        return C7864.m21066(c13681.f40834);
    }

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public final String m30378() {
        InterfaceC7785 interfaceC7785 = this.f37322;
        int selectionStart = Selection.getSelectionStart(interfaceC7785);
        int selectionEnd = Selection.getSelectionEnd(interfaceC7785);
        if (selectionStart == selectionEnd || selectionStart == -1 || selectionEnd == -1) {
            return null;
        }
        if (selectionStart < selectionEnd) {
            return interfaceC7785.subSequence(selectionStart, selectionEnd).toString();
        }
        return interfaceC7785.subSequence(selectionEnd, selectionStart).toString();
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m30416() {
        C7701 c7701 = this.f37311;
        if (c7701 != null) {
            c7701.m20608();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30328(InterfaceC7765 interfaceC7765) {
        this.f37232 = interfaceC7765;
        this.f37322.mo1593(interfaceC7765);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m30391() {
        int m52251;
        int m30444 = m30444();
        if (m30444 != m30448() || (m52251 = this.f37315.m52251(m30444)) == -1) {
            return;
        }
        mo25919(m52251);
        this.f37280 = SystemClock.uptimeMillis();
        m30349(m52251, false);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m30522() {
        int[] m52260;
        int m30444 = m30444();
        if (m30444 != m30448() || (m52260 = this.f37315.m52260(m30444)) == null) {
            return;
        }
        mo25922(m52260[0], m52260[1] + 1);
        m30537();
        m30430(false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30423() {
        Runnable runnable = this.f37310;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30315(Runnable runnable) {
        this.f37310 = runnable;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30344(InterfaceC22602 interfaceC22602) {
        this.f37191 = interfaceC22602;
    }

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30469() {
        return this.f37191 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30322(C2141 c2141) {
        this.f37190 = c2141;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m30465() {
        C2141 c2141 = this.f37190;
        if (c2141 != null) {
            C22686 c22686 = this.f37245;
            int i = c22686.f73250;
            int i2 = c22686.f73229;
            C15545.m36657((C15545) c2141.f7109, i != i2 && i >= 0 && i2 >= 0);
        }
    }

    /* renamed from: ܶܽ, reason: not valid java name and contains not printable characters */
    public final void m30464() {
        C22686 c22686 = this.f37245;
        int i = c22686.f73250;
        int i2 = c22686.f73229;
        if (i == i2 || i < 0 || i2 < 0) {
            return;
        }
        c22686.f73229 = -1;
        c22686.f73250 = -1;
        m30465();
        invalidate();
    }

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public final C12973 m30518() {
        C22686 c22686 = this.f37245;
        int i = c22686.f73250;
        int i2 = c22686.f73229;
        if (i == i2 || i < 0 || i2 < 0) {
            return null;
        }
        C12973 c12973 = new C12973();
        c12973.f38879 = i;
        c12973.f38878 = i2;
        return c12973;
    }

    /* renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30302() {
        EdgeEffect edgeEffect = this.f37216;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect2 = this.f37275;
        if (edgeEffect2 != null && !edgeEffect2.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect3 = this.f37303;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            return false;
        }
        EdgeEffect edgeEffect4 = this.f37189;
        return edgeEffect4 == null || edgeEffect4.isFinished();
    }

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final float m30384() {
        return this.f37245.m24484();
    }

    /* renamed from: ܳᩳ, reason: not valid java name and contains not printable characters */
    public final void m30461() {
        C22810 c22810 = this.f37181;
        if (c22810 != null) {
            c22810.m50904();
        }
        this.f37181 = new C22810(this);
        if (this.f37259 == null) {
            this.f37259 = new ViewTreeObserverOnGlobalLayoutListenerC1103(this);
            if (isAttachedToWindow()) {
                ViewTreeObserver viewTreeObserver = getViewTreeObserver();
                viewTreeObserver.addOnGlobalLayoutListener(this.f37259);
                viewTreeObserver.addOnScrollChangedListener(this.f37259);
            }
        }
        invalidate();
    }

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public final C22810 m30543() {
        return this.f37181;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m30467(boolean z) {
        this.f37204 = z;
        if (z) {
            return;
        }
        m30162();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m30486(int i, boolean z) {
        this.f37267 = z;
        if (z) {
            this.f37313 = i;
        } else {
            m30162();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30425(float f, float f2) {
        int i;
        this.f37289 = f;
        this.f37293 = f2;
        int m30444 = m30444();
        int m30448 = m30448();
        if (m30444 <= m30448) {
            m30448 = m30444;
            m30444 = m30448;
        }
        int m9760 = this.f37258.m9760(getScrollX() + f, this.f37170 + f2);
        if (this.f37266 != m9760 && (i = this.f37313) != m9760) {
            this.f37266 = -1;
            if (i > m9760) {
                if (m30448 != m9760) {
                    this.f37322.setSelection(m9760, i);
                    invalidate();
                }
            } else if (m30444 != m9760) {
                this.f37322.setSelection(i, m9760);
                invalidate();
            }
        }
        if (mo25914()) {
            m30200((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), this.f37245.f73274);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30496(float f, float f2) {
        this.f37289 = f;
        this.f37293 = f2;
        int m9760 = this.f37258.m9760(getScrollX() + f, this.f37170 + f2);
        if (m9760 != Selection.getSelectionStart(this.f37322)) {
            this.f37322.setSelection(m9760);
            invalidate();
            m30238(m9760);
        }
        this.f37263 = SystemClock.uptimeMillis();
        m30400();
        int m24484 = (int) this.f37245.m24484();
        boolean z = f2 < ((float) (-m24484)) || f2 > ((float) (m30542() + m24484));
        if (mo25914()) {
            if (!z) {
                m30200((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m30162();
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30476(float f, float f2) {
        this.f37289 = f;
        this.f37293 = f2;
        int m30444 = m30444();
        int m30448 = m30448();
        if (m30444 <= m30448) {
            m30448 = m30444;
            m30444 = m30448;
        }
        int m9760 = this.f37258.m9760(getScrollX() + f, this.f37170 + f2);
        int i = this.f37313;
        boolean z = true;
        if (i != m9760) {
            if (i > m9760) {
                if (m30448 != m9760) {
                    this.f37322.setSelection(m9760, i);
                    m30238(m9760);
                    if (!this.f37308) {
                        this.f37308 = true;
                    }
                }
            } else if (m30444 != m9760) {
                this.f37322.setSelection(i, m9760);
                m30238(m9760);
                if (this.f37308) {
                    this.f37308 = false;
                }
            }
            this.f37263 = SystemClock.uptimeMillis();
            invalidate();
        }
        int m24484 = (int) this.f37245.m24484();
        if (f2 >= (-m24484) && f2 <= m30542() + m24484) {
            z = false;
        }
        if (mo25914()) {
            if (!z) {
                m30200((int) (f + getPaddingLeft()), (int) (f2 + getPaddingTop()), 0);
            } else {
                m30162();
            }
        }
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final int m30394() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final int m30542() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final void m30376() {
        this.f37274.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    /* renamed from: ۙܽ, reason: not valid java name and contains not printable characters */
    public final void m30380() {
        this.f37274.restartInput(this);
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final void m30387() {
        C22810 c22810 = this.f37181;
        if (c22810 != null) {
            this.f37263 = 0L;
            c22810.m50904();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m30477(String str) {
        this.f37258.mo8158(str);
        invalidate();
    }

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final String m30509() {
        return this.f37258.f10006;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return this.f37258 == null ? getHeight() : Math.max(getHeight(), (int) this.f37258.m9789());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setScrollY(this.f37170);
        accessibilityEvent.setMaxScrollY(this.f37258 == null ? 0 : m30528());
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEditable(true);
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        return EditText.class.getName();
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (Build.VERSION.SDK_INT < 34 || !isAccessibilityDataSensitive() || accessibilityEvent.isAccessibilityDataSensitive()) {
            CharSequence charSequence = this.f37322;
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.f37258.f10006;
            }
            if (charSequence != null) {
                int i = 10000;
                if (charSequence.length() > 10000) {
                    if (Character.isHighSurrogate(charSequence.charAt(9999)) && Character.isLowSurrogate(charSequence.charAt(10000))) {
                        i = 9999;
                    }
                    charSequence = charSequence.subSequence(0, i);
                }
            }
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        int action = dragEvent.getAction();
        if (action == 4 || action == 6 || (!m30441() && m30174())) {
            switch (action) {
                case 1:
                    ClipDescription clipDescription = dragEvent.getClipDescription();
                    if (clipDescription == null || (!clipDescription.hasMimeType("text/plain") && !clipDescription.hasMimeType("text/html"))) {
                    }
                    break;
                case 2:
                    float x = dragEvent.getX();
                    float y = dragEvent.getY();
                    int m9760 = this.f37258.m9760(getScrollX() + x, this.f37170 + y);
                    if (m9760 != m30444() || m9760 != m30448()) {
                        this.f37322.setSelection(m9760);
                        m30349(m9760, true);
                    }
                    invalidate();
                    if (mo25914()) {
                        m30200((int) x, (int) y, this.f37245.f73274);
                        break;
                    }
                    break;
                case 3:
                    ClipData clipData = dragEvent.getClipData();
                    if (clipData.getItemCount() > 0) {
                        CharSequence m50681 = C22686.m50681(clipData.getItemAt(0).getText());
                        int[] m30369 = m30369();
                        this.f37322.replace(m30369[0], m30369[1], m50681);
                        int length = m50681.length() + m30369[0];
                        m30369[1] = length;
                        mo25922(m30369[0], length);
                        invalidate();
                        break;
                    }
                    break;
                case 4:
                    if (mo25914()) {
                        m30162();
                    }
                    this.f37199 = false;
                    invalidate();
                    break;
                case 5:
                    if (mo25914()) {
                        m30200((int) dragEvent.getX(), (int) dragEvent.getY(), this.f37245.f73274);
                    }
                    this.f37199 = true;
                    invalidate();
                    break;
                case 6:
                    if (mo25914()) {
                        m30162();
                    }
                    this.f37199 = false;
                    invalidate();
                    break;
            }
            return true;
        }
        return false;
    }

    /* renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30452() {
        return this.f37204;
    }

    /* renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30445() {
        return this.f37267;
    }

    /* renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30418() {
        return this.f37308;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30142(C12392 c12392, C12392 c123922) {
        if (c12392 == c123922) {
            throw new IllegalArgumentException();
        }
        c12392.f37281 = c123922;
        c123922.f37281 = c12392;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m30208(C12392 c12392, C12392 c123922) {
        if (c12392.f37295) {
            c123922.f37314 = SystemClock.uptimeMillis();
        } else if (c123922.f37295) {
            c12392.f37314 = SystemClock.uptimeMillis();
        } else {
            long max = Math.max(c12392.f37314, c123922.f37314);
            c123922.f37314 = max;
            c12392.f37314 = max;
        }
        if (c12392.f37291) {
            c123922.f37309 = SystemClock.uptimeMillis();
        } else {
            if (c123922.f37291) {
                c12392.f37309 = SystemClock.uptimeMillis();
                return;
            }
            long max2 = Math.max(c12392.f37309, c123922.f37309);
            c123922.f37309 = max2;
            c12392.f37309 = max2;
        }
    }

    /* renamed from: ۤܽ, reason: not valid java name and contains not printable characters */
    public final void m30419() {
        if (!this.f37316) {
            this.f37316 = true;
            C16909.m39764(this.f37303);
            C16909.m39764(this.f37189);
            EdgeEffect edgeEffect = this.f37216;
            if (edgeEffect != null) {
                C16909.m39764(edgeEffect);
            }
            EdgeEffect edgeEffect2 = this.f37275;
            if (edgeEffect2 != null) {
                C16909.m39764(edgeEffect2);
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m30540(int i, int i2) {
        this.f37269 = i;
        this.f37223 = i2;
        this.f37239.m22792();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* renamed from: ᩳᩳ, reason: not valid java name and contains not printable characters */
    public final void m30506() {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        if ((this.f37269 & 3) == 0 || this.f37258 == null || m30370() || !this.f37274.isActive(this)) {
            return;
        }
        int i2 = this.f37223;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            z2 = (i2 & 4) != 0;
            z3 = (i2 & 8) != 0;
            z = (i2 & 16) != 0;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean z4 = (z2 || z3 || z) ? false : true;
        boolean z5 = z2 | z4;
        boolean z6 = z3 | z4;
        boolean z7 = z | z4;
        CursorAnchorInfo.Builder builder = this.f37233;
        builder.reset();
        int m30444 = m30444();
        builder.setSelectionRange(m30444, m30448());
        if (i3 >= 29) {
            this.f37229.reset();
            transformMatrixToGlobal(this.f37229);
            builder.setMatrix(this.f37229);
        } else {
            this.f37229.set(getMatrix());
            getLocationOnScreen(this.f37212);
            Matrix matrix = this.f37229;
            int[] iArr = this.f37212;
            matrix.postTranslate(iArr[0], iArr[1]);
            builder.setMatrix(this.f37229);
        }
        if (z5 && i3 >= 34) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(rectF).setHandwritingBounds(new RectF(-getHandwritingBoundsOffsetLeft(), -getHandwritingBoundsOffsetTop(), getHandwritingBoundsOffsetRight() + getWidth(), getHandwritingBoundsOffsetBottom() + getHeight())).build());
        }
        if (z6 || z7) {
            float paddingLeft = getPaddingLeft() - getScrollX();
            float paddingTop = getPaddingTop() - this.f37170;
            RectF rectF2 = new RectF();
            RectF rectF3 = new RectF(getPaddingLeft(), getPaddingRight(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            if (z6) {
                InterfaceC7785 interfaceC7785 = this.f37322;
                int composingSpanStart = BaseInputConnection.getComposingSpanStart(interfaceC7785);
                int composingSpanEnd = BaseInputConnection.getComposingSpanEnd(interfaceC7785);
                if (composingSpanEnd < composingSpanStart) {
                    i = composingSpanStart;
                    composingSpanStart = composingSpanEnd;
                } else {
                    i = composingSpanEnd;
                }
                if (composingSpanStart >= 0 && composingSpanStart < i) {
                    builder.setComposingText(composingSpanStart, interfaceC7785.subSequence(composingSpanStart, i));
                    int i4 = composingSpanStart;
                    while (i4 < i) {
                        this.f37258.mo8157(rectF2, i4);
                        rectF2.offset(paddingLeft, paddingTop);
                        int intersects = RectF.intersects(rectF3, rectF2);
                        if (!rectF3.contains(rectF2)) {
                            intersects = (intersects == true ? 1 : 0) | 2;
                        }
                        builder.addCharacterBounds(i4, rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, intersects);
                        i4++;
                        i = i;
                    }
                }
            }
            if (z7 && m30444 >= 0) {
                this.f37258.mo8157(rectF2, m30444);
                rectF2.offset(paddingLeft, paddingTop);
                ?? intersects2 = RectF.intersects(rectF3, rectF2);
                int i5 = intersects2;
                if (!rectF3.contains(rectF2)) {
                    i5 = (intersects2 == true ? 1 : 0) | 2;
                }
                float f = rectF2.left;
                float f2 = rectF2.top;
                builder.setInsertionMarkerLocation(f, f2, this.f37245.m24501() + f2, rectF2.bottom, i5);
            }
        }
        this.f37274.updateCursorAnchorInfo(this, builder.build());
        this.f37269 &= -2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30135(C12392 c12392, Runnable runnable) {
        if (c12392.m30370()) {
            if (c12392.isAttachedToWindow()) {
                C4925.m14309(100L, runnable);
                return;
            }
            return;
        }
        runnable.run();
    }

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger m30414() {
        return this.f37286;
    }

    /* renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public final boolean m30460() {
        return this.f37286.get() > 0;
    }

    /* renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30532() {
        return this.f37211;
    }

    /* renamed from: ֫ᩳ, reason: not valid java name and contains not printable characters */
    public final void m30362() {
        if (this.f37211) {
            throw new IllegalStateException();
        }
        this.f37322.getClass();
        this.f37211 = true;
        this.f37173.m17856(this.f37322);
        this.f37235.m18571();
    }

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m30397() {
        if (!this.f37211) {
            throw new IllegalStateException();
        }
        this.f37211 = false;
        if (m30519()) {
            this.f37173.m17854(this.f37322);
            this.f37322.mo1602();
            C3926 c3926 = this.f37302;
            C11003.requireNonNull(c3926);
            C4925.m14315(new RunnableC11646(c3926));
            return;
        }
        if (this.f37235.m18575()) {
            this.f37235.m18579((InterfaceC20445) this.f37322);
        }
        this.f37173.m17854(this.f37322);
        this.f37322.mo1602();
        m30311(m30444(), m30448());
        m30405();
        this.f37221 = -1.0f;
    }

    @Override // l.InterfaceC16685
    /* renamed from: ֫ */
    public final boolean mo20073(float f, float f2) {
        AbstractC3179 abstractC3179 = this.f37258;
        boolean z = abstractC3179.f10029;
        boolean z2 = abstractC3179.f10028;
        if (!z && !z2) {
            return false;
        }
        getLocationOnScreen(this.f37249);
        float scrollX = ((f + getScrollX()) - getPaddingLeft()) - r3[0];
        float m9777 = this.f37258.m9777(f2 - r3[1]);
        if (z && this.f37258.f9999.m35177(scrollX, m9777)) {
            return true;
        }
        return z2 && this.f37258.f9997.m35177(scrollX, m9777);
    }

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C13802 m30468() {
        return this.f37297;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30334(C13802 c13802) {
        this.f37297 = c13802;
    }
}
