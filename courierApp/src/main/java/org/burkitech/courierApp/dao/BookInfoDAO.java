package org.burkitech.courierApp.dao;

import org.burkitech.courierApp.dto.BookDetail;
import org.burkitech.courierApp.dto.BookInfo;

public interface BookInfoDAO {

	boolean add(BookInfo bookInfo);
	boolean addDetail(BookDetail bookDetail);
}
