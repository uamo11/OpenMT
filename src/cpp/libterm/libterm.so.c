/* Decompiled from: libterm.so */
/* Target Architecture: ARM64 */

#include <stdint.h>
#include <stdbool.h>

// Address: 0x12B8 | Function: sub_12B8
__int64 sub_12B8()
{
  return __cxa_finalize(&off_5F20);
}


// Address: 0x12C8 | Function: sub_12C8
void sub_12C8()
{
  ;
}


// Address: 0x12D0 | Function: sub_12D0
void sub_12D0()
{
  sub_12C8();
}


// Address: 0x12D8 | Function: sub_12D8
__int64 (*__fastcall sub_12D8(__int64 (*result)(void)))(void)
{
  if ( result != nullptr )
    return (__int64 (*)(void))result();
  return result;
}


// Address: 0x12EC | Function: sub_12EC
__int64 __fastcall sub_12EC(void *obj)
{
  return __cxa_atexit((void (*)(void *))sub_12D8, obj, &off_5F20);
}


// Address: 0x1308 | Function: Java_bin_mt_term_Exec_createSubprocess
__int64 __fastcall Java_bin_mt_term_Exec_createSubprocess(
        __int64 *a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7)
{
  unsigned int v13; // w0
  unsigned int v14; // w27
  char **v15; // x0
  char **v16; // x19
  __int64 v17; // x26
  __int64 v18; // x21
  __int64 v19; // x27
  const char *v20; // x0
  const char *v21; // x28
  char *v22; // x0
  __int64 v23; // x8
  int v24; // w0
  unsigned int v25; // w27
  char **v26; // x0
  char **v27; // x22
  __int64 v28; // x26
  __int64 v29; // x21
  __int64 v30; // x27
  const char *v31; // x0
  const char *v32; // x28
  char *v33; // x0
  __int64 v34; // x8
  const char *v35; // x25
  const char *v36; // x24
  int v37; // w0
  unsigned int v38; // w26
  __int64 v39; // x0
  __int64 v40; // x8
  __int64 v41; // x1
  const char *v42; // x2
  __int64 v43; // x0
  __pid_t v44; // w27
  char *v45; // x0
  __int64 v46; // x23
  char **v47; // x21
  char *v48; // t1
  char *v49; // x0
  void **v50; // x19
  char *v51; // t1
  __pid_t *v52; // x0
  __int64 v53; // x0
  __int64 v54; // x8
  __int64 v55; // x1
  const char *v56; // x2
  __int64 v57; // x0
  __int64 v58; // x0
  __int64 v59; // x8
  __int64 v60; // x1
  const char *v61; // x2
  __int64 v62; // x0
  __int64 v63; // x0
  __pid_t v65; // w0
  int v66; // w0
  int v67; // w20
  DIR *v68; // x0
  DIR *v69; // x20
  int v70; // w21
  struct dirent *v71; // x0
  int v72; // w0
  __int64 v73; // x0
  char *v74; // x0
  char **v75; // x20
  char *v76; // t1
  char *v77; // x0
  __int64 v78; // [xsp+0h] [xbp-90h]
  __int64 v79; // [xsp+0h] [xbp-90h]
  char *ptr; // [xsp+10h] [xbp-80h] BYREF
  sigset_t set; // [xsp+18h] [xbp-78h] BYREF

  set.__val[14] = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  if ( a5 != 0 && (int)(v13 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1368))(a1, a5)) >= 1 )
  {
    v14 = v13;
    v15 = (char **)malloc(8LL * (v13 + 1));
    if ( v15 == nullptr )
    {
      v57 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
      v54 = *a1;
      v55 = v57;
      v56 = "Couldn't allocate argv array";
      goto LABEL_40;
    }
    v16 = v15;
    v78 = a7;
    v17 = 0;
    v18 = v14;
    do
    {
      v19 = (*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1384))(a1, a5, (unsigned int)v17);
      v20 = (const char *)(*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1352))(a1, v19, 0);
      if ( v20 == nullptr )
      {
        v58 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
        v59 = *a1;
        v60 = v58;
        v61 = "Couldn't get argument from array";
        goto LABEL_42;
      }
      v21 = v20;
      v22 = strdup(v20);
      v23 = *a1;
      v16[v17] = v22;
      (*(void (__fastcall **)(__int64 *, __int64, const char *))(v23 + 1360))(a1, v19, v21);
      ++v17;
    }
    while ( v18 != v17 );
    v16[v18] = nullptr;
    a7 = v78;
    if ( a6 != 0 )
      goto LABEL_10;
  }
  else
  {
    v16 = nullptr;
    if ( a6 != 0 )
    {
LABEL_10:
      v24 = (*(__int64 (__fastcall **)(__int64 *, __int64))(*a1 + 1368))(a1, a6);
      if ( v24 >= 1 )
      {
        v25 = v24;
        v26 = (char **)malloc(8LL * (unsigned int)(v24 + 1));
        if ( v26 != nullptr )
        {
          v27 = v26;
          v79 = a7;
          v28 = 0;
          v29 = v25;
          while ( 1 )
          {
            v30 = (*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1384))(a1, a6, (unsigned int)v28);
            v31 = (const char *)(*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1352))(a1, v30, 0);
            if ( v31 == nullptr )
              break;
            v32 = v31;
            v33 = strdup(v31);
            v34 = *a1;
            v27[v28] = v33;
            (*(void (__fastcall **)(__int64 *, __int64, const char *))(v34 + 1360))(a1, v30, v32);
            if ( v29 == ++v28 )
            {
              v27[v29] = nullptr;
              a7 = v79;
              goto LABEL_17;
            }
          }
          v63 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
          v59 = *a1;
          v60 = v63;
          v61 = "Couldn't get env var from array";
LABEL_42:
          (*(void (__fastcall **)(__int64 *, __int64, const char *))(v59 + 112))(a1, v60, v61);
          return (unsigned int)-1;
        }
        v62 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
        v54 = *a1;
        v55 = v62;
        v56 = "Couldn't allocate envp array";
LABEL_40:
        (*(void (__fastcall **)(__int64 *, __int64, const char *))(v54 + 112))(a1, v55, v56);
        return (unsigned int)-1;
      }
    }
  }
  v27 = nullptr;
LABEL_17:
  v35 = (const char *)(*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1352))(a1, a4, 0);
  v36 = (const char *)(*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1352))(a1, a3, 0);
  v37 = __open_2("/dev/ptmx", 524290);
  if ( v37 < 0 )
  {
    v43 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
    v40 = *a1;
    v41 = v43;
    v42 = "trouble with /dev/ptmx";
    goto LABEL_23;
  }
  v38 = v37;
  if ( grantpt(v37) != 0 || unlockpt(v38) != 0 || ptsname_r(v38, (char *)&set.__val[6], 0x40u) != 0 )
  {
    v39 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
    v40 = *a1;
    v41 = v39;
    v42 = "ptsname_r returned error";
LABEL_23:
    (*(void (__fastcall **)(__int64 *, __int64, const char *))(v40 + 112))(a1, v41, v42);
    v44 = 0;
    v38 = -1;
    goto LABEL_24;
  }
  ioctl(v38, 0x5401u, (char *)&set.__val[1] + 4);
  HIDWORD(set.__val[1]) = HIDWORD(set.__val[1]) & 0xFFFFABFF | 0x4000;
  ioctl(v38, 0x5402u, (char *)&set.__val[1] + 4);
  v65 = fork();
  if ( v65 < 0 )
  {
    v73 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
    v40 = *a1;
    v41 = v73;
    v42 = "fork failed";
    goto LABEL_23;
  }
  v44 = v65;
  if ( v65 == 0 )
  {
    sigfillset(&set);
    sigprocmask(1, &set, nullptr);
    close(v38);
    setsid();
    v66 = __open_2(&set.__val[6], 2);
    if ( (v66 & 0x80000000) == 0 )
    {
      v67 = v66;
      dup2(v66, 0);
      dup2(v67, 1);
      dup2(v67, 2);
      v68 = opendir("/proc/self/fd");
      if ( v68 != nullptr )
      {
        v69 = v68;
        v70 = dirfd(v68);
        while ( 1 )
        {
          v71 = readdir(v69);
          if ( v71 == nullptr )
            break;
          v72 = atoi(v71->d_name);
          if ( v72 >= 3 && v72 != v70 )
            close(v72);
        }
        closedir(v69);
      }
      clearenv();
      if ( v27 != nullptr )
      {
        v74 = *v27;
        if ( *v27 != nullptr )
        {
          v75 = v27 + 1;
          do
          {
            putenv(v74);
            v76 = *v75++;
            v74 = v76;
          }
          while ( v76 != nullptr );
        }
      }
      if ( *v35 != 0 && chdir(v35) != 0 )
      {
        if ( asprintf(&ptr, "chdir(\"%s\")", v35) == -1 )
        {
          v77 = "chdir()";
          ptr = "chdir()";
        }
        else
        {
          v77 = ptr;
        }
        perror(v77);
        fflush((FILE *)((char *)&_sF + 304));
      }
      execvp(v36, v16);
      asprintf(&ptr, "exec(\"%s\")", v36);
      perror(ptr);
      _exit(1);
    }
    exit(-1);
  }
LABEL_24:
  (*(void (__fastcall **)(__int64 *, __int64, const char *))(*a1 + 1360))(a1, a3, v36);
  (*(void (__fastcall **)(__int64 *, __int64, const char *))(*a1 + 1360))(a1, a3, v35);
  if ( v16 != nullptr )
  {
    v45 = *v16;
    v46 = a7;
    if ( *v16 != nullptr )
    {
      v47 = v16 + 1;
      do
      {
        free(v45);
        v48 = *v47++;
        v45 = v48;
      }
      while ( v48 != nullptr );
    }
    free(v16);
    a7 = v46;
  }
  if ( v27 != nullptr )
  {
    v49 = *v27;
    if ( *v27 != nullptr )
    {
      v50 = (void **)(v27 + 1);
      do
      {
        free(v49);
        v51 = (char *)*v50++;
        v49 = v51;
      }
      while ( v51 != nullptr );
    }
    free(v27);
  }
  v52 = (__pid_t *)(*(__int64 (__fastcall **)(__int64 *, __int64, _QWORD))(*a1 + 1776))(a1, a7, 0);
  if ( v52 == nullptr )
  {
    v53 = (*(__int64 (__fastcall **)(__int64 *, const char *))(*a1 + 48))(a1, "java/lang/RuntimeException");
    v54 = *a1;
    v55 = v53;
    v56 = "JNI call GetPrimitiveArrayCritical(processIdArray, &isCopy) failed";
    goto LABEL_40;
  }
  *v52 = v44;
  (*(void (__fastcall **)(__int64 *, __int64, __pid_t *, _QWORD))(*a1 + 1784))(a1, a7, v52, 0);
  return v38;
}


// Address: 0x1984 | Function: Java_bin_mt_term_Exec_setPtyWindowSize
__int64 __fastcall Java_bin_mt_term_Exec_setPtyWindowSize(int a1, int a2, int fd, __int16 a4, __int16 a5)
{
  _WORD v6[2]; // [xsp+0h] [xbp-10h] BYREF
  int v7; // [xsp+4h] [xbp-Ch]
  __int64 v8; // [xsp+8h] [xbp-8h]

  v8 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  v6[0] = a4;
  v6[1] = a5;
  v7 = 0;
  return ioctl(fd, 0x5414u, v6);
}


// Address: 0x19E0 | Function: Java_bin_mt_term_Exec_waitFor
__int64 __fastcall Java_bin_mt_term_Exec_waitFor(int a1, int a2, __pid_t pid)
{
  int stat_loc; // [xsp+4h] [xbp-Ch] BYREF
  __int64 v5; // [xsp+8h] [xbp-8h]

  v5 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  waitpid(pid, &stat_loc, 0);
  if ( (stat_loc & 0x7F) == 0 )
    return BYTE1(stat_loc);
  if ( (((_BYTE)stat_loc + 1) & 0x7E) != 0 )
    return -(stat_loc & 0x7F);
  return 0;
}


// Address: 0x1A50 | Function: Java_bin_mt_term_Exec_close
__int64 __fastcall Java_bin_mt_term_Exec_close(int a1, int a2, int fd)
{
  return close(fd);
}


// Address: 0x1A58 | Function: sub_1A58
DIR *__fastcall sub_1A58(int a1)
{
  DIR *result; // x0
  DIR *v3; // x20
  struct dirent *i; // x0
  int v5; // w0
  unsigned int v6; // w23
  FILE *v7; // x0
  FILE *v8; // x24
  char *v9; // x0
  _BOOL4 v10; // w8
  char s[256]; // [xsp+8h] [xbp-1108h] BYREF
  char filename[4096]; // [xsp+108h] [xbp-1008h] BYREF
  __int64 v13; // [xsp+1108h] [xbp-8h]

  v13 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  result = opendir("/proc");
  if ( result != nullptr )
  {
    v3 = result;
    for ( i = readdir(result); i != nullptr; i = readdir(v3) )
    {
      v5 = atoi(i->d_name);
      if ( v5 >= 1 )
      {
        v6 = v5;
        sub_1BCC(filename);
        v7 = fopen(filename, "r");
        if ( v7 != nullptr )
        {
          v8 = v7;
          if ( fgets(s, 256, v7) != nullptr && strtok(s, " ") != nullptr )
          {
            v9 = strtok(nullptr, " ");
            v10 = v9 != nullptr;
            if ( v9 != nullptr )
            {
              v9 = strtok(nullptr, " ");
              v10 = v9 != nullptr;
              if ( v9 != nullptr )
              {
                v9 = strtok(nullptr, " ");
                v10 = v9 != nullptr;
              }
            }
            if ( v10 && atoi(v9) == a1 )
            {
              sub_1A58(v6);
              kill(v6, 9);
            }
          }
          fclose(v8);
        }
      }
    }
    return (DIR *)closedir(v3);
  }
  return result;
}


// Address: 0x1BCC | Function: sub_1BCC
__int64 sub_1BCC(char *a1, __int64 a2, __int64 a3, __int64 a4, ...)
{
  gcc_va_list arg; // [xsp+A0h] [xbp-50h] BYREF
  gcc_va_list va; // [xsp+C8h] [xbp-28h] BYREF
  __int64 v7; // [xsp+E8h] [xbp-8h]

  va_start(va, a4);
  v7 = *(_QWORD *)(_ReadStatusReg(TPIDR_EL0) + 40);
  va_copy(arg, va);
  return vsnprintf(a1, 0x1000u, "/proc/%d/stat", arg);
}


// Address: 0x1C68 | Function: Java_bin_mt_term_Exec_killAll
__int64 __fastcall Java_bin_mt_term_Exec_killAll(__int64 a1, __int64 a2, int a3)
{
  sub_1A58(a3);
  return kill(a3, 9);
}


// Address: 0x1CA0 | Function: sub_1CA0
void sub_1CA0()
{
  JUMPOUT(0);
}


// Address: 0x1CC0 | Function: .__cxa_finalize
// attributes: thunk
int __cxa_finalize(void *a1)
{
  return _cxa_finalize(a1);
}


// Address: 0x1CD0 | Function: .__cxa_atexit
// attributes: thunk
int __cxa_atexit(void (*lpfunc)(void *), void *obj, void *lpdso_handle)
{
  return _cxa_atexit(lpfunc, obj, lpdso_handle);
}


// Address: 0x1CE0 | Function: .malloc
// attributes: thunk
void *malloc(size_t size)
{
  return malloc(size);
}


// Address: 0x1CF0 | Function: .strdup
// attributes: thunk
char *strdup(const char *s)
{
  return strdup(s);
}


// Address: 0x1D00 | Function: .__open_2
// attributes: thunk
__int64 __fastcall __open_2()
{
  return _open_2();
}


// Address: 0x1D10 | Function: .grantpt
// attributes: thunk
int grantpt(int fd)
{
  return grantpt(fd);
}


// Address: 0x1D20 | Function: .unlockpt
// attributes: thunk
int unlockpt(int fd)
{
  return unlockpt(fd);
}


// Address: 0x1D30 | Function: .ptsname_r
// attributes: thunk
int ptsname_r(int fd, char *buf, size_t buflen)
{
  return ptsname_r(fd, buf, buflen);
}


// Address: 0x1D40 | Function: .free
// attributes: thunk
void free(void *ptr)
{
  free(ptr);
}


// Address: 0x1D50 | Function: .ioctl
// attributes: thunk
int ioctl(int fd, unsigned __int64 request, ...)
{
  return ioctl(fd, request);
}


// Address: 0x1D60 | Function: .fork
// attributes: thunk
__pid_t fork(void)
{
  return fork();
}


// Address: 0x1D70 | Function: .sigfillset
// attributes: thunk
int sigfillset(sigset_t *set)
{
  return sigfillset(set);
}


// Address: 0x1D80 | Function: .sigprocmask
// attributes: thunk
int sigprocmask(int how, const sigset_t *set, sigset_t *oset)
{
  return sigprocmask(how, set, oset);
}


// Address: 0x1D90 | Function: .close
// attributes: thunk
int close(int fd)
{
  return close(fd);
}


// Address: 0x1DA0 | Function: .setsid
// attributes: thunk
__pid_t setsid(void)
{
  return setsid();
}


// Address: 0x1DB0 | Function: .dup2
// attributes: thunk
int dup2(int fd, int fd2)
{
  return dup2(fd, fd2);
}


// Address: 0x1DC0 | Function: .opendir
// attributes: thunk
DIR *opendir(const char *name)
{
  return opendir(name);
}


// Address: 0x1DD0 | Function: .dirfd
// attributes: thunk
int dirfd(DIR *dirp)
{
  return dirfd(dirp);
}


// Address: 0x1DE0 | Function: .readdir
// attributes: thunk
struct dirent *readdir(DIR *dirp)
{
  return readdir(dirp);
}


// Address: 0x1DF0 | Function: .atoi
// attributes: thunk
int atoi(const char *nptr)
{
  return atoi(nptr);
}


// Address: 0x1E00 | Function: .closedir
// attributes: thunk
int closedir(DIR *dirp)
{
  return closedir(dirp);
}


// Address: 0x1E10 | Function: .clearenv
// attributes: thunk
int clearenv(void)
{
  return clearenv();
}


// Address: 0x1E20 | Function: .putenv
// attributes: thunk
int putenv(char *string)
{
  return putenv(string);
}


// Address: 0x1E30 | Function: .chdir
// attributes: thunk
int chdir(const char *path)
{
  return chdir(path);
}


// Address: 0x1E40 | Function: .asprintf
// attributes: thunk
int asprintf(char **ptr, const char *fmt, ...)
{
  return asprintf(ptr, fmt);
}


// Address: 0x1E50 | Function: .perror
// attributes: thunk
void perror(const char *s)
{
  perror(s);
}


// Address: 0x1E60 | Function: .fflush
// attributes: thunk
int fflush(FILE *stream)
{
  return fflush(stream);
}


// Address: 0x1E70 | Function: .execvp
// attributes: thunk
int execvp(const char *file, char *const argv[])
{
  return execvp(file, argv);
}


// Address: 0x1E80 | Function: ._exit
// attributes: thunk
void __noreturn _exit(int status)
{
  exit(status);
}


// Address: 0x1E90 | Function: .exit
// attributes: thunk
void __noreturn exit(int status)
{
  exit(status);
}


// Address: 0x1EA0 | Function: .__stack_chk_fail
// attributes: thunk
void __noreturn __stack_chk_fail()
{
  _stack_chk_fail();
}


// Address: 0x1EB0 | Function: .waitpid
// attributes: thunk
__pid_t waitpid(__pid_t pid, int *stat_loc, int options)
{
  return waitpid(pid, stat_loc, options);
}


// Address: 0x1EC0 | Function: .fclose
// attributes: thunk
int fclose(FILE *stream)
{
  return fclose(stream);
}


// Address: 0x1ED0 | Function: .fopen
// attributes: thunk
FILE *fopen(const char *filename, const char *modes)
{
  return fopen(filename, modes);
}


// Address: 0x1EE0 | Function: .fgets
// attributes: thunk
char *fgets(char *s, int n, FILE *stream)
{
  return fgets(s, n, stream);
}


// Address: 0x1EF0 | Function: .strtok
// attributes: thunk
char *strtok(char *s, const char *delim)
{
  return strtok(s, delim);
}


// Address: 0x1F00 | Function: .kill
// attributes: thunk
int kill(__pid_t pid, int sig)
{
  return kill(pid, sig);
}


// Address: 0x1F10 | Function: .vsnprintf
// attributes: thunk
int vsnprintf(char *s, size_t maxlen, const char *format, __gnuc_va_list arg)
{
  return vsnprintf(s, maxlen, format, arg);
}


