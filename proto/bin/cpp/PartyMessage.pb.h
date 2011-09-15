// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PartyMessage.proto

#ifndef PROTOBUF_PartyMessage_2eproto__INCLUDED
#define PROTOBUF_PartyMessage_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 2003000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 2003000 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/repeated_field.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/generated_message_reflection.h>
#include "OnlineService.pb.h"
// @@protoc_insertion_point(includes)

namespace D3 {
namespace PartyMessage {

// Internal implementation detail -- do not call these.
void  protobuf_AddDesc_PartyMessage_2eproto();
void protobuf_AssignDesc_PartyMessage_2eproto();
void protobuf_ShutdownFile_PartyMessage_2eproto();

class ScreenStatus;
class SearchForPublicGameParams;

// ===================================================================

class ScreenStatus : public ::google::protobuf::Message {
 public:
  ScreenStatus();
  virtual ~ScreenStatus();
  
  ScreenStatus(const ScreenStatus& from);
  
  inline ScreenStatus& operator=(const ScreenStatus& from) {
    CopyFrom(from);
    return *this;
  }
  
  inline const ::google::protobuf::UnknownFieldSet& unknown_fields() const {
    return _unknown_fields_;
  }
  
  inline ::google::protobuf::UnknownFieldSet* mutable_unknown_fields() {
    return &_unknown_fields_;
  }
  
  static const ::google::protobuf::Descriptor* descriptor();
  static const ScreenStatus& default_instance();
  
  void Swap(ScreenStatus* other);
  
  // implements Message ----------------------------------------------
  
  ScreenStatus* New() const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const ScreenStatus& from);
  void MergeFrom(const ScreenStatus& from);
  void Clear();
  bool IsInitialized() const;
  
  int ByteSize() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const;
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  public:
  
  ::google::protobuf::Metadata GetMetadata() const;
  
  // nested types ----------------------------------------------------
  
  // accessors -------------------------------------------------------
  
  // required int32 screen = 1;
  inline bool has_screen() const;
  inline void clear_screen();
  static const int kScreenFieldNumber = 1;
  inline ::google::protobuf::int32 screen() const;
  inline void set_screen(::google::protobuf::int32 value);
  
  // required int32 status = 2;
  inline bool has_status() const;
  inline void clear_status();
  static const int kStatusFieldNumber = 2;
  inline ::google::protobuf::int32 status() const;
  inline void set_status(::google::protobuf::int32 value);
  
  // @@protoc_insertion_point(class_scope:D3.PartyMessage.ScreenStatus)
 private:
  ::google::protobuf::UnknownFieldSet _unknown_fields_;
  mutable int _cached_size_;
  
  ::google::protobuf::int32 screen_;
  ::google::protobuf::int32 status_;
  friend void  protobuf_AddDesc_PartyMessage_2eproto();
  friend void protobuf_AssignDesc_PartyMessage_2eproto();
  friend void protobuf_ShutdownFile_PartyMessage_2eproto();
  
  ::google::protobuf::uint32 _has_bits_[(2 + 31) / 32];
  
  // WHY DOES & HAVE LOWER PRECEDENCE THAN != !?
  inline bool _has_bit(int index) const {
    return (_has_bits_[index / 32] & (1u << (index % 32))) != 0;
  }
  inline void _set_bit(int index) {
    _has_bits_[index / 32] |= (1u << (index % 32));
  }
  inline void _clear_bit(int index) {
    _has_bits_[index / 32] &= ~(1u << (index % 32));
  }
  
  void InitAsDefaultInstance();
  static ScreenStatus* default_instance_;
};
// -------------------------------------------------------------------

class SearchForPublicGameParams : public ::google::protobuf::Message {
 public:
  SearchForPublicGameParams();
  virtual ~SearchForPublicGameParams();
  
  SearchForPublicGameParams(const SearchForPublicGameParams& from);
  
  inline SearchForPublicGameParams& operator=(const SearchForPublicGameParams& from) {
    CopyFrom(from);
    return *this;
  }
  
  inline const ::google::protobuf::UnknownFieldSet& unknown_fields() const {
    return _unknown_fields_;
  }
  
  inline ::google::protobuf::UnknownFieldSet* mutable_unknown_fields() {
    return &_unknown_fields_;
  }
  
  static const ::google::protobuf::Descriptor* descriptor();
  static const SearchForPublicGameParams& default_instance();
  
  void Swap(SearchForPublicGameParams* other);
  
  // implements Message ----------------------------------------------
  
  SearchForPublicGameParams* New() const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const SearchForPublicGameParams& from);
  void MergeFrom(const SearchForPublicGameParams& from);
  void Clear();
  bool IsInitialized() const;
  
  int ByteSize() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const;
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  public:
  
  ::google::protobuf::Metadata GetMetadata() const;
  
  // nested types ----------------------------------------------------
  
  // accessors -------------------------------------------------------
  
  // optional sint64 start_time = 1;
  inline bool has_start_time() const;
  inline void clear_start_time();
  static const int kStartTimeFieldNumber = 1;
  inline ::google::protobuf::int64 start_time() const;
  inline void set_start_time(::google::protobuf::int64 value);
  
  // optional uint32 seconds_to_search = 2;
  inline bool has_seconds_to_search() const;
  inline void clear_seconds_to_search();
  static const int kSecondsToSearchFieldNumber = 2;
  inline ::google::protobuf::uint32 seconds_to_search() const;
  inline void set_seconds_to_search(::google::protobuf::uint32 value);
  
  // optional .D3.OnlineService.GameCreateParams game_params = 3;
  inline bool has_game_params() const;
  inline void clear_game_params();
  static const int kGameParamsFieldNumber = 3;
  inline const ::D3::OnlineService::GameCreateParams& game_params() const;
  inline ::D3::OnlineService::GameCreateParams* mutable_game_params();
  
  // optional int32 remove_reason = 4;
  inline bool has_remove_reason() const;
  inline void clear_remove_reason();
  static const int kRemoveReasonFieldNumber = 4;
  inline ::google::protobuf::int32 remove_reason() const;
  inline void set_remove_reason(::google::protobuf::int32 value);
  
  // @@protoc_insertion_point(class_scope:D3.PartyMessage.SearchForPublicGameParams)
 private:
  ::google::protobuf::UnknownFieldSet _unknown_fields_;
  mutable int _cached_size_;
  
  ::google::protobuf::int64 start_time_;
  ::google::protobuf::uint32 seconds_to_search_;
  ::D3::OnlineService::GameCreateParams* game_params_;
  ::google::protobuf::int32 remove_reason_;
  friend void  protobuf_AddDesc_PartyMessage_2eproto();
  friend void protobuf_AssignDesc_PartyMessage_2eproto();
  friend void protobuf_ShutdownFile_PartyMessage_2eproto();
  
  ::google::protobuf::uint32 _has_bits_[(4 + 31) / 32];
  
  // WHY DOES & HAVE LOWER PRECEDENCE THAN != !?
  inline bool _has_bit(int index) const {
    return (_has_bits_[index / 32] & (1u << (index % 32))) != 0;
  }
  inline void _set_bit(int index) {
    _has_bits_[index / 32] |= (1u << (index % 32));
  }
  inline void _clear_bit(int index) {
    _has_bits_[index / 32] &= ~(1u << (index % 32));
  }
  
  void InitAsDefaultInstance();
  static SearchForPublicGameParams* default_instance_;
};
// ===================================================================


// ===================================================================

// ScreenStatus

// required int32 screen = 1;
inline bool ScreenStatus::has_screen() const {
  return _has_bit(0);
}
inline void ScreenStatus::clear_screen() {
  screen_ = 0;
  _clear_bit(0);
}
inline ::google::protobuf::int32 ScreenStatus::screen() const {
  return screen_;
}
inline void ScreenStatus::set_screen(::google::protobuf::int32 value) {
  _set_bit(0);
  screen_ = value;
}

// required int32 status = 2;
inline bool ScreenStatus::has_status() const {
  return _has_bit(1);
}
inline void ScreenStatus::clear_status() {
  status_ = 0;
  _clear_bit(1);
}
inline ::google::protobuf::int32 ScreenStatus::status() const {
  return status_;
}
inline void ScreenStatus::set_status(::google::protobuf::int32 value) {
  _set_bit(1);
  status_ = value;
}

// -------------------------------------------------------------------

// SearchForPublicGameParams

// optional sint64 start_time = 1;
inline bool SearchForPublicGameParams::has_start_time() const {
  return _has_bit(0);
}
inline void SearchForPublicGameParams::clear_start_time() {
  start_time_ = GOOGLE_LONGLONG(0);
  _clear_bit(0);
}
inline ::google::protobuf::int64 SearchForPublicGameParams::start_time() const {
  return start_time_;
}
inline void SearchForPublicGameParams::set_start_time(::google::protobuf::int64 value) {
  _set_bit(0);
  start_time_ = value;
}

// optional uint32 seconds_to_search = 2;
inline bool SearchForPublicGameParams::has_seconds_to_search() const {
  return _has_bit(1);
}
inline void SearchForPublicGameParams::clear_seconds_to_search() {
  seconds_to_search_ = 0u;
  _clear_bit(1);
}
inline ::google::protobuf::uint32 SearchForPublicGameParams::seconds_to_search() const {
  return seconds_to_search_;
}
inline void SearchForPublicGameParams::set_seconds_to_search(::google::protobuf::uint32 value) {
  _set_bit(1);
  seconds_to_search_ = value;
}

// optional .D3.OnlineService.GameCreateParams game_params = 3;
inline bool SearchForPublicGameParams::has_game_params() const {
  return _has_bit(2);
}
inline void SearchForPublicGameParams::clear_game_params() {
  if (game_params_ != NULL) game_params_->::D3::OnlineService::GameCreateParams::Clear();
  _clear_bit(2);
}
inline const ::D3::OnlineService::GameCreateParams& SearchForPublicGameParams::game_params() const {
  return game_params_ != NULL ? *game_params_ : *default_instance_->game_params_;
}
inline ::D3::OnlineService::GameCreateParams* SearchForPublicGameParams::mutable_game_params() {
  _set_bit(2);
  if (game_params_ == NULL) game_params_ = new ::D3::OnlineService::GameCreateParams;
  return game_params_;
}

// optional int32 remove_reason = 4;
inline bool SearchForPublicGameParams::has_remove_reason() const {
  return _has_bit(3);
}
inline void SearchForPublicGameParams::clear_remove_reason() {
  remove_reason_ = 0;
  _clear_bit(3);
}
inline ::google::protobuf::int32 SearchForPublicGameParams::remove_reason() const {
  return remove_reason_;
}
inline void SearchForPublicGameParams::set_remove_reason(::google::protobuf::int32 value) {
  _set_bit(3);
  remove_reason_ = value;
}


// @@protoc_insertion_point(namespace_scope)

}  // namespace PartyMessage
}  // namespace D3

#ifndef SWIG
namespace google {
namespace protobuf {


}  // namespace google
}  // namespace protobuf
#endif  // SWIG

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_PartyMessage_2eproto__INCLUDED
