package org.bouncycastle.crypto.generators;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Vector;
import l.C13325;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.constraints.ConstraintUtils;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.NaccacheSternKeyGenerationParameters;
import org.bouncycastle.crypto.params.NaccacheSternKeyParameters;
import org.bouncycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.bouncycastle.math.Primes;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes.dex */
public class NaccacheSternKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    public NaccacheSternKeyGenerationParameters param;
    public static int[] smallPrimes = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, IShizukuService.Stub.TRANSACTION_dispatchPackageChanged, IShizukuService.Stub.TRANSACTION_updateFlagsForUid, 109, UMErrorCode.E_UM_BE_RAW_OVERSIZE, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, Primes.SMALL_FACTOR_LIMIT, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557};
    public static final BigInteger ONE = BigInteger.valueOf(1);

    public static Vector findFirstPrimes(int i) {
        Vector vector = new Vector(i);
        for (int i2 = 0; i2 != i; i2++) {
            vector.addElement(BigInteger.valueOf(smallPrimes[i2]));
        }
        return vector;
    }

    public static BigInteger generatePrime(int i, int i2, SecureRandom secureRandom) {
        BigInteger createRandomPrime;
        do {
            createRandomPrime = BigIntegers.createRandomPrime(i, i2, secureRandom);
        } while (createRandomPrime.bitLength() != i);
        return createRandomPrime;
    }

    public static int getInt(SecureRandom secureRandom, int i) {
        int nextInt;
        int i2;
        if (((-i) & i) == i) {
            return (int) ((i * (secureRandom.nextInt() & Integer.MAX_VALUE)) >> 31);
        }
        do {
            nextInt = secureRandom.nextInt() & Integer.MAX_VALUE;
            i2 = nextInt % i;
        } while ((i - 1) + (nextInt - i2) < 0);
        return i2;
    }

    public static Vector permuteList(Vector vector, SecureRandom secureRandom) {
        Vector vector2 = new Vector();
        Vector vector3 = new Vector();
        for (int i = 0; i < vector.size(); i++) {
            vector3.addElement(vector.elementAt(i));
        }
        vector2.addElement(vector3.elementAt(0));
        while (true) {
            vector3.removeElementAt(0);
            if (vector3.size() == 0) {
                return vector2;
            }
            vector2.insertElementAt(vector3.elementAt(0), getInt(secureRandom, vector2.size() + 1));
        }
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.param = (NaccacheSternKeyGenerationParameters) keyGenerationParameters;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties("NaccacheStern KeyGen", ConstraintUtils.bitsOfSecurityForFF(keyGenerationParameters.getStrength()), keyGenerationParameters, CryptoServicePurpose.KEYGEN));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        BigInteger generatePrime;
        BigInteger add;
        BigInteger generatePrime2;
        BigInteger bigInteger;
        BigInteger bigInteger2;
        BigInteger add2;
        BigInteger bigInteger3;
        BigInteger multiply;
        BigInteger bigInteger4;
        BigInteger bigInteger5;
        BigInteger bigInteger6;
        BigInteger bigInteger7;
        BigInteger bigInteger8;
        int i;
        BigInteger bigInteger9;
        BigInteger bigInteger10;
        int i2;
        BigInteger bigInteger11;
        BigInteger bigInteger12;
        BigInteger bigInteger13;
        PrintStream printStream;
        StringBuilder sb;
        PrintStream printStream2;
        StringBuilder sb2;
        long j;
        BigInteger createRandomPrime;
        SecureRandom secureRandom;
        SecureRandom secureRandom2;
        int i3;
        BigInteger bigInteger14;
        BigInteger bigInteger15;
        int i4;
        int strength = this.param.getStrength();
        SecureRandom random = this.param.getRandom();
        int certainty = this.param.getCertainty();
        boolean isDebug = this.param.isDebug();
        if (isDebug) {
            System.out.println("Fetching first " + this.param.getCntSmallPrimes() + " primes.");
        }
        Vector permuteList = permuteList(findFirstPrimes(this.param.getCntSmallPrimes()), random);
        BigInteger bigInteger16 = ONE;
        BigInteger bigInteger17 = bigInteger16;
        for (int i5 = 0; i5 < permuteList.size() / 2; i5++) {
            bigInteger17 = bigInteger17.multiply((BigInteger) permuteList.elementAt(i5));
        }
        for (int size = permuteList.size() / 2; size < permuteList.size(); size++) {
            bigInteger16 = bigInteger16.multiply((BigInteger) permuteList.elementAt(size));
        }
        BigInteger multiply2 = bigInteger17.multiply(bigInteger16);
        int bitLength = (((strength - multiply2.bitLength()) - 48) / 2) + 1;
        BigInteger generatePrime3 = generatePrime(bitLength, certainty, random);
        BigInteger generatePrime4 = generatePrime(bitLength, certainty, random);
        if (isDebug) {
            System.out.println("generating p and q");
        }
        BigInteger shiftLeft = generatePrime3.multiply(bigInteger17).shiftLeft(1);
        BigInteger shiftLeft2 = generatePrime4.multiply(bigInteger16).shiftLeft(1);
        long j2 = 0;
        while (true) {
            j2++;
            generatePrime = generatePrime(24, certainty, random);
            add = generatePrime.multiply(shiftLeft).add(ONE);
            if (add.isProbablePrime(certainty)) {
                while (true) {
                    do {
                        generatePrime2 = generatePrime(24, certainty, random);
                    } while (generatePrime.equals(generatePrime2));
                    BigInteger multiply3 = generatePrime2.multiply(shiftLeft2);
                    bigInteger = shiftLeft2;
                    bigInteger2 = ONE;
                    add2 = multiply3.add(bigInteger2);
                    if (add2.isProbablePrime(certainty)) {
                        break;
                    }
                    shiftLeft2 = bigInteger;
                    generatePrime4 = generatePrime4;
                    strength = strength;
                }
                bigInteger3 = shiftLeft;
                if (BigIntegers.modOddIsCoprime(generatePrime.multiply(generatePrime2), multiply2)) {
                    multiply = add.multiply(add2);
                    bigInteger4 = generatePrime4;
                    if (multiply.bitLength() >= strength) {
                        break;
                    }
                    int i6 = strength;
                    secureRandom2 = random;
                    i3 = certainty;
                    bigInteger14 = generatePrime3;
                    bigInteger15 = bigInteger4;
                    if (isDebug) {
                        PrintStream printStream3 = System.out;
                        i4 = i6;
                        StringBuilder m32308 = C13325.m32308(i4, "key size too small. Should be ", " but is actually ");
                        m32308.append(add.multiply(add2).bitLength());
                        printStream3.println(m32308.toString());
                    } else {
                        i4 = i6;
                    }
                    generatePrime3 = bigInteger14;
                    shiftLeft2 = bigInteger;
                    shiftLeft = bigInteger3;
                    random = secureRandom2;
                    certainty = i3;
                    int i7 = i4;
                    generatePrime4 = bigInteger15;
                    strength = i7;
                } else {
                    secureRandom2 = random;
                    i3 = certainty;
                }
            } else {
                secureRandom2 = random;
                i3 = certainty;
                bigInteger = shiftLeft2;
                bigInteger3 = shiftLeft;
            }
            bigInteger14 = generatePrime3;
            BigInteger bigInteger18 = generatePrime4;
            i4 = strength;
            bigInteger15 = bigInteger18;
            generatePrime3 = bigInteger14;
            shiftLeft2 = bigInteger;
            shiftLeft = bigInteger3;
            random = secureRandom2;
            certainty = i3;
            int i72 = i4;
            generatePrime4 = bigInteger15;
            strength = i72;
        }
        if (isDebug) {
            bigInteger6 = generatePrime3;
            bigInteger5 = generatePrime2;
            System.out.println("needed " + j2 + " tries to generate p and q.");
        } else {
            bigInteger5 = generatePrime2;
            bigInteger6 = generatePrime3;
        }
        BigInteger multiply4 = add.subtract(bigInteger2).multiply(add2.subtract(bigInteger2));
        if (isDebug) {
            System.out.println("generating g");
        }
        long j3 = 0;
        while (true) {
            Vector vector = new Vector();
            int i8 = 0;
            bigInteger7 = add2;
            while (i8 != permuteList.size()) {
                BigInteger divide = multiply4.divide((BigInteger) permuteList.elementAt(i8));
                while (true) {
                    j = j3 + 1;
                    createRandomPrime = BigIntegers.createRandomPrime(strength, certainty, random);
                    secureRandom = random;
                    if (createRandomPrime.modPow(divide, multiply).equals(ONE)) {
                        j3 = j;
                        random = secureRandom;
                    }
                }
                vector.addElement(createRandomPrime);
                i8++;
                j3 = j;
                random = secureRandom;
            }
            SecureRandom secureRandom3 = random;
            bigInteger8 = ONE;
            int i9 = 0;
            while (i9 < permuteList.size()) {
                bigInteger8 = bigInteger8.multiply(((BigInteger) vector.elementAt(i9)).modPow(multiply2.divide((BigInteger) permuteList.elementAt(i9)), multiply)).mod(multiply);
                i9++;
                vector = vector;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= permuteList.size()) {
                    i = certainty;
                    BigInteger modPow = bigInteger8.modPow(multiply4.divide(BigInteger.valueOf(4L)), multiply);
                    BigInteger bigInteger19 = ONE;
                    if (!modPow.equals(bigInteger19)) {
                        if (!bigInteger8.modPow(multiply4.divide(generatePrime), multiply).equals(bigInteger19)) {
                            bigInteger9 = bigInteger5;
                            if (!bigInteger8.modPow(multiply4.divide(bigInteger9), multiply).equals(bigInteger19)) {
                                bigInteger10 = bigInteger6;
                                if (!bigInteger8.modPow(multiply4.divide(bigInteger10), multiply).equals(bigInteger19)) {
                                    i2 = strength;
                                    bigInteger11 = bigInteger4;
                                    if (!bigInteger8.modPow(multiply4.divide(bigInteger11), multiply).equals(bigInteger19)) {
                                        break;
                                    }
                                    if (isDebug) {
                                        bigInteger13 = multiply4;
                                        System.out.println("g has order phi(n)/b\n g: " + bigInteger8);
                                    } else {
                                        bigInteger13 = multiply4;
                                    }
                                } else {
                                    if (isDebug) {
                                        i2 = strength;
                                        System.out.println("g has order phi(n)/a\n g: " + bigInteger8);
                                    } else {
                                        i2 = strength;
                                    }
                                    bigInteger13 = multiply4;
                                }
                            } else if (isDebug) {
                                printStream = System.out;
                                sb = new StringBuilder("g has order phi(n)/q'\n g: ");
                                sb.append(bigInteger8);
                                printStream.println(sb.toString());
                            }
                        } else if (isDebug) {
                            printStream2 = System.out;
                            sb2 = new StringBuilder("g has order phi(n)/p'\n g: ");
                            sb = sb2;
                            printStream = printStream2;
                            bigInteger9 = bigInteger5;
                            sb.append(bigInteger8);
                            printStream.println(sb.toString());
                        }
                    } else if (isDebug) {
                        printStream2 = System.out;
                        sb2 = new StringBuilder("g has order phi(n)/4\n g:");
                        sb = sb2;
                        printStream = printStream2;
                        bigInteger9 = bigInteger5;
                        sb.append(bigInteger8);
                        printStream.println(sb.toString());
                    }
                } else if (!bigInteger8.modPow(multiply4.divide((BigInteger) permuteList.elementAt(i10)), multiply).equals(ONE)) {
                    i10++;
                } else if (isDebug) {
                    i = certainty;
                    System.out.println("g has order phi(n)/" + permuteList.elementAt(i10) + "\n g: " + bigInteger8);
                } else {
                    i = certainty;
                }
            }
            bigInteger9 = bigInteger5;
            bigInteger13 = multiply4;
            bigInteger10 = bigInteger6;
            i2 = strength;
            bigInteger11 = bigInteger4;
            bigInteger5 = bigInteger9;
            bigInteger4 = bigInteger11;
            multiply4 = bigInteger13;
            strength = i2;
            add2 = bigInteger7;
            random = secureRandom3;
            certainty = i;
            bigInteger6 = bigInteger10;
        }
        BigInteger bigInteger20 = multiply4;
        if (isDebug) {
            System.out.println("needed " + j3 + " tries to generate g");
            System.out.println();
            System.out.println("found new NaccacheStern cipher variables:");
            System.out.println("smallPrimes: " + permuteList);
            System.out.println("sigma:...... " + multiply2 + " (" + multiply2.bitLength() + " bits)");
            PrintStream printStream4 = System.out;
            StringBuilder sb3 = new StringBuilder("a:.......... ");
            sb3.append(bigInteger10);
            printStream4.println(sb3.toString());
            System.out.println("b:.......... " + bigInteger11);
            System.out.println("p':......... " + generatePrime);
            System.out.println("q':......... " + bigInteger9);
            System.out.println("p:.......... " + add);
            System.out.println("q:.......... " + bigInteger7);
            System.out.println("n:.......... " + multiply);
            PrintStream printStream5 = System.out;
            StringBuilder sb4 = new StringBuilder("phi(n):..... ");
            bigInteger12 = bigInteger20;
            sb4.append(bigInteger12);
            printStream5.println(sb4.toString());
            System.out.println("g:.......... " + bigInteger8);
            System.out.println();
        } else {
            bigInteger12 = bigInteger20;
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) new NaccacheSternKeyParameters(false, bigInteger8, multiply, multiply2.bitLength()), (AsymmetricKeyParameter) new NaccacheSternPrivateKeyParameters(bigInteger8, multiply, multiply2.bitLength(), permuteList, bigInteger12));
    }
}
