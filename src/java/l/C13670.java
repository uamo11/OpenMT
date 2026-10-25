package l;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: 59KW */
/* renamed from: l.ܰ۟ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C13670 extends View {

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f40750;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public int f40751;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f40752;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public boolean f40753;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f40754;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public Stack f40755;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public float f40756;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C20022 f40757;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public int f40758;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public Stack f40759;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f40760;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC10144 f40761;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f40762;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public float f40763;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public float f40764;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public float f40765;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f40766;

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public boolean f40767;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f40768;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40769;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C12965 f40770;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40771;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C12965 f40772;

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public ArrayList f40773;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C12965 f40774;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f40775;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public boolean f40776;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f40777;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C0923 f40778;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f40779;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public int f40780;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public float f40781;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C1539 f40782;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40783;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f40784;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f40785;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12965 f40786;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public boolean f40787;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public BitmapDrawable f40788;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public C15633 f40789;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C12965 f40790;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f40791;

    public C13670(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40785 = 0;
        this.f40754 = 0;
        this.f40751 = 0;
        this.f40763 = 5.0f;
        this.f40757 = new C20022();
        this.f40782 = new C1539();
        this.f40773 = new ArrayList();
        this.f40771 = new ArrayList();
        this.f40768 = 0;
        this.f40791 = true;
        this.f40755 = new Stack();
        this.f40759 = new Stack();
        m32840(context);
    }

    public C13670(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40785 = 0;
        this.f40754 = 0;
        this.f40751 = 0;
        this.f40763 = 5.0f;
        this.f40757 = new C20022();
        this.f40782 = new C1539();
        this.f40773 = new ArrayList();
        this.f40771 = new ArrayList();
        this.f40768 = 0;
        this.f40791 = true;
        this.f40755 = new Stack();
        this.f40759 = new Stack();
        m32840(context);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32840(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f40758 = viewConfiguration.getScaledTouchSlop();
        int scaledDoubleTapSlop = viewConfiguration.getScaledDoubleTapSlop();
        int i = scaledDoubleTapSlop * scaledDoubleTapSlop;
        int i2 = (int) ((context.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
        this.f40784 = i2;
        this.f40780 = i2;
        if (isInEditMode()) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.MT_Protector_res_0x7f0802b2);
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            drawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            drawable.draw(new Canvas(createBitmap));
            m32841(createBitmap);
            this.f40764 = 4.0f;
            this.f40765 = 4.0f;
            this.f40763 = 4.0f;
        }
        Paint.Style style = Paint.Style.FILL;
        C1539 c1539 = this.f40782;
        c1539.setStyle(style);
        c1539.setAntiAlias(false);
        c1539.setFilterBitmap(false);
        C0923 c0923 = new C0923(context, new GestureDetectorOnGestureListenerC11555(this, i));
        this.f40778 = c0923;
        c0923.m3329();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32867(C9285 c9285) {
        m32841(c9285.m23825());
        ArrayList arrayList = this.f40773;
        arrayList.clear();
        ArrayList arrayList2 = this.f40771;
        arrayList2.clear();
        this.f40772 = null;
        this.f40770 = null;
        C12260 m23827 = c9285.m23827();
        if (m23827 != null) {
            Rect rect = m23827.f36519;
            ArrayList arrayList3 = m23827.f36521;
            ArrayList arrayList4 = m23827.f36520;
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                C4499 c4499 = (C4499) it.next();
                arrayList.add(new C12965(c4499.f14318, c4499.f14317, false));
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                C4499 c44992 = (C4499) it2.next();
                arrayList2.add(new C12965(c44992.f14318, c44992.f14317, true));
            }
            if (!rect.equals(C12260.m29753(arrayList4, arrayList3, this.f40775, this.f40779))) {
                this.f40772 = new C12965(rect.left, this.f40775 - rect.right, false);
                this.f40770 = new C12965(rect.top, this.f40779 - rect.bottom, true);
            }
        }
        C17045 m23826 = c9285.m23826();
        if (m23826 != null) {
            this.f40790 = new C12965(m23826.f52234, this.f40775 - m23826.f52235, false);
            this.f40774 = new C12965(m23826.f52236, this.f40779 - m23826.f52233, true);
        } else {
            this.f40790 = new C12965(0, this.f40775, false);
            this.f40774 = new C12965(0, this.f40779, true);
        }
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32841(Bitmap bitmap) {
        if (bitmap != null) {
            this.f40775 = bitmap.getWidth();
            this.f40779 = bitmap.getHeight();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
            this.f40788 = bitmapDrawable;
            Paint paint = bitmapDrawable.getPaint();
            paint.setAntiAlias(false);
            paint.setFilterBitmap(false);
            if (getWidth() == 0) {
                this.f40776 = true;
            } else {
                this.f40763 = m32861();
            }
            m32850();
        } else {
            this.f40779 = 100;
            this.f40775 = 100;
            this.f40788 = null;
        }
        invalidate();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m32850() {
        if (this.f40788 == null) {
            return;
        }
        float max = Math.max(getWidth() / (this.f40775 + 2.0f), getHeight() / (this.f40779 + 2.0f));
        this.f40765 = max;
        if (max < 16.0f) {
            this.f40765 = 16.0f;
        }
        float min = Math.min(getWidth(), getHeight()) / 5;
        float min2 = Math.min(min / (this.f40775 + 2.0f), min / (this.f40779 + 2.0f));
        this.f40764 = min2;
        if (min2 > 0.3f) {
            this.f40764 = 0.3f;
        }
        float f = this.f40763;
        float f2 = this.f40765;
        if (f > f2) {
            this.f40763 = f2;
            return;
        }
        float f3 = this.f40764;
        if (f < f3) {
            this.f40763 = f3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public float m32861() {
        float min = Math.min((getWidth() - (this.f40780 * 6)) / (this.f40775 + 2.0f), (getHeight() - (this.f40780 * 6)) / (this.f40779 + 2.0f));
        if (min > 16.0f) {
            return 16.0f;
        }
        return min;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f40776) {
            this.f40776 = false;
            this.f40763 = m32861();
        }
        m32850();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int m9441;
        C12965 c12965;
        C12965 c129652;
        C12965 c129653;
        C12965 c129654;
        int i;
        float f;
        float x;
        if (this.f40788 != null) {
            C12965 c129655 = this.f40786;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f40750 = 0;
                this.f40767 = false;
                this.f40753 = false;
                if (c129655 != null) {
                    C3088 c3088 = new C3088(this.f40763, this.f40784);
                    if (c129655.f38868) {
                        m9441 = c3088.m9441(c129655, (motionEvent.getY() + getScrollY()) - ((getHeight() - ((int) ((this.f40779 * this.f40763) + 0.5f))) / 2.0f));
                    } else {
                        m9441 = c3088.m9441(c129655, (motionEvent.getX() + getScrollX()) - ((getWidth() - ((int) ((this.f40775 * this.f40763) + 0.5f))) / 2.0f));
                    }
                    if (m9441 != 0) {
                        this.f40762 = motionEvent.getX();
                        this.f40752 = motionEvent.getY();
                        this.f40753 = true;
                        this.f40783 = true;
                        this.f40777 = m9441 == -1;
                        this.f40787 = false;
                    }
                }
            } else if (actionMasked != 2) {
                if (actionMasked == 5) {
                    this.f40753 = false;
                    this.f40750++;
                    if (!this.f40767) {
                        this.f40756 = m32838(motionEvent);
                        this.f40781 = this.f40763;
                        this.f40767 = true;
                        this.f40787 = false;
                        this.f40762 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                        this.f40752 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                        return true;
                    }
                } else if (actionMasked == 6) {
                    this.f40750--;
                    return true;
                }
            } else {
                if (this.f40750 == 1 && this.f40767) {
                    float m32838 = m32838(motionEvent);
                    if (!this.f40787) {
                        if (Math.abs(m32838 - this.f40756) > this.f40758) {
                            this.f40787 = true;
                            this.f40778.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        }
                    }
                    int width = getWidth() / 2;
                    int height = getHeight() / 2;
                    float f2 = width;
                    float scrollX = ((this.f40762 + getScrollX()) - f2) / this.f40763;
                    float f3 = height;
                    float scrollY = ((this.f40752 + getScrollY()) - f3) / this.f40763;
                    float f4 = (this.f40781 * m32838) / this.f40756;
                    this.f40763 = f4;
                    float f5 = this.f40765;
                    if (f4 > f5) {
                        this.f40763 = f5;
                    } else {
                        float f6 = this.f40764;
                        if (f4 < f6) {
                            this.f40763 = f6;
                        }
                    }
                    float f7 = this.f40763;
                    scrollTo((int) (((scrollX * f7) - this.f40762) + f2), (int) (((scrollY * f7) - this.f40752) + f3));
                    invalidate();
                    return true;
                }
                if (c129655 != null) {
                    boolean z = c129655.f38868;
                    if (this.f40753) {
                        if (!this.f40787) {
                            int x2 = ((int) this.f40762) - ((int) motionEvent.getX());
                            int y = ((int) this.f40752) - ((int) motionEvent.getY());
                            int i2 = (y * y) + (x2 * x2);
                            int i3 = this.f40758;
                            if (i2 > i3 * i3) {
                                m32837();
                                this.f40787 = true;
                                this.f40778.m3331(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                if (this.f40777) {
                                    this.f40766 = c129655.f14318;
                                    this.f40769 = 0;
                                    this.f40760 = this.f40768 == 0 ? c129655.f14317 : c129655.f14317 - 1;
                                } else {
                                    this.f40766 = c129655.f14317;
                                    this.f40769 = this.f40768 == 0 ? c129655.f14318 : c129655.f14318 + 1;
                                    this.f40760 = z ? this.f40779 : this.f40775;
                                }
                            }
                        } else {
                            if (z) {
                                f = this.f40752;
                                x = motionEvent.getY();
                            } else {
                                f = this.f40762;
                                x = motionEvent.getX();
                            }
                            int i4 = this.f40766 - ((int) ((f - x) / this.f40763));
                            int i5 = this.f40760;
                            if (i4 > i5 || i4 < (i5 = this.f40769)) {
                                i4 = i5;
                            }
                            if (this.f40777) {
                                c129655.f14318 = i4;
                            } else {
                                c129655.f14317 = i4;
                            }
                            if (c129655.f14318 == c129655.f14317) {
                                if (this.f40783) {
                                    this.f40783 = false;
                                    performHapticFeedback(0);
                                }
                            } else if (!this.f40783) {
                                this.f40783 = true;
                            }
                            InterfaceC10144 interfaceC10144 = this.f40761;
                            if (interfaceC10144 != null) {
                                interfaceC10144.mo6278(c129655);
                            }
                            invalidate();
                        }
                    }
                }
            }
            if ((!this.f40767 && !this.f40753) || !this.f40787) {
                this.f40778.m3331(motionEvent);
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 1 || actionMasked2 == 3) {
                if (this.f40753 && c129655 != null) {
                    boolean z2 = c129655.f38868;
                    if (this.f40787) {
                        int i6 = this.f40768;
                        if (i6 == 0) {
                            int i7 = c129655.f14318;
                            int i8 = c129655.f14317;
                            ArrayList arrayList = this.f40773;
                            ArrayList arrayList2 = this.f40771;
                            if (i7 == i8) {
                                if (z2) {
                                    arrayList2.remove(c129655);
                                } else {
                                    arrayList.remove(c129655);
                                }
                                invalidate();
                                m32842((C4499) null);
                            } else {
                                if (z2) {
                                    arrayList = arrayList2;
                                }
                                Iterator it = arrayList.iterator();
                                boolean z3 = false;
                                while (it.hasNext()) {
                                    C12965 c129656 = (C12965) it.next();
                                    if (c129656 != c129655) {
                                        int i9 = c129655.f14318;
                                        int i10 = c129656.f14318;
                                        if (i9 <= i10 && i10 <= (i = c129655.f14317)) {
                                            c129655.f14317 = Math.max(i, c129656.f14317);
                                            it.remove();
                                        } else {
                                            int i11 = c129656.f14317;
                                            if (i9 <= i11 && i11 <= c129655.f14317) {
                                                c129655.f14318 = i10;
                                                it.remove();
                                            }
                                        }
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    invalidate();
                                    m32842(c129655);
                                }
                            }
                        } else if (i6 == 1) {
                            C12965 c129657 = this.f40772;
                            if (c129655 == c129657 && (c129654 = this.f40790) != null) {
                                int i12 = c129654.f14318;
                                int i13 = c129657.f14318;
                                if (i12 > i13) {
                                    c129654.f14318 = i13;
                                }
                                int i14 = c129654.f14317;
                                int i15 = c129657.f14317;
                                if (i14 < i15) {
                                    c129654.f14317 = i15;
                                }
                                invalidate();
                            } else {
                                C12965 c129658 = this.f40770;
                                if (c129655 == c129658 && (c129653 = this.f40774) != null) {
                                    int i16 = c129653.f14318;
                                    int i17 = c129658.f14318;
                                    if (i16 > i17) {
                                        c129653.f14318 = i17;
                                    }
                                    int i18 = c129653.f14317;
                                    int i19 = c129658.f14317;
                                    if (i18 < i19) {
                                        c129653.f14317 = i19;
                                    }
                                    invalidate();
                                }
                            }
                        } else if (i6 == 2) {
                            C12965 c129659 = this.f40790;
                            if (c129655 == c129659 && (c129652 = this.f40772) != null) {
                                int i20 = c129659.f14318;
                                int i21 = c129652.f14317;
                                if (i20 >= i21) {
                                    c129652.f14318 = i20;
                                    c129652.f14317 = i20 + 1;
                                } else {
                                    int i22 = c129659.f14317;
                                    int i23 = c129652.f14318;
                                    if (i22 <= i23) {
                                        c129652.f14317 = i22;
                                        c129652.f14318 = i22 - 1;
                                    } else {
                                        if (i20 > i23) {
                                            c129652.f14318 = i20;
                                        }
                                        if (i22 < i21) {
                                            c129652.f14317 = i22;
                                        }
                                    }
                                }
                                invalidate();
                            } else {
                                C12965 c1296510 = this.f40774;
                                if (c129655 == c1296510 && (c12965 = this.f40770) != null) {
                                    int i24 = c1296510.f14318;
                                    int i25 = c12965.f14317;
                                    if (i24 >= i25) {
                                        c12965.f14318 = i24;
                                        c12965.f14317 = i24 + 1;
                                    } else {
                                        int i26 = c1296510.f14317;
                                        int i27 = c12965.f14318;
                                        if (i26 <= i27) {
                                            c12965.f14317 = i26;
                                            c12965.f14318 = i26 - 1;
                                        } else {
                                            if (i24 > i27) {
                                                c12965.f14318 = i24;
                                            }
                                            if (i26 < i25) {
                                                c12965.f14317 = i26;
                                            }
                                        }
                                    }
                                    invalidate();
                                }
                            }
                        }
                        m32860();
                    }
                }
                this.f40750 = 0;
                this.f40767 = false;
                this.f40753 = false;
                return true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C1539 c1539;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C1539 c15392;
        int i12;
        int[] iArr;
        int i13;
        C20022 c20022;
        int i14;
        int i15;
        C1539 c15393;
        int i16;
        int i17;
        int i18;
        int width = getWidth();
        int height = getHeight();
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int i19 = scrollX + width;
        int i20 = scrollY + height;
        float f = this.f40763;
        int i21 = (int) ((this.f40775 * f) + 0.5f);
        int i22 = (int) ((this.f40779 * f) + 0.5f);
        int max = Math.max((int) (0.5f + f), 1);
        int i23 = (width / 2) - (i21 / 2);
        int i24 = (height / 2) - (i22 / 2);
        int i25 = i23 + i21;
        int i26 = i24 + i22;
        C20022 c200222 = this.f40757;
        canvas.drawColor(c200222.f64841);
        int i27 = this.f40780;
        int i28 = ((i21 + max) + max) / i27;
        int i29 = ((i22 + max) + max) / i27;
        int[] iArr2 = c200222.f64842;
        C20022 c200223 = c200222;
        int i30 = 0;
        while (true) {
            c1539 = this.f40782;
            if (i30 > i28) {
                break;
            }
            int i31 = i23;
            int i32 = (i30 * i27) + (i23 - max);
            int i33 = i28;
            int i34 = i25;
            int min = Math.min(i25 + max, i32 + i27);
            if (min > scrollX && i32 < i19) {
                int i35 = 0;
                while (i35 <= i29) {
                    int i36 = i29;
                    int i37 = (i35 * i27) + (i24 - max);
                    int i38 = i19;
                    int i39 = i26;
                    int min2 = Math.min(i26 + max, i37 + i27);
                    if (min2 <= scrollY || i37 >= i20) {
                        i12 = i27;
                        iArr = iArr2;
                        i13 = i32;
                        c20022 = c200223;
                        i14 = i34;
                        i15 = i39;
                        c15393 = c1539;
                        i16 = min;
                        i17 = i33;
                        i18 = i35;
                    } else {
                        c1539.setColor(iArr2[(i30 + i35) % 2]);
                        iArr = iArr2;
                        i12 = i27;
                        i13 = i32;
                        c20022 = c200223;
                        c15393 = c1539;
                        int i40 = i33;
                        i18 = i35;
                        i15 = i39;
                        i17 = i40;
                        i14 = i34;
                        i16 = min;
                        canvas.drawRect(i32, i37, min, min2, c15393);
                    }
                    i35 = i18 + 1;
                    i26 = i15;
                    c1539 = c15393;
                    min = i16;
                    i33 = i17;
                    i29 = i36;
                    iArr2 = iArr;
                    i27 = i12;
                    i34 = i14;
                    c200223 = c20022;
                    i19 = i38;
                    i32 = i13;
                }
            }
            i30++;
            i25 = i34;
            i26 = i26;
            c200223 = c200223;
            i23 = i31;
            i19 = i19;
            i28 = i33;
            i29 = i29;
            iArr2 = iArr2;
            i27 = i27;
        }
        int i41 = i26;
        int i42 = i19;
        int i43 = i23;
        C20022 c200224 = c200223;
        C1539 c15394 = c1539;
        int i44 = i25;
        BitmapDrawable bitmapDrawable = this.f40788;
        if (bitmapDrawable != null) {
            i = i43;
            bitmapDrawable.setBounds(i, i24, i44, i41);
            bitmapDrawable.draw(canvas);
        } else {
            i = i43;
        }
        int i45 = c200224.f64846;
        int i46 = c200224.f64845;
        int i47 = c200224.f64843;
        int i48 = this.f40768;
        boolean z = i48 == 0;
        boolean z2 = i48 == 1;
        boolean z3 = i48 == 2;
        boolean z4 = this.f40791;
        C12965 c12965 = this.f40786;
        Iterator it = this.f40773.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            boolean z5 = z4;
            float f2 = i;
            int i49 = i47;
            float f3 = (c4499.f14318 * f) + f2;
            float f4 = (c4499.f14317 * f) + f2;
            C1539 c15395 = c15394;
            c15395.setColor(-16777216);
            C20022 c200225 = c200224;
            float f5 = i24;
            int i50 = scrollX;
            C12965 c129652 = c12965;
            int i51 = i44;
            int i52 = i46;
            int i53 = i;
            int i54 = i45;
            canvas.drawRect(f3, i24 - max, f4, f5, c15395);
            if (z && z5) {
                c15395.setColor(i54);
                c15392 = c15395;
                canvas.drawRect(f3, f5, f4, i41, c15395);
                c15392.setColor(c129652 == c4499 ? i49 : i52);
                float f6 = scrollY;
                float f7 = i20;
                canvas.drawRect(f3, f6, f3 + 1.0f, f7, c15392);
                canvas.drawRect(f4 - 1.0f, f6, f4, f7, c15392);
            } else {
                c15392 = c15395;
            }
            i45 = i54;
            i44 = i51;
            z4 = z5;
            i47 = i49;
            i46 = i52;
            i = i53;
            c12965 = c129652;
            scrollX = i50;
            c15394 = c15392;
            c200224 = c200225;
        }
        boolean z6 = z4;
        int i55 = i47;
        int i56 = i46;
        int i57 = i;
        int i58 = scrollX;
        C12965 c129653 = c12965;
        int i59 = i45;
        int i60 = i44;
        C1539 c15396 = c15394;
        C20022 c200226 = c200224;
        Iterator it2 = this.f40771.iterator();
        while (it2.hasNext()) {
            C4499 c44992 = (C4499) it2.next();
            float f8 = i24;
            float f9 = (c44992.f14318 * f) + f8;
            float f10 = (c44992.f14317 * f) + f8;
            c15396.setColor(-16777216);
            float f11 = i57 - max;
            int i61 = i57;
            float f12 = i61;
            Iterator it3 = it2;
            int i62 = i20;
            canvas.drawRect(f11, f9, f12, f10, c15396);
            if (z && z6) {
                c15396.setColor(i59);
                int i63 = i60;
                i10 = scrollY;
                i11 = i63;
                canvas.drawRect(f12, f9, i63, f10, c15396);
                c15396.setColor(c129653 == c44992 ? i55 : i56);
                i9 = i58;
                float f13 = i9;
                int i64 = i42;
                float f14 = i64;
                i8 = i64;
                canvas.drawRect(f13, f9, f14, f9 + 1.0f, c15396);
                canvas.drawRect(f13, f10 - 1.0f, f14, f10, c15396);
            } else {
                i8 = i42;
                i9 = i58;
                int i65 = i60;
                i10 = scrollY;
                i11 = i65;
            }
            i58 = i9;
            i20 = i62;
            i42 = i8;
            i57 = i61;
            it2 = it3;
            int i66 = i10;
            i60 = i11;
            scrollY = i66;
        }
        int i67 = i42;
        int i68 = i57;
        int i69 = i20;
        int i70 = i58;
        int i71 = i60;
        int i72 = scrollY;
        boolean z7 = !z2;
        int i73 = 0;
        while (i73 < 2) {
            if (z7) {
                if (this.f40772 != null) {
                    float f15 = i68;
                    float f16 = (r1.f14318 * f) + f15;
                    float f17 = f15 + (r1.f14317 * f);
                    float f18 = i24;
                    C12965 c129654 = this.f40770;
                    float f19 = (c129654.f14318 * f) + f18;
                    float f20 = (c129654.f14317 * f) + f18;
                    c15396.setColor(-16777216);
                    i2 = i73;
                    canvas.drawRect(f16, i41, f17, i41 + max, c15396);
                    canvas.drawRect(i71, f19, i71 + max, f20, c15396);
                    if (z2 && z6) {
                        c15396.setColor(i59);
                        canvas.drawRect(f16, f19, f17, f20, c15396);
                        c15396.setColor(c129653 == this.f40772 ? i55 : i56);
                        int i74 = i72;
                        float f21 = i74;
                        float f22 = f16 + 1.0f;
                        int i75 = i69;
                        float f23 = i75;
                        i3 = i59;
                        i69 = i75;
                        i4 = i74;
                        canvas.drawRect(f16, f21, f22, f23, c15396);
                        canvas.drawRect(f17 - 1.0f, f21, f17, f23, c15396);
                        c15396.setColor(c129653 == this.f40770 ? i55 : i56);
                        float f24 = i70;
                        int i76 = i67;
                        float f25 = i76;
                        i5 = i76;
                        canvas.drawRect(f24, f19, f25, f19 + 1.0f, c15396);
                        canvas.drawRect(f24, f20 - 1.0f, f25, f20, c15396);
                    } else {
                        i3 = i59;
                        i4 = i72;
                        i5 = i67;
                    }
                    i6 = i69;
                    i7 = i5;
                    z7 = !z7;
                    i73 = i2 + 1;
                    i72 = i4;
                    i59 = i3;
                    i67 = i7;
                    i69 = i6;
                } else {
                    i2 = i73;
                    i3 = i59;
                    i4 = i72;
                    i6 = i69;
                    i7 = i67;
                    z7 = !z7;
                    i73 = i2 + 1;
                    i72 = i4;
                    i59 = i3;
                    i67 = i7;
                    i69 = i6;
                }
            } else {
                i2 = i73;
                i3 = i59;
                i4 = i72;
                i5 = i67;
                if (this.f40790 != null) {
                    float f26 = i68;
                    float f27 = (r1.f14318 * f) + f26;
                    float f28 = (r1.f14317 * f) + f26;
                    float f29 = i24;
                    C12965 c129655 = this.f40774;
                    float f30 = (c129655.f14318 * f) + f29;
                    float f31 = (c129655.f14317 * f) + f29;
                    c15396.setColor(-65536);
                    float f32 = i41;
                    float f33 = i41 + max;
                    canvas.drawRect(f26, f32, f27, f33, c15396);
                    float f34 = i71;
                    canvas.drawRect(f28, f32, f34, f33, c15396);
                    float f35 = i71 + max;
                    canvas.drawRect(f34, f29, f35, f30, c15396);
                    canvas.drawRect(f34, f31, f35, f32, c15396);
                    if (z3 && z6) {
                        c15396.setColor(c200226.f64844);
                        canvas.drawRect(f26, f29, f34, f30, c15396);
                        canvas.drawRect(f26, f31, f34, f32, c15396);
                        canvas.drawRect(f26, f30, f27, f31, c15396);
                        canvas.drawRect(f28, f30, f34, f31, c15396);
                        c15396.setColor(c129653 == this.f40790 ? i55 : i56);
                        float f36 = i4;
                        int i77 = i69;
                        float f37 = i77;
                        i6 = i77;
                        canvas.drawRect(f27, f36, f27 + 1.0f, f37, c15396);
                        canvas.drawRect(f28 - 1.0f, f36, f28, f37, c15396);
                        c15396.setColor(c129653 == this.f40774 ? i55 : i56);
                        float f38 = i70;
                        float f39 = i5;
                        float f40 = f30 + 1.0f;
                        i7 = i5;
                        canvas.drawRect(f38, f30, f39, f40, c15396);
                        canvas.drawRect(f38, f31 - 1.0f, f39, f31, c15396);
                        z7 = !z7;
                        i73 = i2 + 1;
                        i72 = i4;
                        i59 = i3;
                        i67 = i7;
                        i69 = i6;
                    }
                }
                i6 = i69;
                i7 = i5;
                z7 = !z7;
                i73 = i2 + 1;
                i72 = i4;
                i59 = i3;
                i67 = i7;
                i69 = i6;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m32838(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y * y) + (x * x));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32869(InterfaceC10144 interfaceC10144) {
        this.f40761 = interfaceC10144;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m32842(C4499 c4499) {
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6281(c4499);
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m32848() {
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6280(!this.f40755.isEmpty(), !this.f40759.isEmpty());
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m32882() {
        return this.f40768;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32865(int i) {
        this.f40768 = i;
        this.f40791 = true;
        this.f40786 = null;
        m32842((C4499) null);
        invalidate();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m32884() {
        return this.f40791;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32880(boolean z) {
        this.f40791 = z;
        invalidate();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m32881() {
        return !this.f40755.isEmpty();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m32877() {
        return !this.f40759.isEmpty();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m32879() {
        Stack stack = this.f40755;
        if (stack.isEmpty()) {
            return;
        }
        C15633 c15633 = (C15633) stack.pop();
        m32843(c15633.f48130);
        this.f40759.push(c15633);
        m32848();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m32874() {
        Stack stack = this.f40759;
        if (stack.isEmpty()) {
            return;
        }
        C15633 c15633 = (C15633) stack.pop();
        m32843(c15633.f48129);
        this.f40755.push(c15633);
        m32848();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private C8579 m32849() {
        C8579 c8579 = new C8579();
        c8579.f26208 = this.f40768;
        c8579.f26202 = this.f40754;
        ArrayList arrayList = this.f40773;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c8579.f26201.add(((C12965) it.next()).clone());
        }
        ArrayList arrayList2 = this.f40771;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c8579.f26207.add(((C12965) it2.next()).clone());
        }
        C12965 c12965 = this.f40772;
        c8579.f26204 = c12965 == null ? null : c12965.clone();
        C12965 c129652 = this.f40770;
        c8579.f26206 = c129652 == null ? null : c129652.clone();
        C12965 c129653 = this.f40790;
        c8579.f26205 = c129653 == null ? null : c129653.clone();
        C12965 c129654 = this.f40774;
        c8579.f26203 = c129654 != null ? c129654.clone() : null;
        C12965 c129655 = this.f40786;
        if (c129655 != null) {
            int i = this.f40768;
            if (i == 0) {
                int indexOf = arrayList.indexOf(c129655);
                if (indexOf == -1 && (indexOf = arrayList2.indexOf(this.f40786)) != -1) {
                    indexOf += arrayList.size();
                }
                c8579.f26200 = indexOf;
            } else {
                if (i == 1) {
                    if (c129655 == this.f40772) {
                        c8579.f26200 = 0;
                        return c8579;
                    }
                    if (c129655 == this.f40770) {
                        c8579.f26200 = 1;
                        return c8579;
                    }
                    c8579.f26200 = -1;
                    return c8579;
                }
                if (i == 2) {
                    if (c129655 == this.f40790) {
                        c8579.f26200 = 0;
                        return c8579;
                    }
                    if (c129655 == this.f40774) {
                        c8579.f26200 = 1;
                        return c8579;
                    }
                    c8579.f26200 = -1;
                    return c8579;
                }
            }
        }
        return c8579;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32843(C8579 c8579) {
        ArrayList arrayList = this.f40773;
        arrayList.clear();
        ArrayList arrayList2 = this.f40771;
        arrayList2.clear();
        Iterator it = c8579.f26201.iterator();
        while (it.hasNext()) {
            arrayList.add(((C12965) it.next()).clone());
        }
        Iterator it2 = c8579.f26207.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C12965) it2.next()).clone());
        }
        C12965 c12965 = c8579.f26204;
        this.f40772 = c12965 == null ? null : c12965.clone();
        C12965 c129652 = c8579.f26206;
        this.f40770 = c129652 == null ? null : c129652.clone();
        C12965 c129653 = c8579.f26205;
        this.f40790 = c129653 == null ? null : c129653.clone();
        C12965 c129654 = c8579.f26203;
        C12965 clone = c129654 == null ? null : c129654.clone();
        this.f40774 = clone;
        int i = c8579.f26200;
        if (i == -1) {
            this.f40786 = null;
        } else {
            int i2 = c8579.f26208;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (i == 0) {
                            this.f40786 = this.f40790;
                        } else if (i == 1) {
                            this.f40786 = clone;
                        } else {
                            this.f40786 = null;
                        }
                    }
                } else if (i == 0) {
                    this.f40786 = this.f40772;
                } else if (i == 1) {
                    this.f40786 = this.f40770;
                } else {
                    this.f40786 = null;
                }
            } else if (i < arrayList.size()) {
                this.f40786 = (C12965) arrayList.get(i);
            } else {
                int size = i - arrayList.size();
                if (size < arrayList2.size()) {
                    this.f40786 = (C12965) arrayList2.get(size);
                } else {
                    this.f40786 = null;
                }
            }
        }
        int i3 = c8579.f26208;
        if (i3 != this.f40768) {
            this.f40768 = i3;
            InterfaceC10144 interfaceC10144 = this.f40761;
            if (interfaceC10144 != null) {
                interfaceC10144.mo6277(i3);
            }
        }
        int i4 = c8579.f26202;
        if (i4 != this.f40754) {
            this.f40754 = i4;
            InterfaceC10144 interfaceC101442 = this.f40761;
            if (interfaceC101442 != null) {
                interfaceC101442.mo6279(m32872());
            }
        }
        m32842(this.f40786);
        this.f40791 = true;
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32868(C10130 c10130) {
        c10130.writeInt(1901228945);
        c10130.writeInt(this.f40785);
        c10130.writeInt(this.f40751);
        m32849().m22287(c10130);
        Stack stack = this.f40755;
        c10130.mo13231(stack.size());
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            C15633 c15633 = (C15633) it.next();
            c15633.f48130.m22287(c10130);
            c15633.f48129.m22287(c10130);
        }
        Stack stack2 = this.f40759;
        c10130.mo13231(stack2.size());
        Iterator it2 = stack2.iterator();
        while (it2.hasNext()) {
            C15633 c156332 = (C15633) it2.next();
            c156332.f48130.m22287(c10130);
            c156332.f48129.m22287(c10130);
        }
        c10130.writeInt(1901228945);
        c10130.writeInt(getScrollX());
        c10130.writeInt(getScrollY());
        c10130.m25419(this.f40763);
        c10130.m25425(this.f40791);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32870(C12951 c12951) {
        try {
            C22124.m49722((InterfaceC20008) c12951, 1901228945);
            this.f40785 = c12951.readInt();
            this.f40751 = c12951.readInt();
            C8579 c8579 = new C8579();
            c8579.m22288(c12951);
            m32843(c8579);
            int m31494 = c12951.m31494();
            Stack stack = this.f40755;
            stack.clear();
            for (int i = 0; i < m31494; i++) {
                C15633 c15633 = new C15633();
                C8579 c85792 = new C8579();
                c85792.m22288(c12951);
                c15633.f48130 = c85792;
                C8579 c85793 = new C8579();
                c85793.m22288(c12951);
                c15633.f48129 = c85793;
                stack.add(c15633);
            }
            int m314942 = c12951.m31494();
            Stack stack2 = this.f40759;
            stack2.clear();
            for (int i2 = 0; i2 < m314942; i2++) {
                C15633 c156332 = new C15633();
                C8579 c85794 = new C8579();
                c85794.m22288(c12951);
                c156332.f48130 = c85794;
                C8579 c85795 = new C8579();
                c85795.m22288(c12951);
                c156332.f48129 = c85795;
                stack2.add(c156332);
            }
            m32848();
            try {
                C22124.m49722((InterfaceC20008) c12951, 1901228945);
                scrollTo(c12951.readInt(), c12951.readInt());
                this.f40763 = c12951.m31495();
                this.f40776 = false;
                this.f40791 = c12951.m31498();
                invalidate();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m32837() {
        C15633 c15633 = new C15633();
        this.f40789 = c15633;
        c15633.f48130 = m32849();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m32860() {
        int i = this.f40785 + 1;
        this.f40785 = i;
        this.f40754 = i;
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6279(m32872());
        }
        C15633 c15633 = this.f40789;
        if (c15633 != null) {
            c15633.f48129 = m32849();
            this.f40755.push(this.f40789);
            this.f40759.clear();
            this.f40789 = null;
            m32848();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m32872() {
        return this.f40751 != this.f40754;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32876(boolean z) {
        int i;
        if (z) {
            int i2 = this.f40785 + 1;
            this.f40785 = i2;
            i = -i2;
        } else {
            i = this.f40754;
        }
        this.f40751 = i;
        InterfaceC10144 interfaceC10144 = this.f40761;
        if (interfaceC10144 != null) {
            interfaceC10144.mo6279(m32872());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32866(String str) {
        C16339 m41572 = C17751.m41572(this.f40775, this.f40779, str);
        C12965 c12965 = this.f40772;
        C12965 c129652 = this.f40770;
        C12965 c129653 = this.f40790;
        C12965 c129654 = this.f40774;
        int i = this.f40775;
        int i2 = this.f40779;
        ArrayList arrayList = this.f40773;
        ArrayList arrayList2 = this.f40771;
        if (new C16339(arrayList, arrayList2, c12965, c129652, c129653, c129654, i, i2).m38482(m41572)) {
            return;
        }
        m32837();
        arrayList.clear();
        Iterator it = m41572.f50302.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            arrayList.add(new C12965(c4499.f14318, c4499.f14317, false));
        }
        arrayList2.clear();
        Iterator it2 = m41572.f50300.iterator();
        while (it2.hasNext()) {
            C4499 c44992 = (C4499) it2.next();
            arrayList2.add(new C12965(c44992.f14318, c44992.f14317, true));
        }
        C4499 c44993 = m41572.f50298;
        if (c44993 == null) {
            this.f40770 = null;
            this.f40772 = null;
        } else {
            this.f40772 = new C12965(c44993.f14318, c44993.f14317, false);
            C4499 c44994 = m41572.f50299;
            this.f40770 = new C12965(c44994.f14318, c44994.f14317, true);
        }
        C4499 c44995 = m41572.f50301;
        this.f40790 = new C12965(c44995.f14318, c44995.f14317, false);
        C4499 c44996 = m41572.f50303;
        this.f40774 = new C12965(c44996.f14318, c44996.f14317, true);
        this.f40786 = null;
        this.f40791 = true;
        m32860();
        m32842((C4499) null);
        invalidate();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m32878() {
        return C17751.m41568(new C16339(this.f40773, this.f40771, this.f40772, this.f40770, this.f40790, this.f40774, this.f40775, this.f40779), this.f40775, this.f40779);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m32885() {
        return this.f40772 != null;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m32873() {
        m32837();
        this.f40770 = null;
        this.f40772 = null;
        m32860();
        invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32864() {
        if (m32885()) {
            return;
        }
        m32837();
        C12965 c12965 = this.f40790;
        this.f40772 = c12965 != null ? c12965.clone() : new C12965(0, this.f40775, false);
        C12965 c129652 = this.f40774;
        this.f40770 = c129652 != null ? c129652.clone() : new C12965(0, this.f40779, true);
        m32860();
        invalidate();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32875(C9285 c9285) {
        C12260 c12260 = new C12260();
        ArrayList arrayList = this.f40773;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C12965 c12965 = (C12965) it.next();
            c12260.f36520.add(new C4499(c12965.f14318, c12965.f14317));
        }
        ArrayList arrayList2 = this.f40771;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C12965 c129652 = (C12965) it2.next();
            c12260.f36521.add(new C4499(c129652.f14318, c129652.f14317));
        }
        C12965 c129653 = this.f40772;
        if (c129653 != null) {
            Rect rect = c12260.f36519;
            rect.left = c129653.f14318;
            rect.right = this.f40775 - c129653.f14317;
            C12965 c129654 = this.f40770;
            rect.top = c129654.f14318;
            rect.bottom = this.f40779 - c129654.f14317;
        } else {
            c12260.f36519.set(C12260.m29753(arrayList, arrayList2, this.f40775, this.f40779));
        }
        c9285.m23820(c12260);
        if (this.f40790 != null) {
            C17045 c17045 = new C17045();
            C12965 c129655 = this.f40790;
            c17045.f52234 = c129655.f14318;
            c17045.f52235 = this.f40775 - c129655.f14317;
            C12965 c129656 = this.f40774;
            c17045.f52236 = c129656.f14318;
            c17045.f52233 = this.f40779 - c129656.f14317;
            c9285.m23821(c17045);
            return;
        }
        c9285.m23821((C17045) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32871(boolean z) {
        ArrayList arrayList = z ? this.f40771 : this.f40773;
        C12965 c12965 = new C12965(z);
        int i = z ? this.f40779 : this.f40775;
        int i2 = 0;
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                C12965 c129652 = (C12965) arrayList.get(0);
                int i3 = c129652.f14318;
                int i4 = c129652.f14317;
                if (i3 >= i - i4) {
                    i = i3 - 1;
                } else {
                    i2 = i4 + 1;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C12965 c129653 = (C12965) arrayList.get(i5);
                    if (i5 == 0) {
                        arrayList2.add(new C22843(0, c129653.f14318 - 1));
                    } else if (i5 == size - 1) {
                        arrayList2.add(new C22843(c129653.f14317 + 1, i));
                    } else {
                        arrayList2.add(new C22843(((C12965) arrayList.get(i5 - 1)).f14317 + 1, c129653.f14318 - 1));
                    }
                }
                Collections.sort(arrayList2);
                C22843 c22843 = (C22843) arrayList2.get(0);
                i2 = c22843.f73726;
                i = c22843.f73725;
            }
        }
        int i6 = i - i2;
        if (i6 <= 0) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206f4);
            return;
        }
        int i7 = (int) (getContext().getResources().getDisplayMetrics().density * 16.0f);
        if (i6 > i7) {
            int i8 = (i6 - i7) / 2;
            i -= i8;
            i2 += i8;
        }
        c12965.f14318 = i2;
        c12965.f14317 = i;
        m32837();
        arrayList.add(c12965);
        Collections.sort(arrayList);
        m32860();
        invalidate();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32883() {
        Stack stack = this.f40755;
        boolean isEmpty = stack.isEmpty();
        Stack stack2 = this.f40759;
        if (isEmpty && stack2.isEmpty()) {
            return;
        }
        stack.clear();
        stack2.clear();
        m32848();
    }
}
