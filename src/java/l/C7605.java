package l;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import com.google.android.material.datepicker.UtcDates;
import com.umeng.analytics.pro.cb;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: 057Y */
/* renamed from: l.۟ܿ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7605 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C11839[] f23497;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f23499;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Charset f23501;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23503;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String[] f23504;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C11839[][] f23507;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f23508;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap[] f23509;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int[] f23510;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23513;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f23514;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final SimpleDateFormat f23518;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final Set f23519;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final C11839 f23520;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f23525;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f23528;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f23530;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6194 f23531;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f23532;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f23533;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f23534;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AssetManager.AssetInputStream f23535;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f23536;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public FileDescriptor f23537;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap[] f23538;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ByteOrder f23539;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashSet f23540;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f23541;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f23542;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final boolean f23496 = Log.isLoggable("ExifInterface", 3);

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final List f23521 = Arrays.asList(1, 6, 3, 8);

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final List f23517 = Arrays.asList(2, 7, 4, 5);

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int[] f23523 = {8, 8, 8};

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final int[] f23522 = {8};

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23512 = {-1, -40, -1};

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23500 = {102, 116, 121, KeyFactorySpi.Ed25519_type};

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23502 = {109, 105, 102, 49};

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final byte[] f23524 = {104, 101, 105, 99};

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final byte[] f23526 = {97, 118, 105, 102};

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final byte[] f23527 = {97, 118, 105, 115};

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final byte[] f23515 = {79, 76, 89, 77, UTF8.S_P4A, 0};

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final byte[] f23506 = {79, 76, 89, 77, UTF8.S_P4A, 85, 83, 0, 73, 73};

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23511 = {-119, UTF8.S_P4A, 78, 71, cb.k, 10, 26, 10};

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23498 = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23529 = {82, 73, 70, 70};

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23505 = {87, 69, 66, UTF8.S_P4A};

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f23516 = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f23504 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f23510 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f23503 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C11839[] c11839Arr = {new C11839("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C11839("SubfileType", 255, 4), new C11839("ImageWidth", 256, 3, 4), new C11839("ImageLength", 257, 3, 4), new C11839("BitsPerSample", 258, 3), new C11839("Compression", 259, 3), new C11839("PhotometricInterpretation", 262, 3), new C11839("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C11839("Make", 271, 2), new C11839("Model", 272, 2), new C11839("StripOffsets", 273, 3, 4), new C11839("Orientation", 274, 3), new C11839("SamplesPerPixel", 277, 3), new C11839("RowsPerStrip", 278, 3, 4), new C11839("StripByteCounts", 279, 3, 4), new C11839("XResolution", 282, 5), new C11839("YResolution", 283, 5), new C11839("PlanarConfiguration", 284, 3), new C11839("ResolutionUnit", 296, 3), new C11839("TransferFunction", 301, 3), new C11839("Software", 305, 2), new C11839("DateTime", 306, 2), new C11839("Artist", 315, 2), new C11839("WhitePoint", 318, 5), new C11839("PrimaryChromaticities", 319, 5), new C11839("SubIFDPointer", 330, 4), new C11839("JPEGInterchangeFormat", 513, 4), new C11839("JPEGInterchangeFormatLength", 514, 4), new C11839("YCbCrCoefficients", 529, 5), new C11839("YCbCrSubSampling", 530, 3), new C11839("YCbCrPositioning", 531, 3), new C11839("ReferenceBlackWhite", 532, 5), new C11839("Copyright", 33432, 2), new C11839("ExifIFDPointer", 34665, 4), new C11839("GPSInfoIFDPointer", 34853, 4), new C11839("SensorTopBorder", 4, 4), new C11839("SensorLeftBorder", 5, 4), new C11839("SensorBottomBorder", 6, 4), new C11839("SensorRightBorder", 7, 4), new C11839("ISO", 23, 3), new C11839("JpgFromRaw", 46, 7), new C11839("Xmp", 700, 1)};
        C11839[] c11839Arr2 = {new C11839("ExposureTime", 33434, 5), new C11839("FNumber", 33437, 5), new C11839("ExposureProgram", 34850, 3), new C11839("SpectralSensitivity", 34852, 2), new C11839("PhotographicSensitivity", 34855, 3), new C11839("OECF", 34856, 7), new C11839("SensitivityType", 34864, 3), new C11839("StandardOutputSensitivity", 34865, 4), new C11839("RecommendedExposureIndex", 34866, 4), new C11839("ISOSpeed", 34867, 4), new C11839("ISOSpeedLatitudeyyy", 34868, 4), new C11839("ISOSpeedLatitudezzz", 34869, 4), new C11839("ExifVersion", UMModuleRegister.INNER_EVENT_VALUE_HIGH, 2), new C11839("DateTimeOriginal", 36867, 2), new C11839("DateTimeDigitized", 36868, 2), new C11839("OffsetTime", 36880, 2), new C11839("OffsetTimeOriginal", 36881, 2), new C11839("OffsetTimeDigitized", 36882, 2), new C11839("ComponentsConfiguration", UMModuleRegister.APPSTATUS_SWITCH_LOW, 7), new C11839("CompressedBitsPerPixel", 37122, 5), new C11839("ShutterSpeedValue", 37377, 10), new C11839("ApertureValue", 37378, 5), new C11839("BrightnessValue", 37379, 10), new C11839("ExposureBiasValue", 37380, 10), new C11839("MaxApertureValue", 37381, 5), new C11839("SubjectDistance", 37382, 5), new C11839("MeteringMode", 37383, 3), new C11839("LightSource", 37384, 3), new C11839("Flash", 37385, 3), new C11839("FocalLength", 37386, 5), new C11839("SubjectArea", 37396, 3), new C11839("MakerNote", 37500, 7), new C11839("UserComment", 37510, 7), new C11839("SubSecTime", 37520, 2), new C11839("SubSecTimeOriginal", 37521, 2), new C11839("SubSecTimeDigitized", 37522, 2), new C11839("FlashpixVersion", 40960, 7), new C11839("ColorSpace", 40961, 3), new C11839("PixelXDimension", 40962, 3, 4), new C11839("PixelYDimension", 40963, 3, 4), new C11839("RelatedSoundFile", 40964, 2), new C11839("InteroperabilityIFDPointer", 40965, 4), new C11839("FlashEnergy", 41483, 5), new C11839("SpatialFrequencyResponse", 41484, 7), new C11839("FocalPlaneXResolution", 41486, 5), new C11839("FocalPlaneYResolution", 41487, 5), new C11839("FocalPlaneResolutionUnit", 41488, 3), new C11839("SubjectLocation", 41492, 3), new C11839("ExposureIndex", 41493, 5), new C11839("SensingMethod", 41495, 3), new C11839("FileSource", 41728, 7), new C11839("SceneType", 41729, 7), new C11839("CFAPattern", 41730, 7), new C11839("CustomRendered", 41985, 3), new C11839("ExposureMode", 41986, 3), new C11839("WhiteBalance", 41987, 3), new C11839("DigitalZoomRatio", 41988, 5), new C11839("FocalLengthIn35mmFilm", 41989, 3), new C11839("SceneCaptureType", 41990, 3), new C11839("GainControl", 41991, 3), new C11839("Contrast", 41992, 3), new C11839("Saturation", 41993, 3), new C11839("Sharpness", 41994, 3), new C11839("DeviceSettingDescription", 41995, 7), new C11839("SubjectDistanceRange", 41996, 3), new C11839("ImageUniqueID", 42016, 2), new C11839("CameraOwnerName", 42032, 2), new C11839("BodySerialNumber", 42033, 2), new C11839("LensSpecification", 42034, 5), new C11839("LensMake", 42035, 2), new C11839("LensModel", 42036, 2), new C11839("Gamma", 42240, 5), new C11839("DNGVersion", 50706, 1), new C11839("DefaultCropSize", 50720, 3, 4)};
        C11839[] c11839Arr3 = {new C11839("GPSVersionID", 0, 1), new C11839("GPSLatitudeRef", 1, 2), new C11839("GPSLatitude", 2, 5, 10), new C11839("GPSLongitudeRef", 3, 2), new C11839("GPSLongitude", 4, 5, 10), new C11839("GPSAltitudeRef", 5, 1), new C11839("GPSAltitude", 6, 5), new C11839("GPSTimeStamp", 7, 5), new C11839("GPSSatellites", 8, 2), new C11839("GPSStatus", 9, 2), new C11839("GPSMeasureMode", 10, 2), new C11839("GPSDOP", 11, 5), new C11839("GPSSpeedRef", 12, 2), new C11839("GPSSpeed", 13, 5), new C11839("GPSTrackRef", 14, 2), new C11839("GPSTrack", 15, 5), new C11839("GPSImgDirectionRef", 16, 2), new C11839("GPSImgDirection", 17, 5), new C11839("GPSMapDatum", 18, 2), new C11839("GPSDestLatitudeRef", 19, 2), new C11839("GPSDestLatitude", 20, 5), new C11839("GPSDestLongitudeRef", 21, 2), new C11839("GPSDestLongitude", 22, 5), new C11839("GPSDestBearingRef", 23, 2), new C11839("GPSDestBearing", 24, 5), new C11839("GPSDestDistanceRef", 25, 2), new C11839("GPSDestDistance", 26, 5), new C11839("GPSProcessingMethod", 27, 7), new C11839("GPSAreaInformation", 28, 7), new C11839("GPSDateStamp", 29, 2), new C11839("GPSDifferential", 30, 3), new C11839("GPSHPositioningError", 31, 5)};
        C11839[] c11839Arr4 = {new C11839("InteroperabilityIndex", 1, 2)};
        C11839[] c11839Arr5 = {new C11839("NewSubfileType", Scalar25519.TARGET_LENGTH, 4), new C11839("SubfileType", 255, 4), new C11839("ThumbnailImageWidth", 256, 3, 4), new C11839("ThumbnailImageLength", 257, 3, 4), new C11839("BitsPerSample", 258, 3), new C11839("Compression", 259, 3), new C11839("PhotometricInterpretation", 262, 3), new C11839("ImageDescription", BottomAppBarTopEdgeTreatment.ANGLE_UP, 2), new C11839("Make", 271, 2), new C11839("Model", 272, 2), new C11839("StripOffsets", 273, 3, 4), new C11839("ThumbnailOrientation", 274, 3), new C11839("SamplesPerPixel", 277, 3), new C11839("RowsPerStrip", 278, 3, 4), new C11839("StripByteCounts", 279, 3, 4), new C11839("XResolution", 282, 5), new C11839("YResolution", 283, 5), new C11839("PlanarConfiguration", 284, 3), new C11839("ResolutionUnit", 296, 3), new C11839("TransferFunction", 301, 3), new C11839("Software", 305, 2), new C11839("DateTime", 306, 2), new C11839("Artist", 315, 2), new C11839("WhitePoint", 318, 5), new C11839("PrimaryChromaticities", 319, 5), new C11839("SubIFDPointer", 330, 4), new C11839("JPEGInterchangeFormat", 513, 4), new C11839("JPEGInterchangeFormatLength", 514, 4), new C11839("YCbCrCoefficients", 529, 5), new C11839("YCbCrSubSampling", 530, 3), new C11839("YCbCrPositioning", 531, 3), new C11839("ReferenceBlackWhite", 532, 5), new C11839("Copyright", 33432, 2), new C11839("ExifIFDPointer", 34665, 4), new C11839("GPSInfoIFDPointer", 34853, 4), new C11839("DNGVersion", 50706, 1), new C11839("DefaultCropSize", 50720, 3, 4)};
        f23520 = new C11839("StripOffsets", 273, 3);
        f23507 = new C11839[][]{c11839Arr, c11839Arr2, c11839Arr3, c11839Arr4, c11839Arr5, c11839Arr, new C11839[]{new C11839("ThumbnailImage", 256, 7), new C11839("CameraSettingsIFDPointer", 8224, 4), new C11839("ImageProcessingIFDPointer", 8256, 4)}, new C11839[]{new C11839("PreviewImageStart", 257, 4), new C11839("PreviewImageLength", 258, 4)}, new C11839[]{new C11839("AspectFrame", 4371, 3)}, new C11839[]{new C11839("ColorSpace", 55, 3)}};
        f23497 = new C11839[]{new C11839("SubIFDPointer", 330, 4), new C11839("ExifIFDPointer", 34665, 4), new C11839("GPSInfoIFDPointer", 34853, 4), new C11839("InteroperabilityIFDPointer", 40965, 4), new C11839("CameraSettingsIFDPointer", 8224, 1), new C11839("ImageProcessingIFDPointer", 8256, 1)};
        f23509 = new HashMap[10];
        f23508 = new HashMap[10];
        f23519 = C20195.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        f23525 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f23501 = forName;
        f23514 = "Exif\u0000\u0000".getBytes(forName);
        f23513 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f23518 = simpleDateFormat;
        simpleDateFormat.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f23499 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(C3261.getTimeZone(UtcDates.UTC));
        int i = 0;
        while (true) {
            C11839[][] c11839Arr6 = f23507;
            if (i < c11839Arr6.length) {
                f23509[i] = new HashMap();
                f23508[i] = new HashMap();
                for (C11839 c11839 : c11839Arr6[i]) {
                    f23509[i].put(Integer.valueOf(c11839.f35320), c11839);
                    f23508[i].put(c11839.f35319, c11839);
                }
                i++;
            } else {
                HashMap hashMap = f23525;
                C11839[] c11839Arr7 = f23497;
                hashMap.put(Integer.valueOf(c11839Arr7[0].f35320), 5);
                hashMap.put(Integer.valueOf(c11839Arr7[1].f35320), 1);
                hashMap.put(Integer.valueOf(c11839Arr7[2].f35320), 2);
                hashMap.put(Integer.valueOf(c11839Arr7[3].f35320), 3);
                hashMap.put(Integer.valueOf(c11839Arr7[4].f35320), 7);
                hashMap.put(Integer.valueOf(c11839Arr7[5].f35320), 8);
                f23528 = Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C7605(java.io.InputStream r8, int r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7605.<init>(java.io.InputStream, int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C6194 m20369(String str) {
        C6194 c6194;
        int i;
        C6194 c61942;
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        if ("Xmp".equals(str) && (i = this.f23542) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (c61942 = this.f23531) != null)) {
            return c61942;
        }
        for (int i2 = 0; i2 < f23507.length; i2++) {
            C6194 c61943 = (C6194) this.f23538[i2].get(str);
            if (c61943 != null) {
                return c61943;
            }
        }
        if (!"Xmp".equals(str) || (c6194 = this.f23531) == null) {
            return null;
        }
        return c6194;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m20385(String str) {
        C6194 m20369 = m20369(str);
        if (m20369 != null) {
            if (str.equals("GPSTimeStamp")) {
                int i = m20369.f19002;
                if (i == 5 || i == 10) {
                    C23127[] c23127Arr = (C23127[]) m20369.m17121(this.f23539);
                    if (c23127Arr == null || c23127Arr.length != 3) {
                        Arrays.toString(c23127Arr);
                        return null;
                    }
                    C23127 c23127 = c23127Arr[0];
                    Integer valueOf = Integer.valueOf((int) (c23127.f74374 / c23127.f74373));
                    C23127 c231272 = c23127Arr[1];
                    Integer valueOf2 = Integer.valueOf((int) (c231272.f74374 / c231272.f74373));
                    C23127 c231273 = c23127Arr[2];
                    return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (c231273.f74374 / c231273.f74373)));
                }
            } else if (f23519.contains(str)) {
                try {
                    return Double.toString(m20369.m17118(this.f23539));
                } catch (NumberFormatException unused) {
                }
            } else {
                return m20369.m17120(this.f23539);
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m20384() {
        C6194 m20369 = m20369("Orientation");
        if (m20369 == null) {
            return 1;
        }
        try {
            return m20369.m17119(this.f23539);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m20367() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.f23538;
            if (i >= hashMapArr.length) {
                return;
            }
            hashMapArr[i].size();
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                C6194 c6194 = (C6194) entry.getValue();
                c6194.toString();
                c6194.m17120(this.f23539);
            }
            i++;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Long m20386() {
        return m20356(m20385("DateTime"), m20385("SubSecTime"), m20385("OffsetTime"));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Long m20387() {
        return m20356(m20385("DateTimeDigitized"), m20385("SubSecTimeDigitized"), m20385("OffsetTimeDigitized"));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Long m20389() {
        return m20356(m20385("DateTimeOriginal"), m20385("SubSecTimeOriginal"), m20385("OffsetTimeOriginal"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Long m20356(String str, String str2, String str3) {
        long j;
        if (str != null && f23528.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date parse = f23518.parse(str, parsePosition);
                if (parse == null && (parse = f23499.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = parse.getTime();
                if (str3 != null) {
                    String substring = str3.substring(0, 1);
                    int parseInt = Integer.parseInt(str3.substring(1, 3));
                    int parseInt2 = Integer.parseInt(str3.substring(4, 6));
                    if ((BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(substring) || "-".equals(substring)) && ":".equals(str3.substring(3, 4)) && parseInt <= 14) {
                        time += C4153.m12551(parseInt, 60, parseInt2, 60000) * ("-".equals(substring) ? 1 : -1);
                    }
                }
                if (str2 != null) {
                    try {
                        int min = Math.min(str2.length(), 3);
                        j = Long.parseLong(str2.substring(0, min));
                        while (min < 3) {
                            j *= 10;
                            min++;
                        }
                    } catch (NumberFormatException unused) {
                        j = 0;
                    }
                    time += j;
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused2) {
            }
        }
        return null;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Long m20388() {
        String m20385 = m20385("GPSDateStamp");
        String m203852 = m20385("GPSTimeStamp");
        if (m20385 == null || m203852 == null) {
            return null;
        }
        Pattern pattern = f23528;
        if (!pattern.matcher(m20385).matches() && !pattern.matcher(m203852).matches()) {
            return null;
        }
        String str = m20385 + ' ' + m203852;
        ParsePosition parsePosition = new ParsePosition(0);
        try {
            Date parse = f23518.parse(str, parsePosition);
            if (parse == null && (parse = f23499.parse(str, parsePosition)) == null) {
                return null;
            }
            return Long.valueOf(parse.getTime());
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x00cc, code lost:
    
        if (r4 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m20355(java.io.BufferedInputStream r19) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7605.m20355(java.io.BufferedInputStream):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0107 A[LOOP:0: B:9:0x0024->B:35:0x0107, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010d A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m20361(l.C10428 r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7605.m20361(l.ۤܿ֫, int, int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20371(C13954 c13954) {
        m20379(c13954);
        m20372(c13954, 0);
        m20377(c13954, 0);
        m20377(c13954, 5);
        m20377(c13954, 4);
        m20374();
        if (this.f23542 == 8) {
            HashMap[] hashMapArr = this.f23538;
            C6194 c6194 = (C6194) hashMapArr[1].get("MakerNote");
            if (c6194 != null) {
                C13954 c139542 = new C13954(c6194.f19000);
                c139542.m26272(this.f23539);
                c139542.m26271(6);
                m20372(c139542, 9);
                C6194 c61942 = (C6194) hashMapArr[9].get("ColorSpace");
                if (c61942 != null) {
                    hashMapArr[1].put("ColorSpace", c61942);
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m20370(C10428 c10428) {
        if (f23496) {
            C11003.toString(c10428);
        }
        c10428.m26271(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c10428.readFully(bArr);
        c10428.readFully(bArr2);
        c10428.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c10428.m26271(i - c10428.f31330);
        c10428.readFully(bArr4);
        m20361(new C10428(bArr4), i, 5);
        c10428.m26271(i3 - c10428.f31330);
        c10428.m26272(ByteOrder.BIG_ENDIAN);
        int readInt = c10428.readInt();
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = c10428.readUnsignedShort();
            int readUnsignedShort2 = c10428.readUnsignedShort();
            if (readUnsignedShort == f23520.f35320) {
                short readShort = c10428.readShort();
                short readShort2 = c10428.readShort();
                C6194 m17114 = C6194.m17114((int) readShort, this.f23539);
                C6194 m171142 = C6194.m17114((int) readShort2, this.f23539);
                HashMap[] hashMapArr = this.f23538;
                hashMapArr[0].put("ImageLength", m17114);
                hashMapArr[0].put("ImageWidth", m171142);
                return;
            }
            c10428.m26271(readUnsignedShort2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20364(C13954 c13954, int i) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIC files is supported from SDK 28 and above");
        }
        if (i == 15 && i2 < 31) {
            throw new UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C1877.m6214(mediaMetadataRetriever, new C12544(c13954));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str3 = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.f23538;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", C6194.m17114(Integer.parseInt(str), this.f23539));
                }
                if (str3 != null) {
                    hashMapArr[0].put("ImageLength", C6194.m17114(Integer.parseInt(str3), this.f23539));
                }
                if (str2 != null) {
                    int parseInt = Integer.parseInt(str2);
                    hashMapArr[0].put("Orientation", C6194.m17114(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f23539));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c13954.seek(parseInt2);
                    byte[] bArr = new byte[6];
                    c13954.readFully(bArr);
                    int i3 = parseInt2 + 6;
                    int i4 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f23514)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i4];
                    c13954.readFully(bArr2);
                    this.f23532 = i3;
                    m20359(0, bArr2);
                }
                String extractMetadata5 = mediaMetadataRetriever.extractMetadata(41);
                String extractMetadata6 = mediaMetadataRetriever.extractMetadata(42);
                if (extractMetadata5 != null && extractMetadata6 != null) {
                    int parseInt4 = Integer.parseInt(extractMetadata5);
                    int parseInt5 = Integer.parseInt(extractMetadata6);
                    long j = parseInt4;
                    c13954.seek(j);
                    byte[] bArr3 = new byte[parseInt5];
                    c13954.readFully(bArr3);
                    this.f23531 = new C6194(j, bArr3, 1, parseInt5);
                }
            } catch (RuntimeException e) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e);
            }
        } finally {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m20381(C13954 c13954) {
        byte[] bArr = f23514;
        byte[] bArr2 = new byte[bArr.length];
        c13954.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            return false;
        }
        byte[] bArr3 = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArr3.length) {
                bArr3 = Arrays.copyOf(bArr3, bArr3.length * 2);
            }
            int read = c13954.f31333.read(bArr3, i, bArr3.length - i);
            if (read != -1) {
                i += read;
                c13954.f31330 += read;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr3, i);
                this.f23532 = bArr.length;
                m20359(0, copyOf);
                return true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20363(C13954 c13954) {
        int i;
        int i2;
        m20371(c13954);
        HashMap[] hashMapArr = this.f23538;
        C6194 c6194 = (C6194) hashMapArr[1].get("MakerNote");
        if (c6194 != null) {
            C13954 c139542 = new C13954(c6194.f19000);
            c139542.m26272(this.f23539);
            byte[] bArr = f23515;
            byte[] bArr2 = new byte[bArr.length];
            c139542.readFully(bArr2);
            c139542.seek(0L);
            byte[] bArr3 = f23506;
            byte[] bArr4 = new byte[bArr3.length];
            c139542.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c139542.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c139542.seek(12L);
            }
            m20372(c139542, 6);
            C6194 c61942 = (C6194) hashMapArr[7].get("PreviewImageStart");
            C6194 c61943 = (C6194) hashMapArr[7].get("PreviewImageLength");
            if (c61942 != null && c61943 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", c61942);
                hashMapArr[5].put("JPEGInterchangeFormatLength", c61943);
            }
            C6194 c61944 = (C6194) hashMapArr[8].get("AspectFrame");
            if (c61944 != null) {
                int[] iArr = (int[]) c61944.m17121(this.f23539);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C6194 m17114 = C6194.m17114(i5, this.f23539);
                C6194 m171142 = C6194.m17114(i6, this.f23539);
                hashMapArr[0].put("ImageWidth", m17114);
                hashMapArr[0].put("ImageLength", m171142);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20376(C13954 c13954) {
        if (f23496) {
            C11003.toString(c13954);
        }
        m20371(c13954);
        HashMap[] hashMapArr = this.f23538;
        C6194 c6194 = (C6194) hashMapArr[0].get("JpgFromRaw");
        if (c6194 != null) {
            m20361(new C10428(c6194.f19000), (int) c6194.f19001, 5);
        }
        C6194 c61942 = (C6194) hashMapArr[0].get("ISO");
        C6194 c61943 = (C6194) hashMapArr[1].get("PhotographicSensitivity");
        if (c61942 == null || c61943 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", c61942);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20360(C10428 c10428) {
        if (f23496) {
            C11003.toString(c10428);
        }
        c10428.m26272(ByteOrder.BIG_ENDIAN);
        int i = c10428.f31330;
        c10428.m26271(f23511.length);
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (z && z2) {
                return;
            }
            try {
                int readInt = c10428.readInt();
                int readInt2 = c10428.readInt();
                int i2 = c10428.f31330;
                int i3 = i2 + readInt + 4;
                int i4 = i2 - i;
                if (i4 == 16 && readInt2 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (readInt2 == 1229278788) {
                    return;
                }
                if (readInt2 == 1700284774 && !z) {
                    this.f23532 = i4;
                    byte[] bArr = new byte[readInt];
                    c10428.readFully(bArr);
                    int readInt3 = c10428.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(readInt2 >>> 24);
                    crc32.update(readInt2 >>> 16);
                    crc32.update(readInt2 >>> 8);
                    crc32.update(readInt2);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != readInt3) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt3 + ", calculated CRC value: " + crc32.getValue());
                    }
                    m20359(0, bArr);
                    m20374();
                    m20378(new C10428(bArr));
                    z = true;
                } else if (readInt2 == 1767135348 && !z2) {
                    byte[] bArr2 = f23498;
                    if (readInt >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        c10428.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i5 = c10428.f31330 - i;
                            int i6 = readInt - length;
                            byte[] bArr4 = new byte[i6];
                            c10428.readFully(bArr4);
                            this.f23531 = new C6194(i5, bArr4, 1, i6);
                            z2 = true;
                        }
                    }
                }
                c10428.m26271(i3 - c10428.f31330);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt PNG file.", e);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20375(C10428 c10428) {
        if (f23496) {
            C11003.toString(c10428);
        }
        c10428.m26272(ByteOrder.LITTLE_ENDIAN);
        c10428.m26271(f23529.length);
        int readInt = c10428.readInt() + 8;
        byte[] bArr = f23505;
        c10428.m26271(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c10428.readFully(bArr2);
                int readInt2 = c10428.readInt();
                int i = length + 8;
                if (Arrays.equals(f23516, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    c10428.readFully(bArr3);
                    byte[] bArr4 = f23514;
                    if (C11050.m27435(bArr3, bArr4)) {
                        bArr3 = Arrays.copyOfRange(bArr3, bArr4.length, readInt2);
                    }
                    this.f23532 = i;
                    m20359(0, bArr3);
                    m20378(new C10428(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c10428.m26271(readInt2);
            } catch (EOFException e) {
                throw new IOException("Encountered corrupt WebP file.", e);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20359(int i, byte[] bArr) {
        C13954 c13954 = new C13954(bArr);
        m20379(c13954);
        m20372(c13954, i);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m20368() {
        String m20385 = m20385("DateTimeOriginal");
        HashMap[] hashMapArr = this.f23538;
        if (m20385 != null && m20385("DateTime") == null) {
            hashMapArr[0].put("DateTime", C6194.m17116(m20385));
        }
        if (m20385("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", C6194.m17115(0L, this.f23539));
        }
        if (m20385("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", C6194.m17115(0L, this.f23539));
        }
        if (m20385("Orientation") == null) {
            hashMapArr[0].put("Orientation", C6194.m17115(0L, this.f23539));
        }
        if (m20385("LightSource") == null) {
            hashMapArr[1].put("LightSource", C6194.m17115(0L, this.f23539));
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ByteOrder m20380(C10428 c10428) {
        short readShort = c10428.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException(C13540.m32584(new StringBuilder("Invalid byte order: "), readShort));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20379(C13954 c13954) {
        ByteOrder m20380 = m20380((C10428) c13954);
        this.f23539 = m20380;
        c13954.m26272(m20380);
        int readUnsignedShort = c13954.readUnsignedShort();
        int i = this.f23542;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            throw new IOException(C13540.m32584(new StringBuilder("Invalid start code: "), readUnsignedShort));
        }
        int readInt = c13954.readInt();
        if (readInt < 8) {
            throw new IOException(C19370.m44628(readInt, "Invalid first Ifd offset: "));
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            c13954.m26271(i2);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m20378(C10428 c10428) {
        C6194 c6194;
        HashMap hashMap = this.f23538[4];
        C6194 c61942 = (C6194) hashMap.get("Compression");
        if (c61942 != null) {
            int m17119 = c61942.m17119(this.f23539);
            if (m17119 != 1) {
                if (m17119 == 6) {
                    m20362(c10428, hashMap);
                    return;
                } else if (m17119 != 7) {
                    return;
                }
            }
            C6194 c61943 = (C6194) hashMap.get("BitsPerSample");
            if (c61943 != null) {
                int[] iArr = (int[]) c61943.m17121(this.f23539);
                int[] iArr2 = f23523;
                if (!Arrays.equals(iArr2, iArr)) {
                    if (this.f23542 != 3 || (c6194 = (C6194) hashMap.get("PhotometricInterpretation")) == null) {
                        return;
                    }
                    int m171192 = c6194.m17119(this.f23539);
                    if ((m171192 != 1 || !Arrays.equals(iArr, f23522)) && (m171192 != 6 || !Arrays.equals(iArr, iArr2))) {
                        return;
                    }
                }
                C6194 c61944 = (C6194) hashMap.get("StripOffsets");
                C6194 c61945 = (C6194) hashMap.get("StripByteCounts");
                if (c61944 == null || c61945 == null) {
                    return;
                }
                long[] m27436 = C11050.m27436(c61944.m17121(this.f23539));
                long[] m274362 = C11050.m27436(c61945.m17121(this.f23539));
                if (m27436 == null || m27436.length == 0 || m274362 == null || m274362.length == 0 || m27436.length != m274362.length) {
                    return;
                }
                long j = 0;
                for (long j2 : m274362) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.f23530 = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < m27436.length; i3++) {
                    int i4 = (int) m27436[i3];
                    int i5 = (int) m274362[i3];
                    if (i3 < m27436.length - 1 && i4 + i5 != m27436[i3 + 1]) {
                        this.f23530 = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        return;
                    }
                    try {
                        c10428.m26271(i6);
                        int i7 = i + i6;
                        byte[] bArr2 = new byte[i5];
                        c10428.readFully(bArr2);
                        i = i7 + i5;
                        System.arraycopy(bArr2, 0, bArr, i2, i5);
                        i2 += i5;
                    } catch (EOFException unused) {
                        return;
                    }
                }
                if (this.f23530) {
                    long j3 = m27436[0];
                    return;
                }
                return;
            }
            return;
        }
        m20362(c10428, hashMap);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20362(C10428 c10428, HashMap hashMap) {
        C6194 c6194 = (C6194) hashMap.get("JPEGInterchangeFormat");
        C6194 c61942 = (C6194) hashMap.get("JPEGInterchangeFormatLength");
        if (c6194 == null || c61942 == null) {
            return;
        }
        int m17119 = c6194.m17119(this.f23539);
        int m171192 = c61942.m17119(this.f23539);
        if (this.f23542 == 7) {
            m17119 += this.f23541;
        }
        if (m17119 <= 0 || m171192 <= 0 || this.f23535 != null || this.f23537 != null) {
            return;
        }
        c10428.m26271(m17119);
        c10428.readFully(new byte[m171192]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20365(HashMap hashMap) {
        C6194 c6194 = (C6194) hashMap.get("ImageLength");
        C6194 c61942 = (C6194) hashMap.get("ImageWidth");
        if (c6194 == null || c61942 == null) {
            return false;
        }
        return c6194.m17119(this.f23539) <= 512 && c61942.m17119(this.f23539) <= 512;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m20374() {
        m20357(0, 5);
        m20357(0, 4);
        m20357(5, 4);
        HashMap[] hashMapArr = this.f23538;
        C6194 c6194 = (C6194) hashMapArr[1].get("PixelXDimension");
        C6194 c61942 = (C6194) hashMapArr[1].get("PixelYDimension");
        if (c6194 != null && c61942 != null) {
            hashMapArr[0].put("ImageWidth", c6194);
            hashMapArr[0].put("ImageLength", c61942);
        }
        if (hashMapArr[4].isEmpty() && m20365(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        m20365(hashMapArr[4]);
        m20358(0, "ThumbnailOrientation", "Orientation");
        m20358(0, "ThumbnailImageLength", "ImageLength");
        m20358(0, "ThumbnailImageWidth", "ImageWidth");
        m20358(5, "ThumbnailOrientation", "Orientation");
        m20358(5, "ThumbnailImageLength", "ImageLength");
        m20358(5, "ThumbnailImageWidth", "ImageWidth");
        m20358(4, "Orientation", "ThumbnailOrientation");
        m20358(4, "ImageLength", "ThumbnailImageLength");
        m20358(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m20377(C13954 c13954, int i) {
        C6194 m17114;
        C6194 m171142;
        HashMap[] hashMapArr = this.f23538;
        C6194 c6194 = (C6194) hashMapArr[i].get("DefaultCropSize");
        C6194 c61942 = (C6194) hashMapArr[i].get("SensorTopBorder");
        C6194 c61943 = (C6194) hashMapArr[i].get("SensorLeftBorder");
        C6194 c61944 = (C6194) hashMapArr[i].get("SensorBottomBorder");
        C6194 c61945 = (C6194) hashMapArr[i].get("SensorRightBorder");
        if (c6194 != null) {
            if (c6194.f19002 == 5) {
                C23127[] c23127Arr = (C23127[]) c6194.m17121(this.f23539);
                if (c23127Arr == null || c23127Arr.length != 2) {
                    Arrays.toString(c23127Arr);
                    return;
                } else {
                    m17114 = C6194.m17117(c23127Arr[0], this.f23539);
                    m171142 = C6194.m17117(c23127Arr[1], this.f23539);
                }
            } else {
                int[] iArr = (int[]) c6194.m17121(this.f23539);
                if (iArr == null || iArr.length != 2) {
                    Arrays.toString(iArr);
                    return;
                } else {
                    m17114 = C6194.m17114(iArr[0], this.f23539);
                    m171142 = C6194.m17114(iArr[1], this.f23539);
                }
            }
            hashMapArr[i].put("ImageWidth", m17114);
            hashMapArr[i].put("ImageLength", m171142);
            return;
        }
        if (c61942 == null || c61943 == null || c61944 == null || c61945 == null) {
            C6194 c61946 = (C6194) hashMapArr[i].get("ImageLength");
            C6194 c61947 = (C6194) hashMapArr[i].get("ImageWidth");
            if (c61946 == null || c61947 == null) {
                C6194 c61948 = (C6194) hashMapArr[i].get("JPEGInterchangeFormat");
                C6194 c61949 = (C6194) hashMapArr[i].get("JPEGInterchangeFormatLength");
                if (c61948 == null || c61949 == null) {
                    return;
                }
                int m17119 = c61948.m17119(this.f23539);
                int m171192 = c61948.m17119(this.f23539);
                c13954.seek(m17119);
                byte[] bArr = new byte[m171192];
                c13954.readFully(bArr);
                m20361(new C10428(bArr), m17119, i);
                return;
            }
            return;
        }
        int m171193 = c61942.m17119(this.f23539);
        int m171194 = c61944.m17119(this.f23539);
        int m171195 = c61945.m17119(this.f23539);
        int m171196 = c61943.m17119(this.f23539);
        if (m171194 <= m171193 || m171195 <= m171196) {
            return;
        }
        C6194 m171143 = C6194.m17114(m171194 - m171193, this.f23539);
        C6194 m171144 = C6194.m17114(m171195 - m171196, this.f23539);
        hashMapArr[i].put("ImageLength", m171143);
        hashMapArr[i].put("ImageWidth", m171144);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m20372(l.C13954 r32, int r33) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7605.m20372(l.ܰܿ֫, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20357(int i, int i2) {
        HashMap[] hashMapArr = this.f23538;
        if (hashMapArr[i].isEmpty() || hashMapArr[i2].isEmpty()) {
            return;
        }
        C6194 c6194 = (C6194) hashMapArr[i].get("ImageLength");
        C6194 c61942 = (C6194) hashMapArr[i].get("ImageWidth");
        C6194 c61943 = (C6194) hashMapArr[i2].get("ImageLength");
        C6194 c61944 = (C6194) hashMapArr[i2].get("ImageWidth");
        if (c6194 == null || c61942 == null || c61943 == null || c61944 == null) {
            return;
        }
        int m17119 = c6194.m17119(this.f23539);
        int m171192 = c61942.m17119(this.f23539);
        int m171193 = c61943.m17119(this.f23539);
        int m171194 = c61944.m17119(this.f23539);
        if (m17119 >= m171193 || m171192 >= m171194) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20358(int i, String str, String str2) {
        HashMap[] hashMapArr = this.f23538;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, (C6194) hashMap.get(str));
        hashMapArr[i].remove(str);
    }
}
