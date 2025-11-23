package cl.duoc.ms_auth.services.role;

import cl.duoc.ms_auth.infastructure.dtos.role.RoleCreateRequest;
import cl.duoc.ms_auth.infastructure.dtos.role.RoleResponse;
import cl.duoc.ms_auth.infastructure.dtos.role.RoleUpdateRequest;
import cl.duoc.ms_auth.services.CrudGeneric;

public interface IRoleService extends CrudGeneric<RoleCreateRequest, RoleUpdateRequest, RoleResponse,Long> {
}
