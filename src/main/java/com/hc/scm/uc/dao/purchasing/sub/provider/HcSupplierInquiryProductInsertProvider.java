package com.hc.scm.uc.dao.purchasing.sub.provider;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

public class HcSupplierInquiryProductInsertProvider {
	
	 private  String  resultMapID="BaseResultMapHcSupplierInquiryProductManagementMapper";
	 
     public <ModelType> String  insertSql(final ModelType record){ 
    	 
    	 
    	 return  new  SQL(){
    		 { 
    			 Class<? extends  Object>  clazz = (record).getClass(); 
    	         Field[] fields =clazz.getDeclaredFields();
    	         
    	         List<ResultMapping> mapping=null;
    	         try {
    	         ResultMap mpa=((SqlSessionFactory) (ContextLoader.getCurrentWebApplicationContext()).getBean("sqlSessionFactory")).getConfiguration()
  	  			       .getResultMap(resultMapID);
  	
  	             mapping=mpa.getResultMappings();
  	             
    	 		 INSERT_INTO(Class.forName(mpa.getId().toString().substring(0,mpa.getId().toString()
  						.lastIndexOf("."))).getField("databaseName").get(null).toString());
    			 for (Field field : fields) {  
    	             PropertyDescriptor pd;
    				
    					for (ResultMapping mp : mapping) {
        		                 if(mp.getProperty().toString().trim().equals(field.getName())){
        		                	 pd = new PropertyDescriptor(field.getName(),clazz);
        		                	 Method getMethod = pd.getReadMethod();
        		                	 if(getMethod.invoke(record)!=null&&!"".equals(getMethod.invoke(record))){
        		                		 VALUES(mp.getColumn().toString().trim(), "#{"+field.getName().toString().trim()+"}");
        		                	 }
        		                 }
        				}
    					
    				    
    				 
    	         
    	         }
    	         } catch (Exception e) {
 					e.printStackTrace();
 				} 
    		 }
    	 }.toString();
     }

	
}



