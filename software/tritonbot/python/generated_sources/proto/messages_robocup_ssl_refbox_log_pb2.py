# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: messages_robocup_ssl_refbox_log.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import messages_robocup_ssl_detection_pb2 as messages__robocup__ssl__detection__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='messages_robocup_ssl_refbox_log.proto',
  package='proto.vision',
  syntax='proto2',
  serialized_options=None,
  serialized_pb=_b('\n%messages_robocup_ssl_refbox_log.proto\x12\x0cproto.vision\x1a$messages_robocup_ssl_detection.proto\"P\n\tLog_Frame\x12/\n\x05\x66rame\x18\x01 \x02(\x0b\x32 .proto.vision.SSL_DetectionFrame\x12\x12\n\nrefbox_cmd\x18\x02 \x02(\t\"2\n\nRefbox_Log\x12$\n\x03log\x18\x01 \x03(\x0b\x32\x17.proto.vision.Log_Frame')
  ,
  dependencies=[messages__robocup__ssl__detection__pb2.DESCRIPTOR,])




_LOG_FRAME = _descriptor.Descriptor(
  name='Log_Frame',
  full_name='proto.vision.Log_Frame',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='frame', full_name='proto.vision.Log_Frame.frame', index=0,
      number=1, type=11, cpp_type=10, label=2,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='refbox_cmd', full_name='proto.vision.Log_Frame.refbox_cmd', index=1,
      number=2, type=9, cpp_type=9, label=2,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto2',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=93,
  serialized_end=173,
)


_REFBOX_LOG = _descriptor.Descriptor(
  name='Refbox_Log',
  full_name='proto.vision.Refbox_Log',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='log', full_name='proto.vision.Refbox_Log.log', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto2',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=175,
  serialized_end=225,
)

_LOG_FRAME.fields_by_name['frame'].message_type = messages__robocup__ssl__detection__pb2._SSL_DETECTIONFRAME
_REFBOX_LOG.fields_by_name['log'].message_type = _LOG_FRAME
DESCRIPTOR.message_types_by_name['Log_Frame'] = _LOG_FRAME
DESCRIPTOR.message_types_by_name['Refbox_Log'] = _REFBOX_LOG
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Log_Frame = _reflection.GeneratedProtocolMessageType('Log_Frame', (_message.Message,), dict(
  DESCRIPTOR = _LOG_FRAME,
  __module__ = 'messages_robocup_ssl_refbox_log_pb2'
  # @@protoc_insertion_point(class_scope:proto.vision.Log_Frame)
  ))
_sym_db.RegisterMessage(Log_Frame)

Refbox_Log = _reflection.GeneratedProtocolMessageType('Refbox_Log', (_message.Message,), dict(
  DESCRIPTOR = _REFBOX_LOG,
  __module__ = 'messages_robocup_ssl_refbox_log_pb2'
  # @@protoc_insertion_point(class_scope:proto.vision.Refbox_Log)
  ))
_sym_db.RegisterMessage(Refbox_Log)


# @@protoc_insertion_point(module_scope)
