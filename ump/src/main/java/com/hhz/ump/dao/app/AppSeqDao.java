package com.hhz.ump.dao.app;

import org.springframework.stereotype.Repository;
import org.springside.modules.orm.hibernate.HibernateDao;

import com.hhz.ump.entity.app.AppSeq;

@Repository
public class AppSeqDao extends HibernateDao<AppSeq, String> {

}

