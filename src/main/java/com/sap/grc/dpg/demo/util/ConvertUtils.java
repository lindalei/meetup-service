package com.sap.grc.dpg.demo.util;

import com.sap.grc.dpg.demo.entity.UserEntity;
import com.sap.grc.dpg.demo.entity.UserInfo;

public class ConvertUtils {
  private ConvertUtils() {
  }

  public static UserEntity convertToUserEntity(UserInfo userInfo) {
    UserEntity entity = new UserEntity();

    entity.setWechat(userInfo.getWechat());
    entity.setCellphone(userInfo.getCellphone());
    return entity;
  }
}
