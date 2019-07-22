package com.sap.grc.dpg.demo.entity;

import static com.sap.grc.dpg.demo.util.SampleConstants.IDGEN_STRATEGY;
import static com.sap.grc.dpg.demo.util.SampleConstants.IDGEN_UUID_GENERATOR;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = UserEntity.TBL_USER)
public class UserEntity {
  public static final String TBL_USER = "user";
  private static final String COL_USER_KEY = "user_key";
  private static final String COL_WECHAT = "wechat";
  private static final String COL_CELLPHONE = "cellphone";
  private static final String COL_GENDER = "gender";
  private static final String COL_UNIVERSITY = "university";
  private static final String COL_BIRTH = "birth";
  private static final String COL_REGION = "region";

  private static final String COL_HOMETOWN = "hometown";
  private static final String COL_HEIGHT = "height";
  private static final String COL_DEGREE = "degree";

  @Id
  @GeneratedValue(generator = IDGEN_UUID_GENERATOR)
  @GenericGenerator(name = IDGEN_UUID_GENERATOR, strategy = IDGEN_STRATEGY)
  @Column(name = COL_USER_KEY)
  private String userKey;

  @Column(name = COL_CELLPHONE)
  private Integer cellphone;

  @Column(name = COL_WECHAT)
  private String wechat;

  @Column(name = COL_GENDER, columnDefinition = "BIGINT")
  private Long gender;

  @Column(name = COL_BIRTH)
  private String birth;

  @Column(name = COL_REGION)
  private String region;

  @Column(name = COL_UNIVERSITY)
  private String university;

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public String getHometown() {
    return hometown;
  }

  @Column(name = COL_HEIGHT)
  private String height;

  @Column(name = COL_HOMETOWN)
  private String hometown;

  @Column(name = COL_DEGREE)
  private String degree;

  public String getUniversity() {
    return university;
  }

  public void setUniversity(String university) {
    this.university = university;
  }

  public String getUserKey() {
    return userKey;
  }

  public void setUserKey(String userKey) {
    this.userKey = userKey;
  }

  public Integer getCellphone() {
    return cellphone;
  }

  public void setCellphone(int cellphone) {
    this.cellphone = cellphone;
  }

  public Long getGender() {
    return gender;
  }

  public void setGender(Long gender) {
    this.gender = gender;
  }

  public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getWechat() {
    return wechat;
  }

  public void setWechat(String wechat) {
    this.wechat = wechat;
  }

  public void setHometown(String hometown) {
    this.hometown = hometown;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }
}
