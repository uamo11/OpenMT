package org.bouncycastle.crypto.engines;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.lang.reflect.Array;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.digests.RomulusDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.math.ec.rfc8032.Scalar25519;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* loaded from: classes.dex */
public class RomulusEngine extends AEADBaseEngine {
    public static final int AD_BLK_LEN_HALF = 16;
    public final byte[] CNT;
    public Instance instance;
    public byte[] k;
    public byte[] npub;
    public static final byte[] sbox_8 = {101, 76, 106, 66, 75, 99, 67, 107, 85, 117, 90, 122, 83, 115, 91, 123, 53, -116, 58, -127, -119, 51, GCMSIVBlockCipher.MASK, 59, -107, 37, -104, 42, -112, 35, -103, 43, -27, -52, -24, -63, -55, bo.k, -64, -23, -43, -11, -40, -8, -48, -16, -39, -7, -91, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, -88, 18, 27, -96, 19, -87, 5, -75, 10, -72, 3, -80, 11, -71, 50, -120, 60, -123, -115, 52, -124, Base32Encoder.DEFAULT_PADDING, -111, 34, -100, 44, -108, 36, -99, 45, 98, 74, 108, 69, 77, 100, 68, 109, 82, 114, 92, 124, 84, 116, 93, 125, -95, 26, -84, 21, 29, -92, 20, -83, 2, -79, 12, PSSSigner.TRAILER_IMPLICIT, 4, -76, cb.k, -67, GCMSIVBlockCipher.ADD, -56, -20, -59, -51, -28, -60, -19, -47, -15, -36, -4, -44, -12, -35, -3, 54, -114, 56, bo.h, -117, UTF8.S_P3A, -125, 57, -106, 38, -102, 40, -109, UTF8.S_CS3, -101, 41, 102, 78, 104, 65, 73, UTF8.S_P4B, 64, 105, 86, 118, 88, 120, UTF8.S_P4A, KeyFactorySpi.Ed25519_type, 89, 121, -90, 30, -86, 17, 25, -93, 16, -85, 6, -74, 8, -70, 0, -77, 9, -69, -26, -50, -22, -62, -53, -29, -61, -21, -42, -10, -38, -6, -45, -13, -37, -5, 49, -118, 62, -122, -113, 55, -121, 63, -110, PublicSuffixDatabase.EXCEPTION_MARKER, -98, 46, -105, 39, -97, 47, 97, 72, KeyFactorySpi.x25519_type, 70, 79, 103, 71, KeyFactorySpi.x448_type, 81, KeyFactorySpi.Ed448_type, 94, 126, 87, 119, 95, ColorResourcesTableCreator.APPLICATION_PACKAGE_ID, -94, 24, -82, 22, bo.j, -89, 23, -81, 1, -78, cb.f77931l, -66, 7, -73, 15, -65, -30, -54, -18, -58, -49, -25, -57, -17, -46, -14, -34, -2, -41, -9, -33, -1};
    public static final byte[] TWEAKEY_P = {9, 15, 8, cb.k, 10, cb.f77931l, 12, 11, 0, 1, 2, 3, 4, 5, 6, 7};
    public static final byte[] RC = {1, 3, 7, 15, bo.j, 62, Base32Encoder.DEFAULT_PADDING, 59, 55, 47, 30, 60, 57, 51, 39, cb.f77931l, 29, 58, 53, 43, 22, 44, 24, UTF8.S_P3A, PublicSuffixDatabase.EXCEPTION_MARKER, 2, 5, 11, 23, 46, ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB, 56, 49, 35, 6, cb.k, 27, 54, 45, 26};

    public interface Instance {
        void processBufferAAD(byte[] bArr, int i);

        void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2);

        void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2);

        void processFinalAAD();

        void processFinalBlock(byte[] bArr, int i);

        void reset();
    }

    public class RomulusM implements Instance {
        public int offset;
        public final byte[] mac_s = new byte[16];
        public final byte[] mac_CNT = new byte[7];
        public final byte[] s = new byte[16];
        public boolean twist = true;

        public RomulusM() {
        }

        public int ad_encryption(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, byte[] bArr4) {
            byte[] bArr5 = new byte[16];
            byte[] bArr6 = new byte[16];
            int min = Math.min(i2, 16);
            int i3 = i2 - min;
            RomulusEngine.this.pad(bArr, i, bArr6, 16, min);
            Bytes.xorTo(16, bArr6, bArr2);
            int i4 = i + min;
            this.offset = i4;
            RomulusEngine.this.lfsr_gf56(bArr4);
            if (i3 == 0) {
                return i3;
            }
            int min2 = Math.min(i3, 16);
            int i5 = i3 - min2;
            RomulusEngine.this.pad(bArr, i4, bArr5, 16, min2);
            this.offset = i4 + min2;
            RomulusEngine.this.block_cipher(bArr2, bArr3, bArr5, 0, bArr4, (byte) 44);
            RomulusEngine.this.lfsr_gf56(bArr4);
            return i5;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i) {
            if (this.twist) {
                Bytes.xorTo(RomulusEngine.this.MAC_SIZE, bArr, i, this.mac_s);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.block_cipher(this.mac_s, romulusEngine.k, bArr, i, this.mac_CNT, (byte) 40);
            }
            this.twist = !this.twist;
            RomulusEngine.this.lfsr_gf56(this.mac_CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            if (RomulusEngine.this.aadOperator.getLen() == 0) {
                RomulusEngine.this.lfsr_gf56(this.mac_CNT);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                int i = romulusEngine.m_aadPos;
                if (i != 0) {
                    Arrays.fill(romulusEngine.m_aad, i, romulusEngine.BlockSize - 1, (byte) 0);
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    byte[] bArr = romulusEngine2.m_aad;
                    int i2 = romulusEngine2.BlockSize;
                    bArr[i2 - 1] = (byte) (romulusEngine2.m_aadPos & 15);
                    if (this.twist) {
                        Bytes.xorTo(i2, bArr, this.mac_s);
                    } else {
                        romulusEngine2.block_cipher(this.mac_s, romulusEngine2.k, RomulusEngine.this.m_aad, 0, this.mac_CNT, (byte) 40);
                    }
                    RomulusEngine.this.lfsr_gf56(this.mac_CNT);
                }
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.m_aadPos = 0;
            romulusEngine3.m_bufPos = romulusEngine3.dataOperator.getLen();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0181  */
        /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x004d  */
        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void processFinalBlock(byte[] r26, int r27) {
            /*
                Method dump skipped, instructions count: 532
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.RomulusEngine.RomulusM.processFinalBlock(byte[], int):void");
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.s);
            Arrays.clear(this.mac_s);
            RomulusEngine.this.reset_lfsr_gf56(this.mac_CNT);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }
    }

    public class RomulusN implements Instance {
        public final byte[] s = new byte[16];
        public boolean twist;

        public RomulusN() {
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i) {
            if (this.twist) {
                Bytes.xorTo(16, bArr, i, this.s);
            } else {
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.block_cipher(this.s, romulusEngine.k, bArr, i, RomulusEngine.this.CNT, (byte) 8);
            }
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.lfsr_gf56(romulusEngine2.CNT);
            this.twist = !this.twist;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            RomulusEngine.this.g8A(this.s, bArr2, i2);
            for (int i3 = 0; i3 < 16; i3++) {
                int i4 = i3 + i2;
                byte b = (byte) (bArr2[i4] ^ bArr[i3 + i]);
                bArr2[i4] = b;
                byte[] bArr3 = this.s;
                bArr3[i3] = (byte) (b ^ bArr3[i3]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.s, romulusEngine2.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            RomulusEngine.this.g8A(this.s, bArr2, i2);
            for (int i3 = 0; i3 < 16; i3++) {
                byte[] bArr3 = this.s;
                int i4 = i3 + i;
                bArr3[i3] = (byte) (bArr3[i3] ^ bArr[i4]);
                int i5 = i3 + i2;
                bArr2[i5] = (byte) (bArr2[i5] ^ bArr[i4]);
            }
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.lfsr_gf56(romulusEngine.CNT);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.s, romulusEngine2.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 4);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            int i = RomulusEngine.this.m_aadPos;
            if (i != 0) {
                byte[] bArr = new byte[16];
                int min = Math.min(i, 16);
                RomulusEngine romulusEngine = RomulusEngine.this;
                romulusEngine.pad(romulusEngine.m_aad, 0, bArr, 16, min);
                if (this.twist) {
                    Bytes.xorTo(16, bArr, this.s);
                } else {
                    RomulusEngine romulusEngine2 = RomulusEngine.this;
                    romulusEngine2.block_cipher(this.s, romulusEngine2.k, bArr, 0, RomulusEngine.this.CNT, (byte) 8);
                }
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
            }
            if (RomulusEngine.this.aadOperator.getLen() == 0) {
                RomulusEngine romulusEngine4 = RomulusEngine.this;
                romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                romulusEngine5.block_cipher(this.s, romulusEngine5.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 26);
            } else {
                RomulusEngine romulusEngine6 = RomulusEngine.this;
                int i2 = romulusEngine6.m_aadPos & 15;
                byte[] bArr2 = this.s;
                byte[] bArr3 = romulusEngine6.k;
                if (i2 != 0) {
                    romulusEngine6.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 26);
                } else {
                    romulusEngine6.block_cipher(bArr2, bArr3, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 24);
                }
            }
            RomulusEngine romulusEngine7 = RomulusEngine.this;
            romulusEngine7.reset_lfsr_gf56(romulusEngine7.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i) {
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            if (len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE) == 0) {
                romulusEngine.lfsr_gf56(romulusEngine.CNT);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.s, romulusEngine2.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, (byte) 21);
            } else {
                int i2 = romulusEngine.m_bufPos;
                if (i2 != 0) {
                    int min = Math.min(i2, 16);
                    RomulusEngine romulusEngine3 = RomulusEngine.this;
                    romulusEngine3.rho(romulusEngine3.m_buf, 0, bArr, i, this.s, min);
                    RomulusEngine romulusEngine4 = RomulusEngine.this;
                    romulusEngine4.lfsr_gf56(romulusEngine4.CNT);
                    RomulusEngine romulusEngine5 = RomulusEngine.this;
                    romulusEngine5.block_cipher(this.s, romulusEngine5.k, RomulusEngine.this.npub, 0, RomulusEngine.this.CNT, RomulusEngine.this.m_bufPos == 16 ? (byte) 20 : (byte) 21);
                }
            }
            RomulusEngine romulusEngine6 = RomulusEngine.this;
            romulusEngine6.g8A(this.s, romulusEngine6.mac, 0);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.s);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            this.twist = true;
        }
    }

    public class RomulusParameters {
        public static final int ROMULUS_M = 0;
        public static final int ROMULUS_N = 1;
        public static final int ROMULUS_T = 2;
        public static final RomulusParameters RomulusM = new RomulusParameters(0);
        public static final RomulusParameters RomulusN = new RomulusParameters(1);
        public static final RomulusParameters RomulusT = new RomulusParameters(2);
        public final int ord;

        public RomulusParameters(int i) {
            this.ord = i;
        }
    }

    public class RomulusT implements Instance {
        public byte[] CNT_Z;
        public byte[] LR;
        public byte[] S;
        public byte[] T;
        public byte[] Z;
        public final byte[] g;
        public final byte[] h;

        public RomulusT() {
            this.h = new byte[16];
            this.g = new byte[16];
            this.Z = new byte[16];
            this.CNT_Z = new byte[7];
            this.LR = new byte[32];
            this.T = new byte[16];
            this.S = new byte[16];
        }

        private void processAfterAbsorbCiphertext() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i = romulusEngine.m_aadPos;
            int i2 = romulusEngine.BlockSize;
            if (i == i2) {
                RomulusEngine.hirose_128_128_256(this.h, this.g, romulusEngine.m_aad, 0);
                RomulusEngine.this.m_aadPos = 0;
            } else {
                romulusEngine.m_aadPos = i2;
            }
            RomulusEngine.this.lfsr_gf56(this.CNT_Z);
        }

        private void processBuffer(byte[] bArr, int i, byte[] bArr2, int i2) {
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.block_cipher(this.S, this.Z, this.T, 0, romulusEngine.CNT, (byte) 64);
            Bytes.xor(16, this.S, bArr, i, bArr2, i2);
            System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, (byte) 65);
            System.arraycopy(this.S, 0, this.Z, 0, 16);
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferAAD(byte[] bArr, int i) {
            RomulusEngine.hirose_128_128_256(this.h, this.g, bArr, i);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            processBuffer(bArr, i, bArr2, i2);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr, i, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
            processBuffer(bArr, i, bArr2, i2);
            RomulusEngine romulusEngine = RomulusEngine.this;
            System.arraycopy(bArr2, i2, romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.BlockSize);
            processAfterAbsorbCiphertext();
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalAAD() {
            RomulusEngine romulusEngine = RomulusEngine.this;
            Arrays.fill(romulusEngine.m_aad, romulusEngine.m_aadPos, romulusEngine.AADBufferSize - 1, (byte) 0);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            int i = romulusEngine2.m_aadPos;
            if (i >= 16) {
                byte[] bArr = romulusEngine2.m_aad;
                bArr[romulusEngine2.AADBufferSize - 1] = (byte) (i & 15);
                RomulusEngine.hirose_128_128_256(this.h, this.g, bArr, 0);
                RomulusEngine.this.m_aadPos = 0;
                return;
            }
            if (i < 0 || romulusEngine2.aadOperator.getLen() == 0) {
                return;
            }
            RomulusEngine romulusEngine3 = RomulusEngine.this;
            byte[] bArr2 = romulusEngine3.m_aad;
            int i2 = romulusEngine3.BlockSize;
            bArr2[i2 - 1] = (byte) (romulusEngine3.m_aadPos & 15);
            romulusEngine3.m_aadPos = i2;
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void processFinalBlock(byte[] bArr, int i) {
            char c;
            int len = RomulusEngine.this.dataOperator.getLen();
            RomulusEngine romulusEngine = RomulusEngine.this;
            int i2 = len - (romulusEngine.forEncryption ? 0 : romulusEngine.MAC_SIZE);
            int i3 = romulusEngine.m_bufPos;
            if (i3 != 0) {
                int min = Math.min(i3, 16);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine2 = RomulusEngine.this;
                romulusEngine2.block_cipher(this.S, this.Z, this.T, 0, romulusEngine2.CNT, (byte) 64);
                Bytes.xor(min, RomulusEngine.this.m_buf, this.S, bArr, i);
                System.arraycopy(RomulusEngine.this.npub, 0, this.S, 0, 16);
                RomulusEngine romulusEngine3 = RomulusEngine.this;
                romulusEngine3.lfsr_gf56(romulusEngine3.CNT);
                RomulusEngine romulusEngine4 = RomulusEngine.this;
                if (!romulusEngine4.forEncryption) {
                    bArr = romulusEngine4.m_buf;
                    i = 0;
                }
                System.arraycopy(bArr, i, romulusEngine4.m_aad, romulusEngine4.m_aadPos, romulusEngine4.m_bufPos);
                RomulusEngine romulusEngine5 = RomulusEngine.this;
                Arrays.fill(romulusEngine5.m_aad, romulusEngine5.m_aadPos + romulusEngine5.m_bufPos, romulusEngine5.AADBufferSize - 1, (byte) 0);
                RomulusEngine romulusEngine6 = RomulusEngine.this;
                byte[] bArr2 = romulusEngine6.m_aad;
                int i4 = romulusEngine6.m_aadPos;
                bArr2[(romulusEngine6.BlockSize + i4) - 1] = (byte) (romulusEngine6.m_bufPos & 15);
                if (i4 == 0) {
                    byte[] bArr3 = romulusEngine6.npub;
                    RomulusEngine romulusEngine7 = RomulusEngine.this;
                    byte[] bArr4 = romulusEngine7.m_aad;
                    int i5 = romulusEngine7.BlockSize;
                    System.arraycopy(bArr3, 0, bArr4, i5, i5);
                    c = 0;
                } else {
                    c = 16;
                }
                RomulusEngine.hirose_128_128_256(this.h, this.g, RomulusEngine.this.m_aad, 0);
                RomulusEngine.this.lfsr_gf56(this.CNT_Z);
            } else if (romulusEngine.m_aadPos != 0) {
                if (i2 > 0) {
                    Arrays.fill(romulusEngine.m_aad, romulusEngine.BlockSize, romulusEngine.AADBufferSize, (byte) 0);
                } else if (romulusEngine.aadOperator.getLen() != 0) {
                    byte[] bArr5 = RomulusEngine.this.npub;
                    RomulusEngine romulusEngine8 = RomulusEngine.this;
                    System.arraycopy(bArr5, 0, romulusEngine8.m_aad, romulusEngine8.m_aadPos, 16);
                    RomulusEngine.this.m_aadPos = 0;
                    c = 0;
                    RomulusEngine.hirose_128_128_256(this.h, this.g, RomulusEngine.this.m_aad, 0);
                }
                c = 16;
                RomulusEngine.hirose_128_128_256(this.h, this.g, RomulusEngine.this.m_aad, 0);
            } else if (i2 > 0) {
                Arrays.fill(romulusEngine.m_aad, 0, romulusEngine.BlockSize, (byte) 0);
                byte[] bArr6 = RomulusEngine.this.npub;
                RomulusEngine romulusEngine9 = RomulusEngine.this;
                byte[] bArr7 = romulusEngine9.m_aad;
                int i6 = romulusEngine9.BlockSize;
                System.arraycopy(bArr6, 0, bArr7, i6, i6);
                RomulusEngine.hirose_128_128_256(this.h, this.g, RomulusEngine.this.m_aad, 0);
                c = 0;
            } else {
                c = 16;
            }
            if (c == 16) {
                System.arraycopy(RomulusEngine.this.npub, 0, RomulusEngine.this.m_aad, 0, 16);
                System.arraycopy(RomulusEngine.this.CNT, 0, RomulusEngine.this.m_aad, 16, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 23, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = 23;
            } else {
                System.arraycopy(this.CNT_Z, 0, RomulusEngine.this.m_aad, 0, 7);
                Arrays.fill(RomulusEngine.this.m_aad, 7, 31, (byte) 0);
                RomulusEngine.this.m_aad[31] = 7;
            }
            byte[] bArr8 = this.h;
            bArr8[0] = (byte) (bArr8[0] ^ 2);
            RomulusEngine.hirose_128_128_256(bArr8, this.g, RomulusEngine.this.m_aad, 0);
            System.arraycopy(this.h, 0, this.LR, 0, 16);
            System.arraycopy(this.g, 0, this.LR, 16, 16);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine10 = RomulusEngine.this;
            romulusEngine10.block_cipher(this.LR, romulusEngine10.k, this.LR, 16, this.CNT_Z, (byte) 68);
            byte[] bArr9 = this.LR;
            RomulusEngine romulusEngine11 = RomulusEngine.this;
            System.arraycopy(bArr9, 0, romulusEngine11.mac, 0, romulusEngine11.MAC_SIZE);
        }

        @Override // org.bouncycastle.crypto.engines.RomulusEngine.Instance
        public void reset() {
            Arrays.clear(this.h);
            Arrays.clear(this.g);
            Arrays.clear(this.LR);
            Arrays.clear(this.T);
            Arrays.clear(this.S);
            Arrays.clear(this.CNT_Z);
            RomulusEngine romulusEngine = RomulusEngine.this;
            romulusEngine.reset_lfsr_gf56(romulusEngine.CNT);
            System.arraycopy(RomulusEngine.this.npub, 0, this.Z, 0, RomulusEngine.this.IV_SIZE);
            RomulusEngine romulusEngine2 = RomulusEngine.this;
            romulusEngine2.block_cipher(this.Z, romulusEngine2.k, this.T, 0, this.CNT_Z, (byte) 66);
            RomulusEngine.this.reset_lfsr_gf56(this.CNT_Z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RomulusEngine(org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters r4) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 16
            r3.AADBufferSize = r0
            r3.BlockSize = r0
            r3.MAC_SIZE = r0
            r3.IV_SIZE = r0
            r3.KEY_SIZE = r0
            r0 = 7
            byte[] r0 = new byte[r0]
            r3.CNT = r0
            int r0 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.access$000(r4)
            if (r0 == 0) goto L3a
            r1 = 1
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L21
            goto L45
        L21:
            java.lang.String r0 = "Romulus-T"
            r3.algorithmName = r0
            r0 = 32
            r3.AADBufferSize = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusT r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusT
            r1 = 0
            r0.<init>()
            goto L43
        L30:
            java.lang.String r0 = "Romulus-N"
            r3.algorithmName = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusN r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusN
            r0.<init>()
            goto L43
        L3a:
            java.lang.String r0 = "Romulus-M"
            r3.algorithmName = r0
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusM r0 = new org.bouncycastle.crypto.engines.RomulusEngine$RomulusM
            r0.<init>()
        L43:
            r3.instance = r0
        L45:
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters r0 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.RomulusN
            if (r4 != r0) goto L4c
            org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType r0 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.Buffered
            goto L4e
        L4c:
            org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType r0 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.Immediate
        L4e:
            org.bouncycastle.crypto.engines.AEADBaseEngine$AADOperatorType r1 = org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType.Counter
            org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters r2 = org.bouncycastle.crypto.engines.RomulusEngine.RomulusParameters.RomulusM
            if (r4 != r2) goto L57
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.Stream
            goto L59
        L57:
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType r4 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.Counter
        L59:
            r3.setInnerMembers(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.RomulusEngine.<init>(org.bouncycastle.crypto.engines.RomulusEngine$RomulusParameters):void");
    }

    public static void hirose_128_128_256(RomulusDigest.Friend friend, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by RomulusDigest");
        }
        hirose_128_128_256(bArr, bArr2, bArr3, i);
    }

    public static void hirose_128_128_256(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        byte[] bArr4 = new byte[48];
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr2, 0, bArr4, 0, 16);
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        System.arraycopy(bArr, 0, bArr5, 0, 16);
        bArr2[0] = (byte) (bArr2[0] ^ 1);
        System.arraycopy(bArr3, i, bArr4, 16, 32);
        skinny_128_384_plus_enc(bArr, bArr4);
        skinny_128_384_plus_enc(bArr2, bArr4);
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ bArr5[i2]);
            bArr2[i2] = (byte) (bArr2[i2] ^ bArr5[i2]);
        }
        bArr2[0] = (byte) (bArr2[0] ^ 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reset_lfsr_gf56(byte[] bArr) {
        bArr[0] = 1;
        Arrays.fill(bArr, 1, 7, (byte) 0);
    }

    public static void skinny_128_384_plus_enc(byte[] bArr, byte[] bArr2) {
        Class cls = Byte.TYPE;
        byte[][] bArr3 = (byte[][]) Array.newInstance((Class<?>) cls, 4, 4);
        byte[][][] bArr4 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        byte[][][] bArr5 = (byte[][][]) Array.newInstance((Class<?>) cls, 3, 4, 4);
        for (int i = 0; i < 4; i++) {
            int i2 = i << 2;
            System.arraycopy(bArr, i2, bArr3[i], 0, 4);
            System.arraycopy(bArr2, i2, bArr4[0][i], 0, 4);
            System.arraycopy(bArr2, i2 + 16, bArr4[1][i], 0, 4);
            System.arraycopy(bArr2, i2 + 32, bArr4[2][i], 0, 4);
        }
        for (int i3 = 0; i3 < 40; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                for (int i5 = 0; i5 < 4; i5++) {
                    byte[] bArr6 = bArr3[i4];
                    bArr6[i5] = sbox_8[bArr6[i5] & 255];
                }
            }
            byte[] bArr7 = bArr3[0];
            byte b = bArr7[0];
            byte[] bArr8 = RC;
            bArr7[0] = (byte) (b ^ (bArr8[i3] & 15));
            byte[] bArr9 = bArr3[1];
            bArr9[0] = (byte) (bArr9[0] ^ ((bArr8[i3] >>> 4) & 3));
            byte[] bArr10 = bArr3[2];
            bArr10[0] = (byte) (bArr10[0] ^ 2);
            for (int i6 = 0; i6 <= 1; i6++) {
                for (int i7 = 0; i7 < 4; i7++) {
                    byte[] bArr11 = bArr3[i6];
                    bArr11[i7] = (byte) (bArr11[i7] ^ ((bArr4[0][i6][i7] ^ bArr4[1][i6][i7]) ^ bArr4[2][i6][i7]));
                }
            }
            for (int i8 = 0; i8 < 4; i8++) {
                for (int i9 = 0; i9 < 4; i9++) {
                    byte b2 = TWEAKEY_P[(i8 << 2) + i9];
                    int i10 = b2 >>> 2;
                    int i11 = b2 & 3;
                    bArr5[0][i8][i9] = bArr4[0][i10][i11];
                    bArr5[1][i8][i9] = bArr4[1][i10][i11];
                    bArr5[2][i8][i9] = bArr4[2][i10][i11];
                }
            }
            int i12 = 0;
            while (i12 <= 1) {
                for (int i13 = 0; i13 < 4; i13++) {
                    bArr4[0][i12][i13] = bArr5[0][i12][i13];
                    byte b3 = bArr5[1][i12][i13];
                    bArr4[1][i12][i13] = (byte) (((b3 >>> 5) & 1) ^ (((b3 << 1) & Scalar25519.TARGET_LENGTH) ^ ((b3 >>> 7) & 1)));
                    byte b4 = bArr5[2][i12][i13];
                    bArr4[2][i12][i13] = (byte) (((b4 << 1) & 128) ^ (((b4 >>> 1) & 127) ^ ((b4 << 7) & 128)));
                }
                i12++;
            }
            while (i12 < 4) {
                for (int i14 = 0; i14 < 4; i14++) {
                    bArr4[0][i12][i14] = bArr5[0][i12][i14];
                    bArr4[1][i12][i14] = bArr5[1][i12][i14];
                    bArr4[2][i12][i14] = bArr5[2][i12][i14];
                }
                i12++;
            }
            byte[] bArr12 = bArr3[1];
            byte b5 = bArr12[3];
            bArr12[3] = bArr12[2];
            bArr12[2] = bArr12[1];
            bArr12[1] = bArr12[0];
            bArr12[0] = b5;
            byte[] bArr13 = bArr3[2];
            byte b6 = bArr13[0];
            bArr13[0] = bArr13[2];
            bArr13[2] = b6;
            byte b7 = bArr13[1];
            bArr13[1] = bArr13[3];
            bArr13[3] = b7;
            byte[] bArr14 = bArr3[3];
            byte b8 = bArr14[0];
            bArr14[0] = bArr14[1];
            bArr14[1] = bArr14[2];
            bArr14[2] = bArr14[3];
            bArr14[3] = b8;
            for (int i15 = 0; i15 < 4; i15++) {
                byte[] bArr15 = bArr3[1];
                byte b9 = bArr15[i15];
                byte[] bArr16 = bArr3[2];
                bArr15[i15] = (byte) (b9 ^ bArr16[i15]);
                byte b10 = bArr16[i15];
                byte[] bArr17 = bArr3[0];
                byte b11 = (byte) (b10 ^ bArr17[i15]);
                bArr16[i15] = b11;
                byte[] bArr18 = bArr3[3];
                byte b12 = (byte) (bArr18[i15] ^ b11);
                bArr18[i15] = b12;
                bArr18[i15] = bArr16[i15];
                bArr16[i15] = bArr15[i15];
                bArr15[i15] = bArr17[i15];
                bArr17[i15] = b12;
            }
        }
        for (int i16 = 0; i16 < 16; i16++) {
            bArr[i16] = (byte) (bArr3[i16 >>> 2][i16 & 3] & 255);
        }
    }

    public void block_cipher(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte b) {
        byte[] bArr5 = new byte[48];
        System.arraycopy(bArr4, 0, bArr5, 0, 7);
        bArr5[7] = b;
        System.arraycopy(bArr3, i, bArr5, 16, 16);
        System.arraycopy(bArr2, 0, bArr5, 32, 16);
        skinny_128_384_plus_enc(bArr, bArr5);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD1(state);
    }

    public void g8A(byte[] bArr, byte[] bArr2, int i) {
        int min = Math.min(bArr2.length - i, 16);
        for (int i2 = 0; i2 < min; i2++) {
            byte b = bArr[i2];
            bArr2[i2 + i] = (byte) (((b & 1) << 7) ^ (((b & 255) >>> 1) ^ (b & GCMSIVBlockCipher.MASK)));
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i) {
        return super.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i) {
        return super.getUpdateOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        this.k = bArr;
    }

    public void lfsr_gf56(byte[] bArr) {
        byte b = bArr[6];
        byte b2 = (byte) ((b & 255) >>> 7);
        byte b3 = bArr[5];
        bArr[6] = (byte) (((b & 255) << 1) | ((b3 & 255) >>> 7));
        int i = (b3 & 255) << 1;
        byte b4 = bArr[4];
        bArr[5] = (byte) (i | ((b4 & 255) >>> 7));
        int i2 = (b4 & 255) << 1;
        byte b5 = bArr[3];
        bArr[4] = (byte) (i2 | ((b5 & 255) >>> 7));
        int i3 = (b5 & 255) << 1;
        byte b6 = bArr[2];
        bArr[3] = (byte) (i3 | ((b6 & 255) >>> 7));
        byte b7 = bArr[1];
        bArr[2] = (byte) (((b6 & 255) << 1) | ((b7 & 255) >>> 7));
        int i4 = (b7 & 255) << 1;
        byte b8 = bArr[0];
        bArr[1] = (byte) (i4 | ((b8 & 255) >>> 7));
        int i5 = (b8 & 255) << 1;
        if (b2 == 1) {
            bArr[0] = (byte) (i5 ^ 149);
        } else {
            bArr[0] = (byte) i5;
        }
    }

    public void pad(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr2[i2 - 1] = (byte) (i3 & 15);
        System.arraycopy(bArr, i, bArr2, 0, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b) {
        super.processAADByte(b);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        this.instance.processBufferAAD(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.instance.processBufferDecrypt(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        this.instance.processBufferEncrypt(bArr, i, bArr2, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b, byte[] bArr, int i) {
        return super.processByte(b, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        this.instance.processFinalAAD();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        this.instance.processFinalBlock(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        this.instance.reset();
    }

    public void rho(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int i4;
        byte[] bArr4 = new byte[16];
        pad(bArr, i, bArr4, 16, i3);
        g8A(bArr3, bArr2, i2);
        if (this.forEncryption) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArr3[i5] = (byte) (bArr3[i5] ^ bArr4[i5]);
                int i6 = i5 + i2;
                if (i5 < i3) {
                    bArr2[i6] = (byte) (bArr2[i6] ^ bArr4[i5]);
                } else {
                    bArr2[i6] = 0;
                }
            }
            return;
        }
        for (int i7 = 0; i7 < 16; i7++) {
            byte b = (byte) (bArr3[i7] ^ bArr4[i7]);
            bArr3[i7] = b;
            if (i7 < i3 && (i4 = i7 + i2) < bArr2.length) {
                bArr3[i7] = (byte) (b ^ bArr2[i4]);
                bArr2[i4] = (byte) (bArr2[i4] ^ bArr4[i7]);
            }
        }
    }
}
