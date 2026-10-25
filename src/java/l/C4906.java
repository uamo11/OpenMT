package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: 31AL */
/* renamed from: l.ۙ᩸, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4906 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f15490;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SparseArray f15491 = new SparseArray();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C4906(Context context, XmlResourceParser xmlResourceParser) {
        this.f15490 = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C21840.f69992);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f15490 = obtainStyledAttributes.getResourceId(index, this.f15490);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            C22545 c22545 = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                C22545 c225452 = new C22545(context, xmlResourceParser);
                                this.f15491.put(c225452.f72936, c225452);
                                c22545 = c225452;
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                C20429 c20429 = new C20429(context, xmlResourceParser);
                                if (c22545 != null) {
                                    c22545.f72937.add(c20429);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14278(float f, float f2, int i, int i2) {
        C22545 c22545 = (C22545) this.f15491.get(i2);
        if (c22545 == null) {
            return i2;
        }
        ArrayList arrayList = c22545.f72937;
        int i3 = c22545.f72935;
        if (f != -1.0f && f2 != -1.0f) {
            Iterator it = arrayList.iterator();
            C20429 c20429 = null;
            while (it.hasNext()) {
                C20429 c204292 = (C20429) it.next();
                if (c204292.m46832(f, f2)) {
                    if (i != c204292.f65921) {
                        c20429 = c204292;
                    }
                }
            }
            return c20429 != null ? c20429.f65921 : i3;
        }
        if (i3 != i) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (i == ((C20429) it2.next()).f65921) {
                }
            }
            return i3;
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14279(int i) {
        C22545 c22545;
        float f = -1;
        int i2 = 0;
        SparseArray sparseArray = this.f15491;
        if (-1 == i) {
            if (i == -1) {
                c22545 = (C22545) sparseArray.valueAt(0);
            } else {
                c22545 = (C22545) sparseArray.get(-1);
            }
            if (c22545 != null) {
                ArrayList arrayList = c22545.f72937;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((C20429) arrayList.get(i2)).m46832(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? c22545.f72935 : ((C20429) arrayList.get(i2)).f65921;
                }
            }
        } else {
            C22545 c225452 = (C22545) sparseArray.get(i);
            if (c225452 != null) {
                ArrayList arrayList2 = c225452.f72937;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((C20429) arrayList2.get(i2)).m46832(f, f)) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? c225452.f72935 : ((C20429) arrayList2.get(i2)).f65921;
            }
        }
        return -1;
    }
}
