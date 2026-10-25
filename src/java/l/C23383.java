package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import com.umeng.analytics.pro.am;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: A768 */
/* renamed from: l.᩻֫ۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23383 extends AbstractC4470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22241 f75127;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public JSONObject f75128;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13682 f75129;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C19793 f75130;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public JSONObject f75131;

    @Override // l.AbstractC4470
    /* renamed from: ۧ */
    public final String mo3036() {
        return "Start here for an overview of a zip_entry ELF in the base APK or edited session view. Returns summary metadata and complete unfiltered item counts, not detail lists. Copy a nextActions call to mt_apk_native_list_items for details. Use mt_apk_native_map_address for address conversion, mt_apk_native_disassemble for instruction text, and mt_apk_read_bytes for raw entry bytes.";
    }

    @Override // l.AbstractC4470
    /* renamed from: ܳ */
    public final String mo3037() {
        return "Inspect Native ELF";
    }

    @Override // l.AbstractC4470
    /* renamed from: ᩳ */
    public final String mo3040() {
        return "mt_apk_native_inspect";
    }

    public C23383(C19793 c19793) {
        C22241 c22241 = new C22241();
        C13682 c13682 = new C13682();
        this.f75130 = c19793;
        this.f75127 = c22241;
        this.f75129 = c13682;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3033() {
        return JSON.object().add("readOnlyHint", true);
    }

    @Override // l.AbstractC4470
    /* renamed from: ܽ */
    public final JSONObject mo3038() {
        JSONObject jSONObject = this.f75128;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject m12038 = C3993.m12038("{\n  \"workspaceId\": {\n    \"type\": \"string\",\n    \"description\": \"Workspace id returned by mt_apk_workspace_open.\"\n  },\n  \"editSessionId\": {\n    \"type\": \"string\",\n    \"description\": \"Edit session id. Pass the id returned by mt_apk_session_create to inspect the edited session view; pass an empty string to inspect the base APK.\"\n  },\n  \"locator\": {\n    \"type\": \"string\",\n    \"description\": \"ZIP entry locator string such as zip_entry:lib/arm64-v8a/libexample.so. The zip_entry: prefix is required.\"\n  }\n}\n");
        this.f75128 = m12038;
        return m12038;
    }

    @Override // l.AbstractC4470
    /* renamed from: ܿ */
    public final JSONObject mo3039() {
        JSONObject jSONObject = this.f75131;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject add = JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id, or empty string for base APK.")).add("locator", C1648.m5545("string", "zip_entry locator.")).add("type", C1648.m5545("string", "ELF binary type.")).add("arch", C1648.m5545("string", "ELF architecture.")).add(am.w, C1648.m5545("string", "ELF CPU name.")).add("machine", C1648.m5545("string", "ELF machine name.")).add("abi", C1648.m5545("string", "ELF ABI.")).add(am.x, C1648.m5545("string", "Target OS.")).add("subsystem", C1648.m5545("string", "Subsystem.")).add("interpreter", C1648.m5545("string", "ELF interpreter path from metadata, or empty string.")).add("archBits", C1648.m5545("integer", "ELF class/ABI bit width. ARM32 ELF reports 32 even when Thumb instructions use 16-bit mode.")).add("hasVirtualAddress", C1648.m5545(ClassTransform.BOOLEAN, "Whether virtual addresses are present.")).add("positionIndependent", C1648.m5545(ClassTransform.BOOLEAN, "Whether the ELF is position independent.")).add("nx", C1648.m5545(ClassTransform.BOOLEAN, "Whether NX is enabled.")).add("canary", C1648.m5545(ClassTransform.BOOLEAN, "Whether a stack canary was detected.")).add("baseAddress", C1648.m5542("string", "ELF base address, or null.")).add("entryVirtualAddress", C1648.m5542("string", "Entry virtual address, or null.")).add("entryFileOffset", C1648.m5542("string", "Entry ELF file offset within the zip_entry bytes, or null.")).add("initVirtualAddress", C1648.m5542("string", "Init virtual address, or null.")).add("finiVirtualAddress", C1648.m5542("string", "Fini virtual address, or null."));
        JSONObject object = JSON.object();
        String[] strArr = {"neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations"};
        for (int i = 0; i < 9; i++) {
            String str = strArr[i];
            object.add(str, C1648.m5545("integer", "Complete " + str + " count."));
        }
        JSONObject m5535 = C1648.m5535("Result for mt_apk_native_inspect. ELF summary metadata and unfiltered counts. Use nextActions for detail lists.", C1648.m5532(add.add("counts", C1648.m5532(object, "Complete ELF detail counts. Use mt_apk_native_list_items to read exactly one itemKind list; entries counts all loader-recognized ELF entry point records, including program, init, fini, and preinit entries when present. initArray and finiArray separately count .init_array/.fini_array pointer slots and may describe the same lifecycle target with slot metadata.")), "ELF summary metadata for a ZIP entry. Detail lists are available only through mt_apk_native_list_items."), C1648.m5540(C1648.m5532(JSON.object(), "No tool-specific diagnostics.")), C1648.m5538("First-page native detail reads. Copy one action's arguments to mt_apk_native_list_items; each action already selects an itemKind with count > 0.", C1648.m5533(C18736.m43390(JSON.object().add("workspaceId", C1648.m5545("string", "Workspace id.")).add("editSessionId", C1648.m5545("string", "Edit session id. Empty string reads the base APK; otherwise copy the id from the edited session.")).add("locator", C1648.m5545("string", "ZIP entry locator for the native ELF.")).add("itemKind", C1648.m5539("ELF list to read; copy unchanged.", "neededLibraries", "sections", "segments", "imports", "symbols", "entries", "initArray", "finiArray", "relocations")).add("namePrefix", C1648.m5545("string", "Case-sensitive prefix of the raw item name; empty means no filter.")).add("demangle", C1648.m5545(ClassTransform.BOOLEAN, "Whether to include readable C++ names; filtering still uses raw names.")), "integer", "First page size; suggested value is 100 and maximum is 500.", "limit", "Arguments for mt_apk_native_list_items."), "mt_apk_native_list_items", "inspect")));
        this.f75131 = m5535;
        return m5535;
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final C12936 mo3035(JSONObject jSONObject) {
        final C0277 c0277;
        C19793 c19793 = this.f75130;
        try {
            c0277 = C4511.m13272(jSONObject);
        } catch (Throwable th) {
            th = th;
            c0277 = null;
        }
        try {
            String str = c0277.f1601;
            InterfaceC19785 m45535 = c19793.m45535();
            try {
                C12936 c12936 = new C12936((JSONObject) c19793.m45513(str, new InterfaceC16263() { // from class: l.ܿ֫ۜ
                    @Override // l.InterfaceC16263
                    /* renamed from: ֫ */
                    public final JSONObject mo1083(C14852 c14852, C15799 c15799) {
                        return C23383.m51834(C23383.this, c0277, c14852, c15799);
                    }
                }));
                m45535.close();
                c19793.m45533(str);
                int i = C8869.f27007;
                return c12936;
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0277 != null) {
                c19793.m45533(c0277.f1601);
            }
            int i2 = C8869.f27007;
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ JSONObject m51834(final C23383 c23383, final C0277 c0277, C14852 c14852, C15799 c15799) {
        C13682 c13682 = c23383.f75129;
        String str = c0277.f1598;
        String str2 = c0277.f1599;
        InterfaceC22855 interfaceC22855 = new InterfaceC22855() { // from class: l.ܳ֫ۜ
            @Override // l.InterfaceC22855
            /* renamed from: ֫ */
            public final Object mo14558(C7333 c7333) {
                return C23383.m51833(C23383.this, c0277, c7333);
            }
        };
        c13682.getClass();
        return (JSONObject) C13682.m32921(c14852, c15799, str, str2, interfaceC22855);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static JSONObject m51833(C23383 c23383, C0277 c0277, C7333 c7333) {
        String str = c7333.f22530;
        try {
            c23383.f75127.getClass();
            return C12095.m29477(c0277, C16036.m37908(str));
        } catch (RuntimeException unused) {
            throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }

    @Override // l.AbstractC4470
    /* renamed from: ֫ */
    public final JSONObject mo3034(C3059 c3059) {
        return C19993.m46097(c3059, JSON.NULL, JSON.array());
    }
}
