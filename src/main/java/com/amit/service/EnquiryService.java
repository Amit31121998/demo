package com.amit.service;

import java.util.List;

import com.amit.binding.DashboardResponse;
import com.amit.binding.EnquiryForm;
import com.amit.binding.EnquirySearchCriteria;
import com.amit.entity.StudentEnqEntity;

public interface EnquiryService {
	
	public DashboardResponse getDashboardData(Integer userId);

	public List<String> getCourse();
	
	public List<String> getEnqStatus();

	public boolean saveEnquiry(EnquiryForm form);

	List<StudentEnqEntity> getEnquries();
	
	public List<StudentEnqEntity> getFilteredEnq(EnquirySearchCriteria criteria,Integer userId );

	public StudentEnqEntity getEnq(Integer id);
	
	public String updateEnq(Integer enqid,EnquiryForm formObj);


}