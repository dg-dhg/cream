package net.dhg.crm.entity;

import lombok.Data;

@Data
public class BaseDict {

  private long dictId;
  private String dictTypeCode;
  private String dictTypeName;
  private String dictItemName;
  private String dictItemCode;
  private long dictSort;
  private String dictEnable;
  private String dictComment;

}
