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



public class HcSupplierInquiryProductSelectParamterProvider {//findselectByParamsSql
	private  String  selectSQL="";
	private  String  resultMapID="BaseResultMapHcSupplierInquiryProductManagementMapper";
	 @SuppressWarnings({ "unchecked" })
	public  String  findSelecttByParamsSql(Map<String,Object> params){//where  1=1  order by rg_date desc
		     String  selectParamtercondition=" where  1=1 ";
		     String  subSortOrderByColumn="";
		     String  column="";
	         List<ResultMapping> mapping=null;         
	      //   WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext(); 
	         try {
	             ResultMap mpa=((SqlSessionFactory) (ContextLoader.getCurrentWebApplicationContext()).getBean("sqlSessionFactory")).getConfiguration()
	  			       .getResultMap(resultMapID);
	
	             mapping=mpa.getResultMappings();
	
		 		for (ResultMapping mp : mapping) {
		 			if(mp.getColumn().trim().equals(mp.getProperty().trim())&&
		 					(mp.getColumn().trim().indexOf("_")!=-1)&&
		 					    (mp.getProperty().trim().indexOf("_")!=-1)){
		 				if(mp.getProperty().trim().indexOf("$")!=-1){
		 					String  colomnCombination="";
		 					String[]  strSplit=mp.getColumn().trim().substring(0, mp.getColumn().trim().length()-1).split("_"); 
		 					for (ResultMapping mp_ : mapping) {
		 						if(mp_.getProperty().trim().equals(strSplit[0])){
		 							colomnCombination+=mp_.getColumn().trim()+"*";
		 						}else if(mp_.getProperty().trim().equals(strSplit[1])){
		 							colomnCombination+=mp_.getColumn().trim()+"*";
		 						}
		 					}
		 					column+=colomnCombination.substring(0,colomnCombination.length()-1)+"  as  "+mp.getColumn().trim()+",";
		 				}else{
		 					String  colomnCombination="";
		 					String[]  strSplit=mp.getColumn().trim().substring(0, mp.getColumn().trim().length()).split("_");
		 					for (ResultMapping mp_ : mapping) {
		 						if(mp_.getProperty().trim().equals(strSplit[0])){
		 							colomnCombination+="CONVERT(varchar(100),CONVERT(int,"+mp_.getColumn().trim()+"))"+"+";
		 						}else if(mp_.getProperty().trim().equals(strSplit[1])){
		 							colomnCombination+=mp_.getColumn().trim()+"+";
		 						}
		 					}
		 					column+=colomnCombination.substring(0,colomnCombination.length()-1)+"  as  "+mp.getColumn().trim()+",";
		 				}
		 				
		 			}else{
		 				column+=mp.getColumn().toString()+",";
		 			}
		 			if(mp.getProperty().toString().equals(Class.forName(mpa.getId().toString().substring(0,mpa.getId().toString()
								.lastIndexOf("."))).getField("subSortOrderByColumn").get(null).toString())){
		 				subSortOrderByColumn=mp.getColumn().toString();
		 			}
				}
		 	 	Iterator<String> keys = params.keySet().iterator();
				while(keys.hasNext()){
					String key = (String)keys.next();
					
					if("params".equals(key)){
						Iterator<String> keys_ = ((Map<String, Object>)params.get("params")).keySet().iterator();
						while(keys_.hasNext()){
							String key_ = (String)keys_.next();
							for (ResultMapping mp : mapping) {
								if(mp.getProperty().toString().trim().equals(key_.trim())){
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
						.lastIndexOf("."))).getField("subDatabaseName").get(null).toString()
						+selectParamtercondition+" order by "+subSortOrderByColumn+" desc ";
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
