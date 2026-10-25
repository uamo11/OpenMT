package l;

import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.statistics.b;
import com.umeng.commonsdk.statistics.idtracking.i;

/* compiled from: 041R */
/* renamed from: l.᩶ᩴ֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC20347 {
    AUXILIARYCLASS("auxiliaryclass"),
    CAST("cast"),
    CLASSFILE("classfile"),
    DEPRECATION("deprecation"),
    DEP_ANN("dep-ann"),
    DIVZERO("divzero"),
    EMPTY(b.f),
    EXPORTS("exports"),
    FALLTHROUGH("fallthrough"),
    FINALLY("finally"),
    MISSING_EXPLICIT_CTOR("missing-explicit-ctor"),
    MODULE(am.e),
    OPENS("opens"),
    OPTIONS("options"),
    OVERLOADS("overloads"),
    OVERRIDES("overrides"),
    PATH(MotionUtils.EASING_TYPE_PATH),
    PROCESSING("processing"),
    RAW("rawtypes"),
    REMOVAL("removal"),
    REQUIRES_AUTOMATIC("requires-automatic"),
    REQUIRES_TRANSITIVE_AUTOMATIC("requires-transitive-automatic"),
    SERIAL(i.a),
    STATIC("static"),
    STRICTFP("strictfp"),
    SYNCHRONIZATION("synchronization"),
    TEXT_BLOCKS("text-blocks"),
    TRY("try"),
    UNCHECKED("unchecked"),
    VARARGS("varargs"),
    PREVIEW("preview");


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f65710;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f65711;

    EnumC20347(String str) {
        this(str, false);
    }

    EnumC20347(String str, boolean z) {
        ConcurrentMapC10942 concurrentMapC10942;
        this.f65711 = str;
        this.f65710 = z;
        concurrentMapC10942 = C4824.f15247;
        concurrentMapC10942.put(str, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC20347 m46670(String str) {
        ConcurrentMapC10942 concurrentMapC10942;
        concurrentMapC10942 = C4824.f15247;
        return (EnumC20347) concurrentMapC10942.get(str);
    }
}
