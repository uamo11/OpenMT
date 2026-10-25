#include <jni.h>
#include <pwd.h>
#include <sys/types.h>
#include <android/log.h>
#include <dlfcn.h>
#include <stdlib.h>
#include <string.h>

#define LOG_TAG "OpenMT_Native"
#define LOGI(...) __android_log_print(ANDROID_LOG_INFO, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

static void *s_orig_handle = NULL;
typedef jobjectArray (*orig_analyze_fn)(JNIEnv *, jclass, jbyteArray);
typedef jstring (*orig_get_fn)(JNIEnv *, jclass);
typedef jstring (*orig_uid2name_fn)(JNIEnv *, jclass, jint);

static orig_analyze_fn g_orig_analyze = NULL;
static orig_get_fn g_orig_get = NULL;
static orig_uid2name_fn g_orig_uid2name = NULL;

static void init_orig() {
    if (!s_orig_handle) {
        s_orig_handle = dlopen("libFeatures_orig.so", RTLD_NOW);
        if (s_orig_handle) {
            g_orig_analyze = (orig_analyze_fn)dlsym(s_orig_handle, "Java_bin_mt_plus_Features_analyze");
            g_orig_get = (orig_get_fn)dlsym(s_orig_handle, "Java_bin_mt_plus_Features_get");
            g_orig_uid2name = (orig_uid2name_fn)dlsym(s_orig_handle, "Java_bin_mt_plus_Features_uid2name");
            LOGI("Loaded libFeatures_orig.so and resolved symbols successfully.");
        } else {
            LOGI("libFeatures_orig.so not found, using pure builtin implementation.");
        }
    }
}

extern "C" {

void exit(int status) {
    LOGE("=================================================");
    LOGE("CRITICAL INTERCEPT: C exit(%d) called from native code!", status);
    LOGE("=================================================");
}

void _exit(int status) {
    LOGE("=================================================");
    LOGE("CRITICAL INTERCEPT: C _exit(%d) called from native code!", status);
    LOGE("=================================================");
}

JNIEXPORT jstring JNICALL
Java_bin_mt_plus_Features_get(JNIEnv *env, jclass clazz) {
    LOGI("[OpenMT C/C++] Features.get() called!");
    init_orig();
    if (g_orig_get) {
        return g_orig_get(env, clazz);
    }
    return env->NewStringUTF("4");
}

JNIEXPORT jstring JNICALL
Java_bin_mt_plus_Features_uid2name(JNIEnv *env, jclass clazz, jint uid) {
    LOGI("[OpenMT C/C++] Features.uid2name(uid=%d) called!", uid);
    struct passwd *pw = getpwuid((uid_t)uid);
    if (pw && pw->pw_name) {
        return env->NewStringUTF(pw->pw_name);
    }
    init_orig();
    if (g_orig_uid2name) {
        return g_orig_uid2name(env, clazz, uid);
    }
    return NULL;
}

JNIEXPORT jobjectArray JNICALL
Java_bin_mt_plus_Features_analyze(JNIEnv *env, jclass clazz, jbyteArray data) {
    LOGI("[OpenMT C/C++] Features.analyze() called!");
    init_orig();
    if (g_orig_analyze) {
        return g_orig_analyze(env, clazz, data);
    }
    jclass objClass = env->FindClass("java/lang/Object");
    return env->NewObjectArray(2, objClass, NULL);
}

JNIEXPORT jint JNI_OnLoad(JavaVM *vm, void *reserved) {
    LOGI("=================================================");
    LOGI("   OpenMT 0.1 C/C++ Native Engine Loaded!       ");
    LOGI("   Compiled with Android NDK r27c Clang         ");
    LOGI("=================================================");
    init_orig();
    return JNI_VERSION_1_6;
}

}
