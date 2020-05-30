package net.dhg.crm.entity;

import lombok.Data;

@Data
public class SysUser {

  private long userId;
  private String userPassword;
  private String userCode;
  private long userState;

}
