package l;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: W8Q1 */
/* renamed from: l.ۗ۫֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3228 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f10156;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AudioTimestamp f10157 = new AudioTimestamp();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f10158;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AudioTrack f10159;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f10160;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f10161;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f10162;

    public C3228(AudioTrack audioTrack) {
        this.f10159 = audioTrack;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m9903() {
        AudioTrack audioTrack = this.f10159;
        AudioTimestamp audioTimestamp = this.f10157;
        boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
        if (timestamp) {
            long j = audioTimestamp.framePosition;
            long j2 = this.f10158;
            if (j2 > j) {
                if (this.f10161) {
                    this.f10156 += j2;
                    this.f10161 = false;
                } else {
                    this.f10162++;
                }
            }
            this.f10158 = j;
            this.f10160 = j + this.f10156 + (this.f10162 << 32);
        }
        return timestamp;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m9902() {
        return this.f10157.nanoTime / 1000;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m9901() {
        return this.f10160;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9900() {
        this.f10161 = true;
    }
}
