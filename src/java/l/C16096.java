package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;

/* compiled from: K77A */
/* renamed from: l.ܺᩳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16096 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f49590;

    public C16096(boolean z) {
        this.f49590 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m37986() {
        JSONObject object = JSON.object();
        boolean z = this.f49590;
        return object.add("confused", z).add("appReferenceOutput", z ? "hex8_upper_no_0x" : "names_or_hex").add("appNameReferencesAccepted", !z).add("systemNameReferencesAccepted", true).add("hexPrefixAccepted", true);
    }
}
