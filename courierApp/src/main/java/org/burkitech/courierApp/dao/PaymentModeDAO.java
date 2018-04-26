package org.burkitech.courierApp.dao;

import java.util.List;

import org.burkitech.courierApp.dto.PaymentMode;
import org.burkitech.courierApp.dto.Service;

public interface PaymentModeDAO {

	boolean add(PaymentMode paymentMode);

	List<PaymentMode> paymentModeList();
}
