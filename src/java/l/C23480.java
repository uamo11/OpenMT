package l;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: Z1AK */
/* renamed from: l.᩻ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23480 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static HashMap f75337;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f75338 = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f75337 = hashMap;
        try {
            hashMap.put("KeyAttribute", C7812.class.getConstructor(null));
            hashMap.put("KeyPosition", C20659.class.getConstructor(null));
            hashMap.put("KeyCycle", C21924.class.getConstructor(null));
            hashMap.put("KeyTimeCycle", C15718.class.getConstructor(null));
            hashMap.put("KeyTrigger", C3725.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    public C23480(Context context, XmlResourceParser xmlResourceParser) {
        HashMap hashMap;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC4990 abstractC4990 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap hashMap2 = f75337;
                    if (hashMap2.containsKey(name)) {
                        try {
                            AbstractC4990 abstractC49902 = (AbstractC4990) ((Constructor) hashMap2.get(name)).newInstance(null);
                            try {
                                abstractC49902.mo11328(context, Xml.asAttributeSet(xmlResourceParser));
                                HashMap hashMap3 = this.f75338;
                                if (!hashMap3.containsKey(Integer.valueOf(abstractC49902.f15713))) {
                                    hashMap3.put(Integer.valueOf(abstractC49902.f15713), new ArrayList());
                                }
                                ((ArrayList) hashMap3.get(Integer.valueOf(abstractC49902.f15713))).add(abstractC49902);
                            } catch (Exception unused) {
                            }
                            abstractC4990 = abstractC49902;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && abstractC4990 != null && (hashMap = abstractC4990.f15711) != null) {
                        C13888.m33290(context, xmlResourceParser, hashMap);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused3) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51934(C19248 c19248) {
        Integer valueOf = Integer.valueOf(c19248.f60606);
        HashMap hashMap = this.f75338;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList != null) {
            c19248.m44407(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) hashMap.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                AbstractC4990 abstractC4990 = (AbstractC4990) it.next();
                String str = ((C16900) c19248.f60588.getLayoutParams()).f51940;
                String str2 = abstractC4990.f15714;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    c19248.m44408(abstractC4990);
                }
            }
        }
    }
}
