package com.hc.scm.uc.dao.purchasing.provider;

import java.util.Iterator;
import java.util.List;
import java.util.Map;


import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.mapping.ResultMap;
import org.apache.ibatis.mapping.ResultMapping;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.web.context.ContextLoader;

import com.alibaba.fastjson.JSONObject;



public class HcSupplierInquirySelectParamterProvider {//findselectByParamsSql
	private  String  selectSQL="";
	private  String  resultMapID="BaseResultMapHcSupplierInquiryManagementMapper";
	 @SuppressWarnings({ "unchecked" })
	public  String  findSelecttByParamsSql(Map<String,Object> params){//where  1=1  order by rg_date desc
		     String  selectParamtercondition=" where  1=1 ";
		     String  sortOrderByColumn="";
		     String  column="";
	         List<ResultMapping> mapping=null;         
	      //   WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext(); 
	         try {
	             ResultMap mpa=((SqlSessionFactory) (ContextLoader.getCurrentWebApplicationContext()).getBean("sqlSessionFactory")).getConfiguration()
	  			       .getResultMap(resultMapID);
	
	             mapping=mpa.getResultMappings();
	            
		 		for (ResultMapping mp : mapping) {
		 			column+=mp.getColumn().toString()+",";
		 			if(mp.getProperty().toString().equals(Class.forName(mpa.getId().toString().substring(0,mpa.getId().toString()
								.lastIndexOf("."))).getField("sortOrderByColumn").get(null).toString())){
		 				sortOrderByColumn=mp.getColumn().toString();
		 			}
				}
		 	 	Iterator<String> keys = params.keySet().iterator();
				while(keys.hasNext()){
					String key = (String)keys.next();
					
					if("params".equals(key)){
						System.out.println(((Map<String, Object>)params.get("params")));
						Iterator<String> keys_ = ((Map<String, Object>)params.get("params")).keySet().iterator();
						while(keys_.hasNext()){
							String key_ = (String)keys_.next();
							for (ResultMapping mp : mapping) {
								if(mp.getProperty().toString().equals(key_)){
									System.out.println(((Map<String, Object>)params.get("params")).get(mp.getProperty().toString()));
									if(((Map<String, Object>)params.get("params")).get(mp.getProperty().toString())!=null&&
											!"".equals(((Map<String, Object>)params.get("params")).get(mp.getProperty().toString()))){
										selectParamtercondition+="and "+mp.getColumn().toString()+" like '%"+((Map<String, Object>)params.get("params"))
												.get(mp.getProperty().toString())+"%'";
							    	}
									break;
								}
							}	
						}
					}	
				}
				
				
				selectSQL=column.substring(0,column.length()-1)+"  FROM  "+Class.forName(mpa.getId().toString().substring(0,mpa.getId().toString()
						.lastIndexOf("."))).getField("databaseName").get(null).toString()
						+selectParamtercondition+" order by "+sortOrderByColumn+" desc ";

            } catch (Exception e) {
				e.printStackTrace();
		   }  
			 
	    	 return  new  SQL(){
	    		 {
	    			 SELECT(selectSQL);

	    		 }
	    	 }.toString();
     }
}
