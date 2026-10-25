package l;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.media.AudioManager;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: D8GL */
/* renamed from: l.ۡۤۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class GestureDetectorOnGestureListenerC8816 implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public long f26863;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AnimatorSet f26864;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f26865;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f26866;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f26867;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Formatter f26868;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f26869;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f26870;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f26871;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f26872;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10227 f26874;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f26876;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26877;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AudioManager f26878;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f26879;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int f26875 = C11266.m27878(150.0f);

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f26873 = -1;

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public GestureDetectorOnGestureListenerC8816(ActivityC10227 activityC10227) {
        this.f26874 = activityC10227;
        this.f26878 = (AudioManager) activityC10227.getSystemService("audio");
        StringBuilder sb = new StringBuilder();
        this.f26871 = sb;
        this.f26868 = new Formatter(sb, Locale.getDefault());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C18635 c18635;
        C18635 c186352;
        C18635 c186353;
        ActivityC10227 activityC10227 = this.f26874;
        c18635 = activityC10227.f30827;
        if (c18635.m43230()) {
            c186353 = activityC10227.f30827;
            c186353.m43231();
            return true;
        }
        c186352 = activityC10227.f30827;
        c186352.m43232();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ActivityC10227 activityC10227 = this.f26874;
        if (ActivityC10227.m25730(activityC10227)) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        activityC10227.m25845();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        boolean z;
        this.f26873 = -1;
        ActivityC10227 activityC10227 = this.f26874;
        z = activityC10227.f30726;
        this.f26877 = (z || ActivityC10227.m25730(activityC10227)) ? false : true;
        ActivityC10227.m25756(activityC10227);
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22785() {
        ViewGroup viewGroup;
        InterfaceC4162 interfaceC4162;
        if (this.f26872) {
            this.f26872 = false;
            ActivityC10227 activityC10227 = this.f26874;
            viewGroup = activityC10227.f30819;
            viewGroup.setVisibility(8);
            interfaceC4162 = activityC10227.f30786;
            interfaceC4162.mo4568(new C2730(this.f26879));
            AnimatorSet animatorSet = this.f26864;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f26864 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22784(long j) {
        TextView textView;
        ProgressBar progressBar;
        TextView textView2;
        ProgressBar progressBar2;
        ActivityC10227 activityC10227 = this.f26874;
        textView = activityC10227.f30725;
        if (textView != null) {
            progressBar = activityC10227.f30809;
            if (progressBar == null) {
                return;
            }
            StringBuilder sb = this.f26871;
            Formatter formatter = this.f26868;
            String m11020 = C3603.m11020(sb, formatter, j);
            String m110202 = C3603.m11020(sb, formatter, this.f26866);
            String m110203 = C3603.m11020(sb, formatter, j - this.f26863);
            SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) m11020).append('/').append((CharSequence) m110202).append('\n');
            int length = append.length();
            append.append('[');
            if (m110203.equals("-00:00") || m110203.equals("00:00")) {
                append.append((CharSequence) "00:00");
            } else {
                if (m110203.charAt(0) != '-') {
                    append.append('+');
                }
                append.append((CharSequence) m110203);
            }
            append.append(']');
            append.setSpan(new ForegroundColorSpan(-5592406), 0, m11020.length(), 17);
            append.setSpan(new ForegroundColorSpan(-5592406), length, append.length(), 17);
            textView2 = activityC10227.f30725;
            textView2.setText(append);
            progressBar2 = activityC10227.f30809;
            long j2 = this.f26866;
            progressBar2.setProgress(j2 > 0 ? (int) ((j * 1000) / j2) : 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r4 < (r9.getHeight() * 0.1f)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0201, code lost:
    
        if (r5 > r3) goto L81;
     */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onScroll(android.view.MotionEvent r16, android.view.MotionEvent r17, float r18, float r19) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.GestureDetectorOnGestureListenerC8816.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        boolean z;
        InterfaceC4162 interfaceC4162;
        C18635 c18635;
        ViewGroup viewGroup;
        InterfaceC4162 interfaceC41622;
        ViewGroup viewGroup2;
        InterfaceC4162 interfaceC41623;
        InterfaceC4162 interfaceC41624;
        InterfaceC4162 interfaceC41625;
        ActivityC10227 activityC10227 = this.f26874;
        if (ActivityC10227.m25730(activityC10227)) {
            return;
        }
        z = activityC10227.f30745;
        if (z) {
            return;
        }
        interfaceC4162 = activityC10227.f30786;
        if (!interfaceC4162.isPlaying()) {
            interfaceC41624 = activityC10227.f30786;
            if (interfaceC41624.mo4603() != 3) {
                return;
            }
            interfaceC41625 = activityC10227.f30786;
            if (!interfaceC41625.mo4607()) {
                return;
            }
        }
        c18635 = activityC10227.f30827;
        c18635.m43231();
        this.f26872 = true;
        viewGroup = activityC10227.f30819;
        viewGroup.setVisibility(0);
        interfaceC41622 = activityC10227.f30786;
        float f = interfaceC41622.mo4599().f8510;
        this.f26879 = f;
        float max = Math.max(2.0f, f * 2.0f);
        viewGroup2 = activityC10227.f30819;
        ((TextView) viewGroup2.getChildAt(3)).setText(new DecimalFormat("0.0##X").format(max));
        interfaceC41623 = activityC10227.f30786;
        interfaceC41623.mo4568(new C2730(max));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(m22783(0), m22783(1), m22783(2));
        animatorSet.setDuration(800L);
        animatorSet.start();
        this.f26864 = animatorSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private ObjectAnimator m22783(int i) {
        ViewGroup viewGroup;
        viewGroup = this.f26874.f30819;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup.getChildAt(i), "alpha", 1.0f, 0.5f, 0.2f, 0.2f, 0.5f, 1.0f);
        final float f = 0.9f - (i * 0.1f);
        ofFloat.setInterpolator(new TimeInterpolator() { // from class: l.ۢۤۜ
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f2) {
                float f3 = f2 + f;
                return f3 > 1.0f ? f3 - 1.0f : f3;
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        return ofFloat;
    }
}
