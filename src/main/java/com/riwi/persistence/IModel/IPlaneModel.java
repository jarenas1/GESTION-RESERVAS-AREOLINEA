package com.riwi.persistence.IModel;

import com.riwi.entitie.PlaneEntity;
import com.riwi.persistence.CRUD.*;

public interface IPlaneModel extends Create<PlaneEntity>, Read<String, PlaneEntity>, ReadAll<PlaneEntity>, Update<PlaneEntity>, Delete<Integer> {
}
