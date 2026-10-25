package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: W6LP */
/* renamed from: l.ۢ᩵ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9790 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6657 f29615;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12821 f29616;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17760 f29617;

    public C9790(C17760 c17760, C12821 c12821) {
        this.f29617 = c17760;
        this.f29616 = c12821;
        this.f29615 = new C6657(c17760);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final JSONObject m24824(JSONObject jSONObject) {
        String str;
        C5556.m15717(jSONObject, MotionUtils.EASING_TYPE_PATH, "entries", "password", "overwrite");
        String m15720 = C5556.m15720(jSONObject, "password");
        boolean m15719 = C5556.m15719(jSONObject, "overwrite");
        C17760 c17760 = this.f29617;
        C7383 m41607 = c17760.m41607();
        String m41599 = C17760.m41599(C5556.m15720(jSONObject, MotionUtils.EASING_TYPE_PATH), m41607, MotionUtils.EASING_TYPE_PATH);
        C23900 c23900 = new C23900(m41599);
        try {
            try {
                ArrayList m24814 = m24814(C5556.m15711(jSONObject, "entries"), m41607);
                ArrayList arrayList = new ArrayList();
                arrayList.add(m41599);
                Iterator it = m24814.iterator();
                while (it.hasNext()) {
                    str = ((C18256) it.next()).f56774;
                    arrayList.add(str);
                }
                C10000 m41609 = c17760.m41609(arrayList);
                try {
                    c17760.m41607().m19883(m41599);
                    C5556.m15715(c17760, m41599, false);
                    C18090 m42167 = C18090.m42167(c17760.m41612(m41599), false);
                    try {
                        m42167.m42192(m15720);
                        C14727 m24817 = m24817(m42167, m24814, m41599, m15720, c23900);
                        m24820(m24817, m41599, m15719, c23900);
                        m24821(m42167, m24817, m41599, m15719, c23900);
                        m42167.close();
                        m41609.close();
                        return JSON.object().add(MotionUtils.EASING_TYPE_PATH, m41599).add("completedFiles", c23900.f77268).add("createdDirectories", c23900.f77269).add("warnings", c23900.f77270);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        m41609.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IllegalArgumentException | IllegalStateException | SecurityException | UnsupportedOperationException unused) {
                C3059 m9369 = C3059.m9369("ZIP_IO_ERROR", "The storage backend failed during ZIP extraction", "fatal", null, JSON.object());
                if (c23900.f77273) {
                    m9369.f9609.put("changed", true).put("stateKnown", false);
                }
                c23900.m52656(m9369);
                throw m9369;
            }
        } catch (IOException e) {
            C3059 m24823 = m24823(e);
            c23900.m52656(m24823);
            throw m24823;
        } catch (C3059 e2) {
            e = e2;
            if ("FILE_OPERATION_INTERRUPTED".equals(e.f9610)) {
                e = C3059.m9365("ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled", "warning", e.f9604, e.f9609);
            }
            c23900.m52656(e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m24814(JSONArray jSONArray, C7383 c7383) {
        String str;
        JSONObject m15712;
        String m15720;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.size(); i++) {
            String str2 = null;
            try {
                m15712 = C5556.m15712("entries", jSONArray.get(i));
                C5556.m15717(m15712, "entryPath", "destinationPath");
                m15720 = C5556.m15720(m15712, "entryPath");
            } catch (C3059 e) {
                e = e;
                str = null;
            }
            try {
                str2 = C5556.m15720(m15712, "destinationPath");
                boolean z = true;
                C5556.m15718(m15720, "entryPath", true);
                if (!m15720.isEmpty() && !m15720.endsWith("/")) {
                    z = false;
                }
                if (z != str2.endsWith("/")) {
                    throw C5556.m15713(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "Directory mappings require trailing slashes on both paths");
                }
                String m29843 = C12301.m29843(c7383, str2, "destinationPath", false);
                c7383.m19884(m29843);
                if (!z) {
                    c7383.m19882(m29843);
                }
                arrayList.add(new C18256(m15720, i, m29843, z));
            } catch (C3059 e2) {
                e = e2;
                str = str2;
                str2 = m15720;
                JSONArray array = JSON.array(i);
                JSONObject jSONObject = e.f9609;
                jSONObject.put("operationIndexes", array);
                if (str2 != null) {
                    jSONObject.put("entryPaths", JSON.array(str2));
                }
                if (str != null) {
                    jSONObject.put("destinationPath", str);
                }
                throw e;
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14727 m24817(C18090 c18090, ArrayList arrayList, String str, String str2, C23900 c23900) {
        boolean z;
        String str3;
        boolean z2;
        String str4;
        String str5;
        int i;
        boolean z3;
        String str6;
        String str7;
        String str8;
        boolean z4;
        int i2;
        String str9;
        boolean z5;
        C23734 c23734;
        ArrayList arrayList2;
        Iterator it;
        String str10;
        int i3;
        String str11;
        String str12;
        String str13;
        String str14;
        int i4;
        String str15;
        String str16;
        int i5;
        Iterator it2;
        String str17;
        C23734 c237342 = new C23734(c18090.m42210());
        ArrayList arrayList3 = new ArrayList(c18090.m42210());
        C6083.sort(arrayList3, C8200.comparing(new C6639(2)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C18256 c18256 = (C18256) it3.next();
            C5556.m15716();
            str7 = c18256.f56776;
            str8 = c18256.f56774;
            z4 = c18256.f56775;
            i2 = c18256.f56777;
            c23900.f77271 = new C17550(null, str7, str8, z4, i2);
            str9 = c18256.f56776;
            C3545 entry = c18090.getEntry(str9);
            z5 = c18256.f56775;
            if (z5) {
                str11 = c18256.f56776;
                if (!str11.isEmpty() && entry == null) {
                    str17 = c18256.f56776;
                    if (c237342.m4933(str17) == null) {
                        throw C5556.m15713(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP directory does not exist");
                    }
                }
                if (entry != null) {
                    m24819(entry);
                }
                m24818(linkedHashMap, c23900.f77271, str);
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C3545 c3545 = (C3545) it4.next();
                    String name = c3545.getName();
                    str12 = c18256.f56776;
                    if (name.startsWith(str12)) {
                        String name2 = c3545.getName();
                        str13 = c18256.f56776;
                        if (name2.equals(str13)) {
                            continue;
                        } else {
                            String name3 = c3545.getName();
                            str14 = c18256.f56774;
                            boolean isDirectory = c3545.isDirectory();
                            i4 = c18256.f56777;
                            C23734 c237343 = c237342;
                            c23900.f77271 = new C17550(c3545, name3, str14, isDirectory, i4);
                            m24819(c3545);
                            String name4 = c3545.getName();
                            str15 = c18256.f56776;
                            String substring = name4.substring(str15.length());
                            boolean isDirectory2 = c3545.isDirectory();
                            int i6 = 0;
                            int i7 = 0;
                            while (true) {
                                ArrayList arrayList4 = arrayList3;
                                if (i6 <= substring.length()) {
                                    if (i6 < substring.length()) {
                                        it2 = it3;
                                        if (substring.charAt(i6) != '/' && substring.charAt(i6) != '\\') {
                                            i6++;
                                            it3 = it2;
                                            arrayList3 = arrayList4;
                                        }
                                    } else {
                                        it2 = it3;
                                    }
                                    if (i6 - i7 == 2 && substring.charAt(i7) == '.' && substring.charAt(i7 + 1) == '.') {
                                        throw C5556.m15713(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The extraction path contains a parent directory segment");
                                    }
                                    i7 = i6 + 1;
                                    i6++;
                                    it3 = it2;
                                    arrayList3 = arrayList4;
                                } else {
                                    Iterator it5 = it3;
                                    try {
                                        String m39860 = C16999.m39860(substring, isDirectory2);
                                        if (isDirectory2 && !m39860.isEmpty()) {
                                            m39860 = m39860 + "/";
                                        }
                                        if (!c3545.isDirectory() || !m39860.isEmpty()) {
                                            str16 = c18256.f56774;
                                            String m29847 = C12301.m29847("/".equals(str16) ? C16014.m37867(str16, m39860) : C22870.m50967(str16, "/", m39860), "destinationPath");
                                            String name5 = c3545.getName();
                                            boolean isDirectory3 = c3545.isDirectory();
                                            i5 = c18256.f56777;
                                            C17550 c17550 = new C17550(c3545, name5, m29847, isDirectory3, i5);
                                            c23900.f77271 = c17550;
                                            if (c3545.m10808() && str2.isEmpty()) {
                                                throw C5556.m15713(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                                            }
                                            m24818(linkedHashMap, c17550, str);
                                        }
                                        it3 = it5;
                                        arrayList3 = arrayList4;
                                        c237342 = c237343;
                                    } catch (IOException unused) {
                                        throw C5556.m15713(JSON.object(), "ZIP_UNSAFE_ENTRY_PATH", "The ZIP entry has an unsafe extraction path");
                                    }
                                }
                            }
                        }
                    }
                }
                c23734 = c237342;
                arrayList2 = arrayList3;
                it = it3;
            } else {
                c23734 = c237342;
                arrayList2 = arrayList3;
                it = it3;
                if (entry == null) {
                    throw C5556.m15713(JSON.object(), "ZIP_ENTRY_NOT_FOUND", "The ZIP entry does not exist");
                }
                m24819(entry);
                if (entry.m10808() && str2.isEmpty()) {
                    throw C5556.m15713(JSON.object(), "ZIP_PASSWORD_REQUIRED", "The ZIP entry requires a password");
                }
                String name6 = entry.getName();
                str10 = c18256.f56774;
                i3 = c18256.f56777;
                C17550 c175502 = new C17550(entry, name6, str10, false, i3);
                c23900.f77271 = c175502;
                m24818(linkedHashMap, c175502, str);
            }
            it3 = it;
            arrayList3 = arrayList2;
            c237342 = c23734;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        for (C17550 c175503 : linkedHashMap.values()) {
            c23900.f77271 = c175503;
            z = c175503.f53646;
            if (z) {
                str6 = c175503.f53645;
                linkedHashMap2.put(m24813(str6), c175503);
            } else {
                arrayList5.add(c175503);
            }
            str3 = c175503.f53645;
            for (String m24822 = m24822(str3); m24822 != null; m24822 = m24822(m24822)) {
                C17550 c175504 = (C17550) linkedHashMap.get(m24813(m24822));
                if (c175504 != null) {
                    z3 = c175504.f53646;
                    if (!z3) {
                        throw m24816(c175504, c175503, m24822);
                    }
                }
            }
            z2 = c175503.f53646;
            if (!z2) {
                str4 = c175503.f53645;
                String m248222 = m24822(str4);
                if (m248222 == null) {
                    throw C5556.m15713(JSON.object(), "FILE_PARENT_NOT_FOUND", "The output has no parent directory");
                }
                String m24813 = m24813(m248222);
                str5 = c175503.f53649;
                i = c175503.f53648;
                C13843.putIfAbsent(linkedHashMap2, m24813, new C17550(null, str5, m248222, true, i));
            }
        }
        ArrayList arrayList6 = new ArrayList(linkedHashMap2.values());
        C6083.sort(arrayList6, C8200.comparingInt(new C2028()));
        return new C14727(arrayList6, arrayList5);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24820(C14727 c14727, String str, boolean z, C23900 c23900) {
        List list;
        List list2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        C17760 c17760 = this.f29617;
        C7383 m41607 = c17760.m41607();
        m41607.m19883(str);
        list = c14727.f44977;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C17550 c17550 = (C17550) it.next();
            C5556.m15716();
            c23900.f77271 = c17550;
            str6 = c17550.f53645;
            m41607.m19884(str6);
            C6657 c6657 = this.f29615;
            str7 = c17550.f53645;
            c6657.m18194(str7);
        }
        list2 = c14727.f44978;
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            C17550 c175502 = (C17550) it2.next();
            C5556.m15716();
            c23900.f77271 = c175502;
            str2 = c175502.f53645;
            m41607.m19884(str2);
            str3 = c175502.f53645;
            m41607.m19882(str3);
            str4 = c175502.f53645;
            int i = C16844.f51703[c17760.m41613(str4).m30885().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw C5556.m15713(JSON.object(), "ZIP_PATH_TYPE_MISMATCH", "A directory cannot be used as an extracted file destination");
                    }
                    throw C3059.m9369("FILE_UNSUPPORTED_TYPE", "Extraction destinations must be regular files or missing paths", "fatal", null, JSON.object());
                }
            } else if (!z) {
                throw C5556.m15713(JSON.object(), "FILE_ALREADY_EXISTS", "An extraction destination exists and overwrite is false");
            }
            str5 = c175502.f53645;
            if (c17760.m41612(str5).mo23558().mo8669(EnumC13324.CREATE_FILE_EXCLUSIVE) == EnumC4858.UNSUPPORTED) {
                throw C3059.m9369("FILE_BACKEND_UNSUPPORTED", "The destination backend cannot safely create temporary extraction files", "fatal", null, JSON.object());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24821(C18090 c18090, C14727 c14727, String str, boolean z, C23900 c23900) {
        List list;
        C17760 c17760;
        List list2;
        String str2;
        String str3;
        list = c14727.f44977;
        Iterator it = ((ArrayList) list).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c17760 = this.f29617;
            if (!hasNext) {
                break;
            }
            C17550 c17550 = (C17550) it.next();
            c23900.f77271 = c17550;
            C5556.m15716();
            c17760.m41607().m19883(str);
            c23900.f77273 = true;
            C6657 c6657 = this.f29615;
            str3 = c17550.f53645;
            C23590 m18193 = c6657.m18193(str3);
            c23900.f77273 = false;
            c23900.f77269 += m18193.f76477;
            c23900.m52655(m18193.f76479);
        }
        list2 = c14727.f44978;
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            C17550 c175502 = (C17550) it2.next();
            c23900.f77271 = c175502;
            C5556.m15716();
            C7383 m41607 = c17760.m41607();
            m41607.m19883(str);
            c23900.f77273 = true;
            str2 = c175502.f53645;
            C0120 m31187 = this.f29616.m31187(str2, z, m41607, new C11201(c18090, c175502, str));
            c23900.f77273 = false;
            c23900.f77268++;
            c23900.m52655(m31187.f1123);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m24812(C3545 c3545, C18090 c18090) {
        try {
            return new C21079(c18090.m42202(c3545));
        } catch (IOException e) {
            throw m24823(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24819(C3545 c3545) {
        if ((c3545.m10778() & 61440) == 40960) {
            throw C3059.m9369("ZIP_UNSUPPORTED_ENTRY", "Symbolic link entries cannot be extracted by this tool", "fatal", null, JSON.object());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24818(LinkedHashMap linkedHashMap, C17550 c17550, String str) {
        String str2;
        String str3;
        String str4;
        str2 = c17550.f53645;
        if (C16999.m39878(str, str2)) {
            throw C5556.m15713(JSON.object(), "ZIP_SOURCE_DESTINATION_CONFLICT", "Extraction cannot replace its source ZIP");
        }
        str3 = c17550.f53645;
        C17550 c175502 = (C17550) C13843.putIfAbsent(linkedHashMap, m24813(str3), c17550);
        if (c175502 == null) {
            return;
        }
        str4 = c17550.f53645;
        throw m24816(c175502, c17550, str4);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m24816(C17550 c17550, C17550 c175502, String str) {
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        String str4;
        String str5;
        int i4;
        i = c17550.f53648;
        JSONArray array = JSON.array(i);
        i2 = c175502.f53648;
        i3 = c17550.f53648;
        if (i2 != i3) {
            i4 = c175502.f53648;
            array.add(i4);
        }
        str2 = c17550.f53649;
        JSONArray array2 = JSON.array(str2);
        str3 = c175502.f53649;
        str4 = c17550.f53649;
        if (!str3.equals(str4)) {
            str5 = c175502.f53649;
            array2.add(str5);
        }
        return C5556.m15713(JSON.object().add("entryPaths", array2).add("operationIndexes", array).add("destinationPath", str), "ZIP_DESTINATION_CONFLICT", "Multiple ZIP entries require the same destination or a file as a parent directory");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24813(String str) {
        String m39859 = C16999.m39859(str);
        if (m39859 == null) {
            return str;
        }
        return "shared-storage:" + m39859.toLowerCase(Locale.ROOT);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24822(String str) {
        if ("/".equals(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf == 0 ? "/" : str.substring(0, lastIndexOf);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m24823(IOException iOException) {
        if ((iOException instanceof InterruptedIOException) || Thread.currentThread().isInterrupted()) {
            return C5556.m15713(JSON.object(), "ZIP_OPERATION_CANCELLED", "ZIP operation was cancelled");
        }
        if (iOException instanceof C3979) {
            return C5556.m15713(JSON.object(), "ZIP_BAD_PASSWORD", "The password could not decrypt the ZIP entry");
        }
        String message = iOException.getMessage();
        String lowerCase = message == null ? "" : message.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("unsupported") || lowerCase.contains("not supported") || lowerCase.contains("not implemented")) {
            return C3059.m9369("ZIP_UNSUPPORTED", "The ZIP uses an unsupported archive, compression, or encryption feature", "fatal", null, JSON.object());
        }
        return C5556.m15713(JSON.object(), "ZIP_READ_FAILED", "The ZIP file or entry could not be read and verified");
    }
}
