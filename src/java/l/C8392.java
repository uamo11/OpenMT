package l;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: J5UB */
/* renamed from: l.۠᩶, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8392 implements InterfaceC17564 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Notification.Builder f25732;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21093 f25733;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Bundle f25734;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f25735;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.net.Uri, java.lang.CharSequence, java.lang.String, long[]] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.net.Uri, java.lang.CharSequence, long[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public C8392(C21093 c21093) {
        ArrayList arrayList;
        String str;
        Notification notification;
        ?? r4;
        ?? r42;
        Bundle bundle;
        ArrayList arrayList2;
        Notification notification2;
        String str2;
        Bundle[] bundleArr;
        C8392 c8392 = this;
        new ArrayList();
        c8392.f25734 = new Bundle();
        c8392.f25733 = c21093;
        Context context = c21093.f68035;
        ArrayList arrayList3 = c21093.f68028;
        ArrayList arrayList4 = c21093.f68020;
        String str3 = c21093.f68029;
        ArrayList arrayList5 = c21093.f68034;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            c8392.f25732 = C19682.m45261(context, str3);
        } else {
            c8392.f25732 = new Notification.Builder(context);
        }
        Notification notification3 = c21093.f68024;
        ArrayList arrayList6 = null;
        c8392.f25732.setWhen(notification3.when).setSmallIcon(notification3.icon, notification3.iconLevel).setContent(notification3.contentView).setTicker(notification3.tickerText, null).setVibrate(notification3.vibrate).setLights(notification3.ledARGB, notification3.ledOnMS, notification3.ledOffMS).setOngoing((notification3.flags & 2) != 0).setOnlyAlertOnce((notification3.flags & 8) != 0).setAutoCancel((notification3.flags & 16) != 0).setDefaults(notification3.defaults).setContentTitle(c21093.f68027).setContentText(c21093.f68030).setContentInfo(null).setContentIntent(c21093.f68031).setDeleteIntent(notification3.deleteIntent).setFullScreenIntent(null, (notification3.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        if (i < 23) {
            Notification.Builder builder = c8392.f25732;
            C4656 c4656 = c21093.f68025;
            builder.setLargeIcon(c4656 == null ? null : c4656.m13629());
        } else {
            Notification.Builder builder2 = c8392.f25732;
            C4656 c46562 = c21093.f68025;
            C4159.m12561(builder2, c46562 == null ? null : c46562.m13633(context));
        }
        c8392.f25732.setSubText(null).setUsesChronometer(false).setPriority(c21093.f68021);
        AbstractC9098 abstractC9098 = c21093.f68018;
        if (abstractC9098 instanceof C9804) {
            C9804 c9804 = (C9804) abstractC9098;
            int m3228 = C0881.m3228(c9804.f27572.f68035, R.color.MT_Protector_res_0x7f060042);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c9804.f27572.f68035.getResources().getString(R.string.MT_Protector_res_0x7f120157));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(m3228), 0, spannableStringBuilder.length(), 18);
            Context context2 = c9804.f27572.f68035;
            int i2 = C4656.f14767;
            context2.getClass();
            C23914 m35044 = new C14741(C4656.m13625(context2.getResources(), context2.getPackageName(), R.drawable.MT_Protector_res_0x7f08010f), spannableStringBuilder).m35044();
            m35044.f77326.putBoolean("key_action_priority", true);
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(m35044);
            ArrayList arrayList8 = c9804.f27572.f68019;
            if (arrayList8 != null) {
                Iterator it = arrayList8.iterator();
                int i3 = 2;
                while (it.hasNext()) {
                    C23914 c23914 = (C23914) it.next();
                    c23914.getClass();
                    if (!c23914.f77326.getBoolean("key_action_priority") && i3 > 1) {
                        arrayList7.add(c23914);
                        i3--;
                    }
                }
            }
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                c8392.m21993((C23914) it2.next());
            }
        } else {
            Iterator it3 = c21093.f68019.iterator();
            while (it3.hasNext()) {
                c8392.m21993((C23914) it3.next());
            }
        }
        Bundle bundle2 = c21093.f68023;
        if (bundle2 != null) {
            c8392.f25734.putAll(bundle2);
        }
        int i4 = Build.VERSION.SDK_INT;
        c8392.f25732.setShowWhen(c21093.f68032);
        C16152.m38077(c8392.f25732, false);
        C16152.m38073(c8392.f25732, (String) null);
        C16152.m38076(c8392.f25732, (String) null);
        C16152.m38074(c8392.f25732, false);
        c8392.f25735 = 0;
        C2748.m8498(c8392.f25732, (String) null);
        C2748.m8493(c8392.f25732, 0);
        C2748.m8497(c8392.f25732, c21093.f68022);
        C2748.m8494(c8392.f25732, (Notification) null);
        C2748.m8495(c8392.f25732, notification3.sound, notification3.audioAttributes);
        if (i4 < 28) {
            if (arrayList4 != null) {
                arrayList6 = new ArrayList(arrayList4.size());
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    C14035 c14035 = (C14035) it4.next();
                    CharSequence charSequence = c14035.f42434;
                    String str4 = c14035.f42432;
                    if (str4 == null) {
                        if (charSequence != null) {
                            str4 = "name:" + ((Object) charSequence);
                        } else {
                            str4 = "";
                        }
                    }
                    arrayList6.add(str4);
                }
            }
            if (arrayList6 != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList6;
                } else {
                    C18955 c18955 = new C18955(arrayList3.size() + arrayList6.size());
                    c18955.addAll(arrayList6);
                    c18955.addAll(arrayList3);
                    arrayList3 = new ArrayList(c18955);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                C2748.m8496(c8392.f25732, (String) it5.next());
            }
        }
        if (arrayList5.size() > 0) {
            if (c21093.f68023 == null) {
                c21093.f68023 = new Bundle();
            }
            Bundle bundle3 = c21093.f68023.getBundle("android.car.EXTENSIONS");
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            int i5 = 0;
            while (i5 < arrayList5.size()) {
                String num = Integer.toString(i5);
                C23914 c239142 = (C23914) arrayList5.get(i5);
                Bundle bundle6 = new Bundle();
                C4656 m52672 = c239142.m52672();
                Bundle bundle7 = c239142.f77326;
                ArrayList arrayList9 = arrayList5;
                bundle6.putInt("icon", m52672 != null ? m52672.m13632() : 0);
                bundle6.putCharSequence("title", c239142.f77321);
                bundle6.putParcelable("actionIntent", c239142.f77320);
                if (bundle7 != null) {
                    bundle = new Bundle(bundle7);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c239142.m52671());
                bundle6.putBundle("extras", bundle);
                C17815[] m52673 = c239142.m52673();
                if (m52673 == null) {
                    bundleArr = null;
                    arrayList2 = arrayList4;
                    str2 = str3;
                    notification2 = notification3;
                } else {
                    Bundle[] bundleArr2 = new Bundle[m52673.length];
                    arrayList2 = arrayList4;
                    notification2 = notification3;
                    int i6 = 0;
                    while (i6 < m52673.length) {
                        C17815 c17815 = m52673[i6];
                        C17815[] c17815Arr = m52673;
                        Bundle bundle8 = new Bundle();
                        c17815.getClass();
                        bundle8.putString("resultKey", null);
                        bundle8.putCharSequence(AnnotatedPrivateKey.LABEL, null);
                        bundle8.putCharSequenceArray("choices", null);
                        bundle8.putBoolean("allowFreeFormInput", false);
                        bundle8.putBundle("extras", null);
                        bundleArr2[i6] = bundle8;
                        i6++;
                        m52673 = c17815Arr;
                        str3 = str3;
                    }
                    str2 = str3;
                    bundleArr = bundleArr2;
                }
                bundle6.putParcelableArray("remoteInputs", bundleArr);
                bundle6.putBoolean("showsUserInterface", c239142.f77327);
                bundle6.putInt("semanticAction", 0);
                bundle5.putBundle(num, bundle6);
                i5++;
                arrayList5 = arrayList9;
                arrayList4 = arrayList2;
                notification3 = notification2;
                str3 = str2;
            }
            arrayList = arrayList4;
            str = str3;
            notification = notification3;
            bundle3.putBundle("invisible_actions", bundle5);
            bundle4.putBundle("invisible_actions", bundle5);
            if (c21093.f68023 == null) {
                c21093.f68023 = new Bundle();
            }
            c21093.f68023.putBundle("android.car.EXTENSIONS", bundle3);
            c8392 = this;
            c8392.f25734.putBundle("android.car.EXTENSIONS", bundle4);
        } else {
            arrayList = arrayList4;
            str = str3;
            notification = notification3;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 24) {
            c8392.f25732.setExtras(c21093.f68023);
            r4 = 0;
            C18976.m43805(c8392.f25732, (CharSequence[]) null);
        } else {
            r4 = 0;
        }
        if (i7 >= 26) {
            C19682.m45256(c8392.f25732, 0);
            C19682.m45258(c8392.f25732, (CharSequence) r4);
            C19682.m45259(c8392.f25732, (String) r4);
            C19682.m45257(c8392.f25732, 0L);
            C19682.m45262(c8392.f25732, 0);
            if (!TextUtils.isEmpty(str)) {
                c8392.f25732.setSound(r4).setDefaults(0).setLights(0, 0, 0).setVibrate(r4);
            }
        }
        if (i7 >= 28) {
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                C14035 c140352 = (C14035) it6.next();
                Notification.Builder builder3 = c8392.f25732;
                c140352.getClass();
                C0630.m2562(builder3, C23208.m51502(c140352));
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            C5570.m15813(c8392.f25732, c21093.f68026);
            r42 = 0;
            C5570.m15811(c8392.f25732, (Notification.BubbleMetadata) null);
        } else {
            r42 = 0;
        }
        if (c21093.f68033) {
            c8392.f25733.getClass();
            c8392.f25735 = 1;
            c8392.f25732.setVibrate(r42);
            c8392.f25732.setSound(r42);
            Notification notification4 = notification;
            int i9 = notification4.defaults & (-4);
            notification4.defaults = i9;
            c8392.f25732.setDefaults(i9);
            if (i8 >= 26) {
                c8392.f25733.getClass();
                if (TextUtils.isEmpty(r42)) {
                    C16152.m38073(c8392.f25732, "silent");
                }
                C19682.m45262(c8392.f25732, 1);
            }
        }
    }

    @Override // l.InterfaceC17564
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Notification.Builder mo21994() {
        return this.f25732;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Notification m21995() {
        Notification build;
        Bundle bundle;
        String mo18870;
        C21093 c21093 = this.f25733;
        AbstractC9098 abstractC9098 = c21093.f68018;
        if (abstractC9098 != null) {
            abstractC9098.mo18872(this);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = this.f25732;
        if (i >= 26) {
            build = builder.build();
        } else {
            int i2 = this.f25735;
            if (i >= 24) {
                build = builder.build();
                if (i2 != 0) {
                    if (C16152.m38075(build) != null && (build.flags & 512) != 0 && i2 == 2) {
                        m21992(build);
                    }
                    if (C16152.m38075(build) != null && (build.flags & 512) == 0 && i2 == 1) {
                        m21992(build);
                    }
                }
            } else {
                builder.setExtras(this.f25734);
                build = builder.build();
                if (i2 != 0) {
                    if (C16152.m38075(build) != null && (build.flags & 512) != 0 && i2 == 2) {
                        m21992(build);
                    }
                    if (C16152.m38075(build) != null && (build.flags & 512) == 0 && i2 == 1) {
                        m21992(build);
                    }
                }
            }
        }
        if (abstractC9098 != null) {
            c21093.f68018.getClass();
        }
        if (abstractC9098 != null && (bundle = build.extras) != null && (mo18870 = abstractC9098.mo18870()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", mo18870);
        }
        return build;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21993(C23914 c23914) {
        Notification.Action.Builder m38068;
        Bundle bundle;
        int i = Build.VERSION.SDK_INT;
        C4656 m52672 = c23914.m52672();
        Bundle bundle2 = c23914.f77326;
        PendingIntent pendingIntent = c23914.f77320;
        CharSequence charSequence = c23914.f77321;
        RemoteInput[] remoteInputArr = null;
        if (i >= 23) {
            m38068 = C4159.m12560(m52672 != null ? m52672.m13633((Context) null) : null, charSequence, pendingIntent);
        } else {
            m38068 = C16152.m38068(m52672 != null ? m52672.m13632() : 0, charSequence, pendingIntent);
        }
        if (c23914.m52673() != null) {
            C17815[] m52673 = c23914.m52673();
            if (m52673 != null) {
                remoteInputArr = new RemoteInput[m52673.length];
                for (int i2 = 0; i2 < m52673.length; i2++) {
                    m52673[i2].getClass();
                    RemoteInput.Builder addExtras = new RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        C16403.m38656(addExtras, 0);
                    }
                    remoteInputArr[i2] = addExtras.build();
                }
            }
            for (RemoteInput remoteInput : remoteInputArr) {
                C16152.m38069(m38068, remoteInput);
            }
        }
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c23914.m52671());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            C18976.m43803(m38068, c23914.m52671());
        }
        bundle.putInt("android.support.action.semanticAction", 0);
        if (i3 >= 28) {
            C0630.m2561(m38068, 0);
        }
        if (i3 >= 29) {
            C5570.m15810(m38068, false);
        }
        if (i3 >= 31) {
            C1336.m4671(m38068, false);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", c23914.f77327);
        C16152.m38070(m38068, bundle);
        C16152.m38072(this.f25732, C16152.m38071(m38068));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21992(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }
}
