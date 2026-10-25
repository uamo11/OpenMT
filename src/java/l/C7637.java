package l;

import android.text.SpannableString;
import android.text.TextUtils;
import java.util.Comparator;

/* compiled from: J63D */
/* renamed from: l.۟ᩳܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7637 implements Comparator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23593;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f23593) {
            case 0:
                C21916 c21916 = (C21916) obj;
                C21916 c219162 = (C21916) obj2;
                int compare = Integer.compare(c21916.f70168, c219162.f70168);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Integer.compare(c219162.f70167, c21916.f70167);
                return compare2 != 0 ? compare2 : c21916.f70169.compareTo(c219162.f70169);
            case 1:
                C23064 c23064 = (C23064) obj;
                C23064 c230642 = (C23064) obj2;
                long j = c23064.f74189;
                long j2 = c230642.f74189;
                return j - j2 == 0 ? c23064.compareTo(c230642) : j < j2 ? -1 : 1;
            default:
                SpannableString spannableString = (SpannableString) obj;
                SpannableString spannableString2 = (SpannableString) obj2;
                boolean z = TextUtils.indexOf(spannableString, "android:") == 1;
                return z == (TextUtils.indexOf(spannableString2, "android:") == 1) ? spannableString.toString().compareTo(spannableString2.toString()) : z ? 1 : -1;
        }
    }
}
