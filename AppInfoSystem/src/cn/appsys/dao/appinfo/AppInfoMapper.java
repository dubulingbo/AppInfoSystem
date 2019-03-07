package cn.appsys.dao.appinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.AppInfo;

public interface AppInfoMapper {
	
	/**
	 * 获取app信息列表
	 * @param querySoftwareName
	 * @param queryStatus
	 * @param queryCategoryLevel1
	 * @param queryCategoryLevel2
	 * @param queryCategoryLevel3
	 * @param queryFlatformId
	 * @param devId
	 * @param currentPageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 */
	public List<AppInfo> getAppInfoList(@Param(value="softwareName")String querySoftwareName,
			@Param(value="status")Integer queryStatus,
			@Param(value="categoryLevel1")Integer queryCategoryLevel1,
			@Param(value="categoryLevel2")Integer queryCategoryLevel2,
			@Param(value="categoryLevel3")Integer queryCategoryLevel3,
			@Param(value="flatformId")Integer queryFlatformId,
			@Param(value="devId")Integer devId,
			@Param(value="from")Integer currentPageNo,
			@Param(value="pageSize")Integer pageSize)throws Exception;
	
	/**
	 * 获取app信息表的记录数
	 * @param querySoftwareName
	 * @param queryStatus
	 * @param queryCategoryLevel1
	 * @param queryCategoryLevel2
	 * @param queryCategoryLevel3
	 * @param queryFlatformId
	 * @param devId
	 * @return
	 * @throws Exception
	 */
	public int getAppInfoCount(@Param(value="softwareName")String querySoftwareName,
	   @Param(value="status")Integer queryStatus,
	   @Param(value="categoryLevel1")Integer queryCategoryLevel1,
	   @Param(value="categoryLevel2")Integer queryCategoryLevel2,
	   @Param(value="categoryLevel3")Integer queryCategoryLevel3,
	   @Param(value="flatformId")Integer queryFlatformId,
	   @Param(value="devId")Integer devId)throws Exception;
	
	/**
	 * 通过id和app名称获取app信息
	 * @param id
	 * @param APKName
	 * @return
	 * @throws Exception
	 */
	public AppInfo getAppInfo(@Param(value="id")Integer id,
							  @Param(value="APKName")String APKName)throws Exception;
	
	/**
	 * 添加app信息
	 * @param appInfo
	 * @return
	 * @throws Exception
	 */
	public int add(AppInfo appInfo) throws Exception;
	
	
}
