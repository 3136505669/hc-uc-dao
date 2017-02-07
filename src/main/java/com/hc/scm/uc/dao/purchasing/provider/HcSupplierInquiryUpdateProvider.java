package com.hc.scm.uc.dao.purchasing.provider;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.context.ContextLoader;

public class HcSupplierInquiryUpdateProvider {
	 private  String  resultMapID="BaseResultMapHcSupplierInquiryManagementMapper";
     public <ModelType> String  updateSql(final ModelType record){ 
    	 
	   
    	 return  new  SQL(){
    		 { 
    			 Class<? extends  Object>  clazz = (record).getClass(); 
    	         Field[] fields =clazz.getDeclaredFields();
    	         
    	         List<ResultMapping> mapping=null;

    	         try {

    	 		 ResultMap mpa=((SqlSessionFactory) (ContextLoader.getCurrentWebApplicationContext()).getBean("sqlSessionFactory")).getConfiguration()
 	  			       .getResultMap(resultMapID);
 	
 	             mapping=mpa.getResultMappings();
    			 UPDATE(Class.forName(mpa.getId().toString().substring(0,mpa.getId().toString()
 						.lastIndexOf("."))).getField("databaseName").get(null).toString());
    			 for (Field field : fields) {  
    	             PropertyDescriptor pd;
    				
    					for (ResultMapping mp : mapping) {
        		                 if(mp.getProperty().toString().trim().equals(field.getName())){
        		                	 pd = new PropertyDescriptor(field.getName(),clazz);
        		                	 Method getMethod = pd.getReadMethod();
        		                	 if(getMethod.invoke(record)!=null&&!"".equals(getMethod.invoke(record))){
        		                		 SET(mp.getColumn().toString().trim()+"=#{"+field.getName().toString().trim()+"}"); 
        		                	 }
                                     if(mp.getProperty().toString().trim().equals(Class.forName(mpa.getId().toString().substring(0,mpa.getId().toString()
                     						.lastIndexOf("."))).getField("updateWhere").get(null).toString())){
                                    	 WHERE(mp.getColumn().toString().trim()+"=#{"+mp.getProperty().toString().trim()+"}"); 
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



