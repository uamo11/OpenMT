package l;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: 48U6 */
/* renamed from: l.ۨ۬֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11715 implements InterfaceC1131 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public PlaybackMetrics.Builder f34934;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C16134 f34935;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f34936;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f34937;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C13125 f34938;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f34939;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f34940;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C6070 f34941;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C6070 f34943;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8353 f34944;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8353 f34945;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f34946;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Context f34949;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6070 f34950;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34951;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f34955;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f34956;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34957;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final PlaybackSession f34960;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8353 f34961;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Executor f34952 = C10881.m27178();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C20369 f34947 = new C20369();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22485 f34959 = new C22485();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f34954 = new HashMap();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f34953 = new HashMap();

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f34948 = SystemClock.elapsedRealtime();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f34958 = 0;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f34942 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11715 m28595(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C11715(context, mediaMetricsManager.createPlaybackSession());
    }

    public C11715(Context context, PlaybackSession playbackSession) {
        this.f34949 = context.getApplicationContext();
        this.f34960 = playbackSession;
        C13125 c13125 = new C13125();
        this.f34938 = c13125;
        c13125.m31796(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LogSessionId m28605() {
        return this.f34960.getSessionId();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28606(C0425 c0425, String str) {
        C15894 c15894 = c0425.f1895;
        if (c15894 == null || !c15894.m37669()) {
            m28604();
            this.f34936 = str;
            this.f34934 = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.8.0");
            m28597(c0425.f1892, c15894);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28607(C0425 c0425, String str) {
        C15894 c15894 = c0425.f1895;
        if ((c15894 == null || !c15894.m37669()) && str.equals(this.f34936)) {
            m28604();
        }
        this.f34953.remove(str);
        this.f34954.remove(str);
    }

    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    public final void mo3861(int i) {
        if (i == 1) {
            this.f34956 = true;
        }
        this.f34951 = i;
    }

    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    public final void mo3865(C3519 c3519) {
        this.f34937 += c3519.f11178;
        this.f34957 += c3519.f11172;
    }

    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    public final void mo3862(C0425 c0425, int i, long j) {
        C15894 c15894 = c0425.f1895;
        if (c15894 != null) {
            String m31793 = this.f34938.m31793(c0425.f1892, c15894);
            HashMap hashMap = this.f34954;
            Long l2 = (Long) hashMap.get(m31793);
            HashMap hashMap2 = this.f34953;
            Long l3 = (Long) hashMap2.get(m31793);
            hashMap.put(m31793, Long.valueOf((l2 == null ? 0L : l2.longValue()) + j));
            hashMap2.put(m31793, Long.valueOf((l3 != null ? l3.longValue() : 0L) + i));
        }
    }

    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    public final void mo3863(C0425 c0425, C6723 c6723) {
        C15894 c15894 = c0425.f1895;
        if (c15894 == null) {
            return;
        }
        C8353 c8353 = c6723.f20867;
        c8353.getClass();
        int i = c6723.f20864;
        AbstractC4846 abstractC4846 = c0425.f1892;
        c15894.getClass();
        C6070 c6070 = new C6070(c8353, i, this.f34938.m31793(abstractC4846, c15894));
        int i2 = c6723.f20868;
        if (i2 != 0) {
            if (i2 == 1) {
                this.f34941 = c6070;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.f34943 = c6070;
                return;
            }
        }
        this.f34950 = c6070;
    }

    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    public final void mo3866(C6404 c6404) {
        C6070 c6070 = this.f34950;
        if (c6070 != null) {
            C8353 c8353 = c6070.f18586;
            if (c8353.f25609 == -1) {
                C1297 m21948 = c8353.m21948();
                m21948.m4453(c6404.f19815);
                m21948.m4457(c6404.f19813);
                this.f34950 = new C6070(m21948.m4440(), c6070.f18587, c6070.f18588);
            }
        }
    }

    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    public final void mo3867(C6723 c6723) {
        this.f34955 = c6723.f20862;
    }

    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    public final void mo3868(C16134 c16134) {
        this.f34935 = c16134;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03dc  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, l.۠ᩴ֫] */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // l.InterfaceC1131
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo3864(l.InterfaceC1318 r21, l.C5365 r22) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11715.mo3864(l.֨᩵֫, l.ۚ۬֫):void");
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m28603(C6070 c6070) {
        return c6070 != null && c6070.f18588.equals(this.f34938.m31792());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28596(int i, long j, C8353 c8353, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.f34948);
        int i4 = 1;
        if (c8353 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = c8353.f25606;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c8353.f25614;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c8353.f25619;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i5 = c8353.f25627;
            if (i5 != -1) {
                timeSinceCreatedMillis.setBitrate(i5);
            }
            int i6 = c8353.f25633;
            if (i6 != -1) {
                timeSinceCreatedMillis.setWidth(i6);
            }
            int i7 = c8353.f25609;
            if (i7 != -1) {
                timeSinceCreatedMillis.setHeight(i7);
            }
            int i8 = c8353.f25625;
            if (i8 != -1) {
                timeSinceCreatedMillis.setChannelCount(i8);
            }
            int i9 = c8353.f25624;
            if (i9 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i9);
            }
            String str4 = c8353.f25603;
            if (str4 != null) {
                String str5 = C3603.f11424;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c8353.f25596;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f34940 = true;
        this.f34952.execute(new RunnableC13821(i4, this, timeSinceCreatedMillis.build()));
    }

    @RequiresNonNull({"metricsBuilder"})
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28597(AbstractC4846 abstractC4846, C15894 c15894) {
        int mo14098;
        PlaybackMetrics.Builder builder = this.f34934;
        if (c15894 == null || (mo14098 = abstractC4846.mo14098(c15894.f49112)) == -1) {
            return;
        }
        C22485 c22485 = this.f34959;
        int i = 0;
        abstractC4846.mo14104(mo14098, c22485, false);
        int i2 = c22485.f72806;
        C20369 c20369 = this.f34947;
        abstractC4846.m14106(i2, c20369);
        C11881 c11881 = c20369.f65753.f33612;
        if (c11881 != null) {
            int m11006 = C3603.m11006(c11881.f35426, c11881.f35423);
            i = m11006 != 0 ? m11006 != 1 ? m11006 != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i);
        if (c20369.f65755 != -9223372036854775807L && !c20369.f65756 && !c20369.f65759 && !c20369.m46687()) {
            builder.setMediaDurationMillis(C3603.m11037(c20369.f65755));
        }
        builder.setPlaybackType(c20369.m46687() ? 2 : 1);
        this.f34940 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m28604() {
        PlaybackMetrics.Builder builder = this.f34934;
        if (builder != null && this.f34940) {
            builder.setAudioUnderrunCount(this.f34946);
            this.f34934.setVideoFramesDropped(this.f34937);
            this.f34934.setVideoFramesPlayed(this.f34957);
            Long l2 = (Long) this.f34953.get(this.f34936);
            this.f34934.setNetworkTransferDurationMillis(l2 == null ? 0L : l2.longValue());
            Long l3 = (Long) this.f34954.get(this.f34936);
            this.f34934.setNetworkBytesRead(l3 == null ? 0L : l3.longValue());
            this.f34934.setStreamSource((l3 == null || l3.longValue() <= 0) ? 0 : 1);
            this.f34952.execute(new RunnableC2180(1, this, this.f34934.build()));
        }
        this.f34934 = null;
        this.f34936 = null;
        this.f34946 = 0;
        this.f34937 = 0;
        this.f34957 = 0;
        this.f34944 = null;
        this.f34961 = null;
        this.f34945 = null;
        this.f34940 = false;
    }
}
