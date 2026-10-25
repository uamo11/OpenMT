# OpenMT (`y.open.mt`)

OpenMT es una reconstrucción descompilada y libre de telemetría de MT Manager (v2.26.10), organizada con el código fuente en Java, pseudocódigo C/C++ de todas sus librerías nativas, y un proyecto reensamblable para generar el APK sin rastreadores.

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
│   ├── AndroidManifest.xml      # Paquete: y.open.mt (sin metadatos de telemetría)
│   ├── smali/ .. smali_classes5/# Bytecode Smali con stubs No-Op aplicados a los trackers
│   ├── lib/                     # Librerías nativas depuradas (libumeng-spy.so eliminado)
│   └── res/                     # Recursos originales protegidos
├── dist/                        # Directorio para el APK final compilado
├── .github/workflows/           # Integración continua con GitHub Actions
└── patch_trackers.py            # Script automatizado de neutralización de trackers
```

---

## 🛡️ Modificaciones y Eliminación de Trackers

1. **Identificador del Paquete:**
   - Cambiado a `y.open.mt` en `AndroidManifest.xml` y permisos asociados.

2. **Umeng Telemetry & Native Spy:**
   - **`libumeng-spy.so`** eliminado de todas las arquitecturas (`arm64-v8a`, `armeabi-v7a`, `x86`, `x86_64`).
   - **`com.umeng.umzid.Spy`:** Eliminada la carga de librerías nativas; `getID()` y `getNativeID()` devuelven `null`.
   - **`com.umeng.commonsdk.UMConfigure`:** Métodos `init(...)`, `preInit(...)` y `preInitInternal(...)` convertidos en No-Op (`return-void`).
   - **`com.umeng.analytics.MobclickAgent`:** Métodos de tracking de eventos y sesiones convertidos en No-Op.
   - **`AndroidManifest.xml`:** Eliminada la etiqueta `<meta-data android:name="UMENG_CHANNEL" .../>`.

---

## 🚀 Compilación Local

Para compilar el APK localmente se requiere **Java 17 o superior** y **Apktool**:

```bash
# Compilar el proyecto con Apktool
apktool b apk_project -o dist/openMT-y.open.mt.apk

# Firmar el APK con jarsigner
keytool -genkey -v -keystore debug.keystore -storepass android -alias androiddebugkey -keypass android -keyalg RSA -keysize 2048 -validity 10000 -dname "CN=Android Debug,O=Android,C=US"
jarsigner -keystore debug.keystore -storepass android dist/openMT-y.open.mt.apk androiddebugkey
```

---

## ⚡ Compilación Automática (GitHub Actions)

El repositorio incluye un flujo de trabajo automatizado en `.github/workflows/build-apk.yml`. Cada `push` a la rama `main` compila, firma y genera el artefacto descargable `openMT-y.open.mt-apk` automáticamente en la pestaña **Actions**.
