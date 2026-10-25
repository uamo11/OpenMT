# OpenMT (`y.open.mt`)

OpenMT es una reconstrucción descompilada y libre de telemetría de MT Manager (v2.26.10), organizada con el código fuente en Java, pseudocódigo C/C++ de todas sus librerías nativas, y un proyecto reensamblable para generar el APK sin rastreadores, compatible con Android 11 hasta Android 16.

---

## 📁 Estructura del Repositorio

```
openMT/
├── src/
│   ├── java/                    # Código fuente Java completo (16,600+ clases decompiladas con JADX)
│   └── cpp/                     # Pseudocódigo C/C++ decompilado con Hex-Rays (5,280+ funciones)
│       ├── libumeng-spy/        # Lógica del tracker nativo de Umeng
│       ├── libmtprotect/        # Protector, anti-tamper y firma
│       ├── libmt1/, libmt2/, libmt3/ # Módulos centrales de MT
│       ├── libhook/             # Motor de hooking ART
│       └── libterm/             # Terminal interna
├── apk_project/                 # Proyecto Smali y recursos reensamblable con Apktool
│   ├── AndroidManifest.xml      # Manifiesto en texto fuente (paquete: y.open.mt)
│   ├── AndroidManifest_binary.xml # Manifiesto AXML binario precompilado válido para Android 16
│   ├── smali/ .. smali_classes5/# Bytecode Smali con stubs No-Op aplicados a los trackers
│   ├── lib/                     # Librerías nativas depuradas (libumeng-spy.so eliminado)
│   └── res/                     # Recursos originales protegidos
├── dist/                        # Directorio para el APK final compilado
├── .github/workflows/           # Integración continua con GitHub Actions (firma v1+v2+v3)
├── build_apk.py                 # Pipeline automatizado de compilación, inyección AXML y firma
├── patch_binary_manifest.py     # Utilidad de modificación directa del StringPool AXML binario
└── patch_trackers.py            # Script automatizado de neutralización de trackers Smali
```

---

## 🛡️ Modificaciones y Eliminación de Trackers

1. **Identificador del Paquete:**
   - Cambiado a `y.open.mt` en `AndroidManifest.xml` binario y permisos asociados.

2. **Umeng Telemetry & Native Spy:**
   - **`libumeng-spy.so`** eliminado de todas las arquitecturas (`arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64`).
   - **`com.umeng.umzid.Spy`:** Eliminada la carga de librerías nativas; `getID()` y `getNativeID()` devuelven `null`.
   - **`com.umeng.commonsdk.UMConfigure`:** Métodos `init(...)`, `preInit(...)` y `preInitInternal(...)` convertidos en No-Op (`return-void`).
   - **`com.umeng.analytics.MobclickAgent`:** Métodos de tracking de eventos y sesiones convertidos en No-Op.
   - **`AndroidManifest.xml`:** Eliminada la etiqueta `<meta-data android:name="UMENG_CHANNEL" .../>`.

3. **Compatibilidad con Android 11 a Android 16:**
   - Estructura AXML binaria válida de 32 bits generada directamente para el PackageManager moderno.
   - Alineación de 4 bytes (`zipalign`) en todos los archivos de almacenamiento.
   - Firma criptográfica completa soportando los esquemas **v1 (JAR)**, **v2 (APK Signature)** y **v3 (Android 11+)**.

---

## 🚀 Compilación Local

Para compilar y firmar el APK compatible con Android 16:

```bash
python build_apk.py
```

El script se encargará automáticamente de:
1. Reensamblar el proyecto Smali con Apktool.
2. Inyectar el `AndroidManifest.xml` binario con paquete `y.open.mt`.
3. Alinear con `zipalign` y firmar con `uber-apk-signer` (esquemas v1, v2 y v3).
4. Generar el APK verificado en `dist/openMT-y.open.mt.apk`.

---

## ⚡ Compilación Automática (GitHub Actions)

El repositorio incluye un flujo de trabajo automatizado en `.github/workflows/build-apk.yml`. Cada `push` a la rama `main` compila, firma y genera el artefacto descargable `openMT-y.open.mt-apk` automáticamente en la pestaña **Actions**.
