package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.util.Iterator;

/* compiled from: P7A5 */
/* renamed from: l.ۙۛ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4470 {
    /* renamed from: ֫ */
    public abstract C12936 mo3035(JSONObject jSONObject);

    /* renamed from: ۧ */
    public abstract String mo3036();

    /* renamed from: ܳ */
    public abstract String mo3037();

    /* renamed from: ܽ */
    public abstract JSONObject mo3038();

    /* renamed from: ܿ */
    public abstract JSONObject mo3039();

    /* renamed from: ᩳ */
    public abstract String mo3040();

    /* renamed from: ֫ */
    public JSONObject mo3034(C3059 c3059) {
        JSONObject add = JSON.object().add("errorCode", c3059.f9610).add("message", c3059.getMessage()).add("recoverable", c3059.f9607).add("retrySameArguments", c3059.f9606).add("errorSeverity", c3059.f9611).add("nextActions", c3059.f9604);
        Iterator it = c3059.f9609.iterator();
        while (it.hasNext()) {
            JSONObject.Member member = (JSONObject.Member) it.next();
            String name = member.getName();
            if (!"errorCode".equals(name) && !"message".equals(name) && !"recoverable".equals(name) && !"retrySameArguments".equals(name) && !"errorSeverity".equals(name) && !"nextActions".equals(name)) {
                add.put(name, member.getValue());
            }
        }
        return add;
    }

    /* renamed from: ֫ */
    public JSONObject mo3033() {
        return JSON.object();
    }
}
