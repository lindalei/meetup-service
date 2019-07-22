package com.sap.grc.dpg.demo.controller;

import com.sap.grc.dpg.demo.entity.UserInfo;
import com.sap.grc.dpg.demo.service.RegisterService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "RegisterServiceController", tags = {"register service controller"})
@RestController
@RequestMapping("/RegisterService")
public class RegisterServiceController {

  private final Marker registerServiceControllerMarker =
      MarkerFactory.getMarker("DocumentConsumeServiceMarker");
  private static final Logger logger = LoggerFactory.getLogger(RegisterServiceController.class);

  @Autowired
  RegisterService registerService;

  @ApiOperation(value = "register", notes = "register new member.", response = void.class)
  @ApiResponses(value = {@ApiResponse(code = 200, message = "successfully register"),
      @ApiResponse(code = 500, message = "fail to register")})
  @RequestMapping(value = "/newMember", method = RequestMethod.POST)
  public void register(@RequestBody UserInfo userInfo) {
    registerService.register(userInfo);
  }
}
