package l;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: N5RR */
/* renamed from: l.ۧ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10677 implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C2727 f32122;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Bundle f32123;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public MediaMetadata f32124;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        C2727 c2727 = new C2727();
        f32122 = c2727;
        c2727.put("android.media.metadata.TITLE", 1);
        c2727.put("android.media.metadata.ARTIST", 1);
        c2727.put("android.media.metadata.DURATION", 0);
        c2727.put("android.media.metadata.ALBUM", 1);
        c2727.put("android.media.metadata.AUTHOR", 1);
        c2727.put("android.media.metadata.WRITER", 1);
        c2727.put("android.media.metadata.COMPOSER", 1);
        c2727.put("android.media.metadata.COMPILATION", 1);
        c2727.put("android.media.metadata.DATE", 1);
        c2727.put("android.media.metadata.YEAR", 0);
        c2727.put("android.media.metadata.GENRE", 1);
        c2727.put("android.media.metadata.TRACK_NUMBER", 0);
        c2727.put("android.media.metadata.NUM_TRACKS", 0);
        c2727.put("android.media.metadata.DISC_NUMBER", 0);
        c2727.put("android.media.metadata.ALBUM_ARTIST", 1);
        c2727.put("android.media.metadata.ART", 2);
        c2727.put("android.media.metadata.ART_URI", 1);
        c2727.put("android.media.metadata.ALBUM_ART", 2);
        c2727.put("android.media.metadata.ALBUM_ART_URI", 1);
        c2727.put("android.media.metadata.USER_RATING", 3);
        c2727.put("android.media.metadata.RATING", 3);
        c2727.put("android.media.metadata.DISPLAY_TITLE", 1);
        c2727.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c2727.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c2727.put("android.media.metadata.DISPLAY_ICON", 2);
        c2727.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c2727.put("android.media.metadata.MEDIA_ID", 1);
        c2727.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c2727.put("android.media.metadata.MEDIA_URI", 1);
        c2727.put("android.media.metadata.ADVERTISEMENT", 0);
        c2727.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C7106();
    }

    public C10677(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f32123 = bundle2;
        C23645.m52135(bundle2);
    }

    public C10677(Parcel parcel) {
        this.f32123 = parcel.readBundle(C23645.class.getClassLoader());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26786() {
        return this.f32123.containsKey("android.media.metadata.DURATION");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m26787() {
        return this.f32123.getLong("android.media.metadata.DURATION", 0L);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f32123);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26785(MediaMetadata mediaMetadata) {
        if (mediaMetadata != null) {
            Parcel obtain = Parcel.obtain();
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            C10677 c10677 = (C10677) CREATOR.createFromParcel(obtain);
            obtain.recycle();
            c10677.f32124 = mediaMetadata;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final MediaMetadata m26788() {
        if (this.f32124 == null) {
            MediaMetadata.Builder builder = new MediaMetadata.Builder();
            Bundle bundle = this.f32123;
            for (String str : bundle.keySet()) {
                Integer num = (Integer) f32122.getOrDefault(str, null);
                if (num == null) {
                    num = -1;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    builder.putLong(str, bundle.getLong(str, 0L));
                } else if (intValue == 1) {
                    builder.putText(str, bundle.getCharSequence(str));
                } else if (intValue == 2) {
                    builder.putBitmap(str, (Bitmap) bundle.getParcelable(str));
                } else if (intValue == 3) {
                    builder.putRating(str, (Rating) bundle.getParcelable(str));
                } else {
                    Object obj = bundle.get(str);
                    if (obj == null || (obj instanceof CharSequence)) {
                        builder.putText(str, (CharSequence) obj);
                    } else if (obj instanceof Long) {
                        builder.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Bitmap) {
                        builder.putBitmap(str, (Bitmap) obj);
                    } else if (obj instanceof Rating) {
                        builder.putRating(str, (Rating) obj);
                    }
                }
            }
            this.f32124 = builder.build();
        }
        return this.f32124;
    }
}
