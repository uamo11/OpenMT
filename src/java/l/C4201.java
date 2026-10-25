package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: R1K2 */
/* renamed from: l.ۘ᩸, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4201 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f13666;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f13667 = {0, 4, 8};

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f13670 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f13669 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f13668 = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f13666 = sparseIntArray;
        sparseIntArray.append(77, 25);
        sparseIntArray.append(78, 26);
        sparseIntArray.append(80, 29);
        sparseIntArray.append(81, 30);
        sparseIntArray.append(87, 36);
        sparseIntArray.append(86, 35);
        sparseIntArray.append(59, 4);
        sparseIntArray.append(58, 3);
        sparseIntArray.append(56, 1);
        sparseIntArray.append(95, 6);
        sparseIntArray.append(96, 7);
        sparseIntArray.append(66, 17);
        sparseIntArray.append(67, 18);
        sparseIntArray.append(68, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(82, 32);
        sparseIntArray.append(83, 33);
        sparseIntArray.append(65, 10);
        sparseIntArray.append(64, 9);
        sparseIntArray.append(99, 13);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_attachUserService, 16);
        sparseIntArray.append(100, 14);
        sparseIntArray.append(97, 11);
        sparseIntArray.append(101, 15);
        sparseIntArray.append(98, 12);
        sparseIntArray.append(90, 40);
        sparseIntArray.append(75, 39);
        sparseIntArray.append(74, 41);
        sparseIntArray.append(89, 42);
        sparseIntArray.append(73, 20);
        sparseIntArray.append(88, 37);
        sparseIntArray.append(63, 5);
        sparseIntArray.append(76, 82);
        sparseIntArray.append(85, 82);
        sparseIntArray.append(79, 82);
        sparseIntArray.append(57, 82);
        sparseIntArray.append(55, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(91, 54);
        sparseIntArray.append(69, 55);
        sparseIntArray.append(92, 56);
        sparseIntArray.append(70, 57);
        sparseIntArray.append(93, 58);
        sparseIntArray.append(71, 59);
        sparseIntArray.append(60, 61);
        sparseIntArray.append(62, 62);
        sparseIntArray.append(61, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 65);
        sparseIntArray.append(34, 66);
        sparseIntArray.append(108, 67);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_isHidden, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, 68);
        sparseIntArray.append(94, 69);
        sparseIntArray.append(72, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult, 76);
        sparseIntArray.append(84, 77);
        sparseIntArray.append(109, 78);
        sparseIntArray.append(54, 80);
        sparseIntArray.append(53, 81);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21135 m12684(int i) {
        return m12667(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12673(C4201 c4201) {
        HashMap hashMap = c4201.f13668;
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            C21135 c21135 = (C21135) hashMap.get(num);
            HashMap hashMap2 = this.f13668;
            if (!hashMap2.containsKey(num)) {
                hashMap2.put(num, new C21135());
            }
            C21135 c211352 = (C21135) hashMap2.get(num);
            C9846 c9846 = c211352.f68158;
            if (!c9846.f29751) {
                c9846.m24918(c21135.f68158);
            }
            C16194 c16194 = c211352.f68162;
            if (!c16194.f49870) {
                C16194 c161942 = c21135.f68162;
                c16194.f49870 = c161942.f49870;
                c16194.f49872 = c161942.f49872;
                c16194.f49869 = c161942.f49869;
                c16194.f49871 = c161942.f49871;
                c16194.f49873 = c161942.f49873;
            }
            C2790 c2790 = c211352.f68160;
            if (!c2790.f8700) {
                c2790.m8620(c21135.f68160);
            }
            C9140 c9140 = c211352.f68163;
            if (!c9140.f27673) {
                c9140.m23508(c21135.f68163);
            }
            for (String str : c21135.f68159.keySet()) {
                if (!c211352.f68159.containsKey(str)) {
                    c211352.f68159.put(str, c21135.f68159.get(str));
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12681(C10075 c10075) {
        int childCount = c10075.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c10075.getChildAt(i);
            C16900 c16900 = (C16900) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f13669 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer valueOf = Integer.valueOf(id);
            HashMap hashMap = this.f13668;
            if (!hashMap.containsKey(valueOf)) {
                hashMap.put(Integer.valueOf(id), new C21135());
            }
            C21135 c21135 = (C21135) hashMap.get(Integer.valueOf(id));
            C9846 c9846 = c21135.f68158;
            C16194 c16194 = c21135.f68162;
            C2790 c2790 = c21135.f68160;
            if (!c9846.f29751) {
                c21135.m48085(id, c16900);
                if (childAt instanceof AbstractC7539) {
                    AbstractC7539 abstractC7539 = (AbstractC7539) childAt;
                    c9846.f29771 = Arrays.copyOf(abstractC7539.f23297, abstractC7539.f23298);
                    if (childAt instanceof C6128) {
                        C6128 c6128 = (C6128) childAt;
                        c9846.f29774 = c6128.m17047();
                        c9846.f29788 = c6128.m17045();
                        c9846.f29792 = c6128.m17046();
                    }
                }
                c9846.f29751 = true;
            }
            if (!c16194.f49870) {
                c16194.f49872 = childAt.getVisibility();
                c16194.f49869 = childAt.getAlpha();
                c16194.f49870 = true;
            }
            if (!c2790.f8700) {
                c2790.f8700 = true;
                c2790.f8702 = childAt.getRotation();
                c2790.f8701 = childAt.getRotationX();
                c2790.f8698 = childAt.getRotationY();
                c2790.f8704 = childAt.getScaleX();
                c2790.f8694 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c2790.f8703 = pivotX;
                    c2790.f8696 = pivotY;
                }
                c2790.f8695 = childAt.getTranslationX();
                c2790.f8699 = childAt.getTranslationY();
                c2790.f8693 = childAt.getTranslationZ();
                if (c2790.f8692) {
                    c2790.f8697 = childAt.getElevation();
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12685(C17606 c17606) {
        C4201 c4201 = this;
        int childCount = c17606.getChildCount();
        HashMap hashMap = c4201.f13668;
        hashMap.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = c17606.getChildAt(i);
            C16900 c16900 = (C16900) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c4201.f13669 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C21135());
            }
            C21135 c21135 = (C21135) hashMap.get(Integer.valueOf(id));
            HashMap hashMap2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap hashMap3 = c4201.f13670;
            for (String str : hashMap3.keySet()) {
                C13888 c13888 = (C13888) hashMap3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        hashMap2.put(str, new C13888(c13888, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        hashMap2.put(str, new C13888(c13888, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            c21135.f68159 = hashMap2;
            C16194 c16194 = c21135.f68162;
            C9846 c9846 = c21135.f68158;
            C2790 c2790 = c21135.f68160;
            c21135.m48085(id, c16900);
            c16194.f49872 = childAt.getVisibility();
            c16194.f49869 = childAt.getAlpha();
            c2790.f8702 = childAt.getRotation();
            c2790.f8701 = childAt.getRotationX();
            c2790.f8698 = childAt.getRotationY();
            c2790.f8704 = childAt.getScaleX();
            c2790.f8694 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                c2790.f8703 = pivotX;
                c2790.f8696 = pivotY;
            }
            c2790.f8695 = childAt.getTranslationX();
            c2790.f8699 = childAt.getTranslationY();
            c2790.f8693 = childAt.getTranslationZ();
            if (c2790.f8692) {
                c2790.f8697 = childAt.getElevation();
            }
            if (childAt instanceof C6128) {
                C6128 c6128 = (C6128) childAt;
                c9846.f29774 = c6128.m17047();
                c9846.f29771 = Arrays.copyOf(c6128.f23297, c6128.f23298);
                c9846.f29788 = c6128.m17045();
                c9846.f29792 = c6128.m17046();
            }
            i++;
            c4201 = this;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12677(C19724 c19724) {
        int childCount = c19724.getChildCount();
        HashMap hashMap = this.f13668;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c19724.getChildAt(i);
            C19018 c19018 = (C19018) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f13669 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C21135());
            }
            C21135 c21135 = (C21135) hashMap.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC7539) {
                C21135.m48089(c21135, (AbstractC7539) childAt, id, c19018);
            }
            c21135.m48086(id, c19018);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12676(C17606 c17606) {
        m12682(c17606);
        c17606.setConstraintSet(null);
        c17606.requestLayout();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12675(C10075 c10075) {
        int childCount = c10075.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c10075.getChildAt(i);
            int id = childAt.getId();
            Integer valueOf = Integer.valueOf(id);
            HashMap hashMap = this.f13668;
            if (!hashMap.containsKey(valueOf)) {
                C0050.m933(childAt);
            } else {
                if (this.f13669 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (hashMap.containsKey(Integer.valueOf(id))) {
                    C13888.m33291(childAt, ((C21135) hashMap.get(Integer.valueOf(id))).f68159);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12674(AbstractC7539 abstractC7539, C15094 c15094, C19018 c19018, SparseArray sparseArray) {
        int id = abstractC7539.getId();
        Integer valueOf = Integer.valueOf(id);
        HashMap hashMap = this.f13668;
        if (hashMap.containsKey(valueOf)) {
            C21135 c21135 = (C21135) hashMap.get(Integer.valueOf(id));
            if (c15094 instanceof C12978) {
                abstractC7539.mo17042(c21135, (C12978) c15094, c19018, sparseArray);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12670(int i, C19018 c19018) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f13668;
        if (hashMap.containsKey(valueOf)) {
            ((C21135) hashMap.get(Integer.valueOf(i))).m48090(c19018);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12682(C17606 c17606) {
        int childCount = c17606.getChildCount();
        HashMap hashMap = this.f13668;
        HashSet hashSet = new HashSet(hashMap.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = c17606.getChildAt(i);
            int id = childAt.getId();
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                C0050.m933(childAt);
            } else {
                if (this.f13669 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1 && hashMap.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C21135 c21135 = (C21135) hashMap.get(Integer.valueOf(id));
                    if (childAt instanceof C6128) {
                        c21135.f68158.f29807 = 1;
                    }
                    C9846 c9846 = c21135.f68158;
                    C16194 c16194 = c21135.f68162;
                    C2790 c2790 = c21135.f68160;
                    int i2 = c9846.f29807;
                    if (i2 != -1 && i2 == 1) {
                        C6128 c6128 = (C6128) childAt;
                        c6128.setId(id);
                        c6128.m17044(c9846.f29788);
                        c6128.m17040(c9846.f29792);
                        c6128.m17043(c9846.f29774);
                        int[] iArr = c9846.f29771;
                        if (iArr != null) {
                            c6128.m20233(iArr);
                        } else {
                            String str = c9846.f29800;
                            if (str != null) {
                                int[] m12664 = m12664(c6128, str);
                                c9846.f29771 = m12664;
                                c6128.m20233(m12664);
                            }
                        }
                    }
                    C16900 c16900 = (C16900) childAt.getLayoutParams();
                    c16900.m39760();
                    c21135.m48090(c16900);
                    C13888.m33291(childAt, c21135.f68159);
                    childAt.setLayoutParams(c16900);
                    if (c16194.f49873 == 0) {
                        childAt.setVisibility(c16194.f49872);
                    }
                    childAt.setAlpha(c16194.f49869);
                    childAt.setRotation(c2790.f8702);
                    childAt.setRotationX(c2790.f8701);
                    childAt.setRotationY(c2790.f8698);
                    childAt.setScaleX(c2790.f8704);
                    childAt.setScaleY(c2790.f8694);
                    if (!Float.isNaN(c2790.f8703)) {
                        childAt.setPivotX(c2790.f8703);
                    }
                    if (!Float.isNaN(c2790.f8696)) {
                        childAt.setPivotY(c2790.f8696);
                    }
                    childAt.setTranslationX(c2790.f8695);
                    childAt.setTranslationY(c2790.f8699);
                    childAt.setTranslationZ(c2790.f8693);
                    if (c2790.f8692) {
                        childAt.setElevation(c2790.f8697);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C21135 c211352 = (C21135) hashMap.get(num);
            C9846 c98462 = c211352.f68158;
            int i3 = c98462.f29807;
            if (i3 != -1 && i3 == 1) {
                C6128 c61282 = new C6128(c17606.getContext());
                c61282.setId(num.intValue());
                int[] iArr2 = c98462.f29771;
                if (iArr2 != null) {
                    c61282.m20233(iArr2);
                } else {
                    String str2 = c98462.f29800;
                    if (str2 != null) {
                        int[] m126642 = m12664(c61282, str2);
                        c98462.f29771 = m126642;
                        c61282.m20233(m126642);
                    }
                }
                c61282.m17044(c98462.f29788);
                c61282.m17040(c98462.f29792);
                C16900 generateDefaultLayoutParams = c17606.generateDefaultLayoutParams();
                c61282.m20236();
                c211352.m48090(generateDefaultLayoutParams);
                c17606.addView(c61282, generateDefaultLayoutParams);
            }
            if (c98462.f29764) {
                View c1378 = new C1378(c17606.getContext());
                c1378.setId(num.intValue());
                C16900 generateDefaultLayoutParams2 = c17606.generateDefaultLayoutParams();
                c211352.m48090(generateDefaultLayoutParams2);
                c17606.addView(c1378, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m12686(int i) {
        return m12667(i).f68162.f49873;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m12687(int i) {
        return m12667(i).f68162.f49872;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12679(int i) {
        return m12667(i).f68158.f29782;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m12683(int i) {
        return m12667(i).f68158.f29769;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12669(int i, int i2, int i3, float f) {
        C9846 c9846 = m12667(i).f68158;
        c9846.f29781 = i2;
        c9846.f29806 = i3;
        c9846.f29789 = f;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C21135 m12667(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f13668;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(i), new C21135());
        }
        return (C21135) hashMap.get(Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12671(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C21135 m12663 = m12663(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        m12663.f68158.f29764 = true;
                    }
                    this.f13668.put(Integer.valueOf(m12663.f68161), m12663);
                }
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12672(android.content.Context r8, android.content.res.XmlResourceParser r9) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4201.m12672(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m12665(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21135 m12663(Context context, AttributeSet attributeSet) {
        C21135 c21135 = new C21135();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69970);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            C16194 c16194 = c21135.f68162;
            C9140 c9140 = c21135.f68163;
            C2790 c2790 = c21135.f68160;
            C9846 c9846 = c21135.f68158;
            if (index != 1 && 23 != index && 24 != index) {
                c9140.f27673 = true;
                c9846.f29751 = true;
                c16194.f49870 = true;
                c2790.f8700 = true;
            }
            SparseIntArray sparseIntArray = f13666;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c9846.f29750 = m12665(obtainStyledAttributes, index, c9846.f29750);
                    break;
                case 2:
                    c9846.f29773 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29773);
                    break;
                case 3:
                    c9846.f29787 = m12665(obtainStyledAttributes, index, c9846.f29787);
                    break;
                case 4:
                    c9846.f29791 = m12665(obtainStyledAttributes, index, c9846.f29791);
                    break;
                case 5:
                    c9846.f29770 = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    c9846.f29768 = obtainStyledAttributes.getDimensionPixelOffset(index, c9846.f29768);
                    break;
                case 7:
                    c9846.f29785 = obtainStyledAttributes.getDimensionPixelOffset(index, c9846.f29785);
                    break;
                case 8:
                    c9846.f29752 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29752);
                    break;
                case 9:
                    c9846.f29756 = m12665(obtainStyledAttributes, index, c9846.f29756);
                    break;
                case 10:
                    c9846.f29793 = m12665(obtainStyledAttributes, index, c9846.f29793);
                    break;
                case 11:
                    c9846.f29795 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29795);
                    break;
                case 12:
                    c9846.f29746 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29746);
                    break;
                case 13:
                    c9846.f29760 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29760);
                    break;
                case 14:
                    c9846.f29748 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29748);
                    break;
                case 15:
                    c9846.f29766 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29766);
                    break;
                case 16:
                    c9846.f29783 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29783);
                    break;
                case 17:
                    c9846.f29801 = obtainStyledAttributes.getDimensionPixelOffset(index, c9846.f29801);
                    break;
                case 18:
                    c9846.f29803 = obtainStyledAttributes.getDimensionPixelOffset(index, c9846.f29803);
                    break;
                case 19:
                    c9846.f29797 = obtainStyledAttributes.getFloat(index, c9846.f29797);
                    break;
                case 20:
                    c9846.f29772 = obtainStyledAttributes.getFloat(index, c9846.f29772);
                    break;
                case 21:
                    c9846.f29782 = obtainStyledAttributes.getLayoutDimension(index, c9846.f29782);
                    break;
                case 22:
                    int i2 = obtainStyledAttributes.getInt(index, c16194.f49872);
                    c16194.f49872 = i2;
                    c16194.f49872 = f13667[i2];
                    break;
                case 23:
                    c9846.f29769 = obtainStyledAttributes.getLayoutDimension(index, c9846.f29769);
                    break;
                case 24:
                    c9846.f29805 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29805);
                    break;
                case 25:
                    c9846.f29780 = m12665(obtainStyledAttributes, index, c9846.f29780);
                    break;
                case 26:
                    c9846.f29765 = m12665(obtainStyledAttributes, index, c9846.f29765);
                    break;
                case 27:
                    c9846.f29786 = obtainStyledAttributes.getInt(index, c9846.f29786);
                    break;
                case 28:
                    c9846.f29753 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29753);
                    break;
                case 29:
                    c9846.f29757 = m12665(obtainStyledAttributes, index, c9846.f29757);
                    break;
                case 30:
                    c9846.f29794 = m12665(obtainStyledAttributes, index, c9846.f29794);
                    break;
                case 31:
                    c9846.f29796 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29796);
                    break;
                case 32:
                    c9846.f29747 = m12665(obtainStyledAttributes, index, c9846.f29747);
                    break;
                case 33:
                    c9846.f29761 = m12665(obtainStyledAttributes, index, c9846.f29761);
                    break;
                case 34:
                    c9846.f29749 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29749);
                    break;
                case 35:
                    c9846.f29767 = m12665(obtainStyledAttributes, index, c9846.f29767);
                    break;
                case 36:
                    c9846.f29784 = m12665(obtainStyledAttributes, index, c9846.f29784);
                    break;
                case 37:
                    c9846.f29802 = obtainStyledAttributes.getFloat(index, c9846.f29802);
                    break;
                case 38:
                    c21135.f68161 = obtainStyledAttributes.getResourceId(index, c21135.f68161);
                    break;
                case 39:
                    c9846.f29775 = obtainStyledAttributes.getFloat(index, c9846.f29775);
                    break;
                case 40:
                    c9846.f29798 = obtainStyledAttributes.getFloat(index, c9846.f29798);
                    break;
                case 41:
                    c9846.f29762 = obtainStyledAttributes.getInt(index, c9846.f29762);
                    break;
                case 42:
                    c9846.f29804 = obtainStyledAttributes.getInt(index, c9846.f29804);
                    break;
                case 43:
                    c16194.f49869 = obtainStyledAttributes.getFloat(index, c16194.f49869);
                    break;
                case 44:
                    c2790.f8692 = true;
                    c2790.f8697 = obtainStyledAttributes.getDimension(index, c2790.f8697);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    c2790.f8701 = obtainStyledAttributes.getFloat(index, c2790.f8701);
                    break;
                case 46:
                    c2790.f8698 = obtainStyledAttributes.getFloat(index, c2790.f8698);
                    break;
                case 47:
                    c2790.f8704 = obtainStyledAttributes.getFloat(index, c2790.f8704);
                    break;
                case 48:
                    c2790.f8694 = obtainStyledAttributes.getFloat(index, c2790.f8694);
                    break;
                case 49:
                    c2790.f8703 = obtainStyledAttributes.getDimension(index, c2790.f8703);
                    break;
                case 50:
                    c2790.f8696 = obtainStyledAttributes.getDimension(index, c2790.f8696);
                    break;
                case 51:
                    c2790.f8695 = obtainStyledAttributes.getDimension(index, c2790.f8695);
                    break;
                case 52:
                    c2790.f8699 = obtainStyledAttributes.getDimension(index, c2790.f8699);
                    break;
                case 53:
                    c2790.f8693 = obtainStyledAttributes.getDimension(index, c2790.f8693);
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    c9846.f29759 = obtainStyledAttributes.getInt(index, c9846.f29759);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    c9846.f29758 = obtainStyledAttributes.getInt(index, c9846.f29758);
                    break;
                case 56:
                    c9846.f29755 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29755);
                    break;
                case 57:
                    c9846.f29754 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29754);
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    c9846.f29779 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29779);
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    c9846.f29778 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29778);
                    break;
                case 60:
                    c2790.f8702 = obtainStyledAttributes.getFloat(index, c2790.f8702);
                    break;
                case 61:
                    c9846.f29781 = m12665(obtainStyledAttributes, index, c9846.f29781);
                    break;
                case 62:
                    c9846.f29806 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29806);
                    break;
                case 63:
                    c9846.f29789 = obtainStyledAttributes.getFloat(index, c9846.f29789);
                    break;
                case 64:
                    c9140.f27672 = m12665(obtainStyledAttributes, index, c9140.f27672);
                    break;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        c9140.f27678 = obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        c9140.f27678 = C8518.f26034[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c9140.f27675 = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    c9140.f27674 = obtainStyledAttributes.getFloat(index, c9140.f27674);
                    break;
                case 68:
                    c16194.f49871 = obtainStyledAttributes.getFloat(index, c16194.f49871);
                    break;
                case 69:
                    c9846.f29777 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    c9846.f29776 = obtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    c9846.f29788 = obtainStyledAttributes.getInt(index, c9846.f29788);
                    break;
                case 73:
                    c9846.f29792 = obtainStyledAttributes.getDimensionPixelSize(index, c9846.f29792);
                    break;
                case 74:
                    c9846.f29800 = obtainStyledAttributes.getString(index);
                    break;
                case 75:
                    c9846.f29774 = obtainStyledAttributes.getBoolean(index, c9846.f29774);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                    c9140.f27676 = obtainStyledAttributes.getInt(index, c9140.f27676);
                    break;
                case 77:
                    c9846.f29790 = obtainStyledAttributes.getString(index);
                    break;
                case 78:
                    c16194.f49873 = obtainStyledAttributes.getInt(index, c16194.f49873);
                    break;
                case 79:
                    c9140.f27677 = obtainStyledAttributes.getFloat(index, c9140.f27677);
                    break;
                case 80:
                    c9846.f29799 = obtainStyledAttributes.getBoolean(index, c9846.f29799);
                    break;
                case 81:
                    c9846.f29763 = obtainStyledAttributes.getBoolean(index, c9846.f29763);
                    break;
                case 82:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
        return c21135;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m12664(C6128 c6128, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(",");
        Context context = c6128.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C15488.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c6128.isInEditMode() && (c6128.getParent() instanceof C17606) && (designInformation = ((C17606) c6128.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21135 m12668(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f13668;
        if (hashMap.containsKey(valueOf)) {
            return (C21135) hashMap.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m12678() {
        Integer[] numArr = (Integer[]) this.f13668.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12680() {
        this.f13669 = false;
    }
}
