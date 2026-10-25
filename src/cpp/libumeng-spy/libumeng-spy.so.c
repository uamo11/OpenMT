/* Decompiled from: libumeng-spy.so */
/* Target Architecture: ARM64 */

#include <stdint.h>
#include <stdbool.h>

// Address: 0x6DC0 | Function: sub_6DC0
void sub_6DC0()
{
  JUMPOUT(0);
}


// Address: 0x6DE0 | Function: .sleep
// attributes: thunk
unsigned int sleep(unsigned int seconds)
{
  return sleep(seconds);
}


// Address: 0x6DF0 | Function: ._ZNSt15__exception_ptr13exception_ptr9_M_addrefEv
// attributes: thunk
__int64 __fastcall std::__exception_ptr::exception_ptr::_M_addref(std::__exception_ptr::exception_ptr *this)
{
  return _ZNSt15__exception_ptr13exception_ptr9_M_addrefEv(this);
}


// Address: 0x6E00 | Function: .pipe
// attributes: thunk
int pipe(int pipedes[2])
{
  return pipe(pipedes);
}


// Address: 0x6E10 | Function: .__cxa_get_globals_fast
// attributes: thunk
__int64 __cxa_get_globals_fast()
{
  return _cxa_get_globals_fast();
}


// Address: 0x6E20 | Function: .__cxa_throw
// attributes: thunk
void __noreturn __cxa_throw(void *a1, struct type_info *lptinfo, void (*a3)(void *))
{
  _cxa_throw(a1, lptinfo, a3);
}


// Address: 0x6E30 | Function: .realloc
// attributes: thunk
void *realloc(void *ptr, size_t size)
{
  return realloc(ptr, size);
}


// Address: 0x6E40 | Function: .__google_potentially_blocking_region_begin
// attributes: thunk
__int64 __google_potentially_blocking_region_begin()
{
  return _google_potentially_blocking_region_begin();
}


// Address: 0x6E50 | Function: .pthread_key_create
// attributes: thunk
int pthread_key_create(pthread_key_t *key, void (*destr_function)(void *))
{
  return pthread_key_create(key, destr_function);
}


// Address: 0x6E60 | Function: .printf
// attributes: thunk
int printf(const char *format, ...)
{
  return printf(format);
}


// Address: 0x6E70 | Function: ._ZN10__cxxabiv117__class_type_infoD1Ev
// attributes: thunk
void __fastcall __cxxabiv1::__class_type_info::~__class_type_info(__cxxabiv1::__class_type_info *this)
{
  _ZN10__cxxabiv117__class_type_infoD1Ev(this);
}


// Address: 0x6E80 | Function: .pthread_once
// attributes: thunk
int pthread_once(pthread_once_t *once_control, void (*init_routine)(void))
{
  return pthread_once(once_control, init_routine);
}


// Address: 0x6E90 | Function: .__cxa_finalize
// attributes: thunk
int __cxa_finalize(void *a1)
{
  return _cxa_finalize(a1);
}


// Address: 0x6EA0 | Function: .__cxa_end_catch
// attributes: thunk
void __cxa_end_catch()
{
  _cxa_end_catch();
}


// Address: 0x6EB0 | Function: ._ZNSt9exceptionD1Ev
// attributes: thunk
void __fastcall std::exception::~exception(std::exception *this)
{
  _ZNSt9exceptionD1Ev(this);
}


// Address: 0x6EC0 | Function: .__google_potentially_blocking_region_end
// attributes: thunk
__int64 __google_potentially_blocking_region_end()
{
  return _google_potentially_blocking_region_end();
}


// Address: 0x6ED0 | Function: .strncmp
// attributes: thunk
int strncmp(const char *s1, const char *s2, size_t n)
{
  return strncmp(s1, s2, n);
}


// Address: 0x6EE0 | Function: ._Znwm
// attributes: thunk
__int64 __fastcall operator new(unsigned __int64 a1)
{
  return _Znwm(a1);
}


// Address: 0x6EF0 | Function: .read
// attributes: thunk
ssize_t read(int fd, void *buf, size_t nbytes)
{
  return read(fd, buf, nbytes);
}


// Address: 0x6F00 | Function: .__cxa_current_exception_type
// attributes: thunk
struct type_info *__cxa_current_exception_type()
{
  return _cxa_current_exception_type();
}


// Address: 0x6F10 | Function: ._ZNSt8bad_castD1Ev
// attributes: thunk
void __fastcall std::bad_cast::~bad_cast(std::bad_cast *this)
{
  _ZNSt8bad_castD1Ev(this);
}


// Address: 0x6F20 | Function: .abort
// attributes: thunk
void __noreturn abort(void)
{
  abort();
}


// Address: 0x6F30 | Function: .__cxa_call_unexpected
// attributes: thunk
void __noreturn __cxa_call_unexpected(void *a1)
{
  _cxa_call_unexpected(a1);
}


// Address: 0x6F40 | Function: .strerror
// attributes: thunk
char *strerror(int errnum)
{
  return strerror(errnum);
}


// Address: 0x6F50 | Function: ._exit
// attributes: thunk
void __noreturn _exit(int status)
{
  exit(status);
}


// Address: 0x6F60 | Function: ._ZNSt9bad_allocD1Ev
// attributes: thunk
void __fastcall std::bad_alloc::~bad_alloc(std::bad_alloc *this)
{
  _ZNSt9bad_allocD1Ev(this);
}


// Address: 0x6F70 | Function: ._ZN9__gnu_cxx20recursive_init_errorD1Ev
// attributes: thunk
void __fastcall __gnu_cxx::recursive_init_error::~recursive_init_error(__gnu_cxx::recursive_init_error *this)
{
  _ZN9__gnu_cxx20recursive_init_errorD1Ev(this);
}


// Address: 0x6F80 | Function: ._ZN10__cxxabiv112__unexpectedEPFvvE
// attributes: thunk
void __fastcall __noreturn __cxxabiv1::__unexpected(void (*a1)())
{
  _ZN10__cxxabiv112__unexpectedEPFvvE(a1);
}


// Address: 0x6F90 | Function: .dl_iterate_phdr
// attributes: thunk
int dl_iterate_phdr(int (*callback)(struct dl_phdr_info *, size_t, void *), void *data)
{
  return dl_iterate_phdr(callback, data);
}


// Address: 0x6FA0 | Function: .write
// attributes: thunk
ssize_t write(int fd, const void *buf, size_t n)
{
  return write(fd, buf, n);
}


// Address: 0x6FB0 | Function: ._ZNSt15__exception_ptr13exception_ptrC1Ev
// attributes: thunk
__int64 __fastcall std::__exception_ptr::exception_ptr::exception_ptr(std::__exception_ptr::exception_ptr *this)
{
  return _ZNSt15__exception_ptr13exception_ptrC1Ev(this);
}


// Address: 0x6FC0 | Function: ._ZN10__cxxabiv111__terminateEPFvvE
// attributes: thunk
void __fastcall __noreturn __cxxabiv1::__terminate(void (*a1)())
{
  _ZN10__cxxabiv111__terminateEPFvvE(a1);
}


// Address: 0x6FD0 | Function: .__cxa_free_dependent_exception
// attributes: thunk
__int64 __cxa_free_dependent_exception()
{
  return _cxa_free_dependent_exception();
}


// Address: 0x6FE0 | Function: .memcmp
// attributes: thunk
int memcmp(const void *a1, const void *a2, size_t a3)
{
  return memcmp(a1, a2, a3);
}


// Address: 0x6FF0 | Function: ._ZNSt13bad_exceptionD1Ev
// attributes: thunk
void __fastcall std::bad_exception::~bad_exception(std::bad_exception *this)
{
  _ZNSt13bad_exceptionD1Ev(this);
}


// Address: 0x7000 | Function: .__cxa_allocate_dependent_exception
// attributes: thunk
__int64 __cxa_allocate_dependent_exception()
{
  return _cxa_allocate_dependent_exception();
}


// Address: 0x7010 | Function: .fputs
// attributes: thunk
int fputs(const char *s, FILE *stream)
{
  return fputs(s, stream);
}


// Address: 0x7020 | Function: ._ZSt15get_new_handlerv
// attributes: thunk
__int64 __fastcall std::get_new_handler()
{
  return _ZSt15get_new_handlerv();
}


// Address: 0x7030 | Function: .fputc
// attributes: thunk
int fputc(int c, FILE *stream)
{
  return fputc(c, stream);
}


// Address: 0x7040 | Function: .__stack_chk_fail
// attributes: thunk
void __noreturn __stack_chk_fail()
{
  _stack_chk_fail();
}


// Address: 0x7050 | Function: .select
// attributes: thunk
int select(int nfds, fd_set *readfds, fd_set *writefds, fd_set *exceptfds, struct timeval *timeout)
{
  return select(nfds, readfds, writefds, exceptfds, timeout);
}


// Address: 0x7060 | Function: .fork
// attributes: thunk
__pid_t fork(void)
{
  return fork();
}


// Address: 0x7070 | Function: ._ZNKSt15__exception_ptr13exception_ptr6_M_getEv
// attributes: thunk
__int64 __fastcall std::__exception_ptr::exception_ptr::_M_get(std::__exception_ptr::exception_ptr *this)
{
  return _ZNKSt15__exception_ptr13exception_ptr6_M_getEv(this);
}


// Address: 0x7080 | Function: ._ZNSt15__exception_ptr13exception_ptr4swapERS0_
// attributes: thunk
__int64 __fastcall std::__exception_ptr::exception_ptr::swap(
        std::__exception_ptr::exception_ptr *this,
        std::__exception_ptr::exception_ptr *a2)
{
  return _ZNSt15__exception_ptr13exception_ptr4swapERS0_(this, a2);
}


// Address: 0x7090 | Function: .pthread_key_delete
// attributes: thunk
int pthread_key_delete(pthread_key_t key)
{
  return pthread_key_delete(key);
}


// Address: 0x70A0 | Function: .memchr
// attributes: thunk
void *memchr(const void *a1, int a2, size_t a3)
{
  return memchr(a1, a2, a3);
}


// Address: 0x70B0 | Function: .pthread_setspecific
// attributes: thunk
int pthread_setspecific(pthread_key_t key, const void *pointer)
{
  return pthread_setspecific(key, pointer);
}


// Address: 0x70C0 | Function: .strncpy
// attributes: thunk
char *strncpy(char *a1, const char *a2, size_t a3)
{
  return strncpy(a1, a2, a3);
}


// Address: 0x70D0 | Function: .__cxa_get_globals
// attributes: thunk
__int64 __cxa_get_globals()
{
  return _cxa_get_globals();
}


// Address: 0x70E0 | Function: ._ZNSt15__exception_ptr13exception_ptrC2ERKS0_
// attributes: thunk
__int64 __fastcall std::__exception_ptr::exception_ptr::exception_ptr(
        std::__exception_ptr::exception_ptr *this,
        const std::__exception_ptr::exception_ptr *a2)
{
  return _ZNSt15__exception_ptr13exception_ptrC2ERKS0_(this, a2);
}


// Address: 0x70F0 | Function: .__cxa_demangle
// attributes: thunk
char *__cxa_demangle(const char *lpmangled, char *lpout, size_t *lpoutlen, int *lpstatus)
{
  return _cxa_demangle(lpmangled, lpout, lpoutlen, lpstatus);
}


// Address: 0x7100 | Function: .strcmp
// attributes: thunk
int strcmp(const char *a1, const char *a2)
{
  return strcmp(a1, a2);
}


// Address: 0x7110 | Function: .syscall
// attributes: thunk
__int64 syscall(__int64 sysno, ...)
{
  return syscall(sysno);
}


// Address: 0x7120 | Function: .__cxa_guard_release
// attributes: thunk
void __cxa_guard_release(__guard *a1)
{
  _cxa_guard_release(a1);
}


// Address: 0x7130 | Function: .fgetc
// attributes: thunk
int fgetc(FILE *stream)
{
  return fgetc(stream);
}


// Address: 0x7140 | Function: .__cxa_allocate_exception
// attributes: thunk
void *__cxa_allocate_exception(size_t thrown_size)
{
  return _cxa_allocate_exception(thrown_size);
}


// Address: 0x7150 | Function: .sprintf
// attributes: thunk
int sprintf(char *s, const char *format, ...)
{
  return sprintf(s, format);
}


// Address: 0x7160 | Function: .puts
// attributes: thunk
int puts(const char *s)
{
  return puts(s);
}


// Address: 0x7170 | Function: ._ZNSt10bad_typeidD2Ev
// attributes: thunk
void __fastcall std::bad_typeid::~bad_typeid(std::bad_typeid *this)
{
  _ZNSt10bad_typeidD2Ev(this);
}


// Address: 0x7180 | Function: .pthread_mutex_lock
// attributes: thunk
int pthread_mutex_lock(pthread_mutex_t *mutex)
{
  return pthread_mutex_lock(mutex);
}


// Address: 0x7190 | Function: ._ZNSt15__exception_ptr13exception_ptrD2Ev
// attributes: thunk
void __fastcall std::__exception_ptr::exception_ptr::~exception_ptr(std::__exception_ptr::exception_ptr *this)
{
  _ZNSt15__exception_ptr13exception_ptrD2Ev(this);
}


// Address: 0x71A0 | Function: .pthread_getspecific
// attributes: thunk
void *pthread_getspecific(pthread_key_t key)
{
  return pthread_getspecific(key);
}


// Address: 0x71B0 | Function: ._ZNSt15__exception_ptr13exception_ptr10_M_releaseEv
// attributes: thunk
__int64 __fastcall std::__exception_ptr::exception_ptr::_M_release(std::__exception_ptr::exception_ptr *this)
{
  return _ZNSt15__exception_ptr13exception_ptr10_M_releaseEv(this);
}


// Address: 0x71C0 | Function: ._ZNSt15__exception_ptr13exception_ptrC2EPv
// attributes: thunk
__int64 __fastcall std::__exception_ptr::exception_ptr::exception_ptr(
        std::__exception_ptr::exception_ptr *this,
        void *a2)
{
  return _ZNSt15__exception_ptr13exception_ptrC2EPv(this, a2);
}


// Address: 0x71D0 | Function: ._ZdlPv
// attributes: thunk
void __fastcall operator delete(void *p)
{
  _ZdlPv(p);
}


// Address: 0x71E0 | Function: .memmove
// attributes: thunk
void *memmove(void *a1, const void *a2, size_t a3)
{
  return memmove(a1, a2, a3);
}


// Address: 0x71F0 | Function: ._ZSt9terminatev
// attributes: thunk
void __fastcall __noreturn std::terminate()
{
  _ZSt9terminatev();
}


// Address: 0x7200 | Function: ._ZNSt15__exception_ptreqERKNS_13exception_ptrES2_
// attributes: thunk
__int64 std::__exception_ptr::operator==()
{
  return _ZNSt15__exception_ptreqERKNS_13exception_ptrES2_();
}


// Address: 0x7210 | Function: .ferror
// attributes: thunk
int ferror(FILE *stream)
{
  return ferror(stream);
}


// Address: 0x7220 | Function: ._ZN10__cxxabiv120__si_class_type_infoD2Ev
// attributes: thunk
void __fastcall __cxxabiv1::__si_class_type_info::~__si_class_type_info(__cxxabiv1::__si_class_type_info *this)
{
  _ZN10__cxxabiv120__si_class_type_infoD2Ev(this);
}


// Address: 0x7230 | Function: .__cxa_begin_catch
// attributes: thunk
void *__cxa_begin_catch(void *a1)
{
  return _cxa_begin_catch(a1);
}


// Address: 0x7240 | Function: .__cxa_free_exception
// attributes: thunk
void __cxa_free_exception(void *a1)
{
  _cxa_free_exception(a1);
}


// Address: 0x7250 | Function: ._ZN10__cxxabiv119__foreign_exceptionD2Ev
// attributes: thunk
void __fastcall __cxxabiv1::__foreign_exception::~__foreign_exception(__cxxabiv1::__foreign_exception *this)
{
  _ZN10__cxxabiv119__foreign_exceptionD2Ev(this);
}


// Address: 0x7260 | Function: .strlen
// attributes: thunk
size_t strlen(const char *a1)
{
  return strlen(a1);
}


// Address: 0x7270 | Function: ._ZSt10unexpectedv
// attributes: thunk
void __fastcall __noreturn std::unexpected()
{
  _ZSt10unexpectedv();
}


// Address: 0x7280 | Function: .close
// attributes: thunk
int close(int fd)
{
  return close(fd);
}


// Address: 0x7290 | Function: .stat
// attributes: thunk
int stat(const char *file, struct stat *buf)
{
  return stat(file, buf);
}


// Address: 0x72A0 | Function: ._ZNSt9exceptionD1Ev_0
// attributes: thunk
void __fastcall std::exception::~exception(std::exception *this)
{
  _ZNSt9exceptionD1Ev(this);
}


// Address: 0x72B0 | Function: .__cxa_rethrow
// attributes: thunk
void __noreturn __cxa_rethrow()
{
  _cxa_rethrow();
}


// Address: 0x72C0 | Function: .malloc
// attributes: thunk
void *malloc(size_t byte_count)
{
  return malloc(byte_count);
}


// Address: 0x72D0 | Function: .memcpy
// attributes: thunk
void *memcpy(void *a1, const void *a2, size_t a3)
{
  return memcpy(a1, a2, a3);
}


// Address: 0x72E0 | Function: ._ZN10__cxxabiv115__forced_unwindD2Ev
// attributes: thunk
void __fastcall __cxxabiv1::__forced_unwind::~__forced_unwind(__cxxabiv1::__forced_unwind *this)
{
  _ZN10__cxxabiv115__forced_unwindD2Ev(this);
}


// Address: 0x72F0 | Function: .memset
// attributes: thunk
void *memset(void *a1, int a2, size_t a3)
{
  return memset(a1, a2, a3);
}


// Address: 0x7300 | Function: .fopen
// attributes: thunk
FILE *fopen(const char *filename, const char *modes)
{
  return fopen(filename, modes);
}


// Address: 0x7310 | Function: ._ZSt13get_terminatev
// attributes: thunk
__int64 __fastcall std::get_terminate()
{
  return _ZSt13get_terminatev();
}


// Address: 0x7320 | Function: ._ZN10__cxxabiv117__class_type_infoD1Ev_0
// attributes: thunk
void __fastcall __cxxabiv1::__class_type_info::~__class_type_info(__cxxabiv1::__class_type_info *this)
{
  _ZN10__cxxabiv117__class_type_infoD1Ev(this);
}


// Address: 0x7330 | Function: .fwrite
// attributes: thunk
size_t fwrite(const void *ptr, size_t size, size_t n, FILE *s)
{
  return fwrite(ptr, size, n, s);
}


// Address: 0x7340 | Function: ._ZSt14get_unexpectedv
// attributes: thunk
__int64 __fastcall std::get_unexpected()
{
  return _ZSt14get_unexpectedv();
}


// Address: 0x7350 | Function: ._ZNK10__cxxabiv117__class_type_info11__do_upcastEPKS0_PKvRNS0_15__upcast_resultE
// attributes: thunk
__int64 __cxxabiv1::__class_type_info::__do_upcast()
{
  return _ZNK10__cxxabiv117__class_type_info11__do_upcastEPKS0_PKvRNS0_15__upcast_resultE();
}


// Address: 0x7360 | Function: .free
// attributes: thunk
void free(void *p)
{
  free(p);
}


// Address: 0x7370 | Function: .pthread_mutex_unlock
// attributes: thunk
int pthread_mutex_unlock(pthread_mutex_t *mutex)
{
  return pthread_mutex_unlock(mutex);
}


// Address: 0x7380 | Function: .__cxa_atexit
// attributes: thunk
int __cxa_atexit(void (*lpfunc)(void *), void *obj, void *lpdso_handle)
{
  return _cxa_atexit(lpfunc, obj, lpdso_handle);
}


// Address: 0x7390 | Function: .__cxa_guard_acquire
// attributes: thunk
int __cxa_guard_acquire(__guard *a1)
{
  return _cxa_guard_acquire(a1);
}


// Address: 0x73A0 | Function: start
__int64 start()
{
  return __cxa_finalize(&unk_4A000);
}


// Address: 0x73AC | Function: sub_73AC
__int64 *sub_73AC()
{
  qword_4E3F0 = 0;
  qword_4E3F8 = 0;
  qword_4E400 = 0;
  qword_4E408 = 0;
  qword_4E410 = 0;
  return &qword_4E3F0;
}


// Address: 0x73C4 | Function: sub_73C4
__int64 sub_73C4()
{
  byte_5E42C = 0;
  if ( &pthread_create != nullptr )
    byte_5E42C = pthread_key_create((pthread_key_t *)&dword_5E428, (void (*)(void *))sub_19A80) == 0;
  return __cxa_atexit((void (*)(void *))sub_19A64, &dword_5E428, &unk_4A000);
}


// Address: 0x7424 | Function: sub_7424
__int64 sub_7424()
{
  __cxa_atexit((void (*)(void *))nullsub_2, off_4A030, &unk_4A000);
  return __cxa_atexit((void (*)(void *))nullsub_1, &off_4A038, &unk_4A000);
}


// Address: 0x7470 | Function: sub_7470
__int64 (*__fastcall sub_7470(__int64 (*result)(void)))(void)
{
  if ( result != nullptr )
    return (__int64 (*)(void))result();
  return result;
}


// Address: 0x7488 | Function: sub_7488
__int64 __fastcall sub_7488(void *a1)
{
  return __cxa_atexit((void (*)(void *))sub_7470, a1, &unk_4A000);
}


// Address: 0x74A0 | Function: Java_com_umeng_umzid_Spy_getNativeLibraryVersion
void Java_com_umeng_umzid_Spy_getNativeLibraryVersion()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x7508);
}


// Address: 0x784C | Function: Java_com_umeng_umzid_Spy_getNativeID
void Java_com_umeng_umzid_Spy_getNativeID()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x78C8);
}


// Address: 0x87C0 | Function: sub_87C0
void sub_87C0()
{
  JUMPOUT(0x8808);
}


// Address: 0x88D4 | Function: sub_88D4
void sub_88D4()
{
  JUMPOUT(0x892C);
}


// Address: 0x89F0 | Function: sub_89F0
void sub_89F0()
{
  JUMPOUT(0x8A40);
}


// Address: 0x8BB8 | Function: sub_8BB8
void sub_8BB8()
{
  JUMPOUT(0x8C20);
}


// Address: 0x8D44 | Function: sub_8D44
void sub_8D44()
{
  JUMPOUT(0x8D98);
}


// Address: 0x8F94 | Function: sub_8F94
void sub_8F94()
{
  JUMPOUT(0x8FE8);
}


// Address: 0x913C | Function: sub_913C
void sub_913C()
{
  JUMPOUT(0x919C);
}


// Address: 0x942C | Function: sub_942C
void sub_942C()
{
  JUMPOUT(0x9494);
}


// Address: 0x9670 | Function: sub_9670
void sub_9670()
{
  JUMPOUT(0x96C8);
}


// Address: 0x997C | Function: sub_997C
void sub_997C()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x99E4);
}


// Address: 0x9A64 | Function: sub_9A64
void sub_9A64()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x9AC8);
}


// Address: 0x9C40 | Function: sub_9C40
void sub_9C40()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x9CB4);
}


// Address: 0xA71C | Function: sub_A71C
void sub_A71C()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xA78C);
}


// Address: 0xAB78 | Function: sub_AB78
void sub_AB78()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xABFC);
}


// Address: 0xB288 | Function: sub_B288
void sub_B288()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xB2FC);
}


// Address: 0xB7CC | Function: sub_B7CC
void sub_B7CC()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xB828);
}


// Address: 0xB90C | Function: sub_B90C
void sub_B90C()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xB978);
}


// Address: 0xBB50 | Function: sub_BB50
void sub_BB50()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xBBCC);
}


// Address: 0xBE94 | Function: sub_BE94
void sub_BE94()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xBF10);
}


// Address: 0xBFF8 | Function: sub_BFF8
void sub_BFF8()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xC060);
}


// Address: 0xC294 | Function: sub_C294
void sub_C294()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xC314);
}


// Address: 0xC604 | Function: sub_C604
void sub_C604()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xC674);
}


// Address: 0xC878 | Function: sub_C878
void sub_C878()
{
  JUMPOUT(0xC8DC);
}


// Address: 0xC99C | Function: sub_C99C
void sub_C99C()
{
  JUMPOUT(0xC9F4);
}


// Address: 0xCAF8 | Function: sub_CAF8
void sub_CAF8()
{
  JUMPOUT(0xCB60);
}


// Address: 0xCC24 | Function: sub_CC24
void sub_CC24()
{
  JUMPOUT(0xCC7C);
}


// Address: 0xCDD8 | Function: sub_CDD8
void sub_CDD8()
{
  JUMPOUT(0xCE1C);
}


// Address: 0xCFA8 | Function: sub_CFA8
void sub_CFA8()
{
  JUMPOUT(0xD008);
}


// Address: 0xD2E4 | Function: sub_D2E4
void sub_D2E4()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xD34C);
}


// Address: 0xD3CC | Function: sub_D3CC
void sub_D3CC()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xD438);
}


// Address: 0xD58C | Function: sub_D58C
void sub_D58C()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xD604);
}


// Address: 0xD77C | Function: sub_D77C
void sub_D77C()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xD7E4);
}


// Address: 0xD87C | Function: sub_D87C
void sub_D87C()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xD8D8);
}


// Address: 0xD974 | Function: sub_D974
void sub_D974()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xD9DC);
}


// Address: 0xDAFC | Function: sub_DAFC
void sub_DAFC()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xDB68);
}


// Address: 0xDC44 | Function: sub_DC44
void sub_DC44()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xDCB8);
}


// Address: 0xDD98 | Function: sub_DD98
void sub_DD98()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xDE00);
}


// Address: 0xDE80 | Function: sub_DE80
void sub_DE80()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xDEEC);
}


// Address: 0xE368 | Function: sub_E368
void sub_E368()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xE3D8);
}


// Address: 0xE9C0 | Function: sub_E9C0
void sub_E9C0()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xEA2C);
}


// Address: 0xEC60 | Function: sub_EC60
void sub_EC60()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xECD8);
}


// Address: 0xF070 | Function: sub_F070
void sub_F070()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xF0F0);
}


// Address: 0xF550 | Function: sub_F550
void sub_F550()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xF5C0);
}


// Address: 0xF758 | Function: sub_F758
void sub_F758()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0xF7C0);
}


// Address: 0xF8DC | Function: sub_F8DC
void sub_F8DC()
{
  JUMPOUT(0xF938);
}


// Address: 0xF9FC | Function: sub_F9FC
void sub_F9FC()
{
  JUMPOUT(0xFA58);
}


// Address: 0xFB5C | Function: sub_FB5C
void sub_FB5C()
{
  JUMPOUT(0xFBB8);
}


// Address: 0xFD60 | Function: sub_FD60
void sub_FD60()
{
  JUMPOUT(0xFDC0);
}


// Address: 0xFF44 | Function: sub_FF44
void sub_FF44()
{
  JUMPOUT(0xFF94);
}


// Address: 0x1018C | Function: sub_1018C
void sub_1018C()
{
  JUMPOUT(0x101E4);
}


// Address: 0x102EC | Function: sub_102EC
void sub_102EC()
{
  JUMPOUT(0x10340);
}


// Address: 0x104BC | Function: sub_104BC
void sub_104BC()
{
  JUMPOUT(0x1051C);
}


// Address: 0x106AC | Function: sub_106AC
void sub_106AC()
{
  JUMPOUT(0x106F8);
}


// Address: 0x107E8 | Function: sub_107E8
void sub_107E8()
{
  JUMPOUT(0x1083C);
}


// Address: 0x10A58 | Function: sub_10A58
void sub_10A58()
{
  JUMPOUT(0x10AA8);
}


// Address: 0x10CA0 | Function: sub_10CA0
void sub_10CA0()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x10D08);
}


// Address: 0x10D9C | Function: sub_10D9C
void sub_10D9C()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x10E04);
}


// Address: 0x11258 | Function: sub_11258
void sub_11258()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x112B8);
}


// Address: 0x114A8 | Function: sub_114A8
void sub_114A8()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x1151C);
}


// Address: 0x116C8 | Function: sub_116C8
void sub_116C8()
{
  JUMPOUT(0x11720);
}


// Address: 0x118BC | Function: sub_118BC
void sub_118BC()
{
  JUMPOUT(0x11920);
}


// Address: 0x11A70 | Function: sub_11A70
void sub_11A70()
{
  JUMPOUT(0x11AC4);
}


// Address: 0x11DFC | Function: sub_11DFC
void sub_11DFC()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x11E70);
}


// Address: 0x12264 | Function: sub_12264
void sub_12264()
{
  JUMPOUT(0x122C0);
}


// Address: 0x1242C | Function: sub_1242C
void sub_1242C()
{
  JUMPOUT(0x12480);
}


// Address: 0x125D4 | Function: sub_125D4
void sub_125D4()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x12644);
}


// Address: 0x12A14 | Function: sub_12A14
void sub_12A14()
{
  _ReadStatusReg(TPIDR_EL0);
  JUMPOUT(0x12A74);
}


// Address: 0x12BA0 | Function: sub_12BA0
void sub_12BA0()
{
  JUMPOUT(0x12C10);
}


// Address: 0x12CA8 | Function: sub_12CA8
void sub_12CA8()
{
  JUMPOUT(0x12D00);
}


// Address: 0x12E84 | Function: sub_12E84
void sub_12E84()
{
  JUMPOUT(0x12ED4);
}


// Address: 0x12FA0 | Function: sub_12FA0
void sub_12FA0()
{
  JUMPOUT(0x12FF4);
}


// Address: 0x13090 | Function: sub_13090
void sub_13090()
{
  JUMPOUT(0x130F4);
}


// Address: 0x13200 | Function: sub_13200
void sub_13200()
{
  JUMPOUT(0x1325C);
}


// Address: 0x1343C | Function: sub_1343C
void sub_1343C()
{
  JUMPOUT(0x13494);
}


// Address: 0x137E4 | Function: sub_137E4
void sub_137E4()
{
  JUMPOUT(0x13830);
}


// Address: 0x13B80 | Function: sub_13B80
char *__fastcall sub_13B80(char *result, _QWORD *a2)
{
  __int64 v2; // x5
  unsigned int v3; // w3
  char v4; // w4
  char v5; // t1
  unsigned __int64 v6; // x2

  v2 = 0;
  v3 = 0;
  do
  {
    v5 = *result++;
    v4 = v5;
    v6 = (unsigned __int64)(v5 & 0x7F) << v3;
    v3 += 7;
    v2 |= v6;
  }
  while ( v5 < 0 );
  if ( v3 <= 0x3F && (v4 & 0x40) != 0 )
    v2 |= -1LL << v3;
  *a2 = v2;
  return result;
}


// Address: 0x13BC0 | Function: sub_13BC0
char *__fastcall sub_13BC0(char a1, char *a2, char *a3, unsigned __int64 *a4)
{
  char *result; // x0
  unsigned __int64 v7; // x1
  int v8; // w5
  char v9; // t1
  unsigned __int64 v10; // x4
  unsigned __int64 v11; // x2
  unsigned __int64 *v12; // [xsp+20h] [xbp+20h]
  char *v13; // [xsp+28h] [xbp+28h]
  _QWORD *v14; // [xsp+38h] [xbp+38h] BYREF

  if ( a1 == 80 )
  {
    v11 = (unsigned __int64)(a3 + 7);
    *a4 = *(_QWORD *)(v11 & 0xFFFFFFFFFFFFFFF8LL);
    return (char *)((v11 & 0xFFFFFFFFFFFFFFF8LL) + 8);
  }
  else
  {
    switch ( a1 & 0xF )
    {
      case 0:
      case 4:
      case 0xC:
        result = a3 + 8;
        v7 = *(_QWORD *)a3;
        break;
      case 1:
        result = a3;
        v7 = 0;
        v8 = 0;
        do
        {
          v9 = *result++;
          v10 = (unsigned __int64)(v9 & 0x7F) << v8;
          v8 += 7;
          v7 |= v10;
        }
        while ( v9 < 0 );
        break;
      case 2:
        result = a3 + 2;
        v7 = *(unsigned __int16 *)a3;
        break;
      case 3:
        result = a3 + 4;
        v7 = *(unsigned int *)a3;
        break;
      case 9:
        v12 = a4;
        v13 = a3;
        result = sub_13B80(a3, &v14);
        v7 = (unsigned __int64)v14;
        a3 = v13;
        a4 = v12;
        break;
      case 0xA:
        result = a3 + 2;
        v7 = *(__int16 *)a3;
        break;
      case 0xB:
        result = a3 + 4;
        v7 = *(int *)a3;
        break;
      default:
        abort();
    }
    if ( v7 != 0 )
    {
      if ( (a1 & 0x70) != 0x10 )
        a3 = a2;
      v7 += (unsigned __int64)a3;
      if ( a1 < 0 )
        v7 = *(_QWORD *)v7;
    }
    *a4 = v7;
  }
  return result;
}


// Address: 0x13CD0 | Function: sub_13CD0
__int64 __fastcall sub_13CD0(unsigned __int8 a1, __int64 a2)
{
  unsigned int v2; // w2

  if ( a1 == 255 )
    return 0;
  v2 = a1 & 0x70;
  if ( v2 == 32 )
    return *(_QWORD *)(a2 + 808);
  if ( v2 <= 0x20 )
  {
    if ( (a1 & 0x70) != 0 && v2 != 16 )
      goto LABEL_11;
    return 0;
  }
  if ( v2 != 64 )
  {
    if ( v2 != 80 )
    {
      if ( v2 == 48 )
        return *(_QWORD *)(a2 + 816);
LABEL_11:
      abort();
    }
    return 0;
  }
  return sub_2ADD8(a2);
}


// Address: 0x13D4C | Function: sub_13D4C
char *__fastcall sub_13D4C(__int64 a1, unsigned __int8 *a2, __int64 a3)
{
  __int64 v5; // x0
  int v6; // w20
  char *v7; // x0
  char *v8; // x2
  char *v9; // x0
  int v10; // w1
  __int64 v11; // x4
  int v12; // w2
  char v13; // t1
  unsigned __int64 v14; // x1
  char v15; // w1
  __int64 v16; // x4
  char *result; // x0
  int v18; // w2
  char v19; // t1
  unsigned __int64 v20; // x1
  int v21; // w1
  unsigned __int8 *v22; // [xsp+38h] [xbp+38h]
  char *v23; // [xsp+38h] [xbp+38h]

  if ( a1 != 0 )
  {
    v22 = a2;
    v5 = sub_2ADD8(a1);
    a2 = v22;
  }
  else
  {
    v5 = 0;
  }
  *(_QWORD *)a3 = v5;
  v6 = *a2;
  if ( v6 != 255 )
  {
    v23 = (char *)(a2 + 1);
    v7 = (char *)sub_13CD0(v6, a1);
    v8 = sub_13BC0(v6, v7, v23, (unsigned __int64 *)(a3 + 8));
    v9 = v8 + 1;
    v10 = (unsigned __int8)*v8;
    *(_BYTE *)(a3 + 40) = v10;
    if ( v10 != 255 )
      goto LABEL_5;
LABEL_12:
    *(_QWORD *)(a3 + 24) = 0;
    goto LABEL_8;
  }
  *(_QWORD *)(a3 + 8) = v5;
  v9 = (char *)(a2 + 2);
  v21 = a2[1];
  *(_BYTE *)(a3 + 40) = v21;
  if ( v21 == 255 )
    goto LABEL_12;
LABEL_5:
  v11 = 0;
  v12 = 0;
  do
  {
    v13 = *v9++;
    v14 = (unsigned __int64)(v13 & 0x7F) << v12;
    v12 += 7;
    v11 |= v14;
  }
  while ( v13 < 0 );
  *(_QWORD *)(a3 + 24) = &v9[v11];
LABEL_8:
  v15 = *v9;
  v16 = 0;
  result = v9 + 1;
  *(_BYTE *)(a3 + 41) = v15;
  v18 = 0;
  do
  {
    v19 = *result++;
    v20 = (unsigned __int64)(v19 & 0x7F) << v18;
    v18 += 7;
    v16 |= v20;
  }
  while ( v19 < 0 );
  *(_QWORD *)(a3 + 32) = &result[v16];
  return result;
}


// Address: 0x13E58 | Function: sub_13E58
__int64 __fastcall sub_13E58(__int64 a1, __int64 *a2, unsigned __int64 *a3, __int64 a4)
{
  char *v7; // x23
  __int64 v8; // x2
  int v9; // w1
  char v10; // t1
  unsigned __int64 v11; // x0
  int v12; // w0
  __int64 v13; // x2
  unsigned __int64 v14; // x25
  __int64 v15; // x1
  __int64 result; // x0
  unsigned __int64 *v17; // [xsp+58h] [xbp+58h] BYREF

  v7 = (char *)(*(_QWORD *)(a1 + 24) + ~a4);
  while ( 1 )
  {
    v8 = 0;
    v9 = 0;
    do
    {
      v10 = *v7++;
      v11 = (unsigned __int64)(v10 & 0x7F) << v9;
      v9 += 7;
      v8 |= v11;
    }
    while ( v10 < 0 );
    if ( v8 == 0 )
      break;
    v12 = *(unsigned __int8 *)(a1 + 40);
    if ( v12 == 255 )
    {
      v13 = 0;
    }
    else
    {
      switch ( v12 & 7 )
      {
        case 0:
        case 4:
          v13 = -8 * v8;
          break;
        case 2:
          v13 = -2 * v8;
          break;
        case 3:
          v13 = -4 * v8;
          break;
        default:
          abort();
      }
    }
    sub_13BC0(v12, *(char **)(a1 + 16), (char *)(*(_QWORD *)(a1 + 24) + v13), (unsigned __int64 *)&v17);
    v14 = (unsigned __int64)v17;
    v15 = *a2;
    v17 = a3;
    if ( (*(unsigned __int8 (__fastcall **)(__int64 *))(v15 + 16))(a2) != 0 )
      v17 = (unsigned __int64 *)*v17;
    result = (*(unsigned __int8 (__fastcall **)(unsigned __int64, __int64 *, unsigned __int64 **, __int64))(*(_QWORD *)v14 + 32LL))(
               v14,
               a2,
               &v17,
               1);
    if ( (_BYTE)result != 0 )
      return result;
  }
  return 0;
}


// Address: 0x13F98 | Function: __gxx_personality_v0
__int64 __fastcall _gxx_personality_v0(int a1, int a2, __int64 a3, _QWORD *a4, __int64 a5)
{
  bool v5; // zf
  __int64 result; // x0
  char v7; // w22
  unsigned int v10; // w27
  char *v11; // x26
  int v12; // w19
  __int64 v13; // x0
  char *v14; // x2
  unsigned __int64 v15; // x26
  char v16; // w28
  char *v17; // x0
  char *v18; // x0
  char v19; // w28
  char *v20; // x0
  char *v21; // x0
  char v22; // w28
  char *v23; // x0
  __int64 v24; // x4
  int v25; // w1
  char v26; // t1
  unsigned __int64 v27; // x0
  int v28; // w0
  char *v29; // x28
  __int64 v30; // x4
  int v31; // w2
  char *v32; // x1
  char v33; // t1
  unsigned __int64 v34; // x0
  int v35; // w0
  unsigned __int64 v36; // [xsp+68h] [xbp+68h]
  int v37; // [xsp+7Ch] [xbp+7Ch]
  __int64 **v38; // [xsp+80h] [xbp+80h]
  unsigned __int64 *v39; // [xsp+88h] [xbp+88h]
  unsigned __int8 *v40; // [xsp+90h] [xbp+90h]
  char *v41; // [xsp+98h] [xbp+98h]
  char *v42; // [xsp+98h] [xbp+98h]
  char *v43; // [xsp+98h] [xbp+98h]
  char *v44; // [xsp+98h] [xbp+98h]
  char *v45; // [xsp+98h] [xbp+98h]
  int v46; // [xsp+A4h] [xbp+A4h] BYREF
  __int64 v47; // [xsp+A8h] [xbp+A8h] BYREF
  unsigned __int64 v48; // [xsp+B0h] [xbp+B0h] BYREF
  unsigned __int64 *v49; // [xsp+B8h] [xbp+B8h] BYREF
  _QWORD v50[2]; // [xsp+C0h] [xbp+C0h] BYREF
  char *v51; // [xsp+D0h] [xbp+D0h]
  char *v52; // [xsp+D8h] [xbp+D8h]
  unsigned __int64 v53; // [xsp+E0h] [xbp+E0h]
  unsigned __int8 v54; // [xsp+E8h] [xbp+E8h]
  unsigned __int8 v55; // [xsp+E9h] [xbp+E9h]

  v5 = a1 == 1;
  result = 3;
  v46 = 0;
  v7 = a2;
  if ( !v5 )
    return result;
  v10 = (unsigned __int64)(a3 - 0x474E5543432B2B00LL) > 1;
  if ( (a2 == 6) > v10 )
  {
    v11 = (char *)*(a4 - 2);
    v40 = (unsigned __int8 *)*(a4 - 3);
    v12 = *((_DWORD *)a4 - 9);
    if ( v11 == nullptr )
    {
      if ( (a2 & 8) != 0 )
        std::terminate();
LABEL_6:
      sub_197F4(a4);
    }
    if ( (a2 & 8) != 0 )
      goto LABEL_8;
    goto LABEL_13;
  }
  v40 = (unsigned __int8 *)sub_2ADD0(a5);
  if ( v40 == nullptr )
    return 8;
  v41 = sub_13D4C(a5, v40, (__int64)v50);
  v51 = (char *)sub_13CD0(v54, a5);
  v13 = sub_2ADB4(a5, &v46);
  v14 = v41;
  v15 = v13 - (v46 == 0);
  if ( (unsigned __int64)v41 >= v53 )
  {
LABEL_20:
    v11 = nullptr;
    v28 = 1;
LABEL_21:
    v39 = nullptr;
    v12 = 0;
    v29 = nullptr;
    goto LABEL_22;
  }
  while ( 1 )
  {
    v16 = v55;
    v42 = v14;
    v17 = (char *)sub_13CD0(v55, 0);
    v18 = sub_13BC0(v16, v17, v42, (unsigned __int64 *)&v47);
    v19 = v55;
    v43 = v18;
    v20 = (char *)sub_13CD0(v55, 0);
    v21 = sub_13BC0(v19, v20, v43, &v48);
    v22 = v55;
    v44 = v21;
    v23 = (char *)sub_13CD0(v55, 0);
    v14 = sub_13BC0(v22, v23, v44, (unsigned __int64 *)&v49);
    v24 = 0;
    v25 = 0;
    do
    {
      v26 = *v14++;
      v27 = (unsigned __int64)(v26 & 0x7F) << v25;
      v25 += 7;
      v24 |= v27;
    }
    while ( v26 < 0 );
    if ( v15 < v47 + v50[0] )
      goto LABEL_20;
    if ( v15 < v47 + v50[0] + v48 )
      break;
    if ( (unsigned __int64)v14 >= v53 )
      goto LABEL_20;
  }
  if ( v49 == nullptr )
    return 8;
  v11 = (char *)v49 + v50[1];
  if ( v24 == 0 )
  {
    if ( v11 == nullptr )
      return 8;
    goto LABEL_36;
  }
  if ( v11 == nullptr )
    return 8;
  v29 = (char *)(v53 + v24 - 1);
  if ( v29 == nullptr )
  {
LABEL_36:
    v28 = 2;
    goto LABEL_21;
  }
  if ( (v7 & 8) != 0 )
  {
    v39 = nullptr;
    v38 = &`typeinfo for'__cxxabiv1::__forced_unwind;
  }
  else if ( v10 != 0 )
  {
    v39 = nullptr;
    v38 = &`typeinfo for'__cxxabiv1::__foreign_exception;
  }
  else
  {
    v39 = a4 + 4;
    if ( (*a4 & 1) != 0 )
      v39 = (unsigned __int64 *)*(a4 - 10);
    v38 = (__int64 **)*(v39 - 14);
  }
  v37 = 0;
  while ( 1 )
  {
    v45 = sub_13B80(v29, &v47);
    sub_13B80(v45, &v48);
    if ( v47 == 0 )
    {
      v37 = 1;
      goto LABEL_52;
    }
    if ( v47 <= 0 )
    {
      if ( ((v38 != nullptr) & (unsigned __int8)((v7 & 8) == 0)) > v10 )
      {
        v35 = (unsigned __int8)sub_13E58((__int64)v50, (__int64 *)v38, v39, v47) ^ 1;
      }
      else
      {
        v30 = 0;
        v31 = 0;
        v32 = &v52[~v47];
        do
        {
          v33 = *v32++;
          v34 = (unsigned __int64)(v33 & 0x7F) << v31;
          v31 += 7;
          v30 |= v34;
        }
        while ( v33 < 0 );
        v35 = v30 == 0;
      }
      if ( v35 != 0 )
        goto LABEL_65;
      goto LABEL_52;
    }
    if ( v54 != 255 )
    {
      if ( (v54 & 7u) > 4 )
        abort();
      __asm { BR              X1; switch jump }
    }
    sub_13BC0(255, v51, v52, (unsigned __int64 *)&v49);
    if ( v49 == nullptr )
      goto LABEL_65;
    if ( v38 != nullptr )
    {
      v36 = (unsigned __int64)v49;
      v49 = v39;
      if ( ((unsigned __int8 (__fastcall *)(__int64 **))(*v38)[2])(v38) != 0 )
        v49 = (unsigned __int64 *)*v49;
      if ( (*(unsigned __int8 (__fastcall **)(unsigned __int64, __int64 **, unsigned __int64 **, __int64))(*(_QWORD *)v36 + 32LL))(
             v36,
             v38,
             &v49,
             1) != 0 )
        break;
    }
LABEL_52:
    if ( v48 == 0 )
    {
      if ( v37 != 0 )
      {
        v12 = 0;
        v28 = 2;
        goto LABEL_22;
      }
      return 8;
    }
    v29 = &v45[v48];
  }
  v39 = v49;
LABEL_65:
  v12 = v47;
  v28 = 3;
LABEL_22:
  if ( (v7 & 1) == 0 )
  {
    if ( (v7 & 8) != 0 || v10 != 0 )
    {
      if ( v28 == 1 )
        std::terminate();
LABEL_8:
      if ( v12 < 0 )
        std::unexpected();
LABEL_9:
      sub_2AD54(a5, 0, a4);
      sub_2AD54(a5, 1, v12);
      sub_2ADC8(a5, v11);
      return 7;
    }
    if ( v28 == 1 )
      goto LABEL_6;
LABEL_13:
    if ( v12 < 0 )
    {
      sub_13D4C(a5, v40, (__int64)v50);
      v51 = (char *)sub_13CD0(v54, a5);
      *(a4 - 2) = sub_13CD0(v54, a5);
    }
    goto LABEL_9;
  }
  if ( v28 == 2 )
    return 8;
  result = 6;
  if ( v10 == 0 )
  {
    *(a4 - 3) = v40;
    *((_DWORD *)a4 - 9) = v12;
    *(a4 - 4) = v29;
    *(a4 - 1) = v39;
    *(a4 - 2) = v11;
  }
  return result;
}


// Address: 0x144D4 | Function: __cxa_call_unexpected
void __noreturn _cxa_call_unexpected(void *a1)
{
  void (*v2)(); // x0
  __int64 v3; // [xsp+60h] [xbp+60h]

  __cxa_begin_catch(a1);
  v2 = *((void (**)())a1 - 8);
  v3 = *((_QWORD *)a1 - 2);
  __cxxabiv1::__unexpected(v2);
}


// Address: 0x145C4 | Function: _ZN10__cxxabiv111__terminateEPFvvE
void __fastcall __noreturn __cxxabiv1::__terminate(void (*a1)())
{
  a1();
  abort();
}


// Address: 0x14600 | Function: _ZSt13set_terminatePFvvE
unsigned __int64 __fastcall std::set_terminate(void (*a1)())
{
  unsigned __int64 result; // x0

  do
    result = __ldaxr((unsigned __int64 *)&__cxxabiv1::__terminate_handler);
  while ( __stlxr((unsigned __int64)a1, (unsigned __int64 *)&__cxxabiv1::__terminate_handler) != 0 );
  return result;
}


// Address: 0x1461C | Function: _ZSt13get_terminatev
unsigned __int64 __fastcall std::get_terminate()
{
  return atomic_load((unsigned __int64 *)&__cxxabiv1::__terminate_handler);
}


// Address: 0x1462C | Function: _ZSt9terminatev
void __fastcall __noreturn std::terminate()
{
  void (*terminate)(); // x0

  terminate = (void (*)())std::get_terminate();
  __cxxabiv1::__terminate(terminate);
}


// Address: 0x1463C | Function: _ZN10__cxxabiv112__unexpectedEPFvvE
void __fastcall __noreturn __cxxabiv1::__unexpected(void (*a1)())
{
  a1();
  std::terminate();
}


// Address: 0x1464C | Function: _ZSt14set_unexpectedPFvvE
unsigned __int64 __fastcall std::set_unexpected(void (*a1)())
{
  unsigned __int64 result; // x0

  do
    result = __ldaxr((unsigned __int64 *)__cxxabiv1::__unexpected_handler);
  while ( __stlxr((unsigned __int64)a1, (unsigned __int64 *)__cxxabiv1::__unexpected_handler) != 0 );
  return result;
}


// Address: 0x14668 | Function: _ZSt14get_unexpectedv
unsigned __int64 __fastcall std::get_unexpected()
{
  return atomic_load((unsigned __int64 *)__cxxabiv1::__unexpected_handler);
}


// Address: 0x14678 | Function: _ZSt10unexpectedv
void __fastcall __noreturn std::unexpected()
{
  void (*unexpected)(); // x0

  unexpected = (void (*)())std::get_unexpected();
  __cxxabiv1::__unexpected(unexpected);
}


// Address: 0x14688 | Function: sub_14688
void __fastcall sub_14688(unsigned int a1, __int64 a2)
{
  unsigned int *v2; // x0
  unsigned int v3; // w2
  unsigned int v4; // w2
  void (__fastcall *v5)(__int64); // x2
  void *v6; // x19

  if ( a1 > 1 )
    __cxxabiv1::__terminate(*(void (**)())(a2 - 56));
  v2 = (unsigned int *)(a2 - 96);
  do
  {
    v3 = __ldaxr(v2);
    v4 = v3 - 1;
  }
  while ( __stlxr(v4, v2) != 0 );
  if ( v4 == 0 )
  {
    v5 = *(void (__fastcall **)(__int64))(a2 - 72);
    v6 = (void *)(a2 + 32);
    if ( v5 != nullptr )
      v5(a2 + 32);
    __cxa_free_exception(v6);
  }
}


// Address: 0x146EC | Function: __cxa_throw
void __noreturn _cxa_throw(void *a1, struct type_info *lptinfo, void (*a3)(void *))
{
  char *v4; // x20
  __int64 globals; // x0

  v4 = (char *)a1 - 128;
  globals = __cxa_get_globals();
  v4 += 96;
  ++*(_DWORD *)(globals + 8);
  *((_QWORD *)a1 - 13) = a3;
  *((_QWORD *)a1 - 14) = lptinfo;
  *((_DWORD *)a1 - 32) = 1;
  *((_QWORD *)a1 - 12) = std::get_unexpected();
  *((_QWORD *)a1 - 11) = std::get_terminate();
  *((_QWORD *)a1 - 4) = 0x474E5543432B2B00LL;
  *((_QWORD *)a1 - 3) = sub_14688;
  sub_2C338(v4);
  __cxa_begin_catch(v4);
  std::terminate();
}


// Address: 0x14778 | Function: __cxa_rethrow
void __noreturn _cxa_rethrow()
{
  __int64 globals; // x0
  __int64 v1; // x1
  void *v2; // x19

  globals = __cxa_get_globals();
  v1 = *(_QWORD *)globals;
  ++*(_DWORD *)(globals + 8);
  if ( v1 != 0 )
  {
    if ( (unsigned __int64)(*(_QWORD *)(v1 + 80) - 0x474E5543432B2B00LL) <= 1 )
      *(_DWORD *)(v1 + 40) = -*(_DWORD *)(v1 + 40);
    else
      *(_QWORD *)globals = 0;
    v2 = (void *)(v1 + 80);
    sub_2C6A0(v1 + 80);
    __cxa_begin_catch(v2);
  }
  std::terminate();
}


// Address: 0x147E8 | Function: sub_147E8
void __fastcall sub_147E8(unsigned int *a1)
{
  unsigned int *v1; // x2
  int v2; // w1
  int v3; // w1

  if ( &pthread_create == nullptr )
  {
    v3 = a1[4];
    a1[4] = v3 - 1;
    if ( v3 > 0 )
      return;
LABEL_7:
    operator delete(a1);
    return;
  }
  v1 = a1 + 4;
  do
    v2 = __ldaxr(v1);
  while ( __stlxr(v2 - 1, v1) != 0 );
  if ( v2 <= 0 )
    goto LABEL_7;
}


// Address: 0x1482C | Function: sub_1482C
__int64 __fastcall sub_1482C(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x14834 | Function: sub_14834
__int64 __fastcall sub_14834(_QWORD *a1, __int64 a2)
{
  *a1 = a2;
  return a2;
}


// Address: 0x14840 | Function: sub_14840
__int64 __fastcall sub_14840(_QWORD *a1)
{
  return *a1 - 24LL;
}


// Address: 0x1484C | Function: sub_1484C
__int64 __fastcall sub_1484C(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x14854 | Function: sub_14854
__int64 __fastcall sub_14854(_QWORD *a1)
{
  return *a1 + *(_QWORD *)(*a1 - 24LL);
}


// Address: 0x14864 | Function: sub_14864
unsigned __int64 __fastcall sub_14864(__int64 *a1, unsigned __int64 a2, const char *a3)
{
  __int64 v3; // x3
  unsigned __int64 result; // x0
  unsigned __int64 v5; // x3

  v3 = *a1;
  result = a2;
  v5 = *(_QWORD *)(v3 - 24);
  if ( a2 > v5 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", a3, a2, v5);
  return result;
}


// Address: 0x1489C | Function: sub_1489C
_QWORD *__fastcall sub_1489C(_QWORD *result, __int64 a2, unsigned __int64 a3, __int64 a4)
{
  if ( 0x3FFFFFFFFFFFFFF9LL - *(_QWORD *)(*result - 24LL) + a2 < a3 )
    sub_1A3F8(a4);
  return result;
}


// Address: 0x148D4 | Function: sub_148D4
unsigned __int64 __fastcall sub_148D4(_QWORD *a1, __int64 a2, unsigned __int64 a3)
{
  unsigned __int64 v3; // x1

  v3 = *(_QWORD *)(*a1 - 24LL) - a2;
  if ( v3 > a3 )
    return a3;
  else
    return v3;
}


// Address: 0x148EC | Function: sub_148EC
bool __fastcall sub_148EC(unsigned __int64 *a1, unsigned __int64 a2)
{
  unsigned __int64 v2; // x2
  _BOOL8 result; // x0

  v2 = *a1;
  result = true;
  if ( a2 >= v2 )
    return a2 > v2 + *(_QWORD *)(v2 - 24);
  return result;
}


// Address: 0x14910 | Function: sub_14910
void *__fastcall sub_14910(_BYTE *a1, unsigned __int8 *a2, size_t a3)
{
  void *result; // x0

  if ( a3 != 1 )
    return memcpy(a1, a2, a3);
  result = (void *)*a2;
  *a1 = (_BYTE)result;
  return result;
}


// Address: 0x1492C | Function: sub_1492C
void *__fastcall sub_1492C(_BYTE *a1, unsigned __int8 *a2, size_t a3)
{
  void *result; // x0

  if ( a3 != 1 )
    return memmove(a1, a2, a3);
  result = (void *)*a2;
  *a1 = (_BYTE)result;
  return result;
}


// Address: 0x14948 | Function: sub_14948
unsigned __int8 *__fastcall sub_14948(unsigned __int8 *result, size_t a2, unsigned __int8 a3)
{
  if ( a2 != 1 )
    return (unsigned __int8 *)memset(result, a3, a2);
  *result = a3;
  return result;
}


// Address: 0x14968 | Function: sub_14968
void *__fastcall sub_14968(_BYTE *a1, unsigned __int8 *a2, __int64 a3)
{
  size_t v3; // x2
  void *result; // x0

  v3 = a3 - (_QWORD)a2;
  if ( v3 != 1 )
    return memcpy(a1, a2, v3);
  result = (void *)*a2;
  *a1 = (_BYTE)result;
  return result;
}


// Address: 0x14988 | Function: sub_14988
void *__fastcall sub_14988(_BYTE *a1, unsigned __int8 *a2, __int64 a3)
{
  size_t v3; // x2
  void *result; // x0

  v3 = a3 - (_QWORD)a2;
  if ( v3 != 1 )
    return memcpy(a1, a2, v3);
  result = (void *)*a2;
  *a1 = (_BYTE)result;
  return result;
}


// Address: 0x149A8 | Function: sub_149A8
void *__fastcall sub_149A8(_BYTE *a1, unsigned __int8 *a2, __int64 a3)
{
  size_t v3; // x2
  void *result; // x0

  v3 = a3 - (_QWORD)a2;
  if ( v3 != 1 )
    return memcpy(a1, a2, v3);
  result = (void *)*a2;
  *a1 = (_BYTE)result;
  return result;
}


// Address: 0x149C8 | Function: sub_149C8
void *__fastcall sub_149C8(_BYTE *a1, unsigned __int8 *a2, __int64 a3)
{
  size_t v3; // x2
  void *result; // x0

  v3 = a3 - (_QWORD)a2;
  if ( v3 != 1 )
    return memcpy(a1, a2, v3);
  result = (void *)*a2;
  *a1 = (_BYTE)result;
  return result;
}


// Address: 0x149E8 | Function: sub_149E8
__int64 __fastcall sub_149E8(__int64 a1, __int64 a2)
{
  __int64 v2; // x1
  __int64 result; // x0

  v2 = a1 - a2;
  result = 0x7FFFFFFF;
  if ( v2 <= 0x7FFFFFFF )
  {
    if ( v2 >= (__int64)0xFFFFFFFF80000000LL )
      return (unsigned int)v2;
    else
      return 0x80000000LL;
  }
  return result;
}


// Address: 0x14A10 | Function: sub_14A10
void *sub_14A10()
{
  return &unk_4C7C0;
}


// Address: 0x14A1C | Function: sub_14A1C
_QWORD *__fastcall sub_14A1C(_QWORD *result)
{
  *result = &unk_4C7D8;
  return result;
}


// Address: 0x14A2C | Function: sub_14A2C
_QWORD *__fastcall sub_14A2C(_QWORD *result)
{
  *result = &unk_4C7D8;
  return result;
}


// Address: 0x14A3C | Function: sub_14A3C
_QWORD *__fastcall sub_14A3C(_QWORD *result, __int64 *a2, unsigned __int64 a3, unsigned __int64 a4)
{
  __int64 v4; // x21
  unsigned __int64 v5; // x4
  _QWORD *v7; // x24
  unsigned __int64 v8; // x4
  _BYTE *v9; // x23
  unsigned __int64 v10; // x19
  _BYTE *v11; // x19
  size_t v12; // x19
  __int64 v13; // x20
  __int64 v14; // x22
  void *v15; // x3
  __int64 v16; // x0

  v4 = *a2;
  v5 = *(_QWORD *)(*a2 - 24);
  v7 = result;
  if ( a3 > v5 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::basic_string", a3, v5);
  v8 = v5 - a3;
  v9 = (_BYTE *)(v4 + a3);
  if ( v8 > a4 )
    v10 = a4;
  else
    v10 = v8;
  v11 = (_BYTE *)(v4 + v10 + a3);
  if ( v9 == v11 )
  {
    *result = &unk_4C7D8;
    return result;
  }
  if ( v11 != nullptr && v9 == nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  v12 = v11 - v9;
  if ( v12 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( v12 + 57 > 0x1000 && v12 != 0 )
  {
    v13 = 0x3FFFFFFFFFFFFFF9LL;
    if ( v12 + 4096 - (((_WORD)v12 + 57) & 0xFFF) <= 0x3FFFFFFFFFFFFFF9LL )
      v13 = v12 + 4096 - (((_WORD)v12 + 57) & 0xFFF);
    v14 = operator new(v13 + 25);
    v15 = (void *)(v14 + 24);
    *(_QWORD *)(v14 + 8) = v13;
    *(_DWORD *)(v14 + 16) = 0;
  }
  else
  {
    v16 = operator new(v12 + 25);
    *(_QWORD *)(v16 + 8) = v12;
    *(_DWORD *)(v16 + 16) = 0;
    v14 = v16;
    v15 = (void *)(v16 + 24);
    if ( v12 == 1 )
    {
      result = (_QWORD *)*(unsigned __int8 *)(v4 + a3);
      *(_BYTE *)(v14 + 24) = (_BYTE)result;
      goto LABEL_16;
    }
  }
  result = memcpy(v15, v9, v12);
  v15 = result;
LABEL_16:
  if ( (_UNKNOWN *)v14 != &unk_4C7C0 )
  {
    result = (_QWORD *)(v14 + v12);
    *(_QWORD *)v14 = v12;
    *(_BYTE *)(v14 + v12 + 24) = 0;
  }
  *v7 = v15;
  return result;
}


// Address: 0x14BB8 | Function: sub_14BB8
_QWORD *__fastcall sub_14BB8(_QWORD *result, __int64 *a2, unsigned __int64 a3, unsigned __int64 a4)
{
  __int64 v4; // x21
  unsigned __int64 v5; // x4
  _QWORD *v7; // x24
  unsigned __int64 v8; // x4
  _BYTE *v9; // x23
  unsigned __int64 v10; // x19
  _BYTE *v11; // x19
  size_t v12; // x19
  __int64 v13; // x20
  __int64 v14; // x22
  void *v15; // x3
  __int64 v16; // x0

  v4 = *a2;
  v5 = *(_QWORD *)(*a2 - 24);
  v7 = result;
  if ( a3 > v5 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::basic_string", a3, v5);
  v8 = v5 - a3;
  v9 = (_BYTE *)(v4 + a3);
  if ( v8 > a4 )
    v10 = a4;
  else
    v10 = v8;
  v11 = (_BYTE *)(v4 + v10 + a3);
  if ( v9 == v11 )
  {
    *result = &unk_4C7D8;
    return result;
  }
  if ( v11 != nullptr && v9 == nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  v12 = v11 - v9;
  if ( v12 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( v12 + 57 > 0x1000 && v12 != 0 )
  {
    v13 = 0x3FFFFFFFFFFFFFF9LL;
    if ( v12 + 4096 - (((_WORD)v12 + 57) & 0xFFF) <= 0x3FFFFFFFFFFFFFF9LL )
      v13 = v12 + 4096 - (((_WORD)v12 + 57) & 0xFFF);
    v14 = operator new(v13 + 25);
    v15 = (void *)(v14 + 24);
    *(_QWORD *)(v14 + 8) = v13;
    *(_DWORD *)(v14 + 16) = 0;
  }
  else
  {
    v16 = operator new(v12 + 25);
    *(_QWORD *)(v16 + 8) = v12;
    *(_DWORD *)(v16 + 16) = 0;
    v14 = v16;
    v15 = (void *)(v16 + 24);
    if ( v12 == 1 )
    {
      result = (_QWORD *)*(unsigned __int8 *)(v4 + a3);
      *(_BYTE *)(v14 + 24) = (_BYTE)result;
      goto LABEL_16;
    }
  }
  result = memcpy(v15, v9, v12);
  v15 = result;
LABEL_16:
  if ( (_UNKNOWN *)v14 != &unk_4C7C0 )
  {
    result = (_QWORD *)(v14 + v12);
    *(_QWORD *)v14 = v12;
    *(_BYTE *)(v14 + v12 + 24) = 0;
  }
  *v7 = v15;
  return result;
}


// Address: 0x14D34 | Function: sub_14D34
_QWORD *__fastcall sub_14D34(_QWORD *result, unsigned __int8 *a2, size_t a3)
{
  unsigned __int8 *v4; // x2
  _QWORD *v5; // x22
  __int64 v6; // x2
  __int64 v7; // x20
  __int64 v8; // x21
  unsigned __int8 *v9; // x1
  void *v10; // x3
  __int64 v11; // x0

  v4 = &a2[a3];
  v5 = result;
  if ( a2 == v4 )
  {
    *result = &unk_4C7D8;
    return result;
  }
  if ( v4 != nullptr && a2 == nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  if ( a3 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( a3 - 4040 > 0xFFFFFFFFFFFFEFFELL )
  {
    v11 = operator new(a3 + 25);
    *(_QWORD *)(v11 + 8) = a3;
    *(_DWORD *)(v11 + 16) = 0;
    v8 = v11;
    v10 = (void *)(v11 + 24);
    v9 = a2;
    if ( a3 == 1 )
    {
      result = (_QWORD *)*a2;
      *(_BYTE *)(v8 + 24) = (_BYTE)result;
      goto LABEL_11;
    }
  }
  else
  {
    v6 = ((_WORD)a3 + 57) & 0xFFF;
    v7 = 0x3FFFFFFFFFFFFFF9LL;
    if ( a3 + 4096 - v6 <= 0x3FFFFFFFFFFFFFF9LL )
      v7 = a3 + 4096 - v6;
    v8 = operator new(v7 + 25);
    v9 = a2;
    v10 = (void *)(v8 + 24);
    *(_QWORD *)(v8 + 8) = v7;
    *(_DWORD *)(v8 + 16) = 0;
  }
  result = memcpy(v10, v9, a3);
  v10 = result;
LABEL_11:
  if ( (_UNKNOWN *)v8 != &unk_4C7C0 )
  {
    result = (_QWORD *)(v8 + a3);
    *(_QWORD *)v8 = a3;
    *(_BYTE *)(v8 + a3 + 24) = 0;
  }
  *v5 = v10;
  return result;
}


// Address: 0x14E70 | Function: sub_14E70
unsigned __int64 __fastcall sub_14E70(_QWORD *a1, char *a2)
{
  unsigned __int64 result; // x0
  size_t v4; // x19
  __int64 v5; // x2
  __int64 v6; // x20
  __int64 v7; // x21
  char *v8; // x1
  void *v9; // x3
  __int64 v10; // x0

  if ( a2 == nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  result = strlen(a2);
  v4 = result;
  if ( result == 0 )
  {
    *a1 = &unk_4C7D8;
    return result;
  }
  if ( result > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( result - 4040 > 0xFFFFFFFFFFFFEFFELL )
  {
    v10 = operator new(result + 25);
    *(_QWORD *)(v10 + 8) = v4;
    *(_DWORD *)(v10 + 16) = 0;
    v7 = v10;
    v9 = (void *)(v10 + 24);
    v8 = a2;
    if ( v4 == 1 )
    {
      result = (unsigned __int8)*a2;
      *(_BYTE *)(v7 + 24) = result;
      goto LABEL_9;
    }
  }
  else
  {
    v5 = ((_WORD)result + 57) & 0xFFF;
    v6 = 0x3FFFFFFFFFFFFFF9LL;
    if ( result + 4096 - v5 <= 0x3FFFFFFFFFFFFFF9LL )
      v6 = result + 4096 - v5;
    v7 = operator new(v6 + 25);
    v8 = a2;
    v9 = (void *)(v7 + 24);
    *(_QWORD *)(v7 + 8) = v6;
    *(_DWORD *)(v7 + 16) = 0;
  }
  result = (unsigned __int64)memcpy(v9, v8, v4);
  v9 = (void *)result;
LABEL_9:
  if ( (_UNKNOWN *)v7 != &unk_4C7C0 )
  {
    result = v7 + v4;
    *(_QWORD *)v7 = v4;
    *(_BYTE *)(v7 + v4 + 24) = 0;
  }
  *a1 = v9;
  return result;
}


// Address: 0x14FB0 | Function: sub_14FB0
_QWORD *__fastcall sub_14FB0(_QWORD *result, size_t a2, unsigned __int8 a3)
{
  _QWORD *v4; // x22
  int v5; // w23
  void *v6; // x3
  __int64 v7; // x4
  __int64 v8; // x20
  __int64 v9; // x21
  __int64 v10; // x0

  v4 = result;
  v5 = a3;
  if ( a2 == 0 )
  {
    v6 = &unk_4C7D8;
    goto LABEL_3;
  }
  if ( a2 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( a2 + 57 > 0x1000 )
  {
    v7 = ((_WORD)a2 + 57) & 0xFFF;
    v8 = 0x3FFFFFFFFFFFFFF9LL;
    if ( a2 + 4096 - v7 <= 0x3FFFFFFFFFFFFFF9LL )
      v8 = a2 + 4096 - v7;
    v9 = operator new(v8 + 25);
    v6 = (void *)(v9 + 24);
    *(_QWORD *)(v9 + 8) = v8;
    *(_DWORD *)(v9 + 16) = 0;
    goto LABEL_9;
  }
  v10 = operator new(a2 + 25);
  *(_QWORD *)(v10 + 8) = a2;
  *(_DWORD *)(v10 + 16) = 0;
  v9 = v10;
  v6 = (void *)(v10 + 24);
  if ( a2 != 1 )
  {
LABEL_9:
    v6 = memset(v6, v5, a2);
    goto LABEL_10;
  }
  *(_BYTE *)(v10 + 24) = v5;
LABEL_10:
  result = &unk_4C7C0;
  if ( (_UNKNOWN *)v9 != &unk_4C7C0 )
  {
    result = (_QWORD *)(v9 + a2);
    *(_QWORD *)v9 = a2;
    *(_BYTE *)(v9 + a2 + 24) = 0;
  }
LABEL_3:
  *v4 = v6;
  return result;
}


// Address: 0x150B4 | Function: sub_150B4
void *__fastcall sub_150B4(_QWORD *a1, _QWORD *a2)
{
  *a1 = *a2;
  *a2 = &unk_4C7D8;
  return &unk_4C7D8;
}


// Address: 0x150CC | Function: sub_150CC
_QWORD *__fastcall sub_150CC(_QWORD *result, unsigned __int8 *a2, size_t a3)
{
  unsigned __int8 *v4; // x2
  _QWORD *v5; // x22
  __int64 v6; // x2
  __int64 v7; // x20
  __int64 v8; // x21
  unsigned __int8 *v9; // x1
  void *v10; // x3
  __int64 v11; // x0

  v4 = &a2[a3];
  v5 = result;
  if ( a2 == v4 )
  {
    *result = &unk_4C7D8;
    return result;
  }
  if ( v4 != nullptr && a2 == nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  if ( a3 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( a3 - 4040 > 0xFFFFFFFFFFFFEFFELL )
  {
    v11 = operator new(a3 + 25);
    *(_QWORD *)(v11 + 8) = a3;
    *(_DWORD *)(v11 + 16) = 0;
    v8 = v11;
    v10 = (void *)(v11 + 24);
    v9 = a2;
    if ( a3 == 1 )
    {
      result = (_QWORD *)*a2;
      *(_BYTE *)(v8 + 24) = (_BYTE)result;
      goto LABEL_11;
    }
  }
  else
  {
    v6 = ((_WORD)a3 + 57) & 0xFFF;
    v7 = 0x3FFFFFFFFFFFFFF9LL;
    if ( a3 + 4096 - v6 <= 0x3FFFFFFFFFFFFFF9LL )
      v7 = a3 + 4096 - v6;
    v8 = operator new(v7 + 25);
    v9 = a2;
    v10 = (void *)(v8 + 24);
    *(_QWORD *)(v8 + 8) = v7;
    *(_DWORD *)(v8 + 16) = 0;
  }
  result = memcpy(v10, v9, a3);
  v10 = result;
LABEL_11:
  if ( (_UNKNOWN *)v8 != &unk_4C7C0 )
  {
    result = (_QWORD *)(v8 + a3);
    *(_QWORD *)v8 = a3;
    *(_BYTE *)(v8 + a3 + 24) = 0;
  }
  *v5 = v10;
  return result;
}


// Address: 0x15208 | Function: sub_15208
void __fastcall sub_15208(__int64 *a1)
{
  __int64 v1; // x2
  void *v2; // x0
  unsigned int *v3; // x2
  int v4; // w1

  v1 = *a1;
  v2 = (void *)(*a1 - 24);
  if ( v2 != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v3 = (unsigned int *)(v1 - 8);
      do
        v4 = __ldaxr(v3);
      while ( __stlxr(v4 - 1, v3) != 0 );
    }
    else
    {
      v4 = *(_DWORD *)(v1 - 8);
      *(_DWORD *)(v1 - 8) = v4 - 1;
    }
    if ( v4 <= 0 )
      operator delete(v2);
  }
}


// Address: 0x15260 | Function: sub_15260
__int64 *__fastcall sub_15260(__int64 *result, __int64 *a2)
{
  __int64 v2; // x3
  __int64 v3; // x2

  v2 = *result;
  if ( (*(_DWORD *)(*result - 8) & 0x80000000) != 0 )
    *(_DWORD *)(v2 - 8) = 0;
  v3 = *a2;
  if ( (*(_DWORD *)(*a2 - 8) & 0x80000000) != 0 )
    *(_DWORD *)(v3 - 8) = 0;
  *result = v3;
  *a2 = v2;
  return result;
}


// Address: 0x15290 | Function: sub_15290
__int64 __fastcall sub_15290(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x15298 | Function: sub_15298
__int64 __fastcall sub_15298(_QWORD *a1)
{
  return *a1 + *(_QWORD *)(*a1 - 24LL);
}


// Address: 0x152A8 | Function: sub_152A8
_QWORD *__usercall sub_152A8@<X0>(__int64 *a1@<X0>, _QWORD *a2@<X8>)
{
  __int64 v2; // x2

  v2 = *a1;
  *a2 = v2 + *(_QWORD *)(v2 - 24);
  return a2;
}


// Address: 0x152C0 | Function: sub_152C0
_QWORD *__usercall sub_152C0@<X0>(__int64 *a1@<X0>, _QWORD *a2@<X8>)
{
  __int64 v2; // x1

  v2 = *a1;
  *a2 = v2;
  return a2;
}


// Address: 0x152D0 | Function: sub_152D0
__int64 __fastcall sub_152D0(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x152D8 | Function: sub_152D8
__int64 __fastcall sub_152D8(_QWORD *a1)
{
  return *a1 + *(_QWORD *)(*a1 - 24LL);
}


// Address: 0x152E8 | Function: sub_152E8
_QWORD *__usercall sub_152E8@<X0>(__int64 *a1@<X0>, _QWORD *a2@<X8>)
{
  __int64 v2; // x2

  v2 = *a1;
  *a2 = v2 + *(_QWORD *)(v2 - 24);
  return a2;
}


// Address: 0x15300 | Function: sub_15300
_QWORD *__usercall sub_15300@<X0>(__int64 *a1@<X0>, _QWORD *a2@<X8>)
{
  __int64 v2; // x1

  v2 = *a1;
  *a2 = v2;
  return a2;
}


// Address: 0x15310 | Function: sub_15310
__int64 __fastcall sub_15310(_QWORD *a1)
{
  return *(_QWORD *)(*a1 - 24LL);
}


// Address: 0x1531C | Function: sub_1531C
__int64 __fastcall sub_1531C(_QWORD *a1)
{
  return *(_QWORD *)(*a1 - 24LL);
}


// Address: 0x15328 | Function: sub_15328
__int64 sub_15328()
{
  return 0x3FFFFFFFFFFFFFF9LL;
}


// Address: 0x15334 | Function: sub_15334
__int64 __fastcall sub_15334(_QWORD *a1)
{
  return *(_QWORD *)(*a1 - 16LL);
}


// Address: 0x15340 | Function: sub_15340
void __fastcall sub_15340(_BYTE **a1, unsigned __int64 a2)
{
  _BYTE *v2; // x20
  unsigned __int64 v3; // x21
  unsigned __int64 v4; // x19
  unsigned __int64 v6; // x0
  __int64 v7; // x0
  _BYTE *v8; // x21
  size_t v9; // x2
  _BYTE *v10; // x23
  _BYTE *v11; // x1
  _BYTE *v12; // x0
  unsigned int *v13; // x1
  int v14; // w2

  v2 = *a1;
  v3 = *((_QWORD *)*a1 - 2);
  if ( a2 != v3 || *((int *)v2 - 2) > 0 )
  {
    v4 = *((_QWORD *)v2 - 3);
    if ( a2 >= v4 )
      v4 = a2;
    if ( v4 > 0x3FFFFFFFFFFFFFF9LL )
      sub_1A3F8("basic_string::_S_create");
    v6 = v4 + 25;
    if ( v3 < v4 )
    {
      if ( v4 < 2 * v3 )
        v4 = 2 * v3;
      if ( v4 + 57 > 0x1000 && v3 < v4 )
      {
        v4 = v4 + 4096 - (((_WORD)v4 + 57) & 0xFFF);
        if ( v4 > 0x3FFFFFFFFFFFFFF9LL )
          v4 = 0x3FFFFFFFFFFFFFF9LL;
      }
      v6 = v4 + 25;
    }
    v7 = operator new(v6);
    v8 = (_BYTE *)v7;
    v9 = *((_QWORD *)v2 - 3);
    v10 = (_BYTE *)(v7 + 24);
    *(_QWORD *)(v7 + 8) = v4;
    *(_DWORD *)(v7 + 16) = 0;
    if ( v9 != 0 )
    {
      v10 = (_BYTE *)(v7 + 24);
      if ( v9 == 1 )
        *(_BYTE *)(v7 + 24) = *v2;
      else
        memcpy((void *)(v7 + 24), v2, v9);
      v9 = *((_QWORD *)v2 - 3);
    }
    if ( v8 != (_BYTE *)&unk_4C7C0 )
    {
      *(_QWORD *)v8 = v9;
      v8[v9 + 24] = 0;
    }
    v11 = *a1;
    v12 = *a1 - 24;
    if ( v12 != (_BYTE *)&unk_4C7C0 )
    {
      if ( &pthread_create != nullptr )
      {
        v13 = (unsigned int *)(v11 - 8);
        do
          v14 = __ldaxr(v13);
        while ( __stlxr(v14 - 1, v13) != 0 );
      }
      else
      {
        v14 = *((_DWORD *)v11 - 2);
        *((_DWORD *)v11 - 2) = v14 - 1;
      }
      if ( v14 <= 0 )
        operator delete(v12);
    }
    *a1 = v10;
  }
}


// Address: 0x1550C | Function: sub_1550C
__int64 __fastcall sub_1550C(int **a1, int *a2, size_t a3)
{
  int *v5; // x3
  __int64 v6; // x1
  unsigned __int64 v7; // x21
  _BYTE *v8; // x0
  int *v9; // x1
  signed __int64 v11; // x20
  size_t v12; // [xsp+38h] [xbp+38h]
  size_t v13; // [xsp+38h] [xbp+38h]

  v5 = *a1;
  v6 = *((_QWORD *)*a1 - 3);
  if ( 0x3FFFFFFFFFFFFFF9LL - v6 < a3 )
    sub_1A3F8("basic_string::append");
  v7 = a3 + v6;
  if ( a3 + v6 <= *((_QWORD *)v5 - 2) )
  {
    if ( *(*a1 - 2) <= 0 )
    {
LABEL_5:
      v8 = (char *)v5 + v6;
      if ( a3 == 1 )
        goto LABEL_6;
LABEL_12:
      memcpy(v8, a2, a3);
      v9 = *a1;
      if ( *a1 - 6 == (int *)&unk_4C7C0 )
        return 0;
      goto LABEL_13;
    }
    if ( v5 > a2 )
    {
LABEL_4:
      v12 = a3;
      sub_15340((_BYTE **)a1, v7);
      v5 = *a1;
      a3 = v12;
      v6 = *((_QWORD *)*a1 - 3);
      goto LABEL_5;
    }
  }
  else if ( v5 > a2 )
  {
    goto LABEL_4;
  }
  if ( a2 > (int *)((char *)v5 + v6) )
    goto LABEL_4;
  v11 = (char *)a2 - (char *)v5;
  v13 = a3;
  sub_15340((_BYTE **)a1, v7);
  v5 = *a1;
  a3 = v13;
  a2 = (int *)((char *)*a1 + v11);
  v6 = *((_QWORD *)*a1 - 3);
  v8 = (char *)*a1 + v6;
  if ( v13 != 1 )
    goto LABEL_12;
LABEL_6:
  *((_BYTE *)v5 + v6) = *(_BYTE *)a2;
  v9 = *a1;
  if ( *a1 - 6 == (int *)&unk_4C7C0 )
    return 0;
LABEL_13:
  *((_QWORD *)v9 - 3) = v7;
  *(v9 - 2) = 0;
  *((_BYTE *)v9 + v7) = 0;
  return 0;
}


// Address: 0x15654 | Function: sub_15654
__int64 __fastcall sub_15654(int **a1, size_t a2, unsigned __int8 a3)
{
  int *v5; // x1
  int v6; // w22
  __int64 v7; // x3
  size_t v8; // x21
  _BYTE *v9; // x0
  int *v10; // x1

  v5 = *a1;
  v6 = a3;
  v7 = *((_QWORD *)*a1 - 3);
  if ( 0x3FFFFFFFFFFFFFF9LL - v7 < a2 )
    sub_1A3F8("basic_string::append");
  v8 = a2 + v7;
  if ( a2 + v7 > *((_QWORD *)v5 - 2) || *(*a1 - 2) > 0 )
  {
    sub_15340((_BYTE **)a1, a2 + v7);
    v5 = *a1;
    v7 = *((_QWORD *)*a1 - 3);
    v9 = (char *)*a1 + v7;
    if ( a2 == 1 )
      goto LABEL_8;
  }
  else
  {
    v9 = (char *)v5 + v7;
    if ( a2 == 1 )
    {
LABEL_8:
      *((_BYTE *)v5 + v7) = v6;
      v10 = *a1;
      if ( *a1 - 6 != (int *)&unk_4C7C0 )
        goto LABEL_9;
      return 0;
    }
  }
  memset(v9, v6, a2);
  v10 = *a1;
  if ( *a1 - 6 == (int *)&unk_4C7C0 )
    return 0;
LABEL_9:
  *((_QWORD *)v10 - 3) = v8;
  *(v10 - 2) = 0;
  *((_BYTE *)v10 + v8) = 0;
  return 0;
}


// Address: 0x15758 | Function: sub_15758
bool __fastcall sub_15758(_QWORD *a1)
{
  return *(_QWORD *)(*a1 - 24LL) == 0;
}


// Address: 0x1576C | Function: sub_1576C
__int64 __fastcall sub_1576C(_QWORD *a1, __int64 a2)
{
  return *a1 + a2;
}


// Address: 0x15778 | Function: sub_15778
unsigned __int64 __fastcall sub_15778(_QWORD *a1, unsigned __int64 a2)
{
  unsigned __int64 v2; // x2

  v2 = *(_QWORD *)(*a1 - 24LL);
  if ( a2 >= v2 )
    sub_1A560("basic_string::at: __n (which is %zu) >= this->size() (which is %zu)", a2, v2);
  return *a1 + a2;
}


// Address: 0x157A8 | Function: sub_157A8
__int64 __fastcall sub_157A8(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x157B0 | Function: sub_157B0
__int64 __fastcall sub_157B0(_QWORD *a1)
{
  return *a1 + *(_QWORD *)(*a1 - 24LL) - 1LL;
}


// Address: 0x157C4 | Function: sub_157C4
int **__fastcall sub_157C4(int **a1, char *a2)
{
  size_t v3; // x2

  v3 = strlen(a2);
  if ( v3 != 0 )
    sub_1550C(a1, (int *)a2, v3);
  return a1;
}


// Address: 0x15804 | Function: sub_15804
_BYTE **__fastcall sub_15804(_BYTE **a1, char a2)
{
  _BYTE *v3; // x0
  __int64 v5; // x1
  __int64 v6; // x20
  _BYTE *v7; // x1

  v3 = *a1;
  v5 = *((_QWORD *)v3 - 3);
  v6 = v5 + 1;
  if ( (unsigned __int64)(v5 + 1) > *((_QWORD *)v3 - 2) || *((int *)v3 - 2) > 0 )
  {
    sub_15340(a1, v5 + 1);
    v3 = *a1;
    v5 = *((_QWORD *)*a1 - 3);
  }
  v3[v5] = a2;
  v7 = *a1;
  if ( *a1 - 24 == (_BYTE *)&unk_4C7C0 )
    return a1;
  *((_QWORD *)v7 - 3) = v6;
  *((_DWORD *)v7 - 2) = 0;
  v7[v6] = 0;
  return a1;
}


// Address: 0x158A4 | Function: sub_158A4
int **__fastcall sub_158A4(int **a1, int *a2, size_t a3)
{
  if ( a3 != 0 )
    sub_1550C(a1, a2, a3);
  return a1;
}


// Address: 0x158CC | Function: sub_158CC
int **__fastcall sub_158CC(int **a1, _BYTE **a2)
{
  _BYTE *v3; // x1
  size_t v5; // x20
  int *v6; // x3
  __int64 v7; // x2
  size_t v8; // x22
  int *v9; // x1

  v3 = *a2;
  v5 = *((_QWORD *)v3 - 3);
  if ( v5 != 0 )
  {
    v6 = *a1;
    v7 = *((_QWORD *)*a1 - 3);
    v8 = v7 + v5;
    if ( v7 + v5 > *((_QWORD *)*a1 - 2) || *(v6 - 2) > 0 )
    {
      sub_15340((_BYTE **)a1, v7 + v5);
      v6 = *a1;
      v3 = *a2;
      v7 = *((_QWORD *)*a1 - 3);
    }
    if ( v5 == 1 )
      *((_BYTE *)v6 + v7) = *v3;
    else
      memcpy((char *)v6 + v7, v3, v5);
    v9 = *a1;
    if ( *a1 - 6 != (int *)&unk_4C7C0 )
    {
      *(v9 - 2) = 0;
      *((_QWORD *)v9 - 3) = v8;
      *((_BYTE *)v9 + v8) = 0;
    }
  }
  return a1;
}


// Address: 0x1598C | Function: sub_1598C
// attributes: thunk
int **__fastcall sub_1598C(int **a1, _BYTE **a2)
{
  return sub_158CC(a1, a2);
}


// Address: 0x15990 | Function: sub_15990
int **__fastcall sub_15990(int **a1, __int64 *a2, unsigned __int64 a3, size_t a4)
{
  __int64 v4; // x5
  unsigned __int64 v5; // x4
  size_t v9; // x4
  size_t v10; // x19
  int *v11; // x2
  __int64 v12; // x3
  size_t v13; // x23
  int *v14; // x1

  v4 = *a2;
  v5 = *(_QWORD *)(*a2 - 24);
  if ( a3 > v5 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::append", a3, v5);
  v9 = v5 - a3;
  if ( v9 > a4 )
    v10 = a4;
  else
    v10 = v9;
  if ( v10 != 0 )
  {
    v11 = *a1;
    v12 = *((_QWORD *)*a1 - 3);
    v13 = v10 + v12;
    if ( v10 + v12 > *((_QWORD *)*a1 - 2) || *(v11 - 2) > 0 )
    {
      sub_15340((_BYTE **)a1, v10 + v12);
      v11 = *a1;
      v4 = *a2;
      v12 = *((_QWORD *)*a1 - 3);
    }
    if ( v10 == 1 )
      *((_BYTE *)v11 + v12) = *(_BYTE *)(v4 + a3);
    else
      memcpy((char *)v11 + v12, (const void *)(v4 + a3), v10);
    v14 = *a1;
    if ( *a1 - 6 != (int *)&unk_4C7C0 )
    {
      *(v14 - 2) = 0;
      *((_QWORD *)v14 - 3) = v13;
      *((_BYTE *)v14 + v13) = 0;
    }
  }
  return a1;
}


// Address: 0x15A8C | Function: sub_15A8C
int **__fastcall sub_15A8C(int **a1, int *a2, size_t a3)
{
  if ( a3 != 0 )
    sub_1550C(a1, a2, a3);
  return a1;
}


// Address: 0x15AB4 | Function: sub_15AB4
int **__fastcall sub_15AB4(int **a1, char *a2)
{
  size_t v3; // x2

  v3 = strlen(a2);
  if ( v3 != 0 )
    sub_1550C(a1, (int *)a2, v3);
  return a1;
}


// Address: 0x15AF4 | Function: sub_15AF4
int **__fastcall sub_15AF4(int **a1, size_t a2, unsigned __int8 a3)
{
  if ( a2 != 0 )
    sub_15654(a1, a2, a3);
  return a1;
}


// Address: 0x15B20 | Function: sub_15B20
int **__fastcall sub_15B20(int **a1, int *a2, size_t a3)
{
  if ( a3 != 0 )
    sub_1550C(a1, a2, a3);
  return a1;
}


// Address: 0x15B48 | Function: sub_15B48
void *__fastcall sub_15B48(_BYTE **a1, char a2)
{
  _BYTE *v3; // x0
  __int64 v5; // x1
  __int64 v6; // x20
  void *result; // x0
  _BYTE *v8; // x1

  v3 = *a1;
  v5 = *((_QWORD *)v3 - 3);
  v6 = v5 + 1;
  if ( (unsigned __int64)(v5 + 1) > *((_QWORD *)v3 - 2) || *((int *)v3 - 2) > 0 )
  {
    sub_15340(a1, v5 + 1);
    v3 = *a1;
    v5 = *((_QWORD *)*a1 - 3);
  }
  v3[v5] = a2;
  result = &unk_4C7C0;
  v8 = *a1;
  if ( *a1 - 24 != (_BYTE *)&unk_4C7C0 )
  {
    *((_QWORD *)v8 - 3) = v6;
    *((_DWORD *)v8 - 2) = 0;
    v8[v6] = 0;
  }
  return result;
}


// Address: 0x15BE0 | Function: sub_15BE0
__int64 *__fastcall sub_15BE0(__int64 *result, __int64 *a2)
{
  __int64 v2; // x3
  __int64 v3; // x2

  v2 = *result;
  if ( (*(_DWORD *)(*result - 8) & 0x80000000) != 0 )
    *(_DWORD *)(v2 - 8) = 0;
  v3 = *a2;
  if ( (*(_DWORD *)(*a2 - 8) & 0x80000000) != 0 )
    *(_DWORD *)(v3 - 8) = 0;
  *result = v3;
  *a2 = v2;
  return result;
}


// Address: 0x15C10 | Function: sub_15C10
void *__fastcall sub_15C10(size_t a1, unsigned __int8 a2)
{
  int v2; // w22
  void *v3; // x3
  __int64 v6; // x2
  __int64 v7; // x20
  __int64 v8; // x21
  __int64 v9; // x0

  v2 = a2;
  if ( a1 == 0 )
    return &unk_4C7D8;
  if ( a1 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( a1 + 57 > 0x1000 )
  {
    v6 = ((_WORD)a1 + 57) & 0xFFF;
    v7 = 0x3FFFFFFFFFFFFFF9LL;
    if ( a1 + 4096 - v6 <= 0x3FFFFFFFFFFFFFF9LL )
      v7 = a1 + 4096 - v6;
    v8 = operator new(v7 + 25);
    v3 = (void *)(v8 + 24);
    *(_QWORD *)(v8 + 8) = v7;
    *(_DWORD *)(v8 + 16) = 0;
    goto LABEL_9;
  }
  v9 = operator new(a1 + 25);
  *(_QWORD *)(v9 + 8) = a1;
  *(_DWORD *)(v9 + 16) = 0;
  v8 = v9;
  v3 = (void *)(v9 + 24);
  if ( a1 != 1 )
  {
LABEL_9:
    v3 = memset(v3, v2, a1);
    goto LABEL_10;
  }
  *(_BYTE *)(v9 + 24) = v2;
LABEL_10:
  if ( (_UNKNOWN *)v8 != &unk_4C7C0 )
  {
    *(_QWORD *)v8 = a1;
    *(_BYTE *)(v8 + a1 + 24) = 0;
  }
  return v3;
}


// Address: 0x15D08 | Function: sub_15D08
void *__fastcall sub_15D08(size_t a1, unsigned __int8 a2)
{
  int v2; // w22
  void *v3; // x3
  __int64 v6; // x2
  __int64 v7; // x20
  __int64 v8; // x21
  __int64 v9; // x0

  v2 = a2;
  if ( a1 == 0 )
    return &unk_4C7D8;
  if ( a1 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( a1 + 57 > 0x1000 )
  {
    v6 = ((_WORD)a1 + 57) & 0xFFF;
    v7 = 0x3FFFFFFFFFFFFFF9LL;
    if ( a1 + 4096 - v6 <= 0x3FFFFFFFFFFFFFF9LL )
      v7 = a1 + 4096 - v6;
    v8 = operator new(v7 + 25);
    v3 = (void *)(v8 + 24);
    *(_QWORD *)(v8 + 8) = v7;
    *(_DWORD *)(v8 + 16) = 0;
    goto LABEL_9;
  }
  v9 = operator new(a1 + 25);
  *(_QWORD *)(v9 + 8) = a1;
  *(_DWORD *)(v9 + 16) = 0;
  v8 = v9;
  v3 = (void *)(v9 + 24);
  if ( a1 != 1 )
  {
LABEL_9:
    v3 = memset(v3, v2, a1);
    goto LABEL_10;
  }
  *(_BYTE *)(v9 + 24) = v2;
LABEL_10:
  if ( (_UNKNOWN *)v8 != &unk_4C7C0 )
  {
    *(_QWORD *)v8 = a1;
    *(_BYTE *)(v8 + a1 + 24) = 0;
  }
  return v3;
}


// Address: 0x15E00 | Function: sub_15E00
size_t __fastcall sub_15E00(__int64 *a1, _BYTE *a2, size_t a3, unsigned __int64 a4)
{
  __int64 v4; // x5
  unsigned __int64 v5; // x4
  size_t v6; // x4
  size_t v7; // x19

  v4 = *a1;
  v5 = *(_QWORD *)(*a1 - 24);
  if ( a4 > v5 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::copy", a4, v5);
  v6 = v5 - a4;
  if ( v6 > a3 )
    v7 = a3;
  else
    v7 = v6;
  if ( v7 == 0 )
    return v7;
  if ( v7 != 1 )
  {
    memcpy(a2, (const void *)(v4 + a4), v7);
    return v7;
  }
  *a2 = *(_BYTE *)(v4 + a4);
  return 1;
}


// Address: 0x15E8C | Function: sub_15E8C
__int64 *__fastcall sub_15E8C(__int64 *result, __int64 *a2)
{
  __int64 v2; // x3
  __int64 v3; // x2

  v2 = *result;
  if ( (*(_DWORD *)(*result - 8) & 0x80000000) != 0 )
    *(_DWORD *)(v2 - 8) = 0;
  v3 = *a2;
  if ( (*(_DWORD *)(*a2 - 8) & 0x80000000) != 0 )
    *(_DWORD *)(v3 - 8) = 0;
  *result = v3;
  *a2 = v2;
  return result;
}


// Address: 0x15EBC | Function: sub_15EBC
__int64 __fastcall sub_15EBC(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x15EC4 | Function: sub_15EC4
__int64 __fastcall sub_15EC4(__int64 a1)
{
  return *(_QWORD *)a1;
}


// Address: 0x15ECC | Function: sub_15ECC
__int64 __usercall sub_15ECC@<X0>(__int64 a1@<X8>)
{
  return a1;
}


// Address: 0x15ED4 | Function: sub_15ED4
unsigned __int64 __fastcall sub_15ED4(__int64 *a1, char *a2, unsigned __int64 a3, unsigned __int64 a4)
{
  __int64 v4; // x21
  unsigned __int64 v5; // x20
  __int64 v6; // x19
  unsigned __int64 v8; // x22
  unsigned __int64 v9; // x20
  size_t v10; // x23
  char *v11; // x24
  int v12; // w25
  unsigned __int64 v13; // x2
  int v14; // w0

  v4 = *a1;
  v5 = *(_QWORD *)(*a1 - 24);
  if ( a4 != 0 )
  {
    v6 = -1;
    if ( a4 <= v5 )
    {
      v8 = v5 - a4;
      if ( a3 <= v5 - a4 )
      {
        v9 = a3 + 1;
        v6 = a3;
        v10 = a4 - 1;
        v11 = a2 + 1;
        v12 = (unsigned __int8)*a2;
        while ( 1 )
        {
          v13 = v9;
          if ( *(unsigned __int8 *)(v4 + v6) == v12 )
          {
            v14 = memcmp((const void *)(v4 + v9), v11, v10);
            v13 = v9;
            if ( v14 == 0 )
              break;
          }
          ++v9;
          ++v6;
          if ( v13 > v8 )
            return -1;
        }
      }
    }
  }
  else if ( a3 > v5 )
  {
    return -1;
  }
  else
  {
    return a3;
  }
  return v6;
}


// Address: 0x15F90 | Function: sub_15F90
__int64 __fastcall sub_15F90(__int64 *a1, unsigned __int8 **a2, unsigned __int64 a3)
{
  unsigned __int8 *v3; // x3
  __int64 v4; // x21
  unsigned __int64 v5; // x1
  unsigned __int64 v6; // x20
  __int64 v7; // x19
  unsigned __int64 v9; // x22
  unsigned __int64 v10; // x20
  size_t v11; // x23
  const void *v12; // x24
  int v13; // w25
  unsigned __int64 v14; // x1
  int v15; // w0

  v3 = *a2;
  v4 = *a1;
  v5 = *((_QWORD *)*a2 - 3);
  v6 = *(_QWORD *)(*a1 - 24);
  if ( v5 != 0 )
  {
    v7 = -1;
    if ( v5 <= v6 )
    {
      v9 = v6 - v5;
      if ( a3 <= v6 - v5 )
      {
        v10 = a3 + 1;
        v7 = a3;
        v11 = v5 - 1;
        v12 = v3 + 1;
        v13 = *v3;
        while ( 1 )
        {
          v14 = v10;
          if ( *(unsigned __int8 *)(v4 + v7) == v13 )
          {
            v15 = memcmp((const void *)(v4 + v10), v12, v11);
            v14 = v10;
            if ( v15 == 0 )
              break;
          }
          ++v10;
          ++v7;
          if ( v14 > v9 )
            return -1;
        }
      }
    }
  }
  else if ( a3 > v6 )
  {
    return -1;
  }
  else
  {
    return a3;
  }
  return v7;
}


// Address: 0x16054 | Function: sub_16054
unsigned __int64 __fastcall sub_16054(__int64 *a1, char *a2, unsigned __int64 a3)
{
  size_t v4; // x0
  __int64 v5; // x21
  size_t v6; // x20
  __int64 v7; // x19
  size_t v9; // x22
  unsigned __int64 v10; // x20
  size_t v11; // x23
  int v12; // w25
  size_t v13; // x2
  int v14; // w0

  v4 = strlen(a2);
  v5 = *a1;
  v6 = *(_QWORD *)(*a1 - 24);
  if ( v4 != 0 )
  {
    v7 = -1;
    if ( v4 <= v6 )
    {
      v9 = v6 - v4;
      if ( a3 <= v6 - v4 )
      {
        v10 = a3 + 1;
        v7 = a3;
        v11 = v4 - 1;
        v12 = (unsigned __int8)*a2;
        while ( 1 )
        {
          v13 = v10;
          if ( *(unsigned __int8 *)(v5 + v7) == v12 )
          {
            v14 = memcmp((const void *)(v5 + v10), a2 + 1, v11);
            v13 = v10;
            if ( v14 == 0 )
              break;
          }
          ++v10;
          ++v7;
          if ( v13 > v9 )
            return -1;
        }
      }
    }
  }
  else if ( a3 > v6 )
  {
    return -1;
  }
  else
  {
    return a3;
  }
  return v7;
}


// Address: 0x1612C | Function: sub_1612C
__int64 __fastcall sub_1612C(__int64 *a1, unsigned __int8 a2, unsigned __int64 a3)
{
  __int64 v3; // x19
  __int64 result; // x0
  unsigned __int64 v5; // x3
  void *v6; // x0

  v3 = *a1;
  result = -1;
  v5 = *(_QWORD *)(v3 - 24);
  if ( a3 < v5 )
  {
    v6 = memchr((const void *)(v3 + a3), a2, v5 - a3);
    if ( v6 != nullptr )
      return (__int64)v6 - v3;
    else
      return -1;
  }
  return result;
}


// Address: 0x16180 | Function: sub_16180
__int64 __fastcall sub_16180(__int64 *a1, const void **a2, size_t a3)
{
  const void *v3; // x21
  __int64 v4; // x22
  __int64 result; // x0
  size_t v6; // x20
  size_t v7; // x1
  size_t v8; // x19

  v3 = *a2;
  v4 = *a1;
  result = -1;
  v6 = *((_QWORD *)*a2 - 3);
  v7 = *(_QWORD *)(v4 - 24);
  if ( v6 <= v7 )
  {
    if ( a3 > v7 - v6 )
      v8 = v7 - v6;
    else
      v8 = a3;
    while ( 1 )
    {
      if ( memcmp((const void *)(v4 + v8), v3, v6) == 0 )
        return v8;
      if ( v8 == 0 )
        break;
      --v8;
    }
    return -1;
  }
  return result;
}


// Address: 0x16214 | Function: sub_16214
size_t __fastcall sub_16214(__int64 *a1, void *a2, size_t a3, size_t a4)
{
  __int64 v4; // x21
  size_t result; // x0
  size_t v6; // x4
  size_t v9; // x19

  v4 = *a1;
  result = -1;
  v6 = *(_QWORD *)(v4 - 24);
  if ( a4 <= v6 )
  {
    if ( v6 - a4 > a3 )
      v9 = a3;
    else
      v9 = v6 - a4;
    while ( 1 )
    {
      if ( memcmp((const void *)(v4 + v9), a2, a4) == 0 )
        return v9;
      if ( v9 == 0 )
        break;
      --v9;
    }
    return -1;
  }
  return result;
}


// Address: 0x162A8 | Function: sub_162A8
size_t __fastcall sub_162A8(__int64 *a1, char *a2, size_t a3)
{
  size_t v5; // x0
  __int64 v6; // x21
  size_t v7; // x20
  size_t result; // x0
  size_t v9; // x1
  size_t v10; // x1
  size_t v11; // x19

  v5 = strlen(a2);
  v6 = *a1;
  v7 = v5;
  result = -1;
  v9 = *(_QWORD *)(v6 - 24);
  if ( v7 <= v9 )
  {
    v10 = v9 - v7;
    if ( v10 > a3 )
      v11 = a3;
    else
      v11 = v10;
    while ( 1 )
    {
      if ( memcmp((const void *)(v6 + v11), a2, v7) == 0 )
        return v11;
      if ( v11 == 0 )
        break;
      --v11;
    }
    return -1;
  }
  return result;
}


// Address: 0x16350 | Function: sub_16350
__int64 __fastcall sub_16350(__int64 *a1, unsigned __int8 a2, unsigned __int64 a3)
{
  __int64 v3; // x4
  __int64 result; // x0
  __int64 v5; // x3
  unsigned __int64 v6; // x3

  v3 = *a1;
  result = -1;
  v5 = *(_QWORD *)(v3 - 24);
  if ( v5 != 0 )
  {
    v6 = v5 - 1;
    if ( a3 > v6 )
      result = v6;
    else
      result = a3;
    while ( result != -1 && *(unsigned __int8 *)(v3 + result) != a2 )
      --result;
  }
  return result;
}


// Address: 0x16398 | Function: sub_16398
unsigned __int64 __fastcall sub_16398(__int64 *a1, void *a2, unsigned __int64 a3, size_t a4)
{
  unsigned __int64 v7; // x19
  unsigned __int64 result; // x0
  __int64 v9; // x21
  unsigned __int64 v10; // x23

  v7 = a3;
  result = -1;
  if ( a4 != 0 )
  {
    v9 = *a1;
    v10 = *(_QWORD *)(*a1 - 24);
    if ( v10 > a3 )
    {
      while ( memchr(a2, *(unsigned __int8 *)(v9 + v7), a4) == nullptr )
      {
        if ( v10 <= ++v7 )
          return -1;
      }
      return v7;
    }
  }
  return result;
}


// Address: 0x16424 | Function: sub_16424
unsigned __int64 __fastcall sub_16424(__int64 *a1, void **a2, unsigned __int64 a3)
{
  return sub_16398(a1, *a2, a3, *((_QWORD *)*a2 - 3));
}


// Address: 0x16430 | Function: sub_16430
unsigned __int64 __fastcall sub_16430(__int64 *a1, char *a2, unsigned __int64 a3)
{
  size_t v4; // x0

  v4 = strlen(a2);
  return sub_16398(a1, a2, a3, v4);
}


// Address: 0x1646C | Function: sub_1646C
__int64 __fastcall sub_1646C(__int64 *a1, unsigned __int8 a2, unsigned __int64 a3)
{
  __int64 v3; // x19
  __int64 result; // x0
  unsigned __int64 v5; // x3
  void *v6; // x0

  v3 = *a1;
  result = -1;
  v5 = *(_QWORD *)(v3 - 24);
  if ( a3 < v5 )
  {
    v6 = memchr((const void *)(v3 + a3), a2, v5 - a3);
    if ( v6 != nullptr )
      return (__int64)v6 - v3;
    else
      return -1;
  }
  return result;
}


// Address: 0x164C0 | Function: sub_164C0
__int64 __fastcall sub_164C0(__int64 *a1, const void **a2, unsigned __int64 a3)
{
  const void *v3; // x20
  __int64 v4; // x22
  size_t v5; // x21
  __int64 v6; // x19
  unsigned __int64 v8; // x19

  v3 = *a2;
  v4 = *a1;
  v5 = *((_QWORD *)*a2 - 3);
  v6 = *(_QWORD *)(*a1 - 24);
  if ( v5 == 0 || v6 == 0 )
    return -1;
  v8 = v6 - 1;
  if ( a3 <= v8 )
    v8 = a3;
  do
  {
    if ( memchr(v3, *(unsigned __int8 *)(v4 + v8), v5) != nullptr )
      break;
    --v8;
  }
  while ( v8 != -1 );
  return v8;
}


// Address: 0x16540 | Function: sub_16540
unsigned __int64 __fastcall sub_16540(__int64 *a1, void *a2, unsigned __int64 a3, size_t a4)
{
  __int64 v4; // x21
  __int64 v5; // x0
  unsigned __int64 v7; // x0
  unsigned __int64 v10; // x19

  v4 = *a1;
  v5 = *(_QWORD *)(*a1 - 24);
  if ( a4 == 0 || v5 == 0 )
    return -1;
  v7 = v5 - 1;
  if ( a3 > v7 )
    v10 = v7;
  else
    v10 = a3;
  while ( memchr(a2, *(unsigned __int8 *)(v4 + v10), a4) == nullptr )
  {
    if ( v10 == 0 )
      return -1;
    --v10;
  }
  return v10;
}


// Address: 0x165C0 | Function: sub_165C0
unsigned __int64 __fastcall sub_165C0(__int64 *a1, char *a2, unsigned __int64 a3)
{
  size_t v5; // x0
  __int64 v6; // x21
  size_t v7; // x20
  __int64 v8; // x19
  unsigned __int64 v10; // x19

  v5 = strlen(a2);
  v6 = *a1;
  v7 = v5;
  v8 = *(_QWORD *)(*a1 - 24);
  if ( v5 == 0 || v8 == 0 )
    return -1;
  v10 = v8 - 1;
  if ( a3 <= v10 )
    v10 = a3;
  do
  {
    if ( memchr(a2, *(unsigned __int8 *)(v6 + v10), v7) != nullptr )
      break;
    --v10;
  }
  while ( v10 != -1 );
  return v10;
}


// Address: 0x16654 | Function: sub_16654
__int64 __fastcall sub_16654(__int64 *a1, unsigned __int8 a2, unsigned __int64 a3)
{
  __int64 v3; // x4
  __int64 result; // x0
  __int64 v5; // x3
  unsigned __int64 v6; // x3

  v3 = *a1;
  result = -1;
  v5 = *(_QWORD *)(v3 - 24);
  if ( v5 != 0 )
  {
    v6 = v5 - 1;
    if ( a3 > v6 )
      result = v6;
    else
      result = a3;
    while ( result != -1 && *(unsigned __int8 *)(v3 + result) != a2 )
      --result;
  }
  return result;
}


// Address: 0x1669C | Function: sub_1669C
__int64 __fastcall sub_1669C(__int64 *a1, const void **a2, unsigned __int64 a3)
{
  __int64 v3; // x21
  const void *v4; // x20
  unsigned __int64 v5; // x19
  unsigned __int64 v6; // x22
  size_t v7; // x23

  v3 = *a1;
  v4 = *a2;
  v5 = a3;
  v6 = *(_QWORD *)(*a1 - 24);
  v7 = *((_QWORD *)*a2 - 3);
  if ( a3 >= v6 )
    return -1;
  while ( memchr(v4, *(unsigned __int8 *)(v3 + v5), v7) != nullptr )
  {
    if ( ++v5 >= v6 )
      return -1;
  }
  return v5;
}


// Address: 0x16720 | Function: sub_16720
unsigned __int64 __fastcall sub_16720(__int64 *a1, void *a2, unsigned __int64 a3, size_t a4)
{
  __int64 v4; // x20
  unsigned __int64 v5; // x19
  unsigned __int64 v7; // x21

  v4 = *a1;
  v5 = a3;
  v7 = *(_QWORD *)(*a1 - 24);
  if ( a3 >= v7 )
    return -1;
  while ( memchr(a2, *(unsigned __int8 *)(v4 + v5), a4) != nullptr )
  {
    if ( ++v5 >= v7 )
      return -1;
  }
  return v5;
}


// Address: 0x167A4 | Function: sub_167A4
unsigned __int64 __fastcall sub_167A4(__int64 *a1, char *a2, unsigned __int64 a3)
{
  size_t v6; // x0
  __int64 v7; // x20
  size_t v8; // x23
  unsigned __int64 v9; // x22

  v6 = strlen(a2);
  v7 = *a1;
  v8 = v6;
  v9 = *(_QWORD *)(v7 - 24);
  if ( a3 >= v9 )
    return -1;
  while ( memchr(a2, *(unsigned __int8 *)(v7 + a3), v8) != nullptr )
  {
    if ( ++a3 >= v9 )
      return -1;
  }
  return a3;
}


// Address: 0x16834 | Function: sub_16834
__int64 __fastcall sub_16834(__int64 *a1, unsigned __int8 a2, unsigned __int64 a3)
{
  __int64 v3; // x3
  unsigned __int64 v4; // x4
  int v5; // w5

  v3 = *a1;
  v4 = *(_QWORD *)(*a1 - 24);
  if ( a3 >= v4 )
    return -1;
  v5 = *(unsigned __int8 *)(v3 + a3);
  if ( v5 == a2 )
  {
    while ( ++a3 < v4 )
    {
      if ( *(unsigned __int8 *)(v3 + a3) != v5 )
        return a3;
    }
    return -1;
  }
  return a3;
}


// Address: 0x16880 | Function: sub_16880
__int64 __fastcall sub_16880(__int64 *a1, const void **a2, unsigned __int64 a3)
{
  __int64 v3; // x21
  __int64 result; // x0
  _QWORD *v5; // x20
  __int64 v6; // x1
  size_t v7; // x22
  unsigned __int64 v8; // x19

  v3 = *a1;
  result = -1;
  v5 = *a2;
  v6 = *(_QWORD *)(v3 - 24);
  v7 = *(v5 - 3);
  if ( v6 != 0 )
  {
    if ( a3 > v6 - 1 )
      v8 = v6 - 1;
    else
      v8 = a3;
    do
    {
      if ( memchr(v5, *(unsigned __int8 *)(v3 + v8), v7) == nullptr )
        break;
      --v8;
    }
    while ( v8 != -1 );
    return v8;
  }
  return result;
}


// Address: 0x168FC | Function: sub_168FC
unsigned __int64 __fastcall sub_168FC(__int64 *a1, void *a2, unsigned __int64 a3, size_t a4)
{
  __int64 v4; // x20
  unsigned __int64 result; // x0
  __int64 v6; // x4
  unsigned __int64 v9; // x19

  v4 = *a1;
  result = -1;
  v6 = *(_QWORD *)(v4 - 24);
  if ( v6 != 0 )
  {
    if ( a3 > v6 - 1 )
      v9 = v6 - 1;
    else
      v9 = a3;
    while ( 1 )
    {
      if ( memchr(a2, *(unsigned __int8 *)(v4 + v9), a4) == nullptr )
        return v9;
      if ( v9 == 0 )
        break;
      --v9;
    }
    return -1;
  }
  return result;
}


// Address: 0x1698C | Function: sub_1698C
unsigned __int64 __fastcall sub_1698C(__int64 *a1, char *a2, unsigned __int64 a3)
{
  size_t v5; // x0
  __int64 v6; // x20
  size_t v7; // x22
  unsigned __int64 result; // x0
  __int64 v9; // x1
  unsigned __int64 v10; // x1
  unsigned __int64 v11; // x19

  v5 = strlen(a2);
  v6 = *a1;
  v7 = v5;
  result = -1;
  v9 = *(_QWORD *)(v6 - 24);
  if ( v9 != 0 )
  {
    v10 = v9 - 1;
    if ( a3 > v10 )
      v11 = v10;
    else
      v11 = a3;
    do
    {
      if ( memchr(a2, *(unsigned __int8 *)(v6 + v11), v7) == nullptr )
        break;
      --v11;
    }
    while ( v11 != -1 );
    return v11;
  }
  return result;
}


// Address: 0x16A1C | Function: sub_16A1C
__int64 __fastcall sub_16A1C(__int64 *a1, unsigned __int8 a2, unsigned __int64 a3)
{
  __int64 v3; // x4
  __int64 result; // x0
  __int64 v5; // x3
  unsigned __int64 v6; // x3

  v3 = *a1;
  result = -1;
  v5 = *(_QWORD *)(v3 - 24);
  if ( v5 != 0 )
  {
    v6 = v5 - 1;
    if ( a3 > v6 )
      result = v6;
    else
      result = a3;
    while ( *(unsigned __int8 *)(v3 + result) == a2 )
    {
      if ( result == 0 )
        return -1;
      --result;
    }
  }
  return result;
}


// Address: 0x16A68 | Function: sub_16A68
_QWORD *__usercall sub_16A68@<X0>(
        __int64 *a1@<X0>,
        unsigned __int64 a2@<X1>,
        unsigned __int64 a3@<X2>,
        _QWORD *a4@<X8>)
{
  unsigned __int64 v4; // x6

  v4 = *(_QWORD *)(*a1 - 24);
  if ( a2 > v4 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::substr", a2, v4);
  sub_14A3C(a4, a1, a2, a3);
  return a4;
}


// Address: 0x16ACC | Function: sub_16ACC
__int64 __fastcall sub_16ACC(const void **a1, const void **a2)
{
  size_t v2; // x20
  const void *v3; // x1
  size_t v4; // x19
  const void *v5; // x0
  size_t v6; // x2
  __int64 result; // x0
  __int64 v8; // x19

  v2 = *((_QWORD *)*a2 - 3);
  v3 = *a2;
  v4 = *((_QWORD *)*a1 - 3);
  v5 = *a1;
  if ( v2 > v4 )
    v6 = v4;
  else
    v6 = v2;
  result = memcmp(v5, v3, v6);
  if ( (_DWORD)result == 0 )
  {
    result = 0x7FFFFFFF;
    v8 = v4 - v2;
    if ( v8 <= 0x7FFFFFFF )
    {
      if ( v8 >= (__int64)0xFFFFFFFF80000000LL )
        return (unsigned int)v8;
      else
        return 0x80000000LL;
    }
  }
  return result;
}


// Address: 0x16B34 | Function: sub_16B34
__int64 __fastcall sub_16B34(__int64 *a1, unsigned __int64 a2, size_t a3, const void **a4)
{
  __int64 v4; // x0
  unsigned __int64 v5; // x4
  _QWORD *v6; // x3
  size_t v7; // x4
  const void *v8; // x0
  size_t v9; // x19
  size_t v10; // x20
  size_t v11; // x2
  __int64 result; // x0
  __int64 v13; // x19

  v4 = *a1;
  v5 = *(_QWORD *)(v4 - 24);
  if ( a2 > v5 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::compare", a2, v5);
  v6 = *a4;
  v7 = v5 - a2;
  v8 = (const void *)(v4 + a2);
  if ( v7 > a3 )
    v9 = a3;
  else
    v9 = v7;
  v10 = *(v6 - 3);
  if ( v9 > v10 )
    v11 = *(v6 - 3);
  else
    v11 = v9;
  result = memcmp(v8, v6, v11);
  if ( (_DWORD)result == 0 )
  {
    result = 0x7FFFFFFF;
    v13 = v9 - v10;
    if ( v13 <= 0x7FFFFFFF )
    {
      if ( v13 >= (__int64)0xFFFFFFFF80000000LL )
        return (unsigned int)v13;
      else
        return 0x80000000LL;
    }
  }
  return result;
}


// Address: 0x16BD0 | Function: sub_16BD0
__int64 __fastcall sub_16BD0(__int64 *a1, unsigned __int64 a2, size_t a3, __int64 *a4, unsigned __int64 a5, size_t a6)
{
  __int64 v7; // x0
  unsigned __int64 v8; // x19
  __int64 v9; // x1
  unsigned __int64 v10; // x3
  size_t v11; // x19
  size_t v12; // x3
  const void *v13; // x0
  size_t v14; // x20
  const void *v15; // x1
  size_t v16; // x2
  __int64 result; // x0
  __int64 v18; // x19

  v7 = *a1;
  v8 = *(_QWORD *)(v7 - 24);
  if ( a2 > v8 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::compare", a2, v8);
  v9 = *a4;
  v10 = *(_QWORD *)(*a4 - 24);
  if ( a5 > v10 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::compare", a5, v10);
  v11 = v8 - a2;
  v12 = v10 - a5;
  v13 = (const void *)(v7 + a2);
  if ( v11 > a3 )
    v11 = a3;
  if ( v12 > a6 )
    v14 = a6;
  else
    v14 = v12;
  v15 = (const void *)(v9 + a5);
  if ( v11 > v14 )
    v16 = v14;
  else
    v16 = v11;
  result = memcmp(v13, v15, v16);
  if ( (_DWORD)result == 0 )
  {
    result = 0x7FFFFFFF;
    v18 = v11 - v14;
    if ( v18 <= 0x7FFFFFFF )
    {
      if ( v18 >= (__int64)0xFFFFFFFF80000000LL )
        return (unsigned int)v18;
      else
        return 0x80000000LL;
    }
  }
  return result;
}


// Address: 0x16C98 | Function: sub_16C98
__int64 __fastcall sub_16C98(const void **a1, char *a2)
{
  _QWORD *v2; // x21
  size_t v3; // x0
  size_t v4; // x19
  size_t v5; // x20
  size_t v6; // x2
  __int64 result; // x0
  __int64 v8; // x19

  v2 = *a1;
  v3 = strlen(a2);
  v4 = *(v2 - 3);
  v5 = v3;
  if ( v3 > v4 )
    v6 = *(v2 - 3);
  else
    v6 = v3;
  result = memcmp(v2, a2, v6);
  if ( (_DWORD)result == 0 )
  {
    result = 0x7FFFFFFF;
    v8 = v4 - v5;
    if ( v8 <= 0x7FFFFFFF )
    {
      if ( v8 >= (__int64)0xFFFFFFFF80000000LL )
        return (unsigned int)v8;
      else
        return 0x80000000LL;
    }
  }
  return result;
}


// Address: 0x16D14 | Function: sub_16D14
__int64 __fastcall sub_16D14(__int64 *a1, unsigned __int64 a2, size_t a3, char *a4)
{
  __int64 v4; // x22
  unsigned __int64 v6; // x4
  size_t v7; // x4
  size_t v8; // x19
  size_t v9; // x0
  size_t v10; // x21
  size_t v11; // x2
  __int64 result; // x0
  __int64 v13; // x19

  v4 = *a1;
  v6 = *(_QWORD *)(*a1 - 24);
  if ( a2 > v6 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::compare", a2, v6);
  v7 = v6 - a2;
  if ( v7 > a3 )
    v8 = a3;
  else
    v8 = v7;
  v9 = strlen(a4);
  v10 = v9;
  if ( v9 > v8 )
    v11 = v8;
  else
    v11 = v9;
  result = memcmp((const void *)(v4 + a2), a4, v11);
  if ( (_DWORD)result == 0 )
  {
    result = 0x7FFFFFFF;
    v13 = v8 - v10;
    if ( v13 <= 0x7FFFFFFF )
    {
      if ( v13 >= (__int64)0xFFFFFFFF80000000LL )
        return (unsigned int)v13;
      else
        return 0x80000000LL;
    }
  }
  return result;
}


// Address: 0x16DC8 | Function: sub_16DC8
__int64 __fastcall sub_16DC8(__int64 *a1, unsigned __int64 a2, size_t a3, void *a4, size_t a5)
{
  __int64 v5; // x0
  unsigned __int64 v6; // x5
  size_t v7; // x5
  const void *v8; // x0
  size_t v9; // x19
  size_t v10; // x2
  __int64 result; // x0
  __int64 v12; // x19

  v5 = *a1;
  v6 = *(_QWORD *)(v5 - 24);
  if ( a2 > v6 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::compare", a2, v6);
  v7 = v6 - a2;
  v8 = (const void *)(v5 + a2);
  if ( v7 > a3 )
    v9 = a3;
  else
    v9 = v7;
  if ( v9 > a5 )
    v10 = a5;
  else
    v10 = v9;
  result = memcmp(v8, a4, v10);
  if ( (_DWORD)result == 0 )
  {
    result = 0x7FFFFFFF;
    v12 = v9 - a5;
    if ( v12 <= 0x7FFFFFFF )
    {
      if ( v12 >= (__int64)0xFFFFFFFF80000000LL )
        return (unsigned int)v12;
      else
        return 0x80000000LL;
    }
  }
  return result;
}


// Address: 0x16E64 | Function: sub_16E64
_QWORD *__fastcall sub_16E64(_QWORD *result, __int64 a2)
{
  *result = a2;
  return result;
}


// Address: 0x16E6C | Function: sub_16E6C
void *sub_16E6C()
{
  return &unk_4C7C0;
}


// Address: 0x16E78 | Function: sub_16E78
__int64 __fastcall sub_16E78(__int64 a1)
{
  return *(_DWORD *)(a1 + 16) >> 31;
}


// Address: 0x16E84 | Function: sub_16E84
bool __fastcall sub_16E84(__int64 a1)
{
  return *(_DWORD *)(a1 + 16) > 0;
}


// Address: 0x16E94 | Function: sub_16E94
__int64 __fastcall sub_16E94(__int64 result)
{
  *(_DWORD *)(result + 16) = -1;
  return result;
}


// Address: 0x16EA0 | Function: sub_16EA0
__int64 __fastcall sub_16EA0(__int64 result)
{
  *(_DWORD *)(result + 16) = 0;
  return result;
}


// Address: 0x16EA8 | Function: sub_16EA8
__int64 __fastcall sub_16EA8(__int64 result, __int64 a2)
{
  if ( (_UNKNOWN *)result != &unk_4C7C0 )
  {
    *(_DWORD *)(result + 16) = 0;
    *(_QWORD *)result = a2;
    *(_BYTE *)(result + a2 + 24) = 0;
  }
  return result;
}


// Address: 0x16ED0 | Function: sub_16ED0
__int64 __fastcall sub_16ED0(__int64 a1)
{
  return a1 + 24;
}


// Address: 0x16ED8 | Function: sub_16ED8
__int64 __fastcall sub_16ED8(unsigned __int64 a1, unsigned __int64 a2)
{
  unsigned __int64 v2; // x19
  bool v3; // cc
  unsigned __int64 v4; // x0
  __int64 result; // x0

  v2 = a1;
  if ( a1 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  v3 = a1 > a2;
  v4 = a1 + 25;
  if ( v3 )
  {
    if ( v2 < 2 * a2 )
      v2 = 2 * a2;
    if ( v2 + 57 > 0x1000 && a2 < v2 )
    {
      v2 = v2 + 4096 - (((_WORD)v2 + 57) & 0xFFF);
      if ( v2 > 0x3FFFFFFFFFFFFFF9LL )
        v2 = 0x3FFFFFFFFFFFFFF9LL;
    }
    v4 = v2 + 25;
  }
  result = operator new(v4);
  *(_QWORD *)(result + 8) = v2;
  *(_DWORD *)(result + 16) = 0;
  return result;
}


// Address: 0x16F70 | Function: sub_16F70
int *__fastcall sub_16F70(__int64 *a1, size_t a2, __int64 a3, __int64 a4)
{
  int *v4; // x4
  __int64 v6; // x21
  __int64 v7; // x2
  unsigned __int64 v9; // x1
  unsigned __int64 v10; // x21
  size_t v12; // x19
  __int64 v13; // x0
  __int64 v14; // x24
  __int64 v15; // x3
  __int64 v16; // x25
  void *v17; // x0
  int *v18; // x1
  size_t v19; // x3
  size_t v20; // x20
  int *v21; // x1
  void *v22; // x0
  int *result; // x0
  size_t v24; // x3
  unsigned int *v25; // x1
  int v26; // w2

  v4 = (int *)*a1;
  v6 = a4 - a3;
  v7 = *(_QWORD *)(*a1 - 24);
  v9 = *(_QWORD *)(*a1 - 16);
  v10 = v6 + v7;
  v12 = v7 - a2 - a3;
  if ( v10 <= v9 && *(v4 - 2) <= 0 )
  {
    if ( a3 != a4 && v12 != 0 )
    {
      v24 = a4 + a2;
      if ( v12 == 1 )
        *((_BYTE *)v4 + v24) = *((_BYTE *)v4 + a3 + a2);
      else
        memmove((char *)v4 + v24, (char *)v4 + a3 + a2, v7 - a2 - a3);
      v4 = (int *)*a1;
    }
    result = v4 - 6;
    if ( v4 - 6 != (int *)&unk_4C7C0 )
      goto LABEL_11;
    return result;
  }
  v13 = sub_16ED8(v10, v9);
  v14 = v13;
  v15 = a4;
  v16 = v13 + 24;
  if ( a2 != 0 )
  {
    v17 = (void *)(v13 + 24);
    v18 = (int *)*a1;
    if ( a2 != 1 )
    {
      v16 = v14 + 24;
      memcpy(v17, v18, a2);
      v15 = a4;
      if ( v12 == 0 )
        goto LABEL_9;
      goto LABEL_7;
    }
    v16 = v14 + 24;
    *(_BYTE *)(v14 + 24) = *(_BYTE *)v18;
  }
  if ( v12 != 0 )
  {
LABEL_7:
    v19 = a2 + 24 + v15;
    v20 = a3 + a2;
    if ( v12 == 1 )
      *(_BYTE *)(v14 + v19) = *(_BYTE *)(*a1 + v20);
    else
      memcpy((void *)(v14 + v19), (const void *)(*a1 + v20), v12);
  }
LABEL_9:
  v21 = (int *)*a1;
  v22 = (void *)(*a1 - 24);
  if ( v22 != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v25 = (unsigned int *)(v21 - 2);
      do
        v26 = __ldaxr(v25);
      while ( __stlxr(v26 - 1, v25) != 0 );
    }
    else
    {
      v26 = *(v21 - 2);
      *(v21 - 2) = v26 - 1;
    }
    if ( v26 <= 0 )
      operator delete(v22);
  }
  v4 = (int *)v16;
  result = (int *)(v16 - 24);
  *a1 = v16;
  if ( (_UNKNOWN *)(v16 - 24) != &unk_4C7C0 )
  {
LABEL_11:
    *((_QWORD *)v4 - 3) = v10;
    *(v4 - 2) = 0;
    *((_BYTE *)v4 + v10) = 0;
  }
  return result;
}


// Address: 0x17160 | Function: sub_17160
__int64 *__fastcall sub_17160(__int64 *result)
{
  __int64 v1; // x1
  __int64 *v2; // x19

  v1 = *result;
  if ( (_UNKNOWN *)(*result - 24) != &unk_4C7C0 )
  {
    if ( *(int *)(v1 - 8) > 0 )
    {
      v2 = result;
      sub_16F70(result, 0, 0, 0);
      v1 = *v2;
    }
    *(_DWORD *)(v1 - 8) = -1;
    return (__int64 *)0xFFFFFFFFLL;
  }
  return result;
}


// Address: 0x171BC | Function: sub_171BC
__int64 *__fastcall sub_171BC(__int64 *result)
{
  __int64 v1; // x1
  int v2; // w4
  __int64 *v3; // x19

  v1 = *result;
  v2 = *(_DWORD *)(*result - 8);
  if ( (v2 & 0x80000000) == 0 && (_UNKNOWN *)(*result - 24) != &unk_4C7C0 )
  {
    if ( v2 != 0 )
    {
      v3 = result;
      sub_16F70(result, 0, 0, 0);
      v1 = *v3;
    }
    *(_DWORD *)(v1 - 8) = -1;
    return (__int64 *)0xFFFFFFFFLL;
  }
  return result;
}


// Address: 0x17218 | Function: sub_17218
int *__fastcall sub_17218(__int64 *a1)
{
  return sub_16F70(a1, 0, *(_QWORD *)(*a1 - 24), 0);
}


// Address: 0x1722C | Function: sub_1722C
__int64 *__fastcall sub_1722C(__int64 *a1, size_t a2, unsigned __int64 a3)
{
  size_t v4; // x3

  v4 = *(_QWORD *)(*a1 - 24);
  if ( a2 > v4 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::erase", a2, v4);
  if ( v4 - a2 <= a3 )
    a3 = v4 - a2;
  sub_16F70(a1, a2, a3, 0);
  return a1;
}


// Address: 0x1728C | Function: sub_1728C
size_t __fastcall sub_1728C(__int64 *a1, __int64 a2)
{
  size_t v3; // x19
  size_t result; // x0

  v3 = a2 - *a1;
  sub_16F70(a1, v3, 1, 0);
  result = *a1 + v3;
  *(_DWORD *)(*a1 - 8) = -1;
  return result;
}


// Address: 0x172D0 | Function: sub_172D0
size_t __fastcall sub_172D0(__int64 *a1, size_t a2, __int64 a3)
{
  __int64 v3; // x2
  size_t v6; // x19

  v3 = a3 - a2;
  if ( v3 != 0 )
  {
    v6 = a2 - *a1;
    sub_16F70(a1, v6, v3, 0);
    a2 = *a1 + v6;
    *(_DWORD *)(*a1 - 8) = -1;
  }
  return a2;
}


// Address: 0x1732C | Function: sub_1732C
__int64 *__fastcall sub_1732C(__int64 *a1, size_t a2, __int64 a3, unsigned __int64 a4, unsigned __int8 a5)
{
  int v5; // w22

  v5 = a5;
  if ( a4 > 0x3FFFFFFFFFFFFFF9LL - *(_QWORD *)(*a1 - 24) + a3 )
    sub_1A3F8("basic_string::_M_replace_aux");
  sub_16F70(a1, a2, a3, a4);
  if ( a4 == 0 )
    return a1;
  if ( a4 != 1 )
  {
    memset((void *)(*a1 + a2), v5, a4);
    return a1;
  }
  *(_BYTE *)(*a1 + a2) = v5;
  return a1;
}


// Address: 0x173C8 | Function: sub_173C8
__int64 *__fastcall sub_173C8(__int64 *a1, size_t a2, __int64 a3, _BYTE *a4, size_t a5)
{
  sub_16F70(a1, a2, a3, a5);
  if ( a5 == 0 )
    return a1;
  if ( a5 != 1 )
  {
    memcpy((void *)(*a1 + a2), a4, a5);
    return a1;
  }
  *(_BYTE *)(*a1 + a2) = *a4;
  return a1;
}


// Address: 0x17444 | Function: sub_17444
__int64 *__fastcall sub_17444(__int64 *a1, _BYTE *a2, size_t a3)
{
  _BYTE *v5; // x0
  _BYTE *v7; // x3
  __int64 v8; // x4
  _BYTE *v10; // x0

  v5 = (_BYTE *)*a1;
  v7 = v5 - 24;
  v8 = *((_QWORD *)v5 - 3);
  if ( a3 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::assign");
  if ( a2 >= v5 && a2 <= &v5[v8] && *((int *)v5 - 2) <= 0 )
  {
    if ( a3 <= a2 - v5 )
    {
      if ( a3 != 1 )
      {
        memcpy(v5, a2, a3);
        v5 = (_BYTE *)*a1;
        v7 = (_BYTE *)(*a1 - 24);
        goto LABEL_11;
      }
      goto LABEL_10;
    }
    if ( a2 != v5 )
    {
      if ( a3 == 1 )
      {
LABEL_10:
        *v5 = *a2;
        v5 = (_BYTE *)*a1;
        v7 = (_BYTE *)(*a1 - 24);
        goto LABEL_11;
      }
      memmove(v5, a2, a3);
      v5 = (_BYTE *)*a1;
      v7 = (_BYTE *)(*a1 - 24);
    }
LABEL_11:
    if ( v7 != (_BYTE *)&unk_4C7C0 )
    {
      *((_DWORD *)v5 - 2) = 0;
      *((_QWORD *)v5 - 3) = a3;
      v5[a3] = 0;
    }
    return a1;
  }
  sub_16F70(a1, 0, v8, a3);
  if ( a3 != 0 )
  {
    v10 = (_BYTE *)*a1;
    if ( a3 == 1 )
      *v10 = *a2;
    else
      memcpy(v10, a2, a3);
  }
  return a1;
}


// Address: 0x1756C | Function: sub_1756C
__int64 *__fastcall sub_1756C(__int64 *a1, _BYTE *a2, size_t a3)
{
  sub_17444(a1, a2, a3);
  return a1;
}


// Address: 0x17590 | Function: sub_17590
__int64 *__fastcall sub_17590(__int64 *a1, __int64 *a2, unsigned __int64 a3, size_t a4)
{
  __int64 v4; // x5
  unsigned __int64 v6; // x4
  size_t v7; // x2
  _BYTE *v8; // x1

  v4 = *a2;
  v6 = *(_QWORD *)(v4 - 24);
  if ( a3 > v6 )
    sub_1A560(
      "%s: __pos (which is %zu) > this->size() (which is %zu)",
      "basic_string::assign",
      a3,
      *(_QWORD *)(v4 - 24));
  v7 = v6 - a3;
  v8 = (_BYTE *)(v4 + a3);
  if ( v7 > a4 )
    v7 = a4;
  return sub_17444(a1, v8, v7);
}


// Address: 0x175DC | Function: sub_175DC
__int64 *__fastcall sub_175DC(__int64 *a1, char *a2)
{
  size_t v3; // x0

  v3 = strlen(a2);
  return sub_17444(a1, a2, v3);
}


// Address: 0x17610 | Function: sub_17610
__int64 *__fastcall sub_17610(__int64 *a1, char *a2)
{
  size_t v3; // x0

  v3 = strlen(a2);
  return sub_17444(a1, a2, v3);
}


// Address: 0x17644 | Function: sub_17644
// attributes: thunk
__int64 *__fastcall sub_17644(__int64 *a1, _BYTE *a2, size_t a3)
{
  return sub_17444(a1, a2, a3);
}


// Address: 0x17648 | Function: sub_17648
__int64 *__fastcall sub_17648(__int64 *a1, size_t a2, _BYTE *a3, unsigned __int64 a4)
{
  unsigned __int64 v4; // x5
  size_t v5; // x4
  _BYTE *v11; // x20
  __int64 v12; // x0
  _BYTE *v13; // x1
  _BYTE *v14; // x3
  __int64 v15; // x23

  v4 = *a1;
  v5 = *(_QWORD *)(*a1 - 24);
  if ( a2 > v5 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::insert", a2, v5);
  if ( a4 > 0x3FFFFFFFFFFFFFF9LL - v5 )
    sub_1A3F8("basic_string::insert");
  if ( (unsigned __int64)a3 < v4 || (unsigned __int64)a3 > v4 + v5 || *(int *)(v4 - 8) > 0 )
  {
    sub_16F70(a1, a2, 0, a4);
    if ( a4 != 0 )
    {
      if ( a4 == 1 )
        *(_BYTE *)(*a1 + a2) = *a3;
      else
        memcpy((void *)(*a1 + a2), a3, a4);
    }
    return a1;
  }
  v11 = &a3[-v4];
  sub_16F70(a1, a2, 0, a4);
  v12 = *a1;
  v13 = &v11[*a1];
  v14 = (_BYTE *)(*a1 + a2);
  if ( v14 < &v13[a4] )
  {
    if ( v13 >= v14 )
    {
      if ( a4 == 1 )
        *(_BYTE *)(v12 + a2) = v13[1];
      else
        memcpy((void *)(*a1 + a2), &v13[a4], a4);
    }
    else
    {
      v15 = v14 - v13;
      if ( v14 - v13 == 1 )
        *(_BYTE *)(v12 + a2) = v11[v12];
      else
        v14 = memcpy((void *)(*a1 + a2), v13, v14 - v13);
      if ( a4 - v15 == 1 )
        v14[v15] = v14[a4];
      else
        memcpy(&v14[v15], &v14[a4], a4 - v15);
    }
    return a1;
  }
  if ( a4 == 1 )
    *(_BYTE *)(v12 + a2) = v11[v12];
  else
    memcpy((void *)(*a1 + a2), v13, a4);
  return a1;
}


// Address: 0x17824 | Function: sub_17824
__int64 *__fastcall sub_17824(__int64 *a1, __int64 a2, _BYTE *a3, unsigned __int64 a4)
{
  return sub_17648(a1, a2 - *a1, a3, a4);
}


// Address: 0x17830 | Function: sub_17830
__int64 *__fastcall sub_17830(__int64 *a1, size_t a2, __int64 *a3, unsigned __int64 a4, unsigned __int64 a5)
{
  __int64 v5; // x2
  unsigned __int64 v6; // x5
  unsigned __int64 v7; // x5
  _BYTE *v8; // x2
  unsigned __int64 v9; // x3

  v5 = *a3;
  v6 = *(_QWORD *)(v5 - 24);
  if ( a4 > v6 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::insert", a4, v6);
  v7 = v6 - a4;
  v8 = (_BYTE *)(v5 + a4);
  if ( v7 > a5 )
    v9 = a5;
  else
    v9 = v7;
  return sub_17648(a1, a2, v8, v9);
}


// Address: 0x1787C | Function: sub_1787C
__int64 *__fastcall sub_1787C(__int64 *a1, size_t a2, char *a3)
{
  size_t v4; // x0

  v4 = strlen(a3);
  return sub_17648(a1, a2, a3, v4);
}


// Address: 0x178B8 | Function: sub_178B8
__int64 *__fastcall sub_178B8(__int64 *a1, size_t a2, _BYTE **a3)
{
  return sub_17648(a1, a2, *a3, *((_QWORD *)*a3 - 3));
}


// Address: 0x178C4 | Function: sub_178C4
int *__fastcall sub_178C4(__int64 *a1)
{
  __int64 v1; // x3

  v1 = *(_QWORD *)(*a1 - 24);
  if ( v1 == 0 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::erase", 0xFFFFFFFFFFFFFFFFLL, 0);
  return sub_16F70(a1, v1 - 1, 1, 0);
}


// Address: 0x17908 | Function: sub_17908
int **__fastcall sub_17908(int **result, size_t a2, unsigned __int8 a3)
{
  unsigned __int64 v3; // x4
  size_t v4; // x1

  v3 = *((_QWORD *)*result - 3);
  if ( a2 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::resize");
  if ( a2 > v3 )
  {
    v4 = a2 - v3;
    if ( v4 != 0 )
      return (int **)sub_15654(result, v4, a3);
  }
  else if ( a2 < v3 )
  {
    return (int **)sub_16F70((__int64 *)result, a2, v3 - a2, 0);
  }
  return result;
}


// Address: 0x1796C | Function: sub_1796C
int **__fastcall sub_1796C(int **a1, size_t a2)
{
  return sub_17908(a1, a2, 0);
}


// Address: 0x17974 | Function: sub_17974
__int64 __fastcall sub_17974(__int64 *a1)
{
  __int64 v1; // x1
  int v2; // w4

  v1 = *a1;
  v2 = *(_DWORD *)(*a1 - 8);
  if ( (v2 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v2 != 0 )
    {
      sub_16F70(a1, 0, 0, 0);
      v1 = *a1;
    }
    *(_DWORD *)(v1 - 8) = -1;
  }
  return v1;
}


// Address: 0x179D4 | Function: sub_179D4
__int64 __fastcall sub_179D4(__int64 *a1)
{
  __int64 v1; // x1
  int v2; // w4

  v1 = *a1;
  v2 = *(_DWORD *)(*a1 - 8);
  if ( (v2 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v2 != 0 )
    {
      sub_16F70(a1, 0, 0, 0);
      v1 = *a1;
    }
    *(_DWORD *)(v1 - 8) = -1;
  }
  return v1;
}


// Address: 0x17A34 | Function: sub_17A34
__int64 __fastcall sub_17A34(__int64 *a1, __int64 a2)
{
  __int64 v3; // x1
  int v5; // w3

  v3 = *a1;
  v5 = *(_DWORD *)(*a1 - 8);
  if ( (v5 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v5 != 0 )
    {
      sub_16F70(a1, 0, 0, 0);
      v3 = *a1;
    }
    *(_DWORD *)(v3 - 8) = -1;
  }
  return v3 + a2;
}


// Address: 0x17A98 | Function: sub_17A98
__int64 *__usercall sub_17A98@<X0>(__int64 *a1@<X0>, __int64 *a2@<X8>)
{
  __int64 v2; // x1
  int v4; // w3
  __int64 *v6; // [xsp+28h] [xbp+28h]

  v2 = *a1;
  v4 = *(_DWORD *)(*a1 - 8);
  if ( (v4 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v4 != 0 )
    {
      v6 = a2;
      sub_16F70(a1, 0, 0, 0);
      v2 = *a1;
      a2 = v6;
    }
    *(_DWORD *)(v2 - 8) = -1;
  }
  *a2 = v2;
  return a2;
}


// Address: 0x17B04 | Function: sub_17B04
__int64 __fastcall sub_17B04(__int64 *a1)
{
  __int64 v1; // x1
  int v2; // w4

  v1 = *a1;
  v2 = *(_DWORD *)(*a1 - 8);
  if ( (v2 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v2 != 0 )
    {
      sub_16F70(a1, 0, 0, 0);
      v1 = *a1;
    }
    *(_DWORD *)(v1 - 8) = -1;
  }
  return v1 + *(_QWORD *)(v1 - 24);
}


// Address: 0x17B68 | Function: sub_17B68
_QWORD *__usercall sub_17B68@<X0>(__int64 *a1@<X0>, _QWORD *a2@<X8>)
{
  __int64 v2; // x1
  int v4; // w3
  _QWORD *v6; // [xsp+28h] [xbp+28h]

  v2 = *a1;
  v4 = *(_DWORD *)(*a1 - 8);
  if ( (v4 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v4 != 0 )
    {
      v6 = a2;
      sub_16F70(a1, 0, 0, 0);
      v2 = *a1;
      a2 = v6;
    }
    *(_DWORD *)(v2 - 8) = -1;
  }
  *a2 = v2 + *(_QWORD *)(v2 - 24);
  return a2;
}


// Address: 0x17BDC | Function: sub_17BDC
__int64 __fastcall sub_17BDC(__int64 *a1)
{
  __int64 v1; // x1
  int v2; // w4
  __int64 v3; // x19

  v1 = *a1;
  v2 = *(_DWORD *)(*a1 - 8);
  v3 = *(_QWORD *)(*a1 - 24) - 1LL;
  if ( (v2 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v2 != 0 )
    {
      sub_16F70(a1, 0, 0, 0);
      v1 = *a1;
    }
    *(_DWORD *)(v1 - 8) = -1;
  }
  return v1 + v3;
}


// Address: 0x17C44 | Function: sub_17C44
unsigned __int64 __fastcall sub_17C44(__int64 *a1, unsigned __int64 a2)
{
  __int64 v2; // x3
  unsigned __int64 v4; // x2
  int v6; // w2

  v2 = *a1;
  v4 = *(_QWORD *)(*a1 - 24);
  if ( a2 >= v4 )
    sub_1A560("basic_string::at: __n (which is %zu) >= this->size() (which is %zu)", a2, v4);
  v6 = *(_DWORD *)(v2 - 8);
  if ( (v6 & 0x80000000) == 0 && (_UNKNOWN *)(*a1 - 24) != &unk_4C7C0 )
  {
    if ( v6 != 0 )
    {
      sub_16F70(a1, 0, 0, 0);
      v2 = *a1;
    }
    *(_DWORD *)(v2 - 8) = -1;
  }
  return v2 + a2;
}


// Address: 0x17CC0 | Function: sub_17CC0
__int64 *__fastcall sub_17CC0(__int64 *a1, char a2)
{
  sub_16F70(a1, 0, *(_QWORD *)(*a1 - 24), 1);
  *(_BYTE *)*a1 = a2;
  return a1;
}


// Address: 0x17D00 | Function: sub_17D00
size_t __fastcall sub_17D00(__int64 *a1, __int64 a2, char a3)
{
  size_t v4; // x20
  size_t result; // x0

  v4 = a2 - *a1;
  if ( *(_QWORD *)(*a1 - 24) == 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_M_replace_aux");
  sub_16F70(a1, v4, 0, 1);
  *(_BYTE *)(*a1 + v4) = a3;
  result = *a1 + v4;
  *(_DWORD *)(*a1 - 8) = -1;
  return result;
}


// Address: 0x17D78 | Function: sub_17D78
__int64 *__fastcall sub_17D78(__int64 *a1, size_t a2, unsigned __int8 a3)
{
  int v5; // w21
  _BYTE *v6; // x0

  v5 = a3;
  if ( a2 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_M_replace_aux");
  sub_16F70(a1, 0, *(_QWORD *)(*a1 - 24), a2);
  if ( a2 == 0 )
    return a1;
  v6 = (_BYTE *)*a1;
  if ( a2 != 1 )
  {
    memset(v6, v5, a2);
    return a1;
  }
  *v6 = v5;
  return a1;
}


// Address: 0x17E0C | Function: sub_17E0C
__int64 *__fastcall sub_17E0C(__int64 *a1, size_t a2, unsigned __int64 a3, unsigned __int8 a4)
{
  int v5; // w22
  size_t v7; // x3

  v5 = a4;
  v7 = *(_QWORD *)(*a1 - 24);
  if ( a2 > v7 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::insert", a2, v7);
  if ( a3 > 0x3FFFFFFFFFFFFFF9LL - v7 )
    sub_1A3F8("basic_string::_M_replace_aux");
  sub_16F70(a1, a2, 0, a3);
  if ( a3 == 0 )
    return a1;
  if ( a3 != 1 )
  {
    memset((void *)(*a1 + a2), v5, a3);
    return a1;
  }
  *(_BYTE *)(*a1 + a2) = v5;
  return a1;
}


// Address: 0x17ECC | Function: sub_17ECC
__int64 *__fastcall sub_17ECC(__int64 *a1, __int64 a2, __int64 a3, unsigned __int64 a4, unsigned __int8 a5)
{
  __int64 v5; // x2
  size_t v6; // x19
  int v9; // w22

  v5 = a3 - a2;
  v6 = a2 - *a1;
  v9 = a5;
  if ( a4 > 0x3FFFFFFFFFFFFFF9LL - *(_QWORD *)(*a1 - 24) + v5 )
    sub_1A3F8("basic_string::_M_replace_aux");
  sub_16F70(a1, v6, v5, a4);
  if ( a4 == 0 )
    return a1;
  if ( a4 != 1 )
  {
    memset((void *)(*a1 + v6), v9, a4);
    return a1;
  }
  *(_BYTE *)(*a1 + v6) = v9;
  return a1;
}


// Address: 0x17F70 | Function: sub_17F70
__int64 *__fastcall sub_17F70(__int64 *a1, size_t a2, unsigned __int64 a3, unsigned __int64 a4, unsigned __int8 a5)
{
  int v5; // w22
  size_t v8; // x6

  v5 = a5;
  v8 = *(_QWORD *)(*a1 - 24);
  if ( a2 > v8 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::replace", a2, v8);
  if ( v8 - a2 <= a3 )
    a3 = v8 - a2;
  if ( a4 > 0x3FFFFFFFFFFFFFF9LL - v8 + a3 )
    sub_1A3F8("basic_string::_M_replace_aux");
  sub_16F70(a1, a2, a3, a4);
  if ( a4 == 0 )
    return a1;
  if ( a4 != 1 )
  {
    memset((void *)(*a1 + a2), v5, a4);
    return a1;
  }
  *(_BYTE *)(*a1 + a2) = v5;
  return a1;
}


// Address: 0x1803C | Function: sub_1803C
int *__fastcall sub_1803C(__int64 *a1, __int64 a2, unsigned __int64 a3, unsigned __int8 a4)
{
  size_t v5; // x20
  int v7; // w22
  int *result; // x0

  v5 = a2 - *a1;
  v7 = a4;
  if ( a3 > 0x3FFFFFFFFFFFFFF9LL - *(_QWORD *)(*a1 - 24) )
    sub_1A3F8("basic_string::_M_replace_aux");
  result = sub_16F70(a1, v5, 0, a3);
  if ( a3 != 0 )
  {
    result = (int *)(*a1 + v5);
    if ( a3 == 1 )
      *(_BYTE *)(*a1 + v5) = v7;
    else
      return (int *)memset(result, v7, a3);
  }
  return result;
}


// Address: 0x180D4 | Function: sub_180D4
__int64 *__fastcall sub_180D4(__int64 *a1, size_t a2, unsigned __int64 a3, _BYTE *a4, unsigned __int64 a5)
{
  unsigned __int64 v6; // x1
  size_t v8; // x3
  __int64 v11; // x19
  _BYTE *v13; // x0
  _BYTE *v14; // x20
  _BYTE *v15; // x25
  _BYTE *v16; // x19
  unsigned int *v17; // x25
  int v18; // w0
  __int64 v19; // x0
  __int64 v20; // x24

  v6 = *a1;
  v8 = *(_QWORD *)(*a1 - 24);
  if ( a2 > v8 )
    sub_1A560("%s: __pos (which is %zu) > this->size() (which is %zu)", "basic_string::replace", a2, v8);
  v11 = v8 - a2;
  if ( v8 - a2 > a3 )
    v11 = a3;
  if ( a5 > 0x3FFFFFFFFFFFFFF9LL - v8 + v11 )
    sub_1A3F8("basic_string::replace");
  if ( (unsigned __int64)a4 < v6 || (unsigned __int64)a4 > v6 + v8 || *(int *)(v6 - 8) > 0 )
  {
    sub_16F70(a1, a2, v11, a5);
    if ( a5 != 0 )
    {
      if ( a5 == 1 )
        *(_BYTE *)(*a1 + a2) = *a4;
      else
        memcpy((void *)(*a1 + a2), a4, a5);
    }
    return a1;
  }
  v13 = &a4[a5];
  if ( (unsigned __int64)&a4[a5] <= v6 + a2 )
  {
    v14 = &a4[-v6];
    goto LABEL_13;
  }
  if ( (unsigned __int64)a4 < v6 + v11 + a2 )
  {
    if ( a4 == v13 )
    {
      v15 = &unk_4C7D8;
    }
    else
    {
      if ( v13 != nullptr && a4 == nullptr )
        sub_1A1DC("basic_string::_S_construct null not valid");
      v19 = sub_16ED8(a5, 0);
      v20 = v19;
      v15 = (_BYTE *)(v19 + 24);
      if ( a5 == 1 )
        *(_BYTE *)(v19 + 24) = *a4;
      else
        memcpy((void *)(v19 + 24), a4, a5);
      if ( (_UNKNOWN *)v20 != &unk_4C7C0 )
      {
        *(_DWORD *)(v20 + 16) = 0;
        *(_QWORD *)v20 = a5;
        *(_BYTE *)(v20 + a5 + 24) = 0;
      }
    }
    sub_16F70(a1, a2, v11, a5);
    if ( a5 != 0 )
    {
      if ( a5 == 1 )
        *(_BYTE *)(*a1 + a2) = *v15;
      else
        memcpy((void *)(*a1 + a2), v15, a5);
    }
    v16 = v15 - 24;
    if ( v15 - 24 != (_BYTE *)&unk_4C7C0 )
    {
      if ( &pthread_create != nullptr )
      {
        v17 = (unsigned int *)(v15 - 8);
        do
          v18 = __ldaxr(v17);
        while ( __stlxr(v18 - 1, v17) != 0 );
      }
      else
      {
        v18 = *((_DWORD *)v15 - 2);
        *((_DWORD *)v15 - 2) = v18 - 1;
      }
      if ( v18 <= 0 )
        operator delete(v16);
    }
    return a1;
  }
  v14 = &a4[a5 - v6 - v11];
LABEL_13:
  sub_16F70(a1, a2, v11, a5);
  if ( a5 == 1 )
    *(_BYTE *)(*a1 + a2) = v14[*a1];
  else
    memcpy((void *)(*a1 + a2), &v14[*a1], a5);
  return a1;
}


// Address: 0x183C8 | Function: sub_183C8
__int64 *__fastcall sub_183C8(
        __int64 *a1,
        size_t a2,
        unsigned __int64 a3,
        __int64 *a4,
        unsigned __int64 a5,
        unsigned __int64 a6)
{
  __int64 v6; // x3
  unsigned __int64 v7; // x6
  unsigned __int64 v8; // x6
  _BYTE *v9; // x3
  unsigned __int64 v10; // x4

  v6 = *a4;
  v7 = *(_QWORD *)(v6 - 24);
  if ( a5 > v7 )
    sub_1A560(
      "%s: __pos (which is %zu) > this->size() (which is %zu)",
      "basic_string::replace",
      a5,
      *(_QWORD *)(v6 - 24));
  v8 = v7 - a5;
  v9 = (_BYTE *)(v6 + a5);
  if ( v8 > a6 )
    v10 = a6;
  else
    v10 = v8;
  return sub_180D4(a1, a2, a3, v9, v10);
}


// Address: 0x18414 | Function: sub_18414
__int64 *__fastcall sub_18414(__int64 *a1, size_t a2, unsigned __int64 a3, char *a4)
{
  size_t v5; // x0

  v5 = strlen(a4);
  return sub_180D4(a1, a2, a3, a4, v5);
}


// Address: 0x18458 | Function: sub_18458
__int64 *__fastcall sub_18458(__int64 *a1, __int64 a2, __int64 a3, _BYTE *a4, unsigned __int64 a5)
{
  return sub_180D4(a1, a2 - *a1, a3 - a2, a4, a5);
}


// Address: 0x18468 | Function: sub_18468
__int64 *__fastcall sub_18468(__int64 *a1, __int64 a2, __int64 a3, _BYTE **a4)
{
  return sub_180D4(a1, a2 - *a1, a3 - a2, *a4, *((_QWORD *)*a4 - 3));
}


// Address: 0x18480 | Function: sub_18480
__int64 *__fastcall sub_18480(__int64 *a1, __int64 a2, __int64 a3, char *a4)
{
  size_t v5; // x0

  v5 = strlen(a4);
  return sub_180D4(a1, a2 - *a1, a3 - a2, a4, v5);
}


// Address: 0x184D0 | Function: sub_184D0
__int64 *__fastcall sub_184D0(__int64 *a1, __int64 a2, __int64 a3, _BYTE *a4, __int64 a5)
{
  return sub_180D4(a1, a2 - *a1, a3 - a2, a4, a5 - (_QWORD)a4);
}


// Address: 0x184E4 | Function: sub_184E4
__int64 *__fastcall sub_184E4(__int64 *a1, __int64 a2, __int64 a3, _BYTE *a4, __int64 a5)
{
  return sub_180D4(a1, a2 - *a1, a3 - a2, a4, a5 - (_QWORD)a4);
}


// Address: 0x184F8 | Function: sub_184F8
__int64 *__fastcall sub_184F8(__int64 *a1, __int64 a2, __int64 a3, _BYTE *a4, unsigned __int64 a5)
{
  return sub_180D4(a1, a2 - *a1, a3 - a2, a4, a5);
}


// Address: 0x18508 | Function: sub_18508
__int64 *__fastcall sub_18508(__int64 *a1, __int64 a2, __int64 a3, _BYTE *a4, __int64 a5)
{
  return sub_180D4(a1, a2 - *a1, a3 - a2, a4, a5 - (_QWORD)a4);
}


// Address: 0x1851C | Function: sub_1851C
__int64 *__fastcall sub_1851C(__int64 *a1, __int64 a2, __int64 a3, _BYTE *a4, __int64 a5)
{
  return sub_180D4(a1, a2 - *a1, a3 - a2, a4, a5 - (_QWORD)a4);
}


// Address: 0x18530 | Function: sub_18530
void *__fastcall sub_18530(__int64 a1)
{
  int v1; // w19
  void *result; // x0
  unsigned int *v3; // x1
  unsigned int v4; // w2
  __int64 v6; // x20
  size_t v7; // x2

  v1 = *(_DWORD *)(a1 + 16);
  if ( v1 < 0 )
  {
    v6 = sub_16ED8(*(_QWORD *)a1, *(_QWORD *)(a1 + 8));
    v7 = *(_QWORD *)a1;
    result = (void *)(v6 + 24);
    if ( *(_QWORD *)a1 != 0 )
    {
      if ( v7 == 1 )
      {
        result = (void *)(v6 + 24);
        *(_BYTE *)(v6 + 24) = *(_BYTE *)(a1 + 24);
      }
      else
      {
        result = memcpy((void *)(v6 + 24), (const void *)(a1 + 24), v7);
      }
      v7 = *(_QWORD *)a1;
    }
    if ( (_UNKNOWN *)v6 != &unk_4C7C0 )
    {
      *(_DWORD *)(v6 + 16) = 0;
      *(_QWORD *)v6 = v7;
      *(_BYTE *)(v6 + v7 + 24) = 0;
    }
  }
  else
  {
    if ( (_UNKNOWN *)a1 != &unk_4C7C0 )
    {
      if ( &pthread_create != nullptr )
      {
        v3 = (unsigned int *)(a1 + 16);
        do
          v4 = __ldaxr(v3);
        while ( __stlxr(v4 + 1, v3) != 0 );
      }
      else
      {
        *(_DWORD *)(a1 + 16) = v1 + 1;
      }
    }
    return (void *)(a1 + 24);
  }
  return result;
}


// Address: 0x1860C | Function: sub_1860C
void __fastcall sub_1860C(unsigned int *a1)
{
  unsigned int *v1; // x2
  int v2; // w1

  if ( a1 != (unsigned int *)&unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v1 = a1 + 4;
      do
        v2 = __ldaxr(v1);
      while ( __stlxr(v2 - 1, v1) != 0 );
    }
    else
    {
      v2 = a1[4];
      a1[4] = v2 - 1;
    }
    if ( v2 <= 0 )
      operator delete(a1);
  }
}


// Address: 0x1865C | Function: j_._ZdlPv
// attributes: thunk
void __fastcall operator delete(void *p)
{
  ._ZdlPv(p);
}


// Address: 0x18660 | Function: sub_18660
__int64 __fastcall sub_18660(__int64 a1)
{
  unsigned int *v2; // x1
  unsigned int v3; // w2

  if ( (_UNKNOWN *)a1 != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v2 = (unsigned int *)(a1 + 16);
      do
        v3 = __ldaxr(v2);
      while ( __stlxr(v3 + 1, v2) != 0 );
    }
    else
    {
      ++*(_DWORD *)(a1 + 16);
    }
  }
  return a1 + 24;
}


// Address: 0x186AC | Function: sub_186AC
void *__fastcall sub_186AC(__int64 a1, __int64 a2, __int64 a3)
{
  unsigned __int64 v4; // x1
  unsigned __int64 v5; // x2
  unsigned __int64 v6; // x19
  __int64 v7; // x0
  _BYTE *v8; // x20
  size_t v9; // x2
  void *v10; // x3

  v4 = *(_QWORD *)(a1 + 8);
  v5 = a3 + *(_QWORD *)a1;
  if ( v5 > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  v6 = v5;
  if ( v5 > v4 )
  {
    if ( v5 < 2 * v4 )
      v6 = 2 * v4;
    else
      v6 = v5;
  }
  if ( v6 + 57 > 0x1000 && v4 < v6 )
  {
    v6 = v6 + 4096 - (((_WORD)v6 + 57) & 0xFFF);
    if ( v6 > 0x3FFFFFFFFFFFFFF9LL )
      v6 = 0x3FFFFFFFFFFFFFF9LL;
  }
  v7 = operator new(v6 + 25);
  v8 = (_BYTE *)v7;
  v9 = *(_QWORD *)a1;
  v10 = (void *)(v7 + 24);
  *(_QWORD *)(v7 + 8) = v6;
  *(_DWORD *)(v7 + 16) = 0;
  if ( v9 != 0 )
  {
    v10 = (void *)(v7 + 24);
    if ( v9 == 1 )
    {
      *(_BYTE *)(v7 + 24) = *(_BYTE *)(a1 + 24);
      v9 = *(_QWORD *)a1;
      if ( (_UNKNOWN *)v7 == &unk_4C7C0 )
        return v10;
      goto LABEL_12;
    }
    v10 = memcpy((void *)(v7 + 24), (const void *)(a1 + 24), v9);
    v9 = *(_QWORD *)a1;
  }
  if ( v8 == (_BYTE *)&unk_4C7C0 )
    return v10;
LABEL_12:
  *(_QWORD *)v8 = v9;
  v8[v9 + 24] = 0;
  return v10;
}


// Address: 0x187E0 | Function: sub_187E0
unsigned int *__fastcall sub_187E0(unsigned int **a1, unsigned int **a2)
{
  unsigned int *v2; // x1
  unsigned int *result; // x0
  int v5; // w3
  unsigned int v6; // w2
  char v7; // [xsp+28h] [xbp+28h] BYREF

  v2 = *a2;
  result = v2 - 6;
  v5 = *(v2 - 2);
  if ( v5 < 0 )
  {
    result = (unsigned int *)sub_186AC((__int64)result, (__int64)&v7, 0);
    *a1 = result;
  }
  else
  {
    if ( result != (unsigned int *)&unk_4C7C0 )
    {
      result = (unsigned int *)&pthread_create;
      if ( &pthread_create != nullptr )
      {
        result = v2 - 2;
        do
          v6 = __ldaxr(result);
        while ( __stlxr(v6 + 1, result) != 0 );
      }
      else
      {
        *(v2 - 2) = v5 + 1;
      }
    }
    *a1 = v2;
  }
  return result;
}


// Address: 0x18870 | Function: sub_18870
__int64 *__fastcall sub_18870(__int64 *a1, _QWORD *a2)
{
  __int64 v2; // x2
  _DWORD *v4; // x19
  int v5; // w3
  char *v6; // x0
  void *v7; // x0
  unsigned int *v9; // x2
  int v10; // w1
  unsigned int *v11; // x0
  unsigned int v12; // w2
  char v13; // [xsp+28h] [xbp+28h] BYREF

  v2 = *a1;
  v4 = (_DWORD *)*a2;
  if ( *a1 != *a2 )
  {
    v5 = *(v4 - 2);
    v6 = (char *)(v4 - 6);
    if ( v5 < 0 )
    {
      v4 = sub_186AC((__int64)v6, (__int64)&v13, 0);
      v2 = *a1;
    }
    else if ( v6 != (char *)&unk_4C7C0 )
    {
      if ( &pthread_create != nullptr )
      {
        v11 = v4 - 2;
        do
          v12 = __ldaxr(v11);
        while ( __stlxr(v12 + 1, v11) != 0 );
        v2 = *a1;
      }
      else
      {
        *(v4 - 2) = v5 + 1;
      }
    }
    v7 = (void *)(v2 - 24);
    if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
    {
      if ( &pthread_create != nullptr )
      {
        v9 = (unsigned int *)(v2 - 8);
        do
          v10 = __ldaxr(v9);
        while ( __stlxr(v10 - 1, v9) != 0 );
      }
      else
      {
        v10 = *(_DWORD *)(v2 - 8);
        *(_DWORD *)(v2 - 8) = v10 - 1;
      }
      if ( v10 <= 0 )
        operator delete(v7);
    }
    *a1 = (__int64)v4;
  }
  return a1;
}


// Address: 0x18960 | Function: sub_18960
__int64 *__fastcall sub_18960(__int64 *a1, _QWORD *a2)
{
  __int64 v2; // x2
  _DWORD *v4; // x19
  int v5; // w3
  char *v6; // x0
  void *v7; // x0
  unsigned int *v9; // x2
  int v10; // w1
  unsigned int *v11; // x0
  unsigned int v12; // w2
  char v13; // [xsp+28h] [xbp+28h] BYREF

  v2 = *a1;
  v4 = (_DWORD *)*a2;
  if ( *a1 != *a2 )
  {
    v5 = *(v4 - 2);
    v6 = (char *)(v4 - 6);
    if ( v5 < 0 )
    {
      v4 = sub_186AC((__int64)v6, (__int64)&v13, 0);
      v2 = *a1;
    }
    else if ( v6 != (char *)&unk_4C7C0 )
    {
      if ( &pthread_create != nullptr )
      {
        v11 = v4 - 2;
        do
          v12 = __ldaxr(v11);
        while ( __stlxr(v12 + 1, v11) != 0 );
        v2 = *a1;
      }
      else
      {
        *(v4 - 2) = v5 + 1;
      }
    }
    v7 = (void *)(v2 - 24);
    if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
    {
      if ( &pthread_create != nullptr )
      {
        v9 = (unsigned int *)(v2 - 8);
        do
          v10 = __ldaxr(v9);
        while ( __stlxr(v10 - 1, v9) != 0 );
      }
      else
      {
        v10 = *(_DWORD *)(v2 - 8);
        *(_DWORD *)(v2 - 8) = v10 - 1;
      }
      if ( v10 <= 0 )
        operator delete(v7);
    }
    *a1 = (__int64)v4;
  }
  return a1;
}


// Address: 0x18A50 | Function: sub_18A50
int **__usercall sub_18A50@<X0>(char *a1@<X0>, _BYTE **a2@<X1>, int **a3@<X8>, int a4, void *a5)
{
  size_t v8; // x20

  v8 = strlen(a1);
  *a3 = (int *)&unk_4C7D8;
  sub_15340((_BYTE **)a3, v8 + *((_QWORD *)*a2 - 3));
  if ( v8 != 0 )
    sub_1550C(a3, (int *)a1, v8);
  sub_158CC(a3, a2);
  return a3;
}


// Address: 0x18D78 | Function: sub_18D78
_QWORD *__fastcall sub_18D78(_QWORD *result, unsigned __int8 *a2, unsigned __int8 *a3)
{
  _QWORD *v3; // x22
  size_t v4; // x19
  __int64 v5; // x2
  __int64 v6; // x20
  __int64 v7; // x21
  unsigned __int8 *v8; // x1
  void *v9; // x3
  __int64 v10; // x0

  v3 = result;
  if ( a2 == a3 )
  {
    *result = &unk_4C7D8;
    return result;
  }
  if ( a2 == nullptr && a3 != nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  v4 = a3 - a2;
  if ( (unsigned __int64)(a3 - a2) > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( v4 + 57 > 0x1000 && v4 != 0 )
  {
    v5 = ((_WORD)v4 + 57) & 0xFFF;
    v6 = 0x3FFFFFFFFFFFFFF9LL;
    if ( v4 + 4096 - v5 <= 0x3FFFFFFFFFFFFFF9LL )
      v6 = v4 + 4096 - v5;
    v7 = operator new(v6 + 25);
    v8 = a2;
    v9 = (void *)(v7 + 24);
    *(_QWORD *)(v7 + 8) = v6;
    *(_DWORD *)(v7 + 16) = 0;
  }
  else
  {
    v10 = operator new(v4 + 25);
    *(_QWORD *)(v10 + 8) = v4;
    *(_DWORD *)(v10 + 16) = 0;
    v7 = v10;
    v9 = (void *)(v10 + 24);
    v8 = a2;
    if ( v4 == 1 )
    {
      result = (_QWORD *)*a2;
      *(_BYTE *)(v7 + 24) = (_BYTE)result;
      goto LABEL_12;
    }
  }
  result = memcpy(v9, v8, v4);
  v9 = result;
LABEL_12:
  if ( (_UNKNOWN *)v7 != &unk_4C7C0 )
  {
    result = (_QWORD *)(v7 + v4);
    *(_QWORD *)v7 = v4;
    *(_BYTE *)(v7 + v4 + 24) = 0;
  }
  *v3 = v9;
  return result;
}


// Address: 0x18EAC | Function: sub_18EAC
_QWORD *__fastcall sub_18EAC(_QWORD *result, _BYTE *a2, _BYTE *a3)
{
  _QWORD *v3; // x22
  size_t v4; // x19
  __int64 v5; // x2
  __int64 v6; // x20
  __int64 v7; // x21
  const void *v8; // x1
  void *v9; // x3
  __int64 v10; // x0

  v3 = result;
  if ( a2 == a3 )
  {
    *result = &unk_4C7D8;
    return result;
  }
  v4 = a3 - a2;
  if ( (unsigned __int64)(a3 - a2) > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( v4 + 57 > 0x1000 && v4 != 0 )
  {
    v5 = ((_WORD)v4 + 57) & 0xFFF;
    v6 = 0x3FFFFFFFFFFFFFF9LL;
    if ( v4 + 4096 - v5 <= 0x3FFFFFFFFFFFFFF9LL )
      v6 = v4 + 4096 - v5;
    v7 = operator new(v6 + 25);
    v8 = a2;
    v9 = (void *)(v7 + 24);
    *(_QWORD *)(v7 + 8) = v6;
    *(_DWORD *)(v7 + 16) = 0;
  }
  else
  {
    v10 = operator new(v4 + 25);
    *(_QWORD *)(v10 + 8) = v4;
    *(_DWORD *)(v10 + 16) = 0;
    v7 = v10;
    v9 = (void *)(v10 + 24);
    v8 = a2;
    if ( v4 == 1 )
    {
      *(_BYTE *)(v10 + 24) = *a2;
      goto LABEL_9;
    }
  }
  v9 = memcpy(v9, v8, v4);
LABEL_9:
  result = &unk_4C7C0;
  if ( (_UNKNOWN *)v7 != &unk_4C7C0 )
  {
    result = (_QWORD *)(v7 + v4);
    *(_QWORD *)v7 = v4;
    *(_BYTE *)(v7 + v4 + 24) = 0;
  }
  *v3 = v9;
  return result;
}


// Address: 0x18FCC | Function: sub_18FCC
void *__fastcall sub_18FCC(_BYTE *a1, _BYTE *a2)
{
  size_t v3; // x19
  __int64 v4; // x1
  __int64 v5; // x21
  __int64 v6; // x22
  void *v7; // x3
  __int64 v9; // x0

  if ( a1 == a2 )
    return &unk_4C7D8;
  v3 = a2 - a1;
  if ( (unsigned __int64)(a2 - a1) > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( v3 + 57 > 0x1000 && v3 != 0 )
  {
    v4 = ((_WORD)v3 + 57) & 0xFFF;
    v5 = 0x3FFFFFFFFFFFFFF9LL;
    if ( v3 + 4096 - v4 <= 0x3FFFFFFFFFFFFFF9LL )
      v5 = v3 + 4096 - v4;
    v6 = operator new(v5 + 25);
    v7 = (void *)(v6 + 24);
    *(_QWORD *)(v6 + 8) = v5;
    *(_DWORD *)(v6 + 16) = 0;
  }
  else
  {
    v9 = operator new(v3 + 25);
    *(_QWORD *)(v9 + 8) = v3;
    *(_DWORD *)(v9 + 16) = 0;
    v6 = v9;
    v7 = (void *)(v9 + 24);
    if ( v3 == 1 )
    {
      *(_BYTE *)(v9 + 24) = *a1;
      goto LABEL_9;
    }
  }
  v7 = memcpy(v7, a1, v3);
LABEL_9:
  if ( (_UNKNOWN *)v6 != &unk_4C7C0 )
  {
    *(_QWORD *)v6 = v3;
    *(_BYTE *)(v6 + v3 + 24) = 0;
  }
  return v7;
}


// Address: 0x190E4 | Function: sub_190E4
void *__fastcall sub_190E4(_BYTE *a1, _BYTE *a2)
{
  size_t v3; // x19
  unsigned __int64 v4; // x20
  __int64 v5; // x22
  void *v6; // x3
  __int64 v8; // x0

  if ( a1 == a2 )
    return &unk_4C7D8;
  if ( a1 == nullptr && a2 != nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  v3 = a2 - a1;
  if ( (unsigned __int64)(a2 - a1) > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( v3 + 57 > 0x1000 && v3 != 0 )
  {
    v4 = v3 + 4096 - (((_WORD)v3 + 57) & 0xFFF);
    if ( v4 > 0x3FFFFFFFFFFFFFF9LL )
      v4 = 0x3FFFFFFFFFFFFFF9LL;
    v5 = operator new(v4 + 25);
    v6 = (void *)(v5 + 24);
    *(_QWORD *)(v5 + 8) = v4;
    *(_DWORD *)(v5 + 16) = 0;
  }
  else
  {
    v8 = operator new(v3 + 25);
    *(_QWORD *)(v8 + 8) = v3;
    *(_DWORD *)(v8 + 16) = 0;
    v5 = v8;
    v6 = (void *)(v8 + 24);
    if ( v3 == 1 )
    {
      *(_BYTE *)(v8 + 24) = *a1;
      goto LABEL_12;
    }
  }
  v6 = memcpy(v6, a1, v3);
LABEL_12:
  if ( (_UNKNOWN *)v5 != &unk_4C7C0 )
  {
    *(_QWORD *)v5 = v3;
    *(_BYTE *)(v5 + v3 + 24) = 0;
  }
  return v6;
}


// Address: 0x19214 | Function: sub_19214
void *__fastcall sub_19214(_BYTE *a1, _BYTE *a2)
{
  size_t v3; // x19
  unsigned __int64 v4; // x20
  __int64 v5; // x22
  void *v6; // x3
  __int64 v8; // x0

  if ( a1 == a2 )
    return &unk_4C7D8;
  if ( a1 == nullptr && a2 != nullptr )
    sub_1A1DC("basic_string::_S_construct null not valid");
  v3 = a2 - a1;
  if ( (unsigned __int64)(a2 - a1) > 0x3FFFFFFFFFFFFFF9LL )
    sub_1A3F8("basic_string::_S_create");
  if ( v3 + 57 > 0x1000 && v3 != 0 )
  {
    v4 = v3 + 4096 - (((_WORD)v3 + 57) & 0xFFF);
    if ( v4 > 0x3FFFFFFFFFFFFFF9LL )
      v4 = 0x3FFFFFFFFFFFFFF9LL;
    v5 = operator new(v4 + 25);
    v6 = (void *)(v5 + 24);
    *(_QWORD *)(v5 + 8) = v4;
    *(_DWORD *)(v5 + 16) = 0;
  }
  else
  {
    v8 = operator new(v3 + 25);
    *(_QWORD *)(v8 + 8) = v3;
    *(_DWORD *)(v8 + 16) = 0;
    v5 = v8;
    v6 = (void *)(v8 + 24);
    if ( v3 == 1 )
    {
      *(_BYTE *)(v8 + 24) = *a1;
      goto LABEL_12;
    }
  }
  v6 = memcpy(v6, a1, v3);
LABEL_12:
  if ( (_UNKNOWN *)v5 != &unk_4C7C0 )
  {
    *(_QWORD *)v5 = v3;
    *(_BYTE *)(v5 + v3 + 24) = 0;
  }
  return v6;
}


// Address: 0x19344 | Function: sub_19344
bool __fastcall sub_19344(_QWORD *a1, _QWORD *a2)
{
  return *a1 == *a2;
}


// Address: 0x19358 | Function: sub_19358
bool __fastcall sub_19358(_QWORD *a1, _QWORD *a2)
{
  return *a1 == *a2;
}


// Address: 0x1936C | Function: _ZdlPv
// attributes: thunk
void operator delete(void *p)
{
  free(p);
}


// Address: 0x19370 | Function: sub_19370
const char *sub_19370()
{
  return "__gnu_cxx::__concurrence_lock_error";
}


// Address: 0x1937C | Function: sub_1937C
const char *sub_1937C()
{
  return "__gnu_cxx::__concurrence_unlock_error";
}


// Address: 0x19388 | Function: sub_19388
void __fastcall sub_19388(std::exception *a1)
{
  *(_QWORD *)a1 = off_481B0;
  std::exception::~exception(a1);
}


// Address: 0x19398 | Function: sub_19398
void __fastcall sub_19398(std::exception *a1)
{
  *(_QWORD *)a1 = off_481E0;
  std::exception::~exception(a1);
}


// Address: 0x193A8 | Function: sub_193A8
void __fastcall sub_193A8(std::exception *a1)
{
  *(_QWORD *)a1 = off_481B0;
  std::exception::~exception(a1);
  operator delete(a1);
}


// Address: 0x193D8 | Function: sub_193D8
void __fastcall sub_193D8(std::exception *a1)
{
  *(_QWORD *)a1 = off_481E0;
  std::exception::~exception(a1);
  operator delete(a1);
}


// Address: 0x19408 | Function: sub_19408
void __noreturn sub_19408()
{
  _QWORD *exception; // x0

  exception = __cxa_allocate_exception(8u);
  *exception = off_481B0;
  __cxa_throw(
    exception,
    (struct type_info *)&`typeinfo for'__gnu_cxx::__concurrence_lock_error,
    (void (*)(void *))sub_19388);
}


// Address: 0x19438 | Function: sub_19438
void __noreturn sub_19438()
{
  _QWORD *exception; // x0

  exception = __cxa_allocate_exception(8u);
  *exception = off_481E0;
  __cxa_throw(
    exception,
    (struct type_info *)&`typeinfo for'__gnu_cxx::__concurrence_unlock_error,
    (void (*)(void *))sub_19398);
}


// Address: 0x19468 | Function: __cxa_allocate_exception
void *_cxa_allocate_exception(size_t thrown_size)
{
  size_t v1; // x20
  _QWORD *v2; // x19
  unsigned __int64 v4; // x0
  unsigned int v5; // w19

  v1 = thrown_size + 128;
  v2 = malloc(thrown_size + 128);
  if ( v2 == nullptr )
  {
    if ( &pthread_create != nullptr && pthread_mutex_lock((pthread_mutex_t *)&qword_4E3F0) != 0 )
      sub_19408();
    if ( v1 > 0x400 )
LABEL_9:
      std::terminate();
    v4 = qword_5E420;
    v5 = 0;
    while ( (v4 & 1) != 0 )
    {
      ++v5;
      v4 >>= 1;
      if ( v5 == 64 )
        goto LABEL_9;
    }
    qword_5E420 |= 1LL << v5;
    v2 = (_QWORD *)((char *)&unk_4E420 + 1024 * (unsigned __int64)v5);
    if ( &pthread_create != nullptr && pthread_mutex_unlock((pthread_mutex_t *)&qword_4E3F0) != 0 )
      sub_19438();
  }
  *v2 = 0;
  v2[1] = 0;
  v2[2] = 0;
  v2[3] = 0;
  v2[4] = 0;
  v2[5] = 0;
  v2[6] = 0;
  v2[7] = 0;
  v2[8] = 0;
  v2[9] = 0;
  v2[10] = 0;
  v2[11] = 0;
  v2[12] = 0;
  v2[13] = 0;
  v2[14] = 0;
  v2[15] = 0;
  return v2 + 16;
}


// Address: 0x1955C | Function: sub_1955C
// attributes: thunk
void sub_1955C()
{
  JUMPOUT(0x19548);
}


// Address: 0x19560 | Function: __cxa_free_exception
void _cxa_free_exception(void *a1)
{
  unsigned int v1; // w19

  if ( a1 < &unk_4E420 || a1 >= &qword_5E420 )
  {
    free((char *)a1 - 128);
  }
  else
  {
    v1 = ((unsigned int)a1 - (unsigned int)&unk_4E420) >> 10;
    if ( &pthread_create != nullptr )
    {
      if ( pthread_mutex_lock((pthread_mutex_t *)&qword_4E3F0) != 0 )
        sub_19408();
      qword_5E420 &= ~(1LL << v1);
      if ( pthread_mutex_unlock((pthread_mutex_t *)&qword_4E3F0) != 0 )
        sub_19438();
    }
    else
    {
      qword_5E420 &= ~(1LL << v1);
    }
  }
}


// Address: 0x1962C | Function: __cxa_allocate_dependent_exception
_QWORD *_cxa_allocate_dependent_exception()
{
  _QWORD *v0; // x19
  unsigned int v2; // w0
  unsigned __int64 i; // x1

  v0 = malloc(0x70u);
  if ( v0 == nullptr )
  {
    if ( &pthread_create != nullptr && pthread_mutex_lock((pthread_mutex_t *)&qword_4E3F0) != 0 )
      sub_19408();
    v2 = 0;
    for ( i = qword_4C7E0; (i & 1) != 0; i >>= 1 )
    {
      if ( ++v2 == 64 )
        std::terminate();
    }
    qword_4C7E0 |= 1LL << v2;
    v0 = (_QWORD *)((char *)&unk_4C7F0 + 112 * v2);
    if ( &pthread_create != nullptr && pthread_mutex_unlock((pthread_mutex_t *)&qword_4E3F0) != 0 )
      sub_19438();
  }
  *v0 = 0;
  v0[1] = 0;
  v0[2] = 0;
  v0[3] = 0;
  v0[4] = 0;
  v0[5] = 0;
  v0[6] = 0;
  v0[7] = 0;
  v0[8] = 0;
  v0[9] = 0;
  v0[10] = 0;
  v0[11] = 0;
  v0[12] = 0;
  v0[13] = 0;
  return v0;
}


// Address: 0x19714 | Function: __cxa_free_dependent_exception
void __fastcall _cxa_free_dependent_exception(__int64 *a1)
{
  unsigned int v1; // w19

  if ( a1 < qword_4C7F0 || a1 >= &qword_4E3F0 )
  {
    free(a1);
  }
  else
  {
    v1 = ((unsigned int)a1 - (unsigned int)qword_4C7F0) / 0x70;
    if ( &pthread_create != nullptr )
    {
      if ( pthread_mutex_lock((pthread_mutex_t *)&qword_4E3F0) != 0 )
        sub_19408();
      qword_4C7E0 &= ~(1LL << v1);
      if ( pthread_mutex_unlock((pthread_mutex_t *)&qword_4E3F0) != 0 )
        sub_19438();
    }
    else
    {
      qword_4C7E0 &= ~(1LL << v1);
    }
  }
}


// Address: 0x197F4 | Function: sub_197F4
void __fastcall __noreturn sub_197F4(_QWORD *a1)
{
  if ( a1 != nullptr )
  {
    __cxa_begin_catch(a1);
    if ( (unsigned __int64)(*a1 - 0x474E5543432B2B00LL) <= 1 )
      __cxxabiv1::__terminate((void (*)())*(a1 - 7));
  }
  std::terminate();
}


// Address: 0x19838 | Function: __cxa_get_exception_ptr
void *_cxa_get_exception_ptr(void *a1)
{
  return *((void **)a1 - 1);
}


// Address: 0x19840 | Function: __cxa_begin_catch
void *_cxa_begin_catch(void *a1)
{
  __int64 globals; // x0
  char *v3; // x3
  char *v4; // x2
  int v6; // w1
  int v7; // w4
  int v8; // w1

  globals = __cxa_get_globals();
  v3 = *(char **)globals;
  v4 = (char *)a1 - 80;
  if ( (unsigned __int64)(*(_QWORD *)a1 - 0x474E5543432B2B00LL) <= 1 )
  {
    v6 = *((_DWORD *)a1 - 10);
    v7 = v6 + 1;
    if ( v6 < 0 )
      v7 = 1 - v6;
    v8 = *(_DWORD *)(globals + 8);
    *((_DWORD *)a1 - 10) = v7;
    *(_DWORD *)(globals + 8) = v8 - 1;
    if ( v3 != v4 )
    {
      *((_QWORD *)a1 - 6) = v3;
      *(_QWORD *)globals = v4;
    }
    return *((void **)a1 - 1);
  }
  else
  {
    if ( v3 != nullptr )
      std::terminate();
    *(_QWORD *)globals = v4;
    return nullptr;
  }
}


// Address: 0x198E0 | Function: __cxa_end_catch
void _cxa_end_catch()
{
  __int64 *globals_fast; // x2
  __int64 v1; // x0
  int v2; // w1
  int v3; // w1

  globals_fast = (__int64 *)__cxa_get_globals_fast();
  v1 = *globals_fast;
  if ( *globals_fast != 0 )
  {
    if ( (unsigned __int64)(*(_QWORD *)(v1 + 80) - 0x474E5543432B2B00LL) > 1 )
    {
      *globals_fast = 0;
      sub_2C798(v1 + 80);
    }
    else
    {
      v2 = *(_DWORD *)(v1 + 40);
      if ( v2 < 0 )
      {
        v3 = v2 + 1;
        if ( v3 == 0 )
        {
          *globals_fast = *(_QWORD *)(v1 + 32);
          *(_DWORD *)(v1 + 40) = 0;
          return;
        }
      }
      else
      {
        v3 = v2 - 1;
        if ( v3 == 0 )
        {
          *globals_fast = *(_QWORD *)(v1 + 32);
          sub_2C798(v1 + 80);
          return;
        }
        if ( v3 == -1 )
          std::terminate();
      }
      *(_DWORD *)(v1 + 40) = v3;
    }
  }
}


// Address: 0x1997C | Function: _ZSt18uncaught_exceptionv
bool __fastcall std::uncaught_exception()
{
  return *(_DWORD *)(__cxa_get_globals() + 8) != 0;
}


// Address: 0x1999C | Function: _ZNSt9exceptionD1Ev
// Alternative name is '_ZNSt9exceptionD2Ev'
void __fastcall std::exception::~exception(std::exception *this)
{
  ;
}


// Address: 0x199A0 | Function: _ZNSt13bad_exceptionD1Ev
// Alternative name is '_ZNSt13bad_exceptionD2Ev'
void __fastcall std::bad_exception::~bad_exception(std::bad_exception *this)
{
  *(_QWORD *)this = off_49350;
  std::exception::~exception(this);
}


// Address: 0x199B4 | Function: _ZNKSt9exception4whatEv
const char *__fastcall std::exception::what(std::exception *this)
{
  return "std::exception";
}


// Address: 0x199C0 | Function: _ZNKSt13bad_exception4whatEv
const char *__fastcall std::bad_exception::what(std::bad_exception *this)
{
  return "std::bad_exception";
}


// Address: 0x199CC | Function: _ZNSt9exceptionD0Ev
void __fastcall std::exception::~exception(std::exception *this)
{
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x199F0 | Function: _ZNSt13bad_exceptionD0Ev
void __fastcall std::bad_exception::~bad_exception(std::bad_exception *this)
{
  std::bad_exception::~bad_exception(this);
  operator delete(this);
}


// Address: 0x19A14 | Function: _ZN10__cxxabiv115__forced_unwindD2Ev
// Alternative name is '_ZN10__cxxabiv115__forced_unwindD1Ev'
void __fastcall __cxxabiv1::__forced_unwind::~__forced_unwind(__cxxabiv1::__forced_unwind *this)
{
  ;
}


// Address: 0x19A18 | Function: _ZN10__cxxabiv115__forced_unwindD0Ev
void __fastcall __cxxabiv1::__forced_unwind::~__forced_unwind(__cxxabiv1::__forced_unwind *this)
{
  __cxxabiv1::__forced_unwind::~__forced_unwind(this);
  operator delete(this);
}


// Address: 0x19A3C | Function: _ZN10__cxxabiv119__foreign_exceptionD2Ev
// Alternative name is '_ZN10__cxxabiv119__foreign_exceptionD1Ev'
void __fastcall __cxxabiv1::__foreign_exception::~__foreign_exception(__cxxabiv1::__foreign_exception *this)
{
  ;
}


// Address: 0x19A40 | Function: _ZN10__cxxabiv119__foreign_exceptionD0Ev
void __fastcall __cxxabiv1::__foreign_exception::~__foreign_exception(__cxxabiv1::__foreign_exception *this)
{
  __cxxabiv1::__foreign_exception::~__foreign_exception(this);
  operator delete(this);
}


// Address: 0x19A64 | Function: sub_19A64
__int64 __fastcall sub_19A64(__int64 result)
{
  if ( result == 0 )
    __break(0x3E8u);
  if ( *(_BYTE *)(result + 4) != 0 )
    return pthread_key_delete(*(_DWORD *)result);
  return result;
}


// Address: 0x19A80 | Function: sub_19A80
void __fastcall sub_19A80(__int64 *p)
{
  __int64 v2; // x0
  __int64 v3; // x19

  if ( p != nullptr )
  {
    v2 = *p;
    if ( v2 != 0 )
    {
      do
      {
        v3 = *(_QWORD *)(v2 + 32);
        sub_2C798(v2 + 80);
        v2 = v3;
      }
      while ( v3 != 0 );
    }
    free(p);
  }
}


// Address: 0x19ACC | Function: __cxa_get_globals_fast
void *_cxa_get_globals_fast()
{
  if ( byte_5E42C != 0 )
    return pthread_getspecific(dword_5E428);
  else
    return &unk_5E430;
}


// Address: 0x19B14 | Function: __cxa_get_globals
_DWORD *_cxa_get_globals()
{
  _DWORD *v0; // x19

  if ( byte_5E42C == 0 )
    return &unk_5E430;
  v0 = pthread_getspecific(dword_5E428);
  if ( v0 == nullptr )
  {
    v0 = malloc(0x10u);
    if ( v0 == nullptr || pthread_setspecific(dword_5E428, v0) != 0 )
      std::terminate();
    *(_QWORD *)v0 = 0;
    v0[2] = 0;
  }
  return v0;
}


// Address: 0x19B98 | Function: _Znwm
void *__fastcall operator new(size_t a1)
{
  size_t v1; // x19
  void *result; // x0
  void (*new_handler)(void); // x0
  _QWORD *exception; // x0

  if ( a1 != 0 )
    v1 = a1;
  else
    v1 = 1;
  for ( result = malloc(v1); result == nullptr; result = malloc(v1) )
  {
    new_handler = (void (*)(void))std::get_new_handler();
    if ( new_handler == nullptr )
    {
      exception = __cxa_allocate_exception(8u);
      *exception = off_49690;
      __cxa_throw(
        exception,
        (struct type_info *)&`typeinfo for'std::bad_alloc,
        (void (*)(void *))std::bad_alloc::~bad_alloc);
    }
    new_handler();
  }
  return result;
}


// Address: 0x19C08 | Function: __cxa_pure_virtual
void __noreturn _cxa_pure_virtual()
{
  write(2, "pure virtual method called\n", 0x1Bu);
  std::terminate();
}


// Address: 0x19C28 | Function: __cxa_deleted_virtual
void __noreturn _cxa_deleted_virtual()
{
  write(2, "deleted virtual method called\n", 0x1Eu);
  std::terminate();
}


// Address: 0x19C48 | Function: _ZN10__cxxabiv120__si_class_type_infoD2Ev
// Alternative name is '_ZN10__cxxabiv120__si_class_type_infoD1Ev'
void __fastcall __cxxabiv1::__si_class_type_info::~__si_class_type_info(__cxxabiv1::__si_class_type_info *this)
{
  *(_QWORD *)this = off_49400;
  __cxxabiv1::__class_type_info::~__class_type_info(this);
}


// Address: 0x19C5C | Function: _ZN10__cxxabiv120__si_class_type_infoD0Ev
void __fastcall __cxxabiv1::__si_class_type_info::~__si_class_type_info(__cxxabiv1::__si_class_type_info *this)
{
  __cxxabiv1::__si_class_type_info::~__si_class_type_info(this);
  operator delete(this);
}


// Address: 0x19C80 | Function: _ZNK10__cxxabiv120__si_class_type_info12__do_dyncastElNS_17__class_type_info10__sub_kindEPKS1_PKvS4_S6_RNS1_16__dyncast_resultE
__int64 __fastcall __cxxabiv1::__si_class_type_info::__do_dyncast(
        __int64 a1,
        __int64 a2,
        int a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8)
{
  const char *v9; // x19
  const char *v10; // x1
  int v12; // w22
  int v13; // w0
  __int64 result; // x0
  int v15; // w1
  const char *v16; // x1
  int v17; // w0
  __int64 v18; // [xsp+30h] [xbp+30h]
  __int64 v19; // [xsp+30h] [xbp+30h]
  __int64 v20; // [xsp+38h] [xbp+38h]
  __int64 v21; // [xsp+40h] [xbp+40h]
  __int64 v22; // [xsp+48h] [xbp+48h]
  int v23; // [xsp+58h] [xbp+58h]
  int v24; // [xsp+58h] [xbp+58h]

  v9 = *(const char **)(a1 + 8);
  v10 = *(const char **)(a4 + 8);
  if ( v9 == v10 )
    goto LABEL_7;
  v12 = *(unsigned __int8 *)v9;
  if ( v12 == 42 )
    goto LABEL_20;
  v18 = a8;
  v20 = a7;
  v21 = a6;
  v22 = a5;
  v23 = a3;
  v13 = strcmp(*(const char **)(a1 + 8), v10);
  a3 = v23;
  a5 = v22;
  a6 = v21;
  a7 = v20;
  a8 = v18;
  if ( v13 != 0 )
  {
LABEL_20:
    if ( a5 != a7 )
      return (*(unsigned __int8 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 56LL))(
               *(_QWORD *)(a1 + 16),
               a2);
    v16 = *(const char **)(a6 + 8);
    if ( v9 != v16 && (v12 == 42 || (v19 = a8, v24 = a3, v17 = strcmp(v9, v16), a3 = v24, a8 = v19, v17 != 0)) )
    {
      return (*(unsigned __int8 (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 56LL))(
               *(_QWORD *)(a1 + 16),
               a2);
    }
    else
    {
      *(_DWORD *)(a8 + 12) = a3;
      return 0;
    }
  }
  else
  {
LABEL_7:
    *(_QWORD *)a8 = a5;
    *(_DWORD *)(a8 + 8) = a3;
    if ( a2 < 0 )
    {
      result = 0;
      if ( a2 == -2 )
        *(_DWORD *)(a8 + 16) = 1;
    }
    else
    {
      result = 0;
      if ( a7 == a5 + a2 )
        v15 = 6;
      else
        v15 = 1;
      *(_DWORD *)(a8 + 16) = v15;
    }
  }
  return result;
}


// Address: 0x19DD8 | Function: _ZNK10__cxxabiv120__si_class_type_info20__do_find_public_srcElPKvPKNS_17__class_type_infoES2_
__int64 __fastcall __cxxabiv1::__si_class_type_info::__do_find_public_src(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  unsigned int v7; // w1
  const char *v9; // x0
  const char *v10; // x1
  int v11; // w0

  if ( a5 != a3 )
    return (*(unsigned int (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 64LL))(*(_QWORD *)(a1 + 16), a2);
  v9 = *(const char **)(a1 + 8);
  v10 = *(const char **)(a4 + 8);
  if ( v9 == v10 )
    return 6;
  if ( *v9 == 42 )
    return (*(unsigned int (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 64LL))(*(_QWORD *)(a1 + 16), a2);
  v11 = strcmp(v9, v10);
  v7 = 6;
  if ( v11 != 0 )
    return (*(unsigned int (__fastcall **)(_QWORD, __int64))(**(_QWORD **)(a1 + 16) + 64LL))(*(_QWORD *)(a1 + 16), a2);
  return v7;
}


// Address: 0x19E6C | Function: _ZNK10__cxxabiv120__si_class_type_info11__do_upcastEPKNS_17__class_type_infoEPKvRNS1_15__upcast_resultE
__int64 __fastcall __cxxabiv1::__si_class_type_info::__do_upcast(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  __int64 result; // x0

  result = (unsigned __int8)__cxxabiv1::__class_type_info::__do_upcast();
  if ( (_BYTE)result == 0 )
    return (*(unsigned __int8 (__fastcall **)(_QWORD, __int64, __int64, __int64))(**(_QWORD **)(a1 + 16) + 48LL))(
             *(_QWORD *)(a1 + 16),
             a2,
             a3,
             a4);
  return result;
}


// Address: 0x19ECC | Function: nullsub_5
void nullsub_5()
{
  ;
}


// Address: 0x19ED0 | Function: sub_19ED0
__int64 sub_19ED0()
{
  return 0;
}


// Address: 0x19ED8 | Function: sub_19ED8
__int64 sub_19ED8()
{
  return 0;
}


// Address: 0x19EE0 | Function: sub_19EE0
__int64 sub_19EE0()
{
  return 0;
}


// Address: 0x19EE8 | Function: j_._ZdlPv_2
// attributes: thunk
void __fastcall operator delete(void *p)
{
  ._ZdlPv(p);
}


// Address: 0x19EEC | Function: sub_19EEC
bool __fastcall sub_19EEC(__int64 a1, __int64 a2)
{
  const char *v2; // x0
  const char *v3; // x1

  v2 = *(const char **)(a1 + 8);
  v3 = *(const char **)(a2 + 8);
  if ( v2 == v3 )
    return true;
  if ( *v2 == 42 )
    return false;
  return strcmp(v2, v3) == 0;
}


// Address: 0x19F3C | Function: _ZN9__gnu_cxx27__verbose_terminate_handlerEv
void __fastcall __noreturn __gnu_cxx::__verbose_terminate_handler()
{
  struct type_info *v0; // x0
  const char *v1; // x0
  int v2; // w4
  const char *v3; // x19
  char *v4; // x22
  FILE *v5; // x20
  size_t v6; // x2
  const char *v7; // x0
  int v8; // [xsp+4Ch] [xbp+4Ch] BYREF

  if ( byte_5E440 != 0 )
  {
    v6 = 29;
    v7 = "terminate called recursively\n";
  }
  else
  {
    byte_5E440 = 1;
    v0 = __cxa_current_exception_type();
    if ( v0 != nullptr )
    {
      v1 = *((const char **)v0 + 1);
      v2 = *(unsigned __int8 *)v1;
      v8 = -1;
      if ( v2 == 42 )
        v3 = v1 + 1;
      else
        v3 = v1;
      v4 = __cxa_demangle(v3, nullptr, nullptr, &v8);
      v5 = (FILE *)((char *)&_sF + 304);
      fwrite("terminate called after throwing an instance of '", 1u, 0x30u, (FILE *)((char *)&_sF + 304));
      if ( v8 != 0 )
        fputs(v3, v5);
      else
        fputs(v4, v5);
      fwrite("'\n", 1u, 2u, (FILE *)((char *)&_sF + 304));
      if ( v8 != 0 )
        __cxa_rethrow();
      free(v4);
      __cxa_rethrow();
    }
    v7 = "terminate called without an active exception\n";
    v6 = 45;
  }
  fwrite(v7, 1u, v6, (FILE *)((char *)&_sF + 304));
  abort();
}


// Address: 0x1A0CC | Function: sub_1A0CC
void __fastcall sub_1A0CC(unsigned int *a1)
{
  unsigned int *v1; // x3
  int v2; // w2

  if ( &pthread_create != nullptr )
  {
    v1 = a1 + 4;
    do
      v2 = __ldaxr(v1);
    while ( __stlxr(v2 - 1, v1) != 0 );
  }
  else
  {
    v2 = a1[4];
    a1[4] = v2 - 1;
  }
  if ( v2 <= 0 )
    operator delete(a1);
}


// Address: 0x1A10C | Function: sub_1A10C
void __noreturn sub_1A10C()
{
  _QWORD *exception; // x0

  exception = __cxa_allocate_exception(8u);
  *exception = off_49350;
  __cxa_throw(
    exception,
    (struct type_info *)&`typeinfo for'std::bad_exception,
    (void (*)(void *))std::bad_exception::~bad_exception);
}


// Address: 0x1A140 | Function: sub_1A140
void __noreturn sub_1A140()
{
  _QWORD *exception; // x0

  exception = __cxa_allocate_exception(8u);
  *exception = off_49690;
  __cxa_throw(
    exception,
    (struct type_info *)&`typeinfo for'std::bad_alloc,
    (void (*)(void *))std::bad_alloc::~bad_alloc);
}


// Address: 0x1A174 | Function: sub_1A174
void __noreturn sub_1A174()
{
  _QWORD *exception; // x0

  exception = __cxa_allocate_exception(8u);
  *exception = off_496E0;
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::bad_cast, (void (*)(void *))std::bad_cast::~bad_cast);
}


// Address: 0x1A1A8 | Function: sub_1A1A8
void __noreturn sub_1A1A8()
{
  _QWORD *exception; // x0

  exception = __cxa_allocate_exception(8u);
  *exception = off_49730;
  __cxa_throw(
    exception,
    (struct type_info *)&`typeinfo for'std::bad_typeid,
    (void (*)(void *))std::bad_typeid::~bad_typeid);
}


// Address: 0x1A1DC | Function: sub_1A1DC
void __fastcall __noreturn sub_1A1DC(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A6AC(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::logic_error, (void (*)(void *))sub_29C8C);
}


// Address: 0x1A290 | Function: sub_1A290
void __fastcall __noreturn sub_1A290(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A6EC(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::domain_error, (void (*)(void *))sub_29FD4);
}


// Address: 0x1A344 | Function: sub_1A344
void __fastcall __noreturn sub_1A344(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A738(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::invalid_argument, (void (*)(void *))sub_29F48);
}


// Address: 0x1A3F8 | Function: sub_1A3F8
void __fastcall __noreturn sub_1A3F8(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A784(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::length_error, (void (*)(void *))sub_2A060);
}


// Address: 0x1A4AC | Function: sub_1A4AC
void __fastcall __noreturn sub_1A4AC(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A7D0(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::out_of_range, (void (*)(void *))sub_2A0EC);
}


// Address: 0x1A560 | Function: sub_1A560
void __noreturn sub_1A560(const char *a1, ...)
{
  size_t v2; // x0
  void *exception; // x19
  char v4[16]; // [xsp+0h] [xbp+0h] BYREF
  gcc_va_list va; // [xsp+30h] [xbp+30h] BYREF
  __int64 v6; // [xsp+68h] [xbp+68h] BYREF
  gcc_va_list va1; // [xsp+70h] [xbp+70h] BYREF

  va_start(va, a1);
  va_start(va1, a1);
  v2 = strlen(a1);
  sub_1B24C(v4, v2 + 512, a1, va);
  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v6, v4);
  sub_2A7D0(exception, &v6);
  if ( (_UNKNOWN *)(v6 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v6 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::out_of_range, (void (*)(void *))sub_2A0EC);
}


// Address: 0x1A6B4 | Function: sub_1A6B4
void __fastcall __noreturn sub_1A6B4(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A81C(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::runtime_error, (void (*)(void *))sub_29D18);
}


// Address: 0x1A768 | Function: sub_1A768
void __fastcall __noreturn sub_1A768(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A85C(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::range_error, (void (*)(void *))sub_29EBC);
}


// Address: 0x1A81C | Function: sub_1A81C
void __fastcall __noreturn sub_1A81C(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A8A8(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::overflow_error, (void (*)(void *))sub_29DA4);
}


// Address: 0x1A8D0 | Function: sub_1A8D0
void __fastcall __noreturn sub_1A8D0(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_2A8F4(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::underflow_error, (void (*)(void *))sub_29E30);
}


// Address: 0x1A984 | Function: sub_1A984
void __fastcall __noreturn sub_1A984(char *a1)
{
  void *exception; // x19
  __int64 v3; // [xsp+88h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x10u);
  sub_14E70(&v3, a1);
  sub_29ACC(exception, &v3);
  if ( (_UNKNOWN *)(v3 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v3 - 24));
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::ios_base::failure, (void (*)(void *))sub_299AC);
}


// Address: 0x1AAEC | Function: sub_1AAEC
void __fastcall __noreturn sub_1AAEC(int a1)
{
  _DWORD *exception; // x19
  __int64 v3; // x21
  __int64 v4; // [xsp+48h] [xbp+48h] BYREF

  exception = __cxa_allocate_exception(0x20u);
  v3 = sub_1AF20();
  sub_14E70(&v4, "std::future_error");
  sub_2A6AC(exception, &v4);
  if ( (_UNKNOWN *)(v4 - 24) != &unk_4C7C0 )
    sub_1A0CC((unsigned int *)(v4 - 24));
  exception[4] = a1;
  *((_QWORD *)exception + 3) = v3;
  *(_QWORD *)exception = off_48280;
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::future_error, (void (*)(void *))sub_1ACF0);
}


// Address: 0x1ABC8 | Function: sub_1ABC8
void __noreturn sub_1ABC8()
{
  _QWORD *exception; // x0

  exception = __cxa_allocate_exception(8u);
  *exception = off_48250;
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::bad_function_call, (void (*)(void *))sub_1AC5C);
}


// Address: 0x1ABFC | Function: sub_1ABFC
void __fastcall __noreturn sub_1ABFC(unsigned int a1)
{
  void *exception; // x19
  __int64 v2; // [xsp+28h] [xbp+28h]

  v2 = a1;
  exception = __cxa_allocate_exception(0x18u);
  sub_1B020(exception, v2);
  __cxa_throw(exception, (struct type_info *)&`typeinfo for'std::regex_error, (void (*)(void *))sub_1AFE0);
}


// Address: 0x1AC50 | Function: sub_1AC50
const char *sub_1AC50()
{
  return "bad_function_call";
}


// Address: 0x1AC5C | Function: sub_1AC5C
void __fastcall sub_1AC5C(std::exception *a1)
{
  *(_QWORD *)a1 = off_48250;
  std::exception::~exception(a1);
}


// Address: 0x1AC6C | Function: sub_1AC6C
void __fastcall sub_1AC6C(std::exception *a1)
{
  *(_QWORD *)a1 = off_48250;
  std::exception::~exception(a1);
  operator delete(a1);
}


// Address: 0x1AC9C | Function: sub_1AC9C
const char *sub_1AC9C()
{
  return "future";
}


// Address: 0x1ACA8 | Function: sub_1ACA8
__int64 __fastcall sub_1ACA8(_QWORD *a1)
{
  *a1 = off_494E0;
  return nullsub_4();
}


// Address: 0x1ACBC | Function: sub_1ACBC
void __fastcall sub_1ACBC(_QWORD *a1)
{
  *a1 = off_494E0;
  nullsub_4();
  operator delete(a1);
}


// Address: 0x1ACF0 | Function: sub_1ACF0
__int64 __fastcall sub_1ACF0(std::exception *a1)
{
  *(_QWORD *)a1 = off_48280;
  return sub_29C8C(a1);
}


// Address: 0x1AD00 | Function: sub_1AD00
void __fastcall sub_1AD00(std::exception *a1)
{
  *(_QWORD *)a1 = off_48280;
  sub_29C8C(a1);
  operator delete(a1);
}


// Address: 0x1AD30 | Function: sub_1AD30
__int64 *__usercall sub_1AD30@<X0>(int a1@<W1>, __int64 *a2@<X8>)
{
  __int64 *result; // x0

  *a2 = (__int64)&unk_4C7D8;
  switch ( a1 )
  {
    case 1:
      sub_17444(a2, "Future already retrieved", 0x18u);
      result = a2;
      break;
    case 2:
      sub_17444(a2, "Promise already satisfied", 0x19u);
      result = a2;
      break;
    case 3:
      sub_17444(a2, "No associated state", 0x13u);
      result = a2;
      break;
    case 4:
      sub_17444(a2, "Broken promise", 0xEu);
      result = a2;
      break;
    default:
      sub_17444(a2, "Unknown error", 0xDu);
      result = a2;
      break;
  }
  return result;
}


// Address: 0x1AE8C | Function: sub_1AE8C
__int64 __fastcall sub_1AE8C(__int64 a1)
{
  __int64 v1; // x19
  void *v2; // x0
  unsigned int *v4; // x2
  int v5; // w1
  __int64 v6; // [xsp+28h] [xbp+28h] BYREF

  (*(void (__fastcall **)(__int64 *__return_ptr, _QWORD, _QWORD))(**(_QWORD **)(a1 + 24) + 24LL))(
    &v6,
    *(_QWORD *)(a1 + 24),
    *(unsigned int *)(a1 + 16));
  v1 = v6;
  v2 = (void *)(v6 - 24);
  if ( (_UNKNOWN *)(v6 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v6 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v6 - 8);
      *(_DWORD *)(v6 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v2);
  }
  return v1;
}


// Address: 0x1AF20 | Function: sub_1AF20
__int64 (__fastcall **sub_1AF20())()
{
  unsigned __int8 v0; // w0

  v0 = atomic_load((unsigned __int8 *)&byte_5E448);
  if ( (v0 & 1) != 0 || __cxa_guard_acquire((__guard *)&byte_5E448) == 0 )
    return off_4A028;
  __cxa_guard_release((__guard *)&byte_5E448);
  __cxa_atexit((void (*)(void *))sub_1ACA8, off_4A028, &unk_4A000);
  return off_4A028;
}


// Address: 0x1AF90 | Function: sub_1AF90
__int64 __fastcall sub_1AF90(_QWORD *a1)
{
  *a1 = &off_494B0;
  return std::__exception_ptr::exception_ptr::exception_ptr((std::__exception_ptr::exception_ptr *)(a1 + 1));
}


// Address: 0x1AFA0 | Function: sub_1AFA0
void __fastcall sub_1AFA0(_QWORD *a1)
{
  *a1 = &off_494B0;
  std::__exception_ptr::exception_ptr::~exception_ptr((std::__exception_ptr::exception_ptr *)(a1 + 1));
}


// Address: 0x1AFB0 | Function: sub_1AFB0
void __fastcall sub_1AFB0(_QWORD *a1)
{
  *a1 = &off_494B0;
  std::__exception_ptr::exception_ptr::~exception_ptr((std::__exception_ptr::exception_ptr *)(a1 + 1));
  operator delete(a1);
}


// Address: 0x1AFE0 | Function: sub_1AFE0
__int64 __fastcall sub_1AFE0(std::exception *a1)
{
  *(_QWORD *)a1 = off_49560;
  return sub_29D18(a1);
}


// Address: 0x1AFF0 | Function: sub_1AFF0
void __fastcall sub_1AFF0(std::exception *a1)
{
  *(_QWORD *)a1 = off_49560;
  sub_29D18(a1);
  operator delete(a1);
}


// Address: 0x1B020 | Function: sub_1B020
__int64 (__fastcall **__fastcall sub_1B020(__int64 a1, int a2))()
{
  void *v4; // x0
  unsigned int *v6; // x2
  int v7; // w1
  __int64 v8; // [xsp+48h] [xbp+48h] BYREF

  sub_14E70(&v8, "regex_error");
  sub_2A81C(a1, &v8);
  v4 = (void *)(v8 - 24);
  if ( (_UNKNOWN *)(v8 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v6 = (unsigned int *)(v8 - 8);
      do
        v7 = __ldaxr(v6);
      while ( __stlxr(v7 - 1, v6) != 0 );
    }
    else
    {
      v7 = *(_DWORD *)(v8 - 8);
      *(_DWORD *)(v8 - 8) = v7 - 1;
    }
    if ( v7 <= 0 )
      operator delete(v4);
  }
  *(_DWORD *)(a1 + 16) = a2;
  *(_QWORD *)a1 = off_49560;
  return off_49560;
}


// Address: 0x1B140 | Function: sub_1B140
void __fastcall __noreturn sub_1B140(const void *a1, __int64 a2)
{
  size_t v2; // x21
  void *v4; // x0
  char v5[16]; // [xsp+0h] [xbp+0h] BYREF
  _BYTE v6[59]; // [xsp+30h] [xbp+30h] BYREF
  char v7; // [xsp+6Bh] [xbp+6Bh] BYREF

  v2 = a2 - (_QWORD)a1;
  v4 = memcpy(
         v6,
         "not enough space for format expansion (Please submit full bug report at http://gcc.gnu.org/bugs.html):\n    ",
         0x6Cu);
  memcpy(v5, v4, 0x6Bu);
  memcpy(&v7, a1, v2);
  v6[v2 + 59] = 0;
  sub_1A1DC(v5);
}


// Address: 0x1B1B8 | Function: sub_1B1B8
__int64 __fastcall sub_1B1B8(void *a1, unsigned __int64 a2, unsigned __int64 a3)
{
  char *v3; // x7
  _BYTE *v4; // x5
  unsigned __int64 v5; // x3
  signed int v6; // w19
  _BYTE v9[24]; // [xsp+18h] [xbp-18h] BYREF

  v3 = off_4A048[0];
  v4 = v9;
  do
  {
    v5 = a3 % 0xA;
    a3 /= 0xAu;
    *--v4 = v3[v5 + 4];
  }
  while ( a3 != 0 );
  v6 = (unsigned int)v9 - (_DWORD)v4;
  if ( v6 > a2 )
    return (unsigned int)-1;
  else
    memcpy(a1, v9 - 8 * v6 + 32, v6);
  return (unsigned int)v6;
}


// Address: 0x1B24C | Function: sub_1B24C
signed __int64 __fastcall sub_1B24C(char *a1, __int64 a2, unsigned __int8 *a3, __int64 a4)
{
  char *v6; // x21
  char *v7; // x19
  unsigned __int64 v8; // x22
  __int64 v9; // x25
  int v10; // w24
  int v11; // w0
  char v12; // w1
  int v13; // w2
  unsigned __int8 **v14; // x0
  __int64 v15; // x1
  int v16; // w0
  int v17; // t1
  unsigned __int64 *v19; // x0
  int v20; // w0

  v6 = &a1[a2 - 1];
  v7 = a1;
  v8 = *(_QWORD *)a4;
  v9 = *(_QWORD *)(a4 + 8);
  v10 = *(_DWORD *)(a4 + 24);
  while ( 1 )
  {
    v11 = *a3;
    if ( *a3 == 0 )
      break;
    while ( 1 )
    {
      if ( v7 >= v6 )
        goto LABEL_22;
      v12 = v11;
      if ( v11 != 37 )
        goto LABEL_2;
      v13 = a3[1];
      if ( v13 != 115 )
        break;
      if ( v10 < 0 )
      {
        if ( v10 + 8 <= 0 )
        {
          v14 = (unsigned __int8 **)(v9 + v10);
          v10 += 8;
        }
        else
        {
          v14 = (unsigned __int8 **)v8;
          v10 += 8;
          v8 = (v8 + 15) & 0xFFFFFFFFFFFFFFF8LL;
        }
      }
      else
      {
        v14 = (unsigned __int8 **)v8;
        v8 = (v8 + 15) & 0xFFFFFFFFFFFFFFF8LL;
      }
      v15 = (__int64)*v14;
      v16 = **v14;
      if ( v16 != 0 )
      {
        while ( 1 )
        {
          *v7++ = v16;
          v17 = *(unsigned __int8 *)++v15;
          LOBYTE(v16) = v17;
          if ( v17 == 0 )
            break;
          if ( v7 == v6 )
            goto LABEL_22;
        }
      }
      a3 += 2;
      v11 = *a3;
      if ( *a3 == 0 )
        goto LABEL_16;
    }
    if ( v13 != 122 )
    {
      a3 += v13 == 37;
      goto LABEL_2;
    }
    v12 = 37;
    if ( a3[2] == 117 )
    {
      if ( v10 < 0 )
      {
        if ( v10 + 8 <= 0 )
        {
          v19 = (unsigned __int64 *)(v9 + v10);
          v10 += 8;
        }
        else
        {
          v19 = (unsigned __int64 *)v8;
          v10 += 8;
          v8 = (v8 + 15) & 0xFFFFFFFFFFFFFFF8LL;
        }
      }
      else
      {
        v19 = (unsigned __int64 *)v8;
        v8 = (v8 + 15) & 0xFFFFFFFFFFFFFFF8LL;
      }
      v20 = sub_1B1B8(v7, v6 - v7, *v19);
      if ( v20 <= 0 )
LABEL_22:
        sub_1B140(a1, (__int64)v7);
      v7 += v20;
      a3 += 3;
    }
    else
    {
LABEL_2:
      *v7 = v12;
      ++a3;
      ++v7;
    }
  }
LABEL_16:
  *v7 = 0;
  return v7 - a1;
}


// Address: 0x1B3DC | Function: sub_1B3DC
const char *sub_1B3DC()
{
  return "generic";
}


// Address: 0x1B3E8 | Function: sub_1B3E8
const char *sub_1B3E8()
{
  return "system";
}


// Address: 0x1B3F4 | Function: sub_1B3F4
__int64 __fastcall sub_1B3F4(__int64 a1, unsigned int a2)
{
  return a2;
}


// Address: 0x1B404 | Function: sub_1B404
bool __fastcall sub_1B404(__int64 a1, __int64 a2, __int64 a3)
{
  int v3; // w0
  __int64 v4; // x1

  v3 = (*(__int64 (__fastcall **)(__int64))(*(_QWORD *)a1 + 32LL))(a1);
  return *(_QWORD *)(a3 + 8) == v4 && *(_DWORD *)a3 == v3;
}


// Address: 0x1B454 | Function: sub_1B454
bool __fastcall sub_1B454(__int64 a1, __int64 a2, int a3)
{
  return *(_QWORD *)(a2 + 8) == a1 && *(_DWORD *)a2 == a3;
}


// Address: 0x1B480 | Function: nullsub_1
void nullsub_1()
{
  ;
}


// Address: 0x1B484 | Function: nullsub_2
void nullsub_2()
{
  ;
}


// Address: 0x1B488 | Function: j_._ZdlPv_0
// attributes: thunk
void __fastcall operator delete(void *p)
{
  ._ZdlPv(p);
}


// Address: 0x1B48C | Function: j_._ZdlPv_1
// attributes: thunk
void __fastcall operator delete(void *p)
{
  ._ZdlPv(p);
}


// Address: 0x1B490 | Function: sub_1B490
_QWORD *__usercall sub_1B490@<X0>(int errnum@<W1>, _QWORD *a2@<X8>)
{
  char *v3; // x0

  v3 = strerror(errnum);
  sub_14E70(a2, v3);
  return a2;
}


// Address: 0x1B4C8 | Function: sub_1B4C8
_QWORD *__usercall sub_1B4C8@<X0>(int errnum@<W1>, _QWORD *a2@<X8>)
{
  char *v3; // x0

  v3 = strerror(errnum);
  sub_14E70(a2, v3);
  return a2;
}


// Address: 0x1B500 | Function: sub_1B500
__int64 __fastcall sub_1B500(std::exception *a1)
{
  *(_QWORD *)a1 = off_49610;
  return sub_29D18(a1);
}


// Address: 0x1B510 | Function: sub_1B510
void __fastcall sub_1B510(std::exception *a1)
{
  *(_QWORD *)a1 = off_49610;
  sub_29D18(a1);
  operator delete(a1);
}


// Address: 0x1B540 | Function: nullsub_4
void nullsub_4()
{
  ;
}


// Address: 0x1B544 | Function: j_._ZdlPv_3
// attributes: thunk
void __fastcall operator delete(void *p)
{
  ._ZdlPv(p);
}


// Address: 0x1B548 | Function: sub_1B548
__int64 (__fastcall **sub_1B548())()
{
  return &off_4A038;
}


// Address: 0x1B554 | Function: sub_1B554
__int64 (__fastcall **sub_1B554())()
{
  return off_4A030;
}


// Address: 0x1B560 | Function: sub_1B560
__int64 __fastcall sub_1B560(unsigned int *a1)
{
  return (*(__int64 (__fastcall **)(_QWORD, _QWORD))(**((_QWORD **)a1 + 1) + 32LL))(*((_QWORD *)a1 + 1), *a1);
}


// Address: 0x1B588 | Function: _ZNKSt9bad_alloc4whatEv
const char *__fastcall std::bad_alloc::what(std::bad_alloc *this)
{
  return "std::bad_alloc";
}


// Address: 0x1B594 | Function: _ZNSt9bad_allocD1Ev
// Alternative name is '_ZNSt9bad_allocD2Ev'
void __fastcall std::bad_alloc::~bad_alloc(std::bad_alloc *this)
{
  *(_QWORD *)this = off_49690;
  std::exception::~exception(this);
}


// Address: 0x1B5A8 | Function: _ZNSt9bad_allocD0Ev
void __fastcall std::bad_alloc::~bad_alloc(std::bad_alloc *this)
{
  std::bad_alloc::~bad_alloc(this);
  operator delete(this);
}


// Address: 0x1B5CC | Function: _ZNKSt8bad_cast4whatEv
const char *__fastcall std::bad_cast::what(std::bad_cast *this)
{
  return "std::bad_cast";
}


// Address: 0x1B5D8 | Function: _ZNSt8bad_castD1Ev
// Alternative name is '_ZNSt8bad_castD2Ev'
void __fastcall std::bad_cast::~bad_cast(std::bad_cast *this)
{
  *(_QWORD *)this = off_496E0;
  std::exception::~exception(this);
}


// Address: 0x1B5EC | Function: _ZNSt8bad_castD0Ev
void __fastcall std::bad_cast::~bad_cast(std::bad_cast *this)
{
  std::bad_cast::~bad_cast(this);
  operator delete(this);
}


// Address: 0x1B610 | Function: _ZNKSt10bad_typeid4whatEv
const char *__fastcall std::bad_typeid::what(std::bad_typeid *this)
{
  return "std::bad_typeid";
}


// Address: 0x1B61C | Function: _ZNSt10bad_typeidD2Ev
// Alternative name is '_ZNSt10bad_typeidD1Ev'
void __fastcall std::bad_typeid::~bad_typeid(std::bad_typeid *this)
{
  *(_QWORD *)this = off_49730;
  std::exception::~exception(this);
}


// Address: 0x1B630 | Function: _ZNSt10bad_typeidD0Ev
void __fastcall std::bad_typeid::~bad_typeid(std::bad_typeid *this)
{
  std::bad_typeid::~bad_typeid(this);
  operator delete(this);
}


// Address: 0x1B654 | Function: _ZNK10__cxxabiv117__class_type_info11__do_upcastEPKS0_PPv
__int64 __fastcall __cxxabiv1::__class_type_info::__do_upcast(__int64 a1, __int64 a2, __int64 *a3)
{
  __int64 v4; // x2
  void (__fastcall *v5)(__int64, __int64, __int64, __int64 *); // x4
  __int64 result; // x0
  __int64 v7; // [xsp+28h] [xbp+28h] BYREF
  int v8; // [xsp+30h] [xbp+30h]
  int v9; // [xsp+34h] [xbp+34h]
  __int64 v10; // [xsp+38h] [xbp+38h]

  v4 = *a3;
  v5 = *(void (__fastcall **)(__int64, __int64, __int64, __int64 *))(*(_QWORD *)a1 + 48LL);
  v7 = 0;
  v8 = 0;
  v9 = 16;
  v10 = 0;
  v5(a1, a2, v4, &v7);
  result = 0;
  if ( (v8 & 6) == 6 )
  {
    *a3 = v7;
    return 1;
  }
  return result;
}


// Address: 0x1B6B8 | Function: _ZNK10__cxxabiv117__class_type_info20__do_find_public_srcElPKvPKS0_S2_
__int64 __fastcall __cxxabiv1::__class_type_info::__do_find_public_src(
        __int64 a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5)
{
  if ( a5 == a3 )
    return 6;
  else
    return 1;
}


// Address: 0x1B6C8 | Function: _ZN10__cxxabiv117__class_type_infoD1Ev
// Alternative name is '_ZN10__cxxabiv117__class_type_infoD2Ev'
void __fastcall __cxxabiv1::__class_type_info::~__class_type_info(__cxxabiv1::__class_type_info *this)
{
  *(_QWORD *)this = off_49780;
  nullsub_5();
}


// Address: 0x1B6DC | Function: _ZN10__cxxabiv117__class_type_infoD0Ev
void __fastcall __cxxabiv1::__class_type_info::~__class_type_info(__cxxabiv1::__class_type_info *this)
{
  __cxxabiv1::__class_type_info::~__class_type_info(this);
  operator delete(this);
}


// Address: 0x1B700 | Function: _ZNK10__cxxabiv117__class_type_info11__do_upcastEPKS0_PKvRNS0_15__upcast_resultE
__int64 __fastcall __cxxabiv1::__class_type_info::__do_upcast(__int64 a1, __int64 a2, __int64 a3, __int64 a4)
{
  const char *v4; // x0
  const char *v5; // x1
  int v6; // w0
  __int64 v8; // [xsp+10h] [xbp+10h]
  __int64 v9; // [xsp+18h] [xbp+18h]

  v4 = *(const char **)(a1 + 8);
  v5 = *(const char **)(a2 + 8);
  if ( v4 != v5 )
  {
    v8 = a4;
    v9 = a3;
    if ( *v4 == 42 )
      return 0;
    v6 = strcmp(v4, v5);
    a3 = v9;
    a4 = v8;
    if ( v6 != 0 )
      return 0;
  }
  *(_QWORD *)a4 = a3;
  *(_QWORD *)(a4 + 16) = 16;
  *(_DWORD *)(a4 + 8) = 6;
  return 1;
}


// Address: 0x1B768 | Function: _ZNK10__cxxabiv117__class_type_info10__do_catchEPKSt9type_infoPPvj
__int64 __fastcall __cxxabiv1::__class_type_info::__do_catch(
        __cxxabiv1::__class_type_info *this,
        const char **a2,
        void **a3,
        unsigned int a4)
{
  const char *v4; // x4
  int v9; // w0
  unsigned int v10; // w1

  v4 = *((const char **)this + 1);
  if ( v4 == a2[1] )
    return 1;
  if ( *v4 == 42 || (v9 = strcmp(v4, a2[1]), v10 = 1, v9 != 0) )
  {
    v10 = 0;
    if ( a4 <= 3 )
      return (*((unsigned __int8 (__fastcall **)(const char **, __cxxabiv1::__class_type_info *, void **))*a2 + 5))(
               a2,
               this,
               a3);
  }
  return v10;
}


// Address: 0x1B820 | Function: _ZNK10__cxxabiv117__class_type_info12__do_dyncastElNS0_10__sub_kindEPKS0_PKvS3_S5_RNS0_16__dyncast_resultE
__int64 __fastcall __cxxabiv1::__class_type_info::__do_dyncast(
        __int64 a1,
        __int64 a2,
        int a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8)
{
  const char *v8; // x19
  const char *v9; // x1
  int v10; // w0
  const char *v12; // x1
  int v13; // w0
  __int64 v14; // [xsp+20h] [xbp+20h]
  __int64 v15; // [xsp+28h] [xbp+28h]
  __int64 v16; // [xsp+28h] [xbp+28h]
  __int64 v17; // [xsp+30h] [xbp+30h]
  int v19; // [xsp+38h] [xbp+38h]
  int v20; // [xsp+38h] [xbp+38h]

  v8 = *(const char **)(a1 + 8);
  if ( a5 != a7 )
  {
    v9 = *(const char **)(a4 + 8);
    if ( v8 != v9 )
    {
      if ( *v8 == 42 )
        return 0;
      goto LABEL_4;
    }
    goto LABEL_10;
  }
  v12 = *(const char **)(a6 + 8);
  if ( v8 != v12 )
  {
    if ( *v8 == 42 )
    {
      if ( v8 != *(const char **)(a4 + 8) )
        return 0;
      goto LABEL_10;
    }
    v14 = a8;
    v16 = a5;
    v20 = a3;
    v13 = strcmp(v8, v12);
    a3 = v20;
    a5 = v16;
    a8 = v14;
    if ( v13 != 0 )
    {
      v9 = *(const char **)(a4 + 8);
      if ( v8 != v9 )
      {
LABEL_4:
        v15 = a8;
        v17 = a5;
        v19 = a3;
        v10 = strcmp(v8, v9);
        a3 = v19;
        a5 = v17;
        a8 = v15;
        if ( v10 != 0 )
          return 0;
      }
LABEL_10:
      *(_QWORD *)a8 = a5;
      *(_DWORD *)(a8 + 8) = a3;
      *(_DWORD *)(a8 + 16) = 1;
      return 0;
    }
  }
  *(_DWORD *)(a8 + 12) = a3;
  return 0;
}


// Address: 0x1B918 | Function: sub_1B918
__int64 __fastcall sub_1B918(__int64 a1, int a2, __int64 a3, __int64 a4)
{
  __int64 result; // x0
  int v5; // w4
  __int64 v6; // x7

  switch ( a2 )
  {
    case 1:
    case 2:
    case 3:
    case 4:
    case 11:
    case 33:
    case 43:
    case 45:
    case 54:
    case 55:
    case 56:
    case 57:
    case 58:
    case 60:
    case 61:
    case 63:
    case 75:
    case 76:
      if ( a3 == 0 )
        return 0;
      goto LABEL_9;
    case 9:
    case 10:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 34:
    case 35:
    case 36:
    case 37:
    case 38:
    case 40:
    case 51:
    case 52:
    case 53:
    case 59:
    case 62:
    case 66:
    case 67:
    case 68:
    case 72:
    case 73:
    case 74:
      if ( a3 != 0 )
        goto LABEL_5;
      return 0;
    case 25:
    case 26:
    case 27:
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 41:
    case 46:
    case 47:
LABEL_5:
      v5 = *(_DWORD *)(a1 + 40);
      if ( v5 < *(_DWORD *)(a1 + 44) )
        goto LABEL_6;
      return 0;
    case 42:
    case 48:
LABEL_9:
      if ( a4 == 0 )
        return 0;
      v5 = *(_DWORD *)(a1 + 40);
      if ( v5 >= *(_DWORD *)(a1 + 44) )
        return 0;
LABEL_6:
      v6 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v5 + 1;
      result = v6 + 24LL * v5;
      if ( result == 0 )
        return 0;
      *(_DWORD *)(v6 + 24LL * v5) = a2;
      *(_QWORD *)(result + 8) = a3;
      *(_QWORD *)(result + 16) = a4;
      return result;
    default:
      return 0;
  }
}


// Address: 0x1B9B8 | Function: sub_1B9B8
__int64 __fastcall sub_1B9B8(__int64 a1, __int64 a2, int a3)
{
  int v3; // w3
  __int64 v4; // x5
  __int64 v5; // x4
  __int64 v6; // x3

  v3 = *(_DWORD *)(a1 + 40);
  if ( v3 >= *(_DWORD *)(a1 + 44) )
    return 0;
  v4 = *(_QWORD *)(a1 + 32);
  v5 = 24LL * v3;
  *(_DWORD *)(a1 + 40) = v3 + 1;
  v6 = v4 + v5;
  if ( v4 + v5 == 0 || a2 == 0 || a3 == 0 )
    return 0;
  *(_DWORD *)(v4 + v5) = 0;
  *(_QWORD *)(v6 + 8) = a2;
  *(_DWORD *)(v6 + 16) = a3;
  return v4 + v5;
}


// Address: 0x1BA18 | Function: sub_1BA18
__int64 *__fastcall sub_1BA18(__int64 a1, __int64 *a2, int a3)
{
  __int64 *v3; // x21
  __int64 *v4; // x28
  unsigned __int8 *v5; // x1
  int i; // w2
  int v9; // w1
  __int64 v10; // x0
  int v11; // w1
  _DWORD *v13; // x21
  int v14; // w0

  v3 = a2;
  v4 = a2;
  v5 = *(unsigned __int8 **)(a1 + 24);
  for ( i = *v5; i == 86 || i == 114; i = *v5 )
  {
    *(_QWORD *)(a1 + 24) = v5 + 1;
    if ( i != 114 )
    {
      if ( a3 != 0 )
        v9 = 29;
      else
        v9 = 26;
      *(_DWORD *)(a1 + 80) += 9;
LABEL_8:
      v10 = sub_1B918(a1, v9, 0, 0);
      *v4 = v10;
      if ( v10 == 0 )
        return nullptr;
      goto LABEL_9;
    }
    if ( a3 != 0 )
      v11 = 28;
    else
      v11 = 25;
    *(_DWORD *)(a1 + 80) += 9;
    v10 = sub_1B918(a1, v11, 0, 0);
    *v4 = v10;
    if ( v10 == 0 )
      return nullptr;
LABEL_9:
    v5 = *(unsigned __int8 **)(a1 + 24);
    v4 = (__int64 *)(v10 + 8);
  }
  if ( i == 75 )
  {
    *(_QWORD *)(a1 + 24) = v5 + 1;
    if ( a3 != 0 )
      v9 = 30;
    else
      v9 = 27;
    *(_DWORD *)(a1 + 80) += 6;
    goto LABEL_8;
  }
  if ( a3 == 0 && i == 70 && v3 != v4 )
  {
    do
    {
      while ( 1 )
      {
        v13 = (_DWORD *)*v3;
        v14 = *v13;
        if ( *v13 != 26 )
          break;
        *v13 = 29;
        v3 = (__int64 *)(v13 + 2);
        if ( v3 == v4 )
          return v4;
      }
      if ( v14 == 27 )
      {
        *v13 = 30;
      }
      else if ( v14 == 25 )
      {
        *v13 = 28;
      }
      v3 = (__int64 *)(v13 + 2);
    }
    while ( v3 != v4 );
  }
  return v4;
}


// Address: 0x1BBC8 | Function: sub_1BBC8
__int64 __fastcall sub_1BBC8(__int64 a1, int a2)
{
  _BYTE *v2; // x2
  __int64 v3; // x1
  int v5; // w2
  unsigned __int8 v6; // w5
  unsigned int v7; // w3
  unsigned int v8; // w6
  unsigned int v9; // w1
  int v10; // w2
  bool v11; // cc
  _BYTE *v12; // x4
  unsigned int v13; // w4
  _BOOL4 v14; // w1
  _QWORD *v15; // x2
  unsigned int v16; // w1
  __int64 v17; // x1
  __int64 v18; // x6
  int v19; // w3
  __int64 v20; // x8
  int v21; // w5
  int v22; // w10
  __int64 v23; // x4
  __int64 v24; // x9
  __int64 v25; // x7
  __int64 v26; // x4
  __int64 v27; // x7
  __int64 v28; // x6
  int v29; // w4
  __int64 v30; // x5
  __int64 v31; // x2
  __int64 v32; // x0

  v2 = *(_BYTE **)(a1 + 24);
  if ( *v2 != 83 )
    return 0;
  *(_QWORD *)(a1 + 24) = v2 + 1;
  if ( v2[1] == 0 )
  {
    v5 = 0;
    goto LABEL_16;
  }
  *(_QWORD *)(a1 + 24) = v2 + 2;
  v5 = (unsigned __int8)v2[1];
  v6 = v5 - 48;
  if ( (unsigned __int8)(v5 - 48) > 9u && v5 != 95 )
  {
    if ( (unsigned __int8)(v5 - 65) <= 0x19u )
      goto LABEL_8;
LABEL_16:
    v13 = a2 != 0;
    v14 = (*(_DWORD *)(a1 + 16) & 8LL) != 0;
    if ( v13 > v14 )
      v14 = (unsigned __int8)(**(_BYTE **)(a1 + 24) - 67) <= 1u;
    switch ( v5 )
    {
      case 't':
        v15 = &unk_48760;
        break;
      case 'a':
        v15 = &unk_48798;
        break;
      case 'b':
        v15 = &unk_487D0;
        break;
      case 's':
        v15 = &unk_48808;
        break;
      case 'i':
        v15 = &unk_48840;
        break;
      case 'o':
        v15 = &unk_48878;
        break;
      case 'd':
        v15 = &unk_488B0;
        break;
      default:
        return 0;
    }
    v18 = v15[5];
    if ( v18 != 0 )
    {
      v19 = *(_DWORD *)(a1 + 40);
      v20 = 0;
      v21 = *(_DWORD *)(a1 + 44);
      v22 = *((_DWORD *)v15 + 12);
      if ( v19 < v21 )
      {
        v23 = v19;
        v24 = *(_QWORD *)(a1 + 32);
        v25 = 32LL * v19++;
        v26 = v25 - 8 * v23;
        *(_DWORD *)(a1 + 40) = v19;
        v27 = v24 + v26;
        if ( v24 + v26 != 0 )
        {
          *(_DWORD *)(v24 + v26) = 24;
          *(_QWORD *)(v27 + 8) = v18;
          v20 = v24 + v26;
          *(_DWORD *)(v27 + 16) = v22;
        }
      }
      *(_QWORD *)(a1 + 72) = v20;
    }
    else
    {
      v21 = *(_DWORD *)(a1 + 44);
      v19 = *(_DWORD *)(a1 + 40);
    }
    if ( v14 )
    {
      v28 = v15[3];
      v29 = *((_DWORD *)v15 + 8);
    }
    else
    {
      v28 = v15[1];
      v29 = *((_DWORD *)v15 + 4);
    }
    *(_DWORD *)(a1 + 80) += v29;
    if ( v21 > v19 )
    {
      v30 = *(_QWORD *)(a1 + 32);
      v31 = 24LL * v19;
      *(_DWORD *)(a1 + 40) = v19 + 1;
      v32 = v30 + v31;
      v3 = 0;
      if ( v30 + v31 != 0 )
      {
        *(_DWORD *)(v30 + 24LL * v19) = 24;
        *(_QWORD *)(v32 + 8) = v28;
        v3 = v30 + v31;
        *(_DWORD *)(v32 + 16) = v29;
      }
      return v3;
    }
    return 0;
  }
  if ( v5 == 95 )
  {
    v16 = 0;
    goto LABEL_29;
  }
LABEL_8:
  v7 = 0;
  while ( 1 )
  {
    v8 = (unsigned __int8)(v5 - 65);
    v9 = 36 * v7 + v5 - 55;
    v10 = 36 * v7 + v5;
    if ( v6 > 9u )
    {
      if ( v8 > 0x19 )
        return 0;
    }
    else
    {
      v9 = v10 - 48;
    }
    v11 = v7 > v9;
    v5 = 0;
    v7 = v9;
    if ( v11 )
      return 0;
    v12 = *(_BYTE **)(a1 + 24);
    if ( *v12 != 0 )
    {
      *(_QWORD *)(a1 + 24) = v12 + 1;
      v5 = (unsigned __int8)*v12;
      if ( v5 == 95 )
        break;
    }
    v6 = v5 - 48;
  }
  v16 = v9 + 1;
LABEL_29:
  if ( v16 >= *(_DWORD *)(a1 + 56) )
    return 0;
  v17 = *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v16);
  ++*(_DWORD *)(a1 + 64);
  return v17;
}


// Address: 0x1BE88 | Function: sub_1BE88
char *__fastcall sub_1BE88(char *result, _DWORD *a2, __int64 a3)
{
  __int64 v3; // x19
  _DWORD *v4; // x21
  unsigned int v6; // w0
  __int64 v7; // kr00_8
  _DWORD *v8; // x2

  v3 = a3;
  v4 = result;
  if ( a3 != 0 )
  {
    while ( 2 )
    {
      v6 = *(_DWORD *)v3 - 1;
      v7 = v6;
      result = (char *)&loc_1BEE0 + 4 * jpt_1BEDC[v6];
      switch ( v7 )
      {
        case 0LL:
        case 1LL:
        case 2LL:
        case 8LL:
        case 9LL:
        case 10LL:
        case 11LL:
        case 12LL:
        case 13LL:
        case 14LL:
        case 15LL:
        case 16LL:
        case 17LL:
        case 18LL:
        case 19LL:
        case 20LL:
        case 21LL:
        case 22LL:
        case 24LL:
        case 25LL:
        case 26LL:
        case 27LL:
        case 28LL:
        case 29LL:
        case 30LL:
        case 31LL:
        case 32LL:
        case 33LL:
        case 36LL:
        case 37LL:
        case 39LL:
        case 40LL:
        case 41LL:
        case 42LL:
        case 43LL:
        case 44LL:
        case 45LL:
        case 46LL:
        case 47LL:
        case 50LL:
        case 51LL:
        case 52LL:
        case 53LL:
        case 54LL:
        case 55LL:
        case 56LL:
        case 57LL:
        case 58LL:
        case 59LL:
        case 60LL:
        case 61LL:
        case 62LL:
        case 65LL:
        case 71LL:
        case 72LL:
        case 73LL:
        case 74LL:
        case 75LL:
          goto LABEL_12;
        case 3LL:
          ++*v4;
          v8 = *(_DWORD **)(v3 + 8);
          goto LABEL_13;
        case 4LL:
        case 5LL:
        case 23LL:
        case 38LL:
        case 48LL:
        case 63LL:
        case 64LL:
        case 70LL:
          return result;
        case 6LL:
        case 7LL:
        case 49LL:
          v3 = *(_QWORD *)(v3 + 16);
          if ( v3 != 0 )
            continue;
          return result;
        case 34LL:
        case 35LL:
          v8 = *(_DWORD **)(v3 + 8);
          if ( *v8 == 5 )
          {
            ++*a2;
LABEL_12:
            v8 = *(_DWORD **)(v3 + 8);
          }
LABEL_13:
          result = (char *)sub_1BE88(v4, a2, v8);
          v3 = *(_QWORD *)(v3 + 16);
          if ( v3 == 0 )
            return result;
          continue;
        case 66LL:
        case 67LL:
        case 68LL:
        case 69LL:
          v3 = *(_QWORD *)(v3 + 8);
          if ( v3 != 0 )
            continue;
          return result;
        default:
          return (char *)(unsigned int)(*(_DWORD *)v3 - 1);
      }
    }
  }
  return result;
}


// Address: 0x1BF54 | Function: sub_1BF54
__int64 __fastcall sub_1BF54(__int64 a1, char a2)
{
  __int64 v3; // x1
  __int64 result; // x0
  void (__fastcall *v6)(__int64, __int64, __int64); // x3
  __int64 v7; // x2
  __int64 v8; // x2

  v3 = *(_QWORD *)(a1 + 256);
  if ( v3 == 255 )
  {
    v6 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
    v7 = *(_QWORD *)(a1 + 280);
    *(_BYTE *)(a1 + 255) = 0;
    v6(a1, 255, v7);
    v8 = *(_QWORD *)(a1 + 312);
    result = 1;
    *(_QWORD *)(a1 + 256) = 1;
    *(_QWORD *)(a1 + 312) = v8 + 1;
    *(_BYTE *)a1 = a2;
  }
  else
  {
    result = v3 + 1;
    *(_QWORD *)(a1 + 256) = v3 + 1;
    *(_BYTE *)(a1 + v3) = a2;
  }
  *(_BYTE *)(a1 + 264) = a2;
  return result;
}


// Address: 0x1BFCC | Function: sub_1BFCC
__int64 __fastcall sub_1BFCC(unsigned __int8 **a1)
{
  __int64 v1; // x1
  int v2; // w3
  __int64 v3; // x5
  __int64 v4; // x6
  __int64 v5; // x1
  unsigned __int8 *v6; // x4
  __int64 v7; // x1
  char v8; // t1

  v1 = (__int64)*a1;
  v2 = **a1;
  if ( v2 == 110 )
  {
    *a1 = (unsigned __int8 *)(v1 + 1);
    v3 = 1;
    v4 = -1;
    LOBYTE(v2) = *(_BYTE *)(v1 + 1);
  }
  else
  {
    v3 = 0;
    v4 = 0;
  }
  if ( (unsigned __int8)(v2 - 48) > 9u )
  {
    v5 = 0;
  }
  else
  {
    v5 = 0;
    v6 = *a1 + 1;
    do
    {
      *a1 = v6;
      v7 = 10 * v5 + (unsigned __int8)v2;
      v8 = *v6++;
      LOBYTE(v2) = v8;
      v5 = v7 - 48;
    }
    while ( (unsigned __int8)(v8 - 48) <= 9u );
  }
  return (v5 ^ v4) + v3;
}


// Address: 0x1C054 | Function: sub_1C054
__int64 __fastcall sub_1C054(__int64 a1, __int64 *a2)
{
  __int64 v2; // x2
  __int64 v3; // x0
  __int64 v4; // x2
  __int64 v5; // x1
  int v6; // w0

  v2 = *(_QWORD *)(a1 + 288);
  if ( v2 == 0 )
  {
    *(_DWORD *)(a1 + 304) = 1;
    return 0;
  }
  v3 = *(_QWORD *)(v2 + 8);
  v4 = *a2;
  v5 = *(_QWORD *)(v3 + 16);
  v6 = v4;
  if ( v5 == 0 || *(_DWORD *)v5 != 47 )
    return 0;
  if ( (int)v4 > 0 )
  {
    while ( 1 )
    {
      v5 = *(_QWORD *)(v5 + 16);
      --v6;
      if ( v5 == 0 || *(_DWORD *)v5 != 47 )
        break;
      if ( v6 == 0 )
        return *(_QWORD *)(v5 + 8);
    }
    return 0;
  }
  if ( (_DWORD)v4 != 0 )
    return 0;
  return *(_QWORD *)(v5 + 8);
}


// Address: 0x1C0D0 | Function: sub_1C0D0
_DWORD *__fastcall sub_1C0D0(__int64 a1, __int64 a2)
{
  __int64 v2; // x19
  _DWORD *result; // x0

  v2 = a2;
  if ( a2 != 0 )
  {
    while ( 2 )
    {
      switch ( *(_DWORD *)v2 )
      {
        case 0:
        case 6:
        case 0x18:
        case 0x27:
        case 0x31:
        case 0x40:
        case 0x45:
        case 0x47:
        case 0x4A:
        case 0x4B:
          return nullptr;
        case 5:
          result = (_DWORD *)sub_1C054(a1, (__int64 *)(v2 + 8));
          if ( result == nullptr || *result != 47 )
            return nullptr;
          return result;
        case 7:
        case 8:
        case 0x32:
          goto LABEL_4;
        default:
          result = (_DWORD *)sub_1C0D0(a1, *(_QWORD *)(v2 + 8));
          if ( result != nullptr )
            return result;
LABEL_4:
          v2 = *(_QWORD *)(v2 + 16);
          if ( v2 == 0 )
            return nullptr;
          continue;
      }
    }
  }
  return nullptr;
}


// Address: 0x1C168 | Function: sub_1C168
unsigned __int64 __fastcall sub_1C168(void *a1, size_t a2, __int64 a3)
{
  size_t v4; // x19
  unsigned __int64 result; // x0
  void *v8; // x0

  v4 = *(_QWORD *)(a3 + 16);
  result = *(_QWORD *)(a3 + 8) + 1LL + a2;
  if ( result > v4 )
  {
    if ( *(_DWORD *)(a3 + 24) != 0 )
      return result;
    if ( v4 != 0 || (v4 = 2, result > 2) )
    {
      do
        v4 *= 2LL;
      while ( result > v4 );
    }
    v8 = realloc(*(void **)a3, v4);
    if ( v8 == nullptr )
    {
      free(*(void **)a3);
      *(_QWORD *)a3 = 0;
      *(_QWORD *)(a3 + 8) = 0;
      *(_QWORD *)(a3 + 16) = 0;
      *(_DWORD *)(a3 + 24) = 1;
      return 1;
    }
    *(_QWORD *)a3 = v8;
    *(_QWORD *)(a3 + 16) = v4;
  }
  result = *(unsigned int *)(a3 + 24);
  if ( (_DWORD)result == 0 )
  {
    memcpy((void *)(*(_QWORD *)a3 + *(_QWORD *)(a3 + 8)), a1, a2);
    *(_BYTE *)(*(_QWORD *)a3 + a2 + *(_QWORD *)(a3 + 8)) = 0;
    result = *(_QWORD *)(a3 + 8);
    *(_QWORD *)(a3 + 8) = result + a2;
  }
  return result;
}


// Address: 0x1C258 | Function: sub_1C258
size_t __fastcall sub_1C258(__int64 a1, char *a2)
{
  size_t result; // x0
  char *v4; // x19
  __int64 v5; // x1
  char *v6; // x22
  char v7; // w21
  __int64 v8; // x2
  __int64 v9; // x2
  void (__fastcall *v10)(__int64, __int64, __int64); // x3
  __int64 v11; // x0

  result = strlen(a2);
  if ( result != 0 )
  {
    v4 = a2;
    v5 = *(_QWORD *)(a1 + 256);
    v6 = &a2[result];
    do
    {
      while ( 1 )
      {
        v7 = *v4;
        v8 = v5;
        if ( v5 == 255 )
          break;
        *(_QWORD *)(a1 + 256) = ++v5;
        ++v4;
        *(_BYTE *)(a1 + v8) = v7;
        *(_BYTE *)(a1 + 264) = v7;
        if ( v4 == v6 )
          return result;
      }
      v9 = *(_QWORD *)(a1 + 280);
      v10 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
      ++v4;
      *(_BYTE *)(a1 + 255) = 0;
      v10(a1, 255, v9);
      v11 = *(_QWORD *)(a1 + 312);
      v5 = 1;
      *(_QWORD *)(a1 + 256) = 1;
      result = v11 + 1;
      *(_QWORD *)(a1 + 312) = result;
      *(_BYTE *)a1 = v7;
      *(_BYTE *)(a1 + 264) = v7;
    }
    while ( v4 != v6 );
  }
  return result;
}


// Address: 0x1C30C | Function: sub_1C30C
__int64 __fastcall sub_1C30C(__int64 a1, int a2)
{
  unsigned __int8 *v2; // x21
  int v3; // w4
  int v6; // w1
  int v7; // w0
  __int64 v8; // x4
  __int64 v9; // x1
  __int64 v10; // x3

  v2 = *(unsigned __int8 **)(a1 + 24);
  if ( *(_QWORD *)(a1 + 8) - (_QWORD)v2 < a2 )
    return 0;
  v3 = *(_DWORD *)(a1 + 16);
  *(_QWORD *)(a1 + 24) = &v2[a2];
  if ( (v3 & 4) != 0 && v2[a2] == 36 )
    *(_QWORD *)(a1 + 24) = &v2[a2 + 1];
  if ( a2 <= 9 || memcmp(v2, "_GLOBAL_", 8u) != 0 || (v6 = v2[8]) != 95 && v6 != 46 && v6 != 36 || v2[9] != 78 )
  {
    v7 = *(_DWORD *)(a1 + 40);
    if ( v7 < *(_DWORD *)(a1 + 44) )
    {
      v8 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v7 + 1;
      v9 = 24LL * v7;
      v10 = v8 + v9;
      if ( a2 != 0 && v2 != nullptr && v10 != 0 )
      {
        *(_DWORD *)(v8 + 24LL * v7) = 0;
        *(_QWORD *)(v10 + 8) = v2;
        *(_DWORD *)(v10 + 16) = a2;
        return v8 + v9;
      }
    }
    return 0;
  }
  *(_DWORD *)(a1 + 80) = *(_DWORD *)(a1 + 80) + 22 - a2;
  return sub_1B9B8(a1, (__int64)"(anonymous namespace)", 21);
}


// Address: 0x1C460 | Function: sub_1C460
size_t __fastcall sub_1C460(__int64 a1, __int64 a2)
{
  size_t result; // x0
  size_t v4; // x23
  __int64 v5; // x1
  __int64 v6; // x20
  char v7; // w21
  __int64 v8; // x2
  void (__fastcall *v9)(__int64, __int64, __int64); // x3
  __int64 v10; // x2
  char s[32]; // [xsp+40h] [xbp+40h] BYREF

  sprintf(s, "%ld", a2);
  result = strlen(s);
  v4 = result;
  if ( result != 0 )
  {
    v5 = *(_QWORD *)(a1 + 256);
    v6 = 0;
    do
    {
      while ( 1 )
      {
        v7 = s[v6];
        result = v5;
        if ( v5 == 255 )
          break;
        *(_QWORD *)(a1 + 256) = ++v5;
        ++v6;
        *(_BYTE *)(a1 + result) = v7;
        *(_BYTE *)(a1 + 264) = v7;
        if ( v6 == v4 )
          return result;
      }
      v8 = *(_QWORD *)(a1 + 280);
      v9 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
      ++v6;
      *(_BYTE *)(a1 + 255) = 0;
      v9(a1, 255, v8);
      v10 = *(_QWORD *)(a1 + 312);
      result = 0;
      v5 = 1;
      *(_QWORD *)(a1 + 256) = 1;
      *(_QWORD *)(a1 + 312) = v10 + 1;
      *(_BYTE *)a1 = v7;
      *(_BYTE *)(a1 + 264) = v7;
    }
    while ( v6 != v4 );
  }
  return result;
}


// Address: 0x1C52C | Function: sub_1C52C
__int64 __fastcall sub_1C52C(__int64 a1)
{
  int v1; // w5
  unsigned __int8 *v2; // x1
  int v3; // w3
  __int64 v4; // x1
  char *v5; // x4
  __int64 v6; // x1
  char v7; // t1
  __int64 result; // x0

  v1 = 0;
  v2 = *(unsigned __int8 **)(a1 + 24);
  v3 = *v2;
  if ( v3 == 110 )
  {
    *(_QWORD *)(a1 + 24) = v2 + 1;
    v1 = 1;
    LOBYTE(v3) = v2[1];
  }
  if ( (unsigned __int8)(v3 - 48) > 9u )
    return 0;
  v4 = 0;
  v5 = (char *)(*(_QWORD *)(a1 + 24) + 1LL);
  do
  {
    *(_QWORD *)(a1 + 24) = v5;
    v6 = 10 * v4 + (unsigned __int8)v3;
    v7 = *v5++;
    LOBYTE(v3) = v7;
    v4 = v6 - 48;
  }
  while ( (unsigned __int8)(v7 - 48) <= 9u );
  if ( v4 <= 0 || v1 != 0 )
    return 0;
  result = sub_1C30C(a1, v4);
  *(_QWORD *)(a1 + 72) = result;
  return result;
}


// Address: 0x1C5D4 | Function: sub_1C5D4
__int64 __fastcall sub_1C5D4(__int64 a1)
{
  unsigned __int8 *v1; // x2
  int v2; // w4
  unsigned __int8 *v3; // x5
  __int64 v4; // x1
  __int64 v5; // x1
  __int64 v6; // x1

  v1 = *(unsigned __int8 **)(a1 + 24);
  v2 = *v1;
  if ( v2 == 95 )
  {
    v6 = 0;
  }
  else
  {
    if ( v2 == 110 )
      return -1;
    if ( (unsigned __int8)(v2 - 48) > 9u )
      return -1;
    v3 = v1 + 1;
    v4 = 0;
    do
    {
      *(_QWORD *)(a1 + 24) = v3;
      v5 = 10 * v4 + (unsigned __int8)v2;
      v2 = *v3;
      v1 = v3;
      v4 = v5 - 48;
      ++v3;
    }
    while ( (unsigned __int8)(v2 - 48) <= 9u );
    v6 = v4 + 1;
    if ( v2 != 95 )
      return -1;
  }
  *(_QWORD *)(a1 + 24) = v1 + 1;
  return v6;
}


// Address: 0x1C660 | Function: sub_1C660
unsigned __int64 __fastcall sub_1C660(__int64 a1)
{
  _BYTE *v1; // x1
  _BYTE *v3; // x3
  int v4; // w4
  int v5; // w5
  char *v6; // x3
  __int64 v7; // x1
  __int64 v8; // x1
  char v9; // t1

  v1 = *(_BYTE **)(a1 + 24);
  if ( *v1 != 95 )
    return 1;
  v3 = v1 + 1;
  *(_QWORD *)(a1 + 24) = v1 + 1;
  v4 = (unsigned __int8)v1[1];
  if ( v4 == 110 )
  {
    v3 = v1 + 2;
    *(_QWORD *)(a1 + 24) = v1 + 2;
    LOBYTE(v4) = v1[2];
    if ( (unsigned __int8)(v4 - 48) <= 9u )
    {
      v5 = 1;
      goto LABEL_6;
    }
    return 1;
  }
  if ( (unsigned __int8)(v4 - 48) > 9u )
    return 1;
  v5 = 0;
LABEL_6:
  v6 = v3 + 1;
  v7 = 0;
  do
  {
    *(_QWORD *)(a1 + 24) = v6;
    v8 = 10 * v7 + (unsigned __int8)v4;
    v9 = *v6++;
    LOBYTE(v4) = v9;
    v7 = v8 - 48;
  }
  while ( (unsigned __int8)(v9 - 48) <= 9u );
  if ( v5 == 0 )
    return 1;
  return (unsigned __int64)(v7 - 1) >> 63;
}


// Address: 0x1C704 | Function: sub_1C704
__int64 __fastcall sub_1C704(__int64 a1)
{
  _BYTE *v1; // x5
  __int64 result; // x0
  _BYTE *v3; // x2
  int v4; // w4
  unsigned __int8 *v5; // x5
  __int64 v6; // x1
  __int64 v7; // x1
  __int64 v8; // x1
  int v9; // w3
  int v10; // w5
  int v11; // w4
  __int64 v12; // x4
  __int64 v13; // x2

  v1 = *(_BYTE **)(a1 + 24);
  if ( *v1 != 84 )
    return 0;
  v3 = v1 + 1;
  *(_QWORD *)(a1 + 24) = v1 + 1;
  v4 = (unsigned __int8)v1[1];
  if ( v4 == 95 )
  {
    v8 = 0;
  }
  else
  {
    if ( v4 == 110 )
      return 0;
    if ( (unsigned __int8)(v4 - 48) > 9u )
      return 0;
    v5 = v1 + 2;
    v6 = 0;
    do
    {
      *(_QWORD *)(a1 + 24) = v5;
      v7 = 10 * v6 + (unsigned __int8)v4;
      v4 = *v5;
      v3 = v5;
      v6 = v7 - 48;
      ++v5;
    }
    while ( (unsigned __int8)(v4 - 48) <= 9u );
    v8 = v6 + 1;
    if ( v4 != 95 )
      return 0;
  }
  v9 = *(_DWORD *)(a1 + 40);
  v10 = *(_DWORD *)(a1 + 44);
  v11 = *(_DWORD *)(a1 + 64) + 1;
  *(_QWORD *)(a1 + 24) = v3 + 1;
  *(_DWORD *)(a1 + 64) = v11;
  if ( v9 >= v10 )
    return 0;
  v12 = *(_QWORD *)(a1 + 32);
  v13 = 24LL * v9;
  *(_DWORD *)(a1 + 40) = v9 + 1;
  result = 0;
  if ( v12 + v13 != 0 )
  {
    *(_DWORD *)(v12 + 24LL * v9) = 5;
    *(_QWORD *)(v12 + v13 + 8) = v8;
    return v12 + v13;
  }
  return result;
}


// Address: 0x1C7F0 | Function: sub_1C7F0
__int64 __fastcall sub_1C7F0(__int64 a1, int a2)
{
  _BYTE *v3; // x0
  _BYTE *v5; // x0
  unsigned __int8 *v6; // x0
  int v7; // w2
  int v8; // w1

  if ( a2 == 0 )
  {
    v3 = *(_BYTE **)(a1 + 24);
    if ( *v3 == 0 )
      return 0;
    *(_QWORD *)(a1 + 24) = v3 + 1;
    a2 = (unsigned __int8)*v3;
  }
  if ( a2 != 104 )
  {
    if ( a2 != 118 )
      return 0;
    sub_1BFCC((unsigned __int8 **)(a1 + 24));
    v5 = *(_BYTE **)(a1 + 24);
    if ( *v5 != 95 )
      return 0;
    *(_QWORD *)(a1 + 24) = v5 + 1;
    sub_1BFCC((unsigned __int8 **)(a1 + 24));
    v6 = *(unsigned __int8 **)(a1 + 24);
    goto LABEL_9;
  }
  v6 = *(unsigned __int8 **)(a1 + 24);
  v8 = *v6;
  if ( v8 == 110 )
  {
    *(_QWORD *)(a1 + 24) = v6 + 1;
    LOBYTE(v8) = *++v6;
  }
  if ( (unsigned __int8)(v8 - 48) > 9u )
  {
LABEL_9:
    v7 = *v6;
    goto LABEL_10;
  }
  do
  {
    *(_QWORD *)(a1 + 24) = ++v6;
    v7 = *v6;
  }
  while ( (unsigned __int8)(v7 - 48) <= 9u );
LABEL_10:
  if ( v7 != 95 )
    return 0;
  *(_QWORD *)(a1 + 24) = v6 + 1;
  return 1;
}


// Address: 0x1C8DC | Function: sub_1C8DC
__int64 __fastcall sub_1C8DC(__int64 a1)
{
  _BYTE *v1; // x1
  __int64 v2; // x25
  unsigned __int8 *v3; // x28
  int v4; // w26
  __int64 *v6; // x19
  __int64 v7; // x2
  __int64 v8; // x0
  unsigned __int8 *v10; // x3
  int v11; // w21
  int v12; // w0
  int *v13; // x0
  __int64 v14; // x23
  int v15; // w0
  _BYTE *v16; // x0
  __int64 v17; // x3
  __int64 v18; // x0
  unsigned __int8 *v19; // x1
  const char *v20; // x26
  int v21; // w0
  __int64 v22; // x0
  __int64 v23; // x26
  int v24; // w2
  __int64 v25; // x1
  __int64 v26; // x0
  const char **v27; // x28
  const char *v28; // x0
  char *v29; // x0
  __int64 v30; // x28
  __int64 v31; // x3
  __int64 v32; // x0
  __int64 v33; // x2
  __int64 v34; // x0
  __int64 v35; // x0
  __int64 v36; // x23
  __int64 v37; // x3
  int v38; // w0
  int v39; // w0
  _BYTE *v40; // x0
  __int64 v41; // x0
  int v42; // w0
  __int64 v43; // x26
  int v44; // w0
  __int64 v45; // x3
  __int64 v46; // x0
  __int64 v47; // x0
  __int64 v48; // x0
  unsigned __int8 *v49; // x1
  int v50; // w0
  int *v51; // x0
  int v52; // w0
  _BYTE *v53; // x0
  __int64 v54; // x3
  __int64 v55; // x0
  int v56; // w1
  unsigned __int8 *v57; // x1
  int v58; // w0
  int *v59; // x0
  __int64 v60; // x28
  int v61; // w0
  _BYTE *v62; // x0
  __int64 v63; // x3
  char v64; // w0
  __int64 v65; // x0
  __int64 v66; // x0
  __int64 v67; // x28
  int v68; // w2
  __int64 v69; // x0
  int v70; // w0
  __int64 v71; // x0
  __int64 v72; // x0
  int v73; // w26
  int v74; // w0
  __int64 v75; // x2
  int v76; // w1
  __int64 v77; // x0
  __int64 v78; // x2
  __int64 v79; // x0
  __int64 v80; // x2
  __int64 v81; // x0
  const char *v82; // x2
  int v83; // w0
  const char *v84; // x2
  const char *v85; // x28
  const char *v86; // x0
  __int64 v87; // x3
  __int64 v88; // x2
  char *v89; // x0
  __int64 v90; // x3
  int v91; // w0
  _BYTE *v92; // x0
  __int64 v93; // x0
  int v94; // w0
  __int64 v95; // x28
  __int64 v96; // x0
  __int64 v97; // x0
  char *v98; // x0
  const char *v99; // x2
  __int64 v100; // x3
  __int64 v101; // x0
  int v102; // w0
  unsigned __int8 *v103; // x0
  int v104; // w1
  __int64 v105; // x0
  __int64 v106; // x0
  __int64 v107; // x0
  int v108; // w0
  _BYTE *v109; // x0
  __int64 v110; // x0
  __int64 v111; // x0
  __int64 v112; // x28
  __int64 v113; // x28
  __int64 v114; // x3
  int v115; // w0
  __int64 v116; // x0
  char v117; // w0
  __int64 v118; // x0
  unsigned __int8 *v119; // x1
  __int64 v120; // x0
  char v121; // w0
  __int64 v122; // x0
  char *v123; // [xsp+68h] [xbp+68h]
  char *v124; // [xsp+68h] [xbp+68h]
  char *v125; // [xsp+68h] [xbp+68h]
  char *v126; // [xsp+68h] [xbp+68h]
  char *v127; // [xsp+68h] [xbp+68h]
  char *v128; // [xsp+68h] [xbp+68h]
  char *v129; // [xsp+68h] [xbp+68h]
  char *v130; // [xsp+70h] [xbp+70h]
  char *v131; // [xsp+70h] [xbp+70h]
  char *v132; // [xsp+70h] [xbp+70h]
  char *v133; // [xsp+70h] [xbp+70h]
  char *v134; // [xsp+70h] [xbp+70h]
  char *v135; // [xsp+70h] [xbp+70h]
  char *v136; // [xsp+70h] [xbp+70h]
  char *v137; // [xsp+70h] [xbp+70h]
  char *v138; // [xsp+70h] [xbp+70h]
  char *v139; // [xsp+70h] [xbp+70h]
  char *v140; // [xsp+70h] [xbp+70h]
  __int64 v141; // [xsp+78h] [xbp+78h]
  __int64 v142; // [xsp+78h] [xbp+78h]
  __int64 v143; // [xsp+78h] [xbp+78h]
  __int64 v144; // [xsp+78h] [xbp+78h]
  __int64 v145; // [xsp+78h] [xbp+78h]
  __int64 v146; // [xsp+88h] [xbp+88h] BYREF

  v1 = *(_BYTE **)(a1 + 24);
  v2 = *(_QWORD *)(a1 + 72);
  if ( (unsigned __int8)(*v1 - 73) > 1u )
    return 0;
  v3 = v1 + 1;
  *(_QWORD *)(a1 + 24) = v1 + 1;
  v4 = (unsigned __int8)v1[1];
  if ( v4 != 69 )
  {
    v146 = 0;
    v6 = &v146;
    while ( 1 )
    {
      switch ( v4 )
      {
        case 'I':
        case 'J':
          v7 = sub_1C8DC(a1);
          goto LABEL_6;
        case 'L':
          v7 = sub_210BC(a1);
          goto LABEL_6;
        case 'X':
          v10 = v3 + 1;
          v11 = *(_DWORD *)(a1 + 84);
          *(_QWORD *)(a1 + 24) = v3 + 1;
          *(_DWORD *)(a1 + 84) = 1;
          v12 = v3[1];
          switch ( v12 )
          {
            case 'L':
              v7 = sub_210BC(a1);
              v19 = *(unsigned __int8 **)(a1 + 24);
              goto LABEL_32;
            case 'T':
              v7 = sub_1C704(a1);
              v19 = *(unsigned __int8 **)(a1 + 24);
              goto LABEL_32;
            case 's':
              v21 = v3[2];
              if ( v21 == 114 )
              {
                *(_QWORD *)(a1 + 24) = v3 + 3;
                v36 = sub_1E51C(a1);
                v37 = sub_1FEC8(a1);
                if ( **(_BYTE **)(a1 + 24) == 73 )
                {
                  v144 = v37;
                  v48 = sub_1C8DC(a1);
                  v37 = sub_1B918(a1, 4, v144, v48);
                }
                v7 = sub_1B918(a1, 1, v36, v37);
                v19 = *(unsigned __int8 **)(a1 + 24);
                goto LABEL_32;
              }
              if ( v21 == 112 )
              {
                *(_QWORD *)(a1 + 24) = v3 + 3;
                v22 = sub_21234(a1);
                v7 = sub_1B918(a1, 74, v22, 0);
                v19 = *(unsigned __int8 **)(a1 + 24);
                goto LABEL_32;
              }
              break;
            case 'f':
              if ( v3[2] == 112 )
              {
                *(_QWORD *)(a1 + 24) = v3 + 3;
                if ( v3[3] == 84 )
                {
                  v23 = 0;
                  *(_QWORD *)(a1 + 24) = v3 + 4;
                }
                else
                {
                  v38 = sub_1C5D4(a1) + 1;
                  v23 = v38;
                  if ( v38 == 0 )
                  {
                    v19 = *(unsigned __int8 **)(a1 + 24);
                    goto LABEL_39;
                  }
                }
                v24 = *(_DWORD *)(a1 + 40);
                if ( v24 >= *(_DWORD *)(a1 + 44) )
                  goto LABEL_38;
                v25 = *(_QWORD *)(a1 + 32);
                v26 = 24LL * v24;
                *(_DWORD *)(a1 + 40) = v24 + 1;
                v7 = v25 + v26;
                if ( v25 + v26 == 0 )
                  goto LABEL_38;
                *(_DWORD *)(v25 + v26) = 6;
                *(_QWORD *)(v7 + 8) = v23;
                v19 = *(unsigned __int8 **)(a1 + 24);
                goto LABEL_32;
              }
              break;
            default:
              if ( (unsigned __int8)(v12 - 48) <= 9u )
                goto LABEL_29;
              if ( v12 == 111 )
              {
                if ( v3[2] == 110 )
                {
                  *(_QWORD *)(a1 + 24) = v3 + 3;
LABEL_29:
                  v18 = sub_1FEC8(a1);
                  v19 = *(unsigned __int8 **)(a1 + 24);
                  if ( v18 == 0 )
                    goto LABEL_39;
                  v7 = v18;
                  if ( *v19 == 73 )
                  {
                    v142 = v18;
                    v35 = sub_1C8DC(a1);
                    v7 = sub_1B918(a1, 4, v142, v35);
                    v19 = *(unsigned __int8 **)(a1 + 24);
                  }
                  goto LABEL_32;
                }
              }
              else if ( (v12 == 116 || v12 == 105) && v3[2] == 108 )
              {
                v33 = 0;
                if ( v12 == 116 )
                {
                  v33 = sub_1E51C(a1);
                  v10 = *(unsigned __int8 **)(a1 + 24);
                }
                *(_QWORD *)(a1 + 24) = v10 + 2;
                v141 = v33;
                v34 = sub_1DDC8(a1, 69);
                v7 = sub_1B918(a1, 48, v141, v34);
                v19 = *(unsigned __int8 **)(a1 + 24);
                goto LABEL_32;
              }
              break;
          }
          v13 = (int *)sub_1FCD4(a1);
          v14 = (__int64)v13;
          if ( v13 == nullptr )
            goto LABEL_38;
          v15 = *v13;
          if ( v15 != 49 )
          {
            if ( v15 == 50 )
            {
              switch ( *(_DWORD *)(v14 + 8) )
              {
                case 0:
                  goto LABEL_62;
                case 1:
                  goto LABEL_69;
                case 2:
                  v20 = nullptr;
                  goto LABEL_54;
                case 3:
                  v20 = nullptr;
                  goto LABEL_36;
                default:
                  goto LABEL_38;
              }
            }
            if ( v15 != 51 )
            {
LABEL_38:
              v19 = *(unsigned __int8 **)(a1 + 24);
LABEL_39:
              v7 = 0;
              goto LABEL_32;
            }
            v16 = *(_BYTE **)(a1 + 24);
            if ( *v16 == 95 )
            {
              *(_QWORD *)(a1 + 24) = v16 + 1;
              v17 = sub_1DDC8(a1, 69);
            }
            else
            {
LABEL_69:
              v17 = sub_21234(a1);
            }
            goto LABEL_70;
          }
          v27 = *(const char ***)(v14 + 8);
          v20 = *v27;
          v28 = *v27;
          *(_DWORD *)(a1 + 80) += *((_DWORD *)v27 + 4) - 2;
          if ( strcmp(v28, "st") == 0 )
          {
            v17 = sub_1E51C(a1);
LABEL_70:
            v7 = sub_1B918(a1, 54, v14, v17);
            v19 = *(unsigned __int8 **)(a1 + 24);
            goto LABEL_32;
          }
          break;
        default:
          v7 = sub_1E51C(a1);
          goto LABEL_6;
      }
      switch ( *((_DWORD *)v27 + 5) )
      {
        case 0:
LABEL_62:
          v7 = sub_1B918(a1, 53, v14, 0);
          v19 = *(unsigned __int8 **)(a1 + 24);
          goto LABEL_32;
        case 1:
          v39 = *(unsigned __int8 *)v20;
          if ( v39 != 109 && v39 != 112 || *((unsigned __int8 *)v20 + 1) != v39 )
            goto LABEL_69;
          v40 = *(_BYTE **)(a1 + 24);
          if ( *v40 == 95 )
          {
            *(_QWORD *)(a1 + 24) = v40 + 1;
            goto LABEL_69;
          }
          v41 = sub_21234(a1);
          v17 = sub_1B918(a1, 56, v41, v41);
          goto LABEL_70;
        case 2:
LABEL_54:
          v29 = **(char ***)(v14 + 8);
          if ( v29[1] == 99 && ((unsigned __int8)((v64 = *v29) - 114) <= 1u || (unsigned __int8)(v64 - 99) <= 1u) )
            v30 = sub_1E51C(a1);
          else
            v30 = sub_21234(a1);
          if ( strcmp(v20, "cl") == 0 )
          {
            v31 = sub_1DDC8(a1, 69);
          }
          else if ( strcmp(v20, "dt") == 0 || strcmp(v20, "pt") == 0 )
          {
            v31 = sub_1FEC8(a1);
            if ( **(_BYTE **)(a1 + 24) == 73 )
            {
              v145 = v31;
              v65 = sub_1C8DC(a1);
              v31 = sub_1B918(a1, 4, v145, v65);
            }
          }
          else
          {
            v31 = sub_21234(a1);
          }
          v32 = sub_1B918(a1, 56, v30, v31);
          v7 = sub_1B918(a1, 55, v14, v32);
          v19 = *(unsigned __int8 **)(a1 + 24);
          goto LABEL_32;
        case 3:
LABEL_36:
          if ( strcmp(v20, "qu") == 0 )
          {
            v143 = sub_21234(a1);
            v49 = *(unsigned __int8 **)(a1 + 24);
            v50 = *v49;
            switch ( v50 )
            {
              case 'L':
                v43 = sub_210BC(a1);
                v57 = *(unsigned __int8 **)(a1 + 24);
                v58 = *v57;
                goto LABEL_108;
              case 'T':
                v43 = sub_1C704(a1);
                v57 = *(unsigned __int8 **)(a1 + 24);
                v58 = *v57;
                goto LABEL_108;
              case 's':
                v74 = v49[1];
                if ( v74 == 114 )
                {
                  *(_QWORD *)(a1 + 24) = v49 + 2;
                  v43 = sub_1E51C(a1);
                  v112 = sub_1FEC8(a1);
                  if ( **(_BYTE **)(a1 + 24) == 73 )
                  {
                    v116 = sub_1C8DC(a1);
                    v54 = sub_1B918(a1, 4, v112, v116);
                    v56 = 1;
                    v55 = a1;
                    goto LABEL_107;
                  }
                  v43 = sub_1B918(a1, 1, v43, v112);
                  v57 = *(unsigned __int8 **)(a1 + 24);
                  v58 = *v57;
                  goto LABEL_108;
                }
                if ( v74 != 112 )
                  goto LABEL_100;
                *(_QWORD *)(a1 + 24) = v49 + 2;
                v75 = sub_21234(a1);
                v76 = 74;
                v77 = a1;
LABEL_158:
                v43 = sub_1B918(v77, v76, v75, 0);
                goto LABEL_159;
              default:
                break;
            }
            if ( v50 != 102 )
            {
              if ( (unsigned __int8)(v50 - 48) > 9u )
              {
                if ( v50 != 111 )
                {
                  if ( (v50 == 116 || v50 == 105) && v49[1] == 108 )
                  {
                    v78 = 0;
                    if ( v50 == 116 )
                    {
                      v78 = sub_1E51C(a1);
                      v49 = *(unsigned __int8 **)(a1 + 24);
                    }
                    *(_QWORD *)(a1 + 24) = v49 + 2;
                    v131 = (char *)v78;
                    v79 = sub_1DDC8(a1, 69);
                    v43 = sub_1B918(a1, 48, (__int64)v131, v79);
                    v57 = *(unsigned __int8 **)(a1 + 24);
                    v58 = *v57;
                    goto LABEL_108;
                  }
LABEL_100:
                  v51 = (int *)sub_1FCD4(a1);
                  v43 = (__int64)v51;
                  if ( v51 != nullptr )
                  {
                    v52 = *v51;
                    if ( v52 != 49 )
                    {
                      if ( v52 == 50 )
                      {
                        switch ( *(_DWORD *)(v43 + 8) )
                        {
                          case 0:
                            goto LABEL_241;
                          case 1:
                            goto LABEL_105;
                          case 2:
                            v85 = nullptr;
                            goto LABEL_185;
                          case 3:
                            v85 = nullptr;
                            goto LABEL_199;
                          default:
                            goto LABEL_161;
                        }
                      }
                      if ( v52 == 51 )
                      {
                        v53 = *(_BYTE **)(a1 + 24);
                        if ( *v53 == 95 )
                        {
                          *(_QWORD *)(a1 + 24) = v53 + 1;
                          v54 = sub_1DDC8(a1, 69);
                        }
                        else
                        {
LABEL_105:
                          v54 = sub_21234(a1);
                        }
                        v55 = a1;
                        v56 = 54;
LABEL_107:
                        v43 = sub_1B918(v55, v56, v43, v54);
                        v57 = *(unsigned __int8 **)(a1 + 24);
                        v58 = *v57;
LABEL_108:
                        if ( v58 == 76 )
                        {
                          v45 = sub_210BC(a1);
                          goto LABEL_88;
                        }
                        if ( v58 == 84 )
                        {
                          v45 = sub_1C704(a1);
                          goto LABEL_88;
                        }
                        if ( v58 != 115 )
                        {
                          if ( v58 != 102 )
                          {
                            if ( (unsigned __int8)(v58 - 48) > 9u )
                            {
                              if ( v58 != 111 )
                              {
LABEL_114:
                                if ( (v58 == 116 || v58 == 105) && v57[1] == 108 )
                                {
                                  v80 = 0;
                                  if ( v58 == 116 )
                                    v80 = sub_1E51C(a1);
                                  v132 = (char *)v80;
                                  *(_QWORD *)(a1 + 24) += 2LL;
                                  v81 = sub_1DDC8(a1, 69);
                                  v45 = sub_1B918(a1, 48, (__int64)v132, v81);
                                  goto LABEL_88;
                                }
                                goto LABEL_117;
                              }
                              if ( v57[1] != 110 )
                                goto LABEL_117;
                              *(_QWORD *)(a1 + 24) = v57 + 2;
                            }
                            v45 = sub_1FEC8(a1);
                            if ( v45 != 0 && **(_BYTE **)(a1 + 24) == 73 )
                            {
                              v130 = (char *)v45;
                              v66 = sub_1C8DC(a1);
                              v45 = sub_1B918(a1, 4, (__int64)v130, v66);
                            }
                            goto LABEL_88;
                          }
                          if ( v57[1] != 112 )
                            goto LABEL_117;
                          *(_QWORD *)(a1 + 24) = v57 + 2;
                          if ( v57[2] == 84 )
                          {
                            v67 = 0;
                            *(_QWORD *)(a1 + 24) = v57 + 3;
LABEL_144:
                            v68 = *(_DWORD *)(a1 + 40);
                            v45 = 0;
                            if ( v68 < *(_DWORD *)(a1 + 44) )
                            {
                              v69 = *(_QWORD *)(a1 + 32);
                              *(_DWORD *)(a1 + 40) = v68 + 1;
                              v45 = v69 + 24LL * v68;
                              if ( v45 != 0 )
                              {
                                *(_DWORD *)(v69 + 24LL * v68) = 6;
                                *(_QWORD *)(v45 + 8) = v67;
                              }
                            }
                            goto LABEL_88;
                          }
                          v115 = sub_1C5D4(a1) + 1;
                          if ( v115 != 0 )
                          {
                            v67 = v115;
                            goto LABEL_144;
                          }
LABEL_174:
                          v45 = 0;
                          goto LABEL_88;
                        }
                        v70 = v57[1];
                        if ( v70 == 114 )
                        {
                          *(_QWORD *)(a1 + 24) = v57 + 2;
                          v113 = sub_1E51C(a1);
                          v114 = sub_1FEC8(a1);
                          if ( **(_BYTE **)(a1 + 24) == 73 )
                          {
                            v140 = (char *)v114;
                            v120 = sub_1C8DC(a1);
                            v114 = sub_1B918(a1, 4, (__int64)v140, v120);
                          }
                          v45 = sub_1B918(a1, 1, v113, v114);
                          goto LABEL_88;
                        }
                        if ( v70 == 112 )
                        {
                          *(_QWORD *)(a1 + 24) = v57 + 2;
                          v71 = sub_21234(a1);
                          v45 = sub_1B918(a1, 74, v71, 0);
                          goto LABEL_88;
                        }
LABEL_117:
                        v59 = (int *)sub_1FCD4(a1);
                        v60 = (__int64)v59;
                        if ( v59 == nullptr )
                          goto LABEL_174;
                        v61 = *v59;
                        switch ( v61 )
                        {
                          case '1':
                            v123 = *(char **)(v60 + 8);
                            v133 = *(char **)v123;
                            v82 = *(const char **)v123;
                            *(_DWORD *)(a1 + 80) += *((_DWORD *)v123 + 4) - 2;
                            v83 = strcmp(v82, "st");
                            v84 = v133;
                            if ( v83 != 0 )
                            {
                              v45 = 0;
                              switch ( *((_DWORD *)v123 + 5) )
                              {
                                case 0:
LABEL_237:
                                  v45 = sub_1B918(a1, 53, v60, 0);
                                  goto LABEL_88;
                                case 1:
                                  v108 = (unsigned __int8)*v133;
                                  if ( v108 != 109 && v108 != 112 || (unsigned __int8)v133[1] != v108 )
                                    goto LABEL_122;
                                  v109 = *(_BYTE **)(a1 + 24);
                                  if ( *v109 != 95 )
                                  {
                                    v110 = sub_21234(a1);
                                    v111 = sub_1B918(a1, 56, v110, v110);
                                    goto LABEL_234;
                                  }
                                  *(_QWORD *)(a1 + 24) = v109 + 1;
                                  goto LABEL_122;
                                case 2:
LABEL_210:
                                  v98 = **(char ***)(v60 + 8);
                                  if ( v98[1] == 99
                                    && ((unsigned __int8)((v117 = *v98) - 114) <= 1u
                                     || (unsigned __int8)(v117 - 99) <= 1u) )
                                  {
                                    v127 = (char *)v84;
                                    v137 = (char *)sub_1E51C(a1);
                                    v99 = v127;
                                  }
                                  else
                                  {
                                    v124 = (char *)v84;
                                    v137 = (char *)sub_21234(a1);
                                    v99 = v124;
                                  }
                                  v125 = (char *)v99;
                                  if ( strcmp(v99, "cl") == 0 )
                                  {
                                    v100 = sub_1DDC8(a1, 69);
                                  }
                                  else if ( strcmp(v125, "dt") == 0 || strcmp(v125, "pt") == 0 )
                                  {
                                    v100 = sub_1FEC8(a1);
                                    if ( **(_BYTE **)(a1 + 24) == 73 )
                                    {
                                      v128 = (char *)v100;
                                      v118 = sub_1C8DC(a1);
                                      v100 = sub_1B918(a1, 4, (__int64)v128, v118);
                                    }
                                  }
                                  else
                                  {
                                    v100 = sub_21234(a1);
                                  }
                                  v101 = sub_1B918(a1, 56, (__int64)v137, v100);
                                  v45 = sub_1B918(a1, 55, v60, v101);
                                  goto LABEL_88;
                                case 3:
LABEL_219:
                                  v138 = (char *)v84;
                                  if ( strcmp(v84, "qu") == 0 )
                                  {
                                    v139 = (char *)sub_21234(a1);
                                    v126 = (char *)sub_21234(a1);
                                    v105 = sub_21234(a1);
                                    goto LABEL_228;
                                  }
                                  if ( *v138 != 110 )
                                    goto LABEL_174;
                                  v102 = (unsigned __int8)v138[1];
                                  if ( v102 != 97 && v102 != 119 )
                                    goto LABEL_174;
                                  v139 = (char *)sub_1DDC8(a1, 95);
                                  v126 = (char *)sub_1E51C(a1);
                                  v103 = *(unsigned __int8 **)(a1 + 24);
                                  v104 = *v103;
                                  switch ( v104 )
                                  {
                                    case 'E':
                                      v119 = v103 + 1;
                                      v105 = 0;
                                      *(_QWORD *)(a1 + 24) = v119;
                                      goto LABEL_228;
                                    case 'p':
                                      v45 = 0;
                                      if ( v103[1] == 105 )
                                      {
                                        *(_QWORD *)(a1 + 24) = v103 + 2;
                                        v105 = sub_1DDC8(a1, 69);
                                        goto LABEL_228;
                                      }
                                      break;
                                    case 'i':
                                      v45 = 0;
                                      if ( v103[1] == 108 )
                                      {
                                        v105 = sub_21234(a1);
LABEL_228:
                                        v106 = sub_1B918(a1, 59, (__int64)v126, v105);
                                        v107 = sub_1B918(a1, 58, (__int64)v139, v106);
                                        v45 = sub_1B918(a1, 57, v60, v107);
                                        goto LABEL_88;
                                      }
                                      break;
                                    default:
                                      goto LABEL_174;
                                  }
                                  break;
                                default:
                                  goto LABEL_88;
                              }
                              goto LABEL_88;
                            }
                            v111 = sub_1E51C(a1);
                            break;
                          case '2':
                            v45 = 0;
                            switch ( *(_DWORD *)(v60 + 8) )
                            {
                              case 0:
                                goto LABEL_237;
                              case 1:
                                goto LABEL_122;
                              case 2:
                                v84 = nullptr;
                                goto LABEL_210;
                              case 3:
                                v84 = nullptr;
                                goto LABEL_219;
                              default:
                                goto LABEL_88;
                            }
                          case '3':
                            v62 = *(_BYTE **)(a1 + 24);
                            if ( *v62 != 95 )
                            {
LABEL_122:
                              v63 = sub_21234(a1);
                              goto LABEL_123;
                            }
                            *(_QWORD *)(a1 + 24) = v62 + 1;
                            v111 = sub_1DDC8(a1, 69);
                            break;
                          default:
                            goto LABEL_174;
                        }
LABEL_234:
                        v63 = v111;
LABEL_123:
                        v45 = sub_1B918(a1, 54, v60, v63);
LABEL_88:
                        v46 = sub_1B918(a1, 59, v43, v45);
                        v47 = sub_1B918(a1, 58, v143, v46);
                        v7 = sub_1B918(a1, 57, v14, v47);
                        v19 = *(unsigned __int8 **)(a1 + 24);
                        goto LABEL_32;
                      }
LABEL_161:
                      v57 = *(unsigned __int8 **)(a1 + 24);
LABEL_162:
                      v43 = 0;
                      v58 = *v57;
                      goto LABEL_108;
                    }
                    v134 = *(char **)(v43 + 8);
                    v85 = *(const char **)v134;
                    v86 = *(const char **)v134;
                    *(_DWORD *)(a1 + 80) += *((_DWORD *)v134 + 4) - 2;
                    if ( strcmp(v86, "st") == 0 )
                    {
                      v54 = sub_1E51C(a1);
                      v56 = 54;
                      v55 = a1;
                      goto LABEL_107;
                    }
                    switch ( *((_DWORD *)v134 + 5) )
                    {
                      case 0:
LABEL_241:
                        v77 = a1;
                        v76 = 53;
                        v75 = v43;
                        goto LABEL_158;
                      case 1:
                        v91 = *(unsigned __int8 *)v85;
                        if ( v91 != 109 && v91 != 112 || *((unsigned __int8 *)v85 + 1) != v91 )
                          goto LABEL_105;
                        v92 = *(_BYTE **)(a1 + 24);
                        if ( *v92 != 95 )
                        {
                          v93 = sub_21234(a1);
                          v54 = sub_1B918(a1, 56, v93, v93);
                          v56 = 54;
                          v55 = a1;
                          goto LABEL_107;
                        }
                        *(_QWORD *)(a1 + 24) = v92 + 1;
                        goto LABEL_105;
                      case 2:
LABEL_185:
                        v89 = **(char ***)(v43 + 8);
                        if ( v89[1] == 99
                          && ((unsigned __int8)((v121 = *v89) - 114) <= 1u || (unsigned __int8)(v121 - 99) <= 1u) )
                        {
                          v135 = (char *)sub_1E51C(a1);
                        }
                        else
                        {
                          v135 = (char *)sub_21234(a1);
                        }
                        if ( strcmp(v85, "cl") == 0 )
                        {
                          v90 = sub_1DDC8(a1, 69);
                        }
                        else if ( strcmp(v85, "dt") == 0 || strcmp(v85, "pt") == 0 )
                        {
                          v90 = sub_1FEC8(a1);
                          if ( **(_BYTE **)(a1 + 24) == 73 )
                          {
                            v129 = (char *)v90;
                            v122 = sub_1C8DC(a1);
                            v90 = sub_1B918(a1, 4, (__int64)v129, v122);
                          }
                        }
                        else
                        {
                          v90 = sub_21234(a1);
                        }
                        v54 = sub_1B918(a1, 56, (__int64)v135, v90);
                        v56 = 55;
                        v55 = a1;
                        goto LABEL_107;
                      case 3:
LABEL_199:
                        if ( strcmp(v85, "qu") != 0 )
                        {
                          if ( *v85 != 110 )
                            goto LABEL_161;
                          v94 = *((unsigned __int8 *)v85 + 1);
                          if ( v94 != 97 && v94 != 119 )
                            goto LABEL_161;
                          v136 = (char *)sub_1DDC8(a1, 95);
                          v95 = sub_1E51C(a1);
                          v57 = *(unsigned __int8 **)(a1 + 24);
                          v58 = *v57;
                          switch ( v58 )
                          {
                            case 'E':
                              v96 = 0;
                              *(_QWORD *)(a1 + 24) = v57 + 1;
                              goto LABEL_208;
                            case 'p':
                              if ( v57[1] == 105 )
                              {
                                *(_QWORD *)(a1 + 24) = v57 + 2;
                                v96 = sub_1DDC8(a1, 69);
                                goto LABEL_208;
                              }
                              break;
                            case 'i':
                              if ( v57[1] == 108 )
                              {
                                v96 = sub_21234(a1);
LABEL_208:
                                v97 = sub_1B918(a1, 59, v95, v96);
                                v54 = sub_1B918(a1, 58, (__int64)v136, v97);
                                v56 = 57;
                                v55 = a1;
                                goto LABEL_107;
                              }
                              break;
                            default:
                              v43 = 0;
                              goto LABEL_108;
                          }
                          v43 = 0;
                          goto LABEL_114;
                        }
                        v136 = (char *)sub_21234(a1);
                        v95 = sub_21234(a1);
                        v96 = sub_21234(a1);
                        goto LABEL_208;
                      default:
                        goto LABEL_161;
                    }
                  }
LABEL_159:
                  v57 = *(unsigned __int8 **)(a1 + 24);
LABEL_160:
                  v58 = *v57;
                  goto LABEL_108;
                }
                if ( v49[1] != 110 )
                  goto LABEL_100;
                *(_QWORD *)(a1 + 24) = v49 + 2;
              }
              v43 = sub_1FEC8(a1);
              v57 = *(unsigned __int8 **)(a1 + 24);
              v58 = *v57;
              if ( v43 != 0 && v58 == 73 )
              {
                v54 = sub_1C8DC(a1);
                v56 = 4;
                v55 = a1;
                goto LABEL_107;
              }
              goto LABEL_108;
            }
            if ( v49[1] != 112 )
              goto LABEL_100;
            *(_QWORD *)(a1 + 24) = v49 + 2;
            if ( v49[2] == 84 )
            {
              v57 = v49 + 3;
              v72 = 0;
              *(_QWORD *)(a1 + 24) = v57;
            }
            else
            {
              LODWORD(v72) = sub_1C5D4(a1) + 1;
              v57 = *(unsigned __int8 **)(a1 + 24);
              if ( (_DWORD)v72 == 0 )
                goto LABEL_162;
              v72 = (int)v72;
            }
            v73 = *(_DWORD *)(a1 + 40);
            if ( v73 >= *(_DWORD *)(a1 + 44) )
            {
              v58 = *v57;
              v43 = 0;
              goto LABEL_108;
            }
            v87 = *(_QWORD *)(a1 + 32);
            v88 = 24LL * v73;
            *(_DWORD *)(a1 + 40) = v73 + 1;
            v43 = v87 + v88;
            if ( v87 + v88 != 0 )
            {
              *(_DWORD *)(v87 + v88) = 6;
              *(_QWORD *)(v43 + 8) = v72;
              v58 = *v57;
              goto LABEL_108;
            }
            goto LABEL_160;
          }
          if ( *v20 != 110 )
            goto LABEL_38;
          v42 = *((unsigned __int8 *)v20 + 1);
          if ( v42 != 97 && v42 != 119 )
            goto LABEL_38;
          v143 = sub_1DDC8(a1, 95);
          v43 = sub_1E51C(a1);
          v19 = *(unsigned __int8 **)(a1 + 24);
          v44 = *v19;
          if ( v44 == 69 )
          {
            v45 = 0;
            *(_QWORD *)(a1 + 24) = v19 + 1;
            goto LABEL_88;
          }
          if ( v44 == 112 )
          {
            v7 = 0;
            if ( v19[1] == 105 )
            {
              *(_QWORD *)(a1 + 24) = v19 + 2;
              v45 = sub_1DDC8(a1, 69);
              goto LABEL_88;
            }
          }
          else
          {
            v7 = 0;
            if ( v44 == 105 && v19[1] == 108 )
            {
              v45 = sub_21234(a1);
              goto LABEL_88;
            }
          }
LABEL_32:
          *(_DWORD *)(a1 + 84) = v11;
          if ( *v19 != 69 )
            return 0;
          *(_QWORD *)(a1 + 24) = v19 + 1;
LABEL_6:
          if ( v7 == 0 )
            return 0;
          v8 = sub_1B918(a1, 47, v7, 0);
          *v6 = v8;
          if ( v8 == 0 )
            return 0;
          v3 = *(unsigned __int8 **)(a1 + 24);
          v6 = (__int64 *)(v8 + 16);
          v4 = *v3;
          if ( v4 == 69 )
          {
            *(_QWORD *)(a1 + 72) = v2;
            *(_QWORD *)(a1 + 24) = v3 + 1;
            return v146;
          }
          break;
        default:
          goto LABEL_38;
      }
    }
  }
  *(_QWORD *)(a1 + 24) = v1 + 2;
  return sub_1B918(a1, 47, 0, 0);
}


// Address: 0x1DDC8 | Function: sub_1DDC8
__int64 __fastcall sub_1DDC8(__int64 a1, unsigned __int8 a2)
{
  int v2; // w22
  unsigned __int8 *v3; // x1
  int v5; // w2
  __int64 *v6; // x20
  int v7; // w21
  int v8; // w0
  int *v9; // x0
  __int64 v10; // x26
  int v11; // w0
  _BYTE *v12; // x0
  __int64 v13; // x3
  __int64 v14; // x2
  __int64 v15; // x0
  __int64 v16; // x0
  __int64 v18; // x0
  int v19; // w0
  __int64 v20; // x0
  __int64 v21; // x0
  int v22; // w2
  __int64 v23; // x3
  __int64 v24; // x1
  const char **v25; // x28
  const char *v26; // x27
  const char *v27; // x0
  __int64 v28; // x2
  __int64 v29; // x0
  int v30; // w0
  __int64 v31; // x27
  __int64 v32; // x2
  unsigned __int8 *v33; // x0
  int v34; // w1
  __int64 v35; // x3
  __int64 v36; // x0
  __int64 v37; // x0
  char *v38; // x0
  __int64 v39; // x28
  __int64 v40; // x3
  __int64 v41; // x0
  __int64 v42; // x0
  __int64 v43; // x27
  __int64 v44; // x3
  int v45; // w0
  _BYTE *v46; // x0
  __int64 v47; // x0
  char v48; // w0
  __int64 v49; // x0
  __int64 v50; // [xsp+68h] [xbp+68h]
  __int64 v51; // [xsp+68h] [xbp+68h]
  __int64 v52; // [xsp+68h] [xbp+68h]
  __int64 v53; // [xsp+68h] [xbp+68h]
  __int64 v54; // [xsp+68h] [xbp+68h]
  __int64 v55; // [xsp+68h] [xbp+68h]
  __int64 v56; // [xsp+68h] [xbp+68h]
  __int64 v57; // [xsp+78h] [xbp+78h] BYREF

  v2 = a2;
  v3 = *(unsigned __int8 **)(a1 + 24);
  v5 = *v3;
  v57 = 0;
  v6 = &v57;
  if ( v5 == v2 )
  {
    *(_QWORD *)(a1 + 24) = v3 + 1;
    return sub_1B918(a1, 46, 0, 0);
  }
  while ( 1 )
  {
    v7 = *(_DWORD *)(a1 + 84);
    *(_DWORD *)(a1 + 84) = 1;
    v8 = *v3;
    switch ( v8 )
    {
      case 'L':
        v14 = sub_210BC(a1);
        goto LABEL_26;
      case 'T':
        v14 = sub_1C704(a1);
        goto LABEL_26;
      case 's':
        v19 = v3[1];
        if ( v19 == 114 )
        {
          *(_QWORD *)(a1 + 24) = v3 + 2;
          v43 = sub_1E51C(a1);
          v44 = sub_1FEC8(a1);
          if ( **(_BYTE **)(a1 + 24) == 73 )
          {
            v55 = v44;
            v49 = sub_1C8DC(a1);
            v44 = sub_1B918(a1, 4, v55, v49);
          }
          v14 = sub_1B918(a1, 1, v43, v44);
          goto LABEL_26;
        }
        if ( v19 == 112 )
        {
          *(_QWORD *)(a1 + 24) = v3 + 2;
          v20 = sub_21234(a1);
          v14 = sub_1B918(a1, 74, v20, 0);
          goto LABEL_26;
        }
LABEL_10:
        v9 = (int *)sub_1FCD4(a1);
        v10 = (__int64)v9;
        if ( v9 == nullptr )
          goto LABEL_40;
        v11 = *v9;
        switch ( v11 )
        {
          case '1':
            v25 = *(const char ***)(v10 + 8);
            v26 = *v25;
            v27 = *v25;
            *(_DWORD *)(a1 + 80) += *((_DWORD *)v25 + 4) - 2;
            if ( strcmp(v27, "st") != 0 )
            {
              switch ( *((_DWORD *)v25 + 5) )
              {
                case 0:
LABEL_49:
                  v14 = sub_1B918(a1, 53, v10, 0);
                  goto LABEL_26;
                case 1:
                  v45 = *(unsigned __int8 *)v26;
                  if ( v45 != 109 && v45 != 112 || *((unsigned __int8 *)v26 + 1) != v45 )
                    goto LABEL_15;
                  v46 = *(_BYTE **)(a1 + 24);
                  if ( *v46 != 95 )
                  {
                    v47 = sub_21234(a1);
                    v13 = sub_1B918(a1, 56, v47, v47);
                    goto LABEL_16;
                  }
                  *(_QWORD *)(a1 + 24) = v46 + 1;
                  goto LABEL_15;
                case 2:
LABEL_62:
                  v38 = **(char ***)(v10 + 8);
                  if ( v38[1] == 99
                    && ((unsigned __int8)((v48 = *v38) - 114) <= 1u || (unsigned __int8)(v48 - 99) <= 1u) )
                  {
                    v39 = sub_1E51C(a1);
                  }
                  else
                  {
                    v39 = sub_21234(a1);
                  }
                  if ( strcmp(v26, "cl") == 0 )
                  {
                    v40 = sub_1DDC8(a1, 69);
                  }
                  else if ( strcmp(v26, "dt") == 0 || strcmp(v26, "pt") == 0 )
                  {
                    v40 = sub_1FEC8(a1);
                    if ( **(_BYTE **)(a1 + 24) == 73 )
                    {
                      v53 = v40;
                      v42 = sub_1C8DC(a1);
                      v40 = sub_1B918(a1, 4, v53, v42);
                    }
                  }
                  else
                  {
                    v40 = sub_21234(a1);
                  }
                  v41 = sub_1B918(a1, 56, v39, v40);
                  v14 = sub_1B918(a1, 55, v10, v41);
                  goto LABEL_26;
                case 3:
LABEL_51:
                  if ( strcmp(v26, "qu") == 0 )
                  {
                    v31 = sub_21234(a1);
                    v54 = sub_21234(a1);
                    v35 = sub_21234(a1);
                    v32 = v54;
                  }
                  else
                  {
                    if ( *v26 != 110 )
                      goto LABEL_40;
                    v30 = *((unsigned __int8 *)v26 + 1);
                    if ( v30 != 97 && v30 != 119 )
                      goto LABEL_40;
                    v31 = sub_1DDC8(a1, 95);
                    v32 = sub_1E51C(a1);
                    v33 = *(unsigned __int8 **)(a1 + 24);
                    v34 = *v33;
                    if ( v34 == 69 )
                    {
                      v35 = 0;
                      *(_QWORD *)(a1 + 24) = v33 + 1;
                    }
                    else if ( v34 == 112 )
                    {
                      if ( v33[1] != 105 )
                        goto LABEL_40;
                      *(_QWORD *)(a1 + 24) = v33 + 2;
                      v56 = v32;
                      v35 = sub_1DDC8(a1, 69);
                      v32 = v56;
                    }
                    else
                    {
                      v52 = v32;
                      if ( v34 != 105 || v33[1] != 108 )
                        goto LABEL_40;
                      v35 = sub_21234(a1);
                      v32 = v52;
                    }
                  }
                  v36 = sub_1B918(a1, 59, v32, v35);
                  v37 = sub_1B918(a1, 58, v31, v36);
                  v14 = sub_1B918(a1, 57, v10, v37);
                  break;
                default:
                  goto LABEL_40;
              }
              goto LABEL_26;
            }
            v13 = sub_1E51C(a1);
            break;
          case '2':
            switch ( *(_DWORD *)(v10 + 8) )
            {
              case 0:
                goto LABEL_49;
              case 1:
                goto LABEL_15;
              case 2:
                v26 = nullptr;
                goto LABEL_62;
              case 3:
                v26 = nullptr;
                goto LABEL_51;
              default:
                goto LABEL_40;
            }
          case '3':
            v12 = *(_BYTE **)(a1 + 24);
            if ( *v12 == 95 )
            {
              *(_QWORD *)(a1 + 24) = v12 + 1;
              v13 = sub_1DDC8(a1, 69);
            }
            else
            {
LABEL_15:
              v13 = sub_21234(a1);
            }
            break;
          default:
            goto LABEL_40;
        }
LABEL_16:
        v14 = sub_1B918(a1, 54, v10, v13);
LABEL_26:
        *(_DWORD *)(a1 + 84) = v7;
        if ( v14 == 0 )
          return 0;
        goto LABEL_22;
      default:
        break;
    }
    if ( v8 == 102 )
      break;
    if ( (unsigned __int8)(v8 - 48) > 9u )
    {
      if ( v8 != 111 )
      {
        if ( (v8 == 116 || v8 == 105) && v3[1] == 108 )
        {
          v28 = 0;
          if ( v8 == 116 )
          {
            v28 = sub_1E51C(a1);
            v3 = *(unsigned __int8 **)(a1 + 24);
          }
          *(_QWORD *)(a1 + 24) = v3 + 2;
          v51 = v28;
          v29 = sub_1DDC8(a1, 69);
          v14 = sub_1B918(a1, 48, v51, v29);
          goto LABEL_26;
        }
        goto LABEL_10;
      }
      if ( v3[1] != 110 )
        goto LABEL_10;
      *(_QWORD *)(a1 + 24) = v3 + 2;
    }
    v15 = sub_1FEC8(a1);
    if ( v15 == 0 )
      goto LABEL_40;
    v14 = v15;
    if ( **(_BYTE **)(a1 + 24) == 73 )
    {
      v50 = v15;
      v18 = sub_1C8DC(a1);
      v14 = sub_1B918(a1, 4, v50, v18);
      goto LABEL_26;
    }
LABEL_21:
    *(_DWORD *)(a1 + 84) = v7;
LABEL_22:
    v16 = sub_1B918(a1, 46, v14, 0);
    *v6 = v16;
    if ( v16 == 0 )
      return 0;
    v3 = *(unsigned __int8 **)(a1 + 24);
    v6 = (__int64 *)(v16 + 16);
    if ( *v3 == v2 )
    {
      *(_QWORD *)(a1 + 24) = v3 + 1;
      return v57;
    }
  }
  if ( v3[1] != 112 )
    goto LABEL_10;
  *(_QWORD *)(a1 + 24) = v3 + 2;
  if ( v3[2] == 84 )
  {
    v21 = 0;
    *(_QWORD *)(a1 + 24) = v3 + 3;
  }
  else
  {
    LODWORD(v21) = sub_1C5D4(a1) + 1;
    if ( (_DWORD)v21 == 0 )
      goto LABEL_40;
    v21 = (int)v21;
  }
  v22 = *(_DWORD *)(a1 + 40);
  if ( v22 < *(_DWORD *)(a1 + 44) )
  {
    v23 = *(_QWORD *)(a1 + 32);
    v24 = 24LL * v22;
    *(_DWORD *)(a1 + 40) = v22 + 1;
    v14 = v23 + v24;
    if ( v23 + v24 != 0 )
    {
      *(_DWORD *)(v23 + v24) = 6;
      *(_QWORD *)(v14 + 8) = v21;
      goto LABEL_21;
    }
  }
LABEL_40:
  *(_DWORD *)(a1 + 84) = v7;
  return 0;
}


// Address: 0x1E51C | Function: sub_1E51C
__int64 __fastcall sub_1E51C(__int64 a1)
{
  unsigned __int8 *v1; // x3
  int v3; // w0
  __int64 v4; // x2
  __int64 *v6; // x20
  __int64 v7; // x0
  int v8; // w0
  __int64 v9; // x1
  __int64 v10; // x0
  int v11; // w0
  _BYTE *v12; // x1
  int v13; // w0
  unsigned __int8 *v14; // x3
  unsigned __int8 *v15; // x2
  __int64 v16; // x2
  __int64 v17; // x0
  __int64 v18; // x0
  __int64 v19; // x0
  __int64 v20; // x3
  __int64 v21; // x0
  __int64 v22; // x0
  __int64 v23; // x0
  int v24; // w0
  _BYTE *v25; // x0
  __int64 v26; // x0
  __int64 v27; // x0
  __int64 v28; // x0
  int v29; // w2
  char **v30; // x0
  __int64 v31; // x4
  __int64 v32; // x1
  int v33; // w1
  int v34; // w0
  __int64 v35; // x0
  _BYTE *v36; // x20
  int v37; // w1
  int v38; // w0
  __int64 v39; // x1
  int v40; // w0
  __int64 v41; // x1
  int v42; // w0
  __int64 v43; // x1
  int v44; // w0
  __int64 v45; // x1
  int v46; // w0
  __int64 v47; // x1
  __int64 v48; // x0
  int v49; // w0
  __int64 v50; // x1
  int v51; // w0
  __int64 v52; // x1
  int v53; // w22
  int v54; // w0
  int *v55; // x0
  __int64 v56; // x20
  int v57; // w0
  _BYTE *v58; // x0
  __int64 v59; // x3
  __int64 v60; // x2
  _BYTE *v61; // x0
  int v62; // w1
  __int64 v63; // x2
  __int64 v64; // x1
  __int64 v65; // x20
  _BOOL4 v66; // w0
  _BYTE *v67; // x0
  __int16 v68; // w1
  __int64 v69; // x0
  _DWORD *v70; // x0
  int v71; // w21
  int v72; // w0
  int *v73; // x0
  __int64 v74; // x20
  int v75; // w0
  _BYTE *v76; // x0
  __int64 v77; // x3
  int v78; // w24
  int v79; // w23
  int v80; // w22
  int v81; // w21
  __int64 v82; // x3
  __int64 v83; // x0
  int v84; // w0
  __int64 v85; // x0
  int v86; // w0
  int v87; // w1
  int v88; // w2
  __int64 v89; // x3
  __int64 v90; // x1
  __int64 v91; // x0
  __int64 v92; // x0
  int v93; // w2
  int v94; // w0
  __int64 v95; // x0
  int v96; // w0
  int v97; // w1
  int v98; // w2
  __int64 v99; // x3
  __int64 v100; // x1
  const char *v101; // x22
  int v102; // w0
  __int64 v103; // x22
  __int64 v104; // x23
  unsigned __int8 *v105; // x0
  int v106; // w1
  __int64 v107; // x0
  __int64 v108; // x0
  __int64 v109; // x0
  char *v110; // x0
  __int64 v111; // x23
  __int64 v112; // x22
  __int64 v113; // x0
  __int64 v114; // x2
  __int64 v115; // x0
  const char **v116; // x3
  const char *v117; // x0
  const char **v118; // x3
  const char *v119; // x21
  const char *v120; // x0
  __int64 v121; // x2
  __int64 v122; // x0
  __int64 v123; // x22
  __int64 v124; // x23
  int v125; // w0
  _BYTE *v126; // x0
  __int64 v127; // x0
  __int64 v128; // x0
  __int64 v129; // x0
  char v130; // w0
  __int64 v131; // x21
  __int64 v132; // x23
  char *v133; // x0
  __int64 v134; // x23
  __int64 v135; // x21
  __int64 v136; // x0
  int v137; // w0
  _BYTE *v138; // x0
  __int64 v139; // x0
  __int64 v140; // x0
  int v141; // w0
  __int64 v142; // x21
  __int64 v143; // x23
  unsigned __int8 *v144; // x0
  int v145; // w1
  __int64 v146; // x0
  __int64 v147; // x0
  __int64 v148; // x0
  char v149; // w0
  __int64 v150; // x0
  __int64 v151; // x0
  unsigned __int8 *v152; // x1
  __int64 v153; // x0
  __int64 v154; // x0
  unsigned __int8 *v155; // x1
  __int64 v156; // [xsp+48h] [xbp+48h]
  __int64 v157; // [xsp+48h] [xbp+48h]
  __int64 v158; // [xsp+48h] [xbp+48h]
  __int64 v159; // [xsp+48h] [xbp+48h]
  __int64 v160; // [xsp+48h] [xbp+48h]
  __int64 v161; // [xsp+48h] [xbp+48h]
  __int64 v162; // [xsp+48h] [xbp+48h]
  _DWORD *v163; // [xsp+58h] [xbp+58h] BYREF

  v1 = *(unsigned __int8 **)(a1 + 24);
  v3 = *v1;
  if ( v3 == 86 || v3 == 114 || v3 == 75 )
  {
    v6 = sub_1BA18(a1, (__int64 *)&v163, 0);
    if ( v6 != nullptr )
    {
      v7 = **(_BYTE **)(a1 + 24) == 70 ? sub_2189C(a1) : sub_1E51C(a1);
      *v6 = v7;
      if ( v7 != 0 )
      {
        if ( (unsigned int)(*(_DWORD *)v7 - 31) <= 1 )
        {
          v9 = *(_QWORD *)(v7 + 8);
          *(_QWORD *)(v7 + 8) = v163;
          v163 = (_DWORD *)*v6;
          *v6 = v9;
        }
        if ( v163 != nullptr )
        {
          v8 = *(_DWORD *)(a1 + 56);
          if ( v8 < *(_DWORD *)(a1 + 60) )
          {
            *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v8) = v163;
            *(_DWORD *)(a1 + 56) = v8 + 1;
            return (__int64)v163;
          }
        }
      }
    }
    return 0;
  }
  switch ( *v1 )
  {
    case '0':
    case '1':
    case '2':
    case '3':
    case '4':
    case '5':
    case '6':
    case '7':
    case '8':
    case '9':
    case 'N':
    case 'Z':
      v4 = sub_2044C(a1);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'A':
      v12 = v1 + 1;
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v13 = v1[1];
      if ( v13 == 95 )
      {
        v16 = 0;
        goto LABEL_110;
      }
      if ( (unsigned __int8)(v13 - 48) <= 9u )
      {
        v14 = v1 + 2;
        do
        {
          v15 = v14;
          *(_QWORD *)(a1 + 24) = v14++;
        }
        while ( (unsigned __int8)(*v15 - 48) <= 9u );
        v16 = sub_1B9B8(a1, (__int64)v12, (int)v15 - (int)v12);
        if ( v16 == 0 )
          goto LABEL_29;
        goto LABEL_27;
      }
      v71 = *(_DWORD *)(a1 + 84);
      *(_DWORD *)(a1 + 84) = 1;
      v72 = v1[1];
      switch ( v72 )
      {
        case 'L':
          v16 = sub_210BC(a1);
          goto LABEL_130;
        case 'T':
          v16 = sub_1C704(a1);
          goto LABEL_130;
        case 's':
          v84 = v1[2];
          if ( v84 == 114 )
          {
            *(_QWORD *)(a1 + 24) = v1 + 3;
            v123 = sub_1E51C(a1);
            v124 = sub_1FEC8(a1);
            if ( **(_BYTE **)(a1 + 24) == 73 )
            {
              v128 = sub_1C8DC(a1);
              v129 = sub_1B918(a1, 4, v124, v128);
              v16 = sub_1B918(a1, 1, v123, v129);
            }
            else
            {
              v16 = sub_1B918(a1, 1, v123, v124);
            }
          }
          else
          {
            if ( v84 != 112 )
              goto LABEL_123;
            *(_QWORD *)(a1 + 24) = v1 + 3;
            v85 = sub_21234(a1);
            v16 = sub_1B918(a1, 74, v85, 0);
          }
          goto LABEL_130;
        case 'f':
          if ( v1[2] != 112 )
            goto LABEL_123;
          *(_QWORD *)(a1 + 24) = v1 + 3;
          if ( v1[3] == 84 )
          {
            v86 = 0;
            *(_QWORD *)(a1 + 24) = v1 + 4;
          }
          else
          {
            v86 = sub_1C5D4(a1) + 1;
            if ( v86 == 0 )
              goto LABEL_163;
          }
          v87 = *(_DWORD *)(a1 + 40);
          if ( v87 >= *(_DWORD *)(a1 + 44) )
            goto LABEL_163;
          v88 = v87 + 1;
          v89 = *(_QWORD *)(a1 + 32);
          v90 = 24LL * v87;
          *(_DWORD *)(a1 + 40) = v88;
          v16 = v89 + v90;
          if ( v89 + v90 == 0 )
            goto LABEL_163;
          *(_DWORD *)(v89 + v90) = 6;
          *(_QWORD *)(v16 + 8) = v86;
          *(_DWORD *)(a1 + 84) = v71;
          v12 = *(_BYTE **)(a1 + 24);
          break;
        default:
          if ( (unsigned __int8)(v72 - 48) > 9u )
          {
            if ( v72 != 111 )
            {
              if ( v72 != 116 && v72 != 105 || v1[2] != 108 )
              {
LABEL_123:
                v73 = (int *)sub_1FCD4(a1);
                v74 = (__int64)v73;
                if ( v73 != nullptr )
                {
                  v75 = *v73;
                  switch ( v75 )
                  {
                    case '1':
                      v116 = *(const char ***)(v74 + 8);
                      v101 = *v116;
                      v117 = *v116;
                      *(_DWORD *)(a1 + 80) += *((_DWORD *)v116 + 4) - 2;
                      if ( strcmp(v117, "st") == 0 )
                      {
                        v77 = sub_1E51C(a1);
LABEL_129:
                        v16 = sub_1B918(a1, 54, v74, v77);
                        goto LABEL_130;
                      }
                      switch ( *(_DWORD *)(*(_QWORD *)(v74 + 8) + 20LL) )
                      {
                        case 0:
LABEL_172:
                          v16 = sub_1B918(a1, 53, v74, 0);
                          goto LABEL_130;
                        case 1:
                          v125 = *(unsigned __int8 *)v101;
                          if ( v125 != 109 && v125 != 112 || *((unsigned __int8 *)v101 + 1) != v125 )
                            goto LABEL_128;
                          v126 = *(_BYTE **)(a1 + 24);
                          if ( *v126 != 95 )
                          {
                            v127 = sub_21234(a1);
                            v77 = sub_1B918(a1, 56, v127, v127);
                            goto LABEL_129;
                          }
                          *(_QWORD *)(a1 + 24) = v126 + 1;
                          goto LABEL_128;
                        case 2:
LABEL_185:
                          v110 = **(char ***)(v74 + 8);
                          if ( v110[1] == 99
                            && ((unsigned __int8)((v130 = *v110) - 114) <= 1u || (unsigned __int8)(v130 - 99) <= 1u) )
                          {
                            v111 = sub_1E51C(a1);
                          }
                          else
                          {
                            v111 = sub_21234(a1);
                          }
                          if ( strcmp(v101, "cl") == 0 )
                          {
                            v112 = sub_1DDC8(a1, 0x45u);
                          }
                          else if ( strcmp(v101, "dt") == 0 || strcmp(v101, "pt") == 0 )
                          {
                            v112 = sub_1FEC8(a1);
                            if ( **(_BYTE **)(a1 + 24) == 73 )
                            {
                              v151 = sub_1C8DC(a1);
                              v112 = sub_1B918(a1, 4, v112, v151);
                            }
                          }
                          else
                          {
                            v112 = sub_21234(a1);
                          }
                          v113 = sub_1B918(a1, 56, v111, v112);
                          v16 = sub_1B918(a1, 55, v74, v113);
                          goto LABEL_130;
                        case 3:
LABEL_174:
                          if ( strcmp(v101, "qu") == 0 )
                          {
                            v103 = sub_21234(a1);
                            v104 = sub_21234(a1);
                            v107 = sub_21234(a1);
                          }
                          else
                          {
                            if ( *v101 != 110 )
                              goto LABEL_163;
                            v102 = *((unsigned __int8 *)v101 + 1);
                            if ( v102 != 97 && v102 != 119 )
                              goto LABEL_163;
                            v103 = sub_1DDC8(a1, 0x5Fu);
                            v104 = sub_1E51C(a1);
                            v105 = *(unsigned __int8 **)(a1 + 24);
                            v106 = *v105;
                            if ( v106 == 69 )
                            {
                              v152 = v105 + 1;
                              v107 = 0;
                              *(_QWORD *)(a1 + 24) = v152;
                            }
                            else if ( v106 == 112 )
                            {
                              if ( v105[1] != 105 )
                                goto LABEL_163;
                              *(_QWORD *)(a1 + 24) = v105 + 2;
                              v107 = sub_1DDC8(a1, 0x45u);
                            }
                            else
                            {
                              if ( v106 != 105 || v105[1] != 108 )
                                goto LABEL_163;
                              v107 = sub_21234(a1);
                            }
                          }
                          v108 = sub_1B918(a1, 59, v104, v107);
                          v109 = sub_1B918(a1, 58, v103, v108);
                          v16 = sub_1B918(a1, 57, v74, v109);
                          goto LABEL_130;
                        default:
                          goto LABEL_163;
                      }
                    case '2':
                      switch ( *(_DWORD *)(v74 + 8) )
                      {
                        case 0:
                          goto LABEL_172;
                        case 1:
                          goto LABEL_128;
                        case 2:
                          v101 = nullptr;
                          goto LABEL_185;
                        case 3:
                          v101 = nullptr;
                          goto LABEL_174;
                        default:
                          goto LABEL_163;
                      }
                    case '3':
                      v76 = *(_BYTE **)(a1 + 24);
                      if ( *v76 == 95 )
                      {
                        *(_QWORD *)(a1 + 24) = v76 + 1;
                        v77 = sub_1DDC8(a1, 0x45u);
                      }
                      else
                      {
LABEL_128:
                        v77 = sub_21234(a1);
                      }
                      goto LABEL_129;
                    default:
                      break;
                  }
                }
LABEL_163:
                *(_DWORD *)(a1 + 84) = v71;
                v4 = 0;
                goto LABEL_30;
              }
              v114 = 0;
              if ( v72 == 116 )
                v114 = sub_1E51C(a1);
              v161 = v114;
              *(_QWORD *)(a1 + 24) += 2LL;
              v115 = sub_1DDC8(a1, 0x45u);
              v16 = sub_1B918(a1, 48, v161, v115);
LABEL_130:
              *(_DWORD *)(a1 + 84) = v71;
              if ( v16 == 0 )
              {
                v4 = 0;
                goto LABEL_30;
              }
LABEL_27:
              v12 = *(_BYTE **)(a1 + 24);
              break;
            }
            if ( v1[2] != 110 )
              goto LABEL_123;
            *(_QWORD *)(a1 + 24) = v1 + 3;
          }
          v16 = sub_1FEC8(a1);
          if ( v16 == 0 )
            goto LABEL_163;
          v12 = *(_BYTE **)(a1 + 24);
          if ( *v12 == 73 )
          {
            v159 = v16;
            v83 = sub_1C8DC(a1);
            v16 = sub_1B918(a1, 4, v159, v83);
            goto LABEL_130;
          }
          *(_DWORD *)(a1 + 84) = v71;
          break;
      }
      if ( *v12 != 95 )
      {
LABEL_29:
        v4 = 0;
LABEL_30:
        v163 = nullptr;
        goto LABEL_18;
      }
LABEL_110:
      *(_QWORD *)(a1 + 24) = v12 + 1;
      v158 = v16;
      v69 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 42, v158, v69);
      v163 = (_DWORD *)v4;
LABEL_18:
      if ( v4 != 0 )
      {
LABEL_19:
        v11 = *(_DWORD *)(a1 + 56);
        if ( v11 < *(_DWORD *)(a1 + 60) )
        {
          *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v11) = v4;
          *(_DWORD *)(a1 + 56) = v11 + 1;
          return (__int64)v163;
        }
      }
      return 0;
    case 'C':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v17 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 37, v17, 0);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'D':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      if ( v1[1] == 0 )
        return 0;
      break;
    case 'F':
      v4 = sub_2189C(a1);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'G':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v18 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 38, v18, 0);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'M':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v19 = sub_1E51C(a1);
      if ( v19 == 0 )
        goto LABEL_29;
      v156 = v19;
      v20 = sub_1E51C(a1);
      if ( v20 == 0 )
        goto LABEL_29;
      v4 = sub_1B918(a1, 43, v156, v20);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'O':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v21 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 36, v21, 0);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'P':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v22 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 34, v22, 0);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'R':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v23 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 35, v23, 0);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'S':
      v24 = v1[1];
      if ( (unsigned __int8)(v24 - 48) <= 9u || v24 == 95 || (unsigned __int8)(v24 - 65) <= 0x19u )
      {
        v4 = sub_1BBC8(a1, 0);
        v25 = *(_BYTE **)(a1 + 24);
        v163 = (_DWORD *)v4;
        if ( *v25 != 73 )
          return v4;
        v157 = v4;
        v26 = a1;
        goto LABEL_47;
      }
      v70 = (_DWORD *)sub_2044C(a1);
      v163 = v70;
      v4 = (__int64)v70;
      if ( v70 == nullptr )
        return 0;
      if ( *v70 == 24 )
        return v4;
      goto LABEL_19;
    case 'T':
      v35 = sub_1C704(a1);
      v36 = *(_BYTE **)(a1 + 24);
      v163 = (_DWORD *)v35;
      v4 = v35;
      if ( *v36 != 73 )
        goto LABEL_18;
      if ( *(_DWORD *)(a1 + 88) != 0 )
      {
        v78 = *(_DWORD *)(a1 + 40);
        v79 = *(_DWORD *)(a1 + 56);
        v80 = *(_DWORD *)(a1 + 64);
        v81 = *(_DWORD *)(a1 + 80);
        v82 = sub_1C8DC(a1);
        if ( **(_BYTE **)(a1 + 24) != 73 )
        {
          *(_QWORD *)(a1 + 24) = v36;
          *(_DWORD *)(a1 + 40) = v78;
          *(_DWORD *)(a1 + 56) = v79;
          *(_DWORD *)(a1 + 64) = v80;
          *(_DWORD *)(a1 + 80) = v81;
          v4 = (__int64)v163;
          goto LABEL_18;
        }
        if ( v163 != nullptr )
        {
          v93 = *(_DWORD *)(a1 + 56);
          if ( v93 < *(_DWORD *)(a1 + 60) )
          {
            *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v93) = v163;
            *(_DWORD *)(a1 + 56) = v93 + 1;
            v4 = sub_1B918(a1, 4, (__int64)v163, v82);
            v163 = (_DWORD *)v4;
            goto LABEL_18;
          }
        }
        return 0;
      }
      if ( v35 == 0 )
        return 0;
      v37 = *(_DWORD *)(a1 + 56);
      if ( v37 >= *(_DWORD *)(a1 + 60) )
        return 0;
      v26 = a1;
      *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v37) = v4;
      *(_DWORD *)(a1 + 56) = v37 + 1;
      v157 = (__int64)v163;
LABEL_47:
      v27 = sub_1C8DC(v26);
      v4 = sub_1B918(a1, 4, v157, v27);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'U':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v163 = (_DWORD *)sub_1C52C(a1);
      v28 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 33, v28, (__int64)v163);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 'a':
    case 'b':
    case 'c':
    case 'd':
    case 'e':
    case 'f':
    case 'g':
    case 'h':
    case 'i':
    case 'j':
    case 'l':
    case 'm':
    case 'n':
    case 'o':
    case 's':
    case 't':
    case 'v':
    case 'w':
    case 'x':
    case 'y':
    case 'z':
      v29 = *(_DWORD *)(a1 + 40);
      v30 = &(&off_48340)[4 * v3 - 388];
      if ( v29 >= *(_DWORD *)(a1 + 44)
        || (v31 = *(_QWORD *)(a1 + 32), v32 = 24LL * v29, *(_DWORD *)(a1 + 40) = v29 + 1, v4 = v31 + v32, v31 + v32 == 0) )
      {
LABEL_108:
        v163 = nullptr;
        __break(0x3E8u);
      }
      *(_DWORD *)(v31 + v32) = 39;
      *(_QWORD *)(v4 + 8) = v30;
      v33 = *((_DWORD *)v30 + 2);
      v34 = *(_DWORD *)(a1 + 80);
      *(_QWORD *)(a1 + 24) = v1 + 1;
      *(_DWORD *)(a1 + 80) = v34 + v33;
      return v4;
    case 'u':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v10 = sub_1C52C(a1);
      v4 = sub_1B918(a1, 40, v10, 0);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    default:
      return 0;
  }
  *(_QWORD *)(a1 + 24) = v1 + 2;
  switch ( v1[1] )
  {
    case 'F':
      v62 = *(_DWORD *)(a1 + 40);
      if ( v62 >= *(_DWORD *)(a1 + 44) )
      {
        dword_0 = 0;
        __break(0x3E8u);
      }
      v63 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v62 + 1;
      v64 = v63 + 24LL * v62;
      v163 = (_DWORD *)v64;
      v65 = v64;
      *(_DWORD *)v64 = 44;
      v66 = (unsigned __int8)(v1[2] - 48) <= 9u;
      *(_WORD *)(v64 + 16) = v66;
      if ( v66 )
      {
        sub_1BFCC((unsigned __int8 **)(a1 + 24));
        v65 = (__int64)v163;
      }
      *(_QWORD *)(v65 + 8) = sub_1E51C(a1);
      if ( *((_QWORD *)v163 + 1) == 0 )
        return 0;
      sub_1BFCC((unsigned __int8 **)(a1 + 24));
      v67 = *(_BYTE **)(a1 + 24);
      v68 = 0;
      if ( *v67 != 0 )
      {
        *(_QWORD *)(a1 + 24) = v67 + 1;
        v68 = *v67 == 115;
      }
      v4 = (__int64)v163;
      *((_WORD *)v163 + 9) = v68;
      return v4;
    case 'T':
    case 't':
      v53 = *(_DWORD *)(a1 + 84);
      *(_DWORD *)(a1 + 84) = 1;
      v54 = v1[2];
      switch ( v54 )
      {
        case 'L':
          v60 = sub_210BC(a1);
          goto LABEL_97;
        case 'T':
          v60 = sub_1C704(a1);
          goto LABEL_97;
        case 's':
          v94 = v1[3];
          if ( v94 == 114 )
          {
            *(_QWORD *)(a1 + 24) = v1 + 4;
            v131 = sub_1E51C(a1);
            v132 = sub_1FEC8(a1);
            if ( **(_BYTE **)(a1 + 24) == 73 )
            {
              v153 = sub_1C8DC(a1);
              v154 = sub_1B918(a1, 4, v132, v153);
              v60 = sub_1B918(a1, 1, v131, v154);
            }
            else
            {
              v60 = sub_1B918(a1, 1, v131, v132);
            }
            goto LABEL_97;
          }
          if ( v94 == 112 )
          {
            *(_QWORD *)(a1 + 24) = v1 + 4;
            v95 = sub_21234(a1);
            v60 = sub_1B918(a1, 74, v95, 0);
            goto LABEL_97;
          }
          break;
        case 'f':
          if ( v1[3] == 112 )
          {
            *(_QWORD *)(a1 + 24) = v1 + 4;
            if ( v1[4] == 84 )
            {
              v96 = 0;
              *(_QWORD *)(a1 + 24) = v1 + 5;
            }
            else
            {
              v96 = sub_1C5D4(a1) + 1;
              if ( v96 == 0 )
                goto LABEL_203;
            }
            v97 = *(_DWORD *)(a1 + 40);
            if ( v97 >= *(_DWORD *)(a1 + 44) )
            {
LABEL_203:
              v60 = 0;
              goto LABEL_97;
            }
            v98 = v97 + 1;
            v99 = *(_QWORD *)(a1 + 32);
            v100 = 24LL * v97;
            *(_DWORD *)(a1 + 40) = v98;
            v60 = 0;
            if ( v99 + v100 != 0 )
            {
              *(_DWORD *)(v99 + v100) = 6;
              *(_QWORD *)(v99 + v100 + 8) = v96;
              v60 = v99 + v100;
            }
LABEL_97:
            *(_DWORD *)(a1 + 84) = v53;
            v163 = (_DWORD *)sub_1B918(a1, 66, v60, 0);
            v4 = (__int64)v163;
            if ( v163 == nullptr )
              return 0;
            v61 = *(_BYTE **)(a1 + 24);
            if ( *v61 == 0 )
              return 0;
            *(_QWORD *)(a1 + 24) = v61 + 1;
            if ( *v61 != 69 )
              return 0;
            goto LABEL_19;
          }
          break;
        default:
          if ( (unsigned __int8)(v54 - 48) <= 9u )
          {
LABEL_152:
            v91 = sub_1FEC8(a1);
            if ( v91 == 0 )
              goto LABEL_203;
            v60 = v91;
            if ( **(_BYTE **)(a1 + 24) == 73 )
            {
              v160 = v91;
              v92 = sub_1C8DC(a1);
              v60 = sub_1B918(a1, 4, v160, v92);
            }
            goto LABEL_97;
          }
          if ( v54 != 111 )
          {
            if ( (v54 == 116 || v54 == 105) && v1[3] == 108 )
            {
              v121 = 0;
              if ( v54 == 116 )
                v121 = sub_1E51C(a1);
              v162 = v121;
              *(_QWORD *)(a1 + 24) += 2LL;
              v122 = sub_1DDC8(a1, 0x45u);
              v60 = sub_1B918(a1, 48, v162, v122);
              goto LABEL_97;
            }
            break;
          }
          if ( v1[3] == 110 )
          {
            *(_QWORD *)(a1 + 24) = v1 + 4;
            goto LABEL_152;
          }
          break;
      }
      v55 = (int *)sub_1FCD4(a1);
      v56 = (__int64)v55;
      if ( v55 == nullptr )
        goto LABEL_203;
      v57 = *v55;
      if ( v57 == 49 )
      {
        v118 = *(const char ***)(v56 + 8);
        v119 = *v118;
        v120 = *v118;
        *(_DWORD *)(a1 + 80) += *((_DWORD *)v118 + 4) - 2;
        if ( strcmp(v120, "st") == 0 )
        {
          v140 = sub_1E51C(a1);
          goto LABEL_238;
        }
        v60 = 0;
        switch ( *(_DWORD *)(*(_QWORD *)(v56 + 8) + 20LL) )
        {
          case 0:
LABEL_250:
            v60 = sub_1B918(a1, 53, v56, 0);
            goto LABEL_97;
          case 1:
            v137 = *(unsigned __int8 *)v119;
            if ( v137 != 109 && v137 != 112 || *((unsigned __int8 *)v119 + 1) != v137 )
              goto LABEL_95;
            v138 = *(_BYTE **)(a1 + 24);
            if ( *v138 != 95 )
            {
              v139 = sub_21234(a1);
              v140 = sub_1B918(a1, 56, v139, v139);
              goto LABEL_238;
            }
            *(_QWORD *)(a1 + 24) = v138 + 1;
            goto LABEL_95;
          case 2:
LABEL_225:
            v133 = **(char ***)(v56 + 8);
            if ( v133[1] == 99 && ((unsigned __int8)((v149 = *v133) - 114) <= 1u || (unsigned __int8)(v149 - 99) <= 1u) )
              v134 = sub_1E51C(a1);
            else
              v134 = sub_21234(a1);
            if ( strcmp(v119, "cl") == 0 )
            {
              v135 = sub_1DDC8(a1, 0x45u);
            }
            else if ( strcmp(v119, "dt") == 0 || strcmp(v119, "pt") == 0 )
            {
              v135 = sub_1FEC8(a1);
              if ( **(_BYTE **)(a1 + 24) == 73 )
              {
                v150 = sub_1C8DC(a1);
                v135 = sub_1B918(a1, 4, v135, v150);
              }
            }
            else
            {
              v135 = sub_21234(a1);
            }
            v136 = sub_1B918(a1, 56, v134, v135);
            v60 = sub_1B918(a1, 55, v56, v136);
            goto LABEL_97;
          case 3:
LABEL_240:
            if ( strcmp(v119, "qu") == 0 )
            {
              v142 = sub_21234(a1);
              v143 = sub_21234(a1);
              v146 = sub_21234(a1);
            }
            else
            {
              if ( *v119 != 110 )
                goto LABEL_203;
              v141 = *((unsigned __int8 *)v119 + 1);
              if ( v141 != 97 && v141 != 119 )
                goto LABEL_203;
              v142 = sub_1DDC8(a1, 0x5Fu);
              v143 = sub_1E51C(a1);
              v144 = *(unsigned __int8 **)(a1 + 24);
              v145 = *v144;
              if ( v145 == 69 )
              {
                v155 = v144 + 1;
                v146 = 0;
                *(_QWORD *)(a1 + 24) = v155;
              }
              else if ( v145 == 112 )
              {
                if ( v144[1] != 105 )
                  goto LABEL_203;
                *(_QWORD *)(a1 + 24) = v144 + 2;
                v146 = sub_1DDC8(a1, 0x45u);
              }
              else
              {
                if ( v145 != 105 || v144[1] != 108 )
                  goto LABEL_203;
                v146 = sub_21234(a1);
              }
            }
            v147 = sub_1B918(a1, 59, v143, v146);
            v148 = sub_1B918(a1, 58, v142, v147);
            v60 = sub_1B918(a1, 57, v56, v148);
            goto LABEL_97;
          default:
            goto LABEL_97;
        }
      }
      if ( v57 != 50 )
      {
        if ( v57 == 51 )
        {
          v58 = *(_BYTE **)(a1 + 24);
          if ( *v58 != 95 )
          {
LABEL_95:
            v59 = sub_21234(a1);
LABEL_96:
            v60 = sub_1B918(a1, 54, v56, v59);
            goto LABEL_97;
          }
          *(_QWORD *)(a1 + 24) = v58 + 1;
          v140 = sub_1DDC8(a1, 0x45u);
LABEL_238:
          v59 = v140;
          goto LABEL_96;
        }
        goto LABEL_203;
      }
      v60 = 0;
      switch ( *(_DWORD *)(v56 + 8) )
      {
        case 0:
          goto LABEL_250;
        case 1:
          goto LABEL_95;
        case 2:
          v119 = nullptr;
          goto LABEL_225;
        case 3:
          v119 = nullptr;
          goto LABEL_240;
        default:
          goto LABEL_97;
      }
    case 'a':
      return sub_1B9B8(a1, (__int64)"auto", 4);
    case 'd':
      v51 = *(_DWORD *)(a1 + 40);
      if ( v51 >= *(_DWORD *)(a1 + 44) )
        goto LABEL_108;
      v52 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v51 + 1;
      v4 = v52 + 24LL * v51;
      if ( v4 == 0 )
        goto LABEL_108;
      *(_DWORD *)(v52 + 24LL * v51) = 39;
      *(_QWORD *)(v4 + 8) = &off_486A0;
      *(_DWORD *)(a1 + 80) += 9;
      return v4;
    case 'e':
      v44 = *(_DWORD *)(a1 + 40);
      if ( v44 >= *(_DWORD *)(a1 + 44) )
        goto LABEL_108;
      v45 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v44 + 1;
      v4 = v45 + 24LL * v44;
      if ( v4 == 0 )
        goto LABEL_108;
      *(_DWORD *)(v45 + 24LL * v44) = 39;
      *(_QWORD *)(v4 + 8) = &off_486C0;
      *(_DWORD *)(a1 + 80) += 10;
      return v4;
    case 'f':
      v42 = *(_DWORD *)(a1 + 40);
      if ( v42 >= *(_DWORD *)(a1 + 44) )
        goto LABEL_108;
      v43 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v42 + 1;
      v4 = v43 + 24LL * v42;
      if ( v4 == 0 )
        goto LABEL_108;
      *(_DWORD *)(v43 + 24LL * v42) = 39;
      *(_QWORD *)(v4 + 8) = &off_48680;
      *(_DWORD *)(a1 + 80) += 9;
      return v4;
    case 'h':
      v40 = *(_DWORD *)(a1 + 40);
      if ( v40 >= *(_DWORD *)(a1 + 44) )
        goto LABEL_108;
      v41 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v40 + 1;
      v4 = v41 + 24LL * v40;
      if ( v4 == 0 )
        goto LABEL_108;
      *(_DWORD *)(v41 + 24LL * v40) = 39;
      *(_QWORD *)(v4 + 8) = &off_486E0;
      *(_DWORD *)(a1 + 80) += 4;
      return v4;
    case 'i':
      v38 = *(_DWORD *)(a1 + 40);
      if ( v38 >= *(_DWORD *)(a1 + 44) )
        goto LABEL_108;
      v39 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v38 + 1;
      v4 = v39 + 24LL * v38;
      if ( v4 == 0 )
        goto LABEL_108;
      *(_DWORD *)(v39 + 24LL * v38) = 39;
      *(_QWORD *)(v4 + 8) = &off_48720;
      *(_DWORD *)(a1 + 80) += 8;
      return v4;
    case 'n':
      v49 = *(_DWORD *)(a1 + 40);
      if ( v49 >= *(_DWORD *)(a1 + 44) )
        goto LABEL_108;
      v50 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v49 + 1;
      v4 = v50 + 24LL * v49;
      if ( v4 == 0 )
        goto LABEL_108;
      *(_DWORD *)(v50 + 24LL * v49) = 39;
      *(_QWORD *)(v4 + 8) = &off_48740;
      *(_DWORD *)(a1 + 80) += 17;
      return v4;
    case 'p':
      v48 = sub_1E51C(a1);
      v4 = sub_1B918(a1, 74, v48, 0);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    case 's':
      v46 = *(_DWORD *)(a1 + 40);
      if ( v46 >= *(_DWORD *)(a1 + 44) )
        goto LABEL_108;
      v47 = *(_QWORD *)(a1 + 32);
      *(_DWORD *)(a1 + 40) = v46 + 1;
      v4 = v47 + 24LL * v46;
      if ( v4 == 0 )
        goto LABEL_108;
      *(_DWORD *)(v47 + 24LL * v46) = 39;
      *(_QWORD *)(v4 + 8) = &off_48700;
      *(_DWORD *)(a1 + 80) += 8;
      return v4;
    case 'v':
      v4 = sub_219CC(a1);
      v163 = (_DWORD *)v4;
      goto LABEL_18;
    default:
      return 0;
  }
}


// Address: 0x1FBC4 | Function: sub_1FBC4
__int64 __fastcall sub_1FBC4(__int64 a1)
{
  unsigned __int8 *v1; // x3
  int v2; // w1
  __int64 *v4; // x20
  __int64 v5; // x0
  __int64 v6; // x4
  __int64 result; // x0
  __int64 v8; // x1
  __int64 v9; // x1
  __int64 v10; // [xsp+28h] [xbp+28h] BYREF

  v1 = *(unsigned __int8 **)(a1 + 24);
  v10 = 0;
  v2 = *v1;
  if ( v2 == 69 || v2 == 0 )
    return 0;
  v4 = &v10;
  if ( v2 == 46 )
    return 0;
  do
  {
    if ( (v2 == 79 || v2 == 82) && v1[1] == 69 )
      break;
    v6 = sub_1E51C(a1);
    if ( v6 == 0 )
      return 0;
    v5 = sub_1B918(a1, 46, v6, 0);
    *v4 = v5;
    v4 = (__int64 *)(v5 + 16);
    if ( v5 == 0 )
      return 0;
    v1 = *(unsigned __int8 **)(a1 + 24);
    v2 = *v1;
    if ( v2 == 69 || v2 == 0 )
      break;
  }
  while ( v2 != 46 );
  result = v10;
  if ( v10 == 0 )
    return 0;
  if ( *(_QWORD *)((char *)&word_10 + v10) == 0 )
  {
    v8 = *(_QWORD *)&byte_8[v10];
    if ( *(_DWORD *)v8 == 39 )
    {
      v9 = *(_QWORD *)(v8 + 8);
      if ( *(_DWORD *)(v9 + 28) == 9 )
      {
        *(_DWORD *)(a1 + 80) -= *(_DWORD *)(v9 + 8);
        *(_QWORD *)&byte_8[result] = 0;
      }
    }
  }
  return result;
}


// Address: 0x1FCD4 | Function: sub_1FCD4
__int64 __fastcall sub_1FCD4(__int64 a1)
{
  unsigned __int8 *v2; // x1
  unsigned int v3; // w8
  unsigned int v4; // w6
  int v5; // w3
  int v6; // w2
  int v7; // w0
  char **v8; // x7
  unsigned int v9; // w1
  __int64 result; // x0
  unsigned int v11; // w1
  int v13; // w20
  __int64 v14; // x2
  unsigned int v15; // w20
  __int64 v16; // x2
  int v17; // w0
  __int64 v18; // x3
  __int64 v19; // x0
  __int64 v20; // x1
  int v21; // w0
  __int64 v22; // x2
  __int64 v23; // x1

  v2 = *(unsigned __int8 **)(a1 + 24);
  if ( *v2 == 0 )
  {
    v3 = 0;
    v4 = 0;
    goto LABEL_3;
  }
  *(_QWORD *)(a1 + 24) = v2 + 1;
  v4 = *v2;
  if ( v2[1] == 0 )
  {
    v3 = 0;
    goto LABEL_3;
  }
  *(_QWORD *)(a1 + 24) = v2 + 2;
  v3 = v2[1];
  if ( v4 == 118 )
  {
    v15 = v3 - 48;
    if ( (unsigned __int8)(v3 - 48) <= 9u )
    {
      v16 = sub_1C52C(a1);
      v17 = *(_DWORD *)(a1 + 40);
      if ( v17 < *(_DWORD *)(a1 + 44) )
      {
        v18 = *(_QWORD *)(a1 + 32);
        *(_DWORD *)(a1 + 40) = v17 + 1;
        v19 = 24LL * v17;
        v20 = v18 + v19;
        if ( v16 != 0 && v20 != 0 )
        {
          *(_DWORD *)(v18 + v19) = 50;
          *(_DWORD *)(v20 + 8) = v15;
          *(_QWORD *)(v20 + 16) = v16;
          return v18 + v19;
        }
      }
      return 0;
    }
    goto LABEL_3;
  }
  if ( v3 != 118 || v4 != 99 )
  {
LABEL_3:
    v5 = 61;
    v6 = 0;
    while ( 1 )
    {
      v7 = v6 + (v5 - v6) / 2;
      v8 = &off_488E8[3 * v7];
      v9 = (unsigned __int8)**v8;
      if ( v4 == v9 )
      {
        v11 = (unsigned __int8)(*v8)[1];
        if ( v3 == v11 )
        {
          v21 = *(_DWORD *)(a1 + 40);
          if ( v21 < *(_DWORD *)(a1 + 44) )
          {
            v22 = *(_QWORD *)(a1 + 32);
            v23 = 24LL * v21;
            *(_DWORD *)(a1 + 40) = v21 + 1;
            result = 0;
            if ( v22 + v23 != 0 )
            {
              *(_DWORD *)(v22 + v23) = 49;
              *(_QWORD *)(v22 + v23 + 8) = v8;
              return v22 + v23;
            }
            return result;
          }
          return 0;
        }
        if ( v11 <= v3 )
        {
LABEL_12:
          v6 = v7 + 1;
          goto LABEL_7;
        }
      }
      else if ( v9 <= v4 )
      {
        goto LABEL_12;
      }
      v5 = v6 + (v5 - v6) / 2;
LABEL_7:
      if ( v6 == v5 )
        return 0;
    }
  }
  v13 = *(_DWORD *)(a1 + 88);
  *(_DWORD *)(a1 + 88) = *(_DWORD *)(a1 + 84) == 0;
  v14 = sub_1E51C(a1);
  if ( *(_DWORD *)(a1 + 88) != 0 )
    result = sub_1B918(a1, 52, v14, 0);
  else
    result = sub_1B918(a1, 51, v14, 0);
  *(_DWORD *)(a1 + 88) = v13;
  return result;
}


// Address: 0x1FEC8 | Function: sub_1FEC8
__int64 __fastcall sub_1FEC8(__int64 a1)
{
  unsigned __int8 *v1; // x3
  int v3; // w1
  int v4; // w1
  unsigned __int8 *v5; // x1
  int v6; // w4
  __int64 v7; // x2
  __int64 result; // x0
  int v9; // w5
  int v10; // w3
  __int64 v11; // x1
  char *v12; // x4
  __int64 v13; // x1
  char v14; // t1
  __int64 v15; // x3
  int v16; // w4
  __int64 v17; // x0
  _DWORD *v18; // x0
  __int64 v19; // x20
  int v20; // w0
  int v21; // w0
  int v22; // w5
  __int64 v23; // x0
  int v24; // w2
  __int64 v25; // x3
  __int64 v26; // x1
  int v27; // w0
  __int64 v28; // x0
  __int64 v29; // x0
  int v30; // w3
  const char *v31; // x0
  int v32; // w0
  __int64 v33; // x0
  int v34; // w2
  __int64 v35; // x3
  __int64 v36; // x0
  int v37; // w5
  int v38; // w2
  int v39; // w4
  __int64 v40; // x6
  __int64 v41; // x4
  int v42; // w5
  int v43; // w2
  int v44; // w4
  __int64 v45; // x6
  __int64 v46; // x4
  __int64 v47; // [xsp+28h] [xbp+28h]
  __int64 v48; // [xsp+28h] [xbp+28h]
  __int64 v49; // [xsp+28h] [xbp+28h]

  v1 = *(unsigned __int8 **)(a1 + 24);
  v3 = *v1;
  if ( (unsigned __int8)(v3 - 48) <= 9u )
  {
    v7 = sub_1C52C(a1);
    v5 = *(unsigned __int8 **)(a1 + 24);
    v16 = *v5;
    goto LABEL_20;
  }
  if ( (unsigned __int8)(v3 - 97) <= 0x19u )
  {
    v17 = sub_1FCD4(a1);
    v7 = v17;
    if ( v17 != 0 && *(_DWORD *)v17 == 49 )
    {
      v29 = *(_QWORD *)(v17 + 8);
      v49 = v7;
      v30 = *(_DWORD *)(v29 + 16);
      v31 = *(const char **)v29;
      *(_DWORD *)(a1 + 80) += v30 + 7;
      v32 = strcmp(v31, "li");
      v7 = v49;
      if ( v32 == 0 )
      {
        v33 = sub_1C52C(a1);
        v7 = sub_1B918(a1, 54, v49, v33);
      }
    }
    v5 = *(unsigned __int8 **)(a1 + 24);
    v16 = *v5;
    goto LABEL_20;
  }
  if ( (unsigned __int8)(v3 - 67) <= 1u )
  {
    v18 = *(_DWORD **)(a1 + 72);
    if ( v18 != nullptr && (*v18 == 0 || *v18 == 24) )
    {
      *(_DWORD *)(a1 + 80) += v18[4];
      v16 = *v1;
      if ( v16 != 67 )
      {
        if ( v16 != 68 )
        {
          v5 = v1;
          v7 = 0;
          goto LABEL_20;
        }
        goto LABEL_55;
      }
    }
    else if ( v3 != 67 )
    {
      if ( v3 != 68 )
        return 0;
LABEL_55:
      switch ( v1[1] )
      {
        case '0':
          v37 = 1;
          break;
        case '1':
          v37 = 2;
          break;
        case '2':
          v37 = 3;
          break;
        case '4':
          v37 = 4;
          break;
        case '5':
          v37 = 5;
          break;
        default:
          return 0;
      }
      v38 = *(_DWORD *)(a1 + 40);
      v5 = v1 + 2;
      v39 = *(_DWORD *)(a1 + 44);
      *(_QWORD *)(a1 + 24) = v1 + 2;
      if ( v38 < v39 )
      {
        v40 = *(_QWORD *)(a1 + 32);
        v41 = 24LL * v38;
        *(_DWORD *)(a1 + 40) = v38 + 1;
        v7 = v40 + v41;
        if ( v40 + v41 != 0 && v18 != nullptr )
        {
          *(_DWORD *)(v40 + v41) = 8;
          *(_DWORD *)(v7 + 8) = v37;
          *(_QWORD *)(v7 + 16) = v18;
          v16 = v1[2];
          goto LABEL_20;
        }
      }
LABEL_81:
      v16 = v1[2];
      v7 = 0;
      goto LABEL_20;
    }
    switch ( v1[1] )
    {
      case '1':
        v42 = 1;
        break;
      case '2':
        v42 = 2;
        break;
      case '3':
        v42 = 3;
        break;
      case '4':
        v42 = 4;
        break;
      case '5':
        v42 = 5;
        break;
      default:
        return 0;
    }
    v43 = *(_DWORD *)(a1 + 40);
    v5 = v1 + 2;
    v44 = *(_DWORD *)(a1 + 44);
    *(_QWORD *)(a1 + 24) = v1 + 2;
    if ( v43 < v44 )
    {
      v45 = *(_QWORD *)(a1 + 32);
      v46 = 24LL * v43;
      *(_DWORD *)(a1 + 40) = v43 + 1;
      v7 = v45 + v46;
      if ( v45 + v46 != 0 && v18 != nullptr )
      {
        *(_DWORD *)(v45 + v46) = 7;
        *(_DWORD *)(v7 + 8) = v42;
        *(_QWORD *)(v7 + 16) = v18;
        v16 = v1[2];
        goto LABEL_20;
      }
    }
    goto LABEL_81;
  }
  if ( v3 == 76 )
  {
    *(_QWORD *)(a1 + 24) = v1 + 1;
    v28 = sub_1C52C(a1);
    if ( v28 != 0 )
    {
      v48 = v28;
      if ( (unsigned int)sub_1C660(a1) != 0 )
      {
        v5 = *(unsigned __int8 **)(a1 + 24);
        v7 = v48;
        v16 = *v5;
        goto LABEL_20;
      }
    }
    return 0;
  }
  if ( v3 != 85 )
    return 0;
  v4 = v1[1];
  if ( v4 != 108 )
  {
    if ( v4 == 116 )
    {
      v5 = v1 + 1;
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v6 = v1[1];
      if ( v6 != 116 )
        goto LABEL_9;
      *(_QWORD *)(a1 + 24) = v1 + 2;
      v23 = sub_1C5D4(a1);
      if ( (v23 & 0x8000000000000000LL) == 0 )
      {
        v24 = *(_DWORD *)(a1 + 40);
        if ( v24 < *(_DWORD *)(a1 + 44) )
        {
          v25 = *(_QWORD *)(a1 + 32);
          v26 = 24LL * v24;
          *(_DWORD *)(a1 + 40) = v24 + 1;
          v7 = v25 + v26;
          if ( v25 + v26 != 0 )
          {
            *(_DWORD *)(v25 + v26) = 71;
            *(_QWORD *)(v7 + 8) = v23;
            v27 = *(_DWORD *)(a1 + 56);
            if ( v27 < *(_DWORD *)(a1 + 60) )
              goto LABEL_45;
          }
        }
      }
      v5 = *(unsigned __int8 **)(a1 + 24);
      goto LABEL_52;
    }
    return 0;
  }
  v5 = v1 + 1;
  *(_QWORD *)(a1 + 24) = v1 + 1;
  v6 = v1[1];
  if ( v6 == 108 )
  {
    *(_QWORD *)(a1 + 24) = v1 + 2;
    v19 = sub_1FBC4(a1);
    v5 = *(unsigned __int8 **)(a1 + 24);
    if ( v19 == 0 )
    {
LABEL_52:
      v7 = 0;
      v16 = *v5;
      goto LABEL_20;
    }
    v6 = *v5;
    if ( v6 == 69 )
    {
      *(_QWORD *)(a1 + 24) = v5 + 1;
      v20 = v5[1];
      if ( v20 == 95 )
      {
        v5 += 2;
        v22 = 0;
        *(_QWORD *)(a1 + 24) = v5;
      }
      else
      {
        if ( v20 == 110 )
          return 0;
        v21 = sub_1BFCC((unsigned __int8 **)(a1 + 24));
        v5 = *(unsigned __int8 **)(a1 + 24);
        v7 = 0;
        v16 = *v5;
        if ( v16 != 95 )
          goto LABEL_20;
        *(_QWORD *)(a1 + 24) = v5 + 1;
        v22 = v21 + 1;
        if ( v21 + 1 < 0 )
        {
          v16 = *++v5;
          goto LABEL_20;
        }
        ++v5;
      }
      v34 = *(_DWORD *)(a1 + 40);
      if ( v34 < *(_DWORD *)(a1 + 44) )
      {
        v35 = *(_QWORD *)(a1 + 32);
        v36 = 24LL * v34;
        *(_DWORD *)(a1 + 40) = v34 + 1;
        v7 = v35 + v36;
        if ( v35 + v36 != 0 )
        {
          *(_DWORD *)(v35 + v36) = 69;
          *(_QWORD *)(v7 + 8) = v19;
          *(_DWORD *)(v7 + 16) = v22;
          v27 = *(_DWORD *)(a1 + 56);
          if ( v27 < *(_DWORD *)(a1 + 60) )
          {
LABEL_45:
            *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v27) = v7;
            *(_DWORD *)(a1 + 56) = v27 + 1;
            v5 = *(unsigned __int8 **)(a1 + 24);
            v16 = *v5;
            goto LABEL_20;
          }
        }
      }
      v16 = *v5;
      v7 = 0;
LABEL_20:
      result = v7;
      if ( v16 != 66 )
        return result;
      while ( 1 )
      {
LABEL_10:
        *(_QWORD *)(a1 + 24) = v5 + 1;
        v9 = 0;
        v10 = v5[1];
        if ( v10 == 110 )
        {
          *(_QWORD *)(a1 + 24) = v5 + 2;
          v9 = 1;
          LOBYTE(v10) = v5[2];
          if ( (unsigned __int8)(v10 - 48) > 9u )
            goto LABEL_23;
        }
        else if ( (unsigned __int8)(v10 - 48) > 9u )
        {
          goto LABEL_23;
        }
        v11 = 0;
        v12 = (char *)(*(_QWORD *)(a1 + 24) + 1LL);
        do
        {
          *(_QWORD *)(a1 + 24) = v12;
          v13 = 10 * v11 + (unsigned __int8)v10;
          v14 = *v12++;
          LOBYTE(v10) = v14;
          v11 = v13 - 48;
        }
        while ( (unsigned __int8)(v14 - 48) <= 9u );
        if ( v11 <= 0 || v9 != 0 )
        {
LABEL_23:
          v15 = 0;
          goto LABEL_17;
        }
        v47 = v7;
        v15 = sub_1C30C(a1, v11);
        v7 = v47;
        *(_QWORD *)(a1 + 72) = v15;
LABEL_17:
        v7 = sub_1B918(a1, 75, v7, v15);
        v5 = *(unsigned __int8 **)(a1 + 24);
        if ( *v5 != 66 )
          return v7;
      }
    }
  }
LABEL_9:
  v7 = 0;
  result = 0;
  if ( v6 == 66 )
    goto LABEL_10;
  return result;
}


// Address: 0x2044C | Function: sub_2044C
__int64 __fastcall sub_2044C(__int64 a1)
{
  _BYTE *v1; // x3
  __int64 v3; // x19
  __int64 v5; // x21
  _BYTE *v6; // x0
  __int64 v7; // x2
  __int64 v8; // x0
  __int64 *v9; // x22
  unsigned __int8 *v10; // x0
  int v11; // w19
  __int64 v12; // x23
  __int64 v13; // x21
  int v14; // w1
  int *v15; // x0
  __int64 v16; // x3
  int v17; // w0
  int v18; // w0
  __int64 v19; // x0
  _BYTE *v20; // x1
  int v21; // w0
  int v22; // w1
  __int64 v23; // x0
  __int64 v24; // x0
  __int64 v25; // x3
  int v26; // w1
  int v27; // w0
  int v28; // w1
  int v29; // w2
  int v30; // w22
  _DWORD *v31; // x0
  _DWORD *v32; // x19
  int v33; // w0
  int v34; // w0
  __int64 v35; // x2
  _BYTE *v36; // x0
  __int64 v37; // [xsp+48h] [xbp+48h]
  __int64 v38; // [xsp+48h] [xbp+48h]
  __int64 v39; // [xsp+48h] [xbp+48h]
  __int64 v40; // [xsp+58h] [xbp+58h] BYREF

  v1 = *(_BYTE **)(a1 + 24);
  switch ( *v1 )
  {
    case 'N':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v9 = sub_1BA18(a1, &v40, 1);
      if ( v9 == nullptr )
        return 0;
      v10 = *(unsigned __int8 **)(a1 + 24);
      v11 = *v10;
      if ( v11 == 79 )
      {
        v28 = 32;
        v29 = *(_DWORD *)(a1 + 80) + 3;
      }
      else
      {
        v12 = 0;
        if ( v11 != 82 )
        {
          v13 = 0;
          goto LABEL_15;
        }
        v28 = 31;
        v29 = *(_DWORD *)(a1 + 80) + 2;
      }
      *(_DWORD *)(a1 + 80) = v29;
      *(_QWORD *)(a1 + 24) = v10 + 1;
      v13 = 0;
      v12 = sub_1B918(a1, v28, 0, 0);
      v10 = *(unsigned __int8 **)(a1 + 24);
      v11 = *v10;
LABEL_15:
      while ( 2 )
      {
        while ( 2 )
        {
          if ( v11 == 0 )
            goto LABEL_57;
          if ( v11 != 68 )
            break;
          if ( (v10[1] & 0xDF) == 0x54 )
            v25 = sub_1E51C(a1);
          else
            v25 = sub_1FEC8(a1);
LABEL_55:
          if ( v13 != 0 )
            goto LABEL_43;
          v13 = v25;
LABEL_46:
          v10 = *(unsigned __int8 **)(a1 + 24);
          v11 = *v10;
          if ( v11 != 69 )
          {
            if ( v13 != 0 )
            {
              v27 = *(_DWORD *)(a1 + 56);
              if ( v27 < *(_DWORD *)(a1 + 60) )
              {
                *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v27) = v13;
                *(_DWORD *)(a1 + 56) = v27 + 1;
LABEL_50:
                v10 = *(unsigned __int8 **)(a1 + 24);
                v11 = *v10;
                continue;
              }
            }
LABEL_57:
            *v9 = 0;
            return 0;
          }
          break;
        }
        if ( (unsigned __int8)(v11 - 48) <= 9u
          || (unsigned __int8)(v11 - 97) <= 0x19u
          || v11 == 67
          || v11 == 85
          || v11 == 76 )
        {
          v24 = sub_1FEC8(a1);
          v25 = v24;
          if ( v13 == 0 )
          {
            v13 = v24;
LABEL_45:
            if ( v11 == 83 )
              goto LABEL_50;
            goto LABEL_46;
          }
        }
        else
        {
          if ( v11 != 83 )
          {
            if ( v11 != 73 )
            {
              if ( v11 == 84 )
              {
                v25 = sub_1C704(a1);
                goto LABEL_55;
              }
              if ( v11 != 69 )
              {
                if ( v11 == 77 && v13 != 0 )
                {
                  *(_QWORD *)(a1 + 24) = v10 + 1;
                  v11 = *++v10;
                  continue;
                }
                goto LABEL_57;
              }
              *v9 = v13;
              if ( v13 != 0 )
              {
                if ( v12 != 0 )
                {
                  *(_QWORD *)(v12 + 8) = v40;
                  v40 = v12;
                }
                v36 = *(_BYTE **)(a1 + 24);
                if ( *v36 == 69 )
                {
                  v3 = v40;
                  *(_QWORD *)(a1 + 24) = v36 + 1;
                  return v3;
                }
              }
              return 0;
            }
            if ( v13 == 0 )
              goto LABEL_57;
            v25 = sub_1C8DC(a1);
            v26 = 4;
            goto LABEL_44;
          }
          v25 = sub_1BBC8(a1, 1);
          if ( v13 == 0 )
          {
            v10 = *(unsigned __int8 **)(a1 + 24);
            v13 = v25;
            v11 = *v10;
            continue;
          }
        }
        break;
      }
LABEL_43:
      v26 = 1;
LABEL_44:
      v13 = sub_1B918(a1, v26, v13, v25);
      goto LABEL_45;
    case 'S':
      if ( v1[1] != 116 )
      {
        v7 = sub_1BBC8(a1, 0);
        v3 = v7;
        if ( **(_BYTE **)(a1 + 24) != 73 )
          return v3;
        goto LABEL_10;
      }
      *(_QWORD *)(a1 + 24) = v1 + 2;
      v39 = sub_1B9B8(a1, (__int64)"std", 3);
      v19 = sub_1FEC8(a1);
      v7 = sub_1B918(a1, 1, v39, v19);
      v3 = v7;
      v20 = *(_BYTE **)(a1 + 24);
      *(_DWORD *)(a1 + 80) += 3;
      if ( *v20 != 73 )
        return v3;
      if ( v7 != 0 )
      {
        v21 = *(_DWORD *)(a1 + 56);
        if ( v21 < *(_DWORD *)(a1 + 60) )
        {
          *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v21) = v7;
          *(_DWORD *)(a1 + 56) = v21 + 1;
LABEL_10:
          v37 = v7;
          v8 = sub_1C8DC(a1);
          return sub_1B918(a1, 4, v37, v8);
        }
      }
      return 0;
    case 'U':
      return sub_1FEC8(a1);
    case 'Z':
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v5 = sub_209F8(a1, 0);
      v6 = *(_BYTE **)(a1 + 24);
      if ( *v6 != 69 )
        return 0;
      *(_QWORD *)(a1 + 24) = v6 + 1;
      v14 = (unsigned __int8)v6[1];
      if ( v14 == 115 )
      {
        *(_QWORD *)(a1 + 24) = v6 + 2;
        if ( (unsigned int)sub_1C660(a1) == 0 )
          return 0;
        v16 = sub_1B9B8(a1, (__int64)"string literal", 14);
      }
      else if ( v14 == 100 )
      {
        *(_QWORD *)(a1 + 24) = v6 + 2;
        v30 = sub_1C5D4(a1);
        if ( v30 < 0 )
          return 0;
        v31 = (_DWORD *)sub_2044C(a1);
        v32 = v31;
        if ( v31 != nullptr )
        {
          v33 = *v31;
          if ( v33 != 69 && v33 != 71 && (unsigned int)sub_1C660(a1) == 0 )
            return 0;
        }
        v34 = *(_DWORD *)(a1 + 40);
        v16 = 0;
        if ( v34 < *(_DWORD *)(a1 + 44) )
        {
          v35 = *(_QWORD *)(a1 + 32);
          *(_DWORD *)(a1 + 40) = v34 + 1;
          v16 = v35 + 24LL * v34;
          if ( v16 != 0 )
          {
            *(_DWORD *)(v35 + 24LL * v34) = 70;
            *(_DWORD *)(v16 + 16) = v30;
            *(_QWORD *)(v16 + 8) = v32;
          }
        }
      }
      else
      {
        v15 = (int *)sub_2044C(a1);
        v16 = (__int64)v15;
        if ( v15 != nullptr )
        {
          v17 = *v15;
          if ( v17 != 69 && v17 != 71 )
          {
            v38 = v16;
            v18 = sub_1C660(a1);
            v16 = v38;
            if ( v18 == 0 )
              return 0;
          }
        }
      }
      return sub_1B918(a1, 2, v5, v16);
    default:
      v3 = sub_1FEC8(a1);
      if ( **(_BYTE **)(a1 + 24) != 73 )
        return v3;
      if ( v3 == 0 )
        return 0;
      v22 = *(_DWORD *)(a1 + 56);
      if ( v22 >= *(_DWORD *)(a1 + 60) )
        return 0;
      *(_QWORD *)(*(_QWORD *)(a1 + 48) + 8LL * v22) = v3;
      *(_DWORD *)(a1 + 56) = v22 + 1;
      v23 = sub_1C8DC(a1);
      return sub_1B918(a1, 4, v3, v23);
  }
}


// Address: 0x209F8 | Function: sub_209F8
__int64 __fastcall sub_209F8(__int64 a1, int a2)
{
  unsigned __int8 *v2; // x2
  int v4; // w3
  __int64 v5; // x19
  unsigned __int8 *v6; // x2
  int v7; // w1
  __int64 v8; // x3
  unsigned int v9; // w0
  __int64 v10; // x2
  __int64 i; // x1
  __int64 result; // x0
  int v13; // w1
  int v14; // w0
  __int64 v15; // x3
  unsigned int v16; // w0
  __int64 v17; // x3
  __int64 v18; // x3
  __int64 v19; // x0
  int v20; // w1
  __int64 v21; // x2
  __int64 v22; // x0
  _BYTE *v23; // x1
  _BYTE *v24; // x21
  __int64 v25; // x22
  __int64 v26; // x23
  __int64 v27; // x19
  __int64 v28; // x3
  __int64 v29; // x2
  int v30; // w0
  __int64 v31; // x3
  __int64 v32; // x19
  __int64 v33; // x2
  __int64 v34; // x2
  __int64 v35; // x2
  __int64 v36; // x2
  __int64 v37; // x2
  __int64 v38; // x2
  __int64 v39; // x2
  __int64 v40; // x2
  __int64 v41; // x2
  __int64 v42; // x2
  __int64 v43; // x19
  _BYTE *v44; // x0
  __int64 v45; // x2
  __int64 v46; // x2
  __int64 v47; // x2
  __int64 v48; // x2
  int v49; // w0
  int v50; // w3
  __int64 v51; // x2
  __int64 v52; // x1
  __int64 v53; // x2
  __int64 v55; // [xsp+48h] [xbp+48h]
  __int64 v56; // [xsp+48h] [xbp+48h]

  v2 = *(unsigned __int8 **)(a1 + 24);
  v4 = *v2;
  if ( v4 == 84 || v4 == 71 )
  {
    v13 = *(_DWORD *)(a1 + 80);
    *(_DWORD *)(a1 + 80) = v13 + 20;
    v14 = *v2;
    if ( v14 == 84 )
    {
      *(_QWORD *)(a1 + 24) = v2 + 1;
      if ( v2[1] != 0 )
      {
        *(_QWORD *)(a1 + 24) = v2 + 2;
        switch ( v2[1] )
        {
          case 'C':
            v43 = sub_1E51C(a1);
            if ( sub_1BFCC((unsigned __int8 **)(a1 + 24)) < 0 )
              return 0;
            v44 = *(_BYTE **)(a1 + 24);
            if ( *v44 != 95 )
              return 0;
            *(_QWORD *)(a1 + 24) = v44 + 1;
            v45 = sub_1E51C(a1);
            *(_DWORD *)(a1 + 80) += 5;
            result = sub_1B918(a1, 11, v45, v43);
            break;
          case 'F':
            v42 = sub_1E51C(a1);
            result = sub_1B918(a1, 14, v42, 0);
            break;
          case 'H':
            v41 = sub_2044C(a1);
            result = sub_1B918(a1, 20, v41, 0);
            break;
          case 'I':
            v40 = sub_1E51C(a1);
            result = sub_1B918(a1, 12, v40, 0);
            break;
          case 'J':
            v39 = sub_1E51C(a1);
            result = sub_1B918(a1, 18, v39, 0);
            break;
          case 'S':
            v38 = sub_1E51C(a1);
            result = sub_1B918(a1, 13, v38, 0);
            break;
          case 'T':
            *(_DWORD *)(a1 + 80) = v13 + 10;
            v37 = sub_1E51C(a1);
            result = sub_1B918(a1, 10, v37, 0);
            break;
          case 'V':
            *(_DWORD *)(a1 + 80) = v13 + 15;
            v36 = sub_1E51C(a1);
            result = sub_1B918(a1, 9, v36, 0);
            break;
          case 'W':
            v47 = sub_2044C(a1);
            result = sub_1B918(a1, 21, v47, 0);
            break;
          case 'c':
            if ( (unsigned int)sub_1C7F0(a1, 0) == 0 || (unsigned int)sub_1C7F0(a1, 0) == 0 )
              return 0;
            v46 = sub_209F8(a1, 0);
            result = sub_1B918(a1, 17, v46, 0);
            break;
          case 'h':
            if ( (unsigned int)sub_1C7F0(a1, 104) == 0 )
              return 0;
            v48 = sub_209F8(a1, 0);
            result = sub_1B918(a1, 15, v48, 0);
            break;
          case 'v':
            if ( (unsigned int)sub_1C7F0(a1, 118) == 0 )
              return 0;
            v35 = sub_209F8(a1, 0);
            result = sub_1B918(a1, 16, v35, 0);
            break;
          default:
            return 0;
        }
        return result;
      }
    }
    else if ( v14 == 71 )
    {
      *(_QWORD *)(a1 + 24) = v2 + 1;
      if ( v2[1] != 0 )
      {
        *(_QWORD *)(a1 + 24) = v2 + 2;
        switch ( v2[1] )
        {
          case 'A':
            v33 = sub_209F8(a1, 0);
            return sub_1B918(a1, 23, v33, 0);
          case 'R':
            v21 = sub_2044C(a1);
            v30 = *(_DWORD *)(a1 + 40);
            if ( v30 < *(_DWORD *)(a1 + 44)
              && (v31 = *(_QWORD *)(a1 + 32), *(_DWORD *)(a1 + 40) = v30 + 1, (v32 = v31 + 24LL * v30) != 0) )
            {
              *(_DWORD *)(v31 + 24LL * v30) = 65;
              v56 = v21;
              *(_QWORD *)(v32 + 8) = sub_1BFCC((unsigned __int8 **)(a1 + 24));
              v21 = v56;
              v18 = v32;
            }
            else
            {
              v18 = 0;
            }
            v19 = a1;
            v20 = 22;
            return sub_1B918(v19, v20, v21, v18);
          case 'T':
            if ( v2[2] != 0 && (*(_QWORD *)(a1 + 24) = v2 + 3, v2[2] == 110) )
            {
              v34 = sub_209F8(a1, 0);
              return sub_1B918(a1, 73, v34, 0);
            }
            else
            {
              v53 = sub_209F8(a1, 0);
              return sub_1B918(a1, 72, v53, 0);
            }
          case 'V':
            v29 = sub_2044C(a1);
            return sub_1B918(a1, 19, v29, 0);
          case 'r':
            v22 = sub_1BFCC((unsigned __int8 **)(a1 + 24));
            if ( v22 <= 1 )
              return 0;
            v23 = *(_BYTE **)(a1 + 24);
            if ( *v23 == 0 )
              return 0;
            v24 = v23 + 1;
            *(_QWORD *)(a1 + 24) = v23 + 1;
            if ( *v23 != 95 )
              return 0;
            v25 = v22 - 1;
            v26 = 0;
            break;
          default:
            return 0;
        }
        while ( *v24 != 0 )
        {
          v27 = 0;
          if ( *v24 == 36 )
          {
            v49 = (unsigned __int8)v24[1];
            switch ( v49 )
            {
              case 'S':
                v49 = 47;
                break;
              case '_':
                v49 = 46;
                break;
              case '$':
                break;
              default:
                return 0;
            }
            v50 = *(_DWORD *)(a1 + 40);
            if ( v50 >= *(_DWORD *)(a1 + 44)
              || (v51 = *(_QWORD *)(a1 + 32),
                  v52 = 24LL * v50,
                  *(_DWORD *)(a1 + 40) = v50 + 1,
                  v28 = v51 + v52,
                  v51 + v52 == 0) )
            {
              *(_QWORD *)(a1 + 24) += 2LL;
              return 0;
            }
            *(_DWORD *)(v51 + v52) = 64;
            v25 -= 2;
            *(_DWORD *)(v28 + 8) = v49;
            v24 = (_BYTE *)(*(_QWORD *)(a1 + 24) + 2LL);
            *(_QWORD *)(a1 + 24) = v24;
          }
          else
          {
            do
              ++v27;
            while ( v25 > v27 && v24[v27] != 0 && v24[v27] != 36 );
            v25 -= v27;
            v28 = sub_1B9B8(a1, (__int64)v24, v27);
            v24 = (_BYTE *)(*(_QWORD *)(a1 + 24) + v27);
            *(_QWORD *)(a1 + 24) = v24;
            if ( v28 == 0 )
              return 0;
          }
          if ( v26 != 0 )
          {
            v26 = sub_1B918(a1, 63, v26, v28);
            if ( v26 == 0 )
              return 0;
          }
          else
          {
            v26 = v28;
          }
          if ( v25 <= 0 )
            return sub_1B918(a1, 62, v26, 0);
        }
      }
    }
    return 0;
  }
  v5 = sub_2044C(a1);
  if ( v5 != 0 && a2 != 0 && (*(_DWORD *)(a1 + 16) & 1) == 0 )
  {
    while ( (unsigned int)(*(_DWORD *)v5 - 28) <= 4 )
      v5 = *(_QWORD *)(v5 + 8);
    if ( *(_DWORD *)v5 == 2 )
    {
      for ( i = *(_QWORD *)(v5 + 16); (unsigned int)(*(_DWORD *)i - 28) <= 4; i = *(_QWORD *)(i + 8) )
        ;
      *(_QWORD *)(v5 + 16) = i;
    }
    return v5;
  }
  v6 = *(unsigned __int8 **)(a1 + 24);
  v7 = *v6;
  if ( v7 == 69 || v7 == 0 || v5 == 0 )
    return v5;
  v8 = v5;
  while ( 1 )
  {
    v9 = *(_DWORD *)v8;
    if ( *(_DWORD *)v8 == 4 )
      break;
    if ( v9 >= 4 && v9 - 28 <= 4 )
    {
      v8 = *(_QWORD *)(v8 + 8);
      if ( v8 != 0 )
        continue;
    }
    goto LABEL_13;
  }
  v15 = *(_QWORD *)(v8 + 8);
  if ( v15 != 0 )
  {
    while ( 1 )
    {
      v16 = *(_DWORD *)v15;
      if ( *(_DWORD *)v15 > 8u )
        break;
      if ( v16 >= 7 )
        goto LABEL_13;
      if ( v16 - 1 <= 1 )
      {
        v15 = *(_QWORD *)(v15 + 16);
        if ( v15 != 0 )
          continue;
      }
      goto LABEL_30;
    }
    if ( v16 == 52 )
    {
LABEL_13:
      if ( v7 != 74 )
      {
        v10 = 0;
        goto LABEL_32;
      }
      goto LABEL_83;
    }
  }
LABEL_30:
  if ( v7 == 74 )
LABEL_83:
    *(_QWORD *)(a1 + 24) = v6 + 1;
  v10 = sub_1E51C(a1);
  if ( v10 != 0 )
  {
LABEL_32:
    v55 = v10;
    v17 = sub_1FBC4(a1);
    if ( v17 != 0 )
    {
      v18 = sub_1B918(a1, 41, v55, v17);
      goto LABEL_34;
    }
  }
  v18 = 0;
LABEL_34:
  v19 = a1;
  v20 = 3;
  v21 = v5;
  return sub_1B918(v19, v20, v21, v18);
}


// Address: 0x210BC | Function: sub_210BC
__int64 __fastcall sub_210BC(__int64 a1)
{
  _BYTE *v1; // x3
  __int64 result; // x0
  unsigned __int8 *v4; // x2
  int v5; // w1
  __int64 v6; // x0
  __int64 v7; // x20
  unsigned __int8 *v8; // x1
  int v9; // w21
  int v10; // w0
  unsigned __int8 *i; // x2
  int v12; // w0
  int v13; // w2
  __int64 v14; // x0
  __int64 v15; // x0

  v1 = *(_BYTE **)(a1 + 24);
  if ( *v1 != 76 )
    return 0;
  v4 = v1 + 1;
  *(_QWORD *)(a1 + 24) = v1 + 1;
  v5 = (unsigned __int8)v1[1];
  if ( v5 != 90 )
  {
    if ( v5 != 95 )
    {
      v6 = sub_1E51C(a1);
      v7 = v6;
      if ( v6 != 0 )
      {
        if ( *(_DWORD *)v6 == 39 )
        {
          v15 = *(_QWORD *)(v6 + 8);
          if ( *(_DWORD *)(v15 + 28) != 0 )
            *(_DWORD *)(a1 + 80) -= *(_DWORD *)(v15 + 8);
        }
        v8 = *(unsigned __int8 **)(a1 + 24);
        v9 = 60;
        v10 = *v8;
        if ( v10 == 110 )
        {
          *(_QWORD *)(a1 + 24) = v8 + 1;
          v9 = 61;
          v10 = *++v8;
        }
        if ( v10 == 69 )
        {
          v13 = 0;
LABEL_15:
          v14 = sub_1B9B8(a1, (__int64)v8, v13);
          result = sub_1B918(a1, v9, v7, v14);
          v4 = *(unsigned __int8 **)(a1 + 24);
          v5 = *v4;
          goto LABEL_16;
        }
        if ( v10 != 0 )
        {
          for ( i = v8 + 1; ; ++i )
          {
            *(_QWORD *)(a1 + 24) = i;
            v12 = *i;
            if ( v12 == 69 )
              break;
            if ( v12 == 0 )
              return 0;
          }
          v13 = (_DWORD)i - (_DWORD)v8;
          goto LABEL_15;
        }
      }
      return 0;
    }
    v4 = v1 + 2;
    *(_QWORD *)(a1 + 24) = v1 + 2;
    v5 = (unsigned __int8)v1[2];
  }
  result = 0;
  if ( v5 == 90 )
  {
    *(_QWORD *)(a1 + 24) = v4 + 1;
    result = sub_209F8(a1, 0);
    v4 = *(unsigned __int8 **)(a1 + 24);
    v5 = *v4;
  }
LABEL_16:
  if ( v5 != 69 )
    return 0;
  *(_QWORD *)(a1 + 24) = v4 + 1;
  return result;
}


// Address: 0x21234 | Function: sub_21234
__int64 __fastcall sub_21234(__int64 a1)
{
  unsigned __int8 *v1; // x3
  int v3; // w1
  __int64 result; // x0
  int *v5; // x0
  __int64 v6; // x20
  int v7; // w0
  _BYTE *v8; // x0
  __int64 v9; // x3
  __int64 v10; // x0
  int v11; // w1
  __int64 v12; // x2
  int v13; // w0
  __int64 v14; // x4
  int v15; // w0
  __int64 v16; // x2
  __int64 v17; // x1
  int v18; // w1
  const char **v19; // x22
  const char *v20; // x21
  const char *v21; // x0
  __int64 v22; // x2
  __int64 v23; // x20
  int v24; // w0
  __int64 v25; // x21
  __int64 v26; // x2
  unsigned __int8 *v27; // x0
  int v28; // w1
  __int64 v29; // x3
  __int64 v30; // x0
  __int64 v31; // x3
  char *v32; // x0
  __int64 v33; // x22
  __int64 v34; // x3
  __int64 v35; // x3
  int v36; // w0
  _BYTE *v37; // x0
  __int64 v38; // x0
  char v39; // w0
  __int64 v40; // x0
  __int64 v41; // x0
  __int64 v42; // [xsp+38h] [xbp+38h]
  __int64 v43; // [xsp+38h] [xbp+38h]
  __int64 v44; // [xsp+38h] [xbp+38h]
  __int64 v45; // [xsp+38h] [xbp+38h]
  __int64 v46; // [xsp+38h] [xbp+38h]
  __int64 v47; // [xsp+38h] [xbp+38h]
  __int64 v48; // [xsp+38h] [xbp+38h]

  v1 = *(unsigned __int8 **)(a1 + 24);
  v3 = *v1;
  switch ( v3 )
  {
    case 'L':
      return sub_210BC(a1);
    case 'T':
      return sub_1C704(a1);
    case 's':
      v18 = v1[1];
      if ( v18 == 114 )
      {
        *(_QWORD *)(a1 + 24) = v1 + 2;
        v23 = sub_1E51C(a1);
        v9 = sub_1FEC8(a1);
        if ( **(_BYTE **)(a1 + 24) == 73 )
        {
          v46 = v9;
          v40 = sub_1C8DC(a1);
          v9 = sub_1B918(a1, 4, v46, v40);
        }
        v10 = a1;
        v11 = 1;
        v12 = v23;
        return sub_1B918(v10, v11, v12, v9);
      }
      if ( v18 == 112 )
      {
        *(_QWORD *)(a1 + 24) = v1 + 2;
        v12 = sub_21234(a1);
        v11 = 74;
        v10 = a1;
        v9 = 0;
        return sub_1B918(v10, v11, v12, v9);
      }
      goto LABEL_12;
    default:
      break;
  }
  if ( v3 != 102 )
  {
    if ( (unsigned __int8)(v3 - 48) <= 9u )
      goto LABEL_6;
    if ( v3 == 111 )
    {
      if ( v1[1] == 110 )
      {
        *(_QWORD *)(a1 + 24) = v1 + 2;
LABEL_6:
        result = sub_1FEC8(a1);
        if ( result != 0 )
        {
          if ( **(_BYTE **)(a1 + 24) != 73 )
            return result;
          v43 = result;
          v9 = sub_1C8DC(a1);
          v11 = 4;
          v10 = a1;
          v12 = v43;
          return sub_1B918(v10, v11, v12, v9);
        }
        return 0;
      }
    }
    else if ( (v3 == 116 || v3 == 105) && v1[1] == 108 )
    {
      v22 = 0;
      if ( v3 == 116 )
      {
        v22 = sub_1E51C(a1);
        v1 = *(unsigned __int8 **)(a1 + 24);
      }
      *(_QWORD *)(a1 + 24) = v1 + 2;
      v42 = v22;
      v9 = sub_1DDC8(a1, 0x45u);
      v12 = v42;
      v10 = a1;
      v11 = 48;
      return sub_1B918(v10, v11, v12, v9);
    }
LABEL_12:
    v5 = (int *)sub_1FCD4(a1);
    v6 = (__int64)v5;
    if ( v5 != nullptr )
    {
      v7 = *v5;
      switch ( v7 )
      {
        case '1':
          v19 = *(const char ***)(v6 + 8);
          v20 = *v19;
          v21 = *v19;
          *(_DWORD *)(a1 + 80) += *((_DWORD *)v19 + 4) - 2;
          if ( strcmp(v21, "st") != 0 )
          {
            switch ( *((_DWORD *)v19 + 5) )
            {
              case 0:
LABEL_46:
                v10 = a1;
                v11 = 53;
                v12 = v6;
                v9 = 0;
                return sub_1B918(v10, v11, v12, v9);
              case 1:
                v36 = *(unsigned __int8 *)v20;
                if ( v36 != 109 && v36 != 112 || *((unsigned __int8 *)v20 + 1) != v36 )
                  goto LABEL_17;
                v37 = *(_BYTE **)(a1 + 24);
                if ( *v37 != 95 )
                {
                  v38 = sub_21234(a1);
                  v9 = sub_1B918(a1, 56, v38, v38);
                  goto LABEL_18;
                }
                *(_QWORD *)(a1 + 24) = v37 + 1;
                goto LABEL_17;
              case 2:
LABEL_59:
                v32 = **(char ***)(v6 + 8);
                if ( v32[1] == 99 && ((unsigned __int8)((v39 = *v32) - 114) <= 1u || (unsigned __int8)(v39 - 99) <= 1u) )
                  v33 = sub_1E51C(a1);
                else
                  v33 = sub_21234(a1);
                if ( strcmp(v20, "cl") == 0 )
                {
                  v34 = sub_1DDC8(a1, 0x45u);
                }
                else if ( strcmp(v20, "dt") == 0 || strcmp(v20, "pt") == 0 )
                {
                  v34 = sub_1FEC8(a1);
                  if ( **(_BYTE **)(a1 + 24) == 73 )
                  {
                    v47 = v34;
                    v41 = sub_1C8DC(a1);
                    v34 = sub_1B918(a1, 4, v47, v41);
                  }
                }
                else
                {
                  v34 = sub_21234(a1);
                }
                v35 = sub_1B918(a1, 56, v33, v34);
                return sub_1B918(a1, 55, v6, v35);
              case 3:
LABEL_48:
                if ( strcmp(v20, "qu") == 0 )
                {
                  v25 = sub_21234(a1);
                  v45 = sub_21234(a1);
                  v29 = sub_21234(a1);
                  v26 = v45;
                }
                else
                {
                  if ( *v20 != 110 )
                    return 0;
                  v24 = *((unsigned __int8 *)v20 + 1);
                  if ( v24 != 97 && v24 != 119 )
                    return 0;
                  v25 = sub_1DDC8(a1, 0x5Fu);
                  v26 = sub_1E51C(a1);
                  v27 = *(unsigned __int8 **)(a1 + 24);
                  v28 = *v27;
                  if ( v28 == 69 )
                  {
                    v29 = 0;
                    *(_QWORD *)(a1 + 24) = v27 + 1;
                  }
                  else if ( v28 == 112 )
                  {
                    if ( v27[1] != 105 )
                      return 0;
                    *(_QWORD *)(a1 + 24) = v27 + 2;
                    v48 = v26;
                    v29 = sub_1DDC8(a1, 0x45u);
                    v26 = v48;
                  }
                  else
                  {
                    v44 = v26;
                    if ( v28 != 105 || v27[1] != 108 )
                      return 0;
                    v29 = sub_21234(a1);
                    v26 = v44;
                  }
                }
                v30 = sub_1B918(a1, 59, v26, v29);
                v31 = sub_1B918(a1, 58, v25, v30);
                return sub_1B918(a1, 57, v6, v31);
              default:
                return 0;
            }
          }
          v9 = sub_1E51C(a1);
          break;
        case '2':
          switch ( *(_DWORD *)(v6 + 8) )
          {
            case 0:
              goto LABEL_46;
            case 1:
              goto LABEL_17;
            case 2:
              v20 = nullptr;
              goto LABEL_59;
            case 3:
              v20 = nullptr;
              goto LABEL_48;
            default:
              return 0;
          }
        case '3':
          v8 = *(_BYTE **)(a1 + 24);
          if ( *v8 == 95 )
          {
            *(_QWORD *)(a1 + 24) = v8 + 1;
            v9 = sub_1DDC8(a1, 0x45u);
          }
          else
          {
LABEL_17:
            v9 = sub_21234(a1);
          }
          break;
        default:
          return 0;
      }
LABEL_18:
      v10 = a1;
      v11 = 54;
      v12 = v6;
      return sub_1B918(v10, v11, v12, v9);
    }
    return 0;
  }
  if ( v1[1] != 112 )
    goto LABEL_12;
  *(_QWORD *)(a1 + 24) = v1 + 2;
  if ( v1[2] == 84 )
  {
    v14 = 0;
    *(_QWORD *)(a1 + 24) = v1 + 3;
  }
  else
  {
    v13 = sub_1C5D4(a1) + 1;
    v14 = v13;
    if ( v13 == 0 )
      return 0;
  }
  v15 = *(_DWORD *)(a1 + 40);
  if ( v15 >= *(_DWORD *)(a1 + 44) )
    return 0;
  v16 = *(_QWORD *)(a1 + 32);
  v17 = 24LL * v15;
  *(_DWORD *)(a1 + 40) = v15 + 1;
  result = 0;
  if ( v16 + v17 != 0 )
  {
    *(_DWORD *)(v16 + v17) = 6;
    *(_QWORD *)(v16 + v17 + 8) = v14;
    return v16 + v17;
  }
  return result;
}


// Address: 0x2189C | Function: sub_2189C
__int64 __fastcall sub_2189C(__int64 a1)
{
  _BYTE *v1; // x1
  _BYTE *v3; // x2
  int v4; // w3
  __int64 v6; // x0
  __int64 v7; // x3
  __int64 v8; // x2
  _BYTE *v9; // x3
  int v10; // w1
  int v11; // w1
  int v12; // w0
  __int64 v13; // [xsp+28h] [xbp+28h]

  v1 = *(_BYTE **)(a1 + 24);
  if ( *v1 != 70 )
    return 0;
  v3 = v1 + 1;
  *(_QWORD *)(a1 + 24) = v1 + 1;
  v4 = (unsigned __int8)v1[1];
  if ( v4 == 89 )
  {
    v3 = v1 + 2;
    *(_QWORD *)(a1 + 24) = v1 + 2;
    if ( v1[2] != 74 )
      goto LABEL_5;
LABEL_16:
    *(_QWORD *)(a1 + 24) = v3 + 1;
    goto LABEL_5;
  }
  if ( v4 == 74 )
    goto LABEL_16;
LABEL_5:
  v6 = sub_1E51C(a1);
  if ( v6 != 0 && (v13 = v6, (v7 = sub_1FBC4(a1)) != 0) )
    v8 = sub_1B918(a1, 41, v13, v7);
  else
    v8 = 0;
  v9 = *(_BYTE **)(a1 + 24);
  v10 = (unsigned __int8)*v9;
  if ( v10 == 79 )
  {
    v11 = 32;
    v12 = *(_DWORD *)(a1 + 80) + 3;
    goto LABEL_13;
  }
  if ( v10 == 82 )
  {
    v11 = 31;
    v12 = *(_DWORD *)(a1 + 80) + 2;
LABEL_13:
    *(_DWORD *)(a1 + 80) = v12;
    *(_QWORD *)(a1 + 24) = v9 + 1;
    v8 = sub_1B918(a1, v11, v8, 0);
    v9 = *(_BYTE **)(a1 + 24);
    if ( *v9 == 69 )
      goto LABEL_11;
    return 0;
  }
  if ( v10 != 69 )
    return 0;
LABEL_11:
  *(_QWORD *)(a1 + 24) = v9 + 1;
  return v8;
}


// Address: 0x219CC | Function: sub_219CC
__int64 __fastcall sub_219CC(__int64 a1)
{
  unsigned __int8 *v1; // x5
  int v3; // w1
  __int64 v4; // x3
  __int64 v5; // x2
  int v6; // w4
  __int64 v7; // x6
  __int64 v8; // x7
  unsigned __int8 *v9; // x1
  __int64 v10; // x0
  __int64 v11; // x0
  char v12; // t1
  __int64 v14; // x0
  unsigned __int8 *v15; // x3
  int v16; // w20
  int v17; // w1
  __int64 v18; // x2
  __int64 v19; // x0
  int v20; // w1
  __int64 v21; // x0
  __int64 v22; // x21
  int v23; // w22
  unsigned __int8 *v24; // x0
  int v25; // w1
  int v26; // w22
  int *v27; // x0
  __int64 v28; // x24
  int v29; // w0
  _BYTE *v30; // x0
  __int64 v31; // x3
  __int64 v32; // x23
  __int64 v33; // x0
  __int64 v34; // x0
  int v35; // w2
  __int64 v36; // x3
  __int64 v37; // x1
  __int64 v38; // x0
  const char *v39; // x23
  int v40; // w0
  __int64 v41; // x22
  __int64 v42; // x25
  unsigned __int8 *v43; // x0
  int v44; // w1
  __int64 v45; // x23
  __int64 v46; // x0
  __int64 v47; // x0
  char *v48; // x0
  unsigned __int8 *v49; // x0
  int v50; // w1
  int *v51; // x0
  __int64 v52; // x22
  int v53; // w0
  _BYTE *v54; // x0
  __int64 v55; // x3
  __int64 v56; // x22
  __int64 v57; // x23
  __int64 v58; // x0
  const char **v59; // x24
  const char *v60; // x0
  int v61; // w0
  __int64 v62; // x22
  __int64 v63; // x23
  __int64 v64; // x0
  __int64 v65; // x0
  char v66; // w0
  unsigned __int8 *v67; // x0
  int v68; // w1
  int *v69; // x0
  int v70; // w0
  _BYTE *v71; // x0
  __int64 v72; // x3
  __int64 v73; // x0
  int v74; // w1
  unsigned __int8 *v75; // x0
  int v76; // w1
  int *v77; // x0
  __int64 v78; // x23
  int v79; // w0
  _BYTE *v80; // x0
  __int64 v81; // x3
  __int64 v82; // x0
  int v83; // w1
  unsigned __int8 *v84; // x0
  int v85; // w1
  int *v86; // x0
  __int64 v87; // x26
  int v88; // w0
  _BYTE *v89; // x0
  __int64 v90; // x3
  __int64 v91; // x0
  __int64 v92; // x0
  int v93; // w1
  __int64 v94; // x0
  int v95; // w1
  int v96; // w0
  __int64 v97; // x2
  __int64 v98; // x0
  __int64 v99; // x0
  __int64 v100; // x0
  __int64 v101; // x0
  __int64 v102; // x0
  unsigned __int8 *v103; // x22
  int v104; // w0
  int v105; // w1
  __int64 v106; // x2
  __int64 v107; // x1
  int v108; // w1
  __int64 v109; // x0
  unsigned __int8 *v110; // x1
  int v111; // w0
  int v112; // w1
  __int64 v113; // x2
  __int64 v114; // x1
  int v115; // w1
  __int64 v116; // x0
  int v117; // w0
  int v118; // w0
  __int64 v119; // x2
  __int64 v120; // x0
  unsigned __int8 *v121; // x1
  int v122; // w1
  __int64 v123; // x2
  __int64 v124; // x1
  int v125; // w1
  __int64 v126; // x2
  int v127; // w1
  __int64 v128; // x0
  unsigned __int8 *v129; // x1
  int v130; // w1
  __int64 v131; // x2
  __int64 v132; // x1
  int v133; // w1
  __int64 v134; // x2
  int v135; // w1
  __int64 v136; // x0
  const char **v137; // x23
  const char *v138; // x25
  const char *v139; // x0
  int v140; // w1
  int v141; // w0
  char *v142; // x0
  __int64 v143; // x26
  __int64 v144; // x23
  __int64 v145; // x0
  __int64 v146; // x0
  int v147; // w0
  __int64 v148; // x25
  __int64 v149; // x26
  unsigned __int8 *v150; // x0
  int v151; // w1
  __int64 v152; // x0
  __int64 v153; // x0
  __int64 v154; // x0
  const char **v155; // x24
  const char *v156; // x25
  const char *v157; // x0
  __int64 v158; // x2
  __int64 v159; // x0
  __int64 v160; // x0
  char v161; // w0
  int v162; // w0
  _BYTE *v163; // x0
  __int64 v164; // x0
  __int64 v165; // x0
  const char **v166; // x3
  const char *v167; // x27
  const char *v168; // x0
  char *v169; // x0
  __int64 v170; // x24
  __int64 v171; // x23
  __int64 v172; // x0
  __int64 v173; // x0
  char v174; // w0
  int v175; // w0
  _BYTE *v176; // x0
  __int64 v177; // x0
  int v178; // w0
  __int64 v179; // x24
  __int64 v180; // x27
  unsigned __int8 *v181; // x0
  int v182; // w1
  __int64 v183; // x0
  __int64 v184; // x0
  __int64 v185; // x0
  unsigned __int8 *v186; // x1
  __int64 v187; // x25
  __int64 v188; // x0
  __int64 v189; // x2
  __int64 v190; // x0
  __int64 v191; // x2
  __int64 v192; // x0
  __int64 v193; // x23
  __int64 v194; // x0
  __int64 v195; // x23
  __int64 v196; // x24
  __int64 v197; // x0
  __int64 v198; // x0
  __int64 v199; // x23
  __int64 v200; // x24
  const char *v201; // x23
  char *v202; // x0
  __int64 v203; // x25
  __int64 v204; // x23
  __int64 v205; // x0
  char v206; // w0
  int v207; // w0
  __int64 v208; // x23
  __int64 v209; // x25
  __int64 v210; // x0
  __int64 v211; // x0
  unsigned __int8 *v212; // x1
  __int64 v213; // x0
  __int64 v214; // x0
  const char **v215; // x3
  const char *v216; // x0
  __int64 v217; // x2
  __int64 v218; // x0
  const char *v219; // x25
  char *v220; // x0
  __int64 v221; // x26
  __int64 v222; // x25
  __int64 v223; // x0
  char v224; // w0
  int v225; // w0
  __int64 v226; // x25
  __int64 v227; // x26
  __int64 v228; // x0
  __int64 v229; // x0
  unsigned __int8 *v230; // x1
  int v231; // w0
  _BYTE *v232; // x0
  __int64 v233; // x0
  __int64 v234; // x22
  __int64 v235; // x25
  __int64 v236; // x0
  __int64 v237; // x0
  __int64 v238; // x0
  unsigned __int8 *v239; // x1
  char *v240; // x0
  __int64 v241; // x26
  __int64 v242; // x25
  __int64 v243; // x0
  __int64 v244; // x0
  char v245; // w0
  int v246; // w0
  __int64 v247; // x25
  __int64 v248; // x24
  unsigned __int8 *v249; // x0
  int v250; // w1
  __int64 v251; // x0
  __int64 v252; // x0
  __int64 v253; // x0
  unsigned __int8 *v254; // x1
  int v255; // w0
  _BYTE *v256; // x0
  __int64 v257; // x0
  const char **v258; // x3
  const char *v259; // x0
  int v260; // w0
  _BYTE *v261; // x0
  __int64 v262; // x0
  __int64 v263; // [xsp+68h] [xbp+68h]
  __int64 v264; // [xsp+68h] [xbp+68h]
  __int64 v265; // [xsp+68h] [xbp+68h]
  __int64 v266; // [xsp+68h] [xbp+68h]
  __int64 v267; // [xsp+68h] [xbp+68h]
  __int64 v268; // [xsp+68h] [xbp+68h]
  __int64 v269; // [xsp+68h] [xbp+68h]
  __int64 v270; // [xsp+68h] [xbp+68h]

  v1 = *(unsigned __int8 **)(a1 + 24);
  if ( *v1 != 95 )
  {
    v3 = *(_DWORD *)(a1 + 40);
    if ( v3 >= *(_DWORD *)(a1 + 44) )
      return 0;
    v4 = *(_QWORD *)(a1 + 32);
    *(_DWORD *)(a1 + 40) = v3 + 1;
    v5 = v4 + 24LL * v3;
    if ( v5 == 0 )
      return 0;
    *(_DWORD *)(v4 + 24LL * v3) = 65;
    v6 = *v1;
    if ( v6 == 110 )
    {
      *(_QWORD *)(a1 + 24) = v1 + 1;
      v7 = -1;
      v8 = 1;
      LOBYTE(v6) = *++v1;
    }
    else
    {
      v7 = 0;
      v8 = 0;
    }
    v9 = v1 + 1;
    v10 = 0;
    if ( (unsigned __int8)(v6 - 48) <= 9u )
    {
      do
      {
        *(_QWORD *)(a1 + 24) = v9;
        v1 = v9;
        v11 = 10 * v10 + (unsigned __int8)v6;
        v12 = *v9++;
        LOBYTE(v6) = v12;
        v10 = v11 - 48;
      }
      while ( (unsigned __int8)(v12 - 48) <= 9u );
    }
    *(_QWORD *)(v5 + 8) = v8 + (v10 ^ v7);
    goto LABEL_9;
  }
  v15 = v1 + 1;
  v16 = *(_DWORD *)(a1 + 84);
  *(_QWORD *)(a1 + 24) = v1 + 1;
  *(_DWORD *)(a1 + 84) = 1;
  v17 = v1[1];
  switch ( v17 )
  {
    case 'L':
      v5 = sub_210BC(a1);
      goto LABEL_23;
    case 'T':
      v5 = sub_1C704(a1);
      goto LABEL_23;
    case 's':
      v20 = v1[2];
      if ( v20 == 114 )
      {
        *(_QWORD *)(a1 + 24) = v1 + 3;
        v62 = sub_1E51C(a1);
        v63 = sub_1FEC8(a1);
        if ( **(_BYTE **)(a1 + 24) == 73 )
        {
          v91 = sub_1C8DC(a1);
          v92 = sub_1B918(a1, 4, v63, v91);
          v5 = sub_1B918(a1, 1, v62, v92);
        }
        else
        {
          v5 = sub_1B918(a1, 1, v62, v63);
        }
        goto LABEL_23;
      }
      if ( v20 == 112 )
      {
        *(_QWORD *)(a1 + 24) = v1 + 3;
        v64 = sub_21234(a1);
        v5 = sub_1B918(a1, 74, v64, 0);
        goto LABEL_23;
      }
      break;
    case 'f':
      if ( v1[2] == 112 )
      {
        *(_QWORD *)(a1 + 24) = v1 + 3;
        if ( v1[3] == 84 )
        {
          v34 = 0;
          *(_QWORD *)(a1 + 24) = v1 + 4;
        }
        else
        {
          LODWORD(v34) = sub_1C5D4(a1) + 1;
          if ( (_DWORD)v34 == 0 )
            goto LABEL_106;
          v34 = (int)v34;
        }
        v35 = *(_DWORD *)(a1 + 40);
        if ( v35 < *(_DWORD *)(a1 + 44) )
        {
          v36 = *(_QWORD *)(a1 + 32);
          v37 = 24LL * v35;
          *(_DWORD *)(a1 + 40) = v35 + 1;
          v5 = v36 + v37;
          if ( v36 + v37 != 0 )
          {
            *(_DWORD *)(v36 + v37) = 6;
            *(_QWORD *)(v5 + 8) = v34;
            *(_DWORD *)(a1 + 84) = v16;
            v1 = *(unsigned __int8 **)(a1 + 24);
            goto LABEL_9;
          }
        }
LABEL_106:
        *(_DWORD *)(a1 + 84) = v16;
        return 0;
      }
      break;
    default:
      if ( (unsigned __int8)(v17 - 48) > 9u )
      {
        if ( v17 != 111 )
        {
          if ( (v17 == 116 || v17 == 105) && v1[2] == 108 )
          {
            v18 = 0;
            if ( v17 == 116 )
            {
              v18 = sub_1E51C(a1);
              v15 = *(unsigned __int8 **)(a1 + 24);
            }
            *(_QWORD *)(a1 + 24) = v15 + 2;
            v264 = v18;
            v19 = sub_1DDC8(a1, 0x45u);
            v5 = sub_1B918(a1, 48, v264, v19);
            goto LABEL_23;
          }
          break;
        }
        if ( v1[2] != 110 )
          break;
        *(_QWORD *)(a1 + 24) = v1 + 3;
      }
      v5 = sub_1FEC8(a1);
      if ( v5 != 0 )
      {
        v1 = *(unsigned __int8 **)(a1 + 24);
        if ( *v1 != 73 )
        {
          *(_DWORD *)(a1 + 84) = v16;
          goto LABEL_9;
        }
        v265 = v5;
        v38 = sub_1C8DC(a1);
        v5 = sub_1B918(a1, 4, v265, v38);
        goto LABEL_23;
      }
      goto LABEL_106;
  }
  v21 = sub_1FCD4(a1);
  v22 = v21;
  if ( v21 == 0 )
    goto LABEL_106;
  v23 = *(_DWORD *)v21;
  if ( *(_DWORD *)v21 == 49 )
  {
    v59 = *(const char ***)(v21 + 8);
    v39 = *v59;
    v60 = *v59;
    *(_DWORD *)(a1 + 80) += *((_DWORD *)v59 + 4) - 2;
    if ( strcmp(v60, "st") == 0 )
    {
      v33 = sub_1E51C(a1);
      goto LABEL_52;
    }
    switch ( *((_DWORD *)v59 + 5) )
    {
      case 0:
LABEL_66:
        v5 = sub_1B918(a1, 53, v22, 0);
        goto LABEL_23;
      case 1:
        v61 = *(unsigned __int8 *)v39;
        if ( v61 != 109 && v61 != 112 || *((unsigned __int8 *)v39 + 1) != v61 )
          goto LABEL_32;
        v24 = *(unsigned __int8 **)(a1 + 24);
        v26 = 1;
        v25 = *v24;
        if ( v25 != 95 )
          goto LABEL_34;
        *(_QWORD *)(a1 + 24) = ++v24;
        goto LABEL_114;
      case 2:
LABEL_79:
        v48 = **(char ***)(v22 + 8);
        if ( v48[1] == 99 )
        {
          v66 = *v48;
          if ( (unsigned __int8)(v66 - 114) <= 1u || (unsigned __int8)(v66 - 99) <= 1u )
          {
            v56 = sub_1E51C(a1);
LABEL_96:
            if ( strcmp(v39, "cl") == 0 )
            {
              v57 = sub_1DDC8(a1, 0x45u);
            }
            else if ( strcmp(v39, "dt") == 0 || strcmp(v39, "pt") == 0 )
            {
              v57 = sub_1FEC8(a1);
              if ( **(_BYTE **)(a1 + 24) == 73 )
              {
                v102 = sub_1C8DC(a1);
                v57 = sub_1B918(a1, 4, v57, v102);
              }
            }
            else
            {
              v57 = sub_21234(a1);
            }
            v58 = sub_1B918(a1, 56, v56, v57);
            v5 = sub_1B918(a1, 55, v22, v58);
            goto LABEL_23;
          }
        }
        v49 = *(unsigned __int8 **)(a1 + 24);
        v50 = *v49;
        switch ( v50 )
        {
          case 'L':
            v56 = sub_210BC(a1);
            goto LABEL_96;
          case 'T':
            v56 = sub_1C704(a1);
            goto LABEL_96;
          case 's':
            v108 = v49[1];
            if ( v108 == 114 )
            {
              *(_QWORD *)(a1 + 24) = v49 + 2;
              v234 = sub_1E51C(a1);
              v235 = sub_1FEC8(a1);
              if ( **(_BYTE **)(a1 + 24) == 73 )
              {
                v237 = sub_1C8DC(a1);
                v238 = sub_1B918(a1, 4, v235, v237);
                v56 = sub_1B918(a1, 1, v234, v238);
              }
              else
              {
                v56 = sub_1B918(a1, 1, v234, v235);
              }
              goto LABEL_96;
            }
            if ( v108 == 112 )
            {
              *(_QWORD *)(a1 + 24) = v49 + 2;
              v109 = sub_21234(a1);
              v56 = sub_1B918(a1, 74, v109, 0);
              goto LABEL_96;
            }
            break;
          case 'f':
            if ( v49[1] == 112 )
            {
              *(_QWORD *)(a1 + 24) = v49 + 2;
              if ( v49[2] == 84 )
              {
                v103 = v49 + 3;
                v104 = 0;
                *(_QWORD *)(a1 + 24) = v103;
              }
              else
              {
                v104 = sub_1C5D4(a1) + 1;
                if ( v104 == 0 )
                  goto LABEL_291;
              }
              v105 = *(_DWORD *)(a1 + 40);
              if ( v105 < *(_DWORD *)(a1 + 44) )
              {
                *(_DWORD *)(a1 + 40) = v105 + 1;
                v106 = *(_QWORD *)(a1 + 32);
                v107 = 24LL * v105;
                v56 = v106 + v107;
                if ( v106 + v107 != 0 )
                {
                  *(_DWORD *)(v106 + v107) = 6;
                  *(_QWORD *)(v56 + 8) = v104;
                }
                goto LABEL_96;
              }
              goto LABEL_291;
            }
            break;
          default:
            if ( (unsigned __int8)(v50 - 48) > 9u )
            {
              if ( v50 != 111 )
              {
                if ( (v50 == 116 || v50 == 105) && v49[1] == 108 )
                {
                  v158 = 0;
                  if ( v50 == 116 )
                  {
                    v158 = sub_1E51C(a1);
                    v49 = *(unsigned __int8 **)(a1 + 24);
                  }
                  *(_QWORD *)(a1 + 24) = v49 + 2;
                  v267 = v158;
                  v159 = sub_1DDC8(a1, 0x45u);
                  v56 = sub_1B918(a1, 48, v267, v159);
                  goto LABEL_96;
                }
                break;
              }
              if ( v49[1] != 110 )
                break;
              *(_QWORD *)(a1 + 24) = v49 + 2;
            }
            v56 = sub_1FEC8(a1);
            if ( v56 != 0 )
            {
              if ( **(_BYTE **)(a1 + 24) == 73 )
              {
                v99 = sub_1C8DC(a1);
                v56 = sub_1B918(a1, 4, v56, v99);
              }
              goto LABEL_96;
            }
            goto LABEL_291;
        }
        v51 = (int *)sub_1FCD4(a1);
        v52 = (__int64)v51;
        if ( v51 != nullptr )
        {
          v53 = *v51;
          if ( v53 != 49 )
          {
            if ( v53 == 50 )
            {
              switch ( *(_DWORD *)(v52 + 8) )
              {
                case 0:
                  goto LABEL_505;
                case 1:
                  goto LABEL_94;
                case 2:
                  v156 = nullptr;
                  goto LABEL_477;
                case 3:
                  v156 = nullptr;
                  goto LABEL_491;
                default:
                  goto LABEL_291;
              }
            }
            if ( v53 == 51 )
            {
              v54 = *(_BYTE **)(a1 + 24);
              if ( *v54 == 95 )
              {
                *(_QWORD *)(a1 + 24) = v54 + 1;
                v55 = sub_1DDC8(a1, 0x45u);
              }
              else
              {
LABEL_94:
                v55 = sub_21234(a1);
              }
              v56 = sub_1B918(a1, 54, v52, v55);
              goto LABEL_96;
            }
            goto LABEL_291;
          }
          v155 = *(const char ***)(v52 + 8);
          v156 = *v155;
          v157 = *v155;
          *(_DWORD *)(a1 + 80) += *((_DWORD *)v155 + 4) - 2;
          if ( strcmp(v157, "st") == 0 )
          {
            v236 = sub_1E51C(a1);
LABEL_469:
            v56 = sub_1B918(a1, 54, v52, v236);
            goto LABEL_96;
          }
          switch ( *((_DWORD *)v155 + 5) )
          {
            case 0:
LABEL_505:
              v56 = sub_1B918(a1, 53, v52, 0);
              goto LABEL_96;
            case 1:
              v255 = *(unsigned __int8 *)v156;
              if ( v255 != 109 && v255 != 112 || *((unsigned __int8 *)v156 + 1) != v255 )
                goto LABEL_94;
              v256 = *(_BYTE **)(a1 + 24);
              if ( *v256 != 95 )
              {
                v257 = sub_21234(a1);
                v236 = sub_1B918(a1, 56, v257, v257);
                goto LABEL_469;
              }
              *(_QWORD *)(a1 + 24) = v256 + 1;
              goto LABEL_94;
            case 2:
LABEL_477:
              v240 = **(char ***)(v52 + 8);
              if ( v240[1] == 99
                && ((unsigned __int8)((v245 = *v240) - 114) <= 1u || (unsigned __int8)(v245 - 99) <= 1u) )
              {
                v241 = sub_1E51C(a1);
              }
              else
              {
                v241 = sub_21234(a1);
              }
              if ( strcmp(v156, "cl") == 0 )
              {
                v242 = sub_1DDC8(a1, 0x45u);
              }
              else if ( strcmp(v156, "dt") == 0 || strcmp(v156, "pt") == 0 )
              {
                v242 = sub_1FEC8(a1);
                if ( **(_BYTE **)(a1 + 24) == 73 )
                {
                  v243 = sub_1C8DC(a1);
                  v242 = sub_1B918(a1, 4, v242, v243);
                }
              }
              else
              {
                v242 = sub_21234(a1);
              }
              v244 = sub_1B918(a1, 56, v241, v242);
              v56 = sub_1B918(a1, 55, v52, v244);
              goto LABEL_96;
            case 3:
LABEL_491:
              if ( strcmp(v156, "qu") == 0 )
              {
                v247 = sub_21234(a1);
                v248 = sub_21234(a1);
                v251 = sub_21234(a1);
                goto LABEL_500;
              }
              if ( *v156 == 110 )
              {
                v246 = *((unsigned __int8 *)v156 + 1);
                if ( v246 == 97 || v246 == 119 )
                {
                  v247 = sub_1DDC8(a1, 0x5Fu);
                  v248 = sub_1E51C(a1);
                  v249 = *(unsigned __int8 **)(a1 + 24);
                  v250 = *v249;
                  if ( v250 == 69 )
                  {
                    v254 = v249 + 1;
                    v251 = 0;
                    *(_QWORD *)(a1 + 24) = v254;
                    goto LABEL_500;
                  }
                  if ( v250 == 112 )
                  {
                    if ( v249[1] == 105 )
                    {
                      *(_QWORD *)(a1 + 24) = v249 + 2;
                      v251 = sub_1DDC8(a1, 0x45u);
                      goto LABEL_500;
                    }
                  }
                  else if ( v250 == 105 && v249[1] == 108 )
                  {
                    v251 = sub_21234(a1);
LABEL_500:
                    v252 = sub_1B918(a1, 59, v248, v251);
                    v253 = sub_1B918(a1, 58, v247, v252);
                    v56 = sub_1B918(a1, 57, v52, v253);
                    goto LABEL_96;
                  }
                }
              }
              break;
            default:
              break;
          }
        }
LABEL_291:
        v56 = 0;
        goto LABEL_96;
      case 3:
LABEL_68:
        if ( strcmp(v39, "qu") != 0 )
        {
          if ( *v39 == 110 )
          {
            v40 = *((unsigned __int8 *)v39 + 1);
            if ( v40 == 97 || v40 == 119 )
            {
              v41 = sub_1DDC8(a1, 0x5Fu);
              v42 = sub_1E51C(a1);
              v43 = *(unsigned __int8 **)(a1 + 24);
              v44 = *v43;
              if ( v44 == 69 )
              {
                v45 = 0;
                *(_QWORD *)(a1 + 24) = v43 + 1;
                goto LABEL_77;
              }
              if ( v44 == 112 )
              {
                if ( v43[1] == 105 )
                {
                  *(_QWORD *)(a1 + 24) = v43 + 2;
                  v45 = sub_1DDC8(a1, 0x45u);
                  goto LABEL_77;
                }
              }
              else if ( v44 == 105 && v43[1] == 108 )
              {
                v45 = sub_21234(a1);
LABEL_77:
                v46 = sub_1B918(a1, 59, v42, v45);
                v47 = sub_1B918(a1, 58, v41, v46);
                v5 = sub_1B918(a1, 57, v22, v47);
                goto LABEL_23;
              }
            }
          }
          goto LABEL_106;
        }
        v67 = *(unsigned __int8 **)(a1 + 24);
        v68 = *v67;
        switch ( v68 )
        {
          case 'L':
            v41 = sub_210BC(a1);
            v75 = *(unsigned __int8 **)(a1 + 24);
            v76 = *v75;
            goto LABEL_147;
          case 'T':
            v41 = sub_1C704(a1);
            v75 = *(unsigned __int8 **)(a1 + 24);
            v76 = *v75;
            goto LABEL_147;
          case 's':
            v133 = v67[1];
            if ( v133 == 114 )
            {
              *(_QWORD *)(a1 + 24) = v67 + 2;
              v41 = sub_1E51C(a1);
              v193 = sub_1FEC8(a1);
              if ( **(_BYTE **)(a1 + 24) != 73 )
              {
                v41 = sub_1B918(a1, 1, v41, v193);
                v75 = *(unsigned __int8 **)(a1 + 24);
                v76 = *v75;
                goto LABEL_147;
              }
              v194 = sub_1C8DC(a1);
              v72 = sub_1B918(a1, 4, v193, v194);
              v74 = 1;
              v73 = a1;
              goto LABEL_146;
            }
            if ( v133 == 112 )
            {
              *(_QWORD *)(a1 + 24) = v67 + 2;
              v134 = sub_21234(a1);
              v135 = 74;
              v136 = a1;
LABEL_261:
              v41 = sub_1B918(v136, v135, v134, 0);
              goto LABEL_262;
            }
            goto LABEL_139;
          default:
            break;
        }
        if ( v68 != 102 )
        {
          if ( (unsigned __int8)(v68 - 48) <= 9u )
            goto LABEL_207;
          if ( v68 != 111 )
          {
            if ( (v68 == 116 || v68 == 105) && v67[1] == 108 )
            {
              v217 = 0;
              if ( v68 == 116 )
              {
                v217 = sub_1E51C(a1);
                v67 = *(unsigned __int8 **)(a1 + 24);
              }
              *(_QWORD *)(a1 + 24) = v67 + 2;
              v270 = v217;
              v218 = sub_1DDC8(a1, 0x45u);
              v41 = sub_1B918(a1, 48, v270, v218);
              v75 = *(unsigned __int8 **)(a1 + 24);
              v76 = *v75;
              goto LABEL_147;
            }
            goto LABEL_139;
          }
          if ( v67[1] == 110 )
          {
            *(_QWORD *)(a1 + 24) = v67 + 2;
LABEL_207:
            v41 = sub_1FEC8(a1);
            v75 = *(unsigned __int8 **)(a1 + 24);
            v76 = *v75;
            if ( v41 == 0 || v76 != 73 )
              goto LABEL_147;
            v72 = sub_1C8DC(a1);
            v74 = 4;
            v73 = a1;
LABEL_146:
            v41 = sub_1B918(v73, v74, v41, v72);
            v75 = *(unsigned __int8 **)(a1 + 24);
            v76 = *v75;
            goto LABEL_147;
          }
LABEL_139:
          v69 = (int *)sub_1FCD4(a1);
          v41 = (__int64)v69;
          if ( v69 != nullptr )
          {
            v70 = *v69;
            if ( v70 != 49 )
            {
              if ( v70 == 50 )
              {
                switch ( *(_DWORD *)(v41 + 8) )
                {
                  case 0:
                    goto LABEL_396;
                  case 1:
                    goto LABEL_144;
                  case 2:
                    v201 = nullptr;
                    goto LABEL_384;
                  case 3:
                    v201 = nullptr;
                    goto LABEL_398;
                  default:
                    goto LABEL_231;
                }
              }
              if ( v70 == 51 )
              {
                v71 = *(_BYTE **)(a1 + 24);
                if ( *v71 == 95 )
                {
                  *(_QWORD *)(a1 + 24) = v71 + 1;
                  v72 = sub_1DDC8(a1, 0x45u);
                }
                else
                {
LABEL_144:
                  v72 = sub_21234(a1);
                }
                v73 = a1;
                v74 = 54;
                goto LABEL_146;
              }
              goto LABEL_231;
            }
            v215 = *(const char ***)(v41 + 8);
            v201 = *v215;
            v216 = *v215;
            *(_DWORD *)(a1 + 80) += *((_DWORD *)v215 + 4) - 2;
            if ( strcmp(v216, "st") == 0 )
            {
              v72 = sub_1E51C(a1);
              v74 = 54;
              v73 = a1;
              goto LABEL_146;
            }
            switch ( *(_DWORD *)(*(_QWORD *)(v41 + 8) + 20LL) )
            {
              case 0:
LABEL_396:
                v136 = a1;
                v135 = 53;
                v134 = v41;
                goto LABEL_261;
              case 1:
                v231 = *(unsigned __int8 *)v201;
                if ( v231 != 109 && v231 != 112 || *((unsigned __int8 *)v201 + 1) != v231 )
                  goto LABEL_144;
                v232 = *(_BYTE **)(a1 + 24);
                if ( *v232 != 95 )
                {
                  v233 = sub_21234(a1);
                  v72 = sub_1B918(a1, 56, v233, v233);
                  v74 = 54;
                  v73 = a1;
                  goto LABEL_146;
                }
                *(_QWORD *)(a1 + 24) = v232 + 1;
                goto LABEL_144;
              case 2:
LABEL_384:
                v202 = **(char ***)(v41 + 8);
                if ( v202[1] == 99
                  && ((unsigned __int8)((v206 = *v202) - 114) <= 1u || (unsigned __int8)(v206 - 99) <= 1u) )
                {
                  v203 = sub_1E51C(a1);
                }
                else
                {
                  v203 = sub_21234(a1);
                }
                if ( strcmp(v201, "cl") == 0 )
                {
                  v204 = sub_1DDC8(a1, 0x45u);
                }
                else if ( strcmp(v201, "dt") == 0 || strcmp(v201, "pt") == 0 )
                {
                  v204 = sub_1FEC8(a1);
                  if ( **(_BYTE **)(a1 + 24) == 73 )
                  {
                    v205 = sub_1C8DC(a1);
                    v204 = sub_1B918(a1, 4, v204, v205);
                  }
                }
                else
                {
                  v204 = sub_21234(a1);
                }
                v72 = sub_1B918(a1, 56, v203, v204);
                v74 = 55;
                v73 = a1;
                goto LABEL_146;
              case 3:
LABEL_398:
                if ( strcmp(v201, "qu") == 0 )
                {
                  v208 = sub_21234(a1);
                  v209 = sub_21234(a1);
                  v210 = sub_21234(a1);
                  goto LABEL_407;
                }
                if ( *v201 != 110 )
                  goto LABEL_231;
                v207 = *((unsigned __int8 *)v201 + 1);
                if ( v207 != 97 && v207 != 119 )
                  goto LABEL_231;
                v208 = sub_1DDC8(a1, 0x5Fu);
                v209 = sub_1E51C(a1);
                v75 = *(unsigned __int8 **)(a1 + 24);
                v76 = *v75;
                switch ( v76 )
                {
                  case 'E':
                    v212 = v75 + 1;
                    v210 = 0;
                    *(_QWORD *)(a1 + 24) = v212;
                    goto LABEL_407;
                  case 'p':
                    if ( v75[1] == 105 )
                    {
                      *(_QWORD *)(a1 + 24) = v75 + 2;
                      v210 = sub_1DDC8(a1, 0x45u);
                      goto LABEL_407;
                    }
                    goto LABEL_409;
                  case 'i':
                    if ( v75[1] == 108 )
                    {
                      v210 = sub_21234(a1);
LABEL_407:
                      v211 = sub_1B918(a1, 59, v209, v210);
                      v72 = sub_1B918(a1, 58, v208, v211);
                      v74 = 57;
                      v73 = a1;
                      goto LABEL_146;
                    }
LABEL_409:
                    v41 = 0;
LABEL_153:
                    if ( (v76 == 116 || v76 == 105) && v75[1] == 108 )
                    {
                      v191 = 0;
                      if ( v76 == 116 )
                      {
                        v191 = sub_1E51C(a1);
                        v75 = *(unsigned __int8 **)(a1 + 24);
                      }
                      *(_QWORD *)(a1 + 24) = v75 + 2;
                      v269 = v191;
                      v192 = sub_1DDC8(a1, 0x45u);
                      v42 = sub_1B918(a1, 48, v269, v192);
                      v84 = *(unsigned __int8 **)(a1 + 24);
                      v85 = *v84;
                      goto LABEL_164;
                    }
LABEL_156:
                    v77 = (int *)sub_1FCD4(a1);
                    v78 = (__int64)v77;
                    if ( v77 != nullptr )
                    {
                      v79 = *v77;
                      if ( v79 != 49 )
                      {
                        if ( v79 == 50 )
                        {
                          switch ( *(_DWORD *)(v78 + 8) )
                          {
                            case 0:
                              goto LABEL_439;
                            case 1:
                              goto LABEL_161;
                            case 2:
                              v219 = nullptr;
                              goto LABEL_426;
                            case 3:
                              v219 = nullptr;
                              goto LABEL_441;
                            default:
                              goto LABEL_233;
                          }
                        }
                        if ( v79 == 51 )
                        {
                          v80 = *(_BYTE **)(a1 + 24);
                          if ( *v80 == 95 )
                          {
                            *(_QWORD *)(a1 + 24) = v80 + 1;
                            v81 = sub_1DDC8(a1, 0x45u);
                          }
                          else
                          {
LABEL_161:
                            v81 = sub_21234(a1);
                          }
                          v82 = a1;
                          v83 = 54;
                          goto LABEL_163;
                        }
                        goto LABEL_233;
                      }
                      v258 = *(const char ***)(v78 + 8);
                      v219 = *v258;
                      v259 = *v258;
                      *(_DWORD *)(a1 + 80) += *((_DWORD *)v258 + 4) - 2;
                      if ( strcmp(v259, "st") == 0 )
                      {
                        v81 = sub_1E51C(a1);
                        v83 = 54;
                        v82 = a1;
                        goto LABEL_163;
                      }
                      switch ( *(_DWORD *)(*(_QWORD *)(v78 + 8) + 20LL) )
                      {
                        case 0:
LABEL_439:
                          v128 = a1;
                          v127 = 53;
                          v126 = v78;
                          goto LABEL_248;
                        case 1:
                          v260 = *(unsigned __int8 *)v219;
                          if ( v260 != 109 && v260 != 112 || *((unsigned __int8 *)v219 + 1) != v260 )
                            goto LABEL_161;
                          v261 = *(_BYTE **)(a1 + 24);
                          if ( *v261 != 95 )
                          {
                            v262 = sub_21234(a1);
                            v81 = sub_1B918(a1, 56, v262, v262);
                            v83 = 54;
                            v82 = a1;
                            goto LABEL_163;
                          }
                          *(_QWORD *)(a1 + 24) = v261 + 1;
                          goto LABEL_161;
                        case 2:
LABEL_426:
                          v220 = **(char ***)(v78 + 8);
                          if ( v220[1] == 99
                            && ((unsigned __int8)((v224 = *v220) - 114) <= 1u || (unsigned __int8)(v224 - 99) <= 1u) )
                          {
                            v221 = sub_1E51C(a1);
                          }
                          else
                          {
                            v221 = sub_21234(a1);
                          }
                          if ( strcmp(v219, "cl") == 0 )
                          {
                            v222 = sub_1DDC8(a1, 0x45u);
                          }
                          else if ( strcmp(v219, "dt") == 0 || strcmp(v219, "pt") == 0 )
                          {
                            v222 = sub_1FEC8(a1);
                            if ( **(_BYTE **)(a1 + 24) == 73 )
                            {
                              v223 = sub_1C8DC(a1);
                              v222 = sub_1B918(a1, 4, v222, v223);
                            }
                          }
                          else
                          {
                            v222 = sub_21234(a1);
                          }
                          v81 = sub_1B918(a1, 56, v221, v222);
                          v83 = 55;
                          v82 = a1;
                          goto LABEL_163;
                        case 3:
LABEL_441:
                          if ( strcmp(v219, "qu") == 0 )
                          {
                            v226 = sub_21234(a1);
                            v227 = sub_21234(a1);
                            v228 = sub_21234(a1);
                            goto LABEL_450;
                          }
                          if ( *v219 != 110 )
                            goto LABEL_233;
                          v225 = *((unsigned __int8 *)v219 + 1);
                          if ( v225 != 97 && v225 != 119 )
                            goto LABEL_233;
                          v226 = sub_1DDC8(a1, 0x5Fu);
                          v227 = sub_1E51C(a1);
                          v84 = *(unsigned __int8 **)(a1 + 24);
                          v85 = *v84;
                          switch ( v85 )
                          {
                            case 'E':
                              v230 = v84 + 1;
                              v228 = 0;
                              *(_QWORD *)(a1 + 24) = v230;
                              goto LABEL_450;
                            case 'p':
                              if ( v84[1] == 105 )
                              {
                                *(_QWORD *)(a1 + 24) = v84 + 2;
                                v228 = sub_1DDC8(a1, 0x45u);
                                goto LABEL_450;
                              }
                              goto LABEL_452;
                            case 'i':
                              if ( v84[1] == 108 )
                              {
                                v228 = sub_21234(a1);
LABEL_450:
                                v229 = sub_1B918(a1, 59, v227, v228);
                                v81 = sub_1B918(a1, 58, v226, v229);
                                v83 = 57;
                                v82 = a1;
                                goto LABEL_163;
                              }
LABEL_452:
                              v42 = 0;
LABEL_170:
                              if ( (v85 == 116 || v85 == 105) && v84[1] == 108 )
                              {
                                v189 = 0;
                                if ( v85 == 116 )
                                {
                                  v189 = sub_1E51C(a1);
                                  v84 = *(unsigned __int8 **)(a1 + 24);
                                }
                                *(_QWORD *)(a1 + 24) = v84 + 2;
                                v268 = v189;
                                v190 = sub_1DDC8(a1, 0x45u);
                                v45 = sub_1B918(a1, 48, v268, v190);
                                goto LABEL_77;
                              }
                              goto LABEL_173;
                            default:
                              break;
                          }
                          v42 = 0;
                          break;
                        default:
                          goto LABEL_233;
                      }
LABEL_164:
                      switch ( v85 )
                      {
                        case 'L':
                          v45 = sub_210BC(a1);
                          goto LABEL_77;
                        case 'T':
                          v45 = sub_1C704(a1);
                          goto LABEL_77;
                        case 's':
                          v115 = v84[1];
                          if ( v115 == 114 )
                          {
                            *(_QWORD *)(a1 + 24) = v84 + 2;
                            v199 = sub_1E51C(a1);
                            v200 = sub_1FEC8(a1);
                            if ( **(_BYTE **)(a1 + 24) == 73 )
                            {
                              v213 = sub_1C8DC(a1);
                              v214 = sub_1B918(a1, 4, v200, v213);
                              v45 = sub_1B918(a1, 1, v199, v214);
                            }
                            else
                            {
                              v45 = sub_1B918(a1, 1, v199, v200);
                            }
                            goto LABEL_77;
                          }
                          if ( v115 == 112 )
                          {
                            *(_QWORD *)(a1 + 24) = v84 + 2;
                            v116 = sub_21234(a1);
                            v45 = sub_1B918(a1, 74, v116, 0);
                            goto LABEL_77;
                          }
                          break;
                        case 'f':
                          if ( v84[1] == 112 )
                          {
                            *(_QWORD *)(a1 + 24) = v84 + 2;
                            if ( v84[2] == 84 )
                            {
                              v110 = v84 + 3;
                              v111 = 0;
                              *(_QWORD *)(a1 + 24) = v110;
                            }
                            else
                            {
                              v111 = sub_1C5D4(a1) + 1;
                              if ( v111 == 0 )
                                goto LABEL_320;
                            }
                            v112 = *(_DWORD *)(a1 + 40);
                            v45 = 0;
                            if ( v112 < *(_DWORD *)(a1 + 44) )
                            {
                              *(_DWORD *)(a1 + 40) = v112 + 1;
                              v113 = *(_QWORD *)(a1 + 32);
                              v114 = 24LL * v112;
                              v45 = v113 + v114;
                              if ( v113 + v114 != 0 )
                              {
                                *(_DWORD *)(v113 + v114) = 6;
                                *(_QWORD *)(v45 + 8) = v111;
                              }
                            }
                            goto LABEL_77;
                          }
                          break;
                        default:
                          if ( (unsigned __int8)(v85 - 48) > 9u )
                          {
                            if ( v85 != 111 )
                              goto LABEL_170;
                            if ( v84[1] != 110 )
                              break;
                            *(_QWORD *)(a1 + 24) = v84 + 2;
                          }
                          v45 = sub_1FEC8(a1);
                          if ( v45 != 0 && **(_BYTE **)(a1 + 24) == 73 )
                          {
                            v100 = sub_1C8DC(a1);
                            v45 = sub_1B918(a1, 4, v45, v100);
                          }
                          goto LABEL_77;
                      }
LABEL_173:
                      v86 = (int *)sub_1FCD4(a1);
                      v87 = (__int64)v86;
                      if ( v86 != nullptr )
                      {
                        v88 = *v86;
                        switch ( v88 )
                        {
                          case '1':
                            v166 = *(const char ***)(v87 + 8);
                            v167 = *v166;
                            v168 = *v166;
                            *(_DWORD *)(a1 + 80) += *((_DWORD *)v166 + 4) - 2;
                            if ( strcmp(v168, "st") == 0 )
                            {
                              v165 = sub_1E51C(a1);
                              goto LABEL_315;
                            }
                            v45 = 0;
                            switch ( *(_DWORD *)(*(_QWORD *)(v87 + 8) + 20LL) )
                            {
                              case 0:
LABEL_341:
                                v45 = sub_1B918(a1, 53, v87, 0);
                                goto LABEL_77;
                              case 1:
                                v175 = *(unsigned __int8 *)v167;
                                if ( v175 != 109 && v175 != 112 || *((unsigned __int8 *)v167 + 1) != v175 )
                                  goto LABEL_178;
                                v176 = *(_BYTE **)(a1 + 24);
                                if ( *v176 != 95 )
                                {
                                  v177 = sub_21234(a1);
                                  v165 = sub_1B918(a1, 56, v177, v177);
                                  goto LABEL_315;
                                }
                                *(_QWORD *)(a1 + 24) = v176 + 1;
                                goto LABEL_178;
                              case 2:
LABEL_322:
                                v169 = **(char ***)(v87 + 8);
                                if ( v169[1] == 99
                                  && ((unsigned __int8)((v174 = *v169) - 114) <= 1u || (unsigned __int8)(v174 - 99) <= 1u) )
                                {
                                  v170 = sub_1E51C(a1);
                                }
                                else
                                {
                                  v170 = sub_21234(a1);
                                }
                                if ( strcmp(v167, "cl") == 0 )
                                {
                                  v171 = sub_1DDC8(a1, 0x45u);
                                }
                                else if ( strcmp(v167, "dt") == 0 || strcmp(v167, "pt") == 0 )
                                {
                                  v171 = sub_1FEC8(a1);
                                  if ( **(_BYTE **)(a1 + 24) == 73 )
                                  {
                                    v172 = sub_1C8DC(a1);
                                    v171 = sub_1B918(a1, 4, v171, v172);
                                  }
                                }
                                else
                                {
                                  v171 = sub_21234(a1);
                                }
                                v173 = sub_1B918(a1, 56, v170, v171);
                                v45 = sub_1B918(a1, 55, v87, v173);
                                goto LABEL_77;
                              case 3:
LABEL_343:
                                if ( strcmp(v167, "qu") == 0 )
                                {
                                  v179 = sub_21234(a1);
                                  v180 = sub_21234(a1);
                                  v183 = sub_21234(a1);
                                }
                                else
                                {
                                  if ( *v167 != 110 )
                                    goto LABEL_320;
                                  v178 = *((unsigned __int8 *)v167 + 1);
                                  if ( v178 != 97 && v178 != 119 )
                                    goto LABEL_320;
                                  v179 = sub_1DDC8(a1, 0x5Fu);
                                  v180 = sub_1E51C(a1);
                                  v181 = *(unsigned __int8 **)(a1 + 24);
                                  v182 = *v181;
                                  switch ( v182 )
                                  {
                                    case 'E':
                                      v186 = v181 + 1;
                                      v183 = 0;
                                      *(_QWORD *)(a1 + 24) = v186;
                                      break;
                                    case 'p':
                                      v45 = 0;
                                      if ( v181[1] != 105 )
                                        goto LABEL_77;
                                      *(_QWORD *)(a1 + 24) = v181 + 2;
                                      v183 = sub_1DDC8(a1, 0x45u);
                                      break;
                                    case 'i':
                                      v45 = 0;
                                      if ( v181[1] != 108 )
                                        goto LABEL_77;
                                      v183 = sub_21234(a1);
                                      break;
                                    default:
                                      goto LABEL_320;
                                  }
                                }
                                v184 = sub_1B918(a1, 59, v180, v183);
                                v185 = sub_1B918(a1, 58, v179, v184);
                                v45 = sub_1B918(a1, 57, v87, v185);
                                goto LABEL_77;
                              default:
                                goto LABEL_77;
                            }
                          case '2':
                            v45 = 0;
                            switch ( *(_DWORD *)(v87 + 8) )
                            {
                              case 0:
                                goto LABEL_341;
                              case 1:
                                goto LABEL_178;
                              case 2:
                                v167 = nullptr;
                                goto LABEL_322;
                              case 3:
                                v167 = nullptr;
                                goto LABEL_343;
                              default:
                                goto LABEL_77;
                            }
                          case '3':
                            v89 = *(_BYTE **)(a1 + 24);
                            if ( *v89 != 95 )
                            {
LABEL_178:
                              v90 = sub_21234(a1);
LABEL_179:
                              v45 = sub_1B918(a1, 54, v87, v90);
                              goto LABEL_77;
                            }
                            *(_QWORD *)(a1 + 24) = v89 + 1;
                            v165 = sub_1DDC8(a1, 0x45u);
LABEL_315:
                            v90 = v165;
                            goto LABEL_179;
                          default:
                            break;
                        }
                      }
LABEL_320:
                      v45 = 0;
                      goto LABEL_77;
                    }
LABEL_233:
                    v84 = *(unsigned __int8 **)(a1 + 24);
                    v42 = 0;
                    v85 = *v84;
                    goto LABEL_164;
                  default:
                    break;
                }
                v41 = 0;
                break;
              default:
                goto LABEL_231;
            }
LABEL_147:
            switch ( v76 )
            {
              case 'L':
                v42 = sub_210BC(a1);
                v84 = *(unsigned __int8 **)(a1 + 24);
                v85 = *v84;
                goto LABEL_164;
              case 'T':
                v42 = sub_1C704(a1);
                v84 = *(unsigned __int8 **)(a1 + 24);
                v85 = *v84;
                goto LABEL_164;
              case 's':
                v125 = v75[1];
                if ( v125 == 114 )
                {
                  *(_QWORD *)(a1 + 24) = v75 + 2;
                  v78 = sub_1E51C(a1);
                  v187 = sub_1FEC8(a1);
                  if ( **(_BYTE **)(a1 + 24) == 73 )
                  {
                    v188 = sub_1C8DC(a1);
                    v81 = sub_1B918(a1, 4, v187, v188);
                    v83 = 1;
                    v82 = a1;
LABEL_163:
                    v42 = sub_1B918(v82, v83, v78, v81);
                    v84 = *(unsigned __int8 **)(a1 + 24);
                    v85 = *v84;
                    goto LABEL_164;
                  }
                  v42 = sub_1B918(a1, 1, v78, v187);
                  v84 = *(unsigned __int8 **)(a1 + 24);
                  v85 = *v84;
                  goto LABEL_164;
                }
                if ( v125 != 112 )
                  goto LABEL_156;
                *(_QWORD *)(a1 + 24) = v75 + 2;
                v126 = sub_21234(a1);
                v127 = 74;
                v128 = a1;
LABEL_248:
                v42 = sub_1B918(v128, v127, v126, 0);
                break;
              case 'f':
                if ( v75[1] != 112 )
                  goto LABEL_156;
                *(_QWORD *)(a1 + 24) = v75 + 2;
                if ( v75[2] == 84 )
                {
                  v121 = v75 + 3;
                  v118 = 0;
                  *(_QWORD *)(a1 + 24) = v121;
                }
                else
                {
                  v118 = sub_1C5D4(a1) + 1;
                  if ( v118 == 0 )
                    goto LABEL_233;
                }
                v122 = *(_DWORD *)(a1 + 40);
                if ( v122 >= *(_DWORD *)(a1 + 44) )
                  goto LABEL_233;
                *(_DWORD *)(a1 + 40) = v122 + 1;
                v123 = *(_QWORD *)(a1 + 32);
                v124 = 24LL * v122;
                v42 = v123 + v124;
                if ( v123 + v124 != 0 )
                {
                  *(_DWORD *)(v123 + v124) = 6;
                  *(_QWORD *)(v42 + 8) = v118;
                  v84 = *(unsigned __int8 **)(a1 + 24);
                  v85 = *v84;
                  goto LABEL_164;
                }
                break;
              default:
                if ( (unsigned __int8)(v76 - 48) > 9u )
                {
                  if ( v76 != 111 )
                    goto LABEL_153;
                  if ( v75[1] != 110 )
                    goto LABEL_156;
                  *(_QWORD *)(a1 + 24) = v75 + 2;
                }
                v42 = sub_1FEC8(a1);
                v84 = *(unsigned __int8 **)(a1 + 24);
                v85 = *v84;
                if ( v42 != 0 && v85 == 73 )
                {
                  v101 = sub_1C8DC(a1);
                  v42 = sub_1B918(a1, 4, v42, v101);
                  v84 = *(unsigned __int8 **)(a1 + 24);
                  v85 = *v84;
                }
                goto LABEL_164;
            }
            v84 = *(unsigned __int8 **)(a1 + 24);
            v85 = *v84;
            goto LABEL_164;
          }
LABEL_262:
          v75 = *(unsigned __int8 **)(a1 + 24);
          v76 = *v75;
          goto LABEL_147;
        }
        if ( v67[1] != 112 )
          goto LABEL_139;
        *(_QWORD *)(a1 + 24) = v67 + 2;
        if ( v67[2] == 84 )
        {
          v129 = v67 + 3;
          v117 = 0;
          *(_QWORD *)(a1 + 24) = v129;
        }
        else
        {
          v117 = sub_1C5D4(a1) + 1;
          if ( v117 == 0 )
            goto LABEL_231;
        }
        v130 = *(_DWORD *)(a1 + 40);
        if ( v130 < *(_DWORD *)(a1 + 44) )
        {
          *(_DWORD *)(a1 + 40) = v130 + 1;
          v131 = *(_QWORD *)(a1 + 32);
          v132 = 24LL * v130;
          v41 = v131 + v132;
          if ( v131 + v132 != 0 )
          {
            *(_DWORD *)(v131 + v132) = 6;
            *(_QWORD *)(v41 + 8) = v117;
            v75 = *(unsigned __int8 **)(a1 + 24);
            v76 = *v75;
            goto LABEL_147;
          }
          goto LABEL_262;
        }
LABEL_231:
        v75 = *(unsigned __int8 **)(a1 + 24);
        v41 = 0;
        v76 = *v75;
        goto LABEL_147;
      default:
        goto LABEL_106;
    }
  }
  if ( v23 == 50 )
  {
    switch ( *(_DWORD *)(v21 + 8) )
    {
      case 0:
        goto LABEL_66;
      case 1:
        goto LABEL_32;
      case 2:
        v39 = nullptr;
        goto LABEL_79;
      case 3:
        v39 = nullptr;
        goto LABEL_68;
      default:
        goto LABEL_106;
    }
  }
  if ( v23 != 51 )
    goto LABEL_106;
LABEL_32:
  v24 = *(unsigned __int8 **)(a1 + 24);
  if ( v23 == 51 )
  {
    v25 = *v24;
    v26 = 0;
    if ( v25 == 95 )
    {
      *(_QWORD *)(a1 + 24) = v24 + 1;
      v32 = sub_1DDC8(a1, 0x45u);
      goto LABEL_119;
    }
  }
  else
  {
LABEL_114:
    v25 = *v24;
    v26 = 0;
  }
LABEL_34:
  switch ( v25 )
  {
    case 'L':
      v32 = sub_210BC(a1);
      goto LABEL_50;
    case 'T':
      v32 = sub_1C704(a1);
      goto LABEL_50;
    case 's':
      v93 = v24[1];
      if ( v93 == 114 )
      {
        *(_QWORD *)(a1 + 24) = v24 + 2;
        v195 = sub_1E51C(a1);
        v196 = sub_1FEC8(a1);
        if ( **(_BYTE **)(a1 + 24) == 73 )
        {
          v197 = sub_1C8DC(a1);
          v198 = sub_1B918(a1, 4, v196, v197);
          v32 = sub_1B918(a1, 1, v195, v198);
        }
        else
        {
          v32 = sub_1B918(a1, 1, v195, v196);
        }
        goto LABEL_50;
      }
      if ( v93 == 112 )
      {
        *(_QWORD *)(a1 + 24) = v24 + 2;
        v94 = sub_21234(a1);
        v32 = sub_1B918(a1, 74, v94, 0);
        goto LABEL_50;
      }
      goto LABEL_43;
    default:
      break;
  }
  if ( v25 != 102 )
  {
    if ( (unsigned __int8)(v25 - 48) > 9u )
    {
      if ( v25 != 111 )
      {
        if ( (v25 == 116 || v25 == 105) && v24[1] == 108 )
        {
          v119 = 0;
          if ( v25 == 116 )
          {
            v119 = sub_1E51C(a1);
            v24 = *(unsigned __int8 **)(a1 + 24);
          }
          *(_QWORD *)(a1 + 24) = v24 + 2;
          v266 = v119;
          v120 = sub_1DDC8(a1, 0x45u);
          v32 = sub_1B918(a1, 48, v266, v120);
          goto LABEL_50;
        }
        goto LABEL_43;
      }
      if ( v24[1] != 110 )
        goto LABEL_43;
      *(_QWORD *)(a1 + 24) = v24 + 2;
    }
    v32 = sub_1FEC8(a1);
    if ( v32 != 0 && **(_BYTE **)(a1 + 24) == 73 )
    {
      v65 = sub_1C8DC(a1);
      v32 = sub_1B918(a1, 4, v32, v65);
    }
    goto LABEL_50;
  }
  if ( v24[1] == 112 )
  {
    *(_QWORD *)(a1 + 24) = v24 + 2;
    if ( v24[2] == 84 )
    {
      v95 = 0;
      *(_QWORD *)(a1 + 24) = v24 + 3;
    }
    else
    {
      v141 = sub_1C5D4(a1);
      v95 = v141 + 1;
      if ( v141 == -1 )
        goto LABEL_267;
    }
    v96 = *(_DWORD *)(a1 + 40);
    v32 = 0;
    if ( v96 < *(_DWORD *)(a1 + 44) )
    {
      *(_DWORD *)(a1 + 40) = v96 + 1;
      v97 = *(_QWORD *)(a1 + 32);
      v98 = 24LL * v96;
      v32 = v97 + v98;
      if ( v97 + v98 != 0 )
      {
        *(_DWORD *)(v97 + v98) = 6;
        *(_QWORD *)(v32 + 8) = v95;
      }
    }
    goto LABEL_50;
  }
LABEL_43:
  v27 = (int *)sub_1FCD4(a1);
  v28 = (__int64)v27;
  if ( v27 == nullptr )
    goto LABEL_267;
  v29 = *v27;
  if ( v29 == 49 )
  {
    v137 = *(const char ***)(v28 + 8);
    v138 = *v137;
    v139 = *v137;
    *(_DWORD *)(a1 + 80) += *((_DWORD *)v137 + 4) - 2;
    if ( strcmp(v139, "st") == 0 )
    {
      v160 = sub_1E51C(a1);
      goto LABEL_301;
    }
    v140 = *((_DWORD *)v137 + 5);
    v32 = 0;
    switch ( v140 )
    {
      case 0:
LABEL_268:
        v32 = sub_1B918(a1, 53, v28, 0);
        goto LABEL_50;
      case 1:
        v162 = *(unsigned __int8 *)v138;
        if ( v162 != 109 && v162 != 112 || *((unsigned __int8 *)v138 + 1) != v162 )
          goto LABEL_48;
        v163 = *(_BYTE **)(a1 + 24);
        if ( *v163 != 95 )
        {
          v164 = sub_21234(a1);
          v160 = sub_1B918(a1, 56, v164, v164);
          goto LABEL_301;
        }
        *(_QWORD *)(a1 + 24) = v163 + 1;
        goto LABEL_48;
      case 2:
LABEL_270:
        v142 = **(char ***)(v28 + 8);
        if ( v142[1] == 99 && ((unsigned __int8)((v161 = *v142) - 114) <= 1u || (unsigned __int8)(v161 - 99) <= 1u) )
          v143 = sub_1E51C(a1);
        else
          v143 = sub_21234(a1);
        if ( strcmp(v138, "cl") == 0 )
        {
          v144 = sub_1DDC8(a1, 0x45u);
        }
        else if ( strcmp(v138, "dt") == 0 || strcmp(v138, "pt") == 0 )
        {
          v144 = sub_1FEC8(a1);
          if ( **(_BYTE **)(a1 + 24) == 73 )
          {
            v145 = sub_1C8DC(a1);
            v144 = sub_1B918(a1, 4, v144, v145);
          }
        }
        else
        {
          v144 = sub_21234(a1);
        }
        v146 = sub_1B918(a1, 56, v143, v144);
        v32 = sub_1B918(a1, 55, v28, v146);
        goto LABEL_50;
      case 3:
LABEL_279:
        if ( strcmp(v138, "qu") == 0 )
        {
          v148 = sub_21234(a1);
          v149 = sub_21234(a1);
          v152 = sub_21234(a1);
          goto LABEL_288;
        }
        if ( *v138 == 110 )
        {
          v147 = *((unsigned __int8 *)v138 + 1);
          if ( v147 == 97 || v147 == 119 )
          {
            v148 = sub_1DDC8(a1, 0x5Fu);
            v149 = sub_1E51C(a1);
            v150 = *(unsigned __int8 **)(a1 + 24);
            v151 = *v150;
            switch ( v151 )
            {
              case 'E':
                v239 = v150 + 1;
                v152 = 0;
                *(_QWORD *)(a1 + 24) = v239;
                break;
              case 'p':
                v32 = 0;
                if ( v150[1] != 105 )
                  goto LABEL_50;
                *(_QWORD *)(a1 + 24) = v150 + 2;
                v152 = sub_1DDC8(a1, 0x45u);
                break;
              case 'i':
                v32 = 0;
                if ( v150[1] != 108 )
                  goto LABEL_50;
                v152 = sub_21234(a1);
                break;
              default:
                goto LABEL_267;
            }
LABEL_288:
            v153 = sub_1B918(a1, 59, v149, v152);
            v154 = sub_1B918(a1, 58, v148, v153);
            v32 = sub_1B918(a1, 57, v28, v154);
            goto LABEL_50;
          }
        }
        break;
      default:
        goto LABEL_50;
    }
LABEL_267:
    v32 = 0;
    goto LABEL_50;
  }
  if ( v29 != 50 )
  {
    if ( v29 == 51 )
    {
      v30 = *(_BYTE **)(a1 + 24);
      if ( *v30 != 95 )
      {
LABEL_48:
        v31 = sub_21234(a1);
LABEL_49:
        v32 = sub_1B918(a1, 54, v28, v31);
        goto LABEL_50;
      }
      *(_QWORD *)(a1 + 24) = v30 + 1;
      v160 = sub_1DDC8(a1, 0x45u);
LABEL_301:
      v31 = v160;
      goto LABEL_49;
    }
    goto LABEL_267;
  }
  v32 = 0;
  switch ( *(_DWORD *)(v28 + 8) )
  {
    case 0:
      goto LABEL_268;
    case 1:
      goto LABEL_48;
    case 2:
      v138 = nullptr;
      goto LABEL_270;
    case 3:
      v138 = nullptr;
      goto LABEL_279;
    default:
      break;
  }
LABEL_50:
  if ( v26 == 0 )
  {
LABEL_119:
    v5 = sub_1B918(a1, 54, v22, v32);
    goto LABEL_23;
  }
  v33 = sub_1B918(a1, 56, v32, v32);
LABEL_52:
  v5 = sub_1B918(a1, 54, v22, v33);
LABEL_23:
  *(_DWORD *)(a1 + 84) = v16;
  if ( v5 == 0 )
    return 0;
  v1 = *(unsigned __int8 **)(a1 + 24);
LABEL_9:
  if ( *v1 != 95 )
    return 0;
  *(_QWORD *)(a1 + 24) = v1 + 1;
  v263 = v5;
  v14 = sub_1E51C(a1);
  return sub_1B918(a1, 45, v263, v14);
}


// Address: 0x24100 | Function: sub_24100
__int64 __fastcall sub_24100(__int64 a1, unsigned int a2, unsigned int *a3)
{
  __int64 v3; // x22
  unsigned int *v4; // x20
  unsigned int v6; // w21
  __int64 result; // x0
  __int64 v8; // x22
  __int64 v9; // x23
  __int64 v10; // x1
  __int64 v11; // x20
  char v12; // w21
  __int64 v13; // x2
  void (__fastcall *v14)(__int64, __int64, __int64); // x3
  __int64 v15; // x1
  __int64 v16; // x0
  __int64 v17; // x1
  _DWORD *v18; // x2
  __int64 v19; // x25
  unsigned int *v20; // x23
  unsigned int v21; // w0
  __int64 v22; // x4
  unsigned int v23; // w1
  unsigned int v24; // w3
  unsigned int v25; // w3
  __int64 v26; // x22
  __int64 v27; // x23
  __int64 v28; // x1
  __int64 v29; // x20
  char v30; // w21
  __int64 v31; // x2
  void (__fastcall *v32)(__int64, __int64, __int64); // x3
  unsigned int v33; // w22
  __int64 v34; // x0
  __int64 v35; // x25
  char *v36; // x4
  unsigned int v37; // w23
  _QWORD *v38; // x0
  __int64 v39; // x5
  char *v40; // x1
  __int64 v41; // x3
  __int64 v42; // x3
  unsigned int v43; // w24
  __int64 v44; // x3
  __int64 v45; // x4
  __int64 v46; // x3
  __int64 v47; // x2
  __int64 v48; // x1
  const char *v49; // x22
  __int64 v50; // x0
  char v51; // w23
  __int64 v52; // x2
  void (__fastcall *v53)(__int64, __int64, __int64); // x3
  __int64 v54; // x1
  __int64 j; // x22
  __int64 v56; // x0
  char v57; // w23
  __int64 v58; // x2
  void (__fastcall *v59)(__int64, __int64, __int64); // x3
  __int64 v60; // x1
  const char *v61; // x22
  __int64 v62; // x0
  char v63; // w23
  __int64 v64; // x2
  void (__fastcall *v65)(__int64, __int64, __int64); // x3
  __int64 v66; // x1
  __int64 k; // x22
  __int64 v68; // x0
  char v69; // w23
  __int64 v70; // x2
  void (__fastcall *v71)(__int64, __int64, __int64); // x3
  __int64 v72; // x1
  __int64 m; // x22
  __int64 v74; // x0
  char v75; // w23
  __int64 v76; // x2
  void (__fastcall *v77)(__int64, __int64, __int64); // x3
  __int64 v78; // x1
  __int64 n; // x22
  __int64 v80; // x0
  char v81; // w23
  __int64 v82; // x2
  void (__fastcall *v83)(__int64, __int64, __int64); // x3
  __int64 v84; // x1
  const char *v85; // x22
  __int64 v86; // x0
  char v87; // w23
  __int64 v88; // x2
  void (__fastcall *v89)(__int64, __int64, __int64); // x3
  __int64 v90; // x22
  __int64 v91; // x23
  __int64 v92; // x1
  __int64 v93; // x20
  char v94; // w21
  __int64 v95; // x2
  void (__fastcall *v96)(__int64, __int64, __int64); // x3
  __int64 v97; // x4
  __int64 *v98; // x1
  int v99; // w2
  int v100; // w23
  __int64 v101; // x0
  __int64 v102; // x2
  __int64 v103; // x2
  int v104; // w0
  __int64 v105; // x23
  __int64 v106; // x24
  __int64 v107; // x22
  __int64 v108; // x1
  __int64 v109; // x0
  __int64 v110; // x1
  __int64 v111; // x0
  __int64 v112; // x20
  __int64 v113; // x1
  __int64 v114; // x3
  __int64 v115; // x1
  __int64 v116; // x1
  __int64 v117; // x1
  unsigned int v118; // w22
  __int64 v119; // x1
  __int64 v120; // x1
  __int64 v121; // x0
  __int64 v122; // x1
  __int64 v123; // x0
  __int64 v124; // x1
  char v125; // w20
  __int64 v126; // x23
  __int64 v127; // x1
  __int64 v128; // x20
  char v129; // w21
  __int64 v130; // x2
  void (__fastcall *v131)(__int64, __int64, __int64); // x3
  __int64 v132; // x1
  const char *v133; // x22
  __int64 v134; // x0
  char v135; // w23
  __int64 v136; // x2
  void (__fastcall *v137)(__int64, __int64, __int64); // x3
  __int64 v138; // x1
  __int64 kk; // x22
  __int64 v140; // x0
  char v141; // w23
  __int64 v142; // x2
  void (__fastcall *v143)(__int64, __int64, __int64); // x3
  __int64 v144; // x1
  const char *v145; // x22
  __int64 v146; // x0
  char v147; // w23
  __int64 v148; // x2
  void (__fastcall *v149)(__int64, __int64, __int64); // x3
  __int64 v150; // x1
  __int64 mm; // x22
  __int64 v152; // x0
  char v153; // w23
  __int64 v154; // x2
  void (__fastcall *v155)(__int64, __int64, __int64); // x3
  __int64 v156; // x1
  const char *v157; // x22
  __int64 v158; // x0
  char v159; // w23
  __int64 v160; // x2
  void (__fastcall *v161)(__int64, __int64, __int64); // x3
  __int64 v162; // x1
  const char *v163; // x21
  __int64 v164; // x0
  char v165; // w22
  __int64 v166; // x2
  void (__fastcall *v167)(__int64, __int64, __int64); // x3
  __int64 v168; // x1
  __int64 nn; // x22
  __int64 v170; // x0
  char v171; // w23
  __int64 v172; // x2
  void (__fastcall *v173)(__int64, __int64, __int64); // x3
  __int64 v174; // x1
  __int64 i1; // x22
  __int64 v176; // x0
  char v177; // w23
  __int64 v178; // x2
  void (__fastcall *v179)(__int64, __int64, __int64); // x3
  int v180; // w22
  __int64 v181; // x25
  int v182; // w20
  __int64 v183; // x1
  __int64 v184; // x1
  __int64 v185; // x1
  __int64 v186; // x3
  __int64 v187; // x1
  __int64 v188; // x3
  __int64 v189; // x1
  __int64 v190; // x0
  __int64 v191; // x1
  __int64 v192; // x0
  __int64 v193; // x1
  __int64 v194; // x0
  __int64 v195; // x1
  const char *v196; // x22
  __int64 v197; // x0
  char v198; // w23
  __int64 v199; // x2
  void (__fastcall *v200)(__int64, __int64, __int64); // x3
  _DWORD *v201; // x0
  _DWORD *v202; // x2
  _QWORD *v203; // x20
  __int64 v204; // x24
  __int64 v205; // x1
  const char *v206; // x20
  int v207; // w23
  __int64 v208; // x0
  char v209; // w21
  __int64 v210; // x2
  void (__fastcall *v211)(__int64, __int64, __int64); // x3
  __int64 v212; // x1
  const char *v213; // x22
  __int64 v214; // x0
  char v215; // w23
  __int64 v216; // x2
  void (__fastcall *v217)(__int64, __int64, __int64); // x3
  __int64 v218; // x1
  __int64 i; // x22
  __int64 v220; // x0
  char v221; // w23
  __int64 v222; // x2
  void (__fastcall *v223)(__int64, __int64, __int64); // x3
  const char *v224; // x22
  __int64 v225; // x1
  __int64 v226; // x0
  char v227; // w23
  __int64 v228; // x2
  void (__fastcall *v229)(__int64, __int64, __int64); // x3
  __int64 v230; // x2
  unsigned __int64 v231; // x22
  __int64 v232; // x1
  __int64 v233; // x21
  __int64 v234; // x2
  __int64 v235; // x20
  __int64 v236; // x1
  __int64 v237; // x0
  __int64 v238; // x1
  __int64 v239; // x0
  __int64 v240; // x2
  __int64 v241; // x1
  __int64 v242; // x3
  __int64 v243; // x4
  __int64 v244; // x3
  __int64 v245; // x1
  __int64 v246; // x1
  __int64 v247; // x22
  int *v248; // x20
  __int64 v249; // x0
  __int64 v250; // x3
  __int64 v251; // x23
  __int64 v252; // x22
  __int64 v253; // x1
  __int64 jj; // x22
  __int64 v255; // x0
  char v256; // w23
  __int64 v257; // x2
  void (__fastcall *v258)(__int64, __int64, __int64); // x3
  __int64 v259; // x1
  __int64 ii; // x22
  __int64 v261; // x0
  char v262; // w23
  __int64 v263; // x2
  void (__fastcall *v264)(__int64, __int64, __int64); // x3
  __int64 v265; // x2
  __int64 v266; // x3
  const char *v267; // x0
  __int64 v268; // x22
  int v269; // w0
  __int64 v270; // x2
  __int64 v271; // x22
  const char *v272; // x24
  __int64 v273; // x2
  void (__fastcall *v274)(__int64, __int64, __int64); // x3
  void (__fastcall *v275)(__int64); // x3
  __int64 v276; // x2
  void (__fastcall *v277)(__int64, __int64, __int64); // x3
  __int64 v278; // x2
  void (__fastcall *v279)(__int64, __int64, __int64); // x3
  __int64 v280; // x2
  void (__fastcall *v281)(__int64, __int64, __int64); // x3
  void (__fastcall *v282)(__int64, __int64, __int64); // x3
  __int64 v283; // x2
  __int64 v284; // x1
  __int64 v285; // x0
  __int64 v286; // x1
  __int64 v287; // x0
  char *v288; // x20
  __int64 v289; // x22
  __int64 v290; // x1
  char *v291; // x22
  char v292; // w21
  __int64 v293; // x2
  void (__fastcall *v294)(__int64, __int64, __int64); // x3
  __int64 v295; // x2
  __int64 v296; // x2
  __int64 v297; // x2
  __int64 v298; // x20
  size_t v299; // x23
  __int64 v300; // x1
  __int64 v301; // x0
  char v302; // w21
  __int64 v303; // x2
  void (__fastcall *v304)(__int64, __int64, __int64); // x3
  __int64 v305; // x0
  __int64 v306; // x1
  __int64 v307; // x0
  __int64 v308; // x1
  unsigned int v309; // w2
  __int64 v310; // x20
  size_t v311; // x23
  __int64 v312; // x1
  __int64 v313; // x0
  char v314; // w21
  __int64 v315; // x2
  void (__fastcall *v316)(__int64, __int64, __int64); // x3
  __int64 v317; // x2
  void (__fastcall *v318)(__int64, __int64, __int64); // x3
  __int64 v319; // x0
  __int64 v320; // x1
  __int64 v321; // x4
  __int64 v322; // x1
  __int64 v323; // x0
  void (__fastcall *v324)(__int64); // x3
  __int64 v325; // x22
  __int64 v326; // x23
  __int64 v327; // x1
  __int64 v328; // x20
  char v329; // w21
  __int64 v330; // x2
  void (__fastcall *v331)(__int64, __int64, __int64); // x3
  __int64 v332; // x4
  __int64 v333; // x3
  __int64 v334; // x1
  __int64 v335; // x1
  __int64 v336; // x2
  void (__fastcall *v337)(__int64, __int64, __int64); // x3
  __int64 v338; // x3
  __int64 v339; // x1
  __int64 v340; // x3
  __int64 v341; // x1
  __int64 v342; // x0
  __int64 v343; // x1
  __int64 v344; // x2
  __int64 v345; // x20
  size_t v346; // x23
  __int64 v347; // x1
  __int64 v348; // x0
  char v349; // w21
  __int64 v350; // x2
  void (__fastcall *v351)(__int64, __int64, __int64); // x3
  __int64 v352; // x2
  void (__fastcall *v353)(__int64, __int64, __int64); // x3
  __int64 v354; // x0
  __int64 v355; // x0
  __int64 v356; // x1
  __int64 v357; // x4
  __int64 v358; // x1
  __int64 v359; // x0
  __int64 v360; // x1
  __int64 v361; // x2
  void (__fastcall *v362)(__int64, __int64, __int64); // x3
  int v363; // w5
  _QWORD *v364; // x6
  _QWORD *v365; // x0
  _QWORD *v366; // x4
  __int64 v367; // t1
  __int64 v368; // x1
  _QWORD *v369; // x3
  _QWORD *v370; // x0
  int v371; // w5
  int v372; // w6
  int v373; // w1
  int v374; // w6
  __int64 v375; // x5
  int v376; // w7
  _QWORD *v377; // x4
  const char *v378; // x23
  int v379; // w0
  __int64 v380; // x1
  __int64 v381; // x1
  __int64 v382; // x1
  __int64 v383; // x1
  int v384; // w0
  unsigned __int64 v385; // x1
  int v386; // w0
  unsigned __int8 *v387; // x21
  unsigned __int64 v388; // x22
  __int64 v389; // x1
  int v390; // w20
  unsigned __int8 *v391; // x23
  unsigned __int64 v392; // x2
  int v393; // w0
  int v394; // w1
  __int64 v395; // x2
  void (__fastcall *v396)(__int64, __int64, __int64); // x3
  __int64 v397; // x2
  void (__fastcall *v398)(__int64, __int64, __int64); // x3
  __int64 v399; // x2
  void (__fastcall *v400)(__int64, __int64, __int64); // x3
  __int64 v401; // x2
  void (__fastcall *v402)(__int64, __int64, __int64); // x3
  __int64 v403; // x2
  void (__fastcall *v404)(__int64, __int64, __int64); // x3
  __int64 v405; // x1
  __int64 v406; // x2
  void (__fastcall *v407)(__int64, __int64, __int64); // x3
  void (__fastcall *v408)(__int64, __int64, __int64); // x3
  __int64 v409; // x2
  void (__fastcall *v410)(__int64, __int64, __int64); // x4
  __int64 v411; // x2
  void (__fastcall *v412)(__int64, __int64, __int64); // x3
  __int64 v413; // x2
  __int64 v414; // x0
  __int64 v415; // x2
  void (__fastcall *v416)(__int64, __int64, __int64); // x3
  __int64 v417; // x2
  void (__fastcall *v418)(__int64, __int64, __int64); // x3
  __int64 v419; // x2
  void (__fastcall *v420)(__int64, __int64, __int64); // x3
  __int64 v421; // x2
  void (__fastcall *v422)(__int64, __int64, __int64); // x3
  __int64 v423; // x2
  void (__fastcall *v424)(__int64, __int64, __int64); // x3
  __int64 v425; // x2
  void (__fastcall *v426)(__int64, __int64, __int64); // x3
  void (__fastcall *v427)(__int64, __int64, __int64); // x4
  __int64 v428; // x2
  void (__fastcall *v429)(__int64); // x3
  void (__fastcall *v430)(__int64, __int64, __int64); // x4
  __int64 v431; // x2
  void (__fastcall *v432)(__int64, __int64, __int64); // x3
  __int64 v433; // x2
  __int64 v434; // x0
  __int64 v435; // x2
  void (__fastcall *v436)(__int64, __int64, __int64); // x3
  __int64 v437; // x2
  void (__fastcall *v438)(__int64, __int64, __int64); // x3
  __int64 v439; // x2
  void (__fastcall *v440)(__int64, __int64, __int64); // x3
  __int64 v441; // x4
  __int64 v442; // x3
  __int64 v443; // x2
  __int64 v444; // kr18_8
  void (__fastcall *v445)(__int64, __int64, __int64); // x3
  __int64 v446; // x2
  __int64 v447; // x0
  void (__fastcall *v448)(__int64); // x3
  void (__fastcall *v449)(__int64, __int64, __int64); // x4
  __int64 v450; // x2
  void (__fastcall *v451)(__int64); // x3
  void (__fastcall *v452)(__int64, __int64, __int64); // x4
  __int64 v453; // x2
  void (__fastcall *v454)(__int64, __int64, __int64); // x3
  __int64 v455; // x2
  __int64 v456; // x0
  void (__fastcall *v457)(__int64, __int64, __int64); // x3
  __int64 v458; // x2
  __int64 v459; // x0
  void (__fastcall *v460)(__int64); // x3
  void (__fastcall *v461)(__int64, __int64, __int64); // x4
  __int64 v462; // x2
  __int64 v463; // x2
  void (__fastcall *v464)(__int64, __int64, __int64); // x3
  void (__fastcall *v465)(__int64, __int64, __int64); // x4
  __int64 v466; // x2
  __int64 v467; // x0
  void (__fastcall *v468)(__int64); // x3
  __int64 v469; // x2
  void (__fastcall *v470)(__int64, __int64, __int64); // x3
  __int64 v471; // x1
  __int64 v472; // x2
  void (__fastcall *v473)(__int64, __int64, __int64); // x3
  void (__fastcall *v474)(__int64, __int64, __int64); // x4
  __int64 v475; // x2
  void (__fastcall *v476)(__int64, __int64, __int64); // x3
  __int64 v477; // x2
  __int64 v478; // x0
  void (__fastcall *v479)(__int64); // x3
  void (__fastcall *v480)(__int64, __int64, __int64); // x4
  __int64 v481; // x2
  __int64 v482; // x0
  void (__fastcall *v483)(__int64); // x3
  void (__fastcall *v484)(__int64, __int64, __int64); // x4
  __int64 v485; // x2
  void (__fastcall *v486)(__int64, __int64, __int64); // x3
  __int64 v487; // x2
  void (__fastcall *v488)(__int64); // x3
  void (__fastcall *v489)(__int64, __int64, __int64); // x3
  __int64 v490; // x2
  void (__fastcall *v491)(__int64, __int64, __int64); // x3
  __int64 v492; // x2
  void (__fastcall *v493)(__int64, __int64, __int64); // x3
  __int64 v494; // x2
  void (__fastcall *v495)(__int64, __int64, __int64); // x3
  __int64 v496; // x2
  void (__fastcall *v497)(__int64, __int64, __int64); // x3
  __int64 v498; // x2
  __int64 v499; // x0
  void (__fastcall *v500)(__int64); // x3
  void (__fastcall *v501)(__int64, __int64, __int64); // x3
  __int64 v502; // x2
  void (__fastcall *v503)(__int64, __int64, __int64); // x4
  __int64 v504; // x2
  __int64 v505; // x1
  __int64 v506; // x1
  void (__fastcall *v507)(__int64, __int64, __int64); // x3
  __int64 v508; // x2
  int v509; // w24
  __int64 v510; // x6
  char *v511; // x3
  char *v512; // x2
  int v513; // w5
  __int64 v514; // x1
  __int64 v515; // x1
  __int64 v516; // x2
  char *v517; // x6
  __int64 v518; // x1
  __int64 v519; // x1
  unsigned int *v520; // x6
  char *v521; // x20
  char *v522; // x20
  int v523; // w24
  char *v524; // x20
  void (__fastcall *v525)(__int64, __int64, __int64); // x3
  __int64 v526; // x2
  void (__fastcall *v527)(__int64, __int64, __int64); // x3
  __int64 v528; // x2
  __int64 v529; // x1
  char v530; // w20
  void (__fastcall *v531)(__int64, __int64, __int64); // x3
  __int64 v532; // x2
  int v533; // w0
  __int64 v534; // [xsp+58h] [xbp+58h]
  __int64 v535; // [xsp+58h] [xbp+58h]
  _QWORD v536[2]; // [xsp+60h] [xbp+60h] BYREF
  char s[8]; // [xsp+70h] [xbp+70h] BYREF
  unsigned int *v538; // [xsp+78h] [xbp+78h]
  unsigned int v539; // [xsp+80h] [xbp+80h]
  __int64 v540; // [xsp+88h] [xbp+88h]
  _QWORD v541[4]; // [xsp+90h] [xbp+90h] BYREF
  _QWORD *v542; // [xsp+B0h] [xbp+B0h] BYREF
  unsigned int *v543; // [xsp+B8h] [xbp+B8h]
  __int64 v544; // [xsp+C0h] [xbp+C0h]
  __int64 v545; // [xsp+C8h] [xbp+C8h]
  _QWORD *v546; // [xsp+D0h] [xbp+D0h] BYREF
  unsigned int *v547; // [xsp+D8h] [xbp+D8h]
  __int64 v548; // [xsp+E0h] [xbp+E0h]
  __int64 v549; // [xsp+E8h] [xbp+E8h]

  v4 = a3;
  v6 = a2;
  if ( a3 == nullptr )
    goto LABEL_9;
  result = *(unsigned int *)(a1 + 304);
  if ( (_DWORD)result != 0 )
    return result;
  result = *a3;
  switch ( (int)result )
  {
    case 0:
      if ( (a2 & 4) != 0 )
      {
        v387 = *((unsigned __int8 **)a3 + 1);
        v388 = (unsigned __int64)&v387[a3[4]];
        if ( (unsigned __int64)v387 >= v388 )
          return result;
LABEL_515:
        v390 = *v387;
        if ( (__int64)(v388 - (_QWORD)v387) <= 3 )
          goto LABEL_511;
        if ( v390 != 95 )
          goto LABEL_511;
        if ( v387[1] != 95 )
          goto LABEL_511;
        LOBYTE(v390) = 95;
        if ( v387[2] != 85 )
          goto LABEL_511;
        v391 = v387 + 3;
        if ( v388 <= (unsigned __int64)(v387 + 3) )
          goto LABEL_511;
        v392 = 0;
        while ( 1 )
        {
          v394 = *v391;
          v393 = v394 - 48;
          if ( (unsigned __int8)(v394 - 48) > 9u )
          {
            if ( (unsigned __int8)(v394 - 65) <= 5u )
            {
              v393 = v394 - 55;
            }
            else
            {
              if ( (unsigned __int8)(v394 - 97) > 5u )
              {
                if ( v388 > (unsigned __int64)v391 && v394 == 95 && v392 <= 0xFF )
                {
                  v529 = *(_QWORD *)(a1 + 256);
                  v530 = v392;
                  if ( v529 == 255 )
                  {
                    v531 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
                    v532 = *(_QWORD *)(a1 + 280);
                    *(_BYTE *)(a1 + 255) = 0;
                    v531(a1, 255, v532);
                    *(_QWORD *)(a1 + 256) = 0;
                    v529 = 0;
                    ++*(_QWORD *)(a1 + 312);
                  }
                  result = v529 + 1;
                  *(_QWORD *)(a1 + 256) = v529 + 1;
                  *(_BYTE *)(a1 + v529) = v530;
                  v387 = v391;
                  *(_BYTE *)(a1 + 264) = v530;
                  goto LABEL_514;
                }
LABEL_648:
                LOBYTE(v390) = 95;
LABEL_511:
                v389 = *(_QWORD *)(a1 + 256);
                if ( v389 == 255 )
                {
                  v395 = *(_QWORD *)(a1 + 280);
                  v396 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
                  *(_BYTE *)(a1 + 255) = 0;
                  v396(a1, 255, v395);
                  result = 1;
                  v389 = 0;
                  ++*(_QWORD *)(a1 + 312);
                }
                else
                {
                  result = v389 + 1;
                }
                *(_QWORD *)(a1 + 256) = result;
                *(_BYTE *)(a1 + v389) = v390;
                *(_BYTE *)(a1 + 264) = v390;
LABEL_514:
                if ( v388 <= (unsigned __int64)++v387 )
                  return result;
                goto LABEL_515;
              }
              v393 = v394 - 87;
            }
          }
          ++v391;
          v392 = v393 + 16 * v392;
          if ( v391 == (unsigned __int8 *)v388 )
            goto LABEL_648;
        }
      }
      v8 = (int)a3[4];
      v9 = *((_QWORD *)a3 + 1);
      if ( a3[4] != 0 )
      {
        v10 = *(_QWORD *)(a1 + 256);
        v11 = 0;
        do
        {
          v12 = *(_BYTE *)(v9 + v11);
          if ( v10 == 255 )
          {
            v13 = *(_QWORD *)(a1 + 280);
            v14 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v14(a1, 255, v13);
            v10 = 1;
            result = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            result = v10++;
          }
          *(_QWORD *)(a1 + 256) = v10;
          ++v11;
          *(_BYTE *)(a1 + result) = v12;
          *(_BYTE *)(a1 + 264) = v12;
        }
        while ( v8 != v11 );
      }
      return result;
    case 1:
    case 2:
      sub_24100(a1, a2, *((_QWORD *)a3 + 1));
      v15 = *(_QWORD *)(a1 + 256);
      if ( (v6 & 4) != 0 )
      {
        if ( v15 == 255 )
        {
          v463 = *(_QWORD *)(a1 + 280);
          v464 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v464(a1, 255, v463);
          v355 = 1;
          v15 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v355 = v15 + 1;
        }
        *(_QWORD *)(a1 + 256) = v355;
        *(_BYTE *)(a1 + v15) = 46;
        *(_BYTE *)(a1 + 264) = 46;
LABEL_22:
        v18 = *((_DWORD **)v4 + 2);
        if ( *v18 == 70 )
        {
          v535 = *((_QWORD *)v4 + 2);
          sub_1C258(a1, "{default arg#");
          sub_1C460(a1, *(_DWORD *)(v535 + 16) + 1);
          sub_1C258(a1, "}::");
          v18 = *(_DWORD **)(v535 + 8);
        }
        return sub_24100(a1, v6, v18);
      }
      if ( v15 == 255 )
      {
        v469 = *(_QWORD *)(a1 + 280);
        v470 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v470(a1, 255, v469);
        v471 = *(_QWORD *)(a1 + 312);
        v16 = 1;
        *(_BYTE *)a1 = 58;
        *(_QWORD *)(a1 + 312) = v471 + 1;
      }
      else
      {
        v16 = v15 + 1;
        *(_QWORD *)(a1 + 256) = v15 + 1;
        *(_BYTE *)(a1 + v15) = 58;
        *(_BYTE *)(a1 + 264) = 58;
        if ( v15 == 254 )
        {
          v280 = *(_QWORD *)(a1 + 280);
          v281 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v281(a1, 255, v280);
          v17 = 1;
          v16 = 0;
          ++*(_QWORD *)(a1 + 312);
          goto LABEL_21;
        }
      }
      v17 = v16 + 1;
LABEL_21:
      *(_QWORD *)(a1 + 256) = v17;
      *(_BYTE *)(a1 + v16) = 58;
      *(_BYTE *)(a1 + 264) = 58;
      goto LABEL_22;
    case 3:
      v19 = *(_QWORD *)(a1 + 296);
      *(_QWORD *)(a1 + 296) = 0;
      v20 = *((unsigned int **)a3 + 1);
      if ( v20 == nullptr )
        goto LABEL_33;
      v21 = *v20;
      v22 = *(_QWORD *)(a1 + 288);
      v23 = *v20 - 28;
      *(_QWORD *)s = 0;
      *(_QWORD *)(a1 + 296) = s;
      v538 = v20;
      v539 = 0;
      v540 = v22;
      if ( v23 > 4 )
      {
        v509 = 1;
      }
      else
      {
        v20 = *((unsigned int **)v20 + 1);
        if ( v20 == nullptr )
          goto LABEL_33;
        v21 = *v20;
        v541[0] = s;
        *(_QWORD *)(a1 + 296) = v541;
        v541[1] = v20;
        LODWORD(v541[2]) = 0;
        v541[3] = v22;
        if ( v21 - 28 > 4 )
        {
          v509 = 2;
        }
        else
        {
          v20 = *((unsigned int **)v20 + 1);
          if ( v20 == nullptr )
            goto LABEL_33;
          v21 = *v20;
          v24 = *v20 - 28;
          v542 = v541;
          v543 = v20;
          *(_QWORD *)(a1 + 296) = &v542;
          LODWORD(v544) = 0;
          v545 = v22;
          if ( v24 > 4 )
          {
            v509 = 3;
          }
          else
          {
            v20 = *((unsigned int **)v20 + 1);
            if ( v20 == nullptr )
              goto LABEL_33;
            v21 = *v20;
            v25 = *v20 - 28;
            v546 = &v542;
            v547 = v20;
            *(_QWORD *)(a1 + 296) = &v546;
            LODWORD(v548) = 0;
            v549 = v22;
            if ( v25 <= 4 )
              goto LABEL_33;
            v509 = 4;
          }
        }
      }
      if ( v21 == 4 )
      {
        v536[1] = v20;
        v536[0] = v22;
        *(_QWORD *)(a1 + 288) = v536;
        goto LABEL_632;
      }
      if ( v21 != 2 )
        goto LABEL_632;
      v510 = *((_QWORD *)v20 + 2);
      if ( *(_DWORD *)v510 == 70 )
        v510 = *(_QWORD *)(v510 + 8);
      if ( (unsigned int)(*(_DWORD *)v510 - 28) > 4 )
        goto LABEL_632;
      if ( v509 != 4 )
      {
        v511 = &s[32 * v509];
        *(_QWORD *)(a1 + 296) = v511;
        v512 = &s[32 * (v509 - 1)];
        v513 = v509 + 1;
        v514 = *((_QWORD *)v512 + 1);
        *(_QWORD *)v511 = *(_QWORD *)v512;
        *((_QWORD *)v511 + 1) = v514;
        v515 = *((_QWORD *)v512 + 3);
        *((_QWORD *)v511 + 2) = *((_QWORD *)v512 + 2);
        *((_QWORD *)v511 + 3) = v515;
        *(_QWORD *)v511 = v512;
        *((_QWORD *)v512 + 1) = v510;
        *((_DWORD *)v512 + 4) = 0;
        *((_QWORD *)v512 + 3) = v22;
        v516 = *(_QWORD *)(v510 + 8);
        if ( (unsigned int)(*(_DWORD *)v516 - 28) > 4 )
          goto LABEL_631;
        if ( v509 == 3 )
          goto LABEL_33;
        v513 = v509 + 2;
        v517 = &s[32 * (v509 + 1)];
        *(_QWORD *)(a1 + 296) = v517;
        v518 = *((_QWORD *)v511 + 1);
        *(_QWORD *)v517 = *(_QWORD *)v511;
        *((_QWORD *)v517 + 1) = v518;
        v519 = *((_QWORD *)v511 + 3);
        *((_QWORD *)v517 + 2) = *((_QWORD *)v511 + 2);
        *((_QWORD *)v517 + 3) = v519;
        *(_QWORD *)v517 = v511;
        *((_QWORD *)v511 + 1) = v516;
        *((_DWORD *)v511 + 4) = 0;
        *((_QWORD *)v511 + 3) = v22;
        v520 = *(unsigned int **)(v516 + 8);
        if ( *v520 - 28 > 4 )
        {
LABEL_631:
          v509 = v513;
LABEL_632:
          sub_24100(a1, v6, *((_QWORD *)v4 + 2));
          if ( *v20 == 4 )
            *(_QWORD *)(a1 + 288) = v536[0];
          v521 = &s[32 * (v509 - 1)];
          result = *((unsigned int *)v521 + 4);
          if ( (_DWORD)result == 0 )
          {
            sub_1BF54(a1, 32);
            result = sub_27B0C(a1, v6, *((_QWORD *)v521 + 1));
          }
          if ( v509 == 1 )
            goto LABEL_644;
          v522 = &s[32 * (v509 - 2)];
          result = *((unsigned int *)v522 + 4);
          if ( (_DWORD)result == 0 )
          {
            sub_1BF54(a1, 32);
            result = sub_27B0C(a1, v6, *((_QWORD *)v522 + 1));
          }
          if ( v509 == 2 )
            goto LABEL_644;
          v523 = v509 - 3;
          v524 = &s[32 * v523];
          result = *((unsigned int *)v524 + 4);
          if ( (_DWORD)result == 0 )
          {
            sub_1BF54(a1, 32);
            result = sub_27B0C(a1, v6, *((_QWORD *)v524 + 1));
          }
          if ( v523 == 0 || (result = v539, v539 != 0) )
          {
LABEL_644:
            *(_QWORD *)(a1 + 296) = v19;
          }
          else
          {
            sub_1BF54(a1, 32);
            result = sub_27B0C(a1, v6, v538);
            *(_QWORD *)(a1 + 296) = v19;
          }
          return result;
        }
        if ( v509 != 2 )
        {
          v547 = v543;
          v548 = v544;
          v549 = v545;
          *(_QWORD *)(a1 + 296) = &v546;
          v543 = v520;
          v546 = &v542;
          LODWORD(v544) = 0;
          v545 = v22;
          if ( (unsigned int)(**((_DWORD **)v520 + 1) - 28) > 4 )
          {
            v513 = 4;
            goto LABEL_631;
          }
        }
      }
LABEL_33:
      *(_DWORD *)(a1 + 304) = 1;
      return 1;
    case 4:
      v105 = *(_QWORD *)(a1 + 352);
      v106 = *(_QWORD *)(a1 + 296);
      *(_QWORD *)(a1 + 352) = a3;
      *(_QWORD *)(a1 + 296) = 0;
      v107 = *((_QWORD *)a3 + 1);
      if ( (a2 & 4) != 0
        && *(_DWORD *)v107 == 0
        && *(_DWORD *)(v107 + 16) == 6
        && strncmp(*(const char **)(v107 + 8), "JArray", 6u) == 0 )
      {
        sub_24100(a1, v6, *((_QWORD *)v4 + 2));
        result = sub_1C258(a1, "[]");
      }
      else
      {
        sub_24100(a1, v6, v107);
        if ( *(_BYTE *)(a1 + 264) == 60 )
          sub_1BF54(a1, 32);
        v108 = *(_QWORD *)(a1 + 256);
        if ( v108 == 255 )
        {
          v421 = *(_QWORD *)(a1 + 280);
          v422 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v422(a1, 255, v421);
          v109 = 1;
          v108 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v109 = v108 + 1;
        }
        *(_QWORD *)(a1 + 256) = v109;
        *(_BYTE *)(a1 + v108) = 60;
        *(_BYTE *)(a1 + 264) = 60;
        sub_24100(a1, v6, *((_QWORD *)v4 + 2));
        if ( *(_BYTE *)(a1 + 264) == 62 )
          sub_1BF54(a1, 32);
        v110 = *(_QWORD *)(a1 + 256);
        if ( v110 == 255 )
        {
          v419 = *(_QWORD *)(a1 + 280);
          v420 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v420(a1, 255, v419);
          v111 = 1;
          v110 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v111 = v110 + 1;
        }
        *(_QWORD *)(a1 + 256) = v111;
        result = 62;
        *(_BYTE *)(a1 + v110) = 62;
        *(_BYTE *)(a1 + 264) = 62;
      }
      *(_QWORD *)(a1 + 296) = v106;
      *(_QWORD *)(a1 + 352) = v105;
      return result;
    case 5:
      v201 = (_DWORD *)sub_1C054(a1, (__int64 *)a3 + 1);
      v202 = v201;
      if ( v201 == nullptr )
        goto LABEL_9;
      if ( *v201 == 47 )
      {
        v386 = *(_DWORD *)(a1 + 308);
        while ( v386 > 0 )
        {
          v202 = *((_DWORD **)v202 + 2);
          --v386;
          if ( v202 == nullptr || *v202 != 47 )
            goto LABEL_9;
        }
        if ( v386 != 0 )
          goto LABEL_9;
        v202 = *((_DWORD **)v202 + 1);
        if ( v202 == nullptr )
          goto LABEL_9;
      }
      v203 = *(_QWORD **)(a1 + 288);
      *(_QWORD *)(a1 + 288) = *v203;
      result = sub_24100(a1, v6, v202);
      *(_QWORD *)(a1 + 288) = v203;
      return result;
    case 6:
      v112 = *((_QWORD *)a3 + 1);
      v113 = *(_QWORD *)(a1 + 256);
      if ( v112 == 0 )
      {
        if ( v113 == 255 )
        {
          v457 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v458 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v457(a1, 255, v458);
          v459 = *(_QWORD *)(a1 + 312);
          *(_BYTE *)a1 = 116;
          v115 = 2;
          *(_QWORD *)(a1 + 312) = v459 + 1;
          *(_BYTE *)(a1 + 1) = 104;
        }
        else
        {
          v114 = v113 + 1;
          *(_QWORD *)(a1 + 256) = v113 + 1;
          *(_BYTE *)(a1 + v113) = 116;
          *(_BYTE *)(a1 + 264) = 116;
          if ( v113 == 254 )
          {
            v461 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            v462 = *(_QWORD *)(a1 + 280);
            *(_BYTE *)(a1 + 255) = 0;
            v461(a1, 255, v462);
            *(_BYTE *)a1 = 104;
            result = 2;
            ++*(_QWORD *)(a1 + 312);
            *(_BYTE *)(a1 + 1) = 105;
            goto LABEL_145;
          }
          v115 = v113 + 2;
          *(_QWORD *)(a1 + 256) = v114 + 1;
          *(_BYTE *)(a1 + v114) = 104;
          *(_BYTE *)(a1 + 264) = 104;
          if ( v114 == 254 )
          {
            v460 = *(void (__fastcall **)(__int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v460(a1);
            *(_BYTE *)a1 = 105;
            result = 1;
            ++*(_QWORD *)(a1 + 312);
            goto LABEL_145;
          }
        }
        result = v115 + 1;
        *(_QWORD *)(a1 + 256) = v115 + 1;
        *(_BYTE *)(a1 + v115) = 105;
        *(_BYTE *)(a1 + 264) = 105;
        if ( v115 == 254 )
        {
          v278 = *(_QWORD *)(a1 + 280);
          v279 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v279(a1, 255, v278);
          v116 = 1;
          result = 0;
          ++*(_QWORD *)(a1 + 312);
          goto LABEL_146;
        }
LABEL_145:
        v116 = result + 1;
LABEL_146:
        *(_QWORD *)(a1 + 256) = v116;
        *(_BYTE *)(a1 + result) = 115;
        *(_BYTE *)(a1 + 264) = 115;
        return result;
      }
      if ( v113 == 255 )
      {
        v454 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v455 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v454(a1, 255, v455);
        v456 = *(_QWORD *)(a1 + 312);
        *(_BYTE *)a1 = 123;
        v339 = 2;
        *(_QWORD *)(a1 + 312) = v456 + 1;
        *(_BYTE *)(a1 + 1) = 112;
      }
      else
      {
        v338 = v113 + 1;
        *(_QWORD *)(a1 + 256) = v113 + 1;
        *(_BYTE *)(a1 + v113) = 123;
        *(_BYTE *)(a1 + 264) = 123;
        if ( v113 == 254 )
        {
          v452 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v453 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v452(a1, 255, v453);
          *(_BYTE *)a1 = 112;
          v340 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 97;
          goto LABEL_426;
        }
        v339 = v113 + 2;
        *(_QWORD *)(a1 + 256) = v338 + 1;
        *(_BYTE *)(a1 + v338) = 112;
        *(_BYTE *)(a1 + 264) = 112;
        if ( v338 == 254 )
        {
          v451 = *(void (__fastcall **)(__int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v451(a1);
          *(_BYTE *)a1 = 97;
          v341 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 114;
          goto LABEL_427;
        }
      }
      v340 = v339 + 1;
      *(_QWORD *)(a1 + 256) = v339 + 1;
      *(_BYTE *)(a1 + v339) = 97;
      *(_BYTE *)(a1 + 264) = 97;
      if ( v339 == 254 )
      {
        v449 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v450 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v449(a1, 255, v450);
        *(_BYTE *)a1 = 114;
        v342 = 2;
        ++*(_QWORD *)(a1 + 312);
        *(_BYTE *)(a1 + 1) = 109;
        goto LABEL_428;
      }
LABEL_426:
      v341 = v340 + 1;
      *(_QWORD *)(a1 + 256) = v340 + 1;
      *(_BYTE *)(a1 + v340) = 114;
      *(_BYTE *)(a1 + 264) = 114;
      if ( v340 == 254 )
      {
        v448 = *(void (__fastcall **)(__int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v448(a1);
        *(_BYTE *)a1 = 109;
        v342 = 1;
        ++*(_QWORD *)(a1 + 312);
        goto LABEL_428;
      }
LABEL_427:
      v342 = v341 + 1;
      *(_QWORD *)(a1 + 256) = v341 + 1;
      *(_BYTE *)(a1 + v341) = 109;
      *(_BYTE *)(a1 + 264) = 109;
      if ( v341 == 254 )
      {
        v352 = *(_QWORD *)(a1 + 280);
        v353 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v353(a1, 255, v352);
        v343 = 1;
        v342 = 0;
        ++*(_QWORD *)(a1 + 312);
        goto LABEL_429;
      }
LABEL_428:
      v343 = v342 + 1;
LABEL_429:
      *(_QWORD *)(a1 + 256) = v343;
      *(_BYTE *)(a1 + v342) = 35;
      v344 = v112;
      *(_BYTE *)(a1 + 264) = 35;
      v345 = 0;
      sprintf(s, "%ld", v344);
      v346 = strlen(s);
      v347 = *(_QWORD *)(a1 + 256);
      if ( v346 != 0 )
      {
        do
        {
          v349 = s[v345];
          if ( v347 == 255 )
          {
            v350 = *(_QWORD *)(a1 + 280);
            v351 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v351(a1, 255, v350);
            v347 = 1;
            v348 = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            v348 = v347++;
          }
          *(_QWORD *)(a1 + 256) = v347;
          ++v345;
          *(_BYTE *)(a1 + v348) = v349;
          *(_BYTE *)(a1 + 264) = v349;
        }
        while ( v345 != v346 );
      }
      if ( v347 == 255 )
      {
        v472 = *(_QWORD *)(a1 + 280);
        v473 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v473(a1, 255, v472);
        v354 = 1;
        v347 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v354 = v347 + 1;
      }
      *(_QWORD *)(a1 + 256) = v354;
      *(_BYTE *)(a1 + v347) = 125;
      *(_BYTE *)(a1 + 264) = 125;
      return 125;
    case 7:
      return sub_24100(a1, a2, *((_QWORD *)a3 + 2));
    case 8:
      v193 = *(_QWORD *)(a1 + 256);
      if ( v193 == 255 )
      {
        v435 = *(_QWORD *)(a1 + 280);
        v436 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v436(a1, 255, v435);
        v194 = 1;
        v193 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v194 = v193 + 1;
      }
      *(_QWORD *)(a1 + 256) = v194;
      *(_BYTE *)(a1 + v193) = 126;
      *(_BYTE *)(a1 + 264) = 126;
      return sub_24100(a1, v6, *((_QWORD *)v4 + 2));
    case 9:
      v195 = *(_QWORD *)(a1 + 256);
      v196 = "vtable for ";
      do
      {
        v198 = *v196;
        if ( v195 == 255 )
        {
          v199 = *(_QWORD *)(a1 + 280);
          v200 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v200(a1, 255, v199);
          v195 = 1;
          v197 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v197 = v195++;
        }
        *(_QWORD *)(a1 + 256) = v195;
        ++v196;
        *(_BYTE *)(a1 + v197) = v198;
        *(_BYTE *)(a1 + 264) = v198;
      }
      while ( v196 != "" );
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 10:
      v212 = *(_QWORD *)(a1 + 256);
      v213 = "VTT for ";
      do
      {
        v215 = *v213;
        if ( v212 == 255 )
        {
          v216 = *(_QWORD *)(a1 + 280);
          v217 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v217(a1, 255, v216);
          v212 = 1;
          v214 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v214 = v212++;
        }
        *(_QWORD *)(a1 + 256) = v212;
        ++v213;
        *(_BYTE *)(a1 + v214) = v215;
        *(_BYTE *)(a1 + 264) = v215;
      }
      while ( v213 != "" );
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 11:
      v218 = *(_QWORD *)(a1 + 256);
      for ( i = 0; i != 24; ++i )
      {
        v221 = aConstructionVt[i];
        if ( v218 == 255 )
        {
          v222 = *(_QWORD *)(a1 + 280);
          v223 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v223(a1, 255, v222);
          v218 = 1;
          v220 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v220 = v218++;
        }
        *(_QWORD *)(a1 + 256) = v218;
        *(_BYTE *)(a1 + v220) = v221;
        *(_BYTE *)(a1 + 264) = v221;
      }
      sub_24100(a1, v6, *((_QWORD *)v4 + 1));
      v320 = *(_QWORD *)(a1 + 256);
      if ( v320 == 255 )
      {
        v412 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v413 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v412(a1, 255, v413);
        v414 = *(_QWORD *)(a1 + 312);
        v321 = 2;
        *(_BYTE *)a1 = 45;
        *(_QWORD *)(a1 + 312) = v414 + 1;
        *(_BYTE *)(a1 + 1) = 105;
      }
      else
      {
        *(_QWORD *)(a1 + 256) = v320 + 1;
        *(_BYTE *)(a1 + v320) = 45;
        *(_BYTE *)(a1 + 264) = 45;
        if ( v320 == 254 )
        {
          v410 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v411 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v410(a1, 255, v411);
          *(_BYTE *)a1 = 105;
          v322 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 110;
          goto LABEL_401;
        }
        v321 = v320 + 2;
        *(_QWORD *)(a1 + 256) = v320 + 2;
        *(_BYTE *)(a1 + v320 + 1) = 105;
        *(_BYTE *)(a1 + 264) = 105;
        if ( v320 == 253 )
        {
          v408 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v409 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v408(a1, v321, v409);
          *(_BYTE *)a1 = 110;
          v322 = 1;
          ++*(_QWORD *)(a1 + 312);
          goto LABEL_401;
        }
      }
      v322 = v321 + 1;
      *(_QWORD *)(a1 + 256) = v321 + 1;
      *(_BYTE *)(a1 + v321) = 110;
      *(_BYTE *)(a1 + 264) = 110;
      if ( v321 == 254 )
      {
        v324 = *(void (__fastcall **)(__int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v324(a1);
        v323 = 1;
        v322 = 0;
        ++*(_QWORD *)(a1 + 312);
LABEL_402:
        *(_QWORD *)(a1 + 256) = v323;
        *(_BYTE *)(a1 + v322) = 45;
        *(_BYTE *)(a1 + 264) = 45;
        return sub_24100(a1, v6, *((_QWORD *)v4 + 2));
      }
LABEL_401:
      v323 = v322 + 1;
      goto LABEL_402;
    case 12:
      v48 = *(_QWORD *)(a1 + 256);
      v49 = "typeinfo for ";
      do
      {
        v51 = *v49;
        if ( v48 == 255 )
        {
          v52 = *(_QWORD *)(a1 + 280);
          v53 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v53(a1, 255, v52);
          v48 = 1;
          v50 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v50 = v48++;
        }
        *(_QWORD *)(a1 + 256) = v48;
        ++v49;
        *(_BYTE *)(a1 + v50) = v51;
        *(_BYTE *)(a1 + 264) = v51;
      }
      while ( v49 != "" );
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 13:
      v54 = *(_QWORD *)(a1 + 256);
      for ( j = 0; j != 18; ++j )
      {
        v57 = aTypeinfoNameFo[j];
        if ( v54 == 255 )
        {
          v58 = *(_QWORD *)(a1 + 280);
          v59 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v59(a1, 255, v58);
          v54 = 1;
          v56 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v56 = v54++;
        }
        *(_QWORD *)(a1 + 256) = v54;
        *(_BYTE *)(a1 + v56) = v57;
        *(_BYTE *)(a1 + 264) = v57;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 14:
      v60 = *(_QWORD *)(a1 + 256);
      v61 = "typeinfo fn for ";
      do
      {
        v63 = *v61;
        if ( v60 == 255 )
        {
          v64 = *(_QWORD *)(a1 + 280);
          v65 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v65(a1, 255, v64);
          v60 = 1;
          v62 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v62 = v60++;
        }
        *(_QWORD *)(a1 + 256) = v60;
        ++v61;
        *(_BYTE *)(a1 + v62) = v63;
        *(_BYTE *)(a1 + 264) = v63;
      }
      while ( v61 != "" );
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 15:
      v66 = *(_QWORD *)(a1 + 256);
      for ( k = 0; k != 21; ++k )
      {
        v69 = aNonVirtualThun[k];
        if ( v66 == 255 )
        {
          v70 = *(_QWORD *)(a1 + 280);
          v71 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v71(a1, 255, v70);
          v66 = 1;
          v68 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v68 = v66++;
        }
        *(_QWORD *)(a1 + 256) = v66;
        *(_BYTE *)(a1 + v68) = v69;
        *(_BYTE *)(a1 + 264) = v69;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 16:
      v72 = *(_QWORD *)(a1 + 256);
      for ( m = 0; m != 17; ++m )
      {
        v75 = aVirtualThunkTo[m];
        if ( v72 == 255 )
        {
          v76 = *(_QWORD *)(a1 + 280);
          v77 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v77(a1, 255, v76);
          v72 = 1;
          v74 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v74 = v72++;
        }
        *(_QWORD *)(a1 + 256) = v72;
        *(_BYTE *)(a1 + v74) = v75;
        *(_BYTE *)(a1 + 264) = v75;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 17:
      v78 = *(_QWORD *)(a1 + 256);
      for ( n = 0; n != 26; ++n )
      {
        v81 = aCovariantRetur[n];
        if ( v78 == 255 )
        {
          v82 = *(_QWORD *)(a1 + 280);
          v83 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v83(a1, 255, v82);
          v78 = 1;
          v80 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v80 = v78++;
        }
        *(_QWORD *)(a1 + 256) = v78;
        *(_BYTE *)(a1 + v80) = v81;
        *(_BYTE *)(a1 + 264) = v81;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 18:
      v84 = *(_QWORD *)(a1 + 256);
      v85 = "java Class for ";
      do
      {
        v87 = *v85;
        if ( v84 == 255 )
        {
          v88 = *(_QWORD *)(a1 + 280);
          v89 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v89(a1, 255, v88);
          v84 = 1;
          v86 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v86 = v84++;
        }
        *(_QWORD *)(a1 + 256) = v84;
        ++v85;
        *(_BYTE *)(a1 + v86) = v87;
        *(_BYTE *)(a1 + 264) = v87;
      }
      while ( v85 != "" );
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 19:
      sub_1C258(a1, "guard variable for ");
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 20:
      sub_1C258(a1, "TLS init function for ");
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 21:
      sub_1C258(a1, "TLS wrapper function for ");
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 22:
      sub_1C258(a1, "reference temporary #");
      sub_24100(a1, v6, *((_QWORD *)v4 + 2));
      sub_1C258(a1, " for ");
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 23:
      sub_1C258(a1, "hidden alias for ");
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 24:
      v90 = (int)a3[4];
      v91 = *((_QWORD *)a3 + 1);
      if ( a3[4] != 0 )
      {
        v92 = *(_QWORD *)(a1 + 256);
        v93 = 0;
        do
        {
          v94 = *(_BYTE *)(v91 + v93);
          if ( v92 == 255 )
          {
            v95 = *(_QWORD *)(a1 + 280);
            v96 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v96(a1, 255, v95);
            v92 = 1;
            result = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            result = v92++;
          }
          *(_QWORD *)(a1 + 256) = v92;
          ++v93;
          *(_BYTE *)(a1 + result) = v94;
          *(_BYTE *)(a1 + 264) = v94;
        }
        while ( v90 != v93 );
      }
      return result;
    case 25:
    case 26:
    case 27:
      v97 = *(_QWORD *)(a1 + 296);
      if ( v97 == 0 )
      {
        v97 = 0;
        v100 = 0;
        goto LABEL_116;
      }
      v98 = *(__int64 **)(a1 + 296);
      while ( 1 )
      {
        if ( *((_DWORD *)v98 + 4) == 0 )
        {
          v99 = *(_DWORD *)v98[1];
          if ( (unsigned int)(v99 - 25) > 2 )
            goto LABEL_114;
          if ( (_DWORD)result == v99 )
            return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
        }
        v98 = (__int64 *)*v98;
        if ( v98 == nullptr )
        {
LABEL_114:
          v100 = 0;
          goto LABEL_116;
        }
      }
    case 28:
    case 29:
    case 30:
    case 31:
    case 32:
    case 33:
    case 34:
    case 37:
    case 38:
      v97 = *(_QWORD *)(a1 + 296);
      v100 = 0;
      goto LABEL_116;
    case 35:
    case 36:
      v103 = *((_QWORD *)a3 + 1);
      v100 = 0;
      v104 = *(_DWORD *)v103;
      if ( *(_DWORD *)v103 != 5 )
        goto LABEL_123;
      v363 = *(_DWORD *)(a1 + 328);
      v364 = *(_QWORD **)(a1 + 320);
      if ( v363 <= 0 )
        goto LABEL_462;
      if ( v103 == *v364 )
      {
        v366 = *(_QWORD **)(a1 + 320);
LABEL_492:
        v3 = *(_QWORD *)(a1 + 288);
        *(_QWORD *)(a1 + 288) = v366[1];
        v100 = 1;
        v103 = sub_1C054(a1, (__int64 *)(v103 + 8));
        if ( v103 == 0 )
          goto LABEL_8;
        goto LABEL_493;
      }
      v365 = v364 + 2;
      while ( v365 != &v364[2 * (unsigned int)(v363 - 1) + 2] )
      {
        v366 = v365;
        v367 = *v365;
        v365 += 2;
        if ( v103 == v367 )
          goto LABEL_492;
      }
LABEL_462:
      if ( v363 >= *(_DWORD *)(a1 + 332) )
        goto LABEL_653;
      v368 = 2LL * v363;
      v369 = *(_QWORD **)(a1 + 288);
      *(_DWORD *)(a1 + 328) = v363 + 1;
      v364[v368] = v103;
      v370 = &v364[v368 + 1];
      if ( v369 == nullptr )
        goto LABEL_469;
      v371 = *(_DWORD *)(a1 + 344);
      v372 = *(_DWORD *)(a1 + 348);
      if ( v372 <= v371 )
        goto LABEL_653;
      v373 = v371 + 1;
      v374 = v372 + 1;
      v375 = 16LL * v371;
      do
      {
        v376 = v373;
        v377 = (_QWORD *)(*(_QWORD *)(a1 + 336) + v375);
        v377[1] = v369[1];
        *v370 = v377;
        v370 = v377;
        v369 = (_QWORD *)*v369;
        if ( v369 == nullptr )
        {
          *(_DWORD *)(a1 + 344) = v373;
LABEL_469:
          *v370 = 0;
          v100 = 0;
          v103 = sub_1C054(a1, (__int64 *)(v103 + 8));
          if ( v103 == 0 )
          {
LABEL_9:
            *(_DWORD *)(a1 + 304) = 1;
            return 1;
          }
LABEL_493:
          v104 = *(_DWORD *)v103;
          if ( *(_DWORD *)v103 != 47 )
          {
LABEL_123:
            if ( v104 == 35 || *v4 == v104 )
            {
              v97 = *(_QWORD *)(a1 + 296);
              v4 = (unsigned int *)v103;
            }
            else
            {
              if ( v104 == 36 )
              {
                v102 = *(_QWORD *)(v103 + 8);
                v447 = *(_QWORD *)(a1 + 288);
                *(_QWORD *)s = *(_QWORD *)(a1 + 296);
                v538 = v4;
                *(_QWORD *)(a1 + 296) = s;
                v539 = 0;
                v540 = v447;
                if ( v102 != 0 )
                  goto LABEL_118;
                goto LABEL_117;
              }
              v97 = *(_QWORD *)(a1 + 296);
            }
LABEL_116:
            v101 = *(_QWORD *)(a1 + 288);
            *(_QWORD *)s = v97;
            *(_QWORD *)(a1 + 296) = s;
            v538 = v4;
            v539 = 0;
            v540 = v101;
LABEL_117:
            v102 = *((_QWORD *)v4 + 1);
LABEL_118:
            sub_24100(a1, v6, v102);
            if ( v539 == 0 )
              sub_27B0C(a1, v6, v4);
            result = *(_QWORD *)s;
            *(_QWORD *)(a1 + 296) = *(_QWORD *)s;
            if ( v100 != 0 )
              *(_QWORD *)(a1 + 288) = v3;
            return result;
          }
          v384 = *(_DWORD *)(a1 + 308);
          while ( v384 > 0 )
          {
            v103 = *(_QWORD *)(v103 + 16);
            --v384;
            if ( v103 == 0 || *(_DWORD *)v103 != 47 )
              goto LABEL_7;
          }
          if ( v384 == 0 )
          {
            v103 = *(_QWORD *)(v103 + 8);
            if ( v103 != 0 )
            {
              v104 = *(_DWORD *)v103;
              goto LABEL_123;
            }
          }
LABEL_7:
          if ( v100 == 0 )
            goto LABEL_9;
LABEL_8:
          *(_QWORD *)(a1 + 288) = v3;
          goto LABEL_9;
        }
        ++v373;
        v375 += 16;
      }
      while ( v373 != v374 );
      *(_DWORD *)(a1 + 344) = v376;
LABEL_653:
      *(_DWORD *)(a1 + 304) = 1;
      return 1;
    case 39:
      if ( (a2 & 4) != 0 )
      {
        result = *((_QWORD *)a3 + 1);
        v325 = *(int *)(result + 24);
        v326 = *(_QWORD *)(result + 16);
        if ( *(_DWORD *)(result + 24) != 0 )
        {
          v327 = *(_QWORD *)(a1 + 256);
          v328 = 0;
          do
          {
            v329 = *(_BYTE *)(v326 + v328);
            if ( v327 == 255 )
            {
              v330 = *(_QWORD *)(a1 + 280);
              v331 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
              *(_BYTE *)(a1 + 255) = 0;
              v331(a1, 255, v330);
              v327 = 1;
              result = 0;
              ++*(_QWORD *)(a1 + 312);
            }
            else
            {
              result = v327++;
            }
            *(_QWORD *)(a1 + 256) = v327;
            ++v328;
            *(_BYTE *)(a1 + result) = v329;
            *(_BYTE *)(a1 + 264) = v329;
          }
          while ( v325 != v328 );
        }
      }
      else
      {
        result = *((_QWORD *)a3 + 1);
        v26 = *(int *)(result + 8);
        v27 = *(_QWORD *)result;
        if ( *(_DWORD *)(result + 8) != 0 )
        {
          v28 = *(_QWORD *)(a1 + 256);
          v29 = 0;
          do
          {
            v30 = *(_BYTE *)(v27 + v29);
            if ( v28 == 255 )
            {
              v31 = *(_QWORD *)(a1 + 280);
              v32 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
              *(_BYTE *)(a1 + 255) = 0;
              v32(a1, 255, v31);
              v28 = 1;
              result = 0;
              ++*(_QWORD *)(a1 + 312);
            }
            else
            {
              result = v28++;
            }
            *(_QWORD *)(a1 + 256) = v28;
            ++v29;
            *(_BYTE *)(a1 + result) = v30;
            *(_BYTE *)(a1 + 264) = v30;
          }
          while ( v26 != v29 );
        }
      }
      return result;
    case 40:
      return sub_24100(a1, a2, *((_QWORD *)a3 + 1));
    case 41:
      if ( (a2 & 0x20) == 0 )
      {
        if ( *((_QWORD *)a3 + 1) != 0 )
        {
          v33 = a2 & 0xFFFFFF9F;
          if ( (a2 & 0x40) == 0 )
          {
            v441 = *(_QWORD *)(a1 + 296);
            *(_QWORD *)(a1 + 296) = s;
            v442 = *(_QWORD *)(a1 + 288);
            v443 = *((_QWORD *)a3 + 1);
            *(_QWORD *)s = v441;
            v538 = v4;
            v539 = 0;
            v540 = v442;
            sub_24100(a1, v33, v443);
            *(_QWORD *)(a1 + 296) = *(_QWORD *)s;
            result = v539;
            if ( v539 != 0 )
              return result;
            sub_1BF54(a1, 32);
          }
        }
        else
        {
          v33 = a2 & 0xFFFFFF9F;
        }
        return sub_28968(a1, v33, v4 + 4, *(_QWORD *)(a1 + 296));
      }
      v6 = a2 & 0xFFFFFF9F;
      result = sub_28968(a1, a2 & 0xFFFFFF9F, a3 + 4, *(_QWORD *)(a1 + 296));
      v18 = *((_DWORD **)v4 + 1);
      if ( v18 != nullptr )
        return sub_24100(a1, v6, v18);
      return result;
    case 42:
      v34 = *(_QWORD *)(a1 + 288);
      *(_QWORD *)s = *(_QWORD *)(a1 + 296);
      v35 = *(_QWORD *)s;
      *(_QWORD *)(a1 + 296) = s;
      v36 = s;
      v538 = a3;
      v539 = 0;
      v540 = v34;
      if ( v35 != 0 && (unsigned int)(**(_DWORD **)(v35 + 8) - 25) <= 2 )
      {
        v37 = 1;
        v38 = (_QWORD *)v35;
        do
        {
          if ( *((_DWORD *)v38 + 4) == 0 )
          {
            if ( v37 > 3 )
            {
              *(_DWORD *)(a1 + 304) = 1;
              return 1;
            }
            v39 = 32LL * v37++;
            v40 = &s[v39];
            v41 = v38[1];
            *(_QWORD *)v40 = *v38;
            *((_QWORD *)v40 + 1) = v41;
            v42 = v38[3];
            *((_QWORD *)v40 + 2) = v38[2];
            *((_QWORD *)v40 + 3) = v42;
            *(_QWORD *)&s[v39] = v36;
            v36 = &s[v39];
            *(_QWORD *)(a1 + 296) = &s[v39];
            *((_DWORD *)v38 + 4) = 1;
          }
          v38 = (_QWORD *)*v38;
        }
        while ( v38 != nullptr && (unsigned int)(*(_DWORD *)v38[1] - 25) <= 2 );
        v43 = v37;
        sub_24100(a1, v6, *((_QWORD *)a3 + 2));
        *(_QWORD *)(a1 + 296) = v35;
        result = v539;
        if ( v539 != 0 )
          return result;
        if ( v37 != 1 )
        {
          do
            sub_27B0C(a1, v6, *(_QWORD *)&s[32 * --v43 + 8]);
          while ( v43 != 1 );
          v44 = *(_QWORD *)(a1 + 296);
          return sub_286A0(a1, v6, v4 + 2, v44);
        }
      }
      else
      {
        sub_24100(a1, a2, *((_QWORD *)a3 + 2));
        *(_QWORD *)(a1 + 296) = v35;
        result = v539;
        if ( v539 != 0 )
          return result;
      }
      v44 = v35;
      return sub_286A0(a1, v6, v4 + 2, v44);
    case 43:
    case 45:
      v45 = *(_QWORD *)(a1 + 296);
      *(_QWORD *)(a1 + 296) = s;
      v46 = *(_QWORD *)(a1 + 288);
      v47 = *((_QWORD *)a3 + 2);
      *(_QWORD *)s = v45;
      v538 = v4;
      v539 = 0;
      v540 = v46;
      sub_24100(a1, a2, v47);
      if ( v539 == 0 )
        sub_27B0C(a1, v6, v4);
      result = *(_QWORD *)s;
      *(_QWORD *)(a1 + 296) = *(_QWORD *)s;
      return result;
    case 44:
      if ( *((_WORD *)a3 + 9) == 0 )
        goto LABEL_283;
      v356 = *(_QWORD *)(a1 + 256);
      if ( v356 == 255 )
      {
        v497 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v498 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v497(a1, 255, v498);
        v499 = *(_QWORD *)(a1 + 312);
        v357 = 2;
        *(_BYTE *)a1 = 95;
        *(_QWORD *)(a1 + 312) = v499 + 1;
        *(_BYTE *)(a1 + 1) = 83;
      }
      else
      {
        *(_QWORD *)(a1 + 256) = v356 + 1;
        *(_BYTE *)(a1 + v356) = 95;
        *(_BYTE *)(a1 + 264) = 95;
        if ( v356 == 254 )
        {
          v503 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v504 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v503(a1, 255, v504);
          *(_BYTE *)a1 = 83;
          v358 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 97;
          goto LABEL_453;
        }
        v357 = v356 + 2;
        *(_QWORD *)(a1 + 256) = v356 + 2;
        *(_BYTE *)(a1 + v356 + 1) = 83;
        *(_BYTE *)(a1 + 264) = 83;
        if ( v356 == 253 )
        {
          v501 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v502 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v501(a1, v357, v502);
          *(_BYTE *)a1 = 97;
          v359 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 116;
          goto LABEL_454;
        }
      }
      v358 = v357 + 1;
      *(_QWORD *)(a1 + 256) = v357 + 1;
      *(_BYTE *)(a1 + v357) = 97;
      *(_BYTE *)(a1 + 264) = 97;
      if ( v357 == 254 )
      {
        v500 = *(void (__fastcall **)(__int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v500(a1);
        *(_BYTE *)a1 = 116;
        v359 = 1;
        ++*(_QWORD *)(a1 + 312);
        goto LABEL_454;
      }
LABEL_453:
      v359 = v358 + 1;
      *(_QWORD *)(a1 + 256) = v358 + 1;
      *(_BYTE *)(a1 + v358) = 116;
      *(_BYTE *)(a1 + 264) = 116;
      if ( v358 != 254 )
      {
LABEL_454:
        v360 = v359 + 1;
        goto LABEL_455;
      }
      v361 = *(_QWORD *)(a1 + 280);
      v362 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
      *(_BYTE *)(a1 + 255) = 0;
      v362(a1, 255, v361);
      v360 = 1;
      v359 = 0;
      ++*(_QWORD *)(a1 + 312);
LABEL_455:
      *(_QWORD *)(a1 + 256) = v360;
      *(_BYTE *)(a1 + v359) = 32;
      *(_BYTE *)(a1 + 264) = 32;
LABEL_283:
      v240 = *((_QWORD *)v4 + 1);
      if ( *(char ***)(v240 + 8) == &off_48440 )
      {
        v242 = *(_QWORD *)(a1 + 256);
      }
      else
      {
        sub_24100(a1, v6, v240);
        v241 = *(_QWORD *)(a1 + 256);
        if ( v241 == 255 )
        {
          v445 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v446 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v445(a1, 255, v446);
          v242 = 1;
          v241 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v242 = v241 + 1;
        }
        *(_QWORD *)(a1 + 256) = v242;
        *(_BYTE *)(a1 + v241) = 32;
        *(_BYTE *)(a1 + 264) = 32;
      }
      if ( *((_WORD *)v4 + 8) != 0 )
      {
        if ( v242 == 255 )
        {
          v480 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v481 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v480(a1, 255, v481);
          v482 = *(_QWORD *)(a1 + 312);
          v243 = 2;
          *(_BYTE *)a1 = 95;
          *(_QWORD *)(a1 + 312) = v482 + 1;
          *(_BYTE *)(a1 + 1) = 65;
        }
        else
        {
          *(_QWORD *)(a1 + 256) = v242 + 1;
          *(_BYTE *)(a1 + v242) = 95;
          *(_BYTE *)(a1 + 264) = 95;
          if ( v242 == 254 )
          {
            v479 = *(void (__fastcall **)(__int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v479(a1);
            *(_BYTE *)a1 = 65;
            v244 = 2;
            ++*(_QWORD *)(a1 + 312);
            *(_BYTE *)(a1 + 1) = 99;
            goto LABEL_292;
          }
          v243 = v242 + 2;
          *(_QWORD *)(a1 + 256) = v242 + 2;
          *(_BYTE *)(a1 + v242 + 1) = 65;
          *(_BYTE *)(a1 + 264) = 65;
          if ( v242 == 253 )
          {
            v476 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            v477 = *(_QWORD *)(a1 + 280);
            *(_BYTE *)(a1 + 255) = 0;
            v476(a1, 255, v477);
            *(_BYTE *)a1 = 99;
            v478 = *(_QWORD *)(a1 + 312);
            v245 = 2;
            *(_BYTE *)(a1 + 1) = 99;
            *(_QWORD *)(a1 + 312) = v478 + 1;
            goto LABEL_293;
          }
        }
        v244 = v243 + 1;
        *(_QWORD *)(a1 + 256) = v243 + 1;
        *(_BYTE *)(a1 + v243) = 99;
        *(_BYTE *)(a1 + 264) = 99;
        if ( v243 == 254 )
        {
          v474 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v475 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v474(a1, v244, v475);
          *(_BYTE *)a1 = 99;
          result = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 117;
          goto LABEL_294;
        }
LABEL_292:
        v245 = v244 + 1;
        *(_QWORD *)(a1 + 256) = v244 + 1;
        *(_BYTE *)(a1 + v244) = 99;
        *(_BYTE *)(a1 + 264) = 99;
        if ( v244 == 254 )
        {
          v468 = *(void (__fastcall **)(__int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v468(a1);
          *(_BYTE *)a1 = 117;
          result = 1;
          ++*(_QWORD *)(a1 + 312);
          goto LABEL_294;
        }
LABEL_293:
        result = v245 + 1;
        *(_QWORD *)(a1 + 256) = v245 + 1;
        *(_BYTE *)(a1 + v245) = 117;
        *(_BYTE *)(a1 + 264) = 117;
        if ( v245 == 254 )
        {
          v276 = *(_QWORD *)(a1 + 280);
          v277 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v277(a1, 255, v276);
          v246 = 1;
          result = 0;
          ++*(_QWORD *)(a1 + 312);
          goto LABEL_295;
        }
LABEL_294:
        v246 = result + 1;
LABEL_295:
        *(_QWORD *)(a1 + 256) = v246;
        *(_BYTE *)(a1 + result) = 109;
        *(_BYTE *)(a1 + 264) = 109;
        return result;
      }
      if ( v242 == 255 )
      {
        v465 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v466 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v465(a1, 255, v466);
        v467 = *(_QWORD *)(a1 + 312);
        v332 = 2;
        *(_BYTE *)a1 = 95;
        *(_QWORD *)(a1 + 312) = v467 + 1;
        *(_BYTE *)(a1 + 1) = 70;
      }
      else
      {
        *(_QWORD *)(a1 + 256) = v242 + 1;
        *(_BYTE *)(a1 + v242) = 95;
        *(_BYTE *)(a1 + 264) = 95;
        if ( v242 == 254 )
        {
          v488 = *(void (__fastcall **)(__int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v488(a1);
          *(_BYTE *)a1 = 70;
          v333 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 114;
          goto LABEL_417;
        }
        v332 = v242 + 2;
        *(_QWORD *)(a1 + 256) = v242 + 2;
        *(_BYTE *)(a1 + v242 + 1) = 70;
        *(_BYTE *)(a1 + 264) = 70;
        if ( v242 == 253 )
        {
          v486 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v487 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v486(a1, 255, v487);
          *(_BYTE *)a1 = 114;
          v334 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 97;
          goto LABEL_418;
        }
      }
      v333 = v332 + 1;
      *(_QWORD *)(a1 + 256) = v332 + 1;
      *(_BYTE *)(a1 + v332) = 114;
      *(_BYTE *)(a1 + 264) = 114;
      if ( v332 == 254 )
      {
        v484 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v485 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v484(a1, v333, v485);
        *(_BYTE *)a1 = 97;
        result = 2;
        ++*(_QWORD *)(a1 + 312);
        *(_BYTE *)(a1 + 1) = 99;
        goto LABEL_419;
      }
LABEL_417:
      v334 = v333 + 1;
      *(_QWORD *)(a1 + 256) = v333 + 1;
      *(_BYTE *)(a1 + v333) = 97;
      *(_BYTE *)(a1 + 264) = 97;
      if ( v333 == 254 )
      {
        v483 = *(void (__fastcall **)(__int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v483(a1);
        *(_BYTE *)a1 = 99;
        result = 1;
        ++*(_QWORD *)(a1 + 312);
        goto LABEL_419;
      }
LABEL_418:
      result = v334 + 1;
      *(_QWORD *)(a1 + 256) = v334 + 1;
      *(_BYTE *)(a1 + v334) = 99;
      *(_BYTE *)(a1 + 264) = 99;
      if ( v334 == 254 )
      {
        v336 = *(_QWORD *)(a1 + 280);
        v337 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v337(a1, 255, v336);
        v335 = 1;
        result = 0;
        ++*(_QWORD *)(a1 + 312);
        goto LABEL_420;
      }
LABEL_419:
      v335 = result + 1;
LABEL_420:
      *(_QWORD *)(a1 + 256) = v335;
      *(_BYTE *)(a1 + result) = 116;
      *(_BYTE *)(a1 + 264) = 116;
      return result;
    case 46:
    case 47:
      v230 = *((_QWORD *)a3 + 1);
      if ( v230 != 0 )
        sub_24100(a1, a2, v230);
      result = *((_QWORD *)v4 + 2);
      if ( result != 0 )
      {
        v231 = *(_QWORD *)(a1 + 256);
        if ( v231 > 0xFD )
        {
          *(_BYTE *)(a1 + v231) = 0;
          v385 = v231;
          v231 = 0;
          (*(void (__fastcall **)(__int64, unsigned __int64, _QWORD))(a1 + 272))(a1, v385, *(_QWORD *)(a1 + 280));
          ++*(_QWORD *)(a1 + 312);
        }
        *(_BYTE *)(a1 + v231) = 44;
        *(_QWORD *)(a1 + 256) = v231 + 2;
        *(_BYTE *)(a1 + v231 + 1) = 32;
        *(_BYTE *)(a1 + 264) = 32;
        v232 = v6;
        v233 = *(_QWORD *)(a1 + 312);
        sub_24100(a1, v232, *((_QWORD *)v4 + 2));
        result = *(_QWORD *)(a1 + 312);
        if ( result == v233 )
        {
          result = *(_QWORD *)(a1 + 256);
          if ( result == v231 + 2 )
            *(_QWORD *)(a1 + 256) = v231;
        }
      }
      return result;
    case 48:
      v234 = *((_QWORD *)a3 + 1);
      v235 = *((_QWORD *)v4 + 2);
      if ( v234 != 0 )
        sub_24100(a1, a2, v234);
      v236 = *(_QWORD *)(a1 + 256);
      if ( v236 == 255 )
      {
        v401 = *(_QWORD *)(a1 + 280);
        v402 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v402(a1, 255, v401);
        v237 = 1;
        v236 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v237 = v236 + 1;
      }
      *(_QWORD *)(a1 + 256) = v237;
      *(_BYTE *)(a1 + v236) = 123;
      *(_BYTE *)(a1 + 264) = 123;
      sub_24100(a1, v6, v235);
      v238 = *(_QWORD *)(a1 + 256);
      if ( v238 == 255 )
      {
        v399 = *(_QWORD *)(a1 + 280);
        v400 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v400(a1, 255, v399);
        v239 = 1;
        v238 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v239 = v238 + 1;
      }
      *(_QWORD *)(a1 + 256) = v239;
      *(_BYTE *)(a1 + v238) = 125;
      *(_BYTE *)(a1 + 264) = 125;
      return 125;
    case 49:
      v204 = *((_QWORD *)a3 + 1);
      v205 = *(_QWORD *)(a1 + 256);
      v206 = "operator";
      v207 = *(_DWORD *)(v204 + 16);
      do
      {
        v209 = *v206;
        if ( v205 == 255 )
        {
          v210 = *(_QWORD *)(a1 + 280);
          v211 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v211(a1, 255, v210);
          v205 = 1;
          v208 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v208 = v205++;
        }
        *(_QWORD *)(a1 + 256) = v205;
        ++v206;
        *(_BYTE *)(a1 + v208) = v209;
        *(_BYTE *)(a1 + 264) = v209;
      }
      while ( v206 != "" );
      v288 = *(char **)(v204 + 8);
      if ( (unsigned __int8)(*v288 - 97) <= 0x19u )
      {
        if ( v205 == 255 )
        {
          v489 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v490 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v489(a1, 255, v490);
          v205 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        *(_QWORD *)(a1 + 256) = v205 + 1;
        *(_BYTE *)(a1 + v205) = 32;
        *(_BYTE *)(a1 + 264) = 32;
        v288 = *(char **)(v204 + 8);
      }
      v289 = v207;
      result = (unsigned __int8)v288[v207 - 1];
      if ( (_DWORD)result == 32 )
        v289 = v207 - 1;
      if ( v289 != 0 )
      {
        v290 = *(_QWORD *)(a1 + 256);
        v291 = &v288[v289];
        do
        {
          v292 = *v288;
          if ( v290 == 255 )
          {
            v293 = *(_QWORD *)(a1 + 280);
            v294 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v294(a1, 255, v293);
            v290 = 1;
            result = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            result = v290++;
          }
          *(_QWORD *)(a1 + 256) = v290;
          ++v288;
          *(_BYTE *)(a1 + result) = v292;
          *(_BYTE *)(a1 + 264) = v292;
        }
        while ( v288 != v291 );
      }
      return result;
    case 50:
      v259 = *(_QWORD *)(a1 + 256);
      for ( ii = 0; ii != 9; ++ii )
      {
        v262 = aOperator_0[ii];
        if ( v259 == 255 )
        {
          v263 = *(_QWORD *)(a1 + 280);
          v264 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v264(a1, 255, v263);
          v259 = 1;
          v261 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v261 = v259++;
        }
        *(_QWORD *)(a1 + 256) = v259;
        *(_BYTE *)(a1 + v261) = v262;
        *(_BYTE *)(a1 + 264) = v262;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 2));
    case 52:
      v253 = *(_QWORD *)(a1 + 256);
      for ( jj = 0; jj != 9; ++jj )
      {
        v256 = aOperator_0[jj];
        if ( v253 == 255 )
        {
          v257 = *(_QWORD *)(a1 + 280);
          v258 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v258(a1, 255, v257);
          v253 = 1;
          v255 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v255 = v253++;
        }
        *(_QWORD *)(a1 + 256) = v253;
        *(_BYTE *)(a1 + v255) = v256;
        *(_BYTE *)(a1 + 264) = v256;
      }
      if ( *(_QWORD *)(a1 + 352) != 0 )
      {
        v295 = *(_QWORD *)(a1 + 288);
        v538 = *(unsigned int **)(a1 + 352);
        *(_QWORD *)s = v295;
        *(_QWORD *)(a1 + 288) = s;
      }
      v296 = *((_QWORD *)v4 + 1);
      if ( *(_DWORD *)v296 == 4 )
      {
        sub_24100(a1, v6, *(_QWORD *)(v296 + 8));
        if ( *(_QWORD *)(a1 + 352) != 0 )
          *(_QWORD *)(a1 + 288) = *(_QWORD *)s;
        if ( *(_BYTE *)(a1 + 264) == 60 )
        {
          v506 = *(_QWORD *)(a1 + 256);
          if ( v506 == 255 )
          {
            v527 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            v528 = *(_QWORD *)(a1 + 280);
            *(_BYTE *)(a1 + 255) = 0;
            v527(a1, 255, v528);
            *(_QWORD *)(a1 + 256) = 0;
            v506 = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          *(_QWORD *)(a1 + 256) = v506 + 1;
          *(_BYTE *)(a1 + v506) = 32;
          *(_BYTE *)(a1 + 264) = 32;
        }
        v381 = *(_QWORD *)(a1 + 256);
        if ( v381 == 255 )
        {
          v495 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v496 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v495(a1, 255, v496);
          v381 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        *(_QWORD *)(a1 + 256) = v381 + 1;
        *(_BYTE *)(a1 + v381) = 60;
        *(_BYTE *)(a1 + 264) = 60;
        sub_24100(a1, v6, *(_QWORD *)(*((_QWORD *)v4 + 1) + 16LL));
        if ( *(_BYTE *)(a1 + 264) == 62 )
        {
          v505 = *(_QWORD *)(a1 + 256);
          if ( v505 == 255 )
          {
            v525 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            v526 = *(_QWORD *)(a1 + 280);
            *(_BYTE *)(a1 + 255) = 0;
            v525(a1, 255, v526);
            *(_QWORD *)(a1 + 256) = 0;
            v505 = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          *(_QWORD *)(a1 + 256) = v505 + 1;
          *(_BYTE *)(a1 + v505) = 32;
          *(_BYTE *)(a1 + 264) = 32;
        }
        v382 = *(_QWORD *)(a1 + 256);
        if ( v382 == 255 )
        {
          v493 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v494 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v493(a1, 255, v494);
          v382 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        *(_QWORD *)(a1 + 256) = v382 + 1;
        *(_BYTE *)(a1 + v382) = 62;
        *(_BYTE *)(a1 + 264) = 62;
        return 62;
      }
      else
      {
        sub_24100(a1, v6, v296);
        result = *(_QWORD *)(a1 + 352);
        if ( result != 0 )
        {
          result = *(_QWORD *)s;
          *(_QWORD *)(a1 + 288) = *(_QWORD *)s;
        }
      }
      return result;
    case 53:
      return sub_28C18(a1, a2, *((_QWORD *)a3 + 1));
    case 54:
      v247 = *((_QWORD *)a3 + 1);
      v248 = *((int **)a3 + 2);
      if ( *(_DWORD *)v247 != 49 )
      {
        if ( *(_DWORD *)v247 == 51 )
        {
          v383 = *(_QWORD *)(a1 + 256);
          if ( v383 == 255 )
          {
            v491 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            v492 = *(_QWORD *)(a1 + 280);
            *(_BYTE *)(a1 + 255) = 0;
            v491(a1, 255, v492);
            v383 = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          *(_QWORD *)(a1 + 256) = v383 + 1;
          *(_BYTE *)(a1 + v383) = 40;
          *(_BYTE *)(a1 + 264) = 40;
          sub_24100(a1, v6, *(_QWORD *)(v247 + 8));
          sub_1BF54(a1, 41);
        }
        else
        {
          sub_28C18(a1, a2, v247);
        }
        return sub_28CEC(a1, v6, v248);
      }
      v378 = **(const char ***)(v247 + 8);
      if ( strcmp(v378, "ad") == 0 )
      {
        v379 = *v248;
        if ( *v248 == 3 )
        {
          if ( **((_DWORD **)v248 + 1) == 1 && **((_DWORD **)v248 + 2) == 41 )
            v248 = *((int **)v248 + 1);
          goto LABEL_474;
        }
      }
      else
      {
        v379 = *v248;
      }
      if ( v379 == 56 )
      {
        sub_28CEC(a1, v6, *((_QWORD *)v248 + 1));
        return sub_28C18(a1, v6, v247);
      }
LABEL_474:
      sub_28C18(a1, v6, v247);
      if ( strcmp(v378, "gs") == 0 )
        return sub_24100(a1, v6, v248);
      if ( strcmp(v378, "st") != 0 )
        return sub_28CEC(a1, v6, v248);
      sub_1BF54(a1, 40);
      sub_24100(a1, v6, v248);
      v380 = *(_QWORD *)(a1 + 256);
      if ( v380 == 255 )
      {
        v507 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v508 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v507(a1, 255, v508);
        v380 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      *(_QWORD *)(a1 + 256) = v380 + 1;
      *(_BYTE *)(a1 + v380) = 41;
      *(_BYTE *)(a1 + 264) = 41;
      return 41;
    case 55:
      if ( **((_DWORD **)a3 + 2) != 56 )
        goto LABEL_9;
      v265 = *((_QWORD *)a3 + 1);
      v266 = *(_QWORD *)(v265 + 8);
      v267 = *(const char **)v266;
      if ( *(_BYTE *)(*(_QWORD *)v266 + 1LL) == 99
        && ((unsigned __int8)(*v267 - 114) <= 1u || (unsigned __int8)(*v267 - 99) <= 1u) )
      {
        sub_28C18(a1, a2, v265);
        sub_1BF54(a1, 60);
        sub_24100(a1, v6, *(_QWORD *)(*((_QWORD *)v4 + 2) + 8LL));
        sub_1C258(a1, ">(");
        sub_24100(a1, v6, *(_QWORD *)(*((_QWORD *)v4 + 2) + 16LL));
        return sub_1BF54(a1, 41);
      }
      else
      {
        if ( *(_DWORD *)v265 == 49 && *(_DWORD *)(v266 + 16) == 1 && **(_BYTE **)(v266 + 8) == 62 )
        {
          sub_1BF54(a1, 40);
          v268 = *((_QWORD *)v4 + 2);
          v267 = **(const char ***)(*((_QWORD *)v4 + 1) + 8LL);
        }
        else
        {
          v268 = *((_QWORD *)v4 + 2);
        }
        v269 = strcmp(v267, "cl");
        v270 = *(_QWORD *)(v268 + 8);
        if ( v269 == 0 && *(_DWORD *)v270 == 3 )
        {
          if ( **(_DWORD **)(v270 + 16) != 41 )
            *(_DWORD *)(a1 + 304) = 1;
          sub_28CEC(a1, v6, *(_QWORD *)(v270 + 8));
        }
        else
        {
          sub_28CEC(a1, v6, v270);
        }
        v271 = *((_QWORD *)v4 + 1);
        v272 = **(const char ***)(v271 + 8);
        if ( strcmp(v272, "ix") == 0 )
        {
          sub_1BF54(a1, 91);
          sub_24100(a1, v6, *(_QWORD *)(*((_QWORD *)v4 + 2) + 16LL));
          sub_1BF54(a1, 93);
        }
        else
        {
          if ( strcmp(v272, "cl") != 0 )
            sub_28C18(a1, v6, v271);
          sub_28CEC(a1, v6, *(_QWORD *)(*((_QWORD *)v4 + 2) + 16LL));
        }
        result = *((_QWORD *)v4 + 1);
        if ( *(_DWORD *)result == 49 )
        {
          result = *(_QWORD *)(result + 8);
          if ( *(_DWORD *)(result + 16) == 1 )
          {
            result = **(unsigned __int8 **)(result + 8);
            if ( (_DWORD)result == 62 )
              return sub_1BF54(a1, 41);
          }
        }
      }
      return result;
    case 56:
      result = 1;
      *(_DWORD *)(a1 + 304) = 1;
      return result;
    case 57:
      v249 = *((_QWORD *)a3 + 2);
      if ( *(_DWORD *)v249 != 58 )
        goto LABEL_9;
      v250 = *(_QWORD *)(v249 + 16);
      if ( *(_DWORD *)v250 != 59 )
        goto LABEL_9;
      v251 = *((_QWORD *)a3 + 1);
      v534 = *(_QWORD *)(v249 + 8);
      v252 = *(_QWORD *)(v250 + 8);
      v248 = *(int **)(v250 + 16);
      if ( strcmp(**(const char ***)(v251 + 8), "qu") == 0 )
      {
        sub_28CEC(a1, v6, v534);
        sub_28C18(a1, v6, v251);
        sub_28CEC(a1, v6, v252);
        sub_1C258(a1, " : ");
        return sub_28CEC(a1, v6, v248);
      }
      else
      {
        sub_1C258(a1, "new ");
        if ( *(_QWORD *)(v534 + 8) != 0 )
        {
          sub_28CEC(a1, v6, v534);
          sub_1BF54(a1, 32);
        }
        result = sub_24100(a1, v6, v252);
        if ( v248 != nullptr )
          return sub_28CEC(a1, v6, v248);
      }
      return result;
    case 58:
    case 59:
      result = 1;
      *(_DWORD *)(a1 + 304) = 1;
      return result;
    case 60:
    case 61:
      v117 = *((_QWORD *)a3 + 1);
      v118 = 0;
      if ( *(_DWORD *)v117 != 39 )
        goto LABEL_156;
      v118 = *(_DWORD *)(*(_QWORD *)(v117 + 8) + 28LL);
      if ( v118 == 0 )
        goto LABEL_156;
      if ( v118 <= 6 )
      {
        if ( **((_DWORD **)a3 + 2) == 0 )
        {
          if ( (_DWORD)result == 61 )
            sub_1BF54(a1, 45);
          v444 = sub_24100(a1, v6, *((_QWORD *)v4 + 2));
          switch ( v118 )
          {
            case 2u:
              result = sub_1BF54(a1, 117);
              break;
            case 3u:
              result = sub_1BF54(a1, 108);
              break;
            case 4u:
              result = sub_1C258(a1, "ul");
              break;
            case 5u:
              result = sub_1C258(a1, "ll");
              break;
            case 6u:
              result = sub_1C258(a1, "ull");
              break;
            default:
              result = v444;
              break;
          }
          return result;
        }
      }
      else if ( v118 == 7 )
      {
        v119 = *((_QWORD *)a3 + 2);
        if ( *(_DWORD *)v119 == 0 && *(_DWORD *)(v119 + 16) == 1 && (_DWORD)result == 60 )
        {
          v533 = **(unsigned __int8 **)(v119 + 8);
          if ( v533 == 48 )
            return sub_1C258(a1, "false");
          if ( v533 == 49 )
            return sub_1C258(a1, "true");
        }
      }
LABEL_156:
      v120 = *(_QWORD *)(a1 + 256);
      if ( v120 == 255 )
      {
        v439 = *(_QWORD *)(a1 + 280);
        v440 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v440(a1, 255, v439);
        v121 = 1;
        v120 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v121 = v120 + 1;
      }
      *(_QWORD *)(a1 + 256) = v121;
      *(_BYTE *)(a1 + v120) = 40;
      *(_BYTE *)(a1 + 264) = 40;
      sub_24100(a1, v6, *((_QWORD *)v4 + 1));
      v122 = *(_QWORD *)(a1 + 256);
      if ( v122 == 255 )
      {
        v437 = *(_QWORD *)(a1 + 280);
        v438 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v438(a1, 255, v437);
        v123 = 1;
        v122 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v123 = v122 + 1;
      }
      *(_QWORD *)(a1 + 256) = v123;
      *(_BYTE *)(a1 + v122) = 41;
      *(_BYTE *)(a1 + 264) = 41;
      if ( *v4 == 61 )
        sub_1BF54(a1, 45);
      if ( v118 != 8 )
        return sub_24100(a1, v6, *((_QWORD *)v4 + 2));
      sub_1BF54(a1, 91);
      sub_24100(a1, v6, *((_QWORD *)v4 + 2));
      return sub_1BF54(a1, 93);
    case 62:
      v144 = *(_QWORD *)(a1 + 256);
      v145 = "java resource ";
      do
      {
        v147 = *v145;
        if ( v144 == 255 )
        {
          v148 = *(_QWORD *)(a1 + 280);
          v149 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v149(a1, 255, v148);
          v144 = 1;
          v146 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v146 = v144++;
        }
        *(_QWORD *)(a1 + 256) = v144;
        ++v145;
        *(_BYTE *)(a1 + v146) = v147;
        *(_BYTE *)(a1 + 264) = v147;
      }
      while ( v145 != "" );
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 63:
      sub_24100(a1, a2, *((_QWORD *)a3 + 1));
      return sub_24100(a1, v6, *((_QWORD *)v4 + 2));
    case 64:
      v124 = *(_QWORD *)(a1 + 256);
      v125 = *((_BYTE *)a3 + 8);
      if ( v124 == 255 )
      {
        v425 = *(_QWORD *)(a1 + 280);
        v426 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v426(a1, 255, v425);
        result = 1;
        v124 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        result = v124 + 1;
      }
      *(_QWORD *)(a1 + 256) = result;
      *(_BYTE *)(a1 + v124) = v125;
      *(_BYTE *)(a1 + 264) = v125;
      return result;
    case 65:
      sprintf(s, "%ld", *((_QWORD *)a3 + 1));
      result = strlen(s);
      v126 = result;
      if ( result != 0 )
      {
        v127 = *(_QWORD *)(a1 + 256);
        v128 = 0;
        do
        {
          v129 = s[v128];
          if ( v127 == 255 )
          {
            v130 = *(_QWORD *)(a1 + 280);
            v131 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v131(a1, 255, v130);
            v127 = 1;
            result = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            result = v127++;
          }
          *(_QWORD *)(a1 + 256) = v127;
          ++v128;
          *(_BYTE *)(a1 + result) = v129;
          *(_BYTE *)(a1 + 264) = v129;
        }
        while ( v128 != v126 );
      }
      return result;
    case 66:
      v132 = *(_QWORD *)(a1 + 256);
      v133 = "decltype (";
      do
      {
        v135 = *v133;
        if ( v132 == 255 )
        {
          v136 = *(_QWORD *)(a1 + 280);
          v137 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v137(a1, 255, v136);
          v132 = 1;
          v134 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v134 = v132++;
        }
        *(_QWORD *)(a1 + 256) = v132;
        ++v133;
        *(_BYTE *)(a1 + v134) = v135;
        *(_BYTE *)(a1 + 264) = v135;
      }
      while ( v133 != "" );
      sub_24100(a1, v6, *((_QWORD *)v4 + 1));
      v284 = *(_QWORD *)(a1 + 256);
      if ( v284 == 255 )
      {
        v397 = *(_QWORD *)(a1 + 280);
        v398 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v398(a1, 255, v397);
        v285 = 1;
        v284 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v285 = v284 + 1;
      }
      *(_QWORD *)(a1 + 256) = v285;
      *(_BYTE *)(a1 + v284) = 41;
      *(_BYTE *)(a1 + 264) = 41;
      return 41;
    case 67:
      v138 = *(_QWORD *)(a1 + 256);
      for ( kk = 0; kk != 29; ++kk )
      {
        v141 = aGlobalConstruc[kk];
        if ( v138 == 255 )
        {
          v142 = *(_QWORD *)(a1 + 280);
          v143 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v143(a1, 255, v142);
          v138 = 1;
          v140 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v140 = v138++;
        }
        *(_QWORD *)(a1 + 256) = v138;
        *(_BYTE *)(a1 + v140) = v141;
        *(_BYTE *)(a1 + 264) = v141;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 68:
      v150 = *(_QWORD *)(a1 + 256);
      for ( mm = 0; mm != 28; ++mm )
      {
        v153 = aGlobalDestruct[mm];
        if ( v150 == 255 )
        {
          v154 = *(_QWORD *)(a1 + 280);
          v155 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v155(a1, 255, v154);
          v150 = 1;
          v152 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v152 = v150++;
        }
        *(_QWORD *)(a1 + 256) = v150;
        *(_BYTE *)(a1 + v152) = v153;
        *(_BYTE *)(a1 + 264) = v153;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 69:
      v156 = *(_QWORD *)(a1 + 256);
      v157 = "{lambda(";
      do
      {
        v159 = *v157;
        if ( v156 == 255 )
        {
          v160 = *(_QWORD *)(a1 + 280);
          v161 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v161(a1, 255, v160);
          v156 = 1;
          v158 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v158 = v156++;
        }
        *(_QWORD *)(a1 + 256) = v156;
        ++v157;
        *(_BYTE *)(a1 + v158) = v159;
        *(_BYTE *)(a1 + 264) = v159;
      }
      while ( v157 != "" );
      sub_24100(a1, v6, *((_QWORD *)v4 + 1));
      v306 = *(_QWORD *)(a1 + 256);
      if ( v306 == 255 )
      {
        v403 = *(_QWORD *)(a1 + 280);
        v404 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v404(a1, 255, v403);
        v405 = *(_QWORD *)(a1 + 312);
        v307 = 1;
        *(_BYTE *)a1 = 41;
        *(_QWORD *)(a1 + 312) = v405 + 1;
      }
      else
      {
        v307 = v306 + 1;
        *(_QWORD *)(a1 + 256) = v306 + 1;
        *(_BYTE *)(a1 + v306) = 41;
        *(_BYTE *)(a1 + 264) = 41;
        if ( v306 == 254 )
        {
          v317 = *(_QWORD *)(a1 + 280);
          v318 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v318(a1, 255, v317);
          v308 = 1;
          v307 = 0;
          ++*(_QWORD *)(a1 + 312);
LABEL_386:
          *(_QWORD *)(a1 + 256) = v308;
          *(_BYTE *)(a1 + v307) = 35;
          *(_BYTE *)(a1 + 264) = 35;
          v309 = v4[4];
          v310 = 0;
          sprintf(s, "%ld", (int)(v309 + 1));
          v311 = strlen(s);
          v312 = *(_QWORD *)(a1 + 256);
          if ( v311 != 0 )
          {
            do
            {
              v314 = s[v310];
              if ( v312 == 255 )
              {
                v315 = *(_QWORD *)(a1 + 280);
                v316 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
                *(_BYTE *)(a1 + 255) = 0;
                v316(a1, 255, v315);
                v312 = 1;
                v313 = 0;
                ++*(_QWORD *)(a1 + 312);
              }
              else
              {
                v313 = v312++;
              }
              *(_QWORD *)(a1 + 256) = v312;
              ++v310;
              *(_BYTE *)(a1 + v313) = v314;
              *(_BYTE *)(a1 + 264) = v314;
            }
            while ( v310 != v311 );
          }
          if ( v312 == 255 )
          {
            v417 = *(_QWORD *)(a1 + 280);
            v418 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v418(a1, 255, v417);
            v319 = 1;
            v312 = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            v319 = v312 + 1;
          }
          *(_QWORD *)(a1 + 256) = v319;
          *(_BYTE *)(a1 + v312) = 125;
          *(_BYTE *)(a1 + 264) = 125;
          return 125;
        }
      }
      v308 = v307 + 1;
      goto LABEL_386;
    case 71:
      v162 = *(_QWORD *)(a1 + 256);
      v163 = "{unnamed type#";
      do
      {
        v165 = *v163;
        if ( v162 == 255 )
        {
          v166 = *(_QWORD *)(a1 + 280);
          v167 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v167(a1, 255, v166);
          v162 = 1;
          v164 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v164 = v162++;
        }
        *(_QWORD *)(a1 + 256) = v162;
        ++v163;
        *(_BYTE *)(a1 + v164) = v165;
        *(_BYTE *)(a1 + 264) = v165;
      }
      while ( v163 != "" );
      v297 = *((_QWORD *)v4 + 1) + 1LL;
      v298 = 0;
      sprintf(s, "%ld", v297);
      v299 = strlen(s);
      v300 = *(_QWORD *)(a1 + 256);
      if ( v299 != 0 )
      {
        do
        {
          v302 = s[v298];
          if ( v300 == 255 )
          {
            v303 = *(_QWORD *)(a1 + 280);
            v304 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v304(a1, 255, v303);
            v300 = 1;
            v301 = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            v301 = v300++;
          }
          *(_QWORD *)(a1 + 256) = v300;
          ++v298;
          *(_BYTE *)(a1 + v301) = v302;
          *(_BYTE *)(a1 + 264) = v302;
        }
        while ( v298 != v299 );
      }
      if ( v300 == 255 )
      {
        v406 = *(_QWORD *)(a1 + 280);
        v407 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v407(a1, 255, v406);
        v305 = 1;
        v300 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v305 = v300 + 1;
      }
      *(_QWORD *)(a1 + 256) = v305;
      *(_BYTE *)(a1 + v300) = 125;
      *(_BYTE *)(a1 + 264) = 125;
      return 125;
    case 72:
      v168 = *(_QWORD *)(a1 + 256);
      for ( nn = 0; nn != 22; ++nn )
      {
        v171 = aTransactionClo[nn];
        if ( v168 == 255 )
        {
          v172 = *(_QWORD *)(a1 + 280);
          v173 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v173(a1, 255, v172);
          v168 = 1;
          v170 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v170 = v168++;
        }
        *(_QWORD *)(a1 + 256) = v168;
        *(_BYTE *)(a1 + v170) = v171;
        *(_BYTE *)(a1 + 264) = v171;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 73:
      v174 = *(_QWORD *)(a1 + 256);
      for ( i1 = 0; i1 != 26; ++i1 )
      {
        v177 = aNonTransaction[i1];
        if ( v174 == 255 )
        {
          v178 = *(_QWORD *)(a1 + 280);
          v179 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v179(a1, 255, v178);
          v174 = 1;
          v176 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v176 = v174++;
        }
        *(_QWORD *)(a1 + 256) = v174;
        *(_BYTE *)(a1 + v176) = v177;
        *(_BYTE *)(a1 + 264) = v177;
      }
      return sub_24100(a1, v6, *((_QWORD *)v4 + 1));
    case 74:
      v180 = 0;
      result = (__int64)sub_1C0D0(a1, *((_QWORD *)a3 + 1));
      if ( result == 0 )
      {
        sub_28CEC(a1, v6, *((_QWORD *)v4 + 1));
        return sub_1C258(a1, "...");
      }
      while ( *(_DWORD *)result == 47 && *(_QWORD *)(result + 8) != 0 )
      {
        result = *(_QWORD *)(result + 16);
        ++v180;
        if ( result == 0 )
        {
          v181 = *((_QWORD *)v4 + 1);
          goto LABEL_219;
        }
      }
      v181 = *((_QWORD *)v4 + 1);
      if ( v180 == 0 )
        return result;
LABEL_219:
      v182 = 0;
      while ( 1 )
      {
        *(_DWORD *)(a1 + 308) = v182;
        result = sub_24100(a1, v6, v181);
        if ( v180 - 1 > v182 )
          break;
LABEL_225:
        if ( ++v182 == v180 )
          return result;
      }
      v183 = *(_QWORD *)(a1 + 256);
      if ( v183 == 255 )
      {
        v282 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v283 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v282(a1, 255, v283);
        *(_BYTE *)a1 = 44;
        result = 1;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        result = v183 + 1;
        *(_QWORD *)(a1 + 256) = v183 + 1;
        *(_BYTE *)(a1 + v183) = 44;
        *(_BYTE *)(a1 + 264) = 44;
        if ( v183 == 254 )
        {
          v273 = *(_QWORD *)(a1 + 280);
          v274 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v274(a1, 255, v273);
          v184 = 1;
          result = 0;
          ++*(_QWORD *)(a1 + 312);
          goto LABEL_224;
        }
      }
      v184 = result + 1;
LABEL_224:
      *(_QWORD *)(a1 + 256) = v184;
      *(_BYTE *)(a1 + result) = 32;
      *(_BYTE *)(a1 + 264) = 32;
      goto LABEL_225;
    case 75:
      sub_24100(a1, a2, *((_QWORD *)a3 + 1));
      v185 = *(_QWORD *)(a1 + 256);
      if ( v185 == 255 )
      {
        v432 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v433 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v432(a1, 255, v433);
        v434 = *(_QWORD *)(a1 + 312);
        *(_BYTE *)a1 = 91;
        v187 = 2;
        *(_QWORD *)(a1 + 312) = v434 + 1;
        *(_BYTE *)(a1 + 1) = 97;
      }
      else
      {
        v186 = v185 + 1;
        *(_QWORD *)(a1 + 256) = v185 + 1;
        *(_BYTE *)(a1 + v185) = 91;
        *(_BYTE *)(a1 + 264) = 91;
        if ( v185 == 254 )
        {
          v430 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v431 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v430(a1, 255, v431);
          *(_BYTE *)a1 = 97;
          v188 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 98;
          goto LABEL_231;
        }
        v187 = v185 + 2;
        *(_QWORD *)(a1 + 256) = v186 + 1;
        *(_BYTE *)(a1 + v186) = 97;
        *(_BYTE *)(a1 + 264) = 97;
        if ( v186 == 254 )
        {
          v429 = *(void (__fastcall **)(__int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v429(a1);
          *(_BYTE *)a1 = 98;
          v189 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 105;
          goto LABEL_232;
        }
      }
      v188 = v187 + 1;
      *(_QWORD *)(a1 + 256) = v187 + 1;
      *(_BYTE *)(a1 + v187) = 98;
      *(_BYTE *)(a1 + 264) = 98;
      if ( v187 == 254 )
      {
        v427 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v428 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v427(a1, 255, v428);
        *(_BYTE *)a1 = 105;
        v189 = 1;
        ++*(_QWORD *)(a1 + 312);
        goto LABEL_232;
      }
LABEL_231:
      v189 = v188 + 1;
      *(_QWORD *)(a1 + 256) = v188 + 1;
      *(_BYTE *)(a1 + v188) = 105;
      *(_BYTE *)(a1 + 264) = 105;
      if ( v188 == 254 )
      {
        v275 = *(void (__fastcall **)(__int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v275(a1);
        v190 = 1;
        v189 = 0;
        ++*(_QWORD *)(a1 + 312);
LABEL_233:
        *(_QWORD *)(a1 + 256) = v190;
        *(_BYTE *)(a1 + v189) = 58;
        *(_BYTE *)(a1 + 264) = 58;
        sub_24100(a1, v6, *((_QWORD *)v4 + 2));
        v191 = *(_QWORD *)(a1 + 256);
        if ( v191 == 255 )
        {
          v423 = *(_QWORD *)(a1 + 280);
          v424 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v424(a1, 255, v423);
          v192 = 1;
          v191 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v192 = v191 + 1;
        }
        *(_QWORD *)(a1 + 256) = v192;
        *(_BYTE *)(a1 + v191) = 93;
        *(_BYTE *)(a1 + 264) = 93;
        return 93;
      }
LABEL_232:
      v190 = v189 + 1;
      goto LABEL_233;
    case 76:
      v224 = " [clone ";
      sub_24100(a1, a2, *((_QWORD *)a3 + 1));
      v225 = *(_QWORD *)(a1 + 256);
      do
      {
        v227 = *v224;
        if ( v225 == 255 )
        {
          v228 = *(_QWORD *)(a1 + 280);
          v229 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v229(a1, 255, v228);
          v225 = 1;
          v226 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v226 = v225++;
        }
        *(_QWORD *)(a1 + 256) = v225;
        ++v224;
        *(_BYTE *)(a1 + v226) = v227;
        *(_BYTE *)(a1 + 264) = v227;
      }
      while ( v224 != "" );
      sub_24100(a1, v6, *((_QWORD *)v4 + 2));
      v286 = *(_QWORD *)(a1 + 256);
      if ( v286 == 255 )
      {
        v415 = *(_QWORD *)(a1 + 280);
        v416 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v416(a1, 255, v415);
        v287 = 1;
        v286 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v287 = v286 + 1;
      }
      *(_QWORD *)(a1 + 256) = v287;
      *(_BYTE *)(a1 + v286) = 93;
      *(_BYTE *)(a1 + 264) = 93;
      return 93;
    default:
      result = 1;
      *(_DWORD *)(a1 + 304) = 1;
      return result;
  }
}


// Address: 0x27B0C | Function: sub_27B0C
char *__fastcall sub_27B0C(__int64 a1, unsigned int a2, __int64 a3)
{
  unsigned int v4; // w0
  char *result; // x0
  __int64 v8; // kr00_8
  __int64 v9; // x1
  const char *v10; // x20
  __int64 v11; // x0
  char v12; // w22
  __int64 v13; // x2
  void (__fastcall *v14)(__int64, __int64, __int64); // x3
  __int64 v15; // x1
  __int64 i; // x20
  char v17; // w21
  __int64 v18; // x2
  void (__fastcall *v19)(__int64, __int64, __int64); // x3
  __int64 v20; // x1
  __int64 j; // x20
  char v22; // w21
  __int64 v23; // x2
  void (__fastcall *v24)(__int64, __int64, __int64); // x3
  __int64 v25; // x1
  __int64 v26; // x3
  __int64 v27; // x1
  __int64 v28; // x3
  __int64 v29; // x1
  char v30; // w20
  __int64 v31; // x2
  void (__fastcall *v32)(__int64, char *, __int64); // x3
  __int64 v33; // x1
  __int64 v34; // x0
  __int64 v35; // x1
  __int64 v36; // x0
  __int64 v37; // x0
  __int64 v38; // x1
  __int64 v39; // x1
  __int64 v40; // x0
  __int64 v41; // x1
  __int64 v42; // x0
  __int64 v43; // x1
  const char *v44; // x20
  char v45; // w21
  __int64 v46; // x2
  void (__fastcall *v47)(__int64, __int64, __int64); // x3
  __int64 v48; // x1
  const char *v49; // x20
  char v50; // w21
  __int64 v51; // x2
  void (__fastcall *v52)(__int64, __int64, __int64); // x3
  __int64 v53; // x1
  __int64 v54; // x0
  __int64 v55; // x3
  __int64 v56; // x1
  __int64 v57; // x1
  __int64 v58; // x0
  __int64 v59; // x2
  void (__fastcall *v60)(__int64, __int64, __int64); // x3
  void (__fastcall *v61)(__int64, __int64, __int64); // x4
  __int64 v62; // x2
  void (__fastcall *v63)(__int64); // x3
  __int64 v64; // x2
  void (__fastcall *v65)(__int64, __int64, __int64); // x3
  __int64 v66; // x1
  __int64 v67; // x2
  void (__fastcall *v68)(__int64, __int64, __int64); // x3
  __int64 v69; // x2
  void (__fastcall *v70)(__int64, __int64, __int64); // x3
  __int64 v71; // x2
  void (__fastcall *v72)(__int64, __int64, __int64); // x3
  __int64 v73; // x2
  void (__fastcall *v74)(__int64, __int64, __int64); // x4
  __int64 v75; // x1
  void (__fastcall *v76)(__int64); // x3
  void (__fastcall *v77)(__int64, __int64, __int64); // x4
  __int64 v78; // x2
  void (__fastcall *v79)(__int64); // x3
  __int64 v80; // x2
  void (__fastcall *v81)(__int64, __int64, __int64); // x3
  void (__fastcall *v82)(__int64, __int64, __int64); // x3
  __int64 v83; // x2
  __int64 v84; // x0
  __int64 v85; // x2
  void (__fastcall *v86)(__int64, __int64, __int64); // x3
  __int64 v87; // x2
  void (__fastcall *v88)(__int64, __int64, __int64); // x3
  __int64 v89; // x2
  void (__fastcall *v90)(__int64, __int64, __int64); // x3

  v4 = *(_DWORD *)a3 - 3;
  v8 = v4;
  result = (char *)&loc_27B74 + 4 * jpt_27B70[v4];
  switch ( v8 )
  {
    case 0LL:
      return (char *)sub_24100(a1, a2, *(unsigned int **)(a3 + 8));
    case 22LL:
    case 25LL:
      v15 = *(_QWORD *)(a1 + 256);
      for ( i = 0; i != 9; ++i )
      {
        v17 = aRestrict[i];
        if ( v15 == 255 )
        {
          v18 = *(_QWORD *)(a1 + 280);
          v19 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v19(a1, 255, v18);
          v15 = 1;
          result = nullptr;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          result = (char *)v15++;
        }
        *(_QWORD *)(a1 + 256) = v15;
        result[a1] = v17;
        *(_BYTE *)(a1 + 264) = v17;
      }
      return result;
    case 23LL:
    case 26LL:
      v20 = *(_QWORD *)(a1 + 256);
      for ( j = 0; j != 9; ++j )
      {
        v22 = aVolatile[j];
        if ( v20 == 255 )
        {
          v23 = *(_QWORD *)(a1 + 280);
          v24 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v24(a1, 255, v23);
          v20 = 1;
          result = nullptr;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          result = (char *)v20++;
        }
        *(_QWORD *)(a1 + 256) = v20;
        result[a1] = v22;
        *(_BYTE *)(a1 + 264) = v22;
      }
      return result;
    case 24LL:
    case 27LL:
      v25 = *(_QWORD *)(a1 + 256);
      if ( v25 == 255 )
      {
        v82 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v83 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v82(a1, 255, v83);
        v84 = *(_QWORD *)(a1 + 312);
        *(_BYTE *)a1 = 32;
        v27 = 2;
        *(_QWORD *)(a1 + 312) = v84 + 1;
        *(_BYTE *)(a1 + 1) = 99;
      }
      else
      {
        v26 = v25 + 1;
        *(_QWORD *)(a1 + 256) = v25 + 1;
        *(_BYTE *)(a1 + v25) = 32;
        *(_BYTE *)(a1 + 264) = 32;
        if ( v25 == 254 )
        {
          v61 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          v62 = *(_QWORD *)(a1 + 280);
          *(_BYTE *)(a1 + 255) = 0;
          v61(a1, 255, v62);
          *(_BYTE *)a1 = 99;
          v28 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 111;
LABEL_25:
          v29 = v28 + 1;
          *(_QWORD *)(a1 + 256) = v28 + 1;
          *(_BYTE *)(a1 + v28) = 110;
          *(_BYTE *)(a1 + 264) = 110;
          if ( v28 == 254 )
          {
            v76 = *(void (__fastcall **)(__int64))(a1 + 272);
            v30 = 116;
            *(_BYTE *)(a1 + 255) = 0;
            v76(a1);
            *(_BYTE *)a1 = 115;
            result = (_BYTE *)(&dword_0 + 1);
            ++*(_QWORD *)(a1 + 312);
            goto LABEL_40;
          }
          goto LABEL_26;
        }
        v27 = v25 + 2;
        *(_QWORD *)(a1 + 256) = v26 + 1;
        *(_BYTE *)(a1 + v26) = 99;
        *(_BYTE *)(a1 + 264) = 99;
        if ( v26 == 254 )
        {
          v79 = *(void (__fastcall **)(__int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v79(a1);
          *(_BYTE *)a1 = 111;
          v29 = 2;
          ++*(_QWORD *)(a1 + 312);
          *(_BYTE *)(a1 + 1) = 110;
LABEL_26:
          result = (char *)(v29 + 1);
          *(_QWORD *)(a1 + 256) = v29 + 1;
          *(_BYTE *)(a1 + v29) = 115;
          *(_BYTE *)(a1 + 264) = 115;
          v30 = 116;
          if ( v29 != 254 )
            goto LABEL_40;
          goto LABEL_27;
        }
      }
      v28 = v27 + 1;
      *(_QWORD *)(a1 + 256) = v27 + 1;
      *(_BYTE *)(a1 + v27) = 111;
      *(_BYTE *)(a1 + 264) = 111;
      if ( v27 == 254 )
      {
        v77 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v78 = *(_QWORD *)(a1 + 280);
        *(_BYTE *)(a1 + 255) = 0;
        v30 = 116;
        v77(a1, 255, v78);
        *(_BYTE *)a1 = 110;
        result = (_BYTE *)(&dword_0 + 2);
        ++*(_QWORD *)(a1 + 312);
        *(_BYTE *)(a1 + 1) = 115;
        goto LABEL_40;
      }
      goto LABEL_25;
    case 28LL:
      v34 = *(_QWORD *)(a1 + 256);
      if ( v34 == 255 )
      {
        v85 = *(_QWORD *)(a1 + 280);
        v86 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v86(a1, 255, v85);
        v35 = 1;
        v34 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v35 = v34 + 1;
      }
      *(_QWORD *)(a1 + 256) = v35;
      *(_BYTE *)(a1 + v34) = 32;
      *(_BYTE *)(a1 + 264) = 32;
      goto LABEL_31;
    case 29LL:
      v37 = *(_QWORD *)(a1 + 256);
      if ( v37 == 255 )
      {
        v69 = *(_QWORD *)(a1 + 280);
        v70 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v70(a1, 255, v69);
        v38 = 1;
        v37 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v38 = v37 + 1;
      }
      *(_QWORD *)(a1 + 256) = v38;
      *(_BYTE *)(a1 + v37) = 32;
      *(_BYTE *)(a1 + 264) = 32;
      goto LABEL_38;
    case 30LL:
      v39 = *(_QWORD *)(a1 + 256);
      if ( v39 == 255 )
      {
        v80 = *(_QWORD *)(a1 + 280);
        v81 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v81(a1, 255, v80);
        v40 = 1;
        v39 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v40 = v39 + 1;
      }
      *(_QWORD *)(a1 + 256) = v40;
      *(_BYTE *)(a1 + v39) = 32;
      *(_BYTE *)(a1 + 264) = 32;
      return (char *)sub_24100(a1, a2, *(unsigned int **)(a3 + 16));
    case 31LL:
      if ( (a2 & 4) == 0 )
      {
        v41 = *(_QWORD *)(a1 + 256);
        if ( v41 == 255 )
        {
          v89 = *(_QWORD *)(a1 + 280);
          v90 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v90(a1, 255, v89);
          v42 = 1;
          v41 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v42 = v41 + 1;
        }
        *(_QWORD *)(a1 + 256) = v42;
        *(_BYTE *)(a1 + v41) = 42;
        *(_BYTE *)(a1 + 264) = 42;
        return (_BYTE *)(&qword_28 + 2);
      }
      return result;
    case 32LL:
      v35 = *(_QWORD *)(a1 + 256);
LABEL_31:
      if ( v35 == 255 )
      {
        v67 = *(_QWORD *)(a1 + 280);
        v68 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v68(a1, 255, v67);
        v36 = 1;
        v35 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v36 = v35 + 1;
      }
      *(_QWORD *)(a1 + 256) = v36;
      result = (_BYTE *)(&qword_20 + 6);
      *(_BYTE *)(a1 + v35) = 38;
      *(_BYTE *)(a1 + 264) = 38;
      return result;
    case 33LL:
      v38 = *(_QWORD *)(a1 + 256);
LABEL_38:
      if ( v38 == 255 )
      {
        v64 = *(_QWORD *)(a1 + 280);
        v65 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        v30 = 38;
        *(_BYTE *)(a1 + 255) = 0;
        v65(a1, 255, v64);
        v66 = *(_QWORD *)(a1 + 312);
        result = (_BYTE *)(&dword_0 + 1);
        *(_BYTE *)a1 = 38;
        *(_QWORD *)(a1 + 312) = v66 + 1;
      }
      else
      {
        result = (char *)(v38 + 1);
        *(_QWORD *)(a1 + 256) = v38 + 1;
        *(_BYTE *)(a1 + v38) = 38;
        *(_BYTE *)(a1 + 264) = 38;
        v30 = 38;
        if ( v38 == 254 )
        {
LABEL_27:
          v31 = *(_QWORD *)(a1 + 280);
          v32 = *(void (__fastcall **)(__int64, char *, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v32(a1, result, v31);
          v33 = 1;
          result = nullptr;
          ++*(_QWORD *)(a1 + 312);
          goto LABEL_41;
        }
      }
LABEL_40:
      v33 = (__int64)(result + 1);
LABEL_41:
      *(_QWORD *)(a1 + 256) = v33;
      result[a1] = v30;
      *(_BYTE *)(a1 + 264) = v30;
      return result;
    case 34LL:
      v43 = *(_QWORD *)(a1 + 256);
      v44 = "complex ";
      do
      {
        v45 = *v44;
        if ( v43 == 255 )
        {
          v46 = *(_QWORD *)(a1 + 280);
          v47 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v47(a1, 255, v46);
          v43 = 1;
          result = nullptr;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          result = (char *)v43++;
        }
        *(_QWORD *)(a1 + 256) = v43;
        ++v44;
        result[a1] = v45;
        *(_BYTE *)(a1 + 264) = v45;
      }
      while ( v44 != "" );
      return result;
    case 35LL:
      v48 = *(_QWORD *)(a1 + 256);
      v49 = "imaginary ";
      do
      {
        v50 = *v49;
        if ( v48 == 255 )
        {
          v51 = *(_QWORD *)(a1 + 280);
          v52 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v52(a1, 255, v51);
          v48 = 1;
          result = nullptr;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          result = (char *)v48++;
        }
        *(_QWORD *)(a1 + 256) = v48;
        ++v49;
        result[a1] = v50;
        *(_BYTE *)(a1 + 264) = v50;
      }
      while ( v49 != "" );
      return result;
    case 40LL:
      if ( *(_BYTE *)(a1 + 264) != 40 )
      {
        v53 = *(_QWORD *)(a1 + 256);
        if ( v53 == 255 )
        {
          v87 = *(_QWORD *)(a1 + 280);
          v88 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v88(a1, 255, v87);
          v54 = 1;
          v53 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v54 = v53 + 1;
        }
        *(_QWORD *)(a1 + 256) = v54;
        *(_BYTE *)(a1 + v53) = 32;
        *(_BYTE *)(a1 + 264) = 32;
      }
      sub_24100(a1, a2, *(unsigned int **)(a3 + 8));
      v55 = *(_QWORD *)(a1 + 256);
      if ( v55 == 255 )
      {
        v73 = *(_QWORD *)(a1 + 280);
        v74 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v74(a1, 255, v73);
        v75 = *(_QWORD *)(a1 + 312);
        result = (_BYTE *)(&dword_0 + 2);
        *(_BYTE *)a1 = 58;
        *(_BYTE *)(a1 + 1) = 58;
        *(_QWORD *)(a1 + 312) = v75 + 1;
        goto LABEL_68;
      }
      *(_QWORD *)(a1 + 256) = v55 + 1;
      *(_BYTE *)(a1 + v55) = 58;
      *(_BYTE *)(a1 + 264) = 58;
      if ( v55 == 254 )
      {
        v63 = *(void (__fastcall **)(__int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v63(a1);
        *(_BYTE *)a1 = 58;
        result = (_BYTE *)(&dword_0 + 1);
        ++*(_QWORD *)(a1 + 312);
        goto LABEL_68;
      }
      result = (char *)(v55 + 2);
      *(_QWORD *)(a1 + 256) = v55 + 2;
      *(_BYTE *)(a1 + v55 + 1) = 58;
      *(_BYTE *)(a1 + 264) = 58;
      if ( v55 != 253 )
      {
LABEL_68:
        v56 = (__int64)(result + 1);
        goto LABEL_69;
      }
      v59 = *(_QWORD *)(a1 + 280);
      v60 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
      *(_BYTE *)(a1 + 255) = 0;
      v60(a1, 255, v59);
      v56 = 1;
      result = nullptr;
      ++*(_QWORD *)(a1 + 312);
LABEL_69:
      *(_QWORD *)(a1 + 256) = v56;
      result[a1] = 42;
      *(_BYTE *)(a1 + 264) = 42;
      return result;
    case 42LL:
      v9 = *(_QWORD *)(a1 + 256);
      v10 = " __vector(";
      do
      {
        v12 = *v10;
        if ( v9 == 255 )
        {
          v13 = *(_QWORD *)(a1 + 280);
          v14 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
          *(_BYTE *)(a1 + 255) = 0;
          v14(a1, 255, v13);
          v9 = 1;
          v11 = 0;
          ++*(_QWORD *)(a1 + 312);
        }
        else
        {
          v11 = v9++;
        }
        *(_QWORD *)(a1 + 256) = v9;
        ++v10;
        *(_BYTE *)(a1 + v11) = v12;
        *(_BYTE *)(a1 + 264) = v12;
      }
      while ( v10 != "" );
      sub_24100(a1, a2, *(unsigned int **)(a3 + 8));
      v57 = *(_QWORD *)(a1 + 256);
      if ( v57 == 255 )
      {
        v71 = *(_QWORD *)(a1 + 280);
        v72 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
        *(_BYTE *)(a1 + 255) = 0;
        v72(a1, 255, v71);
        v58 = 1;
        v57 = 0;
        ++*(_QWORD *)(a1 + 312);
      }
      else
      {
        v58 = v57 + 1;
      }
      *(_QWORD *)(a1 + 256) = v58;
      *(_BYTE *)(a1 + v57) = 41;
      *(_BYTE *)(a1 + 264) = 41;
      return (_BYTE *)(&qword_28 + 1);
    default:
      return (char *)sub_24100(a1, a2, (unsigned int *)a3);
  }
}


// Address: 0x2838C | Function: sub_2838C
__int64 __fastcall sub_2838C(__int64 result, unsigned int a2, _QWORD *a3, int a4)
{
  _QWORD *v4; // x19
  __int64 v5; // x20
  unsigned int **v8; // x2
  __int64 v9; // x24
  __int64 v10; // x22
  __int64 v11; // x1
  __int64 v12; // x0
  __int64 v13; // x1
  __int64 v14; // x0
  __int64 v15; // x19
  unsigned int v16; // w0
  __int64 v17; // x2
  void (__fastcall *v18)(__int64, __int64, __int64); // x3
  __int64 v19; // x2
  void (__fastcall *v20)(__int64, __int64, __int64); // x3
  __int64 v21; // x1
  __int64 v22; // x2
  void (__fastcall *v23)(__int64, __int64, __int64); // x3
  __int64 v24; // x1
  const char *v25; // x22
  char v26; // w23
  __int64 v27; // x0
  __int64 v28; // x2
  void (__fastcall *v29)(__int64, __int64, __int64); // x3

  v4 = a3;
  v5 = result;
  if ( a3 == nullptr )
    return result;
  result = *(unsigned int *)(result + 304);
  if ( (_DWORD)result != 0 )
    return result;
  while ( 1 )
  {
    result = *((unsigned int *)v4 + 4);
    if ( (_DWORD)result != 0 )
      goto LABEL_12;
    v8 = (unsigned int **)v4[1];
    result = *(unsigned int *)v8;
    if ( a4 == 0 && (unsigned int)(result - 28) <= 4 )
      goto LABEL_12;
    *((_DWORD *)v4 + 4) = 1;
    v9 = *(_QWORD *)(v5 + 288);
    *(_QWORD *)(v5 + 288) = v4[3];
    if ( (_DWORD)result == 41 )
    {
      result = sub_28968(v5, a2, v8 + 2, *v4);
      *(_QWORD *)(v5 + 288) = v9;
      return result;
    }
    if ( (_DWORD)result == 42 )
    {
      result = sub_286A0(v5, a2, v8 + 1, *v4);
      *(_QWORD *)(v5 + 288) = v9;
      return result;
    }
    if ( (_DWORD)result == 2 )
      break;
    result = (__int64)sub_27B0C(v5, a2, (__int64)v8);
    *(_QWORD *)(v5 + 288) = v9;
LABEL_12:
    v4 = (_QWORD *)*v4;
    if ( v4 != nullptr )
    {
      result = *(unsigned int *)(v5 + 304);
      if ( (_DWORD)result == 0 )
        continue;
    }
    return result;
  }
  v10 = *(_QWORD *)(v5 + 296);
  *(_QWORD *)(v5 + 296) = 0;
  sub_24100(v5, a2, v8[1]);
  *(_QWORD *)(v5 + 296) = v10;
  v11 = *(_QWORD *)(v5 + 256);
  if ( (a2 & 4) != 0 )
  {
    if ( v11 == 255 )
    {
      v22 = *(_QWORD *)(v5 + 280);
      v23 = *(void (__fastcall **)(__int64, __int64, __int64))(v5 + 272);
      *(_BYTE *)(v5 + 255) = 0;
      v23(v5, 255, v22);
      v14 = 1;
      v11 = 0;
      ++*(_QWORD *)(v5 + 312);
    }
    else
    {
      v14 = v11 + 1;
    }
    *(_QWORD *)(v5 + 256) = v14;
    *(_BYTE *)(v5 + v11) = 46;
    *(_BYTE *)(v5 + 264) = 46;
  }
  else
  {
    if ( v11 == 255 )
    {
      v19 = *(_QWORD *)(v5 + 280);
      v20 = *(void (__fastcall **)(__int64, __int64, __int64))(v5 + 272);
      *(_BYTE *)(v5 + 255) = 0;
      v20(v5, 255, v19);
      v21 = *(_QWORD *)(v5 + 312);
      v12 = 1;
      *(_BYTE *)v5 = 58;
      *(_QWORD *)(v5 + 312) = v21 + 1;
LABEL_19:
      v13 = v12 + 1;
    }
    else
    {
      v12 = v11 + 1;
      *(_QWORD *)(v5 + 256) = v11 + 1;
      *(_BYTE *)(v5 + v11) = 58;
      *(_BYTE *)(v5 + 264) = 58;
      if ( v11 != 254 )
        goto LABEL_19;
      v17 = *(_QWORD *)(v5 + 280);
      v18 = *(void (__fastcall **)(__int64, __int64, __int64))(v5 + 272);
      *(_BYTE *)(v5 + 255) = 0;
      v18(v5, 255, v17);
      v13 = 1;
      v12 = 0;
      ++*(_QWORD *)(v5 + 312);
    }
    *(_QWORD *)(v5 + 256) = v13;
    *(_BYTE *)(v5 + v12) = 58;
    *(_BYTE *)(v5 + 264) = 58;
  }
  v15 = *(_QWORD *)(v4[1] + 16LL);
  v16 = *(_DWORD *)v15;
  if ( *(_DWORD *)v15 != 70 )
    goto LABEL_27;
  v24 = *(_QWORD *)(v5 + 256);
  v25 = "{default arg#";
  do
  {
    v26 = *v25;
    v27 = v24;
    if ( v24 == 255 )
    {
      v28 = *(_QWORD *)(v5 + 280);
      v29 = *(void (__fastcall **)(__int64, __int64, __int64))(v5 + 272);
      *(_BYTE *)(v5 + 255) = 0;
      v29(v5, 255, v28);
      v24 = 1;
      v27 = 0;
      ++*(_QWORD *)(v5 + 312);
    }
    else
    {
      ++v24;
    }
    *(_QWORD *)(v5 + 256) = v24;
    ++v25;
    *(_BYTE *)(v5 + v27) = v26;
    *(_BYTE *)(v5 + 264) = v26;
  }
  while ( v25 != "" );
  sub_1C460(v5, *(_DWORD *)(v15 + 16) + 1);
  sub_1C258(v5, "}::");
  do
  {
    v15 = *(_QWORD *)(v15 + 8);
    v16 = *(_DWORD *)v15;
LABEL_27:
    ;
  }
  while ( v16 - 28 <= 4 );
  result = sub_24100(v5, a2, (unsigned int *)v15);
  *(_QWORD *)(v5 + 288) = v9;
  return result;
}


// Address: 0x286A0 | Function: sub_286A0
__int64 __fastcall sub_286A0(__int64 a1, unsigned int a2, unsigned int **a3, _QWORD *a4)
{
  _QWORD *v7; // x0
  __int64 v8; // x0
  __int64 v9; // x1
  __int64 result; // x0
  unsigned int *v11; // x2
  __int64 v12; // x4
  __int64 v13; // x1
  __int64 v14; // x0
  __int64 v15; // x1
  void (__fastcall *v16)(__int64); // x3
  __int64 v17; // x1
  void (__fastcall *v18)(__int64, __int64, __int64); // x3
  __int64 v19; // x2
  __int64 v20; // x2
  void (__fastcall *v21)(__int64); // x4
  __int64 v22; // x2
  void (__fastcall *v23)(__int64, __int64, __int64); // x3
  __int64 v24; // x2
  void (__fastcall *v25)(__int64, __int64, __int64); // x5
  __int64 v26; // x0
  __int64 v27; // x2
  void (__fastcall *v28)(__int64, __int64, __int64); // x3
  _QWORD *v29; // [xsp+38h] [xbp+38h]
  _QWORD *v30; // [xsp+38h] [xbp+38h]

  v7 = a4;
  if ( a4 == nullptr )
  {
LABEL_5:
    v8 = *(_QWORD *)(a1 + 256);
    goto LABEL_6;
  }
  while ( *((_DWORD *)v7 + 4) != 0 )
  {
    v7 = (_QWORD *)*v7;
    if ( v7 == nullptr )
    {
      sub_2838C(a1, a2, a4, 0);
      goto LABEL_5;
    }
  }
  if ( *(_DWORD *)v7[1] == 42 )
  {
    sub_2838C(a1, a2, a4, 0);
    v9 = *(_QWORD *)(a1 + 256);
    if ( v9 != 255 )
      goto LABEL_9;
    goto LABEL_21;
  }
  v12 = *(_QWORD *)(a1 + 256);
  if ( v12 == 255 )
  {
    v24 = *(_QWORD *)(a1 + 280);
    v25 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
    *(_BYTE *)(a1 + 255) = 0;
    v30 = a4;
    v25(a1, 255, v24);
    v13 = 1;
    a4 = v30;
    v26 = *(_QWORD *)(a1 + 312) + 1LL;
    *(_BYTE *)a1 = 32;
    *(_QWORD *)(a1 + 312) = v26;
  }
  else
  {
    v13 = v12 + 1;
    *(_QWORD *)(a1 + 256) = v12 + 1;
    *(_BYTE *)(a1 + v12) = 32;
    *(_BYTE *)(a1 + 264) = 32;
    if ( v12 == 254 )
    {
      v21 = *(void (__fastcall **)(__int64))(a1 + 272);
      *(_BYTE *)(a1 + 255) = 0;
      v29 = a4;
      v21(a1);
      v14 = 1;
      v13 = 0;
      a4 = v29;
      ++*(_QWORD *)(a1 + 312);
      goto LABEL_17;
    }
  }
  v14 = v13 + 1;
LABEL_17:
  *(_QWORD *)(a1 + 256) = v14;
  *(_BYTE *)(a1 + v13) = 40;
  *(_BYTE *)(a1 + 264) = 40;
  sub_2838C(a1, a2, a4, 0);
  v15 = *(_QWORD *)(a1 + 256);
  v8 = v15 + 1;
  if ( v15 == 255 )
  {
    v27 = *(_QWORD *)(a1 + 280);
    v28 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
    *(_BYTE *)(a1 + 255) = 0;
    v28(a1, 255, v27);
    v8 = 1;
    v15 = 0;
    ++*(_QWORD *)(a1 + 312);
  }
  *(_QWORD *)(a1 + 256) = v8;
  *(_BYTE *)(a1 + v15) = 41;
  *(_BYTE *)(a1 + 264) = 41;
LABEL_6:
  if ( v8 == 255 )
  {
    v22 = *(_QWORD *)(a1 + 280);
    v23 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
    *(_BYTE *)(a1 + 255) = 0;
    v23(a1, 255, v22);
    v9 = 1;
    v8 = 0;
    ++*(_QWORD *)(a1 + 312);
  }
  else
  {
    v9 = v8 + 1;
  }
  *(_QWORD *)(a1 + 256) = v9;
  *(_BYTE *)(a1 + v8) = 32;
  *(_BYTE *)(a1 + 264) = 32;
  if ( v9 != 255 )
  {
LABEL_9:
    result = v9 + 1;
    *(_QWORD *)(a1 + 256) = v9 + 1;
    *(_BYTE *)(a1 + v9) = 91;
    *(_BYTE *)(a1 + 264) = 91;
    v11 = *a3;
    if ( *a3 == nullptr )
      goto LABEL_11;
    goto LABEL_10;
  }
LABEL_21:
  v16 = *(void (__fastcall **)(__int64))(a1 + 272);
  *(_BYTE *)(a1 + 255) = 0;
  v16(a1);
  *(_BYTE *)a1 = 91;
  *(_BYTE *)(a1 + 264) = 91;
  result = 1;
  v11 = *a3;
  v17 = *(_QWORD *)(a1 + 312) + 1LL;
  *(_QWORD *)(a1 + 256) = 1;
  *(_QWORD *)(a1 + 312) = v17;
  if ( v11 == nullptr )
    goto LABEL_12;
LABEL_10:
  sub_24100(a1, a2, v11);
  result = *(_QWORD *)(a1 + 256);
LABEL_11:
  if ( result != 255 )
  {
LABEL_12:
    *(_QWORD *)(a1 + 256) = result + 1;
    *(_BYTE *)(a1 + result) = 93;
    *(_BYTE *)(a1 + 264) = 93;
    return result;
  }
  v18 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
  v19 = *(_QWORD *)(a1 + 280);
  *(_BYTE *)(a1 + 255) = 0;
  v18(a1, 255, v19);
  v20 = *(_QWORD *)(a1 + 312);
  *(_QWORD *)(a1 + 256) = 1;
  *(_QWORD *)(a1 + 312) = v20 + 1;
  *(_BYTE *)a1 = 93;
  *(_BYTE *)(a1 + 264) = 93;
  return 0;
}


// Address: 0x28968 | Function: sub_28968
__int64 __fastcall sub_28968(__int64 a1, unsigned int a2, unsigned int **a3, __int64 *a4)
{
  __int64 *v8; // x0
  __int64 v9; // x23
  __int64 v10; // x1
  __int64 v11; // x0
  unsigned int *v12; // x2
  __int64 v13; // x1
  __int64 result; // x0
  int v15; // w0
  __int64 v16; // x0
  __int64 v17; // x1
  void (__fastcall *v18)(__int64); // x3
  __int64 v19; // x0
  __int64 v20; // x0
  void (__fastcall *v21)(__int64); // x3
  __int64 v22; // x1
  __int64 v23; // x2
  void (__fastcall *v24)(__int64, __int64, __int64); // x3
  __int64 v25; // x2
  void (__fastcall *v26)(__int64, __int64, __int64); // x3
  __int64 v27; // x2
  void (__fastcall *v28)(__int64, __int64, __int64); // x3

  if ( a4 != nullptr && *((_DWORD *)a4 + 4) == 0 )
  {
    v8 = a4;
    while ( 2 )
    {
      switch ( *(_DWORD *)v8[1] )
      {
        case 0x19:
        case 0x1A:
        case 0x1B:
        case 0x21:
        case 0x25:
        case 0x26:
        case 0x2B:
          v15 = *(unsigned __int8 *)(a1 + 264);
          goto LABEL_14;
        case 0x22:
        case 0x23:
        case 0x24:
          v15 = *(unsigned __int8 *)(a1 + 264);
          if ( (v15 & 0xFFFFFFFD) == 0x28 )
            goto LABEL_20;
LABEL_14:
          if ( v15 == 32 )
          {
LABEL_20:
            v17 = *(_QWORD *)(a1 + 256);
            if ( v17 == 255 )
            {
LABEL_18:
              v18 = *(void (__fastcall **)(__int64))(a1 + 272);
              *(_BYTE *)(a1 + 255) = 0;
              v18(a1);
              v19 = 1;
              v17 = 0;
              ++*(_QWORD *)(a1 + 312);
              goto LABEL_22;
            }
          }
          else
          {
            v16 = *(_QWORD *)(a1 + 256);
            if ( v16 == 255 )
            {
              v27 = *(_QWORD *)(a1 + 280);
              v28 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
              *(_BYTE *)(a1 + 255) = 0;
              v28(a1, 255, v27);
              v17 = 1;
              v16 = 0;
              ++*(_QWORD *)(a1 + 312);
            }
            else
            {
              v17 = v16 + 1;
            }
            *(_QWORD *)(a1 + 256) = v17;
            *(_BYTE *)(a1 + v16) = 32;
            *(_BYTE *)(a1 + 264) = 32;
            if ( v17 == 255 )
              goto LABEL_18;
          }
          v19 = v17 + 1;
LABEL_22:
          *(_QWORD *)(a1 + 256) = v19;
          *(_BYTE *)(a1 + v17) = 40;
          *(_BYTE *)(a1 + 264) = 40;
          v9 = *(_QWORD *)(a1 + 296);
          *(_QWORD *)(a1 + 296) = 0;
          sub_2838C(a1, a2, a4, 0);
          v20 = *(_QWORD *)(a1 + 256);
          if ( v20 == 255 )
          {
            v25 = *(_QWORD *)(a1 + 280);
            v26 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
            *(_BYTE *)(a1 + 255) = 0;
            v26(a1, 255, v25);
            v10 = 1;
            v20 = 0;
            ++*(_QWORD *)(a1 + 312);
          }
          else
          {
            v10 = v20 + 1;
          }
          *(_QWORD *)(a1 + 256) = v10;
          *(_BYTE *)(a1 + v20) = 41;
          *(_BYTE *)(a1 + 264) = 41;
          if ( v10 == 255 )
            goto LABEL_25;
          goto LABEL_8;
        default:
          v8 = (__int64 *)*v8;
          if ( v8 == nullptr || *((_DWORD *)v8 + 4) != 0 )
            break;
          continue;
      }
      break;
    }
  }
  v9 = *(_QWORD *)(a1 + 296);
  *(_QWORD *)(a1 + 296) = 0;
  sub_2838C(a1, a2, a4, 0);
  v10 = *(_QWORD *)(a1 + 256);
  if ( v10 == 255 )
  {
LABEL_25:
    v21 = *(void (__fastcall **)(__int64))(a1 + 272);
    *(_BYTE *)(a1 + 255) = 0;
    v21(a1);
    *(_BYTE *)a1 = 40;
    *(_BYTE *)(a1 + 264) = 40;
    v11 = 1;
    v12 = *a3;
    v22 = *(_QWORD *)(a1 + 312) + 1LL;
    *(_QWORD *)(a1 + 256) = 1;
    *(_QWORD *)(a1 + 312) = v22;
    if ( v12 == nullptr )
      goto LABEL_11;
  }
  else
  {
LABEL_8:
    v11 = v10 + 1;
    *(_QWORD *)(a1 + 256) = v10 + 1;
    *(_BYTE *)(a1 + v10) = 40;
    *(_BYTE *)(a1 + 264) = 40;
    v12 = *a3;
    if ( *a3 == nullptr )
      goto LABEL_10;
  }
  sub_24100(a1, a2, v12);
  v11 = *(_QWORD *)(a1 + 256);
LABEL_10:
  if ( v11 == 255 )
  {
    v23 = *(_QWORD *)(a1 + 280);
    v24 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
    *(_BYTE *)(a1 + 255) = 0;
    v24(a1, 255, v23);
    v13 = 1;
    v11 = 0;
    ++*(_QWORD *)(a1 + 312);
    goto LABEL_12;
  }
LABEL_11:
  v13 = v11 + 1;
LABEL_12:
  *(_QWORD *)(a1 + 256) = v13;
  *(_BYTE *)(a1 + v11) = 41;
  *(_BYTE *)(a1 + 264) = 41;
  result = sub_2838C(a1, a2, a4, 1);
  *(_QWORD *)(a1 + 296) = v9;
  return result;
}


// Address: 0x28C18 | Function: sub_28C18
__int64 __fastcall sub_28C18(__int64 a1, unsigned int a2, __int64 a3)
{
  __int64 result; // x0
  __int64 v5; // x22
  __int64 v6; // x23
  __int64 v7; // x1
  __int64 v8; // x20
  char v9; // w21
  __int64 v10; // x2
  void (__fastcall *v11)(__int64, __int64, __int64); // x3
  __int64 v12; // x2

  if ( *(_DWORD *)a3 != 49 )
    return sub_24100(a1, a2, (unsigned int *)a3);
  result = *(_QWORD *)(a3 + 8);
  v5 = *(int *)(result + 16);
  v6 = *(_QWORD *)(result + 8);
  if ( *(_DWORD *)(result + 16) != 0 )
  {
    v7 = *(_QWORD *)(a1 + 256);
    v8 = 0;
    do
    {
      while ( 1 )
      {
        v9 = *(_BYTE *)(v6 + v8);
        result = v7;
        if ( v7 == 255 )
          break;
        *(_QWORD *)(a1 + 256) = ++v7;
        ++v8;
        *(_BYTE *)(a1 + result) = v9;
        *(_BYTE *)(a1 + 264) = v9;
        if ( v5 == v8 )
          return result;
      }
      v10 = *(_QWORD *)(a1 + 280);
      v11 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
      ++v8;
      *(_BYTE *)(a1 + 255) = 0;
      v11(a1, 255, v10);
      v12 = *(_QWORD *)(a1 + 312);
      result = 0;
      v7 = 1;
      *(_QWORD *)(a1 + 256) = 1;
      *(_QWORD *)(a1 + 312) = v12 + 1;
      *(_BYTE *)a1 = v9;
      *(_BYTE *)(a1 + 264) = v9;
    }
    while ( v5 != v8 );
  }
  return result;
}


// Address: 0x28CEC | Function: sub_28CEC
__int64 __fastcall sub_28CEC(__int64 a1, unsigned int a2, unsigned int *a3)
{
  unsigned int v3; // w4
  __int64 v6; // x1
  __int64 v8; // x0
  __int64 v9; // x1
  __int64 v10; // x0
  __int64 v12; // x2
  void (__fastcall *v13)(__int64, __int64, __int64); // x3
  __int64 v14; // x2
  void (__fastcall *v15)(__int64, __int64, __int64); // x3

  v3 = *a3;
  if ( v3 == 48 || v3 <= 1 || v3 == 6 )
    return sub_24100(a1, a2, a3);
  v6 = *(_QWORD *)(a1 + 256);
  if ( v6 == 255 )
  {
    v12 = *(_QWORD *)(a1 + 280);
    v13 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
    *(_BYTE *)(a1 + 255) = 0;
    v13(a1, 255, v12);
    v8 = 1;
    v6 = 0;
    ++*(_QWORD *)(a1 + 312);
  }
  else
  {
    v8 = v6 + 1;
  }
  *(_QWORD *)(a1 + 256) = v8;
  *(_BYTE *)(a1 + v6) = 40;
  *(_BYTE *)(a1 + 264) = 40;
  sub_24100(a1, a2, a3);
  v9 = *(_QWORD *)(a1 + 256);
  if ( v9 == 255 )
  {
    v14 = *(_QWORD *)(a1 + 280);
    v15 = *(void (__fastcall **)(__int64, __int64, __int64))(a1 + 272);
    *(_BYTE *)(a1 + 255) = 0;
    v15(a1, 255, v14);
    v10 = 1;
    v9 = 0;
    ++*(_QWORD *)(a1 + 312);
  }
  else
  {
    v10 = v9 + 1;
  }
  *(_QWORD *)(a1 + 256) = v10;
  *(_BYTE *)(a1 + v9) = 41;
  *(_BYTE *)(a1 + 264) = 41;
  return 41;
}


// Address: 0x28DF4 | Function: sub_28DF4
bool __fastcall sub_28DF4(char *s1, void (__fastcall *a2)(_BYTE *), __int64 a3)
{
  unsigned int v5; // w24
  int v7; // w23
  int v8; // w1
  size_t v9; // x0
  int v10; // w0
  int v11; // w23
  int v12; // w0
  __int64 v13; // x0
  __int64 v14; // x0
  const char *v15; // x23
  unsigned int *v16; // x22
  int v17; // w0
  void (__fastcall *v18)(_BYTE *); // x3
  int v20; // w0
  const char *v21; // x1
  int v22; // w0
  int v23; // w2
  const char *v24; // x3
  int v25; // w2
  int v26; // t1
  __int64 v27; // x0
  int v28; // t1
  _QWORD v29[2]; // [xsp+0h] [xbp+0h] BYREF
  char *v30; // [xsp+48h] [xbp+48h]
  _QWORD v31[2]; // [xsp+58h] [xbp+58h] BYREF
  int v32; // [xsp+68h] [xbp+68h]
  const char *v33; // [xsp+70h] [xbp+70h]
  _QWORD *v34; // [xsp+78h] [xbp+78h]
  int v35; // [xsp+80h] [xbp+80h]
  int v36; // [xsp+84h] [xbp+84h]
  _QWORD *v37; // [xsp+88h] [xbp+88h]
  int v38; // [xsp+90h] [xbp+90h]
  int v39; // [xsp+94h] [xbp+94h]
  int v40; // [xsp+98h] [xbp+98h]
  __int64 v41; // [xsp+A0h] [xbp+A0h]
  int v42; // [xsp+A8h] [xbp+A8h]
  int v43; // [xsp+ACh] [xbp+ACh]
  int v44; // [xsp+B0h] [xbp+B0h]
  _BYTE v45[256]; // [xsp+B8h] [xbp+B8h] BYREF
  __int64 v46; // [xsp+1B8h] [xbp+1B8h]
  char v47; // [xsp+1C0h] [xbp+1C0h]
  void (__fastcall *v48)(_BYTE *); // [xsp+1C8h] [xbp+1C8h]
  __int64 v49; // [xsp+1D0h] [xbp+1D0h]
  __int64 v50; // [xsp+1D8h] [xbp+1D8h]
  __int64 v51; // [xsp+1E0h] [xbp+1E0h]
  int v52; // [xsp+1E8h] [xbp+1E8h]
  int v53; // [xsp+1ECh] [xbp+1ECh]
  __int64 v54; // [xsp+1F0h] [xbp+1F0h]
  _QWORD *v55; // [xsp+1F8h] [xbp+1F8h]
  int v56; // [xsp+200h] [xbp+200h]
  int v57; // [xsp+204h] [xbp+204h] BYREF
  _QWORD *v58; // [xsp+208h] [xbp+208h]
  int v59; // [xsp+210h] [xbp+210h]
  int v60; // [xsp+214h] [xbp+214h] BYREF
  __int64 v61; // [xsp+218h] [xbp+218h]

  v5 = (unsigned __int8)*s1;
  if ( __PAIR64__((unsigned __int8)s1[1], v5) == 0x5A0000005FLL )
  {
    v7 = 1;
  }
  else
  {
    v7 = 0;
    if ( strncmp(s1, "_GLOBAL_", 8u) == 0 )
    {
      v8 = (unsigned __int8)s1[8];
      if ( v8 == 95 || v8 == 46 || v8 == 36 )
      {
        v20 = (unsigned __int8)s1[9];
        if ( v20 == 73 || (v7 = 0, v20 == 68) )
        {
          v7 = 0;
          if ( s1[10] == 95 )
          {
            if ( v20 == 73 )
              v7 = 2;
            else
              v7 = 3;
          }
        }
      }
    }
  }
  v9 = strlen(s1);
  v31[1] = &s1[v9];
  v32 = 17;
  v31[0] = s1;
  v33 = s1;
  v37 = v29;
  v36 = 2 * v9;
  v35 = 0;
  v39 = v9;
  v38 = 0;
  v40 = 0;
  v41 = 0;
  v42 = 0;
  v43 = 0;
  v44 = 0;
  v34 = v29;
  if ( v7 == 1 )
  {
    if ( v5 != 95 || s1[1] != 90 )
      return false;
    v33 = s1 + 2;
    v16 = (unsigned int *)sub_209F8((__int64)v31, 1);
    if ( (v32 & 1) == 0 )
    {
LABEL_44:
      v17 = *(unsigned __int8 *)v33;
      goto LABEL_14;
    }
    while ( 1 )
    {
      v21 = v33;
      v17 = *(unsigned __int8 *)v33;
      if ( v17 != 46 )
        goto LABEL_14;
      v22 = *((unsigned __int8 *)v33 + 1);
      if ( (unsigned __int8)(v22 - 97) <= 0x19u || v22 == 95 )
        break;
      if ( (unsigned __int8)(v22 - 48) > 9u )
        goto LABEL_44;
      v23 = *(unsigned __int8 *)v33;
      v24 = v33;
LABEL_33:
      if ( v23 == 46 )
      {
        do
        {
          if ( (unsigned __int8)(v24[1] - 48) > 9u )
            break;
          v23 = *((unsigned __int8 *)v24 + 2);
          v24 += 2;
          if ( (unsigned __int8)(v23 - 48) > 9u )
            goto LABEL_33;
          do
          {
            v26 = *(unsigned __int8 *)++v24;
            v25 = v26;
          }
          while ( (unsigned __int8)(v26 - 48) <= 9u );
        }
        while ( v25 == 46 );
      }
      v33 = v24;
      v27 = sub_1B9B8((__int64)v31, (__int64)v21, (int)v24 - (int)v21);
      v16 = (unsigned int *)sub_1B918((__int64)v31, 76, (__int64)v16, v27);
    }
    v23 = *((unsigned __int8 *)v33 + 2);
    v24 = v33 + 2;
    if ( (unsigned __int8)(v23 - 97) > 0x19u )
      goto LABEL_42;
    while ( 1 )
    {
      do
      {
        v28 = *(unsigned __int8 *)++v24;
        v23 = v28;
      }
      while ( (unsigned __int8)(v28 - 97) <= 0x19u );
LABEL_42:
      if ( v23 != 95 )
        goto LABEL_33;
    }
  }
  if ( v7 != 0 )
  {
    v10 = (unsigned __int8)s1[11];
    if ( v7 == 2 )
      v11 = 67;
    else
      v11 = 68;
    v33 = s1 + 11;
    if ( v10 == 95 && s1[12] == 90 )
    {
      v33 = s1 + 13;
      v13 = sub_209F8((__int64)v31, 0);
    }
    else
    {
      v30 = s1 + 11;
      v12 = strlen(s1 + 11);
      v13 = sub_1B9B8((__int64)v31, (__int64)v30, v12);
    }
    v14 = sub_1B918((__int64)v31, v11, v13, 0);
    v15 = v33;
    v16 = (unsigned int *)v14;
    v33 = &v15[strlen(v33)];
    v17 = *(unsigned __int8 *)v33;
  }
  else
  {
    v16 = (unsigned int *)sub_1E51C((__int64)v31);
    v17 = *(unsigned __int8 *)v33;
  }
LABEL_14:
  if ( v17 == 0 && v16 != nullptr )
  {
    v48 = a2;
    v49 = a3;
    v46 = 0;
    v47 = 0;
    v50 = 0;
    v51 = 0;
    v53 = 0;
    v54 = 0;
    v52 = 0;
    v55 = nullptr;
    v56 = 0;
    v57 = 0;
    v58 = nullptr;
    v59 = 0;
    v60 = 0;
    sub_1BE88((char *)&v60, &v57, (__int64)v16);
    v61 = 0;
    v60 *= v57;
    v55 = v29;
    v58 = v29;
    sub_24100((__int64)v45, 0x11u, v16);
    v18 = v48;
    v45[v46] = 0;
    v18(v45);
    return v52 == 0;
  }
  return false;
}


// Address: 0x29238 | Function: __cxa_demangle
char *_cxa_demangle(const char *lpmangled, char *lpout, size_t *lpoutlen, int *lpstatus)
{
  size_t v8; // x23
  char *v9; // x19
  size_t v10; // x0
  char *v11; // x0
  char *v12[2]; // [xsp+40h] [xbp+40h] BYREF
  size_t v13; // [xsp+50h] [xbp+50h]
  int v14; // [xsp+58h] [xbp+58h]

  if ( lpmangled == nullptr || lpout != nullptr && lpoutlen == nullptr )
  {
    if ( lpstatus != nullptr )
    {
      *lpstatus = -3;
      return nullptr;
    }
    return nullptr;
  }
  v12[0] = nullptr;
  v12[1] = nullptr;
  v13 = 0;
  v14 = 0;
  if ( !sub_28DF4((char *)lpmangled, (void (__fastcall *)(_BYTE *))sub_1C168, (__int64)v12) )
  {
    free(v12[0]);
    if ( lpstatus != nullptr )
      goto LABEL_23;
    return nullptr;
  }
  v8 = 1;
  if ( v14 == 0 )
    v8 = v13;
  v9 = v12[0];
  if ( v12[0] == nullptr )
  {
    if ( lpstatus != nullptr )
    {
      if ( v8 == 1 )
      {
        *lpstatus = -1;
        return nullptr;
      }
LABEL_23:
      *lpstatus = -2;
      return nullptr;
    }
    return nullptr;
  }
  if ( lpout != nullptr )
  {
    v10 = strlen(v12[0]);
    if ( v10 >= *lpoutlen )
    {
      free(lpout);
      *lpoutlen = v8;
    }
    else
    {
      memcpy(lpout, v9, v10 + 1);
      v11 = v9;
      v9 = lpout;
      free(v11);
    }
  }
  else if ( lpoutlen != nullptr )
  {
    *lpoutlen = v8;
  }
  if ( lpstatus != nullptr )
    *lpstatus = 0;
  return v9;
}


// Address: 0x29394 | Function: __gcclibcxx_demangle_callback
__int64 __fastcall _gcclibcxx_demangle_callback(char *a1, void (__fastcall *a2)(_BYTE *), __int64 a3)
{
  if ( a1 == nullptr || a2 == nullptr )
    return 4294967293LL;
  if ( sub_28DF4(a1, a2, a3) )
    return 0;
  return 4294967294LL;
}


// Address: 0x293C4 | Function: _ZNSt15__exception_ptr13exception_ptr18_M_safe_bool_dummyEv
void __fastcall std::__exception_ptr::exception_ptr::_M_safe_bool_dummy(std::__exception_ptr::exception_ptr *this)
{
  ;
}


// Address: 0x293C8 | Function: sub_293C8
void __fastcall sub_293C8(unsigned int a1, __int64 a2)
{
  void (**v2)(); // x19
  unsigned int *v3; // x0
  unsigned int v4; // w1
  unsigned int v5; // w1
  void (__fastcall *v6)(void (**)()); // x1

  v2 = *(void (***)())(a2 - 80);
  if ( a1 > 1 )
    __cxxabiv1::__terminate(*(v2 - 11));
  __cxa_free_dependent_exception();
  v3 = (unsigned int *)(v2 - 16);
  do
  {
    v4 = __ldaxr(v3);
    v5 = v4 - 1;
  }
  while ( __stlxr(v5, v3) != 0 );
  if ( v5 == 0 )
  {
    v6 = (void (__fastcall *)(void (**)()))*(v2 - 13);
    if ( v6 != nullptr )
      v6(v2);
    __cxa_free_exception(v2);
  }
}


// Address: 0x29434 | Function: _ZNSt15__exception_ptr13exception_ptrC1Ev
// Alternative name is '_ZNSt15__exception_ptr13exception_ptrC2Ev'
_QWORD *__fastcall std::__exception_ptr::exception_ptr::exception_ptr(_QWORD *this)
{
  *this = 0;
  return this;
}


// Address: 0x2943C | Function: _ZNSt15__exception_ptr13exception_ptrC2EMS0_FvvE
// Alternative name is '_ZNSt15__exception_ptr13exception_ptrC1EMS0_FvvE'
_QWORD *__fastcall std::__exception_ptr::exception_ptr::exception_ptr(_QWORD *result)
{
  *result = 0;
  return result;
}


// Address: 0x29444 | Function: _ZNSt15__exception_ptr13exception_ptr9_M_addrefEv
unsigned int *__fastcall std::__exception_ptr::exception_ptr::_M_addref(unsigned int **this)
{
  unsigned int *result; // x0
  unsigned int v2; // w1

  result = *this;
  if ( result != nullptr )
  {
    result -= 32;
    do
      v2 = __ldaxr(result);
    while ( __stlxr(v2 + 1, result) != 0 );
  }
  return result;
}


// Address: 0x29464 | Function: _ZNSt15__exception_ptr13exception_ptrC2EPv
// Alternative name is '_ZNSt15__exception_ptr13exception_ptrC1EPv'
__int64 __fastcall std::__exception_ptr::exception_ptr::exception_ptr(
        std::__exception_ptr::exception_ptr *this,
        void *a2)
{
  *(_QWORD *)this = a2;
  return std::__exception_ptr::exception_ptr::_M_addref(this);
}


// Address: 0x2946C | Function: _ZNSt15__exception_ptr13exception_ptrC2ERKS0_
// Alternative name is '_ZNSt15__exception_ptr13exception_ptrC1ERKS0_'
__int64 __fastcall std::__exception_ptr::exception_ptr::exception_ptr(
        std::__exception_ptr::exception_ptr *this,
        const std::__exception_ptr::exception_ptr *a2)
{
  *(_QWORD *)this = *(_QWORD *)a2;
  return std::__exception_ptr::exception_ptr::_M_addref(this);
}


// Address: 0x29478 | Function: _ZNSt15__exception_ptr13exception_ptr10_M_releaseEv
void __fastcall std::__exception_ptr::exception_ptr::_M_release(void **this)
{
  _QWORD *v1; // x1
  unsigned int *v2; // x2
  unsigned int v3; // w3
  unsigned int v4; // w3
  void (__fastcall *v5)(void *); // x1

  v1 = *this;
  if ( *this != nullptr )
  {
    v2 = (unsigned int *)(v1 - 16);
    do
    {
      v3 = __ldaxr(v2);
      v4 = v3 - 1;
    }
    while ( __stlxr(v4, v2) != 0 );
    if ( v4 == 0 )
    {
      v5 = (void (__fastcall *)(void *))*(v1 - 13);
      if ( v5 != nullptr )
        v5(*this);
      __cxa_free_exception(*this);
      *this = nullptr;
    }
  }
}


// Address: 0x294D0 | Function: _ZNSt15__exception_ptr13exception_ptrD2Ev
// Alternative name is '_ZNSt15__exception_ptr13exception_ptrD1Ev'
// attributes: thunk
void __fastcall std::__exception_ptr::exception_ptr::~exception_ptr(std::__exception_ptr::exception_ptr *this)
{
  std::__exception_ptr::exception_ptr::_M_release(this);
}


// Address: 0x294D4 | Function: _ZNKSt15__exception_ptr13exception_ptr6_M_getEv
__int64 __fastcall std::__exception_ptr::exception_ptr::_M_get(std::__exception_ptr::exception_ptr *this)
{
  return *(_QWORD *)this;
}


// Address: 0x294DC | Function: _ZNSt15__exception_ptr13exception_ptr4swapERS0_
__int64 *__fastcall std::__exception_ptr::exception_ptr::swap(__int64 *this, std::__exception_ptr::exception_ptr *a2)
{
  __int64 v2; // x2

  v2 = *this;
  *this = *(_QWORD *)a2;
  *(_QWORD *)a2 = v2;
  return this;
}


// Address: 0x294F0 | Function: _ZNSt15__exception_ptr13exception_ptraSERKS0_
std::__exception_ptr::exception_ptr *__fastcall std::__exception_ptr::exception_ptr::operator=(
        std::__exception_ptr::exception_ptr *a1,
        const std::__exception_ptr::exception_ptr *a2)
{
  char v4; // [xsp+28h] [xbp+28h] BYREF

  std::__exception_ptr::exception_ptr::exception_ptr((std::__exception_ptr::exception_ptr *)&v4, a2);
  std::__exception_ptr::exception_ptr::swap((std::__exception_ptr::exception_ptr *)&v4, a1);
  std::__exception_ptr::exception_ptr::~exception_ptr((std::__exception_ptr::exception_ptr *)&v4);
  return a1;
}


// Address: 0x29530 | Function: _ZNKSt15__exception_ptr13exception_ptrntEv
bool __fastcall std::__exception_ptr::exception_ptr::operator!(_QWORD *a1)
{
  return *a1 == 0;
}


// Address: 0x29540 | Function: _ZNKSt15__exception_ptr13exception_ptrcvMS0_FvvEEv
void (__fastcall *__fastcall std::__exception_ptr::exception_ptr::operator void (std::__exception_ptr::exception_ptr::*)(void)(
        _QWORD *a1))(std::__exception_ptr::exception_ptr *this)
{
  if ( *a1 != 0 )
    return std::__exception_ptr::exception_ptr::_M_safe_bool_dummy;
  else
    return nullptr;
}


// Address: 0x29564 | Function: _ZNKSt15__exception_ptr13exception_ptr20__cxa_exception_typeEv
__int64 __fastcall std::__exception_ptr::exception_ptr::__cxa_exception_type(std::__exception_ptr::exception_ptr *this)
{
  return *(_QWORD *)(*(_QWORD *)this - 112LL);
}


// Address: 0x29570 | Function: _ZNSt15__exception_ptreqERKNS_13exception_ptrES2_
bool __fastcall std::__exception_ptr::operator==(_QWORD *a1, _QWORD *a2)
{
  return *a1 == *a2;
}


// Address: 0x29584 | Function: _ZNSt15__exception_ptrneERKNS_13exception_ptrES2_
__int64 std::__exception_ptr::operator!=()
{
  return (unsigned __int8)std::__exception_ptr::operator==() ^ 1u;
}


// Address: 0x295A0 | Function: _ZSt17current_exceptionv
std::__exception_ptr::exception_ptr *__usercall std::current_exception@<X0>(
        std::__exception_ptr::exception_ptr *a1@<X8>)
{
  __int64 v2; // x2
  __int64 v3; // x3
  void *v4; // x1

  v2 = *(_QWORD *)__cxa_get_globals();
  if ( v2 != 0 && (unsigned __int64)((v3 = *(_QWORD *)(v2 + 80)) - 0x474E5543432B2B00LL) <= 1 )
  {
    v4 = (void *)(v2 + 112);
    if ( (v3 & 1) != 0 )
      v4 = *(void **)v2;
    std::__exception_ptr::exception_ptr::exception_ptr(a1, v4);
    return a1;
  }
  else
  {
    std::__exception_ptr::exception_ptr::exception_ptr(a1);
    return a1;
  }
}


// Address: 0x2961C | Function: _ZSt17rethrow_exceptionNSt15__exception_ptr13exception_ptrE
void __fastcall __noreturn std::rethrow_exception(std::__exception_ptr::exception_ptr *a1)
{
  __int64 v1; // x20
  _QWORD *dependent_exception; // x19
  unsigned int *v3; // x0
  unsigned int v4; // w1

  v1 = std::__exception_ptr::exception_ptr::_M_get(a1);
  dependent_exception = (_QWORD *)__cxa_allocate_dependent_exception();
  v3 = (unsigned int *)(v1 - 128);
  *dependent_exception = v1;
  do
    v4 = __ldaxr(v3);
  while ( __stlxr(v4 + 1, v3) != 0 );
  dependent_exception[2] = std::get_unexpected();
  dependent_exception[3] = std::get_terminate();
  dependent_exception[10] = 0x474E5543432B2B01LL;
  dependent_exception[11] = sub_293C8;
  sub_2C338(dependent_exception + 10);
  __cxa_begin_catch(dependent_exception + 10);
  std::terminate();
}


// Address: 0x29698 | Function: __cxa_current_exception_type
struct type_info *_cxa_current_exception_type()
{
  __int64 v0; // x0

  v0 = *(_QWORD *)__cxa_get_globals();
  if ( v0 == 0 )
    return nullptr;
  if ( (*(_QWORD *)(v0 + 80) & 1) != 0 )
    v0 = *(_QWORD *)v0 - 112LL;
  return *(struct type_info **)v0;
}


// Address: 0x296D4 | Function: __cxa_guard_acquire
int _cxa_guard_acquire(__guard *a1)
{
  unsigned int v2; // w0
  int result; // w0
  unsigned int v4; // w1
  _QWORD *exception; // x0
  int v6; // [xsp+48h] [xbp+48h]

  if ( &_google_potentially_blocking_region_begin != nullptr )
    __google_potentially_blocking_region_begin();
  if ( *(_BYTE *)a1 != 0 )
    goto LABEL_10;
  if ( &pthread_create == nullptr )
  {
    if ( *(_BYTE *)a1 == 0 )
    {
      if ( *((_BYTE *)a1 + 1) != 0 )
      {
        exception = __cxa_allocate_exception(8u);
        *exception = off_49800;
        __cxa_throw(
          exception,
          (struct type_info *)&`typeinfo for'__gnu_cxx::recursive_init_error,
          (void (*)(void *))__gnu_cxx::recursive_init_error::~recursive_init_error);
      }
      result = 1;
      *((_BYTE *)a1 + 1) = 1;
      goto LABEL_11;
    }
LABEL_10:
    result = 0;
    goto LABEL_11;
  }
  while ( 1 )
  {
    do
      v2 = __ldaxr((unsigned int *)a1);
    while ( v2 == 0 && __stlxr(0x100u, (unsigned int *)a1) != 0 );
    if ( v2 == 0 )
      break;
    if ( v2 == 1 )
      goto LABEL_10;
    if ( v2 == 256 )
    {
      do
        v4 = __ldaxr((unsigned int *)a1);
      while ( v4 == v2 && __stlxr(0x10100u, (unsigned int *)a1) != 0 );
      if ( v4 != v2 )
      {
        if ( v4 == 1 )
          goto LABEL_10;
        if ( v4 == 0 )
          continue;
      }
    }
    syscall(98, a1, 0);
  }
  result = 1;
LABEL_11:
  if ( &_google_potentially_blocking_region_end != nullptr )
  {
    v6 = result;
    __google_potentially_blocking_region_end();
    return v6;
  }
  return result;
}


// Address: 0x2984C | Function: __cxa_guard_abort
void _cxa_guard_abort(__guard *a1)
{
  unsigned int v1; // w3

  if ( &pthread_create != nullptr )
  {
    do
      v1 = __ldaxr((unsigned int *)a1);
    while ( __stlxr(0, (unsigned int *)a1) != 0 );
    if ( (v1 & 0x10000) != 0 )
      syscall(98, a1, 1, 0x7FFFFFFF, 0);
  }
  else
  {
    *((_BYTE *)a1 + 1) = 0;
  }
}


// Address: 0x298C0 | Function: __cxa_guard_release
void _cxa_guard_release(__guard *a1)
{
  unsigned int v1; // w4

  if ( &pthread_create != nullptr )
  {
    do
      v1 = __ldaxr((unsigned int *)a1);
    while ( __stlxr(1u, (unsigned int *)a1) != 0 );
    if ( (v1 & 0x10000) != 0 )
      syscall(98, a1, 1, 0x7FFFFFFF);
  }
  else
  {
    *(_WORD *)a1 = 1;
  }
}


// Address: 0x29940 | Function: _ZN9__gnu_cxx20recursive_init_errorD1Ev
// Alternative name is '_ZN9__gnu_cxx20recursive_init_errorD2Ev'
void __fastcall __gnu_cxx::recursive_init_error::~recursive_init_error(__gnu_cxx::recursive_init_error *this)
{
  *(_QWORD *)this = off_49800;
  std::exception::~exception(this);
}


// Address: 0x29954 | Function: _ZN9__gnu_cxx20recursive_init_errorD0Ev
void __fastcall __gnu_cxx::recursive_init_error::~recursive_init_error(__gnu_cxx::recursive_init_error *this)
{
  __gnu_cxx::recursive_init_error::~recursive_init_error(this);
  operator delete(this);
}


// Address: 0x29978 | Function: _ZSt15set_new_handlerPFvvE
unsigned __int64 __fastcall std::set_new_handler(void (*a1)())
{
  unsigned __int64 result; // x0

  do
    result = __ldaxr((unsigned __int64 *)&qword_5E450);
  while ( __stlxr((unsigned __int64)a1, (unsigned __int64 *)&qword_5E450) != 0 );
  return result;
}


// Address: 0x29994 | Function: _ZSt15get_new_handlerv
unsigned __int64 __fastcall std::get_new_handler()
{
  return atomic_load((unsigned __int64 *)&qword_5E450);
}


// Address: 0x299A4 | Function: sub_299A4
__int64 __fastcall sub_299A4(__int64 a1)
{
  return *(_QWORD *)(a1 + 8);
}


// Address: 0x299AC | Function: sub_299AC
void __fastcall sub_299AC(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48ED0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x29A38 | Function: sub_29A38
void __fastcall sub_29A38(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48ED0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x29ACC | Function: sub_29ACC
unsigned int *__fastcall sub_29ACC(__int64 a1, unsigned int **a2)
{
  *(_QWORD *)a1 = off_48ED0;
  return sub_187E0((unsigned int **)(a1 + 8), a2);
}


// Address: 0x29B20 | Function: sub_29B20
__int64 __fastcall sub_29B20(__int64 a1, _BYTE *a2, char a3)
{
  int v3; // w0
  _BYTE *v4; // x3
  _BYTE *v5; // x4
  int v6; // w1
  int v7; // w0
  __int64 result; // x0

  v3 = *(_DWORD *)(a1 + 24);
  *a2 = 37;
  if ( (v3 & 0x800) != 0 )
  {
    v4 = a2 + 2;
    a2[1] = 43;
  }
  else
  {
    v4 = a2 + 1;
  }
  if ( (v3 & 0x400) != 0 )
    *v4++ = 35;
  *v4 = 46;
  v4[1] = 42;
  v5 = v4 + 2;
  if ( a3 != 0 )
  {
    v5 = v4 + 3;
    v4[2] = a3;
  }
  v6 = v3 & 0x104;
  if ( v6 == 4 )
  {
    *v5 = 102;
    v5[1] = 0;
    return 102;
  }
  else
  {
    v7 = v3 & 0x4000;
    if ( v6 == 256 )
    {
      if ( v7 != 0 )
        result = 69;
      else
        result = 101;
      *v5 = result;
      v5[1] = 0;
    }
    else
    {
      if ( v7 != 0 )
        result = 71;
      else
        result = 103;
      *v5 = result;
      v5[1] = 0;
    }
  }
  return result;
}


// Address: 0x29BE8 | Function: sub_29BE8
bool __fastcall sub_29BE8(__int64 a1, __int64 a2, unsigned __int8 **a3)
{
  unsigned __int8 *v3; // x5
  unsigned __int64 v4; // x1
  unsigned __int64 v5; // x2
  unsigned __int64 v6; // x4
  int v7; // w3
  int v8; // w6
  _BOOL4 v9; // w3
  unsigned int i; // w1

  v3 = *a3;
  v4 = a2 - 1;
  v5 = *((_QWORD *)*a3 - 3) - 1LL;
  if ( v4 > v5 )
    v4 = v5;
  if ( v4 != 0 )
  {
    v6 = 0;
    do
    {
      v7 = *(unsigned __int8 *)(a1 + v6++);
      v8 = v3[v5--];
      v9 = v8 == v7;
    }
    while ( v6 < v4 && v9 );
  }
  else
  {
    v9 = true;
  }
  for ( i = *(unsigned __int8 *)(a1 + v4); v5 != 0; v9 = v3[v5--] == i )
  {
    if ( !v9 )
      break;
  }
  if ( (char)i > 0 )
    v9 &= *v3 <= i;
  return v9;
}


// Address: 0x29C7C | Function: sub_29C7C
__int64 __fastcall sub_29C7C(__int64 a1)
{
  return *(_QWORD *)(a1 + 8);
}


// Address: 0x29C84 | Function: sub_29C84
__int64 __fastcall sub_29C84(__int64 a1)
{
  return *(_QWORD *)(a1 + 8);
}


// Address: 0x29C8C | Function: sub_29C8C
void __fastcall sub_29C8C(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x29D18 | Function: sub_29D18
void __fastcall sub_29D18(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x29DA4 | Function: sub_29DA4
void __fastcall sub_29DA4(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x29E30 | Function: sub_29E30
void __fastcall sub_29E30(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x29EBC | Function: sub_29EBC
void __fastcall sub_29EBC(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x29F48 | Function: sub_29F48
void __fastcall sub_29F48(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x29FD4 | Function: sub_29FD4
void __fastcall sub_29FD4(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x2A060 | Function: sub_2A060
void __fastcall sub_2A060(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x2A0EC | Function: sub_2A0EC
void __fastcall sub_2A0EC(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
}


// Address: 0x2A178 | Function: sub_2A178
void __fastcall sub_2A178(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A20C | Function: sub_2A20C
void __fastcall sub_2A20C(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A2A0 | Function: sub_2A2A0
void __fastcall sub_2A2A0(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A334 | Function: sub_2A334
void __fastcall sub_2A334(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48FF0;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A3C8 | Function: sub_2A3C8
void __fastcall sub_2A3C8(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A45C | Function: sub_2A45C
void __fastcall sub_2A45C(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A4F0 | Function: sub_2A4F0
void __fastcall sub_2A4F0(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A584 | Function: sub_2A584
void __fastcall sub_2A584(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A618 | Function: sub_2A618
void __fastcall sub_2A618(std::exception *this)
{
  __int64 v2; // x2
  void *v3; // x0
  unsigned int *v4; // x2
  int v5; // w1

  *(_QWORD *)this = off_48F00;
  v2 = *((_QWORD *)this + 1);
  v3 = (void *)(v2 - 24);
  if ( (_UNKNOWN *)(v2 - 24) != &unk_4C7C0 )
  {
    if ( &pthread_create != nullptr )
    {
      v4 = (unsigned int *)(v2 - 8);
      do
        v5 = __ldaxr(v4);
      while ( __stlxr(v5 - 1, v4) != 0 );
    }
    else
    {
      v5 = *(_DWORD *)(v2 - 8);
      *(_DWORD *)(v2 - 8) = v5 - 1;
    }
    if ( v5 <= 0 )
      operator delete(v3);
  }
  std::exception::~exception(this);
  operator delete(this);
}


// Address: 0x2A6AC | Function: sub_2A6AC
unsigned int *__fastcall sub_2A6AC(__int64 a1, unsigned int **a2)
{
  *(_QWORD *)a1 = off_48F00;
  return sub_187E0((unsigned int **)(a1 + 8), a2);
}


// Address: 0x2A6EC | Function: sub_2A6EC
__int64 (__fastcall **__fastcall sub_2A6EC(__int64 a1, unsigned int **a2))(std::exception *this)
{
  *(_QWORD *)a1 = off_48F00;
  sub_187E0((unsigned int **)(a1 + 8), a2);
  *(_QWORD *)a1 = off_48F30;
  return off_48F30;
}


// Address: 0x2A738 | Function: sub_2A738
__int64 (__fastcall **__fastcall sub_2A738(__int64 a1, unsigned int **a2))(std::exception *this)
{
  *(_QWORD *)a1 = off_48F00;
  sub_187E0((unsigned int **)(a1 + 8), a2);
  *(_QWORD *)a1 = off_48F60;
  return off_48F60;
}


// Address: 0x2A784 | Function: sub_2A784
__int64 (__fastcall **__fastcall sub_2A784(__int64 a1, unsigned int **a2))(std::exception *this)
{
  *(_QWORD *)a1 = off_48F00;
  sub_187E0((unsigned int **)(a1 + 8), a2);
  *(_QWORD *)a1 = off_48F90;
  return off_48F90;
}


// Address: 0x2A7D0 | Function: sub_2A7D0
__int64 (__fastcall **__fastcall sub_2A7D0(__int64 a1, unsigned int **a2))(std::exception *this)
{
  *(_QWORD *)a1 = off_48F00;
  sub_187E0((unsigned int **)(a1 + 8), a2);
  *(_QWORD *)a1 = off_48FC0;
  return off_48FC0;
}


// Address: 0x2A81C | Function: sub_2A81C
unsigned int *__fastcall sub_2A81C(__int64 a1, unsigned int **a2)
{
  *(_QWORD *)a1 = off_48FF0;
  return sub_187E0((unsigned int **)(a1 + 8), a2);
}


// Address: 0x2A85C | Function: sub_2A85C
__int64 (__fastcall **__fastcall sub_2A85C(__int64 a1, unsigned int **a2))(std::exception *this)
{
  *(_QWORD *)a1 = off_48FF0;
  sub_187E0((unsigned int **)(a1 + 8), a2);
  *(_QWORD *)a1 = off_49020;
  return off_49020;
}


// Address: 0x2A8A8 | Function: sub_2A8A8
__int64 (__fastcall **__fastcall sub_2A8A8(__int64 a1, unsigned int **a2))(std::exception *this)
{
  *(_QWORD *)a1 = off_48FF0;
  sub_187E0((unsigned int **)(a1 + 8), a2);
  *(_QWORD *)a1 = off_49050;
  return off_49050;
}


// Address: 0x2A8F4 | Function: sub_2A8F4
__int64 (__fastcall **__fastcall sub_2A8F4(__int64 a1, unsigned int **a2))(std::exception *this)
{
  *(_QWORD *)a1 = off_48FF0;
  sub_187E0((unsigned int **)(a1 + 8), a2);
  *(_QWORD *)a1 = off_49080;
  return off_49080;
}


// Address: 0x2A940 | Function: sub_2A940
char *__fastcall sub_2A940(char *result, _QWORD *a2)
{
  __int64 v2; // x2
  int v3; // w3
  char v4; // t1
  unsigned __int64 v5; // x4

  v2 = 0;
  v3 = 0;
  do
  {
    v4 = *result++;
    v5 = (unsigned __int64)(v4 & 0x7F) << v3;
    v3 += 7;
    v2 |= v5;
  }
  while ( v4 < 0 );
  *a2 = v2;
  return result;
}


// Address: 0x2A968 | Function: sub_2A968
char *__fastcall sub_2A968(char *result, _QWORD *a2)
{
  __int64 v2; // x2
  unsigned int v3; // w3
  char v4; // w4
  char v5; // t1
  unsigned __int64 v6; // x5

  v2 = 0;
  v3 = 0;
  do
  {
    v5 = *result++;
    v4 = v5;
    v6 = (unsigned __int64)(v5 & 0x7F) << v3;
    v3 += 7;
    v2 |= v6;
  }
  while ( v5 < 0 );
  if ( v3 <= 0x3F && (v4 & 0x40) != 0 )
    v2 |= -1LL << v3;
  *a2 = v2;
  return result;
}


// Address: 0x2A9A8 | Function: sub_2A9A8
char *__fastcall sub_2A9A8(char a1, char *a2, char *a3, unsigned __int64 *a4)
{
  char *v5; // x19
  _QWORD *v8; // x0
  char *result; // x0
  unsigned __int64 v10; // x1
  _QWORD *v11; // t1
  _QWORD *v12; // [xsp+38h] [xbp+38h] BYREF

  v5 = a3;
  if ( a1 == 80 )
  {
    v8 = (_QWORD *)((unsigned __int64)(a3 + 7) & 0xFFFFFFFFFFFFFFF8LL);
    v11 = (_QWORD *)*v8;
    result = (char *)(v8 + 1);
    v10 = (unsigned __int64)v11;
  }
  else
  {
    switch ( a1 & 0xF )
    {
      case 0:
      case 4:
      case 0xC:
        result = a3 + 8;
        v10 = *(_QWORD *)a3;
        break;
      case 1:
        result = sub_2A940(a3, &v12);
        goto LABEL_6;
      case 2:
        result = a3 + 2;
        v10 = *(unsigned __int16 *)a3;
        break;
      case 3:
        result = a3 + 4;
        v10 = *(unsigned int *)a3;
        break;
      case 9:
        result = sub_2A968(a3, &v12);
LABEL_6:
        v10 = (unsigned __int64)v12;
        break;
      case 0xA:
        result = a3 + 2;
        v10 = *(__int16 *)a3;
        break;
      case 0xB:
        result = a3 + 4;
        v10 = *(int *)a3;
        break;
      default:
        abort();
    }
    if ( v10 != 0 )
    {
      if ( (a1 & 0x70) != 0x10 )
        v5 = a2;
      v10 += (unsigned __int64)v5;
      if ( a1 < 0 )
        v10 = *(_QWORD *)v10;
    }
  }
  *a4 = v10;
  return result;
}


// Address: 0x2AA98 | Function: sub_2AA98
__int64 sub_2AA98()
{
  memset(&byte_5E460, 8, 32);
  memset(&byte_5E4A0, 8, 33);
  return 8;
}


// Address: 0x2ABAC | Function: sub_2ABAC
__int64 __fastcall sub_2ABAC(__int64 result, __int64 a2, _QWORD *a3)
{
  if ( byte_5E47F != 8 )
    abort();
  *a3 = a2;
  if ( (*(_QWORD *)(result + 832) & 0x4000000000000000LL) != 0 )
    *(_BYTE *)(result + 887) = 0;
  *(_QWORD *)(result + 248) = a3;
  return result;
}


// Address: 0x2ABE8 | Function: sub_2ABE8
__int64 __fastcall sub_2ABE8(__int64 a1, int a2)
{
  __int64 v2; // x2
  __int64 v3; // x1

  if ( a2 > 97 )
LABEL_2:
    abort();
  v2 = a2;
  v3 = *(_QWORD *)(a1 + 8LL * a2);
  if ( (*(_QWORD *)(a1 + 832) & 0x4000000000000000LL) != 0 && *(_BYTE *)(a1 + v2 + 856) != 0 )
    return v3;
  if ( byte_5E460[v2] != 8 )
    goto LABEL_2;
  return *(_QWORD *)v3;
}


// Address: 0x2AC40 | Function: sub_2AC40
__int64 __fastcall sub_2AC40(__int64 a1, __int64 a2)
{
  __int64 i; // x20
  _QWORD *v5; // x0
  _QWORD *v6; // x1
  __int64 result; // x0
  __int64 v8; // [xsp+38h] [xbp+38h] BYREF

  if ( ((*(_QWORD *)(a2 + 832) & 0x4000000000000000LL) == 0 || *(_BYTE *)(a2 + 887) == 0) && *(_QWORD *)(a2 + 248) == 0 )
    sub_2ABAC(a2, *(_QWORD *)(a2 + 784), &v8);
  for ( i = 0; i != 97; ++i )
  {
    v5 = *(_QWORD **)(a1 + 8 * i);
    v6 = *(_QWORD **)(a2 + 8 * i);
    if ( *(_BYTE *)(a1 + i + 856) != 0 )
LABEL_7:
      abort();
    if ( *(_BYTE *)(a2 + i + 856) != 0 && v5 != nullptr )
    {
      if ( byte_5E460[i] != 8 )
        goto LABEL_7;
      *v5 = v6;
    }
    else if ( v5 != nullptr && v6 != nullptr && v6 != v5 )
    {
      memcpy(v5, v6, (unsigned __int8)byte_5E460[i]);
    }
  }
  if ( (*(_QWORD *)(a1 + 832) & 0x4000000000000000LL) == 0 || (result = 0, *(_BYTE *)(a1 + 887) == 0) )
  {
    result = 0;
    if ( *(_QWORD *)(a1 + 248) == 0 )
      return sub_2ABE8(a2, 31) - *(_QWORD *)(a1 + 784) + *(_QWORD *)(a2 + 848);
  }
  return result;
}


// Address: 0x2AD4C | Function: sub_2AD4C
__int64 __fastcall sub_2AD4C(__int64 a1)
{
  return *(_QWORD *)(a1 + 784);
}


// Address: 0x2AD54 | Function: sub_2AD54
_QWORD *__fastcall sub_2AD54(_QWORD *result, int a2, __int64 a3)
{
  if ( a2 > 97 )
LABEL_2:
    abort();
  if ( (result[104] & 0x4000000000000000LL) != 0 && *((_BYTE *)result + a2 + 856) != 0 )
  {
    result[a2] = a3;
  }
  else
  {
    result = (_QWORD *)result[a2];
    if ( byte_5E460[a2] != 8 )
      goto LABEL_2;
    *result = a3;
  }
  return result;
}


// Address: 0x2ADAC | Function: sub_2ADAC
__int64 __fastcall sub_2ADAC(__int64 a1)
{
  return *(_QWORD *)(a1 + 792);
}


// Address: 0x2ADB4 | Function: sub_2ADB4
__int64 __fastcall sub_2ADB4(__int64 a1, _DWORD *a2)
{
  unsigned __int64 v2; // x2
  __int64 result; // x0

  v2 = *(_QWORD *)(a1 + 832);
  result = *(_QWORD *)(a1 + 792);
  *a2 = v2 >> 63;
  return result;
}


// Address: 0x2ADC8 | Function: sub_2ADC8
__int64 __fastcall sub_2ADC8(__int64 result, __int64 a2)
{
  *(_QWORD *)(result + 792) = a2;
  return result;
}


// Address: 0x2ADD0 | Function: sub_2ADD0
__int64 __fastcall sub_2ADD0(__int64 a1)
{
  return *(_QWORD *)(a1 + 800);
}


// Address: 0x2ADD8 | Function: sub_2ADD8
__int64 __fastcall sub_2ADD8(__int64 a1)
{
  return *(_QWORD *)(a1 + 824);
}


// Address: 0x2ADE0 | Function: sub_2ADE0
__int64 __fastcall sub_2ADE0(__int64 a1)
{
  bool v1; // zf
  __int64 result; // x0
  _BYTE v3[16]; // [xsp+18h] [xbp+18h] BYREF
  __int64 v4; // [xsp+28h] [xbp+28h]

  v1 = sub_2DF28(a1 - 1, v3) == 0;
  result = v4;
  if ( v1 )
    return 0;
  return result;
}


// Address: 0x2AE18 | Function: sub_2AE18
__int64 __fastcall sub_2AE18(unsigned __int8 a1, __int64 a2)
{
  unsigned int v3; // w2

  if ( a1 == 255 )
    return 0;
  v3 = a1 & 0x70;
  if ( v3 == 32 )
    return *(_QWORD *)(a2 + 808);
  if ( v3 <= 0x20 )
  {
    if ( (a1 & 0x70) == 0 || v3 == 16 )
      return 0;
LABEL_13:
    abort();
  }
  if ( v3 == 64 )
    return sub_2ADD8(a2);
  if ( v3 != 80 )
  {
    if ( v3 == 48 )
      return *(_QWORD *)(a2 + 816);
    goto LABEL_13;
  }
  return 0;
}


// Address: 0x2AE90 | Function: sub_2AE90
char *__fastcall sub_2AE90(char *result, unsigned __int64 a2, _QWORD *a3, char *a4)
{
  __int64 *v7; // x24
  unsigned __int64 v8; // x2
  char v9; // w1
  char *v10; // x20
  int v11; // w3
  char *v12; // x0
  char *v13; // x0
  __int64 v14; // x1
  unsigned __int64 v15; // x0
  char *v16; // x0
  __int64 v17; // x0
  unsigned __int64 v18; // x1
  __int64 *v19; // x3
  __int64 *v20; // x3
  char *v21; // x0
  unsigned __int64 v22; // x0
  char *v23; // x0
  __int64 v24; // x1
  int v25; // w3
  char *v26; // x2
  char *v27; // x0
  char *v28; // x0
  char *v29; // x0
  char *v30; // x0
  __int64 v31; // x1
  unsigned __int64 v32; // x0
  char *v33; // x0
  char *v34; // x0
  __int64 v35; // x0
  char *v36; // x2
  __int64 v37; // x1
  char *v38; // x0
  __int64 v39; // [xsp-660h] [xbp-660h] BYREF
  unsigned __int64 v40; // [xsp+68h] [xbp+68h]
  unsigned __int64 v41; // [xsp+78h] [xbp+78h] BYREF
  unsigned __int64 v42; // [xsp+80h] [xbp+80h] BYREF
  unsigned __int64 v43; // [xsp+88h] [xbp+88h] BYREF

  *((_QWORD *)a4 + 196) = 0;
  v7 = nullptr;
  while ( (unsigned __int64)result < a2 )
  {
    v8 = *((_QWORD *)a4 + 201);
    if ( v8 >= a3[99] + (a3[104] >> 63) )
      break;
    v9 = *result;
    v10 = result + 1;
    v11 = *result & 0xC0;
    if ( v11 == 64 )
    {
      *((_QWORD *)a4 + 201) = v8 + (v9 & 0x3F) * *((_QWORD *)a4 + 204);
      goto LABEL_58;
    }
    if ( v11 != 128 )
    {
      if ( v11 == 192 )
      {
        *(_DWORD *)&a4[16 * (v9 & 0x3F) + 8] = 0;
        goto LABEL_58;
      }
      switch ( *result )
      {
        case 0:
          goto LABEL_58;
        case 1:
          v40 = (unsigned __int8)a4[1648];
          v13 = (char *)sub_2AE18(v40, (__int64)a3);
          v10 = sub_2A9A8(v40, v13, v10, &v43);
          *((_QWORD *)a4 + 201) = v43;
          goto LABEL_58;
        case 2:
          v10 = result + 2;
          *((_QWORD *)a4 + 201) = v8 + (unsigned __int8)result[1] * *((_QWORD *)a4 + 204);
          goto LABEL_58;
        case 3:
          v10 = result + 3;
          *((_QWORD *)a4 + 201) = v8 + *(unsigned __int16 *)(result + 1) * *((_QWORD *)a4 + 204);
          goto LABEL_58;
        case 4:
          v10 = result + 5;
          *((_QWORD *)a4 + 201) = v8 + *(unsigned int *)(result + 1) * *((_QWORD *)a4 + 204);
          goto LABEL_58;
        case 5:
          v12 = sub_2A940(result + 1, &v41);
          goto LABEL_16;
        case 6:
        case 8:
          v10 = sub_2A940(result + 1, &v41);
          if ( v41 <= 0x61 )
            *(_DWORD *)&a4[16 * v41 + 8] = 0;
          goto LABEL_58;
        case 7:
          v10 = sub_2A940(result + 1, &v41);
          if ( v41 <= 0x61 )
            *(_DWORD *)&a4[16 * v41 + 8] = 6;
          goto LABEL_58;
        case 9:
          v16 = sub_2A940(result + 1, &v41);
          v10 = sub_2A940(v16, &v43);
          if ( v41 > 0x61 )
            goto LABEL_58;
          v17 = 16 * v41;
          *(_DWORD *)&a4[16 * v41 + 8] = 2;
          v18 = v43;
          goto LABEL_56;
        case 10:
          if ( v7 != nullptr )
          {
            v19 = v7;
            v7 = (__int64 *)v7[196];
          }
          else
          {
            v19 = &v39;
          }
          *((_QWORD *)a4 + 196) = memcpy(v19, a4, 0x648u);
          goto LABEL_58;
        case 11:
          v40 = *((_QWORD *)a4 + 196);
          memcpy(a4, (const void *)v40, 0x648u);
          v20 = (__int64 *)v40;
          *(_QWORD *)(v40 + 1568) = v7;
          v7 = v20;
          goto LABEL_58;
        case 12:
          v21 = sub_2A940(result + 1, &v42);
          *((_QWORD *)a4 + 198) = v42;
          v10 = sub_2A940(v21, &v42);
          *((_QWORD *)a4 + 197) = v42;
          goto LABEL_30;
        case 13:
          v10 = sub_2A940(result + 1, &v42);
          *((_QWORD *)a4 + 198) = v42;
LABEL_30:
          *((_DWORD *)a4 + 400) = 1;
          goto LABEL_58;
        case 14:
          v10 = sub_2A940(result + 1, &v42);
          v22 = v42;
          goto LABEL_40;
        case 15:
          *((_QWORD *)a4 + 199) = v10;
          *((_DWORD *)a4 + 400) = 2;
          v23 = result + 1;
          goto LABEL_49;
        case 16:
          v23 = sub_2A940(result + 1, &v41);
          if ( v41 > 0x61 )
            goto LABEL_49;
          v24 = 16 * v41;
          v25 = 3;
          v26 = &a4[16 * v41];
          goto LABEL_48;
        case 17:
          v27 = sub_2A940(result + 1, &v41);
          v10 = sub_2A968(v27, &v43);
          v14 = *((_QWORD *)a4 + 203);
          v15 = v43;
          goto LABEL_36;
        case 18:
          v28 = sub_2A940(result + 1, &v42);
          *((_QWORD *)a4 + 198) = v42;
          v29 = sub_2A968(v28, &v43);
          *((_DWORD *)a4 + 400) = 1;
          v10 = v29;
          goto LABEL_39;
        case 19:
          v10 = sub_2A968(result + 1, &v43);
LABEL_39:
          v22 = v43 * *((_QWORD *)a4 + 203);
LABEL_40:
          *((_QWORD *)a4 + 197) = v22;
          goto LABEL_58;
        case 20:
          v30 = sub_2A940(result + 1, &v41);
          v10 = sub_2A940(v30, &v42);
          v31 = *((_QWORD *)a4 + 203);
          v32 = v42;
          goto LABEL_44;
        case 21:
          v33 = sub_2A940(result + 1, &v41);
          v10 = sub_2A968(v33, &v43);
          v31 = *((_QWORD *)a4 + 203);
          v32 = v43;
LABEL_44:
          v18 = v32 * v31;
          if ( v41 > 0x61 )
            goto LABEL_58;
          v17 = 16 * v41;
          *(_DWORD *)&a4[16 * v41 + 8] = 4;
          break;
        case 22:
          v23 = sub_2A940(result + 1, &v41);
          if ( v41 <= 0x61 )
          {
            v24 = 16 * v41;
            v25 = 5;
            v26 = &a4[16 * v41];
LABEL_48:
            *((_DWORD *)v26 + 2) = v25;
            *(_QWORD *)&a4[v24] = v23;
          }
LABEL_49:
          v34 = sub_2A940(v23, &v42);
          v10 = &v34[v42];
          goto LABEL_58;
        case 45:
          v35 = 16;
          v36 = a4 + 256;
          v41 = 16;
          v37 = 0;
          do
          {
            *((_DWORD *)v36 + 2) = 1;
            ++v35;
            *(_QWORD *)v36 = v37;
            v36 += 16;
            v37 += 8;
          }
          while ( v35 != 32 );
          goto LABEL_58;
        case 46:
          v10 = sub_2A940(result + 1, &v42);
          a3[106] = v42;
          goto LABEL_58;
        case 47:
          v38 = sub_2A940(result + 1, &v41);
          v10 = sub_2A940(v38, &v42);
          if ( v41 > 0x61 )
            goto LABEL_58;
          v17 = 16 * v41;
          v18 = -(__int64)(*((_QWORD *)a4 + 203) * v42);
          *(_DWORD *)&a4[16 * v41 + 8] = 1;
          break;
        default:
          abort();
      }
      goto LABEL_56;
    }
    v12 = result + 1;
    v41 = v9 & 0x3F;
LABEL_16:
    v10 = sub_2A940(v12, &v42);
    v14 = *((_QWORD *)a4 + 203);
    v15 = v42;
LABEL_36:
    v18 = v15 * v14;
    if ( v41 <= 0x61 )
    {
      v17 = 16 * v41;
      *(_DWORD *)&a4[16 * v41 + 8] = 1;
LABEL_56:
      *(_QWORD *)&a4[v17] = v18;
    }
LABEL_58:
    result = v10;
  }
  return result;
}


// Address: 0x2B388 | Function: sub_2B388
__int64 __fastcall sub_2B388(_QWORD *a1, char *a2)
{
  __int64 v4; // x1
  __int64 v6; // x0
  unsigned int *v7; // x21
  _DWORD *v8; // x1
  __int64 v9; // x20
  __int64 v10; // x0
  char *v11; // x2
  _DWORD *i; // x0
  char *v13; // x2
  unsigned int *v14; // x22
  _BYTE *v15; // x23
  char *v16; // x0
  __int64 v17; // t1
  char *v18; // x0
  char *v19; // x0
  char *v20; // x1
  char *v21; // x0
  __int64 v22; // x1
  char *v23; // x24
  __int64 v24; // x24
  _BYTE *j; // x23
  int v26; // w1
  char v27; // w26
  char *v28; // x0
  int v29; // w0
  int v30; // w2
  char *v31; // x22
  char *v32; // x2
  int v33; // w23
  char *v34; // x0
  char *v35; // x0
  char *v36; // [xsp+68h] [xbp+68h]
  char *v37; // [xsp+68h] [xbp+68h]
  __int64 v38; // [xsp+78h] [xbp+78h] BYREF
  __int64 v39; // [xsp+80h] [xbp+80h] BYREF
  unsigned __int64 v40; // [xsp+88h] [xbp+88h] BYREF

  memset(a2, 0, 0x680u);
  v4 = a1[99];
  a1[106] = 0;
  a1[100] = 0;
  if ( v4 == 0 )
    return 5;
  v6 = sub_2DF28(v4 + (a1[104] >> 63) - 1LL, a1 + 101);
  v7 = (unsigned int *)v6;
  if ( v6 == 0 )
  {
    v8 = (_DWORD *)a1[99];
    if ( *v8 == -763358872 && v8[1] == -738197503 )
    {
      v9 = a1[98];
      *((_QWORD *)a2 + 198) = 31;
      *((_DWORD *)a2 + 400) = 1;
      *((_QWORD *)a2 + 197) = 304;
      v10 = 8;
      v11 = a2;
      do
      {
        *((_DWORD *)v11 + 2) = 1;
        *(_QWORD *)v11 = v10;
        v11 += 16;
        v10 += 8;
      }
      while ( v10 != 256 );
      for ( i = (_DWORD *)(v9 + 592); *i != 0; i = (_DWORD *)((char *)i + (unsigned int)i[1]) )
      {
        if ( *i == 1179680769 )
        {
          v13 = a2 + 1024;
          do
          {
            *((_DWORD *)v13 + 2) = 1;
            *(_QWORD *)v13 = &v13[-1312 - v9 - (_QWORD)a2 + (_QWORD)i];
            v13 += 16;
          }
          while ( v13 != a2 + 1536 );
        }
      }
      a2[1651] = 1;
      *((_QWORD *)a2 + 62) = 256;
      *((_DWORD *)a2 + 126) = 1;
      *((_DWORD *)a2 + 386) = 4;
      *((_QWORD *)a2 + 192) = *(_QWORD *)(v9 + 568) - (v9 + 304);
      *((_QWORD *)a2 + 205) = 96;
      return 0;
    }
    return 5;
  }
  v14 = (unsigned int *)(v6 + 4 - *(int *)(v6 + 4));
  *((_QWORD *)a2 + 201) = a1[103];
  v15 = (char *)v14 + 9;
  v16 = (char *)v14 + strlen((const char *)v14 + 9) + 10;
  if ( *((_BYTE *)v14 + 9) == 101 && *((_BYTE *)v14 + 10) == 104 )
  {
    v17 = *(_QWORD *)v16;
    v16 += 8;
    v15 = (char *)v14 + 11;
    *((_QWORD *)a2 + 207) = v17;
  }
  if ( *((unsigned __int8 *)v14 + 8) > 3u )
  {
    if ( *v16 != 8 || v16[1] != 0 )
      return 3;
    v16 += 2;
  }
  v18 = sub_2A940(v16, &v38);
  *((_QWORD *)a2 + 204) = v38;
  v19 = sub_2A968(v18, &v39);
  v20 = v19;
  *((_QWORD *)a2 + 203) = v39;
  if ( *((_BYTE *)v14 + 8) == 1 )
  {
    v21 = v19 + 1;
    v22 = (unsigned __int8)*v20;
  }
  else
  {
    v21 = sub_2A940(v19, &v38);
    v22 = v38;
  }
  *((_QWORD *)a2 + 205) = v22;
  a2[1649] = -1;
  v23 = nullptr;
  if ( *v15 == 122 )
  {
    ++v15;
    v21 = sub_2A940(v21, &v38);
    v24 = v38;
    a2[1650] = 1;
    v23 = &v21[v24];
  }
  for ( j = v15 + 1; ; ++j )
  {
    v26 = (unsigned __int8)*(j - 1);
    if ( *(j - 1) == 0 )
      break;
    switch ( v26 )
    {
      case 'L':
        a2[1649] = *v21;
LABEL_33:
        ++v21;
        continue;
      case 'R':
        a2[1648] = *v21;
        goto LABEL_33;
      case 'P':
        v27 = *v21;
        v36 = v21 + 1;
        v28 = (char *)sub_2AE18(*v21, (__int64)a1);
        v21 = sub_2A9A8(v27, v28, v36, &v40);
        *((_QWORD *)a2 + 202) = v40;
        break;
      case 'S':
        a2[1651] = 1;
        break;
      default:
        v21 = v23;
        goto LABEL_43;
    }
  }
  if ( v23 != nullptr )
    v21 = v23;
LABEL_43:
  if ( v21 == nullptr )
    return 3;
  sub_2AE90(v21, (unsigned __int64)v14 + *v14 + 4, a1, a2);
  v29 = (unsigned __int8)a2[1648];
  if ( v29 == 255 )
  {
    v30 = 0;
  }
  else
  {
    switch ( v29 & 7 )
    {
      case 0:
      case 4:
        v30 = 8;
        break;
      case 2:
        v30 = 2;
        break;
      case 3:
        v30 = 4;
        break;
      default:
        abort();
    }
  }
  v31 = nullptr;
  v32 = (char *)v7 + (unsigned int)(2 * v30) + 8;
  if ( a2[1650] != 0 )
  {
    v32 = sub_2A940(v32, &v40);
    v31 = &v32[v40];
  }
  v33 = (unsigned __int8)a2[1649];
  if ( v33 != 255 )
  {
    v37 = v32;
    v34 = (char *)sub_2AE18(v33, (__int64)a1);
    v32 = sub_2A9A8(v33, v34, v37, &v40);
    a1[100] = v40;
  }
  if ( v31 != nullptr )
    v35 = v31;
  else
    v35 = v32;
  sub_2AE90(v35, (unsigned __int64)v7 + *v7 + 4, a1, a2);
  return 0;
}


// Address: 0x2B7AC | Function: sub_2B7AC
__int64 __fastcall sub_2B7AC(char *a1, unsigned __int64 a2, __int64 a3, __int64 a4)
{
  int v7; // w25
  unsigned int v8; // w26
  char *v9; // x27
  __int64 v10; // x0
  int v11; // w1
  int v12; // w0
  __int64 v13; // x0
  int v14; // w1
  char *v15; // x0
  __int64 v16; // x0
  __int64 v17; // x1
  char *v18; // x27
  char *v19; // x0
  char *v20; // x0
  int v21; // w0
  __int64 v22; // x1
  __int64 v23; // x0
  __int64 v24; // x2
  __int64 v25; // x3
  __int64 v26; // x4
  __int64 v27; // x2
  __int64 v28; // x1
  __int64 v29; // x0
  unsigned __int8 v31; // [xsp+68h] [xbp+68h]
  __int64 v32; // [xsp+68h] [xbp+68h]
  __int64 v33; // [xsp+70h] [xbp+70h] BYREF
  __int64 v34; // [xsp+78h] [xbp+78h] BYREF
  __int64 v35; // [xsp+80h] [xbp+80h] BYREF
  __int64 v36; // [xsp+88h] [xbp+88h] BYREF
  _QWORD v37[64]; // [xsp+90h] [xbp+90h]

  v37[0] = a4;
  v7 = 1;
  while ( (unsigned __int64)a1 < a2 )
  {
    v8 = (unsigned __int8)*a1;
    v9 = a1 + 1;
    if ( v8 > 0x20 )
    {
      if ( v8 > 0x4F )
      {
        if ( v8 != 144 )
        {
          if ( v8 > 0x90 )
          {
            if ( v8 == 148 )
              goto LABEL_78;
            if ( v8 > 0x94 )
            {
              if ( v8 == 150 )
                goto LABEL_121;
              if ( v8 != 241 )
                goto LABEL_118;
              v18 = a1 + 2;
              v31 = a1[1];
              v19 = (char *)sub_2AE18(v31, a3);
              v20 = sub_2A9A8(v31, v19, v18, (unsigned __int64 *)&v36);
LABEL_60:
              v9 = v20;
              v10 = v36;
              goto LABEL_119;
            }
            if ( v8 != 146 )
              goto LABEL_118;
            v15 = sub_2A940(a1 + 1, &v33);
            v9 = sub_2A968(v15, &v35);
            v16 = sub_2ABE8(a3, v33);
            v17 = v35;
          }
          else
          {
            if ( v8 <= 0x6F )
            {
              v13 = a3;
              v14 = v8 - 80;
LABEL_62:
              v10 = sub_2ABE8(v13, v14);
              goto LABEL_119;
            }
            v9 = sub_2A968(a1 + 1, &v35);
            v16 = sub_2ABE8(a3, v8 - 112);
            v17 = v35;
          }
          v10 = v16 + v17;
          goto LABEL_119;
        }
        v9 = sub_2A940(a1 + 1, &v33);
        v14 = v33;
        v13 = a3;
        goto LABEL_62;
      }
      if ( v8 >= 0x30 )
      {
        v10 = v8 - 48;
        goto LABEL_119;
      }
      if ( v8 <= 0x27 )
      {
        if ( v8 != 35 )
          goto LABEL_93;
        goto LABEL_78;
      }
      if ( v8 > 0x2E )
      {
        v9 = &a1[*(__int16 *)(a1 + 1) + 3];
      }
      else
      {
        if ( v8 >= 0x29 )
        {
LABEL_93:
          if ( v7 > 1 )
          {
            v28 = v37[v7 - 2];
            v29 = v37[v7 - 1];
            switch ( *a1 )
            {
              case 26:
                v10 = v29 & v28;
                goto LABEL_111;
              case 27:
                v10 = v28 / v29;
                goto LABEL_111;
              case 28:
                v10 = v28 - v29;
                goto LABEL_111;
              case 29:
                v10 = v28 % (unsigned __int64)v29;
                goto LABEL_111;
              case 30:
                v10 = v29 * v28;
                goto LABEL_111;
              case 33:
                v10 = v29 | v28;
                goto LABEL_111;
              case 34:
                v10 = v29 + v28;
                goto LABEL_111;
              case 36:
                v10 = v28 << v29;
                goto LABEL_111;
              case 37:
                v10 = (unsigned __int64)v28 >> v29;
                goto LABEL_111;
              case 38:
                v10 = v28 >> v29;
                goto LABEL_111;
              case 39:
                v10 = v29 ^ v28;
                goto LABEL_111;
              case 41:
                v10 = v28 == v29;
                goto LABEL_111;
              case 42:
                v10 = v28 >= v29;
                goto LABEL_111;
              case 43:
                v10 = v28 > v29;
                goto LABEL_111;
              case 44:
                v10 = v28 <= v29;
                goto LABEL_111;
              case 45:
                v10 = v28 < v29;
                goto LABEL_111;
              case 46:
                v10 = v28 != v29;
LABEL_111:
                v7 -= 2;
                goto LABEL_119;
              default:
                break;
            }
          }
LABEL_118:
          abort();
        }
        if ( v7 == 0 )
          goto LABEL_118;
        --v7;
        v9 = a1 + 3;
        if ( v37[v7] != 0 )
          v9 = &a1[*(__int16 *)(a1 + 1) + 3];
      }
    }
    else
    {
      if ( v8 >= 0x1F )
        goto LABEL_78;
      if ( v8 == 16 )
      {
        v9 = sub_2A940(a1 + 1, &v34);
        v10 = v34;
        goto LABEL_119;
      }
      if ( v8 <= 0x10 )
      {
        if ( v8 == 10 )
        {
          v10 = *(unsigned __int16 *)(a1 + 1);
          goto LABEL_56;
        }
        if ( v8 <= 0xA )
        {
          if ( v8 != 6 )
          {
            if ( v8 > 6 )
            {
              v9 = a1 + 2;
              if ( v8 == 8 )
              {
                v10 = (unsigned __int8)a1[1];
              }
              else
              {
                if ( v8 != 9 )
                  goto LABEL_118;
                v10 = a1[1];
              }
            }
            else
            {
              if ( v8 != 3 )
                goto LABEL_118;
              v10 = *(_QWORD *)(a1 + 1);
              v9 = a1 + 9;
            }
            goto LABEL_119;
          }
LABEL_78:
          if ( v7 == 0 )
            goto LABEL_118;
          v27 = v37[--v7];
          if ( v8 == 31 )
          {
            v10 = -v27;
          }
          else if ( v8 > 0x1F )
          {
            if ( v8 == 35 )
            {
              v32 = v37[v7];
              v9 = sub_2A940(a1 + 1, &v34);
              v10 = v32 + v34;
            }
            else
            {
              if ( v8 == 148 )
              {
                v9 = a1 + 2;
                switch ( a1[1] )
                {
                  case 1:
                    v10 = *(unsigned __int8 *)v27;
                    goto LABEL_119;
                  case 2:
                    v10 = *(unsigned __int16 *)v27;
                    goto LABEL_119;
                  case 4:
                    v10 = *(unsigned int *)v27;
                    goto LABEL_119;
                  case 8:
                    goto LABEL_90;
                  default:
                    goto LABEL_118;
                }
              }
              v10 = ~v27;
            }
          }
          else if ( v8 == 6 )
          {
LABEL_90:
            v10 = *(_QWORD *)v27;
          }
          else
          {
            v10 = (v27 ^ (v27 >> 63)) + ((unsigned __int64)v27 >> 63);
          }
          goto LABEL_119;
        }
        if ( v8 == 13 )
        {
          v10 = *(int *)(a1 + 1);
LABEL_58:
          v9 = a1 + 5;
        }
        else if ( v8 > 0xD )
        {
          v9 = a1 + 9;
          v10 = *(_QWORD *)(a1 + 1);
        }
        else
        {
          if ( v8 != 11 )
          {
            v10 = *(unsigned int *)(a1 + 1);
            goto LABEL_58;
          }
          v10 = *(__int16 *)(a1 + 1);
LABEL_56:
          v9 = a1 + 3;
        }
LABEL_119:
        if ( (unsigned int)v7 > 0x3F )
          goto LABEL_118;
        v37[v7++] = v10;
        goto LABEL_121;
      }
      if ( v8 == 21 )
      {
        v22 = (unsigned __int8)a1[1];
        v35 = v22;
        v9 = a1 + 2;
        v23 = v7 - 1;
        if ( v22 >= v23 )
          goto LABEL_118;
        v10 = v37[v23 - v22];
        goto LABEL_119;
      }
      if ( v8 <= 0x15 )
      {
        if ( v8 == 18 )
        {
          if ( v7 == 0 )
            goto LABEL_118;
          v21 = v7 - 1;
        }
        else
        {
          if ( v8 < 0x12 )
          {
            v20 = sub_2A968(a1 + 1, &v36);
            goto LABEL_60;
          }
          if ( v8 == 19 )
          {
            if ( v7 == 0 )
              goto LABEL_118;
            --v7;
            goto LABEL_121;
          }
          if ( v7 <= 1 )
            goto LABEL_118;
          v21 = v7 - 2;
        }
        v10 = v37[v21];
        goto LABEL_119;
      }
      if ( v8 == 25 )
        goto LABEL_78;
      if ( v8 > 0x19 )
        goto LABEL_93;
      v11 = v7 - 1;
      v12 = v7 - 2;
      if ( v8 == 22 )
      {
        if ( v7 <= 1 )
          goto LABEL_118;
        v24 = v37[v11];
        v37[v11] = v37[v12];
        v37[v12] = v24;
      }
      else
      {
        if ( v8 != 23 || v7 <= 2 )
          goto LABEL_118;
        v25 = v37[v11];
        v26 = v37[v7 - 3];
        v37[v11] = v37[v12];
        v37[v12] = v26;
        v37[v7 - 3] = v25;
      }
    }
LABEL_121:
    a1 = v9;
  }
  if ( v7 == 0 )
    goto LABEL_118;
  return v37[v7 - 1];
}


// Address: 0x2BD60 | Function: sub_2BD60
__int64 __fastcall sub_2BD60(__int64 *a1, __int64 a2)
{
  int v4; // w0
  char *v5; // x0
  __int64 v6; // x23
  __int64 v7; // x26
  char *v8; // x22
  __int64 i; // x20
  unsigned int v10; // w0
  __int64 v11; // x0
  unsigned __int64 v12; // x1
  __int64 result; // x0
  __int64 v14; // [xsp+70h] [xbp+70h] BYREF
  __int64 v15; // [xsp+78h] [xbp+78h] BYREF
  _QWORD v16[110]; // [xsp+80h] [xbp+80h] BYREF
  char v17; // [xsp+3F7h] [xbp+3F7h]

  memcpy(v16, a1, 0x3C0u);
  if ( ((v16[104] & 0x4000000000000000LL) == 0 || v17 == 0) && v16[31] == 0 )
    sub_2ABAC((__int64)v16, a1[98], &v14);
  if ( (a1[104] & 0x4000000000000000LL) != 0 )
    *((_BYTE *)a1 + 887) = 0;
  v4 = *(_DWORD *)(a2 + 1600);
  a1[31] = 0;
  if ( v4 == 1 )
  {
    v6 = sub_2ABE8((__int64)v16, *(_DWORD *)(a2 + 1584)) + *(_QWORD *)(a2 + 1576);
  }
  else
  {
    if ( v4 != 2 )
      abort();
    v5 = sub_2A940(*(char **)(a2 + 1592), &v15);
    v6 = sub_2B7AC(v5, (unsigned __int64)&v5[v15], (__int64)v16, 0);
  }
  a1[98] = v6;
  v7 = a2;
  v8 = (char *)(a1 + 107);
  for ( i = 0; i != 98; ++i )
  {
    v10 = *(_DWORD *)(v7 + 8) - 1;
    if ( v10 <= 4 )
      __asm { BR              X0; switch jump }
    v7 += 16;
    ++v8;
  }
  v11 = a1[104];
  v12 = v11 | 0x8000000000000000LL;
  result = v11 & 0x7FFFFFFFFFFFFFFFLL;
  if ( *(_BYTE *)(a2 + 1651) != 0 )
    result = v12;
  a1[104] = result;
  return result;
}


// Address: 0x2BF6C | Function: sub_2BF6C
__int64 __fastcall sub_2BF6C(_QWORD *a1, __int64 a2, __int64 a3)
{
  __int64 v3; // x30
  __int64 v7; // x20
  __int64 result; // x0
  __int64 v9; // [xsp+48h] [xbp+48h] BYREF
  char v10[1576]; // [xsp+50h] [xbp+50h] BYREF
  __int64 v11; // [xsp+678h] [xbp+678h]
  __int64 v12; // [xsp+680h] [xbp+680h]
  int v13; // [xsp+690h] [xbp+690h]

  v7 = v3;
  memset(a1, 0, 0x3C0u);
  a1[99] = v7;
  a1[104] = 0x4000000000000000LL;
  if ( (unsigned int)sub_2B388(a1, v10) != 0 )
    abort();
  if ( (&pthread_create == nullptr || pthread_once((pthread_once_t *)&algn_5E4C1[3], (void (*)(void))sub_2AA98) != 0)
    && byte_5E460[0] == 0 )
  {
    sub_2AA98();
  }
  sub_2ABAC((__int64)a1, a2, &v9);
  v11 = 0;
  v13 = 1;
  v12 = 31;
  result = sub_2BD60(a1, (__int64)v10);
  a1[99] = a3;
  return result;
}


// Address: 0x2C048 | Function: sub_2C048
__int64 __fastcall sub_2C048(__int64 *a1, __int64 a2)
{
  __int64 v4; // x1
  __int64 result; // x0

  sub_2BD60(a1, a2);
  v4 = *(_QWORD *)(a2 + 1640);
  result = *(unsigned int *)(a2 + 16 * v4 + 8);
  if ( (_DWORD)result == 6 )
  {
    a1[99] = 0;
  }
  else
  {
    result = sub_2ABE8((__int64)a1, v4);
    a1[99] = result;
  }
  return result;
}


// Address: 0x2C094 | Function: sub_2C094
__int64 __fastcall sub_2C094(_QWORD *a1, __int64 *a2)
{
  int v4; // w24
  int v5; // w22
  __int64 result; // x0
  _QWORD v7[208]; // [xsp+40h] [xbp+40h] BYREF

  while ( 1 )
  {
    v4 = sub_2B388(a2, (char *)v7);
    v5 = sub_2AD4C((__int64)a2) - ((unsigned __int64)a2[104] >> 63) == a1[3] ? 4 : 0;
    if ( v4 != 0 )
      break;
    if ( v7[202] != 0 )
    {
      result = ((__int64 (__fastcall *)(__int64, _QWORD, _QWORD, _QWORD *, __int64 *))v7[202])(1, v5 | 2u, *a1, a1, a2);
      if ( (_DWORD)result == 7 )
        return result;
      if ( (_DWORD)result != 8 )
        break;
    }
    if ( v5 != 0 )
      abort();
    sub_2C048(a2, (__int64)v7);
  }
  return 2;
}


// Address: 0x2C154 | Function: sub_2C154
__int64 __fastcall sub_2C154(_QWORD *a1, __int64 *a2)
{
  unsigned int (__fastcall *v2)(__int64, __int64, _QWORD, _QWORD *, __int64 *, __int64); // x23
  __int64 v3; // x24
  unsigned int v6; // w0
  unsigned int v7; // w19
  __int64 v8; // x1
  unsigned int v9; // w0
  _QWORD v11[208]; // [xsp+50h] [xbp+50h] BYREF

  v2 = (unsigned int (__fastcall *)(__int64, __int64, _QWORD, _QWORD *, __int64 *, __int64))a1[2];
  v3 = a1[3];
  while ( 1 )
  {
    v6 = sub_2B388(a2, (char *)v11);
    v7 = v6;
    if ( v6 != 5 && v6 != 0 )
      return 2;
    v8 = v6 == 5 ? 26LL : 10LL;
    if ( v2(1, v8, *a1, a1, a2, v3) != 0 )
      return 2;
    if ( v7 == 5 )
      return v7;
    if ( v11[202] != 0 )
      break;
LABEL_10:
    sub_2C048(a2, (__int64)v11);
  }
  v9 = ((__int64 (__fastcall *)(__int64, __int64, _QWORD, _QWORD *, __int64 *))v11[202])(1, 10, *a1, a1, a2);
  v7 = v9;
  if ( v9 != 7 )
  {
    if ( v9 != 8 )
      return 2;
    goto LABEL_10;
  }
  return v7;
}


// Address: 0x2C240 | Function: sub_2C240
__int64 __fastcall sub_2C240(__int64 a1, __int64 a2)
{
  int v4; // w0
  __int64 v5; // x1
  __int64 *v6; // x0
  _BYTE *v7; // x2
  _QWORD *v8; // x1
  int v9; // w3
  _QWORD v11[120]; // [xsp+30h] [xbp+30h] BYREF
  char v12[8]; // [xsp+3F0h] [xbp+3F0h] BYREF
  __int64 v13; // [xsp+3F8h] [xbp+3F8h] BYREF
  __int64 v14; // [xsp+A18h] [xbp+A18h] BYREF
  __int64 v15; // [xsp+A20h] [xbp+A20h]
  int v16; // [xsp+A30h] [xbp+A30h]
  __int64 v17; // [xsp+A58h] [xbp+A58h]
  __int64 v18; // [xsp+A68h] [xbp+A68h]

  memset(v11, 0, sizeof(v11));
  v11[99] = a1 + 1;
  v11[104] = 0x4000000000000000LL;
  v4 = sub_2B388(v11, v12);
  v5 = 0;
  if ( v4 == 0 && v16 != 2 )
  {
    v6 = &v13;
    v7 = (_BYTE *)(a2 + 820);
    v8 = (_QWORD *)(a2 + 32);
    do
    {
      v9 = *(unsigned __int8 *)v6;
      *v7 = v9;
      if ( v9 == 1 || v9 == 2 )
        *v8 = *(v6 - 1);
      else
        *v8 = 0;
      v6 += 2;
      ++v7;
      ++v8;
    }
    while ( v6 != &v14 );
    v5 = a2;
    *(_QWORD *)(a2 + 16) = v14;
    *(_WORD *)(a2 + 816) = v15;
    *(_WORD *)(a2 + 818) = v17;
    *(_QWORD *)(a2 + 24) = v11[106];
    *(_QWORD *)(a2 + 8) = v18;
  }
  return v5;
}


// Address: 0x2C334 | Function: nullsub_3
void nullsub_3()
{
  ;
}


// Address: 0x2C338 | Function: sub_2C338
_QWORD *__fastcall sub_2C338(
        _QWORD *a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        char a9)
{
  __int64 v9; // x30
  int v11; // w0
  __int64 v12; // x0
  _QWORD v15[120]; // [xsp+D0h] [xbp+D0h] BYREF
  __int64 v16[120]; // [xsp+490h] [xbp+490h] BYREF
  _QWORD v17[208]; // [xsp+850h] [xbp+850h] BYREF

  sub_2BF6C(v15, (__int64)&a9, v9);
  memcpy(v16, v15, sizeof(v16));
  while ( (unsigned int)sub_2B388(v16, (char *)v17) == 0 )
  {
    if ( v17[202] != 0 )
    {
      v11 = ((__int64 (__fastcall *)(__int64, __int64, _QWORD, _QWORD *, __int64 *))v17[202])(1, 1, *a1, a1, v16);
      if ( v11 == 6 )
      {
        a1[2] = 0;
        v12 = sub_2AD4C((__int64)v16);
        a1[3] = v12 - ((unsigned __int64)v16[104] >> 63);
        memcpy(v16, v15, sizeof(v16));
        if ( (unsigned int)sub_2C094(a1, v16) == 7 )
        {
          sub_2AC40((__int64)v15, (__int64)v16);
          nullsub_3();
        }
        return a1;
      }
      if ( v11 != 8 )
        return a1;
    }
    sub_2C048(v16, (__int64)v17);
  }
  return a1;
}


// Address: 0x2C4B0 | Function: sub_2C4B0
_QWORD *__fastcall sub_2C4B0(
        _QWORD *a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        char a9)
{
  __int64 v9; // x30
  _QWORD v15[120]; // [xsp+D0h] [xbp+D0h] BYREF
  __int64 v16[98]; // [xsp+490h] [xbp+490h] BYREF

  sub_2BF6C(v15, (__int64)&a9, v9);
  memcpy(v16, v15, 0x3C0u);
  a1[2] = a2;
  a1[3] = a3;
  if ( (unsigned int)sub_2C154(a1, v16) == 7 )
  {
    sub_2AC40((__int64)v15, (__int64)v16);
    nullsub_3();
  }
  return a1;
}


// Address: 0x2C5A4 | Function: sub_2C5A4
_QWORD *__fastcall sub_2C5A4(
        _QWORD *a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        char a9)
{
  __int64 v9; // x30
  int v11; // w0
  _QWORD v14[120]; // [xsp+D0h] [xbp+D0h] BYREF
  __int64 v15[98]; // [xsp+490h] [xbp+490h] BYREF

  sub_2BF6C(v14, (__int64)&a9, v9);
  memcpy(v15, v14, 0x3C0u);
  if ( a1[2] != 0 )
    v11 = sub_2C154(a1, v15);
  else
    v11 = sub_2C094(a1, v15);
  if ( v11 != 7 )
    abort();
  sub_2AC40((__int64)v14, (__int64)v15);
  nullsub_3();
  return a1;
}


// Address: 0x2C6A0 | Function: sub_2C6A0
_QWORD *__fastcall sub_2C6A0(
        _QWORD *a1,
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        char a9)
{
  __int64 v9; // x30
  char v12; // [xsp+0h] [xbp+0h]
  _QWORD v14[120]; // [xsp+D0h] [xbp+D0h] BYREF
  __int64 v15[98]; // [xsp+490h] [xbp+490h] BYREF

  if ( a1[2] != 0 )
  {
    sub_2BF6C(v14, (__int64)&a9, v9);
    memcpy(v15, v14, 0x3C0u);
    if ( (unsigned int)sub_2C154(a1, v15) != 7 )
      abort();
    sub_2AC40((__int64)v14, (__int64)v15);
    nullsub_3();
  }
  else
  {
    sub_2C338(a1, 0, v9, a4, a5, a6, a7, a8, v12);
  }
  return a1;
}


// Address: 0x2C798 | Function: sub_2C798
__int64 __fastcall sub_2C798(__int64 result)
{
  __int64 (__fastcall *v1)(__int64, __int64); // x2

  v1 = *(__int64 (__fastcall **)(__int64, __int64))(result + 8);
  if ( v1 != nullptr )
    return v1(1, result);
  return result;
}


// Address: 0x2C7BC | Function: sub_2C7BC
__int64 __fastcall sub_2C7BC(
        unsigned int (__fastcall *a1)(__int64 *, __int64),
        __int64 a2,
        __int64 a3,
        __int64 a4,
        __int64 a5,
        __int64 a6,
        __int64 a7,
        __int64 a8,
        char a9)
{
  __int64 v9; // x30
  int v12; // w0
  int v13; // w19
  __int64 v15[120]; // [xsp+A0h] [xbp+A0h] BYREF
  char v16[1664]; // [xsp+460h] [xbp+460h] BYREF

  sub_2BF6C(v15, (__int64)&a9, v9);
  while ( 1 )
  {
    v12 = sub_2B388(v15, v16);
    v13 = v12;
    if ( v12 != 5 && v12 != 0 || a1(v15, a2) != 0 )
      return 3;
    if ( v13 == 5 )
      break;
    sub_2C048(v15, (__int64)v16);
  }
  return 5;
}


// Address: 0x2C88C | Function: sub_2C88C
char *__fastcall sub_2C88C(char *result, _QWORD *a2)
{
  __int64 v2; // x2
  int v3; // w3
  char v4; // t1
  unsigned __int64 v5; // x4

  v2 = 0;
  v3 = 0;
  do
  {
    v4 = *result++;
    v5 = (unsigned __int64)(v4 & 0x7F) << v3;
    v3 += 7;
    v2 |= v5;
  }
  while ( v4 < 0 );
  *a2 = v2;
  return result;
}


// Address: 0x2C8B4 | Function: sub_2C8B4
char *__fastcall sub_2C8B4(char *result, _QWORD *a2)
{
  __int64 v2; // x2
  unsigned int v3; // w3
  char v4; // w4
  char v5; // t1
  unsigned __int64 v6; // x5

  v2 = 0;
  v3 = 0;
  do
  {
    v5 = *result++;
    v4 = v5;
    v6 = (unsigned __int64)(v5 & 0x7F) << v3;
    v3 += 7;
    v2 |= v6;
  }
  while ( v5 < 0 );
  if ( v3 <= 0x3F && (v4 & 0x40) != 0 )
    v2 |= -1LL << v3;
  *a2 = v2;
  return result;
}


// Address: 0x2C8F4 | Function: sub_2C8F4
__int64 __fastcall sub_2C8F4(__int64 a1, __int64 a2, __int64 a3)
{
  unsigned __int64 v3; // x3
  unsigned __int64 v4; // x1
  __int64 result; // x0

  v3 = *(_QWORD *)(a2 + 8);
  v4 = *(_QWORD *)(a3 + 8);
  if ( v3 >= v4 )
    LODWORD(result) = 0;
  else
    LODWORD(result) = -1;
  if ( v3 > v4 )
    return 1;
  else
    return (unsigned int)result;
}


// Address: 0x2C910 | Function: sub_2C910
__int64 __fastcall sub_2C910(
        __int64 result,
        __int64 (__fastcall *a2)(__int64, _QWORD, _QWORD),
        __int64 a3,
        int a4,
        int a5)
{
  __int64 v5; // x24
  int i; // w19
  int v10; // w0
  __int64 v11; // x21
  __int64 v12; // x0
  int v13; // [xsp+58h] [xbp+58h]

  v5 = result;
  for ( i = 2 * a4 + 1; i < a5; i = result + 1 )
  {
    if ( i + 1 < a5 )
    {
      v13 = a4;
      v10 = a2(v5, *(_QWORD *)(a3 + 8LL * i), *(_QWORD *)(a3 + 8LL * i + 8));
      a4 = v13;
      if ( v10 < 0 )
        ++i;
    }
    v11 = 8LL * a4;
    result = a2(v5, *(_QWORD *)(a3 + v11), *(_QWORD *)(a3 + 8LL * i));
    if ( (result & 0x80000000) == 0 )
      break;
    a4 = i;
    v12 = *(_QWORD *)(a3 + v11);
    *(_QWORD *)(a3 + v11) = *(_QWORD *)(a3 + 8LL * i);
    *(_QWORD *)(a3 + 8LL * i) = v12;
    result = (unsigned int)(2 * i);
  }
  return result;
}


// Address: 0x2C9D0 | Function: sub_2C9D0
__int64 __fastcall sub_2C9D0(__int64 result, __int64 (__fastcall *a2)(__int64, _QWORD, _QWORD), __int64 a3)
{
  unsigned __int64 v3; // x19
  __int64 v4; // x24
  __int64 v7; // x22
  unsigned __int64 i; // x20
  __int64 v9; // x20
  int v10; // w19
  __int64 v11; // x23
  int v12; // w4
  __int64 v13; // x0

  v3 = *(_QWORD *)(a3 + 8);
  v4 = result;
  v7 = a3 + 16;
  for ( i = v3 >> 1; ; result = sub_2C910(v4, a2, v7, i, v3) )
  {
    LODWORD(i) = i - 1;
    if ( (i & 0x80000000) != 0 )
      break;
  }
  v9 = 0;
  v10 = v3 - 1;
  v11 = v7 + 8LL * v10;
  while ( v10 > 0 )
  {
    v12 = v10;
    v13 = *(_QWORD *)(a3 + 16);
    *(_QWORD *)(a3 + 16) = *(_QWORD *)(v11 + v9);
    *(_QWORD *)(v11 + v9) = v13;
    --v10;
    v9 -= 8;
    result = sub_2C910(v4, a2, v7, 0, v12);
  }
  return result;
}


// Address: 0x2CA84 | Function: sub_2CA84
__int64 __fastcall sub_2CA84(unsigned __int8 a1)
{
  __int64 result; // x0

  if ( a1 == 255 )
    return 0;
  switch ( a1 & 7 )
  {
    case 0:
    case 4:
      result = 8;
      break;
    case 2:
      result = 2;
      break;
    case 3:
      result = 4;
      break;
    default:
      abort();
  }
  return result;
}


// Address: 0x2CAE4 | Function: sub_2CAE4
__int64 __fastcall sub_2CAE4(unsigned __int8 a1, __int64 a2)
{
  unsigned int v2; // w0
  bool v3; // zf

  if ( a1 == 255 )
    return 0;
  v2 = a1 & 0x70;
  if ( v2 == 32 )
    return *(_QWORD *)(a2 + 8);
  if ( v2 > 0x20 )
  {
    if ( v2 == 48 )
      return *(_QWORD *)(a2 + 16);
    v3 = v2 == 80;
    goto LABEL_8;
  }
  v3 = v2 == 16;
  if ( v2 != 0 )
  {
LABEL_8:
    if ( !v3 )
      abort();
  }
  return 0;
}


// Address: 0x2CB44 | Function: sub_2CB44
__int64 __fastcall sub_2CB44(unsigned __int8 a1, __int64 a2)
{
  unsigned int v2; // w0
  bool v3; // zf

  if ( a1 == 255 )
    return 0;
  v2 = a1 & 0x70;
  if ( v2 == 32 )
    return *(_QWORD *)(a2 + 8);
  if ( v2 > 0x20 )
  {
    if ( v2 == 48 )
      return *(_QWORD *)(a2 + 16);
    v3 = v2 == 80;
    goto LABEL_8;
  }
  v3 = v2 == 16;
  if ( v2 != 0 )
  {
LABEL_8:
    if ( !v3 )
      abort();
  }
  return 0;
}


// Address: 0x2CBA4 | Function: sub_2CBA4
char *__fastcall sub_2CBA4(char a1, char *a2, char *a3, unsigned __int64 *a4)
{
  char *v5; // x19
  _QWORD *v8; // x0
  char *result; // x0
  unsigned __int64 v10; // x1
  _QWORD *v11; // t1
  _QWORD *v12; // [xsp+38h] [xbp+38h] BYREF

  v5 = a3;
  if ( a1 == 80 )
  {
    v8 = (_QWORD *)((unsigned __int64)(a3 + 7) & 0xFFFFFFFFFFFFFFF8LL);
    v11 = (_QWORD *)*v8;
    result = (char *)(v8 + 1);
    v10 = (unsigned __int64)v11;
  }
  else
  {
    switch ( a1 & 0xF )
    {
      case 0:
      case 4:
      case 0xC:
        result = a3 + 8;
        v10 = *(_QWORD *)a3;
        break;
      case 1:
        result = sub_2C88C(a3, &v12);
        goto LABEL_6;
      case 2:
        result = a3 + 2;
        v10 = *(unsigned __int16 *)a3;
        break;
      case 3:
        result = a3 + 4;
        v10 = *(unsigned int *)a3;
        break;
      case 9:
        result = sub_2C8B4(a3, &v12);
LABEL_6:
        v10 = (unsigned __int64)v12;
        break;
      case 0xA:
        result = a3 + 2;
        v10 = *(__int16 *)a3;
        break;
      case 0xB:
        result = a3 + 4;
        v10 = *(int *)a3;
        break;
      default:
        abort();
    }
    if ( v10 != 0 )
    {
      if ( (a1 & 0x70) != 0x10 )
        v5 = a2;
      v10 += (unsigned __int64)v5;
      if ( a1 < 0 )
        v10 = *(_QWORD *)v10;
    }
  }
  *a4 = v10;
  return result;
}


// Address: 0x2CC94 | Function: sub_2CC94
__int64 __fastcall sub_2CC94(__int64 a1, __int64 a2, __int64 a3)
{
  char v5; // w19
  char *v7; // x21
  __int64 result; // x0
  unsigned __int64 v9; // [xsp+40h] [xbp+40h] BYREF
  unsigned __int64 v10; // [xsp+48h] [xbp+48h] BYREF

  v5 = (unsigned __int64)*(unsigned __int16 *)(a1 + 32) >> 3;
  v7 = (char *)sub_2CAE4(v5, a1);
  sub_2CBA4(v5, v7, (char *)(a2 + 8), &v9);
  sub_2CBA4((unsigned __int64)*(unsigned __int16 *)(a1 + 32) >> 3, v7, (char *)(a3 + 8), &v10);
  if ( v9 >= v10 )
    LODWORD(result) = 0;
  else
    LODWORD(result) = -1;
  if ( v9 > v10 )
    return 1;
  else
    return (unsigned int)result;
}


// Address: 0x2CD24 | Function: sub_2CD24
__int64 __fastcall sub_2CD24(__int64 a1)
{
  __int64 v1; // x20
  size_t v3; // x0
  char *v4; // x1
  int v5; // w2
  __int64 result; // x0
  char *v7; // x0
  char *v8; // x0
  char *v9; // x0
  unsigned __int8 *v10; // x19
  char *v11; // x0
  int v12; // w1
  unsigned __int64 v13; // [xsp+28h] [xbp+28h] BYREF
  __int64 v14; // [xsp+30h] [xbp+30h] BYREF
  __int64 v15; // [xsp+38h] [xbp+38h] BYREF

  v1 = a1 + 9;
  v3 = strlen((const char *)(a1 + 9)) + 1;
  v4 = (char *)(v1 + v3);
  if ( *(unsigned __int8 *)(a1 + 8) > 3u )
  {
    v5 = *(unsigned __int8 *)(v1 + v3);
    result = 255;
    if ( v5 != 8 || v4[1] != 0 )
      return result;
    v4 += 2;
  }
  if ( *(_BYTE *)(a1 + 9) != 122 )
    return 0;
  v7 = sub_2C88C(v4, &v14);
  v8 = sub_2C8B4(v7, &v15);
  if ( *(_BYTE *)(a1 + 8) == 1 )
    v9 = v8 + 1;
  else
    v9 = sub_2C88C(v8, &v14);
  v10 = (unsigned __int8 *)(a1 + 10);
  v11 = sub_2C88C(v9, &v14);
  while ( 1 )
  {
    v12 = *v10;
    if ( v12 == 82 )
      break;
    if ( v12 == 80 )
    {
      v11 = sub_2CBA4(*v11 & 0x7F, nullptr, v11 + 1, &v13);
    }
    else
    {
      if ( v12 != 76 )
        return 0;
      ++v11;
    }
    ++v10;
  }
  return (unsigned __int8)*v11;
}


// Address: 0x2CE20 | Function: sub_2CE20
unsigned int *__fastcall sub_2CE20(__int64 a1, unsigned int *a2, __int64 a3)
{
  unsigned __int8 v4; // w0
  int v7; // w21
  char *v8; // x27
  __int64 v9; // x0
  signed int v10; // w1
  __int64 v11; // x20
  unsigned __int64 v12; // x1
  char *v14; // x0
  unsigned int v15; // w0
  __int64 v16; // x1
  unsigned __int64 v17; // [xsp+60h] [xbp+60h] BYREF
  unsigned __int64 v18; // [xsp+68h] [xbp+68h] BYREF

  v4 = (unsigned __int64)*(unsigned __int16 *)(a1 + 32) >> 3;
  v7 = v4;
  v8 = (char *)sub_2CAE4(v4, a1);
  v9 = 0;
  while ( *a2 != 0 )
  {
    v10 = a2[1];
    if ( v10 == 0 )
    {
      v11 = v9;
      goto LABEL_16;
    }
    v11 = v9;
    if ( (*(_BYTE *)(a1 + 32) & 4) != 0 )
    {
      v11 = (__int64)a2 - v10 + 4;
      if ( v11 != v9 )
      {
        v7 = sub_2CD24((__int64)a2 - v10 + 4);
        v8 = (char *)sub_2CAE4(v7, a1);
      }
    }
    if ( v7 != 0 )
    {
      v14 = sub_2CBA4(v7, v8, (char *)a2 + 8, &v17);
      sub_2CBA4(v7 & 0xF, nullptr, v14, &v18);
      v15 = sub_2CA84(v7);
      v16 = -1;
      if ( v15 <= 7uLL )
        v16 = (1LL << (8 * (unsigned __int8)v15)) - 1;
      if ( (v16 & v17) == 0 )
        goto LABEL_16;
    }
    else
    {
      v12 = *((_QWORD *)a2 + 2);
      v17 = *((_QWORD *)a2 + 1);
      v18 = v12;
      if ( v17 == 0 )
        goto LABEL_16;
    }
    if ( a3 - v17 < v18 )
      return a2;
LABEL_16:
    a2 = (unsigned int *)((char *)a2 + *a2 + 4);
    v9 = v11;
  }
  return nullptr;
}


// Address: 0x2CF80 | Function: sub_2CF80
__int64 __fastcall sub_2CF80(__int64 a1)
{
  return sub_2CD24(a1 + 4 - *(int *)(a1 + 4));
}


// Address: 0x2CF90 | Function: sub_2CF90
__int64 __fastcall sub_2CF90(__int64 *a1, unsigned __int64 a2, __int64 a3)
{
  _BOOL4 v3; // w14
  int *v4; // x6
  __int64 v5; // x7
  __int64 v6; // x5
  __int64 v7; // x9
  __int64 v8; // x4
  _QWORD *v9; // x5
  _QWORD *i; // x1
  int *v11; // x8
  _QWORD *v12; // x1
  __int64 v13; // x13
  unsigned __int64 v14; // x9
  __int64 v15; // x10
  __int64 v16; // x12
  int *v17; // x11
  int v18; // w0
  unsigned __int64 v19; // x1
  _QWORD *v21; // x0
  _BYTE *v22; // x21
  char v23; // w20
  char *v25; // x0
  char *v26; // x0
  int v27; // w20
  char *v28; // x0
  char *v29; // x22
  unsigned __int64 v30; // x1
  unsigned __int64 v31; // x0
  unsigned __int64 v32; // x3
  unsigned __int64 v33; // x4
  __int64 v34; // x20
  __int64 v35; // x23
  unsigned __int8 v36; // w24
  unsigned int v37; // w0
  _BYTE *v38; // x21
  __int64 v39; // x2
  unsigned int *v40; // x0
  char v41; // w20
  char *v42; // x0
  char *v43; // [xsp+48h] [xbp+48h]
  unsigned int *v44; // [xsp+50h] [xbp+50h] BYREF
  unsigned __int64 v45; // [xsp+58h] [xbp+58h] BYREF
  unsigned __int64 v46[4]; // [xsp+60h] [xbp+60h] BYREF
  __int64 v47; // [xsp+80h] [xbp+80h]

  v3 = a2 > 0x2F;
  v4 = (int *)a1[2];
  v5 = *a1;
  if ( a2 > 0x2F && *(_DWORD *)(a3 + 40) != 0 )
  {
    v6 = a1[5];
    if ( a1[4] == qword_4A140 && v6 == qword_5E4C8 )
    {
      v7 = qword_5E4D0;
      v8 = 0;
      v9 = nullptr;
      for ( i = (_QWORD *)qword_5E4D0; i != nullptr; i = (_QWORD *)i[5] )
      {
        if ( *(_QWORD *)a3 >= *i && *(_QWORD *)a3 < i[1] )
        {
          v5 = i[2];
          v11 = (int *)i[3];
          if ( i != (_QWORD *)qword_5E4D0 )
          {
            v9[5] = i[5];
            i[5] = v7;
            qword_5E4D0 = (__int64)i;
          }
          goto LABEL_41;
        }
        if ( *(_OWORD *)i == 0 )
        {
          v8 = (__int64)i;
          break;
        }
        v8 = (__int64)i;
        if ( i[5] != 0 )
          v9 = i;
      }
LABEL_21:
      v13 = *((unsigned __int16 *)a1 + 12);
      v14 = 0;
      v15 = 0;
      v16 = 0;
      v17 = nullptr;
      v11 = nullptr;
      while ( --v13 != -1 )
      {
        v18 = *v4;
        if ( *v4 == 1 )
        {
          v19 = v5 + *((_QWORD *)v4 + 2);
          if ( *(_QWORD *)a3 >= v19 && *(_QWORD *)a3 < v19 + *((_QWORD *)v4 + 5) )
          {
            v14 = v19 + *((_QWORD *)v4 + 5);
            v15 = v5 + *((_QWORD *)v4 + 2);
            v16 = 1;
          }
        }
        else if ( v18 == 1685382480 )
        {
          v11 = v4;
        }
        else if ( v18 == 2 )
        {
          v17 = v4;
        }
        v4 += 14;
      }
      if ( v16 != 0 )
      {
        if ( v3 )
        {
          if ( v9 != nullptr && v8 != 0 )
          {
            v9[5] = *(_QWORD *)(v8 + 40);
            *(_QWORD *)(v8 + 40) = qword_5E4D0;
            qword_5E4D0 = v8;
          }
          v21 = (_QWORD *)qword_5E4D0;
          *(_QWORD *)(qword_5E4D0 + 16) = v5;
          v21[3] = v11;
          v21[4] = v17;
          *v21 = v15;
          v21[1] = v14;
        }
LABEL_41:
        if ( v11 != nullptr )
        {
          v22 = (_BYTE *)(v5 + *((_QWORD *)v11 + 2));
          if ( *v22 != 1 )
            return 1;
          v23 = v22[1];
          v25 = (char *)sub_2CB44(v23, a3);
          v26 = sub_2CBA4(v23, v25, v22 + 4, (unsigned __int64 *)&v44);
          v27 = (unsigned __int8)v22[2];
          if ( v27 != 255 && v22[3] == 59 )
          {
            v43 = v26;
            v28 = (char *)sub_2CB44(v27, a3);
            v29 = sub_2CBA4(v27, v28, v43, &v45);
            if ( v45 == 0 )
              return 1;
            if ( ((unsigned __int8)v29 & 3) == 0 )
            {
              v30 = *(_QWORD *)a3;
              if ( *(_QWORD *)a3 >= (unsigned __int64)&v22[*(int *)v29] )
              {
                v31 = v45 - 1;
                if ( v30 < (unsigned __int64)&v22[*(int *)&v29[8 * v45 - 8]] )
                {
                  v32 = v45 - 1;
                  v33 = 0;
                  do
                  {
                    while ( 1 )
                    {
                      if ( v33 >= v32 )
                        abort();
                      v31 = (v32 + v33) >> 1;
                      if ( v30 >= (unsigned __int64)&v22[*(int *)&v29[8 * v31]] )
                        break;
                      v32 = (v32 + v33) >> 1;
                    }
                    v33 = v31 + 1;
                  }
                  while ( v30 >= (unsigned __int64)&v22[*(int *)&v29[8 * v31 + 8]] );
                }
                v34 = 8 * v31;
                v35 = (__int64)&v22[*(int *)&v29[8 * v31 + 4]];
                v36 = sub_2CF80(v35);
                v37 = sub_2CA84(v36);
                sub_2CBA4(v36 & 0xF, nullptr, (char *)(v35 + v37 + 8), v46);
                v38 = &v22[*(int *)&v29[v34]];
                if ( *(_QWORD *)a3 < (unsigned __int64)&v38[v46[0]] )
                  *(_QWORD *)(a3 + 32) = v35;
                *(_QWORD *)(a3 + 24) = v38;
              }
              return 1;
            }
          }
          v46[1] = *(_QWORD *)(a3 + 8);
          v46[2] = *(_QWORD *)(a3 + 16);
          v47 = 0;
          v39 = *(_QWORD *)a3;
          LOBYTE(v47) = 4;
          v46[0] = 0;
          v46[3] = (unsigned __int64)v44;
          v40 = sub_2CE20((__int64)v46, v44, v39);
          *(_QWORD *)(a3 + 32) = v40;
          if ( v40 != nullptr )
          {
            v41 = sub_2CF80((__int64)v40);
            v42 = (char *)sub_2CB44(v41, a3);
            sub_2CBA4(v41, v42, (char *)(*(_QWORD *)(a3 + 32) + 8LL), &v45);
            *(_QWORD *)(a3 + 24) = v45;
          }
          return 1;
        }
      }
      return 0;
    }
    qword_4A140 = a1[4];
    v12 = &unk_5E508;
    qword_5E4C8 = v6;
    do
    {
      *(v12 - 6) = 0;
      *(v12 - 5) = 0;
      *(v12 - 1) = v12;
      v12 += 6;
    }
    while ( v12 != (_QWORD *)&unk_5E688 );
    qword_5E650 = 0;
    qword_5E4D0 = (__int64)&unk_5E4D8;
    *(_DWORD *)(a3 + 40) = 0;
LABEL_19:
    v8 = 0;
    v9 = nullptr;
    goto LABEL_21;
  }
  if ( a2 > 0x19 )
    goto LABEL_19;
  return 0xFFFFFFFFLL;
}


// Address: 0x2D3AC | Function: sub_2D3AC
__int64 __fastcall sub_2D3AC(__int64 a1, __int64 a2, __int64 a3)
{
  __int64 v5; // x20
  char v6; // w22
  char *v7; // x0
  char *v8; // x0
  __int64 result; // x0
  unsigned __int64 v10; // [xsp+30h] [xbp+30h] BYREF
  unsigned __int64 v11; // [xsp+38h] [xbp+38h] BYREF

  v5 = a2;
  v6 = sub_2CF80(a2);
  v7 = (char *)sub_2CAE4(v6, a1);
  sub_2CBA4(v6, v7, (char *)(v5 + 8), &v10);
  LOBYTE(v5) = sub_2CF80(a3);
  v8 = (char *)sub_2CAE4(v5, a1);
  sub_2CBA4(v5, v8, (char *)(a3 + 8), &v11);
  if ( v10 >= v11 )
    LODWORD(result) = 0;
  else
    LODWORD(result) = -1;
  if ( v10 > v11 )
    return 1;
  else
    return (unsigned int)result;
}


// Address: 0x2D448 | Function: sub_2D448
__int64 __fastcall sub_2D448(__int64 a1, char *a2)
{
  char *v4; // x26
  int v5; // w25
  __int64 v6; // x22
  __int64 v7; // x0
  signed int v8; // w21
  __int64 v9; // x21
  int v10; // w0
  unsigned __int8 v12; // w27
  unsigned __int64 v13; // x1
  unsigned int v14; // w0
  __int64 v15; // x1
  unsigned __int64 v16; // [xsp+68h] [xbp+68h] BYREF

  v4 = nullptr;
  LOBYTE(v5) = 0;
  v6 = 0;
  v7 = 0;
  while ( *(_DWORD *)a2 != 0 )
  {
    v8 = *((_DWORD *)a2 + 1);
    if ( v8 != 0 )
    {
      v9 = (__int64)&a2[-v8 + 4];
      if ( v9 == v7 )
      {
        v9 = v7;
      }
      else
      {
        v10 = sub_2CD24(v9);
        v5 = v10;
        if ( v10 == 255 )
          return -1;
        v12 = v10;
        v4 = (char *)sub_2CAE4(v10, a1);
        v13 = *(unsigned __int16 *)(a1 + 32);
        if ( (v13 & 0x7F8) == 0x7F8 )
        {
          *(_WORD *)(a1 + 32) = v13 & 0xF807 | (8 * v12);
        }
        else if ( (unsigned __int8)(v13 >> 3) != v5 )
        {
          *(_BYTE *)(a1 + 32) |= 4u;
        }
      }
      sub_2CBA4(v5, v4, a2 + 8, &v16);
      v14 = sub_2CA84(v5);
      v15 = -1;
      if ( v14 <= 7uLL )
        v15 = (1LL << (8 * (unsigned __int8)v14)) - 1;
      if ( (v15 & v16) != 0 )
      {
        ++v6;
        if ( v16 < *(_QWORD *)a1 )
          *(_QWORD *)a1 = v16;
      }
    }
    else
    {
      v9 = v7;
    }
    a2 += *(unsigned int *)a2 + 4;
    v7 = v9;
  }
  return v6;
}


// Address: 0x2D5A8 | Function: sub_2D5A8
__int64 __fastcall sub_2D5A8(__int64 a1, __int64 *a2, unsigned int *a3)
{
  unsigned __int8 v4; // w0
  int v6; // w21
  char *v8; // x26
  __int64 result; // x0
  signed int v10; // w1
  __int64 v11; // x20
  unsigned int v12; // w0
  __int64 v13; // x1
  __int64 v14; // x0
  __int64 v15; // x1
  unsigned __int64 v16; // [xsp+68h] [xbp+68h] BYREF

  v4 = (unsigned __int64)*(unsigned __int16 *)(a1 + 32) >> 3;
  v6 = v4;
  v8 = (char *)sub_2CAE4(v4, a1);
  result = 0;
  while ( *a3 != 0 )
  {
    v10 = a3[1];
    v11 = result;
    if ( v10 == 0 )
      goto LABEL_15;
    if ( (*(_BYTE *)(a1 + 32) & 4) != 0 )
    {
      v11 = (__int64)a3 - v10 + 4;
      if ( v11 != result )
      {
        v6 = sub_2CD24((__int64)a3 - v10 + 4);
        v8 = (char *)sub_2CAE4(v6, a1);
      }
    }
    if ( v6 == 0 )
    {
      if ( *((_QWORD *)a3 + 1) == 0 )
        goto LABEL_15;
LABEL_13:
      v14 = *a2;
      if ( *a2 != 0 )
      {
        v15 = *(_QWORD *)(v14 + 8);
        *(_QWORD *)(v14 + 8) = v15 + 1;
        *(_QWORD *)(v14 + 8 * (v15 + 2)) = a3;
      }
      goto LABEL_15;
    }
    sub_2CBA4(v6, v8, (char *)a3 + 8, &v16);
    v12 = sub_2CA84(v6);
    v13 = -1;
    if ( v12 <= 7uLL )
      v13 = (1LL << (8 * (unsigned __int8)v12)) - 1;
    if ( (v13 & v16) != 0 )
      goto LABEL_13;
LABEL_15:
    a3 = (unsigned int *)((char *)a3 + *a3 + 4);
    result = v11;
  }
  return result;
}


// Address: 0x2D6DC | Function: sub_2D6DC
unsigned int *__fastcall sub_2D6DC(__int64 a1, unsigned __int64 a2)
{
  __int64 v4; // x20
  char **i; // x21
  __int64 v6; // x0
  int v7; // w0
  _QWORD *v8; // x0
  _QWORD *v9; // x0
  __int64 v10; // x5
  __int64 v11; // x4
  __int64 v12; // x1
  __int64 k; // x2
  char *v14; // x26
  _QWORD *v15; // x27
  _QWORD *v16; // x21
  __int64 v17; // x20
  __int64 v18; // x24
  __int64 v19; // x26
  _QWORD *v20; // x25
  __int64 v21; // x28
  _QWORD *v22; // x0
  unsigned int *result; // x0
  __int64 v24; // x27
  unsigned __int64 v25; // x24
  unsigned __int64 m; // x23
  unsigned __int64 v27; // x21
  __int64 v28; // x20
  char v29; // w28
  char *v30; // x0
  char *v31; // x0
  unsigned __int64 v32; // x0
  __int64 v33; // x5
  unsigned __int64 v34; // x3
  unsigned __int64 v35; // x2
  unsigned __int64 v36; // x1
  unsigned __int64 v37; // x6
  __int64 v38; // x24
  unsigned __int64 v39; // x23
  char v40; // w25
  char *v41; // x28
  unsigned __int64 v42; // x21
  unsigned __int64 *v43; // x4
  unsigned __int64 v44; // x19
  char *v45; // x0
  unsigned int **n; // x20
  unsigned int **j; // x21
  unsigned int *v48; // x2
  _QWORD *v49; // x24
  __int64 (__fastcall *v50)(__int64, __int64, __int64); // x23
  _QWORD *v51; // x25
  __int64 v52; // x3
  __int64 *v53; // x21
  __int64 *v54; // x28
  __int64 v55; // x27
  __int64 *v56; // x4
  int v57; // w0
  char *v58; // x0
  char *v59; // x0
  __int64 v60; // x0
  __int64 v61; // x4
  __int64 v62; // x1
  __int64 *v63; // [xsp+60h] [xbp+60h]
  unsigned __int64 *v64; // [xsp+68h] [xbp+68h]
  __int64 v65; // [xsp+68h] [xbp+68h]
  unsigned __int64 v66; // [xsp+78h] [xbp+78h] BYREF
  _QWORD *v67; // [xsp+80h] [xbp+80h] BYREF
  void *p; // [xsp+88h] [xbp+88h]

  if ( (*(_BYTE *)(a1 + 32) & 1) != 0 )
    goto LABEL_2;
  v4 = *(_DWORD *)(a1 + 32) >> 11;
  if ( *(_DWORD *)(a1 + 32) >> 11 != 0 )
    goto LABEL_16;
  if ( (*(_BYTE *)(a1 + 32) & 2) != 0 )
  {
    for ( i = *(char ***)(a1 + 24); *i != nullptr; ++i )
    {
      v6 = sub_2D448(a1, *i);
      if ( v6 == -1 )
        goto LABEL_9;
      v4 += v6;
    }
  }
  else
  {
    v4 = sub_2D448(a1, *(char **)(a1 + 24));
    if ( v4 == -1 )
    {
LABEL_9:
      *(_QWORD *)(a1 + 32) = 0;
      *(_WORD *)(a1 + 32) = 2040;
      *(_QWORD *)(a1 + 24) = &unk_5E660;
      goto LABEL_32;
    }
  }
  v7 = (v4 & 0x1FFFFF) == v4 ? *(_DWORD *)(a1 + 32) & 0x7FF | ((_DWORD)v4 << 11) : *(_DWORD *)(a1 + 32) & 0x7FF;
  *(_DWORD *)(a1 + 32) = v7;
  if ( v4 != 0 )
  {
LABEL_16:
    v8 = malloc(8 * (v4 + 2));
    v67 = v8;
    if ( v8 != nullptr )
    {
      v8[1] = 0;
      v9 = malloc(8 * (v4 + 2));
      p = v9;
      if ( v9 != nullptr )
        v9[1] = 0;
      if ( (*(_BYTE *)(a1 + 32) & 2) != 0 )
      {
        for ( j = *(unsigned int ***)(a1 + 24); ; ++j )
        {
          v48 = *j;
          if ( *j == nullptr )
            break;
          sub_2D5A8(a1, (__int64 *)&v67, v48);
        }
      }
      else
      {
        sub_2D5A8(a1, (__int64 *)&v67, *(unsigned int **)(a1 + 24));
      }
      v49 = v67;
      if ( v67 != nullptr && v67[1] != v4 )
LABEL_69:
        abort();
      if ( (*(_BYTE *)(a1 + 32) & 4) != 0 )
      {
        v50 = sub_2D3AC;
      }
      else if ( (*(_WORD *)(a1 + 32) & 0x7F8) != 0 )
      {
        v50 = sub_2CC94;
      }
      else
      {
        v50 = sub_2C8F4;
      }
      v51 = p;
      if ( p != nullptr )
      {
        v14 = (char *)(v67 + 2);
        v52 = v67[1];
        v53 = (__int64 *)algn_5E658;
        v54 = v67 + 2;
        v55 = 0;
        v56 = (__int64 *)algn_5E658;
        while ( v55 != v52 )
        {
          while ( v53 != v56 )
          {
            v63 = v56;
            v65 = v52;
            v57 = v50(a1, *v54, *v53);
            v52 = v65;
            v56 = v63;
            if ( (v57 & 0x80000000) == 0 )
              break;
            v58 = (char *)v51 + (char *)v53 - v14;
            v53 = *((__int64 **)v58 + 2);
            *((_QWORD *)v58 + 2) = 0;
          }
          v59 = (char *)&v51[v55++];
          *((_QWORD *)v59 + 2) = v53;
          v53 = v54++;
        }
        v60 = 0;
        v12 = 0;
        for ( k = 0; k != v52; ++k )
        {
          v10 = *(_QWORD *)v14;
          if ( v51[k + 2] != 0 )
          {
            v11 = v12 + 2;
            ++v12;
            v49[v11] = v10;
          }
          else
          {
            v61 = v60 + 2;
            ++v60;
            v51[v61] = v10;
          }
          v14 += 8;
        }
        v49[1] = v12;
        v51[1] = v60;
        if ( *((_QWORD *)p + 1) + v67[1] != v4 )
          goto LABEL_69;
        sub_2C9D0(a1, v50, (__int64)p);
        v15 = p;
        v16 = v67;
        v17 = *((_QWORD *)p + 1);
        if ( v17 != 0 )
        {
          v18 = v67[1];
          v19 = v17;
          do
          {
            --v17;
            v20 = &v16[v18];
            v21 = v15[v19 + 1];
            while ( v18 != 0 )
            {
              v62 = v20[1];
              --v20;
              if ( (int)v50(a1, v62, v21) <= 0 )
                break;
              --v18;
              v20[v19 + 2] = v20[2];
            }
            --v19;
            v16[v17 + 2 + v18] = v21;
          }
          while ( v17 != 0 );
          v16[1] += v15[1];
        }
        free(p);
      }
      else
      {
        sub_2C9D0(a1, v50, (__int64)v67);
      }
      v22 = v67;
      *v67 = *(_QWORD *)(a1 + 24);
      *(_QWORD *)(a1 + 24) = v22;
      *(_BYTE *)(a1 + 32) |= 1u;
    }
  }
LABEL_32:
  if ( a2 < *(_QWORD *)a1 )
    return nullptr;
LABEL_2:
  if ( (*(_BYTE *)(a1 + 32) & 1) != 0 )
  {
    if ( (*(_BYTE *)(a1 + 32) & 4) != 0 )
    {
      v24 = *(_QWORD *)(a1 + 24);
      v25 = 0;
      for ( m = *(_QWORD *)(v24 + 8); v25 < m; m = v27 )
      {
        v27 = (m + v25) >> 1;
        v28 = *(_QWORD *)(v24 + 8 * (v27 + 2));
        v29 = sub_2CF80(v28);
        v30 = (char *)sub_2CAE4(v29, a1);
        v31 = sub_2CBA4(v29, v30, (char *)(v28 + 8), &v66);
        sub_2CBA4(v29 & 0xF, nullptr, v31, (unsigned __int64 *)&v67);
        if ( a2 >= v66 )
        {
          if ( a2 < (unsigned __int64)v67 + v66 )
            return (unsigned int *)v28;
          v25 = v27 + 1;
          v27 = m;
        }
      }
    }
    else
    {
      v32 = *(unsigned __int16 *)(a1 + 32);
      if ( (v32 & 0x7F8) != 0 )
      {
        v38 = *(_QWORD *)(a1 + 24);
        v39 = 0;
        v40 = v32 >> 3;
        v41 = (char *)sub_2CAE4(v40, a1);
        v42 = *(_QWORD *)(v38 + 8);
        v43 = &v66;
        while ( v39 < v42 )
        {
          v44 = (v42 + v39) >> 1;
          v64 = v43;
          v28 = *(_QWORD *)(v38 + 8 * (v44 + 2));
          v45 = sub_2CBA4(v40, v41, (char *)(v28 + 8), v43);
          sub_2CBA4(v40 & 0xF, nullptr, v45, (unsigned __int64 *)&v67);
          v43 = v64;
          if ( a2 >= v66 )
          {
            if ( a2 < (unsigned __int64)v67 + v66 )
              return (unsigned int *)v28;
            v39 = v44 + 1;
            v44 = v42;
          }
          v42 = v44;
        }
      }
      else
      {
        v33 = *(_QWORD *)(a1 + 24);
        v34 = 0;
        v35 = *(_QWORD *)(v33 + 8);
        while ( v34 < v35 )
        {
          v36 = (v35 + v34) >> 1;
          result = *(unsigned int **)(v33 + 8 * (v36 + 2));
          v37 = *((_QWORD *)result + 1);
          if ( a2 < v37 )
          {
            v35 = (v35 + v34) >> 1;
          }
          else
          {
            if ( a2 < v37 + *((_QWORD *)result + 2) )
              return result;
            v34 = v36 + 1;
          }
        }
      }
    }
    return nullptr;
  }
  if ( (*(_BYTE *)(a1 + 32) & 2) != 0 )
  {
    for ( n = *(unsigned int ***)(a1 + 24); *n != nullptr; ++n )
    {
      result = sub_2CE20(a1, *n, a2);
      if ( result != nullptr )
        return result;
    }
    return nullptr;
  }
  return sub_2CE20(a1, *(unsigned int **)(a1 + 24), a2);
}


// Address: 0x2DC4C | Function: sub_2DC4C
__int64 *__fastcall sub_2DC4C(__int64 *result, _QWORD *a2, __int64 a3, __int64 a4)
{
  if ( result != nullptr && *(_DWORD *)result != 0 )
  {
    *a2 = -1;
    a2[4] = 0;
    a2[3] = result;
    a2[1] = a3;
    a2[2] = a4;
    *((_WORD *)a2 + 16) = 2040;
    if ( &pthread_create != nullptr )
      pthread_mutex_lock((pthread_mutex_t *)&unk_5E668);
    result = &qword_5E4C8;
    a2[5] = qword_5E690;
    qword_5E690 = (__int64)a2;
    if ( &pthread_create != nullptr )
      return (__int64 *)pthread_mutex_unlock((pthread_mutex_t *)&unk_5E668);
  }
  return result;
}


// Address: 0x2DCE8 | Function: sub_2DCE8
__int64 *__fastcall sub_2DCE8(__int64 *a1, _QWORD *a2)
{
  return sub_2DC4C(a1, a2, 0, 0);
}


// Address: 0x2DCF4 | Function: sub_2DCF4
__int64 *__fastcall sub_2DCF4(__int64 *result)
{
  __int64 *v1; // x19
  _QWORD *v2; // x0

  if ( *(_DWORD *)result != 0 )
  {
    v1 = result;
    v2 = malloc(0x30u);
    return sub_2DCE8(v1, v2);
  }
  return result;
}


// Address: 0x2DD34 | Function: sub_2DD34
__int64 *__fastcall sub_2DD34(__int64 a1, _QWORD *a2, __int64 a3, __int64 a4)
{
  __int16 v4; // w0
  __int64 *result; // x0
  _QWORD *v6; // [xsp+28h] [xbp+28h]

  a2[4] = 0;
  a2[3] = a1;
  *((_BYTE *)a2 + 32) = 2;
  a2[1] = a3;
  v4 = *((_WORD *)a2 + 16);
  *a2 = -1;
  a2[2] = a4;
  *((_WORD *)a2 + 16) = v4 | 0x7F8;
  if ( &pthread_create != nullptr )
  {
    v6 = a2;
    pthread_mutex_lock((pthread_mutex_t *)&unk_5E668);
    a2 = v6;
  }
  result = &qword_5E4C8;
  a2[5] = qword_5E690;
  qword_5E690 = (__int64)a2;
  if ( &pthread_create != nullptr )
    return (__int64 *)pthread_mutex_unlock((pthread_mutex_t *)&unk_5E668);
  return result;
}


// Address: 0x2DDC8 | Function: sub_2DDC8
__int64 *__fastcall sub_2DDC8(__int64 a1, _QWORD *a2)
{
  return sub_2DD34(a1, a2, 0, 0);
}


// Address: 0x2DDD4 | Function: sub_2DDD4
__int64 *__fastcall sub_2DDD4(__int64 a1)
{
  _QWORD *v2; // x0

  v2 = malloc(0x30u);
  return sub_2DDC8(a1, v2);
}


// Address: 0x2DE00 | Function: sub_2DE00
__int64 __fastcall sub_2DE00(_DWORD *a1)
{
  __int64 *j; // x0
  __int64 i; // x19

  if ( a1 == nullptr || *a1 == 0 )
    return 0;
  if ( &pthread_create != nullptr )
    pthread_mutex_lock((pthread_mutex_t *)&unk_5E668);
  j = &qword_5E690;
  for ( i = qword_5E690; i != 0; i = *(_QWORD *)(i + 40) )
  {
    if ( *(_DWORD **)(i + 24) == a1 )
    {
LABEL_14:
      *j = *(_QWORD *)(i + 40);
      goto LABEL_21;
    }
    j = (__int64 *)(i + 40);
  }
  for ( j = &qword_5E698; ; j = (__int64 *)(i + 40) )
  {
    i = *j;
    if ( *j == 0 )
    {
      if ( &pthread_create == nullptr )
        goto LABEL_20;
      goto LABEL_19;
    }
    if ( (*(_BYTE *)(i + 32) & 1) != 0 )
      break;
    if ( *(_DWORD **)(i + 24) == a1 )
      goto LABEL_14;
LABEL_10:
    ;
  }
  if ( **(_DWORD ***)(i + 24) != a1 )
    goto LABEL_10;
  *j = *(_QWORD *)(i + 40);
  free(*(void **)(i + 24));
LABEL_21:
  if ( &pthread_create != nullptr )
  {
LABEL_19:
    pthread_mutex_unlock((pthread_mutex_t *)&unk_5E668);
    if ( i != 0 )
      return i;
LABEL_20:
    abort();
  }
  return i;
}


// Address: 0x2DF00 | Function: sub_2DF00
// attributes: thunk
__int64 __fastcall sub_2DF00(_DWORD *a1)
{
  return sub_2DE00(a1);
}


// Address: 0x2DF04 | Function: sub_2DF04
void __fastcall sub_2DF04(_DWORD *a1)
{
  void *v1; // x0

  if ( *a1 != 0 )
  {
    v1 = (void *)sub_2DF00(a1);
    free(v1);
  }
}


// Address: 0x2DF28 | Function: sub_2DF28
unsigned int *__fastcall sub_2DF28(unsigned __int64 a1, _QWORD *a2)
{
  __int64 i; // x19
  unsigned int *v5; // x20
  _QWORD *v6; // x1
  __int64 *v7; // x2
  char v8; // w1
  unsigned __int8 v9; // w0
  char v10; // w21
  char *v11; // x0
  unsigned __int64 v12; // x0
  unsigned __int64 data; // [xsp+50h] [xbp+50h] BYREF
  __int64 v15; // [xsp+58h] [xbp+58h]
  __int64 v16; // [xsp+60h] [xbp+60h]
  unsigned __int64 v17; // [xsp+68h] [xbp+68h]
  unsigned int *v18; // [xsp+70h] [xbp+70h]
  int v19; // [xsp+78h] [xbp+78h]

  if ( &pthread_create != nullptr )
    pthread_mutex_lock((pthread_mutex_t *)&unk_5E668);
  for ( i = qword_5E698; ; i = *(_QWORD *)(i + 40) )
  {
    if ( i == 0 )
      goto LABEL_9;
    if ( a1 >= *(_QWORD *)i )
      break;
  }
  v5 = sub_2D6DC(i, a1);
  if ( v5 != nullptr )
  {
LABEL_25:
    if ( &pthread_create == nullptr )
      goto LABEL_18;
  }
  else
  {
LABEL_9:
    while ( 1 )
    {
      i = qword_5E690;
      if ( qword_5E690 == 0 )
        break;
      qword_5E690 = *(_QWORD *)(qword_5E690 + 40);
      v5 = sub_2D6DC(i, a1);
      v6 = (_QWORD *)qword_5E698;
      v7 = &qword_5E698;
      while ( v6 != nullptr && *v6 >= *(_QWORD *)i )
      {
        v7 = v6 + 5;
        v6 = (_QWORD *)v6[5];
      }
      *(_QWORD *)(i + 40) = v6;
      *v7 = i;
      if ( v5 != nullptr )
        goto LABEL_25;
    }
    v5 = nullptr;
    if ( &pthread_create == nullptr )
      goto LABEL_21;
  }
  pthread_mutex_unlock((pthread_mutex_t *)&unk_5E668);
  if ( v5 != nullptr )
  {
LABEL_18:
    *a2 = *(_QWORD *)(i + 8);
    v8 = *(_BYTE *)(i + 32);
    a2[1] = *(_QWORD *)(i + 16);
    v9 = (unsigned __int64)*(unsigned __int16 *)(i + 32) >> 3;
    if ( (v8 & 4) != 0 )
      v9 = sub_2CF80((__int64)v5);
    v10 = v9;
    v11 = (char *)sub_2CAE4(v9, i);
    sub_2CBA4(v10, v11, (char *)v5 + 8, &data);
    v12 = data;
    goto LABEL_24;
  }
LABEL_21:
  v19 = 1;
  data = a1;
  v5 = nullptr;
  v15 = 0;
  v16 = 0;
  v17 = 0;
  v18 = nullptr;
  if ( (dl_iterate_phdr((int (*)(struct dl_phdr_info *, size_t, void *))sub_2CF90, &data) & 0x80000000) == 0 )
  {
    v5 = v18;
    if ( v18 != nullptr )
    {
      *a2 = v15;
      a2[1] = v16;
      v12 = v17;
LABEL_24:
      a2[2] = v12;
    }
  }
  return v5;
}


