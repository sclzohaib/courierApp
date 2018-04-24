package org.burkitech.courierApp.dao;

import org.burkitech.courierApp.dto.Detail;
import org.burkitech.courierApp.dto.Master;

public interface MasterDAO {
boolean add(Master master);
boolean addDetail(Detail detail);
}
