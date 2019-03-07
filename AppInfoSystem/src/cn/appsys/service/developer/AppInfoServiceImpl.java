package cn.appsys.service.developer;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.appinfo.AppInfoMapper;
import cn.appsys.pojo.AppInfo;

@Service
public class AppInfoServiceImpl implements AppInfoService{
	
	@Resource
	private AppInfoMapper mapper;
	
	@Override
	public List<AppInfo> getAppInfoList(String querySoftwareName, Integer queryStatus, 
			Integer queryCategoryLevel1, Integer queryCategoryLevel2, 
			Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId,
			Integer currentPageNo, Integer pageSize) throws Exception {
		
		return mapper.getAppInfoList(querySoftwareName, queryStatus, queryCategoryLevel1, 
				queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, 
				devId, currentPageNo, pageSize);
	}

	@Override
	public int getAppInfoCount(String querySoftwareName, Integer queryStatus, 
			Integer queryCategoryLevel1, Integer queryCategoryLevel2, 
			Integer queryCategoryLevel3, Integer queryFlatformId, Integer devId)
			throws Exception {
		
		return mapper.getAppInfoCount(querySoftwareName, queryStatus, queryCategoryLevel1, 
				queryCategoryLevel2, queryCategoryLevel3, queryFlatformId, devId);
	}

	@Override
	public AppInfo getAppInfo(Integer id, String APKName) throws Exception {
		return mapper.getAppInfo(id, APKName);
	}

	@Override
	public boolean add(AppInfo appInfo) {
		boolean flag = false;
		try {
			if(mapper.add(appInfo)>0){
				flag = true;
			}else{
				flag = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

}
