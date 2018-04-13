package org.burkitech.courierApp.dao;

import org.burkitech.courierApp.dto.Manifest;
import org.burkitech.courierApp.dto.ManifestDetail;

public interface ManifestDAO {

	boolean add(Manifest manifest);
	boolean addDetail(ManifestDetail manifestDetail);
}
