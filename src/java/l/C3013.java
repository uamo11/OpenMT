package l;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

/* compiled from: L9CC */
/* renamed from: l.ۗۙܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3013 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Interpolator f9489;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Size f9490;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HandlerC7952 f9491;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public EnumC12890 f9494;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f9495;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f9496;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AnimationSet f9497;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f9498;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C19947 f9499;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public int f9501;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final PopupWindow f9502;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final int f9503;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9504;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public EnumC12890 f9505;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Interpolator f9506;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Size f9508;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f9509;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Size f9511;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ImageButton f9512;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Drawable f9513;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f9514;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f9516;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f9517;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f9518;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public C6290 f9519;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AnimationSet f9520;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9521;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ContextThemeWrapper f9522;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AnimatedVectorDrawable f9523;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f9524;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f9526;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Interpolator f9527;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MenuItemOnMenuItemClickListenerC10524 f9528;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Interpolator f9529;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C4424 f9533;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AnimatorSet f9534;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final Rect f9530 = new Rect();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Point f9515 = new Point();

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final int[] f9525 = new int[2];

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final Region f9535 = new Region();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f9493 = C8192.m21695(new C16418(this));

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final Runnable f9492 = new RunnableC8658(this);

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f9500 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f9532 = new LinkedHashMap();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View.OnClickListener f9531 = new ViewOnClickListenerC15712(this);

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final Rect f9510 = new Rect();

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public boolean f9507 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9200(C3013 c3013, C5370 c5370) {
        c5370.m15343().setEmpty();
        c5370.m15345().setEmpty();
        c5370.m15344().set(c3013.f9535);
        c5370.m15346();
    }

    public C3013(Context context, View view) {
        boolean z;
        EnumC12890 enumC12890 = EnumC12890.PREFER_SHOW_ALL;
        this.f9505 = enumC12890;
        this.f9494 = enumC12890;
        HandlerC7952 handlerC7952 = new HandlerC7952(this);
        this.f9491 = handlerC7952;
        this.f9514 = view;
        if (Build.VERSION.SDK_INT >= 29) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.isLightTheme});
            z = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            z = true;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, z ? R.style.Theme.DeviceDefault.Light : R.style.Theme.DeviceDefault);
        this.f9522 = contextThemeWrapper;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d0129, (ViewGroup) null);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setTag("floating_toolbar");
        viewGroup.setContentDescription("floating_toolbar");
        viewGroup.setClipToOutline(true);
        this.f9524 = viewGroup;
        C15006 c15006 = new C15006(viewGroup.getContext(), handlerC7952);
        PopupWindow popupWindow = new PopupWindow(c15006);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        c15006.addView(viewGroup);
        this.f9502 = popupWindow;
        this.f9503 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700bb);
        this.f9517 = view.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700c8);
        this.f9526 = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700ba);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700bc);
        this.f9518 = dimensionPixelSize;
        this.f9489 = new InterpolatorC21358();
        this.f9506 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_slow_in);
        this.f9527 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.linear_out_slow_in);
        this.f9529 = AnimationUtils.loadInterpolator(contextThemeWrapper, R.interpolator.fast_out_linear_in);
        Drawable drawable = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector_res_0x7f0800fe, contextThemeWrapper.getTheme());
        this.f9509 = drawable;
        drawable.setAutoMirrored(true);
        Drawable drawable2 = contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector_res_0x7f0800fc, contextThemeWrapper.getTheme());
        this.f9513 = drawable2;
        drawable2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector_res_0x7f0800fd, contextThemeWrapper.getTheme());
        this.f9523 = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) contextThemeWrapper.getResources().getDrawable(bin.mt.plus.R.drawable.MT_Protector_res_0x7f0800ff, contextThemeWrapper.getTheme());
        this.f9516 = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        final ImageButton imageButton = (ImageButton) LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d012b, (ViewGroup) null);
        imageButton.setImageDrawable(drawable2);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: l.ܿۙܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C3013.m9199(C3013.this, imageButton);
            }
        });
        imageButton.setOnTouchListener(new ViewOnTouchListenerC10775(this));
        this.f9512 = imageButton;
        if (!(imageButton.getParent() == null)) {
            throw new IllegalStateException((String) null);
        }
        imageButton.measure(0, 0);
        this.f9508 = new Size(imageButton.getMeasuredWidth(), imageButton.getMeasuredHeight());
        this.f9498 = new C23474(this, contextThemeWrapper);
        this.f9533 = new C4424(this, contextThemeWrapper, dimensionPixelSize);
        final C19947 c19947 = new C19947(this);
        c19947.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c19947.setDivider(null);
        c19947.setDividerHeight(0);
        c19947.setAdapter((ListAdapter) new C6541(this, contextThemeWrapper));
        c19947.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ᩳۙܿ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                C3013.m9201(C3013.this, c19947, i);
            }
        });
        this.f9499 = c19947;
        AnimationAnimationListenerC9364 animationAnimationListenerC9364 = new AnimationAnimationListenerC9364(this);
        AnimationSet animationSet = new AnimationSet(true);
        this.f9497 = animationSet;
        animationSet.setAnimationListener(animationAnimationListenerC9364);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.f9520 = animationSet2;
        animationSet2.setAnimationListener(animationAnimationListenerC9364);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.f9521 = animatorSet;
        this.f9534 = m9188(viewGroup, 150, new C2308(this));
        this.f9504 = m9188(viewGroup, 0, new C3719(this));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m9233() {
        int i = this.f9526;
        int i2 = this.f9517;
        return i + i2 + i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9196(ArrayList arrayList, MenuItemOnMenuItemClickListenerC10524 menuItemOnMenuItemClickListenerC10524) {
        LinkedHashMap linkedHashMap = this.f9532;
        linkedHashMap.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MenuItem menuItem = (MenuItem) it.next();
            linkedHashMap.put(C22063.m49644(menuItem), menuItem);
        }
        this.f9528 = menuItemOnMenuItemClickListenerC10524;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m9234() {
        this.f9507 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9230(ArrayList arrayList, MenuItemOnMenuItemClickListenerC10524 menuItemOnMenuItemClickListenerC10524, Rect rect) {
        Size size;
        C19947 c19947;
        View view;
        int i;
        this.f9491.m21258();
        Collection values = this.f9532.values();
        int size2 = arrayList.size();
        int size3 = values.size();
        View view2 = this.f9514;
        boolean z = true;
        if (size2 == size3) {
            Iterator it = values.iterator();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    if (!this.f9507) {
                        view = view2;
                        m9196(arrayList, menuItemOnMenuItemClickListenerC10524);
                    }
                } else if (!C22063.m49644((MenuItem) it2.next()).equals(C22063.m49644((MenuItem) it.next()))) {
                    break;
                }
            }
        }
        m9227();
        m9220();
        ViewGroup viewGroup = null;
        this.f9511 = null;
        this.f9490 = null;
        this.f9496 = false;
        ViewGroup viewGroup2 = this.f9498;
        viewGroup2.removeAllViews();
        C19947 c199472 = this.f9499;
        ArrayAdapter arrayAdapter = (ArrayAdapter) c199472.getAdapter();
        arrayAdapter.clear();
        c199472.setAdapter((ListAdapter) arrayAdapter);
        this.f9524.removeAllViews();
        m9196(arrayList, menuItemOnMenuItemClickListenerC10524);
        Rect rect2 = this.f9530;
        view2.getWindowVisibleDisplayFrame(rect2);
        int min = Math.min(view2.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700c6), rect2.width() - (view2.getResources().getDimensionPixelSize(bin.mt.plus.R.dimen.MT_Protector_res_0x7f0700bb) * 2));
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            MenuItem menuItem = (MenuItem) it3.next();
            if (((InterfaceMenuItemC13827) menuItem).mo16461()) {
                linkedList2.add(menuItem);
            } else {
                linkedList.add(menuItem);
            }
        }
        linkedList.addAll(linkedList2);
        viewGroup2.removeAllViews();
        viewGroup2.setPaddingRelative(0, 0, 0, 0);
        boolean z2 = true;
        int i2 = min;
        while (true) {
            boolean isEmpty = linkedList.isEmpty();
            size = this.f9508;
            if (isEmpty) {
                break;
            }
            MenuItem menuItem2 = (MenuItem) linkedList.peek();
            C11003.requireNonNull(menuItem2);
            if (!z2 && ((InterfaceMenuItemC13827) menuItem2).mo16461()) {
                break;
            }
            View inflate = LayoutInflater.from(this.f9522).inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d012a, viewGroup);
            m9194(inflate, menuItem2, this.f9518, z);
            if (z2) {
                c19947 = c199472;
                view = view2;
                inflate.setPaddingRelative((int) (inflate.getPaddingStart() * 1.5d), inflate.getPaddingTop(), inflate.getPaddingEnd(), inflate.getPaddingBottom());
            } else {
                c19947 = c199472;
                view = view2;
            }
            boolean z3 = linkedList.size() == z;
            if (z3) {
                inflate.setPaddingRelative(inflate.getPaddingStart(), inflate.getPaddingTop(), (int) (inflate.getPaddingEnd() * 1.5d), inflate.getPaddingBottom());
            }
            inflate.measure(0, 0);
            int min2 = Math.min(inflate.getMeasuredWidth(), min);
            boolean z4 = min2 <= i2 - size.getWidth();
            boolean z5 = z3 && min2 <= i2;
            if (!z4 && !z5) {
                break;
            }
            inflate.setTag(C22063.m49644(menuItem2));
            inflate.setOnClickListener(this.f9531);
            CharSequence tooltipText = ((InterfaceMenuItemC13827) menuItem2).getTooltipText();
            if (!TextUtils.isEmpty(tooltipText)) {
                C17648.m41327(inflate, tooltipText);
            }
            viewGroup2.addView(inflate);
            inflate.setOnTouchListener(new ViewOnTouchListenerC10775(this));
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.width = min2;
            inflate.setLayoutParams(layoutParams);
            i2 -= min2;
            linkedList.pop();
            viewGroup = null;
            z = true;
            z2 = false;
            view2 = view;
            c199472 = c19947;
        }
        c19947 = c199472;
        view = view2;
        if (linkedList.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            viewGroup2.setPaddingRelative(0, 0, size.getWidth(), 0);
        }
        if (!(viewGroup2.getParent() == null)) {
            throw new IllegalStateException((String) null);
        }
        viewGroup2.measure(i, i);
        this.f9490 = new Size(viewGroup2.getMeasuredWidth(), viewGroup2.getMeasuredHeight());
        if (!linkedList.isEmpty()) {
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) c19947.getAdapter();
            arrayAdapter2.clear();
            int size4 = linkedList.size();
            for (int i3 = 0; i3 < size4; i3++) {
                arrayAdapter2.add((MenuItem) linkedList.get(i3));
            }
            C19947 c199473 = c19947;
            c199473.setAdapter((ListAdapter) arrayAdapter2);
            if (this.f9495) {
                c199473.setY(0.0f);
            } else {
                c199473.setY(size.getHeight());
            }
            int count = c199473.getAdapter().getCount();
            int i4 = 0;
            for (int i5 = 0; i5 < count; i5++) {
                i4 = Math.max(this.f9533.m13145((MenuItem) c199473.getAdapter().getItem(i5)), i4);
            }
            Size size5 = new Size(Math.max(i4, size.getWidth()), m9187(10));
            this.f9511 = size5;
            m9193(c199473, size5);
        }
        m9209();
        boolean z6 = this.f9500;
        Rect rect3 = this.f9510;
        Point point = this.f9515;
        PopupWindow popupWindow = this.f9502;
        if (!z6) {
            if (!rect3.equals(rect)) {
                C11003.requireNonNull(rect);
                if (!this.f9500 && popupWindow.isShowing()) {
                    m9220();
                    m9191(rect);
                    m9225();
                    popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
                }
            }
        } else {
            C11003.requireNonNull(rect);
            if (this.f9500) {
                this.f9500 = false;
                this.f9534.cancel();
                this.f9504.cancel();
                m9220();
                m9191(rect);
                m9225();
                popupWindow.setClippingEnabled(false);
                popupWindow.showAtLocation(view, 0, point.x, point.y);
                ViewTreeObserver viewTreeObserver = popupWindow.getContentView().getRootView().getViewTreeObserver();
                Object obj = this.f9493;
                if (viewTreeObserver != null) {
                    try {
                        viewTreeObserver.getClass().getDeclaredMethod("removeOnComputeInternalInsetsListener", Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener")).invoke(viewTreeObserver, obj);
                    } catch (Exception unused) {
                    }
                }
                if (viewTreeObserver != null) {
                    try {
                        viewTreeObserver.getClass().getDeclaredMethod("addOnComputeInternalInsetsListener", Class.forName("android.view.ViewTreeObserver$OnComputeInternalInsetsListener")).invoke(viewTreeObserver, obj);
                    } catch (Exception unused2) {
                    }
                }
                this.f9521.start();
            }
        }
        this.f9507 = false;
        rect3.set(rect);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9227() {
        if (this.f9500) {
            return;
        }
        this.f9500 = true;
        this.f9504.cancel();
        this.f9491.m21258();
        this.f9534.start();
        C6290 c6290 = this.f9519;
        if (c6290 != null) {
            C19846.forEach((ArrayList) ((C6001) ((InterfaceC23223) c6290.f19454)).f18441, new C15754());
        }
        this.f9535.setEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9229(long j) {
        if (this.f9500) {
            return;
        }
        this.f9491.m21259(j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9197(C3013 c3013, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            c3013.f9491.m21261();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9228(float f) {
        this.f9524.getBackground().setAlpha((int) (f * 255.0f));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9231(C6290 c6290) {
        this.f9519 = c6290;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m9220() {
        this.f9524.clearAnimation();
        this.f9498.animate().cancel();
        this.f9499.animate().cancel();
        this.f9523.stop();
        this.f9516.stop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m9224() {
        ImageButton imageButton = this.f9512;
        imageButton.setEnabled(true);
        C19947 c19947 = this.f9499;
        c19947.awakenScrollBars();
        boolean z = this.f9496;
        PopupWindow popupWindow = this.f9502;
        int i = this.f9517;
        Size size = this.f9508;
        int i2 = this.f9503;
        ViewGroup viewGroup = this.f9498;
        ViewGroup viewGroup2 = this.f9524;
        if (z) {
            m9193(viewGroup2, this.f9511);
            viewGroup.setAlpha(0.0f);
            viewGroup.setVisibility(4);
            c19947.setAlpha(1.0f);
            c19947.setVisibility(0);
            imageButton.setImageDrawable(this.f9509);
            if (m9214()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(r2.getWidth() - size.getWidth());
                c19947.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - r2.getWidth()) - i2);
                viewGroup.setX(-viewGroup2.getX());
                imageButton.setX(0.0f);
                c19947.setX(0.0f);
            }
            if (this.f9495) {
                viewGroup2.setY(i);
                viewGroup.setY(r2.getHeight() - viewGroup2.getHeight());
                imageButton.setY(r2.getHeight() - size.getHeight());
                c19947.setY(0.0f);
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c19947.setY(size.getHeight());
            return;
        }
        m9193(viewGroup2, this.f9490);
        viewGroup.setAlpha(1.0f);
        viewGroup.setVisibility(0);
        c19947.setAlpha(0.0f);
        c19947.setVisibility(4);
        imageButton.setImageDrawable(this.f9513);
        if (this.f9511 != null) {
            if (m9214()) {
                viewGroup2.setX(i2);
                viewGroup.setX(0.0f);
                imageButton.setX(0.0f);
                c19947.setX(0.0f);
            } else {
                viewGroup2.setX((popupWindow.getWidth() - r2.getWidth()) - i2);
                viewGroup.setX(0.0f);
                imageButton.setX(r2.getWidth() - size.getWidth());
                c19947.setX(r2.getWidth() - this.f9511.getWidth());
            }
            if (this.f9495) {
                viewGroup2.setY((this.f9511.getHeight() + i) - r2.getHeight());
                viewGroup.setY(0.0f);
                imageButton.setY(0.0f);
                c19947.setY(r2.getHeight() - this.f9511.getHeight());
                return;
            }
            viewGroup2.setY(i);
            viewGroup.setY(0.0f);
            imageButton.setY(0.0f);
            c19947.setY(size.getHeight());
            return;
        }
        viewGroup2.setX(i2);
        viewGroup2.setY(i);
        viewGroup.setX(0.0f);
        viewGroup.setY(0.0f);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m9209() {
        int i;
        Size size = this.f9490;
        int i2 = 0;
        if (size != null) {
            i2 = Math.max(0, size.getWidth());
            i = Math.max(0, this.f9490.getHeight());
        } else {
            i = 0;
        }
        Size size2 = this.f9511;
        if (size2 != null) {
            i2 = Math.max(i2, size2.getWidth());
            i = Math.max(i, this.f9511.getHeight());
        }
        int i3 = (this.f9503 * 2) + i2;
        PopupWindow popupWindow = this.f9502;
        popupWindow.setWidth(i3);
        popupWindow.setHeight((this.f9517 * 2) + i);
        Size size3 = this.f9490;
        if (size3 == null || this.f9511 == null) {
            return;
        }
        int width = size3.getWidth() - this.f9511.getWidth();
        int height = this.f9511.getHeight() - this.f9490.getHeight();
        this.f9501 = (int) (Math.sqrt((height * height) + (width * width)) / this.f9524.getContext().getResources().getDisplayMetrics().density);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9191(Rect rect) {
        View view = this.f9514;
        Rect rect2 = this.f9530;
        view.getWindowVisibleDisplayFrame(rect2);
        int i = rect2.left;
        int i2 = rect2.right;
        PopupWindow popupWindow = this.f9502;
        int width = i2 - popupWindow.getWidth();
        int centerX = rect.centerX() - (popupWindow.getWidth() / 2);
        if (centerX >= i) {
            i = centerX > width ? width : centerX;
        }
        int i3 = rect.top;
        int i4 = rect2.top;
        int i5 = i3 - i4;
        int i6 = rect2.bottom;
        int i7 = rect.bottom;
        int i8 = i6 - i7;
        int i9 = this.f9517;
        int i10 = i9 * 2;
        int i11 = this.f9526;
        int i12 = i11 + i10;
        int i13 = i;
        if (this.f9511 != null) {
            int m9187 = m9187(2) + i10;
            int m91872 = m9187(5) + i10;
            int i14 = (rect2.bottom - rect.top) + i12;
            int i15 = (rect.bottom - rect2.top) + i12;
            if (i5 >= m9187) {
                if (i5 >= m91872 || i15 >= i14) {
                    m9211(i5 - i10);
                    i7 = rect.top - popupWindow.getHeight();
                    this.f9495 = true;
                } else {
                    m9211(i14 - i10);
                    i7 = rect.top - i12;
                    this.f9495 = false;
                }
            } else if (i5 >= i12 && i14 >= m9187) {
                m9211(i14 - i10);
                i7 = rect.top - i12;
                this.f9495 = false;
            } else if (i8 >= m9187) {
                m9211(i8 - i10);
                i7 = rect.bottom;
                this.f9495 = false;
            } else if (i8 >= i12 && rect2.height() >= m9187) {
                m9211(i15 - i10);
                i7 = (rect.bottom + i12) - popupWindow.getHeight();
                this.f9495 = true;
            } else {
                m9211(rect2.height() - i10);
                i7 = rect2.top;
                this.f9495 = false;
            }
        } else if (i5 >= i12) {
            i7 = i3 - i12;
        } else if (i8 < i12) {
            i7 = i8 >= i11 ? i7 - i9 : Math.max(i4, i3 - i12);
        }
        View rootView = view.getRootView();
        int[] iArr = this.f9525;
        rootView.getLocationOnScreen(iArr);
        int i16 = iArr[0];
        int i17 = iArr[1];
        view.getRootView().getLocationInWindow(iArr);
        this.f9515.set(i13 - (i16 - iArr[0]), i7 - (i17 - iArr[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public void m9206() {
        int width;
        int height;
        C11003.requireNonNull(this.f9490);
        if (this.f9496) {
            C11003.requireNonNull(this.f9511);
            width = this.f9511.getWidth();
            height = this.f9511.getHeight();
        } else {
            width = this.f9490.getWidth();
            height = this.f9490.getHeight();
        }
        ViewGroup viewGroup = this.f9524;
        this.f9535.set((int) viewGroup.getX(), (int) viewGroup.getY(), ((int) viewGroup.getX()) + width, ((int) viewGroup.getY()) + height);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean m9214() {
        ContextThemeWrapper contextThemeWrapper = this.f9522;
        return (contextThemeWrapper.getApplicationInfo().flags & 4194304) == 4194304 && contextThemeWrapper.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9211(int i) {
        if (this.f9511 != null) {
            int height = i - this.f9508.getHeight();
            int i2 = this.f9526;
            int m9187 = m9187((height - (i2 / 2)) / i2);
            if (this.f9511.getHeight() != m9187) {
                this.f9511 = new Size(this.f9511.getWidth(), m9187);
            }
            m9193(this.f9499, this.f9511);
            boolean z = this.f9496;
            ViewGroup viewGroup = this.f9524;
            if (z) {
                m9193(viewGroup, this.f9511);
                if (this.f9495) {
                    float height2 = this.f9511.getHeight() - m9187;
                    viewGroup.setY(viewGroup.getY() + height2);
                    ImageButton imageButton = this.f9512;
                    imageButton.setY(imageButton.getY() - height2);
                }
            } else {
                m9193(viewGroup, this.f9490);
            }
            m9209();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m9225() {
        ViewGroup viewGroup = this.f9524;
        viewGroup.removeAllViews();
        if (this.f9511 != null) {
            viewGroup.addView(this.f9499);
        }
        viewGroup.addView(this.f9498);
        if (this.f9511 != null) {
            viewGroup.addView(this.f9512);
        }
        m9224();
        m9206();
        if (m9214()) {
            viewGroup.setAlpha(0.0f);
            viewGroup.post(this.f9492);
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static void m9222(C3013 c3013) {
        ImageButton imageButton = c3013.f9512;
        ViewGroup viewGroup = c3013.f9524;
        if (c3013.f9495) {
            c3013.f9498.setY(viewGroup.getHeight() - c3013.f9490.getHeight());
            imageButton.setY(viewGroup.getHeight() - imageButton.getHeight());
            c3013.f9499.setY(viewGroup.getHeight() - c3013.f9511.getHeight());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m9187(int i) {
        int max = Math.max(2, i);
        C19947 c19947 = this.f9499;
        int min = Math.min(10, Math.min(max, c19947.getCount()));
        int count = c19947.getCount();
        int i2 = this.f9526;
        return this.f9508.getHeight() + (min * i2) + (min < count ? (int) (i2 * 0.5f) : 0);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m9217() {
        int i = this.f9501;
        if (i < 150) {
            return Math.max(200, 0);
        }
        if (i > 300) {
            return 300;
        }
        if (Build.VERSION.SDK_INT < 33) {
            return 250;
        }
        return (int) (ValueAnimator.getDurationScale() * 250);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9199(C3013 c3013, ImageButton imageButton) {
        AnimatedVectorDrawable animatedVectorDrawable = c3013.f9523;
        Interpolator interpolator = c3013.f9527;
        C19947 c19947 = c3013.f9499;
        ViewGroup viewGroup = c3013.f9498;
        Interpolator interpolator2 = c3013.f9489;
        ImageButton imageButton2 = c3013.f9512;
        ViewGroup viewGroup2 = c3013.f9524;
        Interpolator interpolator3 = c3013.f9506;
        AnimatedVectorDrawable animatedVectorDrawable2 = c3013.f9516;
        if (c3013.f9496) {
            imageButton.setImageDrawable(animatedVectorDrawable2);
            animatedVectorDrawable2.start();
            AnimationSet animationSet = c3013.f9520;
            int width = c3013.f9490.getWidth();
            int width2 = viewGroup2.getWidth();
            float x = viewGroup2.getX();
            C5130 c5130 = new C5130(c3013, width, width2, x, x + viewGroup2.getWidth());
            C0896 c0896 = new C0896(c3013, c3013.f9490.getHeight(), viewGroup2.getHeight(), viewGroup2.getY() + viewGroup2.getHeight());
            float x2 = imageButton2.getX();
            C14301 c14301 = new C14301(c3013, x2, c3013.m9214() ? (x2 - width2) + imageButton2.getWidth() : (width2 + x2) - imageButton2.getWidth(), width2);
            c5130.setInterpolator(interpolator3);
            c5130.setDuration(c3013.m9217());
            c0896.setInterpolator(interpolator2);
            c0896.setDuration(c3013.m9217());
            c14301.setInterpolator(interpolator3);
            c14301.setDuration(c3013.m9217());
            animationSet.getAnimations().clear();
            animationSet.addAnimation(c5130);
            animationSet.addAnimation(c0896);
            animationSet.addAnimation(c14301);
            viewGroup2.startAnimation(animationSet);
            c3013.f9496 = false;
            viewGroup.animate().alpha(1.0f).withLayer().setInterpolator(c3013.f9529).setDuration(100L).start();
            c19947.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
            return;
        }
        imageButton.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        AnimationSet animationSet2 = c3013.f9497;
        int width3 = c3013.f9511.getWidth();
        int height = c3013.f9511.getHeight();
        int width4 = viewGroup2.getWidth();
        int height2 = viewGroup2.getHeight();
        float y = viewGroup2.getY();
        float x3 = viewGroup2.getX();
        C18536 c18536 = new C18536(c3013, width3, width4, x3, viewGroup2.getWidth() + x3);
        C19242 c19242 = new C19242(c3013, height, height2, y);
        float x4 = imageButton2.getX();
        C0190 c0190 = new C0190(c3013, x4, c3013.m9214() ? (width3 + x4) - imageButton2.getWidth() : (x4 - width3) + imageButton2.getWidth(), width4);
        c18536.setInterpolator(interpolator2);
        c18536.setDuration(c3013.m9217());
        c19242.setInterpolator(interpolator3);
        c19242.setDuration(c3013.m9217());
        c0190.setInterpolator(interpolator3);
        c0190.setDuration(c3013.m9217());
        animationSet2.getAnimations().clear();
        animationSet2.getAnimations().clear();
        animationSet2.addAnimation(c18536);
        animationSet2.addAnimation(c19242);
        animationSet2.addAnimation(c0190);
        viewGroup2.startAnimation(animationSet2);
        c3013.f9496 = true;
        viewGroup.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
        c19947.setAlpha(1.0f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m9201(C3013 c3013, C19947 c19947, int i) {
        MenuItem menuItem = (MenuItem) c19947.getAdapter().getItem(i);
        MenuItemOnMenuItemClickListenerC10524 menuItemOnMenuItemClickListenerC10524 = c3013.f9528;
        if (menuItemOnMenuItemClickListenerC10524 != null) {
            menuItemOnMenuItemClickListenerC10524.onMenuItemClick(menuItem);
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m9221(C3013 c3013) {
        AnimationSet animationSet = c3013.f9520;
        AnimationSet animationSet2 = c3013.f9497;
        return (animationSet2.hasStarted() && !animationSet2.hasEnded()) || (animationSet.hasStarted() && !animationSet.hasEnded());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9192(View view, int i, int i2) {
        view.setMinimumWidth(i);
        view.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9193(View view, Size size) {
        m9192(view, size.getWidth(), size.getHeight());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m9212(ViewGroup viewGroup, int i) {
        m9192(viewGroup, i, viewGroup.getLayoutParams().height);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9195(ViewGroup viewGroup, int i) {
        m9192(viewGroup, viewGroup.getLayoutParams().width, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m9189(C3013 c3013, ContextThemeWrapper contextThemeWrapper, MenuItem menuItem, int i) {
        View inflate = LayoutInflater.from(contextThemeWrapper).inflate(bin.mt.plus.R.layout.MT_Protector_res_0x7f0d012a, (ViewGroup) null);
        if (menuItem != null) {
            c3013.m9194(inflate, menuItem, i, false);
        }
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m9194(android.view.View r8, android.view.MenuItem r9, int r10, boolean r11) {
        /*
            r7 = this;
            if (r11 == 0) goto L5
            l.۬ۙܿ r0 = r7.f9505
            goto L7
        L5:
            l.۬ۙܿ r0 = r7.f9494
        L7:
            java.lang.CharSequence r1 = r9.getTitle()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            android.graphics.drawable.Drawable r2 = r9.getIcon()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            boolean r5 = r0.f38693
            if (r5 == 0) goto L22
            if (r1 != 0) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = 0
        L23:
            boolean r0 = r0.f38695
            if (r0 == 0) goto L2b
            if (r2 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L36
            if (r5 != 0) goto L36
            if (r1 != 0) goto L33
            goto L37
        L33:
            if (r2 == 0) goto L36
            r0 = 1
        L36:
            r3 = r5
        L37:
            r2 = 2131362327(0x7f0a0217, float:1.8344431E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r5 = 0
            r2.setEllipsize(r5)
            r5 = 8
            if (r3 == 0) goto L53
            r2.setVisibility(r4)
            java.lang.CharSequence r6 = r9.getTitle()
            r2.setText(r6)
            goto L56
        L53:
            r2.setVisibility(r5)
        L56:
            r6 = 2131362326(0x7f0a0216, float:1.834443E38)
            android.view.View r6 = r8.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            if (r0 == 0) goto L6f
            r6.setVisibility(r4)
            android.graphics.drawable.Drawable r0 = r9.getIcon()
            r6.setImageDrawable(r0)
            r2.setPaddingRelative(r10, r4, r4, r4)
            goto L75
        L6f:
            r6.setVisibility(r5)
            r2.setPaddingRelative(r4, r4, r4, r4)
        L75:
            r10 = r9
            l.ܰ۬ r10 = (l.InterfaceMenuItemC13827) r10
            java.lang.CharSequence r10 = r10.getContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L8a
            java.lang.CharSequence r10 = r9.getTitle()
            r8.setContentDescription(r10)
            goto L8d
        L8a:
            r8.setContentDescription(r10)
        L8d:
            if (r11 == 0) goto L9e
            if (r1 != 0) goto L9e
            if (r3 != 0) goto L9e
            java.lang.CharSequence r9 = r9.getTitle()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            l.C17648.m41327(r8, r9)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3013.m9194(android.view.View, android.view.MenuItem, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9232(EnumC12890 enumC12890, EnumC12890 enumC128902) {
        C11003.requireNonNull(enumC12890);
        this.f9505 = enumC12890;
        C11003.requireNonNull(enumC128902);
        this.f9494 = enumC128902;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AnimatorSet m9188(ViewGroup viewGroup, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListenerAdapter);
        return animatorSet;
    }
}
