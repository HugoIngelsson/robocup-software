# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ssl_simulation_error.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='ssl_simulation_error.proto',
  package='proto.simulation',
  syntax='proto2',
  serialized_options=_b('Z6github.com/RoboCup-SSL/ssl-simulation-protocol/pkg/sim'),
  serialized_pb=_b('\n\x1assl_simulation_error.proto\x12\x10proto.simulation\"/\n\x0eSimulatorError\x12\x0c\n\x04\x63ode\x18\x01 \x01(\t\x12\x0f\n\x07message\x18\x02 \x01(\tB8Z6github.com/RoboCup-SSL/ssl-simulation-protocol/pkg/sim')
)




_SIMULATORERROR = _descriptor.Descriptor(
  name='SimulatorError',
  full_name='proto.simulation.SimulatorError',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='proto.simulation.SimulatorError.code', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='message', full_name='proto.simulation.SimulatorError.message', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_start=48,
  serialized_end=95,
)

DESCRIPTOR.message_types_by_name['SimulatorError'] = _SIMULATORERROR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SimulatorError = _reflection.GeneratedProtocolMessageType('SimulatorError', (_message.Message,), dict(
  DESCRIPTOR = _SIMULATORERROR,
  __module__ = 'ssl_simulation_error_pb2'
  # @@protoc_insertion_point(class_scope:proto.simulation.SimulatorError)
  ))
_sym_db.RegisterMessage(SimulatorError)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
