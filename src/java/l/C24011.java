package l;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: 492R */
/* renamed from: l.᩻᩺ܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C24011 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f77814;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f77816;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f77817;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f77818;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18095 f77813 = new C18095();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18095 f77815 = new C18095();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18095 f77819 = new C18095();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52853(C24011 c24011) {
        this.f77813.m42215(c24011.f77813);
        this.f77815.m42215(c24011.f77815);
        this.f77819.m42215(c24011.f77819);
        this.f77814 = c24011.f77814;
        this.f77818 = c24011.f77818;
        this.f77816 = c24011.f77816;
        this.f77817 = c24011.f77817;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52852() {
        return this.f77813 + "->" + this.f77815 + ":" + this.f77819;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final JSONObject m52854() {
        try {
            JSONObject jSONObject = new JSONObject();
            this.f77813.m42220(jSONObject, 'a');
            this.f77819.m42220(jSONObject, 'd');
            this.f77815.m42220(jSONObject, 'g');
            jSONObject.put("j", this.f77814 ? 1 : 0);
            jSONObject.put("k", this.f77818 ? 1 : 0);
            jSONObject.put("l", this.f77816 ? 1 : 0);
            jSONObject.put("m", this.f77817 ? 1 : 0);
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
