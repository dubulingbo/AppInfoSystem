package cn.appsys.service.developer;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.devuser.DevUserMapper;
import cn.appsys.pojo.DevUser;
@Service
public class DevUserServiceImpl implements DevUserService{
	@Resource
	private DevUserMapper mapper;

	@Override
	public DevUser login(String devCode, String password) {
		DevUser devUser = mapper.getLoginUser(devCode);
		if(null != devUser && devUser.getDevPassword().equals(password)){
			return devUser;
		}
		return null;
	}
	
}
