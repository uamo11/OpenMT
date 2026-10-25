package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

/* compiled from: I16G */
/* renamed from: l.ܺ᩺ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16249 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f49997 = true;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m38214() {
        return C16293.m38327().m36526("injectionSchemes");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m38218() {
        AbstractC15440 m38214 = m38214();
        List<String> mo27931 = m38214.mo27931();
        ArrayList arrayList = new ArrayList(mo27931.size());
        for (String str : mo27931) {
            if (str.toLowerCase().endsWith(".json")) {
                arrayList.add(str.substring(0, str.length() - 5));
            }
        }
        Collections.sort(arrayList);
        if (f49997 && arrayList.isEmpty()) {
            String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f1208e9);
            try {
                m38214.m36526(m14327 + ".json").m36510("{\"a\":[{\"b\":{\"a\":\"\",\"b\":0,\"c\":1,\"d\":\"\",\"e\":0,\"f\":1,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"Ljava\\/lang\\/String;\",\"k\":0,\"l\":0,\"m\":0,\"n\":0,\"o\":1},\"c\":0,\"d\":0},{\"b\":{\"a\":\"Ljava\\/lang\\/String;\",\"b\":0,\"c\":0,\"d\":\"<init>\",\"e\":0,\"f\":0,\"g\":\"\",\"h\":0,\"i\":1,\"j\":\"V\",\"k\":0,\"l\":0,\"m\":0,\"n\":1,\"o\":0},\"c\":1,\"d\":1}]}");
                arrayList.add(m14327);
            } catch (IOException unused) {
            }
        }
        f49997 = false;
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m38220(String str, String str2) {
        AbstractC15440 m36526 = m38214().m36526(str + ".json");
        AbstractC15440 m365262 = m38214().m36526(str2.concat(".json"));
        if (!str.equalsIgnoreCase(str2)) {
            return m36526.mo23551(m365262);
        }
        AbstractC15440 m36520 = m36526.m36520(".tmp");
        return m36526.mo23551(m36520) && m36520.mo23551(m365262);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38216(String str, String str2) {
        AbstractC15440 m38214 = m38214();
        m38214.m36526(str + ".json").m36500(m38214.m36526(str2.concat(".json")), (C17558) null, (InterfaceC5627) null);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m38222(String str) {
        return C15472.m36561(5, 0, m38214().m36526(str.concat(".json")).m36492(true).getName());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38215(String str) {
        m38214().m36526(str + ".json").mo23552();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m38219(String str) {
        return m38214().m36526(str + ".json").mo23120();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9195 m38221(String str) {
        AbstractC15440 m36526 = m38214().m36526(str + ".json");
        C9195 c9195 = new C9195(str);
        c9195.m23630(new JSONObject(m36526.m36489()));
        return c9195;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38217(C9195 c9195) {
        m38214().m36526(c9195.f27870 + ".json").m36510(c9195.m23632().toString());
    }
}
