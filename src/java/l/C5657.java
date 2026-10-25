package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: U7MS */
/* renamed from: l.ۚ᩺֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5657 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f17448;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Uri f17449;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f17452;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Uri f17455;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Boolean f17460;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f17462;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f17463;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f17458 = new HashMap();

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f17461 = -9223372036854775807L;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f17464 = -9223372036854775807L;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f17456 = -9223372036854775807L;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f17454 = -9223372036854775807L;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f17459 = new ArrayList();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f17450 = -9223372036854775807L;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f17453 = -9223372036854775807L;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f17451 = new ArrayList();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f17457 = new ArrayList();

    public C5657(String str) {
        this.f17463 = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15958(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f17455;
        if (uri2 != null) {
            C22632.m50630("Can't change assetUri from " + this.f17455 + " to " + uri, uri2.equals(uri));
        }
        this.f17455 = uri;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15952(Uri uri) {
        if (uri == null) {
            return;
        }
        Uri uri2 = this.f17449;
        if (uri2 != null) {
            C22632.m50630("Can't change assetListUri from " + this.f17449 + " to " + uri, uri2.equals(uri));
        }
        this.f17449 = uri;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m15961(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f17461;
        if (j2 != -9223372036854775807L) {
            C22632.m50630("Can't change startDateUnixUs from " + this.f17461 + " to " + j, j2 == j);
        }
        this.f17461 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15957(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f17464;
        if (j2 != -9223372036854775807L) {
            C22632.m50630("Can't change endDateUnixUs from " + this.f17464 + " to " + j, j2 == j);
        }
        this.f17464 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15951(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f17456;
        if (j2 != -9223372036854775807L) {
            C22632.m50630("Can't change durationUs from " + this.f17456 + " to " + j, j2 == j);
        }
        this.f17456 = j;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15962(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f17454;
        if (j2 != -9223372036854775807L) {
            C22632.m50630("Can't change plannedDurationUs from " + this.f17454 + " to " + j, j2 == j);
        }
        this.f17454 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15960(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f17459.isEmpty()) {
            boolean equals = this.f17459.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change cue from ");
            ArrayList arrayList2 = this.f17459;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C22632.m50630(sb.toString(), equals);
        }
        this.f17459 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15956(boolean z) {
        if (z) {
            this.f17452 = true;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m15964(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f17450;
        if (j2 != -9223372036854775807L) {
            C22632.m50630("Can't change resumeOffsetUs from " + this.f17450 + " to " + j, j2 == j);
        }
        this.f17450 = j;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m15965(long j) {
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = this.f17453;
        if (j2 != -9223372036854775807L) {
            C22632.m50630("Can't change playoutLimitUs from " + this.f17453 + " to " + j, j2 == j);
        }
        this.f17453 = j;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m15966(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f17451.isEmpty()) {
            boolean equals = this.f17451.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change snapTypes from ");
            ArrayList arrayList2 = this.f17451;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C22632.m50630(sb.toString(), equals);
        }
        this.f17451 = arrayList;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15963(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.f17457.isEmpty()) {
            boolean equals = this.f17457.equals(arrayList);
            StringBuilder sb = new StringBuilder("Can't change restrictions from ");
            ArrayList arrayList2 = this.f17457;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    } else {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" to ");
            StringBuilder sb3 = new StringBuilder();
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                while (true) {
                    sb3.append((CharSequence) it2.next());
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        sb3.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb3.toString());
            C22632.m50630(sb.toString(), equals);
        }
        this.f17457 = arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15955(ArrayList arrayList) {
        String str;
        double d;
        String str2;
        double d2;
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            C0717 c0717 = (C0717) arrayList.get(i);
            String str3 = c0717.f2703;
            HashMap hashMap = this.f17458;
            C0717 c07172 = (C0717) hashMap.get(str3);
            if (c07172 != null) {
                boolean equals = c07172.equals(c0717);
                StringBuilder m9834 = C3200.m9834("Can't change ", str3, " from ");
                str = c07172.f2704;
                m9834.append(str);
                m9834.append(" ");
                d = c07172.f2702;
                m9834.append(d);
                m9834.append(" to ");
                str2 = c0717.f2704;
                m9834.append(str2);
                m9834.append(" ");
                d2 = c0717.f2702;
                m9834.append(d2);
                C22632.m50630(m9834.toString(), equals);
            }
            hashMap.put(str3, c0717);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15953(Boolean bool) {
        if (bool == null) {
            return;
        }
        Boolean bool2 = this.f17460;
        if (bool2 != null) {
            C22632.m50630("Can't change contentMayVary from " + this.f17460 + " to " + bool, bool2.equals(bool));
        }
        this.f17460 = bool;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15954(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f17462;
        if (str2 != null) {
            C22632.m50630("Can't change timelineOccupies from " + this.f17462 + " to " + str, str2.equals(str));
        }
        this.f17462 = str;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15959(String str) {
        if (str == null) {
            return;
        }
        String str2 = this.f17448;
        if (str2 != null) {
            C22632.m50630("Can't change timelineStyle from " + this.f17448 + " to " + str, str2.equals(str));
        }
        this.f17448 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1423 m15950() {
        Uri uri = this.f17449;
        if ((uri != null || this.f17455 == null) && (uri == null || this.f17455 != null)) {
            return null;
        }
        long j = this.f17461;
        if (j == -9223372036854775807L) {
            return null;
        }
        Uri uri2 = this.f17455;
        long j2 = this.f17464;
        long j3 = this.f17456;
        long j4 = this.f17454;
        ArrayList arrayList = this.f17459;
        boolean z = this.f17452;
        long j5 = this.f17450;
        long j6 = this.f17453;
        ArrayList arrayList2 = this.f17451;
        ArrayList arrayList3 = this.f17457;
        ArrayList arrayList4 = new ArrayList(this.f17458.values());
        Boolean bool = this.f17460;
        boolean z2 = bool == null || bool.booleanValue();
        String str = this.f17462;
        if (str == null) {
            str = "POINT";
        }
        String str2 = str;
        String str3 = this.f17448;
        if (str3 == null) {
            str3 = "HIGHLIGHT";
        }
        return new C1423(this.f17463, uri2, uri, j, j2, j3, j4, arrayList, z, j5, j6, arrayList2, arrayList3, arrayList4, z2, str2, str3);
    }
}
