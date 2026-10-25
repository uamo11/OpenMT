package l;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import bin.mt.plus.ShortcutActivity;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: U92X */
/* renamed from: l.ܰܶۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC13898 extends ActivityC10582 {
    @Override // android.app.Activity
    public final void finish() {
        if (isTaskRoot()) {
            finishAndRemoveTask();
            if (((int) C5378.stream(((ActivityManager) getSystemService("activity")).getAppTasks()).filter(new C23134(1)).count()) == 1) {
                System.out.println("Kill self process");
                C9255.m23756();
                Process.killProcess(Process.myPid());
                return;
            }
            return;
        }
        super.finish();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33308(ActivityManager.AppTask appTask) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return appTask.getTaskInfo().isRunning;
        }
        return i < 23 || appTask.getTaskInfo().topActivity != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33309(Context context, Intent intent) {
        String str;
        String[] strArr;
        String str2;
        String str3;
        Iterator it;
        String str4 = "operation";
        String stringExtra = intent.getStringExtra("operation");
        if (!"exec-script".equals(stringExtra)) {
            return false;
        }
        String stringExtra2 = intent.getStringExtra(MotionUtils.EASING_TYPE_PATH);
        boolean booleanExtra = intent.getBooleanExtra("eae", false);
        String str5 = "ewrp";
        boolean booleanExtra2 = intent.getBooleanExtra("ewrp", false);
        boolean booleanExtra3 = intent.getBooleanExtra("ewse", true);
        String m33306 = m33306(stringExtra, stringExtra2, booleanExtra, booleanExtra2, booleanExtra3);
        String[] mo18255 = ApplicationC20075.f65008.mo18255("eama", (String[]) null);
        if (mo18255 != null && Arrays.asList(mo18255).contains(m33306)) {
            m33307(m33306, mo18255);
            return true;
        }
        if (ShortcutActivity.m141()) {
            Iterator it2 = C16362.m38519(context).iterator();
            while (it2.hasNext()) {
                Intent m19333 = ((C7232) it2.next()).m19333();
                if ("bin.mt.plus.ACTION_SHORTCUT".equals(m19333.getAction())) {
                    String stringExtra3 = m19333.getStringExtra("operation");
                    it = it2;
                    String stringExtra4 = m19333.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                    str = m33306;
                    strArr = mo18255;
                    boolean booleanExtra4 = m19333.getBooleanExtra("eae", false);
                    boolean booleanExtra5 = m19333.getBooleanExtra(str5, false);
                    str3 = str5;
                    boolean booleanExtra6 = m19333.getBooleanExtra("ewse", true);
                    if ("exec-script".equals(stringExtra3) && C11003.equals(stringExtra2, stringExtra4) && booleanExtra == booleanExtra4 && booleanExtra2 == booleanExtra5 && booleanExtra3 == booleanExtra6) {
                        break;
                    }
                } else {
                    str = m33306;
                    str3 = str5;
                    it = it2;
                    strArr = mo18255;
                }
                it2 = it;
                m33306 = str;
                mo18255 = strArr;
                str5 = str3;
            }
        }
        str = m33306;
        String str6 = str5;
        strArr = mo18255;
        Iterator it3 = C16362.m38507(context).iterator();
        while (it3.hasNext()) {
            Intent m193332 = ((C7232) it3.next()).m19333();
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(m193332.getAction())) {
                String stringExtra5 = m193332.getStringExtra(str4);
                String stringExtra6 = m193332.getStringExtra(MotionUtils.EASING_TYPE_PATH);
                boolean booleanExtra7 = m193332.getBooleanExtra("eae", false);
                str2 = str4;
                boolean booleanExtra8 = m193332.getBooleanExtra(str6, false);
                boolean booleanExtra9 = m193332.getBooleanExtra("ewse", true);
                if ("exec-script".equals(stringExtra5) && C11003.equals(stringExtra2, stringExtra6) && booleanExtra == booleanExtra7 && booleanExtra2 == booleanExtra8 && booleanExtra3 == booleanExtra9) {
                    m33307(str, strArr);
                    return true;
                }
            } else {
                str2 = str4;
            }
            str = str;
            strArr = strArr;
            str4 = str2;
        }
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m33310(Intent intent) {
        String stringExtra = intent.getStringExtra("operation");
        if ("exec-script".equals(stringExtra)) {
            m33307(m33306(stringExtra, intent.getStringExtra(MotionUtils.EASING_TYPE_PATH), intent.getBooleanExtra("eae", false), intent.getBooleanExtra("ewrp", false), intent.getBooleanExtra("ewse", true)), ApplicationC20075.f65008.mo18255("eama", (String[]) null));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33306(String str, String str2, boolean z, boolean z2, boolean z3) {
        return C14460.m34530(str + ":" + str2 + ":" + z + ":" + z2 + ":" + z3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33307(String str, String[] strArr) {
        ArrayList arrayList;
        if (strArr == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(Arrays.asList(strArr));
        }
        arrayList.remove(str);
        arrayList.add(0, str);
        if (arrayList.size() > 50) {
            arrayList = new ArrayList(arrayList.subList(0, 50));
        }
        ApplicationC20075.f65008.edit().mo25857("eama", (String[]) arrayList.toArray(new String[0])).apply();
    }
}
