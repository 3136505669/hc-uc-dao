package com.hc.scm.uc.dao.purchasing.provider;

import java.util.Iterator;
import java.util.Map;


import org.apache.ibatis.jdbc.SQL;



public class HcSupplierSelectParamterProvider {//findselectByParamsSql
	 @SuppressWarnings({ "unchecked" })
	public String  findSelecttByParamsSql(Map<String,Object> params){//where  1=1  order by rg_date desc
		     String  str=" where  1=1 ";
		     String  whereSql="";
		 	try{
		    	Iterator<String> keys = params.keySet().iterator();
				while(keys.hasNext()){
					String key = (String)keys.next();
					
					if("params".equals(key)){
						Iterator<String> keys_ = ((Map<String, Object>)params.get("params")).keySet().iterator();
						while(keys_.hasNext()){
							String key_ = (String)keys_.next();
							
							System.out.println(key_);
							if("companyNo".equals(key_)){
								if(((Map<String, Object>)params.get("params")).get("companyNo")!=null&&!"".equals(((Map<String, Object>)params.get("params")).get("companyNo"))){
									str+="and co_number like '%"+((Map<String, Object>)params.get("params")).get("companyNo")+"%'";
						    	}
							}else if("companyName".equals(key_)){
								if(((Map<String, Object>)params.get("params")).get("companyName")!=null&&!"".equals(((Map<String, Object>)params.get("params")).get("companyName"))){
									str+="and coname like '%"+((Map<String, Object>)params.get("params")).get("companyName")+"%'";
						    	}
							}
							
						}
					}	
				}
				whereSql="[co_number],[coname],[coaddr],[copost],[city],[country],[province],[cofrdb],[cozzxs],[cozczb]"
				 		+ ",[coyyzz],[cotypes],[tradetypes],[cokhjb],[cokhyh],[coyhzh],[coclrq],[ifjckq],[cotel],[cofax]"
				 		+ ",[codzyj],[conet],[cosyhb],[cojsfs],[nshm],[number],[username],[dept],[deptjb],[modman]"
				 		+ ",[mod_date],[share],[yearearning],[valueco],[rg_date],[annual_sales],[sales_ability]"
				 		+ ",[qlty_control],[companymt],[scale],[warehouse],[describee] ,(CASE WHEN province=city THEN city ELSE province+city END) as provincesandcities  from  supplier "+str+" order by rg_date desc ";
				
				
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
		     final  String whereSql_=whereSql;
	    	 return  new  SQL(){
	    		 {
	    			 SELECT(whereSql_);
	    		 }
	    	 }.toString();
     }
}
