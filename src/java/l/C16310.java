package l;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.app.OpenAuthTask;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: 38GQ */
/* renamed from: l.ܽ֨ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C16310 extends FrameLayout {

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f50182 = 0;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final String f50183;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8051 f50184;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50185;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f50186;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Formatter f50187;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f50188;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f50189;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50190;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final View f50191;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f50192;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final View f50193;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public int f50194;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f50195;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f50196;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f50197;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String f50198;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final View f50199;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f50200;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RunnableC3861 f50201;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final TextView f50202;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f50203;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final RunnableC5622 f50204;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f50205;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50206;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f50207;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50208;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final ImageView f50209;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final Drawable f50210;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f50211;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public boolean f50212;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f50213;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f50214;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f50215;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final View f50216;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final View f50217;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final View f50218;

    static {
        C16840.m39615("media3.ui");
    }

    public C16310(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16310(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50188 = OpenAuthTask.Duplex;
        this.f50203 = 0;
        this.f50194 = 200;
        this.f50200 = -9223372036854775807L;
        this.f50205 = true;
        this.f50212 = true;
        this.f50195 = true;
        this.f50196 = true;
        this.f50186 = false;
        int i2 = R.layout.MT_Protector_res_0x7f0d011e;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C22736.f73442, i, 0);
            try {
                this.f50188 = obtainStyledAttributes.getInt(19, OpenAuthTask.Duplex);
                i2 = obtainStyledAttributes.getResourceId(5, R.layout.MT_Protector_res_0x7f0d011e);
                this.f50203 = obtainStyledAttributes.getInt(8, 0);
                this.f50205 = obtainStyledAttributes.getBoolean(17, true);
                this.f50212 = obtainStyledAttributes.getBoolean(14, true);
                this.f50195 = obtainStyledAttributes.getBoolean(16, true);
                this.f50196 = obtainStyledAttributes.getBoolean(15, true);
                this.f50186 = obtainStyledAttributes.getBoolean(18, false);
                this.f50194 = C3603.m11000(obtainStyledAttributes.getInt(20, this.f50194), 16, 1000);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f50214 = new CopyOnWriteArrayList();
        new C22485();
        new C20369();
        StringBuilder sb = new StringBuilder();
        this.f50189 = sb;
        this.f50187 = new Formatter(sb, Locale.getDefault());
        ViewOnClickListenerC1494 viewOnClickListenerC1494 = new ViewOnClickListenerC1494(this);
        this.f50204 = new RunnableC5622(1, this);
        this.f50201 = new RunnableC3861(1, this);
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        InterfaceC8051 interfaceC8051 = (InterfaceC8051) findViewById(R.id.MT_Protector_res_0x7f0a01c5);
        View findViewById = findViewById(R.id.MT_Protector_res_0x7f0a01c6);
        if (interfaceC8051 != null) {
            this.f50184 = interfaceC8051;
        } else if (findViewById != null) {
            C7263 c7263 = new C7263(context, null, 0, attributeSet, 0);
            c7263.setId(R.id.MT_Protector_res_0x7f0a01c5);
            c7263.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(c7263, indexOfChild);
            this.f50184 = c7263;
        } else {
            this.f50184 = null;
        }
        this.f50202 = (TextView) findViewById(R.id.MT_Protector_res_0x7f0a01c3);
        InterfaceC8051 interfaceC80512 = this.f50184;
        if (interfaceC80512 != null) {
            interfaceC80512.mo19495(viewOnClickListenerC1494);
        }
        View findViewById2 = findViewById(R.id.MT_Protector_res_0x7f0a01c0);
        this.f50217 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(viewOnClickListenerC1494);
        }
        View findViewById3 = findViewById(R.id.MT_Protector_res_0x7f0a01bf);
        this.f50199 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(viewOnClickListenerC1494);
        }
        View findViewById4 = findViewById(R.id.MT_Protector_res_0x7f0a01c4);
        this.f50193 = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(viewOnClickListenerC1494);
        }
        View findViewById5 = findViewById(R.id.MT_Protector_res_0x7f0a01bb);
        this.f50191 = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(viewOnClickListenerC1494);
        }
        View findViewById6 = findViewById(R.id.MT_Protector_res_0x7f0a01c8);
        this.f50218 = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(viewOnClickListenerC1494);
        }
        View findViewById7 = findViewById(R.id.MT_Protector_res_0x7f0a01b3);
        this.f50211 = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(viewOnClickListenerC1494);
        }
        ImageView imageView = (ImageView) findViewById(R.id.MT_Protector_res_0x7f0a01c7);
        this.f50207 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC1494);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.MT_Protector_res_0x7f0a01cc);
        this.f50209 = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(viewOnClickListenerC1494);
        }
        View findViewById8 = findViewById(R.id.MT_Protector_res_0x7f0a01d4);
        this.f50216 = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setVisibility(8);
        }
        m38371(findViewById8, false);
        Resources resources = context.getResources();
        resources.getInteger(R.integer.MT_Protector_res_0x7f0b000a);
        this.f50213 = resources.getInteger(R.integer.MT_Protector_res_0x7f0b0009) / 100.0f;
        this.f50206 = resources.getDrawable(R.drawable.MT_Protector_res_0x7f0800d1, context.getTheme());
        this.f50208 = resources.getDrawable(R.drawable.MT_Protector_res_0x7f0800d2, context.getTheme());
        this.f50185 = resources.getDrawable(R.drawable.MT_Protector_res_0x7f0800d0, context.getTheme());
        this.f50190 = resources.getDrawable(R.drawable.MT_Protector_res_0x7f0800d5, context.getTheme());
        this.f50210 = resources.getDrawable(R.drawable.MT_Protector_res_0x7f0800d4, context.getTheme());
        this.f50198 = resources.getString(R.string.MT_Protector_res_0x7f120329);
        resources.getString(R.string.MT_Protector_res_0x7f12032a);
        resources.getString(R.string.MT_Protector_res_0x7f120328);
        resources.getString(R.string.MT_Protector_res_0x7f120330);
        this.f50183 = resources.getString(R.string.MT_Protector_res_0x7f12032f);
        this.f50215 = -9223372036854775807L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38388() {
        if (m38389()) {
            setVisibility(8);
            Iterator it = this.f50214.iterator();
            while (it.hasNext()) {
                InterfaceC10667 interfaceC10667 = (InterfaceC10667) it.next();
                getVisibility();
                interfaceC10667.m26766();
            }
            removeCallbacks(this.f50204);
            removeCallbacks(this.f50201);
            this.f50200 = -9223372036854775807L;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38389() {
        return getVisibility() == 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38380() {
        RunnableC3861 runnableC3861 = this.f50201;
        removeCallbacks(runnableC3861);
        int i = this.f50188;
        if (i > 0) {
            long j = i;
            this.f50200 = SystemClock.uptimeMillis() + j;
            if (this.f50197) {
                postDelayed(runnableC3861, j);
                return;
            }
            return;
        }
        this.f50200 = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public void m38381() {
        boolean z;
        if (m38389() && this.f50197) {
            String str = C3603.f11424;
            View view = this.f50217;
            boolean z2 = false;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f50199;
            if (view2 != null) {
                z2 = view2.isFocused();
                z = view2.isAccessibilityFocused();
                view2.setVisibility(8);
            } else {
                z = false;
            }
            if (z2 && view != null) {
                view.requestFocus();
            }
            if (!z || view == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m38384() {
        if (m38389() && this.f50197) {
            m38371(this.f50193, this.f50195);
            m38371(this.f50218, this.f50205);
            m38371(this.f50211, this.f50212);
            m38371(this.f50191, this.f50196);
            InterfaceC8051 interfaceC8051 = this.f50184;
            if (interfaceC8051 != null) {
                interfaceC8051.setEnabled(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m38386() {
        ImageView imageView;
        if (m38389() && this.f50197 && (imageView = this.f50207) != null) {
            if (this.f50203 == 0) {
                m38371((View) imageView, false);
                return;
            }
            m38371((View) imageView, true);
            imageView.setImageDrawable(this.f50206);
            imageView.setContentDescription(this.f50198);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m38374() {
        ImageView imageView;
        if (m38389() && this.f50197 && (imageView = this.f50209) != null) {
            if (!this.f50186) {
                m38371((View) imageView, false);
                return;
            }
            m38371((View) imageView, true);
            imageView.setImageDrawable(this.f50210);
            imageView.setContentDescription(this.f50183);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m38377() {
        if (m38389() && this.f50197) {
            boolean z = 0 != this.f50215;
            this.f50215 = 0L;
            TextView textView = this.f50202;
            if (textView != null && !this.f50192 && z) {
                textView.setText(C3603.m11020(this.f50189, this.f50187, 0L));
            }
            InterfaceC8051 interfaceC8051 = this.f50184;
            if (interfaceC8051 != null) {
                interfaceC8051.mo19494(0L);
                interfaceC8051.mo19501(0L);
            }
            removeCallbacks(this.f50204);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38371(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(false);
        view.setAlpha(this.f50213);
        view.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50197 = true;
        long j = this.f50200;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                m38388();
            } else {
                postDelayed(this.f50201, uptimeMillis);
            }
        } else if (m38389()) {
            m38380();
        }
        m38381();
        m38384();
        m38386();
        m38374();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f50197 = false;
        removeCallbacks(this.f50204);
        removeCallbacks(this.f50201);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f50201);
        } else if (motionEvent.getAction() == 1) {
            m38380();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        return super.dispatchKeyEvent(keyEvent);
    }
}
