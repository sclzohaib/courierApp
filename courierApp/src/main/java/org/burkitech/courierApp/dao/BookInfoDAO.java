package org.burkitech.courierApp.dao;

import org.burkitech.courierApp.dto.BookDetail;
import org.burkitech.courierApp.dto.BookInfo;
import org.burkitech.courierApp.dto.NewBookInfo;

public interface BookInfoDAO {

//	boolean add(BookInfo bookInfo);
	boolean add(NewBookInfo bookInfo);
//	boolean addDetail(BookDetail bookDetail);
}
