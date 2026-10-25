package l;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: 66PI */
/* renamed from: l.֫֡ܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1476 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f5285;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Map f5286;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C5855 f5287;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C8011 f5288;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f5289;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final BitSet f5290;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C7225 f5291;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f5292;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f5293;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f5294;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile C9466 f5295;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C5855 f5296;

    public C1476(C5855 c5855, C5855 c58552, int i, int i2, int i3, int i4, C7225 c7225, boolean z, BitSet bitSet, Map map, C8011 c8011) {
        this.f5287 = c5855;
        this.f5296 = c58552;
        this.f5289 = i;
        this.f5285 = i2;
        this.f5294 = i3;
        this.f5293 = i4;
        this.f5291 = c7225;
        this.f5292 = z;
        this.f5290 = bitSet == null ? null : (BitSet) bitSet.clone();
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            C11003.requireNonNull(key);
            Object value = entry.getValue();
            C11003.requireNonNull(value);
            hashMap.put(key, value);
        }
        this.f5286 = C20195.unmodifiableMap(hashMap);
        this.f5288 = c8011;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9466 m5105() {
        C9466 c9466;
        C9466 c94662 = this.f5295;
        if (c94662 != null) {
            return c94662;
        }
        synchronized (this) {
            c9466 = this.f5295;
            if (c9466 == null) {
                this.f5288.getClass();
                c9466 = C2720.m8460(this);
                this.f5295 = c9466;
            }
        }
        return c9466;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5106(int i) {
        BitSet bitSet = this.f5290;
        return bitSet != null && bitSet.get(i);
    }
}
