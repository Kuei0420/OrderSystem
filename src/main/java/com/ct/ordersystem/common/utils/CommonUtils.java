package com.ct.ordersystem.common.utils;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

public class CommonUtils {

	
	/**
	  * Copies properties from one object to another
	  * @param source
	  * @destination
	  * @return
	  */
	  public void copyNonNullProperties(Object source, Object destination){
	     BeanUtils.copyProperties(source, destination,
	     getNullPropertyNames(source));
	  }
	  
	  public void copyNonExistProperties(Object source, Object destination){
		     BeanUtils.copyProperties(source, destination,
		     getExistPropertyNames(destination));
		  }
	/**
	  * Returns an array of null properties of an object
	  * @param source
	  * @return
	  */
	  private String[] getNullPropertyNames (Object source) {
	     final BeanWrapper src = new BeanWrapperImpl(source);
	     java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();
	     Set emptyNames = new HashSet();
	     for(java.beans.PropertyDescriptor pd : pds) {
	       //check if value of this property is null then add it to the collection
	       Object srcValue = src.getPropertyValue(pd.getName());
	       if (srcValue == null) emptyNames.add(pd.getName());
	     }
	     String[] result = new String[emptyNames.size()];
	     return (String[]) emptyNames.toArray(result);
	  }
	  
	  private String[] getExistPropertyNames (Object destination) {
		  final BeanWrapper src = new BeanWrapperImpl(destination);
		     java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();
		     Set emptyNames = new HashSet();
		     for(java.beans.PropertyDescriptor pd : pds) {
		       //check if value of this property is null then add it to the collection
		       Object srcValue = src.getPropertyValue(pd.getName());
		       if (srcValue != null) emptyNames.add(pd.getName());
		     }
		     String[] result = new String[emptyNames.size()];
		     return (String[]) emptyNames.toArray(result);
	  }
	  
	  
}
