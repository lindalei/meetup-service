package com.sap.grc.dpg.demo.service;

import static com.sap.grc.dpg.demo.util.ConvertUtils.convertToUserEntity;

import com.sap.grc.dpg.demo.entity.UserEntity;
import com.sap.grc.dpg.demo.entity.UserInfo;
import com.sap.grc.dpg.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

  @Autowired UserRepository userRepo;

  @Override
  public void register(UserInfo userInfo) {
    UserEntity userEntity= convertToUserEntity(userInfo);
    userRepo.save(userEntity);
  }
}
