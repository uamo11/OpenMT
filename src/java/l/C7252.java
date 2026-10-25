package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: 11CW */
/* renamed from: l.۟ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7252 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f22252;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f22253;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10075 f22254;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f22255;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC19953 f22256;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f22257;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f22258;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f22259;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f22260;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C13601 f22261;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22262;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public SparseArray f22263;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f22264;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13601 f22265;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f22266;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C4906 f22267;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public MotionEvent f22268;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public SparseIntArray f22269;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19410(int r8, int r9) {
        /*
            r7 = this;
            r0 = -1
            l.ۙ᩸ r1 = r7.f22267
            if (r1 == 0) goto L16
            int r1 = r1.m14279(r8)
            if (r1 == r0) goto Lc
            goto Ld
        Lc:
            r1 = r8
        Ld:
            l.ۙ᩸ r2 = r7.f22267
            int r2 = r2.m14279(r9)
            if (r2 == r0) goto L17
            goto L18
        L16:
            r1 = r8
        L17:
            r2 = r9
        L18:
            java.util.ArrayList r3 = r7.f22252
            java.util.Iterator r4 = r3.iterator()
        L1e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()
            l.ܰۚ r5 = (l.C13601) r5
            int r6 = l.C13601.m32672(r5)
            if (r6 != r2) goto L36
            int r6 = l.C13601.m32680(r5)
            if (r6 == r1) goto L42
        L36:
            int r6 = l.C13601.m32672(r5)
            if (r6 != r9) goto L1e
            int r6 = l.C13601.m32680(r5)
            if (r6 != r8) goto L1e
        L42:
            r7.f22265 = r5
            l.ܰ֨ r8 = l.C13601.m32678(r5)
            if (r8 == 0) goto L55
            l.ܰۚ r8 = r7.f22265
            l.ܰ֨ r8 = l.C13601.m32678(r8)
            boolean r9 = r7.f22266
            r8.m32502(r9)
        L55:
            return
        L56:
            java.util.ArrayList r8 = r7.f22253
            java.util.Iterator r8 = r8.iterator()
            l.ܰۚ r4 = r7.f22261
        L5e:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L72
            java.lang.Object r5 = r8.next()
            l.ܰۚ r5 = (l.C13601) r5
            int r6 = l.C13601.m32672(r5)
            if (r6 != r9) goto L5e
            r4 = r5
            goto L5e
        L72:
            l.ܰۚ r8 = new l.ܰۚ
            r8.<init>(r7, r4)
            l.C13601.m32681(r8, r1)
            l.C13601.m32673(r8, r2)
            if (r1 == r0) goto L82
            r3.add(r8)
        L82:
            r7.f22265 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7252.m19410(int, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19414(C13601 c13601) {
        this.f22265 = c13601;
        if (c13601.f40556 != null) {
            this.f22265.f40556.m32502(this.f22266);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19413(C10075 c10075, int i) {
        View findViewById;
        View findViewById2;
        ArrayList arrayList = this.f22252;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C13601 c13601 = (C13601) it.next();
            if (c13601.f40559.size() > 0) {
                Iterator it2 = c13601.f40559.iterator();
                while (it2.hasNext()) {
                    int i2 = ((ViewOnClickListenerC22774) it2.next()).f73529;
                    if (i2 != -1 && (findViewById2 = c10075.findViewById(i2)) != null) {
                        findViewById2.setOnClickListener(null);
                    }
                }
            }
        }
        ArrayList arrayList2 = this.f22253;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            C13601 c136012 = (C13601) it3.next();
            if (c136012.f40559.size() > 0) {
                Iterator it4 = c136012.f40559.iterator();
                while (it4.hasNext()) {
                    int i3 = ((ViewOnClickListenerC22774) it4.next()).f73529;
                    if (i3 != -1 && (findViewById = c10075.findViewById(i3)) != null) {
                        findViewById.setOnClickListener(null);
                    }
                }
            }
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            C13601 c136013 = (C13601) it5.next();
            if (c136013.f40559.size() > 0) {
                Iterator it6 = c136013.f40559.iterator();
                while (it6.hasNext()) {
                    ((ViewOnClickListenerC22774) it6.next()).m50849(c10075, i, c136013);
                }
            }
        }
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            C13601 c136014 = (C13601) it7.next();
            if (c136014.f40559.size() > 0) {
                Iterator it8 = c136014.f40559.iterator();
                while (it8.hasNext()) {
                    ((ViewOnClickListenerC22774) it8.next()).m50849(c10075, i, c136014);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m19408() {
        return this.f22252;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19418(C10075 c10075, int i) {
        if (this.f22256 != null) {
            return false;
        }
        Iterator it = this.f22252.iterator();
        while (it.hasNext()) {
            C13601 c13601 = (C13601) it.next();
            if (c13601.f40557 != 0 && this.f22265 != c13601) {
                if (i == c13601.f40567 && (c13601.f40557 == 4 || c13601.f40557 == 2)) {
                    EnumC12191 enumC12191 = EnumC12191.FINISHED;
                    c10075.m25317(enumC12191);
                    c10075.m25318(c13601);
                    if (c13601.f40557 != 4) {
                        c10075.m25321(1.0f);
                        c10075.m25319(true);
                        c10075.m25317(EnumC12191.SETUP);
                        c10075.m25317(EnumC12191.MOVING);
                        c10075.m25317(enumC12191);
                        c10075.m25323();
                        return true;
                    }
                    c10075.m25310(1.0f);
                    c10075.m25317(EnumC12191.SETUP);
                    c10075.m25317(EnumC12191.MOVING);
                    return true;
                }
                if (i == c13601.f40564 && (c13601.f40557 == 3 || c13601.f40557 == 1)) {
                    EnumC12191 enumC121912 = EnumC12191.FINISHED;
                    c10075.m25317(enumC121912);
                    c10075.m25318(c13601);
                    if (c13601.f40557 != 3) {
                        c10075.m25321(0.0f);
                        c10075.m25319(true);
                        c10075.m25317(EnumC12191.SETUP);
                        c10075.m25317(EnumC12191.MOVING);
                        c10075.m25317(enumC121912);
                        c10075.m25323();
                        return true;
                    }
                    c10075.m25310(0.0f);
                    c10075.m25317(EnumC12191.SETUP);
                    c10075.m25317(EnumC12191.MOVING);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19416(boolean z) {
        this.f22266 = z;
        C13601 c13601 = this.f22265;
        if (c13601 == null || c13601.f40556 == null) {
            return;
        }
        this.f22265.f40556.m32502(this.f22266);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C7252(Context context, C10075 c10075, int i) {
        C13601 c13601 = null;
        this.f22267 = null;
        this.f22265 = null;
        ArrayList arrayList = new ArrayList();
        this.f22252 = arrayList;
        this.f22261 = null;
        this.f22253 = new ArrayList();
        this.f22263 = new SparseArray();
        this.f22260 = new HashMap();
        this.f22269 = new SparseIntArray();
        this.f22264 = 400;
        this.f22262 = 0;
        this.f22257 = false;
        this.f22255 = false;
        this.f22254 = c10075;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                m19402(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c13601.f40562.add(new C23480(context, xml));
                                break;
                            } else {
                                break;
                            }
                        case 269306229:
                            if (name.equals(AbstractC16620.LOG_TAG)) {
                                c13601 = new C13601(this, context, xml);
                                arrayList.add(c13601);
                                if (this.f22265 == null && !c13601.f40563) {
                                    this.f22265 = c13601;
                                    if (c13601.f40556 != null) {
                                        this.f22265.f40556.m32502(this.f22266);
                                    }
                                }
                                if (c13601.f40563) {
                                    if (c13601.f40564 == -1) {
                                        this.f22261 = c13601;
                                    } else {
                                        this.f22253.add(c13601);
                                    }
                                    arrayList.remove(c13601);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c13601.m32692(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (c13601 == null) {
                                    context.getResources().getResourceEntryName(i);
                                    xml.getLineNumber();
                                }
                                c13601.f40556 = new C13477(context, this.f22254, xml);
                                break;
                            } else {
                                break;
                            }
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                m19405(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.f22267 = new C4906(context, xml);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
        this.f22263.put(R.id.MT_Protector_res_0x7f0a03b1, new C4201());
        this.f22260.put("motion_base", Integer.valueOf(R.id.MT_Protector_res_0x7f0a03b1));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19405(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69968);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f22264 = obtainStyledAttributes.getInt(index, this.f22264);
            } else if (index == 1) {
                this.f22262 = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m19400(Context context, String str) {
        int identifier = str.contains("/") ? context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName()) : -1;
        return (identifier != -1 || str.length() <= 1) ? identifier : Integer.parseInt(str.substring(1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19402(Context context, XmlResourceParser xmlResourceParser) {
        C4201 c4201 = new C4201();
        c4201.m12680();
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < attributeCount; i3++) {
            String attributeName = xmlResourceParser.getAttributeName(i3);
            String attributeValue = xmlResourceParser.getAttributeValue(i3);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i2 = m19400(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i = m19400(context, attributeValue);
                int indexOf = attributeValue.indexOf(47);
                if (indexOf >= 0) {
                    attributeValue = attributeValue.substring(indexOf + 1);
                }
                this.f22260.put(attributeValue, Integer.valueOf(i));
            }
        }
        if (i != -1) {
            int i4 = this.f22254.f30311;
            c4201.m12672(context, xmlResourceParser);
            if (i2 != -1) {
                this.f22269.put(i, i2);
            }
            this.f22263.put(i, c4201);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4201 m19409(int i) {
        int m14279;
        C4906 c4906 = this.f22267;
        if (c4906 != null && (m14279 = c4906.m14279(i)) != -1) {
            i = m14279;
        }
        SparseArray sparseArray = this.f22263;
        if (sparseArray.get(i) == null) {
            C0050.m931(this.f22254.getContext(), i);
            return (C4201) sparseArray.get(sparseArray.keyAt(0));
        }
        return (C4201) sparseArray.get(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19415(C19248 c19248) {
        C13601 c13601 = this.f22265;
        if (c13601 != null) {
            Iterator it = c13601.f40562.iterator();
            while (it.hasNext()) {
                ((C23480) it.next()).m51934(c19248);
            }
        } else {
            C13601 c136012 = this.f22261;
            if (c136012 != null) {
                Iterator it2 = c136012.f40562.iterator();
                while (it2.hasNext()) {
                    ((C23480) it2.next()).m51934(c19248);
                }
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m19419() {
        Iterator it = this.f22252.iterator();
        while (it.hasNext()) {
            if (((C13601) it.next()).f40556 != null) {
                return true;
            }
        }
        C13601 c13601 = this.f22265;
        return (c13601 == null || c13601.f40556 == null) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19411(MotionEvent motionEvent, int i, C10075 c10075) {
        InterfaceC19953 interfaceC19953;
        InterfaceC19953 interfaceC199532;
        MotionEvent motionEvent2;
        C13601 c13601;
        int i2;
        Iterator it;
        RectF rectF = new RectF();
        InterfaceC19953 interfaceC199533 = this.f22256;
        C10075 c100752 = this.f22254;
        if (interfaceC199533 == null) {
            c100752.getClass();
            this.f22256 = C4430.m13150();
        }
        VelocityTracker velocityTracker = ((C4430) this.f22256).f14164;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (i != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f22259 = motionEvent.getRawX();
                this.f22258 = motionEvent.getRawY();
                this.f22268 = motionEvent;
                this.f22257 = false;
                if (this.f22265.f40556 != null) {
                    RectF m32500 = this.f22265.f40556.m32500(c100752, rectF);
                    if (m32500 == null || m32500.contains(this.f22268.getX(), this.f22268.getY())) {
                        RectF m32505 = this.f22265.f40556.m32505(c100752, rectF);
                        if (m32505 != null && !m32505.contains(this.f22268.getX(), this.f22268.getY())) {
                            this.f22255 = true;
                        } else {
                            this.f22255 = false;
                        }
                        this.f22265.f40556.m32511(this.f22259, this.f22258);
                        return;
                    }
                    this.f22268 = null;
                    this.f22257 = true;
                    return;
                }
                return;
            }
            if (action == 2 && !this.f22257) {
                float rawY = motionEvent.getRawY() - this.f22258;
                float rawX = motionEvent.getRawX() - this.f22259;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f22268) == null) {
                    return;
                }
                if (i != -1) {
                    C4906 c4906 = this.f22267;
                    if (c4906 == null || (i2 = c4906.m14279(i)) == -1) {
                        i2 = i;
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = this.f22252.iterator();
                    while (it2.hasNext()) {
                        C13601 c136012 = (C13601) it2.next();
                        if (c136012.f40567 == i2 || c136012.f40564 == i2) {
                            arrayList.add(c136012);
                        }
                    }
                    RectF rectF2 = new RectF();
                    Iterator it3 = arrayList.iterator();
                    float f = 0.0f;
                    c13601 = null;
                    while (it3.hasNext()) {
                        C13601 c136013 = (C13601) it3.next();
                        if (c136013.f40573 || c136013.f40556 == null) {
                            it = it3;
                        } else {
                            c136013.f40556.m32502(this.f22266);
                            RectF m325052 = c136013.f40556.m32505(c100752, rectF2);
                            if (m325052 != null) {
                                it = it3;
                                if (!m325052.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                }
                            } else {
                                it = it3;
                            }
                            RectF m325053 = c136013.f40556.m32505(c100752, rectF2);
                            if (m325053 == null || m325053.contains(motionEvent2.getX(), motionEvent2.getY())) {
                                float m32498 = c136013.f40556.m32498(rawX, rawY) * (c136013.f40564 == i ? -1.0f : 1.1f);
                                if (m32498 > f) {
                                    f = m32498;
                                    c13601 = c136013;
                                }
                            }
                        }
                        it3 = it;
                    }
                } else {
                    c13601 = this.f22265;
                }
                if (c13601 != null) {
                    c10075.m25318(c13601);
                    RectF m325054 = this.f22265.f40556.m32505(c100752, rectF);
                    this.f22255 = (m325054 == null || m325054.contains(this.f22268.getX(), this.f22268.getY())) ? false : true;
                    this.f22265.f40556.m32507(this.f22259, this.f22258);
                }
            }
        }
        if (this.f22257) {
            return;
        }
        C13601 c136014 = this.f22265;
        if (c136014 != null && c136014.f40556 != null && !this.f22255) {
            this.f22265.f40556.m32501(motionEvent, this.f22256);
        }
        this.f22259 = motionEvent.getRawX();
        this.f22258 = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC19953 = this.f22256) == null) {
            return;
        }
        C4430 c4430 = (C4430) interfaceC19953;
        VelocityTracker velocityTracker2 = c4430.f14164;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            interfaceC199532 = null;
            c4430.f14164 = null;
        } else {
            interfaceC199532 = null;
        }
        this.f22256 = interfaceC199532;
        int i3 = c10075.f30314;
        if (i3 != -1) {
            m19418(c10075, i3);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m19421() {
        C13601 c13601 = this.f22265;
        if (c13601 == null) {
            return -1;
        }
        return c13601.f40567;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Interpolator m19420() {
        int i = this.f22265.f40569;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f22254.getContext(), this.f22265.f40568);
        }
        if (i == -1) {
            return new InterpolatorC11486(C8518.m22210(this.f22265.f40565));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m19417() {
        C13601 c13601 = this.f22265;
        if (c13601 != null) {
            return c13601.f40561;
        }
        return this.f22264;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float m19422() {
        C13601 c13601 = this.f22265;
        if (c13601 == null || c13601.f40556 == null) {
            return 0.0f;
        }
        return this.f22265.f40556.m32503();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19412(C10075 c10075) {
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f22263;
            if (i < sparseArray.size()) {
                int keyAt = sparseArray.keyAt(i);
                SparseIntArray sparseIntArray = this.f22269;
                int i2 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i2 > 0) {
                    if (i2 == keyAt) {
                        return;
                    }
                    int i3 = size - 1;
                    if (size < 0) {
                        return;
                    }
                    i2 = sparseIntArray.get(i2);
                    size = i3;
                }
                m19404(keyAt);
                i++;
            } else {
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    ((C4201) sparseArray.valueAt(i4)).m12681(c10075);
                }
                return;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19404(int i) {
        SparseIntArray sparseIntArray = this.f22269;
        int i2 = sparseIntArray.get(i);
        if (i2 > 0) {
            m19404(sparseIntArray.get(i));
            SparseArray sparseArray = this.f22263;
            C4201 c4201 = (C4201) sparseArray.get(i);
            C4201 c42012 = (C4201) sparseArray.get(i2);
            if (c42012 == null) {
                C0050.m931(this.f22254.getContext(), i2);
            } else {
                c4201.m12673(c42012);
                sparseIntArray.put(i, -1);
            }
        }
    }
}
