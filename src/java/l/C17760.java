package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.internal.c;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* compiled from: U6XZ */
/* renamed from: l.ᩳۖۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17760 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21528 f54328;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3200 f54329;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5766 f54330;

    public C17760(C21528 c21528, C5766 c5766) {
        C3200 c3200 = new C3200(10);
        this.f54328 = c21528;
        C11003.requireNonNull(c5766, "pathCoordinator");
        this.f54330 = c5766;
        this.f54329 = c3200;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7383 m41607() {
        return this.f54328.m48690();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41599(String str, C7383 c7383, String str2) {
        String m29843 = C12301.m29843(c7383, str, str2, false);
        c7383.m19883(m29843);
        return m29843;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m41605(String str, C7383 c7383, String str2) {
        String m29843 = C12301.m29843(c7383, str, str2, false);
        c7383.m19884(m29843);
        c7383.m19882(m29843);
        return m29843;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10000 m41608(String str) {
        return this.f54330.m16220(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10000 m41611(String str) {
        return this.f54330.m16223(str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10000 m41609(List list) {
        return this.f54330.m16221((Collection) list);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m41612(String str) {
        return this.f54329.m9837(str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12619 m41613(String str) {
        try {
            return this.f54329.m9837(str).mo23558().mo8672();
        } catch (C22497 e) {
            throw m41604(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41610(AbstractC15440 abstractC15440, InterfaceC16348 interfaceC16348) {
        if (abstractC15440.mo27917() || (abstractC15440 instanceof C13198) || (abstractC15440 instanceof C12993)) {
            String parent = abstractC15440.getParent();
            boolean z = true;
            while (parent != null) {
                this.f54329.getClass();
                AbstractC15440 m39866 = C16999.m39866(parent, new String[0]);
                try {
                    C12619 mo8672 = m39866.mo23558().mo8672();
                    if (mo8672.m30885() == EnumC3447.LINK) {
                        throw interfaceC16348.mo22666("FILE_IS_SYMLINK", "A symbolic-link parent cannot be traversed by a destructive file tool.", "parent_is_link");
                    }
                    if (mo8672.m30885() == EnumC3447.MISSING) {
                        throw interfaceC16348.mo22666(z ? "FILE_PARENT_NOT_FOUND" : "FILE_LINK_CHECK_FAILED", z ? "The target parent directory does not exist." : "An existing parent chain could not be verified safely.", z ? "parent_missing" : "ancestor_missing");
                    }
                    if (mo8672.m30885() != EnumC3447.DIRECTORY) {
                        throw interfaceC16348.mo22666("FILE_NOT_DIRECTORY", "A target parent is not a directory.", mo8672.m30885().name().toLowerCase(Locale.ROOT));
                    }
                    parent = m39866.getParent();
                    z = false;
                } catch (C22497 e) {
                    throw interfaceC16348.mo22666("FILE_LINK_CHECK_FAILED", "A parent link status could not be verified safely.", e.m50458().name().toLowerCase(Locale.ROOT));
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m41604(C22497 c22497) {
        String str;
        boolean z = false;
        switch (C10705.f32276[c22497.m50458().ordinal()]) {
            case 1:
                str = "FILE_NOT_FOUND";
                z = true;
                break;
            case 2:
                str = "FILE_ALREADY_EXISTS";
                z = true;
                break;
            case 3:
                str = "FILE_NOT_REGULAR";
                break;
            case 4:
                str = "FILE_NOT_DIRECTORY";
                break;
            case 5:
                str = "FILE_DIRECTORY_NOT_EMPTY";
                z = true;
                break;
            case 6:
                str = "FILE_ACCESS_DENIED";
                break;
            case 7:
            case 8:
                str = "FILE_BACKEND_UNSUPPORTED";
                break;
            default:
                str = "FILE_STORAGE_ERROR";
                z = true;
                break;
        }
        JSONObject add = JSON.object().add(MotionUtils.EASING_TYPE_PATH, c22497.m50457()).add("targetPath", c22497.m50459() == null ? JSON.NULL : JSON.value(c22497.m50459()));
        String name = c22497.m50456().name();
        Locale locale = Locale.ROOT;
        JSONObject add2 = add.add("operation", name.toLowerCase(locale)).add("backendReason", c22497.m50458().name().toLowerCase(locale));
        if (z) {
            return C3059.m9365(str, c22497.getMessage(), "warning", (JSONArray) null, add2);
        }
        return C3059.m9369(str, c22497.getMessage(), "fatal", null, add2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m41601(String str, IOException iOException) {
        return m41602(str, iOException.getClass().getSimpleName());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m41600(RuntimeException runtimeException, String str) {
        return m41602(str, runtimeException.getClass().getSimpleName());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m41602(String str, String str2) {
        return C3059.m9365("FILE_STORAGE_ERROR", "Failed to read local file content.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "operation", "read").add("backendReason", str2));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C3059 m41606(String str) {
        return C3059.m9365("FILE_NOT_FOUND", "The requested file path does not exist.", "warning", (JSONArray) null, C7416.m19939(MotionUtils.EASING_TYPE_PATH, str, "operation", c.h));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m41603(String str, String str2, String str3, EnumC3447 enumC3447) {
        String str4;
        int i = C10705.f32277[enumC3447.ordinal()];
        if (i == 1) {
            str4 = "regular file";
        } else if (i == 2) {
            str4 = "directory";
        } else if (i == 3) {
            str4 = "symbolic link";
        } else if (i == 4) {
            str4 = "special node";
        } else {
            if (i != 5) {
                throw new IncompatibleClassChangeError();
            }
            str4 = "missing path";
        }
        JSONObject add = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "operation", c.h).add("backendReason", enumC3447.name().toLowerCase(Locale.ROOT));
        if (("FILE_NOT_REGULAR".equals(str) && enumC3447 == EnumC3447.DIRECTORY) || ("FILE_NOT_DIRECTORY".equals(str) && enumC3447 == EnumC3447.REGULAR)) {
            return C3059.m9365(str, str2 + " Found: " + str4 + ".", "warning", (JSONArray) null, add);
        }
        return C3059.m9369(str, str2 + " Found: " + str4 + ".", "fatal", null, add);
    }
}
