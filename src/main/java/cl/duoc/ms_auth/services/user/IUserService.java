package cl.duoc.ms_auth.services.user;

import cl.duoc.ms_auth.infastructure.dtos.user.UserCreateRequest;
import cl.duoc.ms_auth.infastructure.dtos.user.UserResponse;
import cl.duoc.ms_auth.infastructure.dtos.user.UserUpdateRequest;
import cl.duoc.ms_auth.services.CrudGeneric;

public interface IUserService extends CrudGeneric<UserCreateRequest, UserUpdateRequest, UserResponse,Long> {
}
