package l;

import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* compiled from: YAPP */
/* renamed from: l.᩷ۤܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20815 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47633(ArrayList arrayList, String str, String str2, String str3, boolean z, Map map) {
        SimpleDateFormat simpleDateFormat;
        String replace;
        int i;
        String str4;
        int i2;
        String str5 = str;
        boolean isEmpty = str2.isEmpty();
        C12164 matcher = (isEmpty || !z) ? null : C11459.m28260(str2).matcher((CharSequence) "");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        try {
            String string = ApplicationC20075.f65008.getString("rdtp", "yyyy-MM-dd_HH-mm-ss");
            if (string.trim().isEmpty()) {
                string = "yyyy-MM-dd_HH-mm-ss";
            }
            simpleDateFormat = new SimpleDateFormat(string, Locale.ENGLISH);
        } catch (Exception unused) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.ENGLISH);
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        C11459 m28260 = C11459.m28260("\\{([0-9]+)}");
        C11459 m282602 = C11459.m28260("\\{z([0-9]+)}");
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) arrayList.get(i3);
            String name = interfaceC17889.getName();
            long time = interfaceC17889.getTime();
            int size2 = arrayList.size();
            int lastIndexOf = name.lastIndexOf(46);
            int i4 = size;
            ArrayList arrayList3 = arrayList2;
            if (lastIndexOf != -1) {
                replace = str5.contains("{P}") ? str5.replace("{P}", name.substring(0, lastIndexOf)) : str5;
                if (replace.contains("{S}")) {
                    replace = replace.replace("{S}", name.substring(lastIndexOf));
                }
            } else {
                replace = str5.contains("{P}") ? str5.replace("{P}", name) : str5;
                if (replace.contains("{S}")) {
                    replace = replace.replace("{S}", "");
                }
            }
            if (replace.contains("{T}")) {
                replace = replace.replace("{T}", simpleDateFormat2.format(Long.valueOf(time)));
            }
            C23636 c23636 = (C23636) map.get(name);
            if (replace.contains("{E}")) {
                Long l2 = c23636 == null ? null : c23636.f76582;
                if (l2 == null) {
                    l2 = Long.valueOf(time);
                }
                replace = replace.replace("{E}", simpleDateFormat2.format(l2));
            }
            C4021 c4021 = c23636 == null ? null : c23636.f76581;
            if (replace.contains("{AN}")) {
                replace = replace.replace("{AN}", c4021 == null ? "NULL" : c4021.m12095());
            }
            if (replace.contains("{AP}")) {
                replace = replace.replace("{AP}", c4021 == null ? "NULL" : c4021.m12094());
            }
            if (replace.contains("{AV}")) {
                replace = replace.replace("{AV}", c4021 == null ? "NULL" : c4021.m12092());
            }
            if (replace.contains("{AC}")) {
                replace = replace.replace("{AC}", c4021 != null ? String.valueOf(c4021.m12098()) : "NULL");
            }
            C12164 matcher2 = m28260.matcher((CharSequence) "");
            while (true) {
                matcher2.m29615reset((CharSequence) replace);
                i = 1;
                if (!matcher2.find()) {
                    break;
                }
                String group = matcher2.group(1);
                C11003.requireNonNull(group);
                replace = replace.substring(0, matcher2.start()) + (Integer.parseInt(group) + i3) + replace.substring(matcher2.end());
            }
            C12164 matcher3 = m282602.matcher((CharSequence) "");
            String str6 = replace;
            while (true) {
                matcher3.m29615reset((CharSequence) str6);
                if (!matcher3.find()) {
                    break;
                }
                String group2 = matcher3.group(i);
                C11003.requireNonNull(group2);
                int parseInt = Integer.parseInt(group2);
                int length = String.valueOf((parseInt + size2) - i).length();
                StringBuilder sb = new StringBuilder();
                SimpleDateFormat simpleDateFormat3 = simpleDateFormat2;
                sb.append(str6.substring(0, matcher3.start()));
                String valueOf = String.valueOf(parseInt + i3);
                int length2 = length - valueOf.length();
                if (length2 > 0) {
                    StringBuilder sb2 = new StringBuilder(length);
                    while (length2 > 0) {
                        sb2.append('0');
                        length2--;
                    }
                    sb2.append(valueOf);
                    valueOf = sb2.toString();
                }
                sb.append(valueOf);
                sb.append(str6.substring(matcher3.end()));
                str6 = sb.toString();
                i = 1;
                simpleDateFormat2 = simpleDateFormat3;
            }
            SimpleDateFormat simpleDateFormat4 = simpleDateFormat2;
            if (isEmpty) {
                str4 = name;
                i2 = i3;
            } else if (matcher != null) {
                str4 = name;
                i2 = i3;
                String m9356 = C3058.m9356(str6, str3, matcher, true, false, null, new ArrayList(1));
                if (m9356 != null) {
                    str6 = m9356;
                }
            } else {
                str4 = name;
                i2 = i3;
                str6 = str6.replace(str2, str3);
            }
            arrayList3.add(new C6703(str4, str6));
            i3 = i2 + 1;
            str5 = str;
            size = i4;
            arrayList2 = arrayList3;
            simpleDateFormat2 = simpleDateFormat4;
        }
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m47632(ArrayList arrayList) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            str3 = ((C6703) it.next()).f20812;
            hashSet.add(str3.toLowerCase());
        }
        while (true) {
            if (arrayList2.isEmpty()) {
                break;
            }
            Iterator it2 = arrayList2.iterator();
            boolean z = false;
            while (it2.hasNext()) {
                C6703 c6703 = (C6703) it2.next();
                str = c6703.f20812;
                String lowerCase = str.toLowerCase();
                str2 = c6703.f20811;
                String lowerCase2 = str2.toLowerCase();
                if (!hashSet.contains(lowerCase2) || lowerCase.equals(lowerCase2)) {
                    hashSet.remove(lowerCase);
                    hashSet.remove(lowerCase2);
                    arrayList3.add(c6703);
                    it2.remove();
                    z = true;
                }
            }
            if (!z) {
                arrayList3.addAll(arrayList2);
                break;
            }
        }
        return arrayList3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47635(AbstractActivityC3346 abstractActivityC3346, ArrayList arrayList) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00cc);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120882);
        ListView listView = (ListView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a02e0);
        C4915.m14284(listView);
        listView.setAdapter((ListAdapter) new C2072(R.layout.MT_Protector_res_0x7f0d01c5, abstractActivityC3346, arrayList));
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47634(C0352 c0352, ArrayList arrayList) {
        String str;
        String str2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C6703 c6703 = (C6703) it.next();
            str = c6703.f20812;
            str2 = c6703.f20811;
            c6703.f20813 = c0352.m1797(str, str2);
        }
    }
}
