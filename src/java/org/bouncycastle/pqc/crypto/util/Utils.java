package org.bouncycastle.pqc.crypto.util;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import l.C9005;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.mayo.MayoParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.rainbow.RainbowParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAParameters;
import org.bouncycastle.pqc.crypto.snova.SnovaParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* loaded from: classes2.dex */
public class Utils {
    public static final AlgorithmIdentifier SPHINCS_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256);
    public static final AlgorithmIdentifier SPHINCS_SHA512_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256);
    public static final AlgorithmIdentifier XMSS_SHA256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
    public static final AlgorithmIdentifier XMSS_SHA512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
    public static final AlgorithmIdentifier XMSS_SHAKE128 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake128);
    public static final AlgorithmIdentifier XMSS_SHAKE256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);
    public static final Map bikeOids;
    public static final Map bikeParams;
    public static final Map dilithiumOids;
    public static final Map dilithiumParams;
    public static final Map falconOids;
    public static final Map falconParams;
    public static final Map frodoOids;
    public static final Map frodoParams;
    public static final Map hqcOids;
    public static final Map hqcParams;
    public static final Map mayoOids;
    public static final Map mayoParams;
    public static final Map mcElieceOids;
    public static final Map mcElieceParams;
    public static final Map mldsaOids;
    public static final Map mldsaParams;
    public static final Map mlkemOids;
    public static final Map mlkemParams;
    public static final Map ntruOids;
    public static final Map ntruParams;
    public static final Map ntruprimeOids;
    public static final Map ntruprimeParams;
    public static final Map picnicOids;
    public static final Map picnicParams;
    public static final Map rainbowOids;
    public static final Map rainbowParams;
    public static final Map saberOids;
    public static final Map saberParams;
    public static final Map sikeOids;
    public static final Map sikeParams;
    public static final Map slhdsaOids;
    public static final Map slhdsaParams;
    public static final Map snovaOids;
    public static final Map snovaParams;
    public static final Map sntruprimeOids;
    public static final Map sntruprimeParams;
    public static final Map sphincsPlusOids;
    public static final Map sphincsPlusParams;

    static {
        HashMap hashMap = new HashMap();
        picnicOids = hashMap;
        HashMap hashMap2 = new HashMap();
        picnicParams = hashMap2;
        HashMap hashMap3 = new HashMap();
        frodoOids = hashMap3;
        HashMap hashMap4 = new HashMap();
        frodoParams = hashMap4;
        HashMap hashMap5 = new HashMap();
        saberOids = hashMap5;
        HashMap hashMap6 = new HashMap();
        saberParams = hashMap6;
        HashMap hashMap7 = new HashMap();
        mcElieceOids = hashMap7;
        HashMap hashMap8 = new HashMap();
        mcElieceParams = hashMap8;
        HashMap hashMap9 = new HashMap();
        sphincsPlusOids = hashMap9;
        HashMap hashMap10 = new HashMap();
        sphincsPlusParams = hashMap10;
        sikeOids = new HashMap();
        sikeParams = new HashMap();
        HashMap hashMap11 = new HashMap();
        ntruOids = hashMap11;
        HashMap hashMap12 = new HashMap();
        ntruParams = hashMap12;
        HashMap hashMap13 = new HashMap();
        falconOids = hashMap13;
        HashMap hashMap14 = new HashMap();
        falconParams = hashMap14;
        HashMap hashMap15 = new HashMap();
        ntruprimeOids = hashMap15;
        HashMap hashMap16 = new HashMap();
        ntruprimeParams = hashMap16;
        HashMap hashMap17 = new HashMap();
        sntruprimeOids = hashMap17;
        HashMap hashMap18 = new HashMap();
        sntruprimeParams = hashMap18;
        HashMap hashMap19 = new HashMap();
        dilithiumOids = hashMap19;
        HashMap hashMap20 = new HashMap();
        dilithiumParams = hashMap20;
        HashMap hashMap21 = new HashMap();
        bikeOids = hashMap21;
        HashMap hashMap22 = new HashMap();
        bikeParams = hashMap22;
        HashMap hashMap23 = new HashMap();
        hqcOids = hashMap23;
        HashMap hashMap24 = new HashMap();
        hqcParams = hashMap24;
        HashMap hashMap25 = new HashMap();
        rainbowOids = hashMap25;
        HashMap hashMap26 = new HashMap();
        rainbowParams = hashMap26;
        HashMap hashMap27 = new HashMap();
        mlkemOids = hashMap27;
        HashMap hashMap28 = new HashMap();
        mlkemParams = hashMap28;
        HashMap hashMap29 = new HashMap();
        mldsaOids = hashMap29;
        HashMap hashMap30 = new HashMap();
        mldsaParams = hashMap30;
        HashMap hashMap31 = new HashMap();
        slhdsaOids = hashMap31;
        HashMap hashMap32 = new HashMap();
        slhdsaParams = hashMap32;
        HashMap hashMap33 = new HashMap();
        mayoOids = hashMap33;
        HashMap hashMap34 = new HashMap();
        mayoParams = hashMap34;
        HashMap hashMap35 = new HashMap();
        snovaOids = hashMap35;
        HashMap hashMap36 = new HashMap();
        snovaParams = hashMap36;
        CMCEParameters cMCEParameters = CMCEParameters.mceliece348864r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.mceliece348864_r3;
        hashMap7.put(cMCEParameters, aSN1ObjectIdentifier);
        CMCEParameters cMCEParameters2 = CMCEParameters.mceliece348864fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.mceliece348864f_r3;
        hashMap7.put(cMCEParameters2, aSN1ObjectIdentifier2);
        CMCEParameters cMCEParameters3 = CMCEParameters.mceliece460896r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.mceliece460896_r3;
        hashMap7.put(cMCEParameters3, aSN1ObjectIdentifier3);
        CMCEParameters cMCEParameters4 = CMCEParameters.mceliece460896fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.mceliece460896f_r3;
        hashMap7.put(cMCEParameters4, aSN1ObjectIdentifier4);
        CMCEParameters cMCEParameters5 = CMCEParameters.mceliece6688128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.mceliece6688128_r3;
        hashMap7.put(cMCEParameters5, aSN1ObjectIdentifier5);
        CMCEParameters cMCEParameters6 = CMCEParameters.mceliece6688128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.mceliece6688128f_r3;
        hashMap7.put(cMCEParameters6, aSN1ObjectIdentifier6);
        CMCEParameters cMCEParameters7 = CMCEParameters.mceliece6960119r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.mceliece6960119_r3;
        hashMap7.put(cMCEParameters7, aSN1ObjectIdentifier7);
        CMCEParameters cMCEParameters8 = CMCEParameters.mceliece6960119fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = BCObjectIdentifiers.mceliece6960119f_r3;
        hashMap7.put(cMCEParameters8, aSN1ObjectIdentifier8);
        CMCEParameters cMCEParameters9 = CMCEParameters.mceliece8192128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = BCObjectIdentifiers.mceliece8192128_r3;
        hashMap7.put(cMCEParameters9, aSN1ObjectIdentifier9);
        CMCEParameters cMCEParameters10 = CMCEParameters.mceliece8192128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = BCObjectIdentifiers.mceliece8192128f_r3;
        hashMap7.put(cMCEParameters10, aSN1ObjectIdentifier10);
        hashMap8.put(aSN1ObjectIdentifier, cMCEParameters);
        hashMap8.put(aSN1ObjectIdentifier2, cMCEParameters2);
        hashMap8.put(aSN1ObjectIdentifier3, cMCEParameters3);
        hashMap8.put(aSN1ObjectIdentifier4, cMCEParameters4);
        hashMap8.put(aSN1ObjectIdentifier5, cMCEParameters5);
        hashMap8.put(aSN1ObjectIdentifier6, cMCEParameters6);
        hashMap8.put(aSN1ObjectIdentifier7, cMCEParameters7);
        hashMap8.put(aSN1ObjectIdentifier8, cMCEParameters8);
        hashMap8.put(aSN1ObjectIdentifier9, cMCEParameters9);
        hashMap8.put(aSN1ObjectIdentifier10, cMCEParameters10);
        FrodoParameters frodoParameters = FrodoParameters.frodokem640aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = BCObjectIdentifiers.frodokem640aes;
        hashMap3.put(frodoParameters, aSN1ObjectIdentifier11);
        FrodoParameters frodoParameters2 = FrodoParameters.frodokem640shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = BCObjectIdentifiers.frodokem640shake;
        hashMap3.put(frodoParameters2, aSN1ObjectIdentifier12);
        FrodoParameters frodoParameters3 = FrodoParameters.frodokem976aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = BCObjectIdentifiers.frodokem976aes;
        hashMap3.put(frodoParameters3, aSN1ObjectIdentifier13);
        FrodoParameters frodoParameters4 = FrodoParameters.frodokem976shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = BCObjectIdentifiers.frodokem976shake;
        hashMap3.put(frodoParameters4, aSN1ObjectIdentifier14);
        FrodoParameters frodoParameters5 = FrodoParameters.frodokem1344aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = BCObjectIdentifiers.frodokem1344aes;
        hashMap3.put(frodoParameters5, aSN1ObjectIdentifier15);
        FrodoParameters frodoParameters6 = FrodoParameters.frodokem1344shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = BCObjectIdentifiers.frodokem1344shake;
        hashMap3.put(frodoParameters6, aSN1ObjectIdentifier16);
        hashMap4.put(aSN1ObjectIdentifier11, frodoParameters);
        hashMap4.put(aSN1ObjectIdentifier12, frodoParameters2);
        hashMap4.put(aSN1ObjectIdentifier13, frodoParameters3);
        hashMap4.put(aSN1ObjectIdentifier14, frodoParameters4);
        hashMap4.put(aSN1ObjectIdentifier15, frodoParameters5);
        hashMap4.put(aSN1ObjectIdentifier16, frodoParameters6);
        SABERParameters sABERParameters = SABERParameters.lightsaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = BCObjectIdentifiers.lightsaberkem128r3;
        hashMap5.put(sABERParameters, aSN1ObjectIdentifier17);
        SABERParameters sABERParameters2 = SABERParameters.saberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = BCObjectIdentifiers.saberkem128r3;
        hashMap5.put(sABERParameters2, aSN1ObjectIdentifier18);
        SABERParameters sABERParameters3 = SABERParameters.firesaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = BCObjectIdentifiers.firesaberkem128r3;
        hashMap5.put(sABERParameters3, aSN1ObjectIdentifier19);
        SABERParameters sABERParameters4 = SABERParameters.lightsaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = BCObjectIdentifiers.lightsaberkem192r3;
        hashMap5.put(sABERParameters4, aSN1ObjectIdentifier20);
        SABERParameters sABERParameters5 = SABERParameters.saberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = BCObjectIdentifiers.saberkem192r3;
        hashMap5.put(sABERParameters5, aSN1ObjectIdentifier21);
        SABERParameters sABERParameters6 = SABERParameters.firesaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = BCObjectIdentifiers.firesaberkem192r3;
        hashMap5.put(sABERParameters6, aSN1ObjectIdentifier22);
        SABERParameters sABERParameters7 = SABERParameters.lightsaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = BCObjectIdentifiers.lightsaberkem256r3;
        hashMap5.put(sABERParameters7, aSN1ObjectIdentifier23);
        SABERParameters sABERParameters8 = SABERParameters.saberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = BCObjectIdentifiers.saberkem256r3;
        hashMap5.put(sABERParameters8, aSN1ObjectIdentifier24);
        SABERParameters sABERParameters9 = SABERParameters.firesaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.firesaberkem256r3;
        hashMap5.put(sABERParameters9, aSN1ObjectIdentifier25);
        SABERParameters sABERParameters10 = SABERParameters.ulightsaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.ulightsaberkemr3;
        hashMap5.put(sABERParameters10, aSN1ObjectIdentifier26);
        SABERParameters sABERParameters11 = SABERParameters.usaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.usaberkemr3;
        hashMap5.put(sABERParameters11, aSN1ObjectIdentifier27);
        SABERParameters sABERParameters12 = SABERParameters.ufiresaberkemr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.ufiresaberkemr3;
        hashMap5.put(sABERParameters12, aSN1ObjectIdentifier28);
        SABERParameters sABERParameters13 = SABERParameters.lightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.lightsaberkem90sr3;
        hashMap5.put(sABERParameters13, aSN1ObjectIdentifier29);
        SABERParameters sABERParameters14 = SABERParameters.saberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.saberkem90sr3;
        hashMap5.put(sABERParameters14, aSN1ObjectIdentifier30);
        SABERParameters sABERParameters15 = SABERParameters.firesaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = BCObjectIdentifiers.firesaberkem90sr3;
        hashMap5.put(sABERParameters15, aSN1ObjectIdentifier31);
        SABERParameters sABERParameters16 = SABERParameters.ulightsaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = BCObjectIdentifiers.ulightsaberkem90sr3;
        hashMap5.put(sABERParameters16, aSN1ObjectIdentifier32);
        SABERParameters sABERParameters17 = SABERParameters.usaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier33 = BCObjectIdentifiers.usaberkem90sr3;
        hashMap5.put(sABERParameters17, aSN1ObjectIdentifier33);
        SABERParameters sABERParameters18 = SABERParameters.ufiresaberkem90sr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier34 = BCObjectIdentifiers.ufiresaberkem90sr3;
        hashMap5.put(sABERParameters18, aSN1ObjectIdentifier34);
        hashMap6.put(aSN1ObjectIdentifier17, sABERParameters);
        hashMap6.put(aSN1ObjectIdentifier18, sABERParameters2);
        hashMap6.put(aSN1ObjectIdentifier19, sABERParameters3);
        hashMap6.put(aSN1ObjectIdentifier20, sABERParameters4);
        hashMap6.put(aSN1ObjectIdentifier21, sABERParameters5);
        hashMap6.put(aSN1ObjectIdentifier22, sABERParameters6);
        hashMap6.put(aSN1ObjectIdentifier23, sABERParameters7);
        hashMap6.put(aSN1ObjectIdentifier24, sABERParameters8);
        hashMap6.put(aSN1ObjectIdentifier25, sABERParameters9);
        hashMap6.put(aSN1ObjectIdentifier26, sABERParameters10);
        hashMap6.put(aSN1ObjectIdentifier27, sABERParameters11);
        hashMap6.put(aSN1ObjectIdentifier28, sABERParameters12);
        hashMap6.put(aSN1ObjectIdentifier29, sABERParameters13);
        hashMap6.put(aSN1ObjectIdentifier30, sABERParameters14);
        hashMap6.put(aSN1ObjectIdentifier31, sABERParameters15);
        hashMap6.put(aSN1ObjectIdentifier32, sABERParameters16);
        hashMap6.put(aSN1ObjectIdentifier33, sABERParameters17);
        hashMap6.put(aSN1ObjectIdentifier34, sABERParameters18);
        PicnicParameters picnicParameters = PicnicParameters.picnicl1fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier35 = BCObjectIdentifiers.picnicl1fs;
        hashMap.put(picnicParameters, aSN1ObjectIdentifier35);
        PicnicParameters picnicParameters2 = PicnicParameters.picnicl1ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier36 = BCObjectIdentifiers.picnicl1ur;
        hashMap.put(picnicParameters2, aSN1ObjectIdentifier36);
        PicnicParameters picnicParameters3 = PicnicParameters.picnicl3fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier37 = BCObjectIdentifiers.picnicl3fs;
        hashMap.put(picnicParameters3, aSN1ObjectIdentifier37);
        PicnicParameters picnicParameters4 = PicnicParameters.picnicl3ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier38 = BCObjectIdentifiers.picnicl3ur;
        hashMap.put(picnicParameters4, aSN1ObjectIdentifier38);
        PicnicParameters picnicParameters5 = PicnicParameters.picnicl5fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier39 = BCObjectIdentifiers.picnicl5fs;
        hashMap.put(picnicParameters5, aSN1ObjectIdentifier39);
        PicnicParameters picnicParameters6 = PicnicParameters.picnicl5ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier40 = BCObjectIdentifiers.picnicl5ur;
        hashMap.put(picnicParameters6, aSN1ObjectIdentifier40);
        PicnicParameters picnicParameters7 = PicnicParameters.picnic3l1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier41 = BCObjectIdentifiers.picnic3l1;
        hashMap.put(picnicParameters7, aSN1ObjectIdentifier41);
        PicnicParameters picnicParameters8 = PicnicParameters.picnic3l3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier42 = BCObjectIdentifiers.picnic3l3;
        hashMap.put(picnicParameters8, aSN1ObjectIdentifier42);
        PicnicParameters picnicParameters9 = PicnicParameters.picnic3l5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier43 = BCObjectIdentifiers.picnic3l5;
        hashMap.put(picnicParameters9, aSN1ObjectIdentifier43);
        PicnicParameters picnicParameters10 = PicnicParameters.picnicl1full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier44 = BCObjectIdentifiers.picnicl1full;
        hashMap.put(picnicParameters10, aSN1ObjectIdentifier44);
        PicnicParameters picnicParameters11 = PicnicParameters.picnicl3full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier45 = BCObjectIdentifiers.picnicl3full;
        hashMap.put(picnicParameters11, aSN1ObjectIdentifier45);
        PicnicParameters picnicParameters12 = PicnicParameters.picnicl5full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier46 = BCObjectIdentifiers.picnicl5full;
        hashMap.put(picnicParameters12, aSN1ObjectIdentifier46);
        hashMap2.put(aSN1ObjectIdentifier35, picnicParameters);
        hashMap2.put(aSN1ObjectIdentifier36, picnicParameters2);
        hashMap2.put(aSN1ObjectIdentifier37, picnicParameters3);
        hashMap2.put(aSN1ObjectIdentifier38, picnicParameters4);
        hashMap2.put(aSN1ObjectIdentifier39, picnicParameters5);
        hashMap2.put(aSN1ObjectIdentifier40, picnicParameters6);
        hashMap2.put(aSN1ObjectIdentifier41, picnicParameters7);
        hashMap2.put(aSN1ObjectIdentifier42, picnicParameters8);
        hashMap2.put(aSN1ObjectIdentifier43, picnicParameters9);
        hashMap2.put(aSN1ObjectIdentifier44, picnicParameters10);
        hashMap2.put(aSN1ObjectIdentifier45, picnicParameters11);
        hashMap2.put(aSN1ObjectIdentifier46, picnicParameters12);
        NTRUParameters nTRUParameters = NTRUParameters.ntruhps2048509;
        ASN1ObjectIdentifier aSN1ObjectIdentifier47 = BCObjectIdentifiers.ntruhps2048509;
        hashMap11.put(nTRUParameters, aSN1ObjectIdentifier47);
        NTRUParameters nTRUParameters2 = NTRUParameters.ntruhps2048677;
        ASN1ObjectIdentifier aSN1ObjectIdentifier48 = BCObjectIdentifiers.ntruhps2048677;
        hashMap11.put(nTRUParameters2, aSN1ObjectIdentifier48);
        NTRUParameters nTRUParameters3 = NTRUParameters.ntruhps4096821;
        ASN1ObjectIdentifier aSN1ObjectIdentifier49 = BCObjectIdentifiers.ntruhps4096821;
        hashMap11.put(nTRUParameters3, aSN1ObjectIdentifier49);
        NTRUParameters nTRUParameters4 = NTRUParameters.ntruhps40961229;
        ASN1ObjectIdentifier aSN1ObjectIdentifier50 = BCObjectIdentifiers.ntruhps40961229;
        hashMap11.put(nTRUParameters4, aSN1ObjectIdentifier50);
        NTRUParameters nTRUParameters5 = NTRUParameters.ntruhrss701;
        ASN1ObjectIdentifier aSN1ObjectIdentifier51 = BCObjectIdentifiers.ntruhrss701;
        hashMap11.put(nTRUParameters5, aSN1ObjectIdentifier51);
        NTRUParameters nTRUParameters6 = NTRUParameters.ntruhrss1373;
        ASN1ObjectIdentifier aSN1ObjectIdentifier52 = BCObjectIdentifiers.ntruhrss1373;
        hashMap11.put(nTRUParameters6, aSN1ObjectIdentifier52);
        hashMap12.put(aSN1ObjectIdentifier47, nTRUParameters);
        hashMap12.put(aSN1ObjectIdentifier48, nTRUParameters2);
        hashMap12.put(aSN1ObjectIdentifier49, nTRUParameters3);
        hashMap12.put(aSN1ObjectIdentifier50, nTRUParameters4);
        hashMap12.put(aSN1ObjectIdentifier51, nTRUParameters5);
        hashMap12.put(aSN1ObjectIdentifier52, nTRUParameters6);
        FalconParameters falconParameters = FalconParameters.falcon_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier53 = BCObjectIdentifiers.falcon_512;
        hashMap13.put(falconParameters, aSN1ObjectIdentifier53);
        FalconParameters falconParameters2 = FalconParameters.falcon_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier54 = BCObjectIdentifiers.falcon_1024;
        hashMap13.put(falconParameters2, aSN1ObjectIdentifier54);
        hashMap14.put(aSN1ObjectIdentifier53, falconParameters);
        hashMap14.put(aSN1ObjectIdentifier54, falconParameters2);
        hashMap14.put(BCObjectIdentifiers.old_falcon_512, falconParameters);
        hashMap14.put(BCObjectIdentifiers.old_falcon_1024, falconParameters2);
        MLKEMParameters mLKEMParameters = MLKEMParameters.ml_kem_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier55 = NISTObjectIdentifiers.id_alg_ml_kem_512;
        hashMap27.put(mLKEMParameters, aSN1ObjectIdentifier55);
        MLKEMParameters mLKEMParameters2 = MLKEMParameters.ml_kem_768;
        ASN1ObjectIdentifier aSN1ObjectIdentifier56 = NISTObjectIdentifiers.id_alg_ml_kem_768;
        hashMap27.put(mLKEMParameters2, aSN1ObjectIdentifier56);
        MLKEMParameters mLKEMParameters3 = MLKEMParameters.ml_kem_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier57 = NISTObjectIdentifiers.id_alg_ml_kem_1024;
        hashMap27.put(mLKEMParameters3, aSN1ObjectIdentifier57);
        hashMap28.put(aSN1ObjectIdentifier55, mLKEMParameters);
        hashMap28.put(aSN1ObjectIdentifier56, mLKEMParameters2);
        hashMap28.put(aSN1ObjectIdentifier57, mLKEMParameters3);
        NTRULPRimeParameters nTRULPRimeParameters = NTRULPRimeParameters.ntrulpr653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier58 = BCObjectIdentifiers.ntrulpr653;
        hashMap15.put(nTRULPRimeParameters, aSN1ObjectIdentifier58);
        NTRULPRimeParameters nTRULPRimeParameters2 = NTRULPRimeParameters.ntrulpr761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier59 = BCObjectIdentifiers.ntrulpr761;
        hashMap15.put(nTRULPRimeParameters2, aSN1ObjectIdentifier59);
        NTRULPRimeParameters nTRULPRimeParameters3 = NTRULPRimeParameters.ntrulpr857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier60 = BCObjectIdentifiers.ntrulpr857;
        hashMap15.put(nTRULPRimeParameters3, aSN1ObjectIdentifier60);
        NTRULPRimeParameters nTRULPRimeParameters4 = NTRULPRimeParameters.ntrulpr953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier61 = BCObjectIdentifiers.ntrulpr953;
        hashMap15.put(nTRULPRimeParameters4, aSN1ObjectIdentifier61);
        NTRULPRimeParameters nTRULPRimeParameters5 = NTRULPRimeParameters.ntrulpr1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier62 = BCObjectIdentifiers.ntrulpr1013;
        hashMap15.put(nTRULPRimeParameters5, aSN1ObjectIdentifier62);
        NTRULPRimeParameters nTRULPRimeParameters6 = NTRULPRimeParameters.ntrulpr1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier63 = BCObjectIdentifiers.ntrulpr1277;
        hashMap15.put(nTRULPRimeParameters6, aSN1ObjectIdentifier63);
        hashMap16.put(aSN1ObjectIdentifier58, nTRULPRimeParameters);
        hashMap16.put(aSN1ObjectIdentifier59, nTRULPRimeParameters2);
        hashMap16.put(aSN1ObjectIdentifier60, nTRULPRimeParameters3);
        hashMap16.put(aSN1ObjectIdentifier61, nTRULPRimeParameters4);
        hashMap16.put(aSN1ObjectIdentifier62, nTRULPRimeParameters5);
        hashMap16.put(aSN1ObjectIdentifier63, nTRULPRimeParameters6);
        SNTRUPrimeParameters sNTRUPrimeParameters = SNTRUPrimeParameters.sntrup653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier64 = BCObjectIdentifiers.sntrup653;
        hashMap17.put(sNTRUPrimeParameters, aSN1ObjectIdentifier64);
        SNTRUPrimeParameters sNTRUPrimeParameters2 = SNTRUPrimeParameters.sntrup761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier65 = BCObjectIdentifiers.sntrup761;
        hashMap17.put(sNTRUPrimeParameters2, aSN1ObjectIdentifier65);
        SNTRUPrimeParameters sNTRUPrimeParameters3 = SNTRUPrimeParameters.sntrup857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier66 = BCObjectIdentifiers.sntrup857;
        hashMap17.put(sNTRUPrimeParameters3, aSN1ObjectIdentifier66);
        SNTRUPrimeParameters sNTRUPrimeParameters4 = SNTRUPrimeParameters.sntrup953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier67 = BCObjectIdentifiers.sntrup953;
        hashMap17.put(sNTRUPrimeParameters4, aSN1ObjectIdentifier67);
        SNTRUPrimeParameters sNTRUPrimeParameters5 = SNTRUPrimeParameters.sntrup1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier68 = BCObjectIdentifiers.sntrup1013;
        hashMap17.put(sNTRUPrimeParameters5, aSN1ObjectIdentifier68);
        SNTRUPrimeParameters sNTRUPrimeParameters6 = SNTRUPrimeParameters.sntrup1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier69 = BCObjectIdentifiers.sntrup1277;
        hashMap17.put(sNTRUPrimeParameters6, aSN1ObjectIdentifier69);
        hashMap18.put(aSN1ObjectIdentifier64, sNTRUPrimeParameters);
        hashMap18.put(aSN1ObjectIdentifier65, sNTRUPrimeParameters2);
        hashMap18.put(aSN1ObjectIdentifier66, sNTRUPrimeParameters3);
        hashMap18.put(aSN1ObjectIdentifier67, sNTRUPrimeParameters4);
        hashMap18.put(aSN1ObjectIdentifier68, sNTRUPrimeParameters5);
        hashMap18.put(aSN1ObjectIdentifier69, sNTRUPrimeParameters6);
        MLDSAParameters mLDSAParameters = MLDSAParameters.ml_dsa_44;
        ASN1ObjectIdentifier aSN1ObjectIdentifier70 = NISTObjectIdentifiers.id_ml_dsa_44;
        hashMap29.put(mLDSAParameters, aSN1ObjectIdentifier70);
        MLDSAParameters mLDSAParameters2 = MLDSAParameters.ml_dsa_65;
        ASN1ObjectIdentifier aSN1ObjectIdentifier71 = NISTObjectIdentifiers.id_ml_dsa_65;
        hashMap29.put(mLDSAParameters2, aSN1ObjectIdentifier71);
        MLDSAParameters mLDSAParameters3 = MLDSAParameters.ml_dsa_87;
        ASN1ObjectIdentifier aSN1ObjectIdentifier72 = NISTObjectIdentifiers.id_ml_dsa_87;
        hashMap29.put(mLDSAParameters3, aSN1ObjectIdentifier72);
        MLDSAParameters mLDSAParameters4 = MLDSAParameters.ml_dsa_44_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier73 = NISTObjectIdentifiers.id_hash_ml_dsa_44_with_sha512;
        hashMap29.put(mLDSAParameters4, aSN1ObjectIdentifier73);
        MLDSAParameters mLDSAParameters5 = MLDSAParameters.ml_dsa_65_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier74 = NISTObjectIdentifiers.id_hash_ml_dsa_65_with_sha512;
        hashMap29.put(mLDSAParameters5, aSN1ObjectIdentifier74);
        MLDSAParameters mLDSAParameters6 = MLDSAParameters.ml_dsa_87_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier75 = NISTObjectIdentifiers.id_hash_ml_dsa_87_with_sha512;
        hashMap29.put(mLDSAParameters6, aSN1ObjectIdentifier75);
        hashMap30.put(aSN1ObjectIdentifier70, mLDSAParameters);
        hashMap30.put(aSN1ObjectIdentifier71, mLDSAParameters2);
        hashMap30.put(aSN1ObjectIdentifier72, mLDSAParameters3);
        hashMap30.put(aSN1ObjectIdentifier73, mLDSAParameters4);
        hashMap30.put(aSN1ObjectIdentifier74, mLDSAParameters5);
        hashMap30.put(aSN1ObjectIdentifier75, mLDSAParameters6);
        DilithiumParameters dilithiumParameters = DilithiumParameters.dilithium2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier76 = BCObjectIdentifiers.dilithium2;
        hashMap19.put(dilithiumParameters, aSN1ObjectIdentifier76);
        DilithiumParameters dilithiumParameters2 = DilithiumParameters.dilithium3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier77 = BCObjectIdentifiers.dilithium3;
        hashMap19.put(dilithiumParameters2, aSN1ObjectIdentifier77);
        DilithiumParameters dilithiumParameters3 = DilithiumParameters.dilithium5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier78 = BCObjectIdentifiers.dilithium5;
        hashMap19.put(dilithiumParameters3, aSN1ObjectIdentifier78);
        hashMap20.put(aSN1ObjectIdentifier76, dilithiumParameters);
        hashMap20.put(aSN1ObjectIdentifier77, dilithiumParameters2);
        hashMap20.put(aSN1ObjectIdentifier78, dilithiumParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier79 = BCObjectIdentifiers.bike128;
        BIKEParameters bIKEParameters = BIKEParameters.bike128;
        hashMap22.put(aSN1ObjectIdentifier79, bIKEParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier80 = BCObjectIdentifiers.bike192;
        BIKEParameters bIKEParameters2 = BIKEParameters.bike192;
        hashMap22.put(aSN1ObjectIdentifier80, bIKEParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier81 = BCObjectIdentifiers.bike256;
        BIKEParameters bIKEParameters3 = BIKEParameters.bike256;
        hashMap22.put(aSN1ObjectIdentifier81, bIKEParameters3);
        hashMap21.put(bIKEParameters, aSN1ObjectIdentifier79);
        hashMap21.put(bIKEParameters2, aSN1ObjectIdentifier80);
        hashMap21.put(bIKEParameters3, aSN1ObjectIdentifier81);
        ASN1ObjectIdentifier aSN1ObjectIdentifier82 = BCObjectIdentifiers.hqc128;
        HQCParameters hQCParameters = HQCParameters.hqc128;
        hashMap24.put(aSN1ObjectIdentifier82, hQCParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier83 = BCObjectIdentifiers.hqc192;
        HQCParameters hQCParameters2 = HQCParameters.hqc192;
        hashMap24.put(aSN1ObjectIdentifier83, hQCParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier84 = BCObjectIdentifiers.hqc256;
        HQCParameters hQCParameters3 = HQCParameters.hqc256;
        hashMap24.put(aSN1ObjectIdentifier84, hQCParameters3);
        hashMap23.put(hQCParameters, aSN1ObjectIdentifier82);
        hashMap23.put(hQCParameters2, aSN1ObjectIdentifier83);
        hashMap23.put(hQCParameters3, aSN1ObjectIdentifier84);
        ASN1ObjectIdentifier aSN1ObjectIdentifier85 = BCObjectIdentifiers.rainbow_III_classic;
        RainbowParameters rainbowParameters = RainbowParameters.rainbowIIIclassic;
        hashMap26.put(aSN1ObjectIdentifier85, rainbowParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier86 = BCObjectIdentifiers.rainbow_III_circumzenithal;
        RainbowParameters rainbowParameters2 = RainbowParameters.rainbowIIIcircumzenithal;
        hashMap26.put(aSN1ObjectIdentifier86, rainbowParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier87 = BCObjectIdentifiers.rainbow_III_compressed;
        RainbowParameters rainbowParameters3 = RainbowParameters.rainbowIIIcompressed;
        hashMap26.put(aSN1ObjectIdentifier87, rainbowParameters3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier88 = BCObjectIdentifiers.rainbow_V_classic;
        RainbowParameters rainbowParameters4 = RainbowParameters.rainbowVclassic;
        hashMap26.put(aSN1ObjectIdentifier88, rainbowParameters4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier89 = BCObjectIdentifiers.rainbow_V_circumzenithal;
        RainbowParameters rainbowParameters5 = RainbowParameters.rainbowVcircumzenithal;
        hashMap26.put(aSN1ObjectIdentifier89, rainbowParameters5);
        ASN1ObjectIdentifier aSN1ObjectIdentifier90 = BCObjectIdentifiers.rainbow_V_compressed;
        RainbowParameters rainbowParameters6 = RainbowParameters.rainbowVcompressed;
        hashMap26.put(aSN1ObjectIdentifier90, rainbowParameters6);
        hashMap25.put(rainbowParameters, aSN1ObjectIdentifier85);
        hashMap25.put(rainbowParameters2, aSN1ObjectIdentifier86);
        hashMap25.put(rainbowParameters3, aSN1ObjectIdentifier87);
        hashMap25.put(rainbowParameters4, aSN1ObjectIdentifier88);
        hashMap25.put(rainbowParameters5, aSN1ObjectIdentifier89);
        hashMap25.put(rainbowParameters6, aSN1ObjectIdentifier90);
        SLHDSAParameters sLHDSAParameters = SLHDSAParameters.sha2_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier91 = NISTObjectIdentifiers.id_slh_dsa_sha2_128s;
        hashMap31.put(sLHDSAParameters, aSN1ObjectIdentifier91);
        SLHDSAParameters sLHDSAParameters2 = SLHDSAParameters.sha2_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier92 = NISTObjectIdentifiers.id_slh_dsa_sha2_128f;
        hashMap31.put(sLHDSAParameters2, aSN1ObjectIdentifier92);
        SLHDSAParameters sLHDSAParameters3 = SLHDSAParameters.sha2_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier93 = NISTObjectIdentifiers.id_slh_dsa_sha2_192s;
        hashMap31.put(sLHDSAParameters3, aSN1ObjectIdentifier93);
        SLHDSAParameters sLHDSAParameters4 = SLHDSAParameters.sha2_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier94 = NISTObjectIdentifiers.id_slh_dsa_sha2_192f;
        hashMap31.put(sLHDSAParameters4, aSN1ObjectIdentifier94);
        SLHDSAParameters sLHDSAParameters5 = SLHDSAParameters.sha2_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier95 = NISTObjectIdentifiers.id_slh_dsa_sha2_256s;
        hashMap31.put(sLHDSAParameters5, aSN1ObjectIdentifier95);
        SLHDSAParameters sLHDSAParameters6 = SLHDSAParameters.sha2_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier96 = NISTObjectIdentifiers.id_slh_dsa_sha2_256f;
        hashMap31.put(sLHDSAParameters6, aSN1ObjectIdentifier96);
        SLHDSAParameters sLHDSAParameters7 = SLHDSAParameters.shake_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier97 = NISTObjectIdentifiers.id_slh_dsa_shake_128s;
        hashMap31.put(sLHDSAParameters7, aSN1ObjectIdentifier97);
        SLHDSAParameters sLHDSAParameters8 = SLHDSAParameters.shake_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier98 = NISTObjectIdentifiers.id_slh_dsa_shake_128f;
        hashMap31.put(sLHDSAParameters8, aSN1ObjectIdentifier98);
        SLHDSAParameters sLHDSAParameters9 = SLHDSAParameters.shake_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier99 = NISTObjectIdentifiers.id_slh_dsa_shake_192s;
        hashMap31.put(sLHDSAParameters9, aSN1ObjectIdentifier99);
        SLHDSAParameters sLHDSAParameters10 = SLHDSAParameters.shake_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier100 = NISTObjectIdentifiers.id_slh_dsa_shake_192f;
        hashMap31.put(sLHDSAParameters10, aSN1ObjectIdentifier100);
        SLHDSAParameters sLHDSAParameters11 = SLHDSAParameters.shake_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier101 = NISTObjectIdentifiers.id_slh_dsa_shake_256s;
        hashMap31.put(sLHDSAParameters11, aSN1ObjectIdentifier101);
        SLHDSAParameters sLHDSAParameters12 = SLHDSAParameters.shake_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier102 = NISTObjectIdentifiers.id_slh_dsa_shake_256f;
        hashMap31.put(sLHDSAParameters12, aSN1ObjectIdentifier102);
        SLHDSAParameters sLHDSAParameters13 = SLHDSAParameters.sha2_128s_with_sha256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier103 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128s_with_sha256;
        hashMap31.put(sLHDSAParameters13, aSN1ObjectIdentifier103);
        SLHDSAParameters sLHDSAParameters14 = SLHDSAParameters.sha2_128f_with_sha256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier104 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_128f_with_sha256;
        hashMap31.put(sLHDSAParameters14, aSN1ObjectIdentifier104);
        SLHDSAParameters sLHDSAParameters15 = SLHDSAParameters.sha2_192s_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier105 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192s_with_sha512;
        hashMap31.put(sLHDSAParameters15, aSN1ObjectIdentifier105);
        SLHDSAParameters sLHDSAParameters16 = SLHDSAParameters.sha2_192f_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier106 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_192f_with_sha512;
        hashMap31.put(sLHDSAParameters16, aSN1ObjectIdentifier106);
        SLHDSAParameters sLHDSAParameters17 = SLHDSAParameters.sha2_256s_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier107 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256s_with_sha512;
        hashMap31.put(sLHDSAParameters17, aSN1ObjectIdentifier107);
        SLHDSAParameters sLHDSAParameters18 = SLHDSAParameters.sha2_256f_with_sha512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier108 = NISTObjectIdentifiers.id_hash_slh_dsa_sha2_256f_with_sha512;
        hashMap31.put(sLHDSAParameters18, aSN1ObjectIdentifier108);
        SLHDSAParameters sLHDSAParameters19 = SLHDSAParameters.shake_128s_with_shake128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier109 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128s_with_shake128;
        hashMap31.put(sLHDSAParameters19, aSN1ObjectIdentifier109);
        SLHDSAParameters sLHDSAParameters20 = SLHDSAParameters.shake_128f_with_shake128;
        ASN1ObjectIdentifier aSN1ObjectIdentifier110 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_128f_with_shake128;
        hashMap31.put(sLHDSAParameters20, aSN1ObjectIdentifier110);
        SLHDSAParameters sLHDSAParameters21 = SLHDSAParameters.shake_192s_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier111 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192s_with_shake256;
        hashMap31.put(sLHDSAParameters21, aSN1ObjectIdentifier111);
        SLHDSAParameters sLHDSAParameters22 = SLHDSAParameters.shake_192f_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier112 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_192f_with_shake256;
        hashMap31.put(sLHDSAParameters22, aSN1ObjectIdentifier112);
        SLHDSAParameters sLHDSAParameters23 = SLHDSAParameters.shake_256s_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier113 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256s_with_shake256;
        hashMap31.put(sLHDSAParameters23, aSN1ObjectIdentifier113);
        SLHDSAParameters sLHDSAParameters24 = SLHDSAParameters.shake_256f_with_shake256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier114 = NISTObjectIdentifiers.id_hash_slh_dsa_shake_256f_with_shake256;
        hashMap31.put(sLHDSAParameters24, aSN1ObjectIdentifier114);
        hashMap32.put(aSN1ObjectIdentifier91, sLHDSAParameters);
        hashMap32.put(aSN1ObjectIdentifier92, sLHDSAParameters2);
        hashMap32.put(aSN1ObjectIdentifier93, sLHDSAParameters3);
        hashMap32.put(aSN1ObjectIdentifier94, sLHDSAParameters4);
        hashMap32.put(aSN1ObjectIdentifier95, sLHDSAParameters5);
        hashMap32.put(aSN1ObjectIdentifier96, sLHDSAParameters6);
        hashMap32.put(aSN1ObjectIdentifier97, sLHDSAParameters7);
        hashMap32.put(aSN1ObjectIdentifier98, sLHDSAParameters8);
        hashMap32.put(aSN1ObjectIdentifier99, sLHDSAParameters9);
        hashMap32.put(aSN1ObjectIdentifier100, sLHDSAParameters10);
        hashMap32.put(aSN1ObjectIdentifier101, sLHDSAParameters11);
        hashMap32.put(aSN1ObjectIdentifier102, sLHDSAParameters12);
        hashMap32.put(aSN1ObjectIdentifier103, sLHDSAParameters13);
        hashMap32.put(aSN1ObjectIdentifier104, sLHDSAParameters14);
        hashMap32.put(aSN1ObjectIdentifier105, sLHDSAParameters15);
        hashMap32.put(aSN1ObjectIdentifier106, sLHDSAParameters16);
        hashMap32.put(aSN1ObjectIdentifier107, sLHDSAParameters17);
        hashMap32.put(aSN1ObjectIdentifier108, sLHDSAParameters18);
        hashMap32.put(aSN1ObjectIdentifier109, sLHDSAParameters19);
        hashMap32.put(aSN1ObjectIdentifier110, sLHDSAParameters20);
        hashMap32.put(aSN1ObjectIdentifier111, sLHDSAParameters21);
        hashMap32.put(aSN1ObjectIdentifier112, sLHDSAParameters22);
        hashMap32.put(aSN1ObjectIdentifier113, sLHDSAParameters23);
        hashMap32.put(aSN1ObjectIdentifier114, sLHDSAParameters24);
        ASN1ObjectIdentifier aSN1ObjectIdentifier115 = BCObjectIdentifiers.sphincsPlus_sha2_128s;
        hashMap9.put(sLHDSAParameters, aSN1ObjectIdentifier115);
        ASN1ObjectIdentifier aSN1ObjectIdentifier116 = BCObjectIdentifiers.sphincsPlus_sha2_128f;
        hashMap9.put(sLHDSAParameters2, aSN1ObjectIdentifier116);
        ASN1ObjectIdentifier aSN1ObjectIdentifier117 = BCObjectIdentifiers.sphincsPlus_sha2_192s;
        hashMap9.put(sLHDSAParameters3, aSN1ObjectIdentifier117);
        ASN1ObjectIdentifier aSN1ObjectIdentifier118 = BCObjectIdentifiers.sphincsPlus_sha2_192f;
        hashMap9.put(sLHDSAParameters4, aSN1ObjectIdentifier118);
        ASN1ObjectIdentifier aSN1ObjectIdentifier119 = BCObjectIdentifiers.sphincsPlus_sha2_256s;
        hashMap9.put(sLHDSAParameters5, aSN1ObjectIdentifier119);
        ASN1ObjectIdentifier aSN1ObjectIdentifier120 = BCObjectIdentifiers.sphincsPlus_sha2_256f;
        hashMap9.put(sLHDSAParameters6, aSN1ObjectIdentifier120);
        ASN1ObjectIdentifier aSN1ObjectIdentifier121 = BCObjectIdentifiers.sphincsPlus_shake_128s;
        hashMap9.put(sLHDSAParameters7, aSN1ObjectIdentifier121);
        ASN1ObjectIdentifier aSN1ObjectIdentifier122 = BCObjectIdentifiers.sphincsPlus_shake_128f;
        hashMap9.put(sLHDSAParameters8, aSN1ObjectIdentifier122);
        ASN1ObjectIdentifier aSN1ObjectIdentifier123 = BCObjectIdentifiers.sphincsPlus_shake_192s;
        hashMap9.put(sLHDSAParameters9, aSN1ObjectIdentifier123);
        ASN1ObjectIdentifier aSN1ObjectIdentifier124 = BCObjectIdentifiers.sphincsPlus_shake_192f;
        hashMap9.put(sLHDSAParameters10, aSN1ObjectIdentifier124);
        ASN1ObjectIdentifier aSN1ObjectIdentifier125 = BCObjectIdentifiers.sphincsPlus_shake_256s;
        hashMap9.put(sLHDSAParameters11, aSN1ObjectIdentifier125);
        ASN1ObjectIdentifier aSN1ObjectIdentifier126 = BCObjectIdentifiers.sphincsPlus_shake_256f;
        hashMap9.put(sLHDSAParameters12, aSN1ObjectIdentifier126);
        SPHINCSPlusParameters sPHINCSPlusParameters = SPHINCSPlusParameters.sha2_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier127 = BCObjectIdentifiers.sphincsPlus_sha2_128s_r3;
        hashMap9.put(sPHINCSPlusParameters, aSN1ObjectIdentifier127);
        SPHINCSPlusParameters sPHINCSPlusParameters2 = SPHINCSPlusParameters.sha2_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier128 = BCObjectIdentifiers.sphincsPlus_sha2_128f_r3;
        hashMap9.put(sPHINCSPlusParameters2, aSN1ObjectIdentifier128);
        SPHINCSPlusParameters sPHINCSPlusParameters3 = SPHINCSPlusParameters.shake_128s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier129 = BCObjectIdentifiers.sphincsPlus_shake_128s_r3;
        hashMap9.put(sPHINCSPlusParameters3, aSN1ObjectIdentifier129);
        SPHINCSPlusParameters sPHINCSPlusParameters4 = SPHINCSPlusParameters.shake_128f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier130 = BCObjectIdentifiers.sphincsPlus_shake_128f_r3;
        hashMap9.put(sPHINCSPlusParameters4, aSN1ObjectIdentifier130);
        SPHINCSPlusParameters sPHINCSPlusParameters5 = SPHINCSPlusParameters.haraka_128s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier131 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3;
        hashMap9.put(sPHINCSPlusParameters5, aSN1ObjectIdentifier131);
        SPHINCSPlusParameters sPHINCSPlusParameters6 = SPHINCSPlusParameters.haraka_128f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier132 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3;
        hashMap9.put(sPHINCSPlusParameters6, aSN1ObjectIdentifier132);
        SPHINCSPlusParameters sPHINCSPlusParameters7 = SPHINCSPlusParameters.sha2_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier133 = BCObjectIdentifiers.sphincsPlus_sha2_192s_r3;
        hashMap9.put(sPHINCSPlusParameters7, aSN1ObjectIdentifier133);
        SPHINCSPlusParameters sPHINCSPlusParameters8 = SPHINCSPlusParameters.sha2_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier134 = BCObjectIdentifiers.sphincsPlus_sha2_192f_r3;
        hashMap9.put(sPHINCSPlusParameters8, aSN1ObjectIdentifier134);
        SPHINCSPlusParameters sPHINCSPlusParameters9 = SPHINCSPlusParameters.shake_192s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier135 = BCObjectIdentifiers.sphincsPlus_shake_192s_r3;
        hashMap9.put(sPHINCSPlusParameters9, aSN1ObjectIdentifier135);
        SPHINCSPlusParameters sPHINCSPlusParameters10 = SPHINCSPlusParameters.shake_192f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier136 = BCObjectIdentifiers.sphincsPlus_shake_192f_r3;
        hashMap9.put(sPHINCSPlusParameters10, aSN1ObjectIdentifier136);
        SPHINCSPlusParameters sPHINCSPlusParameters11 = SPHINCSPlusParameters.haraka_192s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier137 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3;
        hashMap9.put(sPHINCSPlusParameters11, aSN1ObjectIdentifier137);
        SPHINCSPlusParameters sPHINCSPlusParameters12 = SPHINCSPlusParameters.haraka_192f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier138 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3;
        hashMap9.put(sPHINCSPlusParameters12, aSN1ObjectIdentifier138);
        SPHINCSPlusParameters sPHINCSPlusParameters13 = SPHINCSPlusParameters.sha2_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier139 = BCObjectIdentifiers.sphincsPlus_sha2_256s_r3;
        hashMap9.put(sPHINCSPlusParameters13, aSN1ObjectIdentifier139);
        SPHINCSPlusParameters sPHINCSPlusParameters14 = SPHINCSPlusParameters.sha2_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier140 = BCObjectIdentifiers.sphincsPlus_sha2_256f_r3;
        hashMap9.put(sPHINCSPlusParameters14, aSN1ObjectIdentifier140);
        SPHINCSPlusParameters sPHINCSPlusParameters15 = SPHINCSPlusParameters.shake_256s_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier141 = BCObjectIdentifiers.sphincsPlus_shake_256s_r3;
        hashMap9.put(sPHINCSPlusParameters15, aSN1ObjectIdentifier141);
        SPHINCSPlusParameters sPHINCSPlusParameters16 = SPHINCSPlusParameters.shake_256f_robust;
        ASN1ObjectIdentifier aSN1ObjectIdentifier142 = BCObjectIdentifiers.sphincsPlus_shake_256f_r3;
        hashMap9.put(sPHINCSPlusParameters16, aSN1ObjectIdentifier142);
        SPHINCSPlusParameters sPHINCSPlusParameters17 = SPHINCSPlusParameters.haraka_256s;
        ASN1ObjectIdentifier aSN1ObjectIdentifier143 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3;
        hashMap9.put(sPHINCSPlusParameters17, aSN1ObjectIdentifier143);
        SPHINCSPlusParameters sPHINCSPlusParameters18 = SPHINCSPlusParameters.haraka_256f;
        ASN1ObjectIdentifier aSN1ObjectIdentifier144 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3;
        hashMap9.put(sPHINCSPlusParameters18, aSN1ObjectIdentifier144);
        SPHINCSPlusParameters sPHINCSPlusParameters19 = SPHINCSPlusParameters.haraka_128s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier145 = BCObjectIdentifiers.sphincsPlus_haraka_128s_r3_simple;
        hashMap9.put(sPHINCSPlusParameters19, aSN1ObjectIdentifier145);
        SPHINCSPlusParameters sPHINCSPlusParameters20 = SPHINCSPlusParameters.haraka_128f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier146 = BCObjectIdentifiers.sphincsPlus_haraka_128f_r3_simple;
        hashMap9.put(sPHINCSPlusParameters20, aSN1ObjectIdentifier146);
        SPHINCSPlusParameters sPHINCSPlusParameters21 = SPHINCSPlusParameters.haraka_192s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier147 = BCObjectIdentifiers.sphincsPlus_haraka_192s_r3_simple;
        hashMap9.put(sPHINCSPlusParameters21, aSN1ObjectIdentifier147);
        SPHINCSPlusParameters sPHINCSPlusParameters22 = SPHINCSPlusParameters.haraka_192f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier148 = BCObjectIdentifiers.sphincsPlus_haraka_192f_r3_simple;
        hashMap9.put(sPHINCSPlusParameters22, aSN1ObjectIdentifier148);
        SPHINCSPlusParameters sPHINCSPlusParameters23 = SPHINCSPlusParameters.haraka_256s_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier149 = BCObjectIdentifiers.sphincsPlus_haraka_256s_r3_simple;
        hashMap9.put(sPHINCSPlusParameters23, aSN1ObjectIdentifier149);
        SPHINCSPlusParameters sPHINCSPlusParameters24 = SPHINCSPlusParameters.haraka_256f_simple;
        ASN1ObjectIdentifier aSN1ObjectIdentifier150 = BCObjectIdentifiers.sphincsPlus_haraka_256f_r3_simple;
        hashMap9.put(sPHINCSPlusParameters24, aSN1ObjectIdentifier150);
        SPHINCSPlusParameters sPHINCSPlusParameters25 = SPHINCSPlusParameters.sha2_128s;
        hashMap9.put(sPHINCSPlusParameters25, aSN1ObjectIdentifier115);
        SPHINCSPlusParameters sPHINCSPlusParameters26 = SPHINCSPlusParameters.sha2_128f;
        hashMap9.put(sPHINCSPlusParameters26, aSN1ObjectIdentifier116);
        SPHINCSPlusParameters sPHINCSPlusParameters27 = SPHINCSPlusParameters.sha2_192s;
        hashMap9.put(sPHINCSPlusParameters27, aSN1ObjectIdentifier117);
        SPHINCSPlusParameters sPHINCSPlusParameters28 = SPHINCSPlusParameters.sha2_192f;
        hashMap9.put(sPHINCSPlusParameters28, aSN1ObjectIdentifier118);
        SPHINCSPlusParameters sPHINCSPlusParameters29 = SPHINCSPlusParameters.sha2_256s;
        hashMap9.put(sPHINCSPlusParameters29, aSN1ObjectIdentifier119);
        SPHINCSPlusParameters sPHINCSPlusParameters30 = SPHINCSPlusParameters.sha2_256f;
        hashMap9.put(sPHINCSPlusParameters30, aSN1ObjectIdentifier120);
        SPHINCSPlusParameters sPHINCSPlusParameters31 = SPHINCSPlusParameters.shake_128s;
        hashMap9.put(sPHINCSPlusParameters31, aSN1ObjectIdentifier121);
        SPHINCSPlusParameters sPHINCSPlusParameters32 = SPHINCSPlusParameters.shake_128f;
        hashMap9.put(sPHINCSPlusParameters32, aSN1ObjectIdentifier122);
        SPHINCSPlusParameters sPHINCSPlusParameters33 = SPHINCSPlusParameters.shake_192s;
        hashMap9.put(sPHINCSPlusParameters33, aSN1ObjectIdentifier123);
        SPHINCSPlusParameters sPHINCSPlusParameters34 = SPHINCSPlusParameters.shake_192f;
        hashMap9.put(sPHINCSPlusParameters34, aSN1ObjectIdentifier124);
        SPHINCSPlusParameters sPHINCSPlusParameters35 = SPHINCSPlusParameters.shake_256s;
        hashMap9.put(sPHINCSPlusParameters35, aSN1ObjectIdentifier125);
        SPHINCSPlusParameters sPHINCSPlusParameters36 = SPHINCSPlusParameters.shake_256f;
        hashMap9.put(sPHINCSPlusParameters36, aSN1ObjectIdentifier126);
        hashMap10.put(aSN1ObjectIdentifier115, sPHINCSPlusParameters25);
        hashMap10.put(aSN1ObjectIdentifier116, sPHINCSPlusParameters26);
        hashMap10.put(aSN1ObjectIdentifier121, sPHINCSPlusParameters31);
        hashMap10.put(aSN1ObjectIdentifier122, sPHINCSPlusParameters32);
        hashMap10.put(aSN1ObjectIdentifier117, sPHINCSPlusParameters27);
        hashMap10.put(aSN1ObjectIdentifier118, sPHINCSPlusParameters28);
        hashMap10.put(aSN1ObjectIdentifier123, sPHINCSPlusParameters33);
        hashMap10.put(aSN1ObjectIdentifier124, sPHINCSPlusParameters34);
        hashMap10.put(aSN1ObjectIdentifier119, sPHINCSPlusParameters29);
        hashMap10.put(aSN1ObjectIdentifier120, sPHINCSPlusParameters30);
        hashMap10.put(aSN1ObjectIdentifier125, sPHINCSPlusParameters35);
        hashMap10.put(aSN1ObjectIdentifier126, sPHINCSPlusParameters36);
        hashMap10.put(aSN1ObjectIdentifier127, sPHINCSPlusParameters);
        hashMap10.put(aSN1ObjectIdentifier128, sPHINCSPlusParameters2);
        hashMap10.put(aSN1ObjectIdentifier129, sPHINCSPlusParameters3);
        hashMap10.put(aSN1ObjectIdentifier130, sPHINCSPlusParameters4);
        hashMap10.put(aSN1ObjectIdentifier131, sPHINCSPlusParameters5);
        hashMap10.put(aSN1ObjectIdentifier132, sPHINCSPlusParameters6);
        hashMap10.put(aSN1ObjectIdentifier133, sPHINCSPlusParameters7);
        hashMap10.put(aSN1ObjectIdentifier134, sPHINCSPlusParameters8);
        hashMap10.put(aSN1ObjectIdentifier135, sPHINCSPlusParameters9);
        hashMap10.put(aSN1ObjectIdentifier136, sPHINCSPlusParameters10);
        hashMap10.put(aSN1ObjectIdentifier137, sPHINCSPlusParameters11);
        hashMap10.put(aSN1ObjectIdentifier138, sPHINCSPlusParameters12);
        hashMap10.put(aSN1ObjectIdentifier139, sPHINCSPlusParameters13);
        hashMap10.put(aSN1ObjectIdentifier140, sPHINCSPlusParameters14);
        hashMap10.put(aSN1ObjectIdentifier141, sPHINCSPlusParameters15);
        hashMap10.put(aSN1ObjectIdentifier142, sPHINCSPlusParameters16);
        hashMap10.put(aSN1ObjectIdentifier143, sPHINCSPlusParameters17);
        hashMap10.put(aSN1ObjectIdentifier144, sPHINCSPlusParameters18);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_sha2_128s_r3_simple, sPHINCSPlusParameters25);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_sha2_128f_r3_simple, sPHINCSPlusParameters26);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_shake_128s_r3_simple, sPHINCSPlusParameters31);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_shake_128f_r3_simple, sPHINCSPlusParameters32);
        hashMap10.put(aSN1ObjectIdentifier145, sPHINCSPlusParameters19);
        hashMap10.put(aSN1ObjectIdentifier146, sPHINCSPlusParameters20);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_sha2_192s_r3_simple, sPHINCSPlusParameters27);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_sha2_192f_r3_simple, sPHINCSPlusParameters28);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_shake_192s_r3_simple, sPHINCSPlusParameters33);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_shake_192f_r3_simple, sPHINCSPlusParameters34);
        hashMap10.put(aSN1ObjectIdentifier147, sPHINCSPlusParameters21);
        hashMap10.put(aSN1ObjectIdentifier148, sPHINCSPlusParameters22);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_sha2_256s_r3_simple, sPHINCSPlusParameters29);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_sha2_256f_r3_simple, sPHINCSPlusParameters30);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_shake_256s_r3_simple, sPHINCSPlusParameters35);
        hashMap10.put(BCObjectIdentifiers.sphincsPlus_shake_256f_r3_simple, sPHINCSPlusParameters36);
        hashMap10.put(aSN1ObjectIdentifier149, sPHINCSPlusParameters23);
        hashMap10.put(aSN1ObjectIdentifier150, sPHINCSPlusParameters24);
        MayoParameters mayoParameters = MayoParameters.mayo1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier151 = BCObjectIdentifiers.mayo1;
        hashMap33.put(mayoParameters, aSN1ObjectIdentifier151);
        MayoParameters mayoParameters2 = MayoParameters.mayo2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier152 = BCObjectIdentifiers.mayo2;
        hashMap33.put(mayoParameters2, aSN1ObjectIdentifier152);
        MayoParameters mayoParameters3 = MayoParameters.mayo3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier153 = BCObjectIdentifiers.mayo3;
        hashMap33.put(mayoParameters3, aSN1ObjectIdentifier153);
        MayoParameters mayoParameters4 = MayoParameters.mayo5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier154 = BCObjectIdentifiers.mayo5;
        hashMap33.put(mayoParameters4, aSN1ObjectIdentifier154);
        hashMap34.put(aSN1ObjectIdentifier151, mayoParameters);
        hashMap34.put(aSN1ObjectIdentifier152, mayoParameters2);
        hashMap34.put(aSN1ObjectIdentifier153, mayoParameters3);
        hashMap34.put(aSN1ObjectIdentifier154, mayoParameters4);
        SnovaParameters snovaParameters = SnovaParameters.SNOVA_24_5_4_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier155 = BCObjectIdentifiers.snova_24_5_4_ssk;
        hashMap35.put(snovaParameters, aSN1ObjectIdentifier155);
        SnovaParameters snovaParameters2 = SnovaParameters.SNOVA_24_5_4_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier156 = BCObjectIdentifiers.snova_24_5_4_esk;
        hashMap35.put(snovaParameters2, aSN1ObjectIdentifier156);
        SnovaParameters snovaParameters3 = SnovaParameters.SNOVA_24_5_4_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier157 = BCObjectIdentifiers.snova_24_5_4_shake_ssk;
        hashMap35.put(snovaParameters3, aSN1ObjectIdentifier157);
        SnovaParameters snovaParameters4 = SnovaParameters.SNOVA_24_5_4_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier158 = BCObjectIdentifiers.snova_24_5_4_shake_esk;
        hashMap35.put(snovaParameters4, aSN1ObjectIdentifier158);
        SnovaParameters snovaParameters5 = SnovaParameters.SNOVA_24_5_5_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier159 = BCObjectIdentifiers.snova_24_5_5_ssk;
        hashMap35.put(snovaParameters5, aSN1ObjectIdentifier159);
        SnovaParameters snovaParameters6 = SnovaParameters.SNOVA_24_5_5_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier160 = BCObjectIdentifiers.snova_24_5_5_esk;
        hashMap35.put(snovaParameters6, aSN1ObjectIdentifier160);
        SnovaParameters snovaParameters7 = SnovaParameters.SNOVA_24_5_5_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier161 = BCObjectIdentifiers.snova_24_5_5_shake_ssk;
        hashMap35.put(snovaParameters7, aSN1ObjectIdentifier161);
        SnovaParameters snovaParameters8 = SnovaParameters.SNOVA_24_5_5_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier162 = BCObjectIdentifiers.snova_24_5_5_shake_esk;
        hashMap35.put(snovaParameters8, aSN1ObjectIdentifier162);
        SnovaParameters snovaParameters9 = SnovaParameters.SNOVA_25_8_3_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier163 = BCObjectIdentifiers.snova_25_8_3_ssk;
        hashMap35.put(snovaParameters9, aSN1ObjectIdentifier163);
        SnovaParameters snovaParameters10 = SnovaParameters.SNOVA_25_8_3_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier164 = BCObjectIdentifiers.snova_25_8_3_esk;
        hashMap35.put(snovaParameters10, aSN1ObjectIdentifier164);
        SnovaParameters snovaParameters11 = SnovaParameters.SNOVA_25_8_3_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier165 = BCObjectIdentifiers.snova_25_8_3_shake_ssk;
        hashMap35.put(snovaParameters11, aSN1ObjectIdentifier165);
        SnovaParameters snovaParameters12 = SnovaParameters.SNOVA_25_8_3_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier166 = BCObjectIdentifiers.snova_25_8_3_shake_esk;
        hashMap35.put(snovaParameters12, aSN1ObjectIdentifier166);
        SnovaParameters snovaParameters13 = SnovaParameters.SNOVA_29_6_5_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier167 = BCObjectIdentifiers.snova_29_6_5_ssk;
        hashMap35.put(snovaParameters13, aSN1ObjectIdentifier167);
        SnovaParameters snovaParameters14 = SnovaParameters.SNOVA_29_6_5_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier168 = BCObjectIdentifiers.snova_29_6_5_esk;
        hashMap35.put(snovaParameters14, aSN1ObjectIdentifier168);
        SnovaParameters snovaParameters15 = SnovaParameters.SNOVA_29_6_5_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier169 = BCObjectIdentifiers.snova_29_6_5_shake_ssk;
        hashMap35.put(snovaParameters15, aSN1ObjectIdentifier169);
        SnovaParameters snovaParameters16 = SnovaParameters.SNOVA_29_6_5_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier170 = BCObjectIdentifiers.snova_29_6_5_shake_esk;
        hashMap35.put(snovaParameters16, aSN1ObjectIdentifier170);
        SnovaParameters snovaParameters17 = SnovaParameters.SNOVA_37_8_4_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier171 = BCObjectIdentifiers.snova_37_8_4_ssk;
        hashMap35.put(snovaParameters17, aSN1ObjectIdentifier171);
        SnovaParameters snovaParameters18 = SnovaParameters.SNOVA_37_8_4_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier172 = BCObjectIdentifiers.snova_37_8_4_esk;
        hashMap35.put(snovaParameters18, aSN1ObjectIdentifier172);
        SnovaParameters snovaParameters19 = SnovaParameters.SNOVA_37_8_4_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier173 = BCObjectIdentifiers.snova_37_8_4_shake_ssk;
        hashMap35.put(snovaParameters19, aSN1ObjectIdentifier173);
        SnovaParameters snovaParameters20 = SnovaParameters.SNOVA_37_8_4_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier174 = BCObjectIdentifiers.snova_37_8_4_shake_esk;
        hashMap35.put(snovaParameters20, aSN1ObjectIdentifier174);
        SnovaParameters snovaParameters21 = SnovaParameters.SNOVA_37_17_2_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier175 = BCObjectIdentifiers.snova_37_17_2_ssk;
        hashMap35.put(snovaParameters21, aSN1ObjectIdentifier175);
        SnovaParameters snovaParameters22 = SnovaParameters.SNOVA_37_17_2_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier176 = BCObjectIdentifiers.snova_37_17_2_esk;
        hashMap35.put(snovaParameters22, aSN1ObjectIdentifier176);
        SnovaParameters snovaParameters23 = SnovaParameters.SNOVA_37_17_2_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier177 = BCObjectIdentifiers.snova_37_17_2_shake_ssk;
        hashMap35.put(snovaParameters23, aSN1ObjectIdentifier177);
        SnovaParameters snovaParameters24 = SnovaParameters.SNOVA_37_17_2_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier178 = BCObjectIdentifiers.snova_37_17_2_shake_esk;
        hashMap35.put(snovaParameters24, aSN1ObjectIdentifier178);
        SnovaParameters snovaParameters25 = SnovaParameters.SNOVA_49_11_3_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier179 = BCObjectIdentifiers.snova_49_11_3_ssk;
        hashMap35.put(snovaParameters25, aSN1ObjectIdentifier179);
        SnovaParameters snovaParameters26 = SnovaParameters.SNOVA_49_11_3_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier180 = BCObjectIdentifiers.snova_49_11_3_esk;
        hashMap35.put(snovaParameters26, aSN1ObjectIdentifier180);
        SnovaParameters snovaParameters27 = SnovaParameters.SNOVA_49_11_3_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier181 = BCObjectIdentifiers.snova_49_11_3_shake_ssk;
        hashMap35.put(snovaParameters27, aSN1ObjectIdentifier181);
        SnovaParameters snovaParameters28 = SnovaParameters.SNOVA_49_11_3_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier182 = BCObjectIdentifiers.snova_49_11_3_shake_esk;
        hashMap35.put(snovaParameters28, aSN1ObjectIdentifier182);
        SnovaParameters snovaParameters29 = SnovaParameters.SNOVA_56_25_2_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier183 = BCObjectIdentifiers.snova_56_25_2_ssk;
        hashMap35.put(snovaParameters29, aSN1ObjectIdentifier183);
        SnovaParameters snovaParameters30 = SnovaParameters.SNOVA_56_25_2_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier184 = BCObjectIdentifiers.snova_56_25_2_esk;
        hashMap35.put(snovaParameters30, aSN1ObjectIdentifier184);
        SnovaParameters snovaParameters31 = SnovaParameters.SNOVA_56_25_2_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier185 = BCObjectIdentifiers.snova_56_25_2_shake_ssk;
        hashMap35.put(snovaParameters31, aSN1ObjectIdentifier185);
        SnovaParameters snovaParameters32 = SnovaParameters.SNOVA_56_25_2_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier186 = BCObjectIdentifiers.snova_56_25_2_shake_esk;
        hashMap35.put(snovaParameters32, aSN1ObjectIdentifier186);
        SnovaParameters snovaParameters33 = SnovaParameters.SNOVA_60_10_4_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier187 = BCObjectIdentifiers.snova_60_10_4_ssk;
        hashMap35.put(snovaParameters33, aSN1ObjectIdentifier187);
        SnovaParameters snovaParameters34 = SnovaParameters.SNOVA_60_10_4_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier188 = BCObjectIdentifiers.snova_60_10_4_esk;
        hashMap35.put(snovaParameters34, aSN1ObjectIdentifier188);
        SnovaParameters snovaParameters35 = SnovaParameters.SNOVA_60_10_4_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier189 = BCObjectIdentifiers.snova_60_10_4_shake_ssk;
        hashMap35.put(snovaParameters35, aSN1ObjectIdentifier189);
        SnovaParameters snovaParameters36 = SnovaParameters.SNOVA_60_10_4_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier190 = BCObjectIdentifiers.snova_60_10_4_shake_esk;
        hashMap35.put(snovaParameters36, aSN1ObjectIdentifier190);
        SnovaParameters snovaParameters37 = SnovaParameters.SNOVA_66_15_3_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier191 = BCObjectIdentifiers.snova_66_15_3_ssk;
        hashMap35.put(snovaParameters37, aSN1ObjectIdentifier191);
        SnovaParameters snovaParameters38 = SnovaParameters.SNOVA_66_15_3_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier192 = BCObjectIdentifiers.snova_66_15_3_esk;
        hashMap35.put(snovaParameters38, aSN1ObjectIdentifier192);
        SnovaParameters snovaParameters39 = SnovaParameters.SNOVA_66_15_3_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier193 = BCObjectIdentifiers.snova_66_15_3_shake_ssk;
        hashMap35.put(snovaParameters39, aSN1ObjectIdentifier193);
        SnovaParameters snovaParameters40 = SnovaParameters.SNOVA_66_15_3_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier194 = BCObjectIdentifiers.snova_66_15_3_shake_esk;
        hashMap35.put(snovaParameters40, aSN1ObjectIdentifier194);
        SnovaParameters snovaParameters41 = SnovaParameters.SNOVA_75_33_2_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier195 = BCObjectIdentifiers.snova_75_33_2_ssk;
        hashMap35.put(snovaParameters41, aSN1ObjectIdentifier195);
        SnovaParameters snovaParameters42 = SnovaParameters.SNOVA_75_33_2_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier196 = BCObjectIdentifiers.snova_75_33_2_esk;
        hashMap35.put(snovaParameters42, aSN1ObjectIdentifier196);
        SnovaParameters snovaParameters43 = SnovaParameters.SNOVA_75_33_2_SHAKE_SSK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier197 = BCObjectIdentifiers.snova_75_33_2_shake_ssk;
        hashMap35.put(snovaParameters43, aSN1ObjectIdentifier197);
        SnovaParameters snovaParameters44 = SnovaParameters.SNOVA_75_33_2_SHAKE_ESK;
        ASN1ObjectIdentifier aSN1ObjectIdentifier198 = BCObjectIdentifiers.snova_75_33_2_shake_esk;
        hashMap35.put(snovaParameters44, aSN1ObjectIdentifier198);
        hashMap36.put(aSN1ObjectIdentifier155, snovaParameters);
        hashMap36.put(aSN1ObjectIdentifier156, snovaParameters2);
        hashMap36.put(aSN1ObjectIdentifier157, snovaParameters3);
        hashMap36.put(aSN1ObjectIdentifier158, snovaParameters4);
        hashMap36.put(aSN1ObjectIdentifier159, snovaParameters5);
        hashMap36.put(aSN1ObjectIdentifier160, snovaParameters6);
        hashMap36.put(aSN1ObjectIdentifier161, snovaParameters7);
        hashMap36.put(aSN1ObjectIdentifier162, snovaParameters8);
        hashMap36.put(aSN1ObjectIdentifier163, snovaParameters9);
        hashMap36.put(aSN1ObjectIdentifier164, snovaParameters10);
        hashMap36.put(aSN1ObjectIdentifier165, snovaParameters11);
        hashMap36.put(aSN1ObjectIdentifier166, snovaParameters12);
        hashMap36.put(aSN1ObjectIdentifier167, snovaParameters13);
        hashMap36.put(aSN1ObjectIdentifier168, snovaParameters14);
        hashMap36.put(aSN1ObjectIdentifier169, snovaParameters15);
        hashMap36.put(aSN1ObjectIdentifier170, snovaParameters16);
        hashMap36.put(aSN1ObjectIdentifier171, snovaParameters17);
        hashMap36.put(aSN1ObjectIdentifier172, snovaParameters18);
        hashMap36.put(aSN1ObjectIdentifier173, snovaParameters19);
        hashMap36.put(aSN1ObjectIdentifier174, snovaParameters20);
        hashMap36.put(aSN1ObjectIdentifier175, snovaParameters21);
        hashMap36.put(aSN1ObjectIdentifier176, snovaParameters22);
        hashMap36.put(aSN1ObjectIdentifier177, snovaParameters23);
        hashMap36.put(aSN1ObjectIdentifier178, snovaParameters24);
        hashMap36.put(aSN1ObjectIdentifier179, snovaParameters25);
        hashMap36.put(aSN1ObjectIdentifier180, snovaParameters26);
        hashMap36.put(aSN1ObjectIdentifier181, snovaParameters27);
        hashMap36.put(aSN1ObjectIdentifier182, snovaParameters28);
        hashMap36.put(aSN1ObjectIdentifier183, snovaParameters29);
        hashMap36.put(aSN1ObjectIdentifier184, snovaParameters30);
        hashMap36.put(aSN1ObjectIdentifier185, snovaParameters31);
        hashMap36.put(aSN1ObjectIdentifier186, snovaParameters32);
        hashMap36.put(aSN1ObjectIdentifier187, snovaParameters33);
        hashMap36.put(aSN1ObjectIdentifier188, snovaParameters34);
        hashMap36.put(aSN1ObjectIdentifier189, snovaParameters35);
        hashMap36.put(aSN1ObjectIdentifier190, snovaParameters36);
        hashMap36.put(aSN1ObjectIdentifier191, snovaParameters37);
        hashMap36.put(aSN1ObjectIdentifier192, snovaParameters38);
        hashMap36.put(aSN1ObjectIdentifier193, snovaParameters39);
        hashMap36.put(aSN1ObjectIdentifier194, snovaParameters40);
        hashMap36.put(aSN1ObjectIdentifier195, snovaParameters41);
        hashMap36.put(aSN1ObjectIdentifier196, snovaParameters42);
        hashMap36.put(aSN1ObjectIdentifier197, snovaParameters43);
        hashMap36.put(aSN1ObjectIdentifier198, snovaParameters44);
    }

    public static ASN1ObjectIdentifier bikeOidLookup(BIKEParameters bIKEParameters) {
        return (ASN1ObjectIdentifier) bikeOids.get(bIKEParameters);
    }

    public static BIKEParameters bikeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (BIKEParameters) bikeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier dilithiumOidLookup(DilithiumParameters dilithiumParameters) {
        return (ASN1ObjectIdentifier) dilithiumOids.get(dilithiumParameters);
    }

    public static DilithiumParameters dilithiumParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (DilithiumParameters) dilithiumParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier falconOidLookup(FalconParameters falconParameters) {
        return (ASN1ObjectIdentifier) falconOids.get(falconParameters);
    }

    public static FalconParameters falconParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FalconParameters) falconParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier frodoOidLookup(FrodoParameters frodoParameters) {
        return (ASN1ObjectIdentifier) frodoOids.get(frodoParameters);
    }

    public static FrodoParameters frodoParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FrodoParameters) frodoParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(String str) {
        if (str.equals("SHA-1")) {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        }
        if (str.equals("SHA-224")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224);
        }
        if (str.equals(XMSSKeyParameters.SHA_256)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        }
        if (str.equals("SHA-384")) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        if (str.equals(XMSSKeyParameters.SHA_512)) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        }
        throw new IllegalArgumentException("unrecognised digest algorithm: ".concat(str));
    }

    public static ASN1ObjectIdentifier hqcOidLookup(HQCParameters hQCParameters) {
        return (ASN1ObjectIdentifier) hqcOids.get(hQCParameters);
    }

    public static HQCParameters hqcParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (HQCParameters) hqcParams.get(aSN1ObjectIdentifier);
    }

    public static boolean isRaw(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        byteArrayInputStream.read();
        return readLen(byteArrayInputStream) != byteArrayInputStream.available();
    }

    public static ASN1ObjectIdentifier mayoOidLookup(MayoParameters mayoParameters) {
        return (ASN1ObjectIdentifier) mayoOids.get(mayoParameters);
    }

    public static MayoParameters mayoParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MayoParameters) mayoParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mcElieceOidLookup(CMCEParameters cMCEParameters) {
        return (ASN1ObjectIdentifier) mcElieceOids.get(cMCEParameters);
    }

    public static CMCEParameters mcElieceParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (CMCEParameters) mcElieceParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mldsaOidLookup(MLDSAParameters mLDSAParameters) {
        return (ASN1ObjectIdentifier) mldsaOids.get(mLDSAParameters);
    }

    public static MLDSAParameters mldsaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MLDSAParameters) mldsaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mlkemOidLookup(MLKEMParameters mLKEMParameters) {
        return (ASN1ObjectIdentifier) mlkemOids.get(mLKEMParameters);
    }

    public static MLKEMParameters mlkemParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (MLKEMParameters) mlkemParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntruOidLookup(NTRUParameters nTRUParameters) {
        return (ASN1ObjectIdentifier) ntruOids.get(nTRUParameters);
    }

    public static NTRUParameters ntruParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRUParameters) ntruParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntrulprimeOidLookup(NTRULPRimeParameters nTRULPRimeParameters) {
        return (ASN1ObjectIdentifier) ntruprimeOids.get(nTRULPRimeParameters);
    }

    public static NTRULPRimeParameters ntrulprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRULPRimeParameters) ntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1Primitive parseData(byte[] bArr) {
        if (isRaw(bArr)) {
            return null;
        }
        byte b = bArr[0];
        if (b == 48) {
            return ASN1Sequence.getInstance(bArr);
        }
        if (b == 4) {
            return ASN1OctetString.getInstance(bArr);
        }
        if ((b & 255) == 128) {
            return ASN1OctetString.getInstance(ASN1TaggedObject.getInstance(bArr), false);
        }
        return null;
    }

    public static ASN1OctetString parseOctetData(byte[] bArr) {
        if (isRaw(bArr) || bArr[0] != 4) {
            return null;
        }
        return ASN1OctetString.getInstance(bArr);
    }

    public static ASN1ObjectIdentifier picnicOidLookup(PicnicParameters picnicParameters) {
        return (ASN1ObjectIdentifier) picnicOids.get(picnicParameters);
    }

    public static PicnicParameters picnicParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (PicnicParameters) picnicParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier rainbowOidLookup(RainbowParameters rainbowParameters) {
        return (ASN1ObjectIdentifier) rainbowOids.get(rainbowParameters);
    }

    public static RainbowParameters rainbowParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (RainbowParameters) rainbowParams.get(aSN1ObjectIdentifier);
    }

    public static int readLen(ByteArrayInputStream byteArrayInputStream) {
        int read = byteArrayInputStream.read();
        if (read < 0) {
            return -1;
        }
        int i = read & 127;
        if (read != i) {
            read = 0;
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                read = (read << 8) + byteArrayInputStream.read();
                i = i2;
            }
        }
        return read;
    }

    public static ASN1ObjectIdentifier saberOidLookup(SABERParameters sABERParameters) {
        return (ASN1ObjectIdentifier) saberOids.get(sABERParameters);
    }

    public static SABERParameters saberParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SABERParameters) saberParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier slhdsaOidLookup(SLHDSAParameters sLHDSAParameters) {
        return (ASN1ObjectIdentifier) slhdsaOids.get(sLHDSAParameters);
    }

    public static SLHDSAParameters slhdsaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SLHDSAParameters) slhdsaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier snovaOidLookup(SnovaParameters snovaParameters) {
        return (ASN1ObjectIdentifier) snovaOids.get(snovaParameters);
    }

    public static SnovaParameters snovaParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SnovaParameters) snovaParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier sntruprimeOidLookup(SNTRUPrimeParameters sNTRUPrimeParameters) {
        return (ASN1ObjectIdentifier) sntruprimeOids.get(sNTRUPrimeParameters);
    }

    public static SNTRUPrimeParameters sntruprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SNTRUPrimeParameters) sntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier sphincs256LookupTreeAlgID(String str) {
        if (str.equals("SHA3-256")) {
            return SPHINCS_SHA3_256;
        }
        if (str.equals(SPHINCSKeyParameters.SHA512_256)) {
            return SPHINCS_SHA512_256;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(str));
    }

    public static String sphincs256LookupTreeAlgName(SPHINCS256KeyParams sPHINCS256KeyParams) {
        AlgorithmIdentifier treeDigest = sPHINCS256KeyParams.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA3_256.getAlgorithm())) {
            return "SHA3-256";
        }
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA512_256.getAlgorithm())) {
            return SPHINCSKeyParameters.SHA512_256;
        }
        throw new IllegalArgumentException("unknown tree digest: " + treeDigest.getAlgorithm());
    }

    public static ASN1ObjectIdentifier sphincsPlusOidLookup(SPHINCSPlusParameters sPHINCSPlusParameters) {
        return (ASN1ObjectIdentifier) sphincsPlusOids.get(sPHINCSPlusParameters);
    }

    public static SPHINCSPlusParameters sphincsPlusParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SPHINCSPlusParameters) sphincsPlusParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier xmssLookupTreeAlgID(String str) {
        if (str.equals(XMSSKeyParameters.SHA_256)) {
            return XMSS_SHA256;
        }
        if (str.equals(XMSSKeyParameters.SHA_512)) {
            return XMSS_SHA512;
        }
        if (str.equals("SHAKE128")) {
            return XMSS_SHAKE128;
        }
        if (str.equals("SHAKE256")) {
            return XMSS_SHAKE256;
        }
        throw new IllegalArgumentException("unknown tree digest: ".concat(str));
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException(C9005.m23242("unrecognized digest OID: ", aSN1ObjectIdentifier));
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
            return "SHA-1";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha224)) {
            return "SHA-224";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return XMSSKeyParameters.SHA_256;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
            return "SHA-384";
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return XMSSKeyParameters.SHA_512;
        }
        throw new IllegalArgumentException(C9005.m23242("unrecognised digest algorithm: ", aSN1ObjectIdentifier));
    }
}
